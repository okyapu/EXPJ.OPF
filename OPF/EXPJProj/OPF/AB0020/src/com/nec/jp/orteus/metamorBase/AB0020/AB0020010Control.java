/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AB0020/src/com/nec/jp/orteus/metamorBase/AB0020/AB0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AB0020;

import com.nec.jp.orteus.metamorBase.AB0020.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.Numbering;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
import com.nec.jp.orteus.metamorBase.common01.util.DefaultPeriod;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AB0020010Control
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
       
        public AB0020010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
       
       //-----------------------------------------------------------------------------
       
        /** 品目手配区分 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /** 品目手配区分設定
         * @param コンボボックスデータ
        */
        public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** 品目手配区分取得
         * @return 品目手配区分のコンボボックスデータ
        */
        public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }
       
       
        /** 内外作区分 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /** 内外作区分設定
         * @param コンボボックスデータ
        */
        public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** 内外作区分取得
         * @return 内外作区分のコンボボックスデータ
        */
        public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }
       
       
        /** 在庫数単位区分 */
        private ComboStruct _UNIT_QTY_TYP = new ComboStruct();
       
        /** 在庫数単位区分設定
         * @param コンボボックスデータ
        */
        public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }
       
        /** 在庫数単位区分取得
         * @return 在庫数単位区分のコンボボックスデータ
        */
        public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }
       
       
        /** 製番種別 */
        private ComboStruct _JOB_ODR_TYP = new ComboStruct();
       
        /** 製番種別設定
         * @param コンボボックスデータ
        */
        public void setJOB_ODR_TYP(ComboStruct combo){ _JOB_ODR_TYP = combo; }
       
        /** 製番種別取得
         * @return 製番種別のコンボボックスデータ
        */
        public ComboStruct getJOB_ODR_TYP(){ return _JOB_ODR_TYP; }
       
       
        /** 計画タイプ */
        private ComboStruct _PLAN_TYP = new ComboStruct();
       
        /** 計画タイプ設定
         * @param コンボボックスデータ
        */
        public void setPLAN_TYP(ComboStruct combo){ _PLAN_TYP = combo; }
       
        /** 計画タイプ取得
         * @return 計画タイプのコンボボックスデータ
        */
        public ComboStruct getPLAN_TYP(){ return _PLAN_TYP; }
       
       
        /** 製番状態区分 */
        private ComboStruct _JOB_ODR_STS_TYP = new ComboStruct();
       
        /** 製番状態区分設定
         * @param コンボボックスデータ
        */
        public void setJOB_ODR_STS_TYP(ComboStruct combo){ _JOB_ODR_STS_TYP = combo; }
       
        /** 製番状態区分取得
         * @return 製番状態区分のコンボボックスデータ
        */
        public ComboStruct getJOB_ODR_STS_TYP(){ return _JOB_ODR_STS_TYP; }
       
       
        /** 製番処理区分 */
        private ComboStruct _JOB_ODR_EXP_TYP = new ComboStruct();
       
        /** 製番処理区分設定
         * @param コンボボックスデータ
        */
        public void setJOB_ODR_EXP_TYP(ComboStruct combo){ _JOB_ODR_EXP_TYP = combo; }
       
        /** 製番処理区分取得
         * @return 製番処理区分のコンボボックスデータ
        */
        public ComboStruct getJOB_ODR_EXP_TYP(){ return _JOB_ODR_EXP_TYP; }
       
       
        /** 製番削除フラグ */
        private ComboStruct _JOB_ODR_DEL_FLG = new ComboStruct();
       
        /** 製番削除フラグ設定
         * @param コンボボックスデータ
        */
        public void setJOB_ODR_DEL_FLG(ComboStruct combo){ _JOB_ODR_DEL_FLG = combo; }
       
        /** 製番削除フラグ取得
         * @return 製番削除フラグのコンボボックスデータ
        */
        public ComboStruct getJOB_ODR_DEL_FLG(){ return _JOB_ODR_DEL_FLG; }
       
    	/** シスパラ②[受注時製番登録]*/
    	private String PRD_REQ_JOB_ODR_TYP_2;
       //-----------------------------------------------------------------------------
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
       //-----------------------------------------------------------------------------
       
        // 更新対象の製番No
        private Integer _checkNo = null;
        
        /** 更新対象の製番No取得
         * @return 更新対象の製番No
        */
        public Integer getCheckNumber(){ return _checkNo; }
        
        /** 更新対象の製番No設定
         * @param 更新対象の製番No
        */
        public void setCheckNumber(Integer no){ _checkNo = no; }
       
       
        /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
        private AB0020010Struct _keyStruct = new AB0020010Struct();
       
        /** キー情報Structの取得 */
        public AB0020010Struct getKeyStruct(){ return _keyStruct; }
        
        /** キー情報Structの設定 */
        public void setKeyStruct(AB0020010Struct struct){ _keyStruct.copy(struct); }
       
       
       //-----------------------------------------------------------------------------
       
        /** 製番リスト */
        private List _jobOdrList = new ArrayList(0);
       
        /** 
         * 製番リスト取得 
         * @return 製番リスト
        */
        public List getJobOdrList(){ return _jobOdrList; }
       
        /** 
         * 製番リスト設定
         * @param 製番リスト
         */
        public void setJobOdrList(List list){ _jobOdrList = list; }
       
       
       //-----------------------------------------------------------------------------
       
        /** [システムパラメータ]製番削除フラグ */
        private String _sysJobOdrDelFlg = "0";
       
        /**
         * 製番削除フラグ設定
         * @param jobOdrDelFlg
         */
        public void setSysJobOdrDelFlg(String jobOdrDelFlg){ _sysJobOdrDelFlg = jobOdrDelFlg; }
       
        /**
         * 製番削除フラグ取得
         * @return String 製番削除フラグ
         */
        public String getSysJobOdrDelFlg(){ return _sysJobOdrDelFlg; }
       
        /** 製番状態区分 */
        private String _jobOdrStsTyp = "0";
       
        /**
         * 製番状態区分設定
         * @param jobOdrStsTyp
         */
        public void setJobOdrStsTyp(String jobOdrStsTyp){ _jobOdrStsTyp = jobOdrStsTyp; }
       
        /**
         * 製番状態区分取得
         * @return String 製番状態区分
         */
         public String getJobOdrStsTyp(){ return _jobOdrStsTyp; }
       
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
       
       //------------------------------------------------------------------------------
        // 製番の予定文字列表示用
       
        /** 製番の状態表示文字列 再計算する */
        private String _expectRecalc = null;
        /** 製番の状態表示文字列 削除する */
        private String _expectDelete = null;
       
        /**
         * 製番の予定表示文字列取得
         * @param p SYS_PARAMETERアクセッサ
         */
        private boolean getExpectString(PrivateConfig p)
        {
         try{
          if((_expectDelete = p.getString("JOB_ODR_EXPECT_DELETE")) == null
          || (_expectRecalc = p.getString("JOB_ODR_EXPECT_RECALC")) == null)
           return false;
         }
         catch(Exception e){
          e.printStackTrace();
          return false;
         }
         return true;
        }
        /**
         * 製番の予定表示文字列作成
         * @param stsTyp 製番状態区分(STS_TYP)
         * @param expTyp 製番処理区分(EXP_TYP)
         * @param delFlg 製番削除フラグ(DEL_FLG)
         * @return 製番の予定文字列  作成失敗時null
         */
        private String makeExpectString(int stsTyp, int expTyp, int delFlg)
        {
         if(_expectDelete == null || _expectRecalc == null)  return null;
       
         AB0020ExpectJudge judge = new AB0020ExpectJudge();
         if(judge.expect(stsTyp,expTyp,delFlg) == false)  return null;
       
         String expect = null;
         if(judge.isRecalculate() == AB0020ExpectJudge.YES)
          expect = _expectRecalc;
         else if(judge.isDelete() == AB0020ExpectJudge.YES)
          expect = _expectDelete;
         else
          expect = new String("");
         return expect;
        }
       
       //-----------------------------------------------------------------------------
       
        /**
         * 品目情報設定処理
         * @param w_itemList 品目情報リスト
         */
        private void setItemInfo(List w_itemList){
         AB0020010Struct itemStruct = (AB0020010Struct)w_itemList.get(0);
         _keyStruct.setITEM_NAME(itemStruct.getITEM_NAME());
         _keyStruct.setDRAW_CD(itemStruct.getDRAW_CD());
         _keyStruct.setSPEC(itemStruct.getSPEC());
         _keyStruct.setMRP_ODR_TYP(itemStruct.getMRP_ODR_TYP());
         _keyStruct.setOUTSIDE_TYP(itemStruct.getOUTSIDE_TYP());
         _keyStruct.setITEM_SPOIL(itemStruct.getITEM_SPOIL());
         _keyStruct.setUNIT_QTY_TYP(itemStruct.getUNIT_QTY_TYP());
         _keyStruct.setMUL_ODR_QTY(itemStruct.getMUL_ODR_QTY());
         _keyStruct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
        }
       
        /**
         * 品目情報のフラグの表示を設定
         * @param s フラグの値が設定されている情報
         */
        private void setTypeValueAboutItem(AB0020010Struct s)
        {
         s.setMRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
        }
       
        /**
         * 作業系列情報のフラグの表示を設定
         * @param s フラグの値が設定されている情報
         */
        private void setTypeValueAboutProcGroup(AB0020010Struct s)
        {
         s.setJOB_ODR_NAME(getTypeName(_JOB_ODR_TYP,s.getJOB_ODR_TYP()));
         s.setPLAN_NAME(getTypeName(_PLAN_TYP,s.getPLAN_TYP()));
         s.setJOB_ODR_STS_NAME(getTypeName(_JOB_ODR_STS_TYP,s.getJOB_ODR_STS_TYP()));
        }
         
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param intType 区分コード
         * @return 区分名称。該当するデータがなかった場合は区分コードを返す
         */
        private String getTypeName(ComboStruct comboStruct, Integer intType)
        {
         if(comboStruct == null || intType == null)  return null;
         String strTyp = TypeConverter.sanitizer(intType);
         String strTypName = strTyp;
         for(int i = 0; i < comboStruct.getValList().size(); i++){
          if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
           strTypName = (String)(comboStruct.getExplanList().get(i));
           break;
          }
         }
         if(strTypName == null) strTypName = strTyp;
         return strTypName;
        }
       
         
           /**
            * サブ画面情報の設定
            *
            * @param temp_struct AB0020010Struct temp_struct
            * @return なし
            */
        private void setSubParamInfo(AB0020010Struct temp_struct)
        {
         // 工場コード
         struct.setPLANT_CD(temp_struct.getPLANT_CD());
         // 工場名
         struct.setPLANT_NAME(temp_struct.getPLANT_NAME());
         // 品目番号
         struct.setITEM_CD(temp_struct.getITEM_CD());
         // 品目名
         struct.setITEM_NAME(temp_struct.getITEM_NAME());
         // 生産計画期間(FROM)
         struct.setw_DATE_FROM(temp_struct.getw_DATE_FROM());
         // 生産計画期間(TO)
         struct.setw_DATE_TO(temp_struct.getw_DATE_TO());
         // 在庫数単位区分
         struct.setUNIT_QTY_TYP(temp_struct.getUNIT_QTY_TYP());
         // 計量単位
         struct.setSTOCK_UNIT(temp_struct.getSTOCK_UNIT());
        }
       //------------------------------------------------------------------------------
       
        /*
         * デフォルト値設定処理
         */
        private void setDefaultData() throws ExpjException
        {
         // 自工場コード設定
         _keyStruct.setPLANT_CD(getsysPLANT_CD());
         
         // デフォルト生産計画期間取得設定
         setDefaultPeriodDate();
        	
         struct.setTIME_CTRL(_flgTimeCtrl);
        }
       
        /*
         * デフォルト生産計画期間日付取得設定
         *
         * @return	なし
         */
        private void setDefaultPeriodDate() throws ExpjException
        {
         
         try
         {
          DateCtrl dctrl = new DateCtrl(conn);
          DateConverter dc = new DateConverter();
          String streBusinessOprDate = dctrl.getBusinessOprDate(getsysPLANT_CD());
          Date dateBusinessOprDate = dc.str2date(streBusinessOprDate);
       
          // デフォルト生産計画期間日付取得
          String strDefDate[] = {"", ""};
          boolean bResult = false;
       
          DefaultPeriod dp = new DefaultPeriod();
          bResult = dp.get(conn, dateBusinessOprDate, strDefDate);
          
          if(bResult == true)
          {
           // 取得成功
           _keyStruct.setw_DATE_FROM(strDefDate[0]);
           _keyStruct.setw_DATE_TO(strDefDate[1]);
          }
          else
          {
           // 取得失敗
           ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
           sysLog.severe(emsg, getsysUSER_CD());
           ExpjException ee = new ExpjException(emsg);
           
           throw ee;
          }
       
         }
         catch(SQLException se)
         {
          setSqlExceptionMsg(se);
         }
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
    	 * @param 出力メッセージ
    	 */
    	private void setErrorMessage(String code, String value, String message) {
    		ExpjMessage emsg = new ExpjMessage(code, value);
    		msgStruct.addError(emsg);
    		sysLog.warning(emsg, getsysUSER_CD());
            emsg = new ExpjMessage( "ZZ01006", message );
            msgStruct.addError( emsg );
            sysLog.warning(emsg, getsysUSER_CD());
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
		
       /** 時刻管理用フラグ */
		private String _flgTimeCtrl = null;
		
		//add 2008/3/27
		/** インストールオプションテーブルより'JA*','JF*'があるかどうか用 */
		private String _SysInstallOptions = null;	
		private String _SysInstallOptions_JF = null;	

		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //---------------------------------------------------------------------
                 
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // 製番リストクリア
                 _jobOdrList.clear();
              
                 List calList = null; 	// カレンダ一覧
                 DateConverter dc = new DateConverter();
              
                 // 工場情報取得とチェック
                 List plantList = entity.mselectM_PLANT.read(conn, struct);
                 if(plantList.size() <= 0){
                  Message = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
                  setErrorMessage("AB01001", Message);
                  
                  // 工場コードエラーのため工場名に空白を設定
                  _keyStruct.setPLANT_NAME("");
                 }
                 else{
                  AB0020010Struct plantStruct = (AB0020010Struct)plantList.get(0);
                  _keyStruct.setPLANT_NAME(plantStruct.getPLANT_NAME());
                 }
              
                 // 品目情報取得とチェック
                 List itemList = entity.mselectM_ITEM.read(conn, struct);
                 if(itemList.size() <= 0){
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  setErrorMessage("AB01002", Message);
              
                  // 品目番号エラーのため品目情報に空白を設定
                  struct.clearItem(_keyStruct);
                 }
                 else
                 {

//                	 2008/08/08 ADD S.AZUMA START
                	                 if(((AB0020010Struct)itemList.get(0)).getw_MANHOUR_TYP().equals("1")) {
                	                  // 読込処理失敗：品目番号に、工数管理品目は指定できません。
                	                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                	                  setErrorMessage("AB00053", Message);
                	                 }
//                	 2008/08/08 ADD S.AZUMA END
                	              
                  // 品目手配区分不正だが品目情報は表示する
                  setItemInfo(itemList);
                  // [保管区別品目在庫]の"品目別手持在庫数量"算出
                  String d_itemStock = "0.0";
                  List stockHandList = 
                   entity.mselectT_ITEM_STOCK_stock_on_hand_qty_sum.read(conn, struct);
                  if(stockHandList.size() > 0){
                   AB0020010Struct stockStruct = (AB0020010Struct)stockHandList.get(0);
                   if(stockStruct.getSTOCK_ON_HAND_QTY() != null)
                    d_itemStock = stockStruct.getSTOCK_ON_HAND_QTY();
                  }
              
                  // 手持在庫設定
                  _keyStruct.setHAND_STOCK(d_itemStock);
                  
                  if(((AB0020010Struct)itemList.get(0)).getMRP_ODR_TYP().intValue() != 1 &&
                   ((AB0020010Struct)itemList.get(0)).getMRP_ODR_TYP().intValue() != 2){
              
                   listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_ITEM.MRP_ODR_TYP:" + ((AB0020010Struct)itemList.get(0)).getMRP_ODR_TYP());
              
                   setErrorMessage("AB00016", listMessage);
                  }
                 }
              
                 // 以下の処理は工場情報および品目情報が取得できている場合に行う
                 int Checkfg =0;
                 boolean calResult = true;
                 if(itemList.size() > 0  && plantList.size() > 0){
                  // 計画期間チェック
                  Date fromDate = dc.str2date(struct.getw_DATE_FROM());
                  Date toDate = dc.str2date(struct.getw_DATE_TO());
                  _keyStruct.setd_DATE_TO(toDate);
                  _keyStruct.setd_DATE_FROM(fromDate);
                  //カレンダ取得処理（検索キー：品目番号）
                  List dateList = entity.mselectM_CAL_max_min1.read(conn, struct);
                  if(dateList.size() > 0)
                  {
                   AB0020010Struct dateStruct = (AB0020010Struct)dateList.get(0);
              
                   if(dateStruct.getMIN_DLV_DATE() != null && 
                     dateStruct.getMAX_DLV_DATE() != null){
                     
                    Date minDate = dc.str2date(dateStruct.getMIN_DLV_DATE());
                    Date maxDate = dc.str2date(dateStruct.getMAX_DLV_DATE());
              
                    if((minDate.getTime() > fromDate.getTime()) || 
                      (maxDate.getTime() < toDate.getTime())){
                     // 計画期間がカレンダの範囲外
                     		Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                     		setErrorMessage("AB00011", Message);
                    }
                   }
                   else{
                   	// カレンダ取得失敗(検索キー：品目番号）
                    calResult = false;
                   }
                  }
                  else{
                   // カレンダ取得失敗(検索キー：品目番号）
                   calResult = false;
                  }
                   //以下の処理は品目番号でのカレンダ取得に失敗したときに行う
                  if(calResult ==false){
                  	    calResult = true;
                  	    Checkfg = 1;
                        dateList = entity.mselectM_CAL_max_min.read(conn, struct);
                  		if(dateList.size() > 0)
                  		{
                  		 AB0020010Struct dateStruct = (AB0020010Struct)dateList.get(0);
              
                   		if(dateStruct.getMIN_DLV_DATE() != null && 
                     		dateStruct.getMAX_DLV_DATE() != null){
                     
                    		Date minDate = dc.str2date(dateStruct.getMIN_DLV_DATE());
                    		Date maxDate = dc.str2date(dateStruct.getMAX_DLV_DATE());
              
                    		if((minDate.getTime() > fromDate.getTime()) || 
                      		(maxDate.getTime() < toDate.getTime())){
                     		// 計画期間がカレンダの範囲外
                     		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                     		setErrorMessage("AB00011", Message);
                     		calResult = false;
                    		}
                   		}
                   		else{
                    		// カレンダ取得失敗(検索キー：工場番号）
                    		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                    		setErrorMessage("AB00011", Message);
                    		calResult = false;
                   		}
                  		}
                  		else{
                   		// カレンダ取得失敗(検索キー：工場番号）
                   		Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                   		setErrorMessage("AB00011", Message);
                   		calResult = false;
                  		}
                  		}
                  // 業務運用日取得
                  dateList = entity.mselectSYS_DATE_CTRL.read(conn, struct);
                  if(dateList.size() > 0){
                   AB0020010Struct dateStruct = (AB0020010Struct)dateList.get(0);
                   Date businessDay = dateStruct.getBUSINESS_OPR_DATE();
                   _keyStruct.setBUSINESS_OPR_DATE(businessDay);
                  }
                  else{
                   Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                   setErrorMessage("AB00026", Message);
                  }
              
                  // カレンダ一覧取得(FROM～TO間)
                  if(calResult == true){
                  	//品目での取得か工場での取得かを判定
                  	if(Checkfg == 0){
                   		calList = entity.mselectM_CAL1.read(conn, struct);
                  	}else{
                  		calList = entity.mselectM_CAL.read(conn, struct);
                  	}
                   if(calList.size() <= 0){
                    Message = "SYS_DATE_CTRL.PLANT_CD:" + struct.getPLANT_CD();
                    setErrorMessage("AB00026", Message);
                   }
                  }
                 }
              
                 //====================================
                 //  最大計画期間（月）チェック
                 //====================================
                 // システムパラメータの最大表示期間（月）を取得
                 List maxMonthList = entity.mselectMAX_DISPLAY_MONTH_SERIAL.read(conn, struct);
                 String MAX_DISPLAY_MONTH_SERIAL = null;
                 if(maxMonthList.size() > 0){
                   AB0020010Struct maxMonthStruct = (AB0020010Struct)maxMonthList.get(0);
                   if(null == maxMonthStruct.gets_MAX_DISPLAY_MONTH_SERIAL()){
                     MAX_DISPLAY_MONTH_SERIAL = "0";
                   }else{
                     MAX_DISPLAY_MONTH_SERIAL = maxMonthStruct.gets_MAX_DISPLAY_MONTH_SERIAL();
                   }
                 }
                 if(!"0".equals(MAX_DISPLAY_MONTH_SERIAL)){
                   Date dateFrom = dc.str2date(struct.getw_DATE_FROM());
                   Date dateTo = dc.str2date(struct.getw_DATE_TO());
                   Calendar calFrom = Calendar.getInstance();
                   Calendar calTo = Calendar.getInstance();
                   calFrom.setTime(dateFrom);
                   calTo.setTime(dateTo);
                   calFrom.add(Calendar.MONTH, Integer.parseInt(MAX_DISPLAY_MONTH_SERIAL));
                   long lForm = calFrom.getTimeInMillis();
                   long lTo = calTo.getTimeInMillis();
                   // 最大表示期間を超えるとき
                   if(lForm <= lTo){
                     // エラーメッセージ出力
                     ExpjMessage emsg = new ExpjMessage( "AB00050", MAX_DISPLAY_MONTH_SERIAL );
                     msgStruct.addError( emsg );	// エラーメッセージとして登録
                     sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
                   }
                 }
                 
                 
                 setTypeValueAboutItem(_keyStruct);
                 struct.copy(_keyStruct);
                 
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
              
                  for(int i = 0; i < calList.size(); i++)
                  {
                   AB0020010Struct calStruct = (AB0020010Struct)calList.get(i);
                   struct.setJOB_ODR_DLV_DATE(calStruct.getJOB_ODR_DLV_DATE());
              
                   // 製番取得
                   List jobList;
                   if(_flgTimeCtrl.equals("true")){
                      jobList = entity.mselect.read(conn, struct);
                   }else{
					  jobList = entity.mselect2.read(conn, struct);
                   }
                   if(jobList.size() <= 0){
                    // 製番一覧追加
                    calStruct.setJOB_ODR_TYP((Integer)null);
                    calStruct.setPLAN_TYP((Integer)null);
                    calStruct.setJOB_ODR_QTY((String)null);
                    calStruct.setd_JOB_ODR_DLV_DATE(calStruct.getJOB_ODR_DLV_DATE());
                    _jobOdrList.add(calStruct);
                   }
                   else{
                    for(int t = 0; t < jobList.size(); t++)
                    {
                     // 受注数算出
                     AB0020010Struct workStruct = (AB0020010Struct)jobList.get(t);
                     List workList = entity.mselectT_JOB_ODR_ODR_ALC_ALCD_QTY.read(conn, workStruct);
                     if(workList.size() <= 0)
                      workStruct.setALCD_QTY(new String("0.0"));
                     else{
                      AB0020010Struct orderStruct = (AB0020010Struct)workList.get(0);
                      if(orderStruct.getALCD_QTY() != null)
                       workStruct.setALCD_QTY(orderStruct.getALCD_QTY());
                      else
                       workStruct.setALCD_QTY(new String("0.0"));
                     }
              
                     // コンボボックスのデータ設定
                     setTypeValueAboutProcGroup((AB0020010Struct)(jobList.get(t)));
                     
                     // 引当可能数算出
                     workStruct.setALCD_ENABLE_QTY(new String(Calculate.subtract(
                         workStruct.getJOB_ODR_QTY(), workStruct.getALCD_QTY())));
              
                     // 休日フラグ設定
                     workStruct.setHOLIDAY_FLG(calStruct.getHOLIDAY_FLG());
              
                     // 製番予定設定
                     workStruct.setJobOdrExpect(makeExpectString(workStruct.getJOB_ODR_STS_TYP().intValue(),
                      workStruct.getJOB_ODR_EXP_TYP().intValue(),workStruct.getJOB_ODR_DEL_FLG().intValue()));
              
                     // 製番一覧追加
                     workStruct.setd_JOB_ODR_DLV_DATE(workStruct.getJOB_ODR_DLV_DATE());
                     _jobOdrList.add(workStruct);
                    }
                   }
                  }
                  
                  list = _jobOdrList;
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }
                finally{
            	//add 2008/3/27↓
            	 struct.setSYS_INSTALL_OPTIONS(_SysInstallOptions);
            	//add 2008/3/27↓
				 struct.setOPTION_ID(_SysInstallOptions_JF);
            	 
                 if(msgStruct.sizeError() <= 0)
                 {
                  setReadStatus(NORMAL);
                 }
                 else
                 {
                  setReadStatus(INITIAL);
                 }
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
                //---------------------------------------------------------------------
              
                // 親画面の情報を設定
                struct.copy(_keyStruct);             
                 
                // 製番状態区分設定(1:所要量計算未対象)
                struct.setJOB_ODR_STS_TYP(AB0020Common._JOB_ODR_STS_TYP);
              
                // 手配数量設定(0.0)
                struct.setJOB_ODR_QTY(AB0020Common._JOB_ODR_QTY);
              
                //時刻管理フラグ設定
                struct.setTIME_CTRL(_flgTimeCtrl);
                
                //[受注登録時の製番採番方法]のパラメータ設定
                try {
                	
                    // -----2008/07/15 所要量計算（製番）の強化　ADD START BY NESJN
                	// 所要量計算実行中チェック
                    boolean odFlg = entity.mcheckSYS_OD_CALC_CTRL.check(conn,struct);
                    if(odFlg) {
                    	// 所要量計算実行中のためメンテナンスできません。
						setErrorMessage("AC00206");
						return;
                    }
                    
                    // -----2008/07/15 所要量計算（製番）の強化　ADD END BY NESJN
                	              	
					List sysparameterList = entity.mselectPRD_REQ_JOB_ODR_TYP_2.read(conn,struct);
					if(sysparameterList.isEmpty()){
						setErrorMessage("KQ00320");
						throw new ExpjException("KQ00320");
					}
					PRD_REQ_JOB_ODR_TYP_2 = ((AB0020010Struct)sysparameterList.get(0)).geth_PRD_REQ_JOB_ODR_TYP_2();
					if(!"0".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"1".equals(PRD_REQ_JOB_ODR_TYP_2)&&!"2".equals(PRD_REQ_JOB_ODR_TYP_2)){
						setErrorMessage("KQ00320");
						throw new ExpjException("KQ00320");
					}
					struct.seth_PRD_REQ_JOB_ODR_TYP_2(PRD_REQ_JOB_ODR_TYP_2);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					struct.setOPTION_ID(_SysInstallOptions_JF);
				}
				
				
				
                
                
				
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                //---------------------------------------------------------------------
              
                // 製番状態区分設定
                setJobOdrStsTyp(struct.getJOB_ODR_STS_NAME().substring(0,1));
              
                // 対象の製番情報コピー
                setSubParamInfo(_keyStruct);
                
                // 紐付済みの製番設定
                try {
    				//更新数チェック
    				List modifyList = entity.mselectT_JOB_ODR_modify.read(conn,struct);
    				if(null == modifyList || modifyList.size() == 0){
    					//データが存在しないのとき
						setErrorMessage("AC00017");
						return;
    				}
    				String tempModify =((AB0020010Struct)modifyList.get(0)).getMODIFY_COUNT();
    				if(!tempModify.equals(struct.getMODIFY_COUNT())){
    					//更新数同じではないのとき
						setErrorMessage("AC00017");
						return;    				
    				}
                	
                    // -----2008/07/15 所要量計算（製番）の強化　ADD START BY NESJN
                	// 所要量計算実行中チェック
                    boolean odFlg = entity.mcheckSYS_OD_CALC_CTRL.check(conn,struct);
                    if(odFlg) {
                    	// 所要量計算実行中のためメンテナンスできません。
						setErrorMessage("AC00206");
						return;
                    }
                    
                    // -----2008/07/15 所要量計算（製番）の強化　ADD END BY NESJN
                    
					List workList = entity.mselectT_JOB_ODR_ODR_ALC_JOB_ODR_CD.read(conn,struct);
					if(workList != null && !workList.isEmpty()){
						AB0020010Struct workStruct = (AB0020010Struct) workList.get(0);
						struct.seth_JOB_ODR_CD(workStruct.geth_JOB_ODR_CD());
					}
				} catch (FoundationException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally{
					struct.setOPTION_ID(_SysInstallOptions_JF);
				}
                //時刻管理フラグ設定
                struct.setTIME_CTRL(_flgTimeCtrl);
                //年月日・時分設定
				if((struct.getJOB_ODR_DLV_DATE()).length() == 16){
					struct.setJOB_ODR_DLV_DATE_TIME((struct.getJOB_ODR_DLV_DATE()).substring(11,13)+(struct.getJOB_ODR_DLV_DATE()).substring(14,16));
				}else{
					struct.setJOB_ODR_DLV_DATE_TIME("");
				}
                struct.setJOB_ODR_DLV_DATE((struct.getJOB_ODR_DLV_DATE()).substring(0,10));
                struct.setDEL_FLG("NULL");
                struct.setSTS_FLG("NULL");
                struct.setEXP_FLG("NULL");
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //---------------------------------------------------------------------
				//add 2008/3/27↓
              try{
              	//add2008/3/27↑
                // 初期化
                _keyStruct.clear();
                struct.clear();
               
                // 製番リストクリア
                _jobOdrList.clear();
               
                // デフォルト値設定
                setDefaultData();
                struct.copy(_keyStruct);
				
				//add 2008/3/27↓
                //インストールオプションテーブルより'JA*'があるかどうか検索
                List SysInstallOpt = entity.mSYS_INSTALL_OPTIONS.read(conn,struct);
                if(SysInstallOpt == null || SysInstallOpt.size() <=0){
                	struct.setSYS_INSTALL_OPTIONS(null);
                }else{
                	struct.setSYS_INSTALL_OPTIONS(((AB0020010Struct)SysInstallOpt.get(0)).getSYS_INSTALL_OPTIONS());
                }
                _SysInstallOptions = struct.getSYS_INSTALL_OPTIONS();
				//add2008/3/27↑
 
                //add 2009/1/7↓
				//インストールオプションによる時系列入出庫予定一覧ボタン制御
                List listInstOpt = entity.mselectSYS_INSTALL_OPTIONS.read(conn,struct);
				if(listInstOpt == null || listInstOpt.size() <=0){
					struct.setOPTION_ID(null);
				}else{
					struct.setOPTION_ID(((AB0020010Struct)listInstOpt.get(0)).getOPTION_ID());
					_SysInstallOptions_JF =((AB0020010Struct)listInstOpt.get(0)).getOPTION_ID();
				}
				//add 2009/1/7↑
				
                // モード設定
                setReadStatus(INITIAL);
              
              	//add 2008/3/27↓
              	}
                catch(SQLException e)
                {
                 setSqlExceptionMsg(e);
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
                //---------------------------------------------------------------------
              
                struct.copy(_keyStruct);
                 
                      //再検索
                      controlselect();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //---------------------------------------------------------------------
                 
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 boolean result = false;		// チェック結果格納
                 //品目のカレンダ情報チェック
                 result = entity.mcheckM_ITEM_CAL_NO.check(conn, struct);
                 // 納期チェック
                 if(result == true){
                		result = entity.mcheckT_JOB_ODR_dlv_date1.check(conn, struct);
                 }else{
                 	result = entity.mcheckT_JOB_ODR_dlv_date.check(conn, struct);
                 }
                 if(result == false){
                  Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  setErrorMessage("AB00021", Message);
                 }
              
                 result = entity.mcheckSYS_DATE_CTRL.check(conn, struct);
                 if(result == false){
                  Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  setErrorMessage("AB00025", Message);
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  Numbering number = new Numbering(conn,
                          Numbering.JOB_OD_CD, 
                          struct.getsUser_ID(), 
                          sp.getProcId(),
                          struct.getPLANT_CD());
              
                  // 自動採番有無
                  if(struct.geth_AUTO_NUM().intValue() == 1){
                   // 製番採番
                   String jobCd = null;
                   try{
                    jobCd = number.getNo();
                    if(jobCd == null)
                     throw new Exception();
                   }
                   catch(Exception ex){
                    ExpjMessage emsg = new ExpjMessage( "AB00023" );
                    sysLog.warning(emsg, getsysUSER_CD());
                    emsg = new ExpjMessage( "ZZ01006", "M_ITEM.ITEM_CD:" + struct.getITEM_CD() );
                    sysLog.warning(emsg, getsysUSER_CD());
                    emsg = new ExpjMessage( "ZZ01006", "M_PLANT.PLANT_CD:" + struct.getPLANT_CD() );
                    sysLog.warning(emsg, getsysUSER_CD());
                    
                    emsg = new ExpjMessage( "ZZ01106" );
                    sysLog.severe(emsg, getsysUSER_CD());
                    ExpjException ee = new ExpjException(ex, emsg);
              
                    throw ee;
                   }
                   struct.setJOB_ODR_CD(jobCd);
                  }
                  else{
                   // 製番番号チェック
                   if(Numbering.checkNumber(
                     conn,
                     Numbering.JOB_OD_CD,
                     struct.getJOB_ODR_CD()) == true){
                    Message = "T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD();
                    setErrorMessage("AB00024", Message);
                   }
              
                   // チェックでエラーが発生していない場合
                   if(msgStruct.sizeError() <= 0){
              
                    // 製番計画に製番が存在するかどうかのチェック
                    List jobList = entity.mT_JOB_ODR.read(conn, struct);
                    if(jobList.size() > 0)
                    {
                     Message = "T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD();
                     setErrorMessage("ZZ01102", Message);
                    }
                   }
                  }
              
              	//3桁は4桁にする
              	if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 3){
					struct.setJOB_ODR_DLV_DATE_TIME("0"+struct.getJOB_ODR_DLV_DATE_TIME());
				}
                            
                  // チェックでエラーが発生していない場合
                  if(msgStruct.sizeError() <= 0){
					//Nullの場合
					if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 0){
						//時刻管理する場合は2359を設定
						if(_flgTimeCtrl.equals("true")){
							struct.setJOB_ODR_DLV_DATE_TIME("2359");
						//時刻管理しない場合は0000を設定
						}else{
							struct.setJOB_ODR_DLV_DATE_TIME("0000");
						}
					}
                   //年月日＋日時
                   struct.setJOB_ODR_DLV_DATE_ALL(struct.getJOB_ODR_DLV_DATE()+struct.getJOB_ODR_DLV_DATE_TIME());
                   // 追加
                   entity.minsertT_JOB_ODR.create(conn, struct);
                   
                   // -----2008/07/15 所要量計算（製番）の強化　ADD START BY NESJN
	               //[所要量計算制御（製番）]に存在チェック
	               List odList = entity.mselectSYS_JOB_OD_CALC_CTRL.read(conn, struct);
	               if(odList.size() <=0) {
	               	  // [所要量計算制御（製番）]への追加内容
	               	  entity.minsertSYS_JOB_OD_CALC_CTRL.create(conn, struct);
	               }                  
                   // -----2008/07/15 所要量計算（製番）の強化　ADD START BY NESJN
               
                   // 検索
                   controlselect();
                  }
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
				} finally{
				 struct.setOPTION_ID(_SysInstallOptions_JF);
				}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //---------------------------------------------------------------------
                
        String Message = "";
        List listMessage = new ArrayList();
                 
        try{       
            // トランザクション開始
            conn.beginTransWeb(); 	
			//更新数チェック
			List modifyList = entity.mselectT_JOB_ODR_modify.read(conn,struct);
			if(null == modifyList || modifyList.size() == 0){
				//データが存在しないのとき
				setErrorMessage("AB00054");
				return;
		
			}
			String tempModify =((AB0020010Struct)modifyList.get(0)).getMODIFY_COUNT();
			if(!tempModify.equals(struct.getMODIFY_COUNT())){ 					
				//更新数同じではないのとき
				setErrorMessage("AB00054");
				return;    				
			}
            // 画面の生産計画情報を変更の場合
            if(!"1".equals(struct.getUPDATE_FLG())) {
              
                 boolean result = false;		// チェック結果格納
              
                 // 存在/更新チェック
              /*   List countList = entity.mselectT_JOB_ODR_modify_count.read(conn, struct);
                     
                 if(countList.size() <= 0){
                  listMessage.add("T_JOB_ODR.ITEM_CD:" + struct.getITEM_CD());
                  listMessage.add("T_JOB_ODR.PLANT_CD:" + struct.getPLANT_CD());
                  listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
              
                  setErrorMessage("ZZ06001", listMessage);
                 }
                 else{
                  String modify = ((AB0020010Struct)countList.get(0)).getMODIFY_COUNT();
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   listMessage.add("T_JOB_ODR.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("T_JOB_ODR.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
              
                   setErrorMessage("ZZ01105", listMessage);
                  }
                 }*/
                 // 再計算可能性チェック
                 List listT_OD = entity.mselectT_OD.read(conn, struct);
                 if (listT_OD.size()>0 && listT_OD != null) {
               	     for (int i = 0; i < listT_OD.size(); i++) {
               		 AB0020010Struct tempDmSysTypstruct = (AB0020010Struct)listT_OD.get(i);
					     if (tempDmSysTypstruct.getDM_STS_TYP().compareTo("2")>=0) {
						     if(struct.getJOB_ODR_EXP_TYP().intValue() == 1){
						         Message = "JOB_ODR_CD:" + struct.getJOB_ODR_CD();
			                     setErrorMessage("AB00055",tempDmSysTypstruct.getJOB_ODR_CD_ALC(),Message);
					         }else if("true".equals(struct.getc_JOB_ODR_DEL_FLG())){
                                 Message = "JOB_ODR_CD:" + struct.getJOB_ODR_CD();
			                     setErrorMessage("AB00056",tempDmSysTypstruct.getJOB_ODR_CD_ALC(),Message);
					         }else{
					             Message = "JOB_ODR_CD:" + struct.getJOB_ODR_CD();
					             setErrorMessage("AB00057",tempDmSysTypstruct.getJOB_ODR_CD_ALC(),Message);
					         }
				         }
				     }
                 }
                 
                 //品目のカレンダ情報チェック
                 result = entity.mcheckM_ITEM_CAL_NO.check(conn, struct);
                 // 納期チェック
                 if(result == true){
                		result = entity.mcheckT_JOB_ODR_dlv_date1.check(conn, struct);
                 }else{
                 	result = entity.mcheckT_JOB_ODR_dlv_date.check(conn, struct);
                 }
                 if(result == false){
                  Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  setErrorMessage("AB00021", Message);
                 }
                 
				if(struct.getJOB_ODR_DEL_FLG().intValue() == 1 &&
               		 (struct.getJOB_ODR_STS_TYP().intValue() == 1 || 
               		  struct.getJOB_ODR_STS_TYP().intValue() == 2 || 
               			struct.getJOB_ODR_STS_TYP().intValue() == 3)){
               	 }else{
                 		result = entity.mcheckSYS_DATE_CTRL.check(conn, struct);
                 		if(result == false){
                  		Message = "M_CAL.CAL_DATE:" + struct.getJOB_ODR_DLV_DATE();
                  		setErrorMessage("AB00025", Message);
                 		}
               	 }
              
                 //3桁は4桁にする
              	if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 3){
					struct.setJOB_ODR_DLV_DATE_TIME("0"+struct.getJOB_ODR_DLV_DATE_TIME());
				}
              	
                // -----2008/07/15 所要量計算（製番）の強化　ADD START BY NESJN
                // チェックでエラーが発生していない場合
                if(msgStruct.sizeError() <= 0){
                	//[所要量計算制御（製番）]に存在チェック
                	List odList = entity.mselectSYS_JOB_OD_CALC_CTRL.read(conn, struct);
                	if(odList.size() <=0) {
                		// [所要量計算制御（製番）]への追加内容
                		entity.minsertSYS_JOB_OD_CALC_CTRL.create(conn, struct);
                	} else {
                		AB0020010Struct odStruct = (AB0020010Struct)odList.get(0);
                		// 所要量計算中フラグ
                		if("1".equals(odStruct.getOD_CALC_FLG())) {
                			// 所要量計算(製番)実行中のためメンテナンスできません。
                      		setErrorMessage("AC00236");
                		}
                	}
                }
                // -----2008/07/15 所要量計算（製番）の強化　ADD END BY NESJN 
                
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  if(struct.getJOB_ODR_DEL_FLG().intValue() == 1 &&
                   (struct.getJOB_ODR_STS_TYP().intValue() == 1 || 
                   struct.getJOB_ODR_STS_TYP().intValue() == 2)){
                   // 削除
                   entity.mdeleteT_JOB_ODR.delete(conn, struct);
                   
                   // -----2008/07/15 所要量計算（製番）の強化　ADD START BY NESJN
                   // 「製番計画」でデータが存在しない場合
                   boolean chkFlg = entity.mcheckT_JOB_ODR.check(conn, struct);
                   if(!chkFlg) {
                       // ［所要量計算制御（製番）］から削除処理
                       entity.mdeleteSYS_JOB_OD_CALC_CTRL.delete(conn, struct);
                   }
                   // -----2008/07/15 所要量計算（製番）の強化　ADD END BY NESJN
                   
                  }
                  else{
					//Nullの場合
					if((struct.getJOB_ODR_DLV_DATE_TIME()).length() == 0){
						//時刻管理する場合は2359を設定
						if(_flgTimeCtrl.equals("true")){
							struct.setJOB_ODR_DLV_DATE_TIME("2359");
						//時刻管理しない場合は0000を設定
						}else{
							struct.setJOB_ODR_DLV_DATE_TIME("0000");
						}
					}
                   //年月日＋日時
                   struct.setJOB_ODR_DLV_DATE_ALL(struct.getJOB_ODR_DLV_DATE()+struct.getJOB_ODR_DLV_DATE_TIME());
                   // 更新
                   entity.mupdateT_JOB_ODR.update(conn, struct);
                   
                   // -----2008/07/15 所要量計算（製番）の強化　ADD START BY NESJN
                   // [所要量計算制御（製番）]への更新処理
                   entity.mupdateSYS_JOB_OD_CALC_CTRL.update(conn, struct);
                   // -----2008/07/15 所要量計算（製番）の強化　ADD END BY NESJN
                   
                  }                       
              
                  // 検索
                  controlselect();
                 }
                 else{
                  // ロールバック
                  conn.rollback();
                 }
            } else {
                // 画面の生産計画情報を変更しない場合
                controlselect();
            }         
            // コミット
            conn.commit();
              
        }catch(SQLException e){
         setSqlExceptionMsg(e);
      
		} finally{
			struct.setOPTION_ID(_SysInstallOptions_JF);
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}

	/**
	 * 時系列入出庫予定一覧ボタン押下時に実行される処理です。
	 *
	 */
	public void controlScrmovToTimeInOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlScrmovToTimeInOut");
			//{{user_implement_dev:<controlScrmovToTimeInOut>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlScrmovToTimeInOut>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlScrmovToTimeInOut");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //---------------------------------------------------------------------
              
                try{
                 // コンボボックスデータ用意
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
              
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
                 _UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
                 _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
                 _JOB_ODR_TYP = controller.getData("JOB_ODR_TYP");
                 _PLAN_TYP = controller.getData("PLAN_TYP");
                 _JOB_ODR_STS_TYP = controller.getData("JOB_ODR_STS_TYP");
                 _JOB_ODR_EXP_TYP = controller.getData("JOB_ODR_EXP_TYP");
                 _JOB_ODR_DEL_FLG = controller.getData("JOB_ODR_DEL_FLG");
              
                 PrivateConfig privateConfig = new PrivateConfig(conn);
                 // 製番の状態表示用文字列取得
                 if(getExpectString(privateConfig) == false){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  
                  throw ee;
                 }
                 
                 // [システムパラメータ]製番削除フラグ取得
                 List tempList = entity.mselectJOB_ODR_DEL_FLG.read(conn,struct);
                 if(tempList.isEmpty()) {
                  setSysJobOdrDelFlg("0");
                 } else {
                  setSysJobOdrDelFlg(((AB0020010Struct)tempList.get(0)).getSYS_JOB_ODR_DEL_FLG());
                 }

                List listTimeCtrl = entity.mselectTIME_CTRL.read(conn,struct);
				if(listTimeCtrl == null || listTimeCtrl.size() <=0){
					struct.setTIME_CTRL("false");
					_flgTimeCtrl = "false";
				}else{
					struct.setTIME_CTRL(((AB0020010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
					_flgTimeCtrl = struct.getTIME_CTRL();
				}			
                 
                 // デフォルト値設定
                 controlclear();
                 
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }catch(ComboException e){
                 // エラーメッセージ作成
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
              
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AB0020");
		logger.entering("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AB0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("append") ) {
				controlappend();
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("ScrmovToTimeInOut") ) {
				controlScrmovToTimeInOut();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //---------------------------------------------------------------------
                struct.setList_JOB_ODR_TYP_val(_JOB_ODR_TYP.getValList());
                struct.setList_JOB_ODR_TYP_name(_JOB_ODR_TYP.getExplanList());
                struct.setList_PLAN_TYP_val(_PLAN_TYP.getValList());
                struct.setList_PLAN_TYP_name(_PLAN_TYP.getExplanList());
                 
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)(ame.getMessages()));
                 throw ee;
                //---------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AB0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0020010-E999","CSVの出力処理"));
			throw new FoundationException("AB0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AB0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AB0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AB0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AB0020010Entity entity;
	protected AB0020010Struct struct;
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

		entity = new AB0020010Entity();
		struct = new AB0020010Struct();

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
	 * AB0020010クラスの標準コンストラクタ
	 */
	public AB0020010Control() throws BusinessProcessException, FoundationException
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
				AB0020010Struct key = (AB0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name") && key.getJOB_ODR_TYP_name() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_name", key.getJOB_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val") && key.getJOB_ODR_TYP_val() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_val", key.getJOB_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP_name") && key.getPLAN_TYP_name() != null) {
					msgKey.setKeyValue("PLAN_TYP_name", key.getPLAN_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP_val") && key.getPLAN_TYP_val() != null) {
					msgKey.setKeyValue("PLAN_TYP_val", key.getPLAN_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ALCD_ENABLE_QTY") && key.getALCD_ENABLE_QTY() != null) {
					msgKey.setKeyValue("ALCD_ENABLE_QTY", key.getALCD_ENABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("HAND_STOCK") && key.getHAND_STOCK() != null) {
					msgKey.setKeyValue("HAND_STOCK", key.getHAND_STOCK());
				}
				if(msgKeyType.containsKeyColumn("h_AUTO_NUM") && key.geth_AUTO_NUM() != null) {
					msgKey.setKeyValue("h_AUTO_NUM", key.geth_AUTO_NUM().toString());
				}
				if(msgKeyType.containsKeyColumn("JobOdrExpect") && key.getJobOdrExpect() != null) {
					msgKey.setKeyValue("JobOdrExpect", key.getJobOdrExpect());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_NAME") && key.getJOB_ODR_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_NAME", key.getJOB_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLAN_NAME") && key.getPLAN_NAME() != null) {
					msgKey.setKeyValue("PLAN_NAME", key.getPLAN_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_NAME") && key.getJOB_ODR_STS_NAME() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_NAME", key.getJOB_ODR_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME") && key.getUNIT_QTY_NAME() != null) {
					msgKey.setKeyValue("UNIT_QTY_NAME", key.getUNIT_QTY_NAME());
				}
				if(msgKeyType.containsKeyColumn("c_AUTO_NUM") && key.getc_AUTO_NUM() != null) {
					msgKey.setKeyValue("c_AUTO_NUM", key.getc_AUTO_NUM());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_DEL_FLG") && key.getc_JOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("c_JOB_ODR_DEL_FLG", key.getc_JOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP") && key.getc_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c_JOB_ODR_STS_TYP", key.getc_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_EXP_TYP") && key.getc_JOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("c_JOB_ODR_EXP_TYP", key.getc_JOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME") && key.getJOB_ODR_DLV_DATE_TIME() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_TIME", key.getJOB_ODR_DLV_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("UPDATE_FLG") && key.getUPDATE_FLG() != null) {
					msgKey.setKeyValue("UPDATE_FLG", key.getUPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("STS_FLG") && key.getSTS_FLG() != null) {
					msgKey.setKeyValue("STS_FLG", key.getSTS_FLG());
				}
				if(msgKeyType.containsKeyColumn("EXP_FLG") && key.getEXP_FLG() != null) {
					msgKey.setKeyValue("EXP_FLG", key.getEXP_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_DATE_TO") && key.getd_DATE_TO() != null) {
					msgKey.setKeyValue("d_DATE_TO", sdf.format(key.getd_DATE_TO()));
				}
				if(msgKeyType.containsKeyColumn("d_DATE_FROM") && key.getd_DATE_FROM() != null) {
					msgKey.setKeyValue("d_DATE_FROM", sdf.format(key.getd_DATE_FROM()));
				}
				if(msgKeyType.containsKeyColumn("d_JOB_ODR_DLV_DATE") && key.getd_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("d_JOB_ODR_DLV_DATE", key.getd_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_SERIAL") && key.gets_MAX_DISPLAY_MONTH_SERIAL() != null) {
					msgKey.setKeyValue("s_MAX_DISPLAY_MONTH_SERIAL", key.gets_MAX_DISPLAY_MONTH_SERIAL());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PLAN_TYP") && key.getPLAN_TYP() != null) {
					msgKey.setKeyValue("PLAN_TYP", key.getPLAN_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP") && key.getJOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_EXP_TYP", key.getJOB_ODR_EXP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("MAX_DLV_DATE") && key.getMAX_DLV_DATE() != null) {
					msgKey.setKeyValue("MAX_DLV_DATE", key.getMAX_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("MIN_DLV_DATE") && key.getMIN_DLV_DATE() != null) {
					msgKey.setKeyValue("MIN_DLV_DATE", key.getMIN_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("MUL_ODR_QTY") && key.getMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("MUL_ODR_QTY", key.getMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT") && key.getPKG_UNIT() != null) {
					msgKey.setKeyValue("PKG_UNIT", key.getPKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP") && key.getw_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("w_MANHOUR_TYP", key.getw_MANHOUR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_ALL") && key.getJOB_ODR_DLV_DATE_ALL() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE_ALL", key.getJOB_ODR_DLV_DATE_ALL());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", sdf.format(key.getBUSINESS_OPR_DATE()));
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("SYS_JOB_ODR_DEL_FLG") && key.getSYS_JOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("SYS_JOB_ODR_DEL_FLG", key.getSYS_JOB_ODR_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2") && key.geth_PRD_REQ_JOB_ODR_TYP_2() != null) {
					msgKey.setKeyValue("h_PRD_REQ_JOB_ODR_TYP_2", key.geth_PRD_REQ_JOB_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD") && key.geth_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD", key.geth_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_INSTALL_OPTIONS") && key.getSYS_INSTALL_OPTIONS() != null) {
					msgKey.setKeyValue("SYS_INSTALL_OPTIONS", key.getSYS_INSTALL_OPTIONS());
				}
				if(msgKeyType.containsKeyColumn("OD_CALC_FLG") && key.getOD_CALC_FLG() != null) {
					msgKey.setKeyValue("OD_CALC_FLG", key.getOD_CALC_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD_ALC") && key.getJOB_ODR_CD_ALC() != null) {
					msgKey.setKeyValue("JOB_ODR_CD_ALC", key.getJOB_ODR_CD_ALC());
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
					AB0020010Struct key = new AB0020010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_name")) {
						key.setJOB_ODR_TYP_name(msgKey.getKeyValue("JOB_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_val")) {
						key.setJOB_ODR_TYP_val(msgKey.getKeyValue("JOB_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP_name")) {
						key.setPLAN_TYP_name(msgKey.getKeyValue("PLAN_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP_val")) {
						key.setPLAN_TYP_val(msgKey.getKeyValue("PLAN_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_ENABLE_QTY")) {
						key.setALCD_ENABLE_QTY(msgKey.getKeyValue("ALCD_ENABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("HAND_STOCK")) {
						key.setHAND_STOCK(msgKey.getKeyValue("HAND_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("h_AUTO_NUM")) {
						key.seth_AUTO_NUM(new Integer(msgKey.getKeyValue("h_AUTO_NUM")));
					}
					if(msgKeyType.containsKeyColumn("JobOdrExpect")) {
						key.setJobOdrExpect(msgKey.getKeyValue("JobOdrExpect"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_NAME")) {
						key.setJOB_ODR_NAME(msgKey.getKeyValue("JOB_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLAN_NAME")) {
						key.setPLAN_NAME(msgKey.getKeyValue("PLAN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_NAME")) {
						key.setJOB_ODR_STS_NAME(msgKey.getKeyValue("JOB_ODR_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME")) {
						key.setUNIT_QTY_NAME(msgKey.getKeyValue("UNIT_QTY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("c_AUTO_NUM")) {
						key.setc_AUTO_NUM(msgKey.getKeyValue("c_AUTO_NUM"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_DEL_FLG")) {
						key.setc_JOB_ODR_DEL_FLG(msgKey.getKeyValue("c_JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP")) {
						key.setc_JOB_ODR_STS_TYP(msgKey.getKeyValue("c_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_EXP_TYP")) {
						key.setc_JOB_ODR_EXP_TYP(msgKey.getKeyValue("c_JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_TIME")) {
						key.setJOB_ODR_DLV_DATE_TIME(msgKey.getKeyValue("JOB_ODR_DLV_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("UPDATE_FLG")) {
						key.setUPDATE_FLG(msgKey.getKeyValue("UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STS_FLG")) {
						key.setSTS_FLG(msgKey.getKeyValue("STS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("EXP_FLG")) {
						key.setEXP_FLG(msgKey.getKeyValue("EXP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_DATE_TO")) {
						key.setd_DATE_TO(sdf.parse(msgKey.getKeyValue("d_DATE_TO")));
					}
					if(msgKeyType.containsKeyColumn("d_DATE_FROM")) {
						key.setd_DATE_FROM(sdf.parse(msgKey.getKeyValue("d_DATE_FROM")));
					}
					if(msgKeyType.containsKeyColumn("d_JOB_ODR_DLV_DATE")) {
						key.setd_JOB_ODR_DLV_DATE(msgKey.getKeyValue("d_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_MAX_DISPLAY_MONTH_SERIAL")) {
						key.sets_MAX_DISPLAY_MONTH_SERIAL(msgKey.getKeyValue("s_MAX_DISPLAY_MONTH_SERIAL"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PLAN_TYP")) {
						key.setPLAN_TYP(new Integer(msgKey.getKeyValue("PLAN_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP")) {
						key.setJOB_ODR_EXP_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_EXP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(new Integer(msgKey.getKeyValue("JOB_ODR_DEL_FLG")));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("MAX_DLV_DATE")) {
						key.setMAX_DLV_DATE(msgKey.getKeyValue("MAX_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MIN_DLV_DATE")) {
						key.setMIN_DLV_DATE(msgKey.getKeyValue("MIN_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("MUL_ODR_QTY")) {
						key.setMUL_ODR_QTY(msgKey.getKeyValue("MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT")) {
						key.setPKG_UNIT(msgKey.getKeyValue("PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_MANHOUR_TYP")) {
						key.setw_MANHOUR_TYP(new Double(msgKey.getKeyValue("w_MANHOUR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE_ALL")) {
						key.setJOB_ODR_DLV_DATE_ALL(msgKey.getKeyValue("JOB_ODR_DLV_DATE_ALL"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(new Integer(msgKey.getKeyValue("HOLIDAY_FLG")));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(sdf.parse(msgKey.getKeyValue("BUSINESS_OPR_DATE")));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(new Integer(msgKey.getKeyValue("CAL_NO")));
					}
					if(msgKeyType.containsKeyColumn("SYS_JOB_ODR_DEL_FLG")) {
						key.setSYS_JOB_ODR_DEL_FLG(msgKey.getKeyValue("SYS_JOB_ODR_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("h_PRD_REQ_JOB_ODR_TYP_2")) {
						key.seth_PRD_REQ_JOB_ODR_TYP_2(msgKey.getKeyValue("h_PRD_REQ_JOB_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD")) {
						key.seth_JOB_ODR_CD(msgKey.getKeyValue("h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_INSTALL_OPTIONS")) {
						key.setSYS_INSTALL_OPTIONS(msgKey.getKeyValue("SYS_INSTALL_OPTIONS"));
					}
					if(msgKeyType.containsKeyColumn("OD_CALC_FLG")) {
						key.setOD_CALC_FLG(msgKey.getKeyValue("OD_CALC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD_ALC")) {
						key.setJOB_ODR_CD_ALC(msgKey.getKeyValue("JOB_ODR_CD_ALC"));
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
