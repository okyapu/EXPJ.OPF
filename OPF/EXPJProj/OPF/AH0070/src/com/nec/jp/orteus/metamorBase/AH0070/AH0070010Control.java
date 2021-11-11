/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0070/src/com/nec/jp/orteus/metamorBase/AH0070/AH0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0070;

import com.nec.jp.orteus.metamorBase.AH0070.*;
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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.io.IOException;
import java.text.MessageFormat;
import com.nec.jp.orteus.expj.util.DateCtrl;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0070010Control
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
       
        public AH0070010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
        //------------------------------------------------------------------------
       
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
        

        
        // ----- シスタム設定値取得 ---------------	
    	private PrivateConfig privateConfig;
        // ----- シスタム設定値取得 ---------------		
    	
    	/** 棚卸承認 */
    	String aprInvCtrl = "";	
    	/** 棚卸承認区分 */
     	String apprFlg = "";
     	//ユーザの承認権限
     	String apprPowerTyp = "";
        //------------ バッチ処理関連 --------------------------------------
       
        // バッチクラス名設定／取得
        protected String _batchClassName;
        public void setBatchClassName(String name){ _batchClassName = name; }
        public String getBatchClassName(){ return _batchClassName; }
       
        //------------------------------------------------------------------
       
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
       
        /** 棚卸状態区分 */
        private ComboStruct _INV_STS_TYP = new ComboStruct();
       
        /** 棚卸承認区分 */
        private ComboStruct _APPR_INV_STS_TYP = new ComboStruct();
       
        /**
         * 棚卸状態区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getINV_STS_TYP_name(String typ)
        {
         return (getTypName(_INV_STS_TYP, typ));
        }

        
        /**
         * 棚卸承認区分
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getAPPR_INV_STS_TYP_name(String typ)
        {
         return (getTypName(_APPR_INV_STS_TYP, typ));
        }
        //------------------------------------------------------------------
       
        /**
         * チェックボックス値変換取得処理
         * 指定された文字列が"1"の場合に"true"を返し、それ以外は""を返す
         *
         * @return チェックあり: "true" / チェックなし: "false"
         */
        public String convCheckBoxValue(String strValue)
        {
         String strCheckBoxValue = "";
         if( (strValue != null) && ("1".equals(strValue) == true) )
         {
          strCheckBoxValue = "true";
         }
         return strCheckBoxValue;
        }
       
        //------------------------------------------------------------------
        /**
         * 指定棚卸日以外の棚卸期間中データ読込処理
         *
         * @param target_struct 対象データ情報
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0070010Struct readT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate(AH0070010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 読込実行
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, target_struct);
       
         // 指定棚卸日以外の棚卸期間中データ存在チェック
         AH0070010Struct read_struct = null;
         if(read_list.size() > 0)
         {
          // 指定棚卸日以外の棚卸期間中データが存在
          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_DATE:" + ((AH0070010Struct)read_list.get(0)).getINV_DATE());
          setErrorMessage("AH00034", listMessage);
       
          // 読込情報取得
          read_struct = new AH0070010Struct();
          read_struct = (AH0070010Struct)read_list.get(0);
         }
       
         return read_struct;
        }
       
        /**
         * 棚卸期間中データ読込処理
         *
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0070010Struct readT_INV_CTRL_INV_STS_TYP1() throws FoundationException, SQLException
        {
         String Message = "";
         
         // 処理に関連するパラメータを設定
         AH0070010Struct target_struct = new AH0070010Struct();
         target_struct.setPLANT_CD(getsysPLANT_CD());
       
         // 読込実行
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL_INV_STS_TYP1.read(conn, target_struct);
       
         // 棚卸期間中データ存在チェック
         boolean bError = false;
         if(read_list.size() <= 0)
         {
          // 棚卸期間中データが存在しない
          Message = "T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD();
          setErrorMessage("AH00031", Message);
          bError = true;
         }
         else
         {
          // 棚卸期間中データ複数存在チェック
          if(read_list.size() > 1)
          {
           // 棚卸期間中データが複数存在
           Message = "T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD();
           setErrorMessage("AH00034", Message);
           bError = true;
          }
         }
       
         // エラーでない場合
         AH0070010Struct read_struct = null;
         if(bError != true)
         {
          // 読込情報取得
          read_struct = new AH0070010Struct();
          read_struct = (AH0070010Struct)read_list.get(0);
         }
         return read_struct;
        }
       
        /**
         * 棚卸制御データ読込処理
         *
         * @param target_struct 対象データ情報
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0070010Struct readT_INV_CTRL(AH0070010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 読込実行
         List read_list = new ArrayList(0);
         read_list = entity.mT_INV_CTRL.read(conn, target_struct);
       
         // レコード件数チェック
         if(read_list.size() <= 0)
         {
          // レコード件数が０(ゼロ)件の場合
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          return null;
         }
       
         // 読込情報取得
         AH0070010Struct read_struct = new AH0070010Struct();
         read_struct = (AH0070010Struct)read_list.get(0);
         return read_struct;
        }
       
        /**
         * 棚卸状態区分が1（棚卸期間中）でないかどうかの判定処理
         *
         * @param target_struct 対象データ情報
         * @return 異常なし true エラー false
         */
        private boolean checkINV_STS_TYP_notequal1(AH0070010Struct target_struct)
        {
         List listMessage = new ArrayList();
         
         // 結果フラグ初期化
         boolean bResult = true;
       
         // 棚卸状態区分が1（棚卸期間中）でないかどうかのチェック
         if("1".equals(target_struct.getINV_STS_TYP()) != true)
         {
          // 棚卸状態区分が1（棚卸期間中）以外の場合
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:" + target_struct.getINV_STS_TYP());
          setErrorMessage("AH00021", listMessage);
          bResult = false;
         }
         return bResult;
        }
         
        //------------------------------------------------------------------
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
         * エラーメッセージ設定(キー出力なし)
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setErrorMessageNoKey(String messageno)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
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
        private void setWarnMessage(String messageno )
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
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
         sysLog.info(emsg, getsysUSER_CD());
        }
		
        //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
                //------------------------------------------------------------------
              
                String Message = "";
              
                // 処理直前のstruct情報を退避
                AH0070010Struct copy_struct = new AH0070010Struct();
                copy_struct.copy(struct);
              
                // 最新棚卸制御情報読込用
                AH0070010Struct read_struct_inv_ctrl = new AH0070010Struct();
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 処理に関連するパラメータを設定
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 指定棚卸日以外の棚卸期間中データ存在チェック
                 AH0070010Struct read_struct = readT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate(struct);
                 if(read_struct != null)
                 {
                  // 指定棚卸日以外の棚卸期間中データが存在する
                  bError = true;	// エラーフラグ設定
                 }
              
                 // 棚卸制御データ存在チェック
                 read_struct_inv_ctrl = readT_INV_CTRL(struct);
                 if(read_struct_inv_ctrl == null)
                 {
                  // 棚卸制御データが存在しない
                  bError = true;	// エラーフラグ設定
                 }
                 else
                 {
                  // 棚卸状態区分が1（棚卸期間中）でないかどうかのチェック
                  if(checkINV_STS_TYP_notequal1(read_struct_inv_ctrl) != true)
                  {
                   // エラーフラグ設定
                   bError = true;
                  }
                 }
              
                 if(bError != true)
                 {
                  // ============================================================
                  // バッチ処理クラスのmain引数
                  String strBatchClassName = null;		// 呼び出し先クラス名
                  String strBatchProcessingTyp = null;	// バッチ処理区分
                  String strProgramId = null;			// 業務名（AH0070010）
                  String strUserId = null;				// ユーザID
                  String strPlantCd = null;				// 工場コード
                  String strInvDate = null;				// 棚卸日
              
                  // 引数セット
                  strBatchClassName = getBatchClassName();// com.nec.jp.orteus.metamorBase.AH0070.AH0070B001.mainAH0070B001
                  strBatchProcessingTyp = "2";			// 2: 自動運転しない（夜間バッチなし）
                  strProgramId = sp.getProcId();			// 業務名（AH0070010）
                  strUserId = getsysUSER_CD();				// ユーザID
                  strPlantCd = getsysPLANT_CD();				// 工場コード
                  strInvDate = struct.getINV_DATE();		// 棚卸日
              
                  // バッチ処理を実行する -------------------------------------------
                  ResourceBundle bundle = SystemConfig.getBundle();
                  String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
                  if(javaPath == null){
                   //システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
                   setErrorMessageNoKey("ZZ09010");
                   return;
                  }
                  String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
                  if(ClassPath == null){
                   //システム既定値ファイルからの情報取得に失敗しました(クラスパス)
                   setErrorMessageNoKey("ZZ09012");
                   return;
                  }
                  String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
                  if(batchPath == null){
                   //システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)
                   setErrorMessageNoKey("ZZ09011");
                   return;
                  }
              
                  String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE",bundle); 
                  if (heapSize == null) {
                   //システム既定値ファイルからの情報取得に失敗しました(バッチヒープサイズ設定)
                   setErrorMessageNoKey("ZZ09017");
                   return;
                  }
                 
                  try {
                   StringBuffer cmd = new StringBuffer(javaPath);        // コマンド文字列
                   cmd.append(" -Xms").append(heapSize).append("m");
                   cmd.append(" -Xmx").append(heapSize).append("m");
                   cmd.append(" -cp ");
                   cmd.append(ClassPath);
                   cmd.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
                   cmd.append(batchPath);
                   cmd.append(" ").append(strBatchClassName);		// 呼び出し先クラス
                   cmd.append(" ").append(strBatchProcessingTyp);	// バッチ処理区分
                   cmd.append(" ").append(strProgramId);			//業務名（AH0070010）
                   cmd.append(" ").append(strUserId);				// ユーザID
                   cmd.append(" ").append(strPlantCd);				// 工場コード
                   cmd.append(" ").append(strInvDate);				// 棚卸日(AH0070専用引数)
                   
                   sysLog.info("ZZ01006",getsysUSER_CD(),cmd.toString());
                   
                   List buffer = new ArrayList();
                   buffer.add(javaPath);            // ＪＶＭ
                   buffer.add("-Xms" + heapSize + "m");
                   buffer.add("-Xmx" + heapSize + "m");
                   buffer.add("-cp");
                   buffer.add(ClassPath);           // Java ClassPath
                   buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
                   buffer.add(strBatchClassName);		// 呼び出し先クラス
                   buffer.add(strBatchProcessingTyp);	// バッチ処理区分
                   buffer.add(strProgramId);			//業務名（AH0070010）
                   buffer.add(strUserId);				// ユーザID
                   buffer.add(strPlantCd);				// 工場コード
                   buffer.add(strInvDate);				// 棚卸日(AH0070専用引数)
//                   // バッチキック
//                   Runtime runtime = Runtime.getRuntime();
//                   Process p = runtime.exec(cmd.toString());
                   Runtime runtime = Runtime.getRuntime();
                   runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
                  } catch (IOException e) {
                  // バッチ呼び出し失敗の場合、画面メッセージを表示する。
                   ExpjMessage msg = new ExpjMessage( "ZZ09014" );
                   sysLog.severe(msg, getsysUSER_CD());
                   
                   ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                   sysLog.severe(emsg, getsysUSER_CD());
                   ExpjException ee = new ExpjException(e, emsg);
                   throw ee;
                  }
              
                  // バッチ呼び出し成功の場合、画面メッセージを表示する。
                  setInfoMessage("ZZ09013", "");
              
                 // バッチ処理を実行する 終わり-----------------------------------
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
              
                 // 画面表示情報設定
              
                 // 画面表示情報クリア
                 struct.clear();
              
                 // 最新棚卸制御情報反映
                 if(read_struct_inv_ctrl != null)
                 {
                  struct.copy(read_struct_inv_ctrl);
              
                  // 棚卸状態区分名取得設定
                  struct.setw_INV_STS_TYP(getINV_STS_TYP_name(struct.getINV_STS_TYP()));              
                  // 棚卸承認区分名取得設定
                  struct.setw_APPR_INV_STS_TYP(getAPPR_INV_STS_TYP_name(struct.getAPPR_FLG()));
              
                  // 棚卸フラグ値からチェックボックス値を設定
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                 }
                 // 処理前情報再設定
                 struct.setINV_DATE(copy_struct.getINV_DATE());
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlexecute>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * 承認ボタン押下時に実行される処理です。
	 *
	 */
	public void controlApprAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");
			//{{user_implement_dev:<controlApprAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
	         List listMessage = new ArrayList();	         
	         AH0070010Struct tempStruct = new AH0070010Struct();
	         //パラメータ設定
	         tempStruct.setPLANT_CD(getsysPLANT_CD());
	         tempStruct.setINV_DATE(struct.getINV_DATE());
	         // 読込実行
	         List read_list = new ArrayList(0);
	         read_list = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, tempStruct);
	       
	         // 指定棚卸日以外の棚卸期間中データ存在チェック
	         AH0070010Struct read_struct = null;
	         if(read_list.size() > 0)
	         {
	          // 指定棚卸日以外の棚卸期間中データが存在
	          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
	          listMessage.add("T_INV_CTRL.INV_DATE:" + ((AH0070010Struct)read_list.get(0)).getINV_DATE());
	          setErrorMessage("AH00034", listMessage);
	          return;
	         }
	         //業務運用日を取得
	         String businessDate = DateCtrl.getBusinessOprDate(conn,getsysPLANT_CD());
	         struct.setBUSINESS_DATE(businessDate);
	         // 棚卸制御の更新を行う
	         struct.setAPPR_FLG("2");	         
	         struct.setSYS_USER_CD(this.getsysUSER_CD());
	         struct.setPLANT_CD(this.getsysPLANT_CD());
	         entity.mupdate_T_INV_CTRL_appr_flg.update(conn,struct);
	         
	         //コメント
	         conn.commit();
	         
	         controlRELOAD();
		} catch(SQLException e) {
			conn.rollback();
            setSqlExceptionMsg(e);
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlApprAssort>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");

		return;
	}

	/**
	 * 承認取消ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelApprAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlDelApprAssort");
			//{{user_implement_dev:<controlDelApprAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
	         List listMessage = new ArrayList();	         
	         AH0070010Struct tempStruct = new AH0070010Struct();
	         //パラメータ設定
	         tempStruct.setPLANT_CD(getsysPLANT_CD());
	         tempStruct.setINV_DATE(struct.getINV_DATE());
	         // 読込実行
	         List read_list = new ArrayList(0);
	         read_list = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, tempStruct);
	       
	         // 指定棚卸日以外の棚卸期間中データ存在チェック
	         AH0070010Struct read_struct = null;
	         if(read_list.size() > 0)
	         {
	          // 指定棚卸日以外の棚卸期間中データが存在
	          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
	          listMessage.add("T_INV_CTRL.INV_DATE:" + ((AH0070010Struct)read_list.get(0)).getINV_DATE());
	          setErrorMessage("AH00034", listMessage);
	          return;
	         }
	         // 棚卸制御の更新を行う
	         struct.setAPPR_FLG("1");	
	         struct.setPLANT_CD(this.getsysPLANT_CD());
	         entity.mupdate_T_INV_CTRL_appr_flg.update(conn,struct);
	         
	         //コメント
	         conn.commit();
	         
	         controlRELOAD();
	         
		} catch(SQLException e) {
			conn.rollback();
            setSqlExceptionMsg(e);
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlDelApprAssort>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlDelApprAssort");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
              
                try {
              
                 // コンボデータの取得
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _INV_STS_TYP = controller.getData("INV_STS_TYP");	// 棚卸状態区分
                 _APPR_INV_STS_TYP = controller.getData("APR_INV_STS_TYP");	// 棚卸承認区分
              
                 // struct初期化
                 struct.initializeParent();
     	        
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
     	        	return;
     	        }else if("1".equals(aprInvCtrl)){
     				// １の場合
     	        	aprInvCtrl = "1";
     	        }else{
     				// １以外の場合
     	        	aprInvCtrl = "0";
     	        }
             	struct.seth_APR_INV_CTRL(aprInvCtrl);
                //ログインユーザの承認権限チェック
                struct.setSYS_USER_CD(this.getsysUSER_CD());
                List apprPowerList = entity.mselect_USER_MST_appr_power_typ.read(conn,struct);
                apprPowerTyp = ((AH0070010Struct)apprPowerList.get(0)).getAPPR_POWER_TYP();
                if("1".equals(aprInvCtrl) && "0".equals(apprPowerTyp)){
                	setWarnMessage("AZ00037");                	
                }
                struct.seth_APRR_POWER_TYP(apprPowerTyp);
              
                 // 初期読込処理
                 AH0070010Struct read_struct = readT_INV_CTRL_INV_STS_TYP1();
                 if(read_struct != null)
                 {
                  // 読込情報設定
                  struct.copy(read_struct);
              
                  // 棚卸状態区分名取得設定
                  struct.setw_INV_STS_TYP(getINV_STS_TYP_name(struct.getINV_STS_TYP()));
                  // 棚卸承認区分名取得設定
                  struct.setw_APPR_INV_STS_TYP(getAPPR_INV_STS_TYP_name(struct.getAPPR_FLG()));
              
                  // 棚卸フラグ値からチェックボックス値を設定
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                 }
                 
                 //棚卸承認区分を取得
                 struct.setPLANT_CD(this.getsysPLANT_CD());
                 List apprList = entity.mselect_T_INV_CTRL_appr_flg.read(conn,struct);
                 if(apprList.size() > 0){        	 
                 	apprFlg = ((AH0070010Struct)apprList.get(0)).getAPPR_FLG();
                 }
                 struct.seth_APRR_FLG(apprFlg);
                 //システムパラメータ棚卸承認(APR_INV_CTRL)が1：行う、かつ棚卸承認区分 が 2：棚卸承認済　ではない場合
                 if("1".equals(aprInvCtrl) && !"2".equals(apprFlg)){
                 	setWarnMessage("AH00047");
                 }
              
                }catch(SQLException e){
                 setSqlExceptionMsg(e);
              
                }catch(ComboException e){
                 // エラーメッセージ作成
                    ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0070");
		logger.entering("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			/*try{
				ComboBox controller = new ComboBox(conn);
				ComboStruct  cs = controller.getData("APR_INV_STS_TYP");
				struct.setList_APR_INV_STS_TYP_val(cs.getValList());
				struct.setList_APR_INV_STS_TYP_name(cs.getExplanList());				
			}catch(SQLException e){
				e.printStackTrace();
				
			}*/
	
                 // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AH0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("ApprAssort") ) {
				controlApprAssort();
			} else if( button.equals("DelApprAssort") ) {
				controlDelApprAssort();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
         	struct.seth_APR_INV_CTRL(aprInvCtrl);
            struct.seth_APRR_FLG(apprFlg);
            struct.seth_APRR_POWER_TYP(apprPowerTyp);
                } catch(AlarmMessageException ame){
                 ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0070010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0070010-E999","CSVの出力処理"));
			throw new FoundationException("AH0070010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0070010-E999","システム日付の取得処理"));
				throw new FoundationException("AH0070010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0070010-E999","コントロールのイベント処理"));
			throw new FoundationException("AH0070010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AH0070010Entity entity;
	protected AH0070010Struct struct;
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

		entity = new AH0070010Entity();
		struct = new AH0070010Struct();

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
	 * AH0070010クラスの標準コンストラクタ
	 */
	public AH0070010Control() throws BusinessProcessException, FoundationException
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
				AH0070010Struct key = (AH0070010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_STS_TYP") && key.getw_INV_STS_TYP() != null) {
					msgKey.setKeyValue("w_INV_STS_TYP", key.getw_INV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c_REGULAR_INV_FLG") && key.getc_REGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("c_REGULAR_INV_FLG", key.getc_REGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_CYCLE_INV_FLG") && key.getc_CYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("c_CYCLE_INV_FLG", key.getc_CYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_TEMP_INV_FLG") && key.getc_TEMP_INV_FLG() != null) {
					msgKey.setKeyValue("c_TEMP_INV_FLG", key.getc_TEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL") && key.geth_APR_INV_CTRL() != null) {
					msgKey.setKeyValue("h_APR_INV_CTRL", key.geth_APR_INV_CTRL());
				}
				if(msgKeyType.containsKeyColumn("h_APRR_FLG") && key.geth_APRR_FLG() != null) {
					msgKey.setKeyValue("h_APRR_FLG", key.geth_APRR_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_APRR_POWER_TYP") && key.geth_APRR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APRR_POWER_TYP", key.geth_APRR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_APPR_INV_STS_TYP") && key.getw_APPR_INV_STS_TYP() != null) {
					msgKey.setKeyValue("w_APPR_INV_STS_TYP", key.getw_APPR_INV_STS_TYP());
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
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SYS_USER_CD") && key.getSYS_USER_CD() != null) {
					msgKey.setKeyValue("SYS_USER_CD", key.getSYS_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_DATE") && key.getBUSINESS_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_DATE", key.getBUSINESS_DATE());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
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
					AH0070010Struct key = new AH0070010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_STS_TYP")) {
						key.setw_INV_STS_TYP(msgKey.getKeyValue("w_INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c_REGULAR_INV_FLG")) {
						key.setc_REGULAR_INV_FLG(msgKey.getKeyValue("c_REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_CYCLE_INV_FLG")) {
						key.setc_CYCLE_INV_FLG(msgKey.getKeyValue("c_CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_TEMP_INV_FLG")) {
						key.setc_TEMP_INV_FLG(msgKey.getKeyValue("c_TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_INV_CTRL")) {
						key.seth_APR_INV_CTRL(msgKey.getKeyValue("h_APR_INV_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("h_APRR_FLG")) {
						key.seth_APRR_FLG(msgKey.getKeyValue("h_APRR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_APRR_POWER_TYP")) {
						key.seth_APRR_POWER_TYP(msgKey.getKeyValue("h_APRR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_APPR_INV_STS_TYP")) {
						key.setw_APPR_INV_STS_TYP(msgKey.getKeyValue("w_APPR_INV_STS_TYP"));
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
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SYS_USER_CD")) {
						key.setSYS_USER_CD(msgKey.getKeyValue("SYS_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_DATE")) {
						key.setBUSINESS_DATE(msgKey.getKeyValue("BUSINESS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
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
