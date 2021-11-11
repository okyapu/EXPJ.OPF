/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DD0010/src/com/nec/jp/orteus/metamorBase/DD0010/DD0010020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DD0010;

import com.nec.jp.orteus.metamorBase.DD0010.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class DD0010020Control
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
        public DD0010020Struct getListvalue(int x) {
         return (DD0010020Struct) (this.list.get(x));
        } // リストの値を返します。
        public DD0010020Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public DD0010020Struct createStruct() {
         return new DD0010020Struct();
        } // 新しいStructを作って返します。
        public void setStruct(Object structname) {
         this.struct.setStruct((DD0010020Struct) structname);
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
        /** 邦貨単位 */
        private String _homeCurUnit;
       
        /** ログインユーザの工場コードをキーに検索した[原価管理パラメータ]データオブジェクト（画面初期化に使用） */
        private DD0010020Struct _mySysCostCtrl;
       
        /** ｢半期区分｣コンボボックスデータ */
        private ComboStruct _halfTermTypComboStruct = new ComboStruct();
       
        /** CSV出力データリスト */
        private List _csvList;
       
        /** 画面遷移キー(工場コード) */
        private String _plantCd;
        /** 画面遷移キー(年度) */
        private String _year;
        /** 画面遷移キー(半期区分) */
        private String _halfTermTyp;
        /** 画面遷移キー(最上位品目番号) */
        private String _rootItemCd;
       
        /**
         * 画面遷移キー(工場コード)を取得します。
         * @return 画面遷移キー(工場コード)
         */
        public String getPlantCd() {
         return _plantCd;
        }
        /**
         * 画面遷移キー(工場コード)を設定します。
         * @param string 画面遷移キー(工場コード)
         */
        public void setPlantCd(String string) {
         _plantCd = string;
        }
        /**
         * 画面遷移キー(年度)を取得します。
         * @return 画面遷移キー(年度)
         */
        public String getYear() {
         return _year;
        }
        /**
         * 画面遷移キー(年度)を設定します。
         * @param string 画面遷移キー(年度)
         */
        public void setYear(String string) {
         _year = string;
        }
        /**
         * 画面遷移キー(半期区分)を取得します。
         * @return 画面遷移キー(半期区分)
         */
        public String getHalfTermTyp() {
         return _halfTermTyp;
        }
        /**
         * 画面遷移キー(半期区分)を設定します。
         * @param string 画面遷移キー(半期区分)
         */
        public void setHalfTermTyp(String string) {
         _halfTermTyp = string;
        }
        /**
         * 画面遷移キー(最上位品目番号)を取得します。
         * @return 画面遷移キー(最上位品目番号)
         */
        public String getRootItemCd() {
         return _rootItemCd;
        }
        /**
         * 画面遷移キー(最上位品目番号)を設定します。
         * @param string 画面遷移キー(最上位品目番号)
         */
        public void setRootItemCd(String string) {
         _rootItemCd = string;
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
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStruct(DD0010020Struct s) {
         struct.setTOTAL_MATR_COST(s.getTOTAL_MATR_COST());
         struct.setTOTAL_SBCNT_MATR_COST(s.getTOTAL_SBCNT_MATR_COST());
         struct.setTOTAL_PROC_COST_SUM_ALL(s.getTOTAL_PROC_COST_SUM_ALL());
         struct.setTOTAL_COST(s.getTOTAL_COST());
         struct.setHOME_CUR_UNIT(_homeCurUnit);
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setPLANT_NAME(null);
         struct.setYEAR(_mySysCostCtrl.getCURRENT_YEAR());
         struct.setHALF_TERM_TYP(_mySysCostCtrl.getHALF_TERM_TYP());
         struct.setROOT_ITEM_CD(null);
         struct.setROOT_ITEM_NAME(null);
       
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetail() {
         struct.setTOTAL_MATR_COST("0");
         struct.setTOTAL_SBCNT_MATR_COST("0");
         struct.setTOTAL_PROC_COST_SUM_ALL("0");
         struct.setTOTAL_COST("0");
         struct.setHOME_CUR_UNIT(_homeCurUnit);
       
         list = null;
       
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // キー以外の画面を初期化
                 initializeDetail();
              
                 // キー項目の名称取得
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DD0010020Struct mPlantStruct = (DD0010020Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getROOT_ITEM_CD());
                  struct.setROOT_ITEM_NAME(null);
                 } else {
                  DD0010020Struct mItemStruct = (DD0010020Struct) mItemList.get(0);
                  struct.setROOT_ITEM_NAME(mItemStruct.getROOT_ITEM_NAME());
                 }
              
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // 明細情報を検索
                 List formList = entity.mForm.read(conn, struct);
                 // 明細情報が存在しない場合はエラー
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_ITEM_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_ITEM_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("T_ITEM_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("T_ITEM_COST", "COST_TYP", "1");
                  return;
                 }
              
                 DD0010020Struct formStruct = (DD0010020Struct) formList.get(0);
              
                 List viewList = entity.mView.read(conn, struct);
                 // 明細情報が存在しない場合。
                 if (viewList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_ITEM_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_ITEM_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("T_ITEM_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("T_ITEM_COST", "COST_TYP", "1");
                  return;
                 }
              
                 // CSVデータを検索
                 List csvList = entity.mCsv.read(conn, struct);
                 _csvList = csvList;
              
                 setStruct(formStruct);
              
                 // 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
                 int maxLine = sp.getMaxLine(conn, 10);
                 if ((maxLine != 0) && (viewList.size() > maxLine)) {
                  setErrorMessage("ZZ01115", String.valueOf(maxLine));
                  readStatus = TOO_MANY;
                  return;
                 }
              
                 // データを設定
                 setList(viewList);
                 DD0010020Struct TempStruct;
                 for (int i = 0; i < this.list.size(); i++) {
                 	TempStruct = (DD0010020Struct)list.get(i);
                 	TempStruct.setl_OUTSIDE_TYP_DN(this.multcombo("OUTSIDE_TYP",TempStruct.getl_OUTSIDE_TYP_DN()));
                 	TempStruct.setl_PROC_OUTSIDE_TYP_DN(this.multcombo("OUTSIDE_TYP",TempStruct.getl_PROC_OUTSIDE_TYP_DN()));
                 }
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
                // CSV情報の作成
                List csvList = new ArrayList();
                String[] title =
                 {
                 	"Expj.YEAR" ,
					"Expj.HALF_TERM_TYP" ,
					"Expj.Cmt1105" ,
					"Expj.COST_TYP" ,
					"Expj.Cmt1035" ,
					"Expj.PLANT_CD" ,
					"Expj.PLANT_NAME" ,
					"Expj.ROOT_ITEM_CD" ,
					"Expj.ROOT_ITEM_NAME" ,
					"Expj.PARENT_ITEM_CD" ,
					"Expj.PARENT_ITEM_NAME" ,
					"Expj.ITEM_CD" ,
					"Expj.ITEM_NAME" ,
					"Expj.PS_EDITION" ,
					"Expj.Cmt1033" ,
					"Expj.CS_PROC_CD" ,
					"Expj.CS_PROC_NAME" ,
					"Expj.WS_CD" ,
					"Expj.WS_NAME" ,
					"Expj.ORG_CD" ,
					"Expj.ORG_NAME" ,
					"Expj.NECESSARY_QTY" ,
					"Expj.PS_INPUT_RATIO" ,
					"Expj.ITEM_INPUT_RATIO" ,
					"Expj.TOTAL_COST" ,
					"Expj.OWN_MATR_COST" ,
					"Expj.TOTAL_MATR_COST" ,
					"Expj.OWN_SBCNT_MATR_COST" ,
					"Expj.TOTAL_SBCNT_MATR_COST" ,
					"Expj.OWN_PROC_COST_SUM_ALL" ,
					"Expj.TOTAL_PROC_COST_SUM_ALL" ,
					"Expj.CUR_UNIT" ,
					"Expj.Cmt1070" ,
					"Expj.Cmt1071" ,
					"Expj.Cmt1067" ,
					"Expj.Cmt1068" ,
					"Expj.STOCK_UNIT" ,
					"Expj.CLASIFICATION_CD_1" ,
					"Expj.OUTSIDE_TYP_4" ,
					"Expj.Cmt1110" ,
					"Expj.OUTSIDE_TYP_6" ,
					"Expj.Cmt1039" ,
					"Expj.PROC_COST_CLS_CD" ,
					"Expj.PROC_COST_CLS_NAME" ,
					"Expj.PROC_COST_UNIT_QTY" ,
					"Expj.STOCK_UNIT_2" ,
					"Expj.Cmt1051" ,
					"Expj.Cmt1052" ,
					"Expj.Cmt1053" ,
					"Expj.Cmt1054" ,
					"Expj.Cmt1055" ,
					"Expj.Cmt1056" ,
					"Expj.Cmt1057" ,
					"Expj.Cmt1058" ,
					"Expj.Cmt1059" ,
					"Expj.Cmt1060" ,
					"Expj.Cmt1061" ,
					"Expj.Cmt1062" ,
					"Expj.Cmt1063" ,
					"Expj.Cmt1077" ,
					"Expj.Cmt1078" ,
					"Expj.Cmt1079" ,
					"Expj.Cmt1080" ,
					"Expj.Cmt1081" ,
					"Expj.Cmt1082" ,
					"Expj.Cmt1083" ,
					"Expj.Cmt1084" ,
					"Expj.Cmt1085" ,
					"Expj.Cmt1086" ,
					"Expj.Cmt1087" ,
					"Expj.Cmt1088" ,
					"Expj.Cmt1089" ,
					"Expj.Cmt1018" ,
					"Expj.Cmt1019" ,
					"Expj.Cmt1020" ,
					"Expj.Cmt1021" ,
					"Expj.Cmt1022" ,
					"Expj.Cmt1023" ,
					"Expj.Cmt1024" ,
					"Expj.Cmt1025" ,
					"Expj.Cmt1026" ,
					"Expj.Cmt1027" ,
					"Expj.Cmt1028" ,
					"Expj.Cmt1029" 
                  };
                csvList.add(title);
                for (Iterator i = _csvList.iterator(); i.hasNext();) {
                 DD0010020Struct csvStruct = (DD0010020Struct) i.next();
                 String[] csvStr = new String[title.length];
                 csvStr[0] = csvStruct.getYEAR();
                 csvStr[1] = csvStruct.getHALF_TERM_TYP();
                 csvStr[2] = this.multcombo("HALF_TERM_TYP",csvStruct.getHALF_TERM_TYP());
                 csvStr[3] = csvStruct.getCOST_TYP();
                 csvStr[4] = this.multcombo("COST_TYP",csvStruct.getCOST_TYP());
                 csvStr[5] = csvStruct.getPLANT_CD();
                 csvStr[6] = csvStruct.getPLANT_NAME();
                 csvStr[7] = csvStruct.getROOT_ITEM_CD();
                 csvStr[8] = csvStruct.getROOT_ITEM_NAME();
                 csvStr[9] = csvStruct.getPARENT_ITEM_CD();
                 csvStr[10] = csvStruct.getPARENT_ITEM_NAME();
                 csvStr[11] = csvStruct.getITEM_CD();
                 csvStr[12] = csvStruct.getITEM_NAME();
                 csvStr[13] = csvStruct.getPS_EDITION();
                 csvStr[14] = csvStruct.getCOST_STATEMENT_NO();
                 csvStr[15] = csvStruct.getCS_PROC_CD();
                 csvStr[16] = csvStruct.getCS_PROC_NAME();
                 csvStr[17] = csvStruct.getWS_CD();
                 csvStr[18] = csvStruct.getWS_NAME();
                 csvStr[19] = csvStruct.getORG_CD();
                 csvStr[20] = csvStruct.getORG_NAME();
                 csvStr[21] = csvStruct.getNECESSARY_QTY();
                 csvStr[22] = csvStruct.getPS_INPUT_RATIO();
                 csvStr[23] = csvStruct.getITEM_INPUT_RATIO();
                 csvStr[24] = csvStruct.getTOTAL_COST();
                 csvStr[25] = csvStruct.getOWN_MATR_COST();
                 csvStr[26] = csvStruct.getTOTAL_MATR_COST();
                 csvStr[27] = csvStruct.getOWN_SBCNT_MATR_COST();
                 csvStr[28] = csvStruct.getTOTAL_SBCNT_MATR_COST();
                 csvStr[29] = csvStruct.getOWN_PROC_COST_SUM_ALL();
                 csvStr[30] = csvStruct.getTOTAL_PROC_COST_SUM_ALL();
                 csvStr[31] = csvStruct.getHOME_CUR_UNIT();
                 csvStr[32] = csvStruct.getEFF_PHASE_IN_DATE();
                 csvStr[33] = csvStruct.getEFF_PHASE_OUT_DATE();
                 csvStr[34] = csvStruct.getPARENT_COST_STATEMENT_NO();
                 csvStr[35] = csvStruct.getPARENT_ITEM_STOCK_UNIT();
                 csvStr[36] = csvStruct.getSTOCK_UNIT();
                 csvStr[37] = csvStruct.getCLASIFICATION_CD();
                 csvStr[38] = csvStruct.getOUTSIDE_TYP();
                 csvStr[39] = this.multcombo("OUTSIDE_TYP",csvStruct.getOUTSIDE_TYP());
                 csvStr[40] = csvStruct.getPROC_OUTSIDE_TYP();
                 csvStr[41] = this.multcombo("OUTSIDE_TYP",csvStruct.getPROC_OUTSIDE_TYP());
                 csvStr[42] = csvStruct.getPROC_COST_CLS_CD();
                 csvStr[43] = csvStruct.getPROC_COST_CLS_NAME();
                 csvStr[44] = csvStruct.getPROC_COST_UNIT_QTY();
                 csvStr[45] = csvStruct.getPROC_COST_UNIT_QTY_UNIT();
                 csvStr[46] = csvStruct.getOWN_PROC_COST_01();
                 csvStr[47] = csvStruct.getOWN_PROC_COST_02();
                 csvStr[48] = csvStruct.getOWN_PROC_COST_03();
                 csvStr[49] = csvStruct.getOWN_PROC_COST_04();
                 csvStr[50] = csvStruct.getOWN_PROC_COST_05();
                 csvStr[51] = csvStruct.getOWN_PROC_COST_06();
                 csvStr[52] = csvStruct.getOWN_PROC_COST_07();
                 csvStr[53] = csvStruct.getOWN_PROC_COST_08();
                 csvStr[54] = csvStruct.getOWN_PROC_COST_09();
                 csvStr[55] = csvStruct.getOWN_PROC_COST_10();
                 csvStr[56] = csvStruct.getOWN_PROC_COST_11();
                 csvStr[57] = csvStruct.getOWN_PROC_COST_12();
                 csvStr[58] = csvStruct.getOWN_PROC_COST_SUM();
                 csvStr[59] = csvStruct.getTOTAL_PROC_COST_01();
                 csvStr[60] = csvStruct.getTOTAL_PROC_COST_02();
                 csvStr[61] = csvStruct.getTOTAL_PROC_COST_03();
                 csvStr[62] = csvStruct.getTOTAL_PROC_COST_04();
                 csvStr[63] = csvStruct.getTOTAL_PROC_COST_05();
                 csvStr[64] = csvStruct.getTOTAL_PROC_COST_06();
                 csvStr[65] = csvStruct.getTOTAL_PROC_COST_07();
                 csvStr[66] = csvStruct.getTOTAL_PROC_COST_08();
                 csvStr[67] = csvStruct.getTOTAL_PROC_COST_09();
                 csvStr[68] = csvStruct.getTOTAL_PROC_COST_10();
                 csvStr[69] = csvStruct.getTOTAL_PROC_COST_11();
                 csvStr[70] = csvStruct.getTOTAL_PROC_COST_12();
                 csvStr[71] = csvStruct.getTOTAL_PROC_COST_SUM();
                 csvStr[72] = csvStruct.getPROC_COST_01_NAME();
                 csvStr[73] = csvStruct.getPROC_COST_02_NAME();
                 csvStr[74] = csvStruct.getPROC_COST_03_NAME();
                 csvStr[75] = csvStruct.getPROC_COST_04_NAME();
                 csvStr[76] = csvStruct.getPROC_COST_05_NAME();
                 csvStr[77] = csvStruct.getPROC_COST_06_NAME();
                 csvStr[78] = csvStruct.getPROC_COST_07_NAME();
                 csvStr[79] = csvStruct.getPROC_COST_08_NAME();
                 csvStr[80] = csvStruct.getPROC_COST_09_NAME();
                 csvStr[81] = csvStruct.getPROC_COST_10_NAME();
                 csvStr[82] = csvStruct.getPROC_COST_11_NAME();
                 csvStr[83] = csvStruct.getPROC_COST_12_NAME();
                 csvList.add(csvStr);
                }
                if (csvList != null && !csvList.isEmpty()) {
                 // CsvWriterを生成
                 csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
                 csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
                 struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
                }
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // 画面を初期化
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ツリー表示ボタン押下時に実行される処理です。
	 *
	 */
	public void controlMoveTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlMoveTree");
			//{{user_implement_dev:<controlMoveTree>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlMoveTree>
		logger.exiting("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlMoveTree");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // 「邦貨単位」を取得
                 List mHomeCurList = entity.mM_HOME_CUR.read(conn, struct);
                 // 取得に失敗した場合はエラー
                 if (mHomeCurList.isEmpty()) {
                  throw new ExpjException();
                 } else {
                  DD0010020Struct mHomeCurStruct = (DD0010020Struct) mHomeCurList.get(0);
                  _homeCurUnit = mHomeCurStruct.getHOME_CUR_UNIT();
                 }
              
                 // ログインユーザの工場コードをキーに[原価管理パラメータ]を取得する（画面初期化に使用）
                 struct.setPLANT_CD(sysPLANT_CD);
                 List sysCostCtrlList = entity.mSYS_COST_CTRL.read(conn, struct);
                 // [原価管理パラメータ]が存在しない場合はエラーメッセージを表示
                 if (sysCostCtrlList.isEmpty()) {
                  setErrorMessage("DD00001");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  _mySysCostCtrl = new DD0010020Struct();
                 } else {
                  _mySysCostCtrl = (DD0010020Struct) sysCostCtrlList.get(0);
                 }
              
                 // コンボボックスデータを取得
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _halfTermTypComboStruct = comboBox.getData("HALF_TERM_TYP");
                 comboBox.setConnection(null);
                 // コンボボックスデータの設定
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
              
                 // 画面を初期化
                 initializeAll();
              
                 // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
                 if (isScreenMove() == true) {
                  struct.setPLANT_CD(_plantCd);
                  struct.setYEAR(_year);
                  struct.setHALF_TERM_TYP(_halfTermTyp);
                  struct.setROOT_ITEM_CD(_rootItemCd);
              
                  // 検索のコントロールメソッドを呼び出します。
                  controlSelect();
                 }
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DD0010");
		logger.entering("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                // コンボボックスデータの設定
                struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DD0010020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("MoveTree") ) {
				controlMoveTree();
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
//			throw new FoundationException("DD0010020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DD0010020-E999","CSVの出力処理"));
			throw new FoundationException("DD0010020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DD0010020-E999","システム日付の取得処理"));
				throw new FoundationException("DD0010020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DD0010020-E999","コントロールのイベント処理"));
			throw new FoundationException("DD0010020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected DD0010020Entity entity;
	protected DD0010020Struct struct;
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

		entity = new DD0010020Entity();
		struct = new DD0010020Struct();

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
	 * DD0010020クラスの標準コンストラクタ
	 */
	public DD0010020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                try {
                } catch (MissingResourceException e) {
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
				DD0010020Struct key = (DD0010020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name") && key.getHALF_TERM_TYP_name() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_name", key.getHALF_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val") && key.getHALF_TERM_TYP_val() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_val", key.getHALF_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN") && key.getHALF_TERM_TYP_DN() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_DN", key.getHALF_TERM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_DN") && key.getCOST_TYP_DN() != null) {
					msgKey.setKeyValue("COST_TYP_DN", key.getCOST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP_DN") && key.getPROC_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("PROC_OUTSIDE_TYP_DN", key.getPROC_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_MATR_COST") && key.getTOTAL_MATR_COST() != null) {
					msgKey.setKeyValue("TOTAL_MATR_COST", key.getTOTAL_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_SBCNT_MATR_COST") && key.getTOTAL_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("TOTAL_SBCNT_MATR_COST", key.getTOTAL_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM_ALL") && key.getTOTAL_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_SUM_ALL", key.getTOTAL_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_COST") && key.getTOTAL_COST() != null) {
					msgKey.setKeyValue("TOTAL_COST", key.getTOTAL_COST());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("YEAR") && key.getYEAR() != null) {
					msgKey.setKeyValue("YEAR", key.getYEAR());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP") && key.getHALF_TERM_TYP() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP", key.getHALF_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD") && key.getROOT_ITEM_CD() != null) {
					msgKey.setKeyValue("ROOT_ITEM_CD", key.getROOT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PARENT_ITEM_CD") && key.getl_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("l_PARENT_ITEM_CD", key.getl_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN") && key.getl_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_DN", key.getl_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_OUTSIDE_TYP_DN") && key.getl_PROC_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("l_PROC_OUTSIDE_TYP_DN", key.getl_PROC_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_CLASIFICATION_CD") && key.getl_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("l_CLASIFICATION_CD", key.getl_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CS_PROC_CD") && key.getl_CS_PROC_CD() != null) {
					msgKey.setKeyValue("l_CS_PROC_CD", key.getl_CS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CS_PROC_NAME") && key.getl_CS_PROC_NAME() != null) {
					msgKey.setKeyValue("l_CS_PROC_NAME", key.getl_CS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_NECESSARY_QTY") && key.getl_NECESSARY_QTY() != null) {
					msgKey.setKeyValue("l_NECESSARY_QTY", key.getl_NECESSARY_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT") && key.getl_HOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_HOME_CUR_UNIT", key.getl_HOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_MATR_COST") && key.getl_OWN_MATR_COST() != null) {
					msgKey.setKeyValue("l_OWN_MATR_COST", key.getl_OWN_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_MATR_COST") && key.getl_TOTAL_MATR_COST() != null) {
					msgKey.setKeyValue("l_TOTAL_MATR_COST", key.getl_TOTAL_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_SBCNT_MATR_COST") && key.getl_OWN_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("l_OWN_SBCNT_MATR_COST", key.getl_OWN_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_SBCNT_MATR_COST") && key.getl_TOTAL_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("l_TOTAL_SBCNT_MATR_COST", key.getl_TOTAL_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PROC_COST_SUM_ALL") && key.getl_OWN_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("l_OWN_PROC_COST_SUM_ALL", key.getl_OWN_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_PROC_COST_SUM_ALL") && key.getl_TOTAL_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("l_TOTAL_PROC_COST_SUM_ALL", key.getl_TOTAL_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP") && key.getCOST_TYP() != null) {
					msgKey.setKeyValue("COST_TYP", key.getCOST_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ROOT_ITEM_NAME") && key.getROOT_ITEM_NAME() != null) {
					msgKey.setKeyValue("ROOT_ITEM_NAME", key.getROOT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("COST_STATEMENT_NO") && key.getCOST_STATEMENT_NO() != null) {
					msgKey.setKeyValue("COST_STATEMENT_NO", key.getCOST_STATEMENT_NO());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_NAME") && key.getCS_PROC_NAME() != null) {
					msgKey.setKeyValue("CS_PROC_NAME", key.getCS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("NECESSARY_QTY") && key.getNECESSARY_QTY() != null) {
					msgKey.setKeyValue("NECESSARY_QTY", key.getNECESSARY_QTY());
				}
				if(msgKeyType.containsKeyColumn("PS_INPUT_RATIO") && key.getPS_INPUT_RATIO() != null) {
					msgKey.setKeyValue("PS_INPUT_RATIO", key.getPS_INPUT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_INPUT_RATIO") && key.getITEM_INPUT_RATIO() != null) {
					msgKey.setKeyValue("ITEM_INPUT_RATIO", key.getITEM_INPUT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("OWN_MATR_COST") && key.getOWN_MATR_COST() != null) {
					msgKey.setKeyValue("OWN_MATR_COST", key.getOWN_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("OWN_SBCNT_MATR_COST") && key.getOWN_SBCNT_MATR_COST() != null) {
					msgKey.setKeyValue("OWN_SBCNT_MATR_COST", key.getOWN_SBCNT_MATR_COST());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM_ALL") && key.getOWN_PROC_COST_SUM_ALL() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_SUM_ALL", key.getOWN_PROC_COST_SUM_ALL());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARENT_COST_STATEMENT_NO") && key.getPARENT_COST_STATEMENT_NO() != null) {
					msgKey.setKeyValue("PARENT_COST_STATEMENT_NO", key.getPARENT_COST_STATEMENT_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_STOCK_UNIT") && key.getPARENT_ITEM_STOCK_UNIT() != null) {
					msgKey.setKeyValue("PARENT_ITEM_STOCK_UNIT", key.getPARENT_ITEM_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP") && key.getPROC_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PROC_OUTSIDE_TYP", key.getPROC_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD") && key.getPROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_CD", key.getPROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME") && key.getPROC_COST_CLS_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_NAME", key.getPROC_COST_CLS_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY") && key.getPROC_COST_UNIT_QTY() != null) {
					msgKey.setKeyValue("PROC_COST_UNIT_QTY", key.getPROC_COST_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY_UNIT") && key.getPROC_COST_UNIT_QTY_UNIT() != null) {
					msgKey.setKeyValue("PROC_COST_UNIT_QTY_UNIT", key.getPROC_COST_UNIT_QTY_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_01") && key.getOWN_PROC_COST_01() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_01", key.getOWN_PROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_02") && key.getOWN_PROC_COST_02() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_02", key.getOWN_PROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_03") && key.getOWN_PROC_COST_03() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_03", key.getOWN_PROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_04") && key.getOWN_PROC_COST_04() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_04", key.getOWN_PROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_05") && key.getOWN_PROC_COST_05() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_05", key.getOWN_PROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_06") && key.getOWN_PROC_COST_06() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_06", key.getOWN_PROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_07") && key.getOWN_PROC_COST_07() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_07", key.getOWN_PROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_08") && key.getOWN_PROC_COST_08() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_08", key.getOWN_PROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_09") && key.getOWN_PROC_COST_09() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_09", key.getOWN_PROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_10") && key.getOWN_PROC_COST_10() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_10", key.getOWN_PROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_11") && key.getOWN_PROC_COST_11() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_11", key.getOWN_PROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_12") && key.getOWN_PROC_COST_12() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_12", key.getOWN_PROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM") && key.getOWN_PROC_COST_SUM() != null) {
					msgKey.setKeyValue("OWN_PROC_COST_SUM", key.getOWN_PROC_COST_SUM());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_01") && key.getTOTAL_PROC_COST_01() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_01", key.getTOTAL_PROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_02") && key.getTOTAL_PROC_COST_02() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_02", key.getTOTAL_PROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_03") && key.getTOTAL_PROC_COST_03() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_03", key.getTOTAL_PROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_04") && key.getTOTAL_PROC_COST_04() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_04", key.getTOTAL_PROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_05") && key.getTOTAL_PROC_COST_05() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_05", key.getTOTAL_PROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_06") && key.getTOTAL_PROC_COST_06() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_06", key.getTOTAL_PROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_07") && key.getTOTAL_PROC_COST_07() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_07", key.getTOTAL_PROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_08") && key.getTOTAL_PROC_COST_08() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_08", key.getTOTAL_PROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_09") && key.getTOTAL_PROC_COST_09() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_09", key.getTOTAL_PROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_10") && key.getTOTAL_PROC_COST_10() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_10", key.getTOTAL_PROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_11") && key.getTOTAL_PROC_COST_11() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_11", key.getTOTAL_PROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_12") && key.getTOTAL_PROC_COST_12() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_12", key.getTOTAL_PROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM") && key.getTOTAL_PROC_COST_SUM() != null) {
					msgKey.setKeyValue("TOTAL_PROC_COST_SUM", key.getTOTAL_PROC_COST_SUM());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_01_NAME") && key.getPROC_COST_01_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_01_NAME", key.getPROC_COST_01_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_02_NAME") && key.getPROC_COST_02_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_02_NAME", key.getPROC_COST_02_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_03_NAME") && key.getPROC_COST_03_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_03_NAME", key.getPROC_COST_03_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_04_NAME") && key.getPROC_COST_04_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_04_NAME", key.getPROC_COST_04_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_05_NAME") && key.getPROC_COST_05_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_05_NAME", key.getPROC_COST_05_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_06_NAME") && key.getPROC_COST_06_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_06_NAME", key.getPROC_COST_06_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_07_NAME") && key.getPROC_COST_07_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_07_NAME", key.getPROC_COST_07_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_08_NAME") && key.getPROC_COST_08_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_08_NAME", key.getPROC_COST_08_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_09_NAME") && key.getPROC_COST_09_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_09_NAME", key.getPROC_COST_09_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_10_NAME") && key.getPROC_COST_10_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_10_NAME", key.getPROC_COST_10_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_11_NAME") && key.getPROC_COST_11_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_11_NAME", key.getPROC_COST_11_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_12_NAME") && key.getPROC_COST_12_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_12_NAME", key.getPROC_COST_12_NAME());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_YEAR") && key.getCURRENT_YEAR() != null) {
					msgKey.setKeyValue("CURRENT_YEAR", key.getCURRENT_YEAR());
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
					DD0010020Struct key = new DD0010020Struct();
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name")) {
						key.setHALF_TERM_TYP_name(msgKey.getKeyValue("HALF_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val")) {
						key.setHALF_TERM_TYP_val(msgKey.getKeyValue("HALF_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN")) {
						key.setHALF_TERM_TYP_DN(msgKey.getKeyValue("HALF_TERM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_DN")) {
						key.setCOST_TYP_DN(msgKey.getKeyValue("COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP_DN")) {
						key.setPROC_OUTSIDE_TYP_DN(msgKey.getKeyValue("PROC_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_MATR_COST")) {
						key.setTOTAL_MATR_COST(msgKey.getKeyValue("TOTAL_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_SBCNT_MATR_COST")) {
						key.setTOTAL_SBCNT_MATR_COST(msgKey.getKeyValue("TOTAL_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM_ALL")) {
						key.setTOTAL_PROC_COST_SUM_ALL(msgKey.getKeyValue("TOTAL_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_COST")) {
						key.setTOTAL_COST(msgKey.getKeyValue("TOTAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("YEAR")) {
						key.setYEAR(msgKey.getKeyValue("YEAR"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP")) {
						key.setHALF_TERM_TYP(msgKey.getKeyValue("HALF_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD")) {
						key.setROOT_ITEM_CD(msgKey.getKeyValue("ROOT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PARENT_ITEM_CD")) {
						key.setl_PARENT_ITEM_CD(msgKey.getKeyValue("l_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN")) {
						key.setl_OUTSIDE_TYP_DN(msgKey.getKeyValue("l_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_OUTSIDE_TYP_DN")) {
						key.setl_PROC_OUTSIDE_TYP_DN(msgKey.getKeyValue("l_PROC_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_CLASIFICATION_CD")) {
						key.setl_CLASIFICATION_CD(msgKey.getKeyValue("l_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CS_PROC_CD")) {
						key.setl_CS_PROC_CD(msgKey.getKeyValue("l_CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CS_PROC_NAME")) {
						key.setl_CS_PROC_NAME(msgKey.getKeyValue("l_CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_NECESSARY_QTY")) {
						key.setl_NECESSARY_QTY(msgKey.getKeyValue("l_NECESSARY_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT")) {
						key.setl_HOME_CUR_UNIT(msgKey.getKeyValue("l_HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_MATR_COST")) {
						key.setl_OWN_MATR_COST(msgKey.getKeyValue("l_OWN_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_MATR_COST")) {
						key.setl_TOTAL_MATR_COST(msgKey.getKeyValue("l_TOTAL_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_SBCNT_MATR_COST")) {
						key.setl_OWN_SBCNT_MATR_COST(msgKey.getKeyValue("l_OWN_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_SBCNT_MATR_COST")) {
						key.setl_TOTAL_SBCNT_MATR_COST(msgKey.getKeyValue("l_TOTAL_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PROC_COST_SUM_ALL")) {
						key.setl_OWN_PROC_COST_SUM_ALL(msgKey.getKeyValue("l_OWN_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_PROC_COST_SUM_ALL")) {
						key.setl_TOTAL_PROC_COST_SUM_ALL(msgKey.getKeyValue("l_TOTAL_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP")) {
						key.setCOST_TYP(msgKey.getKeyValue("COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ROOT_ITEM_NAME")) {
						key.setROOT_ITEM_NAME(msgKey.getKeyValue("ROOT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("COST_STATEMENT_NO")) {
						key.setCOST_STATEMENT_NO(msgKey.getKeyValue("COST_STATEMENT_NO"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_NAME")) {
						key.setCS_PROC_NAME(msgKey.getKeyValue("CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NECESSARY_QTY")) {
						key.setNECESSARY_QTY(msgKey.getKeyValue("NECESSARY_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PS_INPUT_RATIO")) {
						key.setPS_INPUT_RATIO(msgKey.getKeyValue("PS_INPUT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_INPUT_RATIO")) {
						key.setITEM_INPUT_RATIO(msgKey.getKeyValue("ITEM_INPUT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("OWN_MATR_COST")) {
						key.setOWN_MATR_COST(msgKey.getKeyValue("OWN_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("OWN_SBCNT_MATR_COST")) {
						key.setOWN_SBCNT_MATR_COST(msgKey.getKeyValue("OWN_SBCNT_MATR_COST"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM_ALL")) {
						key.setOWN_PROC_COST_SUM_ALL(msgKey.getKeyValue("OWN_PROC_COST_SUM_ALL"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_COST_STATEMENT_NO")) {
						key.setPARENT_COST_STATEMENT_NO(msgKey.getKeyValue("PARENT_COST_STATEMENT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_STOCK_UNIT")) {
						key.setPARENT_ITEM_STOCK_UNIT(msgKey.getKeyValue("PARENT_ITEM_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_OUTSIDE_TYP")) {
						key.setPROC_OUTSIDE_TYP(msgKey.getKeyValue("PROC_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD")) {
						key.setPROC_COST_CLS_CD(msgKey.getKeyValue("PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME")) {
						key.setPROC_COST_CLS_NAME(msgKey.getKeyValue("PROC_COST_CLS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY")) {
						key.setPROC_COST_UNIT_QTY(msgKey.getKeyValue("PROC_COST_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY_UNIT")) {
						key.setPROC_COST_UNIT_QTY_UNIT(msgKey.getKeyValue("PROC_COST_UNIT_QTY_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_01")) {
						key.setOWN_PROC_COST_01(msgKey.getKeyValue("OWN_PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_02")) {
						key.setOWN_PROC_COST_02(msgKey.getKeyValue("OWN_PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_03")) {
						key.setOWN_PROC_COST_03(msgKey.getKeyValue("OWN_PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_04")) {
						key.setOWN_PROC_COST_04(msgKey.getKeyValue("OWN_PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_05")) {
						key.setOWN_PROC_COST_05(msgKey.getKeyValue("OWN_PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_06")) {
						key.setOWN_PROC_COST_06(msgKey.getKeyValue("OWN_PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_07")) {
						key.setOWN_PROC_COST_07(msgKey.getKeyValue("OWN_PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_08")) {
						key.setOWN_PROC_COST_08(msgKey.getKeyValue("OWN_PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_09")) {
						key.setOWN_PROC_COST_09(msgKey.getKeyValue("OWN_PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_10")) {
						key.setOWN_PROC_COST_10(msgKey.getKeyValue("OWN_PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_11")) {
						key.setOWN_PROC_COST_11(msgKey.getKeyValue("OWN_PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_12")) {
						key.setOWN_PROC_COST_12(msgKey.getKeyValue("OWN_PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PROC_COST_SUM")) {
						key.setOWN_PROC_COST_SUM(msgKey.getKeyValue("OWN_PROC_COST_SUM"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_01")) {
						key.setTOTAL_PROC_COST_01(msgKey.getKeyValue("TOTAL_PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_02")) {
						key.setTOTAL_PROC_COST_02(msgKey.getKeyValue("TOTAL_PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_03")) {
						key.setTOTAL_PROC_COST_03(msgKey.getKeyValue("TOTAL_PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_04")) {
						key.setTOTAL_PROC_COST_04(msgKey.getKeyValue("TOTAL_PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_05")) {
						key.setTOTAL_PROC_COST_05(msgKey.getKeyValue("TOTAL_PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_06")) {
						key.setTOTAL_PROC_COST_06(msgKey.getKeyValue("TOTAL_PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_07")) {
						key.setTOTAL_PROC_COST_07(msgKey.getKeyValue("TOTAL_PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_08")) {
						key.setTOTAL_PROC_COST_08(msgKey.getKeyValue("TOTAL_PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_09")) {
						key.setTOTAL_PROC_COST_09(msgKey.getKeyValue("TOTAL_PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_10")) {
						key.setTOTAL_PROC_COST_10(msgKey.getKeyValue("TOTAL_PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_11")) {
						key.setTOTAL_PROC_COST_11(msgKey.getKeyValue("TOTAL_PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_12")) {
						key.setTOTAL_PROC_COST_12(msgKey.getKeyValue("TOTAL_PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PROC_COST_SUM")) {
						key.setTOTAL_PROC_COST_SUM(msgKey.getKeyValue("TOTAL_PROC_COST_SUM"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_01_NAME")) {
						key.setPROC_COST_01_NAME(msgKey.getKeyValue("PROC_COST_01_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_02_NAME")) {
						key.setPROC_COST_02_NAME(msgKey.getKeyValue("PROC_COST_02_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_03_NAME")) {
						key.setPROC_COST_03_NAME(msgKey.getKeyValue("PROC_COST_03_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_04_NAME")) {
						key.setPROC_COST_04_NAME(msgKey.getKeyValue("PROC_COST_04_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_05_NAME")) {
						key.setPROC_COST_05_NAME(msgKey.getKeyValue("PROC_COST_05_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_06_NAME")) {
						key.setPROC_COST_06_NAME(msgKey.getKeyValue("PROC_COST_06_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_07_NAME")) {
						key.setPROC_COST_07_NAME(msgKey.getKeyValue("PROC_COST_07_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_08_NAME")) {
						key.setPROC_COST_08_NAME(msgKey.getKeyValue("PROC_COST_08_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_09_NAME")) {
						key.setPROC_COST_09_NAME(msgKey.getKeyValue("PROC_COST_09_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_10_NAME")) {
						key.setPROC_COST_10_NAME(msgKey.getKeyValue("PROC_COST_10_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_11_NAME")) {
						key.setPROC_COST_11_NAME(msgKey.getKeyValue("PROC_COST_11_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_12_NAME")) {
						key.setPROC_COST_12_NAME(msgKey.getKeyValue("PROC_COST_12_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_YEAR")) {
						key.setCURRENT_YEAR(msgKey.getKeyValue("CURRENT_YEAR"));
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
