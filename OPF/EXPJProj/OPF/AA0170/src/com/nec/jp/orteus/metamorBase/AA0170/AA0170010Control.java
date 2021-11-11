/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0170/src/com/nec/jp/orteus/metamorBase/AA0170/AA0170010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0170;

import com.nec.jp.orteus.metamorBase.AA0170.*;
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
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import java.util.ArrayList;
import java.text.ParseException;
import java.math.BigDecimal;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0170010Control
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
        protected List list;										    // 結果リストのインスタンス
        public List getList() { return this.list; }					     // リストを返します。
        public void setList(List listname) { this.list = listname; }    // リストをセットします。
        public int getListsize() {									      // リスト型のサイズを返します。
         int nret = 0;
         if ( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }  // リストの値（メディエータ）を返します。
       
        public AA0170010Struct getStruct() { return this.struct; }      // Structの値（メディエータ）を返します。
       
    //------------------------------------------------------------------------------
       
    /** 画面共通定義取得クラス */
    ScreenParam _scParam = sp;
     
    //---------- 初期展開レベル ---------------------------------------------------
       
    /** 最大展開レベル */
    String _level = null;
      
    /** 初期展開レベル */
    String _initlevel = null;
    
    //---------- 登録済フラグ
    
    /** 登録済み */
    String _REGISTED = "1";
    
    /** 未登録 */
    String _NOT_REGISTED = "0";
    
       
    //---------- コンボボックスデータ取得関連の処理 -------------------------------
       
    /** 展開区分 */
    ComboStruct _DEVELOP_TYP = new ComboStruct();
       
    /** 展開区分設定
     * @param コンボボックスデータ
    */
    public void setDEVELOP_TYP(ComboStruct combo) { _DEVELOP_TYP = combo; }
       
    /** 展開区分取得
     * @return 展開区分のコンボボックスデータ
    */
    public ComboStruct getDEVELOP_TYP() { return _DEVELOP_TYP; }
     
        
    /** 支給区分 */
    ComboStruct _CONS_TYP = new ComboStruct();
       
    /** 支給区分設定
     * @param コンボボックスデータ
    */
    public void setCONS_TYP(ComboStruct combo) { _CONS_TYP = combo; }
       
    /** 支給区分取得
     * @return 支給区分のコンボボックスデータ
    */
    public ComboStruct getCONS_TYP() { return _CONS_TYP; }
       
       
    /** 原価積み上げ有無 */
    ComboStruct _COST_UP_TYP = new ComboStruct();
       
    /** 原価積み上げ有無 設定
     * @param コンボボックスデータ
    */
    public void setCOST_UP_TYP(ComboStruct combo) { _COST_UP_TYP = combo; }
       
    /** 原価積み上げ有無 取得
     * @return 原価積み上げ有無 のコンボボックスデータ
    */
    public ComboStruct getCOST_UP_TYP() { return _COST_UP_TYP; }
             
    /** MRP展開有無 */
    ComboStruct _MRP_EXP_TYP = new ComboStruct();
        
    /** MRP展開有無設定
     * @param コンボボックスデータ
    */
    public void setMRP_EXP_TYP(ComboStruct combo) { _MRP_EXP_TYP = combo; }
       
    /** MRP展開有無取得
     * @return MRP展開有無のコンボボックスデータ
    */
    public ComboStruct getMRP_EXP_TYP() { return _MRP_EXP_TYP; }  
    
// 2008/07/16 SYSCOM 小林 ADD START
    /** 工数管理品目区分 */
    ComboStruct _MANHOUR_TYP = new ComboStruct();
    
    /** 工数管理品目区分設定
     * @param コンボボックスデータ
    */
    public void setMANHOUR_TYP(ComboStruct combo){ _MANHOUR_TYP = combo; }
    
    /** 工数管理品目区分
     * @return 工数管理品目区分のコンボボックスデータ
    */
    public ComboStruct getMANHOUR_TYP(){ return _MANHOUR_TYP; }
// 2008/07/16 SYSCOM 小林 ADD END
       
    /** 製品構成L/Tの使用有無 */
    ComboStruct _PS_LT_FLG = new ComboStruct();
        
    /** 製品構成L/Tの使用有無設定
     * @param コンボボックスデータ
    */
    public void setPS_LT_FLG(ComboStruct combo) { _PS_LT_FLG = combo; }
       
    /** 製品構成L/Tの使用有無取得
     * @return 製品構成L/Tの使用有無のコンボボックスデータ
    */
    public ComboStruct getPS_LT_FLG() { return _PS_LT_FLG; }

    /** 品目手配区分 */
    ComboStruct _MRP_ODR_TYP = new ComboStruct();
   
    /** 品目手配区分設定
     * @param コンボボックスデータ
     */
    public void setMRP_ODR_TYP_comb(ComboStruct combo) { _MRP_ODR_TYP = combo; }
   
    /** 品目手配区分取得
     * @return 品目手配区分のコンボボックスデータ
     */
    public ComboStruct getMRP_ODR_TYP_comb() { return _MRP_ODR_TYP; }
   
    /** 内外作区分(品目別・作業系列別) */
    ComboStruct _OUTSIDE_TYP = new ComboStruct();
   
    /** 内外作区分設定
     * @param コンボボックスデータ
    */
    public void setOUTSIDE_TYP_comb(ComboStruct combo) { _OUTSIDE_TYP = combo; }
   
    /** 内外作区分取得
     * @return 内外作区分のコンボボックスデータ
    */
    public ComboStruct getOUTSIDE_TYP_comb() { return _OUTSIDE_TYP; }
   
    /** 品目別作業実績区分 */
    ComboStruct _OPR_RSLT_TYP = new ComboStruct();
   
    /** 品目別作業実績区分設定
     * @param コンボボックスデータ
    */
    public void setOPR_RSLT_TYP_comb(ComboStruct combo) { _OPR_RSLT_TYP = combo; }
   
    /** 品目別作業実績区分取得
     * @return 品目別作業実績区分のコンボボックスデータ
    */
    public ComboStruct getOPR_RSLT_TYP_comb() { return _OPR_RSLT_TYP; }
   
    /** 受入検査区分 */
    ComboStruct _ACPT_INSPC_TYP = new ComboStruct();
       
    /** 受入検査区分設定
     * @param コンボボックスデータ
     */
    public void setACPT_INSPC_TYP_comb(ComboStruct combo) { _ACPT_INSPC_TYP = combo; }
       
    /** 受入検査区分取得
     * @return 受入検査区分のコンボボックスデータ
     */
    public ComboStruct getACPT_INSPC_TYP_comb() { return _ACPT_INSPC_TYP; }
 
    /** 作業系列固定分リードタイム単位 */
    ComboStruct _PROC_GRP_LT_UNIT = new ComboStruct();
       
    /** 作業系列固定分リードタイム単位設定
     * @param コンボボックスデータ
     */
    public void setPROC_GRP_LT_UNIT_comb(ComboStruct combo) { _PROC_GRP_LT_UNIT = combo; }
       
    /** 作業系列固定分リードタイム単位取得
     * @return 作業系列固定分リードタイム単位のコンボボックスデータ
     */
    public ComboStruct getPROC_GRP_LT_UNIT_comb() { return _PROC_GRP_LT_UNIT; }
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
    private void setComboData(AA0170010Struct data) throws ExpjException {
    	
    	ComboBox comboController = new ComboBox(conn, sysUSER_CD);
    	
    	try {
    		
    		//コンボデータの取得
    		ComboStruct OUTSIDE_TYP_comb = comboController.getData("OUTSIDE_TYP");
    		ComboStruct ACPT_INSPC_TYP_comb = comboController.getData("ACPT_INSPC_TYP");
   
    		comboController.setConnection(null);
   
    		//属性に取得データ設定
    		setOUTSIDE_TYP_comb(OUTSIDE_TYP_comb);
    		setACPT_INSPC_TYP_comb(ACPT_INSPC_TYP_comb);
   
    	} catch(SQLException e) {
    		setSqlExceptionMsg(e);
   
    	} catch(ComboException e) {
    		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
    		sysLog.severe(emsg, getsysUSER_CD());
    		ExpjException ee = new ExpjException(e, emsg);
    		throw ee;
    	}
    }
    
	/**
	 * 区分名取得
	 * @param comboStruct 区分情報リスト
	 * @param strTyp 区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp) {
	 
		if (comboStruct == null || strTyp == null) {
			return null;
		}
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (strTyp.equals((String)(comboStruct.getValList().get(i))) == true) {
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		if (strTypName == null) {
			strTypName = strTyp;
		}
		return strTypName;
	}
       
        /**
         * 製品構成情報のフラグの表示を設定
         * @param s フラグの値が設定されている情報、表示を設定する情報
         */
        private void setTypeValueAboutPs(AA0170010Struct s)
        {
         s.setps_CONS_NAME(getTypeName(_CONS_TYP,s.getps_CONS_TYP()));
         s.setps_PS_LT_NAME(getTypeName(_PS_LT_FLG,s.getps_PS_LT_FLG()));
         s.setps_COST_UP_NAME(getTypeName(_COST_UP_TYP,s.getps_COST_UP_TYP()));
         s.setps_MRP_EXP_NAME(getTypeName(_MRP_EXP_TYP,s.getps_MRP_EXP_TYP()));
// 2008/07/16 SYSCOM 小林 ADD START
         s.setps_COMP_MANHOUR_NAME(getTypeName(_MANHOUR_TYP,s.getps_COMP_MANHOUR_TYP()));
// 2008/07/16 SYSCOM 小林 ADD END
        }
       
       //---------- 親子画面関連の処理 -------------------------------------------
       
        /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
        private AA0170010Struct _keyStruct = new AA0170010Struct();
       
        /** キー情報Structの取得 */
        public AA0170010Struct getKeyStruct() { return _keyStruct; }
        
        /** キー情報Structの設定 */
        public void setKeyStruct(AA0170010Struct struct) { _keyStruct.copy(struct); }
       
       
       //---------- 追加・更新時の入力値チェック--------------------------------------
       
	/** 
	 * サブ１画面入力値チェック。
	 * NOT NULL項目に値が入っていない場合、デフォルト値を設定する
	 * @param checkStruct チェック対象のStruct
	 */
	private void checkInputSub1(AA0170010Struct checkStruct) {
		// 照会順序
		if (checkStruct.getsub1_PS_REF_NO() == null
				|| "".equals(checkStruct.getsub1_PS_REF_NO())) {
			checkStruct.setsub1_PS_REF_NO(AA0170Common._PS_REF_NO);
		}
			
		// 構成仕損率
		if (checkStruct.getsub1_PS_SPOIL() == null
				|| "".equals(checkStruct.getsub1_PS_SPOIL())) {
			checkStruct.setsub1_PS_SPOIL(AA0170Common._PS_SPOIL);
		}
		
        // 構成固定分リードタイム
		if (checkStruct.getsub1_PS_FIXED_LT() == null
				|| "".equals(checkStruct.getsub1_PS_FIXED_LT())) {
			checkStruct.setsub1_PS_FIXED_LT(AA0170Common._PS_FIXED_LT);
		}

		// 構成比例分リードタイム
		if (checkStruct.getsub1_PS_PROP_LT() == null
				|| "".equals(checkStruct.getsub1_PS_PROP_LT())) {
			checkStruct.setsub1_PS_PROP_LT(AA0170Common._PS_PROP_LT);
		}
        // 構成比例分ロットサイズ
		
		if (checkStruct.getsub1_PS_PROP_LOT_SIZE() == null
				|| "".equals(checkStruct.getsub1_PS_PROP_LOT_SIZE())) {
			checkStruct.setsub1_PS_PROP_LOT_SIZE(AA0170Common._PS_PROP_LOT_SIZE);
        }
	}

    /**
     * サブ２画面入力値チェック。
     * NOT NULL項目に値が入っていない場合、初期値を設定する
     * @param checkStruct チェック対象のStruct
     */
    private void checkInputSub2(AA0170010Struct checkStruct) {
    	
    	// 作業系列番号
    	if (checkStruct.getsub2_PROC_NO() == null
    			|| "".equals(checkStruct.getsub2_PROC_NO())) {
    		checkStruct.setsub2_PROC_NO(AA0170Common._PR_PROC_NO);
    	}
     
    	// 作業系列固定分リードタイム
    	if (checkStruct.getsub2_FIXED_LT() == null
    			|| "".equals(checkStruct.getsub2_FIXED_LT())) {
    		checkStruct.setsub2_FIXED_LT(AA0170Common._PR_FIXED_LT);
    	}
    	 
    	// 作業系列比例分リードタイム
    	if (checkStruct.getsub2_PROP_LT() == null
    			|| "".equals(checkStruct.getsub2_PROP_LT())) {
    		checkStruct.setsub2_PROP_LT(AA0170Common._PR_PROP_LT);	
    	}
     
    	// 作業系列安全日数
    	if (checkStruct.getsub2_SAFETY_LT() == null
    			|| "".equals(checkStruct.getsub2_SAFETY_LT())) {
    		checkStruct.setsub2_SAFETY_LT(AA0170Common._PR_SAFETY_LT);
    	}
   
    	// 作業系列比例分ロットサイズ
    	if (checkStruct.getsub2_PROP_LOT_SIZE() == null
    			|| "".equals(checkStruct.getsub2_PROP_LOT_SIZE())) {
    		checkStruct.setsub2_PROP_LOT_SIZE(AA0170Common._PR_PROP_LOT_SIZE);
    	}
    	
    	// 作業系列仕損率
    	if (checkStruct.getsub2_SPOIL() == null
    			|| "".equals(checkStruct.getsub2_SPOIL())) {
    		checkStruct.setsub2_SPOIL(AA0170Common._PR_SPOIL);
    	}
    	
    	// 標準工数
    	if (checkStruct.getsub2_STANDARD_COST() == null
    			|| "".equals(checkStruct.getsub2_STANDARD_COST())) {
    		checkStruct.setsub2_STANDARD_COST(AA0170Common._PR_STANDARD_COST);
    	} 	
    }
	  /**    
	  * check 日付形式：yyyy/MM/dd
	  * @param sourceDate    
	  * @return    
	  */     
	  public static boolean checkDate(String sourceDate){     
		  if(sourceDate==null){     
			  return false;     
		  }     
		  try {     
			  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");     
			  dateFormat.setLenient(false);     
			  dateFormat.parse(sourceDate);     
		  return true;     
		  } catch (Exception e) {   
			  
		  }     
		  return false;     
	  }  
       //---------- メッセージ関連の処理-- --------------------------------------------
       
	/**
	 * メッセージ取得 
	 * @return メッセージ
	 */
	public MessageStruct getMessage() {
	
		return msgStruct;
   
	}
       
	/**
	 * メッセージ設定
	 * @param メッセージ
	 */
	public void setMessage(MessageStruct msg) {
		
		msgStruct = msg;
        
	}
       
       //---------- ルーピングチェック処理 -------------------------------------------
       
	/**
	 * ルーピングチェック。逆展開を行い同品目番号が存在 有無
	 * @param repository 製品構成リポジトリ
	 * @param checkItem 対象品目番号
	 * @param item 比較する品目番号
	 * @return true:有  false:無
	 */
	private boolean checkReverseRooping(ProductStructureRepository repository, 
				String targetItem, String item)
				throws SQLException {
		// 親品目番号一覧取得
		ArrayList itemList = repository.reverseDeployment(item);
		checkItemList(itemList);
       
		for (int i = 0; i < itemList.size(); i++) {
			if (targetItem.equals((String)itemList.get(i)) == false) {
				// 親品目番号一覧から更に上の親品目取得
				boolean result = checkReverseRooping(repository, 
														targetItem, 
														(String)itemList.get(i));
				if (result == true) {
					return true;
				}
			} else {
				return true;
			}
       	}
		return false;
	}
       
       
	/**
	 * ルーピングチェック。正展開を行い同品目番号が存在 有無
	 * @param repository 製品構成リポジトリ
	 * @param checkItem 対象品目番号
	 * @param item 比較する品目番号
	 * @return true:有  false:無
	 */
	private boolean checkRooping(ProductStructureRepository repository, 
	        String targetItem, String item)
			throws SQLException {
		// 子品目番号一覧取得
		ArrayList itemList = repository.orderDeployment(item);
		checkItemList(itemList);
       
		for (int i = 0; i < itemList.size(); i++) {
			if (targetItem.equals((String)itemList.get(i)) == false) {
				// 子品目番号一覧から更に下の子品目取得
				boolean result = checkRooping(repository, 
												targetItem, 
												(String)itemList.get(i));
				if (result == true) {
					return true;
				}
			} else {
				return true;
			}
		}
         	return false;
	}
       
       //---------- 有効日の重複チェック処理 -----------------------------------------
       
	/**
	 * 有効日の重複チェック
	 * @param parentItem 親品目番号
	 * @param compItem   子品目番号
	 * @param psedition  構成版数
	 * @param inDate     有効開始日
	 * @param outDate    有効終了日
	 * @return true:OK   false:NG
	*/
	private boolean checkEffectiveDate_update(String parentItem, String compItem, String psedition,
			String inDate, String outDate)
			throws SQLException, FoundationException, ParseException {
		
		// 親品目、子品目が一致する構成情報取得
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setPARENT_ITEM_CD(parentItem);
		workStruct.setCOMP_ITEM_CD(compItem);
		List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
       
		// 同構成情報は比較対象から削除
		for (int i = 0; i < dateList.size(); i++) {
			AA0170010Struct checkStruct = (AA0170010Struct)dateList.get(i);
			if (parentItem.equals(checkStruct.getPARENT_ITEM_CD()) &&
					compItem.equals(checkStruct.getCOMP_ITEM_CD()) &&
					psedition.equals(checkStruct.getPS_EDITION())) {
				dateList.remove(i);
				break;
			}
		}
		return checkEffectiveDate(dateList, inDate, outDate);
	}
       
	/**
	 * 有効日の重複チェック
	 * @param parentItem 親品目番号
	 * @param compItem 子品目番号
	 * @param inDate 有効開始日
	 * @param outDate 有効終了日
	 * @return true:OK  false:NG
	 */
	private boolean checkEffectiveDate_insert(String parentItem, String compItem,
			String inDate, String outDate)
			throws SQLException, FoundationException, ParseException {
   
		// 親品目、子品目が一致する構成情報取得
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setPARENT_ITEM_CD(parentItem);
		workStruct.setCOMP_ITEM_CD(compItem);
		List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
		return checkEffectiveDate(dateList, inDate, outDate);
    }
       
	/**
	 * 有効日の重複チェック
	 * @param dateList 重複チェックする構成情報
	 * @param inDate 有効開始日
	 * @param outDate 有効終了日
	 * @return true:OK  false:NG
	*/
    private boolean checkEffectiveDate(List dateList, String inDate, String outDate)
    	throws SQLException, FoundationException, ParseException {
         
    	boolean result = true;	  // チェック結果格納
    	Date d_inDate = stringToDate(inDate);
    	Date d_outDate = stringToDate(outDate);
    	for (int i = 0; i < dateList.size(); i++) {
    		String targetInDate = ((AA0170010Struct)dateList.get(i)).getEFF_PHASE_IN_DATE();
    		String targetOutDate = ((AA0170010Struct)dateList.get(i)).getEFF_PHASE_OUT_DATE();
       
    		Date d_targetInDate = stringToDate(targetInDate);
    		Date d_targetOutDate =  stringToDate(targetOutDate);
       
    		if (d_targetInDate.getTime() > d_inDate.getTime()) {
    			// 開始日付 ＞ チェック対象の開始日付の場合
    			if (d_targetInDate.getTime() <= d_outDate.getTime()) {
    				// 開始日付 ＜ チェック対象の終了日付の場合
    				result = false;
    				break;
    			}
    		} else if (d_targetInDate.getTime() < d_inDate.getTime()) {
    			// 開始日付 ＞ チェック対象の終了日付の場合
    			if (d_targetOutDate.getTime() >= d_inDate.getTime()) {
    				// チェック対象の終了日付 ＞＝ 開始日付
    				result = false;
    				break;
    			}
    		} else {
    			// 開始日付 == チェック対象の開始日付
    			result = false;
    			break;
    		}
    	}
    	return result;
    }
       
       
       //---------- 品目手配区分構成チェック処理 -------------------------------------
       
	/**
	 * 品目手配区分別構成チェック
	 * @param repository 製品構成リポジトリ
	 * @param parent 親品目番号
	 * @param comp 子品目番号
	 * @return true：OK  false:NG
	*/
	private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
        			String parent, String comp)
         			throws SQLException, FoundationException {
        	
       	AA0170010Struct workStruct = new AA0170010Struct();
       	List workList      = null;
       	Integer parent_typ = null;
       	Integer comp_typ   = null;
   
       	// 親の手配区分取得
       	workStruct.setITEM_CD(parent);
       	workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
       	parent_typ = ((AA0170010Struct)workList.get(0)).getMRP_ODR_TYP();
   
       	// 子の手配区分取得
       	workStruct.setITEM_CD(comp);	
       	workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
       	comp_typ = ((AA0170010Struct)workList.get(0)).getMRP_ODR_TYP();
       	//  親品目 ④マニュアル手配品目、⑤ロット手配品目、⑥定量手配品目、⑦発注点手配品目
	   	if (parent_typ.intValue() == 4 || parent_typ.intValue() == 5 ||
	   			parent_typ.intValue() == 6 || parent_typ.intValue() == 7) {
	
	   		//  子品目 ①個別品目 ②在庫引当型個別品目
	   		if (comp_typ.intValue() == 1 || comp_typ.intValue() == 2) return false;
	   	}
         
        ArrayList itemList = null;
        // 親品目 ⑧擬似品目
        if (parent_typ.intValue() == 8) {
        	// 子品目 ⑧擬似品目
        	if (comp_typ.intValue() == 8) {
        		return false;
        	} else if (comp_typ.intValue() == 4 || comp_typ.intValue() == 5 ||
        			comp_typ.intValue() == 6 || comp_typ.intValue() == 7) {
        	} else {
        		// 親品目が子品目となる構成情報の親品目取得
        		itemList = repository.reverseDeployment(parent);
        		checkItemList(itemList);
        		
        		for (int i = 0; i < itemList.size(); i++) {
        			// 取得した親品目の手配区分取得
        			workStruct.setITEM_CD((String)itemList.get(i));
        			List parentList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
        			Integer typ = ((AA0170010Struct)parentList.get(0)).getMRP_ODR_TYP();
            
        			if (typ.intValue() == 4 || typ.intValue() == 5 ||
        					typ.intValue() == 6 || typ.intValue() == 7) return false;
        		}
        	}
        }
       
        // 子品目 ⑧擬似品目
        if (comp_typ.intValue() == 8) {
        	// 親品目 ⑧擬似品目
        	if (parent_typ.intValue() == 8) {
        		return false;
        	} else if (parent_typ.intValue() == 1 || parent_typ.intValue() == 2) {
        		return true;
        	} else {
        		// 子品目が親品目となる構成情報の子品目取得
        		itemList = repository.orderDeployment(comp);
        		checkItemList(itemList);
        		for (int i = 0; i < itemList.size(); i++) {
        			// 取得した子品目の手配区分取得
        			workStruct.setITEM_CD((String)itemList.get(i));
        			List compList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
        			Integer typ = ((AA0170010Struct)compList.get(0)).getMRP_ODR_TYP();
            
        			if (typ.intValue() == 1 || typ.intValue() == 2 ) {
        				return false;
        			}
        		}
        	}
        }
         return true;
        }
       
       
       //---------- 製品構成レポジトリ関連の処理 -------------------------------------------
       
	/** 重複チェック
	 * @param itemList 重複チェックする品目リスト
	 */
	private void checkItemList(ArrayList itemList) {
		
		List workList = new ArrayList(0);
		for (int i = 0; i < itemList.size(); i++) {
			boolean result =true;
			String item_cd = (String)itemList.get(i);
		
			for (int t = 0; t < workList.size(); t++) {
				
				if (item_cd.equals((String)workList.get(t)) == true) {
					result = false;
				}
			}
				if (result == true) {
					workList.add(item_cd);
				}
		}
       
		itemList.clear();
		for (int i = 0; i < workList.size(); i++) {
			itemList.add(workList.get(i));
		}
	}
       
       
       //---------- 製品構成取得関連の処理 -------------------------------------------
       
    /** 製品構成リスト */
    private List _deployList = new ArrayList(0);
       
    /** 製品構成リスト取得 
     * @return 製品構成リスト
     */
    public List getDeployList() { return _deployList; }
       
    /** 作業系列リスト */
    private List _procedureList = new ArrayList(0);
       
    /** 作業系列リスト取得 
     * @return 作業系列リスト
     */
    public List getProcedureList() { return _procedureList; }
    
    /** 払出リスト */
    /*private List _issueList = new ArrayList(0);*/
       
    /** 払出リスト取得 
     * @return 払出リスト
     
    public List getIssueList() { return _issueList; }*/

        
    /**
     * Date型 ⇒ String型。
     * @return String YYYY/MM/DD形式
     */
    public String dateToString(Date date) {
    	return Converter.dateToStr(date, "yyyy/MM/dd");
    }
       
    /**
     * String型 ⇒ Date型。
     * @return Date 
     */
    public Date stringToDate(String date) throws ParseException {
    	return Converter.strToDate(date, "yyyy/MM/dd");
    }
       
       
    //---------- 正展開 --------------------------------------------------------
       
	/** 正展開  
	 * @param repository 製品構成リポジトリ
	 * @param item 親品目
	 * @param inLevel 展開レベル
	 * @param tagetDate 対象日付
	 * @param no 階層レベル
	*/
	public void getDeploy(ProductStructureRepository repository, 
			String item, int inLevel, Date targetDate, Integer no)
	        throws SQLException, FoundationException {
   
		// 子品目番号一覧取得
		ArrayList itemList = repository.orderDeployment(item, targetDate);
		checkItemList(itemList);
   
		// 親品目と子品目の構成情報取得
		ArrayList deployList = new ArrayList(0);
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setPARENT_ITEM_CD(item);
		workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
		workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));
		for (int i = 0; i < itemList.size(); i++) {
			workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
			List workList = entity.mselectM_PS.read(conn, workStruct);
		
			for (int t = 0; t < workList.size(); t++) {
				deployList.add((AA0170010Struct)(workList.get(t)));
			}
		}
		   
		// 展開レベルチェック
		if (inLevel <= 1) {
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(no.intValue()));
				_deployList.add(deployList.get(i));
			}
		} else {
			// 構成情報から更に下の子品目取得
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(no.intValue()));
				_deployList.add(deployList.get(i));
				getDeploy(repository, 
						((AA0170010Struct)deployList.get(i)).getps_COMP_ITEM_CD(),
						inLevel - 1,
						targetDate,
						new Integer(no.intValue() + 1));
			}
		}
	}
             
        //---------- 逆展開 --------------------------------------------------------
       
	/** 逆展開 対象日付あり 
	 * @param repository 製品構成リポジトリ
	 * @param item 子品目
	 * @param inLevel 展開レベル
	 * @param tagetDate 対象日付
	 * @param j 階層レベル
	*/
    public void getReverseDeploy(ProductStructureRepository repository, 
    		String item, int inLevel, Date targetDate, int j)
    		throws SQLException, FoundationException {
   
		// 親品目番号一覧取得
		ArrayList itemList = repository.reverseDeployment(item, targetDate);
		checkItemList(itemList);
		   
		// 親品目と子品目の構成情報取得
		ArrayList deployList = new ArrayList(0);
		AA0170010Struct workStruct = new AA0170010Struct();
		workStruct.setCOMP_ITEM_CD(item);
		workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
		workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));

		for (int i = 0; i < itemList.size(); i++) {
			workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
			List workList = entity.mselectM_PS.read(conn, workStruct);
			
			for (int t = 0; t < workList.size(); t++) {
				deployList.add((AA0170010Struct)(workList.get(t)));
			}
		}
   
		// 展開レベルチェック
		if (inLevel <= 1) {
			// 最大展開レベル
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(j));
				_deployList.add(deployList.get(i));
			}
		} else {
			// 構成情報から更に上の親品目取得
			for (int i = 0; i < deployList.size(); i++) {
				AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
				noStruct.setps_NO(Integer.toString(j));
				_deployList.add(deployList.get(i));
				getReverseDeploy(repository, 
						((AA0170010Struct)deployList.get(i)).getps_PARENT_ITEM_CD(),
						inLevel - 1,
						targetDate,
						j + 1);
			}
		}
    }
   
       
	/** 逆展開 対象日付なし 
	 * @param repository 製品構成リポジトリ
	 * @param item 子品目
	 * @param deployLevel 展開レベル
	 * @param no 階層レベル
	*/
    public void getReverseDeploy(ProductStructureRepository repository, 
    		String item, Integer deployLevel, Integer no)
    		throws SQLException, FoundationException {
       
    	// 親品目番号一覧取得
    	ArrayList itemList = repository.reverseDeployment(item);
    	checkItemList(itemList);
       
    	// 親品目と子品目の構成情報取得
    	ArrayList deployList = new ArrayList(0);
    	AA0170010Struct workStruct = new AA0170010Struct();
    	workStruct.setCOMP_ITEM_CD(item);
    	for (int i = 0; i < itemList.size(); i++) {
    		workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
    		List workList = entity.mselectM_PS.read(conn, workStruct);
    		for (int t = 0; t < workList.size(); t++) {
    			deployList.add((AA0170010Struct)(workList.get(t)));
    		}
    	}
       
    	// 展開レベルチェック
    	if (deployLevel.intValue() <= 1) {
    		// 最大展開レベル
    		for (int i = 0; i < deployList.size(); i++) {
    			AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
    			noStruct.setps_NO(Integer.toString(no.intValue()));
    			_deployList.add(deployList.get(i));
    		}
    	} else {
    		// 構成情報から更に上の親品目取得
    		for (int i = 0; i < deployList.size(); i++) {
    			AA0170010Struct noStruct = (AA0170010Struct)deployList.get(i);
    			noStruct.setps_NO(Integer.toString(no.intValue()));
    			_deployList.add(deployList.get(i));
    			getReverseDeploy(repository, 
    					((AA0170010Struct)deployList.get(i)).getPARENT_ITEM_CD(),
    					new Integer(deployLevel.intValue() - 1),
    					new Integer(no.intValue() + 1));
    		}
    	}
    }
       
        //------------------------------------------------------------------------------
         
    /**
     * SQLExceptionエラーメッセージ設定
     * @param SQLException
     * @param 出力エラーメッセージ
     */
    private void setSqlExceptionMsg(SQLException e) throws ExpjException{
         	
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
    private void setErrorMessage(String messageno, String message) {
         
    	ExpjMessage emsg = new ExpjMessage( messageno );
    	msgStruct.addError( emsg );
    	sysLog.severe(emsg, getsysUSER_CD());
    	emsg = new ExpjMessage( "ZZ01006", message );
    	msgStruct.addError( emsg );
    	sysLog.severe(emsg, getsysUSER_CD());
    }
       
    /**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ(List)
	 */
	private void setErrorMessage(String messageno, List message) {
		
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
	 
		for (int i=0; i<message.size(); i++) {
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addError( emsg );
			sysLog.severe(emsg, getsysUSER_CD());
		}
	}
         
	/**
	 * エラーメッセージ設定(キー出力なし)
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessageNoKey(String messageno, String message) {
        
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.severe(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.severe(emsg, getsysUSER_CD());
    }
         
	/**
	 * 警告メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setWarnMessage(String messageno, String message) {
    
		ExpjMessage emsg = new ExpjMessage( messageno );
        msgStruct.addWarn( emsg );
        sysLog.warning(emsg, getsysUSER_CD());
    }

	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String messageno, String message) {
         
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.info(emsg, getsysUSER_CD());
    }
	
	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String messageno, List message) {

		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	 
		for (int i=0; i<message.size(); i++) {
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addInfo( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}		
		
	}
	// DB更新中フラグ
	private boolean bDBUpdate;
            
	/** 
	 * @param target_struct 対象データ情報
	 * @param devType       展開フラグ(1:正展開)
	 * @return delList      削除対象データ
	 */
	private List checkTargetDataIn(AA0170010Struct target_struct, int devType) 
		throws FoundationException, SQLException {

		String Message = "";
         
        // 削除する対象データ
        List delList = null;
         
        // 合致レコード件数
        int ArgCount = 0;
       
        // 合致フラグ
        boolean chekflg;
       
        // 削除するレコードを取得
        delList = entity.mselectM_PS_ps_edition.read(conn, target_struct);
         
         
        for	(int i=1; i<_deployList.size(); i++) {
          
        	String depParItem = null;	// 内部親品目番号
        	String depComItem = null;	// 内部子品目番号
        	String depEdition = null;	// 内部製品構成版数
          
        	// 展開レベルチェック
        	if (devType == 1) {
        		chekflg = checkDataExistence(target_struct.getps_PARENT_ITEM_CD(), 
        				((AA0170010Struct)_deployList.get(i)).getps_PARENT_ITEM_CD());
        	} else {
        		chekflg = checkDataExistence(target_struct.getps_COMP_ITEM_CD(), 
        				((AA0170010Struct)_deployList.get(i)).getps_COMP_ITEM_CD());
        	}
          
        	if (chekflg) {
           
        		// 合致レコードの件数を加算
        		ArgCount++;
           
        		// 合致した各項目を内部リストより取得
        		depParItem = ((AA0170010Struct)_deployList.get(i)).getps_PARENT_ITEM_CD();
        		depComItem = ((AA0170010Struct)_deployList.get(i)).getps_COMP_ITEM_CD();
        		depEdition = ((AA0170010Struct)_deployList.get(i)).getps_PS_EDITION();
           
        		// データ存在フラグ初期化
        		boolean isExist = false;
           
        		String modify = null;
           
        		for (int j=0; j<delList.size(); j++) {
        			if (depParItem.equals(((AA0170010Struct)delList.get(j)).getPARENT_ITEM_CD()) &&
        					depComItem.equals(((AA0170010Struct)delList.get(j)).getCOMP_ITEM_CD())  &&
        					depEdition.equals(((AA0170010Struct)delList.get(j)).getPS_EDITION())   ) {
              
        				// データ存在フラグON
        				isExist = true;
              
        				// 更新回数取得
        				modify = ((AA0170010Struct)delList.get(j)).getMODIFY_COUNT();
        				break;
        			} 
        		}
           
        		// データ突合せエラー
        		if	(isExist == false) {
        			Message = "Data is rewritten by other processings.";
        			setErrorMessageNoKey("ZZ01105", Message);
            
        			return null;
        		} else {
        			// 更新回数チェック
        			if	(((AA0170010Struct)_deployList.get(i)).getps_MODIFY_COUNT().equals(modify) == false) {
        				Message = "Data is rewritten by other processings.";
        				setErrorMessageNoKey("ZZ01105", Message);
             
        				return null;
        			}
        		}
        	}
        }
         
        // 削除するデータ数が内部にあるデータより多い場合
        if (ArgCount != delList.size()) {
        	Message = "Data is rewritten by other processings.";
        	setErrorMessageNoKey("ZZ01105", Message);
          
        	return null;
        }
         
        	return delList;
        }
         
	/** 
	 * @param sTarget チェックする親／子品目番号
	 * @param gChkData 内部リストの親／子品目番号
	 * @return boolean true:データあり false:データなし
	 */
	private boolean checkDataExistence(String sTarget, String gChkData) throws FoundationException {
         
		if (sTarget.equals(gChkData) == true) {
			return true;
		} else {
			return false;
		}
    }
    /**
     * 品目情報設定処理
     * @param target_struct 設定対象
     * @param w_itemList 品目情報リスト
     */
    private void setItemInfo(AA0170010Struct target_struct, List w_itemList) {
    	
    	if (w_itemList.size() <= 0) {
    		target_struct.setSTOCK_UNIT("");
    	} else {
    		AA0170010Struct itemStruct = (AA0170010Struct)w_itemList.get(0);
    		target_struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
    	}
    }

    /**
     * 作業系列情報のフラグの表示を設定
     * @param s フラグの値が設定されている情報
     */
    private void setTypeValueAboutProcGroup(AA0170010Struct s) {
    	
    	s.setpr_OUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getpr_OUTSIDE_TYP()));
    	s.setpr_ACPT_INSPC_NAME(getTypeName(_ACPT_INSPC_TYP,s.getpr_ACPT_INSPC_TYP()));
    }

    /** 
     * 対象データが既に更新されているかどうかの判定処理
     * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
     *
     * @param target_struct 対象データ情報
     * @param modify_count 対象データMODIFY_COUNT
     * @return boolean true:エラーあり false:エラーなし
     */
    private boolean checkTargetDataInM_PROC_GRP(AA0170010Struct target_struct, String modify_count) 
    	throws FoundationException, SQLException   {
    	
    	List listMessage = new ArrayList();
     
    	// 処理対象データの存在チェック
    	List temp_list = new ArrayList(0);
    	temp_list = entity.mselectM_PROC_GRP_modify_count.read(conn, target_struct);
    	if (temp_list.size() <= 0) {
      
    		listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
    		listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
    		listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getpr_PROC_CD());
   
    		setErrorMessage("ZZ06001", listMessage);
    		return true;
    	} else {
    		// レコードが更新されていないかチェック
    		AA0170010Struct temp_struct = (AA0170010Struct)temp_list.get(0);
    		if (temp_struct.getMODIFY_COUNT().equals(modify_count) != true) {
       
    			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
    			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
    			listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getpr_PROC_CD());
   
    			setErrorMessage("ZZ01105", listMessage);
    			return true;
    		}
    	}
   
    	return false;
    }
    
    /** 
     * 対象全データが既に更新されているかどうかの判定処理
     * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
     *
     * @param target_struct 対象データ情報
     * @return boolean true:エラーあり false:エラーなし
     */
    private boolean checkTargetAllDataInM_PROC_GRP(AA0170010Struct target_struct) 
    			throws FoundationException, SQLException {
    
    	List listMessage = new ArrayList();
     
    	// 読込時のキーでデータを読込(select for update no waitが入っている読込処理)
    	struct.setPLANT_CD(getsysPLANT_CD());
    	struct.sethidden_ITEM_CD(_keyStruct.gethidden_ITEM_CD());
    	List new_list = entity.mselectM_PROC_GRP_for_update_nowait.read(conn, struct);
   
    	// DB取得件数が画面表示件数と同じかどうかのチェック
    	if (new_list.size() != _procedureList.size()) {
      
			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());	
			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
   
    		setErrorMessage("ZZ01105", listMessage);
    		return true;
    	} else {
    		
    		for (int i = 0; i < _procedureList.size(); i++) {
    			
    			// 画面表示データ
    			AA0170010Struct dispData  = (AA0170010Struct)_procedureList.get(i); 
    			// 画面表示データをキーにM_PROC_GRPから最新のレコードを取得
    			List selectedList = entity.mselectM_PROC_GRP_modify_count.read(conn, dispData);
    			// データが取得できなかった場合はエラー
    			if (selectedList.size() <= 0) {
    			      
    				listMessage.add("M_PROC_GRP.PLANT_CD:" + dispData.getpr_PLANT_CD());	
    				listMessage.add("M_PROC_GRP.ITEM_CD:" + dispData.getpr_ITEM_CD());
    	   
    	    		setErrorMessage("ZZ01105", listMessage);
    	    		return true;
    	    		
    			} else {
    				// 取得データデータ
        			AA0170010Struct selectedData  = (AA0170010Struct)selectedList.get(0);
        			if (! dispData.getpr_MODIFY_COUNT().equals(selectedData.getMODIFY_COUNT())) {
        				// 更新回数が異なる場合はエラー
        				listMessage.add("M_PROC_GRP.PLANT_CD:" + dispData.getpr_PLANT_CD());	
        				listMessage.add("M_PROC_GRP.ITEM_CD:" + dispData.getpr_ITEM_CD());
   
        				setErrorMessage("ZZ01105", listMessage);
        				return true;
        			}
    			}
    		}
    	}
    	return false;
    }
    /**
     * 固定リードタイムチェック
     * @param itemStruct 品目情報Struct
     * @throws SQLException 
     * @throws FoundationException 
     */
    private void checkLT(AA0170010Struct itemStruct) throws FoundationException, SQLException {
        
    	// 作業系列の再取得
    	List prList = new ArrayList();
    	struct.setPLANT_CD(getsysPLANT_CD());
    	struct.setITEM_CD(struct.getsub2_ITEM_CD());
    	prList = entity.mselectM_PROC_GRP.read(conn, struct);
    	

    	// 固定分リードタイムチェック
    	long fixed_lt = 0;
    	long prop_lt = 0;
    	for (int i = 0; i < prList.size(); i++) {
    		AA0170010Struct workStruct = (AA0170010Struct)prList.get(i);
    		fixed_lt = fixed_lt + 
    					(Long.valueOf(workStruct.getpr_FIXED_LT())).longValue();
     		prop_lt  = prop_lt + 
     					(Long.valueOf(workStruct.getpr_PROP_LT())).longValue();
    	}
   
    	// 品目の比例分リードタイム == 0 && 全作業系列比例分リードタイム == 0
    	if (itemStruct.getITEM_PROP_LT().longValue() == 0 && prop_lt == 0) {
    		if (itemStruct.getITEM_FIXED_LT().longValue() < fixed_lt) {
    			setInfoMessage("AA60003", "");
    		}
    	}
    }
    /**
     * サブ２画面を表示します
     * @param  status "0":行追加、行複写、"1"：行修正、サブ画面からの戻り
     * @throws FoundationException 
     * @throws ExpjException 
     */    
	private void dispSub2(String status) throws FoundationException, ExpjException {
		
		String Message = "";
		
		try {
        	// 対象品目情報取得
        	struct.setw_TARGET_ITEM_CD(_keyStruct.gethidden_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
      
        	if (itemList.size() <= 0) {
        		
        		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
        		setErrorMessage("ZZ06001", Message);
        	
        	} else {
        		// 作業系列一覧取得
        		struct.setPLANT_CD(getsysPLANT_CD());
        		struct.setITEM_CD(_keyStruct.gethidden_ITEM_CD());
        		struct.setPROC_CD(_keyStruct.getpr_PROC_CD());
        		List mProcList = entity.mselectM_PROC_GRP_oneRecord.read(conn, struct);
        		
        		struct.setFIRST_PROC_FLG("false");
        		
        		if (mProcList.size() > 0) {
        			// 取得データを画面にセット
        			AA0170010Struct dispData = (AA0170010Struct)mProcList.get(0);
        			
        			struct.setsub2_PLANT_CD(dispData.getsub2_PLANT_CD());
        			struct.setsub2_ITEM_CD(dispData.getsub2_ITEM_CD());
        			struct.setsub2_PROC_CD(dispData.getsub2_PROC_CD());
        			struct.setsub2_PROC_NO(dispData.getsub2_PROC_NO());
        			struct.setsub2_PROC_NAME(dispData.getsub2_PROC_NAME());
        			struct.setsub2_WS_CD(dispData.getsub2_WS_CD());
        			struct.setsub2_COMPANY_CD(dispData.getsub2_COMPANY_CD());
        			struct.setsub2_VEND_CD(dispData.getsub2_VEND_CD());
        			struct.setsub2_FIXED_LT(dispData.getsub2_FIXED_LT());
        			struct.setsub2_PROP_LT(dispData.getsub2_PROP_LT());
        			struct.setsub2_SAFETY_LT(dispData.getsub2_SAFETY_LT());
        			struct.setsub2_PROP_LOT_SIZE(dispData.getsub2_PROP_LOT_SIZE());
        			struct.setsub2_SPOIL(dispData.getsub2_SPOIL());
        			struct.setsub2_OUTSIDE_TYP(dispData.getsub2_OUTSIDE_TYP());
        			struct.setsub2_ACPT_INSPC_TYP(dispData.getsub2_ACPT_INSPC_TYP());
        			struct.setsub2_STANDARD_COST(dispData.getsub2_STANDARD_COST());
        			struct.setsub2_MODIFY_COUNT(dispData.getsub2_MODIFY_COUNT());
        			struct.setsub2_ITEM_NAME(dispData.getsub2_ITEM_NAME());
        			struct.setsub2_WS_NAME(dispData.getsub2_WS_NAME());
        			struct.setsub2_VEND_NAME(dispData.getsub2_VEND_NAME());
        			struct.setsub2_STOCK_UNIT(dispData.getsub2_STOCK_UNIT());
        			struct.setsub2_UNIT_QTY(dispData.getsub2_UNIT_QTY());
        			struct.setsub2_WORK_TIME(dispData.getsub2_WORK_TIME());
// 2008/07/16 SYSCOM 小林 ADD START
        			struct.setsub2_MANHOUR_TYP(dispData.getsub2_MANHOUR_TYP());
// 2008/07/16 SYSCOM 小林 ADD END
        			try {
        				// システムパラメータ取得
        				struct.setPARAM_INPUT_DATA("PROC_GRP_LT_UNIT");
        				List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
        				
        				if (sysParameterList!=null && sysParameterList.size()>0) {
        					AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList.get(0);
        					String paramResult = sysParameterStruct.getPARAM_RESULT_DATA();			
        					/** 作業系列固定分リードタイム単位 */
        					struct.setsub2_STOCK_UNIT_1(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
        					/** 作業系列比例分リードタイム単位 */
        					struct.setsub2_STOCK_UNIT_2(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
        					/** 安全日数単位 */
        					struct.setsub2_STOCK_UNIT_3(getTypeName(_PROC_GRP_LT_UNIT,paramResult));										
        				}
        			}catch(SQLException e) {
        		    	setSqlExceptionMsg(e);
        			}catch(FoundationException e){
        				throw e;	
        			}

        		} else if (mProcList.size() == 0) {
        			
    				Message = "The target data does not exist";
    				setErrorMessageNoKey("ZZ06001", Message);

        		}
        	}
        } catch (SQLException e) {
        	// 読込状態
        	setReadStatus(ERROR);
      
        	setSqlExceptionMsg(e);
        }
		
	}   
	/**
	 * 行追加（製品構成）ボタン押下時に実行される処理です。
	 *
	 */
	public void initializeSub1() {

		// 初期化処理
		/** 製品構成版数 */
		struct.setsub1_PS_EDITION(AA0170Common._PS_EDITION);		

		/** 製品構成単位数分母 */
		struct.setsub1_PS_UNIT_DENOMINATOR(AA0170Common._PS_UNIT_DENOMINATOR);
		
		/** 製品構成単位数分子 */
		struct.setsub1_PS_UNIT_NUMERATOR(AA0170Common._PS_UNIT_NUMERATOR);
		
		/** 構成仕損率 */
		struct.setsub1_PS_SPOIL(AA0170Common._PS_SPOIL);
		
		/** 製品構成固定分リードタイム */
		struct.setsub1_PS_FIXED_LT(AA0170Common._PS_FIXED_LT);
		
		/** 製品構成比例分リードタイム */
		struct.setsub1_PS_PROP_LT( AA0170Common._PS_PROP_LT);
		
		/** 製品構成比例分ロットサイズ */
		struct.setsub1_PS_PROP_LOT_SIZE(AA0170Common._PS_PROP_LOT_SIZE);

		/** 原価積上有無 */
		struct.setsub1_COST_UP_TYP(AA0170Common._COST_UP_TYP);
		
		/** MRP展開有無 */
		struct.setsub1_MRP_EXP_TYP(AA0170Common._MRP_EXP_TYP);					
	}

	/**
	 * 行追加（作業系列）ボタン押下時に実行される処理です。
	 *
	 */
	public void initializeSub2() throws BusinessProcessException, FoundationException{
		
    	// サブ２画面
    	/** 作業系列固定分リードタイム */
		struct.setsub2_FIXED_LT(AA0170Common._PR_FIXED_LT);
    	
    	/** 作業系列比例分リードタイム */
		struct.setsub2_PROP_LT(AA0170Common._PR_PROP_LT);

    	/** 作業系列安全日数 */
		struct.setsub2_SAFETY_LT(AA0170Common._PR_SAFETY_LT);
    	
    	/** 作業系列比例分ロットサイズ */
		struct.setsub2_PROP_LOT_SIZE(AA0170Common._PR_PROP_LOT_SIZE);

    	/** 作業系列仕損率 */
		struct.setsub2_SPOIL(AA0170Common._PR_SPOIL);

    	/** 作業系列内外作区分 */
		struct.setsub2_OUTSIDE_TYP(AA0170Common._PR_OUTSIDE_TYP);

    	/** 作業系列受入検査区分 */
		struct.setsub2_ACPT_INSPC_TYP(AA0170Common._PR_ACPT_INSPC_TYP);

    	/** 標準工数 */
		struct.setsub2_STANDARD_COST(AA0170Common._PR_STANDARD_COST);
		try {
			// システムパラメータ取得
			struct.setPARAM_INPUT_DATA("PROC_GRP_LT_UNIT");
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			
			if (sysParameterList!=null && sysParameterList.size()>0) {
				AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList.get(0);
				String paramResult = sysParameterStruct.getPARAM_RESULT_DATA();			
				/** 作業系列固定分リードタイム単位 */
				struct.setsub2_STOCK_UNIT_1(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
				/** 作業系列比例分リードタイム単位 */
				struct.setsub2_STOCK_UNIT_2(getTypeName(_PROC_GRP_LT_UNIT,paramResult));
				/** 安全日数単位 */
				struct.setsub2_STOCK_UNIT_3(getTypeName(_PROC_GRP_LT_UNIT,paramResult));										
			}
		}catch(SQLException e) {
	    	setSqlExceptionMsg(e);
		}catch(FoundationException e){
			throw e;	
		}
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
		String Message = "";
              
		try {
                 
            // 構成情報リストクリア
            _deployList.clear();
            // 作業系列リストクリア
            _procedureList.clear();
              
            List workList = null;	   // 対象品目情報格納
              
            // 展開レベルのチェック
            int level = Integer.parseInt(_level);
              
            // 入力した展開レベルをInteger型に変換して取得する
            int inLevel = Integer.parseInt(struct.getmain_LEVEL());
              
            if (level < inLevel) {
                setErrorMessageNoKey("AA00104", "");
            }
              
			// 対象品目情報取得
			struct.setw_TARGET_ITEM_CD(struct.getmain_TARGET_ITEM_CD()); // 対象品目コード
			workList = entity.mselectM_ITEM.read(conn, struct);
			if (workList.size() <= 0) {       // 対象品目の取得失敗
				setReadStatus(INITIAL);
			  
				Message = "M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD();
				setErrorMessage("ZZ06001", Message);
			} else {
				setReadStatus(NORMAL);
			}
              
			// チェックでエラーが発生していない場合
			if (msgStruct.sizeError() <= 0) {
				AA0170010Struct targetStruct = new AA0170010Struct();
				targetStruct.clear();
				AA0170010Struct workStruct = (AA0170010Struct)workList.get(0);
				targetStruct.setps_PARENT_ITEM_CD(workStruct.getITEM_CD());
				targetStruct.setps_PARENT_ITEM_NAME(workStruct.getITEM_NAME());
				targetStruct.setps_STOCK_UNIT(workStruct.getSTOCK_UNIT());
// 2008/07/16 SYSCOM 小林 ADD START
				targetStruct.setps_PARENT_MANHOUR_TYP(workStruct.getps_COMP_MANHOUR_TYP());
// 2008/07/16 SYSCOM 小林 ADD END
				targetStruct.setps_NO("1");
				_deployList.add(targetStruct);
               
                // 展開レベル'0'でない場合、展開処理実施
                if (inLevel != 0) {
               
	                // 製品構成リポジトリ作成
	                ProductStructureRepository repository = new ProductStructureRepository(conn);
                
                    // 正展開
                    if (Integer.parseInt(struct.getmain_DEVELOP_TYP()) == 1) {
                         Date targetDate = stringToDate(struct.getmain_TARGET_DATE());
                         getDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                         inLevel, targetDate, new Integer(2));
                    } else {
                    // 逆展開
                        Date targetDate = stringToDate(struct.getmain_TARGET_DATE());
                        getReverseDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                        inLevel, targetDate, 2);
                    }
                }
            }
              
			// フラグの表示文字列設定
			for (int n = 0; n < _deployList.size(); n++) {
				setTypeValueAboutPs((AA0170010Struct)(_deployList.get(n)));
			}
			// 隠し項目をクリアする。
    		struct.sethidden_ITEM_CD("");
    		struct.sethidden_ITEM_NAME("");
    		// キー情報設定
    		_keyStruct.setmain_TARGET_ITEM_CD(struct.getmain_TARGET_ITEM_CD());
    		_keyStruct.setmain_DEVELOP_TYP(struct.getmain_DEVELOP_TYP());
    		_keyStruct.setmain_LEVEL(struct.getmain_LEVEL());
    		_keyStruct.setmain_TARGET_DATE(struct.getmain_TARGET_DATE());
    		_keyStruct.setPLANT_CD(getsysPLANT_CD());
			  
		} catch(ParseException e) {
			// 変換失敗
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			  
			throw ee;
			  
		} catch(SQLException e) {
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //------------------------------------------------------------------
              
		String Message   = "";
		List listMessage = new ArrayList();
                
		// DB更新中フラグ初期化
		bDBUpdate = false;
              
		try {
			// トランザクション開始
			conn.beginTrans();
                 
			// DB更新中フラグON
			bDBUpdate = true;
              
			boolean result = false;		 // チェック結果格納用
                   
			// 存在/更新チェック
			struct.setps_PARENT_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
			struct.setps_COMP_ITEM_CD(struct.getsub1_COMP_ITEM_CD());
			struct.setps_PS_EDITION(struct.getsub1_PS_EDITION());
			List countList = entity.mselectM_PS_modify_count.read(conn, struct);
			if (countList.size() <= 0) {
				
				Message = "The target data does not exist";
				setErrorMessageNoKey("ZZ06001", Message);
			
			} else {
				String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
				if (struct.getsub1_MODIFY_COUNT().equals(modify) == false) {
					Message = "Data is rewritten by other processings.";
					setErrorMessageNoKey("ZZ01105", Message);
				}
			}
			
			// 有効日範囲の重複チェック
			result = checkEffectiveDate_update(struct.getsub1_PARENT_ITEM_CD(), 
												struct.getsub1_COMP_ITEM_CD(),
												struct.getsub1_PS_EDITION(), 
												struct.getsub1_EFF_PHASE_IN_DATE(), 
												struct.getsub1_EFF_PHASE_OUT_DATE());
			if (result == false) {
				Message = "Data is rewritten by other processings.";
				setErrorMessageNoKey("AA00054", "");
            }
					
			
			// チェックでエラーが発生していない場合
			if (msgStruct.sizeError() <= 0) {
				// 入力値チェック
				checkInputSub1(struct);
              
				// 更新
				entity.mupdateSub1M_PS.update(conn, struct);
               
				// コミット
				conn.commit();
                  
				// DB更新中フラグOFF
				bDBUpdate = false;
               
				// 検索
				struct.copy(_keyStruct);
				controlselect();
              
			}
              
		} catch(ParseException e) {
			// 変換失敗
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
              
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
              
		} finally {
			// DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
			if (bDBUpdate == true) {
                  // ロールバック
                  conn.rollback();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
			}
		}
              
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>

		// キーコピー
        struct.copy(_keyStruct);		
              
        //再検索
        controlselect();
              
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
              
                // 初期化
                _keyStruct = new AA0170010Struct();
                struct.initialize();
                struct.setmain_LEVEL(_initlevel);
              
                // 製品構成リストクリア
                _deployList.clear();
                // 作業系列リストクリア
                _procedureList.clear();
              
                // レベル設定
                _keyStruct.setmain_LEVEL(_initlevel);
              
                setReadStatus(INITIAL);
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //------------------------------------------------------------------
              
		String Message = "";
        List listMessage = new ArrayList();
              
        try {
        	// トランザクション開始
            conn.beginTrans();
              
            boolean result = false;		 // チェック結果格納用
              
            // 製品構成リポジトリ作成
            ProductStructureRepository repository = new ProductStructureRepository(conn);
              
            // 追加品目情報チェック
            if (Integer.parseInt(_keyStruct.getmain_DEVELOP_TYP()) == 1) {
            	// 正展開
                struct.setITEM_CD(struct.getsub1_COMP_ITEM_CD());
                result = entity.mcheckM_ITEM.check(conn, struct);
                if (result == false) {    // 対象品目の取得失敗
                	Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                	setErrorMessage("ZZ06001", Message);
                }
            } else {
                // 逆展開
                struct.setITEM_CD(struct.getsub1_PARENT_ITEM_CD());
                result = entity.mcheckM_ITEM.check(conn, struct);
                if (result == false) {    // 対象品目の取得失敗
                	Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                	setErrorMessage("ZZ06001", Message);
                }
            }
        
// 2008/07/16 SYSCOM 小林 ADD START
            // 工数管理品目区分チェック
            AA0170010Struct checkStruct = new AA0170010Struct();
            checkStruct.setw_TARGET_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
            List checkList = entity.mselectM_ITEM.read(conn, checkStruct);
            if(checkList.size() > 0){
                if(((AA0170010Struct)checkList.get(0)).getps_COMP_MANHOUR_TYP().equals("1")){
                	Message = "M_ITEM.ITEM_CD:" + struct.getsub1_PARENT_ITEM_CD();
                	setErrorMessage("AA00178", Message);
                }
            }
// 2008/07/16 SYSCOM 小林 ADD END
        
            // チェックでエラーが発生していない場合
            if (msgStruct.sizeError() <= 0) {
            	
                // 有効開始日のパラメータチェック
                if(!checkDate(struct.getsub1_EFF_PHASE_IN_DATE())){
                	setErrorMessageNoKey("ZZ13001", "");
                }
                // 有効終了日のパラメータチェック
                if(!checkDate(struct.getsub1_EFF_PHASE_OUT_DATE())){
                	setErrorMessageNoKey("ZZ13002", "");
                }          	
            	// 品目手配区分別構成チェック
                if (checkMRP_ODR_TYP(repository, 
                		struct.getsub1_PARENT_ITEM_CD(), struct.getsub1_COMP_ITEM_CD()) == false) {
                	
                	Message = "Item arrangements classification composition is inaccurate";
                	setErrorMessageNoKey("AA00052", Message);
                
                }
                  
                // 製品構成重複チェック
                struct.setPARENT_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
                struct.setCOMP_ITEM_CD(struct.getsub1_COMP_ITEM_CD());
                struct.setPS_EDITION(struct.getsub1_PS_EDITION());
                result = entity.mcheckM_PS_ps_edition.check(conn, struct);
                if (result == true) {
                	listMessage.add("M_PS.PARENT_ITEM_CD:" + struct.getPARENT_ITEM_CD());
                	listMessage.add("M_PS.COMP_ITEM_CD:" + struct.getCOMP_ITEM_CD());
                	listMessage.add("M_PS.PS_EDITION:" + struct.getPS_EDITION());
                	setErrorMessage("ZZ01102", listMessage);
                }
              
                // 有効日範囲の重複チェック
                result = checkEffectiveDate_insert(struct.getsub1_PARENT_ITEM_CD(), 
                									struct.getsub1_COMP_ITEM_CD(),
                									struct.getsub1_EFF_PHASE_IN_DATE(), 
                									struct.getsub1_EFF_PHASE_OUT_DATE());
                if (result == false) {
                	setErrorMessageNoKey("AA00054", "");
                }
              
                // ルーピングチェック true:有  false:無
                if (Integer.parseInt(_keyStruct.getmain_DEVELOP_TYP()) == 1) {
                	if (checkReverseRooping(repository, 
                				struct.getCOMP_ITEM_CD(), 
                				struct.getPARENT_ITEM_CD()) == true) {
                     
                		setErrorMessageNoKey("AA00055", "");
                	}
                } else {
                	if (checkRooping(repository, 
                				struct.getPARENT_ITEM_CD(), 
                				struct.getCOMP_ITEM_CD()) == true) {
                     
                		setErrorMessageNoKey("AA00055", "");
                	}
                }

                // 業務日付の存在性チェック
                if(getsysPLANT_CD() != null && !"".equals(getsysPLANT_CD())){
                   struct.setPLANT_CD(getsysPLANT_CD());
                   List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
      	      	   if(temlist.isEmpty()){
      	      		   // 業務運用日 を取得できなかった場合
      	      		   setErrorMessageNoKey("KR00017", "");             				  
      	      	   }
                } else {
                	// 自社情報 を取得できなかった場合
                	setErrorMessageNoKey("KR00017", "");    
                }          
            }
              
            // チェックでエラーが発生していない場合
            if (msgStruct.sizeError() <= 0) {
            	// 入力値チェック
                checkInputSub1(struct);
              
                // 登録
                
                entity.minsertSub1M_PS.create(conn, struct);
                
                // 製品構成トランザクション登録
                List workList = entity.mselectSYS_PS_T.read(conn, struct);
                long no = 0;	 // シーケンシャルNo
                if (workList.size() <= 0 || 
                		((AA0170010Struct)workList.get(0)).getSEQ_NO() == null) {
                	no = 0;
                } else {
                	no = Long.parseLong(((AA0170010Struct)workList.get(0)).getSEQ_NO());
                }
                AA0170010Struct addStruct = new AA0170010Struct();
                addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ユーザID設定
                addStruct.setACCESS_TYP("1");		            			// 処理方法 1:削除
                addStruct.setCMPLT_FLG("0");					            // 処理方法 0:未
                addStruct.setSEQ_NO(Long.toString(no + 1));
                addStruct.setPARENT_ITEM_CD(struct.getsub1_PARENT_ITEM_CD());
                addStruct.setCOMP_ITEM_CD(struct.getsub1_COMP_ITEM_CD());
                addStruct.setPS_EDITION(struct.getsub1_PS_EDITION());
                entity.minsertSYS_PS_T.create(conn, addStruct);
                
                // コミット
                conn.commit();
                
                // 検索
                struct.copy(_keyStruct);
                controlselect();
            }
              
        } catch(ParseException e) {
        	// 変換失敗
            ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
              
        } catch(SQLException e) {
            setSqlExceptionMsg(e);
        }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselectProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselectProcGrp");
			//{{user_implement_dev:<controlselectProcGrp>
		

        String Message = "";
        setReadStatus(INITIAL);
      
        try {
        	// 作業系列リストクリア
        	_procedureList.clear();
      
        	// 対象品目情報取得
        	struct.setw_TARGET_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
      

        	if (itemList.size() <= 0) {
        		
        		Message = "M_ITEM.ITEM_CD:" + struct.getps_PARENT_ITEM_CD();
        		setErrorMessage("AA01002", Message);
        		// キー情報クリア
        		_keyStruct.setps_PARENT_ITEM_CD("");
        		_keyStruct.setps_PARENT_ITEM_NAME("");
        		_keyStruct.setps_COMP_ITEM_CD("");
    			_keyStruct.setps_PS_EDITION("");
    			_keyStruct.sethidden_ITEM_CD("");
       		    _keyStruct.sethidden_ITEM_NAME("");
// 2008/07/16 SYSCOM 小林 ADD START
       		    _keyStruct.setsub2_MANHOUR_TYP("");
// 2008/07/16 SYSCOM 小林 ADD END
                struct.sethidden_ITEM_CD("");
       		    struct.sethidden_ITEM_NAME("");
       		    // 読込状態
       		    setReadStatus(NOT_FOUND);
        	
        	} else {
        		// 作業系列一覧取得
        		struct.setPLANT_CD(getsysPLANT_CD());
        		if ("1".equals(struct.getmain_DEVELOP_TYP())) {
        			if("1".equals(struct.getps_NO())){
        				struct.setITEM_CD(struct.getps_PARENT_ITEM_CD());
        				_keyStruct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        				_keyStruct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
// 2008/07/16 SYSCOM 小林 ADD START
        				_keyStruct.setsub2_MANHOUR_TYP(struct.getps_PARENT_MANHOUR_TYP());
// 2008/07/16 SYSCOM 小林 ADD END
        				struct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        				struct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
        			} else {
        				struct.setITEM_CD(struct.getps_COMP_ITEM_CD());
        				_keyStruct.sethidden_ITEM_CD(struct.getps_COMP_ITEM_CD());
        				_keyStruct.sethidden_ITEM_NAME(struct.getps_COMP_ITEM_NAME());
// 2008/07/16 SYSCOM 小林 ADD START
        				_keyStruct.setsub2_MANHOUR_TYP(struct.getps_COMP_MANHOUR_TYP());
// 2008/07/16 SYSCOM 小林 ADD END
        				struct.sethidden_ITEM_CD(struct.getps_COMP_ITEM_CD());
        				struct.sethidden_ITEM_NAME(struct.getps_COMP_ITEM_NAME());
        			}
        		} else {
        			struct.setITEM_CD(struct.getps_PARENT_ITEM_CD());
        			_keyStruct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        			_keyStruct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
// 2008/07/16 SYSCOM 小林 ADD START
        			_keyStruct.setsub2_MANHOUR_TYP(struct.getps_PARENT_MANHOUR_TYP());
// 2008/07/16 SYSCOM 小林 ADD END
        			struct.sethidden_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        			struct.sethidden_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
        		}
        		List mProcList = entity.mselectM_PROC_GRP.read(conn, struct);
        		
      
        		if (mProcList.size() > 0) {
        			
        			for (int n = 0; n < mProcList.size(); n++) {
        				// コンボ値の対応する名称を取得
        				AA0170010Struct tempStruct = (AA0170010Struct)mProcList.get(n);
        				setTypeValueAboutProcGroup(tempStruct);
        				// 製品構成版数をセット
        				tempStruct.setpr_PS_EDITION(struct.getps_PS_EDITION());
        				// 作業系列リストに取得データをセット
        				_procedureList.add(tempStruct);
        			}
        			
        			// 読込状態
        			setReadStatus(NORMAL);
        		} else {
        			
        			setReadStatus(NOT_FOUND);
        		}   		

        		// キー情報退避
        		_keyStruct.setps_PARENT_ITEM_CD(struct.getps_PARENT_ITEM_CD());
        		_keyStruct.setps_PARENT_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
        		_keyStruct.setps_COMP_ITEM_CD(struct.getps_COMP_ITEM_CD());
    			_keyStruct.setps_PS_EDITION(struct.getps_PS_EDITION());
    			_keyStruct.setps_NO(struct.getps_NO());
       
        	}
      
        } catch (SQLException e) {
        	// 読込状態
        	setReadStatus(ERROR);
      
        	setSqlExceptionMsg(e);
        }

                //}}user_implement_dev:<controlselectProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlselectProcGrp");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertProcGrp");
			//{{user_implement_dev:<controlinsertProcGrp>
		// 初期化処理
		initializeSub2();

		// キー情報設定
        _keyStruct.setpr_PS_EDITION(_keyStruct.getps_PS_EDITION());

		// 対象の構成情報をコピー
		struct.setsub2_ITEM_CD(_keyStruct.gethidden_ITEM_CD());      // 品目番号
        struct.setsub2_ITEM_NAME(_keyStruct.gethidden_ITEM_NAME());  // 品目名
// 2008/07/16 SYSCOM 小林 ADD START
        struct.setsub2_MANHOUR_TYP(_keyStruct.getsub2_MANHOUR_TYP());  // 工数管理品目区分
// 2008/07/16 SYSCOM 小林 ADD END
        
        struct.setsub2_STATUS(_NOT_REGISTED);


                //}}user_implement_dev:<controlinsertProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertProcGrp");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateProcGrp");
			//{{user_implement_dev:<controlupdateProcGrp>

		// キー情報設定
        _keyStruct.setpr_PROC_CD(struct.getpr_PROC_CD());
        _keyStruct.setpr_PS_EDITION(_keyStruct.getps_PS_EDITION());
        
        // 画面表示情報設定
        String status = "1";
        dispSub2(status);

        struct.setsub2_STATUS(_REGISTED);

	
                //}}user_implement_dev:<controlupdateProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateProcGrp");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcopyProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcopyProcGrp");
			//{{user_implement_dev:<controlcopyProcGrp>

		// キー情報設定
      _keyStruct.setpr_PROC_CD(struct.getpr_PROC_CD());
      _keyStruct.setpr_PS_EDITION(_keyStruct.getps_PS_EDITION());
      
      // 画面表示情報設定
      String status = "0";
      dispSub2(status);
      
      // 品目別作業コードは空欄にする
      struct.setsub2_PROC_CD("");
      
      struct.setsub2_STATUS(_NOT_REGISTED);

                //}}user_implement_dev:<controlcopyProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcopyProcGrp");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldeleteProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteProcGrp");
			//{{user_implement_dev:<controldeleteProcGrp>

		boolean transFlg = false;
        List listMessage = new ArrayList();
      
        try {
        	// トランザクション開始
        	conn.beginTransWeb();
        	transFlg = true;
           
        	// 外注単価テーブル削除
        	int cnt1 = entity.mdeleteM_SBCNT_UNIT_COST.delete(conn, struct);
      
        	// 外注単価ヘッダテーブル削除
        	int cnt2 = entity.mdeleteM_SBCNT_UNIT_COST_H.delete(conn, struct);
      
        	// 作業系列テーブルの対象データチェック
        	checkTargetDataInM_PROC_GRP(struct, struct.getpr_MODIFY_COUNT());
        	
            // 品目取得
        	struct.setw_TARGET_ITEM_CD(struct.gethidden_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
      
        	// エラーがない場合、削除処理
        	if (msgStruct.sizeError() <= 0) {
        		// 作業系列テーブル削除
        		int cnt3 = entity.mdeleteM_PROC_GRP.delete(conn, struct);
        		     
        		// コミット
        		conn.commit();
        		transFlg = false;
        		
        		// キー情報セット
        		struct.copy(_keyStruct);
        		// 再読込
        		controlselectProcGrp();
      
        		// 削除対象がなかった場合
        		if (cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0) {
        			// 削除処理失敗：対象データが存在しません
        			listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:"    + struct.getpr_ITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:"   + struct.getpr_PLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:"    + struct.getpr_PROC_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:"  + struct.getpr_ITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getpr_PLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:"  + struct.getpr_PROC_CD());
        			listMessage.add("M_PROC_GRP.ITEM_CD:"           + struct.getpr_ITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:"          + struct.getpr_PLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:"           + struct.getpr_PROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
           
        		}
        		      
        		// 品目情報取得
        		struct.setw_TARGET_ITEM_CD(struct.getpr_ITEM_CD());
        		itemList.clear();
        		itemList = entity.mselectM_ITEM.read(conn, struct);
        		if (itemList.size() > 0) {
        			// 固定リードタイムチェック
        			checkLT((AA0170010Struct)itemList.get(0));
        		}
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
         
        } finally {
        	try {
        		if (transFlg == true) {
        			// ロールバック
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
                //}}user_implement_dev:<controldeleteProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteProcGrp");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldeleteAllProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllProcGrp");
			//{{user_implement_dev:<controldeleteAllProcGrp>
        
		boolean transFlg = false;
        List listMessage = new ArrayList();
      
        try {
        	// トランザクション開始
        	conn.beginTransWeb();
        	transFlg = true;
        	// 外注単価テーブル削除
        	int cnt1 = entity.mdeleteAllM_SBCNT_UNIT_COST.delete(conn, _keyStruct);
      
        	// 外注単価ヘッダテーブル削除
        	int cnt2 = entity.mdeleteAllM_SBCNT_UNIT_COST_H.delete(conn, _keyStruct);
         
        	// 作業系列テーブルの対象全データチェック
        	checkTargetAllDataInM_PROC_GRP(_keyStruct);
      
        	// エラーがない場合、削除処理
        	if (msgStruct.sizeError() <= 0) {
        		// 作業系列テーブル削除
        		int cnt3 = entity.mdeleteAllM_PROC_GRP.delete(conn, _keyStruct);
      
        		// コミット
        		conn.commit();
        		transFlg = false;
      
        		// 検索
        		struct.copy(_keyStruct);
        		controlselectProcGrp();
      
        		// 削除対象がなかった場合
        		if (cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0) {
        			// 一括削除処理失敗：対象データが存在しません
        			listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" +  struct.getPROC_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" +  struct.getPROC_CD());
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
        		}
      
        		// 品目情報取得
        		struct.setw_TARGET_ITEM_CD(struct.getpr_ITEM_CD());
        		List itemList = entity.mselectM_ITEM.read(conn, struct);
        		if (itemList.size() > 0) {
        			// 固定リードタイムチェック
        			checkLT((AA0170010Struct)itemList.get(0));
        		}
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ロールバック
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
        
		
                //}}user_implement_dev:<controldeleteAllProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllProcGrp");

		return;
	}

	/**
	 * 番号再振ボタン押下時に実行される処理です。
	 *
	 */
	public void controlrenumProcGrp() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlrenumProcGrp");
			//{{user_implement_dev:<controlrenumProcGrp>

		boolean transFlg = false;
        List listMessage = new ArrayList();
      
        try {
        	// トランザクション開始
        	conn.beginTransWeb();
        	transFlg = true;
      
        	// 作業系列情報の系列番号を"10"刻みで更新
        	for (int i = 0, t = 10; i < _procedureList.size(); i++) {
      
        		AA0170010Struct updateStruct = (AA0170010Struct)_procedureList.get(i);
      
        		// 存在/更新チェック
        		List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, updateStruct);
        		if (countList.size() <= 0) {
        			// 作業系列番号振直処理失敗：対象データが存在しません
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getpr_PROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
        		} else {
        			String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
        			if (! updateStruct.getpr_MODIFY_COUNT().equals(modify)) {
        				// 作業系列番号振直処理失敗：他の処理によりデータが書き換えられています
        				listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getpr_ITEM_CD());
        				listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getpr_PLANT_CD());
        				listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getpr_PROC_CD());
      
        				setErrorMessage("ZZ01105", listMessage);
        			}
        		}
      
        		// チェックでエラーが発生していない場合
        		if (msgStruct.sizeError() <= 0) {
        			// 系列番号、工場コード、ユーザID 設定
        			updateStruct.setpr_PROC_NO(Long.toString(t));
        			updateStruct.setPLANT_CD(getsysPLANT_CD());
        			updateStruct.setsUser_ID(struct.getsUser_ID());
      
        			// 更新
        			entity.mupdateM_PROC_GRP_procNo.update(conn, updateStruct);
        		} else {
        			break;
        		}
      
        		t = t + 10;
        	}
      
        	// チェックでエラーが発生していない場合
        	if (msgStruct.sizeError() <= 0) {
        		// コミット
        		conn.commit();
        		transFlg = false;
       
        		// 検索
        		struct.copy(_keyStruct);
        		controlselect();
        		controlselectProcGrp();
        		
        	} else {
        		// ロールバック
        		conn.rollback();
        		transFlg = false;
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ロールバック
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
		
                //}}user_implement_dev:<controlrenumProcGrp>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlrenumProcGrp");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");
			//{{user_implement_dev:<controlinsertSub2>

		boolean transFlg = false;
		String Message = "";
      	List listMessage = new ArrayList();
      
        try {
        	// 項目未入力時のデフォルト値設定
        	checkInputSub2(struct);
      
        	// トランザクション開始
        	conn.beginTransWeb();
        	transFlg = true;
      
        	boolean result = true;			// チェック結果格納
        	
        	// 品目テーブル取得
        	struct.setw_TARGET_ITEM_CD(struct.getsub2_ITEM_CD());
        	struct.setsub2_PLANT_CD(getsysPLANT_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
        	// 品目情報設定
        	setItemInfo(struct, itemList);
        	if (itemList.size() <= 0) {
        		// 登録処理失敗：品目情報の取得に失敗しました
        		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
          
        		setErrorMessage("AA01002", Message);
        	} else {
        		// 作業系列情報 重複チェック
        		struct.setPLANT_CD(getsysPLANT_CD());
        		struct.setITEM_CD(struct.getsub2_ITEM_CD());
        		struct.setPROC_CD(struct.getsub2_PROC_CD());
        		result = entity.mselectM_PROC_GRP_oneRecord.check(conn, struct);
        		if (result == true) {
        			// 登録処理失敗：指定キーのデータがすでに存在します
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
      
        			setErrorMessage("ZZ01102", listMessage);
        		}
      
        		// 作業系列番号 重複チェック
        		result = entity.mselectM_PROC_GRP_procNo.check(conn, struct);
        		if (result == true) {
        			// 登録処理失敗：作業系列番号が重複しています
        			listMessage.clear();
           
        			listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
      
        			setErrorMessage("AA00065", listMessage);
        		}
      
        		// 作業区コードチェック
        		if (struct.getsub2_WS_CD() != null 
        				&& "".equals(struct.getsub2_WS_CD()) == false) {
        			result = entity.mcheckM_WS.check(conn, struct);
        			if (result == false) {
        				// 登録処理失敗：指定した作業区コードは未登録です
        				Message = "M_WS.WS_CD:" + struct.getsub2_WS_CD();
            
        				setErrorMessage("AA01003", Message);
        			} else {
        				struct.setPLANT_CD(getsysPLANT_CD());
        				result = entity.mcheckM_WS_plantCd.check(conn, struct);
        				if (result == false) {
        					// 登録処理失敗：他工場の作業区コードは指定できません
        					listMessage.clear();
             
        					listMessage.add("M_WS.PLANT_CD:" + struct.getPLANT_CD());
        					listMessage.add("M_WS.PROC_CD:" + struct.getsub2_PROC_CD());
      
        					setErrorMessage("AA01005", listMessage);
        				}
        			}
        		}
       
        		// 取引先コードチェック
        		if (struct.getsub2_VEND_CD() != null 
        				&& "".equals(struct.getsub2_VEND_CD()) == false) {
        			result = entity.mcheckM_VEND_CTRL.check(conn, struct);
        			if (result == false) {
        				// 登録処理失敗：指定した取引先コードは未登録です", struct.getsUser_ID());
        				Message = "M_VEND_CTRL.VEND_CD:" + struct.getsub2_VEND_CD();
            
        				setErrorMessage("AA01004", Message);
        			}
        		}
        	}
      
        	// チェックでエラーが発生していない場合
        	if (msgStruct.sizeError() <= 0) {
        		AA0170010Struct itemStruct = (AA0170010Struct)itemList.get(0);
      
        		// 会社コード取得
        		List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
        		if (companyList.size() > 0) {
        			struct.setsub2_COMPANY_CD(((AA0170010Struct)companyList.get(0)).getCOMPANY_CD());
        		}
      
        		// 作業系列比例分ロットサイズチェック
        		boolean resultCeil = false;
        		if (itemStruct.getUNIT_QTY_TYP().intValue() == 1) {
        			if (Calculate.isNumeric(struct.getsub2_PROP_LOT_SIZE()) == true) {
        				resultCeil = true;
        				struct.setsub2_PROP_LOT_SIZE(Calculate.ceil(struct.getsub2_PROP_LOT_SIZE(), 0));
        			}
        		}
      
        		// 作業系列追加       		
        		entity.minsertM_PROC_GRP.create(conn, struct);       		
        		
        		if (resultCeil == true) {
        			// 登録処理失敗：整数管理品目のため比例分ロットサイズの小数点以下は切り上げして登録しました
        			setInfoMessage("AA60002", "");
        		}
      
        		// コミット
        		conn.commit();
        		transFlg = false;
      
        		// キー情報設定
        		_keyStruct.setpr_PROC_CD(struct.getsub2_PROC_CD());
      
        		// 検索
        		struct.copy(_keyStruct);
        		controlselect();
        	} 
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ロールバック
        			conn.rollback();
        		}
      
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }
		

        
                //}}user_implement_dev:<controlinsertSub2>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub2");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub2");
			//{{user_implement_dev:<controlupdateSub2>

		boolean transFlg = false;
        String inProcNo = null;
        String Message = "";
        List listMessage = new ArrayList();
      
        try {
        	// 項目未入力時のデフォルト値設定
        	checkInputSub2(struct);
      
        	// トランザクション開始
        	conn.beginTransWeb();
        	transFlg = true;
      
        	boolean result = true;			// チェック結果格納
      
        	// 品目テーブル取得
        	struct.setw_TARGET_ITEM_CD(struct.getsub2_ITEM_CD());
        	List itemList = entity.mselectM_ITEM.read(conn, struct);
        	
        	// 更新前作業系列取得
        	struct.setPLANT_CD(getsysPLANT_CD());
        	struct.setITEM_CD(struct.getsub2_ITEM_CD());
        	struct.setPROC_CD(struct.getsub2_PROC_CD());
        	List prList_old = entity.mselectM_PROC_GRP_oneRecord.read(conn, struct);
        	
        	// 品目情報設定
        	setItemInfo(struct, itemList);
        	if (itemList.size() <= 0) {
        		// 更新処理失敗：品目情報の取得に失敗しました
        		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
          
        		setErrorMessage("AA01002", Message);
        	} else {
    			// 検索用パラメータの設定
    			struct.setpr_PLANT_CD(struct.getsub2_PLANT_CD());
        		struct.setpr_ITEM_CD(struct.getsub2_ITEM_CD());
        		struct.setpr_PROC_CD(struct.getsub2_PROC_CD());

        		// 存在/更新チェック
        		List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, struct);
        		if (countList.size() <= 0) {
        			// 更新処理失敗：対象データが存在しません
        			listMessage.add("M_PROC_GRP.ITEM_CD:"  + struct.getsub2_ITEM_CD());
        			listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getsub2_PLANT_CD());
        			listMessage.add("M_PROC_GRP.PROC_CD:"  + struct.getsub2_PROC_CD());
      
        			setErrorMessage("ZZ06001", listMessage);
        		} else {
        			String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
        			if (! struct.getsub2_MODIFY_COUNT().equals(modify)) {
        				// 更新処理失敗：他の処理によりデータが書き換えられています", struct.getsUser_ID());
        				listMessage.add("M_PROC_GRP.ITEM_CD:"  + struct.getsub2_ITEM_CD());
        				listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getsub2_PLANT_CD());
        				listMessage.add("M_PROC_GRP.PROC_CD:"  + struct.getsub2_PROC_CD());
      
        				setErrorMessage("ZZ01105", listMessage);
        			}
        		}
        		
        		// 作業系列番号の重複チェック
    			result = entity.mselectM_PROC_GRP_procNo.check(conn, struct);
    			if (result == true) {
    				// 更新処理失敗：作業系列番号が重複しています", struct.getsUser_ID());
    				listMessage.clear();
       
    				listMessage.add("M_PROC_GRP.ITEM_CD:"  + struct.getsub2_ITEM_CD());
    				listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getsub2_PLANT_CD());
    				listMessage.add("M_PROC_GRP.PROC_CD:"  + struct.getsub2_PROC_CD());
  
    				setErrorMessage("AA00065", listMessage);
    			}

                // 作業区コードチェック
        		if (struct.getsub2_WS_CD() != null 
        				&& ! "".equals(struct.getsub2_WS_CD())) {
        			result = entity.mcheckM_WS.check(conn, struct);
        			if (! result) { 
        				// 更新処理失敗：指定した作業区コードは未登録です
        				Message = "M_WS.PROC_CD:" + struct.getsub2_PROC_CD();
          
        				setErrorMessage("AA01003", Message);
        			} else {
        				struct.setPLANT_CD(getsysPLANT_CD());

        				result = entity.mcheckM_WS_plantCd.check(conn, struct);
        				if (! result) {
        					// 更新処理失敗：他工場の作業区コードは指定できません
        					listMessage.clear();
            
        					listMessage.add("M_WS.PLANT_CD:" + struct.getsub2_PLANT_CD());
        					listMessage.add("M_WS.PROC_CD:"  + struct.getsub2_PROC_CD());
      
        					setErrorMessage("AA01005", listMessage);
        				}
        			}
        		}
       
        		// 取引先コードチェック
        		if (struct.getsub2_VEND_CD() != null 
        				&& ! "".equals(struct.getsub2_VEND_CD())) {
        			result = entity.mcheckM_VEND_CTRL.check(conn, struct);
        			if (! result) {
        				// 更新処理失敗：指定した取引先コードは未登録です
        				Message = "M_VEND_CTRL.VEND_CD:" + struct.getsub2_VEND_CD();
          
        				setErrorMessage("AA01004", Message);
        			}
        		}
        	}
      
        	// チェックでエラーが発生していない場合
        	if (msgStruct.sizeError() <= 0) {
        		AA0170010Struct itemStruct = (AA0170010Struct)itemList.get(0);
       
        		// 会社コード取得
        		List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
        		if (companyList.size() > 0) {
        			struct.setsub2_COMPANY_CD(((AA0170010Struct)companyList.get(0)).getCOMPANY_CD());
        		}
        		// 作業系列比例分ロットサイズチェック
        		boolean resultCeil = false;
        		if (itemStruct.getUNIT_QTY_TYP().intValue() == 1) {
        			if (Calculate.isNumeric(struct.getsub2_PROP_LOT_SIZE())) {
        				resultCeil = true;
        				struct.setsub2_PROP_LOT_SIZE(Calculate.ceil(struct.getsub2_PROP_LOT_SIZE(), 0));
        			}
        		}	
      
        		// 作業系列更新
        		entity.mupdateM_PROC_GRP.update(conn, struct);
        		
        		if (resultCeil) {
        			// 登録処理失敗：整数管理品目のため比例分ロットサイズの小数点以下は切り上げして登録しました", struct.getsUser_ID());
        			setInfoMessage("AA60002", "");
        		}
      
        		// コミット
        		conn.commit();
        		transFlg = false;
        		     
        		// 検索
        		struct.copy(_keyStruct);
        		controlselect();
      
        	} else {
        		// ロールバック
        		conn.rollback();
        		transFlg = false;
        	}
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	try {
        		if (transFlg == true) {
        			// ロールバック
        			conn.rollback();
        		}
        		
        	} catch(Exception e) {
        		e.printStackTrace();
        	}
        }	
		
                //}}user_implement_dev:<controlupdateSub2>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub2");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");
			//{{user_implement_dev:<controlcloseSub2>
		
		// キー情報コピー
        struct.copy(_keyStruct);		
              
        // 製品構成グリッド再検索
        controlselect();


                //}}user_implement_dev:<controlcloseSub2>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub2");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertPs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertPs");
			//{{user_implement_dev:<controlinsertPs>

		// 対象の構成情報をコピー
		AA0170010Struct workStruct = (struct);
		
		// 初期化処理
		initializeSub1();
		
		// 正展開
		if (struct.getmain_DEVELOP_TYP().equals("1")) {
			
			if (struct.getps_NO().equals("1")) {
				// 先頭行(品目のみの行)の場合 親品目番号がサブ画面の品目番号
				struct.setsub1_PARENT_ITEM_CD(workStruct.getps_PARENT_ITEM_CD());
				struct.setsub1_PARENT_ITEM_NAME(workStruct.getps_PARENT_ITEM_NAME());
			} else {
				// 2行目以降は その行の構成品目番号がサブ画面の品目番号
				struct.setsub1_PARENT_ITEM_CD(workStruct.getps_COMP_ITEM_CD());
				struct.setsub1_PARENT_ITEM_NAME(workStruct.getps_COMP_ITEM_NAME());
			}
			
		} else {
			// 逆展開のときは 常に親品目番号が サブ画面の構成品目番号
			struct.setsub1_COMP_ITEM_CD(workStruct.getps_PARENT_ITEM_CD());
			struct.setsub1_COMP_ITEM_NAME(workStruct.getps_PARENT_ITEM_NAME());
			struct.setsub1_STOCK_UNIT(workStruct.getps_STOCK_UNIT());
		}
		  
		struct.setmain_TARGET_ITEM_CD(workStruct.getmain_DEVELOP_TYP());
		struct.setmain_DEVELOP_TYP(workStruct.getmain_DEVELOP_TYP());
		struct.setmain_LEVEL(workStruct.getmain_DEVELOP_TYP());
		struct.setmain_TARGET_DATE(workStruct.getmain_DEVELOP_TYP());
		
		struct.setsub1_TARGET_ITEM_CD(workStruct.getmain_DEVELOP_TYP());
		struct.setsub1_DEVELOP_TYP(workStruct.getmain_DEVELOP_TYP());
		struct.setsub1_LEVEL(workStruct.getmain_DEVELOP_TYP());
		struct.setsub1_TARGET_DATE(workStruct.getmain_DEVELOP_TYP());
		
		try{
		// システムパラメータ取得
		struct.setPARAM_INPUT_DATA("PS_EFF_PHASE_IN_DATE");
		List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
		if (sysParameterList!=null && sysParameterList.size()>0) {
			AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList.get(0);
			// 構成有効開始日       
	        String ps_EFF_PHASE_IN_DATE = sysParameterStruct.getPARAM_RESULT_DATA();  
	        // ’*’であれば、工場業務日付を表示する
			if("*".equals(ps_EFF_PHASE_IN_DATE)){
	      	   List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
	      	   if(!temlist.isEmpty()){
	      		   // 構成有効開始日  =  業務運用日
	      		   struct.setsub1_EFF_PHASE_IN_DATE(((AA0170010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());             				  
	      	   }
			} else {
				if(checkDate(ps_EFF_PHASE_IN_DATE)){
					try{
	        			//日付形式を判別
	        			Date t = stringToDate(ps_EFF_PHASE_IN_DATE);
	        			  //[パラメータ]．"設定値"!=nullの場合、有効終了日付　= [パラメータ]．"設定値"
	        			struct.setsub1_EFF_PHASE_IN_DATE(dateToString(t));
	        		}catch(ParseException   e){
	        			//"有効終了日のパラメータが不正です。"
	        			ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                    msgStruct.addError(emsg);
	                    sysLog.warning(emsg, getsysUSER_CD());
	        		}
				} else if(!ps_EFF_PHASE_IN_DATE.toLowerCase().equals("null")){
					//"有効開始日のパラメータが不正です。"
	      			ExpjMessage emsg = new ExpjMessage("ZZ13001");
	                msgStruct.addError(emsg);
	                sysLog.warning(emsg, getsysUSER_CD());
				}
			}
		} else {
			struct.setsub1_EFF_PHASE_IN_DATE(null); 
		}
		// システムパラメータ取得
		struct.setPARAM_INPUT_DATA("PS_EFF_PHASE_OUT_DATE");
		List sysParameterList2 = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
		if (sysParameterList2 != null && sysParameterList2.size() > 0) {
			AA0170010Struct sysParameterStruct = (AA0170010Struct) sysParameterList2.get(0);
			// 構成有効終了日
			String ps_EFF_PHASE_OUT_DATE = sysParameterStruct.getPARAM_RESULT_DATA(); 
	        // ’*’であれば、工場業務日付を表示する
			if("*".equals(ps_EFF_PHASE_OUT_DATE)){
	      	   List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
	      	   if(!temlist.isEmpty()){
	      		   // 構成有効開始日  =  業務運用日
	      		   struct.setsub1_EFF_PHASE_OUT_DATE(((AA0170010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());             				  
	      	   }
			} else {
				if(checkDate(ps_EFF_PHASE_OUT_DATE)){
					try{
	        			//日付形式を判別
	        			Date t = stringToDate(ps_EFF_PHASE_OUT_DATE);
	        			  //[パラメータ]．"設定値"!=nullの場合、有効終了日付　= [パラメータ]．"設定値"
	        			struct.setsub1_EFF_PHASE_OUT_DATE(dateToString(t));
	        		}catch(ParseException   e){
	        			//"有効終了日のパラメータが不正です。"
	        			ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                    msgStruct.addError(emsg);
	                    sysLog.warning(emsg, getsysUSER_CD());
	        		}
				} else if(!ps_EFF_PHASE_OUT_DATE.toLowerCase().equals("null")){
					//"有効開始日のパラメータが不正です。"
	      			ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                msgStruct.addError(emsg);
	                sysLog.warning(emsg, getsysUSER_CD());
				}				
			}
		} else {
			struct.setsub1_EFF_PHASE_OUT_DATE(null);
		}
		}catch(SQLException e){
			setSqlExceptionMsg(e);
		}
        	//      ------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertPs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlinsertPs");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdatePs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdatePs");
			//{{user_implement_dev:<controlupdatePs>
		
		// 親画面の情報を子画面にセット
		struct.setsub1_PARENT_ITEM_CD(struct.getps_PARENT_ITEM_CD());
		struct.setsub1_PARENT_ITEM_NAME(struct.getps_PARENT_ITEM_NAME());
		struct.setsub1_COMP_ITEM_CD(struct.getps_COMP_ITEM_CD());
		struct.setsub1_COMP_ITEM_NAME(struct.getps_COMP_ITEM_NAME());
		struct.setsub1_PS_EDITION(struct.getps_PS_EDITION());
		struct.setsub1_PS_UNIT_NUMERATOR(struct.getps_PS_UNIT_NUMERATOR());
		struct.setsub1_PS_UNIT_DENOMINATOR(struct.getps_PS_UNIT_DENOMINATOR());
		struct.setsub1_h_PS_UNIT_NUMERATOR(struct.getps_PS_UNIT_NUMERATOR());
		struct.setsub1_h_PS_UNIT_DENOMINATOR(struct.getps_PS_UNIT_DENOMINATOR());
		struct.setsub1_STOCK_UNIT(struct.getps_STOCK_UNIT());
		struct.setsub1_EFF_PHASE_IN_DATE(struct.getps_EFF_PHASE_IN_DATE());
		struct.setsub1_EFF_PHASE_OUT_DATE(struct.getps_EFF_PHASE_OUT_DATE());
		struct.setsub1_PS_SPOIL(struct.getps_PS_SPOIL());
		struct.setsub1_CONS_TYP(struct.getps_CONS_TYP());
		struct.setsub1_PS_REF_NO(struct.getps_PS_REF_NO());
		struct.setsub1_PS_LT_CHECK(struct.getps_PS_LT_FLG());
		struct.setsub1_PS_FIXED_LT(struct.getps_PS_FIXED_LT());
		struct.setsub1_PS_PROP_LT(struct.getps_PS_PROP_LT());
		struct.setsub1_PS_PROP_LOT_SIZE(struct.getps_PS_PROP_LOT_SIZE());
		struct.setsub1_COST_UP_TYP(struct.getps_COST_UP_TYP());
		struct.setsub1_MRP_EXP_TYP(struct.getps_MRP_EXP_TYP());
		struct.setsub1_DEVELOP_TYP(struct.getmain_DEVELOP_TYP());
		struct.setsub1_MODIFY_COUNT(struct.getps_MODIFY_COUNT());
		struct.setsub1_PS_LT_FLG(struct.getps_PS_LT_FLG());
		
		struct.setmain_TARGET_ITEM_CD(struct.getmain_TARGET_ITEM_CD());
		struct.setmain_DEVELOP_TYP(struct.getmain_DEVELOP_TYP());
		struct.setmain_LEVEL(struct.getmain_LEVEL());
		struct.setmain_TARGET_DATE(struct.getmain_TARGET_DATE());

		
                //}}user_implement_dev:<controlupdatePs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlupdatePs");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldeletePs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeletePs");
			//{{user_implement_dev:<controldeletePs>
		String Message = "";
        
        // DB更新中フラグ初期化
        bDBUpdate = false;
         
        try {
	        // トランザクション開始
	        conn.beginTrans();
	         
	        // DB更新中フラグON
	        bDBUpdate = true;
	      
	        // 存在/更新チェック
	        List countList = entity.mselectM_PS_modify_count.read(conn, struct);
	        if (countList.size() <= 0) {
	        	Message = "The target data does not exist";
	            setErrorMessageNoKey("ZZ01105", Message);
	        } else {
	            String modify = ((AA0170010Struct)countList.get(0)).getMODIFY_COUNT();
	            if (struct.getps_MODIFY_COUNT().equals(modify) == false) {
	                Message = "Data is rewritten by other processings.";
	                setErrorMessageNoKey("ZZ01105", Message);
	            }
	        }
         
	        // チェックでエラーが発生していない場合
	        if (msgStruct.sizeError() <= 0) {
	         
	            AA0170010Struct targetStruct = struct;
	          
	            // 製品構成トランザクションへの追加
	            AA0170010Struct addStruct = new AA0170010Struct();
	            addStruct.setsUser_ID(new String(struct.getsUser_ID()));		// ユーザID設定
	      
	            List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
	            long no = 0;	 // シーケンシャルNo
	            if (workList.size() <= 0 || 
	            		((AA0170010Struct)workList.get(0)).getSEQ_NO() == null) {
	            	no = 0;
	            } else {
	                no = Long.parseLong(((AA0170010Struct) workList.get(0)).getSEQ_NO());
	            }
	            addStruct.setACCESS_TYP("2");   	// 処理方法 2:削除
	            addStruct.setCMPLT_FLG("0");        // 完了フラグ 0:未
	      
	            if (_keyStruct.getmain_DEVELOP_TYP().equals("1")) {
	            // 正展開
	            addStruct.setCOMP_ITEM_CD(targetStruct.getps_COMP_ITEM_CD());
	            addStruct.setPARENT_ITEM_CD(targetStruct.getps_PARENT_ITEM_CD());
	            addStruct.setSEQ_NO(Long.toString(no + 1));
	            addStruct.setPS_EDITION(targetStruct.getps_PS_EDITION());
	            entity.minsertSYS_PS_T.create(conn, addStruct);
           
	            } else {
	            	// 逆展開
	            	addStruct.setPARENT_ITEM_CD(targetStruct.getps_PARENT_ITEM_CD());
	            	addStruct.setCOMP_ITEM_CD(targetStruct.getps_COMP_ITEM_CD());
	            	addStruct.setSEQ_NO(Long.toString(no + 1));
	            	addStruct.setPS_EDITION(targetStruct.getps_PS_EDITION());
	            	entity.minsertSYS_PS_T.create(conn, addStruct);
	           
	            }
	            
		        // 製品構成テーブル削除
		        entity.mdeleteM_PS.delete(conn, targetStruct);
	      
		        // コミット
		        conn.commit();
	          
		        // DB更新中フラグOFF
		        bDBUpdate = false;
	      
		        // 検索
		        struct.copy(_keyStruct);
		        controlselect();
		        
		    }
      
        } catch(SQLException e) {
        	setSqlExceptionMsg(e);
  
        } finally {
        	// DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
        	if (bDBUpdate == true) {
        		// ロールバック
        		conn.rollback();
  
        		// DB更新中フラグOFF
        		bDBUpdate = false;
        	}
        }
                //}}user_implement_dev:<controldeletePs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeletePs");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldeleteAllPs() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllPs");
			//{{user_implement_dev:<controldeleteAllPs>

		// DB更新中フラグ初期化
        bDBUpdate = false;
      
        try {
      
        	// トランザクション開始
        	conn.beginTrans();
         
        	// DB更新中フラグON
        	bDBUpdate = true;
         
        	// 削除
        	AA0170010Struct targetStruct = new AA0170010Struct();
        	targetStruct.copy(struct);
      
        	// シーケンシャルNo取得
        	List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
        	long no = 0;	 // シーケンシャルNo
        	if (workList.size() <= 0 || 
        			((AA0170010Struct)workList.get(0)).getSEQ_NO() == null) {
        		no = 0;
        	} else {
        		no = Long.parseLong(((AA0170010Struct)workList.get(0)).getSEQ_NO());
        	}
        	AA0170010Struct addStruct = new AA0170010Struct();
        	addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ユーザID設定
        	addStruct.setACCESS_TYP("2");					// 処理方法 2:削除
        	addStruct.setCMPLT_FLG("0");					 // 完了フラグ 0:未
      
        	List deleteList = null;
        	if (_keyStruct.getmain_DEVELOP_TYP().equals("1")) {
        		// 正展開
        		targetStruct.setps_COMP_ITEM_CD(null);
        	} else { 
        		// 逆展開
        		targetStruct.setps_PARENT_ITEM_CD(null);
        	}
      
        	deleteList = checkTargetDataIn(targetStruct, 
        			Integer.parseInt(_keyStruct.getmain_DEVELOP_TYP()));
         
        	// エラーが発生していない場合、更新処理実施
        	if (deleteList != null) {
         
        		for (int i = 0; i < deleteList.size(); i++) {
        			AA0170010Struct paramStruct = (AA0170010Struct)deleteList.get(i);
        			paramStruct.setPLANT_CD(getsysPLANT_CD());
        			paramStruct.setps_PARENT_ITEM_CD(paramStruct.getPARENT_ITEM_CD());
        			paramStruct.setps_COMP_ITEM_CD(paramStruct.getCOMP_ITEM_CD());
        			paramStruct.setps_PS_EDITION(paramStruct.getPS_EDITION());
        			// 製品構成テーブル削除
        			entity.mdeleteM_PS.delete(conn, paramStruct);
        		}
          
        		// 製品構成トランザクション追加
        		for (int i = 0; i < deleteList.size(); i++) {
        			addStruct.setSEQ_NO(Long.toString(no + 1 + i));
        			addStruct.setPARENT_ITEM_CD(((AA0170010Struct)deleteList.get(i)).getPARENT_ITEM_CD());
        			addStruct.setCOMP_ITEM_CD(((AA0170010Struct)deleteList.get(i)).getCOMP_ITEM_CD());
        			addStruct.setPS_EDITION(((AA0170010Struct)deleteList.get(i)).getPS_EDITION());
        			entity.minsertSYS_PS_T.create(conn, addStruct);
        		}
      
        		// コミット
        		conn.commit();
          
        		// DB更新中フラグOFF
        		bDBUpdate = false;
      
        		// 検索
        		struct.copy(_keyStruct);
        		controlselect();
        	}
      
        } catch (SQLException e) {
        	setSqlExceptionMsg(e);
      
        } finally {
        	// DB更新処理中に何らかのエラーが発生した場合はrollbackをおこなう
        	if (bDBUpdate == true) {
        		// ロールバック
        		conn.rollback();
      
        		// DB更新中フラグOFF
        		bDBUpdate = false;
        	}
        }
                //}}user_implement_dev:<controldeleteAllPs>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controldeleteAllPs");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		setComboData(struct);
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
               //------------------------------------------------------------------
              
                try {
              
                 PrivateConfig c = new PrivateConfig(conn);
              
                 // 初期展開レベル取得
                 Integer initlevel = c.getNumber("INIT_DISPLAY_PS_LEVEL");
                 if (initlevel == null) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The initial deployment level is not defined" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }
                 else if (initlevel.intValue() < 0) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The value of an initial deployment level is not right" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }
                 // 最大展開レベル取得
                 Integer level = c.getNumber("MAX_DISPLAY_PS_LEVEL");
                 if (level == null) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max deployment level is not defined" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }
                 else if (level.intValue() < 0) {
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max of an initial deployment level is not right" );
                  sysLog.severe(log, getsysUSER_CD());
                  throw ee;
                 }                             
                 
                 _level = level.toString();
                 _initlevel = initlevel.toString();
                 _keyStruct.setmain_LEVEL(_initlevel);
              
                 // コンボボックスデータ用意
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);
              
                 _DEVELOP_TYP    = comboController.getData("DEVELOP_TYP");
                 _CONS_TYP       = comboController.getData("CONS_TYP");
                 _COST_UP_TYP    = comboController.getData("COST_UP_TYP");
                 _MRP_EXP_TYP    = comboController.getData("MRP_EXP_TYP");
// 2008/07/16 SYSCOM 小林 ADD START 
                 _MANHOUR_TYP = comboController.getData("MANHOUR_TYP");
// 2008/07/16 SYSCOM 小林 ADD END
                 _PS_LT_FLG      = comboController.getData("PS_LT_FLG");
                 _OUTSIDE_TYP    = comboController.getData("OUTSIDE_TYP");
                 _ACPT_INSPC_TYP = comboController.getData("ACPT_INSPC_TYP");
                 _PROC_GRP_LT_UNIT = comboController.getData("PROC_GRP_LT_UNIT");
                 comboController.setConnection(null);
              
                 controlclear();
               
                 setReadStatus(INITIAL);

              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } catch(ComboException e) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                }
                
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0170");
		logger.entering("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("selectProcGrp") ) {
				controlselectProcGrp();
			} else if( button.equals("insertProcGrp") ) {
				controlinsertProcGrp();
			} else if( button.equals("updateProcGrp") ) {
				controlupdateProcGrp();
			} else if( button.equals("copyProcGrp") ) {
				controlcopyProcGrp();
			} else if( button.equals("deleteProcGrp") ) {
				controldeleteProcGrp();
			} else if( button.equals("deleteAllProcGrp") ) {
				controldeleteAllProcGrp();
			} else if( button.equals("renumProcGrp") ) {
				controlrenumProcGrp();
			} else if( button.equals("insertSub2") ) {
				controlinsertSub2();
			} else if( button.equals("updateSub2") ) {
				controlupdateSub2();
			} else if( button.equals("closeSub2") ) {
				controlcloseSub2();
			} else if( button.equals("insertPs") ) {
				controlinsertPs();
			} else if( button.equals("updatePs") ) {
				controlupdatePs();
			} else if( button.equals("deletePs") ) {
				controldeletePs();
			} else if( button.equals("deleteAllPs") ) {
				controldeleteAllPs();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
               //------------------------------------------------------------------
                struct.setList_main_DEVELOP_TYP_val(_DEVELOP_TYP.getValList());
                struct.setList_main_DEVELOP_TYP_name(_DEVELOP_TYP.getExplanList());
                struct.setList_sub1_CONS_TYP_val(_CONS_TYP.getValList());
                struct.setList_sub1_CONS_TYP_name(_CONS_TYP.getExplanList());
                struct.setList_sub1_COST_UP_TYP_val(_COST_UP_TYP.getValList());
                struct.setList_sub1_COST_UP_TYP_name(_COST_UP_TYP.getExplanList());
                struct.setList_sub1_MRP_EXP_TYP_val(_MRP_EXP_TYP.getValList());
                struct.setList_sub1_MRP_EXP_TYP_name(_MRP_EXP_TYP.getExplanList());
                struct.setList_sub2_OUTSIDE_TYP_val((_OUTSIDE_TYP.getValList()));
                struct.setList_sub2_OUTSIDE_TYP_name((_OUTSIDE_TYP.getExplanList()));
                struct.setList_sub2_ACPT_INSPC_TYP_val((_ACPT_INSPC_TYP.getValList()));
                struct.setList_sub2_ACPT_INSPC_TYP_name((_ACPT_INSPC_TYP.getExplanList()));

              
              //	      } catch(AlarmMessageException ame) {
              //		      ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //		      throw ee;
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
//			throw new FoundationException("AA0170010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0170010-E999","CSVの出力処理"));
			throw new FoundationException("AA0170010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0170010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0170010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0170010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0170010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0170010Entity entity;
	protected AA0170010Struct struct;
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

		entity = new AA0170010Entity();
		struct = new AA0170010Struct();

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
	 * AA0170010クラスの標準コンストラクタ
	 */
	public AA0170010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
              
                list = new ArrayList(0);
                
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
				AA0170010Struct key = (AA0170010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_name") && key.getsub2_OUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("sub2_OUTSIDE_TYP_name", key.getsub2_OUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_val") && key.getsub2_OUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("sub2_OUTSIDE_TYP_val", key.getsub2_OUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_name") && key.getsub2_ACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("sub2_ACPT_INSPC_TYP_name", key.getsub2_ACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_val") && key.getsub2_ACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("sub2_ACPT_INSPC_TYP_val", key.getsub2_ACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("main_TARGET_ITEM_CD") && key.getmain_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("main_TARGET_ITEM_CD", key.getmain_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP") && key.getmain_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("main_DEVELOP_TYP", key.getmain_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_name") && key.getmain_DEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("main_DEVELOP_TYP_name", key.getmain_DEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_val") && key.getmain_DEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("main_DEVELOP_TYP_val", key.getmain_DEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("main_TARGET_DATE") && key.getmain_TARGET_DATE() != null) {
					msgKey.setKeyValue("main_TARGET_DATE", key.getmain_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("main_LEVEL") && key.getmain_LEVEL() != null) {
					msgKey.setKeyValue("main_LEVEL", key.getmain_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("ps_NO") && key.getps_NO() != null) {
					msgKey.setKeyValue("ps_NO", key.getps_NO());
				}
				if(msgKeyType.containsKeyColumn("ps_CONS_NAME") && key.getps_CONS_NAME() != null) {
					msgKey.setKeyValue("ps_CONS_NAME", key.getps_CONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_LT_NAME") && key.getps_PS_LT_NAME() != null) {
					msgKey.setKeyValue("ps_PS_LT_NAME", key.getps_PS_LT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_COST_UP_NAME") && key.getps_COST_UP_NAME() != null) {
					msgKey.setKeyValue("ps_COST_UP_NAME", key.getps_COST_UP_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_MRP_EXP_NAME") && key.getps_MRP_EXP_NAME() != null) {
					msgKey.setKeyValue("ps_MRP_EXP_NAME", key.getps_MRP_EXP_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_OUTSIDE_NAME") && key.getpr_OUTSIDE_NAME() != null) {
					msgKey.setKeyValue("pr_OUTSIDE_NAME", key.getpr_OUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_NAME") && key.getpr_ACPT_INSPC_NAME() != null) {
					msgKey.setKeyValue("pr_ACPT_INSPC_NAME", key.getpr_ACPT_INSPC_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_NAME") && key.getsub1_PARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("sub1_PARENT_ITEM_NAME", key.getsub1_PARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1_DEVELOP_TYP") && key.getsub1_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("sub1_DEVELOP_TYP", key.getsub1_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_NAME") && key.getsub1_COMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("sub1_COMP_ITEM_NAME", key.getsub1_COMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1_MODIFY_COUNT") && key.getsub1_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("sub1_MODIFY_COUNT", key.getsub1_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("sub1_STOCK_UNIT") && key.getsub1_STOCK_UNIT() != null) {
					msgKey.setKeyValue("sub1_STOCK_UNIT", key.getsub1_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_name") && key.getsub1_CONS_TYP_name() != null) {
					msgKey.setKeyValue("sub1_CONS_TYP_name", key.getsub1_CONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_val") && key.getsub1_CONS_TYP_val() != null) {
					msgKey.setKeyValue("sub1_CONS_TYP_val", key.getsub1_CONS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_LT_CHECK") && key.getsub1_PS_LT_CHECK() != null) {
					msgKey.setKeyValue("sub1_PS_LT_CHECK", key.getsub1_PS_LT_CHECK());
				}
				if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_name") && key.getsub1_COST_UP_TYP_name() != null) {
					msgKey.setKeyValue("sub1_COST_UP_TYP_name", key.getsub1_COST_UP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_val") && key.getsub1_COST_UP_TYP_val() != null) {
					msgKey.setKeyValue("sub1_COST_UP_TYP_val", key.getsub1_COST_UP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_name") && key.getsub1_MRP_EXP_TYP_name() != null) {
					msgKey.setKeyValue("sub1_MRP_EXP_TYP_name", key.getsub1_MRP_EXP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_val") && key.getsub1_MRP_EXP_TYP_val() != null) {
					msgKey.setKeyValue("sub1_MRP_EXP_TYP_val", key.getsub1_MRP_EXP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("sub1_TARGET_ITEM_CD") && key.getsub1_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("sub1_TARGET_ITEM_CD", key.getsub1_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub1_LEVEL") && key.getsub1_LEVEL() != null) {
					msgKey.setKeyValue("sub1_LEVEL", key.getsub1_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("sub1_TARGET_DATE") && key.getsub1_TARGET_DATE() != null) {
					msgKey.setKeyValue("sub1_TARGET_DATE", key.getsub1_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("pr_PS_EDITION") && key.getpr_PS_EDITION() != null) {
					msgKey.setKeyValue("pr_PS_EDITION", key.getpr_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("hidden_ITEM_NAME") && key.gethidden_ITEM_NAME() != null) {
					msgKey.setKeyValue("hidden_ITEM_NAME", key.gethidden_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_STATUS") && key.getsub2_STATUS() != null) {
					msgKey.setKeyValue("sub2_STATUS", key.getsub2_STATUS());
				}
				if(msgKeyType.containsKeyColumn("FIRST_PROC_FLG") && key.getFIRST_PROC_FLG() != null) {
					msgKey.setKeyValue("FIRST_PROC_FLG", key.getFIRST_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_NUMERATOR") && key.getsub1_h_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("sub1_h_PS_UNIT_NUMERATOR", key.getsub1_h_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_DENOMINATOR") && key.getsub1_h_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("sub1_h_PS_UNIT_DENOMINATOR", key.getsub1_h_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_1") && key.getsub2_STOCK_UNIT_1() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_1", key.getsub2_STOCK_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_2") && key.getsub2_STOCK_UNIT_2() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_2", key.getsub2_STOCK_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_3") && key.getsub2_STOCK_UNIT_3() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT_3", key.getsub2_STOCK_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_NAME") && key.getps_COMP_MANHOUR_NAME() != null) {
					msgKey.setKeyValue("ps_COMP_MANHOUR_NAME", key.getps_COMP_MANHOUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_CD") && key.getps_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("ps_PARENT_ITEM_CD", key.getps_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_CD") && key.getps_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("ps_COMP_ITEM_CD", key.getps_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_EDITION") && key.getps_PS_EDITION() != null) {
					msgKey.setKeyValue("ps_PS_EDITION", key.getps_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_UNIT_DENOMINATOR") && key.getps_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ps_PS_UNIT_DENOMINATOR", key.getps_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_UNIT_NUMERATOR") && key.getps_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ps_PS_UNIT_NUMERATOR", key.getps_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_IN_DATE") && key.getps_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("ps_EFF_PHASE_IN_DATE", key.getps_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_OUT_DATE") && key.getps_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("ps_EFF_PHASE_OUT_DATE", key.getps_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_SPOIL") && key.getps_PS_SPOIL() != null) {
					msgKey.setKeyValue("ps_PS_SPOIL", key.getps_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("ps_CONS_TYP") && key.getps_CONS_TYP() != null) {
					msgKey.setKeyValue("ps_CONS_TYP", key.getps_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_LT_FLG") && key.getps_PS_LT_FLG() != null) {
					msgKey.setKeyValue("ps_PS_LT_FLG", key.getps_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_FIXED_LT") && key.getps_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("ps_PS_FIXED_LT", key.getps_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_PROP_LT") && key.getps_PS_PROP_LT() != null) {
					msgKey.setKeyValue("ps_PS_PROP_LT", key.getps_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_PROP_LOT_SIZE") && key.getps_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("ps_PS_PROP_LOT_SIZE", key.getps_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ps_PS_REF_NO") && key.getps_PS_REF_NO() != null) {
					msgKey.setKeyValue("ps_PS_REF_NO", key.getps_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("ps_COST_UP_TYP") && key.getps_COST_UP_TYP() != null) {
					msgKey.setKeyValue("ps_COST_UP_TYP", key.getps_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_MRP_EXP_TYP") && key.getps_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("ps_MRP_EXP_TYP", key.getps_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_MODIFY_COUNT") && key.getps_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ps_MODIFY_COUNT", key.getps_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_NAME") && key.getps_PARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("ps_PARENT_ITEM_NAME", key.getps_PARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_NAME") && key.getps_COMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("ps_COMP_ITEM_NAME", key.getps_COMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ps_STOCK_UNIT") && key.getps_STOCK_UNIT() != null) {
					msgKey.setKeyValue("ps_STOCK_UNIT", key.getps_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_TYP") && key.getps_COMP_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("ps_COMP_MANHOUR_TYP", key.getps_COMP_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ps_PARENT_MANHOUR_TYP") && key.getps_PARENT_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("ps_PARENT_MANHOUR_TYP", key.getps_PARENT_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_CD") && key.getsub1_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("sub1_PARENT_ITEM_CD", key.getsub1_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_CD") && key.getsub1_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("sub1_COMP_ITEM_CD", key.getsub1_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_EDITION") && key.getsub1_PS_EDITION() != null) {
					msgKey.setKeyValue("sub1_PS_EDITION", key.getsub1_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_DENOMINATOR") && key.getsub1_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("sub1_PS_UNIT_DENOMINATOR", key.getsub1_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_NUMERATOR") && key.getsub1_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("sub1_PS_UNIT_NUMERATOR", key.getsub1_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_IN_DATE") && key.getsub1_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("sub1_EFF_PHASE_IN_DATE", key.getsub1_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_OUT_DATE") && key.getsub1_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("sub1_EFF_PHASE_OUT_DATE", key.getsub1_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_SPOIL") && key.getsub1_PS_SPOIL() != null) {
					msgKey.setKeyValue("sub1_PS_SPOIL", key.getsub1_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("sub1_CONS_TYP") && key.getsub1_CONS_TYP() != null) {
					msgKey.setKeyValue("sub1_CONS_TYP", key.getsub1_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_LT_FLG") && key.getsub1_PS_LT_FLG() != null) {
					msgKey.setKeyValue("sub1_PS_LT_FLG", key.getsub1_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_FIXED_LT") && key.getsub1_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("sub1_PS_FIXED_LT", key.getsub1_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LT") && key.getsub1_PS_PROP_LT() != null) {
					msgKey.setKeyValue("sub1_PS_PROP_LT", key.getsub1_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LOT_SIZE") && key.getsub1_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("sub1_PS_PROP_LOT_SIZE", key.getsub1_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("sub1_PS_REF_NO") && key.getsub1_PS_REF_NO() != null) {
					msgKey.setKeyValue("sub1_PS_REF_NO", key.getsub1_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP") && key.getsub1_COST_UP_TYP() != null) {
					msgKey.setKeyValue("sub1_COST_UP_TYP", key.getsub1_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP") && key.getsub1_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("sub1_MRP_EXP_TYP", key.getsub1_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ACCESS_TYP") && key.getACCESS_TYP() != null) {
					msgKey.setKeyValue("ACCESS_TYP", key.getACCESS_TYP());
				}
				if(msgKeyType.containsKeyColumn("CMPLT_FLG") && key.getCMPLT_FLG() != null) {
					msgKey.setKeyValue("CMPLT_FLG", key.getCMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP") && key.getITEM_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("ITEM_OUTSIDE_TYP", key.getITEM_OUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT") && key.getITEM_FIXED_LT() != null) {
					msgKey.setKeyValue("ITEM_FIXED_LT", key.getITEM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LT") && key.getITEM_PROP_LT() != null) {
					msgKey.setKeyValue("ITEM_PROP_LT", key.getITEM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE") && key.getITEM_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("ITEM_PROP_LOT_SIZE", key.getITEM_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT") && key.getITEM_ISSUE_LT() != null) {
					msgKey.setKeyValue("ITEM_ISSUE_LT", key.getITEM_ISSUE_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT") && key.getITEM_SAFETY_LT() != null) {
					msgKey.setKeyValue("ITEM_SAFETY_LT", key.getITEM_SAFETY_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD") && key.getw_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("w_TARGET_ITEM_CD", key.getw_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_PLANT_CD") && key.getpr_PLANT_CD() != null) {
					msgKey.setKeyValue("pr_PLANT_CD", key.getpr_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_ITEM_CD") && key.getpr_ITEM_CD() != null) {
					msgKey.setKeyValue("pr_ITEM_CD", key.getpr_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_PROC_CD") && key.getpr_PROC_CD() != null) {
					msgKey.setKeyValue("pr_PROC_CD", key.getpr_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_PROC_NO") && key.getpr_PROC_NO() != null) {
					msgKey.setKeyValue("pr_PROC_NO", key.getpr_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("pr_PROC_NAME") && key.getpr_PROC_NAME() != null) {
					msgKey.setKeyValue("pr_PROC_NAME", key.getpr_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_WS_CD") && key.getpr_WS_CD() != null) {
					msgKey.setKeyValue("pr_WS_CD", key.getpr_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_COMPANY_CD") && key.getpr_COMPANY_CD() != null) {
					msgKey.setKeyValue("pr_COMPANY_CD", key.getpr_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_VEND_CD") && key.getpr_VEND_CD() != null) {
					msgKey.setKeyValue("pr_VEND_CD", key.getpr_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("pr_FIXED_LT") && key.getpr_FIXED_LT() != null) {
					msgKey.setKeyValue("pr_FIXED_LT", key.getpr_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("pr_PROP_LT") && key.getpr_PROP_LT() != null) {
					msgKey.setKeyValue("pr_PROP_LT", key.getpr_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("pr_SAFETY_LT") && key.getpr_SAFETY_LT() != null) {
					msgKey.setKeyValue("pr_SAFETY_LT", key.getpr_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("pr_PROP_LOT_SIZE") && key.getpr_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("pr_PROP_LOT_SIZE", key.getpr_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("pr_SPOIL") && key.getpr_SPOIL() != null) {
					msgKey.setKeyValue("pr_SPOIL", key.getpr_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("pr_OUTSIDE_TYP") && key.getpr_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("pr_OUTSIDE_TYP", key.getpr_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_TYP") && key.getpr_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("pr_ACPT_INSPC_TYP", key.getpr_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("pr_STANDARD_COST") && key.getpr_STANDARD_COST() != null) {
					msgKey.setKeyValue("pr_STANDARD_COST", key.getpr_STANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("pr_MODIFY_COUNT") && key.getpr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("pr_MODIFY_COUNT", key.getpr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("pr_UNIT_QTY") && key.getpr_UNIT_QTY() != null) {
					msgKey.setKeyValue("pr_UNIT_QTY", key.getpr_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("pr_WORK_TIME") && key.getpr_WORK_TIME() != null) {
					msgKey.setKeyValue("pr_WORK_TIME", key.getpr_WORK_TIME());
				}
				if(msgKeyType.containsKeyColumn("pr_ITEM_NAME") && key.getpr_ITEM_NAME() != null) {
					msgKey.setKeyValue("pr_ITEM_NAME", key.getpr_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_WS_NAME") && key.getpr_WS_NAME() != null) {
					msgKey.setKeyValue("pr_WS_NAME", key.getpr_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_VEND_NAME") && key.getpr_VEND_NAME() != null) {
					msgKey.setKeyValue("pr_VEND_NAME", key.getpr_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("pr_STOCK_UNIT") && key.getpr_STOCK_UNIT() != null) {
					msgKey.setKeyValue("pr_STOCK_UNIT", key.getpr_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("hidden_ITEM_CD") && key.gethidden_ITEM_CD() != null) {
					msgKey.setKeyValue("hidden_ITEM_CD", key.gethidden_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_PLANT_CD") && key.getsub2_PLANT_CD() != null) {
					msgKey.setKeyValue("sub2_PLANT_CD", key.getsub2_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_ITEM_CD") && key.getsub2_ITEM_CD() != null) {
					msgKey.setKeyValue("sub2_ITEM_CD", key.getsub2_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROC_CD") && key.getsub2_PROC_CD() != null) {
					msgKey.setKeyValue("sub2_PROC_CD", key.getsub2_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROC_NO") && key.getsub2_PROC_NO() != null) {
					msgKey.setKeyValue("sub2_PROC_NO", key.getsub2_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROC_NAME") && key.getsub2_PROC_NAME() != null) {
					msgKey.setKeyValue("sub2_PROC_NAME", key.getsub2_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_WS_CD") && key.getsub2_WS_CD() != null) {
					msgKey.setKeyValue("sub2_WS_CD", key.getsub2_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_COMPANY_CD") && key.getsub2_COMPANY_CD() != null) {
					msgKey.setKeyValue("sub2_COMPANY_CD", key.getsub2_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_VEND_CD") && key.getsub2_VEND_CD() != null) {
					msgKey.setKeyValue("sub2_VEND_CD", key.getsub2_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("sub2_FIXED_LT") && key.getsub2_FIXED_LT() != null) {
					msgKey.setKeyValue("sub2_FIXED_LT", key.getsub2_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROP_LT") && key.getsub2_PROP_LT() != null) {
					msgKey.setKeyValue("sub2_PROP_LT", key.getsub2_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("sub2_SAFETY_LT") && key.getsub2_SAFETY_LT() != null) {
					msgKey.setKeyValue("sub2_SAFETY_LT", key.getsub2_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("sub2_PROP_LOT_SIZE") && key.getsub2_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("sub2_PROP_LOT_SIZE", key.getsub2_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("sub2_SPOIL") && key.getsub2_SPOIL() != null) {
					msgKey.setKeyValue("sub2_SPOIL", key.getsub2_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP") && key.getsub2_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("sub2_OUTSIDE_TYP", key.getsub2_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP") && key.getsub2_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("sub2_ACPT_INSPC_TYP", key.getsub2_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("sub2_STANDARD_COST") && key.getsub2_STANDARD_COST() != null) {
					msgKey.setKeyValue("sub2_STANDARD_COST", key.getsub2_STANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("sub2_UNIT_QTY") && key.getsub2_UNIT_QTY() != null) {
					msgKey.setKeyValue("sub2_UNIT_QTY", key.getsub2_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("sub2_WORK_TIME") && key.getsub2_WORK_TIME() != null) {
					msgKey.setKeyValue("sub2_WORK_TIME", key.getsub2_WORK_TIME());
				}
				if(msgKeyType.containsKeyColumn("sub2_MODIFY_COUNT") && key.getsub2_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("sub2_MODIFY_COUNT", key.getsub2_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("sub2_ITEM_NAME") && key.getsub2_ITEM_NAME() != null) {
					msgKey.setKeyValue("sub2_ITEM_NAME", key.getsub2_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_WS_NAME") && key.getsub2_WS_NAME() != null) {
					msgKey.setKeyValue("sub2_WS_NAME", key.getsub2_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_VEND_NAME") && key.getsub2_VEND_NAME() != null) {
					msgKey.setKeyValue("sub2_VEND_NAME", key.getsub2_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT") && key.getsub2_STOCK_UNIT() != null) {
					msgKey.setKeyValue("sub2_STOCK_UNIT", key.getsub2_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("sub2_MANHOUR_TYP") && key.getsub2_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("sub2_MANHOUR_TYP", key.getsub2_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("BY_PRODUCT_CD") && key.getBY_PRODUCT_CD() != null) {
					msgKey.setKeyValue("BY_PRODUCT_CD", key.getBY_PRODUCT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARAM_RESULT_DATA") && key.getPARAM_RESULT_DATA() != null) {
					msgKey.setKeyValue("PARAM_RESULT_DATA", key.getPARAM_RESULT_DATA());
				}
				if(msgKeyType.containsKeyColumn("PARAM_INPUT_DATA") && key.getPARAM_INPUT_DATA() != null) {
					msgKey.setKeyValue("PARAM_INPUT_DATA", key.getPARAM_INPUT_DATA());
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
					AA0170010Struct key = new AA0170010Struct();
					if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_name")) {
						key.setsub2_OUTSIDE_TYP_name(msgKey.getKeyValue("sub2_OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP_val")) {
						key.setsub2_OUTSIDE_TYP_val(msgKey.getKeyValue("sub2_OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_name")) {
						key.setsub2_ACPT_INSPC_TYP_name(msgKey.getKeyValue("sub2_ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP_val")) {
						key.setsub2_ACPT_INSPC_TYP_val(msgKey.getKeyValue("sub2_ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("main_TARGET_ITEM_CD")) {
						key.setmain_TARGET_ITEM_CD(msgKey.getKeyValue("main_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP")) {
						key.setmain_DEVELOP_TYP(msgKey.getKeyValue("main_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_name")) {
						key.setmain_DEVELOP_TYP_name(msgKey.getKeyValue("main_DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("main_DEVELOP_TYP_val")) {
						key.setmain_DEVELOP_TYP_val(msgKey.getKeyValue("main_DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("main_TARGET_DATE")) {
						key.setmain_TARGET_DATE(msgKey.getKeyValue("main_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("main_LEVEL")) {
						key.setmain_LEVEL(msgKey.getKeyValue("main_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("ps_NO")) {
						key.setps_NO(msgKey.getKeyValue("ps_NO"));
					}
					if(msgKeyType.containsKeyColumn("ps_CONS_NAME")) {
						key.setps_CONS_NAME(msgKey.getKeyValue("ps_CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_LT_NAME")) {
						key.setps_PS_LT_NAME(msgKey.getKeyValue("ps_PS_LT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_COST_UP_NAME")) {
						key.setps_COST_UP_NAME(msgKey.getKeyValue("ps_COST_UP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_MRP_EXP_NAME")) {
						key.setps_MRP_EXP_NAME(msgKey.getKeyValue("ps_MRP_EXP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_OUTSIDE_NAME")) {
						key.setpr_OUTSIDE_NAME(msgKey.getKeyValue("pr_OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_NAME")) {
						key.setpr_ACPT_INSPC_NAME(msgKey.getKeyValue("pr_ACPT_INSPC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_NAME")) {
						key.setsub1_PARENT_ITEM_NAME(msgKey.getKeyValue("sub1_PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1_DEVELOP_TYP")) {
						key.setsub1_DEVELOP_TYP(msgKey.getKeyValue("sub1_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_NAME")) {
						key.setsub1_COMP_ITEM_NAME(msgKey.getKeyValue("sub1_COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MODIFY_COUNT")) {
						key.setsub1_MODIFY_COUNT(msgKey.getKeyValue("sub1_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_STOCK_UNIT")) {
						key.setsub1_STOCK_UNIT(msgKey.getKeyValue("sub1_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_name")) {
						key.setsub1_CONS_TYP_name(msgKey.getKeyValue("sub1_CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1_CONS_TYP_val")) {
						key.setsub1_CONS_TYP_val(msgKey.getKeyValue("sub1_CONS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_LT_CHECK")) {
						key.setsub1_PS_LT_CHECK(msgKey.getKeyValue("sub1_PS_LT_CHECK"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_name")) {
						key.setsub1_COST_UP_TYP_name(msgKey.getKeyValue("sub1_COST_UP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP_val")) {
						key.setsub1_COST_UP_TYP_val(msgKey.getKeyValue("sub1_COST_UP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_name")) {
						key.setsub1_MRP_EXP_TYP_name(msgKey.getKeyValue("sub1_MRP_EXP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP_val")) {
						key.setsub1_MRP_EXP_TYP_val(msgKey.getKeyValue("sub1_MRP_EXP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1_TARGET_ITEM_CD")) {
						key.setsub1_TARGET_ITEM_CD(msgKey.getKeyValue("sub1_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub1_LEVEL")) {
						key.setsub1_LEVEL(msgKey.getKeyValue("sub1_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("sub1_TARGET_DATE")) {
						key.setsub1_TARGET_DATE(msgKey.getKeyValue("sub1_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("pr_PS_EDITION")) {
						key.setpr_PS_EDITION(msgKey.getKeyValue("pr_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("hidden_ITEM_NAME")) {
						key.sethidden_ITEM_NAME(msgKey.getKeyValue("hidden_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STATUS")) {
						key.setsub2_STATUS(msgKey.getKeyValue("sub2_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_PROC_FLG")) {
						key.setFIRST_PROC_FLG(msgKey.getKeyValue("FIRST_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_NUMERATOR")) {
						key.setsub1_h_PS_UNIT_NUMERATOR(msgKey.getKeyValue("sub1_h_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub1_h_PS_UNIT_DENOMINATOR")) {
						key.setsub1_h_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("sub1_h_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_1")) {
						key.setsub2_STOCK_UNIT_1(msgKey.getKeyValue("sub2_STOCK_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_2")) {
						key.setsub2_STOCK_UNIT_2(msgKey.getKeyValue("sub2_STOCK_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT_3")) {
						key.setsub2_STOCK_UNIT_3(msgKey.getKeyValue("sub2_STOCK_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_NAME")) {
						key.setps_COMP_MANHOUR_NAME(msgKey.getKeyValue("ps_COMP_MANHOUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_CD")) {
						key.setps_PARENT_ITEM_CD(msgKey.getKeyValue("ps_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_CD")) {
						key.setps_COMP_ITEM_CD(msgKey.getKeyValue("ps_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_EDITION")) {
						key.setps_PS_EDITION(msgKey.getKeyValue("ps_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_UNIT_DENOMINATOR")) {
						key.setps_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("ps_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_UNIT_NUMERATOR")) {
						key.setps_PS_UNIT_NUMERATOR(msgKey.getKeyValue("ps_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_IN_DATE")) {
						key.setps_EFF_PHASE_IN_DATE(msgKey.getKeyValue("ps_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ps_EFF_PHASE_OUT_DATE")) {
						key.setps_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("ps_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_SPOIL")) {
						key.setps_PS_SPOIL(msgKey.getKeyValue("ps_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("ps_CONS_TYP")) {
						key.setps_CONS_TYP(msgKey.getKeyValue("ps_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_LT_FLG")) {
						key.setps_PS_LT_FLG(msgKey.getKeyValue("ps_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_FIXED_LT")) {
						key.setps_PS_FIXED_LT(msgKey.getKeyValue("ps_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_PROP_LT")) {
						key.setps_PS_PROP_LT(msgKey.getKeyValue("ps_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_PROP_LOT_SIZE")) {
						key.setps_PS_PROP_LOT_SIZE(msgKey.getKeyValue("ps_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ps_PS_REF_NO")) {
						key.setps_PS_REF_NO(msgKey.getKeyValue("ps_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("ps_COST_UP_TYP")) {
						key.setps_COST_UP_TYP(msgKey.getKeyValue("ps_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_MRP_EXP_TYP")) {
						key.setps_MRP_EXP_TYP(msgKey.getKeyValue("ps_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_MODIFY_COUNT")) {
						key.setps_MODIFY_COUNT(msgKey.getKeyValue("ps_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ps_PARENT_ITEM_NAME")) {
						key.setps_PARENT_ITEM_NAME(msgKey.getKeyValue("ps_PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_ITEM_NAME")) {
						key.setps_COMP_ITEM_NAME(msgKey.getKeyValue("ps_COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ps_STOCK_UNIT")) {
						key.setps_STOCK_UNIT(msgKey.getKeyValue("ps_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ps_COMP_MANHOUR_TYP")) {
						key.setps_COMP_MANHOUR_TYP(msgKey.getKeyValue("ps_COMP_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ps_PARENT_MANHOUR_TYP")) {
						key.setps_PARENT_MANHOUR_TYP(msgKey.getKeyValue("ps_PARENT_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PARENT_ITEM_CD")) {
						key.setsub1_PARENT_ITEM_CD(msgKey.getKeyValue("sub1_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COMP_ITEM_CD")) {
						key.setsub1_COMP_ITEM_CD(msgKey.getKeyValue("sub1_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_EDITION")) {
						key.setsub1_PS_EDITION(msgKey.getKeyValue("sub1_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_DENOMINATOR")) {
						key.setsub1_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("sub1_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_UNIT_NUMERATOR")) {
						key.setsub1_PS_UNIT_NUMERATOR(msgKey.getKeyValue("sub1_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_IN_DATE")) {
						key.setsub1_EFF_PHASE_IN_DATE(msgKey.getKeyValue("sub1_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_EFF_PHASE_OUT_DATE")) {
						key.setsub1_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("sub1_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_SPOIL")) {
						key.setsub1_PS_SPOIL(msgKey.getKeyValue("sub1_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("sub1_CONS_TYP")) {
						key.setsub1_CONS_TYP(msgKey.getKeyValue("sub1_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_LT_FLG")) {
						key.setsub1_PS_LT_FLG(msgKey.getKeyValue("sub1_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_FIXED_LT")) {
						key.setsub1_PS_FIXED_LT(msgKey.getKeyValue("sub1_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LT")) {
						key.setsub1_PS_PROP_LT(msgKey.getKeyValue("sub1_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_PROP_LOT_SIZE")) {
						key.setsub1_PS_PROP_LOT_SIZE(msgKey.getKeyValue("sub1_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("sub1_PS_REF_NO")) {
						key.setsub1_PS_REF_NO(msgKey.getKeyValue("sub1_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("sub1_COST_UP_TYP")) {
						key.setsub1_COST_UP_TYP(msgKey.getKeyValue("sub1_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub1_MRP_EXP_TYP")) {
						key.setsub1_MRP_EXP_TYP(msgKey.getKeyValue("sub1_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ACCESS_TYP")) {
						key.setACCESS_TYP(msgKey.getKeyValue("ACCESS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CMPLT_FLG")) {
						key.setCMPLT_FLG(msgKey.getKeyValue("CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP")) {
						key.setITEM_OUTSIDE_TYP(new Integer(msgKey.getKeyValue("ITEM_OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(new Integer(msgKey.getKeyValue("OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT")) {
						key.setITEM_FIXED_LT(new Long(msgKey.getKeyValue("ITEM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LT")) {
						key.setITEM_PROP_LT(new Long(msgKey.getKeyValue("ITEM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE")) {
						key.setITEM_PROP_LOT_SIZE(msgKey.getKeyValue("ITEM_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT")) {
						key.setITEM_ISSUE_LT(new Long(msgKey.getKeyValue("ITEM_ISSUE_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT")) {
						key.setITEM_SAFETY_LT(new Long(msgKey.getKeyValue("ITEM_SAFETY_LT")));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD")) {
						key.setw_TARGET_ITEM_CD(msgKey.getKeyValue("w_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_PLANT_CD")) {
						key.setpr_PLANT_CD(msgKey.getKeyValue("pr_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_ITEM_CD")) {
						key.setpr_ITEM_CD(msgKey.getKeyValue("pr_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROC_CD")) {
						key.setpr_PROC_CD(msgKey.getKeyValue("pr_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROC_NO")) {
						key.setpr_PROC_NO(msgKey.getKeyValue("pr_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROC_NAME")) {
						key.setpr_PROC_NAME(msgKey.getKeyValue("pr_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_WS_CD")) {
						key.setpr_WS_CD(msgKey.getKeyValue("pr_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_COMPANY_CD")) {
						key.setpr_COMPANY_CD(msgKey.getKeyValue("pr_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_VEND_CD")) {
						key.setpr_VEND_CD(msgKey.getKeyValue("pr_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("pr_FIXED_LT")) {
						key.setpr_FIXED_LT(msgKey.getKeyValue("pr_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROP_LT")) {
						key.setpr_PROP_LT(msgKey.getKeyValue("pr_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("pr_SAFETY_LT")) {
						key.setpr_SAFETY_LT(msgKey.getKeyValue("pr_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("pr_PROP_LOT_SIZE")) {
						key.setpr_PROP_LOT_SIZE(msgKey.getKeyValue("pr_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("pr_SPOIL")) {
						key.setpr_SPOIL(msgKey.getKeyValue("pr_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("pr_OUTSIDE_TYP")) {
						key.setpr_OUTSIDE_TYP(msgKey.getKeyValue("pr_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("pr_ACPT_INSPC_TYP")) {
						key.setpr_ACPT_INSPC_TYP(msgKey.getKeyValue("pr_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("pr_STANDARD_COST")) {
						key.setpr_STANDARD_COST(msgKey.getKeyValue("pr_STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("pr_MODIFY_COUNT")) {
						key.setpr_MODIFY_COUNT(msgKey.getKeyValue("pr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("pr_UNIT_QTY")) {
						key.setpr_UNIT_QTY(msgKey.getKeyValue("pr_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("pr_WORK_TIME")) {
						key.setpr_WORK_TIME(msgKey.getKeyValue("pr_WORK_TIME"));
					}
					if(msgKeyType.containsKeyColumn("pr_ITEM_NAME")) {
						key.setpr_ITEM_NAME(msgKey.getKeyValue("pr_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_WS_NAME")) {
						key.setpr_WS_NAME(msgKey.getKeyValue("pr_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_VEND_NAME")) {
						key.setpr_VEND_NAME(msgKey.getKeyValue("pr_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("pr_STOCK_UNIT")) {
						key.setpr_STOCK_UNIT(msgKey.getKeyValue("pr_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("hidden_ITEM_CD")) {
						key.sethidden_ITEM_CD(msgKey.getKeyValue("hidden_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PLANT_CD")) {
						key.setsub2_PLANT_CD(msgKey.getKeyValue("sub2_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ITEM_CD")) {
						key.setsub2_ITEM_CD(msgKey.getKeyValue("sub2_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROC_CD")) {
						key.setsub2_PROC_CD(msgKey.getKeyValue("sub2_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROC_NO")) {
						key.setsub2_PROC_NO(msgKey.getKeyValue("sub2_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROC_NAME")) {
						key.setsub2_PROC_NAME(msgKey.getKeyValue("sub2_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_WS_CD")) {
						key.setsub2_WS_CD(msgKey.getKeyValue("sub2_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_COMPANY_CD")) {
						key.setsub2_COMPANY_CD(msgKey.getKeyValue("sub2_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_VEND_CD")) {
						key.setsub2_VEND_CD(msgKey.getKeyValue("sub2_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("sub2_FIXED_LT")) {
						key.setsub2_FIXED_LT(msgKey.getKeyValue("sub2_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROP_LT")) {
						key.setsub2_PROP_LT(msgKey.getKeyValue("sub2_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_SAFETY_LT")) {
						key.setsub2_SAFETY_LT(msgKey.getKeyValue("sub2_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_PROP_LOT_SIZE")) {
						key.setsub2_PROP_LOT_SIZE(msgKey.getKeyValue("sub2_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("sub2_SPOIL")) {
						key.setsub2_SPOIL(msgKey.getKeyValue("sub2_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("sub2_OUTSIDE_TYP")) {
						key.setsub2_OUTSIDE_TYP(msgKey.getKeyValue("sub2_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ACPT_INSPC_TYP")) {
						key.setsub2_ACPT_INSPC_TYP(msgKey.getKeyValue("sub2_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STANDARD_COST")) {
						key.setsub2_STANDARD_COST(msgKey.getKeyValue("sub2_STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("sub2_UNIT_QTY")) {
						key.setsub2_UNIT_QTY(msgKey.getKeyValue("sub2_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("sub2_WORK_TIME")) {
						key.setsub2_WORK_TIME(msgKey.getKeyValue("sub2_WORK_TIME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_MODIFY_COUNT")) {
						key.setsub2_MODIFY_COUNT(msgKey.getKeyValue("sub2_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_ITEM_NAME")) {
						key.setsub2_ITEM_NAME(msgKey.getKeyValue("sub2_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_WS_NAME")) {
						key.setsub2_WS_NAME(msgKey.getKeyValue("sub2_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_VEND_NAME")) {
						key.setsub2_VEND_NAME(msgKey.getKeyValue("sub2_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub2_STOCK_UNIT")) {
						key.setsub2_STOCK_UNIT(msgKey.getKeyValue("sub2_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("sub2_MANHOUR_TYP")) {
						key.setsub2_MANHOUR_TYP(msgKey.getKeyValue("sub2_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("BY_PRODUCT_CD")) {
						key.setBY_PRODUCT_CD(msgKey.getKeyValue("BY_PRODUCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_RESULT_DATA")) {
						key.setPARAM_RESULT_DATA(msgKey.getKeyValue("PARAM_RESULT_DATA"));
					}
					if(msgKeyType.containsKeyColumn("PARAM_INPUT_DATA")) {
						key.setPARAM_INPUT_DATA(msgKey.getKeyValue("PARAM_INPUT_DATA"));
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
