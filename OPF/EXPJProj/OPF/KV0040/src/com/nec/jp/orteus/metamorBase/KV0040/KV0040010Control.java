/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KV0040/src/com/nec/jp/orteus/metamorBase/KV0040/KV0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KV0040;

import com.nec.jp.orteus.metamorBase.KV0040.*;
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
//日付処理
import java.util.Calendar;
import java.text.ParseException;
import java.text.*;
import java.io.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : BC2060010Control クラス
 * 請求データ作成バッチ実行
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.4 $ $Date: 2016/05/23 08:25:56 $
 *
 */
//}}user_implement_code_header

public class KV0040010Control
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
	public KV0040010Struct getListvalue(int x) { return (KV0040010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KV0040010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KV0040010Struct createStruct() { return new KV0040010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KV0040010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
    /** 会社コード */
    protected String companyCd;
    protected String businessCtrlDate;
    protected String plantCd;
    private void setCOMPANY_CD(String companyCd) { this.companyCd = companyCd; }
    private String getCOMPANY_CD() { return this.companyCd; }

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
     * Exceptionメッセージ設定
     * @param キー項目
     */
    private void setExceptionMsg(Exception e) throws ExpjException
    {
        // エラーメッセージ作成
        ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
        sysLog.severe(emsg, getsysUSER_CD());                       //致命的エラー エラー内容
        ExpjException ee = new ExpjException(e, emsg);  // エクセプションを生成
        throw ee;
    }

    /**
     * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     */
    private void setInformationMessage(String code) {
        ExpjMessage emsg = new ExpjMessage(code);
        msgStruct.addInfo(emsg);
        sysLog.config(emsg, sysUSER_CD);
    }
    /**
     * 削除範囲(削除年月度)の取得
     * @param strDate 画面データ(削除起算年月度:YYYY/MM/DD)
     * @param strTERM 画面データ(保管月数)
     * @return  resultStr 削除年月度(YYYY/MM/DD)
    */
    public String getPastDate(String strDate, String strTERM)
    {
            String resultStr = null;
    
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
                                // 入力の書式に合わせてフォーマット文字列を指定
                                // フォーマット文字列の詳細はリファレンスを参照
        Date date = null;
        try {
                date = formatter.parse(strDate);        // 文字列→日付
    
        } catch (ParseException x) {                    // 書式エラー
                return resultStr;
        }
    
        //---------------
        // 日付計算
        //---------------
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
    
        cal.add(cal.MONTH, -1 * Integer.parseInt(strTERM)); // 日付(月)の減算
        Date result = cal.getTime();
    
        resultStr = formatter.format(result);               // 日付→文字列
    
        return resultStr;
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controldo() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controldo");
			//{{user_implement_dev:<controldo>
        /** *** バッチ処理 **** */
		try {
			// バッチ処理クラスのmain引数
			String batchProcessingTyp = null; // バッチ処理区分(1: 夜間バッチ(自動運転) 2:
												// マニュアル(自動運転なし) )
			String userId = null; // ユーザID
			String plantCd = null; // 工場コード
			String company_cd = null; // 会社コード
			String YearMonth_YYYYMMDD = null; // 削除起算年月度(YYYYMMDD)
			String YearMonth = null; // 削除起算年月度(YYYYMM)

			// バッチ処理区分
			batchProcessingTyp = "2"; // 2: 自動運転しない（夜間バッチなし）
			// ユーザID
			userId = getsysUSER_CD();
			// 工場コード
			plantCd = this.plantCd;
			// 会社コード
			company_cd = struct.getCOMPANY_CD();
			// 削除起算年月度
			YearMonth_YYYYMMDD = struct.getDELETE_RECKON_YM().replaceAll("/","");
			YearMonth = YearMonth_YYYYMMDD.substring(0, 6);

			ResourceBundle bundle = SystemConfig.getBundle();
			String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
			if (javaPath == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09010"); // システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
				msgStruct.addError(emsg); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); // エラー詳細
				return;
			}
			String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
			if (ClassPath == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09011"); // システム既定値ファイルからの情報取得に失敗しました(クラスパス)
				msgStruct.addError(emsg); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); // エラー詳細
				return;
			}
			String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
			if (batchPath == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09012"); // システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)
				msgStruct.addError(emsg); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); // エラー詳細
				return;
			}

			String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE", bundle); // JAVAバッチ用ヒープサイズ取得
			if (heapSize == null) {
				ExpjMessage emsg = new ExpjMessage("ZZ09017"); // システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)
				msgStruct.addError(emsg); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); // エラー詳細
				return;
			}

			StringBuffer cmd = new StringBuffer(javaPath); // コマンド文字列
			cmd.append(" -Xms").append(heapSize).append("m");
			cmd.append(" -Xmx").append(heapSize).append("m");
			cmd.append(" -cp ");
			cmd.append(ClassPath);
			cmd.append(" -Dcom.nec.jp.orteus.util.logging.config.file=");
			cmd.append(batchPath); // D:/OrteusStudio/lib/logging.properties";
									// // 起動設定
			cmd.append(" ").append("com.nec.jp.orteus.metamorBase.KV0040.KV0040B001.mainKV0040B001"); // 呼び出し先クラス
			cmd.append(" ").append(batchProcessingTyp); // バッチ処理区分
			cmd.append(" ").append(userId); // ユーザID
			cmd.append(" ").append(plantCd); // 工場コード
			cmd.append(" ").append(company_cd); // 会社コード
			cmd.append(" ").append(YearMonth); // 削除起算年月度
			sysLog.info("ZZ01006", getsysUSER_CD(), cmd.toString());
			
			List buffer = new ArrayList(); // コマンド文字列
			buffer.add("-Xms"+ heapSize+"m");
			buffer.add("-Xmx"+ heapSize+"m");
			buffer.add("-cp");
			buffer.add(ClassPath);
			buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file=" + batchPath); // D:/OrteusStudio/lib/logging.properties";
									// // 起動設定
			buffer.add("com.nec.jp.orteus.metamorBase.KV0040.KV0040B001.mainKV0040B001"); // 呼び出し先クラス
			buffer.add(batchProcessingTyp); // バッチ処理区分
			buffer.add(userId); // ユーザID
			buffer.add(plantCd); // 工場コード
			buffer.add(company_cd); // 会社コード
			buffer.add(YearMonth); // 削除起算年月度

			// メッセージ出力
			setInformationMessage("ZZ09013");
			// バッチキック
			Runtime runtime = Runtime.getRuntime();
//			Process p = runtime.exec(cmd.toString());
			runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
			
		} catch (IOException e) {
			// バッチ呼び出し失敗の場合、画面メッセージを表示する。
			ExpjMessage emsg = new ExpjMessage("ZZ09016");
			msgStruct.addError(emsg);
			return;
		} catch (Exception e) {
			// e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ09016");
			msgStruct.addError(emsg);
			return;
		}
		/** *** 再読込データの取得 **** */
		/** *** 削除年月度(YYYY/MM)の算出 (削除起算年月度 - 保管月数) **** */
		// 年月度(YYYY/MM)取得変数
		String DEL_YM = null;
		// 販売所要計画
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct
				.getSALES_PLAN_TERM());
		if (DEL_YM != null) {
			struct.setSALES_PLAN_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
		// 受注情報
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct
				.getODR_SHIP_TERM());
		if (DEL_YM != null) {
			struct.setODR_SHIP_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
		// その他売上
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct
				.getSALES_TERM());
		if (DEL_YM != null) {
			struct.setSALES_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
		// EDI
		DEL_YM = getPastDate(struct.getDELETE_RECKON_YM(), struct.getEDI_TERM());
		if (DEL_YM != null) {
			struct.setEDI_TERM_LAST_YM(DEL_YM.substring(0, 7));
		}
                //}}user_implement_dev:<controldo>
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controldo");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		     controlRELOAD();
                //}}user_implement_dev:<controlclear>
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			// 自社情報を取得
			List companyList = entity.mSYS_MY_COMPANY.read(conn, struct);
			if (companyList == null || companyList.size() <= 0) {
				setErrorMessage("KQ00039");
				return;
			}
			companyCd = (String)((KV0040010Struct) companyList.get(0)).getCOMPANY_CD();
			struct.setCOMPANY_CD(companyCd);

			// 業務日付を取得
			List sysDateList = entity.mSYS_DATE_CTRL.read(conn, struct);
			if (sysDateList == null || sysDateList.size() <= 0) {
				setErrorMessage("KQ00026");
				return;
			}
			businessCtrlDate = (String)((KV0040010Struct)sysDateList.get(0)).getBUSINESS_CTRL_DATE().substring(0,10);
			struct.setBUSINESS_CTRL_DATE(businessCtrlDate);
			struct.setDELETE_RECKON_YM(businessCtrlDate);
			//　工場コードを取得
			List plantCdList =  entity.mSYS_CLASS_CODE.read(conn,struct);
			if (plantCdList == null || plantCdList.size() <= 0){
				setErrorMessage("KV09025");
				return;
			}
			plantCd = (String) ((KV0040010Struct)plantCdList.get(0)).getCODE();
			struct.setPLANT_CD(plantCd);
            
			// 年月度(YYYY/MM)取得変数
            String DEL_YM = null;
            List termList = entity.mSYS_MNT_PERIOD.read(conn,struct);
            if (termList == null || termList.size() <= 0){
            	setErrorMessage("KV09026");
            	return;
            }
            // 販売所要計画保存月数
            struct.setSALES_PLAN_TERM(((KV0040010Struct)termList.get(0)).getSALES_PLAN_TERM());
            
            // 販売所要計画保存月数が0の場合は1へ(当月は含めない)
            if( Long.parseLong(struct.getSALES_PLAN_TERM()) <= 0 ){
                struct.setSALES_PLAN_TERM("1");
            }

            // 受注情報保存月数
            struct.setODR_SHIP_TERM(((KV0040010Struct)termList.get(0)).getODR_SHIP_TERM());
            
            // 受注情報保存月数が0の場合は1へ(当月は含めない)
            if( Long.parseLong(struct.getODR_SHIP_TERM()) <= 0 ){
                struct.setODR_SHIP_TERM("1");
            }
            
            // その他売上保存月数
            struct.setSALES_TERM(((KV0040010Struct)termList.get(0)).getSALES_TERM());
            
            // その他売上保存月数が0の場合は1へ(当月は含めない)
            if( Long.parseLong(struct.getSALES_TERM()) <= 0 ){
                struct.setSALES_TERM("1");
            }  
            // EDI保存月数
            struct.setEDI_TERM(((KV0040010Struct)termList.get(0)).getEDI_TERM());
            
            // EDI保存月数が0の場合は1へ(当月は含めない)
            if( Long.parseLong(struct.getEDI_TERM()) <= 0 ){
                struct.setEDI_TERM("1");
            }            
            /***** 削除年月度(YYYY/MM)の算出 (削除起算年月度 - 保管月数) *****/
            // 販売所要計画
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getSALES_PLAN_TERM());
            if(DEL_YM != null){
                struct.setSALES_PLAN_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }
            // 受注情報
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getODR_SHIP_TERM());
            if(DEL_YM != null){
                struct.setODR_SHIP_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }
            // その他売上
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getSALES_TERM());
            if(DEL_YM != null){
                struct.setSALES_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }   
            // EDI
            DEL_YM  = getPastDate(struct.getBUSINESS_CTRL_DATE(), struct.getEDI_TERM());
            if(DEL_YM != null){
                struct.setEDI_TERM_LAST_YM( DEL_YM.substring(0,7) );
            }                
		} catch (FoundationException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		    
		    
/*
 * // データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。 try{
 */
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
//				controlSelect();
			}

/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KV0040");
		logger.entering("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KV0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("do") ) {
				controldo();
			} else if( button.equals("clear") ) {
				controlclear();
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
//			throw new FoundationException("KV0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0040010-E999","CSVの出力処理"));
			throw new FoundationException("KV0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0040010-E999","システム日付の取得処理"));
				throw new FoundationException("KV0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KV0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("KV0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KV0040010Entity entity;
	protected KV0040010Struct struct;
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

		entity = new KV0040010Entity();
		struct = new KV0040010Struct();

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
	 * KV0040010クラスの標準コンストラクタ
	 */
	public KV0040010Control() throws BusinessProcessException, FoundationException
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
				KV0040010Struct key = (KV0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DELETE_RECKON_YM") && key.getDELETE_RECKON_YM() != null) {
					msgKey.setKeyValue("DELETE_RECKON_YM", key.getDELETE_RECKON_YM());
				}
				if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM_LAST_YM") && key.getSALES_PLAN_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("SALES_PLAN_TERM_LAST_YM", key.getSALES_PLAN_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM_LAST_YM") && key.getODR_SHIP_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("ODR_SHIP_TERM_LAST_YM", key.getODR_SHIP_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("SALES_TERM_LAST_YM") && key.getSALES_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("SALES_TERM_LAST_YM", key.getSALES_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("EDI_TERM_LAST_YM") && key.getEDI_TERM_LAST_YM() != null) {
					msgKey.setKeyValue("EDI_TERM_LAST_YM", key.getEDI_TERM_LAST_YM());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_CTRL_DATE") && key.getBUSINESS_CTRL_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_CTRL_DATE", key.getBUSINESS_CTRL_DATE());
				}
				if(msgKeyType.containsKeyColumn("CODE") && key.getCODE() != null) {
					msgKey.setKeyValue("CODE", key.getCODE());
				}
				if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM") && key.getSALES_PLAN_TERM() != null) {
					msgKey.setKeyValue("SALES_PLAN_TERM", key.getSALES_PLAN_TERM());
				}
				if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM") && key.getODR_SHIP_TERM() != null) {
					msgKey.setKeyValue("ODR_SHIP_TERM", key.getODR_SHIP_TERM());
				}
				if(msgKeyType.containsKeyColumn("SALES_TERM") && key.getSALES_TERM() != null) {
					msgKey.setKeyValue("SALES_TERM", key.getSALES_TERM());
				}
				if(msgKeyType.containsKeyColumn("EDI_TERM") && key.getEDI_TERM() != null) {
					msgKey.setKeyValue("EDI_TERM", key.getEDI_TERM());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					KV0040010Struct key = new KV0040010Struct();
					if(msgKeyType.containsKeyColumn("DELETE_RECKON_YM")) {
						key.setDELETE_RECKON_YM(msgKey.getKeyValue("DELETE_RECKON_YM"));
					}
					if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM_LAST_YM")) {
						key.setSALES_PLAN_TERM_LAST_YM(msgKey.getKeyValue("SALES_PLAN_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM_LAST_YM")) {
						key.setODR_SHIP_TERM_LAST_YM(msgKey.getKeyValue("ODR_SHIP_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TERM_LAST_YM")) {
						key.setSALES_TERM_LAST_YM(msgKey.getKeyValue("SALES_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("EDI_TERM_LAST_YM")) {
						key.setEDI_TERM_LAST_YM(msgKey.getKeyValue("EDI_TERM_LAST_YM"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_CTRL_DATE")) {
						key.setBUSINESS_CTRL_DATE(msgKey.getKeyValue("BUSINESS_CTRL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CODE")) {
						key.setCODE(msgKey.getKeyValue("CODE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_PLAN_TERM")) {
						key.setSALES_PLAN_TERM(msgKey.getKeyValue("SALES_PLAN_TERM"));
					}
					if(msgKeyType.containsKeyColumn("ODR_SHIP_TERM")) {
						key.setODR_SHIP_TERM(msgKey.getKeyValue("ODR_SHIP_TERM"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TERM")) {
						key.setSALES_TERM(msgKey.getKeyValue("SALES_TERM"));
					}
					if(msgKeyType.containsKeyColumn("EDI_TERM")) {
						key.setEDI_TERM(msgKey.getKeyValue("EDI_TERM"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
