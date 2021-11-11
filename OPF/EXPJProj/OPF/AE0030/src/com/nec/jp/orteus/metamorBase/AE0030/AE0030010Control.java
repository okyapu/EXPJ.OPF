/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0030;

import com.nec.jp.orteus.metamorBase.AE0030.*;
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
import com.nec.jp.orteus.metamorBase.common04.IssueInstruct.SubcontractIssueInstruct;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.amount.CurControl;
import com.nec.jp.orteus.metamorBase.common04.amount.CurStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import java.io.IOException;

//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0030010Control
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
        protected List list;											// 一覧部分の結果リストを画面に表示するためのリストインスタンス
       
        // デフォルトアクセサメソッド
        public List getList() { return this.list; }						// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public AE0030010Struct getListvalue(int x) { return (AE0030010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AE0030010Struct getStruct() { return this.struct; }	// Structを返します。
        public AE0030010Struct createStruct() { return new AE0030010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AE0030010Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        /** システム邦貨Struct */	
        private HomeCurStruct homeCur = null;

        
        // ----- システム設定値取得 ---------------	
    	private PrivateConfig privateConfig;
        // ----- システム設定値取得 ---------------		
    	    	
    	/** 発注指示権限 */
    	String aprPurInst = "";	
    	/** ユーザの承認権限 */
    	String hApprPowerTyp = "";	
       
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
         * クライアント上のマスク項目の値をクリアします。
         */
        private void clearDisabledField() {
         if ("true".equals(struct.getr1_FILTER1())) {
          struct.setPUCH_ODR_DLV_DATE(null);
         } else {
          struct.setPUCH_ODR_START_DATE(null);
         }
         if ("true".equals(struct.getr1_FILTER2())) {
          struct.setJOB_ODR_CD(null);
         } else {
          struct.setPUCH_ODR_CD(null);
         }
        }
        
        /**
         * 行更新を行います。
         * レート判定日がNullの場合は、為替レート、邦貨金額を更新します。
         * @param s 対象のStruct
         * @throws SQLException DB例外が発生した場合
         * @throws UnsupportedOperationException 処理がサポートされていない場合
         */
        private void lineUpdate(AE0030010Struct s) throws FoundationException, SQLException {
       
         if (s.getRATE_JUDGE_DATE() == null) {
          try {
           CurStruct cur = CurControl.getData(conn, s.getCOMPANY_CD(), s.getVEND_CD());
           ExchRateStruct exch =
            ExchRateControl.getData(
             conn,
             s.getCOMPANY_CD(),
             cur.getCUR_CD(),
             cur.getEXCH_TYP(),
             null,
             s.getPUCH_ODR_DLV_DATE());
           String homeAmount =
            AmountCalculator.calcHomeCurAmount(
             s.getAMOUNT_INCLUDE_TAX(),
             exch.getEXCH_RATE(),
             cur.getROUND_TYP(),
             homeCur.getDECIMAL_FIG());
       
           s.setRATE_JUDGE_DATE(s.getPUCH_ODR_DLV_DATE());
           s.setEXCH_RATE(exch.getEXCH_RATE());
           s.setHOME_CUR_AMOUNT(homeAmount);
          } catch (DataNotFoundException e) {
           String code = e.getCode();
           if ("ZZ02021".equals(code)) {
            setWarningMessage("AE02004", s.getPUCH_ODR_CD());
           } else if ("ZZ02022".equals(code)) {
            setWarningMessage("AE02005", s.getPUCH_ODR_CD());
           } else if ("ZZ02023".equals(code)) {
            setWarningMessage("AE02006", s.getPUCH_ODR_CD());
           } else if ("ZZ02024".equals(code)) {
            setWarningMessage("AE02007", s.getPUCH_ODR_CD());
           } else {
            throw new UnsupportedOperationException(e.getMessage());
           }
          }
         }
         s.setsUser_ID(struct.getsUser_ID());
         s.setsSysdate(struct.getsSysdate());
         s.setsOraganization_CD(struct.getsOrganization_CD());
       
         // データ更新処理
         entity.mT_RLSD_PUCH_ODR.update(conn, s);		
       
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        public void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setPUCH_ODR_START_DATE(null);
         struct.setPUCH_ODR_DLV_DATE(null);
         struct.setPUCH_ODR_CD(null);
         struct.setJOB_ODR_CD(null);
         struct.setVEND_CD(null);
         struct.setPUCH_ODR_PERSON(null);
         struct.setr1_FILTER1("true");
         struct.setr2_FILTER1(null);
         struct.setr1_FILTER2("true");
         struct.setr2_FILTER2(null);
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        public void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setVEND_NAME(null);
         struct.setUSER_NAME(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
       
	/** 時刻管理用フラグ */
	private String _flgTimeCtrl = null;

	/**
	 * 検索条件の設定
	 */
	private void setSearchCondition() {
		
		// データ引数クリア
		struct.setPUCH_ODR_START_DATE_ALL(null);
		struct.setPUCH_ODR_DLV_DATE_ALL(null);

		// 抽出条件（日付の設定）
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
	        if (struct.getPUCH_ODR_START_DATE() != null && !struct.getPUCH_ODR_START_DATE().equals("")) {
				//発注予定日の時刻が00:00以外の場合⇒そのまま検索
	            if (struct.getPUCH_ODR_START_TIME() != null && !struct.getPUCH_ODR_START_TIME().equals("")) {
	     			// 発注予定日(時刻)のチェック
	     			if((struct.getPUCH_ODR_START_TIME()).length() == 3 ){
	     				//３桁は頭に０を付ける
	     				struct.setPUCH_ODR_START_TIME("0" + struct.getPUCH_ODR_START_TIME());
	     			}
			        /** 発注予定日（時刻含む）*/
					struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " " + 
									struct.getPUCH_ODR_START_TIME().substring(0,2) + ":" + 
									struct.getPUCH_ODR_START_TIME().substring(2));
				//発注予定日の時刻が未入力の場合⇒23:59で検索
				}else{
					/** 発注予定日（時刻含む）*/
					struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " 23:59");
				}
			}
	        if (struct.getPUCH_ODR_DLV_DATE() != null && !struct.getPUCH_ODR_DLV_DATE().equals("")) {
				//発注納期の時刻が00:00以外の場合⇒そのまま検索
	            if (struct.getPUCH_ODR_DLV_TIME() != null && !struct.getPUCH_ODR_DLV_TIME().equals("")) {
	    			// 発注納期(時刻)のチェック
	    			if((struct.getPUCH_ODR_DLV_TIME()).length() == 3 ){
	    				//３桁は頭に０を付ける
	    				struct.setPUCH_ODR_DLV_TIME("0" + struct.getPUCH_ODR_DLV_TIME());
	    			}
					/** 発注納期（時刻含む）*/
					struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " " + 
									struct.getPUCH_ODR_DLV_TIME().substring(0,2) + ":" + 
									struct.getPUCH_ODR_DLV_TIME().substring(2));
				//発注納期の時刻が未入力の場合⇒23:59で検索
				}else{
					/** 発注納期（時刻含む）*/
					struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " 23:59");
				}
			}
		}else{			
	        if (struct.getPUCH_ODR_START_DATE() != null && !struct.getPUCH_ODR_START_DATE().equals("")) {
	                	/** 発注予定日（時刻含む）*/
				struct.setPUCH_ODR_START_DATE_ALL(struct.getPUCH_ODR_START_DATE() + " 23:59");
			}
	        if (struct.getPUCH_ODR_DLV_DATE() != null && !struct.getPUCH_ODR_DLV_DATE().equals("")) {
	                	/** 発注納期（時刻含む）*/
				struct.setPUCH_ODR_DLV_DATE_ALL(struct.getPUCH_ODR_DLV_DATE() + " 23:59");
			}
		}
	}

		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // マスク項目の値をクリア
                 clearDisabledField();
                 
                 // 詳細項目をクリア
                 initializeDetail();
              
                 // 変数定義
                 AE0030010Struct aStruct = null;

                 // 工場名を検索し、存在しない場合はエラー
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  AE0030010Struct plantStruct = (AE0030010Struct) plantList.get(0);
                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
                 // 取引先名を検索し、存在しない場合はエラー
                 if (struct.getVEND_CD() != null 
                  && !struct.getVEND_CD().equals("")) {
                  List vandList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (vandList.isEmpty()) {
                   setErrorMessage("AE20030");
                   setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
                  } else {
                   AE0030010Struct vendStruct = (AE0030010Struct) vandList.get(0);
                   struct.setVEND_NAME(vendStruct.getVEND_NAME());
                  }
                 }
                 // 発注担当者名を検索し、存在しない場合はエラー
                 if (struct.getPUCH_ODR_PERSON() != null
                  && !struct.getPUCH_ODR_PERSON().equals("")) {
                  List userList = entity.mUSER_MST.read(conn, struct);
                  if (userList.isEmpty()) {
                   setErrorMessage("AE00005");
                   setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                  } else {
                   AE0030010Struct userStruct = (AE0030010Struct) userList.get(0);
                   struct.setUSER_NAME(userStruct.getUSER_NAME());
                  }
                 }

      	        //ログインユーザの承認権限
                 if("1".equals(struct.geth_APR_PUR_INST()) && "0".equals(struct.geth_APPR_POWER_TYP())){
                	 setWarningMessage("AE00172");
                 }
              
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  return;
                 }
                
         // 検索条件の設定
		 setSearchCondition();

		 // JFインストールフラグの取得
		 List InstallOptionList_JF = entity.mSYS_INSTALL_OPTIONS_JF.read(conn, struct);
		 if (InstallOptionList_JF.isEmpty()) {
		  	 struct.setDIRECT_FLG(null);			
		 }else{
			 struct.setDIRECT_FLG("0");
		 }
			// 表示最大行数
			int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0)
				struct.setROW_COUNT(String.valueOf(maxLine));
			else
				struct.setROW_COUNT(null);
			// リストデータの検索
			List viewList = entity.mViewCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0030010Struct) viewList.get(0))
					.getl_COUNT());

			// 対象件数=0件の場合エラー
			if (rowCount == 0) {
				setErrorMessage("ZZ06001");
				setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_START_DATE",struct.getPUCH_ODR_START_DATE());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_DLV_DATE",struct.getPUCH_ODR_DLV_DATE());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
				setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_PERSON", struct.getPUCH_ODR_PERSON());
				readStatus = NOT_FOUND;
				if(list !=null &&list.size()>0){
					list.clear();
				}
				return;
			}
             // 表示最大行数制限処理
           if ((maxLine != 0) && (rowCount == maxLine+1)) {
              setErrorMessage("ZZ01115", String.valueOf(maxLine));
              readStatus = TOO_MANY;
              if(list !=null &&list.size()>0){
			      list.clear();
		      }
              return;
		    } else {
				 // リストデータの検索
	              viewList = entity.mView.read(conn, struct);
	              // リストデータを設定
	              setList(viewList);
				  for (int i = 0; i < list.size(); i++) {
						aStruct = (AE0030010Struct)list.get(i);
				  }
            }
            readStatus = NORMAL;
                 
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 一括更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
              
                try {
                 // マスク項目の値をクリア
                 clearDisabledField();
                 
                 // 詳細項目をクリア
                 initializeDetail();
              
                 // 工場名を検索し、存在しない場合はエラー
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  AE0030010Struct plantStruct = (AE0030010Struct) plantList.get(0);
                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
                 // 取引先名を検索し、存在しない場合はエラー
                 if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
                  List vandList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (vandList.isEmpty()) {
                   setErrorMessage("AE20030");
                   setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
                  } else {
                   AE0030010Struct vendStruct = (AE0030010Struct) vandList.get(0);
                   struct.setVEND_NAME(vendStruct.getVEND_NAME());
                  }
                 }
                 // 発注担当者名を検索し、存在しない場合はエラー
                 if (struct.getPUCH_ODR_PERSON() != null
                  && !struct.getPUCH_ODR_PERSON().equals("")) {
                  List userList = entity.mUSER_MST.read(conn, struct);
                  if (userList.isEmpty()) {
                   setErrorMessage("AE00005");
                   setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                  } else {
                   AE0030010Struct userStruct = (AE0030010Struct) userList.get(0);
                   struct.setUSER_NAME(userStruct.getUSER_NAME());
                  }
                 }
              
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  return;
                 }
                 
                 // 検索条件の設定
        		 setSearchCondition();
        		 
                 ResourceBundle bundle = SystemConfig.getBundle();
                 String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
                 if (javaPath == null) {
                  setErrorMessage("ZZ09010");
                 }
                 String classPath = SystemConfig.getProperty("CLASS_PATH", bundle);
                 if (classPath == null) {
                  setErrorMessage("ZZ09011");
                 }
                 String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
                 if (batchPath == null) {
                  setErrorMessage("ZZ09012");
                 }
              
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  setErrorMessage("ZZ09014");
                  return;
                 }
              
//                 StringBuffer cmd = new StringBuffer();
//                 // JVM
//                 cmd.append(javaPath);
//                 // ClassPath
//                 cmd.append(" -cp ");
//                 cmd.append(classPath);
//                 // 起動設定
//                 cmd.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
//                 cmd.append(batchPath); // D:/OrteusStudio/lib/logging.properties";
//                 // 呼び出し先クラス
//                 cmd.append(" com.nec.jp.orteus.metamorBase.AE0030.AE0030B001.mainAE0030B001");
//                 // パラメータ１ 業務名
//                 cmd.append(" \"AE0030B001\"");
//                 // パラメータ２ ユーザＩＤ
//                 cmd.append(" \"").append(sysUSER_CD).append('\"');
//                 // パラメータ３ 工場コード
//                 cmd.append(" \"");
//                 if (struct.getPLANT_CD() != null) {
//                  cmd.append(struct.getPLANT_CD());
//                 }
//                 cmd.append('\"');
//                 // パラメータ４ 発注予定日
//                 cmd.append(" \"");
//                 if (struct.getPUCH_ODR_START_DATE() != null) {
//                 	cmd.append(struct.getPUCH_ODR_START_DATE_ALL());
//                 }
//                 cmd.append('\"');
//                 // パラメータ５ 発注納期
//                 cmd.append(" \"");
//                 if (struct.getPUCH_ODR_DLV_DATE() != null) {
//                  cmd.append(struct.getPUCH_ODR_DLV_DATE_ALL());
//                 }	
//                 cmd.append('\"');
//                 // パラメータ６ 発注番号
//                 cmd.append(" \"");
//                 if (struct.getPUCH_ODR_CD() != null) {
//                  cmd.append(struct.getPUCH_ODR_CD());
//                 }
//                 cmd.append('\"');
//                 // パラメータ７ 取引先コード
//                 cmd.append(" \"");
//                 if (struct.getVEND_CD() != null) {
//                  cmd.append(struct.getVEND_CD());
//                 }
//                 cmd.append('\"');
//                 // パラメータ８ 発注担当者
//                 cmd.append(" \"");
//                 if (struct.getPUCH_ODR_PERSON() != null) {
//                  cmd.append(struct.getPUCH_ODR_PERSON());
//                 }
//                 cmd.append('\"');
//                 // パラメータ９ 製番
//                 cmd.append(" \"");
//                 if (struct.getJOB_ODR_CD() != null) {
//                  cmd.append(struct.getJOB_ODR_CD());
//                 }
//                 cmd.append('\"');
//                 // パラメータ10 発注指示権限
//                 cmd.append(" \"");
//                 if (struct.geth_APR_PUR_INST() != null) {
//                  cmd.append(struct.geth_APR_PUR_INST());
//                 }
//                 cmd.append('\"');
//                 // パラメータ11 ユーザ承認権限
//                 cmd.append(" \"");
//                 if (struct.geth_APPR_POWER_TYP() != null) {
//                  cmd.append(struct.geth_APPR_POWER_TYP());
//                 }
//                 cmd.append('\"');
//              
//                 // バッチコマンドを実行
//                 Runtime runtime = Runtime.getRuntime();
//                 
//                 Process p = runtime.exec(cmd.toString());
                	
                 List buffer = new ArrayList();
                 buffer.add(javaPath);            // ＪＶＭ
                 buffer.add("-cp");
                 buffer.add(classPath);           // Java ClassPath
                 buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
                 buffer.add("com.nec.jp.orteus.metamorBase.AE0030.AE0030B001.mainAE0030B001");                       // 呼び出し先クラス
                 buffer.add("AE0030B001");                            // パラメータ１ 業務名
                 buffer.add(sysUSER_CD);                               // パラメータ２ ユーザＩＤ
                 // パラメータ３ 工場コード
                 if (struct.getPLANT_CD() != null && !"".equals(struct.getPLANT_CD())) {
                     buffer.add(struct.getPLANT_CD());
                 } else {
                     buffer.add("\"\"");
                 }
                 // パラメータ４ 発注予定日
                 if (struct.getPUCH_ODR_START_DATE() != null && !"".equals(struct.getPUCH_ODR_START_DATE())) {
                     buffer.add(struct.getPUCH_ODR_START_DATE_ALL());
                 } else {
                     buffer.add("\"\"");
                    }
                 // パラメータ５ 発注納期
                 if (struct.getPUCH_ODR_DLV_DATE() != null && !"".equals(struct.getPUCH_ODR_DLV_DATE())) {
                     buffer.add(struct.getPUCH_ODR_DLV_DATE_ALL());
                 } else {
                     buffer.add("\"\"");
                    }
                 // パラメータ６ 発注番号
                 if (struct.getPUCH_ODR_CD() != null && !"".equals(struct.getPUCH_ODR_CD())) {
                     buffer.add(struct.getPUCH_ODR_CD());
                 } else {
                     buffer.add("\"\"");
                    }
                 // パラメータ７ 取引先コード
                 if (struct.getVEND_CD() != null && !"".equals(struct.getVEND_CD())) {
                     buffer.add(struct.getVEND_CD());
                 } else {
                     buffer.add("\"\"");
                    }
                 // パラメータ８ 発注担当者
                 if (struct.getPUCH_ODR_PERSON() != null && !"".equals(struct.getPUCH_ODR_PERSON())) {
                     buffer.add(struct.getPUCH_ODR_PERSON());
                 } else {
                     buffer.add("\"\"");
                    }
                 // パラメータ９ 製番
                 if (struct.getJOB_ODR_CD() != null && !"".equals(struct.getJOB_ODR_CD())) {
                     buffer.add(struct.getJOB_ODR_CD());
                 } else {
                     buffer.add("\"\"");
                    }
                 // パラメータ10 発注指示権限
                 if (struct.geth_APR_PUR_INST() != null && !"".equals(struct.geth_APR_PUR_INST())) {
                     buffer.add(struct.geth_APR_PUR_INST());
                 } else {
                     buffer.add("\"\"");
                    }
                 // パラメータ11 ユーザ承認権限
                 if (struct.geth_APPR_POWER_TYP() != null && !"".equals(struct.geth_APPR_POWER_TYP())) {
                     buffer.add(struct.geth_APPR_POWER_TYP());
                 } else {
                     buffer.add("\"\"");
                    }
                 // バッチコマンドを実行
                 Runtime runtime = Runtime.getRuntime();
                 runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
                 // 完了メッセージ（呼び出し成功）設定
                 setInformationMessage("ZZ09013");
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (IOException e) {
                 throw new ExpjException(e);
                } 
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}

	/**
	 * 選択更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
              
                 // 業務日付が存在しない場合はエラー
                 List sysDateList = entity.mSYS_DATE_CTRL.read(conn, struct);
                 if (sysDateList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("SYS_DATE_CTRL", "BUSINESS_OPR_DATE", struct.getBUSINESS_OPR_DATE());
                  return;
                 }
                 AE0030010Struct sysDateStruct = (AE0030010Struct) sysDateList.get(0);
                 String businessOprDate = (sysDateStruct).getBUSINESS_OPR_DATE();
              
                 SubcontractIssueInstruct sii =
                  new SubcontractIssueInstruct(conn, sp.getProcId(), sysUSER_CD);
              
                 // 選択列の取得
                 List selectedList = struct.getList_l_PUCH_ODR_CD();
              
                 for (int i = 0; i < selectedList.size(); i++) {
                  // 選択された行の発注番号を設定
                  struct.setl_PUCH_ODR_CD((String) selectedList.get(i));
                  
                  conn.beginTransWeb();
                  
                  // 選択行の再検索
                  List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, struct);
                  // 更新するキーが存在しない場合はエラー。
                  if (lockedList.isEmpty()) {
                   setErrorMessage("ZZ01105");
                   return;
                  } 
                  // 読み込み時の"更新数"と異なる場合はエラー
                  AE0030010Struct lockedStruct = (AE0030010Struct) lockedList.get(0);
                  if (!lockedStruct.getMODIFY_COUNT().equals(struct.getList_l_MODIFY_COUNT().get(i))) {
                   setErrorMessage("ZZ01105");
                   return;
                  }
                        
                  // 選択された行の詳細を検索				
                  List puchOdrList = entity.mT_RLSD_PUCH_ODR.read(conn, struct);
                  AE0030010Struct puchOdrStruct = (AE0030010Struct) puchOdrList.get(0);
                  puchOdrStruct.setPUCH_ODR_INST_DATE(businessOprDate);
                  
                  // 行更新処理
                  lineUpdate(puchOdrStruct);
                  
                  //[発注残]の確定実行更新(システムパラメータ発注指示権限が1：承認者、かつ  ログインユーザの“承認権限”が1:承認者　の場合)
                  if("1".equals(struct.geth_APPR_POWER_TYP()) && "1".equals(struct.geth_APR_PUR_INST())){
                	  puchOdrStruct.setAPPR_ID(this.getsysUSER_CD());
                	  puchOdrStruct.setBUSINESS_OPR_DATE(businessOprDate);
                	  entity.mT_RLSD_PUCH_ODR_appr.update(conn,puchOdrStruct);
                  }
                  
                  try {
                      // "在庫管理フラグ"が=１の場合は、出庫指示処理(外作)を行う。
                      sii.addIssueInstruct(
                       puchOdrStruct.getPUCH_ODR_CD(),
                       puchOdrStruct.getOD_NO(),
                       puchOdrStruct.getPUCH_ODR_QTY(),
                       puchOdrStruct.getITEM_CD(),
                       puchOdrStruct.getPUCH_ODR_START_DATE_ALL(),
                       puchOdrStruct.getPLANT_CD(),
                       puchOdrStruct.getCOMPANY_CD(),
                       puchOdrStruct.getVEND_CD());
                       
                       conn.commit();
                       
                  } catch (DataNotFoundException dnfe) {
                     conn.rollback();
                     String code = dnfe.getCode();
                     if ("ZZ06001".equals(code)) {
                         // パラメータが設定されていない
                         setErrorMessage("AE00127");
                     } else if ("ZZ11006".equals(code)) {
                         // 取引先コードで検索した保管区が存在しない
                         setErrorMessage("AE00125", puchOdrStruct.getPUCH_ODR_CD());
                     }
                  }
                 }
                 // 再読込
                 controlSelect();
                 conn.rollback();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUncheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");
			//{{user_implement_dev:<controlUncheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlUncheckAll>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
              
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // 画面を初期化
                initializeAll();
                try {
                 homeCur = HomeCurControl.getData(conn);
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AE0030010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
 	        
 	        /** パラメータ「発注指示権限」を取得*/
 	        privateConfig = new PrivateConfig(conn);
 	        aprPurInst = privateConfig.getString("APR_PUR_INST");
 	        // パラメータ「発注指示権限」が取得できなかった場合
 	        if(aprPurInst == null || "".equals(aprPurInst)){
  				String locale = CoreTools.getLocale(struct.getsUser_ID());
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  				setErrorMessage("AZ00041", messages.getString("AZ00073"));
  				aprPurInst = "0";
                // 検索状態を「失敗」に設定
                setReadStatus(ERROR);
 	        	return;
 	        }else if(!"1".equals(aprPurInst)){
 				// １以外の場合
 	        	aprPurInst = "0";
 	        }else{
 				// １の場合
 	        	aprPurInst = "1";
 	        }
 	        struct.seth_APR_PUR_INST(aprPurInst);
 	        //ログインユーザの承認権限
 	        struct.setUSER_CD(this.getsysUSER_CD());
 	        List userList = entity.mselectUSER_MST.read(conn,struct);
 	        if(userList != null && userList.size() > 0){
 	        	//承認権限
 	        	hApprPowerTyp = ((AE0030010Struct)userList.get(0)).getAPPR_POWER_TYP();
 	        	struct.seth_APPR_POWER_TYP(hApprPowerTyp);
 	        }
			// 検索状態を初期化
			setReadStatus(INITIAL);
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                }
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Execute") ) {
				controlExecute();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("UncheckAll") ) {
				controlUncheckAll();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>

 	            struct.seth_APR_PUR_INST(aprPurInst);
	        	struct.seth_APPR_POWER_TYP(hApprPowerTyp);
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AE0030010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030010-E999","CSVの出力処理"));
			throw new FoundationException("AE0030010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0030010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0030010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0030010Entity entity;
	protected AE0030010Struct struct;
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

		entity = new AE0030010Entity();
		struct = new AE0030010Struct();

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
	 * AE0030010クラスの標準コンストラクタ
	 */
	public AE0030010Control() throws BusinessProcessException, FoundationException
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
				AE0030010Struct key = (AE0030010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r1_FILTER2") && key.getr1_FILTER2() != null) {
					msgKey.setKeyValue("r1_FILTER2", key.getr1_FILTER2());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER2") && key.getr2_FILTER2() != null) {
					msgKey.setKeyValue("r2_FILTER2", key.getr2_FILTER2());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("h_APR_PUR_INST") && key.geth_APR_PUR_INST() != null) {
					msgKey.setKeyValue("h_APR_PUR_INST", key.geth_APR_PUR_INST());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP") && key.geth_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APPR_POWER_TYP", key.geth_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL") && key.getPUCH_ODR_START_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_ALL", key.getPUCH_ODR_START_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL") && key.getPUCH_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_ALL", key.getPUCH_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("DIRECT_FLG") && key.getDIRECT_FLG() != null) {
					msgKey.setKeyValue("DIRECT_FLG", key.getDIRECT_FLG());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE") && key.getRATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("RATE_JUDGE_DATE", key.getRATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_DATE") && key.getPUCH_ODR_INST_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_INST_DATE", key.getPUCH_ODR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("JF_INSTALL_FLG") && key.getJF_INSTALL_FLG() != null) {
					msgKey.setKeyValue("JF_INSTALL_FLG", key.getJF_INSTALL_FLG());
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
					AE0030010Struct key = new AE0030010Struct();
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r1_FILTER2")) {
						key.setr1_FILTER2(msgKey.getKeyValue("r1_FILTER2"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER2")) {
						key.setr2_FILTER2(msgKey.getKeyValue("r2_FILTER2"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_PUR_INST")) {
						key.seth_APR_PUR_INST(msgKey.getKeyValue("h_APR_PUR_INST"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP")) {
						key.seth_APPR_POWER_TYP(msgKey.getKeyValue("h_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_ALL")) {
						key.setPUCH_ODR_START_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_START_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_ALL")) {
						key.setPUCH_ODR_DLV_DATE_ALL(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("DIRECT_FLG")) {
						key.setDIRECT_FLG(msgKey.getKeyValue("DIRECT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE")) {
						key.setRATE_JUDGE_DATE(msgKey.getKeyValue("RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_DATE")) {
						key.setPUCH_ODR_INST_DATE(msgKey.getKeyValue("PUCH_ODR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("JF_INSTALL_FLG")) {
						key.setJF_INSTALL_FLG(msgKey.getKeyValue("JF_INSTALL_FLG"));
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
