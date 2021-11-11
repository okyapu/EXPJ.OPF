/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0040/src/com/nec/jp/orteus/metamorBase/DA0040/DA0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0040;

import com.nec.jp.orteus.metamorBase.DA0040.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class DA0040010Control
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
        public DA0040010Struct getListvalue(int x) {
         return (DA0040010Struct) (this.list.get(x));
        } // リストの値を返します。
        public DA0040010Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public DA0040010Struct createStruct() {
         return new DA0040010Struct();
        } // 新しいStructを作って返します。
        public void setStruct(Object structname) {
         this.struct.setStruct((DA0040010Struct) structname);
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
        private DA0040010Struct _mySysCostCtrl;
       
        /** ｢半期区分｣コンボボックスデータ */
        private ComboStruct _halfTermTypComboStruct = new ComboStruct();
        /** ｢原価種別｣コンボボックスデータ */
        private ComboStruct _costTypComboStruct = new ComboStruct();
        /** ｢有償支給フラグ｣コンボボックスデータ */
        private ComboStruct _onerousConsFlgComboStruct = new ComboStruct();
       
        /** 次に遷移する画面のURL */
        private String _nextUrl;
       
        /** 子画面で行う操作 */
        private String operationMode;
        /** 子画面の操作が登録であることを表す定数 */
        static final private String INSERT = "INSERT";
        /** 子画面の操作が更新であることを表す定数 */
        static final private String UPDATE = "UPDATE";
       
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
         param.append(".");
         param.append(columnName);
         param.append(":");
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * 次に遷移する画面のURLを取得します。
         */
        public String getNextUrl() {
         return _nextUrl;
        }
        /**
         * 次に遷移する画面のURLを設定します。
         */
        public void setNextUrl(String url) {
         _nextUrl = url;
        }
       
        /**
         * 子画面で行う作業モードを返します。
         * @return 作業モード（INSERT/UPDATE）
         */
        public String getOperationMode() {
         return operationMode;
        }
       
        /**
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStruct(DA0040010Struct s) {
        }
       
        /**
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStructSub1(DA0040010Struct s) {
         struct.setITEM_CD(s.getITEM_CD());
         struct.setITEM_NAME(s.getITEM_NAME());
         struct.setPROC_COST_CLS_CD(s.getPROC_COST_CLS_CD());
         struct.setPROC_COST_CLS_NAME(s.getPROC_COST_CLS_NAME());
         struct.setPROC_COST_UNIT_QTY(s.getPROC_COST_UNIT_QTY());
         struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
         struct.setCLASIFICATION_CD(s.getCLASIFICATION_CD());
         struct.setONEROUS_CONS_FLG(s.getONEROUS_CONS_FLG());
         struct.setPROC_COST_01(s.getPROC_COST_01());
         struct.setPROC_COST_02(s.getPROC_COST_02());
         struct.setPROC_COST_03(s.getPROC_COST_03());
         struct.setPROC_COST_04(s.getPROC_COST_04());
         struct.setPROC_COST_05(s.getPROC_COST_05());
         struct.setPROC_COST_06(s.getPROC_COST_06());
         struct.setPROC_COST_07(s.getPROC_COST_07());
         struct.setPROC_COST_08(s.getPROC_COST_08());
         struct.setPROC_COST_09(s.getPROC_COST_09());
         struct.setPROC_COST_10(s.getPROC_COST_10());
         struct.setPROC_COST_11(s.getPROC_COST_11());
         struct.setPROC_COST_12(s.getPROC_COST_12());
         struct.setPROC_COST_SUM(s.getPROC_COST_SUM());
         struct.setHOME_CUR_UNIT(_homeCurUnit);
         struct.setPROC_COST_01_NAME(s.getPROC_COST_01_NAME());
         struct.setPROC_COST_02_NAME(s.getPROC_COST_02_NAME());
         struct.setPROC_COST_03_NAME(s.getPROC_COST_03_NAME());
         struct.setPROC_COST_04_NAME(s.getPROC_COST_04_NAME());
         struct.setPROC_COST_05_NAME(s.getPROC_COST_05_NAME());
         struct.setPROC_COST_06_NAME(s.getPROC_COST_06_NAME());
         struct.setPROC_COST_07_NAME(s.getPROC_COST_07_NAME());
         struct.setPROC_COST_08_NAME(s.getPROC_COST_08_NAME());
         struct.setPROC_COST_09_NAME(s.getPROC_COST_09_NAME());
         struct.setPROC_COST_10_NAME(s.getPROC_COST_10_NAME());
         struct.setPROC_COST_11_NAME(s.getPROC_COST_11_NAME());
         struct.setPROC_COST_12_NAME(s.getPROC_COST_12_NAME());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
       
         struct.setc_NoCheckClasificationCd("true");
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setCS_PROC_CD(null);
         struct.setYEAR(_mySysCostCtrl.getCURRENT_YEAR());
         struct.setHALF_TERM_TYP(_mySysCostCtrl.getHALF_TERM_TYP());
         struct.setCOST_TYP("1");
       
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetail() {
         struct.setPLANT_NAME(null);
         struct.setCS_PROC_NAME(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetailSub1() {
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setPROC_COST_CLS_CD(null);
         struct.setPROC_COST_CLS_NAME(null);
         struct.setCLASIFICATION_CD(null);
         struct.setONEROUS_CONS_FLG(null);
         struct.setPROC_COST_UNIT_QTY(null);
         struct.setSTOCK_UNIT(null);
         struct.setPROC_COST_01(null);
         struct.setPROC_COST_02(null);
         struct.setPROC_COST_03(null);
         struct.setPROC_COST_04(null);
         struct.setPROC_COST_05(null);
         struct.setPROC_COST_06(null);
         struct.setPROC_COST_07(null);
         struct.setPROC_COST_08(null);
         struct.setPROC_COST_09(null);
         struct.setPROC_COST_10(null);
         struct.setPROC_COST_11(null);
         struct.setPROC_COST_12(null);
         struct.setPROC_COST_SUM(null);
         struct.setHOME_CUR_UNIT(_homeCurUnit);
         struct.setPROC_COST_01_NAME(null);
         struct.setPROC_COST_02_NAME(null);
         struct.setPROC_COST_03_NAME(null);
         struct.setPROC_COST_04_NAME(null);
         struct.setPROC_COST_05_NAME(null);
         struct.setPROC_COST_06_NAME(null);
         struct.setPROC_COST_07_NAME(null);
         struct.setPROC_COST_08_NAME(null);
         struct.setPROC_COST_09_NAME(null);
         struct.setPROC_COST_10_NAME(null);
         struct.setPROC_COST_11_NAME(null);
         struct.setPROC_COST_12_NAME(null);
         struct.setMODIFY_COUNT(null);
       
         struct.setc_NoCheckClasificationCd("true");
       
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
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
                  DA0040010Struct mPlantStruct = (DA0040010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // 半期区分表示名
                 int halfTermTypIndex =
                  _halfTermTypComboStruct.getValList().indexOf(struct.getHALF_TERM_TYP());
                 struct.setHALF_TERM_TYP_DN(
                  (String) _halfTermTypComboStruct.getExplanList().get(halfTermTypIndex));
                 // 原価種別表示名
                 int costTypIndex = _costTypComboStruct.getValList().indexOf(struct.getCOST_TYP());
                 struct.setCOST_TYP_DN((String) _costTypComboStruct.getExplanList().get(costTypIndex));
                 // 工程名
                 List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                 if (mCsProcList.isEmpty()) {
                  setErrorMessage("DA00001");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  struct.setCS_PROC_NAME(null);
                 } else {
                  DA0040010Struct mCsProcStruct = (DA0040010Struct) mCsProcList.get(0);
                  struct.setCS_PROC_NAME(mCsProcStruct.getCS_PROC_NAME());
                 }
                //ワイルドカード指定項目の設定
                //品目番号
                if(struct.getIN_ITEM_CD() == null || "".equals(struct.getIN_ITEM_CD())){
                	struct.setIN_ITEM_CD("%");
                }
                	
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
                 int maxLine = sp.getMaxLine(conn, 10);
     			 if(maxLine != 0) {
     				struct.setROW_COUNT(String.valueOf(maxLine));
     			 } else {
     				struct.setROW_COUNT(null);
     			 }
     			 List viewList = entity.mViewCnt.read(conn, struct);
     			 long rowCount = Long.parseLong(((DA0040010Struct)viewList.get(0)).getl_COUNT());
     			 // 一覧データが0件の場合
                 if (rowCount==0) {
                	setErrorMessage("ZZ06001");
                    readStatus = NOT_FOUND;
                    return;
                 }
                 // 最大表示行数チェック
                 if ((maxLine != 0) && (rowCount == maxLine + 1)) {
                    setErrorMessage("ZZ01115", "" + maxLine);
                    setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                    setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                    setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                    setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                    setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                    readStatus = TOO_MANY;
                    return;
                 }
     			 // 一覧情報を取得
                 viewList = entity.mView.read(conn, struct);
              
                 if("%".equals(struct.getIN_ITEM_CD())){
                 	struct.setIN_ITEM_CD(null);
                 }
                 // 画面に表示
                 setList(viewList);
                 DA0040010Struct TempStruct;
                 for (int i = 0; i < list.size(); i++) {
			     TempStruct = (DA0040010Struct)list.get(i);
    			 TempStruct.setl_ONEROUS_CONS_FLG_DN(this.multcombo("ONEROUS_CONS_FLG",TempStruct.getl_ONEROUS_CONS_FLG_DN()));
			    }
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
                initializeDetailSub1();
              
                readStatus = NORMAL;
              
                operationMode = INSERT;
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
                try {
                 initializeDetailSub1();
              
                 struct.setITEM_CD(struct.getl_ITEM_CD());
                 struct.setPROC_COST_CLS_CD(struct.getl_PROC_COST_CLS_CD());
              
                 // データを取得
                 List formList = entity.mFormSub1.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
              
                  readStatus = ERROR;
                  return;
                 }
                 DA0040010Struct formStruct = (DA0040010Struct) formList.get(0);
              
                 setStructSub1(formStruct);
              
                 readStatus = NORMAL;
              
                 operationMode = UPDATE;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
                try {
                 initializeDetailSub1();
              
                 struct.setITEM_CD(struct.getl_ITEM_CD());
                 struct.setPROC_COST_CLS_CD(struct.getl_PROC_COST_CLS_CD());
              
                 // データを取得
                 List formList = entity.mFormSub1.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
              
                  readStatus = ERROR;
                  return;
                 }
                 DA0040010Struct formStruct = (DA0040010Struct) formList.get(0);
              
                 setStructSub1(formStruct);
              
                 readStatus = NORMAL;
              
                 operationMode = INSERT;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
                try {
                 struct.setITEM_CD(struct.getl_ITEM_CD());
                 struct.setPROC_COST_CLS_CD(struct.getl_PROC_COST_CLS_CD());
              
                 // マスタ情報検索
                 List lockedList = entity.mM_ITEM_PROC_COST_Lock.read(conn, struct);
                 // 削除するキーが存在しない場合はエラー。
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  return;
                 }
                 // 読み込み時の[通貨]."更新数"と異なる場合はエラー
                 DA0040010Struct lockedStruct = (DA0040010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getl_MODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_ITEM_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  return;
                 }
              
                 // 削除処理実行
                 entity.mM_ITEM_PROC_COST.delete(conn, struct);
                 // 画面を初期化
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // 画面を初期化
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // 登録するキーで[品目別加工費マスタ]を検索
                 List mItemProcCostList = entity.mM_ITEM_PROC_COST.read(conn, struct);
                 // 登録データがすでに存在する場合はエラー
                 if (!mItemProcCostList.isEmpty()) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
                 // 登録データがすでに他工程で登録されている場合はエラー
                 List mItemProcCostOtherProcList = entity.mM_ITEM_PROC_COST_OtherProc.read(conn, struct);
                 if (!mItemProcCostOtherProcList.isEmpty()) {
                  setErrorMessage("DA04001");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // [工場マスタ]存在チェック
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [工程マスタ]存在チェック
                 List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                 if (mCsProcList.isEmpty()) {
                  setErrorMessage("DA00001");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                 } else {
                  // [工程マスタ]."削除フラグ"=1の場合はエラー
                  DA0040010Struct mCsProcStruct = (DA0040010Struct) mCsProcList.get(0);
                  if ("1".equals(mCsProcStruct.getDEL_FLG())) {
                   setErrorMessage("DA04002");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // [加工費分類マスタ]存在チェック
                 List mProcCostClsList = entity.mM_PROC_COST_CLS.read(conn, struct);
                 if (mProcCostClsList.isEmpty()) {
                  setErrorMessage("DA00009");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 }
                 // [加工費マスタ]存在チェック
                 List mProcCostList = entity.mM_PROC_COST.read(conn, struct);
                 if (mProcCostList.isEmpty()) {
                  setErrorMessage("DA00003");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 } else {
                  // [加工費マスタ]."削除フラグ"=1の場合はエラー
                  DA0040010Struct mProcCostStruct = (DA0040010Struct) mProcCostList.get(0);
                  if ("1".equals(mProcCostStruct.getDEL_FLG())) {
                   setErrorMessage("DA04003");
                   setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                   setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                   setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                   setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                   setErrorParameter(
                    "M_PROC_COST",
                    "PROC_COST_CLS_CD",
                    struct.getPROC_COST_CLS_CD());
                  }
                 }
                 // [品目マスタ]存在チェック
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 } else {
                  DA0040010Struct mItemStruct = (DA0040010Struct) mItemList.get(0);
              
                  // ｢品目管理コード｣のNULLチェックを行う
                  if (struct.getCLASIFICATION_CD() == null
                   || struct.getCLASIFICATION_CD().length() == 0) {
                   // ｢品目管理コード｣=NULLの場合、[品目]."管理コード"を設定する。
                   struct.setCLASIFICATION_CD(mItemStruct.getCLASIFICATION_CD());
                  } else {
                   // ｢品目管理コード｣!=NULLの場合かつ、｢品目情報と比較しない｣=offの場合
                   if (!"true".equals(struct.getc_NoCheckClasificationCd())) {
                    // ｢品目管理コード｣!=[品目]."管理コード"の場合はエラー
                    if (!struct
                     .getCLASIFICATION_CD()
                     .equals(mItemStruct.getCLASIFICATION_CD())) {
                     setErrorMessage("DA04004");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
                 }
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // データを登録
                 entity.mM_ITEM_PROC_COST.create(conn, struct);
              
                 // 登録データを画面再表示
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlInsert>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
                 // マスタ情報検索
                 List lockedList = entity.mM_ITEM_PROC_COST_Lock.read(conn, struct);
                 // 更新するキーが存在しない場合はエラー
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
                 // 読み込み時の｢更新数｣と異なる場合はエラー
                 DA0040010Struct lockedStruct = (DA0040010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_ITEM_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_ITEM_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter(
                   "M_ITEM_PROC_COST",
                   "PROC_COST_CLS_CD",
                   struct.getPROC_COST_CLS_CD());
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // [工場マスタ]存在チェック
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [工程マスタ]存在チェック
                 List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                 if (mCsProcList.isEmpty()) {
                  setErrorMessage("DA00001");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                 } else {
                  // [工程マスタ]."削除フラグ"=1の場合はエラー
                  DA0040010Struct mCsProcStruct = (DA0040010Struct) mCsProcList.get(0);
                  if ("1".equals(mCsProcStruct.getDEL_FLG())) {
                   setErrorMessage("DA04002");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // [加工費分類マスタ]存在チェック
                 List mProcCostClsList = entity.mM_PROC_COST_CLS.read(conn, struct);
                 if (mProcCostClsList.isEmpty()) {
                  setErrorMessage("DA00009");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 }
                 // [加工費マスタ]存在チェック
                 List mProcCostList = entity.mM_PROC_COST.read(conn, struct);
                 if (mProcCostList.isEmpty()) {
                  setErrorMessage("DA00003");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                  setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_PROC_COST", "PROC_COST_CLS_CD", struct.getPROC_COST_CLS_CD());
                 } else {
                  // [加工費マスタ]."削除フラグ"=1の場合はエラー
                  DA0040010Struct mProcCostStruct = (DA0040010Struct) mProcCostList.get(0);
                  if ("1".equals(mProcCostStruct.getDEL_FLG())) {
                   setErrorMessage("DA04003");
                   setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_PROC_COST", "YEAR", struct.getYEAR());
                   setErrorParameter("M_PROC_COST", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                   setErrorParameter("M_PROC_COST", "COST_TYP", struct.getCOST_TYP());
                   setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                   setErrorParameter(
                    "M_PROC_COST",
                    "PROC_COST_CLS_CD",
                    struct.getPROC_COST_CLS_CD());
                  }
                 }
                 // [品目マスタ]存在チェック
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 } else {
                  DA0040010Struct mItemStruct = (DA0040010Struct) mItemList.get(0);
                  // ｢品目管理コード｣のNULLチェックを行う
                  if (struct.getCLASIFICATION_CD() == null
                   || struct.getCLASIFICATION_CD().length() == 0) {
                   // ｢品目管理コード｣=NULLの場合、[品目]."管理コード"を設定する。
                   struct.setCLASIFICATION_CD(mItemStruct.getCLASIFICATION_CD());
                  } else {
                   // ｢品目管理コード｣!=NULLの場合かつ、｢品目情報と比較しない｣=offの場合
                   if (!"true".equals(struct.getc_NoCheckClasificationCd())) {
                    // ｢品目管理コード｣!=[品目]."管理コード"の場合はエラー
                    if (!struct
                     .getCLASIFICATION_CD()
                     .equals(mItemStruct.getCLASIFICATION_CD())) {
                     setErrorMessage("DA04004");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
                 }
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  setNextUrl("/DA0040011.jsp");
                  return;
                 }
              
                 // DBを更新
                 entity.mM_ITEM_PROC_COST.update(conn, struct);
              
                 // 更新したデータを再検索して画面に表示
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
                controlSelect();
                //}}user_implement_dev:<controlReturn>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // 「邦貨単位」を取得
                 List mHomeCurList = entity.mM_HOME_CUR.read(conn, struct);
                 // 取得に失敗した場合はエラー
                 if (mHomeCurList.isEmpty()) {
                  throw new ExpjException();
                 } else {
                  DA0040010Struct mHomeCurStruct = (DA0040010Struct) mHomeCurList.get(0);
                  _homeCurUnit = mHomeCurStruct.getHOME_CUR_UNIT();
                 }
              
                 // ログインユーザの工場コードをキーに[原価管理パラメータ]を取得する（画面初期化に使用）
                 struct.setPLANT_CD(sysPLANT_CD);
                 List sysCostCtrlList = entity.mSYS_COST_CTRL.read(conn, struct);
                 // [原価管理パラメータ]が存在しない場合はエラーメッセージを表示
                 if (sysCostCtrlList.isEmpty()) {
                  setErrorMessage("DA00005");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  _mySysCostCtrl = new DA0040010Struct();
                 } else {
                  _mySysCostCtrl = (DA0040010Struct) sysCostCtrlList.get(0);
                 }
              
                 // コンボボックスデータを取得
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _halfTermTypComboStruct = comboBox.getData("HALF_TERM_TYP");
                 _costTypComboStruct = comboBox.getData("COST_TYP");
                 _onerousConsFlgComboStruct = comboBox.getData("ONEROUS_CONS_FLG");
                 comboBox.setConnection(null);
                 // コンボボックスデータの設定
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                 struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                 struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
              
                 // 画面を初期化
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0040");
		logger.entering("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                struct.setList_ONEROUS_CONS_FLG_val(_onerousConsFlgComboStruct.getValList());
                struct.setList_ONEROUS_CONS_FLG_name(_onerousConsFlgComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DA0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineInsert") ) {
				controlLineInsert();
			} else if( button.equals("LineUpdate") ) {
				controlLineUpdate();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Return") ) {
				controlReturn();
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
//			throw new FoundationException("DA0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0040010-E999","CSVの出力処理"));
			throw new FoundationException("DA0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0040010-E999","システム日付の取得処理"));
				throw new FoundationException("DA0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("DA0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected DA0040010Entity entity;
	protected DA0040010Struct struct;
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

		entity = new DA0040010Entity();
		struct = new DA0040010Struct();

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
	 * DA0040010クラスの標準コンストラクタ
	 */
	public DA0040010Control() throws BusinessProcessException, FoundationException
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
				DA0040010Struct key = (DA0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name") && key.getHALF_TERM_TYP_name() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_name", key.getHALF_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val") && key.getHALF_TERM_TYP_val() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_val", key.getHALF_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_name") && key.getCOST_TYP_name() != null) {
					msgKey.setKeyValue("COST_TYP_name", key.getCOST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_val") && key.getCOST_TYP_val() != null) {
					msgKey.setKeyValue("COST_TYP_val", key.getCOST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN") && key.getHALF_TERM_TYP_DN() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_DN", key.getHALF_TERM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_DN") && key.getCOST_TYP_DN() != null) {
					msgKey.setKeyValue("COST_TYP_DN", key.getCOST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name") && key.getONEROUS_CONS_FLG_name() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_name", key.getONEROUS_CONS_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val") && key.getONEROUS_CONS_FLG_val() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_val", key.getONEROUS_CONS_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd") && key.getc_NoCheckClasificationCd() != null) {
					msgKey.setKeyValue("c_NoCheckClasificationCd", key.getc_NoCheckClasificationCd());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_CD") && key.getl_PROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("l_PROC_COST_CLS_CD", key.getl_PROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_NAME") && key.getl_PROC_COST_CLS_NAME() != null) {
					msgKey.setKeyValue("l_PROC_COST_CLS_NAME", key.getl_PROC_COST_CLS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CLASIFICATION_CD") && key.getl_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("l_CLASIFICATION_CD", key.getl_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ONEROUS_CONS_FLG_DN") && key.getl_ONEROUS_CONS_FLG_DN() != null) {
					msgKey.setKeyValue("l_ONEROUS_CONS_FLG_DN", key.getl_ONEROUS_CONS_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT") && key.getl_HOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_HOME_CUR_UNIT", key.getl_HOME_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_01") && key.getl_PROC_COST_01() != null) {
					msgKey.setKeyValue("l_PROC_COST_01", key.getl_PROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_02") && key.getl_PROC_COST_02() != null) {
					msgKey.setKeyValue("l_PROC_COST_02", key.getl_PROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_03") && key.getl_PROC_COST_03() != null) {
					msgKey.setKeyValue("l_PROC_COST_03", key.getl_PROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_04") && key.getl_PROC_COST_04() != null) {
					msgKey.setKeyValue("l_PROC_COST_04", key.getl_PROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_05") && key.getl_PROC_COST_05() != null) {
					msgKey.setKeyValue("l_PROC_COST_05", key.getl_PROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_06") && key.getl_PROC_COST_06() != null) {
					msgKey.setKeyValue("l_PROC_COST_06", key.getl_PROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_07") && key.getl_PROC_COST_07() != null) {
					msgKey.setKeyValue("l_PROC_COST_07", key.getl_PROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_08") && key.getl_PROC_COST_08() != null) {
					msgKey.setKeyValue("l_PROC_COST_08", key.getl_PROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_09") && key.getl_PROC_COST_09() != null) {
					msgKey.setKeyValue("l_PROC_COST_09", key.getl_PROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_10") && key.getl_PROC_COST_10() != null) {
					msgKey.setKeyValue("l_PROC_COST_10", key.getl_PROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_11") && key.getl_PROC_COST_11() != null) {
					msgKey.setKeyValue("l_PROC_COST_11", key.getl_PROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_12") && key.getl_PROC_COST_12() != null) {
					msgKey.setKeyValue("l_PROC_COST_12", key.getl_PROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_COST_SUM") && key.getl_PROC_COST_SUM() != null) {
					msgKey.setKeyValue("l_PROC_COST_SUM", key.getl_PROC_COST_SUM());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("COST_TYP") && key.getCOST_TYP() != null) {
					msgKey.setKeyValue("COST_TYP", key.getCOST_TYP());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_ITEM_CD") && key.getIN_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_ITEM_CD", key.getIN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD") && key.getPROC_COST_CLS_CD() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_CD", key.getPROC_COST_CLS_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME") && key.getPROC_COST_CLS_NAME() != null) {
					msgKey.setKeyValue("PROC_COST_CLS_NAME", key.getPROC_COST_CLS_NAME());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG") && key.getONEROUS_CONS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG", key.getONEROUS_CONS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY") && key.getPROC_COST_UNIT_QTY() != null) {
					msgKey.setKeyValue("PROC_COST_UNIT_QTY", key.getPROC_COST_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_01") && key.getPROC_COST_01() != null) {
					msgKey.setKeyValue("PROC_COST_01", key.getPROC_COST_01());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_02") && key.getPROC_COST_02() != null) {
					msgKey.setKeyValue("PROC_COST_02", key.getPROC_COST_02());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_03") && key.getPROC_COST_03() != null) {
					msgKey.setKeyValue("PROC_COST_03", key.getPROC_COST_03());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_04") && key.getPROC_COST_04() != null) {
					msgKey.setKeyValue("PROC_COST_04", key.getPROC_COST_04());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_05") && key.getPROC_COST_05() != null) {
					msgKey.setKeyValue("PROC_COST_05", key.getPROC_COST_05());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_06") && key.getPROC_COST_06() != null) {
					msgKey.setKeyValue("PROC_COST_06", key.getPROC_COST_06());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_07") && key.getPROC_COST_07() != null) {
					msgKey.setKeyValue("PROC_COST_07", key.getPROC_COST_07());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_08") && key.getPROC_COST_08() != null) {
					msgKey.setKeyValue("PROC_COST_08", key.getPROC_COST_08());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_09") && key.getPROC_COST_09() != null) {
					msgKey.setKeyValue("PROC_COST_09", key.getPROC_COST_09());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_10") && key.getPROC_COST_10() != null) {
					msgKey.setKeyValue("PROC_COST_10", key.getPROC_COST_10());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_11") && key.getPROC_COST_11() != null) {
					msgKey.setKeyValue("PROC_COST_11", key.getPROC_COST_11());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_12") && key.getPROC_COST_12() != null) {
					msgKey.setKeyValue("PROC_COST_12", key.getPROC_COST_12());
				}
				if(msgKeyType.containsKeyColumn("PROC_COST_SUM") && key.getPROC_COST_SUM() != null) {
					msgKey.setKeyValue("PROC_COST_SUM", key.getPROC_COST_SUM());
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
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_YEAR") && key.getCURRENT_YEAR() != null) {
					msgKey.setKeyValue("CURRENT_YEAR", key.getCURRENT_YEAR());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_NAME") && key.getCS_PROC_NAME() != null) {
					msgKey.setKeyValue("CS_PROC_NAME", key.getCS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT") && key.getHOME_CUR_UNIT() != null) {
					msgKey.setKeyValue("HOME_CUR_UNIT", key.getHOME_CUR_UNIT());
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
					DA0040010Struct key = new DA0040010Struct();
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name")) {
						key.setHALF_TERM_TYP_name(msgKey.getKeyValue("HALF_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val")) {
						key.setHALF_TERM_TYP_val(msgKey.getKeyValue("HALF_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_name")) {
						key.setCOST_TYP_name(msgKey.getKeyValue("COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_val")) {
						key.setCOST_TYP_val(msgKey.getKeyValue("COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_DN")) {
						key.setHALF_TERM_TYP_DN(msgKey.getKeyValue("HALF_TERM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_DN")) {
						key.setCOST_TYP_DN(msgKey.getKeyValue("COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name")) {
						key.setONEROUS_CONS_FLG_name(msgKey.getKeyValue("ONEROUS_CONS_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val")) {
						key.setONEROUS_CONS_FLG_val(msgKey.getKeyValue("ONEROUS_CONS_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd")) {
						key.setc_NoCheckClasificationCd(msgKey.getKeyValue("c_NoCheckClasificationCd"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_CD")) {
						key.setl_PROC_COST_CLS_CD(msgKey.getKeyValue("l_PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_CLS_NAME")) {
						key.setl_PROC_COST_CLS_NAME(msgKey.getKeyValue("l_PROC_COST_CLS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CLASIFICATION_CD")) {
						key.setl_CLASIFICATION_CD(msgKey.getKeyValue("l_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ONEROUS_CONS_FLG_DN")) {
						key.setl_ONEROUS_CONS_FLG_DN(msgKey.getKeyValue("l_ONEROUS_CONS_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_UNIT")) {
						key.setl_HOME_CUR_UNIT(msgKey.getKeyValue("l_HOME_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_01")) {
						key.setl_PROC_COST_01(msgKey.getKeyValue("l_PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_02")) {
						key.setl_PROC_COST_02(msgKey.getKeyValue("l_PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_03")) {
						key.setl_PROC_COST_03(msgKey.getKeyValue("l_PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_04")) {
						key.setl_PROC_COST_04(msgKey.getKeyValue("l_PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_05")) {
						key.setl_PROC_COST_05(msgKey.getKeyValue("l_PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_06")) {
						key.setl_PROC_COST_06(msgKey.getKeyValue("l_PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_07")) {
						key.setl_PROC_COST_07(msgKey.getKeyValue("l_PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_08")) {
						key.setl_PROC_COST_08(msgKey.getKeyValue("l_PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_09")) {
						key.setl_PROC_COST_09(msgKey.getKeyValue("l_PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_10")) {
						key.setl_PROC_COST_10(msgKey.getKeyValue("l_PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_11")) {
						key.setl_PROC_COST_11(msgKey.getKeyValue("l_PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_12")) {
						key.setl_PROC_COST_12(msgKey.getKeyValue("l_PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_COST_SUM")) {
						key.setl_PROC_COST_SUM(msgKey.getKeyValue("l_PROC_COST_SUM"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("COST_TYP")) {
						key.setCOST_TYP(msgKey.getKeyValue("COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_ITEM_CD")) {
						key.setIN_ITEM_CD(msgKey.getKeyValue("IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_CD")) {
						key.setPROC_COST_CLS_CD(msgKey.getKeyValue("PROC_COST_CLS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_CLS_NAME")) {
						key.setPROC_COST_CLS_NAME(msgKey.getKeyValue("PROC_COST_CLS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG")) {
						key.setONEROUS_CONS_FLG(msgKey.getKeyValue("ONEROUS_CONS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_UNIT_QTY")) {
						key.setPROC_COST_UNIT_QTY(msgKey.getKeyValue("PROC_COST_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_01")) {
						key.setPROC_COST_01(msgKey.getKeyValue("PROC_COST_01"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_02")) {
						key.setPROC_COST_02(msgKey.getKeyValue("PROC_COST_02"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_03")) {
						key.setPROC_COST_03(msgKey.getKeyValue("PROC_COST_03"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_04")) {
						key.setPROC_COST_04(msgKey.getKeyValue("PROC_COST_04"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_05")) {
						key.setPROC_COST_05(msgKey.getKeyValue("PROC_COST_05"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_06")) {
						key.setPROC_COST_06(msgKey.getKeyValue("PROC_COST_06"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_07")) {
						key.setPROC_COST_07(msgKey.getKeyValue("PROC_COST_07"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_08")) {
						key.setPROC_COST_08(msgKey.getKeyValue("PROC_COST_08"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_09")) {
						key.setPROC_COST_09(msgKey.getKeyValue("PROC_COST_09"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_10")) {
						key.setPROC_COST_10(msgKey.getKeyValue("PROC_COST_10"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_11")) {
						key.setPROC_COST_11(msgKey.getKeyValue("PROC_COST_11"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_12")) {
						key.setPROC_COST_12(msgKey.getKeyValue("PROC_COST_12"));
					}
					if(msgKeyType.containsKeyColumn("PROC_COST_SUM")) {
						key.setPROC_COST_SUM(msgKey.getKeyValue("PROC_COST_SUM"));
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
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_YEAR")) {
						key.setCURRENT_YEAR(msgKey.getKeyValue("CURRENT_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_NAME")) {
						key.setCS_PROC_NAME(msgKey.getKeyValue("CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_UNIT")) {
						key.setHOME_CUR_UNIT(msgKey.getKeyValue("HOME_CUR_UNIT"));
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
