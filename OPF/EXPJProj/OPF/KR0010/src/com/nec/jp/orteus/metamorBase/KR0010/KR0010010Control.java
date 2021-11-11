/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0010/src/com/nec/jp/orteus/metamorBase/KR0010/KR0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0010;

import com.nec.jp.orteus.metamorBase.KR0010.*;
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
import java.math.BigDecimal;
import com.nec.jp.orteus.expj.sa.amount.SaAmountCalculator;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;

import com.nec.jp.orteus.expj.sa.ArIf;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KR0010010Control
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
        public KR0010010Struct getListvalue(int x) {
         return (KR0010010Struct) (this.list.get(x));
        } // リストの値を返します。
        public KR0010010Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public KR0010010Struct createStruct() {
         return new KR0010010Struct();
        } // 新しいStructを作って返します。
        public void setStruct(Object structname) {
         this.struct.setStruct((KR0010010Struct) structname);
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
        
        /** 邦貨フラグ */
        private boolean bIsJpCur;
        
    	/** システム設定値取得 */
    	private PrivateConfig privateConfig;
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
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStruct(KR0010010Struct s) {
         struct.setSLIP_CD(s.getSLIP_CD());
         struct.setCUST_CD(s.getCUST_CD());
         struct.setCUST_ANAME(s.getCUST_ANAME());
         struct.setINSPC_ACPT_TYP_DN(s.getINSPC_ACPT_TYP_DN());
         struct.setINSPC_ACPT_TYP(s.getINSPC_ACPT_TYP());
         struct.setCUST_ODR_NO(s.getCUST_ODR_NO());
         struct.setSALES_DATE(s.getSALES_DATE());
         struct.setSHIP_DATE(s.getSHIP_DATE());
         struct.setSALES_DEPT_CD(s.getSALES_DEPT_CD());
         struct.setORG_NAME(s.getORG_NAME());
         struct.setCUST_CHRG_PSN_CD(s.getCUST_CHRG_PSN_CD());
         struct.setUSER_NAME(s.getUSER_NAME());
         struct.setITEM_CD(s.getITEM_CD());
         struct.setITEM_NAME(s.getITEM_NAME());
         struct.setCUST_ITEM_CD(s.getCUST_ITEM_CD());
         struct.setSALES_QTY(s.getSALES_QTY());
         struct.setSHIP_QTY(s.getSHIP_QTY());
         struct.setSALES_UNIT_PRICE(s.getSALES_UNIT_PRICE());
         struct.setSALES_AMOUNT(s.getSALES_AMOUNT());
         struct.setCUR_UNIT(s.getCUR_UNIT());
         struct.setREMARKS(s.getREMARKS());
         struct.setSTATUS(s.getSTATUS());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
       
         struct.setPKG_UNIT(s.getPKG_UNIT());
         struct.setODR_NO(s.getODR_NO());
         struct.setPART_DLV_SEQ_NO(s.getPART_DLV_SEQ_NO());
         struct.setDESINATED_DLV_DATE(s.getDESINATED_DLV_DATE());
         struct.setODR_ACPT_DATE(s.getODR_ACPT_DATE());
         struct.setODR_QTY(s.getODR_QTY());
         struct.setSHIP_ODR_NO(s.getSHIP_ODR_NO());
         struct.setUNIT_QTY_TYP( s.getUNIT_QTY_TYP() );
       
         struct.setCUR_UNIT2(s.getCUR_UNIT());
         struct.setPKG_UNIT2(s.getPKG_UNIT());
         struct.setPKG_UNIT3(s.getPKG_UNIT());
         struct.setSALES_DATE2(s.getSALES_DATE());
         struct.setCUST_ITEM_NAME(s.getCUST_ITEM_NAME());
       
         struct.seth_SLIP_CD(s.getSLIP_CD());
         struct.setAI_AR_IF_FLG(s.getAI_AR_IF_FLG());
        }
       
        /**
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStructSystemData(KR0010010Struct s) {
         s.setsOraganization_CD(struct.getsOrganization_CD());
         s.setsSysdate(struct.getsSysdate());
         s.setsUser_ID(sysUSER_CD);
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        private void initializeAll() {
         struct.setSLIP_CD(null);
       
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetail() {
         struct.setSLIP_CD(null);
         struct.setCUST_CD(null);
         struct.setCUST_ANAME(null);
         struct.setINSPC_ACPT_TYP_DN(null);
         struct.setINSPC_ACPT_TYP(null);
         struct.setCUST_ODR_NO(null);
         struct.setSALES_DATE(null);
         struct.setSHIP_DATE(null);
         struct.setSALES_DEPT_CD(null);
         struct.setORG_NAME(null);
         struct.setCUST_CHRG_PSN_CD(null);
         struct.setUSER_NAME(null);
         struct.setITEM_CD(null);
         struct.setITEM_NAME(null);
         struct.setCUST_ITEM_CD(null);
         struct.setSALES_QTY("0");
         struct.setSHIP_QTY("0");
         struct.setSALES_UNIT_PRICE("0");
         struct.setSALES_AMOUNT("0");
         struct.setCUR_UNIT(null);
         struct.setREMARKS(null);
         struct.setSTATUS(null);
         struct.setMODIFY_COUNT(null);
       
         struct.seth_SLIP_CD(null);
         struct.setCUST_ITEM_NAME(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * 邦貨換算。
         * @param amount 対象金額
         * @param s ストラクトオブジェクト
         * @return 邦貨金額
         * @throws SQLException 処理失敗
         * @throws ExpjException  処理失敗
         */
        private String exchAmount(String amount, KR0010010Struct s)
         throws SQLException, ExpjException {
       
         ExchAmount exch = new ExchAmount(conn);
       
         boolean result =
          exch.doExchAmount(
           amount,
           s.getCOMPANY_CD(),
           s.getCUR_CD(),
           s.getEXCH_TYP(),
           s.getDETAIL_ROUND_TYP(),
           s.getSALES_DATE());
       
         if (!result) {
          setErrorMessage("KQ00038");
          setErrorParameter("M_EXCH_RATE", "CUR_CD", s.getCUR_CD());
          return "0";
         }
         double exchAmount = exch.getD_EXCH_AMOUNT();
         BigDecimal b = new BigDecimal(exchAmount);
         
         bIsJpCur = exch.isB_ISJPCUR();
         
         return b.toString();
        }
       
        /**
         * 丸め。
         * @param amount 対象金額
         * @param s ストラクトオブジェクト
         * @return 丸め金額
         * @throws SQLException 処理失敗
         * @throws ExpjException 処理失敗
         */
        private String roundAmount(String amount, KR0010010Struct s)
         throws SQLException, ExpjException {
       
         ExchAmount exch = new ExchAmount(conn);
       
         boolean result =
          exch.doMarume(
           amount,
           s.getCOMPANY_CD(),
           s.getCUR_CD(),
           s.getEXCH_TYP(),
           s.getDETAIL_ROUND_TYP(),
           s.getSALES_DATE());
       
         if (!result) {
          throw new ExpjException("KQ00038");
         }
       
         double roundAmount = exch.getD_EXCH_AMOUNT();
         BigDecimal b = new BigDecimal(roundAmount);
       
         return b.toString();
        }
       
        /** 取引通貨の小数点以下桁数 */
        private int decimalFig = 0;
       
        private KR0010010Struct createInsertRecord()
         throws FoundationException, SQLException, ExpjException {
         KR0010010Struct s = new KR0010010Struct();
       
         // 品目名称
         s.setITEM_NAME(struct.getITEM_NAME());
         // 売上計上日
         s.setSALES_DATE(struct.getSALES_DATE());
         // 売上計上部門
         s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
         // 営業担当者コード
         s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
         // 売上実績数量
         s.setSALES_QTY(struct.getSALES_QTY());
         // 単価
         s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
         // 売上実績金額
         s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
         // 売上実績金額(邦貨)
         String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
         if (msgStruct.hasError()) {
          return s;
         }
         s.setSALES_AMOUNT_EXCH_RATES(salesAmountExchRates);
         // 受領検収日
         s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
         // 受領検収数
         s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
       
         // 外税対象金額
         String externalTaxSalesAmount =
          SaAmountCalculator.calcExternalTaxSalesAmount(
           struct.getTAX_CD(),
           s.getSALES_AMOUNT());
         s.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxSalesAmount);
         // 内税対象金額
         String internalTaxSalesAmount =
          SaAmountCalculator.calcInternalTaxSalesAmount(
           struct.getTAX_CD(),
           s.getSALES_AMOUNT());
         s.setINTERNAL_TAX_SALES_AMOUNT(internalTaxSalesAmount);
         // 非課税対象金額
         String taxfreeSalesAmount =
          SaAmountCalculator.calcTaxfreeSalesAmount(
           struct.getTAX_CD(),
           s.getSALES_AMOUNT());
         s.setTAXFREE_SALES_AMOUNT(taxfreeSalesAmount);
       
         // [消費税]を検索
         List taxList = entity.mM_TAX.read(conn, struct);
         KR0010010Struct taxStruct = (KR0010010Struct) taxList.get(0);
         // [邦貨]を検索
         List homeCurList = entity.mSYS_HOME_CUR.read(conn, struct);
         KR0010010Struct homeCurStruct = (KR0010010Struct) homeCurList.get(0);
       
         // 税額１
         String taxAmount1 =
          SaAmountCalculator.calcTaxAmount(
           struct.getTAX_CD(),
           s.getSALES_AMOUNT(),
           taxStruct.getTAX_RATE_1(),
           String.valueOf(decimalFig),
           taxStruct.getTAX_ROUND_TYP());
         s.setTAX_AMOUNT_1(taxAmount1);
         // 税額２
         String taxAmount2 =
          SaAmountCalculator.calcTaxAmount(
           struct.getTAX_CD(),
           s.getSALES_AMOUNT(),
           taxStruct.getTAX_RATE_2(),
           String.valueOf(decimalFig),
           taxStruct.getTAX_ROUND_TYP());
         s.setTAX_AMOUNT_2(taxAmount2);
         // 税額３
         String taxAmount3 =
          SaAmountCalculator.calcTaxAmount(
           struct.getTAX_CD(),
           s.getSALES_AMOUNT(),
           taxStruct.getTAX_RATE_3(),
           String.valueOf(decimalFig),
           taxStruct.getTAX_ROUND_TYP());
         s.setTAX_AMOUNT_3(taxAmount3);
         // 消費税額（外税）
         String externalTaxAmount =
          SaAmountCalculator.calcExternalTaxAmount(
           struct.getTAX_CD(),
           s.getTAX_AMOUNT_1(),
           s.getTAX_AMOUNT_2(),
           s.getTAX_AMOUNT_3());
         s.setEXTERNAL_TAX_AMOUNT(externalTaxAmount);
         // 消費税額（内税）
         String internalTaxAmount =
          SaAmountCalculator.calcInternalTaxAmount(
           struct.getTAX_CD(),
           s.getTAX_AMOUNT_1(),
           s.getTAX_AMOUNT_2(),
           s.getTAX_AMOUNT_3());
         s.setINTERNAL_TAX_AMOUNT(internalTaxAmount);
       
         // 税抜売上金額
         String taxCreditSalesAmount =
          SaAmountCalculator.calcTaxCreditSalesAmount(
           s.getEXTERNAL_TAX_SALES_AMOUNT(),
           s.getINTERNAL_TAX_SALES_AMOUNT(),
           s.getTAXFREE_SALES_AMOUNT(),
           s.getINTERNAL_TAX_AMOUNT());
         s.setTAX_CREDIT_SALES_AMOUNT(taxCreditSalesAmount);
       
         // 税抜売上金額（邦貨）
         String taxCreditSalesAmountExchRates = exchAmount(taxCreditSalesAmount, struct);
         if (msgStruct.hasError()) {
          return s;
         }
         s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(taxCreditSalesAmountExchRates);
       
         // 備考
         s.setREMARKS(struct.getREMARKS());
         // 状態区分
         s.setSTATUS("20");
         
         // 為替レート
         // 邦貨の場合
         if (bIsJpCur) {
        	// 為替レート
        	 s.setEXCH_RATE("1");
         } else {
        	 List tempList = new ArrayList();
        	// 為替レートを取得
        	 tempList = entity.mselectM_EXCH_RATE.read(conn, struct);
        	 
        	 s.setEXCH_RATE(((KR0010010Struct)tempList.get(0)).getEXCH_RATE());
         }
         
         //システムパラメータチェック
         chkAprSales(s);
         
         setStructSystemData(s);
       
         return s;
        }
       
        private KR0010010Struct createDeleteRecord() 
        throws FoundationException, SQLException, ExpjException{
         KR0010010Struct s = new KR0010010Struct();
       
         // 状態区分
         s.setSTATUS("10");
         
         //システムパラメータチェック
         chkAprSales(s);
       
         setStructSystemData(s);
       
         return s;
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
     * システムパラメータチェック       
     * @throws SQLException 処理失敗
     * @throws ExpjException 処理失敗
   * @throws FoundationException 
     */
    private void chkAprSales(KR0010010Struct st)
    throws SQLException, ExpjException, FoundationException{
  	  
 	           /** パラメータ「売上実績承認」を取得*/
 	           privateConfig = new PrivateConfig(conn);
 	           String aprSales = privateConfig.getString("APR_SALES");
 	           // パラメータ「検収承認」が取得できなかった場合
 	          if(aprSales == null || "".equals(aprSales)){
 	     	  	st.setAPPR_FLG("1");
 	    		st.setAPPR_ID(null);
 	    		st.setAPPR_DATE(null);
 	          }else if(!"1".equals(aprSales)){   	        	  
     		    // １以外の場合
 	     	  	st.setAPPR_FLG("3");
 	 	    	st.setAPPR_ID(getsysUSER_CD()); 	    	
                // 業務運用日
                struct.setPLANT_CD(getsysPLANT_CD());
                List dateList = entity.mSYS_DATE_CTRL.read(conn, struct);
                if (!dateList.isEmpty()) {
                 KR0010010Struct dateStruct = (KR0010010Struct)dateList.get(0);
  	 	         st.setAPPR_DATE(dateStruct.getBUSINESS_OPR_DATE());
                }
                else {
                 st.setBUSINESS_OPR_DATE("");
                } 	 	    	

 	          }else{
 	        	// １の場合
 	 	     	st.setAPPR_FLG("1");
 	 	    	st.setAPPR_ID(null);
 	 	    	st.setAPPR_DATE(null);
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
                 // システム工場コード
                 String sysPlantCd = "";
                 List sysClassList = entity.mSYS_CLASS_CODE.read(conn, struct);
                 if (!sysClassList.isEmpty()) {
                  KR0010010Struct sysClassStruct = (KR0010010Struct)sysClassList.get(0);
                  sysPlantCd = sysClassStruct.getSYS_CLASS_CODE();
                 }

                 // 業務運用日
                 struct.setPLANT_CD(sysPlantCd);
                 List dateList = entity.mSYS_DATE_CTRL.read(conn, struct);
                 if (!dateList.isEmpty()) {
                  KR0010010Struct dateStruct = (KR0010010Struct)dateList.get(0);
                  struct.setBUSINESS_OPR_DATE(dateStruct.getBUSINESS_OPR_DATE());
                 }
                 else {
                  struct.setBUSINESS_OPR_DATE("");
                 }

                 // 画面表示用データ読込
                 List formList = entity.mForm.read(conn, struct);
                 // 画面表示用データが0件の場合
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                  return;
                 }

                 KR0010010Struct formStruct = (KR0010010Struct) formList.get(0);
                 
                 formStruct.setINSPC_ACPT_TYP_DN(this.multcombo("INSPC_ACPT_TYP",formStruct.getINSPC_ACPT_TYP()));
                 
                 //検収区分1の場合、エラーにする
                 if (!"2".equals(formStruct.getINSPC_ACPT_TYP())
                  && !"3".equals(formStruct.getINSPC_ACPT_TYP())) {
                  setErrorMessage("KR00001");
                  setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                  return;
                 }

                 List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
                 if (installOptionsList.isEmpty()) {
                  // 売掛管理がインストールされていない。
                  if (Calculate.compare(formStruct.getSTATUS(), "40") >= 0) {
                   setErrorMessage("BD00027");
                   setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                   return;
                  }
                  /*
                  if (!"10".equals(formStruct.getSTATUS())
                   && !"20".equals(formStruct.getSTATUS())
                   && !"2".equals(formStruct.getINSPC_ACPT_TYP())
                   && !"3".equals(formStruct.getINSPC_ACPT_TYP())) {
                   setErrorMessage("KR00001");
                   setErrorParameter("T_SALES", "SLIP_CD", struct.getSLIP_CD());
                   return;
                  }
                  */

                 } else {
                  // 売掛管理がインストールされている。
                  List arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN_Select.read(conn, struct);
                  List arLedgerHList = entity.mT_AR_LEDGER_H_Select.read(conn, struct);
                  if (arLedgerHTrnList.isEmpty() && arLedgerHList.isEmpty()) {
                   setErrorMessage("BD00027");
                   setErrorParameter("T_AR_LEDGER_H_TRN", "SLIP_CD", struct.getSLIP_CD());
                   return;
                  }
                 }

                 // 画面データを設定
                 setStruct(formStruct);
              
                 // 通貨情報取得(少数桁数，丸め区分)
                 struct.setDECIMAL_FIG("0");
                 struct.setROUND_TYP("1");
                 List curList = entity.mM_CUR.read(conn, struct);
                 if (!curList.isEmpty()) {
                  KR0010010Struct curStruct = (KR0010010Struct)curList.get(0);
                  struct.setDECIMAL_FIG(curStruct.getDECIMAL_FIG());
                  if ("2".equals(curStruct.getDETAIL_ROUND_TYP())) {
                   struct.setROUND_TYP("2");
                  }
                  else if ("3".equals(curStruct.getDETAIL_ROUND_TYP())) {
                   struct.setROUND_TYP("3");
                  }
                 }
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 再計算ボタン押下時に実行される処理です。
	 *
	 */
	public void controlRecalc() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");
			//{{user_implement_dev:<controlRecalc>
                try {
                 // ｢得意先コード｣が[得意先]に存在しない場合
                 List custList = entity.mM_CUST.read(conn, struct);
                 if (custList.isEmpty()) {
                  setErrorMessage("KA00032");
                 }
                 
                 //--Add Start 20131220 qian-lf
                 //｢消費税コード｣が[受注明細]に存在しない場合
                 List productList = entity.mT_ODR.read(conn, struct);
                 if (productList.isEmpty()) {
                	 setErrorMessage("KQ10011");
                 }
                 //--Add End 20131220 qian-lf
                 
                 //--Del Start 20131220 qian-lf
                 /*//sww追加20040726開始
                 // ｢消費税コード｣が[製品]に存在しない場合
                 List productList = entity.mM_ITEM_SPEC.read(conn, struct);
                 if (productList.isEmpty()) {
                  setErrorMessage("KA00032");
                 }
                 //sww追加20040726終了*/
                 //--Del End 20131220 qian-lf
              
                 // ｢売上担当部門コード｣が[部門]に存在しない場合
                 List orgList = entity.mM_ORG.read(conn, struct);
                 if (orgList.isEmpty()) {
                  setErrorMessage("KA00058");
                 }
                 // ｢売上担当者コード｣が[ユーザ]に存在しない場合
                 List userList = entity.mUSER_MST.read(conn, struct);
                 if (userList.isEmpty()) {
                  setErrorMessage("KU01000");
                 }
                 // ｢得意先コード｣→[得意先]."取引通貨コード"が[通貨]に存在しない場合
                 List curList = entity.mM_CUR.read(conn, struct);
                 if (curList.isEmpty()) {
                  setErrorMessage("KQ00073");
                 } else {
                  // ｢売上金額｣の小数桁が[通貨]."小数桁数"を超えていた場合
                  KR0010010Struct curStruct = (KR0010010Struct) curList.get(0);
                  decimalFig = Integer.parseInt(curStruct.getDECIMAL_FIG());
                  if (Calculate.compare(struct.getSALES_QTY(), "0") <= 0
                   && Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") <= 0) {
                   if (NumberTool.getRealScale(struct.getSALES_AMOUNT())
                    > Integer.parseInt(curStruct.getDECIMAL_FIG())) {
                    setErrorMessage("KU01003");
                   }
                  }
                 }
                 // エラーがあった場合は処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // [得意先]情報を設定
                 KR0010010Struct custStruct = (KR0010010Struct) custList.get(0);
                 struct.setCOMPANY_CD(custStruct.getCOMPANY_CD());
                 struct.setCUST_CD(custStruct.getCUST_CD());
                 struct.setCUST_ANAME(custStruct.getCUST_ANAME());
                 struct.setCUR_CD(custStruct.getCUR_CD());
                 struct.setEXCH_TYP(custStruct.getEXCH_TYP());
                 struct.setINSPC_ACPT_TYP(custStruct.getINSPC_ACPT_TYP());
                 //struct.setTAX_CD(custStruct.getTAX_CD());
              
                 //--Del Start 20131220 qian-lf
                 /*//sww追加20040726開始
                 //消費税適用区分=1(製品マスタ),2(得意先マスタ)
                 String strTAX_APPLY_TYP = custStruct.getTAX_APPLY_TYP();
                 if ("2".equals(strTAX_APPLY_TYP)) {
              //System.out.println("得意先からの消費税の取得:"+custStruct.getTAX_CD());
                  //得意先からの消費税の取得
                  struct.setTAX_CD(custStruct.getTAX_CD());
                 }else if ("1".equals(strTAX_APPLY_TYP)) {
                  //[製品]から消費税コードの取得
                  KR0010010Struct productStruct = (KR0010010Struct) productList.get(0);
              //System.out.println("製品からの消費税の取得:"+productStruct.getTAX_CD());
                  struct.setTAX_CD(productStruct.getTAX_CD());
                 }
                 //sww追加20040726終了*/
                 //--Del End 20131220 qian-lf
                 
                 //--Add Start 20131220 qian-lf
                 //[受注明細]から消費税コードの取得
                 KR0010010Struct productStruct = (KR0010010Struct) productList.get(0);
                 struct.setTAX_CD(productStruct.getTAX_CD());
                 //--Add Start 20131220 qian-lf
              
                 struct.setDETAIL_ROUND_TYP(custStruct.getDETAIL_ROUND_TYP());
                 struct.setCUST_CD(custStruct.getCUST_CD());
                 // [部門]情報を設定
                 KR0010010Struct orgStruct = (KR0010010Struct) orgList.get(0);
                 struct.setORG_NAME(orgStruct.getORG_NAME());
                 // [ユーザ]情報を設定
                 KR0010010Struct userStruct = (KR0010010Struct) userList.get(0);
                 struct.setUSER_NAME(userStruct.getUSER_NAME());
                 // [通貨]情報を設定
                 KR0010010Struct curStruct = (KR0010010Struct) curList.get(0);
                 struct.setCUR_UNIT(curStruct.getCUR_UNIT());
                 // 数量or単価が入力されていた場合は金額を計算
                 if (Calculate.compare(struct.getSALES_QTY(), "0") > 0
                  || Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") > 0) {
                  String work =
                   Calculate.multiply(struct.getSALES_QTY(), struct.getSALES_UNIT_PRICE());
                  work = roundAmount(work, struct);
                  struct.setSALES_AMOUNT(work);
                 }
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRecalc>
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlRecalc");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // ｢伝票番号｣が、[売上実績]に存在しない場合
                 List lockedList = entity.mT_SALES_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
                 KR0010010Struct lockedStruct = (KR0010010Struct) lockedList.get(0);
                 // [売上実績]."更新数" != ｢更新数｣(hidden)の場合
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
              
              //insert start  at 20040805 by taniguchi
                 List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
                 List arLedgerHTrnList = null;
                 List arLedgerHList = null;
                 if (!installOptionsList.isEmpty()) {
                  // 売掛管理がインストールされている場合
                  arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
                  arLedgerHList = entity.mT_AR_LEDGER_H.read(conn, struct);
              
                  if (arLedgerHTrnList.isEmpty() && arLedgerHList.isEmpty()) {
                  // [売掛金トランヘッダ]."伝票種類" = 14 も、[売掛金元帳ヘッダ]."伝票種類" = 14 も、そんざいしない場合
                   setErrorMessage("KU02003");
                   return;
                  }
                 }
              //insert end    at 20040805 by taniguchi
              
                 // 整数管理チェック
                 if ("1".equals(struct.getUNIT_QTY_TYP())) {
                  // 整数管理
                  if (struct.getSALES_QTY().indexOf(".") >= 0) {
                   // 小数入力の場合：切上げ
                   String tempString = struct.getSALES_QTY();
                   double tempDouble1 = Double.parseDouble(tempString);
                   struct.setSALES_QTY(Calculate.ceil(struct.getSALES_QTY(), 0));
                   double tempDouble2 = Double.parseDouble(struct.getSALES_QTY());
                   if (tempDouble1 != tempDouble2) {
                    // ".0"入力除外
                    setWarningMessage("KQ20004");
                    setWarningParameter("T_SALES", "SALES_QTY", tempString);
                   }
                  }
                 }
              
                 // 再計算ロジックを呼び出して、エラーチェック及びデータセットを行う。
                 controlRecalc();
                 // エラーがあった場合は処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // [売上実績]（黒伝）登録用データを生成
                 KR0010010Struct insertRecordStruct = createInsertRecord();
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // 伝票番号を自動採番
                 insertRecordStruct.setSLIP_CD(struct.getSLIP_CD());
                 // 元伝票番号にnullを設定
                 insertRecordStruct.setORG_SLIP_CD(null);
                 // [売上実績]（黒伝）を更新
                 entity.mT_SALES_Insert.update(conn, insertRecordStruct);
              
                 if (!installOptionsList.isEmpty()) {
                  // 売掛管理がインストールされている場合
              
                  // 売掛管理Ⅰ／Ｆ(部品)の呼出
                  // 処理モード:4
                  // 利用者コード:struct.getsUser_ID()
                  // 元伝票番号:struct.getSLIP_CD()
                  // 赤伝票番号:null
                  // 黒伝票番号:null
                  ArIf arIf = new ArIf(conn);
                  arIf.setParameter("4", struct.getsUser_ID(), struct.getSLIP_CD(),
                        null, null);
                  String msgNo = arIf.execute();
                  if (!"0".equals(msgNo)) {
                   setErrorMessage(msgNo);
                   conn.rollback();
                   return;
                  }
                 }
              
              //delete start  at 20040805 by taniguchi
              /*
                 // 売掛トラン/売掛元帳 登録更新PL/SQLを呼び出す。
                 struct.setPVC2SHUBETU("I");
                 struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
                 struct.setPVC2REDSLIP_CD(null);
                 struct.setPVC2BLKSLIP_CD(null);
                 struct.setPVC2RESULT(null);
                 List uriLinkList = entity.mSQLURILINK.call(conn, struct);
                 KR0010010Struct uriLinkStruct = (KR0010010Struct) uriLinkList.get(0);
                 // エラーチェック
                 if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
                  setErrorMessage(uriLinkStruct.getPVC2RESULT());
                  return;
                 }
              */
              //delete end    at 20040805 by taniguchi
              
                 // 登録した黒伝の伝票番号で画面を再検索
                 struct.setSLIP_CD(insertRecordStruct.getSLIP_CD());
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
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
                try {
                 // ｢伝票番号｣が、[売上実績]に存在しない場合
                 List lockedList = entity.mT_SALES_Lock.read(conn, struct);
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
                 KR0010010Struct lockedStruct = (KR0010010Struct) lockedList.get(0);
                 // [売上実績]."更新数" != ｢更新数｣(hidden)の場合
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  return;
                 }
  
         		//20090410 ADD START
                 //削除時にAi連携ありかつ送信済の場合はエラー
         		if("1".equals(struct.geth_INSTALL_FLG()) &&
         				"1".equals(struct.getAI_AR_IF_FLG())){		
         			setErrorMessage("KR00032");
         			return;		
         		}
         		//20090410 ADD END
         		
                 List installOptionsList = entity.mSYS_INSTALL_OPTIONS.read(conn, struct);
              //insert start  at 20040805 by taniguchi
                 List arLedgerHTrnList = null;
                 List arLedgerHList = null;
                 if (!installOptionsList.isEmpty()) {
                  arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
                  arLedgerHList = entity.mT_AR_LEDGER_H.read(conn, struct);
                 }
              //insert end    at 20040805 by taniguchi
              //delete 2 line at 20040805 by taniguchi
              //			List arLedgerHTrnList = entity.mT_AR_LEDGER_H_TRN.read(conn, struct);
              //			List arLedgerHList = entity.mT_AR_LEDGER_H.read(conn, struct);
                 if (installOptionsList.isEmpty()
                  || (!installOptionsList.isEmpty() && !arLedgerHTrnList.isEmpty())) {
                  // 売掛管理がインストールされていない場合
                  // または、売掛管理がインストールされているかつ、[売掛金トランヘッダ]."伝票種類" = 14 の場合
              
                  // 削除用データオブジェクトを生成
                  KR0010010Struct deleteStruct = createDeleteRecord();
                  deleteStruct.setSLIP_CD(struct.getSLIP_CD());
              
                  // [売上伝票]を更新
                  entity.mT_SALES_Delete1.update(conn, deleteStruct);
              
                //20090414 MOD START
                //Ai連携ありの場合は売掛I/F実行せず
                  if (!installOptionsList.isEmpty() &&
                		!"1".equals(struct.geth_INSTALL_FLG())) {
               	//20090414 MOD END
                   // 売掛管理がインストールされている場合
              
                   // 売掛管理Ⅰ／Ｆ(部品)の呼出
                   // 処理モード:5
                   // 利用者コード:struct.getsUser_ID()
                   // 元伝票番号:struct.getSLIP_CD()
                   // 赤伝票番号:null
                   // 黒伝票番号:null
                   ArIf arIf = new ArIf(conn);
                   arIf.setParameter("5", struct.getsUser_ID(),
                         struct.getSLIP_CD(),
                         null, null);
                   String msgNo = arIf.execute();
                   if (!"0".equals(msgNo)) {
                    setErrorMessage(msgNo);
                    conn.rollback();
                    return;
                   }
                  }
              
                  //sww削除20040723開始
                  /*// 売掛トラン/売掛元帳 登録更新PL/SQLを呼び出す。
                  struct.setPVC2SHUBETU("JD");
                  struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
                  struct.setPVC2REDSLIP_CD(null);
                  struct.setPVC2BLKSLIP_CD(null);
                  struct.setPVC2RESULT(null);
                  List uriLinkList = entity.mSQLURILINK.call(conn, struct);
                  KR0010010Struct uriLinkStruct = (KR0010010Struct) uriLinkList.get(0);
                  // エラーチェック
                  if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
                   setErrorMessage(uriLinkStruct.getPVC2RESULT());
                   return;
                  }*/
                  //sww削除20040723終了
                  // 更新した黒伝の伝票番号で画面を再検索
                  struct.setSLIP_CD(deleteStruct.getSLIP_CD());
                  controlSelect();
              
                 } else if (!installOptionsList.isEmpty() && !arLedgerHList.isEmpty()) {
                  // 売掛管理がインストールされているかつ、[売掛金元帳ヘッダ]."伝票種類" = 14 の場合
              
                  // システム工場コード
                  String sysPlantCd = "";
                  List sysClassList = entity.mSYS_CLASS_CODE.read(conn, struct);
                  if (!sysClassList.isEmpty()) {
                   KR0010010Struct sysClassStruct = (KR0010010Struct)sysClassList.get(0);
                   sysPlantCd = sysClassStruct.getSYS_CLASS_CODE();
                  }
              
                  // 伝票番号の自動採番
                  Numbering slipCdNum =
                   new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), sysPlantCd);
                  // 伝票番号（赤伝）を自動採番
                  String creditSlipCd = slipCdNum.getNo();
                  // 伝票番号（黒伝）を自動採番
                  String debitSlipCd = slipCdNum.getNo();
              
                  // 削除用データオブジェクトを生成
                  KR0010010Struct deleteStruct = createDeleteRecord();
                  deleteStruct.setSLIP_CD(debitSlipCd);
                  deleteStruct.setORG_SLIP_CD(struct.getSLIP_CD());
                  // [売上伝票]を更新
                  entity.mT_SALES_Delete2.update(conn, deleteStruct);
              
                  // [出荷実績]を更新
                  entity.mT_SHIP.update(conn, deleteStruct);
                  // [出荷指示]を更新
                  entity.mT_SHIP_ODR.update(conn, deleteStruct);
              
                  //20090414 MOD START
                  //Ai連携ありの場合は売掛I/F実行せず
                    if (!installOptionsList.isEmpty() &&
                  		!"1".equals(struct.geth_INSTALL_FLG())) {
                  //20090414 MOD END
                   // 売掛管理がインストールされている場合
              
                   // 売掛管理Ⅰ／Ｆ(部品)の呼出
                   // 処理モード:5
                   // 利用者コード:struct.getsUser_ID()
                   // 元伝票番号:struct.getSLIP_CD()
                   // 赤伝票番号:creditSlipCd
                   // 黒伝票番号:debitSlipCd
                   ArIf arIf = new ArIf(conn);
                   arIf.setParameter("5", struct.getsUser_ID(),
                         struct.getSLIP_CD(),
                         creditSlipCd, debitSlipCd);
                   String msgNo = arIf.execute();
                   if (!"0".equals(msgNo)) {
                    setErrorMessage(msgNo);
                    conn.rollback();
                    return;
                   }
                  }
              
                  //sww削除20040723開始
                  /*// 売掛トラン/売掛元帳 登録更新PL/SQLを呼び出す。
                  struct.setPVC2SHUBETU("JD");
                  struct.setPVC2ORGSLIP_CD(struct.getSLIP_CD());
                  struct.setPVC2REDSLIP_CD(creditSlipCd);
                  struct.setPVC2BLKSLIP_CD(debitSlipCd);
                  struct.setPVC2RESULT(null);
                  List uriLinkList = entity.mSQLURILINK.call(conn, struct);
                  KR0010010Struct uriLinkStruct = (KR0010010Struct) uriLinkList.get(0);
                  // エラーチェック
                  if (!"0".equals(uriLinkStruct.getPVC2RESULT())) {
                   setErrorMessage(uriLinkStruct.getPVC2RESULT());
                   return;
                  }*/
                  //sww削除20040723終了
                  // 更新した黒伝の伝票番号で画面を再検索
                  struct.setSLIP_CD(deleteStruct.getSLIP_CD());
                  controlSelect();
              //insert start  at 20040805 by taniguchi
                 } else {
                  setErrorMessage("KU02003");
                  return;
              //insert end    at 20040805 by taniguchi
                 }
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 単価読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelectUnitCost() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");
			//{{user_implement_dev:<controlSelectUnitCost>
                // TODO: ユーザ定義のコードを記述してください
                try {
                 // 単価データ読込
                 List unitCostList = entity.mSelectUnitCost.read(conn, struct);
                 // 単価データが0件の場合
                 if (unitCostList.isEmpty()) {
                  setErrorMessage("KU00067");
                  setErrorParameter("T_SALES", "CUST_CD", struct.getCUST_CD());
                  setErrorParameter("T_SALES", "ITEM_CD", struct.getITEM_CD());
                  setErrorParameter("T_SALES", "SALES_DATE", struct.getSALES_DATE());
                  return;
                 }
              
                 KR0010010Struct unitCostStruct = (KR0010010Struct) unitCostList.get(0);
                 struct.setSALES_UNIT_PRICE(unitCostStruct.getSALES_UNIT_PRICE());
              
                 struct.setSALES_AMOUNT(
                  Calculate.multiply( struct.getSALES_UNIT_PRICE(), struct.getSALES_QTY()));
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelectUnitCost>
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlSelectUnitCost");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
                initializeAll();
    			// インストールオプションの取得
    			List InstallOptionList = entity.mSYS_INSTALL_OPTIONS_Ai.read(conn, struct);
    			if (InstallOptionList.isEmpty()) {
    				struct.seth_INSTALL_FLG(null);			
    			}else{
    				struct.seth_INSTALL_FLG(((KR0010010Struct)InstallOptionList.get(0)).geth_INSTALL_FLG());
    			}
		} catch(Exception e) {
			e.printStackTrace();
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0010");
		logger.entering("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KR0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Recalc") ) {
				controlRecalc();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("SelectUnitCost") ) {
				controlSelectUnitCost();
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
//			throw new FoundationException("KR0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0010010-E999","CSVの出力処理"));
			throw new FoundationException("KR0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0010010-E999","システム日付の取得処理"));
				throw new FoundationException("KR0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("KR0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KR0010010Entity entity;
	protected KR0010010Struct struct;
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

		entity = new KR0010010Entity();
		struct = new KR0010010Struct();

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
	 * KR0010010クラスの標準コンストラクタ
	 */
	public KR0010010Control() throws BusinessProcessException, FoundationException
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
				KR0010010Struct key = (KR0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_SLIP_CD") && key.geth_SLIP_CD() != null) {
					msgKey.setKeyValue("h_SLIP_CD", key.geth_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_DN") && key.getINSPC_ACPT_TYP_DN() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP_DN", key.getINSPC_ACPT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT2") && key.getPKG_UNIT2() != null) {
					msgKey.setKeyValue("PKG_UNIT2", key.getPKG_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT2") && key.getCUR_UNIT2() != null) {
					msgKey.setKeyValue("CUR_UNIT2", key.getCUR_UNIT2());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT3") && key.getPKG_UNIT3() != null) {
					msgKey.setKeyValue("PKG_UNIT3", key.getPKG_UNIT3());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE2") && key.getSALES_DATE2() != null) {
					msgKey.setKeyValue("SALES_DATE2", key.getSALES_DATE2());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DATE") && key.getSHIP_DATE() != null) {
					msgKey.setKeyValue("SHIP_DATE", key.getSHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_QTY") && key.getSHIP_QTY() != null) {
					msgKey.setKeyValue("SHIP_QTY", key.getSHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG") && key.getAI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("AI_AR_IF_FLG", key.getAI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT") && key.getPKG_UNIT() != null) {
					msgKey.setKeyValue("PKG_UNIT", key.getPKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO") && key.getPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("PART_DLV_SEQ_NO", key.getPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_NO") && key.getSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("SHIP_ODR_NO", key.getSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PVC2SHUBETU") && key.getPVC2SHUBETU() != null) {
					msgKey.setKeyValue("PVC2SHUBETU", key.getPVC2SHUBETU());
				}
				if(msgKeyType.containsKeyColumn("PVC2ORGSLIP_CD") && key.getPVC2ORGSLIP_CD() != null) {
					msgKey.setKeyValue("PVC2ORGSLIP_CD", key.getPVC2ORGSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("PVC2REDSLIP_CD") && key.getPVC2REDSLIP_CD() != null) {
					msgKey.setKeyValue("PVC2REDSLIP_CD", key.getPVC2REDSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("PVC2BLKSLIP_CD") && key.getPVC2BLKSLIP_CD() != null) {
					msgKey.setKeyValue("PVC2BLKSLIP_CD", key.getPVC2BLKSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("PVC2RESULT") && key.getPVC2RESULT() != null) {
					msgKey.setKeyValue("PVC2RESULT", key.getPVC2RESULT());
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
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES") && key.getSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_EXCH_RATES", key.getSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT") && key.getEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_SALES_AMOUNT", key.getEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT") && key.getINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_SALES_AMOUNT", key.getINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT") && key.getTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAXFREE_SALES_AMOUNT", key.getTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT") && key.getTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_CREDIT_SALES_AMOUNT", key.getTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT") && key.getEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_AMOUNT", key.getEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT") && key.getINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_AMOUNT", key.getINTERNAL_TAX_AMOUNT());
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
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("ORG_SLIP_CD") && key.getORG_SLIP_CD() != null) {
					msgKey.setKeyValue("ORG_SLIP_CD", key.getORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE") && key.getSYS_CLASS_CODE() != null) {
					msgKey.setKeyValue("SYS_CLASS_CODE", key.getSYS_CLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
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
					KR0010010Struct key = new KR0010010Struct();
					if(msgKeyType.containsKeyColumn("h_SLIP_CD")) {
						key.seth_SLIP_CD(msgKey.getKeyValue("h_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_DN")) {
						key.setINSPC_ACPT_TYP_DN(msgKey.getKeyValue("INSPC_ACPT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT2")) {
						key.setPKG_UNIT2(msgKey.getKeyValue("PKG_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT2")) {
						key.setCUR_UNIT2(msgKey.getKeyValue("CUR_UNIT2"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT3")) {
						key.setPKG_UNIT3(msgKey.getKeyValue("PKG_UNIT3"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE2")) {
						key.setSALES_DATE2(msgKey.getKeyValue("SALES_DATE2"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DATE")) {
						key.setSHIP_DATE(msgKey.getKeyValue("SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_QTY")) {
						key.setSHIP_QTY(msgKey.getKeyValue("SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG")) {
						key.setAI_AR_IF_FLG(msgKey.getKeyValue("AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT")) {
						key.setPKG_UNIT(msgKey.getKeyValue("PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO")) {
						key.setPART_DLV_SEQ_NO(msgKey.getKeyValue("PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_NO")) {
						key.setSHIP_ODR_NO(msgKey.getKeyValue("SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PVC2SHUBETU")) {
						key.setPVC2SHUBETU(msgKey.getKeyValue("PVC2SHUBETU"));
					}
					if(msgKeyType.containsKeyColumn("PVC2ORGSLIP_CD")) {
						key.setPVC2ORGSLIP_CD(msgKey.getKeyValue("PVC2ORGSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2REDSLIP_CD")) {
						key.setPVC2REDSLIP_CD(msgKey.getKeyValue("PVC2REDSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BLKSLIP_CD")) {
						key.setPVC2BLKSLIP_CD(msgKey.getKeyValue("PVC2BLKSLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2RESULT")) {
						key.setPVC2RESULT(msgKey.getKeyValue("PVC2RESULT"));
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
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES")) {
						key.setSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT")) {
						key.setINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT")) {
						key.setTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT")) {
						key.setTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT")) {
						key.setEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT")) {
						key.setINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_AMOUNT"));
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
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("ORG_SLIP_CD")) {
						key.setORG_SLIP_CD(msgKey.getKeyValue("ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE")) {
						key.setSYS_CLASS_CODE(msgKey.getKeyValue("SYS_CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
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
