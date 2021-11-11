/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0090/src/com/nec/jp/orteus/metamorBase/AC0090/AC0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0090;

import com.nec.jp.orteus.metamorBase.AC0090.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0090010Control
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
       
        public AC0090010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
           //------------------------------------------------------------------------------
       
        /** 品目手配区分 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /** 品目手配区分設定
         * @param コンボボックスデータ
        */
        public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** 品目手配区分取得
         * @return 品目手配区分のコンボボックスデータ
        */
        public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }
       
        /** 内外作成区分 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /** 内外作成区分設定
         * @param コンボボックスデータ
        */
        public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** 内外作成区分取得
         * @return 内外作成区分のコンボボックスデータ
        */
        public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }
         
        /** 在庫数量単位区分 */
        private ComboStruct _UNIT_QTY_TYP = new ComboStruct();
       
        /** 在庫数量単位区分
         * @param コンボボックスデータ
        */
        public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }
       
        /** 在庫数量単位区分
         * @return 在庫数量単位区分のコンボボックスデータ
        */
        public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }
       
        /** ロットまとめ区分 */
        private ComboStruct _LOT_SIZING_TYP = new ComboStruct();
       
        /** ロットまとめ区分
         * @param コンボボックスデータ
        */
        public void setLOT_SIZING_TYP(ComboStruct combo){ _LOT_SIZING_TYP = combo; }
       
        /** ロットまとめ区分
         * @return ロットまとめ区分のコンボボックスデータ
        */
        public ComboStruct getLOT_SIZING_TYP(){ return _LOT_SIZING_TYP; }
         
        //-------------------------------------------------------------------------
         
           /** 画面共通定義取得クラス */
           ScreenParam _scParam = sp;
       
           //------------------------------------------------------------------------
       
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
       
           //------------------------------------------------------------------------
       
           /** 業務運用開始日格納用 */
           private Date _sysDate = new Date();
       
           //------------------------------------------------------------------------
       
           // 明細行全件のチェックボックスの値
           private List _EntryList = null;
           public List getEntryList() { return _EntryList; }
           public void setEntryList(List listname) { _EntryList = listname; }
       
          /** 画面パラメータ（最大表示行数）取得アクセスキー */
           private final static int _DISPLAY_CD_PARENT = 10;
           private final static int _DISPLAY_CD_PARENT_SUB = 20;
       
           /**
            * 表示最大行数制限処理
            *
            * @param key アクセスキー
            * @param size 対象行数
            * @return 異常なし true エラー false
            */
           private boolean checkMaxDispLine(int key, long rowCount) throws FoundationException, SQLException
           {
               ScreenParam sp = new ScreenParam(this.getClass());
               int maxLine = sp.getMaxLine(conn,key);
               if(maxLine != 0 && rowCount == maxLine + 1)
               {
          ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          emsg = new ExpjMessage( "ZZ01006", "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + struct.getw_PLANT_CD() );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
                   return false;
               }
               return true;
           }
         
           /**
            * 業務運用日の取得処理
            *
            * @return 異常なし true エラー false
            */
           private boolean getSystemDate() throws SQLException, FoundationException
           {
            String Message = "";
            
               // 業務運用日の取得
               List dateList = entity.mSYS_DATE_CTRL.read(conn, struct);
               if(dateList.size() > 0) {
                   AC0090010Struct dateStruct = (AC0090010Struct)dateList.get(0);
                   DateConverter dc = new DateConverter();
                   _sysDate = dc.str2date(dateStruct.gets_BUSINESS_DATE());
               } else{
          Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
          setErrorMessage("ZZ06001", Message);
                   return false;
               }
       
               return true;
           }
       
           /**
            * 品目情報の設定
            *
            * @param itemList 品目情報
            * @return なし
            */
        private void setItemInfo(List itemList)
        {
         AC0090010Struct itemStruct = (AC0090010Struct)itemList.get(0);
         
         // 品目名
         struct.setw_ITEM_NAME(itemStruct.getw_ITEM_NAME());
         // 図面番号
         struct.setw_DRAW_CD(itemStruct.getw_DRAW_CD());
         // 規格
         struct.setw_SPEC(itemStruct.getw_SPEC());
         // 品目手配区分
         struct.setw_MRP_ODR_TYP(getComboItem(this.getMRP_ODR_TYP(), itemStruct.getw_MRP_ODR_TYP()));
         // 品目内外作区分
         struct.setw_OUTSIDE_TYP(getComboItem(this.getOUTSIDE_TYP(), itemStruct.getw_OUTSIDE_TYP()));
         // 品目仕損率
         struct.setw_ITEM_SPOIL(itemStruct.getw_ITEM_SPOIL());
         // 在庫数単位区分
         struct.setw_UNIT_QTY_TYP(getComboItem(this.getUNIT_QTY_TYP(), itemStruct.getw_UNIT_QTY_TYP()));
         // ロットまとめ区分
         struct.setw_LOT_SIZING_TYP(getComboItem(this.getLOT_SIZING_TYP(), itemStruct.getw_LOT_SIZING_TYP()));
         // 最大まとめ期間
         struct.setw_MAX_PERIOD(itemStruct.getw_MAX_PERIOD());
         // まるめ単位
         struct.setw_MUL_ODR_QTY(itemStruct.getw_MUL_ODR_QTY());
         // 安全在庫
         struct.setw_SAFETY_STOCK(itemStruct.getw_SAFETY_STOCK());
         // 最大手配数量
         struct.setw_MAX_ODR_QTY(itemStruct.getw_MAX_ODR_QTY());
         // 最小手配数量
         struct.setw_MIN_ODR_QTY(itemStruct.getw_MIN_ODR_QTY());
         // 計量単位
         struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
        }
       
         
           /**
            * 品目情報のクリア
            *
            * @return なし
            */
        private void setItemClear()
        {
         struct.setw_ITEM_NAME("");
         struct.setw_DRAW_CD("");
         struct.setw_SPEC("");
         struct.setw_MRP_ODR_TYP("");
         struct.setw_OUTSIDE_TYP("");
         struct.setw_ITEM_SPOIL("");
         struct.setw_UNIT_QTY_TYP("");
         struct.setw_LOT_SIZING_TYP("");
         struct.setw_MAX_PERIOD("");
         struct.setw_MUL_ODR_QTY("");
         struct.setw_SAFETY_STOCK("");
         struct.setw_MAX_ODR_QTY("");
         struct.setw_MIN_ODR_QTY("");
         struct.setSTOCK_UNIT("");
        }
       
           /**
            * サブ画面情報の設定
            *
            * @param temp_struct AC0090010Struct temp_struct
            * @return なし
            */
        private void setSubParamInfo(AC0090010Struct temp_struct)
        {
         // 納期
         struct.setw_subDUE_DATE(temp_struct.getDUE_DATE().substring(0,10));
         // 納期（時刻）
        
         if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
	         struct.setw_subDUE_TIME(temp_struct.getDUE_DATE().substring(11,16));
         }else{
             struct.setw_subDUE_TIME("");
         }
                        	
         // 外部デマンド数
         struct.setw_subDM_QTY(temp_struct.getDM_QTY());
         // 品目番号
         struct.setw_subITEM_CD(struct.getw_ITEM_CD());
         // 品目名
         struct.setw_subITEM_NAME(struct.getw_ITEM_NAME());
         // 外部計画番号
         struct.setw_subEXTERNAL_PLAN_CD(temp_struct.getEXTERNAL_PLAN_CD());
         // 工場コード
         struct.setw_subPLANT_CD(struct.getw_PLANT_CD());
         // 工場名
         struct.setw_subPLANT_NAME(struct.getw_PLANT_NAME());
         // オーダデマンド番号
         struct.setOD_NO(temp_struct.getOD_NO());
         // 更新数
         struct.setMODIFY_COUNT(temp_struct.getMODIFY_COUNT());
        }
       
           /**
            * 更新データの設定
            *
            * @param temp_struct 製品構成から取得した情報
            * @return なし
            */
        private void setUpdateData(AC0090010Struct temp_struct)
        {
         // 所要量品目構成版数
         struct.setPS_EDITION(temp_struct.getPS_EDITION());
         // 製品構成リードタイム使用フラグ
         struct.setPS_LT_FLG(temp_struct.getPS_LT_FLG());
         // 製品構成固定分リードタイム
         struct.setPS_FIXED_LT(temp_struct.getPS_FIXED_LT());
         // 製品構成比例分リードタイム
         struct.setPS_PROP_LT(temp_struct.getPS_PROP_LT());
         // 製品構成比例分ロットサイズ
         struct.setPS_PROP_LOT_SIZE(temp_struct.getPS_PROP_LOT_SIZE());
         // 製品構成単位数
         struct.setPS_UNIT_QTY(Calculate.divide(temp_struct.getPS_UNIT_NUMERATOR(),
                temp_struct.getPS_UNIT_DENOMINATOR(),
                4,
                Calculate._ROUND));
         // 製品構成単位数分母
         struct.setPS_UNIT_DENOMINATOR(temp_struct.getPS_UNIT_DENOMINATOR());
         // 製品構成単位数分子
         struct.setPS_UNIT_NUMERATOR(temp_struct.getPS_UNIT_NUMERATOR());
         // 所要量構成仕損率
         struct.setPS_SPOIL(temp_struct.getPS_SPOIL());
         // 構成支給区分
         struct.setCONS_TYP(temp_struct.getCONS_TYP());
         // 所要量有効開始日
         struct.setEFF_PHASE_IN_DATE(temp_struct.getEFF_PHASE_IN_DATE());
         // 所要量有効終了日
         struct.setEFF_PHASE_OUT_DATE(temp_struct.getEFF_PHASE_OUT_DATE());
        }
         
           /**
            * サブ画面の生産計画期間の設定
            *
            * @param fromDUE_DATE 納期
            * @return なし
            */
        private void setSubDateInfo(String fromDUE_DATE)
        {
         // 生産計画期間(FROM)へ値を設定
         // 生産計画期間(TO)(時刻)へ値を親画面の入力日付(TO)(時刻)を設定
         if (fromDUE_DATE.length() > 10){
             struct.setw_subDATE_FROM(fromDUE_DATE.substring(0,10));
             struct.setw_subTIME_FROM(fromDUE_DATE.substring(11,13) + fromDUE_DATE.substring(14,16));
         }else{
             struct.setw_subDATE_FROM(fromDUE_DATE);
             struct.setw_subTIME_FROM("");
         }
       
         // 生産計画期間(TO)へ値を親画面の入力日付(TO)を設定
         struct.setw_subDATE_TO(struct.getw_DATE_TO());

         // 生産計画期間(TO)(時刻)へ値を親画面の入力日付(TO)(時刻)を設定
         struct.setw_subTIME_TO(struct.getw_TIME_TO());

        }
         
           /**
            * 生産計画期間の範囲チェック
            *
         * @param strFrom 生産計画期間(FROM)
         * @param strTo   生産計画期間(TO)
            * @return true/false
            */
        private boolean DateRangeCheck(String strFrom, String strTo) throws FoundationException, SQLException
        {
        	
         String minDateCal = null;
         String maxDateCal = null;
         // 処理結果フラグ初期化
         boolean result = true;
         String Message = "";
         AC0090010Struct dateStruct;
         int endfg = 0;
         int Checkfg =0;
         // 計画期間チェック用に生産計画期間を変更
         DateConverter dc = new DateConverter();
         Date fromDate = dc.str2date(strFrom);
         Date toDate = dc.str2date(strTo);
         
         // カレンダデータ取得
         List dateList = entity.mM_CAL1.read(conn, struct);
         if(dateList.size() > 0){
         	dateStruct = (AC0090010Struct)dateList.get(0);
         	minDateCal = dateStruct.gets_MIN_CAL_DATE();
         	maxDateCal = dateStruct.gets_MAX_CAL_DATE();
          // カレンダ範囲のチェック
          if(minDateCal != null && maxDateCal != null) {
              endfg = 1;
          	  Checkfg =1;
             }else{
             	dateList = entity.mM_CAL.read(conn, struct);
             	if(dateList.size() > 0){
             		dateStruct = (AC0090010Struct)dateList.get(0);
             		minDateCal = dateStruct.gets_MIN_CAL_DATE();
             		maxDateCal = dateStruct.gets_MAX_CAL_DATE();
             		if(minDateCal != null && maxDateCal != null) {
             		   	endfg = 1;
             		   }else{
             		   	// カレンダ取得失敗
           				Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
           				setErrorMessage("AC10005", Message);
           				result = false;
             		   }
             	}else{
             		// カレンダ取得失敗
           			Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
           			setErrorMessage("AC10005", Message);
           			result = false;
             	}
             }
         }else{
         	// カレンダ取得失敗
            Message = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
            setErrorMessage("AC10005", Message);
            result = false;
         }
         	if(endfg ==1){
         		Date minCalDate = dc.str2date(minDateCal);
              	Date maxCalDate = dc.str2date(maxDateCal);
              
              	// カレンダ範囲チェックフラグ
              	boolean calFlag = true;
              	if(fromDate == null && toDate != null) {
               		if(maxCalDate.getTime() < toDate.getTime()) {
                 	calFlag = false;
               	}
              	} else if(fromDate != null && toDate == null) {
               	if(minCalDate.getTime() > fromDate.getTime()) {
                	calFlag = false;
               	}
              	} else if(fromDate != null && toDate != null) {
               	if(minCalDate.getTime() > fromDate.getTime() ||
                  maxCalDate.getTime() < toDate.getTime()) {
                   calFlag = false;
               }
              }
              // 計画期間がカレンダの範囲外
           if(!calFlag) {
           	if(Checkfg ==1){
           		Message = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
            	setErrorMessage("AC10005", Message);
            	result = false;
           	}else{
           		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
           		setErrorMessage("AC10005", Message);
           		result = false;
           	}
           }
         	}else{
         		// カレンダ取得失敗
            	Message = "SYS_DATE_CTRL.ITEM_CD:" + struct.getw_ITEM_CD();
            	setErrorMessage("AC10005", Message);
            	result = false;
         	}
         
            // 生産計画期間(FROM)が業務運用日より過去
         if(_sysDate.getTime() > fromDate.getTime()) {
          Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
          setErrorMessage("AC10006", Message);
          result = false;
         }
         return result;
        }
         
           /**
            * コンボリストから取得したいキー値の値を取得
            *
         * @param comboList コンボボックスのリスト
         * @param read_item 取得したい値のキー値
            * @return コンボリストより取得したい値
            */
        private String getComboItem(ComboStruct comboList, String read_item)
        {
         String val = "";
         
         for(int i = 0; i < comboList.getValList().size(); i++)
         {
          val = (String)(comboList.getValList().get(i));
          if(val.equals(TypeConverter.sanitizer(read_item)) == true)
          {
           return (String)(comboList.getExplanList().get(i));
          }
         }
         
         return "";
        }
         
        /** 親画面struct情報一時退避用 */
        private AC0090010Struct _save_struct = new AC0090010Struct();
       
        /**
         * 親画面のstruct情報を退避
         */
        private void w_subTIME_TO()
        {
         _save_struct.copy(struct);
        }
       
        /**
         * 親画面のstruct情報を復帰
         */
        private void loadParentStruct()
        {
         struct.copy(_save_struct);
        }
       
        // 行修正/紐付け解除/登録対象の構成情報No
        private Integer _checkNo = null;
        
        /** 行修正/紐付け解除/登録対象対象の構成情報No取得
         * @return 構成情報No
        */
        public Integer getCheckNumber(){ return _checkNo; }
       
        /** 行修正/紐付け解除/登録対象対象の構成情報No設定
         * @param 行修正/紐付け解除/登録対象対象の構成情報No
        */
        public void setCheckNumber(Integer no){ _checkNo = no; }
         
        /*
         * デフォルト生産計画期間日付取得設定
         *
         * @return	なし
         */
        private void setDefaultPeriodDate() throws ExpjException
        {
               // 業務運用日の取得
         Date dateBusinessOprDate = null;
               try
               {
                if(getSystemDate() == true) {
                 dateBusinessOprDate = _sysDate;
                }
                
          // デフォルト生産計画期間日付取得
          String strDefDate[] = {"", ""};
          boolean bResult = false;
                
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
                
          if(bResult == true)
          {
           // 取得成功
           struct.setw_DATE_FROM(strDefDate[0]);
           struct.setw_DATE_TO(strDefDate[1]);
          }
          else
          {
           // 取得失敗
           ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
           sysLog.severe(emsg, getsysUSER_CD());
           ExpjException ee = new ExpjException(emsg);
           
           throw ee;
          }
         }
         catch(SQLException se)
         {
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
         catch(FoundationException fe)
         {
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
       
       
       
        }
         
        /**
         * SQLExceptionエラーメッセージ設定
         * @param SQLException
         * @param 出力エラーメッセージ
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
         setReadStatus(ERROR);
         
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
        private void setErrorMessage(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * エラーメッセージ設定
         * @param メッセージ番号
         * @param 出力メッセージ(List)
         */
        private void setErrorMessage(String messageno, List message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         
         for(int i=0; i<message.size(); i++)
         {
          emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
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
        }

        /** 時刻管理用フラグ */
        private String _flgTimeCtrl = null;

        /**
        * 検索条件の設定
        */
        private void setSearchCondition() {

                // データ引数クリア
                struct.setw_DATE_FROM_ALL(null);
                struct.setw_DATE_TO_ALL(null);

                // 抽出条件（日付の設定）
                if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){

                        if (struct.getw_DATE_FROM() != null && !struct.getw_DATE_FROM().equals("")) {
                                //発注予定日の時刻が00:00以外の場合⇒そのまま検索
                                if (struct.getw_TIME_FROM() != null && !struct.getw_TIME_FROM().equals("")) {
                                        /** 発注予定日（時刻含む）*/
                                        struct.setw_DATE_FROM_ALL(struct.getw_DATE_FROM() + " " + 
                                                                struct.getw_TIME_FROM().substring(0,2) + ":" + 
                                                                struct.getw_TIME_FROM().substring(2));
                                //発注予定日の時刻が未入力の場合⇒日付のみで検索
                                }else{
                                        /** 発注予定日 **/
                                        struct.setw_DATE_FROM_ALL(struct.getw_DATE_FROM());
                                }
                        }
                        if (struct.getw_DATE_TO() != null && !struct.getw_DATE_TO().equals("")) {
                                //発注納期の時刻が00:00以外の場合⇒そのまま検索
                                if (struct.getw_TIME_TO() != null && !struct.getw_TIME_TO().equals("")) {
                                        /** 発注納期（時刻含む）*/
                                        struct.setw_DATE_TO_ALL(struct.getw_DATE_TO() + " " + 
                                                                struct.getw_TIME_TO().substring(0,2) + ":" + 
                                                                struct.getw_TIME_TO().substring(2));
                                //発注納期の時刻が未入力の場合⇒23:59で検索
                                }else{
                                        /** 発注納期（時刻含む）*/
                                        struct.setw_DATE_TO_ALL(struct.getw_DATE_TO() + " 23:59");
                                }
                        }
                }else{
                        if (struct.getw_DATE_FROM() != null && !struct.getw_DATE_FROM().equals("")) {
                                /** 発注予定日 **/
                                struct.setw_DATE_FROM_ALL(struct.getw_DATE_FROM());
                        }
                        if (struct.getw_DATE_TO() != null && !struct.getw_DATE_TO().equals("")) {
                                /** 発注納期（時刻含む）*/
                                struct.setw_DATE_TO_ALL(struct.getw_DATE_TO() + " 23:59");
                        }
                }
        }

        /**
        * 検索条件の設定
        */
        private void setSearchCondition_sub1() {

                // データ引数クリア
                struct.setw_subDATE_FROM_ALL(null);
                struct.setw_subDATE_TO_ALL(null);

                // 抽出条件（日付の設定）
                if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){

                        if (struct.getw_subDATE_FROM() != null && !struct.getw_subDATE_FROM().equals("")) {
                                //発注予定日の時刻が00:00以外の場合⇒そのまま検索
                                if (struct.getw_subTIME_FROM() != null && !struct.getw_subTIME_FROM().equals("")) {
                                        /** 発注予定日（時刻含む）*/
                                        struct.setw_subDATE_FROM_ALL(struct.getw_subDATE_FROM() + " " + 
                                                                     struct.getw_subTIME_FROM().substring(0,2) + ":" + 
                                                                     struct.getw_subTIME_FROM().substring(2));
                                //発注予定日の時刻が未入力の場合⇒日付のみで検索
                                }else{
                                        /** 発注予定日 **/
                                        struct.setw_subDATE_FROM_ALL(struct.getw_subDATE_FROM());
                                }
                        }
                        if (struct.getw_subDATE_TO() != null && !struct.getw_subDATE_TO().equals("")) {
                                //発注納期の時刻が00:00以外の場合⇒そのまま検索
                                if (struct.getw_subTIME_TO() != null && !struct.getw_subTIME_TO().equals("")) {
                                        /** 発注納期（時刻含む）*/
                                        struct.setw_subDATE_TO_ALL(struct.getw_subDATE_TO() + " " + 
                                                                   struct.getw_subTIME_TO().substring(0,2) + ":" + 
                                                                   struct.getw_subTIME_TO().substring(2));
                                //発注納期の時刻が未入力の場合⇒23:59で検索
                                }else{
                                        /** 発注納期（時刻含む）*/
                                        struct.setw_subDATE_TO_ALL(struct.getw_subDATE_TO() + " 23:59");
                                }
                        }
                }else{
                        if (struct.getw_subDATE_FROM() != null && !struct.getw_subDATE_FROM().equals("")) {
                                /** 発注予定日 **/
                                struct.setw_subDATE_FROM_ALL(struct.getw_subDATE_FROM());
                        }
                        if (struct.getw_subDATE_TO() != null && !struct.getw_subDATE_TO().equals("")) {
                                /** 発注納期（時刻含む）*/
                                struct.setw_subDATE_TO_ALL(struct.getw_subDATE_TO() + " 23:59");
                        }
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //---------------------------------------------------------------------
              
                // 読込処理成功フラグ初期化
                boolean readResult = false;
              
                // 親画面のstructを退避
                w_subTIME_TO();
                 
                String Message = "";
                List listMessage = new ArrayList();
                
                // 読込前の状態を初期化
                setReadStatus(INITIAL);
              
                try {
                    // 処理結果フラグ初期化
                    boolean result = true;
                 boolean bValidPlantCD = true;
                 boolean bValidItemCD = true;
                    // 最大表示検索数結果フラグ初期化
                    
                	
                 // 表示されているリストをクリアする
                 list.clear();
              
                 // エラーチェック
                 // 品目コードのチェック
                 List itemList = entity.mM_ITEM.read(conn, struct);
                 if(itemList.size() <= 0) {
                           // 読込処理失敗：品目コードが存在しません
                  Message = "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD();
                  setErrorMessage("AC10002", Message);
                  // 品目情報のクリア
                  setItemClear();
                  bValidItemCD = false;
                 } else {
                  // 品目情報をstructへ代入する
                  setItemInfo(itemList);
                 }
                     
                       // 工場コードの存在チェック
                    List plantList = entity.mM_PLANT.read(conn, struct);
                       if(plantList.size() <= 0) {
                           // 読込処理失敗：工場コードが存在しません
                           struct.setw_PLANT_NAME("");
                  Message = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
                  setErrorMessage("AC10001", Message);
                           bValidPlantCD = false;
                       } else {
                           AC0090010Struct plantStruct = (AC0090010Struct)plantList.get(0);
                           struct.setw_PLANT_NAME(plantStruct.getw_PLANT_NAME());
              
                        // 生産計画期間の範囲チェック
                        result = DateRangeCheck(struct.getw_DATE_FROM(), struct.getw_DATE_TO());
                 }
              
                 // エラーがない場合
                 if(bValidItemCD && bValidPlantCD && result) {

                  //入力時刻のチェック(時刻管理する場合のみ)
                  if((struct.getTIME_CTRL()).equals("true")){
                          //①発注予定日(時刻)のチェック
                          if((struct.getw_TIME_FROM()).length() == 3 ){
                              //３桁は頭に０を付ける
                              struct.setw_TIME_FROM("0" + struct.getw_TIME_FROM());
                          }
                          //②発注納期(時刻)のチェック
                          if((struct.getw_TIME_TO()).length() == 3 ){
                              //３桁は頭に０を付ける
                              struct.setw_TIME_TO("0" + struct.getw_TIME_TO());
                          }
                  }else{
                      struct.setw_TIME_FROM("");
                      struct.setw_TIME_TO("");
                  }

                  // 検索条件の設定
                  setSearchCondition();
                  // 読込実行
                  List read_list = new ArrayList(0);
                  int maxLine = sp.getMaxLine(conn, _DISPLAY_CD_PARENT);
      			  if(maxLine != 0) {
      				struct.setROW_COUNT(String.valueOf(maxLine));
      			  } else {
      				struct.setROW_COUNT(null);
      			  }
      			 read_list = entity.mT_OD_DEMANDOCnt.read(conn, struct);
      			 long rowCount = Long.parseLong(((AC0090010Struct)read_list.get(0)).getl_COUNT());
      			 // 検索結果が０件の場合
      			 if(rowCount==0) {
      				 setReadStatus(NOT_FOUND);
                     listMessage.add("T_OD.PLANT_CD:" + struct.getw_PLANT_CD());
                     listMessage.add("T_OD.ITEM_CD:" + struct.getw_ITEM_CD());
                     listMessage.add("T_OD.DUE_DATE[FROM]:" + struct.getw_DATE_FROM());
                     listMessage.add("T_OD.DUE_DATE[TO]:" + struct.getw_DATE_TO());
                     setErrorMessage("ZZ06001", listMessage);
      			 }else {
                       // 表示最大行数制限処理
                       if(checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
                           read_list = entity.mT_OD_DEMANDO.read(conn, struct);
                           setReadStatus(NORMAL);
                           for(int i=0; i < read_list.size(); i++) {
                           AC0090010Struct viewStruct = (AC0090010Struct)read_list.get(i);
                           }
                       // 表示用リストを更新
                       setList(read_list);
                       // 読込処理成功フラグ設定
                      readResult = true;
                      }else{
                	      // 状態に最大表示行数以上を設定
                           setReadStatus(TOO_MANY);
                      }
      			 }
               }
              }catch(SQLException e) {
                    setSqlExceptionMsg(e);
              
                } finally {
                    if(readResult) {
                     setReadStatus(NORMAL);
                     
                    } else {
                         setReadStatus(INITIAL);
                         // エラーの場合、表示リストをクリア
                        if(list!=null && list.size()>0){   
                           list.clear();
                        }
                    }
                }

                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                //---------------------------------------------------------------------
              
                // サブ画面の生産計画期間の設定
                setSubDateInfo(struct.getDUE_DATE());
              
                // サブ画面の情報を設定
                setSubParamInfo(struct);

                // サブ画面の読込み処理
                controlselect_sub1();
              
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * 紐付け解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
                
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
                 
                // 更新処理成功フラグ初期化
                boolean bSuccess = false;
                 
                // 処理直前のstruct情報を退避
                AC0090010Struct copy_struct = new AC0090010Struct();
                copy_struct.copy(struct);
                 
                String Message = "";
				
                try {
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
                 
                 // 更新チェックの確認
                 List m_list = entity.mT_OD_DEMANDO4Update.read(conn, struct);
                 if(m_list.size() <= 0){
                  Message = "T_OD.OD_NO:" + struct.getOD_NO();
                  setErrorMessage("ZZ06001", Message);
                 }
                 else{
                  String modify = ((AC0090010Struct)m_list.get(0)).getMODIFY_COUNT();
              
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "T_OD.OD_NO:" + struct.getOD_NO();
                   setErrorMessage("ZZ01105", Message);
                  }
                 }
                 
                 // エラーが発生していない場合、更新処理実施
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 更新
                  entity.mT_OD_DEMANDO.update(conn, struct);
                  
                  // コミット
                  conn.commit();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                  
                  // 更新処理成功フラグ設定
                  bSuccess = true;
                  
                  // 退避したstructを再設定
                  struct.copy(copy_struct);
                  
                  try {
                   //時刻管理パラメータ取得
                   List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                   if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                       struct.setTIME_CTRL("false");
                       _flgTimeCtrl = "false";
                   }else{
                       struct.setTIME_CTRL(((AC0090010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                       _flgTimeCtrl = struct.getTIME_CTRL();
                   }
                  } catch (SQLException e) {
                   throw new ExpjException(e);
                  }
                  
                  // 検索
                  controlselect();
              
                 }			
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                 }
                 
                 // 更新処理で失敗した場合
                 if(bSuccess != true)
                 {
                  // 処理直前の状態に戻す処理
                  struct.copy(copy_struct);
                 }
              
                }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                      //------------------------------------------------------------------
              
                   // クリア処理
                this.struct.clear();
              
                      // 自工場コード設定
                      struct.setw_PLANT_CD(getsysPLANT_CD());
              
                      // デフォルト生産計画期間取得設定
                      setDefaultPeriodDate();
              
                      // 表示リストをクリア
                      list.clear();
              
              
                try {
                 //時刻管理パラメータ取得
                 List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                 if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                     struct.setTIME_CTRL("false");
                     _flgTimeCtrl = "false";
                 }else{
                     struct.setTIME_CTRL(((AC0090010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                     _flgTimeCtrl = struct.getTIME_CTRL();
                 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }

                      // モード設定
                setReadStatus(INITIAL);

                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");
			//{{user_implement_dev:<controlselect_sub1>
                //---------------------------------------------------------------------
              
                // 読込処理成功フラグ初期化
                boolean readResult = false;
                 
                // 子画面の状態を初期化
                setReadStatus(INITIAL);
                 
                List listMessage = new ArrayList();
                 
                try {
                    // 処理結果フラグ初期化
                    boolean result = true;
                    // 最大表示検索数結果フラグ初期化
                    
                 // 表示されているリストをクリアする
                 list.clear();
              
                 // 親画面の工場コードを設定
                 struct.setw_PLANT_CD(_save_struct.getw_PLANT_CD());
                	
                 // 親画面の品目番号を設定
                 struct.setw_ITEM_CD(_save_struct.getw_ITEM_CD());
              
                 // 生産計画期間の範囲チェック
                 result = DateRangeCheck(struct.getw_subDATE_FROM(), struct.getw_subDATE_TO());
                 
                 // エラーがない場合
                 if(result) {

                  //入力時刻のチェック(時刻管理する場合のみ)
                  if((struct.getTIME_CTRL()).equals("true")){
                  	  if(struct.getw_subTIME_FROM() == null){
                          struct.setw_subTIME_FROM("");
                              //①発注予定日(時刻)のチェック
                              if((struct.getw_subTIME_FROM()).length() == 3 ){
                                  //３桁は頭に０を付ける
                                  struct.setw_subTIME_FROM("0" + struct.getw_subTIME_FROM());
                              }
                      }
                      if(struct.getw_subTIME_TO() == null){
                          struct.setw_subTIME_TO("");
                              //②発注納期(時刻)のチェック
                              if((struct.getw_subTIME_TO()).length() == 3 ){
                                  //３桁は頭に０を付ける
                                  struct.setw_subTIME_TO("0" + struct.getw_subTIME_TO());
                              }
                      }
                  }else{
                      struct.setw_subTIME_FROM("");
                      struct.setw_subTIME_TO("");
                  }

                  // 検索条件の設定
                  setSearchCondition_sub1();
                  // 読込実行
                  List read_list = new ArrayList(0);
                  int maxLine = sp.getMaxLine(conn, _DISPLAY_CD_PARENT_SUB);
        			if(maxLine != 0) {
        				struct.setROW_COUNT(String.valueOf(maxLine));
        			} else {
        				struct.setROW_COUNT(null);
        			}
        		  read_list = entity.mT_OD_ORDERCnt.read(conn, struct);
        		  long rowCount = Long.parseLong(((AC0090010Struct)read_list.get(0)).getl_COUNT());
        		  // 検索結果が０件の場合
        		  if(rowCount==0) {
                        result = false;
                        setReadStatus(NOT_FOUND);
                        listMessage.add("T_OD.ODR_START_DATE[FROM]:" + struct.getw_subDATE_FROM());
                        listMessage.add("T_OD.ODR_START_DATE[TO]:" + struct.getw_subDATE_TO());
                        listMessage.add("T_OD.ITEM_CD:" + struct.getw_subITEM_CD());
                        listMessage.add("T_OD.DUE_DATE:" + struct.getw_subDUE_DATE());
                        listMessage.add("T_OD.PLANT_CD:" + struct.getw_subPLANT_CD());
                        setErrorMessage("ZZ06001", listMessage);
                        if(list!=null && list.size()>0){
                        	list.clear();
                        }
                        return;
                  } 
        		  // 表示最大行数制限処理
                  if(checkMaxDispLine(_DISPLAY_CD_PARENT_SUB, rowCount)) {
                    read_list = entity.mT_OD_ORDER.read(conn, struct);
                    for(int i=0; i<read_list.size(); i++) {
                    AC0090010Struct read_struct = (AC0090010Struct)read_list.get(i);
              
                    // 子画面で選択した品目番号の設定
                    struct.setsubITEM_CD(read_struct.getsubITEM_CD());
                    
                    // オーダデマンド番号を設定する
                    struct.setsubOD_NO(read_struct.getsubOD_NO());
                    
                    // 従属デマンド数量の計算
                    List sumList = new ArrayList(0);
                    sumList = entity.mT_OD_ORDER_SUM.read(conn, struct);
                    AC0090010Struct sum_struct = (AC0090010Struct)sumList.get(0);
              
                    // 従属デマンド数の設定
                    if(sum_struct.getsubDM_QTY() == null) {
                     sum_struct.setsubDM_QTY("0");
                    }
                    read_struct.setsubSU_DM_QTY(sum_struct.getsubDM_QTY());
                    
                    // 製品構成単位数の計算
                    String divide = Calculate.divide(read_struct.getsubPS_UNIT_NUMERATOR(),
                             read_struct.getsubPS_UNIT_DENOMINATOR(),
                             4,
                             Calculate._ROUND);
              
                    // 紐付け可能デマンド数の設定
                    String sODR_QTY = Calculate.subtract(Calculate.multiply(read_struct.getsubODR_QTY(), divide), sum_struct.getsubDM_QTY());
                    if(Calculate.compare(sODR_QTY, "0") == -1) {
                     sODR_QTY = "0.0";
                    }
                    read_struct.setsubRE_ODR_QTY(sODR_QTY);
                    
                    // 構成単位数の設定
                    String sCP_UNIT = read_struct.getsubPS_UNIT_NUMERATOR() + "/" + read_struct.getsubPS_UNIT_DENOMINATOR();
                    read_struct.setCP_UNIT(sCP_UNIT);
                   }
                   
                    // 表示用リストを更新
                    setList(read_list);
                    
                    // 読込処理成功フラグ設定
                    readResult = true;
                  
                  }else{
               	      setReadStatus(TOO_MANY);
                  }
                 }
                } catch(SQLException e) {
                    setSqlExceptionMsg(e);
              
                } finally {
                    if(readResult) {
                     setReadStatus(NORMAL);
                    } else {
                           setReadStatus(INITIAL);
              
                            // エラーの場合、表示リストをクリア
                           if(list!=null && list.size()>=0){
                             list.clear();
                           }
                    }
                }
              
                //}}user_implement_dev:<controlselect_sub1>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
              
                // 子画面に遷移する前の親画面のstructを復帰
                loadParentStruct();
              
                try {
                 //時刻管理パラメータ取得
                 List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                 if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                     struct.setTIME_CTRL("false");
                     _flgTimeCtrl = "false";
                 }else{
                     struct.setTIME_CTRL(((AC0090010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                     _flgTimeCtrl = struct.getTIME_CTRL();
                 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }

                // 再読込処理
                controlselect();
              
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");
			//{{user_implement_dev:<controlupdate_sub1>
                //------------------------------------------------------------------
                
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
                 
                // 更新処理成功フラグ初期化
                boolean bSuccess = false;
                 
                // 処理直前のstruct情報を退避
                AC0090010Struct copy_struct = new AC0090010Struct();
                copy_struct.copy(struct);
                 
                String Message = "";
                List listMessage = new ArrayList();
              
                try {
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
                 
                 // 親画面のオーダデマンド番号を設定
                 struct.setOD_NO(copy_struct.getOD_NO());
              
                 // デマンドの納期を設定
                 struct.setw_subDUE_DATE(copy_struct.getw_subDUE_DATE());
              
                 // 親画面の更新数を設定
                 struct.setMODIFY_COUNT(copy_struct.getMODIFY_COUNT());
              
                 // 更新チェックの確認[デマンド]
                 List demando_list = entity.mT_OD_DEMANDO4Update.read(conn, struct);
                 
                 // 更新チェックの確認[オーダ]
                 List order_list = entity.mT_OD_ORDER4Update.read(conn, struct);
                 
                 if(demando_list.size() <= 0){
                  Message = "T_OD.OD_NO[DEMANDO]:" + struct.getOD_NO();
                  setErrorMessage("ZZ06001", Message);
                  
                 } else if(order_list.size() <= 0){
                  Message = "T_OD.OD_NO[ORDER]:" + struct.getsubOD_NO();
                  setErrorMessage("ZZ06001", Message);
                  
                 } else{
                  String modify = ((AC0090010Struct)demando_list.get(0)).getMODIFY_COUNT();
                  String sub_modify = ((AC0090010Struct)order_list.get(0)).getsubMODIFY_COUNT();
              
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "T_OD.OD_NO[DEMANDO]:" + struct.getOD_NO();
                   setErrorMessage("ZZ01105", Message);
                  }
              
                  if (struct.getsubMODIFY_COUNT().equals(sub_modify) == false)
                  {
                   Message = "T_OD.OD_NO[ORDER]:" + struct.getsubOD_NO();
                   setErrorMessage("ZZ01105", Message);
                  }
                 }
              
                 // エラーが発生していない場合、更新処理実施
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 親画面の品目番号を設定する
                  struct.setw_subITEM_CD(copy_struct.getw_subITEM_CD());
              
                  // 構成品目からデータを取得する
                  List read_list = new ArrayList(0);
                  read_list = entity.mT_OD_DEMANDO_SUB.read(conn, struct);
              
                  // 検索結果が０件の場合
                  if(read_list.size() < 1) {
                    listMessage.add("M_PS.PARENT_ITEM_CD:" + struct.getsubITEM_CD());
                    listMessage.add("M_PS.COMP_ITEM_CD:" + struct.getw_subITEM_CD());
                    listMessage.add("M_PS.EFF_PHASE_IN_DATE:" + struct.getw_subDUE_DATE());
                    setErrorMessage("AC10033", listMessage);
                  } else {
                   // 
                   AC0090010Struct ps_struct = new AC0090010Struct();
                   ps_struct = (AC0090010Struct)read_list.get(0);
              
                   // 更新データの設定
                   setUpdateData(ps_struct);
                   
                   // 該当デマンドの所要量テーブルを更新
                   entity.mT_OD_DEMANDO_SUB.update(conn, struct);
                   
                   // 上位オーダの所要量テーブルを更新
                   entity.mT_OD_ORDER.update(conn, struct);
                   
                   // コミット
                   conn.commit();
              
                   // DB更新中フラグOFF
                   bDBUpdate = false;
                   
                   // 更新処理成功フラグ設定
                   bSuccess = true;
                   
                   // 子画面に遷移する前の親画面のstructを復帰
                   loadParentStruct();
                   
                   // 検索
                   controlselect();
                  }
                 }
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                 }
                 
                 // 更新処理で失敗した場合
                 if(bSuccess != true)
                 {
                  // 処理直前の状態に戻す処理
                  struct.copy(copy_struct);
                 }
              
                }
                //}}user_implement_dev:<controlupdate_sub1>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                      try {
              
                 // コンボボックスデータ用意
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
              
                 //品目手配区分
                 _MRP_ODR_TYP  = controller.getData("MRP_ODR_TYP");
                 //内外作成区分
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
                    // 在庫数量単位区分
                    _UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
                    //ロットまとめ区分
                    _LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");
                       
                          // クリア処理
                          controlclear();
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }catch(ComboException e){
                 // エラーメッセージ作成
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0090");
		logger.entering("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AC0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("select_sub1") ) {
				controlselect_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("update_sub1") ) {
				controlupdate_sub1();
			} else if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AC0090010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0090010-E999","CSVの出力処理"));
			throw new FoundationException("AC0090010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0090010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0090010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0090010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0090010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0090010Entity entity;
	protected AC0090010Struct struct;
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

		entity = new AC0090010Entity();
		struct = new AC0090010Struct();

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
	 * AC0090010クラスの標準コンストラクタ
	 */
	public AC0090010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
                list = new ArrayList(0);
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
				AC0090010Struct key = (AC0090010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_subDM_QTY") && key.getw_subDM_QTY() != null) {
					msgKey.setKeyValue("w_subDM_QTY", key.getw_subDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_subITEM_NAME") && key.getw_subITEM_NAME() != null) {
					msgKey.setKeyValue("w_subITEM_NAME", key.getw_subITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_subEXTERNAL_PLAN_CD") && key.getw_subEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("w_subEXTERNAL_PLAN_CD", key.getw_subEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("w_subPLANT_CD") && key.getw_subPLANT_CD() != null) {
					msgKey.setKeyValue("w_subPLANT_CD", key.getw_subPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_subPLANT_NAME") && key.getw_subPLANT_NAME() != null) {
					msgKey.setKeyValue("w_subPLANT_NAME", key.getw_subPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_FROM") && key.getw_subDATE_FROM() != null) {
					msgKey.setKeyValue("w_subDATE_FROM", key.getw_subDATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_TO") && key.getw_subDATE_TO() != null) {
					msgKey.setKeyValue("w_subDATE_TO", key.getw_subDATE_TO());
				}
				if(msgKeyType.containsKeyColumn("subSU_DM_QTY") && key.getsubSU_DM_QTY() != null) {
					msgKey.setKeyValue("subSU_DM_QTY", key.getsubSU_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("subRE_ODR_QTY") && key.getsubRE_ODR_QTY() != null) {
					msgKey.setKeyValue("subRE_ODR_QTY", key.getsubRE_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("CP_UNIT") && key.getCP_UNIT() != null) {
					msgKey.setKeyValue("CP_UNIT", key.getCP_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_FROM") && key.getw_TIME_FROM() != null) {
					msgKey.setKeyValue("w_TIME_FROM", key.getw_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_TO") && key.getw_TIME_TO() != null) {
					msgKey.setKeyValue("w_TIME_TO", key.getw_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("w_subTIME_FROM") && key.getw_subTIME_FROM() != null) {
					msgKey.setKeyValue("w_subTIME_FROM", key.getw_subTIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_subTIME_TO") && key.getw_subTIME_TO() != null) {
					msgKey.setKeyValue("w_subTIME_TO", key.getw_subTIME_TO());
				}
				if(msgKeyType.containsKeyColumn("w_subDUE_TIME") && key.getw_subDUE_TIME() != null) {
					msgKey.setKeyValue("w_subDUE_TIME", key.getw_subDUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE") && key.gets_MIN_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MIN_CAL_DATE", key.gets_MIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE") && key.gets_MAX_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MAX_CAL_DATE", key.gets_MAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE") && key.gets_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("s_BUSINESS_DATE", key.gets_BUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_NAME") && key.gets_PLANT_NAME() != null) {
					msgKey.setKeyValue("s_PLANT_NAME", key.gets_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_NAME") && key.getw_PLANT_NAME() != null) {
					msgKey.setKeyValue("w_PLANT_NAME", key.getw_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_NAME") && key.getw_ITEM_NAME() != null) {
					msgKey.setKeyValue("w_ITEM_NAME", key.getw_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_DRAW_CD") && key.getw_DRAW_CD() != null) {
					msgKey.setKeyValue("w_DRAW_CD", key.getw_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("w_SPEC") && key.getw_SPEC() != null) {
					msgKey.setKeyValue("w_SPEC", key.getw_SPEC());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP") && key.getw_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP", key.getw_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_SPOIL") && key.getw_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("w_ITEM_SPOIL", key.getw_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_LOT_SIZING_TYP") && key.getw_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("w_LOT_SIZING_TYP", key.getw_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MAX_PERIOD") && key.getw_MAX_PERIOD() != null) {
					msgKey.setKeyValue("w_MAX_PERIOD", key.getw_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("w_MUL_ODR_QTY") && key.getw_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("w_MUL_ODR_QTY", key.getw_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_SAFETY_STOCK") && key.getw_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("w_SAFETY_STOCK", key.getw_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("w_MAX_ODR_QTY") && key.getw_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("w_MAX_ODR_QTY", key.getw_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_MIN_ODR_QTY") && key.getw_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("w_MIN_ODR_QTY", key.getw_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL") && key.getw_DATE_FROM_ALL() != null) {
					msgKey.setKeyValue("w_DATE_FROM_ALL", key.getw_DATE_FROM_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL") && key.getw_DATE_TO_ALL() != null) {
					msgKey.setKeyValue("w_DATE_TO_ALL", key.getw_DATE_TO_ALL());
				}
				if(msgKeyType.containsKeyColumn("subJOB_ODR_CD") && key.getsubJOB_ODR_CD() != null) {
					msgKey.setKeyValue("subJOB_ODR_CD", key.getsubJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("subITEM_CD") && key.getsubITEM_CD() != null) {
					msgKey.setKeyValue("subITEM_CD", key.getsubITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("subITEM_NAME") && key.getsubITEM_NAME() != null) {
					msgKey.setKeyValue("subITEM_NAME", key.getsubITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("subODR_START_DATE") && key.getsubODR_START_DATE() != null) {
					msgKey.setKeyValue("subODR_START_DATE", key.getsubODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("subPRD_START_DATE") && key.getsubPRD_START_DATE() != null) {
					msgKey.setKeyValue("subPRD_START_DATE", key.getsubPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("subPRD_DUE_DATE") && key.getsubPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("subPRD_DUE_DATE", key.getsubPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("subODR_QTY") && key.getsubODR_QTY() != null) {
					msgKey.setKeyValue("subODR_QTY", key.getsubODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("subPS_UNIT_DENOMINATOR") && key.getsubPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("subPS_UNIT_DENOMINATOR", key.getsubPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("subPS_UNIT_NUMERATOR") && key.getsubPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("subPS_UNIT_NUMERATOR", key.getsubPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("subOD_NO") && key.getsubOD_NO() != null) {
					msgKey.setKeyValue("subOD_NO", key.getsubOD_NO());
				}
				if(msgKeyType.containsKeyColumn("subMODIFY_COUNT") && key.getsubMODIFY_COUNT() != null) {
					msgKey.setKeyValue("subMODIFY_COUNT", key.getsubMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_subITEM_CD") && key.getw_subITEM_CD() != null) {
					msgKey.setKeyValue("w_subITEM_CD", key.getw_subITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_FROM_ALL") && key.getw_subDATE_FROM_ALL() != null) {
					msgKey.setKeyValue("w_subDATE_FROM_ALL", key.getw_subDATE_FROM_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_subDATE_TO_ALL") && key.getw_subDATE_TO_ALL() != null) {
					msgKey.setKeyValue("w_subDATE_TO_ALL", key.getw_subDATE_TO_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_subDUE_DATE") && key.getw_subDUE_DATE() != null) {
					msgKey.setKeyValue("w_subDUE_DATE", key.getw_subDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("subDM_QTY") && key.getsubDM_QTY() != null) {
					msgKey.setKeyValue("subDM_QTY", key.getsubDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_FLG") && key.getPS_LT_FLG() != null) {
					msgKey.setKeyValue("PS_LT_FLG", key.getPS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("PS_FIXED_LT") && key.getPS_FIXED_LT() != null) {
					msgKey.setKeyValue("PS_FIXED_LT", key.getPS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LT") && key.getPS_PROP_LT() != null) {
					msgKey.setKeyValue("PS_PROP_LT", key.getPS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE") && key.getPS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PS_PROP_LOT_SIZE", key.getPS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_QTY") && key.getPS_UNIT_QTY() != null) {
					msgKey.setKeyValue("PS_UNIT_QTY", key.getPS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
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
					AC0090010Struct key = new AC0090010Struct();
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_subDM_QTY")) {
						key.setw_subDM_QTY(msgKey.getKeyValue("w_subDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_subITEM_NAME")) {
						key.setw_subITEM_NAME(msgKey.getKeyValue("w_subITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_subEXTERNAL_PLAN_CD")) {
						key.setw_subEXTERNAL_PLAN_CD(msgKey.getKeyValue("w_subEXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_subPLANT_CD")) {
						key.setw_subPLANT_CD(msgKey.getKeyValue("w_subPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_subPLANT_NAME")) {
						key.setw_subPLANT_NAME(msgKey.getKeyValue("w_subPLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_FROM")) {
						key.setw_subDATE_FROM(msgKey.getKeyValue("w_subDATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_TO")) {
						key.setw_subDATE_TO(msgKey.getKeyValue("w_subDATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("subSU_DM_QTY")) {
						key.setsubSU_DM_QTY(msgKey.getKeyValue("subSU_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("subRE_ODR_QTY")) {
						key.setsubRE_ODR_QTY(msgKey.getKeyValue("subRE_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CP_UNIT")) {
						key.setCP_UNIT(msgKey.getKeyValue("CP_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_FROM")) {
						key.setw_TIME_FROM(msgKey.getKeyValue("w_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_TO")) {
						key.setw_TIME_TO(msgKey.getKeyValue("w_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_subTIME_FROM")) {
						key.setw_subTIME_FROM(msgKey.getKeyValue("w_subTIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_subTIME_TO")) {
						key.setw_subTIME_TO(msgKey.getKeyValue("w_subTIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_subDUE_TIME")) {
						key.setw_subDUE_TIME(msgKey.getKeyValue("w_subDUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE")) {
						key.sets_MIN_CAL_DATE(msgKey.getKeyValue("s_MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE")) {
						key.sets_MAX_CAL_DATE(msgKey.getKeyValue("s_MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE")) {
						key.sets_BUSINESS_DATE(msgKey.getKeyValue("s_BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_NAME")) {
						key.sets_PLANT_NAME(msgKey.getKeyValue("s_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_NAME")) {
						key.setw_PLANT_NAME(msgKey.getKeyValue("w_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_NAME")) {
						key.setw_ITEM_NAME(msgKey.getKeyValue("w_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_DRAW_CD")) {
						key.setw_DRAW_CD(msgKey.getKeyValue("w_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_SPEC")) {
						key.setw_SPEC(msgKey.getKeyValue("w_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP")) {
						key.setw_OUTSIDE_TYP(msgKey.getKeyValue("w_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_SPOIL")) {
						key.setw_ITEM_SPOIL(msgKey.getKeyValue("w_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(msgKey.getKeyValue("w_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_LOT_SIZING_TYP")) {
						key.setw_LOT_SIZING_TYP(msgKey.getKeyValue("w_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MAX_PERIOD")) {
						key.setw_MAX_PERIOD(msgKey.getKeyValue("w_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("w_MUL_ODR_QTY")) {
						key.setw_MUL_ODR_QTY(msgKey.getKeyValue("w_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_SAFETY_STOCK")) {
						key.setw_SAFETY_STOCK(msgKey.getKeyValue("w_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("w_MAX_ODR_QTY")) {
						key.setw_MAX_ODR_QTY(msgKey.getKeyValue("w_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_MIN_ODR_QTY")) {
						key.setw_MIN_ODR_QTY(msgKey.getKeyValue("w_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL")) {
						key.setw_DATE_FROM_ALL(msgKey.getKeyValue("w_DATE_FROM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL")) {
						key.setw_DATE_TO_ALL(msgKey.getKeyValue("w_DATE_TO_ALL"));
					}
					if(msgKeyType.containsKeyColumn("subJOB_ODR_CD")) {
						key.setsubJOB_ODR_CD(msgKey.getKeyValue("subJOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("subITEM_CD")) {
						key.setsubITEM_CD(msgKey.getKeyValue("subITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("subITEM_NAME")) {
						key.setsubITEM_NAME(msgKey.getKeyValue("subITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("subODR_START_DATE")) {
						key.setsubODR_START_DATE(msgKey.getKeyValue("subODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subPRD_START_DATE")) {
						key.setsubPRD_START_DATE(msgKey.getKeyValue("subPRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subPRD_DUE_DATE")) {
						key.setsubPRD_DUE_DATE(msgKey.getKeyValue("subPRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subODR_QTY")) {
						key.setsubODR_QTY(msgKey.getKeyValue("subODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("subPS_UNIT_DENOMINATOR")) {
						key.setsubPS_UNIT_DENOMINATOR(msgKey.getKeyValue("subPS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("subPS_UNIT_NUMERATOR")) {
						key.setsubPS_UNIT_NUMERATOR(msgKey.getKeyValue("subPS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("subOD_NO")) {
						key.setsubOD_NO(msgKey.getKeyValue("subOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("subMODIFY_COUNT")) {
						key.setsubMODIFY_COUNT(msgKey.getKeyValue("subMODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_subITEM_CD")) {
						key.setw_subITEM_CD(msgKey.getKeyValue("w_subITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_FROM_ALL")) {
						key.setw_subDATE_FROM_ALL(msgKey.getKeyValue("w_subDATE_FROM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_subDATE_TO_ALL")) {
						key.setw_subDATE_TO_ALL(msgKey.getKeyValue("w_subDATE_TO_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_subDUE_DATE")) {
						key.setw_subDUE_DATE(msgKey.getKeyValue("w_subDUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("subDM_QTY")) {
						key.setsubDM_QTY(msgKey.getKeyValue("subDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_FLG")) {
						key.setPS_LT_FLG(msgKey.getKeyValue("PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PS_FIXED_LT")) {
						key.setPS_FIXED_LT(msgKey.getKeyValue("PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LT")) {
						key.setPS_PROP_LT(msgKey.getKeyValue("PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE")) {
						key.setPS_PROP_LOT_SIZE(msgKey.getKeyValue("PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_QTY")) {
						key.setPS_UNIT_QTY(msgKey.getKeyValue("PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
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
