/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0030/src/com/nec/jp/orteus/metamorBase/AE0030/AE0030020Control.java,v $
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

import java.io.*;
import jp.co.fit.vfreport.*;
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
import com.nec.jp.orteus.metamorBase.common04.sysdata.*;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AE0030020Control
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
        public AE0030020Struct getListvalue(int x) {
         return (AE0030020Struct) (this.list.get(x));
        } // リストの値を返します。
        public AE0030020Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public AE0030020Struct createStruct() {
         return new AE0030020Struct();
        } // 新しいStructを作って返します。
        public void setStruct(Object structname) {
         this.struct.setStruct((AE0030020Struct) structname);
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
         struct.setr1_FILTER3("true");
         struct.setr2_FILTER3(null);
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
         pdfList = null;
       
         readStatus = INITIAL;
        }
       
	/** 時刻管理用フラグ */
	private String _flgTimeCtrl = null;

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
         * ＰＤＦ出力用リスト
         */
        private List pdfList;


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
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // マスク項目の値をクリア
                 clearDisabledField();
              
                 // 詳細項目をクリア
                 initializeDetail();
              
                 // 変数定義
                 AE0030020Struct aStruct = null;
              
                 // 工場名を検索し、存在しない場合はエラー
                 List plantList = entity.mM_PLANT.read(conn, struct);
                 if (plantList.isEmpty()) {
                  setErrorMessage("AE00027");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  AE0030020Struct plantStruct = (AE0030020Struct) plantList.get(0);
                  struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
                 // 取引先名を検索し、存在しない場合はエラー
                 if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
                  List vandList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (vandList.isEmpty()) {
                   setErrorMessage("AE20030");
                   setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
                  } else {
                   AE0030020Struct vendStruct = (AE0030020Struct) vandList.get(0);
                   struct.setVEND_NAME(vendStruct.getVEND_NAME());
                  }
                 }
                 // 発注担当者名を検索し、存在しない場合はエラー
                 if (struct.getPUCH_ODR_PERSON() != null && !struct.getPUCH_ODR_PERSON().equals("")) {
                  List userList = entity.mUSER_MST.read(conn, struct);
                  if (userList.isEmpty()) {
                   setErrorMessage("AE00005");
                   setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
                  } else {
                   AE0030020Struct userStruct = (AE0030020Struct) userList.get(0);
                   struct.setUSER_NAME(userStruct.getUSER_NAME());
                  }
                 }
              
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  return;
                 }
                 // チェックボックスの値を設定
                 if ("true".equals(struct.getReOutputFlag())) {
                  struct.setPUCH_ODR_INST_SLIP_ISS_FLG("1");
                  struct.setPARTIAL_DELIV_SLIP_ISS_FLG("1");
                  // 注文書発注フラグ
                  struct.setODR_FORM_FLG(null);
                 } else {
                  struct.setPUCH_ODR_INST_SLIP_ISS_FLG("0");
                  struct.setPARTIAL_DELIV_SLIP_ISS_FLG("0");
                  // 注文書発注フラグ
                  struct.setODR_FORM_FLG("1");
                 }
              
		 //入力時刻のチェック(時刻管理する場合のみ)
		 if((struct.getTIME_CTRL()).equals("true")){
				//①発注予定日(時刻)のチェック
				if((struct.getPUCH_ODR_START_TIME()).length() == 3 ){
					//３桁は頭に０を付ける
					struct.setPUCH_ODR_START_TIME("0" + struct.getPUCH_ODR_START_TIME());
				}
				//②発注納期(時刻)のチェック
				if((struct.getPUCH_ODR_DLV_TIME()).length() == 3 ){
					//３桁は頭に０を付ける
					struct.setPUCH_ODR_DLV_TIME("0" + struct.getPUCH_ODR_DLV_TIME());
				}
		 }else{
			struct.setPUCH_ODR_START_TIME("");	
			struct.setPUCH_ODR_DLV_TIME("");
		 }
                	
		 // 検索条件の設定
		 setSearchCondition();
		 

		 			// 最大表示行数
					int maxLine = sp.getMaxLine(conn, 10);
					if (maxLine != 0) {
						struct.setROW_COUNT(String.valueOf(maxLine));
					} else
						struct.setROW_COUNT(null);

					// リストデータの検索
					List viewList = new ArrayList();
					if("true".equals(struct.getr2_FILTER3())){
						viewList = entity.mViewCnt1.read(conn, struct);
					}else{
						viewList = entity.mViewCnt.read(conn, struct);
					}
					// pdfList = viewList;
					long rowCount = Long.parseLong(((AE0030020Struct) viewList.get(0))
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
				setErrorParameter("T_RLSD_PUCH_ODR","PUCH_ODR_INST_SLIP_ISS_FLG", struct.getPUCH_ODR_INST_SLIP_ISS_FLG());
				readStatus = NOT_FOUND;
				if(list !=null &&list.size()>0){
					list.clear();
				}
				return;
			}

                 if ((maxLine != 0) && (rowCount == maxLine + 1)) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				readStatus = TOO_MANY;
				if (list != null && list.size() > 0) {
					list.clear();
				}
				return;
			} else {

				// リストデータの検索
				// ラジオボタン【分納伝票出力】で検索する場合
				if("true".equals(struct.getr2_FILTER3())){
				    viewList = entity.mView1.read(conn, struct);
				}else{
					viewList = entity.mView.read(conn, struct); 
				}
              
            pdfList = viewList;
			 // リストデータを設定
	                 setList(viewList);
			for (int i = 0; i < list.size(); i++) {
				aStruct = (AE0030020Struct)list.get(i);
			}
                 }           
                 // リストデータを設定
                 setList(viewList);
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 注文書出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AE0030020Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                 // TODO: ユーザ定義のコードを記述してください
                try {
                 // 再検索して印刷の場合
                 if ("1".equals(printPattern)) {
                  // 再検索を行う
                  controlSelect();
              
                  // 選択登録の場合
                 } else if ("3".equals(printPattern)) {
                  pdfList = new ArrayList();
              
                  // 選択項目をpdfListに設定
                  List selectedPuchOdrCd = struct.getList_l_PUCH_ODR_CD();
                  List selectedModifyCount = struct.getList_l_MODIFY_COUNT();
                  List selectedSlipIssFlg = struct.getList_l_PUCH_ODR_INST_SLIP_ISS_FLG();
                  for (int i = 0; i < selectedPuchOdrCd.size(); i++) {
                   AE0030020Struct s = new AE0030020Struct();
                   s.setl_PUCH_ODR_CD((String) selectedPuchOdrCd.get(i));
                   s.setl_MODIFY_COUNT((String) selectedModifyCount.get(i));
                   s.setl_PUCH_ODR_INST_SLIP_ISS_FLG((String)selectedSlipIssFlg.get(i));
                   pdfList.add(s);
                  }
                 }
              
                 // エラーがある、またはリストが存在しない場合は処理を終了
                 if (msgStruct.hasError() || pdfList == null || pdfList.isEmpty()) {
                  return;
                 }
              
                 // 業務運用日の取得
                 String plantCd = struct.getPLANT_CD();
                 String businessOprDate = DateCtrlControl.getData(conn, plantCd).getBUSINESS_OPR_DATE();
              
                 //印刷処理の開始
                 String printId1 = null;	// 帳票IDの初期化
                 if(struct.getReOutputFlag() != null && "true".equals(struct.getReOutputFlag())){
	                 printId1 = "AE00300202";	//再発行用帳票IDを指定してください
                 }else{
                     printId1 = "AE00300201";	//通常発行用帳票IDを指定してください
                 }
                 ret = svf.VrInit(printId1);	// PDF作成開始 
                 
                 pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
                 pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
                 String excuteOutput = svf.getExcuteOutput();	// サーバ出力処理                 
                
                 List HOME_CUR_UNITList = entity.mHOME_CUR_UNIT.read(conn, null);
                 if (HOME_CUR_UNITList.isEmpty()) {
                	ExpjMessage emsg = new ExpjMessage("ZZ06001");
     				msgStruct.addError(emsg);
     				sysLog.warning(emsg, sysUSER_CD);
     				return;               
                 }
                 AE0030020Struct HOME_CUR_UNITStruct = (AE0030020Struct)HOME_CUR_UNITList.get(0);
                 String HOME_CUR_UNIT = HOME_CUR_UNITStruct.getM_CUR__HOME_CUR_UNIT();             
       			// クエリーファイルの指定 		
      			if (dbKIND != null && !dbKIND.equals("")) {
      				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
      						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
      			} else {
      				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
      						+ dbDBQ);
      			}               
              
                 //ヘッダー部のセット
              
                 //データのセット
                 for (Iterator i = pdfList.iterator(); i.hasNext();) {
                	 AE0030020Struct pdfStruct = (AE0030020Struct) i.next();
                	 
                	 // 対象行のロック
                	 List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, pdfStruct);
                	 // PDF出力するキーが存在しない場合はエラー。
                	 if (lockedList.isEmpty()) {
                		 setErrorMessage("ZZ01105");
                		 return;
                	 }
                	 // 読み込み時の"更新数"と異なる場合はエラー
                	 AE0030020Struct lockedStruct = (AE0030020Struct) lockedList.get(0);
                	 if (!lockedStruct.getMODIFY_COUNT().equals(pdfStruct.getl_MODIFY_COUNT())) {
                		 setErrorMessage("ZZ01105");
                		 return;
                	 }
                	                 	 
                	 // クエリー抽出条件の指定
                	 ret = svf.VrCondition("[X|PUCH_ODR_CD]=" + pdfStruct.getl_PUCH_ODR_CD(), 4);
                	 ret = svf.VrCondition("[X|HOME_CUR_UNIT]=" + HOME_CUR_UNIT, 4);
                	 // クエリー実行 
                	 ret = svf.VrReport();
            		 if (ret == -554) {
        				ExpjMessage emsg = new ExpjMessage("ZZ06001");
        				msgStruct.addError(emsg);
        				sysLog.warning(emsg, sysUSER_CD);
        				return;
        			 }
                	 //初回発行判断
            		 if("0".equals(pdfStruct.getl_PUCH_ODR_INST_SLIP_ISS_FLG())){
                	     // 帳票出力日更新
                	     struct.setPUCH_ODR_SLIP_ISS_DATE(businessOprDate);
                	     struct.setl_PUCH_ODR_CD(pdfStruct.getl_PUCH_ODR_CD());
                	     entity.mT_RLSD_PUCH_ODR.update(conn, struct);
            		 }
                 }             
              
                 ret = svf.VrQuit(); // PDF作成終了
              
                 if ("0".equals(printType)) { // クライアント印刷の場合
                  struct.setDOWNLOAD_FILE(getPdfFileName());
                 } else if ("1".equals(printType)) {
                  try {
                   String acrobatPath = svf.getAcrobatPath();
                   String acrobatOption1 = svf.getAcrobatOption1();
                   String acrobatOption2 = svf.getAcrobatOption2();
                   String pdfPrinter = svf.getPrinter();
                   Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
                   //Runtime.getRuntime().exec(excuteOutput);
                  } catch (IOException e) {
                   throw new ExpjException(e);
                  }
                 }
              
                 // 再読込
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (DataNotFoundException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // 画面を初期化
                initializeAll();
                try {
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AE0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUncheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");
			//{{user_implement_dev:<controlUncheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlUncheckAll>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");

		return;
	}

	/**
	 * 分納伝票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPartialSlipOutput() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPartialSlipOutput");
			//{{user_implement_dev:<controlPartialSlipOutput>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int ret = 0;
			String printType      = getPdfOutputType();
			String printPattern   = getPdfOutputListPattern();
			String printer        = getPdfOutputPrinter();
			SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);
			
			// 再検索して印刷の場合
            if ("1".equals(printPattern)) {
                // 再検索を行う
                controlSelect();
            // 選択登録の場合
            } else if ("3".equals(printPattern)) {
                pdfList = new ArrayList();
                // 選択項目をpdfListに設定
                List selectedPuchOdrCd = struct.getList_l_PUCH_ODR_CD();
                List selectedModifyCount = struct.getList_l_MODIFY_COUNT();
                for (int i = 0; i < selectedPuchOdrCd.size(); i++) {
                    AE0030020Struct s = new AE0030020Struct();
                    s.setl_PUCH_ODR_CD((String) selectedPuchOdrCd.get(i));
                    s.setl_MODIFY_COUNT((String) selectedModifyCount.get(i));
                    pdfList.add(s);
                }
            }
            // エラーがある、またはリストが存在しない場合は処理を終了
            if (msgStruct.hasError() || pdfList == null || pdfList.isEmpty()) {
             return;
            }
            // 業務運用日の取得
            String plantCd = struct.getPLANT_CD();
            String businessOprDate = DateCtrlControl.getData(conn, plantCd).getBUSINESS_OPR_DATE();
            
			String printId1 = "AE00300203";		// TODO: 帳票IDを指定してください
			//String queryId1 = "AE00300201";		// TODO: クエリーIDを指定してください(省略時：printId)

			ret = svf.VrInit(printId1);	// PDF作成開始
			//ret = svf.VrInit(printId1, queryId1);	// PDF作成開始(クエリーID指定版)
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			queryFileName = svf.getQueryFileName();	// queryファイル名

			/* クエリーファイルの指定 */
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			
			//データのセット
			for(Iterator i = pdfList.iterator(); i.hasNext();){
				AE0030020Struct pdfStruct = (AE0030020Struct) i.next();
				// 対象行のロック
           	    List lockedList = entity.mT_RLSD_PUCH_ODR_Lock.read(conn, pdfStruct);
           	    // PDF出力するキーが存在しない場合はエラー。
           	    if (lockedList.isEmpty()) {
           		    setErrorMessage("ZZ01105");
           		    return;
           	    }
           	    // 読み込み時の"更新数"と異なる場合はエラー
           	    AE0030020Struct lockedStruct = (AE0030020Struct) lockedList.get(0);
           	    if (!lockedStruct.getMODIFY_COUNT().equals(pdfStruct.getl_MODIFY_COUNT())) {
           		    setErrorMessage("ZZ01105");
           		    return;
           	    }
				// クエリー抽出条件の指定
				ret = svf.VrCondition("[X|PUCH_ODR_CD]=" + pdfStruct.getl_PUCH_ODR_CD(),4);
				
				/* クエリー実行 */
				ret = svf.VrReport();
				if(ret == -554) {
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					return;
				}
				
				// 【発注残】の更新処理を行う
           	    struct.setwork_ISS_DATE(businessOprDate);
           	    struct.setl_PUCH_ODR_CD(pdfStruct.getl_PUCH_ODR_CD());
				entity.mT_RLSD_PUCH_ODR_UPDATE.update(conn, struct);
			}

			/* PDF作成終了 */
			ret = svf.VrQuit();
			if ( "0".equals(printType) ) {	// クライアント印刷の場合
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				}catch(IOException e){
					// サーバ印刷失敗時のエラー処理を記述してください。
				}
			}
			// 再読込
			controlSelect();
			conn.commit();
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlPartialSlipOutput>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPartialSlipOutput");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
            
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0030");
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // 画面を初期化
                initializeAll();
                try {
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mSYS_PARAMETER.read(conn,struct);
			if(listTimeCtrl == null || listTimeCtrl.size() <=0){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AE0030020Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア
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
              
                struct.setDOWNLOAD_FILE(null);
              
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0030020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("UncheckAll") ) {
				controlUncheckAll();
			} else if( button.equals("PartialSlipOutput") ) {
				controlPartialSlipOutput();
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
//			throw new FoundationException("AE0030020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030020-E999","CSVの出力処理"));
			throw new FoundationException("AE0030020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030020-E999","システム日付の取得処理"));
				throw new FoundationException("AE0030020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0030020-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0030020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0030020Entity entity;
	protected AE0030020Struct struct;
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

		entity = new AE0030020Entity();
		struct = new AE0030020Struct();

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
	 * AE0030020クラスの標準コンストラクタ
	 */
	public AE0030020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
		} catch(MissingResourceException e) {
			e.printStackTrace();
		}
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
				AE0030020Struct key = (AE0030020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ReOutputFlag") && key.getReOutputFlag() != null) {
					msgKey.setKeyValue("ReOutputFlag", key.getReOutputFlag());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
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
				if(msgKeyType.containsKeyColumn("r1_FILTER3") && key.getr1_FILTER3() != null) {
					msgKey.setKeyValue("r1_FILTER3", key.getr1_FILTER3());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER3") && key.getr2_FILTER3() != null) {
					msgKey.setKeyValue("r2_FILTER3", key.getr2_FILTER3());
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
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE") && key.getl_PUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_SLIP_ISS_DATE", key.getl_PUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG") && key.getl_PUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG", key.getl_PUCH_ODR_INST_SLIP_ISS_FLG());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG") && key.getPUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG", key.getPUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_FORM_FLG") && key.getODR_FORM_FLG() != null) {
					msgKey.setKeyValue("ODR_FORM_FLG", key.getODR_FORM_FLG());
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
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_CD") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_CD", key.getT_RLSD_PUCH_ODR__PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_DATE_CTRL__BUSINESS_OPR_DATE") && key.getSYS_DATE_CTRL__BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("SYS_DATE_CTRL__BUSINESS_OPR_DATE", key.getSYS_DATE_CTRL__BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_NAME") && key.getM_VEND_CTRL__VEND_NAME() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__VEND_NAME", key.getM_VEND_CTRL__VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ZIP_CD") && key.getM_VEND_CTRL__ZIP_CD() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__ZIP_CD", key.getM_VEND_CTRL__ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_1") && key.getM_VEND_CTRL__ADDRESS_1() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__ADDRESS_1", key.getM_VEND_CTRL__ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_2") && key.getM_VEND_CTRL__ADDRESS_2() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__ADDRESS_2", key.getM_VEND_CTRL__ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_ORG") && key.getM_VEND_CTRL__VEND_ORG() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__VEND_ORG", key.getM_VEND_CTRL__VEND_ORG());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_PERSON") && key.getM_VEND_CTRL__VEND_PERSON() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__VEND_PERSON", key.getM_VEND_CTRL__VEND_PERSON());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__TEL") && key.getM_VEND_CTRL__TEL() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__TEL", key.getM_VEND_CTRL__TEL());
				}
				if(msgKeyType.containsKeyColumn("M_VEND_CTRL__FAX") && key.getM_VEND_CTRL__FAX() != null) {
					msgKey.setKeyValue("M_VEND_CTRL__FAX", key.getM_VEND_CTRL__FAX());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__ITEM_CD") && key.getT_RLSD_PUCH_ODR__ITEM_CD() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__ITEM_CD", key.getT_RLSD_PUCH_ODR__ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__ITEM_NAME") && key.getM_ITEM__ITEM_NAME() != null) {
					msgKey.setKeyValue("M_ITEM__ITEM_NAME", key.getM_ITEM__ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_OD__JOB_ODR_CD") && key.getT_OD__JOB_ODR_CD() != null) {
					msgKey.setKeyValue("T_OD__JOB_ODR_CD", key.getT_OD__JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_QTY") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_QTY", key.getT_RLSD_PUCH_ODR__PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT") && key.getM_ITEM__STOCK_UNIT() != null) {
					msgKey.setKeyValue("M_ITEM__STOCK_UNIT", key.getM_ITEM__STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_QTY") && key.getPKG_QTY() != null) {
					msgKey.setKeyValue("PKG_QTY", key.getPKG_QTY());
				}
				if(msgKeyType.containsKeyColumn("PKG_ODD_QTY") && key.getPKG_ODD_QTY() != null) {
					msgKey.setKeyValue("PKG_ODD_QTY", key.getPKG_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__PKG_UNIT") && key.getM_ITEM__PKG_UNIT() != null) {
					msgKey.setKeyValue("M_ITEM__PKG_UNIT", key.getM_ITEM__PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT2") && key.getM_ITEM__STOCK_UNIT2() != null) {
					msgKey.setKeyValue("M_ITEM__STOCK_UNIT2", key.getM_ITEM__STOCK_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA", key.getT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__UNIT_COST") && key.getT_RLSD_PUCH_ODR__UNIT_COST() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__UNIT_COST", key.getT_RLSD_PUCH_ODR__UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("M_CUR__VEND_CUR_UNIT") && key.getM_CUR__VEND_CUR_UNIT() != null) {
					msgKey.setKeyValue("M_CUR__VEND_CUR_UNIT", key.getM_CUR__VEND_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT", key.getT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__DISC_AMOUNT") && key.getT_RLSD_PUCH_ODR__DISC_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__DISC_AMOUNT", key.getT_RLSD_PUCH_ODR__DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__NET_AMOUNT") && key.getT_RLSD_PUCH_ODR__NET_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__NET_AMOUNT", key.getT_RLSD_PUCH_ODR__NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT") && key.getTAX_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_AMOUNT", key.getTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_") && key.getT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_", key.getT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT") && key.getT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT", key.getT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("M_CUR__HOME_CUR_UNIT") && key.getM_CUR__HOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("M_CUR__HOME_CUR_UNIT", key.getM_CUR__HOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("M_CUR__CUR_NAME") && key.getM_CUR__CUR_NAME() != null) {
					msgKey.setKeyValue("M_CUR__CUR_NAME", key.getM_CUR__CUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("SYS_TYPE_VALUE__DISPLAY_NAME") && key.getSYS_TYPE_VALUE__DISPLAY_NAME() != null) {
					msgKey.setKeyValue("SYS_TYPE_VALUE__DISPLAY_NAME", key.getSYS_TYPE_VALUE__DISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE") && key.getT_RLSD_PUCH_ODR__RATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE", key.getT_RLSD_PUCH_ODR__RATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__EXCH_RATE") && key.getT_RLSD_PUCH_ODR__EXCH_RATE() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__EXCH_RATE", key.getT_RLSD_PUCH_ODR__EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PROCESSING_COST") && key.getT_RLSD_PUCH_ODR__PROCESSING_COST() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PROCESSING_COST", key.getT_RLSD_PUCH_ODR__PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__MATERIAL_COST") && key.getT_RLSD_PUCH_ODR__MATERIAL_COST() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__MATERIAL_COST", key.getT_RLSD_PUCH_ODR__MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__OTHER_OVERHEADS") && key.getT_RLSD_PUCH_ODR__OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__OTHER_OVERHEADS", key.getT_RLSD_PUCH_ODR__OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN") && key.getT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN() != null) {
					msgKey.setKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN", key.getT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__PLANT_NAME") && key.getM_PLANT__PLANT_NAME() != null) {
					msgKey.setKeyValue("M_PLANT__PLANT_NAME", key.getM_PLANT__PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("M_WH__WH_NAME") && key.getM_WH__WH_NAME() != null) {
					msgKey.setKeyValue("M_WH__WH_NAME", key.getM_WH__WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__ZIP_CD") && key.getM_PLANT__ZIP_CD() != null) {
					msgKey.setKeyValue("M_PLANT__ZIP_CD", key.getM_PLANT__ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_1") && key.getM_PLANT__ADDRESS_1() != null) {
					msgKey.setKeyValue("M_PLANT__ADDRESS_1", key.getM_PLANT__ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_2") && key.getM_PLANT__ADDRESS_2() != null) {
					msgKey.setKeyValue("M_PLANT__ADDRESS_2", key.getM_PLANT__ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("M_PLANT__TEL") && key.getM_PLANT__TEL() != null) {
					msgKey.setKeyValue("M_PLANT__TEL", key.getM_PLANT__TEL());
				}
				if(msgKeyType.containsKeyColumn("USER_MST__USER_NAME") && key.getUSER_MST__USER_NAME() != null) {
					msgKey.setKeyValue("USER_MST__USER_NAME", key.getUSER_MST__USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE") && key.getPUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_SLIP_ISS_DATE", key.getPUCH_ODR_SLIP_ISS_DATE());
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
				if(msgKeyType.containsKeyColumn("work_busDate") && key.getwork_busDate() != null) {
					msgKey.setKeyValue("work_busDate", key.getwork_busDate());
				}
				if(msgKeyType.containsKeyColumn("work_ISS_DATE") && key.getwork_ISS_DATE() != null) {
					msgKey.setKeyValue("work_ISS_DATE", key.getwork_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_DELIV_SLIP_ISS_FLG") && key.getPARTIAL_DELIV_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_DELIV_SLIP_ISS_FLG", key.getPARTIAL_DELIV_SLIP_ISS_FLG());
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
					AE0030020Struct key = new AE0030020Struct();
					if(msgKeyType.containsKeyColumn("ReOutputFlag")) {
						key.setReOutputFlag(msgKey.getKeyValue("ReOutputFlag"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
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
					if(msgKeyType.containsKeyColumn("r1_FILTER3")) {
						key.setr1_FILTER3(msgKey.getKeyValue("r1_FILTER3"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER3")) {
						key.setr2_FILTER3(msgKey.getKeyValue("r2_FILTER3"));
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
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE")) {
						key.setl_PUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.setl_PUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("l_PUCH_ODR_INST_SLIP_ISS_FLG"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.setPUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_FORM_FLG")) {
						key.setODR_FORM_FLG(msgKey.getKeyValue("ODR_FORM_FLG"));
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
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_CD")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_CD(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_DATE_CTRL__BUSINESS_OPR_DATE")) {
						key.setSYS_DATE_CTRL__BUSINESS_OPR_DATE(msgKey.getKeyValue("SYS_DATE_CTRL__BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_NAME")) {
						key.setM_VEND_CTRL__VEND_NAME(msgKey.getKeyValue("M_VEND_CTRL__VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ZIP_CD")) {
						key.setM_VEND_CTRL__ZIP_CD(msgKey.getKeyValue("M_VEND_CTRL__ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_1")) {
						key.setM_VEND_CTRL__ADDRESS_1(msgKey.getKeyValue("M_VEND_CTRL__ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__ADDRESS_2")) {
						key.setM_VEND_CTRL__ADDRESS_2(msgKey.getKeyValue("M_VEND_CTRL__ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_ORG")) {
						key.setM_VEND_CTRL__VEND_ORG(msgKey.getKeyValue("M_VEND_CTRL__VEND_ORG"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__VEND_PERSON")) {
						key.setM_VEND_CTRL__VEND_PERSON(msgKey.getKeyValue("M_VEND_CTRL__VEND_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__TEL")) {
						key.setM_VEND_CTRL__TEL(msgKey.getKeyValue("M_VEND_CTRL__TEL"));
					}
					if(msgKeyType.containsKeyColumn("M_VEND_CTRL__FAX")) {
						key.setM_VEND_CTRL__FAX(msgKey.getKeyValue("M_VEND_CTRL__FAX"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__ITEM_CD")) {
						key.setT_RLSD_PUCH_ODR__ITEM_CD(msgKey.getKeyValue("T_RLSD_PUCH_ODR__ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__ITEM_NAME")) {
						key.setM_ITEM__ITEM_NAME(msgKey.getKeyValue("M_ITEM__ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_OD__JOB_ODR_CD")) {
						key.setT_OD__JOB_ODR_CD(msgKey.getKeyValue("T_OD__JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_QTY")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_QTY(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT")) {
						key.setM_ITEM__STOCK_UNIT(msgKey.getKeyValue("M_ITEM__STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_QTY")) {
						key.setPKG_QTY(msgKey.getKeyValue("PKG_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PKG_ODD_QTY")) {
						key.setPKG_ODD_QTY(msgKey.getKeyValue("PKG_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__PKG_UNIT")) {
						key.setM_ITEM__PKG_UNIT(msgKey.getKeyValue("M_ITEM__PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("M_ITEM__STOCK_UNIT2")) {
						key.setM_ITEM__STOCK_UNIT2(msgKey.getKeyValue("M_ITEM__STOCK_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_DLV_DA"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__UNIT_COST")) {
						key.setT_RLSD_PUCH_ODR__UNIT_COST(msgKey.getKeyValue("T_RLSD_PUCH_ODR__UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("M_CUR__VEND_CUR_UNIT")) {
						key.setM_CUR__VEND_CUR_UNIT(msgKey.getKeyValue("M_CUR__VEND_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__DISC_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__DISC_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__NET_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__NET_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT")) {
						key.setTAX_AMOUNT(msgKey.getKeyValue("TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_")) {
						key.setT_RLSD_PUCH_ODR__AMOUNT_INCLUDE_(msgKey.getKeyValue("T_RLSD_PUCH_ODR__AMOUNT_INCLUDE_"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT")) {
						key.setT_RLSD_PUCH_ODR__HOME_CUR_AMOUNT(msgKey.getKeyValue("T_RLSD_PUCH_ODR__HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("M_CUR__HOME_CUR_UNIT")) {
						key.setM_CUR__HOME_CUR_UNIT(msgKey.getKeyValue("M_CUR__HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("M_CUR__CUR_NAME")) {
						key.setM_CUR__CUR_NAME(msgKey.getKeyValue("M_CUR__CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SYS_TYPE_VALUE__DISPLAY_NAME")) {
						key.setSYS_TYPE_VALUE__DISPLAY_NAME(msgKey.getKeyValue("SYS_TYPE_VALUE__DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE")) {
						key.setT_RLSD_PUCH_ODR__RATE_JUDGE_DATE(msgKey.getKeyValue("T_RLSD_PUCH_ODR__RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__EXCH_RATE")) {
						key.setT_RLSD_PUCH_ODR__EXCH_RATE(msgKey.getKeyValue("T_RLSD_PUCH_ODR__EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PROCESSING_COST")) {
						key.setT_RLSD_PUCH_ODR__PROCESSING_COST(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__MATERIAL_COST")) {
						key.setT_RLSD_PUCH_ODR__MATERIAL_COST(msgKey.getKeyValue("T_RLSD_PUCH_ODR__MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__OTHER_OVERHEADS")) {
						key.setT_RLSD_PUCH_ODR__OTHER_OVERHEADS(msgKey.getKeyValue("T_RLSD_PUCH_ODR__OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN")) {
						key.setT_RLSD_PUCH_ODR__PUCH_ODR_COMMEN(msgKey.getKeyValue("T_RLSD_PUCH_ODR__PUCH_ODR_COMMEN"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__PLANT_NAME")) {
						key.setM_PLANT__PLANT_NAME(msgKey.getKeyValue("M_PLANT__PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("M_WH__WH_NAME")) {
						key.setM_WH__WH_NAME(msgKey.getKeyValue("M_WH__WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__ZIP_CD")) {
						key.setM_PLANT__ZIP_CD(msgKey.getKeyValue("M_PLANT__ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_1")) {
						key.setM_PLANT__ADDRESS_1(msgKey.getKeyValue("M_PLANT__ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__ADDRESS_2")) {
						key.setM_PLANT__ADDRESS_2(msgKey.getKeyValue("M_PLANT__ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("M_PLANT__TEL")) {
						key.setM_PLANT__TEL(msgKey.getKeyValue("M_PLANT__TEL"));
					}
					if(msgKeyType.containsKeyColumn("USER_MST__USER_NAME")) {
						key.setUSER_MST__USER_NAME(msgKey.getKeyValue("USER_MST__USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_SLIP_ISS_DATE")) {
						key.setPUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("PUCH_ODR_SLIP_ISS_DATE"));
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
					if(msgKeyType.containsKeyColumn("work_busDate")) {
						key.setwork_busDate(msgKey.getKeyValue("work_busDate"));
					}
					if(msgKeyType.containsKeyColumn("work_ISS_DATE")) {
						key.setwork_ISS_DATE(msgKey.getKeyValue("work_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_DELIV_SLIP_ISS_FLG")) {
						key.setPARTIAL_DELIV_SLIP_ISS_FLG(msgKey.getKeyValue("PARTIAL_DELIV_SLIP_ISS_FLG"));
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
