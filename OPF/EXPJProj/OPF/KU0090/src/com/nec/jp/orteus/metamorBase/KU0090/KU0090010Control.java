/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0090/src/com/nec/jp/orteus/metamorBase/KU0090/KU0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0090;

import com.nec.jp.orteus.metamorBase.KU0090.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KU0090010Control
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
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public KU0090010Struct getListvalue(int x) { return (KU0090010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KU0090010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KU0090010Struct createStruct() { return new KU0090010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KU0090010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	/** Explanner/J*/
	private static final String EXPLANNER_J = "J*";
	
	/** Explanner/Ja*/
	private static final String EXPLANNER_JA = "JA*";
	
	/** CSVデータリスト */
	private List _csvList = null;
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
	 * Exceptionメッセージ設定
	 * @param キー項目
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		throw ee;
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
        	// 検索条件の出荷予定日時に時刻を付加する
			StringBuffer sbShipPlanDateFrom = null;
			StringBuffer sbShipPlanDateTo = null;
	        if (EXPLANNER_J.equals(struct.getOPTION_ID())) {
	        	// 開始日時の設定
	        	if (struct.getSCDL_SHIP_DATE_FROM() != null && !"".equals(struct.getSCDL_SHIP_DATE_FROM())) {
	        		sbShipPlanDateFrom = new StringBuffer(struct.getSCDL_SHIP_DATE_FROM());
	        		sbShipPlanDateFrom.append(" 00:00");
	        		struct.setSCDL_SHIP_DATE_FROM(sbShipPlanDateFrom.toString());
	        	}
	        	// 終了日時の設定
	        	if (struct.getSCDL_SHIP_DATE_TO() != null && !"".equals(struct.getSCDL_SHIP_DATE_TO())) {
	        		sbShipPlanDateTo = new StringBuffer(struct.getSCDL_SHIP_DATE_TO());
	        		sbShipPlanDateTo.append(" 59:59");
	        		struct.setSCDL_SHIP_DATE_TO(sbShipPlanDateTo.toString());
	        	}
	        } else {
	        	// 開始日時の設定
	        	if (struct.getSCDL_SHIP_DATE_FROM() != null && !"".equals(struct.getSCDL_SHIP_DATE_FROM())) {
	        		sbShipPlanDateFrom = new StringBuffer(struct.getSCDL_SHIP_DATE_FROM());
	        		if (struct.getSHIP_PLAN_DATE_TIME_FROM() != null && !"".equals(struct.getSHIP_PLAN_DATE_TIME_FROM())) {
		        		sbShipPlanDateFrom.append(" ");
		        		String strTime = struct.getSHIP_PLAN_DATE_TIME_FROM();
		        		if (strTime.length() == 3) {
		        			strTime = "0" + strTime;
			        		struct.setSHIP_PLAN_DATE_TIME_FROM(strTime);
		        		}
		        		sbShipPlanDateFrom.append(strTime.subSequence(0, 2));
	        			sbShipPlanDateFrom.append(":");
		        		sbShipPlanDateFrom.append(strTime.subSequence(2, 4));
	        		} else {
		        		sbShipPlanDateFrom.append(" 00:00");
	        		}
	        		struct.setSCDL_SHIP_DATE_FROM(sbShipPlanDateFrom.toString());
	        	}
	        	// 終了日時の設定
	        	if (struct.getSCDL_SHIP_DATE_TO() != null && !"".equals(struct.getSCDL_SHIP_DATE_TO())) {
	        		sbShipPlanDateTo = new StringBuffer(struct.getSCDL_SHIP_DATE_TO());
	        		if (struct.getSHIP_PLAN_DATE_TIME_TO() != null && !"".equals(struct.getSHIP_PLAN_DATE_TIME_TO())) {
		        		sbShipPlanDateTo.append(" ");
		        		String strTime = struct.getSHIP_PLAN_DATE_TIME_TO();
		        		if (strTime.length() == 3) {
		        			strTime = "0" + strTime;
			        		struct.setSHIP_PLAN_DATE_TIME_TO(strTime);
		        		}
		        		sbShipPlanDateTo.append(strTime.subSequence(0, 2));
		        		sbShipPlanDateTo.append(":");
		        		sbShipPlanDateTo.append(strTime.subSequence(2, 4));
	        		} else {
		        		sbShipPlanDateTo.append(" 59:59");
	        		}
	        		struct.setSCDL_SHIP_DATE_TO(sbShipPlanDateTo.toString());
	        	}
	        }
			if ("true".equals(struct.getOPed())) {
				// 出力済をチェックしない時
				struct.setw_PRINT_FLG("1");
			} else {
				// 出力済をチェック時
				struct.setw_PRINT_FLG("0");
			}
			// 表示最大行数
			int maxLine = sp.getMaxLine(conn, 10);
			List cntList = new ArrayList();
			cntList = entity.mSelect_ViewCnt.read(conn, struct);
			long rowCount = Long.parseLong(((KU0090010Struct) cntList.get(0))
					.getROW_COUNT());
			// 対象データが 0 件である場合
			if (rowCount == 0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if (list !=null &&list.size()>0) {
					list.clear();
				}
				return;
			}
			// 表示最大行数制限処理
	        if ((maxLine != 0) && (rowCount >= maxLine+1)) {
	            setErrorMessage("ZZ01115", String.valueOf(maxLine));
	            readStatus = TOO_MANY;
	            if (list !=null &&list.size()>0) {
				    list.clear();
			    }
	            return;
			}
	        list = entity.mSelect_M_SHIP_INVOICE_HEAD.read(conn, struct);
        	// E/Jの場合、出力する出荷予定日時はYYYY/MM/DDの形式にする
	        if (EXPLANNER_J.equals(struct.getOPTION_ID()) && list != null && list.size() > 0) {
	        	KU0090010Struct st = null;
	        	for (int i = 0; i < list.size(); i++) {
	        		st = (KU0090010Struct) list.get(i);
	        		if (st.getl_SCDL_SHIP_DATE() != null && st.getl_SCDL_SHIP_DATE().length() > 10) {
	        			st.setl_SCDL_SHIP_DATE(st.getl_SCDL_SHIP_DATE().substring(0, 10));
	        		}
	        	}
	        }
	        
			_csvList = list;
			setReadStatus(NORMAL);
		} catch(SQLException e) {
			setReadStatus(ERROR);
			setSqlExceptionMsg(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * メンテナンスボタン押下時に実行される処理です。
	 *
	 */
	public void controlMaintenance() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlMaintenance");
			//{{user_implement_dev:<controlMaintenance>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlMaintenance>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlMaintenance");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
			if ("true".equals(struct.getOPed())) {
				// 出力済をチェックしない時
				struct.setw_PRINT_FLG("1");
			} else {
				// 出力済をチェック時
				struct.setw_PRINT_FLG("0");
			}
			// リストデータの検索
			_csvList = entity.mSelect_M_SHIP_INVOICE_HEAD.read(conn, struct);
			if(_csvList.isEmpty()){
				setErrorMessage("ZZ06001");
				return;
			}
			// リストデータを設定
			// CSV情報の作成
			List csvList = new ArrayList();
			String[] title = {
					"Expj.SHIP_INVOICE_CTL_NO",           // 出荷インボイス管理番号
					"Expj.INVOICE_CD_1",			      // インボイス番号
					"Expj.SCDL_SHIP_DATE",				  // 出荷予定日
					"Expj.CUST_CD",                       // 得意先コード
					"Expj.DLV_LOC_CD",                    // 納品場所コード
					"Expj.DEPARTURE_PLACE",               // 出港元
					"Expj.DEPARTURE_DATE",                // 出港日
					"Expj.ARRIVAL_PLACE",                 // 到着地
					"Expj.ARRIVAL_DATE_1",                // 入港日
					"Expj.TRANSPORT_METHOD",              // 輸送手段
					"Expj.SHIP_NO",                       // 船便ＮＯ
					"Expj.INVOICE_AMOUNT",                // インボイス金額
					"Expj.INVOICE_TAX_AMOUNT",            // インボイス消費税額
					"Expj.REMARKS_1",                     // 備考１
					"Expj.REMARKS_2"                      // 備考２
					
			};
			csvList.add(title);
			String[] csvStr = null;
			for (Iterator i = _csvList.iterator(); i.hasNext();) {
				KU0090010Struct csvStruct = (KU0090010Struct)i.next();
				csvStr = new String[title.length];
				int nCnt = 0;
				csvStr[nCnt++] = csvStruct.getl_SHIP_INVOICE_CTL_NO();
				csvStr[nCnt++] = csvStruct.getl_INVOICE_CD_1();
	        	// E/Jの場合、出力する出荷予定日時はYYYY/MM/DDの形式にする
		        if (EXPLANNER_J.equals(struct.getOPTION_ID())) {
	        		if (csvStruct.getl_SCDL_SHIP_DATE() != null && csvStruct.getl_SCDL_SHIP_DATE().length() > 10) {
	        			csvStruct.setl_SCDL_SHIP_DATE(csvStruct.getl_SCDL_SHIP_DATE().substring(0, 10));
	        		}
		        }
	        	csvStr[nCnt++] = csvStruct.getl_SCDL_SHIP_DATE();
				csvStr[nCnt++] = csvStruct.getl_CUST_CD();
				csvStr[nCnt++] = csvStruct.getl_DLV_LOC_CD();
				csvStr[nCnt++] = csvStruct.getl_DEPARTURE_PLACE();
				csvStr[nCnt++] = csvStruct.getl_DEPARTURE_DATE();
				csvStr[nCnt++] = csvStruct.getl_ARRIVAL_PLACE();
				csvStr[nCnt++] = csvStruct.getl_ARRIVAL_DATE_1();
				csvStr[nCnt++] = csvStruct.getl_TRANSPORT_METHOD();
				csvStr[nCnt++] = csvStruct.getl_SHIP_NO();
				csvStr[nCnt++] = csvStruct.getl_INVOICE_AMOUNT();
				csvStr[nCnt++] = csvStruct.getl_INVOICE_TAX_AMOUNT();
				csvStr[nCnt++] = csvStruct.getl_REMARKS_1();
				csvStr[nCnt++] = csvStruct.getl_REMARKS_2();
				csvList.add(csvStr);
			}
			if (csvList != null && !csvList.isEmpty()) {
				// CsvWriterを生成
				csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		}catch(Exception e) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		struct.initialize();
		setReadStatus(INITIAL);
		controlRELOAD();
		setList(null);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		try {
			
			// =======================================
			// インストールオプションの取得
			// =======================================
			struct.setOPTION_ID(EXPLANNER_JA);
			if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
				struct.setOPTION_ID(EXPLANNER_J);
			}
			
			struct.setOPed("NULL");
			
		} catch(SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
		}
		
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0090");
		logger.entering("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KU0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Maintenance") ) {
				controlMaintenance();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
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
//			throw new FoundationException("KU0090010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0090010-E999","CSVの出力処理"));
			throw new FoundationException("KU0090010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0090010-E999","システム日付の取得処理"));
				throw new FoundationException("KU0090010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0090010-E999","コントロールのイベント処理"));
			throw new FoundationException("KU0090010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KU0090010Entity entity;
	protected KU0090010Struct struct;
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

		entity = new KU0090010Entity();
		struct = new KU0090010Struct();

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
	 * KU0090010クラスの標準コンストラクタ
	 */
	public KU0090010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: ここに初期処理を記述してください
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
				KU0090010Struct key = (KU0090010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("OPed") && key.getOPed() != null) {
					msgKey.setKeyValue("OPed", key.getOPed());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_FROM") && key.getSHIP_PLAN_DATE_TIME_FROM() != null) {
					msgKey.setKeyValue("SHIP_PLAN_DATE_TIME_FROM", key.getSHIP_PLAN_DATE_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_TO") && key.getSHIP_PLAN_DATE_TIME_TO() != null) {
					msgKey.setKeyValue("SHIP_PLAN_DATE_TIME_TO", key.getSHIP_PLAN_DATE_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("INVOICE_CD") && key.getINVOICE_CD() != null) {
					msgKey.setKeyValue("INVOICE_CD", key.getINVOICE_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_FROM") && key.getSHIP_INVOICE_DATE_FROM() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_DATE_FROM", key.getSHIP_INVOICE_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_TO") && key.getSHIP_INVOICE_DATE_TO() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_DATE_TO", key.getSHIP_INVOICE_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_FROM") && key.getSCDL_SHIP_DATE_FROM() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE_FROM", key.getSCDL_SHIP_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TO") && key.getSCDL_SHIP_DATE_TO() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE_TO", key.getSCDL_SHIP_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_PRINT_FLG") && key.getw_PRINT_FLG() != null) {
					msgKey.setKeyValue("w_PRINT_FLG", key.getw_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_INVOICE_CTL_NO") && key.getl_SHIP_INVOICE_CTL_NO() != null) {
					msgKey.setKeyValue("l_SHIP_INVOICE_CTL_NO", key.getl_SHIP_INVOICE_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_INVOICE_CD_1") && key.getl_INVOICE_CD_1() != null) {
					msgKey.setKeyValue("l_INVOICE_CD_1", key.getl_INVOICE_CD_1());
				}
				if(msgKeyType.containsKeyColumn("l_SCDL_SHIP_DATE") && key.getl_SCDL_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_SCDL_SHIP_DATE", key.getl_SCDL_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEPARTURE_PLACE") && key.getl_DEPARTURE_PLACE() != null) {
					msgKey.setKeyValue("l_DEPARTURE_PLACE", key.getl_DEPARTURE_PLACE());
				}
				if(msgKeyType.containsKeyColumn("l_DEPARTURE_DATE") && key.getl_DEPARTURE_DATE() != null) {
					msgKey.setKeyValue("l_DEPARTURE_DATE", key.getl_DEPARTURE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ARRIVAL_PLACE") && key.getl_ARRIVAL_PLACE() != null) {
					msgKey.setKeyValue("l_ARRIVAL_PLACE", key.getl_ARRIVAL_PLACE());
				}
				if(msgKeyType.containsKeyColumn("l_ARRIVAL_DATE_1") && key.getl_ARRIVAL_DATE_1() != null) {
					msgKey.setKeyValue("l_ARRIVAL_DATE_1", key.getl_ARRIVAL_DATE_1());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_METHOD") && key.getl_TRANSPORT_METHOD() != null) {
					msgKey.setKeyValue("l_TRANSPORT_METHOD", key.getl_TRANSPORT_METHOD());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_NO") && key.getl_SHIP_NO() != null) {
					msgKey.setKeyValue("l_SHIP_NO", key.getl_SHIP_NO());
				}
				if(msgKeyType.containsKeyColumn("l_INVOICE_AMOUNT") && key.getl_INVOICE_AMOUNT() != null) {
					msgKey.setKeyValue("l_INVOICE_AMOUNT", key.getl_INVOICE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_INVOICE_TAX_AMOUNT") && key.getl_INVOICE_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("l_INVOICE_TAX_AMOUNT", key.getl_INVOICE_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS_1") && key.getl_REMARKS_1() != null) {
					msgKey.setKeyValue("l_REMARKS_1", key.getl_REMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS_2") && key.getl_REMARKS_2() != null) {
					msgKey.setKeyValue("l_REMARKS_2", key.getl_REMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
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
					KU0090010Struct key = new KU0090010Struct();
					if(msgKeyType.containsKeyColumn("OPed")) {
						key.setOPed(msgKey.getKeyValue("OPed"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_FROM")) {
						key.setSHIP_PLAN_DATE_TIME_FROM(msgKey.getKeyValue("SHIP_PLAN_DATE_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_PLAN_DATE_TIME_TO")) {
						key.setSHIP_PLAN_DATE_TIME_TO(msgKey.getKeyValue("SHIP_PLAN_DATE_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("INVOICE_CD")) {
						key.setINVOICE_CD(msgKey.getKeyValue("INVOICE_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_FROM")) {
						key.setSHIP_INVOICE_DATE_FROM(msgKey.getKeyValue("SHIP_INVOICE_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DATE_TO")) {
						key.setSHIP_INVOICE_DATE_TO(msgKey.getKeyValue("SHIP_INVOICE_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_FROM")) {
						key.setSCDL_SHIP_DATE_FROM(msgKey.getKeyValue("SCDL_SHIP_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TO")) {
						key.setSCDL_SHIP_DATE_TO(msgKey.getKeyValue("SCDL_SHIP_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_PRINT_FLG")) {
						key.setw_PRINT_FLG(msgKey.getKeyValue("w_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_INVOICE_CTL_NO")) {
						key.setl_SHIP_INVOICE_CTL_NO(msgKey.getKeyValue("l_SHIP_INVOICE_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_INVOICE_CD_1")) {
						key.setl_INVOICE_CD_1(msgKey.getKeyValue("l_INVOICE_CD_1"));
					}
					if(msgKeyType.containsKeyColumn("l_SCDL_SHIP_DATE")) {
						key.setl_SCDL_SHIP_DATE(msgKey.getKeyValue("l_SCDL_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPARTURE_PLACE")) {
						key.setl_DEPARTURE_PLACE(msgKey.getKeyValue("l_DEPARTURE_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPARTURE_DATE")) {
						key.setl_DEPARTURE_DATE(msgKey.getKeyValue("l_DEPARTURE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ARRIVAL_PLACE")) {
						key.setl_ARRIVAL_PLACE(msgKey.getKeyValue("l_ARRIVAL_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("l_ARRIVAL_DATE_1")) {
						key.setl_ARRIVAL_DATE_1(msgKey.getKeyValue("l_ARRIVAL_DATE_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_METHOD")) {
						key.setl_TRANSPORT_METHOD(msgKey.getKeyValue("l_TRANSPORT_METHOD"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_NO")) {
						key.setl_SHIP_NO(msgKey.getKeyValue("l_SHIP_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_INVOICE_AMOUNT")) {
						key.setl_INVOICE_AMOUNT(msgKey.getKeyValue("l_INVOICE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_INVOICE_TAX_AMOUNT")) {
						key.setl_INVOICE_TAX_AMOUNT(msgKey.getKeyValue("l_INVOICE_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS_1")) {
						key.setl_REMARKS_1(msgKey.getKeyValue("l_REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS_2")) {
						key.setl_REMARKS_2(msgKey.getKeyValue("l_REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
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
