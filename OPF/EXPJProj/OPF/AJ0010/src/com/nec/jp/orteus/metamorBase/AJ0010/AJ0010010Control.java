/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0010/src/com/nec/jp/orteus/metamorBase/AJ0010/AJ0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0010;

import com.nec.jp.orteus.metamorBase.AJ0010.*;
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
	// TODO: ここにimportパッケージを記述してください
import com.nec.jp.orteus.metamorBase.common04.DateCtrl.DateCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AJ0010010Control
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
	public AJ0010010Struct getListvalue(int x) { return (AJ0010010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AJ0010010Struct getStruct() { return this.struct; }	// Structを返します。
	public AJ0010010Struct createStruct() { return new AJ0010010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AJ0010010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください
	/** 画面遷移キー(工場コード) */
	private String _plantCd;
	/** 画面遷移キー(品目番号) */
	private String _itemCd;
	/** 画面遷移キー(製造納期　FROM) */
	private String _prdDueDateFrom;
	/** 画面遷移キー(製造納期　TO) */
	private String _prdDueDateTo;

	/** コンボボックスデータ取得用定数　内外作区分（進捗管理用） */
	private final static String J_OUTSIDE_TYP_PARAMETER_NAME= "J_OUTSIDE_TYP";
	
	/** コンボボックスデータ取得用定数　内外作区分 */
	private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP";
	
	/** コンボボックスデータ取得用定数　進捗ステータス（オーダ別進捗一覧用） */
	private final static String PROGRESS_STS_ODR_PARAMETER_NAME= "PROGRESS_STS_ODR";

	/** コンボボックスデータ取得用定数　オーダ状態区分 */
	private final static String ODR_STS_TYP_PARAMETER_NAME= "ODR_STS_TYP";	

	/** コンボボックスデータ取得用定数　品目手配区分 */
	private final static String MRP_ODR_TYP_PARAMETER_NAME= "MRP_ODR_TYP";	
	
	/** コンボボックスデータ取得用定数　製番種別 */
	private final static String JOB_ODR_TYP_PARAMETER_NAME= "JOB_ODR_TYP";	
	
	/** コンボボックスデータ取得用定数　所要量発生処理区分 */
	private final static String OD_GNR_TYP_PARAMETER_NAME= "OD_GNR_TYP";	
	
	/** コンボボックスデータ取得用　内外作区分 */
	private ComboStruct OUTSIDE_TYP = null;
	
	/** コンボボックスデータ取得用　進捗ステータス（オーダ別進捗一覧用） */
	private ComboStruct PROGRESS_STS_ODR = null;
	
	/** コンボボックスデータ取得用　内外作区分（進捗管理用） */
	private ComboStruct J_OUTSIDE_TYP = null;
	
	/** コンボボックスデータ取得用　オーダ状態区分 */
	private ComboStruct ODR_STS_TYP = null;
	
	/** コンボボックスデータ取得用　品目手配区分 */
	private ComboStruct MRP_ODR_TYP = null;
	
	/** コンボボックスデータ取得用　製番種別 */
	private ComboStruct JOB_ODR_TYP = null;
	
	/** コンボボックスデータ取得用　所要量発生処理区分 */
	private ComboStruct OD_GNR_TYP = null;
	
	/** CSVデータリスト */
	private List csvList = null;
	
	/**
	* 画面遷移キー(工場コード)取得
	* @return 工場コード
	*/
	public String getPlantCd() {
		return _plantCd;
	}
	/**
	* 画面遷移キー(工場コード)設定
	* @param cd 工場コード
	*/
	public void setPlantCd(String cd) {
		_plantCd = cd;
	}
	/**
	* 画面遷移キー(品目番号)取得
	* @return 品目番号
	*/
	public String getItemCd() {
		return _itemCd;
	}
	/**
	* 画面遷移キー(品目番号)設定
	* @param cd 品目番号
	*/
	public void setItemCd(String cd) {
		_itemCd = cd;
	}
	/**
	* 画面遷移キー(製造納期 FROM)取得
	* @return 製造納期 FROM
	*/
	public String getPrdDueDateFrom() {
		return _prdDueDateFrom;
	}
	/**
	* 画面遷移キー(製造納期 FROM)設定
	* @param cd 製造納期 FROM
	*/
	public void setPrdDueDateFrom(String cd) {
		_prdDueDateFrom = cd;
	}
	/**
	* 画面遷移キー(製造納期 TO)取得
	* @return 製造納期 TO
	*/
	public String getPrdDueDateTo() {
		return _prdDueDateTo;
	}
	/**
	* 画面遷移キー(製造納期 TO)設定
	* @param cd 製造納期 TO
	*/
	public void setPrdDueDateTo(String cd) {
		_prdDueDateTo = cd;
	}
		
	/**
	* 時分の整理
	* @param 日付時分
	* @param 日付時分
	*/
	private String formatHM(String inDate){
			if(null == inDate || "".equals(inDate)){
				return inDate ;
			}
			if(inDate.length() < 16){
				return inDate ;
			}
			return inDate.replaceAll("00:00","     ");					
	}
	
	/**
	 * 検索条件の設定
	 */
	private void setSearchCondition() {
		
		// データ引数クリア
		struct.setl_PRD_DUE_DATE_FROM(null);
	  struct.setl_PRD_DUE_DATE_TO(null);
	  struct.setl_PRD_START_DATE_FROM(null);
		struct.setl_PRD_START_DATE_TO(null);
		struct.setl_PRD_DUE_DATE_FROM_ZERO(null);
	  struct.setl_PRD_DUE_DATE_TO_ZERO(null);
	  struct.setl_PRD_START_DATE_FROM_ZERO(null);
		struct.setl_PRD_START_DATE_TO_ZERO(null);
		
		// 表示対象
		struct.setMRP_ODR_TYP_1(null);
		struct.setMRP_ODR_TYP_2(null);
		struct.setMRP_ODR_TYP_3(null);
		struct.setMRP_ODR_TYP_4(null);
		struct.setMRP_ODR_TYP_5(null);
		struct.setMRP_ODR_TYP_6(null);
		struct.setMRP_ODR_TYP_7(null);
		struct.setMRP_ODR_TYP_8(null);
		if (struct.getr1_MRP_ODR_TYP().equals("true")) {
			// 「ＭＲＰオーダ」を選択
			struct.setMRP_ODR_TYP_4("4");
			struct.setMRP_ODR_TYP_5("5");
			struct.setMRP_ODR_TYP_6("6");
			struct.setMRP_ODR_TYP_7("7");
		} else if (struct.getr2_MRP_ODR_TYP().equals("true")) {
			// 「製番オーダ」を選択
			struct.setMRP_ODR_TYP_1("1");
			struct.setMRP_ODR_TYP_2("2");
		} else if (struct.getr3_MRP_ODR_TYP().equals("true")) {
			// 「全て」を選択
			struct.setMRP_ODR_TYP_1("1");
			struct.setMRP_ODR_TYP_2("2");
			struct.setMRP_ODR_TYP_4("4");
			struct.setMRP_ODR_TYP_5("5");
			struct.setMRP_ODR_TYP_6("6");
			struct.setMRP_ODR_TYP_7("7");
		}
		
		// 進捗ステータス
		// 「遅れあり」チェックボックスの入力値
		struct.setODR_STS_TYP_9_DELAYED(null);
		if (struct.getc1_PROGRESS_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_9_DELAYED("9");
			struct.setDELAY_TYP("1");
		} else {
			struct.setDELAY_TYP("2");
		}
		// 「遅れなし」チェックボックスの入力値
		struct.setODR_STS_TYP_9_NOT_DELAYED(null);
		if (struct.getc2_PROGRESS_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_9_NOT_DELAYED("9");
			struct.setNOT_DELAY_TYP("1");
		} else {
			struct.setNOT_DELAY_TYP("2");
		}
		
		// オーダ状態区分
		struct.setODR_STS_TYP_1(null);
		struct.setODR_STS_TYP_2(null);
		struct.setODR_STS_TYP_9(null);
		// 「計画（未発効）」チェックボックスの入力値
		if (struct.getc1_ODR_STS_TYP() != null 
				&& struct.getc1_ODR_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_1("1");
		}
		// 「確定（発効）」チェックボックスの入力値
		if (struct.getc2_ODR_STS_TYP() != null 
				&& struct.getc2_ODR_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_2("2");
		}
		// 「完了」チェックボックスの入力値
		if (struct.getc3_ODR_STS_TYP() != null 
				&& struct.getc3_ODR_STS_TYP().equals("true")) {
			struct.setODR_STS_TYP_9("9");
		}
		
		// 抽出条件（日付の設定）
		if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			// 製造納期（From）
			if(null == struct.getPRD_DUE_DATE_FROM() || "".equals(struct.getPRD_DUE_DATE_FROM())){
			  struct.setl_PRD_DUE_DATE_FROM(null);
		  }else{
				// 時刻設定
				if(null == struct.getPRD_DUE_TIME_FROM() || "".equals(struct.getPRD_DUE_TIME_FROM())){
			    struct.setl_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " 00:00");
				}else{
				  struct.setPRD_DUE_TIME_FROM(AppendZero(struct.getPRD_DUE_TIME_FROM(),4));
			    struct.setl_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " " + 
			                                  struct.getPRD_DUE_TIME_FROM().substring(0,2) + ":" + 
			                                  struct.getPRD_DUE_TIME_FROM().substring(2));
				}
		  }
		  // 製造納期（To）
		  if(null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
		    struct.setl_PRD_DUE_DATE_TO(null);
			}else{
				// 時刻設定
				if(null == struct.getPRD_DUE_TIME_TO() || "".equals(struct.getPRD_DUE_TIME_TO())){
				  struct.setl_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
				}else{
				  struct.setPRD_DUE_TIME_TO(AppendZero(struct.getPRD_DUE_TIME_TO(),4));
			    struct.setl_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " " + 
			                                struct.getPRD_DUE_TIME_TO().substring(0,2) + ":" + 
			                                struct.getPRD_DUE_TIME_TO().substring(2));
				}
		  }
		  // 製造着手日(From)
			if(null == struct.getPRD_START_DATE_FROM() || "".equals(struct.getPRD_START_DATE_FROM())){
				struct.setl_PRD_START_DATE_FROM(null);
			}else{
				// 時刻設定
				if(null == struct.getPRD_START_TIME_FROM() || "".equals(struct.getPRD_START_TIME_FROM())){
					struct.setl_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " 00:00");
				}else{
				  struct.setPRD_START_TIME_FROM(AppendZero(struct.getPRD_START_TIME_FROM(),4));
					struct.setl_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " " + 
					                                struct.getPRD_START_TIME_FROM().substring(0,2) + ":" + 
					                                struct.getPRD_START_TIME_FROM().substring(2));
				}
		  }
		  // 製造着手日(To)
			if(null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setl_PRD_START_DATE_TO(null);
			}else{
				// 時刻設定
				if(null == struct.getPRD_START_TIME_TO() || "".equals(struct.getPRD_START_TIME_TO())){
					struct.setl_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
				}else{
				  struct.setPRD_START_TIME_TO(AppendZero(struct.getPRD_START_TIME_TO(),4));
					struct.setl_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " " + 
					                              struct.getPRD_START_TIME_TO().substring(0,2) + ":" + 
					                              struct.getPRD_START_TIME_TO().substring(2));
				}
		  }
	  }else{
			struct.setl_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
			if(null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
		  	struct.setl_PRD_DUE_DATE_TO(null);
			}else{
		  	struct.setl_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
			}
		  struct.setl_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM());
			if(null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setl_PRD_START_DATE_TO(null);
			}else{
				struct.setl_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
			}
	  }
	}
	/**
	 * 時刻の設定
	 * @param  input    入力String
	 * @param  cnt      桁数
	 * @return String   頭にゼロを埋める
	 */
	private String AppendZero(String input,int cnt){
	  int nCount = cnt - input.length() ;
	  for(int i = 1; i <= nCount;i++)
	  {
	  	input = "0" + input;
	  }
	  return input;
	}
	/**
	 * 進捗ステータスの設定
	 * @param aStruct 進捗ステータスを設定するStruct
	 * @exception ParseException 進捗ステータス設定処理中にエラーが発生した場合
	 */
	private void setProgressStatus(AJ0010010Struct aStruct) 
			throws ExpjException {
		try {
			String progressStatus = "";
			String progressStatusDisplayName = "";
			Date oprDate = null;
			Date prdDueDate = null;
			oprDate = Converter.strToDate(aStruct.getl_BUSINESS_OPR_DATE(), Converter.SLASH_DATE);
			prdDueDate = Converter.strToDate(aStruct.getl_PRD_DUE_DATE(), Converter.SLASH_DATE);
			
			if (aStruct.getMRP_TYP().intValue() == 3) {
				// 削除
				progressStatus = "2";
				progressStatusDisplayName = getDisplayName(PROGRESS_STS_ODR, progressStatus);
			} else {
				if (aStruct.getl_ODR_STS_TYP().intValue() != 9 
						&& oprDate.compareTo(prdDueDate) > 0) {
					// 遅れあり
					progressStatus = "1";
					progressStatusDisplayName = getDisplayName(PROGRESS_STS_ODR, progressStatus);
				} else {
					// 遅れなし、または、完了
					progressStatus = "0";
					progressStatusDisplayName = "";
				}
			}
			aStruct.setl_PROGRESS_STATUS(progressStatus);
			aStruct.setl_PROGRESS_STATUS_DN(progressStatusDisplayName);
		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			throw new ExpjException(e, emsg); // エクセプションを生成
		}
	}
	
	/**
	 * 内外作区分の設定
	 * @param aStruct 内外作区分を設定するStruct
	 */
	private void setOutsideTyp(AJ0010010Struct aStruct) {
		String displayName = "";  // コンボボックスデータ表示用
		int workInProcQty = 0;
		int rlsdPuchOdrQty = 0;
		workInProcQty = Integer.parseInt(aStruct.getl_WORK_IN_PROC_QTY());
		rlsdPuchOdrQty = Integer.parseInt(aStruct.getl_RLSD_PUCH_ODR_QTY());
		
		// オーダデマンド番号の存在チェック
		if (rlsdPuchOdrQty > 0 || workInProcQty > 0) {
			// 内外作区分（進捗管理用）
			if (rlsdPuchOdrQty > 0 && workInProcQty > 0) {
				// 発注残・品目別仕掛に存在する
				displayName = getDisplayName(J_OUTSIDE_TYP, "9");
			} else if (rlsdPuchOdrQty > 0) {
				// 発注残のみ存在する
				displayName = getDisplayName(J_OUTSIDE_TYP, "2");
			} else if (workInProcQty > 0) {
				// 品目別仕掛のみ存在する
				displayName = getDisplayName(J_OUTSIDE_TYP, "1");
			} else {
				displayName = null;
			}
			aStruct.setl_OUTSIDE_TYP_DN(displayName);
		} else {
			// 内外作区分
			displayName = getDisplayName(OUTSIDE_TYP, aStruct.getOUTSIDE_TYP().toString());
			aStruct.setl_OUTSIDE_TYP_DN(displayName);
		}
	}
	
	private void othercomboTyp(AJ0010010Struct aStruct) {
		
		aStruct.setl_ODR_STS_TYP_DN(getDisplayName(ODR_STS_TYP, aStruct.getl_ODR_STS_TYP().toString()));
		aStruct.setl_MRP_ODR_TYP_DN(getDisplayName(MRP_ODR_TYP, aStruct.getl_MRP_ODR_TYP().toString()));
		if(aStruct.getJOB_ODR_TYP()!=null){
			aStruct.setl_JOB_ODR_TYP_DN(getDisplayName(JOB_ODR_TYP, aStruct.getJOB_ODR_TYP().toString()));
		}
		aStruct.setl_OD_GNR_TYP_DN(getDisplayName(OD_GNR_TYP, aStruct.getOD_GNR_TYP().toString()));
		
	}
	/**
	 * コンボボックスデータから表示説明を取得する
	 * @param combo コンボボックスデータ
	 * @param value コンボボックスデータの値
	 * @return コンボボックスデータの表示説明
	 */
	private String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
	}
	
	/**
	 * 検索条件が適切か否かをチェックする
	 * @return 検索条件が適切であればtrue、そうでなければfalse
	 */
	 private boolean checkSearchCondition() {
		boolean isCheckboxDelayedChecked = false;
		boolean isCheckboxNotDelayedChecked = false;
		boolean isCheckboxNotEffectiveChecked = false;
		boolean isCheckboxEffectiveChecked = false;
		boolean isCheckboxCompletedChecked = false;
		boolean result = true;
		
		// 進捗ステータス
		// 「遅れあり」チェックボックスの入力値
		if (struct.getc1_PROGRESS_STS_TYP() != null 
				&& struct.getc1_PROGRESS_STS_TYP().equals("true")) {
			isCheckboxDelayedChecked = true;
		}
		
		// 「遅れなし」チェックボックスの入力値
		if (struct.getc2_PROGRESS_STS_TYP() != null 
				&& struct.getc2_PROGRESS_STS_TYP().equals("true")) {
			isCheckboxNotDelayedChecked = true;
		}
		
		// オーダ状態区分
		// 「計画（未発効）」チェックボックスの入力値
		if (struct.getc1_ODR_STS_TYP() != null 
				&& struct.getc1_ODR_STS_TYP().equals("true")) {
			isCheckboxNotEffectiveChecked = true;
		}
		// 「確定（発効）」チェックボックスの入力値
		if (struct.getc2_ODR_STS_TYP() != null 
				&& struct.getc2_ODR_STS_TYP().equals("true")) {
			isCheckboxEffectiveChecked = true;
		}
		// 「完了」チェックボックスの入力値
		if (struct.getc3_ODR_STS_TYP() != null 
				&& struct.getc3_ODR_STS_TYP().equals("true")) {
			isCheckboxCompletedChecked = true;
		}
		
		struct.setl_DELAY_BASE_DATE(null);
		struct.setl_NOT_DELAY_BASE_DATE(null);
		// 「遅れあり」、「遅れなし」にチェックがない場合
		if (isCheckboxDelayedChecked == false 
				&& isCheckboxNotDelayedChecked == false) {
			if (isCheckboxCompletedChecked == false) {
				// 「完了」にチェックがない場合
				result = false;
			} else {
				// 「計画（未発効）」、「確定（発効）」の検索条件を無効にする
				struct.setODR_STS_TYP_1(null);
				struct.setODR_STS_TYP_2(null);
				// 「遅れあり」「遅れなし」の検索条件を無効にする
				struct.setl_DELAY_BASE_DATE("0001-01-01");
				struct.setl_NOT_DELAY_BASE_DATE("9999-12-31");
			}
		} else {
			if (isCheckboxNotEffectiveChecked == false 
					&& isCheckboxEffectiveChecked == false) {
				// 「遅れあり」の検索条件を無効
				struct.setODR_STS_TYP_9_DELAYED(null);
				struct.setl_DELAY_BASE_DATE("0001-01-01");
				// 「遅れなし」の検索条件を無効
				struct.setODR_STS_TYP_9_NOT_DELAYED(null);
				struct.setl_NOT_DELAY_BASE_DATE("9999-12-31");
			} else {
				if (isCheckboxDelayedChecked == true 
						&& isCheckboxNotDelayedChecked == false) {
					// 「遅れなし」の検索条件を無効
					struct.setl_NOT_DELAY_BASE_DATE("9999-12-31");
					struct.setODR_STS_TYP_9_NOT_DELAYED(null);
				} else if (isCheckboxDelayedChecked == false 
						&& isCheckboxNotDelayedChecked == true) {
					// 「遅れあり」の検索条件を無効
					struct.setODR_STS_TYP_9_DELAYED(null);
					struct.setl_DELAY_BASE_DATE("0001-01-01");
				}
			}
		}
		
		// 「計画（未発効）」、「確定（発効）」、「完了」にチェックがない場合
		if (isCheckboxNotEffectiveChecked == false
				&& isCheckboxEffectiveChecked == false
				&& isCheckboxCompletedChecked == false) {
			result = false;
		}
		
		return result;
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

		
	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ(List)
	 */
	private void setErrorMessage(String code, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// エラーメッセージとして登録
			sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		String keyMessage = "";

		try {
			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}
			
			if (csvList != null) {
				csvList.clear();
			} else {
				csvList = new ArrayList(0);
			}
			
			struct.setDOWNLOAD_FILE(null);
			readStatus = INITIAL;
			struct.setPLANT_NAME(null);
			// 変数定義
			AJ0010010Struct aStruct = null;
			ExpjMessage emsg = null;
			int maxLine = 0;
			//工場コード存在チェック
			if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
				List tmpList = entity.mM_PLANT.read(conn, struct);
				if (tmpList.size() <= 0 ) {
					//データが存在しない
					keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
					setErrorMessage("ZZ09028", keyMessage);
					return;
				} else {
					AJ0010010Struct checkStruct = (AJ0010010Struct)tmpList.get(0);
					struct.setPLANT_NAME(checkStruct.getPLANT_NAME());
				}
			}
			// 検索条件の設定
			setSearchCondition();
			
			// 検索条件をチェックする
			if (checkSearchCondition() == false) {
				if (list != null) {
					list.clear();
				} else {
					list = new ArrayList(0);
				}
				// 検索結果が0件です
				emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				
				readStatus = NOT_FOUND;
				
				return;
			}
			// 表示最大行数制限処理
			maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			List viewList = entity.mV_ODR_PROG_LSTCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AJ0010010Struct)viewList.get(0)).getl_COUNT());
			if (rowCount== 0) {
				// 読込処理失敗：検索結果が0件です
				emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = NOT_FOUND;
				if(list!=null && list.size()>0){
					list.clear();
				}
				return;
			}
			if(maxLine != 0 && rowCount == maxLine + 1){
				
				// 読込処理失敗：検索結果が最大行を超えています。
				emsg = new ExpjMessage("ZZ01115", "" + maxLine);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = TOO_MANY;
				if(list!=null && list.size()>0){
					list.clear();
				}
				return;
				
			}
			viewList = entity.mV_ODR_PROG_LST.read(conn, struct);
			csvList = viewList;
			setList(viewList);
			for (int i = 0; i < list.size(); i++) {
				aStruct = (AJ0010010Struct)list.get(i);
					
				// 進捗ステータス
				setProgressStatus(aStruct);
					
				// 内外作区分
				setOutsideTyp(aStruct);
					
				//その他コンボボックスの取得
				othercomboTyp(aStruct);
					

			}
			
			readStatus = NORMAL;
			
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			throw new ExpjException(e, emsg); // エクセプションを生成
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		List csvList = new ArrayList();
		String[] title = {
			"Expj.Cmt0436" ,
			"Expj.ODR_STS_TYP" ,
			"Expj.ITEM_CD" ,
			"Expj.ITEM_NAME" ,
			"Expj.OUTSIDE_TYP" ,
			"Expj.MRP_ODR_TYP" ,
			"Expj.PLANT_CD" ,
			"Expj.PRD_DUE_DATE" ,
			"Expj.PRD_START_DATE" ,
			"Expj.ODR_START_DATE" ,
			"Expj.ODR_QTY_2" ,
			"Expj.TOTAL_RCV_QTY_2" ,
			"Expj.PUCH_ODR_UNIT" ,
			"Expj.RCV_CMPLT_DATE_1" ,
			"Expj.JOB_ODR_CD" ,
			"Expj.JOB_ODR_CANCEL_NO" ,
			"Expj.JOB_ODR_TYP" ,
			"Expj.ALC_GRP_CD" ,
			"Expj.OD_GNR_TYP" ,
			"Expj.Cmt0434" 
		};
		csvList.add(title);
		
		for (Iterator i = this.csvList.iterator(); i.hasNext();) {
			AJ0010010Struct csvStruct = (AJ0010010Struct) i.next();
			String[] csvStr = new String[title.length];
			csvStr[0] = csvStruct.getl_PROGRESS_STATUS_DN();
			csvStr[1] = csvStruct.getl_ODR_STS_TYP_DN();
			csvStr[2] = csvStruct.getl_ITEM_CD();
			csvStr[3] = csvStruct.getl_ITEM_NAME();
			csvStr[4] = csvStruct.getl_OUTSIDE_TYP_DN();
			csvStr[5] = csvStruct.getl_MRP_ODR_TYP_DN();
			csvStr[6] = csvStruct.getl_PLANT_CD();
			csvStr[7] = csvStruct.getl_PRD_DUE_DATE();
			csvStr[8] = csvStruct.getl_PRD_START_DATE();
			csvStr[9] = csvStruct.getl_ODR_START_DATE();
			csvStr[10] = csvStruct.getl_ODR_QTY();
			csvStr[11] = csvStruct.getl_TOTAL_RCV_QTY();
			csvStr[12] = csvStruct.getl_STOCK_UNIT();
			csvStr[13] = csvStruct.getl_RCV_CMPLT_DATE();
			csvStr[14] = csvStruct.getl_JOB_ODR_CD();
			csvStr[15] = csvStruct.getl_JOB_ODR_CANCEL_NO();
			csvStr[16] = csvStruct.getl_JOB_ODR_TYP_DN();
			csvStr[17] = csvStruct.getl_ALC_GRP_CD();
			csvStr[18] = csvStruct.getl_OD_GNR_TYP_DN();
			csvStr[19] = csvStruct.getl_EXTERNAL_PLAN_CD();
			csvList.add(csvStr);
		}
		if (csvList != null && !csvList.isEmpty()) {
			csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
			csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
			struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
	  try{
			readStatus = INITIAL;
			
			if (list != null) {
				list.clear();
			}
			if (csvList != null) {
				csvList.clear();
			}
			
			// structのクリア
			struct.clear();

			// 工場コードをデフォルト表示
			struct.setPLANT_CD(getsysPLANT_CD());

			// 画面項目の初期化
			// 表示対象
			struct.setr1_MRP_ODR_TYP("true");
			struct.setr2_MRP_ODR_TYP(null);
			struct.setr3_MRP_ODR_TYP(null);
			struct.setPRD_DUE_DATE_FROM(null);
			struct.setPRD_DUE_DATE_TO(null);
			struct.setPRD_START_DATE_FROM(null);
			struct.setPRD_START_DATE_TO(null);
			struct.setJOB_ODR_CD(null);
			struct.setITEM_CD(null);
			struct.setl_PRD_DUE_DATE_FROM(null);
		  struct.setl_PRD_DUE_DATE_TO(null);
		  struct.setl_PRD_START_DATE_FROM(null);
			struct.setl_PRD_START_DATE_TO(null);
			struct.setl_PRD_DUE_DATE_FROM_ZERO(null);
		  struct.setl_PRD_DUE_DATE_TO_ZERO(null);
		  struct.setl_PRD_START_DATE_FROM_ZERO(null);
			struct.setl_PRD_START_DATE_TO_ZERO(null);
			struct.setPRD_DUE_TIME_FROM(null);
			struct.setPRD_DUE_TIME_TO(null);
			struct.setPRD_START_TIME_FROM(null);
			struct.setPRD_START_TIME_TO(null);
			// 進捗ステータス
			struct.setc1_PROGRESS_STS_TYP("true"); // 遅れあり
			struct.setc2_PROGRESS_STS_TYP(null);   // 遅れなし
			// オーダ状態区分
			struct.setc1_ODR_STS_TYP(null);    // 計画（未発効）
			struct.setc2_ODR_STS_TYP("true");  // 確定（発効）
			struct.setc3_ODR_STS_TYP(null);    // 完了
			
			
			// システムパラメータ（TIME_CTRL）取得
			AJ0010010Struct TIME_CTRLStruct = new AJ0010010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AJ0010010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
		} catch(SQLException e) {
			e.printStackTrace(); 
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 製番別進捗ボタン押下時に実行される処理です。
	 *
	 */
	public void controlJobOdrProgLst() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgLst");
			//{{user_implement_dev:<controlJobOdrProgLst>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlJobOdrProgLst>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgLst");

		return;
	}

	/**
	 * 作業指示進捗ボタン押下時に実行される処理です。
	 *
	 */
	public void controlWorkProgLst() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlWorkProgLst");
			//{{user_implement_dev:<controlWorkProgLst>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlWorkProgLst>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlWorkProgLst");

		return;
	}

	/**
	 * 発注指示進捗ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPuchProgLst() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPuchProgLst");
			//{{user_implement_dev:<controlPuchProgLst>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlPuchProgLst>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPuchProgLst");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			readStatus = INITIAL;
			struct.setDOWNLOAD_FILE(null);
			
			// 画面項目の初期化
			
			// 工場コードをデフォルト表示
			struct.setPLANT_CD(getsysPLANT_CD());
							
			// 表示対象
			struct.setr1_MRP_ODR_TYP("true");
			struct.setr2_MRP_ODR_TYP(null);
			struct.setr3_MRP_ODR_TYP(null);
			struct.setPRD_DUE_DATE_FROM(null);
			struct.setPRD_DUE_DATE_TO(null);
			struct.setPRD_START_DATE_FROM(null);
			struct.setPRD_START_DATE_TO(null);
			struct.setJOB_ODR_CD(null);
			struct.setITEM_CD(null);
			struct.setl_PRD_DUE_DATE_FROM(null);
		  struct.setl_PRD_DUE_DATE_TO(null);
		  struct.setl_PRD_START_DATE_FROM(null);
			struct.setl_PRD_START_DATE_TO(null);
			struct.setl_PRD_DUE_DATE_FROM_ZERO(null);
		  struct.setl_PRD_DUE_DATE_TO_ZERO(null);
		  struct.setl_PRD_START_DATE_FROM_ZERO(null);
			struct.setl_PRD_START_DATE_TO_ZERO(null);
			struct.setPRD_DUE_TIME_FROM(null);
			struct.setPRD_DUE_TIME_TO(null);
			struct.setPRD_START_TIME_FROM(null);
			struct.setPRD_START_TIME_TO(null);
			
			// 進捗ステータス
			struct.setc1_PROGRESS_STS_TYP("true"); // 遅れあり
			struct.setc2_PROGRESS_STS_TYP(null);   // 遅れなし
			// オーダ状態区分
			struct.setc1_ODR_STS_TYP(null);    // 計画（未発効）
			struct.setc2_ODR_STS_TYP("true");  // 確定（発効）
			struct.setc3_ODR_STS_TYP(null);    // 完了
			
			// システムパラメータ（TIME_CTRL）取得
			AJ0010010Struct TIME_CTRLStruct = new AJ0010010Struct();
			List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
			if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
				TIME_CTRLStruct = (AJ0010010Struct)TIME_CTRLList.get(0);
				struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
			}else{
				struct.setTIME_CTRL(null);
			}
			
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
				struct.setPRD_DUE_DATE_FROM(_prdDueDateFrom);
				struct.setPRD_DUE_DATE_TO(_prdDueDateTo);
				struct.setPLANT_CD(_plantCd);
				struct.setITEM_CD(_itemCd);

				// 進捗ステータス
				struct.setc1_PROGRESS_STS_TYP("true"); // 遅れあり
				struct.setc2_PROGRESS_STS_TYP("true");   // 遅れなし
				// オーダ状態区分
				struct.setc1_ODR_STS_TYP("true");    // 計画（未発効）
				struct.setc2_ODR_STS_TYP("true");  // 確定（発効）
				struct.setc3_ODR_STS_TYP("true");    // 完了

				controlSelect();
			}

			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0010");
		logger.entering("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// TODO: ユーザ定義のコードを記述してください
			// コンボボックス部品のデータのセットはここに記述してください。
			try {
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
				PROGRESS_STS_ODR = comboController.getData(PROGRESS_STS_ODR_PARAMETER_NAME);
				J_OUTSIDE_TYP = comboController.getData(J_OUTSIDE_TYP_PARAMETER_NAME);
				ODR_STS_TYP = comboController.getData(ODR_STS_TYP_PARAMETER_NAME);
				MRP_ODR_TYP = comboController.getData(MRP_ODR_TYP_PARAMETER_NAME);
				JOB_ODR_TYP = comboController.getData(JOB_ODR_TYP_PARAMETER_NAME);
				OD_GNR_TYP = comboController.getData(OD_GNR_TYP_PARAMETER_NAME);			
				
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AJ0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("JobOdrProgLst") ) {
				controlJobOdrProgLst();
			} else if( button.equals("WorkProgLst") ) {
				controlWorkProgLst();
			} else if( button.equals("PuchProgLst") ) {
				controlPuchProgLst();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AJ0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0010010-E999","CSVの出力処理"));
			throw new FoundationException("AJ0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0010010-E999","システム日付の取得処理"));
				throw new FoundationException("AJ0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("AJ0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AJ0010010Entity entity;
	protected AJ0010010Struct struct;
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

		entity = new AJ0010010Entity();
		struct = new AJ0010010Struct();

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
	 * AJ0010010クラスの標準コンストラクタ
	 */
	public AJ0010010Control() throws BusinessProcessException, FoundationException
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
				AJ0010010Struct key = (AJ0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_MRP_ODR_TYP") && key.getr1_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("r1_MRP_ODR_TYP", key.getr1_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("r2_MRP_ODR_TYP") && key.getr2_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("r2_MRP_ODR_TYP", key.getr2_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("r3_MRP_ODR_TYP") && key.getr3_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("r3_MRP_ODR_TYP", key.getr3_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("c1_PROGRESS_STS_TYP") && key.getc1_PROGRESS_STS_TYP() != null) {
					msgKey.setKeyValue("c1_PROGRESS_STS_TYP", key.getc1_PROGRESS_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM") && key.getPRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM", key.getPRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO") && key.getPRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO", key.getPRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("c2_PROGRESS_STS_TYP") && key.getc2_PROGRESS_STS_TYP() != null) {
					msgKey.setKeyValue("c2_PROGRESS_STS_TYP", key.getc2_PROGRESS_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM") && key.getPRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_START_DATE_FROM", key.getPRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO") && key.getPRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_START_DATE_TO", key.getPRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP") && key.getc1_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c1_ODR_STS_TYP", key.getc1_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_ODR_STS_TYP") && key.getc2_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c2_ODR_STS_TYP", key.getc2_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_ODR_STS_TYP") && key.getc3_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c3_ODR_STS_TYP", key.getc3_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN") && key.getl_PROGRESS_STATUS_DN() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS_DN", key.getl_PROGRESS_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN") && key.getl_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_DN", key.getl_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN") && key.getl_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_DN", key.getl_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN") && key.getl_MRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP_DN", key.getl_MRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP_DN") && key.getl_JOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_JOB_ODR_TYP_DN", key.getl_JOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN") && key.getl_OD_GNR_TYP_DN() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP_DN", key.getl_OD_GNR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS") && key.getl_PROGRESS_STATUS() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS", key.getl_PROGRESS_STATUS().toString());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_FROM") && key.getPRD_DUE_TIME_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME_FROM", key.getPRD_DUE_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_TO") && key.getPRD_DUE_TIME_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_TIME_TO", key.getPRD_DUE_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_TIME_FROM") && key.getPRD_START_TIME_FROM() != null) {
					msgKey.setKeyValue("PRD_START_TIME_FROM", key.getPRD_START_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_TIME_TO") && key.getPRD_START_TIME_TO() != null) {
					msgKey.setKeyValue("PRD_START_TIME_TO", key.getPRD_START_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_START_DATE") && key.getl_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_ODR_START_DATE", key.getl_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE") && key.getl_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE", key.getl_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP") && key.getOD_GNR_TYP() != null) {
					msgKey.setKeyValue("OD_GNR_TYP", key.getOD_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY") && key.getl_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_RCV_QTY", key.getl_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE") && key.getl_RCV_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_RCV_CMPLT_DATE", key.getl_RCV_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG") && key.getEXTERNAL_DM_FLG() != null) {
					msgKey.setKeyValue("EXTERNAL_DM_FLG", key.getEXTERNAL_DM_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("l_EXTERNAL_PLAN_CD") && key.getl_EXTERNAL_PLAN_CD() != null) {
					msgKey.setKeyValue("l_EXTERNAL_PLAN_CD", key.getl_EXTERNAL_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY") && key.getl_RLSD_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_RLSD_PUCH_ODR_QTY", key.getl_RLSD_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY") && key.getl_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_QTY", key.getl_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP") && key.getl_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP", key.getl_OPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE") && key.getl_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("l_BUSINESS_OPR_DATE", key.getl_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM") && key.getl_PRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_FROM", key.getl_PRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO") && key.getl_PRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_TO", key.getl_PRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM_ZERO") && key.getl_PRD_DUE_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_FROM_ZERO", key.getl_PRD_DUE_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO_ZERO") && key.getl_PRD_DUE_DATE_TO_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE_TO_ZERO", key.getl_PRD_DUE_DATE_TO_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM") && key.getl_PRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_FROM", key.getl_PRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO") && key.getl_PRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_TO", key.getl_PRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM_ZERO") && key.getl_PRD_START_DATE_FROM_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_FROM_ZERO", key.getl_PRD_START_DATE_FROM_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO_ZERO") && key.getl_PRD_START_DATE_TO_ZERO() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE_TO_ZERO", key.getl_PRD_START_DATE_TO_ZERO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_1") && key.getODR_STS_TYP_1() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_1", key.getODR_STS_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_2") && key.getODR_STS_TYP_2() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_2", key.getODR_STS_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_DELAYED") && key.getODR_STS_TYP_9_DELAYED() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_9_DELAYED", key.getODR_STS_TYP_9_DELAYED());
				}
				if(msgKeyType.containsKeyColumn("l_DELAY_BASE_DATE") && key.getl_DELAY_BASE_DATE() != null) {
					msgKey.setKeyValue("l_DELAY_BASE_DATE", key.getl_DELAY_BASE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_NOT_DELAYED") && key.getODR_STS_TYP_9_NOT_DELAYED() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_9_NOT_DELAYED", key.getODR_STS_TYP_9_NOT_DELAYED());
				}
				if(msgKeyType.containsKeyColumn("l_NOT_DELAY_BASE_DATE") && key.getl_NOT_DELAY_BASE_DATE() != null) {
					msgKey.setKeyValue("l_NOT_DELAY_BASE_DATE", key.getl_NOT_DELAY_BASE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9") && key.getODR_STS_TYP_9() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_9", key.getODR_STS_TYP_9());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_1") && key.getMRP_ODR_TYP_1() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_1", key.getMRP_ODR_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_2") && key.getMRP_ODR_TYP_2() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_2", key.getMRP_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_3") && key.getMRP_ODR_TYP_3() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_3", key.getMRP_ODR_TYP_3());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_4") && key.getMRP_ODR_TYP_4() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_4", key.getMRP_ODR_TYP_4());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_5") && key.getMRP_ODR_TYP_5() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_5", key.getMRP_ODR_TYP_5());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_6") && key.getMRP_ODR_TYP_6() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_6", key.getMRP_ODR_TYP_6());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_7") && key.getMRP_ODR_TYP_7() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_7", key.getMRP_ODR_TYP_7());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_8") && key.getMRP_ODR_TYP_8() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_8", key.getMRP_ODR_TYP_8());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("DELAY_TYP") && key.getDELAY_TYP() != null) {
					msgKey.setKeyValue("DELAY_TYP", key.getDELAY_TYP());
				}
				if(msgKeyType.containsKeyColumn("NOT_DELAY_TYP") && key.getNOT_DELAY_TYP() != null) {
					msgKey.setKeyValue("NOT_DELAY_TYP", key.getNOT_DELAY_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
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
					AJ0010010Struct key = new AJ0010010Struct();
					if(msgKeyType.containsKeyColumn("r1_MRP_ODR_TYP")) {
						key.setr1_MRP_ODR_TYP(msgKey.getKeyValue("r1_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r2_MRP_ODR_TYP")) {
						key.setr2_MRP_ODR_TYP(msgKey.getKeyValue("r2_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("r3_MRP_ODR_TYP")) {
						key.setr3_MRP_ODR_TYP(msgKey.getKeyValue("r3_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c1_PROGRESS_STS_TYP")) {
						key.setc1_PROGRESS_STS_TYP(msgKey.getKeyValue("c1_PROGRESS_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM")) {
						key.setPRD_DUE_DATE_FROM(msgKey.getKeyValue("PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO")) {
						key.setPRD_DUE_DATE_TO(msgKey.getKeyValue("PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("c2_PROGRESS_STS_TYP")) {
						key.setc2_PROGRESS_STS_TYP(msgKey.getKeyValue("c2_PROGRESS_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM")) {
						key.setPRD_START_DATE_FROM(msgKey.getKeyValue("PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO")) {
						key.setPRD_START_DATE_TO(msgKey.getKeyValue("PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("c1_ODR_STS_TYP")) {
						key.setc1_ODR_STS_TYP(msgKey.getKeyValue("c1_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_ODR_STS_TYP")) {
						key.setc2_ODR_STS_TYP(msgKey.getKeyValue("c2_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_ODR_STS_TYP")) {
						key.setc3_ODR_STS_TYP(msgKey.getKeyValue("c3_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN")) {
						key.setl_PROGRESS_STATUS_DN(msgKey.getKeyValue("l_PROGRESS_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN")) {
						key.setl_ODR_STS_TYP_DN(msgKey.getKeyValue("l_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN")) {
						key.setl_OUTSIDE_TYP_DN(msgKey.getKeyValue("l_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN")) {
						key.setl_MRP_ODR_TYP_DN(msgKey.getKeyValue("l_MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_TYP_DN")) {
						key.setl_JOB_ODR_TYP_DN(msgKey.getKeyValue("l_JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN")) {
						key.setl_OD_GNR_TYP_DN(msgKey.getKeyValue("l_OD_GNR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS")) {
						key.setl_PROGRESS_STATUS(new Integer(msgKey.getKeyValue("l_PROGRESS_STATUS")));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_FROM")) {
						key.setPRD_DUE_TIME_FROM(msgKey.getKeyValue("PRD_DUE_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_TIME_TO")) {
						key.setPRD_DUE_TIME_TO(msgKey.getKeyValue("PRD_DUE_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_TIME_FROM")) {
						key.setPRD_START_TIME_FROM(msgKey.getKeyValue("PRD_START_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_TIME_TO")) {
						key.setPRD_START_TIME_TO(msgKey.getKeyValue("PRD_START_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(new Integer(msgKey.getKeyValue("l_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(new Integer(msgKey.getKeyValue("l_MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_START_DATE")) {
						key.setl_ODR_START_DATE(msgKey.getKeyValue("l_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE")) {
						key.setl_PRD_START_DATE(msgKey.getKeyValue("l_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP")) {
						key.setOD_GNR_TYP(new Integer(msgKey.getKeyValue("OD_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY")) {
						key.setl_TOTAL_RCV_QTY(msgKey.getKeyValue("l_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE")) {
						key.setl_RCV_CMPLT_DATE(msgKey.getKeyValue("l_RCV_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_DM_FLG")) {
						key.setEXTERNAL_DM_FLG(new Integer(msgKey.getKeyValue("EXTERNAL_DM_FLG")));
					}
					if(msgKeyType.containsKeyColumn("l_EXTERNAL_PLAN_CD")) {
						key.setl_EXTERNAL_PLAN_CD(msgKey.getKeyValue("l_EXTERNAL_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(new Integer(msgKey.getKeyValue("MRP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY")) {
						key.setl_RLSD_PUCH_ODR_QTY(msgKey.getKeyValue("l_RLSD_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY")) {
						key.setl_WORK_IN_PROC_QTY(msgKey.getKeyValue("l_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(new Integer(msgKey.getKeyValue("OD_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP")) {
						key.setl_OPR_RSLT_TYP(new Integer(msgKey.getKeyValue("l_OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE")) {
						key.setl_BUSINESS_OPR_DATE(msgKey.getKeyValue("l_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM")) {
						key.setl_PRD_DUE_DATE_FROM(msgKey.getKeyValue("l_PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO")) {
						key.setl_PRD_DUE_DATE_TO(msgKey.getKeyValue("l_PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_FROM_ZERO")) {
						key.setl_PRD_DUE_DATE_FROM_ZERO(msgKey.getKeyValue("l_PRD_DUE_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE_TO_ZERO")) {
						key.setl_PRD_DUE_DATE_TO_ZERO(msgKey.getKeyValue("l_PRD_DUE_DATE_TO_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM")) {
						key.setl_PRD_START_DATE_FROM(msgKey.getKeyValue("l_PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO")) {
						key.setl_PRD_START_DATE_TO(msgKey.getKeyValue("l_PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_FROM_ZERO")) {
						key.setl_PRD_START_DATE_FROM_ZERO(msgKey.getKeyValue("l_PRD_START_DATE_FROM_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE_TO_ZERO")) {
						key.setl_PRD_START_DATE_TO_ZERO(msgKey.getKeyValue("l_PRD_START_DATE_TO_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_1")) {
						key.setODR_STS_TYP_1(msgKey.getKeyValue("ODR_STS_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_2")) {
						key.setODR_STS_TYP_2(msgKey.getKeyValue("ODR_STS_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_DELAYED")) {
						key.setODR_STS_TYP_9_DELAYED(msgKey.getKeyValue("ODR_STS_TYP_9_DELAYED"));
					}
					if(msgKeyType.containsKeyColumn("l_DELAY_BASE_DATE")) {
						key.setl_DELAY_BASE_DATE(msgKey.getKeyValue("l_DELAY_BASE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9_NOT_DELAYED")) {
						key.setODR_STS_TYP_9_NOT_DELAYED(msgKey.getKeyValue("ODR_STS_TYP_9_NOT_DELAYED"));
					}
					if(msgKeyType.containsKeyColumn("l_NOT_DELAY_BASE_DATE")) {
						key.setl_NOT_DELAY_BASE_DATE(msgKey.getKeyValue("l_NOT_DELAY_BASE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_9")) {
						key.setODR_STS_TYP_9(msgKey.getKeyValue("ODR_STS_TYP_9"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_1")) {
						key.setMRP_ODR_TYP_1(msgKey.getKeyValue("MRP_ODR_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_2")) {
						key.setMRP_ODR_TYP_2(msgKey.getKeyValue("MRP_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_3")) {
						key.setMRP_ODR_TYP_3(msgKey.getKeyValue("MRP_ODR_TYP_3"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_4")) {
						key.setMRP_ODR_TYP_4(msgKey.getKeyValue("MRP_ODR_TYP_4"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_5")) {
						key.setMRP_ODR_TYP_5(msgKey.getKeyValue("MRP_ODR_TYP_5"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_6")) {
						key.setMRP_ODR_TYP_6(msgKey.getKeyValue("MRP_ODR_TYP_6"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_7")) {
						key.setMRP_ODR_TYP_7(msgKey.getKeyValue("MRP_ODR_TYP_7"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_8")) {
						key.setMRP_ODR_TYP_8(msgKey.getKeyValue("MRP_ODR_TYP_8"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DELAY_TYP")) {
						key.setDELAY_TYP(msgKey.getKeyValue("DELAY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NOT_DELAY_TYP")) {
						key.setNOT_DELAY_TYP(msgKey.getKeyValue("NOT_DELAY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
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
