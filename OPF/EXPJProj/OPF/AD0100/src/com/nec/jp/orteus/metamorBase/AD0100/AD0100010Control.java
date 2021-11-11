/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0100/src/com/nec/jp/orteus/metamorBase/AD0100/AD0100010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0100;

import com.nec.jp.orteus.metamorBase.AD0100.*;
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
	// TODO: ここにimportパッケージを記述してください
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.expj.util.CommonOd; 
import java.text.DateFormat;
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0100010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.1 $ $Date: 2013/12/02 09:25:17 $
 *
 */
//}}user_implement_code_header

public class AD0100010Control
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
	public AD0100010Struct getListvalue(int x) { return (AD0100010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0100010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0100010Struct createStruct() { return new AD0100010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0100010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	// 業務運用日
	private String _businessOprDate = null;
	
	/**
     * 画面の詳細項目を初期化します。
     */
    public void initializeDetail() {
    	struct.setITEM_NAME(null);
    	struct.setWS_NAME(null);
    	struct.setITEM_CD(null);
    	struct.setWS_CD(null);
    	struct.setPRD_START_DATE_FROM(null);
    	struct.setPRD_START_DATE_FROM_TIME(null);
    	struct.setPRD_START_DATE_TO(null);
    	struct.setPRD_START_DATE_TO_TIME(null);
    	struct.setPRD_DUE_DATE_FROM(null);
    	struct.setPRD_DUE_DATE_FROM_TIME(null);
    	struct.setPRD_DUE_DATE_TO(null);
    	struct.setPRD_DUE_DATE_TO_TIME(null);
    	
    	setReadStatus(INITIAL);
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
	 * 業務ロジックのシステムログ(エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		StringBuffer sysLogMessage = new StringBuffer();
		sysLogMessage.append(db1);
		sysLogMessage.append(":");
		sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",sysLogMessage.toString());
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * 検索条件の設定
	 */
	private void setSearchCondition() {
		// データ引数クリア
		struct.setL_PRD_START_DATE_TO(null);
		struct.setL_PRD_START_DATE_FROM(null);
		struct.setL_PRD_DUE_DATE_TO(null);
		struct.setL_PRD_DUE_DATE_FROM(null);
		
		// 抽出条件（日付の設定）
		if (null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			
			// 製造着手日(From)
			if (null == struct.getPRD_START_DATE_FROM() || "".equals(struct.getPRD_START_DATE_FROM())){
				struct.setL_PRD_START_DATE_FROM(null);
			} else {
				// 時刻設定
				if (null == struct.getPRD_START_DATE_FROM_TIME() || "".equals(struct.getPRD_START_DATE_FROM_TIME())){
					struct.setL_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " 00:00");
				} else {
					struct.setPRD_START_DATE_FROM_TIME(AppendZero(struct.getPRD_START_DATE_FROM_TIME(),4));
					struct.setL_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM() + " " + 
					                                struct.getPRD_START_DATE_FROM_TIME().substring(0,2) + ":" + 
					                                struct.getPRD_START_DATE_FROM_TIME().substring(2));
				}
			}
			// 製造着手日(To)
			if (null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setL_PRD_START_DATE_TO(null);
			} else {
				// 時刻設定
				if (null == struct.getPRD_START_DATE_TO_TIME() || "".equals(struct.getPRD_START_DATE_TO_TIME())){
					struct.setL_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
				} else {
					struct.setPRD_START_DATE_TO_TIME(AppendZero(struct.getPRD_START_DATE_TO_TIME(),4));
					struct.setL_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " " + 
					                                struct.getPRD_START_DATE_TO_TIME().substring(0,2) + ":" + 
					                                struct.getPRD_START_DATE_TO_TIME().substring(2));
				}
			}
		  
			// 製造納期（From）
			if (null == struct.getPRD_DUE_DATE_FROM() || "".equals(struct.getPRD_DUE_DATE_FROM())){
				struct.setL_PRD_DUE_DATE_FROM(null);
			} else {
				// 時刻設定
				if(null == struct.getPRD_DUE_DATE_FROM_TIME() || "".equals(struct.getPRD_DUE_DATE_FROM_TIME())){
					struct.setL_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " 00:00");
				} else {
					struct.setPRD_DUE_DATE_FROM_TIME(AppendZero(struct.getPRD_DUE_DATE_FROM_TIME(),4));
					struct.setL_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM() + " " + 
												  struct.getPRD_DUE_DATE_FROM_TIME().substring(0,2) + ":" + 
												  struct.getPRD_DUE_DATE_FROM_TIME().substring(2));
				}
			}
			// 製造納期（To）
			if (null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
				struct.setL_PRD_DUE_DATE_TO(null);
			} else {
				// 時刻設定
				if(null == struct.getPRD_DUE_DATE_TO_TIME() || "".equals(struct.getPRD_DUE_DATE_TO_TIME())){
					struct.setL_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
				} else {
					struct.setPRD_DUE_DATE_TO_TIME(AppendZero(struct.getPRD_DUE_DATE_TO_TIME(),4));
					struct.setL_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " " + 
												struct.getPRD_DUE_DATE_TO_TIME().substring(0,2) + ":" + 
												struct.getPRD_DUE_DATE_TO_TIME().substring(2));
				}
			}
		} else {
			struct.setL_PRD_START_DATE_FROM(struct.getPRD_START_DATE_FROM());
			if (null == struct.getPRD_START_DATE_TO() || "".equals(struct.getPRD_START_DATE_TO())){
				struct.setL_PRD_START_DATE_TO(null);
			} else {
				struct.setL_PRD_START_DATE_TO(struct.getPRD_START_DATE_TO() + " 23:59");
			}
			struct.setL_PRD_DUE_DATE_FROM(struct.getPRD_DUE_DATE_FROM());
			if (null == struct.getPRD_DUE_DATE_TO() || "".equals(struct.getPRD_DUE_DATE_TO())){
				struct.setL_PRD_DUE_DATE_TO(null);
			} else {
				struct.setL_PRD_DUE_DATE_TO(struct.getPRD_DUE_DATE_TO() + " 23:59");
			}
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			if (list == null) {
				list = new ArrayList();
			} else {
				list.clear();
			}
			
			// 品目名
			struct.setITEM_NAME(null);
			// 作業区名
			struct.setWS_NAME(null);
			
			// 入力した「品目番号」は　[品目]に存在しない場合
			if(struct.getITEM_CD() != null && !"".equals(struct.getITEM_CD())){
				List checkItemList =  entity.mSelect_M_ITEM.read(conn, struct);
				if(checkItemList.isEmpty()){
					setErrorMessage("AE00118");
					setReadStatus(ERROR);
					return;
				} else {
					AD0100010Struct checkItemStruct = (AD0100010Struct)checkItemList.get(0);
					// 品目名
					struct.setITEM_NAME(checkItemStruct.getITEM_NAME());
				}
			}
			// 入力した「作業区コード」は　[作業区]に存在しない場合
			if(struct.getWS_CD() != null && !"".equals(struct.getWS_CD())){
				// 工場コード
				struct.setPLANT_CD(getsysPLANT_CD());
				List checkWsList = entity.mSelect_M_WS.read(conn, struct);
				if(checkWsList.isEmpty()){
					setErrorMessage("AF00002");
					setReadStatus(ERROR);
					return;
				} else {
					AD0100010Struct checkWsStruct = (AD0100010Struct)checkWsList.get(0);
					// 作業区名
					struct.setWS_NAME(checkWsStruct.getWS_NAME());
				}
			}
			
			// 製造着手日と製造納期
			setSearchCondition();

			// 表示対象のデータが最大表示件数
			int maxLine = sp.getMaxLine(conn,10);
			if (maxLine != 0) {
				struct.setMAX_LINE(maxLine + "");
			} else {
				struct.setMAX_LINE(null);
			}
			
			struct.setPLANT_CD(getsysPLANT_CD());
			
			list = entity.mSelect.read(conn, struct);
			
			if(list == null || list.size()<= 0 ){
				setErrorMessage("ZZ06001");
				setReadStatus(NOT_FOUND);
				return;
			} else {
				// 表示対象のデータが最大表示件数を超えた場合。
				if(maxLine != 0 && list.size() == maxLine + 1){
					setErrorMessage("ZZ01119", String.valueOf(maxLine));
					// 検索状態を「最大行数オーバー」に設定
					setReadStatus(TOO_MANY);
					setList(null);
					return;
				} else {
					// 検索状態を「読込成功」に設定
					setReadStatus(NORMAL);
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 選択強制完了ボタン押下時に実行される処理です。
	 *
	 */
	public void controlChoice_Compulsion_Completion() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlChoice_Compulsion_Completion");
			//{{user_implement_dev:<controlChoice_Compulsion_Completion>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 実際原価の締めが完了している日付チェック
			List pastResultEntryTypList = entity.mSelect_PAST_RESULT_ENTRY_TYP.read(conn, struct);
			if (!pastResultEntryTypList.isEmpty()) {
				AD0100010Struct pastResultEntryTypStruct = (AD0100010Struct) pastResultEntryTypList.get(0);
				if ("false".equals(pastResultEntryTypStruct.getVALUE())) {
					// 工場コード
					struct.setPLANT_CD(getsysPLANT_CD());
					// 実際原価管理パラメータの対象年月取得
					List procExecDateList = entity.mSelect_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
					if (!procExecDateList.isEmpty()) {
						AD0100010Struct procExecDateStruct = (AD0100010Struct) procExecDateList.get(0);
						BigDecimal procExecDate = new BigDecimal(procExecDateStruct.getPROC_EXEC_DATE());
						// チェック用業務運用日
						BigDecimal checkBusinessOprDate = new BigDecimal(_businessOprDate.substring(0,4) + _businessOprDate.substring(5,7));
						if (checkBusinessOprDate.compareTo(procExecDate) < 0) {
							// 業務運用日の年月が対象年月より過去場合
							setErrorMessage("AE00161");
							return;
						}
					}
				}
			}
			
			// 出来高実績登録用
			AD0100010Struct insertOutputRsltStruct = new AD0100010Struct();
			
			for( int i = 0; i < struct.getList_l_ITEM_CD().size(); i++){
				
				// 品目別仕掛更新数のチェック
				AD0100010Struct modifyStruct = new AD0100010Struct();
				// 作業計画番号
				modifyStruct.setWORK_ODR_CD((String)struct.getList_l_WORK_ODR_CD().get(i));
				modifyStruct.setMODIFY_COUNT((String)struct.getList_h_l_MODIFY_COUNT().get(i));
				List modifyList = entity.mSelect_MODIFY_T_WORK_IN_PROC_BY_ITEM.read(conn, modifyStruct);
				if (modifyList.isEmpty()) {
					setErrorMessage("AC00017");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", modifyStruct.getWORK_ODR_CD());
					continue;
				}
				
				// [出来高実績] の追加
				// 出来高実績番号の自動採番
				CollectNumber collectNum = new CollectNumber(CollectNumber.OUT_RSLT_CD,
																		this.sysUSER_CD,
																		this.sp.getProcId(),
																		this.sysPLANT_CD);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//採番結果がない
					setErrorMessage("ZZ01106");
					setReadStatus(ERROR);
					return;
				}
	            // 出来高実績番号
				insertOutputRsltStruct.setOUTPUT_RSLT_CD(no);
	            // 品目番号
				insertOutputRsltStruct.setITEM_CD((String)struct.getList_l_ITEM_CD().get(i));
	            // 作業区コード
				insertOutputRsltStruct.setWS_CD((String)struct.getList_l_WS_CD().get(i));
	            // 工場コード
				insertOutputRsltStruct.setPLANT_CD(getsysPLANT_CD());
	            // 出来高実績作業担当者
				insertOutputRsltStruct.setLOGIN_USER(getsysUSER_CD());
				// 保管区コード
				String wh_CD = ValidateWh.getDefaultOprWh(conn, getsysPLANT_CD(), (String)struct.getList_l_ITEM_CD().get(i));
				insertOutputRsltStruct.setWH_CD(wh_CD);
				// 業務運用日
				insertOutputRsltStruct.setBUSINESS_OPR_DATE(_businessOprDate);
				// 作成者
				insertOutputRsltStruct.setsUser_ID(getsysUSER_CD());
				// 作成日
				insertOutputRsltStruct.setsSysdate(struct.getsSysdate());
				entity.mInsert_T_OUTPUT_RSLT.create(conn, insertOutputRsltStruct);
				
				// [作業実績] の追加
				AD0100010Struct insertOprRsltStruct = new AD0100010Struct();
				// 作業指示番号
				insertOprRsltStruct.setOPR_INST_CD((String)struct.getList_h_l_OPR_INST_CD().get(i));
				
				List ppnList = entity.mSelect_Max_PARTIAL_PRD_NO.read(conn, insertOprRsltStruct);
				AD0100010Struct ppnStruct = new AD0100010Struct();
				if (!ppnList.isEmpty()) {
					ppnStruct = (AD0100010Struct)ppnList.get(0);
				}
				// 分作回数
				insertOprRsltStruct.setPARTIAL_PRD_NO(ppnStruct.getPARTIAL_PRD_NO());
				// 品目番号
				insertOprRsltStruct.setITEM_CD((String)struct.getList_l_ITEM_CD().get(i));
				// 作業区コード
				insertOprRsltStruct.setWS_CD((String)struct.getList_l_WS_CD().get(i));
				// 保管区コード
				insertOprRsltStruct.setWH_CD(wh_CD);
				// 作業者
				insertOprRsltStruct.setLOGIN_USER(getsysUSER_CD());
				// 出来高実績番号
				insertOprRsltStruct.setOUTPUT_RSLT_CD(no);
				// 工場コード
				insertOprRsltStruct.setPLANT_CD(getsysPLANT_CD());
				
				// 業務運用日
				insertOprRsltStruct.setBUSINESS_OPR_DATE(_businessOprDate);
				// 作成者
				insertOprRsltStruct.setsUser_ID(getsysUSER_CD());
				// 作成日
				insertOprRsltStruct.setsSysdate(struct.getsSysdate());
				
				entity.mInsert_T_OPR_RSLT.create(conn, insertOprRsltStruct);
				
				// [品目別仕掛]の更新
				AD0100010Struct updateWorkProcStruct = new AD0100010Struct();
				// 作業計画番号
				updateWorkProcStruct.setWORK_ODR_CD((String)struct.getList_l_WORK_ODR_CD().get(i));
				// 業務運用日
				updateWorkProcStruct.setBUSINESS_OPR_DATE(_businessOprDate);
				// 更新者
				updateWorkProcStruct.setsUser_ID(getsysUSER_CD());
				// 更新日
				updateWorkProcStruct.setsSysdate(struct.getsSysdate());
			
				entity.mUpdate_T_WORK_IN_PROC_BY_ITEM.update(conn, updateWorkProcStruct);
				
				CommonOd co =
					new CommonOd(this.conn, getsysPLANT_CD(), sysUSER_CD, sp.getProcId());
				// 所要量更新
				co.changeOrderForComplete((String)struct.getList_h_l_ODR_NO().get(i), -1);
				// 子部品情報（出庫指示／所要量）の更新処理
				co.changeDemandForComplete((String)struct.getList_l_WORK_ODR_CD().get(i), null, 
						Converter.strToDate(_businessOprDate+ " 00:00", Converter.SLASH_DATE_HOUR_COLON_MINUTE));
				conn.commit();
			}
			controlSelect();
			
		} catch (Exception e) {
			conn.rollback();
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlChoice_Compulsion_Completion>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlChoice_Compulsion_Completion");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");
			//{{user_implement_dev:<controlCheckClear>
			// TODO: ユーザ定義のコードを記述してください
		list.clear();
                //}}user_implement_dev:<controlCheckClear>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			
			// 業務運用日を取得する
			_businessOprDate = DateCtrl.getBusinessOprDate(conn, getsysPLANT_CD());
			
			if (_businessOprDate == null || "".equals(_businessOprDate)){
				ExpjMessage emsg = new ExpjMessage("AC34080");
				msgStruct.addError(emsg);				// エラーメッセージとして登録
				sysLog.severe(emsg, getsysUSER_CD());	// エラー内容
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}
			
			// 画面の項目初期化。
			initializeDetail();
			// TIME_CTRLの取得
			List timeCtrlList = entity.mSelect_SYS_PARAMETER.read(conn, struct);
			if(!timeCtrlList.isEmpty()){
				AD0100010Struct timeCtrlStruct = new AD0100010Struct();
				timeCtrlStruct = (AD0100010Struct)timeCtrlList.get(0);
				struct.setTIME_CTRL(timeCtrlStruct.getVALUE());
			}else{
				struct.setTIME_CTRL(null);
			}
			
		} catch (ExpjException ee){
        	throw ee;
        } catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// 致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0100");
		logger.entering("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AD0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Choice_Compulsion_Completion") ) {
				controlChoice_Compulsion_Completion();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("CheckClear") ) {
				controlCheckClear();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
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
//			throw new FoundationException("AD0100010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0100010-E999","CSVの出力処理"));
			throw new FoundationException("AD0100010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0100010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0100010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0100010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0100010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0100010Entity entity;
	protected AD0100010Struct struct;
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

		entity = new AD0100010Entity();
		struct = new AD0100010Struct();

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
	 * AD0100010クラスの標準コンストラクタ
	 */
	public AD0100010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: ここに初期処理を記述してください
		try {
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
				AD0100010Struct key = (AD0100010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM") && key.getPRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_START_DATE_FROM", key.getPRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM_TIME") && key.getPRD_START_DATE_FROM_TIME() != null) {
					msgKey.setKeyValue("PRD_START_DATE_FROM_TIME", key.getPRD_START_DATE_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO") && key.getPRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_START_DATE_TO", key.getPRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO_TIME") && key.getPRD_START_DATE_TO_TIME() != null) {
					msgKey.setKeyValue("PRD_START_DATE_TO_TIME", key.getPRD_START_DATE_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM") && key.getPRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM", key.getPRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM_TIME") && key.getPRD_DUE_DATE_FROM_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_FROM_TIME", key.getPRD_DUE_DATE_FROM_TIME());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO") && key.getPRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO", key.getPRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO_TIME") && key.getPRD_DUE_DATE_TO_TIME() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE_TO_TIME", key.getPRD_DUE_DATE_TO_TIME());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("LOGIN_USER") && key.getLOGIN_USER() != null) {
					msgKey.setKeyValue("LOGIN_USER", key.getLOGIN_USER());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_WS_CD") && key.getl_WS_CD() != null) {
					msgKey.setKeyValue("l_WS_CD", key.getl_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WS_NAME") && key.getl_WS_NAME() != null) {
					msgKey.setKeyValue("l_WS_NAME", key.getl_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY") && key.getl_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_OPR_INST_QTY", key.getl_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_QTY_1") && key.getl_RCV_QTY_1() != null) {
					msgKey.setKeyValue("l_RCV_QTY_1", key.getl_RCV_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_ODR_NO") && key.geth_l_ODR_NO() != null) {
					msgKey.setKeyValue("h_l_ODR_NO", key.geth_l_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT") && key.geth_l_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_l_MODIFY_COUNT", key.geth_l_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_l_OPR_INST_CD") && key.geth_l_OPR_INST_CD() != null) {
					msgKey.setKeyValue("h_l_OPR_INST_CD", key.geth_l_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_TO") && key.getL_PRD_START_DATE_TO() != null) {
					msgKey.setKeyValue("L_PRD_START_DATE_TO", key.getL_PRD_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_FROM") && key.getL_PRD_START_DATE_FROM() != null) {
					msgKey.setKeyValue("L_PRD_START_DATE_FROM", key.getL_PRD_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_TO") && key.getL_PRD_DUE_DATE_TO() != null) {
					msgKey.setKeyValue("L_PRD_DUE_DATE_TO", key.getL_PRD_DUE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_FROM") && key.getL_PRD_DUE_DATE_FROM() != null) {
					msgKey.setKeyValue("L_PRD_DUE_DATE_FROM", key.getL_PRD_DUE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("MAX_LINE") && key.getMAX_LINE() != null) {
					msgKey.setKeyValue("MAX_LINE", key.getMAX_LINE());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE") && key.getPROC_EXEC_DATE() != null) {
					msgKey.setKeyValue("PROC_EXEC_DATE", key.getPROC_EXEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
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
					AD0100010Struct key = new AD0100010Struct();
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM")) {
						key.setPRD_START_DATE_FROM(msgKey.getKeyValue("PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_FROM_TIME")) {
						key.setPRD_START_DATE_FROM_TIME(msgKey.getKeyValue("PRD_START_DATE_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO")) {
						key.setPRD_START_DATE_TO(msgKey.getKeyValue("PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE_TO_TIME")) {
						key.setPRD_START_DATE_TO_TIME(msgKey.getKeyValue("PRD_START_DATE_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM")) {
						key.setPRD_DUE_DATE_FROM(msgKey.getKeyValue("PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_FROM_TIME")) {
						key.setPRD_DUE_DATE_FROM_TIME(msgKey.getKeyValue("PRD_DUE_DATE_FROM_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO")) {
						key.setPRD_DUE_DATE_TO(msgKey.getKeyValue("PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE_TO_TIME")) {
						key.setPRD_DUE_DATE_TO_TIME(msgKey.getKeyValue("PRD_DUE_DATE_TO_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("LOGIN_USER")) {
						key.setLOGIN_USER(msgKey.getKeyValue("LOGIN_USER"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_CD")) {
						key.setl_WS_CD(msgKey.getKeyValue("l_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WS_NAME")) {
						key.setl_WS_NAME(msgKey.getKeyValue("l_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY")) {
						key.setl_OPR_INST_QTY(msgKey.getKeyValue("l_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_QTY_1")) {
						key.setl_RCV_QTY_1(msgKey.getKeyValue("l_RCV_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_ODR_NO")) {
						key.seth_l_ODR_NO(msgKey.getKeyValue("h_l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MODIFY_COUNT")) {
						key.seth_l_MODIFY_COUNT(msgKey.getKeyValue("h_l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_l_OPR_INST_CD")) {
						key.seth_l_OPR_INST_CD(msgKey.getKeyValue("h_l_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_TO")) {
						key.setL_PRD_START_DATE_TO(msgKey.getKeyValue("L_PRD_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_START_DATE_FROM")) {
						key.setL_PRD_START_DATE_FROM(msgKey.getKeyValue("L_PRD_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_TO")) {
						key.setL_PRD_DUE_DATE_TO(msgKey.getKeyValue("L_PRD_DUE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("L_PRD_DUE_DATE_FROM")) {
						key.setL_PRD_DUE_DATE_FROM(msgKey.getKeyValue("L_PRD_DUE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("MAX_LINE")) {
						key.setMAX_LINE(msgKey.getKeyValue("MAX_LINE"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXEC_DATE")) {
						key.setPROC_EXEC_DATE(msgKey.getKeyValue("PROC_EXEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
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
