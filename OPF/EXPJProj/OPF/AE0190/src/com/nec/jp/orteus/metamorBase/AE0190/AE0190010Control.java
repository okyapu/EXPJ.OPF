/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0190/src/com/nec/jp/orteus/metamorBase/AE0190/AE0190010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0190;

import com.nec.jp.orteus.metamorBase.AE0190.*;
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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxControl;
import com.nec.jp.orteus.metamorBase.common04.amount.TaxStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0190010Control
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
        protected List list; // 一覧部分の結果リストを画面に表示するためのリストインスタンス
       
        // デフォルトアクセサメソッド
        public List getList() {
         return this.list;
        } // リストを返します。
        public void setList(List listname) {
         this.list = listname;
        } // リストをセットします。
        public int getListsize() { // リスト型のサイズを返します。
         int nret = 0;
         if (this.list != null) {
          nret = this.list.size();
         }
         return nret;
        }
        //	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
        public AE0190010Struct getListvalue(int x) {
         return (AE0190010Struct) (this.list.get(x));
        } // リストの値を返します。
        public AE0190010Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public AE0190010Struct createStruct() {
         return new AE0190010Struct();
        } // 新しいStructを作って返します。
       
        public void setStruct(Object structname) {
         this.struct.setStruct((AE0190010Struct) structname);
        } // Structをセットします。
        public void initializeStruct() {
         this.struct.initialize();
        } // Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter() {
         return this.csvWriter;
        }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr) {
         this.csvReader = cr;
        }
       
        // TODO: ユーザ定義のコードを記述してください
        /** [自社]情報 */
        private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
        /** [税名]情報 */
        private TaxNameStruct _taxNameStruct = new TaxNameStruct();
        /** [邦貨]情報 */
        private HomeCurStruct _homeCurStruct = new HomeCurStruct();

        /** [コンボボックスデータ]情報（） */
        private ComboStruct _splItemTypStruct = new ComboStruct();
        /** [コンボボックスデータ]情報（単価区分） */
        private ComboStruct _unitCostTypStruct = new ComboStruct();
       
        /** 画面遷移キー(工場コード) */
        private String _plantCd;
        /** 画面遷移キー(発注番号) */
        private String _puchOdrCd;
        /** 入力品目存在確認フラグ */
		private boolean _Itemflg = true;
		
		/** 単価読込時、消費税コード*/
		private String _taxCd = "";

		/** EJa-ASPROVA連携オプション導入フラグ取得用 */
		private String _SysInstallOptions_ASP = null;
		
		/** JF導入フラグ取得用 */
		private String _SysInstallOptions_JF = null;
        // 多言語項目取得対応
        ResourceBundle resource = CoreTools.getResourceBundle( "OrteusUserDic", CoreTools.getLocale(sysUSER_CD));
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
        /**
         * インフォメーション発生時のパラメータ設定処理を切り出して関数化
         * @param tableName テーブル名
         * @param columnName カラム名
         * @param value 値
         */
        private void setInformationParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addInfo(emsg);
        }
        /**
         * 業務ワーニング発生時のパラメータ設定処理を切り出して関数化
         * @param tableName テーブル名
         * @param columnName カラム名
         * @param value 値
         */
        private void setWarningParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * 業務エラー発生時のパラメータ設定処理を切り出して関数化
         * @param tableName テーブル名
         * @param columnName カラム名
         * @param value 値
         */
        private void setErrorParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * 画面遷移キー(工場コード)取得
         * @return 工場コード
         */
        public String getPlantCd() {
         return _plantCd;
        }
        /**
         * 画面遷移キー(工場コード)設定
         * @param cd 工場コード
         */
        public void setPlantCd(String cd) {
         _plantCd = cd;
        }
        /**
         * 画面遷移キー(発注番号)取得
         * @return 発注番号
         */
        public String getPuchOdrCd() {
         return _puchOdrCd;
        }
        /**
         * 画面遷移キー(発注番号)設定
         * @param cd 発注番号
         */
        public void setPuchOdrCd(String cd) {
         _puchOdrCd = cd;
        }
       
        /**
         * 稼働日チェック処理を日付文字列で使えるようにした委譲メソッドです。
         * @param dateString 日付文字列
         * @return 稼働日の場合は true、 非稼働日の場合はfalseを返します。
         * @throws FoundationException  共通部品処理で失敗
         * @throws ParseException 型変換に失敗
         */
        private boolean isWorkDay(String dateString) throws FoundationException, ParseException {
         // DateFormatを準備
         //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
         // 型変換
         //Date date = df.parse(dateString);
         Date date = Converter.strToDate(dateString, "yyyy/MM/dd");
       
         // 稼働日共通部品を生成し、チェック処理を実行
         WorkCalendar wc;
         if(_Itemflg){
         	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), date);
         }else{
         	wc = new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(), date);
         }
         boolean reslt = wc.isWorkDate();
         return reslt;
        }
       
        /**
         * 稼働日演算処理を日付文字列で使えるようにした委譲メソッドです。
         * @param dateString 日付文字列
         * @return 演算結果の日付文字列
         * @throws FoundationException 共通部品処理で失敗
         * @throws ParseException 型変換に失敗
         */
        private String calcWorkDay(String dateString, String timeString, String ltString, boolean flg)
         throws FoundationException, ParseException {
         // DateFormatを準備
         //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
         // 型変換
         //Date date = df.parse(dateString);

         // 渡されてきた時刻をhh24:mi:ss形式に整える
         timeString = timeString.substring(0,2) + ":" + timeString.substring(2) + ":00";

         // 引数の年月日と形式を整えた時刻を結合し、日付型に変換する
         Date date = Converter.strToDate(dateString + " " + timeString, "yyyy/MM/dd HH:mm:ss");
         int lt = Integer.parseInt(ltString);
       
         // 稼働日共通部品を生成し、チェック処理を実行
         WorkCalendar wc =
          new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(),struct.getITEM_CD(), date, lt, flg);
         Date resultDate = wc.calcDate();

         if (resultDate == null || "".equals(resultDate)){
        	 return ""; 
         }
         // 自動算出された日付を文字型に変換して保持する
         String tidydate = Converter.dateToStr(resultDate, "yyyy/MM/dd HH:mm:ss");

         // 自動算出された日付をyyyy/mm/dd hh24mi形式に整える
         tidydate = tidydate.substring(0,10) + tidydate.substring(11,13) + tidydate.substring(14,16);

         //return df.format(tidydate);
         return tidydate;
        }
       
        /**
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStruct(AE0190010Struct s) {
         struct.setPLANT_CD(s.getPLANT_CD());
         struct.setPLANT_NAME(s.getPLANT_NAME());
         struct.setPUCH_ODR_CD(s.getPUCH_ODR_CD());
         struct.setITEM_CD(s.getITEM_CD());
         struct.setITEM_NAME(s.getITEM_NAME());
         struct.setJOB_ODR_CD(s.getJOB_ODR_CD());
         struct.seth_JOB_ODR_CD(s.getJOB_ODR_CD());
         struct.setDRAW_CD(s.getDRAW_CD());
         struct.setSPEC(s.getSPEC());
         struct.setMRP_ODR_TYP_DN(s.getMRP_ODR_TYP_DN());
         struct.setMRP_ODR_TYP(s.getMRP_ODR_TYP());
         struct.setPUCH_ODR_START_DATE(s.getPUCH_ODR_START_DATE());
         struct.setCONFIRM_DLV_DATE(s.getCONFIRM_DLV_DATE());
         struct.setPUCH_ODR_DLV_DATE(s.getPUCH_ODR_DLV_DATE());
         struct.setPUCH_ODR_QTY(s.getPUCH_ODR_QTY());
         struct.setSTOCK_UNIT(s.getSTOCK_UNIT());

         struct.setVEND_CD(s.getVEND_CD());
         struct.setVEND_NAME(s.getVEND_NAME());
         struct.setWH_CD(s.getWH_CD());
         struct.setWH_NAME(s.getWH_NAME());
         struct.setPUCH_ODR_PERSON(s.getPUCH_ODR_PERSON());
         struct.setUSER_NAME(s.getUSER_NAME());
         struct.setSPL_ITEM_TYP(s.getSPL_ITEM_TYP());
         struct.setPRODUCT_TYP(s.getPRODUCT_TYP());
         struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());
         struct.setUNIT_COST(s.getUNIT_COST());
         struct.setPUCH_ODR_AMOUNT(s.getPUCH_ODR_AMOUNT());
         struct.setAMOUNT_INCLUDE_TAX(s.getAMOUNT_INCLUDE_TAX());
         struct.setNET_AMOUNT(s.getNET_AMOUNT());
         struct.setDISC_AMOUNT(s.getDISC_AMOUNT());
         struct.setTAX_RATE_1(s.getTAX_RATE_1());
         struct.setTAX_RATE_2(s.getTAX_RATE_2());
         struct.setTAX_RATE_3(s.getTAX_RATE_3());
         struct.setTAX_AMOUNT_1(s.getTAX_AMOUNT_1());
         struct.setTAX_AMOUNT_2(s.getTAX_AMOUNT_2());
         struct.setTAX_AMOUNT_3(s.getTAX_AMOUNT_3());
         struct.setPROCESSING_COST(s.getPROCESSING_COST());
         struct.setMATERIAL_COST(s.getMATERIAL_COST());
         struct.setOTHER_OVERHEADS(s.getOTHER_OVERHEADS());
         struct.setHOME_CUR_AMOUNT(s.getHOME_CUR_AMOUNT());
         struct.setEXCH_RATE(s.getEXCH_RATE());
         struct.setPUCH_ODR_COMMENT(s.getPUCH_ODR_COMMENT());
         struct.setPUCH_ODR_STS_TYP(s.getPUCH_ODR_STS_TYP());
         struct.setINV_CTRL_FLG(s.getINV_CTRL_FLG());
         struct.setOD_NO(s.getOD_NO());
         struct.setTAX_CD(s.getTAX_CD());
         struct.setTAX_ROUND_TYP(s.getTAX_ROUND_TYP());
         struct.setROUND_TYP(s.getROUND_TYP());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
         struct.setCUR_CD(s.getCUR_CD());
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setVEND_CUR_UNIT(s.getVEND_CUR_UNIT());
         struct.setVEND_DECIMAL_FIG(s.getVEND_DECIMAL_FIG());
         struct.setNON_NO_ITEM_FLG(s.getNON_NO_ITEM_FLG());
       
         struct.seth_PLANT_CD(s.getPLANT_CD());
         struct.seth_PUCH_ODR_CD(s.getPUCH_ODR_CD());
         struct.seth_ITEM_CD(s.getITEM_CD());
         struct.seth_PUCH_ODR_QTY(s.getPUCH_ODR_QTY());
         struct.seth_SPL_ITEM_TYP(s.getSPL_ITEM_TYP());
         struct.setOUTSIDE_TYP(s.getOUTSIDE_TYP());
         
         struct.setALC_GRP_CD(s.getALC_GRP_CD());
         struct.seth_ALC_GRP_CD(s.getALC_GRP_CD());
         struct.setPROJECT_CD(s.getPROJECT_CD());
         struct.setPROJECT_NAME(s.getPROJECT_NAME());
       
       
         struct.setCONFIRM_DLV_DATE_COMMENT(s.getCONFIRM_DLV_DATE_COMMENT());
         struct.setPUCH_ODR_START_TIME(s.getPUCH_ODR_START_TIME());
         struct.setCONFIRM_DLV_TIME(s.getCONFIRM_DLV_TIME());
         struct.setPUCH_ODR_DLV_TIME(s.getPUCH_ODR_DLV_TIME());
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setPUCH_ODR_CD(null);
 		
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setJOB_ODR_CD(null);
         struct.setDRAW_CD(null);
         struct.setSPEC(null);
         struct.setMRP_ODR_TYP_DN(null);
         struct.setMRP_ODR_TYP(null);
         struct.setPUCH_ODR_START_DATE(null);
         struct.setCONFIRM_DLV_DATE(null);
         struct.setPUCH_ODR_DLV_DATE(null);
         struct.setPUCH_ODR_QTY("0");
         struct.setSTOCK_UNIT(null);
         struct.setOUTSIDE_TYP(null);
         struct.setVEND_CD(null);
         struct.setVEND_NAME(null);
         struct.setWH_CD(null);
         struct.setWH_NAME(null);
         struct.setPUCH_ODR_PERSON(sysUSER_CD);
         struct.setUSER_NAME(null);
         struct.setSPL_ITEM_TYP("0");
         struct.setPRODUCT_TYP(null);
         struct.setUNIT_COST_TYP("1");
         struct.setUNIT_COST("0");
         struct.setPUCH_ODR_AMOUNT("0");
         struct.setAMOUNT_INCLUDE_TAX("0");
         struct.setNET_AMOUNT("0");
         struct.setDISC_AMOUNT("0");
         struct.setTAX_RATE_1("0");
         struct.setTAX_RATE_2("0");
         struct.setTAX_RATE_3("0");
         struct.setTAX_AMOUNT_1("0");
         struct.setTAX_AMOUNT_2("0");
         struct.setTAX_AMOUNT_3("0");
         struct.setPROCESSING_COST("0");
         struct.setMATERIAL_COST("0");
         struct.setOTHER_OVERHEADS("0");
         struct.setHOME_CUR_AMOUNT("0");
         struct.setEXCH_RATE("1");
         struct.setPUCH_ODR_COMMENT(null);
         struct.setPUCH_ODR_STS_TYP(null);
         struct.setINV_CTRL_FLG(null);
         struct.setOD_NO(null);
         struct.setTAX_CD(null);
         struct.setTAX_ROUND_TYP(Kind.FLOOR);
         struct.setROUND_TYP(Kind.FLOOR);
         struct.setMODIFY_COUNT(null);
         struct.setCUR_CD(null);
         struct.setCUR_NAME(null);
         struct.setVEND_CUR_UNIT(null);
         struct.setVEND_DECIMAL_FIG("4");
         struct.setOD_NO(null);
         struct.setNON_NO_ITEM_FLG(null);
       
         struct.seth_PLANT_CD(null);
         struct.seth_PUCH_ODR_CD(null);
         struct.seth_ITEM_CD(null);
         struct.seth_PUCH_ODR_QTY(null);
         struct.seth_SPL_ITEM_TYP(null);
       
         struct.setJOB_ODR_CD(null);
         struct.seth_JOB_ODR_CD(null);
         struct.setc_JOB_ODR("false");
         struct.setALC_GRP_CD(null);
         struct.seth_ALC_GRP_CD(null);
         struct.setPROJECT_CD(null);
         struct.setPROJECT_NAME(null);
         
       
         struct.setCONFIRM_DLV_DATE_COMMENT(null);
         
         struct.setPUCH_ODR_START_TIME(null);
         struct.setCONFIRM_DLV_TIME(null);
         struct.setPUCH_ODR_DLV_TIME(null);

         struct.setPUCH_ODR_START_DATE_ALL(null);
         struct.setCONFIRM_DLV_DATE_ALL(null);
         struct.setPUCH_ODR_DLV_DATE_ALL(null); 
         struct.setSelectUnitCostFlag("false");
       
         list = null;
         
 		//消費税コード
 		_taxCd = "";
 		
         readStatus = INITIAL;
        }
    	//コンボボックスの説明取得（多言語）
	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
		try {
			ComboBox com = new ComboBox(conn, sysUSER_CD);
			ComboStruct _comstruct = new ComboStruct();
			_comstruct = com.getData(comname);
			for (int j = 0; j < _comstruct.size(); j++) {
				if ((_comstruct.getData(j)[0]).equals(value)) {
					return _comstruct.getData(j)[1];
				}
			}
			return null;
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}
	

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
	
	public String DtGetDate(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("yyyy/MM/dd");
		if(in == null) return null;
		return fm.format(in);
	}

	public String DtGetTime(Date in)
	{
		SimpleDateFormat fm = new SimpleDateFormat("HHmm");
		if(in == null) return null;
		return fm.format(in);
	}

	/** デバッグ用メッセージ作成用変数 */
    private String _debugMsg = "";
	// 20081222 ADD↑

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // キー以外の項目を初期化
                 initializeDetail();
              
                 // キー項目の名称取得
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  struct.setPLANT_NAME(null);
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  return;
                 } else {
                  AE0190010Struct plantStruct = (AE0190010Struct) plantList.get(0);
                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
              
                 // 中段明細項目を検索
                 List formList = entity.mForm.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                  return;
                 }
              
                 // 中段明細項目データを取得
                 AE0190010Struct formStruct = (AE0190010Struct) formList.get(0);
                 
                 formStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",formStruct.getMRP_ODR_TYP_DN()));
                 formStruct.setOUTSIDE_TYP(multcombo("OUTSIDE_TYP",formStruct.getOUTSIDE_TYP()));
                 formStruct.setPRODUCT_TYP(multcombo("PRODUCT_TYP",formStruct.getPRODUCT_TYP()));
                              
                 //[発注残].“発注計画メンテナンスフラグ” ＝ 0:（発注計画メンテナンス（製番先行手配）で登録したデータでない）の場合
                 //データは修正／削除不可となる。
                 if("0".equals(formStruct.getPUCH_MAINT_FLG())){
                	 setErrorMessage("AE01012");
                	 setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());   
                	 return;
                 }
                 //指示済みの場合でも取引先回答納期、取引先回答納期備考は修正可能              
                 // [発注残]."発注状態区分" = 2:指示済の場合
                 if ("2".equals(formStruct.getPUCH_ODR_STS_TYP())) {
                  setWarningMessage("AE32610");
                  setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                 }
                 
                 // [発注残]."発注状態区分" = 9:受入完了の場合
                 if ("9".equals(formStruct.getPUCH_ODR_STS_TYP())) {
                  setWarningMessage("AE00151");
                  setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                 }
                 
                //時刻管理しないときは時刻を表示しない
                if(!(struct.getTIME_CTRL()).equals("true")){
                    formStruct.setPUCH_ODR_START_TIME("");
                    formStruct.setPUCH_ODR_DLV_TIME("");
                    formStruct.setCONFIRM_DLV_TIME("");
                }
              
                 // 中段明細項目データをセット
                 setStruct(formStruct);
                 struct.setSelectUnitCostFlag("true");
                 
         		/** 読込時、消費税コードを設定*/
                 _taxCd = struct.getTAX_CD();
         		         		
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
        AE0190010Struct itemStruct = null;   
		PuchUnitCostStruct pucs;
        // 取引先、購入単価、通貨、消費税を取得
        try { 					
    		// ｢発注予定日｣がNullの場合、｢発注予定日｣を算出する。
			if (struct.getPUCH_ODR_START_DATE() == null
					|| "".equals(struct.getPUCH_ODR_START_DATE())) {
				
	        	// 品目情報を取得
	    		List itemList = entity.mM_ITEM.read(conn, struct);
	    		if (itemList.isEmpty()) {
	    			setErrorMessage("AE50509");
	    			setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
	    			return;
	    		} else {
	    			// [品目]."品目手配区分"が1/4/5/6/7/8の場合
	    			itemStruct = (AE0190010Struct) itemList.get(0);
	    			if (("1".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("4".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("5".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("6".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("7".equals(itemStruct.getMRP_ODR_TYP()))
	    					|| ("8".equals(itemStruct.getMRP_ODR_TYP()))) {
	    				setErrorMessage("AE32601");
	    				setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
	    				return;
	    			}
	    		}
	    		
	    		// 発注納期の設定
				String PUCH_ODR_DLV_TIME = struct.getPUCH_ODR_DLV_TIME();
				// 入力時刻のチェック(時刻管理する場合のみ)
				if ("true".equals(struct.getTIME_CTRL())) {
					// ①発注納期(時刻)のチェック
					if ((PUCH_ODR_DLV_TIME).length() == 3) {
						// ３桁は頭に０を付ける
						PUCH_ODR_DLV_TIME = "0" + PUCH_ODR_DLV_TIME;
					} else {
						// 時刻管理しない場合は0000に設定
						PUCH_ODR_DLV_TIME = "0000";
					}
				} else {
					// 時刻管理しない場合は0000に設定
					PUCH_ODR_DLV_TIME = "0000";
				}
				
				// [業務日付]情報を部品より取得
				DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());
				// 通常品の場合は｢発注納期｣を元に発注予定日を算出しその結果を発注予定日とする。
				String resultDate = null;

				// ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
				if (!"1".equals(_SysInstallOptions_ASP)) {
					String fixedLt = itemStruct.getFIXED_LT();
					String propLt = itemStruct.getPROP_LT();
					String safetyLt = itemStruct.getSAFETY_LT();
					String propLotSize = itemStruct.getPROP_LOT_SIZE();

					String itemLt = Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
					itemLt = Calculate.multiply(itemLt, propLt);
					itemLt = Calculate.add(itemLt, fixedLt);
					itemLt = Calculate.add(itemLt, safetyLt);
					itemLt = Calculate.multiply(itemLt, "-1");

					resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(),PUCH_ODR_DLV_TIME, itemLt, true);
					if ("".equals(resultDate)) {
						setErrorMessage("AE00198");
						return;
					}
					// 算出した発注予定日 <
					// [日付制御]."業務運用日"の場合は[日付制御]."業務運用日"を｢発注予定日｣とする。
					if (DateTool.compareYMD(resultDate.substring(0, 10), dcs.getBUSINESS_OPR_DATE()) < 0) {
						struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
					} else {
						// 自動計算した結果を発注予定日とする
						struct.setPUCH_ODR_START_DATE(resultDate.substring(0, 10));
					}
					// ASPROVA連携オプション導入済の場合：時間単位のリードタイム計算を行う。
				} else {

					String propLotSize = itemStruct.getPROP_LOT_SIZE();
					String sWkDate, sShiftMin, sWkTime;

					ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD,this.sysUSER_CD, this.getProgramId());
					ATWorkCalendar atWC = new ATWorkCalendar(conn, this.sysUSER_CD, this.getProgramId(),
							this.sysPLANT_CD);
					Date puchOdrStartDate = null; // 発注予定日
					Date puchOdrDlvDate = null; // 発注納期

					// 発注納期が決定の状態
					puchOdrDlvDate = StrngToDt(this.struct.getPUCH_ODR_DLV_DATE()
							+ " " + (PUCH_ODR_DLV_TIME).substring(0, 2)
							+ ":" + (PUCH_ODR_DLV_TIME).substring(2, 4));
					// 発注予定日LTシフト(－)
					sShiftMin = ab.getProdLtMin(struct.getITEM_CD(), struct.getPUCH_ODR_QTY(), propLotSize, "U");
					sShiftMin = Calculate.multiply(sShiftMin, "-1"); // 過去へ
					puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START); // Conv
					sWkDate = DtGetDate(puchOdrStartDate);
					sWkTime = DtGetTime(puchOdrStartDate);
					struct.setPUCH_ODR_START_DATE(sWkDate);
					struct.setPUCH_ODR_START_TIME(sWkTime);
					_debugMsg = ("(AD0010/EJa-ASP)TIME: "
							+ "PUCH_ODR_DLV_DATE" + "["
							+ this.struct.getPUCH_ODR_DLV_DATE() + "],"
							+ "PUCH_ODR_DLV_TIME" + "[" + PUCH_ODR_DLV_TIME
							+ "]," + "PUCH_ODR_START_DATE" + "["
							+ this.struct.getPUCH_ODR_START_DATE() + "],"
							+ "PUCH_ODR_START_TIME" + "["
							+ struct.getPUCH_ODR_START_TIME() + "], "
							+ "sShiftMin" + "[" + sShiftMin + "] ");
					sysLog.info("ZZ01006", struct.getsUser_ID(), _debugMsg);
				}
			}
                 pucs =

                 PuchUnitCostControl.getDataTax(
                         conn,
                         _myCompanyStruct.getCOMPANY_CD(),
                         struct.getVEND_CD(),
                         struct.getPLANT_CD(),
                         struct.getITEM_CD(),
                         struct.getPUCH_ODR_START_DATE(),
                         struct.getPUCH_ODR_DLV_DATE(),
                         struct.getPUCH_ODR_QTY(),
                         _taxCd);  
                 
                 struct.setTAX_CD(pucs.getTAX_CD());   
                 
                 struct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
                 struct.setUNIT_COST(pucs.getUNIT_COST());
                 struct.setPROCESSING_COST(pucs.getPROCESSING_COST());
                 struct.setMATERIAL_COST(pucs.getMATERIAL_COST());
                 struct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
                 struct.setPUCH_ODR_AMOUNT(pucs.getPUCH_ODR_AMOUNT());
                 struct.setTAX_RATE_1(pucs.getTAX_RATE_1());
                 struct.setTAX_RATE_2(pucs.getTAX_RATE_2());
                 struct.setTAX_RATE_3(pucs.getTAX_RATE_3());
                 struct.setNET_AMOUNT(pucs.getNET_AMOUNT());
                 struct.setDISC_AMOUNT(pucs.getDISC_AMOUNT());
                 struct.setTAX_AMOUNT_1(pucs.getTAX_AMOUNT_1());
                 struct.setTAX_AMOUNT_2(pucs.getTAX_AMOUNT_2());
                 struct.setTAX_AMOUNT_3(pucs.getTAX_AMOUNT_3());
                 struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
                 struct.setTAX_ROUND_TYP(pucs.getTAX_ROUND_TYP());
                 struct.setROUND_TYP(pucs.getROUND_TYP());
                 struct.setCUR_CD(pucs.getCUR_CD());
                 struct.setCUR_NAME(pucs.getCUR_NAME());
                 struct.setVEND_CUR_UNIT(pucs.getCUR_UNIT());
                 struct.setVEND_DECIMAL_FIG(pucs.getDECIMAL_FIG());
                 

                 //内税の場合に税額を計算する
         		String lowerTaxCd =
         			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
        		if (!lowerTaxCd.equals("1")) {
        			//バッチパラメータ呼出
        			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
        			if(!batList.isEmpty()){
        				//税計算部品をコール
        				AE0190010Struct batStruct = (AE0190010Struct)batList.get(0);
        				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
        				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
        				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
        				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
        				struct.setPVC2USERID(this.sysUSER_CD);
        				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
        				struct.setPVC2PLANTCD(this.sysPLANT_CD);
        				struct.setPVC2TAXID("5");
        				batList = entity.mcallSQLCALCTAXCALCAMTFD.call(conn, struct);
        				batStruct = (AE0190010Struct)batList.get(0);
        				if(!"1".equals(batStruct.getPNUMSTATUS())){
        					setErrorMessage(batStruct.getPVC2ERRCD());
        					return;      				       				
        				}
        				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
        				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
        				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
        				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
        			}else{
        				setErrorMessage("ZZ09007");        				
        			}
             	  }
 
                } catch (DataNotFoundException e) {
                 setErrorMessage("AE00060", e.getMessage());
                 setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
                 setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                 setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
                 setErrorParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_START_DATE",
                  struct.getPUCH_ODR_START_DATE());
                 setErrorParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_DLV_DATE",
                  struct.getPUCH_ODR_DLV_DATE());
                 setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getPUCH_ODR_QTY());
                 return;
                } catch (Exception e) {
                 throw new ExpjException(e);
                }
              
                // 為替レートが存在しない場合はワーニング扱いとするため別に取得
                try {
                 ExchRateStruct ers =
                  ExchRateControl.getData(
                   conn,
                   _myCompanyStruct.getCOMPANY_CD(),
                   pucs.getCUR_CD(),
                   pucs.getEXCH_TYP(),
                   null,
                   struct.getPUCH_ODR_DLV_DATE());
                 // ｢為替レート｣を設定
                 struct.setEXCH_RATE(ers.getEXCH_RATE());
                 // ｢邦貨金額｣の計算
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   pucs.getAMOUNT_INCLUDE_TAX(),
                   ers.getEXCH_RATE(),
                   pucs.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
              
                 struct.setHOME_CUR_AMOUNT(homeCurAmount);
              
                } catch (DataNotFoundException e) {
                 struct.setHOME_CUR_AMOUNT("0");
                 struct.setEXCH_RATE("0");
                 setWarningMessage("AE00061");
                 setWarningParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
                 setWarningParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                 setWarningParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
                 setWarningParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_START_DATE",
                  struct.getPUCH_ODR_START_DATE());
                 setWarningParameter(
                  "T_RLSD_PUCH_ODR",
                  "PUCH_ODR_DLV_DATE",
                  struct.getPUCH_ODR_DLV_DATE());
                 setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getPUCH_ODR_QTY());
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
              
                struct.setSelectUnitCostFlag("true");
              
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
		         // フラグを初期化
		         _Itemflg = true;
 	             
                 String PUCH_ODR_START_TIME = struct.getPUCH_ODR_START_TIME();
	             String PUCH_ODR_DLV_TIME = struct.getPUCH_ODR_DLV_TIME();
	             String CONFIRM_DLV_TIME = struct.getCONFIRM_DLV_TIME();
                                   	
                 //入力時刻のチェック(時刻管理する場合のみ)
                 if((struct.getTIME_CTRL()).equals("true")){
                 	

                     //①発注予定日(時刻)のチェック
                     if((PUCH_ODR_START_TIME).length() == 3 ){
                         //３桁は頭に０を付ける
                     	 PUCH_ODR_START_TIME = "0" + PUCH_ODR_START_TIME;
                     }
                     
                     //②発注納期(時刻)のチェック
                     if((PUCH_ODR_DLV_TIME).length() == 3 ){
                      	//３桁は頭に０を付ける
                         PUCH_ODR_DLV_TIME = "0" + PUCH_ODR_DLV_TIME;
                     }
                     
                     //③取引先回答納期(時刻)のチェック
                     if((CONFIRM_DLV_TIME).length() == 3 ){
                     	//３桁は頭に０を付ける
                         CONFIRM_DLV_TIME = "0" + CONFIRM_DLV_TIME;
                     }
                 }else{
                 	 //時刻管理しない場合は0000に設定
                 	 PUCH_ODR_START_TIME = "0000";
	                 PUCH_ODR_DLV_TIME = "0000";
	                 CONFIRM_DLV_TIME = "0000";
                 }

                 // ｢工場コード｣で[工場]を検索し、存在しなかった場合
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
              
                 // ｢品目番号｣がnullの場合以下のチェックを行わない
                 AE0190010Struct itemStruct = null;
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // ｢品目番号｣で、[品目]に存在しなかった場合
                  List itemList = entity.mM_ITEM.read(conn, struct);
                  if (itemList.isEmpty()) {
                   setErrorMessage("AE50509");
                   setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   _Itemflg = false;
                  } else {
                   // [品目]."品目手配区分"が1/4/5/6/7/8の場合
                   itemStruct = (AE0190010Struct) itemList.get(0);
                   if (("1".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("4".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("5".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("6".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("7".equals(itemStruct.getMRP_ODR_TYP()))
                    || ("8".equals(itemStruct.getMRP_ODR_TYP()))) {
                    setErrorMessage("AE32601");
                    setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   }
                  }
                 }
                 
                 //「製番」 ≠ Nullの場合、[製番計画]を検索し１件でも製番計画が存在した場合
                 if(!(struct.getJOB_ODR_CD() == null || struct.getJOB_ODR_CD().length()<=0)){
                	 List tjobodrList = entity.mT_JOB_ODR_CHK.read(conn, struct);
                     if(!tjobodrList.isEmpty()){
                    	 setErrorMessage("AE01010");
                         setErrorParameter("T_JOB_ODR", "JOB_ODR_CD", struct.getJOB_ODR_CD());
                     }
                 }
                 
                 //「案件番号」 ≠ Nullの場合、[案件]を検索し存在しなかった場合
                if(!(struct.getPROJECT_CD() == null || struct.getPROJECT_CD().length() <= 0)){
                	List projectList =entity.mT_PROJECT_CHK.read(conn, struct);
                	if(projectList.isEmpty()){
                		setErrorMessage("AE01011");
                        setErrorParameter("T_PROJECT", "PROJECT_CD", struct.getPROJECT_CD());
                	}
                }
              
                 if (!plantList.isEmpty()) {
                  // [業務日付]情報を部品より取得
                  DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());
              
                  if (!isWorkDay(struct.getPUCH_ODR_DLV_DATE())) {
                   setErrorMessage("AE00028");
                   setErrorParameter(
                    "T_RLSD_PUCH_ODR",
                    "PUCH_ODR_DLV_DATE",
                    struct.getPUCH_ODR_DLV_DATE());
                  }
                 
                 
                 // ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
                 if(!"1".equals(_SysInstallOptions_ASP)){	
                	 	// ｢発注納期｣ < [日付制御]." 業務運用日"の場合
                	 	if (DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())
                	 			< 0) {
                	 					setErrorMessage("AE00030");
                	 					setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                	 					setErrorParameter(
                	 							"SYS_DATE_CTRL",
                	 							"BUSINESS_OPR_DATE",
                	 							dcs.getBUSINESS_OPR_DATE());
                	 					setErrorParameter(
                	 							"T_RLSD_PUCH_ODR",
                	 							"PUCH_ODR_DLV_DATE",
                	 							struct.getPUCH_ODR_DLV_DATE());
                	 					}
                  }

                 // ｢発注予定日｣が != Nullの場合、以下のチェックを行う。
                  if (struct.getPUCH_ODR_START_DATE() != null
                   && !"".equals(struct.getPUCH_ODR_START_DATE())) {
                   // ｢発注予定日｣が非稼働日の場合
                   if (!isWorkDay(struct.getPUCH_ODR_START_DATE())) {
                    setErrorMessage("AE00029");
                    setErrorParameter(
                     "T_RLSD_PUCH_ODR",
                     "PUCH_ODR_START_DATE",
                     struct.getPUCH_ODR_START_DATE());
                   }

                   // ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
                   if(!"1".equals(_SysInstallOptions_ASP)){	
                	   	// ｢発注予定日｣ < [日付制御]." 業務運用日"の場合
                	   	if (DateTool
                	   			.compareYMD(struct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())
                	   			< 0) {
                	   					setErrorMessage("AE00031");
                	   					setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                	   					setErrorParameter(
                	   							"SYS_DATE_CTRL",
                	   							"BUSINESS_OPR_DATE",
                	   							dcs.getBUSINESS_OPR_DATE());
                	   					setErrorParameter(
                	   							"T_RLSD_PUCH_ODR",
                	   							"PUCH_ODR_START_DATE",
                	   							struct.getPUCH_ODR_START_DATE());
                	   					}
                   }

                  }
                 }
                 // ｢取引先コード｣が、[取引先]に存在しない場合
                 List vendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                 AE0190010Struct vendCtrlStruct = null;
                 if (vendCtrlList.isEmpty()) {
                  setErrorMessage("AE20030");
                  setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                 } else {
                  // ｢取引先｣."取引状態フラグ" = 1:取引停止の場合
                  vendCtrlStruct = (AE0190010Struct) vendCtrlList.get(0);
                  if ("1".equals(vendCtrlStruct.getDEAL_STS_FLG())) {
                   setErrorMessage("AE00002");
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                  }
                 }
                 // ｢受入場所｣が、[保管区]に存在しない場合
                 List whList = entity.mM_WH.read(conn, struct);
                 if (whList.isEmpty()) {
                  setErrorMessage("AE00018");
                  setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                 } else {
                  // [保管区]."工場コード" != ｢工場コード｣の場合
                  AE0190010Struct whStruct = (AE0190010Struct) whList.get(0);
                  if (!struct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
                   setErrorMessage("AE00032");
                   setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                   setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
                   setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                  }
                 }
                 // ｢発注担当者｣ != Nullで、かつ[ユーザマスタ]に存在しないとき
                 if ((struct.getPUCH_ODR_PERSON() != null)
                  && (struct.getPUCH_ODR_PERSON().length() > 0)) {
                  List userList = entity.mUSER_MST.read(conn, struct);
                  if (userList.isEmpty()) {
                   setErrorMessage("AE00005");
                   setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                  }
                 }
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  return;
                 }
                 TaxStruct ts = new TaxStruct();
                 CurStruct cs = new CurStruct();
                 // 画面外の必要なデータを設定
                 try {
                  // [消費税区分]情報を取得
                  ts =
                   TaxControl.getData(
                    conn,
                    struct.getCOMPANY_CD(),
                    struct.getVEND_CD(),
                    struct.getITEM_CD(),
                    struct.getPUCH_ODR_DLV_DATE());       
                  } catch (DataNotFoundException e) {
                	  setErrorMessage("AE00017");
                	  return;
                  }
                  
                  // [通貨]情報を取得
                  try {
                   cs =
                    CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
                  } catch (DataNotFoundException e) {
                	  setErrorMessage(e.getCode());
                	  return;
                  }
						//発注金額をまるめ処理
						String tempOdrAmount =
						AmountCalculator.calcPuchOdrAmount(
							struct.getPUCH_ODR_QTY(),
							struct.getUNIT_COST(),
							cs.getROUND_TYP(),
							cs.getDECIMAL_FIG());
		                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(tempOdrAmount)){
		                     // 多言語項目取得セット
		                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
		                	setErrorMessage("AA00215",ErrInfo);
		                	 return;
		                 }
						String tempNetAmount = Calculate.subtract(tempOdrAmount, struct.getDISC_AMOUNT());			             
                   struct.setTAX_CD(ts.getTAX_CD());

                   struct.setTAX_RATE_1(ts.getTAX_RATE_1());
                   struct.setTAX_RATE_2(ts.getTAX_RATE_2());
                   struct.setTAX_RATE_3(ts.getTAX_RATE_3());
                   
                  struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());            
                  struct.setROUND_TYP(cs.getROUND_TYP());
                  struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
              

              
                 // ｢発注予定日｣がNullの場合、｢発注予定日｣を算出する。
                 if (struct.getPUCH_ODR_START_DATE() == null
                  || "".equals(struct.getPUCH_ODR_START_DATE())) {
                  // [業務日付]情報を部品より取得
                  DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());
               // ｢発注納期｣を元に発注予定日を算出しその結果を発注予定日とする。
                  
            	  String resultDate = null;
            	  
            	  // ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
            	  if(!"1".equals(_SysInstallOptions_ASP)){	
            
            		  String fixedLt = itemStruct.getFIXED_LT();
            		  String propLt = itemStruct.getPROP_LT();
            		  String safetyLt = itemStruct.getSAFETY_LT();
            		  String propLotSize = itemStruct.getPROP_LOT_SIZE();
          
            		  String itemLt =
            			  Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
            		  itemLt = Calculate.multiply(itemLt, propLt);
            		  itemLt = Calculate.add(itemLt, fixedLt);
            		  itemLt = Calculate.add(itemLt, safetyLt);
            		  itemLt = Calculate.multiply(itemLt, "-1");

            		  resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(), PUCH_ODR_DLV_TIME, itemLt, true);

            		  if ("".equals(resultDate)){
            			  setErrorMessage("AE00198");
            			  return;
            		  }
            		  // 算出した発注予定日 < [日付制御]."業務運用日"の場合は[日付制御]."業務運用日"を｢発注予定日｣とする。
            		  if (DateTool.compareYMD(resultDate.substring(0,10), dcs.getBUSINESS_OPR_DATE()) < 0) {
            			  struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
            			  //時刻は発注納期の時刻をセット
            			  PUCH_ODR_START_TIME = PUCH_ODR_DLV_TIME;
            		  } else {
            			  //自動計算した結果を発注予定日とする
            			  struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
            			  PUCH_ODR_START_TIME = resultDate.substring(10);
            		  }
            	  // ASPROVA連携オプション導入済の場合：時間単位のリードタイム計算を行う。
            	  }else{
               
            		  String propLotSize = itemStruct.getPROP_LOT_SIZE();
            		  String sWkDate, sShiftMin,sWkTime ;
	        	
            		  ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
            				  this.sysUSER_CD, 
            				  this.getProgramId());
            		  ATWorkCalendar atWC = new ATWorkCalendar(conn, 
            				  this.sysUSER_CD , 
            				  this.getProgramId(), 
            				  this.sysPLANT_CD) ;
            		  Date puchOdrStartDate = null;	  // 発注予定日
            		  Date puchOdrDlvDate = null;	  // 発注納期

            		  //発注納期が決定の状態
            		  puchOdrDlvDate = StrngToDt(this.struct.getPUCH_ODR_DLV_DATE() + " " + (PUCH_ODR_DLV_TIME).substring(0,2) + ":" + (PUCH_ODR_DLV_TIME).substring(2,4));
            		  //■CHG 20081222 発注予定日LTシフト(－)-----------------------------
            		  //struct.getPUCH_ODR_QTY(), propLotSize				
            		  sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),struct.getPUCH_ODR_QTY(),propLotSize,"U");
            		  sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
            		  puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
            		  sWkDate =DtGetDate(puchOdrStartDate);
            		  sWkTime =DtGetTime(puchOdrStartDate);
            		  this.struct.setPUCH_ODR_START_DATE(sWkDate);
            		  this.struct.setPUCH_ODR_START_TIME(sWkTime);
            		  PUCH_ODR_START_TIME = sWkTime;
            		  _debugMsg = ("(AD0010/EJa-ASP)TIME: "
            				  + "PUCH_ODR_DLV_DATE" + "[" + this.struct.getPUCH_ODR_DLV_DATE() + "]," 
            				  + "PUCH_ODR_DLV_TIME" + "[" + PUCH_ODR_DLV_TIME + "],"  
            				  + "PUCH_ODR_START_DATE" + "[" + this.struct.getPUCH_ODR_START_DATE() + "],"  
            				  + "PUCH_ODR_START_TIME" + "[" + struct.getPUCH_ODR_START_TIME() + "], "
            				  + "sShiftMin" + "[" + sShiftMin + "] " );
            		  sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
		        
            		  resultDate = struct.getPUCH_ODR_START_DATE() + " " +  PUCH_ODR_START_TIME;
            	  
            		  // 自動計算した結果を発注予定日とする
        			  struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
        			  PUCH_ODR_START_TIME = resultDate.substring(11);
            	  
            	  }
            	  if("".equals(struct.getPUCH_ODR_START_DATE()))
            	  {
                      // [業務日付]."業務運用日"を発注予定日とする。
                      struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
                      //時刻は発注納期の時刻をセット
                      PUCH_ODR_START_TIME = PUCH_ODR_DLV_TIME;
            	  }
                 }
                 
                 //[品目] が存在した場合、[製品構成]を検索し１件でも製品構成が存在した場合
                 List mpsList = entity.mM_PS.read(conn, struct);
                 if(!mpsList.isEmpty()){
               	  setErrorMessage("AE01009");
                     setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                     return;
                 }
              	
                 /** 発注予定日（時刻含む）*/
                 struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
				 /** 発注納期（時刻含む）*/
			     struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
				 /** 取引先回答納期（時刻含む）*/
                 if(struct.getCONFIRM_DLV_DATE() != null && !("".equals(struct.getCONFIRM_DLV_DATE()))){
                 	struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
                 }
                 
                 if(Calculate.compare(struct.getNET_AMOUNT(), tempNetAmount) != 0){
                 	//購入単価を読込み、存在すれば単価読込を促すエラー、存在しない(もしくは仮単価かつ単価0)の場合は、
                	//ワーニングとして丸め後の金額を本体金額とし、処理続行         
                    //但し、備品発注でかつ、｢品目番号｣がNullの場合はその時点でワーニング(購入単価が存在しないから)
                     if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
 	                 	PuchUnitCostStruct pucs;
	                 	pucs =
	                         PuchUnitCostControl.getData(
	                          conn,
	                          _myCompanyStruct.getCOMPANY_CD(),
	                          struct.getVEND_CD(),
	                          struct.getPLANT_CD(),
	                          struct.getITEM_CD(),
	                          struct.getPUCH_ODR_START_DATE(),
	                          struct.getPUCH_ODR_DLV_DATE(),
	                          struct.getPUCH_ODR_QTY());	 
	                 	
	                 	if("1".equals(pucs.getUNIT_COST_TYP()) &&
	                 			"0.00".equals(pucs.getUNIT_COST()) &&
	                 			"0.00".equals(pucs.getPROCESSING_COST()) &&
	                 			"0.00".equals(pucs.getMATERIAL_COST()) &&
	                 			"0.00".equals(pucs.getOTHER_OVERHEADS())){
	                 			struct.setNET_AMOUNT(tempNetAmount);
							    setWarningMessage("AE00200");                 		
	                 	}else{
							    setErrorMessage("AE00147");
								return;
	                 	}

                     }else{
                    	 	struct.setNET_AMOUNT(tempNetAmount);
						    setWarningMessage("AE00200"); 
                     }
				}
				
                 // ｢品目番号｣がNullの場合は以下の処理を行わない
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // 整数管理品目の場合、｢発注数｣を切り上げ
                  if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
                   String ceilPuchOdrQty = Calculate.ceil(struct.getPUCH_ODR_QTY(), 0);
                   if (Calculate.compare(ceilPuchOdrQty, struct.getPUCH_ODR_QTY()) != 0) {
                    struct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                    setWarningMessage("AE00034");
                    setWarningParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   }
                  }
                 }
                 // ｢発注金額｣の計算
                 String puchOdrAmount =
                  AmountCalculator.calcPuchOdrAmount(
                   struct.getPUCH_ODR_QTY(),
                   struct.getUNIT_COST(),
                   struct.getROUND_TYP(),
                   struct.getVEND_DECIMAL_FIG());
                 struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                     // 多言語項目取得セット
                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
                	setErrorMessage("AA00215",ErrInfo);
                	 return;
                 }
                 // ｢値引金額｣の計算
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                   struct.getPUCH_ODR_AMOUNT(),
                   struct.getNET_AMOUNT());
                 struct.setDISC_AMOUNT(discAmount);
                 
                //内税の場合に税額を計算する
         		String lowerTaxCd =
         			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
         		if (!lowerTaxCd.equals("1")) {
        			//バッチパラメータ呼出
        			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
        			if(!batList.isEmpty()){
        				//税計算部品をコール
        				AE0190010Struct batStruct = (AE0190010Struct)batList.get(0);
        				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
        				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
        				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
        				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
        				struct.setPVC2USERID(this.sysUSER_CD);
        				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
        				struct.setPVC2PLANTCD(this.sysPLANT_CD);
        				struct.setPVC2TAXID("5");
        				batList = entity.mcallSQLCALCTAXCALCAMTFD.call(conn, struct);
        				batStruct = (AE0190010Struct)batList.get(0);
        				if(!"1".equals(batStruct.getPNUMSTATUS())){
        					setErrorMessage(batStruct.getPVC2ERRCD());
        					return;      				       				
        				}
        				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
        				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
        				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
        				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
        			}else{
        				setErrorMessage("ZZ09007");        				
        			}
             	}else{
	                 // ｢税額1｣の計算
	                 String taxAmount1 =
	                  AmountCalculator.calcTaxAmount(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_RATE_1(),
	                   struct.getTAX_ROUND_TYP(),
	                   struct.getVEND_DECIMAL_FIG());
	                 struct.setTAX_AMOUNT_1(taxAmount1);
	                 // ｢税額2｣の計算
	                 String taxAmount2 =
	                  AmountCalculator.calcTaxAmount(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_RATE_2(),
	                   struct.getTAX_ROUND_TYP(),
	                   struct.getVEND_DECIMAL_FIG());
	                 struct.setTAX_AMOUNT_2(taxAmount2);
	                 // ｢税額3｣の計算
	                 String taxAmount3 =
	                  AmountCalculator.calcTaxAmount(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_RATE_3(),
	                   struct.getTAX_ROUND_TYP(),
	                   struct.getVEND_DECIMAL_FIG());
	                 struct.setTAX_AMOUNT_3(taxAmount3);
	                 // ｢税込金額｣の計算
	                 String amountIncludeTax =
	                  AmountCalculator.calcAmountIncludeTax(
	                   struct.getNET_AMOUNT(),
	                   struct.getTAX_AMOUNT_1(),
	                   struct.getTAX_AMOUNT_2(),
	                   struct.getTAX_AMOUNT_3());
	                 struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
	                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
	                     // 多言語項目取得セット
	                    String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
	                	setErrorMessage("AA00215",ErrInfo);
	                	 return;
	                 }
             	}
         		
                 // ｢邦貨金額｣の計算
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   struct.getAMOUNT_INCLUDE_TAX(),
                   struct.getEXCH_RATE(),
                   struct.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 struct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                      // 多言語項目取得セット
                     String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
                	 setErrorMessage("AA00215",ErrInfo);
                	 return;
                 }
 
                  struct.setNON_NO_ITEM_FLG("0");
                  struct.setITEM_NAME(null);
                  struct.setPRODUCT_TYP("0");
                  struct.setSTOCK_UNIT(null);
                  struct.setINV_CTRL_FLG("1");

                  //　製番
				 String strJobOdrCD = "";
				 //
				 if("true".equals(struct.getc_JOB_ODR())) {
					 //製番を自動採番するが、チェックOn の場合、採番を行う
				  try{	
					    Numbering number = new Numbering(conn,Numbering.JOB_OD_CD, struct.getsUser_ID(),sp.getProcId(),struct.getPLANT_CD());
				         strJobOdrCD = number.getNo();
				
				    }catch(Exception e){
				    	setErrorMessage(e.getMessage());
					    setErrorMessage("AB00023");
					    return;
				    }

					 if(strJobOdrCD == null){
						 setErrorMessage("AB00023");
						 return;
					 }
					 struct.setJOB_ODR_CD(strJobOdrCD);
					 //製番を自動採番するがチェックOn の場合  0:自動採番
					 struct.seth_JOB_ODR_INPUT_FLG("0");
				 }else{
					 strJobOdrCD = struct.getJOB_ODR_CD();
					 //製番入力区分 製番を自動採番するがチェックOff の場合  1:手入力
					 struct.seth_JOB_ODR_INPUT_FLG("1");
				 }
                
                 //設定された新規の製番情報を、表に従い[製番計画]へ追加する。
				 entity.mT_JOB_ODR.create(conn, struct);
				 
                 //「製番」、「製番枝番」、“製番取消明細番号”= 0 の組み合わせが
                 //[所要量]上で重複している場合
				 struct.setJOB_ODR_CD(strJobOdrCD);
                 List todList = entity.mT_OD_CHK.read(conn, struct);
                 if(!todList.isEmpty()){
               	  setErrorMessage("ZZ01102");
               	  return;
                 }
				 
                 //「工場コード」、登録済み「製番」の組み合わせが[所要量計算制御（製番）]に存在していない場合、
				// 表に従い[所要量計算制御（製番）]へ追加する。
				List sysjobList = entity.mSYS_JOB_OD_CALC_CTRL.read(conn, struct);
				if(sysjobList.isEmpty()){
					entity.mSYS_JOB_OD_CALC_CTRL.create(conn, struct);
				}
				
				//オーダデマンド番号採番
				String odNo = "";
				CollectNumber collect = new CollectNumber(CollectNumber.ODNO, struct.getsUser_ID(), this.sp.getProcId(), struct.getPLANT_CD());
				// オーダデマンド番号取得
				odNo = collect.getNo();
				if(odNo == null){
					setErrorMessage("AB00045");
					return;
				}
				//オーダデマンド番号を設定
				struct.setOD_NO(odNo);
				 itemStruct = null;
                 // 所要量] の追加のため、[品目]からデータを取得
                 List itemList = entity.mM_ITEM.read(conn, struct);
                 itemStruct =(AE0190010Struct)itemList.get(0);
                 
                //所要量出庫区分 = [品目].“出庫区分”
				struct.setISSUE_TYP(itemStruct.getISSUE_TYP());
				
				//手配リードタイム  = [品目].“手配リードタイム”
				struct.setODR_LT(itemStruct.getODR_LT());
				
				//固定分リードタイム	= [品目].“固定分リードタイム”
				struct.setFIXED_LT(itemStruct.getFIXED_LT());
				
				//比例分リードタイム	= [品目].“比例分リードタイム”
				struct.setPROP_LT(itemStruct.getPROP_LT());
				
				//安全日数	    = [品目].“安全日数”
				struct.setSAFETY_LT(itemStruct.getSAFETY_LT());
				
				//払出リードタイム	= [品目].“払出リードタイム”
				struct.setISSUE_LT(itemStruct.getISSUE_LT());
				
				//比例分ロットサイズ	= [品目].“比例分ロットサイズ”
				struct.setPROP_LOT_SIZE(itemStruct.getPROP_LOT_SIZE());
				
				//所要量品目仕損率 = [品目].“品目仕損率”
				struct.setITEM_SPOIL(itemStruct.getITEM_SPOIL());
				
				//品目手配区分 =[品目].“品目手配区分”
				struct.setMRP_ODR_TYP(itemStruct.getMRP_ODR_TYP());
				
				//所要量] の追加を行う。
				entity.mT_OD.create(conn, struct);
              
                 // 発注番号を自動採番
                 Numbering puchCdNumbering =
                  new Numbering(
                   conn,
                   Numbering.PUCH_CD,
                   sysUSER_CD,
                   sp.getProcId(),
                   struct.getPLANT_CD());
                 struct.setPUCH_ODR_CD(puchCdNumbering.getNo());
                 
                 //発注時受入検査区分 = [品目].“受入検査区分”
                 struct.setACPT_INSPC_TYP(itemStruct.getACPT_INSPC_TYP());
                 // [発注残]を登録
                 entity.mT_RLSD_PUCH_ODR.create(conn, struct);
              
                 // 登録後データ再表示
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } catch (ParseException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
		         // フラグを初期化
		         _Itemflg = true;
		         String tempNetAmount = null;         	 
                 String PUCH_ODR_START_TIME = struct.getPUCH_ODR_START_TIME();
	             String PUCH_ODR_DLV_TIME = struct.getPUCH_ODR_DLV_TIME();
	             String CONFIRM_DLV_TIME = struct.getCONFIRM_DLV_TIME();
                       	                                 
                 //入力時刻のチェック(時刻管理する場合のみ)
                 if((struct.getTIME_CTRL()).equals("true")){
                 	
                     //①発注予定日(時刻)のチェック
                     if((PUCH_ODR_START_TIME).length() == 3 ){
                         //３桁は頭に０を付ける
                     	 PUCH_ODR_START_TIME = "0" + PUCH_ODR_START_TIME;
                     }
                     
                     //②発注納期(時刻)のチェック
                     if((PUCH_ODR_DLV_TIME).length() == 3 ){
                         //３桁は頭に０を付ける
                         PUCH_ODR_DLV_TIME = "0" + PUCH_ODR_DLV_TIME;
                     }
                     
                     //③取引先回答納期(時刻)のチェック
                     if((CONFIRM_DLV_TIME).length() == 3 ){
                     	//３桁は頭に０を付ける
                        CONFIRM_DLV_TIME = "0" + CONFIRM_DLV_TIME;

                     }
                 }else{
                 	 //時刻管理しない場合は0000に設定
                 	 PUCH_ODR_START_TIME = "0000";
	                 PUCH_ODR_DLV_TIME = "0000";
	                 CONFIRM_DLV_TIME = "0000";
                 }

                 // ｢工場コード｣+｢発注番号｣が、[発注残]に存在しないとき
                 List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  return;
                 }
                 AE0190010Struct lockedStruct = (AE0190010Struct) lockedList.get(0);
                 // [発注残]."更新数" != ｢更新数｣(hidden使用)の場合
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
                 if("2".equals(lockedStruct.getPUCH_ODR_STS_TYP())){
    				 /** 取引先回答納期（時刻含む）*/
                     if(struct.getCONFIRM_DLV_DATE() != null && !("".equals(struct.getCONFIRM_DLV_DATE()))){
                     	struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
                     }
                     
                     //「案件番号」 ≠ Nullの場合、[案件]を検索し存在しなかった場合
                     if(!(struct.getPROJECT_CD() == null || struct.getPROJECT_CD().length() <= 0)){
                     	List projectList =entity.mT_PROJECT_CHK.read(conn, struct);
                     	if(projectList.isEmpty()){
                     		setErrorMessage("AE01011");
                             setErrorParameter("T_PROJECT", "PROJECT_CD", struct.getPROJECT_CD());
                     	}
                     }
                     
                     // データ更新処理
                     entity.mT_RLSD_PUCH_ODR_2.update(conn, struct);
                     conn.commit();
                     // 更新後データ再表示
                     controlSelect();   
                     return;
                 }
              
                 // ｢品目番号｣がnullの場合以下のチェックを行わない
                 AE0190010Struct itemStruct = null;
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // ｢品目番号｣が、[品目]に存在しなかった場合
                  List itemList = entity.mM_ITEM.read(conn, struct);
                  if (itemList.isEmpty()) {
                   setErrorMessage("AE50509");
                   setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   _Itemflg = false;
                  } else {
                   itemStruct = (AE0190010Struct) itemList.get(0);
                  }
                 }
              
                //「案件番号」 ≠ Nullの場合、[案件]を検索し存在しなかった場合
                if(!(struct.getPROJECT_CD() == null || struct.getPROJECT_CD().length() <= 0)){
                	List projectList =entity.mT_PROJECT_CHK.read(conn, struct);
                	if(projectList.isEmpty()){
                		setErrorMessage("AE01011");
                        setErrorParameter("T_PROJECT", "PROJECT_CD", struct.getPROJECT_CD());
                	}
                }
              
                 // [業務日付]情報を部品より取得
                 DateCtrlStruct dcs = DateCtrlControl.getData(conn, struct.getPLANT_CD());

                  // ｢発注納期｣が非稼働日の場合
                  if (!isWorkDay(struct.getPUCH_ODR_DLV_DATE())) {
                   setErrorMessage("AE00028");
                   setErrorParameter(
                    "T_RLSD_PUCH_ODR",
                    "PUCH_ODR_DLV_DATE",
                    struct.getPUCH_ODR_DLV_DATE());
                  }

                  
                  // ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
                  if(!"1".equals(_SysInstallOptions_ASP)){	 
                  
                	  // ｢発注納期｣ < [日付制御]."業務運用日"の場合
                	  if (DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())
                			  < 0) {
                		  setErrorMessage("AE00030");
                		  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                		  setErrorParameter("SYS_DATE_CTRL", "BUSINESS_OPR_DATE", dcs.getBUSINESS_OPR_DATE());
                		  setErrorParameter(
                				  "T_RLSD_PUCH_ODR",
                				  "PUCH_ODR_DLV_DATE",
                				  struct.getPUCH_ODR_DLV_DATE());
                	  }
                  }
                 
                  // ｢発注予定日｣がNotNullの場合、以下のチェックを行う。
                  if (struct.getPUCH_ODR_START_DATE() != null
                   && !"".equals(struct.getPUCH_ODR_START_DATE())) {
                   // ｢発注予定日｣が非稼働日の場合
                   if (!isWorkDay(struct.getPUCH_ODR_START_DATE())) {
                    setErrorMessage("AE00029");
                    setErrorParameter(
                     "T_RLSD_PUCH_ODR",
                     "PUCH_ODR_START_DATE",
                     struct.getPUCH_ODR_START_DATE());
                   }

                   // ASPROVA連携オプション未導入の場合(導入済の場合、過去日付の登録可)
                   if(!"1".equals(_SysInstallOptions_ASP)){	
                   
                   		// ｢発注予定日｣ < [日付制御]."業務運用日"の場合
                	   if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), dcs.getBUSINESS_OPR_DATE())< 0) {
                		   setErrorMessage("AE00031");
                		   setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                		   setErrorParameter(
                				   "SYS_DATE_CTRL",
                				   "BUSINESS_OPR_DATE",
                				   dcs.getBUSINESS_OPR_DATE());
                		   setErrorParameter(
                				   "T_RLSD_PUCH_ODR",
                				   "PUCH_ODR_START_DATE",
                				   struct.getPUCH_ODR_START_DATE());
                	   }
                   }
                
                  }
              
                 // 内作の場合はチェックしない
                 if (!"1".equals(struct.getOUTSIDE_TYP())) {
                  // ｢取引先コード｣が、[取引先]に存在しない場合
                  List vendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (vendCtrlList.isEmpty()) {
                   setErrorMessage("AE20030");
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                  } else {
                   // ｢取引先｣."取引状態フラグ" = 1:取引停止の場合
                   AE0190010Struct vendCtrlStruct = (AE0190010Struct) vendCtrlList.get(0);
                   if (vendCtrlStruct.getDEAL_STS_FLG().equals("1")) {
                    setErrorMessage("AE00002");
                    setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                   }
                  }
                  // ｢受入場所｣が、[保管区]に存在しない場合
                  List whList = entity.mM_WH.read(conn, struct);
                  if (whList.isEmpty()) {
                   setErrorMessage("AE00018");
                   setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                  } else {
                   // [保管区]."工場コード" != ｢工場コード｣の場合
                   AE0190010Struct whStruct = (AE0190010Struct) whList.get(0);
                   if (!struct.getPLANT_CD().equals(whStruct.getPLANT_CD())) {
                    setErrorMessage("AE00032");
                    setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                    setErrorParameter("M_WH", "PLANT_CD", whStruct.getPLANT_CD());
                    setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                   }
                  }
                  // ｢発注担当者｣ != Null かつ、[ユーザマスタ]に存在しない場合
                  if ((struct.getPUCH_ODR_PERSON() != null)
                   && (struct.getPUCH_ODR_PERSON().length() > 0)) {
                   List userList = entity.mUSER_MST.read(conn, struct);
                   if (userList.isEmpty()) {
                    setErrorMessage("AE00005");
                    setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                   }
                  }
                 }
              
                 // [発注残]."オーダデマンド番号"で[所要量]を検索
                 // [所要量]."製番" != Null の場合のみ、以下のチェック処理を行う
                 AE0190010Struct odStruct = null;
                 List odList = entity.mT_OD.read(conn, struct);
                 odStruct = (AE0190010Struct) odList.get(0);
                 if (odStruct.getJOB_ODR_CD() != null) {
                  // ｢製番｣で、[製番計画]を検索し、[製番計画]."製番納期納期" < ｢発注納期｣の場合
                  List jobOdrList = entity.mT_JOB_ODR.read(conn, odStruct);
                  AE0190010Struct jobOdrStruct = (AE0190010Struct) jobOdrList.get(0);
					if(DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())> 0){
						//[製番計画].“納期”が業務運用日以降の場合
						if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(),dcs.getBUSINESS_OPR_DATE()) >= 0){
							setErrorMessage("AE32604");
							setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
							setErrorParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
							setErrorParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
							setErrorParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
						}else{
							//[製番計画].“納期”が業務運用日より過去の場合
							setWarningMessage("AE32605");
							setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
							setWarningParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
							setWarningParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
							setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
						}
					}
					//[所要量].“製番”で [製番計画] を検索し、[製番計画].“製番納期” ＜＞ 「発注納期」
					if(DateTool.compareYMD(struct.getPUCH_ODR_DLV_DATE(),jobOdrStruct.getJOB_ODR_DLV_DATE())!=0){
						//かつ[製番計画].“納期”が業務運用日以降の場合
						if(DateTool.compareYMD(jobOdrStruct.getJOB_ODR_DLV_DATE(), dcs.getBUSINESS_OPR_DATE())>=0){
							setWarningMessage("AE01015");
							setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
							setWarningParameter("T_OD", "JOB_ODR_CD", odStruct.getJOB_ODR_CD());
							setWarningParameter("T_JOB_ODR","JOB_ODR_DLV_DATE",jobOdrStruct.getJOB_ODR_DLV_DATE());
							setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
						}				
					}
                 }
                 
                 // エラーがあった場合は処理を中断
                 if (msgStruct.hasError()) {
                     return;
                 }
                 
				//  外作の場合のみ
                 if ( !"1".equals(struct.getOUTSIDE_TYP()) 
						 && ( (struct.getVEND_CD() != null) && (struct.getVEND_CD().length() > 0) ) ) {
                	 TaxStruct ts = new TaxStruct();
                	 CurStruct cs = new CurStruct();
                    // [消費税区分]情報を取得
                	 try{
                        ts =
                        TaxControl.getDataTax(
                                conn,
                                struct.getCOMPANY_CD(),
                                struct.getVEND_CD(),
                                struct.getITEM_CD(),
                                struct.getPUCH_ODR_DLV_DATE(),
                                _taxCd);
                   
                	 } catch (DataNotFoundException e){
                		 setErrorMessage("AE00017"); 
                		 return;
                	 }

 					// [通貨]情報を取得         
                	 try {
                	  cs =
                         CurControl.getData(conn, struct.getCOMPANY_CD(), struct.getVEND_CD());
                	 } catch (DataNotFoundException e) {
                		 setErrorMessage(e.getCode()); 
                		 return;
                	 }
					//発注金額をまるめ処理
					String tempOdrAmount =
					AmountCalculator.calcPuchOdrAmount(
						struct.getPUCH_ODR_QTY(),
						struct.getUNIT_COST(),
						cs.getROUND_TYP(),
						cs.getDECIMAL_FIG());
	                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(tempOdrAmount)){
	                      // 多言語項目取得セット
	                     String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
	                	 setErrorMessage("AA00215",ErrInfo);
	                	 return;
	                 }
					tempNetAmount = Calculate.subtract(tempOdrAmount, struct.getDISC_AMOUNT());
		             
                    // エラーがあった場合は処理を中断
                   if (msgStruct.hasError()) {
                       return;
                   }
 
                 // [消費税区分]情報をセット

                   struct.setTAX_CD(ts.getTAX_CD());
                   struct.setTAX_RATE_1(ts.getTAX_RATE_1());
                   struct.setTAX_RATE_2(ts.getTAX_RATE_2());
                   struct.setTAX_RATE_3(ts.getTAX_RATE_3());

                  struct.setTAX_ROUND_TYP(ts.getTAX_ROUND_TYP());
  	  
	  			  struct.setROUND_TYP(cs.getROUND_TYP());
                  struct.setVEND_DECIMAL_FIG(cs.getDECIMAL_FIG());
				  }

                 // ｢発注予定日｣がNullの場合、｢発注予定日｣を算出する。
                 if (struct.getPUCH_ODR_START_DATE() == null
                  || "".equals(struct.getPUCH_ODR_START_DATE())) {
                	 // 通常品の場合は｢発注納期｣を元に発注予定日を算出しその結果を発注予定日とする。
               	  
               	  String resultDate = null;
               	  
               	  // ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
               	  if(!"1".equals(_SysInstallOptions_ASP)){	
               		  String fixedLt = odStruct.getFIXED_LT();
               		  String propLt = odStruct.getPROP_LT();
               		  String safetyLt = odStruct.getSAFETY_LT();
               		  String propLotSize = odStruct.getPROP_LOT_SIZE();
             
               		  String itemLt =
               			  Calculate.divide(struct.getPUCH_ODR_QTY(), propLotSize, 0, Calculate._CEIL);
               		  itemLt = Calculate.multiply(itemLt, propLt);
               		  itemLt = Calculate.add(itemLt, fixedLt);
               		  itemLt = Calculate.add(itemLt, safetyLt);
               		  itemLt = Calculate.multiply(itemLt, "-1");
                 	
               		  resultDate = calcWorkDay(struct.getPUCH_ODR_DLV_DATE(), PUCH_ODR_DLV_TIME, itemLt, true);
               		  if ("".equals(resultDate)){
               			  setErrorMessage("AE00198");
               			  return;
               		  }
               		  // 算出した発注予定日 < [日付制御]."業務運用日"の場合は[日付制御]."業務運用日"を｢発注予定日｣とする。
               		  if (DateTool.compareYMD(resultDate.substring(0,10), dcs.getBUSINESS_OPR_DATE()) < 0) {
                             struct.setPUCH_ODR_START_DATE(dcs.getBUSINESS_OPR_DATE());
      	                   //時刻は発注納期の時刻をセット
      		               PUCH_ODR_START_TIME = PUCH_ODR_DLV_TIME;
                         } else {
                             
                       	  //自動計算した結果を発注予定日とする
                             struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
                             PUCH_ODR_START_TIME = resultDate.substring(10);
                         }
                     // ASPROVA連携オプション導入済の場合：時間単位のリードタイム計算を行う。  
               	  }else{
               		  String propLotSize = itemStruct.getPROP_LOT_SIZE();
               		  String sWkDate, sShiftMin,sWkTime ;
    	        	
    					 	ATAspBom ab = new ATAspBom(conn, this.sysPLANT_CD, 
    					 			this.sysUSER_CD, 
    					 			this.getProgramId());
    					 	ATWorkCalendar atWC = new ATWorkCalendar(conn, 
    					 			this.sysUSER_CD , 
    					 			this.getProgramId(), 
    					 			this.sysPLANT_CD) ;
    					 	Date puchOdrStartDate = null;	  // 発注予定日
    					 	Date puchOdrDlvDate = null;	  // 発注納期

    					 	//発注納期が決定の状態
    					 	puchOdrDlvDate = StrngToDt(this.struct.getPUCH_ODR_DLV_DATE() + " " + (PUCH_ODR_DLV_TIME).substring(0,2) + ":" + (PUCH_ODR_DLV_TIME).substring(2,4));
    					 	//■CHG 20081222 発注予定日LTシフト(－)-----------------------------
    					 	//struct.getPUCH_ODR_QTY(), propLotSize				
    					 	sShiftMin = ab.getProdLtMin(struct.getITEM_CD(),struct.getPUCH_ODR_QTY(),propLotSize,"U");
    					 	sShiftMin = Calculate.multiply(sShiftMin,"-1"); //過去へ
    					 	puchOdrStartDate = atWC.calcShiftMinute(puchOdrDlvDate, sShiftMin, ATWorkCalendar.SHIFT_START);	//Conv
    					 	sWkDate =DtGetDate(puchOdrStartDate);
    					 	sWkTime =DtGetTime(puchOdrStartDate);
    					 	this.struct.setPUCH_ODR_START_DATE(sWkDate);
    					 	this.struct.setPUCH_ODR_START_TIME(sWkTime);
    					 	PUCH_ODR_START_TIME = sWkTime;
    					 	_debugMsg = ("(AD0010/EJa-ASP)TIME: "
    					 			+ "PUCH_ODR_DLV_DATE" + "[" + this.struct.getPUCH_ODR_DLV_DATE() + "]," 
    					 			+ "PUCH_ODR_DLV_TIME" + "[" + PUCH_ODR_DLV_TIME + "],"  
    					 			+ "PUCH_ODR_START_DATE" + "[" + this.struct.getPUCH_ODR_START_DATE() + "],"  
    					 			+ "PUCH_ODR_START_TIME" + "[" + struct.getPUCH_ODR_START_TIME() + "], "
    					 			+ "sShiftMin" + "[" + sShiftMin + "] " );
    					 	sysLog.info("ZZ01006",struct.getsUser_ID(), _debugMsg );
    		        
    					 	resultDate = struct.getPUCH_ODR_START_DATE() + " " +  PUCH_ODR_START_TIME;
    					 	
    					 	// 自動計算した結果を発注予定日とする
                           struct.setPUCH_ODR_START_DATE(resultDate.substring(0,10));
                           PUCH_ODR_START_TIME = resultDate.substring(11);
               	  
               	  }
                 }

                 /** 発注予定日（時刻含む）*/
                 struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
				 /** 発注納期（時刻含む）*/
   			     struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + PUCH_ODR_DLV_TIME);
				 /** 取引先回答納期（時刻含む）*/
                 if(struct.getCONFIRM_DLV_DATE() != null && !("".equals(struct.getCONFIRM_DLV_DATE()))){
                 	struct.setCONFIRM_DLV_DATE_ALL(struct.getCONFIRM_DLV_DATE() + " " + CONFIRM_DLV_TIME);
                 }

                 // ｢発注予定日｣ < [所要量]."手配着手日"の場合
                 if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), odStruct.getODR_START_DATE()) < 0) {
  	                   setWarningMessage("AE00016");
  	                   setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
  	                   setWarningParameter("T_OD", "ODR_START_DATE", odStruct.getODR_START_DATE());
  	                   setWarningParameter(
  	                    "T_RLSD_PUCH_ODR",
  	                    "PUCH_ODR_START_DATE",
  	                    struct.getPUCH_ODR_START_DATE());
  	                  }
  	                 
                 // ｢発注予定日｣ = [所要量]."手配着手日"の場合
                 if (DateTool.compareYMD(struct.getPUCH_ODR_START_DATE(), odStruct.getODR_START_DATE()) == 0)
                 {
                     //「発注予定日」の時刻 < [所要量]."手配着手日"の場合
                     if (Double.parseDouble(PUCH_ODR_START_TIME) < Double.parseDouble(odStruct.getODR_START_TIME()))
                     {
                          setWarningMessage("AE00016");
                          setWarningParameter("T_OD", "OD_NO", struct.getOD_NO());
                          setWarningParameter("T_OD", "ODR_START_DATE", odStruct.getODR_START_DATE() + " " + odStruct.getODR_START_TIME());
                          setWarningParameter("T_RLSD_PUCH_ODR","PUCH_ODR_START_DATE",struct.getPUCH_ODR_START_DATE() + " " + PUCH_ODR_START_TIME);
                     }
                 }
	                
	                 
 				//  外作の場合のみ
                 if ( !"1".equals(struct.getOUTSIDE_TYP()) 
						 && ( (struct.getVEND_CD() != null) && (struct.getVEND_CD().length() > 0) ) ) {
	                 if(Calculate.compare(struct.getNET_AMOUNT(), tempNetAmount) != 0){
	                  	//購入単価を読込み、存在すれば単価読込を促すエラー、存在しない(もしくは仮単価かつ単価0)の場合はワーニングとして処理続行         
	                 	//ワーニングとして丸め後の金額を本体金額とし、処理続行         
	                	 //但し、備品発注でかつ、｢品目番号｣がNullの場合はその時点でワーニング(購入単価が存在しないから)
	                      if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
	  	                 	PuchUnitCostStruct pucs;
	 	                 	pucs =
	 	                   PuchUnitCostControl.getDataTax(
		 	                          conn,
		 	                          _myCompanyStruct.getCOMPANY_CD(),
		 	                          struct.getVEND_CD(),
		 	                          struct.getPLANT_CD(),
		 	                          struct.getITEM_CD(),
		 	                          struct.getPUCH_ODR_START_DATE(),
		 	                          struct.getPUCH_ODR_DLV_DATE(),
		 	                          struct.getPUCH_ODR_QTY(),
	 	                 	          _taxCd);
	 	                 	
	 	                 	if("1".equals(pucs.getUNIT_COST_TYP()) &&
	 	                 			"0.00".equals(pucs.getUNIT_COST()) &&
	 	                 			"0.00".equals(pucs.getPROCESSING_COST()) &&
	 	                 			"0.00".equals(pucs.getMATERIAL_COST()) &&
	 	                 			"0.00".equals(pucs.getOTHER_OVERHEADS())){
	 	                 			struct.setNET_AMOUNT(tempNetAmount);
	 							    setWarningMessage("AE00200");                 		
	 	                 	}else{
	 							    setErrorMessage("AE00147");
	 								return;
	 	                 	}
	
	                      }else{
	                    	  	struct.setNET_AMOUNT(tempNetAmount);
	 						    setWarningMessage("AE00200"); 
	                      }
	 				}
                 }
                 // 整数管理品目の場合は発注数を切り上げて再計算
                 // 品目番号がNullの場合は以下の処理を行わない
                 if (!((struct.getITEM_CD() == null || struct.getITEM_CD().length() <= 0))) {
                  // 整数管理品目の場合、発注数を切り上げ
                  if ("1".equals(itemStruct.getUNIT_QTY_TYP())) {
                   String ceilPuchOdrQty = Calculate.ceil(struct.getPUCH_ODR_QTY(), 0);
                   if (Calculate.compare(ceilPuchOdrQty, struct.getPUCH_ODR_QTY()) != 0) {
                    struct.setPUCH_ODR_QTY(ceilPuchOdrQty);
                    setWarningMessage("AE00034");
                    setWarningParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                   }
                  }
                 }
              
                 // DB更新処理          
                 // <<｢内外作区分｣ = 2:外作の場合>>
                 // 通常の発注残更新処理
             
                 // ｢発注金額｣の計算
                 String puchOdrAmount =
                  AmountCalculator.calcPuchOdrAmount(
                   struct.getPUCH_ODR_QTY(),
                   struct.getUNIT_COST(),
                   struct.getROUND_TYP(),
                   struct.getVEND_DECIMAL_FIG());
                 struct.setPUCH_ODR_AMOUNT(puchOdrAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(puchOdrAmount)){
                     // 多言語項目取得セット
                    String ErrInfo = CoreTools.getRBString("Expj.PUCH_ODR_AMOUNT_2", resource);
                	setErrorMessage("AA00215",ErrInfo);
                	 return;
                 }
                 // ｢値引金額｣の計算
                 String discAmount =
                  AmountCalculator.calcDiscAmount(
                   struct.getPUCH_ODR_AMOUNT(),
                   struct.getNET_AMOUNT());
                 struct.setDISC_AMOUNT(discAmount);
                 
               //内税の場合に税額を計算する
          		String lowerTaxCd =
          			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);                
          		if (!lowerTaxCd.equals("1")) {
         			//バッチパラメータ呼出
         			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
         			if(!batList.isEmpty()){
         				//税計算部品をコール
         				AE0190010Struct batStruct = (AE0190010Struct)batList.get(0);
         				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
         				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
         				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
         				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
         				struct.setPVC2USERID(this.sysUSER_CD);
         				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
         				struct.setPVC2PLANTCD(this.sysPLANT_CD);
         				struct.setPVC2TAXID("5");
         				batList = entity.mcallSQLCALCTAXCALCAMTFD.call(conn, struct);
         				batStruct = (AE0190010Struct)batList.get(0);
         				if(!"1".equals(batStruct.getPNUMSTATUS())){
         					setErrorMessage(batStruct.getPVC2ERRCD());
         					return;      				       				
         				}
         				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
         				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
         				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
         				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
         			}else{
         				setErrorMessage("ZZ09007");        				
         			}
              	}else{
	                  // ｢税額1｣の計算
	                  String taxAmount1 =
	                   AmountCalculator.calcTaxAmount(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_RATE_1(),
	                    struct.getTAX_ROUND_TYP(),
	                    struct.getVEND_DECIMAL_FIG());
	                  struct.setTAX_AMOUNT_1(taxAmount1);
	                  // ｢税額2｣の計算
	                  String taxAmount2 =
	                   AmountCalculator.calcTaxAmount(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_RATE_2(),
	                    struct.getTAX_ROUND_TYP(),
	                    struct.getVEND_DECIMAL_FIG());
	                  struct.setTAX_AMOUNT_2(taxAmount2);
	                  // ｢税額3｣の計算
	                  String taxAmount3 =
	                   AmountCalculator.calcTaxAmount(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_RATE_3(),
	                    struct.getTAX_ROUND_TYP(),
	                    struct.getVEND_DECIMAL_FIG());
	                  struct.setTAX_AMOUNT_3(taxAmount3);
	                  // ｢税込金額｣の計算
	                  String amountIncludeTax =
	                   AmountCalculator.calcAmountIncludeTax(
	                    struct.getNET_AMOUNT(),
	                    struct.getTAX_AMOUNT_1(),
	                    struct.getTAX_AMOUNT_2(),
	                    struct.getTAX_AMOUNT_3());
	                  struct.setAMOUNT_INCLUDE_TAX(amountIncludeTax);
	                  if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(amountIncludeTax)){
	                      // 多言語項目取得セット
	                     String ErrInfo = CoreTools.getRBString("Expj.AMOUNT_INCLUDE_TAX", resource);
	                	 setErrorMessage("AA00215",ErrInfo);
	                	 return;
	                  }
              	}

                 // ｢邦貨金額｣の計算
                 String homeCurAmount =
                  AmountCalculator.calcHomeCurAmount(
                   struct.getAMOUNT_INCLUDE_TAX(),
                   struct.getEXCH_RATE(),
                   struct.getROUND_TYP(),
                   _homeCurStruct.getDECIMAL_FIG());
                 struct.setHOME_CUR_AMOUNT(homeCurAmount);
                 if(!com.nec.jp.orteus.expj.util.Calculate.isNotInNumRange(homeCurAmount)){
                     // 多言語項目取得セット
                    String ErrInfo = CoreTools.getRBString("Expj.HOME_CUR_AMOUNT", resource);
               	 setErrorMessage("AA00215",ErrInfo);
               	 return;
                 }
                 // 画面外の必要なデータを設定
                  //備品発注品目名
                  struct.setITEM_NAME(null);
                  //備品発注製品区分
                  struct.setPRODUCT_TYP("0"); 
                  //備品発注フラグ
                  struct.setNON_NO_ITEM_FLG("0");
             
                 // データ更新処理
                 entity.mT_RLSD_PUCH_ODR.update(conn, struct);
             
                 // [所要量]の更新を行う。
                 
              	  // ASPROVA連携オプション未導入の場合：日単位のリードタイム計算を行う。
              	  if(!"1".equals(_SysInstallOptions_ASP)){	
              		  
              		  CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
              		  od.changeOdInfo(struct.getOD_NO(), -1);
                    
              	  // ASPROVA連携オプション導入済の場合：時間単位のリードタイム計算を行う。
              	  }else{
              		  
              		  ATCommonOd od = new ATCommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
              		  od.changeOdInfo(struct.getOD_NO(), -1,new Integer(this.struct.getOUTSIDE_TYP()).intValue());
              	  }
                 // 更新後データ再表示
                 controlSelect();
                 
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } catch (ParseException e) {
                 throw new ExpjException(e);
                } catch (ApsComException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
                try {
                	
                  //指示済みの場合でも取引先回答納期、取引先回答納期備考は修正可能              

                 // ｢工場コード｣+｢発注番号｣が、[発注残]に存在しないとき
                 List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  return;
                 }
                 
                 AE0190010Struct lockedStruct = (AE0190010Struct) lockedList.get(0);
                 // [発注残]."発注状態区分" = 2:指示済の場合
                 if (!"1".equals(lockedStruct.getPUCH_ODR_STS_TYP())) {
               	     setErrorMessage("AE32610");
                     setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
                     return;
                 }
                 // [発注残]."更新数"≠セーブ更新数(hidden使用)の場合
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
              
                 // エラーがあった場合は処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // [発注残]の削除
                 entity.mT_RLSD_PUCH_ODR.delete(conn, struct);
              
                 // [所要量]の更新 【共通　所要量更新処理を参照】　※共通部品を使用する
                  CommonOd od = new CommonOd(conn, struct.getPLANT_CD(), sysUSER_CD, sp.getProcId());
                  od.changeOdInfo(struct.getOD_NO(), -1);

              
                 // 画面を初期化
                 controlClear();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ApsComException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
				try{
					readStatus = INITIAL;
	                // 画面を初期化
	                initializeAll();
					// システムパラメータ（TIME_CTRL）取得
					AE0190010Struct TIME_CTRLStruct = new AE0190010Struct();
					List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
					if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
						TIME_CTRLStruct = (AE0190010Struct)TIME_CTRLList.get(0);
						struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
					}else{
						struct.setTIME_CTRL(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// エラー処理を記述してください。
					// 
				}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // [自社]情報を部品より取得			
                 _myCompanyStruct = MyCompanyControl.getData(conn);
                 // [税名]情報を部品より取得			
                 _taxNameStruct = TaxNameControl.getData(conn);
                 // [邦貨]情報を部品より取得			
                 _homeCurStruct = HomeCurControl.getData(conn);
                 // コンボボックスデータを部品より取得
                 ComboBox cdac = new ComboBox(conn, sysUSER_CD);
                 _splItemTypStruct = cdac.getData("SPL_ITEM_TYP");
                 _unitCostTypStruct = cdac.getData("UNIT_COST_TYP");
                 cdac.setConnection(null);
              
                 // 画面を初期化
                 initializeAll();
              
				 // システムパラメータ（TIME_CTRL）取得
				 AE0190010Struct TIME_CTRLStruct = new AE0190010Struct();
				 List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				 if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
			 		TIME_CTRLStruct = (AE0190010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
				 }else{
					struct.setTIME_CTRL(null);
				 }
				 
				 
				 // ASPROVA連携オプションインストールフラグの取得
				 List InstallOptionList_ASP = entity.mSYS_INSTALL_OPTIONS_ASP.read(conn, struct);
				 if (InstallOptionList_ASP.isEmpty()) {
				  	 struct.setASP_INSTALL_FLG(null);			
				 }else{
					 struct.setASP_INSTALL_FLG(((AE0190010Struct)InstallOptionList_ASP.get(0)).getASP_INSTALL_FLG());
				 }
				 
				 _SysInstallOptions_ASP = struct.getASP_INSTALL_FLG();
				 
				 // JFインストールフラグの取得
				 List InstallOptionList_JF = entity.mSYS_INSTALL_OPTIONS_JF.read(conn, struct);
				 if (InstallOptionList_JF.isEmpty()) {
				  	 struct.setJF_INSTALL_FLG(null);			
				 }else{
					 struct.setJF_INSTALL_FLG(((AE0190010Struct)InstallOptionList_JF.get(0)).getJF_INSTALL_FLG());
				 }
				 
				 _SysInstallOptions_JF = struct.getJF_INSTALL_FLG();
				 
                 // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す
                 if (isScreenMove() == true) {
                  // キーとなる項目をstructに格納して、検索のコントロールメソッドを呼び出します。
                  struct.setPLANT_CD(_plantCd);
                  struct.setPUCH_ODR_CD(_puchOdrCd);
                  controlSelect();
                 }
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0190");
		logger.entering("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                // ダウンロードファイル名クリア
                // PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで｢DOWNLOAD_FILE｣を定義し、次の行のコメントを外してください。
                //			struct.setDOWNLOAD_FILE((String)null);
                // コンボボックス部品のデータのセットはここに記述してください。
                // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 // TODO: ユーザ定義のコードを記述してください
                 // リストボックス部品のデータのセットはここに記述してください。
                 struct.setCOMPANY_CD(_myCompanyStruct.getCOMPANY_CD());
              
                 struct.setHOME_CUR_UNIT(_homeCurStruct.getCUR_UNIT());
                 struct.setHOME_DECIMAL_FIG(_homeCurStruct.getDECIMAL_FIG());
              
                 struct.setList_SPL_ITEM_TYP_val(_splItemTypStruct.getValList());
                 struct.setList_SPL_ITEM_TYP_name(_splItemTypStruct.getExplanList());
                 struct.setList_UNIT_COST_TYP_val(_unitCostTypStruct.getValList());
                 struct.setList_UNIT_COST_TYP_name(_unitCostTypStruct.getExplanList());
              
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0190010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0190010-E999","CSVの出力処理"));
			throw new FoundationException("AE0190010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0190010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0190010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0190010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0190010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0190010Entity entity;
	protected AE0190010Struct struct;
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

		entity = new AE0190010Entity();
		struct = new AE0190010Struct();

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
	 * AE0190010クラスの標準コンストラクタ
	 */
	public AE0190010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                // TODO: ここに初期処理を記述してください
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
				AE0190010Struct key = (AE0190010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_QTY") && key.geth_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_QTY", key.geth_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name") && key.getSPL_ITEM_TYP_name() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_name", key.getSPL_ITEM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val") && key.getSPL_ITEM_TYP_val() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_val", key.getSPL_ITEM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP") && key.geth_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("h_SPL_ITEM_TYP", key.geth_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SelectUnitCostFlag") && key.getSelectUnitCostFlag() != null) {
					msgKey.setKeyValue("SelectUnitCostFlag", key.getSelectUnitCostFlag());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR") && key.getc_JOB_ODR() != null) {
					msgKey.setKeyValue("c_JOB_ODR", key.getc_JOB_ODR());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ALC_GRP_CD") && key.geth_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("h_ALC_GRP_CD", key.geth_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE") && key.getCONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE", key.getCONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_TIME") && key.getCONFIRM_DLV_TIME() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_TIME", key.getCONFIRM_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT") && key.getVEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("VEND_CUR_UNIT", key.getVEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT") && key.getPUCH_ODR_COMMENT() != null) {
					msgKey.setKeyValue("PUCH_ODR_COMMENT", key.getPUCH_ODR_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_MAINT_FLG") && key.getPUCH_MAINT_FLG() != null) {
					msgKey.setKeyValue("PUCH_MAINT_FLG", key.getPUCH_MAINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_COMMENT") && key.getCONFIRM_DLV_DATE_COMMENT() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE_COMMENT", key.getCONFIRM_DLV_DATE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL") && key.getPUCH_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_ALL", key.getPUCH_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL") && key.getPUCH_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_ALL", key.getPUCH_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_ALL") && key.getCONFIRM_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("CONFIRM_DLV_DATE_ALL", key.getCONFIRM_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_LT") && key.getODR_LT() != null) {
					msgKey.setKeyValue("ODR_LT", key.getODR_LT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
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
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("DEAL_STS_FLG") && key.getDEAL_STS_FLG() != null) {
					msgKey.setKeyValue("DEAL_STS_FLG", key.getDEAL_STS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_TIME") && key.getODR_START_TIME() != null) {
					msgKey.setKeyValue("ODR_START_TIME", key.getODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_INPUT_FLG") && key.geth_JOB_ODR_INPUT_FLG() != null) {
					msgKey.setKeyValue("h_JOB_ODR_INPUT_FLG", key.geth_JOB_ODR_INPUT_FLG());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("PVC2TAXID") && key.getPVC2TAXID() != null) {
					msgKey.setKeyValue("PVC2TAXID", key.getPVC2TAXID());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT") && key.getPNUMTAXOUTAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXOUTAMOUNT", key.getPNUMTAXOUTAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT") && key.getPNUMTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXAMOUNT", key.getPNUMTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT") && key.getPNUMEXTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXSALESAMOUNT", key.getPNUMEXTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT") && key.getPNUMINTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXSALESAMOUNT", key.getPNUMINTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT") && key.getPNUMTAXFREESALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXFREESALESAMOUNT", key.getPNUMTAXFREESALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT") && key.getPNUMEXTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXAMOUNT", key.getPNUMEXTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT") && key.getPNUMINTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXAMOUNT", key.getPNUMINTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PVC2ERRCD") && key.getPVC2ERRCD() != null) {
					msgKey.setKeyValue("PVC2ERRCD", key.getPVC2ERRCD());
				}
				if(msgKeyType.containsKeyColumn("PNUMSTATUS") && key.getPNUMSTATUS() != null) {
					msgKey.setKeyValue("PNUMSTATUS", key.getPNUMSTATUS());
				}
				if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG") && key.getASP_INSTALL_FLG() != null) {
					msgKey.setKeyValue("ASP_INSTALL_FLG", key.getASP_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("JF_INSTALL_FLG") && key.getJF_INSTALL_FLG() != null) {
					msgKey.setKeyValue("JF_INSTALL_FLG", key.getJF_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
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
					AE0190010Struct key = new AE0190010Struct();
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_QTY")) {
						key.seth_PUCH_ODR_QTY(msgKey.getKeyValue("h_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name")) {
						key.setSPL_ITEM_TYP_name(msgKey.getKeyValue("SPL_ITEM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val")) {
						key.setSPL_ITEM_TYP_val(msgKey.getKeyValue("SPL_ITEM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP")) {
						key.seth_SPL_ITEM_TYP(msgKey.getKeyValue("h_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SelectUnitCostFlag")) {
						key.setSelectUnitCostFlag(msgKey.getKeyValue("SelectUnitCostFlag"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR")) {
						key.setc_JOB_ODR(msgKey.getKeyValue("c_JOB_ODR"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ALC_GRP_CD")) {
						key.seth_ALC_GRP_CD(msgKey.getKeyValue("h_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE")) {
						key.setCONFIRM_DLV_DATE(msgKey.getKeyValue("CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_TIME")) {
						key.setCONFIRM_DLV_TIME(msgKey.getKeyValue("CONFIRM_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CUR_UNIT")) {
						key.setVEND_CUR_UNIT(msgKey.getKeyValue("VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_COMMENT")) {
						key.setPUCH_ODR_COMMENT(msgKey.getKeyValue("PUCH_ODR_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_MAINT_FLG")) {
						key.setPUCH_MAINT_FLG(msgKey.getKeyValue("PUCH_MAINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_COMMENT")) {
						key.setCONFIRM_DLV_DATE_COMMENT(msgKey.getKeyValue("CONFIRM_DLV_DATE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL")) {
						key.setPUCH_ODR_START_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL")) {
						key.setPUCH_ODR_DLV_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("CONFIRM_DLV_DATE_ALL")) {
						key.setCONFIRM_DLV_DATE_ALL(msgKey.getKeyValue("CONFIRM_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_LT")) {
						key.setODR_LT(msgKey.getKeyValue("ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
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
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("DEAL_STS_FLG")) {
						key.setDEAL_STS_FLG(msgKey.getKeyValue("DEAL_STS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_TIME")) {
						key.setODR_START_TIME(msgKey.getKeyValue("ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_INPUT_FLG")) {
						key.seth_JOB_ODR_INPUT_FLG(msgKey.getKeyValue("h_JOB_ODR_INPUT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2TAXID")) {
						key.setPVC2TAXID(msgKey.getKeyValue("PVC2TAXID"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT")) {
						key.setPNUMTAXOUTAMOUNT(msgKey.getKeyValue("PNUMTAXOUTAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT")) {
						key.setPNUMTAXAMOUNT(msgKey.getKeyValue("PNUMTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT")) {
						key.setPNUMEXTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT")) {
						key.setPNUMINTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT")) {
						key.setPNUMTAXFREESALESAMOUNT(msgKey.getKeyValue("PNUMTAXFREESALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT")) {
						key.setPNUMEXTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT")) {
						key.setPNUMINTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PVC2ERRCD")) {
						key.setPVC2ERRCD(msgKey.getKeyValue("PVC2ERRCD"));
					}
					if(msgKeyType.containsKeyColumn("PNUMSTATUS")) {
						key.setPNUMSTATUS(msgKey.getKeyValue("PNUMSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("ASP_INSTALL_FLG")) {
						key.setASP_INSTALL_FLG(msgKey.getKeyValue("ASP_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("JF_INSTALL_FLG")) {
						key.setJF_INSTALL_FLG(msgKey.getKeyValue("JF_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
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
