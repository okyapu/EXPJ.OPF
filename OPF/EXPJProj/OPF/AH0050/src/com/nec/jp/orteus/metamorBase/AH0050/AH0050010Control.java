/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0050/src/com/nec/jp/orteus/metamorBase/AH0050/AH0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0050;

import com.nec.jp.orteus.metamorBase.AH0050.*;
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
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.lot.BizCommon;
import java.math.BigDecimal;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0050010Control
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
       //	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
        public AH0050010Struct getListvalue(int x) { return (AH0050010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AH0050010Struct getStruct() { return this.struct; }	// Structを返します。
        public AH0050010Struct createStruct() { return new AH0050010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AH0050010Struct)structname); }	// Structをセットします。
       //	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        //-------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
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
       
        //------------------------------------------------------------------
       
        /**
         * SQLExceptionエラーメッセージ設定
         * @param SQLException
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
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
    	/**
    	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
    	 * @param code メッセージコード
    	 */
    	private void setWarningMessage(String code, String msg1, String msg2) {
    		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
    		msgStruct.addWarn(emsg);
    		sysLog.info(emsg, sysUSER_CD);
    	}
        /**
         * 情報メッセージ設定
         * @param メッセージ番号
         * @param 置換文字列１
         */
        private void setInfoMessage(String messageno, String value1)
        {
         ExpjMessage emsg = new ExpjMessage( messageno , value1 );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
         
        /**
         * ログメッセージ設定
         * @param 出力メッセージ
         */
        private void setSyslogConfig(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.config(emsg, getsysUSER_CD());
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
       
        //------------------------------------------------------------------
       
        /**
         * 表示最大行数制限処理
         *
         * @param key アクセスキー
         * @param size 対象行数
         * @return 異常なし true エラー false
         */
        private boolean checkMaxDispLine(int key, long rowCount) throws FoundationException, SQLException
        {
         ScreenParam sp = new ScreenParam(this.getClass());
         int maxLine = sp.getMaxLine(conn,key);
         if(maxLine != 0 && rowCount == maxLine + 1)
         {
          ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          return false;
         }
         return true;
        }
       
        //------------------------------------------------------------------
        //------------------------------------------------------------------
       
        /** 棚卸情報取得用クラスオブジェクト用意 */
        InvAccessor _invAccessor = null;
       
        /** 親画面パラメータ（最大表示行数）取得アクセスキー */
        private final static int _DISPLAY_CD_PARENT = 10;
       
        /** 親画面struct情報一時退避用 */
        private AH0050010Struct _save_struct = new AH0050010Struct();
        
    	/** ロット管理フラグ用 */
    	private String _LOT_CTRL_FLG = null;
    	
    	/** ロット管理導入済チェック */
    	String lotCtrl = null;
    	
        /** 実棚数用 */
        private String _ACTUAL_STOCK_QTY = null; 
        
        // ----- シスタム設定値取得 ---------------	
    	private PrivateConfig privateConfig;
    	private int _MaxCsvTake = 10000;
        // ----- シスタム設定値取得 ---------------		
    	
    	/** 棚卸承認 */
    	String aprInvCtrl = "";	

    	/** 棚卸承認区分 */
    	String aprFlg = "";	
       
        /**
         * 親画面のstruct情報を退避
         */
        private void saveParentStruct()
        {
         _save_struct.copy(struct);
        }
       
        /**
         * 親画面のstruct情報を復帰
         */
        private void loadParentStruct()
        {
         struct.copy(_save_struct);
         setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
        }
       
        /** 子画面struct情報コピー用 */
        private AH0050010Struct _copy_sub_struct = new AH0050010Struct();
       
        /** 製番在庫指定フラグ */
        String _strJOB_ODR_CD_STOCK_flg = null;
       
        /**
         * 製番在庫指定フラグ取得
         * @return 製番在庫指定フラグ
         */
        private String getJOB_ODR_CD_STOCK_flg()
        {
         return _strJOB_ODR_CD_STOCK_flg;
        }
       
        /**
         * 製番在庫指定フラグ設定
         * @param 製番在庫指定フラグ
         */
        private void setJOB_ODR_CD_STOCK_flg(String flg)
        {
         _strJOB_ODR_CD_STOCK_flg = flg;
        }
       
        /**
         * 棚卸期間中データ読込処理
         *
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0050010Struct readT_INV_CTRL_INV_STS_TYP1() throws FoundationException, SQLException
        {
         // ログ出力情報格納用
         List listMessage = new ArrayList();
       
         // 処理に関連するパラメータを設定
         AH0050010Struct targetStruct = new AH0050010Struct();
         targetStruct.setPLANT_CD(getsysPLANT_CD());
       
         // 読込実行
         List read_list = new ArrayList();
         read_list = entity.mT_INV_CTRL_INV_STS_TYP1.read(conn, targetStruct);
       
         // レコード件数チェック
         if(read_list.size() <= 0)
         {
          // レコード件数が０(ゼロ)件の場合
          listMessage.add("T_INV_CTRL.PLANT_CD:" + targetStruct.getPLANT_CD());
          setErrorMessage("AH00022", listMessage);
          listMessage.clear();
          return null;
         }
       
         // 読込情報取得
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
         
         /*//棚卸承認区分を取得
         targetStruct.setINV_DATE(readStruct.getINV_DATE());
         List apprList = entity.mselectApprFlg.read(conn,targetStruct);
         if(apprList.size() > 0){        	 
        	 readStruct.seth_APRR_FLG(((AH0050010Struct)apprList.get(0)).geth_APRR_FLG());
         }*/
       
         // 棚卸状況文字列取得設定処理
         String strInvStatus = _invAccessor.getInvStatus(
          conn,
          readStruct.getREGULAR_INV_FLG(),
          readStruct.getCYCLE_INV_FLG(),
          readStruct.getTEMP_INV_FLG(),
          readStruct.getINV_STS_TYP(),
          CoreTools.getLocale(struct.getsUser_ID()));
         readStruct.setw_INV_status(strInvStatus);
         return readStruct;
        }
        
       
        /**
         * 棚卸制御データ読込処理
         *
         * @param targetStruct 対象データ情報
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0050010Struct readT_INV_CTRL(AH0050010Struct targetStruct) throws BusinessProcessException, FoundationException, SQLException
        {
         // ログ出力情報格納用
         List listMessage = new ArrayList();
       
         // 読込実行
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL.read(conn, targetStruct);
       
         // レコード件数チェック
         if(read_list.size() <= 0)
         {
          // レコード件数が０(ゼロ)件の場合
          listMessage.add("T_INV_CTRL.INV_DATE:" + targetStruct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + targetStruct.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          listMessage.clear();
          return null;
         }
       
         // 読込情報取得
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
       
         // 棚卸状況文字列取得設定処理
         String strInvStatus = _invAccessor.getInvStatus(
          conn,
          readStruct.getREGULAR_INV_FLG(),
          readStruct.getCYCLE_INV_FLG(),
          readStruct.getTEMP_INV_FLG(),
          readStruct.getINV_STS_TYP(),
          CoreTools.getLocale(struct.getsUser_ID()));
         readStruct.setw_INV_status(strInvStatus);
         return readStruct;
        }
       
        /**
         * 保管区読込処理
         *
         * @param targetStruct 対象データ情報
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0050010Struct readWH(AH0050010Struct targetStruct) throws BusinessProcessException, FoundationException, SQLException
        {
         // ログ出力情報格納用
         List listMessage = new ArrayList();
       
         // 読込実行
         List read_list = new ArrayList(0);
         read_list = entity.mM_WH.read(conn, targetStruct);
       
         // 保管区存在チェック
         if(read_list.size() <= 0)
         {
          listMessage.add("M_WH.WH_CD:" + targetStruct.getWH_CD());
          setErrorMessage("AH00019", listMessage);
          listMessage.clear();
          return null;
         }
       
         // 読込情報取得
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
         return readStruct;
        }
       
        /**
         * 保管区チェック処理
         *
         * @param targetStruct 対象データ情報
         * @return 異常なし true エラー false
         */
        private boolean checkWH(AH0050010Struct targetStruct) throws BusinessProcessException
        {
         // ログ出力情報格納用
         List listMessage = new ArrayList();
       
         // 保管区.工場コードがログインユーザの工場コードと同じかどうかのチェック
         if(getsysPLANT_CD().equals(targetStruct.getPLANT_CD()) != true)
         {
          listMessage.add("M_WH.WH_CD:" + targetStruct.getWH_CD());
          listMessage.add("M_WH.PLANT_CD:" + targetStruct.getPLANT_CD());
          setErrorMessage("AH00020", listMessage);
          listMessage.clear();
          return false;
         }
       
         return true;
        }
       
        /**
         * 品目読込処理
         *
         * @param targetStruct 対象データ情報
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0050010Struct readITEM(AH0050010Struct targetStruct) throws BusinessProcessException, FoundationException, SQLException
        {
         // ログ出力情報格納用
         List listMessage = new ArrayList();
       
         // 読込実行
         List read_list = new ArrayList(0);
         read_list = entity.mM_ITEM.read(conn, targetStruct);
       
         // 品目存在チェック
         if(read_list.size() <= 0)
         {
          listMessage.add("M_ITEM.ITEM_CD:" + targetStruct.getITEM_CD());
          setErrorMessage("AH00002", listMessage);
          listMessage.clear();
          return null;
         }
       
         // 読込情報取得
         AH0050010Struct readStruct = new AH0050010Struct();
         readStruct = (AH0050010Struct)read_list.get(0);
       
         return readStruct;
        }
       
        //------------------------------------------------------------------
        //------------------------------------------------------------------
       
        //---------- ＣＳＶ取込関連の処理 ---------------------------------------------------
       
        /** CSV取込結果メッセージ情報格納用リスト */
        ArrayList _listResultMessageCsv = new ArrayList(0);
       
        /**
         * CSV取込結果情報追加
         *
         * @return	なし
         */
        public void csvResultListAdd(String strMessage, int intRow, int intCol)
        {
         // メッセージ情報格納用
         AH0050010Struct structTemp = new AH0050010Struct();
 		 // 多言語項目取得対応
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         // 行、列情報「{0}件目の{1}項目」
         ExpjMessage emsg = new ExpjMessage("AH00045", ""+(intRow+1), ""+(intCol+1));
         structTemp.setERR_ADR(emsg.getMessage(locale));
         sysLog.warning(emsg, getsysUSER_CD());
       
         // 詳細内容
         structTemp.setERR_MSG(strMessage);
       
         // リストへ情報追加
         _listResultMessageCsv.add(structTemp);
       
         return;
        }
       
        /**
         * CSV取込結果情報リスト取得
         *
         * @return	CSV取込結果情報リスト
         */
        public List getCsvResultList()
        {
         return _listResultMessageCsv;
        }
       
        /**
         * CSV取込結果情報リストサイズ取得
         *
         * @return	CSV取込結果情報リストサイズ
         */
        public int getCsvResultListSize()
        {
         return _listResultMessageCsv.size();
        }
       
        /**
         *  CSV取込結果情報リストクリア
         *
         * @return	なし
         */
        public void csvResultListClear()
        {
         _listResultMessageCsv.clear();
        }
       
       
        /** ＣＳＶ項目番号定義 */
        private final int CSV_COLNO_WH_CD = 0;
        private final int CSV_COLNO_ITEM_CD = 1;
        private final int CSV_COLNO_JOB_ODR_CD = 2;
        private final int CSV_COLNO_LOT_NO = 3;
        private final int CSV_COLNO_ACTUAL_STOCK_QTY = 4;
        /** ＣＳＶ取込データ必要項目数 */
        private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_ACTUAL_STOCK_QTY+1);
       
       
        /**
         * ＣＳＶデータ取得とリストデータ化
         *
         * @return	CSVデータリスト
         */
        private List readCsvData() throws ExpjException
        {
         // ログ出力情報格納用
         List listMessage = new ArrayList();
       
         String [] strsCsvData = null;
         List listCsv = null;
         try {
       
          // ＣＳＶデータのアップロード
          strsCsvData = (String []) csvReader.lineRead();
          if(null != strsCsvData)
          {
           setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
       
           // データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
           listCsv = new ArrayList(0);
           for(int i = 0; i < strsCsvData.length; i++)
           {
            // 改行のみのレコードでEOFと判断します
            if(strsCsvData[i].length() == 0)
            {
             break;
            }
            // タイトル行読み飛ばし
            if(i == 0)
            {
             continue;
            }
       
            // レコードを項目毎にばらす
            AH0050010Struct structCsv = new AH0050010Struct();
            Vector v = csvReader.importCSVLine(strsCsvData[i]);
            if(null != v)
            {
             // 項目数チェック
             int intColNum = v.size();
             if(CSV_NECESSARY_COLUMN <= intColNum)
             {
              // ＣＳＶの項目をリストデータ化
              structCsv.setWH_CD((String) v.get(CSV_COLNO_WH_CD));
              structCsv.setITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
              structCsv.setJOB_ODR_CD((String) v.get(CSV_COLNO_JOB_ODR_CD));
              structCsv.setACTUAL_STOCK_QTY((String) v.get(CSV_COLNO_ACTUAL_STOCK_QTY));
              structCsv.setLOT_NO((String) v.get(CSV_COLNO_LOT_NO));
              structCsv.setw_COLUMN_FLG((String)null);
              // 処理に関連するパラメータを設定
              structCsv.setPLANT_CD(getsysPLANT_CD());
              structCsv.setINV_DATE(_save_struct.getINV_DATE());
              structCsv.setREGULAR_INV_FLG(_save_struct.getREGULAR_INV_FLG());
              structCsv.setCYCLE_INV_FLG(_save_struct.getCYCLE_INV_FLG());
              structCsv.setTEMP_INV_FLG(_save_struct.getTEMP_INV_FLG());
              structCsv.setINV_STS_TYP(_save_struct.getINV_STS_TYP());
             }
             else
             {
              // 項目数が必要項目数未満のときは項目数不足エラー
              structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
             }
             // リスト追加
             listCsv.add(structCsv);
            }
            else
            {
             //ベクター生成失敗エラー
             setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
             listCsv = null;
             break;
            }
           }
           // ＣＳＶデータ件数（タイトル行は省く）
           if((listCsv == null) || (listCsv.size() <= 0))
           {
            // 取込失敗またはデータなし
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            msgStruct.addError( emsg );
            sysLog.warning(emsg, getsysUSER_CD());
            listCsv = null;
           }
           else
           {
            // ＣＳＶ読込み件数ログ表示
            ExpjMessage emsg = new ExpjMessage( "AH00043", ""+listCsv.size());
            sysLog.config(emsg, getsysUSER_CD());
           }
          }
       
         } catch(Exception e){
          ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
       
         }
         return listCsv;
        }
       
        /**
         * ＣＳＶデータ内容チェック処理
         *
         * @param	listCsv	CSVデータリスト
         * @return	正常:true / エラー:false
         */
        private boolean checkCsvData(List listCsv) throws BusinessProcessException, FoundationException
        {
         // ログ出力情報格納用
         String logMessage = "";
 		 // 多言語項目取得対応
 		 String locale = CoreTools.getLocale(sysUSER_CD);
         boolean bSuccess = true;	// 処理成功フラグ初期化
         int intSuccessCount = 0;	// チェック正常レコード件数
         int intCsvDataCount = 0;	// 対象データ件数
         List listRead;				// 作業用
         try {
          ExpjMessage emsg = null;
          AH0050010Struct structCsv;
          AH0050010Struct tempStruct;
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV情報取得
           structCsv = (AH0050010Struct)listCsv.get(i);
       
           // 項目数不足エラー行はチェックしない
           if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true)
           {
            // 項目数不足エラー
            emsg = new ExpjMessage( "AH00044", ""+CSV_NECESSARY_COLUMN );
            csvResultListAdd(emsg.getMessage(locale) , i , Integer.parseInt(structCsv.getw_COLUMN_FLG()));
            sysLog.warning(emsg, getsysUSER_CD());
            continue;
           }
       
           ////////////////////////////////////////////////////////////////////////////////////
           // 個別チェック処理開始
           ////////////////////////////////////////////////////////////////////////////////////
           
           boolean bError = false;			// エラーフラグ初期化
           boolean bItemError = false;		// 品目保管区エラーフラグ初期化
       
           // 保管区チェック
           if(structCsv.getWH_CD() == null || ("").equals(structCsv.getWH_CD()) == true)
           {
            // 保管区がnull
            emsg = new ExpjMessage( "AH00014" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.WH_CD:" + structCsv.getWH_CD();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
            bItemError = true;
           }
           else
           {
            // 保管区読込み
            listRead = entity.mM_WH.read(conn, structCsv);
            if(listRead.size() <= 0)
            {
             // 保管区が存在しない
             emsg = new ExpjMessage( "AH00019" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "M_WH.WH_CD:" + structCsv.getWH_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
             bItemError = true;
            }
            else
            {
             AH0050010Struct readStructWh = new AH0050010Struct();
             readStructWh = (AH0050010Struct)listRead.get(0);
             if(getsysPLANT_CD().equals(readStructWh.getPLANT_CD()) != true)
             {
              // 保管区の工場コードがログインユーザの工場でない
              emsg = new ExpjMessage( "AH00020" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_WH.WH_CD:" + readStructWh.getWH_CD()
                + "M_WH.PLANT_CD:" + readStructWh.getPLANT_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
              bItemError = true;
             }
            }
           }
       
           // 品目番号チェック
           if(structCsv.getITEM_CD() == null || ("").equals(structCsv.getITEM_CD()) == true)
           {
            // 品目番号がnull
            emsg = new ExpjMessage( "AH00001" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.ITEM_CD:" + structCsv.getITEM_CD();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
            bItemError = true;
           }
           else
           {
            // 品目読込み
            listRead = entity.mM_ITEM.read(conn, structCsv);
            if(listRead.size() <= 0)
            {
             // 品目が存在しない
             emsg = new ExpjMessage( "AH00002" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
             bItemError = true;
            }
            else
            {
             AH0050010Struct readStructItem = new AH0050010Struct();
             readStructItem = (AH0050010Struct)listRead.get(0);
             _LOT_CTRL_FLG = readStructItem.getLOT_CTRL_FLG();
             structCsv.setUNIT_QTY_TYP(readStructItem.getUNIT_QTY_TYP());
             if("8".equals(readStructItem.getMRP_ODR_TYP()) == true)
             {
              // 指定された品目が擬似品目
              emsg = new ExpjMessage( "AH00028" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
              bItemError = true;
             }
             // 品目の棚卸区分が9（棚卸しない）かどうかのチェック
             if("9".equals(readStructItem.getABC_TYP()) == true)
             {
              // 指定された品目の棚卸区分が9棚卸しない）
              emsg = new ExpjMessage( "AH00016" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
              bItemError = true;
             }
       
             // 製番がnullでない場合のチェック
             if(structCsv.getJOB_ODR_CD() != null && ("").equals(structCsv.getJOB_ODR_CD()) != true)
             {
              // MRP系品目かどうかのチェック
              if(Calculate.compare(readStructItem.getMRP_ODR_TYP(), "3") == 1)
              {
               // 指定された品目がMRP系品目
               emsg = new ExpjMessage( "AH00027" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_JOB_ODR_CD);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "CSV.JOB_ODR_CD:" + structCsv.getJOB_ODR_CD()
                 + ", M_ITEM.ITEM_CD:" + structCsv.getITEM_CD()
                 + ", M_ITEM.MRP_ODR_TYP:" + readStructItem.getMRP_ODR_TYP();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
       
              // 所要量に存在するかどうかのチェック
              listRead = entity.mT_OD.read(conn, structCsv);
              if(listRead.size() <= 0)
              {
               // 所要量に存在しない
               emsg = new ExpjMessage( "AH00039" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_JOB_ODR_CD);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "T_OD.JOB_ODR_CD:" + structCsv.getJOB_ODR_CD()
                 + ", T_OD.ITEM_CD:" + structCsv.getITEM_CD()
                 + ", T_OD.PLANT_CD:" + structCsv.getPLANT_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             } else {
            	 if(_LOT_CTRL_FLG.equals("1")){
            		 if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            				 && readStructItem.getLOT_NUMBERING_TYP().equals("0")){
                		 if(structCsv.getLOT_NO()==null || ("").equals(structCsv.getLOT_NO()) == true){
                			 emsg = new ExpjMessage( "AH60007" );
                	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
                	         sysLog.warning(emsg, getsysUSER_CD());
                	         logMessage = "CSV.ITEM_CD:" + structCsv.getITEM_CD();
                	         emsg = new ExpjMessage( "ZZ01006", logMessage );
                	         sysLog.warning(emsg, getsysUSER_CD());
                	         bError = true;
                	         bItemError = true;
                		 }
            		 } else if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            				 && !readStructItem.getLOT_NUMBERING_TYP().equals("0")) {
            			 if(structCsv.getLOT_NO()!=null && !("").equals(structCsv.getLOT_NO())){
                			 struct.setINV_DATE(struct.getINV_DATE());
                			 struct.setWH_CD(structCsv.getWH_CD());
                			 struct.setPLANT_CD(sysPLANT_CD);
                			 struct.setITEM_CD(structCsv.getITEM_CD());
                			 struct.setLOT_NO(structCsv.getLOT_NO());
                			 List listCtrl = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
            				 if(listCtrl.size() <= 0){
            					 emsg = new ExpjMessage( "AE00165" );
                    	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_LOT_NO);
                    	         sysLog.warning(emsg, getsysUSER_CD());
                    	         logMessage = "CSV.T_LOT_CTRL:" + structCsv.getLOT_NO();
                    	         emsg = new ExpjMessage( "ZZ01006", logMessage );
                    	         sysLog.warning(emsg, getsysUSER_CD());
                    	         bError = true;
                    	         bItemError = true;
            				 } else {
            					 if(Calculate.compare(
        								 ((AH0050010Struct)listCtrl.get(0)).getLOT_DEL_FLG(),
        								 "0")!=0){
                					 emsg = new ExpjMessage( "AE00165" );
                        	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_LOT_NO);
                        	         sysLog.warning(emsg, getsysUSER_CD());
                        	         logMessage = "CSV.T_LOT_CTRL:" + structCsv.getLOT_NO();
                        	         emsg = new ExpjMessage( "ZZ01006", logMessage );
                        	         sysLog.warning(emsg, getsysUSER_CD());
                        	         bError = true;
                        	         bItemError = true;
        						 }
            				 }
            			 }
            		 }
            	 }else{
            		 if(structCsv.getLOT_NO()!=null && ("").equals(structCsv.getLOT_NO()) != true){
            			 emsg = new ExpjMessage( "AH60006" );
            	         csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
            	         sysLog.warning(emsg, getsysUSER_CD());
            	         logMessage = "CSV.ITEM_CD:" + structCsv.getITEM_CD();
            	         emsg = new ExpjMessage( "ZZ01006", logMessage );
            	         sysLog.warning(emsg, getsysUSER_CD());
            	         bError = true;
            	         bItemError = true;
            		 }
            	 }
             }
            }
           }
       
           // 保管区、品目番号にエラーがない場合
           if(bItemError != true)
           {
            // 循環棚卸がONの場合のチェック
            if("1".equals(structCsv.getCYCLE_INV_FLG()) == true)
            {
             // 品目別棚卸サイクルから品目、工場が等しいデータを検索
             listRead = entity.mT_INV_CYCLE.read(conn, structCsv);
             if(listRead.size() <= 0)
             {
              // 品目別棚卸サイクルに品目、工場が等しいデータが存在しない
              emsg = new ExpjMessage( "AH00040" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "T_INV_CYCLE.ITEM_CD:" + structCsv.getITEM_CD()
                + ", T_INV_CYCLE.PLANT_CD:" + structCsv.getPLANT_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             else
             {
              // 品目別棚卸サイクルから読み込んだデータの取得
              AH0050010Struct readStructInvCycle = (AH0050010Struct)listRead.get(0);
       
              // 棚卸サイクルの実施フラグをリストデータ化
              List listInvFlg = new ArrayList(0);
              listInvFlg.add(readStructInvCycle.getINV_FLG_JAN());// １月
              listInvFlg.add(readStructInvCycle.getINV_FLG_FEB());// ２月
              listInvFlg.add(readStructInvCycle.getINV_FLG_MAR());// ３月
              listInvFlg.add(readStructInvCycle.getINV_FLG_APR());// ４月
              listInvFlg.add(readStructInvCycle.getINV_FLG_MAY());// ５月
              listInvFlg.add(readStructInvCycle.getINV_FLG_JUN());// ６月
              listInvFlg.add(readStructInvCycle.getINV_FLG_JUL());// ７月
              listInvFlg.add(readStructInvCycle.getINV_FLG_AUG());// ８月
              listInvFlg.add(readStructInvCycle.getINV_FLG_SEP());// ９月
              listInvFlg.add(readStructInvCycle.getINV_FLG_OCT());// １０月
              listInvFlg.add(readStructInvCycle.getINV_FLG_NOV());// １１月
              listInvFlg.add(readStructInvCycle.getINV_FLG_DEC());// １２月
       
              // 棚卸日付の月を取得
              DateConverter dateConv = new DateConverter();
              Date dateWork = dateConv.str2date(structCsv.getINV_DATE());
              Calendar cal = new GregorianCalendar();
              cal.setTime(dateWork);
              int intMonth = cal.get(Calendar.MONTH);
       
              // 棚卸日月の棚卸実施フラグのチェック
              if("1".equals((String)listInvFlg.get(intMonth)) != true)
              {
               // 棚卸日の月の棚卸実施フラグがONでない
               emsg = new ExpjMessage( "AH00040" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "T_INV_CYCLE.ITEM_CD:" + structCsv.getITEM_CD()
                 + ", T_INV_CYCLE.PLANT_CD:" + structCsv.getPLANT_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             }
            }
       
            // 臨時棚卸がONの場合のチェック
            if("1".equals(structCsv.getTEMP_INV_FLG()) == true)
            {
             // 棚卸条件品目指定から棚卸日、工場、品目が等しいデータを検索
             List listInvTargetItem = entity.mT_INV_TARGET_ITEM.read(conn, structCsv);
             // 棚卸条件保管区指定から棚卸日、工場、保管区が等しいデータを検索
             List listInvTargetWh = entity.mT_INV_TARGET_WH.read(conn, structCsv);
             if( (listInvTargetItem.size() <= 0) && (listInvTargetWh.size() <= 0) )
             {
              // 棚卸条件品目指定に棚卸日、工場、品目が等しいデータが存在しない
              // さらに、棚卸条件保管区指定に棚卸日、工場、保管区が等しいデータが存在しない
              emsg = new ExpjMessage( "AH00040" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "T_INV_TARGET_ITEM.ITEM_CD:" + structCsv.getITEM_CD()
                + ", T_INV_TARGET_WH.WH_CD:" + structCsv.getWH_CD()
                + ", INV_DATE:" + structCsv.getINV_DATE()
                + ", PLANT_CD:" + structCsv.getPLANT_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
            }
           }
       
           // 実棚数チェック
           if(structCsv.getACTUAL_STOCK_QTY() == null || ("").equals(structCsv.getACTUAL_STOCK_QTY()) == true)
           {
            // 実棚数がnull
            emsg = new ExpjMessage( "AH00017" );
            csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
            sysLog.warning(emsg, getsysUSER_CD());
            logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
            emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.warning(emsg, getsysUSER_CD());
            bError = true;
           }
           else
           {
            if((Calculate.isInteger(structCsv.getACTUAL_STOCK_QTY()) == false)
            && (Calculate.isNumeric(structCsv.getACTUAL_STOCK_QTY()) == false))
            {
             // 実棚数が数値型でない
             emsg = new ExpjMessage( "AH00017" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
            	double ACTUAL_STOCK_QTY = Double.parseDouble(Calculate.floor(structCsv.getACTUAL_STOCK_QTY(), 4));
            	double ACTUAL_STOCK_QTY1 = Double.parseDouble(structCsv.getACTUAL_STOCK_QTY());
            	if(ACTUAL_STOCK_QTY !=ACTUAL_STOCK_QTY1){
            		// 実棚数が小数部 4桁 を超えていた場合
                    emsg = new ExpjMessage( "AH00017" );
                    csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
                    sysLog.warning(emsg, getsysUSER_CD());
                    logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
                    emsg = new ExpjMessage( "ZZ01006", logMessage );
                    sysLog.warning(emsg, getsysUSER_CD());
                    bError = true;
            	}else{
            		if(ACTUAL_STOCK_QTY1 >= 100000000000000d){
            			// 実棚数が整数部 14桁 を超えていた場合
                        emsg = new ExpjMessage( "AH00017" );
                        csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
                        sysLog.warning(emsg, getsysUSER_CD());
                        logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
                        emsg = new ExpjMessage( "ZZ01006", logMessage );
                        sysLog.warning(emsg, getsysUSER_CD());
                        bError = true;
            		}            		         	
            	}
             if(Calculate.compare(structCsv.getACTUAL_STOCK_QTY(), "0") < 0)
             {
              // 実棚数が負の値
              emsg = new ExpjMessage( "AH00017" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
       
             // 整数管理品目で小数が指定されたらエラー
             if(("1".equals(structCsv.getUNIT_QTY_TYP()) == true)
             && (Calculate.isNumeric(structCsv.getACTUAL_STOCK_QTY()) == true) )
             {
              // 整数管理品目に小数は指定できない
              emsg = new ExpjMessage( "AH00029" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ACTUAL_STOCK_QTY);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD()
                + ", CSV.ACTUAL_STOCK_QTY:" + structCsv.getACTUAL_STOCK_QTY();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
            }
           }
           
           // 棚卸日、品目番号、保管区コード、ロット番号の重複チェック
           for (int j = i + 1; j < intCsvDataCount; j++) {
				tempStruct = (AH0050010Struct) listCsv.get(j);
				if(structCsv.getITEM_CD().equals(tempStruct.getITEM_CD())
						&& structCsv.getWH_CD().equals(tempStruct.getWH_CD())
						&& structCsv.getLOT_NO()!= null && !"".equals(structCsv.getLOT_NO()) && structCsv.getLOT_NO().equals(tempStruct.getLOT_NO())) {
		              // 重複場合
		              emsg = new ExpjMessage( "AD20405" );
		              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_LOT_NO);
		              sysLog.warning(emsg, getsysUSER_CD());
		              logMessage = "CSV.LOT_NO:" + structCsv.getLOT_NO();
		              emsg = new ExpjMessage( "ZZ01006", logMessage );
		              sysLog.warning(emsg, getsysUSER_CD());
		              bError = true;
		              break;
				}
				// 品目番号、保管区コード、製番の重複チェック
				if(structCsv.getITEM_CD().equals(tempStruct.getITEM_CD())
						&& structCsv.getWH_CD().equals(tempStruct.getWH_CD())
						&& structCsv.getJOB_ODR_CD()!= null && !"".equals(structCsv.getJOB_ODR_CD()) && structCsv.getJOB_ODR_CD().equals(tempStruct.getJOB_ODR_CD())) {
		              // 重複場合
		              emsg = new ExpjMessage( "AD20405" );
		              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_JOB_ODR_CD);
		              sysLog.warning(emsg, getsysUSER_CD());
		              logMessage = "CSV.JOB_ODR_CD:" + structCsv.getJOB_ODR_CD();
		              emsg = new ExpjMessage( "ZZ01006", logMessage );
		              sysLog.warning(emsg, getsysUSER_CD());
		              bError = true;
		              break;
				}
			}
           // チェックエラーとなっていない場合、正常レコードとしてカウント
           if(bError != true)
           {
            intSuccessCount++;
           }
           ////////////////////////////////////////////////////////////////////////////////////
           // 個別チェック処理終了
           ////////////////////////////////////////////////////////////////////////////////////
       
          } // for()
       
          // チェック結果処理
          if(getCsvResultListSize() > 0)
          {
           bSuccess = false;
          }
       
          if(bSuccess != true)
          {
           // エラーデータ有りのため更新しなかった場合のメッセージ表示
           emsg = new ExpjMessage( "AH00041",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
         }catch(SQLException e){
          setSqlExceptionMsg(e);
         }
         return bSuccess;
        }
       
        /**
         * ＣＳＶデータＤＢ反映処理
         *
         * @param	listCsv	CSVデータリスト
         * @return	正常:true / エラー:false
         */
        private boolean csvData2Db(List listCsv) throws BusinessProcessException, FoundationException
        {
         // ログ出力情報格納用
         String logMessage = "";
         String keyMessage = "";
         int length = 0;
         String itemCd[] = new String[_MaxCsvTake];
         String whCd[] = new String[_MaxCsvTake];
         boolean bSuccess = false;	// 処理成功フラグ初期化
         boolean bDBUpdate = false;	// DB更新中フラグ初期化
         int intCsvDataCount = 0;	// 対象データ件数
         List listRead;				// 作業用
       
         // 処理直前のstruct情報を退避
         AH0050010Struct structCopy = new AH0050010Struct();
         structCopy.copy(struct);
         try
         {
          // トランザクション開始
          conn.beginTransWeb();
       
          // DB更新中フラグON
          bDBUpdate = true;
       
          // データ件数分処理を繰り返す
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV情報取得
           struct.copy((AH0050010Struct)listCsv.get(i));
       
           if(struct.getJOB_ODR_CD() == null || ("").equals(struct.getJOB_ODR_CD()) == true)
           {
				List listLotCtrlFlg = entity.mM_ITEM.read(conn, struct);
				_LOT_CTRL_FLG = ((AH0050010Struct) listLotCtrlFlg.get(0)).getLOT_CTRL_FLG();
				String str_LOT_NUMBERING_TYP = ((AH0050010Struct) listLotCtrlFlg.get(0)).getLOT_NUMBERING_TYP();
				if (_LOT_CTRL_FLG.equals("1")) {

					List listLotNo = entity.mT_LOT_INV4Update.read(conn,struct);
					if (listLotNo == null || listLotNo.size() <=0) {

						// [品目]．”ロット番号採番区分”＝ 1:自動採番する。(連番） or 2:日単位採番 かつ
						// [CSVデータ]”在庫ロット番号” =NULL 或いは、[CSVデータ]”在庫ロット番号”、
						// [CSVデータ]”品目番号” で[ロット管理]を検索し（[ロット管理]“削除フラグ”=0
						// 未削除）、
						// [ロット管理]に存在しない場合 の場合下記採番処理を行う。
						boolean b_Lot_Flg = false;
						boolean b_create_Lot = true;
						if (str_LOT_NUMBERING_TYP != null && !"0".equals(str_LOT_NUMBERING_TYP)) {
							if (struct.getLOT_NO() == null) {
								// 在庫ロット番号の自動採番を行う。
								String itemCdStr = struct.getITEM_CD();
								String acptDateStr = structCopy.getINV_DATE();
								BizCommon bc = new BizCommon(conn,getsysUSER_CD(), sp.getProcId(),getsysPLANT_CD());			
								List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);										
								if (bc.getResultStatus().intValue() == 1) {
									if (resultList != null && resultList.size() > 0) {
										String result1 = (String) resultList.get(0);
										struct.setLOT_NO(result1);
										entity.mupdate_T_LOT_CTRL.update(conn, struct);
									}
								} else {
									if (resultList != null && resultList.size() > 1) {
										String result2 = (String) resultList.get(1);			
										setErrorMessage(result2);
										conn.rollback();
										return false;
									}
								}
							} else {
								List lot_list = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
								if (lot_list.isEmpty()) {
									b_Lot_Flg = true;
								} else {
									String str_DEL_FLG = ((AH0050010Struct) lot_list.get(0)).getLOT_DEL_FLG();
									if (str_DEL_FLG != null && (!"0".equals(str_DEL_FLG))) {
										b_Lot_Flg = true;
									}
								}
							}

							if (b_Lot_Flg) {
								// 在庫ロット番号の自動採番を行う。
								String itemCdStr = struct.getITEM_CD();
								String acptDateStr = structCopy.getINV_DATE();
								BizCommon bc = new BizCommon(conn,getsysUSER_CD(), sp.getProcId(),getsysPLANT_CD());
								List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
										
								if (bc.getResultStatus().intValue() == 1) {
									if (resultList != null && resultList.size() > 0) {
										String result1 = (String) resultList.get(0);
										if (result1.equals(struct.getLOT_NO())) {
											b_create_Lot = true;
											struct.setLOT_DEL_FLG("0");
											entity.mselect_T_LOT_CTRL.update(conn, struct);
										} else {
											struct.setLOT_NO(result1);
											entity.mupdate_T_LOT_CTRL.update(conn, struct);
											List list_LotNo = entity.mT_LOT_INV4Update.read(conn, struct);
											if (!list_LotNo.isEmpty()) {
												b_create_Lot = false;
											} else {
												b_create_Lot = true;
											}
										}
									}
								} else {
									if (resultList != null && resultList.size() > 1) {
										String result2 = (String) resultList.get(1);
										setErrorMessage(result2);
										conn.rollback();
										return false;
									}
								}
							}

							if (!b_create_Lot) {
								setSyslogConfig("T_LOT_INV.update");
								// 更新対象データが存在した場合更新実行
								struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
								entity.mupdateT_LOT_INV.update(conn, struct);
										
							} else {
								setSyslogConfig("T_LOT_INV.create");
								// 更新対象データが存在しなかった場合登録実行
								struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
								entity.mcreate_T_LOT_INV.create(conn,struct);
										
							}

						} else {
							if (struct.getLOT_NO() != null) {
								struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
								List lot_list = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
								if (lot_list != null && lot_list.size()>0){
									entity.mupdate_T_LOT_CTRL.update(conn,struct);
								} else {
									// 更新対象データが存在した場合更新実行
									struct.setBEST_BEFORE_DATE(get_Str_BEST_BEFORE_DATE(struct));
									entity.mselect_T_LOT_CTRL.create(conn, struct);
									keyMessage = "T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD()
										+ "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
	                      			//在庫ロット番号が存在しなかったので、新規採番しました
	                      			setInfoMessage("AH00049","");
	                      			setInfoMessage("ZZ01006",keyMessage);
								}
								
								if (listLotNo!= null && listLotNo.size()>0) {
									setSyslogConfig("T_LOT_INV.update");
									// 更新対象データが存在した場合更新実行
									entity.mupdateT_LOT_INV.update(conn, struct);
								} else {
									setSyslogConfig("T_LOT_INV.create");
									// 更新対象データが存在した場合更新実行
									entity.mcreate_T_LOT_INV.create(conn, struct);
								}
							}
						}
					} else {
						struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
						List lot_list = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
						if (lot_list != null && lot_list.size()>0){
							entity.mupdate_T_LOT_CTRL.update(conn,struct);
						} else {
							// 更新対象データが存在した場合更新実行
							struct.setBEST_BEFORE_DATE(get_Str_BEST_BEFORE_DATE(struct));
							entity.mselect_T_LOT_CTRL.create(conn, struct);
						}
						setSyslogConfig("T_LOT_INV.update");
						// 更新対象データが存在した場合更新実行
						struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
						entity.mupdateT_LOT_INV.update(conn, struct);
					}

					if (length == 0) {
						length = length + 1;
						itemCd[length] = struct.getITEM_CD();
						whCd[length] = struct.getWH_CD();					
					} else {
						int flg = 1;
						for (int j = 1; j <= length; j++) {							
							flg = 1;
							if (struct.getITEM_CD().equals(itemCd[j])&& struct.getWH_CD().equals(whCd[j])) {
								flg = 0;
								break;
							}
						}
						if (flg == 1) {
							length = length + 1;
							itemCd[length] = struct.getITEM_CD();
							whCd[length] = struct.getWH_CD();
						}
					}

				} else {
					// 品目棚卸データ存在チェック
					listRead = entity.mT_ITEM_INV4Update.read(conn, struct);

					if (listRead.size() <= 0) {
						setSyslogConfig("T_ITEM_INV.create");
						// 更新対象データが存在しなかった場合登録実行
						entity.mT_ITEM_INV.create(conn, struct);
					} else {
						setSyslogConfig("T_ITEM_INV.update");
						// 更新対象データが存在した場合更新実行
						entity.mT_ITEM_INV.update(conn, struct);
					}
				}
			}
           else
           {
            // 製番データ存在チェック
            listRead = entity.mT_JOB_ODR_CD_INV4Update.read(conn, struct);
            if(listRead.size() <= 0)
            {
             setSyslogConfig("T_JOB_ODR_CD_INV.create");
             // 更新対象データが存在しなかった場合登録実行
             entity.mT_JOB_ODR_CD_INV.create(conn, struct);
            }
            else
            {
             setSyslogConfig("T_JOB_ODR_CD_INV.update");
             // 更新対象データが存在した場合更新実行
             entity.mT_JOB_ODR_CD_INV.update(conn, struct);
            }
           }
          } // for()
		  for (int i = 1; i <= length; i++) {
			  struct.setITEM_CD(itemCd[i]);
			  struct.setWH_CD(whCd[i]);
			  List actaualList = entity.mselectActualStockQty1.read(conn,struct);

			  AH0050010Struct newStruct = new AH0050010Struct();
			  if (!actaualList.isEmpty()) {
				  newStruct = (AH0050010Struct) actaualList.get(0);
				  struct.setACTUAL_STOCK_QTY(newStruct.getACTUAL_STOCK_QTY_2());
						  
				  // 品目棚卸データ存在チェック
				  listRead = entity.mT_ITEM_INV4Update.read(conn, struct);
				  if (listRead.size() <= 0) {
					  setSyslogConfig("T_ITEM_INV.create");
					  // 更新対象データが存在しなかった場合登録実行
					  entity.mT_ITEM_INV.create(conn, struct);
				  } else {
					  setSyslogConfig("T_ITEM_INV.update");
					  // 更新対象データが存在した場合更新実行
					  entity.mT_ITEM_INV.update(conn, struct);
				  }
			  }
		  }
          // コミット
          conn.commit();
       
          // DB更新中フラグOFF
          bDBUpdate = false;
       
          // 処理成功フラグ設定
          bSuccess = true;
       
         } catch(SQLException e) {
          if(struct.getJOB_ODR_CD() == null || ("").equals(struct.getJOB_ODR_CD()) == true)
          {
           // 品目棚卸データ（ログ情報）
           keyMessage = "T_ITEM_INV.INV_DATE:" +  struct.getINV_DATE()
             + ", T_ITEM_INV.WH_CD:" +  struct.getWH_CD()
             + ", T_ITEM_INV.ITEM_CD:" +  struct.getITEM_CD()
             + ", T_ITEM_INV.PLANT_CD:" +  struct.getPLANT_CD()
             + ", T_ITEM_INV.ACTUAL_STOCK_QTY:" +  struct.getACTUAL_STOCK_QTY();
          }else{
           // 製番棚卸データ（ログ情報）
           keyMessage = "T_JOB_ODR_CD_INV.INV_DATE:" +  struct.getINV_DATE()
             + ", T_JOB_ODR_CD_INV.WH_CD:" +  struct.getWH_CD()
             + ", T_JOB_ODR_CD_INV.ITEM_CD:" +  struct.getITEM_CD()
             + ", T_JOB_ODR_CD_INV.JOB_ODR_CD:" +  struct.getJOB_ODR_CD()
             + ", T_JOB_ODR_CD_INV.PLANT_CD:" +  struct.getPLANT_CD()
             + ", T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:" +  struct.getACTUAL_STOCK_QTY();
          }
          ExpjMessage emsg = new ExpjMessage( "ZZ01006", keyMessage );
          sysLog.severe(emsg, getsysUSER_CD());
          setSqlExceptionMsg(e);
       
         } finally {
          // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
          if(bDBUpdate == true)
          {
           // ロールバック
           conn.rollback();
           setSyslogConfig("Control：csvData2Db - rollback!! ");
       
           // 処理直前のstruct情報復帰
           struct.copy(structCopy);
       
           // 更新失敗のメッセージ表示
           ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0");
           msgStruct.addError( emsg );
           sysLog.warning(emsg, getsysUSER_CD());
          }
       
          if(bSuccess == true)
          {
           // 正常終了のメッセージ表示
           ExpjMessage emsg = new ExpjMessage( "AH60005", ""+intCsvDataCount, "0");
           msgStruct.addInfo( emsg );
           sysLog.config(emsg, getsysUSER_CD());
          }
         }
         return bSuccess;
        }
       
       
       
	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AH0050010Struct sysParameterStruct = (AH0050010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPAST_RESULT_ENTRY_TYP() && !"".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
				if("false".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
					b = false;
				}
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return b;
	}
	/**
	 * 実際原価管理パラメータの対象年月日取得
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AH0050010Struct procExecDateStruct = (AH0050010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	
  // 実際原価の締めが完了している日付では入力できません
	private String ProcExecDateError = "AE00160";
	
	/**
	 * 対象年月日と入力年月日の比較
	 * 実際原価の締めが完了している日付での実績の登録を不可とする
	 * 実際原価の締めが完了している日付けの実績情報の修正を不可とする
	 * @param  doType      登録（'1'）また更新（'2'）また削除（'3'）
	 * @param  selOutDate  更新前入力年月日
	 * @param  inputDate 　更新後入力年月日
	 * @return boolean 　  チェック返す値
	 */
	private boolean chkProcExecDate(String doType,String selOutDate,String inputDate) throws BusinessProcessException, FoundationException {
		boolean b = true;
		
		// 実際原価管理パラメータの対象年月日
		BigDecimal ProcExecDate = getProcExecDate();
		if(null == ProcExecDate) return b;
		ProcExecDateError = "AE00160";
		
		// 登録の場合
		if("1".equals(doType)){
			// 画面入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			b = compDecimal(input,ProcExecDate);
			
		}
		// 更新の場合
		if("2".equals(doType)){
			
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 更新後入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			if(b == false){
				// 実際原価の締めが完了している日付けの実績情報は修正できません
				ProcExecDateError = "AE00161";
				return b;
			}
			// 入力の日付の比較
			b = compDecimal(input,ProcExecDate);
			
		}
		// 削除の場合
		if("3".equals(doType)){
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			// 実際原価の締めが完了している日付けの実績情報は修正できません
			ProcExecDateError = "AE00161";
			
		}
		
		return b;
	}
	
	/**
	 * 比較
	 * @param  bd1      入力引数1
	 * @param  bd2 　   入力引数2
	 * @return boolean  チェック返す値
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
		}
	}
	

	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setErrorMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務エラー発生時のパラメータ設定処理を切り出して関数化
	 * @param tableName テーブル名
	 * @param columnName カラム名
	 * @param value 値
	 */
	private void setErrorParameter2(String tableName, String columnName, String value) {
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
    private String create_Lot(AH0050010Struct structCopy) throws FoundationException, SQLException{
   	   // 在庫ロット番号の自動採番を行う。
   	   String result1 = null;
       String itemCdStr = structCopy.getITEM_CD();
       String acptDateStr = structCopy.getINV_DATE();
       structCopy.setPLANT_CD(this.sysPLANT_CD);
       
       if (struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO())){
    	   structCopy.setLOT_DEL_FLG("0");
       	   entity.mupdate_T_LOT_CTRL.update(conn, structCopy); 
       } else {
    	   BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
    	   List resultList = bc.getsetLotNumberingFd(itemCdStr, acptDateStr);
    	   if(bc.getResultStatus().intValue() == 1){
    		   if(resultList != null && resultList.size() > 0){
    			   result1 = (String)resultList.get(0);
      	           struct.setLOT_NO(result1);
       	           structCopy.setLOT_NO(result1);      	        	       	        
       	           entity.mupdate_T_LOT_CTRL.update(conn, structCopy);
    		   }
    	   }else{
               if(resultList != null && resultList.size() > 1){
          	        String result2 = (String)resultList.get(1);
          	        setErrorMessage(result2);
          	        conn.rollback();
          	        return null;
               }
           }     
       }         
       return result1;
   }
    /**
     * 賞味期限自動計算
     * @param workstruct
     * @return
     * @throws FoundationException
     * @throws SQLException
     */
     private String get_Str_BEST_BEFORE_DATE(AH0050010Struct workstruct) throws FoundationException, SQLException{
     	String bestBeforeDate = null;
//     	 業務運用日
   	  List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, workstruct);
   	  if(!temlist.isEmpty()){
   		workstruct.setBUSINESS_OPR_DATE(
   				  ((AH0050010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());
   	  }
   	  
			BizCommon bc = new BizCommon(conn, sysUSER_CD, sp.getProcId(), sysPLANT_CD);
			List resList = new ArrayList();
			Integer retSts;

			String errCode = null;
			
			resList = bc.calcBestBeforeFd(struct.getITEM_CD(), workstruct.getBUSINESS_OPR_DATE());

			if(!resList.isEmpty()) {
				bestBeforeDate = (String) resList.get(0);
				errCode = (String) resList.get(1);
				retSts = bc.getResultStatus();

				if(retSts != null && retSts.intValue() == 1) {
					if(bestBeforeDate.equals("0")) {
						bestBeforeDate = "";
						setWarningMessage("AE22010", struct.getITEM_CD(), struct.getLOT_NO());
					}
					workstruct.setBEST_BEFORE_DATE(bestBeforeDate);
					return bestBeforeDate;
				}
				if(retSts != null && retSts.intValue() == 3) {
					setErrorMessage(errCode);
				}
			}
			return bestBeforeDate;
     }
        //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //---------------------------------------------------------------------
		// ログ出力情報格納用
		List listMessage = new ArrayList();

		// 読込処理成功フラグ初期化
		boolean bSuccess = false;

		// 最新棚卸制御情報読込用
		AH0050010Struct readStructInvCtrl = new AH0050010Struct();
		// 最新期間中棚卸制御情報読込用
		AH0050010Struct readStructInvCtrl4StsTyp1 = new AH0050010Struct();
		// 最新保管区情報読込用
		AH0050010Struct readStructWh = new AH0050010Struct();

		// 検索状態を初期化
		setReadStatus(INITIAL);
		try {
			// エラーフラグ初期化
			boolean bError = false;

			// リストクリア
			list.clear();

			// 一覧実棚数変更フラグリセット
			struct.resetChangeFlag();

			// 処理に関連するパラメータを設定
			struct.setPLANT_CD(getsysPLANT_CD());
			struct.setITEM_CD(struct.getw_ITEM_CD());
			setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());
			struct.setLOT_NO(struct.getLOT_NO_form());
			struct.setLOT_NO_form(struct.getLOT_NO_form());

			// 棚卸制御データの存在チェック
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// 棚卸制御データが存在しない
				bError = true;
			} else {
				// 棚卸期間中データの存在チェック
				readStructInvCtrl4StsTyp1 = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl4StsTyp1 == null) {
					// 棚卸期間中データが存在しない
					bError = true;
				} else {
					// 最新の期間中棚卸日を設定
					struct.setINV_DATE(readStructInvCtrl4StsTyp1.getINV_DATE());
				}
			}

			// 保管区読込＆チェック
			readStructWh = readWH(struct);
			if (readStructWh == null) {
				// 保管区が存在しない
				bError = true;
			} else {
				// 保管区チェック
				if (!checkWH(readStructWh)) {
					// 保管区の工場コードがログインユーザの工場でない
					bError = true;
				}
			}

			// 表示用リスト準備
			List disp_list = new ArrayList(0);

			// エラーがない場合
			if (bError != true) {
                // 表示最大行数制限処理
				ScreenParam sp = new ScreenParam(this.getClass());
		         int maxLine = sp.getMaxLine(conn,_DISPLAY_CD_PARENT);
		         if (maxLine != 0)
						struct.setROW_COUNT(String.valueOf(maxLine));
					else
						struct.setROW_COUNT(null);
				// 「製番在庫指定」のチェック有無による処理
				if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
					// 製番（製番在庫指定フラグがON）
					listMessage.add("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
					listMessage.add("T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD());
					listMessage.add("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD());
					listMessage.add("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
					disp_list = entity.mT_JOB_ODR_CD_INVCnt.read(conn, struct);
					long rowCount = Long.parseLong(((AH0050010Struct) disp_list.get(0)).getl_COUNT());
                    // 表示リストサイズのチェック
					if (rowCount == 0) {
						// レコード件数が０(ゼロ)件の場合
						bError = true;
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();

						// 検索状態を「０件読込」に設定
						setReadStatus(NOT_FOUND);
						if(list != null && list.size() > 0){
							list.clear();
						}
						return;
					}

					// 表示最大行数制限処理
					if (!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
						// 表示一覧件数が最大表示行数以上の場合
						bError = true;

						// 検索状態を「最大行数オーバー」に設定
						setReadStatus(TOO_MANY);
						if(list != null && list.size() > 0){
							list.clear();
						}
						return;
					}
					disp_list = entity.mT_JOB_ODR_CD_INV.read(conn, struct);
				} else {
					// 品目（製番在庫指定フラグがOFF）
					listMessage.add("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
					listMessage.add("T_ITEM_INV.WH_CD:" + struct.getWH_CD());
					listMessage.add("T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD());
					if (struct.getLOT_NO_form() != null
							&& !"".equals(struct.getLOT_NO_form())) {
						disp_list = entity.mselectT_LOT_INVLotNoCnt.read(conn, struct);
						long rowCount = Long.parseLong(((AH0050010Struct) disp_list.get(0)).getl_COUNT());
                        //表示リストサイズのチェック
						if (rowCount == 0) {
							// レコード件数が０(ゼロ)件の場合
							bError = true;
							setErrorMessage("ZZ06001", listMessage);
							listMessage.clear();

							// 検索状態を「０件読込」に設定
							setReadStatus(NOT_FOUND);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}

						// 表示最大行数制限処理
						if (!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
							// 表示一覧件数が最大表示行数以上の場合
							bError = true;

							// 検索状態を「最大行数オーバー」に設定
							setReadStatus(TOO_MANY);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}
						disp_list = entity.mselectT_LOT_INVLotNo.read(conn, struct);

					} else {
						disp_list = entity.mselectActualStockQty2Cnt.read(conn, struct);
						long rowCount = Long.parseLong(((AH0050010Struct) disp_list.get(0)).getl_COUNT());
                        //表示リストサイズのチェック
						if (rowCount == 0) {
							// レコード件数が０(ゼロ)件の場合
							bError = true;
							setErrorMessage("ZZ06001", listMessage);
							listMessage.clear();

							// 検索状態を「０件読込」に設定
							setReadStatus(NOT_FOUND);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}

						// 表示最大行数制限処理
						if (!checkMaxDispLine(_DISPLAY_CD_PARENT, rowCount)) {
							// 表示一覧件数が最大表示行数以上の場合
							bError = true;

							// 検索状態を「最大行数オーバー」に設定
							setReadStatus(TOO_MANY);
							if(list != null && list.size() > 0){
								list.clear();
							}
							return;
						}
						disp_list = entity.mselectActualStockQty2.read(conn, struct);
					}
				}
			}

			// エラーがない場合
			if (!bError) {
				// 表示用リストを更新
				setList(disp_list);

				// 読込処理成功フラグ設定
				bSuccess = true;

				// 検索状態を「読込成功」に設定
				setReadStatus(NORMAL);
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// 最新情報設定
			// 画面表示情報クリア
			struct.setw_INV_status("");
			struct.setSTOCK_SAVE_DATE("");
			struct.setWH_NAME("");

			// 最新棚卸制御情報反映
			if (readStructInvCtrl4StsTyp1 != null) {
				struct.setw_INV_status(readStructInvCtrl4StsTyp1.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl4StsTyp1.getSTOCK_SAVE_DATE());
			} else if (readStructInvCtrl != null) {
				struct.setw_INV_status(readStructInvCtrl.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl.getSTOCK_SAVE_DATE());
			}

			// 最新保管区情報反映
			if (readStructWh != null) {
				struct.setWH_NAME(readStructWh.getWH_NAME());
			}

		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
                //---------------------------------------------------------------------
                // ログ出力情報格納用
                String logMessage = "";
              
                // 親画面のstructを退避
                saveParentStruct();
              
                try {
              
                 // サブ画面表示値設定
                 // 初期化
                 struct.initializeSub1();
              
                 // 親画面の表示値をコピー
                 struct.setINV_DATE(_save_struct.getINV_DATE());
                 struct.setw_INV_status(_save_struct.getw_INV_status());
                 struct.setWH_CD(_save_struct.getWH_CD());
                 struct.setWH_NAME(_save_struct.getWH_NAME());
                 struct.setITEM_CD(_save_struct.getw_ITEM_CD());
                 struct.setJOB_ODR_CD(_save_struct.getJOB_ODR_CD());
                 struct.seth_JOB_ODR_CD_STOCK_flg(_save_struct.geth_JOB_ODR_CD_STOCK_flg());
                 setJOB_ODR_CD_STOCK_flg(_save_struct.geth_JOB_ODR_CD_STOCK_flg());
              
                 // 品目読込（存在しない場合はnull）
                 logMessage = "M_ITEM.ITEM_CD:" +  struct.getITEM_CD();
                 List read_list = new ArrayList(0);
                 read_list = entity.mM_ITEM.read(conn, struct);
                 if(read_list.size() > 0){                
                    AH0050010Struct readStruct = (AH0050010Struct)read_list.get(0);
                    struct.setITEM_NAME(readStruct.getITEM_NAME());
                 }
              
                } catch(SQLException e) {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
                 sysLog.severe(emsg, getsysUSER_CD());
                 setSqlExceptionMsg(e);
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlappend>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //---------------------------------------------------------------------
                
		// ログ出力情報格納用
		String keyMessage = "";
		int length = 0;
		int lengthMod = 0;
		int lengthError = 0;
		String itemCd[] = new String[_MaxCsvTake];
		String whCd[] = new String[_MaxCsvTake];
		String itemCdMod[] = new String[_MaxCsvTake];
		String whCdMod[] = new String[_MaxCsvTake];
		String itemCdError[] = new String[_MaxCsvTake];
		String whCdError[] = new String[_MaxCsvTake];
		String AataulQty[] = new String[_MaxCsvTake];
		List keylistMessage = new ArrayList();
		List listQty = new ArrayList();

		// 更新処理成功フラグ初期化
		boolean bSuccess = false;
		_LOT_CTRL_FLG = null;
		// 処理直前のstruct情報を退避
		AH0050010Struct structCopy = new AH0050010Struct();
		structCopy.copy(struct);

		try {
			// 更新不可データ数カウンタ初期化
			int intNotUpdateCount = 0;

			// DB更新中フラグ初期化
			boolean bDBUpdate = false;

			// エラーフラグ初期化
			boolean bError = false;

			// 生産側の過去の実績入力の制限チェック
			if (getSysParameter() == false) {
				if (!chkProcExecDate("2", struct.getINV_DATE(), struct
						.getINV_DATE())) {
					setErrorMessage2(ProcExecDateError);
					setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD",struct.getPLANT_CD());
					setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC","PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
					return;
				}
			}

			// 棚卸制御データの存在チェック
			AH0050010Struct readStructInvCtrl = new AH0050010Struct();
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// 棚卸制御データが存在しない
				bError = true;
			} else {
				// 棚卸期間中データの存在チェック
				readStructInvCtrl = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl == null) {
					// 棚卸期間中データが存在しない
					bError = true;
				}
			}

			// 保管区読込＆チェック
			AH0050010Struct readStructWh = new AH0050010Struct();
			readStructWh = readWH(struct);
			if (readStructWh == null) {
				// 保管区が存在しない
				bError = true;
			} else {
				// 保管区チェック
				if (checkWH(readStructWh) != true) {
					// 保管区の工場コードがログインユーザの工場でない
					bError = true;
				}
			}

			// エラーがない場合
			if (bError != true) {
				// 一覧に表示されているデータ数分処理を繰り返す
				AH0050010Struct targetStruct = new AH0050010Struct();
				for (int i = 0; i < getListsize(); i++) {
					// データ取得
					targetStruct = (AH0050010Struct) getListvalue(i);
					struct.copy(targetStruct);

					// 更新に必要な共通パラメータ設定
					struct.setINV_DATE(structCopy.getINV_DATE());
					struct.setPLANT_CD(structCopy.getPLANT_CD());
					struct.setWH_CD(structCopy.getWH_CD());
					struct.setLOT_NO_form(structCopy.getLOT_NO_form());
					// 製番コードをSQLの処理対象であるメンバ変数(JOB_ODR_CD)に入れなおす
					struct.setJOB_ODR_CD(struct.getw_JOB_ODR_CD());

					// ログ情報キーの設定
					if ("1".equals(getJOB_ODR_CD_STOCK_flg()) == true) {
						// 製番（製番在庫指定フラグがON）
						keyMessage = "T_JOB_ODR_CD_INV.INV_DATE:"
								+ struct.getINV_DATE()
								+ ", T_JOB_ODR_CD_INV.WH_CD:"
								+ struct.getWH_CD()
								+ ", T_JOB_ODR_CD_INV.ITEM_CD:"
								+ struct.getITEM_CD()
								+ ", T_JOB_ODR_CD_INV.JOB_ODR_CD:"
								+ struct.getJOB_ODR_CD()
								+ ", T_JOB_ODR_CD_INV.PLANT_CD:"
								+ struct.getPLANT_CD()
								+ ", T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:"
								+ struct.getACTUAL_STOCK_QTY();
						keylistMessage.clear();
						keylistMessage.add("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
						keylistMessage.add("T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD());
						keylistMessage.add("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD());
						keylistMessage.add("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
						keylistMessage.add("T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
					} else {
						// 品目（製番在庫指定フラグがOFF）
						keyMessage = "T_ITEM_INV.INV_DATE:"
								+ struct.getINV_DATE() + ", T_ITEM_INV.WH_CD:"
								+ struct.getWH_CD() + ", T_ITEM_INV.ITEM_CD:"
								+ struct.getITEM_CD() + ", T_ITEM_INV.PLANT_CD:"
								+ struct.getPLANT_CD() + ", T_ITEM_INV.ACTUAL_STOCK_QTY:"
								+ struct.getACTUAL_STOCK_QTY();
						keylistMessage.clear();
						keylistMessage.add("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
						keylistMessage.add("T_ITEM_INV.WH_CD:" + struct.getWH_CD());
						keylistMessage.add("T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD());
						keylistMessage.add("T_ITEM_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
					}

					// エラーフラグ初期化
					bError = false;

					try {
						// トランザクション開始
						conn.beginTransWeb();

						// DB更新中フラグON
						bDBUpdate = true;

						// データ存在チェック
						List read_list = new ArrayList(0);
						if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
							// 製番（製番在庫指定フラグがON）
							setSyslogConfig(keyMessage);
							read_list = entity.mT_JOB_ODR_CD_INV4Update.read(conn, struct);									
						} else {
							// 品目（製番在庫指定フラグがOFF）
							setSyslogConfig(keyMessage);
							List listItem = entity.mM_ITEM.read(conn, struct);
							_LOT_CTRL_FLG = ((AH0050010Struct) listItem.get(0)).getLOT_CTRL_FLG();
							if (_LOT_CTRL_FLG.equals("1")) {
								if (struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
									// ロット別品目棚卸更新数
									read_list = entity.mT_LOT_INV4Update.read(conn, struct);
								} else {
									// 保管区別品目棚卸更新数
									read_list = entity.mT_ITEM_INV4Update.read(conn, struct);
								}
							} else {
								read_list = entity.mT_ITEM_INV4Update.read(conn, struct);
							}
						}
						if (read_list.size() <= 0) {
							// 更新対象データが存在しなかった場合
							setErrorMessage("ZZ01101", keylistMessage);

							// 更新対象データが存在しない
							bError = true;
						} else {
							// レコードが更新されていないかチェック
							AH0050010Struct newStruct = (AH0050010Struct) read_list.get(0);

							if (lengthMod == 0) {
								if (!newStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
									setErrorMessage("ZZ01105", keylistMessage);
									itemCdError[lengthError] = struct.getITEM_CD();
									whCdError[lengthError] = struct.getWH_CD();
									lengthError = lengthError + 1;
									// レコードが更新されている
									bError = true;
								}
								itemCdMod[lengthMod] = struct.getITEM_CD();
								whCdMod[lengthMod] = struct.getWH_CD();
								lengthMod = lengthMod + 1;
							} else {
								int flg = 0;
								for (int j = 0; j < lengthMod; j++) {
									if (struct.getITEM_CD().equals(itemCdMod[j])&& struct.getWH_CD().equals(whCdMod[j])) {
										flg = 1;
										break;
									}
								}

								if (flg != 1) {
									if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
										if (!newStruct.getMODIFY_COUNT_1().equals(struct.getMODIFY_COUNT_1())) {
											setErrorMessage("ZZ01105", keylistMessage);
											itemCdError[lengthError] = struct.getITEM_CD();
											whCdError[lengthError] = struct.getWH_CD();
											lengthError = lengthError + 1;
											// レコードが更新されている
											bError = true;
										}
									} else {
										if (!newStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
											setErrorMessage("ZZ01105",keylistMessage);
											itemCdError[lengthError] = struct.getITEM_CD();
											whCdError[lengthError] = struct.getWH_CD();
											lengthError = lengthError + 1;
											// レコードが更新されている
											bError = true;
										}
									}

									itemCdMod[lengthMod] = struct.getITEM_CD();
									whCdMod[lengthMod] = struct.getWH_CD();
									lengthMod = lengthMod + 1;
								}
							}
							if (bError != true) {
								if (!newStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
									// レコードが更新されている場合
									if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
										// 製番（製番在庫指定フラグがON）
										setErrorMessage("ZZ01105",keylistMessage);												
										// レコードが更新されている
										bError = true;
									} else {
										// 品目（製番在庫指定フラグがOFF）
										if ("1".equals(_LOT_CTRL_FLG)) {
											if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
												setErrorMessage("ZZ01105",keylistMessage);
												itemCdError[lengthError] = struct.getITEM_CD();
												whCdError[lengthError] = struct.getWH_CD();
												lengthError = lengthError + 1;
												// レコードが更新されている
												bError = true;
											}
										} else {
											setErrorMessage("ZZ01105",keylistMessage);
											// レコードが更新されている
											bError = true;
										}
									}
								}
							}
						}

						// エラーがない場合
						if (bError != true) {
							// 更新実行
							// 「製番在庫指定」のチェック有無による処理
							if ("1".equals(getJOB_ODR_CD_STOCK_flg()) == true) {
								// 製番（製番在庫指定フラグがON）
								entity.mT_JOB_ODR_CD_INV.update(conn, struct);
							} else {
								int flgError = 0;
								for (int errorCount = 0; errorCount < lengthError; errorCount++) {
									if (struct.getITEM_CD().equals(itemCdError[errorCount])&& struct.getWH_CD().equals(whCdError[errorCount])) {
										flgError = 1;
										break;
									}
								}
								if (flgError != 1) {
									listQty = entity.mselectActualStockQty.read(conn, struct);
									int floorInt = 4;
									if ("1".equals(struct.getUNIT_QTY_TYP())) {
										floorInt = 0;
									}
									if ("1".equals(_LOT_CTRL_FLG)) {
										List ACTUALSTOCKQTYList = entity.mselectT_LOT_INVLotNo.read(conn, struct);
										String ACTUALSTOCKQTY = Calculate.floor(((AH0050010Struct) ACTUALSTOCKQTYList.get(0)).getACTUAL_STOCK_QTY(),floorInt);
										if (struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
											struct.setACTUAL_STOCK_QTY_1(struct.getACTUAL_STOCK_QTY());
											entity.mupdateT_LOT_INV.update(conn, struct);
										}
										// 品目（製番在庫指定フラグがOFF）
										if (length == 0) {
											if (struct.getLOT_NO() != null && !"".equals(struct.getLOT_NO())) {
												AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);
												if (struct.getLOT_NO_form() != null && !"".equals(struct.getLOT_NO_form())) {
													String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getTItemInvACTUALSTOCKQTY(),
																	floorInt);
													String sract = Calculate.subtract(ACTUALSTOCKQTY,Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt));
													sumQty = Calculate.subtract(sumQty,sract);
													struct.setACTUAL_STOCK_QTY(sumQty);
												} else {
													if (!AataulQty[length].equals("0")) {
														struct.setACTUAL_STOCK_QTY(Calculate.floor(Calculate.add(AataulQty[length],struct.getACTUAL_STOCK_QTY()),floorInt));
													}
												}
											} else {
												AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);
												String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);
												sumQty = Calculate.add(Calculate.subtract(sumQty,AataulQty[length]),Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt));
												struct.setACTUAL_STOCK_QTY(sumQty);																	
											}
											itemCd[length] = struct.getITEM_CD();												
											whCd[length] = struct.getWH_CD();
											length = length + 1;
											entity.mT_ITEM_INV.update(conn,struct);												
										} else {
											int flg = 0;
											for (int j = 0; j < length; j++) {
												if (struct.getITEM_CD().equals(itemCd[j]) && struct.getWH_CD().equals(whCd[j])) {																
													if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
														String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getTItemInvACTUALSTOCKQTY(),floorInt);			
														sumQty = Calculate.floor(Calculate.add(sumQty,struct.getACTUAL_STOCK_QTY()),floorInt);
														struct.setACTUAL_STOCK_QTY(sumQty);			
													} else {
														String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getTItemInvACTUALSTOCKQTY(),floorInt);			
														String sract = AataulQty[j];
														sract = Calculate.floor(Calculate.subtract(sract,struct.getACTUAL_STOCK_QTY()),floorInt);			
														sumQty = Calculate.subtract(sumQty,sract);
														struct.setACTUAL_STOCK_QTY(sumQty);					
													}
													entity.mT_ITEM_INV.update(conn, struct);															
													flg = 1;
													break;
												}
											}
											if (flg != 1) {
												if (struct.getLOT_NO() != null && !struct.getLOT_NO().equals("")) {
													AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);					
													if (struct.getLOT_NO_form() != null && !struct.getLOT_NO_form().equals("")) {
														String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);				
														String sract = Calculate.subtract(ACTUALSTOCKQTY,Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt));							
														sumQty = Calculate.subtract(sumQty,sract);
														struct.setACTUAL_STOCK_QTY(sumQty);					
													} else {
														if (!AataulQty[length].equals("0")) {
															struct.setACTUAL_STOCK_QTY(Calculate.floor(Calculate.add(AataulQty[length],struct.getACTUAL_STOCK_QTY()),floorInt));
														}
													}
												} else {
													AataulQty[length] = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);					
													String sumQty = Calculate.floor(((AH0050010Struct) listQty.get(0)).getACTUAL_STOCK_QTY(),floorInt);				
													sumQty = Calculate.subtract(sumQty,Calculate.subtract(AataulQty[length],Calculate.floor(struct.getACTUAL_STOCK_QTY(),floorInt)));												
													struct.setACTUAL_STOCK_QTY(sumQty);
												}
												itemCd[length] = struct.getITEM_CD();
												whCd[length] = struct.getWH_CD();
												length = length + 1;
												entity.mT_ITEM_INV.update(conn,struct);
											}
										}
									} else {
										entity.mT_ITEM_INV.update(conn, struct);
									}
								}
							}
							// コミット
							conn.commit();

							// DB更新中フラグOFF
							bDBUpdate = false;
						}

					} catch (SQLException e) {
						setErrorMessage("ZZ01106", keylistMessage);

						// エラーフラグ設定
						bError = true;

					} finally {
						// DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
						if (bDBUpdate == true) {
							// ロールバック
							conn.rollback();
							setSyslogConfig("Control：controlupdate - rollback!! ");
						}

						// エラーがある場合
						if (bError == true) {
							// 更新不可データ数カウント
							intNotUpdateCount++;
						}
					}

				} // for()

				// 更新できなかったデータが存在した場合
				if (intNotUpdateCount > 0) {
					setInfoMessage("AH60001", "");
				}

				// 親画面情報（キー情報）復帰
				struct.copy(structCopy);

				// 再読込処理
				controlselect();

				// 更新処理成功フラグ設定
				bSuccess = true;

			} // if(bError != true)

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// 更新処理で失敗した場合
			if (!bSuccess) {
				// 親画面情報（キー情報）復帰
				struct.copy(structCopy);
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                try {
                 // structクリア
                 struct.clear();
              
                 // 初期値設定
                 AH0050010Struct readStruct = new AH0050010Struct();
                 readStruct = readT_INV_CTRL_INV_STS_TYP1();
                 if(readStruct != null)
                 {
                  // 読込情報設定
                  struct.copy(readStruct);
                 }
                 struct.initializeParent();
              
                 // 表示リストをクリア
                 list.clear();
              
                 // 検索状態を「初期状態」に設定
                 setReadStatus(INITIAL);
     	        
     	        /** パラメータ「棚卸承認」を取得*/
     	        privateConfig = new PrivateConfig(conn);
     	        aprInvCtrl = privateConfig.getString("APR_INV_CTRL");
     	        // パラメータ「棚卸承認」が取得できなかった場合
     	        if(aprInvCtrl == null || "".equals(aprInvCtrl)){
      				String locale = CoreTools.getLocale(struct.getsUser_ID());
      				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
      	    		ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00070"));
      	    		msgStruct.addError(emsg);
      	    		sysLog.warning(emsg, sysUSER_CD);
     	        	aprInvCtrl = "0";
                     // 検索状態を「失敗」に設定
                     setReadStatus(ERROR);
     	        	return;
     	        }else if("1".equals(aprInvCtrl)){
     				// １の場合
     	        	aprInvCtrl = "1";
     	        }else{
     				// １以外の場合
     	        	aprInvCtrl = "0";
     	        }
             	struct.seth_APR_INV_CTRL(aprInvCtrl);
             	/** パラメータ「Csv取込最大件数」を取得*/
             	_MaxCsvTake = Integer.parseInt(privateConfig.getString("MAX_CSV_TAKE"));
             	if (_MaxCsvTake==0) {
             		String locale = CoreTools.getLocale(struct.getsUser_ID());
      				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
      	    		ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00077"));
      	    		msgStruct.addError(emsg);
      	    		sysLog.warning(emsg, sysUSER_CD);
     	        	_MaxCsvTake = 10000;
                     // 検索状態を「失敗」に設定
                     setReadStatus(ERROR);
     	        	return;
             	}
                 
                 //棚卸承認区分を取得
         		struct.setPLANT_CD(this.getsysPLANT_CD());
                List apprList = entity.mselectApprFlg.read(conn,struct);
                if(apprList.size() > 0){ 
                 	aprFlg = ((AH0050010Struct)apprList.get(0)).geth_APRR_FLG();
                 	struct.seth_APRR_FLG(aprFlg);
                 }
         		if("1".equals(struct.geth_APR_INV_CTRL()) && "2".equals(struct.geth_APRR_FLG())){
         			setErrorMessage("AH00048");
         			return;
         		}
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert_sub1");
			//{{user_implement_dev:<controlinsert_sub1>
                //---------------------------------------------------------------------
                
		// 生産側の過去の実績入力の制限チェック
		if (getSysParameter() == false) {
			if (chkProcExecDate("2", struct.getINV_DATE(), struct.getINV_DATE()) == false) {
				setErrorMessage2(ProcExecDateError);
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD",struct.getPLANT_CD());						
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE",struct.getPROC_EXEC_DATE().toString());						
				return;
			}
		}

		// ログ情報キーの設定
		String keyMessage = "";
		List keylistMessage = new ArrayList();
		if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
			// 製番（製番在庫指定フラグがON）
			keyMessage = "T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE()
					+ ", T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD()
					+ ", T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD()
					+ ", T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
					+ ", T_JOB_ODR_CD_INV.PLANT_CD:" + struct.getPLANT_CD()
					+ ", T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:"
					+ struct.getACTUAL_STOCK_QTY();
			keylistMessage.add("T_JOB_ODR_CD_INV.INV_DATE:" + struct.getINV_DATE());
			keylistMessage.add("T_JOB_ODR_CD_INV.WH_CD:" + struct.getWH_CD());
			keylistMessage.add("T_JOB_ODR_CD_INV.ITEM_CD:" + struct.getITEM_CD());
			keylistMessage.add("T_JOB_ODR_CD_INV.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
			keylistMessage.add("T_JOB_ODR_CD_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
		} else {
			// 品目（製番在庫指定フラグがOFF）
			keyMessage = "T_ITEM_INV.INV_DATE:" + struct.getINV_DATE()
					+ ", T_ITEM_INV.WH_CD:" + struct.getWH_CD()
					+ ", T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD()
					+ ", T_ITEM_INV.PLANT_CD:" + struct.getPLANT_CD()
					+ ", T_ITEM_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY();
			keylistMessage.add("T_ITEM_INV.INV_DATE:" + struct.getINV_DATE());
			keylistMessage.add("T_ITEM_INV.WH_CD:" + struct.getWH_CD());
			keylistMessage.add("T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD());
			keylistMessage.add("T_ITEM_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
		}

		// ログ出力情報格納用
		List listMessage = new ArrayList();

		// 登録処理成功フラグ初期化
		boolean bSuccess = false;

		// 実棚数切捨て実施フラグ初期化
		boolean bResultFloor = false;

		// DB更新中フラグ初期化
		boolean bDBUpdate = false;

		// 処理直前のstruct情報を退避
		AH0050010Struct structCopy = new AH0050010Struct();
		structCopy.copy(struct);

		// 最新棚卸制御情報読込用
		AH0050010Struct readStructInvCtrl = new AH0050010Struct();
		// 最新保管区情報読込用
		AH0050010Struct readStructWh = new AH0050010Struct();
		// 最新品目情報読込用
		AH0050010Struct readStructItem = new AH0050010Struct();
		// 期間中棚卸制御データ存在フラグ初期化
		boolean bIsNotINV_CTRL = false;

		try {
			// エラーフラグ初期化
			boolean bError = false;
			List read_list = null;
			// 実棚数
			_ACTUAL_STOCK_QTY = null;
			String create_Lot = "";
			// 登録に必要な共通パラメータ設定
			struct.setPLANT_CD(getsysPLANT_CD());
			setJOB_ODR_CD_STOCK_flg(struct.geth_JOB_ODR_CD_STOCK_flg());

			// 棚卸制御データの存在チェック
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// 棚卸制御データが存在しない
				bError = true;
			} else {
				// 棚卸期間中データの存在チェック
				readStructInvCtrl = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl == null) {
					// 棚卸期間中データが存在しない
					bError = true;

					// 期間中棚卸制御データ存在なしフラグON
					bIsNotINV_CTRL = true;
				}
			}

			// 保管区読込＆チェック
			readStructWh = readWH(struct);
			if (readStructWh == null) {
				// 保管区が存在しない
				bError = true;
			} else {
				// 保管区チェック
				if (checkWH(readStructWh) != true) {
					// 保管区の工場コードがログインユーザの工場でない
					bError = true;
				}
			}

			// 品目チェック
			readStructItem = readITEM(struct);
			if (readStructItem == null) {
				// 品目が存在しない
				bError = true;
			} else {
				_LOT_CTRL_FLG = readStructItem.getLOT_CTRL_FLG();
				if(!"1".equals(getJOB_ODR_CD_STOCK_flg())){
					if("1".equals(_LOT_CTRL_FLG)){
						if(struct.getLOT_NO() == null || "".equals(struct.getLOT_NO())){
							 if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            						 && "0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                				 bError = true;                	              
                                 listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
                                 // 在庫ロット番号が入力されていません。
                                 setErrorMessage("AH60007", listMessage);
                                 listMessage.clear();
            				 }
						}
					} else {
	           			 if(struct.getLOT_NO()!=null && !"".equals(struct.getLOT_NO())){
	        				 bError = true;                	              
	                         listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
	                         // 指定した品目は非ロット管理品目です。
	                         setErrorMessage("AH60006", listMessage);
	                         listMessage.clear();
	        			 }
					}
				}
				// 品目が擬似品目かどうかのチェック
				if ("8".equals(readStructItem.getMRP_ODR_TYP())) {
					// 指定された品目が擬似品目
					bError = true;

					listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					setErrorMessage("AH00028", listMessage);
					listMessage.clear();
				}
				// 品目の棚卸区分が9（棚卸しない）かどうかのチェック
				if ("9".equals(readStructItem.getABC_TYP()) == true) {
					// 指定された品目の棚卸区分が9棚卸しない）
					bError = true;

					listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					setErrorMessage("AH00016", listMessage);
					listMessage.clear();
				}

				// 製番（製番在庫指定フラグがON）
				if ("1".equals(getJOB_ODR_CD_STOCK_flg()) == true) {
					// MRP系品目かどうかのチェック
					if (Calculate.compare(readStructItem.getMRP_ODR_TYP(), "3") == 1) {
						// 指定された品目がMRP系品目
						bError = true;

						listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("M_ITEM.MRP_ODR_TYP:" + readStructItem.getMRP_ODR_TYP());
						setErrorMessage("AH00027", listMessage);
						listMessage.clear();

					}

					// 所要量に存在するかどうかのチェック
					read_list = entity.mT_OD.read(conn, struct);
					if (read_list.size() <= 0) {
						listMessage.add("T_OD.JOB_ODR_CD:"+ struct.getJOB_ODR_CD());
						listMessage.add("T_OD.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_OD.PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AH00039", listMessage);
						listMessage.clear();

						// 所要量に存在しない
						bError = true;
					}
				}

				// 品目情報設定
				struct.setITEM_NAME(readStructItem.getITEM_NAME());
				struct.setMRP_ODR_TYP(readStructItem.getMRP_ODR_TYP());
				struct.setUNIT_QTY_TYP(readStructItem.getUNIT_QTY_TYP());
				struct.setSTOCK_UNIT(readStructItem.getSTOCK_UNIT());
			}

			// エラーがない場合
			if (bError != true) {
				// データ存在チェック
				if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
					// 製番（製番在庫指定フラグがON）
					read_list = entity.mT_JOB_ODR_CD_INV.read(conn, struct);
				} else {
					// 品目（製番在庫指定フラグがOFF）
					// 「品目番号」 の[品目]．ロット管理フラグ＝１
              	  	if("1".equals(_LOT_CTRL_FLG)){
              		  read_list = entity.mselect_T_LOT_NO.read(conn, struct);
            		  if(read_list.size() <= 0){
            			  List ACTUAL_STOCK_QTYlist = entity.mT_ITEM_INV.read(conn, struct);
            			  if(ACTUAL_STOCK_QTYlist.size() > 0){
            				  _ACTUAL_STOCK_QTY = ((AH0050010Struct)ACTUAL_STOCK_QTYlist.get(0)).getACTUAL_STOCK_QTY();
            			  }
            		  }
              	  	} else {
              	  		read_list = entity.mT_ITEM_INV.read(conn, struct);
              	  	} 
					
				}
				if (read_list.size() > 0) {
					// 既にデータが存在していた場合
					bError = true;

					if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
						// 製番（製番在庫指定フラグがON）
						setErrorMessage("ZZ01102", keylistMessage);
					} else {
	            	    if("1".equals(_LOT_CTRL_FLG)){
	            		   keylistMessage.clear();
	                       keyMessage = "T_LOT_INV.INV_DATE:" +  struct.getINV_DATE()
	                       + ", T_LOT_INV.WH_CD:" +  struct.getWH_CD()
	                       + ", T_LOT_INV.ITEM_CD:" +  struct.getITEM_CD()
	                       + ", T_LOT_INV.PLANT_CD:" +  struct.getPLANT_CD()
	                       + ", T_LOT_INV.ACTUAL_STOCK_QTY:" +  struct.getACTUAL_STOCK_QTY();
	                       keylistMessage.add("T_LOT_INV.INV_DATE:" + struct.getINV_DATE());
	                       keylistMessage.add("T_LOT_INV.WH_CD:" + struct.getWH_CD());
	                       keylistMessage.add("T_LOT_INV.ITEM_CD:" + struct.getITEM_CD());
	                       keylistMessage.add("T_LOT_INV.ACTUAL_STOCK_QTY:" + struct.getACTUAL_STOCK_QTY());
	                     
	                       // 品目（製番在庫指定フラグがOFF）
	                       setErrorMessage("ZZ01102", keylistMessage);
	            	    }else{
	                        // 品目（製番在庫指定フラグがOFF）
	                        setErrorMessage("ZZ01102", keylistMessage);
	            	    }
					}
				} else {
                  // 製番在庫指定フラグがOFF
              	  if(!"1".equals(getJOB_ODR_CD_STOCK_flg())){
              		  if("1".equals(_LOT_CTRL_FLG)){
              			  if(structCopy.getLOT_NO()!=null && !"".equals(structCopy.getLOT_NO())){            				  
              				  List listCtrl = entity.mselect_T_LOT_CTRL_2.read(conn, struct);
                				 if(listCtrl!=null && listCtrl.size() >0){
             						if(Calculate.compare(((AH0050010Struct)listCtrl.get(0)).getLOT_DEL_FLG(), "1")==0){
                        				 if(readStructItem.getLOT_NUMBERING_TYP()!=null 
                     						 && !"0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                         					 bError = true;   
                         					 create_Lot = "";
                         					 // ロット管理に登録されていません（自動採番ロット管理品目です、新規ロット登録する場合、在庫ロット番号を空白にしてください。
                         					 setErrorMessage("AE00165");
                        				 }
             						}

	             					  // 業務運用日
	                            	List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
	                            	if(!temlist.isEmpty()){
	                            		structCopy.setBUSINESS_OPR_DATE(((AH0050010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());
	                            	}
                	                // [ロット管理]．“賞味期限”＜業務運用日　場合
            						String str_before_date = ((AH0050010Struct)listCtrl.get(0)).getBEST_BEFORE_DATE();
        							if(str_before_date!=null){
        								if(str_before_date.compareTo(structCopy.getBUSINESS_OPR_DATE())<0){
            								//<警告> AH60011 【入力された在庫ロット番号は賞味期限切れとなっています。】
            								setWarnMessage("AH60015","ITEM_CD :"+structCopy.getITEM_CD());
            								bError = true; 
            							}
        							}
        						    if(readStructItem.getLOT_NUMBERING_TYP()!=null && "0".equals(readStructItem.getLOT_NUMBERING_TYP())){
        						    	create_Lot = "update";
        						    }
                				 } else {
                					if(readStructItem.getLOT_NUMBERING_TYP()!=null && !"0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                    					bError = true;   
                    					create_Lot = "";
                                        //  ロット管理に登録されていません（自動採番ロット管理品目です、新規ロット登録する場合、在庫ロット番号を空白にしてください。
                    					setErrorMessage("AE00165");
                       				 } else if(readStructItem.getLOT_NUMBERING_TYP()!=null && "0".equals(readStructItem.getLOT_NUMBERING_TYP())){
                       					create_Lot = "create";
                       				 }
                				 }
              			  }     
          				 
               			 if(struct.getACTUAL_STOCK_QTY().equals("0.0")){              				 
               				 bError = true;   
               				 // ロット管理品目の場合、実棚数には0以上の数値を入力して下さい。
                             listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
                             setErrorMessage("AH60010", listMessage);
                             listMessage.clear();
               			 }
              		  }
              	  }               
				}
			}

			if (bError != true) {
				// 棚卸制御存在、品目存在、保管区が存在する場合のチェック

				// 循環棚卸がONの場合のチェック
				if ("1".equals(readStructInvCtrl.getCYCLE_INV_FLG())) {
					// 品目別棚卸サイクルから品目、工場が等しいデータを検索
					read_list = entity.mT_INV_CYCLE.read(conn, struct);
					if (read_list.size() <= 0) {
						// 品目別棚卸サイクルに品目、工場が等しいデータが存在しない
						bError = true;

						listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
						// 今回棚卸対象データではありません。
						setErrorMessage("AH00040", listMessage);
						listMessage.clear();
					} else {
						// 品目別棚卸サイクルから読み込んだデータの取得
						AH0050010Struct readStructInvCycle = (AH0050010Struct) read_list.get(0);

						// 棚卸サイクルの実施フラグをリストデータ化
						List listInvFlg = new ArrayList(0);
						listInvFlg.add(readStructInvCycle.getINV_FLG_JAN());// １月
						listInvFlg.add(readStructInvCycle.getINV_FLG_FEB());// ２月
						listInvFlg.add(readStructInvCycle.getINV_FLG_MAR());// ３月
						listInvFlg.add(readStructInvCycle.getINV_FLG_APR());// ４月
						listInvFlg.add(readStructInvCycle.getINV_FLG_MAY());// ５月
						listInvFlg.add(readStructInvCycle.getINV_FLG_JUN());// ６月
						listInvFlg.add(readStructInvCycle.getINV_FLG_JUL());// ７月
						listInvFlg.add(readStructInvCycle.getINV_FLG_AUG());// ８月
						listInvFlg.add(readStructInvCycle.getINV_FLG_SEP());// ９月
						listInvFlg.add(readStructInvCycle.getINV_FLG_OCT());// １０月
						listInvFlg.add(readStructInvCycle.getINV_FLG_NOV());// １１月
						listInvFlg.add(readStructInvCycle.getINV_FLG_DEC());// １２月

						// 棚卸日付の月を取得
						DateConverter dateConv = new DateConverter();
						Date dateWork = dateConv.str2date(struct.getINV_DATE());
						Calendar cal = new GregorianCalendar();
						cal.setTime(dateWork);
						int intMonth = cal.get(Calendar.MONTH);

						// 棚卸日月の棚卸実施フラグのチェック
						if (!"1".equals((String) listInvFlg.get(intMonth))) {
							// 棚卸日の月の棚卸実施フラグがONでない
							bError = true;

							listMessage.add("T_INV_CYCLE.ITEM_CD:" + struct.getITEM_CD());
							listMessage.add("T_INV_CYCLE.PLANT_CD:" + struct.getPLANT_CD());
							// 今回棚卸対象データではありません。
							setErrorMessage("AH00040", listMessage);
							listMessage.clear();
						}
					}
				}

				// 臨時棚卸がONの場合のチェック
				if ("1".equals(readStructInvCtrl.getTEMP_INV_FLG())) {
					// 棚卸条件品目指定から棚卸日、工場、品目が等しいデータを検索
					List listInvTargetItem = entity.mT_INV_TARGET_ITEM.read(conn, struct);
					// 棚卸条件保管区指定から棚卸日、工場、品目が等しいデータを検索
					List listInvTargetWh = entity.mT_INV_TARGET_WH.read(conn, struct);
					if ((listInvTargetItem.size() <= 0) && (listInvTargetWh.size() <= 0)) {
						// 棚卸条件品目指定に棚卸日、工場、品目が等しいデータが存在しない
						// さらに、棚卸条件保管区指定に棚卸日、工場、保管区が等しいデータが存在しない
						bError = true;

						listMessage.add("T_INV_TARGET_ITEM.ITEM_CD:" + struct.getITEM_CD());
						listMessage.add("T_INV_TARGET_WH.WH_CD:" + struct.getWH_CD());
						listMessage.add("INV_DATE:" + struct.getINV_DATE());
						listMessage.add("PLANT_CD:" + struct.getPLANT_CD());
						setErrorMessage("AH00040", listMessage);
						listMessage.clear();
					}
				}

			}

			// 実棚数チェック
			if ("1".equals(struct.getUNIT_QTY_TYP())&& Calculate.isNumeric(struct.getACTUAL_STOCK_QTY())) {
				bError = true;
				listMessage.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
				setErrorMessage("AH00029", listMessage);
				listMessage.clear();
			}

			// エラーがない場合
			if (bError != true) {
				// トランザクション開始
				conn.beginTransWeb();

				// DB更新中フラグON
				bDBUpdate = true;

				// 登録実行
				// 「製番在庫指定」のチェック有無による処理
				if ("1".equals(getJOB_ODR_CD_STOCK_flg())) {
					// 製番（製番在庫指定フラグがON）
					entity.mT_JOB_ODR_CD_INV.create(conn, struct);
				} else {
					// 品目（製番在庫指定フラグがOFF）
	                if("1".equals(_LOT_CTRL_FLG)){            	
	                	if(readStructItem.getLOT_NUMBERING_TYP()!=null 
            					  && !"0".equals(readStructItem.getLOT_NUMBERING_TYP())){
            				  String lot = create_Lot(structCopy);
            				  if(lot==null){
            					  return;
            				  }
            			 }else{
            				  if(create_Lot.equals("create")){
            					  // [ロット管理]の追加を行う
                      			  struct.setBEST_BEFORE_DATE(get_Str_BEST_BEFORE_DATE(struct));
                      			  entity.mselect_T_LOT_CTRL.create(conn, struct);
                      			  keyMessage = "T_LOT_CTRL.ITEM_CD:" + struct.getITEM_CD()
                      			  			+ "T_LOT_CTRL.LOT_NO:" + struct.getLOT_NO();
                      			  //在庫ロット番号が存在しなかったので、新規採番しました
                      			  setInfoMessage("AH00049","");
                      			  setInfoMessage("ZZ01006",keyMessage);
            				  }else 
            					  // [ロット管理]の更新を行う
            					  if(create_Lot.equals("update")){
                      				  entity.mupdate_T_LOT_CTRL.update(conn, struct);
            					  }
            			 }
	                	
                		 struct.setACTUAL_STOCK_QTY_1(Calculate.floor(struct.getACTUAL_STOCK_QTY(), 0));

						// ロット別品目棚卸の追加を行う
						entity.mcreate_T_LOT_INV.create(conn, struct);
	                		 
                     	 if(_ACTUAL_STOCK_QTY != null){
                     		 // 保管区別品目棚卸の更新を行う
                     		 String actualStockQty = Calculate.add(struct.getACTUAL_STOCK_QTY(),_ACTUAL_STOCK_QTY);
                     		 struct.setACTUAL_STOCK_QTY(actualStockQty);
                     		 entity.mT_ITEM_INV.update(conn, struct);
                     	 }else{
                     		// 保管区別品目棚卸の追加を行う
                     		entity.mT_ITEM_INV.create(conn, struct);
                     	 }
	                }else{
	                	// 保管区別品目棚卸の追加を行う
	                	entity.mT_ITEM_INV.create(conn, struct);
	                }      
	                  
				}

				// コミット
				conn.commit();

				// DB更新中フラグOFF
				bDBUpdate = false;

				// 親画面のstructを復帰
				loadParentStruct();

				// 登録処理成功フラグ設定
				bSuccess = true;
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			String LotNo = struct.getLOT_NO();
			// DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
			if (bDBUpdate == true) {
				// ロールバック
				conn.rollback();
				setSyslogConfig("Control：controlinsert_sub1 - rollback!! ");
			}

			if (bSuccess == true) {
                // [ロット管理]．“賞味期限”＜業務運用日　場合
                try {
                  // 業務運用日
              	  List temlist = entity.mSelect_SYS_DATE_CTRL.read(conn, struct);
              	  if(!temlist.isEmpty()){
              		  structCopy.setBUSINESS_OPR_DATE(((AH0050010Struct)temlist.get(0)).getBUSINESS_OPR_DATE());             				  
              	  }
				  List worklist = entity.mselect_T_LOT_CTRL_2.read(conn, structCopy);
					if(!worklist.isEmpty()){
						String str_before_date = ((AH0050010Struct)worklist.get(0)).getBEST_BEFORE_DATE();
						if(str_before_date!=null){
							if(str_before_date.compareTo(structCopy.getBUSINESS_OPR_DATE())<0){
								//<警告> AH60011 【入力された在庫ロット番号は賞味期限切れとなっています。】
								setWarnMessage("AH60015","ITEM_CD :"+structCopy.getITEM_CD());
							}
						}
					}
				} catch (SQLException e) {
					setSqlExceptionMsg(e);
				}
			} else {
				// 画面表示情報設定

				// 画面表示情報クリア
				struct.setw_INV_status("");
				struct.setSTOCK_SAVE_DATE("");
				struct.setWH_NAME("");
				struct.setITEM_NAME("");
				struct.setLOT_NO("");

				// 期間中棚卸制御データが存在しない場合、棚卸日クリア
				if (bIsNotINV_CTRL == true) {
					struct.setINV_DATE("");
				}
				// 最新棚卸制御情報反映
				if (readStructInvCtrl != null) {
					struct.setINV_DATE(readStructInvCtrl.getINV_DATE());
					struct.setw_INV_status(readStructInvCtrl.getw_INV_status());
					struct.setSTOCK_SAVE_DATE(readStructInvCtrl.getSTOCK_SAVE_DATE());							
				}
				// 最新保管区情報反映
				if (readStructWh != null) {
					struct.setWH_NAME(readStructWh.getWH_NAME());
				}
				// 最新品目情報反映
				if (readStructItem != null) {
					struct.setITEM_NAME(readStructItem.getITEM_NAME());
				}
                if(LotNo!=null){
              	  struct.setLOT_NO(LotNo);
                }
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert_sub1>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlinsert_sub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
                // 子画面に遷移する前の親画面のstructを復帰
                loadParentStruct();
              
                // 再読込処理
                controlselect();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
                //---------------------------------------------------------------------
		// 最新棚卸制御情報読込用
		AH0050010Struct readStructInvCtrl = new AH0050010Struct();
		// 最新期間中棚卸制御情報読込用
		AH0050010Struct readStructInvCtrl4StsTyp1 = new AH0050010Struct();

		try {
			// エラーフラグ初期化
			boolean bError = false;

			// リストクリア
			list.clear();

			// 処理に関連するパラメータを設定
			struct.setPLANT_CD(getsysPLANT_CD());

			// 棚卸制御データの存在チェック
			readStructInvCtrl = readT_INV_CTRL(struct);
			if (readStructInvCtrl == null) {
				// 棚卸制御データが存在しない
				bError = true;
			} else {
				// 棚卸期間中データの存在チェック
				readStructInvCtrl4StsTyp1 = readT_INV_CTRL_INV_STS_TYP1();
				if (readStructInvCtrl4StsTyp1 == null) {
					// 棚卸期間中データが存在しない
					bError = true;
				} else {
					// 最新の期間中棚卸日を設定
					struct.setINV_DATE(readStructInvCtrl4StsTyp1.getINV_DATE());
				}
			}

			// エラーがない場合
			if (bError != true) {
				// 親画面のstructを退避
				saveParentStruct();

				// サブ2画面初期化
				struct.clear();

				// 親画面の表示値をコピー
				struct.setINV_DATE(_save_struct.getINV_DATE());

				// サブ2画面エラーリストクリア
				csvResultListClear();

				// サブ画面初期状態情報をコピー
				_copy_sub_struct.copy(struct);
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// 画面表示情報クリア
			struct.setw_INV_status("");
			struct.setSTOCK_SAVE_DATE("");

			// 最新棚卸制御情報反映
			if (readStructInvCtrl4StsTyp1 != null) {
				struct.setw_INV_status(readStructInvCtrl4StsTyp1.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl4StsTyp1.getSTOCK_SAVE_DATE());
				struct.setREGULAR_INV_FLG(readStructInvCtrl4StsTyp1.getREGULAR_INV_FLG());
				struct.setCYCLE_INV_FLG(readStructInvCtrl4StsTyp1.getCYCLE_INV_FLG());
				struct.setTEMP_INV_FLG(readStructInvCtrl4StsTyp1.getTEMP_INV_FLG());
				struct.setINV_STS_TYP(readStructInvCtrl4StsTyp1.getINV_STS_TYP());
			} else if (readStructInvCtrl != null) {
				struct.setw_INV_status(readStructInvCtrl.getw_INV_status());
				struct.setSTOCK_SAVE_DATE(readStructInvCtrl.getSTOCK_SAVE_DATE());
				struct.setREGULAR_INV_FLG(readStructInvCtrl.getREGULAR_INV_FLG());
				struct.setCYCLE_INV_FLG(readStructInvCtrl.getCYCLE_INV_FLG());
				struct.setTEMP_INV_FLG(readStructInvCtrl.getTEMP_INV_FLG());
				struct.setINV_STS_TYP(readStructInvCtrl.getINV_STS_TYP());
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");
			//{{user_implement_dev:<controlreturn_sub2>
                //---------------------------------------------------------------------
                // 子画面に遷移する前の親画面のstructを復帰
                loadParentStruct();
              
                // クリア処理
                controlclear();
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub2>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");

		return;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
                //---------------------------------------------------------------------
        // 画面上の特定の情報しかサブミットできないため、ここで画面初期表示時の値を再設定
        struct.setINV_DATE(_copy_sub_struct.getINV_DATE());
              
		// 生産側の過去の実績入力の制限チェック
		if(getSysParameter() == false){
			if(chkProcExecDate("2",struct.getINV_DATE(),struct.getINV_DATE()) == false){
				setErrorMessage2(ProcExecDateError);
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
				setErrorParameter2("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
				return;
			}
		}
								
        // エラーフラグ初期化
	    boolean bError = false;	    
        _LOT_CTRL_FLG = null;
        _ACTUAL_STOCK_QTY = null;
	    // 画面表示用エラーリストクリア
	    csvResultListClear();
	  
	    // ＣＳＶデータ取得
	    List listCsv = readCsvData();
	    if(listCsv == null)
	    {
	     bError = true;
	    }
	    if(listCsv.size()>_MaxCsvTake){
	     this.setErrorMessage("AH00061");
	     bError = true;
	     return;
	    }
	  
	    // ＣＳＶデータ取得成功
	    if(bError != true)
	    {
	     // ＣＳＶデータ内容チェック
	     if(checkCsvData(listCsv) != true)
	     {
	      bError = true;
	     }
	    }
	  
	    // ＣＳＶデータ内容に異常なし
	    if(bError != true)
	    {
	     // ＣＳＶデータ反映
	     csvData2Db(listCsv);
	    }
	  
	    if(getMessage().sizeError() <= 0)
	    {
	     // 処理成功の場合は前画面へ戻るため、戻る処理をおこなう
	     controlreturn_sub2();
	    }
	    else {
	     // リストにエラー内容セット
	     setList(_listResultMessageCsv);
	    }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
		try {
			// ロット管理導入済チェック
			if (LotCtrl.checkLotCtrl(conn)) {
				lotCtrl = "true";
			} else {
				lotCtrl = "false";
			}
	        
	        /** パラメータ「棚卸承認」を取得*//*
	        privateConfig = new PrivateConfig(conn);
	        aprInvCtrl = privateConfig.getString("APR_INV_CTRL");
	        // パラメータ「棚卸承認」が取得できなかった場合
	        if(aprInvCtrl == null || "".equals(aprInvCtrl)){
 				String locale = CoreTools.getLocale(struct.getsUser_ID());
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 	    		ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00070"));
 	    		msgStruct.addError(emsg);
 	    		sysLog.warning(emsg, sysUSER_CD);
	        	aprInvCtrl = "0";
	        	return;
	        }else if("1".equals(aprInvCtrl)){
				// １の場合
	        	aprInvCtrl = "1";
	        }else{
				// １以外の場合
	        	aprInvCtrl = "0";
	        }
        	struct.seth_APR_INV_CTRL(aprInvCtrl);*/
		} catch (SQLException e) {
			ExpjMessage emsg = new ExpjMessage("ZZ01006", "(SBM1266)ロット管理導入失敗しました。");
			msgStruct.addWarn(emsg);
			sysLog.info(emsg, getsysUSER_CD());
		}
		// 棚卸アクセッサクラス準備
		_invAccessor = new InvAccessor(getsysPLANT_CD());

		// クリア処理
		controlclear();
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0050");
		logger.entering("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AH0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insert_sub1") ) {
				controlinsert_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("return_sub2") ) {
				controlreturn_sub2();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			struct.seth_lotCtrl(lotCtrl);
        	struct.seth_APR_INV_CTRL(aprInvCtrl);
        	struct.seth_APRR_FLG(aprFlg);
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0050010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0050010-E999","CSVの出力処理"));
			throw new FoundationException("AH0050010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0050010-E999","システム日付の取得処理"));
				throw new FoundationException("AH0050010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0050010-E999","コントロールのイベント処理"));
			throw new FoundationException("AH0050010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AH0050010Entity entity;
	protected AH0050010Struct struct;
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

		entity = new AH0050010Entity();
		struct = new AH0050010Struct();

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
	 * AH0050010クラスの標準コンストラクタ
	 */
	public AH0050010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                //---------------------------------------------------------------------
                list = new ArrayList(0);
                //---------------------------------------------------------------------
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
				AH0050010Struct key = (AH0050010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_status") && key.getw_INV_status() != null) {
					msgKey.setKeyValue("w_INV_status", key.getw_INV_status());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg") && key.geth_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("h_JOB_ODR_CD_STOCK_flg", key.geth_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("ERR_MSG") && key.getERR_MSG() != null) {
					msgKey.setKeyValue("ERR_MSG", key.getERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("ERR_ADR") && key.getERR_ADR() != null) {
					msgKey.setKeyValue("ERR_ADR", key.getERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg") && key.getc_JOB_ODR_CD_STOCK_flg() != null) {
					msgKey.setKeyValue("c_JOB_ODR_CD_STOCK_flg", key.getc_JOB_ODR_CD_STOCK_flg());
				}
				if(msgKeyType.containsKeyColumn("h_change_flg") && key.geth_change_flg() != null) {
					msgKey.setKeyValue("h_change_flg", key.geth_change_flg());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO_form") && key.getLOT_NO_form() != null) {
					msgKey.setKeyValue("LOT_NO_form", key.getLOT_NO_form());
				}
				if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL") && key.geth_APR_INV_CTRL() != null) {
					msgKey.setKeyValue("h_APR_INV_CTRL", key.geth_APR_INV_CTRL());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("INV_DATE") && key.getINV_DATE() != null) {
					msgKey.setKeyValue("INV_DATE", key.getINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG") && key.getREGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("REGULAR_INV_FLG", key.getREGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG") && key.getCYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("CYCLE_INV_FLG", key.getCYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_INV_FLG") && key.getTEMP_INV_FLG() != null) {
					msgKey.setKeyValue("TEMP_INV_FLG", key.getTEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("INV_STS_TYP") && key.getINV_STS_TYP() != null) {
					msgKey.setKeyValue("INV_STS_TYP", key.getINV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_START_DATE") && key.getINV_START_DATE() != null) {
					msgKey.setKeyValue("INV_START_DATE", key.getINV_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE") && key.getSTOCK_SAVE_DATE() != null) {
					msgKey.setKeyValue("STOCK_SAVE_DATE", key.getSTOCK_SAVE_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE") && key.getINV_UPDATED_DATE() != null) {
					msgKey.setKeyValue("INV_UPDATED_DATE", key.getINV_UPDATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("INV_COMMENT") && key.getINV_COMMENT() != null) {
					msgKey.setKeyValue("INV_COMMENT", key.getINV_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY") && key.getFINAL_BOOK_STOCK_QTY() != null) {
					msgKey.setKeyValue("FINAL_BOOK_STOCK_QTY", key.getFINAL_BOOK_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY") && key.getACTUAL_STOCK_QTY() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY", key.getACTUAL_STOCK_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_JAN") && key.getINV_FLG_JAN() != null) {
					msgKey.setKeyValue("INV_FLG_JAN", key.getINV_FLG_JAN());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_FEB") && key.getINV_FLG_FEB() != null) {
					msgKey.setKeyValue("INV_FLG_FEB", key.getINV_FLG_FEB());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_MAR") && key.getINV_FLG_MAR() != null) {
					msgKey.setKeyValue("INV_FLG_MAR", key.getINV_FLG_MAR());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_APR") && key.getINV_FLG_APR() != null) {
					msgKey.setKeyValue("INV_FLG_APR", key.getINV_FLG_APR());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_MAY") && key.getINV_FLG_MAY() != null) {
					msgKey.setKeyValue("INV_FLG_MAY", key.getINV_FLG_MAY());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_JUN") && key.getINV_FLG_JUN() != null) {
					msgKey.setKeyValue("INV_FLG_JUN", key.getINV_FLG_JUN());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_JUL") && key.getINV_FLG_JUL() != null) {
					msgKey.setKeyValue("INV_FLG_JUL", key.getINV_FLG_JUL());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_AUG") && key.getINV_FLG_AUG() != null) {
					msgKey.setKeyValue("INV_FLG_AUG", key.getINV_FLG_AUG());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_SEP") && key.getINV_FLG_SEP() != null) {
					msgKey.setKeyValue("INV_FLG_SEP", key.getINV_FLG_SEP());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_OCT") && key.getINV_FLG_OCT() != null) {
					msgKey.setKeyValue("INV_FLG_OCT", key.getINV_FLG_OCT());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_NOV") && key.getINV_FLG_NOV() != null) {
					msgKey.setKeyValue("INV_FLG_NOV", key.getINV_FLG_NOV());
				}
				if(msgKeyType.containsKeyColumn("INV_FLG_DEC") && key.getINV_FLG_DEC() != null) {
					msgKey.setKeyValue("INV_FLG_DEC", key.getINV_FLG_DEC());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_1") && key.getMODIFY_COUNT_1() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_1", key.getMODIFY_COUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TItemInvACTUALSTOCKQTY") && key.getTItemInvACTUALSTOCKQTY() != null) {
					msgKey.setKeyValue("TItemInvACTUALSTOCKQTY", key.getTItemInvACTUALSTOCKQTY());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_1") && key.getACTUAL_STOCK_QTY_1() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY_1", key.getACTUAL_STOCK_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("lotNoitemcd") && key.getlotNoitemcd() != null) {
					msgKey.setKeyValue("lotNoitemcd", key.getlotNoitemcd());
				}
				if(msgKeyType.containsKeyColumn("lotNoitemname") && key.getlotNoitemname() != null) {
					msgKey.setKeyValue("lotNoitemname", key.getlotNoitemname());
				}
				if(msgKeyType.containsKeyColumn("lotNowhcd") && key.getlotNowhcd() != null) {
					msgKey.setKeyValue("lotNowhcd", key.getlotNowhcd());
				}
				if(msgKeyType.containsKeyColumn("lotNoqty") && key.getlotNoqty() != null) {
					msgKey.setKeyValue("lotNoqty", key.getlotNoqty());
				}
				if(msgKeyType.containsKeyColumn("lotNoactual") && key.getlotNoactual() != null) {
					msgKey.setKeyValue("lotNoactual", key.getlotNoactual());
				}
				if(msgKeyType.containsKeyColumn("lotNostockunit") && key.getlotNostockunit() != null) {
					msgKey.setKeyValue("lotNostockunit", key.getlotNostockunit());
				}
				if(msgKeyType.containsKeyColumn("lotNounitqty") && key.getlotNounitqty() != null) {
					msgKey.setKeyValue("lotNounitqty", key.getlotNounitqty());
				}
				if(msgKeyType.containsKeyColumn("lotNomodify") && key.getlotNomodify() != null) {
					msgKey.setKeyValue("lotNomodify", key.getlotNomodify());
				}
				if(msgKeyType.containsKeyColumn("lotNolotno") && key.getlotNolotno() != null) {
					msgKey.setKeyValue("lotNolotno", key.getlotNolotno());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE") && key.getBEST_BEFORE_DATE() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DATE", key.getBEST_BEFORE_DATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_DEL_FLG") && key.getLOT_DEL_FLG() != null) {
					msgKey.setKeyValue("LOT_DEL_FLG", key.getLOT_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_2") && key.getACTUAL_STOCK_QTY_2() != null) {
					msgKey.setKeyValue("ACTUAL_STOCK_QTY_2", key.getACTUAL_STOCK_QTY_2());
				}
				if(msgKeyType.containsKeyColumn("h_APRR_FLG") && key.geth_APRR_FLG() != null) {
					msgKey.setKeyValue("h_APRR_FLG", key.geth_APRR_FLG());
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
					AH0050010Struct key = new AH0050010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_status")) {
						key.setw_INV_status(msgKey.getKeyValue("w_INV_status"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_CD_STOCK_flg")) {
						key.seth_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("h_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("ERR_MSG")) {
						key.setERR_MSG(msgKey.getKeyValue("ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("ERR_ADR")) {
						key.setERR_ADR(msgKey.getKeyValue("ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_CD_STOCK_flg")) {
						key.setc_JOB_ODR_CD_STOCK_flg(msgKey.getKeyValue("c_JOB_ODR_CD_STOCK_flg"));
					}
					if(msgKeyType.containsKeyColumn("h_change_flg")) {
						key.seth_change_flg(msgKey.getKeyValue("h_change_flg"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO_form")) {
						key.setLOT_NO_form(msgKey.getKeyValue("LOT_NO_form"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL")) {
						key.seth_APR_INV_CTRL(msgKey.getKeyValue("h_APR_INV_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INV_DATE")) {
						key.setINV_DATE(msgKey.getKeyValue("INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("REGULAR_INV_FLG")) {
						key.setREGULAR_INV_FLG(msgKey.getKeyValue("REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CYCLE_INV_FLG")) {
						key.setCYCLE_INV_FLG(msgKey.getKeyValue("CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_INV_FLG")) {
						key.setTEMP_INV_FLG(msgKey.getKeyValue("TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INV_STS_TYP")) {
						key.setINV_STS_TYP(msgKey.getKeyValue("INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_START_DATE")) {
						key.setINV_START_DATE(msgKey.getKeyValue("INV_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_SAVE_DATE")) {
						key.setSTOCK_SAVE_DATE(msgKey.getKeyValue("STOCK_SAVE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_UPDATED_DATE")) {
						key.setINV_UPDATED_DATE(msgKey.getKeyValue("INV_UPDATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INV_COMMENT")) {
						key.setINV_COMMENT(msgKey.getKeyValue("INV_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_BOOK_STOCK_QTY")) {
						key.setFINAL_BOOK_STOCK_QTY(msgKey.getKeyValue("FINAL_BOOK_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY")) {
						key.setACTUAL_STOCK_QTY(msgKey.getKeyValue("ACTUAL_STOCK_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(msgKey.getKeyValue("ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_JAN")) {
						key.setINV_FLG_JAN(msgKey.getKeyValue("INV_FLG_JAN"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_FEB")) {
						key.setINV_FLG_FEB(msgKey.getKeyValue("INV_FLG_FEB"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_MAR")) {
						key.setINV_FLG_MAR(msgKey.getKeyValue("INV_FLG_MAR"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_APR")) {
						key.setINV_FLG_APR(msgKey.getKeyValue("INV_FLG_APR"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_MAY")) {
						key.setINV_FLG_MAY(msgKey.getKeyValue("INV_FLG_MAY"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_JUN")) {
						key.setINV_FLG_JUN(msgKey.getKeyValue("INV_FLG_JUN"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_JUL")) {
						key.setINV_FLG_JUL(msgKey.getKeyValue("INV_FLG_JUL"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_AUG")) {
						key.setINV_FLG_AUG(msgKey.getKeyValue("INV_FLG_AUG"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_SEP")) {
						key.setINV_FLG_SEP(msgKey.getKeyValue("INV_FLG_SEP"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_OCT")) {
						key.setINV_FLG_OCT(msgKey.getKeyValue("INV_FLG_OCT"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_NOV")) {
						key.setINV_FLG_NOV(msgKey.getKeyValue("INV_FLG_NOV"));
					}
					if(msgKeyType.containsKeyColumn("INV_FLG_DEC")) {
						key.setINV_FLG_DEC(msgKey.getKeyValue("INV_FLG_DEC"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_1")) {
						key.setMODIFY_COUNT_1(msgKey.getKeyValue("MODIFY_COUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TItemInvACTUALSTOCKQTY")) {
						key.setTItemInvACTUALSTOCKQTY(msgKey.getKeyValue("TItemInvACTUALSTOCKQTY"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_1")) {
						key.setACTUAL_STOCK_QTY_1(msgKey.getKeyValue("ACTUAL_STOCK_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("lotNoitemcd")) {
						key.setlotNoitemcd(msgKey.getKeyValue("lotNoitemcd"));
					}
					if(msgKeyType.containsKeyColumn("lotNoitemname")) {
						key.setlotNoitemname(msgKey.getKeyValue("lotNoitemname"));
					}
					if(msgKeyType.containsKeyColumn("lotNowhcd")) {
						key.setlotNowhcd(msgKey.getKeyValue("lotNowhcd"));
					}
					if(msgKeyType.containsKeyColumn("lotNoqty")) {
						key.setlotNoqty(msgKey.getKeyValue("lotNoqty"));
					}
					if(msgKeyType.containsKeyColumn("lotNoactual")) {
						key.setlotNoactual(msgKey.getKeyValue("lotNoactual"));
					}
					if(msgKeyType.containsKeyColumn("lotNostockunit")) {
						key.setlotNostockunit(msgKey.getKeyValue("lotNostockunit"));
					}
					if(msgKeyType.containsKeyColumn("lotNounitqty")) {
						key.setlotNounitqty(msgKey.getKeyValue("lotNounitqty"));
					}
					if(msgKeyType.containsKeyColumn("lotNomodify")) {
						key.setlotNomodify(msgKey.getKeyValue("lotNomodify"));
					}
					if(msgKeyType.containsKeyColumn("lotNolotno")) {
						key.setlotNolotno(msgKey.getKeyValue("lotNolotno"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DATE")) {
						key.setBEST_BEFORE_DATE(msgKey.getKeyValue("BEST_BEFORE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_DEL_FLG")) {
						key.setLOT_DEL_FLG(msgKey.getKeyValue("LOT_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACTUAL_STOCK_QTY_2")) {
						key.setACTUAL_STOCK_QTY_2(msgKey.getKeyValue("ACTUAL_STOCK_QTY_2"));
					}
					if(msgKeyType.containsKeyColumn("h_APRR_FLG")) {
						key.seth_APRR_FLG(msgKey.getKeyValue("h_APRR_FLG"));
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
