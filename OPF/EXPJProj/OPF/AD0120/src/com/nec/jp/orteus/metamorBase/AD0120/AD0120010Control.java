/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0120/src/com/nec/jp/orteus/metamorBase/AD0120/AD0120010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0120;

import com.nec.jp.orteus.metamorBase.AD0120.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
	// TODO: ここにimportパッケージを記述してください
import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0120010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.6 $ $Date: 2015/11/16 02:32:36 $
 *
 */
//}}user_implement_code_header

public class AD0120010Control
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
	public AD0120010Struct getListvalue(int x) { return (AD0120010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0120010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0120010Struct createStruct() { return new AD0120010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0120010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	 
	// 現品票印刷検索画面用
	AD0120010Struct mainStruct = new AD0120010Struct();
	
	// 作業実績区分のコンボボックスデータ
	private ComboStruct OPR_RSLT_TYP = null;
	/**
	  * 作業実績区分をゲット
	  * @return
	*/
	public ComboStruct getComOprRsltTyp() {
		return OPR_RSLT_TYP;
	}
	/**
	 * 作業実績区分をセット
	 * @param cs
	 */
	public void setComOprRsltTyp(ComboStruct cs){
		OPR_RSLT_TYP = cs;
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
     * 画面エラーメッセージ設定
     * @param メッセージ番号
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// エラーメッセージとして登録
     sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
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
	 * 現品票の登録
	 * @param insertStruct
	 */
	private void insertIdentCard (AD0120010Struct insertStruct) {
		try {
			// 現品票管理番号
			List identCardCtlNoList = entity.mSELECT_IDENT_CARD_CTL_NO.read(conn, insertStruct);
			if (!identCardCtlNoList.isEmpty()) {
				insertStruct.setIDENT_CARD_CTL_NO(((AD0120010Struct) identCardCtlNoList.get(0)).getIDENT_CARD_CTL_NO());
			}
			// 工場コード
			insertStruct.setPLANT_CD(getsysPLANT_CD());
			// 作成日
			insertStruct.setsSysdate(struct.getsSysdate());
			// 作成者
			insertStruct.setsUser_ID(getsysUSER_CD());
			entity.mT_IDENT_CARD.create(conn, insertStruct);
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
		}
	}
	
	/**
	 * 品目別仕掛の実際出力数更新
	 * @param updateStruct
	 */
	private void updateWorkInProcByItem (AD0120010Struct updateStruct) {
		
		try {
			// 更新日
			updateStruct.setsSysdate(struct.getsSysdate());
			// 更新者
			updateStruct.setsUser_ID(getsysUSER_CD());
			entity.mT_WORK_IN_PROC_BY_ITEM.update(conn, updateStruct);
		} catch (Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
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
	 * 日時の計算（製造納期From~To と作業着手日From~To）
	 */
	private void calculateDateTime() {
		
		if (null != struct.getTIME_CTRL() && "true".equals(struct.getTIME_CTRL())){
			// 製造納期（From）
			if(null == struct.getIN_WORK_ODR_DLV_DATE_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_FROM())){
				struct.setIN_WORK_ODR_DLV_DATETIME_FROM(null);
			}else{
				// 時刻設定
				if(null == struct.getIN_WORK_ODR_DLV_TIME_FROM() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_FROM())){
					struct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " 00:00");
				}else{
					struct.setIN_WORK_ODR_DLV_TIME_FROM(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_FROM(),4));
					struct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM() + " " + 
					struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(0,2) + ":" + 
					struct.getIN_WORK_ODR_DLV_TIME_FROM().substring(2));
				}
			}
			// 製造納期（To）
			if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
				struct.setIN_WORK_ODR_DLV_DATETIME_TO(null);
			}else{
				// 時刻設定
				if(null == struct.getIN_WORK_ODR_DLV_TIME_TO() || "".equals(struct.getIN_WORK_ODR_DLV_TIME_TO())){
					struct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
				}else{
					struct.setIN_WORK_ODR_DLV_TIME_TO(AppendZero(struct.getIN_WORK_ODR_DLV_TIME_TO(),4));
					struct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " " + 
					struct.getIN_WORK_ODR_DLV_TIME_TO().substring(0,2) + ":" + 
					struct.getIN_WORK_ODR_DLV_TIME_TO().substring(2));
				}
			}
			// 作業着手日（From）
			if (null == struct.getOPR_INST_START_DATE_FROM() || "".equals(struct.getOPR_INST_START_DATE_FROM())) {
				struct.setOPR_INST_START_DATETIME_FROM(null);
			} else {
				// 時刻設定
				if (null == struct.getOPR_INST_START_TIME_FROM() || "".equals(struct.getOPR_INST_START_TIME_FROM())) {
					struct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATE_FROM() + " 00:00");
				} else {
					struct.setOPR_INST_START_TIME_FROM(AppendZero(struct.getOPR_INST_START_TIME_FROM(), 4));
					struct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATE_FROM() + " "+
					struct.getOPR_INST_START_TIME_FROM().substring(0, 2) + ":" +
					struct.getOPR_INST_START_TIME_FROM().substring(2));
				}
			}
			// 作業着手日（To）
			if (null == struct.getOPR_INST_START_DATE_TO() || "".equals(struct.getOPR_INST_START_DATE_TO())) {
				struct.setOPR_INST_START_DATETIME_TO(null);
			} else {
				// 時刻設定
				if (null == struct.getOPR_INST_START_TIME_TO() || "".equals(struct.getOPR_INST_START_TIME_TO())) {
					struct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATE_TO() + " 00:00");
				} else {
					struct.setOPR_INST_START_TIME_TO(AppendZero(struct.getOPR_INST_START_TIME_TO(), 4));
					struct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATE_TO() + " "+
					struct.getOPR_INST_START_TIME_TO().substring(0, 2) + ":" +
					struct.getOPR_INST_START_TIME_TO().substring(2));
				}
			}
		} else {
			
			struct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATE_FROM());
			if(null == struct.getIN_WORK_ODR_DLV_DATE_TO() || "".equals(struct.getIN_WORK_ODR_DLV_DATE_TO())){
				struct.setIN_WORK_ODR_DLV_DATETIME_TO(null);
			}else{
				struct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATE_TO() + " 23:59");
			}
			struct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATE_FROM());
			if(null == struct.getOPR_INST_START_DATE_TO() || "".equals(struct.getOPR_INST_START_DATE_TO())){
				struct.setOPR_INST_START_DATETIME_TO(null);
			}else{
				struct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATE_TO() + " 23:59");
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
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
			// 工場コード
			struct.setPLANT_CD(getsysPLANT_CD());
			
			// 品目存在チェック
			if (struct.getITEM_CD() != null && !"".equals(struct.getITEM_CD())) {
				List checkItemList = entity.mM_ITEM.read(conn, struct);
				if (checkItemList.isEmpty()) {
					setErrorMessage("ZZ11002");
					setReadStatus(ERROR);
					return;
				} else {
					// 品目名の取得
					struct.setITEM_NAME(((AD0120010Struct)checkItemList.get(0)).getITEM_NAME());
				}
			}
			
			// 作業区存在チェック
			if (struct.getWS_CD() != null && !"".equals(struct.getWS_CD())) {
				List checkWsList = entity.mM_WS.read(conn, struct);
				if (checkWsList.isEmpty()) {
					setErrorMessage("ZZ11007");
					setReadStatus(ERROR);
					return;
				} else {
					// 作業区名の取得
					struct.setWS_NAME(((AD0120010Struct)checkWsList.get(0)).getWS_NAME());
				}
			}
			// 表示対象のデータが最大表示件数
			int maxLine = sp.getMaxLine(conn,10);
			if (maxLine != 0) {
				struct.setMAX_LINE(maxLine + "");
			} else {
				struct.setMAX_LINE(null);
			}
			
			// 抽出条件（日付の設定）
			calculateDateTime();
			
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
			// コンボボックスデータを取得
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			// 作業実績区分
			setComOprRsltTyp(cb.getData("OPR_RSLT_TYP"));
			
			AD0120010Struct tempStruct = new AD0120010Struct();
			for (int i = 0; i < list.size(); i++) {
				tempStruct = (AD0120010Struct) list.get(i);
				// 作業実績区分
				tempStruct.setl_OPR_RSLT_TYP_SHOW(getDisplayName(getComOprRsltTyp(), tempStruct.geth_l_OPR_RSLT_TYP()));
				// 出力枚数と最大出力枚数を設定する
				if ("1".equals(tempStruct.geth_l_OPR_RSLT_TYP())) {
					// 出来高実績の場合
					tempStruct.seth_l_MAX_PRINT_QTY(tempStruct.getl_PRINT_QTY());
				} else {
					// 作業実績の場合
					tempStruct.setl_PRINT_QTY(Calculate.divide(
							Calculate.subtract(tempStruct.getl_OPR_INST_QTY(), tempStruct.getl_SUM_IDENT_CARD_QTY()),
							tempStruct.getl_PKG_UNIT_QTY(),
							0,
							Calculate.CEIL));
					tempStruct.seth_l_MAX_PRINT_QTY(tempStruct.getl_PRINT_QTY());
				}

				// 出力枚数マスク
				if ("1".equals(tempStruct.geth_l_OPR_RSLT_TYP())) {
					tempStruct.seth_l_MASK_FLG(null);
				} else {
					tempStruct.seth_l_MASK_FLG("MASK");
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// CSV情報の作成
			List csvList = new ArrayList();
			String[] title = {
				"Expj.Cmt0065",	            	// 区分
				"Expj.PLANT_CD",				// 工場コード
				"Expj.OPR_INST_START_DATE_3",	// 作業製造着手日
				"Expj.WORK_ODR_DLV_DATE",		// 作業製造納期
				"Expj.OPR_INST_CD",				// 作業指示番号
				"Expj.ITEM_CD",			    	// 品目番号
				"Expj.ITEM_NAME",				// 品目名
				"Expj.OPR_INST_QTY_1",			// 作業計画数
				"Expj.Cmt6217",	            	// 累積出力済数
				"Expj.Cmt5863",					// 荷姿数
				"Expj.PRINT_QTY",				// 出力枚数
				"Expj.WS_CD",			    	// 作業区コード
				"Expj.WS_NAME"		        	// 作業区名
			};
			csvList.add(title);
			
			for (Iterator i = list.iterator(); i.hasNext();) {
				AD0120010Struct csvStruct = (AD0120010Struct) i.next();
				String[] csvStr = new String[title.length];
				int nCnt = 0;
				// 区分
				csvStr[nCnt++] = csvStruct.getl_OPR_RSLT_TYP_SHOW();
				// 工場コード
				csvStr[nCnt++] = csvStruct.getl_PLANT_CD();
				// 作業製造着手日
				csvStr[nCnt++] = csvStruct.getl_OPR_INST_START_DATE();
				// 作業製造納期
				csvStr[nCnt++] = csvStruct.getl_WORK_ODR_DLV_DATE();
				// 作業指示番号
				csvStr[nCnt++] = csvStruct.getl_OPR_INST_CD();
				// 品目番号
				csvStr[nCnt++] = csvStruct.getl_ITEM_CD();
				// 品目名
				csvStr[nCnt++] = csvStruct.getl_ITEM_NAME();
				// 作業計画数
				csvStr[nCnt++] = csvStruct.getl_OPR_INST_QTY();
				// 累積出力済数
				csvStr[nCnt++] = csvStruct.getl_SUM_IDENT_CARD_QTY();
				// 荷姿数
				csvStr[nCnt++] = csvStruct.getl_PKG_UNIT_QTY();
				// 出力枚数
				csvStr[nCnt++] = csvStruct.getl_PRINT_QTY();
				// 作業区コード
				csvStr[nCnt++] = csvStruct.getl_WS_CD();
				// 作業区名
				csvStr[nCnt++] = csvStruct.getl_WS_NAME();
				csvList.add(csvStr);
			}
			
			if (csvList != null && !csvList.isEmpty()) {
				// CsvWriterを生成
				csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		} catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		if (list == null) {
			list = new ArrayList();
		} else {
			list.clear();
		}
		setReadStatus(INITIAL);
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0120010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 印刷リスト
			List printList = new ArrayList();
			// 品目別仕掛リスト
			List workInProcByItemList = new ArrayList();
			// 品目番号リスト
			List itemCdList = struct.getList_l_ITEM_CD();
			// 品目名リスト
			List itemNameList = struct.getList_l_ITEM_NAME();
			// 単位リスト
			List stockUnitList = struct.getList_h_l_STOCK_UNIT();
			// 作業計画数リスト
			List oprInstQtyList = struct.getList_l_OPR_INST_QTY();
			// 累積出力済数リスト
			List sumIdentCardQtyList = struct.getList_l_SUM_IDENT_CARD_QTY();
			// 荷姿数(品目)
			List pkgUnitQtyList = struct.getList_l_PKG_UNIT_QTY();
			// 出力枚数リスト
			List printQtyList = struct.getList_l_PRINT_QTY();
			// 区分リスト
			List oprRsltTypList = struct.getList_h_l_OPR_RSLT_TYP();
			// 作業区コードリスト
			List wsCdList = struct.getList_l_WS_CD();
			// 製番リスト
			List jobOdrCdList = struct.getList_h_l_JOB_ODR_CD();
			// 作業指示番号リスト
			List oprInstCdList = struct.getList_l_OPR_INST_CD();
			// 最大出力枚数
			List maxPrintQtyList = struct.getList_h_l_MAX_PRINT_QTY();
			
			int count = 0;	// カウント
			String tempQty = new String();	// 出残力数
			String qty = new String();		// 出力数
			String printQty = new String();	// 入力した出力枚数
			AD0120010Struct insertStruct = new AD0120010Struct();
			AD0120010Struct workInProcByItemStruct = new AD0120010Struct();
			AD0120010Struct selectStruct = new AD0120010Struct();
			conn.beginTransWeb();

			// 日時の計算（製造納期From~To と作業着手日From~To）
			calculateDateTime();
			// 抽出条件（日付の設定）
			// 製造納期（From）
			selectStruct.setIN_WORK_ODR_DLV_DATETIME_FROM(struct.getIN_WORK_ODR_DLV_DATETIME_FROM());
			// 製造納期（To）
			selectStruct.setIN_WORK_ODR_DLV_DATETIME_TO(struct.getIN_WORK_ODR_DLV_DATETIME_TO());
			// 作業着手日（From）
			selectStruct.setOPR_INST_START_DATETIME_FROM(struct.getOPR_INST_START_DATETIME_FROM());
			// 作業着手日（To）
			selectStruct.setOPR_INST_START_DATETIME_TO(struct.getOPR_INST_START_DATETIME_TO());

			// 帳票出力
			for (int i = 0; i < itemCdList.size(); i++) {
				// 品目番号
				selectStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
				// [現品票]を登録
				if ("1".equals(oprRsltTypList.get(i))) {
					// 出来高実績の場合
					// 工場コード
					selectStruct.setPLANT_CD(getsysPLANT_CD());
					
					// 選択した明細行の最大出力枚数を判断する
					if ("0".equals(String.valueOf(maxPrintQtyList.get(i)))) {
						// 最大出力枚数= 0の場合
						if ("0".equals(String.valueOf(printQtyList.get(i)))) {
							// 選択した明細行の出力枚数も0の場合、次レコードを行う
							continue;
						}
						
						// 作業製造納期最も遅いのレコードを取得する
						workInProcByItemList = entity.mSELECT_OPR_INST_CD.read(conn, selectStruct);
						workInProcByItemStruct = new AD0120010Struct();
						workInProcByItemStruct = (AD0120010Struct) workInProcByItemList.get(0);
						
						insertStruct = new AD0120010Struct();
						// 品目番号
						insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
						// 現品票数量
						insertStruct.setIDENT_CARD_QTY("0");
						// 作業指示番号
						insertStruct.setOPR_INST_CD(workInProcByItemStruct.getOPR_INST_CD());
						// 品目名称
						insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
						// 荷姿単位数
						insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
						// 作業区コード
						insertStruct.setWS_CD(workInProcByItemStruct.getWS_CD());
						// 単位
						insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
						// 出力枚数
						insertStruct.setPRINT_QTY(String.valueOf(printQtyList.get(i)));
						
						// [現品票]を登録する
						insertIdentCard(insertStruct);
						printList.add(insertStruct);
					} else {
						// 最大出力枚数 > 0の場合
						workInProcByItemList = entity.mT_WORK_IN_PROC_BY_ITEM.read(conn, selectStruct);
						workInProcByItemStruct = new AD0120010Struct();

						count = workInProcByItemList.size();
						// 出力枚数
						printQty = String.valueOf(printQtyList.get(i));
						for (int j = 0; j < count; j++) {
							insertStruct = new AD0120010Struct();
							workInProcByItemStruct = (AD0120010Struct) workInProcByItemList.get(j);
							// 出力残数
							tempQty = Calculate.subtract(workInProcByItemStruct.getOPR_INST_QTY(), workInProcByItemStruct.getPRINT_QTY());
							// 出力数
							qty = Calculate.multiply(printQty, String.valueOf(pkgUnitQtyList.get(i)));
							// 選択した明細行の「出力数」 >= 選択した明細行の「作業計画数」-選択した明細行の「累積出力済数」の場合
							if (Calculate.compare(qty, tempQty) >= 0) {
								// 品目番号
								insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
								// 現品票数量
								insertStruct.setIDENT_CARD_QTY(tempQty);
								// 作業指示番号
								insertStruct.setOPR_INST_CD(workInProcByItemStruct.getOPR_INST_CD());
								// 品目名称
								insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
								// 荷姿単位数
								insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
								// 作業区コード
								insertStruct.setWS_CD(workInProcByItemStruct.getWS_CD());
								// 単位
								insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
								// 出力枚数
								if (j + 1 == count) {
									// 入力した出力枚数が最大出力枚数を超える場合、最後の作業指示番号を利用し出力する
									insertStruct.setPRINT_QTY(printQty);
								} else {
									insertStruct.setPRINT_QTY(Calculate.divide(insertStruct.getIDENT_CARD_QTY(), insertStruct.getPKG_UNIT_QTY(), 0, Calculate.CEIL));
								}
								
								// [現品票]を登録する
								insertIdentCard(insertStruct);
								printList.add(insertStruct);

								// [品目別仕掛].”実際出力数”―＞ [品目別仕掛].”作業指示数”
								workInProcByItemStruct.setPRINT_QTY(workInProcByItemStruct.getOPR_INST_QTY());
								// [品目別仕掛]を更新する
								updateWorkInProcByItem(workInProcByItemStruct);
								
								// 「出力枚数」 ―＞ 「出力枚数」 - [現品票].”出力枚数”
								printQty = Calculate.subtract(printQty, insertStruct.getPRINT_QTY());
							} else if (Calculate.compare(qty, "0") > 0) {
								// 品目番号
								insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
								// 現品票数量
								insertStruct.setIDENT_CARD_QTY(qty);
								// 作業指示番号
								insertStruct.setOPR_INST_CD(workInProcByItemStruct.getOPR_INST_CD());
								// 品目名称
								insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
								// 荷姿単位数
								insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
								// 作業区コード
								insertStruct.setWS_CD(workInProcByItemStruct.getWS_CD());
								// 単位
								insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
								// 出力枚数
								insertStruct.setPRINT_QTY(printQty);
								// [現品票]を登録する
								insertIdentCard(insertStruct);
								printList.add(insertStruct);

								// [品目別仕掛].”実際出力数”―＞ 「現品票出力数」 + [品目別仕掛].”実際出力数”
								workInProcByItemStruct.setPRINT_QTY(Calculate.add(qty, workInProcByItemStruct.getPRINT_QTY()));
								// [品目別仕掛]を更新する
								updateWorkInProcByItem(workInProcByItemStruct);
								// 処理終了
								break;
							}
						}
					}
				} else {
					// 作業指示実績の場合
					if ("0".equals(String.valueOf(printQtyList.get(i)))) {
						// 選択した明細行の出力枚数が0の場合、次レコードを行う
						continue;
					}

					insertStruct = new AD0120010Struct();
					// 品目番号
					insertStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
					// 現品票数量
					insertStruct.setIDENT_CARD_QTY(Calculate.subtract(String.valueOf(oprInstQtyList.get(i)), String.valueOf(sumIdentCardQtyList.get(i))));
					// 作業指示番号
					insertStruct.setOPR_INST_CD(String.valueOf(oprInstCdList.get(i)));
					// 品目名称
					insertStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
					// 荷姿単位数
					insertStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
					// 作業区コード
					insertStruct.setWS_CD(String.valueOf(wsCdList.get(i)));
					// 出力枚数
					insertStruct.setPRINT_QTY(String.valueOf(printQtyList.get(i)));
					// 単位
					insertStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
					// 製番
					insertStruct.setJOB_ODR_CD(String.valueOf(jobOdrCdList.get(i)));
					// [現品票]を登録する
					insertIdentCard(insertStruct);
					printList.add(insertStruct);
				}
			}

			String printId1 = "AD01200101"; // 帳票IDを指定してください
			ret = svf.VrInit(printId1); // PDF作成開始
			pdfFilePath = svf.getPdfFilePath(); // pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName(); // pdfファイル名（Web用）
			int no = 0;

			for (int i = 0; i < printList.size(); i++) {
				strPdf = (AD0120010Struct) printList.get(i);
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
					entity.mT_IDENT_CARD.update(conn, strPdf);
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
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			controlSelect();
			// コミット
			conn.commit();
		} catch(ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
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
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * 出力数 空白出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlNullPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlNullPrint");
			//{{user_implement_dev:<controlNullPrint>
			// TODO: ユーザ定義のコードを記述してください
		AD0120010Struct strPdf = null;
		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);
		try {
			// 印刷リスト
			List printList = new ArrayList();
			// 品目番号リスト
			List itemCdList = struct.getList_l_ITEM_CD();
			// 品目名リスト
			List itemNameList = struct.getList_l_ITEM_NAME();
			// 単位リスト
			List stockUnitList = struct.getList_h_l_STOCK_UNIT();
			// 荷姿数(品目)
			List pkgUnitQtyList = struct.getList_l_PKG_UNIT_QTY();
			AD0120010Struct printBlankStruct = new AD0120010Struct();
			// 帳票出力
			for (int i = 0; i < itemCdList.size(); i++) {
				printBlankStruct = new AD0120010Struct();
				// 品目番号
				printBlankStruct.setITEM_CD(String.valueOf(itemCdList.get(i)));
				// 品目名称
				printBlankStruct.setITEM_NAME(String.valueOf(itemNameList.get(i)));
				// 荷姿単位数量
				printBlankStruct.setPKG_UNIT_QTY(String.valueOf(pkgUnitQtyList.get(i)));
				// 単位
				printBlankStruct.setSTOCK_UNIT(String.valueOf(stockUnitList.get(i)));
				// 現品票管理番号
				printBlankStruct.setIDENT_CARD_CTL_NO("");
				// 在庫ロット番号
				printBlankStruct.setLOT_NO("");
				// 製番
				printBlankStruct.setJOB_ODR_CD("");
				// 実績数量
				printBlankStruct.setIDENT_CARD_QTY("");
				// 作業指示番号
				printBlankStruct.setOPR_INST_CD("");
				// 分作回数
				printBlankStruct.setPARTIAL_PRD_NO("");
				// 作業日
				printBlankStruct.setOPR_DATE("");
				// 枚数
				printBlankStruct.setPRINT_QTY("");
				printList.add(printBlankStruct);
			}
			String printId1 = "AD01200101"; // 帳票IDを指定してください
			ret = svf.VrInit(printId1); // PDF作成開始
			pdfFilePath = svf.getPdfFilePath(); // pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName(); // pdfファイル名（Web用）
			int no = 0;
			for (int i = 0; i < printList.size(); i++) {
				strPdf = (AD0120010Struct) printList.get(i);
				// 品目番号
				ret = svf.VrsOut("ITEM_CD", strPdf.getITEM_CD());
				// 品目名称
				ret = svf.VrsOut("ITEM_NAME", strPdf.getITEM_NAME());
				// 荷姿単位数量
				ret = svf.VrsOut("PKG_UNIT_QTY", strPdf.getPKG_UNIT_QTY());
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
				// 枚数
				ret = svf.VrsOut("PRINT_QTY", null);
				ret = svf.VrsOut("PAGE_NO", null);
				// ソート ページ用
				ret = svf.VrsOut("NO", Integer.toString(no++));
				ret = svf.VrEndRecord();
				ret = svf.VrEndPage(); // 改ページ実行
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
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			controlSelect();
		}catch(Exception e) {
			e.printStackTrace();
			setErrorMessage("ZZ01106");
			setReadStatus(ERROR);
		}
                //}}user_implement_dev:<controlNullPrint>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlNullPrint");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 現品票出力タイミングの取得
			List checkList = entity.mSYS_PARAMETER.read(conn, struct);
			if (checkList.isEmpty()) {
				ExpjMessage emsg = new ExpjMessage("AD34030");
				sysLog.severe(emsg, getsysUSER_CD());          //致命的エラー エラー内容
				ExpjException ee = new ExpjException(emsg);    // エクセプションを生成
				throw ee;
			} else {
				String flag = ((AD0120010Struct)checkList.get(0)).getIDENT_CARD();
				// 事後場合
				if ("1".equals(flag)) {
					ExpjMessage emsg = new ExpjMessage("AD34030");
					sysLog.severe(emsg, getsysUSER_CD());          //致命的エラー エラー内容
					ExpjException ee = new ExpjException(emsg);    // エクセプションを生成
					throw ee;
				}
			}
			// システムパラメータ（TIME_CTRL）取得
			List timeCtrlList = entity.mSELECT_TIME_CTRL.read(conn, struct);
			if(timeCtrlList.isEmpty()){
				struct.setTIME_CTRL(null);
			}else{			
				struct.setTIME_CTRL(((AD0120010Struct)timeCtrlList.get(0)).getTIME_CTRL());
			}
			// 「帳票出力」マスクフラグ(BTN_PRINT_MASK)取得
			List maskFlgList = entity.mSELECT_MASK_FLG.read(conn, struct);
			if (maskFlgList.isEmpty()) {
				struct.seth_MASK_FLG(null);
			} else {
				struct.seth_MASK_FLG(((AD0120010Struct)maskFlgList.get(0)).getMASK_FLG());
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
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0120");
		logger.entering("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア
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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("NullPrint") ) {
				controlNullPrint();
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
//			throw new FoundationException("AD0120010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0120010-E999","CSVの出力処理"));
			throw new FoundationException("AD0120010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0120010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0120010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0120010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0120010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0120010Entity entity;
	protected AD0120010Struct struct;
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

		entity = new AD0120010Entity();
		struct = new AD0120010Struct();

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
	 * AD0120010クラスの標準コンストラクタ
	 */
	public AD0120010Control() throws BusinessProcessException, FoundationException
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
				AD0120010Struct key = (AD0120010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM") && key.getIN_WORK_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_FROM", key.getIN_WORK_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM") && key.getIN_WORK_ODR_DLV_TIME_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_FROM", key.getIN_WORK_ODR_DLV_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO") && key.getIN_WORK_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATE_TO", key.getIN_WORK_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO") && key.getIN_WORK_ODR_DLV_TIME_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_TIME_TO", key.getIN_WORK_ODR_DLV_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP_SHOW") && key.getl_OPR_RSLT_TYP_SHOW() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP_SHOW", key.getl_OPR_RSLT_TYP_SHOW());
				}
				if(msgKeyType.containsKeyColumn("h_l_MASK_FLG") && key.geth_l_MASK_FLG() != null) {
					msgKey.setKeyValue("h_l_MASK_FLG", key.geth_l_MASK_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_MASK_FLG") && key.geth_MASK_FLG() != null) {
					msgKey.setKeyValue("h_MASK_FLG", key.geth_MASK_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_l_MAX_PRINT_QTY") && key.geth_l_MAX_PRINT_QTY() != null) {
					msgKey.setKeyValue("h_l_MAX_PRINT_QTY", key.geth_l_MAX_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_FROM") && key.getOPR_INST_START_DATE_FROM() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_FROM", key.getOPR_INST_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_FROM") && key.getOPR_INST_START_TIME_FROM() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME_FROM", key.getOPR_INST_START_TIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TO") && key.getOPR_INST_START_DATE_TO() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE_TO", key.getOPR_INST_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_TO") && key.getOPR_INST_START_TIME_TO() != null) {
					msgKey.setKeyValue("OPR_INST_START_TIME_TO", key.getOPR_INST_START_TIME_TO());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO") && key.getIDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("IDENT_CARD_CTL_NO", key.getIDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAGE_NO") && key.getPAGE_NO() != null) {
					msgKey.setKeyValue("PAGE_NO", key.getPAGE_NO());
				}
				if(msgKeyType.containsKeyColumn("h_l_OPR_RSLT_TYP") && key.geth_l_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("h_l_OPR_RSLT_TYP", key.geth_l_OPR_RSLT_TYP());
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
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE") && key.getl_WORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_WORK_ODR_DLV_DATE", key.getl_WORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE") && key.getl_OPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("l_OPR_INST_START_DATE", key.getl_OPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY") && key.getl_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_OPR_INST_QTY", key.getl_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_SUM_IDENT_CARD_QTY") && key.getl_SUM_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("l_SUM_IDENT_CARD_QTY", key.getl_SUM_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_PKG_UNIT_QTY") && key.getl_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("l_PKG_UNIT_QTY", key.getl_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_INST_CD") && key.getl_OPR_INST_CD() != null) {
					msgKey.setKeyValue("l_OPR_INST_CD", key.getl_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_JOB_ODR_CD") && key.geth_l_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("h_l_JOB_ODR_CD", key.geth_l_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_l_STOCK_UNIT") && key.geth_l_STOCK_UNIT() != null) {
					msgKey.setKeyValue("h_l_STOCK_UNIT", key.geth_l_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PRINT_QTY") && key.getl_PRINT_QTY() != null) {
					msgKey.setKeyValue("l_PRINT_QTY", key.getl_PRINT_QTY());
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
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_FROM") && key.getIN_WORK_ODR_DLV_DATETIME_FROM() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATETIME_FROM", key.getIN_WORK_ODR_DLV_DATETIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_TO") && key.getIN_WORK_ODR_DLV_DATETIME_TO() != null) {
					msgKey.setKeyValue("IN_WORK_ODR_DLV_DATETIME_TO", key.getIN_WORK_ODR_DLV_DATETIME_TO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_FROM") && key.getOPR_INST_START_DATETIME_FROM() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATETIME_FROM", key.getOPR_INST_START_DATETIME_FROM());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_TO") && key.getOPR_INST_START_DATETIME_TO() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATETIME_TO", key.getOPR_INST_START_DATETIME_TO());
				}
				if(msgKeyType.containsKeyColumn("MAX_LINE") && key.getMAX_LINE() != null) {
					msgKey.setKeyValue("MAX_LINE", key.getMAX_LINE());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD") && key.getIDENT_CARD() != null) {
					msgKey.setKeyValue("IDENT_CARD", key.getIDENT_CARD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("PRINT_QTY") && key.getPRINT_QTY() != null) {
					msgKey.setKeyValue("PRINT_QTY", key.getPRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY") && key.getIDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("IDENT_CARD_QTY", key.getIDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("MASK_FLG") && key.getMASK_FLG() != null) {
					msgKey.setKeyValue("MASK_FLG", key.getMASK_FLG());
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
					AD0120010Struct key = new AD0120010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_FROM")) {
						key.setIN_WORK_ODR_DLV_DATE_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_FROM")) {
						key.setIN_WORK_ODR_DLV_TIME_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATE_TO")) {
						key.setIN_WORK_ODR_DLV_DATE_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_TIME_TO")) {
						key.setIN_WORK_ODR_DLV_TIME_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP_SHOW")) {
						key.setl_OPR_RSLT_TYP_SHOW(msgKey.getKeyValue("l_OPR_RSLT_TYP_SHOW"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MASK_FLG")) {
						key.seth_l_MASK_FLG(msgKey.getKeyValue("h_l_MASK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_MASK_FLG")) {
						key.seth_MASK_FLG(msgKey.getKeyValue("h_MASK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_l_MAX_PRINT_QTY")) {
						key.seth_l_MAX_PRINT_QTY(msgKey.getKeyValue("h_l_MAX_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_FROM")) {
						key.setOPR_INST_START_DATE_FROM(msgKey.getKeyValue("OPR_INST_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_FROM")) {
						key.setOPR_INST_START_TIME_FROM(msgKey.getKeyValue("OPR_INST_START_TIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE_TO")) {
						key.setOPR_INST_START_DATE_TO(msgKey.getKeyValue("OPR_INST_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_TIME_TO")) {
						key.setOPR_INST_START_TIME_TO(msgKey.getKeyValue("OPR_INST_START_TIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_CTL_NO")) {
						key.setIDENT_CARD_CTL_NO(msgKey.getKeyValue("IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAGE_NO")) {
						key.setPAGE_NO(msgKey.getKeyValue("PAGE_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_l_OPR_RSLT_TYP")) {
						key.seth_l_OPR_RSLT_TYP(msgKey.getKeyValue("h_l_OPR_RSLT_TYP"));
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
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_ODR_DLV_DATE")) {
						key.setl_WORK_ODR_DLV_DATE(msgKey.getKeyValue("l_WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_START_DATE")) {
						key.setl_OPR_INST_START_DATE(msgKey.getKeyValue("l_OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_QTY")) {
						key.setl_OPR_INST_QTY(msgKey.getKeyValue("l_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_SUM_IDENT_CARD_QTY")) {
						key.setl_SUM_IDENT_CARD_QTY(msgKey.getKeyValue("l_SUM_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_PKG_UNIT_QTY")) {
						key.setl_PKG_UNIT_QTY(msgKey.getKeyValue("l_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_INST_CD")) {
						key.setl_OPR_INST_CD(msgKey.getKeyValue("l_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_JOB_ODR_CD")) {
						key.seth_l_JOB_ODR_CD(msgKey.getKeyValue("h_l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_l_STOCK_UNIT")) {
						key.seth_l_STOCK_UNIT(msgKey.getKeyValue("h_l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PRINT_QTY")) {
						key.setl_PRINT_QTY(msgKey.getKeyValue("l_PRINT_QTY"));
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
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_FROM")) {
						key.setIN_WORK_ODR_DLV_DATETIME_FROM(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATETIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("IN_WORK_ODR_DLV_DATETIME_TO")) {
						key.setIN_WORK_ODR_DLV_DATETIME_TO(msgKey.getKeyValue("IN_WORK_ODR_DLV_DATETIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_FROM")) {
						key.setOPR_INST_START_DATETIME_FROM(msgKey.getKeyValue("OPR_INST_START_DATETIME_FROM"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATETIME_TO")) {
						key.setOPR_INST_START_DATETIME_TO(msgKey.getKeyValue("OPR_INST_START_DATETIME_TO"));
					}
					if(msgKeyType.containsKeyColumn("MAX_LINE")) {
						key.setMAX_LINE(msgKey.getKeyValue("MAX_LINE"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD")) {
						key.setIDENT_CARD(msgKey.getKeyValue("IDENT_CARD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_QTY")) {
						key.setPRINT_QTY(msgKey.getKeyValue("PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("IDENT_CARD_QTY")) {
						key.setIDENT_CARD_QTY(msgKey.getKeyValue("IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("MASK_FLG")) {
						key.setMASK_FLG(msgKey.getKeyValue("MASK_FLG"));
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
