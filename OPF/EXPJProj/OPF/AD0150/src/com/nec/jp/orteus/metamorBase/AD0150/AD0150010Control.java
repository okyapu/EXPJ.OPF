/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0150/src/com/nec/jp/orteus/metamorBase/AD0150/AD0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0150;

import com.nec.jp.orteus.metamorBase.AD0150.*;
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
import java.text.DateFormat;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import java.io.IOException;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0150010Control クラス
 * 			品目別作業計画CSV取込
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.5 $ $Date: 2016/05/23 08:03:49 $
 *
 */
//}}user_implement_code_header

public class AD0150010Control
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
	public AD0150010Struct getListvalue(int x) { return (AD0150010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0150010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0150010Struct createStruct() { return new AD0150010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0150010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	public AD0150010Struct mItemStruct = new AD0150010Struct();
	public AD0150010Struct jobodrStruct = new AD0150010Struct();
	
	/**全部レコード数**/
	private int _intTotalCount = 0; 
	/**エラーレコード件数**/
	private int _intErrorCount = 0;  
	/**正常レコード件数**/
	private int _intSuccessCount = 0;
	/**ワーニング件数**/
	private int _intWarningCount = 0;
	
	private boolean warningFlg = false;
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;
	
	/** ＣＳＶ項目番号定義 */
	// 品目番号
	private final int CSV_ITEM_CD = 0;
	// 製造納期
	private final int CSV_WORK_ODR_DLV_DATE = 1;
	// 製造着手日
	private final int CSV_OPR_INST_START_DATE = 2;
	// 作業指示数
	private final int CSV_OPR_INST_QTY = 3;
	// 作業区コード
	private final int CSV_WS_CD = 4;
	// 製番
	private final int CSV_JOB_ODR_CD = 5;
	// 備考
	private final int CSV_WORK_IN_PROC_COMMENT = 6;

	// ＣＳＶ取込データ必要項目数(合計)
	private final int CSV_NECESSARY_COLUMN = 7;
	
	// エラーメッセージ
	private ExpjMessage _emsg = null;
	
	// 時刻管理用フラグ
	private String _flgTimeCtrl = null;
	
	/*半角スベース*/
	private String _space = " ";
	
	// 品目別製造納期用
	String WORK_ODR_DLV_DATE_TIME = "0000";	
	//品目別製造着手日用
	String OPR_INST_START_DATE_TIME = "0000";
	
	// 多言語項目取得対応
	private String _locale = CoreTools.getLocale(sysUSER_CD);
	ResourceBundle _resource = CoreTools.getResourceBundle("OrteusUserDic", _locale);

	/** 業務運用日*/
	private String _btmBusinessOprDate;
	
	// コンボボックス定義
	// エラー状態区分
	private ComboStruct _COM_ERR_TYP = null;
	
	/** 日付処理用 */
	DateFormat _df = DateFormat.getDateInstance();
	
	/**
	 * ログメッセージ設定
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message) {
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}
	
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param list メッセージリスト
	 */
	private void setErrorMessage(List list) {
		ExpjMessage emsg;
		if (list != null && !list.isEmpty() && list.size() > 0){
			for(int l = 0; l < list.size(); l++){
				emsg = new ExpjMessage((String)list.get(l));
				msgStruct.addError(emsg);
				sysLog.warning(emsg, getsysUSER_CD());
			}
		}
	}
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列2
	 * @param value3 置換文字列3
	 */
	private void setErrorMessage(String code, String value1, String value2, String value3) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2, value3);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
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
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 * @param value1
	 */
	private void setInfoMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務ロジックのインフォメーション設定処理を切り出して関数化
	 * @param code
	 */
	private void setInfoMessage2(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * 業務ロジックのシステムログ(エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.warning(emsg, getsysUSER_CD());
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param msg1
	 * @param msg2
	 */
	private void setWarningMessage(String code, String msg1, String msg2) {
		ExpjMessage emsg = new ExpjMessage(code, msg1, msg2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
	
	/**
	 * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
	 * @param str 対象文字列
	 * @return Nullの場合はtrue、Nullではない場合はfalse
	 */
	private boolean isNull(String str) {
		if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
			return true;
		}
		return false;
	}
	
	/**
	 * コンボボックスデータから表示説明を取得する
	 * 
	 * @param combo
	 *            コンボボックスデータ
	 * @param value
	 *            コンボボックスデータの値
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
	 * 文字(\)変換、「\」なら、「\」を直前に追加する
	 * 
	 * @param in   文字列
	 * @return	 編集後文字列
	 */
	private String replaceSlashAdd(String in) {
		if (in == null)
			return null;
		StringBuffer buffer = new StringBuffer(in.length() * 2);
		for (int i = 0; i < in.length(); i++) {
			char c = in.charAt(i);
			if (c == '\\')
				buffer.append("\\\\");
			else
				buffer.append(c);
		}
		return buffer.toString();
	}
	
	/**
	 * 文字列長さチェック
	 * 
	 * @param strInString
	 *			入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public int strLengthChk(String strInput) {
		int intLen = 0;
		try {
			byte[] bytstr = strInput.getBytes("SJIS");
			intLen = bytstr.length;
		} catch (Exception e) {
			return 0;
		}
		return intLen;
	}
	
	/**
	 * 禁則文字チェック(「_」「%」「\」)
	 * 
	 * @param str
	 *			文字列
	 * @return 「_」: true 「%」: true 「\」: true その他: false
	 */
	private boolean chkHankaku(String str) {
		CharacterIterator iter = new StringCharacterIterator(str);
		for (char c = iter.first(); c != CharacterIterator.DONE; c = iter.next()) {
			// 「%」 0x0025
			if (c == 0x0025) {
				// 禁則文字!
				return true;
			}
			// 「\」 0x005C
			if (c == 0x005C) {
				// 禁則文字!
				return true;
			}
			// 「_」 0x005F
			if (c == 0x005F) {
				// 禁則文字!
				return true;
			}
		}
		return false;
	}
	
	/*
	 * 日期のチェック
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
	 */
	private boolean checkDate(String dataSource) {
		String flag = "";
		if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{2}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{2}\\/\\d{1}$")) {
			flag = "true";

		} else if (dataSource.matches("^^\\d{4}\\/\\d{1}\\/\\d{2}$")) {
			flag = "true";
		} else {
			flag = "false";
		}
		if ("true".equals(flag)) {
			try {
				SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
				dateFormat.setLenient(false);
				dateFormat.parse(dataSource);
				return true;
			} catch (Exception e) {
				return false;
			}
		} else {
			return false;
		}
	}
	
	/*
	 * 日期のチェック(時刻付け)
	 * 
	 * @param dataSource String
	 * 
	 * @return true or false boolean trueの場合　日期です、　falseの場合、日期ではない
	 */
	private boolean checkTime(String dataSource) {
		dataSource = dataSource.trim();
		if (dataSource.length()!= 4) {
			return false;
		}
		/* 時刻の時間が"00"～"23"の間以外の場合はエラーとする */
		if(Integer.parseInt(dataSource.substring(0,2)) < 0 || Integer.parseInt(dataSource.substring(0,2)) > 23) {
			return false;
		}
		/* 時刻の分が"00"～"59"の間以外の場合はエラーとする */
		if(Integer.parseInt(dataSource.substring(2,4)) < 0 || Integer.parseInt(dataSource.substring(2,4)) > 59) {
			return false;
		}
		return true;
	}
	
	/**
	 * 数値チェック 項目が数値か判断する
	 * 
	 * @param strInString
	 *            入力パラメータ
	 * @return 正常:true / エラー:false
	 */
	public boolean isNumChk(String strInString) {
		// 数値のinputをセット用
		try {
			Double.parseDouble(strInString);
		} catch (Exception e) {
			// 数値ではない場合Exceptionに飛ばして処理
			// falseをセットして処理を抜ける(エラー：数値以外の入力)
			return false;
		}
		if (strInString.indexOf('d') != -1 || strInString.indexOf('D') != -1
				|| strInString.indexOf('f') != -1
				|| strInString.indexOf('F') != -1) {
			return false;
		}
		// trueをセットして処理を抜ける(正常終了)
		return true;
	}
	
	/**
	 * 数値範囲チェック
	 * 
	 * @param strI	ing
	 *            数値
	 * @param integerSize
	 *            整数位数
	 * @param decimalSize
	 *            小数位数
	 * @return 正常:true / エラー:false
	 */
	public boolean isNotInNumRange(String strInString, int integerSize, int decimalSize) {

		String strInputString = null;
		// マイナスの場合
		if (strInString.indexOf("-") == 0) {
			strInputString = strInString.substring(1);
		} else {
			// 正数の場合
			strInputString = strInString;
		}
		int toneFlg = strInputString.indexOf('.');
		if (toneFlg == -1) {
			// 整数の場合
			if (strInputString.length() > integerSize) {
				return false;
			}
		} else {
			if (decimalSize == 0 && toneFlg == integerSize) {
				return false;
			}
			if (strInputString.length() > decimalSize + integerSize + 1) {
				return false;
			}
			// 整数
			String zhstr = strInputString.substring(0, toneFlg);
			// 小数
			String xistr = strInputString.substring(toneFlg + 1, strInputString.length());
			if (zhstr.length() > integerSize || xistr.length() > decimalSize) {
				return false;
			}
		}
		return true;
	}
	
	/**
	* ＣＳＶデータ読込み
	* 
	* @return CSVデータリスト
	*/  
	private List readCsvData() throws ExpjException{

		String[] strsCsvData = null;
		List listCsv = new ArrayList();
		try {
			// CSVデータのアップロード
			strsCsvData = (String []) csvReader.lineRead();
			if (strsCsvData != null) {
				setSyslogConfig("strsCsvData.length:" + strsCsvData.length);
				// データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
				AD0150010Struct structCsv = null;
				Vector v = null;
				for (int i = 0; i < strsCsvData.length; i++) {
					if (strsCsvData[i].length() == 0) {
						// 処理を抜ける。
						break;
					}
					// タイトル行読み飛ばし
					if(i == 0) {
						continue;
					}

					// レコードを項目毎にばらす
					v = csvReader.importCSVLine(strsCsvData[i]);
					if (v != null ) {
						structCsv = new AD0150010Struct();
						if (CSV_NECESSARY_COLUMN == v.size()) {
							// 品目番号　
							structCsv.setITEM_CD(v.get(CSV_ITEM_CD).toString()); 
							// 製造納期
							structCsv.setWORK_ODR_DLV_DATE(v.get(CSV_WORK_ODR_DLV_DATE).toString());
							// 製造着手日
							structCsv.setOPR_INST_START_DATE(v.get(CSV_OPR_INST_START_DATE).toString()); 
							// 作業指示数
							structCsv.setOPR_INST_QTY(v.get(CSV_OPR_INST_QTY).toString());
							// 作業区コード
							structCsv.setWS_CD(v.get(CSV_WS_CD).toString()); 
							// 製番
							structCsv.setJOB_ODR_CD(v.get(CSV_JOB_ODR_CD).toString()); 
							// 備考
							structCsv.setWORK_IN_PROC_COMMENT(v.get(CSV_WORK_IN_PROC_COMMENT).toString()); 
							structCsv.setw_COLUMN_FLG(null);
						} else {
							structCsv.setw_COLUMN_FLG(String.valueOf(v.size()));
						}
						listCsv.add(structCsv);
					} else {
						//ベクター生成失敗エラー
						setSyslogConfig("csvReader.Vector was Failed... line:" + strsCsvData[i]);
						listCsv = null;
						break;
					}
				}
				//  ＣＳＶデータ件数（タイトル行は省く）
				if((listCsv == null) || (listCsv.size() <= 0)) {
					// 取込失敗またはデータなし
					ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
					msgStruct.addError( emsg );
					sysLog.warning(emsg, getsysUSER_CD());
					listCsv = null;
				} else {
					// ＣＳＶ読込み件数ログ表示
					ExpjMessage emsg = new ExpjMessage( "AH00043", String.valueOf(listCsv.size()));
					sysLog.config(emsg, getsysUSER_CD());
				}
			}
		} catch (Exception e) {
			setErrorMessage("AH00042", "0", "0");
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
		return listCsv;
	
	}
	
	/**
	* ＣＳＶ出力データ設定準備
	* 
	* @param target_struct
	*			対象データ情報
	* @param errTyp
	*			エラー区分 
	* @param errlineNo
	*			エラー発生行
	* @param errItemNo
	*			エラー項目番号
	* @param errItem
	*			エラー項目名
	* @param errMsg
	*			エラーメッセージ
	* @param errItemCd
	*			エラー項目コード
	* @return 異常なし true エラー false
	*/  
	
	private boolean csvExport(AD0150010Struct targetStruct, String errTyp, int errlineNo, String errItem, String errMsg, String errItemCd) {
		AD0150010Struct errStruct = new AD0150010Struct();
		// エラー箇所
		ExpjMessage emsg = new ExpjMessage("AA01520", String.valueOf(errlineNo));
		errStruct.setl_ERROR_IN(emsg.getMessage(_locale));
		
		String strErrItem = null;
		
		if (!isNull(errItemCd)) {
			strErrItem = CoreTools.getRBString(errItem, _resource) + "," +CoreTools.getRBString(errItemCd, _resource);
		}else{
			strErrItem = CoreTools.getRBString(errItem, _resource);
		}

		// エラー区分
		errStruct.setl_ERR_TYP(getDisplayName(_COM_ERR_TYP, errTyp));
		// エラー内容
		errStruct.setl_ERR_INFO(errMsg);
		// エラー項目名
		errStruct.setl_ERR_CTR_NM(strErrItem);
		// 品目番号
		errStruct.setl_ERR_ITEM_CD(replaceSlashAdd(targetStruct.getITEM_CD()));	
		// 製造納期
		errStruct.setl_ERR_PRD_DUE_DATE(replaceSlashAdd(targetStruct.getWORK_ODR_DLV_DATE()));
		// 製造着手日
		errStruct.setl_ERR_PRD_START_DATE((replaceSlashAdd(targetStruct.getOPR_INST_START_DATE())));
		// 作業指示日
		errStruct.setl_ERR_OPR_INST_QTY(targetStruct.getOPR_INST_QTY());
		// 作業区コード
		errStruct.setl_ERR_WS_CD(replaceSlashAdd(targetStruct.getWS_CD()));
		// 製番
		errStruct.setl_ERR_JOB_ODR_CD(replaceSlashAdd(targetStruct.getJOB_ODR_CD()));
		// listを追加
		list.add(errStruct);
		return true;
	}
	
	/**
	 * 
	 * @param csvList
	 * @return
	 * @throws BusinessProcessException
	 * @throws FoundationException
	 */
	private boolean checkCsvData(List csvList) throws BusinessProcessException, FoundationException {

		// 全部レコード数
		_intTotalCount = csvList.size();
		
		AD0150010Struct csvStruct = new AD0150010Struct();
		
		// 製造納期
		String strWorkOdrDlv = null;
		
		// 製造着手日
		String strOprInstStart = null;
		
		try {
			for (int i = 0; i < csvList.size(); i++)	{

				csvStruct = (AD0150010Struct)csvList.get(i);
				warningFlg = false;
				
				// CSVファイルの項目数チェックを行う
				if (!isNull(csvStruct.getw_COLUMN_FLG())) {
					if (Integer.parseInt(csvStruct.getw_COLUMN_FLG()) < CSV_NECESSARY_COLUMN) {
						// 項目に不足がある場合
						_emsg = new ExpjMessage("AA01500", csvStruct.getw_COLUMN_FLG());
					} else {
						// 項目が必要数以上の場合
						_emsg = new ExpjMessage("AA01519", csvStruct.getw_COLUMN_FLG());
					}
					csvExport(csvStruct					// 対象データ情報
							, "1"						// エラー区分
							, i + 1						// エラー発生行
							, "Expj.Cmt3099"			// エラー項目名
							, _emsg.getMessage(_locale) // エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}
				// 以下品目番号のチェック
				// 品目番号、NULLの場合
				if (isNull(csvStruct.getITEM_CD())) {
					csvExport(csvStruct						// 対象データ情報
							, "1"							// エラー区分
							, i + 1							// エラー発生行
							, "Expj.ITEM_CD"				// エラー項目名
							, new ExpjMessage("AB00002").getMessage(_locale)		// エラーメッセージ
							, null
							); 
					_intErrorCount++;
					continue;
				}else{
					// 品目番号、文字26桁以上の場合
					if (strLengthChk(csvStruct.getITEM_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ITEM_CD"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 品目番号、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getITEM_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.ITEM_CD"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下製造納期のチェック
				// 製造納期、NULLの場合
				if (isNull(csvStruct.getWORK_ODR_DLV_DATE())) {
					csvExport(csvStruct
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.WORK_ODR_DLV_DATE_3"		// エラー項目名
							 , new ExpjMessage("AD20213").getMessage(_locale)// エラーメッセージ
							, null
							 );	
					_intErrorCount++;
					continue;
				}else{
					// 製造納期、日付型でない場合
					String strDate = csvStruct.getWORK_ODR_DLV_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strWorkOdrDlv = csvStruct.getWORK_ODR_DLV_DATE();
						if (!checkDate(csvStruct.getWORK_ODR_DLV_DATE())) {
							csvExport(csvStruct
									, "1"								// エラー区分
									, i + 1								// エラー行番号
									, "Expj.WORK_ODR_DLV_DATE_3"		// エラー項目名
									, new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									, null
									);	
							_intErrorCount++;
							continue;
						}
					} else {
						strWorkOdrDlv = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setWORK_ODR_DLV_DATE(strWorkOdrDlv+_space+strTime);
						}
						if (!checkDate(strWorkOdrDlv) || !checkTime(strTime)) {
							csvExport(csvStruct
									, "1"								// エラー区分
									, i + 1								// エラー行番号
									, "Expj.WORK_ODR_DLV_DATE_3"		// エラー項目名
									, new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									, null
									);	
							_intErrorCount++;
							continue;
						}
					}
				}
				// 以下製造着手日のチェック
				// 製造着手日、日付型でない場合
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					String strDate = csvStruct.getOPR_INST_START_DATE();
					int dateIdx = strDate.indexOf(_space);
					if (dateIdx < 0) {
						strOprInstStart = csvStruct.getOPR_INST_START_DATE();
						if (!checkDate(csvStruct.getOPR_INST_START_DATE())) {
							csvExport(csvStruct
									 , "1"								// エラー区分
									 , i + 1							// エラー行番号
									 , "Expj.PRD_START_DATE"			// エラー項目名
									 , new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									 , null
									 );	
						_intErrorCount++;
						continue;
						}
					} else {
						strOprInstStart = strDate.substring(0, dateIdx);
						String strTime = strDate.substring(dateIdx+1);
						if ("false".equals(struct.getTIME_CTRL())) {
							strTime = "0000";
							csvStruct.setOPR_INST_START_DATE(strOprInstStart+_space+strTime);
						}
						if (!checkDate(strOprInstStart) || !checkTime(strTime)) {
							csvExport(csvStruct
									 , "1"								// エラー区分
									 , i + 1							// エラー行番号
									 , "Expj.PRD_START_DATE"			// エラー項目名
									 , new ExpjMessage("AA01606").getMessage(_locale)// エラーメッセージ
									 , null
									 );		
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// 以下作業指示数のチェック
				// 作業指示数、NULLの場合
				if (isNull(csvStruct.getOPR_INST_QTY())) {
					csvExport(csvStruct
							 , "1"								// エラー区分
							 , i + 1							// エラー行番号
							 , "Expj.Cmt0634"					// エラー項目名
							 , new ExpjMessage("AD30222").getMessage(_locale)// エラーメッセージ
							 , null 
							);	
					_intErrorCount++;
					continue;
				}else{
					// 作業指示数、数値以外の場合
					if (!isNumChk(csvStruct.getOPR_INST_QTY())) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.Cmt0634"					// エラー項目名
								 , new ExpjMessage("AA01503").getMessage(_locale)// エラーメッセージ
								 , null 
								);	
						_intErrorCount++;
						continue;
					}
					// 作業指示数、0未満の場合
					if (Calculate.compare(csvStruct.getOPR_INST_QTY(), "0") == -1) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.Cmt0634"					// エラー項目名
								 , new ExpjMessage("AD34026").getMessage(_locale)// エラーメッセージ
								 , null
								);	
						_intErrorCount++;
						continue;
					}
					// 作業指示数、整数が14桁以上、または、小数点以下5桁以上の場合
					if (!isNotInNumRange(csvStruct.getOPR_INST_QTY(), 14, 4)) {
						csvExport(csvStruct
								 , "1"								// エラー区分
								 , i + 1							// エラー行番号
								 , "Expj.Cmt0634"					// エラー項目名
								 , new ExpjMessage("AA01501").getMessage(_locale)	// エラーメッセージ
								 , null
								 );
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下作業区コードのチェック
				// 作業区コード、NULLの場合
				if (!isNull(csvStruct.getWS_CD())) {
					// 作業区コード、文字26桁以上の場合
					if (strLengthChk(csvStruct.getWS_CD()) >= 26) {
						csvExport(csvStruct							// 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー発生行
								, "Expj.WS_CD"						// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)			// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 作業区コード、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getWS_CD())) {
						csvExport(csvStruct							// 対象データ情報
								, "1"								// エラー区分
								, i + 1								// エラー発生行
								, "Expj.WS_CD"						// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)			// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下製番のチェック
				if (!isNull(csvStruct.getJOB_ODR_CD())) {
					// 製番、文字26桁以上の場合
					if (strLengthChk(csvStruct.getJOB_ODR_CD()) >= 26) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.Cmt3156"				// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 製番、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getJOB_ODR_CD())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.Cmt3156"				// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// 以下備考のチェック
				if (!isNull(csvStruct.getWORK_IN_PROC_COMMENT())) {
					// 備考、文字8１桁以上の場合
					if (strLengthChk(csvStruct.getWORK_IN_PROC_COMMENT()) >= 81) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.OPR_RSLT_COMMENT_1"		// エラー項目名
								, new ExpjMessage("AA01501").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
					// 備考、禁則文字が入力されていた場合
					if (chkHankaku(csvStruct.getWORK_IN_PROC_COMMENT())) {
						csvExport(csvStruct						// 対象データ情報
								, "1"							// エラー区分
								, i + 1							// エラー発生行
								, "Expj.OPR_RSLT_COMMENT_1"		// エラー項目名
								, new ExpjMessage("AA01524").getMessage(_locale)		// エラーメッセージ
								, null
								); 
						_intErrorCount++;
						continue;
					}
				}
				
				// マスタ整合性チェック
				// 製造着手日
				Date OprInstStartDatetemp = null;
				// 製造納期
				Date workOdrDlvDatetemp = null;				
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					OprInstStartDatetemp = _df.parse(strOprInstStart);
				}
				if (!isNull(csvStruct.getWORK_ODR_DLV_DATE())) {
					workOdrDlvDatetemp = _df.parse(strWorkOdrDlv);
				}
				
				// 「品目番号」 に入力された値が [品目] に存在しない場合
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				if (itemCdList.isEmpty()) {
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.ITEM_CD"										// エラー項目名
							, new ExpjMessage("AD00019").getMessage(_locale)		// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}else{
					mItemStruct = (AD0150010Struct)itemCdList.get(0);
					// 入力された [品目] の “品目手配区分” が	3：欠番 8：擬似品目 の場合
					if ("3".equals(mItemStruct.getMRP_ODR_TYP()) 
							|| "8".equals(mItemStruct.getMRP_ODR_TYP())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.ITEM_CD"										// エラー項目名
								, new ExpjMessage("AD32217").getMessage(_locale)		// エラーメッセージ
								, null);
						_intErrorCount++;
						continue;
					}
				}
				
				// 「製造納期」 に休日が入力された場合
				String strWorkOdrDlvDate = Converter.dateToStr(workOdrDlvDatetemp, "yyyy/MM/dd");
				csvStruct.setDATE(strWorkOdrDlvDate);
				csvStruct.setPLANT_CD(getsysPLANT_CD());
				//品目番号を検索キーとして読込
				List dateList = entity.mSelectM_CAL1.read(conn,csvStruct);
				if (dateList.isEmpty()) {
					//工場コードを検索キーとして読込
					dateList = entity.mselectM_CAL.read(conn,csvStruct);
					if(dateList.isEmpty()){
						//データが存在しない
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
								, new ExpjMessage("KQ00325").getMessage(_locale)		// エラーメッセージ
								, null);
						_intErrorCount++;
						continue;
					}else{
						AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
						if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
									, new ExpjMessage("AD00036").getMessage(_locale)		// エラーメッセージ
									, null);
							_intErrorCount++;
							continue;
						}
					}
				}else{
					AD0150010Struct dateStruct = (AD0150010Struct)dateList.get(0);
					if ("1".equals(dateStruct.getHOLIDAY_FLG())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
								, new ExpjMessage("AD00036").getMessage(_locale)		// エラーメッセージ
								, null);
						_intErrorCount++;
						continue;
					}
				}
				
				// 「製造着手日」 に休日が入力された場合
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					//入力された製造着手日が休日だった場合エラー
					String strOprInstStartDate =
							Converter.dateToStr(OprInstStartDatetemp, "yyyy/MM/dd");
					csvStruct.setDATE(strOprInstStartDate);
					//品目番号を検索キーとして読込
					List dateList2 = entity.mSelectM_CAL1.read(conn,csvStruct);
					if (dateList2.isEmpty()) {
						//工場コードを検索キーとして読込
						dateList2 = entity.mselectM_CAL.read(conn,csvStruct);
						if(dateList2.isEmpty()){
							//データが存在しない
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.PRD_START_DATE"									// エラー項目名
									, new ExpjMessage("KQ00325").getMessage(_locale)		// エラーメッセージ
									, null);
							_intErrorCount++;
							continue;
						} else {
							AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
							if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
								csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.PRD_START_DATE"									// エラー項目名
									, new ExpjMessage("AD00038").getMessage(_locale)		// エラーメッセージ
									, null);
							_intErrorCount++;
							continue;
							}
						}
					}else{
						AD0150010Struct dateStruct2 = (AD0150010Struct)dateList2.get(0);
						if ("1".equals(dateStruct2.getHOLIDAY_FLG())) {
							csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.PRD_START_DATE"									// エラー項目名
								, new ExpjMessage("AD00038").getMessage(_locale)		// エラーメッセージ
								, null);
							_intErrorCount++;
							continue;
						}
					}
					
					// 「製造納期」 ＜ 「製造着手日」の場合
					if (workOdrDlvDatetemp.compareTo(OprInstStartDatetemp) < 0) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
								, new ExpjMessage("AD32156").getMessage(_locale)		// エラーメッセージ
								, "Expj.PRD_START_DATE");
						_intErrorCount++;
						continue;
					}
				}
				
				// 「作業指示数」 が 0の場合
				if ("0".equals(csvStruct.getOPR_INST_QTY())) {
					csvExport(csvStruct
							, "1"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.Cmt0634"										// エラー項目名
							, new ExpjMessage("AD30222").getMessage(_locale)		// エラーメッセージ
							, null);
					_intErrorCount++;
					continue;
				}
				
				// [作業区] に存在しない作業区コードを入力した場合
				if (!isNull(csvStruct.getWS_CD())) {
					List wsCdList = entity.mselectM_WS.read(conn, csvStruct);
					AD0150010Struct wsCdStruct = new AD0150010Struct();
					if (wsCdList.isEmpty()) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.WS_CD"											// エラー項目名
								, new ExpjMessage("AD20029").getMessage(_locale)		// エラーメッセージ
								, null);
						_intErrorCount++;
						continue;
					}else{
						wsCdStruct = (AD0150010Struct)wsCdList.get(0);
						// 「作業区コード」に対する工場コードと「工場コード」が一致しない場合
						if (!this.sysPLANT_CD.equals(wsCdStruct.getvc2PLANT_CD())) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.WS_CD"													// エラー項目名
									, new ExpjMessage("AD00004").getMessage(_locale)
									, null);												// エラーメッセージ
							_intErrorCount++;
							continue;
						}
					}
				}
				
				// [品目].“作業実績区分” が 1：出来高実績 で、
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// 「作業区コード」 が Null の場合
					if (isNull(csvStruct.getWS_CD())) {
						// 作業系列から「作業区コード」 を取得し、取得できない場合
						List procgrpList = entity.mselectM_PROC_GRP.read(conn, csvStruct);
						AD0150010Struct procgrpStruct = new AD0150010Struct();
						if (procgrpList.isEmpty()) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.WS_CD"											// エラー項目名
									, new ExpjMessage("AC00103").getMessage(_locale)		// エラーメッセージ
									, null);
							_intErrorCount++;
							continue;
						}else {
							procgrpStruct = (AD0150010Struct)procgrpList.get(0);
							csvStruct.setWS_CD(procgrpStruct.getWS_CD());
						}
					}
					
				}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
					// [品目].“作業実績区分” が 2：作業指示実績 で
					// 「作業区コード」 が入力されている場合
					if (!isNull(csvStruct.getWS_CD())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.WS_CD"											// エラー項目名
								, new ExpjMessage("AD00227").getMessage(_locale)		// エラーメッセージ
								, null);
						_intErrorCount++;
						continue;
					}
				}
				// 入力された [品目] の “品目手配区分” が1：製番 2：在庫引当型製番の場合
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// CSV項目の製番が入力されない場合、
					if (isNull(csvStruct.getJOB_ODR_CD())) {
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.Cmt3156"										// エラー項目名
								, new ExpjMessage("AD30017").getMessage(_locale)		// エラーメッセージ
								, null);
						_intErrorCount++;
						continue;
					}else {
						// 「製番」 の値で [製番計画] に存在しない場合
						List jobodrList = entity.mselectT_JOB_ODR.read(conn, csvStruct);
						if (jobodrList.isEmpty()) {
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.Cmt3156"										// エラー項目名
									, new ExpjMessage("AB00043").getMessage(_locale)		// エラーメッセージ
									, null);
							_intErrorCount++;
							continue;
						}else {
							jobodrStruct = (AD0150010Struct)jobodrList.get(0);
							// [製番計画].“製番状態区分” が1：所要量計算未対象 or 2：所要量計算対象 or 9：完了 の場合
							if ("1".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "2".equals(jobodrStruct.getJOB_ODR_STS_TYP())
									|| "9".equals(jobodrStruct.getJOB_ODR_STS_TYP())) {
								csvExport(csvStruct
										, "1"													// エラー区分
										, i + 1													// エラー行番号
										, "Expj.Cmt3156"										// エラー項目名
										, new ExpjMessage("AD32616").getMessage(_locale)		// エラーメッセージ
										, null);
								_intErrorCount++;
								continue;
							}
							
							// ユーザが所属する工場コードと、[製番計画] の工場コードが一致しない場合
							if (!jobodrStruct.getPLANT_CD().equals(this.sysPLANT_CD)) {
								csvExport(csvStruct
										, "1"													// エラー区分
										, i + 1													// エラー行番号
										, "Expj.Cmt3156"													// エラー項目名
										, new ExpjMessage("AD00016").getMessage(_locale)		// エラーメッセージ
										, null);
								_intErrorCount++;
								continue;
							}
							
							// [製番計画].“製番納期” ＜ 「製造納期」になる場合
							Date jobOdrDlvDate = _df.parse(jobodrStruct.getJOB_ODR_DLV_DATE());
							if (jobOdrDlvDate.compareTo(workOdrDlvDatetemp) < 0) {
								csvExport(csvStruct
										, "1"													// エラー区分
										, i + 1													// エラー行番号
										, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
										, new ExpjMessage("AD32214").getMessage(_locale)		// エラーメッセージ
										, null);
								_intErrorCount++;
								continue;
							}
						}
					}
				}
				
				// [品目].在庫数量単位区分=1で「作業指示数」に小数が入力された場合
				BigDecimal OprInstQty_up = new BigDecimal(csvStruct.getOPR_INST_QTY());
				if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
					BigDecimal OprInstQty2 = new BigDecimal("0");
					OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
					//切り上げ処理前と後で値が異なっていたら
					//小数が入力されていたと判断しワーニング
					if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) { 
						csvExport(csvStruct
								, "2"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.Cmt0634"										// エラー項目名
								, new ExpjMessage("AD00043").getMessage(_locale)		// エラーメッセージ
								, null);
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
					}
				}
				
				// 「製造着手日」 が Null の場合
				if (isNull(csvStruct.getOPR_INST_START_DATE())){
					csvExport(csvStruct
							, "2"													// エラー区分
							, i + 1													// エラー行番号
							, "Expj.PRD_START_DATE"									// エラー項目名
							, new ExpjMessage("AD34034").getMessage(_locale)		// エラーメッセージ
							, null);
					if(!warningFlg){
						_intWarningCount++;
						warningFlg = true;
					}
				}
				
				// 業務運用日
				Date _btmBusinessOprDatetemp = _df.parse(_btmBusinessOprDate);
				
				// 「製造納期」 に 過去日(業務運用日より過去) を入力された場合
				if (!isNull(csvStruct.getWORK_ODR_DLV_DATE())) {
					
					if (workOdrDlvDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						csvExport(csvStruct
								, "2"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
								, new ExpjMessage("AD34035").getMessage(_locale)		// エラーメッセージ
								, null);
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
					}
				}
				
				// 「製造着手日」 に 過去日(業務運用日より過去) を入力された場合
				if (!isNull(csvStruct.getOPR_INST_START_DATE())) {
					if (OprInstStartDatetemp.compareTo(_btmBusinessOprDatetemp) < 0) {
						csvExport(csvStruct
								, "2"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.PRD_START_DATE"									// エラー項目名
								, new ExpjMessage("AD34036").getMessage(_locale)		// エラーメッセージ
								, null);
						if(!warningFlg){
							_intWarningCount++;
							warningFlg = true;
						}
					}
				}
				
				// 入力された [品目] の “品目手配区分” が1：製番 2：在庫引当型製番の場合
				if (("1".equals(mItemStruct.getMRP_ODR_TYP()) || "2".equals(mItemStruct.getMRP_ODR_TYP()))) {
					// 中間品目：対応する [所要量].“親オーダデマンド番号” が、 Null 以外
					if (!isNull(jobodrStruct.getPARENT_OD_NO())) {
						if (!isNull(jobodrStruct.getDUE_DATE())) {
							Date dueDate = _df.parse(jobodrStruct.getDUE_DATE());
							
							// 中間品の場合で、 [所要量].“要求納期” ＜ 「製造納期」の場合
							if (dueDate.compareTo(workOdrDlvDatetemp) < 0) {
								csvExport(csvStruct
										, "2"													// エラー区分
										, i + 1													// エラー行番号
										, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
										, new ExpjMessage("AD34037").getMessage(_locale)		// エラーメッセージ
										, null);
								if(!warningFlg){
									_intWarningCount++;
									warningFlg = true;
								}
							}
						}
					}
					
					// [所要量].“手配着手日” ＞ 「製造着手日」 の場合
					if (!isNull(jobodrStruct.getODR_START_DATE()) && !isNull(csvStruct.getOPR_INST_START_DATE())) {
						Date odrStartDate = _df.parse(jobodrStruct.getODR_START_DATE());
						if (odrStartDate.compareTo(OprInstStartDatetemp) > 0) {
							csvExport(csvStruct
									, "2"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.PRD_START_DATE"									// エラー項目名
									, new ExpjMessage("AD34038").getMessage(_locale)		// エラーメッセージ
									, null);
							if(!warningFlg){
								_intWarningCount++;
								warningFlg = true;
							}
						}
					}
					
					// 先行手配製番([製番計画]."製番種別"=2)の最上位品目の場合で、
					//「製造納期」＞min（同製番・製番枝番をキーに要求もとのデマンドを検索し、
					// その[所要量]."要求納期"）になる場合
					if ("2".equals(jobodrStruct.getJOB_ODR_TYP())) {
						// 最上位品目(親オーダデマンド番号がNULL)の場合
						if (isNull(jobodrStruct.getPARENT_OD_NO())) {
									
							List jobOdrAlcList = entity.mselectJobOdrAlc.read(conn,csvStruct);
							if (jobOdrAlcList.isEmpty()) {
								//引当データが無ければ、チェックしない。	
							} else {
								AD0150010Struct jobOdrAlcStruct = 
										(AD0150010Struct)jobOdrAlcList.get(0);
								if (!isNull(jobOdrAlcStruct.getDUE_DATE_BY_ALC())) {
									Date datealcDueDate = 
										_df.parse(jobOdrAlcStruct.getDUE_DATE_BY_ALC());
									
									//「製造納期」＞[所要量]."要求納期"
									if (workOdrDlvDatetemp.compareTo(datealcDueDate) > 0) {
										//引当納期に矛盾があります。
										csvExport(csvStruct
												, "2"													// エラー区分
												, i + 1													// エラー行番号
												, "Expj.WORK_ODR_DLV_DATE_3"							// エラー項目名
												, new ExpjMessage("AD00044").getMessage(_locale)		// エラーメッセージ
												, null);
										if(!warningFlg){
											_intWarningCount++;
											warningFlg = true;
										}
									}
								}
							}
						}
					}
//					// CSV項目の製番が入力された場合、
//					// 中間品目：対応する [所要量].“親オーダデマンド番号” が、 Null 以外
//					if (!isNull(jobodrStruct.getPARENT_OD_NO())) {
//						
//						// 中間品目の場合で、 「作業指示数」 が変更された場合
//						if (!isNull(csvStruct.getOPR_INST_QTY())) {
//							csvExport(csvStruct
//									, "2"													// エラー区分
//									, i + 1													// エラー行番号
//									, "Expj.Cmt0634"										// エラー項目名
//									, new ExpjMessage("AD00045").getMessage(_locale)		// エラーメッセージ
//									, null);
//							if(!warningFlg){
//								_intWarningCount++;
//								warningFlg = true;
//							}
//						}
//					}
					
//					// CSV項目の製番が入力された場合、
//					List tempList = entity.mCheckChild.read(conn, jobodrStruct);
//					if (tempList.isEmpty()) {
//						// 下位部品データが無ければ、チェックしない。
//					} else {
//						// 下位部品が存在する場合で、 「作業指示数」 「製造着手日」 のいずれかが変更された場合
//						if (!isNull(csvStruct.getOPR_INST_QTY()) || !isNull(csvStruct.getOPR_INST_START_DATE())) {
//							csvExport(csvStruct
//									, "2"													// エラー区分
//									, i + 1													// エラー行番号
//									, "Expj.Cmt0634"										// エラー項目名
//									, new ExpjMessage("AD00047").getMessage(_locale)		// エラーメッセージ
//									, "Expj.PRD_START_DATE");
//							if(!warningFlg){
//								_intWarningCount++;
//								warningFlg = true;
//							}
//						}
//					}
				}
			}
			_intSuccessCount = _intTotalCount - _intErrorCount - _intWarningCount;
			if (_intErrorCount > 0) {
				return false;
			} else {
				return true;
			}
		} catch (Exception e) {
			 ExpjMessage emsg = new ExpjMessage("ZZ01106");
			 sysLog.severe(emsg, getsysUSER_CD());
			 ExpjException ee = new ExpjException(e, emsg);
			 throw ee;
		}
	}
	
	/**
	 * CSVフェイル内容は、登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertCsvDate(List csvList) throws FoundationException, ExpjException {
		try {
			boolean rtnFlg = true;
			conn.beginTransWeb();
			for (int i = 0; i < csvList.size(); i++) {
				warningFlg = false;
				AD0150010Struct csvStruct = (AD0150010Struct)csvList.get(i);
				csvStruct.setsSysdate(struct.getsSysdate());
				csvStruct.setsUser_ID(struct.getsUser_ID());
				// [パラメータ].”名前”=’TIME_CTRL’の[パラメータ].”値”=’true’なら
				if ("true".equals(_flgTimeCtrl)) {
					WORK_ODR_DLV_DATE_TIME = "2359";
					OPR_INST_START_DATE_TIME = "2359";
				} else {
					WORK_ODR_DLV_DATE_TIME = "0000";
					OPR_INST_START_DATE_TIME = "0000";
				}
				
				// [ＣＳＶデータ].”製造着手日”がNULLの場合：製造納期により、算出
				if (isNull(csvStruct.getOPR_INST_START_DATE())) {
					//着手日の自動計算
					List ltList = entity.mselectLT.read(conn,csvStruct);
					if (ltList.isEmpty()) {
						//データが存在しない
						csvExport(csvStruct
								, "1"													// エラー区分
								, i + 1													// エラー行番号
								, "Expj.PRD_START_DATE"									// エラー項目名
								, new ExpjMessage("ZZ01101").getMessage(_locale)		// エラーメッセージ
								, null);
						_intErrorCount++;
						setReadStatus(ERROR);
						return false;
					} else {
						AD0150010Struct ltStruct = (AD0150010Struct)ltList.get(0);
						int fixed = new Integer(ltStruct.getFIXED_LT()).intValue();
						int prop = new Integer(ltStruct.getPROP_LT()).intValue();
						int safety = new Integer(ltStruct.getSAFETY_LT()).intValue();
						int prop_lot = new Integer(ltStruct.getPROP_LOT_SIZE()).intValue();
						//作業指示数を切り上げ処理する
						BigDecimal StrOprInstQty = new BigDecimal(csvStruct.getOPR_INST_QTY());
						BigDecimal OprInstQty = StrOprInstQty.setScale(0, BigDecimal.ROUND_UP);
						String strOprInstQty = OprInstQty.toString();
						//品目のリードタイム
						int lt = 
								0 - (fixed + (Integer.parseInt(strOprInstQty)/prop_lot) * prop + safety);
						Date WorkOdrDlvDate = 
								Converter.strToDate(csvStruct.getWORK_ODR_DLV_DATE().substring(0,10), "yyyy/MM/dd");
						//着手日を自動計算する
						WorkDay OprInstStartDate = 
								new WorkDay(
									this.sysUSER_CD, 
									business.getBusinessCd(), 
									this.sysPLANT_CD,
									csvStruct.getITEM_CD(),
									WorkOdrDlvDate,lt,
									true);
						String StrOprInstStartDate = 
								Converter.dateToStr(OprInstStartDate.calcDate(), "yyyy/MM/dd");
						if(StrOprInstStartDate == null){
							// 業務日付の取得に失敗しました。
							csvExport(csvStruct
									, "1"													// エラー区分
									, i + 1													// エラー行番号
									, "Expj.PRD_START_DATE"									// エラー項目名
									, new ExpjMessage("KQ00026").getMessage(_locale)		// エラーメッセージ
									, null);
							_intErrorCount++;
							setReadStatus(ERROR);
							return false;
						} else {
							if (csvStruct.getWORK_ODR_DLV_DATE().length()>10){
								csvStruct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10)+_space+csvStruct.getWORK_ODR_DLV_DATE().substring(11));
							} else {
								csvStruct.setOPR_INST_START_DATE(StrOprInstStartDate.substring(0,10));
							}
						}
					}
				}
				
				// 所要量のオーダ情報の追加、所要量の下位デマンドの追加
				String odNoString;
				CommonOd od = 
						new CommonOd(conn,
							this.sysPLANT_CD,
							this.sysUSER_CD,
							this.sp.getProcId());
				// 日付型の転換
				if (csvStruct.getWORK_ODR_DLV_DATE().length()<=10) {
					csvStruct.setWORK_ODR_DLV_DATE(csvStruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
				}
				if (csvStruct.getOPR_INST_START_DATE().length()<=10) {
					csvStruct.setOPR_INST_START_DATE(csvStruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
				}				
				// オーダーデマンド番号をセットする
				odNoString = 
				od.addOdInfo(csvStruct.getITEM_CD(),
					Converter.strToDate(
							csvStruct.getWORK_ODR_DLV_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
					Converter.strToDate(
							csvStruct.getOPR_INST_START_DATE(), Converter.SLASH_DATE_HOUR_MINUTE),
					Double.parseDouble(csvStruct.getOPR_INST_QTY()),
					3);
				
				csvStruct.setOD_NO(odNoString);
				
				// [品目].“作業実績区分”が、1：出来高実績 の場合、[作業指示伝票] の追加を行う。
				List itemCdList = entity.mselectItem_CD.read(conn, csvStruct);
				mItemStruct = (AD0150010Struct)itemCdList.get(0);
				if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
					rtnFlg = insertT_OPR_INST_SLIP (csvStruct,i);
					if(!rtnFlg) {
						conn.rollback();
						return false;
					}
				}
				
				// [品目別仕掛]の追加を行う
				rtnFlg = insertT_WORK_IN_PROC_BY_ITEM (csvStruct,i);
				if(!rtnFlg) {
					conn.rollback();
					return false;
				}
			}
			conn.commit();
			return true;
		} catch (Exception e) {
			conn.rollback();;
			throw new ExpjException(e);
		}
		
	}
	
	/**
	 * CSVフェイル内容は、作業指示伝票登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_OPR_INST_SLIP (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getOPR_INST_CD())) {
				// 作業指示番号採番処理を行う。
				CollectNumber OPR_INST_CD = 
						new CollectNumber(CollectNumber.INST_CD,
							this.sysUSER_CD, 
							this.sp.getProcId(), 
							this.sysPLANT_CD);
				String strOprInstCd = OPR_INST_CD.getNo();
				if (isNull(strOprInstCd)) {
					//採番結果がない
					csvExport(adstruct					// 対象データ情報
							, "1"						// エラー区分
							, j + 1						// エラー発生行
							,null
							,new ExpjMessage("ZZ01106").getMessage(_locale)
							,null);	// エラーメッセージ
					_intErrorCount++;
					setReadStatus(ERROR);
					return false;
				} else {
					adstruct.setOPR_INST_CD(strOprInstCd);
				}
			}
			// 作業指示番号発生区分
			adstruct.setOPR_INST_CD_GNR_TYP("1");
			// 作業指示伝票発行済みフラグ
			adstruct.setOPR_INST_SLIP_ISS_FLG("0");
			// 工場コード
			adstruct.setPLANT_CD(sysPLANT_CD);
			
			// [作業指示伝票]への追加内容
			entity.minsertT_OPR_INST_SLIP.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
	
	/**
	 * CSVフェイル内容は、品目別仕掛登録処理
	 * @param csvList
	 * @return
	 * @throws FoundationException 
	 */
	private boolean insertT_WORK_IN_PROC_BY_ITEM (AD0150010Struct adstruct ,int j) throws ExpjException {
		try {
			if (isNull(adstruct.getWORK_ODR_CD())) {
				// 作業計画番号採番処理を行う。
				CollectNumber OPR_INST_CD = 
						new CollectNumber(CollectNumber.ODR_CD,
							this.sysUSER_CD, 
							this.sp.getProcId(), 
							this.sysPLANT_CD);
				String strWorkOdrCd = OPR_INST_CD.getNo();
				if (isNull(strWorkOdrCd)) {
					//採番結果がない
					csvExport(adstruct					// 対象データ情報
							, "1"						// エラー区分
							, j + 1						// エラー発生行
							,null
							,new ExpjMessage("ZZ01106").getMessage(_locale)
							,null);	// エラーメッセージ
					_intErrorCount++;
					setReadStatus(ERROR);
					return false;
				} else {
					adstruct.setWORK_ODR_CD(strWorkOdrCd);
				}
			}
			// 日付型の転換
			if (adstruct.getWORK_ODR_DLV_DATE().length()<=10) {
				// 作業製造納期
				adstruct.setWORK_ODR_DLV_DATE(adstruct.getWORK_ODR_DLV_DATE() + " " + WORK_ODR_DLV_DATE_TIME);
			}
			if (adstruct.getOPR_INST_START_DATE().length()<=10) {
				// 作業製造着手日
				adstruct.setOPR_INST_START_DATE(adstruct.getOPR_INST_START_DATE() + " " + OPR_INST_START_DATE_TIME);
			}
			
			// 作業指示数
			// [品目].在庫数量単位区分=1で「作業指示数」に小数が入力された場合、
			// 切り上げ処理をする
			BigDecimal OprInstQty_up = new BigDecimal(adstruct.getOPR_INST_QTY());
			if ("1".equals(mItemStruct.getUNIT_QTY_TYP())) {
				BigDecimal OprInstQty2 = new BigDecimal("0");
				OprInstQty2 = OprInstQty_up.setScale(0,BigDecimal.ROUND_UP);
				//切り上げ処理前と後で値が異なっていたら
				//小数が入力されていたと判断しワーニング
				if ( OprInstQty_up.doubleValue() != OprInstQty2.doubleValue()) {
					//	品目が整数管理品の場合、切上げを行う
					OprInstQty_up = OprInstQty_up.setScale(0, BigDecimal.ROUND_UP);
				}
			}
			adstruct.setOPR_INST_QTY(OprInstQty_up.toString());
			// 品目別作業状態区分
			adstruct.setWORK_STS_TYP("1");
			// 作業系列展開済フラグ
			adstruct.setPROC_EXPLOSION_FLG("0");
			
			// 品目別作業実績区分
			adstruct.setOPR_RSLT_TYP(mItemStruct.getOPR_RSLT_TYP());
			
			// 作業指示番号
			// [品目].“作業実績区分”が、1：出来高実績 の場合、「作業指示番号」
			if ("1".equals(mItemStruct.getOPR_RSLT_TYP())) {
				
			}else if ("2".equals(mItemStruct.getOPR_RSLT_TYP())) {
				// 2：作業指示実績　の場合、Null
				adstruct.setOPR_INST_CD("");
			}
			// 工場コード
			adstruct.setPLANT_CD(sysPLANT_CD);
			
			// [品目別仕掛]への追加内容
			entity.minsertT_WORK_IN_PROC_BY_ITEM.create(conn, adstruct);
			return true;
		}catch(Exception e) {
			throw new ExpjException(e);
		}
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ユーザ定義のコードを記述してください
			try {
				// 全部レコード数
				_intTotalCount = 0; 
				// エラーレコード件数
				_intErrorCount = 0;  
				// 正常レコード件数
				_intSuccessCount = 0;
				// ワーニング件数
				_intWarningCount = 0;
				// 画面表示用リストクリア
				if (list == null) {
					list = new ArrayList();
				} else {
					list.clear();
				}
				// ＣＳＶデータ取得
				List listCsv = null;
				listCsv = readCsvData();
				
				// ＣＳＶデータ取得成功
				if (listCsv != null) {
					
					// ＣＳＶ項目のチェック＆＆ ＣＳＶ項目の登録
					if (checkCsvData(listCsv)) {
						
						// 登録処理
						if(insertCsvDate(listCsv)) {
							// エラーがない場合
							if (_intWarningCount== 0) {
								// 正常に取り込みました。（正常 {0}件）
								setInfoMessage("AA01514", String.valueOf(_intSuccessCount));
							} else {
								// 取り込みましたが、ワーニングがあります。（正常 {0}件、ワーニング {1}件）
								setWarningMessage("AA01515", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount));
							}
						} else {
							// 登録時にエラーが発生しました。指定されたCSVのデータは登録されませんでした。
							setErrorMessage("AD34033");
						}
					} else {
						// エラーがある場合
						// エラーデータがあるため取り込みませんでした。（正常 {0}件、ワーニング {1}件、エラー {2}件）
						setErrorMessage("AA01516", String.valueOf(_intSuccessCount), String.valueOf(_intWarningCount), String.valueOf(_intErrorCount));
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
				setErrorMessage("ZZ01106");
				setReadStatus(ERROR);
			}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
			// TODO: ユーザ定義のコードを記述してください
			// CSV出力部品を設定
				csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
				AD0150010Struct errorStruct = null;
				List csv = new ArrayList();	// CSV情報
				// CSVヘッダ行をCSV情報に追加
				String[] title = {
						 "Expj.Cmt3094"							// エラー箇所
						,"Expj.Cmt3095"							// エラー区分
						,"Expj.Cmt3098"							// エラー内容
						,"Expj.Cmt6220"							// エラー項目
						,"Expj.ITEM_CD"							// 品目番号
						,"Expj.WORK_ODR_DLV_DATE_3"				// 製造納期
						,"Expj.PRD_START_DATE"					// 製造着手日
						,"Expj.Cmt0634"							// 作業指示数
						,"Expj.WS_CD"							// 作業区コード
						,"Expj.Cmt3156"							// 製番
				};
				csv.add(title);
				// [画面].一覧部のエラー情報をCSV情報に追加
				for (int i = 0; i < list.size(); i++) {
					errorStruct = (AD0150010Struct)list.get(i);
					String[] data = {
							 errorStruct.getl_ERROR_IN()
							,errorStruct.getl_ERR_TYP()
							,errorStruct.getl_ERR_INFO()
							,errorStruct.getl_ERR_CTR_NM()
							,errorStruct.getl_ERR_ITEM_CD()
							,errorStruct.getl_ERR_PRD_DUE_DATE()
							,errorStruct.getl_ERR_PRD_START_DATE()
							,errorStruct.getl_ERR_OPR_INST_QTY()
							,errorStruct.getl_ERR_WS_CD()
							,errorStruct.getl_ERR_JOB_ODR_CD()
					};
					csv.add(data);
				}
				
				// CSVファイルを作成
				csvWriter.write(csv, CoreTools.getLocale(struct.getsUser_ID()), true);
				// CSVファイルをクライアントに出力
				struct.setDOWNLOAD_FILE(getCsvWriter().getFilePath());
				
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
			setList(null);
			// 検索状態を「初期状態」に設定
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ユーザ定義のコードを記述してください
		    try{
		    	setReadStatus(INITIAL); 
		        // バッチ処理クラスのmain引数
		        String strBatchClassName = null;		// 呼び出し先クラス名
		        String strBatchProcessingTyp = null;	// バッチ処理区分
		        String strProgramId = null;			    // 業務名（AD0080B001）
		        String strUserId = null;				// ユーザID
		        String strPlantCd = null;				// 工場コード
		        String strCsvTakeTyp =null;             // CSV取込方式
		        // 引数セット
		        strBatchClassName = "com.nec.jp.orteus.metamorBase.AD0150.AD0150B001.mainAD0150B001";
		        strBatchProcessingTyp = "2";					  // 2: 自動運転しない（夜間バッチなし）
		        strProgramId = "AD0150B001";					  // 業務名（AD0150B001）
		        strUserId = getsysUSER_CD();					  // ユーザID
		        strPlantCd = getsysPLANT_CD();					  // 工場コード
		        strCsvTakeTyp ="1";                               // CSV取込方式 = 1:固定ファイル取込
		        // バッチ処理を実行する -------------------------------------------
		        ResourceBundle bundle = SystemConfig.getBundle();
		        String javaPath = SystemConfig.getProperty("JAVA_PATH", bundle);
		        if(javaPath == null){
		            //システム既定値ファイルからの情報取得に失敗しました(ＪＶＭパス)
		            setErrorMessage("ZZ09010");
		            return;
		           }
		        String ClassPath = SystemConfig.getProperty("CLASS_PATH", bundle);
		        if(ClassPath == null){
		        	//システム既定値ファイルからの情報取得に失敗しました(クラスパス)
		        	setErrorMessage("ZZ09012");
		            return;
		        }
		        String batchPath = SystemConfig.getProperty("BATCH_PATH", bundle);
		        if(batchPath == null){        	
		            //システム既定値ファイルからの情報取得に失敗しました(バッチ起動設定)        	
		        	setErrorMessage("ZZ09011");
		            return;
		        }
		    
		        String heapSize = SystemConfig.getProperty("HIGH_HEAP_SIZE",bundle); 
		        if (heapSize == null) {
		            //システム既定値ファイルからの情報取得に失敗しました(バッチヒープサイズ設定)
		        	setErrorMessage("ZZ09017");
		            return;
		           }
		        List buffer = new ArrayList();
				buffer.add(javaPath);            // ＪＶＭ
				buffer.add("-cp");
				buffer.add(ClassPath);           // Java ClassPath
				buffer.add("-Dcom.nec.jp.orteus.util.logging.config.file="+batchPath); // 起動設定
				buffer.add(strBatchClassName);                       // 呼び出し先クラス
				buffer.add(strBatchProcessingTyp);                   // バッチ処理区分
				buffer.add(strUserId);                               // ユーザID
				buffer.add(strProgramId);                            // 業務ID
				buffer.add(strPlantCd);                              // 工場コード
				buffer.add(strCsvTakeTyp);                           // CSV取込方式		
				try {
					// バッチ処理実行
					Runtime runtime = Runtime.getRuntime();
					runtime.exec((String[])buffer.toArray(new String[buffer.size()]));
				} catch (IOException e) {	        	
			        // バッチ呼び出し失敗の場合、画面メッセージを表示する。
					setErrorMessage("ZZ09014");
					return;
		        }	    
		        // バッチ呼び出し成功の場合、画面メッセージを表示する。
				setInfoMessage2("ZZ09013");
		    }catch(Exception e){			
				e.printStackTrace();
				setErrorMessage("ZZ01106");
			
			}
		    	
                //}}user_implement_dev:<controlExecute>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			// 工場コードをセットする。
			this.struct.setPLANT_CD(this.sysPLANT_CD);
			
			// 業務運用日取得
			try {
				DateCtrlStruct dateCtrl = DateCtrlControl.getData(conn, getsysPLANT_CD());
				_btmBusinessOprDate = dateCtrl.getBUSINESS_OPR_DATE();
			} catch(DataNotFoundException e) {
				ExpjMessage emsg = new ExpjMessage("AC34080" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				setReadStatus(ERROR);
				throw ee;
			}
			
			//時刻管理パラメータ取得
			List listTimeCtrl = entity.mselectTIME_CTRL.read(conn,struct);
			if(listTimeCtrl.isEmpty()){
				struct.setTIME_CTRL("false");
				_flgTimeCtrl = "false";
			}else{
				struct.setTIME_CTRL(((AD0150010Struct)listTimeCtrl.get(0)).getTIME_CTRL());
				_flgTimeCtrl = struct.getTIME_CTRL();
			}
			
			// コンボボックスデータ用意
	 		ComboBox combBox = new ComboBox(conn, sysUSER_CD);
			// コンボボックスのデータを取得
			_COM_ERR_TYP = combBox.getData("ERR_TYP");

		} catch(SQLException e) {
			e.printStackTrace();
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0150");
		logger.entering("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Execute") ) {
				controlExecute();
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
//			throw new FoundationException("AD0150010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0150010-E999","CSVの出力処理"));
			throw new FoundationException("AD0150010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0150010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0150010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0150010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0150010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0150010Entity entity;
	protected AD0150010Struct struct;
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

		entity = new AD0150010Entity();
		struct = new AD0150010Struct();

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
	 * AD0150010クラスの標準コンストラクタ
	 */
	public AD0150010Control() throws BusinessProcessException, FoundationException
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
				AD0150010Struct key = (AD0150010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERROR_IN") && key.getl_ERROR_IN() != null) {
					msgKey.setKeyValue("l_ERROR_IN", key.getl_ERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_TYP") && key.getl_ERR_TYP() != null) {
					msgKey.setKeyValue("l_ERR_TYP", key.getl_ERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM") && key.getl_ERR_CTR_NM() != null) {
					msgKey.setKeyValue("l_ERR_CTR_NM", key.getl_ERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD") && key.getl_ERR_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ERR_ITEM_CD", key.getl_ERR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PRD_DUE_DATE") && key.getl_ERR_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_ERR_PRD_DUE_DATE", key.getl_ERR_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_PRD_START_DATE") && key.getl_ERR_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_ERR_PRD_START_DATE", key.getl_ERR_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_OPR_INST_QTY") && key.getl_ERR_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("l_ERR_OPR_INST_QTY", key.getl_ERR_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_WS_CD") && key.getl_ERR_WS_CD() != null) {
					msgKey.setKeyValue("l_ERR_WS_CD", key.getl_ERR_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD") && key.getl_ERR_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_ERR_JOB_ODR_CD", key.getl_ERR_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP") && key.getOPR_INST_CD_GNR_TYP() != null) {
					msgKey.setKeyValue("OPR_INST_CD_GNR_TYP", key.getOPR_INST_CD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE") && key.getOPR_INST_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_DATE", key.getOPR_INST_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG") && key.getOPR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("OPR_INST_SLIP_ISS_FLG", key.getOPR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG") && key.getPROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG", key.getPROC_EXPLOSION_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_DATE") && key.getOPR_INST_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_DATE", key.getOPR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE") && key.getWORK_CMPLT_DATE() != null) {
					msgKey.setKeyValue("WORK_CMPLT_DATE", key.getWORK_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT") && key.getWORK_IN_PROC_COMMENT() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_COMMENT", key.getWORK_IN_PROC_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("HOLIDAY_FLG") && key.getHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("HOLIDAY_FLG", key.getHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("DATE") && key.getDATE() != null) {
					msgKey.setKeyValue("DATE", key.getDATE());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("vc2PLANT_CD") && key.getvc2PLANT_CD() != null) {
					msgKey.setKeyValue("vc2PLANT_CD", key.getvc2PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("count_JOB_ODR_ALC_CD") && key.getcount_JOB_ODR_ALC_CD() != null) {
					msgKey.setKeyValue("count_JOB_ODR_ALC_CD", key.getcount_JOB_ODR_ALC_CD());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC") && key.getDUE_DATE_BY_ALC() != null) {
					msgKey.setKeyValue("DUE_DATE_BY_ALC", key.getDUE_DATE_BY_ALC());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC_TIME") && key.getDUE_DATE_BY_ALC_TIME() != null) {
					msgKey.setKeyValue("DUE_DATE_BY_ALC_TIME", key.getDUE_DATE_BY_ALC_TIME());
				}
				if(msgKeyType.containsKeyColumn("count_OD_NO") && key.getcount_OD_NO() != null) {
					msgKey.setKeyValue("count_OD_NO", key.getcount_OD_NO());
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
					AD0150010Struct key = new AD0150010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_TYP")) {
						key.setl_ERR_TYP(msgKey.getKeyValue("l_ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_CTR_NM")) {
						key.setl_ERR_CTR_NM(msgKey.getKeyValue("l_ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_ITEM_CD")) {
						key.setl_ERR_ITEM_CD(msgKey.getKeyValue("l_ERR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PRD_DUE_DATE")) {
						key.setl_ERR_PRD_DUE_DATE(msgKey.getKeyValue("l_ERR_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_PRD_START_DATE")) {
						key.setl_ERR_PRD_START_DATE(msgKey.getKeyValue("l_ERR_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_OPR_INST_QTY")) {
						key.setl_ERR_OPR_INST_QTY(msgKey.getKeyValue("l_ERR_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_WS_CD")) {
						key.setl_ERR_WS_CD(msgKey.getKeyValue("l_ERR_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_JOB_ODR_CD")) {
						key.setl_ERR_JOB_ODR_CD(msgKey.getKeyValue("l_ERR_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD_GNR_TYP")) {
						key.setOPR_INST_CD_GNR_TYP(msgKey.getKeyValue("OPR_INST_CD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_DATE")) {
						key.setOPR_INST_SLIP_ISS_DATE(msgKey.getKeyValue("OPR_INST_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_SLIP_ISS_FLG")) {
						key.setOPR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("OPR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG")) {
						key.setPROC_EXPLOSION_FLG(msgKey.getKeyValue("PROC_EXPLOSION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_DATE")) {
						key.setOPR_INST_DATE(msgKey.getKeyValue("OPR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_CMPLT_DATE")) {
						key.setWORK_CMPLT_DATE(msgKey.getKeyValue("WORK_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_COMMENT")) {
						key.setWORK_IN_PROC_COMMENT(msgKey.getKeyValue("WORK_IN_PROC_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("HOLIDAY_FLG")) {
						key.setHOLIDAY_FLG(msgKey.getKeyValue("HOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DATE")) {
						key.setDATE(msgKey.getKeyValue("DATE"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("vc2PLANT_CD")) {
						key.setvc2PLANT_CD(msgKey.getKeyValue("vc2PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("count_JOB_ODR_ALC_CD")) {
						key.setcount_JOB_ODR_ALC_CD(msgKey.getKeyValue("count_JOB_ODR_ALC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC")) {
						key.setDUE_DATE_BY_ALC(msgKey.getKeyValue("DUE_DATE_BY_ALC"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE_BY_ALC_TIME")) {
						key.setDUE_DATE_BY_ALC_TIME(msgKey.getKeyValue("DUE_DATE_BY_ALC_TIME"));
					}
					if(msgKeyType.containsKeyColumn("count_OD_NO")) {
						key.setcount_OD_NO(msgKey.getKeyValue("count_OD_NO"));
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
