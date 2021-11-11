/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0080/src/com/nec/jp/orteus/metamorBase/AC0080/AC0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0080;

import com.nec.jp.orteus.metamorBase.AC0080.*;
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

import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
//------------------------------------------------------------------------------
//import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0080010Control
{

	//////////////////////////////
	// アクセサメソッド等を定義します
	// Businessオブジェクトアクセサメソッド
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// PDF用アクセサメソッド
	private String queryFileName = null;
	public String getQueryfileName() { return this.queryFileName; }
	public void setQueryFileName(String queryFileName) { this.queryFileName = queryFileName; }
	private String frmFileName = null;
	public String getFrmfileName() { return this.frmFileName; }
	public void setFrmFileName(String frmFileName) { this.frmFileName = frmFileName; }
	private String pdfFileName = null;
	public String getPdfFileName() { return this.pdfFileName; }
	public void setPdfFileName(String pdfFileName) { this.pdfFileName = pdfFileName; }
	private String dbUID = null;
	private String dbPWD = null;
	private String dbDBQ = null;
	private String dbKIND = null;
	private String pdfFilePath = null;
	public String getPdfFilePath() { return this.pdfFilePath; }
	public void setPdfFilePath(String pdfFilePath) { this.pdfFilePath = pdfFilePath; }

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
       
           public AC0080010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
         
           //------------------------------------------------------------------------------
       
           /** 画面共通定義取得クラス */
           ScreenParam _scParam = sp;
       
           //------------------------------------------------------------------------------
       
           /** 保存用読込リスト */
           List _readList = new ArrayList();
       
           //------------------------------------------------------------------------------
           /**
            * 区分名取得（共通）
            *
            * @param	comboStruct	区分情報リスト
            * @param	strTyp		区分コード
            * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
            */
           private String getTypName(ComboStruct comboStruct, String strTyp)
           {
               if(comboStruct != null && strTyp != null) {
                   for(int i = 0; i < comboStruct.getValList().size(); i++) {
                       if(strTyp.equals((String)(comboStruct.getValList().get(i)))) {
                           strTyp = (String)(comboStruct.getExplanList().get(i));
                           break;
                       }
                   }
               }
               return strTyp;
           }
       
           /** オーダデマンド区分(条件指定) */
           private ComboStruct _ODR_DMD_TYP = new ComboStruct();
       
           /** オーダデマンド区分 */
           private ComboStruct _OD_COMBO_TYP = new ComboStruct();
       
           /** 内外作区分 */
           private ComboStruct _OUTSIDE_COMBO_TYP = new ComboStruct();
       
           /** オーダ状態区分 */
           private ComboStruct _ODR_STS_TYP = new ComboStruct();
       
           /** デマンド状態区分 */
           private ComboStruct _DM_STS_TYP = new ComboStruct();
       
       
           /** オーダデマンド区分設定(条件指定)
            * @param コンボボックスデータ
           */
           public void setODR_DMD_TYP(ComboStruct combo){ _ODR_DMD_TYP = combo; }
       
           /** オーダデマンド区分設定
            * @param コンボボックスデータ
           */
           public void setOD_COMBO_TYP(ComboStruct combo){ _OD_COMBO_TYP = combo; }
       
           /** 内外作区分設定
            * @param コンボボックスデータ
           */
           public void setOUTSIDE_COMBO_TYP(ComboStruct combo){ _OUTSIDE_COMBO_TYP = combo; }
       
           /** オーダ状態区分設定
            * @param コンボボックスデータ
           */
           public void setODR_STS_TYP(ComboStruct combo){ _ODR_STS_TYP = combo; }
       
           /** デマンド状態区分設定
            * @param コンボボックスデータ
           */
           public void setDM_STS_TYP(ComboStruct combo){ _DM_STS_TYP = combo; }
       
       
           /** オーダデマンド区分取得(条件指定)
            * @return オーダデマンド区分のコンボボックスデータ
           */
           public ComboStruct getODR_DMD_TYP(){ return _ODR_DMD_TYP; }
       
           /** オーダデマンド区分取得
            * @return オーダデマンド区分のコンボボックスデータ
           */
           public ComboStruct getOD_COMBO_TYP(){ return _OD_COMBO_TYP; }
       
           /** 内外作区分取得
            * @return 内外作区分のコンボボックスデータ
           */
           public ComboStruct getOUTSIDE_COMBO_TYP(){ return _OUTSIDE_COMBO_TYP; }
       
           /** オーダ状態区分取得
            * @return オーダ状態区分のコンボボックスデータ
           */
           public ComboStruct getODR_STS_TYP(){ return _ODR_STS_TYP; }
       
           /** デマンド状態区分取得
            * @return デマンド状態区分のコンボボックスデータ
           */
           public ComboStruct getDM_STS_TYP(){ return _DM_STS_TYP; }
       
           //------------------------------------------------------------------------------
       
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
       
           //------------------------------------------------------------------------------
       
           /** 業務運用開始日格納用 */
           private Date _sysDate = new Date();
       
          //------------------------------------------------------------------------------
       
           private List csvList = null;
           public List getCsvList(){ return this.csvList; }
           //------------------------------------------------------------------------------
       
           // 明細行全件のチェックボックスの値
           private List _EntryList = null;
           public List getEntryList() { return _EntryList; }
           public void setEntryList(List listname) { _EntryList = listname; }
       
          /** 画面パラメータ（最大表示行数）取得アクセスキー */
           private final static int _DISPLAY_CD_PARENT = 10;
       
           /**
            * 表示最大行数制限処理
            *
            * @param key アクセスキー
            * @param size 対象行数
            * @return 異常なし true エラー false
            */
           private boolean checkMaxDispLine(int key, long rowCount) throws FoundationException
           {
               ScreenParam sp = new ScreenParam(this.getClass());
               int maxLine = sp.getMaxLine(conn,key);
               if(maxLine != 0 && rowCount==maxLine +1)
               {
          ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          emsg = new ExpjMessage( "ZZ01006", "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + getsysPLANT_CD() );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
                   return false;
               }
               return true;
           }
           //------------------------------------------------------------------------------
       
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
                   AC0080010Struct dateStruct = (AC0080010Struct)dateList.get(0);
                   DateConverter dc = new DateConverter();
                   _sysDate = dc.str2date(dateStruct.gets_BUSINESS_DATE());
               } else{
          Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
          setErrorMessage("AC10026", Message);
                   return false;
               }
       
               return true;
       
           }
       
        /*
         * デフォルト生産計画期間日付取得設定
         *
         * @return	なし
         */
        private void setDefaultPeriodDate() throws ExpjException
        {
               // 業務運用日の取得
         Date dateBusinessOprDate = null;
         boolean bResult = false;
         
               try
               {
          if(getSystemDate() == true) {
           dateBusinessOprDate = _sysDate;
          }
                
          // デフォルト生産計画期間日付取得
          String strDefDate[] = {"", ""};
       
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
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
         }
         catch(FoundationException fe)
         {
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
         }
         catch(ExpjException ex){
          throw ex;
         }
         catch(Exception e){
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
         }
        }
           //------------------------------------------------------------------------------
         
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
        private void setInfoMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
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

        //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                      //---------------------------------------------------------------------
              
              
                      // 処理直前のstruct情報を退避
                      AC0080010Struct copy_struct = new AC0080010Struct();
                      copy_struct.copy(struct);
                
                // 読込前に状態を初期化
                setReadStatus(INITIAL);
                
                List listMessage = new ArrayList();
                String Message = "";
              
                      // 処理結果フラグ初期化
                      boolean result = true;
              
                      // 表示されているリストをクリアする
                      list.clear();
                      _readList.clear();
                 
                      try {
              
                          // 計画期間チェック用に生産計画期間を変更
                          DateConverter dc = new DateConverter();
                          Date fromDate = dc.str2date(struct.getw_DATE_FROM());
                          Date toDate = dc.str2date(struct.getw_DATE_TO());
              
                          // エラーチェック
                          // 工場コードが指定された場合
                          if(!(struct.getw_PLANT_CD()).equals("")) {
                          	// 工場コードの存在チェック
                              List plantList = entity.mM_PLANT.read(conn, struct);
                              if(plantList.size() <= 0) {
                                  // 読込処理失敗：工場コードが存在しません
                                  struct.setPLANT_NAME("");
                   Message = "M_PLANT.PLANT_CD:" + struct.getw_PLANT_CD();
                   setErrorMessage("AC10001", Message);
                                  result = false;
                               setReadStatus(INITIAL);
                              } else {
                                  AC0080010Struct plantStruct = (AC0080010Struct)plantList.get(0);
                                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
              
                                  // カレンダデータ取得
                                  List dateList = entity.mM_CAL.read(conn, struct);
                                  if(dateList.size() > 0) {
                                      AC0080010Struct dateStruct = (AC0080010Struct)dateList.get(0);
              
                                      // カレンダ範囲のチェック
                                      if(dateStruct.gets_MIN_CAL_DATE() != null &&
                                         dateStruct.gets_MAX_CAL_DATE() != null) {
              
                                          Date minCalDate = dc.str2date(dateStruct.gets_MIN_CAL_DATE());
                                          Date maxCalDate = dc.str2date(dateStruct.gets_MAX_CAL_DATE());
              
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
                      Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
                      setErrorMessage("AC10005", Message);
                                           setReadStatus(INITIAL);
                                              result = false;
                                          }
                                      } else {
                                          // カレンダ取得失敗
                     Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
                     setErrorMessage("AC10005", Message);
                                       setReadStatus(INITIAL);
                                          result = false;
                                      }
              
                                  } else {
                                      // カレンダ取得失敗
                    Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getw_PLANT_CD();
                    setErrorMessage("AC10005", Message);
                                   setReadStatus(INITIAL);
                                      result = false;
                                  }
              
                              }
                          }
                          // エラーがない場合
                          if(result) {
                              // オーダデマンド区分設定(未紐付けフラグがONの時"デマンド"のみ検索)
                              // 未紐付けフラグ設定(ONの時" ",OFFの時null)
                              if(struct.geth_DEMAND_FLG().equals("1")) {
                                  struct.sets_ODR_DMD_TYP1("3");
                                  struct.sets_ODR_DMD_TYP2("3");
                                  struct.sets_UN_CONNECT_DEMAND(" ");
                              } else if(struct.geth_DEMAND_FLG().equals("0") &&
                                        struct.geth_ODR_DMD_TYP().equals("1")) {
                                  struct.sets_ODR_DMD_TYP1("2");
                                  struct.sets_ODR_DMD_TYP2("3");
                                  struct.sets_UN_CONNECT_DEMAND(null);
                              } else if(struct.geth_DEMAND_FLG().equals("0") &&
                                        struct.geth_ODR_DMD_TYP().equals("2")) {
                                  struct.sets_ODR_DMD_TYP1("2");
                                  struct.sets_ODR_DMD_TYP2("2");
                                  struct.sets_UN_CONNECT_DEMAND(null);
                              } else if(struct.geth_DEMAND_FLG().equals("0") &&
                                        struct.geth_ODR_DMD_TYP().equals("3")) {
                                  struct.sets_ODR_DMD_TYP1("3");
                                  struct.sets_ODR_DMD_TYP2("3");
                                  struct.sets_UN_CONNECT_DEMAND(null);
                              }

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
                              
                            int maxLine = sp.getMaxLine(conn, 10);
                  			if(maxLine != 0) {
                  				struct.setROW_COUNT(String.valueOf(maxLine));
                  			} else {
                  				struct.setROW_COUNT(null);
                  			}
                  			_readList = entity.mT_EXTERNAL_PLANCnt.read(conn, struct);
                  			long rowCount = Long.parseLong(((AC0080010Struct)_readList.get(0)).getl_COUNT());
                  			// 検索結果が０件の場合
                  			if(rowCount==0) {
                                // 状態に対象データなしを設定
                                setReadStatus(NOT_FOUND);
                                listMessage.add("T_OD.PLANT_CD:" + struct.getw_PLANT_CD());
                                listMessage.add("T_OD.ITEM_CD:" + struct.getw_ITEM_CD());
                                listMessage.add("T_OD.PRD_DUE_DATE[FROM]:" + struct.getw_DATE_FROM());
                                listMessage.add("T_OD.PRD_DUE_DATE[TO]:" + struct.getw_DATE_TO());
                                listMessage.add("T_OD.OD_TYP:" + struct.geth_ODR_DMD_TYP());
                                setErrorMessage("ZZ06001", listMessage);
                                if(list!=null && list.size()>0){
                                	list.clear();
                                }
                            // 検索結果が１件以上ある場合
                            } else {
                                // 表示最大行数制限処理
                                if(!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
                                	if(list!=null && list.size()>0){
                                    	list.clear();
                                    }
                                   // 状態に最大表示行数以上を設定
                                   setReadStatus(TOO_MANY);
                                 return;
                                }
                  			// 検索結果取得
                              _readList = entity.mT_EXTERNAL_PLAN.read(conn, struct);
                              setReadStatus(NORMAL);
                                  for(int i=0; i < _readList.size(); i++) {
                                      AC0080010Struct viewStruct = (AC0080010Struct)_readList.get(i);
                                      String stOdTyp = viewStruct.gets_OD_TYP();
                                      // 手配数、状態区分の設定
                                      // 2:オーダの場合
                                      if(("2").equals(stOdTyp)) {
                                        // オーダ数の設定
                                        viewStruct.setODR_DM_QTY(viewStruct.getODR_QTY());
                                        // オーダ状態区分の設定
                                        viewStruct.setw_STS_TYP(
                                            getTypName(_ODR_STS_TYP, viewStruct.getw_ODR_STS_TYP())
                                        );
                                      // 3:デマンドの場合
                                      } else if(("3").equals(stOdTyp)) {
                                        // デマンド数の設定
                                        viewStruct.setODR_DM_QTY(viewStruct.getDM_QTY());
                                        // デマンド状態区分の設定
                                        viewStruct.setw_STS_TYP(
                                            getTypName(_DM_STS_TYP, viewStruct.getw_DM_STS_TYP())
                                        );
                                      } else {
                                        viewStruct.setODR_DM_QTY("");
                                      }
              
                                      // コンボボックスより
                                      // オーダデマンド区分、内外作区分設定
                                      viewStruct.setOD_TYP(getTypName(_OD_COMBO_TYP, stOdTyp));
                                      viewStruct.setOUTSIDE_TYP(
                                          getTypName(_OUTSIDE_COMBO_TYP, viewStruct.gets_OUTSIDE_TYP())
                                      );
                                  }
                                  }
                              }
                          
              
                          // エラーがない場合
                          if(readStatus == NORMAL) {
                  setList(_readList);
                          }
              
                      } catch(SQLException e) {
                          setSqlExceptionMsg(e);
                      }
              
                      //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * ＣＳＶ出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcsv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcsv");
			//{{user_implement_dev:<controlcsv>
                      //---------------------------------------------------------------------
              
                // CsvWriterを生成
                csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
                      String strFilePath = null;
              
                      try {
                          csvList = new ArrayList();
              
                          // 0件の場合終了
                          if(_readList.size() <= 0) return;
              
                          // CSV情報の作成
                          String title[] = {
								"Expj.EXTERNAL_PLAN_CD_1" ,
								"Expj.ITEM_CD" ,
								"Expj.ITEM_NAME" ,
								"Expj.LIMIT" ,
								"Expj.JOB_ODR_QTY_1" ,
								"Expj.OD_TYP" ,
								"Expj.Cmt0446" ,
								"Expj.OUTSIDE_TYP" 
                          };
                          csvList.add(title);
                          for(int i=0; i<_readList.size(); i++) {
                              AC0080010Struct csvStruct = (AC0080010Struct)_readList.get(i);
              
                              String csvStr [] = new String[title.length];
                              csvStr[0] = csvStruct.getEXTERNAL_PLAN_CD();
                              csvStr[1] = csvStruct.getITEM_CD();
                              csvStr[2] = csvStruct.getITEM_NAME();
    	                      csvStr[3] = csvStruct.getPRD_DUE_DATE();
                              csvStr[4] = csvStruct.getODR_DM_QTY();
                              csvStr[5] = csvStruct.getOD_TYP();
                              csvStr[6] = csvStruct.getw_STS_TYP();
                              csvStr[7] = csvStruct.getOUTSIDE_TYP();
                              csvList.add(csvStr);
                          }
              
                 // CSV作成
                 csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
                 strFilePath = csvWriter.getFilePath();
                 setInfoMessage("Completion of CSV-data output.");
                 
                 // 出力ファイルパス設定
                 struct.setDOWNLOAD_FILE(strFilePath);
              
              
                       
                      }catch(Exception e){
                 ExpjMessage msg = new ExpjMessage( "ZZ01006", "CSV output failure" );
                 sysLog.warning(msg, getsysUSER_CD());
              
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
                      }
                      //---------------------------------------------------------------------
              
                //}}user_implement_dev:<controlcsv>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcsv");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                      //------------------------------------------------------------------
              
                      try {
                          // struct初期化
                          struct.init();
              
                          // 自工場コード設定
                          struct.setw_PLANT_CD(getsysPLANT_CD());
              
                          // デフォルト生産計画期間取得設定
                          setDefaultPeriodDate();
              
                          // 表示リストをクリア
                          list.clear();
              
                          // モード設定
                          setReadStatus(INITIAL);

                          //時刻管理パラメータ取得
                          List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
                          if(listTimeCtrl == null || listTimeCtrl.size() <=0){
                              struct.setTIME_CTRL("false");
                              _flgTimeCtrl = "false";
                          }else{
                              struct.setTIME_CTRL(((AC0080010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
                              _flgTimeCtrl = struct.getTIME_CTRL();
                          }

                      }catch(AlarmMessageException msg) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(msg, emsg);
                 
                 throw ee;
                      } catch (SQLException e) {
                       throw new ExpjException(e);
                      }
                      //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 選択削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
              
                      // トランザクション結果フラグ
                      boolean result = true;
              
                String Message = "";
                 
                      try{
                          // トランザクション開始
                          conn.beginTransWeb();
              
                       AC0080010Struct delStruct = new AC0080010Struct();
                       
                          // チェックボックスがonの明細のみＤＢ更新する
                          for(int i = 0; i < struct.getList_ITEM_CD().size(); i++) {
              
                              // 選択行の情報を取得
                           delStruct.importData(struct, i);
                           
                              // User_IDを削除Structに設定
                              delStruct.setsUser_ID(struct.getsUser_ID());
              
                           // 更新チェックの確認
                  List e_list = entity.mT_EXTERNAL_PLAN4Update.read(conn, delStruct);
                  if(e_list.size() <= 0){
                   Message = "T_EXTERNAL_PLAN.OD_NO:" + delStruct.geth_OD_NO();
                   setErrorMessage("ZZ06001", Message);
                   result = false;
                                  break;
                  }
                           String ex_modify = ((AC0080010Struct)e_list.get(0)).getMODIFY_COUNT();
                           if (delStruct.getEX_MODIFY_COUNT().equals(ex_modify) == false)
                  {
                   Message = "T_EXTERNAL_PLAN.OD_NO:" + delStruct.geth_OD_NO();
                   setErrorMessage("ZZ01105", Message);
                   result = false;
                                  break;
                  }
                           
                              // 外部計画処理区分(2:変更)と外部計画削除(1:削除対象)フラグの更新
                              int cnt1 = entity.mT_EXTERNAL_PLAN.update(conn, delStruct);
              
                              // 更新処理が成功した場合、削除処理
                              if(0 < cnt1) {
                               
                            // 更新チェックの確認
                   List o_list = entity.mT_OD4Update.read(conn, delStruct);
                   if(o_list.size() <= 0){
                    Message = "T_OD.OD_NO:" + delStruct.geth_OD_NO();
                    setErrorMessage("ZZ06001", Message);
                    result = false;
                                   break;
                   }
                            String od_modify = ((AC0080010Struct)o_list.get(0)).getMODIFY_COUNT();
                            if (delStruct.getOD_MODIFY_COUNT().equals(od_modify) == false)
                   {
                    Message = "T_OD.OD_NO:" + delStruct.geth_OD_NO();
                    setErrorMessage("ZZ01105", Message);
                    result = false;
                                   break;
                   }
                               
                                  // 外部計画番号をキーとし所要量レコードを削除
                                  int cnt2 = entity.mT_OD.delete(conn, delStruct);
              
                                  // 削除対象がなかった場合
                                  if(cnt2 < 1) {
                                      // 削除処理失敗：対象データが存在しません
                    Message = "T_OD.OD_NO:" + delStruct.geth_OD_NO();
                    setErrorMessage("ZZ06001", Message);
                                      result = false;
                                      break;
                                  }
                              } else {
                                  // 更新処理失敗：対象データが存在しません
                   Message = "T_EXTERNAL_PLAN.OD_NO:" + delStruct.geth_OD_NO();
                   setErrorMessage("ZZ06001", Message);
                                  result = false;
                                  break;
                              }
                          }
              
                     } catch(SQLException e) {
                         setSqlExceptionMsg(e);
              
                      } finally {
                          try {
                              if(result) {
                                  // コミット
                                  conn.commit();
              
                                  // 削除後の再検索
                                  controlselect();
                              } else {
                                  // ロールバック
                                  getMessage().clearWarn();
                                  getMessage().clearInfo();
                                  conn.rollback();
                              }
                          } catch(Exception e) {
                              e.printStackTrace();
                          }
                       
                      }
              
                //}}user_implement_dev:<controldelete>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlchoiceAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlchoiceAll");
			//{{user_implement_dev:<controlchoiceAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlchoiceAll>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlchoiceAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcancelAll");
			//{{user_implement_dev:<controlcancelAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlcancelAll>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlcancelAll");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                          
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                try {
              
                          // コンボボックスデータ用意
                          ComboBox controller = new ComboBox(conn, sysUSER_CD);
                          // OD_COMBO_TYPの文字列で定義されたデータをComboStruct型に設定
                          _ODR_DMD_TYP = controller.getData("ODR_DMD_TYP");            // オーダデマンド区分(条件指定)
                          _OD_COMBO_TYP = controller.getData("OD_TYP");                // オーダデマンド区分
                          _OUTSIDE_COMBO_TYP = controller.getData("OUTSIDE_TYP");      // 内外作区分
                          _ODR_STS_TYP = controller.getData("ODR_STS_TYP");            // オーダ状態区分
                          _DM_STS_TYP = controller.getData("DM_STS_TYP");              // デマンド状態区分
              
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
                      //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0080");
		logger.entering("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア

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
                 struct.setDOWNLOAD_FILE((String)null);
                 // コンボボックス部品のデータのセットはここに記述してください。
                 // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv") ) {
				controlcsv();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("choiceAll") ) {
				controlchoiceAll();
			} else if( button.equals("cancelAll") ) {
				controlcancelAll();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                      //------------------------------------------------------------------
                          // コンボボックスデータ設定
                          struct.setList_w_OD_TYP_val(_ODR_DMD_TYP.getValList());
                          struct.setList_w_OD_TYP_name(_ODR_DMD_TYP.getExplanList());
                          struct.setList_OD_TYP_val(_OD_COMBO_TYP.getValList());
						  struct.setList_OD_TYP_name(_OD_COMBO_TYP.getExplanList());
                          struct.setList_OUTSIDE_TYP_val(_OUTSIDE_COMBO_TYP.getValList());
                          struct.setList_OUTSIDE_TYP_name(_OUTSIDE_COMBO_TYP.getExplanList());
                          struct.setList_ODR_STS_TYP_val(_ODR_STS_TYP.getValList());
                          struct.setList_ODR_STS_TYP_name(_ODR_STS_TYP.getExplanList());
                          struct.setList_DM_STS_TYP_val(_DM_STS_TYP.getValList());
                          struct.setList_DM_STS_TYP_name(_DM_STS_TYP.getExplanList());
              
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)(ame.getMessages()));
                 throw ee;
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
//			throw new FoundationException("AC0080010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0080010-E999","CSVの出力処理"));
			throw new FoundationException("AC0080010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0080010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0080010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                          
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0080010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0080010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0080010Entity entity;
	protected AC0080010Struct struct;
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

		entity = new AC0080010Entity();
		struct = new AC0080010Struct();

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
	 * AC0080010クラスの標準コンストラクタ
	 */
	public AC0080010Control() throws BusinessProcessException, FoundationException
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
				AC0080010Struct key = (AC0080010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP") && key.getw_OD_TYP() != null) {
					msgKey.setKeyValue("w_OD_TYP", key.getw_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP_name") && key.getw_OD_TYP_name() != null) {
					msgKey.setKeyValue("w_OD_TYP_name", key.getw_OD_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_OD_TYP_val") && key.getw_OD_TYP_val() != null) {
					msgKey.setKeyValue("w_OD_TYP_val", key.getw_OD_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_DEMAND_FLG") && key.geth_DEMAND_FLG() != null) {
					msgKey.setKeyValue("h_DEMAND_FLG", key.geth_DEMAND_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_DM_QTY") && key.getODR_DM_QTY() != null) {
					msgKey.setKeyValue("ODR_DM_QTY", key.getODR_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_DMD_TYP") && key.geth_ODR_DMD_TYP() != null) {
					msgKey.setKeyValue("h_ODR_DMD_TYP", key.geth_ODR_DMD_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_STS_TYP") && key.getw_STS_TYP() != null) {
					msgKey.setKeyValue("w_STS_TYP", key.getw_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c_UN_CONNECT_DEMAND") && key.getc_UN_CONNECT_DEMAND() != null) {
					msgKey.setKeyValue("c_UN_CONNECT_DEMAND", key.getc_UN_CONNECT_DEMAND());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_FROM") && key.getw_TIME_FROM() != null) {
					msgKey.setKeyValue("w_TIME_FROM", key.getw_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_TIME_TO") && key.getw_TIME_TO() != null) {
					msgKey.setKeyValue("w_TIME_TO", key.getw_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE") && key.gets_MIN_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MIN_CAL_DATE", key.gets_MIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE") && key.gets_MAX_CAL_DATE() != null) {
					msgKey.setKeyValue("s_MAX_CAL_DATE", key.gets_MAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_CD") && key.gets_PLANT_CD() != null) {
					msgKey.setKeyValue("s_PLANT_CD", key.gets_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("s_OD_TYP") && key.gets_OD_TYP() != null) {
					msgKey.setKeyValue("s_OD_TYP", key.gets_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP_name") && key.getOD_TYP_name() != null) {
					msgKey.setKeyValue("OD_TYP_name", key.getOD_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP_val") && key.getOD_TYP_val() != null) {
					msgKey.setKeyValue("OD_TYP_val", key.getOD_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP") && key.gets_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("s_OUTSIDE_TYP", key.gets_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE") && key.gets_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("s_BUSINESS_DATE", key.gets_BUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_UN_CONNECT_DEMAND") && key.gets_UN_CONNECT_DEMAND() != null) {
					msgKey.setKeyValue("s_UN_CONNECT_DEMAND", key.gets_UN_CONNECT_DEMAND());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP1") && key.gets_ODR_DMD_TYP1() != null) {
					msgKey.setKeyValue("s_ODR_DMD_TYP1", key.gets_ODR_DMD_TYP1());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP2") && key.gets_ODR_DMD_TYP2() != null) {
					msgKey.setKeyValue("s_ODR_DMD_TYP2", key.gets_ODR_DMD_TYP2());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP") && key.getw_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP", key.getw_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_DM_STS_TYP") && key.getw_DM_STS_TYP() != null) {
					msgKey.setKeyValue("w_DM_STS_TYP", key.getw_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_name") && key.getODR_STS_TYP_name() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_name", key.getODR_STS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_val") && key.getODR_STS_TYP_val() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_val", key.getODR_STS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_name") && key.getDM_STS_TYP_name() != null) {
					msgKey.setKeyValue("DM_STS_TYP_name", key.getDM_STS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_val") && key.getDM_STS_TYP_val() != null) {
					msgKey.setKeyValue("DM_STS_TYP_val", key.getDM_STS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_OD_NO") && key.geth_OD_NO() != null) {
					msgKey.setKeyValue("h_OD_NO", key.geth_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO") && key.geth_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("h_PARENT_OD_NO", key.geth_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD") && key.getEXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_CD", key.getEXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("EX_MODIFY_COUNT") && key.getEX_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("EX_MODIFY_COUNT", key.getEX_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT") && key.getOD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("OD_MODIFY_COUNT", key.getOD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL") && key.getw_DATE_FROM_ALL() != null) {
					msgKey.setKeyValue("w_DATE_FROM_ALL", key.getw_DATE_FROM_ALL());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL") && key.getw_DATE_TO_ALL() != null) {
					msgKey.setKeyValue("w_DATE_TO_ALL", key.getw_DATE_TO_ALL());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
					AC0080010Struct key = new AC0080010Struct();
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP")) {
						key.setw_OD_TYP(msgKey.getKeyValue("w_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP_name")) {
						key.setw_OD_TYP_name(msgKey.getKeyValue("w_OD_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_OD_TYP_val")) {
						key.setw_OD_TYP_val(msgKey.getKeyValue("w_OD_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(msgKey.getKeyValue("OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_DEMAND_FLG")) {
						key.seth_DEMAND_FLG(msgKey.getKeyValue("h_DEMAND_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_DM_QTY")) {
						key.setODR_DM_QTY(msgKey.getKeyValue("ODR_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_DMD_TYP")) {
						key.seth_ODR_DMD_TYP(msgKey.getKeyValue("h_ODR_DMD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_STS_TYP")) {
						key.setw_STS_TYP(msgKey.getKeyValue("w_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c_UN_CONNECT_DEMAND")) {
						key.setc_UN_CONNECT_DEMAND(msgKey.getKeyValue("c_UN_CONNECT_DEMAND"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_FROM")) {
						key.setw_TIME_FROM(msgKey.getKeyValue("w_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_TIME_TO")) {
						key.setw_TIME_TO(msgKey.getKeyValue("w_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("s_MIN_CAL_DATE")) {
						key.sets_MIN_CAL_DATE(msgKey.getKeyValue("s_MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_CAL_DATE")) {
						key.sets_MAX_CAL_DATE(msgKey.getKeyValue("s_MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_CD")) {
						key.sets_PLANT_CD(msgKey.getKeyValue("s_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_TYP")) {
						key.sets_OD_TYP(msgKey.getKeyValue("s_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP_name")) {
						key.setOD_TYP_name(msgKey.getKeyValue("OD_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP_val")) {
						key.setOD_TYP_val(msgKey.getKeyValue("OD_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP")) {
						key.sets_OUTSIDE_TYP(msgKey.getKeyValue("s_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_BUSINESS_DATE")) {
						key.sets_BUSINESS_DATE(msgKey.getKeyValue("s_BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_UN_CONNECT_DEMAND")) {
						key.sets_UN_CONNECT_DEMAND(msgKey.getKeyValue("s_UN_CONNECT_DEMAND"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP1")) {
						key.sets_ODR_DMD_TYP1(msgKey.getKeyValue("s_ODR_DMD_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_DMD_TYP2")) {
						key.sets_ODR_DMD_TYP2(msgKey.getKeyValue("s_ODR_DMD_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP")) {
						key.setw_ODR_STS_TYP(msgKey.getKeyValue("w_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_DM_STS_TYP")) {
						key.setw_DM_STS_TYP(msgKey.getKeyValue("w_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_name")) {
						key.setODR_STS_TYP_name(msgKey.getKeyValue("ODR_STS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_val")) {
						key.setODR_STS_TYP_val(msgKey.getKeyValue("ODR_STS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_name")) {
						key.setDM_STS_TYP_name(msgKey.getKeyValue("DM_STS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_val")) {
						key.setDM_STS_TYP_val(msgKey.getKeyValue("DM_STS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_NO")) {
						key.seth_OD_NO(msgKey.getKeyValue("h_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_OD_NO")) {
						key.seth_PARENT_OD_NO(msgKey.getKeyValue("h_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_CD")) {
						key.setEXTERNAL_PLAN_CD(msgKey.getKeyValue("EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EX_MODIFY_COUNT")) {
						key.setEX_MODIFY_COUNT(msgKey.getKeyValue("EX_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT")) {
						key.setOD_MODIFY_COUNT(msgKey.getKeyValue("OD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM_ALL")) {
						key.setw_DATE_FROM_ALL(msgKey.getKeyValue("w_DATE_FROM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO_ALL")) {
						key.setw_DATE_TO_ALL(msgKey.getKeyValue("w_DATE_TO_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
