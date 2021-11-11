/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KT0010/src/com/nec/jp/orteus/metamorBase/KT0010/KT0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KT0010;

import com.nec.jp.orteus.metamorBase.KT0010.*;
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
import java.text.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KT0010010Control
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
        public KT0010010Struct getListvalue(int x) { return (KT0010010Struct)(this.list.get(x)); }	// リストの値を返します。
        public KT0010010Struct getStruct() { return this.struct; }	// Structを返します。
        public KT0010010Struct createStruct() { return new KT0010010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((KT0010010Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        /**
         * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         */
        private void setInformationMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addInfo(emsg);
        }
        /**
         * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         */
        private void setWarningMessage(String code) {
         ExpjMessage emsg = new ExpjMessage(code);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
        /**
         * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
         * @param code メッセージコード
         * @param value1 置換文字列１
         */
        private void setWarningMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
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
         */
        private void setErrorMessage(String code, String value1) {
         ExpjMessage emsg = new ExpjMessage(code, value1);
         msgStruct.addError(emsg);
         sysLog.warning(emsg, sysUSER_CD);
        }
       
        /**
         * 業務エラー発生時のパラメータ設定処理を切り出して関数化
         * @param tableName テーブル名
         * @param columnName カラム名
         * @param value 値
         */
        private void setErrorParameter(String tableName, String columnName, String value) {
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
       
        /**
         * 業務警告発生時のパラメータ設定処理を切り出して関数化
         * @param tableName テーブル名
         * @param columnName カラム名
         * @param value 値
         */
        private void setWarningParameter(String tableName, String columnName, String value) {
         StringBuffer param = new StringBuffer();
         param.append(tableName);
         param.append('.');
         param.append(columnName);
         param.append(':');
         if (value != null) {
          param.append(value);
         }
       
         ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
         msgStruct.addWarn(emsg);
         sysLog.info(emsg, sysUSER_CD);
        }
       
        /**
         * 画面の全項目を初期化します。
         * ここでは、キー項目の初期化と詳細項目の初期化を行います。
         */
        private void initializeAll() {
         struct.setDESINATED_DLV_DATE(null);
                       struct.setODR_NO(null);
         struct.setr1_STS_TYP("true");
         struct.setr2_STS_TYP(null);
         struct.setCUST_CD(null);
         struct.setITEM_CD(null);
         struct.setCUST_CHRG_PSN_CD(null);
         struct.setCUST_ODR_NO(null);
         initializeDetail();
        }
       
        /**
         * 画面の詳細項目を初期化します。
         * ここでは、キー以外の項目の初期化を行います。
         */
        private void initializeDetail() {
         list = null;
         readStatus = INITIAL;
        }
       
        /**
         * クライアントで編集されたViewの値をStructに格納して返します。
         * クライアントより送信された行（struct.getList_XXXX内に格納された値）
         * をStruct内に設定します。
         * @param index 要素のインデックス
         * @return クライアントで編集されたViewの値を格納したStruct
         * @throws IndexOutOfBoundsException 送信されたViewのインデックスの範囲外の場合
         */
        private KT0010010Struct getStructAt(int index) {
         KT0010010Struct s = new KT0010010Struct();
         // 選択を設定
         s.setKT0010010view1_selected((String) struct.getList_KT0010010view1_selected().get(index));
         // 品目番号を設定
         s.setl_ITEM_CD((String) struct.getList_l_ITEM_CD().get(index));
         // 得意先注文番号
         s.setl_CUST_ODR_NO((String) struct.getList_l_CUST_ODR_NO().get(index));
         // 指定納期を設定
         s.setl_DESINATED_DLV_DATE((String) struct.getList_l_DESINATED_DLV_DATE().get(index));
         // 受注番号を設定
         s.setl_ODR_NO((String) struct.getList_l_ODR_NO().get(index));
         // 得意先コード
         s.setl_CUST_CD((String) struct.getList_l_CUST_CD().get(index));
         // 顧客品目番号を設定
         s.setl_CUST_ITEM_CD((String) struct.getList_l_CUST_ITEM_CD().get(index));
         // 注文数量を設定
         s.setl_ODR_QTY((String) struct.getList_l_ODR_QTY().get(index));
         // 計画残を設定
         s.setl_SHIP_PLAN_REMAIN_QTY((String) struct.getList_l_SHIP_PLAN_REMAIN_QTY().get(index));
         // 出荷指定日を設定
         s.setl_DESINATED_SHIP_DATE((String) struct.getList_l_DESINATED_SHIP_DATE().get(index));
         // 数量を設定
         s.setl_DESINATED_SHIP_QTY((String) struct.getList_l_DESINATED_SHIP_QTY().get(index));
         // 単位
         s.setl_PKG_UNIT((String) struct.getList_l_PKG_UNIT().get(index));
         // 倉庫（表示）を設定
         s.setl_DEPO_TYP((String) struct.getList_l_DEPO_TYP().get(index));
         // 品目名
         s.setl_ITEM_NAME((String) struct.getList_l_ITEM_NAME().get(index));
         // 得意先名
         s.setl_CUST_NAME((String) struct.getList_l_CUST_NAME().get(index));
         // 得意先品目名称
         s.setl_CUST_ITEM_NAME((String) struct.getList_l_CUST_ITEM_NAME().get(index));
         // 製番
         s.setl_JOB_ODR_CD((String) struct.getList_l_JOB_ODR_CD().get(index));
         // 備考
         s.setl_REMARKS((String) struct.getList_l_REMARKS().get(index));
         // 分割不可（表示）を設定
         s.setl_PARTIAL_SHIP_INST_FLG((String) struct.getList_l_PARTIAL_SHIP_INST_FLG().get(index));
         // 分割不可を設定
         s.setPARTIAL_SHIP_INST_FLG((String) struct.getList_PARTIAL_SHIP_INST_FLG().get(index));
         // 分納項番を設定
         s.setl_PART_DLV_SEQ_NO((String) struct.getList_l_PART_DLV_SEQ_NO().get(index));
         // 出荷指定数量を設定
         s.setl_bk_DESINATED_SHIP_QTY((String) struct.getList_l_bk_DESINATED_SHIP_QTY().get(index));
         // 更新回数を設定
         s.setl_MODIFY_COUNT((String) struct.getList_l_MODIFY_COUNT().get(index));
         // 在庫数単位区分
         s.setl_UNIT_QTY_TYP((String) struct.getList_l_UNIT_QTY_TYP().get(index));
         // 出荷倉庫コード
         s.setl_SHIP_WH_CD((String) struct.getList_l_SHIP_WH_CD().get(index));
         // 工場コード
         s.setl_SHIP_PLANT_CD((String) struct.getList_l_SHIP_PLANT_CD().get(index));
       
         return s;
        }
       
        /**
         * クライアントで編集された値で list を最新の状態に更新します。
         */
        private void refreshList() {
       
         if (list == null) {
          list = new ArrayList();
         } else {
          list.clear();
         }
         int listSize = (list == null ? 0 : struct.getList_l_ODR_NO().size());
         for (int i = 0; i < listSize; i++) {
          list.add(getStructAt(i));
         }
        }
       
        /**
         * [出荷計画]より "受注番号" = 引数の条件で取得した分納項番の
         * 最大値 + 1 の文字列表現を返します。[出荷計画]にデータが
         * 存在しない場合は "1" を返します。
         * @param odrNo 受注番号
         * @return [出荷計画]."受注番号"で取得した分納項番の最大値 + 1
         * @throws FoundationException SQL文がPDConnecterに存在しない場合
         * @throws SQLException SQLの実行において予期しない例外が発生した場合
         */
        private String getMaxPartDlvSeqNo(String odrNo)
         throws FoundationException, SQLException {
       
         struct.setl_ODR_NO(odrNo);
         List seqNoList = entity.mMax_PART_DLV_SEQ_NO.read(conn, struct);
       
         // 分納項番が存在しない場合は "1" を返却する
         if (seqNoList.isEmpty()) {
          return "1";
         }
         // 最大分納項番 + 1 を返却する
         KT0010010Struct seqNoStruct = (KT0010010Struct) seqNoList.get(0);
         return Calculate.add(seqNoStruct.getl_PART_DLV_SEQ_NO(), "1");
        }
       
        /**
         * 指定納期、運送日数を指定して最適な出荷指定日を計算して返します。
         * 出荷予定日の計算は共通部品を使用し、以下の計算で取得できる最初の
         * 稼働日で算出されます。<p>
         * 「指定納期 - 運送日数 - 出荷準備リードタイム」<p>
         * この処理を行う場合、引数のStructに指定納期、運送日数を指定する
         * 必要があります。運送日数を指定しない場合は、運送日数0として計算します。
         * 指定納期を指定しない場合は処理が適切に行われないため
         * IllegalArgumentExceptionをthrowします。
         * @param s 出荷指定日を計算するために必要なStruct
         * @return 出荷指定日の文字列表現
         * @throws IllegalArgumentException 指定納期が設定されていない場合
         * @throws NumberFormatException 運送日数、出荷準備LTが数値ではない場合
         * @throws ParseException 指定納期が日付解析できない場合
         * @throws FoundationException 業務日付計算部品の呼び出しで予期しないエラーが発生した場合
         * @throws ExpjException 業務日付計算部品が日付を計算できなかった場合
         */
        private String getDesinatedShipDate(KT0010010Struct s)
         throws ParseException, FoundationException, ExpjException {
       
         String desinatedDlvDateStr = s.getl_DESINATED_DLV_DATE();
       
         // 指定納期が指定されない場合はエラー
         if (desinatedDlvDateStr == null || desinatedDlvDateStr.equals("")) {
          throw new IllegalArgumentException();
         }
         String transportLt = s.getl_TRANSPORT_LT();
         // 運送日数が指定されない場合は0とし警告を表示する。
         if (transportLt == null || transportLt.equals("")) {
          transportLt = "0";
          setWarningMessage("KT00006");
          setWarningParameter("T_ODR", "ODR_NO", s.getl_ODR_NO());
         }
       
         // 業務日付計算部品に渡す加算日(運送日数+出荷準備LT)を計算する
         int amount = Integer.parseInt(Calculate.add(transportLt, shipLt));
       
         // 指定納期をDateに変換する
         //DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
         //Date desinatedDlvDate = dateFormat.parse(desinatedDlvDateStr);
         Date desinatedDlvDate = Converter.strToDate(desinatedDlvDateStr, "yyyy/MM/dd");
       
         // 業務日付計算部品の生成
         WorkCalendar workCal = new WorkCalendar(conn
          , sysUSER_CD
          , business.getBusinessCd()
          , s.getl_SHIP_PLANT_CD()
          , desinatedDlvDate
          , amount * (-1)  // 引き算のため-1をかける
          , false);
       
         Date wkDate = workCal.calcDate();
       
         if (wkDate == null) {
          throw new ExpjException("KQ00040");
         }
       
         //return dateFormat.format(wkDate);
         return Converter.dateToStr(wkDate, "yyyy/MM/dd");
        }
       
        /** 業務運用日。リロード時に取得する。*/
        private String businessOprDate;
        /** 出荷準備リードタイム。リロード時に取得する。*/
        private String shipLt;
        /** 販売用工場コード。リロード時に取得する。*/
        private String plantCd;
	
	//コンボボックスの説明取得（多言語）
	public String multcombo(String comname,String value) throws BusinessProcessException, FoundationException {
		try {
			ComboBox com = new ComboBox(conn, sysUSER_CD);
			ComboStruct _comstruct = new ComboStruct();
			_comstruct = com.getData(comname);
			for (int j = 0; j < _comstruct.size(); j++) {
				if ((_comstruct.getData(j)[0]).equals(value)) {
					return _comstruct.getData(j)[1];
				}
			}
			return null;
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}
       
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                try {
              
                 initializeDetail();
              
                 struct.setCOMPANY_CD("00");
                                      List dateList = entity.mSYS_MY_COMPANY.read(conn, struct);
                                      if (!dateList.isEmpty()) {
                                              KT0010010Struct s = (KT0010010Struct)dateList.get(0);
                                              struct.setCOMPANY_CD(s.getCOMPANY_CD());
                                      }
              
                 // 追加計画（計画登録）かどうか
                 boolean isAddedPlan = "true".equals(struct.getr1_STS_TYP());
              
               
                 int maxLine = sp.getMaxLine(conn, 10);
                 if(maxLine !=0){
                	 struct.setROW_COUNT(String.valueOf(maxLine));
                 } else{
                	 struct.setROW_COUNT(null);
                 }
                 // フォーム情報検索
                 List viewList;
                 if (isAddedPlan) {
                  viewList = entity.mViewCnt.read(conn, struct);
                 } else {
                  viewList = entity.mView2Cnt.read(conn, struct);
                 }
                 long rowCount = Long.parseLong(((KT0010010Struct) viewList.get(0)).getl_COUNT());
                 // 検索結果が0件の場合はエラー
                 if (rowCount ==0) {
                  setErrorMessage("ZZ06001");
                  readStatus = NOT_FOUND;
                  if(list!=null &&list.size()>0){
                	  list.clear();
                  }
                  return;
                 }
                 // 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
                 if ((maxLine != 0) && (rowCount == maxLine+1)) {
                  setErrorMessage("ZZ01115", String.valueOf(maxLine));
                  readStatus = TOO_MANY;
                  if(list!=null &&list.size()>0){
                	  list.clear();
                  }
                  return;
                 }
                 // フォーム情報検索
                
                 if (isAddedPlan) {
                  viewList = entity.mView.read(conn, struct);
                 } else {
                  viewList = entity.mVew2.read(conn, struct);
                 }
                 // 未計画の場合は出荷指定日を計算する。
                 if (isAddedPlan) {
                  for (Iterator i = viewList.iterator(); i.hasNext();) {
                   KT0010010Struct s = (KT0010010Struct) i.next();
                   // 運送日数の検索
                   List custBaseList = entity.mM_CUST_BASE.read(conn, s);
              
                   // 運送日数が取得できない場合は警告を表示する。
                   if (custBaseList.isEmpty()) {
                    setWarningMessage("KT00006");
                    setWarningParameter("T_ODR", "ODR_NO", s.getl_ODR_NO());
                    setWarningParameter("T_ODR_CTL", "CUST_CD", s.getl_CUST_CD());
                    setWarningParameter("T_ODR", "DLV_LOC_CD", s.getl_DLV_LOC_CD());
                    s.setl_TRANSPORT_LT("0");
                   } else {
                    KT0010010Struct custBaseStruct = (KT0010010Struct) custBaseList.get(0);
                    s.setl_TRANSPORT_LT(custBaseStruct.getl_TRANSPORT_LT());
                   }
              
                   // 出荷指定日の取得
                   s.setl_DESINATED_SHIP_DATE(getDesinatedShipDate(s));
                  }
                 }
              
                 // リストデータ設定
                 setList(viewList);
                 
                 KT0010010Struct TempStruct;
                 for (int i = 0; i < this.list.size(); i++) {
                 	TempStruct = (KT0010010Struct)list.get(i);
                 	TempStruct.setl_DEPO_TYP(this.multcombo("DEPO_TYP",TempStruct.getl_DEPO_TYP()));
                 	TempStruct.setl_PARTIAL_SHIP_INST_FLG(this.multcombo("PARTIAL_SHIP_INST_FLG",TempStruct.getPARTIAL_SHIP_INST_FLG()));
                 }
                               
                 readStatus = NORMAL;
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ParseException e) {
                 throw new ExpjException(e);
                }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 選択登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                try {
                 // 編集されたリスト情報を更新
                 refreshList();
                 // [受注明細]を計算結果で更新するために、一時データを格納するMap
                 Map map = new HashMap();
              
                 for (Iterator i = list.iterator(); i.hasNext();) {
                  // 行のStructを取得
                  KT0010010Struct s = (KT0010010Struct)i.next();
              
                  // 選択されてない場合は次の行を読み込む
                  if (!"true".equals(s.getKT0010010view1_selected())) {
                   continue;
                  }
              
                  // 選択行の計画残数検索
                  List odrList = entity.mT_ODR.read(conn, s);
              
                  // 受注番号に対応する[受注明細]が存在しない場合はエラー。
                  if (odrList.isEmpty()) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  KT0010010Struct odrStruct = (KT0010010Struct) odrList.get(0);
                  // 読込時の更新回数と異なる場合はエラー
                  if (!s.getl_MODIFY_COUNT().equals(odrStruct.getl_MODIFY_COUNT())) {
                   setErrorMessage("KQ00055");
                   return;
                  }
              
                                              // 整数管理チェック
                                              //System.out.println("s.getl_UNIT_QTY_TYP()" + s.getl_UNIT_QTY_TYP());
                                              if ("1".equals(s.getl_UNIT_QTY_TYP())) {
                                                  // 整数管理
                                                  if (s.getl_DESINATED_SHIP_QTY().indexOf(".") >= 0) {
                                                      // 小数入力の場合：切上げ
                                                      String tempString = s.getl_DESINATED_SHIP_QTY();
                                                      double tempDouble1 = Double.parseDouble(tempString);
                                                      s.setl_DESINATED_SHIP_QTY(Calculate.ceil(s.getl_DESINATED_SHIP_QTY(), 0));
                                                      double tempDouble2 = Double.parseDouble(s.getl_DESINATED_SHIP_QTY());
                                                      if (tempDouble1 != tempDouble2) {
                                                          // ".0"入力除外
                                                          setWarningMessage("KQ20004");
                                                          setWarningParameter("T_ANS_DLV_DATE", "DESINATED_SHIP_QTY", tempString);
                                                      }
                                                  }
                                              }
              
                  // 選択行のODR_NO
                  String odrNo = s.getl_ODR_NO();
              
                  // 更新対象行の出荷計画残数をMapに格納する
                  if (!map.containsKey(odrNo)) {
                   map.put(odrNo, odrStruct.getl_SHIP_PLAN_REMAIN_QTY());
                  }
                  // 出荷計画残数から数量を引いて残数を計算してMapを更新する
                  String qty = (String) map.get(odrNo);
                  qty = Calculate.subtract(qty, s.getl_DESINATED_SHIP_QTY());
                  map.put(odrNo, qty);
              
                  // [出荷計画]登録
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_PART_DLV_SEQ_NO(getMaxPartDlvSeqNo(odrNo));
                  struct.setl_DESINATED_SHIP_DATE(s.getl_DESINATED_SHIP_DATE());
                  struct.setl_DESINATED_SHIP_QTY(s.getl_DESINATED_SHIP_QTY());
                  entity.mT_ANS_DLV_DATE.create(conn, struct);
              
                 }
              
                 // 設定されたMapで[受注明細]を更新する
                 for (Iterator i = map.keySet().iterator(); i.hasNext();) {
                  String odrNo = (String) i.next();
                  String shipPlanRemainQty = (String) map.get(odrNo);
              
                  // 計算した出荷計画数が計画残数よりも大きい場合はエラー
                  if (Calculate.compare(shipPlanRemainQty, "0") < 0) {
                   setErrorMessage("KT00008", odrNo);
                  }
                  // [受注明細]更新
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_SHIP_PLAN_REMAIN_QTY(shipPlanRemainQty);
                  entity.mT_ODR.update(conn, struct);
                 }
              
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // 再読込
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 分納行複写ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineCopy() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");
			//{{user_implement_dev:<controlLineCopy>
              
                // 編集されたリスト情報を更新
                refreshList();
              
                if (!list.isEmpty()) {
                 KT0010010Struct s = getStructAt(0);
                 s.setl_DESINATED_DLV_DATE(null);
                 s.setl_DESINATED_SHIP_DATE(null);
                 list.add(s);
                }
              
                //}}user_implement_dev:<controlLineCopy>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlLineCopy");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                // 画面を初期化
                initializeAll();
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 選択更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                try {
                 // 編集されたリスト情報を更新
                 refreshList();
                 // [受注明細]を計算結果で更新するために、一時データを格納するMap
                 Map map = new HashMap();
              
                 for (Iterator i = list.iterator(); i.hasNext();) {
              
                  // 行のStructを取得
                  KT0010010Struct s = (KT0010010Struct) i.next();
              
                  // 選択されてない場合は次の行を読み込む
                  if (!"true".equals(s.getKT0010010view1_selected())) {
                   continue;
                  }
              
                  // 選択行の[出荷計画]を検索
                  List ansDlvDateList = entity.mT_ANS_DLV_DATE.read(conn, s);
                  // 対応する[出荷計画]が存在しない場合はエラー。
                  if (ansDlvDateList.isEmpty()) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  KT0010010Struct ansDlvDateStruct = (KT0010010Struct) ansDlvDateList.get(0);
                  // 読込時の更新回数と異なる場合はエラー
                  if (!s.getl_MODIFY_COUNT().equals(ansDlvDateStruct.getl_MODIFY_COUNT())) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  // 整数管理チェック
                  if ("1".equals(s.getl_UNIT_QTY_TYP())) {
                      // 整数管理
                      if (s.getl_DESINATED_SHIP_QTY().indexOf(".") >= 0) {
                          // 小数入力の場合：切上げ
                          String tempString = s.getl_DESINATED_SHIP_QTY();
                          double tempDouble1 = Double.parseDouble(tempString);
                          s.setl_DESINATED_SHIP_QTY(Calculate.ceil(s.getl_DESINATED_SHIP_QTY(), 0));
                          double tempDouble2 = Double.parseDouble(s.getl_DESINATED_SHIP_QTY());
                          if (tempDouble1 != tempDouble2) {
                              // ".0"入力除外
                              setWarningMessage("KQ20004");
                              setWarningParameter("T_ANS_DLV_DATE", "DESINATED_SHIP_QTY", tempString);
                          }
                      }
                  }
              
                  // 選択行のODR_NO
                  String odrNo = s.getl_ODR_NO();
              
                  // 更新対象行の出荷計画残数をMapに格納する
                  if (!map.containsKey(odrNo)) {
                   // DBを検索して、最新の出荷計画残数を取得する。
                   List odrList = entity.mT_ODR.read(conn, s);
                   KT0010010Struct odrStruct = (KT0010010Struct) odrList.get(0);
                   map.put(odrNo, odrStruct.getl_SHIP_PLAN_REMAIN_QTY());
                  }
                  // 出荷計画残数から数量を引いて残数を計算してMapを更新する
                  String qty = (String) map.get(odrNo);
                  qty = Calculate.subtract(qty, s.getl_DESINATED_SHIP_QTY());
                  qty = Calculate.add(qty, s.getl_bk_DESINATED_SHIP_QTY());
                  map.put(odrNo, qty);
              
                  // [出荷計画]更新
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_PART_DLV_SEQ_NO(s.getl_PART_DLV_SEQ_NO());
                  struct.setl_DESINATED_SHIP_DATE(s.getl_DESINATED_SHIP_DATE());
                  struct.setl_DESINATED_SHIP_QTY(s.getl_DESINATED_SHIP_QTY());
                  entity.mT_ANS_DLV_DATE.update(conn, struct);
                 }
              
                 // 設定されたMapで[受注明細]を更新する
                 for (Iterator i = map.keySet().iterator(); i.hasNext();) {
                  String odrNo = (String) i.next();
                  String shipPlanRemainQty = (String) map.get(odrNo);
              
                  // 計算した出荷計画数が計画残数よりも大きい場合はエラー
                  if (Calculate.compare(shipPlanRemainQty, "0") < 0) {
                   setErrorMessage("KT00008", odrNo);
                  }
                  // [受注明細]更新
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_SHIP_PLAN_REMAIN_QTY(shipPlanRemainQty);
                  entity.mT_ODR.update(conn, struct);
                 }
              
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // 再読込
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 選択削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
              
                try {
                 // 編集されたリスト情報を更新
                 refreshList();
                 // [受注明細]を計算結果で更新するために、一時データを格納するMap
                 Map map = new HashMap();
              
                 for (Iterator i = list.iterator(); i.hasNext();) {
              
                  // 行のStructを取得
                  KT0010010Struct s = (KT0010010Struct) i.next();
                  // 選択されてない場合は次の行を読み込む
                  if (!"true".equals(s.getKT0010010view1_selected())) {
                   continue;
                  }
              
                  // 選択行の[出荷計画]を検索
                  List ansDlvDateList = entity.mT_ANS_DLV_DATE.read(conn, s);
                  // 対応する[出荷計画]が存在しない場合はエラー。
                  if (ansDlvDateList.isEmpty()) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  KT0010010Struct ansDlvDateStruct = (KT0010010Struct) ansDlvDateList.get(0);
                  // 読込時の更新回数と異なる場合はエラー
                  if (!s.getl_MODIFY_COUNT().equals(ansDlvDateStruct.getl_MODIFY_COUNT())) {
                   setErrorMessage("KQ00055");
                   return;
                  }
                  // 選択行のODR_NO
                  String odrNo = s.getl_ODR_NO();
              
                  // 更新対象行の出荷計画残数をMapに格納する
                  if (!map.containsKey(odrNo)) {
                   // DBを検索して、最新の出荷計画残数を取得する。
                   List odrList = entity.mT_ODR.read(conn, s);
                   KT0010010Struct odrStruct = (KT0010010Struct) odrList.get(0);
                   map.put(odrNo, odrStruct.getl_SHIP_PLAN_REMAIN_QTY());
                  }
                  // 出荷計画残数から数量を足して残数を計算してMapを更新する
                  String qty = (String) map.get(odrNo);
                  qty = Calculate.add(qty, s.getl_bk_DESINATED_SHIP_QTY());
                  map.put(odrNo, qty);
              
                  // [出荷計画]削除
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_PART_DLV_SEQ_NO(s.getl_PART_DLV_SEQ_NO());
                  entity.mT_ANS_DLV_DATE.delete(conn, struct);
                 }
              
                 // 設定されたMapで[受注明細]を更新する
                 for (Iterator i = map.keySet().iterator(); i.hasNext();) {
                  String odrNo = (String) i.next();
                  String shipPlanRemainQty = (String) map.get(odrNo);
              
                  // 計算した出荷計画数が計画残数よりも大きい場合はエラー
                  if (Calculate.compare(shipPlanRemainQty, "0") < 0) {
                   setErrorMessage("KT00008", odrNo);
                  }
                  // [受注明細]更新
                  struct.setl_ODR_NO(odrNo);
                  struct.setl_SHIP_PLAN_REMAIN_QTY(shipPlanRemainQty);
                  entity.mT_ODR.update(conn, struct);
                 }
              
                 // エラーがあれば終了
                 if (msgStruct.hasError()) {
                  return;
                 }
              
                 // 再読込
                 controlSelect();
              
                 conn.commit();
                } catch (SQLException e) {
                 throw new ExpjException(e);
                } finally {
                 if (conn != null) {
                  conn.rollback();
                 }
                }
              
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUncheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");
			//{{user_implement_dev:<controlUncheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlUncheckAll>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlUncheckAll");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
              
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
              
                // 画面を初期化
                initializeAll();
                try {
                 // 販売用工場コード取得
                 struct.setCLASS_CODE("PLANT_WEB");
                 List plantCdList = entity.mSYS_CLASS_CODE.read(conn, struct);
                 if (plantCdList.isEmpty()) {
                  setErrorMessage("KR00017");
                  throw new ExpjException("KR00017");
                 }
                 KT0010010Struct plantCdStruct = (KT0010010Struct) plantCdList.get(0);
                 plantCd = plantCdStruct.getCODE();
              
                 // 業務運用日取得
                 List sysDateCtrlList = entity.mSYS_DATE_CTRL.read(conn, plantCdStruct);
                 if (sysDateCtrlList.isEmpty()) {
                  setErrorMessage("KQ00039");
                  throw new ExpjException("KQ00039");
                 }
                 KT0010010Struct sysDateCtrlStruct = (KT0010010Struct) sysDateCtrlList.get(0);
                 businessOprDate = sysDateCtrlStruct.getBUSINESS_OPR_DATE();
              
                 // 出荷準備リードタイム取得
                 struct.setCLASS_CODE("SHIP_LT");
                 List sysClassCodeList = entity.mSYS_CLASS_CODE.read(conn, struct);
                 if (sysClassCodeList.isEmpty()) {
                  setErrorMessage("KQ00037");
                  throw new ExpjException("KQ00037");
                 }
                 KT0010010Struct sysClassCodeStruct = (KT0010010Struct) sysClassCodeList.get(0);
                 shipLt = sysClassCodeStruct.getCODE();
              
                } catch (SQLException e) {
                 throw new ExpjException(e);
                }
              
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KT0010");
		logger.entering("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // TODO: ユーザ定義のコードを記述してください
                 // コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KT0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("LineCopy") ) {
				controlLineCopy();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("UncheckAll") ) {
				controlUncheckAll();
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
//			throw new FoundationException("KT0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KT0010010-E999","CSVの出力処理"));
			throw new FoundationException("KT0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KT0010010-E999","システム日付の取得処理"));
				throw new FoundationException("KT0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KT0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("KT0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KT0010010Entity entity;
	protected KT0010010Struct struct;
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

		entity = new KT0010010Entity();
		struct = new KT0010010Struct();

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
	 * KT0010010クラスの標準コンストラクタ
	 */
	public KT0010010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                 // TODO: ここに初期処理を記述してください
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
                 // TODO: インスタンス消滅時に実行する処理を記述してください
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
				KT0010010Struct key = (KT0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG") && key.getl_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("l_PARTIAL_SHIP_INST_FLG", key.getl_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("r1_STS_TYP") && key.getr1_STS_TYP() != null) {
					msgKey.setKeyValue("r1_STS_TYP", key.getr1_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("r2_STS_TYP") && key.getr2_STS_TYP() != null) {
					msgKey.setKeyValue("r2_STS_TYP", key.getr2_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("KT0010010view1_selected") && key.getKT0010010view1_selected() != null) {
					msgKey.setKeyValue("KT0010010view1_selected", key.getKT0010010view1_selected());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_NO") && key.getl_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_NO", key.getl_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY") && key.getl_SHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("l_SHIP_PLAN_REMAIN_QTY", key.getl_SHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY") && key.getl_DESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_QTY", key.getl_DESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG") && key.getPARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG", key.getPARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PKG_UNIT") && key.getl_PKG_UNIT() != null) {
					msgKey.setKeyValue("l_PKG_UNIT", key.getl_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_NAME") && key.getl_CUST_NAME() != null) {
					msgKey.setKeyValue("l_CUST_NAME", key.getl_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD") && key.getl_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("l_SHIP_WH_CD", key.getl_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_PLANT_CD") && key.getl_SHIP_PLANT_CD() != null) {
					msgKey.setKeyValue("l_SHIP_PLANT_CD", key.getl_SHIP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO") && key.getl_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("l_PART_DLV_SEQ_NO", key.getl_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_bk_DESINATED_SHIP_QTY") && key.getl_bk_DESINATED_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_bk_DESINATED_SHIP_QTY", key.getl_bk_DESINATED_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CODE") && key.getCLASS_CODE() != null) {
					msgKey.setKeyValue("CLASS_CODE", key.getCLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT") && key.getl_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("l_TRANSPORT_LT", key.getl_TRANSPORT_LT());
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
					KT0010010Struct key = new KT0010010Struct();
					if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG")) {
						key.setl_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("l_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r1_STS_TYP")) {
						key.setr1_STS_TYP(msgKey.getKeyValue("r1_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r2_STS_TYP")) {
						key.setr2_STS_TYP(msgKey.getKeyValue("r2_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("KT0010010view1_selected")) {
						key.setKT0010010view1_selected(msgKey.getKeyValue("KT0010010view1_selected"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_NO")) {
						key.setl_ODR_NO(msgKey.getKeyValue("l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_PLAN_REMAIN_QTY")) {
						key.setl_SHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("l_SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_QTY")) {
						key.setl_DESINATED_SHIP_QTY(msgKey.getKeyValue("l_DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG")) {
						key.setPARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PKG_UNIT")) {
						key.setl_PKG_UNIT(msgKey.getKeyValue("l_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_NAME")) {
						key.setl_CUST_NAME(msgKey.getKeyValue("l_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_WH_CD")) {
						key.setl_SHIP_WH_CD(msgKey.getKeyValue("l_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_PLANT_CD")) {
						key.setl_SHIP_PLANT_CD(msgKey.getKeyValue("l_SHIP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO")) {
						key.setl_PART_DLV_SEQ_NO(msgKey.getKeyValue("l_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_bk_DESINATED_SHIP_QTY")) {
						key.setl_bk_DESINATED_SHIP_QTY(msgKey.getKeyValue("l_bk_DESINATED_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CODE")) {
						key.setCLASS_CODE(msgKey.getKeyValue("CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_LT")) {
						key.setl_TRANSPORT_LT(msgKey.getKeyValue("l_TRANSPORT_LT"));
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
