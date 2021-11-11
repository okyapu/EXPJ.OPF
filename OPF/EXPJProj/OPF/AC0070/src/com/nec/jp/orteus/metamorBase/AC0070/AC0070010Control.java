/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0070/src/com/nec/jp/orteus/metamorBase/AC0070/AC0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0070;

import com.nec.jp.orteus.metamorBase.AC0070.*;
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
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0070010Control
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
       
        public AC0070010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
       //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
        //-------------------------------------------------------------------------
        /** キー情報保持の為のStruct */
        private AC0070010Struct _keyStruct = new AC0070010Struct();
       
        /** キー情報Structの取得 */
        public AC0070010Struct getKeyStruct(){ return _keyStruct; }
        
        /** キー情報Structの設定 */
        public void setKeyStruct(AC0070010Struct struct){ _keyStruct.copy(struct); }
       
       
        //-------------------------------------------------------------------------
       
        /**
         * メッセージ取得 
         * @@return メッセージ
         */
        public MessageStruct getMessage()
        {
         return msgStruct;
        }
       
        /**
         * メッセージ設定
         * @@param メッセージ
         */
        public void setMessage(MessageStruct msg)
        {
         msgStruct = msg;
        }
       
        //-------------------------------------------------------------------------
       
        /** 内外作区分 **/
        ComboStruct _w_OUTSIDE_TYP = new ComboStruct();
       
        /** 内外作区分設定
         * @param コンボボックスデータ
        */
        public void setw_OUTSIDE_TYP_comb(ComboStruct combo){ _w_OUTSIDE_TYP = combo; }
       
        /** 内外作区分取得
         * @return 内外作区分のコンボボックスデータ
        */
        public ComboStruct getw_OUTSIDE_TYP_comb(){ return _w_OUTSIDE_TYP; }
       
       
        /** 品目手配区分 **/
        ComboStruct _w_MRP_ODR_TYP = new ComboStruct();
       
        /** 品目手配区分設定
         * @param コンボボックスデータ
        */
        public void setw_MRP_ODR_TYP_comb(ComboStruct combo){ _w_MRP_ODR_TYP = combo; }
       
        /** 品目手配区分取得
         * @return 品目手配区分のコンボボックスデータ
        */
        public ComboStruct getw_MRP_ODR_TYP_comb(){ return _w_MRP_ODR_TYP; }
       
       
        /** 在庫数量単位区分 **/
        ComboStruct _w_UNIT_QTY_TYP = new ComboStruct();
       
        /** 在庫数量単位区分設定
         * @param コンボボックスデータ
        */
        public void setw_UNIT_QTY_TYP_comb(ComboStruct combo){ _w_UNIT_QTY_TYP = combo; }
       
        /** 在庫数量単位区分取得
         * @return 在庫数量単位区分のコンボボックスデータ
        */
        public ComboStruct getw_UNIT_QTY_TYP_comb(){ return _w_UNIT_QTY_TYP; }
       
       
        /** オーダ状態区分 **/
        ComboStruct _w_ODR_STS_TYP = new ComboStruct();
       
        /** オーダ状態区分設定
         * @param コンボボックスデータ
        */
        public void setw_ODR_STS_TYP_comb(ComboStruct combo){ _w_ODR_STS_TYP = combo; }
       
        /** オーダ状態区分取得
         * @return オーダ状態区分のコンボボックスデータ
        */
        public ComboStruct getw_ODR_STS_TYP_comb(){ return _w_ODR_STS_TYP; }
       
       
        /** デマンド状態区分 **/
        ComboStruct _w_EXTERNAL_PLAN_DEL_FLG = new ComboStruct();
       
        /** デマンド状態区分設定
         * @param コンボボックスデータ
        */
        public void setw_EXTERNAL_PLAN_DEL_FLG_comb(ComboStruct combo){ _w_EXTERNAL_PLAN_DEL_FLG = combo; }
       
        /** デマンド状態区分取得
         * @return デマンド状態区分のコンボボックスデータ
        */
        public ComboStruct getw_EXTERNAL_PLAN_DEL_FLG_comb(){ return _w_EXTERNAL_PLAN_DEL_FLG; }
       
       
        /**
         * コンボボックスの中身を取得します。
         *
         * @param data データの箱
         */
         private void setComboData(AC0070010Struct data)
         {
          ComboBox controller = new ComboBox(conn, sysUSER_CD);
         try{
          //コンボデータの取得
          ComboStruct w_OUTSIDE_TYP_comb = controller.getData("OUTSIDE_TYP");
          ComboStruct w_MRP_ODR_TYP_comb = controller.getData("MRP_ODR_TYP");
          ComboStruct w_UNIT_QTY_TYP_comb = controller.getData("UNIT_QTY_TYP");
          ComboStruct w_ODR_STS_TYP_comb = controller.getData("ODR_STS_TYP");
          ComboStruct w_EXTERNAL_PLAN_DEL_FLG_comb = controller.getData("EXTERNAL_PLAN_DEL_FLG");
          
          controller.setConnection(null);
       
          //属性に取得データ設定
          setw_OUTSIDE_TYP_comb(w_OUTSIDE_TYP_comb);
          setw_MRP_ODR_TYP_comb(w_MRP_ODR_TYP_comb);
          setw_UNIT_QTY_TYP_comb(w_UNIT_QTY_TYP_comb);
          setw_ODR_STS_TYP_comb(w_ODR_STS_TYP_comb);
          setw_EXTERNAL_PLAN_DEL_FLG_comb(w_EXTERNAL_PLAN_DEL_FLG_comb);
       
       
         }catch(SQLException e) {
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
         }catch(ComboException e){
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
         }
        }
       
        //-------------------------------------------------------------------------
        /**
         * 外部オーダ参照のフラグの表示を設定
         * @param s フラグの値が設定されている情報
         */
        private void setTypeValueAboutProcGroup(AC0070010Struct s)
        {
         s.setOUTSIDE_NAME(getTypeName(_w_OUTSIDE_TYP,s.getOUTSIDE_TYP()));
         s.setMRP_ODR_NAME(getTypeName(_w_MRP_ODR_TYP,s.getMRP_ODR_TYP()));
         s.setUNIT_QTY_NAME(getTypeName(_w_UNIT_QTY_TYP,s.getUNIT_QTY_TYP()));
         s.setODR_STS_NAME(getTypeName(_w_ODR_STS_TYP,s.getODR_STS_TYP()));
         s.setEXTERNAL_PLAN_DEL_NAME(getTypeName(_w_EXTERNAL_PLAN_DEL_FLG,s.getEXTERNAL_PLAN_DEL_FLG()));
        }
         
        //-------------------------------------------------------------------------
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param intType 区分コード
         * @return 区分名称。該当するデータがなかった場合は区分コードを返す
         */
        private String getTypeName(ComboStruct comboStruct, String strTyp)
        {
         if(comboStruct == null || strTyp == null)  return null;
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
         
        //-------------------------------------------------------------------------
         
        /** ユーザ定義の初期化済フラグ */
        private boolean _usersIntialized = false;
       
        /**
         * ユーザ定義 初期化処理
         */
        private void usersInitialize()
        {
         try{
          // モード設定
          setReadStatus(INITIAL);
       
          if(_usersIntialized) return;
       
          // コンボデータの取得
          setComboData(struct);
       
          _usersIntialized = true;
          return ;
       
         }catch(AlarmMessageException msg){
          throw msg;
       
         }catch(Exception e){
          AlarmMessageException msg = new AlarmMessageException();
          throw msg;
       
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
         

       //------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                    //------------------------------------------------------------------
                  
                    String Message = "";
                    setReadStatus(INITIAL);
                  
                    try {
                  
                     // リストクリア
                     if(list != null){
                      list.clear();
                     }

                     // 変数定義
                     AC0070010Struct aStruct = null;
                     ScreenParam sp = new ScreenParam(this.getClass());
                     int maxLine = sp.getMaxLine(conn,10);
                     if(maxLine != 0) {
         				struct.setROW_COUNT(String.valueOf(maxLine));
         			} else {
         				struct.setROW_COUNT(null);
         			}
                     list = entity.mEXTERNAL_ORDER_REFCnt.read(conn, struct);
                     long rowCount = Long.parseLong(((AC0070010Struct)list.get(0)).getl_COUNT());
                     // 検索結果0件の場合
                     if(rowCount == 0){
                         // 読込処理失敗：検索結果が0件です
                         Message = "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + struct.getw_PLAN_CD();
                         setErrorMessage("ZZ06001", Message);
                         if(list != null && list.size() > 0){
                        	list.clear(); 
                         }
                         return;
                        }
                   //表示最大行数制限処理
                     if(maxLine != 0 && (rowCount ==maxLine+1)){
                    	 if(list != null && list.size() > 0){
                     	    this.list.clear(); 
                         }
                         // モード設定
                         setReadStatus(TOO_MANY);
                         ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                         msgStruct.addError( emsg );
                         sysLog.warning(emsg, getsysUSER_CD());
                         emsg = new ExpjMessage( "ZZ01006", "T_EXTERNAL_PLAN.EXTERNAL_PLAN_CD:" + struct.getw_PLAN_CD() );
                         msgStruct.addError( emsg );
                         sysLog.warning(emsg, getsysUSER_CD());
                         return;
                     }    
                     // データ読込
                     list = entity.mEXTERNAL_ORDER_REF.read(conn, struct);
                     for(int i=0; i<list.size(); i++){
                        // コンボボックスのデータ設定
                        setTypeValueAboutProcGroup((AC0070010Struct)(list.get(i)));
                        aStruct = (AC0070010Struct)list.get(i);	
                        aStruct.setODR_START_DATE(aStruct.getODR_START_DATE());
                        aStruct.setPRD_START_DATE(aStruct.getPRD_START_DATE());
                        aStruct.setPRD_DUE_DATE(aStruct.getPRD_DUE_DATE());
                       }
                       // モード設定
                       setReadStatus(NORMAL);      
                    } catch(SQLException e) {
                     setSqlExceptionMsg(e);
                  
                    }
                //}}user_implement_dev:<controlselect>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
              
                // リストクリア
                if(list != null){
                 list.clear();
                }
                else{
                 list = new ArrayList(0);
                }
              
                // 初期化
                struct.clear();
                _keyStruct = new AC0070010Struct();
              
                // モード設定
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //------------------------------------------------------------------
              
                try{
                 // ユーザ定義初期化
                 usersInitialize();
              
                }catch(AlarmMessageException msg){
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(msg, emsg);
                 
                 throw ee;
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0070");
		logger.entering("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AC0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
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
//			throw new FoundationException("AC0070010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0070010-E999","CSVの出力処理"));
			throw new FoundationException("AC0070010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0070010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0070010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0070010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0070010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0070010Entity entity;
	protected AC0070010Struct struct;
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

		entity = new AC0070010Entity();
		struct = new AC0070010Struct();

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
	 * AC0070010クラスの標準コンストラクタ
	 */
	public AC0070010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AC0070010Struct key = (AC0070010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ODR_STS_NAME") && key.getODR_STS_NAME() != null) {
					msgKey.setKeyValue("ODR_STS_NAME", key.getODR_STS_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_NAME") && key.getEXTERNAL_PLAN_DEL_NAME() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_DEL_NAME", key.getEXTERNAL_PLAN_DEL_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME") && key.getUNIT_QTY_NAME() != null) {
					msgKey.setKeyValue("UNIT_QTY_NAME", key.getUNIT_QTY_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_NAME") && key.getMRP_ODR_NAME() != null) {
					msgKey.setKeyValue("MRP_ODR_NAME", key.getMRP_ODR_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_NAME") && key.getOUTSIDE_NAME() != null) {
					msgKey.setKeyValue("OUTSIDE_NAME", key.getOUTSIDE_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_PLAN_CD") && key.getw_PLAN_CD() != null) {
					msgKey.setKeyValue("w_PLAN_CD", key.getw_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_val") && key.getw_OUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP_val", key.getw_OUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_name") && key.getw_OUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP_name", key.getw_OUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_val") && key.getw_MRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP_val", key.getw_MRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_name") && key.getw_MRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP_name", key.getw_MRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_val") && key.getw_UNIT_QTY_TYP_val() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP_val", key.getw_UNIT_QTY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_name") && key.getw_UNIT_QTY_TYP_name() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP_name", key.getw_UNIT_QTY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_val") && key.getw_ODR_STS_TYP_val() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP_val", key.getw_ODR_STS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_name") && key.getw_ODR_STS_TYP_name() != null) {
					msgKey.setKeyValue("w_ODR_STS_TYP_name", key.getw_ODR_STS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_val") && key.getw_EXTERNAL_PLAN_DEL_FLG_val() != null) {
					msgKey.setKeyValue("w_EXTERNAL_PLAN_DEL_FLG_val", key.getw_EXTERNAL_PLAN_DEL_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_name") && key.getw_EXTERNAL_PLAN_DEL_FLG_name() != null) {
					msgKey.setKeyValue("w_EXTERNAL_PLAN_DEL_FLG_name", key.getw_EXTERNAL_PLAN_DEL_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_LEVEL_NO") && key.getEXTERNAL_LEVEL_NO() != null) {
					msgKey.setKeyValue("EXTERNAL_LEVEL_NO", key.getEXTERNAL_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG") && key.getEXTERNAL_PLAN_DEL_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_PLAN_DEL_FLG", key.getEXTERNAL_PLAN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
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
					AC0070010Struct key = new AC0070010Struct();
					if(msgKeyType.containsKeyColumn("ODR_STS_NAME")) {
						key.setODR_STS_NAME(msgKey.getKeyValue("ODR_STS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_NAME")) {
						key.setEXTERNAL_PLAN_DEL_NAME(msgKey.getKeyValue("EXTERNAL_PLAN_DEL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_NAME")) {
						key.setUNIT_QTY_NAME(msgKey.getKeyValue("UNIT_QTY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_NAME")) {
						key.setMRP_ODR_NAME(msgKey.getKeyValue("MRP_ODR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_NAME")) {
						key.setOUTSIDE_NAME(msgKey.getKeyValue("OUTSIDE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_PLAN_CD")) {
						key.setw_PLAN_CD(msgKey.getKeyValue("w_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_val")) {
						key.setw_OUTSIDE_TYP_val(msgKey.getKeyValue("w_OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP_name")) {
						key.setw_OUTSIDE_TYP_name(msgKey.getKeyValue("w_OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_val")) {
						key.setw_MRP_ODR_TYP_val(msgKey.getKeyValue("w_MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP_name")) {
						key.setw_MRP_ODR_TYP_name(msgKey.getKeyValue("w_MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_val")) {
						key.setw_UNIT_QTY_TYP_val(msgKey.getKeyValue("w_UNIT_QTY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP_name")) {
						key.setw_UNIT_QTY_TYP_name(msgKey.getKeyValue("w_UNIT_QTY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_val")) {
						key.setw_ODR_STS_TYP_val(msgKey.getKeyValue("w_ODR_STS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_STS_TYP_name")) {
						key.setw_ODR_STS_TYP_name(msgKey.getKeyValue("w_ODR_STS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_val")) {
						key.setw_EXTERNAL_PLAN_DEL_FLG_val(msgKey.getKeyValue("w_EXTERNAL_PLAN_DEL_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("w_EXTERNAL_PLAN_DEL_FLG_name")) {
						key.setw_EXTERNAL_PLAN_DEL_FLG_name(msgKey.getKeyValue("w_EXTERNAL_PLAN_DEL_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_LEVEL_NO")) {
						key.setEXTERNAL_LEVEL_NO(msgKey.getKeyValue("EXTERNAL_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_PLAN_DEL_FLG")) {
						key.setEXTERNAL_PLAN_DEL_FLG(msgKey.getKeyValue("EXTERNAL_PLAN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
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
