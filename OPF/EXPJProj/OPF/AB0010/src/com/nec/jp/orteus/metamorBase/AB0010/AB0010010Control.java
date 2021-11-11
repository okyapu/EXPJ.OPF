/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0010/src/com/nec/jp/orteus/metamorBase/AB0010/AB0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AB0010;

import com.nec.jp.orteus.metamorBase.AB0010.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
import java.util.ArrayList;

import java.text.ParseException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header

//}}user_implement_code_header

public class AB0010010Control
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
       
        public AB0010010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
       //---------- メッセージ関連の処理----------------------------------------------

        // ----- シスタム設定値取得 ---------------
    	private PrivateConfig privateConfig;
        // ----- シスタム設定値取得 ---------------
    	
    	/** デマンド削除可否フラグ */
    	String dmDelFlg = "";	

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
    	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
    	 *
    	 * @param code
    	 *            メッセージコード
    	 */
    	private void setErrorMessage(String code) {
    		ExpjMessage emsg = new ExpjMessage(code);
    		msgStruct.addError(emsg);
    		sysLog.warning(emsg, getsysUSER_CD());
    	}
        //------------------------------------------------------------------
        // ロケール(一覧の先頭行に「過去」を表示させるため
        private String _locale = "";
        public void setLocale(String loc) { _locale = loc; }
       
       //---------- コンボボックスデータ取得関連の処理 -------------------------------
       
    	/** 業務運用日 */
    	private String strBusinessOprDate = null;

        /** 品目手配区分 */
        ComboStruct _MRP_ODR_TYP = null;
       
        /** 品目手配区分設定
         * @param コンボボックスデータ
        */
        public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** 品目手配区分取得
         * @return 品目手配区分のコンボボックスデータ
        */
        public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }
       
       
        /** 品目内外作区分 */
        ComboStruct _OUTSIDE_TYP = null;
       
        /** 品目内外作区分設定
         * @param コンボボックスデータ
        */
        public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** 品目内外作区分取得
         * @return 品目内外作区分のコンボボックスデータ
        */
        public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }
       
       
        /** 在庫数単位区分 */
        ComboStruct _UNIT_QTY_TYP = null;
       
        /** 在庫数単位区分設定
         * @param コンボボックスデータ
        */
        public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }
       
        /** 在庫数単位区分取得
         * @return 在庫数単位区分のコンボボックスデータ
        */
        public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }
       
       
        /** ロットまとめ区分 */
        ComboStruct _LOT_SIZING_TYP = null;
       
        /** ロットまとめ区分設定
         * @param コンボボックスデータ
        */
        public void setLOT_SIZING_TYP(ComboStruct combo){ _LOT_SIZING_TYP = combo; }
       
        /** ロットまとめ区分取得
         * @return ロットまとめ区分のコンボボックスデータ
        */
        public ComboStruct getLOT_SIZING_TYP(){ return _LOT_SIZING_TYP; }
        
        /** 在庫数単位区分(スクリプト制御用) */
        private String _SCREEN_UNIT_QTY_TYP = null;
       
        /** 在庫数単位区分(スクリプト制御用)設定*/
    	public void setScreenUnitQtyTyp(String uqt){ _SCREEN_UNIT_QTY_TYP = uqt; }
       
        /** 在庫数単位区分(スクリプト制御用)取得*/
    	public String getScreenUnitQtyTyp(){ return _SCREEN_UNIT_QTY_TYP; }
       
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param strTyp 区分コード
         * @return 区分名称。該当するデータがなかった場合は区分コードを返す
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         if(strTyp == null)  return null;
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
        private void setTypeValueAboutItem(AB0010010Struct s)
        {
         s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
         s.setLOT_SIZING_NAME(getTypeName(_LOT_SIZING_TYP,s.getLOT_SIZING_TYP()));
        }
        //--------------------------------------------------------------------------
        /*
         * デフォルト値設定処理
         *
         * @return	なし
         */
        private void setDefaultData() throws SQLException, AlarmMessageException
        {
         try
         {
          // 自工場コード設定
          struct.setw_PLANT_CD(getsysPLANT_CD());
       
          // デフォルト生産計画期間取得設定
          setDefaultPeriodDate();
         }
         catch (SQLException e)
         {
          throw e;
         }
        }
       
        /*
         * デフォルト生産計画期間日付取得設定
         *
         * @return	なし
         */
        private void setDefaultPeriodDate() throws SQLException, AlarmMessageException
        {
         DateCtrl dctrl = new DateCtrl(conn);
         DateConverter dc = new DateConverter();
         String streBusinessOprDate = dctrl.getBusinessOprDate(getsysPLANT_CD());
         Date dateBusinessOprDate = dc.str2date(streBusinessOprDate);
       
         // デフォルト生産計画期間日付取得
         String strDefDate[] = {"", ""};
         boolean bResult = false;
         try
         {
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
          sysLog.finest_d(""
           +"* (From)[" + strDefDate[0] + "]"
           +"* (To)[" + strDefDate[1] + "]"
           ,struct.getsUser_ID());
         }
         catch(SQLException se)
         {
          bResult = false;
          throw se;
         }
       
         if(bResult == true)
         {
          // 取得成功
          struct.setw_date_from(strDefDate[0]);
          struct.setw_date_to(strDefDate[1]);
         }
        }
       //------------------------------------------------------------------
       
        /**
         * 工場読込処理
         *
         * @param	structTarget	対象データ情報
         * @return	成功:読込情報 / エラー:null
         */
        private AB0010010Struct readPlant(AB0010010Struct structTarget) throws FoundationException, SQLException
        {
         List listRead = entity.mM_PLANT.read(conn, structTarget);
         if(listRead.size() <= 0)
         {
          // 工場が存在しない
          setErrorMessage("AB01001", "M_PLANT.PLANT_CD:" + structTarget.getw_PLANT_CD());
          return null;
         }
         // 読込情報取得
         AB0010010Struct structRead = new AB0010010Struct();
         structRead = (AB0010010Struct)listRead.get(0);
         return structRead;
        }
       
        /**
         * 品目読込処理
         *
         * @param	structTarget	対象データ情報
         * @return	成功:読込情報 / エラー:null
         */
        private AB0010010Struct readItem(AB0010010Struct structTarget) throws FoundationException, SQLException
        {
         List listRead = entity.mM_ITEM.read(conn, structTarget);
         if(listRead.size() <= 0)
         {
          // 品目が存在しない
          setErrorMessage("AB01002", "M_ITEM.ITEM_CD:" + structTarget.getw_ITEM_CD());
          return null;
         }
         // 読込情報取得
         AB0010010Struct structRead = new AB0010010Struct();
         structRead = (AB0010010Struct)listRead.get(0);
         return structRead;
        }
       
        /**
         * 手持在庫数取得処理
         *
         * @param	structTarget	対象データ情報
         * @return	手持在庫数
         */
        private String getStockOnHandQtySum(AB0010010Struct structTarget) throws FoundationException, SQLException
        {
         String strStockOnHandQty = new String("0.0");
         List listRead = entity.mselect_stock.read(conn, structTarget);
         if(listRead.size() <= 0){
          sysLog.finest_d("NO RECORD:T_ITEM_STOCK  PLANT_CD:" + structTarget.getw_PLANT_CD() + "  ITEM_CD:" + structTarget.getw_ITEM_CD(),struct.getsUser_ID());
          return strStockOnHandQty;
         }
         AB0010010Struct structRead = (AB0010010Struct)listRead.get(0);
         String readStock = structRead.getSTOCK_ON_HAND_QTY();
         if(readStock == null || "".equals(readStock)){
          sysLog.finest_d("NO RECORD:T_ITEM_STOCK  PLANT_CD:" + structTarget.getw_PLANT_CD() + "  ITEM_CD:" + structTarget.getw_ITEM_CD(),struct.getsUser_ID());
          return strStockOnHandQty;
         }
         return readStock;
        }
       
        //------------------------------------------------------------------
        /**
         * 画面から入力された情報の日付と新計画オーダを StructのListに展開
         * 展開先のリストをクリアする。
         * @param in 画面から入力された情報(Struct中のリストに保持)
         * @param deploy 展開先
         * @return true:展開成功 / false:展開失敗(出力先がNULL/inの日付・新計画オーダがnull/inの日付と新計画オーダの長さが違う
         */
        private boolean deployInputQtys(AB0010010Struct in, List deploy)
        {
         if(deploy == null || in == null)  return false;
         deploy.clear();
       
         List days = in.getList_PlanDate();
         List qtys = in.getList_NewPlanOrder();
         if(days == null || qtys == null) return false;
         if(days.size() != qtys.size()) return false;
       
         int inCount = days.size();
         for(int n = 0; n < inCount; n++){
          AB0010010Struct addition = new AB0010010Struct();
          addition.importQtyData(in,n);
          deploy.add(addition);
         }
         return true;
        }
       
        /**
         * 情報ののキー(日付)に対応するリストの要素を返却
         * @param originals 探すリスト
         * @param target 探すキー設定済の情報
         * @return 同一キーの情報 / 見つからないとき null
         */
        private AB0010010Struct findOriginal(List originals, AB0010010Struct target)
        {
         String key = target.getPlanDate();
         if(key == null)  return null;
         for(int n = 0; n < originals.size(); n++){
          AB0010010Struct current = (AB0010010Struct)(originals.get(n));
          String currentKey = current.getPlanDate();
          if(currentKey == null)  continue;
          if(key.equals(currentKey))  return current;
         }
         return null;
        }
       
        //------------------------------------------------------------------
       
        /** デバッグ用メッセージ作成用変数 */
        private String _debugMsg = "";
       
       
       //---------- 親子画面関連の処理 -------------------------------------------
       
        /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
        private AB0010010Struct _keyStruct = new AB0010010Struct();
       
        /** キー情報Structの取得 */
        public AB0010010Struct getKeyStruct(){ return _keyStruct; }
        
        /** キー情報Structの設定 */
        public void setKeyStruct(AB0010010Struct struct){ _keyStruct.copy(struct); }
       
       

	//---------- 日付変換 -------------------------------------------
	public Date StrngToDt(String in){
		Date out = null;
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return out;
		try{
			if((out = fm.parse(in)) != null) return out;
		}catch(ParseException e){}
		return out;
	}
	
	public String DtToStrng(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd HH:mm");
		if(in == null) return null;
		return fm.format(in);
	}
	
	/** 時刻管理用フラグ */
	private String _flgTimeCtrl = null;
	
    /** EJa-ASPROVA連携オプション導入フラグ取得用 */
	private String _SysInstallOptions_ASP = null;
	
    //---------- 時刻別に表示 -------------------------------------------
	public void SelectTimeSepa() throws BusinessProcessException, FoundationException
	{
		try{
			boolean result = false;		// チェック結果格納用
			List workList = null;
			AB0010010Struct workStruct;
			//String strBusinessOprDate = null;
			int Checkfg =0;
			String strStockOnHandQty = new String("0.0");
			
			// 日付変換用
			DateConverter dc = new DateConverter();

			AB0010010Struct save_struct = new AB0010010Struct();
			save_struct.copy(struct);
			
			
			//====================================
			// 手持在庫数読込（算出済み）
			//====================================
			strStockOnHandQty = getStockOnHandQtySum(struct);
			save_struct.setSTOCK_ON_HAND_QTY(strStockOnHandQty);

			// 一覧表示内容をクリア
			list.clear();

			//====================================
			// メイン情報読込
			//====================================
			workList = entity.mselect.read(conn, struct);
			if(workList.size() > 0){
				// 読込情報取得
				workStruct = (AB0010010Struct)workList.get(0);

				// 読込情報設定
				save_struct.setPLANT_NAME(workStruct.getPLANT_NAME());
				save_struct.setITEM_NAME(workStruct.getITEM_NAME());
				save_struct.setDRAW_CD(workStruct.getDRAW_CD());
				save_struct.setSPEC(workStruct.getSPEC());
				save_struct.setMRP_ODR_TYP(workStruct.getMRP_ODR_TYP());
				save_struct.setOUTSIDE_TYP(workStruct.getOUTSIDE_TYP());
				save_struct.setITEM_SPOIL(workStruct.getITEM_SPOIL());
				save_struct.setUNIT_QTY_TYP(workStruct.getUNIT_QTY_TYP());
				save_struct.setLOT_SIZING_TYP(workStruct.getLOT_SIZING_TYP());
				save_struct.setMAX_PERIOD(workStruct.getMAX_PERIOD());
				save_struct.setMUL_ODR_QTY(workStruct.getMUL_ODR_QTY());
				save_struct.setMAX_ODR_QTY(workStruct.getMAX_ODR_QTY());
				save_struct.setMIN_ODR_QTY(workStruct.getMIN_ODR_QTY());
				save_struct.setSAFETY_STOCK(workStruct.getSAFETY_STOCK());
				save_struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());

				save_struct.sets_ODR_LT(workStruct.gets_ODR_LT());
				save_struct.sets_FIXED_LT(workStruct.gets_FIXED_LT());
				save_struct.sets_PROP_LT(workStruct.gets_PROP_LT());
				save_struct.sets_SAFETY_LT(workStruct.gets_SAFETY_LT());
				save_struct.sets_PROP_LOT_SIZE(workStruct.gets_PROP_LOT_SIZE());
				save_struct.sets_ISSUE_TYP(workStruct.gets_ISSUE_TYP());
				save_struct.sets_ISSUE_LT(workStruct.gets_ISSUE_LT());

				//====================================
				// Mrpデータ算出処理
				//====================================
				// MRPデータ算出に必要な情報を設定
				ATMrpManager atmrpManager = new ATMrpManager();
				MrpManager mrpManager = new MrpManager();
				
				// EJa-ASPROVA連携オプション導入の場合
				if("1".equals(_SysInstallOptions_ASP)){	
				
							atmrpManager.setConnection(conn);
							atmrpManager.setItemCode(struct.getw_ITEM_CD());
							atmrpManager.setPlantCode(struct.getw_PLANT_CD());
							atmrpManager.setFrom(dc.str2formal(struct.getsub_PlanDate()));
							atmrpManager.setTo(dc.str2formal(struct.getsub_PlanDate()));
							atmrpManager.setfg(Checkfg);
					
							// MRPデータ算出処理				
							
							result = atmrpManager.executeTime(save_struct.getSTOCK_ON_HAND_QTY(), save_struct.getITEM_SPOIL(), save_struct.getw_date_from(),0);
							
							if(result == true){
								//====================================
								// 画面へ表示する情報を設定
								//====================================
								struct.copy(save_struct);
								setTypeValueAboutItem(struct);

								AB0010010Struct oneDay = null;
								String difference = "0.0";
								oneDay = new AB0010010Struct();
								oneDay.importPastStock(atmrpManager.getPast(),_locale);
								difference = oneDay.getDifference();
								list.add(oneDay);

								for(int n = 0; n < atmrpManager.size(); n++){
									oneDay = new AB0010010Struct();
									oneDay.importStock(atmrpManager.getData(n),Calculate.subtract(atmrpManager.getData(n).getStock(),difference),false);
									difference = atmrpManager.getData(n).getStock();
									list.add(oneDay);
								}
							}else{
								// MRPデータ算出に失敗
								sysLog.finest_d("calculate error:MRP-data", struct.getsUser_ID());
							}
				// ASPROVA連携オプション導入なしの場合	
				}else{
				
							mrpManager.setConnection(conn);
							mrpManager.setItemCode(struct.getw_ITEM_CD());
							mrpManager.setPlantCode(struct.getw_PLANT_CD());
							mrpManager.setFrom(dc.str2formal(struct.getsub_PlanDate()));
							mrpManager.setTo(dc.str2formal(struct.getsub_PlanDate()));
							mrpManager.setfg(Checkfg);

							// MRPデータ算出処理				
							result = mrpManager.executeTime(save_struct.getSTOCK_ON_HAND_QTY(), save_struct.getITEM_SPOIL(), save_struct.getw_date_from(),0);
							
							if(result == true){
								//====================================
								// 画面へ表示する情報を設定
								//====================================
								struct.copy(save_struct);
								setTypeValueAboutItem(struct);

								AB0010010Struct oneDay = null;
								String difference = "0.0";
								oneDay = new AB0010010Struct();
								oneDay.importPastStock(mrpManager.getPast(),_locale);
								difference = oneDay.getDifference();
								list.add(oneDay);

								for(int n = 0; n < mrpManager.size(); n++){
									oneDay = new AB0010010Struct();
									oneDay.importStock(mrpManager.getData(n),Calculate.subtract(mrpManager.getData(n).getStock(),difference),false);
									difference = mrpManager.getData(n).getStock();
									list.add(oneDay);
								}
							}else{
								// MRPデータ算出に失敗
								sysLog.finest_d("calculate error:MRP-data", struct.getsUser_ID());
							}
				}
			}else{
			// メイン情報レコードなし
				_debugMsg = ("controlselect() no record for main info.");
				sysLog.finest_d(_debugMsg, struct.getsUser_ID());
			}
		} catch(SQLException e) {
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e,emsg);
			throw ee;
		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	//---------- 所要量に登録 -------------------------------------------
	public void InsertTimeSepa(int errFlg)throws BusinessProcessException, FoundationException
	{
	
		try{
			
			DateConverter dc=new DateConverter();
			
			//生産計画日に時刻チェック(桁数、形式)
			if( (struct.getsub_PlanDate_TIME()).length() == 0 ){
				//Nullは0000に設定
				struct.setsub_PlanDate_TIME("2359");
			}else if( (struct.getsub_PlanDate_TIME()).length() == 3 ){
				//3桁は頭に0を付けて4桁にする
				struct.setsub_PlanDate_TIME("0" + struct.getsub_PlanDate_TIME());
			}
			
			AB0010010Struct structItem = readItem(struct);

			// 最新品目情報反映
			if(structItem != null){
				struct.setITEM_NAME(structItem.getITEM_NAME());
				struct.setDRAW_CD(structItem.getDRAW_CD());
				struct.setSPEC(structItem.getSPEC());
				struct.setMRP_ODR_TYP(structItem.getMRP_ODR_TYP());
				struct.setOUTSIDE_TYP(structItem.getOUTSIDE_TYP());
				struct.setITEM_SPOIL(structItem.getITEM_SPOIL());
				struct.setUNIT_QTY_TYP(structItem.getUNIT_QTY_TYP());
				struct.setLOT_SIZING_TYP(structItem.getLOT_SIZING_TYP());
				struct.setMAX_PERIOD(structItem.getMAX_PERIOD());
				struct.setMUL_ODR_QTY(structItem.getMUL_ODR_QTY());
				struct.setMAX_ODR_QTY(structItem.getMAX_ODR_QTY());
				struct.setMIN_ODR_QTY(structItem.getMIN_ODR_QTY());
				struct.setSAFETY_STOCK(structItem.getSAFETY_STOCK());
				struct.setSTOCK_UNIT(structItem.getSTOCK_UNIT());

				struct.sets_ODR_LT(structItem.gets_ODR_LT());
				struct.sets_FIXED_LT(structItem.gets_FIXED_LT());
				struct.sets_PROP_LT(structItem.gets_PROP_LT());
				struct.sets_SAFETY_LT(structItem.gets_SAFETY_LT());
				struct.sets_PROP_LOT_SIZE(structItem.gets_PROP_LOT_SIZE());
				struct.sets_ISSUE_TYP(structItem.gets_ISSUE_TYP());
				struct.sets_ISSUE_LT(structItem.gets_ISSUE_LT());
				setTypeValueAboutItem(struct);
			}


			// トランザクション開始
			conn.beginTransWeb();

			boolean bSuccess = true;
			boolean isUpdated = false; // 1件以上更新した?
			
			// EJa-ASPROVA連携オプション導入の場合
			if("1".equals(_SysInstallOptions_ASP)){

					//オーダデマンド番号採番クラスオブジェクト生成
					CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), this.sp.getProcId(), struct.getw_PLANT_CD());
					
					//ロットサイズの取得
					String lotSize = struct.gets_PROP_LOT_SIZE();
					
					//====================================
					// 所要量テーブル更新処理
					//====================================
					String strNewPlanOrder;
					
					// データ取得
					strNewPlanOrder = struct.getsub_NEW_PLAN_ORDER(); // 新計画オーダ数
					
					// 時刻をHH24:MI形式に変換
					String PlanTime = struct.getsub_PlanDate() + " " + (struct.getsub_PlanDate_TIME()).substring(0,2) + ":" + (struct.getsub_PlanDate_TIME()).substring(2,4);
					
					Date datePlanTime=dc.str2date(PlanTime);
					if (datePlanTime.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
						//datePlanTime = dc.str2date(strBusinessOprDate);
						PlanTime = strBusinessOprDate + " 00:00";
					}


					//--------------------------------------------------------------------------------
					// レコード削除
					isUpdated = true;
					
					// レコードの削除（工場コード、品目番号、製造納期、オーダデマンド区分(2)、オーダ状態区分(1)がキー）					
					// 新計画オーダへ入力された日付のレコードを削除する					
					struct.sets_PRD_DUE_DATE(PlanTime);	/* 製造納期 */					
					struct.sets_DUE_DATE(PlanTime);		/* 要求納期 */		
							
					// 新規登録時、レコードが存在していればエラー
					
					if(errFlg == 1){
						List listChk = entity.mRecChk.read(conn,struct);
						if(listChk.size() > 0){
							setErrorMessage("AS00083", struct.getsub_PlanDate_TIME());
							return;
						}
					}else{
						List listChk = entity.mRecChk.read(conn,struct);
						AB0010010Struct workStruct;
						workStruct = (AB0010010Struct)listChk.get(0);
						struct.sets_PARENT_OD_NO(workStruct.m_dummy);
						int delete = entity.mdeleteT_OD_time.delete(conn, struct);

						/** パラメータ「デマンド削除可否フラグ」を取得*/
						privateConfig = new PrivateConfig(conn);
						dmDelFlg = privateConfig.getString("DM_DEL_FLG");
						if("1".equals(dmDelFlg)){
							// 親計画オーダデマンド番号に持つ子デマンドを削除する
							entity.mdeleteT_DEMAND.delete(conn, struct);
						}
					}
					
					// --------------------------------------------------------------------------------
					// レコード追加・更新処理
					
					// オーダデマンド番号取得
					String odNo = collect.getNo();
					if(odNo == null){
						
						// 更新成功フラグ設定
						bSuccess = false;

						// オーダデマンド番号採番失敗
						sysLog.finest_d("update error:returned order-demand is null", struct.getsUser_ID());
						// エラーメッセージ出力
						setErrorMessage("AB00045", "");
						return;
					}
					
					struct.sets_OD_NO(odNo);				/*オーダデマンド番号  */
					struct.sets_ODR_QTY(strNewPlanOrder);	/*オーダ数量          */
		
					String sWkDate = null; 
					String sShiftMin = null;
					Date odrStartDate = null;		  		// 手配着手日
					Date prdStartDate = null;		  		// 製造着手日
					Date prdDueDate = null;		  			// 製造納期
					Date dueDate = null;		  			// 要求納期
					
					ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
							this.sysUSER_CD, 
							this.getProgramId());
					ATWorkCalendar atWC = new ATWorkCalendar(conn, 
							this.sysUSER_CD , 
							this.getProgramId(), 
							this.sysPLANT_CD);
					
					// 画面より入力した製造納期(YYYY/MM/DD HH24:MI)を変数にセットする
					prdDueDate = StrngToDt(struct.gets_PRD_DUE_DATE());
					
					Date OprDate=dc.str2date(strBusinessOprDate);
					if (prdDueDate.compareTo(OprDate) < 0) {
						prdDueDate = OprDate;
					}
					struct.sets_PRD_DUE_DATE(DtToStrng(prdDueDate));

					// 製造納期 ⇒ 要求納期の算出：払出ＬＴ(Ｈ)分未来方向へシフトさせる
					sShiftMin = ab.getIssueLtMin(struct.getw_ITEM_CD(),"U");
					dueDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);
					if (dueDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
						dueDate = dc.str2date(strBusinessOprDate);
					}
					sWkDate =DtToStrng(dueDate);
					struct.sets_DUE_DATE(sWkDate);
					
					// 製造納期 ⇒ 製造着手日の算出：製造ＬＴ(Ｈ)分過去方向へシフトさせる
					sShiftMin = ab.getProdLtMin(struct.getw_ITEM_CD(),strNewPlanOrder,lotSize,"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1");
					prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);
					if (prdStartDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
						prdStartDate = dc.str2date(strBusinessOprDate);
					}
					sWkDate =DtToStrng(prdStartDate);
					struct.sets_PRD_START_DATE(sWkDate);
					
					// 製造着手日 ⇒ 手配着手日の算出：手配ＬＴ(Ｈ)分過去方向へシフトさせる
					sShiftMin = ab.getOdrLtMin(struct.getw_ITEM_CD(),"U");
					sShiftMin = Calculate.multiply(sShiftMin,"-1");
					odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);
					if (odrStartDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
						odrStartDate = dc.str2date(strBusinessOprDate);
					}
					sWkDate =DtToStrng(odrStartDate);
					struct.sets_ODR_START_DATE(sWkDate);
					
					 _debugMsg = ("(AB0010/EJa-ASP)TIME: "
			            	   + "DUE_DATE" + "[" + struct.gets_DUE_DATE() + "]," 
			         		   + "PRD_DUE_DATE" + "[" + struct.gets_PRD_DUE_DATE() + "],"  
			         		   + "PRD_START_DATE" + "[" + struct.gets_PRD_START_DATE() + "],"  
			         		   + "ODR_START_DATE" + "[" + struct.gets_ODR_START_DATE() + "] " );
				    sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
						
			// ASPROVA連携オプション導入なしの場合	
			}else{
		
					// オーダデマンド番号採番クラスオブジェクト生成
					CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), this.sp.getProcId(), struct.getw_PLANT_CD());

					WorkDay workday = new WorkDay(struct.getsUser_ID(), this.sp.getProcId(),struct.getw_PLANT_CD(),struct.getw_ITEM_CD(), null);
					// 値の取得
					String fixedLT = struct.gets_FIXED_LT();
					String lotSize = struct.gets_PROP_LOT_SIZE();
					String propLT  = struct.gets_PROP_LT();
					String safety  = struct.gets_SAFETY_LT();
					String orderLT = struct.gets_ODR_LT();

					// 日付変換用
					//DateConverter dc = new DateConverter();

					//====================================
					// 所要量テーブル更新処理
					//====================================
					String strNewPlanOrder;
					Date prdDate, orderDate;
				
					// データ取得
					strNewPlanOrder = struct.getsub_NEW_PLAN_ORDER(); // 新計画オーダ
			
					//時刻をHH24:MI形式に変換
					String PlanTime = struct.getsub_PlanDate() + " " + (struct.getsub_PlanDate_TIME()).substring(0,2) + ":" + (struct.getsub_PlanDate_TIME()).substring(2,4);
			
					Date datePlanTime=dc.str2date(PlanTime);
					if (datePlanTime.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
						//datePlanTime = dc.str2date(strBusinessOprDate);
						PlanTime = strBusinessOprDate + " 00:00";
					}
					
					//--------------------------------------------------------------------------------
					// レコード削除
					isUpdated = true;
					// レコードの削除（工場コード、品目番号、製造納期、オーダデマンド区分(2)、オーダ状態区分(1)がキー）
					// 新計画オーダへ入力された日付のレコードを削除する
					struct.sets_DUE_DATE(PlanTime);		/* 要求納期 */
					struct.sets_PRD_DUE_DATE(PlanTime);	/* 製造納期 */
					//新規登録時、レコードが存在していればエラー
					if(errFlg == 1){
						List listChk = entity.mRecChk.read(conn,struct);
						if(listChk.size() > 0){
							setErrorMessage("AS00083", struct.getsub_PlanDate_TIME());
							return;
						}
					}else{
						List listChk = entity.mRecChk.read(conn,struct);
						AB0010010Struct workStruct;
						workStruct = (AB0010010Struct)listChk.get(0);
						struct.sets_PARENT_OD_NO(workStruct.m_dummy);
						int delete = entity.mdeleteT_OD_time.delete(conn, struct);

						/** パラメータ「デマンド削除可否フラグ」を取得*/
						privateConfig = new PrivateConfig(conn);
						dmDelFlg = privateConfig.getString("DM_DEL_FLG");
						if("1".equals(dmDelFlg)){
							// 親計画オーダデマンド番号に持つ子デマンドを削除する
							entity.mdeleteT_DEMAND.delete(conn, struct);
						}
					}

					//--------------------------------------------------------------------------------
					// レコード追加・更新処理

					// オーダデマンド番号取得
					String odNo = collect.getNo();
					if(odNo == null){
						// 更新成功フラグ設定
						bSuccess = false;

						// オーダデマンド番号採番失敗
						sysLog.finest_d("update error:returned order-demand is null", struct.getsUser_ID());
						// エラーメッセージ出力
						setErrorMessage("AB00045", "");
						return;
					}

					struct.sets_OD_NO(odNo);				/*オーダデマンド番号  */
					struct.sets_ODR_QTY(strNewPlanOrder);	/*オーダ数量          */

					// 製造リードタイム算出
					// [品目].固定リードタイム ＋ 切り上げ(オーダ数 / [品目].比例ロットサイズ) × [品目].比例リードタイム ＋ [品目].安全日数
					String prdLT = Calculate.add(fixedLT, Calculate.add(Calculate.multiply(Calculate.divide(strNewPlanOrder, lotSize, 0, Calculate._CEIL), propLT), safety));

					// 製造着手日計算
					prdDate = workday.calcDate(StrngToDt(PlanTime), - (int)Double.parseDouble(prdLT), false);
					if(prdDate == null){
						bSuccess = false;

						// 更新処理失敗：製造着手日（WorkDayクラスcalcDate実行結果）がnull
						sysLog.finest_d("update error:date of onset of product is null", struct.getsUser_ID());

						// エラーメッセージ出力
						setErrorMessage("AB00044", "");
						return;
					}
					Date OprDate=dc.str2date(strBusinessOprDate);
					if (prdDate.compareTo(OprDate) < 0) {
						prdDate = OprDate;
					}
					struct.sets_PRD_START_DATE(DtToStrng(prdDate));	/* 製造着手日 */

					// 手配着手日計算
					orderDate = workday.calcDate(prdDate, - (int)Double.parseDouble(orderLT), false);
					if(orderDate == null){
						bSuccess = false;

						// 更新処理失敗：手配着手日（WorkDayクラスcalcDate実行結果）がnull
						sysLog.finest_d("update error:date of onset of order is null", struct.getsUser_ID());

						// エラーメッセージ出力
						setErrorMessage("AB00044", "");
						return;
					}
					if (orderDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
						orderDate = dc.str2date(strBusinessOprDate);
					}
					struct.sets_ODR_START_DATE(DtToStrng(orderDate));	/* 手配着手日 */

			}

			// 所要量テーブルへの追加処理
			entity.minsertT_OD.create(conn, struct);

			if(bSuccess == false){
				conn.rollback();
				return;
			}
			// 所要量テーブルを更新したなら 所要量メンテナンス済みフラグを立てる
			if(isUpdated){
				if(entity.mSYS_OD_CALC_CTRL.update(conn,struct) == 0){
					conn.rollback();

					// エラーメッセージ出力
					setErrorMessage("AB00046", "SYS_OD_CALC_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
					return;
				}
			}
			conn.commit();
			// 読込実行
			SelectTimeSepa();
		
		} catch(SQLException e) {
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e,emsg);
			throw ee;
		}
		catch(ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

	//---------- 所要量を削除 -------------------------------------------
	public void DeleteTimeSepa()throws BusinessProcessException, FoundationException
	{
	
		try{
			// トランザクション開始
			DateConverter dc = new DateConverter();
			conn.beginTransWeb();
			
			//時刻をHH24:MI形式に変換(Nullは00:00に変換)
			if( (struct.getsub_PlanDate_TIME()).length() == 0 ){
				struct.setsub_PlanDate_TIME("0000");
			}else if( (struct.getsub_PlanDate_TIME()).length() == 3 ){
				struct.setsub_PlanDate_TIME("0" + struct.getsub_PlanDate_TIME());
			}
			// 業務運用日と比較
			String PlanTime = struct.getsub_PlanDate() + " " + (struct.getsub_PlanDate_TIME()).substring(0,2) + ":" + (struct.getsub_PlanDate_TIME()).substring(2,4);
			Date datePlanTime=dc.str2date(PlanTime);
			if (datePlanTime.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
				PlanTime = strBusinessOprDate + " 00:00";
			}
			
			//--------------------------------------------------------------------------------
			// レコードの削除（工場コード、品目番号、製造納期、オーダデマンド区分(2)、オーダ状態区分(1)がキー）
			// 新計画オーダへ入力された日付のレコードを削除する
			struct.sets_DUE_DATE(PlanTime);		/* 要求納期 */
			struct.sets_PRD_DUE_DATE(PlanTime);	/* 製造納期 */
			List listChk = entity.mRecChk.read(conn,struct);
			AB0010010Struct workStruct;
			workStruct = (AB0010010Struct)listChk.get(0);
			struct.sets_PARENT_OD_NO(workStruct.m_dummy);
			entity.mdeleteT_OD_time.delete(conn, struct);

			/** パラメータ「デマンド削除可否フラグ」を取得*/
			privateConfig = new PrivateConfig(conn);
			dmDelFlg = privateConfig.getString("DM_DEL_FLG");
			if("1".equals(dmDelFlg)){
				// 親計画オーダデマンド番号に持つ子デマンドを削除する
				entity.mdeleteT_DEMAND.delete(conn, struct);
			}
			conn.commit();
			// 読込実行
			SelectTimeSepa();
		
		} catch(SQLException e) {
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e,emsg);
			throw ee;
		}
		catch(ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                boolean bSuccess = false;	// 処理成功フラグ初期化
                AB0010010Struct structPlant = new AB0010010Struct();	// 最新工場情報読込用
                AB0010010Struct structItem = new AB0010010Struct();		// 最新品目情報読込用
                String strStockOnHandQty = new String("0.0");
                // 処理直前のstruct情報を退避
                AB0010010Struct structCopy = new AB0010010Struct();
                structCopy.copy(struct);
              
                // 一覧表示内容をクリア
                list.clear();
              
              setReadStatus(INITIAL);
              
                boolean result = false;		// チェック結果格納用
                List workList = null;
                AB0010010Struct workStruct;
                //String strBusinessOprDate = null;
              
                try
                {
                 _debugMsg = ("controlselect() inputvalue" + 
                  " plant-code = " + struct.getw_PLANT_CD() + 
                  " item-code = " + struct.getw_ITEM_CD() + 
                  " FROM = " + struct.getw_date_from() + 
                  " TO = " + struct.getw_date_to());
                 sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
                 // 新たな画面情報格納用struct
                 AB0010010Struct save_struct = new AB0010010Struct();
                 save_struct.copy(struct);
              
                 boolean bValidPlantCD = false;
                 boolean bValidItemCD = false;
              
                // ●入力された工場コードが存在するかどうかのチェック
                // 必要キー：工場コード
                 structPlant = readPlant(struct);
                 if(structPlant != null)
                 {
                  // 工場存在
                  bValidPlantCD = true;
                 }
              
                // ●入力された品目番号が存在するかどうかのチェック
                // 必要キー：品目番号
                 // 品目チェック
                 structItem = readItem(struct);
                 if(structItem != null)
                 {
                  // 品目存在
                  bValidItemCD = true;
                 }
              
                // 
                // 品目番号が有効の場合のみにチェックする項目
                // 
                 if(bValidItemCD == true)
                 {
                  // ●MPSフラグのチェック
                  result = entity.mcheckMPS_FLG.check(conn, struct);
                  if(result == false)
                  {
                   setErrorMessage("AB00009", "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  }
              
                  // ●品目手配区分のチェック
                  result = entity.mcheckMRP_ODR_TYP.check(conn, struct);
                  if(result == false)
                  {
                   setErrorMessage("AB00010", "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  }
              
                 }
              
                // 
                // 工場コードが有効の場合のみにチェックする項目
                // 
                 DateConverter dc = new DateConverter();
                 Date dateFrom = dc.str2date(struct.getw_date_from());
                 Date dateTo = dc.str2date(struct.getw_date_to());
                 Date dateBusinessOprDate = null;
                 boolean bValidBusinessOprDate = false;
                 int Checkfg =0 ,endfg =0;
                 if(bValidPlantCD == true)
                 {
                 //====================================
                 // カレンダ関連チェック
                 //====================================
                 	// カレンダ情報読込(検索キー：品目コード）
                  workList = entity.mselectPLAN_SPAN_FROM_CAL2.read(conn, struct);
                  Date minDateCal;
                  Date maxDateCal;
                  String minCalDate = null;
                  String maxCalDate = null;
                  if(workList.size() > 0)
                  {
                   // カレンダ情報取得(検索キー：品目コード）
                   workStruct = (AB0010010Struct)workList.get(0);
                   minCalDate = workStruct.gets_MIN_CAL_DATE();
                   maxCalDate = workStruct.gets_MAX_CAL_DATE();
                   if(minCalDate != null && maxCalDate != null)
                  	{
                  	    Checkfg =1;
                  		endfg =1;
                  	}else{
                  		workList = entity.mselectPLAN_SPAN_FROM_CAL.read(conn, struct);
                  		if(workList.size() > 0)
                  		{
                  		 // カレンダ情報取得(検索キー：工場コード）
                  		 workStruct = (AB0010010Struct)workList.get(0);
                  		 minCalDate = workStruct.gets_MIN_CAL_DATE();
                  		 maxCalDate = workStruct.gets_MAX_CAL_DATE();
                  		 if(minCalDate != null && maxCalDate != null)
                  		 	{
                  		 		endfg =1;
                  		 	}else{
                  		 		setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                  		 	}
                  		 }else{
                  		 	// 読込処理失敗：カレンダ情報レコードなし（検索キー：工場コード）
                            sysLog.finest_d("read error:no record for calendar info.(query-key:plat-code)", struct.getsUser_ID());
                            setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                  		 }
                  		}
                  	}else{
                  		// 読込処理失敗：カレンダ情報レコードなし（検索キー：品目コード）
                        sysLog.finest_d("read error:no record for calendar info.(query-key:plat-code)", struct.getsUser_ID());
                        setErrorMessage("AB00011", "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  	}
                   	if(endfg ==1){
                   		_debugMsg = ("controlselect() calendar info. MIN_CAL_DATE = " + minCalDate);
                 	    sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                  	    _debugMsg = ("controlselect() calendar info. MAX_CAL_DATE = " + maxCalDate);
                 	    sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                  	    minDateCal = dc.str2date(minCalDate);
                        maxDateCal = dc.str2date(maxCalDate);
                        //  生産計画期間がカレンダ番号で定義されるカレンダの範囲内かどうかのチェック
                        if( (dateFrom.getTime() < minDateCal.getTime()) || (dateTo.getTime() > maxDateCal.getTime()) )
                         {
                           // 読込処理失敗：カレンダの範囲内ではありません
                           sysLog.finest_d("read error:out of range of calendar", struct.getsUser_ID());
                         	if(Checkfg ==1){
                         		setErrorMessage("AB00011", "M_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                         	}else{
                         		setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                         	}
                          }
                    	}else{
                    		// 読込処理失敗：カレンダ情報レコードなし（検索キー：品目コード、工場コード）
                    		sysLog.finest_d("read error:no record for calendar info.(query-key:plat-code)", struct.getsUser_ID());
                    		setErrorMessage("AB00011", "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD());
                    	}
                 //====================================
                 //  業務運用日関連チェック
                 //====================================
                  workList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
                  if(workList.size() > 0)
                  {
                   workStruct = (AB0010010Struct)workList.get(0);
                   strBusinessOprDate = workStruct.gets_BUSINESS_OPR_DATE();
                   _debugMsg = ("controlselect() date of bussiness operation = " + strBusinessOprDate);
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                   // 取得した業務運用日のチェック
                   if(strBusinessOprDate != null)
                   {
                    dateBusinessOprDate = dc.str2date(strBusinessOprDate);
                    bValidBusinessOprDate = true;
                    
                   	// ASPROVA連携オプション導入時は過去オーダの表示・メンテナンス可
                  //--------------------DEL 20081208
//                  if(dateFrom.getTime() < dateBusinessOprDate.getTime())
//                  {
//                   // 読込処理失敗：入力された生産計画期間(FROM)が業務運用日より過去に設定されています
//                   sysLog.finest_d("read error:production schedule period(FROM) is older than date of bussiness operation", struct.getsUser_ID());
//            
//                   // エラーメッセージ出力
//                   setErrorMessage("AB00012", "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
//                  }
                   }
                   else
                   {
                    // 読込処理失敗：取得した業務運用日がnull
                    sysLog.finest_d("read error:date of bussiness operation is null", struct.getsUser_ID());
                    // エラーメッセージ出力
                    setErrorMessage("AB00026", "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
                   }
              
                  }
                  else
                  {
                   // 読込処理失敗：業務運用日レコードなし（検索キー：工場コード）
                   sysLog.finest_d("read error:no record for date of bussiness operation(query-key:plant-code)", struct.getsUser_ID());
              
                   // エラーメッセージ出力
                   setErrorMessage("AB00026", "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
                  }
                 }
              
                 //====================================
                 //  最大計画期間（月）チェック
                 //====================================
                 // システムパラメータの最大表示期間（月）を取得
                 List maxMonthList = entity.mselectMAX_DISPLAY_MONTH_MRP.read(conn, struct);
                 String MAX_DISPLAY_MONTH = null;
                 if(maxMonthList.size() > 0){
                    AB0010010Struct maxMonthStruct = (AB0010010Struct)maxMonthList.get(0);
                    if(null == maxMonthStruct.gets_MAX_DISPLAY_MONTH_MRP()){
                      MAX_DISPLAY_MONTH = "0";
                    }else{
                      MAX_DISPLAY_MONTH = maxMonthStruct.gets_MAX_DISPLAY_MONTH_MRP();
                    }
                 }
                 if(!"0".equals(MAX_DISPLAY_MONTH)){
                   Calendar calFrom = Calendar.getInstance();
                   Calendar calTo = Calendar.getInstance();
                   calFrom.setTime(dateFrom);
                   calTo.setTime(dateTo);
                   calFrom.add(Calendar.MONTH, Integer.parseInt(MAX_DISPLAY_MONTH));
                   long lForm = calFrom.getTimeInMillis();
                   long lTo = calTo.getTimeInMillis();
                   // 最大表示期間を超えるとき
                   if(lForm <= lTo){
                     // エラーメッセージ出力
                     ExpjMessage emsg = new ExpjMessage( "AB00049", MAX_DISPLAY_MONTH );
                     msgStruct.addError( emsg );	// エラーメッセージとして登録
                     sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
                  }
                }
                 
                 // エラーがない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                 //====================================
                 // メイン情報設定処理
                 //====================================
              
                  //====================================
                  // 手持在庫数読込（算出済み）
                  //====================================
                  strStockOnHandQty = getStockOnHandQtySum(struct);
                  save_struct.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
                  _debugMsg = ("controlselect() STOCK_ON_HAND=" + save_struct.getSTOCK_ON_HAND_QTY());
                  sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
                  //====================================
                  // 業務運用日設定
                  //====================================
                  save_struct.sets_BUSINESS_OPR_DATE(strBusinessOprDate);
              
                  //====================================
                  // メイン情報読込
                  //====================================
                  workList = entity.mselect.read(conn, struct);
                  if(workList.size() > 0)
                  {
                   // 読込情報取得
                   workStruct = (AB0010010Struct)workList.get(0);
              
                   // 読込情報設定
                   save_struct.setPLANT_NAME(workStruct.getPLANT_NAME());
                   save_struct.setITEM_NAME(workStruct.getITEM_NAME());
                   save_struct.setDRAW_CD(workStruct.getDRAW_CD());
                   save_struct.setSPEC(workStruct.getSPEC());
                   save_struct.setMRP_ODR_TYP(workStruct.getMRP_ODR_TYP());
                   save_struct.setOUTSIDE_TYP(workStruct.getOUTSIDE_TYP());
                   save_struct.setITEM_SPOIL(workStruct.getITEM_SPOIL());
                   save_struct.setUNIT_QTY_TYP(workStruct.getUNIT_QTY_TYP());
                   save_struct.setLOT_SIZING_TYP(workStruct.getLOT_SIZING_TYP());
                   save_struct.setMAX_PERIOD(workStruct.getMAX_PERIOD());
                   save_struct.setMUL_ODR_QTY(workStruct.getMUL_ODR_QTY());
                   save_struct.setMAX_ODR_QTY(workStruct.getMAX_ODR_QTY());
                   save_struct.setMIN_ODR_QTY(workStruct.getMIN_ODR_QTY());
                   save_struct.setSAFETY_STOCK(workStruct.getSAFETY_STOCK());
                   save_struct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
              
                   save_struct.sets_ODR_LT(workStruct.gets_ODR_LT());
                   save_struct.sets_FIXED_LT(workStruct.gets_FIXED_LT());
                   save_struct.sets_PROP_LT(workStruct.gets_PROP_LT());
                   save_struct.sets_SAFETY_LT(workStruct.gets_SAFETY_LT());
                   save_struct.sets_PROP_LOT_SIZE(workStruct.gets_PROP_LOT_SIZE());
                   save_struct.sets_ISSUE_TYP(workStruct.gets_ISSUE_TYP());
                   save_struct.sets_ISSUE_LT(workStruct.gets_ISSUE_LT());
                   
                   setScreenUnitQtyTyp(save_struct.getUNIT_QTY_TYP());
              
                   //====================================
                   // Mrpデータ算出処理
                   //====================================
                   // MRPデータ算出に必要な情報を設定
                   
                   ATMrpManager atmrpManager = new ATMrpManager();
                   MrpManager mrpManager = new MrpManager();
                   
                   // EJa-ASPROVA連携オプション導入の場合
                   if("1".equals(_SysInstallOptions_ASP)){
                	   
        						atmrpManager.setConnection(conn);
        						atmrpManager.setItemCode(struct.getw_ITEM_CD());
        						atmrpManager.setPlantCode(struct.getw_PLANT_CD());
        						atmrpManager.setFrom(dc.str2formal(struct.getw_date_from()));
        						atmrpManager.setTo(dc.str2formal(struct.getw_date_to()));
        						atmrpManager.setfg(Checkfg);
        						_debugMsg = ("controlselect()" + 
        								" (YYYY/MM/DD)FROM = " + dc.str2formal(struct.getw_date_from()) + 
        								" (YYYY/MM/DD)TO = " + dc.str2formal(struct.getw_date_to()));
        						sysLog.finest_d(_debugMsg, struct.getsUser_ID());              	   
                	
        						// MRPデータ算出処理
                   				_debugMsg = ("controlselect() stockOnHandQty = " + save_struct.getSTOCK_ON_HAND_QTY() + " itemSpoil = " + save_struct.getITEM_SPOIL());
                   				sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                   
                   				result = atmrpManager.execute(save_struct.getSTOCK_ON_HAND_QTY(), save_struct.getITEM_SPOIL(), save_struct.getw_date_from(),0);
                   								
                   				if(result == true)
                   				{
                   					//====================================
                   					// 画面へ表示する情報を設定
                   					//====================================
                   					struct.copy(save_struct);
                   					setTypeValueAboutItem(struct);
              
                   					AB0010010Struct oneDay = null;
                   					String difference = "0.0";
                   					oneDay = new AB0010010Struct();
                   					oneDay.importPastStock(atmrpManager.getPast(),_locale);
                   					difference = oneDay.getDifference();
                   					list.add(oneDay);
              
                   					for(int n = 0; n < atmrpManager.size(); n++){
                   						oneDay = new AB0010010Struct();
                     
                   						//該当日付が複数データあるか
                   						oneDay.setFIT_DATE((atmrpManager.getData(n)).getPlanDate());
                   						oneDay.setw_PLANT_CD(struct.getw_PLANT_CD());
                   						oneDay.setw_ITEM_CD(struct.getw_ITEM_CD());
                   						List listRecordCnt = entity.mSelectRecCnt.read(conn,oneDay);
                   				
                   						if(listRecordCnt.size() > 1 && "true".equals(_flgTimeCtrl)){
                   							oneDay.importStock(atmrpManager.getData(n),Calculate.subtract(atmrpManager.getData(n).getStock(),difference),true);
                   						}else{
                   							oneDay.importStock(atmrpManager.getData(n),Calculate.subtract(atmrpManager.getData(n).getStock(),difference),false);
                   						}
                   						difference = atmrpManager.getData(n).getStock();
                   						list.add(oneDay);
                   					}
              
                   					// 処理成功フラグ設定
                   					bSuccess = true;
                    
                  					setReadStatus(NORMAL);
              
                   				}
                   				else
                   				{
                   					// MRPデータ算出に失敗
                   					sysLog.finest_d("calculate error:MRP-data", struct.getsUser_ID());
                   				}               	   
                   // EJa-ASPROVA連携オプション未導入の場合
                   }else{
                   
                   				mrpManager.setConnection(conn);
                   				mrpManager.setItemCode(struct.getw_ITEM_CD());
                   				mrpManager.setPlantCode(struct.getw_PLANT_CD());
                   				mrpManager.setFrom(dc.str2formal(struct.getw_date_from()));
                   				mrpManager.setTo(dc.str2formal(struct.getw_date_to()));
                   				mrpManager.setfg(Checkfg);
                   				_debugMsg = ("controlselect()" + 
                   						" (YYYY/MM/DD)FROM = " + dc.str2formal(struct.getw_date_from()) + 
                   						" (YYYY/MM/DD)TO = " + dc.str2formal(struct.getw_date_to()));
                   				sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
                   				// MRPデータ算出処理
                   				_debugMsg = ("controlselect() stockOnHandQty = " + save_struct.getSTOCK_ON_HAND_QTY() + " itemSpoil = " + save_struct.getITEM_SPOIL());
                   				sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                   
                   				result = mrpManager.execute(save_struct.getSTOCK_ON_HAND_QTY(), save_struct.getITEM_SPOIL(), save_struct.getw_date_from(),0);
                   
                   				if(result == true)
                   				{
                   					//====================================
                   					// 画面へ表示する情報を設定
                   					//====================================
                   					struct.copy(save_struct);
                   					setTypeValueAboutItem(struct);
              
                   					AB0010010Struct oneDay = null;
                   					String difference = "0.0";
                   					oneDay = new AB0010010Struct();
                   					oneDay.importPastStock(mrpManager.getPast(),_locale);
                   					difference = oneDay.getDifference();
                   					list.add(oneDay);
              
                   					for(int n = 0; n < mrpManager.size(); n++){
                   						oneDay = new AB0010010Struct();
                     
                   						//該当日付が複数データあるか
                   						oneDay.setFIT_DATE((mrpManager.getData(n)).getPlanDate());
                   						oneDay.setw_PLANT_CD(struct.getw_PLANT_CD());
                   						oneDay.setw_ITEM_CD(struct.getw_ITEM_CD());
                   						List listRecordCnt = entity.mSelectRecCnt.read(conn,oneDay);
                   				
                   						if(listRecordCnt.size() > 1 && "true".equals(_flgTimeCtrl)){
                   							oneDay.importStock(mrpManager.getData(n),Calculate.subtract(mrpManager.getData(n).getStock(),difference),true);
                   						}else{
                   							oneDay.importStock(mrpManager.getData(n),Calculate.subtract(mrpManager.getData(n).getStock(),difference),false);
                   						}
                   						difference = mrpManager.getData(n).getStock();
                   						list.add(oneDay);
                   					}
              
                   					// 処理成功フラグ設定
                   					bSuccess = true;
                    
                   					setReadStatus(NORMAL);
              
                   				}
                   				else
                   				{
                   					// MRPデータ算出に失敗
                   					sysLog.finest_d("calculate error:MRP-data", struct.getsUser_ID());
                   				}
                   	}
                  
                  }
                  else
                  {
                   // メイン情報レコードなし
                   _debugMsg = ("controlselect() no record for main info.");
                   sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                  }
                  
  				// キー項目の保持
  				setKeyStruct(struct);
              
                 }
                }
                catch(SQLException e)
                {
                 // 検索状態を「読込失敗」に設定
                 setReadStatus(ERROR);
              
                 // エラー処理を記述してください。
                 setSqlExceptionMsg(e, "");
                }
                finally
                {
                 // 画面モード設定
                 if(bSuccess == true)
                 {
                  // 検索状態を「読込成功」に設定
                  setReadStatus(NORMAL);
                 }
                 else
                 {
                  // 検索状態を「読込失敗」に設定
                  setReadStatus(INITIAL);
              
                  // 全クリア
                  struct.clear();
                  list.clear();
              
                  // 最新工場情報反映
                  if(structPlant != null)
                  {
                   struct.setPLANT_NAME(structPlant.getPLANT_NAME());
                  }
                  // 最新品目情報反映
                  if(structItem != null)
                  {
                   struct.setITEM_NAME(structItem.getITEM_NAME());
                   struct.setDRAW_CD(structItem.getDRAW_CD());
                   struct.setSPEC(structItem.getSPEC());
                   struct.setMRP_ODR_TYP(structItem.getMRP_ODR_TYP());
                   struct.setOUTSIDE_TYP(structItem.getOUTSIDE_TYP());
                   struct.setITEM_SPOIL(structItem.getITEM_SPOIL());
                   struct.setUNIT_QTY_TYP(structItem.getUNIT_QTY_TYP());
                   struct.setLOT_SIZING_TYP(structItem.getLOT_SIZING_TYP());
                   struct.setMAX_PERIOD(structItem.getMAX_PERIOD());
                   struct.setMUL_ODR_QTY(structItem.getMUL_ODR_QTY());
                   struct.setMAX_ODR_QTY(structItem.getMAX_ODR_QTY());
                   struct.setMIN_ODR_QTY(structItem.getMIN_ODR_QTY());
                   struct.setSAFETY_STOCK(structItem.getSAFETY_STOCK());
                   struct.setSTOCK_UNIT(structItem.getSTOCK_UNIT());
              
                   struct.sets_ODR_LT(structItem.gets_ODR_LT());
                   struct.sets_FIXED_LT(structItem.gets_FIXED_LT());
                   struct.sets_PROP_LT(structItem.gets_PROP_LT());
                   struct.sets_SAFETY_LT(structItem.gets_SAFETY_LT());
                   struct.sets_PROP_LOT_SIZE(structItem.gets_PROP_LOT_SIZE());
                   struct.sets_ISSUE_TYP(structItem.gets_ISSUE_TYP());
                   struct.sets_ISSUE_LT(structItem.gets_ISSUE_LT());
                   setTypeValueAboutItem(struct);
                  }
              
                  // 工場、品目両方とも存在する場合に設定する情報
                  if(structPlant != null && structItem != null)
                  {
                   struct.setSTOCK_ON_HAND_QTY(strStockOnHandQty);
                  }
              
                  // 読込キーを再設定
                  struct.setw_PLANT_CD(structCopy.getw_PLANT_CD());
                  struct.setw_ITEM_CD(structCopy.getw_ITEM_CD());
                  struct.setw_date_from(structCopy.getw_date_from());
                  struct.setw_date_to(structCopy.getw_date_to());
                  struct.setTIME_CTRL(_flgTimeCtrl);
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
                try {
                 //====================================
                 // 更新前準備
                 //====================================
                DateConverter dc = new DateConverter();
    			struct.sets_FIXED_LT(_keyStruct.gets_FIXED_LT());
    			struct.sets_PROP_LOT_SIZE(_keyStruct.gets_PROP_LOT_SIZE());
    			struct.sets_PROP_LT(_keyStruct.gets_PROP_LT());
    			struct.sets_SAFETY_LT(_keyStruct.gets_SAFETY_LT());
    			struct.sets_ODR_LT(_keyStruct.gets_ODR_LT());
    			struct.sets_ISSUE_LT(_keyStruct.gets_ISSUE_LT());

                 // 画面のデータを展開
                 ArrayList inputQtys = new ArrayList(0);
                 deployInputQtys(struct,inputQtys);
              
                 // トランザクション開始
                 conn.beginTransWeb();
                 
                 boolean bSuccess = true;
                 boolean isUpdated = false; 		// 1件以上更新した?
                 
                 // EJa-ASPROVA連携オプション導入の場合
     			 if("1".equals(_SysInstallOptions_ASP)){

     						// オーダデマンド番号採番クラスオブジェクト生成
     						CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), this.sp.getProcId(), struct.getw_PLANT_CD());
     						
     						// 値の取得
     						String lotSize = struct.gets_PROP_LOT_SIZE();
     						
     						String sWkDate, sShiftMin;
     						
     						ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
     									this.sysUSER_CD, 
     									this.getProgramId());
     		   				ATWorkCalendar atWC = new ATWorkCalendar(conn, 
     									this.sysUSER_CD , 
     									this.getProgramId(), 
     									this.sysPLANT_CD) ; 
     						
     		   				Date odrStartDate = null;			// 手配着手日
     		   				Date prdStartDate = null;		  	// 製造着手日
     		   				Date prdDueDate = null;		  		// 製造納期
     		   				Date dueDate = null;		  		// 要求納期
     		   				
     		   				
    		                //====================================
    		                // 所要量テーブル更新処理
    		                //====================================
     		   				String strNewPlanOrder;
     		   				
     		   				for(int i = 0; i < inputQtys.size(); i++){
     		   				
     		   						AB0010010Struct newQty = (AB0010010Struct)(inputQtys.get(i));
     		   						AB0010010Struct original = findOriginal(list,newQty);
     		   						
     		   						if(original == null)  continue; // 元データに見つからないとき 処理なし
     		   						
     		   						sysLog.finest_d(" * [" + original.getPlanDate() + "]--------------------------------",struct.getsUser_ID());
     		   							
     	     		                // データ取得
     	     		                strNewPlanOrder = newQty.getNewPlanOrder(); // 新計画オーダ
     	     		                String oldQty = original.getOldPlanOrder();
     	     		                     
     	     		                // --------------------------------------------------------------------------------
        		                    
     	     		                // 変更あり ?
     	     		                if(strNewPlanOrder == null || "".equals(strNewPlanOrder) || Calculate.compare(oldQty,strNewPlanOrder) == 0){
     	     		                	sysLog.finest_d(" * [" + original.getPlanDate() + "] unchanged(" + oldQty + "→" + strNewPlanOrder + ")",struct.getsUser_ID());
        		                    	continue;
        		                    }
     	     		                sysLog.finest_d(" * There is change. [" + oldQty + "]→[" + strNewPlanOrder + "]",struct.getsUser_ID());
     		              
     	     		                // --------------------------------------------------------------------------------
     	     		                
     	     		                // レコード削除
     	     		                isUpdated = true;
     	     		                
     	     		                // 削除する日付の時刻を取得
     	     		                String rec_time = "";
     	     		                struct.setFIT_DATE(original.getPlanDate());
     	     		                List listRecordCnt = entity.mSelectRecCnt.read(conn,struct);
     	     		                
     	     		                if(listRecordCnt.size() == 1){
     	     		                	rec_time = ((AB0010010Struct)listRecordCnt.get(0)).getTIME();
     	     		                	struct.sets_PARENT_OD_NO(((AB0010010Struct)listRecordCnt.get(0)).gets_PARENT_OD_NO());
     	     	                    }
     	     	                    //削除データがない場合
     	     	                    if(rec_time.length() != 5){
     	     	                    	if(_flgTimeCtrl.equals("true")){
     	     	                    		rec_time = "23:59";
     	     	                    	}else{
     	     	                    		rec_time = "00:00";
     	     	                    	}
     	     	                    }
     	     		                
     	     	                    // レコードの削除（工場コード、品目番号、製造納期、オーダデマンド区分(2)、オーダ状態区分(1)がキー）
     	     	                    // 新計画オーダへ入力された日付のレコードを削除する
     	     	                    struct.sets_DUE_DATE(original.getPlanDate());		/* 要求納期 */
     	     	                    struct.sets_PRD_DUE_DATE(original.getPlanDate());	/* 製造納期 */
     								List forUpdateList1 = entity.mSELECT_FOR_UPDATE.read(conn, struct);
     								if (!forUpdateList1.isEmpty()) {
     									int delete = entity.mdeleteT_OD.delete(conn, struct);
     								}

     	     	                    /** パラメータ「デマンド削除可否フラグ」を取得*/
     	     	                    privateConfig = new PrivateConfig(conn);
     	     	                    dmDelFlg = privateConfig.getString("DM_DEL_FLG");
     	     	                    if("1".equals(dmDelFlg)){
     	     	                    	// 親計画オーダデマンド番号に持つ子デマンドを削除する
     	     	                    	entity.mdeleteT_DEMAND.delete(conn, struct);
     	     	                    }
     	     	                    // --------------------------------------------------------------------------------
     	     	                    // データあり ?
     	     	                    if(Calculate.compare(strNewPlanOrder, "0") <= 0){
     	     	                    	// 新計画オーダがゼロなので登録しない
     	     	                    	_debugMsg = ("controlupdate()" + "[" + i + "]" + original.getPlanDate() + " cannot register, new plan-order is zero");
     	     	                    	sysLog.finest_d(_debugMsg, struct.getsUser_ID());
     	     	                    	continue;
     	     	                    }
     	     	                    
     	     	                    // --------------------------------------------------------------------------------
     	     	                    // レコード追加・更新処理
     	     	                    
     	     	                    // オーダデマンド番号取得
     	     	                    String odNo = collect.getNo();
     	     	                    if(odNo == null)
     	     	                    {
     	     	                    	// 更新成功フラグ設定
     	     	                    	bSuccess = false;
     	     	              
     	     	                    	// オーダデマンド番号採番失敗
     	     	                    	sysLog.finest_d("update error:returned order-demand is null", struct.getsUser_ID());
     	     	                    	// エラーメッセージ出力
     	     	                    	setErrorMessage("AB00045", "");
     	     	                    	break;
     	     	                    }
     	     	                    
     	     	                    struct.sets_OD_NO(odNo);				/*オーダデマンド番号  */
     	     	                    struct.sets_ODR_QTY(strNewPlanOrder);	/*オーダ数量          */
     	     	                    
     	     	                    struct.sets_PRD_DUE_DATE(struct.gets_PRD_DUE_DATE() + " " + rec_time);	/* 製造納期 */

     	     	                    // 画面より入力した製造納期(YYYY/MM/DD HH24:MI)を変数にセットする
     	     	                  	prdDueDate = StrngToDt(struct.gets_PRD_DUE_DATE());
     	     	   				    // 製造納期と業務運用日の比較
     	     						if (prdDueDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
     	     							prdDueDate = dc.str2date(strBusinessOprDate);
     	     						}

     	     	                  	// 製造納期 ⇒ 要求納期の算出：払出ＬＴ(Ｈ)分未来方向へシフトさせる
     	     	                    sShiftMin = ab.getIssueLtMin(struct.getw_ITEM_CD(),"U");
     	     	   				    dueDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_END);
     	     	   				    // 要求納期と業務運用日の比較
     	     	   				    if (dueDate.compareTo(dc.str2date(strBusinessOprDate)) < 0){
     	     	   				    	dueDate = dc.str2date(strBusinessOprDate);
     	     	   				    }
     	     	  				    sWkDate =DtToStrng(dueDate);
     	     	  				    struct.sets_DUE_DATE(sWkDate);
     	     	  				    
     	     	  				    // 製造納期 ⇒ 製造着手日の算出：製造ＬＴ(Ｈ)分過去方向へシフトさせる
     	     	  				    sShiftMin = ab.getProdLtMin(struct.getw_ITEM_CD(),strNewPlanOrder,lotSize,"U");
     	     	  				    sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
     	   	   				        prdStartDate = atWC.calcShiftMinute(prdDueDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
     	     	   				    // 製造着手日と業務運用日の比較
		     	   	   				if (prdStartDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
		     							prdStartDate = dc.str2date(strBusinessOprDate);
		     						}
     	   	   				        sWkDate =DtToStrng(prdStartDate);
     	   	   				        struct.sets_PRD_START_DATE(sWkDate);
     	   	   				        
     	   	   				        // 製造着手日 ⇒ 手配着手日の算出：手配ＬＴ(Ｈ)分過去方向へシフトさせる
     	   	   				        sShiftMin = ab.getOdrLtMin(struct.getw_ITEM_CD(),"U");
     	   	   				        sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
     	   	   				        odrStartDate = atWC.calcShiftMinute(prdStartDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
     	     	   				    // 手配着手日と業務運用日の比較
		     	   	   				if (odrStartDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
		     							odrStartDate = dc.str2date(strBusinessOprDate);
		     						}
     	   	   				        sWkDate =DtToStrng(odrStartDate);
     	   	   				        struct.sets_ODR_START_DATE(sWkDate);
     	     	                  	
     	   	   				        _debugMsg = ("(AB0010/EJa-ASP)MAIN: " 
     	   	   				        		+ "DUE_DATE" + "[" + struct.gets_DUE_DATE() + "]," 
     	   	   				        		+"PRD_DUE_DATE" + "[" + struct.gets_PRD_DUE_DATE() + "],"  
     	   	   				        		+ "PRD_START_DATE" + "[" + struct.gets_PRD_START_DATE() + "],"  
     	   	   				        		+ "ODR_START_DATE" + "[" + struct.gets_ODR_START_DATE() + "] " );
     	   	   				        //sysLog.info(_debugMsg, struct.getsUser_ID());
     	   	   				        sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
     	     	                    
     	   	   				        // 所要量テーブルへの追加処理
     								entity.minsertT_OD.create(conn, struct);
     						}
     	     	              			
     			}else{
                         
     						// オーダデマンド番号採番クラスオブジェクト生成
     						CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), this.sp.getProcId(), struct.getw_PLANT_CD());
              
     						// 稼働日計算クラスオブジェクト生成
     						sysLog.finest_d("Control：controlselect" +
     								"\n ************ parameter for WorkDay ************" + 
     								"\n     USER-ID: getsUser_ID =" + struct.getsUser_ID() +
     								"\n  PROCESS-ID: getProcId =" + this.sp.getProcId() +
     								"\n    PLANT-CD: getw_PLANT_CD =" + struct.getw_PLANT_CD()
     								,struct.getsUser_ID());
     						WorkDay workday = new WorkDay(struct.getsUser_ID(), this.sp.getProcId(),
                 								struct.getw_PLANT_CD(),struct.getw_ITEM_CD(), null);
     						// 値の取得
     						String fixedLT = struct.gets_FIXED_LT();
     						String lotSize = struct.gets_PROP_LOT_SIZE();
     						String propLT  = struct.gets_PROP_LT();
     						String safety  = struct.gets_SAFETY_LT();
     						String orderLT = struct.gets_ODR_LT();
     						_debugMsg = ("controlupdate()" + 
     								" palnt-code=" + struct.getw_PLANT_CD() + " item-code=" + struct.getw_ITEM_CD() + " number of data=" + inputQtys.size());
     						sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
     						_debugMsg = ("controlupdate()" + " [fixedLT]=" + fixedLT + " [lotSize]=" + lotSize + " [propLT]=" + propLT + " [safety]=" + safety + " [orderLT]=" + orderLT);
     						sysLog.finest_d(_debugMsg, struct.getsUser_ID());
                 
     						// 日付変換用
     						//DateConverter dc = new DateConverter();
              
     						//====================================
     						// 所要量テーブル更新処理
     						//====================================
     						String strNewPlanOrder;
     						Date prdDate, orderDate;
     						
     						for(int i = 0; i < inputQtys.size(); i++){
              
     								AB0010010Struct newQty = (AB0010010Struct)(inputQtys.get(i));
     								AB0010010Struct original = findOriginal(list,newQty);
     								if(original == null)  continue; // 元データに見つからないとき 処理なし
              
     								sysLog.finest_d(" * [" + original.getPlanDate() + "]--------------------------------",struct.getsUser_ID());
              
     								// データ取得
     								strNewPlanOrder = newQty.getNewPlanOrder(); // 新計画オーダ
     								String oldQty = original.getOldPlanOrder();
              
     								//--------------------------------------------------------------------------------
     								// 変更あり ?
     								if(strNewPlanOrder == null || "".equals(strNewPlanOrder) || Calculate.compare(oldQty,strNewPlanOrder) == 0){
     									sysLog.finest_d(" * [" + original.getPlanDate() + "] unchanged(" + oldQty + "→" + strNewPlanOrder + ")",struct.getsUser_ID());
     									continue;
     								}
     								sysLog.finest_d(" * There is change. [" + oldQty + "]→[" + strNewPlanOrder + "]",struct.getsUser_ID());
              
              
     								//--------------------------------------------------------------------------------
     								// レコード削除
     								isUpdated = true;
                  
     								//削除する日付の時刻を取得
     								String rec_time = "";
     								struct.setFIT_DATE(original.getPlanDate());
     								List listRecordCnt = entity.mSelectRecCnt.read(conn,struct);
     								if(listRecordCnt.size() == 1){
     									rec_time = ((AB0010010Struct)listRecordCnt.get(0)).getTIME();
     	     		                	struct.sets_PARENT_OD_NO(((AB0010010Struct)listRecordCnt.get(0)).gets_PARENT_OD_NO());
     								}
     								//削除データがない場合
     								if(rec_time.length() != 5){
     									if(_flgTimeCtrl.equals("true")){
     										rec_time = "23:59";
     									}else{
     										rec_time = "00:00";
     									}
     								}
                  
     								// レコードの削除（工場コード、品目番号、製造納期、オーダデマンド区分(2)、オーダ状態区分(1)がキー）
     								// 新計画オーダへ入力された日付のレコードを削除する
     								struct.sets_DUE_DATE(original.getPlanDate());		/* 要求納期 */
     								struct.sets_PRD_DUE_DATE(original.getPlanDate());	/* 製造納期 */
     								List forUpdateList2 = entity.mSELECT_FOR_UPDATE.read(conn, struct);
     								if (!forUpdateList2.isEmpty()) {
     									int delete = entity.mdeleteT_OD.delete(conn, struct);
     								}

     								/** パラメータ「デマンド削除可否フラグ」を取得*/
     								privateConfig = new PrivateConfig(conn);
     								dmDelFlg = privateConfig.getString("DM_DEL_FLG");
     								if("1".equals(dmDelFlg)){
     									// 親計画オーダデマンド番号に持つ子デマンドを削除する
     									entity.mdeleteT_DEMAND.delete(conn, struct);
     								}

     								//--------------------------------------------------------------------------------
     								// データあり ?
     								if(Calculate.compare(strNewPlanOrder, "0") <= 0){
     									// 新計画オーダがゼロなので登録しない
     									_debugMsg = ("controlupdate()" + "[" + i + "]" + original.getPlanDate() + " cannot register, new plan-order is zero");
     									sysLog.finest_d(_debugMsg, struct.getsUser_ID());
     									continue;
     								}
              
     								//--------------------------------------------------------------------------------
     								// レコード追加・更新処理
              
     								// オーダデマンド番号取得
     								String odNo = collect.getNo();
     								if(odNo == null)
     								{
     									// 更新成功フラグ設定
     									bSuccess = false;
              
     									// オーダデマンド番号採番失敗
     									sysLog.finest_d("update error:returned order-demand is null", struct.getsUser_ID());
     									// エラーメッセージ出力
     									setErrorMessage("AB00045", "");
     									break;
     								}
              
     								struct.sets_OD_NO(odNo);				/*オーダデマンド番号  */
     								struct.sets_ODR_QTY(strNewPlanOrder);	/*オーダ数量          */
                  
              
     								// 製造リードタイム算出
     								// [品目].固定リードタイム ＋ 切り上げ(オーダ数 / [品目].比例ロットサイズ) × [品目].比例リードタイム ＋ [品目].安全日数
     								String prdLT = Calculate.add(fixedLT, Calculate.add(Calculate.multiply(Calculate.divide(strNewPlanOrder, lotSize, 0, Calculate._CEIL), propLT), safety));
     								_debugMsg = ("controlupdate()" + "[" + i + "]" + original.getPlanDate() +
     										" OD_NO=" + odNo + 
     										" new plan-order=" + strNewPlanOrder + 
     										" productLT[prdLT]=" + prdLT);
     								sysLog.finest_d(_debugMsg, struct.getsUser_ID());
              
     								// 製造着手日計算
     								prdDate = workday.calcDate(dc.str2date(original.getPlanDate()), - (int)Double.parseDouble(prdLT), false);
     								sysLog.finest_d("controlupdate()"+" date of onset of product=" + prdDate,
     										struct.getsUser_ID());
     								if(prdDate == null)
     								{
     									bSuccess = false;
              
     									// 更新処理失敗：製造着手日（WorkDayクラスcalcDate実行結果）がnull
     									sysLog.finest_d("update error:date of onset of product is null", struct.getsUser_ID());
              
     									// エラーメッセージ出力
     									setErrorMessage("AB00044", "");
     									break;
     								}
     								
     								Date dateBusinessOprDate=dc.str2date(strBusinessOprDate);
     								if (prdDate.compareTo(dateBusinessOprDate) < 0) {
     									prdDate = dateBusinessOprDate;
     								}
     								struct.sets_PRD_START_DATE(dc.date2str(prdDate) + " " + rec_time);	/* 製造着手日 */
              
     								// 手配着手日計算
     								orderDate = workday.calcDate(prdDate, - (int)Double.parseDouble(orderLT), false);
     								sysLog.finest_d("controlupdate()"+" date of onset of order=" + orderDate,
     										struct.getsUser_ID());
     								if(orderDate == null)
     								{
     									bSuccess = false;
              
     									// 更新処理失敗：手配着手日（WorkDayクラスcalcDate実行結果）がnull
     									sysLog.finest_d("update error:date of onset of order is null", struct.getsUser_ID());
              
     									// エラーメッセージ出力
     									setErrorMessage("AB00044", "");
     									break;
     								}
     								
     								if (orderDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
     									orderDate = dc.str2date(strBusinessOprDate);
     								}
     								struct.sets_ODR_START_DATE(dc.date2str(orderDate) + " " + rec_time);	/* 手配着手日 */
                  
     								Date DueDate = dc.str2date(struct.gets_DUE_DATE());
     								if (DueDate.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
     									DueDate = dc.str2date(strBusinessOprDate);
     								}
     								struct.sets_DUE_DATE(dc.date2str(DueDate) + " " + rec_time);		/* 要求納期 */
     								//struct.sets_DUE_DATE(struct.gets_DUE_DATE() + " " + rec_time);		/* 要求納期 */
     								
     								Date datePRD_DUE_DATE = dc.str2date(struct.gets_PRD_DUE_DATE()+" "+ rec_time);
     								if (datePRD_DUE_DATE.compareTo(dc.str2date(strBusinessOprDate)) < 0) {
     									datePRD_DUE_DATE = dc.str2date(strBusinessOprDate);
     								}
     								struct.sets_PRD_DUE_DATE(dc.date2str(datePRD_DUE_DATE) + " " + rec_time);	/* 製造納期 */
     								//struct.sets_PRD_DUE_DATE(struct.gets_PRD_DUE_DATE() + " " + rec_time);	/* 製造納期 */
     							
                  
     								// 所要量テーブルへの追加処理
     								entity.minsertT_OD.create(conn, struct);
              
     						}
                 }
                 inputQtys.clear();
              
                 if(bSuccess == false){
                  conn.rollback();
                  return;
                 }
                 // 所要量テーブルを更新したなら 所要量メンテナンス済みフラグを立てる
                 if(isUpdated){
                  if(entity.mSYS_OD_CALC_CTRL.update(conn,struct) == 0){
                   conn.rollback();
              
                   // エラーメッセージ出力
                   setErrorMessage("AB00046", "SYS_OD_CALC_CTRL.PLANT_CD:" + struct.getw_PLANT_CD());
                   return;
                  }
                 }
                 conn.commit();
                 // 読込実行
                 controlselect();
                }
                catch(SQLException e)
                {
                 // ロールバック
                 conn.rollback();
              
                 sysLog.finest_d("update error:SQLException occurred", struct.getsUser_ID());
                 setSqlExceptionMsg(e, "");
                }
				catch(ResourceBusyException e) {
					// ロールバック
					conn.rollback();
					
					e.printStackTrace();
					setErrorMessage("ZZ01105");
					setReadStatus(ERROR);
				}
                catch(Exception e)
                {
                 // ロールバック
                 conn.rollback();
              
                 // エラーメッセージ作成
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
              
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                try{
                 struct.clear();
                 list.clear();
              
                 // デフォルト値設定
                 setDefaultData();
              
				List listTimeCtrl = entity.mselectTIME_CTRL.read(conn,struct);
				if(listTimeCtrl == null || listTimeCtrl.size() <=0){
					struct.setTIME_CTRL("false");
					_flgTimeCtrl = "false";
				}else{
					struct.setTIME_CTRL(((AB0010010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
					_flgTimeCtrl = struct.getTIME_CTRL();
				}
                
				
                // インストールオプションテーブルよりEJa-ASPROVA連携オプション導入フラグを取得
                List SysInstallOptASP = entity.mSYS_INSTALL_OPTIONS_ASP.read(conn,struct);
                if(SysInstallOptASP == null || SysInstallOptASP.size() <=0){
                	struct.setASP_INSTALL_FLG(null);
                }else{
                	struct.setASP_INSTALL_FLG(((AB0010010Struct)SysInstallOptASP.get(0)).getASP_INSTALL_FLG());
                }
                _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
                
                // 検索状態を「初期状態」に設定
                 setReadStatus(INITIAL);
                }
                catch(SQLException e)
                {
                 setSqlExceptionMsg(e, "");
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 時刻別ボタン押下時に実行される処理です。
	 *
	 */
	public void controltime() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controltime");
			//{{user_implement_dev:<controltime>
			// TODO: ユーザ定義のコードを記述してください
			
			//キー項目の保持
			setKeyStruct(struct);
			
			//親画面から値を引き継ぐ
			struct.setsub_PlanDate(struct.getPlanDate());
			
			//選択日を時刻別で表示
			SelectTimeSepa();
			
                //}}user_implement_dev:<controltime>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controltime");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
			// TODO: ユーザ定義のコードを記述してください
			
			// キーコピー
			struct.copy(_keyStruct);
			
			//再検索
			controlselect();
			
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsubInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlsubInsert");
			//{{user_implement_dev:<controlsubInsert>
			// TODO: ユーザ定義のコードを記述してください
		
		InsertTimeSepa(1);
		
                //}}user_implement_dev:<controlsubInsert>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlsubInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsubUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlsubUpdate");
			//{{user_implement_dev:<controlsubUpdate>
			// TODO: ユーザ定義のコードを記述してください
		
		InsertTimeSepa(0);
		
                //}}user_implement_dev:<controlsubUpdate>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlsubUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsubDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlsubDelete");
			//{{user_implement_dev:<controlsubDelete>
			// TODO: ユーザ定義のコードを記述してください
		
		DeleteTimeSepa();
		
                //}}user_implement_dev:<controlsubDelete>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlsubDelete");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}

	/**
	 * 時系列入出庫予定一覧ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSrcmovToTimeInOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlSrcmovToTimeInOut");
			//{{user_implement_dev:<controlSrcmovToTimeInOut>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlSrcmovToTimeInOut>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlSrcmovToTimeInOut");

		return;
	}

	/**
	 * オーダ別進捗ボタン押下時に実行される処理です。
	 *
	 */
	public void controlOdrProgLst() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlOdrProgLst");
			//{{user_implement_dev:<controlOdrProgLst>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlOdrProgLst>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlOdrProgLst");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------------------
                try
                {
                 // コンボデータの取得
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 ComboStruct MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");		// 品目手配区分
                 ComboStruct OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");		// 品目内外作区分
                 ComboStruct UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");		// 在庫数単位区分
                 ComboStruct LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");	// ロットまとめ区分
                 controller.setConnection(null);
              
                 // 属性に取得データ設定
                 setMRP_ODR_TYP(MRP_ODR_TYP);
                 setOUTSIDE_TYP(OUTSIDE_TYP);
                 setUNIT_QTY_TYP(UNIT_QTY_TYP);
                 setLOT_SIZING_TYP(LOT_SIZING_TYP);
              
                 // クリア処理
                 controlclear();
              
                }
                catch(SQLException e)
                {
                 // エラーメッセージ作成
                 setSqlExceptionMsg(e, "");
                }
                catch(ComboException e)
                {
                 // エラーメッセージ作成
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
              
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0010");
		logger.entering("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AB0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("time") ) {
				controltime();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("subInsert") ) {
				controlsubInsert();
			} else if( button.equals("subUpdate") ) {
				controlsubUpdate();
			} else if( button.equals("subDelete") ) {
				controlsubDelete();
			} else if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("SrcmovToTimeInOut") ) {
				controlSrcmovToTimeInOut();
			} else if( button.equals("OdrProgLst") ) {
				controlOdrProgLst();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
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
//			throw new FoundationException("AB0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0010010-E999","CSVの出力処理"));
			throw new FoundationException("AB0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0010010-E999","システム日付の取得処理"));
				throw new FoundationException("AB0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("AB0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AB0010010Entity entity;
	protected AB0010010Struct struct;
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

		entity = new AB0010010Entity();
		struct = new AB0010010Struct();

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
	 * AB0010010クラスの標準コンストラクタ
	 */
	public AB0010010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //------------------------------------------------------------------
                list = new ArrayList(0);
                //------------------------------------------------------------------
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
				AB0010010Struct key = (AB0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_date_from") && key.getw_date_from() != null) {
					msgKey.setKeyValue("w_date_from", key.getw_date_from());
				}
				if(msgKeyType.containsKeyColumn("w_date_to") && key.getw_date_to() != null) {
					msgKey.setKeyValue("w_date_to", key.getw_date_to());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME") && key.getUNIT_QTY_NAME() != null) {
					msgKey.setKeyValue("UNIT_QTY_NAME", key.getUNIT_QTY_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_NAME") && key.getLOT_SIZING_NAME() != null) {
					msgKey.setKeyValue("LOT_SIZING_NAME", key.getLOT_SIZING_NAME());
				}
				if(msgKeyType.containsKeyColumn("PlanDate") && key.getPlanDate() != null) {
					msgKey.setKeyValue("PlanDate", key.getPlanDate());
				}
				if(msgKeyType.containsKeyColumn("FixDemand") && key.getFixDemand() != null) {
					msgKey.setKeyValue("FixDemand", key.getFixDemand());
				}
				if(msgKeyType.containsKeyColumn("PlanDemand") && key.getPlanDemand() != null) {
					msgKey.setKeyValue("PlanDemand", key.getPlanDemand());
				}
				if(msgKeyType.containsKeyColumn("FixOrder") && key.getFixOrder() != null) {
					msgKey.setKeyValue("FixOrder", key.getFixOrder());
				}
				if(msgKeyType.containsKeyColumn("OldPlanOrder") && key.getOldPlanOrder() != null) {
					msgKey.setKeyValue("OldPlanOrder", key.getOldPlanOrder());
				}
				if(msgKeyType.containsKeyColumn("h_saveNewPlanOrder") && key.geth_saveNewPlanOrder() != null) {
					msgKey.setKeyValue("h_saveNewPlanOrder", key.geth_saveNewPlanOrder());
				}
				if(msgKeyType.containsKeyColumn("Difference") && key.getDifference() != null) {
					msgKey.setKeyValue("Difference", key.getDifference());
				}
				if(msgKeyType.containsKeyColumn("ValidStock") && key.getValidStock() != null) {
					msgKey.setKeyValue("ValidStock", key.getValidStock());
				}
				if(msgKeyType.containsKeyColumn("NewPlanOrder") && key.getNewPlanOrder() != null) {
					msgKey.setKeyValue("NewPlanOrder", key.getNewPlanOrder());
				}
				if(msgKeyType.containsKeyColumn("sub_PlanDate") && key.getsub_PlanDate() != null) {
					msgKey.setKeyValue("sub_PlanDate", key.getsub_PlanDate());
				}
				if(msgKeyType.containsKeyColumn("sub_PlanDate_TIME") && key.getsub_PlanDate_TIME() != null) {
					msgKey.setKeyValue("sub_PlanDate_TIME", key.getsub_PlanDate_TIME());
				}
				if(msgKeyType.containsKeyColumn("sub_NEW_PLAN_ORDER") && key.getsub_NEW_PLAN_ORDER() != null) {
					msgKey.setKeyValue("sub_NEW_PLAN_ORDER", key.getsub_NEW_PLAN_ORDER());
				}
				if(msgKeyType.containsKeyColumn("PlanDate_nonCoron") && key.getPlanDate_nonCoron() != null) {
					msgKey.setKeyValue("PlanDate_nonCoron", key.getPlanDate_nonCoron());
				}
				if(msgKeyType.containsKeyColumn("sub_PlanDate_TIME_h") && key.getsub_PlanDate_TIME_h() != null) {
					msgKey.setKeyValue("sub_PlanDate_TIME_h", key.getsub_PlanDate_TIME_h());
				}
				if(msgKeyType.containsKeyColumn("h_saveNewPlanOrder2") && key.geth_saveNewPlanOrder2() != null) {
					msgKey.setKeyValue("h_saveNewPlanOrder2", key.geth_saveNewPlanOrder2());
				}
				if(msgKeyType.containsKeyColumn("h_saveMUL_ODR_QTY") && key.geth_saveMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("h_saveMUL_ODR_QTY", key.geth_saveMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_BUSINESS_OPR_DATE") && key.gets_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("s_BUSINESS_OPR_DATE", key.gets_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE") && key.gets_MIN_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MIN_CAL_DATE", key.gets_MIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE") && key.gets_MAX_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MAX_CAL_DATE", key.gets_MAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_OD_NO") && key.gets_OD_NO() != null) {
					msgKey.setKeyValue("s_OD_NO", key.gets_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("s_PLAN_SPAN") && key.gets_PLAN_SPAN() != null) {
					msgKey.setKeyValue("s_PLAN_SPAN", key.gets_PLAN_SPAN());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_PLAN_PERIOD_TYP") && key.gets_PRD_PLAN_PERIOD_TYP() != null) {
					msgKey.setKeyValue("s_PRD_PLAN_PERIOD_TYP", key.gets_PRD_PLAN_PERIOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_PLAN_FINAL_DAY_TYP") && key.gets_PRD_PLAN_FINAL_DAY_TYP() != null) {
					msgKey.setKeyValue("s_PRD_PLAN_FINAL_DAY_TYP", key.gets_PRD_PLAN_FINAL_DAY_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_LT") && key.gets_ODR_LT() != null) {
					msgKey.setKeyValue("s_ODR_LT", key.gets_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("s_FIXED_LT") && key.gets_FIXED_LT() != null) {
					msgKey.setKeyValue("s_FIXED_LT", key.gets_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("s_PROP_LT") && key.gets_PROP_LT() != null) {
					msgKey.setKeyValue("s_PROP_LT", key.gets_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("s_SAFETY_LT") && key.gets_SAFETY_LT() != null) {
					msgKey.setKeyValue("s_SAFETY_LT", key.gets_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("s_ISSUE_LT") && key.gets_ISSUE_LT() != null) {
					msgKey.setKeyValue("s_ISSUE_LT", key.gets_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("s_PROP_LOT_SIZE") && key.gets_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("s_PROP_LOT_SIZE", key.gets_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("s_DUE_DATE") && key.gets_DUE_DATE() != null) {
					msgKey.setKeyValue("s_DUE_DATE", key.gets_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE") && key.gets_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("s_PRD_DUE_DATE", key.gets_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_START_DATE") && key.gets_PRD_START_DATE() != null) {
					msgKey.setKeyValue("s_PRD_START_DATE", key.gets_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_START_DATE") && key.gets_ODR_START_DATE() != null) {
					msgKey.setKeyValue("s_ODR_START_DATE", key.gets_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_QTY") && key.gets_ODR_QTY() != null) {
					msgKey.setKeyValue("s_ODR_QTY", key.gets_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_ISSUE_TYP") && key.gets_ISSUE_TYP() != null) {
					msgKey.setKeyValue("s_ISSUE_TYP", key.gets_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_MRP") && key.gets_MAX_DISPLAY_MONTH_MRP() != null) {
					msgKey.setKeyValue("s_MAX_DISPLAY_MONTH_MRP", key.gets_MAX_DISPLAY_MONTH_MRP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
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
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP") && key.getLOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP", key.getLOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("MAX_PERIOD") && key.getMAX_PERIOD() != null) {
					msgKey.setKeyValue("MAX_PERIOD", key.getMAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("MUL_ODR_QTY") && key.getMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("MUL_ODR_QTY", key.getMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MAX_ODR_QTY") && key.getMAX_ODR_QTY() != null) {
					msgKey.setKeyValue("MAX_ODR_QTY", key.getMAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MIN_ODR_QTY") && key.getMIN_ODR_QTY() != null) {
					msgKey.setKeyValue("MIN_ODR_QTY", key.getMIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("dummy") && key.getdummy() != null) {
					msgKey.setKeyValue("dummy", key.getdummy());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("TIME") && key.getTIME() != null) {
					msgKey.setKeyValue("TIME", key.getTIME());
				}
				if(msgKeyType.containsKeyColumn("s_PARENT_OD_NO") && key.gets_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("s_PARENT_OD_NO", key.gets_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("FIT_DATE") && key.getFIT_DATE() != null) {
					msgKey.setKeyValue("FIT_DATE", key.getFIT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
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
					AB0010010Struct key = new AB0010010Struct();
					if(msgKeyType.containsKeyColumn("w_date_from")) {
						key.setw_date_from(msgKey.getKeyValue("w_date_from"));
					}
					if(msgKeyType.containsKeyColumn("w_date_to")) {
						key.setw_date_to(msgKey.getKeyValue("w_date_to"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME")) {
						key.setUNIT_QTY_NAME(msgKey.getKeyValue("UNIT_QTY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_NAME")) {
						key.setLOT_SIZING_NAME(msgKey.getKeyValue("LOT_SIZING_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PlanDate")) {
						key.setPlanDate(msgKey.getKeyValue("PlanDate"));
					}
					if(msgKeyType.containsKeyColumn("FixDemand")) {
						key.setFixDemand(msgKey.getKeyValue("FixDemand"));
					}
					if(msgKeyType.containsKeyColumn("PlanDemand")) {
						key.setPlanDemand(msgKey.getKeyValue("PlanDemand"));
					}
					if(msgKeyType.containsKeyColumn("FixOrder")) {
						key.setFixOrder(msgKey.getKeyValue("FixOrder"));
					}
					if(msgKeyType.containsKeyColumn("OldPlanOrder")) {
						key.setOldPlanOrder(msgKey.getKeyValue("OldPlanOrder"));
					}
					if(msgKeyType.containsKeyColumn("h_saveNewPlanOrder")) {
						key.seth_saveNewPlanOrder(msgKey.getKeyValue("h_saveNewPlanOrder"));
					}
					if(msgKeyType.containsKeyColumn("Difference")) {
						key.setDifference(msgKey.getKeyValue("Difference"));
					}
					if(msgKeyType.containsKeyColumn("ValidStock")) {
						key.setValidStock(msgKey.getKeyValue("ValidStock"));
					}
					if(msgKeyType.containsKeyColumn("NewPlanOrder")) {
						key.setNewPlanOrder(msgKey.getKeyValue("NewPlanOrder"));
					}
					if(msgKeyType.containsKeyColumn("sub_PlanDate")) {
						key.setsub_PlanDate(msgKey.getKeyValue("sub_PlanDate"));
					}
					if(msgKeyType.containsKeyColumn("sub_PlanDate_TIME")) {
						key.setsub_PlanDate_TIME(msgKey.getKeyValue("sub_PlanDate_TIME"));
					}
					if(msgKeyType.containsKeyColumn("sub_NEW_PLAN_ORDER")) {
						key.setsub_NEW_PLAN_ORDER(msgKey.getKeyValue("sub_NEW_PLAN_ORDER"));
					}
					if(msgKeyType.containsKeyColumn("PlanDate_nonCoron")) {
						key.setPlanDate_nonCoron(msgKey.getKeyValue("PlanDate_nonCoron"));
					}
					if(msgKeyType.containsKeyColumn("sub_PlanDate_TIME_h")) {
						key.setsub_PlanDate_TIME_h(msgKey.getKeyValue("sub_PlanDate_TIME_h"));
					}
					if(msgKeyType.containsKeyColumn("h_saveNewPlanOrder2")) {
						key.seth_saveNewPlanOrder2(msgKey.getKeyValue("h_saveNewPlanOrder2"));
					}
					if(msgKeyType.containsKeyColumn("h_saveMUL_ODR_QTY")) {
						key.seth_saveMUL_ODR_QTY(msgKey.getKeyValue("h_saveMUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_BUSINESS_OPR_DATE")) {
						key.sets_BUSINESS_OPR_DATE(msgKey.getKeyValue("s_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE")) {
						key.sets_MIN_CAL_DATE(msgKey.getKeyValue("s_MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE")) {
						key.sets_MAX_CAL_DATE(msgKey.getKeyValue("s_MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_NO")) {
						key.sets_OD_NO(msgKey.getKeyValue("s_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_PLAN_SPAN")) {
						key.sets_PLAN_SPAN(msgKey.getKeyValue("s_PLAN_SPAN"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_PLAN_PERIOD_TYP")) {
						key.sets_PRD_PLAN_PERIOD_TYP(msgKey.getKeyValue("s_PRD_PLAN_PERIOD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_PLAN_FINAL_DAY_TYP")) {
						key.sets_PRD_PLAN_FINAL_DAY_TYP(msgKey.getKeyValue("s_PRD_PLAN_FINAL_DAY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_LT")) {
						key.sets_ODR_LT(msgKey.getKeyValue("s_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_FIXED_LT")) {
						key.sets_FIXED_LT(msgKey.getKeyValue("s_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_PROP_LT")) {
						key.sets_PROP_LT(msgKey.getKeyValue("s_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_SAFETY_LT")) {
						key.sets_SAFETY_LT(msgKey.getKeyValue("s_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_ISSUE_LT")) {
						key.sets_ISSUE_LT(msgKey.getKeyValue("s_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("s_PROP_LOT_SIZE")) {
						key.sets_PROP_LOT_SIZE(msgKey.getKeyValue("s_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("s_DUE_DATE")) {
						key.sets_DUE_DATE(msgKey.getKeyValue("s_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE")) {
						key.sets_PRD_DUE_DATE(msgKey.getKeyValue("s_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_START_DATE")) {
						key.sets_PRD_START_DATE(msgKey.getKeyValue("s_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_START_DATE")) {
						key.sets_ODR_START_DATE(msgKey.getKeyValue("s_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_QTY")) {
						key.sets_ODR_QTY(msgKey.getKeyValue("s_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_ISSUE_TYP")) {
						key.sets_ISSUE_TYP(msgKey.getKeyValue("s_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_MRP")) {
						key.sets_MAX_DISPLAY_MONTH_MRP(msgKey.getKeyValue("s_MAX_DISPLAY_MONTH_MRP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
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
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP")) {
						key.setLOT_SIZING_TYP(msgKey.getKeyValue("LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MAX_PERIOD")) {
						key.setMAX_PERIOD(msgKey.getKeyValue("MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("MUL_ODR_QTY")) {
						key.setMUL_ODR_QTY(msgKey.getKeyValue("MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MAX_ODR_QTY")) {
						key.setMAX_ODR_QTY(msgKey.getKeyValue("MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MIN_ODR_QTY")) {
						key.setMIN_ODR_QTY(msgKey.getKeyValue("MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("dummy")) {
						key.setdummy(msgKey.getKeyValue("dummy"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("TIME")) {
						key.setTIME(msgKey.getKeyValue("TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_PARENT_OD_NO")) {
						key.sets_PARENT_OD_NO(msgKey.getKeyValue("s_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("FIT_DATE")) {
						key.setFIT_DATE(msgKey.getKeyValue("FIT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
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
