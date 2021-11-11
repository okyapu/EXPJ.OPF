/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AH0020/src/com/nec/jp/orteus/metamorBase/AH0020/AH0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AH0020;

import com.nec.jp.orteus.metamorBase.AH0020.*;
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
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AH0020010Control
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
        protected List list;											// 一覧部分の結果リストを画面に表示するためのリストインスタンス
       
        // デフォルトアクセサメソッド
        public List getList() { return this.list; }						// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
       //	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
        public AH0020010Struct getListvalue(int x) { return (AH0020010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AH0020010Struct getStruct() { return this.struct; }	// Structを返します。
        public AH0020010Struct createStruct() { return new AH0020010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AH0020010Struct)structname); }	// Structをセットします。
       //	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        //------------------------------------------------------------------------
       
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
       
        //------------------------------------------------------------------------
       
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
       
        /** 所要量計算対象フラグ */
        private ComboStruct _MRP_FLG = new ComboStruct();
       
        /**
         * 所要量計算対象フラグ内容取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getMRP_FLG_name(String typ)
        {
         return (getTypName(_MRP_FLG, typ));
        }
       
        /** 倉庫区分 */
        private ComboStruct _WH_TYP = new ComboStruct();
       
        /**
         * 倉庫区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getWH_TYP_name(String typ)
        {
         return (getTypName(_WH_TYP, typ));
        }
       
        /** 品目手配区分 */
        private ComboStruct _MRP_ODR_TYP = new ComboStruct();
       
        /**
         * 品目手配区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getMRP_ODR_TYP_name(String typ)
        {
         return (getTypName(_MRP_ODR_TYP, typ));
        }
       
        /** 内外作区分 */
        private ComboStruct _OUTSIDE_TYP = new ComboStruct();
       
        /**
         * 内外作区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getOUTSIDE_TYP_name(String typ)
        {
         return (getTypName(_OUTSIDE_TYP, typ));
        }
       
        /** 棚卸区分 */
        private ComboStruct _ABC_TYP = new ComboStruct();
       
        /**
         * 棚卸区分名取得
         *
         * @param	String 区分コード
         * @return	String 区分名称(該当するデータがなかった場合は区分コードを返す)
         */
        private String getABC_TYP_name(String typ)
        {
         return (getTypName(_ABC_TYP, typ));
        }
       
        /** 画面用「棚卸区分」コンボボックスデータ格納用 */
        private ComboStruct _comboAbcTyp = new ComboStruct();
       
        /**
         * 画面用「棚卸区分」コンボボックスリストデータ設定
         *
         * @param	comboAbcTyp 棚卸区分コンボリストデータ
         * @return	なし
         */
        private void makeAbcTypComboData(ComboStruct comboAbcTyp)
        {
         _comboAbcTyp = new ComboStruct();
         _comboAbcTyp.addData("", "");// １件目に空白データ設定
         for(int i = 0; i < comboAbcTyp.size(); i++)
         {
          String[] str = comboAbcTyp.getData(i);
          if("9".equals(str[0]) == true)
          {
           // 棚卸区分が9のデータは追加しない
           continue;
          }
          _comboAbcTyp.addData(str[0], str[1]);
         }
        }
       
        //------------------------------------------------------------------
       
        /**
         * 表示最大行数制限処理
         *
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
       
        /** サブ1画面パラメータ（最大表示行数）取得アクセスキー */
        private final int DISPLAY_CD_SUB1 = 20;
       
        /** サブ2画面パラメータ（最大表示行数）取得アクセスキー */
        private final int DISPLAY_CD_SUB2 = 30;
       
        /** 親画面struct情報一時退避用 */
        private AH0020010Struct _save_struct = new AH0020010Struct();
       
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
        }
       
        /** 子画面struct情報一時退避用 */
        private AH0020010Struct _structSaveSub = new AH0020010Struct();
       
        /**
         * 子画面のstruct情報を退避
         */
        private void saveSubStruct()
        {
         _structSaveSub.copy(struct);
        }
       
        /**
         * 子画面のstruct情報を復帰
         */
        private void loadSubStruct()
        {
         struct.copy(_structSaveSub);
        }
       
        /**
         * 業務運用日取得
         *
         * @param	String 工場コード
         * @return	String 成功 日付文字列(YYYY/MM/DD形式) 失敗 null
         */
        private String getBUSINESS_OPR_DATE(String plant_cd) throws FoundationException, SQLException
        {
         String Message = "";
         
         AH0020010Struct search_struct = new AH0020010Struct();
         String strBUSINESS_OPR_DATE = null;
       
         // 読込条件設定
         search_struct.setPLANT_CD(plant_cd);
       
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
         AH0020010Struct read_struct = (AH0020010Struct)temp_list.get(0);
         strBUSINESS_OPR_DATE = read_struct.getBUSINESS_OPR_DATE();
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
         * 対象データが既に更新されているかどうかの判定処理
         * （注意）for update nowaitが発動するので、この関数を呼ぶ前にトランザクション開始処理を行っておく必要あり
         *
         * @param target_struct 対象データ情報
         * @return 異常なし 最新の読込情報 エラー null
         */
        private AH0020010Struct checkTargetData(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 読込情報格納用変数宣言
         AH0020010Struct new_struct = new AH0020010Struct();
       
         // 処理対象データの存在チェック
         List temp_list = entity.mT_INV_CTRL4Update.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          // 更新対象データが存在しなかった場合
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorMessage("ZZ01101", listMessage);
          return null;
         }
         else
         {
          // レコードが更新されていないかチェック
          new_struct = (AH0020010Struct)temp_list.get(0);
          if(new_struct.getMODIFY_COUNT().equals(target_struct.getMODIFY_COUNT()) != true)
          {
           // 既にレコードが更新
           listMessage.clear();
           listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
           listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
           setErrorMessage("ZZ01105", listMessage);
           return null;
          }
         }
         return new_struct;
        }
       
        /** 
         * 対象データ再読込処理
         *
         * @param target_struct 対象データ情報
         * @return 成功 最新読込情報 エラー null
         */
        private AH0020010Struct readTargetData(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 読込情報格納用変数宣言
         AH0020010Struct new_struct = new AH0020010Struct();
       
         // 処理対象データの存在チェック
         List temp_list = entity.mT_INV_CTRL.read(conn, target_struct);
         if(temp_list.size() <= 0)
         {
          // 処理対象データが存在しなかった場合
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          setErrorMessage("AH00021", listMessage);
          return null;
         }
         else
         {
          // 読込情報取得
          new_struct = (AH0020010Struct)temp_list.get(0);
         }
         return new_struct;
        }
       
        /** 
         * 棚卸状態区分が0（実施前）でないかどうかの判定処理
         *
         * @param target_struct 対象データ情報
         * @return 異常なし true エラー false
         */
        private boolean checkINV_STS_TYP_notequalZERO(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         List listMessage = new ArrayList();
         
         // 結果フラグ初期化
         boolean bResult = true;
       
         // 棚卸状態区分が0（実施前）かどうかのチェック
         if("0".equals(target_struct.geth_INV_STS_TYP()) != true)
         {
          listMessage.add("T_INV_CTRL.INV_DATE:" + target_struct.getINV_DATE());
          listMessage.add("T_INV_CTRL.PLANT_CD:" + target_struct.getPLANT_CD());
          listMessage.add("T_INV_CTRL.INV_STS_TYP:" + target_struct.geth_INV_STS_TYP());
          setErrorMessage("AH00008", listMessage);
          bResult = false;
         }
         return bResult;
        }
       
        /** 
         * サブ画面用棚卸状態区分チェック処理
         *
         * @param target_struct 対象データ情報
         * @return 異常なし true エラー false
         */
        private boolean checkINV_STS_TYP(AH0020010Struct target_struct) throws FoundationException, SQLException
        {
         // 結果フラグ初期化
         boolean bResult = true;
       
         // 親データ再読込
         AH0020010Struct new_struct = readTargetData(struct);
         if(new_struct == null)
         {
          bResult = false;
         }
         else
         {
          // 棚卸状態区分が0（実施前）でないかどうかのチェック
          if(checkINV_STS_TYP_notequalZERO(new_struct) != true)
          {
           bResult = false;
          }
         }
         return bResult;
        }
       
       
        //---------- CSV取込結果メッセージ制御関連 -------------------------
       
        /** CSV取込結果メッセージ情報格納用リスト */
        ArrayList _listResultMessageCsv = new ArrayList(0);
       
        /**
         * CSV取込結果情報追加
         *
         * @return	なし
         */
        public void csvResultListAdd(String strMessage, int intRow, int intCol)
        {
            // 多言語項目取得対応
         String locale = CoreTools.getLocale(sysUSER_CD);
           	// メッセージ情報格納用
         AH0020010Struct structTemp = new AH0020010Struct();
       
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
       
        /** 保管区ＣＳＶ取込データ識別フラグ定数 */
        public final static String FLG_INV_TARGET_WH = "0";
        /** 品目ＣＳＶ取込データ識別フラグ定数 */
        public final static String FLG_INV_TARGET_ITEM = "1";
       
        /** ＣＳＶ取込データ識別フラグ */
        private String _strInvTargetFlg;
        /**
         *  ＣＳＶ取込データ識別フラグ設定
         *
         * @param	strInvTargetFlg
         * @return	なし
         */
        public void setInvTargetFlg(String strInvTargetFlg)
        {
         _strInvTargetFlg = strInvTargetFlg;
        }
        /**
         *  ＣＳＶ取込データ識別フラグ取得
         *
         * @return	ＣＳＶ取込データ識別フラグ
         */
        public String getInvTargetFlg()
        {
         return _strInvTargetFlg;
        }
       
       
        /** ＣＳＶ項目番号定義（保管区指定用） */
        private final int CSV_COLNO_WH_CD4WH = 0;
        /** ＣＳＶ取込データ必要項目数（保管区指定用 */
        private final int CSV_NECESSARY_COLUMN4WH = (CSV_COLNO_WH_CD4WH+1);
       
        /** ＣＳＶ項目番号定義（品目指定用） */
        private final int CSV_COLNO_ITEM_CD4ITEM = 0;
        /** ＣＳＶ取込データ必要項目数（品目指定用） */
        private final int CSV_NECESSARY_COLUMN4ITEM = (CSV_COLNO_ITEM_CD4ITEM+1);
       
       
        /**
         * ＣＳＶデータ取得とリストデータ化
         *
         * @return	CSVデータリスト
         */
        private List readCsvData() throws FoundationException, ExpjException
        {
       
         // ログ出力情報格納用
         String logMessage = "";
         
         String [] strsCsvData = null;
         List listCsv = null;
         try {
       
          // ＣＳＶデータのアップロード
          strsCsvData = (String [])csvReader.lineRead();
          if(null != strsCsvData)
          {
           logMessage = "strsCsvData.length:" + strsCsvData.length;
           setSyslogConfig(logMessage);
       
           // CSVデータ最大項目数準備
           int intMaxColNum;
           if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
           {
            intMaxColNum = CSV_NECESSARY_COLUMN4WH;
           }
           else
           {
            intMaxColNum = CSV_NECESSARY_COLUMN4ITEM;
           }
       
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
            AH0020010Struct structCsv = new AH0020010Struct();
            Vector v = csvReader.importCSVLine(strsCsvData[i]);
            if(null != v)
            {
             // 項目数チェック
             int intColNum = v.size();
             if(intMaxColNum <= intColNum)
             {
              // 処理に関連するパラメータを設定
              structCsv.setPLANT_CD(getsysPLANT_CD());
              structCsv.setINV_DATE(_save_struct.getINV_DATE());
       
              // ＣＳＶの項目をリストデータ化
              if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
              {
               // 保管区指定
               structCsv.setWH_CD((String) v.get(0));
              }
              else
              {
               // 品目指定
               structCsv.setITEM_CD((String) v.get(0));
              }
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
             logMessage = "csvReader.Vector was Failed... line:" + strsCsvData[i];
             setSyslogConfig(logMessage);
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
       
         } catch( ExpjException ee ) {
          throw ee;
          
         } catch( FoundationException fe ) {
          // CsvReaderでエラーが発生しました。
          ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
          msgStruct.addError( emsg );
          sysLog.warning(emsg, getsysUSER_CD());
          listCsv = null;
          
          // 取込失敗
          emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(fe, emsg);
          throw ee;
         
         } catch(Exception e){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
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
        private boolean checkCsvData(List listCsv) throws FoundationException, ExpjException
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
       
          AH0020010Struct structCsv;
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           ExpjMessage emsg = new ExpjMessage();
           
           // CSV情報取得
           structCsv = (AH0020010Struct)listCsv.get(i);
       
           // 項目数不足エラー行はチェックしない
           if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true)
           {
            // CSVデータ最大項目数準備
            int intMaxColNum;
            if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
            {
             intMaxColNum = CSV_NECESSARY_COLUMN4WH;
            }
            else
            {
             intMaxColNum = CSV_NECESSARY_COLUMN4ITEM;
            }
            // 項目数不足エラー
            emsg = new ExpjMessage( "AH00044", ""+intMaxColNum );
            csvResultListAdd(emsg.getMessage(locale) , i , Integer.parseInt(structCsv.getw_COLUMN_FLG()));
            sysLog.warning(emsg, getsysUSER_CD());
            continue;
           }
       
           ////////////////////////////////////////////////////////////////////////////////////
           // 個別チェック処理開始
           ////////////////////////////////////////////////////////////////////////////////////
           boolean bError = false;
           if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
           {
            // ---------- 保管区指定チェック開始 ----------
            // 保管区チェック
            if(structCsv.getWH_CD() == null || ("").equals(structCsv.getWH_CD()) == true)
            {
             // 保管区がnull
             emsg = new ExpjMessage( "AH00014" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD4WH);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "CSV.WH_CD:" + structCsv.getWH_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
             // 保管区読込み
             listRead = entity.mM_WH.read(conn, structCsv);
             if(listRead.size() <= 0)
             {
              // 保管区が存在しない
              emsg = new ExpjMessage( "AH00019" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD4WH);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_WH.WH_CD:" + structCsv.getWH_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             else
             {
              AH0020010Struct readStructWh = new AH0020010Struct();
              readStructWh = (AH0020010Struct)listRead.get(0);
              if(getsysPLANT_CD().equals(readStructWh.getPLANT_CD()) != true)
              {
               // 保管区の工場コードがログインユーザの工場でない
               emsg = new ExpjMessage( "AH00020" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_WH_CD4WH);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "M_WH.PLANT_CD:" + readStructWh.getPLANT_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             }
            }
            // ---------- 保管区指定チェック終了 ----------
           }
           else
           {
            // ---------- 品目指定チェック開始 ----------
            // 品目番号チェック
            if(structCsv.getITEM_CD() == null || ("").equals(structCsv.getITEM_CD()) == true)
            {
             // 品目番号がnull
             emsg = new ExpjMessage( "AH00001" );
             csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
             sysLog.warning(emsg, getsysUSER_CD());
             logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
             emsg = new ExpjMessage( "ZZ01006", logMessage );
             sysLog.warning(emsg, getsysUSER_CD());
             bError = true;
            }
            else
            {
             // 品目読込み
             listRead = entity.mM_ITEM.read(conn, structCsv);
             if(listRead.size() <= 0)
             {
              // 品目が存在しない
              emsg = new ExpjMessage( "AH00002" );
              csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
              sysLog.warning(emsg, getsysUSER_CD());
              logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
              emsg = new ExpjMessage( "ZZ01006", logMessage );
              sysLog.warning(emsg, getsysUSER_CD());
              bError = true;
             }
             else
             {
              AH0020010Struct readStructItem = new AH0020010Struct();
              readStructItem = (AH0020010Struct)listRead.get(0);
              structCsv.setUNIT_QTY_TYP(readStructItem.getUNIT_QTY_TYP());
              if("8".equals(readStructItem.getMRP_ODR_TYP()) == true)
              {
               // 指定された品目が擬似品目
               emsg = new ExpjMessage( "AH00028" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
              // 品目の棚卸区分が9（棚卸しない）かどうかのチェック
              if("9".equals(readStructItem.getABC_TYP()) == true)
              {
               // 指定された品目の棚卸区分が9棚卸しない）
               emsg = new ExpjMessage( "AH00016" );
               csvResultListAdd(emsg.getMessage(locale) , i , CSV_COLNO_ITEM_CD4ITEM);
               sysLog.warning(emsg, getsysUSER_CD());
               logMessage = "M_ITEM.ITEM_CD:" + structCsv.getITEM_CD();
               emsg = new ExpjMessage( "ZZ01006", logMessage );
               sysLog.warning(emsg, getsysUSER_CD());
               bError = true;
              }
             }
            }
            // ---------- 品目指定チェック終了 ----------
       
           }// if()
       
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
           ExpjMessage emsg = new ExpjMessage( "AH00041",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
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
        private boolean csvData2Db(List listCsv) throws FoundationException, ExpjException
        {
       
         // ログ出力情報格納用
         String logMessage = "";
         
         boolean bSuccess = false;	// 処理成功フラグ初期化
         boolean bDBUpdate = false;	// DB更新中フラグ初期化
         int intCsvDataCount = 0;	// 対象データ件数
       
         // 処理直前のstruct情報を退避
         AH0020010Struct structCopy = new AH0020010Struct();
         structCopy.copy(struct);
         try
         {
          // トランザクション開始
          conn.beginTransWeb();
       
          // DB更新中フラグON
          bDBUpdate = true;
       
          // 棚卸条件保管区指定、または、棚卸条件品目指定テーブル内の該当レコードを削除
          if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
          {
           // 保管区指定
           struct.setWH_CD("%");
           entity.mT_INV_TARGET_WH.delete(conn, struct);
          }
          else
          {
           // 品目指定
           struct.setITEM_CD("%");
           entity.mT_INV_TARGET_ITEM.delete(conn, struct);
          }
       
          // データ数分処理を繰り返す
          intCsvDataCount = listCsv.size();
          for(int i = 0; i < intCsvDataCount; i++)
          {
           // CSV情報取得
           struct.copy((AH0020010Struct)listCsv.get(i));
       
           List t_inv_target_list = null;
           // 棚卸条件保管区指定、または、棚卸条件品目指定テーブルへレコード追加
           if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
           {
            logMessage = "T_INV_TARGET_WH.PLANT_CD:" +  struct.getPLANT_CD()
               + ", T_INV_TARGET_WH.WH_CD:" +  struct.getWH_CD();
            
            // 保管区指定データの存在チェック
            t_inv_target_list = entity.mT_INV_TARGET_WH_CHK.read(conn, struct);
            
            if(t_inv_target_list == null || t_inv_target_list.size() <= 0){
            	//保管区指定データの登録
                entity.mT_INV_TARGET_WH.create(conn, struct);
            }
           }
           else
           {
            logMessage = "T_INV_TARGET_ITEM.PLANT_CD:" +  struct.getPLANT_CD()
               + ", T_INV_TARGET_ITEM.ITEM_CD:" +  struct.getITEM_CD();
            
            // 品目指定データの存在チェック
            t_inv_target_list = entity.mT_INV_TARGET_ITEM_CHK.read(conn, struct);
            
            if(t_inv_target_list == null || t_inv_target_list.size() <= 0){ 
            	//品目指定データの登録
            	 entity.mT_INV_TARGET_ITEM.create(conn, struct);
            }
           }
          } // for()
       
          // コミット
          conn.commit();
       
          // DB更新中フラグOFF
          bDBUpdate = false;
       
          // 処理成功フラグ設定
          bSuccess = true;
       
         } catch(SQLException e) {
          ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
          sysLog.severe(emsg, getsysUSER_CD());
          setSqlExceptionMsg(e);
       
         } finally {
          // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
          if(bDBUpdate == true)
          {
           // ロールバック
           conn.rollback();
           logMessage = "Control：csvData2Db - rollback!! ";
           setSyslogConfig(logMessage);
       
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
       
          // 処理直前のstruct情報復帰
          setInvTarget2RadioValue(getInvTargetFlg());
         }
         return bSuccess;
        }
       
        /**
         * 保管区指定、品目指定ラジオボタン選択値設定
         * @param	flag	CSV取込種類識別フラグ（保管区指定：FLG_INV_TARGET_WH 品目指定識別フラグ：FLG_INV_TARGET_ITEM）
         */
        private void setInvTarget2RadioValue(String flag)
        {
         if(FLG_INV_TARGET_WH.equals(flag) == true)
         {
          // 保管区指定ON、品目指定OFF
          struct.setr1_inv_target("true");
          struct.setr2_inv_target(null);
         }
         else
         {
          // 保管区指定OFF、品目指定ON
          struct.setr1_inv_target(null);
          struct.setr2_inv_target("true");
         }
        }
       
         
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
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.info(emsg, getsysUSER_CD());
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
         
         
         
        //------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
                 
                // ログ出力情報格納用
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // 読込処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
              
                // 検索状態を初期化
                setReadStatus(INITIAL);
                try {
              
                 // struct初期化
                 struct.initializeParent();
                 // 処理に関連するパラメータを設定
                 struct.setPLANT_CD(getsysPLANT_CD());
                 struct.setINV_DATE(copy_struct.getINV_DATE());
              
                 // 読込実行
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mT_INV_CTRL.read(conn, struct);
              
                 // レコード件数チェック
                 if(temp_list.size() <= 0)
                 {
                  // レコード件数が０(ゼロ)件の場合
                  listMessage.add("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                  setErrorMessage("ZZ06001", listMessage);
                 }
                 else
                 {
                  // 読込データ取得
                  AH0020010Struct temp_struct = (AH0020010Struct)temp_list.get(0);
              
                  // 表示用structへ読込データを設定
                  struct.copy(temp_struct);
              
                  // 棚卸状態区分名取得設定
                  struct.setw_INV_STS_TYP(getINV_STS_TYP_name(struct.geth_INV_STS_TYP()));
              
                  // 画面上の設定値を再設定
                  struct.setINV_DATE(copy_struct.getINV_DATE());
              
                  // 読込処理成功フラグ設定
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                  setReadStatus(NORMAL);
              
                  // 読込成功時のキー情報を退避
                  struct.seth_saveINV_DATE(struct.getINV_DATE());
                  struct.seth_saveINV_STS_TYP(struct.geth_INV_STS_TYP());
                  struct.seth_saveTEMP_INV_FLG(struct.geth_TEMP_INV_FLG());
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 保管区指定ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect_wh() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_wh");
			//{{user_implement_dev:<controlselect_wh>
                //---------------------------------------------------------------------
              
                // 親画面のstructを退避
                saveParentStruct();
              
                // サブ画面表示情報初期化
                controlclear_sub1();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_wh>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_wh");

		return;
	}

	/**
	 * 品目指定ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect_item() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_item");
			//{{user_implement_dev:<controlselect_item>
                //---------------------------------------------------------------------
              
                // 親画面のstructを退避
                saveParentStruct();
              
                // サブ画面表示情報初期化
                controlclear_sub2();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_item>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_item");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                //---------------------------------------------------------------------
              
                List listMessage = new ArrayList();
                
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
              
                // 登録処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 // 登録に必要な内部データを設定
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 棚卸日データ存在チェック
                 List temp_list = new ArrayList(0);
                 temp_list = entity.mT_INV_CTRL.read(conn, struct);
                 if(temp_list.size() > 0)
                 {
                  // すでに同データが存在した場合
                  listMessage.add("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                  setErrorMessage("ZZ01102", listMessage);
                 }
              
                 // 業務運用日取得
                 String strBUSINESS_OPR_DATE = getBUSINESS_OPR_DATE(struct.getPLANT_CD());
                 if(strBUSINESS_OPR_DATE != null)
                 {
                  // 棚卸日が業務運用日より過去になっていないかどうかのチェック
                  DateConverter dateConv = new DateConverter();
                  Date dateINV_DATE = dateConv.str2date(struct.getINV_DATE());
                  Date dateBUSINESS_OPR_DATE = dateConv.str2date(strBUSINESS_OPR_DATE);
                  if(dateINV_DATE.getTime() < dateBUSINESS_OPR_DATE.getTime())
                  {
                   listMessage.clear();
                   listMessage.add("T_INV_CTRL.INV_DATE:" + struct.getINV_DATE());
                   listMessage.add("T_INV_CTRL.PLANT_CD:" + struct.getPLANT_CD());
                   setErrorMessage("AH00006", listMessage);
                  }
                 }
              
                 // エラーなしの場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 登録実行
                  entity.mT_INV_CTRL.create(conn, struct);
              
                  // コミット
                  conn.commit();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
              
                  // 再読込処理
                  controlselect();
              
                  // 登録処理成功フラグ設定
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
                 }
              
                 // 登録処理で失敗した場合
                 if(bSuccess != true)
                 {
                  // 処理直前の状態に戻す処理
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //---------------------------------------------------------------------
              
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
              
                // 更新処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 // 更新対象データチェック
                 AH0020010Struct new_struct = new AH0020010Struct();
                 new_struct = checkTargetData(struct);
                 if(new_struct == null)
                 {
                  // エラーフラグ設定
                  bError = true;
                 }
                 else
                 {
                  // 棚卸状態区分が0（実施前）でないかどうかのチェック
                  if(checkINV_STS_TYP_notequalZERO(new_struct) != true)
                  {
                   // エラーフラグ設定
                   bError = true;
                  }
                 }
              
                 // エラーなしの場合
                 if(bError != true)
                 {
                  // 臨時棚卸がoffの場合
                  if("0".equals(struct.geth_TEMP_INV_FLG()) == true)
                  {
                   // 棚卸条件保管区指定テーブルの該当レコードを削除
                   struct.setWH_CD("%");
                   entity.mT_INV_TARGET_WH.delete(conn, struct);
              
                   // 棚卸条件品目指定テーブルの該当レコードを削除
                   struct.setITEM_CD("%");
                   entity.mT_INV_TARGET_ITEM.delete(conn, struct);
                  }
              
                  // 棚卸制御テーブルの該当レコードを更新
                  entity.mT_INV_CTRL.update(conn, struct);
              
                  // コミット
                  conn.commit();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
              
                  // 再読込処理
                  controlselect();
              
                  // 更新処理成功フラグ設定
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
                 }
              
                 // 更新処理で失敗した場合
                 if(bSuccess != true)
                 {
                  // 処理直前の状態に戻す処理
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                //---------------------------------------------------------------------
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
              
                // 削除処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 // 更新対象データチェック
                 checkTargetData(struct);
              
                 // エラーなしの場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 棚卸条件保管区指定テーブルの該当レコードを削除
                  struct.setWH_CD("%");
                  entity.mT_INV_TARGET_WH.delete(conn, struct);
              
                  // 棚卸条件品目指定テーブルの該当レコードを削除
                  struct.setITEM_CD("%");
                  entity.mT_INV_TARGET_ITEM.delete(conn, struct);
              
                  // 棚卸制御テーブルの該当レコードを削除
                  entity.mT_INV_CTRL.delete(conn, struct);
              
                  // コミット
                  conn.commit();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
              
                  // クリア処理
                  controlclear();
              
                  // 削除処理成功フラグ設定
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
                 }
              
                 // 削除処理で失敗した場合
                 if(bSuccess != true)
                 {
                  // 処理直前の状態に戻す処理
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
              
                // struct初期化
                struct.initializeParent();
              
                // モード設定
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");
			//{{user_implement_dev:<controlselect_sub1>
                //------------------------------------------------------------------
              
                List listMessage = new ArrayList();
              
                // 読込処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 検索状態を初期化
                setReadStatus(INITIAL);
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 読込条件準備
                 struct.setPLANT_CD(getsysPLANT_CD());
                 // 表示最大行数
                 ScreenParam sp = new ScreenParam(this.getClass());
                 int maxLine = sp.getMaxLine(conn,DISPLAY_CD_SUB1);
                 if(maxLine != 0) {
 					struct.setROW_COUNT(String.valueOf(maxLine));
 				} else {
 					struct.setROW_COUNT(null);
 				}
                 List list1 = entity.mT_INV_TARGET_WHCnt.read(conn, struct);
                 long rowCount = Long.parseLong(((AH0020010Struct)list1.get(0)).getl_COUNT());
                 // 表示リストサイズのチェック
                 if(rowCount== 0)
                 {
                  // エラーフラグ設定
                  bError = true;
                  setReadStatus(NOT_FOUND);
              
                  // レコード件数が０(ゼロ)件の場合
                  listMessage.add("T_INV_TARGET_WH.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_TARGET_WH.PLANT_CD:" + struct.getPLANT_CD());
                  listMessage.add("T_INV_TARGET_WH.WH_CD:" + struct.getw_WH_CD());
                  setErrorMessage("ZZ06001", listMessage);
                  if(list != null && list.size() > 0){
						list.clear();
					}
                  return;
                 }
              
                 // 表示最大行数制限処理
                 if(checkMaxDispLine(DISPLAY_CD_SUB1, rowCount) != true)
                 {
                  // エラーフラグ設定
                  bError = true;
                  setReadStatus(TOO_MANY);
                  if(list != null && list.size() > 0){
						list.clear();
                    }
                  return;
                 }
                 // 読込実行
                 List temp_list = entity.mT_INV_TARGET_WH.read(conn, struct);
                 
                 // 表示用データ加工
                 List disp_list = new ArrayList(0);
                 for(int i = 0; i < temp_list.size(); i++)
                 {
                  // 表示用データ取得
                  AH0020010Struct temp_struct = (AH0020010Struct)temp_list.get(i);
              
                  // 所要量計算対象フラグ内容取得設定
                  temp_struct.setw_MRP_FLG(getMRP_FLG_name(temp_struct.getMRP_FLG()));
              
                  // 倉庫区分名取得設定
                  temp_struct.setw_WH_TYP(getWH_TYP_name(temp_struct.getWH_TYP()));
              
                  // 一覧「対象」チェックボックスの初期状態設定
                  if( (temp_struct.getINV_WH_CD() != null) && ("".equals(temp_struct.getINV_WH_CD()) != true) )
                  {
                   temp_struct.setw_target("1");
                   temp_struct.setc_target("true");
                  }
                  else
                  {
                   temp_struct.setw_target("0");
                   temp_struct.setc_target("NULL");
                  }
                  // 表示対象データ設定
                  if( (struct.geth_disp_entry_wh() != null) && ("1".equals(struct.geth_disp_entry_wh()) == true) )
                  {
                   // 「登録済み保管区のみ表示する」で、登録済みデータの場合にデータ追加
                   if("1".equals(temp_struct.getw_target()) == true)
                   {
                    disp_list.add(temp_struct);
                   }
                  }
                  else
                  {
                   // 「登録済み保管区のみ表示する」にチェックがない場合は無条件にデータ追加
                   disp_list.add(temp_struct);
                  }
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // 表示用リストを更新
                  setList(disp_list);
              
                  // 読込処理成功フラグ設定
                  bSuccess = true;
                  setReadStatus(NORMAL);
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                 }
                 else
                 {
                  // エラーの場合、表示リストをクリア
                  list.clear();
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub1");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");
			//{{user_implement_dev:<controlupdate_sub1>
                //---------------------------------------------------------------------
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
              
                // 更新処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 // 更新情報準備
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 親データ読み直し後の棚卸状態区分が0（実施前）でないかどうかのチェック
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // エラーフラグ設定
                  bError = true;
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // 棚卸条件保管区指定テーブルの該当レコードを削除
                  if( (struct.getw_WH_CD() == null) || ("".equals(struct.getw_WH_CD()) == true) )
                  {
                   struct.setWH_CD("%");
                  }
                  else
                  {
                   struct.setWH_CD(struct.getw_WH_CD());
                  }
                  entity.mT_INV_TARGET_WH.delete(conn, struct);
              
                  for(int i = 0; i < getListsize(); i++)
                  {
                   // 一覧「対象」欄のチェックされているデータのみ追加
                   AH0020010Struct update_struct = (AH0020010Struct)getListvalue(i);
                   if( (update_struct.getw_target() != null) && ("1".equals(update_struct.getw_target()) == true) )
                   {
                    struct.setWH_CD(update_struct.getWH_CD());
                    entity.mT_INV_TARGET_WH.create(conn, struct);
                   }
                  }
              
                  // コミット
                  conn.commit();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
              
                  // 再読込処理
                  controlselect_sub1();
              
                  // 更新処理成功フラグ設定
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
                 }
              
                 // 更新処理で失敗した場合
                 if(bSuccess != true)
                 {
                  // 処理直前の状態に戻す処理
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub1");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub1");
			//{{user_implement_dev:<controlclear_sub1>
                //------------------------------------------------------------------
              
                // struct初期化
                struct.initializeSub1();
                struct.setINV_DATE(_save_struct.getINV_DATE());
              
                // list初期化
                list.clear();
              
                // モード設定
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
                //---------------------------------------------------------------------
              
                // 子画面に遷移する前の親画面のstructを復帰
                loadParentStruct();
              
                // 再読込処理
                controlselect();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub2");
			//{{user_implement_dev:<controlselect_sub2>
                //------------------------------------------------------------------
              
                List listMessage = new ArrayList();
              
                // 読込成功フラグ初期化
                boolean bSuccess = false;
              
                // 検索状態を初期化
                setReadStatus(INITIAL);
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 読込条件準備
                 struct.setPLANT_CD(getsysPLANT_CD());
                  
                 // 表示最大行数
                 ScreenParam sp = new ScreenParam(this.getClass());
                 int maxLine = sp.getMaxLine(conn,DISPLAY_CD_SUB2);
                 if(maxLine != 0) {
 					struct.setROW_COUNT(String.valueOf(maxLine));
 				} else {
 					struct.setROW_COUNT(null);
 				}
                 List list2 = entity.mT_INV_TARGET_ITEMCnt.read(conn, struct);
                 long rowCount = Long.parseLong(((AH0020010Struct)list2.get(0)).getl_COUNT());
                 // 表示リストサイズのチェック
                 if(rowCount== 0)
                 {
                  // エラーフラグ設定
                  bError = true;
                  setReadStatus(NOT_FOUND);
              
                  // レコード件数が０(ゼロ)件の場合
                  listMessage.add("T_INV_TARGET_ITEM.INV_DATE:" + struct.getINV_DATE());
                  listMessage.add("T_INV_TARGET_ITEM.PLANT_CD:" + struct.getPLANT_CD());
                  listMessage.add("T_INV_TARGET_ITEM.ITEM_CD:" + struct.getw_ITEM_CD());
                  setErrorMessage("ZZ06001", listMessage);
                  if(list != null && list.size() > 0){
						list.clear();
					}
                  return;
                 }
              
                 // 表示最大行数制限処理
                 if(checkMaxDispLine(DISPLAY_CD_SUB2, rowCount) != true)
                 {
                  // エラーフラグ設定
                  bError = true;
                  setReadStatus(TOO_MANY);
                  if(list != null && list.size() > 0){
						list.clear();
					}
                  return;
                 }
                 // 読込実行
                 List temp_list = entity.mT_INV_TARGET_ITEM.read(conn, struct);
              
                 // 表示用データ加工
                 List disp_list = new ArrayList(0);
                 for(int i = 0; i < temp_list.size(); i++)
                 {
                  // 表示用データ取得
                  AH0020010Struct temp_struct = (AH0020010Struct)temp_list.get(i);
              
                  // 品目手配区分名取得設定
                  temp_struct.setw_MRP_ODR_TYP(getMRP_ODR_TYP_name(temp_struct.getMRP_ODR_TYP()));
              
                  // 内外作区分名取得設定
                  temp_struct.setw_OUTSIDE_TYP(getOUTSIDE_TYP_name(temp_struct.getOUTSIDE_TYP()));
              
                  // 棚卸区分名取得設定
                  temp_struct.setw_ABC_TYP(getABC_TYP_name(temp_struct.getABC_TYP()));
              
                  // 一覧「対象」チェックボックスの初期状態設定
                  if( (temp_struct.getINV_ITEM_CD() != null) && ("".equals(temp_struct.getINV_ITEM_CD()) != true) )
                  {
                   temp_struct.setw_target("1");
                   temp_struct.setc_target("true");
                  }
                  else
                  {
                   temp_struct.setw_target("0");
                   temp_struct.setc_target("NULL");
                  }
              
                  // 表示対象データ設定
                  if( (struct.geth_disp_entry_item() != null) && ("1".equals(struct.geth_disp_entry_item()) == true) )
                  {
                   // 「登録済みの品目のみ表示する」で、登録済みデータの場合にデータ追加
                   if("1".equals(temp_struct.getw_target()) == true)
                   {
                    disp_list.add(temp_struct);
                   }
                  }
                  else
                  {
                   // 「登録済みの品目のみ表示する」にチェックがない場合は無条件にデータ追加
                   disp_list.add(temp_struct);
                  }
                 }
              
                
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // 表示用リストを更新
                  setList(disp_list);
              
                  // 読込処理成功フラグ設定
                  bSuccess = true;
                  setReadStatus(NORMAL);
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 if(bSuccess == true)
                 {
                 }
                 else
                 {
                  // エラーの場合、表示リストをクリア
                  list.clear();
                 }
                }
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselect_sub2");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub2");
			//{{user_implement_dev:<controlupdate_sub2>
                //---------------------------------------------------------------------
              
                // DB更新中フラグ初期化
                boolean bDBUpdate = false;
              
                // 更新処理成功フラグ初期化
                boolean bSuccess = false;
              
                // 処理直前のstruct情報を退避
                AH0020010Struct copy_struct = new AH0020010Struct();
                copy_struct.copy(struct);
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 // 更新情報準備
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 親データ読み直し後の棚卸状態区分が0（実施前）でないかどうかのチェック
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // エラーフラグ設定
                  bError = true;
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // 棚卸条件品目指定テーブルの該当レコードを削除
                  if( (struct.getw_ITEM_CD() == null) || ("".equals(struct.getw_ITEM_CD()) == true) )
                  {
                   struct.setITEM_CD("%");
                  }
                  else
                  {
                   struct.setITEM_CD(struct.getw_ITEM_CD());
                  }
                  entity.mT_INV_TARGET_ITEM.delete(conn, struct);
              
                  for(int i = 0; i < getListsize(); i++)
                  {
                   // 一覧「対象」欄のチェックされているデータのみ追加
                   AH0020010Struct update_struct = (AH0020010Struct)getListvalue(i);
                   if( (update_struct.getw_target() != null) && ("1".equals(update_struct.getw_target()) == true) )
                   {
                    struct.setITEM_CD(update_struct.getITEM_CD());
                    entity.mT_INV_TARGET_ITEM.create(conn, struct);
                   }
                  }
              
                  // コミット
                  conn.commit();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
              
                  // 再読込処理
                  controlselect_sub2();
              
                  // 更新処理成功フラグ設定
                  bSuccess = true;
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
                 }
              
                 // 更新処理で失敗した場合
                 if(bSuccess != true)
                 {
                  // 処理直前の状態に戻す処理
                  struct.copy(copy_struct);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate_sub2");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub2");
			//{{user_implement_dev:<controlclear_sub2>
                //------------------------------------------------------------------
              
                // struct初期化
                struct.initializeSub2();
                struct.setINV_DATE(_save_struct.getINV_DATE());
              
                // list初期化
                list.clear();
              
                // モード設定
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlclear_sub2");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");
			//{{user_implement_dev:<controlreturn_sub2>
                //---------------------------------------------------------------------
              
                // 子画面に遷移する前の親画面のstructを復帰
                loadParentStruct();
              
                // 再読込処理
                controlselect();
              
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub2>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub2");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub3() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub3");
			//{{user_implement_dev:<controlreturn_sub3>
                //---------------------------------------------------------------------
                // クリア処理
                if(FLG_INV_TARGET_WH.equals(getInvTargetFlg()) == true)
                {
                 // 保管区指定
                 controlclear_sub1();
                }
                else
                {
                 // 品目指定
                 controlclear_sub2();
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlreturn_sub3>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub3");

		return;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvImportWh() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportWh");
			//{{user_implement_dev:<controlCsvImportWh>
                //---------------------------------------------------------------------
              
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 読込条件準備
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 親データ読み直し後の棚卸状態区分が0（実施前）でないかどうかのチェック
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // エラーフラグ設定
                  bError = true;
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // エラー情報表示用リストクリア
                  list.clear();
              
                  // 棚卸条件保管区指定に対する処理を示すフラグを設定
                  setInvTargetFlg(FLG_INV_TARGET_WH);
                  setInvTarget2RadioValue(getInvTargetFlg());
              
                  // 子画面のstructを退避
                  saveSubStruct();
              
                  // CSV画面エラーリストクリア
                  csvResultListClear();
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImportWh>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportWh");

		return;
	}

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvImportItem() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportItem");
			//{{user_implement_dev:<controlCsvImportItem>
                //---------------------------------------------------------------------
              
                try {
                 // エラーフラグ初期化
                 boolean bError = false;
              
                 // 読込条件準備
                 struct.setPLANT_CD(getsysPLANT_CD());
              
                 // 親データ読み直し後の棚卸状態区分が0（実施前）でないかどうかのチェック
                 if(checkINV_STS_TYP(struct) != true)
                 {
                  // エラーフラグ設定
                  bError = true;
                 }
              
                 // エラーがない場合
                 if(bError != true)
                 {
                  // エラー情報表示用リストクリア
                  list.clear();
              
                  // 棚卸条件品目指定に対する処理を示すフラグを設定
                  setInvTargetFlg(FLG_INV_TARGET_ITEM);
                  setInvTarget2RadioValue(getInvTargetFlg());
              
                  // 子画面のstructを退避
                  saveSubStruct();
              
                  // CSV画面エラーリストクリア
                  csvResultListClear();
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvImportItem>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvImportItem");

		return;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
                //---------------------------------------------------------------------
                try {
                 // 画面上の特定の情報しかサブミットできないため、ここで画面初期表示時の値を再設定
                 struct.setINV_DATE(_structSaveSub.getINV_DATE());
                 struct.setPLANT_CD(_structSaveSub.getPLANT_CD());
                 struct.setr1_inv_target(_structSaveSub.getr1_inv_target());
                 struct.setr2_inv_target(_structSaveSub.getr2_inv_target());
              
                 // エラーフラグ初期化
                 boolean bError = false;
                 // 画面表示用エラーリストクリア
                 csvResultListClear();
              
                 // ＣＳＶデータ取得
                 List listCsv = readCsvData();
                 if(listCsv == null)
                 {
                  bError = true;
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
              
                } finally{
                 if(getMessage().sizeError() <= 0)
                 {
                  // 処理成功の場合は前画面へ戻るため、戻る処理をおこなう
                  controlreturn_sub3();
                 }
                 else {
                  // リストにエラー内容セット
                  setList(_listResultMessageCsv);
                 }
                }
                //---------------------------------------------------------------------
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselectall");
			//{{user_implement_dev:<controlselectall>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlselectall>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlselectall");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelselectall() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");
			//{{user_implement_dev:<controlcancelselectall>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlcancelselectall>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlcancelselectall");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                      //------------------------------------------------------------------
                try {
              
                 // コンボデータの取得
                 ComboBox controller = new ComboBox(conn, sysUSER_CD);
                 _INV_STS_TYP = controller.getData("INV_STS_TYP");	// 棚卸状態区分
                 _MRP_FLG	 = controller.getData("MRP_FLG");		// 所要量計算対象フラグ
                 _WH_TYP		 = controller.getData("WH_TYP");		// 倉庫区分
                 _MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");	// 品目手配区分
                 _OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");	// 内外作区分
                 _ABC_TYP	 = controller.getData("ABC_TYP");		// 棚卸区分
              
                 // 画面用「棚卸区分」コンボボックスリストデータ作成
                 makeAbcTypComboData(_ABC_TYP);
              
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
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AH0020");
		logger.entering("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AH0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("select_wh") ) {
				controlselect_wh();
			} else if( button.equals("select_item") ) {
				controlselect_item();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("select_sub1") ) {
				controlselect_sub1();
			} else if( button.equals("update_sub1") ) {
				controlupdate_sub1();
			} else if( button.equals("clear_sub1") ) {
				controlclear_sub1();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("select_sub2") ) {
				controlselect_sub2();
			} else if( button.equals("update_sub2") ) {
				controlupdate_sub2();
			} else if( button.equals("clear_sub2") ) {
				controlclear_sub2();
			} else if( button.equals("return_sub2") ) {
				controlreturn_sub2();
			} else if( button.equals("return_sub3") ) {
				controlreturn_sub3();
			} else if( button.equals("CsvImportWh") ) {
				controlCsvImportWh();
			} else if( button.equals("CsvImportItem") ) {
				controlCsvImportItem();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("selectall") ) {
				controlselectall();
			} else if( button.equals("cancelselectall") ) {
				controlcancelselectall();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //---------------------------------------------------------------------
                struct.setList_s_ABC_TYP_val(_comboAbcTyp.getValList());
                struct.setList_s_ABC_TYP_name(_comboAbcTyp.getExplanList());
                  } catch(AlarmMessageException ame){
                 //ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                 //throw ee;
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
//			throw new FoundationException("AH0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0020010-E999","CSVの出力処理"));
			throw new FoundationException("AH0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AH0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AH0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AH0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AH0020010Entity entity;
	protected AH0020010Struct struct;
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

		entity = new AH0020010Entity();
		struct = new AH0020010Struct();

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
	 * AH0020010クラスの標準コンストラクタ
	 */
	public AH0020010Control() throws BusinessProcessException, FoundationException
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
				AH0020010Struct key = (AH0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("w_INV_STS_TYP") && key.getw_INV_STS_TYP() != null) {
					msgKey.setKeyValue("w_INV_STS_TYP", key.getw_INV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_FLG") && key.getw_MRP_FLG() != null) {
					msgKey.setKeyValue("w_MRP_FLG", key.getw_MRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WH_TYP") && key.getw_WH_TYP() != null) {
					msgKey.setKeyValue("w_WH_TYP", key.getw_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP") && key.getw_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("w_MRP_ODR_TYP", key.getw_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP") && key.getw_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("w_OUTSIDE_TYP", key.getw_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ABC_TYP") && key.getw_ABC_TYP() != null) {
					msgKey.setKeyValue("w_ABC_TYP", key.getw_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_name") && key.gets_ABC_TYP_name() != null) {
					msgKey.setKeyValue("s_ABC_TYP_name", key.gets_ABC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP_val") && key.gets_ABC_TYP_val() != null) {
					msgKey.setKeyValue("s_ABC_TYP_val", key.gets_ABC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ERR_ADR") && key.getERR_ADR() != null) {
					msgKey.setKeyValue("ERR_ADR", key.getERR_ADR());
				}
				if(msgKeyType.containsKeyColumn("ERR_MSG") && key.getERR_MSG() != null) {
					msgKey.setKeyValue("ERR_MSG", key.getERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("h_saveINV_DATE") && key.geth_saveINV_DATE() != null) {
					msgKey.setKeyValue("h_saveINV_DATE", key.geth_saveINV_DATE());
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
				if(msgKeyType.containsKeyColumn("c_disp_entry_wh") && key.getc_disp_entry_wh() != null) {
					msgKey.setKeyValue("c_disp_entry_wh", key.getc_disp_entry_wh());
				}
				if(msgKeyType.containsKeyColumn("c_disp_entry_item") && key.getc_disp_entry_item() != null) {
					msgKey.setKeyValue("c_disp_entry_item", key.getc_disp_entry_item());
				}
				if(msgKeyType.containsKeyColumn("c_target") && key.getc_target() != null) {
					msgKey.setKeyValue("c_target", key.getc_target());
				}
				if(msgKeyType.containsKeyColumn("h_saveINV_STS_TYP") && key.geth_saveINV_STS_TYP() != null) {
					msgKey.setKeyValue("h_saveINV_STS_TYP", key.geth_saveINV_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_target") && key.getw_target() != null) {
					msgKey.setKeyValue("w_target", key.getw_target());
				}
				if(msgKeyType.containsKeyColumn("r1_inv_target") && key.getr1_inv_target() != null) {
					msgKey.setKeyValue("r1_inv_target", key.getr1_inv_target());
				}
				if(msgKeyType.containsKeyColumn("r2_inv_target") && key.getr2_inv_target() != null) {
					msgKey.setKeyValue("r2_inv_target", key.getr2_inv_target());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("h_saveTEMP_INV_FLG") && key.geth_saveTEMP_INV_FLG() != null) {
					msgKey.setKeyValue("h_saveTEMP_INV_FLG", key.geth_saveTEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_DATE") && key.getINV_DATE() != null) {
					msgKey.setKeyValue("INV_DATE", key.getINV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_REGULAR_INV_FLG") && key.geth_REGULAR_INV_FLG() != null) {
					msgKey.setKeyValue("h_REGULAR_INV_FLG", key.geth_REGULAR_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_CYCLE_INV_FLG") && key.geth_CYCLE_INV_FLG() != null) {
					msgKey.setKeyValue("h_CYCLE_INV_FLG", key.geth_CYCLE_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_TEMP_INV_FLG") && key.geth_TEMP_INV_FLG() != null) {
					msgKey.setKeyValue("h_TEMP_INV_FLG", key.geth_TEMP_INV_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_INV_STS_TYP") && key.geth_INV_STS_TYP() != null) {
					msgKey.setKeyValue("h_INV_STS_TYP", key.geth_INV_STS_TYP());
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
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_WH_CD") && key.getINV_WH_CD() != null) {
					msgKey.setKeyValue("INV_WH_CD", key.getINV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_VEND_CD") && key.getWH_VEND_CD() != null) {
					msgKey.setKeyValue("WH_VEND_CD", key.getWH_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("w_WH_CD") && key.getw_WH_CD() != null) {
					msgKey.setKeyValue("w_WH_CD", key.getw_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_ITEM_CD") && key.getINV_ITEM_CD() != null) {
					msgKey.setKeyValue("INV_ITEM_CD", key.getINV_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("s_ABC_TYP") && key.gets_ABC_TYP() != null) {
					msgKey.setKeyValue("s_ABC_TYP", key.gets_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("CHK_PLANT_CD") && key.getCHK_PLANT_CD() != null) {
					msgKey.setKeyValue("CHK_PLANT_CD", key.getCHK_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CHK_INV_DATE") && key.getCHK_INV_DATE() != null) {
					msgKey.setKeyValue("CHK_INV_DATE", key.getCHK_INV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CHK_WH_CD") && key.getCHK_WH_CD() != null) {
					msgKey.setKeyValue("CHK_WH_CD", key.getCHK_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("CHK_ITEM_CD") && key.getCHK_ITEM_CD() != null) {
					msgKey.setKeyValue("CHK_ITEM_CD", key.getCHK_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_disp_entry_wh") && key.geth_disp_entry_wh() != null) {
					msgKey.setKeyValue("h_disp_entry_wh", key.geth_disp_entry_wh());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_disp_entry_item") && key.geth_disp_entry_item() != null) {
					msgKey.setKeyValue("h_disp_entry_item", key.geth_disp_entry_item());
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
					AH0020010Struct key = new AH0020010Struct();
					if(msgKeyType.containsKeyColumn("w_INV_STS_TYP")) {
						key.setw_INV_STS_TYP(msgKey.getKeyValue("w_INV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_FLG")) {
						key.setw_MRP_FLG(msgKey.getKeyValue("w_MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_TYP")) {
						key.setw_WH_TYP(msgKey.getKeyValue("w_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_MRP_ODR_TYP")) {
						key.setw_MRP_ODR_TYP(msgKey.getKeyValue("w_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_OUTSIDE_TYP")) {
						key.setw_OUTSIDE_TYP(msgKey.getKeyValue("w_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ABC_TYP")) {
						key.setw_ABC_TYP(msgKey.getKeyValue("w_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_name")) {
						key.sets_ABC_TYP_name(msgKey.getKeyValue("s_ABC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP_val")) {
						key.sets_ABC_TYP_val(msgKey.getKeyValue("s_ABC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ERR_ADR")) {
						key.setERR_ADR(msgKey.getKeyValue("ERR_ADR"));
					}
					if(msgKeyType.containsKeyColumn("ERR_MSG")) {
						key.setERR_MSG(msgKey.getKeyValue("ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("h_saveINV_DATE")) {
						key.seth_saveINV_DATE(msgKey.getKeyValue("h_saveINV_DATE"));
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
					if(msgKeyType.containsKeyColumn("c_disp_entry_wh")) {
						key.setc_disp_entry_wh(msgKey.getKeyValue("c_disp_entry_wh"));
					}
					if(msgKeyType.containsKeyColumn("c_disp_entry_item")) {
						key.setc_disp_entry_item(msgKey.getKeyValue("c_disp_entry_item"));
					}
					if(msgKeyType.containsKeyColumn("c_target")) {
						key.setc_target(msgKey.getKeyValue("c_target"));
					}
					if(msgKeyType.containsKeyColumn("h_saveINV_STS_TYP")) {
						key.seth_saveINV_STS_TYP(msgKey.getKeyValue("h_saveINV_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_target")) {
						key.setw_target(msgKey.getKeyValue("w_target"));
					}
					if(msgKeyType.containsKeyColumn("r1_inv_target")) {
						key.setr1_inv_target(msgKey.getKeyValue("r1_inv_target"));
					}
					if(msgKeyType.containsKeyColumn("r2_inv_target")) {
						key.setr2_inv_target(msgKey.getKeyValue("r2_inv_target"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("h_saveTEMP_INV_FLG")) {
						key.seth_saveTEMP_INV_FLG(msgKey.getKeyValue("h_saveTEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_DATE")) {
						key.setINV_DATE(msgKey.getKeyValue("INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_REGULAR_INV_FLG")) {
						key.seth_REGULAR_INV_FLG(msgKey.getKeyValue("h_REGULAR_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_CYCLE_INV_FLG")) {
						key.seth_CYCLE_INV_FLG(msgKey.getKeyValue("h_CYCLE_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_TEMP_INV_FLG")) {
						key.seth_TEMP_INV_FLG(msgKey.getKeyValue("h_TEMP_INV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_INV_STS_TYP")) {
						key.seth_INV_STS_TYP(msgKey.getKeyValue("h_INV_STS_TYP"));
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
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_WH_CD")) {
						key.setINV_WH_CD(msgKey.getKeyValue("INV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_VEND_CD")) {
						key.setWH_VEND_CD(msgKey.getKeyValue("WH_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_CD")) {
						key.setw_WH_CD(msgKey.getKeyValue("w_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_ITEM_CD")) {
						key.setINV_ITEM_CD(msgKey.getKeyValue("INV_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(msgKey.getKeyValue("ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_ABC_TYP")) {
						key.sets_ABC_TYP(msgKey.getKeyValue("s_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("CHK_PLANT_CD")) {
						key.setCHK_PLANT_CD(msgKey.getKeyValue("CHK_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CHK_INV_DATE")) {
						key.setCHK_INV_DATE(msgKey.getKeyValue("CHK_INV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CHK_WH_CD")) {
						key.setCHK_WH_CD(msgKey.getKeyValue("CHK_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("CHK_ITEM_CD")) {
						key.setCHK_ITEM_CD(msgKey.getKeyValue("CHK_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_disp_entry_wh")) {
						key.seth_disp_entry_wh(msgKey.getKeyValue("h_disp_entry_wh"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_disp_entry_item")) {
						key.seth_disp_entry_item(msgKey.getKeyValue("h_disp_entry_item"));
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
