/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/DA0010/src/com/nec/jp/orteus/metamorBase/DA0010/DA0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.DA0010;

import com.nec.jp.orteus.metamorBase.DA0010.*;
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

public class DA0010010Control
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
        public DA0010010Struct getListvalue(int x) {
         return (DA0010010Struct) (this.list.get(x));
        } // リストの値を返します。
        public DA0010010Struct getStruct() {
         return this.struct;
        } // Structを返します。
        public DA0010010Struct createStruct() {
         return new DA0010010Struct();
        } // 新しいStructを作って返します。
        public void setStruct(Object structname) {
         this.struct.setStruct((DA0010010Struct) structname);
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
        String _companyCd;
       
        /** ｢内外作区分｣コンボボックスデータ */
        private ComboStruct _outsideTypComboStruct = new ComboStruct();
        /** ｢標準工数単位区分｣コンボボックスデータ */
        private ComboStruct _stdCostUnitTypComboStruct = new ComboStruct();
       
        /** 次に遷移する画面のURL */
        private String _nextUrl;
       
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
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStruct(DA0010010Struct s) {
        }
       
        /**
         * Structの値をセットします。
         * @param s 検索したデータ
         */
        private void setStructSub1(DA0010010Struct s) {
         struct.setCS_PROC_CD(s.getCS_PROC_CD());
         struct.setCS_PROC_NAME(s.getCS_PROC_NAME());
         struct.setWS_CD(s.getWS_CD());
         struct.setWS_NAME(s.getWS_NAME());
         struct.setOUTSIDE_TYP(s.getOUTSIDE_TYP());
         struct.setVEND_CD(s.getVEND_CD());
         struct.setVEND_NAME(s.getVEND_NAME());
         struct.setCOMPANY_CD(s.getCOMPANY_CD());
         struct.setORG_CD(s.getORG_CD());
         struct.setORG_NAME(s.getORG_NAME());
         struct.setSTD_COST_OF_MONTH(s.getSTD_COST_OF_MONTH());
         struct.setSTD_COST_UNIT_TYP(s.getSTD_COST_UNIT_TYP());
         struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
        }
       
        /**
         * 画面の全項目を初期化します。
         */
        private void initializeAll() {
         struct.setPLANT_CD(sysPLANT_CD);
         struct.setw_CS_PROC_CD(null);
         struct.setw_WS_CD(null);
       
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetail() {
         struct.setPLANT_NAME(null);
       
         list = null;
       
         readStatus = INITIAL;
        }
       
        /**
         * 画面の詳細項目を初期化します。
         */
        private void initializeDetailSub1() {
         struct.setCS_PROC_CD(null);
         struct.setCS_PROC_NAME(null);
         struct.setWS_CD(null);
         struct.setWS_NAME(null);
         struct.setOUTSIDE_TYP("1");
         struct.setVEND_CD(null);
         struct.setVEND_NAME(null);
         struct.setCOMPANY_CD(null);
         struct.setORG_CD(null);
         struct.setORG_NAME(null);
         struct.setSTD_COST_OF_MONTH(null);
         struct.setSTD_COST_UNIT_TYP("1");
         struct.setMODIFY_COUNT(null);
       
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
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
                  DA0010010Struct mPlantStruct = (DA0010010Struct) mPlantList.get(0);
                  struct.setPLANT_NAME(mPlantStruct.getPLANT_NAME());
                 }
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // 「削除済表示」チェックボックスを元に検索条件を設定
                 if ("true".equals(struct.getDispDeleteFlg())) {
                  struct.setDEL_FLG("1");
                 } else {
                  struct.setDEL_FLG("0");
                 }
                 int maxLine = sp.getMaxLine(conn, 10);
     			 if(maxLine != 0) {
     				struct.setROW_COUNT(String.valueOf(maxLine));
     			 } else {
     				struct.setROW_COUNT(null);
     			 }
     			 List viewList = entity.mViewCnt.read(conn, struct);
     			 long rowCount = Long.parseLong(((DA0010010Struct)viewList.get(0)).getl_COUNT());
     			 // 一覧データが0件の場合
                 if (rowCount==0) {
                  // ｢削除済表示｣=onの場合はエラーメッセージを表示（offの場合は行追加が出来るでエラーにしない）
                  if ("true".equals(struct.getDispDeleteFlg())) {
                   setErrorMessage("ZZ06001");
                   setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                   setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getw_CS_PROC_CD());
                   setErrorParameter("M_CS_PROC", "WS_CD", struct.getw_WS_CD());
                  }
                  readStatus = NOT_FOUND;
                  return;
                 }
                 // 最大表示行数チェック
                 if ((maxLine != 0) && (rowCount == maxLine +1)) {
                  setErrorMessage("ZZ01115", "" + maxLine);
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getw_CS_PROC_CD());
                  setErrorParameter("M_CS_PROC", "WS_CD", struct.getw_WS_CD());
                  readStatus = TOO_MANY;
                  return;
                 }
     			 // 一覧情報を取得
                 viewList = entity.mView.read(conn, struct);
                 // 画面に表示
                 setList(viewList);
                 DA0010010Struct TempStruct;
                 for (int i = 0; i < list.size(); i++) {
			     TempStruct = (DA0010010Struct)list.get(i);
    			 TempStruct.setl_OUTSIDE_TYP_DN(this.multcombo("OUTSIDE_TYP",TempStruct.getl_OUTSIDE_TYP_DN()));
			    }
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");
			//{{user_implement_dev:<controlLineInsert>
                initializeDetailSub1();
              
                readStatus = NORMAL;
                //}}user_implement_dev:<controlLineInsert>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineInsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");
			//{{user_implement_dev:<controlLineUpdate>
                try {
                 // 画面明細部をクリア
                 initializeDetailSub1();
              
                 // データを取得
                 List formList = entity.mFormSub1.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
              
                  readStatus = ERROR;
                  return;
                 }
                 DA0010010Struct formStruct = (DA0010010Struct) formList.get(0);
              
                 setStructSub1(formStruct);
              
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineUpdate>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineUpdate");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
                try {
                 // 画面明細部をクリア
                 initializeDetailSub1();
              
                 // データを取得
                 List formList = entity.mFormSub1.read(conn, struct);
                 if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
              
                  readStatus = ERROR;
                  return;
                 }
                 DA0010010Struct formStruct = (DA0010010Struct) formList.get(0);
              
                 setStructSub1(formStruct);
              
                 readStatus = NORMAL;
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
                try {
                 // 一覧のキー情報をフォームのキー情報にセット
                 struct.setCS_PROC_CD(struct.getl_CS_PROC_CD());
              
                 // 更新する[工程マスタ]レコードをロック
                 List lockedList = entity.mM_CS_PROC_Lock.read(conn, struct);
                 // [工程マスタ]が存在しない場合はエラー
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [工程マスタ]."更新数"が読込時の｢更新数｣と異なる場合はエラー
                 DA0010010Struct lockedStruct = (DA0010010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getl_MODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PROC", "MODIFY_COUNT", lockedStruct.getCS_PROC_CD());
                  return;
                 }
                 // ｢工場コード｣｢工程コード｣で[加工費マスタ]を検索し、"削除フラグ"=0のレコードが1件以上存在する場合
                 List mProcCostList = entity.mM_PROC_COST.read(conn, struct);
                 if (!mProcCostList.isEmpty()) {
                  setErrorMessage("DA01001");
                  setErrorParameter("M_PROC_COST", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_PROC_COST", "CS_PROC_CD", struct.getCS_PROC_CD());
                 }
                 // ｢工場コード｣｢工程コード｣で[購入品マスタ]を検索し、"削除フラグ"=0のレコードが1件以上存在する場合
                 List mCsPuchList = entity.mM_CS_PUCH.read(conn, struct);
                 if (!mCsPuchList.isEmpty()) {
                  setErrorMessage("DA01002");
                  setErrorParameter("M_CS_PUCH", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PUCH", "CS_PROC_CD", struct.getCS_PROC_CD());
                 }
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // [工程マスタ]を更新（論理削除）
                 entity.mM_CS_PROC_Delete.update(conn, struct);
              
                 // 最新の情報で再読み込み
                 controlSelect();
              
                 // コミット
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}

	/**
	 * 行削除取消ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineCancelDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCancelDelete");
			//{{user_implement_dev:<controlLineCancelDelete>
                try {
                 // 一覧のキー情報をフォームのキー情報にセット
                 struct.setCS_PROC_CD(struct.getl_CS_PROC_CD());
              
                 // 更新する[工程マスタ]レコードをロック
                 List lockedList = entity.mM_CS_PROC_Lock.read(conn, struct);
                 // [工程マスタ]が存在しない場合はエラー
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  return;
                 }
                 // [工程マスタ]."更新数"が読込時の｢更新数｣と異なる場合はエラー
                 DA0010010Struct lockedStruct = (DA0010010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getl_MODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setErrorParameter("M_CS_PROC", "MODIFY_COUNT", lockedStruct.getCS_PROC_CD());
                  return;
                 }
              
                 // [工程マスタ]を更新（削除取消）
                 entity.mM_CS_PROC_CancelDelete.update(conn, struct);
              
                 // 最新の情報で再読み込み
                 controlSelect();
              
                 // コミット
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlLineCancelDelete>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCancelDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                // 画面を初期化
                initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
                try {
                 // 登録するキーで[工程マスタ]を検索
                 List mCsProcList = entity.mM_CS_PROC.read(conn, struct);
                 // 登録データがすでに存在する場合はエラー
                 if (!mCsProcList.isEmpty()) {
                  setErrorMessage("ZZ01102");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setNextUrl("/DA0010011.jsp");
                  return;
                 }
                 // ｢作業区コード｣が入力された場合、以下のチェックを行う
                 if (struct.getWS_CD() != null && struct.getWS_CD().length() != 0) {
                  // [作業区マスタ]存在しない場合はエラー
                  List mWsList = entity.mM_WS.read(conn, struct);
                  if (mWsList.isEmpty()) {
                   setErrorMessage("ZZ11007");
                   setErrorParameter("M_WS", "WS_CD", struct.getWS_CD());
                  }
                 }
                 // ｢取引先コード｣又は｢部門コード｣が入力されている場合は会社コードをセットする。
                 if ((struct.getVEND_CD() != null && struct.getVEND_CD().length() != 0)
                  || (struct.getORG_CD() != null && struct.getORG_CD().length() != 0)) {
                  struct.setCOMPANY_CD(_companyCd);
                 } else {
                  struct.setCOMPANY_CD(null);
                 }
                 // ｢取引先コード｣が入力された場合、以下のチェックを行う
                 if (struct.getVEND_CD() != null && struct.getVEND_CD().length() != 0) {
                  // [取引先マスタ]存在しない場合はエラー
                  List mVendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (mVendCtrlList.isEmpty()) {
                   setErrorMessage("ZZ11005");
                   setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
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
              
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  setNextUrl("/DA0010011.jsp");
                  return;
                 }
              
                 // [工程マスタ]を登録
                 entity.mM_CS_PROC.create(conn, struct);
              
                 // 登録データを画面再表示
                 controlSelect();
              
                 // コミット
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlInsert>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
                try {
                 // 更新する[工程マスタ]レコードをロック
                 List lockedList = entity.mM_CS_PROC_Lock.read(conn, struct);
                 // 更新データが存在しない場合はエラー
                 if (lockedList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setNextUrl("/DA0010011.jsp");
                  return;
                 }
                 // [工程マスタ]."更新数"が読込時の｢更新数｣と異なる場合はエラー
                 DA0010010Struct lockedStruct = (DA0010010Struct) lockedList.get(0);
                 if (!lockedStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("M_CS_PROC", "PLANT_CD", struct.getPLANT_CD());
                  setErrorParameter("M_CS_PROC", "CS_PROC_CD", struct.getCS_PROC_CD());
                  setNextUrl("/DA0010011.jsp");
                  return;
                 }
                 // ｢作業区コード｣が入力された場合、以下のチェックを行う
                 if (struct.getWS_CD() != null && struct.getWS_CD().length() != 0) {
                  // [作業区マスタ]存在しない場合はエラー
                  List mWsList = entity.mM_WS.read(conn, struct);
                  if (mWsList.isEmpty()) {
                   setErrorMessage("ZZ11007");
                   setErrorParameter("M_WS", "WS_CD", struct.getWS_CD());
                  }
                 }
                 // ｢取引先コード｣又は｢部門コード｣が入力されている場合は会社コードをセットする。
                 if ((struct.getVEND_CD() != null && struct.getVEND_CD().length() != 0)
                  || (struct.getORG_CD() != null && struct.getORG_CD().length() != 0)) {
                  struct.setCOMPANY_CD(_companyCd);
                 } else {
                  struct.setCOMPANY_CD(null);
                 }
                 // ｢取引先コード｣が入力された場合、以下のチェックを行う
                 if (struct.getVEND_CD() != null && struct.getVEND_CD().length() != 0) {
                  // [取引先マスタ]存在しない場合はエラー
                  List mVendCtrlList = entity.mM_VEND_CTRL.read(conn, struct);
                  if (mVendCtrlList.isEmpty()) {
                   setErrorMessage("ZZ11005");
                   setErrorParameter("M_VEND_CTRL", "COMPANY_CD", struct.getCOMPANY_CD());
                   setErrorParameter("M_VEND_CTRL", "VEND_CD", struct.getVEND_CD());
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
                 // エラーがあったら処理を中断
                 if (msgStruct.hasError()) {
                  setNextUrl("/DA0010011.jsp");
                  return;
                 }
              
                 // [工程マスタ]を更新
                 entity.mM_CS_PROC.update(conn, struct);
              
                 // 更新したデータを再検索して画面に表示
                 controlSelect();
              
                 // コミット
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlReturn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlReturn");
			//{{user_implement_dev:<controlReturn>
                controlSelect();
                //}}user_implement_dev:<controlReturn>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlReturn");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                try {
                 // 会社コードを取得
                 _companyCd = SystemInformation.getSysMyCompanyCd();
                 if (_companyCd == null) {
                  throw new ExpjException("DA00008");
                 }
              
                 // コンボボックスデータの取得
                 ComboBox comboBox = new ComboBox(conn, sysUSER_CD);
                 _outsideTypComboStruct = comboBox.getData("OUTSIDE_TYP");
                 _stdCostUnitTypComboStruct = comboBox.getData("STD_COST_UNIT_TYP");
                 comboBox.setConnection(null);
                 // コンボボックスデータの設定
                 struct.setList_OUTSIDE_TYP_val(_outsideTypComboStruct.getValList());
                 struct.setList_OUTSIDE_TYP_name(_outsideTypComboStruct.getExplanList());
                 struct.setList_STD_COST_UNIT_TYP_val(_stdCostUnitTypComboStruct.getValList());
                 struct.setList_STD_COST_UNIT_TYP_name(_stdCostUnitTypComboStruct.getExplanList());
              
                 // 画面を初期化
                 initializeAll();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.DA0010");
		logger.entering("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                struct.setList_OUTSIDE_TYP_val(_outsideTypComboStruct.getValList());
                struct.setList_OUTSIDE_TYP_name(_outsideTypComboStruct.getExplanList());
                struct.setList_STD_COST_UNIT_TYP_val(_stdCostUnitTypComboStruct.getValList());
                struct.setList_STD_COST_UNIT_TYP_name(_stdCostUnitTypComboStruct.getExplanList());
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("DA0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("LineCancelDelete") ) {
				controlLineCancelDelete();
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
//			throw new FoundationException("DA0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0010010-E999","CSVの出力処理"));
			throw new FoundationException("DA0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0010010-E999","システム日付の取得処理"));
				throw new FoundationException("DA0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("DA0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("DA0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected DA0010010Entity entity;
	protected DA0010010Struct struct;
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

		entity = new DA0010010Entity();
		struct = new DA0010010Struct();

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
	 * DA0010010クラスの標準コンストラクタ
	 */
	public DA0010010Control() throws BusinessProcessException, FoundationException
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
				DA0010010Struct key = (DA0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DispDeleteFlg") && key.getDispDeleteFlg() != null) {
					msgKey.setKeyValue("DispDeleteFlg", key.getDispDeleteFlg());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("STD_COST_UNIT_TYP_name") && key.getSTD_COST_UNIT_TYP_name() != null) {
					msgKey.setKeyValue("STD_COST_UNIT_TYP_name", key.getSTD_COST_UNIT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("STD_COST_UNIT_TYP_val") && key.getSTD_COST_UNIT_TYP_val() != null) {
					msgKey.setKeyValue("STD_COST_UNIT_TYP_val", key.getSTD_COST_UNIT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_CS_PROC_CD") && key.getl_CS_PROC_CD() != null) {
					msgKey.setKeyValue("l_CS_PROC_CD", key.getl_CS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CS_PROC_NAME") && key.getl_CS_PROC_NAME() != null) {
					msgKey.setKeyValue("l_CS_PROC_NAME", key.getl_CS_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WS_NAME") && key.getl_WS_NAME() != null) {
					msgKey.setKeyValue("l_WS_NAME", key.getl_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN") && key.getl_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_DN", key.getl_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CS_PROC_CD") && key.getw_CS_PROC_CD() != null) {
					msgKey.setKeyValue("w_CS_PROC_CD", key.getw_CS_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WS_CD") && key.getw_WS_CD() != null) {
					msgKey.setKeyValue("w_WS_CD", key.getw_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
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
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
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
				if(msgKeyType.containsKeyColumn("STD_COST_OF_MONTH") && key.getSTD_COST_OF_MONTH() != null) {
					msgKey.setKeyValue("STD_COST_OF_MONTH", key.getSTD_COST_OF_MONTH());
				}
				if(msgKeyType.containsKeyColumn("STD_COST_UNIT_TYP") && key.getSTD_COST_UNIT_TYP() != null) {
					msgKey.setKeyValue("STD_COST_UNIT_TYP", key.getSTD_COST_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
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
					DA0010010Struct key = new DA0010010Struct();
					if(msgKeyType.containsKeyColumn("DispDeleteFlg")) {
						key.setDispDeleteFlg(msgKey.getKeyValue("DispDeleteFlg"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("STD_COST_UNIT_TYP_name")) {
						key.setSTD_COST_UNIT_TYP_name(msgKey.getKeyValue("STD_COST_UNIT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("STD_COST_UNIT_TYP_val")) {
						key.setSTD_COST_UNIT_TYP_val(msgKey.getKeyValue("STD_COST_UNIT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_CS_PROC_CD")) {
						key.setl_CS_PROC_CD(msgKey.getKeyValue("l_CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CS_PROC_NAME")) {
						key.setl_CS_PROC_NAME(msgKey.getKeyValue("l_CS_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_NAME")) {
						key.setl_WS_NAME(msgKey.getKeyValue("l_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN")) {
						key.setl_OUTSIDE_TYP_DN(msgKey.getKeyValue("l_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CS_PROC_CD")) {
						key.setw_CS_PROC_CD(msgKey.getKeyValue("w_CS_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WS_CD")) {
						key.setw_WS_CD(msgKey.getKeyValue("w_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
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
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
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
					if(msgKeyType.containsKeyColumn("STD_COST_OF_MONTH")) {
						key.setSTD_COST_OF_MONTH(msgKey.getKeyValue("STD_COST_OF_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("STD_COST_UNIT_TYP")) {
						key.setSTD_COST_UNIT_TYP(msgKey.getKeyValue("STD_COST_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
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
