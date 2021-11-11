/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0020/src/com/nec/jp/orteus/metamorBase/AA0020/AA0020010Control.java,v $
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

//{{user_implement_code_import
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.text.ParseException;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0020010Control
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
        protected List list;										    // 結果リストのインスタンス
        public List getList() { return this.list; }					     // リストを返します。
        public void setList(List listname) { this.list = listname; }    // リストをセットします。
        public int getListsize() {									      // リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
        public Object getListvalue(int x) { return this.list.get(x); }  // リストの値（メディエータ）を返します。
       
        public AA0020010Struct getStruct() { return this.struct; }      // Structの値（メディエータ）を返します。
       
       //------------------------------------------------------------------------------
       
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;
       
       //---------- 初期展開レベル ---------------------------------------------------
       
        /** 最大展開レベル */
        String _level = null;
       
        /** 初期展開レベル */
        String _initlevel = null;
       
       //---------- コンボボックスデータ取得関連の処理 -------------------------------
       
        /** 展開区分 */
        ComboStruct _DEVELOP_TYP = new ComboStruct();
       
        /** 展開区分設定
         * @param コンボボックスデータ
        */
        public void setDEVELOP_TYP(ComboStruct combo){ _DEVELOP_TYP = combo; }
       
        /** 展開区分取得
         * @return 展開区分のコンボボックスデータ
        */
        public ComboStruct getDEVELOP_TYP(){ return _DEVELOP_TYP; }
       
// 2008/07/11 SYSCOM 小林 ADD START
        /** 工数管理品目区分 */
        ComboStruct _MANHOUR_TYP = new ComboStruct();
       
        /** 工数管理品目区分設定
         * @param コンボボックスデータ
        */
        public void setMANHOUR_TYP(ComboStruct combo){ _MANHOUR_TYP = combo; }
       
        /** 工数管理品目区分
         * @return 工数管理品目区分のコンボボックスデータ
        */
        public ComboStruct getMANHOUR_TYP(){ return _MANHOUR_TYP; }
// 2008/07/11 SYSCOM 小林 ADD END
        
        /** 支給区分 */
        ComboStruct _CONS_TYP = new ComboStruct();
       
        /** 支給区分設定
         * @param コンボボックスデータ
        */
        public void setCONS_TYP(ComboStruct combo){ _CONS_TYP = combo; }
       
        /** 支給区分取得
         * @return 支給区分のコンボボックスデータ
        */
        public ComboStruct getCONS_TYP(){ return _CONS_TYP; }
       
       
        /** 原価積み上げ有無 */
        ComboStruct _COST_UP_TYP = new ComboStruct();
       
        /** 原価積み上げ有無 設定
         * @param コンボボックスデータ
        */
        public void setCOST_UP_TYP(ComboStruct combo){ _COST_UP_TYP = combo; }
       
        /** 原価積み上げ有無 取得
         * @return 原価積み上げ有無 のコンボボックスデータ
        */
        public ComboStruct getCOST_UP_TYP(){ return _COST_UP_TYP; }
        
        
        /** MRP展開有無 */
        ComboStruct _MRP_EXP_TYP = new ComboStruct();
        
        /** MRP展開有無設定
         * @param コンボボックスデータ
        */
        public void setMRP_EXP_TYP(ComboStruct combo){ _MRP_EXP_TYP = combo; }
       
        /** MRP展開有無取得
         * @return MRP展開有無のコンボボックスデータ
        */
        public ComboStruct getMRP_EXP_TYP(){ return _MRP_EXP_TYP; }
       
       
        /** 製品構成L/Tの使用有無 */
        ComboStruct _PS_LT_FLG = new ComboStruct();
        
        /** 製品構成L/Tの使用有無設定
         * @param コンボボックスデータ
        */
        public void setPS_LT_FLG(ComboStruct combo){ _PS_LT_FLG = combo; }
       
        /** 製品構成L/Tの使用有無取得
         * @return 製品構成L/Tの使用有無のコンボボックスデータ
        */
        public ComboStruct getPS_LT_FLG(){ return _PS_LT_FLG; }
        
        /** 製品構成有効終了日付     */
        private static final String END_DATE = "2999/12/31";        
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param iTyp 区分コード
         * @return 区分名称。該当するデータがなかった場合は区分コードを返す
         */
        private String getTypeName(ComboStruct comboStruct, Integer iTyp)
        {
         if(comboStruct == null || iTyp == null)  return null;
         return getTypeName(comboStruct,TypeConverter.sanitizer(iTyp));
        }
        /**
         * 区分名取得
         * @param comboStruct 区分情報リスト
         * @param strTyp 区分コード
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
       
        /**
         * 製品構成情報のフラグの表示を設定
         * @param s フラグの値が設定されている情報、表示を設定する情報
         */
        private void setTypeValueAboutPs(AA0020010Struct s)
        {
// 2008/07/11 SYSCOM 小林 ADD START
         s.setCOMP_MANHOUR_NAME(getTypeName(_MANHOUR_TYP,s.getCOMP_MANHOUR_TYP()));
// 2008/07/11 SYSCOM 小林 ADD END
         s.sets_CONS_NAME(getTypeName(_CONS_TYP,s.gets_CONS_TYP()));
         s.setPS_LT_NAME(getTypeName(_PS_LT_FLG,s.getPS_LT_FLG()));
         s.setCOST_UP_NAME(getTypeName(_COST_UP_TYP,s.gets_COST_UP_TYP()));
         s.setMRP_EXP_NAME(getTypeName(_MRP_EXP_TYP,s.gets_MRP_EXP_TYP()));
        }
       
       //---------- 親子画面関連の処理 -------------------------------------------
       
        /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
        private AA0020010Struct _keyStruct = new AA0020010Struct();
       
        /** キー情報Structの取得 */
        public AA0020010Struct getKeyStruct(){ return _keyStruct; }
        
        /** キー情報Structの設定 */
        public void setKeyStruct(AA0020010Struct struct){ _keyStruct.copy(struct); }
       
       
       //---------- 追加・更新時の入力値チェック--------------------------------------
       
        /** 
         * 入力値チェック。
         * NOT NULL項目に値が入っていない場合、デフォルト値を設定する
         * @param checkStruct チェック対象のStruct
         */
        private void checkStruct(AA0020010Struct checkStruct)
        {
         // 照会順序
         if(checkStruct.getPS_REF_NO() == null
         || "".equals(checkStruct.getPS_REF_NO()))
          checkStruct.setPS_REF_NO(AA0020Common._PS_REF_NO);
       
         // 構成仕損率
         if(checkStruct.getPS_SPOIL() == null
         || "".equals(checkStruct.getPS_SPOIL()))
          checkStruct.setPS_SPOIL(AA0020Common._PS_SPOIL);
       
         // 構成固定分リードタイム
         if(checkStruct.getPS_FIXED_LT() == null
         || "".equals(checkStruct.getPS_FIXED_LT()))
          checkStruct.setPS_FIXED_LT(AA0020Common._PS_FIXED_LT);
       
         // 構成比例分リードタイム
         if(checkStruct.getPS_PROP_LT() == null
         || "".equals(checkStruct.getPS_PROP_LT()))
          checkStruct.setPS_PROP_LT(AA0020Common._PS_PROP_LT);
       
         // 構成比例分ロットサイズ
         if(checkStruct.getPS_PROP_LOT_SIZE() == null
         || "".equals(checkStruct.getPS_PROP_LOT_SIZE()))
          checkStruct.setPS_PROP_LOT_SIZE(AA0020Common._PS_PROP_LOT_SIZE);
       
        }
       
       
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
       
       //---------- ルーピングチェック処理 -------------------------------------------
       
        /**
         * ルーピングチェック。逆展開を行い同品目番号が存在 有無
         * @param repository 製品構成リポジトリ
         * @param checkItem 対象品目番号
         * @param item 比較する品目番号
         * @return true:有  false:無
         */
        private boolean checkReverseRooping(ProductStructureRepository repository, 
                   String targetItem, String item)
         throws SQLException
        {
         // 親品目番号一覧取得
         ArrayList itemList = repository.reverseDeployment(item);
         checkItemList(itemList);
       
         for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
           // 親品目番号一覧から更に上の親品目取得
           boolean result = checkReverseRooping(repository, 
                targetItem, (String)itemList.get(i));
           if(result == true) return true;
          }
          else{
           return true;
          }
         }
         return false;
        }
       
       
        /**
         * ルーピングチェック。正展開を行い同品目番号が存在 有無
         * @param repository 製品構成リポジトリ
         * @param checkItem 対象品目番号
         * @param item 比較する品目番号
         * @return true:有  false:無
         */
        private boolean checkRooping(ProductStructureRepository repository, 
                String targetItem, String item)
         throws SQLException
        {
         // 子品目番号一覧取得
         ArrayList itemList = repository.orderDeployment(item);
         checkItemList(itemList);
       
         for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
           // 子品目番号一覧から更に下の子品目取得
           boolean result = checkRooping(repository, targetItem, (String)itemList.get(i));
           if(result == true) return true;
          }
          else{
           return true;
          }
         }
         return false;
        }
       
       
       //---------- 有効日の重複チェック処理 -----------------------------------------
       
        /**
         * 有効日の重複チェック
         * @param parentItem 親品目番号
         * @param compItem 子品目番号
         * @param psedition 構成版数
         * @param inDate 有効開始日
         * @param outDate 有効終了日
         * @return true:OK  false:NG
        */
        private boolean checkEffectiveDate_update(String parentItem, String compItem, String psedition,
             String inDate, String outDate)
         throws SQLException, FoundationException, ParseException
        {
         // 親品目、子品目が一致する構成情報取得
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(parentItem);
         workStruct.setCOMP_ITEM_CD(compItem);
         List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
       
         // 同構成情報は比較対象から削除
         for(int i = 0; i < dateList.size(); i++){
          AA0020010Struct checkStruct = (AA0020010Struct)dateList.get(i);
          if(parentItem.equals(checkStruct.getPARENT_ITEM_CD()) &&
           compItem.equals(checkStruct.getCOMP_ITEM_CD()) &&
           psedition.equals(checkStruct.getPS_EDITION())){
           dateList.remove(i);
           break;
          }
         }
         return checkEffectiveDate(dateList, inDate, outDate);
        }
       
        /**
         * 有効日の重複チェック
         * @param parentItem 親品目番号
         * @param compItem 子品目番号
         * @param inDate 有効開始日
         * @param outDate 有効終了日
         * @return true:OK  false:NG
        */
        private boolean checkEffectiveDate_insert(String parentItem, String compItem,
             String inDate, String outDate)
         throws SQLException, FoundationException, ParseException
        {
         // 親品目、子品目が一致する構成情報取得
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(parentItem);
         workStruct.setCOMP_ITEM_CD(compItem);
         List dateList = entity.mselectM_PS_eff_phase_date.read(conn, workStruct);
         return checkEffectiveDate(dateList, inDate, outDate);
        }
       
       
        /**
         * 有効日の重複チェック
         * @param dateList 重複チェックする構成情報
         * @param inDate 有効開始日
         * @param outDate 有効終了日
         * @return true:OK  false:NG
        */
        private boolean checkEffectiveDate(List dateList, String inDate, String outDate)
         throws SQLException, FoundationException, ParseException
        {
         boolean result = true;	  // チェック結果格納
         Date d_inDate = stringToDate(inDate);
         Date d_outDate = stringToDate(outDate);
         for(int i = 0; i < dateList.size(); i++)
         {
          String targetInDate = ((AA0020010Struct)dateList.get(i)).getEFF_PHASE_IN_DATE();
          String targetOutDate = ((AA0020010Struct)dateList.get(i)).getEFF_PHASE_OUT_DATE();
       
          Date d_targetInDate = stringToDate(targetInDate);
          Date d_targetOutDate =  stringToDate(targetOutDate);
       
          if(d_targetInDate.getTime() > d_inDate.getTime()){
           // 開始日付 ＞ チェック対象の開始日付の場合
           if(d_targetInDate.getTime() <= d_outDate.getTime()){
            // 開始日付 ＜ チェック対象の終了日付の場合
            result = false;
            break;
           }
          }
          else if(d_targetInDate.getTime() < d_inDate.getTime()){
           // 開始日付 ＞ チェック対象の終了日付の場合
           if(d_targetOutDate.getTime() >= d_inDate.getTime()){
            // チェック対象の終了日付 ＞＝ 開始日付
            result = false;
            break;
           }
          }
          else{
           // 開始日付 == チェック対象の開始日付
           result = false;
           break;
          }
         }
         return result;
        }
        //---------- 有効開始日付と有効終了日付を設定 -------------------------------------
        /**
         * サブ１有効開始日付と有効終了日付を初期化します。
         */
        private void initialDate() throws BusinessProcessException, FoundationException
        {
           try{
        	   beginTransaction();     // システム時刻を取得
        	   struct.setEFF_PHASE_IN_DATE(null);
        	   struct.setEFF_PHASE_OUT_DATE(null);
        	   //[パラメータ]．"名前"を設定します
        	   struct.setP_NAME("PS_EFF_PHASE_IN_DATE");
        	   Date t;
        	   //[パラメータ]．"設定値"を取得
        	   List dateInList = entity.mselectSYS_PARAMETER.read(conn, struct);
        	   if (dateInList.isEmpty()){
        		   return;
        	   }
        	   AA0020010Struct dateInStruct = (AA0020010Struct) dateInList.get(0);
        	   if ( dateInStruct.getP_VALUE() != null && !dateInStruct.getP_VALUE().equals("")
        			   && !(dateInStruct.getP_VALUE().toLowerCase()).equals("null")){
        		   if(dateInStruct.getP_VALUE().equals("*"))
        		   {
        			  //システムユーザを取得
        			  struct.setP_USER_CD(struct.getsUser_ID());
        			  List userList = entity.mselectUSER_MST.read(conn,struct);
        			  if (userList.isEmpty()){
        				  ExpjMessage emsg = new ExpjMessage("KR00017");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, sysUSER_CD);
                          throw new ExpjException("KR00017");
        			  }
        			  AA0020010Struct userStruct = (AA0020010Struct) userList.get(0);
        			  
        			  //工場コードを取得
        			  List sysDateCtrlList = entity.mselectSYS_DATE_CTRL.read(conn, userStruct);
                      if (sysDateCtrlList.isEmpty()){
                          ExpjMessage emsg = new ExpjMessage("KQ00039");
                          msgStruct.addError(emsg);
                          sysLog.warning(emsg, sysUSER_CD);
                          throw new ExpjException("KQ00039");
                      }
	                  AA0020010Struct sysDateStruct = (AA0020010Struct) sysDateCtrlList.get(0);
                      struct.setEFF_PHASE_IN_DATE(sysDateStruct.getP_BUSINESS_DATE());
        		   }else{
        			   if(checkDate(dateInStruct.getP_VALUE()) == true){
        				   try{
    	        			   //日付形式を判別
    	        			   t = stringToDate(dateInStruct.getP_VALUE());
    	        			   //[パラメータ]．"設定値"!=nullの場合、有効開始日付　= [パラメータ]．"設定値"
    	        			   struct.setEFF_PHASE_IN_DATE(dateToString(t));
    	        		   }catch(ParseException   e){
    	        			   //"有効開始日のパラメータが不正です。"
    	        			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
    	                       msgStruct.addError(emsg);
    	                       sysLog.warning(emsg, getsysUSER_CD());
    	        		   }
        			   }else{
        				   //"有効開始日のパラメータが不正です。"
	        			   ExpjMessage emsg = new ExpjMessage("ZZ13001");
	                       msgStruct.addError(emsg);
	                       sysLog.warning(emsg, getsysUSER_CD());
        			   }
        		   }
        	   }else{
        		   struct.setEFF_PHASE_IN_DATE(null);
        	   }
               //[パラメータ]．"名前"を設定します
        	   struct.setP_NAME("PS_EFF_PHASE_OUT_DATE");
        	   //[パラメータ]．"設定値"を取得
        	   List dateOutList = entity.mselectSYS_PARAMETER.read(conn, struct);
        	   if (dateOutList.isEmpty()){
        		   return;
        	   }
        	   AA0020010Struct dateOutStruct = (AA0020010Struct) dateOutList.get(0);        	   
        	   if ( dateOutStruct.getP_VALUE() != null && !dateOutStruct.getP_VALUE().equals("")
        			   && !(dateOutStruct.getP_VALUE().toLowerCase()).equals("null")){
        		   if(dateOutStruct.getP_VALUE().equals("*")){
         			  //システムユーザを取得
         			  struct.setP_USER_CD(struct.getsUser_ID());
         			  List userList = entity.mselectUSER_MST.read(conn,struct);
         			  if (userList.isEmpty()){
         				 ExpjMessage emsg = new ExpjMessage("KR00017");
                         msgStruct.addError(emsg);
                         sysLog.warning(emsg, sysUSER_CD);
                         throw new ExpjException("KR00017");
         			  }
         			  AA0020010Struct userStruct = (AA0020010Struct) userList.get(0);
         			  
         			  //工場コードを取得
         			  List sysDateCtrlList = entity.mselectSYS_DATE_CTRL.read(conn, userStruct);
	                  if (sysDateCtrlList.isEmpty()){
	                      ExpjMessage emsg = new ExpjMessage("KQ00039");
	                      msgStruct.addError(emsg);
	                      sysLog.warning(emsg, sysUSER_CD);
	                    throw new ExpjException("KQ00039");
	                  }
	                  AA0020010Struct sysDateStruct = (AA0020010Struct) sysDateCtrlList.get(0);
                      struct.setEFF_PHASE_OUT_DATE(sysDateStruct.getP_BUSINESS_DATE());
        		   }else{
        			   if(checkDate(dateOutStruct.getP_VALUE()) == true){
        				   try{
    	        			   //日付形式を判別
    	        			   t = stringToDate(dateOutStruct.getP_VALUE());
    	        			   //[パラメータ]．"設定値"!=nullの場合、有効終了日付　= [パラメータ]．"設定値"
    	        			   struct.setEFF_PHASE_OUT_DATE(dateToString(t));
    	        		   }catch(ParseException   e){
    	        			   //"有効終了日のパラメータが不正です。"
    	        			   ExpjMessage emsg = new ExpjMessage("ZZ13002");
    	                       msgStruct.addError(emsg);
    	                       sysLog.warning(emsg, getsysUSER_CD());
    	        		   }
        			   }else{
        				   //"有効終了日のパラメータが不正です。"
	        			   ExpjMessage emsg = new ExpjMessage("ZZ13002");
	                       msgStruct.addError(emsg);
	                       sysLog.warning(emsg, getsysUSER_CD());
        			   }
	        	   }
        	   }else{
        		   struct.setEFF_PHASE_OUT_DATE(null);
        	   }
           }catch(FoundationException e){
        	   e.printStackTrace();
           }
           catch(SQLException ee){
              ee.printStackTrace();            	   
           }            	   
        }
       //---------- 品目手配区分構成チェック処理 -------------------------------------
       
        /**
         * 品目手配区分別構成チェック
         * @param repository 製品構成リポジトリ
         * @param parent 親品目番号
         * @param comp 子品目番号
         * @return true：OK  false:NG
        */
        private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
                    String parent, String comp)
         throws SQLException, FoundationException
        {
         AA0020010Struct workStruct = new AA0020010Struct();
         List workList = null;
         Integer parent_typ = null;
         Integer comp_typ = null;
       
         // 親の手配区分取得
         workStruct.setITEM_CD(parent);
         workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
         parent_typ = ((AA0020010Struct)workList.get(0)).getMRP_ODR_TYP();
       
         // 子の手配区分取得
         workStruct.setITEM_CD(comp);
         workList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
         comp_typ = ((AA0020010Struct)workList.get(0)).getMRP_ODR_TYP();
       
         //  親品目 ④マニュアル手配品目、⑤ロット手配品目、⑥定量手配品目、⑦発注点手配品目
         if(parent_typ.intValue() == 4 || parent_typ.intValue() == 5 ||
          parent_typ.intValue() == 6 || parent_typ.intValue() == 7){
          
          //  子品目 ①個別品目 ②在庫引当型個別品目
          if(comp_typ.intValue() == 1 || comp_typ.intValue() == 2) return false;
         }
         
         ArrayList itemList = null;
         // 親品目 ⑧擬似品目
         if(parent_typ.intValue() == 8)
         {
          // 子品目 ⑧擬似品目
          if(comp_typ.intValue() == 8) return false;
          else if(comp_typ.intValue() == 4 || comp_typ.intValue() == 5 ||
            comp_typ.intValue() == 6 || comp_typ.intValue() == 7) return true;
          else{
           // 親品目が子品目となる構成情報の親品目取得
           itemList = repository.reverseDeployment(parent);
           checkItemList(itemList);
           for(int i = 0; i < itemList.size(); i++)
           {
            // 取得した親品目の手配区分取得
            workStruct.setITEM_CD((String)itemList.get(i));
            List parentList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
            Integer typ = ((AA0020010Struct)parentList.get(0)).getMRP_ODR_TYP();
            
            if(typ.intValue() == 4 || typ.intValue() == 5 ||
             typ.intValue() == 6 || typ.intValue() == 7) return false;
           }
          }
         }
       
         // 子品目 ⑧擬似品目
         if(comp_typ.intValue() == 8)
         {
          // 親品目 ⑧擬似品目
          if(parent_typ.intValue() == 8) return false;
          else if(parent_typ.intValue() == 1 || parent_typ.intValue() == 2) return true;
          else{
           // 子品目が親品目となる構成情報の子品目取得
           itemList = repository.orderDeployment(comp);
           checkItemList(itemList);
           for(int i = 0; i < itemList.size(); i++)
           {
            // 取得した子品目の手配区分取得
            workStruct.setITEM_CD((String)itemList.get(i));
            List compList = entity.mselectM_ITEM_mrp_odr_typ.read(conn, workStruct);
            Integer typ = ((AA0020010Struct)compList.get(0)).getMRP_ODR_TYP();
            
            if(typ.intValue() == 1 || typ.intValue() == 2 ) return false;
           }
          }
         }
       
         return true;
        }
       
       
       //---------- 製品構成レポジトリ関連の処理 -------------------------------------------
       
        /** 重複チェック
         * @param itemList 重複チェックする品目リスト
        */
        private void checkItemList(ArrayList itemList)
        {
         List workList = new ArrayList(0);
         for(int i = 0; i < itemList.size(); i++){
          boolean result =true;
          String item_cd = (String)itemList.get(i);
          for(int t = 0; t < workList.size(); t++){
           if(item_cd.equals((String)workList.get(t)) == true)
            result = false;
          }
          if(result == true)
           workList.add(item_cd);
         }
       
         itemList.clear();
         for(int i = 0; i < workList.size(); i++)
          itemList.add(workList.get(i));
        }
       
       
       //---------- 製品構成取得関連の処理 -------------------------------------------
       
        /** 製品構成リスト */
        private ArrayList _deployList = new ArrayList(0);
       
        /** 製品構成リスト取得 
         * @return 製品構成リスト
        */
        public ArrayList getDeployList(){ return _deployList; }
       
        /** 日付フォーマット */
        //private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       
        /**
         * Date型 ⇒ String型。
         * @return String YYYY/MM/DD形式
         */
        public String dateToString(Date date)
        {
         //return _dateFormat.format(date);
         return Converter.dateToStr(date, "yyyy/MM/dd");
        }
       
        /**
         * String型 ⇒ Date型。
         * @return Date 
         */
        public Date stringToDate(String date) throws ParseException
        {
         //return _dateFormat.parse(date);
         return Converter.strToDate(date, "yyyy/MM/dd");
        }
        /**    
         * check 日付形式：yyyy/MM/dd
         * @param sourceDate    
         * @return    
         */     
         public static boolean checkDate(String sourceDate){     
         if(sourceDate==null){     
         return false;     
         }     
         try {     
         SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");     
         dateFormat.setLenient(false);     
         dateFormat.parse(sourceDate);     
         return true;     
         } catch (Exception e) {     
         }     
         return false;     
         }        
        //---------- 正展開 --------------------------------------------------------
       
        /** 正展開 対象日付あり 
         * @param repository 製品構成リポジトリ
         * @param item 親品目
         * @param deployLevel 展開レベル
         * @param tagetDate 対象日付
         * @param no 階層レベル
        */
        public void getDeploy(ProductStructureRepository repository, 
             String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
       
         // 子品目番号一覧取得
         ArrayList itemList = repository.orderDeployment(item, targetDate);
         checkItemList(itemList);
       
         // 親品目と子品目の構成情報取得
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(item);
         workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
         workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS_set_date.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // 展開レベルチェック
         if(deployLevel.intValue() <= 1){
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // 構成情報から更に下の子品目取得
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getCOMP_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        /** 正展開 対象日付なし 
         * @param repository 製品構成リポジトリ
         * @param item 親品目
         * @param deployLevel 展開レベル
         * @param no 階層レベル
        */
        public void getDeploy(ProductStructureRepository repository, 
              String item, Integer deployLevel, Integer no)
         throws SQLException, FoundationException
        {
         // 子品目番号一覧取得
         ArrayList itemList = repository.orderDeployment(item);
         checkItemList(itemList);
       
         // 親品目と子品目の構成情報取得
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setPARENT_ITEM_CD(item);
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // 展開レベルチェック
         if(deployLevel.intValue() <= 1){
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // 構成情報から更に下の子品目取得
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getCOMP_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               new Integer(no.intValue() + 1));
          }
         }
        }
       
        //---------- 逆展開 --------------------------------------------------------
       
        /** 逆展開 対象日付あり 
         * @param repository 製品構成リポジトリ
         * @param item 子品目
         * @param deployLevel 展開レベル
         * @param tagetDate 対象日付
         * @param no 階層レベル
        */
        public void getReverseDeploy(ProductStructureRepository repository, 
            String item, Integer deployLevel, Date targetDate, Integer no)
         throws SQLException, FoundationException
        {
       
         // 親品目番号一覧取得
         ArrayList itemList = repository.reverseDeployment(item, targetDate);
         checkItemList(itemList);
       
         // 親品目と子品目の構成情報取得
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setCOMP_ITEM_CD(item);
         workStruct.setEFF_PHASE_IN_DATE(dateToString(targetDate));
         workStruct.setEFF_PHASE_OUT_DATE(dateToString(targetDate));
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS_set_date.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // 展開レベルチェック
         if(deployLevel.intValue() <= 1){
          // 最大展開レベル
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // 構成情報から更に上の親品目取得
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getReverseDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getPARENT_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               targetDate,
               new Integer(no.intValue() + 1));
          }
         }
        }
       
       
        /** 逆展開 対象日付なし 
         * @param repository 製品構成リポジトリ
         * @param item 子品目
         * @param deployLevel 展開レベル
         * @param no 階層レベル
        */
        public void getReverseDeploy(ProductStructureRepository repository, 
               String item, Integer deployLevel, Integer no)
         throws SQLException, FoundationException
        {
       
         // 親品目番号一覧取得
         ArrayList itemList = repository.reverseDeployment(item);
         checkItemList(itemList);
       
         // 親品目と子品目の構成情報取得
         ArrayList deployList = new ArrayList(0);
         AA0020010Struct workStruct = new AA0020010Struct();
         workStruct.setCOMP_ITEM_CD(item);
         for(int i = 0; i < itemList.size(); i++){
          workStruct.setPARENT_ITEM_CD((String)itemList.get(i));
          List workList = entity.mselectM_PS.read(conn, workStruct);
          for(int t = 0; t < workList.size(); t++){
           deployList.add((AA0020010Struct)(workList.get(t)));
          }
         }
       
         // 展開レベルチェック
         if(deployLevel.intValue() <= 1){
          // 最大展開レベル
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
          }
         }
         else{
          // 構成情報から更に上の親品目取得
          for(int i = 0; i < deployList.size(); i++){
           AA0020010Struct noStruct = (AA0020010Struct)deployList.get(i);
           noStruct.setNO(no);
           _deployList.add(deployList.get(i));
           getReverseDeploy(repository, 
               ((AA0020010Struct)deployList.get(i)).getPARENT_ITEM_CD(),
               new Integer(deployLevel.intValue() - 1),
               new Integer(no.intValue() + 1));
          }
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
         * SQLExceptionエラーメッセージ設定
         * @param 出力エラーメッセージ
         */
        private void setSqlExceptionMsg(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.severe(emsg, getsysUSER_CD());
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
         sysLog.severe(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addError( emsg );
         sysLog.severe(emsg, getsysUSER_CD());
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
         sysLog.severe(emsg, getsysUSER_CD());
         
         for(int i=0; i<message.size(); i++)
         {
          emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
          msgStruct.addError( emsg );
          sysLog.severe(emsg, getsysUSER_CD());
         }
        }
         
        /**
         * エラーメッセージ設定
         * @param ログ出力メッセージ
         */
        private void setErrorLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.severe(emsg, getsysUSER_CD());
        }
         
        /**
         * エラーメッセージ設定(キー出力なし)
         * @param メッセージ番号
         * @param 出力メッセージ
         */
        private void setErrorMessageNoKey(String messageno, String message)
        {
         ExpjMessage emsg = new ExpjMessage( messageno );
         msgStruct.addError( emsg );
         sysLog.severe(emsg, getsysUSER_CD());
         emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.severe(emsg, getsysUSER_CD());
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
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * 警告メッセージ設定
         * @param 出力メッセージ
         */
        private void setWarnMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
       
        /**
         * 警告メッセージ設定
         * @param ログ出力メッセージ
         */
        private void setWarnLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.warning(emsg, getsysUSER_CD());
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
       
        /**
         * 情報メッセージ設定
         * @param 出力メッセージ
         */
        private void setInfoMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addInfo( emsg );
         sysLog.info(emsg, getsysUSER_CD());
        }
         
        /**
         * 情報メッセージ設定
         * @param ログ出力メッセージ
         */
        private void setInfoLogMessage(String message)
        {
         ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
         sysLog.info(emsg, getsysUSER_CD());
        }
       
        // DB更新中フラグ
        private boolean bDBUpdate;
       
         
        /** 
         * @param target_struct 対象データ情報
         * @param devType       展開フラグ(1:正展開)
         * @return delList      削除対象データ
         */
        private List checkTargetDataIn(AA0020010Struct target_struct, int devType) throws FoundationException, SQLException
        {
         String Message = "";
         
         // 削除する対象データ
         List delList = null;
         
         // 合致レコード件数
         HashSet set = new HashSet(); 
       
         // 合致フラグ
         boolean chekflg;
       
         // 削除するレコードを取得
         delList = entity.mselectM_PS_ps_edition.read(conn, target_struct);
         
         
         for(int i=1; i<_deployList.size(); i++) {
          
          String depParItem = null;	// 内部親品目番号
          String depComItem = null;	// 内部子品目番号
          String depEdition = null;	// 内部製品構成版数
          
          // 展開レベルチェック
          if(devType == 1) {
           chekflg = checkDataExistence(target_struct.getPARENT_ITEM_CD(), ((AA0020010Struct)_deployList.get(i)).getPARENT_ITEM_CD());
          } else {
           chekflg = checkDataExistence(target_struct.getCOMP_ITEM_CD(), ((AA0020010Struct)_deployList.get(i)).getCOMP_ITEM_CD());
          }
          
          if(chekflg) {
           
           // 合致した各項目を内部リストより取得
           depParItem = ((AA0020010Struct)_deployList.get(i)).getPARENT_ITEM_CD();
           depComItem = ((AA0020010Struct)_deployList.get(i)).getCOMP_ITEM_CD();
           depEdition = ((AA0020010Struct)_deployList.get(i)).getPS_EDITION();
           
           // 合致レコードの件数を加算
           if(devType == 1) {
        	   set.add(depComItem.trim() + depEdition.trim());
           } else {
        	   set.add(depParItem.trim() + depEdition.trim());
           }
           
           // データ存在フラグ初期化
           boolean isExist = false;
           
           String modify = null;
           
           for(int j=0; j<delList.size(); j++) {
            if(depParItem.equals(((AA0020010Struct)delList.get(j)).getPARENT_ITEM_CD()) &&
             depComItem.equals(((AA0020010Struct)delList.get(j)).getCOMP_ITEM_CD())  &&
             depEdition.equals(((AA0020010Struct)delList.get(j)).getPS_EDITION())   ) {
              
              // データ存在フラグON
              isExist = true;
              
              // 更新回数取得
              modify = ((AA0020010Struct)delList.get(j)).getMODIFY_COUNT();
              break;
            } 
           }
           
           // データ突合せエラー
           if(isExist == false) {
            Message = "Data is rewritten by other processings.";
            setErrorMessageNoKey("ZZ01105", Message);
            
            return null;
           } else {
            // 更新回数チェック
            if(((AA0020010Struct)_deployList.get(i)).getMODIFY_COUNT().equals(modify) == false) {
             Message = "Data is rewritten by other processings.";
             setErrorMessageNoKey("ZZ01105", Message);
             
             return null;
            }
           }
          }
         }
         // 削除するデータ数が内部にあるデータより多い場合
         if(set.size() != delList.size()) {
          Message = "Data is rewritten by other processings.";
          setErrorMessageNoKey("ZZ01105", Message);
          
          return null;
         }
         
         return delList;
        }
         
        /** 
         * @param sTarget チェックする親／子品目番号
         * @param gChkData 内部リストの親／子品目番号
         * @return boolean true:データあり false:データなし
         */
        private boolean checkDataExistence(String sTarget, String gChkData) throws FoundationException
        {
         if(sTarget.equals(gChkData) == true) {
          return true;
         } else {
          return false;
         }
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //------------------------------------------------------------------
              
                String Message = "";
              
                try
                {
              
                 Integer inLevel;
                 
                 // 構成情報リストクリア
                 _deployList.clear();
              
                 List workList = null;	   // 対象品目情報格納
              
                 // 展開レベルのチェック
                 Integer level = Integer.valueOf(_level);
              
                 // 入力した展開レベルをInteger型に変換して取得する
                 inLevel = IntegerConverter.Convert(struct.getw_LEVEL());
              
                 if(level.intValue() < inLevel.intValue()){
                  setErrorMessageNoKey("AA00104", "");
                 }
              
                 // 対象品目情報取得
                 workList = entity.mselectM_ITEM.read(conn, struct);
                 if(workList.size() <= 0){       // 対象品目の取得失敗
                  setReadStatus(INITIAL);
              
                  Message = "M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD();
                  setErrorMessage("ZZ06001", Message);
// 2008/07/11 SYSCOM 小林 ORIGINAL START
//                 } else {
//                  setReadStatus(NORMAL);
//                 }
// 2008/07/11 SYSCOM 小林 ORIGINAL END
// 2008/07/11 SYSCOM 小林 UPD START
                 } else {
                  // 工数管理品目区分チェック
                  if(((AA0020010Struct)workList.get(0)).getCOMP_MANHOUR_TYP().equals("1") 
                     && struct.gets_DEVELOP_TYP().intValue() == 1){
                   Message = "M_ITEM.ITEM_CD:" + struct.getw_TARGET_ITEM_CD();
                   setErrorMessage("AA00178", Message);
                  }else{
                   setReadStatus(NORMAL);
                  }
                 }
// 2008/07/11 SYSCOM 小林 UPD END
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  AA0020010Struct targetStruct = new AA0020010Struct();
                  targetStruct.clear();
                  AA0020010Struct workStruct = (AA0020010Struct)workList.get(0);
                  targetStruct.setPARENT_ITEM_CD(workStruct.getPARENT_ITEM_CD());
                  targetStruct.setPARENT_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
                  targetStruct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
                  targetStruct.setNO(new Integer(1));
                  _deployList.add(targetStruct);
               
                  // 展開レベル'0'でない場合、展開処理実施
                  if(inLevel.intValue() != 0){
               
                   // 製品構成リポジトリ作成
                   ProductStructureRepository repository = new ProductStructureRepository(conn);
               
                   // 正展開?逆展開?
                   if(struct.gets_DEVELOP_TYP().intValue() == 1){
                    // 正展開
                    if(struct.getw_TARGET_DATE() == null ||
                      "".equals(struct.getw_TARGET_DATE()) == true){
                     // 対象日付無
                     getDeploy(repository, struct.getw_TARGET_ITEM_CD(), inLevel, new Integer(2));
                    }
                    else{
                     // 対象日付有
                     Date targetDate = stringToDate(struct.getw_TARGET_DATE());
                     getDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                          inLevel, targetDate, new Integer(2));
                    }
                   }
                   else{
                    // 逆展開
                    if(struct.getw_TARGET_DATE() == null ||
                      "".equals(struct.getw_TARGET_DATE()) == true){
                     // 対象日付無
                     getReverseDeploy(repository, struct.getw_TARGET_ITEM_CD(), inLevel, new Integer(2));
                    }
                    else{
                     // 対象日付有
                     Date targetDate = stringToDate(struct.getw_TARGET_DATE());
                     getReverseDeploy(repository, struct.getw_TARGET_ITEM_CD(), 
                           inLevel, targetDate, new Integer(2));
                    }
                   }
                  }
                 }
              
                 // フラグの表示文字列設定
                 for(int n = 0; n < _deployList.size(); n++){
                  setTypeValueAboutPs((AA0020010Struct)(_deployList.get(n)));
                 }
              
                 list = _deployList;
              
                }catch(ParseException e){
                 // 変換失敗
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
              
                }catch(SQLException e) {
                 setReadStatus(ERROR);
                 setSqlExceptionMsg(e);
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                //------------------------------------------------------------------
                
                // 対象の構成情報をコピー
                AA0020010Struct workStruct = (struct);
                AA0020010Struct insertStruct = new AA0020010Struct();
              
                // 正展開
                if(struct.gets_DEVELOP_TYP().intValue() == 1){
                 // 先頭行(品目のみの行)の場合 親品目番号がサブ画面の品目番号
                 if(struct.getNO().intValue() == 1){
                  insertStruct.setPARENT_ITEM_CD(workStruct.getPARENT_ITEM_CD());
                  insertStruct.setPARENT_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
                 }
                 // 2行目以降は その行の構成品目番号がサブ画面の品目番号
                 else{
                  insertStruct.setPARENT_ITEM_CD(workStruct.getCOMP_ITEM_CD());
                  insertStruct.setPARENT_ITEM_NAME(workStruct.getCOMP_ITEM_NAME());
                 }
                }
                else{
                 // 逆展開のときは 常に親品目番号が サブ画面の構成品目番号
                 insertStruct.setCOMP_ITEM_CD(workStruct.getPARENT_ITEM_CD());
                 insertStruct.setCOMP_ITEM_NAME(workStruct.getPARENT_ITEM_NAME());
                 insertStruct.setSTOCK_UNIT(workStruct.getSTOCK_UNIT());
                }
                //有効開始日付と有効終了日付を初期化します。
            	initialDate();
                insertStruct.setEFF_PHASE_IN_DATE(struct.getEFF_PHASE_IN_DATE());
                insertStruct.setEFF_PHASE_OUT_DATE(struct.getEFF_PHASE_OUT_DATE());
                insertStruct.sets_DEVELOP_TYP(workStruct.gets_DEVELOP_TYP());
                struct.copy(insertStruct);
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                //------------------------------------------------------------------
              
                // 対象の構成情報をコピー
                //struct.copy(struct);
              
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                //------------------------------------------------------------------
                 
                String Message = "";
                 
                // DB更新中フラグ初期化
                bDBUpdate = false;
                 
                try{
                 // トランザクション開始
                 conn.beginTrans();
                 
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 // 存在/更新チェック
                 List countList = entity.mselectM_PS_modify_count.read(conn, struct);
                 if(countList.size() <= 0){
                  Message = "The target data does not exist";
                  setErrorMessageNoKey("ZZ06001", Message);
                 }
                 else{
                  String modify = ((AA0020010Struct)countList.get(0)).getMODIFY_COUNT();
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "Data is rewritten by other processings.";
                   setErrorMessageNoKey("ZZ01105", Message);
                  }
                 }
                 
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                 
                  
                  AA0020010Struct targetStruct = struct;
                  
                  
                  // 製品構成トランザクションへの追加
                  AA0020010Struct addStruct = new AA0020010Struct();
                  addStruct.setsUser_ID(new String(struct.getsUser_ID()));		// ユーザID設定
              
                  List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
                  Long no = null;	 // シーケンシャルNo
                  if(workList.size() <= 0 || 
                    ((AA0020010Struct)workList.get(0)).getSEQ_NO() == null){
                   no = new Long(0);
                  }
                  else{
                   no = ((AA0020010Struct)workList.get(0)).getSEQ_NO();
                  }
                  addStruct.setACCESS_TYP(new Integer(2));	// 処理方法 2:削除
                  addStruct.setCMPLT_FLG(new Integer(0));	 // 完了フラグ 0:未
              
                  if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                   // 正展開
                   addStruct.setCOMP_ITEM_CD(targetStruct.getCOMP_ITEM_CD());
                   addStruct.setPARENT_ITEM_CD(targetStruct.getPARENT_ITEM_CD());
                   addStruct.setSEQ_NO(new Long(no.longValue() + 1));
                   addStruct.setPS_EDITION(targetStruct.getPS_EDITION());
                   //List addList = entity.mselectM_PS_ps_edition.read(conn, addStruct);
                   //for(int i = 0; i < addList.size(); i++){
                   // addStruct.setSEQ_NO(new Long(no.longValue() + i + 1));
                   // addStruct.setPARENT_ITEM_CD(((AA0020010Struct)addList.get(i)).getPARENT_ITEM_CD());
                   // addStruct.setPS_EDITION(((AA0020010Struct)addList.get(i)).getPS_EDITION());
                    entity.minsertSYS_PS_T.create(conn, addStruct);
                   //}
                  }
                  else{
                   // 逆展開
                   addStruct.setPARENT_ITEM_CD(targetStruct.getPARENT_ITEM_CD());
                   addStruct.setCOMP_ITEM_CD(targetStruct.getCOMP_ITEM_CD());
                   addStruct.setSEQ_NO(new Long(no.longValue() + 1));
                   addStruct.setPS_EDITION(targetStruct.getPS_EDITION());
                   //List addList = entity.mselectM_PS_ps_edition.read(conn, addStruct);
                   //for(int i = 0; i < addList.size(); i++){
                   // addStruct.setSEQ_NO(new Long(no.longValue() + i + 1));
                   // addStruct.setCOMP_ITEM_CD(((AA0020010Struct)addList.get(i)).getCOMP_ITEM_CD());
                   // addStruct.setPS_EDITION(((AA0020010Struct)addList.get(i)).getPS_EDITION());
                    entity.minsertSYS_PS_T.create(conn, addStruct);
                   //}
                  }
                  
                  // 削除
                  entity.mdeleteM_PS.delete(conn, targetStruct);
              
                  // コミット
                  conn.commit();
                  
                  // DB更新中フラグOFF
                  bDBUpdate = false;
              
                  // 検索
                  struct.copy(_keyStruct);
                  controlselect();
                 }
                  
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                 }
                }
              
                //------------------------------------------------------------------
                
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * 一括削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldeleteAll");
			//{{user_implement_dev:<controldeleteAll>
                //------------------------------------------------------------------
                 
                // DB更新中フラグ初期化
                bDBUpdate = false;
              
                try{
              
                 // トランザクション開始
                 conn.beginTrans();
                 
                 // DB更新中フラグON
                 bDBUpdate = true;
                 
                 // 削除
                 
                 AA0020010Struct targetStruct = new AA0020010Struct();
                 targetStruct.copy(struct);
              
                 // シーケンシャルNo取得
                 List workList = entity.mselectSYS_PS_T.read(conn, targetStruct);
                 Long no = null;	 // シーケンシャルNo
                 if(workList.size() <= 0 || 
                   ((AA0020010Struct)workList.get(0)).getSEQ_NO() == null){
                  no = new Long(0);
                 }
                 else{
                  no = ((AA0020010Struct)workList.get(0)).getSEQ_NO();
                 }
                 AA0020010Struct addStruct = new AA0020010Struct();
                 addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ユーザID設定
                 addStruct.setACCESS_TYP(new Integer(2));					// 処理方法 2:削除
                 addStruct.setCMPLT_FLG(new Integer(0));					 // 完了フラグ 0:未
              
                 List deleteList = null;
                 if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                  // 正展開
                  targetStruct.setCOMP_ITEM_CD(null);
                 }
                 else{
                  // 逆展開
                  targetStruct.setPARENT_ITEM_CD(null);
                 }
              
                 deleteList = checkTargetDataIn(targetStruct, _keyStruct.gets_DEVELOP_TYP().intValue());
                 
                 // エラーが発生していない場合、更新処理実施
                 if(deleteList != null)
                 {
                 
                  for(int i = 0; i < deleteList.size(); i++){
                   // 削除
                   entity.mdeleteM_PS.delete(conn, (AA0020010Struct)deleteList.get(i));
                  }
                  
                  // 製品構成トランザクション追加
                  for(int i = 0; i < deleteList.size(); i++){
                   addStruct.setSEQ_NO(new Long(no.longValue() + 1 + i));
                   addStruct.setPARENT_ITEM_CD(((AA0020010Struct)deleteList.get(i)).getPARENT_ITEM_CD());
                   addStruct.setCOMP_ITEM_CD(((AA0020010Struct)deleteList.get(i)).getCOMP_ITEM_CD());
                   addStruct.setPS_EDITION(((AA0020010Struct)deleteList.get(i)).getPS_EDITION());
                   entity.minsertSYS_PS_T.create(conn, addStruct);
                  }
              
                  // コミット
                  conn.commit();
                  
                  // DB更新中フラグOFF
                  bDBUpdate = false;
              
                  // 検索
                  struct.copy(_keyStruct);
                  controlselect();
                 }
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                 }
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controldeleteAll>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controldeleteAll");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdateSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");
			//{{user_implement_dev:<controlupdateSub1>
                //------------------------------------------------------------------
              
                String Message = "";
                
                // DB更新中フラグ初期化
                bDBUpdate = false;
              
                try{
                 // トランザクション開始
                 conn.beginTrans();
                 
                 // DB更新中フラグON
                 bDBUpdate = true;
              
                 boolean result = false;		 // チェック結果格納用
              
                 
                 // 存在/更新チェック
                 List countList = entity.mselectM_PS_modify_count.read(conn, struct);
                 if(countList.size() <= 0){
                  Message = "The target data does not exist";
                  setErrorMessageNoKey("ZZ06001", Message);
                 }
                 else{
                  String modify = ((AA0020010Struct)countList.get(0)).getMODIFY_COUNT();
                  if (struct.getMODIFY_COUNT().equals(modify) == false)
                  {
                   Message = "Data is rewritten by other processings.";
                   setErrorMessageNoKey("ZZ01105", Message);
                  }
                 }
                 
                 // 有効日範囲の重複チェック
                 result = checkEffectiveDate_update(struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD(),
                   struct.getPS_EDITION(), struct.getEFF_PHASE_IN_DATE(), struct.getEFF_PHASE_OUT_DATE());
                 if(result == false){
                  Message = "Data is rewritten by other processings.";
                  setErrorMessageNoKey("AA00054", "");
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 入力値チェック
                  checkStruct(struct);
              
                  // 更新
                  entity.mupdateSub1M_PS.update(conn, struct);
               
                  // コミット
                  conn.commit();
                  
                  // DB更新中フラグOFF
                  bDBUpdate = false;
               
                  // 検索
                  struct.copy(_keyStruct);
                  controlselect();
              
                 }
              
                }catch(ParseException e){
                 // 変換失敗
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                } finally {
                 // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
                 if(bDBUpdate == true)
                 {
                  // ロールバック
                  conn.rollback();
              
                  // DB更新中フラグOFF
                  bDBUpdate = false;
                 }
                }
              
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<controlupdateSub1>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlupdateSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //------------------------------------------------------------------
                // キーコピー
                struct.copy(_keyStruct);
              
                //再検索
                controlselect();
                //------------------------------------------------------------------
              
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //----------------------------------------------------------------------
              
                // 初期化
                _keyStruct = new AA0020010Struct();
                struct.initialize();
                struct.setw_LEVEL(_initlevel);
              
                // 製品構成リストクリア
                _deployList.clear();
              
                // レベル設定
                _keyStruct.setw_LEVEL(_initlevel);
              
                setReadStatus(INITIAL);
              
                //----------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //------------------------------------------------------------------
              
                String Message = "";
                List listMessage = new ArrayList();
              
                try{
                 // トランザクション開始
                 conn.beginTrans();
              
                 boolean result = false;		 // チェック結果格納用
              
                 // 製品構成リポジトリ作成
                 ProductStructureRepository repository = new ProductStructureRepository(conn);
              
                 // 追加品目情報チェック
                 if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                  // 正展開
                  struct.setITEM_CD(struct.getCOMP_ITEM_CD());
                  result = entity.mcheckM_ITEM.check(conn, struct);
                  if(result == false){    // 対象品目の取得失敗
                   Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                   setErrorMessage("ZZ06001", Message);
                  }
                 }
                 else{
                  // 逆展開
                  struct.setITEM_CD(struct.getPARENT_ITEM_CD());
                  result = entity.mcheckM_ITEM.check(conn, struct);
                  if(result == false){    // 対象品目の取得失敗
                   Message = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                   setErrorMessage("ZZ06001", Message);
                  }
                 }
              
// 2008/07/11 SYSCOM 小林 ADD START
                 // 工数管理品目区分チェック
                 AA0020010Struct checkStruct = new AA0020010Struct();
                 checkStruct.setw_TARGET_ITEM_CD(struct.getPARENT_ITEM_CD());
                 List checkList = entity.mselectM_ITEM.read(conn, checkStruct);
                 if(checkList.size() > 0){
                  if(((AA0020010Struct)checkList.get(0)).getCOMP_MANHOUR_TYP().equals("1")){
                   Message = "M_ITEM.ITEM_CD:" + struct.getPARENT_ITEM_CD();
                   setErrorMessage("AA00178", Message);
                  }
                 }
// 2008/07/11 SYSCOM 小林 ADD END
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 品目手配区分別構成チェック
                  if(checkMRP_ODR_TYP(repository, 
                    struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD()) == false){
                   Message = "Item arrangements classification composition is inaccurate";
                   setErrorMessageNoKey("AA00052", Message);
                  }
                  
                  // 製品構成重複チェック
                  result = entity.mcheckM_PS_ps_edition.check(conn, struct);
                  if(result == true){
                   listMessage.add("M_PS.PARENT_ITEM_CD:" + struct.getPARENT_ITEM_CD());
                   listMessage.add("M_PS.COMP_ITEM_CD:" + struct.getCOMP_ITEM_CD());
                   listMessage.add("M_PS.PS_EDITION:" + struct.getPS_EDITION());
                   setErrorMessage("ZZ01102", listMessage);
                  }
              
                  // 有効日範囲の重複チェック
                  result = checkEffectiveDate_insert(struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD(),
                    struct.getEFF_PHASE_IN_DATE(), struct.getEFF_PHASE_OUT_DATE());
                  if(result == false){
                   setErrorMessageNoKey("AA00054", "");
                  }
              
                  // ルーピングチェック true:有  false:無
                  if(_keyStruct.gets_DEVELOP_TYP().intValue() == 1){
                   if(checkReverseRooping(repository, 
                    struct.getCOMP_ITEM_CD(), struct.getPARENT_ITEM_CD()) == true){
                     setErrorMessageNoKey("AA00055", "");
                   }
                  }
                  else{
                   if(checkRooping(repository, 
                    struct.getPARENT_ITEM_CD(), struct.getCOMP_ITEM_CD()) == true){
                     setErrorMessageNoKey("AA00055", "");
                   }
                  }
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 入力値チェック
                  checkStruct(struct);
              
                  // 登録
                  entity.minsertSub1M_PS.create(conn, struct);
                
                  // 製品構成トランザクション登録
                  List workList = entity.mselectSYS_PS_T.read(conn, struct);
                  Long no = null;	 // シーケンシャルNo
                  if(workList.size() <= 0 || 
                    ((AA0020010Struct)workList.get(0)).getSEQ_NO() == null){
                   no = new Long(0);
                  }
                  else{
                   no = ((AA0020010Struct)workList.get(0)).getSEQ_NO();
                  }
                  AA0020010Struct addStruct = new AA0020010Struct();
                  addStruct.setsUser_ID(new String(struct.getsUser_ID()));	// ユーザID設定
                  addStruct.setACCESS_TYP(new Integer(1));					// 処理方法 1:削除
                  addStruct.setCMPLT_FLG(new Integer(0));					 // 処理方法 0:未
                  addStruct.setSEQ_NO(new Long(no.longValue() + 1));
                  addStruct.setPARENT_ITEM_CD(struct.getPARENT_ITEM_CD());
                  addStruct.setCOMP_ITEM_CD(struct.getCOMP_ITEM_CD());
                  addStruct.setPS_EDITION(struct.getPS_EDITION());
                  entity.minsertSYS_PS_T.create(conn, addStruct);
                
                  // コミット
                  conn.commit();
                
                  // 検索
                  struct.copy(_keyStruct);
                  controlselect();
                 }
              
                }catch(ParseException e){
                 // 変換失敗
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 throw ee;
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0020");
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
               //------------------------------------------------------------------
              
                try{
              
                 PrivateConfig c = new PrivateConfig(conn);
              
                 // 初期展開レベル取得
                 Integer initlevel = c.getNumber("INIT_DISPLAY_PS_LEVEL");
                 if(initlevel == null){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The initial deployment level is not defined" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
                 else if(initlevel.intValue() < 0){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The value of an initial deployment level is not right" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
                 // 最大展開レベル取得
                 Integer level = c.getNumber("MAX_DISPLAY_PS_LEVEL");
                 if(level == null){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max deployment level is not defined" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
                 else if(level.intValue() < 0){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(emsg);
                  // ログ出力のみ
                  ExpjMessage log = new ExpjMessage( "ZZ01006", "The max of an initial deployment level is not right" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw ee;
                 }
              
                 _level = level.toString();
                 _initlevel = initlevel.toString();
                 _keyStruct.setw_LEVEL(_initlevel);
              
                 // コンボボックスデータ用意
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);
              
                 _DEVELOP_TYP = comboController.getData("DEVELOP_TYP");
// 2008/07/11 SYSCOM 小林 ADD START
                 _MANHOUR_TYP = comboController.getData("MANHOUR_TYP");
// 2008/07/11 SYSCOM 小林 ADD END
                 _CONS_TYP = comboController.getData("CONS_TYP");
                 _COST_UP_TYP = comboController.getData("COST_UP_TYP");
                 _MRP_EXP_TYP = comboController.getData("MRP_EXP_TYP");
                 _PS_LT_FLG = comboController.getData("PS_LT_FLG");
                 comboController.setConnection(null);
              
                 controlclear();
              
                }catch(SQLException e) {
                 setSqlExceptionMsg(e);
              
                }catch(ComboException e){
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 throw ee;
                }
                
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("deleteAll") ) {
				controldeleteAll();
			} else if( button.equals("updateSub1") ) {
				controlupdateSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
               //------------------------------------------------------------------
                struct.setList_s_DEVELOP_TYP_val(_DEVELOP_TYP.getValList());
                struct.setList_s_DEVELOP_TYP_name(_DEVELOP_TYP.getExplanList());
                struct.setList_s_CONS_TYP_val(_CONS_TYP.getValList());
                struct.setList_s_CONS_TYP_name(_CONS_TYP.getExplanList());
                struct.setList_s_COST_UP_TYP_val(_COST_UP_TYP.getValList());
                struct.setList_s_COST_UP_TYP_name(_COST_UP_TYP.getExplanList());
                struct.setList_s_MRP_EXP_TYP_val(_MRP_EXP_TYP.getValList());
                struct.setList_s_MRP_EXP_TYP_name(_MRP_EXP_TYP.getExplanList());
                struct.setList_s_MRP_EXP_TYP_val(_MRP_EXP_TYP.getValList());
                struct.setList_s_MRP_EXP_TYP_name(_MRP_EXP_TYP.getExplanList());
              
              //	      } catch(AlarmMessageException ame){
              //		      ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //		      throw ee;
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
//			throw new FoundationException("AA0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020010-E999","CSVの出力処理"));
			throw new FoundationException("AA0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0020010Entity entity;
	protected AA0020010Struct struct;
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

		entity = new AA0020010Entity();
		struct = new AA0020010Struct();

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
	 * AA0020010クラスの標準コンストラクタ
	 */
	public AA0020010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
              
                list = new ArrayList(0);
                
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
				AA0020010Struct key = (AA0020010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO().toString());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_TYP_name") && key.gets_CONS_TYP_name() != null) {
					msgKey.setKeyValue("s_CONS_TYP_name", key.gets_CONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_TYP_val") && key.gets_CONS_TYP_val() != null) {
					msgKey.setKeyValue("s_CONS_TYP_val", key.gets_CONS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_name") && key.gets_COST_UP_TYP_name() != null) {
					msgKey.setKeyValue("s_COST_UP_TYP_name", key.gets_COST_UP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_val") && key.gets_COST_UP_TYP_val() != null) {
					msgKey.setKeyValue("s_COST_UP_TYP_val", key.gets_COST_UP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_name") && key.gets_MRP_EXP_TYP_name() != null) {
					msgKey.setKeyValue("s_MRP_EXP_TYP_name", key.gets_MRP_EXP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_val") && key.gets_MRP_EXP_TYP_val() != null) {
					msgKey.setKeyValue("s_MRP_EXP_TYP_val", key.gets_MRP_EXP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("s_CONS_NAME") && key.gets_CONS_NAME() != null) {
					msgKey.setKeyValue("s_CONS_NAME", key.gets_CONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_NAME") && key.getPS_LT_NAME() != null) {
					msgKey.setKeyValue("PS_LT_NAME", key.getPS_LT_NAME());
				}
				if(msgKeyType.containsKeyColumn("COST_UP_NAME") && key.getCOST_UP_NAME() != null) {
					msgKey.setKeyValue("COST_UP_NAME", key.getCOST_UP_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_EXP_NAME") && key.getMRP_EXP_NAME() != null) {
					msgKey.setKeyValue("MRP_EXP_NAME", key.getMRP_EXP_NAME());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_CHECK") && key.getPS_LT_CHECK() != null) {
					msgKey.setKeyValue("PS_LT_CHECK", key.getPS_LT_CHECK());
				}
				if(msgKeyType.containsKeyColumn("COMP_MANHOUR_NAME") && key.getCOMP_MANHOUR_NAME() != null) {
					msgKey.setKeyValue("COMP_MANHOUR_NAME", key.getCOMP_MANHOUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
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
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME") && key.getCOMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("COMP_ITEM_NAME", key.getCOMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("COMP_MANHOUR_TYP") && key.getCOMP_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("COMP_MANHOUR_TYP", key.getCOMP_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("ACCESS_TYP") && key.getACCESS_TYP() != null) {
					msgKey.setKeyValue("ACCESS_TYP", key.getACCESS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("CMPLT_FLG") && key.getCMPLT_FLG() != null) {
					msgKey.setKeyValue("CMPLT_FLG", key.getCMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD") && key.getw_TARGET_ITEM_CD() != null) {
					msgKey.setKeyValue("w_TARGET_ITEM_CD", key.getw_TARGET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("P_VALUE") && key.getP_VALUE() != null) {
					msgKey.setKeyValue("P_VALUE", key.getP_VALUE());
				}
				if(msgKeyType.containsKeyColumn("P_NAME") && key.getP_NAME() != null) {
					msgKey.setKeyValue("P_NAME", key.getP_NAME());
				}
				if(msgKeyType.containsKeyColumn("P_PLANT_CD") && key.getP_PLANT_CD() != null) {
					msgKey.setKeyValue("P_PLANT_CD", key.getP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("P_USER_CD") && key.getP_USER_CD() != null) {
					msgKey.setKeyValue("P_USER_CD", key.getP_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("P_BUSINESS_DATE") && key.getP_BUSINESS_DATE() != null) {
					msgKey.setKeyValue("P_BUSINESS_DATE", key.getP_BUSINESS_DATE());
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
					AA0020010Struct key = new AA0020010Struct();
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
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(new Integer(msgKey.getKeyValue("NO")));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_TYP_name")) {
						key.sets_CONS_TYP_name(msgKey.getKeyValue("s_CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_TYP_val")) {
						key.sets_CONS_TYP_val(msgKey.getKeyValue("s_CONS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_name")) {
						key.sets_COST_UP_TYP_name(msgKey.getKeyValue("s_COST_UP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_COST_UP_TYP_val")) {
						key.sets_COST_UP_TYP_val(msgKey.getKeyValue("s_COST_UP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_name")) {
						key.sets_MRP_EXP_TYP_name(msgKey.getKeyValue("s_MRP_EXP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("s_MRP_EXP_TYP_val")) {
						key.sets_MRP_EXP_TYP_val(msgKey.getKeyValue("s_MRP_EXP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("s_CONS_NAME")) {
						key.sets_CONS_NAME(msgKey.getKeyValue("s_CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_NAME")) {
						key.setPS_LT_NAME(msgKey.getKeyValue("PS_LT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COST_UP_NAME")) {
						key.setCOST_UP_NAME(msgKey.getKeyValue("COST_UP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_EXP_NAME")) {
						key.setMRP_EXP_NAME(msgKey.getKeyValue("MRP_EXP_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_CHECK")) {
						key.setPS_LT_CHECK(msgKey.getKeyValue("PS_LT_CHECK"));
					}
					if(msgKeyType.containsKeyColumn("COMP_MANHOUR_NAME")) {
						key.setCOMP_MANHOUR_NAME(msgKey.getKeyValue("COMP_MANHOUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
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
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME")) {
						key.setCOMP_ITEM_NAME(msgKey.getKeyValue("COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("COMP_MANHOUR_TYP")) {
						key.setCOMP_MANHOUR_TYP(msgKey.getKeyValue("COMP_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(new Long(msgKey.getKeyValue("SEQ_NO")));
					}
					if(msgKeyType.containsKeyColumn("ACCESS_TYP")) {
						key.setACCESS_TYP(new Integer(msgKey.getKeyValue("ACCESS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("CMPLT_FLG")) {
						key.setCMPLT_FLG(new Integer(msgKey.getKeyValue("CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_TARGET_ITEM_CD")) {
						key.setw_TARGET_ITEM_CD(msgKey.getKeyValue("w_TARGET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("P_VALUE")) {
						key.setP_VALUE(msgKey.getKeyValue("P_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("P_NAME")) {
						key.setP_NAME(msgKey.getKeyValue("P_NAME"));
					}
					if(msgKeyType.containsKeyColumn("P_PLANT_CD")) {
						key.setP_PLANT_CD(msgKey.getKeyValue("P_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("P_USER_CD")) {
						key.setP_USER_CD(msgKey.getKeyValue("P_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("P_BUSINESS_DATE")) {
						key.setP_BUSINESS_DATE(msgKey.getKeyValue("P_BUSINESS_DATE"));
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
