/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DB0100/src/com/nec/jp/orteus/metamorBase/DB0100/DB0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DB0100;

import com.nec.jp.orteus.metamorBase.DB0100.*;
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

public class DB0100010Control
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
        public DB0100010Struct getListvalue(int x) {
         return (DB0100010Struct) (this.list.get(x));
        } // リストの値を返します。
        public DB0100010Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public DB0100010Struct createStruct() {
         return new DB0100010Struct();
        } // 新しいStructを作って返します。
        public void setStruct(Object structname) {
         this.struct.setStruct((DB0100010Struct) structname);
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
        /** ｢原価種別｣コンボボックスデータ */
        private ComboStruct _costTypComboStruct = new ComboStruct();
       
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
        private void setStruct(DB0100010Struct s) {
         struct.setDB0010B001_0_COUNT(s.getDB0010B001_0_COUNT());
         struct.setDB0010B001_1_COUNT(s.getDB0010B001_1_COUNT());
         struct.setDB0020B001_0_COUNT(s.getDB0020B001_0_COUNT());
         struct.setDB0020B001_1_COUNT(s.getDB0020B001_1_COUNT());
         struct.setDB0030B001_0_COUNT(s.getDB0030B001_0_COUNT());
         struct.setDB0030B001_1_COUNT(s.getDB0030B001_1_COUNT());
         struct.setDB0040B001_0_COUNT(s.getDB0040B001_0_COUNT());
         struct.setDB0040B001_1_COUNT(s.getDB0040B001_1_COUNT());
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setCOST_TYP("1");
         struct.setCREATED_BY(null);
       
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setDB0010B001_0_COUNT("0");
         struct.setDB0010B001_1_COUNT("0");
         struct.setDB0020B001_0_COUNT("0");
         struct.setDB0020B001_1_COUNT("0");
         struct.setDB0030B001_0_COUNT("0");
         struct.setDB0030B001_1_COUNT("0");
         struct.setDB0040B001_0_COUNT("0");
         struct.setDB0040B001_1_COUNT("0");
         struct.setc_DB0010B001("true");
         struct.setc_DB0020B001("true");
         struct.setc_DB0030B001("true");
         struct.setc_DB0040B001("true");
         struct.setc_ReOut(null);
       
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // キー以外の項目を初期化
                 initializeDetail();
              
                 // キーに対する名称項目を検索
                 // 工場名
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DB0100010Struct mPlantStruct = (DB0100010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // ユーザ名
                 if (struct.getCREATED_BY() != null && struct.getCREATED_BY().length() != 0) {
                  List userMstList = entity.mUSER_MST.read(conn, struct);
                  if (userMstList.isEmpty()) {
                   // ユーザ名は取得できない場合にエラーにしない
                   struct.setUSER_NAME(null);
                  } else {
                   DB0100010Struct userMstStruct = (DB0100010Struct) userMstList.get(0);
                   struct.setUSER_NAME(userMstStruct.getUSER_NAME());
                  }
                 } else {
                  struct.setUSER_NAME(null);
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
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
              
                 // データを取得
                 DB0100010Struct formStruct = (DB0100010Struct) formList.get(0);
              
                 // データ取得SQLの構造上必ず1件取れるはずなので
                 // 全てのレコード件数が0の場合に対象データ無しエラーにする
                 if (Calculate.compare(formStruct.getDB0010B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0010B001_1_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0020B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0020B001_1_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0030B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0030B001_1_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0040B001_0_COUNT(), "0") == 0
                  && Calculate.compare(formStruct.getDB0040B001_1_COUNT(), "0") == 0) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
              
                 // 画面に表示
                 setStruct(formStruct);
              
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			DB0100010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                try {
              
                 // 帳票用データを再検索
                 if ("true".equals(struct.getc_ReOut())) {
                  struct.setLIST_ISS_FLG(null);
                 } else {
                  struct.setLIST_ISS_FLG("0");
                 }
              
                 if ("true".equals(struct.getc_DB0010B001())) {
                  struct.setCREATED_PRG_NM_1("DB0010");
                 } else {
                  struct.setCREATED_PRG_NM_1(null);
                 }
                 if ("true".equals(struct.getc_DB0020B001())) {
                  struct.setCREATED_PRG_NM_2("DB0020");
                 } else {
                  struct.setCREATED_PRG_NM_2(null);
                 }
                 if ("true".equals(struct.getc_DB0030B001())) {
                  struct.setCREATED_PRG_NM_3("DB0030");
                 } else {
                  struct.setCREATED_PRG_NM_3(null);
                 }
                 if ("true".equals(struct.getc_DB0040B001())) {
                  struct.setCREATED_PRG_NM_4("DB0040");
                 } else {
                  struct.setCREATED_PRG_NM_4(null);
                 }
              
                 list = entity.mPdf.read(conn, struct);
                 if (list.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
                 struct.setDOWNLOAD_FILE(null);	// ダウンロードファイル名クリア
                 String printId1 = "DB01000101"; // 帳票IDを指定してください
                
                 ret = svf.VrInit(printId1); // PDF作成開始
                 pdfFilePath = svf.getPdfFilePath(); // pdfフルパスファイル名
                 pdfFileName = svf.getPdfFileName(); // pdfファイル名（Web用）
                 // クエリーファイルの指定 
     			if (dbKIND != null && !dbKIND.equals("")) {
     				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
     						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
     			} else {
     				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
     						+ dbDBQ);
     			}

     			// 「帳票出力」ボタンが押下された場合
     			//工場コード取得
     			 ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getPLANT_CD(),4);
     			 //原価種別取得
     			 ret = svf.VrCondition("[X|COST_TYP]=" + struct.getCOST_TYP(),4);
     			 //実行ユーザコード取得
     			 if("".equals(struct.getCREATED_BY())||struct.getCREATED_BY()==null){
     				ret = svf.VrCondition("[X|CREATED_BY]=" + "%",4);
     			 }else{
     			 ret = svf.VrCondition("[X|CREATED_BY]=" + struct.getCREATED_BY(),4);
     			 }
     			 //リスト出力済フラグ取得
     			 if("true".equals(struct.getc_ReOut())){
     				ret = svf.VrCondition("[X|LIST_ISS_FLG]=" + "%",4);
     			 }else{
     				ret = svf.VrCondition("[X|LIST_ISS_FLG]=" + "0",4);
     			 }
     			 
     			 //作成プログラム名取得
     			if ("".equals(struct.getCREATED_PRG_NM_1())|| struct.getCREATED_PRG_NM_1() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_1]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_1]=" + (struct.getCREATED_PRG_NM_1()+ "%"), 4);
    			}
     			if ("".equals(struct.getCREATED_PRG_NM_2())|| struct.getCREATED_PRG_NM_2() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_2]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_2]=" + (struct.getCREATED_PRG_NM_2()+ "%"), 4);
    			}
     			if ("".equals(struct.getCREATED_PRG_NM_3())|| struct.getCREATED_PRG_NM_3() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_3]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_3]=" + (struct.getCREATED_PRG_NM_3()+ "%"), 4);
    			}
     			if ("".equals(struct.getCREATED_PRG_NM_4())|| struct.getCREATED_PRG_NM_4() == null) {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_4]=" + "ZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZZ", 4);
    			} else {
    				ret = svf.VrCondition("[X|CREATED_PRG_NM_4]=" + (struct.getCREATED_PRG_NM_4()+ "%"), 4);
    			}
    			//更新処理
                entity.mT_CS_ERROR.update(conn, struct);
     			// クエリー実行 
    			ret = svf.VrReport();
    			if (ret == -554) {
    				ExpjMessage emsg = new ExpjMessage("ZZ06001");
    				msgStruct.addError(emsg);
    				sysLog.warning(emsg, sysUSER_CD);
    				return;
    			}  			
    			 //PDF作成終了 
    			ret = svf.VrQuit();
    			if ("0".equals(printType)) { // クライアント印刷の場合
    				struct.setDOWNLOAD_FILE(getPdfFileName());
    			} else if ("1".equals(printType)) {
    				try {
    					String acrobatPath = svf.getAcrobatPath();
    					String acrobatOption1 = svf.getAcrobatOption1();
    					String acrobatOption2 = svf.getAcrobatOption2();
    					String pdfPrinter = svf.getPrinter();
    					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
    					//Runtime.getRuntime().exec(svf.getExecuteOutput());
    				} catch (IOException e) {
    					// サーバ印刷失敗時のエラー処理を記述してください。
    				}
    			}
                 controlSelect();
              
                 conn.commit();
                 
                } catch (Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD()); //致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlPrint>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * 出力済削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlIssDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlIssDelete");
			//{{user_implement_dev:<controlIssDelete>
                try {
                 if ("true".equals(struct.getc_DB0010B001())) {
                  struct.setCREATED_PRG_NM_1("DB0010");
                 } else {
                  struct.setCREATED_PRG_NM_1(null);
                 }
                 if ("true".equals(struct.getc_DB0020B001())) {
                  struct.setCREATED_PRG_NM_2("DB0020");
                 } else {
                  struct.setCREATED_PRG_NM_2(null);
                 }
                 if ("true".equals(struct.getc_DB0030B001())) {
                  struct.setCREATED_PRG_NM_3("DB0030");
                 } else {
                  struct.setCREATED_PRG_NM_3(null);
                 }
                 if ("true".equals(struct.getc_DB0040B001())) {
                  struct.setCREATED_PRG_NM_4("DB0040");
                 } else {
                  struct.setCREATED_PRG_NM_4(null);
                 }
              
                 List tCsErrorList = entity.mT_CS_ERROR.read(conn, struct);
                 if (tCsErrorList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_CS_ERROR", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("T_CS_ERROR", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("T_CS_ERROR", "CREATED_BY", struct.getCREATED_BY());
                  return;
                 }
              
                 for (Iterator i = tCsErrorList.iterator(); i.hasNext();) {
                  DB0100010Struct tCsErrorStruct = (DB0100010Struct) i.next();
                  struct.setCS_ERROR_CD(tCsErrorStruct.getCS_ERROR_CD());
                  entity.mT_CS_ERROR.delete(conn, struct);
                 }
              
                 conn.commit();
              
                 initializeAll();
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlIssDelete>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlIssDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // コンボボックスデータを取得
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _costTypComboStruct = comboBox.getData("COST_TYP");
                 comboBox.setConnection(null);
                 // コンボボックスデータの設定
                 struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                 struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
              
                 // 画面を初期化
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DB0100");
		logger.entering("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DB0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("IssDelete") ) {
				controlIssDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
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
//			throw new FoundationException("DB0100010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DB0100010-E999","CSVの出力処理"));
			throw new FoundationException("DB0100010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DB0100010-E999","システム日付の取得処理"));
				throw new FoundationException("DB0100010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DB0100010-E999","コントロールのイベント処理"));
			throw new FoundationException("DB0100010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected DB0100010Entity entity;
	protected DB0100010Struct struct;
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

		entity = new DB0100010Entity();
		struct = new DB0100010Struct();

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
	 * DB0100010クラスの標準コンストラクタ
	 */
	public DB0100010Control() throws BusinessProcessException, FoundationException
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
				DB0100010Struct key = (DB0100010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("COST_TYP_name") && key.getCOST_TYP_name() != null) {
					msgKey.setKeyValue("COST_TYP_name", key.getCOST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_val") && key.getCOST_TYP_val() != null) {
					msgKey.setKeyValue("COST_TYP_val", key.getCOST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c_DB0010B001") && key.getc_DB0010B001() != null) {
					msgKey.setKeyValue("c_DB0010B001", key.getc_DB0010B001());
				}
				if(msgKeyType.containsKeyColumn("c_DB0020B001") && key.getc_DB0020B001() != null) {
					msgKey.setKeyValue("c_DB0020B001", key.getc_DB0020B001());
				}
				if(msgKeyType.containsKeyColumn("c_DB0030B001") && key.getc_DB0030B001() != null) {
					msgKey.setKeyValue("c_DB0030B001", key.getc_DB0030B001());
				}
				if(msgKeyType.containsKeyColumn("c_DB0040B001") && key.getc_DB0040B001() != null) {
					msgKey.setKeyValue("c_DB0040B001", key.getc_DB0040B001());
				}
				if(msgKeyType.containsKeyColumn("c_ReOut") && key.getc_ReOut() != null) {
					msgKey.setKeyValue("c_ReOut", key.getc_ReOut());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("DB0010B001_0_COUNT") && key.getDB0010B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0010B001_0_COUNT", key.getDB0010B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0010B001_1_COUNT") && key.getDB0010B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0010B001_1_COUNT", key.getDB0010B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0020B001_0_COUNT") && key.getDB0020B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0020B001_0_COUNT", key.getDB0020B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0020B001_1_COUNT") && key.getDB0020B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0020B001_1_COUNT", key.getDB0020B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0030B001_0_COUNT") && key.getDB0030B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0030B001_0_COUNT", key.getDB0030B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0030B001_1_COUNT") && key.getDB0030B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0030B001_1_COUNT", key.getDB0030B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0040B001_0_COUNT") && key.getDB0040B001_0_COUNT() != null) {
					msgKey.setKeyValue("DB0040B001_0_COUNT", key.getDB0040B001_0_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DB0040B001_1_COUNT") && key.getDB0040B001_1_COUNT() != null) {
					msgKey.setKeyValue("DB0040B001_1_COUNT", key.getDB0040B001_1_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP") && key.getCOST_TYP() != null) {
					msgKey.setKeyValue("COST_TYP", key.getCOST_TYP());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_CD") && key.getPROGRAM_CD() != null) {
					msgKey.setKeyValue("PROGRAM_CD", key.getPROGRAM_CD());
				}
				if(msgKeyType.containsKeyColumn("PROGRAM_NAME") && key.getPROGRAM_NAME() != null) {
					msgKey.setKeyValue("PROGRAM_NAME", key.getPROGRAM_NAME());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_DN") && key.getCOST_TYP_DN() != null) {
					msgKey.setKeyValue("COST_TYP_DN", key.getCOST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("CS_ERROR_CD") && key.getCS_ERROR_CD() != null) {
					msgKey.setKeyValue("CS_ERROR_CD", key.getCS_ERROR_CD());
				}
				if(msgKeyType.containsKeyColumn("BATCH_TYP_DN") && key.getBATCH_TYP_DN() != null) {
					msgKey.setKeyValue("BATCH_TYP_DN", key.getBATCH_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD") && key.getPROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_CD", key.getPROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("EFFECTIVE_START_DATE") && key.getEFFECTIVE_START_DATE() != null) {
					msgKey.setKeyValue("EFFECTIVE_START_DATE", key.getEFFECTIVE_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("TRANSACTION_TYP_DN") && key.getTRANSACTION_TYP_DN() != null) {
					msgKey.setKeyValue("TRANSACTION_TYP_DN", key.getTRANSACTION_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MESSAGE_CD") && key.getMESSAGE_CD() != null) {
					msgKey.setKeyValue("MESSAGE_CD", key.getMESSAGE_CD());
				}
				if(msgKeyType.containsKeyColumn("MESSAGE") && key.getMESSAGE() != null) {
					msgKey.setKeyValue("MESSAGE", key.getMESSAGE());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("LIST_ISS_FLG") && key.getLIST_ISS_FLG() != null) {
					msgKey.setKeyValue("LIST_ISS_FLG", key.getLIST_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_1") && key.getCREATED_PRG_NM_1() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_1", key.getCREATED_PRG_NM_1());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_2") && key.getCREATED_PRG_NM_2() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_2", key.getCREATED_PRG_NM_2());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_3") && key.getCREATED_PRG_NM_3() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_3", key.getCREATED_PRG_NM_3());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_4") && key.getCREATED_PRG_NM_4() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM_4", key.getCREATED_PRG_NM_4());
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
					DB0100010Struct key = new DB0100010Struct();
					if(msgKeyType.containsKeyColumn("COST_TYP_name")) {
						key.setCOST_TYP_name(msgKey.getKeyValue("COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_val")) {
						key.setCOST_TYP_val(msgKey.getKeyValue("COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0010B001")) {
						key.setc_DB0010B001(msgKey.getKeyValue("c_DB0010B001"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0020B001")) {
						key.setc_DB0020B001(msgKey.getKeyValue("c_DB0020B001"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0030B001")) {
						key.setc_DB0030B001(msgKey.getKeyValue("c_DB0030B001"));
					}
					if(msgKeyType.containsKeyColumn("c_DB0040B001")) {
						key.setc_DB0040B001(msgKey.getKeyValue("c_DB0040B001"));
					}
					if(msgKeyType.containsKeyColumn("c_ReOut")) {
						key.setc_ReOut(msgKey.getKeyValue("c_ReOut"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("DB0010B001_0_COUNT")) {
						key.setDB0010B001_0_COUNT(msgKey.getKeyValue("DB0010B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0010B001_1_COUNT")) {
						key.setDB0010B001_1_COUNT(msgKey.getKeyValue("DB0010B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0020B001_0_COUNT")) {
						key.setDB0020B001_0_COUNT(msgKey.getKeyValue("DB0020B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0020B001_1_COUNT")) {
						key.setDB0020B001_1_COUNT(msgKey.getKeyValue("DB0020B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0030B001_0_COUNT")) {
						key.setDB0030B001_0_COUNT(msgKey.getKeyValue("DB0030B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0030B001_1_COUNT")) {
						key.setDB0030B001_1_COUNT(msgKey.getKeyValue("DB0030B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0040B001_0_COUNT")) {
						key.setDB0040B001_0_COUNT(msgKey.getKeyValue("DB0040B001_0_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DB0040B001_1_COUNT")) {
						key.setDB0040B001_1_COUNT(msgKey.getKeyValue("DB0040B001_1_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP")) {
						key.setCOST_TYP(msgKey.getKeyValue("COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_CD")) {
						key.setPROGRAM_CD(msgKey.getKeyValue("PROGRAM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAM_NAME")) {
						key.setPROGRAM_NAME(msgKey.getKeyValue("PROGRAM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_DN")) {
						key.setCOST_TYP_DN(msgKey.getKeyValue("COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("CS_ERROR_CD")) {
						key.setCS_ERROR_CD(msgKey.getKeyValue("CS_ERROR_CD"));
					}
					if(msgKeyType.containsKeyColumn("BATCH_TYP_DN")) {
						key.setBATCH_TYP_DN(msgKey.getKeyValue("BATCH_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD")) {
						key.setPROC_COST_CLS_CD(msgKey.getKeyValue("PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("EFFECTIVE_START_DATE")) {
						key.setEFFECTIVE_START_DATE(msgKey.getKeyValue("EFFECTIVE_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TRANSACTION_TYP_DN")) {
						key.setTRANSACTION_TYP_DN(msgKey.getKeyValue("TRANSACTION_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MESSAGE_CD")) {
						key.setMESSAGE_CD(msgKey.getKeyValue("MESSAGE_CD"));
					}
					if(msgKeyType.containsKeyColumn("MESSAGE")) {
						key.setMESSAGE(msgKey.getKeyValue("MESSAGE"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("LIST_ISS_FLG")) {
						key.setLIST_ISS_FLG(msgKey.getKeyValue("LIST_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_1")) {
						key.setCREATED_PRG_NM_1(msgKey.getKeyValue("CREATED_PRG_NM_1"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_2")) {
						key.setCREATED_PRG_NM_2(msgKey.getKeyValue("CREATED_PRG_NM_2"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_3")) {
						key.setCREATED_PRG_NM_3(msgKey.getKeyValue("CREATED_PRG_NM_3"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM_4")) {
						key.setCREATED_PRG_NM_4(msgKey.getKeyValue("CREATED_PRG_NM_4"));
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
