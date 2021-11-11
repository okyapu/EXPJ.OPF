/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0040/src/com/nec/jp/orteus/metamorBase/AH0040/AH0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0040;

import com.nec.jp.orteus.metamorBase.AH0040.*;
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
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvDeleteProcess;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvInformation;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageControl;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvMessageInformation;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0040010Control
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
       
        public AH0040010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
        //------------------------------------------------------------------------
       
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
         * 棚卸アクセッサによる処理結果メッセージ出力処理
         *
         * @param	invAccessor	棚卸アクセッサクラス
         * @return	なし
         */
        private void resultMessageByInvAccessor(
         InvAccessor invAccessor) throws ExpjException
        {
         InvMessageInformation invMessageInfo = null;
         InvMessageControl msg = invAccessor.getMessage();
         String strResultCode = "";
         String strResultNote = "";
         for(int i = 0; ((invMessageInfo = msg.get(i)) != null); i++)
         {
          int intMessageParenTyp = invMessageInfo.getParentType();
          int intMessageTyp = invMessageInfo.getType();
          strResultCode = invMessageInfo.getCode();
          strResultNote = invMessageInfo.getNote();
          if(intMessageParenTyp == InvMessageControl.TYP_ERROR)
          {
           
           ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
           sysLog.severe(emsg, getsysUSER_CD());
           ExpjException ee = new ExpjException(emsg);
           setErrorLogMessage(strResultNote);
           
           throw ee;
          }
          else if(intMessageParenTyp == InvMessageControl.TYP_WARN)
          {
           if(strResultCode != null && "".equals(strResultCode) != true)
           {
            setWarnMessage(strResultCode);
           }
           setWarnLogMessage(strResultNote);
          }
          else if(intMessageParenTyp == InvMessageControl.TYP_INFO)
          {
           if(strResultCode != null && "".equals(strResultCode) != true)
           {
            setInfoMessage(strResultCode);
           }
           setInfoLogMessage(strResultNote);
          }
          else
          {
           setInfoLogMessage(strResultNote);
          }
         }
         return;
        }
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
        private ComboStruct _comboInvStsTyp = new ComboStruct();
       
        /**
         * 棚卸状態区分名取得
         *
         * @param	strTyp	区分コード
         * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getInvStsTypName(String strTyp)
        {
         return (getTypName(_comboInvStsTyp, strTyp));
        }
       
       
        //------------------------------------------------------------------
       
        /**
         * 棚卸期間中データ読込処理
         *
         * @return	最新の読込情報:異常なし / null:エラー
         */
        private AH0040010Struct readInvCtrl4StsTyp1() throws FoundationException, SQLException
        {
         String Message = "";
         
         // 処理に関連するパラメータを設定
         AH0040010Struct structTarget = new AH0040010Struct();
         structTarget.setPLANT_CD(getsysPLANT_CD());
       
         // 読込実行
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL_INV_STS_TYP1.read(conn, structTarget);
       
         // 棚卸期間中データ存在チェック
         AH0040010Struct structRead = null;
         if(listRead.size() > 0)
         {
          // １件目の読込情報取得
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
          Message= "readInvCtrl4StsTyp1 DATA COUNT:" + listRead.size();
          setInfoLogMessage(Message);
         }
         return structRead;
        }
       
       
        /**
         * 棚卸実施前データ読込処理
         *
         * @return	最新の読込情報:異常なし / null:エラー
         */
        private AH0040010Struct readInvCtrl4StsTyp0() throws FoundationException, SQLException
        {
         String Message = "";
         List listMessage = new ArrayList();
         
         // 処理に関連するパラメータを設定
         AH0040010Struct structTarget = new AH0040010Struct();
         structTarget.setPLANT_CD(getsysPLANT_CD());
       
         // 読込実行
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL_INV_STS_TYP0.read(conn, structTarget);
       
         // 棚卸実施前データ存在チェック
         AH0040010Struct structRead = null;
         if(listRead.size() <= 0)
         {
          // 棚卸実施前データが存在しない
          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:0");
          setErrorMessage("AH00035", listMessage);
         }
         else
         {
          // １件目の読込情報取得
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
          Message= "readInvCtrl4StsTyp0 DATA COUNT:" + listRead.size();
          setInfoLogMessage(Message);
         }
         return structRead;
        }
       
        /**
         * 指定棚卸日以外の棚卸期間中データ読込処理
         *
         * @param	structTarget	対象データ情報
         * @return	最新の読込情報:異常なし / null:エラー
         */
        private AH0040010Struct readInvCtrl4StsTyp1AndNotTargetInvDate(AH0040010Struct structTarget) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 読込実行
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL_INV_STS_TYP1_AndNotTargetInvDate.read(conn, structTarget);
       
         // 指定棚卸日以外の棚卸期間中データ存在チェック
         AH0040010Struct structRead = null;
         if(listRead.size() > 0)
         {
          // 指定棚卸日以外の棚卸期間中データが存在
          listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + getsysPLANT_CD());
          listMessage.add("Other period-INV_DATE:" + ((AH0040010Struct)listRead.get(0)).getINV_DATE());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:1");
          setErrorMessage("AH00034", listMessage);
       
          setInfoLogMessage("readInvCtrl4StsTyp1AndNotTargetInvDate DATA COUNT:" + listRead.size());
       
          // 読込情報取得
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
         }
       
         return structRead;
        }
       
        /**
         * 棚卸制御データ読込処理
         *
         * @param	structTarget	対象データ情報
         * @return	最新の読込情報:異常なし / null:エラー
         */
        private AH0040010Struct readInvCtrl(AH0040010Struct structTarget) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 読込実行
         List listRead = new ArrayList(0);
         listRead = entity.mT_INV_CTRL.read(conn, structTarget);
       
         // レコード件数チェック
         AH0040010Struct structRead = null;
         if(listRead.size() <= 0)
         {
          // レコード件数が０(ゼロ)件の場合
          listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + structTarget.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          return null;
         }
         else
         {
          // 読込情報取得
          structRead = new AH0040010Struct();
          structRead = (AH0040010Struct)listRead.get(0);
         }
         return structRead;
        }
       
        /**
         * 棚卸状態区分が2（棚卸更新済）かどうかのチェック処理
         *
         * @param	structTarget 対象データ情報
         * @return	true:棚卸状態区分が2の場合 / false:棚卸状態区分が2以外
         */
        private boolean checkInvStsTypNotEqual2(AH0040010Struct structTarget)
        {
         List listMessage = new ArrayList();
         
         // 結果フラグ初期化
         boolean bResult = true;
       
         // 棚卸状態区分が2（棚卸更新済）かどうかのチェック
         if("2".equals(structTarget.getINV_STS_TYP()) == true)
         {
          // 棚卸状態区分が2（棚卸更新済）
          listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + structTarget.getPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:" + structTarget.getINV_STS_TYP());
          setErrorMessage("AH00030", listMessage);
          bResult = false;
         }
         return bResult;
        }
       
        /**
         * 業務運用日取得
         *
         * @param	strPlantCd	工場コード
         * @return	日付文字列(YYYY/MM/DD形式):成功 / null:失敗
         */
        private String getBusinessOprDate(String strPlantCd) throws FoundationException, SQLException
        {
         String Message = "";
         
         AH0040010Struct search_struct = new AH0040010Struct();
         String strBUSINESS_OPR_DATE = null;
       
         // 読込条件設定
         search_struct.setPLANT_CD(strPlantCd);
       
         // 業務運用日読込実行
         List temp_list = entity.mSYS_DATE_CTRL.read(conn, search_struct);
         if(temp_list.size() <= 0)
         {
          // 業務運用日レコードなし
          Message = "SYS_DATE_CTRL.PLANT_CD:" + search_struct.getPLANT_CD();
          setErrorMessage("AH00024", Message);
          return null;
         }
       
         // 取得業務運用日チェック
         AH0040010Struct structRead = (AH0040010Struct)temp_list.get(0);
         strBUSINESS_OPR_DATE = structRead.getBUSINESS_OPR_DATE();
         if((strBUSINESS_OPR_DATE == null) || ("".equals(strBUSINESS_OPR_DATE) == true) )
         {
          // 取得業務運用日null
          Message = "SYS_DATE_CTRL.PLANT_CD:" + search_struct.getPLANT_CD();
          setErrorMessage("AH00024", Message);
          return null;
         }
         return strBUSINESS_OPR_DATE;
        }
       
        /**
         * 業務運用日取得による棚卸日チェック
         *
         * @param	structTarget	対象データ情報
         * @return	true:異常なし / false:エラー
         */
        private boolean checkInvDateByBusinessOprDate(AH0040010Struct structTarget) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 結果フラグ初期化
         boolean bResult = true;
         String strBUSINESS_OPR_DATE = getBusinessOprDate(structTarget.getPLANT_CD());
         if(strBUSINESS_OPR_DATE != null)
         {
          // 棚卸日が業務運用日より未来になっていないかどうかのチェック
          DateConverter dateConv = new DateConverter();
          Date dateINV_DATE = dateConv.str2date(structTarget.getINV_DATE());
          Date dateBUSINESS_OPR_DATE = dateConv.str2date(strBUSINESS_OPR_DATE);
          if(dateINV_DATE.getTime() > dateBUSINESS_OPR_DATE.getTime())
          {
           // 棚卸日が業務運用日より未来
           bResult = false;
       
           listMessage.add("T_INV_CTRL.INV_DATE:" + structTarget.getINV_DATE());
           listMessage.add("SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + strBUSINESS_OPR_DATE);
           listMessage.add("T_INV_CTRL.PLANT_CD:" + structTarget.getPLANT_CD());
           setErrorMessage("AH00037", listMessage);
          }
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
         * エラーメッセージ設定
         * @param ログ出力メッセージ
         */
        private void setErrorLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.warning(emsg, getsysUSER_CD());
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
         * 警告メッセージ設定
         * @param 出力メッセージ
         */
        private void setWarnMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
       
        /**
         * 警告メッセージ設定
         * @param ログ出力メッセージ
         */
        private void setWarnLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * 情報メッセージ設定
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setInfoMessage(String messageno)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
       
        /**
         * 情報メッセージ設定
         * @param ログ出力メッセージ
         */
        private void setInfoLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.config(emsg, getsysUSER_CD());
        }
    	/** メッセージ管理クラス */
    	private InvMessageControl _msg = null;
  
        //------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
                // 読込処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0040010Struct structCopy = new AH0040010Struct();
                structCopy.copy(struct);
              
                // 最新棚卸制御情報読込用
                AH0040010Struct structReadInvCtrl = new AH0040010Struct();
              
                // 検索状態を初期化
                setReadStatus(INITIAL);
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 処理に関連するパラメータを設定
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 入力棚卸日以外の棚卸期間中データ存在チェック
                 AH0040010Struct structRead = readInvCtrl4StsTyp1AndNotTargetInvDate(struct);
                 if(structRead != null)
                 {
                  // 入力棚卸日以外に棚卸期間中のデータが存在する
                  bError = true;
                 }
              
                 // 棚卸制御データ存在チェック
                 structReadInvCtrl = readInvCtrl(struct);
                 if(structReadInvCtrl == null)
                 {
                  // 棚卸制御データが存在しない
                  bError = true;
                 }
                 else
                 {
                  // 最新の棚卸状態区分を設定
                  struct.setINV_STS_TYP(structReadInvCtrl.getINV_STS_TYP());
              
                  // 棚卸状態区分が2（棚卸更新済）でないかのチェック
                  if(checkInvStsTypNotEqual2(struct) != true)
                  {
                   // 棚卸状態区分が2(更新済み)の場合
                   bError = true;
                  }
                 }
              
                 // 棚卸日が業務運用日より未来になっていないかどうかのチェック
                 if(checkInvDateByBusinessOprDate(struct) != true)
                 {
                  // 棚卸日が業務運用日より未来
                  bError = true;
                 }
              
                 // エラーがない
                 if(bError != true)
                 {
                  // 読込処理成功フラグ設定
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // 最新情報設定
                 // 画面表示情報クリア
                 struct.clear();
              
                 // 最新棚卸制御情報反映
                 if(structReadInvCtrl != null)
                 {
                  struct.copy(structReadInvCtrl);
              
                  // 棚卸状態区分名取得設定
                  struct.setw_INV_STS_TYP(getInvStsTypName(struct.getINV_STS_TYP()));
              
                  // 棚卸フラグ値からチェックボックス値を設定
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                 }
                 // 処理前情報再設定
                 struct.setINV_DATE(structCopy.getINV_DATE());
              
                 // 画面モード設定
                 if(bSuccess == true)
                 {
                  setReadStatus(NORMAL);
              
                  // 読込成功時のキー情報を退避
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                 }
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
                //------------------------------------------------------------------
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
              
                // 処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0040010Struct structCopy = new AH0040010Struct();
                structCopy.copy(struct);
              
                // 最新棚卸制御情報読込用
                AH0040010Struct structReadInvCtrl = new AH0040010Struct();
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 処理に関連するパラメータを設定
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 入力棚卸日以外の棚卸期間中データ存在チェック
                 AH0040010Struct structRead = readInvCtrl4StsTyp1AndNotTargetInvDate(struct);
                 if(structRead != null)
                 {
                  // 入力棚卸日以外に棚卸期間中のデータが存在する
                  bError = true;
                 }
                 // 棚卸制御データ存在チェック
                 structReadInvCtrl = readInvCtrl(struct);
                 if(structReadInvCtrl == null)
                 {
                  // 棚卸制御データが存在しない
                  bError = true;
                 }
                 else
                 {
                  // 最新の棚卸状態区分を設定
                  struct.setINV_STS_TYP(structReadInvCtrl.getINV_STS_TYP());
              
                  // 棚卸状態区分が2（棚卸更新済）でないかのチェック
                  if(checkInvStsTypNotEqual2(struct) != true)
                  {
                   // 棚卸状態区分が2(更新済み)の場合
                   bError = true;
                  }
                 }
              
                 // 棚卸日が業務運用日より未来になっていないかどうかのチェック
                 if(checkInvDateByBusinessOprDate(struct) != true)
                 {
                  // 棚卸日が業務運用日より未来
                  bError = true;
                 }
              
                 
                 //2009/09/04 追加
                 // 臨時情報読込用
                 AH0040010Struct structTemp = new AH0040010Struct();
                 String strTEMP_INV_FLG = "0";
                 
                 structTemp.setPLANT_CD(getsysPLANT_CD());
                 structTemp.setINV_DATE(structCopy.getINV_DATE());
                         
                 List temp_list = entity.mT_INV_CTRL.read(conn, structTemp);
                 if(temp_list.size() > 0){
                	 strTEMP_INV_FLG = ((AH0040010Struct)temp_list.get(0)).getTEMP_INV_FLG();
                 }
                 
                 if("1".equals(strTEMP_INV_FLG)){
                	 temp_list = entity.mT_INV_TARGET_WH.read(conn, structTemp);
                     if(temp_list.size() <= 0)
                     {
                    	//棚卸条件保管区指定
                   	  	temp_list = entity.mT_INV_TARGET_ITEM.read(conn, structTemp);
                   	  	if(temp_list.size() <= 0){
                   		     //棚卸条件品目指定
                             String Message = "T_INV_TARGET_ITEM.PLANT_CD:" + structTemp.getPLANT_CD();
                             Message += " T_INV_TARGET_WH.PLANT_CD:" + structTemp.getPLANT_CD();
                             setErrorMessage("AH00050", Message);
                             bError = true;
                   	  }
                     }
                 }
                
                 // エラーがない場合
                 if(bError != true)
                 {
                  // バッチ開始メッセージ表示
                  setInfoMessage( "ZZ09001" );
              
                  // 棚卸アクセッサクラス生成
                  InvAccessor invAccessor = 
                   new InvAccessor(getsysPLANT_CD(), getsysUSER_CD(), sp.getProcId());

                  
                  // 実行処理
                  boolean bResult;
                  while(true)
                  {
                   //--------------------------------------
                   // トランザクション開始
                   conn.beginTransWeb();
              
                   // DB更新中フラグON
                   bDBUpdate = true;
              
                   // 過去データ削除
                   bResult = invAccessor.delete(conn, struct.getINV_DATE());
                   resultMessageByInvAccessor(invAccessor);	// 処理結果メッセージ出力
                   if(bResult != true)
                   {
                    bError = true;
                    break;
                   }
                   // コミット
                   conn.commit();
              
                   // DB更新中フラグOFF
                   bDBUpdate = false;
              
                   //--------------------------------------
                   // トランザクション開始
                   conn.beginTransWeb();
              
                   // DB更新中フラグON
                   bDBUpdate = true;
              
                   // 棚卸データ作成
                   bResult = invAccessor.save(conn, struct.getINV_DATE());
                   resultMessageByInvAccessor(invAccessor);	// 処理結果メッセージ出力
                   if(bResult != true)
                   {
                    bError = true;
                    break;
                   }
                   // コミット
                   conn.commit();
              
                   // DB更新中フラグOFF
                   bDBUpdate = false;
                   //--------------------------------------
              
                   break;
                  }
              
                  // エラーがない場合
                  if(bError != true)
                  {
                   // 再読込処理
                   controlselect();
              
                   // 読込処理成功フラグ設定
                   bSuccess = true;
              
                   // バッチ終了メッセージ表示
                   setInfoMessage( "ZZ09002" );
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
                  setInfoLogMessage("Control：controlexecute - rollback!!");
                 }
              
                 if(bSuccess != true)
                 {
                  // 実行処理が成功した場合、再読込により最新状態になっているはずなので、
                  // 実行処理が失敗した場合のみ、最新情報設定処理をおこなう
              
                  // 最新情報設定
                  // 画面表示情報クリア
                  struct.clear();
              
                  // 最新棚卸制御情報反映
                  if(structReadInvCtrl != null)
                  {
                   struct.copy(structReadInvCtrl);
              
                   // 棚卸状態区分名取得設定
                   struct.setw_INV_STS_TYP(getInvStsTypName(struct.getINV_STS_TYP()));
              
                   // 棚卸フラグ値からチェックボックス値を設定
                   struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                   struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                   struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
                  }
                  // 処理前情報再設定
                  struct.setINV_DATE(structCopy.getINV_DATE());
                  struct.seth_saveINV_DATE(structCopy.geth_saveINV_DATE());
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlexecute>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                try {
                 // structクリア
                 struct.clear();
              
                 // 初期値設定
                 // 棚卸期間中データ読込
                 AH0040010Struct structRead = readInvCtrl4StsTyp1();
                 if(structRead == null)
                 {
                  // 棚卸期間中データが存在しない
                  structRead = readInvCtrl4StsTyp0();
                 }
                 if(structRead != null)
                 {
                  // 読込情報設定
                  struct.copy(structRead);
              
                  // 棚卸状態区分名取得設定
                  struct.setw_INV_STS_TYP(getInvStsTypName(struct.getINV_STS_TYP()));
              
                  // 棚卸フラグ値からチェックボックス値を設定
                  struct.setc_REGULAR_INV_FLG(convCheckBoxValue(struct.getREGULAR_INV_FLG()));
                  struct.setc_CYCLE_INV_FLG(convCheckBoxValue(struct.getCYCLE_INV_FLG()));
                  struct.setc_TEMP_INV_FLG(convCheckBoxValue(struct.getTEMP_INV_FLG()));
              
                  // 読込済み状態にするためモードにSELECTを設定
                  setReadStatus(NORMAL);
                  // 読込成功時のキー情報を退避
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                 }
                 else
                 {
                  // 検索状態を初期化
                  setReadStatus(INITIAL);
                 }
                 struct.initializeParent();
              
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
                try {
              
                 // コンボデータの取得
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _comboInvStsTyp = controller.getData("INV_STS_TYP");	// 棚卸状態区分
              
                 // クリア処理
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
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0040");
		logger.entering("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AH0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
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
//			throw new FoundationException("AH0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0040010-E999","CSVの出力処理"));
			throw new FoundationException("AH0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0040010-E999","システム日付の取得処理"));
				throw new FoundationException("AH0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("AH0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AH0040010Entity entity;
	protected AH0040010Struct struct;
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

		entity = new AH0040010Entity();
		struct = new AH0040010Struct();

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
	 * AH0040010クラスの標準コンストラクタ
	 */
	public AH0040010Control() throws BusinessProcessException, FoundationException
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
				AH0040010Struct key = (AH0040010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("h_saveINV_DATE") && key.geth_saveINV_DATE() != null) {
					msgKey.setKeyValue("h_saveINV_DATE", key.geth_saveINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("temp_WH_CD") && key.gettemp_WH_CD() != null) {
					msgKey.setKeyValue("temp_WH_CD", key.gettemp_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("temp_ITEM_CD") && key.gettemp_ITEM_CD() != null) {
					msgKey.setKeyValue("temp_ITEM_CD", key.gettemp_ITEM_CD());
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
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
					AH0040010Struct key = new AH0040010Struct();
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
					if(msgKeyType.containsKeyColumn("h_saveINV_DATE")) {
						key.seth_saveINV_DATE(msgKey.getKeyValue("h_saveINV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("temp_WH_CD")) {
						key.settemp_WH_CD(msgKey.getKeyValue("temp_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("temp_ITEM_CD")) {
						key.settemp_ITEM_CD(msgKey.getKeyValue("temp_ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
