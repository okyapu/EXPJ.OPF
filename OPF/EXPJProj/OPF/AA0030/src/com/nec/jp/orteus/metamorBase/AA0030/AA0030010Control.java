/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0030/src/com/nec/jp/orteus/metamorBase/AA0030/AA0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0030;

import com.nec.jp.orteus.metamorBase.AA0030.*;
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
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0030010Control
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
        public List getList() { return this.list; } 					// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。
       
        public AA0030010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
       //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
       //---------- コンボボックスデータ取得関連の処理 -------------------------------
       
        /** 品目手配区分 */
        ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /** 品目手配区分設定
         * @param コンボボックスデータ
        */
        public void setMRP_ODR_TYP_comb(ComboStruct combo){ _MRP_ODR_TYP = combo; }
       
        /** 品目手配区分取得
         * @return 品目手配区分のコンボボックスデータ
        */
        public ComboStruct getMRP_ODR_TYP_comb(){ return _MRP_ODR_TYP; }
       
       /**************/
       
        /** 内外作区分(品目別・作業系列別) */
        ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /** 内外作区分設定
         * @param コンボボックスデータ
        */
        public void setOUTSIDE_TYP_comb(ComboStruct combo){ _OUTSIDE_TYP = combo; }
       
        /** 内外作区分取得
         * @return 内外作区分のコンボボックスデータ
        */
        public ComboStruct getOUTSIDE_TYP_comb(){ return _OUTSIDE_TYP; }
       
       /**************/
       
        /** 品目別作業実績区分 */
        ComboStruct _OPR_RSLT_TYP = new ComboStruct();
       
        /** 品目別作業実績区分設定
         * @param コンボボックスデータ
        */
        public void setOPR_RSLT_TYP_comb(ComboStruct combo){ _OPR_RSLT_TYP = combo; }
       
        /** 品目別作業実績区分取得
         * @return 品目別作業実績区分のコンボボックスデータ
        */
        public ComboStruct getOPR_RSLT_TYP_comb(){ return _OPR_RSLT_TYP; }
       
       /**************/
       
        /** 受入検査区分 */
        ComboStruct _ACPT_INSPC_TYP = new ComboStruct();
       
        /** 受入検査区分設定
         * @param コンボボックスデータ
        */
        public void setACPT_INSPC_TYP_comb(ComboStruct combo){ _ACPT_INSPC_TYP = combo; }
       
        /** 受入検査区分取得
         * @return 受入検査区分のコンボボックスデータ
        */
        public ComboStruct getACPT_INSPC_TYP_comb(){ return _ACPT_INSPC_TYP; }
       
// 2008/07/15 SYSCOM 小林 ADD START
       /**************/
       
        /** 工数管理品目区分 */
        ComboStruct _MANHOUR_TYP = new ComboStruct();
       
        /** 工数管理品目区分
         * @param コンボボックスデータ
        */
        public void setMANHOUR_TYP_comb(ComboStruct combo){ _MANHOUR_TYP = combo; }
       
        /** 工数管理品目区分
         * @return 工数管理品目区分のコンボボックスデータ
        */
        public ComboStruct getMANHOUR_TYP_comb(){ return _MANHOUR_TYP; }
// 2008/07/15 SYSCOM 小林 ADD END

       //-------------------------------------------------------------------------
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param intType 区分コード
         * @return 区分名称。該当するデータがなかった場合は区分コードを返す
         */
        private String getTypeName(ComboStruct comboStruct, Integer intType)
        {
         String strTyp = TypeConverter.sanitizer(intType);
         return getTypeName(comboStruct,strTyp);
        }
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param strTyp 区分コード
         * @return 区分名称。該当するデータがなかった場合は区分コードを返す
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         String strTypName = strTyp;
         for(int i = 0; i < comboStruct.getValList().size(); i++){
          if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
           strTypName = (String)(comboStruct.getExplanList().get(i));
           break;
          }
         }
         return strTypName;
        }
        /**
         * 品目情報のフラグの表示を設定
         * @param s フラグの値が設定されている情報
         */
        private void setTypeValueAboutItem(AA0030010Struct s)
        {
         s.setITEM_MRP_ODR_NAME(getTypeName(_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setITEM_OUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getITEM_OUTSIDE_TYP()));
         s.setITEM_OPR_RSLT_NAME(getTypeName(_OPR_RSLT_TYP,s.getOPR_RSLT_TYP()));
// 2008/07/15 SYSCOM 小林 ADD START
         s.setITEM_MANHOUR_NAME(getTypeName(_MANHOUR_TYP,s.getMANHOUR_TYP()));
// 2008/07/15 SYSCOM 小林 ADD END
        }
        /**
         * 作業系列情報のフラグの表示を設定
         * @param s フラグの値が設定されている情報
         */
        private void setTypeValueAboutProcGroup(AA0030010Struct s)
        {
         s.setOUTSIDE_NAME(getTypeName(_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setACPT_INSPC_NAME(getTypeName(_ACPT_INSPC_TYP,s.getACPT_INSPC_TYP()));
        }
       
       //------------------------------------------------------------------------
       
        /** ユーザ定義の初期化済フラグ */
        private boolean _usersIntialized = false;
       
        /**
         * ユーザ定義 初期化処理
         */
        private void usersInitialize() throws ExpjException
        {
         if(_usersIntialized) return;
       
         // コンボデータの取得
         setComboData(struct);
       
         _usersIntialized = true;
         return ;
        }
       
       
       //------------------------------------------------------------------------
        /**
         * コンボボックスの中身を取得します。
         *
         * @param data データの箱
         */
         private void setComboData(AA0030010Struct data) throws ExpjException
         {
         ComboBox comboController = new ComboBox(conn, sysUSER_CD);
         try{
          //コンボデータの取得
          ComboStruct MRP_ODR_TYP_comb = comboController.getData("MRP_ODR_TYP");
          ComboStruct OUTSIDE_TYP_comb = comboController.getData("OUTSIDE_TYP");
          ComboStruct OPR_RSLT_TYP_comb = comboController.getData("OPR_RSLT_TYP");
          ComboStruct ACPT_INSPC_TYP_comb = comboController.getData("ACPT_INSPC_TYP");
// 2008/07/15 SYSCOM 小林 ADD START
          ComboStruct MANHOUR_TYP_comb = comboController.getData("MANHOUR_TYP");
// 2008/07/15 SYSCOM 小林 ADD END
       
          comboController.setConnection(null);
       
          //属性に取得データ設定
          setMRP_ODR_TYP_comb(MRP_ODR_TYP_comb);
          setOUTSIDE_TYP_comb(OUTSIDE_TYP_comb);
          setOPR_RSLT_TYP_comb(OPR_RSLT_TYP_comb);
          setACPT_INSPC_TYP_comb(ACPT_INSPC_TYP_comb);
// 2008/07/15 SYSCOM 小林 ADD START
          setMANHOUR_TYP_comb(MANHOUR_TYP_comb);
// 2008/07/15 SYSCOM 小林 ADD END
       
         }catch(SQLException e) {
          setSqlExceptionMsg(e);
       
         }catch(ComboException e){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
         }
        }
       
       //-------------------------------------------------------------------------
        // 更新対象の作業系列情報No
        private Integer _checkNo = null;
        
        /** 更新対象の作業系列情報No取得
         * @return 作業系列情報No
        */
        public Integer getCheckNumber(){ return _checkNo; }
        
        /** 更新対象の作業系列情報No設定
         * @param 更新対象の作業系列情報No
        */
        public void setCheckNumber(Integer no){ _checkNo = no; }
       
       
        /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
        private AA0030010Struct _keyStruct = new AA0030010Struct();
       
        /** キー情報Structの取得 */
        public AA0030010Struct getKeyStruct(){ return _keyStruct; }
        
        /** キー情報Structの設定 */
        public void setKeyStruct(AA0030010Struct struct){ _keyStruct.copy(struct); }
       
       
       //-------------------------------------------------------------------------
       
        /** 作業系列リスト */
        private List _procedureList = new ArrayList(0);
       
        /** 
         * 作業系列リスト取得	
         * @return 作業系列リスト
        */
        public List getProcedureList(){ return _procedureList; }
       
        /** 
         * 作業系列リスト設定
         * @param 作業系列リスト
         */
        public void setProcedureList(List list){ _procedureList = list; }
       
       
       //-------------------------------------------------------------------------
       
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
       
       //-------------------------------------------------------------------------
       
        /**
         * 入力値チェック。
         * NOT NULL項目に値が入っていない場合、初期値を設定する
         * @param checkStruct チェック対象のStruct
         */
        // 2003/09/30 全てのString型の判定文に 空文字列でないかの条件も追加  K.Shiraki
        private void checkStruct(AA0030010Struct checkStruct)
        {
         // 作業系列番号
         if(checkStruct.getPROC_NO() == null
         || "".equals(checkStruct.getPROC_NO()))
          checkStruct.setPROC_NO(AA0030Common._PROC_NO);
       
         // 作業系列固定分リードタイム
         if(checkStruct.getFIXED_LT() == null
         || "".equals(checkStruct.getFIXED_LT()))
          checkStruct.setFIXED_LT(AA0030Common._FIXED_LT);
       
         // 作業系列比例分リードタイム
         if(checkStruct.getPROP_LT() == null
         || "".equals(checkStruct.getPROP_LT()))
          checkStruct.setPROP_LT(AA0030Common._PROP_LT);	
       
         // 作業系列安全日数
         if(checkStruct.getSAFETY_LT() == null
         || "".equals(checkStruct.getSAFETY_LT()))
          checkStruct.setSAFETY_LT(AA0030Common._SAFETY_LT);
       
         // 作業系列比例分ロットサイズ
         if(checkStruct.getPROP_LOT_SIZE() == null
         || "".equals(checkStruct.getPROP_LOT_SIZE()))
          checkStruct.setPROP_LOT_SIZE(AA0030Common._PROP_LOT_SIZE);
       
         // 作業系列仕損率
         if(checkStruct.getSPOIL() == null
         || "".equals(checkStruct.getSPOIL()))
          checkStruct.setSPOIL(AA0030Common._SPOIL);
       
         // 標準工数
         if(checkStruct.getSTANDARD_COST() == null
         || "".equals(checkStruct.getSTANDARD_COST()))
          checkStruct.setSTANDARD_COST(AA0030Common._STANDARD_COST);
       
         return;
        }
       
       //-----------------------------------------------------------------------------
        /**
         * 固定リードタイムチェック
         * @param itemStruct 品目情報Struct
         */
         private void checkLT(AA0030010Struct itemStruct)
         {
          
         // 固定分リードタイムチェック
         long fixed_lt = 0;
         long prop_lt = 0;
         for(int i = 0; i < _procedureList.size(); i++){
          AA0030010Struct workStruct = (AA0030010Struct)_procedureList.get(i);
          fixed_lt = fixed_lt + (Long.valueOf(workStruct.getFIXED_LT())).longValue();
          prop_lt = prop_lt + (Long.valueOf(workStruct.getPROP_LT())).longValue();
         }
       
         // 品目の比例分リードタイム == 0 && 全作業系列比例分リードタイム == 0
         if(itemStruct.getITEM_PROP_LT().longValue() == 0 && prop_lt == 0){
          if(itemStruct.getITEM_FIXED_LT().longValue() < fixed_lt){
           setInfoMessage("AA60003", "");
          }
         }
        }
       
       //-----------------------------------------------------------------------------
        /**
         * 固定リードタイムチェック
         * @param itemStruct 品目情報Struct、bomStruct ASP製造BOM情報Struct
         */
         private void checkLTBom(AA0030010Struct itemStruct, AA0030010Struct bomStruct)
         {
          
         // 固定分リードタイムチェック
         long fixed_lt = 0;
         long prop_lt = 0;
         for(int i = 0; i < _procedureList.size(); i++){
          AA0030010Struct workStruct = (AA0030010Struct)_procedureList.get(i);
          fixed_lt = fixed_lt + (Long.valueOf(workStruct.getFIXED_LT())).longValue();
          prop_lt = prop_lt + (Long.valueOf(workStruct.getPROP_LT())).longValue();
         }
       
         // 品目の比例分リードタイム == 0 && 全作業系列比例分リードタイム == 0
         if(itemStruct.getITEM_PROP_LT().longValue() == 0 && prop_lt == 0){
          if(bomStruct.getBOM_FIXED_LT().longValue() < fixed_lt){
           setInfoMessage("AA60003", "");
          }
         }
        }
       
       //-----------------------------------------------------------------------------
       
        /** 
         * 対象データが既に更新されているかどうかの判定処理
         * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
         *
         * @param target_struct 対象データ情報
         * @param modify_count 対象データMODIFY_COUNT
         * @return boolean true:エラーあり false:エラーなし
         */
        private boolean checkTargetDataInM_PROC_GRP(AA0030010Struct target_struct, String modify_count) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 処理対象データの存在チェック
         List temp_list = new ArrayList(0);
         temp_list = entity.mSelectOne_for_update_nowait.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          
          listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
          listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
          listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getPROC_CD());
       
          setErrorMessage("ZZ06001", listMessage);
          return true;
         }
         else
         {
          // レコードが更新されていないかチェック
          AA0030010Struct temp_struct = (AA0030010Struct)temp_list.get(0);
          if(temp_struct.getMODIFY_COUNT().equals(modify_count) != true)
          {
           
           listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
           listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
           listMessage.add("M_PROC_GRP.PROC_CD:" + struct.getPROC_CD());
       
           setErrorMessage("ZZ01105", listMessage);
           return true;
          }
         }
       
         return false;
        }
       
        /** 
         * 対象全データが既に更新されているかどうかの判定処理
         * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
         *
         * @param target_struct 対象データ情報
         * @return boolean true:エラーあり false:エラーなし
         */
        private boolean checkTargetAllDataInM_PROC_GRP(AA0030010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 現在の読込キーでデータを読込(select for update no waitが入っている読込処理)
         List new_list = new ArrayList();
         new_list = entity.mSelect_for_update_nowait.read(conn, struct);
       
         // 読み込んだデータ件数が現在読み込んでいる件数と同じかどうかのチェック
         if(new_list.size() != _procedureList.size())
         {
          
          listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
          listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
       
          setErrorMessage("ZZ01105", listMessage);
          return true;
         }
         else
         {
          // 読み込んだ各データ内容が現在読み込んでいるデータ内容と同じかどうかのチェック
          AA0030010Struct now_struct = new AA0030010Struct();
          AA0030010Struct new_struct = new AA0030010Struct();
          for(int i = 0; i < _procedureList.size(); i++)
          {
           // 各リストからデータを取得
           now_struct = (AA0030010Struct)_procedureList.get(i);
           new_struct = (AA0030010Struct)new_list.get(i);
       
           // 各項目の情報が同じかどうかのチェック
           if(	((now_struct.getPROC_CD() == null && new_struct.getPROC_CD() != null) || (now_struct.getPROC_CD() != null && now_struct.getPROC_CD().equals(new_struct.getPROC_CD()) != true) )
           ||	((now_struct.getPROC_NO() == null && new_struct.getPROC_NO() != null) || (now_struct.getPROC_NO() != null && now_struct.getPROC_NO().equals(new_struct.getPROC_NO()) != true) )
           ||	((now_struct.getPROC_NAME() == null && new_struct.getPROC_NAME() != null) || (now_struct.getPROC_NAME() != null && now_struct.getPROC_NAME().equals(new_struct.getPROC_NAME()) != true) )
           ||	((now_struct.getWS_CD() == null && new_struct.getWS_CD() != null) || (now_struct.getWS_CD() != null && now_struct.getWS_CD().equals(new_struct.getWS_CD()) != true) )
           ||	((now_struct.getCOMPANY_CD() == null && new_struct.getCOMPANY_CD() != null) || (now_struct.getCOMPANY_CD() != null && now_struct.getCOMPANY_CD().equals(new_struct.getCOMPANY_CD()) != true) )
           ||	((now_struct.getVEND_CD() == null && new_struct.getVEND_CD() != null) || (now_struct.getVEND_CD() != null && now_struct.getVEND_CD().equals(new_struct.getVEND_CD()) != true) )
           ||	((now_struct.getFIXED_LT() == null && new_struct.getFIXED_LT() != null) || (now_struct.getFIXED_LT() != null && now_struct.getFIXED_LT().equals(new_struct.getFIXED_LT()) != true) )
           ||	((now_struct.getPROP_LT() == null && new_struct.getPROP_LT() != null) || (now_struct.getPROP_LT() != null && now_struct.getPROP_LT().equals(new_struct.getPROP_LT()) != true) )
           ||	((now_struct.getSAFETY_LT() == null && new_struct.getSAFETY_LT() != null) || (now_struct.getSAFETY_LT() != null && now_struct.getSAFETY_LT().equals(new_struct.getSAFETY_LT()) != true) )
           ||	((now_struct.getPROP_LOT_SIZE() == null && new_struct.getPROP_LOT_SIZE() != null) || (now_struct.getPROP_LOT_SIZE() != null && now_struct.getPROP_LOT_SIZE().equals(new_struct.getPROP_LOT_SIZE()) != true) )
           ||	((now_struct.getSPOIL() == null && new_struct.getSPOIL() != null) || (now_struct.getSPOIL() != null && now_struct.getSPOIL().equals(new_struct.getSPOIL()) != true) )
           ||	((now_struct.getOUTSIDE_TYP() == null && new_struct.getOUTSIDE_TYP() != null) || (now_struct.getOUTSIDE_TYP() != null && now_struct.getOUTSIDE_TYP().equals(new_struct.getOUTSIDE_TYP()) != true) )
           ||	((now_struct.getACPT_INSPC_TYP() == null && new_struct.getACPT_INSPC_TYP() != null) || (now_struct.getACPT_INSPC_TYP() != null && now_struct.getACPT_INSPC_TYP().equals(new_struct.getACPT_INSPC_TYP()) != true) )
           ||	((now_struct.getSTANDARD_COST() == null && new_struct.getSTANDARD_COST() != null) || (now_struct.getSTANDARD_COST() != null && now_struct.getSTANDARD_COST().equals(new_struct.getSTANDARD_COST()) != true) )
           ||	((now_struct.getMODIFY_COUNT() == null && new_struct.getMODIFY_COUNT() != null) || (now_struct.getMODIFY_COUNT() != null && now_struct.getMODIFY_COUNT().equals(new_struct.getMODIFY_COUNT()) != true) ) )
           {
          
            listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
            listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
       
            setErrorMessage("ZZ01105", listMessage);
            break;
           }
          }
         }
       
       
         return false;
        }
       
        /**
         * 品目情報設定処理
         * @param target_struct 設定対象
         * @param w_itemList 品目情報リスト
         */
        private void setItemInfo(AA0030010Struct target_struct, List w_itemList)
        {
         if(w_itemList.size() <= 0)
         {
          target_struct.setSTOCK_UNIT("");
         }
         else
         {
          AA0030010Struct itemStruct = (AA0030010Struct)w_itemList.get(0);
          target_struct.setSTOCK_UNIT(itemStruct.getSTOCK_UNIT());
         }
        }
       //-------------------------------------------------------------------------
       
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                //------------------------------------------------------------------
              
                String Message = "";
                setReadStatus(INITIAL);
              
                try {
                 // 作業系列リストクリア
                 _procedureList.clear();
              
                 // 対象品目情報取得
                 List itemList = entity.mSelectM_ITEM.read(conn, struct);
              
                 // 品目情報設定
                 setItemInfo(struct, itemList);
              
                 if(itemList.size() <= 0){
                  // hiddenのクリア
                  struct.seth_ITEM_CD("");
              
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  setErrorMessage("ZZ06001", Message);
                 }
                 else{
                  // 作業系列一覧取得
                  _procedureList = entity.mSelect.read(conn, struct);
              
                  if(_procedureList.size() > 0){
                   for(int n = 0; n < _procedureList.size(); n++){
                    // コンボ値の対応する名称を取得
                    setTypeValueAboutProcGroup((AA0030010Struct)(_procedureList.get(n)));
                   }
                   // 読込状態
                   setReadStatus(NORMAL);
              
                  } else if(_procedureList.size() == 0){
                   // 読込状態
                   setReadStatus(NOT_FOUND);
                  }
                  // 読み込みキー退避
                  String w_h_item = struct.getITEM_CD();
              
                  list = _procedureList;
              
                  // 品目情報設定
                  _keyStruct.copy((AA0030010Struct)itemList.get(0));
              
                  // 読み込みキー取得
                  _keyStruct.seth_ITEM_CD(w_h_item);
              
                  // コンボ値の対応する名称を取得
                  setTypeValueAboutItem(_keyStruct);
                  _keyStruct.setPLANT_CD(new String(struct.getPLANT_CD()));
                  struct.copy(_keyStruct);
              
                 }
              
                }catch(SQLException e){
                 // 読込状態
                 setReadStatus(ERROR);
              
                 setSqlExceptionMsg(e);
              
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAppend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlAppend");
			//{{user_implement_dev:<controlAppend>
                //---------------------------------------------------------------------
              
                struct.initialize();
                struct.setITEM_CD(_keyStruct.getITEM_CD());
                struct.setITEM_NAME(_keyStruct.getITEM_NAME());
                struct.setSTOCK_UNIT(_keyStruct.getSTOCK_UNIT());
// 2008/07/15 SYSCOM 小林 ADD START
                struct.setMANHOUR_TYP(_keyStruct.getMANHOUR_TYP());
// 2008/07/15 SYSCOM 小林 ADD END
              
				try{
					readStatus = INITIAL;
					// コンボボックスデータ（PROC_GRP_LT_UNIT）取得
					AA0030010Struct LT_UNIT_Struct = new AA0030010Struct();
					List LT_UNIT_List = entity.mSELECT_SYS_TYPE_VALUE.read(conn, LT_UNIT_Struct);
					if(null != LT_UNIT_List && LT_UNIT_List.size()>0){
						LT_UNIT_Struct = (AA0030010Struct)LT_UNIT_List.get(0);
						struct.setLT_UNIT_1(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_2(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_3(LT_UNIT_Struct.getLT_UNIT());
					}else{
						struct.setLT_UNIT_1(null);
						struct.setLT_UNIT_2(null);
						struct.setLT_UNIT_3(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// エラー処理を記述してください。
					// 
				}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlAppend>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlAppend");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>
                //---------------------------------------------------------------------
				try{
					readStatus = INITIAL;
					// コンボボックスデータ（PROC_GRP_LT_UNIT）取得
					AA0030010Struct LT_UNIT_Struct = new AA0030010Struct();
					List LT_UNIT_List = entity.mSELECT_SYS_TYPE_VALUE.read(conn, LT_UNIT_Struct);
					if(null != LT_UNIT_List && LT_UNIT_List.size()>0){
						LT_UNIT_Struct = (AA0030010Struct)LT_UNIT_List.get(0);
						struct.setLT_UNIT_1(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_2(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_3(LT_UNIT_Struct.getLT_UNIT());
					}else{
						struct.setLT_UNIT_1(null);
						struct.setLT_UNIT_2(null);
						struct.setLT_UNIT_3(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// エラー処理を記述してください。
					// 
				}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlModify>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * 行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlCopy");
			//{{user_implement_dev:<controlCopy>
                //---------------------------------------------------------------------
                struct.setPROC_CD(null);

				try{
					readStatus = INITIAL;
					// コンボボックスデータ（PROC_GRP_LT_UNIT）取得
					AA0030010Struct LT_UNIT_Struct = new AA0030010Struct();
					List LT_UNIT_List = entity.mSELECT_SYS_TYPE_VALUE.read(conn, LT_UNIT_Struct);
					if(null != LT_UNIT_List && LT_UNIT_List.size()>0){
						LT_UNIT_Struct = (AA0030010Struct)LT_UNIT_List.get(0);
						struct.setLT_UNIT_1(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_2(LT_UNIT_Struct.getLT_UNIT());
						struct.setLT_UNIT_3(LT_UNIT_Struct.getLT_UNIT());
					}else{
						struct.setLT_UNIT_1(null);
						struct.setLT_UNIT_2(null);
						struct.setLT_UNIT_3(null);
					}
				} catch(SQLException e) {
					e.printStackTrace();
					// エラー処理を記述してください。
					// 
				}
                //---------------------------------------------------------------------
              
                //}}user_implement_dev:<controlCopy>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlCopy");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlErace() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlErace");
			//{{user_implement_dev:<controlErace>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                List listMessage = new ArrayList();
              
                try{
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // 対象の系列情報取得
                 AA0030010Struct deleteStruct = new AA0030010Struct(struct);
              
                 // 外注単価テーブル削除
                 int cnt1 = entity.mEraceM_SBCNT_UNIT_COST.delete(conn, deleteStruct);
              
                 // 外注単価ヘッダテーブル削除
                 int cnt2 = entity.mEraceM_SBCNT_UNIT_COST_H.delete(conn, deleteStruct);
              
                 // 作業系列テーブルの対象データチェック
                 checkTargetDataInM_PROC_GRP(deleteStruct, deleteStruct.getMODIFY_COUNT());
              
                 // エラーがない場合、削除処理
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 作業系列テーブル削除
                  int cnt3 = entity.mEraceM_PROC_GRP.delete(conn, deleteStruct);
              
                  // コミット
                  conn.commit();
                  transFlg = false;
              
                  // 検索
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // 削除対象がなかった場合
                  if(cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0){
                   // 削除処理失敗：対象データが存在しません
                   listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                   
                  }
              
                  // システムパラメータ（TIME_CTRL）取得
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //ＤＢ更新後チェック
                  if((struct.getTIME_CTRL()).equals("true")){
                      // 品目情報取得
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP製造BOM情報取得
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // 固定リードタイムチェック
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // 品目情報取得
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // 固定リードタイムチェック
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                 
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
                
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlErace>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlErace");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlEraceAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlEraceAll");
			//{{user_implement_dev:<controlEraceAll>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                List listMessage = new ArrayList();
              
                try{
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // 外注単価テーブル削除
                 int cnt1 = entity.mEraceAllM_SBCNT_UNIT_COST.delete(conn, _keyStruct);
              
                 // 外注単価ヘッダテーブル削除
                 int cnt2 = entity.mEraceAllM_SBCNT_UNIT_COST_H.delete(conn, _keyStruct);
                 
                 // 作業系列テーブルの対象全データチェック
                 checkTargetAllDataInM_PROC_GRP(_keyStruct);
              
                 // エラーがない場合、削除処理
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 作業系列テーブル削除
                  int cnt3 = entity.mEraceAllM_PROC_GRP.delete(conn, _keyStruct);
              
                  // コミット
                  conn.commit();
                  transFlg = false;
              
                  // 検索
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // 削除対象がなかった場合
                  if(cnt1 <= 0 && cnt2 <= 0 && cnt3 <= 0){
                   // 一括削除処理失敗：対象データが存在しません
                   listMessage.add("M_SBCNT_UNIT_COST.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_SBCNT_UNIT_COST_H.PROC_CD:" +  struct.getPROC_CD());
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                  }
              
                  // システムパラメータ（TIME_CTRL）取得
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //ＤＢ更新後チェック
                  if((struct.getTIME_CTRL()).equals("true")){
                      // 品目情報取得
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP製造BOM情報取得
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // 固定リードタイムチェック
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // 品目情報取得
                      List itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // 固定リードタイムチェック
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
                
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlEraceAll>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlEraceAll");

		return;
	}

	/**
	 * 番号再振ボタン押下時に実行される処理です。
	 *
	 */
	public void controlChange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlChange");
			//{{user_implement_dev:<controlChange>
                //----------------------------------------------------------------------
                boolean transFlg = false;
                List listMessage = new ArrayList();
              
                try{
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 // 作業系列情報の系列番号を"10"刻みで更新
                 for(int i = 0, t = 10; i < _procedureList.size(); i++){
              
                  AA0030010Struct updateStruct = (AA0030010Struct)_procedureList.get(i);
              
                  // 存在/更新チェック
                  List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, updateStruct);
                  if(countList.size() <= 0){
                   // 作業系列番号振直処理失敗：対象データが存在しません
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                  }else{
                   String modify = ((AA0030010Struct)countList.get(0)).getMODIFY_COUNT();
                   if (updateStruct.getMODIFY_COUNT().equals(modify) == false){
                    // 作業系列番号振直処理失敗：他の処理によりデータが書き換えられています
                    listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                    listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                    listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                    setErrorMessage("ZZ01105", listMessage);
                   }
                  }
              
                  // チェックでエラーが発生していない場合
                  if(msgStruct.sizeError() <= 0){
                   // 系列番号、工場コード、ユーザID 設定
                   updateStruct.setPROC_NO(Long.toString(t));
                   updateStruct.setPLANT_CD(struct.getPLANT_CD());
                   updateStruct.setsUser_ID(struct.getsUser_ID());
              
                   // 更新
                   entity.mModifyM_PROC_GRP.update(conn, updateStruct);
                  }else{
                   break;
                  }
              
                  t = t + 10;
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0){
                  // コミット
                  conn.commit();
                  transFlg = false;
               
                  // 検索
                  struct.copy(_keyStruct);
                  controlSelect();
                 }else{
                  // ロールバック
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlChange>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlChange");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                //------------------------------------------------------------------
              
                // 初期化
                setReadStatus(INITIAL);
                _keyStruct = new AA0030010Struct();
                struct.clear();
              
                // 作業系列情報リストクリア
                _procedureList.clear();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //---------------------------------------------------------------------
                boolean transFlg = false;
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // 項目未入力時のデフォルト値設定
                 checkStruct(struct);
              
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 boolean result = true;			// チェック結果格納
              
                 List itemList = entity.mSelectM_ITEM.read(conn, struct);
                 // 品目情報設定
                 setItemInfo(struct, itemList);
                 if(itemList.size() <= 0){
                  // 登録処理失敗：品目情報の取得に失敗しました
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  
                  setErrorMessage("AA01002", Message);
                 }else{
                  // 作業系列情報 重複チェック
                  result = entity.mcheckM_PROC_GRP.check(conn, struct);
                  if(result == true){
                   // 登録処理失敗：指定キーのデータがすでに存在します
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ01102", listMessage);
                  }
              
                  // 作業系列番号 重複チェック
                  result = entity.mcheckM_PROC_GRP_proc_no.check(conn, struct);
                  if(result == true){
                   // 登録処理失敗：作業系列番号が重複しています
                   listMessage.clear();
                   
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("AA00065", listMessage);
                  }
              
                  // 作業区コードチェック
                  if(struct.getWS_CD() != null && "".equals(struct.getWS_CD()) == false){
                   result = entity.mcheckM_WS.check(conn, struct);
                   if(result == false){
                    // 登録処理失敗：指定した作業区コードは未登録です
                    Message = "M_WS.WS_CD:" + struct.getWS_CD();
                    
                    setErrorMessage("AA01003", Message);
                   }else{
                    result = entity.mcheckM_WS_plant_cd.check(conn, struct);
                    if(result == false){
                     // 登録処理失敗：他工場の作業区コードは指定できません
                     listMessage.clear();
                     
                     listMessage.add("M_WS.PLANT_CD:" + struct.getPLANT_CD());
                     listMessage.add("M_WS.PROC_CD:" + struct.getPROC_CD());
              
                     setErrorMessage("AA01005", listMessage);
                    }
                   }
                  }
               
                  // 取引先コードチェック
                  if(struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false){
                   result = entity.mcheckM_VEND_CTRL.check(conn, struct);
                   if(result == false){
                    // 登録処理失敗：指定した取引先コードは未登録です", struct.getsUser_ID());
                    Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                    
                    setErrorMessage("AA01004", Message);
                   }
                  }
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  AA0030010Struct itemStruct = (AA0030010Struct)itemList.get(0);
              
                  // 会社コード取得
                  List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                  if(companyList.size() > 0)
                   struct.setCOMPANY_CD(((AA0030010Struct)companyList.get(0)).getCOMPANY_CD());
              
                  // 作業系列比例分ロットサイズチェック
                  boolean resultCeil = false;
                  if(itemStruct.getUNIT_QTY_TYP().intValue() == 1){
                   if(Calculate.isNumeric(struct.getPROP_LOT_SIZE()) == true){
                    resultCeil = true;
                    struct.setPROP_LOT_SIZE(Calculate.ceil(struct.getPROP_LOT_SIZE(), 0));
                   }
                  }
              
                  // 追加
                  entity.mAppendM_PROC_GRP.create(conn, struct);
                  if(resultCeil == true){
                   // 登録処理失敗：整数管理品目のため比例分ロットサイズの小数点以下は切り上げして登録しました
                   setInfoMessage("AA60002", "");
                  }
              
                  // コミット
                  conn.commit();
                  transFlg = false;
              
              
                  // 検索
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // システムパラメータ（TIME_CTRL）取得
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //ＤＢ更新後チェック
                  if((struct.getTIME_CTRL()).equals("true")){
                      // 品目情報取得
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP製造BOM情報取得
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // 固定リードタイムチェック
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // 品目情報取得
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // 固定リードタイムチェック
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }

                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //---------------------------------------------------------------------
                boolean transFlg = false;
                String inProcNo = null;
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // 項目未入力時のデフォルト値設定
                 checkStruct(struct);
              
                 // トランザクション開始
                 conn.beginTransWeb();
                 transFlg = true;
              
                 boolean result = true;			// チェック結果格納
              
                 List itemList = entity.mSelectM_ITEM.read(conn, struct);
                 // 品目情報設定
                 setItemInfo(struct, itemList);
                 if(itemList.size() <= 0){
                  // 更新処理失敗：品目情報の取得に失敗しました
                  Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                  
                  setErrorMessage("AA01002", Message);
                 }else{
                  // 存在/更新チェック
                  List countList = entity.mselectM_PROC_GRP_modify_count.read(conn, struct);
                  if(countList.size() <= 0){
                   // 更新処理失敗：対象データが存在しません
                   listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                   listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                   listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                   setErrorMessage("ZZ06001", listMessage);
                  }else{
                   String modify = ((AA0030010Struct)countList.get(0)).getMODIFY_COUNT();
                   if(struct.getMODIFY_COUNT().equals(modify) == false){
                    // 更新処理失敗：他の処理によりデータが書き換えられています", struct.getsUser_ID());
                    listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                    listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                    listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                    setErrorMessage("ZZ01105", listMessage);
                   }
                  }
              
                  // 作業系列番号 重複チェック
                  AA0030010Struct buffStruct = new AA0030010Struct(struct);
              
                  // 内部リストより修正前の作業系列番号を取得
                  for(int i=0; i<_procedureList.size(); i++)
                  {
                   if(struct.getPROC_CD().equals(((AA0030010Struct)_procedureList.get(i)).getPROC_CD())) {
                    inProcNo = ((AA0030010Struct)_procedureList.get(i)).getPROC_NO();
                    break;
                   }
                   
                  }
              
                  // 修正後の作業系列番号の取得
                  Integer procNo = IntegerConverter.Convert(struct.getPROC_NO());
                 
                  if((Integer.valueOf(inProcNo)).intValue() != procNo.intValue()){
                   result = entity.mcheckM_PROC_GRP_proc_no.check(conn, struct);
                   if(result == true){
                    // 更新処理失敗：作業系列番号が重複しています", struct.getsUser_ID());
                    listMessage.clear();
                   
                    listMessage.add("M_PROC_GRP.ITEM_CD:" + struct.getITEM_CD());
                    listMessage.add("M_PROC_GRP.PLANT_CD:" + struct.getPLANT_CD());
                    listMessage.add("M_PROC_GRP.PROC_CD:" +  struct.getPROC_CD());
              
                    setErrorMessage("AA00065", listMessage);
                   }
                  }
              
                  // 作業区コードチェック
                  if(struct.getWS_CD() != null && "".equals(struct.getWS_CD()) == false){
                   result = entity.mcheckM_WS.check(conn, struct);
                   if(result == false){
                    // 更新処理失敗：指定した作業区コードは未登録です
                    Message = "M_WS.PROC_CD:" + struct.getPROC_CD();
                  
                    setErrorMessage("AA01003", Message);
                   }else{
                    result = entity.mcheckM_WS_plant_cd.check(conn, struct);
                    if(result == false){
                     // 更新処理失敗：他工場の作業区コードは指定できません
                     listMessage.clear();
                    
                     listMessage.add("M_WS.PLANT_CD:" + struct.getPLANT_CD());
                     listMessage.add("M_WS.PROC_CD:" + struct.getPROC_CD());
              
                     setErrorMessage("AA01005", listMessage);
                    }
                   }
                  }
               
                  // 取引先コードチェック
                  if(struct.getVEND_CD() != null && "".equals(struct.getVEND_CD()) == false){
                   result = entity.mcheckM_VEND_CTRL.check(conn, struct);
                   if(result == false){
                    // 更新処理失敗：指定した取引先コードは未登録です
                    Message = "M_VEND_CTRL.VEND_CD:" + struct.getVEND_CD();
                  
                    setErrorMessage("AA01004", Message);
                   }
                  }
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  AA0030010Struct itemStruct = (AA0030010Struct)itemList.get(0);
               
                  // 会社コード取得
                  List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                  if(companyList.size() > 0)
                   struct.setCOMPANY_CD(((AA0030010Struct)companyList.get(0)).getCOMPANY_CD());
              
                  // 作業系列比例分ロットサイズチェック
                  boolean resultCeil = false;
                  if(itemStruct.getUNIT_QTY_TYP().intValue() == 1){
                   if(Calculate.isNumeric(struct.getPROP_LOT_SIZE()) == true){
                    resultCeil = true;
                    struct.setPROP_LOT_SIZE(Calculate.ceil(struct.getPROP_LOT_SIZE(), 0));
                   }
                  }
              
                  // 更新
                  entity.mModifyM_PROC_GRP.update(conn, struct);
                  if(resultCeil == true){
                   // 登録処理失敗：整数管理品目のため比例分ロットサイズの小数点以下は切り上げして登録しました", struct.getsUser_ID());
                   setInfoMessage("AA60002", "");
                  }
              
                  // コミット
                  conn.commit();
                  transFlg = false;
              
                  // 検索
                  struct.copy(_keyStruct);
                  controlSelect();
              
                  // システムパラメータ（TIME_CTRL）取得
                  AA0030010Struct TIME_CTRLStruct = new AA0030010Struct();
                  List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
                  if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
                      TIME_CTRLStruct = (AA0030010Struct)TIME_CTRLList.get(0);
                      struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
                  }else{
                      struct.setTIME_CTRL("false");
                  }

                  //ＤＢ更新後チェック
                  if((struct.getTIME_CTRL()).equals("true")){
                      // 品目情報取得
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
	                      // ASP製造BOM情報取得
	                      List bomList = entity.mSelectM_ASP_BOM.read(conn, struct);
	                      if(bomList.size() > 0){
	                       // 固定リードタイムチェック
	                       checkLTBom((AA0030010Struct)itemList.get(0), (AA0030010Struct)bomList.get(0));
	                      }
                      }
                  }else{
                      // 品目情報取得
                      itemList = entity.mSelectM_ITEM.read(conn, struct);
                      if(itemList.size() > 0){
                       // 固定リードタイムチェック
                       checkLT((AA0030010Struct)itemList.get(0));
                      }
                  }
              
                 }else{
                  // ロールバック
                  conn.rollback();
                  transFlg = false;
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }finally{
                 try {
                  if(transFlg == true){
                   // ロールバック
                   conn.rollback();
                  }
              
                 } catch(Exception e) {
                  e.printStackTrace();
                 }
                }
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //------------------------------------------------------------------
              
                // キーコピー
                struct.copy(_keyStruct);
                // 最新の状態を読み込み
                controlSelect();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //------------------------------------------------------------------
                // ユーザ定義初期化(コンボデータの取得)
                usersInitialize();
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------
              
                // ユーザ定義初期化(コンボデータの取得)
                usersInitialize();
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0030");
		logger.entering("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Append") ) {
				controlAppend();
			} else if( button.equals("Modify") ) {
				controlModify();
			} else if( button.equals("Copy") ) {
				controlCopy();
			} else if( button.equals("Erace") ) {
				controlErace();
			} else if( button.equals("EraceAll") ) {
				controlEraceAll();
			} else if( button.equals("Change") ) {
				controlChange();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 //------------------------------------------------------------------
                 // コンボボックスのデータ設定
                 struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
                 struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
                 struct.setList_OUTSIDE_TYP_val(_OUTSIDE_TYP.getValList());
                 struct.setList_OUTSIDE_TYP_name(_OUTSIDE_TYP.getExplanList());
                 struct.setList_OPR_RSLT_TYP_val(_OPR_RSLT_TYP.getValList());
                 struct.setList_OPR_RSLT_TYP_name(_OPR_RSLT_TYP.getExplanList());
                 struct.setList_ACPT_INSPC_TYP_val(_ACPT_INSPC_TYP.getValList());
                 struct.setList_ACPT_INSPC_TYP_name(_ACPT_INSPC_TYP.getExplanList());
// 2008/07/15 SYSCOM 小林 ADD START
                 struct.setList_MANHOUR_TYP_val(_MANHOUR_TYP.getValList());
                 struct.setList_MANHOUR_TYP_name(_MANHOUR_TYP.getExplanList());
// 2008/07/15 SYSCOM 小林 ADD END

                } catch(AlarmMessageException ame){
                 //ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 //throw ee;
                 //------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0030010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0030010-E999","CSVの出力処理"));
			throw new FoundationException("AA0030010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0030010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0030010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0030010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0030010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0030010Entity entity;
	protected AA0030010Struct struct;
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

		entity = new AA0030010Entity();
		struct = new AA0030010Struct();

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
	 * AA0030010クラスの標準コンストラクタ
	 */
	public AA0030010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //------------------------------------------------------------------
                // 2003/07/16 Y.Inada
                //------------------------------------------------------------------
                
                list = new ArrayList(0);
                
                //------------------------------------------------------------------
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
				AA0030010Struct key = (AA0030010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name") && key.getACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_name", key.getACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val") && key.getACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_val", key.getACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MRP_ODR_NAME") && key.getITEM_MRP_ODR_NAME() != null) {
					msgKey.setKeyValue("ITEM_MRP_ODR_NAME", key.getITEM_MRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_NAME") && key.getITEM_OUTSIDE_NAME() != null) {
					msgKey.setKeyValue("ITEM_OUTSIDE_NAME", key.getITEM_OUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_OPR_RSLT_NAME") && key.getITEM_OPR_RSLT_NAME() != null) {
					msgKey.setKeyValue("ITEM_OPR_RSLT_NAME", key.getITEM_OPR_RSLT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_NAME") && key.getACPT_INSPC_NAME() != null) {
					msgKey.setKeyValue("ACPT_INSPC_NAME", key.getACPT_INSPC_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT_1") && key.getLT_UNIT_1() != null) {
					msgKey.setKeyValue("LT_UNIT_1", key.getLT_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT_2") && key.getLT_UNIT_2() != null) {
					msgKey.setKeyValue("LT_UNIT_2", key.getLT_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT_3") && key.getLT_UNIT_3() != null) {
					msgKey.setKeyValue("LT_UNIT_3", key.getLT_UNIT_3());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MANHOUR_NAME") && key.getITEM_MANHOUR_NAME() != null) {
					msgKey.setKeyValue("ITEM_MANHOUR_NAME", key.getITEM_MANHOUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name") && key.getOPR_RSLT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_name", key.getOPR_RSLT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val") && key.getOPR_RSLT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_val", key.getOPR_RSLT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name") && key.getMANHOUR_TYP_name() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_name", key.getMANHOUR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val") && key.getMANHOUR_TYP_val() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_val", key.getMANHOUR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
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
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("SPOIL") && key.getSPOIL() != null) {
					msgKey.setKeyValue("SPOIL", key.getSPOIL());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STANDARD_COST") && key.getSTANDARD_COST() != null) {
					msgKey.setKeyValue("STANDARD_COST", key.getSTANDARD_COST());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
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
				if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP") && key.getITEM_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("ITEM_OUTSIDE_TYP", key.getITEM_OUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT") && key.getITEM_FIXED_LT() != null) {
					msgKey.setKeyValue("ITEM_FIXED_LT", key.getITEM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LT") && key.getITEM_PROP_LT() != null) {
					msgKey.setKeyValue("ITEM_PROP_LT", key.getITEM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE") && key.getITEM_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("ITEM_PROP_LOT_SIZE", key.getITEM_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT") && key.getITEM_ISSUE_LT() != null) {
					msgKey.setKeyValue("ITEM_ISSUE_LT", key.getITEM_ISSUE_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT") && key.getITEM_SAFETY_LT() != null) {
					msgKey.setKeyValue("ITEM_SAFETY_LT", key.getITEM_SAFETY_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("LT_UNIT") && key.getLT_UNIT() != null) {
					msgKey.setKeyValue("LT_UNIT", key.getLT_UNIT());
				}
				if(msgKeyType.containsKeyColumn("BOM_ITEM_CD") && key.getBOM_ITEM_CD() != null) {
					msgKey.setKeyValue("BOM_ITEM_CD", key.getBOM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("BOM_FIXED_LT") && key.getBOM_FIXED_LT() != null) {
					msgKey.setKeyValue("BOM_FIXED_LT", key.getBOM_FIXED_LT().toString());
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
					AA0030010Struct key = new AA0030010Struct();
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name")) {
						key.setACPT_INSPC_TYP_name(msgKey.getKeyValue("ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val")) {
						key.setACPT_INSPC_TYP_val(msgKey.getKeyValue("ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MRP_ODR_NAME")) {
						key.setITEM_MRP_ODR_NAME(msgKey.getKeyValue("ITEM_MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_NAME")) {
						key.setITEM_OUTSIDE_NAME(msgKey.getKeyValue("ITEM_OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_OPR_RSLT_NAME")) {
						key.setITEM_OPR_RSLT_NAME(msgKey.getKeyValue("ITEM_OPR_RSLT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_NAME")) {
						key.setACPT_INSPC_NAME(msgKey.getKeyValue("ACPT_INSPC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT_1")) {
						key.setLT_UNIT_1(msgKey.getKeyValue("LT_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT_2")) {
						key.setLT_UNIT_2(msgKey.getKeyValue("LT_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT_3")) {
						key.setLT_UNIT_3(msgKey.getKeyValue("LT_UNIT_3"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MANHOUR_NAME")) {
						key.setITEM_MANHOUR_NAME(msgKey.getKeyValue("ITEM_MANHOUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name")) {
						key.setOPR_RSLT_TYP_name(msgKey.getKeyValue("OPR_RSLT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val")) {
						key.setOPR_RSLT_TYP_val(msgKey.getKeyValue("OPR_RSLT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name")) {
						key.setMANHOUR_TYP_name(msgKey.getKeyValue("MANHOUR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val")) {
						key.setMANHOUR_TYP_val(msgKey.getKeyValue("MANHOUR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
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
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("SPOIL")) {
						key.setSPOIL(msgKey.getKeyValue("SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(new Integer(msgKey.getKeyValue("ACPT_INSPC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STANDARD_COST")) {
						key.setSTANDARD_COST(msgKey.getKeyValue("STANDARD_COST"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
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
					if(msgKeyType.containsKeyColumn("ITEM_OUTSIDE_TYP")) {
						key.setITEM_OUTSIDE_TYP(new Integer(msgKey.getKeyValue("ITEM_OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(new Integer(msgKey.getKeyValue("OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_FIXED_LT")) {
						key.setITEM_FIXED_LT(new Long(msgKey.getKeyValue("ITEM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LT")) {
						key.setITEM_PROP_LT(new Long(msgKey.getKeyValue("ITEM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_PROP_LOT_SIZE")) {
						key.setITEM_PROP_LOT_SIZE(msgKey.getKeyValue("ITEM_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_ISSUE_LT")) {
						key.setITEM_ISSUE_LT(new Long(msgKey.getKeyValue("ITEM_ISSUE_LT")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SAFETY_LT")) {
						key.setITEM_SAFETY_LT(new Long(msgKey.getKeyValue("ITEM_SAFETY_LT")));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(new Integer(msgKey.getKeyValue("MANHOUR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("LT_UNIT")) {
						key.setLT_UNIT(msgKey.getKeyValue("LT_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("BOM_ITEM_CD")) {
						key.setBOM_ITEM_CD(msgKey.getKeyValue("BOM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("BOM_FIXED_LT")) {
						key.setBOM_FIXED_LT(new Long(msgKey.getKeyValue("BOM_FIXED_LT")));
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
