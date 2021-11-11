/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0020/src/com/nec/jp/orteus/metamorBase/DA0020/DA0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0020;

import com.nec.jp.orteus.metamorBase.DA0020.*;
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

public class DA0020010Control
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
        public DA0020010Struct getListvalue(int x) {
         return (DA0020010Struct) (this.list.get(x));
        } // リストの値を返します。
        public DA0020010Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public DA0020010Struct createStruct() {
         return new DA0020010Struct();
        } // 新しいStructを作って返します。
        public void setStruct(Object structname) {
         this.struct.setStruct((DA0020010Struct) structname);
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
        /** 会社コード */
        private String _companyCd;
        /** 邦貨コード */
        private String _homeCurCd;
       
        /** ログインユーザの工場コードをキーに検索した[原価管理パラメータ]データオブジェクト（画面初期化に使用） */
        private DA0020010Struct _mySysCostCtrl;
       
        /** ｢半期区分｣コンボボックスデータ */
        private ComboStruct _halfTermTypComboStruct = new ComboStruct();
        /** ｢原価種別｣コンボボックスデータ */
        private ComboStruct _costTypComboStruct = new ComboStruct();
        /** ｢単価区分｣コンボボックスデータ */
        private ComboStruct _unitCostTypComboStruct = new ComboStruct();
        /** ｢単価採用区分｣コンボボックスデータ */
        private ComboStruct _unitCostAcceptTypComboStruct = new ComboStruct();
        /** ｢購入品単価種別｣コンボボックスデータ */
        private ComboStruct _csPuchTypComboStruct = new ComboStruct();
        /** ｢有償支給区分｣コンボボックスデータ */
        private ComboStruct _onerousConsFlgComboStruct = new ComboStruct();
       
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
        private void setStruct(DA0020010Struct s) {
         struct.seth_PLANT_CD(struct.getPLANT_CD());
         struct.seth_YEAR(struct.getYEAR());
         struct.seth_HALF_TERM_TYP(struct.getHALF_TERM_TYP());
         struct.seth_COST_TYP(struct.getCOST_TYP());
         struct.seth_ITEM_CD(struct.getITEM_CD());
       
         struct.setCS_PUCH_TYP(s.getCS_PUCH_TYP());
         struct.setCS_PROC_CD(s.getCS_PROC_CD());
         struct.setCS_PROC_NAME(s.getCS_PROC_NAME());
         struct.setUNIT_COST_ACCEPT_TYP(s.getUNIT_COST_ACCEPT_TYP());
         struct.setCLASIFICATION_CD(s.getCLASIFICATION_CD());
         struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
         struct.setCOMPANY_CD(s.getCOMPANY_CD());
         struct.setORG_CD(s.getORG_CD());
         struct.setORG_NAME(s.getORG_NAME());
         struct.setONEROUS_CONS_FLG(s.getONEROUS_CONS_FLG());
         struct.setVEND_CD(s.getVEND_CD());
         struct.setVEND_NAME(s.getVEND_NAME());
         struct.setUNIT_COST(s.getUNIT_COST());
         struct.setCUR_UNIT(s.getCUR_UNIT());
         struct.setUNIT_COST_TYP(s.getUNIT_COST_TYP());
         struct.setPUCH_UNIT_QTY(s.getPUCH_UNIT_QTY());
         struct.setCUR_CD(s.getCUR_CD());
         struct.setCUR_NAME(s.getCUR_NAME());
         struct.setEXCH_RATE(s.getEXCH_RATE());
         struct.setSUB_VEND_CD(s.getSUB_VEND_CD());
         struct.setSUB_VEND_NAME(s.getSUB_VEND_NAME());
         struct.setSUB_UNIT_COST(s.getSUB_UNIT_COST());
         struct.setSUB_CUR_UNIT(s.getSUB_CUR_UNIT());
         struct.setSUB_UNIT_COST_TYP(s.getSUB_UNIT_COST_TYP());
         struct.setSUB_PUCH_UNIT_QTY(s.getSUB_PUCH_UNIT_QTY());
         struct.setSUB_CUR_CD(s.getSUB_CUR_CD());
         struct.setSUB_CUR_NAME(s.getSUB_CUR_NAME());
         struct.setSUB_EXCH_RATE(s.getSUB_EXCH_RATE());
         struct.setDEL_FLG(s.getDEL_FLG());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
       
         struct.seth_CS_PUCH_TYP(s.getCS_PUCH_TYP());
       
         struct.setc_NoCheckClasificationCd("true");
         struct.setc_NoCheckStockUnit("true");
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setPLANT_NAME(null);
         struct.setYEAR(_mySysCostCtrl.getCURRENT_YEAR());
         struct.setHALF_TERM_TYP(_mySysCostCtrl.getHALF_TERM_TYP());
         struct.setCOST_TYP("1");
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setCS_PROC_CD("*");
       
         struct.seth_PLANT_CD(null);
         struct.seth_YEAR(null);
         struct.seth_HALF_TERM_TYP(null);
         struct.seth_COST_TYP(null);
         struct.seth_ITEM_CD(null);
       
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetail() {
         struct.setCS_PUCH_TYP(null);
         struct.setCS_PROC_CD(null);
         struct.setCS_PROC_NAME(null);
         struct.setUNIT_COST_ACCEPT_TYP(null);
         struct.setCLASIFICATION_CD(null);
         struct.setSTOCK_UNIT(null);
         struct.setCOMPANY_CD(_companyCd);
         struct.setORG_CD(null);
         struct.setORG_NAME(null);
         struct.setONEROUS_CONS_FLG(null);
         struct.setVEND_CD(null);
         struct.setVEND_NAME(null);
         struct.setUNIT_COST("0");
         struct.setCUR_UNIT(null);
         struct.setUNIT_COST_TYP("1");
         struct.setPUCH_UNIT_QTY("1");
         struct.setCUR_CD(null);
         struct.setCUR_NAME(null);
         struct.setEXCH_RATE("1");
         struct.setSUB_VEND_CD(null);
         struct.setSUB_VEND_NAME(null);
         struct.setSUB_UNIT_COST("0");
         struct.setSUB_CUR_UNIT(null);
         struct.setSUB_UNIT_COST_TYP("1");
         struct.setSUB_PUCH_UNIT_QTY("1");
         struct.setSUB_CUR_CD(null);
         struct.setSUB_CUR_NAME(null);
         struct.setSUB_EXCH_RATE("1");
         struct.setDEL_FLG(null);
         struct.setMODIFY_COUNT(null);
         
         struct.setc_NoCheckClasificationCd("true");
         struct.setc_NoCheckStockUnit("true");
       
         list = null;
       
         readStatus = INITIAL;
        }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // キー以外の項目を初期化
                 initializeDetail();
              
                 // 業務運用日を取得
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00003");
                  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  struct.setBUSINESS_OPR_DATE(businessOprDate);
                 }
              
                 // キーに対する名称項目を検索
                 // 工場名
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                  struct.setPLANT_NAME(null);
                 } else {
                  DA0020010Struct mPlantStruct = (DA0020010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // 品目名
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                  struct.setITEM_NAME(null);
                 } else {
                  DA0020010Struct mItemStruct = (DA0020010Struct) mItemList.get(0);
                  struct.setITEM_NAME(mItemStruct.getITEM_NAME());
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
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  return;
                 }
              
                 // データを取得
                 DA0020010Struct formStruct = (DA0020010Struct) formList.get(0);
              
                 if ("1".equals(formStruct.getDEL_FLG())) {
                  setWarningMessage("DA00006");
                 }
              
                 // 画面に表示
                 setStruct(formStruct);
              
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // 登録するキーで[購入品マスタ]を検索
                 List mCsPuchList = entity.mM_CS_PUCH.read(conn, struct);
                 // 登録データがすでに存在する場合はエラー
                 if (!mCsPuchList.isEmpty()) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
              
                 // 業務運用日を取得
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00003");
                  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  struct.setBUSINESS_OPR_DATE(businessOprDate);
                 }
              
                 // [工場マスタ]存在チェック
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [品目マスタ]存在チェック
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 }
                 // ｢工程コード｣が入力された場合、以下のチェックを行う
                 if (struct.getCS_PROC_CD() != null && struct.getCS_PROC_CD().length() != 0) {
                  // [工程マスタ]存在チェック
                  List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                  if (mCsProcList.isEmpty()) {
                   setErrorMessage("DA00001");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // ｢部門コード｣が入力された場合、以下のチェックを行う
                 if (struct.getORG_CD() != null && struct.getORG_CD().length() != 0) {
                  // [部門マスタ]存在しない場合はエラー
                  List mOrgList = entity.mM_ORG.read(conn, struct);
                  if (mOrgList.isEmpty()) {
                   setErrorMessage("ZZ11010");
                   setErrorParameter("M_ORG", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_ORG", "ORG_CD", struct.getVEND_CD());
                  }
                 }
                 // [取引先マスタ]存在チェック（第一取引先コード）
                 List mVendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                 if (mVendCtrlList.isEmpty()) {
                  setErrorMessage("ZZ11005");
                  setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
                  setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                 }
                 // ｢取引通貨コード｣が入力されていない場合
                 if (struct.getCUR_CD() == null || struct.getCUR_CD().length() == 0) {
                  // ｢通貨コード｣に[取引先マスタ]."取引通貨コード"を設定する。
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   // [取引先マスタ]."取引通貨コード"がnullの場合は[邦貨マスタ]."邦貨コード"を設定する。
                   if (mVendCtrlStruct.getCUR_CD() == null) {
                    struct.setCUR_CD(_homeCurCd);
                   } else {
                    struct.setCUR_CD(mVendCtrlStruct.getCUR_CD());
                   }
                  }
                 }
                 // [通貨マスタ]存在チェック（第一通貨コード）
                 List mCurList = entity.mM_CUR.read(conn, struct);
                 if (mCurList.isEmpty()) {
                  setErrorMessage("DA02001");
                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
                 }
              
                 // ｢為替レート｣が0の場合は[為替レートマスタ]."為替レート"を設定する。
                 if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   struct.setEXCH_TYP(mVendCtrlStruct.getEXCH_TYP());
              
                   List mExchRateList = entity.mM_EXCH_RATE.read(conn, struct);
                   if (mExchRateList.isEmpty()) {
                    setErrorMessage("DA02002");
                    setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                   } else {
                    DA0020010Struct mExchRateStruct = (DA0020010Struct) mExchRateList.get(0);
                    struct.setEXCH_RATE(mExchRateStruct.getEXCH_RATE());
                   }
                  }
                 }
                 // ｢第二取引先コード｣が入力された場合、以下のチェックを行う
                 if (struct.getSUB_VEND_CD() != null && struct.getSUB_VEND_CD().length() != 0) {
                  // [取引先マスタ]存在チェック（第二取引先コード）
                  List mVendCtrlSubList = entity.mM_VEND_CTRL_Sub.read(conn, struct);
                  if (mVendCtrlSubList.isEmpty()) {
                   setErrorMessage("DA02003");
                   setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getSUB_VEND_CD());
                  }
                  // ｢取引通貨コード｣が入力されていない場合
                  if (struct.getSUB_CUR_CD() == null || struct.getSUB_CUR_CD().length() == 0) {
                   // ｢通貨コード｣に[取引先マスタ]."取引通貨コード"を設定する。
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    // [取引先マスタ]."取引通貨コード"がnullの場合は[邦貨マスタ]."邦貨コード"を設定する。
                    if (mVendCtrlSubStruct.getSUB_CUR_CD() == null) {
                     struct.setSUB_CUR_CD(_homeCurCd);
                    } else {
                     struct.setSUB_CUR_CD(mVendCtrlSubStruct.getSUB_CUR_CD());
                    }
                   }
                  }
                  // [通貨マスタ]存在チェック（第二通貨コード）
                  List mCurSubList = entity.mM_CUR_Sub.read(conn, struct);
                  if (mCurSubList.isEmpty()) {
                   setErrorMessage("DA02004");
                   setErrorParameter("M_CUR", "CUR_CD", struct.getSUB_CUR_CD());
                  }
                  // ｢為替レート｣が0の場合は[為替レートマスタ]."為替レート"を設定する。
                  if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    struct.setSUB_EXCH_TYP(mVendCtrlSubStruct.getSUB_EXCH_TYP());
              
                    List mExchRateSubList = entity.mM_EXCH_RATE_Sub.read(conn, struct);
                    if (mExchRateSubList.isEmpty()) {
                     setErrorMessage("DA02005");
                     setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                    } else {
                     DA0020010Struct mExchRateSubStruct =
                      (DA0020010Struct) mExchRateSubList.get(0);
                     struct.setSUB_EXCH_RATE(mExchRateSubStruct.getSUB_EXCH_RATE());
                    }
                   }
                  }
                 } else {
                  // ｢第二取引先コード｣が入力されていない場合はすべての第二XX項目に初期値を設定する。
                  struct.setSUB_UNIT_COST("0");
                  struct.setSUB_UNIT_COST_TYP("1");
                  struct.setSUB_PUCH_UNIT_QTY("1");
                  struct.setSUB_CUR_CD(null);
                  struct.setSUB_EXCH_RATE("1");
                 }
              
                 // 品目マスタ存在チェックでエラーにならなかった場合は以下の処理を行う。
                 if (!mItemList.isEmpty()) {
                  // [品目マスタ]を検索
                  DA0020010Struct mItemStruct = (DA0020010Struct) mItemList.get(0);
              
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
                     setErrorMessage("DA02006");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
              
                  // ｢計量単位｣のNULLチェックを行う
                  if (struct.getSTOCK_UNIT() == null || struct.getSTOCK_UNIT().length() == 0) {
                   // ｢計量単位｣=NULLの場合、[品目]."計量単位"を設定する。
                   struct.setSTOCK_UNIT(mItemStruct.getSTOCK_UNIT());
                  } else {
                   // ｢計量単位｣!=NULLの場合かつ、｢品目情報と比較しない｣=offの場合
                   if (!"true".equals(struct.getc_NoCheckStockUnit())) {
                    // ｢計量単位｣!=[品目]."計量単位"の場合はエラー
                    if (!struct.getSTOCK_UNIT().equals(mItemStruct.getSTOCK_UNIT())) {
                     setErrorMessage("DA02007");
                     setErrorParameter("M_ITEM", "STOCK_UNIT", mItemStruct.getSTOCK_UNIT());
                    }
                   }
                  }
                 }
              
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // データを登録
                 entity.mM_CS_PUCH.create(conn, struct);
              
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
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
                 // [購入品マスタ]存在チェック
                 List lockedList = entity.mM_CS_PUCH_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [購入品マスタ]更新数チェック
                 DA0020010Struct lockedStruct = (DA0020010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PUCH", "MODIFY_COUNT", lockedStruct.getMODIFY_COUNT());
                  return;
                 }
                 // 業務運用日を取得
                 String businessOprDate = SystemInformation.getBusinessOprDate(struct.getPLANT_CD());
                 if (businessOprDate == null) {
                  setErrorMessage("DZ00003");
                  setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", struct.getPLANT_CD());
                 } else {
                  struct.setBUSINESS_OPR_DATE(businessOprDate);
                 }
                 // [工場マスタ]存在チェック
                 List mPlantList = entity.mM_PLANT.read(conn, struct);
                 if (mPlantList.isEmpty()) {
                  setErrorMessage("ZZ11001");
                  setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
                 }
                 // [品目マスタ]存在チェック
                 List mItemList = entity.mM_ITEM.read(conn, struct);
                 if (mItemList.isEmpty()) {
                  setErrorMessage("ZZ11002");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
                 }
                 // ｢工程コード｣が入力された場合、以下のチェックを行う
                 if (struct.getCS_PROC_CD() != null && struct.getCS_PROC_CD().length() != 0) {
                  // [工程マスタ]存在チェック
                  List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                  if (mCsProcList.isEmpty()) {
                   setErrorMessage("DA00001");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  }
                 }
                 // ｢部門コード｣が入力された場合、以下のチェックを行う
                 if (struct.getORG_CD() != null && struct.getORG_CD().length() != 0) {
                  // [部門マスタ]存在しない場合はエラー
                  List mOrgList = entity.mM_ORG.read(conn, struct);
                  if (mOrgList.isEmpty()) {
                   setErrorMessage("ZZ11010");
                   setErrorParameter("M_ORG", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_ORG", "ORG_CD", struct.getVEND_CD());
                  }
                 }
                 // [取引先マスタ]存在チェック（第一取引先コード）
                 List mVendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                 if (mVendCtrlList.isEmpty()) {
                  setErrorMessage("ZZ11005");
                  setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
                 }
                 // ｢取引通貨コード｣が入力されていない場合
                 if (struct.getCUR_CD() == null || struct.getCUR_CD().length() == 0) {
                  // ｢通貨コード｣に[取引先マスタ]."取引通貨コード"を設定する。
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   // [取引先マスタ]."取引通貨コード"がnullの場合は[邦貨マスタ]."邦貨コード"を設定する。
                   if (mVendCtrlStruct.getCUR_CD() == null) {
                    struct.setCUR_CD(_homeCurCd);
                   } else {
                    struct.setCUR_CD(mVendCtrlStruct.getCUR_CD());
                   }
                  }
                 }
                 // [通貨マスタ]存在チェック（第一通貨コード）
                 List mCurList = entity.mM_CUR.read(conn, struct);
                 if (mCurList.isEmpty()) {
                  setErrorMessage("DA02001");
                  setErrorParameter("M_CUR", "CUR_CD", struct.getCUR_CD());
                 }
              
                 // ｢為替レート｣が0の場合は[為替レートマスタ]."為替レート"を設定する。
                 if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                  if (!mVendCtrlList.isEmpty()) {
                   DA0020010Struct mVendCtrlStruct = (DA0020010Struct) mVendCtrlList.get(0);
                   struct.setEXCH_TYP(mVendCtrlStruct.getEXCH_TYP());
              
                   List mExchRateList = entity.mM_EXCH_RATE.read(conn, struct);
                   if (mExchRateList.isEmpty()) {
                    setErrorMessage("DA02002");
                    setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                   } else {
                    DA0020010Struct mExchRateStruct = (DA0020010Struct) mExchRateList.get(0);
                    struct.setEXCH_RATE(mExchRateStruct.getEXCH_RATE());
                   }
                  }
                 }
                 // ｢第二取引先コード｣が入力された場合、以下のチェックを行う
                 if (struct.getSUB_VEND_CD() != null && struct.getSUB_VEND_CD().length() != 0) {
                  // [取引先マスタ]存在チェック（第二取引先コード）
                  List mVendCtrlSubList = entity.mM_VEND_CTRL_Sub.read(conn, struct);
                  if (mVendCtrlSubList.isEmpty()) {
                   setErrorMessage("DA02003");
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getSUB_VEND_CD());
                  }
                  // ｢取引通貨コード｣が入力されていない場合
                  if (struct.getSUB_CUR_CD() == null || struct.getSUB_CUR_CD().length() == 0) {
                   // ｢通貨コード｣に[取引先マスタ]."取引通貨コード"を設定する。
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    // [取引先マスタ]."取引通貨コード"がnullの場合は[邦貨マスタ]."邦貨コード"を設定する。
                    if (mVendCtrlSubStruct.getSUB_CUR_CD() == null) {
                     struct.setSUB_CUR_CD(_homeCurCd);
                    } else {
                     struct.setSUB_CUR_CD(mVendCtrlSubStruct.getSUB_CUR_CD());
                    }
                   }
                  }
                  // [通貨マスタ]存在チェック（第二通貨コード）
                  List mCurSubList = entity.mM_CUR_Sub.read(conn, struct);
                  if (mCurSubList.isEmpty()) {
                   setErrorMessage("DA02004");
                   setErrorParameter("M_CUR", "CUR_CD", struct.getSUB_CUR_CD());
                  }
                  // ｢為替レート｣が0の場合は[為替レートマスタ]."為替レート"を設定する。
                  if (Calculate.compare(struct.getEXCH_RATE(), "0") == 0) {
                   if (!mVendCtrlSubList.isEmpty()) {
                    DA0020010Struct mVendCtrlSubStruct =
                     (DA0020010Struct) mVendCtrlSubList.get(0);
                    struct.setSUB_EXCH_TYP(mVendCtrlSubStruct.getSUB_EXCH_TYP());
              
                    List mExchRateSubList = entity.mM_EXCH_RATE_Sub.read(conn, struct);
                    if (mExchRateSubList.isEmpty()) {
                     setErrorMessage("DA02005");
                     setErrorParameter("M_EXCH_RATE", "CUR_CD", struct.getCUR_CD());
                    } else {
                     DA0020010Struct mExchRateSubStruct =
                      (DA0020010Struct) mExchRateSubList.get(0);
                     struct.setSUB_EXCH_RATE(mExchRateSubStruct.getSUB_EXCH_RATE());
                    }
                   }
                  }
                 } else {
                  struct.setSUB_UNIT_COST("0");
                  struct.setSUB_UNIT_COST_TYP("1");
                  struct.setSUB_PUCH_UNIT_QTY("1");
                  struct.setSUB_CUR_CD(null);
                  struct.setSUB_EXCH_RATE("1");
                 }
              
                 if (!mItemList.isEmpty()) {
                  DA0020010Struct mItemStruct = (DA0020010Struct) mItemList.get(0);
                  if (struct.getCLASIFICATION_CD() == null
                   || struct.getCLASIFICATION_CD().length() == 0) {
                   struct.setCLASIFICATION_CD(mItemStruct.getCLASIFICATION_CD());
                  } else {
                   if (!"true".equals(struct.getc_NoCheckClasificationCd())) {
                    if (!struct
                     .getCLASIFICATION_CD()
                     .equals(mItemStruct.getCLASIFICATION_CD())) {
                     setErrorMessage("DA02006");
                     setErrorParameter(
                      "M_ITEM",
                      "CLASIFICATION_CD",
                      mItemStruct.getCLASIFICATION_CD());
                    }
                   }
                  }
              
                  if (struct.getSTOCK_UNIT() == null || struct.getSTOCK_UNIT().length() == 0) {
                   struct.setSTOCK_UNIT(mItemStruct.getSTOCK_UNIT());
                  } else {
                   if (!"true".equals(struct.getc_NoCheckStockUnit())) {
                    if (!struct.getSTOCK_UNIT().equals(mItemStruct.getSTOCK_UNIT())) {
                     setErrorMessage("DA02007");
                     setErrorParameter("M_ITEM", "STOCK_UNIT", mItemStruct.getSTOCK_UNIT());
                    }
                   }
                  }
                 }
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // DBを更新
                 entity.mM_CS_PUCH.update(conn, struct);
              
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
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
                try {
                 // [購入品マスタ]存在チェック
                 List lockedList = entity.mM_CS_PUCH_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [購入品マスタ]更新数チェック
                 DA0020010Struct lockedStruct = (DA0020010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PUCH", "MODIFY_COUNT", lockedStruct.getMODIFY_COUNT());
                  return;
                 }
              
                 // [購入品マスタ]を更新（論理削除）
                 entity.mM_CS_PUCH_Delete.update(conn, struct);
              
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
                //}}user_implement_dev:<controlDelete>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * 削除取消ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlCancelDelete");
			//{{user_implement_dev:<controlCancelDelete>
                try {
                 // [購入品マスタ]存在チェック
                 List lockedList = entity.mM_CS_PUCH_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [購入品マスタ]更新数チェック
                 DA0020010Struct lockedStruct = (DA0020010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "YEAR", struct.getYEAR());
                  setErrorParameter("M_CS_PUCH", "HALF_TERM_TYP", struct.getHALF_TERM_TYP());
                  setErrorParameter("M_CS_PUCH", "COST_TYP", struct.getCOST_TYP());
                  setErrorParameter("M_CS_PUCH", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PUCH", "MODIFY_COUNT", lockedStruct.getMODIFY_COUNT());
                  return;
                 }
              
                 // [購入品マスタ]を更新（削除取消）
                 entity.mM_CS_PUCH_CancelDelete.update(conn, struct);
              
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
                //}}user_implement_dev:<controlCancelDelete>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlCancelDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // 画面を初期化
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // ログインユーザの工場コードをキーに[原価管理パラメータ]を取得する（画面初期化に使用）
                 struct.setPLANT_CD(sysPLANT_CD);
                 List sysCostCtrlList = entity.mSYS_COST_CTRL.read(conn, struct);
                 // [原価管理パラメータ]が存在しない場合はエラーメッセージを表示
                 if (sysCostCtrlList.isEmpty()) {
                  setErrorMessage("DA00005");
                  setErrorParameter("SYS_COST_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  _mySysCostCtrl = new DA0020010Struct();
                 } else {
                  _mySysCostCtrl = (DA0020010Struct) sysCostCtrlList.get(0);
                 }
              
                 // 会社コードを取得
                 _companyCd = SystemInformation.getSysMyCompanyCd();
                 if (_companyCd == null) {
                  throw new ExpjException("DA00007");
                 }
                 // 邦貨コードを取得
                 _homeCurCd = SystemInformation.getSysHomeCurCd();
                 if (_homeCurCd == null) {
                  throw new ExpjException("DA00007");
                 }
              
                 // コンボボックスデータを取得
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _halfTermTypComboStruct = comboBox.getData("HALF_TERM_TYP");
                 _costTypComboStruct = comboBox.getData("COST_TYP");
                 _unitCostTypComboStruct = comboBox.getData("UNIT_COST_TYP");
                 _unitCostAcceptTypComboStruct = comboBox.getData("UNIT_COST_ACCEPT_TYP");
                 _csPuchTypComboStruct = comboBox.getData("CS_PUCH_TYP");
                 _onerousConsFlgComboStruct = comboBox.getData("ONEROUS_CONS_FLG");
                 comboBox.setConnection(null);
                 // コンボボックスデータの設定
                 struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                 struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                 struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                 struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                 struct.setList_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                 struct.setList_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                 struct.setList_SUB_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                 struct.setList_SUB_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                 struct.setList_UNIT_COST_ACCEPT_TYP_val(_unitCostAcceptTypComboStruct.getValList());
                 struct.setList_UNIT_COST_ACCEPT_TYP_name(_unitCostAcceptTypComboStruct.getExplanList());
                 struct.setList_CS_PUCH_TYP_val(_csPuchTypComboStruct.getValList());
                 struct.setList_CS_PUCH_TYP_name(_csPuchTypComboStruct.getExplanList());
                 struct.setList_ONEROUS_CONS_FLG_val(_onerousConsFlgComboStruct.getValList());
                 struct.setList_ONEROUS_CONS_FLG_name(_onerousConsFlgComboStruct.getExplanList());
              
                 // 画面を初期化
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0020");
		logger.entering("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                struct.setList_HALF_TERM_TYP_val(_halfTermTypComboStruct.getValList());
                struct.setList_HALF_TERM_TYP_name(_halfTermTypComboStruct.getExplanList());
                struct.setList_COST_TYP_val(_costTypComboStruct.getValList());
                struct.setList_COST_TYP_name(_costTypComboStruct.getExplanList());
                struct.setList_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                struct.setList_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                struct.setList_SUB_UNIT_COST_TYP_val(_unitCostTypComboStruct.getValList());
                struct.setList_SUB_UNIT_COST_TYP_name(_unitCostTypComboStruct.getExplanList());
                struct.setList_UNIT_COST_ACCEPT_TYP_val(_unitCostAcceptTypComboStruct.getValList());
                struct.setList_UNIT_COST_ACCEPT_TYP_name(_unitCostAcceptTypComboStruct.getExplanList());
                struct.setList_CS_PUCH_TYP_val(_csPuchTypComboStruct.getValList());
                struct.setList_CS_PUCH_TYP_name(_csPuchTypComboStruct.getExplanList());
                struct.setList_ONEROUS_CONS_FLG_val(_onerousConsFlgComboStruct.getValList());
                struct.setList_ONEROUS_CONS_FLG_name(_onerousConsFlgComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("CancelDelete") ) {
				controlCancelDelete();
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
//			throw new FoundationException("DA0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","CSVの出力処理"));
			throw new FoundationException("DA0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","システム日付の取得処理"));
				throw new FoundationException("DA0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("DA0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected DA0020010Entity entity;
	protected DA0020010Struct struct;
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

		entity = new DA0020010Entity();
		struct = new DA0020010Struct();

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
	 * DA0020010クラスの標準コンストラクタ
	 */
	public DA0020010Control() throws BusinessProcessException, FoundationException
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
				DA0020010Struct key = (DA0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CS_PUCH_TYP") && key.getCS_PUCH_TYP() != null) {
					msgKey.setKeyValue("CS_PUCH_TYP", key.getCS_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_CD") && key.getCS_PROC_CD() != null) {
					msgKey.setKeyValue("CS_PROC_CD", key.getCS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PROC_NAME") && key.getCS_PROC_NAME() != null) {
					msgKey.setKeyValue("CS_PROC_NAME", key.getCS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP") && key.getUNIT_COST_ACCEPT_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_ACCEPT_TYP", key.getUNIT_COST_ACCEPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG") && key.getONEROUS_CONS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG", key.getONEROUS_CONS_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_UNIT_QTY") && key.getPUCH_UNIT_QTY() != null) {
					msgKey.setKeyValue("PUCH_UNIT_QTY", key.getPUCH_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("SUB_VEND_CD") && key.getSUB_VEND_CD() != null) {
					msgKey.setKeyValue("SUB_VEND_CD", key.getSUB_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_VEND_NAME") && key.getSUB_VEND_NAME() != null) {
					msgKey.setKeyValue("SUB_VEND_NAME", key.getSUB_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST") && key.getSUB_UNIT_COST() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST", key.getSUB_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("SUB_CUR_UNIT") && key.getSUB_CUR_UNIT() != null) {
					msgKey.setKeyValue("SUB_CUR_UNIT", key.getSUB_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP") && key.getSUB_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST_TYP", key.getSUB_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("SUB_PUCH_UNIT_QTY") && key.getSUB_PUCH_UNIT_QTY() != null) {
					msgKey.setKeyValue("SUB_PUCH_UNIT_QTY", key.getSUB_PUCH_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUB_CUR_CD") && key.getSUB_CUR_CD() != null) {
					msgKey.setKeyValue("SUB_CUR_CD", key.getSUB_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_CUR_NAME") && key.getSUB_CUR_NAME() != null) {
					msgKey.setKeyValue("SUB_CUR_NAME", key.getSUB_CUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUB_EXCH_RATE") && key.getSUB_EXCH_RATE() != null) {
					msgKey.setKeyValue("SUB_EXCH_RATE", key.getSUB_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
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
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_YEAR") && key.getCURRENT_YEAR() != null) {
					msgKey.setKeyValue("CURRENT_YEAR", key.getCURRENT_YEAR());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUB_EXCH_TYP") && key.getSUB_EXCH_TYP() != null) {
					msgKey.setKeyValue("SUB_EXCH_TYP", key.getSUB_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_YEAR") && key.geth_YEAR() != null) {
					msgKey.setKeyValue("h_YEAR", key.geth_YEAR());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name") && key.getHALF_TERM_TYP_name() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_name", key.getHALF_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val") && key.getHALF_TERM_TYP_val() != null) {
					msgKey.setKeyValue("HALF_TERM_TYP_val", key.getHALF_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_HALF_TERM_TYP") && key.geth_HALF_TERM_TYP() != null) {
					msgKey.setKeyValue("h_HALF_TERM_TYP", key.geth_HALF_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_name") && key.getCOST_TYP_name() != null) {
					msgKey.setKeyValue("COST_TYP_name", key.getCOST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("COST_TYP_val") && key.getCOST_TYP_val() != null) {
					msgKey.setKeyValue("COST_TYP_val", key.getCOST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_COST_TYP") && key.geth_COST_TYP() != null) {
					msgKey.setKeyValue("h_COST_TYP", key.geth_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_name") && key.getCS_PUCH_TYP_name() != null) {
					msgKey.setKeyValue("CS_PUCH_TYP_name", key.getCS_PUCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_val") && key.getCS_PUCH_TYP_val() != null) {
					msgKey.setKeyValue("CS_PUCH_TYP_val", key.getCS_PUCH_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_CS_PUCH_TYP") && key.geth_CS_PUCH_TYP() != null) {
					msgKey.setKeyValue("h_CS_PUCH_TYP", key.geth_CS_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_name") && key.getUNIT_COST_ACCEPT_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_ACCEPT_TYP_name", key.getUNIT_COST_ACCEPT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_val") && key.getUNIT_COST_ACCEPT_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_ACCEPT_TYP_val", key.getUNIT_COST_ACCEPT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name") && key.getONEROUS_CONS_FLG_name() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_name", key.getONEROUS_CONS_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val") && key.getONEROUS_CONS_FLG_val() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_FLG_val", key.getONEROUS_CONS_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name") && key.getUNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_name", key.getUNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val") && key.getUNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_val", key.getUNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_name") && key.getSUB_UNIT_COST_TYP_name() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST_TYP_name", key.getSUB_UNIT_COST_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_val") && key.getSUB_UNIT_COST_TYP_val() != null) {
					msgKey.setKeyValue("SUB_UNIT_COST_TYP_val", key.getSUB_UNIT_COST_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd") && key.getc_NoCheckClasificationCd() != null) {
					msgKey.setKeyValue("c_NoCheckClasificationCd", key.getc_NoCheckClasificationCd());
				}
				if(msgKeyType.containsKeyColumn("c_NoCheckStockUnit") && key.getc_NoCheckStockUnit() != null) {
					msgKey.setKeyValue("c_NoCheckStockUnit", key.getc_NoCheckStockUnit());
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
					DA0020010Struct key = new DA0020010Struct();
					if(msgKeyType.containsKeyColumn("CS_PUCH_TYP")) {
						key.setCS_PUCH_TYP(msgKey.getKeyValue("CS_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_CD")) {
						key.setCS_PROC_CD(msgKey.getKeyValue("CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PROC_NAME")) {
						key.setCS_PROC_NAME(msgKey.getKeyValue("CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP")) {
						key.setUNIT_COST_ACCEPT_TYP(msgKey.getKeyValue("UNIT_COST_ACCEPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG")) {
						key.setONEROUS_CONS_FLG(msgKey.getKeyValue("ONEROUS_CONS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_UNIT_QTY")) {
						key.setPUCH_UNIT_QTY(msgKey.getKeyValue("PUCH_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB_VEND_CD")) {
						key.setSUB_VEND_CD(msgKey.getKeyValue("SUB_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_VEND_NAME")) {
						key.setSUB_VEND_NAME(msgKey.getKeyValue("SUB_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST")) {
						key.setSUB_UNIT_COST(msgKey.getKeyValue("SUB_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("SUB_CUR_UNIT")) {
						key.setSUB_CUR_UNIT(msgKey.getKeyValue("SUB_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP")) {
						key.setSUB_UNIT_COST_TYP(msgKey.getKeyValue("SUB_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SUB_PUCH_UNIT_QTY")) {
						key.setSUB_PUCH_UNIT_QTY(msgKey.getKeyValue("SUB_PUCH_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUB_CUR_CD")) {
						key.setSUB_CUR_CD(msgKey.getKeyValue("SUB_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_CUR_NAME")) {
						key.setSUB_CUR_NAME(msgKey.getKeyValue("SUB_CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUB_EXCH_RATE")) {
						key.setSUB_EXCH_RATE(msgKey.getKeyValue("SUB_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
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
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_YEAR")) {
						key.setCURRENT_YEAR(msgKey.getKeyValue("CURRENT_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUB_EXCH_TYP")) {
						key.setSUB_EXCH_TYP(msgKey.getKeyValue("SUB_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_YEAR")) {
						key.seth_YEAR(msgKey.getKeyValue("h_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_name")) {
						key.setHALF_TERM_TYP_name(msgKey.getKeyValue("HALF_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("HALF_TERM_TYP_val")) {
						key.setHALF_TERM_TYP_val(msgKey.getKeyValue("HALF_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_HALF_TERM_TYP")) {
						key.seth_HALF_TERM_TYP(msgKey.getKeyValue("h_HALF_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_name")) {
						key.setCOST_TYP_name(msgKey.getKeyValue("COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("COST_TYP_val")) {
						key.setCOST_TYP_val(msgKey.getKeyValue("COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_COST_TYP")) {
						key.seth_COST_TYP(msgKey.getKeyValue("h_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_name")) {
						key.setCS_PUCH_TYP_name(msgKey.getKeyValue("CS_PUCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("CS_PUCH_TYP_val")) {
						key.setCS_PUCH_TYP_val(msgKey.getKeyValue("CS_PUCH_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_CS_PUCH_TYP")) {
						key.seth_CS_PUCH_TYP(msgKey.getKeyValue("h_CS_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_name")) {
						key.setUNIT_COST_ACCEPT_TYP_name(msgKey.getKeyValue("UNIT_COST_ACCEPT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ACCEPT_TYP_val")) {
						key.setUNIT_COST_ACCEPT_TYP_val(msgKey.getKeyValue("UNIT_COST_ACCEPT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_name")) {
						key.setONEROUS_CONS_FLG_name(msgKey.getKeyValue("ONEROUS_CONS_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_FLG_val")) {
						key.setONEROUS_CONS_FLG_val(msgKey.getKeyValue("ONEROUS_CONS_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_name")) {
						key.setUNIT_COST_TYP_name(msgKey.getKeyValue("UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_val")) {
						key.setUNIT_COST_TYP_val(msgKey.getKeyValue("UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_name")) {
						key.setSUB_UNIT_COST_TYP_name(msgKey.getKeyValue("SUB_UNIT_COST_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SUB_UNIT_COST_TYP_val")) {
						key.setSUB_UNIT_COST_TYP_val(msgKey.getKeyValue("SUB_UNIT_COST_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("c_NoCheckClasificationCd")) {
						key.setc_NoCheckClasificationCd(msgKey.getKeyValue("c_NoCheckClasificationCd"));
					}
					if(msgKeyType.containsKeyColumn("c_NoCheckStockUnit")) {
						key.setc_NoCheckStockUnit(msgKey.getKeyValue("c_NoCheckStockUnit"));
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
