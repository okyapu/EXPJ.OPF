/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0080/src/com/nec/jp/orteus/metamorBase/AA0080/AA0080020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0080;

import com.nec.jp.orteus.metamorBase.AA0080.*;
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
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0080020Control
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
       
        public AA0080020Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
       
       //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
       //-----------------------------------------------------------------------------
       
        /**
         * メッセージ取得 
         * @return メッセージ
         */
        public MessageStruct getMessage()
        {
         return msgStruct;
        }
       
        /**
         * メッセージ設定
         * @param メッセージ
         */
        public void setMessage(MessageStruct msg)
        {
         msgStruct = msg;
        }
       
       //-----------------------------------------------------------------------------
       
        /** カレンダー */
        Calendar _calendar = new GregorianCalendar();
       
        /** 日付フォーマット1 */
        //private SimpleDateFormat _dateFormat1 = new SimpleDateFormat(_pattern1);
       
        /** 日付フォーマット2 */
        //private SimpleDateFormat _dateFormat2 = new SimpleDateFormat(_pattern2);
       
        /** 日付フォーマット3 */
        //private SimpleDateFormat _dateFormat3 = new SimpleDateFormat(_pattern3);
       
        /** 日付フォーマットパターン1 */
        private final static String _pattern1 = "yyyy/MM/dd";
       
        /** 日付フォーマットパターン2 */
        private final static String _pattern2 = "yyyy/MM";
       
        /** 日付フォーマットパターン3 */
        private final static String _pattern3 = "yyyy";
       
       
        /**
         * Date型 ⇒ String型。
         * @return String 指定したパターンも日付文字列
         */
        public String dateToString(Date date, String pattern)
        {
         if(_pattern1.equals(pattern) == true)
          return Converter.dateToStr(date, _pattern1);
         else if(_pattern2.equals(pattern) == true)
          return Converter.dateToStr(date, _pattern2);
         else
          return Converter.dateToStr(date, _pattern3);
        }
       
        /**
         * String型 ⇒ Date型。
         * @return Date 日付
         */
        public Date stringToDate(String date, String pattern) throws ParseException
        {
         if(_pattern1.equals(pattern) == true)
          return Converter.strToDate(date, _pattern1);
         else if(_pattern2.equals(pattern) == true)
          return Converter.strToDate(date, _pattern2);
         else
          return Converter.strToDate(date, _pattern3);
        }
       
       //-- 変数定義 ------------------------------------------------------------------
       
        /** カレンダー検索(月)のパターン */
        private final static String _selectMonth = "/__";
       
        /** カレンダー検索(年)のパターン */
        private final static String _selectYear = "/__/__";
       
        /** ブランク */
        private final static String _brank = " ";
       
        /** 空文字 */
        private final static String _emptyStr = "";
       
        /** 休日 */
        private final static Integer _holidayOn = new Integer(1);
       
        /** 稼働日 */
        private final static Integer _holidayOff = new Integer(0);
       
       //---------- カレンダ情報(月)の処理 -------------------------------------------
       
        /** 取得月のデフォルト */
        private String _monthDefoult = "　　　年 　　月";
       
        /** 取得月 */
        private String _targetMonth = _monthDefoult;
       
        /** 取得年 */
        private String _targetYear = null;
       
        /** カレンダリスト */
        private List _calendarList = new ArrayList(0);
       
        /** 
         * カレンダリスト取得 
         * @return カレンダリスト
        */
        public List getCalendarList(){ return _calendarList; }
       
        /** 
         * カレンダリスト設定
         * @param カレンダリスト
         */
        public void setCalendarList(List list){ _calendarList = list; }
       
       
        /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
        private AA0080020Struct _keyStruct = new AA0080020Struct();
       
        /** キー情報Structの取得 */
        public AA0080020Struct getKeyStruct(){ return _keyStruct; }
        
        /** キー情報Structの設定 */
        public void setKeyStruct(AA0080020Struct struct){ _keyStruct.copy(struct); }
       
        //------- 曜日取得 -------------------------------------------------------------
       
        /** 曜日配列 */
        private String[] days = new String[7];

		/** 
        * システム使用ユーザのロケールによる曜日を返します。
        * @return 曜日配列
        */
				private String[] getDaysByLocale() {
					String _userCd = getsysUSER_CD();
					String _locale = CoreTools.getLocale(_userCd);
					ResourceBundle rb = CoreTools.getResourceBundle("OrteusUserDic",_locale);
					String[] _localedays = {
						CoreTools.getRBString("Expj.Cmt0110",rb),
						CoreTools.getRBString("Expj.Cmt0104",rb), 
						CoreTools.getRBString("Expj.Cmt0105",rb), 
						CoreTools.getRBString("Expj.Cmt0106",rb),
						CoreTools.getRBString("Expj.Cmt0107",rb), 
						CoreTools.getRBString("Expj.Cmt0108",rb), 
						CoreTools.getRBString("Expj.Cmt0109",rb)
					};
					return _localedays;
				}
		
        /** 
         * 曜日設定
         * @param Structリスト
        */
        public void setDayWeek(List dayList) throws ParseException
        {
         for(int i = 0; i < dayList.size(); i++)
         {
          AA0080020Struct workStruct = (AA0080020Struct)dayList.get(i);
          _calendar.setTime(stringToDate(workStruct.getCAL_DATE(), _pattern1));
          workStruct.setCAL_DATE_WEEK(days[_calendar.get(_calendar.DAY_OF_WEEK) - 1]);
         }
        }
        
        
       
       //---------年度別カレンダ --------------------------------------------------
       
        /** 年の最終日 */
        private final static String _endDay = "/12/31";
       
        /** 年の開始日 */
        private final static String _firstDay = "/01/01";
       
        /** 日付フォーマット1 */
        //private SimpleDateFormat _yearDaysFormat = new SimpleDateFormat("D");
       
        /** 年度別用Struct */
        private AA0080020Struct _yearStruct = new AA0080020Struct();
       
        /** 
         * 年間日数取得
         * @param 年(YYYY指定)
         * @return 日数
        */
        public String getYearAllDay(String year) throws ParseException
        {
         String endDay = year + _endDay;
         //return _yearDaysFormat.format(stringToDate(endDay, _pattern1));
         return Converter.dateToStr(stringToDate(endDay, _pattern1), "D");
        }
       
        /**
         * 年始からの日数取得
         * @param 日付(YYYY/MM/DD)
         * @return 日数
        */
        public String getYearDay(String day) throws ParseException
        {
         //return _yearDaysFormat.format(stringToDate(day, _pattern1));
         return Converter.dateToStr(stringToDate(day, _pattern1), "D");
        }
       
        /** 
         * 年度別カレンダ作成
         * @param カレンダ番号
         * @param 年(YYYY指定)
        */
        public void makeYearDays(String no, String year)
            throws FoundationException, SQLException, ParseException
        {
         String yearStr = _emptyStr;		// 年間休日文字列格納
       
         // カレンダ明細検索
         struct.setCAL_DATE(year + _selectYear);
         List calList = entity.mselectM_CAL_month.read(conn, struct);
       
         // 年間日数取得
         int yearNum = (Integer.valueOf(getYearAllDay(year))).intValue();
       
         if(calList.size() <= 0){
          // 明細なし
          for(int i = 0; i < yearNum; i++)
           yearStr = yearStr + _brank;
         }
         else{
          // 年始から日付取得
          AA0080020Struct firstStruct = (AA0080020Struct)calList.get(0);
          int dayfrom = (Integer.valueOf(getYearDay(firstStruct.getCAL_DATE()))).intValue();
       
          // 年始から明細なし部分の休日文字列作成
          for(int i = 1; i < dayfrom; i++){
           yearStr = yearStr + _brank;
          }
       
          // カレンダ作成
          _calendar.setTime(stringToDate(firstStruct.getCAL_DATE(), _pattern1));
       
          // 明細あり部分の休日文字列作成
          for(int i = 0; i < calList.size(); ){
           AA0080020Struct workStruct = (AA0080020Struct)calList.get(i);
           // 日付判定
           if(_calendar.getTime().getTime() == 
             (stringToDate(workStruct.getCAL_DATE(), _pattern1)).getTime()){
            yearStr = yearStr + workStruct.getHOLIDAY_FLG().toString();
            i++;
           }
           else{
            yearStr = yearStr + _brank;
           }
           _calendar.add(Calendar.DATE, 1);
          }
       
          // カレンダ明細の最終日付の年始からの日付取得
          AA0080020Struct endStruct = (AA0080020Struct)calList.get(calList.size() -1);
          int dayto = (Integer.valueOf(getYearDay(endStruct.getCAL_DATE()))).intValue();
       
          if(dayto != yearNum){
           // 明細最終日から年末までの日付取得
           int num = yearNum - dayto;
       
           // 明細最終日から年末までの休日文字列作成
           for(int i = 0; i < num; i++){
            yearStr = yearStr + _brank;
           }
          }
         }
       
         // 更新
         struct.setCAL_YEAR(year);
         struct.setCAL_YEAR_HOLIDAY(yearStr);
         List yearList = entity.mselectT_CAL_BY_YEAR.read(conn, struct);
         if(yearList.size() <= 0)
          entity.minsertT_CAL_BY_YEAR.create(conn, struct);
         else
          entity.mupdateT_CAL_BY_YEAR.update(conn, struct);
       
        }
       
       //------------------------------------------------------------------------------
        /**
         * SQLExceptionエラーメッセージ設定
         * @param SQLException
         * @param 出力エラーメッセージ
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
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
       
       //------------------------------------------------------------------------------
        /** 最新カレンダリスト */
        private List _nowCalendarList = new ArrayList(0);
       
        /** 
         * 最新カレンダリスト取得 
         * @return 最新カレンダリスト
        */
        public List getNowCalendarList(){ return _nowCalendarList; }
       
        /** 
         * 最新カレンダリスト設定
         * @param 最新カレンダリスト
         */
        public void setNowCalendarList(List list){ _nowCalendarList = list; }
       
       
        /**
         * 対象一覧情報により読込状態を再設定する処理
         * @param 表示対象リスト
         */
        private void renewalReadStatus(List listTarget)
        {
         if(listTarget != null && listTarget.size() > 0)
         {
          setReadStatus(NORMAL);
         }
         else
         {
          setReadStatus(NOT_FOUND);
         }
        }
       
        /**
         * 親データ読込処理
         *
         */
        public boolean readParentData() throws BusinessProcessException, FoundationException
        {
         String Message = "";
       
         boolean bSuccess = false;
         try{
          // クリア
          _calendarList.clear();
          _keyStruct.clear();
          _keyStruct.setCAL_NO(struct.getCAL_NO());
          struct.setDATE_FROM((String)null);
          struct.setDATE_TO((String)null);
          struct.setCAL_NAME((String)null);
       
          // カレンダヘッダ検索
          List hList = entity.mselectM_CAL_H.read(conn, struct);
          if(hList.size() <= 0){
           // 読込処理失敗：指定したカレンダ番号は未登録です
           Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
           
           setErrorMessage("AA01013", Message);
          }else{
           // カレンダ名設定
           AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
           _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
           struct.setCAL_NAME(workStruct.getCAL_NAME());
          }
       
          // SYSTEM_PARAMETERからTIME_CTRL の値を取得する
          AA0080020Struct wSt = new AA0080020Struct();
          wSt.setsysName("TIME_CTRL");
          List lst = entity.mselectSYS_PARAMETER.read(conn,wSt);
          if(lst.size() <=0 )
          {
        	  Message = "SYS_PARAMETER.NAME:" + wSt.getsysName();
              setErrorMessage("AC00106", Message);
          }else{
        	  String timeCtl = ((AA0080020Struct)lst.get(0)).getsysValue();
        	  if(timeCtl.toLowerCase().equals("false"))
        	  {
        		  struct.seth_TIME_CTRL("0");
        	  }else{
        		  struct.seth_TIME_CTRL("1");
        	  }
          }
          
          // チェックでエラーが発生していない場合
          if(msgStruct.sizeError() <= 0)
          {
           List calList = null;
       
           // カレンダ作成済のFROM～TO取得
           calList = entity.mselectM_CAL_max_min.read(conn, struct);
           if(calList.size() > 0){
            // FROM～TO設定
            AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
            
            // FROM～TO日付の取得判定
            if(workStruct.getDATE_FROM() != null &&
               workStruct.getDATE_TO() != null){
             struct.setDATE_FROM(workStruct.getDATE_FROM());
             struct.setDATE_TO(workStruct.getDATE_TO());
        
             _keyStruct.setDATE_FROM(workStruct.getDATE_FROM());
             _keyStruct.setDATE_TO(workStruct.getDATE_TO());
        
             // 検索
             if(_targetMonth.equals(_monthDefoult) == false){
              struct.setCAL_DATE(_targetMonth + _selectMonth);
             }
             else{
              // システム日付取得
              Date target = new Date(System.currentTimeMillis());
              String s_sysDate = dateToString(target, _pattern2);
              String s_sysYear = dateToString(target, _pattern3);
              _targetMonth = s_sysDate;		// 検索月保存
              _targetYear = s_sysYear;		// 検索年保存
         
              struct.setCAL_DATE(s_sysDate + _selectMonth);
             }
             _calendarList = entity.mselectM_CAL_month.read(conn, struct);
       
             // 曜日設定
             setDayWeek(_calendarList);
             
             // 休日チェックボックス値設定
             for(int i = 0; i < _calendarList.size(); i++)
             {
              workStruct = (AA0080020Struct)_calendarList.get(i);
              if(workStruct.getHOLIDAY_FLG().intValue() == 1)
              {
               workStruct.setc_HOLIDAY_FLG("true");
              }
              else
              {
               workStruct.setc_HOLIDAY_FLG("NULL");
              }
              workStruct.seth_TIME_CTRL(struct.geth_TIME_CTRL());
             }
            }
           }
          }
          list = _calendarList;
         }
         catch(ParseException e){
          // 変換失敗
          
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
       
          throw ee;
       
         }catch(SQLException e){
           setSqlExceptionMsg(e);
       
         }finally{
          if(msgStruct.sizeError() <= 0){
           bSuccess = true;
       
           // 一覧情報から読込状態を再設定
           if(_calendarList != null && _calendarList.size() > 0)
           {
            setReadStatus(NORMAL);
           }
           else
           {
            setReadStatus(NOT_FOUND);
           }
       
          }else{
           bSuccess = false;
       
           // 検索状態を初期化
           setReadStatus(INITIAL);
          }
         }
         return bSuccess;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //----------------------------------------------------------------------
                // システム日付取得
                Date target = new Date(System.currentTimeMillis());
                String s_sysDate = dateToString(target, _pattern2);
                String s_sysYear = dateToString(target, _pattern3);
                _targetMonth = s_sysDate;		// 検索月保存
                _targetYear = s_sysYear;		// 検索年保存
              
                // 読込処理
                readParentData();
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * カレンダ作成ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                //----------------------------------------------------------------------
                 
                String Message = "";
                boolean bSuccess = false;
                 
                try{
                 // キー設定
                 _keyStruct.setCAL_NO(struct.getCAL_NO());
              
                 // カレンダヘッダ検索
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // 作成処理失敗：指定したカレンダ番号は未登録です", struct.getsUser_ID());
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // カレンダ名設定
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0){
                  List calList = null;
                  
                  // カレンダ作成済のFROM～TO取得
                  calList = entity.mselectM_CAL_max_min.read(conn, struct);
                  if(calList.size() <= 0){
                   struct.setDATE_FROM((String)null);
                   struct.setDATE_TO((String)null);
                  }
                  else{
                   // FROM～TO設定
                   AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
              
                   if(workStruct.getDATE_FROM() != null &&
                    workStruct.getDATE_TO() != null){
                    _calendar.setTime(stringToDate(workStruct.getDATE_TO(), _pattern1));
                    _calendar.add(Calendar.DATE, 1);
                    Date d_fromDate = _calendar.getTime();
               
                    struct.setDATE_FROM(dateToString(d_fromDate, _pattern1));
                    struct.setDATE_TO((String)null);
              
                    // FROM/TO日付設定
                    struct.setw_DATE_FROM(workStruct.getDATE_FROM());
                    struct.setw_DATE_TO(workStruct.getDATE_TO());
                    _keyStruct.setDATE_FROM(workStruct.getDATE_FROM());
                    _keyStruct.setDATE_TO(workStruct.getDATE_TO());
                   }
                   else{
                    struct.setDATE_FROM((String)null);
                    struct.setDATE_TO((String)null);
              
                    // FROM/TO日付設定
                    struct.setw_DATE_FROM((String)null);
                    struct.setw_DATE_TO((String)null);
                    _keyStruct.setDATE_FROM((String)null);
                    _keyStruct.setDATE_TO((String)null);
                   }
                  }
              
                  // 曜日の休日設定
                  struct.seth_HOLIDAY_SUN(_holidayOff);
                  struct.seth_HOLIDAY_MON(_holidayOff);
                  struct.seth_HOLIDAY_TUE(_holidayOff);
                  struct.seth_HOLIDAY_WED(_holidayOff);
                  struct.seth_HOLIDAY_THU(_holidayOff);
                  struct.seth_HOLIDAY_FRI(_holidayOff);
                  struct.seth_HOLIDAY_SAT(_holidayOff);
                  
                  // シフトコードの入力制限
                  //struct.s
              
                  // 処理成功
                  bSuccess = true;
                 }
              
                }catch(ParseException e){
                 // 変換失敗
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // エラーがある場合は、前回の状態に戻すため、servletで取得した状態を設定
                 if(bSuccess != true)
                 {
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 休日再設定ボタン押下時に実行される処理です。
	 *
	 */
	public void controlchange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlchange");
			//{{user_implement_dev:<controlchange>
                //----------------------------------------------------------------------
                
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // キー設定
                 _keyStruct.setCAL_NO(struct.getCAL_NO());
              
                 // カレンダヘッダ検索
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // 休日再設定処理失敗：指定したカレンダ番号は未登録です
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }
                 else{
                  // カレンダ名設定
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0){
                  List calList = null;
                  
                  // カレンダ作成済のFROM～TO取得
                  calList = entity.mselectM_CAL_max_min.read(conn, struct);
                  if(calList.size() <= 0){
                   // 休日再設定処理失敗：カレンダ明細データが存在しません", struct.getsUser_ID());
                   Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                   
                   setErrorMessage("ZZ06002", Message);
                  }else{
                   AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
                   if(workStruct.getDATE_FROM() == null ||
                    workStruct.getDATE_TO() == null){
                    // 休日再設定処理失敗：カレンダ明細データが存在しません
                    Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                    
                    setErrorMessage("ZZ06002", Message);
                   }else{
                    struct.setw_DATE_FROM(workStruct.getDATE_FROM());
                    struct.setw_DATE_TO(workStruct.getDATE_TO());
                    struct.setDATE_FROM((String)null);
                    struct.setDATE_TO((String)null);
                    _keyStruct.setDATE_FROM(workStruct.getDATE_FROM());
                    _keyStruct.setDATE_TO(workStruct.getDATE_TO());
              
                    // 曜日の休日設定
                    struct.seth_HOLIDAY_SUN(_holidayOff);
                    struct.seth_HOLIDAY_MON(_holidayOff);
                    struct.seth_HOLIDAY_TUE(_holidayOff);
                    struct.seth_HOLIDAY_WED(_holidayOff);
                    struct.seth_HOLIDAY_THU(_holidayOff);
                    struct.seth_HOLIDAY_FRI(_holidayOff);
                    struct.seth_HOLIDAY_SAT(_holidayOff);
              
                    // 処理成功
                    bSuccess = true;
                   }
                  }
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // エラーがある場合は、前回の状態に戻すため、servletで取得した状態を設定
                 if(bSuccess != true)
                 {
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlchange>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlchange");

		return;
	}

	/**
	 * 前月ボタン押下時に実行される処理です。
	 *
	 */
	public void controlbefore() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlbefore");
			//{{user_implement_dev:<controlbefore>
                //----------------------------------------------------------------------
                 
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // カレンダヘッダ検索
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // 前月処理失敗：指定したカレンダ番号は未登録です
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // カレンダ名設定
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 前月計算
                  _calendar.setTime(stringToDate(_targetMonth, _pattern2));
                  _calendar.add(Calendar.MONTH, -1);
                  Date d_targetDate = _calendar.getTime();
              
                  String s_sysDate = dateToString(d_targetDate, _pattern2);
                  String s_sysYear = dateToString(d_targetDate, _pattern3);
                  _targetMonth = s_sysDate;		// 検索月保存
                  _targetYear = s_sysYear;		// 検索年保存
              
                  // 読込処理
                  if(readParentData() == true)
                  {
                   bSuccess = true;
                  }
                 }
                }
                catch(ParseException e){
                 // 変換失敗
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // 最新のカレンダ情報を設定
                 if(bSuccess == true)
                 {
                  // エラーがない場合は、読込後の状態を設定
                  list = _calendarList;
                 }
                 else
                 {
                  // エラーがある場合は、servletで取得した状態を設定
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlbefore>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlbefore");

		return;
	}

	/**
	 * 翌月ボタン押下時に実行される処理です。
	 *
	 */
	public void controlnext() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlnext");
			//{{user_implement_dev:<controlnext>
                //----------------------------------------------------------------------
                 
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // カレンダヘッダ検索
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // 翌月処理失敗：指定したカレンダ番号は未登録です
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // カレンダ名設定
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0){
                  List calList = null;
              
                  // 前月計算
                  _calendar.setTime(stringToDate(_targetMonth, _pattern2));
                  _calendar.add(Calendar.MONTH, 1);
                  Date d_targetDate = _calendar.getTime();
              
                  String s_sysDate = dateToString(d_targetDate, _pattern2);
                  String s_sysYear = dateToString(d_targetDate, _pattern3);
                  _targetMonth = s_sysDate;		// 検索月保存
                  _targetYear = s_sysYear;		// 検索年保存
              
                  // 読込処理
                  if(readParentData() == true)
                  {
                   bSuccess = true;
                  }
                 }
                }
                catch(ParseException e){
                 // 変換失敗
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 // 最新のカレンダ情報を設定
                 if(bSuccess == true)
                 {
                  // エラーがない場合は、読込後の状態を設定
                  list = _calendarList;
                 }
                 else
                 {
                  // エラーがある場合は、servletで取得した状態を設定
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlnext>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlnext");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
                boolean bSuccess = false;
              
                try{
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
                 List listMessage = new ArrayList();
              
                 // カレンダヘッダ検索
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // 翌月処理失敗：指定したカレンダ番号は未登録です
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01013", Message);
                 }else{
                  // カレンダ名設定
                  AA0080020Struct workStruct = (AA0080020Struct)hList.get(0);
                  _keyStruct.setCAL_NAME(workStruct.getCAL_NAME());
                  struct.setCAL_NAME(workStruct.getCAL_NAME());
                 }
                               
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
               
                  // カレンダ明細更新
                  boolean allHolidayResult = false;
                  
                  for(int i = 0; i < _calendarList.size(); i++){
                   AA0080020Struct nowStruct = (AA0080020Struct)_nowCalendarList.get(i);
                   AA0080020Struct updateStruct = (AA0080020Struct)_calendarList.get(i);
               
                   // カレンダ明細チェック
                   List checkList = entity.mselectM_CAL_modify_count.read(conn, updateStruct);
                   if(checkList.size() <= 0){
                    // 更新処理失敗：削除されているデータがあります。最新の情報を確認してください
                    listMessage.add("M_CAL.CAL_NO:" + struct.getCAL_NO());
                    listMessage.add("M_CAL.CAL_DATE:" + updateStruct.getCAL_DATE());
              
                    setErrorMessage("AA00136", listMessage);
                    break;
                   }else{
                    AA0080020Struct workStruct = (AA0080020Struct)checkList.get(0);
                    if(workStruct.getMODIFY_COUNT().equals(updateStruct.getMODIFY_COUNT()) == false){
                     // 更新処理失敗：他の処理によりデータが書き換えられています
                     listMessage.add("M_CAL.CAL_NO:" + struct.getCAL_NO());
                     listMessage.add("M_CAL.CAL_DATE:" + updateStruct.getCAL_DATE());
              
                     setErrorMessage("ZZ01105", listMessage);
                     break;
                    }
                   }
               
//                 ASPシフトマスタの存在チェック
                   if(nowStruct.getASP_SHIFT_CD() != null && !nowStruct.getASP_SHIFT_CD().equals("")){
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,nowStruct)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + nowStruct.getASP_SHIFT_CD();
	        				setErrorMessage("AS00086", Message);
	        				break;
	        			}
                   }
        			
                   // チェックでエラーが発生していない場合
                   if(msgStruct.sizeError() <= 0){
	                    String upComment = (String)nowStruct.getCAL_COMMENT();
	                    Integer upHoliday = (Integer)nowStruct.getHOLIDAY_FLG();
	               
	                    // コメントに変更有り?
	                    boolean commentResult = false;
	                    if(upComment.equals(_emptyStr) == true){
	                     if(updateStruct.getCAL_COMMENT() != null &&
	                      _emptyStr.equals(updateStruct.getCAL_COMMENT()) != true)
	                      commentResult = true;	// 変更有り
	                    }else{
	                     if(updateStruct.getCAL_COMMENT() == null ||
	                      _emptyStr.equals(updateStruct.getCAL_COMMENT()) == true ||
	                      upComment.equals(updateStruct.getCAL_COMMENT()) == false)
	                      commentResult = true;	// 変更有り
	                    }
	                    
	                    // 休日に変更有り?
	                    boolean holidayResult = false;
	                    if(upHoliday.intValue() != updateStruct.getHOLIDAY_FLG().intValue()){
	                     holidayResult = true;
	                     allHolidayResult = true;
	                    }
	               
	                    // 更新判定
	                    if(commentResult == true){
	                     struct.setCAL_DATE(updateStruct.getCAL_DATE());
	                     struct.setCAL_COMMENT(upComment);
	                     struct.setHOLIDAY_FLG(upHoliday);
	                     entity.mupdateM_CAL_all.update(conn, struct);	// 更新
	                    }else if(holidayResult == true){
	                     struct.setCAL_DATE(updateStruct.getCAL_DATE());
	                     struct.setHOLIDAY_FLG(upHoliday);
	                     entity.mupdateM_CAL_holiday.update(conn, struct);	// 更新
	                    }
	                    
	                    // SYSTEM_PARAMETER TIME_CTRL = False 時には登録・更新しない
	                    if(struct.geth_TIME_CTRL().equals("1")){
	                    	// ASPカレンダに存在しない場合 ->> 登録
	                    	//              存在する場合   ->> 更新
	                    	struct.setCAL_DATE(updateStruct.getCAL_DATE());
		                    struct.setASP_SHIFT_CD(nowStruct.getASP_SHIFT_CD());
	                    	if(entity.mcheckM_ASP_CALENDAR.check(conn,struct)){
//	                    		 ASPカレンダ更新
			                    entity.mupdateM_ASP_CALENDAR.update(conn, struct);
	                    	}else{
	                    		entity.minsertM_ASP_CALENDAR.create(conn,struct);
	                    	}
	                    }
                   }else{
                    break;
                   }
                  }
                  // 年度別カレンダ設定
                  if(msgStruct.sizeError() <= 0 && allHolidayResult == true){
                   makeYearDays(struct.getCAL_NO(), _targetYear);
                  }
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0){
                  // コミット
                  conn.commit();
                  transFlg = false;
              
                  // 読込処理
                  if(readParentData() == true)
                  {
                   bSuccess = true;
                  }
              
                 }else{
                  // ロールバック
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(ParseException e){
                 // 変換失敗
              
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
              
                 // エラーがある場合は、前回の状態に戻すため、servletで取得した状態を設定
                 if(bSuccess != true)
                 {
                  // エラーがある場合は、servletで取得した状態を設定
                  list = _nowCalendarList;
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
              
                _calendarList.clear();
                _keyStruct.clear();
                struct.clear();
                _targetMonth = _monthDefoult;
                _targetYear = null;
              
                // デフォルトカレンダ番号設定
                _keyStruct.setCAL_NO(new String("0"));
                struct.setCAL_NO("0");
              
                // 検索状態を初期化
                setReadStatus(INITIAL);
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
              
                try{
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // カレンダヘッダ検索
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // 作成処理失敗：該当のカレンダは削除されています
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01016", Message);
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  Date firstDate = stringToDate(struct.getDATE_FROM(), _pattern1);
                  Date endDate = stringToDate(struct.getDATE_TO(), _pattern1);
              
                  // カレンダ作成済のFROM～TO取得
                  List calList = entity.mselectM_CAL_max_min.read(conn, struct);
                  if(calList.size() > 0){
                   AA0080020Struct workStruct = (AA0080020Struct)calList.get(0);
              
                   // 読込時、明細0件の場合
                   if(struct.getw_DATE_FROM().equals(_emptyStr) == true ||
                    struct.getw_DATE_TO().equals(_emptyStr) == true){
                    if(workStruct.getDATE_FROM() != null ||
                      workStruct.getDATE_TO() != null){
                     // 作成処理失敗：データが作成されています。最新の情報を確認してください
                     Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                     
                     setErrorMessage("AA00134", Message);
                    }
                   }
                   // 読込時、明細0件以上
                   else if(struct.getw_DATE_FROM().equals(workStruct.getDATE_FROM()) != true ||
                     struct.getw_DATE_TO().equals(workStruct.getDATE_TO()) != true){
                    // 作成処理失敗：データが作成されています。最新の情報を確認してください", struct.getsUser_ID());
                    Message = "M_CAL.CAL_NO:" + struct.getCAL_NO();
                    
                    setErrorMessage("AA00134", Message);
                   }
                  }
                  
                  // 入力されたシフトコードをチェック
                  AA0080020Struct wSt = new AA0080020Struct();
//				  日曜日
                  if(struct.gett_HOLIDAY_SUN() != null && !struct.gett_HOLIDAY_SUN().equals("")){
                	    wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SUN());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SUN();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                月曜日
                  if(struct.gett_HOLIDAY_MON() != null && !struct.gett_HOLIDAY_MON().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_MON());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_MON();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                火曜日
                  if(struct.gett_HOLIDAY_TUE() != null && !struct.gett_HOLIDAY_TUE().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_TUE());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_TUE();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                水曜日
                  if(struct.gett_HOLIDAY_WED() != null && !struct.gett_HOLIDAY_WED().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_WED());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_WED();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                木曜日
                  if(struct.gett_HOLIDAY_THU() != null && !struct.gett_HOLIDAY_THU().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_THU());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_THU();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                金曜日
                  if(struct.gett_HOLIDAY_FRI() != null && !struct.gett_HOLIDAY_FRI().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_FRI());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_FRI();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                土曜日
                  if(struct.gett_HOLIDAY_SAT() != null && !struct.gett_HOLIDAY_SAT().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SAT());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SAT();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
                  
                  // チェックでエラーが発生していない場合
                  if(msgStruct.sizeError() <= 0){
                   Integer[] days = {struct.geth_HOLIDAY_SUN(),
                        struct.geth_HOLIDAY_MON(),
                        struct.geth_HOLIDAY_TUE(),
                        struct.geth_HOLIDAY_WED(),
                        struct.geth_HOLIDAY_THU(),
                        struct.geth_HOLIDAY_FRI(),
                        struct.geth_HOLIDAY_SAT()};
              
                   String[] ASP_SHIFT ={struct.gett_HOLIDAY_SUN(),
                		struct.gett_HOLIDAY_MON(),
                		struct.gett_HOLIDAY_TUE(),
                		struct.gett_HOLIDAY_WED(),
                		struct.gett_HOLIDAY_THU(),
                		struct.gett_HOLIDAY_FRI(),
                		struct.gett_HOLIDAY_SAT()};
                   
                   // 休日カレンダ取得
                   List holidayList = entity.mselectM_HOLIDAY.read(conn, struct);
              
                   // カレンダ作成終了日 + 1
                   _calendar.setTime(endDate);
                   _calendar.add(Calendar.DATE, 1);
                   Date d_toDate = _calendar.getTime();
              
                   // カレンダ作成開始日
                   _calendar.setTime(firstDate);
              
                   // カレンダ作成開始年
                   List yearList = new ArrayList(0);
                   yearList.add(dateToString(firstDate, _pattern3));
              
                   // 開始曜日取得
                   int i_week = _calendar.get(_calendar.DAY_OF_WEEK) - 1;
              
                   // カレンダ作成
                   while(d_toDate.getTime() != _calendar.getTime().getTime())
                   {
                    // 作成日設定
                    struct.setCAL_DATE(dateToString(_calendar.getTime(), _pattern1));
              
                    // 休日設定
                    struct.setHOLIDAY_FLG(days[i_week]);
              
                    // コメントクリア
                    struct.setCAL_COMMENT((String)null);
                
                    // 休日一覧から休日設定
                    for(int i = 0; i < holidayList.size(); i++){
                     AA0080020Struct holidayStruct = (AA0080020Struct)holidayList.get(i);
                     if(holidayStruct.getHOLIDAY_DATE().equals(struct.getCAL_DATE()) == true){
                      struct.setHOLIDAY_FLG(_holidayOn);
                      struct.setCAL_COMMENT(holidayStruct.getHOLIDAY_NAME());
                     }
                    }
              
                    // 登録
                    entity.minsertM_CAL.create(conn, struct);
                    
                    
//                  SYSTEM_PARAMETER TIME_CTRL = False 時には登録・更新しない
                    if(struct.geth_TIME_CTRL().equals("1")){
                    	 //ASPシフトカレンダ登録(休日の場合はシフトコードをセットしない）
                        if(struct.getHOLIDAY_FLG().equals(_holidayOn)){
                        	struct.setASP_SHIFT_CD(null);
                        }else{
                        	struct.setASP_SHIFT_CD(ASP_SHIFT[i_week]);
                        }
                        entity.minsertM_ASP_CALENDAR.create(conn,struct);
                    }
                    
                    // 年取得
                    String workYear = (struct.getCAL_DATE()).substring(0, 4);
                    if(workYear.equals((String)yearList.get(yearList.size()-1)) == false){
                     yearList.add(workYear);
                    }
              
                    // 1日進む
                    _calendar.add(Calendar.DATE, 1);
                
                    // 曜日
                    if(i_week == 6) 
                     i_week = 0;
                    else 
                     i_week++;
                   }
              
                   // 年度別カレンダ設定
                   for(int i = 0; i < yearList.size(); i++)
                    makeYearDays(struct.getCAL_NO(), (String)yearList.get(i));
                  }
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // コミット
                  conn.commit();
                  transFlg = false;
                 }
                 else{
                  // ロールバック
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(ParseException e){
                 // 変換失敗
                 
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }catch(AlarmMessageException msg){
                 throw msg;
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // カレンダヘッダ検索
                 List hList = entity.mselectM_CAL_H.read(conn, struct);
                 if(hList.size() <= 0){
                  // 休日再設定処理失敗：該当のカレンダは削除されています
                  Message = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
                  
                  setErrorMessage("AA01016", Message);
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0){
                  Date firstDate = stringToDate(struct.getDATE_FROM(), _pattern1);
                  Date endDate = stringToDate(struct.getDATE_TO(), _pattern1);
              
                  // カレンダ作成済のFROM～TO取得
                  List calList = entity.mselectM_CAL_from_to.read(conn, struct);
                  if(calList.size() <= 0){
                   // 休日再設定処理失敗：削除されているデータがあります
                   listMessage.add("M_CAL.CAL_NO:" + struct.getCAL_NO());
                   listMessage.add("M_CAL.DATE_FROM:" + struct.getDATE_FROM());
                   listMessage.add("M_CAL.DATE_TO:" + struct.getDATE_TO());
              
                   setErrorMessage("AA00136", listMessage);
                  }else{
                   // FROM～TO設定
                   AA0080020Struct  workStruct = null;
                   workStruct = (AA0080020Struct)calList.get(0);
                   Date minDate = stringToDate(workStruct.getCAL_DATE(), _pattern1);
                   workStruct = (AA0080020Struct)calList.get(calList.size() -1);
                   Date maxDate = stringToDate(workStruct.getCAL_DATE(), _pattern1);
                   
                   if (maxDate.getTime() != endDate.getTime() ||
                    minDate.getTime() != firstDate.getTime()){
                    // 休日再設定処理失敗：作成済み期間の範囲内の日付を指定してください
                    setErrorMessage("AA00135", "");
                   }
                  }
                  
//                入力されたシフトコードをチェック
                  AA0080020Struct wSt = new AA0080020Struct();
//				  日曜日
                  if(struct.gett_HOLIDAY_SUN() != null && !struct.gett_HOLIDAY_SUN().equals("")){
                	    wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SUN());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SUN();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                月曜日
                  if(struct.gett_HOLIDAY_MON() != null && !struct.gett_HOLIDAY_MON().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_MON());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_MON();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                火曜日
                  if(struct.gett_HOLIDAY_TUE() != null && !struct.gett_HOLIDAY_TUE().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_TUE());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_TUE();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                水曜日
                  if(struct.gett_HOLIDAY_WED() != null && !struct.gett_HOLIDAY_WED().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_WED());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_WED();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                木曜日
                  if(struct.gett_HOLIDAY_THU() != null && !struct.gett_HOLIDAY_THU().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_THU());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_THU();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                金曜日
                  if(struct.gett_HOLIDAY_FRI() != null && !struct.gett_HOLIDAY_FRI().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_FRI());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_FRI();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
                  
//                土曜日
                  if(struct.gett_HOLIDAY_SAT() != null && !struct.gett_HOLIDAY_SAT().equals("")){
                	  wSt.setASP_SHIFT_CD(struct.gett_HOLIDAY_SAT());
	        			if(!entity.mselectM_ASP_SHIFT.check(conn,wSt)){
	        				Message = "M_ASP_SHIFT.SHIFT_CD:" + struct.gett_HOLIDAY_SAT();
	        				setErrorMessage("AS00086", Message);
	        			}
                  }
              
                  // チェックでエラーが発生していない場合
                  if(msgStruct.sizeError() <= 0){
                   Integer[] days = {struct.geth_HOLIDAY_SUN(),
                        struct.geth_HOLIDAY_MON(),
                        struct.geth_HOLIDAY_TUE(),
                        struct.geth_HOLIDAY_WED(),
                        struct.geth_HOLIDAY_THU(),
                        struct.geth_HOLIDAY_FRI(),
                        struct.geth_HOLIDAY_SAT()};
                   
                   String[] ASP_SHIFT ={struct.gett_HOLIDAY_SUN(),
                   		struct.gett_HOLIDAY_MON(),
                   		struct.gett_HOLIDAY_TUE(),
                   		struct.gett_HOLIDAY_WED(),
                   		struct.gett_HOLIDAY_THU(),
                   		struct.gett_HOLIDAY_FRI(),
                   		struct.gett_HOLIDAY_SAT()};
              
                   // 休日カレンダ取得
                   List holidayList = entity.mselectM_HOLIDAY.read(conn, struct);
              
                   // カレンダ作成終了日 + 1
                   _calendar.setTime(endDate);
                   _calendar.add(Calendar.DATE, 1);
                   Date d_toDate = _calendar.getTime();
              
                   // カレンダ作成開始日
                   _calendar.setTime(firstDate);
              
                   // カレンダ作成開始年
                   List yearList = new ArrayList(0);
                   yearList.add(dateToString(firstDate, _pattern3));
              
                   // 開始曜日取得
                   int i_week = _calendar.get(_calendar.DAY_OF_WEEK) - 1;
              
                   // カレンダ作成
                   for(int t = 0; t < calList.size(); t++){
                    // 日設定
                    struct.setCAL_DATE(((AA0080020Struct)calList.get(t)).getCAL_DATE());
              
                    // 休日設定
                    struct.setHOLIDAY_FLG(days[i_week]);
              
                    // 休日一覧から休日設定
                    boolean comStatus = false;
                    for(int i = 0; i < holidayList.size(); i++){
                     AA0080020Struct holidayStruct = (AA0080020Struct)holidayList.get(i);
                     if(holidayStruct.getHOLIDAY_DATE().equals(struct.getCAL_DATE()) == true){
                      struct.setHOLIDAY_FLG(_holidayOn);
                      struct.setCAL_COMMENT(holidayStruct.getHOLIDAY_NAME());
                      comStatus = true;
                     }
                    }
              
                    // 更新
                    if(comStatus == false)
                     entity.mupdateM_CAL_holiday.update(conn, struct);
                    else
                     entity.mupdateM_CAL_all.update(conn, struct);
                    
                    // SYSTEM_PARAMETER TIME_CTRL = False 時には登録・更新しない
                    if(struct.geth_TIME_CTRL().equals("1")){
	                    //ASPシフトカレンダ登録(休日の場合はシフトコードをセットしない）
	                    if(struct.getHOLIDAY_FLG().equals(_holidayOn)){
	                    	struct.setASP_SHIFT_CD(null);
	                    }else{
	                    	struct.setASP_SHIFT_CD(ASP_SHIFT[i_week]);
	                    }
	                    entity.mupdateM_ASP_CALENDAR.update(conn,struct);
                    }
                    
                    // 年取得
                    String workYear = (struct.getCAL_DATE()).substring(0, 4);
                    if(workYear.equals((String)yearList.get(yearList.size()-1)) == false){
                     yearList.add(workYear);
                    }
              
                    // 1日進む
                    _calendar.add(Calendar.DATE, 1);
                
                    // 曜日
                    if(i_week == 6) 
                     i_week = 0;
                    else 
                     i_week++;
                   }
              
                   // 年度別カレンダ設定
                   for(int i = 0; i < yearList.size(); i++){
                    makeYearDays(struct.getCAL_NO(), (String)yearList.get(i));
              
                   }
                  }
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0){
                  // コミット
                  conn.commit();
                  transFlg = false;
                 }
                 else{
                  // ロールバック
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(ParseException e){
                 // 変換失敗
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //------------------------------------------------------------------
              
                // キーコピー
                struct.copy(_keyStruct);
              
                // 再読込処理
                readParentData();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              /*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
                try{
              */
                 // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
                 if ( isScreenMove() == true ) {
                  // 検索のコントロールメソッドを呼び出します。
              //				controlSelect();
                 }
              
              /*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
                } catch(SQLException e) {
              //			e.printStackTrace();
                 // エラー処理を記述してください。
                 // 
                }
              */
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0080");
		logger.entering("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
				// 曜日設定
				days = getDaysByLocale();
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0080020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("change") ) {
				controlchange();
			} else if( button.equals("before") ) {
				controlbefore();
			} else if( button.equals("next") ) {
				controlnext();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //------------------------------------------------------------------
                 if(_targetMonth.equals(_monthDefoult) == false){
                  _keyStruct.setHEAD_DATE(
                    _targetMonth.substring(0,4) + "年" + _brank + 
                    _targetMonth.substring(5) + "月");
                 }
                 else{
                  _keyStruct.setHEAD_DATE(_monthDefoult);
                 }
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
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
//			throw new FoundationException("AA0080020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0080020-E999","CSVの出力処理"));
			throw new FoundationException("AA0080020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0080020-E999","システム日付の取得処理"));
				throw new FoundationException("AA0080020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0080020-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0080020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0080020Entity entity;
	protected AA0080020Struct struct;
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

		entity = new AA0080020Entity();
		struct = new AA0080020Struct();

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
	 * AA0080020クラスの標準コンストラクタ
	 */
	public AA0080020Control() throws BusinessProcessException, FoundationException
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
				AA0080020Struct key = (AA0080020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CAL_DATE_WEEK") && key.getCAL_DATE_WEEK() != null) {
					msgKey.setKeyValue("CAL_DATE_WEEK", key.getCAL_DATE_WEEK());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_SUN") && key.geth_HOLIDAY_SUN() != null) {
					msgKey.setKeyValue("h_HOLIDAY_SUN", key.geth_HOLIDAY_SUN().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_MON") && key.geth_HOLIDAY_MON() != null) {
					msgKey.setKeyValue("h_HOLIDAY_MON", key.geth_HOLIDAY_MON().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_TUE") && key.geth_HOLIDAY_TUE() != null) {
					msgKey.setKeyValue("h_HOLIDAY_TUE", key.geth_HOLIDAY_TUE().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_WED") && key.geth_HOLIDAY_WED() != null) {
					msgKey.setKeyValue("h_HOLIDAY_WED", key.geth_HOLIDAY_WED().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_THU") && key.geth_HOLIDAY_THU() != null) {
					msgKey.setKeyValue("h_HOLIDAY_THU", key.geth_HOLIDAY_THU().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_FRI") && key.geth_HOLIDAY_FRI() != null) {
					msgKey.setKeyValue("h_HOLIDAY_FRI", key.geth_HOLIDAY_FRI().toString());
				}
				if(msgKeyType.containsKeyColumn("h_HOLIDAY_SAT") && key.geth_HOLIDAY_SAT() != null) {
					msgKey.setKeyValue("h_HOLIDAY_SAT", key.geth_HOLIDAY_SAT().toString());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("HEAD_DATE") && key.getHEAD_DATE() != null) {
					msgKey.setKeyValue("HEAD_DATE", key.getHEAD_DATE());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_FLG") && key.getc_HOLIDAY_FLG() != null) {
					msgKey.setKeyValue("c_HOLIDAY_FLG", key.getc_HOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_SUN") && key.getc_HOLIDAY_SUN() != null) {
					msgKey.setKeyValue("c_HOLIDAY_SUN", key.getc_HOLIDAY_SUN());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_MON") && key.getc_HOLIDAY_MON() != null) {
					msgKey.setKeyValue("c_HOLIDAY_MON", key.getc_HOLIDAY_MON());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_TUE") && key.getc_HOLIDAY_TUE() != null) {
					msgKey.setKeyValue("c_HOLIDAY_TUE", key.getc_HOLIDAY_TUE());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_WED") && key.getc_HOLIDAY_WED() != null) {
					msgKey.setKeyValue("c_HOLIDAY_WED", key.getc_HOLIDAY_WED());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_THU") && key.getc_HOLIDAY_THU() != null) {
					msgKey.setKeyValue("c_HOLIDAY_THU", key.getc_HOLIDAY_THU());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_FRI") && key.getc_HOLIDAY_FRI() != null) {
					msgKey.setKeyValue("c_HOLIDAY_FRI", key.getc_HOLIDAY_FRI());
				}
				if(msgKeyType.containsKeyColumn("c_HOLIDAY_SAT") && key.getc_HOLIDAY_SAT() != null) {
					msgKey.setKeyValue("c_HOLIDAY_SAT", key.getc_HOLIDAY_SAT());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_SUN") && key.gett_HOLIDAY_SUN() != null) {
					msgKey.setKeyValue("t_HOLIDAY_SUN", key.gett_HOLIDAY_SUN());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_MON") && key.gett_HOLIDAY_MON() != null) {
					msgKey.setKeyValue("t_HOLIDAY_MON", key.gett_HOLIDAY_MON());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_TUE") && key.gett_HOLIDAY_TUE() != null) {
					msgKey.setKeyValue("t_HOLIDAY_TUE", key.gett_HOLIDAY_TUE());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_WED") && key.gett_HOLIDAY_WED() != null) {
					msgKey.setKeyValue("t_HOLIDAY_WED", key.gett_HOLIDAY_WED());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_THU") && key.gett_HOLIDAY_THU() != null) {
					msgKey.setKeyValue("t_HOLIDAY_THU", key.gett_HOLIDAY_THU());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_FRI") && key.gett_HOLIDAY_FRI() != null) {
					msgKey.setKeyValue("t_HOLIDAY_FRI", key.gett_HOLIDAY_FRI());
				}
				if(msgKeyType.containsKeyColumn("t_HOLIDAY_SAT") && key.gett_HOLIDAY_SAT() != null) {
					msgKey.setKeyValue("t_HOLIDAY_SAT", key.gett_HOLIDAY_SAT());
				}
				if(msgKeyType.containsKeyColumn("h_TIME_CTRL") && key.geth_TIME_CTRL() != null) {
					msgKey.setKeyValue("h_TIME_CTRL", key.geth_TIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("CAL_DATE") && key.getCAL_DATE() != null) {
					msgKey.setKeyValue("CAL_DATE", key.getCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("CAL_COMMENT") && key.getCAL_COMMENT() != null) {
					msgKey.setKeyValue("CAL_COMMENT", key.getCAL_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ASP_SHIFT_CD") && key.getASP_SHIFT_CD() != null) {
					msgKey.setKeyValue("ASP_SHIFT_CD", key.getASP_SHIFT_CD());
				}
				if(msgKeyType.containsKeyColumn("CAL_NAME") && key.getCAL_NAME() != null) {
					msgKey.setKeyValue("CAL_NAME", key.getCAL_NAME());
				}
				if(msgKeyType.containsKeyColumn("DATE_TO") && key.getDATE_TO() != null) {
					msgKey.setKeyValue("DATE_TO", key.getDATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DATE_FROM") && key.getDATE_FROM() != null) {
					msgKey.setKeyValue("DATE_FROM", key.getDATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("CAL_YEAR") && key.getCAL_YEAR() != null) {
					msgKey.setKeyValue("CAL_YEAR", key.getCAL_YEAR());
				}
				if(msgKeyType.containsKeyColumn("CAL_YEAR_HOLIDAY") && key.getCAL_YEAR_HOLIDAY() != null) {
					msgKey.setKeyValue("CAL_YEAR_HOLIDAY", key.getCAL_YEAR_HOLIDAY());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_DATE") && key.getHOLIDAY_DATE() != null) {
					msgKey.setKeyValue("HOLIDAY_DATE", key.getHOLIDAY_DATE());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_NAME") && key.getHOLIDAY_NAME() != null) {
					msgKey.setKeyValue("HOLIDAY_NAME", key.getHOLIDAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("sysValue") && key.getsysValue() != null) {
					msgKey.setKeyValue("sysValue", key.getsysValue());
				}
				if(msgKeyType.containsKeyColumn("sysName") && key.getsysName() != null) {
					msgKey.setKeyValue("sysName", key.getsysName());
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
					AA0080020Struct key = new AA0080020Struct();
					if(msgKeyType.containsKeyColumn("CAL_DATE_WEEK")) {
						key.setCAL_DATE_WEEK(msgKey.getKeyValue("CAL_DATE_WEEK"));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_SUN")) {
						key.seth_HOLIDAY_SUN(new Integer(msgKey.getKeyValue("h_HOLIDAY_SUN")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_MON")) {
						key.seth_HOLIDAY_MON(new Integer(msgKey.getKeyValue("h_HOLIDAY_MON")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_TUE")) {
						key.seth_HOLIDAY_TUE(new Integer(msgKey.getKeyValue("h_HOLIDAY_TUE")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_WED")) {
						key.seth_HOLIDAY_WED(new Integer(msgKey.getKeyValue("h_HOLIDAY_WED")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_THU")) {
						key.seth_HOLIDAY_THU(new Integer(msgKey.getKeyValue("h_HOLIDAY_THU")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_FRI")) {
						key.seth_HOLIDAY_FRI(new Integer(msgKey.getKeyValue("h_HOLIDAY_FRI")));
					}
					if(msgKeyType.containsKeyColumn("h_HOLIDAY_SAT")) {
						key.seth_HOLIDAY_SAT(new Integer(msgKey.getKeyValue("h_HOLIDAY_SAT")));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("HEAD_DATE")) {
						key.setHEAD_DATE(msgKey.getKeyValue("HEAD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_FLG")) {
						key.setc_HOLIDAY_FLG(msgKey.getKeyValue("c_HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_SUN")) {
						key.setc_HOLIDAY_SUN(msgKey.getKeyValue("c_HOLIDAY_SUN"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_MON")) {
						key.setc_HOLIDAY_MON(msgKey.getKeyValue("c_HOLIDAY_MON"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_TUE")) {
						key.setc_HOLIDAY_TUE(msgKey.getKeyValue("c_HOLIDAY_TUE"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_WED")) {
						key.setc_HOLIDAY_WED(msgKey.getKeyValue("c_HOLIDAY_WED"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_THU")) {
						key.setc_HOLIDAY_THU(msgKey.getKeyValue("c_HOLIDAY_THU"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_FRI")) {
						key.setc_HOLIDAY_FRI(msgKey.getKeyValue("c_HOLIDAY_FRI"));
					}
					if(msgKeyType.containsKeyColumn("c_HOLIDAY_SAT")) {
						key.setc_HOLIDAY_SAT(msgKey.getKeyValue("c_HOLIDAY_SAT"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_SUN")) {
						key.sett_HOLIDAY_SUN(msgKey.getKeyValue("t_HOLIDAY_SUN"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_MON")) {
						key.sett_HOLIDAY_MON(msgKey.getKeyValue("t_HOLIDAY_MON"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_TUE")) {
						key.sett_HOLIDAY_TUE(msgKey.getKeyValue("t_HOLIDAY_TUE"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_WED")) {
						key.sett_HOLIDAY_WED(msgKey.getKeyValue("t_HOLIDAY_WED"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_THU")) {
						key.sett_HOLIDAY_THU(msgKey.getKeyValue("t_HOLIDAY_THU"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_FRI")) {
						key.sett_HOLIDAY_FRI(msgKey.getKeyValue("t_HOLIDAY_FRI"));
					}
					if(msgKeyType.containsKeyColumn("t_HOLIDAY_SAT")) {
						key.sett_HOLIDAY_SAT(msgKey.getKeyValue("t_HOLIDAY_SAT"));
					}
					if(msgKeyType.containsKeyColumn("h_TIME_CTRL")) {
						key.seth_TIME_CTRL(msgKey.getKeyValue("h_TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CAL_DATE")) {
						key.setCAL_DATE(msgKey.getKeyValue("CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(new Integer(msgKey.getKeyValue("HOLIDAY_FLG")));
					}
					if(msgKeyType.containsKeyColumn("CAL_COMMENT")) {
						key.setCAL_COMMENT(msgKey.getKeyValue("CAL_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ASP_SHIFT_CD")) {
						key.setASP_SHIFT_CD(msgKey.getKeyValue("ASP_SHIFT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NAME")) {
						key.setCAL_NAME(msgKey.getKeyValue("CAL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DATE_TO")) {
						key.setDATE_TO(msgKey.getKeyValue("DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DATE_FROM")) {
						key.setDATE_FROM(msgKey.getKeyValue("DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("CAL_YEAR")) {
						key.setCAL_YEAR(msgKey.getKeyValue("CAL_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("CAL_YEAR_HOLIDAY")) {
						key.setCAL_YEAR_HOLIDAY(msgKey.getKeyValue("CAL_YEAR_HOLIDAY"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_DATE")) {
						key.setHOLIDAY_DATE(msgKey.getKeyValue("HOLIDAY_DATE"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_NAME")) {
						key.setHOLIDAY_NAME(msgKey.getKeyValue("HOLIDAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sysValue")) {
						key.setsysValue(msgKey.getKeyValue("sysValue"));
					}
					if(msgKeyType.containsKeyColumn("sysName")) {
						key.setsysName(msgKey.getKeyValue("sysName"));
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
