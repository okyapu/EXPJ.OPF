/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0030/src/com/nec/jp/orteus/metamorBase/AH0030/AH0030010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0030;

import com.nec.jp.orteus.metamorBase.AH0030.*;
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
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvAccessor;
import com.nec.jp.orteus.metamorBase.common01.Inventry.InvInformation;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;

import java.util.ArrayList;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0030010Control
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
       
        public AH0030010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
        
        /** ロット管理導入済チェック **/
    	private boolean lotCtrlFlg = false;
       
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
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * エラー発生時パラメータ設定
         * @param	key		パラメータ
         */
        private void setErrorParameter(String key)
        {
         ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, getsysUSER_CD());
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
       
        /**
         * Exceptionエラーメッセージ設定
         * @param	code	メッセージ番号
         * @return	ExpjMessage
         */
        private ExpjMessage setExceptionMessage(String code)
        {
         ExpjMessage emsg = new ExpjMessage(code);
         sysLog.severe(emsg, getsysUSER_CD());
         return emsg;
        }
       
        /**
         * Exceptionエラー発生時パラメータ設定
         * @param	key		パラメータ
         */
        private void setExceptionParameter(String key)
        {
         ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
         sysLog.severe(emsg, getsysUSER_CD());
        }
       
        //------------ コンボボックスデータ--------------------------------------
       
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
       
        /** 棚卸区分 */
        private ComboStruct _comboAbcTyp = new ComboStruct();
       
        /**
         * 棚卸区分名取得
         *
         * @param	typ		区分コード
         * @return	区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getABC_TYP_name(String typ)
        {
         return (getTypName(_comboAbcTyp, typ));
        }
       
        //---------- ＣＳＶ出力関連の処理 ---------------------------------------------------
       
        private List _csvList = new ArrayList(0);
        public List getCsvList(){ return _csvList; }
        public void setCsvList(List list){ _csvList = list; }
       
        //------------------------------------------------------------------
        //------------------------------------------------------------------
        //------------------------------------------------------------------
       
        /** 棚卸情報取得用クラスオブジェクト用意 */
        InvAccessor _invAccessor = null;
       
        /** 
         * 対象データが既に更新されているかどうかの判定処理
         * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
         *
         * @param target_struct 対象データ情報
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0030010Struct checkTargetData(AH0030010Struct target_struct) throws FoundationException, SQLException
        {
         // 読込情報格納用変数宣言
         AH0030010Struct new_struct = new AH0030010Struct();
       
         // 処理対象データの存在チェック
         List temp_list = entity.mT_INV_CTRL4Update.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          // 更新対象データが存在しなかった場合
          setErrorMessage("AH00021");
          setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          return null;
         }
         else
         {
          // レコードが更新されていないかチェック
          new_struct = (AH0030010Struct)temp_list.get(0);
          if(new_struct.getMODIFY_COUNT().equals(target_struct.getMODIFY_COUNT()) != true)
          {
           // 既にレコードが更新
           setErrorMessage("ZZ01105");
           setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
           setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
           return null;
          }
         }
         return new_struct;
        }
       
        /**
         * 棚卸状態区分が2（棚卸更新済）かどうかの判定処理
         *
         * @param target_struct 対象データ情報
         * @return 異常なし true エラー false
         */
        private boolean checkINV_STS_TYP_equal2(AH0030010Struct target_struct)
        {
         List key = new ArrayList();
       
         // 結果フラグ初期化
         boolean bResult = true;
       
         // 棚卸状態区分が2（棚卸更新済）かどうかのチェック
         if("2".equals(target_struct.getINV_STS_TYP()) == true)
         {
          setErrorMessage("AH00030");
          setErrorParameter("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          setErrorParameter("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorParameter("T_INV_CTRL.INV_STS_TYP:" + target_struct.getINV_STS_TYP());
          bResult = false;
         }
         return bResult;
        }
       
        /** 
         * 棚卸制御レコード更新処理
         *
         * @param target_struct 更新情報
         * @return 成功 true エラー false
         */
        private boolean updateT_INV_CTRL(AH0030010Struct target_struct) throws FoundationException, SQLException
        {
         // 結果フラグ初期化
         boolean bResult = true;
       
         // 対象レコードチェック
         AH0030010Struct new_struct = new AH0030010Struct();
         new_struct = checkTargetData(target_struct);
         if(new_struct == null)
         {
          bResult = false;
         }
         else
         {
          // 更新実行
          entity.mT_INV_CTRL.update(conn, target_struct);
         }
         return bResult;
        }
       
        /**
         * 調査表種類識別定数取得
         *
         * @param	structTarget	対象データ情報
         * @return	調査表識別定数 / エラー:SHEET_NONE
         */
        private int getSheetKind(AH0030010Struct structTarget)
        {
         int intKind = SHEET_NONE;
         if( ("0".equals(structTarget.geth_sheet()) == true) && ("0".equals(structTarget.geth_stock()) == true) )
         {
          // 棚卸調査表－品目
          intKind = SHEET_NORMAL_AND_ITEM;
         }
         else if( ("0".equals(structTarget.geth_sheet()) == true) && ("1".equals(structTarget.geth_stock()) == true) )
         {
          // 棚卸調査表－製番
          intKind = SHEET_NORMAL_AND_JOB;
         }
         else if("1".equals(structTarget.geth_sheet()) == true)
         {
          // 不良在庫調査表－品目
          intKind = SHEET_DEFECT_AND_ITEM;
         }
         else if( ("2".equals(structTarget.geth_sheet()) == true) && ("0".equals(structTarget.geth_stock()) == true) )
         {
          // マイナス在庫調査表－品目
          intKind = SHEET_MINUS_AND_ITEM;
         }
         else if( ("2".equals(structTarget.geth_sheet()) == true) && ("1".equals(structTarget.geth_stock()) == true) )
         {
          // マイナス在庫調査表－製番
          intKind = SHEET_MINUS_AND_JOB;
         }
         else if("3".equals(structTarget.geth_sheet()) == true)
         {
          // 積送在庫調査表－積送
          intKind = SHEET_TRANS_AND_TRANS;
         }
         return intKind;
        }
       
        /** 
         * 出力一覧情報取得
         *
         * @param	structTarget	対象データ情報
         * @return	出力一覧情報取得 / エラー:null
         */
        private List getOutList(AH0030010Struct structTarget)
        {
         List key = new ArrayList();
       
         // 保管区コード
         String strWH_CD = structTarget.getWH_CD();
         if("1".equals(structTarget.geth_wh()) != true)
         {
          // 保管区指定が選択されていない場合は、%を設定する
          strWH_CD = "%";
         }
         // ロット番号
         String strLOT_NO = structTarget.getLOT_NO();
         if("1".equals(structTarget.geth_lot()) != true){
           // ロット番号指定が選択されていない場合は、%を設定する
           strLOT_NO = "%";
         }
         
         // 品目番号
         String strITEM_CD = structTarget.getITEM_CD();
         if("1".equals(structTarget.geth_item()) != true){
           // 品目番号指定が選択されていない場合は、%を設定する
        	strITEM_CD = "%";
         }

       
         // 情報取得実行
         List listTarget = _invAccessor.getStockList(
          conn, 
          structTarget.getINV_DATE(), 
          structTarget.geth_sheet(), 
          structTarget.geth_stock(), 
          strWH_CD,
          strLOT_NO,
          strITEM_CD);
       
         // 取得データがある場合のみ出力用リストへ取得リストを設定する
         if(listTarget != null && listTarget.size() <= 0)
         {
          // 対象データが存在しない
          String strDbName = getTableName4Log(structTarget);
          setErrorMessage("ZZ06001");
          setErrorParameter(strDbName + ".PLANT_CD:" + structTarget.getPLANT_CD());
          setErrorParameter(strDbName + ".WH_CD:" + structTarget.getWH_CD());
          
          if(struct.getr2_stock1().equals("true")){
        	  setErrorParameter("T_LOT_STOCK.LOT_NO:" + structTarget.getLOT_NO());
          }
          setErrorParameter(strDbName + ".ITEM_CD:" + structTarget.getITEM_CD());  
       
          listTarget = null;
         }
         return listTarget;
        }
       
        /**
         * 出力一覧情報取得テーブル名取得（ログ出力用）
         *
         * @param	structTarget	対象データ情報
         * @return	成功:一覧情報取得テーブル名文字列 / 失敗:空文字
         */
    	private String getTableName4Log(AH0030010Struct structTarget) {
    		String strDbName = "";
    		switch (getSheetKind(structTarget)) {
    		// 棚卸調査表－品目
    		case SHEET_NORMAL_AND_ITEM: 
            // 不良在庫調査表－品目
    		case SHEET_DEFECT_AND_ITEM: 
            // マイナス在庫調査表－品目
    		case SHEET_MINUS_AND_ITEM: 
    			strDbName = "T_ITEM_STOCK";
    			break;
            // 棚卸調査表－製番
    		case SHEET_NORMAL_AND_JOB: 
            // マイナス在庫調査表－製番
    		case SHEET_MINUS_AND_JOB: 
    			strDbName = "T_JOB_ODR_CD_STOCK";
    			break;
            // 積送在庫調査表－積送
    		case SHEET_TRANS_AND_TRANS: 
    			strDbName = "T_TRANSPORT_STOCK";
    			break;
            // 調査表種類不正	
    		default:
    			break;
    		}
    		return strDbName;
    	}
       
        //---------- 帳票出力関連の処理 ---------------------------------------------------
       
        /** フォーム識別ID（品目在庫－品目順） */
        private final String FORMID_NORMAL_AND_ITEM		= "1";
        /** フォーム識別ID（製番在庫－品目順） */
        private final String FORMID_NORMAL_AND_JOB		= "2";
        /** フォーム識別ID（品目在庫－保管区順） */
        private final String FORMID_DEFECT_AND_ITEM		= "3";
        /** フォーム識別ID（製番在庫－保管区順） */
        private final String FORMID_MINUS_AND_ITEM		= "4";
        /** フォーム識別ID（品目在庫－保管区順） */
        private final String FORMID_MINUS_AND_JOB		= "5";
        /** フォーム識別ID（製番在庫－保管区順） */
        private final String FORMID_TRANS_AND_TRANS		= "6";
       
        /** 調査表種類定数（該当なし） */
        private final int SHEET_NONE = 0;
        /** 調査表種類定数（棚卸調査表－品目） */
        private final int SHEET_NORMAL_AND_ITEM = (SHEET_NONE+1);
        /** 調査表種類定数（棚卸調査表－製番） */
        private final int SHEET_NORMAL_AND_JOB = (SHEET_NORMAL_AND_ITEM+1);
        /** 調査表種類定数（不良在庫調査表－品目） */
        private final int SHEET_DEFECT_AND_ITEM = (SHEET_NORMAL_AND_JOB+1);
        /** 調査表種類定数（マイナス在庫調査表－品目） */
        private final int SHEET_MINUS_AND_ITEM = (SHEET_DEFECT_AND_ITEM+1);
        /** 調査表種類定数（マイナス在庫調査表－製番） */
        private final int SHEET_MINUS_AND_JOB = (SHEET_MINUS_AND_ITEM+1);
        /** 調査表種類定数（積送在庫調査表－積送） */
        private final int SHEET_TRANS_AND_TRANS = (SHEET_MINUS_AND_JOB+1);
       
        /**
         * フォームファイル名取得
         *
         * @param	structTarget	対象データ情報
         * @return	フォームファイル名:成功 / null:失敗
         */
        private String getFormFileName(AH0030010Struct structTarget)
        {
         // フォーム識別ID設定
         String strFormId = null;
         switch(getSheetKind(structTarget))
         {
         case SHEET_NORMAL_AND_ITEM:	// 棚卸調査表－品目
          strFormId = FORMID_NORMAL_AND_ITEM;
          break;
         case SHEET_NORMAL_AND_JOB:	// 棚卸調査表－製番
          strFormId = FORMID_NORMAL_AND_JOB;
          break;
         case SHEET_DEFECT_AND_ITEM:	// 不良在庫調査表－品目
          strFormId = FORMID_DEFECT_AND_ITEM;
          break;
         case SHEET_MINUS_AND_ITEM:	// マイナス在庫調査表－品目
          strFormId = FORMID_MINUS_AND_ITEM;
          break;
         case SHEET_MINUS_AND_JOB:		// マイナス在庫調査表－製番
          strFormId = FORMID_MINUS_AND_JOB;
          break;
         case SHEET_TRANS_AND_TRANS:	// 積送在庫調査表－積送
          strFormId = FORMID_TRANS_AND_TRANS;
          break;
         default:// 調査表種類不正
          setSyslogConfig("Faile form-id");
          break;
         }
       
         // フォームファイル名作成
         String strFormFileName = null;
         if(strFormId != null)
         {
          // 帳票フォームファイル設定
          strFormFileName = sp.getProcId() + strFormId;// 例 AH0030010 + ID
         }
         return strFormFileName;
        }
       
        //---------- csv出力関連の処理 ---------------------------------------------------
       
        /** 
         * csv出力処理
         *
         * @param	structTarget	対象データ情報
         * @return	成功:true / エラー:false
         */
    	private boolean csvExport(AH0030010Struct structTarget) {
    		// 出力対象リスト情報取得
    		List listTarget = getOutList(structTarget);
    		if (listTarget == null) {
    			// リスト取得でエラー
    			return false;
    		}

    		// 処理成功フラグ初期化
    		boolean bSuccess = true;

    		// 調査表種類取得
    		int intKind = getSheetKind(structTarget);
    		switch (intKind) {
    		case SHEET_NORMAL_AND_ITEM: // 棚卸調査表－品目
    			csvExport4NormalAndItem(listTarget);
    			break;
    		case SHEET_NORMAL_AND_JOB: // 棚卸調査表－製番
    			csvExport4NormalAndJobOdr(listTarget);
    			break;
    		case SHEET_DEFECT_AND_ITEM: // 不良在庫調査表－品目
    			csvExport4DefectAndItem(listTarget);
    			break;
    		case SHEET_MINUS_AND_ITEM: // マイナス在庫調査表－品目
    			csvExport4MinusAndItem(listTarget);
    			break;
    		case SHEET_MINUS_AND_JOB: // マイナス在庫調査表－製番
    			csvExport4MinusAndJobOdr(listTarget);
    			break;
    		case SHEET_TRANS_AND_TRANS: // 積送在庫調査表－積送
    			csvExport4TransportAndTransport(listTarget);
    			break;
    		default:// 調査表種類不正
    			bSuccess = false;
    			break;
    		}
    		return bSuccess;
    	}
       
        /** 
         * csv出力処理（棚卸調査表－品目）
         *
         * @param data_list 対象データリスト
         * @return 異常なし true エラー false
         */
        private boolean csvExport4NormalAndItem(List data_list)
        {
         // CSV情報の作成
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD",
			"Expj.VEND_LOT_NO",
			"Expj.Cmt1118" ,
			"Expj.Cmt1119" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getEXTERNAL_LOT_NO();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getDEFECT_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv出力処理（棚卸調査表－製番）
         *
         * @param data_list 対象データリスト
         * @return 異常なし true エラー false
         */
        private boolean csvExport4NormalAndJobOdr(List data_list)
        {
         // CSV情報の作成
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.Cmt1118" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getJOB_ODR_CD();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv出力処理（不良在庫調査表－品目）
         *
         * @param data_list 対象データリスト
         * @return 異常なし true エラー false
         */
        private boolean csvExport4DefectAndItem(List data_list)
        {
         // CSV情報の作成
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD",
			"Expj.VEND_LOT_NO",
			"Expj.Cmt1119" ,
			"Expj.Cmt1120" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getEXTERNAL_LOT_NO();
          csvStr[cnt++] = info.getDEFECT_QTY();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv出力処理（マイナス在庫調査表－品目）
         *
         * @param data_list 対象データリスト
         * @return 異常なし true エラー false
         */
        private boolean csvExport4MinusAndItem(List data_list)
        {
         // CSV情報の作成
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.STOCK_LOT_CD",
			"Expj.VEND_LOT_NO",
			"Expj.Cmt1118" ,
			"Expj.Cmt1119" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getEXTERNAL_LOT_NO();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getDEFECT_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv出力処理（マイナス在庫調査表－製番）
         *
         * @param data_list 対象データリスト
         * @return 異常なし true エラー false
         */
        private boolean csvExport4MinusAndJobOdr(List data_list)
        {
         // CSV情報の作成
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.WH_CD" ,
			"Expj.WH_NAME" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.Cmt1118" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getPLANT_CD();
          csvStr[cnt++] = info.getPLANT_NAME();
          csvStr[cnt++] = info.getWH_CD();
          csvStr[cnt++] = info.getWH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getJOB_ODR_CD();
          csvStr[cnt++] = info.getSTOCK_ON_HAND_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
        }
       
        /** 
         * csv出力処理（積送在庫調査表－積送）
         *
         * @param data_list 対象データリスト
         * @return 異常なし true エラー false
         */
        private boolean csvExport4TransportAndTransport(List data_list)
        {
         // CSV情報の作成
         String title[] = {
         	"Expj.INV_DATE" ,
			"Expj.PLANT_CD" ,
			"Expj.PLANT_NAME" ,
			"Expj.ISSUE_WH_CD" ,
			"Expj.WH_NAME_3" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.STOCK_LOT_CD",
			"Expj.RCV_PLANT_CD" ,
			"Expj.Cmt1097" ,
			"Expj.RCV_WH_CD" ,
			"Expj.Cmt1098" ,
			"Expj.Cmt1091" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.ABC_TYP" ,
			"Expj.Cmt1044" 
         };
       
         _csvList.add(title);
         for(int i=0; i < data_list.size(); i++)
         {
          InvInformation info = (InvInformation)data_list.get(i);
       
          String csvStr [] = new String[title.length];
          int cnt = 0;
          csvStr[cnt++] = info.getINV_DATE();
          csvStr[cnt++] = info.getISSUE_PLANT_CD();
          csvStr[cnt++] = info.getISSUE_PLANT_NAME();
          csvStr[cnt++] = info.getISSUE_WH_CD();
          csvStr[cnt++] = info.getISSUE_WH_NAME();
          csvStr[cnt++] = info.getITEM_CD();
          csvStr[cnt++] = info.getITEM_NAME();
          csvStr[cnt++] = info.getJOB_ODR_CD();
          csvStr[cnt++] = info.getLOT_NO_P();
          csvStr[cnt++] = info.getRCV_PLANT_CD();
          csvStr[cnt++] = info.getRCV_PLANT_NAME();
          csvStr[cnt++] = info.getRCV_WH_CD();
          csvStr[cnt++] = info.getRCV_WH_NAME();
          csvStr[cnt++] = info.getw_TRANSPORT_QTY();
          csvStr[cnt++] = info.getSTOCK_UNIT();
          csvStr[cnt++] = getABC_TYP_name(info.getABC_TYP());
          csvStr[cnt++] = info.getSYSTEM_DATETIME();
          _csvList.add(csvStr);
         }
         return true;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                List key = new ArrayList();
              
                // 読込処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0030010Struct copy_struct = new AH0030010Struct();
                copy_struct.copy(struct);
              
                // 検索状態を初期化
                setReadStatus(INITIAL);
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 処理に関連するパラメータを設定
                 struct.setPLANT_CD(getsysPLANT_CD());
                 struct.setw_INV_status("");
              
                 // 読込実行
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mT_INV_CTRL.read(conn, struct);
              
                 // レコード件数チェック
                 if(temp_list.size() <= 0)
                 {
                  // エラーフラグ設定
                  bError = true;
              
                  // レコード件数が０(ゼロ)件の場合
                  setErrorMessage("AH00021");
                  setErrorParameter("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                  setErrorParameter("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // 読込データ取得
                  AH0030010Struct temp_struct = (AH0030010Struct)temp_list.get(0);
              
                  // 棚卸状態区分が2（棚卸更新済）かどうかのチェック
                  if(checkINV_STS_TYP_equal2(temp_struct) != true)
                  {
                   // エラーフラグ設定
                   bError = true;
                  }
              
                  // エラーがない場合
                  if(bError != true)
                  {
                   // 表示用structへ読込データを設定
                   struct.copy(temp_struct);
              
                   // 棚卸状況文字列取得設定処理
                   String strInvStatus = _invAccessor.getInvStatus(
                    conn,
                    struct.getREGULAR_INV_FLG(),
                    struct.getCYCLE_INV_FLG(),
                    struct.getTEMP_INV_FLG(),
                    struct.getINV_STS_TYP(),
                    CoreTools.getLocale(struct.getsUser_ID()));
                   struct.setw_INV_status(strInvStatus);
              
                   // 画面上の設定値を再設定
                   struct.setINV_DATE(copy_struct.getINV_DATE());
                   struct.seth_sheet(copy_struct.geth_sheet());
                   struct.seth_stock(copy_struct.geth_stock());
                   struct.seth_wh(copy_struct.geth_wh());
                   struct.seth_item(copy_struct.geth_item());
                   struct.setITEM_CD(copy_struct.getITEM_CD());
                   struct.seth_lot(copy_struct.geth_lot());
                   struct.setWH_CD(copy_struct.getWH_CD());
                   struct.setLOT_NO(copy_struct.getLOT_NO());
              
                   // 読込処理成功フラグ設定
                   bSuccess = true;
                  }
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                  // 検索状態を「読込成功」に設定
                  setReadStatus(NORMAL);
              
                  // 読込成功時のキー情報を退避
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcsv_export() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");
			//{{user_implement_dev:<controlcsv_export>
                //---------------------------------------------------------------------
		// CsvWriterを生成
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		setSyslogConfig("csv-file name [" + CsvWriter.getFileName(getsysUSER_CD()) + "]");

		// DB更新中フラグ初期化
		boolean bDBUpdate = false;

		// 更新処理成功フラグ初期化
		boolean bSuccess = false;

		// 処理直前のstruct情報を退避
		AH0030010Struct copy_struct = new AH0030010Struct();
		copy_struct.copy(struct);

		// ＣＳＶデータ格納用リストを初期化
		_csvList.clear();

		try {
			// トランザクション開始
			conn.beginTransWeb();

			// DB更新中フラグON
			bDBUpdate = true;

			// エラーフラグ初期化
			boolean bError = false;

			// 処理に関連するパラメータを設定
			struct.setPLANT_CD(getsysPLANT_CD());

			// 棚卸制御テーブルの該当レコードを更新
			if (updateT_INV_CTRL(struct) == true) {
				// ＣＳＶ出力処理
				if (csvExport(struct) == true) {
					// コミット
					conn.commit();

					// DB更新中フラグOFF
					bDBUpdate = false;

					String strFilePath = null;
					try {
						// CSV作成
						setSyslogConfig("_csvList.size [" + _csvList.size() + "]");
						csvWriter.write(_csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
						strFilePath = csvWriter.getFilePath();
						setSyslogConfig("Completion of CSV-data output.");
					} catch (Exception e) {
						// CSV用データ作成時にエラーが発生しました。
						ExpjMessage emsg = setExceptionMessage("ZZ01107");
						ExpjException ee = new ExpjException(e, emsg);

						String strDbName = getTableName4Log(struct);
						setExceptionParameter(strDbName + ".PLANT_CD:" + struct.getPLANT_CD());								
						setExceptionParameter(strDbName + ".WH_CD:" + struct.getWH_CD());								
						throw ee;
					}
					// 再読込処理
					controlselect();

					// 出力ファイルパス設定
					struct.setDOWNLOAD_FILE(strFilePath);

					// 更新処理成功フラグ設定
					bSuccess = true;
				}
			}

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
			if (bDBUpdate == true) {
				// ロールバック
				conn.rollback();
			}

			// ＣＳＶ出力処理で失敗した場合
			if (bSuccess != true) {
				// 処理直前の状態に戻す処理
				struct.copy(copy_struct);
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlcsv_export>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlcsv_export");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                // struct初期化
                struct.initializeParent();
              
                // 検索状態を初期化
                setReadStatus(INITIAL);
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AH0030010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
                //---------------------------------------------------------------------
		// DB更新中フラグ初期化
		boolean bDBUpdate = false;

		// 更新処理成功フラグ初期化
		boolean bSuccess = false;

		// 処理直前のstruct情報を退避
		AH0030010Struct copy_struct = new AH0030010Struct();
		copy_struct.copy(struct);

		try {
			// エラーフラグ初期化
			boolean bError = false;

			// トランザクション開始
			conn.beginTransWeb();

			// DB更新中フラグON
			bDBUpdate = true;

			// 処理に関連するパラメータを設定
			struct.setPLANT_CD(getsysPLANT_CD());

			// 棚卸制御テーブルの該当レコードを更新
			if (updateT_INV_CTRL(struct)) {
				// 帳票出力処理
				struct.setDOWNLOAD_FILE(null); // ダウンロードファイル名クリア
				String printIdFrm = getFormFileName(struct); // 帳票IDを指定してください
				String printIdVrq = getFormFileName(struct); // 帳票IDを指定してください
				// 文字型から数値型へ変換
				int intRegularInvFlg = Integer.parseInt(struct.getREGULAR_INV_FLG());
				int intCycleInvFlg = Integer.parseInt(struct.getCYCLE_INV_FLG());
				int intTempInvFlg = Integer.parseInt(struct.getTEMP_INV_FLG());

				if ((intRegularInvFlg == 1) && (intCycleInvFlg == 0) && (intTempInvFlg == 0)) {						
					// 定期棚卸のみの場合
					printIdVrq = printIdVrq + 1;

				} else if ((intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 0)) {						
					// 循環棚卸のみの場合
					printIdVrq = printIdVrq + 2;

				} else if ((intRegularInvFlg == 0) && (intCycleInvFlg == 0) && (intTempInvFlg == 1)) {						
					// 臨時棚卸のみの場合
					printIdVrq = printIdVrq + 3;
					
				} else if ((intRegularInvFlg == 0) && (intCycleInvFlg == 1) && (intTempInvFlg == 1)) {						
					// 循環、臨時棚卸の場合
					printIdVrq = printIdVrq + 4;

				}
				// PDF作成開始
				ret = svf.VrInit(printIdFrm, printIdVrq); 
				// pdfフルパスファイル名
				pdfFilePath = svf.getPdfFilePath(); 
				// pdfファイル名（Web用）
				pdfFileName = svf.getPdfFileName(); 
				
				/* クエリーファイルの指定 */
				if (dbKIND != null && !dbKIND.equals("")) {
					ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
							
				} else {
					ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);							
				}

				/* クエリー抽出条件の指定 */
				// 保管区コード
				String strWH_CD = struct.getWH_CD();
				if (!"1".equals(struct.geth_wh())) {
					// 保管区指定が選択されていない場合は、%を設定する
					strWH_CD = "%";
				}
				// 保管区コード
				if (strWH_CD == null || "".equals(strWH_CD)) {
					ret = svf.VrCondition("[X|WH_CD]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|WH_CD]=" + strWH_CD, 4);
				}
				// 品目番号
				String strITEM_CD = struct.getITEM_CD();
				if (!"1".equals(struct.geth_item())) {
					// 品目番号指定が選択されていない場合は、%を設定する
					strITEM_CD = "%";
				}
				// 品目番号
				if (strITEM_CD == null || "".equals(strITEM_CD)) {
					ret = svf.VrCondition("[X|ITEM_CD]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|ITEM_CD]=" + strITEM_CD, 4);
				}
				// 在庫ロット番号
				String strLOT_NO = struct.getLOT_NO();
				if (!"1".equals(struct.geth_lot())) {
					// 在庫ロット番号指定が選択されていない場合は、%を設定する
					strLOT_NO = "%";
				}
				// 在庫ロット番号
				if (strLOT_NO == null || "".equals(strLOT_NO)) {
					ret = svf.VrCondition("[X|LOT_NO]=" + "%", 4);
				} else {
					ret = svf.VrCondition("[X|LOT_NO]=" + strLOT_NO, 4);
				}
				// 工場コード
				if (struct.getPLANT_CD() == null || "".equals(struct.getPLANT_CD())) {						
					ret = svf.VrCondition("[X|SYS_PLANT_CD]=" + "ZZZ", 4);
					ret = svf.VrCondition("[X|PLANT_CD]=" + "ZZZ", 4);
				} else {
					ret = svf.VrCondition("[X|SYS_PLANT_CD]=" + struct.getPLANT_CD(), 4);							
					ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getPLANT_CD(), 4);
							
				}
				// 工場名
				if (getsysPLANT_NAME() == null || "".equals(getsysPLANT_NAME())) {
					ret = svf.VrCondition("[X|SYS_PLANT_NAME]=" + "#", 4);
					ret = svf.VrCondition("[X|PLANT_NAME_FLG]=" + "0", 4);
				} else {
					ret = svf.VrCondition("[X|SYS_PLANT_NAME]=" + getsysPLANT_NAME(), 4);							
					ret = svf.VrCondition("[X|PLANT_NAME_FLG]=" + "1", 4);
				}

				// 棚卸日
				ret = svf.VrCondition("[X|INV_DATE]=" + struct.getINV_DATE(), 4);
						
				/* クエリー実行 */
				ret = svf.VrReport();
				if (ret == -554) {
					// 対象データが存在しません。
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					return;
				}
				
				/* PDF作成終了 */
				ret = svf.VrQuit();
				// クライアント印刷の場合
				if ("0".equals(printType)) { 
					struct.setDOWNLOAD_FILE(getPdfFileName());
				} 
				// サーバ印刷の場合
				else if ("1".equals(printType)) {
					try {
						String acrobatPath = svf.getAcrobatPath();
						String acrobatOption1 = svf.getAcrobatOption1();
						String acrobatOption2 = svf.getAcrobatOption2();
						String pdfPrinter = svf.getPrinter();
						Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
						//Runtime.getRuntime().exec(svf.getExecuteOutput());
					} catch (IOException e) {
						// サーバ印刷失敗時のエラー処理を記述してください。
					}
				}

				// /////////////////////////////////////////////////////////////////////////////
				setSyslogConfig("Completion of PDF-data output.");
				// /////////////////////////////////////////////////////////////////////////////

				// コミット
				conn.commit();

				// DB更新中フラグOFF
				bDBUpdate = false;

				// 再読込処理
				controlselect();

				// 再読込処理で、DOWNLOAD_FILEの内容がクリアされてしまうので、
				// ここで再度設定しています
				if ("0".equals(printType)) { // クライアント印刷の場合
					struct.setDOWNLOAD_FILE(getPdfFileName());
				}

				// 処理成功フラグ設定
				bSuccess = true;

			} 

		} catch (SQLException e) {
			setSqlExceptionMsg(e);

		} finally {
			// DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
			if (bDBUpdate == true) {
				// ロールバック
				conn.rollback();
			}

			// 帳票出力処理で失敗した場合
			if (bSuccess != true) {
				// 処理直前の状態に戻す処理
				struct.copy(copy_struct);
			}
		}
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
		
        try {
	         lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
	         // コンボデータの取得
	         ComboBox controller = new ComboBox(conn, sysUSER_CD);
	         _comboAbcTyp = controller.getData("ABC_TYP");		// 棚卸区分
	      
	         // クリア処理
	         controlclear();
	      
	         // 棚卸アクセッサクラス準備
	         _invAccessor = new InvAccessor(getsysPLANT_CD(), getsysUSER_CD(), this.sp.getProcId());     
        }catch(SQLException e){        	
        	setSqlExceptionMsg(e);   
        	
        }catch(ComboException e){
	        // エラー処理を記述してください。
	        ExpjMessage emsg = new ExpjMessage("ZZ01106");
	        sysLog.severe(emsg, getsysUSER_CD());
	        ExpjException ee = new ExpjException(e, emsg);
	        throw ee;
      
        }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0030");
		logger.entering("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AH0030010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv_export") ) {
				controlcsv_export();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			if(lotCtrlFlg){
				struct.seth_SYS_LOT_CTRL_FLG("true");
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
			}
                  } catch(AlarmMessageException ame){
                 //ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 //throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AH0030010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0030010-E999","CSVの出力処理"));
			throw new FoundationException("AH0030010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0030010-E999","システム日付の取得処理"));
				throw new FoundationException("AH0030010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0030010-E999","コントロールのイベント処理"));
			throw new FoundationException("AH0030010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AH0030010Entity entity;
	protected AH0030010Struct struct;
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

		entity = new AH0030010Entity();
		struct = new AH0030010Struct();

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
	 * AH0030010クラスの標準コンストラクタ
	 */
	public AH0030010Control() throws BusinessProcessException, FoundationException
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
				AH0030010Struct key = (AH0030010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_sheet") && key.geth_sheet() != null) {
					msgKey.setKeyValue("h_sheet", key.geth_sheet());
				}
				if(msgKeyType.containsKeyColumn("h_stock") && key.geth_stock() != null) {
					msgKey.setKeyValue("h_stock", key.geth_stock());
				}
				if(msgKeyType.containsKeyColumn("h_wh") && key.geth_wh() != null) {
					msgKey.setKeyValue("h_wh", key.geth_wh());
				}
				if(msgKeyType.containsKeyColumn("w_INV_status") && key.getw_INV_status() != null) {
					msgKey.setKeyValue("w_INV_status", key.getw_INV_status());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet1") && key.getr1_sheet1() != null) {
					msgKey.setKeyValue("r1_sheet1", key.getr1_sheet1());
				}
				if(msgKeyType.containsKeyColumn("r2_stock1") && key.getr2_stock1() != null) {
					msgKey.setKeyValue("r2_stock1", key.getr2_stock1());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet2") && key.getr1_sheet2() != null) {
					msgKey.setKeyValue("r1_sheet2", key.getr1_sheet2());
				}
				if(msgKeyType.containsKeyColumn("r2_stock2") && key.getr2_stock2() != null) {
					msgKey.setKeyValue("r2_stock2", key.getr2_stock2());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet3") && key.getr1_sheet3() != null) {
					msgKey.setKeyValue("r1_sheet3", key.getr1_sheet3());
				}
				if(msgKeyType.containsKeyColumn("r1_sheet4") && key.getr1_sheet4() != null) {
					msgKey.setKeyValue("r1_sheet4", key.getr1_sheet4());
				}
				if(msgKeyType.containsKeyColumn("r3_wh1") && key.getr3_wh1() != null) {
					msgKey.setKeyValue("r3_wh1", key.getr3_wh1());
				}
				if(msgKeyType.containsKeyColumn("r3_wh2") && key.getr3_wh2() != null) {
					msgKey.setKeyValue("r3_wh2", key.getr3_wh2());
				}
				if(msgKeyType.containsKeyColumn("h_saveINV_DATE") && key.geth_saveINV_DATE() != null) {
					msgKey.setKeyValue("h_saveINV_DATE", key.geth_saveINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_lot") && key.geth_lot() != null) {
					msgKey.setKeyValue("h_lot", key.geth_lot());
				}
				if(msgKeyType.containsKeyColumn("h_item") && key.geth_item() != null) {
					msgKey.setKeyValue("h_item", key.geth_item());
				}
				if(msgKeyType.containsKeyColumn("r5_item_cd1") && key.getr5_item_cd1() != null) {
					msgKey.setKeyValue("r5_item_cd1", key.getr5_item_cd1());
				}
				if(msgKeyType.containsKeyColumn("r5_item_cd2") && key.getr5_item_cd2() != null) {
					msgKey.setKeyValue("r5_item_cd2", key.getr5_item_cd2());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("r4_lot_no1") && key.getr4_lot_no1() != null) {
					msgKey.setKeyValue("r4_lot_no1", key.getr4_lot_no1());
				}
				if(msgKeyType.containsKeyColumn("r4_lot_no2") && key.getr4_lot_no2() != null) {
					msgKey.setKeyValue("r4_lot_no2", key.getr4_lot_no2());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					AH0030010Struct key = new AH0030010Struct();
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_sheet")) {
						key.seth_sheet(msgKey.getKeyValue("h_sheet"));
					}
					if(msgKeyType.containsKeyColumn("h_stock")) {
						key.seth_stock(msgKey.getKeyValue("h_stock"));
					}
					if(msgKeyType.containsKeyColumn("h_wh")) {
						key.seth_wh(msgKey.getKeyValue("h_wh"));
					}
					if(msgKeyType.containsKeyColumn("w_INV_status")) {
						key.setw_INV_status(msgKey.getKeyValue("w_INV_status"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet1")) {
						key.setr1_sheet1(msgKey.getKeyValue("r1_sheet1"));
					}
					if(msgKeyType.containsKeyColumn("r2_stock1")) {
						key.setr2_stock1(msgKey.getKeyValue("r2_stock1"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet2")) {
						key.setr1_sheet2(msgKey.getKeyValue("r1_sheet2"));
					}
					if(msgKeyType.containsKeyColumn("r2_stock2")) {
						key.setr2_stock2(msgKey.getKeyValue("r2_stock2"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet3")) {
						key.setr1_sheet3(msgKey.getKeyValue("r1_sheet3"));
					}
					if(msgKeyType.containsKeyColumn("r1_sheet4")) {
						key.setr1_sheet4(msgKey.getKeyValue("r1_sheet4"));
					}
					if(msgKeyType.containsKeyColumn("r3_wh1")) {
						key.setr3_wh1(msgKey.getKeyValue("r3_wh1"));
					}
					if(msgKeyType.containsKeyColumn("r3_wh2")) {
						key.setr3_wh2(msgKey.getKeyValue("r3_wh2"));
					}
					if(msgKeyType.containsKeyColumn("h_saveINV_DATE")) {
						key.seth_saveINV_DATE(msgKey.getKeyValue("h_saveINV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_lot")) {
						key.seth_lot(msgKey.getKeyValue("h_lot"));
					}
					if(msgKeyType.containsKeyColumn("h_item")) {
						key.seth_item(msgKey.getKeyValue("h_item"));
					}
					if(msgKeyType.containsKeyColumn("r5_item_cd1")) {
						key.setr5_item_cd1(msgKey.getKeyValue("r5_item_cd1"));
					}
					if(msgKeyType.containsKeyColumn("r5_item_cd2")) {
						key.setr5_item_cd2(msgKey.getKeyValue("r5_item_cd2"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("r4_lot_no1")) {
						key.setr4_lot_no1(msgKey.getKeyValue("r4_lot_no1"));
					}
					if(msgKeyType.containsKeyColumn("r4_lot_no2")) {
						key.setr4_lot_no2(msgKey.getKeyValue("r4_lot_no2"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
