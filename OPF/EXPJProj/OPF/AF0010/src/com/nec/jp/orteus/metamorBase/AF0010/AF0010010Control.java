/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0010/src/com/nec/jp/orteus/metamorBase/AF0010/AF0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0010;

import com.nec.jp.orteus.metamorBase.AF0010.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
//------------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;

import com.nec.jp.orteus.metamorBase.common.util.ScreenParam;

import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.math.BigDecimal;

import com.nec.jp.orteus.expj.lot.LotStock;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ItemStock;
import com.nec.jp.orteus.expj.pr.rcvissue.process.JobOdrStock;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
//------------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0010010Control
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
	public List getList() { return this.list; } 					// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AF0010010Struct getListvalue(int x) { return (AF0010010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0010010Struct getStruct() { return this.struct; }	// Structを返します。
	public AF0010010Struct createStruct() { return new AF0010010Struct(); } // 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0010010Struct)structname); }	// Structをセットします。
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


//---------- キー情報の退避処理 ---------------------------------------------------

	/** キー情報保持の為のStruct */
	private AF0010010Struct _keyStruct = new AF0010010Struct();

	/** キー情報Structの取得 */
	public AF0010010Struct getKeyStruct(){ return _keyStruct; }

	/** キー情報Structの設定 */
	public void setKeyStruct(AF0010010Struct struct){ _keyStruct.copy(struct); }


//---------- ＣＳＶ出力関連の処理 ---------------------------------------------------

	private List csvList = null;
	public List getCsvList(){ return this.csvList; }

	/** 一覧情報格納用リスト */
	List _listData = new ArrayList(0);


//---------- コンボボックスデータ取得関連の処理 -------------------------------

	/** 出庫完了フラグ **/
	ComboStruct _w_ISSUE_CMPLT_FLG = null;

	/** 出庫完了フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setw_ISSUE_CMPLT_FLG_comb(ComboStruct combo){ _w_ISSUE_CMPLT_FLG = combo; }

	/** 出庫完了フラグ取得
	 * @return 出庫完了フラグのコンボボックスデータ
	*/
	public ComboStruct getw_ISSUE_CMPLT_FLG_comb(){ return _w_ISSUE_CMPLT_FLG; }


	/** 出庫区分 **/
	ComboStruct _ISSUE_TYP = null;

	/** 出庫区分設定
	 * @param コンボボックスデータ
	*/
	public void setISSUE_TYP_comb(ComboStruct combo){ _ISSUE_TYP = combo; }

	/** 出庫区分取得
	 * @return 出庫区分のコンボボックスデータ
	*/
	public ComboStruct getISSUE_TYP_comb(){ return _ISSUE_TYP; }


	/** 支給区分 **/
	ComboStruct _CONS_TYP = null;

	/** 支給区分設定
	 * @param コンボボックスデータ
	*/
	public void setCONS_TYP_comb(ComboStruct combo){ _CONS_TYP = combo; }

	/** 支給区分取得
	 * @return 支給区分のコンボボックスデータ
	*/
	public ComboStruct getCONS_TYP_comb(){ return _CONS_TYP; }


//------------------------------------------------------------------------

	/** ユーザ定義の初期化済フラグ */
	private boolean _usersIntialized = false;
	/**
     * システムパラメータにあるTIME_CTRLをTIME_CTRLに設定する。システムパラメータになければnullを設定する。
	 */
	private void setTimeCtrl(AF0010010Struct struct)  throws FoundationException,ExpjException {
		// システムパラメータ（TIME_CTRL）取得
		AF0010010Struct TIME_CTRLStruct = new AF0010010Struct();
		List TIME_CTRLList = null;
		try {
			TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
		} catch (SQLException e) {
			throw new ExpjException(e);
		}
		
		if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
			TIME_CTRLStruct = (AF0010010Struct)TIME_CTRLList.get(0);
			struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
		}else{
			struct.setTIME_CTRL(null);
		}
	}

	/**
	 * 出庫予定日を設定する。
	 * 出荷予定日（From)（scdl_issue_date_from）と出荷予定日（From)（時刻）（scdl_issue_time_to）、< /br>
	 * 出荷予定日（To)（scdl_issue_date_to）と出荷予定日（To)（時刻）（scdl_issue_time_to）から< /br>
	 * 検索条件であるl_scdl_issue_date_from、l_scdl_issue_date_from_ZERO、</br>
	 * l_scdl_issue_date_to、l_scdl_issue_date_to_ZEROを設定する。
	 * @param struct ストラクト
	 */
	private void setDateTimeData(AF0010010Struct struct) {
	
		// 抽出条件（日付の設定）
      if(null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){ // タイムコントロールがtrueのとき
      	  	// 出庫予定日（From）
			if(null == struct.getscdl_issue_date_from() || "".equals(struct.getscdl_issue_date_from())){
			  // 出庫予定日（From）が未入力のときは、検索条件にnullを代入
			  struct.setl_scdl_issue_date_from(null);
			  struct.setl_scdl_issue_date_from_ZERO(null);
		    }else{
				// 出庫予定日（From）が入力されていたとき
				if(null == struct.getscdl_issue_time_from() || "".equals(struct.getscdl_issue_time_from())){
			    	// 出庫予定日（From）（時刻）が未入力のとき、「日付 00:00」とする
			    	struct.setl_scdl_issue_date_from(struct.getscdl_issue_date_from() + " 00:00");
				}else{  // 出庫予定日（From）（時刻）が入力されていたとき
					// 4桁でなければ頭に0を挿入
				  	struct.setscdl_issue_time_from(AppendZero(struct.getscdl_issue_time_from(),4));
			    	// YYYY/MM/DD HH24:MIを代入
			    	struct.setl_scdl_issue_date_from(struct.getscdl_issue_date_from() + " " + 
			                                  struct.getscdl_issue_time_from().substring(0,2) + ":" + 
			                                  struct.getscdl_issue_time_from().substring(2));
				}
		   	}
		  
		  	// 出庫予定日（To）
			if(null == struct.getscdl_issue_date_to() || "".equals(struct.getscdl_issue_date_to())){
				// 出庫予定日（To）が未入力のときは、検索条件にnullを代入
				struct.setl_scdl_issue_date_to(null);
				struct.setl_scdl_issue_date_to_ZERO(null);
		    }else{
				// 出庫予定日（To）が入力されていたとき
				if(null == struct.getscdl_issue_time_to() || "".equals(struct.getscdl_issue_time_to())){
			    	// 出庫予定日（To）（時刻）が未入力のとき、「日付 23:59」とする
			    	struct.setl_scdl_issue_date_to(struct.getscdl_issue_date_to() + " 23:59");
				}else{ // 出庫予定日（To）（時刻）が入力されていたとき
					// 4桁でなければ頭に0を挿入
					struct.setscdl_issue_time_to(AppendZero(struct.getscdl_issue_time_to(),4));
					// YYYY/MM/DD HH24:MIを代入
					struct.setl_scdl_issue_date_to(struct.getscdl_issue_date_to() + " " + 
			                                  struct.getscdl_issue_time_to().substring(0,2) + ":" + 
			                                  struct.getscdl_issue_time_to().substring(2));
				}
		    }
	    }else{
			struct.setl_scdl_issue_date_from(struct.getscdl_issue_date_from());
			
			if(null == struct.getscdl_issue_date_to() || "".equals(struct.getscdl_issue_date_to())){
		  		struct.setl_scdl_issue_date_to(null);
			}else{
		  		struct.setl_scdl_issue_date_to(struct.getscdl_issue_date_to() + " 23:59");
			}
		}
	
	}

	
	/**
	 * ユーザ定義 初期化処理
	 */
	private void usersInitialize() throws FoundationException, ExpjException
	{
      // 読込ステータス設定
      setReadStatus(INITIAL);
      
      // 工場コードをデフォルト表示
      struct.setPLANT_CD(getsysPLANT_CD());

      //ステータスの初期化
      struct.setc1_WORK_STS_TYP("true");
      struct.setc2_WORK_STS_TYP("true");
      struct.setc3_WORK_STS_TYP(null);
      struct.setc4_WORK_STS_TYP(null);
      struct.setc5_WORK_STS_TYP(null);
      
      //出庫指示出庫区分の初期化
      struct.setc1_ISSUE_TYP("true");
      struct.setc2_ISSUE_TYP("true");
      struct.setc3_ISSUE_TYP("true");
      
      //出力済再出力の初期化
      struct.setc_RE_PRINT(null);
      
      // 時刻コントロールの設定
      setTimeCtrl(struct);
      
      // 出庫予定日の設定
      setDateTimeData(struct);
      
      if(_usersIntialized) return;
      
      // コンボデータの取得
      setComboData(struct);
      
      _usersIntialized = true;
      
      return ;
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
	
	
//------------------------------------------------------------------------
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
	 private void setComboData(AF0010010Struct data) throws ExpjException
	 {
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
		try{
			//コンボデータの取得
			ComboStruct w_ISSUE_CMPLT_FLG_comb = controller.getData("ISSUE_CMPLT_FLG");
			ComboStruct ISSUE_TYP_comb = controller.getData("ISSUE_TYP");
			ComboStruct CONS_TYP_comb = controller.getData("CONS_TYP");

			controller.setConnection(null);

			//属性に取得データ設定
			setw_ISSUE_CMPLT_FLG_comb(w_ISSUE_CMPLT_FLG_comb);
			setISSUE_TYP_comb(ISSUE_TYP_comb);
			setCONS_TYP_comb(CONS_TYP_comb);


		}catch(SQLException e) {
			setSqlExceptionMsg(e);

		}catch(ComboException e){
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
	}

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
//-----------------------------------------------------------------------------

	/**
	 * 出庫完了フラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setIssueCmpltTypeValue(AF0010010Struct s)
	{
		s.setISSUE_CMPLT_NAME(getTypeName(_w_ISSUE_CMPLT_FLG,s.getISSUE_CMPLT_FLG()));
	}

	/**
	 * 出庫区分の表示を設定
	 * @param s 区分の値が設定されている情報
	 */
	private void setIssueTypeValue(AF0010010Struct s)
	{
		s.setISSUE_NAME(getTypeName(_ISSUE_TYP,s.getISSUE_TYP()));
	}

	/**
	 * 支給区分フラグの表示を設定
	 * @param s フラグの値が設定されている情報
	 */
	private void setConsTypeValue(AF0010010Struct s)
	{
		s.setCONS_NAME(getTypeName(_CONS_TYP,s.getCONS_TYP()));
	}

	/**
	 * 区分名取得
	 * @param comboStruct 区分情報リスト
	 * @param intType 区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, Integer intType)
	{
		if(comboStruct == null || intType == null)	return null;
		String strTyp = TypeConverter.sanitizer(intType);
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
	 * 作業指示番号の表示を設定
	 * @param s 表示元を判定する情報
	 */
	private void setOprInstCd(AF0010010Struct s)
	{
		if( (s.getWORK_IN_PROC_CD() == null) || (("").equals(s.getWORK_IN_PROC_CD())) ){
			s.sets_OPR_INST_CD(s.getOPR_INST_CD_item());
		} else {
			s.sets_OPR_INST_CD(s.getOPR_INST_CD_proc());
		}
	}


//------------------------------------------------------------------------
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
	 * @param メッセージ番号
	 */
	private void setErrorMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 * @param 置換文字列１
	 */
	private void setErrorMessage(String messageno, String message, String value1)
	{
		ExpjMessage emsg = new ExpjMessage( messageno , value1 );
		msgStruct.addError( emsg );
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
		emsg = new ExpjMessage( "ZZ01006", message );
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
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}

	/**
	 * ログメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
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
	 * @param	key 	パラメータ
	 */
	private void setExceptionParameter(String key)
	{
		ExpjMessage emsg = new ExpjMessage("ZZ01006", key);
		sysLog.severe(emsg, getsysUSER_CD());
	}

	/**
	 * 出庫保管区順を取得する
	 * @param plantCd 工場コード
	 * @param itemCd 品目番号
	 * @return List 出庫元保管区コードリスト
	 */
	public List getAutoIssue(String plantCd, String itemCd) {
		try{
			// ①工場コード、品目番号、所要量計算対象フラグを元に
			//	 [品目別保管先優先順位]、[保管区]から保管区コード一覧を
			//	 優先順位番号の昇順で取得する。
			List outList = getPriorityByItem(plantCd, itemCd);
			if( outList.size() > 0 ){
				return outList;
			}

			// ②所要量計算対象フラグがON（1:所要量計算対象）の保管区コード一覧を
			//	 [保管区]から保管区コードの昇順で取得する。
			outList = getMrpAscAll(plantCd);
			if( outList.size() > 0 ){
				return outList;
			}

			// 1件もデータが存在しなかった場合処理終了
			return outList;

		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
			return null;
		}
	}
	
	/**
	 * 工場コード、品目番号、所要量計算対象フラグを元に
	 * [品目別保管先優先順位]、[保管区]から保管区コード一覧を
	 * 優先順位番号の昇順で取得する。
	 * @param plantCd 工場コード
	 * @param itemCd 品目番号
	 * @param bWhCd 出庫元保管区
	 * @return List	優先保管区コード
	 */
	public List getPriorityByItem(String plantCd, String itemCd) {
		try {
			AF0010010Struct checkStruct = new AF0010010Struct();
			checkStruct.setPLANT_CD(plantCd);
			checkStruct.setITEM_CD(itemCd);
			checkStruct.setMRP_FLG("1");
			List outList = entity.mM_WH_PRIORITY.read(conn, checkStruct);
			return outList;	
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
			return null;
		}
	}

	/**
	 * 所要量計算対象フラグがON（1:所要量計算対象）の保管区コード一覧を
	 * [保管区]から保管区コードの昇順で取得する。
	 * @param plantCd 工場コード
	 * @return List 保管区コード([保管区]."保管区コード"の昇順)
	 */
	public List getMrpAscAll(String plantCd){
		try {
			AF0010010Struct checkStruct = new AF0010010Struct();
			checkStruct.setPLANT_CD(plantCd);
			checkStruct.setMRP_FLG("1");
			List outList = entity.mselectM_WH.read(conn, checkStruct);
			return outList;
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
			return null;
		}
	}
	
	/**
	 * 製番品目の出庫元保管区取得
	 * @param jobOdrStruct
	 * @return
	 */
	private boolean whForJobOdr(AF0010010Struct jobOdrStruct) {
		try {
			
			if (jobOdrStruct.getJOB_ODR_CD() == null || "".equals(jobOdrStruct.getJOB_ODR_CD())) {
				return false;
			}
			
			// 製番在庫クラス
			JobOdrStock sJobOdrStock; 
			// 保管区毎の手持在庫数
			BigDecimal bdHandQtr = new BigDecimal("0");
			// 最初の保管区コード
			String sWH_CD_MIN = "";
			String sWH_NAME_MIN = "";
			// 製番在庫の存在フラグ
			boolean haveFlg = false;
			// 保管区リスト取得
			List whList = getAutoIssue(jobOdrStruct.getl_PLANT_CD(), jobOdrStruct.getl_ITEM_CD());
			if (whList.isEmpty()) {
				return false;
			}
			
			for (int i = 0; i < whList.size(); i++) {
				// 保管区
				AF0010010Struct whCdStruct = (AF0010010Struct) whList.get(i);
				String whCd = whCdStruct.getWH_CD();
				// 最初の保管区コードを退避しておく。
				if ("".equals(sWH_CD_MIN)) {
					sWH_CD_MIN = whCd;
					sWH_NAME_MIN = whCdStruct.getWH_NAME();
				}
				
				// 該当保管区の製番在庫を検索
				sJobOdrStock = new JobOdrStock(conn);
				bdHandQtr = sJobOdrStock.getHandQty(jobOdrStruct.getJOB_ODR_CD(),
						Integer.parseInt(jobOdrStruct.getl_h_JOB_ODR_DETAIL_NO()),
						jobOdrStruct.getl_ITEM_CD(), whCd, 0);
				// 製番在庫存在場合
				if (bdHandQtr != null && bdHandQtr.compareTo(new BigDecimal("0")) != 0) {
					// 出庫元保管区
					jobOdrStruct.setl_h_B_WH_CD(whCd);
					// 出庫元保管区名
					jobOdrStruct.setl_h_B_WH_NAME(whCdStruct.getWH_NAME());
					// 在庫数
					jobOdrStruct.setl_h_HAND_QTY(bdHandQtr.toString());
					haveFlg = true;
					break;
				}
			}
			// 製番在庫存在しない場合
			if (!haveFlg) {
				// 出庫元保管区
				jobOdrStruct.setl_h_B_WH_CD(sWH_CD_MIN);
				// 出庫元保管区名
				jobOdrStruct.setl_h_B_WH_NAME(sWH_NAME_MIN);
				// 在庫数
				jobOdrStruct.setl_h_HAND_QTY("0");
			}
			
			// 画面出庫元保管区チェック
			if (struct.getB_WH_CD() != null && !"".equals(struct.getB_WH_CD()) && !struct.getB_WH_CD().equals(jobOdrStruct.getl_h_B_WH_CD())) {
				return false;
			}
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
			return false;
		}
	}
	
	/**
	 * MRP品目の出庫元保管区取得
	 * @param mrpStruct
	 * @return
	 */
	private boolean whForMrp(AF0010010Struct mrpStruct) {
		
		try {
			// ロット管理フラグ
			int iLotFlag = Integer.parseInt(mrpStruct.getLOT_CTRL_FLG());
			// 品目在庫存在フラグ
			boolean haveFlg = false;
			
			if (iLotFlag == 1) {
				
				// 出庫品目がロット管理品目である場合
				PrivateConfig pc = new PrivateConfig(conn);
				String AUTOISSUE_BEST_BEFORE = pc.getString("AUTOISSUE_BEST_BEFORE");
				LotStock sLotStock = null;
				if (AUTOISSUE_BEST_BEFORE == null) {
					AUTOISSUE_BEST_BEFORE = "0";
				}
				// 該当保管区の品目在庫を検索
				List LotStockList = null;
				sLotStock = new LotStock(conn);
				LotStock.LotStockStruct LSS = sLotStock.new LotStockStruct();

				// ロット・品目別手持ち在庫数
				LotStockList = sLotStock.getHandQty(mrpStruct.getl_ITEM_CD(), 
						Converter.strToDate(mrpStruct.getSCDL_ISSUE_DATE(), Converter.SLASH_DATE), 
						AUTOISSUE_BEST_BEFORE, 
						mrpStruct.getl_PLANT_CD());
				
				for (int i = 0; i < LotStockList.size(); i++) {
					LSS = (LotStock.LotStockStruct) LotStockList.get(i);
					if (LSS.m_STOCK_ON_HAND_QTY != null && LSS.m_STOCK_ON_HAND_QTY.compareTo(new BigDecimal("0")) != 0) {
						// 出庫元保管区
						mrpStruct.setl_h_B_WH_CD(LSS.m_WH_CD);
						AF0010010Struct whNameStruct = new AF0010010Struct();
						whNameStruct.setWH_CD(LSS.m_WH_CD);
						List whNameList = entity.mM_WH.read(conn, whNameStruct);
						// 出庫元保管区名
						mrpStruct.setl_h_B_WH_NAME(((AF0010010Struct)whNameList.get(0)).getWH_NAME());
						// 在庫数
						mrpStruct.setl_h_HAND_QTY(LSS.m_STOCK_ON_HAND_QTY.toString());
						// ロット番号
						mrpStruct.setl_h_LOT_NO(LSS.m_LOT_NO);
						haveFlg = true;
						break;
					}
				}
				if (!haveFlg) {
					List whList = getAutoIssue(mrpStruct.getl_PLANT_CD(), mrpStruct.getl_ITEM_CD());
					if (whList.isEmpty()) {
						return false;
					} else {
						// 出庫元保管区
						mrpStruct.setl_h_B_WH_CD(((AF0010010Struct) whList.get(0)).getWH_CD());
						// 出庫元保管区名
						mrpStruct.setl_h_B_WH_NAME(((AF0010010Struct) whList.get(0)).getWH_NAME());
						// 在庫数
						mrpStruct.setl_h_HAND_QTY("0");
						// ロット番号
						mrpStruct.setl_h_LOT_NO("");
					}
				}
				// 画面出庫元保管区チェック
				if (struct.getB_WH_CD() != null && !"".equals(struct.getB_WH_CD()) && !struct.getB_WH_CD().equals(mrpStruct.getl_h_B_WH_CD())) {
					return false;
				} else {
					return true;
				}
				
			} else {
				// 最初の保管区コード
				String sWH_CD_MIN = "";
				String sWH_NAME_MIN = "";
				// 品目在庫クラス
				ItemStock sItemStock; 
				// 保管区毎の手持在庫数
				BigDecimal bdHandQtr = new BigDecimal("0");
				
				List whList = getAutoIssue(mrpStruct.getl_PLANT_CD(), mrpStruct.getl_ITEM_CD());
				
				if (whList.isEmpty()) {
					return false;
				}
				
				for (int i = 0; i < whList.size(); i++) {
					AF0010010Struct whCdStruct = (AF0010010Struct) whList.get(i);
					String whCd = whCdStruct.getWH_CD();
					// 最初の保管区コードを退避しておく。
					if (sWH_CD_MIN.equals("")) {
						sWH_CD_MIN = whCd;
						sWH_NAME_MIN = whCdStruct.getWH_NAME();
					}
					// 該当保管区の品目在庫を検索
					sItemStock = new ItemStock(conn);
					bdHandQtr = sItemStock.getHandQty(mrpStruct.getl_ITEM_CD(), whCd, 0);
					// 品目在庫存在場合
					if (bdHandQtr != null && bdHandQtr.compareTo(new BigDecimal("0")) != 0) {
						// 出庫元保管区
						mrpStruct.setl_h_B_WH_CD(whCd);
						// 出庫元保管区名
						mrpStruct.setl_h_B_WH_NAME(whCdStruct.getWH_NAME());
						// 在庫数
						mrpStruct.setl_h_HAND_QTY(bdHandQtr.toString());
						haveFlg = true;
						break;
					}
				}
				// 品目在庫存在しない場合
				if (!haveFlg) {
					// 出庫元保管区
					mrpStruct.setl_h_B_WH_CD(sWH_CD_MIN);
					// 出庫元保管区名
					mrpStruct.setl_h_B_WH_NAME(sWH_NAME_MIN);
					// 在庫数
					mrpStruct.setl_h_HAND_QTY("0");
				}
				
				// 画面出庫元保管区チェック
				if (struct.getB_WH_CD() != null && !"".equals(struct.getB_WH_CD()) && !struct.getB_WH_CD().equals(mrpStruct.getl_h_B_WH_CD())) {
					return false;
				}
				
				return true;
			}
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
			return false;
		}
	}
	
	/**
	 * 出力データの取得
	 * @return
	 */
	private List outList() {
		List outList = new ArrayList();
		for (int i = 0; i < struct.getList_l_STATUS_DN().size(); i++) {
			if ("1".equals(struct.getList_ISSUE_TYP().get(i)) || "2".equals(struct.getList_ISSUE_TYP().get(i))) {
				// マニュアル出庫データ
				AF0010010Struct outStruct = new AF0010010Struct();
				outStruct.setl_STATUS_DN((String)struct.getList_l_STATUS_DN().get(i));
				outStruct.setl_PLANT_CD((String)struct.getList_l_PLANT_CD().get(i));
				outStruct.setl_ISSUE_INST_CD((String)struct.getList_l_ISSUE_INST_CD().get(i));
				outStruct.setl_ITEM_CD((String)struct.getList_l_ITEM_CD().get(i));
				outStruct.setl_ITEM_NAME((String)struct.getList_l_ITEM_NAME().get(i));
				outStruct.setISSUE_INST_QTY((String)struct.getList_ISSUE_INST_QTY().get(i));
				outStruct.setTOTAL_ISSUE_QTY((String)struct.getList_TOTAL_ISSUE_QTY().get(i));
				outStruct.setw_SHIP_REMAIN_QTY((String)struct.getList_w_SHIP_REMAIN_QTY().get(i));
				outStruct.setSTOCK_UNIT((String)struct.getList_STOCK_UNIT().get(i));
				outStruct.setSCDL_ISSUE_DATE((String)struct.getList_SCDL_ISSUE_DATE().get(i));
				outStruct.setISSUE_CMPLT_DATE((String)struct.getList_ISSUE_CMPLT_DATE().get(i));
				outStruct.setISSUE_CMPLT_FLG((String)struct.getList_ISSUE_CMPLT_FLG().get(i));
				outStruct.setISSUE_TYP((String)struct.getList_ISSUE_TYP().get(i));
				outStruct.setl_WH_CD((String)struct.getList_l_WH_CD().get(i));
				outStruct.setl_WH_NAME((String)struct.getList_l_WH_NAME().get(i));
				outStruct.setCONS_TYP((String)struct.getList_CONS_TYP().get(i));
				outStruct.setJOB_ODR_CD((String)struct.getList_JOB_ODR_CD().get(i));

				if(((String)struct.getList_WORK_IN_PROC_CD().get(i)) == null ||
					("").equals((String)struct.getList_WORK_IN_PROC_CD().get(i)) == true){
					if (struct.getList_OPR_INST_CD_item() != null && !struct.getList_OPR_INST_CD_item().isEmpty()) {
						outStruct.setOPR_INST_CD_item((String)struct.getList_OPR_INST_CD_item().get(i));
					}
				}else{
					if (struct.getList_OPR_INST_CD_proc() != null && !struct.getList_OPR_INST_CD_proc().isEmpty()) {
						outStruct.setOPR_INST_CD_proc((String)struct.getList_OPR_INST_CD_proc().get(i));
					} else {
						outStruct.setOPR_INST_CD_proc(null);
					}
				}
				outStruct.setl_WS_CD((String)struct.getList_l_WS_CD().get(i));
				outStruct.setWS_NAME((String)struct.getList_WS_NAME().get(i));
				outStruct.setWORK_ODR_CD((String)struct.getList_WORK_ODR_CD().get(i));
				outStruct.setWORK_IN_PROC_CD((String)struct.getList_WORK_IN_PROC_CD().get(i));
				outStruct.setPROC_NAME((String)struct.getList_PROC_NAME().get(i));
				outStruct.setl_PUCH_ODR_CD((String)struct.getList_l_PUCH_ODR_CD().get(i));
				outStruct.setl_VEND_CD((String)struct.getList_l_VEND_CD().get(i));
				outStruct.setVEND_ANAME((String)struct.getList_VEND_ANAME().get(i));
				outStruct.setOD_NO((String)struct.getList_OD_NO().get(i));
				outStruct.setPS_EDITION((String)struct.getList_PS_EDITION().get(i));
				outStruct.setISSUE_INST_UNIT_NUMERATOR((String)struct.getList_ISSUE_INST_UNIT_NUMERATOR().get(i));
				outStruct.setISSUE_INST_UNIT_DENOMINATOR((String)struct.getList_ISSUE_INST_UNIT_DENOMINATOR().get(i));
				outStruct.setISSUE_INST_COMMENT((String)struct.getList_ISSUE_INST_COMMENT().get(i));
				outStruct.setl_h_B_WH_CD((String)struct.getList_l_h_B_WH_CD().get(i));
				outStruct.setl_h_B_WH_NAME((String)struct.getList_l_h_B_WH_NAME().get(i));
				outStruct.setl_h_HAND_QTY((String)struct.getList_l_h_HAND_QTY().get(i));
				outStruct.setl_h_LOT_NO((String)struct.getList_l_h_LOT_NO().get(i));
				
				outList.add(outStruct);
			}
		}
		return outList;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		List listMessage = new ArrayList();

		try {

			// キー項目ログ表示
			logMessage = "T_ISSUE_INST.PLANT_CD:" + struct.getPLANT_CD()
						+ ", T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD()
						+ ", T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD()
						+ ", T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD()
						+ ", T_ISSUE_INST.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD()
						+ ", T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD()
						+ ", M_WH.WH_CD:" + struct.getB_WH_CD()
						+ ", T_ISSUE_INST.WH_CD:" + struct.getWH_CD()
						+ ", T_ISSUE_INST.ITEM_CD:" + struct.getITEM_CD();
			
			setSyslogConfig(logMessage);

			// 読込ステータス設定
			setReadStatus(INITIAL);

			// リストクリア
			if(list != null){
				list.clear();
				_listData.clear();
			}

			// 画面項目クリア
			struct.setw_WS_NAME("");
			struct.setw_VEND_ANAME("");
			struct.setPLANT_NAME(null);
			struct.setOPR_INST_CD_item(null);
			struct.setOPR_INST_CD_proc(null);
			// 出庫元保管区コード
			struct.setB_WH_NAME(null);
			// 出庫先保管区コード
			struct.setWH_NAME(null);
			// 品目番号
			struct.setITEM_NAME(null);
			

			
			// エラーチェック
			boolean check = true;		// チェック結果格納

			// 工場コード存在チェック
			if(struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
				List tmpList = entity.mM_PLANT.read(conn, struct);
				if(tmpList.size() <= 0 ) {
					// 読込処理失敗：工場コードが存在しません
					logMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
					setErrorMessage("ZZ11001", logMessage);
					check = false;
				}
				else {
					AF0010010Struct checkStruct = (AF0010010Struct)tmpList.get(0);
					struct.setPLANT_NAME(checkStruct.getPLANT_NAME());
				}
			}

			// 作業区コードの存在チェック
			if(struct.getw_WS_CD() != null && struct.getw_WS_CD().equals("") == false) {
				List tmpList = entity.mcheckM_WS.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：作業区コードが存在しません
					logMessage = "M_WS.WS_CD:" + struct.getw_WS_CD();
					setErrorMessage("AF00002", logMessage);
					check = false;
				}
				else{
					AF0010010Struct checkStruct = (AF0010010Struct)tmpList.get(0);

					// 作業区.工場コード ≠ 入力値工場コード チェック
					if((checkStruct.getWS_PLANT_CD().equals(struct.getPLANT_CD())) == false
							&& (struct.getPLANT_CD() != null
							&& struct.getPLANT_CD().equals("")) == false) {
						// 読込処理失敗：工場コードと作業区の工場コードが一致しません
						logMessage = "M_WS.PLANT_CD:" + checkStruct.getWS_PLANT_CD();
						setErrorMessage("AF00131", logMessage);
						check = false;
					}
					// 作業区名を設定する
					struct.setw_WS_NAME(checkStruct.getw_WS_NAME());
				}
			}

			// 取引先コードが指定された場合
			if(struct.getw_VEND_CD() != null && struct.getw_VEND_CD().equals("") == false) {
				// 取引先コードの存在チェック
				List tmpList = entity.mcheckM_VEND.read(conn, struct);
				if(tmpList.size() <= 0) {
					// 読込処理失敗：取引先コードが存在しません
					logMessage = "M_VEND.VEND_CD:" + struct.getw_VEND_CD();
					setErrorMessage("AF00005", logMessage);
					check = false;
				}
				else{
					AF0010010Struct checkStruct = (AF0010010Struct)tmpList.get(0);
					// 取引先名を設定する
					struct.setw_VEND_ANAME(checkStruct.getw_VEND_ANAME());
				}
			}

			// 作業指示番号存在チェック
			if(struct.getOPR_INST_CD() != null && struct.getOPR_INST_CD().equals("") == false) {
				List tmpList = entity.mcheckT_OPR_INST_SLIP.read(conn, struct);
				if(tmpList.size() <= 0 ) {
					logMessage = "T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD();
					setErrorMessage("AF00125", logMessage);
					check = false;
				}
				else{
					AF0010010Struct checkStruct = (AF0010010Struct)tmpList.get(0);
					// 作業指示伝票.工場コード ≠ 入力値工場コード チェック
					if((checkStruct.getPLANT_CD().equals(struct.getPLANT_CD())) == false
							&& (struct.getPLANT_CD() != null
							&& struct.getPLANT_CD().equals("")) == false) {
						// 読込処理失敗：工場コードと作業指示伝票の工場コードが一致しません
						logMessage = "T_OPR_INST_SLIP.PLANT_CD:" + checkStruct.getPLANT_CD();
						setErrorMessage("AF00128", logMessage);
						check = false;
					}
					else {
						if(checkStruct.getOPR_INST_CD_GNR_TYP().equals("1") == true) {
							struct.setOPR_INST_CD_item(struct.getOPR_INST_CD());
						}
						else if(checkStruct.getOPR_INST_CD_GNR_TYP().equals("2") == true) {
							struct.setOPR_INST_CD_proc(struct.getOPR_INST_CD());
						}
					}
				}
			}

			// 発注番号存在チェック
			if(struct.getPUCH_ODR_CD() != null && struct.getPUCH_ODR_CD().equals("") == false) {
				List tmpList = entity.mcheckT_RLSD_PUCH_ODR.read(conn, struct);
				if (tmpList.size() <= 0 ) {
					logMessage = "T_RLSD_PUCH_ODR.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD();
					setErrorMessage("AF00126", logMessage);
					check = false;
				}
				else{
					AF0010010Struct checkStruct = (AF0010010Struct)tmpList.get(0);
					// 発注番号.工場コード ≠ 入力値工場コード チェック
					if((checkStruct.getPLANT_CD().equals(struct.getPLANT_CD())) == false
							&& (struct.getPLANT_CD() != null
							&& struct.getPLANT_CD().equals("")) == false) {
						// 読込処理失敗：工場コードと発注番号の工場コードが一致しません
						logMessage = "T_RLSD_PUCH_ODR.PLANT_CD:" + checkStruct.getPLANT_CD();
						setErrorMessage("AF00129", logMessage);
						check = false;
					}
				}
			}

			// 出庫指示番号存在チェック
			if(struct.getISSUE_INST_CD() != null && struct.getISSUE_INST_CD().equals("") == false) {
				List tmpList = entity.mcheckT_ISSUE_INST.read(conn, struct);
				if(tmpList.size() <= 0 ) {
					logMessage = "ISSUE_INST_CD.ISSUE_INST_CD:" + struct.getISSUE_INST_CD();
					setErrorMessage("AF00127", logMessage);
					check = false;
				}
				else{
					AF0010010Struct checkStruct = (AF0010010Struct)tmpList.get(0);
					// 出庫指示番号.工場コード ≠ 入力値工場コード チェック
					if((checkStruct.getPLANT_CD().equals(struct.getPLANT_CD())) == false
							&& (struct.getPLANT_CD() != null
							&& struct.getPLANT_CD().equals("")) == false) {
						// 読込処理失敗：工場コードと出庫指示番号の工場コードが一致しません
						logMessage = "T_ISSUE_INST.PLANT_CD:" + checkStruct.getPLANT_CD();
						setErrorMessage("AF00130", logMessage);
						check = false;
					}
				}
			}
			
			// 出庫元保管区コード
			if (struct.getB_WH_CD() != null && "".equals(struct.getB_WH_CD()) == false) {
				AF0010010Struct tmpStruct = new AF0010010Struct();
				tmpStruct.setWH_CD(struct.getB_WH_CD());
				List tmpList = entity.mM_WH.read(conn, tmpStruct);
				if (tmpList.isEmpty()) {
					logMessage = "M_WH.WH_CD:" + struct.getB_WH_CD();
					setErrorMessage("AF00028", logMessage);
					check = false;
				} else {
					tmpStruct = (AF0010010Struct) tmpList.get(0);
					// 出庫元保管区名
					struct.setB_WH_NAME(tmpStruct.getWH_NAME());
				}
			}
			
			// 出庫先保管区コード
			if (struct.getWH_CD() != null && "".equals(struct.getWH_CD()) == false) {
				AF0010010Struct tmpStruct = new AF0010010Struct();
				List tmpList = entity.mM_WH.read(conn, struct);
				if (tmpList.isEmpty()) {
					logMessage = "M_WH.WH_CD:" + struct.getWH_CD();
					setErrorMessage("AF00031", logMessage);
					check = false;
				} else {
					tmpStruct = (AF0010010Struct) tmpList.get(0);
					// 出庫先保管区名
					struct.setWH_NAME(tmpStruct.getWH_NAME());
				}
			}
			
			// 品目コード
			if (struct.getITEM_CD() != null && "".equals(struct.getITEM_CD()) == false) {
				AF0010010Struct tmpStruct = new AF0010010Struct();
				List tmpList = entity.mM_ITEM.read(conn, struct);
				if (tmpList.isEmpty()) {
					logMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AC00220", logMessage);
					check = false;
				} else {
					tmpStruct = (AF0010010Struct) tmpList.get(0);
					// 品目名
					struct.setITEM_NAME(tmpStruct.getITEM_NAME());
				}
			}


          // 作業状態区分のチェックが全て[off]の場合
          if(!struct.getc1_WORK_STS_TYP().equals("true") 
             && !struct.getc2_WORK_STS_TYP().equals("true") 
             && !struct.getc3_WORK_STS_TYP().equals("true")
             && !struct.getc4_WORK_STS_TYP().equals("true")
             && !struct.getc5_WORK_STS_TYP().equals("true")
             ){

            listMessage.add("T_ISSUE_INST.PLANT_CD:" +	struct.getPLANT_CD());
            listMessage.add("T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD());
            listMessage.add("T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD());
            listMessage.add("T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD());
            listMessage.add("T_ISSUE_INST.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD());
            listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD());
            listMessage.add("M_WH.WH_CD:" + struct.getB_WH_CD());
            listMessage.add("T_ISSUE_INST.WH_CD:" + struct.getWH_CD());
            listMessage.add("T_ISSUE_INST.ITEM_CD:" + struct.getITEM_CD());
            
            setErrorMessage("ZZ06001", listMessage);

            check = false;
          }

			// データ読込
			if(check == true){

				// 出庫指示出庫区分のチェックが全て[off]の場合
				if (!"true".equals(struct.getc1_ISSUE_TYP())
						&& !"true".equals(struct.getc2_ISSUE_TYP())
						&& !"true".equals(struct.getc3_ISSUE_TYP())) {
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +	struct.getPLANT_CD());
					listMessage.add("T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD());
					listMessage.add("T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD());
					listMessage.add("T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD());
					listMessage.add("T_ISSUE_INST.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD());
					listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD());
					listMessage.add("M_WH.WH_CD:" + struct.getB_WH_CD());
					listMessage.add("T_ISSUE_INST.WH_CD:" + struct.getWH_CD());
					listMessage.add("T_ISSUE_INST.ITEM_CD:" + struct.getITEM_CD());

					setErrorMessage("ZZ06001", listMessage);

					return;
				}
				
				
              //画面．ステータスの初期化
              struct.setSTATUS1(null);
              struct.setSTATUS2(null);
              struct.setSTATUS3(null);
              struct.setSTATUS4(null);
              struct.setSTATUS5(null);
        
              //画面．ステータスの判定
              if(struct.getc1_WORK_STS_TYP().equals("true")){
                struct.setSTATUS1("1");
              }
              if(struct.getc2_WORK_STS_TYP().equals("true")){
                struct.setSTATUS2("2");
              }
              if(struct.getc3_WORK_STS_TYP().equals("true")){
                struct.setSTATUS3("3");
              }
              if(struct.getc4_WORK_STS_TYP().equals("true")){
                struct.setSTATUS4("4");
              }
              if(struct.getc5_WORK_STS_TYP().equals("true")){
                struct.setSTATUS5("5");
              }
              
              //画面．出庫指示出庫区分の初期化
              struct.setISSUE_TYP1(null);
              struct.setISSUE_TYP2(null);
              struct.setISSUE_TYP3(null);
              
              // 出庫指示出庫区分
              // キット出庫
              if ("true".equals(struct.getc1_ISSUE_TYP())) {
            	  struct.setISSUE_TYP1("2");
              }
              // マニュアル出庫
              if ("true".equals(struct.getc2_ISSUE_TYP())) {
            	  struct.setISSUE_TYP2("1");
              }
              // 自動出庫
              if ("true".equals(struct.getc3_ISSUE_TYP())) {
            	  struct.setISSUE_TYP3("3");
              }
              
              // 出力済再出力
              if ("true".equals(struct.getc_RE_PRINT())) {
            	  // 出庫完了
            	  struct.setISSUE_INST_ISS_FLG("1");
              } else {
            	  // 出庫未完了
            	  struct.setISSUE_INST_ISS_FLG("0");
              }
				
				// 出荷予定日の設定
				setDateTimeData(struct);
				// 表示最大行数制限処理
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					struct.setROW_COUNT(String.valueOf(maxLine));
				} else {
					struct.setROW_COUNT(null);
				}
				_listData=entity.mselectCnt.read(conn, struct);
				long rowCount = Long.parseLong(((AF0010010Struct)_listData.get(0)).getl_COUNT());
				if(rowCount == 0){
					// 読込処理失敗：検索結果が0件です
					listMessage.add("T_ISSUE_INST.PLANT_CD:" +	struct.getPLANT_CD());
					listMessage.add("T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD());
					listMessage.add("T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD());
					listMessage.add("T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD());
					listMessage.add("T_ISSUE_INST.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD());
					listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD());
		            listMessage.add("M_WH.WH_CD:" + struct.getB_WH_CD());
		            listMessage.add("T_ISSUE_INST.WH_CD:" + struct.getWH_CD());
		            listMessage.add("T_ISSUE_INST.ITEM_CD:" + struct.getITEM_CD());
					setErrorMessage("ZZ06001", listMessage);
					listMessage.clear();
					_listData.clear();
					setReadStatus(NOT_FOUND);
					return;
				}
				if(maxLine != 0 && rowCount== maxLine+1){
					// 読込ステータス設定
					_listData.clear();
					setReadStatus(TOO_MANY);
					setErrorMessage("ZZ01115", "", ""+maxLine);
				}else{
					_listData = entity.mselect.read(conn, struct);
					// 読込ステータス設定
				    setReadStatus(NORMAL);
				    AF0010010Struct TempStruct;
				    
				    // 表示用list
				    List showList = new ArrayList();
				    
				    for(int i = 0; i < _listData.size(); i++)
				    {
					  // 出庫完了、出庫区分、支給区分に表示する表示名の設定
					  setIssueCmpltTypeValue((AF0010010Struct)(_listData.get(i)));
					  setIssueTypeValue((AF0010010Struct)(_listData.get(i)));
					  setConsTypeValue((AF0010010Struct)(_listData.get(i)));

					  // 作業指示番号に表示するデータの設定
					  setOprInstCd((AF0010010Struct)(_listData.get(i)));
							
					  TempStruct = (AF0010010Struct)_listData.get(i);
					  TempStruct.setl_STATUS_DN(multcombo("ISSUE_INST_STATUS",TempStruct.getl_STATUS()));
					  
					  // 品目手配区分
					  switch (Integer.parseInt(TempStruct.getMRP_ODR_TYP())) { 
						case 1: // 「製番品目」の場合
							if (whForJobOdr(TempStruct)) {
								showList.add(TempStruct);
							}
							break;
						case 2: // 「在庫引当型製番品目」の場合
							if (whForJobOdr(TempStruct)) {
								showList.add(TempStruct);
							}
							break;
						case 3:
							break;
						default: // 「ＭＲＰ品目」である場合
							if (whForMrp(TempStruct)) {
								showList.add(TempStruct);
							}
							break;
						}
				    }
				    
				    if (showList.size() == 0) {
						// 読込処理失敗：検索結果が0件です
						listMessage.add("T_ISSUE_INST.PLANT_CD:" +	struct.getPLANT_CD());
						listMessage.add("T_ISSUE_INST.WS_CD:" + struct.getw_WS_CD());
						listMessage.add("T_ISSUE_INST.VEND_CD:" + struct.getw_VEND_CD());
						listMessage.add("T_OPR_INST_SLIP.OPR_INST_CD:" + struct.getOPR_INST_CD());
						listMessage.add("T_ISSUE_INST.PUCH_ODR_CD:" + struct.getPUCH_ODR_CD());
						listMessage.add("T_ISSUE_INST.ISSUE_INST_CD:" + struct.getISSUE_INST_CD());
						listMessage.add("M_WH.WH_CD:" + struct.getB_WH_CD());
						listMessage.add("T_ISSUE_INST.WH_CD:" + struct.getWH_CD());
						listMessage.add("T_ISSUE_INST.ITEM_CD:" + struct.getITEM_CD());
						setErrorMessage("ZZ06001", listMessage);
						listMessage.clear();
						_listData.clear();
						setReadStatus(NOT_FOUND);
					}

				   // 表示用リストにセット
				   //setList(_listData);
				   setList(showList);
				}
		     }

		}catch(SQLException e){
			// 読込ステータス設定
			setReadStatus(ERROR);

			setSqlExceptionMsg(e);
		}
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * ＣＳＶ出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcsv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlcsv");
			//{{user_implement_dev:<controlcsv>
		//------------------------------------------------------------------
		// ログ出力情報格納用
		String logMessage = "";
		

		// CsvWriterを生成
		csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
		setSyslogConfig("csv-file name ["
				+ CsvWriter.getFileName(getsysUSER_CD()) + "]");

		csvList = new ArrayList();

		// 一覧情報格納用リストから読込データ設定
		setList(_listData);

		// 0件の場合終了
		if (list.size() <= 0)
			return;
		// MOD START 20141204 fei-hy
		// CSV情報の作成
		String title[] = {
				// "Expj.ISSUE_TYP" ,
				// "Expj.Cmt0721" ,
				// "Expj.PLANT_CD" ,
				// "Expj.ISSUE_INST_CD" ,
				// "Expj.ITEM_CD" ,
				// "Expj.ITEM_NAME" ,
				// "Expj.ISSUE_INST_QTY" ,
				// "Expj.TOTAL_ISSUE_QTY" ,
				// "Expj.Cmt0305" ,
				// "Expj.PUCH_ODR_UNIT" ,
				// "Expj.SCDL_ISSUE_DATE" ,
				// "Expj.ISSUE_CMPLT_DATE" ,
				// "Expj.ISSUE_CMPLT_FLG" ,
				// "Expj.WH_CD_1" ,
				// "Expj.WH_NAME_2" ,
				// "Expj.CONS_TYP" ,
				// "Expj.JOB_ODR_CD" ,
				// "Expj.OPR_INST_CD" ,
				// "Expj.WS_CD" ,
				// "Expj.WS_NAME" ,
				// "Expj.WORK_ODR_CD" ,
				// "Expj.WORK_IN_PROC_CD_1" ,
				// "Expj.PROC_NAME" ,
				// "Expj.PUCH_ODR_CD" ,
				// "Expj.VEND_CD" ,
				// "Expj.VEND_NAME" ,
				// "Expj.OD_NO" ,
				// "Expj.PS_EDITION_1" ,
				// "Expj.ISSUE_INST_UNIT_NUMERATOR_1" ,
				// "Expj.ISSUE_INST_UNIT_DENOMINATOR" ,
				// "Expj.ISSUE_INST_COMMENT_1"
				"Expj.ISSUE_INST_CD",	// 出庫指示番号
				"Expj.ITEM_CD",			// 品目番号
				"Expj.JOB_ODR_CD",		// 製番
				"Expj.ISSUE_WH_CD_1",	// 出庫元保管区コード
				"Expj.STOCK_LOT_CD",	// 在庫ロット番号
				"Expj.ISSUE_QTY",		// 出庫残数
				"Expj.ISSUE_DATE",		// 出庫日
				"Expj.ISSUE_CMPLT_FLG",	// 出庫完了
				"Expj.RCV_WH_CD",		// 出庫先保管区コード
				"Expj.VEND_LOT_NO" 		// メーカロット番号
		};
		csvList.add(title);

		for (int i = 0; i < this.list.size(); i++) {
			AF0010010Struct tempStruct = (AF0010010Struct) this.list.get(i);
			// 出庫完了フラグ ＝ 0：未の明細データをCSV形式のデータへ出力可能です。
			if ("0".equals(tempStruct.getISSUE_CMPLT_FLG().toString())) {
				
					// 出庫完了、出庫区分、支給区分の表示名の設定
					//setIssueCmpltTypeValue(tempStruct);
					//setIssueTypeValue(tempStruct);
					//setConsTypeValue(tempStruct);

					String csvStr[] = new String[title.length];
					// csvStr[0] = tempStruct.getISSUE_NAME();
					// csvStr[1] = tempStruct.getl_STATUS_DN();
					// csvStr[2] = tempStruct.getl_PLANT_CD();
					// csvStr[3] = tempStruct.getl_ISSUE_INST_CD();
					// csvStr[4] = tempStruct.getl_ITEM_CD();
					// csvStr[5] = tempStruct.getl_ITEM_NAME();
					// csvStr[6] = tempStruct.getISSUE_INST_QTY();
					// csvStr[7] = tempStruct.getTOTAL_ISSUE_QTY();
					// csvStr[8] = tempStruct.getw_SHIP_REMAIN_QTY();
					// csvStr[9] = tempStruct.getSTOCK_UNIT();
					// csvStr[10] = tempStruct.getSCDL_ISSUE_DATE();
					// csvStr[11] = tempStruct.getISSUE_CMPLT_DATE();
					// csvStr[12] = tempStruct.getISSUE_CMPLT_NAME();
					// csvStr[13] = tempStruct.getl_WH_CD();
					// csvStr[14] = tempStruct.getl_WH_NAME();
					// csvStr[15] = tempStruct.getCONS_NAME();
					// csvStr[16] = tempStruct.getJOB_ODR_CD();
					// if((tempStruct.getWORK_IN_PROC_CD()) == null ||
					// ("").equals(tempStruct.getWORK_IN_PROC_CD()) == true){
					// csvStr[17] = tempStruct.getOPR_INST_CD_item();
					// }else{
					// csvStr[17] = tempStruct.getOPR_INST_CD_proc();
					// }
					// csvStr[18] = tempStruct.getl_WS_CD();
					// csvStr[19] = tempStruct.getWS_NAME();
					// csvStr[20] = tempStruct.getWORK_ODR_CD();
					// csvStr[21] = tempStruct.getWORK_IN_PROC_CD();
					// csvStr[22] = tempStruct.getPROC_NAME();
					// csvStr[23] = tempStruct.getl_PUCH_ODR_CD();
					// csvStr[24] = tempStruct.getl_VEND_CD();
					// csvStr[25] = tempStruct.getVEND_ANAME();
					// csvStr[26] = tempStruct.getOD_NO();
					// csvStr[27] = tempStruct.getPS_EDITION();
					// csvStr[28] = tempStruct.getISSUE_INST_UNIT_NUMERATOR();
					// csvStr[29] = tempStruct.getISSUE_INST_UNIT_DENOMINATOR();
					// csvStr[30] = tempStruct.getISSUE_INST_COMMENT();
					csvStr[0] = tempStruct.getl_ISSUE_INST_CD();	// 出庫指示番号
					csvStr[1] = tempStruct.getl_ITEM_CD();			// 品目番号
					csvStr[2] = tempStruct.getJOB_ODR_CD();			// 製番
					csvStr[3] = tempStruct.getl_h_B_WH_CD();		// 出庫元保管区コード
					csvStr[4] = tempStruct.getl_h_LOT_NO();			// 在庫ロット番号
					csvStr[5] = tempStruct.getw_SHIP_REMAIN_QTY();	// 出庫残数
					csvStr[6] = tempStruct.getSCDL_ISSUE_DATE();	// 出庫日
					csvStr[7] = "1";								// 出庫完了
					csvStr[8] = tempStruct.getl_WH_CD();			// 出庫先保管区コード
					csvStr[9] = null;								// メーカロット番号
					csvList.add(csvStr);
				}
	    }
 			//MOD END 20141204 fei-hy
			logMessage = "Generated CSV-data.";
			setSyslogConfig(logMessage);

			String strFilePath = null;
			try {
				// CSV作成
				setSyslogConfig("csvList.size [" + csvList.size() + "]");
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				strFilePath = csvWriter.getFilePath();
				setSyslogConfig("Completion of CSV-data output.");

				// 出力ファイルパス設定
				struct.setDOWNLOAD_FILE(strFilePath);
				
				// 表示行数オーバでのＣＳＶ出力の場合は表示用リストをクリアする
				if(getReadStatus() == TOO_MANY){
					this.list.clear();
				}
			}
			catch(Exception e)
			{
				// CSV出力失敗
				setExceptionMessage("ZZ01107");
			}

		//------------------------------------------------------------------
                //}}user_implement_dev:<controlcsv>
		logger.exiting("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlcsv");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
      //------------------------------------------------------------------
      // リストクリア
      if(list != null){
        list.clear();
      }
      else{
        list = new ArrayList(0);
      }

      // ユーザ定義初期化
		usersInitialize();
		
      //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlprint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlprint");
			AF0010010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlprint>
		try {

			String printId1 = "AF00100101";	// 帳票IDを指定してください

			ret = svf.VrInit(printId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）

			List printList = new ArrayList();
			if ("1".equals(printPattern)) {
				controlselect();
				if (msgStruct.getError().size() > 0) {
					return;
				}
				printList = list;
			} else if ("3".equals(printPattern)){
				printList = outList();
			} else {
				printList = list;
			}
			
			// 0件の場合終了
			if(printList.size() <= 0){
				setErrorMessage("AF00191");
				return;
			}
			int loopMax = 0;
			
			if ( printList != null ) {
				loopMax = printList.size();
			}
			
			List printList1 = null;
			conn.beginTransWeb();
			boolean outFlag = false;
			for(int i=0; i<loopMax; i++) {				// データ出力 
				strPdf = (AF0010010Struct)printList.get(i);
				if ("1".equals(strPdf.getISSUE_TYP().toString()) || "2".equals(strPdf.getISSUE_TYP().toString())) {
					// 工場コード
					ret = svf.VrsOut("PLANT_CD", strPdf.getl_PLANT_CD());
					// 出庫元保管区
					ret = svf.VrsOut("B_WH_CD", strPdf.getl_h_B_WH_CD());
					// 出庫元保管区名
					ret = svf.VrsOut("B_WH_NAME", strPdf.getl_h_B_WH_NAME());
					// 出庫予定日
					ret = svf.VrsOut("SCDL_ISSUE_DATE", strPdf.getSCDL_ISSUE_DATE());
					// 品目番号
					ret = svf.VrsOut("ITEM_CD", strPdf.getl_ITEM_CD());
					// 品目名
					ret = svf.VrsOut("ITEM_NAME", strPdf.getl_ITEM_NAME());
					// 出庫数
					ret = svf.VrsOut("SHIP_REMAIN_QTY", strPdf.getw_SHIP_REMAIN_QTY());
					// 出庫元在庫数
					ret = svf.VrsOut("HAND_QTY", strPdf.getl_h_HAND_QTY());
					// ロット番号
					ret = svf.VrsOut("LOT_NO", strPdf.getl_h_LOT_NO());
					// 出庫先保管区コード
					ret = svf.VrsOut("WH_CD", strPdf.getl_WH_CD());
					// 出庫先保管区名
					ret = svf.VrsOut("WH_NAME", strPdf.getl_WH_NAME());
					// 出庫指示番号
					ret = svf.VrsOut("ISSUE_INST_CD", strPdf.getl_ISSUE_INST_CD());
					
					ret = svf.VrEndRecord();
					
					if (!"true".equals(struct.getc_RE_PRINT())) {
						// 出庫指示の出庫指示書発行済みフラグ更新
						strPdf.setsUser_ID(sysUSER_CD);
						printList1 = entity.mselectT_ISSUE_INST.read(conn,strPdf);
						if (printList1.isEmpty()) {
							conn.rollback();
							setErrorMessage("ZZ01105");
							return;
						}
						entity.mT_ISSUE_INST.update(conn, strPdf);
					
					}
					outFlag = true;
				}
				
			}
			
			if (outFlag) {
				ret = svf.VrEndPage();							// 改ページ実行
				ret = svf.VrPrint();							// PDF作成終了
				ret = svf.VrQuit();							// PDF作成終了
				if ( "0".equals(printType) ) {	// クライアント印刷の場合
					struct.setDOWNLOAD_FILE(getPdfFileName());
				} else if ( "1".equals(printType) ) {
					try {
						String acrobatPath = svf.getAcrobatPath();
						String acrobatOption1 = svf.getAcrobatOption1();
						String acrobatOption2 = svf.getAcrobatOption2();
						String pdfPrinter = svf.getPrinter();
						Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
						//Runtime.getRuntime().exec(svf.getExecuteOutput());
					}catch(IOException e){
						// サーバ印刷失敗時のエラー処理を記述してください。
					}
				}
				conn.commit();
				controlselect();
			} else {
				setErrorMessage("AF00191");
				if (conn != null) {
					conn.rollback();
				}
				return;
			}
		}catch(ResourceBusyException e) {
			if (conn != null) {
				conn.rollback();
			}
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		}catch(Exception e) {
			
			if (conn != null) {
				conn.rollback();
			}
			
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlprint>
		logger.exiting("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlprint");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//------------------------------------------------------------------
		// ユーザ定義初期化
		usersInitialize();
		//------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0010");
		logger.entering("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア
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
		logger.exiting("AF0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("csv") ) {
				controlcsv();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("print") ) {
				controlprint();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
		//------------------------------------------------------------------
		//コンボボックスに取得データ設定
//		struct.setList_w_ISSUE_CMPLT_FLG_val(_w_ISSUE_CMPLT_FLG.getValList());
//		struct.setList_w_ISSUE_CMPLT_FLG_name(_w_ISSUE_CMPLT_FLG.getExplanList());
		struct.setList_ISSUE_TYP_val(_ISSUE_TYP.getValList());
		struct.setList_ISSUE_TYP_name(_ISSUE_TYP.getExplanList());
		struct.setList_CONS_TYP_val(_CONS_TYP.getValList());
		struct.setList_CONS_TYP_name(_CONS_TYP.getExplanList());

//		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//		} catch(AlarmMessageException ame){
//			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//			throw ee;
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
//			throw new FoundationException("AF0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0010010-E999","CSVの出力処理"));
			throw new FoundationException("AF0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0010010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0010010Entity entity;
	protected AF0010010Struct struct;
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

		entity = new AF0010010Entity();
		struct = new AF0010010Struct();

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
	 * AF0010010クラスの標準コンストラクタ
	 */
	public AF0010010Control() throws BusinessProcessException, FoundationException
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
				AF0010010Struct key = (AF0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_NAME") && key.getISSUE_CMPLT_NAME() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_NAME", key.getISSUE_CMPLT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_NAME") && key.getISSUE_NAME() != null) {
					msgKey.setKeyValue("ISSUE_NAME", key.getISSUE_NAME());
				}
				if(msgKeyType.containsKeyColumn("CONS_NAME") && key.getCONS_NAME() != null) {
					msgKey.setKeyValue("CONS_NAME", key.getCONS_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_OPR_INST_CD") && key.gets_OPR_INST_CD() != null) {
					msgKey.setKeyValue("s_OPR_INST_CD", key.gets_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("scdl_issue_date_from") && key.getscdl_issue_date_from() != null) {
					msgKey.setKeyValue("scdl_issue_date_from", key.getscdl_issue_date_from());
				}
				if(msgKeyType.containsKeyColumn("scdl_issue_date_to") && key.getscdl_issue_date_to() != null) {
					msgKey.setKeyValue("scdl_issue_date_to", key.getscdl_issue_date_to());
				}
				if(msgKeyType.containsKeyColumn("h_issue_cmplt_flg") && key.geth_issue_cmplt_flg() != null) {
					msgKey.setKeyValue("h_issue_cmplt_flg", key.geth_issue_cmplt_flg());
				}
				if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP") && key.getc1_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c1_WORK_STS_TYP", key.getc1_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP") && key.getc2_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c2_WORK_STS_TYP", key.getc2_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP") && key.getc3_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c3_WORK_STS_TYP", key.getc3_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c4_WORK_STS_TYP") && key.getc4_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c4_WORK_STS_TYP", key.getc4_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("c5_WORK_STS_TYP") && key.getc5_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("c5_WORK_STS_TYP", key.getc5_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS_DN") && key.getl_STATUS_DN() != null) {
					msgKey.setKeyValue("l_STATUS_DN", key.getl_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("scdl_issue_time_from") && key.getscdl_issue_time_from() != null) {
					msgKey.setKeyValue("scdl_issue_time_from", key.getscdl_issue_time_from());
				}
				if(msgKeyType.containsKeyColumn("scdl_issue_time_to") && key.getscdl_issue_time_to() != null) {
					msgKey.setKeyValue("scdl_issue_time_to", key.getscdl_issue_time_to());
				}
				if(msgKeyType.containsKeyColumn("c1_ISSUE_TYP") && key.getc1_ISSUE_TYP() != null) {
					msgKey.setKeyValue("c1_ISSUE_TYP", key.getc1_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("c2_ISSUE_TYP") && key.getc2_ISSUE_TYP() != null) {
					msgKey.setKeyValue("c2_ISSUE_TYP", key.getc2_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("c3_ISSUE_TYP") && key.getc3_ISSUE_TYP() != null) {
					msgKey.setKeyValue("c3_ISSUE_TYP", key.getc3_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("c_RE_PRINT") && key.getc_RE_PRINT() != null) {
					msgKey.setKeyValue("c_RE_PRINT", key.getc_RE_PRINT());
				}
				if(msgKeyType.containsKeyColumn("B_WH_CD") && key.getB_WH_CD() != null) {
					msgKey.setKeyValue("B_WH_CD", key.getB_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("B_WH_NAME") && key.getB_WH_NAME() != null) {
					msgKey.setKeyValue("B_WH_NAME", key.getB_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_h_B_WH_CD") && key.getl_h_B_WH_CD() != null) {
					msgKey.setKeyValue("l_h_B_WH_CD", key.getl_h_B_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_h_HAND_QTY") && key.getl_h_HAND_QTY() != null) {
					msgKey.setKeyValue("l_h_HAND_QTY", key.getl_h_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_h_LOT_NO") && key.getl_h_LOT_NO() != null) {
					msgKey.setKeyValue("l_h_LOT_NO", key.getl_h_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_h_B_WH_NAME") && key.getl_h_B_WH_NAME() != null) {
					msgKey.setKeyValue("l_h_B_WH_NAME", key.getl_h_B_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_CHOICE") && key.getw_CHOICE() != null) {
					msgKey.setKeyValue("w_CHOICE", key.getw_CHOICE());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_val") && key.getCONS_TYP_val() != null) {
					msgKey.setKeyValue("CONS_TYP_val", key.getCONS_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP_name") && key.getCONS_TYP_name() != null) {
					msgKey.setKeyValue("CONS_TYP_name", key.getCONS_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_val") && key.getISSUE_TYP_val() != null) {
					msgKey.setKeyValue("ISSUE_TYP_val", key.getISSUE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_name") && key.getISSUE_TYP_name() != null) {
					msgKey.setKeyValue("ISSUE_TYP_name", key.getISSUE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("WS_PLANT_CD") && key.getWS_PLANT_CD() != null) {
					msgKey.setKeyValue("WS_PLANT_CD", key.getWS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_scdl_issue_date_from") && key.getl_scdl_issue_date_from() != null) {
					msgKey.setKeyValue("l_scdl_issue_date_from", key.getl_scdl_issue_date_from());
				}
				if(msgKeyType.containsKeyColumn("l_scdl_issue_date_from_ZERO") && key.getl_scdl_issue_date_from_ZERO() != null) {
					msgKey.setKeyValue("l_scdl_issue_date_from_ZERO", key.getl_scdl_issue_date_from_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_scdl_issue_date_to") && key.getl_scdl_issue_date_to() != null) {
					msgKey.setKeyValue("l_scdl_issue_date_to", key.getl_scdl_issue_date_to());
				}
				if(msgKeyType.containsKeyColumn("l_scdl_issue_date_to_ZERO") && key.getl_scdl_issue_date_to_ZERO() != null) {
					msgKey.setKeyValue("l_scdl_issue_date_to_ZERO", key.getl_scdl_issue_date_to_ZERO());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_INST_CD") && key.getl_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("l_ISSUE_INST_CD", key.getl_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY") && key.getISSUE_INST_QTY() != null) {
					msgKey.setKeyValue("ISSUE_INST_QTY", key.getISSUE_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY") && key.getw_SHIP_REMAIN_QTY() != null) {
					msgKey.setKeyValue("w_SHIP_REMAIN_QTY", key.getw_SHIP_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE") && key.getSCDL_ISSUE_DATE() != null) {
					msgKey.setKeyValue("SCDL_ISSUE_DATE", key.getSCDL_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG") && key.getISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_FLG", key.getISSUE_CMPLT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR") && key.getISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_DENOMINATOR", key.getISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR") && key.getISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("ISSUE_INST_UNIT_NUMERATOR", key.getISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT") && key.getISSUE_INST_COMMENT() != null) {
					msgKey.setKeyValue("ISSUE_INST_COMMENT", key.getISSUE_INST_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_item") && key.getOPR_INST_CD_item() != null) {
					msgKey.setKeyValue("OPR_INST_CD_item", key.getOPR_INST_CD_item());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc") && key.getOPR_INST_CD_proc() != null) {
					msgKey.setKeyValue("OPR_INST_CD_proc", key.getOPR_INST_CD_proc());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS") && key.getl_STATUS() != null) {
					msgKey.setKeyValue("l_STATUS", key.getl_STATUS());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_h_JOB_ODR_DETAIL_NO") && key.getl_h_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("l_h_JOB_ODR_DETAIL_NO", key.getl_h_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("w_WS_CD") && key.getw_WS_CD() != null) {
					msgKey.setKeyValue("w_WS_CD", key.getw_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_CD") && key.getw_VEND_CD() != null) {
					msgKey.setKeyValue("w_VEND_CD", key.getw_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("STATUS1") && key.getSTATUS1() != null) {
					msgKey.setKeyValue("STATUS1", key.getSTATUS1());
				}
				if(msgKeyType.containsKeyColumn("STATUS2") && key.getSTATUS2() != null) {
					msgKey.setKeyValue("STATUS2", key.getSTATUS2());
				}
				if(msgKeyType.containsKeyColumn("STATUS3") && key.getSTATUS3() != null) {
					msgKey.setKeyValue("STATUS3", key.getSTATUS3());
				}
				if(msgKeyType.containsKeyColumn("STATUS4") && key.getSTATUS4() != null) {
					msgKey.setKeyValue("STATUS4", key.getSTATUS4());
				}
				if(msgKeyType.containsKeyColumn("STATUS5") && key.getSTATUS5() != null) {
					msgKey.setKeyValue("STATUS5", key.getSTATUS5());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP1") && key.getISSUE_TYP1() != null) {
					msgKey.setKeyValue("ISSUE_TYP1", key.getISSUE_TYP1());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP2") && key.getISSUE_TYP2() != null) {
					msgKey.setKeyValue("ISSUE_TYP2", key.getISSUE_TYP2());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP3") && key.getISSUE_TYP3() != null) {
					msgKey.setKeyValue("ISSUE_TYP3", key.getISSUE_TYP3());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_FLG") && key.getISSUE_INST_ISS_FLG() != null) {
					msgKey.setKeyValue("ISSUE_INST_ISS_FLG", key.getISSUE_INST_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("w_WS_NAME") && key.getw_WS_NAME() != null) {
					msgKey.setKeyValue("w_WS_NAME", key.getw_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("w_VEND_ANAME") && key.getw_VEND_ANAME() != null) {
					msgKey.setKeyValue("w_VEND_ANAME", key.getw_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
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
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("MRP_FLG") && key.getMRP_FLG() != null) {
					msgKey.setKeyValue("MRP_FLG", key.getMRP_FLG());
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
					AF0010010Struct key = new AF0010010Struct();
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_NAME")) {
						key.setISSUE_CMPLT_NAME(msgKey.getKeyValue("ISSUE_CMPLT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_NAME")) {
						key.setISSUE_NAME(msgKey.getKeyValue("ISSUE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CONS_NAME")) {
						key.setCONS_NAME(msgKey.getKeyValue("CONS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_OPR_INST_CD")) {
						key.sets_OPR_INST_CD(msgKey.getKeyValue("s_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("scdl_issue_date_from")) {
						key.setscdl_issue_date_from(msgKey.getKeyValue("scdl_issue_date_from"));
					}
					if(msgKeyType.containsKeyColumn("scdl_issue_date_to")) {
						key.setscdl_issue_date_to(msgKey.getKeyValue("scdl_issue_date_to"));
					}
					if(msgKeyType.containsKeyColumn("h_issue_cmplt_flg")) {
						key.seth_issue_cmplt_flg(msgKey.getKeyValue("h_issue_cmplt_flg"));
					}
					if(msgKeyType.containsKeyColumn("c1_WORK_STS_TYP")) {
						key.setc1_WORK_STS_TYP(msgKey.getKeyValue("c1_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_WORK_STS_TYP")) {
						key.setc2_WORK_STS_TYP(msgKey.getKeyValue("c2_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_WORK_STS_TYP")) {
						key.setc3_WORK_STS_TYP(msgKey.getKeyValue("c3_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c4_WORK_STS_TYP")) {
						key.setc4_WORK_STS_TYP(msgKey.getKeyValue("c4_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c5_WORK_STS_TYP")) {
						key.setc5_WORK_STS_TYP(msgKey.getKeyValue("c5_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS_DN")) {
						key.setl_STATUS_DN(msgKey.getKeyValue("l_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("scdl_issue_time_from")) {
						key.setscdl_issue_time_from(msgKey.getKeyValue("scdl_issue_time_from"));
					}
					if(msgKeyType.containsKeyColumn("scdl_issue_time_to")) {
						key.setscdl_issue_time_to(msgKey.getKeyValue("scdl_issue_time_to"));
					}
					if(msgKeyType.containsKeyColumn("c1_ISSUE_TYP")) {
						key.setc1_ISSUE_TYP(msgKey.getKeyValue("c1_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c2_ISSUE_TYP")) {
						key.setc2_ISSUE_TYP(msgKey.getKeyValue("c2_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c3_ISSUE_TYP")) {
						key.setc3_ISSUE_TYP(msgKey.getKeyValue("c3_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("c_RE_PRINT")) {
						key.setc_RE_PRINT(msgKey.getKeyValue("c_RE_PRINT"));
					}
					if(msgKeyType.containsKeyColumn("B_WH_CD")) {
						key.setB_WH_CD(msgKey.getKeyValue("B_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("B_WH_NAME")) {
						key.setB_WH_NAME(msgKey.getKeyValue("B_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_h_B_WH_CD")) {
						key.setl_h_B_WH_CD(msgKey.getKeyValue("l_h_B_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_h_HAND_QTY")) {
						key.setl_h_HAND_QTY(msgKey.getKeyValue("l_h_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_h_LOT_NO")) {
						key.setl_h_LOT_NO(msgKey.getKeyValue("l_h_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_h_B_WH_NAME")) {
						key.setl_h_B_WH_NAME(msgKey.getKeyValue("l_h_B_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_CHOICE")) {
						key.setw_CHOICE(msgKey.getKeyValue("w_CHOICE"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_val")) {
						key.setCONS_TYP_val(msgKey.getKeyValue("CONS_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP_name")) {
						key.setCONS_TYP_name(msgKey.getKeyValue("CONS_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_val")) {
						key.setISSUE_TYP_val(msgKey.getKeyValue("ISSUE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_name")) {
						key.setISSUE_TYP_name(msgKey.getKeyValue("ISSUE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("WS_PLANT_CD")) {
						key.setWS_PLANT_CD(msgKey.getKeyValue("WS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_scdl_issue_date_from")) {
						key.setl_scdl_issue_date_from(msgKey.getKeyValue("l_scdl_issue_date_from"));
					}
					if(msgKeyType.containsKeyColumn("l_scdl_issue_date_from_ZERO")) {
						key.setl_scdl_issue_date_from_ZERO(msgKey.getKeyValue("l_scdl_issue_date_from_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_scdl_issue_date_to")) {
						key.setl_scdl_issue_date_to(msgKey.getKeyValue("l_scdl_issue_date_to"));
					}
					if(msgKeyType.containsKeyColumn("l_scdl_issue_date_to_ZERO")) {
						key.setl_scdl_issue_date_to_ZERO(msgKey.getKeyValue("l_scdl_issue_date_to_ZERO"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_INST_CD")) {
						key.setl_ISSUE_INST_CD(msgKey.getKeyValue("l_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_QTY")) {
						key.setISSUE_INST_QTY(msgKey.getKeyValue("ISSUE_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("w_SHIP_REMAIN_QTY")) {
						key.setw_SHIP_REMAIN_QTY(msgKey.getKeyValue("w_SHIP_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_ISSUE_DATE")) {
						key.setSCDL_ISSUE_DATE(msgKey.getKeyValue("SCDL_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_FLG")) {
						key.setISSUE_CMPLT_FLG(new Integer(msgKey.getKeyValue("ISSUE_CMPLT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(new Integer(msgKey.getKeyValue("ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(new Integer(msgKey.getKeyValue("CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_DENOMINATOR")) {
						key.setISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_UNIT_NUMERATOR")) {
						key.setISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_COMMENT")) {
						key.setISSUE_INST_COMMENT(msgKey.getKeyValue("ISSUE_INST_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_item")) {
						key.setOPR_INST_CD_item(msgKey.getKeyValue("OPR_INST_CD_item"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_proc")) {
						key.setOPR_INST_CD_proc(msgKey.getKeyValue("OPR_INST_CD_proc"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS")) {
						key.setl_STATUS(msgKey.getKeyValue("l_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_h_JOB_ODR_DETAIL_NO")) {
						key.setl_h_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("l_h_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("w_WS_CD")) {
						key.setw_WS_CD(msgKey.getKeyValue("w_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_CD")) {
						key.setw_VEND_CD(msgKey.getKeyValue("w_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("STATUS1")) {
						key.setSTATUS1(msgKey.getKeyValue("STATUS1"));
					}
					if(msgKeyType.containsKeyColumn("STATUS2")) {
						key.setSTATUS2(msgKey.getKeyValue("STATUS2"));
					}
					if(msgKeyType.containsKeyColumn("STATUS3")) {
						key.setSTATUS3(msgKey.getKeyValue("STATUS3"));
					}
					if(msgKeyType.containsKeyColumn("STATUS4")) {
						key.setSTATUS4(msgKey.getKeyValue("STATUS4"));
					}
					if(msgKeyType.containsKeyColumn("STATUS5")) {
						key.setSTATUS5(msgKey.getKeyValue("STATUS5"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP1")) {
						key.setISSUE_TYP1(msgKey.getKeyValue("ISSUE_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP2")) {
						key.setISSUE_TYP2(msgKey.getKeyValue("ISSUE_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP3")) {
						key.setISSUE_TYP3(msgKey.getKeyValue("ISSUE_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_ISS_FLG")) {
						key.setISSUE_INST_ISS_FLG(msgKey.getKeyValue("ISSUE_INST_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_WS_NAME")) {
						key.setw_WS_NAME(msgKey.getKeyValue("w_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_VEND_ANAME")) {
						key.setw_VEND_ANAME(msgKey.getKeyValue("w_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
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
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MRP_FLG")) {
						key.setMRP_FLG(msgKey.getKeyValue("MRP_FLG"));
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
