/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/src/com/nec/jp/orteus/metamorBase/AA0020/AA0020030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0020;

import com.nec.jp.orteus.metamorBase.AA0020.*;
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
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.common01.Accessor.PrivateConfig;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0020030Control
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
       
        public AA0020030Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        //---------- メッセージ関連の処理-- --------------------------------------------
       
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
       
        /**
         * SQLExceptionメッセージ設定
         * @param SQLException
         * @param キー項目
         */
        private void setSqlExceptionMsg(SQLException e) throws ExpjException
        {
         // エラーメッセージ作成
         ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
         sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
         ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
         throw ee;
        }
       
        /**
         * エラーメッセージ設定
         * @param	code	メッセージ番号
         */
        private void setErrorMessage(String code)
        {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * エラー発生時パラメータ設定
         * @param	key		パラメータ
         */
        private void setErrorParameter(String key)
        {
         ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * 情報メッセージ設定
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setInfoMessage(String key)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
         msgStruct.addInfo( emsg );	// 情報メッセージとして登録
         sysLog.config(emsg, getsysUSER_CD()); //情報詳細
        }
       
        /**
         * 情報メッセージ設定
         * @param 出力メッセージ
         */
        private void setSyslogConfig(String key)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", key );
         sysLog.config(emsg, getsysUSER_CD()); //情報詳細
        }
       
        //---------- コンボボックスデータ取得関連の処理 -------------------------------
        /** 展開区分 */
        ComboStruct _comboDevelopTyp = new ComboStruct();
       
        /** 支給区分 */
        ComboStruct _comboConsTyp = new ComboStruct();
       
        /** 原価積み上げ有無 */
        ComboStruct _comboCostUpTyp = new ComboStruct();
       
        /** MRP展開有無 */
        ComboStruct _comboMrpExpTyp = new ComboStruct();
       
        /** 製品構成L/Tの使用有無 */
        ComboStruct _comboPsLtFlg = new ComboStruct();
       
        /** 品目手配区分 */
        ComboStruct _comboMrpOdrTyp = new ComboStruct();
        /** 品目内外作区分 */
        ComboStruct _comboOutsideTyp = new ComboStruct();
       
        /**
         * 区分名取得（共通）
         *
         * @param	comboStruct	区分情報リスト
         * @param	strTyp		区分コード
         * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getTypName(ComboStruct comboStruct, String strTyp)
        {
         String strTypName = strTyp;
         if((comboStruct != null) && (strTyp != null))
         {
          for(int i = 0; i < comboStruct.getValList().size(); i++)
          {
           if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true)
           {
            strTypName = (String)(comboStruct.getExplanList().get(i));
            break;
           }
          }
         }
         return strTypName;
        }
       
        //---------- 製品構成取得関連の処理 -------------------------------------------
        /** 最大レベル取得アクセスキー */
        private final String _MAX_DISPLAY_PS_LEVEL = "MAX_DISPLAY_PS_LEVEL";
         
        /** 初期レベル取得アクセスキー */
        private final String _INIT_DISPLAY_PS_LEVEL = "INIT_DISPLAY_PS_LEVEL";
       
        /** 最大展開レベル */
        String _level = null;
       
        /** 初期展開レベル */
        String _initlevel = null;
       
        /** 製品構成リスト */
        private ArrayList _deployList = new ArrayList(0);
       
        /**
         * 製品構成リスト取得 
         * @return	製品構成リスト
        */
        public ArrayList getDeployList(){ return _deployList; }
       
        //---------- 帳票出力関連の処理 ---------------------------------------------------
       
        /** フォーム識別ID */
        private final String FORMID		= "1";
       
        /** レベル番号の最大表示桁数（帳票出力用） */
        private final int LEVEL_MAXFIGURE4PRINT	= 16;
       
        /**
         * レベル番号文字列加工処理
         *
         * @param	objLevel		対象レベル番号
         * @return	true:成功 / false:失敗
         */
        private String convLevel(Integer objLevel)
        {
         String strNewNo = "";
         if(objLevel != null)
         {
          int intNo = objLevel.intValue();
       
          // intNoが16未満（1～15） 半角スペース×(16-数値桁数) + 数値の文字列に加工
          // intNoが16以上 半角スペース×(intNo-1) + 数値の文字列に加工
          int intHelfSpaceCount;
          if(intNo < LEVEL_MAXFIGURE4PRINT)
          {
           intHelfSpaceCount = (intNo - 1);
          }
          else
          {
           intHelfSpaceCount = (LEVEL_MAXFIGURE4PRINT - (objLevel.toString()).length());
          }
       
          for(int i = 0; i < intHelfSpaceCount; i++)
          {
           strNewNo += " ";
          }
          strNewNo += "" + intNo;
         }
         return strNewNo;
        }
       
        /**
         * pdf出力処理
         *
         * @param	svf				帳票ライブラリ設定情報
         * @param	structTarget	対象データ情報
         * @param	listTarget		対象データリスト
         * @return	true:成功 / false:失敗
         */
        private boolean pdfExport(
         SvfWrapper svf,
         AA0020030Struct structTarget, 
         List listTarget)
        {
         boolean bSuccess = true;	// 処理成功フラグ
       
         int ret;					// ライブラリ処理結果用
//       ヘッダ内容設定（共通）
         DateConverter dc = new DateConverter();
         ret = svf.VrCondition("[X|in_DEVELOP_TYP]=" + (structTarget.gets_DEVELOP_TYP() != null ? getTypName(_comboDevelopTyp, (structTarget.gets_DEVELOP_TYP()).toString()) : "#"),4);
         ret = svf.VrCondition("[X|in_DEVELOP_TYP_flg]=" + (structTarget.gets_DEVELOP_TYP() != null ? "1" : "0"),4);
         ret = svf.VrCondition("[X|in_ITEM_CD]=" + (structTarget.getw_TARGET_ITEM_CD() != null ? structTarget.getw_TARGET_ITEM_CD() : "#"),4);
         ret = svf.VrCondition("[X|in_ITEM_CD_flg]=" + (structTarget.getw_TARGET_ITEM_CD() != null ? "1" : "0"),4);
         String strTargetDate = dc.date2str(dc.str2date(structTarget.getw_TARGET_DATE()));// 入力した対象日付を、yyyy/mm/ddの形式へ変換
         ret = svf.VrCondition("[X|in_TARGET_DATE]=" + (strTargetDate != null ? strTargetDate : "#"),4);
         ret = svf.VrCondition("[X|in_TARGET_DATE_flg]=" + (strTargetDate != null ? "1" : "0"),4);
         
         ret = svf.VrCondition("[X|in_LEVEL]=" + (structTarget.getw_LEVEL() != null ? structTarget.getw_LEVEL() : "#"),4);
         ret = svf.VrCondition("[X|in_LEVEL_flg]=" + (structTarget.getw_LEVEL() != null ? "1" : "0"),4);
       
         AA0020030Struct structTemp = (AA0020030Struct)listTarget.get(0);
         ret = svf.VrCondition("[X|in_ITEM_NAME]=" + (structTemp.getPARENT_ITEM_NAME() != null ? structTemp.getPARENT_ITEM_NAME() : "#"),4);
         ret = svf.VrCondition("[X|in_ITEM_NAME_flg]=" + (structTemp.getPARENT_ITEM_NAME() != null ? "1" : "0"),4);
         //検索条件
         ret = svf.VrCondition("[X|PRINT_USER]=" + struct.getsysUser(),4);
         ret = svf.VrCondition("[X|SYS_DATETIME]=" + struct.getsysDateTime(),4);
         return bSuccess;
        }
       
        //---------- 正展開 --------------------------------------------------------
       
        /** 正展開
         * @param item 親品目
         * @param deployLevel 展開レベル
         * @param tagetDate 対象日付
         * @param no 階層レベル
        */
        public void getDeploy(
             String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
         // 子品目の構成情報取得
         DateConverter dc = new DateConverter();
         AA0020030Struct workStruct = new AA0020030Struct();
         workStruct.setPARENT_ITEM_CD(item);
         if(targetDate != null)
         {
          workStruct.setEFF_PHASE_IN_DATE(dc.date2str(targetDate));
          workStruct.setEFF_PHASE_OUT_DATE(dc.date2str(targetDate));
         }
         else
         {
          workStruct.setEFF_PHASE_IN_DATE(null);
          workStruct.setEFF_PHASE_OUT_DATE(null);
         }
         List deployList = entity.mS_BOM.read(conn, workStruct);
       
         // 展開レベルチェック
         if(deployLevel.intValue() <= 1){
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // 構成情報から更に下の子品目取得
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());           
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
           getDeploy(
               ((AA0020030Struct)deployList.get(i)).getCOMP_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        //---------- 逆展開 --------------------------------------------------------
       
        /** 逆展開
         * @param item 子品目
         * @param deployLevel 展開レベル
         * @param tagetDate 対象日付
         * @param no 階層レベル
        */
        public void getReverseDeploy(
            String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
         // 子品目の構成情報取得
         DateConverter dc = new DateConverter();
         AA0020030Struct workStruct = new AA0020030Struct();
         workStruct.setCOMP_ITEM_CD(item);
         if(targetDate != null)
         {
          workStruct.setEFF_PHASE_IN_DATE(dc.date2str(targetDate));
          workStruct.setEFF_PHASE_OUT_DATE(dc.date2str(targetDate));
         }
         else
         {
          workStruct.setEFF_PHASE_IN_DATE(null);
          workStruct.setEFF_PHASE_OUT_DATE(null);
         }
         List deployList = entity.mR_BOM.read(conn, workStruct);
       
         // 展開レベルチェック
         if(deployLevel.intValue() <= 1){
          // 最大展開レベル
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // 構成情報から更に上の親品目取得
          for(int i = 0; i < deployList.size(); i++){
           AA0020030Struct noStruct = (AA0020030Struct)deployList.get(i);
           noStruct.setNO(no);
           noStruct.setsysUser(struct.getsysUser());
           noStruct.setsysDateTime(struct.getsysDateTime());
           noStruct.setPRINT_SQL_NO(struct.getPRINT_SQL_NO());
           struct.setPRINT_SQL_NO(new Integer(struct.getPRINT_SQL_NO().intValue()+1));
           noStruct.setstrNO(noStruct.getNO() != null ? convLevel(noStruct.getNO()) : "");
           noStruct.setPARENT_MRP_ODR_TYP(noStruct.getPARENT_MRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getPARENT_MRP_ODR_TYP()).toString()) : "");
           noStruct.setPARENT_OUTSIDE_TYP(noStruct.getPARENT_OUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getPARENT_OUTSIDE_TYP()).toString()) : "");
           noStruct.setMRP_ODR_TYP(noStruct.getMRP_ODR_TYP() != null ? getTypName(_comboMrpOdrTyp, (noStruct.getMRP_ODR_TYP()).toString()) : "");
           noStruct.setOUTSIDE_TYP(noStruct.getOUTSIDE_TYP() != null ? getTypName(_comboOutsideTyp, (noStruct.getOUTSIDE_TYP()).toString()) : "");
           noStruct.setstr_PS_LT_FLG(noStruct.getPS_LT_FLG() != null ? getTypName(_comboPsLtFlg, (noStruct.getPS_LT_FLG()).toString()) : "");
           noStruct.setstr_CONS_TYP(noStruct.gets_CONS_TYP() != null ? getTypName(_comboConsTyp, (noStruct.gets_CONS_TYP()).toString()) : "");
           noStruct.setstr_COST_UP_TYP(noStruct.gets_COST_UP_TYP() != null ? getTypName(_comboCostUpTyp, (noStruct.gets_COST_UP_TYP()).toString()) : "");
           noStruct.setstr_MRP_EXP_TYP(noStruct.gets_MRP_EXP_TYP() != null ? getTypName(_comboMrpExpTyp, (noStruct.gets_MRP_EXP_TYP()).toString()) : "");
           noStruct.setsUser_ID(struct.getsUser_ID());
           entity.mINSERT_M_PS_LIST_T.create(conn,noStruct);
           _deployList.add(deployList.get(i));
           getReverseDeploy(
               ((AA0020030Struct)deployList.get(i)).getPARENT_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        //------------------------------------------------------------------------------
        /**
         * 出力一覧情報取得
         *
         * @return	出力一覧情報取得 / エラー:null
         * @throws	BusinessProcessException, FoundationException
         */
        private List getOutList() throws BusinessProcessException, FoundationException
        {
         List listTarget = null;
         boolean bSuccess = false;
       
         try
         {
           // 対象品目情報格納
          List workList = null;
       
          // 構成情報リストクリア
          _deployList.clear();
       
          // 展開レベルのチェック
          Integer level = Integer.valueOf(_level);
       
          // 入力した展開レベルをInteger型に変換して取得する
          IntegerConverter conv = new IntegerConverter();
          Integer inLevel = conv.Convert(struct.getw_LEVEL());
          if(level.intValue() < inLevel.intValue()){
           ExpjMessage emsg = new ExpjMessage( "AA00146", ""+_level );
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
          // 対象品目情報取得
          workList = entity.mselectM_ITEM.read(conn, struct);
          if(workList.size() <= 0){	// 対象品目の取得失敗
           setErrorMessage("ZZ06001");
           setErrorParameter("M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD());
          }
       
          // チェックでエラーが発生していない場合
          if(msgStruct.sizeError() <= 0)
          {
           AA0020030Struct targetStruct = new AA0020030Struct();
           targetStruct.clear();
           AA0020030Struct workStruct = (AA0020030Struct)workList.get(0);
           targetStruct.setPARENT_ITEM_CD(workStruct.getPARENT_ITEM_CD());
           targetStruct.setPARENT_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
           targetStruct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
           targetStruct.setNO(new Integer(1));
           _deployList.add(targetStruct);
       
           // 展開レベル'0'でない場合、展開処理実施
           if(inLevel.intValue() != 0){
       
            // 正展開?逆展開?
            DateConverter dc = new DateConverter();
            if(struct.gets_DEVELOP_TYP().intValue() == 1){
             // 正展開
             if(struct.getw_TARGET_DATE() == null ||
               "".equals(struct.getw_TARGET_DATE()) == true){
              // 対象日付無
              getDeploy(struct.getw_TARGET_ITEM_CD(), 
                   inLevel, null, new Integer(2));
             }
             else{
              // 対象日付有
              Date targetDate = dc.str2date(struct.getw_TARGET_DATE());
              getDeploy(struct.getw_TARGET_ITEM_CD(), 
                   inLevel, targetDate, new Integer(2));
             }
            }
            else{
             // 逆展開
             if(struct.getw_TARGET_DATE() == null ||
               "".equals(struct.getw_TARGET_DATE()) == true){
              // 対象日付無
              getReverseDeploy(struct.getw_TARGET_ITEM_CD(), 
                    inLevel, null, new Integer(2));
             }
             else{
              // 対象日付有
              Date targetDate = dc.str2date(struct.getw_TARGET_DATE());
              getReverseDeploy(struct.getw_TARGET_ITEM_CD(), 
                    inLevel, targetDate, new Integer(2));
             }
            }
           }
       
           // 取得データがある場合のみ出力用リストへ取得リストを設定する
           if(_deployList.size() <= 1)
           {
            // 対象データが存在しない
            if(struct.gets_DEVELOP_TYP().intValue() == 1)
            {
             // 正展開
             setErrorMessage("AA00144");
             setErrorParameter("M_PS.PARENT_ITEM_CD:" + struct.getw_TARGET_ITEM_CD());
             setErrorParameter("M_PS.EFF_PHASE_IN_DATE:" + struct.getw_TARGET_DATE());
             setErrorParameter("M_PS.EFF_PHASE_OUT_DATE:" + struct.getw_TARGET_DATE());
            }
            else
            {
             // 逆展開
             setErrorMessage("AA00144");
             setErrorParameter("M_PS.COMP_ITEM_CD:" + struct.getw_TARGET_ITEM_CD());
             setErrorParameter("M_PS.EFF_PHASE_IN_DATE:" + struct.getw_TARGET_DATE());
             setErrorParameter("M_PS.EFF_PHASE_OUT_DATE:" + struct.getw_TARGET_DATE());
            }
           }
           else
           {
            // 処理成功
            bSuccess = true;
           }
          }
         } catch(SQLException e) {
          setSqlExceptionMsg(e);
         }finally{
          if(bSuccess == true)
          {
           listTarget = _deployList;
           conn.commit();
          }
          conn.rollback();
         }
         return listTarget;
        }
        
    	/**
    	 * システムの日付取得
    	 */
    	public String getDateTime(){
    		Date datetime = new Date();
    		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddhhmmssSSS");
    		return sdf.format(datetime);
    	}       
        //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
                // 初期化
                struct.initializeParent();
              
                // レベル設定
                struct.setw_LEVEL(_initlevel);
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AA0020030Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                //---------------------------------------------------------------------
                ///////////////////////////////////////////////////////////////////////////////
                //sysdatetime取得
		        struct.setsysDateTime(this.getDateTime());
		        struct.setsysUser(this.sysUSER_CD);
		        struct.setPRINT_SQL_NO(new Integer(1));
                // 出力データ取得
                List listTarget = getOutList();
              
                // 出力対象データがない場合は何もしない
                if(listTarget == null || listTarget.size() <= 0)
                {
                 return;
                }
                ///////////////////////////////////////////////////////////////////////////////
                try {
                 ///////////////////////////////////////////////////////////////////////////////
                 String printId1 = sp.getProcId() + FORMID;	// 帳票IDを指定してください
                 ///////////////////////////////////////////////////////////////////////////////
                 ret = svf.VrInit(printId1);	// PDF作成開始
                 ret = svf.VrSetDocName2("作業指示票");	// スプーラ表示の文書名の指定
                 pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
                 pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
                 //Add start jijinxu
                 queryFileName = svf.getQueryFileName();	// queryファイル名
                 //Add end jijinxu
                 String excuteOutput = svf.getExcuteOutput();	// サーバ出力処理
                 frmFileName = new String(printId1 + ".frm");	// frmファイル名

              
                 
              
                 ///////////////////////////////////////////////////////////////////////////////
                 setSyslogConfig("printType [" + printType + "]");
                 setSyslogConfig("printPattern [" + printPattern + "]");
                 setSyslogConfig("pdfFilePath [" + pdfFilePath + "]");
                 setSyslogConfig("pdfFileName [" + pdfFileName + "]");
                 setSyslogConfig("frmFileName [" + frmFileName + "]");
                 setSyslogConfig("excuteOutput [" + excuteOutput + "]");
                 ///////////////////////////////////////////////////////////////////////////////
                 if ( "1".equals(printPattern) ) {	// 再検索して印刷の場合
                  // 再検索処理を記述してください。
                  //controlSelect();
                 }
              
                 ///////////////////////////////////////////////////////////////////////////////
                 if(ret != 0)
                 {
                  setSyslogConfig("Form-file not found.("+ ret +") [" + frmFileName + "]");
                 }
				/* クエリーファイルの指定 */
				 if(dbKIND != null && !dbKIND.equals("")) {
				    ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
				 } else {
				    ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
				 }
                 // PDF出力データ設定
                 pdfExport(svf, struct, listTarget);
                 ///////////////////////////////////////////////////////////////////////////////
     			/* クエリー実行 */
     			ret = svf.VrReport();
     			if(ret == -554) {
     				ExpjMessage emsg = new ExpjMessage("ZZ06001");
     				msgStruct.addError(emsg);
     				sysLog.warning(emsg, sysUSER_CD);
     				return;
     			}		
                if(ret == 0) {
                		try{
                			entity.mDELETE_M_PS_LIST_T.delete(conn,struct);
                		}catch(Exception e){
                			e.printStackTrace();
                			conn.rollback();
                		}				
     				conn.commit();
     			}
                
                //PDF作成終了
                 ret = svf.VrQuit();								// PDF作成終了
                 ///////////////////////////////////////////////////////////////////////////////
                 if(ret < 0)
                 {
                  setSyslogConfig("Error : VrQuit (" + ret + ")");
                 }
                 ///////////////////////////////////////////////////////////////////////////////
              
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
                   //Runtime.getRuntime().exec(excuteOutput);
                  }catch(IOException e){
                   // サーバ印刷失敗時のエラー処理を記述してください。
                  }
                 }
              
              //			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "に出力");
                 ///////////////////////////////////////////////////////////////////////////////
                 setSyslogConfig("Completion of PDF-data output.");
                 ///////////////////////////////////////////////////////////////////////////////
                } finally {
                 //
                }
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
                try{
                 
                 PrivateConfig c = new PrivateConfig(conn);
                 // 初期展開レベル取得
                 Integer initlevel = c.getNumber(_INIT_DISPLAY_PS_LEVEL);
                 if(initlevel == null){
                  // 初期展開レベルが定義されていません
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.INIT_DISPLAY_PS_LEVEL:" + initlevel );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 else if(initlevel.intValue() < 0){
                  // 初期展開レベルの値が正しくありません
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.INIT_DISPLAY_PS_LEVEL:" + initlevel );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 // 最大展開レベル取得
                 Integer level = c.getNumber(_MAX_DISPLAY_PS_LEVEL);
                 if(level == null){
                  // 最大展開レベルが定義されていません
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.MAX_DISPLAY_PS_LEVEL:" + level );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
                 else if(level.intValue() < 0){
                  // 最大展開レベルの値が正しくありません
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  ExpjMessage emsg_log = new ExpjMessage( "ZZ01006", "SYS_PARAMETER.MAX_DISPLAY_PS_LEVEL:" + level );
                  sysLog.severe(emsg, getsysUSER_CD());
                  sysLog.severe(emsg_log, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
              
                  throw ee;
                 }
              
                 _level = level.toString();
                 _initlevel = initlevel.toString();
              
                 // コンボボックスデータ用意
                 ComboBox controller
                       = new ComboBox(conn, sysUSER_CD);
              
                 _comboDevelopTyp = controller.getData("DEVELOP_TYP");
                 _comboConsTyp = controller.getData("CONS_TYP");
                 _comboCostUpTyp = controller.getData("COST_UP_TYP");
                 _comboMrpExpTyp = controller.getData("MRP_EXP_TYP");
                 _comboPsLtFlg = controller.getData("PS_LT_FLG");
                 _comboMrpOdrTyp = controller.getData("MRP_ODR_TYP");
                 _comboOutsideTyp = controller.getData("OUTSIDE_TYP");
                 controller.setConnection(null);
              
                 // クリア処理
                 controlclear();
              
                }
                catch(SQLException e)
                {
                 setSqlExceptionMsg(e);
                }
                catch(ComboException e)
                {
                 // エラー処理を記述してください。
                 ExpjMessage emsg = new ExpjMessage("ZZ01106");
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                 // ダウンロードファイル名クリア
                 // PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
                 struct.setDOWNLOAD_FILE((String)null);
                 // コンボボックス部品のデータのセットはここに記述してください。
                 // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0020030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                      //------------------------------------------------------------------
                struct.setList_s_DEVELOP_TYP_val(_comboDevelopTyp.getValList());
                struct.setList_s_DEVELOP_TYP_name(_comboDevelopTyp.getExplanList());
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
//			throw new FoundationException("AA0020030Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020030-E999","CSVの出力処理"));
			throw new FoundationException("AA0020030Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020030-E999","システム日付の取得処理"));
				throw new FoundationException("AA0020030Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020030-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0020030Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0020030Entity entity;
	protected AA0020030Struct struct;
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

		entity = new AA0020030Entity();
		struct = new AA0020030Struct();

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
	 * AA0020030クラスの標準コンストラクタ
	 */
	public AA0020030Control() throws BusinessProcessException, FoundationException
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
				AA0020030Struct key = (AA0020030Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_TARGET_DATE") && key.getw_TARGET_DATE() != null) {
					msgKey.setKeyValue("w_TARGET_DATE", key.getw_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP") && key.gets_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP", key.gets_DEVELOP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_name") && key.gets_DEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP_name", key.gets_DEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_val") && key.gets_DEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("s_DEVELOP_TYP_val", key.gets_DEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_LEVEL") && key.getw_LEVEL() != null) {
					msgKey.setKeyValue("w_LEVEL", key.getw_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP") && key.getin_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("in_DEVELOP_TYP", key.getin_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_CD") && key.getin_ITEM_CD() != null) {
					msgKey.setKeyValue("in_ITEM_CD", key.getin_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PRINT_DATE") && key.getPRINT_DATE() != null) {
					msgKey.setKeyValue("PRINT_DATE", key.getPRINT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRINT_TIME") && key.getPRINT_TIME() != null) {
					msgKey.setKeyValue("PRINT_TIME", key.getPRINT_TIME());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_NAME") && key.getin_ITEM_NAME() != null) {
					msgKey.setKeyValue("in_ITEM_NAME", key.getin_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_TARGET_DATE") && key.getin_TARGET_DATE() != null) {
					msgKey.setKeyValue("in_TARGET_DATE", key.getin_TARGET_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_LEVEL") && key.getin_LEVEL() != null) {
					msgKey.setKeyValue("in_LEVEL", key.getin_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("CURRENT_PAGE") && key.getCURRENT_PAGE() != null) {
					msgKey.setKeyValue("CURRENT_PAGE", key.getCURRENT_PAGE());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PAGE") && key.getTOTAL_PAGE() != null) {
					msgKey.setKeyValue("TOTAL_PAGE", key.getTOTAL_PAGE());
				}
				if(msgKeyType.containsKeyColumn("LEVEL") && key.getLEVEL() != null) {
					msgKey.setKeyValue("LEVEL", key.getLEVEL());
				}
				if(msgKeyType.containsKeyColumn("COST_UP_TYP") && key.getCOST_UP_TYP() != null) {
					msgKey.setKeyValue("COST_UP_TYP", key.getCOST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_EXP_TYP") && key.getMRP_EXP_TYP() != null) {
					msgKey.setKeyValue("MRP_EXP_TYP", key.getMRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP_flg") && key.getin_DEVELOP_TYP_flg() != null) {
					msgKey.setKeyValue("in_DEVELOP_TYP_flg", key.getin_DEVELOP_TYP_flg());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_CD_flg") && key.getin_ITEM_CD_flg() != null) {
					msgKey.setKeyValue("in_ITEM_CD_flg", key.getin_ITEM_CD_flg());
				}
				if(msgKeyType.containsKeyColumn("in_ITEM_NAME_flg") && key.getin_ITEM_NAME_flg() != null) {
					msgKey.setKeyValue("in_ITEM_NAME_flg", key.getin_ITEM_NAME_flg());
				}
				if(msgKeyType.containsKeyColumn("in_TARGET_DATE_flg") && key.getin_TARGET_DATE_flg() != null) {
					msgKey.setKeyValue("in_TARGET_DATE_flg", key.getin_TARGET_DATE_flg());
				}
				if(msgKeyType.containsKeyColumn("in_LEVEL_flg") && key.getin_LEVEL_flg() != null) {
					msgKey.setKeyValue("in_LEVEL_flg", key.getin_LEVEL_flg());
				}
				if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP") && key.getPARENT_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("PARENT_MRP_ODR_TYP", key.getPARENT_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP") && key.getPARENT_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PARENT_OUTSIDE_TYP", key.getPARENT_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO().toString());
				}
				if(msgKeyType.containsKeyColumn("sysUser") && key.getsysUser() != null) {
					msgKey.setKeyValue("sysUser", key.getsysUser());
				}
				if(msgKeyType.containsKeyColumn("sysDateTime") && key.getsysDateTime() != null) {
					msgKey.setKeyValue("sysDateTime", key.getsysDateTime());
				}
				if(msgKeyType.containsKeyColumn("PRINT_SQL_NO") && key.getPRINT_SQL_NO() != null) {
					msgKey.setKeyValue("PRINT_SQL_NO", key.getPRINT_SQL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("str_CONS_TYP") && key.getstr_CONS_TYP() != null) {
					msgKey.setKeyValue("str_CONS_TYP", key.getstr_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("str_PS_LT_FLG") && key.getstr_PS_LT_FLG() != null) {
					msgKey.setKeyValue("str_PS_LT_FLG", key.getstr_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("str_COST_UP_TYP") && key.getstr_COST_UP_TYP() != null) {
					msgKey.setKeyValue("str_COST_UP_TYP", key.getstr_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("str_MRP_EXP_TYP") && key.getstr_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("str_MRP_EXP_TYP", key.getstr_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("strNO") && key.getstrNO() != null) {
					msgKey.setKeyValue("strNO", key.getstrNO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD") && key.getw_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("w_TARGET_ITEM_CD", key.getw_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_TYP") && key.gets_CONS_TYP() != null) {
					msgKey.setKeyValue("s_CONS_TYP", key.gets_CONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_FLG") && key.getPS_LT_FLG() != null) {
					msgKey.setKeyValue("PS_LT_FLG", key.getPS_LT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("PS_FIXED_LT") && key.getPS_FIXED_LT() != null) {
					msgKey.setKeyValue("PS_FIXED_LT", key.getPS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LT") && key.getPS_PROP_LT() != null) {
					msgKey.setKeyValue("PS_PROP_LT", key.getPS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE") && key.getPS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PS_PROP_LOT_SIZE", key.getPS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("PS_REF_NO") && key.getPS_REF_NO() != null) {
					msgKey.setKeyValue("PS_REF_NO", key.getPS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("s_COST_UP_TYP") && key.gets_COST_UP_TYP() != null) {
					msgKey.setKeyValue("s_COST_UP_TYP", key.gets_COST_UP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP") && key.gets_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("s_MRP_EXP_TYP", key.gets_MRP_EXP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME") && key.getCOMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("COMP_ITEM_NAME", key.getCOMP_ITEM_NAME());
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
					AA0020030Struct key = new AA0020030Struct();
					if(msgKeyType.containsKeyColumn("w_TARGET_DATE")) {
						key.setw_TARGET_DATE(msgKey.getKeyValue("w_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP")) {
						key.sets_DEVELOP_TYP(new Integer(msgKey.getKeyValue("s_DEVELOP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_name")) {
						key.sets_DEVELOP_TYP_name(msgKey.getKeyValue("s_DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_DEVELOP_TYP_val")) {
						key.sets_DEVELOP_TYP_val(msgKey.getKeyValue("s_DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_LEVEL")) {
						key.setw_LEVEL(msgKey.getKeyValue("w_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP")) {
						key.setin_DEVELOP_TYP(msgKey.getKeyValue("in_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_CD")) {
						key.setin_ITEM_CD(msgKey.getKeyValue("in_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_DATE")) {
						key.setPRINT_DATE(msgKey.getKeyValue("PRINT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_TIME")) {
						key.setPRINT_TIME(msgKey.getKeyValue("PRINT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_NAME")) {
						key.setin_ITEM_NAME(msgKey.getKeyValue("in_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_TARGET_DATE")) {
						key.setin_TARGET_DATE(msgKey.getKeyValue("in_TARGET_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_LEVEL")) {
						key.setin_LEVEL(msgKey.getKeyValue("in_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("CURRENT_PAGE")) {
						key.setCURRENT_PAGE(msgKey.getKeyValue("CURRENT_PAGE"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PAGE")) {
						key.setTOTAL_PAGE(msgKey.getKeyValue("TOTAL_PAGE"));
					}
					if(msgKeyType.containsKeyColumn("LEVEL")) {
						key.setLEVEL(msgKey.getKeyValue("LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("COST_UP_TYP")) {
						key.setCOST_UP_TYP(msgKey.getKeyValue("COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_EXP_TYP")) {
						key.setMRP_EXP_TYP(msgKey.getKeyValue("MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_DEVELOP_TYP_flg")) {
						key.setin_DEVELOP_TYP_flg(msgKey.getKeyValue("in_DEVELOP_TYP_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_CD_flg")) {
						key.setin_ITEM_CD_flg(msgKey.getKeyValue("in_ITEM_CD_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_ITEM_NAME_flg")) {
						key.setin_ITEM_NAME_flg(msgKey.getKeyValue("in_ITEM_NAME_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_TARGET_DATE_flg")) {
						key.setin_TARGET_DATE_flg(msgKey.getKeyValue("in_TARGET_DATE_flg"));
					}
					if(msgKeyType.containsKeyColumn("in_LEVEL_flg")) {
						key.setin_LEVEL_flg(msgKey.getKeyValue("in_LEVEL_flg"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP")) {
						key.setPARENT_MRP_ODR_TYP(msgKey.getKeyValue("PARENT_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP")) {
						key.setPARENT_OUTSIDE_TYP(msgKey.getKeyValue("PARENT_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(new Integer(msgKey.getKeyValue("NO")));
					}
					if(msgKeyType.containsKeyColumn("sysUser")) {
						key.setsysUser(msgKey.getKeyValue("sysUser"));
					}
					if(msgKeyType.containsKeyColumn("sysDateTime")) {
						key.setsysDateTime(msgKey.getKeyValue("sysDateTime"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_SQL_NO")) {
						key.setPRINT_SQL_NO(new Integer(msgKey.getKeyValue("PRINT_SQL_NO")));
					}
					if(msgKeyType.containsKeyColumn("str_CONS_TYP")) {
						key.setstr_CONS_TYP(msgKey.getKeyValue("str_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("str_PS_LT_FLG")) {
						key.setstr_PS_LT_FLG(msgKey.getKeyValue("str_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("str_COST_UP_TYP")) {
						key.setstr_COST_UP_TYP(msgKey.getKeyValue("str_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("str_MRP_EXP_TYP")) {
						key.setstr_MRP_EXP_TYP(msgKey.getKeyValue("str_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("strNO")) {
						key.setstrNO(msgKey.getKeyValue("strNO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD")) {
						key.setw_TARGET_ITEM_CD(msgKey.getKeyValue("w_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_TYP")) {
						key.sets_CONS_TYP(new Integer(msgKey.getKeyValue("s_CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_FLG")) {
						key.setPS_LT_FLG(new Integer(msgKey.getKeyValue("PS_LT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("PS_FIXED_LT")) {
						key.setPS_FIXED_LT(msgKey.getKeyValue("PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LT")) {
						key.setPS_PROP_LT(msgKey.getKeyValue("PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("PS_PROP_LOT_SIZE")) {
						key.setPS_PROP_LOT_SIZE(msgKey.getKeyValue("PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("PS_REF_NO")) {
						key.setPS_REF_NO(msgKey.getKeyValue("PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_COST_UP_TYP")) {
						key.sets_COST_UP_TYP(new Integer(msgKey.getKeyValue("s_COST_UP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP")) {
						key.sets_MRP_EXP_TYP(new Integer(msgKey.getKeyValue("s_MRP_EXP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME")) {
						key.setCOMP_ITEM_NAME(msgKey.getKeyValue("COMP_ITEM_NAME"));
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
