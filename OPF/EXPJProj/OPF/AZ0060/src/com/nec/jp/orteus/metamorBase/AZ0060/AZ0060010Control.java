/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0060/src/com/nec/jp/orteus/metamorBase/AZ0060/AZ0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0060;

import com.nec.jp.orteus.metamorBase.AZ0060.*;
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
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstControlApprIF;
import com.nec.jp.orteus.expj.mstappr.MstItemControlApprIF;
import com.nec.jp.orteus.expj.mstappr.MstItemStructApprIF;
import com.nec.jp.orteus.expj.mstappr.MstStructApprIF;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AZ0060010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.22 $ $Date: 2017/01/09 09:02:20 $
 *
 */
//}}user_implement_code_header

public class AZ0060010Control
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
	private String changed = "●";
	protected List list;											// 結果リストのインスタンス
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AZ0060010Struct getListvalue(int x) { return (AZ0060010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AZ0060010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AZ0060010Struct createStruct() { return new AZ0060010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AZ0060010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	protected AZ0060010Common commonEntity;
	
	/** 承認依頼表検索結果格納用リスト　*/
	private List _resultlist = new ArrayList();
	
	/** 承認明細検索結果格納用リスト　*/
	private List _detailList = new ArrayList();

	/**
　　　　 *ユーザマスタ検索結果取得。
　　　　 * @return List ユーザマスタ検索結果
　　　　 */
	public List getResultList(){
		return _resultlist;
	}

	/**
	 * 所属マスタ検索結果取得。
　　　　 * @return List 所属マスタ検索結果
　　　　 */
	public List getDetailList() {
		return _detailList;
	}

	/** 処理区分*/
	private ComboStruct _PROC_TYP = new ComboStruct();
	
	/** 承認状態　*/
	private ComboStruct _APPR_STATUS_TYP = new ComboStruct();

	/** 多言語 */
	private ComboStruct _LOCALE = new ComboStruct();
	
	/** 承認権限 */
	private ComboStruct _APPR_POWER_TYP = new ComboStruct();
	
	/** 単価区分 */
	private ComboStruct _CONS_UNIT_COST = new ComboStruct();
	
	/** 特値区分 */
	private ComboStruct _SPCL_PRICE_TYPE = new ComboStruct();
	
	/** 有償フラグ */
	private ComboStruct _ONEROUS_FLG = new ComboStruct();
	
	/** 発注金額まるめ*/
	private ComboStruct _ROUND_TYP = new ComboStruct();

	/** 消費税適用区分 (取引先メンテナンス)*/
	private ComboStruct _TAX_APPLY_TYP = new ComboStruct();

	/** 消費税適用区分 (得意先メンテナンス)*/
	private ComboStruct _TAX_APPLY_TYP_SAAR = new ComboStruct();

	/** 消費税計算区分 (取引先メンテナンス)*/
	private ComboStruct _TAX_CALC_TYP = new ComboStruct();
	
	/** 消費税計算区分(得意先メンテナンス)*/
	private ComboStruct _TAX_CALC_TYP_SAAR = new ComboStruct();

	/** 為替種別 */
	private ComboStruct _EXCH_TYP = new ComboStruct();

	/** 輸入取引区分 */
	private ComboStruct _IMPORT_TRN_TYP = new ComboStruct();
	
	/** 検収計上区分 */
	private ComboStruct _INSPC_ACPT_APP_TYP = new ComboStruct();
	
	/** EDI取引区分（請求） */
    private ComboStruct _EDI_TRN_BILL_TYP = new ComboStruct();
   
    /** EDI取引区分（入金） */
    private ComboStruct _EDI_TRN_RM_TYP = new ComboStruct();
   
    /** 請求残高管理フラグ */
    private ComboStruct _BILL_BALANCE_CTRL_FLG = new ComboStruct();
   
    /** 売掛金残高管理フラグ */
    private ComboStruct _AR_BALANCE_CTRL_FLG = new ComboStruct();
	
    /** 検収区分 */
    private ComboStruct _INSPC_ACPT_TYP = new ComboStruct();

    /** 分納出荷指示F */
    private ComboStruct _PARTIAL_SHIP_INST_FLG = new ComboStruct();
    
    /** 明細計算まるめ区分 */
    private ComboStruct _DETAIL_ROUND_TYP = new ComboStruct();
    /** 利用者区分*/
    private ComboStruct _USER_TYP = new ComboStruct();
    /** ＦＢデータ区分*/
    private ComboStruct _FB_DATA_TYP = new ComboStruct();
    /** 補助区分コード*/
    private ComboStruct _SUB_ACCT_CD = new ComboStruct();
    /** 原始区分*/
    private ComboStruct _PRIMITIVE_TYP = new ComboStruct();
    /** 貸借区分 */
	private ComboStruct _DR_CR_TYP = new ComboStruct();
	/** 科目区分 */
	private ComboStruct _ACCT_TYP = new ComboStruct();
	/** 補助科目規定値 */
	private ComboStruct _SUB_ACCT_TYP_DEFAULT = new ComboStruct();
	/** 内部取引区分 */
	private ComboStruct _INTERNAL_TRN_TYP = new ComboStruct();
	/** 振込先区分*/
	private ComboStruct _TRF_TYP = new ComboStruct();
	/** 振込内容区分*/
	private ComboStruct _CONTENTS_TYP = new ComboStruct();
	/** 振込情報区分*/
	private ComboStruct _INFO_TYP = new ComboStruct();
	/** 支払対象*/
	private ComboStruct _PAY_TARGET_TYP = new ComboStruct();
	/** 借方部門設定区分*/
	private ComboStruct _DR_ORG_TYP = new ComboStruct();
	/** 貸方部門設定区分*/
	private ComboStruct _CR_ORG_TYP = new ComboStruct();
	/** 入金相殺区分*/
	private ComboStruct _RM_OFFSET_TYP = new ComboStruct();
	/** 用途別単価区分 */
	private ComboStruct _PURPOSE_UNIT_PRICE_TYP = new ComboStruct();
	/** 出荷管理先区分 */
	private ComboStruct _SHIP_CTL_TYP = new ComboStruct();
	/** 納品書発行フラグ*/
	private ComboStruct _DLV_SLIP_ISS_FLG = new ComboStruct();
	/** 現品エフ発行区分*/
	private ComboStruct _IDENT_CARD_F_ISS_TYP = new ComboStruct();
	/** 現品エフフォーマット区分*/
	private ComboStruct _IDENT_CARD_F_FORMAT_TYP = new ComboStruct();
	/** 量産区分*/
	private ComboStruct _MASS_PRODUCT_TYP = new ComboStruct();
	/** 確定置換パターン*/
	private ComboStruct _DECISION_REPLACE_PTN = new ComboStruct();
	/** 出荷実績適用区分*/
	private ComboStruct _SHIP_RSLT_APPLY_TYP = new ComboStruct();
	/** 集結先出荷実績適用区分*/
	private ComboStruct _CNCNTRT_SHIP_RSLT_APPLY_TYP = new ComboStruct();
	/** 次便ずらし有無フラグ*/
	private ComboStruct _NEXT_DLV_SHIFT_EFF_FLG = new ComboStruct();
	/** 内示計画均等割りフラグ*/
	private ComboStruct _UNCNFM_PLAN_AVG_FLG = new ComboStruct();
	/** 出庫区分*/
	private ComboStruct _ISSUE_TYP = new ComboStruct();
	/** 内外作区分*/
	private ComboStruct _OUTSIDE_TYP = new ComboStruct();
	/** 荷姿管理フラグ*/
	private ComboStruct _STOCK_UNIT_FLG = new ComboStruct();
	/** 在庫数単位区分*/
	private ComboStruct _UNIT_QTY_TYP = new ComboStruct();
	/** 品目手配区分*/
	private ComboStruct _MRP_ODR_TYP = new ComboStruct();
	/** ロットまとめ区分*/
	private ComboStruct _LOT_SIZING_TYP = new ComboStruct();
	/** 工数管理品目区分*/
	private ComboStruct _MANHOUR_TYP = new ComboStruct();
	/** MPS品目フラグ*/
	private ComboStruct _MPS_FLG = new ComboStruct();
	/** 受入検査区分*/
	private ComboStruct _ACPT_INSPC_TYP = new ComboStruct();
	/** 製品区分*/
	private ComboStruct _PRODUCT_TYP = new ComboStruct();
	/** 棚卸区分*/
	private ComboStruct _ABC_TYP = new ComboStruct();
	/** 作業実績区分*/
	private ComboStruct _OPR_RSLT_TYP = new ComboStruct();
	/** 受給品区分*/
	private ComboStruct _SPL_ITEM_TYP = new ComboStruct();
	/** 計量単位*/
	private ComboStruct _STOCK_UNIT = new ComboStruct();
	/** 保管区分*/
	private ComboStruct _DEPO_TYP = new ComboStruct();
	/** 保管区分*/
	private ComboStruct _DEPO_TYP_JF = new ComboStruct();
	/** ロット管理フラグ*/
	private ComboStruct _LOT_CTRL_FLG = new ComboStruct();
	/** ロット採番区分*/
	private ComboStruct _LOT_NUMBERING_TYP = new ComboStruct();
	/** 得意先フラグ*/
	private ComboStruct _CUST_FLG = new ComboStruct();
	/** 納入先フラグ*/
	private ComboStruct _DELIVERY_FLG = new ComboStruct();
	/** 帳合先フラグ*/
	private ComboStruct _BALA_ACCO_FLG = new ComboStruct();
	/** 単価取得区分*/
	private ComboStruct _UNIT_COST_USE_TYP = new ComboStruct();
	/** 請求先フラグ*/
	private ComboStruct _BILL_ADDRESSEE_FLG = new ComboStruct();
	/** 入金先フラグ*/
	private ComboStruct _RM_FLG = new ComboStruct();
	/** 請求サイクル*/
	private ComboStruct _CLAIM_CYCLE_TYP = new ComboStruct();
	/** 仮単価売上計上フラグ*/
	private ComboStruct _INSPC_ACPT_FLG = new ComboStruct();
	/** 入金入力区分*/
	private ComboStruct _RM_INP_TYP = new ComboStruct();
	/** 取引停止フラグ*/
	private ComboStruct _TRN_STOP_FLG = new ComboStruct();
	/** 在庫状態タイプ*/
	private ComboStruct _STOCK_TYP = new ComboStruct();
	/** 出荷区分*/
	private ComboStruct _SHIP_TYP_3 = new ComboStruct();
	
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
    
    private String getLocaleTypeName(String locale){
    	// コンボボックス用データ取得
    	String localeTypeName = "";
		StringTokenizer std;
		int size = 0;
		int losize = 0;
		String loca = null;
		String[]  lolist = null;
		if (locale != null){
			while(losize < _LOCALE.size()){
				lolist = _LOCALE.getData(losize);
				while( size<lolist.length){
					if(!lolist[size].equals("")){
						std = new StringTokenizer(lolist[size],":");
						loca = std.nextToken();
						if(locale.equals(loca)){
							localeTypeName = lolist[size];
						}
					}
					size++;
				}
				size = 0;
				losize++;
			}
		}
		return localeTypeName;
    }
    //-----------------------------------------------------------------------
    private String screen_url = "AZ0060010Servlet";
    
    /**
	 * @return Returns the screen_url.
	 */
	public String getScreen_url() {
		return screen_url;
	}
	/**
	 * @param screen_url The screen_url to set.
	 */
	public void setScreen_url(String screen_url) {
		this.screen_url = screen_url;
	}
	
	private String table_name = "";
	
	/**
	 * @return Returns the table_name.
	 */
	public String getTable_name() {
		return table_name;
	}
	/**
	 * @param table_name The table_name to set.
	 */
	public void setTable_name(String table_name) {
		this.table_name = table_name;
	}
	//------------------------------------------------------------------------
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
	//------------------------------------------------------------------------
	private String proc_Typ = null;
	
	/**
	 * @return Returns the proc_Typ.
	 */
	public String getProc_Typ() {
		return proc_Typ;
	}
	/**
	 * @param proc_Typ The proc_Typ to set.
	 */
	public void setProc_Typ(String proc_Typ) {
		this.proc_Typ = proc_Typ;
	}
	// 依頼者承認者同一許可
	private String _REQUEST_APPR_SAME = null;
	
	public String get_REQUEST_APPR_SAME() {
		return _REQUEST_APPR_SAME;
	}
	public void set_REQUEST_APPR_SAME(String _request_appr_same) {
		_REQUEST_APPR_SAME = _request_appr_same;
	}
	// パラメータ「マスタ承認履歴」
	private String _HISTORY_FOR_APPR = null;
	// 業務日付
	private String BUSINESSOPRDATE;
	//------------------------------------------------------------------------
	
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
     * 警告メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setWarnMessage(String messageno, String message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addWarn( emsg );
     sysLog.info(emsg, getsysUSER_CD());
    }
   
    /**
     * マスタキーを取得
     *
     */
    private void getkey(){
    	keyvalueMap.put(struct.geth_KEY1(),struct.geth_VALUE1());
    	keyvalueMap.put(struct.geth_KEY2(),struct.geth_VALUE2());
    	keyvalueMap.put(struct.geth_KEY3(),struct.geth_VALUE3());
    	keyvalueMap.put(struct.geth_KEY4(),struct.geth_VALUE4());
    	keyvalueMap.put(struct.geth_KEY5(),struct.geth_VALUE5());
    	keyvalueMap.put(struct.geth_KEY6(),struct.geth_VALUE6());
    	keyvalueMap.put(struct.geth_KEY7(),struct.geth_VALUE7());
    }
    /**
     * 利用者明細
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0090030(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
			oldStruct.setUSER_CD(keyvalueMap.get("USER_CD").toString());                            // ユーザコードを設定
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectUSER_MST.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_USER_CD((oldStruct.getd_OLD_USER_CD()==null?"":oldStruct.getd_OLD_USER_CD()));
			struct.setd_OLD_USER_NAME(oldStruct.getd_OLD_USER_NAME()==null?"":oldStruct.getd_OLD_USER_NAME());
			struct.setd_OLD_PLANT_CD(oldStruct.getd_OLD_PLANT_CD()==null?"":oldStruct.getd_OLD_PLANT_CD());
			struct.setd_OLD_SECTION_CD(oldStruct.getd_OLD_SECTION_CD()==null?"":oldStruct.getd_OLD_SECTION_CD());
			struct.setd_OLD_PASSWORD(oldStruct.getd_OLD_PASSWORD()==null?"":oldStruct.getd_OLD_PASSWORD());
			struct.setd_OLD_APPR_POWER_TYP(oldStruct.getd_OLD_APPR_POWER_TYP()==null?"":oldStruct.getd_OLD_APPR_POWER_TYP());
			struct.setd_OLD_ADDRESS(oldStruct.getd_OLD_ADDRESS()==null?"":oldStruct.getd_OLD_ADDRESS());
			struct.setd_OLD_LOCALE(oldStruct.getd_OLD_LOCALE()==null?"":oldStruct.getd_OLD_LOCALE());
		}else{
			struct.setd_OLD_USER_CD("");
			struct.setd_OLD_USER_NAME("");
			struct.setd_OLD_PLANT_CD("");
			struct.setd_OLD_SECTION_CD("");
			struct.setd_OLD_PASSWORD("");
			struct.setd_OLD_APPR_POWER_TYP("");
			struct.setd_OLD_ADDRESS("");
			struct.setd_OLD_LOCALE("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// ユーザ番号
			columnID = mstappr.getColumnID( "USER_MST", "USER_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_USER_CD(columnValue == null?"":columnValue);
			// ユーザ名称
			columnID = mstappr.getColumnID( "USER_MST","USER_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_USER_NAME(columnValue == null?"":columnValue);
			// 工場コード
			columnID = mstappr.getColumnID( "USER_MST", "PLANT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PLANT_CD(columnValue == null?"":columnValue);
			// 部門コード
			columnID = mstappr.getColumnID( "USER_MST", "SECTION_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SECTION_CD(columnValue == null?"":columnValue);
			// パスワード
			columnID = mstappr.getColumnID( "USER_MST", "PASSWORD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PASSWORD(columnValue == null?"":columnValue);
			// メールアドレス
			columnID = mstappr.getColumnID( "USER_MST", "ADDRESS");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS(columnValue == null?"":columnValue);
			// 承認権限
			columnID = mstappr.getColumnID( "USER_MST","APPR_POWER_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_APPR_POWER_TYP(columnValue == null?"":columnValue);
			// 多言語
			columnID = mstappr.getColumnID( "USER_MST", "LOCALE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LOCALE(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_USER_CD("");
			struct.setd_NEW_USER_NAME("");
			struct.setd_NEW_PLANT_CD("");
			struct.setd_NEW_SECTION_CD("");
			struct.setd_NEW_PASSWORD("");
			struct.setd_NEW_APPR_POWER_TYP("");
			struct.setd_NEW_ADDRESS("");
			struct.setd_NEW_LOCALE("");
		}
		// 承認権限を設定
		struct.setd_OLD_APPR_POWER_TYP(getTypeName(_APPR_POWER_TYP,struct.getd_OLD_APPR_POWER_TYP()));
		struct.setd_NEW_APPR_POWER_TYP(getTypeName(_APPR_POWER_TYP,struct.getd_NEW_APPR_POWER_TYP()));
		// 多言語を設定
		struct.setd_OLD_LOCALE(getLocaleTypeName(struct.getd_OLD_LOCALE()));
		struct.setd_NEW_LOCALE(getLocaleTypeName(struct.getd_NEW_LOCALE()));
		
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_USER_CD().equals(struct.getd_NEW_USER_CD())){
				struct.setd_USER_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_USER_NAME().equals(struct.getd_NEW_USER_NAME())){
				struct.setd_USER_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_PLANT_CD().equals(struct.getd_NEW_PLANT_CD())){
				struct.setd_PLANT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_SECTION_CD().equals(struct.getd_NEW_SECTION_CD())){
				struct.setd_SECTION_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PASSWORD().equals(struct.getd_NEW_PASSWORD())){
				struct.setd_PASSWORD_CHANGE(changed);
			}
			if(!struct.getd_OLD_APPR_POWER_TYP().equals(struct.getd_NEW_APPR_POWER_TYP())){
				struct.setd_APPR_POWER_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS().equals(struct.getd_NEW_ADDRESS())){
				struct.setd_ADDRESS_CHANGE(changed);
			}
			if(!struct.getd_OLD_LOCALE().equals(struct.getd_NEW_LOCALE())){
				struct.setd_LOCALE_CHANGE(changed);
			}
		}
    }
    /**
     * 製品単価明細
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA0040010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());                      // 得意先コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());                      // 品目番号
    		oldStruct.setEFF_PHASE_IN_DATE(keyvalueMap.get("EFF_PHASE_IN_DATE").toString());  // 製品単価有効開始日
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_UNIT_COST.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD(oldStruct.getd_OLD_ITEM_CD()== null?"":oldStruct.getd_OLD_ITEM_CD());
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()== null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_EFF_PHASE_IN_DATE(oldStruct.getd_OLD_EFF_PHASE_IN_DATE() == null?"":oldStruct.getd_OLD_EFF_PHASE_IN_DATE());
			struct.setd_OLD_UNIT_COST_TYP(oldStruct.getd_OLD_UNIT_COST_TYP()== null?"":oldStruct.getd_OLD_UNIT_COST_TYP());
			struct.setd_OLD_UNIT_COST(oldStruct.getd_OLD_UNIT_COST()== null?"":oldStruct.getd_OLD_UNIT_COST());
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_EFF_PHASE_IN_DATE("");
			struct.setd_OLD_UNIT_COST_TYP("");
			struct.setd_OLD_UNIT_COST("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_UNIT_COST", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			// 得意先コード
			columnID = mstappr.getColumnID( "M_UNIT_COST","CUST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_CD(columnValue == null?"":columnValue);
			// 製品単価有効開始日
			columnID = mstappr.getColumnID( "M_UNIT_COST", "EFF_PHASE_IN_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EFF_PHASE_IN_DATE(columnValue == null?"":columnValue);
			// 単価区分
			columnID = mstappr.getColumnID( "M_UNIT_COST", "UNIT_COST_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST_TYP(columnValue == null?"":columnValue);
			// 製品単価
			columnID = mstappr.getColumnID( "M_UNIT_COST", "UNIT_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_EFF_PHASE_IN_DATE("");
			struct.setd_NEW_UNIT_COST_TYP("");
			struct.setd_NEW_UNIT_COST("0");
		}
		// 単価区分
		struct.setd_OLD_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_OLD_UNIT_COST_TYP()));
		struct.setd_NEW_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_NEW_UNIT_COST_TYP()));
		
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_PHASE_IN_DATE().equals(struct.getd_NEW_EFF_PHASE_IN_DATE())){
				struct.setd_EFF_PHASE_IN_DATE_CHANGE(changed);
			}
			if(!struct.getd_OLD_UNIT_COST_TYP().equals(struct.getd_NEW_UNIT_COST_TYP())){
				struct.setd_UNIT_COST_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_UNIT_COST(),struct.getd_NEW_UNIT_COST())!=0){
				struct.setd_UNIT_COST_CHANGE(changed);
			}
		}
    }
    /**
     * 支給単価明細
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0040030(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());                      // 取引先コード
    		oldStruct.setPLANT_CD(keyvalueMap.get("PLANT_CD").toString());                    // 工場コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());                      // 品目番号
    		oldStruct.setEFF_PHASE_IN_DATE(keyvalueMap.get("EFF_PHASE_IN_DATE").toString());  // 支給単価有効開始日
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CONS_UNIT_COST.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD(oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD());
			struct.setd_OLD_VEND_CD(oldStruct.getd_OLD_VEND_CD()== null?"":oldStruct.getd_OLD_VEND_CD());
			struct.setd_OLD_EFF_PHASE_IN_DATE(oldStruct.getd_OLD_EFF_PHASE_IN_DATE()==null?"":oldStruct.getd_OLD_EFF_PHASE_IN_DATE());
			struct.setd_OLD_UNIT_COST_TYP(oldStruct.getd_OLD_UNIT_COST_TYP()==null?"":oldStruct.getd_OLD_UNIT_COST_TYP());
			struct.setd_OLD_UNIT_COST(oldStruct.getd_OLD_UNIT_COST()== null?"":oldStruct.getd_OLD_UNIT_COST());
			struct.setd_OLD_ONEROUS_FLG(oldStruct.getd_OLD_ONEROUS_FLG()== null?"":oldStruct.getd_OLD_ONEROUS_FLG());
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_EFF_PHASE_IN_DATE("");
			struct.setd_OLD_UNIT_COST_TYP("");
			struct.setd_OLD_UNIT_COST("0");
			struct.setd_OLD_ONEROUS_FLG("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_CONS_UNIT_COST", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			// 取引先コード
			columnID = mstappr.getColumnID( "M_CONS_UNIT_COST","VEND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_CD(columnValue == null?"":columnValue);
			// 製品単価有効開始日
			columnID = mstappr.getColumnID( "M_CONS_UNIT_COST", "EFF_PHASE_IN_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EFF_PHASE_IN_DATE(columnValue == null?"":columnValue);
			// 単価区分
			columnID = mstappr.getColumnID( "M_CONS_UNIT_COST", "UNIT_COST_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST_TYP(columnValue == null?"":columnValue);
			// 単価
			columnID = mstappr.getColumnID( "M_CONS_UNIT_COST", "UNIT_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST(columnValue == null?"":columnValue);
			// 有償フラグ
			columnID = mstappr.getColumnID( "M_CONS_UNIT_COST", "ONEROUS_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ONEROUS_FLG(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_EFF_PHASE_IN_DATE("");
			struct.setd_NEW_UNIT_COST_TYP("");
			struct.setd_NEW_UNIT_COST("0");
			struct.setd_NEW_ONEROUS_FLG("");
		}
		// 単価区分
		struct.setd_OLD_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_OLD_UNIT_COST_TYP()));
		struct.setd_NEW_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_NEW_UNIT_COST_TYP()));
		// 有償フラグ
		struct.setd_OLD_ONEROUS_FLG(getTypeName(_ONEROUS_FLG,struct.getd_OLD_ONEROUS_FLG()));
		struct.setd_NEW_ONEROUS_FLG(getTypeName(_ONEROUS_FLG,struct.getd_NEW_ONEROUS_FLG()));
		// 更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_PHASE_IN_DATE().equals(struct.getd_NEW_EFF_PHASE_IN_DATE())){
				struct.setd_EFF_PHASE_IN_DATE_CHANGE(changed);
			}
			if(!struct.getd_OLD_UNIT_COST_TYP().equals(struct.getd_NEW_UNIT_COST_TYP())){
				struct.setd_UNIT_COST_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_UNIT_COST(),struct.getd_NEW_UNIT_COST())!=0){
				struct.setd_UNIT_COST_CHANGE(changed);
			}
			if(!struct.getd_OLD_ONEROUS_FLG().equals(struct.getd_NEW_ONEROUS_FLG())){
				struct.setd_ONEROUS_FLG_CHANGE(changed);
			}
		}
    }
    
    /**
     * 外注単価ヘッダ
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0040020H(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());                      // 取引先コード
    		oldStruct.setPLANT_CD(keyvalueMap.get("PLANT_CD").toString());                    // 工場コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());                      // 品目番号
    		oldStruct.setPROC_CD(keyvalueMap.get("PROC_CD").toString());                      // 品目別作業コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_SBCNT_UNIT_COST_H.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD(oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD());
			struct.setd_OLD_PROC_CD(oldStruct.getd_OLD_PROC_CD()== null?"":oldStruct.getd_OLD_PROC_CD());
			struct.setd_OLD_VEND_CD(oldStruct.getd_OLD_VEND_CD()== null?"":oldStruct.getd_OLD_VEND_CD());
			struct.setd_OLD_VEND_ITEM_CD(oldStruct.getd_OLD_VEND_ITEM_CD()== null?"":oldStruct.getd_OLD_VEND_ITEM_CD());
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_PROC_CD("");
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_VEND_ITEM_CD("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST_H", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			// 品目別作業コード
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST_H", "PROC_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROC_CD(columnValue == null?"":columnValue);
			// 取引先コード
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST_H","VEND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_CD(columnValue == null?"":columnValue);
			// 取引先品目番号
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST_H","VEND_ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_ITEM_CD(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_PROC_CD("");
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_VEND_ITEM_CD("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PROC_CD().equals(struct.getd_NEW_PROC_CD())){
				struct.setd_PROC_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_ITEM_CD().equals(struct.getd_NEW_VEND_ITEM_CD())){
				struct.setd_VEND_ITEM_CD_CHANGE(changed);
			}
		}
    }
    
    /**
     * 外注単価明細
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0040020(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());                      // 取引先コード
    		oldStruct.setPLANT_CD(keyvalueMap.get("PLANT_CD").toString());                    // 工場コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());                      // 品目番号
    		oldStruct.setPROC_CD(keyvalueMap.get("PROC_CD").toString());                      // 品目別作業コード
    		oldStruct.setEFF_PHASE_IN_DATE(keyvalueMap.get("EFF_PHASE_IN_DATE").toString());  // 製品単価有効開始日
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_SBCNT_UNIT_COST.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD(oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD());
			struct.setd_OLD_PROC_CD(oldStruct.getd_OLD_PROC_CD()== null?"":oldStruct.getd_OLD_PROC_CD());
			struct.setd_OLD_VEND_CD(oldStruct.getd_OLD_VEND_CD()== null?"":oldStruct.getd_OLD_VEND_CD());
			struct.setd_OLD_EFF_PHASE_IN_DATE(oldStruct.getd_OLD_EFF_PHASE_IN_DATE()==null?"":oldStruct.getd_OLD_EFF_PHASE_IN_DATE());
			struct.setd_OLD_UNIT_COST_TYP(oldStruct.getd_OLD_UNIT_COST_TYP()==null?"":oldStruct.getd_OLD_UNIT_COST_TYP());
			struct.setd_OLD_UNIT_COST(oldStruct.getd_OLD_UNIT_COST()== null?"":oldStruct.getd_OLD_UNIT_COST());
			struct.setd_OLD_PROCESSING_COST(oldStruct.getd_OLD_PROCESSING_COST()== null?"":oldStruct.getd_OLD_PROCESSING_COST());
			struct.setd_OLD_MATERIAL_COST(oldStruct.getd_OLD_MATERIAL_COST() == null?"":oldStruct.getd_OLD_MATERIAL_COST());
			struct.setd_OLD_OTHER_OVERHEADS(oldStruct.getd_OLD_OTHER_OVERHEADS() == null?"":oldStruct.getd_OLD_OTHER_OVERHEADS());
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_PROC_CD("");
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_EFF_PHASE_IN_DATE("");
			struct.setd_OLD_UNIT_COST_TYP("");
			struct.setd_OLD_UNIT_COST("0");
			struct.setd_OLD_PROCESSING_COST("0");
			struct.setd_OLD_MATERIAL_COST("0");
			struct.setd_OLD_OTHER_OVERHEADS("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			// 品目別作業コード
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "PROC_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROC_CD(columnValue == null?"":columnValue);
			// 取引先コード
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST","VEND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_CD(columnValue == null?"":columnValue);
			// 製品単価有効開始日
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "EFF_PHASE_IN_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EFF_PHASE_IN_DATE(columnValue == null?"":columnValue);
			// 単価区分
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "UNIT_COST_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST_TYP(columnValue == null?"":columnValue);
			// 単価
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "UNIT_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST(columnValue == null?"":columnValue);
			// 外注加工費
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "PROCESSING_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROCESSING_COST(columnValue == null?"":columnValue);
			// 外注材料費
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "MATERIAL_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MATERIAL_COST(columnValue == null?"":columnValue);
			// 外注その他経費
			columnID = mstappr.getColumnID( "M_SBCNT_UNIT_COST", "OTHER_OVERHEADS");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OTHER_OVERHEADS(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_PROC_CD("");
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_EFF_PHASE_IN_DATE("");
			struct.setd_NEW_UNIT_COST_TYP("");
			struct.setd_NEW_UNIT_COST("0");
			struct.setd_NEW_PROCESSING_COST("0");
			struct.setd_NEW_MATERIAL_COST("0");
			struct.setd_NEW_OTHER_OVERHEADS("0");
		}
		// 単価区分
		struct.setd_OLD_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_OLD_UNIT_COST_TYP()));
		struct.setd_NEW_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_NEW_UNIT_COST_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PROC_CD().equals(struct.getd_NEW_PROC_CD())){
				struct.setd_PROC_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_PHASE_IN_DATE().equals(struct.getd_NEW_EFF_PHASE_IN_DATE())){
				struct.setd_EFF_PHASE_IN_DATE_CHANGE(changed);
			}
			if(!struct.getd_OLD_UNIT_COST_TYP().equals(struct.getd_NEW_UNIT_COST_TYP())){
				struct.setd_UNIT_COST_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_UNIT_COST(),struct.getd_NEW_UNIT_COST())!=0){
				struct.setd_UNIT_COST_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PROCESSING_COST(),struct.getd_NEW_PROCESSING_COST())!=0){
				struct.setd_PROCESSING_COST_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MATERIAL_COST(),struct.getd_NEW_MATERIAL_COST())!=0){
				struct.setd_MATERIAL_COST_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_OTHER_OVERHEADS(),struct.getd_NEW_OTHER_OVERHEADS())!=0){
				struct.setd_OTHER_OVERHEADS_CHANGE(changed);
			}
		}
    }
    
    /**
     * 購入単価ヘッダ
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0040010H(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());                      // 取引先コード
    		oldStruct.setPLANT_CD(keyvalueMap.get("PLANT_CD").toString());                    // 工場コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());                      // 品目番号
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_PUCH_UNIT_COST_H.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD(oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD());
			struct.setd_OLD_VEND_CD(oldStruct.getd_OLD_VEND_CD()== null?"":oldStruct.getd_OLD_VEND_CD());
			struct.setd_OLD_PUCH_PRIORITY_REF_NO(oldStruct.getd_OLD_PUCH_PRIORITY_REF_NO()== null?"":oldStruct.getd_OLD_PUCH_PRIORITY_REF_NO());
			struct.setd_OLD_VEND_ITEM_CD(oldStruct.getd_OLD_VEND_ITEM_CD()== null?"":oldStruct.getd_OLD_VEND_ITEM_CD());
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_PUCH_PRIORITY_REF_NO("");
			struct.setd_OLD_VEND_ITEM_CD("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST_H", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			// 取引先コード
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST_H","VEND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_CD(columnValue == null?"":columnValue);
			// 購入優先順位
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST_H", "PUCH_PRIORITY_REF_NO");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PUCH_PRIORITY_REF_NO(columnValue == null?"":columnValue);
			// 取引先品目番号
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST_H","VEND_ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_ITEM_CD(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_PUCH_PRIORITY_REF_NO("");
			struct.setd_NEW_VEND_ITEM_CD("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PUCH_PRIORITY_REF_NO().equals(struct.getd_NEW_PUCH_PRIORITY_REF_NO())){
				struct.setd_PUCH_PRIORITY_REF_NO_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_ITEM_CD().equals(struct.getd_NEW_VEND_ITEM_CD())){
				struct.setd_VEND_ITEM_CD_CHANGE(changed);
			}
		}
    }
    
    /**
     * 購入単価明細
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0040010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());                      // 取引先コード
    		oldStruct.setPLANT_CD(keyvalueMap.get("PLANT_CD").toString());                    // 工場コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());                      // 品目番号
    		oldStruct.setEFF_PHASE_IN_DATE(keyvalueMap.get("EFF_PHASE_IN_DATE").toString());  // 製品単価有効開始日
    		oldStruct.setPUCH_SIZE(keyvalueMap.get("PUCH_SIZE").toString());  // サイズ
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_PUCH_UNIT_COST.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD(oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD());
			struct.setd_OLD_VEND_CD(oldStruct.getd_OLD_VEND_CD()== null?"":oldStruct.getd_OLD_VEND_CD());
			struct.setd_OLD_EFF_PHASE_IN_DATE(oldStruct.getd_OLD_EFF_PHASE_IN_DATE()==null?"":oldStruct.getd_OLD_EFF_PHASE_IN_DATE());
			struct.setd_OLD_PUCH_SIZE(oldStruct.getd_OLD_PUCH_SIZE()== null?"":oldStruct.getd_OLD_PUCH_SIZE());
			struct.setd_OLD_UNIT_COST_TYP(oldStruct.getd_OLD_UNIT_COST_TYP()==null?"":oldStruct.getd_OLD_UNIT_COST_TYP());
			struct.setd_OLD_UNIT_COST(oldStruct.getd_OLD_UNIT_COST()== null?"":oldStruct.getd_OLD_UNIT_COST());
			struct.setd_OLD_PROCESSING_COST(oldStruct.getd_OLD_PROCESSING_COST()== null?"":oldStruct.getd_OLD_PROCESSING_COST());
			struct.setd_OLD_MATERIAL_COST(oldStruct.getd_OLD_MATERIAL_COST() == null?"":oldStruct.getd_OLD_MATERIAL_COST());
			struct.setd_OLD_OTHER_OVERHEADS(oldStruct.getd_OLD_OTHER_OVERHEADS() == null?"":oldStruct.getd_OLD_OTHER_OVERHEADS());
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_EFF_PHASE_IN_DATE("");
			struct.setd_OLD_PUCH_SIZE("0");
			struct.setd_OLD_UNIT_COST_TYP("");
			struct.setd_OLD_UNIT_COST("0");
			struct.setd_OLD_PROCESSING_COST("0");
			struct.setd_OLD_MATERIAL_COST("0");
			struct.setd_OLD_OTHER_OVERHEADS("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			
			// 取引先コード
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST","VEND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_CD(columnValue == null?"":columnValue);
			// 製品単価有効開始日
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "EFF_PHASE_IN_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EFF_PHASE_IN_DATE(columnValue == null?"":columnValue);
			// サイズ
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "PUCH_SIZE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PUCH_SIZE(columnValue == null?"":columnValue);
			// 単価区分
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "UNIT_COST_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST_TYP(columnValue == null?"":columnValue);
			// 単価
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "UNIT_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST(columnValue == null?"":columnValue);
			// 外注加工費
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "PROCESSING_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROCESSING_COST(columnValue == null?"":columnValue);
			// 外注材料費
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "MATERIAL_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MATERIAL_COST(columnValue == null?"":columnValue);
			// 外注その他経費
			columnID = mstappr.getColumnID( "M_PUCH_UNIT_COST", "OTHER_OVERHEADS");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OTHER_OVERHEADS(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_EFF_PHASE_IN_DATE("");
			struct.setd_NEW_PUCH_SIZE("0");
			struct.setd_NEW_UNIT_COST_TYP("");
			struct.setd_NEW_UNIT_COST("0");
			struct.setd_NEW_PROCESSING_COST("0");
			struct.setd_NEW_MATERIAL_COST("0");
			struct.setd_NEW_OTHER_OVERHEADS("0");
		}
		// 単価区分
		struct.setd_OLD_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_OLD_UNIT_COST_TYP()));
		struct.setd_NEW_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_NEW_UNIT_COST_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_PHASE_IN_DATE().equals(struct.getd_NEW_EFF_PHASE_IN_DATE())){
				struct.setd_EFF_PHASE_IN_DATE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PUCH_SIZE(),struct.getd_NEW_PUCH_SIZE())!=0){
				struct.setd_PUCH_SIZE_CHANGE(changed);
			}
			if(!struct.getd_OLD_UNIT_COST_TYP().equals(struct.getd_NEW_UNIT_COST_TYP())){
				struct.setd_UNIT_COST_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_UNIT_COST(),struct.getd_NEW_UNIT_COST())!=0){
				struct.setd_UNIT_COST_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PROCESSING_COST(),struct.getd_NEW_PROCESSING_COST())!=0){
				struct.setd_PROCESSING_COST_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MATERIAL_COST(),struct.getd_NEW_MATERIAL_COST())!=0){
				struct.setd_MATERIAL_COST_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_OTHER_OVERHEADS(),struct.getd_NEW_OTHER_OVERHEADS())!=0){
				struct.setd_OTHER_OVERHEADS_CHANGE(changed);
			}
		}
    }
    /**
     * 取引先メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0070010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());                      // 取引先コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_VEND_CTRL.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_VEND_CD(oldStruct.getd_OLD_VEND_CD()==null?"":oldStruct.getd_OLD_VEND_CD());
			struct.setd_OLD_VEND_NAME(oldStruct.getd_OLD_VEND_NAME()==null?"":oldStruct.getd_OLD_VEND_NAME());
			struct.setd_OLD_VEND_ANAME(oldStruct.getd_OLD_VEND_ANAME()==null?"":oldStruct.getd_OLD_VEND_ANAME());
			struct.setd_OLD_ZIP_CD(oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD());
			struct.setd_OLD_ADDRESS_1(oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1());
			struct.setd_OLD_ADDRESS_2(oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2());
			struct.setd_OLD_ADDRESS_K_1(oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1());
			struct.setd_OLD_ADDRESS_K_2(oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2());
			struct.setd_OLD_TEL(oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL());
			struct.setd_OLD_FAX(oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX());
			struct.setd_OLD_EMAIL(oldStruct.getd_OLD_EMAIL()==null?"":oldStruct.getd_OLD_EMAIL());
			struct.setd_OLD_VEND_ORG(oldStruct.getd_OLD_VEND_ORG()==null?"":oldStruct.getd_OLD_VEND_ORG());
			struct.setd_OLD_VEND_PERSON(oldStruct.getd_OLD_VEND_PERSON()==null?"":oldStruct.getd_OLD_VEND_PERSON());
			struct.setd_OLD_OWN_ORG_CD(oldStruct.getd_OLD_OWN_ORG_CD()==null?"":oldStruct.getd_OLD_OWN_ORG_CD());
			struct.setd_OLD_OWN_ORG_NAME(oldStruct.getd_OLD_OWN_ORG_NAME()==null?"":oldStruct.getd_OLD_OWN_ORG_NAME());
			struct.setd_OLD_OWN_PERSON_CD(oldStruct.getd_OLD_OWN_PERSON_CD()==null?"":oldStruct.getd_OLD_OWN_PERSON_CD());
			struct.setd_OLD_ROUND_TYP(oldStruct.getd_OLD_ROUND_TYP()==null?"":oldStruct.getd_OLD_ROUND_TYP());
			struct.setd_OLD_TAX_CD(oldStruct.getd_OLD_TAX_CD()==null?"":oldStruct.getd_OLD_TAX_CD());
			struct.setd_OLD_TAX_APPLY_TYP(oldStruct.getd_OLD_TAX_APPLY_TYP()==null?"":oldStruct.getd_OLD_TAX_APPLY_TYP());
			struct.setd_OLD_TAX_CALC_TYP(oldStruct.getd_OLD_TAX_CALC_TYP()==null?"":oldStruct.getd_OLD_TAX_CALC_TYP());
			struct.setd_OLD_INSPC_ACPT_APP_TYP(oldStruct.getd_OLD_INSPC_ACPT_APP_TYP()==null?"":oldStruct.getd_OLD_INSPC_ACPT_APP_TYP());
			struct.setd_OLD_VEND_REM(oldStruct.getd_OLD_VEND_REM()==null?"":oldStruct.getd_OLD_VEND_REM());
			struct.setd_OLD_CUR_CD(oldStruct.getd_OLD_CUR_CD()==null?"":oldStruct.getd_OLD_CUR_CD());
			struct.setd_OLD_EXCH_TYP(oldStruct.getd_OLD_EXCH_TYP()==null?"":oldStruct.getd_OLD_EXCH_TYP());
			struct.setd_OLD_IMPORT_TRN_TYP(oldStruct.getd_OLD_IMPORT_TRN_TYP()==null?"":oldStruct.getd_OLD_IMPORT_TRN_TYP());
		}else{
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_VEND_NAME("");
			struct.setd_OLD_VEND_ANAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
			struct.setd_OLD_EMAIL("");
			struct.setd_OLD_VEND_ORG("");
			struct.setd_OLD_VEND_PERSON("");
			struct.setd_OLD_OWN_ORG_CD("");
			struct.setd_OLD_OWN_ORG_NAME("");
			struct.setd_OLD_OWN_PERSON_CD("");
			struct.setd_OLD_ROUND_TYP("");
			struct.setd_OLD_TAX_CD("");
			struct.setd_OLD_TAX_APPLY_TYP("");
			struct.setd_OLD_TAX_CALC_TYP("");
			struct.setd_OLD_INSPC_ACPT_APP_TYP("");
			struct.setd_OLD_VEND_REM("");
			struct.setd_OLD_CUR_CD("");
			struct.setd_OLD_EXCH_TYP("");
			struct.setd_OLD_IMPORT_TRN_TYP("");

		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 取引先コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_CD(columnValue==null?"":columnValue);
			// 取引先名
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_NAME(columnValue==null?"":columnValue);
			// 取引先略称
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_ANAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_ANAME(columnValue==null?"":columnValue);
			// 郵便番号
			columnID=mstappr.getColumnID("M_VEND_CTRL","ZIP_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ZIP_CD(columnValue==null?"":columnValue);
			// 住所1
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_1(columnValue==null?"":columnValue);
			// 住所2
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_2(columnValue==null?"":columnValue);
			// 住所(カナ)1
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue==null?"":columnValue);
			// 住所(カナ)2
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue==null?"":columnValue);
			// 電話番号
			columnID=mstappr.getColumnID("M_VEND_CTRL","TEL");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TEL(columnValue==null?"":columnValue);
			// FAX番号
			columnID=mstappr.getColumnID("M_VEND_CTRL","FAX");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_FAX(columnValue==null?"":columnValue);
			// メールアドレス
			columnID=mstappr.getColumnID("M_VEND_CTRL","EMAIL");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EMAIL(columnValue==null?"":columnValue);
			// 相手先担当部門
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_ORG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_ORG(columnValue==null?"":columnValue);
			// 相手先担当者
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_PERSON");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_PERSON(columnValue==null?"":columnValue);
			// 自社担当部門コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","OWN_ORG_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_ORG_CD(columnValue==null?"":columnValue);
			// 担当部門
			columnID=mstappr.getColumnID("M_VEND_CTRL","OWN_ORG_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_ORG_NAME(columnValue==null?"":columnValue);
			// 担当者コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","OWN_PERSON_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_PERSON_CD(columnValue==null?"":columnValue);
			// まるめ区分
			columnID=mstappr.getColumnID("M_VEND_CTRL","ROUND_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ROUND_TYP(columnValue==null?"":columnValue);
			// 消費税コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","TAX_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TAX_CD(columnValue==null?"":columnValue);
			// 消費税適用区分
			columnID=mstappr.getColumnID("M_VEND_CTRL","TAX_APPLY_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TAX_APPLY_TYP(columnValue==null?"":columnValue);
			// 消費税計算区分
			columnID=mstappr.getColumnID("M_VEND_CTRL","TAX_CALC_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TAX_CALC_TYP(columnValue==null?"":columnValue);
			// 検収計上区分
			columnID=mstappr.getColumnID("M_VEND_CTRL","INSPC_ACPT_APP_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_INSPC_ACPT_APP_TYP(columnValue==null?"":columnValue);
			// 備考
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_REM");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_REM(columnValue==null?"":columnValue);
			// 通貨コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","CUR_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUR_CD(columnValue==null?"":columnValue);
			// 為替種別
			columnID=mstappr.getColumnID("M_VEND_CTRL","EXCH_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EXCH_TYP(columnValue==null?"":columnValue);
			// 輸入取引区分
			columnID=mstappr.getColumnID("M_VEND_CTRL","IMPORT_TRN_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_IMPORT_TRN_TYP(columnValue==null?"":columnValue);
		}
		else{
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_VEND_NAME("");
			struct.setd_NEW_VEND_ANAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
			struct.setd_NEW_EMAIL("");
			struct.setd_NEW_VEND_ORG("");
			struct.setd_NEW_VEND_PERSON("");
			struct.setd_NEW_OWN_ORG_CD("");
			struct.setd_NEW_OWN_ORG_NAME("");
			struct.setd_NEW_OWN_PERSON_CD("");
			struct.setd_NEW_ROUND_TYP("");
			struct.setd_NEW_TAX_CD("");
			struct.setd_NEW_TAX_APPLY_TYP("");
			struct.setd_NEW_TAX_CALC_TYP("");
			struct.setd_NEW_INSPC_ACPT_APP_TYP("");
			struct.setd_NEW_VEND_REM("");
			struct.setd_NEW_CUR_CD("");
			struct.setd_NEW_EXCH_TYP("");
			struct.setd_NEW_IMPORT_TRN_TYP("");

		}
		// 発注金額まるめ
		struct.setd_OLD_ROUND_TYP(getTypeName(_ROUND_TYP,struct.getd_OLD_ROUND_TYP()));
		struct.setd_NEW_ROUND_TYP(getTypeName(_ROUND_TYP,struct.getd_NEW_ROUND_TYP()));
		// 消費税適用区分
		struct.setd_OLD_TAX_APPLY_TYP(getTypeName(_TAX_APPLY_TYP,struct.getd_OLD_TAX_APPLY_TYP()));
		struct.setd_NEW_TAX_APPLY_TYP(getTypeName(_TAX_APPLY_TYP,struct.getd_NEW_TAX_APPLY_TYP()));
		// 消費税計算区分
		struct.setd_OLD_TAX_CALC_TYP(getTypeName(_TAX_CALC_TYP,struct.getd_OLD_TAX_CALC_TYP()));
		struct.setd_NEW_TAX_CALC_TYP(getTypeName(_TAX_CALC_TYP,struct.getd_NEW_TAX_CALC_TYP()));
		// 為替種別
		struct.setd_OLD_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_OLD_EXCH_TYP()));
		struct.setd_NEW_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_NEW_EXCH_TYP()));
		// 輸入取引区分
		struct.setd_OLD_IMPORT_TRN_TYP(getTypeName(_IMPORT_TRN_TYP,struct.getd_OLD_IMPORT_TRN_TYP()));
		struct.setd_NEW_IMPORT_TRN_TYP(getTypeName(_IMPORT_TRN_TYP,struct.getd_NEW_IMPORT_TRN_TYP()));
		// 検収計上区分
		struct.setd_OLD_INSPC_ACPT_APP_TYP(getTypeName(_INSPC_ACPT_APP_TYP,struct.getd_OLD_INSPC_ACPT_APP_TYP()));
		struct.setd_NEW_INSPC_ACPT_APP_TYP(getTypeName(_INSPC_ACPT_APP_TYP,struct.getd_NEW_INSPC_ACPT_APP_TYP()));
		// 更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_NAME().equals(struct.getd_NEW_VEND_NAME())){
				struct.setd_VEND_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_ANAME().equals(struct.getd_NEW_VEND_ANAME())){
				struct.setd_VEND_ANAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())){
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())){
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())){
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())){
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())){
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())){
				struct.setd_TEL_CHANGE(changed);
			}
			if(!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())){
				struct.setd_FAX_CHANGE(changed);
			}
			if(!struct.getd_OLD_EMAIL().equals(struct.getd_NEW_EMAIL())){
				struct.setd_EMAIL_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_ORG().equals(struct.getd_NEW_VEND_ORG())){
				struct.setd_VEND_ORG_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_PERSON().equals(struct.getd_NEW_VEND_PERSON())){
				struct.setd_VEND_PERSON_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_ORG_CD().equals(struct.getd_NEW_OWN_ORG_CD())){
				struct.setd_OWN_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_ORG_NAME().equals(struct.getd_NEW_OWN_ORG_NAME())){
				struct.setd_OWN_ORG_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_PERSON_CD().equals(struct.getd_NEW_OWN_PERSON_CD())){
				struct.setd_OWN_PERSON_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ROUND_TYP().equals(struct.getd_NEW_ROUND_TYP())){
				struct.setd_ROUND_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_TAX_CD().equals(struct.getd_NEW_TAX_CD())){
				struct.setd_TAX_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_TAX_APPLY_TYP().equals(struct.getd_NEW_TAX_APPLY_TYP())){
				struct.setd_TAX_APPLY_TYP_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_TAX_CALC_TYP().equals(struct.getd_NEW_TAX_CALC_TYP())){
				struct.setd_TAX_CALC_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_INSPC_ACPT_APP_TYP().equals(struct.getd_NEW_INSPC_ACPT_APP_TYP())){
				struct.setd_INSPC_ACPT_APP_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_REM().equals(struct.getd_NEW_VEND_REM())){
				struct.setd_VEND_REM_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUR_CD().equals(struct.getd_NEW_CUR_CD())){
				struct.setd_CUR_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_TYP().equals(struct.getd_NEW_EXCH_TYP())){
				struct.setd_EXCH_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_IMPORT_TRN_TYP().equals(struct.getd_NEW_IMPORT_TRN_TYP())){
				struct.setd_IMPORT_TRN_TYP_CHANGE(changed);
			}
		}
    }
    
    /**
     * 請求条件メンテナンス　＆請求条件データ一括登録
     * 請求条件
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBA0020010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                				// 会社コード
    		oldStruct.setBILL_ADDRESSEE_CD(keyvalueMap.get("BILL_ADDRESSEE_CD").toString());                // 請求先コード
    		oldStruct.setSTL_COND_CD(keyvalueMap.get("STL_COND_CD").toString());               			  	// 決済条件コード
    		
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST_STL_CTRL.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_BILL_ADDRESSEE_CD((oldStruct.getd_OLD_BILL_ADDRESSEE_CD()==null?"":oldStruct.getd_OLD_BILL_ADDRESSEE_CD()));
			struct.setd_OLD_STL_COND_CD((oldStruct.getd_OLD_STL_COND_CD()==null?"":oldStruct.getd_OLD_STL_COND_CD()));
			struct.setd_OLD_CLAIM_ORG_CD((oldStruct.getd_OLD_CLAIM_ORG_CD()==null?"":oldStruct.getd_OLD_CLAIM_ORG_CD()));
			struct.setd_OLD_EDI_TRN_BILL_TYP((oldStruct.getd_OLD_EDI_TRN_BILL_TYP()==null?"":oldStruct.getd_OLD_EDI_TRN_BILL_TYP()));
			struct.setd_OLD_EDI_TRN_RM_TYP((oldStruct.getd_OLD_EDI_TRN_RM_TYP()==null?"":oldStruct.getd_OLD_EDI_TRN_RM_TYP()));
			struct.setd_OLD_BILL_BALANCE_CTRL_FLG((oldStruct.getd_OLD_BILL_BALANCE_CTRL_FLG()==null?"":oldStruct.getd_OLD_BILL_BALANCE_CTRL_FLG()));
			struct.setd_OLD_AR_BALANCE_CTRL_FLG((oldStruct.getd_OLD_AR_BALANCE_CTRL_FLG()==null?"":oldStruct.getd_OLD_AR_BALANCE_CTRL_FLG()));
			struct.setd_OLD_COLLECTION_STD_AMOUNT((oldStruct.getd_OLD_COLLECTION_STD_AMOUNT()==null?"":oldStruct.getd_OLD_COLLECTION_STD_AMOUNT()));
			struct.setd_OLD_RM_OFFSET_TYP((oldStruct.getd_OLD_RM_OFFSET_TYP()==null?"":oldStruct.getd_OLD_RM_OFFSET_TYP()));

		}else{
			struct.setd_OLD_BILL_ADDRESSEE_CD("");
			struct.setd_OLD_STL_COND_CD("");
			struct.setd_OLD_CLAIM_ORG_CD("");
			struct.setd_OLD_EDI_TRN_BILL_TYP("");
			struct.setd_OLD_EDI_TRN_RM_TYP("");
			struct.setd_OLD_BILL_BALANCE_CTRL_FLG("");
			struct.setd_OLD_AR_BALANCE_CTRL_FLG("");
			struct.setd_OLD_COLLECTION_STD_AMOUNT("0");
			struct.setd_OLD_RM_OFFSET_TYP("");

		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 請求先コード
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "BILL_ADDRESSEE_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BILL_ADDRESSEE_CD(columnValue == null?"":columnValue);
			// 決済条件コード
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "STL_COND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STL_COND_CD(columnValue == null?"":columnValue);
			// 請求部門コード
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "CLAIM_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CLAIM_ORG_CD(columnValue == null?"":columnValue);
			// EDI取引区分（請求）
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "EDI_TRN_BILL_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EDI_TRN_BILL_TYP(columnValue == null?"":columnValue);
			// EDI取引区分（入金）
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "EDI_TRN_RM_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EDI_TRN_RM_TYP(columnValue == null?"":columnValue);
			// 請求残高管理フラグ
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "BILL_BALANCE_CTRL_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BILL_BALANCE_CTRL_FLG(columnValue == null?"":columnValue);
			// 売掛金残高管理フラグ
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "AR_BALANCE_CTRL_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_AR_BALANCE_CTRL_FLG(columnValue == null?"":columnValue);
			// 回収条件基準金額
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "COLLECTION_STD_AMOUNT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_COLLECTION_STD_AMOUNT(columnValue == null?"":columnValue);
			// 入金相殺区分
			columnID = mstappr.getColumnID( "M_CUST_STL_CTRL", "RM_OFFSET_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_RM_OFFSET_TYP(columnValue == null?"":columnValue);

		}
		else{
			struct.setd_NEW_BILL_ADDRESSEE_CD("");
			struct.setd_NEW_STL_COND_CD("");
			struct.setd_NEW_CLAIM_ORG_CD("");
			struct.setd_NEW_EDI_TRN_BILL_TYP("");
			struct.setd_NEW_EDI_TRN_RM_TYP("");
			struct.setd_NEW_BILL_BALANCE_CTRL_FLG("");
			struct.setd_NEW_AR_BALANCE_CTRL_FLG("");
			struct.setd_NEW_COLLECTION_STD_AMOUNT("0");
			struct.setd_NEW_RM_OFFSET_TYP("");
		}

		// EDI取引区分(請求)
		struct.setd_OLD_EDI_TRN_BILL_TYP(getTypeName(_EDI_TRN_BILL_TYP,struct.getd_OLD_EDI_TRN_BILL_TYP()));
		struct.setd_NEW_EDI_TRN_BILL_TYP(getTypeName(_EDI_TRN_BILL_TYP,struct.getd_NEW_EDI_TRN_BILL_TYP()));
	    // EDI取引区分（入金） 
		struct.setd_OLD_EDI_TRN_RM_TYP(getTypeName(_EDI_TRN_RM_TYP,struct.getd_OLD_EDI_TRN_RM_TYP()));
		struct.setd_NEW_EDI_TRN_RM_TYP(getTypeName(_EDI_TRN_RM_TYP,struct.getd_NEW_EDI_TRN_RM_TYP()));
	    // 請求残高管理フラグ
		struct.setd_OLD_BILL_BALANCE_CTRL_FLG(getTypeName(_BILL_BALANCE_CTRL_FLG,struct.getd_OLD_BILL_BALANCE_CTRL_FLG()));
		struct.setd_NEW_BILL_BALANCE_CTRL_FLG(getTypeName(_BILL_BALANCE_CTRL_FLG,struct.getd_NEW_BILL_BALANCE_CTRL_FLG()));
	    // 売掛金残高管理フラグ 
		struct.setd_OLD_AR_BALANCE_CTRL_FLG(getTypeName(_AR_BALANCE_CTRL_FLG,struct.getd_OLD_AR_BALANCE_CTRL_FLG()));
		struct.setd_NEW_AR_BALANCE_CTRL_FLG(getTypeName(_AR_BALANCE_CTRL_FLG,struct.getd_NEW_AR_BALANCE_CTRL_FLG()));
		// 入金相殺区分
		struct.setd_OLD_RM_OFFSET_TYP(getTypeName(_RM_OFFSET_TYP,struct.getd_OLD_RM_OFFSET_TYP()));
		struct.setd_NEW_RM_OFFSET_TYP(getTypeName(_RM_OFFSET_TYP,struct.getd_NEW_RM_OFFSET_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_BILL_ADDRESSEE_CD().equals(struct.getd_NEW_BILL_ADDRESSEE_CD())) {
				struct.setd_BILL_ADDRESSEE_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_STL_COND_CD().equals(struct.getd_NEW_STL_COND_CD())) {
				struct.setd_STL_COND_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_CLAIM_ORG_CD().equals(struct.getd_NEW_CLAIM_ORG_CD())) {
				struct.setd_CLAIM_ORG_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_EDI_TRN_BILL_TYP().equals(struct.getd_NEW_EDI_TRN_BILL_TYP())) {
				struct.setd_EDI_TRN_BILL_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_EDI_TRN_RM_TYP().equals(struct.getd_NEW_EDI_TRN_RM_TYP())) {
				struct.setd_EDI_TRN_RM_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_BILL_BALANCE_CTRL_FLG().equals(struct.getd_NEW_BILL_BALANCE_CTRL_FLG())) {
				struct.setd_BILL_BALANCE_CTRL_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_AR_BALANCE_CTRL_FLG().equals(struct.getd_NEW_AR_BALANCE_CTRL_FLG())) {
				struct.setd_AR_BALANCE_CTRL_FLG_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_COLLECTION_STD_AMOUNT(),struct.getd_NEW_COLLECTION_STD_AMOUNT())!=0){
				struct.setd_COLLECTION_STD_AMOUNT_CHANGE(changed);
			}
			if (!struct.getd_OLD_RM_OFFSET_TYP().equals(struct.getd_NEW_RM_OFFSET_TYP())) {
				struct.setd_RM_OFFSET_TYP_CHANGE(changed);
			}
		}
    }
    /**
     * 請求条件メンテナンス　＆請求条件データ一括登録
     * 請求得意先
     * 請求条件
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBA0020010H(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                				// 会社コード
    		oldStruct.setBILL_ADDRESSEE_CD(keyvalueMap.get("BILL_ADDRESSEE_CD").toString());                // 請求先コード
    		oldStruct.setSTL_COND_CD(keyvalueMap.get("STL_COND_CD").toString());               			  	// 決済条件コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());               			  	        // 得意先コード
    		
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CLAIM_CUST_CTRL.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_BILL_ADDRESSEE_CD((oldStruct.getd_OLD_BILL_ADDRESSEE_CD()==null?"":oldStruct.getd_OLD_BILL_ADDRESSEE_CD()));
			struct.setd_OLD_STL_COND_CD((oldStruct.getd_OLD_STL_COND_CD()==null?"":oldStruct.getd_OLD_STL_COND_CD()));
			struct.setd_OLD_LINE_CUST_CD((oldStruct.getd_OLD_LINE_CUST_CD()==null?"":oldStruct.getd_OLD_LINE_CUST_CD()));
		}else{
			struct.setd_OLD_BILL_ADDRESSEE_CD("");
			struct.setd_OLD_STL_COND_CD("");
			struct.setd_OLD_LINE_CUST_CD("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 請求先コード
			columnID = mstappr.getColumnID( "M_CLAIM_CUST_CTRL", "BILL_ADDRESSEE_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BILL_ADDRESSEE_CD(columnValue == null?"":columnValue);
			// 決済条件コード
			columnID = mstappr.getColumnID( "M_CLAIM_CUST_CTRL", "STL_COND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STL_COND_CD(columnValue == null?"":columnValue);
			// 得意先コード
			columnID = mstappr.getColumnID( "M_CLAIM_CUST_CTRL", "CUST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LINE_CUST_CD(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_BILL_ADDRESSEE_CD("");
			struct.setd_NEW_STL_COND_CD("");
			struct.setd_NEW_LINE_CUST_CD("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_BILL_ADDRESSEE_CD().equals(struct.getd_NEW_BILL_ADDRESSEE_CD())) {
				struct.setd_BILL_ADDRESSEE_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_STL_COND_CD().equals(struct.getd_NEW_STL_COND_CD())) {
				struct.setd_STL_COND_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_LINE_CUST_CD().equals(struct.getd_NEW_LINE_CUST_CD())) {
				struct.setd_LINE_CUST_CD_CHANGE(changed);
			}
		}
    }
    
    /**
     * 得意先メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA0100010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());                      // 得意先コード
            // 変更前データリストを取得
    		if (screen_url.equals("KA0100010Servlet")) {
    			oldDateList = commonEntity.mselectM_CUST.read(conn, oldStruct);
    		} else {
    			oldDateList = commonEntity.mselectM_CUST_JF.read(conn, oldStruct);
    		}
    		
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_CUST_NAME(oldStruct.getd_OLD_CUST_NAME()==null?"":oldStruct.getd_OLD_CUST_NAME());
			struct.setd_OLD_CUST_ANAME(oldStruct.getd_OLD_CUST_ANAME()==null?"":oldStruct.getd_OLD_CUST_ANAME());
			struct.setd_OLD_CUST_KNAME(oldStruct.getd_OLD_CUST_KNAME()==null?"":oldStruct.getd_OLD_CUST_KNAME());
			struct.setd_OLD_OWN_ORG_CD(oldStruct.getd_OLD_OWN_ORG_CD()==null?"":oldStruct.getd_OLD_OWN_ORG_CD());
			struct.setd_OLD_OWN_PERSON_CD(oldStruct.getd_OLD_OWN_PERSON_CD()==null?"":oldStruct.getd_OLD_OWN_PERSON_CD());
			struct.setd_OLD_CUR_CD(oldStruct.getd_OLD_CUR_CD()==null?"":oldStruct.getd_OLD_CUR_CD());
			struct.setd_OLD_INSPC_ACPT_TYP(oldStruct.getd_OLD_INSPC_ACPT_TYP()==null?"":oldStruct.getd_OLD_INSPC_ACPT_TYP());
			struct.setd_OLD_EXCH_TYP(oldStruct.getd_OLD_EXCH_TYP()==null?"":oldStruct.getd_OLD_EXCH_TYP());
			struct.setd_OLD_TAX_CD(oldStruct.getd_OLD_TAX_CD()==null?"":oldStruct.getd_OLD_TAX_CD());
			struct.setd_OLD_TAX_CALC_TYP(oldStruct.getd_OLD_TAX_CALC_TYP()==null?"":oldStruct.getd_OLD_TAX_CALC_TYP());
			struct.setd_OLD_TAX_APPLY_TYP(oldStruct.getd_OLD_TAX_APPLY_TYP()==null?"":oldStruct.getd_OLD_TAX_APPLY_TYP());
			struct.setd_OLD_DETAIL_ROUND_TYP(oldStruct.getd_OLD_DETAIL_ROUND_TYP()==null?"":oldStruct.getd_OLD_DETAIL_ROUND_TYP());
			if (screen_url.equals("KA0100010Servlet")) {
				struct.setd_OLD_EDI_CUST_VEND_CD(oldStruct.getd_OLD_EDI_CUST_VEND_CD()==null?"":oldStruct.getd_OLD_EDI_CUST_VEND_CD());
				struct.setd_OLD_PARTIAL_SHIP_INST_FLG(oldStruct.getd_OLD_PARTIAL_SHIP_INST_FLG()==null?"":oldStruct.getd_OLD_PARTIAL_SHIP_INST_FLG());
			} else {
				struct.setd_OLD_CUST_FNAME(oldStruct.getd_OLD_CUST_FNAME()==null?"":oldStruct.getd_OLD_CUST_FNAME());
				struct.setd_OLD_CUST_GRP_CD(oldStruct.getd_OLD_CUST_GRP_CD()==null?"":oldStruct.getd_OLD_CUST_GRP_CD());
				struct.setd_OLD_CUST_DLV_LOC_CD(oldStruct.getd_OLD_CUST_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_CUST_DLV_LOC_CD());
				struct.setd_OLD_CUST_FLG(oldStruct.getd_OLD_CUST_FLG()==null?"":oldStruct.getd_OLD_CUST_FLG());
				struct.setd_OLD_DELIVERY_FLG(oldStruct.getd_OLD_DELIVERY_FLG()==null?"":oldStruct.getd_OLD_DELIVERY_FLG());
				struct.setd_OLD_BALA_ACCO_FLG(oldStruct.getd_OLD_BALA_ACCO_FLG()==null?"":oldStruct.getd_OLD_BALA_ACCO_FLG());
				struct.setd_OLD_UNIT_COST_USE_TYP(oldStruct.getd_OLD_UNIT_COST_USE_TYP()==null?"":oldStruct.getd_OLD_UNIT_COST_USE_TYP());
			}
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_CUST_NAME("");
			struct.setd_OLD_CUST_ANAME("");
			struct.setd_OLD_CUST_KNAME("");
			struct.setd_OLD_OWN_ORG_CD("");
			struct.setd_OLD_OWN_PERSON_CD("");
			struct.setd_OLD_CUR_CD("");
			struct.setd_OLD_INSPC_ACPT_TYP("");
			struct.setd_OLD_EXCH_TYP("");
			struct.setd_OLD_TAX_CD("");
			struct.setd_OLD_TAX_CALC_TYP("");
			struct.setd_OLD_TAX_APPLY_TYP("");
			struct.setd_OLD_DETAIL_ROUND_TYP("");
			if (screen_url.equals("KA0100010Servlet")) {
				struct.setd_OLD_EDI_CUST_VEND_CD("");
				struct.setd_OLD_PARTIAL_SHIP_INST_FLG("");
			} else {
				struct.setd_OLD_CUST_FNAME("");
				struct.setd_OLD_CUST_GRP_CD("");
				struct.setd_OLD_CUST_DLV_LOC_CD("");
				struct.setd_OLD_CUST_FLG("");
				struct.setd_OLD_DELIVERY_FLG("");
				struct.setd_OLD_BALA_ACCO_FLG("");
				struct.setd_OLD_UNIT_COST_USE_TYP("");
			}
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID=mstappr.getColumnID("M_CUST","CUST_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_CD(columnValue==null?"":columnValue);
			// 得意先名
			columnID=mstappr.getColumnID("M_CUST","CUST_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_NAME(columnValue==null?"":columnValue);
			// 得意先名略称	 
			columnID=mstappr.getColumnID("M_CUST","CUST_ANAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_ANAME(columnValue==null?"":columnValue);
			// 得意先名（カナ）
			columnID=mstappr.getColumnID("M_CUST","CUST_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_KNAME(columnValue==null?"":columnValue);
			// 自社担当部門コード
			columnID=mstappr.getColumnID("M_CUST","OWN_ORG_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_ORG_CD(columnValue==null?"":columnValue);
			// 自社担当者コード
			columnID=mstappr.getColumnID("M_CUST","OWN_PERSON_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_PERSON_CD(columnValue==null?"":columnValue);
			// 通貨コード
			columnID=mstappr.getColumnID("M_CUST","CUR_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUR_CD(columnValue==null?"":columnValue);
			// 検収区分
			columnID=mstappr.getColumnID("M_CUST","INSPC_ACPT_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_INSPC_ACPT_TYP(columnValue==null?"":columnValue);
			// 為替種別
			columnID=mstappr.getColumnID("M_CUST","EXCH_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EXCH_TYP(columnValue==null?"":columnValue);
			// 税コード
			columnID=mstappr.getColumnID("M_CUST","TAX_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TAX_CD(columnValue==null?"":columnValue);
			// 消費税計算区分
			columnID=mstappr.getColumnID("M_CUST","TAX_CALC_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TAX_CALC_TYP(columnValue==null?"":columnValue);
			// 消費税適用区分
			columnID=mstappr.getColumnID("M_CUST","TAX_APPLY_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TAX_APPLY_TYP(columnValue==null?"":columnValue);
			// 明細計算まるめ区分
			columnID=mstappr.getColumnID("M_CUST","DETAIL_ROUND_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_DETAIL_ROUND_TYP(columnValue==null?"":columnValue);
			if (screen_url.equals("KA0100010Servlet")) {
				// EDI相手取引先コード
				columnID=mstappr.getColumnID("M_CUST","EDI_CUST_VEND_CD");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_EDI_CUST_VEND_CD(columnValue==null?"":columnValue);
				// 分納出荷指示
				columnID=mstappr.getColumnID("M_CUST","PARTIAL_SHIP_INST_FLG");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_PARTIAL_SHIP_INST_FLG(columnValue==null?"":columnValue);
			} else {
				// 得意先正式名称
				columnID=mstappr.getColumnID("M_CUST","CUST_FNAME");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_CUST_FNAME(columnValue==null?"":columnValue);
				// 得意先グループコード
				columnID=mstappr.getColumnID("M_CUST","CUST_GRP_CD");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_CUST_GRP_CD(columnValue==null?"":columnValue);
				// 得意先納品場所コード
				columnID=mstappr.getColumnID("M_CUST","CUST_DLV_LOC_CD");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_CUST_DLV_LOC_CD(columnValue==null?"":columnValue);
				// 得意先フラグ
				columnID=mstappr.getColumnID("M_CUST","CUST_FLG");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_CUST_FLG(columnValue==null?"":columnValue);
				// 納入先フラグ
				columnID=mstappr.getColumnID("M_CUST","DELIVERY_FLG");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_DELIVERY_FLG(columnValue==null?"":columnValue);
				// 帳合先フラグ
				columnID=mstappr.getColumnID("M_CUST","BALA_ACCO_FLG");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_BALA_ACCO_FLG(columnValue==null?"":columnValue);
				// 単価取得区分
				columnID=mstappr.getColumnID("M_CUST","UNIT_COST_USE_TYP");
				columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
				struct.setd_NEW_UNIT_COST_USE_TYP(columnValue==null?"":columnValue);
			}
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_CUST_NAME("");
			struct.setd_NEW_CUST_ANAME("");
			struct.setd_NEW_CUST_KNAME("");
			struct.setd_NEW_OWN_ORG_CD("");
			struct.setd_NEW_OWN_PERSON_CD("");
			struct.setd_NEW_CUR_CD("");
			struct.setd_NEW_INSPC_ACPT_TYP("");
			struct.setd_NEW_EXCH_TYP("");
			struct.setd_NEW_TAX_CD("");
			struct.setd_NEW_TAX_CALC_TYP("");
			struct.setd_NEW_TAX_APPLY_TYP("");
			struct.setd_NEW_DETAIL_ROUND_TYP("");
			if (screen_url.equals("KA0100010Servlet")) {
				struct.setd_NEW_EDI_CUST_VEND_CD("");
				struct.setd_NEW_PARTIAL_SHIP_INST_FLG("");
			} else {
				struct.setd_NEW_CUST_FNAME("");
				struct.setd_NEW_CUST_GRP_CD("");
				struct.setd_NEW_CUST_DLV_LOC_CD("");
				struct.setd_NEW_CUST_FLG("");
				struct.setd_NEW_DELIVERY_FLG("");
				struct.setd_NEW_BALA_ACCO_FLG("");
				struct.setd_NEW_UNIT_COST_USE_TYP("");
			}
		}
		 // 検収区分
		struct.setd_OLD_INSPC_ACPT_TYP(getTypeName(_INSPC_ACPT_TYP,struct.getd_OLD_INSPC_ACPT_TYP()));
		struct.setd_NEW_INSPC_ACPT_TYP(getTypeName(_INSPC_ACPT_TYP,struct.getd_NEW_INSPC_ACPT_TYP()));
		 // 為替種別
		struct.setd_OLD_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_OLD_EXCH_TYP()));
		struct.setd_NEW_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_NEW_EXCH_TYP()));
		// 消費税計算区分
		struct.setd_OLD_TAX_CALC_TYP(getTypeName(_TAX_CALC_TYP_SAAR,struct.getd_OLD_TAX_CALC_TYP()));
		struct.setd_NEW_TAX_CALC_TYP(getTypeName(_TAX_CALC_TYP_SAAR,struct.getd_NEW_TAX_CALC_TYP()));
		// 消費税適用区分
		struct.setd_OLD_TAX_APPLY_TYP(getTypeName(_TAX_APPLY_TYP_SAAR,struct.getd_OLD_TAX_APPLY_TYP()));
		struct.setd_NEW_TAX_APPLY_TYP(getTypeName(_TAX_APPLY_TYP_SAAR,struct.getd_NEW_TAX_APPLY_TYP()));
		// 明細計算まるめ区分
		struct.setd_OLD_DETAIL_ROUND_TYP(getTypeName(_DETAIL_ROUND_TYP,struct.getd_OLD_DETAIL_ROUND_TYP()));
		struct.setd_NEW_DETAIL_ROUND_TYP(getTypeName(_DETAIL_ROUND_TYP,struct.getd_NEW_DETAIL_ROUND_TYP()));
		if (screen_url.equals("KA0100010Servlet")) {
			// 分納出荷指示F
			struct.setd_OLD_PARTIAL_SHIP_INST_FLG(getTypeName(_PARTIAL_SHIP_INST_FLG,struct.getd_OLD_PARTIAL_SHIP_INST_FLG()));
			struct.setd_NEW_PARTIAL_SHIP_INST_FLG(getTypeName(_PARTIAL_SHIP_INST_FLG,struct.getd_NEW_PARTIAL_SHIP_INST_FLG()));
		} else {
			// 得意先フラグ
			struct.setd_OLD_CUST_FLG(getTypeName(_CUST_FLG,struct.getd_OLD_CUST_FLG()));
			struct.setd_NEW_CUST_FLG(getTypeName(_CUST_FLG,struct.getd_NEW_CUST_FLG()));
			// 納入先フラグ
			struct.setd_OLD_DELIVERY_FLG(getTypeName(_DELIVERY_FLG,struct.getd_OLD_DELIVERY_FLG()));
			struct.setd_NEW_DELIVERY_FLG(getTypeName(_DELIVERY_FLG,struct.getd_NEW_DELIVERY_FLG()));
			// 帳合先フラグ
			struct.setd_OLD_BALA_ACCO_FLG(getTypeName(_BALA_ACCO_FLG,struct.getd_OLD_BALA_ACCO_FLG()));
			struct.setd_NEW_BALA_ACCO_FLG(getTypeName(_BALA_ACCO_FLG,struct.getd_NEW_BALA_ACCO_FLG()));
			// 単価取得区分
			struct.setd_OLD_UNIT_COST_USE_TYP(getTypeName(_UNIT_COST_USE_TYP,struct.getd_OLD_UNIT_COST_USE_TYP()));
			struct.setd_NEW_UNIT_COST_USE_TYP(getTypeName(_UNIT_COST_USE_TYP,struct.getd_NEW_UNIT_COST_USE_TYP()));
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_NAME().equals(struct.getd_NEW_CUST_NAME())){
				struct.setd_CUST_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_ANAME().equals(struct.getd_NEW_CUST_ANAME())){
				struct.setd_CUST_ANAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_KNAME().equals(struct.getd_NEW_CUST_KNAME())){
				struct.setd_CUST_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_ORG_CD().equals(struct.getd_NEW_OWN_ORG_CD())){
				struct.setd_OWN_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_PERSON_CD().equals(struct.getd_NEW_OWN_PERSON_CD())){
				struct.setd_OWN_PERSON_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUR_CD().equals(struct.getd_NEW_CUR_CD())){
				struct.setd_CUR_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_INSPC_ACPT_TYP().equals(struct.getd_NEW_INSPC_ACPT_TYP())){
				struct.setd_INSPC_ACPT_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_TYP().equals(struct.getd_NEW_EXCH_TYP())){
				struct.setd_EXCH_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_TAX_CD().equals(struct.getd_NEW_TAX_CD())){
				struct.setd_TAX_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_TAX_CALC_TYP().equals(struct.getd_NEW_TAX_CALC_TYP())){
				struct.setd_TAX_CALC_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_TAX_APPLY_TYP().equals(struct.getd_NEW_TAX_APPLY_TYP())){
				struct.setd_TAX_APPLY_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_DETAIL_ROUND_TYP().equals(struct.getd_NEW_DETAIL_ROUND_TYP())){
				struct.setd_DETAIL_ROUND_TYP_CHANGE(changed);
			}
			if (screen_url.equals("KA0100010Servlet")) {
				if(!struct.getd_OLD_EDI_CUST_VEND_CD().equals(struct.getd_NEW_EDI_CUST_VEND_CD())){
					struct.setd_EDI_CUST_VEND_CD_CHANGE(changed);
				}
				if(!struct.getd_OLD_PARTIAL_SHIP_INST_FLG().equals(struct.getd_NEW_PARTIAL_SHIP_INST_FLG())){
					struct.setd_PARTIAL_SHIP_INST_FLG_CHANGE(changed);
				}
			} else {
				if(!struct.getd_OLD_CUST_FLG().equals(struct.getd_NEW_CUST_FLG())){
					struct.setd_CUST_FLG_CHANGE(changed);
				}
				if(!struct.getd_OLD_DELIVERY_FLG().equals(struct.getd_NEW_DELIVERY_FLG())){
					struct.setd_DELIVERY_FLG_CHANGE(changed);
				}
				if(!struct.getd_OLD_BALA_ACCO_FLG().equals(struct.getd_NEW_BALA_ACCO_FLG())){
					struct.setd_BALA_ACCO_FLG_CHANGE(changed);
				}
				if(!struct.getd_OLD_UNIT_COST_USE_TYP().equals(struct.getd_NEW_UNIT_COST_USE_TYP())){
					struct.setd_UNIT_COST_USE_TYP_CHANGE(changed);
				}
				if(!struct.getd_OLD_CUST_FNAME().equals(struct.getd_NEW_CUST_FNAME())){
					struct.setd_CUST_FNAME_CHANGE(changed);
				}
				if(!struct.getd_OLD_CUST_GRP_CD().equals(struct.getd_NEW_CUST_GRP_CD())){
					struct.setd_CUST_GRP_CD_CHANGE(changed);
				}
				if(!struct.getd_OLD_CUST_DLV_LOC_CD().equals(struct.getd_NEW_CUST_DLV_LOC_CD())){
					struct.setd_CUST_DLV_LOC_CD_CHANGE(changed);
				}
			}

		}
    }
    /**
     * 得意先納品場所メンテナンスフォーム
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA0100020(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());                      // 得意先コード
    		oldStruct.setDLV_LOC_CD(keyvalueMap.get("DLV_LOC_CD").toString());                      // 納品場所コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST_BASE.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_DLV_LOC_CD(oldStruct.getd_OLD_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_DLV_LOC_CD());
			struct.setd_OLD_DLV_LOC_NAME(oldStruct.getd_OLD_DLV_LOC_NAME()==null?"":oldStruct.getd_OLD_DLV_LOC_NAME());
			struct.setd_OLD_DLV_LOC_KNAME(oldStruct.getd_OLD_DLV_LOC_KNAME()==null?"":oldStruct.getd_OLD_DLV_LOC_KNAME());
			struct.setd_OLD_DLV_LOC_ENAME(oldStruct.getd_OLD_DLV_LOC_ENAME()==null?"":oldStruct.getd_OLD_DLV_LOC_ENAME());
			struct.setd_OLD_ZIP_CD(oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD());
			struct.setd_OLD_ADDRESS_1(oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1());
			struct.setd_OLD_ADDRESS_2(oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2());
			struct.setd_OLD_ADDRESS_K_1(oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1());
			struct.setd_OLD_ADDRESS_K_2(oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2());
			struct.setd_OLD_TEL(oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL());
			struct.setd_OLD_FAX(oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX());
			struct.setd_OLD_SHIP_WH_CD(oldStruct.getd_OLD_SHIP_WH_CD()==null?"":oldStruct.getd_OLD_SHIP_WH_CD());
			struct.setd_OLD_DEPO_WH_CD(oldStruct.getd_OLD_DEPO_WH_CD()==null?"":oldStruct.getd_OLD_DEPO_WH_CD());
			struct.setd_OLD_TRANSPORT_CD(oldStruct.getd_OLD_TRANSPORT_CD()==null?"":oldStruct.getd_OLD_TRANSPORT_CD());
			struct.setd_OLD_TRANSPORT_LT(oldStruct.getd_OLD_TRANSPORT_LT()==null?"":oldStruct.getd_OLD_TRANSPORT_LT());
			struct.setd_OLD_BUSINESS_WH_FLG(oldStruct.getd_OLD_BUSINESS_WH_FLG()==null?"":oldStruct.getd_OLD_BUSINESS_WH_FLG());
			struct.setd_OLD_REPRESENT_FLG(oldStruct.getd_OLD_REPRESENT_FLG()==null?"":oldStruct.getd_OLD_REPRESENT_FLG());
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_DLV_LOC_CD("");
			struct.setd_OLD_DLV_LOC_NAME("");
			struct.setd_OLD_DLV_LOC_KNAME("");
			struct.setd_OLD_DLV_LOC_ENAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
			struct.setd_OLD_SHIP_WH_CD("");
			struct.setd_OLD_DEPO_WH_CD("");
			struct.setd_OLD_TRANSPORT_CD("");
			struct.setd_OLD_TRANSPORT_LT("0");
			struct.setd_OLD_BUSINESS_WH_FLG("");
			struct.setd_OLD_REPRESENT_FLG("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID=mstappr.getColumnID("M_CUST_BASE","CUST_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_CD(columnValue==null?"":columnValue);
			// 納品場所コード
			columnID=mstappr.getColumnID("M_CUST_BASE","DLV_LOC_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_DLV_LOC_CD(columnValue==null?"":columnValue);
			// 納品場所名
			columnID=mstappr.getColumnID("M_CUST_BASE","DLV_LOC_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_DLV_LOC_NAME(columnValue==null?"":columnValue);
			// 納品場所名（カナ）
			columnID=mstappr.getColumnID("M_CUST_BASE","DLV_LOC_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_DLV_LOC_KNAME(columnValue==null?"":columnValue);
			// 納品場所名（英名）
			columnID=mstappr.getColumnID("M_CUST_BASE","DLV_LOC_ENAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_DLV_LOC_ENAME(columnValue==null?"":columnValue);
			// 郵便番号
			columnID=mstappr.getColumnID("M_CUST_BASE","ZIP_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ZIP_CD(columnValue==null?"":columnValue);
			// 住所１
			columnID=mstappr.getColumnID("M_CUST_BASE","ADDRESS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_1(columnValue==null?"":columnValue);
			// 住所２
			columnID=mstappr.getColumnID("M_CUST_BASE","ADDRESS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_2(columnValue==null?"":columnValue);
			// 住所（カナ）１
			columnID=mstappr.getColumnID("M_CUST_BASE","ADDRESS_K_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue==null?"":columnValue);
			// 住所（カナ）２
			columnID=mstappr.getColumnID("M_CUST_BASE","ADDRESS_K_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue==null?"":columnValue);
			// 電話番号
			columnID=mstappr.getColumnID("M_CUST_BASE","TEL");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TEL(columnValue==null?"":columnValue);
			// ＦＡＸ番号
			columnID=mstappr.getColumnID("M_CUST_BASE","FAX");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_FAX(columnValue==null?"":columnValue);
			// 出荷倉庫コード
			columnID=mstappr.getColumnID("M_CUST_BASE","SHIP_WH_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_SHIP_WH_CD(columnValue==null?"":columnValue);
			// 払出預託保管区
			columnID=mstappr.getColumnID("M_CUST_BASE","DEPO_WH_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_DEPO_WH_CD(columnValue==null?"":columnValue);
			// 運送便コード
			columnID=mstappr.getColumnID("M_CUST_BASE","TRANSPORT_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TRANSPORT_CD(columnValue==null?"":columnValue);
			// 運送日数
			columnID=mstappr.getColumnID("M_CUST_BASE","TRANSPORT_LT");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TRANSPORT_LT(columnValue==null?"":columnValue);
			// 営業倉庫フラグ
			columnID=mstappr.getColumnID("M_CUST_BASE","BUSINESS_WH_FLG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BUSINESS_WH_FLG(columnValue==null ? "" : columnValue);
			// 代表フラグ
			columnID=mstappr.getColumnID("M_CUST_BASE","REPRESENT_FLG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REPRESENT_FLG(columnValue==null ? "" : columnValue);
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_DLV_LOC_CD("");
			struct.setd_NEW_DLV_LOC_NAME("");
			struct.setd_NEW_DLV_LOC_KNAME("");
			struct.setd_NEW_DLV_LOC_ENAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
			struct.setd_NEW_SHIP_WH_CD("");
			struct.setd_NEW_DEPO_WH_CD("");
			struct.setd_NEW_TRANSPORT_CD("");
			struct.setd_NEW_TRANSPORT_LT("0");
			struct.setd_NEW_BUSINESS_WH_FLG("");
			struct.setd_NEW_REPRESENT_FLG("");
		}
		
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_DLV_LOC_CD().equals(struct.getd_NEW_DLV_LOC_CD())){
				struct.setd_DLV_LOC_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_DLV_LOC_NAME().equals(struct.getd_NEW_DLV_LOC_NAME())){
				struct.setd_DLV_LOC_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_DLV_LOC_KNAME().equals(struct.getd_NEW_DLV_LOC_KNAME())){
				struct.setd_DLV_LOC_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_DLV_LOC_ENAME().equals(struct.getd_NEW_DLV_LOC_ENAME())){
				struct.setd_DLV_LOC_ENAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())){
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())){
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())){
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())){
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())){
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())){
				struct.setd_TEL_CHANGE(changed);
			}
			if(!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())){
				struct.setd_FAX_CHANGE(changed);
			}
			if(!struct.getd_OLD_SHIP_WH_CD().equals(struct.getd_NEW_SHIP_WH_CD())){
				struct.setd_SHIP_WH_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_DEPO_WH_CD().equals(struct.getd_NEW_DEPO_WH_CD())){
				struct.setd_DEPO_WH_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_TRANSPORT_CD().equals(struct.getd_NEW_TRANSPORT_CD())){
				struct.setd_TRANSPORT_CD_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_TRANSPORT_LT(),struct.getd_NEW_TRANSPORT_LT())!=0){
				struct.setd_TRANSPORT_LT_CHANGE(changed);
			}
			if(!struct.getd_OLD_BUSINESS_WH_FLG().equals(struct.getd_NEW_BUSINESS_WH_FLG())){
				struct.setd_BUSINESS_WH_FLG_CHANGE(changed);
			}
			if(!struct.getd_OLD_REPRESENT_FLG().equals(struct.getd_NEW_REPRESENT_FLG())){
				struct.setd_REPRESENT_FLG_CHANGE(changed);
			}
		}
    }
    /**
     * 為替レート情報メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0120010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             			//会社コード
    		oldStruct.setCUR_CD(keyvalueMap.get("CUR_CD").toString());             					//通貨コード
    		oldStruct.setEXCH_TYP(keyvalueMap.get("EXCH_TYP").toString());             				//為替種別
    		// 為替予約コード
    		if(keyvalueMap.containsKey("EXCH_RESERVE_CD")){
    			oldStruct.setEXCH_RESERVE_CD(keyvalueMap.get("EXCH_RESERVE_CD").toString());            
    		}else{
    			oldStruct.setEXCH_RESERVE_CD("");
    		}
    		
    		oldStruct.setEXCH_START_DATE(keyvalueMap.get("EXCH_START_DATE").toString());            //為替開始日付

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_EXCH_RATE.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUR_CD((oldStruct.getd_OLD_CUR_CD()==null?"":oldStruct.getd_OLD_CUR_CD()));
			struct.setd_OLD_EXCH_TYP((oldStruct.getd_OLD_EXCH_TYP()==null?"":oldStruct.getd_OLD_EXCH_TYP()));
			struct.setd_OLD_EXCH_RESERVE_CD((oldStruct.getd_OLD_EXCH_RESERVE_CD()==null?"":oldStruct.getd_OLD_EXCH_RESERVE_CD()));
			struct.setd_OLD_EXCH_START_DATE((oldStruct.getd_OLD_EXCH_START_DATE()==null?"":oldStruct.getd_OLD_EXCH_START_DATE()));
			struct.setd_OLD_EXCH_RATE((oldStruct.getd_OLD_EXCH_RATE()==null?"":oldStruct.getd_OLD_EXCH_RATE()));
		}else{
			struct.setd_OLD_CUR_CD("");
			struct.setd_OLD_EXCH_TYP("");
			struct.setd_OLD_EXCH_RESERVE_CD("");
			struct.setd_OLD_EXCH_START_DATE("");
			struct.setd_OLD_EXCH_RATE("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 通貨コード；
			columnID = mstappr.getColumnID( "M_EXCH_RATE", "CUR_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUR_CD(columnValue == null?"":columnValue);

			// 為替種別
			columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_TYP(columnValue == null?"":columnValue);

			// 為替予約コード
			columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RESERVE_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_RESERVE_CD(columnValue == null?"":columnValue);

			// 為替開始日付
			columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_START_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_START_DATE(columnValue == null?"":columnValue);

			// 為替レート
			columnID = mstappr.getColumnID( "M_EXCH_RATE", "EXCH_RATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_RATE(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUR_CD("");
			struct.setd_NEW_EXCH_TYP("");
			struct.setd_NEW_EXCH_RESERVE_CD("");
			struct.setd_NEW_EXCH_START_DATE("");
			struct.setd_NEW_EXCH_RATE("0");
		}
		// 為替種別
		struct.setd_OLD_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_OLD_EXCH_TYP()));
		struct.setd_NEW_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_NEW_EXCH_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUR_CD().equals(struct.getd_NEW_CUR_CD())){
				struct.setd_CUR_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_TYP().equals(struct.getd_NEW_EXCH_TYP())){
				struct.setd_EXCH_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_RESERVE_CD().equals(struct.getd_NEW_EXCH_RESERVE_CD())){
				struct.setd_EXCH_RESERVE_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_START_DATE().equals(struct.getd_NEW_EXCH_START_DATE())){
				struct.setd_EXCH_START_DATE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_EXCH_RATE(),struct.getd_NEW_EXCH_RATE())!=0){
				struct.setd_EXCH_RATE_CHANGE(changed);
			}
		}
    }
    /**
     * 得意先メンテナンス（売掛）
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBA0050010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());                      // 取引先コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_CUST_FNAME(oldStruct.getd_OLD_CUST_FNAME()==null?"":oldStruct.getd_OLD_CUST_FNAME());
			struct.setd_OLD_CUST_NAME(oldStruct.getd_OLD_CUST_NAME()==null?"":oldStruct.getd_OLD_CUST_NAME());
			struct.setd_OLD_CUST_ANAME(oldStruct.getd_OLD_CUST_ANAME()==null?"":oldStruct.getd_OLD_CUST_ANAME());
			struct.setd_OLD_CUST_KNAME(oldStruct.getd_OLD_CUST_KNAME()==null?"":oldStruct.getd_OLD_CUST_KNAME());
			struct.setd_OLD_CUST_ENAME(oldStruct.getd_OLD_CUST_ENAME()==null?"":oldStruct.getd_OLD_CUST_ENAME());
			struct.setd_OLD_OWNER_EXECUTIVE((oldStruct.getd_OLD_OWNER_EXECUTIVE()==null?"":oldStruct.getd_OLD_OWNER_EXECUTIVE()));
			struct.setd_OLD_OWNER_NAME((oldStruct.getd_OLD_OWNER_NAME()==null?"":oldStruct.getd_OLD_OWNER_NAME()));
			struct.setd_OLD_OWN_ORG_CD(oldStruct.getd_OLD_OWN_ORG_CD()==null?"":oldStruct.getd_OLD_OWN_ORG_CD());
			struct.setd_OLD_OWN_PERSON_CD(oldStruct.getd_OLD_OWN_PERSON_CD()==null?"":oldStruct.getd_OLD_OWN_PERSON_CD());
			
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_CUST_FNAME("");
			struct.setd_OLD_CUST_NAME("");
			struct.setd_OLD_CUST_ANAME("");
			struct.setd_OLD_CUST_KNAME("");
			struct.setd_OLD_CUST_ENAME("");
			struct.setd_OLD_OWNER_EXECUTIVE("");
			struct.setd_OLD_OWNER_NAME("");
			struct.setd_OLD_OWN_ORG_CD("");
			struct.setd_OLD_OWN_PERSON_CD("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID=mstappr.getColumnID("M_CUST","CUST_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_CD(columnValue==null?"":columnValue);
			// 得意先正式名
			columnID=mstappr.getColumnID("M_CUST","CUST_FNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_FNAME(columnValue==null?"":columnValue);
			// 得意先名
			columnID=mstappr.getColumnID("M_CUST","CUST_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_NAME(columnValue==null?"":columnValue);
			// 得意先名略称	 
			columnID=mstappr.getColumnID("M_CUST","CUST_ANAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_ANAME(columnValue==null?"":columnValue);
			// 得意先名（カナ）
			columnID=mstappr.getColumnID("M_CUST","CUST_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_KNAME(columnValue==null?"":columnValue);
			// 得意先英名
			columnID=mstappr.getColumnID("M_CUST","CUST_ENAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_ENAME(columnValue==null?"":columnValue);
			// 代表者役職名
			columnID=mstappr.getColumnID("M_CUST","OWNER_EXECUTIVE");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWNER_EXECUTIVE(columnValue==null?"":columnValue);
			// 代表者名
			columnID=mstappr.getColumnID("M_CUST","OWNER_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWNER_NAME(columnValue==null?"":columnValue);
			// 自社担当部門コード
			columnID=mstappr.getColumnID("M_CUST","OWN_ORG_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_ORG_CD(columnValue==null?"":columnValue);
			// 自社担当者コード
			columnID=mstappr.getColumnID("M_CUST","OWN_PERSON_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_PERSON_CD(columnValue==null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_CUST_FNAME("");
			struct.setd_NEW_CUST_NAME("");
			struct.setd_NEW_CUST_ANAME("");
			struct.setd_NEW_CUST_KNAME("");
			struct.setd_NEW_CUST_ENAME("");
			struct.setd_NEW_OWNER_EXECUTIVE("");
			struct.setd_NEW_OWNER_NAME("");
			struct.setd_NEW_OWN_ORG_CD("");
			struct.setd_NEW_OWN_PERSON_CD("");
		
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_FNAME().equals(struct.getd_NEW_CUST_FNAME())){
				struct.setd_CUST_FNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_NAME().equals(struct.getd_NEW_CUST_NAME())){
				struct.setd_CUST_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_ANAME().equals(struct.getd_NEW_CUST_ANAME())){
				struct.setd_CUST_ANAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_KNAME().equals(struct.getd_NEW_CUST_KNAME())){
				struct.setd_CUST_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_ENAME().equals(struct.getd_NEW_CUST_ENAME())){
				struct.setd_CUST_ENAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWNER_EXECUTIVE().equals(struct.getd_NEW_OWNER_EXECUTIVE())){
				struct.setd_OWNER_EXECUTIVE_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWNER_NAME().equals(struct.getd_NEW_OWNER_NAME())){
				struct.setd_OWNER_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_ORG_CD().equals(struct.getd_NEW_OWN_ORG_CD())){
				struct.setd_OWN_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_PERSON_CD().equals(struct.getd_NEW_OWN_PERSON_CD())){
				struct.setd_OWN_PERSON_CD_CHANGE(changed);
			}
		}
    }
   
    /**
     * 得意先メンテナンス（売掛）
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBA0050010BRANCH(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());               //会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());               //得意先コード
    		oldStruct.setBRANCH_CD(keyvalueMap.get("BRANCH_CD").toString());               //支店コード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST_BRANCH.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_BRANCH_CD(oldStruct.getd_OLD_BRANCH_CD()==null?"":oldStruct.getd_OLD_BRANCH_CD());
			struct.setd_OLD_BRANCH_FNAME(oldStruct.getd_OLD_BRANCH_FNAME()==null?"":oldStruct.getd_OLD_BRANCH_FNAME());
			struct.setd_OLD_BRANCH_NAME(oldStruct.getd_OLD_BRANCH_NAME()==null?"":oldStruct.getd_OLD_BRANCH_NAME());
			struct.setd_OLD_BRANCH_KNAME(oldStruct.getd_OLD_BRANCH_KNAME()==null?"":oldStruct.getd_OLD_BRANCH_KNAME());
			struct.setd_OLD_BRANCH_ENAME(oldStruct.getd_OLD_BRANCH_ENAME()==null?"":oldStruct.getd_OLD_BRANCH_ENAME());
			struct.setd_OLD_BRANCH_SEQ_CD(oldStruct.getd_OLD_BRANCH_SEQ_CD()==null?"":oldStruct.getd_OLD_BRANCH_SEQ_CD());
			struct.setd_OLD_CHARGE_ORG_NAME(oldStruct.getd_OLD_CHARGE_ORG_NAME()==null?"":oldStruct.getd_OLD_CHARGE_ORG_NAME());
			struct.setd_OLD_CHARGE_PERSON_NAME(oldStruct.getd_OLD_CHARGE_PERSON_NAME()==null?"":oldStruct.getd_OLD_CHARGE_PERSON_NAME());
			struct.setd_OLD_ZIP_CD(oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD());
			struct.setd_OLD_ADDRESS_1(oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1());
			struct.setd_OLD_ADDRESS_2(oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2());
			struct.setd_OLD_ADDRESS_K_1(oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1());
			struct.setd_OLD_ADDRESS_K_2(oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2());
			struct.setd_OLD_TEL(oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL());
			struct.setd_OLD_FAX(oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX());
			struct.setd_OLD_OWN_ORG_CD(oldStruct.getd_OLD_OWN_ORG_CD()==null?"":oldStruct.getd_OLD_OWN_ORG_CD());
			struct.setd_OLD_OWN_PERSON_CD(oldStruct.getd_OLD_OWN_PERSON_CD()==null?"":oldStruct.getd_OLD_OWN_PERSON_CD());
			struct.setd_OLD_EDI_CUST_VEND_CD(oldStruct.getd_OLD_EDI_CUST_VEND_CD()==null?"":oldStruct.getd_OLD_EDI_CUST_VEND_CD());
			struct.setd_OLD_EDI_OWN_VEND_CD(oldStruct.getd_OLD_EDI_OWN_VEND_CD()==null?"":oldStruct.getd_OLD_EDI_OWN_VEND_CD());
			struct.setd_OLD_REMARKS_1(oldStruct.getd_OLD_REMARKS_1()==null?"":oldStruct.getd_OLD_REMARKS_1());
			struct.setd_OLD_REMARKS_2(oldStruct.getd_OLD_REMARKS_2()==null?"":oldStruct.getd_OLD_REMARKS_2());
			struct.setd_OLD_REMARKS_3(oldStruct.getd_OLD_REMARKS_3()==null?"":oldStruct.getd_OLD_REMARKS_3());
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_BRANCH_CD("");
			struct.setd_OLD_BRANCH_FNAME("");
			struct.setd_OLD_BRANCH_NAME("");
			struct.setd_OLD_BRANCH_KNAME("");
			struct.setd_OLD_BRANCH_ENAME("");
			struct.setd_OLD_BRANCH_SEQ_CD("");
			struct.setd_OLD_CHARGE_ORG_NAME("");
			struct.setd_OLD_CHARGE_PERSON_NAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
			struct.setd_OLD_OWN_ORG_CD("");
			struct.setd_OLD_OWN_PERSON_CD("");
			struct.setd_OLD_EDI_CUST_VEND_CD("");
			struct.setd_OLD_EDI_OWN_VEND_CD("");
			struct.setd_OLD_REMARKS_1("");
			struct.setd_OLD_REMARKS_2("");
			struct.setd_OLD_REMARKS_3("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","CUST_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_CD(columnValue==null?"":columnValue);
			// 支店コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_CD(columnValue==null?"":columnValue);
			// 支店正式名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_FNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_FNAME(columnValue==null?"":columnValue);
			// 支店名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_NAME(columnValue==null?"":columnValue);
			// 支店名（カナ）
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_KNAME(columnValue==null?"":columnValue);
			// 支店名（英名）
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_ENAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_ENAME(columnValue==null?"":columnValue);
			// 支店昇順
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_SEQ_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_SEQ_CD(columnValue==null?"":columnValue);
			// 担当者所属部門名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","CHARGE_ORG_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CHARGE_ORG_NAME(columnValue==null?"":columnValue);
			// 担当者名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","CHARGE_PERSON_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CHARGE_PERSON_NAME(columnValue==null?"":columnValue);
			// 郵便番号
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ZIP_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ZIP_CD(columnValue==null?"":columnValue);
			// 住所１
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_1(columnValue==null?"":columnValue);
			// 住所２
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_2(columnValue==null?"":columnValue);
			// 住所（カナ）１
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_K_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue==null?"":columnValue);
			// 住所（カナ）２
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_K_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue==null?"":columnValue);
			// 電話番号
			columnID=mstappr.getColumnID("M_CUST_BRANCH","TEL");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TEL(columnValue==null?"":columnValue);
			// ＦＡＸ番号
			columnID=mstappr.getColumnID("M_CUST_BRANCH","FAX");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_FAX(columnValue==null?"":columnValue);
			// 自社担当部門コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","OWN_ORG_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_ORG_CD(columnValue==null?"":columnValue);
			// 自社担当者コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","OWN_PERSON_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_PERSON_CD(columnValue==null?"":columnValue);
			// ＥＤＩ相手取引先コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","EDI_CUST_VEND_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EDI_CUST_VEND_CD(columnValue==null?"":columnValue);
			// ＥＤＩ自社取引先コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","EDI_OWN_VEND_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EDI_OWN_VEND_CD(columnValue==null?"":columnValue);
			// 備考１
			columnID=mstappr.getColumnID("M_CUST_BRANCH","REMARKS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REMARKS_1(columnValue==null?"":columnValue);
			// 備考２
			columnID=mstappr.getColumnID("M_CUST_BRANCH","REMARKS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REMARKS_2(columnValue==null?"":columnValue);
			// 備考３
			columnID=mstappr.getColumnID("M_CUST_BRANCH","REMARKS_3");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REMARKS_3(columnValue==null?"":columnValue);


		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_BRANCH_CD("");
			struct.setd_NEW_BRANCH_FNAME("");
			struct.setd_NEW_BRANCH_NAME("");
			struct.setd_NEW_BRANCH_KNAME("");
			struct.setd_NEW_BRANCH_ENAME("");
			struct.setd_NEW_BRANCH_SEQ_CD("");
			struct.setd_NEW_CHARGE_ORG_NAME("");
			struct.setd_NEW_CHARGE_PERSON_NAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
			struct.setd_NEW_OWN_ORG_CD("");
			struct.setd_NEW_OWN_PERSON_CD("");
			struct.setd_NEW_EDI_CUST_VEND_CD("");
			struct.setd_NEW_EDI_OWN_VEND_CD("");
			struct.setd_NEW_REMARKS_1("");
			struct.setd_NEW_REMARKS_2("");
			struct.setd_NEW_REMARKS_3("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_CD().equals(struct.getd_NEW_BRANCH_CD())){
				struct.setd_BRANCH_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_FNAME().equals(struct.getd_NEW_BRANCH_FNAME())){
				struct.setd_BRANCH_FNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_NAME().equals(struct.getd_NEW_BRANCH_NAME())){
				struct.setd_BRANCH_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_KNAME().equals(struct.getd_NEW_BRANCH_KNAME())){
				struct.setd_BRANCH_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_ENAME().equals(struct.getd_NEW_BRANCH_ENAME())){
				struct.setd_BRANCH_ENAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_SEQ_CD().equals(struct.getd_NEW_BRANCH_SEQ_CD())){
				struct.setd_BRANCH_SEQ_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CHARGE_ORG_NAME().equals(struct.getd_NEW_CHARGE_ORG_NAME())){
				struct.setd_CHARGE_ORG_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CHARGE_PERSON_NAME().equals(struct.getd_NEW_CHARGE_PERSON_NAME())){
				struct.setd_CHARGE_PERSON_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())){
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())){
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())){
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())){
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())){
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())){
				struct.setd_TEL_CHANGE(changed);
			}
			if(!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())){
				struct.setd_FAX_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_ORG_CD().equals(struct.getd_NEW_OWN_ORG_CD())){
				struct.setd_OWN_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_PERSON_CD().equals(struct.getd_NEW_OWN_PERSON_CD())){
				struct.setd_OWN_PERSON_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EDI_CUST_VEND_CD().equals(struct.getd_NEW_EDI_CUST_VEND_CD())){
				struct.setd_EDI_CUST_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EDI_OWN_VEND_CD().equals(struct.getd_NEW_EDI_OWN_VEND_CD())){
				struct.setd_EDI_OWN_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_REMARKS_1().equals(struct.getd_NEW_REMARKS_1())){
				struct.setd_REMARKS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_REMARKS_2().equals(struct.getd_NEW_REMARKS_2())){
				struct.setd_REMARKS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_REMARKS_3().equals(struct.getd_NEW_REMARKS_3())){
				struct.setd_REMARKS_3_CHANGE(changed);
			}
		}
    }
    
    /**
     * 会社メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0010010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_COMPANY.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_COMPANY_CD((oldStruct.getd_OLD_COMPANY_CD()==null?"":oldStruct.getd_OLD_COMPANY_CD()));
			struct.setd_OLD_COMPANY_FNAME((oldStruct.getd_OLD_COMPANY_FNAME()==null?"":oldStruct.getd_OLD_COMPANY_FNAME()));
			struct.setd_OLD_COMPANY_NAME((oldStruct.getd_OLD_COMPANY_NAME()==null?"":oldStruct.getd_OLD_COMPANY_NAME()));
			struct.setd_OLD_COMPANY_KNAME((oldStruct.getd_OLD_COMPANY_KNAME()==null?"":oldStruct.getd_OLD_COMPANY_KNAME()));
			struct.setd_OLD_COMPANY_ENAME((oldStruct.getd_OLD_COMPANY_ENAME()==null?"":oldStruct.getd_OLD_COMPANY_ENAME()));
			struct.setd_OLD_ZIP_CD((oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD()));
			struct.setd_OLD_ADDRESS_1((oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1()));
			struct.setd_OLD_ADDRESS_2((oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2()));
			struct.setd_OLD_ADDRESS_K_1((oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1()));
			struct.setd_OLD_ADDRESS_K_2((oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2()));
			struct.setd_OLD_TEL((oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL()));
			struct.setd_OLD_FAX((oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX()));
		}else{
			struct.setd_OLD_COMPANY_CD("");
			struct.setd_OLD_COMPANY_FNAME("");
			struct.setd_OLD_COMPANY_NAME("");
			struct.setd_OLD_COMPANY_KNAME("");
			struct.setd_OLD_COMPANY_ENAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 会社コード
			columnID = mstappr.getColumnID( "M_COMPANY", "COMPANY_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_COMPANY_CD(columnValue == null?"":columnValue);

			// 会社正式名
			columnID = mstappr.getColumnID( "M_COMPANY", "COMPANY_FNAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_COMPANY_FNAME(columnValue == null?"":columnValue);

			// 会社名
			columnID = mstappr.getColumnID( "M_COMPANY", "COMPANY_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_COMPANY_NAME(columnValue == null?"":columnValue);

			// 会社名（カナ）
			columnID = mstappr.getColumnID( "M_COMPANY", "COMPANY_KNAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_COMPANY_KNAME(columnValue == null?"":columnValue);

			// 会社名（英名）
			columnID = mstappr.getColumnID( "M_COMPANY", "COMPANY_ENAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_COMPANY_ENAME(columnValue == null?"":columnValue);

			// 郵便番号
			columnID = mstappr.getColumnID( "M_COMPANY", "ZIP_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ZIP_CD(columnValue == null?"":columnValue);

			// 住所１
			columnID = mstappr.getColumnID( "M_COMPANY", "ADDRESS_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_1(columnValue == null?"":columnValue);

			// 住所２
			columnID = mstappr.getColumnID( "M_COMPANY", "ADDRESS_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_2(columnValue == null?"":columnValue);

			// 住所（カナ）１
			columnID = mstappr.getColumnID( "M_COMPANY", "ADDRESS_K_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue == null?"":columnValue);

			// 住所（カナ）２
			columnID = mstappr.getColumnID( "M_COMPANY", "ADDRESS_K_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue == null?"":columnValue);

			// 電話番号
			columnID = mstappr.getColumnID( "M_COMPANY", "TEL");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TEL(columnValue == null?"":columnValue);

			// ＦＡＸ番号
			columnID = mstappr.getColumnID( "M_COMPANY", "FAX");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FAX(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_COMPANY_CD("");
			struct.setd_NEW_COMPANY_FNAME("");
			struct.setd_NEW_COMPANY_NAME("");
			struct.setd_NEW_COMPANY_KNAME("");
			struct.setd_NEW_COMPANY_ENAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_COMPANY_CD().equals(struct.getd_NEW_COMPANY_CD())) {
				struct.setd_COMPANY_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_COMPANY_FNAME().equals(struct.getd_NEW_COMPANY_FNAME())) {
				struct.setd_COMPANY_FNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_COMPANY_NAME().equals(struct.getd_NEW_COMPANY_NAME())) {
				struct.setd_COMPANY_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_COMPANY_KNAME().equals(struct.getd_NEW_COMPANY_KNAME())) {
				struct.setd_COMPANY_KNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_COMPANY_ENAME().equals(struct.getd_NEW_COMPANY_ENAME())) {
				struct.setd_COMPANY_ENAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())) {
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())) {
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())) {
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())) {
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())) {
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())) {
				struct.setd_TEL_CHANGE(changed);
			}
			if (!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())) {
				struct.setd_FAX_CHANGE(changed);
			}
		}
    }
    
    /**
     * 利用者所属会社メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0020010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setUSER_CD(keyvalueMap.get("USER_CD").toString());                // 会社コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_USER_COMPANY.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_USER_CD((oldStruct.getd_OLD_USER_CD()==null?"":oldStruct.getd_OLD_USER_CD()));
			struct.setd_OLD_COMPANY_CD((oldStruct.getd_OLD_COMPANY_CD()==null?"":oldStruct.getd_OLD_COMPANY_CD()));
			struct.setd_OLD_USER_TYP((oldStruct.getd_OLD_USER_TYP()==null?"":oldStruct.getd_OLD_USER_TYP()));
		}else{
			struct.setd_OLD_USER_CD("");
			struct.setd_OLD_COMPANY_CD("");
			struct.setd_OLD_USER_TYP("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 利用者コード
			columnID = mstappr.getColumnID( "M_USER_COMPANY", "USER_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_USER_CD(columnValue == null?"":columnValue);

			// 会社コード
			columnID = mstappr.getColumnID( "M_USER_COMPANY", "COMPANY_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_COMPANY_CD(columnValue == null?"":columnValue);

			// 利用者区分
			columnID = mstappr.getColumnID( "M_USER_COMPANY", "USER_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_USER_TYP(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_USER_CD("");
			struct.setd_NEW_COMPANY_CD("");
			struct.setd_NEW_USER_TYP("");
		}

		// 利用者区分
		struct.setd_OLD_USER_TYP(getTypeName(_USER_TYP,struct.getd_OLD_USER_TYP()));
		struct.setd_NEW_USER_TYP(getTypeName(_USER_TYP,struct.getd_NEW_USER_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_USER_CD().equals(struct.getd_NEW_USER_CD())){
				struct.setd_USER_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_COMPANY_CD().equals(struct.getd_NEW_COMPANY_CD())){
				struct.setd_COMPANY_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_USER_TYP().equals(struct.getd_NEW_USER_TYP())){
				struct.setd_USER_TYP_CHANGE(changed);
			}
		}
    }
    /**
     * 銀行メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0050010H(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setBANK_CD(keyvalueMap.get("BANK_CD").toString());                // 銀行コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_BANK_H.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_BANK_CD((oldStruct.getd_OLD_BANK_CD()==null?"":oldStruct.getd_OLD_BANK_CD()));
			struct.setd_OLD_BANK_NAME((oldStruct.getd_OLD_BANK_NAME()==null?"":oldStruct.getd_OLD_BANK_NAME()));
			struct.setd_OLD_BANK_ANAME((oldStruct.getd_OLD_BANK_ANAME()==null?"":oldStruct.getd_OLD_BANK_ANAME()));
			struct.setd_OLD_BANK_KNAME((oldStruct.getd_OLD_BANK_KNAME()==null?"":oldStruct.getd_OLD_BANK_KNAME()));
			struct.setd_OLD_BANK_ENAME((oldStruct.getd_OLD_BANK_ENAME()==null?"":oldStruct.getd_OLD_BANK_ENAME()));
			struct.setd_OLD_BANK_FB_NAME((oldStruct.getd_OLD_BANK_FB_NAME()==null?"":oldStruct.getd_OLD_BANK_FB_NAME()));
		}else{
			struct.setd_OLD_BANK_CD("");
			struct.setd_OLD_BANK_NAME("");
			struct.setd_OLD_BANK_ANAME("");
			struct.setd_OLD_BANK_KNAME("");
			struct.setd_OLD_BANK_ENAME("");
			struct.setd_OLD_BANK_FB_NAME("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 銀行コード
			columnID = mstappr.getColumnID( "M_BANK_H", "BANK_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_CD(columnValue == null?"":columnValue);

			// 銀行名
			columnID = mstappr.getColumnID( "M_BANK_H", "BANK_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_NAME(columnValue == null?"":columnValue);

			// 銀行略名
			columnID = mstappr.getColumnID( "M_BANK_H", "BANK_ANAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_ANAME(columnValue == null?"":columnValue);

			// 銀行名（カナ）
			columnID = mstappr.getColumnID( "M_BANK_H", "BANK_KNAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_KNAME(columnValue == null?"":columnValue);

			// 銀行名（英名）
			columnID = mstappr.getColumnID( "M_BANK_H", "BANK_ENAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_ENAME(columnValue == null?"":columnValue);

			// 銀行名（ＦＢ）
			columnID = mstappr.getColumnID( "M_BANK_H", "BANK_FB_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_FB_NAME(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_BANK_CD("");
			struct.setd_NEW_BANK_NAME("");
			struct.setd_NEW_BANK_ANAME("");
			struct.setd_NEW_BANK_KNAME("");
			struct.setd_NEW_BANK_ENAME("");
			struct.setd_NEW_BANK_FB_NAME("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_BANK_CD().equals(struct.getd_NEW_BANK_CD())){
				struct.setd_BANK_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_BANK_NAME().equals(struct.getd_NEW_BANK_NAME())){
				struct.setd_BANK_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BANK_ANAME().equals(struct.getd_NEW_BANK_ANAME())){
				struct.setd_BANK_ANAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BANK_KNAME().equals(struct.getd_NEW_BANK_KNAME())){
				struct.setd_BANK_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BANK_ENAME().equals(struct.getd_NEW_BANK_ENAME())){
				struct.setd_BANK_ENAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BANK_FB_NAME().equals(struct.getd_NEW_BANK_FB_NAME())){
				struct.setd_BANK_FB_NAME_CHANGE(changed);
			}
		}
    }
    /**
     * 銀行メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0050010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
   	
    if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setBANK_CD(keyvalueMap.get("BANK_CD").toString());                	// 銀行コード
    		oldStruct.setBANK_BR_CD(keyvalueMap.get("BANK_BR_CD").toString());                	// 銀行支店コード
           // 変更前データリストを取得
    		oldDateList = commonEntity.mselectM_BANK.read(conn, oldStruct);
    	}
		//　変更前データオブジェクトを設定
	if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_BANK_CD(oldStruct.getd_OLD_BANK_CD()==null?"":oldStruct.getd_OLD_BANK_CD());
			struct.setd_OLD_BANK_BR_CD(oldStruct.getd_OLD_BANK_BR_CD()==null?"":oldStruct.getd_OLD_BANK_BR_CD());
			struct.setd_OLD_CAL_NO(oldStruct.getd_OLD_CAL_NO()==null?"":oldStruct.getd_OLD_CAL_NO());
			struct.setd_OLD_BANK_BR_NAME(oldStruct.getd_OLD_BANK_BR_NAME()==null?"":oldStruct.getd_OLD_BANK_BR_NAME());
			struct.setd_OLD_BANK_BR_ANAME(oldStruct.getd_OLD_BANK_BR_ANAME()==null?"":oldStruct.getd_OLD_BANK_BR_ANAME());
			struct.setd_OLD_BANK_BR_KNAME(oldStruct.getd_OLD_BANK_BR_KNAME()==null?"":oldStruct.getd_OLD_BANK_BR_KNAME());
			struct.setd_OLD_BANK_BR_ENAME(oldStruct.getd_OLD_BANK_BR_ENAME()==null?"":oldStruct.getd_OLD_BANK_BR_ENAME());
			struct.setd_OLD_BANK_BR_FB_NAME(oldStruct.getd_OLD_BANK_BR_FB_NAME()==null?"":oldStruct.getd_OLD_BANK_BR_FB_NAME());
			struct.setd_OLD_BANK_BR_CNAME(oldStruct.getd_OLD_BANK_BR_CNAME()==null?"":oldStruct.getd_OLD_BANK_BR_CNAME());
			struct.setd_OLD_BANK_BR_ECNAME(oldStruct.getd_OLD_BANK_BR_ECNAME()==null?"":oldStruct.getd_OLD_BANK_BR_ECNAME());
			struct.setd_OLD_ZIP_CD(oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD());
			struct.setd_OLD_ADDRESS_1(oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1());
			struct.setd_OLD_ADDRESS_2(oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2());
			struct.setd_OLD_ADDRESS_K_1(oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1());
			struct.setd_OLD_ADDRESS_K_2(oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2());
			struct.setd_OLD_TEL(oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL());
			struct.setd_OLD_FAX(oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX());
		}else{
			struct.setd_OLD_BANK_CD("");
			struct.setd_OLD_BANK_BR_CD("");
			struct.setd_OLD_CAL_NO("");
			struct.setd_OLD_BANK_BR_NAME("");
			struct.setd_OLD_BANK_BR_ANAME("");
			struct.setd_OLD_BANK_BR_KNAME("");
			struct.setd_OLD_BANK_BR_ENAME("");
			struct.setd_OLD_BANK_BR_FB_NAME("");
			struct.setd_OLD_BANK_BR_CNAME("");
			struct.setd_OLD_BANK_BR_ECNAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");

		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			//銀行コード
			columnID=mstappr.getColumnID("M_BANK","BANK_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_CD(columnValue==null?"":columnValue);
			// 銀行支店コード
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_CD(columnValue==null?"":columnValue);
			// カレンダ番号
			columnID=mstappr.getColumnID("M_BANK","CAL_NO");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CAL_NO(columnValue==null?"":columnValue);
			// 銀行支店名
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_NAME(columnValue==null?"":columnValue);
			// 銀行支店略名
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_ANAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_ANAME(columnValue==null?"":columnValue);
			// 銀行支店名（カナ）
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_KNAME(columnValue==null?"":columnValue);
			// 銀行支店名（英名）
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_ENAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_ENAME(columnValue==null?"":columnValue);
			// 銀行支店名（ＦＢ）
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_FB_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_FB_NAME(columnValue==null?"":columnValue);
			// 銀行支店名称
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_CNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_CNAME(columnValue==null?"":columnValue);
			// 銀行支店名称（英名）
			columnID=mstappr.getColumnID("M_BANK","BANK_BR_ECNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BANK_BR_ECNAME(columnValue==null?"":columnValue);
			// 郵便番号
			columnID=mstappr.getColumnID("M_BANK","ZIP_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ZIP_CD(columnValue==null?"":columnValue);
			// 住所1
			columnID=mstappr.getColumnID("M_BANK","ADDRESS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_1(columnValue==null?"":columnValue);
			// 住所２
			columnID=mstappr.getColumnID("M_BANK","ADDRESS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_2(columnValue==null?"":columnValue);
			// 住所（カナ）１
			columnID=mstappr.getColumnID("M_BANK","ADDRESS_K_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue==null?"":columnValue);
			// 住所（カナ）２
			columnID=mstappr.getColumnID("M_BANK","ADDRESS_K_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue==null?"":columnValue);
			// 電話番号
			columnID=mstappr.getColumnID("M_BANK","TEL");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TEL(columnValue==null?"":columnValue);
			// ＦＡＸ番号
			columnID=mstappr.getColumnID("M_BANK","FAX");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_FAX(columnValue==null?"":columnValue);

		}
		else{
			struct.setd_NEW_BANK_CD("");
			struct.setd_NEW_BANK_BR_CD("");
			struct.setd_NEW_CAL_NO("");
			struct.setd_NEW_BANK_BR_NAME("");
			struct.setd_NEW_BANK_BR_ANAME("");
			struct.setd_NEW_BANK_BR_KNAME("");
			struct.setd_NEW_BANK_BR_ENAME("");
			struct.setd_NEW_BANK_BR_FB_NAME("");
			struct.setd_NEW_BANK_BR_CNAME("");
			struct.setd_NEW_BANK_BR_ECNAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_BANK_CD().equals(struct.getd_NEW_BANK_CD())) {
				struct.setd_BANK_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_CD().equals(struct.getd_NEW_BANK_BR_CD())) {
				struct.setd_BANK_BR_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_CAL_NO().equals(struct.getd_NEW_CAL_NO())) {
				struct.setd_CAL_NO_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_NAME().equals(struct.getd_NEW_BANK_BR_NAME())) {
				struct.setd_BANK_BR_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_ANAME().equals(struct.getd_NEW_BANK_BR_ANAME())) {
				struct.setd_BANK_BR_ANAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_KNAME().equals(
					struct.getd_NEW_BANK_BR_KNAME())) {
				struct.setd_BANK_BR_KNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_ENAME().equals(struct.getd_NEW_BANK_BR_ENAME())) {
				struct.setd_BANK_BR_ENAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_FB_NAME().equals(struct.getd_NEW_BANK_BR_FB_NAME())) {
				struct.setd_BANK_BR_FB_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_CNAME().equals(struct.getd_NEW_BANK_BR_CNAME())) {
				struct.setd_BANK_BR_CNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_BANK_BR_ECNAME().equals(struct.getd_NEW_BANK_BR_ECNAME())) {
				struct.setd_BANK_BR_ECNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())) {
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())) {
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())) {
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())) {
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())) {
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())) {
				struct.setd_TEL_CHANGE(changed);
			}
			if (!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())) {
				struct.setd_FAX_CHANGE(changed);
			}

		}
   }
    /**
     * 銀行口座メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0110010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setB_ACCT_CTRL_CD(keyvalueMap.get("B_ACCT_CTRL_CD").toString());                // 口座管理コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_B_ACCT.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_B_ACCT_CTRL_CD((oldStruct.getd_OLD_B_ACCT_CTRL_CD()==null?"":oldStruct.getd_OLD_B_ACCT_CTRL_CD()));
			struct.setd_OLD_B_ACCT_MNG_NAME((oldStruct.getd_OLD_B_ACCT_MNG_NAME()==null?"":oldStruct.getd_OLD_B_ACCT_MNG_NAME()));
			struct.setd_OLD_BANK_CD((oldStruct.getd_OLD_BANK_CD()==null?"":oldStruct.getd_OLD_BANK_CD()));
			struct.setd_OLD_BANK_BR_CD((oldStruct.getd_OLD_BANK_BR_CD()==null?"":oldStruct.getd_OLD_BANK_BR_CD()));
			struct.setd_OLD_B_ACCT_TYP_CD((oldStruct.getd_OLD_B_ACCT_TYP_CD()==null?"":oldStruct.getd_OLD_B_ACCT_TYP_CD()));
			struct.setd_OLD_B_ACCT_NO((oldStruct.getd_OLD_B_ACCT_NO()==null?"":oldStruct.getd_OLD_B_ACCT_NO()));
			struct.setd_OLD_B_ACCT_NAME((oldStruct.getd_OLD_B_ACCT_NAME()==null?"":oldStruct.getd_OLD_B_ACCT_NAME()));
			struct.setd_OLD_FB_DATA_TYP((oldStruct.getd_OLD_FB_DATA_TYP()==null?"":oldStruct.getd_OLD_FB_DATA_TYP()));
			struct.setd_OLD_TRF_REQUEST_CD((oldStruct.getd_OLD_TRF_REQUEST_CD()==null?"":oldStruct.getd_OLD_TRF_REQUEST_CD()));
			struct.setd_OLD_B_ACCT_FB_NAME((oldStruct.getd_OLD_B_ACCT_FB_NAME()==null?"":oldStruct.getd_OLD_B_ACCT_FB_NAME()));
		}else{
			struct.setd_OLD_B_ACCT_CTRL_CD("");
			struct.setd_OLD_B_ACCT_MNG_NAME("");
			struct.setd_OLD_BANK_CD("");
			struct.setd_OLD_BANK_BR_CD("");
			struct.setd_OLD_B_ACCT_TYP_CD("");
			struct.setd_OLD_B_ACCT_NO("");
			struct.setd_OLD_B_ACCT_NAME("");
			struct.setd_OLD_FB_DATA_TYP("");
			struct.setd_OLD_TRF_REQUEST_CD("");
			struct.setd_OLD_B_ACCT_FB_NAME("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 口座管理コード
			columnID = mstappr.getColumnID( "M_B_ACCT", "B_ACCT_CTRL_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_B_ACCT_CTRL_CD(columnValue == null?"":columnValue);

			// 口座管理名称
			columnID = mstappr.getColumnID( "M_B_ACCT", "B_ACCT_MNG_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_B_ACCT_MNG_NAME(columnValue == null?"":columnValue);

			// 銀行コード
			columnID = mstappr.getColumnID( "M_B_ACCT", "BANK_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_CD(columnValue == null?"":columnValue);

			// 銀行支店コード
			columnID = mstappr.getColumnID( "M_B_ACCT", "BANK_BR_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_BR_CD(columnValue == null?"":columnValue);

			// 口座種別コード
			columnID = mstappr.getColumnID( "M_B_ACCT", "B_ACCT_TYP_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_B_ACCT_TYP_CD(columnValue == null?"":columnValue);

			// 口座番号
			columnID = mstappr.getColumnID( "M_B_ACCT", "B_ACCT_NO");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_B_ACCT_NO(columnValue == null?"":columnValue);

			// 口座名称
			columnID = mstappr.getColumnID( "M_B_ACCT", "B_ACCT_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_B_ACCT_NAME(columnValue == null?"":columnValue);

			//	ＦＢデータ区分
			columnID = mstappr.getColumnID( "M_B_ACCT", "FB_DATA_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FB_DATA_TYP(columnValue == null?"":columnValue);

			// 振込依頼人コード
			columnID = mstappr.getColumnID( "M_B_ACCT", "TRF_REQUEST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TRF_REQUEST_CD(columnValue == null?"":columnValue);

			// 口座名称（ＦＢ）
			columnID = mstappr.getColumnID( "M_B_ACCT", "B_ACCT_FB_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_B_ACCT_FB_NAME(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_B_ACCT_CTRL_CD("");
			struct.setd_NEW_B_ACCT_MNG_NAME("");
			struct.setd_NEW_BANK_CD("");
			struct.setd_NEW_BANK_BR_CD("");
			struct.setd_NEW_B_ACCT_TYP_CD("");
			struct.setd_NEW_B_ACCT_NO("");
			struct.setd_NEW_B_ACCT_NAME("");
			struct.setd_NEW_FB_DATA_TYP("");
			struct.setd_NEW_TRF_REQUEST_CD("");
			struct.setd_NEW_B_ACCT_FB_NAME("");
		}
		
		// ＦＢデータ区分
		struct.setd_OLD_FB_DATA_TYP(getTypeName(_FB_DATA_TYP,struct.getd_OLD_FB_DATA_TYP()));
		struct.setd_NEW_FB_DATA_TYP(getTypeName(_FB_DATA_TYP,struct.getd_NEW_FB_DATA_TYP()));
		
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_B_ACCT_CTRL_CD().equals(struct.getd_NEW_B_ACCT_CTRL_CD())){
				struct.setd_B_ACCT_CTRL_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_B_ACCT_MNG_NAME().equals(struct.getd_NEW_B_ACCT_MNG_NAME())){
				struct.setd_B_ACCT_MNG_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BANK_CD().equals(struct.getd_NEW_BANK_CD())){
				struct.setd_BANK_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_BANK_BR_CD().equals(struct.getd_NEW_BANK_BR_CD())){
				struct.setd_BANK_BR_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_B_ACCT_TYP_CD().equals(struct.getd_NEW_B_ACCT_TYP_CD())){
				struct.setd_B_ACCT_TYP_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_B_ACCT_NO().equals(struct.getd_NEW_B_ACCT_NO())){
				struct.setd_B_ACCT_NO_CHANGE(changed);
			}
			if(!struct.getd_OLD_B_ACCT_NAME().equals(struct.getd_NEW_B_ACCT_NAME())){
				struct.setd_B_ACCT_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_FB_DATA_TYP().equals(struct.getd_NEW_FB_DATA_TYP())){
				struct.setd_FB_DATA_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_TRF_REQUEST_CD().equals(struct.getd_NEW_TRF_REQUEST_CD())){
				struct.setd_TRF_REQUEST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_B_ACCT_FB_NAME().equals(struct.getd_NEW_B_ACCT_FB_NAME())){
				struct.setd_B_ACCT_FB_NAME_CHANGE(changed);
			}
		}
    }
    /**
     * 再評価為替レートメンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0210010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             				//会社コード
    		oldStruct.setCUR_CD(keyvalueMap.get("CUR_CD").toString());             						//通貨コード
    		oldStruct.setEXCH_TYP(keyvalueMap.get("EXCH_TYP").toString());             					//為替種別
    		// 為替予約コード
    		if(keyvalueMap.containsKey("EXCH_RESERVE_CD")){
    			oldStruct.setEXCH_RESERVE_CD(keyvalueMap.get("EXCH_RESERVE_CD").toString());            
    		}else{
    			oldStruct.setEXCH_RESERVE_CD("");
    		}
    		oldStruct.setEXCH_START_DATE(keyvalueMap.get("EXCH_START_DATE").toString());             	//為替開始日付

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_REVAL_EXCH_RATE.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUR_CD((oldStruct.getd_OLD_CUR_CD()==null?"":oldStruct.getd_OLD_CUR_CD()));
			struct.setd_OLD_EXCH_TYP((oldStruct.getd_OLD_EXCH_TYP()==null?"":oldStruct.getd_OLD_EXCH_TYP()));
			struct.setd_OLD_EXCH_RESERVE_CD((oldStruct.getd_OLD_EXCH_RESERVE_CD()==null?"":oldStruct.getd_OLD_EXCH_RESERVE_CD()));
			struct.setd_OLD_EXCH_START_DATE((oldStruct.getd_OLD_EXCH_START_DATE()==null?"":oldStruct.getd_OLD_EXCH_START_DATE()));
			struct.setd_OLD_EXCH_RATE((oldStruct.getd_OLD_EXCH_RATE()==null?"":oldStruct.getd_OLD_EXCH_RATE()));
		}else{
			struct.setd_OLD_CUR_CD("");
			struct.setd_OLD_EXCH_TYP("");
			struct.setd_OLD_EXCH_RESERVE_CD("");
			struct.setd_OLD_EXCH_START_DATE("");
			struct.setd_OLD_EXCH_RATE("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 通貨コード；
			columnID = mstappr.getColumnID( "M_REVAL_EXCH_RATE", "CUR_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUR_CD(columnValue == null?"":columnValue);

			// 為替種別
			columnID = mstappr.getColumnID( "M_REVAL_EXCH_RATE", "EXCH_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_TYP(columnValue == null?"":columnValue);

			// 為替予約コード
			columnID = mstappr.getColumnID( "M_REVAL_EXCH_RATE", "EXCH_RESERVE_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_RESERVE_CD(columnValue == null?"":columnValue);

			// 為替開始日付
			columnID = mstappr.getColumnID( "M_REVAL_EXCH_RATE", "EXCH_START_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_START_DATE(columnValue == null?"":columnValue);

			// 為替レート
			columnID = mstappr.getColumnID( "M_REVAL_EXCH_RATE", "EXCH_RATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_RATE(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUR_CD("");
			struct.setd_NEW_EXCH_TYP("");
			struct.setd_NEW_EXCH_RESERVE_CD("");
			struct.setd_NEW_EXCH_START_DATE("");
			struct.setd_NEW_EXCH_RATE("0");
		}

		// 為替種別
		struct.setd_OLD_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_OLD_EXCH_TYP()));
		struct.setd_NEW_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_NEW_EXCH_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUR_CD().equals(struct.getd_NEW_CUR_CD())){
				struct.setd_CUR_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_TYP().equals(struct.getd_NEW_EXCH_TYP())){
				struct.setd_EXCH_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_RESERVE_CD().equals(struct.getd_NEW_EXCH_RESERVE_CD())){
				struct.setd_EXCH_RESERVE_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EXCH_START_DATE().equals(struct.getd_NEW_EXCH_START_DATE())){
				struct.setd_EXCH_START_DATE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_EXCH_RATE(),struct.getd_NEW_EXCH_RATE())!=0){
				struct.setd_EXCH_RATE_CHANGE(changed);
			}
		}
    }
    /**
     * 科目メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0250010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             	//会社コード
    		oldStruct.setACCT_CD(keyvalueMap.get("ACCT_CD").toString());             		//科目コード
    		oldStruct.setSUB_ACCT_CD(keyvalueMap.get("SUB_ACCT_CD").toString());            //補助区分コード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_ACCT.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ACCT_CD((oldStruct.getd_OLD_ACCT_CD()==null?"":oldStruct.getd_OLD_ACCT_CD()));
			struct.setd_OLD_SUB_ACCT_CD((oldStruct.getd_OLD_SUB_ACCT_CD()==null?"":oldStruct.getd_OLD_SUB_ACCT_CD()));
			struct.setd_OLD_ACCT_NAME((oldStruct.getd_OLD_ACCT_NAME()==null?"":oldStruct.getd_OLD_ACCT_NAME()));
			struct.setd_OLD_ACCT_ANAME((oldStruct.getd_OLD_ACCT_ANAME()==null?"":oldStruct.getd_OLD_ACCT_ANAME()));
			struct.setd_OLD_ACCT_KNAME((oldStruct.getd_OLD_ACCT_KNAME()==null?"":oldStruct.getd_OLD_ACCT_KNAME()));
			struct.setd_OLD_PRIMITIVE_TYP((oldStruct.getd_OLD_PRIMITIVE_TYP()==null?"":oldStruct.getd_OLD_PRIMITIVE_TYP()));
			struct.setd_OLD_DR_CR_TYP((oldStruct.getd_OLD_DR_CR_TYP()==null?"":oldStruct.getd_OLD_DR_CR_TYP()));
			struct.setd_OLD_ACCT_TYP((oldStruct.getd_OLD_ACCT_TYP()==null?"":oldStruct.getd_OLD_ACCT_TYP()));
			struct.setd_OLD_SUB_ACCT_TYP_DEFAULT((oldStruct.getd_OLD_SUB_ACCT_TYP_DEFAULT()==null?"":oldStruct.getd_OLD_SUB_ACCT_TYP_DEFAULT()));
			struct.setd_OLD_INTERNAL_TRN_TYP((oldStruct.getd_OLD_INTERNAL_TRN_TYP()==null?"":oldStruct.getd_OLD_INTERNAL_TRN_TYP()));
		}else{
			struct.setd_OLD_ACCT_CD("");
			struct.setd_OLD_SUB_ACCT_CD("");
			struct.setd_OLD_ACCT_NAME("");
			struct.setd_OLD_ACCT_ANAME("");
			struct.setd_OLD_ACCT_KNAME("");
			struct.setd_OLD_PRIMITIVE_TYP("");
			struct.setd_OLD_DR_CR_TYP("");
			struct.setd_OLD_ACCT_TYP("");
			struct.setd_OLD_SUB_ACCT_TYP_DEFAULT("");
			struct.setd_OLD_INTERNAL_TRN_TYP("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 科目コード
			columnID = mstappr.getColumnID( "M_ACCT", "ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_CD(columnValue == null?"":columnValue);

			// 補助区分コード
			columnID = mstappr.getColumnID( "M_ACCT", "SUB_ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SUB_ACCT_CD(columnValue == null?"":columnValue);

			// 科目名
			columnID = mstappr.getColumnID( "M_ACCT", "ACCT_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_NAME(columnValue == null?"":columnValue);

			// 科目略名
			columnID = mstappr.getColumnID( "M_ACCT", "ACCT_ANAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_ANAME(columnValue == null?"":columnValue);

			// 科目名（カナ）
			columnID = mstappr.getColumnID( "M_ACCT", "ACCT_KNAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_KNAME(columnValue == null?"":columnValue);

			// 原始区分
			columnID = mstappr.getColumnID( "M_ACCT", "PRIMITIVE_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PRIMITIVE_TYP(columnValue == null?"":columnValue);

			// 貸借区分
			columnID = mstappr.getColumnID( "M_ACCT", "DR_CR_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DR_CR_TYP(columnValue == null?"":columnValue);

			// 科目区分
			columnID = mstappr.getColumnID( "M_ACCT", "ACCT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_TYP(columnValue == null?"":columnValue);

			// 補助区分既定値
			columnID = mstappr.getColumnID( "M_ACCT", "SUB_ACCT_TYP_DEFAULT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SUB_ACCT_TYP_DEFAULT(columnValue == null?"":columnValue);

			// 内部取引区分
			columnID = mstappr.getColumnID( "M_ACCT", "INTERNAL_TRN_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_INTERNAL_TRN_TYP(columnValue == null?"":columnValue);


		}
		else{
			struct.setd_NEW_ACCT_CD("");
			struct.setd_NEW_SUB_ACCT_CD("");
			struct.setd_NEW_ACCT_NAME("");
			struct.setd_NEW_ACCT_ANAME("");
			struct.setd_NEW_ACCT_KNAME("");
			struct.setd_NEW_PRIMITIVE_TYP("");
			struct.setd_NEW_DR_CR_TYP("");
			struct.setd_NEW_ACCT_TYP("");
			struct.setd_NEW_SUB_ACCT_TYP_DEFAULT("");
			struct.setd_NEW_INTERNAL_TRN_TYP("");
		}

		// 補助区分コード
		struct.setd_OLD_SUB_ACCT_CD(getTypeName(_SUB_ACCT_CD,struct.getd_OLD_SUB_ACCT_CD()));
		struct.setd_NEW_SUB_ACCT_CD(getTypeName(_SUB_ACCT_CD,struct.getd_NEW_SUB_ACCT_CD()));
		// 原始区分
		struct.setd_OLD_PRIMITIVE_TYP(getTypeName(_PRIMITIVE_TYP,struct.getd_OLD_PRIMITIVE_TYP()));
		struct.setd_NEW_PRIMITIVE_TYP(getTypeName(_PRIMITIVE_TYP,struct.getd_NEW_PRIMITIVE_TYP()));
        // 貸借区分
		struct.setd_OLD_DR_CR_TYP(getTypeName(_DR_CR_TYP,struct.getd_OLD_DR_CR_TYP()));
		struct.setd_NEW_DR_CR_TYP(getTypeName(_DR_CR_TYP,struct.getd_NEW_DR_CR_TYP()));
    	// 科目区分
        struct.setd_OLD_ACCT_TYP(getTypeName(_ACCT_TYP,struct.getd_OLD_ACCT_TYP()));
		struct.setd_NEW_ACCT_TYP(getTypeName(_ACCT_TYP,struct.getd_NEW_ACCT_TYP()));
    	// 補助科目規定値
    	struct.setd_OLD_SUB_ACCT_TYP_DEFAULT(getTypeName(_SUB_ACCT_TYP_DEFAULT,struct.getd_OLD_SUB_ACCT_TYP_DEFAULT()));
		struct.setd_NEW_SUB_ACCT_TYP_DEFAULT(getTypeName(_SUB_ACCT_TYP_DEFAULT,struct.getd_NEW_SUB_ACCT_TYP_DEFAULT()));
    	// 内部取引区分 
    	struct.setd_OLD_INTERNAL_TRN_TYP(getTypeName(_INTERNAL_TRN_TYP,struct.getd_OLD_INTERNAL_TRN_TYP()));
		struct.setd_NEW_INTERNAL_TRN_TYP(getTypeName(_INTERNAL_TRN_TYP,struct.getd_NEW_INTERNAL_TRN_TYP()));
		
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ACCT_CD().equals(struct.getd_NEW_ACCT_CD())){
				struct.setd_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_SUB_ACCT_CD().equals(struct.getd_NEW_SUB_ACCT_CD())){
				struct.setd_SUB_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ACCT_NAME().equals(struct.getd_NEW_ACCT_NAME())){
				struct.setd_ACCT_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_ACCT_ANAME().equals(struct.getd_NEW_ACCT_ANAME())){
				struct.setd_ACCT_ANAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_ACCT_KNAME().equals(struct.getd_NEW_ACCT_KNAME())){
				struct.setd_ACCT_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_PRIMITIVE_TYP().equals(struct.getd_NEW_PRIMITIVE_TYP())){
				struct.setd_PRIMITIVE_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_DR_CR_TYP().equals(struct.getd_NEW_DR_CR_TYP())){
				struct.setd_DR_CR_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_ACCT_TYP().equals(struct.getd_NEW_ACCT_TYP())){
				struct.setd_ACCT_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_SUB_ACCT_TYP_DEFAULT().equals(struct.getd_NEW_SUB_ACCT_TYP_DEFAULT())){
				struct.setd_SUB_ACCT_TYP_DEFAULT_CHANGE(changed);
			}
			if(!struct.getd_OLD_INTERNAL_TRN_TYP().equals(struct.getd_NEW_INTERNAL_TRN_TYP())){
				struct.setd_INTERNAL_TRN_TYP_CHANGE(changed);
			}
		}
    }
    /**
     * 銀行手数料メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBZ0270010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setBANK_CD(keyvalueMap.get("BANK_CD").toString());             				//銀行コード
    		oldStruct.setTRF_TYP(keyvalueMap.get("TRF_TYP").toString());             				//振込先区分
    		oldStruct.setFB_FLG(keyvalueMap.get("FB_FLG").toString());            		 			//ＦＢフラグ
    		oldStruct.setCONTENTS_TYP(keyvalueMap.get("CONTENTS_TYP").toString());             		//振込内容区分
    		oldStruct.setINFO_TYP(keyvalueMap.get("INFO_TYP").toString());             				//振込情報区分
    		oldStruct.setVALID_START_DATE(keyvalueMap.get("VALID_START_DATE").toString());         	//有効開始日
    		oldStruct.setMIN_AMOUNT(keyvalueMap.get("MIN_AMOUNT").toString());             			//下限金額

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_BANK_FEE.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_BANK_CD((oldStruct.getd_OLD_BANK_CD()==null?"":oldStruct.getd_OLD_BANK_CD()));
			struct.setd_OLD_TRF_TYP((oldStruct.getd_OLD_TRF_TYP()==null?"":oldStruct.getd_OLD_TRF_TYP()));
			struct.setd_OLD_CONTENTS_TYP((oldStruct.getd_OLD_CONTENTS_TYP()==null?"":oldStruct.getd_OLD_CONTENTS_TYP()));
			struct.setd_OLD_INFO_TYP((oldStruct.getd_OLD_INFO_TYP()==null?"":oldStruct.getd_OLD_INFO_TYP()));
			struct.setd_OLD_VALID_START_DATE((oldStruct.getd_OLD_VALID_START_DATE()==null?"":oldStruct.getd_OLD_VALID_START_DATE()));
			struct.setd_OLD_MIN_AMOUNT((oldStruct.getd_OLD_MIN_AMOUNT()==null?"":oldStruct.getd_OLD_MIN_AMOUNT()));
			struct.setd_OLD_VALID_END_DATE((oldStruct.getd_OLD_VALID_END_DATE()==null?"":oldStruct.getd_OLD_VALID_END_DATE()));
			struct.setd_OLD_MAX_AMOUNT((oldStruct.getd_OLD_MAX_AMOUNT()==null?"":oldStruct.getd_OLD_MAX_AMOUNT()));
			struct.setd_OLD_TRF_FEE((oldStruct.getd_OLD_TRF_FEE()==null?"":oldStruct.getd_OLD_TRF_FEE()));
			struct.setd_OLD_TAX_CD((oldStruct.getd_OLD_TAX_CD()==null?"":oldStruct.getd_OLD_TAX_CD()));
		}else{
			struct.setd_OLD_BANK_CD("");
			struct.setd_OLD_TRF_TYP("");
			struct.setd_OLD_CONTENTS_TYP("");
			struct.setd_OLD_INFO_TYP("");
			struct.setd_OLD_VALID_START_DATE("");
			struct.setd_OLD_MIN_AMOUNT("0");
			struct.setd_OLD_VALID_END_DATE("");
			struct.setd_OLD_MAX_AMOUNT("0");
			struct.setd_OLD_TRF_FEE("0");
			struct.setd_OLD_TAX_CD("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 銀行コード
			columnID = mstappr.getColumnID( "M_BANK_FEE", "BANK_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BANK_CD(columnValue == null?"":columnValue);

			// 振込先区分
			columnID = mstappr.getColumnID( "M_BANK_FEE", "TRF_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TRF_TYP(columnValue == null?"":columnValue);

			// 振込内容区分
			columnID = mstappr.getColumnID( "M_BANK_FEE", "CONTENTS_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CONTENTS_TYP(columnValue == null?"":columnValue);

			// 振込情報区分
			columnID = mstappr.getColumnID( "M_BANK_FEE", "INFO_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_INFO_TYP(columnValue == null?"":columnValue);

			// 有効開始日
			columnID = mstappr.getColumnID( "M_BANK_FEE", "VALID_START_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VALID_START_DATE(columnValue == null?"":columnValue);

			// 下限金額
			columnID = mstappr.getColumnID( "M_BANK_FEE", "MIN_AMOUNT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MIN_AMOUNT(columnValue == null?"":columnValue);

			// 有効終了日
			columnID = mstappr.getColumnID( "M_BANK_FEE", "VALID_END_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VALID_END_DATE(columnValue == null?"":columnValue);

			// 上限金額
			columnID = mstappr.getColumnID( "M_BANK_FEE", "MAX_AMOUNT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MAX_AMOUNT(columnValue == null?"":columnValue);

			// 振込手数料
			columnID = mstappr.getColumnID( "M_BANK_FEE", "TRF_FEE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TRF_FEE(columnValue == null?"":columnValue);

			// 消費税コード
			columnID = mstappr.getColumnID( "M_BANK_FEE", "TAX_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TAX_CD(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_BANK_CD("");
			struct.setd_NEW_TRF_TYP("");
			struct.setd_NEW_CONTENTS_TYP("");
			struct.setd_NEW_INFO_TYP("");
			struct.setd_NEW_VALID_START_DATE("");
			struct.setd_NEW_MIN_AMOUNT("0");
			struct.setd_NEW_VALID_END_DATE("");
			struct.setd_NEW_MAX_AMOUNT("0");
			struct.setd_NEW_TRF_FEE("0");
			struct.setd_NEW_TAX_CD("");
		}
		// 振込先区分
		struct.setd_OLD_TRF_TYP(getTypeName(_TRF_TYP,struct.getd_OLD_TRF_TYP()));
		struct.setd_NEW_TRF_TYP(getTypeName(_TRF_TYP,struct.getd_NEW_TRF_TYP()));
    	// 振込内容区分
		struct.setd_OLD_CONTENTS_TYP(getTypeName(_CONTENTS_TYP,struct.getd_OLD_CONTENTS_TYP()));
		struct.setd_NEW_CONTENTS_TYP(getTypeName(_CONTENTS_TYP,struct.getd_NEW_CONTENTS_TYP()));
    	// 振込情報区分
		struct.setd_OLD_INFO_TYP(getTypeName(_INFO_TYP,struct.getd_OLD_INFO_TYP()));
		struct.setd_NEW_INFO_TYP(getTypeName(_INFO_TYP,struct.getd_NEW_INFO_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_BANK_CD().equals(struct.getd_NEW_BANK_CD())){
				struct.setd_BANK_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_TRF_TYP().equals(struct.getd_NEW_TRF_TYP())){
				struct.setd_TRF_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_CONTENTS_TYP().equals(struct.getd_NEW_CONTENTS_TYP())){
				struct.setd_CONTENTS_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_INFO_TYP().equals(struct.getd_NEW_INFO_TYP())){
				struct.setd_INFO_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_VALID_START_DATE().equals(struct.getd_NEW_VALID_START_DATE())){
				struct.setd_VALID_START_DATE_CHANGE(changed);
			}
			if(!struct.getd_OLD_VALID_END_DATE().equals(struct.getd_NEW_VALID_END_DATE())){
				struct.setd_VALID_END_DATE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MIN_AMOUNT(), struct.getd_NEW_MIN_AMOUNT())!= 0){
				struct.setd_MIN_AMOUNT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MAX_AMOUNT(), struct.getd_NEW_MAX_AMOUNT())!= 0){
				struct.setd_MAX_AMOUNT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_TRF_FEE(), struct.getd_NEW_TRF_FEE())!= 0){
				struct.setd_TRF_FEE_CHANGE(changed);
			}
			if(!struct.getd_OLD_TAX_CD().equals(struct.getd_NEW_TAX_CD())){
				struct.setd_TAX_CD_CHANGE(changed);
			}
		}
    }
    /**
     * 取引先メンテナンス買掛
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailCA0020010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());                      // 取引先コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_VEND_CTRL.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_VEND_CD(oldStruct.getd_OLD_VEND_CD()==null?"":oldStruct.getd_OLD_VEND_CD());
			struct.setd_OLD_VEND_NAME(oldStruct.getd_OLD_VEND_NAME()==null?"":oldStruct.getd_OLD_VEND_NAME());
			struct.setd_OLD_VEND_ANAME(oldStruct.getd_OLD_VEND_ANAME()==null?"":oldStruct.getd_OLD_VEND_ANAME());
			struct.setd_OLD_VEND_KNAME(oldStruct.getd_OLD_VEND_KNAME()==null?"":oldStruct.getd_OLD_VEND_KNAME());
			struct.setd_OLD_ZIP_CD(oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD());
			struct.setd_OLD_ADDRESS_1(oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1());
			struct.setd_OLD_ADDRESS_2(oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2());
			struct.setd_OLD_ADDRESS_K_1(oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1());
			struct.setd_OLD_ADDRESS_K_2(oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2());
			struct.setd_OLD_TEL(oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL());
			struct.setd_OLD_FAX(oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX());
			struct.setd_OLD_VEND_ORG(oldStruct.getd_OLD_VEND_ORG()==null?"":oldStruct.getd_OLD_VEND_ORG());
			struct.setd_OLD_VEND_PERSON(oldStruct.getd_OLD_VEND_PERSON()==null?"":oldStruct.getd_OLD_VEND_PERSON());
			struct.setd_OLD_OWN_ORG_CD(oldStruct.getd_OLD_OWN_ORG_CD()==null?"":oldStruct.getd_OLD_OWN_ORG_CD());
			struct.setd_OLD_OWN_PERSON_CD(oldStruct.getd_OLD_OWN_PERSON_CD()==null?"":oldStruct.getd_OLD_OWN_PERSON_CD());
			struct.setd_OLD_VEND_REM(oldStruct.getd_OLD_VEND_REM()==null?"":oldStruct.getd_OLD_VEND_REM());
		}else{
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_VEND_NAME("");
			struct.setd_OLD_VEND_ANAME("");
			struct.setd_OLD_VEND_KNAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
			struct.setd_OLD_VEND_ORG("");
			struct.setd_OLD_VEND_PERSON("");
			struct.setd_OLD_OWN_ORG_CD("");
			struct.setd_OLD_OWN_PERSON_CD("");
			struct.setd_OLD_VEND_REM("");

		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 取引先コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_CD(columnValue==null?"":columnValue);
			// 取引先名
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_NAME(columnValue==null?"":columnValue);
			// 取引先略称
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_ANAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_ANAME(columnValue==null?"":columnValue);
			// 取引先カナ名
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_KNAME(columnValue==null?"":columnValue);
			// 郵便番号
			columnID=mstappr.getColumnID("M_VEND_CTRL","ZIP_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ZIP_CD(columnValue==null?"":columnValue);
			// 住所1
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_1(columnValue==null?"":columnValue);
			// 住所2
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_2(columnValue==null?"":columnValue);
			// 住所(カナ)1
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue==null?"":columnValue);
			// 住所(カナ)2
			columnID=mstappr.getColumnID("M_VEND_CTRL","ADDRESS_K_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue==null?"":columnValue);
			// 電話番号
			columnID=mstappr.getColumnID("M_VEND_CTRL","TEL");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TEL(columnValue==null?"":columnValue);
			// FAX番号
			columnID=mstappr.getColumnID("M_VEND_CTRL","FAX");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_FAX(columnValue==null?"":columnValue);
			// 相手先担当部門
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_ORG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_ORG(columnValue==null?"":columnValue);
			// 相手先担当者
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_PERSON");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_PERSON(columnValue==null?"":columnValue);
			// 自社担当部門コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","OWN_ORG_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_ORG_CD(columnValue==null?"":columnValue);
			// 担当者コード
			columnID=mstappr.getColumnID("M_VEND_CTRL","OWN_PERSON_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_PERSON_CD(columnValue==null?"":columnValue);
			// 備考
			columnID=mstappr.getColumnID("M_VEND_CTRL","VEND_REM");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_VEND_REM(columnValue==null?"":columnValue);
		}
		else{
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_VEND_NAME("");
			struct.setd_NEW_VEND_ANAME("");
			struct.setd_NEW_VEND_KNAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
			struct.setd_NEW_VEND_ORG("");
			struct.setd_NEW_VEND_PERSON("");
			struct.setd_NEW_OWN_ORG_CD("");
			struct.setd_NEW_OWN_PERSON_CD("");
			struct.setd_NEW_VEND_REM("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_NAME().equals(struct.getd_NEW_VEND_NAME())){
				struct.setd_VEND_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_ANAME().equals(struct.getd_NEW_VEND_ANAME())){
				struct.setd_VEND_ANAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_KNAME().equals(struct.getd_NEW_VEND_KNAME())){
				struct.setd_VEND_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())){
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())){
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())){
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())){
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())){
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())){
				struct.setd_TEL_CHANGE(changed);
			}
			if(!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())){
				struct.setd_FAX_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_ORG().equals(struct.getd_NEW_VEND_ORG())){
				struct.setd_VEND_ORG_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_PERSON().equals(struct.getd_NEW_VEND_PERSON())){
				struct.setd_VEND_PERSON_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_ORG_CD().equals(struct.getd_NEW_OWN_ORG_CD())){
				struct.setd_OWN_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_PERSON_CD().equals(struct.getd_NEW_OWN_PERSON_CD())){
				struct.setd_OWN_PERSON_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_VEND_REM().equals(struct.getd_NEW_VEND_REM())){
				struct.setd_VEND_REM_CHANGE(changed);
			}
		}
    }
    /**
     * 取引先支払条件メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailCA0040010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             	//会社コード
    		oldStruct.setVEND_CD(keyvalueMap.get("VEND_CD").toString());             		//取引先コード
    		oldStruct.setACCT_CD(keyvalueMap.get("ACCT_CD").toString());             		//科目コード
    		oldStruct.setSUB_ACCT_CD(keyvalueMap.get("SUB_ACCT_CD").toString());            //補助区分コード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_VEND_PAY_CTRL.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_VEND_CD((oldStruct.getd_OLD_VEND_CD()==null?"":oldStruct.getd_OLD_VEND_CD()));
			struct.setd_OLD_ACCT_CD((oldStruct.getd_OLD_ACCT_CD()==null?"":oldStruct.getd_OLD_ACCT_CD()));
			struct.setd_OLD_SUB_ACCT_CD((oldStruct.getd_OLD_SUB_ACCT_CD()==null?"":oldStruct.getd_OLD_SUB_ACCT_CD()));
			struct.setd_OLD_PAY_PATTERN_CD((oldStruct.getd_OLD_PAY_PATTERN_CD()==null?"":oldStruct.getd_OLD_PAY_PATTERN_CD()));
			struct.setd_OLD_ROUND_TYP((oldStruct.getd_OLD_ROUND_TYP()==null?"":oldStruct.getd_OLD_ROUND_TYP()));
			if (screen_url.equals("CA2040010Servlet")) {
				// 会社コード
				oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             	
				// 支払パターンコード
				oldStruct.setPAY_PATTERN_CD(struct.getd_OLD_PAY_PATTERN_CD());
	            // 変更前データリストを取得
				oldDateList = commonEntity.mselectM_PAY_PATTERN.read(conn, oldStruct);
				if (!oldDateList.isEmpty()) {
					oldStruct = (AZ0060010Struct) oldDateList.get(0);
					struct.setd_OLD_PAY_ODR_TYP((oldStruct.getd_OLD_PAY_ODR_TYP()==null?"":oldStruct.getd_OLD_PAY_ODR_TYP()));
					struct.setd_OLD_PAY_METHOD_CD_1((oldStruct.getd_OLD_PAY_METHOD_CD_1()==null?"":oldStruct.getd_OLD_PAY_METHOD_CD_1()));
					struct.setd_OLD_PAY_METHOD_CD_2((oldStruct.getd_OLD_PAY_METHOD_CD_2()==null?"":oldStruct.getd_OLD_PAY_METHOD_CD_2()));	
					if(!"".equals(struct.getd_OLD_PAY_METHOD_CD_1())) {
						// 会社コード
			    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
			    		// 支払方法コード
			    		oldStruct.setPAY_METHOD_CD(struct.getd_OLD_PAY_METHOD_CD_1());  
			    		 // 変更前データリストを取得
						oldDateList = commonEntity.mselectM_PAY_METHOD.read(conn, oldStruct);
						if (!oldDateList.isEmpty()) {
							oldStruct = (AZ0060010Struct) oldDateList.get(0);
							struct.setd_OLD_PAY_METHOD_1(oldStruct.getd_OLD_PAY_METHOD()==null? "":oldStruct.getd_OLD_PAY_METHOD());
							struct.setd_OLD_PAY_TARGET_TYP((oldStruct.getd_OLD_PAY_TARGET_TYP()==null? "":oldStruct.getd_OLD_PAY_TARGET_TYP()));
							struct.setd_OLD_PAY_TARGET_NAME_1(getTypeName(_PAY_TARGET_TYP, struct.getd_OLD_PAY_TARGET_TYP()));
						} else {
							struct.setd_OLD_PAY_TARGET_NAME_1("");
							struct.setd_OLD_PAY_METHOD_1("");
						}
					} else {
						struct.setd_OLD_PAY_TARGET_NAME_1("");
						struct.setd_OLD_PAY_METHOD_1("");
					}
					
					if(!"".equals(struct.getd_OLD_PAY_METHOD_CD_2())) {
						// 会社コード
			    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
			    		// 支払方法コード
			    		oldStruct.setPAY_METHOD_CD(struct.getd_OLD_PAY_METHOD_CD_2());  
			    		 // 変更前データリストを取得
						oldDateList = commonEntity.mselectM_PAY_METHOD.read(conn, oldStruct);
						if (!oldDateList.isEmpty()) {
							oldStruct = (AZ0060010Struct) oldDateList.get(0);
							struct.setd_OLD_PAY_TARGET_TYP((oldStruct.getd_OLD_PAY_TARGET_TYP()==null? "":oldStruct.getd_OLD_PAY_TARGET_TYP()));
							struct.setd_OLD_PAY_TARGET_NAME_2(getTypeName(_PAY_TARGET_TYP, struct.getd_OLD_PAY_TARGET_TYP()));
						} else {
							struct.setd_OLD_PAY_TARGET_NAME_2("");
						}
					} else {
						struct.setd_OLD_PAY_TARGET_NAME_2("");
					}
				} else {
					struct.setd_OLD_PAY_ODR_TYP("");
					struct.setd_OLD_PAY_METHOD_1("");
					struct.setd_OLD_PAY_METHOD_CD_1("");
					struct.setd_OLD_PAY_METHOD_CD_2("");
					struct.setd_OLD_PAY_TARGET_NAME_1("");
					struct.setd_OLD_PAY_TARGET_NAME_2("");
				}
			}
		} else {
			struct.setd_OLD_VEND_CD("");
			struct.setd_OLD_ACCT_CD("");
			struct.setd_OLD_SUB_ACCT_CD("");
			struct.setd_OLD_PAY_PATTERN_CD("");
			struct.setd_OLD_ROUND_TYP("");
			if (screen_url.equals("CA2040010Servlet")) {
				struct.setd_OLD_PAY_ODR_TYP("");
				struct.setd_OLD_PAY_METHOD_1("");
				struct.setd_OLD_PAY_METHOD_CD_1("");
				struct.setd_OLD_PAY_METHOD_CD_2("");
				struct.setd_OLD_PAY_TARGET_NAME_1("");
				struct.setd_OLD_PAY_TARGET_NAME_2("");
			}
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 取引先コード
			columnID = mstappr.getColumnID( "M_VEND_PAY_CTRL", "VEND_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_VEND_CD(columnValue == null?"":columnValue);

			// 科目コード
			columnID = mstappr.getColumnID( "M_VEND_PAY_CTRL", "ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_CD(columnValue == null?"":columnValue);

			// 補助区分コード
			columnID = mstappr.getColumnID( "M_VEND_PAY_CTRL", "SUB_ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SUB_ACCT_CD(columnValue == null?"":columnValue);

			// 支払パターンコード
			columnID = mstappr.getColumnID( "M_VEND_PAY_CTRL", "PAY_PATTERN_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_PATTERN_CD(columnValue == null?"":columnValue);

			// 端数処理区分
			columnID = mstappr.getColumnID( "M_VEND_PAY_CTRL", "ROUND_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ROUND_TYP(columnValue == null?"":columnValue);
			
			if (screen_url.equals("CA2040010Servlet")) {
				// 会社コード
				oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             	
				// 支払パターンコード
				oldStruct.setPAY_PATTERN_CD(struct.getd_NEW_PAY_PATTERN_CD());
	            // 変更前データリストを取得
				oldDateList = commonEntity.mselectM_PAY_PATTERN.read(conn, oldStruct);
				if (!oldDateList.isEmpty()) {
					oldStruct = (AZ0060010Struct) oldDateList.get(0);
					struct.setd_NEW_PAY_ODR_TYP((oldStruct.getd_OLD_PAY_ODR_TYP()==null?"":oldStruct.getd_OLD_PAY_ODR_TYP()));
					struct.setd_NEW_PAY_METHOD_CD_1((oldStruct.getd_OLD_PAY_METHOD_CD_1()==null?"":oldStruct.getd_OLD_PAY_METHOD_CD_1()));
					struct.setd_NEW_PAY_METHOD_CD_2((oldStruct.getd_OLD_PAY_METHOD_CD_2()==null?"":oldStruct.getd_OLD_PAY_METHOD_CD_2()));	
					if(!"".equals(struct.getd_NEW_PAY_METHOD_CD_1())) {
						// 会社コード
			    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
			    		// 支払方法コード
			    		oldStruct.setPAY_METHOD_CD(struct.getd_NEW_PAY_METHOD_CD_1());  
			    		 // 変更前データリストを取得
						oldDateList = commonEntity.mselectM_PAY_METHOD.read(conn, oldStruct);
						if (!oldDateList.isEmpty()) {
							oldStruct = (AZ0060010Struct) oldDateList.get(0);
							struct.setd_NEW_PAY_METHOD_1(oldStruct.getd_OLD_PAY_METHOD()==null? "":oldStruct.getd_OLD_PAY_METHOD());
							struct.setd_NEW_PAY_TARGET_TYP((oldStruct.getd_OLD_PAY_TARGET_TYP()==null? "":oldStruct.getd_OLD_PAY_TARGET_TYP()));
							struct.setd_NEW_PAY_TARGET_NAME_1(getTypeName(_PAY_TARGET_TYP, struct.getd_NEW_PAY_TARGET_TYP()));
						} else {
							struct.setd_NEW_PAY_TARGET_NAME_1("");
							struct.setd_NEW_PAY_METHOD_1("");
						}
					} else {
						struct.setd_NEW_PAY_TARGET_NAME_1("");
						struct.setd_NEW_PAY_METHOD_1("");
					}
					
					if(!"".equals(struct.getd_NEW_PAY_METHOD_CD_2())) {
						// 会社コード
			    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
			    		// 支払方法コード
			    		oldStruct.setPAY_METHOD_CD(struct.getd_NEW_PAY_METHOD_CD_2());  
			    		 // 変更前データリストを取得
						oldDateList = commonEntity.mselectM_PAY_METHOD.read(conn, oldStruct);
						if (!oldDateList.isEmpty()) {
							oldStruct = (AZ0060010Struct) oldDateList.get(0);
							struct.setd_NEW_PAY_TARGET_TYP((oldStruct.getd_OLD_PAY_TARGET_TYP()==null? "":oldStruct.getd_OLD_PAY_TARGET_TYP()));
							struct.setd_NEW_PAY_TARGET_NAME_2(getTypeName(_PAY_TARGET_TYP, struct.getd_NEW_PAY_TARGET_TYP()));
						} else {
							struct.setd_NEW_PAY_TARGET_NAME_2("");
						}
					} else {
						struct.setd_NEW_PAY_TARGET_NAME_2("");
					}
				} else {
					struct.setd_NEW_PAY_ODR_TYP("");
					struct.setd_NEW_PAY_METHOD_1("");
					struct.setd_NEW_PAY_METHOD_CD_1("");
					struct.setd_NEW_PAY_METHOD_CD_2("");
					struct.setd_NEW_PAY_TARGET_NAME_1("");
					struct.setd_NEW_PAY_TARGET_NAME_2("");
				}
			}
		}
		else{
			struct.setd_NEW_VEND_CD("");
			struct.setd_NEW_ACCT_CD("");
			struct.setd_NEW_SUB_ACCT_CD("");
			struct.setd_NEW_PAY_PATTERN_CD("");
			struct.setd_NEW_ROUND_TYP("");
			if (screen_url.equals("CA2040010Servlet")) {
				struct.setd_NEW_PAY_ODR_TYP("");
				struct.setd_NEW_PAY_METHOD_1("");
				struct.setd_NEW_PAY_METHOD_CD_1("");
				struct.setd_NEW_PAY_METHOD_CD_2("");
				struct.setd_NEW_PAY_TARGET_NAME_1("");
				struct.setd_NEW_PAY_TARGET_NAME_2("");
			}
		}
		// 端数処理区分
		struct.setd_OLD_ROUND_TYP(getTypeName(_ROUND_TYP,struct.getd_OLD_ROUND_TYP()));
		struct.setd_NEW_ROUND_TYP(getTypeName(_ROUND_TYP,struct.getd_NEW_ROUND_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_VEND_CD().equals(struct.getd_NEW_VEND_CD())){
				struct.setd_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ACCT_CD().equals(struct.getd_NEW_ACCT_CD())){
				struct.setd_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_SUB_ACCT_CD().equals(struct.getd_NEW_SUB_ACCT_CD())){
				struct.setd_SUB_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_PATTERN_CD().equals(struct.getd_NEW_PAY_PATTERN_CD())){
				struct.setd_PAY_PATTERN_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ROUND_TYP().equals(struct.getd_NEW_ROUND_TYP())){
				struct.setd_ROUND_TYP_CHANGE(changed);
			}
			if (screen_url.equals("CA2040010Servlet")) {
				if(!struct.getd_OLD_PAY_ODR_TYP().equals(struct.getd_NEW_PAY_ODR_TYP())){
					struct.setd_PAY_ODR_TYP_CHANGE(changed);
				}
				if(!struct.getd_OLD_PAY_METHOD_CD_1().equals(struct.getd_NEW_PAY_METHOD_CD_1())){
					struct.setd_PAY_METHOD_CD_1_CHANGE(changed);
				}
				if(!struct.getd_OLD_PAY_TARGET_NAME_1().equals(struct.getd_NEW_PAY_TARGET_NAME_1())){
					struct.setd_PAY_TARGET_NAME_1_CHANGE(changed);
				}
				if(!struct.getd_OLD_PAY_METHOD_1().equals(struct.getd_NEW_PAY_METHOD_1())){
					struct.setd_PAY_METHOD_1_CHANGE(changed);
				}
				if(!struct.getd_OLD_PAY_METHOD_CD_2().equals(struct.getd_NEW_PAY_METHOD_CD_2())){
					struct.setd_PAY_METHOD_CD_2_CHANGE(changed);
				}
				if(!struct.getd_OLD_PAY_TARGET_NAME_2().equals(struct.getd_NEW_PAY_TARGET_NAME_2())){
					struct.setd_PAY_TARGET_NAME_2_CHANGE(changed);
				}
			}
		}
    }
    /**
     * 支払方法メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailCA0060010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             	//会社コード
    		oldStruct.setPAY_METHOD_CD(keyvalueMap.get("PAY_METHOD_CD").toString());        //支払方法コード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_PAY_METHOD.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_PAY_METHOD_CD((oldStruct.getd_OLD_PAY_METHOD_CD()==null?"":oldStruct.getd_OLD_PAY_METHOD_CD()));
			struct.setd_OLD_PAY_METHOD((oldStruct.getd_OLD_PAY_METHOD()==null?"":oldStruct.getd_OLD_PAY_METHOD()));
			struct.setd_OLD_ACCT_CD((oldStruct.getd_OLD_ACCT_CD()==null?"":oldStruct.getd_OLD_ACCT_CD()));
			struct.setd_OLD_SUB_ACCT_CD((oldStruct.getd_OLD_SUB_ACCT_CD()==null?"":oldStruct.getd_OLD_SUB_ACCT_CD()));
			struct.setd_OLD_PAY_TARGET_TYP((oldStruct.getd_OLD_PAY_TARGET_TYP()==null?"":oldStruct.getd_OLD_PAY_TARGET_TYP()));
		}else{
			struct.setd_OLD_PAY_METHOD_CD("");
			struct.setd_OLD_PAY_METHOD("");
			struct.setd_OLD_ACCT_CD("");
			struct.setd_OLD_SUB_ACCT_CD("");
			struct.setd_OLD_PAY_TARGET_TYP("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 支払方法コード
			columnID = mstappr.getColumnID( "M_PAY_METHOD", "PAY_METHOD_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_METHOD_CD(columnValue == null?"":columnValue);

			// 支払方法
			columnID = mstappr.getColumnID( "M_PAY_METHOD", "PAY_METHOD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_METHOD(columnValue == null?"":columnValue);

			// 科目コード
			columnID = mstappr.getColumnID( "M_PAY_METHOD", "ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_CD(columnValue == null?"":columnValue);

			// 補助区分コード
			columnID = mstappr.getColumnID( "M_PAY_METHOD", "SUB_ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SUB_ACCT_CD(columnValue == null?"":columnValue);

			// 支払対象区分
			columnID = mstappr.getColumnID( "M_PAY_METHOD", "PAY_TARGET_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_TARGET_TYP(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_PAY_METHOD_CD("");
			struct.setd_NEW_PAY_METHOD("");
			struct.setd_NEW_ACCT_CD("");
			struct.setd_NEW_SUB_ACCT_CD("");
			struct.setd_NEW_PAY_TARGET_TYP("");
		}

		// 分支払対象
		struct.setd_OLD_PAY_TARGET_TYP(getTypeName(_PAY_TARGET_TYP,struct.getd_OLD_PAY_TARGET_TYP()));
		struct.setd_NEW_PAY_TARGET_TYP(getTypeName(_PAY_TARGET_TYP,struct.getd_NEW_PAY_TARGET_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_PAY_METHOD_CD().equals(struct.getd_NEW_PAY_METHOD_CD())){
				struct.setd_PAY_METHOD_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_METHOD().equals(struct.getd_NEW_PAY_METHOD())){
				struct.setd_PAY_METHOD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ACCT_CD().equals(struct.getd_NEW_ACCT_CD())){
				struct.setd_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_SUB_ACCT_CD().equals(struct.getd_NEW_SUB_ACCT_CD())){
				struct.setd_SUB_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_TARGET_TYP().equals(struct.getd_NEW_PAY_TARGET_TYP())){
				struct.setd_PAY_TARGET_TYP_CHANGE(changed);
			}
		}
    }
    /**
     * 支払パターンメンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailCA0080010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());             		//会社コード
    		oldStruct.setPAY_PATTERN_CD(keyvalueMap.get("PAY_PATTERN_CD").toString());        	//支払パターンコード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_PAY_PATTERN.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_PAY_PATTERN_CD((oldStruct.getd_OLD_PAY_PATTERN_CD()==null?"":oldStruct.getd_OLD_PAY_PATTERN_CD()));
			struct.setd_OLD_PAY_ODR_TYP((oldStruct.getd_OLD_PAY_ODR_TYP()==null?"":oldStruct.getd_OLD_PAY_ODR_TYP()));
			struct.setd_OLD_PAY_METHOD_CD_1((oldStruct.getd_OLD_PAY_METHOD_CD_1()==null?"":oldStruct.getd_OLD_PAY_METHOD_CD_1()));
			struct.setd_OLD_PAY_METHOD_CD_2((oldStruct.getd_OLD_PAY_METHOD_CD_2()==null?"":oldStruct.getd_OLD_PAY_METHOD_CD_2()));
			struct.setd_OLD_STD_AMOUNT((oldStruct.getd_OLD_STD_AMOUNT()==null?"":oldStruct.getd_OLD_STD_AMOUNT()));
			struct.setd_OLD_RATIO_1((oldStruct.getd_OLD_RATIO_1()==null?"":oldStruct.getd_OLD_RATIO_1()));
			struct.setd_OLD_RATIO_2((oldStruct.getd_OLD_RATIO_2()==null?"":oldStruct.getd_OLD_RATIO_2()));
			struct.setd_OLD_PAY_PATTERN_NAME((oldStruct.getd_OLD_PAY_PATTERN_NAME()==null?"":oldStruct.getd_OLD_PAY_PATTERN_NAME()));
		}else{
			struct.setd_OLD_PAY_PATTERN_CD("");
			struct.setd_OLD_PAY_ODR_TYP("");
			struct.setd_OLD_PAY_METHOD_CD_1("");
			struct.setd_OLD_PAY_METHOD_CD_2("");
			struct.setd_OLD_STD_AMOUNT("");
			struct.setd_OLD_RATIO_1("");
			struct.setd_OLD_RATIO_2("");
			struct.setd_OLD_PAY_PATTERN_NAME("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 支払パターンコード
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "PAY_PATTERN_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_PATTERN_CD(columnValue == null?"":columnValue);

			// 条件区分
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "PAY_ODR_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_ODR_TYP(columnValue == null?"":columnValue);

			// 支払方法コード１
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "PAY_METHOD_CD_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_METHOD_CD_1(columnValue == null?"":columnValue);

			// 支払方法コード２
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "PAY_METHOD_CD_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_METHOD_CD_2(columnValue == null?"":columnValue);

			// 基準金額
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "STD_AMOUNT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STD_AMOUNT(columnValue == null?"":columnValue);

			// 割合１
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "RATIO_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_RATIO_1(columnValue == null?"":columnValue);

			// 割合２
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "RATIO_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_RATIO_2(columnValue == null?"":columnValue);

			// 支払パターン名
			columnID = mstappr.getColumnID( "M_PAY_PATTERN", "PAY_PATTERN_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_PATTERN_NAME(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_PAY_PATTERN_CD("");
			struct.setd_NEW_PAY_ODR_TYP("");
			struct.setd_NEW_PAY_METHOD_CD_1("");
			struct.setd_NEW_PAY_METHOD_CD_2("");
			struct.setd_NEW_STD_AMOUNT("");
			struct.setd_NEW_RATIO_1("");
			struct.setd_NEW_RATIO_2("");
			struct.setd_NEW_PAY_PATTERN_NAME("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_PAY_PATTERN_CD().equals(struct.getd_NEW_PAY_PATTERN_CD())){
				struct.setd_PAY_PATTERN_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_ODR_TYP().equals(struct.getd_NEW_PAY_ODR_TYP())){
				struct.setd_PAY_ODR_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_METHOD_CD_1().equals(struct.getd_NEW_PAY_METHOD_CD_1())){
				struct.setd_PAY_METHOD_CD_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_METHOD_CD_2().equals(struct.getd_NEW_PAY_METHOD_CD_2())){
				struct.setd_PAY_METHOD_CD_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_STD_AMOUNT().equals(struct.getd_NEW_STD_AMOUNT())){
				struct.setd_STD_AMOUNT_CHANGE(changed);
			}
			if(!struct.getd_OLD_RATIO_1().equals(struct.getd_NEW_RATIO_1())){
				struct.setd_RATIO_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_RATIO_2().equals(struct.getd_NEW_RATIO_2())){
				struct.setd_RATIO_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_PATTERN_NAME().equals(struct.getd_NEW_PAY_PATTERN_NAME())){
				struct.setd_PAY_PATTERN_NAME_CHANGE(changed);
			}
		}
    }
    /**
     * 利用者権限管理メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailCA0100010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setUSER_CD(keyvalueMap.get("USER_CD").toString());             	// 利用者コード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_USER_CTRL_H.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_USER_CD((oldStruct.getd_OLD_USER_CD()==null?"":oldStruct.getd_OLD_USER_CD()));
			struct.setd_OLD_ORG_CD((oldStruct.getd_OLD_ORG_CD()==null?"":oldStruct.getd_OLD_ORG_CD()));
			struct.setd_OLD_SLIP_CTRL_ORG_CD((oldStruct.getd_OLD_SLIP_CTRL_ORG_CD()==null?"":oldStruct.getd_OLD_SLIP_CTRL_ORG_CD()));
			struct.setd_OLD_CLOSING_CTRL_ORG_CD((oldStruct.getd_OLD_CLOSING_CTRL_ORG_CD()==null?"":oldStruct.getd_OLD_CLOSING_CTRL_ORG_CD()));
			struct.setd_OLD_PAY_CALC_CTRL_ORG_CD((oldStruct.getd_OLD_PAY_CALC_CTRL_ORG_CD()==null?"":oldStruct.getd_OLD_PAY_CALC_CTRL_ORG_CD()));
			struct.setd_OLD_PAY_FIX_CTRL_ORG_CD((oldStruct.getd_OLD_PAY_FIX_CTRL_ORG_CD()==null?"":oldStruct.getd_OLD_PAY_FIX_CTRL_ORG_CD()));
		}else{
			struct.setd_OLD_USER_CD("");
			struct.setd_OLD_ORG_CD("");
			struct.setd_OLD_SLIP_CTRL_ORG_CD("");
			struct.setd_OLD_CLOSING_CTRL_ORG_CD("");
			struct.setd_OLD_PAY_CALC_CTRL_ORG_CD("");
			struct.setd_OLD_PAY_FIX_CTRL_ORG_CD("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 利用者コード
			columnID = mstappr.getColumnID( "M_USER_CTRL_H", "USER_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_USER_CD(columnValue == null?"":columnValue);

			// 所属部門コード
			columnID = mstappr.getColumnID( "M_USER_CTRL_H", "ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ORG_CD(columnValue == null?"":columnValue);

			// 伝票管理部門コード
			columnID = mstappr.getColumnID( "M_USER_CTRL_H", "SLIP_CTRL_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SLIP_CTRL_ORG_CD(columnValue == null?"":columnValue);

			// 締め管理部門コード
			columnID = mstappr.getColumnID( "M_USER_CTRL_H", "CLOSING_CTRL_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CLOSING_CTRL_ORG_CD(columnValue == null?"":columnValue);

			// 支払計算管理部門コード
			columnID = mstappr.getColumnID( "M_USER_CTRL_H", "PAY_CALC_CTRL_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_CALC_CTRL_ORG_CD(columnValue == null?"":columnValue);

			// 支払確定管理部門コード
			columnID = mstappr.getColumnID( "M_USER_CTRL_H", "PAY_FIX_CTRL_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PAY_FIX_CTRL_ORG_CD(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_USER_CD("");
			struct.setd_NEW_ORG_CD("");
			struct.setd_NEW_SLIP_CTRL_ORG_CD("");
			struct.setd_NEW_CLOSING_CTRL_ORG_CD("");
			struct.setd_NEW_PAY_CALC_CTRL_ORG_CD("");
			struct.setd_NEW_PAY_FIX_CTRL_ORG_CD("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_USER_CD().equals(struct.getd_NEW_USER_CD())){
				struct.setd_USER_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ORG_CD().equals(struct.getd_NEW_ORG_CD())){
				struct.setd_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_SLIP_CTRL_ORG_CD().equals(struct.getd_NEW_SLIP_CTRL_ORG_CD())){
				struct.setd_SLIP_CTRL_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CLOSING_CTRL_ORG_CD().equals(struct.getd_NEW_CLOSING_CTRL_ORG_CD())){
				struct.setd_CLOSING_CTRL_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_CALC_CTRL_ORG_CD().equals(struct.getd_NEW_PAY_CALC_CTRL_ORG_CD())){
				struct.setd_PAY_CALC_CTRL_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PAY_FIX_CTRL_ORG_CD().equals(struct.getd_NEW_PAY_FIX_CTRL_ORG_CD())){
				struct.setd_PAY_FIX_CTRL_ORG_CD_CHANGE(changed);
			}
		}
    }
    /**
     * 買掛仕訳パターンメンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailCA0120010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());           //会社コード
    		oldStruct.setPATTERN_CD(keyvalueMap.get("PATTERN_CD").toString());           //パターンコード
    		oldStruct.setCLASS_1(keyvalueMap.get("CLASS_1").toString());            	 //分類１
    		oldStruct.setCLASS_2(keyvalueMap.get("CLASS_2").toString());             	 //分類２
    		oldStruct.setCLASS_3(keyvalueMap.get("CLASS_3").toString());             	 //分類３

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_AUTO_JNL.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_PATTERN_CD((oldStruct.getd_OLD_PATTERN_CD()==null?"":oldStruct.getd_OLD_PATTERN_CD()));
			struct.setd_OLD_CLASS_1((oldStruct.getd_OLD_CLASS_1()==null?"":oldStruct.getd_OLD_CLASS_1()));
			struct.setd_OLD_CLASS_2((oldStruct.getd_OLD_CLASS_2()==null?"":oldStruct.getd_OLD_CLASS_2()));
			struct.setd_OLD_CLASS_3((oldStruct.getd_OLD_CLASS_3()==null?"":oldStruct.getd_OLD_CLASS_3()));
			struct.setd_OLD_AUTO_JNL_NAME((oldStruct.getd_OLD_AUTO_JNL_NAME()==null?"":oldStruct.getd_OLD_AUTO_JNL_NAME()));
			struct.setd_OLD_DR_ACCT_CD((oldStruct.getd_OLD_DR_ACCT_CD()==null?"":oldStruct.getd_OLD_DR_ACCT_CD()));
			struct.setd_OLD_DR_SUB_ACCT_CD((oldStruct.getd_OLD_DR_SUB_ACCT_CD()==null?"":oldStruct.getd_OLD_DR_SUB_ACCT_CD()));
			struct.setd_OLD_DR_ORG_TYP((oldStruct.getd_OLD_DR_ORG_TYP()==null?"":oldStruct.getd_OLD_DR_ORG_TYP()));
			struct.setd_OLD_DR_ORG_CD((oldStruct.getd_OLD_DR_ORG_CD()==null?"":oldStruct.getd_OLD_DR_ORG_CD()));
			struct.setd_OLD_CR_ACCT_CD((oldStruct.getd_OLD_CR_ACCT_CD()==null?"":oldStruct.getd_OLD_CR_ACCT_CD()));
			struct.setd_OLD_CR_SUB_ACCT_CD((oldStruct.getd_OLD_CR_SUB_ACCT_CD()==null?"":oldStruct.getd_OLD_CR_SUB_ACCT_CD()));
			struct.setd_OLD_CR_ORG_TYP((oldStruct.getd_OLD_CR_ORG_TYP()==null?"":oldStruct.getd_OLD_CR_ORG_TYP()));
			struct.setd_OLD_CR_ORG_CD((oldStruct.getd_OLD_CR_ORG_CD()==null?"":oldStruct.getd_OLD_CR_ORG_CD()));
			struct.setd_OLD_ACCT_JNL_PATTERN_CD((oldStruct.getd_OLD_ACCT_JNL_PATTERN_CD()==null?"":oldStruct.getd_OLD_ACCT_JNL_PATTERN_CD()));
			struct.setd_OLD_ACCT_SLIP_NUM((oldStruct.getd_OLD_ACCT_SLIP_NUM()==null?"":oldStruct.getd_OLD_ACCT_SLIP_NUM()));
		}else{
			struct.setd_OLD_PATTERN_CD("");
			struct.setd_OLD_CLASS_1("");
			struct.setd_OLD_CLASS_2("");
			struct.setd_OLD_CLASS_3("");
			struct.setd_OLD_AUTO_JNL_NAME("");
			struct.setd_OLD_DR_ACCT_CD("");
			struct.setd_OLD_DR_SUB_ACCT_CD("");
			struct.setd_OLD_DR_ORG_TYP("");
			struct.setd_OLD_DR_ORG_CD("");
			struct.setd_OLD_CR_ACCT_CD("");
			struct.setd_OLD_CR_SUB_ACCT_CD("");
			struct.setd_OLD_CR_ORG_TYP("");
			struct.setd_OLD_CR_ORG_CD("");
			struct.setd_OLD_ACCT_JNL_PATTERN_CD("");
			struct.setd_OLD_ACCT_SLIP_NUM("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			//  パターンコード
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "PATTERN_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PATTERN_CD(columnValue == null?"":columnValue);

			//  分類１
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "CLASS_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CLASS_1(columnValue == null?"":columnValue);

			//  分類２
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "CLASS_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CLASS_2(columnValue == null?"":columnValue);

			//  分類３
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "CLASS_3");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CLASS_3(columnValue == null?"":columnValue);

			//  買掛仕訳パターン名
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "AUTO_JNL_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_AUTO_JNL_NAME(columnValue == null?"":columnValue);

			// 借方科目コード
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "DR_ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DR_ACCT_CD(columnValue == null?"":columnValue);

			// 借方補助区分コード
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "DR_SUB_ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DR_SUB_ACCT_CD(columnValue == null?"":columnValue);

			// 借方部門設定区分
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "DR_ORG_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DR_ORG_TYP(columnValue == null?"":columnValue);

			// 借方部門コード
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "DR_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DR_ORG_CD(columnValue == null?"":columnValue);

			// 貸方科目コード
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "CR_ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CR_ACCT_CD(columnValue == null?"":columnValue);

			// 貸方補助区分コード
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "CR_SUB_ACCT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CR_SUB_ACCT_CD(columnValue == null?"":columnValue);

			// 貸方部門設定区分
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "CR_ORG_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CR_ORG_TYP(columnValue == null?"":columnValue);

			// 貸方部門コード
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "CR_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CR_ORG_CD(columnValue == null?"":columnValue);

			// パターンコード(一般会計)
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "ACCT_JNL_PATTERN_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_JNL_PATTERN_CD(columnValue == null?"":columnValue);

			//伝票種類(一般会計)
			columnID = mstappr.getColumnID( "M_AUTO_JNL", "ACCT_SLIP_NUM");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACCT_SLIP_NUM(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_PATTERN_CD("");
			struct.setd_NEW_CLASS_1("");
			struct.setd_NEW_CLASS_2("");
			struct.setd_NEW_CLASS_3("");
			struct.setd_NEW_AUTO_JNL_NAME("");
			struct.setd_NEW_DR_ACCT_CD("");
			struct.setd_NEW_DR_SUB_ACCT_CD("");
			struct.setd_NEW_DR_ORG_TYP("");
			struct.setd_NEW_DR_ORG_CD("");
			struct.setd_NEW_CR_ACCT_CD("");
			struct.setd_NEW_CR_SUB_ACCT_CD("");
			struct.setd_NEW_CR_ORG_TYP("");
			struct.setd_NEW_CR_ORG_CD("");
			struct.setd_NEW_ACCT_JNL_PATTERN_CD("");
			struct.setd_NEW_ACCT_SLIP_NUM("0");
		}

    	// 借方部門設定区分
		struct.setd_OLD_DR_ORG_TYP(getTypeName(_DR_ORG_TYP,struct.getd_OLD_DR_ORG_TYP()));
		struct.setd_NEW_DR_ORG_TYP(getTypeName(_DR_ORG_TYP,struct.getd_NEW_DR_ORG_TYP()));

    	// 貸方部門設定区分
		struct.setd_OLD_CR_ORG_TYP(getTypeName(_CR_ORG_TYP,struct.getd_OLD_CR_ORG_TYP()));
		struct.setd_NEW_CR_ORG_TYP(getTypeName(_CR_ORG_TYP,struct.getd_NEW_CR_ORG_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_PATTERN_CD().equals(struct.getd_NEW_PATTERN_CD())){
				struct.setd_PATTERN_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CLASS_1().equals(struct.getd_NEW_CLASS_1())){
				struct.setd_CLASS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_CLASS_2().equals(struct.getd_NEW_CLASS_2())){
				struct.setd_CLASS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_CLASS_3().equals(struct.getd_NEW_CLASS_3())){
				struct.setd_CLASS_3_CHANGE(changed);
			}
			if(!struct.getd_OLD_AUTO_JNL_NAME().equals(struct.getd_NEW_AUTO_JNL_NAME())){
				struct.setd_AUTO_JNL_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_DR_ACCT_CD().equals(struct.getd_NEW_DR_ACCT_CD())){
				struct.setd_DR_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_DR_SUB_ACCT_CD().equals(struct.getd_NEW_DR_SUB_ACCT_CD())){
				struct.setd_DR_SUB_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_DR_ORG_TYP().equals(struct.getd_NEW_DR_ORG_TYP())){
				struct.setd_DR_ORG_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_DR_ORG_CD().equals(struct.getd_NEW_DR_ORG_CD())){
				struct.setd_DR_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CR_ACCT_CD().equals(struct.getd_NEW_CR_ACCT_CD())){
				struct.setd_CR_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CR_SUB_ACCT_CD().equals(struct.getd_NEW_CR_SUB_ACCT_CD())){
				struct.setd_CR_SUB_ACCT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CR_ORG_TYP().equals(struct.getd_NEW_CR_ORG_TYP())){
				struct.setd_CR_ORG_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_CR_ORG_CD().equals(struct.getd_NEW_CR_ORG_CD())){
				struct.setd_CR_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ACCT_JNL_PATTERN_CD().equals(struct.getd_NEW_ACCT_JNL_PATTERN_CD())){
				struct.setd_ACCT_JNL_PATTERN_CD_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ACCT_SLIP_NUM(),struct.getd_NEW_ACCT_SLIP_NUM())!=0){
				struct.setd_ACCT_SLIP_NUM_CHANGE(changed);
			}
		}
    }
    
    /**
     * 販売単価メンテナンスJa
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA1020010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());          						//会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());           		 						//得意先コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());            	 						//品目番号
    		oldStruct.setPURPOSE_UNIT_PRICE_TYP(keyvalueMap.get("PURPOSE_UNIT_PRICE_TYP").toString());          //用途別単価区分
    		oldStruct.setEFF_PHASE_IN_DATE(keyvalueMap.get("EFF_PHASE_IN_DATE").toString());             	 	//販売単価有効開始日
    		oldStruct.setSALES_UNIT_SIZE(keyvalueMap.get("SALES_UNIT_SIZE").toString());             	 		//サイズ

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_SALES_UNIT_COST.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD((oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD()));
			struct.setd_OLD_ITEM_CD((oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD()));
			struct.setd_OLD_PURPOSE_UNIT_PRICE_TYP((oldStruct.getd_OLD_PURPOSE_UNIT_PRICE_TYP()==null?"":oldStruct.getd_OLD_PURPOSE_UNIT_PRICE_TYP()));
			struct.setd_OLD_EFF_PHASE_IN_DATE((oldStruct.getd_OLD_EFF_PHASE_IN_DATE()==null?"":oldStruct.getd_OLD_EFF_PHASE_IN_DATE()));
			struct.setd_OLD_SALES_UNIT_SIZE((oldStruct.getd_OLD_SALES_UNIT_SIZE()==null?"":oldStruct.getd_OLD_SALES_UNIT_SIZE()));
			struct.setd_OLD_SALES_UNIT_COST((oldStruct.getd_OLD_SALES_UNIT_COST()==null?"":oldStruct.getd_OLD_SALES_UNIT_COST()));
			struct.setd_OLD_UNIT_COST_TYP((oldStruct.getd_OLD_UNIT_COST_TYP()==null?"":oldStruct.getd_OLD_UNIT_COST_TYP()));
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_PURPOSE_UNIT_PRICE_TYP("");
			struct.setd_OLD_EFF_PHASE_IN_DATE("");
			struct.setd_OLD_SALES_UNIT_SIZE("0");
			struct.setd_OLD_SALES_UNIT_COST("0");
			struct.setd_OLD_UNIT_COST_TYP("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID = mstappr.getColumnID( "M_SALES_UNIT_COST", "CUST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_CD(columnValue == null?"":columnValue);
			// 品目番号
			columnID = mstappr.getColumnID( "M_SALES_UNIT_COST", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			// 用途別単価区分
			columnID = mstappr.getColumnID( "M_SALES_UNIT_COST", "PURPOSE_UNIT_PRICE_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PURPOSE_UNIT_PRICE_TYP(columnValue == null?"":columnValue);
			// 販売単価有効開始日
			columnID = mstappr.getColumnID( "M_SALES_UNIT_COST", "EFF_PHASE_IN_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EFF_PHASE_IN_DATE(columnValue == null?"":columnValue);
			// サイズ
			columnID = mstappr.getColumnID( "M_SALES_UNIT_COST", "SALES_UNIT_SIZE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SALES_UNIT_SIZE(columnValue == null?"":columnValue);
			// 販売単価
			columnID = mstappr.getColumnID( "M_SALES_UNIT_COST", "SALES_UNIT_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SALES_UNIT_COST(columnValue == null?"":columnValue);
			// 単価区分
			columnID = mstappr.getColumnID( "M_SALES_UNIT_COST", "UNIT_COST_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST_TYP(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_PURPOSE_UNIT_PRICE_TYP("");
			struct.setd_NEW_EFF_PHASE_IN_DATE("");
			struct.setd_NEW_SALES_UNIT_SIZE("0");
			struct.setd_NEW_SALES_UNIT_COST("0");
			struct.setd_NEW_UNIT_COST_TYP("");
		}

		// 単価区分
		struct.setd_OLD_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_OLD_UNIT_COST_TYP()));
		struct.setd_NEW_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_NEW_UNIT_COST_TYP()));
    	// 用途別単価区分
		struct.setd_OLD_PURPOSE_UNIT_PRICE_TYP(getTypeName(_PURPOSE_UNIT_PRICE_TYP,struct.getd_OLD_PURPOSE_UNIT_PRICE_TYP()));
		struct.setd_NEW_PURPOSE_UNIT_PRICE_TYP(getTypeName(_PURPOSE_UNIT_PRICE_TYP,struct.getd_NEW_PURPOSE_UNIT_PRICE_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_PURPOSE_UNIT_PRICE_TYP().equals(struct.getd_NEW_PURPOSE_UNIT_PRICE_TYP())){
				struct.setd_PURPOSE_UNIT_PRICE_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_PHASE_IN_DATE().equals(struct.getd_NEW_EFF_PHASE_IN_DATE())){
				struct.setd_EFF_PHASE_IN_DATE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SALES_UNIT_SIZE(), struct.getd_NEW_SALES_UNIT_SIZE())!=0){
				struct.setd_SALES_UNIT_SIZE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SALES_UNIT_COST(), struct.getd_NEW_SALES_UNIT_COST())!=0){
				struct.setd_SALES_UNIT_COST_CHANGE(changed);
			}
			if(!struct.getd_OLD_UNIT_COST_TYP().equals(struct.getd_NEW_UNIT_COST_TYP())){
				struct.setd_UNIT_COST_TYP_CHANGE(changed);
			}
		}
    }
    
    /**
     * 得意先メンテナンスJa
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA1030010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());                      // 取引先コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUSTJa.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD((oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD()));
			struct.setd_OLD_CUST_NAME((oldStruct.getd_OLD_CUST_NAME()==null?"":oldStruct.getd_OLD_CUST_NAME()));
			struct.setd_OLD_CUST_ANAME((oldStruct.getd_OLD_CUST_ANAME()==null?"":oldStruct.getd_OLD_CUST_ANAME()));
			struct.setd_OLD_CUST_KNAME((oldStruct.getd_OLD_CUST_KNAME()==null?"":oldStruct.getd_OLD_CUST_KNAME()));
			struct.setd_OLD_OWN_ORG_CD((oldStruct.getd_OLD_OWN_ORG_CD()==null?"":oldStruct.getd_OLD_OWN_ORG_CD()));
			struct.setd_OLD_OWN_PERSON_CD((oldStruct.getd_OLD_OWN_PERSON_CD()==null?"":oldStruct.getd_OLD_OWN_PERSON_CD()));
			struct.setd_OLD_CUR_CD((oldStruct.getd_OLD_CUR_CD()==null?"":oldStruct.getd_OLD_CUR_CD()));
			struct.setd_OLD_INSPC_ACPT_TYP((oldStruct.getd_OLD_INSPC_ACPT_TYP()==null?"":oldStruct.getd_OLD_INSPC_ACPT_TYP()));
			struct.setd_OLD_EXCH_TYP((oldStruct.getd_OLD_EXCH_TYP()==null?"":oldStruct.getd_OLD_EXCH_TYP()));
			struct.setd_OLD_TAX_CD((oldStruct.getd_OLD_TAX_CD()==null?"":oldStruct.getd_OLD_TAX_CD()));
			struct.setd_OLD_TAX_CALC_TYP((oldStruct.getd_OLD_TAX_CALC_TYP()==null?"":oldStruct.getd_OLD_TAX_CALC_TYP()));
			struct.setd_OLD_TAX_APPLY_TYP((oldStruct.getd_OLD_TAX_APPLY_TYP()==null?"":oldStruct.getd_OLD_TAX_APPLY_TYP()));
			struct.setd_OLD_DETAIL_ROUND_TYP((oldStruct.getd_OLD_DETAIL_ROUND_TYP()==null?"":oldStruct.getd_OLD_DETAIL_ROUND_TYP()));
			struct.setd_OLD_CUST_GRP_CD((oldStruct.getd_OLD_CUST_GRP_CD()==null?"":oldStruct.getd_OLD_CUST_GRP_CD()));
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_CUST_NAME("");
			struct.setd_OLD_CUST_ANAME("");
			struct.setd_OLD_CUST_KNAME("");
			struct.setd_OLD_OWN_ORG_CD("");
			struct.setd_OLD_OWN_PERSON_CD("");
			struct.setd_OLD_CUR_CD("");
			struct.setd_OLD_INSPC_ACPT_TYP("");
			struct.setd_OLD_EXCH_TYP("");
			struct.setd_OLD_TAX_CD("");
			struct.setd_OLD_TAX_CALC_TYP("");
			struct.setd_OLD_TAX_APPLY_TYP("");
			struct.setd_OLD_DETAIL_ROUND_TYP("");
			struct.setd_OLD_CUST_GRP_CD("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID = mstappr.getColumnID( "M_CUST", "CUST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_CD(columnValue == null?"":columnValue);
			// 得意先名称
			columnID = mstappr.getColumnID( "M_CUST", "CUST_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_NAME(columnValue == null?"":columnValue);
			// 得意先名称略称
			columnID = mstappr.getColumnID( "M_CUST", "CUST_ANAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_ANAME(columnValue == null?"":columnValue);
			// 得意先名称(カナ)
			columnID = mstappr.getColumnID( "M_CUST", "CUST_KNAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_KNAME(columnValue == null?"":columnValue);
			// 自社担当部門コード
			columnID = mstappr.getColumnID( "M_CUST", "OWN_ORG_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OWN_ORG_CD(columnValue == null?"":columnValue);
			// 自社担当者コード
			columnID = mstappr.getColumnID( "M_CUST", "OWN_PERSON_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OWN_PERSON_CD(columnValue == null?"":columnValue);
			// 通貨コード
			columnID = mstappr.getColumnID( "M_CUST", "CUR_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUR_CD(columnValue == null?"":columnValue);
			// 検収区分
			columnID = mstappr.getColumnID( "M_CUST", "INSPC_ACPT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_INSPC_ACPT_TYP(columnValue == null?"":columnValue);
			// 為替種別
			columnID = mstappr.getColumnID( "M_CUST", "EXCH_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EXCH_TYP(columnValue == null?"":columnValue);
			// 消費税コード
			columnID = mstappr.getColumnID( "M_CUST", "TAX_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TAX_CD(columnValue == null?"":columnValue);
			// 消費税計算区分
			columnID = mstappr.getColumnID( "M_CUST", "TAX_CALC_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TAX_CALC_TYP(columnValue == null?"":columnValue);
			// 消費税適用区分
			columnID = mstappr.getColumnID( "M_CUST", "TAX_APPLY_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TAX_APPLY_TYP(columnValue == null?"":columnValue);
			// 明細計算まるめ区分
			columnID = mstappr.getColumnID( "M_CUST", "DETAIL_ROUND_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DETAIL_ROUND_TYP(columnValue == null?"":columnValue);
			// 得意先グループコード
			columnID = mstappr.getColumnID( "M_CUST", "CUST_GRP_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_GRP_CD(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_CUST_NAME("");
			struct.setd_NEW_CUST_ANAME("");
			struct.setd_NEW_CUST_KNAME("");
			struct.setd_NEW_OWN_ORG_CD("");
			struct.setd_NEW_OWN_PERSON_CD("");
			struct.setd_NEW_CUR_CD("");
			struct.setd_NEW_INSPC_ACPT_TYP("");
			struct.setd_NEW_EXCH_TYP("");
			struct.setd_NEW_TAX_CD("");
			struct.setd_NEW_TAX_CALC_TYP("");
			struct.setd_NEW_TAX_APPLY_TYP("");
			struct.setd_NEW_DETAIL_ROUND_TYP("");
			struct.setd_NEW_CUST_GRP_CD("");
		}
		 // 検収区分
		struct.setd_OLD_INSPC_ACPT_TYP(getTypeName(_INSPC_ACPT_TYP,struct.getd_OLD_INSPC_ACPT_TYP()));
		struct.setd_NEW_INSPC_ACPT_TYP(getTypeName(_INSPC_ACPT_TYP,struct.getd_NEW_INSPC_ACPT_TYP()));
		// 為替種別
		struct.setd_OLD_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_OLD_EXCH_TYP()));
		struct.setd_NEW_EXCH_TYP(getTypeName(_EXCH_TYP,struct.getd_NEW_EXCH_TYP()));
		// 消費税計算区分
		struct.setd_OLD_TAX_CALC_TYP(getTypeName(_TAX_CALC_TYP_SAAR,struct.getd_OLD_TAX_CALC_TYP()));
		struct.setd_NEW_TAX_CALC_TYP(getTypeName(_TAX_CALC_TYP_SAAR,struct.getd_NEW_TAX_CALC_TYP()));
		// 消費税適用区分
		struct.setd_OLD_TAX_APPLY_TYP(getTypeName(_TAX_APPLY_TYP_SAAR,struct.getd_OLD_TAX_APPLY_TYP()));
		struct.setd_NEW_TAX_APPLY_TYP(getTypeName(_TAX_APPLY_TYP_SAAR,struct.getd_NEW_TAX_APPLY_TYP()));
		// 明細計算まるめ区分
		struct.setd_OLD_DETAIL_ROUND_TYP(getTypeName(_DETAIL_ROUND_TYP,struct.getd_OLD_DETAIL_ROUND_TYP()));
		struct.setd_NEW_DETAIL_ROUND_TYP(getTypeName(_DETAIL_ROUND_TYP,struct.getd_NEW_DETAIL_ROUND_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())) {
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_NAME().equals(struct.getd_NEW_CUST_NAME())) {
				struct.setd_CUST_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_ANAME().equals(struct.getd_NEW_CUST_ANAME())) {
				struct.setd_CUST_ANAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_KNAME().equals(struct.getd_NEW_CUST_KNAME())) {
				struct.setd_CUST_KNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_OWN_ORG_CD().equals(struct.getd_NEW_OWN_ORG_CD())) {
				struct.setd_OWN_ORG_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_OWN_PERSON_CD().equals(struct.getd_NEW_OWN_PERSON_CD())) {
				struct.setd_OWN_PERSON_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUR_CD().equals(struct.getd_NEW_CUR_CD())) {
				struct.setd_CUR_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_INSPC_ACPT_TYP().equals(struct.getd_NEW_INSPC_ACPT_TYP())) {
				struct.setd_INSPC_ACPT_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_EXCH_TYP().equals(struct.getd_NEW_EXCH_TYP())) {
				struct.setd_EXCH_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_TAX_CD().equals(struct.getd_NEW_TAX_CD())) {
				struct.setd_TAX_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_TAX_CALC_TYP().equals(struct.getd_NEW_TAX_CALC_TYP())) {
				struct.setd_TAX_CALC_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_TAX_APPLY_TYP().equals(struct.getd_NEW_TAX_APPLY_TYP())) {
				struct.setd_TAX_APPLY_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_DETAIL_ROUND_TYP().equals(struct.getd_NEW_DETAIL_ROUND_TYP())) {
				struct.setd_DETAIL_ROUND_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_GRP_CD().equals(struct.getd_NEW_CUST_GRP_CD())) {
				struct.setd_CUST_GRP_CD_CHANGE(changed);
			}
		}
    }
    
    /**
     * 納品場所メンテナンスJa
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA1040010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){  
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());           	//会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());           			//得意先コード
    		oldStruct.setDLV_LOC_CD(keyvalueMap.get("DLV_LOC_CD").toString());            	//納品場所コード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_DLV_LOC.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD((oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD()));
			struct.setd_OLD_DLV_LOC_CD((oldStruct.getd_OLD_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_DLV_LOC_CD()));
			struct.setd_OLD_DLV_LOC_NAME((oldStruct.getd_OLD_DLV_LOC_NAME()==null?"":oldStruct.getd_OLD_DLV_LOC_NAME()));
			struct.setd_OLD_DLV_LOC_KNAME((oldStruct.getd_OLD_DLV_LOC_KNAME()==null?"":oldStruct.getd_OLD_DLV_LOC_KNAME()));
			struct.setd_OLD_DLV_LOC_ENAME((oldStruct.getd_OLD_DLV_LOC_ENAME()==null?"":oldStruct.getd_OLD_DLV_LOC_ENAME()));
			struct.setd_OLD_ZIP_CD((oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD()));
			struct.setd_OLD_ADDRESS_1((oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1()));
			struct.setd_OLD_ADDRESS_2((oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2()));
			struct.setd_OLD_ADDRESS_K_1((oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1()));
			struct.setd_OLD_ADDRESS_K_2((oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2()));
			struct.setd_OLD_TEL((oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL()));
			struct.setd_OLD_FAX((oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX()));
			struct.setd_OLD_CNCNTRT_DLV_LOC_CD((oldStruct.getd_OLD_CNCNTRT_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_CNCNTRT_DLV_LOC_CD()));
			struct.setd_OLD_SHIP_CTL_TYP((oldStruct.getd_OLD_SHIP_CTL_TYP()==null?"":oldStruct.getd_OLD_SHIP_CTL_TYP()));
			struct.setd_OLD_DLV_SLIP_ISS_FLG((oldStruct.getd_OLD_DLV_SLIP_ISS_FLG()==null?"":oldStruct.getd_OLD_DLV_SLIP_ISS_FLG()));
			struct.setd_OLD_IDENT_CARD_F_ISS_TYP((oldStruct.getd_OLD_IDENT_CARD_F_ISS_TYP()==null?"":oldStruct.getd_OLD_IDENT_CARD_F_ISS_TYP()));
			struct.setd_OLD_IDENT_CARD_F_FORMAT_TYP((oldStruct.getd_OLD_IDENT_CARD_F_FORMAT_TYP()==null?"":oldStruct.getd_OLD_IDENT_CARD_F_FORMAT_TYP()));
			struct.setd_OLD_SHIP_FIX_TERM((oldStruct.getd_OLD_SHIP_FIX_TERM()==null?"":oldStruct.getd_OLD_SHIP_FIX_TERM()));
			struct.setd_OLD_MASS_PRODUCT_TYP((oldStruct.getd_OLD_MASS_PRODUCT_TYP()==null?"":oldStruct.getd_OLD_MASS_PRODUCT_TYP()));
			struct.setd_OLD_DECISION_REPLACE_PTN((oldStruct.getd_OLD_DECISION_REPLACE_PTN()==null?"":oldStruct.getd_OLD_DECISION_REPLACE_PTN()));
			struct.setd_OLD_SHIP_RSLT_APPLY_TYP((oldStruct.getd_OLD_SHIP_RSLT_APPLY_TYP()==null?"":oldStruct.getd_OLD_SHIP_RSLT_APPLY_TYP()));
			struct.setd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP((oldStruct.getd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP()==null?"":oldStruct.getd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP()));
			struct.setd_OLD_NEXT_DLV_SHIFT_EFF_FLG((oldStruct.getd_OLD_NEXT_DLV_SHIFT_EFF_FLG()==null?"":oldStruct.getd_OLD_NEXT_DLV_SHIFT_EFF_FLG()));
			struct.setd_OLD_UNCNFM_PLAN_AVG_FLG((oldStruct.getd_OLD_UNCNFM_PLAN_AVG_FLG()==null?"":oldStruct.getd_OLD_UNCNFM_PLAN_AVG_FLG()));
			struct.setd_OLD_TRANSPORT_CD((oldStruct.getd_OLD_TRANSPORT_CD()==null?"":oldStruct.getd_OLD_TRANSPORT_CD()));
			struct.setd_OLD_CNCNTRT_TRANS_LT((oldStruct.getd_OLD_CNCNTRT_TRANS_LT()==null?"":oldStruct.getd_OLD_CNCNTRT_TRANS_LT()));
			struct.setd_OLD_CUST_TRANS_LT((oldStruct.getd_OLD_CUST_TRANS_LT()==null?"":oldStruct.getd_OLD_CUST_TRANS_LT()));
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_DLV_LOC_CD("");
			struct.setd_OLD_DLV_LOC_NAME("");
			struct.setd_OLD_DLV_LOC_KNAME("");
			struct.setd_OLD_DLV_LOC_ENAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
			struct.setd_OLD_CNCNTRT_DLV_LOC_CD("");
			struct.setd_OLD_SHIP_CTL_TYP("");
			struct.setd_OLD_DLV_SLIP_ISS_FLG("");
			struct.setd_OLD_IDENT_CARD_F_ISS_TYP("");
			struct.setd_OLD_IDENT_CARD_F_FORMAT_TYP("");
			struct.setd_OLD_SHIP_FIX_TERM("0");
			struct.setd_OLD_MASS_PRODUCT_TYP("");
			struct.setd_OLD_DECISION_REPLACE_PTN("");
			struct.setd_OLD_SHIP_RSLT_APPLY_TYP("");
			struct.setd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP("");
			struct.setd_OLD_NEXT_DLV_SHIFT_EFF_FLG("");
			struct.setd_OLD_UNCNFM_PLAN_AVG_FLG("");
			struct.setd_OLD_TRANSPORT_CD("");
			struct.setd_OLD_CNCNTRT_TRANS_LT("0");
			struct.setd_OLD_CUST_TRANS_LT("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID = mstappr.getColumnID( "M_DLV_LOC", "CUST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_CD(columnValue == null?"":columnValue);
			// 納品場所コード
			columnID = mstappr.getColumnID( "M_DLV_LOC", "DLV_LOC_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DLV_LOC_CD(columnValue == null?"":columnValue);
			// 納品場所名
			columnID = mstappr.getColumnID( "M_DLV_LOC", "DLV_LOC_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DLV_LOC_NAME(columnValue == null?"":columnValue);
			// 納品場所名(カナ)
			columnID = mstappr.getColumnID( "M_DLV_LOC", "DLV_LOC_KNAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DLV_LOC_KNAME(columnValue == null?"":columnValue);
			// 納品場所名(英名)
			columnID = mstappr.getColumnID( "M_DLV_LOC", "DLV_LOC_ENAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DLV_LOC_ENAME(columnValue == null?"":columnValue);
			// 郵便番号
			columnID = mstappr.getColumnID( "M_DLV_LOC", "ZIP_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ZIP_CD(columnValue == null?"":columnValue);
			// 住所1
			columnID = mstappr.getColumnID( "M_DLV_LOC", "ADDRESS_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_1(columnValue == null?"":columnValue);
			// 住所2
			columnID = mstappr.getColumnID( "M_DLV_LOC", "ADDRESS_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_2(columnValue == null?"":columnValue);
			// 住所(カナ)1
			columnID = mstappr.getColumnID( "M_DLV_LOC", "ADDRESS_K_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue == null?"":columnValue);
			// 住所(カナ)2
			columnID = mstappr.getColumnID( "M_DLV_LOC", "ADDRESS_K_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue == null?"":columnValue);
			// 電話番号
			columnID = mstappr.getColumnID( "M_DLV_LOC", "TEL");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TEL(columnValue == null?"":columnValue);
			// FAX番号
			columnID = mstappr.getColumnID( "M_DLV_LOC", "FAX");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FAX(columnValue == null?"":columnValue);
			// 集結場所コード
			columnID = mstappr.getColumnID( "M_DLV_LOC", "CNCNTRT_DLV_LOC_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CNCNTRT_DLV_LOC_CD(columnValue == null?"":columnValue);
			// 出荷管理先区分
			columnID = mstappr.getColumnID( "M_DLV_LOC", "SHIP_CTL_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SHIP_CTL_TYP(columnValue == null?"":columnValue);
			// 納品書発行フラグ
			columnID = mstappr.getColumnID( "M_DLV_LOC", "DLV_SLIP_ISS_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DLV_SLIP_ISS_FLG(columnValue == null?"":columnValue);
			// 現品エフ発行区分
			columnID = mstappr.getColumnID( "M_DLV_LOC", "IDENT_CARD_F_ISS_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_IDENT_CARD_F_ISS_TYP(columnValue == null?"":columnValue);
			// 現品エフフォーマット区分
			columnID = mstappr.getColumnID( "M_DLV_LOC", "IDENT_CARD_F_FORMAT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_IDENT_CARD_F_FORMAT_TYP(columnValue == null?"":columnValue);
			// 出荷固定期間
			columnID = mstappr.getColumnID( "M_DLV_LOC", "SHIP_FIX_TERM");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SHIP_FIX_TERM(columnValue == null?"":columnValue);
			// 量産区分
			columnID = mstappr.getColumnID( "M_DLV_LOC", "MASS_PRODUCT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MASS_PRODUCT_TYP(columnValue == null?"":columnValue);
			// 確定置換パターン
			columnID = mstappr.getColumnID( "M_DLV_LOC", "DECISION_REPLACE_PTN");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DECISION_REPLACE_PTN(columnValue == null?"":columnValue);
			// 出荷実績適用区分
			columnID = mstappr.getColumnID( "M_DLV_LOC", "SHIP_RSLT_APPLY_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SHIP_RSLT_APPLY_TYP(columnValue == null?"":columnValue);
			// 集結先出荷実績適用区分
			columnID = mstappr.getColumnID( "M_DLV_LOC", "CNCNTRT_SHIP_RSLT_APPLY_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP(columnValue == null?"":columnValue);
			// 次便ずらし有無フラグ
			columnID = mstappr.getColumnID( "M_DLV_LOC", "NEXT_DLV_SHIFT_EFF_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_NEXT_DLV_SHIFT_EFF_FLG(columnValue == null?"":columnValue);
			// 内示計画均等割りフラグ
			columnID = mstappr.getColumnID( "M_DLV_LOC", "UNCNFM_PLAN_AVG_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNCNFM_PLAN_AVG_FLG(columnValue == null?"":columnValue);
			// 運送便コード
			columnID = mstappr.getColumnID( "M_DLV_LOC", "TRANSPORT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TRANSPORT_CD(columnValue == null?"":columnValue);
			// 集結場所への運送日数
			columnID = mstappr.getColumnID( "M_DLV_LOC", "CNCNTRT_TRANS_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CNCNTRT_TRANS_LT(columnValue == null?"":columnValue);
			// 納品場所への運送日数
			columnID = mstappr.getColumnID( "M_DLV_LOC", "CUST_TRANS_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_TRANS_LT(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_DLV_LOC_CD("");
			struct.setd_NEW_DLV_LOC_NAME("");
			struct.setd_NEW_DLV_LOC_KNAME("");
			struct.setd_NEW_DLV_LOC_ENAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
			struct.setd_NEW_CNCNTRT_DLV_LOC_CD("");
			struct.setd_NEW_SHIP_CTL_TYP("");
			struct.setd_NEW_DLV_SLIP_ISS_FLG("");
			struct.setd_NEW_IDENT_CARD_F_ISS_TYP("");
			struct.setd_NEW_IDENT_CARD_F_FORMAT_TYP("");
			struct.setd_NEW_SHIP_FIX_TERM("0");
			struct.setd_NEW_MASS_PRODUCT_TYP("");
			struct.setd_NEW_DECISION_REPLACE_PTN("");
			struct.setd_NEW_SHIP_RSLT_APPLY_TYP("");
			struct.setd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP("");
			struct.setd_NEW_NEXT_DLV_SHIFT_EFF_FLG("");
			struct.setd_NEW_UNCNFM_PLAN_AVG_FLG("");
			struct.setd_NEW_TRANSPORT_CD("");
			struct.setd_NEW_CNCNTRT_TRANS_LT("0");
			struct.setd_NEW_CUST_TRANS_LT("0");
		}


		// 出荷管理先区分
		struct.setd_OLD_SHIP_CTL_TYP(getTypeName(_SHIP_CTL_TYP,struct.getd_OLD_SHIP_CTL_TYP()));
		struct.setd_NEW_SHIP_CTL_TYP(getTypeName(_SHIP_CTL_TYP,struct.getd_NEW_SHIP_CTL_TYP()));
    	// 納品書発行フラグ
		struct.setd_OLD_DLV_SLIP_ISS_FLG(getTypeName(_DLV_SLIP_ISS_FLG,struct.getd_OLD_DLV_SLIP_ISS_FLG()));
		struct.setd_NEW_DLV_SLIP_ISS_FLG(getTypeName(_DLV_SLIP_ISS_FLG,struct.getd_NEW_DLV_SLIP_ISS_FLG()));
    	// 現品エフ発行区分
    	struct.setd_OLD_IDENT_CARD_F_ISS_TYP(getTypeName(_IDENT_CARD_F_ISS_TYP,struct.getd_OLD_IDENT_CARD_F_ISS_TYP()));
 		struct.setd_NEW_IDENT_CARD_F_ISS_TYP(getTypeName(_IDENT_CARD_F_ISS_TYP,struct.getd_NEW_IDENT_CARD_F_ISS_TYP()));
    	// 現品エフフォーマット区分
        struct.setd_OLD_IDENT_CARD_F_FORMAT_TYP(getTypeName(_IDENT_CARD_F_FORMAT_TYP,struct.getd_OLD_IDENT_CARD_F_FORMAT_TYP()));
		struct.setd_NEW_IDENT_CARD_F_FORMAT_TYP(getTypeName(_IDENT_CARD_F_FORMAT_TYP,struct.getd_NEW_IDENT_CARD_F_FORMAT_TYP()));
    	//量産区分
    	struct.setd_OLD_MASS_PRODUCT_TYP(getTypeName(_MASS_PRODUCT_TYP,struct.getd_OLD_MASS_PRODUCT_TYP()));
		struct.setd_NEW_MASS_PRODUCT_TYP(getTypeName(_MASS_PRODUCT_TYP,struct.getd_NEW_MASS_PRODUCT_TYP()));
    	// 確定置換パターン
    	struct.setd_OLD_DECISION_REPLACE_PTN(getTypeName(_DECISION_REPLACE_PTN,struct.getd_OLD_DECISION_REPLACE_PTN()));
		struct.setd_NEW_DECISION_REPLACE_PTN(getTypeName(_DECISION_REPLACE_PTN,struct.getd_NEW_DECISION_REPLACE_PTN()));
    	//出荷実績適用区分
    	struct.setd_OLD_SHIP_RSLT_APPLY_TYP(getTypeName(_SHIP_RSLT_APPLY_TYP,struct.getd_OLD_SHIP_RSLT_APPLY_TYP()));
 		struct.setd_NEW_SHIP_RSLT_APPLY_TYP(getTypeName(_SHIP_RSLT_APPLY_TYP,struct.getd_NEW_SHIP_RSLT_APPLY_TYP()));
    	// 集結先出荷実績適用区分
    	struct.setd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP(getTypeName(_CNCNTRT_SHIP_RSLT_APPLY_TYP,struct.getd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP()));
 		struct.setd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP(getTypeName(_CNCNTRT_SHIP_RSLT_APPLY_TYP,struct.getd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP()));
    	// 次便ずらし有無フラグ
    	struct.setd_OLD_NEXT_DLV_SHIFT_EFF_FLG(getTypeName(_NEXT_DLV_SHIFT_EFF_FLG,struct.getd_OLD_NEXT_DLV_SHIFT_EFF_FLG()));
 		struct.setd_NEW_NEXT_DLV_SHIFT_EFF_FLG(getTypeName(_NEXT_DLV_SHIFT_EFF_FLG,struct.getd_NEW_NEXT_DLV_SHIFT_EFF_FLG()));
    	// 内示計画均等割りフラグ
    	struct.setd_OLD_UNCNFM_PLAN_AVG_FLG(getTypeName(_UNCNFM_PLAN_AVG_FLG,struct.getd_OLD_UNCNFM_PLAN_AVG_FLG()));
 		struct.setd_NEW_UNCNFM_PLAN_AVG_FLG(getTypeName(_UNCNFM_PLAN_AVG_FLG,struct.getd_NEW_UNCNFM_PLAN_AVG_FLG()));

		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())) {
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_DLV_LOC_CD().equals(struct.getd_NEW_DLV_LOC_CD())) {
				struct.setd_DLV_LOC_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_DLV_LOC_NAME().equals(struct.getd_NEW_DLV_LOC_NAME())) {
				struct.setd_DLV_LOC_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_DLV_LOC_KNAME().equals(struct.getd_NEW_DLV_LOC_KNAME())) {
				struct.setd_DLV_LOC_KNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_DLV_LOC_ENAME().equals(struct.getd_NEW_DLV_LOC_ENAME())) {
				struct.setd_DLV_LOC_ENAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())) {
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())) {
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())) {
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())) {
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())) {
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())) {
				struct.setd_TEL_CHANGE(changed);
			}
			if (!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())) {
				struct.setd_FAX_CHANGE(changed);
			}
			if (!struct.getd_OLD_CNCNTRT_DLV_LOC_CD().equals(struct.getd_NEW_CNCNTRT_DLV_LOC_CD())) {
				struct.setd_CNCNTRT_DLV_LOC_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_SHIP_CTL_TYP().equals(struct.getd_NEW_SHIP_CTL_TYP())) {
				struct.setd_SHIP_CTL_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_DLV_SLIP_ISS_FLG().equals(struct.getd_NEW_DLV_SLIP_ISS_FLG())) {
				struct.setd_DLV_SLIP_ISS_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_IDENT_CARD_F_ISS_TYP().equals(struct.getd_NEW_IDENT_CARD_F_ISS_TYP())) {
				struct.setd_IDENT_CARD_F_ISS_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_IDENT_CARD_F_FORMAT_TYP().equals(struct.getd_NEW_IDENT_CARD_F_FORMAT_TYP())) {
				struct.setd_IDENT_CARD_F_FORMAT_TYP_CHANGE(changed);
			}
			if (Calculate.compare(struct.getd_OLD_SHIP_FIX_TERM(), struct.getd_NEW_SHIP_FIX_TERM())!=0) {
				struct.setd_SHIP_FIX_TERM_CHANGE(changed);
			}
			if (!struct.getd_OLD_MASS_PRODUCT_TYP().equals(struct.getd_NEW_MASS_PRODUCT_TYP())) {
				struct.setd_MASS_PRODUCT_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_DECISION_REPLACE_PTN().equals(struct.getd_NEW_DECISION_REPLACE_PTN())) {
				struct.setd_DECISION_REPLACE_PTN_CHANGE(changed);
			}
			if (!struct.getd_OLD_SHIP_RSLT_APPLY_TYP().equals(struct.getd_NEW_SHIP_RSLT_APPLY_TYP())) {
				struct.setd_SHIP_RSLT_APPLY_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP().equals(struct.getd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP())) {
				struct.setd_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_NEXT_DLV_SHIFT_EFF_FLG().equals(struct.getd_NEW_NEXT_DLV_SHIFT_EFF_FLG())) {
				struct.setd_NEXT_DLV_SHIFT_EFF_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_UNCNFM_PLAN_AVG_FLG().equals(struct.getd_NEW_UNCNFM_PLAN_AVG_FLG())) {
				struct.setd_UNCNFM_PLAN_AVG_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_TRANSPORT_CD().equals(struct.getd_NEW_TRANSPORT_CD())) {
				struct.setd_TRANSPORT_CD_CHANGE(changed);
			}
			if (Calculate.compare(struct.getd_OLD_CNCNTRT_TRANS_LT(), struct.getd_NEW_CNCNTRT_TRANS_LT())!= 0) {
				struct.setd_CNCNTRT_TRANS_LT_CHANGE(changed);
			}
			if (Calculate.compare(struct.getd_OLD_CUST_TRANS_LT(), struct.getd_NEW_CUST_TRANS_LT())!= 0) {
				struct.setd_CUST_TRANS_LT_CHANGE(changed);
			}
		}
    }
    
    /**
     * 得意先指定納品場所メンテナンスJa
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA1080010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());           		//会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());           			//得意先コード
    		oldStruct.setCUST_DESINATED_DLV_LOC_CD(keyvalueMap.get("CUST_DESINATED_DLV_LOC_CD").toString());      //得意先指定納品場所コード
    		oldStruct.setDLV_LOC_OPTION_CHANGE_VALUE(keyvalueMap.get("DLV_LOC_OPTION_CHANGE_VALUE").toString());    //納品場所任意変換値

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST_DESINATED_DLV_LOC.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD((oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD()));
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_CD((oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_CD()));
			struct.setd_OLD_DLV_LOC_OPTION_CHANGE_VALUE((oldStruct.getd_OLD_DLV_LOC_OPTION_CHANGE_VALUE()==null?"":oldStruct.getd_OLD_DLV_LOC_OPTION_CHANGE_VALUE()));
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_NAME((oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_NAME()==null?"":oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_NAME()));
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_KNAME((oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_KNAME()==null?"":oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_KNAME()));
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_ENAME((oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_ENAME()==null?"":oldStruct.getd_OLD_CUST_DESINATED_DLV_LOC_ENAME()));
			struct.setd_OLD_ZIP_CD((oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD()));
			struct.setd_OLD_ADDRESS_1((oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1()));
			struct.setd_OLD_ADDRESS_2((oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2()));
			struct.setd_OLD_ADDRESS_K_1((oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1()));
			struct.setd_OLD_ADDRESS_K_2((oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2()));
			struct.setd_OLD_TEL((oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL()));
			struct.setd_OLD_FAX((oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX()));
			struct.setd_OLD_DLV_LOC_CD((oldStruct.getd_OLD_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_DLV_LOC_CD()));
			struct.setd_OLD_REMARKS_1((oldStruct.getd_OLD_REMARKS_1()==null?"":oldStruct.getd_OLD_REMARKS_1()));
			struct.setd_OLD_REMARKS_2((oldStruct.getd_OLD_REMARKS_2()==null?"":oldStruct.getd_OLD_REMARKS_2()));
			struct.setd_OLD_REMARKS_3((oldStruct.getd_OLD_REMARKS_3()==null?"":oldStruct.getd_OLD_REMARKS_3()));
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_CD("");
			struct.setd_OLD_DLV_LOC_OPTION_CHANGE_VALUE("");
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_NAME("");
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_KNAME("");
			struct.setd_OLD_CUST_DESINATED_DLV_LOC_ENAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
			struct.setd_OLD_DLV_LOC_CD("");
			struct.setd_OLD_REMARKS_1("");
			struct.setd_OLD_REMARKS_2("");
			struct.setd_OLD_REMARKS_3("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "CUST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_CD(columnValue == null?"":columnValue);
			// 得意先指定納品場所コード
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "CUST_DESINATED_DLV_LOC_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_CD(columnValue == null?"":columnValue);
			// 納品場所任意変換値
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "DLV_LOC_OPTION_CHANGE_VALUE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DLV_LOC_OPTION_CHANGE_VALUE(columnValue == null?"":columnValue);
			// 得意先指定納品場所名称
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "CUST_DESINATED_DLV_LOC_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_NAME(columnValue == null?"":columnValue);
			// 得意先指定納品場所名称（カナ）
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "CUST_DESINATED_DLV_LOC_KNAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_KNAME(columnValue == null?"":columnValue);
			// 得意先指定納品場所名称（英名）
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "CUST_DESINATED_DLV_LOC_ENAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_ENAME(columnValue == null?"":columnValue);
			// 郵便番号
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "ZIP_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ZIP_CD(columnValue == null?"":columnValue);
			// 住所１
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "ADDRESS_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_1(columnValue == null?"":columnValue);
			// 住所２
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "ADDRESS_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_2(columnValue == null?"":columnValue);
			// 住所（カナ）１
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "ADDRESS_K_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue == null?"":columnValue);
			// 住所（カナ）２
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "ADDRESS_K_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue == null?"":columnValue);
			// 電話番号
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "TEL");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TEL(columnValue == null?"":columnValue);
			// ＦＡＸ番号
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "FAX");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FAX(columnValue == null?"":columnValue);
			// 納品場所コード
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "DLV_LOC_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DLV_LOC_CD(columnValue == null?"":columnValue);
			// 備考１
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "REMARKS_1");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_REMARKS_1(columnValue == null?"":columnValue);
			// 備考２
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "REMARKS_2");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_REMARKS_2(columnValue == null?"":columnValue);
			// 備考３
			columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "REMARKS_3");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_REMARKS_3(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_CD("");
			struct.setd_NEW_DLV_LOC_OPTION_CHANGE_VALUE("");
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_NAME("");
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_KNAME("");
			struct.setd_NEW_CUST_DESINATED_DLV_LOC_ENAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
			struct.setd_NEW_DLV_LOC_CD("");
			struct.setd_NEW_REMARKS_1("");
			struct.setd_NEW_REMARKS_2("");
			struct.setd_NEW_REMARKS_3("");
		}

		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())) {
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_DESINATED_DLV_LOC_CD().equals(struct.getd_NEW_CUST_DESINATED_DLV_LOC_CD())) {
				struct.setd_CUST_DESINATED_DLV_LOC_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_DLV_LOC_OPTION_CHANGE_VALUE().equals(struct.getd_NEW_DLV_LOC_OPTION_CHANGE_VALUE())) {
				struct.setd_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_DESINATED_DLV_LOC_NAME().equals(struct.getd_NEW_CUST_DESINATED_DLV_LOC_NAME())) {
				struct.setd_CUST_DESINATED_DLV_LOC_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_DESINATED_DLV_LOC_KNAME().equals(struct.getd_NEW_CUST_DESINATED_DLV_LOC_KNAME())) {
				struct.setd_CUST_DESINATED_DLV_LOC_KNAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_CUST_DESINATED_DLV_LOC_ENAME().equals(struct.getd_NEW_CUST_DESINATED_DLV_LOC_ENAME())) {
				struct.setd_CUST_DESINATED_DLV_LOC_ENAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())) {
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())) {
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())) {
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())) {
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())) {
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())) {
				struct.setd_TEL_CHANGE(changed);
			}
			if (!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())) {
				struct.setd_FAX_CHANGE(changed);
			}
			if (!struct.getd_OLD_DLV_LOC_CD().equals(struct.getd_NEW_DLV_LOC_CD())) {
				struct.setd_DLV_LOC_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_REMARKS_1().equals(struct.getd_NEW_REMARKS_1())) {
				struct.setd_REMARKS_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_REMARKS_2().equals(struct.getd_NEW_REMARKS_2())) {
				struct.setd_REMARKS_2_CHANGE(changed);
			}
			if (!struct.getd_OLD_REMARKS_3().equals(struct.getd_NEW_REMARKS_3())) {
				struct.setd_REMARKS_3_CHANGE(changed);
			}
		}
    }
    /**
     * 品目メンテナンス
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA0010010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());           		//品目番号
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_ITEM.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD((oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD()));
			struct.setd_OLD_ITEM_NAME((oldStruct.getd_OLD_ITEM_NAME()==null?"":oldStruct.getd_OLD_ITEM_NAME()));
			struct.setd_OLD_DRAW_CD((oldStruct.getd_OLD_DRAW_CD()==null?"":oldStruct.getd_OLD_DRAW_CD()));
			struct.setd_OLD_SPEC((oldStruct.getd_OLD_SPEC()==null?"":oldStruct.getd_OLD_SPEC()));
			struct.setd_OLD_HIGH_LEVEL_NO((oldStruct.getd_OLD_HIGH_LEVEL_NO()==null?"":oldStruct.getd_OLD_HIGH_LEVEL_NO()));
			struct.setd_OLD_MRP_ODR_TYP((oldStruct.getd_OLD_MRP_ODR_TYP()==null?"":oldStruct.getd_OLD_MRP_ODR_TYP()));
			struct.setd_OLD_OUTSIDE_TYP((oldStruct.getd_OLD_OUTSIDE_TYP()==null?"":oldStruct.getd_OLD_OUTSIDE_TYP()));
			struct.setd_OLD_STOCK_UNIT_FLG((oldStruct.getd_OLD_STOCK_UNIT_FLG()==null?"":oldStruct.getd_OLD_STOCK_UNIT_FLG()));
			struct.setd_OLD_STOCK_UNIT((oldStruct.getd_OLD_STOCK_UNIT()==null?"":oldStruct.getd_OLD_STOCK_UNIT()));
			struct.setd_OLD_PKG_UNIT((oldStruct.getd_OLD_PKG_UNIT()==null?"":oldStruct.getd_OLD_PKG_UNIT()));
			struct.setd_OLD_PKG_UNIT_QTY((oldStruct.getd_OLD_PKG_UNIT_QTY()==null?"":oldStruct.getd_OLD_PKG_UNIT_QTY()));
			struct.setd_OLD_UNIT_QTY_TYP((oldStruct.getd_OLD_UNIT_QTY_TYP()==null?"":oldStruct.getd_OLD_UNIT_QTY_TYP()));
			struct.setd_OLD_ODR_LT((oldStruct.getd_OLD_ODR_LT()==null?"":oldStruct.getd_OLD_ODR_LT()));
			struct.setd_OLD_FIXED_LT((oldStruct.getd_OLD_FIXED_LT()==null?"":oldStruct.getd_OLD_FIXED_LT()));
			struct.setd_OLD_PROP_LT((oldStruct.getd_OLD_PROP_LT()==null?"":oldStruct.getd_OLD_PROP_LT()));
			struct.setd_OLD_SAFETY_LT((oldStruct.getd_OLD_SAFETY_LT()==null?"":oldStruct.getd_OLD_SAFETY_LT()));
			struct.setd_OLD_ISSUE_LT((oldStruct.getd_OLD_ISSUE_LT()==null?"":oldStruct.getd_OLD_ISSUE_LT()));
			struct.setd_OLD_PROP_LOT_SIZE((oldStruct.getd_OLD_PROP_LOT_SIZE()==null?"":oldStruct.getd_OLD_PROP_LOT_SIZE()));
			struct.setd_OLD_ITEM_SPOIL((oldStruct.getd_OLD_ITEM_SPOIL()==null?"":oldStruct.getd_OLD_ITEM_SPOIL()));
			struct.setd_OLD_SAFETY_STOCK((oldStruct.getd_OLD_SAFETY_STOCK()==null?"":oldStruct.getd_OLD_SAFETY_STOCK()));
			struct.setd_OLD_LOT_SIZING_TYP((oldStruct.getd_OLD_LOT_SIZING_TYP()==null?"":oldStruct.getd_OLD_LOT_SIZING_TYP()));
			struct.setd_OLD_MAX_PERIOD((oldStruct.getd_OLD_MAX_PERIOD()==null?"":oldStruct.getd_OLD_MAX_PERIOD()));
			struct.setd_OLD_MAX_ODR_QTY((oldStruct.getd_OLD_MAX_ODR_QTY()==null?"":oldStruct.getd_OLD_MAX_ODR_QTY()));
			struct.setd_OLD_ODR_POINT((oldStruct.getd_OLD_ODR_POINT()==null?"":oldStruct.getd_OLD_ODR_POINT()));
			struct.setd_OLD_FIXED_ODR_QTY((oldStruct.getd_OLD_FIXED_ODR_QTY()==null?"":oldStruct.getd_OLD_FIXED_ODR_QTY()));
			struct.setd_OLD_MIN_ODR_QTY((oldStruct.getd_OLD_MIN_ODR_QTY()==null?"":oldStruct.getd_OLD_MIN_ODR_QTY()));
			struct.setd_OLD_MUL_ODR_QTY((oldStruct.getd_OLD_MUL_ODR_QTY()==null?"":oldStruct.getd_OLD_MUL_ODR_QTY()));
			struct.setd_OLD_ISSUE_TYP((oldStruct.getd_OLD_ISSUE_TYP()==null?"":oldStruct.getd_OLD_ISSUE_TYP()));
			struct.setd_OLD_MPS_FLG((oldStruct.getd_OLD_MPS_FLG()==null?"":oldStruct.getd_OLD_MPS_FLG()));
			struct.setd_OLD_ACPT_INSPC_TYP((oldStruct.getd_OLD_ACPT_INSPC_TYP()==null?"":oldStruct.getd_OLD_ACPT_INSPC_TYP()));
			struct.setd_OLD_PRODUCT_TYP((oldStruct.getd_OLD_PRODUCT_TYP()==null?"":oldStruct.getd_OLD_PRODUCT_TYP()));
			struct.setd_OLD_CLASIFICATION_CD((oldStruct.getd_OLD_CLASIFICATION_CD()==null?"":oldStruct.getd_OLD_CLASIFICATION_CD()));
			struct.setd_OLD_UNIT_WEIGHT((oldStruct.getd_OLD_UNIT_WEIGHT()==null?"":oldStruct.getd_OLD_UNIT_WEIGHT()));
			struct.setd_OLD_ABC_TYP((oldStruct.getd_OLD_ABC_TYP()==null?"":oldStruct.getd_OLD_ABC_TYP()));
			struct.setd_OLD_OPR_RSLT_TYP((oldStruct.getd_OLD_OPR_RSLT_TYP()==null?"":oldStruct.getd_OLD_OPR_RSLT_TYP()));
			struct.setd_OLD_SPL_ITEM_TYP((oldStruct.getd_OLD_SPL_ITEM_TYP()==null?"":oldStruct.getd_OLD_SPL_ITEM_TYP()));
			struct.setd_OLD_TAX_CD((oldStruct.getd_OLD_TAX_CD()==null?"":oldStruct.getd_OLD_TAX_CD()));
			struct.setd_OLD_CAL_NO((oldStruct.getd_OLD_CAL_NO()==null?"":oldStruct.getd_OLD_CAL_NO()));
			struct.setd_OLD_BEST_BEFORE_YEAR((oldStruct.getd_OLD_BEST_BEFORE_YEAR()==null?"":oldStruct.getd_OLD_BEST_BEFORE_YEAR()));
			struct.setd_OLD_BEST_BEFORE_MONTH((oldStruct.getd_OLD_BEST_BEFORE_MONTH()==null?"":oldStruct.getd_OLD_BEST_BEFORE_MONTH()));
			struct.setd_OLD_BEST_BEFORE_DAY((oldStruct.getd_OLD_BEST_BEFORE_DAY()==null?"":oldStruct.getd_OLD_BEST_BEFORE_DAY()));
			struct.setd_OLD_LOT_CTRL_FLG((oldStruct.getd_OLD_LOT_CTRL_FLG()==null?"":oldStruct.getd_OLD_LOT_CTRL_FLG()));
			struct.setd_OLD_LOT_NUMBERING_TYP((oldStruct.getd_OLD_LOT_NUMBERING_TYP()==null?"":oldStruct.getd_OLD_LOT_NUMBERING_TYP()));
			struct.setd_OLD_DEPO_TYP((oldStruct.getd_OLD_DEPO_TYP()==null?"":oldStruct.getd_OLD_DEPO_TYP()));
			struct.setd_OLD_MANHOUR_TYP((oldStruct.getd_OLD_MANHOUR_TYP()==null?"":oldStruct.getd_OLD_MANHOUR_TYP()));
			
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_ITEM_NAME("");
			struct.setd_OLD_DRAW_CD("");
			struct.setd_OLD_SPEC("");
			struct.setd_OLD_HIGH_LEVEL_NO("");
			struct.setd_OLD_MRP_ODR_TYP("");
			struct.setd_OLD_OUTSIDE_TYP("");
			struct.setd_OLD_STOCK_UNIT_FLG("");
			struct.setd_OLD_STOCK_UNIT("");
			struct.setd_OLD_PKG_UNIT("");
			struct.setd_OLD_PKG_UNIT_QTY("0");
			struct.setd_OLD_UNIT_QTY_TYP("");
			struct.setd_OLD_ODR_LT("0");
			struct.setd_OLD_FIXED_LT("0");
			struct.setd_OLD_PROP_LT("0");
			struct.setd_OLD_SAFETY_LT("0");
			struct.setd_OLD_ISSUE_LT("0");
			struct.setd_OLD_PROP_LOT_SIZE("0");
			struct.setd_OLD_ITEM_SPOIL("0");
			struct.setd_OLD_SAFETY_STOCK("0");
			struct.setd_OLD_LOT_SIZING_TYP("");
			struct.setd_OLD_MAX_PERIOD("0");
			struct.setd_OLD_MAX_ODR_QTY("0");
			struct.setd_OLD_ODR_POINT("0");
			struct.setd_OLD_FIXED_ODR_QTY("0");
			struct.setd_OLD_MIN_ODR_QTY("0");
			struct.setd_OLD_MUL_ODR_QTY("0");
			struct.setd_OLD_ISSUE_TYP("");
			struct.setd_OLD_MPS_FLG("");
			struct.setd_OLD_ACPT_INSPC_TYP("");
			struct.setd_OLD_PRODUCT_TYP("");
			struct.setd_OLD_CLASIFICATION_CD("");
			struct.setd_OLD_UNIT_WEIGHT("0");
			struct.setd_OLD_ABC_TYP("");
			struct.setd_OLD_OPR_RSLT_TYP("");
			struct.setd_OLD_SPL_ITEM_TYP("");
			struct.setd_OLD_TAX_CD("");
			struct.setd_OLD_CAL_NO("");
			struct.setd_OLD_BEST_BEFORE_YEAR("0");
			struct.setd_OLD_BEST_BEFORE_MONTH("0");
			struct.setd_OLD_BEST_BEFORE_DAY("0");
			struct.setd_OLD_LOT_CTRL_FLG("");
			struct.setd_OLD_LOT_NUMBERING_TYP("");
			struct.setd_OLD_DEPO_TYP("");
			struct.setd_OLD_MANHOUR_TYP("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);

			// 品目名
			columnID = mstappr.getColumnID( "M_ITEM", "ITEM_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_NAME(columnValue == null?"":columnValue);

			// 図面番号
			columnID = mstappr.getColumnID( "M_ITEM", "DRAW_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DRAW_CD(columnValue == null?"":columnValue);

			// 規格
			columnID = mstappr.getColumnID( "M_ITEM", "SPEC");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SPEC(columnValue == null?"":columnValue);

			// レベル番号
			columnID = mstappr.getColumnID( "M_ITEM", "HIGH_LEVEL_NO");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_HIGH_LEVEL_NO(columnValue == null?"":columnValue);

			// 品目手配区分
			columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MRP_ODR_TYP(columnValue == null?"":columnValue);

			// 品目内外作区分
			columnID = mstappr.getColumnID( "M_ITEM", "OUTSIDE_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OUTSIDE_TYP(columnValue == null?"":columnValue);

			// 荷姿管理フラグ
			columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STOCK_UNIT_FLG(columnValue == null?"":columnValue);

			// 計量単位
			columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STOCK_UNIT(columnValue == null?"":columnValue);

			// 荷姿計量単位
			columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PKG_UNIT(columnValue == null?"":columnValue);

			// 荷姿単位数
			columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PKG_UNIT_QTY(columnValue == null?"":columnValue);

			// 在庫数単位区分
			columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_QTY_TYP(columnValue == null?"":columnValue);

			// 品目手配リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "ODR_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ODR_LT(columnValue == null?"":columnValue);

			// 品目固定分リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "FIXED_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FIXED_LT(columnValue == null?"":columnValue);

			// 品目比例分リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "PROP_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROP_LT(columnValue == null?"":columnValue);

			// 安全日数
			columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SAFETY_LT(columnValue == null?"":columnValue);

			// 払出リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ISSUE_LT(columnValue == null?"":columnValue);

			// 品目比例分ロットサイズ
			columnID = mstappr.getColumnID( "M_ITEM", "PROP_LOT_SIZE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROP_LOT_SIZE(columnValue == null?"":columnValue);

			// 品目仕損率
			columnID = mstappr.getColumnID( "M_ITEM", "ITEM_SPOIL");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_SPOIL(columnValue == null?"":columnValue);

			// 安全在庫量
			columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SAFETY_STOCK(columnValue == null?"":columnValue);

			// ロットまとめ区分
			columnID = mstappr.getColumnID( "M_ITEM", "LOT_SIZING_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LOT_SIZING_TYP(columnValue == null?"":columnValue);

			// 最大まとめ期間
			columnID = mstappr.getColumnID( "M_ITEM", "MAX_PERIOD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MAX_PERIOD(columnValue == null?"":columnValue);

			// 最大手配数
			columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MAX_ODR_QTY(columnValue == null?"":columnValue);

			// 発注点在庫数
			columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ODR_POINT(columnValue == null?"":columnValue);

			// 定量発注数
			columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FIXED_ODR_QTY(columnValue == null?"":columnValue);

			// 最小手配数
			columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MIN_ODR_QTY(columnValue == null?"":columnValue);

			// まるめ単位
			columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MUL_ODR_QTY(columnValue == null?"":columnValue);

			// 出庫区分
			columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ISSUE_TYP(columnValue == null?"":columnValue);

			//MPS品目フラグ
			columnID = mstappr.getColumnID( "M_ITEM", "MPS_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MPS_FLG(columnValue == null?"":columnValue);

			//受入検査区分
			columnID = mstappr.getColumnID( "M_ITEM", "ACPT_INSPC_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACPT_INSPC_TYP(columnValue == null?"":columnValue);

			// 製品区分
			columnID = mstappr.getColumnID( "M_ITEM", "PRODUCT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PRODUCT_TYP(columnValue == null?"":columnValue);

			// 管理コード
			columnID = mstappr.getColumnID( "M_ITEM", "CLASIFICATION_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CLASIFICATION_CD(columnValue == null?"":columnValue);

			// 単位重量
			columnID = mstappr.getColumnID( "M_ITEM", "UNIT_WEIGHT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_WEIGHT(columnValue == null?"":columnValue);

			// 棚卸区分
			columnID = mstappr.getColumnID( "M_ITEM", "ABC_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ABC_TYP(columnValue == null?"":columnValue);

			// 作業実績区分
			columnID = mstappr.getColumnID( "M_ITEM", "OPR_RSLT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OPR_RSLT_TYP(columnValue == null?"":columnValue);

			// 受給品区分
			columnID = mstappr.getColumnID( "M_ITEM", "SPL_ITEM_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SPL_ITEM_TYP(columnValue == null?"":columnValue);

			// 消費税コード
			columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TAX_CD(columnValue == null?"":columnValue);

			//カレンダ番号
			columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CAL_NO(columnValue == null?"":columnValue);

			// 賞味期限年数
			columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_YEAR");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BEST_BEFORE_YEAR(columnValue == null?"":columnValue);

			// 賞味期限月数
			columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_MONTH");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BEST_BEFORE_MONTH(columnValue == null?"":columnValue);

			// 賞味期限日数
			columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DAY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BEST_BEFORE_DAY(columnValue == null?"":columnValue);

			// ロット管理フラグ
			columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LOT_CTRL_FLG(columnValue == null?"":columnValue);

			// ロット番号採番区分
			columnID = mstappr.getColumnID( "M_ITEM", "LOT_NUMBERING_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LOT_NUMBERING_TYP(columnValue == null?"":columnValue);

			// 保管区分
			columnID = mstappr.getColumnID( "M_ITEM", "DEPO_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DEPO_TYP(columnValue == null?"":columnValue);

			// 工数管理品目区分
			columnID = mstappr.getColumnID( "M_ITEM", "MANHOUR_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MANHOUR_TYP(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_ITEM_NAME("");
			struct.setd_NEW_DRAW_CD("");
			struct.setd_NEW_SPEC("");
			struct.setd_NEW_HIGH_LEVEL_NO("");
			struct.setd_NEW_MRP_ODR_TYP("");
			struct.setd_NEW_OUTSIDE_TYP("");
			struct.setd_NEW_STOCK_UNIT_FLG("");
			struct.setd_NEW_STOCK_UNIT("");
			struct.setd_NEW_PKG_UNIT("");
			struct.setd_NEW_PKG_UNIT_QTY("0");
			struct.setd_NEW_UNIT_QTY_TYP("");
			struct.setd_NEW_ODR_LT("0");
			struct.setd_NEW_FIXED_LT("0");
			struct.setd_NEW_PROP_LT("0");
			struct.setd_NEW_SAFETY_LT("0");
			struct.setd_NEW_ISSUE_LT("0");
			struct.setd_NEW_PROP_LOT_SIZE("0");
			struct.setd_NEW_ITEM_SPOIL("0");
			struct.setd_NEW_SAFETY_STOCK("0");
			struct.setd_NEW_LOT_SIZING_TYP("");
			struct.setd_NEW_MAX_PERIOD("0");
			struct.setd_NEW_MAX_ODR_QTY("0");
			struct.setd_NEW_ODR_POINT("0");
			struct.setd_NEW_FIXED_ODR_QTY("0");
			struct.setd_NEW_MIN_ODR_QTY("0");
			struct.setd_NEW_MUL_ODR_QTY("0");
			struct.setd_NEW_ISSUE_TYP("");
			struct.setd_NEW_MPS_FLG("");
			struct.setd_NEW_ACPT_INSPC_TYP("");
			struct.setd_NEW_PRODUCT_TYP("");
			struct.setd_NEW_CLASIFICATION_CD("");
			struct.setd_NEW_UNIT_WEIGHT("0");
			struct.setd_NEW_ABC_TYP("");
			struct.setd_NEW_OPR_RSLT_TYP("");
			struct.setd_NEW_SPL_ITEM_TYP("");
			struct.setd_NEW_TAX_CD("");
			struct.setd_NEW_CAL_NO("");
			struct.setd_NEW_BEST_BEFORE_YEAR("0");
			struct.setd_NEW_BEST_BEFORE_MONTH("0");
			struct.setd_NEW_BEST_BEFORE_DAY("0");
			struct.setd_NEW_LOT_CTRL_FLG("");
			struct.setd_NEW_LOT_NUMBERING_TYP("");
			struct.setd_NEW_DEPO_TYP("");
			struct.setd_NEW_MANHOUR_TYP("");
		}

		// 出庫区分を設定
		struct.setd_OLD_ISSUE_TYP(getTypeName(_ISSUE_TYP,struct.getd_OLD_ISSUE_TYP()));
		struct.setd_NEW_ISSUE_TYP(getTypeName(_ISSUE_TYP,struct.getd_NEW_ISSUE_TYP()));

		// 内外作区分を設定
		struct.setd_OLD_OUTSIDE_TYP(getTypeName(_OUTSIDE_TYP,struct.getd_OLD_OUTSIDE_TYP()));
		struct.setd_NEW_OUTSIDE_TYP(getTypeName(_OUTSIDE_TYP,struct.getd_NEW_OUTSIDE_TYP()));

		// 荷姿管理フラグを設定
		struct.setd_OLD_STOCK_UNIT_FLG(getTypeName(_STOCK_UNIT_FLG,struct.getd_OLD_STOCK_UNIT_FLG()));
		struct.setd_NEW_STOCK_UNIT_FLG(getTypeName(_STOCK_UNIT_FLG,struct.getd_NEW_STOCK_UNIT_FLG()));

		// 在庫数単位区分を設定
		struct.setd_OLD_UNIT_QTY_TYP(getTypeName(_UNIT_QTY_TYP,struct.getd_OLD_UNIT_QTY_TYP()));
		struct.setd_NEW_UNIT_QTY_TYP(getTypeName(_UNIT_QTY_TYP,struct.getd_NEW_UNIT_QTY_TYP()));

		// 品目手配区分を設定
		struct.setd_OLD_MRP_ODR_TYP(getTypeName(_MRP_ODR_TYP,struct.getd_OLD_MRP_ODR_TYP()));
		struct.setd_NEW_MRP_ODR_TYP(getTypeName(_MRP_ODR_TYP,struct.getd_NEW_MRP_ODR_TYP()));

		// ロットまとめ区分を設定
		struct.setd_OLD_LOT_SIZING_TYP(getTypeName(_LOT_SIZING_TYP,struct.getd_OLD_LOT_SIZING_TYP()));
		struct.setd_NEW_LOT_SIZING_TYP(getTypeName(_LOT_SIZING_TYP,struct.getd_NEW_LOT_SIZING_TYP()));

		// 工数管理品目区分を設定
		struct.setd_OLD_MANHOUR_TYP(getTypeName(_MANHOUR_TYP,struct.getd_OLD_MANHOUR_TYP()));
		struct.setd_NEW_MANHOUR_TYP(getTypeName(_MANHOUR_TYP,struct.getd_NEW_MANHOUR_TYP()));

		// MPS品目フラグを設定
		struct.setd_OLD_MPS_FLG(getTypeName(_MPS_FLG,struct.getd_OLD_MPS_FLG()));
		struct.setd_NEW_MPS_FLG(getTypeName(_MPS_FLG,struct.getd_NEW_MPS_FLG()));

		// 受入検査区分を設定
		struct.setd_OLD_ACPT_INSPC_TYP(getTypeName(_ACPT_INSPC_TYP,struct.getd_OLD_ACPT_INSPC_TYP()));
		struct.setd_NEW_ACPT_INSPC_TYP(getTypeName(_ACPT_INSPC_TYP,struct.getd_NEW_ACPT_INSPC_TYP()));

		// 製品区分を設定
		struct.setd_OLD_PRODUCT_TYP(getTypeName(_PRODUCT_TYP,struct.getd_OLD_PRODUCT_TYP()));
		struct.setd_NEW_PRODUCT_TYP(getTypeName(_PRODUCT_TYP,struct.getd_NEW_PRODUCT_TYP()));

		// 棚卸区分を設定
		struct.setd_OLD_ABC_TYP(getTypeName(_ABC_TYP,struct.getd_OLD_ABC_TYP()));
		struct.setd_NEW_ABC_TYP(getTypeName(_ABC_TYP,struct.getd_NEW_ABC_TYP()));

		// 作業実績区分を設定
		struct.setd_OLD_OPR_RSLT_TYP(getTypeName(_OPR_RSLT_TYP,struct.getd_OLD_OPR_RSLT_TYP()));
		struct.setd_NEW_OPR_RSLT_TYP(getTypeName(_OPR_RSLT_TYP,struct.getd_NEW_OPR_RSLT_TYP()));

		// 受給品区分を設定
		struct.setd_OLD_SPL_ITEM_TYP(getTypeName(_SPL_ITEM_TYP,struct.getd_OLD_SPL_ITEM_TYP()));
		struct.setd_NEW_SPL_ITEM_TYP(getTypeName(_SPL_ITEM_TYP,struct.getd_NEW_SPL_ITEM_TYP()));

		// 計量単位を設定
		struct.setd_OLD_STOCK_UNIT(getTypeName(_STOCK_UNIT,struct.getd_OLD_STOCK_UNIT()));
		struct.setd_NEW_STOCK_UNIT(getTypeName(_STOCK_UNIT,struct.getd_NEW_STOCK_UNIT()));

		// 保管区分を設定
		struct.setd_OLD_DEPO_TYP(getTypeName(_DEPO_TYP,struct.getd_OLD_DEPO_TYP()));
		struct.setd_NEW_DEPO_TYP(getTypeName(_DEPO_TYP,struct.getd_NEW_DEPO_TYP()));

		// ロット管理フラグを設定
		struct.setd_OLD_LOT_CTRL_FLG(getTypeName(_LOT_CTRL_FLG,struct.getd_OLD_LOT_CTRL_FLG()));
		struct.setd_NEW_LOT_CTRL_FLG(getTypeName(_LOT_CTRL_FLG,struct.getd_NEW_LOT_CTRL_FLG()));

		// ロット採番区分を設定
		struct.setd_OLD_LOT_NUMBERING_TYP(getTypeName(_LOT_NUMBERING_TYP,struct.getd_OLD_LOT_NUMBERING_TYP()));
		struct.setd_NEW_LOT_NUMBERING_TYP(getTypeName(_LOT_NUMBERING_TYP,struct.getd_NEW_LOT_NUMBERING_TYP()));

		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())) {
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_ITEM_NAME().equals(struct.getd_NEW_ITEM_NAME())) {
				struct.setd_ITEM_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_DRAW_CD().equals(struct.getd_NEW_DRAW_CD())) {
				struct.setd_DRAW_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_SPEC().equals(struct.getd_NEW_SPEC())) {
				struct.setd_SPEC_CHANGE(changed);
			}
			if (!struct.getd_OLD_HIGH_LEVEL_NO().equals(struct.getd_NEW_HIGH_LEVEL_NO())) {
				struct.setd_HIGH_LEVEL_NO_CHANGE(changed);
			}
			if (!struct.getd_OLD_MRP_ODR_TYP().equals(struct.getd_NEW_MRP_ODR_TYP())) {
				struct.setd_MRP_ODR_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_OUTSIDE_TYP().equals(struct.getd_NEW_OUTSIDE_TYP())) {
				struct.setd_OUTSIDE_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_STOCK_UNIT_FLG().equals(struct.getd_NEW_STOCK_UNIT_FLG())) {
				struct.setd_STOCK_UNIT_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_STOCK_UNIT().equals(struct.getd_NEW_STOCK_UNIT())) {
				struct.setd_STOCK_UNIT_CHANGE(changed);
			}
			if (!struct.getd_OLD_PKG_UNIT().equals(struct.getd_NEW_PKG_UNIT())) {
				struct.setd_PKG_UNIT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PKG_UNIT_QTY(), struct.getd_NEW_PKG_UNIT_QTY())!= 0){
				struct.setd_PKG_UNIT_QTY_CHANGE(changed);
			}
			if (!struct.getd_OLD_UNIT_QTY_TYP().equals(struct.getd_NEW_UNIT_QTY_TYP())) {
				struct.setd_UNIT_QTY_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ODR_LT(), struct.getd_NEW_ODR_LT())!= 0){
				struct.setd_ODR_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_FIXED_LT(), struct.getd_NEW_FIXED_LT())!= 0){
				struct.setd_FIXED_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PROP_LT(), struct.getd_NEW_PROP_LT())!= 0){
				struct.setd_PROP_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SAFETY_LT(), struct.getd_NEW_SAFETY_LT())!= 0){
				struct.setd_SAFETY_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ISSUE_LT(), struct.getd_NEW_ISSUE_LT())!= 0){
				struct.setd_ISSUE_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PROP_LOT_SIZE(), struct.getd_NEW_PROP_LOT_SIZE())!= 0){
				struct.setd_PROP_LOT_SIZE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ITEM_SPOIL(), struct.getd_NEW_ITEM_SPOIL())!= 0){
				struct.setd_ITEM_SPOIL_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SAFETY_STOCK(), struct.getd_NEW_SAFETY_STOCK())!= 0){
				struct.setd_SAFETY_STOCK_CHANGE(changed);
			}
			if (!struct.getd_OLD_LOT_SIZING_TYP().equals(struct.getd_NEW_LOT_SIZING_TYP())) {
				struct.setd_LOT_SIZING_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MAX_PERIOD(), struct.getd_NEW_MAX_PERIOD())!= 0){
				struct.setd_MAX_PERIOD_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MAX_ODR_QTY(), struct.getd_NEW_MAX_ODR_QTY())!= 0){
				struct.setd_MAX_ODR_QTY_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ODR_POINT(), struct.getd_NEW_ODR_POINT())!= 0){
				struct.setd_ODR_POINT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_FIXED_ODR_QTY(), struct.getd_NEW_FIXED_ODR_QTY())!= 0){
				struct.setd_FIXED_ODR_QTY_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MIN_ODR_QTY(), struct.getd_NEW_MIN_ODR_QTY())!= 0){
				struct.setd_MIN_ODR_QTY_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MUL_ODR_QTY(), struct.getd_NEW_MUL_ODR_QTY())!= 0){
				struct.setd_MUL_ODR_QTY_CHANGE(changed);
			}
			if (!struct.getd_OLD_ISSUE_TYP().equals(struct.getd_NEW_ISSUE_TYP())) {
				struct.setd_ISSUE_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_MPS_FLG().equals(struct.getd_NEW_MPS_FLG())) {
				struct.setd_MPS_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_ACPT_INSPC_TYP().equals(struct.getd_NEW_ACPT_INSPC_TYP())) {
				struct.setd_ACPT_INSPC_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_PRODUCT_TYP().equals(struct.getd_NEW_PRODUCT_TYP())) {
				struct.setd_PRODUCT_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_CLASIFICATION_CD().equals(struct.getd_NEW_CLASIFICATION_CD())) {
				struct.setd_CLASIFICATION_CD_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_UNIT_WEIGHT(), struct.getd_NEW_UNIT_WEIGHT())!= 0){
				struct.setd_UNIT_WEIGHT_CHANGE(changed);
			}
			if (!struct.getd_OLD_ABC_TYP().equals(struct.getd_NEW_ABC_TYP())) {
				struct.setd_ABC_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_OPR_RSLT_TYP().equals(struct.getd_NEW_OPR_RSLT_TYP())) {
				struct.setd_OPR_RSLT_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_SPL_ITEM_TYP().equals(struct.getd_NEW_SPL_ITEM_TYP())) {
				struct.setd_SPL_ITEM_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_TAX_CD().equals(struct.getd_NEW_TAX_CD())) {
				struct.setd_TAX_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_CAL_NO().equals(struct.getd_NEW_CAL_NO())) {
				struct.setd_CAL_NO_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_BEST_BEFORE_YEAR(), struct.getd_NEW_BEST_BEFORE_YEAR())!= 0){
				struct.setd_BEST_BEFORE_YEAR_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_BEST_BEFORE_MONTH(), struct.getd_NEW_BEST_BEFORE_MONTH())!= 0){
				struct.setd_BEST_BEFORE_MONTH_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_BEST_BEFORE_DAY(), struct.getd_NEW_BEST_BEFORE_DAY())!= 0){
				struct.setd_BEST_BEFORE_DAY_CHANGE(changed);
			}
			if (!struct.getd_OLD_LOT_CTRL_FLG().equals(struct.getd_NEW_LOT_CTRL_FLG())) {
				struct.setd_LOT_CTRL_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_LOT_NUMBERING_TYP().equals(struct.getd_NEW_LOT_NUMBERING_TYP())) {
				struct.setd_LOT_NUMBERING_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_DEPO_TYP().equals(struct.getd_NEW_DEPO_TYP())) {
				struct.setd_DEPO_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_MANHOUR_TYP().equals(struct.getd_NEW_MANHOUR_TYP())) {
				struct.setd_MANHOUR_TYP_CHANGE(changed);
			}
		}
    }
   
    /**
     * 品目メンテナンスJF
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA2010010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());           		//品目番号
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_ITEM_JF.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD((oldStruct.getd_OLD_ITEM_CD()==null?"":oldStruct.getd_OLD_ITEM_CD()));
			struct.setd_OLD_ITEM_NAME((oldStruct.getd_OLD_ITEM_NAME()==null?"":oldStruct.getd_OLD_ITEM_NAME()));
			struct.setd_OLD_DRAW_CD((oldStruct.getd_OLD_DRAW_CD()==null?"":oldStruct.getd_OLD_DRAW_CD()));
			struct.setd_OLD_SPEC((oldStruct.getd_OLD_SPEC()==null?"":oldStruct.getd_OLD_SPEC()));
			struct.setd_OLD_HIGH_LEVEL_NO((oldStruct.getd_OLD_HIGH_LEVEL_NO()==null?"":oldStruct.getd_OLD_HIGH_LEVEL_NO()));
			struct.setd_OLD_MRP_ODR_TYP((oldStruct.getd_OLD_MRP_ODR_TYP()==null?"":oldStruct.getd_OLD_MRP_ODR_TYP()));
			struct.setd_OLD_OUTSIDE_TYP((oldStruct.getd_OLD_OUTSIDE_TYP()==null?"":oldStruct.getd_OLD_OUTSIDE_TYP()));
			struct.setd_OLD_STOCK_UNIT_FLG((oldStruct.getd_OLD_STOCK_UNIT_FLG()==null?"":oldStruct.getd_OLD_STOCK_UNIT_FLG()));
			struct.setd_OLD_STOCK_UNIT((oldStruct.getd_OLD_STOCK_UNIT()==null?"":oldStruct.getd_OLD_STOCK_UNIT()));
			struct.setd_OLD_PATTERN_CD((oldStruct.getd_OLD_PATTERN_CD()==null?"":oldStruct.getd_OLD_PATTERN_CD()));
			struct.setd_OLD_SET_LT((oldStruct.getd_OLD_SET_LT()==null?"":oldStruct.getd_OLD_SET_LT()));
			struct.setd_OLD_UNIT_QTY_TYP((oldStruct.getd_OLD_UNIT_QTY_TYP()==null?"":oldStruct.getd_OLD_UNIT_QTY_TYP()));
			struct.setd_OLD_ODR_LT((oldStruct.getd_OLD_ODR_LT()==null?"":oldStruct.getd_OLD_ODR_LT()));
			struct.setd_OLD_FIXED_LT((oldStruct.getd_OLD_FIXED_LT()==null?"":oldStruct.getd_OLD_FIXED_LT()));
			struct.setd_OLD_PROP_LT((oldStruct.getd_OLD_PROP_LT()==null?"":oldStruct.getd_OLD_PROP_LT()));
			struct.setd_OLD_SAFETY_LT((oldStruct.getd_OLD_SAFETY_LT()==null?"":oldStruct.getd_OLD_SAFETY_LT()));
			struct.setd_OLD_ISSUE_LT((oldStruct.getd_OLD_ISSUE_LT()==null?"":oldStruct.getd_OLD_ISSUE_LT()));
			struct.setd_OLD_PROP_LOT_SIZE((oldStruct.getd_OLD_PROP_LOT_SIZE()==null?"":oldStruct.getd_OLD_PROP_LOT_SIZE()));
			struct.setd_OLD_ITEM_SPOIL((oldStruct.getd_OLD_ITEM_SPOIL()==null?"":oldStruct.getd_OLD_ITEM_SPOIL()));
			struct.setd_OLD_SAFETY_STOCK((oldStruct.getd_OLD_SAFETY_STOCK()==null?"":oldStruct.getd_OLD_SAFETY_STOCK()));
			struct.setd_OLD_LOT_SIZING_TYP((oldStruct.getd_OLD_LOT_SIZING_TYP()==null?"":oldStruct.getd_OLD_LOT_SIZING_TYP()));
			struct.setd_OLD_MAX_PERIOD((oldStruct.getd_OLD_MAX_PERIOD()==null?"":oldStruct.getd_OLD_MAX_PERIOD()));
			struct.setd_OLD_MAX_ODR_QTY((oldStruct.getd_OLD_MAX_ODR_QTY()==null?"":oldStruct.getd_OLD_MAX_ODR_QTY()));
			struct.setd_OLD_ODR_POINT((oldStruct.getd_OLD_ODR_POINT()==null?"":oldStruct.getd_OLD_ODR_POINT()));
			struct.setd_OLD_FIXED_ODR_QTY((oldStruct.getd_OLD_FIXED_ODR_QTY()==null?"":oldStruct.getd_OLD_FIXED_ODR_QTY()));
			struct.setd_OLD_MIN_ODR_QTY((oldStruct.getd_OLD_MIN_ODR_QTY()==null?"":oldStruct.getd_OLD_MIN_ODR_QTY()));
			struct.setd_OLD_MUL_ODR_QTY((oldStruct.getd_OLD_MUL_ODR_QTY()==null?"":oldStruct.getd_OLD_MUL_ODR_QTY()));
			struct.setd_OLD_ISSUE_TYP((oldStruct.getd_OLD_ISSUE_TYP()==null?"":oldStruct.getd_OLD_ISSUE_TYP()));
			struct.setd_OLD_MPS_FLG((oldStruct.getd_OLD_MPS_FLG()==null?"":oldStruct.getd_OLD_MPS_FLG()));
			struct.setd_OLD_ACPT_INSPC_TYP((oldStruct.getd_OLD_ACPT_INSPC_TYP()==null?"":oldStruct.getd_OLD_ACPT_INSPC_TYP()));
			struct.setd_OLD_PRODUCT_TYP((oldStruct.getd_OLD_PRODUCT_TYP()==null?"":oldStruct.getd_OLD_PRODUCT_TYP()));
			struct.setd_OLD_CLASIFICATION_CD((oldStruct.getd_OLD_CLASIFICATION_CD()==null?"":oldStruct.getd_OLD_CLASIFICATION_CD()));
			struct.setd_OLD_UNIT_WEIGHT((oldStruct.getd_OLD_UNIT_WEIGHT()==null?"":oldStruct.getd_OLD_UNIT_WEIGHT()));
			struct.setd_OLD_ABC_TYP((oldStruct.getd_OLD_ABC_TYP()==null?"":oldStruct.getd_OLD_ABC_TYP()));
			struct.setd_OLD_OPR_RSLT_TYP((oldStruct.getd_OLD_OPR_RSLT_TYP()==null?"":oldStruct.getd_OLD_OPR_RSLT_TYP()));
			struct.setd_OLD_SPL_ITEM_TYP((oldStruct.getd_OLD_SPL_ITEM_TYP()==null?"":oldStruct.getd_OLD_SPL_ITEM_TYP()));
			struct.setd_OLD_TAX_CD_1((oldStruct.getd_OLD_TAX_CD()==null?"":oldStruct.getd_OLD_TAX_CD()));
			struct.setd_OLD_CAL_NO((oldStruct.getd_OLD_CAL_NO()==null?"":oldStruct.getd_OLD_CAL_NO()));
			struct.setd_OLD_BEST_BEFORE_YEAR((oldStruct.getd_OLD_BEST_BEFORE_YEAR()==null?"":oldStruct.getd_OLD_BEST_BEFORE_YEAR()));
			struct.setd_OLD_BEST_BEFORE_MONTH((oldStruct.getd_OLD_BEST_BEFORE_MONTH()==null?"":oldStruct.getd_OLD_BEST_BEFORE_MONTH()));
			struct.setd_OLD_BEST_BEFORE_DAY((oldStruct.getd_OLD_BEST_BEFORE_DAY()==null?"":oldStruct.getd_OLD_BEST_BEFORE_DAY()));
			struct.setd_OLD_LOT_CTRL_FLG((oldStruct.getd_OLD_LOT_CTRL_FLG()==null?"":oldStruct.getd_OLD_LOT_CTRL_FLG()));
			struct.setd_OLD_LOT_NUMBERING_TYP((oldStruct.getd_OLD_LOT_NUMBERING_TYP()==null?"":oldStruct.getd_OLD_LOT_NUMBERING_TYP()));
			struct.setd_OLD_DEPO_TYP((oldStruct.getd_OLD_DEPO_TYP()==null?"":oldStruct.getd_OLD_DEPO_TYP()));
			struct.setd_OLD_JANCODE((oldStruct.getd_OLD_JANCODE()==null?"":oldStruct.getd_OLD_JANCODE()));
			struct.setd_OLD_MAX_STOCK_QTY((oldStruct.getd_OLD_MAX_STOCK_QTY()==null?"":oldStruct.getd_OLD_MAX_STOCK_QTY()));
			struct.setd_OLD_STOCK_STATUS((oldStruct.getd_OLD_STOCK_STATUS()==null?"":oldStruct.getd_OLD_STOCK_STATUS()));
			struct.setd_OLD_SHIP_DEADLINE_YEAR((oldStruct.getd_OLD_SHIP_DEADLINE_YEAR()==null?"":oldStruct.getd_OLD_SHIP_DEADLINE_YEAR()));
			struct.setd_OLD_SHIP_DEADLINE_MONTH((oldStruct.getd_OLD_SHIP_DEADLINE_MONTH()==null?"":oldStruct.getd_OLD_SHIP_DEADLINE_MONTH()));
			struct.setd_OLD_SHIP_DEADLINE_DAY((oldStruct.getd_OLD_SHIP_DEADLINE_DAY()==null?"":oldStruct.getd_OLD_SHIP_DEADLINE_DAY()));
			
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_ITEM_NAME("");
			struct.setd_OLD_DRAW_CD("");
			struct.setd_OLD_SPEC("");
			struct.setd_OLD_HIGH_LEVEL_NO("");
			struct.setd_OLD_MRP_ODR_TYP("");
			struct.setd_OLD_OUTSIDE_TYP("");
			struct.setd_OLD_STOCK_UNIT_FLG("");
			struct.setd_OLD_STOCK_UNIT("");
			struct.setd_OLD_PATTERN_CD("");
			struct.setd_OLD_SET_LT("0");
			struct.setd_OLD_UNIT_QTY_TYP("");
			struct.setd_OLD_ODR_LT("0");
			struct.setd_OLD_FIXED_LT("0");
			struct.setd_OLD_PROP_LT("0");
			struct.setd_OLD_SAFETY_LT("0");
			struct.setd_OLD_ISSUE_LT("0");
			struct.setd_OLD_PROP_LOT_SIZE("0");
			struct.setd_OLD_ITEM_SPOIL("0");
			struct.setd_OLD_SAFETY_STOCK("0");
			struct.setd_OLD_LOT_SIZING_TYP("");
			struct.setd_OLD_MAX_PERIOD("0");
			struct.setd_OLD_MAX_ODR_QTY("0");
			struct.setd_OLD_ODR_POINT("0");
			struct.setd_OLD_FIXED_ODR_QTY("0");
			struct.setd_OLD_MIN_ODR_QTY("0");
			struct.setd_OLD_MUL_ODR_QTY("0");
			struct.setd_OLD_ISSUE_TYP("");
			struct.setd_OLD_MPS_FLG("");
			struct.setd_OLD_ACPT_INSPC_TYP("");
			struct.setd_OLD_PRODUCT_TYP("");
			struct.setd_OLD_CLASIFICATION_CD("");
			struct.setd_OLD_UNIT_WEIGHT("0");
			struct.setd_OLD_ABC_TYP("");
			struct.setd_OLD_OPR_RSLT_TYP("");
			struct.setd_OLD_SPL_ITEM_TYP("");
			struct.setd_OLD_TAX_CD_1("");
			struct.setd_OLD_CAL_NO("");
			struct.setd_OLD_BEST_BEFORE_YEAR("0");
			struct.setd_OLD_BEST_BEFORE_MONTH("0");
			struct.setd_OLD_BEST_BEFORE_DAY("0");
			struct.setd_OLD_LOT_CTRL_FLG("");
			struct.setd_OLD_LOT_NUMBERING_TYP("");
			struct.setd_OLD_DEPO_TYP("");
			struct.setd_OLD_JANCODE("");
			struct.setd_OLD_MAX_STOCK_QTY("0");
			struct.setd_OLD_STOCK_STATUS("");
			struct.setd_OLD_SHIP_DEADLINE_YEAR("0");
			struct.setd_OLD_SHIP_DEADLINE_MONTH("0");
			struct.setd_OLD_SHIP_DEADLINE_DAY("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);

			// 品目名
			columnID = mstappr.getColumnID( "M_ITEM", "ITEM_NAME");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_NAME(columnValue == null?"":columnValue);

			// 図面番号
			columnID = mstappr.getColumnID( "M_ITEM", "DRAW_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DRAW_CD(columnValue == null?"":columnValue);

			// 規格
			columnID = mstappr.getColumnID( "M_ITEM", "SPEC");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SPEC(columnValue == null?"":columnValue);

			// レベル番号
			columnID = mstappr.getColumnID( "M_ITEM", "HIGH_LEVEL_NO");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_HIGH_LEVEL_NO(columnValue == null?"":columnValue);

			// 品目手配区分
			columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MRP_ODR_TYP(columnValue == null?"":columnValue);

			// 品目内外作区分
			columnID = mstappr.getColumnID( "M_ITEM", "OUTSIDE_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OUTSIDE_TYP(columnValue == null?"":columnValue);

			// 荷姿管理フラグ
			columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STOCK_UNIT_FLG(columnValue == null?"":columnValue);

			// 計量単位
			columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STOCK_UNIT(columnValue == null?"":columnValue);

			// 代表パターンコード
			columnID = mstappr.getColumnID( "M_ITEM", "PATTERN_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PATTERN_CD(columnValue == null?"":columnValue);

			// セットリードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "SET_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SET_LT(columnValue == null?"":columnValue);

			// 在庫数単位区分
			columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_QTY_TYP(columnValue == null?"":columnValue);

			// 品目手配リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "ODR_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ODR_LT(columnValue == null?"":columnValue);

			// 品目固定分リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "FIXED_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FIXED_LT(columnValue == null?"":columnValue);

			// 品目比例分リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "PROP_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROP_LT(columnValue == null?"":columnValue);

			// 安全日数
			columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SAFETY_LT(columnValue == null?"":columnValue);

			// 払出リードタイム
			columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_LT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ISSUE_LT(columnValue == null?"":columnValue);

			// 品目比例分ロットサイズ
			columnID = mstappr.getColumnID( "M_ITEM", "PROP_LOT_SIZE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PROP_LOT_SIZE(columnValue == null?"":columnValue);

			// 品目仕損率
			columnID = mstappr.getColumnID( "M_ITEM", "ITEM_SPOIL");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_SPOIL(columnValue == null?"":columnValue);

			// 安全在庫量
			columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SAFETY_STOCK(columnValue == null?"":columnValue);

			// ロットまとめ区分
			columnID = mstappr.getColumnID( "M_ITEM", "LOT_SIZING_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LOT_SIZING_TYP(columnValue == null?"":columnValue);

			// 最大まとめ期間
			columnID = mstappr.getColumnID( "M_ITEM", "MAX_PERIOD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MAX_PERIOD(columnValue == null?"":columnValue);

			// 最大手配数
			columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MAX_ODR_QTY(columnValue == null?"":columnValue);

			// 発注点在庫数
			columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ODR_POINT(columnValue == null?"":columnValue);

			// 定量発注数
			columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_FIXED_ODR_QTY(columnValue == null?"":columnValue);

			// 最小手配数
			columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MIN_ODR_QTY(columnValue == null?"":columnValue);

			// まるめ単位
			columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MUL_ODR_QTY(columnValue == null?"":columnValue);

			// 出庫区分
			columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ISSUE_TYP(columnValue == null?"":columnValue);

			//MPS品目フラグ
			columnID = mstappr.getColumnID( "M_ITEM", "MPS_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MPS_FLG(columnValue == null?"":columnValue);

			//受入検査区分
			columnID = mstappr.getColumnID( "M_ITEM", "ACPT_INSPC_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ACPT_INSPC_TYP(columnValue == null?"":columnValue);

			// 製品区分
			columnID = mstappr.getColumnID( "M_ITEM", "PRODUCT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_PRODUCT_TYP(columnValue == null?"":columnValue);

			// 管理コード
			columnID = mstappr.getColumnID( "M_ITEM", "CLASIFICATION_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CLASIFICATION_CD(columnValue == null?"":columnValue);

			// 単位重量
			columnID = mstappr.getColumnID( "M_ITEM", "UNIT_WEIGHT");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_WEIGHT(columnValue == null?"":columnValue);

			// 棚卸区分
			columnID = mstappr.getColumnID( "M_ITEM", "ABC_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ABC_TYP(columnValue == null?"":columnValue);

			// 作業実績区分
			columnID = mstappr.getColumnID( "M_ITEM", "OPR_RSLT_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_OPR_RSLT_TYP(columnValue == null?"":columnValue);

			// 受給品区分
			columnID = mstappr.getColumnID( "M_ITEM", "SPL_ITEM_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SPL_ITEM_TYP(columnValue == null?"":columnValue);

			// 消費税コード
			columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_TAX_CD_1(columnValue == null?"":columnValue);

			//カレンダ番号
			columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CAL_NO(columnValue == null?"":columnValue);

			// 賞味期限年数
			columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_YEAR");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BEST_BEFORE_YEAR(columnValue == null?"":columnValue);

			// 賞味期限月数
			columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_MONTH");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BEST_BEFORE_MONTH(columnValue == null?"":columnValue);

			// 賞味期限日数
			columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DAY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_BEST_BEFORE_DAY(columnValue == null?"":columnValue);

			// ロット管理フラグ
			columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LOT_CTRL_FLG(columnValue == null?"":columnValue);

			// ロット番号採番区分
			columnID = mstappr.getColumnID( "M_ITEM", "LOT_NUMBERING_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_LOT_NUMBERING_TYP(columnValue == null?"":columnValue);

			// 保管区分
			columnID = mstappr.getColumnID( "M_ITEM", "DEPO_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_DEPO_TYP(columnValue == null?"":columnValue);

			// JANコード
			columnID = mstappr.getColumnID( "M_ITEM", "JANCODE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_JANCODE(columnValue == null?"":columnValue);
			
			// 最大在庫数
			columnID = mstappr.getColumnID( "M_ITEM", "MAX_STOCK_QTY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_MAX_STOCK_QTY(columnValue == null?"":columnValue);
			
			// 初期在庫状態
			columnID = mstappr.getColumnID( "M_ITEM", "STOCK_STATUS");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_STOCK_STATUS(columnValue == null?"":columnValue);
			
			// 出荷期限年数
			columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_YEAR");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SHIP_DEADLINE_YEAR(columnValue == null?"":columnValue);
			
			// 出荷期限月数
			columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_MONTH");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SHIP_DEADLINE_MONTH(columnValue == null?"":columnValue);
			
			// 出荷期限日数
			columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_DAY");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SHIP_DEADLINE_DAY(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_ITEM_NAME("");
			struct.setd_NEW_DRAW_CD("");
			struct.setd_NEW_SPEC("");
			struct.setd_NEW_HIGH_LEVEL_NO("");
			struct.setd_NEW_MRP_ODR_TYP("");
			struct.setd_NEW_OUTSIDE_TYP("");
			struct.setd_NEW_STOCK_UNIT_FLG("");
			struct.setd_NEW_STOCK_UNIT("");
			struct.setd_NEW_PATTERN_CD("");
			struct.setd_NEW_SET_LT("");
			struct.setd_NEW_UNIT_QTY_TYP("");
			struct.setd_NEW_ODR_LT("0");
			struct.setd_NEW_FIXED_LT("0");
			struct.setd_NEW_PROP_LT("0");
			struct.setd_NEW_SAFETY_LT("0");
			struct.setd_NEW_ISSUE_LT("0");
			struct.setd_NEW_PROP_LOT_SIZE("0");
			struct.setd_NEW_ITEM_SPOIL("0");
			struct.setd_NEW_SAFETY_STOCK("0");
			struct.setd_NEW_LOT_SIZING_TYP("");
			struct.setd_NEW_MAX_PERIOD("0");
			struct.setd_NEW_MAX_ODR_QTY("0");
			struct.setd_NEW_ODR_POINT("0");
			struct.setd_NEW_FIXED_ODR_QTY("0");
			struct.setd_NEW_MIN_ODR_QTY("0");
			struct.setd_NEW_MUL_ODR_QTY("0");
			struct.setd_NEW_ISSUE_TYP("");
			struct.setd_NEW_MPS_FLG("");
			struct.setd_NEW_ACPT_INSPC_TYP("");
			struct.setd_NEW_PRODUCT_TYP("");
			struct.setd_NEW_CLASIFICATION_CD("");
			struct.setd_NEW_UNIT_WEIGHT("0");
			struct.setd_NEW_ABC_TYP("");
			struct.setd_NEW_OPR_RSLT_TYP("");
			struct.setd_NEW_SPL_ITEM_TYP("");
			struct.setd_NEW_TAX_CD_1("");
			struct.setd_NEW_CAL_NO("");
			struct.setd_NEW_BEST_BEFORE_YEAR("0");
			struct.setd_NEW_BEST_BEFORE_MONTH("0");
			struct.setd_NEW_BEST_BEFORE_DAY("0");
			struct.setd_NEW_LOT_CTRL_FLG("");
			struct.setd_NEW_LOT_NUMBERING_TYP("");
			struct.setd_NEW_DEPO_TYP("");
			struct.setd_NEW_JANCODE("");
			struct.setd_NEW_MAX_STOCK_QTY("0");
			struct.setd_NEW_STOCK_STATUS("");
			struct.setd_NEW_SHIP_DEADLINE_YEAR("0");
			struct.setd_NEW_SHIP_DEADLINE_MONTH("0");
			struct.setd_NEW_SHIP_DEADLINE_DAY("0");
		}

		// 出庫区分を設定
		struct.setd_OLD_ISSUE_TYP(getTypeName(_ISSUE_TYP,struct.getd_OLD_ISSUE_TYP()));
		struct.setd_NEW_ISSUE_TYP(getTypeName(_ISSUE_TYP,struct.getd_NEW_ISSUE_TYP()));

		// 内外作区分を設定
		struct.setd_OLD_OUTSIDE_TYP(getTypeName(_OUTSIDE_TYP,struct.getd_OLD_OUTSIDE_TYP()));
		struct.setd_NEW_OUTSIDE_TYP(getTypeName(_OUTSIDE_TYP,struct.getd_NEW_OUTSIDE_TYP()));

		// 荷姿管理フラグを設定
		struct.setd_OLD_STOCK_UNIT_FLG(getTypeName(_STOCK_UNIT_FLG,struct.getd_OLD_STOCK_UNIT_FLG()));
		struct.setd_NEW_STOCK_UNIT_FLG(getTypeName(_STOCK_UNIT_FLG,struct.getd_NEW_STOCK_UNIT_FLG()));

		// 在庫数単位区分を設定
		struct.setd_OLD_UNIT_QTY_TYP(getTypeName(_UNIT_QTY_TYP,struct.getd_OLD_UNIT_QTY_TYP()));
		struct.setd_NEW_UNIT_QTY_TYP(getTypeName(_UNIT_QTY_TYP,struct.getd_NEW_UNIT_QTY_TYP()));

		// 品目手配区分を設定
		struct.setd_OLD_MRP_ODR_TYP(getTypeName(_MRP_ODR_TYP,struct.getd_OLD_MRP_ODR_TYP()));
		struct.setd_NEW_MRP_ODR_TYP(getTypeName(_MRP_ODR_TYP,struct.getd_NEW_MRP_ODR_TYP()));

		// ロットまとめ区分を設定
		struct.setd_OLD_LOT_SIZING_TYP(getTypeName(_LOT_SIZING_TYP,struct.getd_OLD_LOT_SIZING_TYP()));
		struct.setd_NEW_LOT_SIZING_TYP(getTypeName(_LOT_SIZING_TYP,struct.getd_NEW_LOT_SIZING_TYP()));

		// MPS品目フラグを設定
		struct.setd_OLD_MPS_FLG(getTypeName(_MPS_FLG,struct.getd_OLD_MPS_FLG()));
		struct.setd_NEW_MPS_FLG(getTypeName(_MPS_FLG,struct.getd_NEW_MPS_FLG()));

		// 受入検査区分を設定
		struct.setd_OLD_ACPT_INSPC_TYP(getTypeName(_ACPT_INSPC_TYP,struct.getd_OLD_ACPT_INSPC_TYP()));
		struct.setd_NEW_ACPT_INSPC_TYP(getTypeName(_ACPT_INSPC_TYP,struct.getd_NEW_ACPT_INSPC_TYP()));

		// 製品区分を設定
		struct.setd_OLD_PRODUCT_TYP(getTypeName(_PRODUCT_TYP,struct.getd_OLD_PRODUCT_TYP()));
		struct.setd_NEW_PRODUCT_TYP(getTypeName(_PRODUCT_TYP,struct.getd_NEW_PRODUCT_TYP()));

		// 棚卸区分を設定
		struct.setd_OLD_ABC_TYP(getTypeName(_ABC_TYP,struct.getd_OLD_ABC_TYP()));
		struct.setd_NEW_ABC_TYP(getTypeName(_ABC_TYP,struct.getd_NEW_ABC_TYP()));

		// 作業実績区分を設定
		struct.setd_OLD_OPR_RSLT_TYP(getTypeName(_OPR_RSLT_TYP,struct.getd_OLD_OPR_RSLT_TYP()));
		struct.setd_NEW_OPR_RSLT_TYP(getTypeName(_OPR_RSLT_TYP,struct.getd_NEW_OPR_RSLT_TYP()));

		// 受給品区分を設定
		struct.setd_OLD_SPL_ITEM_TYP(getTypeName(_SPL_ITEM_TYP,struct.getd_OLD_SPL_ITEM_TYP()));
		struct.setd_NEW_SPL_ITEM_TYP(getTypeName(_SPL_ITEM_TYP,struct.getd_NEW_SPL_ITEM_TYP()));

		// 計量単位を設定
		struct.setd_OLD_STOCK_UNIT(getTypeName(_STOCK_UNIT,struct.getd_OLD_STOCK_UNIT()));
		struct.setd_NEW_STOCK_UNIT(getTypeName(_STOCK_UNIT,struct.getd_NEW_STOCK_UNIT()));

		// 保管区分を設定
		struct.setd_OLD_DEPO_TYP(getTypeName(_DEPO_TYP_JF,struct.getd_OLD_DEPO_TYP()));
		struct.setd_NEW_DEPO_TYP(getTypeName(_DEPO_TYP_JF,struct.getd_NEW_DEPO_TYP()));

		// ロット管理フラグを設定
		struct.setd_OLD_LOT_CTRL_FLG(getTypeName(_LOT_CTRL_FLG,struct.getd_OLD_LOT_CTRL_FLG()));
		struct.setd_NEW_LOT_CTRL_FLG(getTypeName(_LOT_CTRL_FLG,struct.getd_NEW_LOT_CTRL_FLG()));

		// ロット採番区分を設定
		struct.setd_OLD_LOT_NUMBERING_TYP(getTypeName(_LOT_NUMBERING_TYP,struct.getd_OLD_LOT_NUMBERING_TYP()));
		struct.setd_NEW_LOT_NUMBERING_TYP(getTypeName(_LOT_NUMBERING_TYP,struct.getd_NEW_LOT_NUMBERING_TYP()));

		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if (!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())) {
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_ITEM_NAME().equals(struct.getd_NEW_ITEM_NAME())) {
				struct.setd_ITEM_NAME_CHANGE(changed);
			}
			if (!struct.getd_OLD_DRAW_CD().equals(struct.getd_NEW_DRAW_CD())) {
				struct.setd_DRAW_CD_CHANGE(changed);
			}
			if (!struct.getd_OLD_SPEC().equals(struct.getd_NEW_SPEC())) {
				struct.setd_SPEC_CHANGE(changed);
			}
			if (!struct.getd_OLD_HIGH_LEVEL_NO().equals(struct.getd_NEW_HIGH_LEVEL_NO())) {
				struct.setd_HIGH_LEVEL_NO_CHANGE(changed);
			}
			if (!struct.getd_OLD_MRP_ODR_TYP().equals(struct.getd_NEW_MRP_ODR_TYP())) {
				struct.setd_MRP_ODR_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_OUTSIDE_TYP().equals(struct.getd_NEW_OUTSIDE_TYP())) {
				struct.setd_OUTSIDE_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_STOCK_UNIT_FLG().equals(struct.getd_NEW_STOCK_UNIT_FLG())) {
				struct.setd_STOCK_UNIT_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_STOCK_UNIT().equals(struct.getd_NEW_STOCK_UNIT())) {
				struct.setd_STOCK_UNIT_CHANGE(changed);
			}
			if (!struct.getd_OLD_PATTERN_CD().equals(struct.getd_NEW_PATTERN_CD())) {
				struct.setd_PATTERN_CD_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SET_LT(), struct.getd_NEW_SET_LT())!= 0){
				struct.setd_SET_LT_CHANGE(changed);
			}
			if (!struct.getd_OLD_UNIT_QTY_TYP().equals(struct.getd_NEW_UNIT_QTY_TYP())) {
				struct.setd_UNIT_QTY_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ODR_LT(), struct.getd_NEW_ODR_LT())!= 0){
				struct.setd_ODR_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_FIXED_LT(), struct.getd_NEW_FIXED_LT())!= 0){
				struct.setd_FIXED_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PROP_LT(), struct.getd_NEW_PROP_LT())!= 0){
				struct.setd_PROP_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SAFETY_LT(), struct.getd_NEW_SAFETY_LT())!= 0){
				struct.setd_SAFETY_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ISSUE_LT(), struct.getd_NEW_ISSUE_LT())!= 0){
				struct.setd_ISSUE_LT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_PROP_LOT_SIZE(), struct.getd_NEW_PROP_LOT_SIZE())!= 0){
				struct.setd_PROP_LOT_SIZE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ITEM_SPOIL(), struct.getd_NEW_ITEM_SPOIL())!= 0){
				struct.setd_ITEM_SPOIL_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SAFETY_STOCK(), struct.getd_NEW_SAFETY_STOCK())!= 0){
				struct.setd_SAFETY_STOCK_CHANGE(changed);
			}
			if (!struct.getd_OLD_LOT_SIZING_TYP().equals(struct.getd_NEW_LOT_SIZING_TYP())) {
				struct.setd_LOT_SIZING_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MAX_PERIOD(), struct.getd_NEW_MAX_PERIOD())!= 0){
				struct.setd_MAX_PERIOD_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MAX_ODR_QTY(), struct.getd_NEW_MAX_ODR_QTY())!= 0){
				struct.setd_MAX_ODR_QTY_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_ODR_POINT(), struct.getd_NEW_ODR_POINT())!= 0){
				struct.setd_ODR_POINT_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_FIXED_ODR_QTY(), struct.getd_NEW_FIXED_ODR_QTY())!= 0){
				struct.setd_FIXED_ODR_QTY_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MIN_ODR_QTY(), struct.getd_NEW_MIN_ODR_QTY())!= 0){
				struct.setd_MIN_ODR_QTY_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_MUL_ODR_QTY(), struct.getd_NEW_MUL_ODR_QTY())!= 0){
				struct.setd_MUL_ODR_QTY_CHANGE(changed);
			}
			if (!struct.getd_OLD_ISSUE_TYP().equals(struct.getd_NEW_ISSUE_TYP())) {
				struct.setd_ISSUE_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_MPS_FLG().equals(struct.getd_NEW_MPS_FLG())) {
				struct.setd_MPS_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_ACPT_INSPC_TYP().equals(struct.getd_NEW_ACPT_INSPC_TYP())) {
				struct.setd_ACPT_INSPC_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_PRODUCT_TYP().equals(struct.getd_NEW_PRODUCT_TYP())) {
				struct.setd_PRODUCT_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_CLASIFICATION_CD().equals(struct.getd_NEW_CLASIFICATION_CD())) {
				struct.setd_CLASIFICATION_CD_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_UNIT_WEIGHT(), struct.getd_NEW_UNIT_WEIGHT())!= 0){
				struct.setd_UNIT_WEIGHT_CHANGE(changed);
			}
			if (!struct.getd_OLD_ABC_TYP().equals(struct.getd_NEW_ABC_TYP())) {
				struct.setd_ABC_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_OPR_RSLT_TYP().equals(struct.getd_NEW_OPR_RSLT_TYP())) {
				struct.setd_OPR_RSLT_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_SPL_ITEM_TYP().equals(struct.getd_NEW_SPL_ITEM_TYP())) {
				struct.setd_SPL_ITEM_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_TAX_CD_1().equals(struct.getd_NEW_TAX_CD_1())) {
				struct.setd_TAX_CD_1_CHANGE(changed);
			}
			if (!struct.getd_OLD_CAL_NO().equals(struct.getd_NEW_CAL_NO())) {
				struct.setd_CAL_NO_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_BEST_BEFORE_YEAR(), struct.getd_NEW_BEST_BEFORE_YEAR())!= 0){
				struct.setd_BEST_BEFORE_YEAR_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_BEST_BEFORE_MONTH(), struct.getd_NEW_BEST_BEFORE_MONTH())!= 0){
				struct.setd_BEST_BEFORE_MONTH_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_BEST_BEFORE_DAY(), struct.getd_NEW_BEST_BEFORE_DAY())!= 0){
				struct.setd_BEST_BEFORE_DAY_CHANGE(changed);
			}
			if (!struct.getd_OLD_LOT_CTRL_FLG().equals(struct.getd_NEW_LOT_CTRL_FLG())) {
				struct.setd_LOT_CTRL_FLG_CHANGE(changed);
			}
			if (!struct.getd_OLD_LOT_NUMBERING_TYP().equals(struct.getd_NEW_LOT_NUMBERING_TYP())) {
				struct.setd_LOT_NUMBERING_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_DEPO_TYP().equals(struct.getd_NEW_DEPO_TYP())) {
				struct.setd_DEPO_TYP_CHANGE(changed);
			}
			if (!struct.getd_OLD_JANCODE().equals(struct.getd_NEW_JANCODE())) {
				struct.setd_JANCODE_CHANGE(changed);
			}
			if (Calculate.compare(struct.getd_OLD_MAX_STOCK_QTY(),struct.getd_NEW_MAX_STOCK_QTY())!= 0) {
				struct.setd_MAX_STOCK_QTY_CHANGE(changed);
			}
			if (!struct.getd_OLD_STOCK_STATUS().equals(struct.getd_NEW_STOCK_STATUS())) {
				struct.setd_STOCK_STATUS_CHANGE(changed);
			}
			if (Calculate.compare(struct.getd_OLD_SHIP_DEADLINE_YEAR(), struct.getd_NEW_SHIP_DEADLINE_YEAR())!= 0) {
				struct.setd_SHIP_DEADLINE_YEAR_CHANGE(changed);
			}
			if (Calculate.compare(struct.getd_OLD_SHIP_DEADLINE_MONTH(), struct.getd_NEW_SHIP_DEADLINE_MONTH())!= 0) {
				struct.setd_SHIP_DEADLINE_MONTH_CHANGE(changed);
			}
			if (Calculate.compare(struct.getd_OLD_SHIP_DEADLINE_DAY(), struct.getd_NEW_SHIP_DEADLINE_DAY())!= 0) {
				struct.setd_SHIP_DEADLINE_DAY_CHANGE(changed);
			}
		}
    }
    
    /**
     * 製品単価明細(JF)
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA2040010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());                      // 得意先コード
    		oldStruct.setITEM_CD(keyvalueMap.get("ITEM_CD").toString());                      // 品目番号
    		oldStruct.setSPCL_PRICE_TYP(keyvalueMap.get("SPCL_PRICE_TYP").toString());  	  // 特値区分
    		oldStruct.setUNIT_CD(keyvalueMap.get("UNIT_CD").toString());  			          // 単価単位
    		oldStruct.setSEQNO(keyvalueMap.get("SEQNO").toString());                          // 連番
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_UNIT_COST_JF.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_ITEM_CD(oldStruct.getd_OLD_ITEM_CD()== null?"":oldStruct.getd_OLD_ITEM_CD());
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()== null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_SPCL_PRICE_TYP(oldStruct.getd_OLD_SPCL_PRICE_TYP()== null?"":oldStruct.getd_OLD_SPCL_PRICE_TYP());
			struct.setd_OLD_UNIT_CD(oldStruct.getd_OLD_UNIT_CD()== null?"":oldStruct.getd_OLD_UNIT_CD());
			struct.setd_OLD_EFF_PHASE_IN_DATE(oldStruct.getd_OLD_EFF_PHASE_IN_DATE() == null?"":oldStruct.getd_OLD_EFF_PHASE_IN_DATE());
			struct.setd_OLD_EFF_PHASE_OUT_DATE(oldStruct.getd_OLD_EFF_PHASE_OUT_DATE() == null?"":oldStruct.getd_OLD_EFF_PHASE_OUT_DATE());
			if ("1".equals(struct.getd_OLD_SPCL_PRICE_TYP())){
				struct.setd_OLD_EFF_PHASE_OUT_DATE("");
			}
			struct.setd_OLD_SALE_SIZE(oldStruct.getd_OLD_SALE_SIZE()== null?"":oldStruct.getd_OLD_SALE_SIZE());
			struct.setd_OLD_UNIT_COST_TYP(oldStruct.getd_OLD_UNIT_COST_TYP()== null?"":oldStruct.getd_OLD_UNIT_COST_TYP());
			struct.setd_OLD_UNIT_COST(oldStruct.getd_OLD_UNIT_COST()== null?"":oldStruct.getd_OLD_UNIT_COST());
		}else{
			struct.setd_OLD_ITEM_CD("");
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_SPCL_PRICE_TYP("");
			struct.setd_OLD_UNIT_CD("");
			struct.setd_OLD_EFF_PHASE_IN_DATE("");
			struct.setd_OLD_EFF_PHASE_OUT_DATE("");
			struct.setd_OLD_SALE_SIZE("");
			struct.setd_OLD_UNIT_COST_TYP("");
			struct.setd_OLD_UNIT_COST("0");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 品目番号
			columnID = mstappr.getColumnID( "M_UNIT_COST", "ITEM_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_ITEM_CD(columnValue == null?"":columnValue);
			// 得意先コード
			columnID = mstappr.getColumnID( "M_UNIT_COST","CUST_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_CUST_CD(columnValue == null?"":columnValue);
			// 特値区分
			columnID = mstappr.getColumnID( "M_UNIT_COST","SPCL_PRICE_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SPCL_PRICE_TYP(columnValue == null?"":columnValue);
			// 単位
			columnID = mstappr.getColumnID( "M_UNIT_COST","UNIT_CD");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_CD(columnValue == null?"":columnValue);
			// 製品単価有効開始日
			columnID = mstappr.getColumnID( "M_UNIT_COST", "EFF_PHASE_IN_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EFF_PHASE_IN_DATE(columnValue == null?"":columnValue);
			// 製品単価有効終了日
			columnID = mstappr.getColumnID( "M_UNIT_COST", "EFF_PHASE_OUT_DATE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_EFF_PHASE_OUT_DATE(columnValue == null?"":columnValue);
			if ("1".equals(struct.getd_NEW_SPCL_PRICE_TYP())){
				struct.setd_NEW_EFF_PHASE_OUT_DATE("");
			}
			// サイズ
			columnID = mstappr.getColumnID( "M_UNIT_COST", "SALE_SIZE");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_SALE_SIZE(columnValue == null?"":columnValue);
			// 単価区分
			columnID = mstappr.getColumnID( "M_UNIT_COST", "UNIT_COST_TYP");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST_TYP(columnValue == null?"":columnValue);
			// 製品単価
			columnID = mstappr.getColumnID( "M_UNIT_COST", "UNIT_COST");
			columnValue = mstappr.getDetailByColumnID(newStruct, columnID);
			struct.setd_NEW_UNIT_COST(columnValue == null?"":columnValue);
		}
		else{
			struct.setd_NEW_ITEM_CD("");
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_SPCL_PRICE_TYP("");
			struct.setd_NEW_UNIT_CD("");
			struct.setd_NEW_EFF_PHASE_IN_DATE("");
			struct.setd_NEW_EFF_PHASE_OUT_DATE("");
			struct.setd_NEW_SALE_SIZE("");
			struct.setd_NEW_UNIT_COST_TYP("");
			struct.setd_NEW_UNIT_COST("0");
			
		}
		// 単価区分
		struct.setd_OLD_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_OLD_UNIT_COST_TYP()));
		struct.setd_NEW_UNIT_COST_TYP(getTypeName(_CONS_UNIT_COST,struct.getd_NEW_UNIT_COST_TYP()));
		// 特値区分
		struct.setd_OLD_SPCL_PRICE_TYP(getTypeName(_SPCL_PRICE_TYPE,struct.getd_OLD_SPCL_PRICE_TYP()));
		struct.setd_NEW_SPCL_PRICE_TYP(getTypeName(_SPCL_PRICE_TYPE,struct.getd_NEW_SPCL_PRICE_TYP()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_ITEM_CD().equals(struct.getd_NEW_ITEM_CD())){
				struct.setd_ITEM_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_SPCL_PRICE_TYP().equals(struct.getd_NEW_SPCL_PRICE_TYP())){
				struct.setd_SPCL_PRICE_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_UNIT_CD().equals(struct.getd_NEW_UNIT_CD())){
				struct.setd_UNIT_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_PHASE_IN_DATE().equals(struct.getd_NEW_EFF_PHASE_IN_DATE())){
				struct.setd_EFF_PHASE_IN_DATE_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_PHASE_OUT_DATE().equals(struct.getd_NEW_EFF_PHASE_OUT_DATE())){
				struct.setd_EFF_PHASE_OUT_DATE_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_SALE_SIZE(),struct.getd_NEW_SALE_SIZE())!=0){
				struct.setd_SALE_SIZE_CHANGE(changed);
			}
			if(!struct.getd_OLD_UNIT_COST_TYP().equals(struct.getd_NEW_UNIT_COST_TYP())){
				struct.setd_UNIT_COST_TYP_CHANGE(changed);
			}
			if(Calculate.compare(struct.getd_OLD_UNIT_COST(),struct.getd_NEW_UNIT_COST())!=0){
				struct.setd_UNIT_COST_CHANGE(changed);
			}
		}
    }
    
    /**
     * 在庫状態メンテナンスフォーム
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailAA2340010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setSTOCK_STATUS(keyvalueMap.get("STOCK_STATUS").toString());  // 在庫状態
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_STOCK_STS.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_STOCK_STATUS(oldStruct.getd_OLD_STOCK_STATUS()==null?"":oldStruct.getd_OLD_STOCK_STATUS());
			struct.setd_OLD_STOCK_STATUS_NAME(oldStruct.getd_OLD_STOCK_STATUS_NAME()==null?"":oldStruct.getd_OLD_STOCK_STATUS_NAME());
			struct.setd_OLD_STOCK_TYP(oldStruct.getd_OLD_STOCK_TYP()==null?"":oldStruct.getd_OLD_STOCK_TYP());
			struct.setd_OLD_EFF_STOCK_TYP(oldStruct.getd_OLD_EFF_STOCK_TYP()==null?"":oldStruct.getd_OLD_EFF_STOCK_TYP());
			struct.setd_OLD_SHIP_TYP(oldStruct.getd_OLD_SHIP_TYP()==null?"":oldStruct.getd_OLD_SHIP_TYP());
			struct.setd_OLD_REF_NO(oldStruct.getd_OLD_REF_NO()==null?"":oldStruct.getd_OLD_REF_NO());
		}else{
			struct.setd_OLD_STOCK_STATUS("");
			struct.setd_OLD_STOCK_STATUS_NAME("");
			struct.setd_OLD_STOCK_TYP("");
			struct.setd_OLD_EFF_STOCK_TYP("");
			struct.setd_OLD_SHIP_TYP("");
			struct.setd_OLD_REF_NO("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 在庫状態
			columnID=mstappr.getColumnID("M_STOCK_STS","STOCK_STATUS");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_STOCK_STATUS(columnValue==null?"":columnValue);
			// 在庫状態名称
			columnID=mstappr.getColumnID("M_STOCK_STS","STOCK_STATUS_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_STOCK_STATUS_NAME(columnValue==null?"":columnValue);
			// 在庫状態タイプ
			columnID=mstappr.getColumnID("M_STOCK_STS","STOCK_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_STOCK_TYP(columnValue==null?"":columnValue);
			// 有効在庫区分
			columnID=mstappr.getColumnID("M_STOCK_STS","EFF_STOCK_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EFF_STOCK_TYP(columnValue==null?"":columnValue);
			// 出荷区分
			columnID=mstappr.getColumnID("M_STOCK_STS","SHIP_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_SHIP_TYP(columnValue==null?"":columnValue);
			//在庫状態優先順位
			columnID=mstappr.getColumnID("M_STOCK_STS","REF_NO");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REF_NO(columnValue==null?"":columnValue);
		}
		else{
			struct.setd_NEW_STOCK_STATUS("");
			struct.setd_NEW_STOCK_STATUS_NAME("");
			struct.setd_NEW_STOCK_TYP("");
			struct.setd_NEW_EFF_STOCK_TYP("");
			struct.setd_NEW_SHIP_TYP("");
			struct.setd_NEW_REF_NO("");
		}
		// 在庫状態タイプ
		struct.setd_OLD_STOCK_TYP(getTypeName(_STOCK_TYP,struct.getd_OLD_STOCK_TYP()));
		struct.setd_NEW_STOCK_TYP(getTypeName(_STOCK_TYP,struct.getd_NEW_STOCK_TYP()));
		// 出荷区分
		struct.setd_OLD_SHIP_TYP(getTypeName(_SHIP_TYP_3,struct.getd_OLD_SHIP_TYP()));
		struct.setd_NEW_SHIP_TYP(getTypeName(_SHIP_TYP_3,struct.getd_NEW_SHIP_TYP()));
		
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_STOCK_STATUS().equals(struct.getd_NEW_STOCK_STATUS())){
				struct.setd_STOCK_STATUS_CHANGE(changed);
			}
			if(!struct.getd_OLD_STOCK_STATUS_NAME().equals(struct.getd_NEW_STOCK_STATUS_NAME())){
				struct.setd_STOCK_STATUS_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_STOCK_TYP().equals(struct.getd_NEW_STOCK_TYP())){
				struct.setd_STOCK_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_EFF_STOCK_TYP().equals(struct.getd_NEW_EFF_STOCK_TYP())){
				struct.setd_EFF_STOCK_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_SHIP_TYP().equals(struct.getd_NEW_SHIP_TYP())){
				struct.setd_SHIP_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_REF_NO().equals(struct.getd_NEW_REF_NO())){
				struct.setd_REF_NO_CHANGE(changed);
			}
		}
    }
    
    /**
     * 得意先組合せメンテナンスフォーム
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailKA2130010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		// 会社コード
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString()); 
    		// 納入先コード
    		oldStruct.setDELIVERY_CD(keyvalueMap.get("DELIVERY_CD").toString()); 
    		// 得意先コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString()); 
    		// 帳合パターン番号
    		oldStruct.setBALA_ACCO_PATTERN_CD(keyvalueMap.get("BALA_ACCO_PATTERN_CD").toString()); 
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST_COMB.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);			
			struct.setd_OLD_DELIVERY_CD(oldStruct.getd_OLD_DELIVERY_CD()==null?"":oldStruct.getd_OLD_DELIVERY_CD());
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_BALA_ACCO_PATTERN_CD(oldStruct.getd_OLD_BALA_ACCO_PATTERN_CD()==null?"":oldStruct.getd_OLD_BALA_ACCO_PATTERN_CD());
			struct.setd_OLD_CUST_PRIORITY_REF_NO(oldStruct.getd_OLD_CUST_PRIORITY_REF_NO()==null?"":oldStruct.getd_OLD_CUST_PRIORITY_REF_NO());	
			struct.setd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO(oldStruct.getd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO()==null?"":oldStruct.getd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO());
			struct.setd_OLD_BALA_ACCO_CD_1(oldStruct.getd_OLD_BALA_ACCO_CD_1()==null?"":oldStruct.getd_OLD_BALA_ACCO_CD_1());
			struct.setd_OLD_BALA_ACCO_CD_2(oldStruct.getd_OLD_BALA_ACCO_CD_2()==null?"":oldStruct.getd_OLD_BALA_ACCO_CD_2());
			struct.setd_OLD_BALA_ACCO_CD_3(oldStruct.getd_OLD_BALA_ACCO_CD_3()==null?"":oldStruct.getd_OLD_BALA_ACCO_CD_3());
		}else{
			struct.setd_OLD_DELIVERY_CD("");
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_BALA_ACCO_PATTERN_CD("");
			struct.setd_OLD_CUST_PRIORITY_REF_NO("");	
			struct.setd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO("");
			struct.setd_OLD_BALA_ACCO_CD_1("");
			struct.setd_OLD_BALA_ACCO_CD_2("");
			struct.setd_OLD_BALA_ACCO_CD_3("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL(struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnValue = null;
			// 納入先コード
			columnValue=mstappr.getDetailByColumnID(newStruct, "3");
			struct.setd_NEW_DELIVERY_CD(columnValue==null?"":columnValue);
			// 得意先コード
			columnValue=mstappr.getDetailByColumnID(newStruct, "5");
			struct.setd_NEW_CUST_CD(columnValue==null?"":columnValue);
			// 帳合パターンコード
			columnValue=mstappr.getDetailByColumnID(newStruct, "9");
			struct.setd_NEW_BALA_ACCO_PATTERN_CD(columnValue==null?"":columnValue);
			// 得意先優先順位
			columnValue=mstappr.getDetailByColumnID(newStruct, "7");
			struct.setd_NEW_CUST_PRIORITY_REF_NO(columnValue==null?"":columnValue);
			// 帳合パターン優先順位
			columnValue=mstappr.getDetailByColumnID(newStruct, "10");
			struct.setd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO(columnValue==null?"":columnValue);
			// 帳合先コード1
			columnValue=mstappr.getDetailByColumnID(newStruct, "11");
			struct.setd_NEW_BALA_ACCO_CD_1(columnValue==null?"":columnValue);
			// 帳合先コード2
			columnValue=mstappr.getDetailByColumnID(newStruct, "13");
			struct.setd_NEW_BALA_ACCO_CD_2(columnValue==null?"":columnValue);
			// 帳合先コード3
			columnValue=mstappr.getDetailByColumnID(newStruct, "15");
			struct.setd_NEW_BALA_ACCO_CD_3(columnValue==null?"":columnValue);
		}
		else{
			struct.setd_NEW_DELIVERY_CD("");
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_BALA_ACCO_PATTERN_CD("");
			struct.setd_NEW_CUST_PRIORITY_REF_NO("");
			struct.setd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO("");
			struct.setd_NEW_BALA_ACCO_CD_1("");
			struct.setd_NEW_BALA_ACCO_CD_2("");
			struct.setd_NEW_BALA_ACCO_CD_3("");
		}
		
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_DELIVERY_CD().equals(struct.getd_NEW_DELIVERY_CD())){
				struct.setd_DELIVERY_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_BALA_ACCO_PATTERN_CD().equals(struct.getd_NEW_BALA_ACCO_PATTERN_CD())){
				struct.setd_BALA_ACCO_PATTERN_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_PRIORITY_REF_NO().equals(struct.getd_NEW_CUST_PRIORITY_REF_NO())){
				struct.setd_CUST_PRIORITY_REF_NO_CHANGE(changed);
			}
			if(!struct.getd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO().equals(struct.getd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO())){
				struct.setd_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE(changed);
			}
			if(!struct.getd_OLD_BALA_ACCO_CD_1().equals(struct.getd_NEW_BALA_ACCO_CD_1())){
				struct.setd_BALA_ACCO_CD_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_BALA_ACCO_CD_2().equals(struct.getd_NEW_BALA_ACCO_CD_2())){
				struct.setd_BALA_ACCO_CD_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_BALA_ACCO_CD_3().equals(struct.getd_NEW_BALA_ACCO_CD_3())){
				struct.setd_BALA_ACCO_CD_3_CHANGE(changed);
			}
		}
    }
    
    /**
     * 得意先メンテナンス（売掛）JF
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBA2050010(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());                // 会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());                      // 取引先コード
            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST_JF.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_CUST_FNAME(oldStruct.getd_OLD_CUST_FNAME()==null?"":oldStruct.getd_OLD_CUST_FNAME());
			struct.setd_OLD_CUST_NAME(oldStruct.getd_OLD_CUST_NAME()==null?"":oldStruct.getd_OLD_CUST_NAME());
			struct.setd_OLD_CUST_ANAME(oldStruct.getd_OLD_CUST_ANAME()==null?"":oldStruct.getd_OLD_CUST_ANAME());
			struct.setd_OLD_CUST_KNAME(oldStruct.getd_OLD_CUST_KNAME()==null?"":oldStruct.getd_OLD_CUST_KNAME());
			struct.setd_OLD_CUST_ENAME(oldStruct.getd_OLD_CUST_ENAME()==null?"":oldStruct.getd_OLD_CUST_ENAME());
			struct.setd_OLD_OWNER_EXECUTIVE((oldStruct.getd_OLD_OWNER_EXECUTIVE()==null?"":oldStruct.getd_OLD_OWNER_EXECUTIVE()));
			struct.setd_OLD_OWNER_NAME((oldStruct.getd_OLD_OWNER_NAME()==null?"":oldStruct.getd_OLD_OWNER_NAME()));
			struct.setd_OLD_OWN_ORG_CD(oldStruct.getd_OLD_OWN_ORG_CD()==null?"":oldStruct.getd_OLD_OWN_ORG_CD());
			struct.setd_OLD_OWN_PERSON_CD(oldStruct.getd_OLD_OWN_PERSON_CD()==null?"":oldStruct.getd_OLD_OWN_PERSON_CD());
			struct.setd_OLD_BILL_ADDRESSEE_FLG(oldStruct.getd_OLD_BILL_ADDRESSEE_FLG()==null?"":oldStruct.getd_OLD_BILL_ADDRESSEE_FLG());
			struct.setd_OLD_RM_FLG(oldStruct.getd_OLD_RM_FLG()==null?"":oldStruct.getd_OLD_RM_FLG());
			struct.setd_OLD_CLAIM_CYCLE_TYP(oldStruct.getd_OLD_CLAIM_CYCLE_TYP()==null?"":oldStruct.getd_OLD_CLAIM_CYCLE_TYP());
			struct.setd_OLD_TEMP_UNIT_PRICE_SALES_FLG(oldStruct.getd_OLD_TEMP_UNIT_PRICE_SALES_FLG()==null?"":oldStruct.getd_OLD_TEMP_UNIT_PRICE_SALES_FLG());
			struct.setd_OLD_RM_INP_TYP(oldStruct.getd_OLD_RM_INP_TYP()==null?"":oldStruct.getd_OLD_RM_INP_TYP());
			struct.setd_OLD_TRN_STOP_FLG(oldStruct.getd_OLD_TRN_STOP_FLG()==null?"":oldStruct.getd_OLD_TRN_STOP_FLG());
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_CUST_FNAME("");
			struct.setd_OLD_CUST_NAME("");
			struct.setd_OLD_CUST_ANAME("");
			struct.setd_OLD_CUST_KNAME("");
			struct.setd_OLD_CUST_ENAME("");
			struct.setd_OLD_OWNER_EXECUTIVE("");
			struct.setd_OLD_OWNER_NAME("");
			struct.setd_OLD_OWN_ORG_CD("");
			struct.setd_OLD_OWN_PERSON_CD("");
			struct.setd_OLD_BILL_ADDRESSEE_FLG("");
			struct.setd_OLD_RM_FLG("");
			struct.setd_OLD_CLAIM_CYCLE_TYP("");
			struct.setd_OLD_TEMP_UNIT_PRICE_SALES_FLG("");
			struct.setd_OLD_RM_INP_TYP("");
			struct.setd_OLD_TRN_STOP_FLG("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID=mstappr.getColumnID("M_CUST","CUST_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_CD(columnValue==null?"":columnValue);
			// 得意先正式名
			columnID=mstappr.getColumnID("M_CUST","CUST_FNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_FNAME(columnValue==null?"":columnValue);
			// 得意先名
			columnID=mstappr.getColumnID("M_CUST","CUST_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_NAME(columnValue==null?"":columnValue);
			// 得意先名略称	 
			columnID=mstappr.getColumnID("M_CUST","CUST_ANAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_ANAME(columnValue==null?"":columnValue);
			// 得意先名（カナ）
			columnID=mstappr.getColumnID("M_CUST","CUST_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_KNAME(columnValue==null?"":columnValue);
			// 得意先英名
			columnID=mstappr.getColumnID("M_CUST","CUST_ENAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_ENAME(columnValue==null?"":columnValue);
			// 代表者役職名
			columnID=mstappr.getColumnID("M_CUST","OWNER_EXECUTIVE");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWNER_EXECUTIVE(columnValue==null?"":columnValue);
			// 代表者名
			columnID=mstappr.getColumnID("M_CUST","OWNER_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWNER_NAME(columnValue==null?"":columnValue);
			// 自社担当部門コード
			columnID=mstappr.getColumnID("M_CUST","OWN_ORG_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_ORG_CD(columnValue==null?"":columnValue);
			// 自社担当者コード
			columnID=mstappr.getColumnID("M_CUST","OWN_PERSON_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_OWN_PERSON_CD(columnValue==null?"":columnValue);
			// 請求先フラグ
			columnID=mstappr.getColumnID("M_CUST","BILL_ADDRESSEE_FLG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BILL_ADDRESSEE_FLG(columnValue==null?"":columnValue);
			// 入金先フラグ
			columnID=mstappr.getColumnID("M_CUST","RM_FLG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_RM_FLG(columnValue==null?"":columnValue);
			// 請求サイクル
			columnID=mstappr.getColumnID("M_CUST","CLAIM_CYCLE_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CLAIM_CYCLE_TYP(columnValue==null?"":columnValue);
			// 仮単価売上計上フラグ
			columnID=mstappr.getColumnID("M_CUST","TEMP_UNIT_PRICE_SALES_FLG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TEMP_UNIT_PRICE_SALES_FLG(columnValue==null?"":columnValue);
			// 入金入力区分
			columnID=mstappr.getColumnID("M_CUST","RM_INP_TYP");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_RM_INP_TYP(columnValue==null?"":columnValue);
			// 取引停止フラグ
			columnID=mstappr.getColumnID("M_CUST","TRN_STOP_FLG");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TRN_STOP_FLG(columnValue==null?"":columnValue);
		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_CUST_FNAME("");
			struct.setd_NEW_CUST_NAME("");
			struct.setd_NEW_CUST_ANAME("");
			struct.setd_NEW_CUST_KNAME("");
			struct.setd_NEW_CUST_ENAME("");
			struct.setd_NEW_OWNER_EXECUTIVE("");
			struct.setd_NEW_OWNER_NAME("");
			struct.setd_NEW_OWN_ORG_CD("");
			struct.setd_NEW_OWN_PERSON_CD("");
			struct.setd_NEW_BILL_ADDRESSEE_FLG("");
			struct.setd_NEW_RM_FLG("");
			struct.setd_NEW_CLAIM_CYCLE_TYP("");
			struct.setd_NEW_TEMP_UNIT_PRICE_SALES_FLG("");
			struct.setd_NEW_RM_INP_TYP("");
			struct.setd_NEW_TRN_STOP_FLG("");
		
		}
		// 請求先フラグ
		struct.setd_OLD_BILL_ADDRESSEE_FLG(getTypeName(_BILL_ADDRESSEE_FLG,struct.getd_OLD_BILL_ADDRESSEE_FLG()));
		struct.setd_NEW_BILL_ADDRESSEE_FLG(getTypeName(_BILL_ADDRESSEE_FLG,struct.getd_NEW_BILL_ADDRESSEE_FLG()));
		// 入金先フラグ
		struct.setd_OLD_RM_FLG(getTypeName(_RM_FLG,struct.getd_OLD_RM_FLG()));
		struct.setd_NEW_RM_FLG(getTypeName(_RM_FLG,struct.getd_NEW_RM_FLG()));
		// 請求サイクル
		struct.setd_OLD_CLAIM_CYCLE_TYP(getTypeName(_CLAIM_CYCLE_TYP,struct.getd_OLD_CLAIM_CYCLE_TYP()));
		struct.setd_NEW_CLAIM_CYCLE_TYP(getTypeName(_CLAIM_CYCLE_TYP,struct.getd_NEW_CLAIM_CYCLE_TYP()));
		// 仮単価売上計上フラグ
		struct.setd_OLD_TEMP_UNIT_PRICE_SALES_FLG(getTypeName(_INSPC_ACPT_FLG,struct.getd_OLD_TEMP_UNIT_PRICE_SALES_FLG()));
		struct.setd_NEW_TEMP_UNIT_PRICE_SALES_FLG(getTypeName(_INSPC_ACPT_FLG,struct.getd_NEW_TEMP_UNIT_PRICE_SALES_FLG()));
		// 入金入力区分
		struct.setd_OLD_RM_INP_TYP("0".equals(getTypeName(_RM_INP_TYP,struct.getd_OLD_RM_INP_TYP()))?"":getTypeName(_RM_INP_TYP,struct.getd_OLD_RM_INP_TYP()));
		struct.setd_NEW_RM_INP_TYP("0".equals(getTypeName(_RM_INP_TYP,struct.getd_NEW_RM_INP_TYP()))?"":getTypeName(_RM_INP_TYP,struct.getd_NEW_RM_INP_TYP()));
		// 取引停止フラグ
		struct.setd_OLD_TRN_STOP_FLG(getTypeName(_TRN_STOP_FLG,struct.getd_OLD_TRN_STOP_FLG()));
		struct.setd_NEW_TRN_STOP_FLG(getTypeName(_TRN_STOP_FLG,struct.getd_NEW_TRN_STOP_FLG()));
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_FNAME().equals(struct.getd_NEW_CUST_FNAME())){
				struct.setd_CUST_FNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_NAME().equals(struct.getd_NEW_CUST_NAME())){
				struct.setd_CUST_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_ANAME().equals(struct.getd_NEW_CUST_ANAME())){
				struct.setd_CUST_ANAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_KNAME().equals(struct.getd_NEW_CUST_KNAME())){
				struct.setd_CUST_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CUST_ENAME().equals(struct.getd_NEW_CUST_ENAME())){
				struct.setd_CUST_ENAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWNER_EXECUTIVE().equals(struct.getd_NEW_OWNER_EXECUTIVE())){
				struct.setd_OWNER_EXECUTIVE_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWNER_NAME().equals(struct.getd_NEW_OWNER_NAME())){
				struct.setd_OWNER_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_ORG_CD().equals(struct.getd_NEW_OWN_ORG_CD())){
				struct.setd_OWN_ORG_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_OWN_PERSON_CD().equals(struct.getd_NEW_OWN_PERSON_CD())){
				struct.setd_OWN_PERSON_CD_CHANGE(changed);
			}			
			if(!struct.getd_OLD_BILL_ADDRESSEE_FLG().equals(struct.getd_NEW_BILL_ADDRESSEE_FLG())){
				struct.setd_BILL_ADDRESSEE_FLG_CHANGE(changed);
			}
			if(!struct.getd_OLD_RM_FLG().equals(struct.getd_NEW_RM_FLG())){
				struct.setd_RM_FLG_CHANGE(changed);
			}
			if(!struct.getd_OLD_CLAIM_CYCLE_TYP().equals(struct.getd_NEW_CLAIM_CYCLE_TYP())){
				struct.setd_CLAIM_CYCLE_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_TEMP_UNIT_PRICE_SALES_FLG().equals(struct.getd_NEW_TEMP_UNIT_PRICE_SALES_FLG())){
				struct.setd_TEMP_UNIT_PRICE_SALES_FLG_CHANGE(changed);
			}
			if(!struct.getd_OLD_RM_INP_TYP().equals(struct.getd_NEW_RM_INP_TYP())){
				struct.setd_RM_INP_TYP_CHANGE(changed);
			}
			if(!struct.getd_OLD_TRN_STOP_FLG().equals(struct.getd_NEW_TRN_STOP_FLG())){
				struct.setd_TRN_STOP_FLG_CHANGE(changed);
			}
		}
    }
    
    /**
     * 得意先メンテナンス（売掛）
     * @param mstappr
     * @param oldDateList
     * @param newDateList
     * @param newStruct
     * @param oldStruct
     * @throws FoundationException
     * @throws SQLException
     */
    private void detailBA2050010BRANCH(MstAppr mstappr,List oldDateList,List newDateList,MstApprDetailStruct newStruct,AZ0060010Struct oldStruct) throws FoundationException, SQLException{
    	
    	if(!"1".equals(struct.geth_PROC_TYP())){
    		oldStruct.setCOMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());               //会社コード
    		oldStruct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());               //得意先コード
    		oldStruct.setBRANCH_CD(keyvalueMap.get("BRANCH_CD").toString());               //支店コード

            // 変更前データリストを取得
			oldDateList = commonEntity.mselectM_CUST_BRANCH.read(conn, oldStruct);
		}
		//　変更前データオブジェクトを設定
		if (!oldDateList.isEmpty()) {
			oldStruct = (AZ0060010Struct) oldDateList.get(0);
			struct.setd_OLD_CUST_CD(oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD());
			struct.setd_OLD_BRANCH_CD(oldStruct.getd_OLD_BRANCH_CD()==null?"":oldStruct.getd_OLD_BRANCH_CD());
			struct.setd_OLD_BRANCH_FNAME(oldStruct.getd_OLD_BRANCH_FNAME()==null?"":oldStruct.getd_OLD_BRANCH_FNAME());
			struct.setd_OLD_BRANCH_NAME(oldStruct.getd_OLD_BRANCH_NAME()==null?"":oldStruct.getd_OLD_BRANCH_NAME());
			struct.setd_OLD_BRANCH_KNAME(oldStruct.getd_OLD_BRANCH_KNAME()==null?"":oldStruct.getd_OLD_BRANCH_KNAME());
			struct.setd_OLD_BRANCH_ENAME(oldStruct.getd_OLD_BRANCH_ENAME()==null?"":oldStruct.getd_OLD_BRANCH_ENAME());
			struct.setd_OLD_BRANCH_SEQ_CD(oldStruct.getd_OLD_BRANCH_SEQ_CD()==null?"":oldStruct.getd_OLD_BRANCH_SEQ_CD());
			struct.setd_OLD_CHARGE_ORG_NAME(oldStruct.getd_OLD_CHARGE_ORG_NAME()==null?"":oldStruct.getd_OLD_CHARGE_ORG_NAME());
			struct.setd_OLD_CHARGE_PERSON_NAME(oldStruct.getd_OLD_CHARGE_PERSON_NAME()==null?"":oldStruct.getd_OLD_CHARGE_PERSON_NAME());
			struct.setd_OLD_ZIP_CD(oldStruct.getd_OLD_ZIP_CD()==null?"":oldStruct.getd_OLD_ZIP_CD());
			struct.setd_OLD_ADDRESS_1(oldStruct.getd_OLD_ADDRESS_1()==null?"":oldStruct.getd_OLD_ADDRESS_1());
			struct.setd_OLD_ADDRESS_2(oldStruct.getd_OLD_ADDRESS_2()==null?"":oldStruct.getd_OLD_ADDRESS_2());
			struct.setd_OLD_ADDRESS_K_1(oldStruct.getd_OLD_ADDRESS_K_1()==null?"":oldStruct.getd_OLD_ADDRESS_K_1());
			struct.setd_OLD_ADDRESS_K_2(oldStruct.getd_OLD_ADDRESS_K_2()==null?"":oldStruct.getd_OLD_ADDRESS_K_2());
			struct.setd_OLD_TEL(oldStruct.getd_OLD_TEL()==null?"":oldStruct.getd_OLD_TEL());
			struct.setd_OLD_FAX(oldStruct.getd_OLD_FAX()==null?"":oldStruct.getd_OLD_FAX());
			struct.setd_OLD_EDI_CUST_VEND_CD(oldStruct.getd_OLD_EDI_CUST_VEND_CD()==null?"":oldStruct.getd_OLD_EDI_CUST_VEND_CD());
			struct.setd_OLD_EDI_OWN_VEND_CD(oldStruct.getd_OLD_EDI_OWN_VEND_CD()==null?"":oldStruct.getd_OLD_EDI_OWN_VEND_CD());
			struct.setd_OLD_REMARKS_1(oldStruct.getd_OLD_REMARKS_1()==null?"":oldStruct.getd_OLD_REMARKS_1());
			struct.setd_OLD_REMARKS_2(oldStruct.getd_OLD_REMARKS_2()==null?"":oldStruct.getd_OLD_REMARKS_2());
			struct.setd_OLD_REMARKS_3(oldStruct.getd_OLD_REMARKS_3()==null?"":oldStruct.getd_OLD_REMARKS_3());
		}else{
			struct.setd_OLD_CUST_CD("");
			struct.setd_OLD_BRANCH_CD("");
			struct.setd_OLD_BRANCH_FNAME("");
			struct.setd_OLD_BRANCH_NAME("");
			struct.setd_OLD_BRANCH_KNAME("");
			struct.setd_OLD_BRANCH_ENAME("");
			struct.setd_OLD_BRANCH_SEQ_CD("");
			struct.setd_OLD_CHARGE_ORG_NAME("");
			struct.setd_OLD_CHARGE_PERSON_NAME("");
			struct.setd_OLD_ZIP_CD("");
			struct.setd_OLD_ADDRESS_1("");
			struct.setd_OLD_ADDRESS_2("");
			struct.setd_OLD_ADDRESS_K_1("");
			struct.setd_OLD_ADDRESS_K_2("");
			struct.setd_OLD_TEL("");
			struct.setd_OLD_FAX("");
			struct.setd_OLD_EDI_CUST_VEND_CD("");
			struct.setd_OLD_EDI_OWN_VEND_CD("");
			struct.setd_OLD_REMARKS_1("");
			struct.setd_OLD_REMARKS_2("");
			struct.setd_OLD_REMARKS_3("");
		}
		// 変更後データリストを取得
		if(!"3".equals(struct.geth_PROC_TYP())){
			newDateList = mstappr.selectMST_APPR_DETAIL( struct.geth_APPR_ID());
		}
		// 　変更後データオブジェクトを設定
		if (!newDateList.isEmpty()) {
			newStruct = (MstApprDetailStruct) newDateList.get(0);
			String columnID = null;
			String columnValue = null;
			// 得意先コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","CUST_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CUST_CD(columnValue==null?"":columnValue);
			// 支店コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_CD(columnValue==null?"":columnValue);
			// 支店正式名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_FNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_FNAME(columnValue==null?"":columnValue);
			// 支店名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_NAME(columnValue==null?"":columnValue);
			// 支店名（カナ）
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_KNAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_KNAME(columnValue==null?"":columnValue);
			// 支店名（英名）
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_ENAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_ENAME(columnValue==null?"":columnValue);
			// 支店昇順
			columnID=mstappr.getColumnID("M_CUST_BRANCH","BRANCH_SEQ_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_BRANCH_SEQ_CD(columnValue==null?"":columnValue);
			// 担当者所属部門名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","CHARGE_ORG_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CHARGE_ORG_NAME(columnValue==null?"":columnValue);
			// 担当者名
			columnID=mstappr.getColumnID("M_CUST_BRANCH","CHARGE_PERSON_NAME");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_CHARGE_PERSON_NAME(columnValue==null?"":columnValue);
			// 郵便番号
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ZIP_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ZIP_CD(columnValue==null?"":columnValue);
			// 住所１
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_1(columnValue==null?"":columnValue);
			// 住所２
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_2(columnValue==null?"":columnValue);
			// 住所（カナ）１
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_K_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_1(columnValue==null?"":columnValue);
			// 住所（カナ）２
			columnID=mstappr.getColumnID("M_CUST_BRANCH","ADDRESS_K_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_ADDRESS_K_2(columnValue==null?"":columnValue);
			// 電話番号
			columnID=mstappr.getColumnID("M_CUST_BRANCH","TEL");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_TEL(columnValue==null?"":columnValue);
			// ＦＡＸ番号
			columnID=mstappr.getColumnID("M_CUST_BRANCH","FAX");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_FAX(columnValue==null?"":columnValue);
			// ＥＤＩ相手取引先コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","EDI_CUST_VEND_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EDI_CUST_VEND_CD(columnValue==null?"":columnValue);
			// ＥＤＩ自社取引先コード
			columnID=mstappr.getColumnID("M_CUST_BRANCH","EDI_OWN_VEND_CD");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_EDI_OWN_VEND_CD(columnValue==null?"":columnValue);
			// 備考１
			columnID=mstappr.getColumnID("M_CUST_BRANCH","REMARKS_1");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REMARKS_1(columnValue==null?"":columnValue);
			// 備考２
			columnID=mstappr.getColumnID("M_CUST_BRANCH","REMARKS_2");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REMARKS_2(columnValue==null?"":columnValue);
			// 備考３
			columnID=mstappr.getColumnID("M_CUST_BRANCH","REMARKS_3");
			columnValue=mstappr.getDetailByColumnID(newStruct,columnID);
			struct.setd_NEW_REMARKS_3(columnValue==null?"":columnValue);


		}
		else{
			struct.setd_NEW_CUST_CD("");
			struct.setd_NEW_BRANCH_CD("");
			struct.setd_NEW_BRANCH_FNAME("");
			struct.setd_NEW_BRANCH_NAME("");
			struct.setd_NEW_BRANCH_KNAME("");
			struct.setd_NEW_BRANCH_ENAME("");
			struct.setd_NEW_BRANCH_SEQ_CD("");
			struct.setd_NEW_CHARGE_ORG_NAME("");
			struct.setd_NEW_CHARGE_PERSON_NAME("");
			struct.setd_NEW_ZIP_CD("");
			struct.setd_NEW_ADDRESS_1("");
			struct.setd_NEW_ADDRESS_2("");
			struct.setd_NEW_ADDRESS_K_1("");
			struct.setd_NEW_ADDRESS_K_2("");
			struct.setd_NEW_TEL("");
			struct.setd_NEW_FAX("");
			struct.setd_NEW_EDI_CUST_VEND_CD("");
			struct.setd_NEW_EDI_OWN_VEND_CD("");
			struct.setd_NEW_REMARKS_1("");
			struct.setd_NEW_REMARKS_2("");
			struct.setd_NEW_REMARKS_3("");
		}
		//	  更新の場合、変更済みを設定
		if("2".equals(struct.geth_PROC_TYP())){
			if(!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())){
				struct.setd_CUST_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_CD().equals(struct.getd_NEW_BRANCH_CD())){
				struct.setd_BRANCH_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_FNAME().equals(struct.getd_NEW_BRANCH_FNAME())){
				struct.setd_BRANCH_FNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_NAME().equals(struct.getd_NEW_BRANCH_NAME())){
				struct.setd_BRANCH_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_KNAME().equals(struct.getd_NEW_BRANCH_KNAME())){
				struct.setd_BRANCH_KNAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_ENAME().equals(struct.getd_NEW_BRANCH_ENAME())){
				struct.setd_BRANCH_ENAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_BRANCH_SEQ_CD().equals(struct.getd_NEW_BRANCH_SEQ_CD())){
				struct.setd_BRANCH_SEQ_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_CHARGE_ORG_NAME().equals(struct.getd_NEW_CHARGE_ORG_NAME())){
				struct.setd_CHARGE_ORG_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_CHARGE_PERSON_NAME().equals(struct.getd_NEW_CHARGE_PERSON_NAME())){
				struct.setd_CHARGE_PERSON_NAME_CHANGE(changed);
			}
			if(!struct.getd_OLD_ZIP_CD().equals(struct.getd_NEW_ZIP_CD())){
				struct.setd_ZIP_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_1().equals(struct.getd_NEW_ADDRESS_1())){
				struct.setd_ADDRESS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_2().equals(struct.getd_NEW_ADDRESS_2())){
				struct.setd_ADDRESS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_1().equals(struct.getd_NEW_ADDRESS_K_1())){
				struct.setd_ADDRESS_K_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_ADDRESS_K_2().equals(struct.getd_NEW_ADDRESS_K_2())){
				struct.setd_ADDRESS_K_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_TEL().equals(struct.getd_NEW_TEL())){
				struct.setd_TEL_CHANGE(changed);
			}
			if(!struct.getd_OLD_FAX().equals(struct.getd_NEW_FAX())){
				struct.setd_FAX_CHANGE(changed);
			}
			if(!struct.getd_OLD_EDI_CUST_VEND_CD().equals(struct.getd_NEW_EDI_CUST_VEND_CD())){
				struct.setd_EDI_CUST_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_EDI_OWN_VEND_CD().equals(struct.getd_NEW_EDI_OWN_VEND_CD())){
				struct.setd_EDI_OWN_VEND_CD_CHANGE(changed);
			}
			if(!struct.getd_OLD_REMARKS_1().equals(struct.getd_NEW_REMARKS_1())){
				struct.setd_REMARKS_1_CHANGE(changed);
			}
			if(!struct.getd_OLD_REMARKS_2().equals(struct.getd_NEW_REMARKS_2())){
				struct.setd_REMARKS_2_CHANGE(changed);
			}
			if(!struct.getd_OLD_REMARKS_3().equals(struct.getd_NEW_REMARKS_3())){
				struct.setd_REMARKS_3_CHANGE(changed);
			}
		}
    }
    
    public void doCheck(Object objectControl,String functionname) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException{
    	Method[] method = objectControl.getClass().getMethods();
		for(int j=0;j<method.length;j++){
			if(method[j].getName().equalsIgnoreCase(functionname)){
				method[j].invoke(objectControl,new Object[0]);
			}
		}
    }
    
    /**
     * Jaのマスタ系承認用のチェック
     * @param objectControl
     * @param apprID_lst
     * @param procTyp_lst
     * @param mstappr
     * @return
     * @throws SQLException
     */
    public boolean doCheck(Object objectControl,String appr_ID,String proc_Typ) throws SQLException{
    	boolean result = false;
		try {
			// チィック
			switch(Integer.parseInt(proc_Typ)){
			case 1:
				doCheck(objectControl,"insertCheck");
				break;
			case 2:
				doCheck(objectControl,"updateCheck");
				break;
			case 3:
				doCheck(objectControl,"deleteCheck");
				break;
			}
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
    }
    public void doCheck(List apprID_lst,List procTyp_lst,MstAppr mstappr) throws SQLException, BusinessProcessException, FoundationException, InstantiationException, IllegalAccessException, ClassNotFoundException{
    	String appr_ID = null;
		List tableName_lst = struct.getList_h_TABLE_NAME();
		List key1_list = struct.getList_h_KEY1();
		List value1_list =struct.getList_h_VALUE1();
		List key2_list = struct.getList_h_KEY2();
		List value2_list =struct.getList_h_VALUE2();
		List key3_list = struct.getList_h_KEY3();
		List value3_list =struct.getList_h_VALUE3();
		List key4_list = struct.getList_h_KEY4();
		List value4_list =struct.getList_h_VALUE4();
		List key5_list = struct.getList_h_KEY5();
		List value5_list =struct.getList_h_VALUE5();
		List key6_list = struct.getList_h_KEY6();
		List value6_list =struct.getList_h_VALUE6();
		List key7_list = struct.getList_h_KEY7();
		List value7_list =struct.getList_h_VALUE7();
		List tempList = null;
		//チェック
		if(this.screen_url.equals("KA1020010Servlet")){
			
		}else if(screen_url.equals("KA1030010Servlet")){
			MstControlApprIF ka1030010control = (MstControlApprIF) Class.forName("com.nec.jp.orteus.metamorBase.KA1030.KA1030010ControlAppr").newInstance();
			
			ka1030010control.createMsgStruct();
			ka1030010control.setSysLog(this.sysLog);
			ka1030010control.setsysUSER_CD(this.getsysUSER_CD());
			ka1030010control.setConn(conn);
			ka1030010control.setList(new ArrayList());     
			//struct
			MstStructApprIF ka1030010struct = (MstStructApprIF) Class.forName("com.nec.jp.orteus.metamorBase.KA1030.KA1030010StructAppr").newInstance();
			
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID = apprID_lst.get(i).toString();
				List templist = mstappr.selectMST_APPR_DETAIL(appr_ID);
				MstApprDetailStruct mstApprDetailStruct = (MstApprDetailStruct) templist.get(0);
				// 会社コード
				String columnID = mstappr.getColumnID( "M_CUST", "COMPANY_CD");
				ka1030010struct.setSYS_COMPANY_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 得意先コード
			    columnID = mstappr.getColumnID( "M_CUST", "CUST_CD");
				ka1030010struct.setCUST_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 消費税コード
		    	columnID = mstappr.getColumnID( "M_CUST", "TAX_CD");
		    	ka1030010struct.setTAX_CD(mstappr.getDetailByColumnID(mstApprDetailStruct, columnID));
				// 自社担当部門コード
				columnID = mstappr.getColumnID( "M_CUST", "OWN_ORG_CD");
				ka1030010struct.setOWN_ORG_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 自社担当者コード
				columnID = mstappr.getColumnID( "M_CUST", "OWN_PERSON_CD");
				ka1030010struct.setOWN_PERSON_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 通貨コード
				columnID = mstappr.getColumnID( "M_CUST", "CUR_CD");
				ka1030010struct.setCUR_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 得意先グループコード
				columnID = mstappr.getColumnID( "M_CUST", "CUST_GRP_CD");
				ka1030010struct.setCUST_GRP_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				
				ka1030010control.setStruct(ka1030010struct);
				
				// チェックを行く
				this.doCheck(ka1030010control, apprID_lst.get(i).toString(), procTyp_lst.get(i).toString());
				msgStruct = ka1030010control.getMsgStruct();             // メッセジーを戻る
			}
		}else if(screen_url.equals("KA1040010Servlet")){
			MstControlApprIF ka1040010control = (MstControlApprIF) Class.forName("com.nec.jp.orteus.metamorBase.KA1040.KA1040010ControlAppr").newInstance();

			ka1040010control.createMsgStruct();
			ka1040010control.setSysLog(this.sysLog);
			ka1040010control.setsysUSER_CD(this.getsysUSER_CD());
			ka1040010control.setConn(conn);
			ka1040010control.setList(new ArrayList());                
			//struct
			MstStructApprIF ka1040010struct = (MstStructApprIF) Class.forName("com.nec.jp.orteus.metamorBase.KA1040.KA1040010StructAppr").newInstance();

			for(int i=0;i<apprID_lst.size();i++){
				appr_ID = apprID_lst.get(i).toString();
				List templist = mstappr.selectMST_APPR_DETAIL(appr_ID);
				MstApprDetailStruct mstApprDetailStruct = (MstApprDetailStruct) templist.get(0);
		    	// 会社コード
		    	String columnID = mstappr.getColumnID( "M_DLV_LOC", "COMPANY_CD");
		    	ka1040010struct.seth_COMPANY_CD(mstappr.getDetailByColumnID(mstApprDetailStruct, columnID));	
				// 得意先コード
				columnID = mstappr.getColumnID( "M_DLV_LOC", "CUST_CD");
				ka1040010struct.setCUST_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				//集結場所コード
				columnID = mstappr.getColumnID( "M_DLV_LOC", "CNCNTRT_DLV_LOC_CD");
				ka1040010struct.setCNCNTRT_DLV_LOC_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				//出荷管理先区分
				columnID = mstappr.getColumnID( "M_DLV_LOC", "SHIP_CTL_TYP");
				ka1040010struct.setSHIP_CTL_TYP(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				ka1040010control.set_shipCtlTyp(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				//運送便コード
				columnID = mstappr.getColumnID( "M_DLV_LOC", "TRANSPORT_CD");
				ka1040010struct.setTRANSPORT_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				//納品場所コード
				columnID = mstappr.getColumnID( "M_DLV_LOC", "DLV_LOC_CD");
				ka1040010struct.setDLV_LOC_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				
				ka1040010control.setStruct(ka1040010struct);
				
				// チェックを行く
				this.doCheck(ka1040010control, apprID_lst.get(i).toString(), procTyp_lst.get(i).toString());
				msgStruct = ka1040010control.getMsgStruct();             // メッセジーを戻る
			}
		}else if(screen_url.equals("KA1080010Servlet")){
			MstControlApprIF ka1080010control = (MstControlApprIF) Class.forName("com.nec.jp.orteus.metamorBase.KA1080.KA1080010ControlAppr").newInstance();
			
			ka1080010control.createMsgStruct();
			ka1080010control.setSysLog(this.sysLog);
			ka1080010control.setsysUSER_CD(this.getsysUSER_CD());
			ka1080010control.setConn(conn);
			ka1080010control.setList(new ArrayList());   
			//struct
			MstStructApprIF ka1080010struct = (MstStructApprIF) Class.forName("com.nec.jp.orteus.metamorBase.KA1080.KA1080010StructAppr").newInstance();
			
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID = apprID_lst.get(i).toString();
				List templist = mstappr.selectMST_APPR_DETAIL(appr_ID);
				MstApprDetailStruct mstApprDetailStruct = (MstApprDetailStruct) templist.get(0);
				// 会社コード
				String columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "COMPANY_CD");
				ka1080010struct.setCOMPANY_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 得意先コード
				columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "CUST_CD");
				ka1080010struct.setCUST_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 最終納品場所コード
				columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "DLV_LOC_CD");
				ka1080010struct.setDLV_LOC_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 得意先指定納品場所コード
				columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "CUST_DESINATED_DLV_LOC_CD");
				ka1080010struct.setCUST_DESINATED_DLV_LOC_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 納品場所任意変換値
				columnID = mstappr.getColumnID( "M_CUST_DESINATED_DLV_LOC", "DLV_LOC_OPTION_CHANGE_VALUE");
				ka1080010struct.setDLV_LOC_OPTION_CHANGE_VALUE(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				
				ka1080010control.setStruct(ka1080010struct);
				// チェックを行く
				this.doCheck(ka1080010control, apprID_lst.get(i).toString(), procTyp_lst.get(i).toString());
				msgStruct = ka1080010control.getMsgStruct();             // メッセジーを戻る
			}
		} else if(screen_url.equals("AA0010010Servlet")){
			MstItemControlApprIF aa0010010control = (MstItemControlApprIF) Class.forName("com.nec.jp.orteus.metamorBase.AA0010.AA0010010ControlAppr").newInstance();
			
			aa0010010control.createMsgStruct();
			aa0010010control.setSysLog(this.sysLog);
			aa0010010control.setsysUSER_CD(this.getsysUSER_CD());
			aa0010010control.setConn(conn);
			aa0010010control.setList(new ArrayList());   
			//struct
			MstItemStructApprIF aa0010010struct = (MstItemStructApprIF) Class.forName("com.nec.jp.orteus.metamorBase.AA0010.AA0010010StructAppr").newInstance();
			
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID = apprID_lst.get(i).toString();
				List templist = mstappr.selectMST_APPR_DETAIL(appr_ID);
				MstApprDetailStruct mstApprDetailStruct = (MstApprDetailStruct) templist.get(0);
				// 品目分類01
				String columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_CD");
				aa0010010struct.setITEM_CLASS_01_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類02
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_CD");
				aa0010010struct.setITEM_CLASS_02_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類03
			    columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_CD");
			    aa0010010struct.setITEM_CLASS_03_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
			    // 品目分類04
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_CD");
				aa0010010struct.setITEM_CLASS_04_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類05
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_CD");
				aa0010010struct.setITEM_CLASS_05_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類06
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_CD");
				aa0010010struct.setITEM_CLASS_06_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類07
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_CD");
				aa0010010struct.setITEM_CLASS_07_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類08
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_CD");
				aa0010010struct.setITEM_CLASS_08_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類09
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_CD");
				aa0010010struct.setITEM_CLASS_09_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類10
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_CD");
				aa0010010struct.setITEM_CLASS_10_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類11
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_CD");
				aa0010010struct.setITEM_CLASS_11_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類12
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_CD");
				aa0010010struct.setITEM_CLASS_12_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 在庫数単位区分
				columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
				aa0010010struct.setUNIT_QTY_TYP(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 荷姿単位数
				columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT_QTY");
				aa0010010struct.setPKG_UNIT_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 安全在庫量
				columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
				aa0010010struct.setSAFETY_STOCK(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 最大手配数
				columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
				aa0010010struct.setMAX_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 発注点在庫数
				columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
				aa0010010struct.setODR_POINT(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 定量発注数
				columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
				aa0010010struct.setFIXED_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 最小手配数
				columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
				aa0010010struct.setMIN_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// まるめ単位
				columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
				aa0010010struct.setMUL_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目番号
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CD");
				aa0010010struct.setITEM_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 消費税コード
				columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
				aa0010010struct.setTAX_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// カレンダ番号
				columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
				aa0010010struct.setCAL_NO(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目手配区分
				columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
				aa0010010struct.setMRP_ODR_TYP(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// ロット管理フラグ
				columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
				aa0010010struct.setLOT_CTRL_FLG(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 更新数
				columnID = mstappr.getColumnID( "M_ITEM", "MODIFY_COUNT");
				aa0010010struct.setMODIFY_COUNT(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 工数管理品目区分
				columnID = mstappr.getColumnID( "M_ITEM", "MANHOUR_TYP");
				aa0010010struct.setMANHOUR_TYP(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 計量単位
				columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
				aa0010010struct.setSTOCK_UNIT(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));

				aa0010010control.setStruct(aa0010010struct);
				// チェックを行く
				this.doCheck(aa0010010control, apprID_lst.get(i).toString(), procTyp_lst.get(i).toString());
				msgStruct = aa0010010control.getMsgStruct();             // メッセジーを戻る
			}
		} else if(screen_url.equals("AA2010010Servlet")){
			MstItemControlApprIF aa2010010control = (MstItemControlApprIF) Class.forName("com.nec.jp.orteus.metamorBase.AA2010.AA2010010ControlAppr").newInstance();
			
			aa2010010control.createMsgStruct();
			aa2010010control.setSysLog(this.sysLog);
			aa2010010control.setsysUSER_CD(this.getsysUSER_CD());
			aa2010010control.setConn(conn);
			aa2010010control.setList(new ArrayList());   
			//struct
			MstItemStructApprIF aa2010010struct = (MstItemStructApprIF) Class.forName("com.nec.jp.orteus.metamorBase.AA2010.AA2010010StructAppr").newInstance();
			
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID = apprID_lst.get(i).toString();
				List templist = mstappr.selectMST_APPR_DETAIL(appr_ID);
				MstApprDetailStruct mstApprDetailStruct = (MstApprDetailStruct) templist.get(0);
				// 品目分類01
				String columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_CD");
				aa2010010struct.setITEM_CLASS_01_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類02
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_CD");
				aa2010010struct.setITEM_CLASS_02_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類03
			    columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_CD");
			    aa2010010struct.setITEM_CLASS_03_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
			    // 品目分類04
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_CD");
				aa2010010struct.setITEM_CLASS_04_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類05
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_CD");
				aa2010010struct.setITEM_CLASS_05_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類06
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_CD");
				aa2010010struct.setITEM_CLASS_06_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類07
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_CD");
				aa2010010struct.setITEM_CLASS_07_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類08
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_CD");
				aa2010010struct.setITEM_CLASS_08_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類09
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_CD");
				aa2010010struct.setITEM_CLASS_09_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類10
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_CD");
				aa2010010struct.setITEM_CLASS_10_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類11
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_CD");
				aa2010010struct.setITEM_CLASS_11_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目分類12
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_CD");
				aa2010010struct.setITEM_CLASS_12_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 在庫数単位区分
				columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
				aa2010010struct.setUNIT_QTY_TYP(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 荷姿単位数
				columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT_QTY");
				aa2010010struct.setPKG_UNIT_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 安全在庫量
				columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
				aa2010010struct.setSAFETY_STOCK(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 最大手配数
				columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
				aa2010010struct.setMAX_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 発注点在庫数
				columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
				aa2010010struct.setODR_POINT(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 定量発注数
				columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
				aa2010010struct.setFIXED_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 最小手配数
				columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
				aa2010010struct.setMIN_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// まるめ単位
				columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
				aa2010010struct.setMUL_ODR_QTY(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目番号
				columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CD");
				aa2010010struct.setITEM_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 消費税コード
				columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
				aa2010010struct.setTAX_CD(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// カレンダ番号
				columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
				aa2010010struct.setCAL_NO(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 品目手配区分
				columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
				aa2010010struct.setMRP_ODR_TYP(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// ロット管理フラグ
				columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
				aa2010010struct.setLOT_CTRL_FLG(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 更新数
				columnID = mstappr.getColumnID( "M_ITEM", "MODIFY_COUNT");
				aa2010010struct.setMODIFY_COUNT(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 工数管理品目区分
				columnID = mstappr.getColumnID( "M_ITEM", "MANHOUR_TYP");
				aa2010010struct.setMANHOUR_TYP(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));
				// 計量単位
				columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
				aa2010010struct.setSTOCK_UNIT(mstappr.getDetailByColumnID(mstApprDetailStruct,columnID));

				aa2010010control.setStruct(aa2010010struct);
				// チェックを行く
				this.doCheck(aa2010010control, apprID_lst.get(i).toString(), procTyp_lst.get(i).toString());
				msgStruct = aa2010010control.getMsgStruct();             // メッセジーを戻る
			}
		} else if(screen_url.equals("AA0040010Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_PUCH_UNIT_COST_H".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_PUCH_UNIT_COST");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_KEY3(key3_list.get(i).toString());
					detailStruct.seth_KEY4(key4_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_VALUE3(value3_list.get(i).toString());
					detailStruct.seth_VALUE4(value4_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr4.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00131");
						break;
					}
				}
				if("M_PUCH_UNIT_COST".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_PUCH_UNIT_COST_H");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("VEND_CD");
					detailStruct.seth_KEY3("ITEM_CD");
					detailStruct.seth_KEY4("PLANT_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("VEND_CD").toString());
					detailStruct.seth_VALUE3(tempMap.get("ITEM_CD").toString());
					detailStruct.seth_VALUE4(tempMap.get("PLANT_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr4.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00133");
						break;
					}
					
				}
			}
		}else if(screen_url.equals("AA0040020Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_SBCNT_UNIT_COST_H".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_SBCNT_UNIT_COST");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_KEY3(key3_list.get(i).toString());
					detailStruct.seth_KEY4(key4_list.get(i).toString());
					detailStruct.seth_KEY5(key5_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_VALUE3(value3_list.get(i).toString());
					detailStruct.seth_VALUE4(value4_list.get(i).toString());
					detailStruct.seth_VALUE5(value5_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr5.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00131");
						break;
					}
				}
				if("M_SBCNT_UNIT_COST".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_SBCNT_UNIT_COST_H");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("VEND_CD");
					detailStruct.seth_KEY3("ITEM_CD");
					detailStruct.seth_KEY4("PLANT_CD");
					detailStruct.seth_KEY5("PROC_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("VEND_CD").toString());
					detailStruct.seth_VALUE3(tempMap.get("ITEM_CD").toString());
					detailStruct.seth_VALUE4(tempMap.get("PLANT_CD").toString());
					detailStruct.seth_VALUE5(tempMap.get("PROC_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr5.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00133");
						break;
					}
				}
				
			}
		}else if(screen_url.equals("BA2020010Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_CUST_STL_CTRL".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_CLAIM_CUST_CTRL");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_KEY3(key3_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_VALUE3(value3_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr3.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00131");
						break;
					}
				}
				if("M_CLAIM_CUST_CTRL".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());		
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					detailStruct.seth_TABLE_NAME("M_CUST_STL_CTRL");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("BILL_ADDRESSEE_CD");
					detailStruct.seth_KEY3("STL_COND_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("BILL_ADDRESSEE_CD").toString());
					detailStruct.seth_VALUE3(tempMap.get("STL_COND_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr3.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00133");
						break;
					}
				}
			}
		} else if(screen_url.equals("BA2050010Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_CUST".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_CUST_BRANCH");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr2.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00131");
						break;
					}
				}
				if("M_CUST_BRANCH".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_CUST");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("CUST_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("CUST_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr2.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00133");
						break;
					}
				}
				
			}
		} else if(screen_url.equals("BZ0050010Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_BANK_H".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_BANK");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr1.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00131");
						break;
					}
				}
				if("M_BANK".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_BANK_H");
					detailStruct.seth_KEY1("BANK_CD");
					detailStruct.seth_VALUE1(tempMap.get("BANK_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr1.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00133");
						break;
					}
				}
				
			}
		}
    }
    
    public boolean doApprDelCheck() throws FoundationException, SQLException{
    	boolean ret =false;
		List tableName_lst = struct.getList_h_TABLE_NAME();
		List procTyp_lst = struct.getList_h_PROC_TYP();
		List key1_list = struct.getList_h_KEY1();
		List value1_list =struct.getList_h_VALUE1();
		List key2_list = struct.getList_h_KEY2();
		List value2_list =struct.getList_h_VALUE2();
		List key3_list = struct.getList_h_KEY3();
		List value3_list =struct.getList_h_VALUE3();
		List key4_list = struct.getList_h_KEY4();
		List value4_list =struct.getList_h_VALUE4();
		List key5_list = struct.getList_h_KEY5();
		List value5_list =struct.getList_h_VALUE5();
		List key6_list = struct.getList_h_KEY6();
		List value6_list =struct.getList_h_VALUE6();
		List key7_list = struct.getList_h_KEY7();
		List value7_list =struct.getList_h_VALUE7();
		List tempList = null;
    	if(this.screen_url.equals("AA0040010Servlet")){

			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_PUCH_UNIT_COST".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_PUCH_UNIT_COST_H");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("VEND_CD");
					detailStruct.seth_KEY3("ITEM_CD");
					detailStruct.seth_KEY4("PLANT_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("VEND_CD").toString());
					detailStruct.seth_VALUE3(tempMap.get("ITEM_CD").toString());
					detailStruct.seth_VALUE4(tempMap.get("PLANT_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr4.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00132");
						ret= true;
					}
				}
				if("M_PUCH_UNIT_COST_H".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_PUCH_UNIT_COST");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_KEY3(key3_list.get(i).toString());
					detailStruct.seth_KEY4(key4_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_VALUE3(value3_list.get(i).toString());
					detailStruct.seth_VALUE4(value4_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr4.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00134");
						ret= true;
					}
				}
			}	
			
    	} else if (this.screen_url.equals("AA0040020Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_SBCNT_UNIT_COST".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_SBCNT_UNIT_COST_H");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("VEND_CD");
					detailStruct.seth_KEY3("ITEM_CD");
					detailStruct.seth_KEY4("PLANT_CD");
					detailStruct.seth_KEY5("PROC_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("VEND_CD").toString());
					detailStruct.seth_VALUE3(tempMap.get("ITEM_CD").toString());
					detailStruct.seth_VALUE4(tempMap.get("PLANT_CD").toString());
					detailStruct.seth_VALUE5(tempMap.get("PROC_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr5.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00132");
						ret= true;
					}
				}
				if("M_SBCNT_UNIT_COST_H".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_SBCNT_UNIT_COST");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_KEY3(key3_list.get(i).toString());
					detailStruct.seth_KEY4(key4_list.get(i).toString());
					detailStruct.seth_KEY5(key5_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_VALUE3(value3_list.get(i).toString());
					detailStruct.seth_VALUE4(value4_list.get(i).toString());
					detailStruct.seth_VALUE5(value5_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr5.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00134");
						ret= true;
					}
				}
			}	
    	} else if (this.screen_url.equals("BA2020010Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_CLAIM_CUST_CTRL".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_CUST_STL_CTRL");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("BILL_ADDRESSEE_CD");
					detailStruct.seth_KEY3("STL_COND_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("BILL_ADDRESSEE_CD").toString());
					detailStruct.seth_VALUE3(tempMap.get("STL_COND_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr3.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00132");
						ret= true;
					}
				}
				if("M_CUST_STL_CTRL".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_CLAIM_CUST_CTRL");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_KEY3(key3_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_VALUE3(value3_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr3.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00134");
						ret= true;
					}
				}
			}	
    	} else if (this.screen_url.equals("BA2050010Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_CUST_BRANCH".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_CUST");
					detailStruct.seth_KEY1("COMPANY_CD");
					detailStruct.seth_KEY2("CUST_CD");
					detailStruct.seth_VALUE1(tempMap.get("COMPANY_CD").toString());
					detailStruct.seth_VALUE2(tempMap.get("CUST_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr2.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00132");
						ret= true;
					}
				}
				if("M_CUST".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_CUST_BRANCH");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_KEY2(key2_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_VALUE2(value2_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr2.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00134");
						ret= true;
					}
				}
			}	
    	} else if (this.screen_url.equals("BZ0050010Servlet")){
			for(int i = 0; i<tableName_lst.size(); i++) {
				String talbleName =  tableName_lst.get(i).toString();
				if("M_BANK".equals(talbleName) && "3".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					HashMap tempMap = new HashMap(); 
					tempMap.put(key1_list.get(i).toString(), value1_list.get(i).toString());
					tempMap.put(key2_list.get(i).toString(), value2_list.get(i).toString());
					tempMap.put(key3_list.get(i).toString(), value3_list.get(i).toString());
					tempMap.put(key4_list.get(i).toString(), value4_list.get(i).toString());
					tempMap.put(key5_list.get(i).toString(), value5_list.get(i).toString());
					tempMap.put(key6_list.get(i).toString(), value6_list.get(i).toString());
					tempMap.put(key7_list.get(i).toString(), value7_list.get(i).toString());			
					detailStruct.seth_TABLE_NAME("M_BANK_H");
					detailStruct.seth_KEY1("BANK_CD");
					detailStruct.seth_VALUE1(tempMap.get("BANK_CD").toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr1.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00132");
						ret= true;
					}
				}
				if("M_BANK_H".equals(talbleName) && "1".equals(procTyp_lst.get(i).toString())){
					AZ0060010Struct detailStruct  = new AZ0060010Struct();
					detailStruct.seth_TABLE_NAME("M_BANK");
					detailStruct.seth_KEY1(key1_list.get(i).toString());
					detailStruct.seth_VALUE1(value1_list.get(i).toString());
					detailStruct.seth_PROC_TYP(procTyp_lst.get(i).toString());
					tempList = commonEntity.mcheckAppr1.read(conn,detailStruct);
					if(!tempList.isEmpty()){
						setErrorMessage("KA00134");
						ret= true;
					}
				}
			}	
    	}
    	return ret;
    	
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		// マスタ系承認部品
		List apprPowerList = null;
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AZ0060010","AZ0060010Servlet");
		List resultList = new ArrayList();                                       //　検索結果リスト
		MstApprStruct tempStruct = new MstApprStruct();                          // 検索結果オブジェクト
		try {
			// ログインユーザーを基に［ユーザマスタ］承認権限をチェック
			struct.setLOGIN_USER_CD(this.getsysUSER_CD());
			apprPowerList = commonEntity.mcheckAPPR_POWER.read(conn,struct);
			if(apprPowerList.isEmpty()){
				setWarnMessage("AZ00037",struct.getLOGIN_USER_CD());
			}else{
				struct.seth_APPR_POWER_TYP(((AZ0060010Struct)apprPowerList.get(0)).geth_APPR_POWER_TYP());
				if("0".equals(struct.geth_APPR_POWER_TYP())){
					setWarnMessage("AZ00037",struct.getLOGIN_USER_CD());
				}
			}
			// 検索パターンを取得
			if("true".equals(struct.getr1_FILTER1())){
				struct.seth_SELECT_TYP("1");
			}else if("true".equals(struct.getr2_FILTER1())){
				struct.seth_SELECT_TYP("2");
			}else if("true".equals(struct.getr3_FILTER1())){
				struct.seth_SELECT_TYP("3");
			}
			// 承認依頼表検索結果格納用リストをクリア
			_resultlist.clear();
			// 承認明細検索結果格納用リストをクリア
			_detailList.clear();
			// マスタ系承認件数検索
			resultList = mstappr.select(this.getsysPLANT_CD(),this.getsysUSER_CD(),struct.geth_SELECT_TYP());
			// 検索結果をセット
			for(int i=0;i<resultList.size();i++){
				tempStruct = (MstApprStruct) resultList.get(i);
				AZ0060010Struct resultStruct = new AZ0060010Struct();
				resultStruct.seth_SCREEN_URL(tempStruct.getSCREEN_URL());
				resultStruct.setl_SCREEN_NAME(tempStruct.getSCREEN_NAME());
				resultStruct.setl_REQUEST_COUNT(tempStruct.getREQUEST_COUNT());
				resultStruct.setl_APPRING_COUNT(tempStruct.getAPPRING_COUNT());
				resultStruct.setl_RESERVE_COUNT(tempStruct.getRESERVE_COUNT());
				_resultlist.add(resultStruct);
			}
			if(_resultlist.size()<= 0){
				 // ZZ06001【対象データが存在しません。】
                this.setErrorMessage("ZZ06001");
			}
			setReadStatus(INITIAL);
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 選択承認ボタン押下時に実行される処理です。
	 *
	 */
	public void controlApprAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");
			//{{user_implement_dev:<controlApprAssort>
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		List procTyp_lst = struct.getList_h_PROC_TYP();
		// マスタ系承認部品
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AZ0060010","AZ0060010Servlet");
		String appr_ID = null;                                            // 承認ID
		String modify_Count = null;                                       // 更新数
		List tempList = null;                                             // 更新数チェック用リスト
		AZ0060010Struct tempStruct = new AZ0060010Struct();               // 更新数チェック用オブジェクト
		try {
			// 更新数チェック
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID =  (String) apprID_lst.get(i);
				modify_Count = (String) modifycount_lst.get(i);
				tempStruct.seth_APPR_ID(appr_ID);                         // 承認IDを設定
				tempStruct.seth_MODIFY_COUNT(modify_Count);               // 更新数を設定
				// 検索
				tempList = commonEntity.mselectMST_APPR.read(conn,tempStruct);
				if(tempList.isEmpty()){
					setErrorMessage("ZZ01105");
					return ;
				}
			}
			// チェック
			this.doCheck(apprID_lst, procTyp_lst, mstappr);
		
			if(msgStruct.hasError()){
				return;
			}
			// 一意制約処理区分設定
			if("KA1040010Servlet".equals(getScreen_url())){
				mstappr.setUniqueflg(false);
			}
			// 　選択承認を行く
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID =  (String) apprID_lst.get(i);
				// 得意先組合メンテナンスの場合、特別に処理
				if("KA2130010Servlet".equals(getScreen_url())) {
					mstappr.apprAssortKA2130(appr_ID,this.getsysUSER_CD(),BUSINESSOPRDATE,_HISTORY_FOR_APPR);	
				} else {
					mstappr.apprAssort(appr_ID,this.getsysUSER_CD(),BUSINESSOPRDATE,_HISTORY_FOR_APPR);	
				}
				
			}
			conn.commit();
			// 再読込
			controlSelect();
			controlClickShow();
		} catch(SQLException e) {
			// ロールバック
			conn.rollback();
			// 整合性制約をチェック
			switch(e.getErrorCode()){
			case 1: 
				setErrorMessage("ZZ01102");
				break;
			case 2291:
			case 2292:
				setErrorMessage("AZ00069"); 
				break;
			default: 
				// エラーメッセージ作成
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException ee = new ExpjException(e, emsg);
				throw ee;
			}
		} catch(Exception e) {
			e.printStackTrace();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally{
			// ロールバック
			conn.commit();
		}
                //}}user_implement_dev:<controlApprAssort>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");

		return;
	}

	/**
	 * 選択保留ボタン押下時に実行される処理です。
	 *
	 */
	public void controlReserveAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlReserveAssort");
			//{{user_implement_dev:<controlReserveAssort>
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		// マスタ系承認部品
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AZ0060010","AZ0060010Servlet");
		String appr_ID = null;                                            // 承認ID
		String modify_Count = null;                                       // 更新数
		List tempList = null;                                             // 更新数チェック用リスト
		AZ0060010Struct tempStruct = new AZ0060010Struct();               // 更新数チェック用オブジェクト
		try {
			// 更新数チェック
			for(int i=0;i<apprID_lst.size();i++){
					appr_ID =  (String) apprID_lst.get(i);
					modify_Count = (String) modifycount_lst.get(i);
					tempStruct.seth_APPR_ID(appr_ID);                         // 承認IDを設定
					tempStruct.seth_MODIFY_COUNT(modify_Count);               // 更新数を設定
					// 検索
					tempList = commonEntity.mselectMST_APPR.read(conn,tempStruct);
					if(tempList.isEmpty()){
						setErrorMessage("ZZ01105");
						return ;
					}
			}
			// 選択保留
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID =  (String) apprID_lst.get(i);
				mstappr.updateMST_APPR(appr_ID,"2",struct.getRESERVE_CAUSE(),this.getsysUSER_CD(),null);
				conn.commit();
			}
			
			struct.setRESERVE_CAUSE("");
			// 再読込
			controlSelect();
			controlClickShow();
		} catch(SQLException e) {
			// ロールバック
			conn.rollback();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlReserveAssort>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlReserveAssort");

		return;
	}

	/**
	 * 選択保留解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlReserveDelAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlReserveDelAssort");
			//{{user_implement_dev:<controlReserveDelAssort>
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		// マスタ系承認部品
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AZ0060010","AZ0060010Servlet");
		String appr_ID = null;                                            // 承認ID
		String modify_Count = null;                                       // 更新数
		List tempList = null;                                             // 更新数チェック用リスト
		AZ0060010Struct tempStruct = new AZ0060010Struct();               // 更新数チェック用オブジェクト
		try {
			// 更新数チェック
			for(int i=0;i<apprID_lst.size();i++){
				appr_ID =  (String) apprID_lst.get(i);
				modify_Count = (String) modifycount_lst.get(i);
				tempStruct.seth_APPR_ID(appr_ID);                         // 承認IDを設定
				tempStruct.seth_MODIFY_COUNT(modify_Count);               // 更新数を設定
				// 検索
				tempList = commonEntity.mselectMST_APPR.read(conn,tempStruct);
				if(tempList.isEmpty()){
					setErrorMessage("ZZ01105");
					return ;
				}
			}
			// 選択保留解除
			for(int i=0;i<apprID_lst.size();i++){
					appr_ID =  (String) apprID_lst.get(i);
					mstappr.updateMST_APPR(appr_ID,"1",null,null,null);
				}
			conn.commit();
			// 再読込
			controlSelect();
			controlClickShow();
		}catch(SQLException e) {
			// ロールバック
			conn.rollback();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlReserveDelAssort>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlReserveDelAssort");

		return;
	}

	/**
	 * 選択依頼削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlApprDelAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlApprDelAssort");
			//{{user_implement_dev:<controlApprDelAssort>
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		// マスタ系承認部品
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AZ0060010","AZ0060010Servlet");
		String appr_ID = null;                                            // 承認ID
		String modify_Count = null;                                       // 更新数
		List tempList = null;                                             // 更新数チェック用リスト
		AZ0060010Struct tempStruct = new AZ0060010Struct();               // 更新数チェック用オブジェクト
		try {
			
			
			    //  チェック
			    if (this.doApprDelCheck()){
			    	return;
			    }			
				// 更新数チェック
				for(int i = 0;i<apprID_lst.size();i++){
					appr_ID = (String) apprID_lst.get(i);
					modify_Count = (String) modifycount_lst.get(i);
					tempStruct.seth_APPR_ID(appr_ID);                         // 承認IDを設定
					tempStruct.seth_MODIFY_COUNT(modify_Count);               // 更新数を設定
					// 検索
					tempList = commonEntity.mselectMST_APPR.read(conn,tempStruct);
					if(tempList.isEmpty()){
						setErrorMessage("ZZ01105");
						return ;
					}
				}
				// 選択依頼削除
				for(int i = 0;i<apprID_lst.size();i++){
					appr_ID = (String) apprID_lst.get(i);
					mstappr.deleteAppr(appr_ID);	
				}
				conn.commit();
				// 再読込
				controlSelect();
				controlClickShow();
		} catch(SQLException e) {
			// ロールバック
			conn.rollback();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlApprDelAssort>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlApprDelAssort");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * 変更前ボタン押下時に実行される処理です。
	 *
	 */
	public void controlMastInfo() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlMastInfo");
			//{{user_implement_dev:<controlMastInfo>
			// TODO: ユーザ定義のコードを記述してください
		//try {
		//} catch(SQLException e) {
		//	e.printStackTrace();
			// エラー処理を記述してください。
		//}
                //}}user_implement_dev:<controlMastInfo>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlMastInfo");

		return;
	}

	/**
	 * 変更後ボタン押下時に実行される処理です。
	 *
	 */
	public void controlApprInfo() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlApprInfo");
			//{{user_implement_dev:<controlApprInfo>
			// TODO: ユーザ定義のコードを記述してください
		//try {
		//} catch(SQLException e) {
			//e.printStackTrace();
			// エラー処理を記述してください。
		//}
                //}}user_implement_dev:<controlApprInfo>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlApprInfo");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		_resultlist.clear();
		_detailList.clear();
		struct.seth_REQUEST_APPR_SAME(get_REQUEST_APPR_SAME());
		struct.seth_HISTORY_FOR_APPR(_HISTORY_FOR_APPR);
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ボタン押下時に実行される処理です。
	 *
	 */
	public void controlClickShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClickShow");
			//{{user_implement_dev:<controlClickShow>
		// マスタ系承認部品
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AZ0060010","AZ0060010Servlet");
		List resultList = new ArrayList();                                   // 承認明細リスト
		MstApprStruct tempStruct = new MstApprStruct();                      // 承認明細オブジェクト
		try {
			// 画面URLを設定
			if(null != struct.geth_SCREEN_URL()){
				setScreen_url(struct.geth_SCREEN_URL());
			}
			
			//　承認明細検索結果格納用リストをクリア
			_detailList.clear();
			// 得意先組合せメンテナンス画面で、「得意先組合」と「帳合先」を更新するので、特別処理
			if(!"KA2130010Servlet".equals(screen_url)) {
				// 承認明細検索
				resultList = mstappr.selectDetail(this.getsysPLANT_CD(),this.getsysUSER_CD(),screen_url,struct.geth_SELECT_TYP());
			} else {
				// 得意先組合せメンテナンス
				resultList = mstappr.selectDetailKA2130(this.getsysPLANT_CD(),this.getsysUSER_CD(),screen_url,struct.geth_SELECT_TYP());
			}
			
			int maxLine = sp.getMaxLine(conn,10);
			boolean tempFlag = false;
			// 承認明細結果を設定
			for(int i=0;i<resultList.size();i++){
				tempStruct = (MstApprStruct) resultList.get(i);
				AZ0060010Struct detailStruct  = new AZ0060010Struct();
				detailStruct.seth_STATUS(tempStruct.getSTATUS());
				detailStruct.seth_APPR_ID(tempStruct.getAPPR_ID());
				detailStruct.seth_PROC_TYP(tempStruct.getPROC_TYP());
				detailStruct.setl_PROC_TYP_VALUE(getTypeName(_PROC_TYP,detailStruct.geth_PROC_TYP()));
				detailStruct.setl_STATUS_NAME(getTypeName(_APPR_STATUS_TYP,detailStruct.geth_STATUS()));
				detailStruct.setl_APPR_REMARKS(tempStruct.getAPPR_REMARKS());
				detailStruct.setl_REQUEST_BY(tempStruct.getREQUEST_BY());
				detailStruct.setl_REQUEST_BY_NAME(tempStruct.getREQUEST_BY_NAME());
				detailStruct.setl_REQUEST_DATE(tempStruct.getREQUEST_DATE());
				detailStruct.setl_RESERVE_CAUSE(tempStruct.getRESERVE_CAUSE());
				detailStruct.seth_TABLE_NAME(tempStruct.getTABLE_NAEM());
				detailStruct.setl_ITEM_COL1(tempStruct.getITEM_COL1());
				detailStruct.setl_ITEM_COL2(tempStruct.getITEM_COL2());
				detailStruct.setl_ITEM_COL3(tempStruct.getITEM_COL3());
				detailStruct.setl_ITEM_COL4(tempStruct.getITEM_COL4());
				detailStruct.setl_ITEM_COL5(tempStruct.getITEM_COL5());
				detailStruct.seth_MODIFY_COUNT(tempStruct.getMODIFY_COUNT());
				detailStruct.seth_KEY1(tempStruct.getKey1());
				detailStruct.seth_VALUE1(tempStruct.getValue1());
				detailStruct.seth_KEY2(tempStruct.getKey2());
				detailStruct.seth_VALUE2(tempStruct.getValue2());
				detailStruct.seth_KEY3(tempStruct.getKey3());
				detailStruct.seth_VALUE3(tempStruct.getValue3());
				detailStruct.seth_KEY4(tempStruct.getKey4());
				detailStruct.seth_VALUE4(tempStruct.getValue4());
				detailStruct.seth_KEY5(tempStruct.getKey5());
				detailStruct.seth_VALUE5(tempStruct.getValue5());
				detailStruct.seth_KEY6(tempStruct.getKey6());
				detailStruct.seth_VALUE6(tempStruct.getValue6());
				detailStruct.seth_KEY7(tempStruct.getKey7());
				detailStruct.seth_VALUE7(tempStruct.getValue7());
				_detailList.add(detailStruct);
				if(_detailList.size() > maxLine){
					tempFlag = true;
					break;
				}
			}
			
			if(maxLine != 0 && tempFlag){
				ExpjMessage emsg = new ExpjMessage("ZZ01115",String.valueOf(maxLine));
				msgStruct.addError( emsg );
				sysLog.warning(emsg, getsysUSER_CD());
				// 検索状態を「最大行数オーバー」に設定
				setReadStatus(TOO_MANY);
				_detailList.clear();
			}else{
				// 検索状態を「読込成功」に設定
				setReadStatus(NORMAL);
			}
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlClickShow>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClickShow");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlClickDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClickDetail");
			//{{user_implement_dev:<controlClickDetail>
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AZ0060010","AZ0060010Servlet");
		List oldDateList= new ArrayList();                             // 変更前データリスト
		List newDateList = new ArrayList();                            // 変更後データリスト
		MstApprDetailStruct newStruct = new MstApprDetailStruct();     // 変更前データオブジェクト
		AZ0060010Struct oldStruct = new AZ0060010Struct();             // 変更後データオブジェクト
		try {
			setTable_name(struct.geth_TABLE_NAME());
			setProc_Typ(struct.geth_PROC_TYP());
			// マスタキーを取得
			getkey();
			// ユーザマスタの場合
			if (screen_url.equals("AA0090030Servlet")) {
				detailAA0090030( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 製品単価
			if (screen_url.equals("KA0040010Servlet")) {
				detailKA0040010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 支給品単価
			if (screen_url.equals("AA0040030Servlet")) {
				detailAA0040030( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 外注単価
			if (screen_url.equals("AA0040020Servlet") && "M_SBCNT_UNIT_COST_H".equals(struct.geth_TABLE_NAME())) {
				detailAA0040020H( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 外注単価
			if (screen_url.equals("AA0040020Servlet") && "M_SBCNT_UNIT_COST".equals(struct.geth_TABLE_NAME())) {
				detailAA0040020( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}

			// 購入単価
			if (screen_url.equals("AA0040010Servlet") && "M_PUCH_UNIT_COST_H".equals(struct.geth_TABLE_NAME())) {
				detailAA0040010H( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 購入単価
			if (screen_url.equals("AA0040010Servlet") && "M_PUCH_UNIT_COST".equals(struct.geth_TABLE_NAME())) {
				detailAA0040010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 取引先メンテナンス
			if (screen_url.equals("AA0070010Servlet")) {
				detailAA0070010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 請求条件メンテナンス　＆請求条件データ一括登録
			if (screen_url.equals("BA0020010Servlet") && "M_CUST_STL_CTRL".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0020010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 請求条件メンテナンス　＆請求条件データ一括登録
			if (screen_url.equals("BA0020010Servlet") && "M_CLAIM_CUST_CTRL".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0020010H( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 請求条件メンテナンス　＆請求条件データ一括登録
			if (screen_url.equals("BA0040010Servlet") && "M_CUST_STL_CTRL".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0020010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 請求条件メンテナンス　＆請求条件データ一括登録
			if (screen_url.equals("BA0040010Servlet") && "M_CLAIM_CUST_CTRL".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0020010H( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先メンテナンス
			if (screen_url.equals("KA0100010Servlet")) {
				detailKA0100010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先納品場所メンテナンス
			if (screen_url.equals("KA0100020Servlet")) {
				detailKA0100020( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 為替レート情報メンテナンス 
			if (screen_url.equals("AA0120010Servlet")) {
				detailAA0120010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先メンテナンス（売掛） 得意先マスタ
			if (screen_url.equals("BA0050010Servlet") && "M_CUST".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0050010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先メンテナンス（売掛） 得意先支店マスタ
			if (screen_url.equals("BA0050010Servlet") && "M_CUST_BRANCH".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0050010BRANCH( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 会社メンテナンス 得意先支店マスタ
			if (screen_url.equals("BZ0010010Servlet")) {
				detailBZ0010010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 利用者所属会社メンテナンス
			if (screen_url.equals("BZ0020010Servlet")) {
				detailBZ0020010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 銀行メンテナンス
			if (screen_url.equals("BZ0050010Servlet") && "M_BANK_H".equals(struct.geth_TABLE_NAME())) {
				detailBZ0050010H( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 銀行メンテナンス
			if (screen_url.equals("BZ0050010Servlet") && "M_BANK".equals(struct.geth_TABLE_NAME())) {
				detailBZ0050010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 銀行口座メンテナンス
			if (screen_url.equals("BZ0110010Servlet")) {
				detailBZ0110010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 再評価為替レートメンテナンス
			if (screen_url.equals("BZ0210010Servlet")) {
				detailBZ0210010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 科目メンテナンス
			if (screen_url.equals("BZ0250010Servlet")) {
				detailBZ0250010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 銀行手数料メンテナンス
			if (screen_url.equals("BZ0270010Servlet")) {
				detailBZ0270010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 取引先メンテナンス買掛
			if (screen_url.equals("CA0020010Servlet")) {
				detailCA0020010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 取引先支払条件メンテナンス
			if (screen_url.equals("CA0040010Servlet")) {
				detailCA0040010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 支払方法メンテナンス
			if (screen_url.equals("CA0060010Servlet")) {
				detailCA0060010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 支払パターンメンテナンス
			if (screen_url.equals("CA0080010Servlet")) {
				detailCA0080010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 利用者権限管理メンテナンス
			if (screen_url.equals("CA0100010Servlet")) {
				detailCA0100010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 買掛仕訳パターンメンテナンス
			if (screen_url.equals("CA0120010Servlet")) {
				detailCA0120010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 販売単価メンテナンスJa
			if (screen_url.equals("KA1020010Servlet")) {
				detailKA1020010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先メンテナンスJa
			if (screen_url.equals("KA1030010Servlet")) {
				detailKA1030010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 納品場所メンテナンスJa
			if (screen_url.equals("KA1040010Servlet")) {
				detailKA1040010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先指定納品場所メンテナンスJa
			if (screen_url.equals("KA1080010Servlet")) {
				detailKA1080010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 品目メンテナンス
			if (screen_url.equals("AA0010010Servlet")) {
				detailAA0010010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先メンテナンスJF
			if (screen_url.equals("KA2100010Servlet")) {
				detailKA0100010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 納品場所メンテナンスJF
			if (screen_url.equals("KA2100020Servlet")) {
				//納品場所メンテナンスと得意先納品場所メンテナンスは同じ項目がある
				detailKA0100020( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 製品単価JF
			if (screen_url.equals("KA2040010Servlet")) {
				detailKA2040010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 品目メンテナンスJF
			if (screen_url.equals("AA2010010Servlet")) {
				detailAA2010010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 取引先支払条件メンテナンスJF
			if (screen_url.equals("CA2040010Servlet")) {
				detailCA0040010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 在庫状態メンテナンスJF
			if (screen_url.equals("AA2340010Servlet")) {
				detailAA2340010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先組合せメンテナンスJF
			if (screen_url.equals("KA2130010Servlet")) {
				detailKA2130010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 請求条件メンテナンスJF
			if (screen_url.equals("BA2020010Servlet") && "M_CUST_STL_CTRL".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0020010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 請求条件メンテナンスJF
			if (screen_url.equals("BA2020010Servlet") && "M_CLAIM_CUST_CTRL".equals(struct.geth_TABLE_NAME()) ) {
				detailBA0020010H( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先メンテナンス（売掛）JF 得意先マスタ
			if (screen_url.equals("BA2050010Servlet") && "M_CUST".equals(struct.geth_TABLE_NAME()) ) {
				detailBA2050010( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
			// 得意先メンテナンス（売掛） JF 得意先支店マスタ
			if (screen_url.equals("BA2050010Servlet") && "M_CUST_BRANCH".equals(struct.geth_TABLE_NAME()) ) {
				detailBA2050010BRANCH( mstappr, oldDateList, newDateList, newStruct, oldStruct);
			}
		}catch(SQLException e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlClickDetail>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlClickDetail");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
		
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try {
          	PrivateConfig privateConfig = new PrivateConfig(conn);
          	
  			// パラメータ「依頼者承認者同一許可」を取得
          	String requestApprSame = privateConfig.getString("REQUEST_APPR_SAME");
          	// パラメータ「依頼者承認者同一許可」をセット
  			if (requestApprSame == null || "".equals(requestApprSame)) {
  				setErrorMessage("AA00212");
  				struct.seth_REQUEST_APPR_SAME("0");
  			} else if ("1".equals(requestApprSame)) {
  				struct.seth_REQUEST_APPR_SAME("1");
  			} else {
  				struct.seth_REQUEST_APPR_SAME("0");
  			}
  			_REQUEST_APPR_SAME = struct.geth_REQUEST_APPR_SAME(); 
  			
  			// パラメータ「マスタ承認履歴」を取得
  			String historyForAppr = privateConfig.getString("HISTORY_FOR_APPR");
  			// パラメータ「マスタ承認履歴」をセット
  			if (historyForAppr == null || "".equals(historyForAppr)) {
  				String locale = CoreTools.getLocale(struct.getsUser_ID());
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00087"));
  				msgStruct.addError(emsg); 
  				sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
  				struct.seth_HISTORY_FOR_APPR("0");
  			} else if ("1".equals(historyForAppr)) {
  				struct.seth_HISTORY_FOR_APPR("1");
  			} else {
  				struct.seth_HISTORY_FOR_APPR("0");
  			}
  			_HISTORY_FOR_APPR = struct.geth_HISTORY_FOR_APPR(); 
  			
  			//　業務運用日を取得
  			String businessOprDate = DateCtrl.getBusinessOprDate(conn, this.getsysPLANT_CD());
  			if(businessOprDate ==null || "".equals(businessOprDate)){
  				// 業務日付情報が無い/複数件
                //エラーメッセージ出力
                ExpjMessage emsg = new ExpjMessage("KQ00026");
                msgStruct.addError(emsg);
                sysLog.severe(emsg, getsysUSER_CD());
                setReadStatus(ERROR);
  			}else{
  				BUSINESSOPRDATE = businessOprDate;
  			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// エラー：サーバでエラーが発生しました。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD());
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0060");
		logger.entering("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// コンボボックス部品のデータのセットはここに記述してください。
			try{
			ComboBox comboController = new ComboBox(conn,sysUSER_CD);
			// 処理区分
			_PROC_TYP = comboController.getData("APPR_PROC_TYP");
			// 承認状態
			_APPR_STATUS_TYP = comboController.getData("APPR_STATUS_TYP");
			// 多言語 
			_LOCALE = comboController.getData("LOCALE");
			// 承認権限
			_APPR_POWER_TYP = comboController.getData("APPR_POWER_TYP");
			//単価区分
			_CONS_UNIT_COST = comboController.getData("UNIT_COST_TYP");
			// 特値区分
			_SPCL_PRICE_TYPE = comboController.getData("SPCL_PRICE_TYPE");
			// 有償フラグ
			_ONEROUS_FLG = comboController.getData("ONEROUS_FLG");
			// 発注金額まるめ
			_ROUND_TYP = comboController.getData("ROUND_TYP");
			// 消費税適用区分 (取引先メンテナンス)
			_TAX_APPLY_TYP = comboController.getData("TAX_APPLY_TYP");
			// 消費税適用区分 (得意先メンテナンス)
			_TAX_APPLY_TYP_SAAR = comboController.getData("TAX_APPLY_TYP_SAAR");
			// 消費税計算区分 (取引先メンテナンス)
			_TAX_CALC_TYP = comboController.getData("TAX_CALC_TYP");
			// 消費税計算区分(得意先メンテナンス)
			_TAX_CALC_TYP_SAAR = comboController.getData("TAX_CALC_TYP_SAAR");
			// 為替種別
			_EXCH_TYP = comboController.getData("EXCH_TYP");
			// 輸入取引区分
			_IMPORT_TRN_TYP = comboController.getData("IMPORT_TRN_TYP");
			// 検収計上区分
			_INSPC_ACPT_APP_TYP = comboController.getData("INSPC_ACPT_APP_TYP");
			// EDI取引区分(請求)
			_EDI_TRN_BILL_TYP = comboController.getData("EDI_TRN_BILL_TYP");
		    // EDI取引区分（入金） 
		    _EDI_TRN_RM_TYP = comboController.getData("EDI_TRN_RM_TYP");
		    // 請求残高管理フラグ
		    _BILL_BALANCE_CTRL_FLG = comboController.getData("BALANCE_CTRL_FLG");
		    // 売掛金残高管理フラグ 
		    _AR_BALANCE_CTRL_FLG = comboController.getData("BALANCE_CTRL_FLG");
			// 検収区分
		    _INSPC_ACPT_TYP = comboController.getData("INSPC_ACPT_TYP");
		    // 分納出荷指示F
		    _PARTIAL_SHIP_INST_FLG = comboController.getData("PARTIAL_SHIP_INST_FLG");
		    // 明細計算まるめ区分
		    _DETAIL_ROUND_TYP = comboController.getData("DETAIL_ROUND_TYP");
		    // 利用者区分 
            _USER_TYP = comboController.getData("USER_TYP");
            // ＦＢデータ区分
            _FB_DATA_TYP = comboController.getData("FB_DATA_TYP");
            // 補助区分コード
            _SUB_ACCT_CD = comboController.getData("SUB_ACCT_CD");
            // 原始区分
            _PRIMITIVE_TYP = comboController.getData("PRIMITIVE_TYP");
            // 貸借区分
            _DR_CR_TYP = comboController.getData("DR_CR_TYP");
        	// 科目区分
        	_ACCT_TYP = comboController.getData("ACCT_TYP");
        	// 補助科目規定値
        	_SUB_ACCT_TYP_DEFAULT = comboController.getData("SUB_ACCT_TYP_DEFAULT");
        	// 内部取引区分 
        	_INTERNAL_TRN_TYP = comboController.getData("INTERNAL_TRN_TYP");
        	//振込先区分
        	_TRF_TYP = comboController.getData("TRF_TYP");
        	// 振込内容区分
        	_CONTENTS_TYP = comboController.getData("CONTENTS_TYP");
        	// 振込情報区分
        	_INFO_TYP = comboController.getData("INFO_TYP");
        	// 支払対象
        	_PAY_TARGET_TYP = comboController.getData("PAY_TARGET_TYP");
        	// 借方部門設定区分
        	_DR_ORG_TYP = comboController.getData("ORG_TYP");
        	// 貸方部門設定区分
        	_CR_ORG_TYP = comboController.getData("ORG_TYP");
        	// 入金相殺区分
        	_RM_OFFSET_TYP = comboController.getData("RM_OFFSET_TYP"); 
        	// 用途別単価区分
        	_PURPOSE_UNIT_PRICE_TYP = comboController.getData("PURPOSE_UNIT_PRICE_TYP"); 
        	// 出荷管理先区分
        	_SHIP_CTL_TYP = comboController.getData("SHIP_CTL_TYP"); 
        	// 納品書発行フラグ
        	 _DLV_SLIP_ISS_FLG = comboController.getData("DLV_SLIP_ISS_FLG"); 
        	// 現品エフ発行区分
            _IDENT_CARD_F_ISS_TYP = comboController.getData("IDENT_CARD_F_ISS_TYP"); 
        	// 現品エフフォーマット区分
        	_IDENT_CARD_F_FORMAT_TYP = comboController.getData("IDENT_CARD_F_FORMAT_TYP"); 
        	//量産区分
        	_MASS_PRODUCT_TYP = comboController.getData("MASS_PRODUCT_TYP"); 
        	// 確定置換パターン
        	 _DECISION_REPLACE_PTN = comboController.getData("DECISION_REPLACE_PTN"); 
        	//出荷実績適用区分
        	 _SHIP_RSLT_APPLY_TYP = comboController.getData("SHIP_RSLT_APPLY_TYP"); 
        	// 集結先出荷実績適用区分
        	 _CNCNTRT_SHIP_RSLT_APPLY_TYP = comboController.getData("CNCNTRT_SHIP_RSLT_APPLY_TYP");  
        	// 次便ずらし有無フラグ
        	 _NEXT_DLV_SHIFT_EFF_FLG = comboController.getData("NEXT_DLV_SHIFT_EFF_FLG"); 
        	// 内示計画均等割りフラグ
        	 _UNCNFM_PLAN_AVG_FLG = comboController.getData("UNCNFM_PLAN_AVG_FLG"); 
        	// 出庫区分
        	_ISSUE_TYP = comboController.getData("ISSUE_TYP"); 
        	// 内外作区分
        	_OUTSIDE_TYP = comboController.getData("OUTSIDE_TYP");
        	// 荷姿管理フラグ
        	_STOCK_UNIT_FLG = comboController.getData("STOCK_UNIT_FLG");
        	// 在庫数単位区分
        	_UNIT_QTY_TYP = comboController.getData("UNIT_QTY_TYP");
        	// 品目手配区分
        	_MRP_ODR_TYP = comboController.getData("MRP_ODR_TYP");
        	// ロットまとめ区分
        	_LOT_SIZING_TYP = comboController.getData("LOT_SIZING_TYP");
        	// 工数管理品目区分
        	_MANHOUR_TYP = comboController.getData("MANHOUR_TYP");
        	// MPS品目フラグ
        	_MPS_FLG = comboController.getData("MPS_FLG");
        	// 受入検査区分
        	_ACPT_INSPC_TYP = comboController.getData("ACPT_INSPC_TYP");
        	// 製品区分
        	_PRODUCT_TYP = comboController.getData("PRODUCT_TYP");
        	// 棚卸区分
        	_ABC_TYP = comboController.getData("ABC_TYP");
        	// 作業実績区分
        	_OPR_RSLT_TYP = comboController.getData("OPR_RSLT_TYP");
        	// 受給品区分
        	_SPL_ITEM_TYP = comboController.getData("SPL_ITEM_TYP");
        	// 計量単位
        	_STOCK_UNIT = comboController.getData("STOCK_UNIT");
        	// 保管区分
        	_DEPO_TYP = comboController.getData("WH_COND_TYP");
        	// 保管区分JF
        	_DEPO_TYP_JF = comboController.getData("WH_COND");
        	// ロット管理フラグ
        	_LOT_CTRL_FLG = comboController.getData("LOT_TYP");
        	// ロット採番区分
        	_LOT_NUMBERING_TYP = comboController.getData("LOT_NUMBERING");
        	// 得意先フラグ
        	_CUST_FLG = comboController.getData("CUST_FLG");
        	// 納入先フラグ
        	_DELIVERY_FLG =comboController.getData("DELIVERY_FLG");
        	// 帳合先フラグ
        	_BALA_ACCO_FLG = comboController.getData("BALA_ACCO_FLG");
        	// 単価取得区分
        	_UNIT_COST_USE_TYP = comboController.getData("UNIT_COST_USE_TYP");
        	// 請求先フラグ
        	_BILL_ADDRESSEE_FLG = comboController.getData("BILL_ADDRESSEE_FLG");
        	// 入金先フラグ
        	_RM_FLG = comboController.getData("RM_FLG");
        	// 請求サイクル
        	_CLAIM_CYCLE_TYP = comboController.getData("CLAIM_CYCLE_TYP");
        	// 仮単価売上計上フラグ
        	_INSPC_ACPT_FLG = comboController.getData("INSPC_ACPT_FLG");
        	// 入金入力区分
        	_RM_INP_TYP = comboController.getData("RM_INP_TYP");
        	// 取引停止フラグ
        	_TRN_STOP_FLG = comboController.getData("TRN_STOP_FLG");
        	// 在庫状態タイプ*/
        	_STOCK_TYP = comboController.getData("STOCK_TYP");
        	// 出荷区分*/
        	_SHIP_TYP_3 = comboController.getData("SHIP_TYP_3");
        	
			}catch(SQLException e){
				e.printStackTrace();
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AZ0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("ApprAssort") ) {
				controlApprAssort();
			} else if( button.equals("ReserveAssort") ) {
				controlReserveAssort();
			} else if( button.equals("ReserveDelAssort") ) {
				controlReserveDelAssort();
			} else if( button.equals("ApprDelAssort") ) {
				controlApprDelAssort();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("MastInfo") ) {
				controlMastInfo();
			} else if( button.equals("ApprInfo") ) {
				controlApprInfo();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("ClickShow") ) {
				controlClickShow();
			} else if( button.equals("ClickDetail") ) {
				controlClickDetail();
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
//			throw new FoundationException("AZ0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0060010-E999","CSVの出力処理"));
			throw new FoundationException("AZ0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0060010-E999","システム日付の取得処理"));
				throw new FoundationException("AZ0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("AZ0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AZ0060010Entity entity;
	protected AZ0060010Struct struct;
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

		entity = new AZ0060010Entity();
		struct = new AZ0060010Struct();

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
	 * AZ0060010クラスの標準コンストラクタ
	 */
	public AZ0060010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		commonEntity = null;
		commonEntity = new AZ0060010Common();
		
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
				AZ0060010Struct key = (AZ0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r3_FILTER1") && key.getr3_FILTER1() != null) {
					msgKey.setKeyValue("r3_FILTER1", key.getr3_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("h_SELECT_TYP") && key.geth_SELECT_TYP() != null) {
					msgKey.setKeyValue("h_SELECT_TYP", key.geth_SELECT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SCREEN_NAME") && key.getl_SCREEN_NAME() != null) {
					msgKey.setKeyValue("l_SCREEN_NAME", key.getl_SCREEN_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_COUNT") && key.getl_REQUEST_COUNT() != null) {
					msgKey.setKeyValue("l_REQUEST_COUNT", key.getl_REQUEST_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_APPRING_COUNT") && key.getl_APPRING_COUNT() != null) {
					msgKey.setKeyValue("l_APPRING_COUNT", key.getl_APPRING_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_RESERVE_COUNT") && key.getl_RESERVE_COUNT() != null) {
					msgKey.setKeyValue("l_RESERVE_COUNT", key.getl_RESERVE_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_REMARKS") && key.getl_APPR_REMARKS() != null) {
					msgKey.setKeyValue("l_APPR_REMARKS", key.getl_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_BY") && key.getl_REQUEST_BY() != null) {
					msgKey.setKeyValue("l_REQUEST_BY", key.getl_REQUEST_BY());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_DATE") && key.getl_REQUEST_DATE() != null) {
					msgKey.setKeyValue("l_REQUEST_DATE", key.getl_REQUEST_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_COL1") && key.getl_ITEM_COL1() != null) {
					msgKey.setKeyValue("l_ITEM_COL1", key.getl_ITEM_COL1());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_COL2") && key.getl_ITEM_COL2() != null) {
					msgKey.setKeyValue("l_ITEM_COL2", key.getl_ITEM_COL2());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_COL3") && key.getl_ITEM_COL3() != null) {
					msgKey.setKeyValue("l_ITEM_COL3", key.getl_ITEM_COL3());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_COL4") && key.getl_ITEM_COL4() != null) {
					msgKey.setKeyValue("l_ITEM_COL4", key.getl_ITEM_COL4());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_COL5") && key.getl_ITEM_COL5() != null) {
					msgKey.setKeyValue("l_ITEM_COL5", key.getl_ITEM_COL5());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_TYP_VALUE") && key.getl_PROC_TYP_VALUE() != null) {
					msgKey.setKeyValue("l_PROC_TYP_VALUE", key.getl_PROC_TYP_VALUE());
				}
				if(msgKeyType.containsKeyColumn("h_PROC_TYP") && key.geth_PROC_TYP() != null) {
					msgKey.setKeyValue("h_PROC_TYP", key.geth_PROC_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_STATUS") && key.geth_STATUS() != null) {
					msgKey.setKeyValue("h_STATUS", key.geth_STATUS());
				}
				if(msgKeyType.containsKeyColumn("h_SCREEN_URL") && key.geth_SCREEN_URL() != null) {
					msgKey.setKeyValue("h_SCREEN_URL", key.geth_SCREEN_URL());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_USER_CD") && key.getd_OLD_USER_CD() != null) {
					msgKey.setKeyValue("d_OLD_USER_CD", key.getd_OLD_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_USER_CD") && key.getd_NEW_USER_CD() != null) {
					msgKey.setKeyValue("d_NEW_USER_CD", key.getd_NEW_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("d_USER_CD_CHANGE") && key.getd_USER_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_USER_CD_CHANGE", key.getd_USER_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_USER_NAME") && key.getd_OLD_USER_NAME() != null) {
					msgKey.setKeyValue("d_OLD_USER_NAME", key.getd_OLD_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_USER_NAME") && key.getd_NEW_USER_NAME() != null) {
					msgKey.setKeyValue("d_NEW_USER_NAME", key.getd_NEW_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_USER_NAME_CHANGE") && key.getd_USER_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_USER_NAME_CHANGE", key.getd_USER_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PLANT_CD") && key.getd_OLD_PLANT_CD() != null) {
					msgKey.setKeyValue("d_OLD_PLANT_CD", key.getd_OLD_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PLANT_CD") && key.getd_NEW_PLANT_CD() != null) {
					msgKey.setKeyValue("d_NEW_PLANT_CD", key.getd_NEW_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PLANT_CD_CHANGE") && key.getd_PLANT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_PLANT_CD_CHANGE", key.getd_PLANT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PASSWORD") && key.getd_OLD_PASSWORD() != null) {
					msgKey.setKeyValue("d_OLD_PASSWORD", key.getd_OLD_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PASSWORD") && key.getd_NEW_PASSWORD() != null) {
					msgKey.setKeyValue("d_NEW_PASSWORD", key.getd_NEW_PASSWORD());
				}
				if(msgKeyType.containsKeyColumn("d_PASSWORD_CHANGE") && key.getd_PASSWORD_CHANGE() != null) {
					msgKey.setKeyValue("d_PASSWORD_CHANGE", key.getd_PASSWORD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_APPR_POWER_TYP") && key.getd_OLD_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("d_OLD_APPR_POWER_TYP", key.getd_OLD_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_APPR_POWER_TYP") && key.getd_NEW_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("d_NEW_APPR_POWER_TYP", key.getd_NEW_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS") && key.getd_OLD_ADDRESS() != null) {
					msgKey.setKeyValue("d_OLD_ADDRESS", key.getd_OLD_ADDRESS());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS") && key.getd_NEW_ADDRESS() != null) {
					msgKey.setKeyValue("d_NEW_ADDRESS", key.getd_NEW_ADDRESS());
				}
				if(msgKeyType.containsKeyColumn("d_ADDRESS_CHANGE") && key.getd_ADDRESS_CHANGE() != null) {
					msgKey.setKeyValue("d_ADDRESS_CHANGE", key.getd_ADDRESS_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_LOCALE") && key.getd_OLD_LOCALE() != null) {
					msgKey.setKeyValue("d_OLD_LOCALE", key.getd_OLD_LOCALE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_LOCALE") && key.getd_NEW_LOCALE() != null) {
					msgKey.setKeyValue("d_NEW_LOCALE", key.getd_NEW_LOCALE());
				}
				if(msgKeyType.containsKeyColumn("d_LOCALE_CHANGE") && key.getd_LOCALE_CHANGE() != null) {
					msgKey.setKeyValue("d_LOCALE_CHANGE", key.getd_LOCALE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE") && key.getl_RESERVE_CAUSE() != null) {
					msgKey.setKeyValue("l_RESERVE_CAUSE", key.getl_RESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("h_REQUEST_APPR_SAME") && key.geth_REQUEST_APPR_SAME() != null) {
					msgKey.setKeyValue("h_REQUEST_APPR_SAME", key.geth_REQUEST_APPR_SAME());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP") && key.geth_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APPR_POWER_TYP", key.geth_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ITEM_CD") && key.getd_OLD_ITEM_CD() != null) {
					msgKey.setKeyValue("d_OLD_ITEM_CD", key.getd_OLD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ITEM_CD") && key.getd_NEW_ITEM_CD() != null) {
					msgKey.setKeyValue("d_NEW_ITEM_CD", key.getd_NEW_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_CD_CHANGE") && key.getd_ITEM_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_ITEM_CD_CHANGE", key.getd_ITEM_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_CD") && key.getd_OLD_CUST_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_CD", key.getd_OLD_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_CD") && key.getd_NEW_CUST_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_CD", key.getd_NEW_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_CD_CHANGE") && key.getd_CUST_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_CD_CHANGE", key.getd_CUST_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EFF_PHASE_IN_DATE") && key.getd_OLD_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("d_OLD_EFF_PHASE_IN_DATE", key.getd_OLD_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EFF_PHASE_IN_DATE") && key.getd_NEW_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("d_NEW_EFF_PHASE_IN_DATE", key.getd_NEW_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_EFF_PHASE_IN_DATE_CHANGE") && key.getd_EFF_PHASE_IN_DATE_CHANGE() != null) {
					msgKey.setKeyValue("d_EFF_PHASE_IN_DATE_CHANGE", key.getd_EFF_PHASE_IN_DATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_UNIT_COST_TYP") && key.getd_NEW_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("d_NEW_UNIT_COST_TYP", key.getd_NEW_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_UNIT_COST_TYP_CHANGE") && key.getd_UNIT_COST_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_UNIT_COST_TYP_CHANGE", key.getd_UNIT_COST_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_UNIT_COST") && key.getd_OLD_UNIT_COST() != null) {
					msgKey.setKeyValue("d_OLD_UNIT_COST", key.getd_OLD_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_UNIT_COST") && key.getd_NEW_UNIT_COST() != null) {
					msgKey.setKeyValue("d_NEW_UNIT_COST", key.getd_NEW_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("d_UNIT_COST_CHANGE") && key.getd_UNIT_COST_CHANGE() != null) {
					msgKey.setKeyValue("d_UNIT_COST_CHANGE", key.getd_UNIT_COST_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_UNIT_COST_TYP") && key.getd_OLD_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("d_OLD_UNIT_COST_TYP", key.getd_OLD_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_APPR_POWER_TYP_CHANGE") && key.getd_APPR_POWER_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_APPR_POWER_TYP_CHANGE", key.getd_APPR_POWER_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_CD") && key.getd_OLD_VEND_CD() != null) {
					msgKey.setKeyValue("d_OLD_VEND_CD", key.getd_OLD_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_CD") && key.getd_NEW_VEND_CD() != null) {
					msgKey.setKeyValue("d_NEW_VEND_CD", key.getd_NEW_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_CD_CHANGE") && key.getd_VEND_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_CD_CHANGE", key.getd_VEND_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ONEROUS_FLG") && key.getd_OLD_ONEROUS_FLG() != null) {
					msgKey.setKeyValue("d_OLD_ONEROUS_FLG", key.getd_OLD_ONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ONEROUS_FLG") && key.getd_NEW_ONEROUS_FLG() != null) {
					msgKey.setKeyValue("d_NEW_ONEROUS_FLG", key.getd_NEW_ONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_ONEROUS_FLG_CHANGE") && key.getd_ONEROUS_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_ONEROUS_FLG_CHANGE", key.getd_ONEROUS_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PROC_CD") && key.getd_OLD_PROC_CD() != null) {
					msgKey.setKeyValue("d_OLD_PROC_CD", key.getd_OLD_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PROC_CD") && key.getd_NEW_PROC_CD() != null) {
					msgKey.setKeyValue("d_NEW_PROC_CD", key.getd_NEW_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PROC_CD_CHANGE") && key.getd_PROC_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_PROC_CD_CHANGE", key.getd_PROC_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PROCESSING_COST") && key.getd_OLD_PROCESSING_COST() != null) {
					msgKey.setKeyValue("d_OLD_PROCESSING_COST", key.getd_OLD_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PROCESSING_COST") && key.getd_NEW_PROCESSING_COST() != null) {
					msgKey.setKeyValue("d_NEW_PROCESSING_COST", key.getd_NEW_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("d_PROCESSING_COST_CHANGE") && key.getd_PROCESSING_COST_CHANGE() != null) {
					msgKey.setKeyValue("d_PROCESSING_COST_CHANGE", key.getd_PROCESSING_COST_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MATERIAL_COST") && key.getd_OLD_MATERIAL_COST() != null) {
					msgKey.setKeyValue("d_OLD_MATERIAL_COST", key.getd_OLD_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MATERIAL_COST") && key.getd_NEW_MATERIAL_COST() != null) {
					msgKey.setKeyValue("d_NEW_MATERIAL_COST", key.getd_NEW_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("d_MATERIAL_COST_CHANGE") && key.getd_MATERIAL_COST_CHANGE() != null) {
					msgKey.setKeyValue("d_MATERIAL_COST_CHANGE", key.getd_MATERIAL_COST_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OTHER_OVERHEADS") && key.getd_OLD_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("d_OLD_OTHER_OVERHEADS", key.getd_OLD_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OTHER_OVERHEADS") && key.getd_NEW_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("d_NEW_OTHER_OVERHEADS", key.getd_NEW_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("d_OTHER_OVERHEADS_CHANGE") && key.getd_OTHER_OVERHEADS_CHANGE() != null) {
					msgKey.setKeyValue("d_OTHER_OVERHEADS_CHANGE", key.getd_OTHER_OVERHEADS_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_BY_NAME") && key.getl_REQUEST_BY_NAME() != null) {
					msgKey.setKeyValue("l_REQUEST_BY_NAME", key.getl_REQUEST_BY_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_KEY1") && key.geth_KEY1() != null) {
					msgKey.setKeyValue("h_KEY1", key.geth_KEY1());
				}
				if(msgKeyType.containsKeyColumn("h_VALUE1") && key.geth_VALUE1() != null) {
					msgKey.setKeyValue("h_VALUE1", key.geth_VALUE1());
				}
				if(msgKeyType.containsKeyColumn("h_KEY2") && key.geth_KEY2() != null) {
					msgKey.setKeyValue("h_KEY2", key.geth_KEY2());
				}
				if(msgKeyType.containsKeyColumn("h_VALUE2") && key.geth_VALUE2() != null) {
					msgKey.setKeyValue("h_VALUE2", key.geth_VALUE2());
				}
				if(msgKeyType.containsKeyColumn("h_KEY3") && key.geth_KEY3() != null) {
					msgKey.setKeyValue("h_KEY3", key.geth_KEY3());
				}
				if(msgKeyType.containsKeyColumn("h_VALUE3") && key.geth_VALUE3() != null) {
					msgKey.setKeyValue("h_VALUE3", key.geth_VALUE3());
				}
				if(msgKeyType.containsKeyColumn("h_KEY4") && key.geth_KEY4() != null) {
					msgKey.setKeyValue("h_KEY4", key.geth_KEY4());
				}
				if(msgKeyType.containsKeyColumn("h_VALUE4") && key.geth_VALUE4() != null) {
					msgKey.setKeyValue("h_VALUE4", key.geth_VALUE4());
				}
				if(msgKeyType.containsKeyColumn("h_KEY5") && key.geth_KEY5() != null) {
					msgKey.setKeyValue("h_KEY5", key.geth_KEY5());
				}
				if(msgKeyType.containsKeyColumn("h_VALUE5") && key.geth_VALUE5() != null) {
					msgKey.setKeyValue("h_VALUE5", key.geth_VALUE5());
				}
				if(msgKeyType.containsKeyColumn("h_KEY6") && key.geth_KEY6() != null) {
					msgKey.setKeyValue("h_KEY6", key.geth_KEY6());
				}
				if(msgKeyType.containsKeyColumn("h_VALUE6") && key.geth_VALUE6() != null) {
					msgKey.setKeyValue("h_VALUE6", key.geth_VALUE6());
				}
				if(msgKeyType.containsKeyColumn("h_KEY7") && key.geth_KEY7() != null) {
					msgKey.setKeyValue("h_KEY7", key.geth_KEY7());
				}
				if(msgKeyType.containsKeyColumn("h_VALUE7") && key.geth_VALUE7() != null) {
					msgKey.setKeyValue("h_VALUE7", key.geth_VALUE7());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_NAME") && key.geth_TABLE_NAME() != null) {
					msgKey.setKeyValue("h_TABLE_NAME", key.geth_TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_ITEM_CD") && key.getd_OLD_VEND_ITEM_CD() != null) {
					msgKey.setKeyValue("d_OLD_VEND_ITEM_CD", key.getd_OLD_VEND_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_ITEM_CD") && key.getd_NEW_VEND_ITEM_CD() != null) {
					msgKey.setKeyValue("d_NEW_VEND_ITEM_CD", key.getd_NEW_VEND_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_ITEM_CD_CHANGE") && key.getd_VEND_ITEM_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_ITEM_CD_CHANGE", key.getd_VEND_ITEM_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PUCH_PRIORITY_REF_NO") && key.getd_OLD_PUCH_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("d_OLD_PUCH_PRIORITY_REF_NO", key.getd_OLD_PUCH_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PUCH_PRIORITY_REF_NO") && key.getd_NEW_PUCH_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("d_NEW_PUCH_PRIORITY_REF_NO", key.getd_NEW_PUCH_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_PUCH_PRIORITY_REF_NO_CHANGE") && key.getd_PUCH_PRIORITY_REF_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_PUCH_PRIORITY_REF_NO_CHANGE", key.getd_PUCH_PRIORITY_REF_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PUCH_SIZE") && key.getd_OLD_PUCH_SIZE() != null) {
					msgKey.setKeyValue("d_OLD_PUCH_SIZE", key.getd_OLD_PUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PUCH_SIZE") && key.getd_NEW_PUCH_SIZE() != null) {
					msgKey.setKeyValue("d_NEW_PUCH_SIZE", key.getd_NEW_PUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_PUCH_SIZE_CHANGE") && key.getd_PUCH_SIZE_CHANGE() != null) {
					msgKey.setKeyValue("d_PUCH_SIZE_CHANGE", key.getd_PUCH_SIZE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_NAME") && key.getd_OLD_VEND_NAME() != null) {
					msgKey.setKeyValue("d_OLD_VEND_NAME", key.getd_OLD_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_NAME") && key.getd_NEW_VEND_NAME() != null) {
					msgKey.setKeyValue("d_NEW_VEND_NAME", key.getd_NEW_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_NAME_CHANGE") && key.getd_VEND_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_NAME_CHANGE", key.getd_VEND_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_ANAME") && key.getd_OLD_VEND_ANAME() != null) {
					msgKey.setKeyValue("d_OLD_VEND_ANAME", key.getd_OLD_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_ANAME") && key.getd_NEW_VEND_ANAME() != null) {
					msgKey.setKeyValue("d_NEW_VEND_ANAME", key.getd_NEW_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ZIP_CD") && key.getd_OLD_ZIP_CD() != null) {
					msgKey.setKeyValue("d_OLD_ZIP_CD", key.getd_OLD_ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ZIP_CD") && key.getd_NEW_ZIP_CD() != null) {
					msgKey.setKeyValue("d_NEW_ZIP_CD", key.getd_NEW_ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("d_ZIP_CD_CHANGE") && key.getd_ZIP_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_ZIP_CD_CHANGE", key.getd_ZIP_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_1") && key.getd_OLD_ADDRESS_1() != null) {
					msgKey.setKeyValue("d_OLD_ADDRESS_1", key.getd_OLD_ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_1") && key.getd_NEW_ADDRESS_1() != null) {
					msgKey.setKeyValue("d_NEW_ADDRESS_1", key.getd_NEW_ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("d_ADDRESS_1_CHANGE") && key.getd_ADDRESS_1_CHANGE() != null) {
					msgKey.setKeyValue("d_ADDRESS_1_CHANGE", key.getd_ADDRESS_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_2") && key.getd_OLD_ADDRESS_2() != null) {
					msgKey.setKeyValue("d_OLD_ADDRESS_2", key.getd_OLD_ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_2") && key.getd_NEW_ADDRESS_2() != null) {
					msgKey.setKeyValue("d_NEW_ADDRESS_2", key.getd_NEW_ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("d_ADDRESS_2_CHANGE") && key.getd_ADDRESS_2_CHANGE() != null) {
					msgKey.setKeyValue("d_ADDRESS_2_CHANGE", key.getd_ADDRESS_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_K_1") && key.getd_OLD_ADDRESS_K_1() != null) {
					msgKey.setKeyValue("d_OLD_ADDRESS_K_1", key.getd_OLD_ADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_K_1") && key.getd_NEW_ADDRESS_K_1() != null) {
					msgKey.setKeyValue("d_NEW_ADDRESS_K_1", key.getd_NEW_ADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("d_ADDRESS_K_1_CHANGE") && key.getd_ADDRESS_K_1_CHANGE() != null) {
					msgKey.setKeyValue("d_ADDRESS_K_1_CHANGE", key.getd_ADDRESS_K_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_K_2") && key.getd_OLD_ADDRESS_K_2() != null) {
					msgKey.setKeyValue("d_OLD_ADDRESS_K_2", key.getd_OLD_ADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_K_2") && key.getd_NEW_ADDRESS_K_2() != null) {
					msgKey.setKeyValue("d_NEW_ADDRESS_K_2", key.getd_NEW_ADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("d_ADDRESS_K_2_CHANGE") && key.getd_ADDRESS_K_2_CHANGE() != null) {
					msgKey.setKeyValue("d_ADDRESS_K_2_CHANGE", key.getd_ADDRESS_K_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TEL") && key.getd_OLD_TEL() != null) {
					msgKey.setKeyValue("d_OLD_TEL", key.getd_OLD_TEL());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TEL") && key.getd_NEW_TEL() != null) {
					msgKey.setKeyValue("d_NEW_TEL", key.getd_NEW_TEL());
				}
				if(msgKeyType.containsKeyColumn("d_TEL_CHANGE") && key.getd_TEL_CHANGE() != null) {
					msgKey.setKeyValue("d_TEL_CHANGE", key.getd_TEL_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_FAX") && key.getd_OLD_FAX() != null) {
					msgKey.setKeyValue("d_OLD_FAX", key.getd_OLD_FAX());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_FAX") && key.getd_NEW_FAX() != null) {
					msgKey.setKeyValue("d_NEW_FAX", key.getd_NEW_FAX());
				}
				if(msgKeyType.containsKeyColumn("d_FAX_CHANGE") && key.getd_FAX_CHANGE() != null) {
					msgKey.setKeyValue("d_FAX_CHANGE", key.getd_FAX_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EMAIL") && key.getd_OLD_EMAIL() != null) {
					msgKey.setKeyValue("d_OLD_EMAIL", key.getd_OLD_EMAIL());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EMAIL") && key.getd_NEW_EMAIL() != null) {
					msgKey.setKeyValue("d_NEW_EMAIL", key.getd_NEW_EMAIL());
				}
				if(msgKeyType.containsKeyColumn("d_EMAIL_CHANGE") && key.getd_EMAIL_CHANGE() != null) {
					msgKey.setKeyValue("d_EMAIL_CHANGE", key.getd_EMAIL_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_ORG") && key.getd_OLD_VEND_ORG() != null) {
					msgKey.setKeyValue("d_OLD_VEND_ORG", key.getd_OLD_VEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_ORG") && key.getd_NEW_VEND_ORG() != null) {
					msgKey.setKeyValue("d_NEW_VEND_ORG", key.getd_NEW_VEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_ORG_CHANGE") && key.getd_VEND_ORG_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_ORG_CHANGE", key.getd_VEND_ORG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_PERSON") && key.getd_OLD_VEND_PERSON() != null) {
					msgKey.setKeyValue("d_OLD_VEND_PERSON", key.getd_OLD_VEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_PERSON") && key.getd_NEW_VEND_PERSON() != null) {
					msgKey.setKeyValue("d_NEW_VEND_PERSON", key.getd_NEW_VEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_PERSON_CHANGE") && key.getd_VEND_PERSON_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_PERSON_CHANGE", key.getd_VEND_PERSON_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OWN_ORG_CD") && key.getd_OLD_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_OWN_ORG_CD", key.getd_OLD_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OWN_ORG_CD") && key.getd_NEW_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_OWN_ORG_CD", key.getd_NEW_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OWN_ORG_CD_CHANGE") && key.getd_OWN_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_OWN_ORG_CD_CHANGE", key.getd_OWN_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OWN_ORG_NAME") && key.getd_OLD_OWN_ORG_NAME() != null) {
					msgKey.setKeyValue("d_OLD_OWN_ORG_NAME", key.getd_OLD_OWN_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OWN_ORG_NAME") && key.getd_NEW_OWN_ORG_NAME() != null) {
					msgKey.setKeyValue("d_NEW_OWN_ORG_NAME", key.getd_NEW_OWN_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_OWN_ORG_NAME_CHANGE") && key.getd_OWN_ORG_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_OWN_ORG_NAME_CHANGE", key.getd_OWN_ORG_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OWN_PERSON_CD") && key.getd_OLD_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("d_OLD_OWN_PERSON_CD", key.getd_OLD_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OWN_PERSON_CD") && key.getd_NEW_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("d_NEW_OWN_PERSON_CD", key.getd_NEW_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OWN_PERSON_CD_CHANGE") && key.getd_OWN_PERSON_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_OWN_PERSON_CD_CHANGE", key.getd_OWN_PERSON_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ROUND_TYP") && key.getd_OLD_ROUND_TYP() != null) {
					msgKey.setKeyValue("d_OLD_ROUND_TYP", key.getd_OLD_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ROUND_TYP") && key.getd_NEW_ROUND_TYP() != null) {
					msgKey.setKeyValue("d_NEW_ROUND_TYP", key.getd_NEW_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_ROUND_TYP_CHANGE") && key.getd_ROUND_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_ROUND_TYP_CHANGE", key.getd_ROUND_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TAX_CD") && key.getd_OLD_TAX_CD() != null) {
					msgKey.setKeyValue("d_OLD_TAX_CD", key.getd_OLD_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TAX_CD") && key.getd_NEW_TAX_CD() != null) {
					msgKey.setKeyValue("d_NEW_TAX_CD", key.getd_NEW_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("d_TAX_CD_CHANGE") && key.getd_TAX_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_TAX_CD_CHANGE", key.getd_TAX_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TAX_APPLY_TYP") && key.getd_OLD_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("d_OLD_TAX_APPLY_TYP", key.getd_OLD_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TAX_APPLY_TYP") && key.getd_NEW_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("d_NEW_TAX_APPLY_TYP", key.getd_NEW_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_TAX_APPLY_TYP_CD_CHANGE") && key.getd_TAX_APPLY_TYP_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_TAX_APPLY_TYP_CD_CHANGE", key.getd_TAX_APPLY_TYP_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TAX_CALC_TYP") && key.getd_OLD_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("d_OLD_TAX_CALC_TYP", key.getd_OLD_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TAX_CALC_TYP") && key.getd_NEW_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("d_NEW_TAX_CALC_TYP", key.getd_NEW_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_TAX_CALC_TYP_CHANGE") && key.getd_TAX_CALC_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_TAX_CALC_TYP_CHANGE", key.getd_TAX_CALC_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_INSPC_ACPT_APP_TYP") && key.getd_OLD_INSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("d_OLD_INSPC_ACPT_APP_TYP", key.getd_OLD_INSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_INSPC_ACPT_APP_TYP") && key.getd_NEW_INSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("d_NEW_INSPC_ACPT_APP_TYP", key.getd_NEW_INSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_INSPC_ACPT_APP_TYP_CHANGE") && key.getd_INSPC_ACPT_APP_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_INSPC_ACPT_APP_TYP_CHANGE", key.getd_INSPC_ACPT_APP_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_REM") && key.getd_OLD_VEND_REM() != null) {
					msgKey.setKeyValue("d_OLD_VEND_REM", key.getd_OLD_VEND_REM());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_REM") && key.getd_NEW_VEND_REM() != null) {
					msgKey.setKeyValue("d_NEW_VEND_REM", key.getd_NEW_VEND_REM());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_REM_CHANGE") && key.getd_VEND_REM_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_REM_CHANGE", key.getd_VEND_REM_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUR_CD") && key.getd_OLD_CUR_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUR_CD", key.getd_OLD_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUR_CD") && key.getd_NEW_CUR_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUR_CD", key.getd_NEW_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUR_CD_CHANGE") && key.getd_CUR_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUR_CD_CHANGE", key.getd_CUR_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EXCH_TYP") && key.getd_OLD_EXCH_TYP() != null) {
					msgKey.setKeyValue("d_OLD_EXCH_TYP", key.getd_OLD_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EXCH_TYP") && key.getd_NEW_EXCH_TYP() != null) {
					msgKey.setKeyValue("d_NEW_EXCH_TYP", key.getd_NEW_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_EXCH_TYP_CHANGE") && key.getd_EXCH_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_EXCH_TYP_CHANGE", key.getd_EXCH_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_IMPORT_TRN_TYP") && key.getd_OLD_IMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("d_OLD_IMPORT_TRN_TYP", key.getd_OLD_IMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_IMPORT_TRN_TYP") && key.getd_NEW_IMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("d_NEW_IMPORT_TRN_TYP", key.getd_NEW_IMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_IMPORT_TRN_TYP_CHANGE") && key.getd_IMPORT_TRN_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_IMPORT_TRN_TYP_CHANGE", key.getd_IMPORT_TRN_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_ANAME_CHANGE") && key.getd_VEND_ANAME_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_ANAME_CHANGE", key.getd_VEND_ANAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_NAME") && key.getd_OLD_CUST_NAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_NAME", key.getd_OLD_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_NAME") && key.getd_NEW_CUST_NAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_NAME", key.getd_NEW_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_NAME_CHANGE") && key.getd_CUST_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_NAME_CHANGE", key.getd_CUST_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_ANAME") && key.getd_OLD_CUST_ANAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_ANAME", key.getd_OLD_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_ANAME") && key.getd_NEW_CUST_ANAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_ANAME", key.getd_NEW_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_ANAME_CHANGE") && key.getd_CUST_ANAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_ANAME_CHANGE", key.getd_CUST_ANAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_KNAME") && key.getd_OLD_CUST_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_KNAME", key.getd_OLD_CUST_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_KNAME") && key.getd_NEW_CUST_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_KNAME", key.getd_NEW_CUST_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_KNAME_CHANGE") && key.getd_CUST_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_KNAME_CHANGE", key.getd_CUST_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_INSPC_ACPT_TYP") && key.getd_OLD_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("d_OLD_INSPC_ACPT_TYP", key.getd_OLD_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_INSPC_ACPT_TYP") && key.getd_NEW_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("d_NEW_INSPC_ACPT_TYP", key.getd_NEW_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_INSPC_ACPT_TYP_CHANGE") && key.getd_INSPC_ACPT_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_INSPC_ACPT_TYP_CHANGE", key.getd_INSPC_ACPT_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_TAX_APPLY_TYP_CHANGE") && key.getd_TAX_APPLY_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_TAX_APPLY_TYP_CHANGE", key.getd_TAX_APPLY_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EDI_CUST_VEND_CD") && key.getd_OLD_EDI_CUST_VEND_CD() != null) {
					msgKey.setKeyValue("d_OLD_EDI_CUST_VEND_CD", key.getd_OLD_EDI_CUST_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EDI_CUST_VEND_CD") && key.getd_NEW_EDI_CUST_VEND_CD() != null) {
					msgKey.setKeyValue("d_NEW_EDI_CUST_VEND_CD", key.getd_NEW_EDI_CUST_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_EDI_CUST_VEND_CD_CHANGE") && key.getd_EDI_CUST_VEND_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_EDI_CUST_VEND_CD_CHANGE", key.getd_EDI_CUST_VEND_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PARTIAL_SHIP_INST_FLG") && key.getd_OLD_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("d_OLD_PARTIAL_SHIP_INST_FLG", key.getd_OLD_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PARTIAL_SHIP_INST_FLG") && key.getd_NEW_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("d_NEW_PARTIAL_SHIP_INST_FLG", key.getd_NEW_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_PARTIAL_SHIP_INST_FLG_CHANGE") && key.getd_PARTIAL_SHIP_INST_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_PARTIAL_SHIP_INST_FLG_CHANGE", key.getd_PARTIAL_SHIP_INST_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_CD") && key.getd_OLD_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_OLD_DLV_LOC_CD", key.getd_OLD_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_CD") && key.getd_NEW_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_NEW_DLV_LOC_CD", key.getd_NEW_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_LOC_CD_CHANGE") && key.getd_DLV_LOC_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_LOC_CD_CHANGE", key.getd_DLV_LOC_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_NAME") && key.getd_OLD_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("d_OLD_DLV_LOC_NAME", key.getd_OLD_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_NAME") && key.getd_NEW_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("d_NEW_DLV_LOC_NAME", key.getd_NEW_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_LOC_NAME_CHANGE") && key.getd_DLV_LOC_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_LOC_NAME_CHANGE", key.getd_DLV_LOC_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_KNAME") && key.getd_OLD_DLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_DLV_LOC_KNAME", key.getd_OLD_DLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_KNAME") && key.getd_NEW_DLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_DLV_LOC_KNAME", key.getd_NEW_DLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_LOC_KNAME_CHANGE") && key.getd_DLV_LOC_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_LOC_KNAME_CHANGE", key.getd_DLV_LOC_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_ENAME") && key.getd_OLD_DLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("d_OLD_DLV_LOC_ENAME", key.getd_OLD_DLV_LOC_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_ENAME") && key.getd_NEW_DLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("d_NEW_DLV_LOC_ENAME", key.getd_NEW_DLV_LOC_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_LOC_ENAME_CHANGE") && key.getd_DLV_LOC_ENAME_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_LOC_ENAME_CHANGE", key.getd_DLV_LOC_ENAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TRANSPORT_CD") && key.getd_OLD_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("d_OLD_TRANSPORT_CD", key.getd_OLD_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TRANSPORT_CD") && key.getd_NEW_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("d_NEW_TRANSPORT_CD", key.getd_NEW_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_TRANSPORT_CD_CHANGE") && key.getd_TRANSPORT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_TRANSPORT_CD_CHANGE", key.getd_TRANSPORT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DEPO_WH_CD") && key.getd_OLD_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("d_OLD_DEPO_WH_CD", key.getd_OLD_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DEPO_WH_CD") && key.getd_NEW_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("d_NEW_DEPO_WH_CD", key.getd_NEW_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("d_DEPO_WH_CD_CHANGE") && key.getd_DEPO_WH_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DEPO_WH_CD_CHANGE", key.getd_DEPO_WH_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_WH_CD") && key.getd_OLD_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_WH_CD", key.getd_OLD_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_WH_CD") && key.getd_NEW_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_WH_CD", key.getd_NEW_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_WH_CD_CHANGE") && key.getd_SHIP_WH_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_WH_CD_CHANGE", key.getd_SHIP_WH_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TRANSPORT_LT") && key.getd_OLD_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("d_OLD_TRANSPORT_LT", key.getd_OLD_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TRANSPORT_LT") && key.getd_NEW_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("d_NEW_TRANSPORT_LT", key.getd_NEW_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("d_TRANSPORT_LT_CHANGE") && key.getd_TRANSPORT_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_TRANSPORT_LT_CHANGE", key.getd_TRANSPORT_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EXCH_RESERVE_CD") && key.getd_OLD_EXCH_RESERVE_CD() != null) {
					msgKey.setKeyValue("d_OLD_EXCH_RESERVE_CD", key.getd_OLD_EXCH_RESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EXCH_RESERVE_CD") && key.getd_NEW_EXCH_RESERVE_CD() != null) {
					msgKey.setKeyValue("d_NEW_EXCH_RESERVE_CD", key.getd_NEW_EXCH_RESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("d_EXCH_RESERVE_CD_CHANGE") && key.getd_EXCH_RESERVE_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_EXCH_RESERVE_CD_CHANGE", key.getd_EXCH_RESERVE_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EXCH_START_DATE") && key.getd_OLD_EXCH_START_DATE() != null) {
					msgKey.setKeyValue("d_OLD_EXCH_START_DATE", key.getd_OLD_EXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EXCH_START_DATE") && key.getd_NEW_EXCH_START_DATE() != null) {
					msgKey.setKeyValue("d_NEW_EXCH_START_DATE", key.getd_NEW_EXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_EXCH_START_DATE_CHANGE") && key.getd_EXCH_START_DATE_CHANGE() != null) {
					msgKey.setKeyValue("d_EXCH_START_DATE_CHANGE", key.getd_EXCH_START_DATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EXCH_RATE") && key.getd_OLD_EXCH_RATE() != null) {
					msgKey.setKeyValue("d_OLD_EXCH_RATE", key.getd_OLD_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EXCH_RATE") && key.getd_NEW_EXCH_RATE() != null) {
					msgKey.setKeyValue("d_NEW_EXCH_RATE", key.getd_NEW_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("d_EXCH_RATE_CHANGE") && key.getd_EXCH_RATE_CHANGE() != null) {
					msgKey.setKeyValue("d_EXCH_RATE_CHANGE", key.getd_EXCH_RATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BILL_ADDRESSEE_CD") && key.getd_OLD_BILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("d_OLD_BILL_ADDRESSEE_CD", key.getd_OLD_BILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BILL_ADDRESSEE_CD") && key.getd_NEW_BILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("d_NEW_BILL_ADDRESSEE_CD", key.getd_NEW_BILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("d_BILL_ADDRESSEE_CD_CHANGE") && key.getd_BILL_ADDRESSEE_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_BILL_ADDRESSEE_CD_CHANGE", key.getd_BILL_ADDRESSEE_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_FNAME") && key.getd_OLD_CUST_FNAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_FNAME", key.getd_OLD_CUST_FNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_FNAME") && key.getd_NEW_CUST_FNAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_FNAME", key.getd_NEW_CUST_FNAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_FNAME_CHANGE") && key.getd_CUST_FNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_FNAME_CHANGE", key.getd_CUST_FNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_ENAME") && key.getd_OLD_CUST_ENAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_ENAME", key.getd_OLD_CUST_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_ENAME") && key.getd_NEW_CUST_ENAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_ENAME", key.getd_NEW_CUST_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_ENAME_CHANGE") && key.getd_CUST_ENAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_ENAME_CHANGE", key.getd_CUST_ENAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OWNER_EXECUTIVE") && key.getd_OLD_OWNER_EXECUTIVE() != null) {
					msgKey.setKeyValue("d_OLD_OWNER_EXECUTIVE", key.getd_OLD_OWNER_EXECUTIVE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OWNER_EXECUTIVE") && key.getd_NEW_OWNER_EXECUTIVE() != null) {
					msgKey.setKeyValue("d_NEW_OWNER_EXECUTIVE", key.getd_NEW_OWNER_EXECUTIVE());
				}
				if(msgKeyType.containsKeyColumn("d_OWNER_EXECUTIVE_CHANGE") && key.getd_OWNER_EXECUTIVE_CHANGE() != null) {
					msgKey.setKeyValue("d_OWNER_EXECUTIVE_CHANGE", key.getd_OWNER_EXECUTIVE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OWNER_NAME") && key.getd_OLD_OWNER_NAME() != null) {
					msgKey.setKeyValue("d_OLD_OWNER_NAME", key.getd_OLD_OWNER_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OWNER_NAME") && key.getd_NEW_OWNER_NAME() != null) {
					msgKey.setKeyValue("d_NEW_OWNER_NAME", key.getd_NEW_OWNER_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_OWNER_NAME_CHANGE") && key.getd_OWNER_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_OWNER_NAME_CHANGE", key.getd_OWNER_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_CD") && key.getd_OLD_COMPANY_CD() != null) {
					msgKey.setKeyValue("d_OLD_COMPANY_CD", key.getd_OLD_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_CD") && key.getd_NEW_COMPANY_CD() != null) {
					msgKey.setKeyValue("d_NEW_COMPANY_CD", key.getd_NEW_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("d_COMPANY_CD_CHANGE") && key.getd_COMPANY_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_COMPANY_CD_CHANGE", key.getd_COMPANY_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_FNAME") && key.getd_OLD_COMPANY_FNAME() != null) {
					msgKey.setKeyValue("d_OLD_COMPANY_FNAME", key.getd_OLD_COMPANY_FNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_FNAME") && key.getd_NEW_COMPANY_FNAME() != null) {
					msgKey.setKeyValue("d_NEW_COMPANY_FNAME", key.getd_NEW_COMPANY_FNAME());
				}
				if(msgKeyType.containsKeyColumn("d_COMPANY_FNAME_CHANGE") && key.getd_COMPANY_FNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_COMPANY_FNAME_CHANGE", key.getd_COMPANY_FNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_NAME") && key.getd_OLD_COMPANY_NAME() != null) {
					msgKey.setKeyValue("d_OLD_COMPANY_NAME", key.getd_OLD_COMPANY_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_NAME") && key.getd_NEW_COMPANY_NAME() != null) {
					msgKey.setKeyValue("d_NEW_COMPANY_NAME", key.getd_NEW_COMPANY_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_COMPANY_NAME_CHANGE") && key.getd_COMPANY_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_COMPANY_NAME_CHANGE", key.getd_COMPANY_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_KNAME") && key.getd_OLD_COMPANY_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_COMPANY_KNAME", key.getd_OLD_COMPANY_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_KNAME") && key.getd_NEW_COMPANY_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_COMPANY_KNAME", key.getd_NEW_COMPANY_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_COMPANY_KNAME_CHANGE") && key.getd_COMPANY_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_COMPANY_KNAME_CHANGE", key.getd_COMPANY_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_ENAME") && key.getd_OLD_COMPANY_ENAME() != null) {
					msgKey.setKeyValue("d_OLD_COMPANY_ENAME", key.getd_OLD_COMPANY_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_ENAME") && key.getd_NEW_COMPANY_ENAME() != null) {
					msgKey.setKeyValue("d_NEW_COMPANY_ENAME", key.getd_NEW_COMPANY_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_COMPANY_ENAME_CHANGE") && key.getd_COMPANY_ENAME_CHANGE() != null) {
					msgKey.setKeyValue("d_COMPANY_ENAME_CHANGE", key.getd_COMPANY_ENAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_USER_TYP") && key.getd_OLD_USER_TYP() != null) {
					msgKey.setKeyValue("d_OLD_USER_TYP", key.getd_OLD_USER_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_USER_TYP") && key.getd_NEW_USER_TYP() != null) {
					msgKey.setKeyValue("d_NEW_USER_TYP", key.getd_NEW_USER_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_USER_TYP_CHANGE") && key.getd_USER_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_USER_TYP_CHANGE", key.getd_USER_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_CD") && key.getd_OLD_BANK_CD() != null) {
					msgKey.setKeyValue("d_OLD_BANK_CD", key.getd_OLD_BANK_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_CD") && key.getd_NEW_BANK_CD() != null) {
					msgKey.setKeyValue("d_NEW_BANK_CD", key.getd_NEW_BANK_CD());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_CD_CHANGE") && key.getd_BANK_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_CD_CHANGE", key.getd_BANK_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_NAME") && key.getd_OLD_BANK_NAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_NAME", key.getd_OLD_BANK_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_NAME") && key.getd_NEW_BANK_NAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_NAME", key.getd_NEW_BANK_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_NAME_CHANGE") && key.getd_BANK_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_NAME_CHANGE", key.getd_BANK_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_ANAME") && key.getd_OLD_BANK_ANAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_ANAME", key.getd_OLD_BANK_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_ANAME") && key.getd_NEW_BANK_ANAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_ANAME", key.getd_NEW_BANK_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_ANAME_CHANGE") && key.getd_BANK_ANAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_ANAME_CHANGE", key.getd_BANK_ANAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_KNAME") && key.getd_OLD_BANK_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_KNAME", key.getd_OLD_BANK_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_KNAME") && key.getd_NEW_BANK_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_KNAME", key.getd_NEW_BANK_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_KNAME_CHANGE") && key.getd_BANK_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_KNAME_CHANGE", key.getd_BANK_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_ENAME") && key.getd_OLD_BANK_ENAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_ENAME", key.getd_OLD_BANK_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_ENAME") && key.getd_NEW_BANK_ENAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_ENAME", key.getd_NEW_BANK_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_ENAME_CHANGE") && key.getd_BANK_ENAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_ENAME_CHANGE", key.getd_BANK_ENAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_FB_NAME") && key.getd_OLD_BANK_FB_NAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_FB_NAME", key.getd_OLD_BANK_FB_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_FB_NAME") && key.getd_NEW_BANK_FB_NAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_FB_NAME", key.getd_NEW_BANK_FB_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_FB_NAME_CHANGE") && key.getd_BANK_FB_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_FB_NAME_CHANGE", key.getd_BANK_FB_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_CD") && key.getd_OLD_BANK_BR_CD() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_CD", key.getd_OLD_BANK_BR_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_CD") && key.getd_NEW_BANK_BR_CD() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_CD", key.getd_NEW_BANK_BR_CD());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_CD_CHANGE") && key.getd_BANK_BR_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_CD_CHANGE", key.getd_BANK_BR_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_TYP_CD") && key.getd_OLD_B_ACCT_TYP_CD() != null) {
					msgKey.setKeyValue("d_OLD_B_ACCT_TYP_CD", key.getd_OLD_B_ACCT_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_TYP_CD") && key.getd_NEW_B_ACCT_TYP_CD() != null) {
					msgKey.setKeyValue("d_NEW_B_ACCT_TYP_CD", key.getd_NEW_B_ACCT_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("d_B_ACCT_TYP_CD_CHANGE") && key.getd_B_ACCT_TYP_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_B_ACCT_TYP_CD_CHANGE", key.getd_B_ACCT_TYP_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_NAME") && key.getd_OLD_B_ACCT_NAME() != null) {
					msgKey.setKeyValue("d_OLD_B_ACCT_NAME", key.getd_OLD_B_ACCT_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_NAME") && key.getd_NEW_B_ACCT_NAME() != null) {
					msgKey.setKeyValue("d_NEW_B_ACCT_NAME", key.getd_NEW_B_ACCT_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_B_ACCT_NAME_CHANGE") && key.getd_B_ACCT_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_B_ACCT_NAME_CHANGE", key.getd_B_ACCT_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_FB_DATA_TYP") && key.getd_OLD_FB_DATA_TYP() != null) {
					msgKey.setKeyValue("d_OLD_FB_DATA_TYP", key.getd_OLD_FB_DATA_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_FB_DATA_TYP") && key.getd_NEW_FB_DATA_TYP() != null) {
					msgKey.setKeyValue("d_NEW_FB_DATA_TYP", key.getd_NEW_FB_DATA_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_FB_DATA_TYP_CHANGE") && key.getd_FB_DATA_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_FB_DATA_TYP_CHANGE", key.getd_FB_DATA_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TRF_REQUEST_CD") && key.getd_OLD_TRF_REQUEST_CD() != null) {
					msgKey.setKeyValue("d_OLD_TRF_REQUEST_CD", key.getd_OLD_TRF_REQUEST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TRF_REQUEST_CD") && key.getd_NEW_TRF_REQUEST_CD() != null) {
					msgKey.setKeyValue("d_NEW_TRF_REQUEST_CD", key.getd_NEW_TRF_REQUEST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_TRF_REQUEST_CD_CHANGE") && key.getd_TRF_REQUEST_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_TRF_REQUEST_CD_CHANGE", key.getd_TRF_REQUEST_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_FB_NAME") && key.getd_OLD_B_ACCT_FB_NAME() != null) {
					msgKey.setKeyValue("d_OLD_B_ACCT_FB_NAME", key.getd_OLD_B_ACCT_FB_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_FB_NAME") && key.getd_NEW_B_ACCT_FB_NAME() != null) {
					msgKey.setKeyValue("d_NEW_B_ACCT_FB_NAME", key.getd_NEW_B_ACCT_FB_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_B_ACCT_FB_NAME_CHANGE") && key.getd_B_ACCT_FB_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_B_ACCT_FB_NAME_CHANGE", key.getd_B_ACCT_FB_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACCT_CD") && key.getd_OLD_ACCT_CD() != null) {
					msgKey.setKeyValue("d_OLD_ACCT_CD", key.getd_OLD_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACCT_CD") && key.getd_NEW_ACCT_CD() != null) {
					msgKey.setKeyValue("d_NEW_ACCT_CD", key.getd_NEW_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_ACCT_CD_CHANGE") && key.getd_ACCT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_ACCT_CD_CHANGE", key.getd_ACCT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PRIMITIVE_TYP") && key.getd_OLD_PRIMITIVE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_PRIMITIVE_TYP", key.getd_OLD_PRIMITIVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PRIMITIVE_TYP") && key.getd_NEW_PRIMITIVE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_PRIMITIVE_TYP", key.getd_NEW_PRIMITIVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_PRIMITIVE_TYP_CHANGE") && key.getd_PRIMITIVE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_PRIMITIVE_TYP_CHANGE", key.getd_PRIMITIVE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACCT_NAME") && key.getd_OLD_ACCT_NAME() != null) {
					msgKey.setKeyValue("d_OLD_ACCT_NAME", key.getd_OLD_ACCT_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACCT_NAME") && key.getd_NEW_ACCT_NAME() != null) {
					msgKey.setKeyValue("d_NEW_ACCT_NAME", key.getd_NEW_ACCT_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_ACCT_NAME_CHANGE") && key.getd_ACCT_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_ACCT_NAME_CHANGE", key.getd_ACCT_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACCT_ANAME") && key.getd_OLD_ACCT_ANAME() != null) {
					msgKey.setKeyValue("d_OLD_ACCT_ANAME", key.getd_OLD_ACCT_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACCT_ANAME") && key.getd_NEW_ACCT_ANAME() != null) {
					msgKey.setKeyValue("d_NEW_ACCT_ANAME", key.getd_NEW_ACCT_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_ACCT_ANAME_CHANGE") && key.getd_ACCT_ANAME_CHANGE() != null) {
					msgKey.setKeyValue("d_ACCT_ANAME_CHANGE", key.getd_ACCT_ANAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACCT_KNAME") && key.getd_OLD_ACCT_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_ACCT_KNAME", key.getd_OLD_ACCT_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACCT_KNAME") && key.getd_NEW_ACCT_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_ACCT_KNAME", key.getd_NEW_ACCT_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_ACCT_KNAME_CHANGE") && key.getd_ACCT_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_ACCT_KNAME_CHANGE", key.getd_ACCT_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DR_CR_TYP") && key.getd_OLD_DR_CR_TYP() != null) {
					msgKey.setKeyValue("d_OLD_DR_CR_TYP", key.getd_OLD_DR_CR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DR_CR_TYP") && key.getd_NEW_DR_CR_TYP() != null) {
					msgKey.setKeyValue("d_NEW_DR_CR_TYP", key.getd_NEW_DR_CR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_DR_CR_TYP_CHANGE") && key.getd_DR_CR_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_DR_CR_TYP_CHANGE", key.getd_DR_CR_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACCT_TYP") && key.getd_OLD_ACCT_TYP() != null) {
					msgKey.setKeyValue("d_OLD_ACCT_TYP", key.getd_OLD_ACCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACCT_TYP") && key.getd_NEW_ACCT_TYP() != null) {
					msgKey.setKeyValue("d_NEW_ACCT_TYP", key.getd_NEW_ACCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_ACCT_TYP_CHANGE") && key.getd_ACCT_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_ACCT_TYP_CHANGE", key.getd_ACCT_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SUB_ACCT_TYP_DEFAULT") && key.getd_OLD_SUB_ACCT_TYP_DEFAULT() != null) {
					msgKey.setKeyValue("d_OLD_SUB_ACCT_TYP_DEFAULT", key.getd_OLD_SUB_ACCT_TYP_DEFAULT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SUB_ACCT_TYP_DEFAULT") && key.getd_NEW_SUB_ACCT_TYP_DEFAULT() != null) {
					msgKey.setKeyValue("d_NEW_SUB_ACCT_TYP_DEFAULT", key.getd_NEW_SUB_ACCT_TYP_DEFAULT());
				}
				if(msgKeyType.containsKeyColumn("d_SUB_ACCT_TYP_DEFAULT_CHANGE") && key.getd_SUB_ACCT_TYP_DEFAULT_CHANGE() != null) {
					msgKey.setKeyValue("d_SUB_ACCT_TYP_DEFAULT_CHANGE", key.getd_SUB_ACCT_TYP_DEFAULT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TRF_TYP") && key.getd_OLD_TRF_TYP() != null) {
					msgKey.setKeyValue("d_OLD_TRF_TYP", key.getd_OLD_TRF_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TRF_TYP") && key.getd_NEW_TRF_TYP() != null) {
					msgKey.setKeyValue("d_NEW_TRF_TYP", key.getd_NEW_TRF_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_TRF_TYP_CHANGE") && key.getd_TRF_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_TRF_TYP_CHANGE", key.getd_TRF_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CONTENTS_TYP") && key.getd_OLD_CONTENTS_TYP() != null) {
					msgKey.setKeyValue("d_OLD_CONTENTS_TYP", key.getd_OLD_CONTENTS_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CONTENTS_TYP") && key.getd_NEW_CONTENTS_TYP() != null) {
					msgKey.setKeyValue("d_NEW_CONTENTS_TYP", key.getd_NEW_CONTENTS_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_CONTENTS_TYP_CHANGE") && key.getd_CONTENTS_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_CONTENTS_TYP_CHANGE", key.getd_CONTENTS_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_INFO_TYP") && key.getd_OLD_INFO_TYP() != null) {
					msgKey.setKeyValue("d_OLD_INFO_TYP", key.getd_OLD_INFO_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_INFO_TYP") && key.getd_NEW_INFO_TYP() != null) {
					msgKey.setKeyValue("d_NEW_INFO_TYP", key.getd_NEW_INFO_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_INFO_TYP_CHANGE") && key.getd_INFO_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_INFO_TYP_CHANGE", key.getd_INFO_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VALID_START_DATE") && key.getd_OLD_VALID_START_DATE() != null) {
					msgKey.setKeyValue("d_OLD_VALID_START_DATE", key.getd_OLD_VALID_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VALID_START_DATE") && key.getd_NEW_VALID_START_DATE() != null) {
					msgKey.setKeyValue("d_NEW_VALID_START_DATE", key.getd_NEW_VALID_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_VALID_START_DATE_CHANGE") && key.getd_VALID_START_DATE_CHANGE() != null) {
					msgKey.setKeyValue("d_VALID_START_DATE_CHANGE", key.getd_VALID_START_DATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VALID_END_DATE") && key.getd_OLD_VALID_END_DATE() != null) {
					msgKey.setKeyValue("d_OLD_VALID_END_DATE", key.getd_OLD_VALID_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VALID_END_DATE") && key.getd_NEW_VALID_END_DATE() != null) {
					msgKey.setKeyValue("d_NEW_VALID_END_DATE", key.getd_NEW_VALID_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_VALID_END_DATE_CHANGE") && key.getd_VALID_END_DATE_CHANGE() != null) {
					msgKey.setKeyValue("d_VALID_END_DATE_CHANGE", key.getd_VALID_END_DATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MIN_AMOUNT") && key.getd_OLD_MIN_AMOUNT() != null) {
					msgKey.setKeyValue("d_OLD_MIN_AMOUNT", key.getd_OLD_MIN_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MIN_AMOUNT") && key.getd_NEW_MIN_AMOUNT() != null) {
					msgKey.setKeyValue("d_NEW_MIN_AMOUNT", key.getd_NEW_MIN_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MAX_AMOUNT") && key.getd_OLD_MAX_AMOUNT() != null) {
					msgKey.setKeyValue("d_OLD_MAX_AMOUNT", key.getd_OLD_MAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MAX_AMOUNT") && key.getd_NEW_MAX_AMOUNT() != null) {
					msgKey.setKeyValue("d_NEW_MAX_AMOUNT", key.getd_NEW_MAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_MAX_AMOUNT_CHANGE") && key.getd_MAX_AMOUNT_CHANGE() != null) {
					msgKey.setKeyValue("d_MAX_AMOUNT_CHANGE", key.getd_MAX_AMOUNT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TRF_FEE") && key.getd_OLD_TRF_FEE() != null) {
					msgKey.setKeyValue("d_OLD_TRF_FEE", key.getd_OLD_TRF_FEE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TRF_FEE") && key.getd_NEW_TRF_FEE() != null) {
					msgKey.setKeyValue("d_NEW_TRF_FEE", key.getd_NEW_TRF_FEE());
				}
				if(msgKeyType.containsKeyColumn("d_TRF_FEE_CHANGE") && key.getd_TRF_FEE_CHANGE() != null) {
					msgKey.setKeyValue("d_TRF_FEE_CHANGE", key.getd_TRF_FEE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_VEND_KNAME") && key.getd_OLD_VEND_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_VEND_KNAME", key.getd_OLD_VEND_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_VEND_KNAME") && key.getd_NEW_VEND_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_VEND_KNAME", key.getd_NEW_VEND_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_VEND_KNAME_CHANGE") && key.getd_VEND_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_VEND_KNAME_CHANGE", key.getd_VEND_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SUB_ACCT_CD") && key.getd_OLD_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("d_OLD_SUB_ACCT_CD", key.getd_OLD_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SUB_ACCT_CD") && key.getd_NEW_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("d_NEW_SUB_ACCT_CD", key.getd_NEW_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_SUB_ACCT_CD_CHANGE") && key.getd_SUB_ACCT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_SUB_ACCT_CD_CHANGE", key.getd_SUB_ACCT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_PATTERN_CD") && key.getd_OLD_PAY_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_OLD_PAY_PATTERN_CD", key.getd_OLD_PAY_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_PATTERN_CD") && key.getd_NEW_PAY_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_NEW_PAY_PATTERN_CD", key.getd_NEW_PAY_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_PATTERN_CD_CHANGE") && key.getd_PAY_PATTERN_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_PATTERN_CD_CHANGE", key.getd_PAY_PATTERN_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_ODR_TYP") && key.getd_OLD_PAY_ODR_TYP() != null) {
					msgKey.setKeyValue("d_OLD_PAY_ODR_TYP", key.getd_OLD_PAY_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_ODR_TYP") && key.getd_NEW_PAY_ODR_TYP() != null) {
					msgKey.setKeyValue("d_NEW_PAY_ODR_TYP", key.getd_NEW_PAY_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_ODR_TYP_CHANGE") && key.getd_PAY_ODR_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_ODR_TYP_CHANGE", key.getd_PAY_ODR_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_CD_1") && key.getd_OLD_PAY_METHOD_CD_1() != null) {
					msgKey.setKeyValue("d_OLD_PAY_METHOD_CD_1", key.getd_OLD_PAY_METHOD_CD_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_CD_1") && key.getd_NEW_PAY_METHOD_CD_1() != null) {
					msgKey.setKeyValue("d_NEW_PAY_METHOD_CD_1", key.getd_NEW_PAY_METHOD_CD_1());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CD_1_CHANGE") && key.getd_PAY_METHOD_CD_1_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_METHOD_CD_1_CHANGE", key.getd_PAY_METHOD_CD_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_CD_2") && key.getd_OLD_PAY_METHOD_CD_2() != null) {
					msgKey.setKeyValue("d_OLD_PAY_METHOD_CD_2", key.getd_OLD_PAY_METHOD_CD_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_CD_2") && key.getd_NEW_PAY_METHOD_CD_2() != null) {
					msgKey.setKeyValue("d_NEW_PAY_METHOD_CD_2", key.getd_NEW_PAY_METHOD_CD_2());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CD_2_CHANGE") && key.getd_PAY_METHOD_CD_2_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_METHOD_CD_2_CHANGE", key.getd_PAY_METHOD_CD_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_CD") && key.getd_OLD_PAY_METHOD_CD() != null) {
					msgKey.setKeyValue("d_OLD_PAY_METHOD_CD", key.getd_OLD_PAY_METHOD_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_CD") && key.getd_NEW_PAY_METHOD_CD() != null) {
					msgKey.setKeyValue("d_NEW_PAY_METHOD_CD", key.getd_NEW_PAY_METHOD_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CD_CHANGE") && key.getd_PAY_METHOD_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_METHOD_CD_CHANGE", key.getd_PAY_METHOD_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD") && key.getd_OLD_PAY_METHOD() != null) {
					msgKey.setKeyValue("d_OLD_PAY_METHOD", key.getd_OLD_PAY_METHOD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD") && key.getd_NEW_PAY_METHOD() != null) {
					msgKey.setKeyValue("d_NEW_PAY_METHOD", key.getd_NEW_PAY_METHOD());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CHANGE") && key.getd_PAY_METHOD_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_METHOD_CHANGE", key.getd_PAY_METHOD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_TARGET_TYP") && key.getd_OLD_PAY_TARGET_TYP() != null) {
					msgKey.setKeyValue("d_OLD_PAY_TARGET_TYP", key.getd_OLD_PAY_TARGET_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_TARGET_TYP") && key.getd_NEW_PAY_TARGET_TYP() != null) {
					msgKey.setKeyValue("d_NEW_PAY_TARGET_TYP", key.getd_NEW_PAY_TARGET_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_TARGET_TYP_CHANGE") && key.getd_PAY_TARGET_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_TARGET_TYP_CHANGE", key.getd_PAY_TARGET_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SLIP_CTRL_ORG_CD") && key.getd_OLD_SLIP_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_SLIP_CTRL_ORG_CD", key.getd_OLD_SLIP_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SLIP_CTRL_ORG_CD") && key.getd_NEW_SLIP_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_SLIP_CTRL_ORG_CD", key.getd_NEW_SLIP_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_SLIP_CTRL_ORG_CD_CHANGE") && key.getd_SLIP_CTRL_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_SLIP_CTRL_ORG_CD_CHANGE", key.getd_SLIP_CTRL_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CLOSING_CTRL_ORG_CD") && key.getd_OLD_CLOSING_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_CLOSING_CTRL_ORG_CD", key.getd_OLD_CLOSING_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CLOSING_CTRL_ORG_CD") && key.getd_NEW_CLOSING_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_CLOSING_CTRL_ORG_CD", key.getd_NEW_CLOSING_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CLOSING_CTRL_ORG_CD_CHANGE") && key.getd_CLOSING_CTRL_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CLOSING_CTRL_ORG_CD_CHANGE", key.getd_CLOSING_CTRL_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_CALC_CTRL_ORG_CD") && key.getd_OLD_PAY_CALC_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_PAY_CALC_CTRL_ORG_CD", key.getd_OLD_PAY_CALC_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_CALC_CTRL_ORG_CD") && key.getd_NEW_PAY_CALC_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_PAY_CALC_CTRL_ORG_CD", key.getd_NEW_PAY_CALC_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_CALC_CTRL_ORG_CD_CHANGE") && key.getd_PAY_CALC_CTRL_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_CALC_CTRL_ORG_CD_CHANGE", key.getd_PAY_CALC_CTRL_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_FIX_CTRL_ORG_CD") && key.getd_OLD_PAY_FIX_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_PAY_FIX_CTRL_ORG_CD", key.getd_OLD_PAY_FIX_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_FIX_CTRL_ORG_CD") && key.getd_NEW_PAY_FIX_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_PAY_FIX_CTRL_ORG_CD", key.getd_NEW_PAY_FIX_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_FIX_CTRL_ORG_CD_CHANGE") && key.getd_PAY_FIX_CTRL_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_FIX_CTRL_ORG_CD_CHANGE", key.getd_PAY_FIX_CTRL_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_STL_COND_CD") && key.getd_OLD_STL_COND_CD() != null) {
					msgKey.setKeyValue("d_OLD_STL_COND_CD", key.getd_OLD_STL_COND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_STL_COND_CD") && key.getd_NEW_STL_COND_CD() != null) {
					msgKey.setKeyValue("d_NEW_STL_COND_CD", key.getd_NEW_STL_COND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_STL_COND_CD_CHANGE") && key.getd_STL_COND_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_STL_COND_CD_CHANGE", key.getd_STL_COND_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CLAIM_ORG_CD") && key.getd_OLD_CLAIM_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_CLAIM_ORG_CD", key.getd_OLD_CLAIM_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CLAIM_ORG_CD") && key.getd_NEW_CLAIM_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_CLAIM_ORG_CD", key.getd_NEW_CLAIM_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CLAIM_ORG_CD_CHANGE") && key.getd_CLAIM_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CLAIM_ORG_CD_CHANGE", key.getd_CLAIM_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EDI_TRN_BILL_TYP") && key.getd_OLD_EDI_TRN_BILL_TYP() != null) {
					msgKey.setKeyValue("d_OLD_EDI_TRN_BILL_TYP", key.getd_OLD_EDI_TRN_BILL_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EDI_TRN_BILL_TYP") && key.getd_NEW_EDI_TRN_BILL_TYP() != null) {
					msgKey.setKeyValue("d_NEW_EDI_TRN_BILL_TYP", key.getd_NEW_EDI_TRN_BILL_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_EDI_TRN_BILL_TYP_CHANGE") && key.getd_EDI_TRN_BILL_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_EDI_TRN_BILL_TYP_CHANGE", key.getd_EDI_TRN_BILL_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EDI_TRN_RM_TYP") && key.getd_OLD_EDI_TRN_RM_TYP() != null) {
					msgKey.setKeyValue("d_OLD_EDI_TRN_RM_TYP", key.getd_OLD_EDI_TRN_RM_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EDI_TRN_RM_TYP") && key.getd_NEW_EDI_TRN_RM_TYP() != null) {
					msgKey.setKeyValue("d_NEW_EDI_TRN_RM_TYP", key.getd_NEW_EDI_TRN_RM_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_EDI_TRN_RM_TYP_CHANGE") && key.getd_EDI_TRN_RM_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_EDI_TRN_RM_TYP_CHANGE", key.getd_EDI_TRN_RM_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BILL_BALANCE_CTRL_FLG") && key.getd_OLD_BILL_BALANCE_CTRL_FLG() != null) {
					msgKey.setKeyValue("d_OLD_BILL_BALANCE_CTRL_FLG", key.getd_OLD_BILL_BALANCE_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BILL_BALANCE_CTRL_FLG") && key.getd_NEW_BILL_BALANCE_CTRL_FLG() != null) {
					msgKey.setKeyValue("d_NEW_BILL_BALANCE_CTRL_FLG", key.getd_NEW_BILL_BALANCE_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_BILL_BALANCE_CTRL_FLG_CHANGE") && key.getd_BILL_BALANCE_CTRL_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_BILL_BALANCE_CTRL_FLG_CHANGE", key.getd_BILL_BALANCE_CTRL_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_AR_BALANCE_CTRL_FLG") && key.getd_OLD_AR_BALANCE_CTRL_FLG() != null) {
					msgKey.setKeyValue("d_OLD_AR_BALANCE_CTRL_FLG", key.getd_OLD_AR_BALANCE_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_AR_BALANCE_CTRL_FLG") && key.getd_NEW_AR_BALANCE_CTRL_FLG() != null) {
					msgKey.setKeyValue("d_NEW_AR_BALANCE_CTRL_FLG", key.getd_NEW_AR_BALANCE_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_AR_BALANCE_CTRL_FLG_CHANGE") && key.getd_AR_BALANCE_CTRL_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_AR_BALANCE_CTRL_FLG_CHANGE", key.getd_AR_BALANCE_CTRL_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_COLLECTION_STD_AMOUNT") && key.getd_OLD_COLLECTION_STD_AMOUNT() != null) {
					msgKey.setKeyValue("d_OLD_COLLECTION_STD_AMOUNT", key.getd_OLD_COLLECTION_STD_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_COLLECTION_STD_AMOUNT") && key.getd_NEW_COLLECTION_STD_AMOUNT() != null) {
					msgKey.setKeyValue("d_NEW_COLLECTION_STD_AMOUNT", key.getd_NEW_COLLECTION_STD_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_COLLECTION_STD_AMOUNT_CHANGE") && key.getd_COLLECTION_STD_AMOUNT_CHANGE() != null) {
					msgKey.setKeyValue("d_COLLECTION_STD_AMOUNT_CHANGE", key.getd_COLLECTION_STD_AMOUNT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_RM_OFFSET_TYP") && key.getd_OLD_RM_OFFSET_TYP() != null) {
					msgKey.setKeyValue("d_OLD_RM_OFFSET_TYP", key.getd_OLD_RM_OFFSET_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_RM_OFFSET_TYP") && key.getd_NEW_RM_OFFSET_TYP() != null) {
					msgKey.setKeyValue("d_NEW_RM_OFFSET_TYP", key.getd_NEW_RM_OFFSET_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_RM_OFFSET_TYP_CHANGE") && key.getd_RM_OFFSET_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_RM_OFFSET_TYP_CHANGE", key.getd_RM_OFFSET_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_LINE_CUST_CD") && key.getd_OLD_LINE_CUST_CD() != null) {
					msgKey.setKeyValue("d_OLD_LINE_CUST_CD", key.getd_OLD_LINE_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_LINE_CUST_CD") && key.getd_NEW_LINE_CUST_CD() != null) {
					msgKey.setKeyValue("d_NEW_LINE_CUST_CD", key.getd_NEW_LINE_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_LINE_CUST_CD_CHANGE") && key.getd_LINE_CUST_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_LINE_CUST_CD_CHANGE", key.getd_LINE_CUST_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_CTRL_CD") && key.getd_OLD_B_ACCT_CTRL_CD() != null) {
					msgKey.setKeyValue("d_OLD_B_ACCT_CTRL_CD", key.getd_OLD_B_ACCT_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_CTRL_CD") && key.getd_NEW_B_ACCT_CTRL_CD() != null) {
					msgKey.setKeyValue("d_NEW_B_ACCT_CTRL_CD", key.getd_NEW_B_ACCT_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("d_B_ACCT_CTRL_CD_CHANGE") && key.getd_B_ACCT_CTRL_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_B_ACCT_CTRL_CD_CHANGE", key.getd_B_ACCT_CTRL_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_MNG_NAME") && key.getd_OLD_B_ACCT_MNG_NAME() != null) {
					msgKey.setKeyValue("d_OLD_B_ACCT_MNG_NAME", key.getd_OLD_B_ACCT_MNG_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_MNG_NAME") && key.getd_NEW_B_ACCT_MNG_NAME() != null) {
					msgKey.setKeyValue("d_NEW_B_ACCT_MNG_NAME", key.getd_NEW_B_ACCT_MNG_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_B_ACCT_MNG_NAME_CHANGE") && key.getd_B_ACCT_MNG_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_B_ACCT_MNG_NAME_CHANGE", key.getd_B_ACCT_MNG_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_NO") && key.getd_OLD_B_ACCT_NO() != null) {
					msgKey.setKeyValue("d_OLD_B_ACCT_NO", key.getd_OLD_B_ACCT_NO());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_NO") && key.getd_NEW_B_ACCT_NO() != null) {
					msgKey.setKeyValue("d_NEW_B_ACCT_NO", key.getd_NEW_B_ACCT_NO());
				}
				if(msgKeyType.containsKeyColumn("d_B_ACCT_NO_CHANGE") && key.getd_B_ACCT_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_B_ACCT_NO_CHANGE", key.getd_B_ACCT_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_INTERNAL_TRN_TYP") && key.getd_OLD_INTERNAL_TRN_TYP() != null) {
					msgKey.setKeyValue("d_OLD_INTERNAL_TRN_TYP", key.getd_OLD_INTERNAL_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_INTERNAL_TRN_TYP") && key.getd_NEW_INTERNAL_TRN_TYP() != null) {
					msgKey.setKeyValue("d_NEW_INTERNAL_TRN_TYP", key.getd_NEW_INTERNAL_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_INTERNAL_TRN_TYP_CHANGE") && key.getd_INTERNAL_TRN_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_INTERNAL_TRN_TYP_CHANGE", key.getd_INTERNAL_TRN_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_MIN_AMOUNT_CHANGE") && key.getd_MIN_AMOUNT_CHANGE() != null) {
					msgKey.setKeyValue("d_MIN_AMOUNT_CHANGE", key.getd_MIN_AMOUNT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ORG_CD") && key.getd_OLD_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_ORG_CD", key.getd_OLD_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ORG_CD") && key.getd_NEW_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_ORG_CD", key.getd_NEW_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_ORG_CD_CHANGE") && key.getd_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_ORG_CD_CHANGE", key.getd_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_PATTERN_NAME") && key.getd_OLD_PAY_PATTERN_NAME() != null) {
					msgKey.setKeyValue("d_OLD_PAY_PATTERN_NAME", key.getd_OLD_PAY_PATTERN_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_PATTERN_NAME") && key.getd_NEW_PAY_PATTERN_NAME() != null) {
					msgKey.setKeyValue("d_NEW_PAY_PATTERN_NAME", key.getd_NEW_PAY_PATTERN_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_PATTERN_NAME_CHANGE") && key.getd_PAY_PATTERN_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_PATTERN_NAME_CHANGE", key.getd_PAY_PATTERN_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_STD_AMOUNT") && key.getd_OLD_STD_AMOUNT() != null) {
					msgKey.setKeyValue("d_OLD_STD_AMOUNT", key.getd_OLD_STD_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_STD_AMOUNT") && key.getd_NEW_STD_AMOUNT() != null) {
					msgKey.setKeyValue("d_NEW_STD_AMOUNT", key.getd_NEW_STD_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("d_STD_AMOUNT_CHANGE") && key.getd_STD_AMOUNT_CHANGE() != null) {
					msgKey.setKeyValue("d_STD_AMOUNT_CHANGE", key.getd_STD_AMOUNT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_RATIO_1") && key.getd_OLD_RATIO_1() != null) {
					msgKey.setKeyValue("d_OLD_RATIO_1", key.getd_OLD_RATIO_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_RATIO_1") && key.getd_NEW_RATIO_1() != null) {
					msgKey.setKeyValue("d_NEW_RATIO_1", key.getd_NEW_RATIO_1());
				}
				if(msgKeyType.containsKeyColumn("d_RATIO_1_CHANGE") && key.getd_RATIO_1_CHANGE() != null) {
					msgKey.setKeyValue("d_RATIO_1_CHANGE", key.getd_RATIO_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_RATIO_2") && key.getd_OLD_RATIO_2() != null) {
					msgKey.setKeyValue("d_OLD_RATIO_2", key.getd_OLD_RATIO_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_RATIO_2") && key.getd_NEW_RATIO_2() != null) {
					msgKey.setKeyValue("d_NEW_RATIO_2", key.getd_NEW_RATIO_2());
				}
				if(msgKeyType.containsKeyColumn("d_RATIO_2_CHANGE") && key.getd_RATIO_2_CHANGE() != null) {
					msgKey.setKeyValue("d_RATIO_2_CHANGE", key.getd_RATIO_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PATTERN_CD") && key.getd_OLD_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_OLD_PATTERN_CD", key.getd_OLD_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PATTERN_CD") && key.getd_NEW_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_NEW_PATTERN_CD", key.getd_NEW_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_PATTERN_CD_CHANGE") && key.getd_PATTERN_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_PATTERN_CD_CHANGE", key.getd_PATTERN_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CLASS_1") && key.getd_OLD_CLASS_1() != null) {
					msgKey.setKeyValue("d_OLD_CLASS_1", key.getd_OLD_CLASS_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CLASS_1") && key.getd_NEW_CLASS_1() != null) {
					msgKey.setKeyValue("d_NEW_CLASS_1", key.getd_NEW_CLASS_1());
				}
				if(msgKeyType.containsKeyColumn("d_CLASS_1_CHANGE") && key.getd_CLASS_1_CHANGE() != null) {
					msgKey.setKeyValue("d_CLASS_1_CHANGE", key.getd_CLASS_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CLASS_2") && key.getd_OLD_CLASS_2() != null) {
					msgKey.setKeyValue("d_OLD_CLASS_2", key.getd_OLD_CLASS_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CLASS_2") && key.getd_NEW_CLASS_2() != null) {
					msgKey.setKeyValue("d_NEW_CLASS_2", key.getd_NEW_CLASS_2());
				}
				if(msgKeyType.containsKeyColumn("d_CLASS_2_CHANGE") && key.getd_CLASS_2_CHANGE() != null) {
					msgKey.setKeyValue("d_CLASS_2_CHANGE", key.getd_CLASS_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CLASS_3") && key.getd_OLD_CLASS_3() != null) {
					msgKey.setKeyValue("d_OLD_CLASS_3", key.getd_OLD_CLASS_3());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CLASS_3") && key.getd_NEW_CLASS_3() != null) {
					msgKey.setKeyValue("d_NEW_CLASS_3", key.getd_NEW_CLASS_3());
				}
				if(msgKeyType.containsKeyColumn("d_CLASS_3_CHANGE") && key.getd_CLASS_3_CHANGE() != null) {
					msgKey.setKeyValue("d_CLASS_3_CHANGE", key.getd_CLASS_3_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_AUTO_JNL_NAME") && key.getd_OLD_AUTO_JNL_NAME() != null) {
					msgKey.setKeyValue("d_OLD_AUTO_JNL_NAME", key.getd_OLD_AUTO_JNL_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_AUTO_JNL_NAME") && key.getd_NEW_AUTO_JNL_NAME() != null) {
					msgKey.setKeyValue("d_NEW_AUTO_JNL_NAME", key.getd_NEW_AUTO_JNL_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_AUTO_JNL_NAME_CHANGE") && key.getd_AUTO_JNL_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_AUTO_JNL_NAME_CHANGE", key.getd_AUTO_JNL_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DR_ACCT_CD") && key.getd_OLD_DR_ACCT_CD() != null) {
					msgKey.setKeyValue("d_OLD_DR_ACCT_CD", key.getd_OLD_DR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DR_ACCT_CD") && key.getd_NEW_DR_ACCT_CD() != null) {
					msgKey.setKeyValue("d_NEW_DR_ACCT_CD", key.getd_NEW_DR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_DR_ACCT_CD_CHANGE") && key.getd_DR_ACCT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DR_ACCT_CD_CHANGE", key.getd_DR_ACCT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DR_SUB_ACCT_CD") && key.getd_OLD_DR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("d_OLD_DR_SUB_ACCT_CD", key.getd_OLD_DR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DR_SUB_ACCT_CD") && key.getd_NEW_DR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("d_NEW_DR_SUB_ACCT_CD", key.getd_NEW_DR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_DR_SUB_ACCT_CD_CHANGE") && key.getd_DR_SUB_ACCT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DR_SUB_ACCT_CD_CHANGE", key.getd_DR_SUB_ACCT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DR_ORG_TYP") && key.getd_OLD_DR_ORG_TYP() != null) {
					msgKey.setKeyValue("d_OLD_DR_ORG_TYP", key.getd_OLD_DR_ORG_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DR_ORG_TYP") && key.getd_NEW_DR_ORG_TYP() != null) {
					msgKey.setKeyValue("d_NEW_DR_ORG_TYP", key.getd_NEW_DR_ORG_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_DR_ORG_TYP_CHANGE") && key.getd_DR_ORG_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_DR_ORG_TYP_CHANGE", key.getd_DR_ORG_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DR_ORG_CD") && key.getd_OLD_DR_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_DR_ORG_CD", key.getd_OLD_DR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DR_ORG_CD") && key.getd_NEW_DR_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_DR_ORG_CD", key.getd_NEW_DR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_DR_ORG_CD_CHANGE") && key.getd_DR_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DR_ORG_CD_CHANGE", key.getd_DR_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CR_ACCT_CD") && key.getd_OLD_CR_ACCT_CD() != null) {
					msgKey.setKeyValue("d_OLD_CR_ACCT_CD", key.getd_OLD_CR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CR_ACCT_CD") && key.getd_NEW_CR_ACCT_CD() != null) {
					msgKey.setKeyValue("d_NEW_CR_ACCT_CD", key.getd_NEW_CR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CR_ACCT_CD_CHANGE") && key.getd_CR_ACCT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CR_ACCT_CD_CHANGE", key.getd_CR_ACCT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CR_SUB_ACCT_CD") && key.getd_OLD_CR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("d_OLD_CR_SUB_ACCT_CD", key.getd_OLD_CR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CR_SUB_ACCT_CD") && key.getd_NEW_CR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("d_NEW_CR_SUB_ACCT_CD", key.getd_NEW_CR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CR_SUB_ACCT_CD_CHANGE") && key.getd_CR_SUB_ACCT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CR_SUB_ACCT_CD_CHANGE", key.getd_CR_SUB_ACCT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CR_ORG_TYP") && key.getd_OLD_CR_ORG_TYP() != null) {
					msgKey.setKeyValue("d_OLD_CR_ORG_TYP", key.getd_OLD_CR_ORG_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CR_ORG_TYP") && key.getd_NEW_CR_ORG_TYP() != null) {
					msgKey.setKeyValue("d_NEW_CR_ORG_TYP", key.getd_NEW_CR_ORG_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_CR_ORG_TYP_CHANGE") && key.getd_CR_ORG_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_CR_ORG_TYP_CHANGE", key.getd_CR_ORG_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CR_ORG_CD") && key.getd_OLD_CR_ORG_CD() != null) {
					msgKey.setKeyValue("d_OLD_CR_ORG_CD", key.getd_OLD_CR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CR_ORG_CD") && key.getd_NEW_CR_ORG_CD() != null) {
					msgKey.setKeyValue("d_NEW_CR_ORG_CD", key.getd_NEW_CR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CR_ORG_CD_CHANGE") && key.getd_CR_ORG_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CR_ORG_CD_CHANGE", key.getd_CR_ORG_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACCT_SLIP_NUM") && key.getd_OLD_ACCT_SLIP_NUM() != null) {
					msgKey.setKeyValue("d_OLD_ACCT_SLIP_NUM", key.getd_OLD_ACCT_SLIP_NUM());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACCT_SLIP_NUM") && key.getd_NEW_ACCT_SLIP_NUM() != null) {
					msgKey.setKeyValue("d_NEW_ACCT_SLIP_NUM", key.getd_NEW_ACCT_SLIP_NUM());
				}
				if(msgKeyType.containsKeyColumn("d_ACCT_SLIP_NUM_CHANGE") && key.getd_ACCT_SLIP_NUM_CHANGE() != null) {
					msgKey.setKeyValue("d_ACCT_SLIP_NUM_CHANGE", key.getd_ACCT_SLIP_NUM_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACCT_JNL_PATTERN_CD") && key.getd_OLD_ACCT_JNL_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_OLD_ACCT_JNL_PATTERN_CD", key.getd_OLD_ACCT_JNL_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACCT_JNL_PATTERN_CD") && key.getd_NEW_ACCT_JNL_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_NEW_ACCT_JNL_PATTERN_CD", key.getd_NEW_ACCT_JNL_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_ACCT_JNL_PATTERN_CD_CHANGE") && key.getd_ACCT_JNL_PATTERN_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_ACCT_JNL_PATTERN_CD_CHANGE", key.getd_ACCT_JNL_PATTERN_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CAL_NO") && key.getd_OLD_CAL_NO() != null) {
					msgKey.setKeyValue("d_OLD_CAL_NO", key.getd_OLD_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CAL_NO") && key.getd_NEW_CAL_NO() != null) {
					msgKey.setKeyValue("d_NEW_CAL_NO", key.getd_NEW_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("d_CAL_NO_CHANGE") && key.getd_CAL_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_CAL_NO_CHANGE", key.getd_CAL_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_NAME") && key.getd_OLD_BANK_BR_NAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_NAME", key.getd_OLD_BANK_BR_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_NAME") && key.getd_NEW_BANK_BR_NAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_NAME", key.getd_NEW_BANK_BR_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_NAME_CHANGE") && key.getd_BANK_BR_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_NAME_CHANGE", key.getd_BANK_BR_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_ANAME") && key.getd_OLD_BANK_BR_ANAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_ANAME", key.getd_OLD_BANK_BR_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_ANAME") && key.getd_NEW_BANK_BR_ANAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_ANAME", key.getd_NEW_BANK_BR_ANAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_ANAME_CHANGE") && key.getd_BANK_BR_ANAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_ANAME_CHANGE", key.getd_BANK_BR_ANAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_KNAME") && key.getd_OLD_BANK_BR_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_KNAME", key.getd_OLD_BANK_BR_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_KNAME") && key.getd_NEW_BANK_BR_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_KNAME", key.getd_NEW_BANK_BR_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_KNAME_CHANGE") && key.getd_BANK_BR_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_KNAME_CHANGE", key.getd_BANK_BR_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_ENAME") && key.getd_OLD_BANK_BR_ENAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_ENAME", key.getd_OLD_BANK_BR_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_ENAME") && key.getd_NEW_BANK_BR_ENAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_ENAME", key.getd_NEW_BANK_BR_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_ENAME_CHANGE") && key.getd_BANK_BR_ENAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_ENAME_CHANGE", key.getd_BANK_BR_ENAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_FB_NAME") && key.getd_OLD_BANK_BR_FB_NAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_FB_NAME", key.getd_OLD_BANK_BR_FB_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_FB_NAME") && key.getd_NEW_BANK_BR_FB_NAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_FB_NAME", key.getd_NEW_BANK_BR_FB_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_FB_NAME_CHANGE") && key.getd_BANK_BR_FB_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_FB_NAME_CHANGE", key.getd_BANK_BR_FB_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_CNAME") && key.getd_OLD_BANK_BR_CNAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_CNAME", key.getd_OLD_BANK_BR_CNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_CNAME") && key.getd_NEW_BANK_BR_CNAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_CNAME", key.getd_NEW_BANK_BR_CNAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_CNAME_CHANGE") && key.getd_BANK_BR_CNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_CNAME_CHANGE", key.getd_BANK_BR_CNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_ECNAME") && key.getd_OLD_BANK_BR_ECNAME() != null) {
					msgKey.setKeyValue("d_OLD_BANK_BR_ECNAME", key.getd_OLD_BANK_BR_ECNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_ECNAME") && key.getd_NEW_BANK_BR_ECNAME() != null) {
					msgKey.setKeyValue("d_NEW_BANK_BR_ECNAME", key.getd_NEW_BANK_BR_ECNAME());
				}
				if(msgKeyType.containsKeyColumn("d_BANK_BR_ECNAME_CHANGE") && key.getd_BANK_BR_ECNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BANK_BR_ECNAME_CHANGE", key.getd_BANK_BR_ECNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_CD") && key.getd_OLD_BRANCH_CD() != null) {
					msgKey.setKeyValue("d_OLD_BRANCH_CD", key.getd_OLD_BRANCH_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_CD") && key.getd_NEW_BRANCH_CD() != null) {
					msgKey.setKeyValue("d_NEW_BRANCH_CD", key.getd_NEW_BRANCH_CD());
				}
				if(msgKeyType.containsKeyColumn("d_BRANCH_CD_CHANGE") && key.getd_BRANCH_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_BRANCH_CD_CHANGE", key.getd_BRANCH_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_FNAME") && key.getd_OLD_BRANCH_FNAME() != null) {
					msgKey.setKeyValue("d_OLD_BRANCH_FNAME", key.getd_OLD_BRANCH_FNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_FNAME") && key.getd_NEW_BRANCH_FNAME() != null) {
					msgKey.setKeyValue("d_NEW_BRANCH_FNAME", key.getd_NEW_BRANCH_FNAME());
				}
				if(msgKeyType.containsKeyColumn("d_BRANCH_FNAME_CHANGE") && key.getd_BRANCH_FNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BRANCH_FNAME_CHANGE", key.getd_BRANCH_FNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_NAME") && key.getd_OLD_BRANCH_NAME() != null) {
					msgKey.setKeyValue("d_OLD_BRANCH_NAME", key.getd_OLD_BRANCH_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_NAME") && key.getd_NEW_BRANCH_NAME() != null) {
					msgKey.setKeyValue("d_NEW_BRANCH_NAME", key.getd_NEW_BRANCH_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_BRANCH_NAME_CHANGE") && key.getd_BRANCH_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BRANCH_NAME_CHANGE", key.getd_BRANCH_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_KNAME") && key.getd_OLD_BRANCH_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_BRANCH_KNAME", key.getd_OLD_BRANCH_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_KNAME") && key.getd_NEW_BRANCH_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_BRANCH_KNAME", key.getd_NEW_BRANCH_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_BRANCH_KNAME_CHANGE") && key.getd_BRANCH_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BRANCH_KNAME_CHANGE", key.getd_BRANCH_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_ENAME") && key.getd_OLD_BRANCH_ENAME() != null) {
					msgKey.setKeyValue("d_OLD_BRANCH_ENAME", key.getd_OLD_BRANCH_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_ENAME") && key.getd_NEW_BRANCH_ENAME() != null) {
					msgKey.setKeyValue("d_NEW_BRANCH_ENAME", key.getd_NEW_BRANCH_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_BRANCH_ENAME_CHANGE") && key.getd_BRANCH_ENAME_CHANGE() != null) {
					msgKey.setKeyValue("d_BRANCH_ENAME_CHANGE", key.getd_BRANCH_ENAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_SEQ_CD") && key.getd_OLD_BRANCH_SEQ_CD() != null) {
					msgKey.setKeyValue("d_OLD_BRANCH_SEQ_CD", key.getd_OLD_BRANCH_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_SEQ_CD") && key.getd_NEW_BRANCH_SEQ_CD() != null) {
					msgKey.setKeyValue("d_NEW_BRANCH_SEQ_CD", key.getd_NEW_BRANCH_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("d_BRANCH_SEQ_CD_CHANGE") && key.getd_BRANCH_SEQ_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_BRANCH_SEQ_CD_CHANGE", key.getd_BRANCH_SEQ_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CHARGE_ORG_NAME") && key.getd_OLD_CHARGE_ORG_NAME() != null) {
					msgKey.setKeyValue("d_OLD_CHARGE_ORG_NAME", key.getd_OLD_CHARGE_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CHARGE_ORG_NAME") && key.getd_NEW_CHARGE_ORG_NAME() != null) {
					msgKey.setKeyValue("d_NEW_CHARGE_ORG_NAME", key.getd_NEW_CHARGE_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_CHARGE_ORG_NAME_CHANGE") && key.getd_CHARGE_ORG_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CHARGE_ORG_NAME_CHANGE", key.getd_CHARGE_ORG_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CHARGE_PERSON_NAME") && key.getd_OLD_CHARGE_PERSON_NAME() != null) {
					msgKey.setKeyValue("d_OLD_CHARGE_PERSON_NAME", key.getd_OLD_CHARGE_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CHARGE_PERSON_NAME") && key.getd_NEW_CHARGE_PERSON_NAME() != null) {
					msgKey.setKeyValue("d_NEW_CHARGE_PERSON_NAME", key.getd_NEW_CHARGE_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_CHARGE_PERSON_NAME_CHANGE") && key.getd_CHARGE_PERSON_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CHARGE_PERSON_NAME_CHANGE", key.getd_CHARGE_PERSON_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EDI_OWN_VEND_CD") && key.getd_OLD_EDI_OWN_VEND_CD() != null) {
					msgKey.setKeyValue("d_OLD_EDI_OWN_VEND_CD", key.getd_OLD_EDI_OWN_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EDI_OWN_VEND_CD") && key.getd_NEW_EDI_OWN_VEND_CD() != null) {
					msgKey.setKeyValue("d_NEW_EDI_OWN_VEND_CD", key.getd_NEW_EDI_OWN_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("d_EDI_OWN_VEND_CD_CHANGE") && key.getd_EDI_OWN_VEND_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_EDI_OWN_VEND_CD_CHANGE", key.getd_EDI_OWN_VEND_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_REMARKS_1") && key.getd_OLD_REMARKS_1() != null) {
					msgKey.setKeyValue("d_OLD_REMARKS_1", key.getd_OLD_REMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_REMARKS_1") && key.getd_NEW_REMARKS_1() != null) {
					msgKey.setKeyValue("d_NEW_REMARKS_1", key.getd_NEW_REMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("d_REMARKS_1_CHANGE") && key.getd_REMARKS_1_CHANGE() != null) {
					msgKey.setKeyValue("d_REMARKS_1_CHANGE", key.getd_REMARKS_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_REMARKS_2") && key.getd_OLD_REMARKS_2() != null) {
					msgKey.setKeyValue("d_OLD_REMARKS_2", key.getd_OLD_REMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_REMARKS_2") && key.getd_NEW_REMARKS_2() != null) {
					msgKey.setKeyValue("d_NEW_REMARKS_2", key.getd_NEW_REMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("d_REMARKS_2_CHANGE") && key.getd_REMARKS_2_CHANGE() != null) {
					msgKey.setKeyValue("d_REMARKS_2_CHANGE", key.getd_REMARKS_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_REMARKS_3") && key.getd_OLD_REMARKS_3() != null) {
					msgKey.setKeyValue("d_OLD_REMARKS_3", key.getd_OLD_REMARKS_3());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_REMARKS_3") && key.getd_NEW_REMARKS_3() != null) {
					msgKey.setKeyValue("d_NEW_REMARKS_3", key.getd_NEW_REMARKS_3());
				}
				if(msgKeyType.containsKeyColumn("d_REMARKS_3_CHANGE") && key.getd_REMARKS_3_CHANGE() != null) {
					msgKey.setKeyValue("d_REMARKS_3_CHANGE", key.getd_REMARKS_3_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DETAIL_ROUND_TYP") && key.getd_OLD_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("d_OLD_DETAIL_ROUND_TYP", key.getd_OLD_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DETAIL_ROUND_TYP") && key.getd_NEW_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("d_NEW_DETAIL_ROUND_TYP", key.getd_NEW_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_DETAIL_ROUND_TYP_CHANGE") && key.getd_DETAIL_ROUND_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_DETAIL_ROUND_TYP_CHANGE", key.getd_DETAIL_ROUND_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SECTION_CD") && key.getd_OLD_SECTION_CD() != null) {
					msgKey.setKeyValue("d_OLD_SECTION_CD", key.getd_OLD_SECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SECTION_CD") && key.getd_NEW_SECTION_CD() != null) {
					msgKey.setKeyValue("d_NEW_SECTION_CD", key.getd_NEW_SECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("d_SECTION_CD_CHANGE") && key.getd_SECTION_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_SECTION_CD_CHANGE", key.getd_SECTION_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS_NAME") && key.getl_STATUS_NAME() != null) {
					msgKey.setKeyValue("l_STATUS_NAME", key.getl_STATUS_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PURPOSE_UNIT_PRICE_TYP") && key.getd_OLD_PURPOSE_UNIT_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_PURPOSE_UNIT_PRICE_TYP", key.getd_OLD_PURPOSE_UNIT_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PURPOSE_UNIT_PRICE_TYP") && key.getd_NEW_PURPOSE_UNIT_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_PURPOSE_UNIT_PRICE_TYP", key.getd_NEW_PURPOSE_UNIT_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_PURPOSE_UNIT_PRICE_TYP_CHANGE") && key.getd_PURPOSE_UNIT_PRICE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_PURPOSE_UNIT_PRICE_TYP_CHANGE", key.getd_PURPOSE_UNIT_PRICE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SALES_UNIT_SIZE") && key.getd_OLD_SALES_UNIT_SIZE() != null) {
					msgKey.setKeyValue("d_OLD_SALES_UNIT_SIZE", key.getd_OLD_SALES_UNIT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SALES_UNIT_SIZE") && key.getd_NEW_SALES_UNIT_SIZE() != null) {
					msgKey.setKeyValue("d_NEW_SALES_UNIT_SIZE", key.getd_NEW_SALES_UNIT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_SALES_UNIT_SIZE_CHANGE") && key.getd_SALES_UNIT_SIZE_CHANGE() != null) {
					msgKey.setKeyValue("d_SALES_UNIT_SIZE_CHANGE", key.getd_SALES_UNIT_SIZE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SALES_UNIT_COST") && key.getd_OLD_SALES_UNIT_COST() != null) {
					msgKey.setKeyValue("d_OLD_SALES_UNIT_COST", key.getd_OLD_SALES_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SALES_UNIT_COST") && key.getd_NEW_SALES_UNIT_COST() != null) {
					msgKey.setKeyValue("d_NEW_SALES_UNIT_COST", key.getd_NEW_SALES_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("d_SALES_UNIT_COST_CHANGE") && key.getd_SALES_UNIT_COST_CHANGE() != null) {
					msgKey.setKeyValue("d_SALES_UNIT_COST_CHANGE", key.getd_SALES_UNIT_COST_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_GRP_CD") && key.getd_OLD_CUST_GRP_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_GRP_CD", key.getd_OLD_CUST_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_GRP_CD") && key.getd_NEW_CUST_GRP_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_GRP_CD", key.getd_NEW_CUST_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_GRP_CD_CHANGE") && key.getd_CUST_GRP_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_GRP_CD_CHANGE", key.getd_CUST_GRP_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CNCNTRT_DLV_LOC_CD") && key.getd_OLD_CNCNTRT_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_OLD_CNCNTRT_DLV_LOC_CD", key.getd_OLD_CNCNTRT_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CNCNTRT_DLV_LOC_CD") && key.getd_NEW_CNCNTRT_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_NEW_CNCNTRT_DLV_LOC_CD", key.getd_NEW_CNCNTRT_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CNCNTRT_DLV_LOC_CD_CHANGE") && key.getd_CNCNTRT_DLV_LOC_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CNCNTRT_DLV_LOC_CD_CHANGE", key.getd_CNCNTRT_DLV_LOC_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_CTL_TYP") && key.getd_OLD_SHIP_CTL_TYP() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_CTL_TYP", key.getd_OLD_SHIP_CTL_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_CTL_TYP") && key.getd_NEW_SHIP_CTL_TYP() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_CTL_TYP", key.getd_NEW_SHIP_CTL_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_CTL_TYP_CHANGE") && key.getd_SHIP_CTL_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_CTL_TYP_CHANGE", key.getd_SHIP_CTL_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_SLIP_ISS_FLG") && key.getd_OLD_DLV_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("d_OLD_DLV_SLIP_ISS_FLG", key.getd_OLD_DLV_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_SLIP_ISS_FLG") && key.getd_NEW_DLV_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("d_NEW_DLV_SLIP_ISS_FLG", key.getd_NEW_DLV_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_SLIP_ISS_FLG_CHANGE") && key.getd_DLV_SLIP_ISS_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_SLIP_ISS_FLG_CHANGE", key.getd_DLV_SLIP_ISS_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_IDENT_CARD_F_ISS_TYP") && key.getd_OLD_IDENT_CARD_F_ISS_TYP() != null) {
					msgKey.setKeyValue("d_OLD_IDENT_CARD_F_ISS_TYP", key.getd_OLD_IDENT_CARD_F_ISS_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_IDENT_CARD_F_ISS_TYP") && key.getd_NEW_IDENT_CARD_F_ISS_TYP() != null) {
					msgKey.setKeyValue("d_NEW_IDENT_CARD_F_ISS_TYP", key.getd_NEW_IDENT_CARD_F_ISS_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_IDENT_CARD_F_ISS_TYP_CHANGE") && key.getd_IDENT_CARD_F_ISS_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_IDENT_CARD_F_ISS_TYP_CHANGE", key.getd_IDENT_CARD_F_ISS_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_IDENT_CARD_F_FORMAT_TYP") && key.getd_OLD_IDENT_CARD_F_FORMAT_TYP() != null) {
					msgKey.setKeyValue("d_OLD_IDENT_CARD_F_FORMAT_TYP", key.getd_OLD_IDENT_CARD_F_FORMAT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_IDENT_CARD_F_FORMAT_TYP") && key.getd_NEW_IDENT_CARD_F_FORMAT_TYP() != null) {
					msgKey.setKeyValue("d_NEW_IDENT_CARD_F_FORMAT_TYP", key.getd_NEW_IDENT_CARD_F_FORMAT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_IDENT_CARD_F_FORMAT_TYP_CHANGE") && key.getd_IDENT_CARD_F_FORMAT_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_IDENT_CARD_F_FORMAT_TYP_CHANGE", key.getd_IDENT_CARD_F_FORMAT_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_FIX_TERM") && key.getd_OLD_SHIP_FIX_TERM() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_FIX_TERM", key.getd_OLD_SHIP_FIX_TERM());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_FIX_TERM") && key.getd_NEW_SHIP_FIX_TERM() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_FIX_TERM", key.getd_NEW_SHIP_FIX_TERM());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_FIX_TERM_CHANGE") && key.getd_SHIP_FIX_TERM_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_FIX_TERM_CHANGE", key.getd_SHIP_FIX_TERM_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MASS_PRODUCT_TYP") && key.getd_OLD_MASS_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("d_OLD_MASS_PRODUCT_TYP", key.getd_OLD_MASS_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MASS_PRODUCT_TYP") && key.getd_NEW_MASS_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("d_NEW_MASS_PRODUCT_TYP", key.getd_NEW_MASS_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_MASS_PRODUCT_TYP_CHANGE") && key.getd_MASS_PRODUCT_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_MASS_PRODUCT_TYP_CHANGE", key.getd_MASS_PRODUCT_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DECISION_REPLACE_PTN") && key.getd_OLD_DECISION_REPLACE_PTN() != null) {
					msgKey.setKeyValue("d_OLD_DECISION_REPLACE_PTN", key.getd_OLD_DECISION_REPLACE_PTN());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DECISION_REPLACE_PTN") && key.getd_NEW_DECISION_REPLACE_PTN() != null) {
					msgKey.setKeyValue("d_NEW_DECISION_REPLACE_PTN", key.getd_NEW_DECISION_REPLACE_PTN());
				}
				if(msgKeyType.containsKeyColumn("d_DECISION_REPLACE_PTN_CHANGE") && key.getd_DECISION_REPLACE_PTN_CHANGE() != null) {
					msgKey.setKeyValue("d_DECISION_REPLACE_PTN_CHANGE", key.getd_DECISION_REPLACE_PTN_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_RSLT_APPLY_TYP") && key.getd_OLD_SHIP_RSLT_APPLY_TYP() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_RSLT_APPLY_TYP", key.getd_OLD_SHIP_RSLT_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_RSLT_APPLY_TYP") && key.getd_NEW_SHIP_RSLT_APPLY_TYP() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_RSLT_APPLY_TYP", key.getd_NEW_SHIP_RSLT_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_RSLT_APPLY_TYP_CHANGE") && key.getd_SHIP_RSLT_APPLY_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_RSLT_APPLY_TYP_CHANGE", key.getd_SHIP_RSLT_APPLY_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP") && key.getd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP() != null) {
					msgKey.setKeyValue("d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP", key.getd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP") && key.getd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP() != null) {
					msgKey.setKeyValue("d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP", key.getd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE") && key.getd_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE", key.getd_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_NEXT_DLV_SHIFT_EFF_FLG") && key.getd_OLD_NEXT_DLV_SHIFT_EFF_FLG() != null) {
					msgKey.setKeyValue("d_OLD_NEXT_DLV_SHIFT_EFF_FLG", key.getd_OLD_NEXT_DLV_SHIFT_EFF_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_NEXT_DLV_SHIFT_EFF_FLG") && key.getd_NEW_NEXT_DLV_SHIFT_EFF_FLG() != null) {
					msgKey.setKeyValue("d_NEW_NEXT_DLV_SHIFT_EFF_FLG", key.getd_NEW_NEXT_DLV_SHIFT_EFF_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE") && key.getd_NEXT_DLV_SHIFT_EFF_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE", key.getd_NEXT_DLV_SHIFT_EFF_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_UNCNFM_PLAN_AVG_FLG") && key.getd_OLD_UNCNFM_PLAN_AVG_FLG() != null) {
					msgKey.setKeyValue("d_OLD_UNCNFM_PLAN_AVG_FLG", key.getd_OLD_UNCNFM_PLAN_AVG_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_UNCNFM_PLAN_AVG_FLG") && key.getd_NEW_UNCNFM_PLAN_AVG_FLG() != null) {
					msgKey.setKeyValue("d_NEW_UNCNFM_PLAN_AVG_FLG", key.getd_NEW_UNCNFM_PLAN_AVG_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_UNCNFM_PLAN_AVG_FLG_CHANGE") && key.getd_UNCNFM_PLAN_AVG_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_UNCNFM_PLAN_AVG_FLG_CHANGE", key.getd_UNCNFM_PLAN_AVG_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CNCNTRT_TRANS_LT") && key.getd_OLD_CNCNTRT_TRANS_LT() != null) {
					msgKey.setKeyValue("d_OLD_CNCNTRT_TRANS_LT", key.getd_OLD_CNCNTRT_TRANS_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CNCNTRT_TRANS_LT") && key.getd_NEW_CNCNTRT_TRANS_LT() != null) {
					msgKey.setKeyValue("d_NEW_CNCNTRT_TRANS_LT", key.getd_NEW_CNCNTRT_TRANS_LT());
				}
				if(msgKeyType.containsKeyColumn("d_CNCNTRT_TRANS_LT_CHANGE") && key.getd_CNCNTRT_TRANS_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_CNCNTRT_TRANS_LT_CHANGE", key.getd_CNCNTRT_TRANS_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_TRANS_LT") && key.getd_OLD_CUST_TRANS_LT() != null) {
					msgKey.setKeyValue("d_OLD_CUST_TRANS_LT", key.getd_OLD_CUST_TRANS_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_TRANS_LT") && key.getd_NEW_CUST_TRANS_LT() != null) {
					msgKey.setKeyValue("d_NEW_CUST_TRANS_LT", key.getd_NEW_CUST_TRANS_LT());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_TRANS_LT_CHANGE") && key.getd_CUST_TRANS_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_TRANS_LT_CHANGE", key.getd_CUST_TRANS_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_CD") && key.getd_OLD_CUST_DESINATED_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_CD", key.getd_OLD_CUST_DESINATED_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_CD") && key.getd_NEW_CUST_DESINATED_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_CD", key.getd_NEW_CUST_DESINATED_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_CD_CHANGE") && key.getd_CUST_DESINATED_DLV_LOC_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_DESINATED_DLV_LOC_CD_CHANGE", key.getd_CUST_DESINATED_DLV_LOC_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_OPTION_CHANGE_VALUE") && key.getd_OLD_DLV_LOC_OPTION_CHANGE_VALUE() != null) {
					msgKey.setKeyValue("d_OLD_DLV_LOC_OPTION_CHANGE_VALUE", key.getd_OLD_DLV_LOC_OPTION_CHANGE_VALUE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_OPTION_CHANGE_VALUE") && key.getd_NEW_DLV_LOC_OPTION_CHANGE_VALUE() != null) {
					msgKey.setKeyValue("d_NEW_DLV_LOC_OPTION_CHANGE_VALUE", key.getd_NEW_DLV_LOC_OPTION_CHANGE_VALUE());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE") && key.getd_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE", key.getd_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_NAME") && key.getd_OLD_CUST_DESINATED_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_NAME", key.getd_OLD_CUST_DESINATED_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_NAME") && key.getd_NEW_CUST_DESINATED_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_NAME", key.getd_NEW_CUST_DESINATED_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_NAME_CHANGE") && key.getd_CUST_DESINATED_DLV_LOC_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_DESINATED_DLV_LOC_NAME_CHANGE", key.getd_CUST_DESINATED_DLV_LOC_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_KNAME") && key.getd_OLD_CUST_DESINATED_DLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_KNAME", key.getd_OLD_CUST_DESINATED_DLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_KNAME") && key.getd_NEW_CUST_DESINATED_DLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_KNAME", key.getd_NEW_CUST_DESINATED_DLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE") && key.getd_CUST_DESINATED_DLV_LOC_KNAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE", key.getd_CUST_DESINATED_DLV_LOC_KNAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_ENAME") && key.getd_OLD_CUST_DESINATED_DLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_ENAME", key.getd_OLD_CUST_DESINATED_DLV_LOC_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_ENAME") && key.getd_NEW_CUST_DESINATED_DLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_ENAME", key.getd_NEW_CUST_DESINATED_DLV_LOC_ENAME());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE") && key.getd_CUST_DESINATED_DLV_LOC_ENAME_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE", key.getd_CUST_DESINATED_DLV_LOC_ENAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("h_HISTORY_FOR_APPR") && key.geth_HISTORY_FOR_APPR() != null) {
					msgKey.setKeyValue("h_HISTORY_FOR_APPR", key.geth_HISTORY_FOR_APPR());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ITEM_NAME") && key.getd_OLD_ITEM_NAME() != null) {
					msgKey.setKeyValue("d_OLD_ITEM_NAME", key.getd_OLD_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ITEM_NAME") && key.getd_NEW_ITEM_NAME() != null) {
					msgKey.setKeyValue("d_NEW_ITEM_NAME", key.getd_NEW_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_NAME_CHANGE") && key.getd_ITEM_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_ITEM_NAME_CHANGE", key.getd_ITEM_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DRAW_CD") && key.getd_OLD_DRAW_CD() != null) {
					msgKey.setKeyValue("d_OLD_DRAW_CD", key.getd_OLD_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DRAW_CD") && key.getd_NEW_DRAW_CD() != null) {
					msgKey.setKeyValue("d_NEW_DRAW_CD", key.getd_NEW_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("d_DRAW_CD_CHANGE") && key.getd_DRAW_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DRAW_CD_CHANGE", key.getd_DRAW_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_HIGH_LEVEL_NO") && key.getd_OLD_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("d_OLD_HIGH_LEVEL_NO", key.getd_OLD_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_HIGH_LEVEL_NO") && key.getd_NEW_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("d_NEW_HIGH_LEVEL_NO", key.getd_NEW_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("d_HIGH_LEVEL_NO_CHANGE") && key.getd_HIGH_LEVEL_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_HIGH_LEVEL_NO_CHANGE", key.getd_HIGH_LEVEL_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SPEC") && key.getd_OLD_SPEC() != null) {
					msgKey.setKeyValue("d_OLD_SPEC", key.getd_OLD_SPEC());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SPEC") && key.getd_NEW_SPEC() != null) {
					msgKey.setKeyValue("d_NEW_SPEC", key.getd_NEW_SPEC());
				}
				if(msgKeyType.containsKeyColumn("d_SPEC_CHANGE") && key.getd_SPEC_CHANGE() != null) {
					msgKey.setKeyValue("d_SPEC_CHANGE", key.getd_SPEC_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ISSUE_TYP") && key.getd_OLD_ISSUE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_ISSUE_TYP", key.getd_OLD_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ISSUE_TYP") && key.getd_NEW_ISSUE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_ISSUE_TYP", key.getd_NEW_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_ISSUE_TYP_CHANGE") && key.getd_ISSUE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_ISSUE_TYP_CHANGE", key.getd_ISSUE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_UNIT_QTY_TYP") && key.getd_OLD_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("d_OLD_UNIT_QTY_TYP", key.getd_OLD_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_UNIT_QTY_TYP") && key.getd_NEW_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("d_NEW_UNIT_QTY_TYP", key.getd_NEW_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_UNIT_QTY_TYP_CHANGE") && key.getd_UNIT_QTY_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_UNIT_QTY_TYP_CHANGE", key.getd_UNIT_QTY_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OUTSIDE_TYP") && key.getd_OLD_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_OUTSIDE_TYP", key.getd_OLD_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OUTSIDE_TYP") && key.getd_NEW_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_OUTSIDE_TYP", key.getd_NEW_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OUTSIDE_TYP_CHANGE") && key.getd_OUTSIDE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_OUTSIDE_TYP_CHANGE", key.getd_OUTSIDE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ACPT_INSPC_TYP") && key.getd_OLD_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("d_OLD_ACPT_INSPC_TYP", key.getd_OLD_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ACPT_INSPC_TYP") && key.getd_NEW_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("d_NEW_ACPT_INSPC_TYP", key.getd_NEW_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_ACPT_INSPC_TYP_CHANGE") && key.getd_ACPT_INSPC_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_ACPT_INSPC_TYP_CHANGE", key.getd_ACPT_INSPC_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_STOCK_UNIT_FLG") && key.getd_OLD_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("d_OLD_STOCK_UNIT_FLG", key.getd_OLD_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_STOCK_UNIT_FLG") && key.getd_NEW_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("d_NEW_STOCK_UNIT_FLG", key.getd_NEW_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_STOCK_UNIT_FLG_CHANGE") && key.getd_STOCK_UNIT_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_STOCK_UNIT_FLG_CHANGE", key.getd_STOCK_UNIT_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PRODUCT_TYP") && key.getd_OLD_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("d_OLD_PRODUCT_TYP", key.getd_OLD_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PRODUCT_TYP") && key.getd_NEW_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("d_NEW_PRODUCT_TYP", key.getd_NEW_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_PRODUCT_TYP_CHANGE") && key.getd_PRODUCT_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_PRODUCT_TYP_CHANGE", key.getd_PRODUCT_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_STOCK_UNIT") && key.getd_OLD_STOCK_UNIT() != null) {
					msgKey.setKeyValue("d_OLD_STOCK_UNIT", key.getd_OLD_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_STOCK_UNIT") && key.getd_NEW_STOCK_UNIT() != null) {
					msgKey.setKeyValue("d_NEW_STOCK_UNIT", key.getd_NEW_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("d_STOCK_UNIT_CHANGE") && key.getd_STOCK_UNIT_CHANGE() != null) {
					msgKey.setKeyValue("d_STOCK_UNIT_CHANGE", key.getd_STOCK_UNIT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ABC_TYP") && key.getd_OLD_ABC_TYP() != null) {
					msgKey.setKeyValue("d_OLD_ABC_TYP", key.getd_OLD_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ABC_TYP") && key.getd_NEW_ABC_TYP() != null) {
					msgKey.setKeyValue("d_NEW_ABC_TYP", key.getd_NEW_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_ABC_TYP_CHANGE") && key.getd_ABC_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_ABC_TYP_CHANGE", key.getd_ABC_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PKG_UNIT") && key.getd_OLD_PKG_UNIT() != null) {
					msgKey.setKeyValue("d_OLD_PKG_UNIT", key.getd_OLD_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PKG_UNIT") && key.getd_NEW_PKG_UNIT() != null) {
					msgKey.setKeyValue("d_NEW_PKG_UNIT", key.getd_NEW_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("d_PKG_UNIT_CHANGE") && key.getd_PKG_UNIT_CHANGE() != null) {
					msgKey.setKeyValue("d_PKG_UNIT_CHANGE", key.getd_PKG_UNIT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_OPR_RSLT_TYP") && key.getd_OLD_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("d_OLD_OPR_RSLT_TYP", key.getd_OLD_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_OPR_RSLT_TYP") && key.getd_NEW_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("d_NEW_OPR_RSLT_TYP", key.getd_NEW_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OPR_RSLT_TYP_CHANGE") && key.getd_OPR_RSLT_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_OPR_RSLT_TYP_CHANGE", key.getd_OPR_RSLT_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PKG_UNIT_QTY") && key.getd_OLD_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("d_OLD_PKG_UNIT_QTY", key.getd_OLD_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PKG_UNIT_QTY") && key.getd_NEW_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("d_NEW_PKG_UNIT_QTY", key.getd_NEW_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_PKG_UNIT_QTY_CHANGE") && key.getd_PKG_UNIT_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_PKG_UNIT_QTY_CHANGE", key.getd_PKG_UNIT_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SPL_ITEM_TYP") && key.getd_OLD_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("d_OLD_SPL_ITEM_TYP", key.getd_OLD_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SPL_ITEM_TYP") && key.getd_NEW_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("d_NEW_SPL_ITEM_TYP", key.getd_NEW_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_SPL_ITEM_TYP_CHANGE") && key.getd_SPL_ITEM_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_SPL_ITEM_TYP_CHANGE", key.getd_SPL_ITEM_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_LT") && key.getd_OLD_ODR_LT() != null) {
					msgKey.setKeyValue("d_OLD_ODR_LT", key.getd_OLD_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_LT") && key.getd_NEW_ODR_LT() != null) {
					msgKey.setKeyValue("d_NEW_ODR_LT", key.getd_NEW_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_LT_CHANGE") && key.getd_ODR_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_LT_CHANGE", key.getd_ODR_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ISSUE_LT") && key.getd_OLD_ISSUE_LT() != null) {
					msgKey.setKeyValue("d_OLD_ISSUE_LT", key.getd_OLD_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ISSUE_LT") && key.getd_NEW_ISSUE_LT() != null) {
					msgKey.setKeyValue("d_NEW_ISSUE_LT", key.getd_NEW_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("d_ISSUE_LT_CHANGE") && key.getd_ISSUE_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_ISSUE_LT_CHANGE", key.getd_ISSUE_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_FIXED_LT") && key.getd_OLD_FIXED_LT() != null) {
					msgKey.setKeyValue("d_OLD_FIXED_LT", key.getd_OLD_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_FIXED_LT") && key.getd_NEW_FIXED_LT() != null) {
					msgKey.setKeyValue("d_NEW_FIXED_LT", key.getd_NEW_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("d_FIXED_LT_CHANGE") && key.getd_FIXED_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_FIXED_LT_CHANGE", key.getd_FIXED_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PROP_LOT_SIZE") && key.getd_OLD_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("d_OLD_PROP_LOT_SIZE", key.getd_OLD_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PROP_LOT_SIZE") && key.getd_NEW_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("d_NEW_PROP_LOT_SIZE", key.getd_NEW_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_PROP_LOT_SIZE_CHANGE") && key.getd_PROP_LOT_SIZE_CHANGE() != null) {
					msgKey.setKeyValue("d_PROP_LOT_SIZE_CHANGE", key.getd_PROP_LOT_SIZE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PROP_LT") && key.getd_OLD_PROP_LT() != null) {
					msgKey.setKeyValue("d_OLD_PROP_LT", key.getd_OLD_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PROP_LT") && key.getd_NEW_PROP_LT() != null) {
					msgKey.setKeyValue("d_NEW_PROP_LT", key.getd_NEW_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("d_PROP_LT_CHANGE") && key.getd_PROP_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_PROP_LT_CHANGE", key.getd_PROP_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ITEM_SPOIL") && key.getd_OLD_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("d_OLD_ITEM_SPOIL", key.getd_OLD_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ITEM_SPOIL") && key.getd_NEW_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("d_NEW_ITEM_SPOIL", key.getd_NEW_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("d_ITEM_SPOIL_CHANGE") && key.getd_ITEM_SPOIL_CHANGE() != null) {
					msgKey.setKeyValue("d_ITEM_SPOIL_CHANGE", key.getd_ITEM_SPOIL_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SAFETY_LT") && key.getd_OLD_SAFETY_LT() != null) {
					msgKey.setKeyValue("d_OLD_SAFETY_LT", key.getd_OLD_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SAFETY_LT") && key.getd_NEW_SAFETY_LT() != null) {
					msgKey.setKeyValue("d_NEW_SAFETY_LT", key.getd_NEW_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("d_SAFETY_LT_CHANGE") && key.getd_SAFETY_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_SAFETY_LT_CHANGE", key.getd_SAFETY_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SAFETY_STOCK") && key.getd_OLD_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("d_OLD_SAFETY_STOCK", key.getd_OLD_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SAFETY_STOCK") && key.getd_NEW_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("d_NEW_SAFETY_STOCK", key.getd_NEW_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("d_SAFETY_STOCK_CHANGE") && key.getd_SAFETY_STOCK_CHANGE() != null) {
					msgKey.setKeyValue("d_SAFETY_STOCK_CHANGE", key.getd_SAFETY_STOCK_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MRP_ODR_TYP") && key.getd_OLD_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("d_OLD_MRP_ODR_TYP", key.getd_OLD_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MRP_ODR_TYP") && key.getd_NEW_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("d_NEW_MRP_ODR_TYP", key.getd_NEW_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_MRP_ODR_TYP_CHANGE") && key.getd_MRP_ODR_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_MRP_ODR_TYP_CHANGE", key.getd_MRP_ODR_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MANHOUR_TYP") && key.getd_OLD_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("d_OLD_MANHOUR_TYP", key.getd_OLD_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MANHOUR_TYP") && key.getd_NEW_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("d_NEW_MANHOUR_TYP", key.getd_NEW_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_MANHOUR_TYP_CHANGE") && key.getd_MANHOUR_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_MANHOUR_TYP_CHANGE", key.getd_MANHOUR_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_LOT_SIZING_TYP") && key.getd_OLD_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("d_OLD_LOT_SIZING_TYP", key.getd_OLD_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_LOT_SIZING_TYP") && key.getd_NEW_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("d_NEW_LOT_SIZING_TYP", key.getd_NEW_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_LOT_SIZING_TYP_CHANGE") && key.getd_LOT_SIZING_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_LOT_SIZING_TYP_CHANGE", key.getd_LOT_SIZING_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MPS_FLG") && key.getd_OLD_MPS_FLG() != null) {
					msgKey.setKeyValue("d_OLD_MPS_FLG", key.getd_OLD_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MPS_FLG") && key.getd_NEW_MPS_FLG() != null) {
					msgKey.setKeyValue("d_NEW_MPS_FLG", key.getd_NEW_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_MPS_FLG_CHANGE") && key.getd_MPS_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_MPS_FLG_CHANGE", key.getd_MPS_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MAX_PERIOD") && key.getd_OLD_MAX_PERIOD() != null) {
					msgKey.setKeyValue("d_OLD_MAX_PERIOD", key.getd_OLD_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MAX_PERIOD") && key.getd_NEW_MAX_PERIOD() != null) {
					msgKey.setKeyValue("d_NEW_MAX_PERIOD", key.getd_NEW_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("d_MAX_PERIOD_CHANGE") && key.getd_MAX_PERIOD_CHANGE() != null) {
					msgKey.setKeyValue("d_MAX_PERIOD_CHANGE", key.getd_MAX_PERIOD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_FIXED_ODR_QTY") && key.getd_OLD_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("d_OLD_FIXED_ODR_QTY", key.getd_OLD_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_FIXED_ODR_QTY") && key.getd_NEW_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("d_NEW_FIXED_ODR_QTY", key.getd_NEW_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_FIXED_ODR_QTY_CHANGE") && key.getd_FIXED_ODR_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_FIXED_ODR_QTY_CHANGE", key.getd_FIXED_ODR_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MAX_ODR_QTY") && key.getd_OLD_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("d_OLD_MAX_ODR_QTY", key.getd_OLD_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MAX_ODR_QTY") && key.getd_NEW_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("d_NEW_MAX_ODR_QTY", key.getd_NEW_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_MAX_ODR_QTY_CHANGE") && key.getd_MAX_ODR_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_MAX_ODR_QTY_CHANGE", key.getd_MAX_ODR_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MIN_ODR_QTY") && key.getd_OLD_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("d_OLD_MIN_ODR_QTY", key.getd_OLD_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MIN_ODR_QTY") && key.getd_NEW_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("d_NEW_MIN_ODR_QTY", key.getd_NEW_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_MIN_ODR_QTY_CHANGE") && key.getd_MIN_ODR_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_MIN_ODR_QTY_CHANGE", key.getd_MIN_ODR_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_POINT") && key.getd_OLD_ODR_POINT() != null) {
					msgKey.setKeyValue("d_OLD_ODR_POINT", key.getd_OLD_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_POINT") && key.getd_NEW_ODR_POINT() != null) {
					msgKey.setKeyValue("d_NEW_ODR_POINT", key.getd_NEW_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_POINT_CHANGE") && key.getd_ODR_POINT_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_POINT_CHANGE", key.getd_ODR_POINT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MUL_ODR_QTY") && key.getd_OLD_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("d_OLD_MUL_ODR_QTY", key.getd_OLD_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MUL_ODR_QTY") && key.getd_NEW_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("d_NEW_MUL_ODR_QTY", key.getd_NEW_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_MUL_ODR_QTY_CHANGE") && key.getd_MUL_ODR_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_MUL_ODR_QTY_CHANGE", key.getd_MUL_ODR_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CLASIFICATION_CD") && key.getd_OLD_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("d_OLD_CLASIFICATION_CD", key.getd_OLD_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CLASIFICATION_CD") && key.getd_NEW_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("d_NEW_CLASIFICATION_CD", key.getd_NEW_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CLASIFICATION_CD_CHANGE") && key.getd_CLASIFICATION_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CLASIFICATION_CD_CHANGE", key.getd_CLASIFICATION_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_UNIT_WEIGHT") && key.getd_OLD_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("d_OLD_UNIT_WEIGHT", key.getd_OLD_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_UNIT_WEIGHT") && key.getd_NEW_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("d_NEW_UNIT_WEIGHT", key.getd_NEW_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("d_UNIT_WEIGHT_CHANGE") && key.getd_UNIT_WEIGHT_CHANGE() != null) {
					msgKey.setKeyValue("d_UNIT_WEIGHT_CHANGE", key.getd_UNIT_WEIGHT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TAX_CD_1") && key.getd_OLD_TAX_CD_1() != null) {
					msgKey.setKeyValue("d_OLD_TAX_CD_1", key.getd_OLD_TAX_CD_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TAX_CD_1") && key.getd_NEW_TAX_CD_1() != null) {
					msgKey.setKeyValue("d_NEW_TAX_CD_1", key.getd_NEW_TAX_CD_1());
				}
				if(msgKeyType.containsKeyColumn("d_TAX_CD_1_CHANGE") && key.getd_TAX_CD_1_CHANGE() != null) {
					msgKey.setKeyValue("d_TAX_CD_1_CHANGE", key.getd_TAX_CD_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DEPO_TYP") && key.getd_OLD_DEPO_TYP() != null) {
					msgKey.setKeyValue("d_OLD_DEPO_TYP", key.getd_OLD_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DEPO_TYP") && key.getd_NEW_DEPO_TYP() != null) {
					msgKey.setKeyValue("d_NEW_DEPO_TYP", key.getd_NEW_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_DEPO_TYP_CHANGE") && key.getd_DEPO_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_DEPO_TYP_CHANGE", key.getd_DEPO_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BEST_BEFORE_YEAR") && key.getd_OLD_BEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("d_OLD_BEST_BEFORE_YEAR", key.getd_OLD_BEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BEST_BEFORE_YEAR") && key.getd_NEW_BEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("d_NEW_BEST_BEFORE_YEAR", key.getd_NEW_BEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("d_BEST_BEFORE_YEAR_CHANGE") && key.getd_BEST_BEFORE_YEAR_CHANGE() != null) {
					msgKey.setKeyValue("d_BEST_BEFORE_YEAR_CHANGE", key.getd_BEST_BEFORE_YEAR_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_LOT_CTRL_FLG") && key.getd_OLD_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("d_OLD_LOT_CTRL_FLG", key.getd_OLD_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_LOT_CTRL_FLG") && key.getd_NEW_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("d_NEW_LOT_CTRL_FLG", key.getd_NEW_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_LOT_CTRL_FLG_CHANGE") && key.getd_LOT_CTRL_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_LOT_CTRL_FLG_CHANGE", key.getd_LOT_CTRL_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BEST_BEFORE_MONTH") && key.getd_OLD_BEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("d_OLD_BEST_BEFORE_MONTH", key.getd_OLD_BEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BEST_BEFORE_MONTH") && key.getd_NEW_BEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("d_NEW_BEST_BEFORE_MONTH", key.getd_NEW_BEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("d_BEST_BEFORE_MONTH_CHANGE") && key.getd_BEST_BEFORE_MONTH_CHANGE() != null) {
					msgKey.setKeyValue("d_BEST_BEFORE_MONTH_CHANGE", key.getd_BEST_BEFORE_MONTH_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_LOT_NUMBERING_TYP") && key.getd_OLD_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("d_OLD_LOT_NUMBERING_TYP", key.getd_OLD_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_LOT_NUMBERING_TYP") && key.getd_NEW_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("d_NEW_LOT_NUMBERING_TYP", key.getd_NEW_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_LOT_NUMBERING_TYP_CHANGE") && key.getd_LOT_NUMBERING_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_LOT_NUMBERING_TYP_CHANGE", key.getd_LOT_NUMBERING_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BEST_BEFORE_DAY") && key.getd_OLD_BEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("d_OLD_BEST_BEFORE_DAY", key.getd_OLD_BEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BEST_BEFORE_DAY") && key.getd_NEW_BEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("d_NEW_BEST_BEFORE_DAY", key.getd_NEW_BEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("d_BEST_BEFORE_DAY_CHANGE") && key.getd_BEST_BEFORE_DAY_CHANGE() != null) {
					msgKey.setKeyValue("d_BEST_BEFORE_DAY_CHANGE", key.getd_BEST_BEFORE_DAY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_STOCK_STATUS") && key.getd_OLD_STOCK_STATUS() != null) {
					msgKey.setKeyValue("d_OLD_STOCK_STATUS", key.getd_OLD_STOCK_STATUS());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_STOCK_STATUS") && key.getd_NEW_STOCK_STATUS() != null) {
					msgKey.setKeyValue("d_NEW_STOCK_STATUS", key.getd_NEW_STOCK_STATUS());
				}
				if(msgKeyType.containsKeyColumn("d_STOCK_STATUS_CHANGE") && key.getd_STOCK_STATUS_CHANGE() != null) {
					msgKey.setKeyValue("d_STOCK_STATUS_CHANGE", key.getd_STOCK_STATUS_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_STOCK_STATUS_NAME") && key.getd_OLD_STOCK_STATUS_NAME() != null) {
					msgKey.setKeyValue("d_OLD_STOCK_STATUS_NAME", key.getd_OLD_STOCK_STATUS_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_STOCK_STATUS_NAME") && key.getd_NEW_STOCK_STATUS_NAME() != null) {
					msgKey.setKeyValue("d_NEW_STOCK_STATUS_NAME", key.getd_NEW_STOCK_STATUS_NAME());
				}
				if(msgKeyType.containsKeyColumn("d_STOCK_STATUS_NAME_CHANGE") && key.getd_STOCK_STATUS_NAME_CHANGE() != null) {
					msgKey.setKeyValue("d_STOCK_STATUS_NAME_CHANGE", key.getd_STOCK_STATUS_NAME_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_STOCK_TYP") && key.getd_OLD_STOCK_TYP() != null) {
					msgKey.setKeyValue("d_OLD_STOCK_TYP", key.getd_OLD_STOCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_STOCK_TYP") && key.getd_NEW_STOCK_TYP() != null) {
					msgKey.setKeyValue("d_NEW_STOCK_TYP", key.getd_NEW_STOCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_STOCK_TYP_CHANGE") && key.getd_STOCK_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_STOCK_TYP_CHANGE", key.getd_STOCK_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EFF_STOCK_TYP") && key.getd_OLD_EFF_STOCK_TYP() != null) {
					msgKey.setKeyValue("d_OLD_EFF_STOCK_TYP", key.getd_OLD_EFF_STOCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EFF_STOCK_TYP") && key.getd_NEW_EFF_STOCK_TYP() != null) {
					msgKey.setKeyValue("d_NEW_EFF_STOCK_TYP", key.getd_NEW_EFF_STOCK_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_EFF_STOCK_TYP_CHANGE") && key.getd_EFF_STOCK_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_EFF_STOCK_TYP_CHANGE", key.getd_EFF_STOCK_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_TYP") && key.getd_OLD_SHIP_TYP() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_TYP", key.getd_OLD_SHIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_TYP") && key.getd_NEW_SHIP_TYP() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_TYP", key.getd_NEW_SHIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_TYP_CHANGE") && key.getd_SHIP_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_TYP_CHANGE", key.getd_SHIP_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_REF_NO") && key.getd_OLD_REF_NO() != null) {
					msgKey.setKeyValue("d_OLD_REF_NO", key.getd_OLD_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_REF_NO") && key.getd_NEW_REF_NO() != null) {
					msgKey.setKeyValue("d_NEW_REF_NO", key.getd_NEW_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_REF_NO_CHANGE") && key.getd_REF_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_REF_NO_CHANGE", key.getd_REF_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DELIVERY_CD") && key.getd_OLD_DELIVERY_CD() != null) {
					msgKey.setKeyValue("d_OLD_DELIVERY_CD", key.getd_OLD_DELIVERY_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DELIVERY_CD") && key.getd_NEW_DELIVERY_CD() != null) {
					msgKey.setKeyValue("d_NEW_DELIVERY_CD", key.getd_NEW_DELIVERY_CD());
				}
				if(msgKeyType.containsKeyColumn("d_DELIVERY_CD_CHANGE") && key.getd_DELIVERY_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DELIVERY_CD_CHANGE", key.getd_DELIVERY_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_PATTERN_CD") && key.getd_OLD_BALA_ACCO_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_OLD_BALA_ACCO_PATTERN_CD", key.getd_OLD_BALA_ACCO_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_PATTERN_CD") && key.getd_NEW_BALA_ACCO_PATTERN_CD() != null) {
					msgKey.setKeyValue("d_NEW_BALA_ACCO_PATTERN_CD", key.getd_NEW_BALA_ACCO_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("d_BALA_ACCO_PATTERN_CD_CHANGE") && key.getd_BALA_ACCO_PATTERN_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_BALA_ACCO_PATTERN_CD_CHANGE", key.getd_BALA_ACCO_PATTERN_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_PRIORITY_REF_NO") && key.getd_OLD_CUST_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("d_OLD_CUST_PRIORITY_REF_NO", key.getd_OLD_CUST_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_PRIORITY_REF_NO") && key.getd_NEW_CUST_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("d_NEW_CUST_PRIORITY_REF_NO", key.getd_NEW_CUST_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_PRIORITY_REF_NO_CHANGE") && key.getd_CUST_PRIORITY_REF_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_PRIORITY_REF_NO_CHANGE", key.getd_CUST_PRIORITY_REF_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO") && key.getd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO", key.getd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO") && key.getd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO() != null) {
					msgKey.setKeyValue("d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO", key.getd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_CD_1") && key.getd_OLD_BALA_ACCO_CD_1() != null) {
					msgKey.setKeyValue("d_OLD_BALA_ACCO_CD_1", key.getd_OLD_BALA_ACCO_CD_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_CD_1") && key.getd_NEW_BALA_ACCO_CD_1() != null) {
					msgKey.setKeyValue("d_NEW_BALA_ACCO_CD_1", key.getd_NEW_BALA_ACCO_CD_1());
				}
				if(msgKeyType.containsKeyColumn("d_BALA_ACCO_CD_1_CHANGE") && key.getd_BALA_ACCO_CD_1_CHANGE() != null) {
					msgKey.setKeyValue("d_BALA_ACCO_CD_1_CHANGE", key.getd_BALA_ACCO_CD_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_CD_2") && key.getd_OLD_BALA_ACCO_CD_2() != null) {
					msgKey.setKeyValue("d_OLD_BALA_ACCO_CD_2", key.getd_OLD_BALA_ACCO_CD_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_CD_2") && key.getd_NEW_BALA_ACCO_CD_2() != null) {
					msgKey.setKeyValue("d_NEW_BALA_ACCO_CD_2", key.getd_NEW_BALA_ACCO_CD_2());
				}
				if(msgKeyType.containsKeyColumn("d_BALA_ACCO_CD_2_CHANGE") && key.getd_BALA_ACCO_CD_2_CHANGE() != null) {
					msgKey.setKeyValue("d_BALA_ACCO_CD_2_CHANGE", key.getd_BALA_ACCO_CD_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_CD_3") && key.getd_OLD_BALA_ACCO_CD_3() != null) {
					msgKey.setKeyValue("d_OLD_BALA_ACCO_CD_3", key.getd_OLD_BALA_ACCO_CD_3());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_CD_3") && key.getd_NEW_BALA_ACCO_CD_3() != null) {
					msgKey.setKeyValue("d_NEW_BALA_ACCO_CD_3", key.getd_NEW_BALA_ACCO_CD_3());
				}
				if(msgKeyType.containsKeyColumn("d_BALA_ACCO_CD_3_CHANGE") && key.getd_BALA_ACCO_CD_3_CHANGE() != null) {
					msgKey.setKeyValue("d_BALA_ACCO_CD_3_CHANGE", key.getd_BALA_ACCO_CD_3_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE") && key.getd_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE", key.getd_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BILL_ADDRESSEE_FLG") && key.getd_OLD_BILL_ADDRESSEE_FLG() != null) {
					msgKey.setKeyValue("d_OLD_BILL_ADDRESSEE_FLG", key.getd_OLD_BILL_ADDRESSEE_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BILL_ADDRESSEE_FLG") && key.getd_NEW_BILL_ADDRESSEE_FLG() != null) {
					msgKey.setKeyValue("d_NEW_BILL_ADDRESSEE_FLG", key.getd_NEW_BILL_ADDRESSEE_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_BILL_ADDRESSEE_FLG_CHANGE") && key.getd_BILL_ADDRESSEE_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_BILL_ADDRESSEE_FLG_CHANGE", key.getd_BILL_ADDRESSEE_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_RM_FLG") && key.getd_OLD_RM_FLG() != null) {
					msgKey.setKeyValue("d_OLD_RM_FLG", key.getd_OLD_RM_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_RM_FLG") && key.getd_NEW_RM_FLG() != null) {
					msgKey.setKeyValue("d_NEW_RM_FLG", key.getd_NEW_RM_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_RM_FLG_CHANGE") && key.getd_RM_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_RM_FLG_CHANGE", key.getd_RM_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CLAIM_CYCLE_TYP") && key.getd_OLD_CLAIM_CYCLE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_CLAIM_CYCLE_TYP", key.getd_OLD_CLAIM_CYCLE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CLAIM_CYCLE_TYP") && key.getd_NEW_CLAIM_CYCLE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_CLAIM_CYCLE_TYP", key.getd_NEW_CLAIM_CYCLE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_CLAIM_CYCLE_TYP_CHANGE") && key.getd_CLAIM_CYCLE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_CLAIM_CYCLE_TYP_CHANGE", key.getd_CLAIM_CYCLE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TEMP_UNIT_PRICE_SALES_FLG") && key.getd_OLD_TEMP_UNIT_PRICE_SALES_FLG() != null) {
					msgKey.setKeyValue("d_OLD_TEMP_UNIT_PRICE_SALES_FLG", key.getd_OLD_TEMP_UNIT_PRICE_SALES_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TEMP_UNIT_PRICE_SALES_FLG") && key.getd_NEW_TEMP_UNIT_PRICE_SALES_FLG() != null) {
					msgKey.setKeyValue("d_NEW_TEMP_UNIT_PRICE_SALES_FLG", key.getd_NEW_TEMP_UNIT_PRICE_SALES_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE") && key.getd_TEMP_UNIT_PRICE_SALES_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE", key.getd_TEMP_UNIT_PRICE_SALES_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_RM_INP_TYP") && key.getd_OLD_RM_INP_TYP() != null) {
					msgKey.setKeyValue("d_OLD_RM_INP_TYP", key.getd_OLD_RM_INP_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_RM_INP_TYP") && key.getd_NEW_RM_INP_TYP() != null) {
					msgKey.setKeyValue("d_NEW_RM_INP_TYP", key.getd_NEW_RM_INP_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_RM_INP_TYP_CHANGE") && key.getd_RM_INP_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_RM_INP_TYP_CHANGE", key.getd_RM_INP_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_TRN_STOP_FLG") && key.getd_OLD_TRN_STOP_FLG() != null) {
					msgKey.setKeyValue("d_OLD_TRN_STOP_FLG", key.getd_OLD_TRN_STOP_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_TRN_STOP_FLG") && key.getd_NEW_TRN_STOP_FLG() != null) {
					msgKey.setKeyValue("d_NEW_TRN_STOP_FLG", key.getd_NEW_TRN_STOP_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_TRN_STOP_FLG_CHANGE") && key.getd_TRN_STOP_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_TRN_STOP_FLG_CHANGE", key.getd_TRN_STOP_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SET_LT") && key.getd_OLD_SET_LT() != null) {
					msgKey.setKeyValue("d_OLD_SET_LT", key.getd_OLD_SET_LT());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SET_LT") && key.getd_NEW_SET_LT() != null) {
					msgKey.setKeyValue("d_NEW_SET_LT", key.getd_NEW_SET_LT());
				}
				if(msgKeyType.containsKeyColumn("d_SET_LT_CHANGE") && key.getd_SET_LT_CHANGE() != null) {
					msgKey.setKeyValue("d_SET_LT_CHANGE", key.getd_SET_LT_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_JANCODE") && key.getd_OLD_JANCODE() != null) {
					msgKey.setKeyValue("d_OLD_JANCODE", key.getd_OLD_JANCODE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_JANCODE") && key.getd_NEW_JANCODE() != null) {
					msgKey.setKeyValue("d_NEW_JANCODE", key.getd_NEW_JANCODE());
				}
				if(msgKeyType.containsKeyColumn("d_JANCODE_CHANGE") && key.getd_JANCODE_CHANGE() != null) {
					msgKey.setKeyValue("d_JANCODE_CHANGE", key.getd_JANCODE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_MAX_STOCK_QTY") && key.getd_OLD_MAX_STOCK_QTY() != null) {
					msgKey.setKeyValue("d_OLD_MAX_STOCK_QTY", key.getd_OLD_MAX_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_MAX_STOCK_QTY") && key.getd_NEW_MAX_STOCK_QTY() != null) {
					msgKey.setKeyValue("d_NEW_MAX_STOCK_QTY", key.getd_NEW_MAX_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_MAX_STOCK_QTY_CHANGE") && key.getd_MAX_STOCK_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_MAX_STOCK_QTY_CHANGE", key.getd_MAX_STOCK_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_DEADLINE_YEAR") && key.getd_OLD_SHIP_DEADLINE_YEAR() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_DEADLINE_YEAR", key.getd_OLD_SHIP_DEADLINE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_DEADLINE_YEAR") && key.getd_NEW_SHIP_DEADLINE_YEAR() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_DEADLINE_YEAR", key.getd_NEW_SHIP_DEADLINE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_DEADLINE_YEAR_CHANGE") && key.getd_SHIP_DEADLINE_YEAR_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_DEADLINE_YEAR_CHANGE", key.getd_SHIP_DEADLINE_YEAR_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_DEADLINE_MONTH") && key.getd_OLD_SHIP_DEADLINE_MONTH() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_DEADLINE_MONTH", key.getd_OLD_SHIP_DEADLINE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_DEADLINE_MONTH") && key.getd_NEW_SHIP_DEADLINE_MONTH() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_DEADLINE_MONTH", key.getd_NEW_SHIP_DEADLINE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_DEADLINE_MONTH_CHANGE") && key.getd_SHIP_DEADLINE_MONTH_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_DEADLINE_MONTH_CHANGE", key.getd_SHIP_DEADLINE_MONTH_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SHIP_DEADLINE_DAY") && key.getd_OLD_SHIP_DEADLINE_DAY() != null) {
					msgKey.setKeyValue("d_OLD_SHIP_DEADLINE_DAY", key.getd_OLD_SHIP_DEADLINE_DAY());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SHIP_DEADLINE_DAY") && key.getd_NEW_SHIP_DEADLINE_DAY() != null) {
					msgKey.setKeyValue("d_NEW_SHIP_DEADLINE_DAY", key.getd_NEW_SHIP_DEADLINE_DAY());
				}
				if(msgKeyType.containsKeyColumn("d_SHIP_DEADLINE_DAY_CHANGE") && key.getd_SHIP_DEADLINE_DAY_CHANGE() != null) {
					msgKey.setKeyValue("d_SHIP_DEADLINE_DAY_CHANGE", key.getd_SHIP_DEADLINE_DAY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_DLV_LOC_CD") && key.getd_OLD_CUST_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_DLV_LOC_CD", key.getd_OLD_CUST_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_DLV_LOC_CD") && key.getd_NEW_CUST_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_DLV_LOC_CD", key.getd_NEW_CUST_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_DLV_LOC_CD_CHANGE") && key.getd_CUST_DLV_LOC_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_DLV_LOC_CD_CHANGE", key.getd_CUST_DLV_LOC_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_FLG") && key.getd_OLD_CUST_FLG() != null) {
					msgKey.setKeyValue("d_OLD_CUST_FLG", key.getd_OLD_CUST_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_FLG") && key.getd_NEW_CUST_FLG() != null) {
					msgKey.setKeyValue("d_NEW_CUST_FLG", key.getd_NEW_CUST_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_FLG_CHANGE") && key.getd_CUST_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_FLG_CHANGE", key.getd_CUST_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DELIVERY_FLG") && key.getd_OLD_DELIVERY_FLG() != null) {
					msgKey.setKeyValue("d_OLD_DELIVERY_FLG", key.getd_OLD_DELIVERY_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DELIVERY_FLG") && key.getd_NEW_DELIVERY_FLG() != null) {
					msgKey.setKeyValue("d_NEW_DELIVERY_FLG", key.getd_NEW_DELIVERY_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_DELIVERY_FLG_CHANGE") && key.getd_DELIVERY_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_DELIVERY_FLG_CHANGE", key.getd_DELIVERY_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_FLG") && key.getd_OLD_BALA_ACCO_FLG() != null) {
					msgKey.setKeyValue("d_OLD_BALA_ACCO_FLG", key.getd_OLD_BALA_ACCO_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_FLG") && key.getd_NEW_BALA_ACCO_FLG() != null) {
					msgKey.setKeyValue("d_NEW_BALA_ACCO_FLG", key.getd_NEW_BALA_ACCO_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_BALA_ACCO_FLG_CHANGE") && key.getd_BALA_ACCO_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_BALA_ACCO_FLG_CHANGE", key.getd_BALA_ACCO_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_UNIT_COST_USE_TYP") && key.getd_OLD_UNIT_COST_USE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_UNIT_COST_USE_TYP", key.getd_OLD_UNIT_COST_USE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_UNIT_COST_USE_TYP") && key.getd_NEW_UNIT_COST_USE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_UNIT_COST_USE_TYP", key.getd_NEW_UNIT_COST_USE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_UNIT_COST_USE_TYP_CHANGE") && key.getd_UNIT_COST_USE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_UNIT_COST_USE_TYP_CHANGE", key.getd_UNIT_COST_USE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_TARGET_NAME_1") && key.getd_OLD_PAY_TARGET_NAME_1() != null) {
					msgKey.setKeyValue("d_OLD_PAY_TARGET_NAME_1", key.getd_OLD_PAY_TARGET_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_TARGET_NAME_1") && key.getd_NEW_PAY_TARGET_NAME_1() != null) {
					msgKey.setKeyValue("d_NEW_PAY_TARGET_NAME_1", key.getd_NEW_PAY_TARGET_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_TARGET_NAME_1_CHANGE") && key.getd_PAY_TARGET_NAME_1_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_TARGET_NAME_1_CHANGE", key.getd_PAY_TARGET_NAME_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_1") && key.getd_OLD_PAY_METHOD_1() != null) {
					msgKey.setKeyValue("d_OLD_PAY_METHOD_1", key.getd_OLD_PAY_METHOD_1());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_1") && key.getd_NEW_PAY_METHOD_1() != null) {
					msgKey.setKeyValue("d_NEW_PAY_METHOD_1", key.getd_NEW_PAY_METHOD_1());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_METHOD_1_CHANGE") && key.getd_PAY_METHOD_1_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_METHOD_1_CHANGE", key.getd_PAY_METHOD_1_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_PAY_TARGET_NAME_2") && key.getd_OLD_PAY_TARGET_NAME_2() != null) {
					msgKey.setKeyValue("d_OLD_PAY_TARGET_NAME_2", key.getd_OLD_PAY_TARGET_NAME_2());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_PAY_TARGET_NAME_2") && key.getd_NEW_PAY_TARGET_NAME_2() != null) {
					msgKey.setKeyValue("d_NEW_PAY_TARGET_NAME_2", key.getd_NEW_PAY_TARGET_NAME_2());
				}
				if(msgKeyType.containsKeyColumn("d_PAY_TARGET_NAME_2_CHANGE") && key.getd_PAY_TARGET_NAME_2_CHANGE() != null) {
					msgKey.setKeyValue("d_PAY_TARGET_NAME_2_CHANGE", key.getd_PAY_TARGET_NAME_2_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_BUSINESS_WH_FLG") && key.getd_OLD_BUSINESS_WH_FLG() != null) {
					msgKey.setKeyValue("d_OLD_BUSINESS_WH_FLG", key.getd_OLD_BUSINESS_WH_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_BUSINESS_WH_FLG") && key.getd_NEW_BUSINESS_WH_FLG() != null) {
					msgKey.setKeyValue("d_NEW_BUSINESS_WH_FLG", key.getd_NEW_BUSINESS_WH_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_BUSINESS_WH_FLG_CHANGE") && key.getd_BUSINESS_WH_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_BUSINESS_WH_FLG_CHANGE", key.getd_BUSINESS_WH_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_REPRESENT_FLG") && key.getd_OLD_REPRESENT_FLG() != null) {
					msgKey.setKeyValue("d_OLD_REPRESENT_FLG", key.getd_OLD_REPRESENT_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_REPRESENT_FLG") && key.getd_NEW_REPRESENT_FLG() != null) {
					msgKey.setKeyValue("d_NEW_REPRESENT_FLG", key.getd_NEW_REPRESENT_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_REPRESENT_FLG_CHANGE") && key.getd_REPRESENT_FLG_CHANGE() != null) {
					msgKey.setKeyValue("d_REPRESENT_FLG_CHANGE", key.getd_REPRESENT_FLG_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SPCL_PRICE_TYP") && key.getd_OLD_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_SPCL_PRICE_TYP", key.getd_OLD_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SPCL_PRICE_TYP") && key.getd_NEW_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_SPCL_PRICE_TYP", key.getd_NEW_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_SPCL_PRICE_TYP_CHANGE") && key.getd_SPCL_PRICE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_SPCL_PRICE_TYP_CHANGE", key.getd_SPCL_PRICE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_UNIT_CD") && key.getd_OLD_UNIT_CD() != null) {
					msgKey.setKeyValue("d_OLD_UNIT_CD", key.getd_OLD_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_UNIT_CD") && key.getd_NEW_UNIT_CD() != null) {
					msgKey.setKeyValue("d_NEW_UNIT_CD", key.getd_NEW_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("d_UNIT_CD_CHANGE") && key.getd_UNIT_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_UNIT_CD_CHANGE", key.getd_UNIT_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_EFF_PHASE_OUT_DATE") && key.getd_OLD_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("d_OLD_EFF_PHASE_OUT_DATE", key.getd_OLD_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_EFF_PHASE_OUT_DATE") && key.getd_NEW_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("d_NEW_EFF_PHASE_OUT_DATE", key.getd_NEW_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_EFF_PHASE_OUT_DATE_CHANGE") && key.getd_EFF_PHASE_OUT_DATE_CHANGE() != null) {
					msgKey.setKeyValue("d_EFF_PHASE_OUT_DATE_CHANGE", key.getd_EFF_PHASE_OUT_DATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SALE_SIZE") && key.getd_OLD_SALE_SIZE() != null) {
					msgKey.setKeyValue("d_OLD_SALE_SIZE", key.getd_OLD_SALE_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SALE_SIZE") && key.getd_NEW_SALE_SIZE() != null) {
					msgKey.setKeyValue("d_NEW_SALE_SIZE", key.getd_NEW_SALE_SIZE());
				}
				if(msgKeyType.containsKeyColumn("d_SALE_SIZE_CHANGE") && key.getd_SALE_SIZE_CHANGE() != null) {
					msgKey.setKeyValue("d_SALE_SIZE_CHANGE", key.getd_SALE_SIZE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_SIZE") && key.getPUCH_SIZE() != null) {
					msgKey.setKeyValue("PUCH_SIZE", key.getPUCH_SIZE());
				}
				if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD") && key.getBILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("BILL_ADDRESSEE_CD", key.getBILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("STL_COND_CD") && key.getSTL_COND_CD() != null) {
					msgKey.setKeyValue("STL_COND_CD", key.getSTL_COND_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD") && key.getEXCH_RESERVE_CD() != null) {
					msgKey.setKeyValue("EXCH_RESERVE_CD", key.getEXCH_RESERVE_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_START_DATE") && key.getEXCH_START_DATE() != null) {
					msgKey.setKeyValue("EXCH_START_DATE", key.getEXCH_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("BANK_CD") && key.getBANK_CD() != null) {
					msgKey.setKeyValue("BANK_CD", key.getBANK_CD());
				}
				if(msgKeyType.containsKeyColumn("B_ACCT_CTRL_CD") && key.getB_ACCT_CTRL_CD() != null) {
					msgKey.setKeyValue("B_ACCT_CTRL_CD", key.getB_ACCT_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_ACCT_CD") && key.getSUB_ACCT_CD() != null) {
					msgKey.setKeyValue("SUB_ACCT_CD", key.getSUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("TRF_TYP") && key.getTRF_TYP() != null) {
					msgKey.setKeyValue("TRF_TYP", key.getTRF_TYP());
				}
				if(msgKeyType.containsKeyColumn("FB_FLG") && key.getFB_FLG() != null) {
					msgKey.setKeyValue("FB_FLG", key.getFB_FLG());
				}
				if(msgKeyType.containsKeyColumn("CONTENTS_TYP") && key.getCONTENTS_TYP() != null) {
					msgKey.setKeyValue("CONTENTS_TYP", key.getCONTENTS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INFO_TYP") && key.getINFO_TYP() != null) {
					msgKey.setKeyValue("INFO_TYP", key.getINFO_TYP());
				}
				if(msgKeyType.containsKeyColumn("VALID_START_DATE") && key.getVALID_START_DATE() != null) {
					msgKey.setKeyValue("VALID_START_DATE", key.getVALID_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("MIN_AMOUNT") && key.getMIN_AMOUNT() != null) {
					msgKey.setKeyValue("MIN_AMOUNT", key.getMIN_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PAY_METHOD_CD") && key.getPAY_METHOD_CD() != null) {
					msgKey.setKeyValue("PAY_METHOD_CD", key.getPAY_METHOD_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_PATTERN_CD") && key.getPAY_PATTERN_CD() != null) {
					msgKey.setKeyValue("PAY_PATTERN_CD", key.getPAY_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("PATTERN_CD") && key.getPATTERN_CD() != null) {
					msgKey.setKeyValue("PATTERN_CD", key.getPATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("CLASS_1") && key.getCLASS_1() != null) {
					msgKey.setKeyValue("CLASS_1", key.getCLASS_1());
				}
				if(msgKeyType.containsKeyColumn("CLASS_2") && key.getCLASS_2() != null) {
					msgKey.setKeyValue("CLASS_2", key.getCLASS_2());
				}
				if(msgKeyType.containsKeyColumn("CLASS_3") && key.getCLASS_3() != null) {
					msgKey.setKeyValue("CLASS_3", key.getCLASS_3());
				}
				if(msgKeyType.containsKeyColumn("LOGIN_USER_CD") && key.getLOGIN_USER_CD() != null) {
					msgKey.setKeyValue("LOGIN_USER_CD", key.getLOGIN_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD") && key.getACCT_CD() != null) {
					msgKey.setKeyValue("ACCT_CD", key.getACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("BANK_BR_CD") && key.getBANK_BR_CD() != null) {
					msgKey.setKeyValue("BANK_BR_CD", key.getBANK_BR_CD());
				}
				if(msgKeyType.containsKeyColumn("BRANCH_CD") && key.getBRANCH_CD() != null) {
					msgKey.setKeyValue("BRANCH_CD", key.getBRANCH_CD());
				}
				if(msgKeyType.containsKeyColumn("PURPOSE_UNIT_PRICE_TYP") && key.getPURPOSE_UNIT_PRICE_TYP() != null) {
					msgKey.setKeyValue("PURPOSE_UNIT_PRICE_TYP", key.getPURPOSE_UNIT_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_SIZE") && key.getSALES_UNIT_SIZE() != null) {
					msgKey.setKeyValue("SALES_UNIT_SIZE", key.getSALES_UNIT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("CUST_DESINATED_DLV_LOC_CD") && key.getCUST_DESINATED_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("CUST_DESINATED_DLV_LOC_CD", key.getCUST_DESINATED_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_OPTION_CHANGE_VALUE") && key.getDLV_LOC_OPTION_CHANGE_VALUE() != null) {
					msgKey.setKeyValue("DLV_LOC_OPTION_CHANGE_VALUE", key.getDLV_LOC_OPTION_CHANGE_VALUE());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("SEQNO") && key.getSEQNO() != null) {
					msgKey.setKeyValue("SEQNO", key.getSEQNO());
				}
				if(msgKeyType.containsKeyColumn("STOCK_STATUS") && key.getSTOCK_STATUS() != null) {
					msgKey.setKeyValue("STOCK_STATUS", key.getSTOCK_STATUS());
				}
				if(msgKeyType.containsKeyColumn("DELIVERY_CD") && key.getDELIVERY_CD() != null) {
					msgKey.setKeyValue("DELIVERY_CD", key.getDELIVERY_CD());
				}
				if(msgKeyType.containsKeyColumn("BALA_ACCO_PATTERN_CD") && key.getBALA_ACCO_PATTERN_CD() != null) {
					msgKey.setKeyValue("BALA_ACCO_PATTERN_CD", key.getBALA_ACCO_PATTERN_CD());
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
					AZ0060010Struct key = new AZ0060010Struct();
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r3_FILTER1")) {
						key.setr3_FILTER1(msgKey.getKeyValue("r3_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("h_SELECT_TYP")) {
						key.seth_SELECT_TYP(msgKey.getKeyValue("h_SELECT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SCREEN_NAME")) {
						key.setl_SCREEN_NAME(msgKey.getKeyValue("l_SCREEN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_COUNT")) {
						key.setl_REQUEST_COUNT(msgKey.getKeyValue("l_REQUEST_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_APPRING_COUNT")) {
						key.setl_APPRING_COUNT(msgKey.getKeyValue("l_APPRING_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_RESERVE_COUNT")) {
						key.setl_RESERVE_COUNT(msgKey.getKeyValue("l_RESERVE_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_REMARKS")) {
						key.setl_APPR_REMARKS(msgKey.getKeyValue("l_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_BY")) {
						key.setl_REQUEST_BY(msgKey.getKeyValue("l_REQUEST_BY"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_DATE")) {
						key.setl_REQUEST_DATE(msgKey.getKeyValue("l_REQUEST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_COL1")) {
						key.setl_ITEM_COL1(msgKey.getKeyValue("l_ITEM_COL1"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_COL2")) {
						key.setl_ITEM_COL2(msgKey.getKeyValue("l_ITEM_COL2"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_COL3")) {
						key.setl_ITEM_COL3(msgKey.getKeyValue("l_ITEM_COL3"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_COL4")) {
						key.setl_ITEM_COL4(msgKey.getKeyValue("l_ITEM_COL4"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_COL5")) {
						key.setl_ITEM_COL5(msgKey.getKeyValue("l_ITEM_COL5"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_TYP_VALUE")) {
						key.setl_PROC_TYP_VALUE(msgKey.getKeyValue("l_PROC_TYP_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("h_PROC_TYP")) {
						key.seth_PROC_TYP(msgKey.getKeyValue("h_PROC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_STATUS")) {
						key.seth_STATUS(msgKey.getKeyValue("h_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREEN_URL")) {
						key.seth_SCREEN_URL(msgKey.getKeyValue("h_SCREEN_URL"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_USER_CD")) {
						key.setd_OLD_USER_CD(msgKey.getKeyValue("d_OLD_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_USER_CD")) {
						key.setd_NEW_USER_CD(msgKey.getKeyValue("d_NEW_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_USER_CD_CHANGE")) {
						key.setd_USER_CD_CHANGE(msgKey.getKeyValue("d_USER_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_USER_NAME")) {
						key.setd_OLD_USER_NAME(msgKey.getKeyValue("d_OLD_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_USER_NAME")) {
						key.setd_NEW_USER_NAME(msgKey.getKeyValue("d_NEW_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_USER_NAME_CHANGE")) {
						key.setd_USER_NAME_CHANGE(msgKey.getKeyValue("d_USER_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PLANT_CD")) {
						key.setd_OLD_PLANT_CD(msgKey.getKeyValue("d_OLD_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PLANT_CD")) {
						key.setd_NEW_PLANT_CD(msgKey.getKeyValue("d_NEW_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PLANT_CD_CHANGE")) {
						key.setd_PLANT_CD_CHANGE(msgKey.getKeyValue("d_PLANT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PASSWORD")) {
						key.setd_OLD_PASSWORD(msgKey.getKeyValue("d_OLD_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PASSWORD")) {
						key.setd_NEW_PASSWORD(msgKey.getKeyValue("d_NEW_PASSWORD"));
					}
					if(msgKeyType.containsKeyColumn("d_PASSWORD_CHANGE")) {
						key.setd_PASSWORD_CHANGE(msgKey.getKeyValue("d_PASSWORD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_APPR_POWER_TYP")) {
						key.setd_OLD_APPR_POWER_TYP(msgKey.getKeyValue("d_OLD_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_APPR_POWER_TYP")) {
						key.setd_NEW_APPR_POWER_TYP(msgKey.getKeyValue("d_NEW_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS")) {
						key.setd_OLD_ADDRESS(msgKey.getKeyValue("d_OLD_ADDRESS"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS")) {
						key.setd_NEW_ADDRESS(msgKey.getKeyValue("d_NEW_ADDRESS"));
					}
					if(msgKeyType.containsKeyColumn("d_ADDRESS_CHANGE")) {
						key.setd_ADDRESS_CHANGE(msgKey.getKeyValue("d_ADDRESS_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_LOCALE")) {
						key.setd_OLD_LOCALE(msgKey.getKeyValue("d_OLD_LOCALE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_LOCALE")) {
						key.setd_NEW_LOCALE(msgKey.getKeyValue("d_NEW_LOCALE"));
					}
					if(msgKeyType.containsKeyColumn("d_LOCALE_CHANGE")) {
						key.setd_LOCALE_CHANGE(msgKey.getKeyValue("d_LOCALE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE")) {
						key.setl_RESERVE_CAUSE(msgKey.getKeyValue("l_RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("h_REQUEST_APPR_SAME")) {
						key.seth_REQUEST_APPR_SAME(msgKey.getKeyValue("h_REQUEST_APPR_SAME"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP")) {
						key.seth_APPR_POWER_TYP(msgKey.getKeyValue("h_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ITEM_CD")) {
						key.setd_OLD_ITEM_CD(msgKey.getKeyValue("d_OLD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ITEM_CD")) {
						key.setd_NEW_ITEM_CD(msgKey.getKeyValue("d_NEW_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_CD_CHANGE")) {
						key.setd_ITEM_CD_CHANGE(msgKey.getKeyValue("d_ITEM_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_CD")) {
						key.setd_OLD_CUST_CD(msgKey.getKeyValue("d_OLD_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_CD")) {
						key.setd_NEW_CUST_CD(msgKey.getKeyValue("d_NEW_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_CD_CHANGE")) {
						key.setd_CUST_CD_CHANGE(msgKey.getKeyValue("d_CUST_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EFF_PHASE_IN_DATE")) {
						key.setd_OLD_EFF_PHASE_IN_DATE(msgKey.getKeyValue("d_OLD_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EFF_PHASE_IN_DATE")) {
						key.setd_NEW_EFF_PHASE_IN_DATE(msgKey.getKeyValue("d_NEW_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_EFF_PHASE_IN_DATE_CHANGE")) {
						key.setd_EFF_PHASE_IN_DATE_CHANGE(msgKey.getKeyValue("d_EFF_PHASE_IN_DATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_UNIT_COST_TYP")) {
						key.setd_NEW_UNIT_COST_TYP(msgKey.getKeyValue("d_NEW_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_UNIT_COST_TYP_CHANGE")) {
						key.setd_UNIT_COST_TYP_CHANGE(msgKey.getKeyValue("d_UNIT_COST_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_UNIT_COST")) {
						key.setd_OLD_UNIT_COST(msgKey.getKeyValue("d_OLD_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_UNIT_COST")) {
						key.setd_NEW_UNIT_COST(msgKey.getKeyValue("d_NEW_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_UNIT_COST_CHANGE")) {
						key.setd_UNIT_COST_CHANGE(msgKey.getKeyValue("d_UNIT_COST_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_UNIT_COST_TYP")) {
						key.setd_OLD_UNIT_COST_TYP(msgKey.getKeyValue("d_OLD_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_APPR_POWER_TYP_CHANGE")) {
						key.setd_APPR_POWER_TYP_CHANGE(msgKey.getKeyValue("d_APPR_POWER_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_CD")) {
						key.setd_OLD_VEND_CD(msgKey.getKeyValue("d_OLD_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_CD")) {
						key.setd_NEW_VEND_CD(msgKey.getKeyValue("d_NEW_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_CD_CHANGE")) {
						key.setd_VEND_CD_CHANGE(msgKey.getKeyValue("d_VEND_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ONEROUS_FLG")) {
						key.setd_OLD_ONEROUS_FLG(msgKey.getKeyValue("d_OLD_ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ONEROUS_FLG")) {
						key.setd_NEW_ONEROUS_FLG(msgKey.getKeyValue("d_NEW_ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_ONEROUS_FLG_CHANGE")) {
						key.setd_ONEROUS_FLG_CHANGE(msgKey.getKeyValue("d_ONEROUS_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PROC_CD")) {
						key.setd_OLD_PROC_CD(msgKey.getKeyValue("d_OLD_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PROC_CD")) {
						key.setd_NEW_PROC_CD(msgKey.getKeyValue("d_NEW_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PROC_CD_CHANGE")) {
						key.setd_PROC_CD_CHANGE(msgKey.getKeyValue("d_PROC_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PROCESSING_COST")) {
						key.setd_OLD_PROCESSING_COST(msgKey.getKeyValue("d_OLD_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PROCESSING_COST")) {
						key.setd_NEW_PROCESSING_COST(msgKey.getKeyValue("d_NEW_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_PROCESSING_COST_CHANGE")) {
						key.setd_PROCESSING_COST_CHANGE(msgKey.getKeyValue("d_PROCESSING_COST_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MATERIAL_COST")) {
						key.setd_OLD_MATERIAL_COST(msgKey.getKeyValue("d_OLD_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MATERIAL_COST")) {
						key.setd_NEW_MATERIAL_COST(msgKey.getKeyValue("d_NEW_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_MATERIAL_COST_CHANGE")) {
						key.setd_MATERIAL_COST_CHANGE(msgKey.getKeyValue("d_MATERIAL_COST_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OTHER_OVERHEADS")) {
						key.setd_OLD_OTHER_OVERHEADS(msgKey.getKeyValue("d_OLD_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OTHER_OVERHEADS")) {
						key.setd_NEW_OTHER_OVERHEADS(msgKey.getKeyValue("d_NEW_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("d_OTHER_OVERHEADS_CHANGE")) {
						key.setd_OTHER_OVERHEADS_CHANGE(msgKey.getKeyValue("d_OTHER_OVERHEADS_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_BY_NAME")) {
						key.setl_REQUEST_BY_NAME(msgKey.getKeyValue("l_REQUEST_BY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_KEY1")) {
						key.seth_KEY1(msgKey.getKeyValue("h_KEY1"));
					}
					if(msgKeyType.containsKeyColumn("h_VALUE1")) {
						key.seth_VALUE1(msgKey.getKeyValue("h_VALUE1"));
					}
					if(msgKeyType.containsKeyColumn("h_KEY2")) {
						key.seth_KEY2(msgKey.getKeyValue("h_KEY2"));
					}
					if(msgKeyType.containsKeyColumn("h_VALUE2")) {
						key.seth_VALUE2(msgKey.getKeyValue("h_VALUE2"));
					}
					if(msgKeyType.containsKeyColumn("h_KEY3")) {
						key.seth_KEY3(msgKey.getKeyValue("h_KEY3"));
					}
					if(msgKeyType.containsKeyColumn("h_VALUE3")) {
						key.seth_VALUE3(msgKey.getKeyValue("h_VALUE3"));
					}
					if(msgKeyType.containsKeyColumn("h_KEY4")) {
						key.seth_KEY4(msgKey.getKeyValue("h_KEY4"));
					}
					if(msgKeyType.containsKeyColumn("h_VALUE4")) {
						key.seth_VALUE4(msgKey.getKeyValue("h_VALUE4"));
					}
					if(msgKeyType.containsKeyColumn("h_KEY5")) {
						key.seth_KEY5(msgKey.getKeyValue("h_KEY5"));
					}
					if(msgKeyType.containsKeyColumn("h_VALUE5")) {
						key.seth_VALUE5(msgKey.getKeyValue("h_VALUE5"));
					}
					if(msgKeyType.containsKeyColumn("h_KEY6")) {
						key.seth_KEY6(msgKey.getKeyValue("h_KEY6"));
					}
					if(msgKeyType.containsKeyColumn("h_VALUE6")) {
						key.seth_VALUE6(msgKey.getKeyValue("h_VALUE6"));
					}
					if(msgKeyType.containsKeyColumn("h_KEY7")) {
						key.seth_KEY7(msgKey.getKeyValue("h_KEY7"));
					}
					if(msgKeyType.containsKeyColumn("h_VALUE7")) {
						key.seth_VALUE7(msgKey.getKeyValue("h_VALUE7"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_NAME")) {
						key.seth_TABLE_NAME(msgKey.getKeyValue("h_TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_ITEM_CD")) {
						key.setd_OLD_VEND_ITEM_CD(msgKey.getKeyValue("d_OLD_VEND_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_ITEM_CD")) {
						key.setd_NEW_VEND_ITEM_CD(msgKey.getKeyValue("d_NEW_VEND_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_ITEM_CD_CHANGE")) {
						key.setd_VEND_ITEM_CD_CHANGE(msgKey.getKeyValue("d_VEND_ITEM_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PUCH_PRIORITY_REF_NO")) {
						key.setd_OLD_PUCH_PRIORITY_REF_NO(msgKey.getKeyValue("d_OLD_PUCH_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PUCH_PRIORITY_REF_NO")) {
						key.setd_NEW_PUCH_PRIORITY_REF_NO(msgKey.getKeyValue("d_NEW_PUCH_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_PUCH_PRIORITY_REF_NO_CHANGE")) {
						key.setd_PUCH_PRIORITY_REF_NO_CHANGE(msgKey.getKeyValue("d_PUCH_PRIORITY_REF_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PUCH_SIZE")) {
						key.setd_OLD_PUCH_SIZE(msgKey.getKeyValue("d_OLD_PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PUCH_SIZE")) {
						key.setd_NEW_PUCH_SIZE(msgKey.getKeyValue("d_NEW_PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_PUCH_SIZE_CHANGE")) {
						key.setd_PUCH_SIZE_CHANGE(msgKey.getKeyValue("d_PUCH_SIZE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_NAME")) {
						key.setd_OLD_VEND_NAME(msgKey.getKeyValue("d_OLD_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_NAME")) {
						key.setd_NEW_VEND_NAME(msgKey.getKeyValue("d_NEW_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_NAME_CHANGE")) {
						key.setd_VEND_NAME_CHANGE(msgKey.getKeyValue("d_VEND_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_ANAME")) {
						key.setd_OLD_VEND_ANAME(msgKey.getKeyValue("d_OLD_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_ANAME")) {
						key.setd_NEW_VEND_ANAME(msgKey.getKeyValue("d_NEW_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ZIP_CD")) {
						key.setd_OLD_ZIP_CD(msgKey.getKeyValue("d_OLD_ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ZIP_CD")) {
						key.setd_NEW_ZIP_CD(msgKey.getKeyValue("d_NEW_ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_ZIP_CD_CHANGE")) {
						key.setd_ZIP_CD_CHANGE(msgKey.getKeyValue("d_ZIP_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_1")) {
						key.setd_OLD_ADDRESS_1(msgKey.getKeyValue("d_OLD_ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_1")) {
						key.setd_NEW_ADDRESS_1(msgKey.getKeyValue("d_NEW_ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("d_ADDRESS_1_CHANGE")) {
						key.setd_ADDRESS_1_CHANGE(msgKey.getKeyValue("d_ADDRESS_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_2")) {
						key.setd_OLD_ADDRESS_2(msgKey.getKeyValue("d_OLD_ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_2")) {
						key.setd_NEW_ADDRESS_2(msgKey.getKeyValue("d_NEW_ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("d_ADDRESS_2_CHANGE")) {
						key.setd_ADDRESS_2_CHANGE(msgKey.getKeyValue("d_ADDRESS_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_K_1")) {
						key.setd_OLD_ADDRESS_K_1(msgKey.getKeyValue("d_OLD_ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_K_1")) {
						key.setd_NEW_ADDRESS_K_1(msgKey.getKeyValue("d_NEW_ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("d_ADDRESS_K_1_CHANGE")) {
						key.setd_ADDRESS_K_1_CHANGE(msgKey.getKeyValue("d_ADDRESS_K_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ADDRESS_K_2")) {
						key.setd_OLD_ADDRESS_K_2(msgKey.getKeyValue("d_OLD_ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ADDRESS_K_2")) {
						key.setd_NEW_ADDRESS_K_2(msgKey.getKeyValue("d_NEW_ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("d_ADDRESS_K_2_CHANGE")) {
						key.setd_ADDRESS_K_2_CHANGE(msgKey.getKeyValue("d_ADDRESS_K_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TEL")) {
						key.setd_OLD_TEL(msgKey.getKeyValue("d_OLD_TEL"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TEL")) {
						key.setd_NEW_TEL(msgKey.getKeyValue("d_NEW_TEL"));
					}
					if(msgKeyType.containsKeyColumn("d_TEL_CHANGE")) {
						key.setd_TEL_CHANGE(msgKey.getKeyValue("d_TEL_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_FAX")) {
						key.setd_OLD_FAX(msgKey.getKeyValue("d_OLD_FAX"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_FAX")) {
						key.setd_NEW_FAX(msgKey.getKeyValue("d_NEW_FAX"));
					}
					if(msgKeyType.containsKeyColumn("d_FAX_CHANGE")) {
						key.setd_FAX_CHANGE(msgKey.getKeyValue("d_FAX_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EMAIL")) {
						key.setd_OLD_EMAIL(msgKey.getKeyValue("d_OLD_EMAIL"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EMAIL")) {
						key.setd_NEW_EMAIL(msgKey.getKeyValue("d_NEW_EMAIL"));
					}
					if(msgKeyType.containsKeyColumn("d_EMAIL_CHANGE")) {
						key.setd_EMAIL_CHANGE(msgKey.getKeyValue("d_EMAIL_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_ORG")) {
						key.setd_OLD_VEND_ORG(msgKey.getKeyValue("d_OLD_VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_ORG")) {
						key.setd_NEW_VEND_ORG(msgKey.getKeyValue("d_NEW_VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_ORG_CHANGE")) {
						key.setd_VEND_ORG_CHANGE(msgKey.getKeyValue("d_VEND_ORG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_PERSON")) {
						key.setd_OLD_VEND_PERSON(msgKey.getKeyValue("d_OLD_VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_PERSON")) {
						key.setd_NEW_VEND_PERSON(msgKey.getKeyValue("d_NEW_VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_PERSON_CHANGE")) {
						key.setd_VEND_PERSON_CHANGE(msgKey.getKeyValue("d_VEND_PERSON_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OWN_ORG_CD")) {
						key.setd_OLD_OWN_ORG_CD(msgKey.getKeyValue("d_OLD_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OWN_ORG_CD")) {
						key.setd_NEW_OWN_ORG_CD(msgKey.getKeyValue("d_NEW_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OWN_ORG_CD_CHANGE")) {
						key.setd_OWN_ORG_CD_CHANGE(msgKey.getKeyValue("d_OWN_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OWN_ORG_NAME")) {
						key.setd_OLD_OWN_ORG_NAME(msgKey.getKeyValue("d_OLD_OWN_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OWN_ORG_NAME")) {
						key.setd_NEW_OWN_ORG_NAME(msgKey.getKeyValue("d_NEW_OWN_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_OWN_ORG_NAME_CHANGE")) {
						key.setd_OWN_ORG_NAME_CHANGE(msgKey.getKeyValue("d_OWN_ORG_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OWN_PERSON_CD")) {
						key.setd_OLD_OWN_PERSON_CD(msgKey.getKeyValue("d_OLD_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OWN_PERSON_CD")) {
						key.setd_NEW_OWN_PERSON_CD(msgKey.getKeyValue("d_NEW_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OWN_PERSON_CD_CHANGE")) {
						key.setd_OWN_PERSON_CD_CHANGE(msgKey.getKeyValue("d_OWN_PERSON_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ROUND_TYP")) {
						key.setd_OLD_ROUND_TYP(msgKey.getKeyValue("d_OLD_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ROUND_TYP")) {
						key.setd_NEW_ROUND_TYP(msgKey.getKeyValue("d_NEW_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_ROUND_TYP_CHANGE")) {
						key.setd_ROUND_TYP_CHANGE(msgKey.getKeyValue("d_ROUND_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TAX_CD")) {
						key.setd_OLD_TAX_CD(msgKey.getKeyValue("d_OLD_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TAX_CD")) {
						key.setd_NEW_TAX_CD(msgKey.getKeyValue("d_NEW_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_TAX_CD_CHANGE")) {
						key.setd_TAX_CD_CHANGE(msgKey.getKeyValue("d_TAX_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TAX_APPLY_TYP")) {
						key.setd_OLD_TAX_APPLY_TYP(msgKey.getKeyValue("d_OLD_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TAX_APPLY_TYP")) {
						key.setd_NEW_TAX_APPLY_TYP(msgKey.getKeyValue("d_NEW_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_TAX_APPLY_TYP_CD_CHANGE")) {
						key.setd_TAX_APPLY_TYP_CD_CHANGE(msgKey.getKeyValue("d_TAX_APPLY_TYP_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TAX_CALC_TYP")) {
						key.setd_OLD_TAX_CALC_TYP(msgKey.getKeyValue("d_OLD_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TAX_CALC_TYP")) {
						key.setd_NEW_TAX_CALC_TYP(msgKey.getKeyValue("d_NEW_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_TAX_CALC_TYP_CHANGE")) {
						key.setd_TAX_CALC_TYP_CHANGE(msgKey.getKeyValue("d_TAX_CALC_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_INSPC_ACPT_APP_TYP")) {
						key.setd_OLD_INSPC_ACPT_APP_TYP(msgKey.getKeyValue("d_OLD_INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_INSPC_ACPT_APP_TYP")) {
						key.setd_NEW_INSPC_ACPT_APP_TYP(msgKey.getKeyValue("d_NEW_INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_INSPC_ACPT_APP_TYP_CHANGE")) {
						key.setd_INSPC_ACPT_APP_TYP_CHANGE(msgKey.getKeyValue("d_INSPC_ACPT_APP_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_REM")) {
						key.setd_OLD_VEND_REM(msgKey.getKeyValue("d_OLD_VEND_REM"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_REM")) {
						key.setd_NEW_VEND_REM(msgKey.getKeyValue("d_NEW_VEND_REM"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_REM_CHANGE")) {
						key.setd_VEND_REM_CHANGE(msgKey.getKeyValue("d_VEND_REM_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUR_CD")) {
						key.setd_OLD_CUR_CD(msgKey.getKeyValue("d_OLD_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUR_CD")) {
						key.setd_NEW_CUR_CD(msgKey.getKeyValue("d_NEW_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUR_CD_CHANGE")) {
						key.setd_CUR_CD_CHANGE(msgKey.getKeyValue("d_CUR_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EXCH_TYP")) {
						key.setd_OLD_EXCH_TYP(msgKey.getKeyValue("d_OLD_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EXCH_TYP")) {
						key.setd_NEW_EXCH_TYP(msgKey.getKeyValue("d_NEW_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_EXCH_TYP_CHANGE")) {
						key.setd_EXCH_TYP_CHANGE(msgKey.getKeyValue("d_EXCH_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_IMPORT_TRN_TYP")) {
						key.setd_OLD_IMPORT_TRN_TYP(msgKey.getKeyValue("d_OLD_IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_IMPORT_TRN_TYP")) {
						key.setd_NEW_IMPORT_TRN_TYP(msgKey.getKeyValue("d_NEW_IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_IMPORT_TRN_TYP_CHANGE")) {
						key.setd_IMPORT_TRN_TYP_CHANGE(msgKey.getKeyValue("d_IMPORT_TRN_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_ANAME_CHANGE")) {
						key.setd_VEND_ANAME_CHANGE(msgKey.getKeyValue("d_VEND_ANAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_NAME")) {
						key.setd_OLD_CUST_NAME(msgKey.getKeyValue("d_OLD_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_NAME")) {
						key.setd_NEW_CUST_NAME(msgKey.getKeyValue("d_NEW_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_NAME_CHANGE")) {
						key.setd_CUST_NAME_CHANGE(msgKey.getKeyValue("d_CUST_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_ANAME")) {
						key.setd_OLD_CUST_ANAME(msgKey.getKeyValue("d_OLD_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_ANAME")) {
						key.setd_NEW_CUST_ANAME(msgKey.getKeyValue("d_NEW_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_ANAME_CHANGE")) {
						key.setd_CUST_ANAME_CHANGE(msgKey.getKeyValue("d_CUST_ANAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_KNAME")) {
						key.setd_OLD_CUST_KNAME(msgKey.getKeyValue("d_OLD_CUST_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_KNAME")) {
						key.setd_NEW_CUST_KNAME(msgKey.getKeyValue("d_NEW_CUST_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_KNAME_CHANGE")) {
						key.setd_CUST_KNAME_CHANGE(msgKey.getKeyValue("d_CUST_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_INSPC_ACPT_TYP")) {
						key.setd_OLD_INSPC_ACPT_TYP(msgKey.getKeyValue("d_OLD_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_INSPC_ACPT_TYP")) {
						key.setd_NEW_INSPC_ACPT_TYP(msgKey.getKeyValue("d_NEW_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_INSPC_ACPT_TYP_CHANGE")) {
						key.setd_INSPC_ACPT_TYP_CHANGE(msgKey.getKeyValue("d_INSPC_ACPT_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_TAX_APPLY_TYP_CHANGE")) {
						key.setd_TAX_APPLY_TYP_CHANGE(msgKey.getKeyValue("d_TAX_APPLY_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EDI_CUST_VEND_CD")) {
						key.setd_OLD_EDI_CUST_VEND_CD(msgKey.getKeyValue("d_OLD_EDI_CUST_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EDI_CUST_VEND_CD")) {
						key.setd_NEW_EDI_CUST_VEND_CD(msgKey.getKeyValue("d_NEW_EDI_CUST_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_EDI_CUST_VEND_CD_CHANGE")) {
						key.setd_EDI_CUST_VEND_CD_CHANGE(msgKey.getKeyValue("d_EDI_CUST_VEND_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PARTIAL_SHIP_INST_FLG")) {
						key.setd_OLD_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("d_OLD_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PARTIAL_SHIP_INST_FLG")) {
						key.setd_NEW_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("d_NEW_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_PARTIAL_SHIP_INST_FLG_CHANGE")) {
						key.setd_PARTIAL_SHIP_INST_FLG_CHANGE(msgKey.getKeyValue("d_PARTIAL_SHIP_INST_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_CD")) {
						key.setd_OLD_DLV_LOC_CD(msgKey.getKeyValue("d_OLD_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_CD")) {
						key.setd_NEW_DLV_LOC_CD(msgKey.getKeyValue("d_NEW_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_LOC_CD_CHANGE")) {
						key.setd_DLV_LOC_CD_CHANGE(msgKey.getKeyValue("d_DLV_LOC_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_NAME")) {
						key.setd_OLD_DLV_LOC_NAME(msgKey.getKeyValue("d_OLD_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_NAME")) {
						key.setd_NEW_DLV_LOC_NAME(msgKey.getKeyValue("d_NEW_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_LOC_NAME_CHANGE")) {
						key.setd_DLV_LOC_NAME_CHANGE(msgKey.getKeyValue("d_DLV_LOC_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_KNAME")) {
						key.setd_OLD_DLV_LOC_KNAME(msgKey.getKeyValue("d_OLD_DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_KNAME")) {
						key.setd_NEW_DLV_LOC_KNAME(msgKey.getKeyValue("d_NEW_DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_LOC_KNAME_CHANGE")) {
						key.setd_DLV_LOC_KNAME_CHANGE(msgKey.getKeyValue("d_DLV_LOC_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_ENAME")) {
						key.setd_OLD_DLV_LOC_ENAME(msgKey.getKeyValue("d_OLD_DLV_LOC_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_ENAME")) {
						key.setd_NEW_DLV_LOC_ENAME(msgKey.getKeyValue("d_NEW_DLV_LOC_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_LOC_ENAME_CHANGE")) {
						key.setd_DLV_LOC_ENAME_CHANGE(msgKey.getKeyValue("d_DLV_LOC_ENAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TRANSPORT_CD")) {
						key.setd_OLD_TRANSPORT_CD(msgKey.getKeyValue("d_OLD_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TRANSPORT_CD")) {
						key.setd_NEW_TRANSPORT_CD(msgKey.getKeyValue("d_NEW_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_TRANSPORT_CD_CHANGE")) {
						key.setd_TRANSPORT_CD_CHANGE(msgKey.getKeyValue("d_TRANSPORT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DEPO_WH_CD")) {
						key.setd_OLD_DEPO_WH_CD(msgKey.getKeyValue("d_OLD_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DEPO_WH_CD")) {
						key.setd_NEW_DEPO_WH_CD(msgKey.getKeyValue("d_NEW_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_DEPO_WH_CD_CHANGE")) {
						key.setd_DEPO_WH_CD_CHANGE(msgKey.getKeyValue("d_DEPO_WH_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_WH_CD")) {
						key.setd_OLD_SHIP_WH_CD(msgKey.getKeyValue("d_OLD_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_WH_CD")) {
						key.setd_NEW_SHIP_WH_CD(msgKey.getKeyValue("d_NEW_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_WH_CD_CHANGE")) {
						key.setd_SHIP_WH_CD_CHANGE(msgKey.getKeyValue("d_SHIP_WH_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TRANSPORT_LT")) {
						key.setd_OLD_TRANSPORT_LT(msgKey.getKeyValue("d_OLD_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TRANSPORT_LT")) {
						key.setd_NEW_TRANSPORT_LT(msgKey.getKeyValue("d_NEW_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_TRANSPORT_LT_CHANGE")) {
						key.setd_TRANSPORT_LT_CHANGE(msgKey.getKeyValue("d_TRANSPORT_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EXCH_RESERVE_CD")) {
						key.setd_OLD_EXCH_RESERVE_CD(msgKey.getKeyValue("d_OLD_EXCH_RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EXCH_RESERVE_CD")) {
						key.setd_NEW_EXCH_RESERVE_CD(msgKey.getKeyValue("d_NEW_EXCH_RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_EXCH_RESERVE_CD_CHANGE")) {
						key.setd_EXCH_RESERVE_CD_CHANGE(msgKey.getKeyValue("d_EXCH_RESERVE_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EXCH_START_DATE")) {
						key.setd_OLD_EXCH_START_DATE(msgKey.getKeyValue("d_OLD_EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EXCH_START_DATE")) {
						key.setd_NEW_EXCH_START_DATE(msgKey.getKeyValue("d_NEW_EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_EXCH_START_DATE_CHANGE")) {
						key.setd_EXCH_START_DATE_CHANGE(msgKey.getKeyValue("d_EXCH_START_DATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EXCH_RATE")) {
						key.setd_OLD_EXCH_RATE(msgKey.getKeyValue("d_OLD_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EXCH_RATE")) {
						key.setd_NEW_EXCH_RATE(msgKey.getKeyValue("d_NEW_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("d_EXCH_RATE_CHANGE")) {
						key.setd_EXCH_RATE_CHANGE(msgKey.getKeyValue("d_EXCH_RATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BILL_ADDRESSEE_CD")) {
						key.setd_OLD_BILL_ADDRESSEE_CD(msgKey.getKeyValue("d_OLD_BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BILL_ADDRESSEE_CD")) {
						key.setd_NEW_BILL_ADDRESSEE_CD(msgKey.getKeyValue("d_NEW_BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_BILL_ADDRESSEE_CD_CHANGE")) {
						key.setd_BILL_ADDRESSEE_CD_CHANGE(msgKey.getKeyValue("d_BILL_ADDRESSEE_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_FNAME")) {
						key.setd_OLD_CUST_FNAME(msgKey.getKeyValue("d_OLD_CUST_FNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_FNAME")) {
						key.setd_NEW_CUST_FNAME(msgKey.getKeyValue("d_NEW_CUST_FNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_FNAME_CHANGE")) {
						key.setd_CUST_FNAME_CHANGE(msgKey.getKeyValue("d_CUST_FNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_ENAME")) {
						key.setd_OLD_CUST_ENAME(msgKey.getKeyValue("d_OLD_CUST_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_ENAME")) {
						key.setd_NEW_CUST_ENAME(msgKey.getKeyValue("d_NEW_CUST_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_ENAME_CHANGE")) {
						key.setd_CUST_ENAME_CHANGE(msgKey.getKeyValue("d_CUST_ENAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OWNER_EXECUTIVE")) {
						key.setd_OLD_OWNER_EXECUTIVE(msgKey.getKeyValue("d_OLD_OWNER_EXECUTIVE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OWNER_EXECUTIVE")) {
						key.setd_NEW_OWNER_EXECUTIVE(msgKey.getKeyValue("d_NEW_OWNER_EXECUTIVE"));
					}
					if(msgKeyType.containsKeyColumn("d_OWNER_EXECUTIVE_CHANGE")) {
						key.setd_OWNER_EXECUTIVE_CHANGE(msgKey.getKeyValue("d_OWNER_EXECUTIVE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OWNER_NAME")) {
						key.setd_OLD_OWNER_NAME(msgKey.getKeyValue("d_OLD_OWNER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OWNER_NAME")) {
						key.setd_NEW_OWNER_NAME(msgKey.getKeyValue("d_NEW_OWNER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_OWNER_NAME_CHANGE")) {
						key.setd_OWNER_NAME_CHANGE(msgKey.getKeyValue("d_OWNER_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_CD")) {
						key.setd_OLD_COMPANY_CD(msgKey.getKeyValue("d_OLD_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_CD")) {
						key.setd_NEW_COMPANY_CD(msgKey.getKeyValue("d_NEW_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_COMPANY_CD_CHANGE")) {
						key.setd_COMPANY_CD_CHANGE(msgKey.getKeyValue("d_COMPANY_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_FNAME")) {
						key.setd_OLD_COMPANY_FNAME(msgKey.getKeyValue("d_OLD_COMPANY_FNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_FNAME")) {
						key.setd_NEW_COMPANY_FNAME(msgKey.getKeyValue("d_NEW_COMPANY_FNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_COMPANY_FNAME_CHANGE")) {
						key.setd_COMPANY_FNAME_CHANGE(msgKey.getKeyValue("d_COMPANY_FNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_NAME")) {
						key.setd_OLD_COMPANY_NAME(msgKey.getKeyValue("d_OLD_COMPANY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_NAME")) {
						key.setd_NEW_COMPANY_NAME(msgKey.getKeyValue("d_NEW_COMPANY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_COMPANY_NAME_CHANGE")) {
						key.setd_COMPANY_NAME_CHANGE(msgKey.getKeyValue("d_COMPANY_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_KNAME")) {
						key.setd_OLD_COMPANY_KNAME(msgKey.getKeyValue("d_OLD_COMPANY_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_KNAME")) {
						key.setd_NEW_COMPANY_KNAME(msgKey.getKeyValue("d_NEW_COMPANY_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_COMPANY_KNAME_CHANGE")) {
						key.setd_COMPANY_KNAME_CHANGE(msgKey.getKeyValue("d_COMPANY_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_COMPANY_ENAME")) {
						key.setd_OLD_COMPANY_ENAME(msgKey.getKeyValue("d_OLD_COMPANY_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_COMPANY_ENAME")) {
						key.setd_NEW_COMPANY_ENAME(msgKey.getKeyValue("d_NEW_COMPANY_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_COMPANY_ENAME_CHANGE")) {
						key.setd_COMPANY_ENAME_CHANGE(msgKey.getKeyValue("d_COMPANY_ENAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_USER_TYP")) {
						key.setd_OLD_USER_TYP(msgKey.getKeyValue("d_OLD_USER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_USER_TYP")) {
						key.setd_NEW_USER_TYP(msgKey.getKeyValue("d_NEW_USER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_USER_TYP_CHANGE")) {
						key.setd_USER_TYP_CHANGE(msgKey.getKeyValue("d_USER_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_CD")) {
						key.setd_OLD_BANK_CD(msgKey.getKeyValue("d_OLD_BANK_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_CD")) {
						key.setd_NEW_BANK_CD(msgKey.getKeyValue("d_NEW_BANK_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_CD_CHANGE")) {
						key.setd_BANK_CD_CHANGE(msgKey.getKeyValue("d_BANK_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_NAME")) {
						key.setd_OLD_BANK_NAME(msgKey.getKeyValue("d_OLD_BANK_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_NAME")) {
						key.setd_NEW_BANK_NAME(msgKey.getKeyValue("d_NEW_BANK_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_NAME_CHANGE")) {
						key.setd_BANK_NAME_CHANGE(msgKey.getKeyValue("d_BANK_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_ANAME")) {
						key.setd_OLD_BANK_ANAME(msgKey.getKeyValue("d_OLD_BANK_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_ANAME")) {
						key.setd_NEW_BANK_ANAME(msgKey.getKeyValue("d_NEW_BANK_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_ANAME_CHANGE")) {
						key.setd_BANK_ANAME_CHANGE(msgKey.getKeyValue("d_BANK_ANAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_KNAME")) {
						key.setd_OLD_BANK_KNAME(msgKey.getKeyValue("d_OLD_BANK_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_KNAME")) {
						key.setd_NEW_BANK_KNAME(msgKey.getKeyValue("d_NEW_BANK_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_KNAME_CHANGE")) {
						key.setd_BANK_KNAME_CHANGE(msgKey.getKeyValue("d_BANK_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_ENAME")) {
						key.setd_OLD_BANK_ENAME(msgKey.getKeyValue("d_OLD_BANK_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_ENAME")) {
						key.setd_NEW_BANK_ENAME(msgKey.getKeyValue("d_NEW_BANK_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_ENAME_CHANGE")) {
						key.setd_BANK_ENAME_CHANGE(msgKey.getKeyValue("d_BANK_ENAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_FB_NAME")) {
						key.setd_OLD_BANK_FB_NAME(msgKey.getKeyValue("d_OLD_BANK_FB_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_FB_NAME")) {
						key.setd_NEW_BANK_FB_NAME(msgKey.getKeyValue("d_NEW_BANK_FB_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_FB_NAME_CHANGE")) {
						key.setd_BANK_FB_NAME_CHANGE(msgKey.getKeyValue("d_BANK_FB_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_CD")) {
						key.setd_OLD_BANK_BR_CD(msgKey.getKeyValue("d_OLD_BANK_BR_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_CD")) {
						key.setd_NEW_BANK_BR_CD(msgKey.getKeyValue("d_NEW_BANK_BR_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_CD_CHANGE")) {
						key.setd_BANK_BR_CD_CHANGE(msgKey.getKeyValue("d_BANK_BR_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_TYP_CD")) {
						key.setd_OLD_B_ACCT_TYP_CD(msgKey.getKeyValue("d_OLD_B_ACCT_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_TYP_CD")) {
						key.setd_NEW_B_ACCT_TYP_CD(msgKey.getKeyValue("d_NEW_B_ACCT_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_B_ACCT_TYP_CD_CHANGE")) {
						key.setd_B_ACCT_TYP_CD_CHANGE(msgKey.getKeyValue("d_B_ACCT_TYP_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_NAME")) {
						key.setd_OLD_B_ACCT_NAME(msgKey.getKeyValue("d_OLD_B_ACCT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_NAME")) {
						key.setd_NEW_B_ACCT_NAME(msgKey.getKeyValue("d_NEW_B_ACCT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_B_ACCT_NAME_CHANGE")) {
						key.setd_B_ACCT_NAME_CHANGE(msgKey.getKeyValue("d_B_ACCT_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_FB_DATA_TYP")) {
						key.setd_OLD_FB_DATA_TYP(msgKey.getKeyValue("d_OLD_FB_DATA_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_FB_DATA_TYP")) {
						key.setd_NEW_FB_DATA_TYP(msgKey.getKeyValue("d_NEW_FB_DATA_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_FB_DATA_TYP_CHANGE")) {
						key.setd_FB_DATA_TYP_CHANGE(msgKey.getKeyValue("d_FB_DATA_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TRF_REQUEST_CD")) {
						key.setd_OLD_TRF_REQUEST_CD(msgKey.getKeyValue("d_OLD_TRF_REQUEST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TRF_REQUEST_CD")) {
						key.setd_NEW_TRF_REQUEST_CD(msgKey.getKeyValue("d_NEW_TRF_REQUEST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_TRF_REQUEST_CD_CHANGE")) {
						key.setd_TRF_REQUEST_CD_CHANGE(msgKey.getKeyValue("d_TRF_REQUEST_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_FB_NAME")) {
						key.setd_OLD_B_ACCT_FB_NAME(msgKey.getKeyValue("d_OLD_B_ACCT_FB_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_FB_NAME")) {
						key.setd_NEW_B_ACCT_FB_NAME(msgKey.getKeyValue("d_NEW_B_ACCT_FB_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_B_ACCT_FB_NAME_CHANGE")) {
						key.setd_B_ACCT_FB_NAME_CHANGE(msgKey.getKeyValue("d_B_ACCT_FB_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACCT_CD")) {
						key.setd_OLD_ACCT_CD(msgKey.getKeyValue("d_OLD_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACCT_CD")) {
						key.setd_NEW_ACCT_CD(msgKey.getKeyValue("d_NEW_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_ACCT_CD_CHANGE")) {
						key.setd_ACCT_CD_CHANGE(msgKey.getKeyValue("d_ACCT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PRIMITIVE_TYP")) {
						key.setd_OLD_PRIMITIVE_TYP(msgKey.getKeyValue("d_OLD_PRIMITIVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PRIMITIVE_TYP")) {
						key.setd_NEW_PRIMITIVE_TYP(msgKey.getKeyValue("d_NEW_PRIMITIVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_PRIMITIVE_TYP_CHANGE")) {
						key.setd_PRIMITIVE_TYP_CHANGE(msgKey.getKeyValue("d_PRIMITIVE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACCT_NAME")) {
						key.setd_OLD_ACCT_NAME(msgKey.getKeyValue("d_OLD_ACCT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACCT_NAME")) {
						key.setd_NEW_ACCT_NAME(msgKey.getKeyValue("d_NEW_ACCT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_ACCT_NAME_CHANGE")) {
						key.setd_ACCT_NAME_CHANGE(msgKey.getKeyValue("d_ACCT_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACCT_ANAME")) {
						key.setd_OLD_ACCT_ANAME(msgKey.getKeyValue("d_OLD_ACCT_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACCT_ANAME")) {
						key.setd_NEW_ACCT_ANAME(msgKey.getKeyValue("d_NEW_ACCT_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_ACCT_ANAME_CHANGE")) {
						key.setd_ACCT_ANAME_CHANGE(msgKey.getKeyValue("d_ACCT_ANAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACCT_KNAME")) {
						key.setd_OLD_ACCT_KNAME(msgKey.getKeyValue("d_OLD_ACCT_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACCT_KNAME")) {
						key.setd_NEW_ACCT_KNAME(msgKey.getKeyValue("d_NEW_ACCT_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_ACCT_KNAME_CHANGE")) {
						key.setd_ACCT_KNAME_CHANGE(msgKey.getKeyValue("d_ACCT_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DR_CR_TYP")) {
						key.setd_OLD_DR_CR_TYP(msgKey.getKeyValue("d_OLD_DR_CR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DR_CR_TYP")) {
						key.setd_NEW_DR_CR_TYP(msgKey.getKeyValue("d_NEW_DR_CR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_DR_CR_TYP_CHANGE")) {
						key.setd_DR_CR_TYP_CHANGE(msgKey.getKeyValue("d_DR_CR_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACCT_TYP")) {
						key.setd_OLD_ACCT_TYP(msgKey.getKeyValue("d_OLD_ACCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACCT_TYP")) {
						key.setd_NEW_ACCT_TYP(msgKey.getKeyValue("d_NEW_ACCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_ACCT_TYP_CHANGE")) {
						key.setd_ACCT_TYP_CHANGE(msgKey.getKeyValue("d_ACCT_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SUB_ACCT_TYP_DEFAULT")) {
						key.setd_OLD_SUB_ACCT_TYP_DEFAULT(msgKey.getKeyValue("d_OLD_SUB_ACCT_TYP_DEFAULT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SUB_ACCT_TYP_DEFAULT")) {
						key.setd_NEW_SUB_ACCT_TYP_DEFAULT(msgKey.getKeyValue("d_NEW_SUB_ACCT_TYP_DEFAULT"));
					}
					if(msgKeyType.containsKeyColumn("d_SUB_ACCT_TYP_DEFAULT_CHANGE")) {
						key.setd_SUB_ACCT_TYP_DEFAULT_CHANGE(msgKey.getKeyValue("d_SUB_ACCT_TYP_DEFAULT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TRF_TYP")) {
						key.setd_OLD_TRF_TYP(msgKey.getKeyValue("d_OLD_TRF_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TRF_TYP")) {
						key.setd_NEW_TRF_TYP(msgKey.getKeyValue("d_NEW_TRF_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_TRF_TYP_CHANGE")) {
						key.setd_TRF_TYP_CHANGE(msgKey.getKeyValue("d_TRF_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CONTENTS_TYP")) {
						key.setd_OLD_CONTENTS_TYP(msgKey.getKeyValue("d_OLD_CONTENTS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CONTENTS_TYP")) {
						key.setd_NEW_CONTENTS_TYP(msgKey.getKeyValue("d_NEW_CONTENTS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_CONTENTS_TYP_CHANGE")) {
						key.setd_CONTENTS_TYP_CHANGE(msgKey.getKeyValue("d_CONTENTS_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_INFO_TYP")) {
						key.setd_OLD_INFO_TYP(msgKey.getKeyValue("d_OLD_INFO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_INFO_TYP")) {
						key.setd_NEW_INFO_TYP(msgKey.getKeyValue("d_NEW_INFO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_INFO_TYP_CHANGE")) {
						key.setd_INFO_TYP_CHANGE(msgKey.getKeyValue("d_INFO_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VALID_START_DATE")) {
						key.setd_OLD_VALID_START_DATE(msgKey.getKeyValue("d_OLD_VALID_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VALID_START_DATE")) {
						key.setd_NEW_VALID_START_DATE(msgKey.getKeyValue("d_NEW_VALID_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_VALID_START_DATE_CHANGE")) {
						key.setd_VALID_START_DATE_CHANGE(msgKey.getKeyValue("d_VALID_START_DATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VALID_END_DATE")) {
						key.setd_OLD_VALID_END_DATE(msgKey.getKeyValue("d_OLD_VALID_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VALID_END_DATE")) {
						key.setd_NEW_VALID_END_DATE(msgKey.getKeyValue("d_NEW_VALID_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_VALID_END_DATE_CHANGE")) {
						key.setd_VALID_END_DATE_CHANGE(msgKey.getKeyValue("d_VALID_END_DATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MIN_AMOUNT")) {
						key.setd_OLD_MIN_AMOUNT(msgKey.getKeyValue("d_OLD_MIN_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MIN_AMOUNT")) {
						key.setd_NEW_MIN_AMOUNT(msgKey.getKeyValue("d_NEW_MIN_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MAX_AMOUNT")) {
						key.setd_OLD_MAX_AMOUNT(msgKey.getKeyValue("d_OLD_MAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MAX_AMOUNT")) {
						key.setd_NEW_MAX_AMOUNT(msgKey.getKeyValue("d_NEW_MAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_MAX_AMOUNT_CHANGE")) {
						key.setd_MAX_AMOUNT_CHANGE(msgKey.getKeyValue("d_MAX_AMOUNT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TRF_FEE")) {
						key.setd_OLD_TRF_FEE(msgKey.getKeyValue("d_OLD_TRF_FEE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TRF_FEE")) {
						key.setd_NEW_TRF_FEE(msgKey.getKeyValue("d_NEW_TRF_FEE"));
					}
					if(msgKeyType.containsKeyColumn("d_TRF_FEE_CHANGE")) {
						key.setd_TRF_FEE_CHANGE(msgKey.getKeyValue("d_TRF_FEE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_VEND_KNAME")) {
						key.setd_OLD_VEND_KNAME(msgKey.getKeyValue("d_OLD_VEND_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_VEND_KNAME")) {
						key.setd_NEW_VEND_KNAME(msgKey.getKeyValue("d_NEW_VEND_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_VEND_KNAME_CHANGE")) {
						key.setd_VEND_KNAME_CHANGE(msgKey.getKeyValue("d_VEND_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SUB_ACCT_CD")) {
						key.setd_OLD_SUB_ACCT_CD(msgKey.getKeyValue("d_OLD_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SUB_ACCT_CD")) {
						key.setd_NEW_SUB_ACCT_CD(msgKey.getKeyValue("d_NEW_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_SUB_ACCT_CD_CHANGE")) {
						key.setd_SUB_ACCT_CD_CHANGE(msgKey.getKeyValue("d_SUB_ACCT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_PATTERN_CD")) {
						key.setd_OLD_PAY_PATTERN_CD(msgKey.getKeyValue("d_OLD_PAY_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_PATTERN_CD")) {
						key.setd_NEW_PAY_PATTERN_CD(msgKey.getKeyValue("d_NEW_PAY_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_PATTERN_CD_CHANGE")) {
						key.setd_PAY_PATTERN_CD_CHANGE(msgKey.getKeyValue("d_PAY_PATTERN_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_ODR_TYP")) {
						key.setd_OLD_PAY_ODR_TYP(msgKey.getKeyValue("d_OLD_PAY_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_ODR_TYP")) {
						key.setd_NEW_PAY_ODR_TYP(msgKey.getKeyValue("d_NEW_PAY_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_ODR_TYP_CHANGE")) {
						key.setd_PAY_ODR_TYP_CHANGE(msgKey.getKeyValue("d_PAY_ODR_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_CD_1")) {
						key.setd_OLD_PAY_METHOD_CD_1(msgKey.getKeyValue("d_OLD_PAY_METHOD_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_CD_1")) {
						key.setd_NEW_PAY_METHOD_CD_1(msgKey.getKeyValue("d_NEW_PAY_METHOD_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CD_1_CHANGE")) {
						key.setd_PAY_METHOD_CD_1_CHANGE(msgKey.getKeyValue("d_PAY_METHOD_CD_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_CD_2")) {
						key.setd_OLD_PAY_METHOD_CD_2(msgKey.getKeyValue("d_OLD_PAY_METHOD_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_CD_2")) {
						key.setd_NEW_PAY_METHOD_CD_2(msgKey.getKeyValue("d_NEW_PAY_METHOD_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CD_2_CHANGE")) {
						key.setd_PAY_METHOD_CD_2_CHANGE(msgKey.getKeyValue("d_PAY_METHOD_CD_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_CD")) {
						key.setd_OLD_PAY_METHOD_CD(msgKey.getKeyValue("d_OLD_PAY_METHOD_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_CD")) {
						key.setd_NEW_PAY_METHOD_CD(msgKey.getKeyValue("d_NEW_PAY_METHOD_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CD_CHANGE")) {
						key.setd_PAY_METHOD_CD_CHANGE(msgKey.getKeyValue("d_PAY_METHOD_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD")) {
						key.setd_OLD_PAY_METHOD(msgKey.getKeyValue("d_OLD_PAY_METHOD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD")) {
						key.setd_NEW_PAY_METHOD(msgKey.getKeyValue("d_NEW_PAY_METHOD"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_METHOD_CHANGE")) {
						key.setd_PAY_METHOD_CHANGE(msgKey.getKeyValue("d_PAY_METHOD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_TARGET_TYP")) {
						key.setd_OLD_PAY_TARGET_TYP(msgKey.getKeyValue("d_OLD_PAY_TARGET_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_TARGET_TYP")) {
						key.setd_NEW_PAY_TARGET_TYP(msgKey.getKeyValue("d_NEW_PAY_TARGET_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_TARGET_TYP_CHANGE")) {
						key.setd_PAY_TARGET_TYP_CHANGE(msgKey.getKeyValue("d_PAY_TARGET_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SLIP_CTRL_ORG_CD")) {
						key.setd_OLD_SLIP_CTRL_ORG_CD(msgKey.getKeyValue("d_OLD_SLIP_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SLIP_CTRL_ORG_CD")) {
						key.setd_NEW_SLIP_CTRL_ORG_CD(msgKey.getKeyValue("d_NEW_SLIP_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_SLIP_CTRL_ORG_CD_CHANGE")) {
						key.setd_SLIP_CTRL_ORG_CD_CHANGE(msgKey.getKeyValue("d_SLIP_CTRL_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CLOSING_CTRL_ORG_CD")) {
						key.setd_OLD_CLOSING_CTRL_ORG_CD(msgKey.getKeyValue("d_OLD_CLOSING_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CLOSING_CTRL_ORG_CD")) {
						key.setd_NEW_CLOSING_CTRL_ORG_CD(msgKey.getKeyValue("d_NEW_CLOSING_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CLOSING_CTRL_ORG_CD_CHANGE")) {
						key.setd_CLOSING_CTRL_ORG_CD_CHANGE(msgKey.getKeyValue("d_CLOSING_CTRL_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_CALC_CTRL_ORG_CD")) {
						key.setd_OLD_PAY_CALC_CTRL_ORG_CD(msgKey.getKeyValue("d_OLD_PAY_CALC_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_CALC_CTRL_ORG_CD")) {
						key.setd_NEW_PAY_CALC_CTRL_ORG_CD(msgKey.getKeyValue("d_NEW_PAY_CALC_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_CALC_CTRL_ORG_CD_CHANGE")) {
						key.setd_PAY_CALC_CTRL_ORG_CD_CHANGE(msgKey.getKeyValue("d_PAY_CALC_CTRL_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_FIX_CTRL_ORG_CD")) {
						key.setd_OLD_PAY_FIX_CTRL_ORG_CD(msgKey.getKeyValue("d_OLD_PAY_FIX_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_FIX_CTRL_ORG_CD")) {
						key.setd_NEW_PAY_FIX_CTRL_ORG_CD(msgKey.getKeyValue("d_NEW_PAY_FIX_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_FIX_CTRL_ORG_CD_CHANGE")) {
						key.setd_PAY_FIX_CTRL_ORG_CD_CHANGE(msgKey.getKeyValue("d_PAY_FIX_CTRL_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_STL_COND_CD")) {
						key.setd_OLD_STL_COND_CD(msgKey.getKeyValue("d_OLD_STL_COND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_STL_COND_CD")) {
						key.setd_NEW_STL_COND_CD(msgKey.getKeyValue("d_NEW_STL_COND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_STL_COND_CD_CHANGE")) {
						key.setd_STL_COND_CD_CHANGE(msgKey.getKeyValue("d_STL_COND_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CLAIM_ORG_CD")) {
						key.setd_OLD_CLAIM_ORG_CD(msgKey.getKeyValue("d_OLD_CLAIM_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CLAIM_ORG_CD")) {
						key.setd_NEW_CLAIM_ORG_CD(msgKey.getKeyValue("d_NEW_CLAIM_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CLAIM_ORG_CD_CHANGE")) {
						key.setd_CLAIM_ORG_CD_CHANGE(msgKey.getKeyValue("d_CLAIM_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EDI_TRN_BILL_TYP")) {
						key.setd_OLD_EDI_TRN_BILL_TYP(msgKey.getKeyValue("d_OLD_EDI_TRN_BILL_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EDI_TRN_BILL_TYP")) {
						key.setd_NEW_EDI_TRN_BILL_TYP(msgKey.getKeyValue("d_NEW_EDI_TRN_BILL_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_EDI_TRN_BILL_TYP_CHANGE")) {
						key.setd_EDI_TRN_BILL_TYP_CHANGE(msgKey.getKeyValue("d_EDI_TRN_BILL_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EDI_TRN_RM_TYP")) {
						key.setd_OLD_EDI_TRN_RM_TYP(msgKey.getKeyValue("d_OLD_EDI_TRN_RM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EDI_TRN_RM_TYP")) {
						key.setd_NEW_EDI_TRN_RM_TYP(msgKey.getKeyValue("d_NEW_EDI_TRN_RM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_EDI_TRN_RM_TYP_CHANGE")) {
						key.setd_EDI_TRN_RM_TYP_CHANGE(msgKey.getKeyValue("d_EDI_TRN_RM_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BILL_BALANCE_CTRL_FLG")) {
						key.setd_OLD_BILL_BALANCE_CTRL_FLG(msgKey.getKeyValue("d_OLD_BILL_BALANCE_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BILL_BALANCE_CTRL_FLG")) {
						key.setd_NEW_BILL_BALANCE_CTRL_FLG(msgKey.getKeyValue("d_NEW_BILL_BALANCE_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_BILL_BALANCE_CTRL_FLG_CHANGE")) {
						key.setd_BILL_BALANCE_CTRL_FLG_CHANGE(msgKey.getKeyValue("d_BILL_BALANCE_CTRL_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_AR_BALANCE_CTRL_FLG")) {
						key.setd_OLD_AR_BALANCE_CTRL_FLG(msgKey.getKeyValue("d_OLD_AR_BALANCE_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_AR_BALANCE_CTRL_FLG")) {
						key.setd_NEW_AR_BALANCE_CTRL_FLG(msgKey.getKeyValue("d_NEW_AR_BALANCE_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_AR_BALANCE_CTRL_FLG_CHANGE")) {
						key.setd_AR_BALANCE_CTRL_FLG_CHANGE(msgKey.getKeyValue("d_AR_BALANCE_CTRL_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_COLLECTION_STD_AMOUNT")) {
						key.setd_OLD_COLLECTION_STD_AMOUNT(msgKey.getKeyValue("d_OLD_COLLECTION_STD_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_COLLECTION_STD_AMOUNT")) {
						key.setd_NEW_COLLECTION_STD_AMOUNT(msgKey.getKeyValue("d_NEW_COLLECTION_STD_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_COLLECTION_STD_AMOUNT_CHANGE")) {
						key.setd_COLLECTION_STD_AMOUNT_CHANGE(msgKey.getKeyValue("d_COLLECTION_STD_AMOUNT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_RM_OFFSET_TYP")) {
						key.setd_OLD_RM_OFFSET_TYP(msgKey.getKeyValue("d_OLD_RM_OFFSET_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_RM_OFFSET_TYP")) {
						key.setd_NEW_RM_OFFSET_TYP(msgKey.getKeyValue("d_NEW_RM_OFFSET_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_RM_OFFSET_TYP_CHANGE")) {
						key.setd_RM_OFFSET_TYP_CHANGE(msgKey.getKeyValue("d_RM_OFFSET_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_LINE_CUST_CD")) {
						key.setd_OLD_LINE_CUST_CD(msgKey.getKeyValue("d_OLD_LINE_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_LINE_CUST_CD")) {
						key.setd_NEW_LINE_CUST_CD(msgKey.getKeyValue("d_NEW_LINE_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_LINE_CUST_CD_CHANGE")) {
						key.setd_LINE_CUST_CD_CHANGE(msgKey.getKeyValue("d_LINE_CUST_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_CTRL_CD")) {
						key.setd_OLD_B_ACCT_CTRL_CD(msgKey.getKeyValue("d_OLD_B_ACCT_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_CTRL_CD")) {
						key.setd_NEW_B_ACCT_CTRL_CD(msgKey.getKeyValue("d_NEW_B_ACCT_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_B_ACCT_CTRL_CD_CHANGE")) {
						key.setd_B_ACCT_CTRL_CD_CHANGE(msgKey.getKeyValue("d_B_ACCT_CTRL_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_MNG_NAME")) {
						key.setd_OLD_B_ACCT_MNG_NAME(msgKey.getKeyValue("d_OLD_B_ACCT_MNG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_MNG_NAME")) {
						key.setd_NEW_B_ACCT_MNG_NAME(msgKey.getKeyValue("d_NEW_B_ACCT_MNG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_B_ACCT_MNG_NAME_CHANGE")) {
						key.setd_B_ACCT_MNG_NAME_CHANGE(msgKey.getKeyValue("d_B_ACCT_MNG_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_B_ACCT_NO")) {
						key.setd_OLD_B_ACCT_NO(msgKey.getKeyValue("d_OLD_B_ACCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_B_ACCT_NO")) {
						key.setd_NEW_B_ACCT_NO(msgKey.getKeyValue("d_NEW_B_ACCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_B_ACCT_NO_CHANGE")) {
						key.setd_B_ACCT_NO_CHANGE(msgKey.getKeyValue("d_B_ACCT_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_INTERNAL_TRN_TYP")) {
						key.setd_OLD_INTERNAL_TRN_TYP(msgKey.getKeyValue("d_OLD_INTERNAL_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_INTERNAL_TRN_TYP")) {
						key.setd_NEW_INTERNAL_TRN_TYP(msgKey.getKeyValue("d_NEW_INTERNAL_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_INTERNAL_TRN_TYP_CHANGE")) {
						key.setd_INTERNAL_TRN_TYP_CHANGE(msgKey.getKeyValue("d_INTERNAL_TRN_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_MIN_AMOUNT_CHANGE")) {
						key.setd_MIN_AMOUNT_CHANGE(msgKey.getKeyValue("d_MIN_AMOUNT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ORG_CD")) {
						key.setd_OLD_ORG_CD(msgKey.getKeyValue("d_OLD_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ORG_CD")) {
						key.setd_NEW_ORG_CD(msgKey.getKeyValue("d_NEW_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_ORG_CD_CHANGE")) {
						key.setd_ORG_CD_CHANGE(msgKey.getKeyValue("d_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_PATTERN_NAME")) {
						key.setd_OLD_PAY_PATTERN_NAME(msgKey.getKeyValue("d_OLD_PAY_PATTERN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_PATTERN_NAME")) {
						key.setd_NEW_PAY_PATTERN_NAME(msgKey.getKeyValue("d_NEW_PAY_PATTERN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_PATTERN_NAME_CHANGE")) {
						key.setd_PAY_PATTERN_NAME_CHANGE(msgKey.getKeyValue("d_PAY_PATTERN_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_STD_AMOUNT")) {
						key.setd_OLD_STD_AMOUNT(msgKey.getKeyValue("d_OLD_STD_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_STD_AMOUNT")) {
						key.setd_NEW_STD_AMOUNT(msgKey.getKeyValue("d_NEW_STD_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("d_STD_AMOUNT_CHANGE")) {
						key.setd_STD_AMOUNT_CHANGE(msgKey.getKeyValue("d_STD_AMOUNT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_RATIO_1")) {
						key.setd_OLD_RATIO_1(msgKey.getKeyValue("d_OLD_RATIO_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_RATIO_1")) {
						key.setd_NEW_RATIO_1(msgKey.getKeyValue("d_NEW_RATIO_1"));
					}
					if(msgKeyType.containsKeyColumn("d_RATIO_1_CHANGE")) {
						key.setd_RATIO_1_CHANGE(msgKey.getKeyValue("d_RATIO_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_RATIO_2")) {
						key.setd_OLD_RATIO_2(msgKey.getKeyValue("d_OLD_RATIO_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_RATIO_2")) {
						key.setd_NEW_RATIO_2(msgKey.getKeyValue("d_NEW_RATIO_2"));
					}
					if(msgKeyType.containsKeyColumn("d_RATIO_2_CHANGE")) {
						key.setd_RATIO_2_CHANGE(msgKey.getKeyValue("d_RATIO_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PATTERN_CD")) {
						key.setd_OLD_PATTERN_CD(msgKey.getKeyValue("d_OLD_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PATTERN_CD")) {
						key.setd_NEW_PATTERN_CD(msgKey.getKeyValue("d_NEW_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_PATTERN_CD_CHANGE")) {
						key.setd_PATTERN_CD_CHANGE(msgKey.getKeyValue("d_PATTERN_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CLASS_1")) {
						key.setd_OLD_CLASS_1(msgKey.getKeyValue("d_OLD_CLASS_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CLASS_1")) {
						key.setd_NEW_CLASS_1(msgKey.getKeyValue("d_NEW_CLASS_1"));
					}
					if(msgKeyType.containsKeyColumn("d_CLASS_1_CHANGE")) {
						key.setd_CLASS_1_CHANGE(msgKey.getKeyValue("d_CLASS_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CLASS_2")) {
						key.setd_OLD_CLASS_2(msgKey.getKeyValue("d_OLD_CLASS_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CLASS_2")) {
						key.setd_NEW_CLASS_2(msgKey.getKeyValue("d_NEW_CLASS_2"));
					}
					if(msgKeyType.containsKeyColumn("d_CLASS_2_CHANGE")) {
						key.setd_CLASS_2_CHANGE(msgKey.getKeyValue("d_CLASS_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CLASS_3")) {
						key.setd_OLD_CLASS_3(msgKey.getKeyValue("d_OLD_CLASS_3"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CLASS_3")) {
						key.setd_NEW_CLASS_3(msgKey.getKeyValue("d_NEW_CLASS_3"));
					}
					if(msgKeyType.containsKeyColumn("d_CLASS_3_CHANGE")) {
						key.setd_CLASS_3_CHANGE(msgKey.getKeyValue("d_CLASS_3_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_AUTO_JNL_NAME")) {
						key.setd_OLD_AUTO_JNL_NAME(msgKey.getKeyValue("d_OLD_AUTO_JNL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_AUTO_JNL_NAME")) {
						key.setd_NEW_AUTO_JNL_NAME(msgKey.getKeyValue("d_NEW_AUTO_JNL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_AUTO_JNL_NAME_CHANGE")) {
						key.setd_AUTO_JNL_NAME_CHANGE(msgKey.getKeyValue("d_AUTO_JNL_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DR_ACCT_CD")) {
						key.setd_OLD_DR_ACCT_CD(msgKey.getKeyValue("d_OLD_DR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DR_ACCT_CD")) {
						key.setd_NEW_DR_ACCT_CD(msgKey.getKeyValue("d_NEW_DR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_DR_ACCT_CD_CHANGE")) {
						key.setd_DR_ACCT_CD_CHANGE(msgKey.getKeyValue("d_DR_ACCT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DR_SUB_ACCT_CD")) {
						key.setd_OLD_DR_SUB_ACCT_CD(msgKey.getKeyValue("d_OLD_DR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DR_SUB_ACCT_CD")) {
						key.setd_NEW_DR_SUB_ACCT_CD(msgKey.getKeyValue("d_NEW_DR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_DR_SUB_ACCT_CD_CHANGE")) {
						key.setd_DR_SUB_ACCT_CD_CHANGE(msgKey.getKeyValue("d_DR_SUB_ACCT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DR_ORG_TYP")) {
						key.setd_OLD_DR_ORG_TYP(msgKey.getKeyValue("d_OLD_DR_ORG_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DR_ORG_TYP")) {
						key.setd_NEW_DR_ORG_TYP(msgKey.getKeyValue("d_NEW_DR_ORG_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_DR_ORG_TYP_CHANGE")) {
						key.setd_DR_ORG_TYP_CHANGE(msgKey.getKeyValue("d_DR_ORG_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DR_ORG_CD")) {
						key.setd_OLD_DR_ORG_CD(msgKey.getKeyValue("d_OLD_DR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DR_ORG_CD")) {
						key.setd_NEW_DR_ORG_CD(msgKey.getKeyValue("d_NEW_DR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_DR_ORG_CD_CHANGE")) {
						key.setd_DR_ORG_CD_CHANGE(msgKey.getKeyValue("d_DR_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CR_ACCT_CD")) {
						key.setd_OLD_CR_ACCT_CD(msgKey.getKeyValue("d_OLD_CR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CR_ACCT_CD")) {
						key.setd_NEW_CR_ACCT_CD(msgKey.getKeyValue("d_NEW_CR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CR_ACCT_CD_CHANGE")) {
						key.setd_CR_ACCT_CD_CHANGE(msgKey.getKeyValue("d_CR_ACCT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CR_SUB_ACCT_CD")) {
						key.setd_OLD_CR_SUB_ACCT_CD(msgKey.getKeyValue("d_OLD_CR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CR_SUB_ACCT_CD")) {
						key.setd_NEW_CR_SUB_ACCT_CD(msgKey.getKeyValue("d_NEW_CR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CR_SUB_ACCT_CD_CHANGE")) {
						key.setd_CR_SUB_ACCT_CD_CHANGE(msgKey.getKeyValue("d_CR_SUB_ACCT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CR_ORG_TYP")) {
						key.setd_OLD_CR_ORG_TYP(msgKey.getKeyValue("d_OLD_CR_ORG_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CR_ORG_TYP")) {
						key.setd_NEW_CR_ORG_TYP(msgKey.getKeyValue("d_NEW_CR_ORG_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_CR_ORG_TYP_CHANGE")) {
						key.setd_CR_ORG_TYP_CHANGE(msgKey.getKeyValue("d_CR_ORG_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CR_ORG_CD")) {
						key.setd_OLD_CR_ORG_CD(msgKey.getKeyValue("d_OLD_CR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CR_ORG_CD")) {
						key.setd_NEW_CR_ORG_CD(msgKey.getKeyValue("d_NEW_CR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CR_ORG_CD_CHANGE")) {
						key.setd_CR_ORG_CD_CHANGE(msgKey.getKeyValue("d_CR_ORG_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACCT_SLIP_NUM")) {
						key.setd_OLD_ACCT_SLIP_NUM(msgKey.getKeyValue("d_OLD_ACCT_SLIP_NUM"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACCT_SLIP_NUM")) {
						key.setd_NEW_ACCT_SLIP_NUM(msgKey.getKeyValue("d_NEW_ACCT_SLIP_NUM"));
					}
					if(msgKeyType.containsKeyColumn("d_ACCT_SLIP_NUM_CHANGE")) {
						key.setd_ACCT_SLIP_NUM_CHANGE(msgKey.getKeyValue("d_ACCT_SLIP_NUM_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACCT_JNL_PATTERN_CD")) {
						key.setd_OLD_ACCT_JNL_PATTERN_CD(msgKey.getKeyValue("d_OLD_ACCT_JNL_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACCT_JNL_PATTERN_CD")) {
						key.setd_NEW_ACCT_JNL_PATTERN_CD(msgKey.getKeyValue("d_NEW_ACCT_JNL_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_ACCT_JNL_PATTERN_CD_CHANGE")) {
						key.setd_ACCT_JNL_PATTERN_CD_CHANGE(msgKey.getKeyValue("d_ACCT_JNL_PATTERN_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CAL_NO")) {
						key.setd_OLD_CAL_NO(msgKey.getKeyValue("d_OLD_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CAL_NO")) {
						key.setd_NEW_CAL_NO(msgKey.getKeyValue("d_NEW_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_CAL_NO_CHANGE")) {
						key.setd_CAL_NO_CHANGE(msgKey.getKeyValue("d_CAL_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_NAME")) {
						key.setd_OLD_BANK_BR_NAME(msgKey.getKeyValue("d_OLD_BANK_BR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_NAME")) {
						key.setd_NEW_BANK_BR_NAME(msgKey.getKeyValue("d_NEW_BANK_BR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_NAME_CHANGE")) {
						key.setd_BANK_BR_NAME_CHANGE(msgKey.getKeyValue("d_BANK_BR_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_ANAME")) {
						key.setd_OLD_BANK_BR_ANAME(msgKey.getKeyValue("d_OLD_BANK_BR_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_ANAME")) {
						key.setd_NEW_BANK_BR_ANAME(msgKey.getKeyValue("d_NEW_BANK_BR_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_ANAME_CHANGE")) {
						key.setd_BANK_BR_ANAME_CHANGE(msgKey.getKeyValue("d_BANK_BR_ANAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_KNAME")) {
						key.setd_OLD_BANK_BR_KNAME(msgKey.getKeyValue("d_OLD_BANK_BR_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_KNAME")) {
						key.setd_NEW_BANK_BR_KNAME(msgKey.getKeyValue("d_NEW_BANK_BR_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_KNAME_CHANGE")) {
						key.setd_BANK_BR_KNAME_CHANGE(msgKey.getKeyValue("d_BANK_BR_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_ENAME")) {
						key.setd_OLD_BANK_BR_ENAME(msgKey.getKeyValue("d_OLD_BANK_BR_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_ENAME")) {
						key.setd_NEW_BANK_BR_ENAME(msgKey.getKeyValue("d_NEW_BANK_BR_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_ENAME_CHANGE")) {
						key.setd_BANK_BR_ENAME_CHANGE(msgKey.getKeyValue("d_BANK_BR_ENAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_FB_NAME")) {
						key.setd_OLD_BANK_BR_FB_NAME(msgKey.getKeyValue("d_OLD_BANK_BR_FB_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_FB_NAME")) {
						key.setd_NEW_BANK_BR_FB_NAME(msgKey.getKeyValue("d_NEW_BANK_BR_FB_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_FB_NAME_CHANGE")) {
						key.setd_BANK_BR_FB_NAME_CHANGE(msgKey.getKeyValue("d_BANK_BR_FB_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_CNAME")) {
						key.setd_OLD_BANK_BR_CNAME(msgKey.getKeyValue("d_OLD_BANK_BR_CNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_CNAME")) {
						key.setd_NEW_BANK_BR_CNAME(msgKey.getKeyValue("d_NEW_BANK_BR_CNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_CNAME_CHANGE")) {
						key.setd_BANK_BR_CNAME_CHANGE(msgKey.getKeyValue("d_BANK_BR_CNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BANK_BR_ECNAME")) {
						key.setd_OLD_BANK_BR_ECNAME(msgKey.getKeyValue("d_OLD_BANK_BR_ECNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BANK_BR_ECNAME")) {
						key.setd_NEW_BANK_BR_ECNAME(msgKey.getKeyValue("d_NEW_BANK_BR_ECNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BANK_BR_ECNAME_CHANGE")) {
						key.setd_BANK_BR_ECNAME_CHANGE(msgKey.getKeyValue("d_BANK_BR_ECNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_CD")) {
						key.setd_OLD_BRANCH_CD(msgKey.getKeyValue("d_OLD_BRANCH_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_CD")) {
						key.setd_NEW_BRANCH_CD(msgKey.getKeyValue("d_NEW_BRANCH_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_BRANCH_CD_CHANGE")) {
						key.setd_BRANCH_CD_CHANGE(msgKey.getKeyValue("d_BRANCH_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_FNAME")) {
						key.setd_OLD_BRANCH_FNAME(msgKey.getKeyValue("d_OLD_BRANCH_FNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_FNAME")) {
						key.setd_NEW_BRANCH_FNAME(msgKey.getKeyValue("d_NEW_BRANCH_FNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BRANCH_FNAME_CHANGE")) {
						key.setd_BRANCH_FNAME_CHANGE(msgKey.getKeyValue("d_BRANCH_FNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_NAME")) {
						key.setd_OLD_BRANCH_NAME(msgKey.getKeyValue("d_OLD_BRANCH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_NAME")) {
						key.setd_NEW_BRANCH_NAME(msgKey.getKeyValue("d_NEW_BRANCH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BRANCH_NAME_CHANGE")) {
						key.setd_BRANCH_NAME_CHANGE(msgKey.getKeyValue("d_BRANCH_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_KNAME")) {
						key.setd_OLD_BRANCH_KNAME(msgKey.getKeyValue("d_OLD_BRANCH_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_KNAME")) {
						key.setd_NEW_BRANCH_KNAME(msgKey.getKeyValue("d_NEW_BRANCH_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BRANCH_KNAME_CHANGE")) {
						key.setd_BRANCH_KNAME_CHANGE(msgKey.getKeyValue("d_BRANCH_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_ENAME")) {
						key.setd_OLD_BRANCH_ENAME(msgKey.getKeyValue("d_OLD_BRANCH_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_ENAME")) {
						key.setd_NEW_BRANCH_ENAME(msgKey.getKeyValue("d_NEW_BRANCH_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_BRANCH_ENAME_CHANGE")) {
						key.setd_BRANCH_ENAME_CHANGE(msgKey.getKeyValue("d_BRANCH_ENAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BRANCH_SEQ_CD")) {
						key.setd_OLD_BRANCH_SEQ_CD(msgKey.getKeyValue("d_OLD_BRANCH_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BRANCH_SEQ_CD")) {
						key.setd_NEW_BRANCH_SEQ_CD(msgKey.getKeyValue("d_NEW_BRANCH_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_BRANCH_SEQ_CD_CHANGE")) {
						key.setd_BRANCH_SEQ_CD_CHANGE(msgKey.getKeyValue("d_BRANCH_SEQ_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CHARGE_ORG_NAME")) {
						key.setd_OLD_CHARGE_ORG_NAME(msgKey.getKeyValue("d_OLD_CHARGE_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CHARGE_ORG_NAME")) {
						key.setd_NEW_CHARGE_ORG_NAME(msgKey.getKeyValue("d_NEW_CHARGE_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CHARGE_ORG_NAME_CHANGE")) {
						key.setd_CHARGE_ORG_NAME_CHANGE(msgKey.getKeyValue("d_CHARGE_ORG_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CHARGE_PERSON_NAME")) {
						key.setd_OLD_CHARGE_PERSON_NAME(msgKey.getKeyValue("d_OLD_CHARGE_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CHARGE_PERSON_NAME")) {
						key.setd_NEW_CHARGE_PERSON_NAME(msgKey.getKeyValue("d_NEW_CHARGE_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CHARGE_PERSON_NAME_CHANGE")) {
						key.setd_CHARGE_PERSON_NAME_CHANGE(msgKey.getKeyValue("d_CHARGE_PERSON_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EDI_OWN_VEND_CD")) {
						key.setd_OLD_EDI_OWN_VEND_CD(msgKey.getKeyValue("d_OLD_EDI_OWN_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EDI_OWN_VEND_CD")) {
						key.setd_NEW_EDI_OWN_VEND_CD(msgKey.getKeyValue("d_NEW_EDI_OWN_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_EDI_OWN_VEND_CD_CHANGE")) {
						key.setd_EDI_OWN_VEND_CD_CHANGE(msgKey.getKeyValue("d_EDI_OWN_VEND_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_REMARKS_1")) {
						key.setd_OLD_REMARKS_1(msgKey.getKeyValue("d_OLD_REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_REMARKS_1")) {
						key.setd_NEW_REMARKS_1(msgKey.getKeyValue("d_NEW_REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("d_REMARKS_1_CHANGE")) {
						key.setd_REMARKS_1_CHANGE(msgKey.getKeyValue("d_REMARKS_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_REMARKS_2")) {
						key.setd_OLD_REMARKS_2(msgKey.getKeyValue("d_OLD_REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_REMARKS_2")) {
						key.setd_NEW_REMARKS_2(msgKey.getKeyValue("d_NEW_REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("d_REMARKS_2_CHANGE")) {
						key.setd_REMARKS_2_CHANGE(msgKey.getKeyValue("d_REMARKS_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_REMARKS_3")) {
						key.setd_OLD_REMARKS_3(msgKey.getKeyValue("d_OLD_REMARKS_3"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_REMARKS_3")) {
						key.setd_NEW_REMARKS_3(msgKey.getKeyValue("d_NEW_REMARKS_3"));
					}
					if(msgKeyType.containsKeyColumn("d_REMARKS_3_CHANGE")) {
						key.setd_REMARKS_3_CHANGE(msgKey.getKeyValue("d_REMARKS_3_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DETAIL_ROUND_TYP")) {
						key.setd_OLD_DETAIL_ROUND_TYP(msgKey.getKeyValue("d_OLD_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DETAIL_ROUND_TYP")) {
						key.setd_NEW_DETAIL_ROUND_TYP(msgKey.getKeyValue("d_NEW_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_DETAIL_ROUND_TYP_CHANGE")) {
						key.setd_DETAIL_ROUND_TYP_CHANGE(msgKey.getKeyValue("d_DETAIL_ROUND_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SECTION_CD")) {
						key.setd_OLD_SECTION_CD(msgKey.getKeyValue("d_OLD_SECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SECTION_CD")) {
						key.setd_NEW_SECTION_CD(msgKey.getKeyValue("d_NEW_SECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_SECTION_CD_CHANGE")) {
						key.setd_SECTION_CD_CHANGE(msgKey.getKeyValue("d_SECTION_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS_NAME")) {
						key.setl_STATUS_NAME(msgKey.getKeyValue("l_STATUS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PURPOSE_UNIT_PRICE_TYP")) {
						key.setd_OLD_PURPOSE_UNIT_PRICE_TYP(msgKey.getKeyValue("d_OLD_PURPOSE_UNIT_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PURPOSE_UNIT_PRICE_TYP")) {
						key.setd_NEW_PURPOSE_UNIT_PRICE_TYP(msgKey.getKeyValue("d_NEW_PURPOSE_UNIT_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_PURPOSE_UNIT_PRICE_TYP_CHANGE")) {
						key.setd_PURPOSE_UNIT_PRICE_TYP_CHANGE(msgKey.getKeyValue("d_PURPOSE_UNIT_PRICE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SALES_UNIT_SIZE")) {
						key.setd_OLD_SALES_UNIT_SIZE(msgKey.getKeyValue("d_OLD_SALES_UNIT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SALES_UNIT_SIZE")) {
						key.setd_NEW_SALES_UNIT_SIZE(msgKey.getKeyValue("d_NEW_SALES_UNIT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_SALES_UNIT_SIZE_CHANGE")) {
						key.setd_SALES_UNIT_SIZE_CHANGE(msgKey.getKeyValue("d_SALES_UNIT_SIZE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SALES_UNIT_COST")) {
						key.setd_OLD_SALES_UNIT_COST(msgKey.getKeyValue("d_OLD_SALES_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SALES_UNIT_COST")) {
						key.setd_NEW_SALES_UNIT_COST(msgKey.getKeyValue("d_NEW_SALES_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("d_SALES_UNIT_COST_CHANGE")) {
						key.setd_SALES_UNIT_COST_CHANGE(msgKey.getKeyValue("d_SALES_UNIT_COST_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_GRP_CD")) {
						key.setd_OLD_CUST_GRP_CD(msgKey.getKeyValue("d_OLD_CUST_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_GRP_CD")) {
						key.setd_NEW_CUST_GRP_CD(msgKey.getKeyValue("d_NEW_CUST_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_GRP_CD_CHANGE")) {
						key.setd_CUST_GRP_CD_CHANGE(msgKey.getKeyValue("d_CUST_GRP_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CNCNTRT_DLV_LOC_CD")) {
						key.setd_OLD_CNCNTRT_DLV_LOC_CD(msgKey.getKeyValue("d_OLD_CNCNTRT_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CNCNTRT_DLV_LOC_CD")) {
						key.setd_NEW_CNCNTRT_DLV_LOC_CD(msgKey.getKeyValue("d_NEW_CNCNTRT_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CNCNTRT_DLV_LOC_CD_CHANGE")) {
						key.setd_CNCNTRT_DLV_LOC_CD_CHANGE(msgKey.getKeyValue("d_CNCNTRT_DLV_LOC_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_CTL_TYP")) {
						key.setd_OLD_SHIP_CTL_TYP(msgKey.getKeyValue("d_OLD_SHIP_CTL_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_CTL_TYP")) {
						key.setd_NEW_SHIP_CTL_TYP(msgKey.getKeyValue("d_NEW_SHIP_CTL_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_CTL_TYP_CHANGE")) {
						key.setd_SHIP_CTL_TYP_CHANGE(msgKey.getKeyValue("d_SHIP_CTL_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_SLIP_ISS_FLG")) {
						key.setd_OLD_DLV_SLIP_ISS_FLG(msgKey.getKeyValue("d_OLD_DLV_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_SLIP_ISS_FLG")) {
						key.setd_NEW_DLV_SLIP_ISS_FLG(msgKey.getKeyValue("d_NEW_DLV_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_SLIP_ISS_FLG_CHANGE")) {
						key.setd_DLV_SLIP_ISS_FLG_CHANGE(msgKey.getKeyValue("d_DLV_SLIP_ISS_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_IDENT_CARD_F_ISS_TYP")) {
						key.setd_OLD_IDENT_CARD_F_ISS_TYP(msgKey.getKeyValue("d_OLD_IDENT_CARD_F_ISS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_IDENT_CARD_F_ISS_TYP")) {
						key.setd_NEW_IDENT_CARD_F_ISS_TYP(msgKey.getKeyValue("d_NEW_IDENT_CARD_F_ISS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_IDENT_CARD_F_ISS_TYP_CHANGE")) {
						key.setd_IDENT_CARD_F_ISS_TYP_CHANGE(msgKey.getKeyValue("d_IDENT_CARD_F_ISS_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_IDENT_CARD_F_FORMAT_TYP")) {
						key.setd_OLD_IDENT_CARD_F_FORMAT_TYP(msgKey.getKeyValue("d_OLD_IDENT_CARD_F_FORMAT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_IDENT_CARD_F_FORMAT_TYP")) {
						key.setd_NEW_IDENT_CARD_F_FORMAT_TYP(msgKey.getKeyValue("d_NEW_IDENT_CARD_F_FORMAT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_IDENT_CARD_F_FORMAT_TYP_CHANGE")) {
						key.setd_IDENT_CARD_F_FORMAT_TYP_CHANGE(msgKey.getKeyValue("d_IDENT_CARD_F_FORMAT_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_FIX_TERM")) {
						key.setd_OLD_SHIP_FIX_TERM(msgKey.getKeyValue("d_OLD_SHIP_FIX_TERM"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_FIX_TERM")) {
						key.setd_NEW_SHIP_FIX_TERM(msgKey.getKeyValue("d_NEW_SHIP_FIX_TERM"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_FIX_TERM_CHANGE")) {
						key.setd_SHIP_FIX_TERM_CHANGE(msgKey.getKeyValue("d_SHIP_FIX_TERM_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MASS_PRODUCT_TYP")) {
						key.setd_OLD_MASS_PRODUCT_TYP(msgKey.getKeyValue("d_OLD_MASS_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MASS_PRODUCT_TYP")) {
						key.setd_NEW_MASS_PRODUCT_TYP(msgKey.getKeyValue("d_NEW_MASS_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_MASS_PRODUCT_TYP_CHANGE")) {
						key.setd_MASS_PRODUCT_TYP_CHANGE(msgKey.getKeyValue("d_MASS_PRODUCT_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DECISION_REPLACE_PTN")) {
						key.setd_OLD_DECISION_REPLACE_PTN(msgKey.getKeyValue("d_OLD_DECISION_REPLACE_PTN"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DECISION_REPLACE_PTN")) {
						key.setd_NEW_DECISION_REPLACE_PTN(msgKey.getKeyValue("d_NEW_DECISION_REPLACE_PTN"));
					}
					if(msgKeyType.containsKeyColumn("d_DECISION_REPLACE_PTN_CHANGE")) {
						key.setd_DECISION_REPLACE_PTN_CHANGE(msgKey.getKeyValue("d_DECISION_REPLACE_PTN_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_RSLT_APPLY_TYP")) {
						key.setd_OLD_SHIP_RSLT_APPLY_TYP(msgKey.getKeyValue("d_OLD_SHIP_RSLT_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_RSLT_APPLY_TYP")) {
						key.setd_NEW_SHIP_RSLT_APPLY_TYP(msgKey.getKeyValue("d_NEW_SHIP_RSLT_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_RSLT_APPLY_TYP_CHANGE")) {
						key.setd_SHIP_RSLT_APPLY_TYP_CHANGE(msgKey.getKeyValue("d_SHIP_RSLT_APPLY_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP")) {
						key.setd_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP(msgKey.getKeyValue("d_OLD_CNCNTRT_SHIP_RSLT_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP")) {
						key.setd_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP(msgKey.getKeyValue("d_NEW_CNCNTRT_SHIP_RSLT_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE")) {
						key.setd_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE(msgKey.getKeyValue("d_CNCNTRT_SHIP_RSLT_APPLY_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_NEXT_DLV_SHIFT_EFF_FLG")) {
						key.setd_OLD_NEXT_DLV_SHIFT_EFF_FLG(msgKey.getKeyValue("d_OLD_NEXT_DLV_SHIFT_EFF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_NEXT_DLV_SHIFT_EFF_FLG")) {
						key.setd_NEW_NEXT_DLV_SHIFT_EFF_FLG(msgKey.getKeyValue("d_NEW_NEXT_DLV_SHIFT_EFF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE")) {
						key.setd_NEXT_DLV_SHIFT_EFF_FLG_CHANGE(msgKey.getKeyValue("d_NEXT_DLV_SHIFT_EFF_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_UNCNFM_PLAN_AVG_FLG")) {
						key.setd_OLD_UNCNFM_PLAN_AVG_FLG(msgKey.getKeyValue("d_OLD_UNCNFM_PLAN_AVG_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_UNCNFM_PLAN_AVG_FLG")) {
						key.setd_NEW_UNCNFM_PLAN_AVG_FLG(msgKey.getKeyValue("d_NEW_UNCNFM_PLAN_AVG_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_UNCNFM_PLAN_AVG_FLG_CHANGE")) {
						key.setd_UNCNFM_PLAN_AVG_FLG_CHANGE(msgKey.getKeyValue("d_UNCNFM_PLAN_AVG_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CNCNTRT_TRANS_LT")) {
						key.setd_OLD_CNCNTRT_TRANS_LT(msgKey.getKeyValue("d_OLD_CNCNTRT_TRANS_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CNCNTRT_TRANS_LT")) {
						key.setd_NEW_CNCNTRT_TRANS_LT(msgKey.getKeyValue("d_NEW_CNCNTRT_TRANS_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_CNCNTRT_TRANS_LT_CHANGE")) {
						key.setd_CNCNTRT_TRANS_LT_CHANGE(msgKey.getKeyValue("d_CNCNTRT_TRANS_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_TRANS_LT")) {
						key.setd_OLD_CUST_TRANS_LT(msgKey.getKeyValue("d_OLD_CUST_TRANS_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_TRANS_LT")) {
						key.setd_NEW_CUST_TRANS_LT(msgKey.getKeyValue("d_NEW_CUST_TRANS_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_TRANS_LT_CHANGE")) {
						key.setd_CUST_TRANS_LT_CHANGE(msgKey.getKeyValue("d_CUST_TRANS_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_CD")) {
						key.setd_OLD_CUST_DESINATED_DLV_LOC_CD(msgKey.getKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_CD")) {
						key.setd_NEW_CUST_DESINATED_DLV_LOC_CD(msgKey.getKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_CD_CHANGE")) {
						key.setd_CUST_DESINATED_DLV_LOC_CD_CHANGE(msgKey.getKeyValue("d_CUST_DESINATED_DLV_LOC_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_OPTION_CHANGE_VALUE")) {
						key.setd_OLD_DLV_LOC_OPTION_CHANGE_VALUE(msgKey.getKeyValue("d_OLD_DLV_LOC_OPTION_CHANGE_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_OPTION_CHANGE_VALUE")) {
						key.setd_NEW_DLV_LOC_OPTION_CHANGE_VALUE(msgKey.getKeyValue("d_NEW_DLV_LOC_OPTION_CHANGE_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE")) {
						key.setd_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE(msgKey.getKeyValue("d_DLV_LOC_OPTION_CHANGE_VALUE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_NAME")) {
						key.setd_OLD_CUST_DESINATED_DLV_LOC_NAME(msgKey.getKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_NAME")) {
						key.setd_NEW_CUST_DESINATED_DLV_LOC_NAME(msgKey.getKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_NAME_CHANGE")) {
						key.setd_CUST_DESINATED_DLV_LOC_NAME_CHANGE(msgKey.getKeyValue("d_CUST_DESINATED_DLV_LOC_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_KNAME")) {
						key.setd_OLD_CUST_DESINATED_DLV_LOC_KNAME(msgKey.getKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_KNAME")) {
						key.setd_NEW_CUST_DESINATED_DLV_LOC_KNAME(msgKey.getKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE")) {
						key.setd_CUST_DESINATED_DLV_LOC_KNAME_CHANGE(msgKey.getKeyValue("d_CUST_DESINATED_DLV_LOC_KNAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_DESINATED_DLV_LOC_ENAME")) {
						key.setd_OLD_CUST_DESINATED_DLV_LOC_ENAME(msgKey.getKeyValue("d_OLD_CUST_DESINATED_DLV_LOC_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_DESINATED_DLV_LOC_ENAME")) {
						key.setd_NEW_CUST_DESINATED_DLV_LOC_ENAME(msgKey.getKeyValue("d_NEW_CUST_DESINATED_DLV_LOC_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE")) {
						key.setd_CUST_DESINATED_DLV_LOC_ENAME_CHANGE(msgKey.getKeyValue("d_CUST_DESINATED_DLV_LOC_ENAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("h_HISTORY_FOR_APPR")) {
						key.seth_HISTORY_FOR_APPR(msgKey.getKeyValue("h_HISTORY_FOR_APPR"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ITEM_NAME")) {
						key.setd_OLD_ITEM_NAME(msgKey.getKeyValue("d_OLD_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ITEM_NAME")) {
						key.setd_NEW_ITEM_NAME(msgKey.getKeyValue("d_NEW_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_NAME_CHANGE")) {
						key.setd_ITEM_NAME_CHANGE(msgKey.getKeyValue("d_ITEM_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DRAW_CD")) {
						key.setd_OLD_DRAW_CD(msgKey.getKeyValue("d_OLD_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DRAW_CD")) {
						key.setd_NEW_DRAW_CD(msgKey.getKeyValue("d_NEW_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_DRAW_CD_CHANGE")) {
						key.setd_DRAW_CD_CHANGE(msgKey.getKeyValue("d_DRAW_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_HIGH_LEVEL_NO")) {
						key.setd_OLD_HIGH_LEVEL_NO(msgKey.getKeyValue("d_OLD_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_HIGH_LEVEL_NO")) {
						key.setd_NEW_HIGH_LEVEL_NO(msgKey.getKeyValue("d_NEW_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_HIGH_LEVEL_NO_CHANGE")) {
						key.setd_HIGH_LEVEL_NO_CHANGE(msgKey.getKeyValue("d_HIGH_LEVEL_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SPEC")) {
						key.setd_OLD_SPEC(msgKey.getKeyValue("d_OLD_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SPEC")) {
						key.setd_NEW_SPEC(msgKey.getKeyValue("d_NEW_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("d_SPEC_CHANGE")) {
						key.setd_SPEC_CHANGE(msgKey.getKeyValue("d_SPEC_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ISSUE_TYP")) {
						key.setd_OLD_ISSUE_TYP(msgKey.getKeyValue("d_OLD_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ISSUE_TYP")) {
						key.setd_NEW_ISSUE_TYP(msgKey.getKeyValue("d_NEW_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_ISSUE_TYP_CHANGE")) {
						key.setd_ISSUE_TYP_CHANGE(msgKey.getKeyValue("d_ISSUE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_UNIT_QTY_TYP")) {
						key.setd_OLD_UNIT_QTY_TYP(msgKey.getKeyValue("d_OLD_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_UNIT_QTY_TYP")) {
						key.setd_NEW_UNIT_QTY_TYP(msgKey.getKeyValue("d_NEW_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_UNIT_QTY_TYP_CHANGE")) {
						key.setd_UNIT_QTY_TYP_CHANGE(msgKey.getKeyValue("d_UNIT_QTY_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OUTSIDE_TYP")) {
						key.setd_OLD_OUTSIDE_TYP(msgKey.getKeyValue("d_OLD_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OUTSIDE_TYP")) {
						key.setd_NEW_OUTSIDE_TYP(msgKey.getKeyValue("d_NEW_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OUTSIDE_TYP_CHANGE")) {
						key.setd_OUTSIDE_TYP_CHANGE(msgKey.getKeyValue("d_OUTSIDE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ACPT_INSPC_TYP")) {
						key.setd_OLD_ACPT_INSPC_TYP(msgKey.getKeyValue("d_OLD_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ACPT_INSPC_TYP")) {
						key.setd_NEW_ACPT_INSPC_TYP(msgKey.getKeyValue("d_NEW_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_ACPT_INSPC_TYP_CHANGE")) {
						key.setd_ACPT_INSPC_TYP_CHANGE(msgKey.getKeyValue("d_ACPT_INSPC_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_STOCK_UNIT_FLG")) {
						key.setd_OLD_STOCK_UNIT_FLG(msgKey.getKeyValue("d_OLD_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_STOCK_UNIT_FLG")) {
						key.setd_NEW_STOCK_UNIT_FLG(msgKey.getKeyValue("d_NEW_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_STOCK_UNIT_FLG_CHANGE")) {
						key.setd_STOCK_UNIT_FLG_CHANGE(msgKey.getKeyValue("d_STOCK_UNIT_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PRODUCT_TYP")) {
						key.setd_OLD_PRODUCT_TYP(msgKey.getKeyValue("d_OLD_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PRODUCT_TYP")) {
						key.setd_NEW_PRODUCT_TYP(msgKey.getKeyValue("d_NEW_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_PRODUCT_TYP_CHANGE")) {
						key.setd_PRODUCT_TYP_CHANGE(msgKey.getKeyValue("d_PRODUCT_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_STOCK_UNIT")) {
						key.setd_OLD_STOCK_UNIT(msgKey.getKeyValue("d_OLD_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_STOCK_UNIT")) {
						key.setd_NEW_STOCK_UNIT(msgKey.getKeyValue("d_NEW_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("d_STOCK_UNIT_CHANGE")) {
						key.setd_STOCK_UNIT_CHANGE(msgKey.getKeyValue("d_STOCK_UNIT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ABC_TYP")) {
						key.setd_OLD_ABC_TYP(msgKey.getKeyValue("d_OLD_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ABC_TYP")) {
						key.setd_NEW_ABC_TYP(msgKey.getKeyValue("d_NEW_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_ABC_TYP_CHANGE")) {
						key.setd_ABC_TYP_CHANGE(msgKey.getKeyValue("d_ABC_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PKG_UNIT")) {
						key.setd_OLD_PKG_UNIT(msgKey.getKeyValue("d_OLD_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PKG_UNIT")) {
						key.setd_NEW_PKG_UNIT(msgKey.getKeyValue("d_NEW_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("d_PKG_UNIT_CHANGE")) {
						key.setd_PKG_UNIT_CHANGE(msgKey.getKeyValue("d_PKG_UNIT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_OPR_RSLT_TYP")) {
						key.setd_OLD_OPR_RSLT_TYP(msgKey.getKeyValue("d_OLD_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_OPR_RSLT_TYP")) {
						key.setd_NEW_OPR_RSLT_TYP(msgKey.getKeyValue("d_NEW_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OPR_RSLT_TYP_CHANGE")) {
						key.setd_OPR_RSLT_TYP_CHANGE(msgKey.getKeyValue("d_OPR_RSLT_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PKG_UNIT_QTY")) {
						key.setd_OLD_PKG_UNIT_QTY(msgKey.getKeyValue("d_OLD_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PKG_UNIT_QTY")) {
						key.setd_NEW_PKG_UNIT_QTY(msgKey.getKeyValue("d_NEW_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_PKG_UNIT_QTY_CHANGE")) {
						key.setd_PKG_UNIT_QTY_CHANGE(msgKey.getKeyValue("d_PKG_UNIT_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SPL_ITEM_TYP")) {
						key.setd_OLD_SPL_ITEM_TYP(msgKey.getKeyValue("d_OLD_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SPL_ITEM_TYP")) {
						key.setd_NEW_SPL_ITEM_TYP(msgKey.getKeyValue("d_NEW_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_SPL_ITEM_TYP_CHANGE")) {
						key.setd_SPL_ITEM_TYP_CHANGE(msgKey.getKeyValue("d_SPL_ITEM_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_LT")) {
						key.setd_OLD_ODR_LT(msgKey.getKeyValue("d_OLD_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_LT")) {
						key.setd_NEW_ODR_LT(msgKey.getKeyValue("d_NEW_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_LT_CHANGE")) {
						key.setd_ODR_LT_CHANGE(msgKey.getKeyValue("d_ODR_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ISSUE_LT")) {
						key.setd_OLD_ISSUE_LT(msgKey.getKeyValue("d_OLD_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ISSUE_LT")) {
						key.setd_NEW_ISSUE_LT(msgKey.getKeyValue("d_NEW_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_ISSUE_LT_CHANGE")) {
						key.setd_ISSUE_LT_CHANGE(msgKey.getKeyValue("d_ISSUE_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_FIXED_LT")) {
						key.setd_OLD_FIXED_LT(msgKey.getKeyValue("d_OLD_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_FIXED_LT")) {
						key.setd_NEW_FIXED_LT(msgKey.getKeyValue("d_NEW_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_FIXED_LT_CHANGE")) {
						key.setd_FIXED_LT_CHANGE(msgKey.getKeyValue("d_FIXED_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PROP_LOT_SIZE")) {
						key.setd_OLD_PROP_LOT_SIZE(msgKey.getKeyValue("d_OLD_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PROP_LOT_SIZE")) {
						key.setd_NEW_PROP_LOT_SIZE(msgKey.getKeyValue("d_NEW_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_PROP_LOT_SIZE_CHANGE")) {
						key.setd_PROP_LOT_SIZE_CHANGE(msgKey.getKeyValue("d_PROP_LOT_SIZE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PROP_LT")) {
						key.setd_OLD_PROP_LT(msgKey.getKeyValue("d_OLD_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PROP_LT")) {
						key.setd_NEW_PROP_LT(msgKey.getKeyValue("d_NEW_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_PROP_LT_CHANGE")) {
						key.setd_PROP_LT_CHANGE(msgKey.getKeyValue("d_PROP_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ITEM_SPOIL")) {
						key.setd_OLD_ITEM_SPOIL(msgKey.getKeyValue("d_OLD_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ITEM_SPOIL")) {
						key.setd_NEW_ITEM_SPOIL(msgKey.getKeyValue("d_NEW_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("d_ITEM_SPOIL_CHANGE")) {
						key.setd_ITEM_SPOIL_CHANGE(msgKey.getKeyValue("d_ITEM_SPOIL_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SAFETY_LT")) {
						key.setd_OLD_SAFETY_LT(msgKey.getKeyValue("d_OLD_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SAFETY_LT")) {
						key.setd_NEW_SAFETY_LT(msgKey.getKeyValue("d_NEW_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_SAFETY_LT_CHANGE")) {
						key.setd_SAFETY_LT_CHANGE(msgKey.getKeyValue("d_SAFETY_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SAFETY_STOCK")) {
						key.setd_OLD_SAFETY_STOCK(msgKey.getKeyValue("d_OLD_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SAFETY_STOCK")) {
						key.setd_NEW_SAFETY_STOCK(msgKey.getKeyValue("d_NEW_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("d_SAFETY_STOCK_CHANGE")) {
						key.setd_SAFETY_STOCK_CHANGE(msgKey.getKeyValue("d_SAFETY_STOCK_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MRP_ODR_TYP")) {
						key.setd_OLD_MRP_ODR_TYP(msgKey.getKeyValue("d_OLD_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MRP_ODR_TYP")) {
						key.setd_NEW_MRP_ODR_TYP(msgKey.getKeyValue("d_NEW_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_MRP_ODR_TYP_CHANGE")) {
						key.setd_MRP_ODR_TYP_CHANGE(msgKey.getKeyValue("d_MRP_ODR_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MANHOUR_TYP")) {
						key.setd_OLD_MANHOUR_TYP(msgKey.getKeyValue("d_OLD_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MANHOUR_TYP")) {
						key.setd_NEW_MANHOUR_TYP(msgKey.getKeyValue("d_NEW_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_MANHOUR_TYP_CHANGE")) {
						key.setd_MANHOUR_TYP_CHANGE(msgKey.getKeyValue("d_MANHOUR_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_LOT_SIZING_TYP")) {
						key.setd_OLD_LOT_SIZING_TYP(msgKey.getKeyValue("d_OLD_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_LOT_SIZING_TYP")) {
						key.setd_NEW_LOT_SIZING_TYP(msgKey.getKeyValue("d_NEW_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_LOT_SIZING_TYP_CHANGE")) {
						key.setd_LOT_SIZING_TYP_CHANGE(msgKey.getKeyValue("d_LOT_SIZING_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MPS_FLG")) {
						key.setd_OLD_MPS_FLG(msgKey.getKeyValue("d_OLD_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MPS_FLG")) {
						key.setd_NEW_MPS_FLG(msgKey.getKeyValue("d_NEW_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_MPS_FLG_CHANGE")) {
						key.setd_MPS_FLG_CHANGE(msgKey.getKeyValue("d_MPS_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MAX_PERIOD")) {
						key.setd_OLD_MAX_PERIOD(msgKey.getKeyValue("d_OLD_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MAX_PERIOD")) {
						key.setd_NEW_MAX_PERIOD(msgKey.getKeyValue("d_NEW_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("d_MAX_PERIOD_CHANGE")) {
						key.setd_MAX_PERIOD_CHANGE(msgKey.getKeyValue("d_MAX_PERIOD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_FIXED_ODR_QTY")) {
						key.setd_OLD_FIXED_ODR_QTY(msgKey.getKeyValue("d_OLD_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_FIXED_ODR_QTY")) {
						key.setd_NEW_FIXED_ODR_QTY(msgKey.getKeyValue("d_NEW_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_FIXED_ODR_QTY_CHANGE")) {
						key.setd_FIXED_ODR_QTY_CHANGE(msgKey.getKeyValue("d_FIXED_ODR_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MAX_ODR_QTY")) {
						key.setd_OLD_MAX_ODR_QTY(msgKey.getKeyValue("d_OLD_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MAX_ODR_QTY")) {
						key.setd_NEW_MAX_ODR_QTY(msgKey.getKeyValue("d_NEW_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_MAX_ODR_QTY_CHANGE")) {
						key.setd_MAX_ODR_QTY_CHANGE(msgKey.getKeyValue("d_MAX_ODR_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MIN_ODR_QTY")) {
						key.setd_OLD_MIN_ODR_QTY(msgKey.getKeyValue("d_OLD_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MIN_ODR_QTY")) {
						key.setd_NEW_MIN_ODR_QTY(msgKey.getKeyValue("d_NEW_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_MIN_ODR_QTY_CHANGE")) {
						key.setd_MIN_ODR_QTY_CHANGE(msgKey.getKeyValue("d_MIN_ODR_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_POINT")) {
						key.setd_OLD_ODR_POINT(msgKey.getKeyValue("d_OLD_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_POINT")) {
						key.setd_NEW_ODR_POINT(msgKey.getKeyValue("d_NEW_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_POINT_CHANGE")) {
						key.setd_ODR_POINT_CHANGE(msgKey.getKeyValue("d_ODR_POINT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MUL_ODR_QTY")) {
						key.setd_OLD_MUL_ODR_QTY(msgKey.getKeyValue("d_OLD_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MUL_ODR_QTY")) {
						key.setd_NEW_MUL_ODR_QTY(msgKey.getKeyValue("d_NEW_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_MUL_ODR_QTY_CHANGE")) {
						key.setd_MUL_ODR_QTY_CHANGE(msgKey.getKeyValue("d_MUL_ODR_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CLASIFICATION_CD")) {
						key.setd_OLD_CLASIFICATION_CD(msgKey.getKeyValue("d_OLD_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CLASIFICATION_CD")) {
						key.setd_NEW_CLASIFICATION_CD(msgKey.getKeyValue("d_NEW_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CLASIFICATION_CD_CHANGE")) {
						key.setd_CLASIFICATION_CD_CHANGE(msgKey.getKeyValue("d_CLASIFICATION_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_UNIT_WEIGHT")) {
						key.setd_OLD_UNIT_WEIGHT(msgKey.getKeyValue("d_OLD_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_UNIT_WEIGHT")) {
						key.setd_NEW_UNIT_WEIGHT(msgKey.getKeyValue("d_NEW_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("d_UNIT_WEIGHT_CHANGE")) {
						key.setd_UNIT_WEIGHT_CHANGE(msgKey.getKeyValue("d_UNIT_WEIGHT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TAX_CD_1")) {
						key.setd_OLD_TAX_CD_1(msgKey.getKeyValue("d_OLD_TAX_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TAX_CD_1")) {
						key.setd_NEW_TAX_CD_1(msgKey.getKeyValue("d_NEW_TAX_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_TAX_CD_1_CHANGE")) {
						key.setd_TAX_CD_1_CHANGE(msgKey.getKeyValue("d_TAX_CD_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DEPO_TYP")) {
						key.setd_OLD_DEPO_TYP(msgKey.getKeyValue("d_OLD_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DEPO_TYP")) {
						key.setd_NEW_DEPO_TYP(msgKey.getKeyValue("d_NEW_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_DEPO_TYP_CHANGE")) {
						key.setd_DEPO_TYP_CHANGE(msgKey.getKeyValue("d_DEPO_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BEST_BEFORE_YEAR")) {
						key.setd_OLD_BEST_BEFORE_YEAR(msgKey.getKeyValue("d_OLD_BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BEST_BEFORE_YEAR")) {
						key.setd_NEW_BEST_BEFORE_YEAR(msgKey.getKeyValue("d_NEW_BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("d_BEST_BEFORE_YEAR_CHANGE")) {
						key.setd_BEST_BEFORE_YEAR_CHANGE(msgKey.getKeyValue("d_BEST_BEFORE_YEAR_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_LOT_CTRL_FLG")) {
						key.setd_OLD_LOT_CTRL_FLG(msgKey.getKeyValue("d_OLD_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_LOT_CTRL_FLG")) {
						key.setd_NEW_LOT_CTRL_FLG(msgKey.getKeyValue("d_NEW_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_LOT_CTRL_FLG_CHANGE")) {
						key.setd_LOT_CTRL_FLG_CHANGE(msgKey.getKeyValue("d_LOT_CTRL_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BEST_BEFORE_MONTH")) {
						key.setd_OLD_BEST_BEFORE_MONTH(msgKey.getKeyValue("d_OLD_BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BEST_BEFORE_MONTH")) {
						key.setd_NEW_BEST_BEFORE_MONTH(msgKey.getKeyValue("d_NEW_BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("d_BEST_BEFORE_MONTH_CHANGE")) {
						key.setd_BEST_BEFORE_MONTH_CHANGE(msgKey.getKeyValue("d_BEST_BEFORE_MONTH_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_LOT_NUMBERING_TYP")) {
						key.setd_OLD_LOT_NUMBERING_TYP(msgKey.getKeyValue("d_OLD_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_LOT_NUMBERING_TYP")) {
						key.setd_NEW_LOT_NUMBERING_TYP(msgKey.getKeyValue("d_NEW_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_LOT_NUMBERING_TYP_CHANGE")) {
						key.setd_LOT_NUMBERING_TYP_CHANGE(msgKey.getKeyValue("d_LOT_NUMBERING_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BEST_BEFORE_DAY")) {
						key.setd_OLD_BEST_BEFORE_DAY(msgKey.getKeyValue("d_OLD_BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BEST_BEFORE_DAY")) {
						key.setd_NEW_BEST_BEFORE_DAY(msgKey.getKeyValue("d_NEW_BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("d_BEST_BEFORE_DAY_CHANGE")) {
						key.setd_BEST_BEFORE_DAY_CHANGE(msgKey.getKeyValue("d_BEST_BEFORE_DAY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_STOCK_STATUS")) {
						key.setd_OLD_STOCK_STATUS(msgKey.getKeyValue("d_OLD_STOCK_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_STOCK_STATUS")) {
						key.setd_NEW_STOCK_STATUS(msgKey.getKeyValue("d_NEW_STOCK_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("d_STOCK_STATUS_CHANGE")) {
						key.setd_STOCK_STATUS_CHANGE(msgKey.getKeyValue("d_STOCK_STATUS_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_STOCK_STATUS_NAME")) {
						key.setd_OLD_STOCK_STATUS_NAME(msgKey.getKeyValue("d_OLD_STOCK_STATUS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_STOCK_STATUS_NAME")) {
						key.setd_NEW_STOCK_STATUS_NAME(msgKey.getKeyValue("d_NEW_STOCK_STATUS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("d_STOCK_STATUS_NAME_CHANGE")) {
						key.setd_STOCK_STATUS_NAME_CHANGE(msgKey.getKeyValue("d_STOCK_STATUS_NAME_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_STOCK_TYP")) {
						key.setd_OLD_STOCK_TYP(msgKey.getKeyValue("d_OLD_STOCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_STOCK_TYP")) {
						key.setd_NEW_STOCK_TYP(msgKey.getKeyValue("d_NEW_STOCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_STOCK_TYP_CHANGE")) {
						key.setd_STOCK_TYP_CHANGE(msgKey.getKeyValue("d_STOCK_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EFF_STOCK_TYP")) {
						key.setd_OLD_EFF_STOCK_TYP(msgKey.getKeyValue("d_OLD_EFF_STOCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EFF_STOCK_TYP")) {
						key.setd_NEW_EFF_STOCK_TYP(msgKey.getKeyValue("d_NEW_EFF_STOCK_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_EFF_STOCK_TYP_CHANGE")) {
						key.setd_EFF_STOCK_TYP_CHANGE(msgKey.getKeyValue("d_EFF_STOCK_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_TYP")) {
						key.setd_OLD_SHIP_TYP(msgKey.getKeyValue("d_OLD_SHIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_TYP")) {
						key.setd_NEW_SHIP_TYP(msgKey.getKeyValue("d_NEW_SHIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_TYP_CHANGE")) {
						key.setd_SHIP_TYP_CHANGE(msgKey.getKeyValue("d_SHIP_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_REF_NO")) {
						key.setd_OLD_REF_NO(msgKey.getKeyValue("d_OLD_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_REF_NO")) {
						key.setd_NEW_REF_NO(msgKey.getKeyValue("d_NEW_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_REF_NO_CHANGE")) {
						key.setd_REF_NO_CHANGE(msgKey.getKeyValue("d_REF_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DELIVERY_CD")) {
						key.setd_OLD_DELIVERY_CD(msgKey.getKeyValue("d_OLD_DELIVERY_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DELIVERY_CD")) {
						key.setd_NEW_DELIVERY_CD(msgKey.getKeyValue("d_NEW_DELIVERY_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_DELIVERY_CD_CHANGE")) {
						key.setd_DELIVERY_CD_CHANGE(msgKey.getKeyValue("d_DELIVERY_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_PATTERN_CD")) {
						key.setd_OLD_BALA_ACCO_PATTERN_CD(msgKey.getKeyValue("d_OLD_BALA_ACCO_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_PATTERN_CD")) {
						key.setd_NEW_BALA_ACCO_PATTERN_CD(msgKey.getKeyValue("d_NEW_BALA_ACCO_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_BALA_ACCO_PATTERN_CD_CHANGE")) {
						key.setd_BALA_ACCO_PATTERN_CD_CHANGE(msgKey.getKeyValue("d_BALA_ACCO_PATTERN_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_PRIORITY_REF_NO")) {
						key.setd_OLD_CUST_PRIORITY_REF_NO(msgKey.getKeyValue("d_OLD_CUST_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_PRIORITY_REF_NO")) {
						key.setd_NEW_CUST_PRIORITY_REF_NO(msgKey.getKeyValue("d_NEW_CUST_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_PRIORITY_REF_NO_CHANGE")) {
						key.setd_CUST_PRIORITY_REF_NO_CHANGE(msgKey.getKeyValue("d_CUST_PRIORITY_REF_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO")) {
						key.setd_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO(msgKey.getKeyValue("d_OLD_BALA_ACCO_PATTERN_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO")) {
						key.setd_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO(msgKey.getKeyValue("d_NEW_BALA_ACCO_PATTERN_PRIORITY_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_CD_1")) {
						key.setd_OLD_BALA_ACCO_CD_1(msgKey.getKeyValue("d_OLD_BALA_ACCO_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_CD_1")) {
						key.setd_NEW_BALA_ACCO_CD_1(msgKey.getKeyValue("d_NEW_BALA_ACCO_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_BALA_ACCO_CD_1_CHANGE")) {
						key.setd_BALA_ACCO_CD_1_CHANGE(msgKey.getKeyValue("d_BALA_ACCO_CD_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_CD_2")) {
						key.setd_OLD_BALA_ACCO_CD_2(msgKey.getKeyValue("d_OLD_BALA_ACCO_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_CD_2")) {
						key.setd_NEW_BALA_ACCO_CD_2(msgKey.getKeyValue("d_NEW_BALA_ACCO_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("d_BALA_ACCO_CD_2_CHANGE")) {
						key.setd_BALA_ACCO_CD_2_CHANGE(msgKey.getKeyValue("d_BALA_ACCO_CD_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_CD_3")) {
						key.setd_OLD_BALA_ACCO_CD_3(msgKey.getKeyValue("d_OLD_BALA_ACCO_CD_3"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_CD_3")) {
						key.setd_NEW_BALA_ACCO_CD_3(msgKey.getKeyValue("d_NEW_BALA_ACCO_CD_3"));
					}
					if(msgKeyType.containsKeyColumn("d_BALA_ACCO_CD_3_CHANGE")) {
						key.setd_BALA_ACCO_CD_3_CHANGE(msgKey.getKeyValue("d_BALA_ACCO_CD_3_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE")) {
						key.setd_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE(msgKey.getKeyValue("d_BALA_ACCO_PATTERN_PRIORITY_REF_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BILL_ADDRESSEE_FLG")) {
						key.setd_OLD_BILL_ADDRESSEE_FLG(msgKey.getKeyValue("d_OLD_BILL_ADDRESSEE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BILL_ADDRESSEE_FLG")) {
						key.setd_NEW_BILL_ADDRESSEE_FLG(msgKey.getKeyValue("d_NEW_BILL_ADDRESSEE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_BILL_ADDRESSEE_FLG_CHANGE")) {
						key.setd_BILL_ADDRESSEE_FLG_CHANGE(msgKey.getKeyValue("d_BILL_ADDRESSEE_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_RM_FLG")) {
						key.setd_OLD_RM_FLG(msgKey.getKeyValue("d_OLD_RM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_RM_FLG")) {
						key.setd_NEW_RM_FLG(msgKey.getKeyValue("d_NEW_RM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_RM_FLG_CHANGE")) {
						key.setd_RM_FLG_CHANGE(msgKey.getKeyValue("d_RM_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CLAIM_CYCLE_TYP")) {
						key.setd_OLD_CLAIM_CYCLE_TYP(msgKey.getKeyValue("d_OLD_CLAIM_CYCLE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CLAIM_CYCLE_TYP")) {
						key.setd_NEW_CLAIM_CYCLE_TYP(msgKey.getKeyValue("d_NEW_CLAIM_CYCLE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_CLAIM_CYCLE_TYP_CHANGE")) {
						key.setd_CLAIM_CYCLE_TYP_CHANGE(msgKey.getKeyValue("d_CLAIM_CYCLE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TEMP_UNIT_PRICE_SALES_FLG")) {
						key.setd_OLD_TEMP_UNIT_PRICE_SALES_FLG(msgKey.getKeyValue("d_OLD_TEMP_UNIT_PRICE_SALES_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TEMP_UNIT_PRICE_SALES_FLG")) {
						key.setd_NEW_TEMP_UNIT_PRICE_SALES_FLG(msgKey.getKeyValue("d_NEW_TEMP_UNIT_PRICE_SALES_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE")) {
						key.setd_TEMP_UNIT_PRICE_SALES_FLG_CHANGE(msgKey.getKeyValue("d_TEMP_UNIT_PRICE_SALES_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_RM_INP_TYP")) {
						key.setd_OLD_RM_INP_TYP(msgKey.getKeyValue("d_OLD_RM_INP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_RM_INP_TYP")) {
						key.setd_NEW_RM_INP_TYP(msgKey.getKeyValue("d_NEW_RM_INP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_RM_INP_TYP_CHANGE")) {
						key.setd_RM_INP_TYP_CHANGE(msgKey.getKeyValue("d_RM_INP_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_TRN_STOP_FLG")) {
						key.setd_OLD_TRN_STOP_FLG(msgKey.getKeyValue("d_OLD_TRN_STOP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_TRN_STOP_FLG")) {
						key.setd_NEW_TRN_STOP_FLG(msgKey.getKeyValue("d_NEW_TRN_STOP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_TRN_STOP_FLG_CHANGE")) {
						key.setd_TRN_STOP_FLG_CHANGE(msgKey.getKeyValue("d_TRN_STOP_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SET_LT")) {
						key.setd_OLD_SET_LT(msgKey.getKeyValue("d_OLD_SET_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SET_LT")) {
						key.setd_NEW_SET_LT(msgKey.getKeyValue("d_NEW_SET_LT"));
					}
					if(msgKeyType.containsKeyColumn("d_SET_LT_CHANGE")) {
						key.setd_SET_LT_CHANGE(msgKey.getKeyValue("d_SET_LT_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_JANCODE")) {
						key.setd_OLD_JANCODE(msgKey.getKeyValue("d_OLD_JANCODE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_JANCODE")) {
						key.setd_NEW_JANCODE(msgKey.getKeyValue("d_NEW_JANCODE"));
					}
					if(msgKeyType.containsKeyColumn("d_JANCODE_CHANGE")) {
						key.setd_JANCODE_CHANGE(msgKey.getKeyValue("d_JANCODE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_MAX_STOCK_QTY")) {
						key.setd_OLD_MAX_STOCK_QTY(msgKey.getKeyValue("d_OLD_MAX_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_MAX_STOCK_QTY")) {
						key.setd_NEW_MAX_STOCK_QTY(msgKey.getKeyValue("d_NEW_MAX_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_MAX_STOCK_QTY_CHANGE")) {
						key.setd_MAX_STOCK_QTY_CHANGE(msgKey.getKeyValue("d_MAX_STOCK_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_DEADLINE_YEAR")) {
						key.setd_OLD_SHIP_DEADLINE_YEAR(msgKey.getKeyValue("d_OLD_SHIP_DEADLINE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_DEADLINE_YEAR")) {
						key.setd_NEW_SHIP_DEADLINE_YEAR(msgKey.getKeyValue("d_NEW_SHIP_DEADLINE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_DEADLINE_YEAR_CHANGE")) {
						key.setd_SHIP_DEADLINE_YEAR_CHANGE(msgKey.getKeyValue("d_SHIP_DEADLINE_YEAR_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_DEADLINE_MONTH")) {
						key.setd_OLD_SHIP_DEADLINE_MONTH(msgKey.getKeyValue("d_OLD_SHIP_DEADLINE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_DEADLINE_MONTH")) {
						key.setd_NEW_SHIP_DEADLINE_MONTH(msgKey.getKeyValue("d_NEW_SHIP_DEADLINE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_DEADLINE_MONTH_CHANGE")) {
						key.setd_SHIP_DEADLINE_MONTH_CHANGE(msgKey.getKeyValue("d_SHIP_DEADLINE_MONTH_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SHIP_DEADLINE_DAY")) {
						key.setd_OLD_SHIP_DEADLINE_DAY(msgKey.getKeyValue("d_OLD_SHIP_DEADLINE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SHIP_DEADLINE_DAY")) {
						key.setd_NEW_SHIP_DEADLINE_DAY(msgKey.getKeyValue("d_NEW_SHIP_DEADLINE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("d_SHIP_DEADLINE_DAY_CHANGE")) {
						key.setd_SHIP_DEADLINE_DAY_CHANGE(msgKey.getKeyValue("d_SHIP_DEADLINE_DAY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_DLV_LOC_CD")) {
						key.setd_OLD_CUST_DLV_LOC_CD(msgKey.getKeyValue("d_OLD_CUST_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_DLV_LOC_CD")) {
						key.setd_NEW_CUST_DLV_LOC_CD(msgKey.getKeyValue("d_NEW_CUST_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_DLV_LOC_CD_CHANGE")) {
						key.setd_CUST_DLV_LOC_CD_CHANGE(msgKey.getKeyValue("d_CUST_DLV_LOC_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_FLG")) {
						key.setd_OLD_CUST_FLG(msgKey.getKeyValue("d_OLD_CUST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_FLG")) {
						key.setd_NEW_CUST_FLG(msgKey.getKeyValue("d_NEW_CUST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_FLG_CHANGE")) {
						key.setd_CUST_FLG_CHANGE(msgKey.getKeyValue("d_CUST_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DELIVERY_FLG")) {
						key.setd_OLD_DELIVERY_FLG(msgKey.getKeyValue("d_OLD_DELIVERY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DELIVERY_FLG")) {
						key.setd_NEW_DELIVERY_FLG(msgKey.getKeyValue("d_NEW_DELIVERY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_DELIVERY_FLG_CHANGE")) {
						key.setd_DELIVERY_FLG_CHANGE(msgKey.getKeyValue("d_DELIVERY_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BALA_ACCO_FLG")) {
						key.setd_OLD_BALA_ACCO_FLG(msgKey.getKeyValue("d_OLD_BALA_ACCO_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BALA_ACCO_FLG")) {
						key.setd_NEW_BALA_ACCO_FLG(msgKey.getKeyValue("d_NEW_BALA_ACCO_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_BALA_ACCO_FLG_CHANGE")) {
						key.setd_BALA_ACCO_FLG_CHANGE(msgKey.getKeyValue("d_BALA_ACCO_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_UNIT_COST_USE_TYP")) {
						key.setd_OLD_UNIT_COST_USE_TYP(msgKey.getKeyValue("d_OLD_UNIT_COST_USE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_UNIT_COST_USE_TYP")) {
						key.setd_NEW_UNIT_COST_USE_TYP(msgKey.getKeyValue("d_NEW_UNIT_COST_USE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_UNIT_COST_USE_TYP_CHANGE")) {
						key.setd_UNIT_COST_USE_TYP_CHANGE(msgKey.getKeyValue("d_UNIT_COST_USE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_TARGET_NAME_1")) {
						key.setd_OLD_PAY_TARGET_NAME_1(msgKey.getKeyValue("d_OLD_PAY_TARGET_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_TARGET_NAME_1")) {
						key.setd_NEW_PAY_TARGET_NAME_1(msgKey.getKeyValue("d_NEW_PAY_TARGET_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_TARGET_NAME_1_CHANGE")) {
						key.setd_PAY_TARGET_NAME_1_CHANGE(msgKey.getKeyValue("d_PAY_TARGET_NAME_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_METHOD_1")) {
						key.setd_OLD_PAY_METHOD_1(msgKey.getKeyValue("d_OLD_PAY_METHOD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_METHOD_1")) {
						key.setd_NEW_PAY_METHOD_1(msgKey.getKeyValue("d_NEW_PAY_METHOD_1"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_METHOD_1_CHANGE")) {
						key.setd_PAY_METHOD_1_CHANGE(msgKey.getKeyValue("d_PAY_METHOD_1_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_PAY_TARGET_NAME_2")) {
						key.setd_OLD_PAY_TARGET_NAME_2(msgKey.getKeyValue("d_OLD_PAY_TARGET_NAME_2"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_PAY_TARGET_NAME_2")) {
						key.setd_NEW_PAY_TARGET_NAME_2(msgKey.getKeyValue("d_NEW_PAY_TARGET_NAME_2"));
					}
					if(msgKeyType.containsKeyColumn("d_PAY_TARGET_NAME_2_CHANGE")) {
						key.setd_PAY_TARGET_NAME_2_CHANGE(msgKey.getKeyValue("d_PAY_TARGET_NAME_2_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_BUSINESS_WH_FLG")) {
						key.setd_OLD_BUSINESS_WH_FLG(msgKey.getKeyValue("d_OLD_BUSINESS_WH_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_BUSINESS_WH_FLG")) {
						key.setd_NEW_BUSINESS_WH_FLG(msgKey.getKeyValue("d_NEW_BUSINESS_WH_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_BUSINESS_WH_FLG_CHANGE")) {
						key.setd_BUSINESS_WH_FLG_CHANGE(msgKey.getKeyValue("d_BUSINESS_WH_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_REPRESENT_FLG")) {
						key.setd_OLD_REPRESENT_FLG(msgKey.getKeyValue("d_OLD_REPRESENT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_REPRESENT_FLG")) {
						key.setd_NEW_REPRESENT_FLG(msgKey.getKeyValue("d_NEW_REPRESENT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_REPRESENT_FLG_CHANGE")) {
						key.setd_REPRESENT_FLG_CHANGE(msgKey.getKeyValue("d_REPRESENT_FLG_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SPCL_PRICE_TYP")) {
						key.setd_OLD_SPCL_PRICE_TYP(msgKey.getKeyValue("d_OLD_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SPCL_PRICE_TYP")) {
						key.setd_NEW_SPCL_PRICE_TYP(msgKey.getKeyValue("d_NEW_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_SPCL_PRICE_TYP_CHANGE")) {
						key.setd_SPCL_PRICE_TYP_CHANGE(msgKey.getKeyValue("d_SPCL_PRICE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_UNIT_CD")) {
						key.setd_OLD_UNIT_CD(msgKey.getKeyValue("d_OLD_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_UNIT_CD")) {
						key.setd_NEW_UNIT_CD(msgKey.getKeyValue("d_NEW_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_UNIT_CD_CHANGE")) {
						key.setd_UNIT_CD_CHANGE(msgKey.getKeyValue("d_UNIT_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_EFF_PHASE_OUT_DATE")) {
						key.setd_OLD_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("d_OLD_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_EFF_PHASE_OUT_DATE")) {
						key.setd_NEW_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("d_NEW_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_EFF_PHASE_OUT_DATE_CHANGE")) {
						key.setd_EFF_PHASE_OUT_DATE_CHANGE(msgKey.getKeyValue("d_EFF_PHASE_OUT_DATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SALE_SIZE")) {
						key.setd_OLD_SALE_SIZE(msgKey.getKeyValue("d_OLD_SALE_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SALE_SIZE")) {
						key.setd_NEW_SALE_SIZE(msgKey.getKeyValue("d_NEW_SALE_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("d_SALE_SIZE_CHANGE")) {
						key.setd_SALE_SIZE_CHANGE(msgKey.getKeyValue("d_SALE_SIZE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_SIZE")) {
						key.setPUCH_SIZE(msgKey.getKeyValue("PUCH_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD")) {
						key.setBILL_ADDRESSEE_CD(msgKey.getKeyValue("BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STL_COND_CD")) {
						key.setSTL_COND_CD(msgKey.getKeyValue("STL_COND_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RESERVE_CD")) {
						key.setEXCH_RESERVE_CD(msgKey.getKeyValue("EXCH_RESERVE_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_START_DATE")) {
						key.setEXCH_START_DATE(msgKey.getKeyValue("EXCH_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BANK_CD")) {
						key.setBANK_CD(msgKey.getKeyValue("BANK_CD"));
					}
					if(msgKeyType.containsKeyColumn("B_ACCT_CTRL_CD")) {
						key.setB_ACCT_CTRL_CD(msgKey.getKeyValue("B_ACCT_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_ACCT_CD")) {
						key.setSUB_ACCT_CD(msgKey.getKeyValue("SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TRF_TYP")) {
						key.setTRF_TYP(msgKey.getKeyValue("TRF_TYP"));
					}
					if(msgKeyType.containsKeyColumn("FB_FLG")) {
						key.setFB_FLG(msgKey.getKeyValue("FB_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CONTENTS_TYP")) {
						key.setCONTENTS_TYP(msgKey.getKeyValue("CONTENTS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INFO_TYP")) {
						key.setINFO_TYP(msgKey.getKeyValue("INFO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VALID_START_DATE")) {
						key.setVALID_START_DATE(msgKey.getKeyValue("VALID_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MIN_AMOUNT")) {
						key.setMIN_AMOUNT(msgKey.getKeyValue("MIN_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PAY_METHOD_CD")) {
						key.setPAY_METHOD_CD(msgKey.getKeyValue("PAY_METHOD_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_PATTERN_CD")) {
						key.setPAY_PATTERN_CD(msgKey.getKeyValue("PAY_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("PATTERN_CD")) {
						key.setPATTERN_CD(msgKey.getKeyValue("PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_1")) {
						key.setCLASS_1(msgKey.getKeyValue("CLASS_1"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_2")) {
						key.setCLASS_2(msgKey.getKeyValue("CLASS_2"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_3")) {
						key.setCLASS_3(msgKey.getKeyValue("CLASS_3"));
					}
					if(msgKeyType.containsKeyColumn("LOGIN_USER_CD")) {
						key.setLOGIN_USER_CD(msgKey.getKeyValue("LOGIN_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD")) {
						key.setACCT_CD(msgKey.getKeyValue("ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("BANK_BR_CD")) {
						key.setBANK_BR_CD(msgKey.getKeyValue("BANK_BR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BRANCH_CD")) {
						key.setBRANCH_CD(msgKey.getKeyValue("BRANCH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PURPOSE_UNIT_PRICE_TYP")) {
						key.setPURPOSE_UNIT_PRICE_TYP(msgKey.getKeyValue("PURPOSE_UNIT_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_SIZE")) {
						key.setSALES_UNIT_SIZE(msgKey.getKeyValue("SALES_UNIT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_DESINATED_DLV_LOC_CD")) {
						key.setCUST_DESINATED_DLV_LOC_CD(msgKey.getKeyValue("CUST_DESINATED_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_OPTION_CHANGE_VALUE")) {
						key.setDLV_LOC_OPTION_CHANGE_VALUE(msgKey.getKeyValue("DLV_LOC_OPTION_CHANGE_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEQNO")) {
						key.setSEQNO(msgKey.getKeyValue("SEQNO"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_STATUS")) {
						key.setSTOCK_STATUS(msgKey.getKeyValue("STOCK_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("DELIVERY_CD")) {
						key.setDELIVERY_CD(msgKey.getKeyValue("DELIVERY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BALA_ACCO_PATTERN_CD")) {
						key.setBALA_ACCO_PATTERN_CD(msgKey.getKeyValue("BALA_ACCO_PATTERN_CD"));
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
