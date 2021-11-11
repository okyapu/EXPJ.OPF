/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0080/src/com/nec/jp/orteus/metamorBase/AD0080/AD0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0080;

import com.nec.jp.orteus.metamorBase.AD0080.*;
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
import com.nec.jp.orteus.metamorBase.common06.util.formatCheck;
import com.nec.jp.orteus.metamorBase.common06.util.stringUtil;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.15 $ $Date: 2015/12/22 09:52:44 $
 *
 */
//}}user_implement_code_header

public class AD0080010Control
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
	public AD0080010Struct getListvalue(int x) { return (AD0080010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0080010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0080010Struct createStruct() { return new AD0080010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0080010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
    //受入実績入力テータCSVファイルの列インデックス
	private final int OprInstCdNo           = 0;			//作業指示番号No
	private final int ItemCdNo              = 1;			//品目番号No
	private final int AcptQtyNo             = 2;			//良品数No
	private final int DefectQtyNo           = 3;			//不良数No
	private final int OprDateNo             = 4;			//作業日No
	private final int WhCdNo                = 5;			//保管区コードNo
	private final int WsCdNo                = 6;			//作業区コードNo
	private final int OprRsltPersonNo       = 7;			//作業担当者No
	private final int OprRsltCommentNo      = 8;			//備考No
	private final int OprTimeImeUnitTypNo   = 9;			//作業時間単位区分No
	private final int PreArrangementTimeNo  = 10;			//前段取時間No
	private final int PostArrangementTimeNo = 11;			//後段取時間No
	private final int OprTimeNo             = 12;			//作業時間No
	private final int CessationTimeNo       = 13;			//停止時間No
	private final int CessationCauseNo      = 14;			//停止理由No
	private final int LotNoNo               = 15;			//在庫ロット番号    
	private final int VendLotNoNo           = 16;			//メーカロット番号
	private final int DefectCauseCd1No      = 17;			//不良理由コード1No
	private final int DefectQty1No          = 18;			//不良数1No
	private final int DefectComment1No      = 19;			//不良備考1No
	private final int DefectCauseCd2No      = 20;			//不良理由コード2No
	private final int DefectQty2No          = 21;			//不良数2No
	private final int DefectComment2No      = 22;			//不良備考2No
	private final int DefectCauseCd3No      = 23;			//不良理由コード3No
	private final int DefectQty3No          = 24;			//不良数3No
	private final int DefectComment3No      = 25;			//不良備考3No
	private final int DefectCauseCd4No      = 26;			//不良理由コード4No
	private final int DefectQty4No          = 27;			//不良数4No
	private final int DefectComment4No      = 28;			//不良備考4No
	private final int DefectCauseCd5No      = 29;			//不良理由コード5No
	private final int DefectQty5No          = 30;			//不良数5No
	private final int DefectComment5No      = 31;			//不良備考5No
	private final int OprCmpltFlgNo         = 32;			//作業完了フラグ
	private final int ChildRsltUpdateFlgNo  = 33;			//子品目一括更新フラグ
	
    String locale = null;
    //	CSVファイルの項目数
    private final int ColSize = 34;
	//エラー一覧リスト
	private ArrayList _errList = new ArrayList(0);
	// 業務運用日
	private String businessDate = null;
    /**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setInfoMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno);
     msgStruct.addInfo( emsg );
     sysLog.info(emsg, getsysUSER_CD());
    }
    
    /**
     * 情報メッセージ設定
     * @param メッセージ番号
	 * @param value1 置換文字列１
     * @param 出力メッセージ
     */
    private void setInfoMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1);
     msgStruct.addInfo( emsg );
     sysLog.info(emsg, getsysUSER_CD());
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value1 置換文字列2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1,value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}
    
    /**
     * 警告メッセージ設定
     * @param メッセージ番号
	 * @param value1 置換文字列１
     * @param 出力メッセージ
     */
    private void setWarnMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1);
     msgStruct.addWarn( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
    }
    /**
     * エラー一覧リストに追加する
     * 
     * @param msgno エラーメッセージ番号
     * @param indexRow エラー項目行
     * @param indexCol　エラー項目Col
     */
    private void addErrorList( int indexRow,int  indexCol , String msgno ){
    	ExpjMessage exmsg = new ExpjMessage( msgno );
    	addErrorList( indexRow ,indexCol , exmsg);
    }
    /**
     * エラー一覧リストに追加する
     * 
     * @param exmsg エラーメッセージ
     * @param indexRow エラー項目行
     * @param indexCol　エラー項目Col
     */
    private void addErrorList( int indexRow ,int indexCol , ExpjMessage exmsg ){    	
    	AD0080010Struct s = new AD0080010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AH00045" , ""+indexRow , ""+(indexCol+1) );
    	
    	s.setl_ERROR_IN(exmsgline.getMessage(locale));
    	s.setl_ERR_INFO( exmsg.getMessage(locale) );
    	
    	_errList.add( s );
    }
    /**
     * エラー一覧リストに追加する
     * 
     * @param exmsg エラーメッセージ
     * @param indexRow エラー項目行
     */
    private void addErrorList( int indexRow , ExpjMessage exmsg ){    	
    	AD0080010Struct s = new AD0080010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AA01520" , ""+indexRow  );
    	
    	s.setl_ERROR_IN(exmsgline.getMessage(locale));
    	s.setl_ERR_INFO( exmsg.getMessage(locale) );
    	
    	_errList.add( s );
    }
    /**
     * 禁則文字
     * 
     * @param str　チェックの文字
     * @return 禁則文字ある　ture　禁則文字ない　false
     */
    private boolean  errorWord( String str ){    
    	if(str.indexOf("%") >= 0){
    		return true;
    	}  
    	if(str.indexOf("_") >= 0){
    		return true;
    	} 
    	if(str.indexOf("\\") >= 0){
    		return true;
    	} 
    	return false;
    }
    
    /**
	 * 日付形式チェック("YYYY/MM/DD"或は"YYYY/MM/DD HH24MI"形式)
	 * @param 日付（文字型）
	 * @return 日付形式が正しければtrue,誤っていればfalse
	 */
    static public boolean chkDate(String dateString) {
    	Calendar calendar = Calendar.getInstance();
    	Date date;
    	if(dateString==null){
    		return false;
    	}
    	if ( stringUtil.getByteLength(dateString) > 10 ){
    		try {     
        		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HHmm");
        		dateFormat.setLenient(false);
        		date = dateFormat.parse(dateString);
        		calendar.setTime(date);
			    if(calendar.get(Calendar.YEAR) > 9999){
			    	return false;
			    }
        		return true;
        	} catch (Exception e) {}
        		return false;    
    	}
    	else{
    		try {     
        		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        		dateFormat.setLenient(false);
        		date = dateFormat.parse(dateString);
        		calendar.setTime(date);
			    if(calendar.get(Calendar.YEAR) > 9999){
			    	return false;
			    }
        		return true;
        	} catch (Exception e) {}
        		return false;     
    	}
	}
   
    /**
     * 各項目に対してチェックを行う
     * 
     * @param csvVector
     * @param i 
     * @return エラーある　false　エラーない　true
     */
    private boolean  checkItem( Vector csvVector, int i ){

    	double tempDouble;
		//作業指示番号チェック
		if(csvVector.get(OprInstCdNo) == null || "".equals((String)csvVector.get(OprInstCdNo))){
			addErrorList( i,OprInstCdNo, "AD30022");
			return false;
		}
		if(((String)csvVector.get(OprInstCdNo)).getBytes().length >= 26){
			addErrorList( i,OprInstCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(OprInstCdNo))){
			addErrorList( i,OprInstCdNo, "AA01524");
			return false;
		}
		//品目番号チェック
		if(csvVector.get(ItemCdNo) != null && !"".equals((String)csvVector.get(ItemCdNo))) {
			if(((String)csvVector.get(ItemCdNo)).getBytes().length >= 26){
				addErrorList( i,ItemCdNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(ItemCdNo))){
				addErrorList( i,ItemCdNo, "AA01524");
				return false;
			}
		}

        //良品数チェック
		if(csvVector.get(AcptQtyNo) != null && !"".equals((String)csvVector.get(AcptQtyNo))) {
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(AcptQtyNo));
			} catch (NumberFormatException e) {
				addErrorList( i,AcptQtyNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(AcptQtyNo),14,4)){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;	
			}
		}

        //不良数チェック	
		if(csvVector.get(DefectQtyNo) != null && !"".equals((String)csvVector.get(DefectQtyNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQtyNo));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQtyNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQtyNo),14,4)){
				addErrorList( i,DefectQtyNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQtyNo, "AA01501");
				return false;	
			}
		}

        //作業日チェック
		if(csvVector.get(OprDateNo) != null && !"".equals((String)csvVector.get(OprDateNo))){
			if(!chkDate((String)csvVector.get(OprDateNo))){
				addErrorList( i,OprDateNo, "AA01606");
				return false;	
			}
		}

		//保管区コードチェック
		if(csvVector.get(WhCdNo) != null && !"".equals((String)csvVector.get(WhCdNo))){
			if(((String)csvVector.get(WhCdNo)).getBytes().length >= 26){
				addErrorList( i,WhCdNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(WhCdNo))){
				addErrorList( i,WhCdNo, "AA01524");
				return false;
			}
		}
		
        //作業区コードチェック
		if(csvVector.get(WsCdNo) != null && !"".equals((String)csvVector.get(WsCdNo))){
			if(((String)csvVector.get(WsCdNo)).getBytes().length >= 26){
				addErrorList( i,WsCdNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(WsCdNo))){
				addErrorList( i,WsCdNo, "AA01524");
				return false;
			}
		}
		
		//作業担当者チェック
		if(csvVector.get(OprRsltPersonNo) != null && !"".equals((String)csvVector.get(OprRsltPersonNo))){
			if(((String)csvVector.get(OprRsltPersonNo)).getBytes().length >= 41){
				addErrorList( i,OprRsltPersonNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(OprRsltPersonNo))){
				addErrorList( i,OprRsltPersonNo, "AA01524");
				return false;
			}
		}
		
		//備考チェック
		if(csvVector.get(OprRsltCommentNo) != null && !"".equals((String)csvVector.get(OprRsltCommentNo))){
			if(((String)csvVector.get(OprRsltCommentNo)).getBytes().length >= 81){
				addErrorList( i,OprRsltCommentNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(OprRsltCommentNo))){
				addErrorList( i,OprRsltCommentNo, "AA01524");
				return false;
			}
		}
		
		//作業時間単位区分チェック	
		if(csvVector.get(OprTimeImeUnitTypNo) != null && !"".equals((String)csvVector.get(OprTimeImeUnitTypNo))){
			try {
				Double.parseDouble((String)csvVector.get(OprTimeImeUnitTypNo));
			} catch (NumberFormatException e) {
				addErrorList( i,OprTimeImeUnitTypNo, "AA01503");
				return false;
			}
			if(!"1".equals((String)csvVector.get(OprTimeImeUnitTypNo)) &&  !"2".equals((String)csvVector.get(OprTimeImeUnitTypNo))){
				addErrorList( i,OprTimeImeUnitTypNo, "CF00012");
				return false;
			}
		}
		
        //前段取時間チェック	
		if(csvVector.get(PreArrangementTimeNo) != null && !"".equals((String)csvVector.get(PreArrangementTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(PreArrangementTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,PreArrangementTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(PreArrangementTimeNo),14,4)){
				addErrorList( i,PreArrangementTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,PreArrangementTimeNo, "AA01501");
				return false;	
			}
		}
		
        //後段取時間チェック	
		if(csvVector.get(PostArrangementTimeNo) != null && !"".equals((String)csvVector.get(PostArrangementTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(PostArrangementTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,PostArrangementTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(PostArrangementTimeNo),14,4)){
				addErrorList( i,PostArrangementTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,PostArrangementTimeNo, "AA01501");
				return false;	
			}
		}
		
        //作業時間チェック	
		if(csvVector.get(OprTimeNo) != null && !"".equals((String)csvVector.get(OprTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(OprTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,OprTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(OprTimeNo),14,4)){
				addErrorList( i,OprTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,OprTimeNo, "AA01501");
				return false;	
			}
		}
		
        //停止時間チェック	
		if(csvVector.get(CessationTimeNo) != null && !"".equals((String)csvVector.get(CessationTimeNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(CessationTimeNo));
			} catch (NumberFormatException e) {
				addErrorList( i,CessationTimeNo, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(CessationTimeNo),14,4)){
				addErrorList( i,CessationTimeNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,CessationTimeNo, "AA01501");
				return false;	
			}
		}
		
		//停止理由チェック
		if(csvVector.get(CessationCauseNo) != null && !"".equals((String)csvVector.get(CessationCauseNo))){
			if(((String)csvVector.get(CessationCauseNo)).getBytes().length >= 81){
				addErrorList( i,CessationCauseNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(CessationCauseNo))){
				addErrorList( i,CessationCauseNo, "AA01524");
				return false;
			}
		}
		
		//在庫ロット番号チェック
		if(csvVector.get(LotNoNo) != null && !"".equals((String)csvVector.get(LotNoNo))){
			if(((String)csvVector.get(LotNoNo)).getBytes().length >= 26){
				addErrorList( i,LotNoNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(LotNoNo))){
				addErrorList( i,LotNoNo, "AA01524");
				return false;
			}
			if(((String)csvVector.get(AcptQtyNo) != null && !"".equals((String)csvVector.get(AcptQtyNo)) && 
					Calculate.compare((String)csvVector.get(AcptQtyNo), "0") == 0)  
					|| (String)csvVector.get(AcptQtyNo) == null ||
					"".equals((String)csvVector.get(AcptQtyNo))) {
				addErrorList( i,LotNoNo, "AD20139");
				return false;
			}
		}
		
		//メーカロット番号チェック
		if(csvVector.get(VendLotNoNo) != null && !"".equals((String)csvVector.get(VendLotNoNo))){
			if(((String)csvVector.get(VendLotNoNo)).getBytes().length >= 26){
				addErrorList( i,VendLotNoNo, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(VendLotNoNo))){
				addErrorList( i,VendLotNoNo, "AA01524");
				return false;
			}
		}
		
		//不良理由コード1チェック
		if(csvVector.get(DefectCauseCd1No) != null && !"".equals((String)csvVector.get(DefectCauseCd1No))){
			if(((String)csvVector.get(DefectCauseCd1No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd1No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd1No))){
				addErrorList( i,DefectCauseCd1No, "AA01524");
				return false;
			}
			// ０の場合
			if("0".equals((String)csvVector.get(DefectCauseCd1No))) {
				addErrorList( i,DefectCauseCd1No, "AD00221");
				return false;
			}
		}
		//不良理由コード2チェック
		if(csvVector.get(DefectCauseCd2No) != null && !"".equals((String)csvVector.get(DefectCauseCd2No))){
			if(((String)csvVector.get(DefectCauseCd2No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd2No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd2No))){
				addErrorList( i,DefectCauseCd2No, "AA01524");
				return false;
			}
			// ０の場合
			if("0".equals((String)csvVector.get(DefectCauseCd2No))) {
				addErrorList( i,DefectCauseCd2No, "AD00221");
				return false;
			}
		}
		//不良理由コード3チェック
		if(csvVector.get(DefectCauseCd3No) != null && !"".equals((String)csvVector.get(DefectCauseCd3No))){
			if(((String)csvVector.get(DefectCauseCd3No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd3No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd3No))){
				addErrorList( i,DefectCauseCd3No, "AA01524");
				return false;
			}
			// ０の場合
			if("0".equals((String)csvVector.get(DefectCauseCd3No))) {
				addErrorList( i,DefectCauseCd3No, "AD00221");
				return false;
			}
		}
		//不良理由コード4チェック
		if(csvVector.get(DefectCauseCd4No) != null && !"".equals((String)csvVector.get(DefectCauseCd4No))){
			if(((String)csvVector.get(DefectCauseCd4No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd4No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd4No))){
				addErrorList( i,DefectCauseCd4No, "AA01524");
				return false;
			}
			// ０の場合
			if("0".equals((String)csvVector.get(DefectCauseCd4No))) {
				addErrorList( i,DefectCauseCd4No, "AD00221");
				return false;
			}
		}
		//不良理由コード5チェック
		if(csvVector.get(DefectCauseCd5No) != null && !"".equals((String)csvVector.get(DefectCauseCd5No))){
			if(((String)csvVector.get(DefectCauseCd5No)).getBytes().length >= 26){
				addErrorList( i,DefectCauseCd5No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectCauseCd5No))){
				addErrorList( i,DefectCauseCd5No, "AA01524");
				return false;
			}
			// ０の場合
			if("0".equals((String)csvVector.get(DefectCauseCd5No))) {
				addErrorList( i,DefectCauseCd5No, "AD00221");
				return false;
			}
		}
		
		//不良数1チェック
		if(csvVector.get(DefectQty1No) != null && !"".equals((String)csvVector.get(DefectQty1No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty1No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty1No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty1No),14,4)){
				addErrorList( i,DefectQty1No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty1No, "AA01501");
				return false;	
			}
		}
		//不良数2チェック
		if(csvVector.get(DefectQty2No) != null && !"".equals((String)csvVector.get(DefectQty2No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty2No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty2No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty2No),14,4)){
				addErrorList( i,DefectQty2No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty2No, "AA01501");
				return false;	
			}
		}
		//不良数3チェック
		if(csvVector.get(DefectQty3No) != null && !"".equals((String)csvVector.get(DefectQty3No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty3No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty3No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty3No),14,4)){
				addErrorList( i,DefectQty3No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty3No, "AA01501");
				return false;	
			}
		}
		//不良数4チェック
		if(csvVector.get(DefectQty4No) != null && !"".equals((String)csvVector.get(DefectQty4No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty4No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty4No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty4No),14,4)){
				addErrorList( i,DefectQty4No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty4No, "AA01501");
				return false;	
			}
		}
		//不良数5チェック
		if(csvVector.get(DefectQty5No) != null && !"".equals((String)csvVector.get(DefectQty5No))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DefectQty5No));
			} catch (NumberFormatException e) {
				addErrorList( i,DefectQty5No, "AA01503");
				return false;
			}
			if(!formatCheck.isNumberFormat((String)csvVector.get(DefectQty5No),14,4)){
				addErrorList( i,DefectQty5No, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DefectQty5No, "AA01501");
				return false;	
			}
		}

        //不良備考1チェック
		if(csvVector.get(DefectComment1No) != null && !"".equals((String)csvVector.get(DefectComment1No))){
			if(((String)csvVector.get(DefectComment1No)).getBytes().length >= 81){
				addErrorList( i,DefectComment1No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment1No))){
				addErrorList( i,DefectComment1No, "AA01524");
				return false;
			}
		}
        //不良備考2チェック
		if(csvVector.get(DefectComment2No) != null && !"".equals((String)csvVector.get(DefectComment2No))){
			if(((String)csvVector.get(DefectComment2No)).getBytes().length >= 81){
				addErrorList( i,DefectComment2No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment2No))){
				addErrorList( i,DefectComment2No, "AA01524");
				return false;
			}
		}
        //不良備考3チェック
		if(csvVector.get(DefectComment3No) != null && !"".equals((String)csvVector.get(DefectComment3No))){
			if(((String)csvVector.get(DefectComment3No)).getBytes().length >= 81){
				addErrorList( i,DefectComment3No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment3No))){
				addErrorList( i,DefectComment3No, "AA01524");
				return false;
			}
		}
        //不良備考4チェック
		if(csvVector.get(DefectComment4No) != null && !"".equals((String)csvVector.get(DefectComment4No))){
			if(((String)csvVector.get(DefectComment4No)).getBytes().length >= 81){
				addErrorList( i,DefectComment4No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment4No))){
				addErrorList( i,DefectComment4No, "AA01524");
				return false;
			}
		}
        //不良備考5チェック
		if(csvVector.get(DefectComment5No) != null && !"".equals((String)csvVector.get(DefectComment5No))){
			if(((String)csvVector.get(DefectComment5No)).getBytes().length >= 81){
				addErrorList( i,DefectComment5No, "AA01501");
				return false;
			}
			if(errorWord((String)csvVector.get(DefectComment5No))){
				addErrorList( i,DefectComment5No, "AA01524");
				return false;
			}
		}
		//作業完了フラグチェック
		if((String)csvVector.get(OprCmpltFlgNo) != null && !"".equals((String)csvVector.get(OprCmpltFlgNo))){
			if(!"0".equals((String)csvVector.get(OprCmpltFlgNo)) && !"1".equals((String)csvVector.get(OprCmpltFlgNo))
					&& !"2".equals((String)csvVector.get(OprCmpltFlgNo))){
				addErrorList( i,OprCmpltFlgNo, "AD00119");
				return false;				
			}
			if("2".equals((String)csvVector.get(OprCmpltFlgNo))){
				if("".equals((String)csvVector.get(AcptQtyNo))){
					csvVector.set(AcptQtyNo,"0");
				}
				if("".equals((String)csvVector.get(DefectQtyNo))){
					csvVector.set(DefectQtyNo,"0");
				}
				if("".equals((String)csvVector.get(PreArrangementTimeNo))){
					csvVector.set(PreArrangementTimeNo,"0");
				}
				if("".equals((String)csvVector.get(PostArrangementTimeNo))){
					csvVector.set(PostArrangementTimeNo,"0");
				}
				if("".equals((String)csvVector.get(OprTimeNo))){
					csvVector.set(OprTimeNo,"0");
				}
				if("".equals((String)csvVector.get(CessationTimeNo))){
					csvVector.set(CessationTimeNo,"0");
				}
				if(Calculate.compare(
						Calculate.add(Calculate.add(Calculate.add(Calculate.add(Calculate.add((String)csvVector.get(AcptQtyNo)
								,(String)csvVector.get(DefectQtyNo))
								,(String)csvVector.get(PreArrangementTimeNo))
								,(String)csvVector.get(PostArrangementTimeNo))
								,(String)csvVector.get(OprTimeNo))
								,(String)csvVector.get(CessationTimeNo)), "0") != 0){
					addErrorList( i,OprCmpltFlgNo, "AE00201");
					return false;	
				}
			}
		}
		//子品目一括更新フラグ
		if((String)csvVector.get(ChildRsltUpdateFlgNo) != null && !"".equals((String)csvVector.get(ChildRsltUpdateFlgNo))){
			if(!"0".equals((String)csvVector.get(ChildRsltUpdateFlgNo)) && !"1".equals((String)csvVector.get(ChildRsltUpdateFlgNo))){
				addErrorList( i,ChildRsltUpdateFlgNo, "AD00122");
				return false;
			}
		}
		return true;
	}
	// TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ユーザ定義のコードを記述してください
		try {			
		    // 初期化設定
			setReadStatus(INITIAL);
			setList(null);
			int totalOkData = 0;
			int totalErrorData = 0;
			int totalData = 0;
			Vector csvVector;
			// 初期化_ERRLIST
			_errList = new ArrayList(0);
			// 取込データ取得
			String[] csvDateStr = ( String[] )csvReader.lineRead();
			// データ存在チェック
			if(csvDateStr.length  < 2 || csvDateStr[0].length() == 0 ||csvDateStr[1].length() == 0){
				setErrorMessage("AH00042", "0", "0");
				return;
			}
		      	
			for(int i = 1 ; i < csvDateStr.length ; i++){
				if(csvDateStr[i].length() == 0 ){
					break;
				}
				totalData++;
				csvVector = csvReader.importCSVLine(csvDateStr[i]);
				// 項目数 が 34項目 未満の場合
				if(csvVector != null && csvVector.size() < ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AH00044", ""+ColSize);
					addErrorList( i, exmsg);
					continue;
				}
				// 項目数 が 34項目多すぎの場合
				if(csvVector != null && csvVector.size() > ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AA01519", ""+csvVector.size());
				 	addErrorList( i, exmsg);
					continue;
				}
				if(!checkItem(csvVector,i)){
					continue;
				}
				totalOkData++;
				
				// 作業実績取込管理番号採番
				List seqList = entity.mSEQ_OPR.read(conn, struct);
				if (!seqList.isEmpty()) {
					struct.setOPR_RSLT_TEMP_CTL_NO("ORT" + ((AD0080010Struct)seqList.get(0)).getOPR_RSLT_TEMP_CTL_NO());
				} else {
					break;
				}

                //［作業実績一時テーブル］に追加
				struct.setOPR_INST_CD((String)csvVector.get(OprInstCdNo));
				struct.setITEM_CD((String)csvVector.get(ItemCdNo));
				struct.setACPT_QTY((String)csvVector.get(AcptQtyNo));
				struct.setDEFECT_QTY((String)csvVector.get(DefectQtyNo));
				struct.setOPR_DATE((String)csvVector.get(OprDateNo));
				struct.setWH_CD((String)csvVector.get(WhCdNo));
				struct.setWS_CD((String)csvVector.get(WsCdNo));
				
				struct.setOPR_RSLT_PERSON((String)csvVector.get(OprRsltPersonNo));
				struct.setOPR_RSLT_COMMENT((String)csvVector.get(OprRsltCommentNo));
				struct.setOPR_TIME_UNIT_TYP((String)csvVector.get(OprTimeImeUnitTypNo));
				struct.setPRE_ARRANGEMENT_TIME((String)csvVector.get(PreArrangementTimeNo));
				struct.setPOST_ARRANGEMENT_TIME((String)csvVector.get(PostArrangementTimeNo));
				struct.setOPR_TIME((String)csvVector.get(OprTimeNo));
				struct.setCESSATION_TIME((String)csvVector.get(CessationTimeNo));
				struct.setCESSATION_CAUSE((String)csvVector.get(CessationCauseNo));
				
				struct.setLOT_NO((String)csvVector.get(LotNoNo));
				struct.setVEND_LOT_NO((String)csvVector.get(VendLotNoNo));
				struct.setDEFECT_CAUSE_CD1((String)csvVector.get(DefectCauseCd1No));
				struct.setDEFECT_QTY1((String)csvVector.get(DefectQty1No));
				struct.setDEFECT_COMMENT1((String)csvVector.get(DefectComment1No));
				struct.setDEFECT_CAUSE_CD2((String)csvVector.get(DefectCauseCd2No));
				struct.setDEFECT_QTY2((String)csvVector.get(DefectQty2No));
				struct.setDEFECT_COMMENT2((String)csvVector.get(DefectComment2No));
				struct.setDEFECT_CAUSE_CD3((String)csvVector.get(DefectCauseCd3No));
				struct.setDEFECT_QTY3((String)csvVector.get(DefectQty3No));
				struct.setDEFECT_COMMENT3((String)csvVector.get(DefectComment3No));
				struct.setDEFECT_CAUSE_CD4((String)csvVector.get(DefectCauseCd4No));
				struct.setDEFECT_QTY4((String)csvVector.get(DefectQty4No));
				struct.setDEFECT_COMMENT4((String)csvVector.get(DefectComment4No));
				struct.setDEFECT_CAUSE_CD5((String)csvVector.get(DefectCauseCd5No));
				struct.setDEFECT_QTY5((String)csvVector.get(DefectQty5No));
				struct.setDEFECT_COMMENT5((String)csvVector.get(DefectComment5No));
				struct.setOPR_CMPLT_FLG((String)csvVector.get(OprCmpltFlgNo));
				struct.setTAKE_DATE(businessDate);
				struct.setCHILD_RSLTUPDATE_FLG((String)csvVector.get(ChildRsltUpdateFlgNo));
				entity.mT_OPR_RSLT_TEMP.create(conn,struct);
			}
			//エラー数量を取得
			totalErrorData = totalData - totalOkData ;
			setList(_errList);
			// 終了メッセージ出力
			if(totalErrorData == 0){
				setInfoMessage("AA01514",String.valueOf(totalOkData));
			}else{
				setErrorMessage("AA01607",String.valueOf(totalOkData),String.valueOf(totalErrorData));
			}
			if(list != null && list.size() > 0){
				setReadStatus(NORMAL);
				return;
			}
			//エラーない場合、コメント
			if(totalErrorData == 0){
				conn.commit();
			}
			setReadStatus(NORMAL);
			
		} catch(Exception e) {
			setErrorMessage("ZZ01106");
			e.printStackTrace();
		}finally{
			if(conn != null ){
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
            struct.setDOWNLOAD_FILE("");
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));

			List csvList = new ArrayList();
			// CSV情報の作成
			// タイトル情報設定
			String csvTitle[] = { "Expj.Cmt3094", // エラー箇所
								  "Expj.Cmt3098"  // エラー内容
			};
			// CSVリストに入れる
			csvList.add(csvTitle);

			AD0080010Struct workStruct;
			// 明細内容設定
			for (int i = 0; i < getListsize(); i++) {
				workStruct = getListvalue(i);
				String csvStr[] = new String[csvTitle.length];
				csvStr[0] = workStruct.getl_ERROR_IN();// エラー箇所
				csvStr[1] = workStruct.getl_ERR_INFO();// エラー内容
				csvList.add(csvStr);// CSVリストに入れる
			}

			if (csvList != null && csvList.size() > 0) {
				// csvファイルに書く
				csvWriter.write(csvList, CoreTools.getLocale(struct
						.getsUser_ID()), true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());// 致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} 
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			struct.setUSER_CD(getsysUSER_CD());
			entity.mdeleteT_OPR_RSLT_TEMP.delete(conn, struct);
			// コミット
			conn.commit();
			if(list != null && list.size()>0) {
				list.clear();
			}
			setReadStatus(INITIAL);
		} catch(SQLException e) {		
			setErrorMessage("ZZ01106");
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlDeleteAll>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ユーザ定義のコードを記述してください
		try{
	    	setReadStatus(INITIAL); 
	        // バッチ処理クラスのmain引数
	        String strBatchClassName = null;		// 呼び出し先クラス名
	        String strBatchProcessingTyp = null;	// バッチ処理区分
	        String strProgramId = null;			    // 業務名（AD0080B002）
	        String strUserId = null;				// ユーザID
	        String strPlantCd = null;				// 工場コード
	        String strCsvTakeTyp =null;             // CSV取込方式
	        // 引数セット
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AD0080.AD0080B002.mainAD0080B002";
	        strBatchProcessingTyp = "2";					  // 2: 自動運転しない（夜間バッチなし）
	        strProgramId = "AD0080B002";					  // 業務名（AE0180B001）
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
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try{
			locale = CoreTools.getLocale(getsysUSER_CD());
			// 業務運用日を取得
			String busOprDate = DateCtrl.getBusinessOprDate(conn, getsysPLANT_CD());
			if(busOprDate == null || "".equals(busOprDate)) {
				// 業務日付の取得に失敗しました。
				setErrorMessage("KR00017");
				setReadStatus(ERROR);
				return;
			}
			businessDate = busOprDate;
		} catch(SQLException e) {
			// 例外異常終了
			e.printStackTrace();
			throw new ExpjException(e);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0080");
		logger.entering("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AD0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("DeleteAll") ) {
				controlDeleteAll();
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
//			throw new FoundationException("AD0080010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0080010-E999","CSVの出力処理"));
			throw new FoundationException("AD0080010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0080010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0080010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0080010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0080010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0080010Entity entity;
	protected AD0080010Struct struct;
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

		entity = new AD0080010Entity();
		struct = new AD0080010Struct();

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
	 * AD0080010クラスの標準コンストラクタ
	 */
	public AD0080010Control() throws BusinessProcessException, FoundationException
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
				AD0080010Struct key = (AD0080010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("l_ERR_INFO") && key.getl_ERR_INFO() != null) {
					msgKey.setKeyValue("l_ERR_INFO", key.getl_ERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TEMP_CTL_NO") && key.getOPR_RSLT_TEMP_CTL_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_TEMP_CTL_NO", key.getOPR_RSLT_TEMP_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON") && key.getOPR_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OPR_RSLT_PERSON", key.getOPR_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT") && key.getOPR_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OPR_RSLT_COMMENT", key.getOPR_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD1") && key.getDEFECT_CAUSE_CD1() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD1", key.getDEFECT_CAUSE_CD1());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY1") && key.getDEFECT_QTY1() != null) {
					msgKey.setKeyValue("DEFECT_QTY1", key.getDEFECT_QTY1());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT1") && key.getDEFECT_COMMENT1() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT1", key.getDEFECT_COMMENT1());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD2") && key.getDEFECT_CAUSE_CD2() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD2", key.getDEFECT_CAUSE_CD2());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY2") && key.getDEFECT_QTY2() != null) {
					msgKey.setKeyValue("DEFECT_QTY2", key.getDEFECT_QTY2());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT2") && key.getDEFECT_COMMENT2() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT2", key.getDEFECT_COMMENT2());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD3") && key.getDEFECT_CAUSE_CD3() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD3", key.getDEFECT_CAUSE_CD3());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY3") && key.getDEFECT_QTY3() != null) {
					msgKey.setKeyValue("DEFECT_QTY3", key.getDEFECT_QTY3());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT3") && key.getDEFECT_COMMENT3() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT3", key.getDEFECT_COMMENT3());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD4") && key.getDEFECT_CAUSE_CD4() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD4", key.getDEFECT_CAUSE_CD4());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY4") && key.getDEFECT_QTY4() != null) {
					msgKey.setKeyValue("DEFECT_QTY4", key.getDEFECT_QTY4());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT4") && key.getDEFECT_COMMENT4() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT4", key.getDEFECT_COMMENT4());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD5") && key.getDEFECT_CAUSE_CD5() != null) {
					msgKey.setKeyValue("DEFECT_CAUSE_CD5", key.getDEFECT_CAUSE_CD5());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY5") && key.getDEFECT_QTY5() != null) {
					msgKey.setKeyValue("DEFECT_QTY5", key.getDEFECT_QTY5());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_COMMENT5") && key.getDEFECT_COMMENT5() != null) {
					msgKey.setKeyValue("DEFECT_COMMENT5", key.getDEFECT_COMMENT5());
				}
				if(msgKeyType.containsKeyColumn("OPR_CMPLT_FLG") && key.getOPR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("OPR_CMPLT_FLG", key.getOPR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("TAKE_DATE") && key.getTAKE_DATE() != null) {
					msgKey.setKeyValue("TAKE_DATE", key.getTAKE_DATE());
				}
				if(msgKeyType.containsKeyColumn("CHILD_RSLTUPDATE_FLG") && key.getCHILD_RSLTUPDATE_FLG() != null) {
					msgKey.setKeyValue("CHILD_RSLTUPDATE_FLG", key.getCHILD_RSLTUPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
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
					AD0080010Struct key = new AD0080010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERROR_IN")) {
						key.setl_ERROR_IN(msgKey.getKeyValue("l_ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_INFO")) {
						key.setl_ERR_INFO(msgKey.getKeyValue("l_ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TEMP_CTL_NO")) {
						key.setOPR_RSLT_TEMP_CTL_NO(msgKey.getKeyValue("OPR_RSLT_TEMP_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON")) {
						key.setOPR_RSLT_PERSON(msgKey.getKeyValue("OPR_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT")) {
						key.setOPR_RSLT_COMMENT(msgKey.getKeyValue("OPR_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD1")) {
						key.setDEFECT_CAUSE_CD1(msgKey.getKeyValue("DEFECT_CAUSE_CD1"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY1")) {
						key.setDEFECT_QTY1(msgKey.getKeyValue("DEFECT_QTY1"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT1")) {
						key.setDEFECT_COMMENT1(msgKey.getKeyValue("DEFECT_COMMENT1"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD2")) {
						key.setDEFECT_CAUSE_CD2(msgKey.getKeyValue("DEFECT_CAUSE_CD2"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY2")) {
						key.setDEFECT_QTY2(msgKey.getKeyValue("DEFECT_QTY2"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT2")) {
						key.setDEFECT_COMMENT2(msgKey.getKeyValue("DEFECT_COMMENT2"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD3")) {
						key.setDEFECT_CAUSE_CD3(msgKey.getKeyValue("DEFECT_CAUSE_CD3"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY3")) {
						key.setDEFECT_QTY3(msgKey.getKeyValue("DEFECT_QTY3"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT3")) {
						key.setDEFECT_COMMENT3(msgKey.getKeyValue("DEFECT_COMMENT3"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD4")) {
						key.setDEFECT_CAUSE_CD4(msgKey.getKeyValue("DEFECT_CAUSE_CD4"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY4")) {
						key.setDEFECT_QTY4(msgKey.getKeyValue("DEFECT_QTY4"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT4")) {
						key.setDEFECT_COMMENT4(msgKey.getKeyValue("DEFECT_COMMENT4"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_CAUSE_CD5")) {
						key.setDEFECT_CAUSE_CD5(msgKey.getKeyValue("DEFECT_CAUSE_CD5"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY5")) {
						key.setDEFECT_QTY5(msgKey.getKeyValue("DEFECT_QTY5"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_COMMENT5")) {
						key.setDEFECT_COMMENT5(msgKey.getKeyValue("DEFECT_COMMENT5"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CMPLT_FLG")) {
						key.setOPR_CMPLT_FLG(msgKey.getKeyValue("OPR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TAKE_DATE")) {
						key.setTAKE_DATE(msgKey.getKeyValue("TAKE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CHILD_RSLTUPDATE_FLG")) {
						key.setCHILD_RSLTUPDATE_FLG(msgKey.getKeyValue("CHILD_RSLTUPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
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
