/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0030/src/com/nec/jp/orteus/metamorBase/AZ0030/AZ0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0030;

import com.nec.jp.orteus.metamorBase.AZ0030.*;
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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProcMaster.ProcMaster;
import com.nec.jp.orteus.metamorBase.util.BusinessMessage.BusinessMessageAccessor;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.GregorianCalendar;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AZ0030010Control
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
       
        public AZ0030010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
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
       
       //-------------------------------------------------------------------------
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
       //-------------------------------------------------------------------------
       
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
       
       //-------------------------------------------------------------------------
       
        /** 最小日時 */
        private final static String _MIN_DATETIME = "0001/01/01 00:00:00";
        /** 最大日時 */
        private final static String _MAX_DATETIME = "9999/12/31 23:59:59";
       
        /** 日付フォーマット */
        //private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       
        /**
         * Date型 ⇒ String型。
         * @return String YYYY/MM/DD形式
         */
        public String dateToString(Date date)
        {
         //return _dateFormat.format(date);
         return Converter.dateToStr(date, "yyyy/MM/dd");
        }
       
        /**
         * String型 ⇒ Date型。
         * @return Date 
         */
        public Date stringToDate(String date) throws ParseException
        {
         //return _dateFormat.parse(date);
         return Converter.strToDate(date, "yyyy/MM/dd");
        }
       
       //------------------------------------------------------------------
       
        /**  頻繁に使用する業務一覧情報にアクセスするためのキー */
        private final static String _FREQUENT_BUSINESS_ACCESS_KEY = "FREQUENT_BUSINESS";
       
        List _FROM_TIMEValueList = new ArrayList(0);
        List _FROM_TIMENameList = new ArrayList(0);
        List _TO_TIMEValueList = new ArrayList(0);
        List _TO_TIMENameList = new ArrayList(0);
        List _frequentBusinessValueList = new ArrayList(0);
        List _frequentBusinessNameList = new ArrayList(0);
        List _businessValueList = new ArrayList(0);
        List _businessNameList = new ArrayList(0);
       
        /** 業務情報アクセッサオブジェクト用 */
        private ProcMaster _procMaster = new ProcMaster();
       
       //-----------------------------------------------------------------------------
       
        /** 親画面struct情報一時退避用 */
        private AZ0030010Struct _save_struct = new AZ0030010Struct();
       
        /**
         * 親画面のstruct情報を退避
         */
        private void saveParentStruct()
        {
         _save_struct.setFROM_DATE(struct.getFROM_DATE());
         _save_struct.sets_FROM_TIME(struct.gets_FROM_TIME());
         _save_struct.setTO_DATE(struct.getTO_DATE());
         _save_struct.sets_TO_TIME(struct.gets_TO_TIME());
         _save_struct.seth_plant_flg(struct.geth_plant_flg());
         _save_struct.seth_own_flg(struct.geth_own_flg());
         _save_struct.seth_sort_flg(struct.geth_sort_flg());
         _save_struct.seth_detail_flg(struct.geth_detail_flg());
        }
       
        /**
         * 親画面のstruct情報を復帰
         */
        private void loadParentStruct()
        {
         struct.setFROM_DATE(_save_struct.getFROM_DATE());
         struct.sets_FROM_TIME(_save_struct.gets_FROM_TIME());
         struct.setTO_DATE(_save_struct.getTO_DATE());
         struct.sets_TO_TIME(_save_struct.gets_TO_TIME());
         struct.seth_plant_flg(_save_struct.geth_plant_flg());
         struct.seth_own_flg(_save_struct.geth_own_flg());
         struct.seth_sort_flg(_save_struct.geth_sort_flg());
         struct.seth_detail_flg(_save_struct.geth_detail_flg());
        }
       
       //------------------------------------------------------------------
       
        /**
         * 表示順情報格納用
         * sort_flg 0: 新しい順 1: 古い順
         */
        private int _sort_flg = 0;
       
        /**
         * 表示順情報設定
         */
        public void setSortFlg(int sort_flg){ _sort_flg = sort_flg; }
       
        /**
         * 表示順情報取得
         */
        public int getSortFlg(){ return _sort_flg; }
       
       //------------------------------------------------------------------
       
        /** 一覧に表示されているデータの先頭を０（ゼロ）とした現在表示対象にあるデータ番号格納用 */
        int _detailInfoDispTargetNo = 0;
       
        /** アクションフラグ データ設定 */
        private final static String _DATA_SET = "data_set";
       
        /** アクションフラグ 前データ */
        private final static String _DATA_PREV = "data_prev";
       
        /** アクションフラグ 次データ */
        private final static String _DATA_NEXT = "data_next";
       
        /**
         * 詳細表示対象データを設定
         * @@param actionFlg 対象データ操作フラグ
         * @@param val       対象データ番号(actionFlgが_DATA_SET時のみ有効)
         */
        private void setDetailInfo(String actionFlg, int val)
        {
         // アクションフラグによる処理
         if(actionFlg.equals(_DATA_SET) == true)
         {
          _detailInfoDispTargetNo = val;
         }
         else if(actionFlg.equals(_DATA_PREV) == true)
         {
          // 前データへ
          _detailInfoDispTargetNo -= val;
          if(_detailInfoDispTargetNo < 0)
          {
           _detailInfoDispTargetNo = 0;
          }
         }
         if(actionFlg.equals(_DATA_NEXT) == true)
         {
          // 次データへ
          _detailInfoDispTargetNo += val;
          if(_detailInfoDispTargetNo > (getListsize()-1))
          {
           _detailInfoDispTargetNo = (getListsize()-1);
          }
         }

         // 親画面で選択されている表示順を考慮して、親画面上の表示対象データ番号を実リストデータ番号へ変換
         /*int intDataNo = convListDataIndex(_detailInfoDispTargetNo);*/
        	
         // 「古い順」を選択して読込を行ったときに選択したデータと詳細で表示されるデータが逆になってしまうため
         //  一覧の実リストデータ番号と表示対象データ番号を同じにする2006/04/20up
         int intDataNo = _detailInfoDispTargetNo;
       
         // データ取得
         AZ0030010Struct target_struct = (AZ0030010Struct)getListvalue(intDataNo);
       
         // 表示用structへ詳細表示情報を設定
         copyDetailInfoStruct(target_struct, struct);
        }
       
        /**
         * 指定された詳細情報structをコピー
         * @@param src_struct コピー元
         * @@param dst_struct コピー先
         */
        protected void copyDetailInfoStruct(AZ0030010Struct src_struct, AZ0030010Struct dst_struct)
        {
         // 詳細表示に必要なデータを設定
         dst_struct.setCONFIRM_DATE(src_struct.getCONFIRM_DATE());
         dst_struct.setLOG_CD(src_struct.getLOG_CD());
         dst_struct.setCREATED_DATE(src_struct.getCREATED_DATE());
         dst_struct.setPLANT_CD(src_struct.getPLANT_CD());
         dst_struct.setBUSINESS_NAME(src_struct.getBUSINESS_NAME());
         dst_struct.setw_BUSINESS_NAME(src_struct.getBUSINESS_NAME()); // 業務名はコードで表示
         dst_struct.setUSER_CD(src_struct.getUSER_CD());
         dst_struct.setMSG(src_struct.getMSG());
         dst_struct.setDATA_STRING(src_struct.getDATA_STRING());
         dst_struct.setPLANT_NAME(src_struct.getPLANT_NAME());
         dst_struct.setUSER_NAME(src_struct.getUSER_NAME());
        }
       
        /**
         * 表示順を考慮した親画面上の表示対象データ番号を実リストデータ番号へ変換
         * @@param targetNo  対象データ番号
         */
        protected int convListDataIndex(int targetNo)
        {
         int intDataNo;
        
         if(getSortFlg() == 0)
         {
          // 表示順が新しい順の場合
          intDataNo = targetNo;
         	System.out.println("(SBM0888)表示順が新しい順の場合 " + getSortFlg());
         }
         else
         {
          // 表示順が古い順の場合
          intDataNo = (getListsize()-1) - targetNo;
         	System.out.println("(SBM0889)表示順が古い順の場合 " + getSortFlg());
         }
         return intDataNo;
        }
       
       //------------------------------------------------------------------
       
        /** 一覧詳細情報表示先頭文字数アクセスキー */
        private final static String _DETAIL_HEAD_LENGTH_ACCESS_KEY = "BUSINESS_MSG_DETAIL_HEAD";
       
        /** 一覧詳細情報表表示先頭文字数格納用 */
        private Integer _dispDetailLength = new Integer(40);
       
       //------------------------------------------------------------------
       
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
       //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
                List listMessage = new ArrayList();
              
                setReadStatus(INITIAL);
                
                try {
                 // 読込条件準備
              
                 // 条件値設定用オブジェクト初期化
                 AZ0030010Struct search_struct = new AZ0030010Struct();
                 search_struct.clear();
              
                 // 入力値(業務)設定
                 search_struct.setBUSINESS_NAME(struct.getBUSINESS_NAME());
              
                 // 入力値より発生日時の文字列を作成
                 //SimpleDateFormat formatDateTime = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                 Calendar calendar = new GregorianCalendar();
              
                 // FROMの発生日時の文字列作成
                 String strFromDateTime = _MIN_DATETIME;
                 if( (struct.getFROM_DATE() != null) && ("".equals(struct.getFROM_DATE()) != true) )
                 {
                  calendar.setTime(stringToDate(struct.getFROM_DATE()));
                  calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(struct.gets_FROM_TIME()));// 時
                  calendar.set(Calendar.MINUTE, 0);	// 分
                  calendar.set(Calendar.SECOND, 0);	// 秒
                  //strFromDateTime = formatDateTime.format(calendar.getTime());
                  strFromDateTime = Converter.dateToStr(calendar.getTime(), "yyyy/MM/dd HH:mm:ss");
                 }
              
                 // TOの発生日時の文字列作成
                 String strToDateTime = _MAX_DATETIME;
                 if( (struct.getTO_DATE() != null) && ("".equals(struct.getTO_DATE()) != true) )
                 {
                  calendar.setTime(stringToDate(struct.getTO_DATE()));
                  calendar.set(Calendar.HOUR_OF_DAY, Integer.parseInt(struct.gets_TO_TIME()));// 時
                  calendar.set(Calendar.MINUTE, 0);	// 分
                  calendar.set(Calendar.SECOND, 0);	// 秒
                  calendar.add(Calendar.HOUR_OF_DAY, 1);
                  //strToDateTime = formatDateTime.format(calendar.getTime());
                  strToDateTime = Converter.dateToStr(calendar.getTime(), "yyyy/MM/dd HH:mm:ss");
                 }
              
                 // 発生日時設定
                 search_struct.setw_FROM_DATE(strFromDateTime);
                 search_struct.setw_TO_DATE(strToDateTime);
              
                 // 全工場が選択されている場合は、PLANT_CDへnullを設定
                 // 自工場が選択されている場合は、PLANT_CDへ自工場コードを設定
                 if(struct.geth_plant_flg().intValue() == 0)
                 {
                  search_struct.setPLANT_CD(null);		// 全工場指定
                 }
                 else
                 {
                  search_struct.setPLANT_CD(getsysPLANT_CD());	// 自工場指定
                 }
              
                 // 自ユーザ表示が選択されている場合は、USER_CDへ自ユーザコードを設定
                 // 自ユーザ表示が選択されていない場合は、USER_CDへnullを設定
                 if(struct.geth_own_flg().intValue() == 1)
                 {
                  search_struct.setUSER_CD(getsysUSER_CD());		// 自ユーザ表示対象
                 }
                 else
                 {
                  search_struct.setUSER_CD(null);			// 全ユーザ表示対象
                 }
              
                 // 読み込み実行
                 List temp_list = new ArrayList(0);
                 List sort_list = new ArrayList(0);
                //表示最大行数制限処理
                 ScreenParam sp = new ScreenParam(this.getClass());
                 int maxLine = sp.getMaxLine(conn,10);
                 if(maxLine != 0) {
     				search_struct.setROW_COUNT(String.valueOf(maxLine));
     			} else {
     				search_struct.setROW_COUNT(null);
     			}
                 temp_list = entity.mselectCnt.read(conn, search_struct);
                 long rowCount = Long.parseLong(((AZ0030010Struct)temp_list.get(0)).getl_COUNT());
                 // レコード件数チェック
     			if (rowCount==0) {
     				 setReadStatus(NOT_FOUND);
                     // レコード件数が０(ゼロ)件の場合
                     listMessage.add("SYS_MSG_LOG.CREATED_DATE[FROM]:" + search_struct.getw_FROM_DATE());
                     listMessage.add("SYS_MSG_LOG.CREATED_DATE[TO]:" + search_struct.getw_TO_DATE());
                     listMessage.add("SYS_MSG_LOG.PLANT_CD:" + search_struct.getPLANT_CD());
                     listMessage.add("USER_MST.USER_CD:" + search_struct.getUSER_CD());
                     setErrorMessage("AZ60001", listMessage);
                     //一覧表をクリアする
     				if(list != null && list.size() > 0){
     					list.clear();
     				}
     				return;
     			}
                 if(maxLine != 0 && rowCount == maxLine+1){
                  
                  // モード設定
                  setReadStatus(TOO_MANY);
                  
                  ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                  msgStruct.addError( emsg );
                  sysLog.warning(emsg, getsysUSER_CD());
                  if(list != null && list.size() > 0){
   					list.clear();
   				  }
   				  return;
                 }
                 temp_list = entity.mselect.read(conn, search_struct);
                   // 表示データ加工処理
                   for(int i = 0; i < temp_list.size(); i++)
                   {
                    AZ0030010Struct temp_struct = (AZ0030010Struct)temp_list.get(i);
                    // 読み込んだデータの業務名を表示用変数にコピー
                    temp_struct.setw_BUSINESS_NAME(temp_struct.getBUSINESS_NAME());
              
                    // 作成者名取得不可のとき 作成者IDを表示
                    String createUserName = temp_struct.getUSER_NAME();
                    if(createUserName == null || "".equals(createUserName))
                     temp_struct.setUSER_NAME(temp_struct.getUSER_CD());
              
                    // 工場名取得不可のとき 工場IDを表示
                    String plantName = temp_struct.getPLANT_NAME();
                    if(plantName == null || "".equals(plantName))
                     temp_struct.setPLANT_NAME(temp_struct.getPLANT_CD());
              
                    // 詳細情報の先頭40文字を抽出設定する処理
                    String strDataString = null;
                    if( (temp_struct.getDATA_STRING() != null && "".equals(temp_struct.getDATA_STRING()) != true)
                    &&	(temp_struct.getDATA_STRING().length() > _dispDetailLength.intValue()) )
                    {
                     strDataString = temp_struct.getDATA_STRING().substring(0,_dispDetailLength.intValue());
                    }
                    else{
                     strDataString = temp_struct.getDATA_STRING();
                    }
                    temp_struct.setw_DATA_STRING(strDataString);
                   }
                   
                   // ソートタイプの判定
                   if(struct.getr_SORT_NEW().equals("true"))
                   {
                    // 表示用リストを更新
                    setList(temp_list);
                   }
                   else
                   {
                    for(int i = (temp_list.size() - 1); i >= 0; i--)
                    {
                     AZ0030010Struct sort_struct = new AZ0030010Struct();
                     sort_struct = (AZ0030010Struct)temp_list.get(i);
                     
                     sort_list.add(sort_struct);
                    }
                    
                    setList(sort_list);
                   }
              
                   setReadStatus(NORMAL);
                   
                   // 一覧の先頭の詳細ラジオボタンが選択されるように設定
                   struct.seth_detail_flg(new Integer(0));
              
                   // 表示順情報をコントロールに保持
                   setSortFlg(struct.geth_sort_flg().intValue());
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                 
                } catch(ParseException e) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                } 
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
              
                // モード設定
                setReadStatus(INITIAL);
              
                // struct初期化
                struct.initialize();
				
				//h_PLAN_TYPに"1"を設定 2006/04/26 up
				struct.seth_PLAN_TYP("1");
           
				// 発生日の初期値をシステム日付に設定
				String sSysdate = "";

				if(conn == null) { CoreTools.getTransConnection(); }

				try {
					if((sSysdate = entity.mei_Sysdate.read(conn))==null) {
						throw new FoundationException("AZ0030010Control","controlclear()","システム日付取得処理でエラーが発生しました。");
					}

					// Struct変数へデータのセット
					struct.setFROM_DATE( sSysdate.substring(0,10) );

				} catch( SQLException e ) {
					e.printStackTrace();
					throw new FoundationException("AZ0030010Control",e.getMessage(),"controlclearメソッドでエラーが発生しました。");
				}
				
                // list初期化
                if(list != null)
                {
                 list.clear();
                }
                else
                {
                 list = new ArrayList(0);
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controldetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controldetail");
			//{{user_implement_dev:<controldetail>
                //---------------------------------------------------------------------
                 
                // 親画面のstructを退避
                _save_struct.copy(struct);
              
                for(int i=0; i < list.size(); i++)
                {
                 AZ0030010Struct temp_struct = (AZ0030010Struct)list.get(i);
                 if(struct.getLOG_CD().equals(temp_struct.getLOG_CD()))
                 {
                  struct.seth_detail_flg(new Integer(i));
                  break;
                 }
                }
                 
				//System.out.println(getSortFlg());
				
                // 詳細表示対象の一覧データ番号を取得し、control.structに設定
                setDetailInfo(_DATA_SET, struct.geth_detail_flg().intValue());
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controldetail>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controldetail");

		return;
	}

	/**
	 * 確認ボタン押下時に実行される処理です。
	 *
	 */
	public void controlconfirm() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm");
			//{{user_implement_dev:<controlconfirm>
                //---------------------------------------------------------------------
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
                try{
                 
                 AZ0030010Struct delStruct = new AZ0030010Struct();
                 
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
              
              
                 for(int i = 0; i < struct.getList_LOG_CD().size(); i++)
                 {
                  // 選択行の情報を取得
                  delStruct.importData(struct, i);
                  struct.setw_LOG_CD((String)struct.getList_LOG_CD().get(i));
                  // 確認日付の更新
                  int nRet = entity.mupdateSYS_MSG_LOG.update(conn, struct);
                 }
             
                 // コミット
                 conn.commit();
              
                 // DB更新中フラグOFF
                 bDBUpdate = false;
              
                 // 再読込処理
                 controlselect();
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(msgStruct.sizeError() > 0)
                 {
                  // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                  if(bDBUpdate == true)
                  {
                   // ロールバック
                   conn.rollback();
              
                   // DB更新中フラグOFF
                   bDBUpdate = false;
                  }
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlconfirm>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm");

		return;
	}

	/**
	 * 前へボタン押下時に実行される処理です。
	 *
	 */
	public void controlprev_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlprev_sub1");
			//{{user_implement_dev:<controlprev_sub1>
                //---------------------------------------------------------------------
              
                String Message = "";
              
                // 既に先頭のデータが表示対象になっているかどうかのチェック
                if(_detailInfoDispTargetNo <= 0)
                {
                 
                 setInfoMessage( "AZ60002", "" );
                }
              
                // エラーがあるかどうかのチェック
                if(msgStruct.sizeError() <= 0)
                {
                 // 現在、詳細表示対象となっている一覧のデータ番号を-1して、前のデータを表示対象にする
                 // 番号が０（ゼロ）以下になった場合は、一覧の最終データが表示対象となる
                 setDetailInfo(_DATA_PREV, 1);
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlprev_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlprev_sub1");

		return;
	}

	/**
	 * 次へボタン押下時に実行される処理です。
	 *
	 */
	public void controlnext_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlnext_sub1");
			//{{user_implement_dev:<controlnext_sub1>
                //---------------------------------------------------------------------
              
                // 既に末尾のデータが表示対象になっているかどうかのチェック
                if(_detailInfoDispTargetNo >= (getListsize()-1))
                {
                 
                 setInfoMessage( "AZ60003", "" );
                }
              
                // エラーがあるかどうかのチェック
                if(msgStruct.sizeError() <= 0)
                {
                 // 現在、詳細表示対象となっている一覧のデータ番号を+1して、次のデータを表示対象にする
                 // 番号が一覧の末尾データを超えた場合は、一覧の先頭データが表示対象となる
                 setDetailInfo(_DATA_NEXT, 1);
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlnext_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlnext_sub1");

		return;
	}

	/**
	 * 確認ボタン押下時に実行される処理です。
	 *
	 */
	public void controlconfirm_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm_sub1");
			//{{user_implement_dev:<controlconfirm_sub1>
                //---------------------------------------------------------------------
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
                String Message = "";
              
                try{
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 // 一覧のチェックボックスにチェックが入っているレコードに対して確認処理をおこなう
                 BusinessMessageAccessor businessMessageAccessor = new BusinessMessageAccessor();
                 businessMessageAccessor.init(conn);
                 businessMessageAccessor.confirm(struct.getLOG_CD(), struct.getPLANT_CD(), struct.getUSER_CD());
              
                 // コミット
                 conn.commit();
              
                 // DB更新中フラグOFF
                 bDBUpdate = false;
              
                 // 子画面に遷移する前の親画面のstructを復帰
                 struct.copy(_save_struct);
              
                 // 対象レコード再読込処理
                 List temp_list = entity.mselectRetryByLOG_CD.read(conn, struct);
                 if(temp_list.size() <= 0)
                 {
                  // 該当レコードなし
                  Message = "SYS_MSG_LOG.JOB_ODR_CD:" + struct.getLOG_CD();
                  setErrorMessage("ZZ06001", Message);
                 }
                 else
                 {
                  // データ取得
                  AZ0030010Struct target_struct = (AZ0030010Struct)temp_list.get(0);
              
                  // 詳細表示用データを表示用structへ再設定
                  copyDetailInfoStruct(target_struct, struct);
              
                  // 一覧データ更新
                  AZ0030010Struct list_struct = (AZ0030010Struct)getListvalue(convListDataIndex(_detailInfoDispTargetNo));
                  copyDetailInfoStruct(target_struct, list_struct);
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } catch(AlarmMessageException msg) {
                 throw msg;
              
                } finally {
                 if(msgStruct.sizeError() > 0)
                 {
                  // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                  if(bDBUpdate == true)
                  {
                   // ロールバック
                   conn.rollback();
              
                   // DB更新中フラグOFF
                   bDBUpdate = false;
                  }
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlconfirm_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlconfirm_sub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
              
                // 子画面に遷移する前の親画面のstructを復帰
                struct.copy(_save_struct);
              
                // 再読込処理
                controlselect();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselectall");
			//{{user_implement_dev:<controlselectall>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlselectall>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlselectall");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");
			//{{user_implement_dev:<controlcancelselectall>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlcancelselectall>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                try {
                  
                 // クリア処理
                 controlclear();
              
                 // コンボボックスリストデータ作成
                 // 各リスト変数を初期化
                 _FROM_TIMEValueList.clear();
                 _FROM_TIMENameList.clear();
                 _TO_TIMEValueList.clear();
                 _TO_TIMENameList.clear();
                 _frequentBusinessValueList.clear();
                 _frequentBusinessNameList.clear();
                 _businessValueList.clear();
                 _businessNameList.clear();
              
                 // 時間(0～23)一覧設定
                 for(int i = 0; i <= 23; i++)
                 {
                  _FROM_TIMEValueList.add(String.valueOf(i));
                  _FROM_TIMENameList.add(String.valueOf(i));
                  _TO_TIMEValueList.add(String.valueOf(i));
                  _TO_TIMENameList.add(String.valueOf(i));
                 }
              
                 // 業務情報読込
                 if(_procMaster.load(conn) == false)
                 {
                  // エラー処理
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
              
                 // 頻繁に使用する業務一覧データをSYS_PARAMETERテーブルから取得
                 PrivateConfig privateConfig = new PrivateConfig(conn);
                 _frequentBusinessValueList = privateConfig.getStrings(_FREQUENT_BUSINESS_ACCESS_KEY);
                 if(_frequentBusinessValueList == null)
                 {
                  // エラー処理
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
              
                 // 業務ID分の業務名一覧を取得設定
                 for(int i = 0; i < _frequentBusinessValueList.size(); i++)
                 {
                  _frequentBusinessNameList.add(_procMaster.getName((String)_frequentBusinessValueList.get(i)));
                 }
              
                 // 全業務一覧設定
                 _businessValueList = _procMaster.getIds();
                 _businessNameList = _procMaster.getNames();
              
                 // 一覧詳細情報表示最大文字数取得
                 Integer intMaxDataStringLength = privateConfig.getNumber(_DETAIL_HEAD_LENGTH_ACCESS_KEY);
                 if(intMaxDataStringLength == null){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.BUSINESS_MSG_DETAIL_HEAD:" + intMaxDataStringLength );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 else if(intMaxDataStringLength.intValue() <= 0){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.BUSINESS_MSG_DETAIL_HEAD:" + intMaxDataStringLength );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 _dispDetailLength = intMaxDataStringLength;
                } catch(SQLException e) {
                  setSqlExceptionMsg(e);
                 
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0030");
		logger.entering("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AZ0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("detail") ) {
				controldetail();
			} else if( button.equals("confirm") ) {
				controlconfirm();
			} else if( button.equals("prev_sub1") ) {
				controlprev_sub1();
			} else if( button.equals("next_sub1") ) {
				controlnext_sub1();
			} else if( button.equals("confirm_sub1") ) {
				controlconfirm_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("selectall") ) {
				controlselectall();
			} else if( button.equals("cancelselectall") ) {
				controlcancelselectall();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //---------------------------------------------------------------------
              
                 struct.setList_s_FROM_TIME_val(_FROM_TIMEValueList);
                 struct.setList_s_FROM_TIME_name(_FROM_TIMENameList);
                 struct.setList_s_TO_TIME_val(_TO_TIMEValueList);
                 struct.setList_s_TO_TIME_name(_TO_TIMENameList);
                 
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 throw ee;
                //---------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AZ0030010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0030010-E999","CSVの出力処理"));
			throw new FoundationException("AZ0030010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0030010-E999","システム日付の取得処理"));
				throw new FoundationException("AZ0030010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0030010-E999","コントロールのイベント処理"));
			throw new FoundationException("AZ0030010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AZ0030010Entity entity;
	protected AZ0030010Struct struct;
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

		entity = new AZ0030010Entity();
		struct = new AZ0030010Struct();

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
	 * AZ0030010クラスの標準コンストラクタ
	 */
	public AZ0030010Control() throws BusinessProcessException, FoundationException
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
				AZ0030010Struct key = (AZ0030010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FROM_DATE") && key.getFROM_DATE() != null) {
					msgKey.setKeyValue("FROM_DATE", key.getFROM_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_FROM_TIME") && key.geth_FROM_TIME() != null) {
					msgKey.setKeyValue("h_FROM_TIME", key.geth_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_FROM_TIME") && key.gets_FROM_TIME() != null) {
					msgKey.setKeyValue("s_FROM_TIME", key.gets_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_FROM_TIME_name") && key.gets_FROM_TIME_name() != null) {
					msgKey.setKeyValue("s_FROM_TIME_name", key.gets_FROM_TIME_name());
				}
				if(msgKeyType.containsKeyColumn("s_FROM_TIME_val") && key.gets_FROM_TIME_val() != null) {
					msgKey.setKeyValue("s_FROM_TIME_val", key.gets_FROM_TIME_val());
				}
				if(msgKeyType.containsKeyColumn("TO_DATE") && key.getTO_DATE() != null) {
					msgKey.setKeyValue("TO_DATE", key.getTO_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_TO_TIME") && key.gets_TO_TIME() != null) {
					msgKey.setKeyValue("s_TO_TIME", key.gets_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("s_TO_TIME_name") && key.gets_TO_TIME_name() != null) {
					msgKey.setKeyValue("s_TO_TIME_name", key.gets_TO_TIME_name());
				}
				if(msgKeyType.containsKeyColumn("s_TO_TIME_val") && key.gets_TO_TIME_val() != null) {
					msgKey.setKeyValue("s_TO_TIME_val", key.gets_TO_TIME_val());
				}
				if(msgKeyType.containsKeyColumn("h_TO_TIME") && key.geth_TO_TIME() != null) {
					msgKey.setKeyValue("h_TO_TIME", key.geth_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_plant_flg") && key.geth_plant_flg() != null) {
					msgKey.setKeyValue("h_plant_flg", key.geth_plant_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("h_own_flg") && key.geth_own_flg() != null) {
					msgKey.setKeyValue("h_own_flg", key.geth_own_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("h_sort_flg") && key.geth_sort_flg() != null) {
					msgKey.setKeyValue("h_sort_flg", key.geth_sort_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("h_detail_flg") && key.geth_detail_flg() != null) {
					msgKey.setKeyValue("h_detail_flg", key.geth_detail_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_NAME") && key.getw_BUSINESS_NAME() != null) {
					msgKey.setKeyValue("w_BUSINESS_NAME", key.getw_BUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_DATA_STRING") && key.getw_DATA_STRING() != null) {
					msgKey.setKeyValue("w_DATA_STRING", key.getw_DATA_STRING());
				}
				if(msgKeyType.containsKeyColumn("r_PLANT_ALL") && key.getr_PLANT_ALL() != null) {
					msgKey.setKeyValue("r_PLANT_ALL", key.getr_PLANT_ALL());
				}
				if(msgKeyType.containsKeyColumn("r_PLANT") && key.getr_PLANT() != null) {
					msgKey.setKeyValue("r_PLANT", key.getr_PLANT());
				}
				if(msgKeyType.containsKeyColumn("c_OWN") && key.getc_OWN() != null) {
					msgKey.setKeyValue("c_OWN", key.getc_OWN());
				}
				if(msgKeyType.containsKeyColumn("r_SORT_NEW") && key.getr_SORT_NEW() != null) {
					msgKey.setKeyValue("r_SORT_NEW", key.getr_SORT_NEW());
				}
				if(msgKeyType.containsKeyColumn("r_SORT_OLD") && key.getr_SORT_OLD() != null) {
					msgKey.setKeyValue("r_SORT_OLD", key.getr_SORT_OLD());
				}
				if(msgKeyType.containsKeyColumn("h_PLAN_TYP") && key.geth_PLAN_TYP() != null) {
					msgKey.setKeyValue("h_PLAN_TYP", key.geth_PLAN_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_confirm_flg") && key.getw_confirm_flg() != null) {
					msgKey.setKeyValue("w_confirm_flg", key.getw_confirm_flg().toString());
				}
				if(msgKeyType.containsKeyColumn("w_FROM_DATE") && key.getw_FROM_DATE() != null) {
					msgKey.setKeyValue("w_FROM_DATE", key.getw_FROM_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_TO_DATE") && key.getw_TO_DATE() != null) {
					msgKey.setKeyValue("w_TO_DATE", key.getw_TO_DATE());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DATE") && key.getCONFIRM_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DATE", key.getCONFIRM_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOG_CD") && key.getLOG_CD() != null) {
					msgKey.setKeyValue("LOG_CD", key.getLOG_CD());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_NAME") && key.getBUSINESS_NAME() != null) {
					msgKey.setKeyValue("BUSINESS_NAME", key.getBUSINESS_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("MSG") && key.getMSG() != null) {
					msgKey.setKeyValue("MSG", key.getMSG());
				}
				if(msgKeyType.containsKeyColumn("DATA_STRING") && key.getDATA_STRING() != null) {
					msgKey.setKeyValue("DATA_STRING", key.getDATA_STRING());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_LOG_CD") && key.getw_LOG_CD() != null) {
					msgKey.setKeyValue("w_LOG_CD", key.getw_LOG_CD());
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
					AZ0030010Struct key = new AZ0030010Struct();
					if(msgKeyType.containsKeyColumn("FROM_DATE")) {
						key.setFROM_DATE(msgKey.getKeyValue("FROM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_FROM_TIME")) {
						key.seth_FROM_TIME(msgKey.getKeyValue("h_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_FROM_TIME")) {
						key.sets_FROM_TIME(msgKey.getKeyValue("s_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_FROM_TIME_name")) {
						key.sets_FROM_TIME_name(msgKey.getKeyValue("s_FROM_TIME_name"));
					}
					if(msgKeyType.containsKeyColumn("s_FROM_TIME_val")) {
						key.sets_FROM_TIME_val(msgKey.getKeyValue("s_FROM_TIME_val"));
					}
					if(msgKeyType.containsKeyColumn("TO_DATE")) {
						key.setTO_DATE(msgKey.getKeyValue("TO_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_TO_TIME")) {
						key.sets_TO_TIME(msgKey.getKeyValue("s_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("s_TO_TIME_name")) {
						key.sets_TO_TIME_name(msgKey.getKeyValue("s_TO_TIME_name"));
					}
					if(msgKeyType.containsKeyColumn("s_TO_TIME_val")) {
						key.sets_TO_TIME_val(msgKey.getKeyValue("s_TO_TIME_val"));
					}
					if(msgKeyType.containsKeyColumn("h_TO_TIME")) {
						key.seth_TO_TIME(msgKey.getKeyValue("h_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_plant_flg")) {
						key.seth_plant_flg(new Integer(msgKey.getKeyValue("h_plant_flg")));
					}
					if(msgKeyType.containsKeyColumn("h_own_flg")) {
						key.seth_own_flg(new Integer(msgKey.getKeyValue("h_own_flg")));
					}
					if(msgKeyType.containsKeyColumn("h_sort_flg")) {
						key.seth_sort_flg(new Integer(msgKey.getKeyValue("h_sort_flg")));
					}
					if(msgKeyType.containsKeyColumn("h_detail_flg")) {
						key.seth_detail_flg(new Integer(msgKey.getKeyValue("h_detail_flg")));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_NAME")) {
						key.setw_BUSINESS_NAME(msgKey.getKeyValue("w_BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_DATA_STRING")) {
						key.setw_DATA_STRING(msgKey.getKeyValue("w_DATA_STRING"));
					}
					if(msgKeyType.containsKeyColumn("r_PLANT_ALL")) {
						key.setr_PLANT_ALL(msgKey.getKeyValue("r_PLANT_ALL"));
					}
					if(msgKeyType.containsKeyColumn("r_PLANT")) {
						key.setr_PLANT(msgKey.getKeyValue("r_PLANT"));
					}
					if(msgKeyType.containsKeyColumn("c_OWN")) {
						key.setc_OWN(msgKey.getKeyValue("c_OWN"));
					}
					if(msgKeyType.containsKeyColumn("r_SORT_NEW")) {
						key.setr_SORT_NEW(msgKey.getKeyValue("r_SORT_NEW"));
					}
					if(msgKeyType.containsKeyColumn("r_SORT_OLD")) {
						key.setr_SORT_OLD(msgKey.getKeyValue("r_SORT_OLD"));
					}
					if(msgKeyType.containsKeyColumn("h_PLAN_TYP")) {
						key.seth_PLAN_TYP(msgKey.getKeyValue("h_PLAN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_confirm_flg")) {
						key.setw_confirm_flg(new Integer(msgKey.getKeyValue("w_confirm_flg")));
					}
					if(msgKeyType.containsKeyColumn("w_FROM_DATE")) {
						key.setw_FROM_DATE(msgKey.getKeyValue("w_FROM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_TO_DATE")) {
						key.setw_TO_DATE(msgKey.getKeyValue("w_TO_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DATE")) {
						key.setCONFIRM_DATE(msgKey.getKeyValue("CONFIRM_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOG_CD")) {
						key.setLOG_CD(msgKey.getKeyValue("LOG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_NAME")) {
						key.setBUSINESS_NAME(msgKey.getKeyValue("BUSINESS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("MSG")) {
						key.setMSG(msgKey.getKeyValue("MSG"));
					}
					if(msgKeyType.containsKeyColumn("DATA_STRING")) {
						key.setDATA_STRING(msgKey.getKeyValue("DATA_STRING"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_LOG_CD")) {
						key.setw_LOG_CD(msgKey.getKeyValue("w_LOG_CD"));
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
