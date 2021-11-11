/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0030/src/com/nec/jp/orteus/metamorBase/AD0030/AD0030040Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0030;

import com.nec.jp.orteus.metamorBase.AD0030.*;
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
import java.text.ParseException;
import java.text.DateFormat;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AD0030040Control
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
	public AD0030040Struct getListvalue(int x) { return (AD0030040Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0030040Struct getStruct() { return this.struct; }	// Structを返します。
	public AD0030040Struct createStruct() { return new AD0030040Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0030040Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

//-----------------------------------------------------------------------------
	/**
	 * 検索結果リスト
	 */
	private List viewList = null;
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
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
    
    /** コンボボックスデータ取得用定数　作業指示伝票発行済みフラグ */
    private final static String OPR_INST_SLIP_ISS_FLG_PARAMETER_NAME= "OPR_INST_SLIP_ISS_FLG"; 

    /** コンボボックスデータ取得用　作業指示伝票発行済みフラグ */
    private ComboStruct OPR_INST_SLIP_ISS_FLG = null;
    
    private void othercomboTyp(AD0030040Struct aStruct) {

	 aStruct.setl_OPR_INST_SLIP_ISS_FLG_DN(getDisplayName(OPR_INST_SLIP_ISS_FLG, aStruct.getl_OPR_INST_SLIP_ISS_FLG().toString()));
  
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

	private String sTimeCtrl = "";
	
	/**
	* 検索条件のため、日時分の整理
	* @param 時分 1:":"付き
	* @param 時分
	*/
	private String formatHMW(String inTime ,String inFlag){
			
			if(null == inTime || "".equals(inTime)){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() < 3 || inTime.length() > 4){
				if("1".equals(inFlag)){
					return " 23:59" ;
				}else{
					return inTime;
				}
			}
			
			if(inTime.length() ==  3 ){
				if("1".equals(inFlag)){
					return " 0" + inTime.substring(0,1) + ":" + inTime.substring(1);
				}else{
					return "0" + inTime;
				}
			}
			if("1".equals(inFlag)){
				return " " + inTime.substring(0,2) + ":" + inTime.substring(2);
			}
			return inTime;
	}	
	
	
	/**
	 * 現品票の登録
	 * @param insertStruct
	 */
	private void insertIdentCard (AD0030040Struct insertStruct) {
		try {
			// 現品票管理番号
			List identCardCtlNoList = entity.mSelectIDENT_CARD_CTL_NO.read(conn, insertStruct);
			if (!identCardCtlNoList.isEmpty()) {
				insertStruct.setIDENT_CARD_CTL_NO(((AD0030040Struct) identCardCtlNoList.get(0)).getIDENT_CARD_CTL_NO());
			}
			// 作成日
			insertStruct.setsSysdate(struct.getsSysdate());
			// 作成者
			insertStruct.setsUser_ID(getsysUSER_CD());
			entity.minsertT_IDENT_CARD.create(conn, insertStruct);
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


		try {
			readStatus = INITIAL;
			
			//初期化
			this.msgStruct.clearAll();
			DateFormat df = DateFormat.getDateInstance();
			AD0030040Struct selectStruct = new AD0030040Struct();
			this.list = null;
			viewList = null;
			struct.setINST_PRINTED("");
			
			// 検索条件の設定
			if(this.struct.getr1_MODE() != null && this.struct.getr1_MODE().equals("true")){
				Date dtOprInstStartDate = null;
				try {
				dtOprInstStartDate = df.parse(this.struct.getOPR_INST_START_DATE());
				} catch (ParseException pe) {
					pe.printStackTrace();
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, getsysUSER_CD());
					throw new ExpjException(pe, emsg);
				}
				String strOprInstStartDate = Converter.dateToStr(dtOprInstStartDate,"yyyy/MM/dd");
				String strOprInstStartDateTime = formatHMW(this.struct.getOPR_INST_START_TIME() ,"1");
				if((this.struct.getOPR_INST_START_TIME()).length() == 3){
					this.struct.setOPR_INST_START_TIME("0" + this.struct.getOPR_INST_START_TIME());
				}
				selectStruct.setOPR_INST_START_DATE(strOprInstStartDate + strOprInstStartDateTime);
				selectStruct.setWORK_ODR_DLV_DATE(null);
			} else {
				Date dtWorkOorDlvDate = null;
				try {
				dtWorkOorDlvDate = df.parse(this.struct.getWORK_ODR_DLV_DATE());
				} catch (ParseException pe) {
					pe.printStackTrace();
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, getsysUSER_CD());
					throw new ExpjException(pe, emsg);
				}
				String strWorkOorDlvDate = Converter.dateToStr(dtWorkOorDlvDate,"yyyy/MM/dd");
				String strWorkOorDlvDateTime = formatHMW(this.struct.getWORK_ODR_DLV_TIME() ,"1");
				if((this.struct.getWORK_ODR_DLV_TIME()).length() == 3){
					this.struct.setWORK_ODR_DLV_TIME("0" + this.struct.getWORK_ODR_DLV_TIME());
				}

				selectStruct.setOPR_INST_START_DATE(null);
				selectStruct.setWORK_ODR_DLV_DATE(strWorkOorDlvDate + strWorkOorDlvDateTime);
			}
			selectStruct.setJOB_ODR_CD(this.struct.getJOB_ODR_CD());
			selectStruct.setITEM_CD(this.struct.getITEM_CD());
			selectStruct.setWS_CD(this.struct.getWS_CD());
			selectStruct.setPLANT_CD(this.sysPLANT_CD);
			if (this.struct.getc_RE_PRINT() != null 
					&& this.struct.getc_RE_PRINT().equals("true")) {
				selectStruct.setOPR_INST_SLIP_ISS_FLG("1");
			} else {
				selectStruct.setOPR_INST_SLIP_ISS_FLG("0");
			}
            // 最大表示行数
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				selectStruct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				selectStruct.setROW_COUNT(null);
			}
			viewList = entity.mV_OPR_INST_SLIPCnt.read(conn, selectStruct);
			long rowCount = Long.parseLong(((AD0030040Struct)viewList.get(0)).getl_COUNT());  
			
			// 対象件数=0件の場合エラー
			if (rowCount==0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if(list != null && list.size() > 0){
				list.clear();
			}
				return;
		}
			if ((maxLine != 0) && (rowCount == maxLine + 1)) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				readStatus = TOO_MANY;
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}
			 viewList = entity.mV_OPR_INST_SLIP.read(conn, selectStruct);
			// リストデータを設定
			setList(viewList);
			AD0030040Struct TempStruct;
             for (int i = 0; i < list.size(); i++) {
		     TempStruct = (AD0030040Struct)list.get(i);
				
		     //コンボボックスの取得
		     othercomboTyp(TempStruct);
		    }
			readStatus = NORMAL;
			
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 作業指示票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0030040Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//業務運用日を取得する
			AD0030040Struct updateStruct = new AD0030040Struct();
			updateStruct.setPLANT_CD(this.sysPLANT_CD);
			List updatelist = entity.mSYS_DATE_CTRL.read(conn, updateStruct);
			if (updatelist == null || updatelist.size() <= 0) {
				//データが存在しない
				setErrorMessage("ZZ01101");
				setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", this.sysPLANT_CD);
				return;
			}
			updateStruct = (AD0030040Struct)updatelist.get(0);
			String businessOprDate = updateStruct.getBUSINESS_OPR_DATE();
			
			// 最大表示件数を超えている状態で帳票出力ボタンが押下された場合
			if (list == null && viewList != null) {
				// リストに、帳票出力用に退避した検索結果を設定する
				list = viewList;
			}
			
			if ( "1".equals(printPattern) ) {	// 再検索して印刷の場合
				// 再検索処理を記述してください。
				controlSelect();
			}

			int loopMax = 0;
			String[] printLine = getPdfOutputListLine();
			if ( "3".equals(printPattern) ) {	// 選択行のみ印刷の場合
				if ( printLine != null ) {
					loopMax = printLine.length;
				}
			}
			else {	// 全行印刷の場合
				if ( list != null ) {
					loopMax = list.size();
				}
			}

			//印刷処理の開始
			String printId1 = null;	// 帳票IDの初期化
			if(struct.getc_RE_PRINT() != null && "true".equals(struct.getc_RE_PRINT())){
				printId1 = "AD00300402";   //再発行用帳票IDを指定してください
			}else{
				printId1 = "AD00300401";   //通常発行用帳票IDを指定してください
			}
			ret = svf.VrInit(printId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			String excuteOutput = svf.getExcuteOutput();	// サーバ出力処理
			
 			// クエリーファイルの指定 		
			if (dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID
						+ ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ="
						+ dbDBQ);
			} 
			
			//ヘッダー部のセット

			//データのセット
			for(int i=0; i<loopMax; i++) {				// データ出力 
				if ( "3".equals(printPattern) ) {	// 選択行のみ印刷の場合
					strPdf = (AD0030040Struct)list.get( Integer.parseInt(printLine[i]) );
				}
				else {	// 全行印刷の場合
					strPdf = (AD0030040Struct)list.get(i);
				}

				// 作業指示伝票ロック＆更新回数取得
				AD0030040Struct searchStruct = new AD0030040Struct();
				searchStruct.setl_OPR_INST_CD(strPdf.getl_OPR_INST_CD());
				List lockedList = entity.mT_OPR_INST_SLIP_LOCK.read(conn, searchStruct);
				// PDF出力するキーが存在しない場合はエラー。
				if (lockedList.isEmpty()) {
					setErrorMessage("ZZ01105");
					return;
				} 

				// 読み込み時の"更新数"と異なる場合はエラー
				AD0030040Struct lockedStruct = (AD0030040Struct) lockedList.get(0);
				if (!lockedStruct.getl_MODIFY_COUNT().equals(strPdf.getl_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					return;
				}
				
     			// クエリー抽出条件の指定      		
     			ret = svf.VrCondition("[X|WORK_ODR_CD]=" + strPdf.getl_WORK_ODR_CD(), 4);
     			ret = svf.VrCondition("[X|WORK_IN_PROC_CD]=" + strPdf.getl_WORK_IN_PROC_CD(), 4);
     			ret = svf.VrCondition("[X|PLANT_CD]=" + sysPLANT_CD, 4);     			
     			// クエリー実行 
     			ret = svf.VrReport();
     			if (ret == -554) {
    				ExpjMessage emsg = new ExpjMessage("ZZ06001");
    				msgStruct.addError(emsg);
    				sysLog.warning(emsg, sysUSER_CD);
    				return;
    			}
     			
				if (strPdf.getl_OPR_INST_SLIP_ISS_FLG() == null 
						|| strPdf.getl_OPR_INST_SLIP_ISS_FLG().equals("0")) {
					//更新する値をセットする
					updateStruct = new AD0030040Struct();
					updateStruct.setl_OPR_INST_SLIP_ISS_DATE(businessOprDate);
					updateStruct.setl_OPR_INST_SLIP_ISS_FLG("1");
					updateStruct.setl_OPR_INST_CD(strPdf.getl_OPR_INST_CD());
					updateStruct.setsUser_ID(this.sysUSER_CD);
					//[作業指示伝票]を更新する
					entity.mT_OPR_INST_SLIP.update(conn, updateStruct);
				}
			}
			
			ret = svf.VrQuit();								// PDF作成終了

			if ( "0".equals(printType) ) {	// クライアント印刷の場合
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {	// サーバ印刷の場合
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(excuteOutput);
				}catch(IOException e){
					// サーバ印刷失敗時のエラー処理を記述してください。
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
					ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
					throw ee;
				}
			}

//			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "に出力");

			conn.commit();
			
			if ("true".equals(struct.getc_CARD_PRINT())) {
				// 現品票も出力の場合
				struct.setINST_PRINTED("true");
			} else {
				// 再読込
				controlSelect();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}

                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>

			
			readStatus = INITIAL;
			
			this.msgStruct.clearAll();
			this.struct.clear();
			
			if (list != null) {
				list.clear();
			}
			
			if (viewList != null) {
				viewList.clear();
			}
			
			this.struct.setr1_MODE("true");
			try{
				// システムパラメータ（TIME_CTRL）取得
				List TIME_CTRLList = entity.mTIME_CTRL.read(conn, struct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					this.struct.setTIME_CTRL(((AD0030040Struct)TIME_CTRLList.get(0)).getTIME_CTRL());
				}else{
					this.struct.setTIME_CTRL("false");
				}
				sTimeCtrl = this.struct.getTIME_CTRL();		
				// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
			} catch(SQLException e) {
	//			e.printStackTrace();
				// エラー処理を記述してください。
				// 
			}
			

                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 現品票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCardPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlCardPrint");
			//{{user_implement_dev:<controlCardPrint>
			// TODO: ユーザ定義のコードを記述してください
		AD0030040Struct strPdf = null;
		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

		
		try {
			// 現品票出力タイミングの取得
			List checkList = entity.mSYS_PARAMETER.read(conn, struct);
			if (checkList.isEmpty()) {
				setErrorMessage("AD34030");
				return;
			} else {
				String flag = ((AD0030040Struct)checkList.get(0)).getIDENT_CARD();
				// [パラメータ].”設定値”が「1:事後」場合
				if ("1".equals(flag)) {
					setErrorMessage("AD34030");
					return;
				}
			}

			// 印刷リスト
			List printList = new ArrayList();
			// 作業計画番号リスト
			List WorkOdrCdList = struct.getList_l_WORK_ODR_CD();
			// 現品票出力済みフラグ
			List cardPrintList = struct.getList_l_CARD_PRINTED_FLG();
			List printDataList = null;
			AD0030040Struct printStruct = new AD0030040Struct();
			
			String workOdrCd = "";	// 作業計画番号
			String tempCardQty = "0"; // 現品票残数
			AD0030040Struct insertStruct = new AD0030040Struct();
			AD0030040Struct selectStruct = new AD0030040Struct();
			conn.beginTransWeb();

			// 帳票出力
			for (int i = 0; i < WorkOdrCdList.size(); i++) {
				// 現品票既に出力済み、或いは、前回と同じの作業計画番号の場合、次レコードを続行する
				if ("1".equals(String.valueOf(cardPrintList.get(i))) || workOdrCd.equals(String.valueOf(WorkOdrCdList.get(i)))) {
					continue;
				}
				// 抽出条件を設定
				// 作業計画番号
				selectStruct.setl_WORK_ODR_CD(String.valueOf(WorkOdrCdList.get(i)));
				
				// 印刷リストを取得する。
				printDataList = entity.mSelectIDENT_CARD_DATA.read(conn, selectStruct);
				
				for (int j = 0; j < printDataList.size(); j++) {
					printStruct = (AD0030040Struct)printDataList.get(j);
					// 現品票残数
					tempCardQty = Calculate.subtract(printStruct.getOPR_INST_QTY(),printStruct.getIDENT_CARD_QTY());
					if (Calculate.compare(tempCardQty, "0") == 0) {
						// 他の処理により現品票が出力されました
						continue;
					}
					
					insertStruct = new AD0030040Struct();
					
					// 作業指示番号
					insertStruct.setOPR_INST_CD(printStruct.getOPR_INST_CD());
					
					// 品目番号
					insertStruct.setITEM_CD(printStruct.getITEM_CD());
					
					// 製番
					insertStruct.setJOB_ODR_CD(printStruct.getJOB_ODR_CD());
					
					// 初期現品票数量
					insertStruct.setFIRST_IDENT_CARD_QTY(Calculate.subtract(printStruct.getOPR_INST_QTY(),printStruct.getIDENT_CARD_QTY()));
					
					// 現品票数量
					insertStruct.setIDENT_CARD_QTY(Calculate.subtract(printStruct.getOPR_INST_QTY(),printStruct.getIDENT_CARD_QTY()));
					
					// 荷姿単位数
					insertStruct.setPKG_UNIT_QTY(printStruct.getPKG_UNIT_QTY());
					
					// 工場コード
					insertStruct.setPLANT_CD(getsysPLANT_CD());
					
					// 作業区コード
					insertStruct.setWS_CD(printStruct.getWS_CD());
					
					// 出力枚数
					insertStruct.setPRINT_QTY(Calculate.divide(insertStruct.getIDENT_CARD_QTY(), insertStruct.getPKG_UNIT_QTY(),Calculate.CEIL));
					
					// 品目名称
					insertStruct.setITEM_NAME(printStruct.getITEM_NAME());
					
					// 単位
					insertStruct.setSTOCK_UNIT(printStruct.getSTOCK_UNIT());
					
					// [現品票]を登録する
					insertIdentCard(insertStruct);
					printList.add(insertStruct);
				}

				// 作業計画番号を設定
				workOdrCd = String.valueOf(WorkOdrCdList.get(i));
			}

			if (printList.size() == 0) {
				// 他の処理により現品票がすべて出力されました
				setWarningMessage("AD00249");
				return;
			}

			String printId1 = "AD01200101"; // 帳票IDを指定してください
			ret = svf.VrInit(printId1); // PDF作成開始
			pdfFilePath = svf.getPdfFilePath(); // pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName(); // pdfファイル名（Web用）
			int no = 0;

			for (int i = 0; i < printList.size(); i++) {
				strPdf = (AD0030040Struct) printList.get(i);
				if (strPdf.getIDENT_CARD_CTL_NO() != null && !"".equals(strPdf.getIDENT_CARD_CTL_NO())) {
					double bunshi = Double.parseDouble(strPdf.getIDENT_CARD_QTY());
					double bunbo = Double.parseDouble(strPdf.getPKG_UNIT_QTY());
					double maxPrintQty;
					double overno;
					// 最大出力枚数
					maxPrintQty = Double.parseDouble(Calculate.divide(String.valueOf(bunshi), String.valueOf(bunbo), 0, Calculate.CEIL));
					// 現品票数量÷荷姿単位数量の余りを求める
					overno = bunshi % bunbo;

					for (int j = 1; j <= Double.parseDouble(strPdf.getPRINT_QTY()); j++) {
						// 品目番号
						ret = svf.VrsOut("ITEM_CD", strPdf.getITEM_CD());
						// 品目名称
						ret = svf.VrsOut("ITEM_NAME", strPdf.getITEM_NAME());
						
						if (j >= maxPrintQty) {
							// 最終ページでかつ、余りがある場合
							if (j == maxPrintQty) {
								// 余りを荷姿単位数量に設定
								if (overno != 0){
									ret = svf.VrsOut("PKG_UNIT_QTY", Calculate.floor(Double.toString(overno), 4));
								} else {
									ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
								}
							} else {
								// 入力した出力枚数は最大出力枚数を超える場合
								ret = svf.VrsOut("PKG_UNIT_QTY", "0");
							}
						} else {
							// 荷姿単位数量
							ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
						}
						// 単位
						ret = svf.VrsOut("STOCK_UNIT", strPdf.getSTOCK_UNIT());
						// 現品票管理番号
						ret = svf.VrsOut("IDENT_CARD_CTL_NO", strPdf.getIDENT_CARD_CTL_NO());
						// 在庫ロット番号
						ret = svf.VrsOut("LOT_NO", strPdf.getLOT_NO());
						// 製番
						ret = svf.VrsOut("JOB_ODR_CD", strPdf.getJOB_ODR_CD());
						// 実績数量
						ret = svf.VrsOut("IDENT_CARD_QTY", strPdf.getIDENT_CARD_QTY());
						// 作業指示番号
						ret = svf.VrsOut("OPR_INST_CD", strPdf.getOPR_INST_CD());
						// 分作回数
						ret = svf.VrsOut("PARTIAL_PRD_NO", strPdf.getPARTIAL_PRD_NO());
						// 作業日
						ret = svf.VrsOut("OPR_DATE", strPdf.getOPR_DATE());
						ret = svf.VrsOut("PAGE_NO", j + "");
						ret = svf.VrsOut("PRINT_QTY", strPdf.getPRINT_QTY());
						// ソート ページ用
						ret = svf.VrsOut("NO", Integer.toString(no++));
						ret = svf.VrEndRecord();
						ret = svf.VrEndPage(); // 改ページ実行
					}
					// 現品票更新
					entity.minsertT_IDENT_CARD.update(conn, strPdf);
				}
			}
			
			ret = svf.VrPrint(); // PDF作成終了
			ret = svf.VrQuit(); // PDF作成終了
			if ("0".equals(printType)) { // クライアント印刷の場合
				struct.setDOWNLOAD_FILE(getPdfFileName());
			} else if ("1".equals(printType)) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			controlSelect();
			// コミット
			conn.commit();
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		} finally {
			try {
				conn.rollback();
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
			}
		}
                //}}user_implement_dev:<controlCardPrint>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlCardPrint");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>


			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
				//controlSelect();
			}

			readStatus = INITIAL;
			this.msgStruct.clearAll();
			this.struct.clear();
			
			if (list != null) {
				list.clear();
			}
			
			if (viewList != null) {
				viewList.clear();
			}
			
			this.struct.setr1_MODE("true");
			
			try{
				// システムパラメータ（TIME_CTRL）取得
				List TIME_CTRLList = entity.mTIME_CTRL.read(conn, struct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					this.struct.setTIME_CTRL(((AD0030040Struct)TIME_CTRLList.get(0)).getTIME_CTRL());
				}else{
					this.struct.setTIME_CTRL("false");
				}
				sTimeCtrl = this.struct.getTIME_CTRL();		
				// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
			} catch(SQLException e) {
	//			e.printStackTrace();
				// エラー処理を記述してください。
				// 
			}			

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0030");
		logger.entering("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
			// TODO: ユーザ定義のコードを記述してください
			// コンボボックス部品のデータのセットはここに記述してください。
		try {
                 ComboBox comboController = new ComboBox(conn, sysUSER_CD);	
                 OPR_INST_SLIP_ISS_FLG = comboController.getData(OPR_INST_SLIP_ISS_FLG_PARAMETER_NAME);

                } catch (SQLException e) {
                 throw new ExpjException(e);
                } catch (ComboException e) {
                 throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0030040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CardPrint") ) {
				controlCardPrint();
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
//			throw new FoundationException("AD0030040Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030040-E999","CSVの出力処理"));
			throw new FoundationException("AD0030040Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030040-E999","システム日付の取得処理"));
				throw new FoundationException("AD0030040Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0030040-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0030040Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0030040Entity entity;
	protected AD0030040Struct struct;
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

		entity = new AD0030040Entity();
		struct = new AD0030040Struct();

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
	 * AD0030040クラスの標準コンストラクタ
	 */
	public AD0030040Control() throws BusinessProcessException, FoundationException
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
				AD0030040Struct key = (AD0030040Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_MODE") && key.getr1_MODE() != null) {
					msgKey.setKeyValue("r1_MODE", key.getr1_MODE());
				}
				if(msgKeyType.containsKeyColumn("c_RE_PRINT") && key.getc_RE_PRINT() != null) {
					msgKey.setKeyValue("c_RE_PRINT", key.getc_RE_PRINT());
				}
				if(msgKeyType.containsKeyColumn("r2_MODE") && key.getr2_MODE() != null) {
					msgKey.setKeyValue("r2_MODE", key.getr2_MODE());
				}
				if(msgKeyType.containsKeyColumn("PRINT_PATTERN") && key.getPRINT_PATTERN() != null) {
					msgKey.setKeyValue("PRINT_PATTERN", key.getPRINT_PATTERN());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG_DN") && key.getl_OPR_INST_SLIP_ISS_FLG_DN() != null) {
					msgKey.setKeyValue("l_OPR_INST_SLIP_ISS_FLG_DN", key.getl_OPR_INST_SLIP_ISS_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("DATE") && key.getDATE() != null) {
					msgKey.setKeyValue("DATE", key.getDATE());
				}
				if(msgKeyType.containsKeyColumn("TIME") && key.getTIME() != null) {
					msgKey.setKeyValue("TIME", key.getTIME());
				}
				if(msgKeyType.containsKeyColumn("PAGE") && key.getPAGE() != null) {
					msgKey.setKeyValue("PAGE", key.getPAGE());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_PAGE") && key.getTOTAL_PAGE() != null) {
					msgKey.setKeyValue("TOTAL_PAGE", key.getTOTAL_PAGE());
				}
				if(msgKeyType.containsKeyColumn("BARCODE1") && key.getBARCODE1() != null) {
					msgKey.setKeyValue("BARCODE1", key.getBARCODE1());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME") && key.getOPR_INST_START_TIME() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME", key.getOPR_INST_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME") && key.getWORK_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_TIME", key.getWORK_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("c_CARD_PRINT") && key.getc_CARD_PRINT() != null) {
					msgKey.setKeyValue("c_CARD_PRINT", key.getc_CARD_PRINT());
				}
				if(msgKeyType.containsKeyColumn("INST_PRINTED") && key.getINST_PRINTED() != null) {
					msgKey.setKeyValue("INST_PRINTED", key.getINST_PRINTED());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD") && key.getl_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("l_WORK_ODR_CD", key.getl_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD") && key.getl_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_CD", key.getl_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_NAME") && key.getl_PROC_NAME() != null) {
					msgKey.setKeyValue("l_PROC_NAME", key.getl_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_NO") && key.getl_PROC_NO() != null) {
					msgKey.setKeyValue("l_PROC_NO", key.getl_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_CD") && key.getl_OPR_INST_CD() != null) {
					msgKey.setKeyValue("l_OPR_INST_CD", key.getl_OPR_INST_CD());
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
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE") && key.getl_WORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_WORK_ODR_DLV_DATE", key.getl_WORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY") && key.getl_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_OPR_INST_QTY", key.getl_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_COMMENT") && key.getl_WORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_COMMENT", key.getl_WORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_DATE") && key.getl_OPR_INST_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_SLIP_ISS_DATE", key.getl_OPR_INST_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG") && key.getl_OPR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("l_OPR_INST_SLIP_ISS_FLG", key.getl_OPR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_CARD_PRINTED_FLG") && key.getl_CARD_PRINTED_FLG() != null) {
					msgKey.setKeyValue("l_CARD_PRINTED_FLG", key.getl_CARD_PRINTED_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG") && key.getOPR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_FLG", key.getOPR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY") && key.getIDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("IDENT_CARD_QTY", key.getIDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO") && key.getIDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("IDENT_CARD_CTL_NO", key.getIDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY") && key.getFIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("FIRST_IDENT_CARD_QTY", key.getFIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRINT_QTY") && key.getPRINT_QTY() != null) {
					msgKey.setKeyValue("PRINT_QTY", key.getPRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD") && key.getIDENT_CARD() != null) {
					msgKey.setKeyValue("IDENT_CARD", key.getIDENT_CARD());
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
					AD0030040Struct key = new AD0030040Struct();
					if(msgKeyType.containsKeyColumn("r1_MODE")) {
						key.setr1_MODE(msgKey.getKeyValue("r1_MODE"));
					}
					if(msgKeyType.containsKeyColumn("c_RE_PRINT")) {
						key.setc_RE_PRINT(msgKey.getKeyValue("c_RE_PRINT"));
					}
					if(msgKeyType.containsKeyColumn("r2_MODE")) {
						key.setr2_MODE(msgKey.getKeyValue("r2_MODE"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_PATTERN")) {
						key.setPRINT_PATTERN(msgKey.getKeyValue("PRINT_PATTERN"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG_DN")) {
						key.setl_OPR_INST_SLIP_ISS_FLG_DN(msgKey.getKeyValue("l_OPR_INST_SLIP_ISS_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("DATE")) {
						key.setDATE(msgKey.getKeyValue("DATE"));
					}
					if(msgKeyType.containsKeyColumn("TIME")) {
						key.setTIME(msgKey.getKeyValue("TIME"));
					}
					if(msgKeyType.containsKeyColumn("PAGE")) {
						key.setPAGE(msgKey.getKeyValue("PAGE"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_PAGE")) {
						key.setTOTAL_PAGE(msgKey.getKeyValue("TOTAL_PAGE"));
					}
					if(msgKeyType.containsKeyColumn("BARCODE1")) {
						key.setBARCODE1(msgKey.getKeyValue("BARCODE1"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME")) {
						key.setOPR_INST_START_TIME(msgKey.getKeyValue("OPR_INST_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_TIME")) {
						key.setWORK_ODR_DLV_TIME(msgKey.getKeyValue("WORK_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("c_CARD_PRINT")) {
						key.setc_CARD_PRINT(msgKey.getKeyValue("c_CARD_PRINT"));
					}
					if(msgKeyType.containsKeyColumn("INST_PRINTED")) {
						key.setINST_PRINTED(msgKey.getKeyValue("INST_PRINTED"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_CD")) {
						key.setl_WORK_ODR_CD(msgKey.getKeyValue("l_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD")) {
						key.setl_WORK_IN_PROC_CD(msgKey.getKeyValue("l_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_NAME")) {
						key.setl_PROC_NAME(msgKey.getKeyValue("l_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_NO")) {
						key.setl_PROC_NO(msgKey.getKeyValue("l_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_CD")) {
						key.setl_OPR_INST_CD(msgKey.getKeyValue("l_OPR_INST_CD"));
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
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE")) {
						key.setl_WORK_ODR_DLV_DATE(msgKey.getKeyValue("l_WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY")) {
						key.setl_OPR_INST_QTY(msgKey.getKeyValue("l_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_COMMENT")) {
						key.setl_WORK_IN_PROC_COMMENT(msgKey.getKeyValue("l_WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_DATE")) {
						key.setl_OPR_INST_SLIP_ISS_DATE(msgKey.getKeyValue("l_OPR_INST_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_SLIP_ISS_FLG")) {
						key.setl_OPR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("l_OPR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_CARD_PRINTED_FLG")) {
						key.setl_CARD_PRINTED_FLG(msgKey.getKeyValue("l_CARD_PRINTED_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG")) {
						key.setOPR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("OPR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY")) {
						key.setIDENT_CARD_QTY(msgKey.getKeyValue("IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO")) {
						key.setIDENT_CARD_CTL_NO(msgKey.getKeyValue("IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_IDENT_CARD_QTY")) {
						key.setFIRST_IDENT_CARD_QTY(msgKey.getKeyValue("FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_QTY")) {
						key.setPRINT_QTY(msgKey.getKeyValue("PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD")) {
						key.setIDENT_CARD(msgKey.getKeyValue("IDENT_CARD"));
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
