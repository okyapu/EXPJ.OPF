/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0060/src/com/nec/jp/orteus/metamorBase/AC0060/AC0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0060;

import com.nec.jp.orteus.metamorBase.AC0060.*;
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
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
// 日付変換
import com.nec.jp.orteus.expj.util.Converter;
import java.text.ParseException;

import com.nec.jp.orteus.expj.util.*;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0060010Control
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
       
        public AC0060010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
       //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
        //-------------------------------------------------------------------------
       
        /**
         * メッセージ取得 
         * @return メッセージ
         */
        public MessageStruct getMessage(){return msgStruct;}
        /**
         * メッセージ設定
         * @param msg メッセージ
         */
        public void setMessage(MessageStruct msg){msgStruct = msg;}
       
        //------------------------------------------------------------------
        // ロケール(辞書文字列を取得するため)
        private String _locale = "";
        public void setLocale(String loc) { _locale = loc; }
       
        //------------------------------------------------------------------------------
        // SYS_TYPE_VALUE
       
        /** 品目手配区分 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
        /** 内外作区分 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
        /** 在庫数単位区分 */
        private ComboStruct _UNIT_QTY_TYP = new ComboStruct();
        /** ロットまとめ区分 */
        private ComboStruct _LOT_SIZING_TYP = new ComboStruct();
       
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param strTyp 区分コード
         * @return 区分名称。該当するデータがなかった場合は区分コードを返す
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         if(comboStruct == null || strTyp == null)  return null;
         String strTypName = strTyp;
         for(int i = 0; i < comboStruct.getValList().size(); i++){
          if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
           strTypName = (String)(comboStruct.getExplanList().get(i));
           break;
          }
         }
         if(strTypName == null) strTypName = strTyp;
         return strTypName;
        }
        /**
         * 品目情報のフラグの表示を設定
         * @param s フラグの値が設定されている情報
         */
        private void setTypeValueAboutItem(AC0060010Struct s)
        {
         s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
         s.setLOT_SIZING_NAME(getTypeName(_LOT_SIZING_TYP,s.getLOT_SIZING_TYP()));
        }
        //------------------------------------------------------------------------------
        /**
         * メイン画面用 デフォルト値設定
         * 設定先の情報をクリアした後 デフォルト値を設定する
         * @param s 設定先
         */
        private void setDefault4Main(AC0060010Struct s) throws ExpjException
        {
         s.setPLANT_CD(getsysPLANT_CD());
       
         // デフォルト生産計画期間取得設定
         setDefaultPeriodDate(s);
        }
        /**
         * サブ1画面用 デフォルト値設定
         * 設定先の情報をクリアせず デフォルト値を設定する
         * @param s 設定先
         */
        private void setDefault4Sub1(AC0060010Struct s)
        {
         s.setOD_TYP(AC0060Const.C_KIND_ODER);
         s.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_YES);
        }
       
        //------------------------------------------------------------------------------
        // SYS_PARAMETERから取得する内容
       
        /** 総所要量展開で展開する */
        private String _expectAllMrp = null;
        /** オーダ・デマンドを削除する */
        private String _expectDelete = null;
        /** EJa-ASPROVA連携オプション導入フラグ取得用 */
    	private String _SysInstallOptions_ASP = null;
        /**
         * SYS_PARAMETERから値取得
         */
        private void readParameter() throws SQLException, ExpjException
        {
         PrivateConfig pconfig = new PrivateConfig(conn);
         if((_expectAllMrp = pconfig.getString("EXTERN_EXPECT_ALL_MRP")) == null){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.EXTERN_EXPECT_ALL_MRP:" + _expectAllMrp );
          sysLog.severe(emsg, getsysUSER_CD());
          sysLog.severe(emsg_log, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
       
          throw ee;
         }
         if((_expectDelete = pconfig.getString("EXTERN_EXPECT_DELETE")) == null){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.EXTERN_EXPECT_DELETE:" + _expectDelete );
          sysLog.severe(emsg, getsysUSER_CD());
          sysLog.severe(emsg_log, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
       
          throw ee;
         }
        }
       
        //------------------------------------------------------------------------------
        /** 読込みキーとそのマスタ情報保持用 */
        private AC0060010Struct _baseInfomation = new AC0060010Struct();
       
        /** 編集中の外部計画番号(行修正→更新で使用 */
        private String _editingExtNo = null;
        /** 編集中のオーダ番号(行修正→更新で使用 */
        private String _editingOdNo = null;
       
        //------------------------------------------------------------------------------
        // 読込時処理
       
        /**
         * 読み込み時のマスタ系情報(品目/工場/在庫)取得＆チェック
         * @param s 入出力情報
         */
        //読込時チェックフラグの定義
        int Checkfg = 0;
        private boolean readMaster(AC0060010Struct s) throws SQLException, FoundationException
        {
         boolean existPlant = true, otherResult = true;
         boolean result = true;
         List wkList = null;
         Checkfg = 1;
       
         List listMessage = new ArrayList();
         String Message = "";
         
         // 工場読み込み
         wkList = entity.mM_PLANT.read(conn,struct);
         if(wkList.size() == 0){
          struct.clearAboutPlant();
          Message = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
          setErrorMessage("AC10001", Message);
          existPlant = false;
         }
         else{
          struct.importPlant((AC0060010Struct)(wkList.get(0)));
         }
       
         // 品目読み込み＆品目手配区分チェック
         wkList = entity.mM_ITEM.read(conn,struct);
         if(wkList.size() == 0){
          struct.clearAboutItem();
          Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
          setErrorMessage("AC10002", Message);
          otherResult = false;
         }
         else{
          struct.importItem((AC0060010Struct)(wkList.get(0)));
       
          // 品目情報のフラグの表示文字列設定
          setTypeValueAboutItem(struct);
       
          // 品目手配区分のチェック
          String odrTyp = struct.getMRP_ODR_TYP();
          if(AC0060Const.C_ODR_MANUAL.equals(odrTyp) == false
          && AC0060Const.C_ODR_LOT.equals(odrTyp) == false){
           Message = "M_ITEM.MRP_ODR_TYP:" + odrTyp;
           setErrorMessage("AC10025", Message);
           otherResult = false;
          }
         }
       
         // 保管区別品目在庫読み込み
         wkList = entity.mT_ITEM_STOCKbyPLANT.read(conn,struct);
         if(wkList.size() == 0){
          struct.clearAboutItemStockByPlant();
         }
         else{
          struct.importItemStockByPlant((AC0060010Struct)(wkList.get(0)));
         }
       
         DateConverter dc = new DateConverter();
         AC0060010Struct forDate = new AC0060010Struct();
         forDate.setPLANT_CD(struct.getPLANT_CD());
         forDate.setITEM_CD(struct.getITEM_CD());
         forDate.setw_DATE_FROM(dc.str2formal(struct.getw_DATE_FROM()));
         forDate.setw_DATE_TO(dc.str2formal(struct.getw_DATE_TO()));

         //---------DEL 20081208       
//         // 業務運用日＜＝計画期間(from)か?
//         if(existPlant){
//          DateCtrl dctrl = new DateCtrl(conn);
//          String oprDate = dctrl.getBusinessOprDate(struct.getPLANT_CD());
//          if(oprDate == null){
//           Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
//           setErrorMessage("AC10006", Message);
//           return false;
//          }
//          if(forDate.getw_DATE_FROM().compareTo(oprDate) < 0){
//           Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
//           setErrorMessage("AC10006", Message);
//           otherResult = false;
//          }
//         }

         // カレンダ読み込み＆計画期間(from)、計画期間(to)との妥当性チェック

         if(otherResult){
          wkList = entity.mM_CALRange1.read(conn,forDate);
          if(((AC0060010Struct)(wkList.get(0))).getMIN_CAL_DATE() != null &&
          	 ((AC0060010Struct)(wkList.get(0))).getMAX_CAL_DATE() != null){
          	 	if(((AC0060010Struct)(wkList.get(0))).getMIN_CAL_DATE().compareTo(forDate.getw_DATE_FROM()) > 0
          		|| ((AC0060010Struct)(wkList.get(0))).getMAX_CAL_DATE().compareTo(forDate.getw_DATE_TO()) < 0){
          			listMessage.add("M_ITEM.ITEM_CD:" + forDate.getITEM_CD());
          			listMessage.add("M_ITEM.CAL_DATE:" +  forDate.getw_DATE_FROM() + " - " + forDate.getw_DATE_TO());
          			setErrorMessage("AC10005", listMessage);
          			return false;
          		}
          	 }else{
          	 	Checkfg = 0;
          	 }
         }
        	
        if(Checkfg ==0){
        	if(existPlant){
        		wkList = entity.mM_CALRange.read(conn,forDate);
        		if(wkList.size() == 0){
        			Message = "M_PLANT.PLANT_CD:" + forDate.getPLANT_CD();
        			setErrorMessage("AC10005", Message);
        			return false;
        		}
        		if(((AC0060010Struct)(wkList.get(0))).getMIN_CAL_DATE().compareTo(forDate.getw_DATE_FROM()) > 0
        		|| ((AC0060010Struct)(wkList.get(0))).getMAX_CAL_DATE().compareTo(forDate.getw_DATE_TO()) < 0){
        	   listMessage.add("M_PLANT.PLANT_CD:" + forDate.getPLANT_CD());
        	   listMessage.add("M_PLANT.CAL_DATE:" +  forDate.getw_DATE_FROM() + " - " + forDate.getw_DATE_TO());
        	   setErrorMessage("AC10005", listMessage);
        	   return false;
        		}
        	}
        }
         return otherResult && existPlant;
        }
        /**
         * 所要量/有効在庫の読み込み
         * @param s 読み込みのための情報
         * @param targets 設定するリスト(AC0060010Structのリスト)
         */
        private boolean readTransaction(AC0060010Struct s, List targets) throws FoundationException, SQLException, ExpjException
        {
         //------------------------------------------------------------------
         // 有効在庫計算
         // MRPデータ算出に必要な情報を設定
         String Message = "";
         DateConverter dc = new DateConverter();
         
         //20090617 MOD START
	      MrpManager mrpManager = new MrpManager();      
          ATMrpManager atmrpManager = new ATMrpManager();		
		 // EJa-ASPROVA連携オプション導入の場合
		 if("1".equals(_SysInstallOptions_ASP)){	
			 atmrpManager.setConnection(conn);
			 atmrpManager.setItemCode(s.getITEM_CD());
			 atmrpManager.setPlantCode(s.getPLANT_CD());
	         atmrpManager.setFrom(dc.str2formal(s.getw_DATE_FROM()));
	         atmrpManager.setTo(dc.str2formal(s.getw_DATE_TO()));
	         atmrpManager.setfg(Checkfg);
	         if(atmrpManager.execute(s.getSTOCK_ON_HAND_QTY(),s.getITEM_SPOIL(),s.getw_DATE_FROM()) == false){ //CHG 20081208
	          sysLog.finest_d("* Calculation of effective stock went wrong", struct.getsUser_ID());
	          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
	          sysLog.severe(emsg, getsysUSER_CD());
	          ExpjException ee = new ExpjException(emsg);          
	          throw ee;
	         }	
		 }else{
	         mrpManager.setConnection(conn);
	         mrpManager.setItemCode(s.getITEM_CD());
	         mrpManager.setPlantCode(s.getPLANT_CD());
	         mrpManager.setFrom(dc.str2formal(s.getw_DATE_FROM()));
	         mrpManager.setTo(dc.str2formal(s.getw_DATE_TO()));
	         mrpManager.setfg(Checkfg);
	         if(mrpManager.execute(s.getSTOCK_ON_HAND_QTY(),s.getITEM_SPOIL(),s.getw_DATE_FROM()) == false){ //CHG 20081208
	          sysLog.finest_d("* Calculation of effective stock went wrong", struct.getsUser_ID());
	          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
	          sysLog.severe(emsg, getsysUSER_CD());
	          ExpjException ee = new ExpjException(emsg);
	          
	          throw ee;
	         }
		 }
         //20090617 MOD END
	      
         //------------------------------------------------------------------
         // 所要量読み込み
         AC0060010Struct wkStruct = new AC0060010Struct();
         wkStruct.copy(s);
         wkStruct.setw_DATE_FROM(dc.str2formal(s.getw_DATE_FROM()));
         wkStruct.setw_DATE_TO(dc.str2formal(s.getw_DATE_TO()));
       
         // 所要量読み込み:外部デマンド
         List dmdList = null;
         wkStruct.setODR_STS_TYP(null);
         wkStruct.setDM_STS_TYP(AC0060Const.C_DM_STS_PLAN);
         wkStruct.setOD_TYP(AC0060Const.C_KIND_DMD);
         dmdList = entity.mT_OD.read(conn,wkStruct);
         if(dmdList == null){
          sysLog.finest_d("* External order reading failure", struct.getsUser_ID());
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
         for(int n = 0; n < dmdList.size(); n++){
          AC0060010Struct current = (AC0060010Struct)(dmdList.get(n));
          prepareOd(current);
         }
       
         // 所要量読み込み:外部オーダ
         List odList = null;
         wkStruct.setODR_STS_TYP(AC0060Const.C_ODR_STS_PLAN);
         wkStruct.setDM_STS_TYP(null);
         wkStruct.setOD_TYP(AC0060Const.C_KIND_ODER);
         odList = entity.mT_OD.read(conn,wkStruct);
         if(odList == null){
          sysLog.finest_d("* External order reading failure", struct.getsUser_ID());
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
         for(int n = 0; n < odList.size(); n++){
          AC0060010Struct current = (AC0060010Struct)(odList.get(n));
          prepareOd(current);
         }
       
         // 画面表示に使用するデータ設定
         int n, m = 0, i = 0;
         boolean existExtern;
         AC0060010Struct dataByDay = null, dmd = null, od = null;

         //20090617 MOD START
		 // EJa-ASPROVA連携オプション導入の場合
		 if("1".equals(_SysInstallOptions_ASP)){		 
	         // 過去
	         dataByDay = new AC0060010Struct();
	         dataByDay.importPastStock(atmrpManager.getPast(),_locale);
	         targets.add(dataByDay);
	       
			//日付書式用
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
	         // 各日＋外部オーダ・デマンド分
	         for(n = 0; n < atmrpManager.size(); n++){
	          existExtern = false;
	          dataByDay = new AC0060010Struct();
	          dataByDay.importMrpData(atmrpManager.getData(n));
	          String nowDay = dtf.getDatePart(dataByDay.getPlanDate());
	          Integer nowHOLIDAY_FLG = dataByDay.getHOLIDAY_FLG();
	          for(; m < dmdList.size(); m++){
	           dmd = (AC0060010Struct)(dmdList.get(m));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(dmd.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* DEMAND(" + m + ") " + dmd.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(dmd);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          for(; i < odList.size() ; i++){
	           od = (AC0060010Struct)(odList.get(i));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(od.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* ORDER  (" + i + ") " + od.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(od);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          if(existExtern == false)  targets.add(dataByDay);
	         }
	     // ASPROVA連携オプション導入なしの場合
		 }else{
	         // 過去
	         dataByDay = new AC0060010Struct();
	         dataByDay.importPastStock(mrpManager.getPast(),_locale);
	         targets.add(dataByDay);
	       
			//日付書式用
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
	         // 各日＋外部オーダ・デマンド分
	         for(n = 0; n < mrpManager.size(); n++){
	          existExtern = false;
	          dataByDay = new AC0060010Struct();
	          dataByDay.importMrpData(mrpManager.getData(n));
	          String nowDay = dtf.getDatePart(dataByDay.getPlanDate());
	          Integer nowHOLIDAY_FLG = dataByDay.getHOLIDAY_FLG();
	          for(; m < dmdList.size(); m++){
	           dmd = (AC0060010Struct)(dmdList.get(m));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(dmd.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* DEMAND(" + m + ") " + dmd.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(dmd);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          for(; i < odList.size() ; i++){
	           od = (AC0060010Struct)(odList.get(i));
	           if(dtf.getDatePart(dataByDay.getPlanDate()).compareTo(dtf.getDatePart(od.getPlanDate())) < 0)  break;
	           sysLog.finest_d("* ORDER  (" + i + ") " + od.toString(),struct.getsUser_ID());
	           dataByDay.importExternData(od);
	           targets.add(dataByDay);
	           dataByDay = new AC0060010Struct();
	           dataByDay.setPlanDate(nowDay);
	           dataByDay.setHOLIDAY_FLG(nowHOLIDAY_FLG);
	           existExtern = true;
	          }
	          if(existExtern == false)  targets.add(dataByDay);
	         }			 
		 }
		//20090617 MOD END        
         
         // 画面表示用フィールドにデータ設定
         for(n = 0; n < targets.size(); n++){
          AC0060010Struct record = (AC0060010Struct)((targets.get(n)));
          String currentOdType = record.getOD_TYP();
          // デマンドのとき 表示用デマンド数量に設定
          if(AC0060Const.C_KIND_DMD.equals(currentOdType)){
           record.setdispDM_QTY(record.getDM_QTY());
          }
          // オーダのとき 表示用オーダ数量に設定
          if(AC0060Const.C_KIND_ODER.equals(currentOdType)){
           record.setdispODR_QTY(record.getODR_QTY());
          }
         }
         return true;
        }
        /** 同一外部計画の所要量でオーダ発効済みがないか確認 */
        private AC0060OdRelease _checkOd = new AC0060OdRelease();
       
        /**
         * 所要量/外部計画の状態により画面表示用情報を設定
         * _checkOdの初期化が済んでいること。
         */
        private void prepareOd(AC0060010Struct s) throws SQLException
        {
         // 編集可/不可判定
         if(s.getOD_TYP() == null){
          s.setIsReleased(AC0060Const.C_RELEASE_YET); // タイプ未設定時は編集不可
         }else{
          // オーダのとき 同一外部計画番号の所要量にオーダ発効済みがあれば編集不可
          if(AC0060Const.C_KIND_ODER.equals(s.getOD_TYP())){
           if(_checkOd.isReleased(s.getEXTERNAL_PLAN_CD()) == false){
            s.setIsReleased(AC0060Const.C_RELEASE_YET);
           }else{
            s.setIsReleased(AC0060Const.C_RELEASE_DONE);
           }
          }
          // デマンドのとき 親オーダ番号設定済みなら編集不可
          else{
           if(s.getPARENT_OD_NO() == null || s.getPARENT_OD_NO().equals("")){
            s.setIsReleased(AC0060Const.C_RELEASE_YET);
           }else{
            s.setIsReleased(AC0060Const.C_RELEASE_DONE);
           }
          }
         }
         // 予定文字列設定
         s.setExpect(null);
         s.setLowerDeploy(AC0060Const.C_CHECK_NO);
         if(s.getOD_TYP() != null && AC0060Const.C_KIND_ODER.equals(s.getOD_TYP())){ // オーダのとき
          // 外部計画処理区分=2(変更)&&外部計画削除フラグ=1(削除)の場合
          if((s.getEXTERNAL_PLAN_EXP_TYP() != null && AC0060Const.C_EXT_EXP_CHANGE.equals(s.getEXTERNAL_PLAN_EXP_TYP()))
          && (s.getEXTERNAL_PLAN_DEL_FLG() != null && AC0060Const.C_EXT_DEL_YES.equals(s.getEXTERNAL_PLAN_DEL_FLG()))){
           s.setLowerDeploy(AC0060Const.C_CHECK_NO);
           if(s.getExpect() != null){
            s.setExpect(new String(s.getExpect() + " " + _expectDelete));
           }else{
            s.setExpect(_expectDelete);
           }
          }
          // 外部デマンドフラグ=1(外部)&&所要量処理区分=9(済み)の場合
          else if((s.getEXTERNAL_DM_FLG() != null && AC0060Const.C_EXT_DM_YES.equals(s.getEXTERNAL_DM_FLG()))
          && (s.getMRP_TYP() != null && AC0060Const.C_MRP_DONE.equals(s.getMRP_TYP()))){
           s.setLowerDeploy(AC0060Const.C_CHECK_YES);
           if(s.getExpect() != null){
            s.setExpect(new String(s.getExpect() + " " + _expectAllMrp));
           }else{
            s.setExpect(_expectAllMrp);
           }
          }
         }
        }
        //------------------------------------------------------------------------------
       
        /**
         * リスト中から該当オーダ番号の情報をコピー
         * @param infos 日ごとのオーダデマンド情報
         * @param extNo 探す外部計画番号
         * @param out 街頭オーダの情報を設定する領域
         * @return true:該当オーダの情報があった / false:該当オーダの情報なし
         */
        private boolean list2struct(List infos, String extNo, String odNo, AC0060010Struct out)
        {
         int n;
         for(n = 0; n < infos.size(); n++){
          AC0060010Struct current = (AC0060010Struct)(infos.get(n));
          String currentExtNo = current.getEXTERNAL_PLAN_CD();
          String currentOdNo = current.getOD_NO();
          if(currentExtNo != null && currentOdNo != null
          && currentExtNo.equals(extNo) && currentOdNo.equals(odNo)){
           out.setStructM(current);
           return true;
          }
         }
       
         return false;
        }
       
        //------------------------------------------------------------------------------
        // 登録/更新時共通処理
       
        /**
         * 登録/更新時 画面の情報・基準情報を元に 所要量/外部計画に登録or更新する情報を設定
         * キー(オーダデマンド番号, 外部計画番号)の設定は行わない
         * @param in 画面の情報
         * @param target 情報の設定先
         * @return true:成功 / false:何らかの処理に失敗(メッセージ設定済み)
         */
        private boolean setOdExternInfomation(AC0060010Struct in, AC0060010Struct target) throws ExpjException, ParseException
        {
         // 共通設定 ----------
         // 工場/品目/ユーザ/時刻
         target.setPLANT_CD(_baseInfomation.getPLANT_CD());
         target.importItem(_baseInfomation);
         target.copySystemData(struct);
         target.setPlanDate(in.getPlanDate()); // 日付計算用
       
         // 製造納期
         DateConverter dc = new DateConverter();
         Date dueDate = dc.str2date(in.getPlanDate());
         if(dueDate == null){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(emsg);
          
          throw ee;
         }
       
         // 稼働日判定
         if(isWorkDate(in,dueDate) == false) return false;
       
         // 製造納期を設定
         target.setPRD_DUE_DATE(dueDate);
       
         // オーダデマンド区分
         target.setOD_TYP(in.getOD_TYP());
       
         // オーダのとき ------
         if(AC0060Const.C_KIND_ODER.equals(in.getOD_TYP())){
          target.setODR_QTY(in.getODR_QTY()); // オーダ数量
       
          Date wkDate = null;
          // 製造着手日
          if((wkDate = calcPrdStartDate(target)) == null)  return false;
          target.setPRD_START_DATE(wkDate);

          // 自動算出された日付を文字型に変換して保持する
          String tempPrdStartDate = Converter.dateToStr(target.getPRD_START_DATE(), "yyyy/MM/dd");
       
          // 手配着手日
          if((wkDate = calcOdrStartDate(target)) == null)  return false;
          target.setODR_START_DATE(wkDate);
       
          // 自動算出された日付を文字型に変換して保持する
          String tempOdrStartDate = Converter.dateToStr(target.getODR_START_DATE(), "yyyy/MM/dd");
       
          target.setODR_STS_TYP(AC0060Const.C_ODR_STS_PLAN);
          target.setDM_STS_TYP(AC0060Const.C_DM_STS_NONE);
          target.setDM_QTY("0");
          // 下位部品を展開する
          if(in.getLowerDeploy() == null || AC0060Const.C_CHECK_NO.equals(in.getLowerDeploy())){
           target.setMRP_TYP(AC0060Const.C_MRP_ADD);
           target.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_NO);
          }else{ // しない
           target.setMRP_TYP(AC0060Const.C_MRP_DONE);
           target.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_YES);
          }

          // 製造納期を再設定
          if((in.getPlanTime()).length() == 3 ){
              //３桁は頭に０を付ける
              in.setPlanTime("0" + in.getPlanTime());
          }
          if(null != in.getPlanDate() || !(in.getPlanDate()).equals("")){
	          if(null != in.getPlanTime() || !(in.getPlanTime()).equals("")){
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate() + " " + in.getPlanTime());
                  target.setPRD_START_DATE_ALL(tempPrdStartDate + " " + in.getPlanTime());
                  target.setODR_START_DATE_ALL(tempOdrStartDate + " " + in.getPlanTime());
              }else{
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate());
                  target.setPRD_START_DATE_ALL(tempPrdStartDate);
                  target.setODR_START_DATE_ALL(tempOdrStartDate);
              }
          }else{
              target.setPRD_DUE_DATE_ALL("");
              target.setPRD_START_DATE_ALL("");
              target.setODR_START_DATE_ALL("");
          }

         }
         // デマンドのとき ----
         else{
          target.setODR_STS_TYP(AC0060Const.C_ODR_STS_NONE);
          target.setDM_STS_TYP(AC0060Const.C_DM_STS_PLAN);

          // 製造納期を再設定
          if((in.getPlanTime()).length() == 3 ){
              //３桁は頭に０を付ける
              in.setPlanTime("0" + in.getPlanTime());
          }
          if(null != in.getPlanDate() || !(in.getPlanDate()).equals("")){
	          if(null != in.getPlanTime() || !(in.getPlanTime()).equals("")){
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate() + " " + in.getPlanTime());
              }else{
                  target.setPRD_DUE_DATE_ALL(in.getPlanDate());
              }
          }else{
              target.setPRD_DUE_DATE_ALL("");
          }

          // 製造納期を再設定
          if((in.getPlanTime()).length() == 3 ){
              //３桁は頭に０を付ける
              in.setPlanTime("0" + in.getPlanTime());
          }
          if(null != in.getPlanDate() || !(in.getPlanDate()).equals("")){
	          if(null != in.getPlanTime() || !(in.getPlanTime()).equals("")){
                  target.setDUE_DATE_ALL(in.getPlanDate() + " " + in.getPlanTime());
              }else{
                  target.setDUE_DATE_ALL(in.getPlanDate());
              }
          }else{
              target.setDUE_DATE_ALL("");
          }

          target.setDM_QTY(in.getDM_QTY()); // デマンド数量
          target.setODR_QTY("0");
          target.setMRP_TYP(AC0060Const.C_MRP_ADD);
          target.setEXTERNAL_DM_FLG(AC0060Const.C_EXT_DM_YES);

         }
         return true;
        }
        /**
         * 製造着手日計算<br>
         * 納期-(品目固定LT+切り上げ(オーダ数/比例ロットサイズ)*品目比例LT+安全日数)
         * 品目情報は _baseInformationを使用して算出
         * @param info 納期・オーダ数量が設定されている情報
         * @return 製造着手日 / 算出失敗時 null
         */
        private Date calcPrdStartDate(AC0060010Struct info)
        {
         String Message = "";
         
         try {
          WorkDay workday;
          workday = new WorkDay(struct.getsUser_ID(),sp.getProcId(),struct.getPLANT_CD(),struct.getITEM_CD(),null);
          DateConverter dc = new DateConverter();
        
          String lotSize = _baseInfomation.getPROP_LOT_SIZE();
          String fixedLt = _baseInfomation.getFIXED_LT();
          String propLt = _baseInfomation.getPROP_LT();
          String strNewPlanOrder = info.getODR_QTY();
          String safetyLt = _baseInfomation.getSAFETY_LT();
        
          String lots = Calculate.divide(info.getODR_QTY(),lotSize,0,Calculate._CEIL); // ロット数
          String propLtByLot = Calculate.multiply(lots,propLt); // 比例リードタイム×ロット数
          String productLt = Calculate.add(Calculate.add(fixedLt,propLtByLot),safetyLt); // 固定リードタイム＋比例分のリードタイム＋安全日数
       
          sysLog.finest_d("* ODR_QTY: " + info.getODR_QTY() + " / " + lotSize + " = " + lots, struct.getsUser_ID());
          sysLog.finest_d("* PROP_LT:" + propLt + " * " + lots + " = " + propLtByLot, struct.getsUser_ID());
          sysLog.finest_d("* FIXED_LT:" + fixedLt, struct.getsUser_ID());
          sysLog.finest_d("* SAFETY_LT:" + safetyLt, struct.getsUser_ID());
          sysLog.finest_d("* ODR_START_DATE:" + info.getPlanDate() + " - " + productLt, struct.getsUser_ID());
       
          Date prdStartDate = workday.calcDate(dc.str2date(info.getPlanDate()),- Integer.parseInt(productLt) ,false);
          if(prdStartDate == null){
           Message = "TIME FOR DELIVERY:" + info.getPlanDate() + "-" + productLt;
           setErrorMessageNoKey("AC10030", Message);
           return null;
          }
          sysLog.finest_d("* → " + prdStartDate, struct.getsUser_ID());
          return new Date(prdStartDate.getTime());
         }
         catch (FoundationException e) {
          e.printStackTrace();
          ExpjMessage emsg = new ExpjMessage( "AC10030" );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return null;
         }
        }
        /**
         * 手配着手日の計算<br>
         * 製造着手日-品目手配LT
         * 品目情報は _baseInformationを使用して算出
         * @param oprDate 業務運用日
         * @param info 品目情報と製造着手日が設定されている情報
         * @return 手配着手日 / 算出失敗時 null
         */
        private Date calcOdrStartDate(AC0060010Struct info)
        {
         String Message = "";
         
         try{
          WorkDay workday = new WorkDay(struct.getsUser_ID(), sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), null);
          Date prdStartDate = info.getPRD_START_DATE();
       
          Date odrStartDate = workday.calcDate(prdStartDate,- Integer.parseInt(_baseInfomation.getODR_LT()),false);
          if(odrStartDate == null){
           Message = "ARRANGEMENTS START DAY:" + prdStartDate + "-" + _baseInfomation.getODR_LT();
           setErrorMessageNoKey("AC10030", Message);
           return null;
          }
       
          return new Date(odrStartDate.getTime());
         }
         catch (FoundationException e) {
          e.printStackTrace();
          ExpjMessage emsg = new ExpjMessage( "AC10030" );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return null;
         }
        }
        /**
         * 非稼働日の判定<br>
         * @param info 納期・工場コードが設定されている情報
         * @param dueDate 稼働日判定する日付
         * @return true:稼働日 / false:非稼働日、もしくは何らかの処理に失敗
         */
        private boolean isWorkDate(AC0060010Struct info, Date dueDate)
        {
         String Message = "";
         
         try
         {
       
          boolean bWorkDay = false;	// true:稼働日 / false:非稼働日
          WorkDay wd = new WorkDay(struct.getsUser_ID(), sp.getProcId(), info.getPLANT_CD(),struct.getITEM_CD(), null);
          bWorkDay = wd.isWorkDate(dueDate);
          if(bWorkDay != true)
          {
           // 非稼働日の場合
           Message = "TIME FOR DELIVERY:" + info.getPlanDate();
           setErrorMessageNoKey("AC10036", Message);
           return false;
          }
          return true;
         }
         catch(FoundationException fe)
         {
          fe.printStackTrace();
          // 稼働日判定でエラー
          ExpjMessage emsg = new ExpjMessage( "AC10036" );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return false;
         }
        }
       
        /*
         * デフォルト生産計画期間日付取得設定
         *
         * @return	なし
         */
        private void setDefaultPeriodDate(AC0060010Struct s) throws ExpjException
        {
               // 業務運用日の取得
         Date dateBusinessOprDate = null;
               try
               {
          DateConverter dc = new DateConverter();
          DateCtrl dctrl = new DateCtrl(conn);
          String streBusinessOprDate = dctrl.getBusinessOprDate(getsysPLANT_CD());
          dateBusinessOprDate = dc.str2date(streBusinessOprDate);
                
          // デフォルト生産計画期間日付取得
          String strDefDate[] = {"", ""};
          boolean bResult = false;
                
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
                
          if(bResult == true)
          {
           // 取得成功
           s.setw_DATE_FROM(strDefDate[0]);
           s.setw_DATE_TO(strDefDate[1]);
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
          setSqlExceptionMsg(se);
         }
       
       
        }
       
       //-------------------------------------------------------------------------
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
         * エラーメッセージ設定(キー出力なし)
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setErrorMessageNoKey(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
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
       
       //-------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                try {
                 setReadStatus(INITIAL);
                 _baseInfomation.clear();
                 if(list == null){
                  list = new ArrayList(0);
                 }else{
                  list.clear();
                 }
                 // マスタ情報読み込み
                 if(readMaster(struct) == false)  return;
              
                 // 所要量読み込み
                 _checkOd.initialize(conn.getConn());
                 if(readTransaction(struct,list) == false)  return;
              
                 _baseInfomation.copy(struct); // 情報の退避
                 setReadStatus(NORMAL);
              
                }
                catch(SQLException e) {
                    setSqlExceptionMsg(e);
              
                }
                finally{
                 _checkOd.finalize();
                }
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
              
			try {
                struct.importItem(_baseInfomation);
                setDefault4Sub1(struct);
              
				// システムパラメータ（TIME_CTRL）取得
				AC0060010Struct TIME_CTRLStruct = new AC0060010Struct();
				List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					TIME_CTRLStruct = (AC0060010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				}else{
					struct.setTIME_CTRL("false");
				}

			} catch (SQLException e) {
				throw new ExpjException(e);
			}
                //}}user_implement_dev:<controlappend>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                 
			try {
                struct.importItem(_baseInfomation);
                _editingOdNo = new String(struct.getOD_NO());
                _editingExtNo = new String(struct.getEXTERNAL_PLAN_CD());
              
				// システムパラメータ（TIME_CTRL）取得
				AC0060010Struct TIME_CTRLStruct = new AC0060010Struct();
				List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					TIME_CTRLStruct = (AC0060010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				}else{
					struct.setTIME_CTRL("false");
				}
              
				// 製造納期（時刻）取得
				AC0060010Struct GET_TIME_Struct = new AC0060010Struct();
				GET_TIME_Struct.setTIME_GET_OD_NO(_editingOdNo);
				List TIME_GET_List = entity.mSELECT_T_OD_TIME_GET.read(conn, GET_TIME_Struct);
				if(null != TIME_GET_List && TIME_GET_List.size()>0){
					GET_TIME_Struct = (AC0060010Struct)TIME_GET_List.get(0);
					struct.setPlanTime(GET_TIME_Struct.getPRD_DUE_TIME());
				}else{
					struct.setPlanTime(null);
				}
              
	            //時刻管理しないときは時刻を表示しない
	            if((struct.getTIME_CTRL()).equals("false")){
	                struct.setPlanTime("");
	            }

			} catch (SQLException e) {
				throw new ExpjException(e);
			}
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
              
                struct.initialize();
                setReadStatus(INITIAL);
                if(list != null)  list.clear();
                setDefault4Main(struct);
                _editingOdNo = null;
                _editingExtNo = null;
                try{
	                // インストールオプションテーブルよりEJa-ASPROVA連携オプション導入フラグを取得
	                List SysInstallOptASP = entity.mSYS_INSTALL_OPTIONS_ASP.read(conn,struct);
	                if(SysInstallOptASP == null || SysInstallOptASP.size() <=0){
	                	struct.setASP_INSTALL_FLG(null);
	                }else{
	                	struct.setASP_INSTALL_FLG(((AC0060010Struct)SysInstallOptASP.get(0)).getASP_INSTALL_FLG());
	                }
	                _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
                }catch(SQLException e){
					e.printStackTrace();
					throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                 
                String Message = "";
                 
                try{
                 AC0060010Struct target = new AC0060010Struct();
              
              if((struct.getPlanTime()).length() == 0 && (struct.getTIME_CTRL()).equals("true") ){
				struct.setPlanTime("2359");
			}
              
                 // 画面情報・基準情報をもとに情報設定
                 if(setOdExternInfomation(struct,target) == false)  return;
              
                 // オーダデマンド番号採番
                 CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), sp.getProcId(), struct.getPLANT_CD());
                 String odNo = collect.getNo();
                 if(odNo == null){
                  Message = "T_OD.OD_NO:" + odNo;
                  setErrorMessage("AC10027", Message);
                  return;
                 }
                 target.setOD_NO(odNo);
              
                 // 外部計画番号採番
                 collect = new CollectNumber(CollectNumber.EXTERNAL_PLAN_CD, struct.getsUser_ID(), sp.getProcId(), struct.getPLANT_CD());
                 String extNo = collect.getNo();
                 if(extNo == null){
                  Message = "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + odNo;
                  setErrorMessage("AC10028", Message);
                  return;
                 }
                 target.setEXTERNAL_PLAN_CD(extNo);
              
                 conn.beginTransWeb();

                 entity.mT_OD.create(conn,target); 
                 entity.mT_EXTERNAL_PLAN.create(conn,target);
                 if(entity.mSYS_OD_CALC_CTRL.update(conn,struct) == 0){
                  Message = "SYS_OD_CALC_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  setErrorMessage("AC00035", Message);
                  conn.rollback();
                  return;
                 }
              
                 conn.commit();
              
                 controlselect();
                }
                catch(Exception e){
//                 setSqlExceptionMsg(e);
					e.printStackTrace();
					throw new ExpjException(e);
              
                }
                finally{
                 conn.rollback();
                }
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                 
                List listMessage = new ArrayList();
                String Message = "";
              
                try{
                 // 元のレコードが更新されていないか?
                 AC0060010Struct target = new AC0060010Struct();
                 if(list2struct(list,_editingExtNo,_editingOdNo,target) == false){
                  sysLog.finest_d("* The contents of a list, and mismatching", struct.getsUser_ID());
                  
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
                 target.copySystemData(struct);
              
                 AC0060010Struct work = new AC0060010Struct();
                 work.setOD_NO(_editingOdNo);
                 work.setEXTERNAL_PLAN_CD(_editingExtNo);
              
                 conn.beginTransWeb();
              
                 List wkOds = entity.mT_OD4Update.read(conn,work);
                 if(wkOds.size() == 0){
                  listMessage.add("T_OD.OD_NO:" + _editingOdNo);
                  listMessage.add("T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + _editingExtNo);
                  setErrorMessage("ZZ01105", listMessage);
                  return;
                 }
                 AC0060010Struct forCount = (AC0060010Struct)(wkOds.get(0));
                 if(target.getOD_MODIFY_COUNT().equals(forCount.getOD_MODIFY_COUNT()) == false
                 || target.getEXT_MODIFY_COUNT().equals(forCount.getEXT_MODIFY_COUNT()) == false){
                  listMessage.add("T_OD.OD_NO:" + _editingOdNo);
                  listMessage.add("T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + _editingExtNo);
                  setErrorMessage("ZZ01105", listMessage);
                  return;
                 }
              
                 if(entity.mSYS_OD_CALC_CTRL.update(conn,struct) == 0){
                  Message = "SYS_OD_CALC_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                  setErrorMessage("AC00035", Message);
                  conn.rollback();
                  return;
                 }
              
                 // 削除する のとき
                 if(AC0060Const.C_EXT_DEL_YES.equals(struct.getEXTERNAL_PLAN_DEL_FLG())){
              
                  // 前回登録時が 総所要量展開で展開する 以外だとT_ODを削除する
                  if((AC0060Const.C_KIND_ODER.equals(struct.getOD_TYP()) &&
                     AC0060Const.C_EXT_DM_YES.equals(struct.getEXTERNAL_DM_FLG())) == false){
                   entity.mT_OD.delete(conn,target);
                  }
              
                  target.setEXTERNAL_PLAN_EXP_TYP(AC0060Const.C_EXT_EXP_CHANGE);
                  target.setEXTERNAL_PLAN_DEL_FLG(AC0060Const.C_EXT_DEL_YES);
                  entity.mT_EXTERNAL_PLAN.update(conn,target);
                  conn.commit();
                  controlselect();
                  return;
                 }
                 // ここからは 更新時処理
              
                 // 共通設定
                 target.setEXTERNAL_PLAN_DEL_FLG(struct.getEXTERNAL_PLAN_DEL_FLG());
              
                 // 値設定
                 if(setOdExternInfomation(struct,target) == false)  return;
              
                 entity.mT_OD.update(conn,target);
                 entity.mT_EXTERNAL_PLAN.update(conn,target);
                 conn.commit();
              
                 controlselect();
                }
                catch(Exception e){
//                 setSqlExceptionMsg(e);
					e.printStackTrace();
					throw new ExpjException(e);
                }
                finally{
                 conn.rollback();
                }
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
                controlselect();
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
              
                 // コンボボックスデータ用意
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
                 _UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
                 _LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");
              
                 // SYS_PARAMETERからの値取得
                 readParameter();
              
                 controlclear();
                }
                catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
                catch(ComboException e){
                  // エラーメッセージ作成
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(e, emsg);
                  
                  throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0060");
		logger.entering("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AC0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("Detail") ) {
				controlDetail();
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
//			throw new FoundationException("AC0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0060010-E999","CSVの出力処理"));
			throw new FoundationException("AC0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0060010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0060010Entity entity;
	protected AC0060010Struct struct;
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

		entity = new AC0060010Entity();
		struct = new AC0060010Struct();

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
	 * AC0060010クラスの標準コンストラクタ
	 */
	public AC0060010Control() throws BusinessProcessException, FoundationException
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
				AC0060010Struct key = (AC0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
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
				if(msgKeyType.containsKeyColumn("PlanDemand") && key.getPlanDemand() != null) {
					msgKey.setKeyValue("PlanDemand", key.getPlanDemand());
				}
				if(msgKeyType.containsKeyColumn("FixedDemand") && key.getFixedDemand() != null) {
					msgKey.setKeyValue("FixedDemand", key.getFixedDemand());
				}
				if(msgKeyType.containsKeyColumn("PlanOrder") && key.getPlanOrder() != null) {
					msgKey.setKeyValue("PlanOrder", key.getPlanOrder());
				}
				if(msgKeyType.containsKeyColumn("FixedOrder") && key.getFixedOrder() != null) {
					msgKey.setKeyValue("FixedOrder", key.getFixedOrder());
				}
				if(msgKeyType.containsKeyColumn("ValidStock") && key.getValidStock() != null) {
					msgKey.setKeyValue("ValidStock", key.getValidStock());
				}
				if(msgKeyType.containsKeyColumn("LowerDeploy") && key.getLowerDeploy() != null) {
					msgKey.setKeyValue("LowerDeploy", key.getLowerDeploy());
				}
				if(msgKeyType.containsKeyColumn("Expect") && key.getExpect() != null) {
					msgKey.setKeyValue("Expect", key.getExpect());
				}
				if(msgKeyType.containsKeyColumn("r_ODR_CHOICE") && key.getr_ODR_CHOICE() != null) {
					msgKey.setKeyValue("r_ODR_CHOICE", key.getr_ODR_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("r_DM_CHOICE") && key.getr_DM_CHOICE() != null) {
					msgKey.setKeyValue("r_DM_CHOICE", key.getr_DM_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("c_DELETE_FLG") && key.getc_DELETE_FLG() != null) {
					msgKey.setKeyValue("c_DELETE_FLG", key.getc_DELETE_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_LowerDeploy") && key.getc_LowerDeploy() != null) {
					msgKey.setKeyValue("c_LowerDeploy", key.getc_LowerDeploy());
				}
				if(msgKeyType.containsKeyColumn("dispDM_QTY") && key.getdispDM_QTY() != null) {
					msgKey.setKeyValue("dispDM_QTY", key.getdispDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("dispODR_QTY") && key.getdispODR_QTY() != null) {
					msgKey.setKeyValue("dispODR_QTY", key.getdispODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("PlanTime") && key.getPlanTime() != null) {
					msgKey.setKeyValue("PlanTime", key.getPlanTime());
				}
				if(msgKeyType.containsKeyColumn("saveDM_QTY") && key.getsaveDM_QTY() != null) {
					msgKey.setKeyValue("saveDM_QTY", key.getsaveDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("IsReleased") && key.getIsReleased() != null) {
					msgKey.setKeyValue("IsReleased", key.getIsReleased());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ODR_LT") && key.getODR_LT() != null) {
					msgKey.setKeyValue("ODR_LT", key.getODR_LT());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_LT") && key.getISSUE_LT() != null) {
					msgKey.setKeyValue("ISSUE_LT", key.getISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", sdf.format(key.getDUE_DATE()));
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", sdf.format(key.getODR_START_DATE()));
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", sdf.format(key.getPRD_DUE_DATE()));
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", sdf.format(key.getPRD_START_DATE()));
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP") && key.getLOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP", key.getLOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_EXP_TYP") && key.getEXTERNAL_PLAN_EXP_TYP() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_EXP_TYP", key.getEXTERNAL_PLAN_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG") && key.getEXTERNAL_PLAN_DEL_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_DEL_FLG", key.getEXTERNAL_PLAN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MIN_CAL_DATE") && key.getMIN_CAL_DATE() != null) {
					msgKey.setKeyValue("MIN_CAL_DATE", key.getMIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("MAX_CAL_DATE") && key.getMAX_CAL_DATE() != null) {
					msgKey.setKeyValue("MAX_CAL_DATE", key.getMAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT") && key.getOD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("OD_MODIFY_COUNT", key.getOD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXT_MODIFY_COUNT") && key.getEXT_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("EXT_MODIFY_COUNT", key.getEXT_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_RELEASE_FLG") && key.getODR_RELEASE_FLG() != null) {
					msgKey.setKeyValue("ODR_RELEASE_FLG", key.getODR_RELEASE_FLG());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG") && key.getEXTERNAL_DM_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_DM_FLG", key.getEXTERNAL_DM_FLG());
				}
				if(msgKeyType.containsKeyColumn("saveMUL_ODR_QTY") && key.getsaveMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("saveMUL_ODR_QTY", key.getsaveMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
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
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("PlanDate") && key.getPlanDate() != null) {
					msgKey.setKeyValue("PlanDate", key.getPlanDate());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_ALL") && key.getDUE_DATE_ALL() != null) {
					msgKey.setKeyValue("DUE_DATE_ALL", key.getDUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE_ALL") && key.getODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("ODR_START_DATE_ALL", key.getODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_ALL") && key.getPRD_DUE_DATE_ALL() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_ALL", key.getPRD_DUE_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_ALL") && key.getPRD_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PRD_START_DATE_ALL", key.getPRD_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME") && key.getPRD_DUE_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME", key.getPRD_DUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("TIME_GET_OD_NO") && key.getTIME_GET_OD_NO() != null) {
					msgKey.setKeyValue("TIME_GET_OD_NO", key.getTIME_GET_OD_NO());
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
					AC0060010Struct key = new AC0060010Struct();
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
					if(msgKeyType.containsKeyColumn("PlanDemand")) {
						key.setPlanDemand(msgKey.getKeyValue("PlanDemand"));
					}
					if(msgKeyType.containsKeyColumn("FixedDemand")) {
						key.setFixedDemand(msgKey.getKeyValue("FixedDemand"));
					}
					if(msgKeyType.containsKeyColumn("PlanOrder")) {
						key.setPlanOrder(msgKey.getKeyValue("PlanOrder"));
					}
					if(msgKeyType.containsKeyColumn("FixedOrder")) {
						key.setFixedOrder(msgKey.getKeyValue("FixedOrder"));
					}
					if(msgKeyType.containsKeyColumn("ValidStock")) {
						key.setValidStock(msgKey.getKeyValue("ValidStock"));
					}
					if(msgKeyType.containsKeyColumn("LowerDeploy")) {
						key.setLowerDeploy(msgKey.getKeyValue("LowerDeploy"));
					}
					if(msgKeyType.containsKeyColumn("Expect")) {
						key.setExpect(msgKey.getKeyValue("Expect"));
					}
					if(msgKeyType.containsKeyColumn("r_ODR_CHOICE")) {
						key.setr_ODR_CHOICE(msgKey.getKeyValue("r_ODR_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("r_DM_CHOICE")) {
						key.setr_DM_CHOICE(msgKey.getKeyValue("r_DM_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("c_DELETE_FLG")) {
						key.setc_DELETE_FLG(msgKey.getKeyValue("c_DELETE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_LowerDeploy")) {
						key.setc_LowerDeploy(msgKey.getKeyValue("c_LowerDeploy"));
					}
					if(msgKeyType.containsKeyColumn("dispDM_QTY")) {
						key.setdispDM_QTY(msgKey.getKeyValue("dispDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("dispODR_QTY")) {
						key.setdispODR_QTY(msgKey.getKeyValue("dispODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PlanTime")) {
						key.setPlanTime(msgKey.getKeyValue("PlanTime"));
					}
					if(msgKeyType.containsKeyColumn("saveDM_QTY")) {
						key.setsaveDM_QTY(msgKey.getKeyValue("saveDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IsReleased")) {
						key.setIsReleased(msgKey.getKeyValue("IsReleased"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_LT")) {
						key.setODR_LT(msgKey.getKeyValue("ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_LT")) {
						key.setISSUE_LT(msgKey.getKeyValue("ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(msgKey.getKeyValue("OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(sdf.parse(msgKey.getKeyValue("DUE_DATE")));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(sdf.parse(msgKey.getKeyValue("ODR_START_DATE")));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(sdf.parse(msgKey.getKeyValue("PRD_DUE_DATE")));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(sdf.parse(msgKey.getKeyValue("PRD_START_DATE")));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP")) {
						key.setLOT_SIZING_TYP(msgKey.getKeyValue("LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_EXP_TYP")) {
						key.setEXTERNAL_PLAN_EXP_TYP(msgKey.getKeyValue("EXTERNAL_PLAN_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG")) {
						key.setEXTERNAL_PLAN_DEL_FLG(msgKey.getKeyValue("EXTERNAL_PLAN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MIN_CAL_DATE")) {
						key.setMIN_CAL_DATE(msgKey.getKeyValue("MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MAX_CAL_DATE")) {
						key.setMAX_CAL_DATE(msgKey.getKeyValue("MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(new Integer(msgKey.getKeyValue("HOLIDAY_FLG")));
					}
					if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT")) {
						key.setOD_MODIFY_COUNT(msgKey.getKeyValue("OD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXT_MODIFY_COUNT")) {
						key.setEXT_MODIFY_COUNT(msgKey.getKeyValue("EXT_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_RELEASE_FLG")) {
						key.setODR_RELEASE_FLG(msgKey.getKeyValue("ODR_RELEASE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG")) {
						key.setEXTERNAL_DM_FLG(msgKey.getKeyValue("EXTERNAL_DM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("saveMUL_ODR_QTY")) {
						key.setsaveMUL_ODR_QTY(msgKey.getKeyValue("saveMUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
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
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PlanDate")) {
						key.setPlanDate(msgKey.getKeyValue("PlanDate"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_ALL")) {
						key.setDUE_DATE_ALL(msgKey.getKeyValue("DUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE_ALL")) {
						key.setODR_START_DATE_ALL(msgKey.getKeyValue("ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_ALL")) {
						key.setPRD_DUE_DATE_ALL(msgKey.getKeyValue("PRD_DUE_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_ALL")) {
						key.setPRD_START_DATE_ALL(msgKey.getKeyValue("PRD_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME")) {
						key.setPRD_DUE_TIME(msgKey.getKeyValue("PRD_DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("TIME_GET_OD_NO")) {
						key.setTIME_GET_OD_NO(msgKey.getKeyValue("TIME_GET_OD_NO"));
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
