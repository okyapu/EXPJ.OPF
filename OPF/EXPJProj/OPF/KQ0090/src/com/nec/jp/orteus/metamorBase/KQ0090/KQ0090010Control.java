/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0090/src/com/nec/jp/orteus/metamorBase/KQ0090/KQ0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0090;

import com.nec.jp.orteus.metamorBase.KQ0090.*;
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
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
import java.text.ParseException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KQ0090010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhang-yan $
 * @version $Revision: 1.3 $ $Date: 2014/06/25 04:43:22 $
 *
 */
//}}user_implement_code_header

public class KQ0090010Control
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
	//Add Anken Start 20140416 shang-j
	/** クリアボタンフラグ */
	private String _ClearFlg = "0";
	//Add Anken End   20140416 shang-j
	// デフォルトアクセサメソッド
	protected List list;											// 結果リストのインスタンス
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public KQ0090010Struct getListvalue(int x) { return (KQ0090010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KQ0090010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KQ0090010Struct createStruct() { return new KQ0090010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KQ0090010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
	//add nec 20140613 str
	// 受注承認
	private String _APR_ODR;
	////add nec 20140613 end 
		
	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/** システムオプション識別子 */
	private String _option_id = EXPLANNER_J;
	
	/** Explanner/J*/
	static final public String EXPLANNER_J = "J*";
	
	/** Explanner/Ja*/
	static final public String EXPLANNER_JA = "JA*";
	
	/** Explanner/Jf*/
	static final public String EXPLANNER_JF = "JF*";
	
	/** Explanner/JaSCM*/
	static final public String EXPLANNER_JASCM = "SCM*";
	
	/** ログインユーザの会社コード */
	private String _sysCompanyCd = new String();
	
	/** 非在庫品名の既定値 */
	private String _itemNameDefault = new String();
	
	/**
	 * Exceptionメッセージ設定
	 * @param キー項目
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
     * エラーメッセージ設定処理を切り出して関数化
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
	 */
	public void setAppErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
		
    /**
     * ワーニングメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     */
    private void setWarningMessage(String code) {
    	ExpjMessage emsg = new ExpjMessage(code);
    	msgStruct.addWarn(emsg);
    	sysLog.info(emsg, sysUSER_CD);
    }
    
    /**
     * 登録と更新の共通サーバチェック
     * @param optionId システムオプション識別子
     * @param struct KQ0090010Struct
     * @param custStruct 得意先情報
     * @return true：チェックエラーがない    false:チェックエラーがある
     * @throws FoundationException
     * @throws ExpjException
     */
    private boolean DBCheck(String optionId, KQ0090010Struct struct, KQ0090010Struct custStruct) throws FoundationException, ExpjException{
    	// KQ00341【指定した元受注番号は未登録です。】
    	try {
			// KQ20006 【営業担当者コードがユーザマスタに存在しません。】
			// Explanner/JaScmの場合
			if(EXPLANNER_JASCM.equals(_option_id)){
				if(struct.getCUST_CHRG_PSN_CD() != null && !"".equals(struct.getCUST_CHRG_PSN_CD())){
					List userList = entity.mcheckUSER_MST_SCM.read(conn, struct);
					if(userList.isEmpty()){
						struct.setUSER_NAME("");
						setErrorMessage("KQ20006");
						return false;
					}
					struct.setUSER_NAME(((KQ0090010Struct)userList.get(0)).getUSER_NAME());
				}
			}
			// Explanner/J、Explanner/Jf、Explanner/Jaの場合
			else{
				if(struct.getCUST_CHRG_PSN_CD() != null && !"".equals(struct.getCUST_CHRG_PSN_CD())){
					List userList = entity.mcheckUSER_MST_J.read(conn, struct);
					if(userList.isEmpty()){
						struct.setUSER_NAME("");
						setErrorMessage("KQ20006");
						return false;
					}
					struct.setUSER_NAME(((KQ0090010Struct)userList.get(0)).getUSER_NAME());
				}
			}
			
			// AA01001 【指定した消費税コードは未登録です。】
			if(!entity.mcheckM_TAX.check(conn, struct)){
				setErrorMessage("AA01001");
				return false;
			}
			
			// KQ00073 【通貨コードがマスタに存在しません。】
			List curList = entity.mselectM_CUR.read(conn, custStruct);
			if(curList == null || curList.isEmpty()){
				setErrorMessage("KQ00073");
				return false;
			}
			KQ0090010Struct curStruct = (KQ0090010Struct)curList.get(0);
			
			// KQ00347 【受注金額の小数桁数が正しくありません。】
			if (NumberTool.getRealScale(struct.getODR_AMOUNT()) > Integer.parseInt(curStruct.getw_DECIMAL_FIG())) {
				setErrorMessage("KQ00347");
				return false;
			}
		} catch (SQLException e) {
			setSqlExceptionMsg(e);
		}
		return true;
    }
    
    /**
     * 品目名セット
     * @param struct　KQ0090010Struct
     * @throws ExpjException
     * @throws FoundationException
     */
    private void setItemName(KQ0090010Struct struct) throws ExpjException, FoundationException{
    	try{
	    	// 品目名 = NULLの場合
			if(struct.getITEM_NAME() == null || "".equals(struct.getITEM_NAME())){
				// 品目番号 = NULLの場合
				if(struct.getITEM_CD() == null || "".equals(struct.getITEM_CD())){
					struct.setITEM_NAME(_itemNameDefault);
				}
				// 品目番号 <> NULLの場合
				else{
					List itemList = entity.mselectM_ITEM.read(conn, struct);
					// 品目が存在しないの場合 
					if(itemList.isEmpty()){
						struct.setITEM_NAME(_itemNameDefault);
					}
					// 品目が存在の場合
					else{
						String strItemName = ((KQ0090010Struct)itemList.get(0)).getITEM_NAME();
						// 品目名がNULLの場合
						if(strItemName == null || "".equals(strItemName)){
							struct.setITEM_NAME(_itemNameDefault);
						}
						else{
							struct.setITEM_NAME(strItemName);
						}
					}
				}
			}
    	} catch (SQLException e){
    		setSqlExceptionMsg(e);
    	}
    }
    
    /**
	 * 邦貨換算。
	 * @param amount 対象金額
	 * @param s ストラクトオブジェクト
	 * @return 邦貨金額
	 * @throws SQLException 処理失敗
	 * @throws ExpjException  処理失敗
	 */
	private String exchAmount(String amount, KQ0090010Struct s, String optionId)
		throws SQLException, ExpjException {

		ExchAmount exch = new ExchAmount(conn);
		boolean result =
				exch.doExchAmount(
					amount,
					_sysCompanyCd,
					s.getw_CURRNCY_CD(),
					s.getw_EXCH_TYP(),
					s.getw_DETAIL_ROUND_TYP(),
					struct.getDESINATED_DLV_DATE());

		if (!result) {
			throw new ExpjException("KQ00038");
		}

		double exchAmount = exch.getD_EXCH_AMOUNT();

		return String.valueOf(exchAmount);
	}
	
	//Add Anken Start 20140416 shang-j
	 /**
     * 画面の詳細項目を初期化します。
     */
    private void initializeDetail() {
     struct.setORGN_ODR_NO(null);
     struct.setCUST_ODR_NO(null);
     struct.setCUST_CD(null);
     struct.setCUST_ANAME(null);
     struct.setCUST_CHRG_PSN_CD(null);
     struct.setUSER_NAME(null);
     struct.setITEM_CD(null);
     struct.setITEM_NAME(null);
     struct.setDESINATED_DLV_DATE(null);
     struct.setODR_UNIT_PRICE("0");
     struct.setCUR_UNIT_PRICE(null);
     struct.setODR_QTY("0");
     struct.setSTOCK_UNIT(null);
     struct.setODR_AMOUNT("0");
     struct.setCUR_UNIT_AMOUNT(null);
     struct.setTAX_CD(null);
     struct.setREMARKS(null);
    }
	//Add Anken End   20140416 shang-j
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		List odrUnstockList = new ArrayList();
		KQ0090010Struct odrUnstockStruct = new KQ0090010Struct();
		try {
			// Explanner/JaScm場合
			if(EXPLANNER_JASCM.equals(_option_id)){
				odrUnstockList = entity.mselectT_ODR_UNSTOCK_SCM.read(conn, struct);
			}
			// Explanner/JaScm以外場合
			else{
				odrUnstockList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
			}
			if(odrUnstockList.isEmpty()){
				//Add Anken Start 20140416 shang-j
				if ( EXPLANNER_J.equals(_option_id) && isScreenMove() == true ){
					initializeDetail();
				}
				//Add Anken End   20140416 shang-j
				readStatus = NOT_FOUND;
				struct.setODR_ACPT_DATE(struct.geth_BUSINESS_OPR_DATE());
				setErrorMessage("ZZ01101");
				return;
			}
			//Add Anken Start 20140507 shang-j
			if(EXPLANNER_J.equals(_option_id)){
				List pjOdrAlcList = entity.mselectT_PJ_ODR_ALC.read(conn, struct);
				if(!pjOdrAlcList.isEmpty()){	
					struct.setODR_ACPT_DATE(struct.geth_BUSINESS_OPR_DATE());
					setErrorMessage("KQ00353");
					return;
				}
			}
			//Add Anken End   20140507 shang-j
			
			odrUnstockStruct = (KQ0090010Struct)odrUnstockList.get(0);
			// 更新数（非表示項目）
			struct.seth_MODIFY_COUNT(odrUnstockStruct.geth_MODIFY_COUNT());
			// 元受注番号
			struct.setORGN_ODR_NO(odrUnstockStruct.getORGN_ODR_NO());
			// 増額受注
			if(odrUnstockStruct.getw_ADD_ODR_FLG() == null){
				struct.setchkADD_ODR_FLG("false");
			}
			else{
				if("1".equals(odrUnstockStruct.getw_ADD_ODR_FLG())){
					struct.setchkADD_ODR_FLG("true");
				}
				else{
					struct.setchkADD_ODR_FLG("false");
				}
			}
			// 受注日
			struct.setODR_ACPT_DATE(odrUnstockStruct.getODR_ACPT_DATE());
			// 得意先注文番号
			struct.setCUST_ODR_NO(odrUnstockStruct.getCUST_ODR_NO());
			// 得意先コード
			struct.setCUST_CD(odrUnstockStruct.getCUST_CD());
			// 得意先名称
			struct.setCUST_ANAME(odrUnstockStruct.getCUST_ANAME());
			// 営業担当者コード
			struct.setCUST_CHRG_PSN_CD(odrUnstockStruct.getCUST_CHRG_PSN_CD());
			// 営業担当者名称
			struct.setUSER_NAME(odrUnstockStruct.getUSER_NAME());
			// 品目番号
			struct.setITEM_CD(odrUnstockStruct.getITEM_CD());
			// 品目名
			struct.setITEM_NAME(odrUnstockStruct.getITEM_NAME());
			// 指摘納期
			struct.setDESINATED_DLV_DATE(odrUnstockStruct.getDESINATED_DLV_DATE());
			// 単価
			struct.setODR_UNIT_PRICE(odrUnstockStruct.getODR_UNIT_PRICE());
			// 通貨単位
			struct.setCUR_UNIT_PRICE(odrUnstockStruct.getCUR_UNIT_PRICE());
			// 受注数量
			struct.setODR_QTY(odrUnstockStruct.getODR_QTY());
			// 単位
			struct.setSTOCK_UNIT(odrUnstockStruct.getSTOCK_UNIT());
			// 受注金額
			struct.setODR_AMOUNT(odrUnstockStruct.getODR_AMOUNT());
			// 通貨単位
			struct.setCUR_UNIT_AMOUNT(odrUnstockStruct.getCUR_UNIT_PRICE());
			// 消費税コード
			struct.setTAX_CD(odrUnstockStruct.getTAX_CD());
			// 備考
			struct.setREMARKS(odrUnstockStruct.getREMARKS());
			
			readStatus = NORMAL;
		} catch(SQLException e) {
			readStatus = ERROR;
			this.setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		List custList = new ArrayList();
		
		try {
			conn.beginTrans();
			
			//move 20140617 NEC str
			// 全レコードの登録処理
			boolean appSucessFlg = false;
			
			// (Explanner/Jの場合且つ承認のため、再取得)
			if(EXPLANNER_J.equals(_option_id)){
				try{
					// 自社コード”を取得する。
					_sysCompanyCd = SystemInformation.getSysMyCompanyCd();
					if(_sysCompanyCd == null || "".equals(_sysCompanyCd)){
						setErrorMessage("KQ00039");
						throw new ExpjException("KQ00039");
					}
				} catch (FoundationException e) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
			}
			//move 20140617 NEC end
			
			// KQ00014 【得意先コードがマスタに存在しません。】
			if(struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())){
				custList = entity.mselectM_CUST.read(conn, struct);
				if(custList.isEmpty()){
					struct.setCUST_ANAME("");
					setErrorMessage("KQ00014");
					return;
				}
				
				// 元受注番号のチェック
				if(struct.getORGN_ODR_NO() != null && !"".equals(struct.getORGN_ODR_NO())){
					// Explanner/Jの場合
		    		if(EXPLANNER_J.equals(_option_id)){
						if(!entity.mcheckT_ODR_J.check(conn, struct)){
							setErrorMessage("KQ00341");
							return;
						}
					}
					// Explanner/Jaの場合
		    		else if(EXPLANNER_JA.equals(_option_id)){
						if(!entity.mcheckT_ODR_JA.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
					// Explanner/Jfの場合
		    		else if(EXPLANNER_JF.equals(_option_id)){
						if(!entity.mcheckT_ODR_JF.check(conn, struct)){
							setErrorMessage("KQ00349");
							return;
						}
					}
					// Explanner/JaScmの場合
					else{
						if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
				}
			}
			// 得意先コードがNULLの場合、テーブル[受注管理]または[確定受注]から取得
			else{
				List custCdList = new ArrayList();
				
				// Explanner/Jの場合
	    		if(EXPLANNER_J.equals(_option_id)){
					if(!entity.mcheckT_ODR_J.check(conn, struct)){
						setErrorMessage("KQ00341");
						return;
					}
					custCdList = entity.mselectCUST_CD_J.read(conn, struct);
				}
				// Explanner/Jaの場合
	    		else if(EXPLANNER_JA.equals(_option_id)){
					if(!entity.mcheckT_ODR_JA.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_JA.read(conn, struct);
				}
				// Explanner/Jfの場合
	    		else if(EXPLANNER_JF.equals(_option_id)){
					if(!entity.mcheckT_ODR_JF.check(conn, struct)){
						setErrorMessage("KQ00349");
						return;
					}
					custCdList = entity.mselectCUST_CD_JF.read(conn, struct);
				}
				// Explanner/JaScmの場合
				else{
					if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_SCM.read(conn, struct);
				}
	    		KQ0090010Struct custCdStruct = (KQ0090010Struct)custCdList.get(0);
	    		custCdStruct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    		custList = entity.mselectM_CUST.read(conn, custCdStruct);
			}
			
			// 得意先情報の取得
			KQ0090010Struct custStruct = (KQ0090010Struct)custList.get(0);
			
			if(!DBCheck(_option_id, struct, custStruct)){
				return;
			}
			
			// KQ00345【得意先コードが未入力ため、元受注情報の得意先コードを設定しました。】
			if(struct.getCUST_CD() == null || "".equals(struct.getCUST_CD())){
				setWarningMessage("KQ00345");
				struct.setCUST_CD(custStruct.getCUST_CD());
				struct.setCUST_ANAME(custStruct.getCUST_ANAME());
			}
			//Add nec 20140613 str
			// 受注担当部門の取得
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    	List custCheckList = entity.mcheckM_CUST.read(conn, struct);
			
			if(EXPLANNER_J.equals(_option_id) && !custCheckList.isEmpty()){
				//受注担当部門と担当者の取得
				struct.setl_OWN_PERSON_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_PERSON_CD());
				struct.setl_OWN_ORG_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD());
			}
			
			// EJの場合 且つ パラメータ「受注承認」が1の時
			if (EXPLANNER_J.equals(_option_id) && "1".equals(struct.geth_APR_ODR())) {

				// 受注担当部門存在チェック				
				if(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD() == null || "".equals(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD())){
					setErrorMessage("KQ00335");
					return;
				}
				// 【受注承認依頼処理】を実行する
				ApprProc.execInsertProcess(conn, struct, this);
				appSucessFlg = true;
			}

			if (appSucessFlg) {
				/** 承認依頼成功メッセジーを出す*/
		    	setAppErrorMessage("AZ00042");
				conn.commit();
				// 画面クリア
				controlClear();
				
			//承認なしの場合、登録処理へ
			} else {
				
			//Add nec 20140613 end
				
			// [非在庫受注]へ追加する。
			// 品目名
			setItemName(struct);
			// 受注番号
			String strOdrNo = ((KQ0090010Struct)entity.mselectSEQ.read(conn, struct).get(0)).getw_SEQ();
			struct.setw_SEQ(strOdrNo);
			// 発行担当者コード
			struct.setSYS_USER_CD(sysUSER_CD);
			// 通貨コード
			struct.setw_CURRNCY_CD(custStruct.getw_CURRNCY_CD());
			// 為替種別
			struct.setw_EXCH_TYP(custStruct.getw_EXCH_TYP());
			// 受注金額(邦貨)
			struct.setw_ODR_AMOUNT_EXCH_RATES(exchAmount(struct.getODR_AMOUNT(), custStruct, _option_id));
			// 消費税適用区分
			struct.setw_TAX_APPLY_TYP(custStruct.getw_TAX_APPLY_TYP());
			// 消費税計算区分
			struct.setw_TAX_CALC_TYP(custStruct.getw_TAX_CALC_TYP());
			// 増額受注フラグ
			struct.setw_ADD_ODR_FLG("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0");
			
			struct.setsUser_ID(sysUSER_CD);       //Add 20140618 Nec 
				
			entity.minsertT_ODR_UNSTOCK.create(conn, struct);
			
			conn.commit();
			
			struct.setODR_NO(strOdrNo);
			// 再読込
			controlSelect();
			}
			
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
		List custList = new ArrayList();
		KQ0090010Struct custStruct = new KQ0090010Struct();
		
		try {
			conn.beginTrans();
			//move 20140617 NEC str
			// 全レコードの登録処理
			boolean appSucessFlg = false;

			// (Explanner/Jの場合且つ承認のため、再取得)
			if(EXPLANNER_J.equals(_option_id)){
				try{
					//自社コード”を取得する。
					_sysCompanyCd = SystemInformation.getSysMyCompanyCd();
					if(_sysCompanyCd == null || "".equals(_sysCompanyCd)){
						setErrorMessage("KQ00039");
						throw new ExpjException("KQ00039");
					}
				} catch (FoundationException e) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
				
			}
			
			//move 20140617 NEC end
			
			// KQ00014 【得意先コードがマスタに存在しません。】
			if(struct.getCUST_CD() != null && !"".equals(struct.getCUST_CD())){
				custList = entity.mselectM_CUST.read(conn, struct);
				if(custList.isEmpty()){
					struct.setCUST_ANAME("");
					setErrorMessage("KQ00014");
					return;
				}
				
				// 元受注番号のチェック
				if(struct.getORGN_ODR_NO() != null && !"".equals(struct.getORGN_ODR_NO())){
					// Explanner/Jの場合
		    		if(EXPLANNER_J.equals(_option_id)){
						if(!entity.mcheckT_ODR_J.check(conn, struct)){
							setErrorMessage("KQ00341");
							return;
						}
					}
					// Explanner/Jaの場合
		    		else if(EXPLANNER_JA.equals(_option_id)){
						if(!entity.mcheckT_ODR_JA.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
					// Explanner/Jfの場合
		    		else if(EXPLANNER_JF.equals(_option_id)){
						if(!entity.mcheckT_ODR_JF.check(conn, struct)){
							setErrorMessage("KQ00349");
							return;
						}
					}
					// Explanner/JaScmの場合
					else{
						if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
							setErrorMessage("KQ00348");
							return;
						}
					}
				}
			}
			else{
				List custCdList = new ArrayList();
				// Explanner/Jの場合
	    		if(EXPLANNER_J.equals(_option_id)){
					if(!entity.mcheckT_ODR_J.check(conn, struct)){
						setErrorMessage("KQ00341");
						return;
					}
					custCdList = entity.mselectCUST_CD_J.read(conn, struct);
				}
				// Explanner/Jaの場合
	    		else if(EXPLANNER_JA.equals(_option_id)){
					if(!entity.mcheckT_ODR_JA.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_JA.read(conn, struct);
				}
				// Explanner/Jfの場合
	    		else if(EXPLANNER_JF.equals(_option_id)){
					if(!entity.mcheckT_ODR_JF.check(conn, struct)){
						setErrorMessage("KQ00349");
						return;
					}
					custCdList = entity.mselectCUST_CD_JF.read(conn, struct);
				}
				// Explanner/JaScmの場合
				else{
					if(!entity.mcheckT_ODR_SCM.check(conn, struct)){
						setErrorMessage("KQ00348");
						return;
					}
					custCdList = entity.mselectCUST_CD_SCM.read(conn, struct);
				}
	    		KQ0090010Struct custCdStruct = (KQ0090010Struct)custCdList.get(0);
	    		custCdStruct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    		custList = entity.mselectM_CUST.read(conn, custCdStruct);
			}
			
			// 得意先情報の取得
			custStruct = (KQ0090010Struct)custList.get(0);
			if(!DBCheck(_option_id, struct, custStruct)){
				return;
			}
			
			// KQ00342【売上実績が存在するので更新できません。】
			if(EXPLANNER_JF.equals(_option_id)){
				if(entity.mcheckT_SALES_JF.check(conn, struct)){
					setErrorMessage("KQ00342");
					return;
				}
			}
			else{
				if(entity.mcheckT_SALES.check(conn, struct)){
					setErrorMessage("KQ00342");
					return;
				}
			}
			// Explanner/JaとExplanner/JaScmの場合
			if(EXPLANNER_JA.equals(_option_id) || EXPLANNER_JASCM.equals(_option_id)){
				if(entity.mcheckT_SALES_TEMP.check(conn, struct)){
					setErrorMessage("KQ00342");
					return;
				}
			}
			
			// 排他チェック
			List modifyList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
			if(modifyList == null || modifyList.isEmpty()){
				setErrorMessage("KQ00055");
				return;
			}
			if(!struct.geth_MODIFY_COUNT().equals(((KQ0090010Struct)modifyList.get(0)).geth_MODIFY_COUNT())){
				setErrorMessage("KQ00055");
				return;
			}
			
			// KQ00345【得意先コードが未入力ため、元受注情報の得意先コードを設定しました。】
			if(struct.getCUST_CD() == null || "".equals(struct.getCUST_CD())){
				setWarningMessage("KQ00345");
				struct.setCUST_CD(custStruct.getCUST_CD());
				struct.setCUST_ANAME(custStruct.getCUST_ANAME());
			}
			//Add nec 20140613 str
			// 受注担当部門の取得
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    	List custCheckList = entity.mcheckM_CUST.read(conn, struct);
			
			if(EXPLANNER_J.equals(_option_id) && !custCheckList.isEmpty()){
				//受注担当部門と担当者の取得
				struct.setl_OWN_PERSON_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_PERSON_CD());
				struct.setl_OWN_ORG_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD());
			}
			
			// EJの場合 且つ パラメータ「受注承認」が1の時
			if (EXPLANNER_J.equals(_option_id) && "1".equals(struct.geth_APR_ODR())) {

				// 受注担当部門存在チェック				
				if(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD() == null || "".equals(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD())){
					setErrorMessage("KQ00335");
					return;
				}
				
				// 【受注承認依頼処理】を実行する
				ApprProc.execUpdateProcess(conn, struct, this,"2");
				appSucessFlg = true;
			}

			if (appSucessFlg) {
				/** 承認依頼成功メッセジーを出す*/
		    	setAppErrorMessage("AZ00042");
				conn.commit();
				// 画面クリア
				controlClear();
				
			//承認なしの場合、登録処理へ
			} else {
			//Add nec 20140613 end
			
			// [非在庫受注]の更新
			// 品目名
			setItemName(struct);
			// 通貨コード
			struct.setw_CURRNCY_CD(custStruct.getw_CURRNCY_CD());
			// 為替種別
			struct.setw_EXCH_TYP(custStruct.getw_EXCH_TYP());
			// 消費税適用区分
			struct.setw_TAX_APPLY_TYP(custStruct.getw_TAX_APPLY_TYP());
			// 消費税計算区分
			struct.setw_TAX_CALC_TYP(custStruct.getw_TAX_CALC_TYP());
			// 受注金額(邦貨)
			struct.setw_ODR_AMOUNT_EXCH_RATES(exchAmount(struct.getODR_AMOUNT(), custStruct, _option_id));
			// 増額受注フラグ
			struct.setw_ADD_ODR_FLG("true".equals(struct.getchkADD_ODR_FLG()) ? "1" : "0");
			
			struct.setsUser_ID(sysUSER_CD);    //Add 20140618 Nec 
				
			entity.mupdateT_ODR_UNSTOCK.update(conn, struct);
				
			//コメント
			conn.commit();
			
			// 再読込
			controlSelect();
			}
			
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
		try {
			// 全レコードの登録処理
			boolean appSucessFlg = false;
			
			conn.beginTrans();
			
			// KQ00343【売上実績が存在するので削除できません。】
			if(EXPLANNER_JF.equals(_option_id)){
				if(entity.mcheckT_SALES_JF.check(conn, struct)){
					setErrorMessage("KQ00343");
					return;
				}
			}
			else{
				if(entity.mcheckT_SALES.check(conn, struct)){
					setErrorMessage("KQ00343");
					return;
				}
			}
			// Explanner/JaとExplanner/JaScmの場合
			if(EXPLANNER_JA.equals(_option_id) || EXPLANNER_JASCM.equals(_option_id)){
				if(entity.mcheckT_SALES_TEMP.check(conn, struct)){
					setErrorMessage("KQ00343");
					return;
				}
			}
			//Add nec 20140613 str
			// 受注担当部門の取得
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
	    	List custCheckList = entity.mcheckM_CUST.read(conn, struct);
			
			if(EXPLANNER_J.equals(_option_id) && !custCheckList.isEmpty()){
				//受注担当部門と担当者の取得
				struct.setl_OWN_PERSON_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_PERSON_CD());
				struct.setl_OWN_ORG_CD(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD());
			}
			
			// EJの場合 且つ パラメータ「受注承認」が1の時
			if (EXPLANNER_J.equals(_option_id) && "1".equals(struct.geth_APR_ODR())) {

				// 受注担当部門存在チェック				
				if(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD() == null || "".equals(((KQ0090010Struct)custCheckList.get(0)).getl_OWN_ORG_CD())){
					setErrorMessage("KQ00335");
					return;
				}
				
				// 【受注承認依頼処理】を実行する
				ApprProc.execUpdateProcess(conn, struct, this,"3");
				appSucessFlg = true;
			}

			if (appSucessFlg) {
				/** 承認依頼成功メッセジーを出す*/
		    	setAppErrorMessage("AZ00042");
				conn.commit();
				// 画面クリア
				controlClear();
				
			//承認なしの場合、登録処理へ
			} else {
			//Add nec 20140613 end
			
			// 排他チェック
			List modifyList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
			if(modifyList == null || modifyList.isEmpty()){
				setErrorMessage("KQ00055");
				return;
			}
			if(!struct.geth_MODIFY_COUNT().equals(((KQ0090010Struct)modifyList.get(0)).geth_MODIFY_COUNT())){
				setErrorMessage("KQ00055");
				return;
			}
			struct.setsUser_ID(sysUSER_CD);    //Add 20140618 Nec 
				
			entity.mdeleteT_ODR_UNSTOCK.update(conn, struct);
			
			//コメント
			conn.commit();
			
			// 再読込
			controlClear();
			}
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		} finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		//Add Anken Start 20140416 shang-j
		_ClearFlg = "1";
		//Add Anken End   20140416 shang-j
		struct.initialize();
		controlRELOAD();
		
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 元受注情報取得ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGetDefault() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlGetDefault");
			//{{user_implement_dev:<controlGetDefault>
		List defaultList = new ArrayList();
		try {
			// Explanner/Jの場合
    		if(EXPLANNER_J.equals(_option_id)){
    			defaultList = entity.mselectDEFAULT_J.read(conn, struct);
    			if(defaultList.isEmpty()){
    				setErrorMessage("KQ00341");
    				return;
    			}
			}
			// Explanner/Jaの場合
    		else if(EXPLANNER_JA.equals(_option_id)){
				defaultList = entity.mselectDEFAULT_JA.read(conn, struct);
				if(defaultList.isEmpty()){
					setErrorMessage("KQ00348");
					return;
				}
			}
			// Explanner/Jfの場合
    		else if(EXPLANNER_JF.equals(_option_id)){
				defaultList = entity.mselectDEFAULT_JF.read(conn, struct);
				if(defaultList.isEmpty()){
					setErrorMessage("KQ00349");
					return;
				}
			}
			// Explanner/JaScmの場合
    		else{
				defaultList = entity.mselectDEFAULT_SCM.read(conn, struct);
				if(defaultList.isEmpty()){
					setErrorMessage("KQ00348");
					return;
				}
			}
			
			KQ0090010Struct defaultStruct = (KQ0090010Struct)defaultList.get(0);
			
			// 検索結果を画面に設定
			// 受注日
			struct.setODR_ACPT_DATE(defaultStruct.getODR_ACPT_DATE());
			// 得意先注文番号
			struct.setCUST_ODR_NO(defaultStruct.getCUST_ODR_NO());
			// 得意先コード
			struct.setCUST_CD(defaultStruct.getCUST_CD());
			// 得意先名
			struct.setCUST_ANAME(defaultStruct.getCUST_ANAME());
			// 営業担当者コード
			struct.setCUST_CHRG_PSN_CD(defaultStruct.getCUST_CHRG_PSN_CD());
			// 営業担当者名
			struct.setUSER_NAME(defaultStruct.getUSER_NAME());
			// 指定納期
			struct.setDESINATED_DLV_DATE(defaultStruct.getDESINATED_DLV_DATE());
			// 受注数量
			struct.setODR_QTY(defaultStruct.getODR_QTY());
			// 消費税コード
			struct.setTAX_CD(defaultStruct.getTAX_CD());
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlGetDefault>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlGetDefault");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		struct.initialize();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			List optionIdList = new ArrayList();
			List resultList = new ArrayList();
			// 多言語項目取得対応
            String locale = CoreTools.getLocale(sysUSER_CD);
            String property = "OrteusUserDic";
            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
            
			// [インストールオプション]よりオプションの識別子を取得する。
            struct.setw_OPTION_ID(EXPLANNER_JASCM);
			optionIdList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
			if(!optionIdList.isEmpty()){
				_option_id = EXPLANNER_JASCM;
				struct.setw_OPTION_ID(_option_id);
				// 元受注管理番号
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
			}
			else{
				struct.setw_OPTION_ID(EXPLANNER_JF);
				optionIdList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
				if(!optionIdList.isEmpty()){
					_option_id = EXPLANNER_JF;
					struct.setw_OPTION_ID(_option_id);
					// 元受注伝票番号
					struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_2", resource));
				}
				else{
					struct.setw_OPTION_ID(EXPLANNER_JA);
					optionIdList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
					if(!optionIdList.isEmpty()){
						_option_id = EXPLANNER_JA;
						struct.setw_OPTION_ID(_option_id);
						// 元受注管理番号
						struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
					}
					else{
						_option_id = EXPLANNER_J;
						struct.setw_OPTION_ID(_option_id);
						// 元受注番号
						struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO", resource));
					}
				}
			}
			
			// 自社コード”を取得する。(Explanner/JaScm以外の場合)
			if(!EXPLANNER_JASCM.equals(_option_id)){
				try{
					_sysCompanyCd = SystemInformation.getSysMyCompanyCd();
					if(_sysCompanyCd == null || "".equals(_sysCompanyCd)){
						setErrorMessage("KQ00039");
						throw new ExpjException("KQ00039");
					}
				} catch (FoundationException e) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
			}
			// 「ログインユーザの所属会社コード」の取得を行う。(Explanner/JaScmの場合)
			else{
				struct.setsysPLANT_CD(sysPLANT_CD);
				_sysCompanyCd = ((KQ0090010Struct)entity.mselectM_PLANT.read(conn, struct).get(0)).getsysCOMPANY_CD();
			}
			struct.seth_SYS_COMPANY_CODE(_sysCompanyCd);
			
			// 日付計算用工場コードを取得する。
			if(EXPLANNER_J.equals(_option_id)){
				struct.setw_SYS_CLASS("SALES");
			}
			else if(EXPLANNER_JF.equals(_option_id)){
				struct.setw_SYS_CLASS("FD_SALES");
			}
			else{
				struct.setw_SYS_CLASS("MP_SALES");
			}
			List sysClassCodeList = entity.mselectSYS_CLASS_CODE.read(conn, struct);
			if(sysClassCodeList.isEmpty()){
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			// 業務運用日を取得する。
			String sysBusinessOprDate = DateCtrl.getBusinessOprDate(conn, ((KQ0090010Struct)sysClassCodeList.get(0)).getw_PLANT_CD());
			if(sysBusinessOprDate == null || "".equals(sysBusinessOprDate)){
				setErrorMessage("KQ00026");
				throw new ExpjException("KQ00026");
			}
			struct.seth_BUSINESS_OPR_DATE(sysBusinessOprDate);
			// 受注日
			struct.setODR_ACPT_DATE(sysBusinessOprDate);
			
			// 品目番号の既定値を取得する。
			struct.setNAME("UNSTOCK_ITEM_NAME");  ////Add nec 20140613
			List sysParameterList = entity.mselectSYS_PARAMETER.read(conn, struct);
			if(sysParameterList.isEmpty()){
				setErrorMessage("KQ00340");
				throw new ExpjException("KQ00340");
			}
			_itemNameDefault = ((KQ0090010Struct)sysParameterList.get(0)).getw_VALUE();
			if(_itemNameDefault == null || "".equals(_itemNameDefault)){
				setErrorMessage("KQ00340");
				throw new ExpjException("KQ00340");
			}
			// 品目名
			struct.setITEM_NAME("");
			readStatus = INITIAL;
			//Add Anken Start 20140416 shang-j
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if( EXPLANNER_J.equals(_option_id) && !"1".equals(_ClearFlg)){
				if (isScreenMove() == true) {
					// 検索のコントロールメソッドを呼び出します。
					controlSelect();
				}
			}
			_ClearFlg = "0";
			//Add Anken End   20140416 shang-j
			//Add nec 20140613 str 
			// 受注承認
			struct.setNAME("APR_ODR");
			resultList = entity.mselectSYS_PARAMETER.read(conn, struct);
			if (resultList.isEmpty()) {
		        // 多言語項目取得対応
				ExpjMessage message = new ExpjMessage("AZ00041", CoreTools.getRBString("Expj.Cmt6707",resource));
				ExpjException ee = new ExpjException(message);
				throw ee;
			} else {
				_APR_ODR = ((KQ0090010Struct)resultList.get(0)).getw_VALUE();
				//EXPLANNER_J 且つ 承認パラメータ=１ 場合 のみ、受注承認機能を行います
				if (EXPLANNER_J.equals(_option_id) && "1".equals(_APR_ODR) ) {
					struct.seth_APR_ODR(_APR_ODR);
				} else {
					_APR_ODR = "0";
					struct.seth_APR_ODR("0");
				}
				
			}
			//Add nec 20140613 end
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0090");
		logger.entering("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KQ0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("GetDefault") ) {
				controlGetDefault();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// レベル「元受注番号」の設定
			// 多言語項目取得対応
            String locale = CoreTools.getLocale(sysUSER_CD);
            String property = "OrteusUserDic";
            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
            
			if(EXPLANNER_JASCM.equals(_option_id) || EXPLANNER_JA.equals(_option_id)){
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_1", resource));
			}
			else if(EXPLANNER_JF.equals(_option_id)){
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO_2", resource));
			}
			else{
				struct.setlbORGN_ODR_NO(CoreTools.getRBString("Expj.ORGN_ODR_NO", resource));
			}
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KQ0090010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0090010-E999","CSVの出力処理"));
			throw new FoundationException("KQ0090010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0090010-E999","システム日付の取得処理"));
				throw new FoundationException("KQ0090010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0090010-E999","コントロールのイベント処理"));
			throw new FoundationException("KQ0090010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KQ0090010Entity entity;
	protected KQ0090010Struct struct;
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

		entity = new KQ0090010Entity();
		struct = new KQ0090010Struct();

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
	 * KQ0090010クラスの標準コンストラクタ
	 */
	public KQ0090010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: ここに初期処理を記述してください
		try {
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
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
				KQ0090010Struct key = (KQ0090010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("chkADD_ODR_FLG") && key.getchkADD_ODR_FLG() != null) {
					msgKey.setKeyValue("chkADD_ODR_FLG", key.getchkADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT") && key.getCUR_UNIT_AMOUNT() != null) {
					msgKey.setKeyValue("CUR_UNIT_AMOUNT", key.getCUR_UNIT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO") && key.getlbORGN_ODR_NO() != null) {
					msgKey.setKeyValue("lbORGN_ODR_NO", key.getlbORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ODR") && key.geth_APR_ODR() != null) {
					msgKey.setKeyValue("h_APR_ODR", key.geth_APR_ODR());
				}
				if(msgKeyType.containsKeyColumn("APPROVED_COMMENT") && key.getAPPROVED_COMMENT() != null) {
					msgKey.setKeyValue("APPROVED_COMMENT", key.getAPPROVED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_TYP") && key.geth_ODR_TYP() != null) {
					msgKey.setKeyValue("h_ODR_TYP", key.geth_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE") && key.getl_h_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_h_ESTIMATE_TYPE", key.getl_h_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OPTION_ID") && key.getw_OPTION_ID() != null) {
					msgKey.setKeyValue("w_OPTION_ID", key.getw_OPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("sysCOMPANY_CD") && key.getsysCOMPANY_CD() != null) {
					msgKey.setKeyValue("sysCOMPANY_CD", key.getsysCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("sysPLANT_CD") && key.getsysPLANT_CD() != null) {
					msgKey.setKeyValue("sysPLANT_CD", key.getsysPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SYS_CLASS") && key.getw_SYS_CLASS() != null) {
					msgKey.setKeyValue("w_SYS_CLASS", key.getw_SYS_CLASS());
				}
				if(msgKeyType.containsKeyColumn("w_VALUE") && key.getw_VALUE() != null) {
					msgKey.setKeyValue("w_VALUE", key.getw_VALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("ORGN_ODR_NO") && key.getORGN_ODR_NO() != null) {
					msgKey.setKeyValue("ORGN_ODR_NO", key.getORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("w_ADD_ODR_FLG") && key.getw_ADD_ODR_FLG() != null) {
					msgKey.setKeyValue("w_ADD_ODR_FLG", key.getw_ADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE") && key.getCUR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("CUR_UNIT_PRICE", key.getCUR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("w_SEQ") && key.getw_SEQ() != null) {
					msgKey.setKeyValue("w_SEQ", key.getw_SEQ());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_COMPANY_CODE") && key.geth_SYS_COMPANY_CODE() != null) {
					msgKey.setKeyValue("h_SYS_COMPANY_CODE", key.geth_SYS_COMPANY_CODE());
				}
				if(msgKeyType.containsKeyColumn("SYS_USER_CD") && key.getSYS_USER_CD() != null) {
					msgKey.setKeyValue("SYS_USER_CD", key.getSYS_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CURRNCY_CD") && key.getw_CURRNCY_CD() != null) {
					msgKey.setKeyValue("w_CURRNCY_CD", key.getw_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_EXCH_TYP") && key.getw_EXCH_TYP() != null) {
					msgKey.setKeyValue("w_EXCH_TYP", key.getw_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_AMOUNT_EXCH_RATES") && key.getw_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("w_ODR_AMOUNT_EXCH_RATES", key.getw_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_APPLY_TYP") && key.getw_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("w_TAX_APPLY_TYP", key.getw_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_TAX_CALC_TYP") && key.getw_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("w_TAX_CALC_TYP", key.getw_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_DETAIL_ROUND_TYP") && key.getw_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("w_DETAIL_ROUND_TYP", key.getw_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_USER_CD") && key.getw_USER_CD() != null) {
					msgKey.setKeyValue("w_USER_CD", key.getw_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("w_DECIMAL_FIG") && key.getw_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("w_DECIMAL_FIG", key.getw_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("haveFlag") && key.gethaveFlag() != null) {
					msgKey.setKeyValue("haveFlag", key.gethaveFlag());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CUST_CD") && key.getw_CUST_CD() != null) {
					msgKey.setKeyValue("w_CUST_CD", key.getw_CUST_CD());
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
					KQ0090010Struct key = new KQ0090010Struct();
					if(msgKeyType.containsKeyColumn("chkADD_ODR_FLG")) {
						key.setchkADD_ODR_FLG(msgKey.getKeyValue("chkADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_AMOUNT")) {
						key.setCUR_UNIT_AMOUNT(msgKey.getKeyValue("CUR_UNIT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("lbORGN_ODR_NO")) {
						key.setlbORGN_ODR_NO(msgKey.getKeyValue("lbORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ODR")) {
						key.seth_APR_ODR(msgKey.getKeyValue("h_APR_ODR"));
					}
					if(msgKeyType.containsKeyColumn("APPROVED_COMMENT")) {
						key.setAPPROVED_COMMENT(msgKey.getKeyValue("APPROVED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_TYP")) {
						key.seth_ODR_TYP(msgKey.getKeyValue("h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE")) {
						key.setl_h_ESTIMATE_TYPE(msgKey.getKeyValue("l_h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OPTION_ID")) {
						key.setw_OPTION_ID(msgKey.getKeyValue("w_OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("sysCOMPANY_CD")) {
						key.setsysCOMPANY_CD(msgKey.getKeyValue("sysCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("sysPLANT_CD")) {
						key.setsysPLANT_CD(msgKey.getKeyValue("sysPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SYS_CLASS")) {
						key.setw_SYS_CLASS(msgKey.getKeyValue("w_SYS_CLASS"));
					}
					if(msgKeyType.containsKeyColumn("w_VALUE")) {
						key.setw_VALUE(msgKey.getKeyValue("w_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_ODR_NO")) {
						key.setORGN_ODR_NO(msgKey.getKeyValue("ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_ADD_ODR_FLG")) {
						key.setw_ADD_ODR_FLG(msgKey.getKeyValue("w_ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT_PRICE")) {
						key.setCUR_UNIT_PRICE(msgKey.getKeyValue("CUR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_SEQ")) {
						key.setw_SEQ(msgKey.getKeyValue("w_SEQ"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_COMPANY_CODE")) {
						key.seth_SYS_COMPANY_CODE(msgKey.getKeyValue("h_SYS_COMPANY_CODE"));
					}
					if(msgKeyType.containsKeyColumn("SYS_USER_CD")) {
						key.setSYS_USER_CD(msgKey.getKeyValue("SYS_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CURRNCY_CD")) {
						key.setw_CURRNCY_CD(msgKey.getKeyValue("w_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_EXCH_TYP")) {
						key.setw_EXCH_TYP(msgKey.getKeyValue("w_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_AMOUNT_EXCH_RATES")) {
						key.setw_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("w_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_APPLY_TYP")) {
						key.setw_TAX_APPLY_TYP(msgKey.getKeyValue("w_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_TAX_CALC_TYP")) {
						key.setw_TAX_CALC_TYP(msgKey.getKeyValue("w_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_DETAIL_ROUND_TYP")) {
						key.setw_DETAIL_ROUND_TYP(msgKey.getKeyValue("w_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_USER_CD")) {
						key.setw_USER_CD(msgKey.getKeyValue("w_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_DECIMAL_FIG")) {
						key.setw_DECIMAL_FIG(msgKey.getKeyValue("w_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("haveFlag")) {
						key.sethaveFlag(msgKey.getKeyValue("haveFlag"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CUST_CD")) {
						key.setw_CUST_CD(msgKey.getKeyValue("w_CUST_CD"));
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
