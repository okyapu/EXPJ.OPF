/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0160/src/com/nec/jp/orteus/metamorBase/AE0160/AE0160010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0160;

import com.nec.jp.orteus.metamorBase.AE0160.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0160010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.13 $ $Date: 2017/01/09 08:43:57 $
 *
 */
//}}user_implement_code_header

public class AE0160010Control
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
	public AE0160010Struct getListvalue(int x) { return (AE0160010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0160010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0160010Struct createStruct() { return new AE0160010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0160010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	//受入実績入力テータCSVファイルの列インデックス
	private final int PuchOdrCdNo           = 0;			//発注番号No
	private final int ItemCdNo              = 1;			//品目番号No
	private final int WhCdNo                = 2;			//受入場所No
	private final int AcptDateNo            = 3;			//受入日No
	private final int AcptQtyNo             = 4;			//受入数No
	private final int UnitCostTypNo         = 5;			//単価区分No
	private final int UnitCostNo            = 6;			//単価No
	private final int ProcessingCostNo      = 7;			//加工費No
	private final int MaterialCostNo        = 8;			//材料費No
	private final int OtherOverheadsNo      = 9;			//その他経費No
	private final int DiscAmountNo          = 10;			//値引金額No
	private final int ExchRateNo            = 11;			//為替レートNo
	private final int LotNoNo               = 12;			//在庫ロット番号No
	private final int VendLotNoNo           = 13;			//メーカロット番号No
	private final int DlvCdNo               = 14;			//納品書番号No
	private final int AcptRsltCommentNo	    = 15;			//受入実績備考    
	private final int AcptRsltCompNo        = 16;			//受入完了フラグ        
	//CSVファイルの項目数
    private final int ColSize = 17;
	//エラー一覧リスト
	private ArrayList _errList = new ArrayList();
	//業務運用日
	String BusinessOprDate;
     
    /**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setInfoMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
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
	 * @param value1 置換文字列2
	 */
	private void setErrorMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1,value2);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, sysUSER_CD);
	}

    
    /**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setInfoMessage(String messageno, String message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno,message );
     msgStruct.addInfo( emsg );
     sysLog.info(emsg, getsysUSER_CD());
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
    	String locale = CoreTools.getLocale(sysUSER_CD);
    	AE0160010Struct s = new AE0160010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AH00045" , ""+indexRow , ""+(indexCol+1) );
    	
    	s.setl_ERRLINE_NO(exmsgline.getMessage(locale));
    	s.setl_ERR_MSG( exmsg.getMessage(locale) );
    	
    	_errList.add( s );
    }
    /**
     * エラー一覧リストに追加する
     * 
     * @param exmsg エラーメッセージ番号
     * @param indexRow エラー項目行
     */
    private void addErrorList( int indexRow , ExpjMessage exmsg ){   
        String locale = CoreTools.getLocale(sysUSER_CD);
    	AE0160010Struct s = new AE0160010Struct();
    	ExpjMessage exmsgline = new ExpjMessage( "AA01520" , ""+indexRow  );
    	
    	s.setl_ERRLINE_NO(exmsgline.getMessage(locale));
    	s.setl_ERR_MSG( exmsg.getMessage(locale) );
    	
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
     * 各項目に対してチェックを行う
     * 
     * @param csvVector
     * @param i 
     * @return エラーある　false　エラーない　true
     */
    private boolean  checkItem( Vector csvVector, int i ){
    	double tempDouble;
    	SimpleDateFormat sf = new SimpleDateFormat("yyyy/MM/dd");
    	sf.setLenient(false);

		formatCheck fc = new formatCheck();
		//発注番号チェック
		if(csvVector.get(PuchOdrCdNo) == null || "".equals((String)csvVector.get(PuchOdrCdNo))){
			addErrorList( i,PuchOdrCdNo, "AE00099");
			return false;
		}
		if(((String)csvVector.get(PuchOdrCdNo)).getBytes().length  >= 26){
			addErrorList( i,PuchOdrCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(PuchOdrCdNo))){
			addErrorList( i,PuchOdrCdNo, "AA01524");
			return false;
		}
		//品目番号チェック
		if(((String)csvVector.get(ItemCdNo)).getBytes().length  >= 26){
			addErrorList( i,ItemCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(ItemCdNo))){
			addErrorList( i,ItemCdNo, "AA01524");
			return false;
		}
		//受入場所チェック
		if(((String)csvVector.get(WhCdNo)).getBytes().length  >= 26){
			addErrorList( i,WhCdNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(WhCdNo))){
			addErrorList( i,WhCdNo, "AA01524");
			return false;
		}
		//受入日チェック
		if(csvVector.get(AcptDateNo) != null && !"".equals((String)csvVector.get(AcptDateNo))){
			try {
				Date date =sf.parse((String)csvVector.get(AcptDateNo));
			    Calendar calendar = Calendar.getInstance();
			    calendar.setTime(date);
			    if(calendar.get(Calendar.YEAR) > 9999){
			    	addErrorList( i,AcptDateNo, "AA01606");
			    	return false;
			    }
			} catch (Exception e) {
				addErrorList( i,AcptDateNo, "AA01606");
				return false;	
			}		
			if(((String)csvVector.get(AcptDateNo)).getBytes().length  > 10 || ((String)csvVector.get(AcptDateNo)).indexOf(" ") >= 0){
				addErrorList( i,AcptDateNo, "AA01606");
				return false;	
			}
		}

		//受入数チェック	
		if(csvVector.get(AcptQtyNo) != null && !"".equals((String)csvVector.get(AcptQtyNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(AcptQtyNo));
			} catch (NumberFormatException e) {
				addErrorList( i,AcptQtyNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(AcptQtyNo),14,4)){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;
			}
			if(Calculate.compare((String)csvVector.get(AcptQtyNo), "0")==0 &&
					(csvVector.get(AcptRsltCompNo) == null || "".equals((String)csvVector.get(AcptRsltCompNo)))) {
				addErrorList( i,AcptQtyNo, "AE05012");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,AcptQtyNo, "AA01501");
				return false;	
			}
		}
		//単価区分チェック	
		if(csvVector.get(UnitCostTypNo) != null &&  !"".equals((String)csvVector.get(UnitCostTypNo))){
			if(!"1".equals((String)csvVector.get(UnitCostTypNo)) &&  !"2".equals((String)csvVector.get(UnitCostTypNo))){
				addErrorList( i,UnitCostTypNo, "CF00012");
				return false;
			}
		}
		//単価チェック	
		if(csvVector.get(UnitCostNo) != null && !"".equals((String)csvVector.get(UnitCostNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(UnitCostNo));
			} catch (NumberFormatException e) {
				addErrorList( i,UnitCostNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(UnitCostNo),14,4)){
				addErrorList( i,UnitCostNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,UnitCostNo, "AA01501");
				return false;
			}
		}
		//加工費チェック	
		if(csvVector.get(ProcessingCostNo) != null && !"".equals((String)csvVector.get(ProcessingCostNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(ProcessingCostNo));
			} catch (NumberFormatException e) {
				addErrorList( i,ProcessingCostNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(ProcessingCostNo),14,4)){
				addErrorList( i,ProcessingCostNo, "AA01501");
				return false;
				}
			if(tempDouble < 0){
				addErrorList( i,ProcessingCostNo, "AA01501");
				return false;
			}
		}
		//材料費チェック	
		if(csvVector.get(MaterialCostNo) != null && !"".equals((String)csvVector.get(MaterialCostNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(MaterialCostNo));
			} catch (NumberFormatException e) {
				addErrorList( i,MaterialCostNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(MaterialCostNo),14,4)){
				addErrorList( i,MaterialCostNo, "AA01501");
				return false;
				}
			if(tempDouble < 0){
				addErrorList( i,MaterialCostNo, "AA01501");
				return false;
			}
		}
		//その他経費チェック	
		if(csvVector.get(OtherOverheadsNo) != null && !"".equals((String)csvVector.get(OtherOverheadsNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(OtherOverheadsNo));
			} catch (NumberFormatException e) {
				addErrorList( i,OtherOverheadsNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(OtherOverheadsNo),14,4)){
				addErrorList( i,OtherOverheadsNo, "AA01501");
				return false;
				}
			if(tempDouble < 0){
				addErrorList( i,OtherOverheadsNo, "AA01501");
				return false;
				}
		}
		//値引金額チェック	
		if(csvVector.get(DiscAmountNo) != null && !"".equals((String)csvVector.get(DiscAmountNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(DiscAmountNo));
			} catch (NumberFormatException e) {
				addErrorList( i,DiscAmountNo, "AA01503");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(DiscAmountNo),14,4)){
				addErrorList( i,DiscAmountNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,DiscAmountNo, "AA01501");
				return false;
			}
		}
		//為替レートチェック	
		if(csvVector.get(ExchRateNo) != null && !"".equals((String)csvVector.get(ExchRateNo))){
			try {
				tempDouble = Double.parseDouble((String)csvVector.get(ExchRateNo));
			} catch (NumberFormatException e) {
				addErrorList( i,ExchRateNo, "AE00058");
				return false;
			}
			if(!fc.isNumberFormat((String)csvVector.get(ExchRateNo),14,6)){
				addErrorList( i,ExchRateNo, "AA01501");
				return false;
			}
			if(tempDouble < 0){
				addErrorList( i,ExchRateNo, "AA01501");
				return false;
			}
			if(Calculate.compare("0",(String)csvVector.get(ExchRateNo)) == 0){
				addErrorList( i,ExchRateNo, "AE00059");
				return false;
			}
		}
		//在庫ロット番号チェック
		if("".equals((String)csvVector.get(AcptQtyNo)) || Calculate.compare("0" , (String)csvVector.get(AcptQtyNo)) == 0 ){
			if((String)csvVector.get(LotNoNo) != null && !"".equals((String)csvVector.get(LotNoNo))){
				addErrorList( i,LotNoNo, "AE20617");
				return false;
			}
		}
		if(((String)csvVector.get(LotNoNo)).getBytes().length  >= 26){
			addErrorList( i,LotNoNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(LotNoNo))){
			addErrorList( i,LotNoNo, "AA01524");
			return false;
		}
		//メーカロット番号チェック
		if(((String)csvVector.get(VendLotNoNo)).getBytes().length  >= 26){
			addErrorList( i,VendLotNoNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(VendLotNoNo))){
			addErrorList( i,VendLotNoNo, "AA01524");
			return false;
		}			
	
		//納品書番号チェック
		if(((String)csvVector.get(DlvCdNo)).getBytes().length  >= 26){
			addErrorList( i,DlvCdNo, "AA01501");
			return false;
		}				
		if(errorWord((String)csvVector.get(DlvCdNo))){
			addErrorList( i,DlvCdNo, "AA01524");
			return false;
		}
		//受入実績備考チェック
		if(((String)csvVector.get(AcptRsltCommentNo)).getBytes().length  >= 81){
			addErrorList( i,AcptRsltCommentNo, "AA01501");
			return false;
		}
		if(errorWord((String)csvVector.get(AcptRsltCommentNo))){
			addErrorList( i,AcptRsltCommentNo, "AA01524");
			return false;
		}
	
		//受入完了フラグチェック
		if(csvVector.get(AcptRsltCompNo) != null && !"".equals((String)csvVector.get(AcptRsltCompNo))){
			if(!"0".equals((String)csvVector.get(AcptRsltCompNo)) && !"1".equals((String)csvVector.get(AcptRsltCompNo))
					&& !"2".equals((String)csvVector.get(AcptRsltCompNo))){
				addErrorList( i,AcptRsltCompNo, "AE00191");
				return false;				
			}
			if("0".equals((String)csvVector.get(AcptRsltCompNo)) || "1".equals((String)csvVector.get(AcptRsltCompNo))){
				if("".equals((String)csvVector.get(AcptQtyNo)) || Calculate.compare("0",(String)csvVector.get(AcptQtyNo)) == 0){
					addErrorList( i,AcptRsltCompNo, "AE05012");
					return false;		
				}
			}
			if("2".equals((String)csvVector.get(AcptRsltCompNo))){
				if("".equals((String)csvVector.get(AcptQtyNo))){
					csvVector.set(AcptQtyNo,"0");
				}
				if(Calculate.compare("0",(String)csvVector.get(AcptQtyNo)) != 0){
					addErrorList( i,AcptRsltCompNo, "AE00196");
					return false;				
				}				
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 初期化設定
			setReadStatus(INITIAL);
			setList(null);
			int totalOkData = 0;
			int totalErrorData = 0;
			int totalData = 0;
			Vector csvVector;    //csvデータ
			String acptCtrNo;    //受入実績取込管理番号
			// 初期化_ERRLIST
			_errList = new ArrayList();
			// 取込データ取得
			String[] csvDateStr = ( String[] )csvReader.lineRead();
			// データ存在チェック
			if(csvDateStr.length  < 2 || csvDateStr[0].length() == 0 ||csvDateStr[1].length() == 0){
				setErrorMessage("AH00042","0","0");
				return;
			}
		      	
			for(int i = 1 ; i < csvDateStr.length ; i++){
				
				if(csvDateStr[i].length() == 0 ){
					break;
				}
				totalData++;
				csvVector = csvReader.importCSVLine(csvDateStr[i]);
				// 項目数 が 17項目 未満の場合
				if(csvVector != null && csvVector.size() < ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AH00044", ""+ColSize);
					addErrorList( i, exmsg);
					continue;
				}
				// 項目数 が 17項目多すぎの場合
				if(csvVector != null && csvVector.size() > ColSize){
			    	ExpjMessage exmsg = new ExpjMessage( "AA01519", ""+csvVector.size());
				 	addErrorList( i, exmsg);
					continue;
				}
				//各項目に対してチェック
				if(!checkItem(csvVector,i)){
					continue;
				}
				totalOkData++;
				//受入実績取込管理番号を取得
				List tempList = entity.mgetACPT_RSLT_TEMP_CTL_NO.read(conn,struct);
				acptCtrNo = ((AE0160010Struct)tempList.get(0)).getACPT_RSLT_TEMP_CTL_NO();
				acptCtrNo = "ART"+acptCtrNo;
				//［受入実績一時テーブル］に追加
				struct.setACPT_RSLT_TEMP_CTL_NO(acptCtrNo);
				struct.setPUCH_ODR_CD((String)csvVector.get(PuchOdrCdNo));
				struct.setITEM_CD((String)csvVector.get(ItemCdNo));
				struct.setWH_CD((String)csvVector.get(WhCdNo));
				struct.setACPT_DATE((String)csvVector.get(AcptDateNo));
				struct.setACPT_QTY((String)csvVector.get(AcptQtyNo));
				struct.setUNIT_COST_TYP((String)csvVector.get(UnitCostTypNo));
				struct.setUNIT_COST((String)csvVector.get(UnitCostNo));
				struct.setPROCESSING_COST((String)csvVector.get(ProcessingCostNo));
				struct.setMATERIAL_COST((String)csvVector.get(MaterialCostNo));
				struct.setOTHER_OVERHEADS((String)csvVector.get(OtherOverheadsNo));
				struct.setDISC_AMOUNT((String)csvVector.get(DiscAmountNo));
				struct.setEXCH_RATE((String)csvVector.get(ExchRateNo));
				struct.setLOT_NO((String)csvVector.get(LotNoNo));
				struct.setVEND_LOT_NO((String)csvVector.get(VendLotNoNo));
				struct.setDLV_CD((String)csvVector.get(DlvCdNo));
				struct.setACPT_RSLT_COMMENT((String)csvVector.get(AcptRsltCommentNo));
				struct.setACPT_RSLT_COMP((String)csvVector.get(AcptRsltCompNo));
				struct.setTAKE_DATE(BusinessOprDate);
				entity.mT_ACPT_RSLT_TEMP.create(conn,struct);
			}
			//エラー数を取得
			totalErrorData = totalData - totalOkData ;
			setList(_errList);
			// 終了メッセージ出力
			if(totalErrorData == 0){
				setInfoMessage("AA01514",String.valueOf(totalOkData));
			}else{
				setErrorMessage("AA01607",String.valueOf(totalOkData),String.valueOf(totalErrorData));
			}
			if(list != null && list.size() > 0){
				setReadStatus(TOO_MANY);
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		try {		
			struct.setDOWNLOAD_FILE("");	
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));

			List csvList = new ArrayList();
			// CSV情報の作成
			// タイトル情報設定
			String csvTitle[] = { 
					"Expj.Cmt3094", // エラー箇所
					"Expj.Cmt3098" // エラー内容
			};
			// CSVリストに入れる
			csvList.add(csvTitle);

			AE0160010Struct workStruct;
			// 明細内容設定
			for (int i = 0; i < getListsize(); i++) {
				workStruct = getListvalue(i);
				String csvStr[] = new String[csvTitle.length];
				csvStr[0] = workStruct.getl_ERRLINE_NO();// エラー箇所
				csvStr[1] = workStruct.getl_ERR_MSG();// エラー内容
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
			ExpjMessage emsg = new ExpjMessage( "ZZ01107" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} 
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			struct.setUSER_CD(getsysUSER_CD());
			entity.mdeleteT_ACPT_RSLT_TEMP.delete(conn, struct);
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}

	/**
	 * 実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlExecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlExecute");
			//{{user_implement_dev:<controlExecute>
			// TODO: ユーザ定義のコードを記述してください
		try{
	    	setReadStatus(INITIAL); 
	        // バッチ処理クラスのmain引数
	        String strBatchClassName = null;		// 呼び出し先クラス名
	        String strBatchProcessingTyp = null;	// バッチ処理区分
	        String strProgramId = null;			    // 業務名（AE0160B002）
	        String strUserId = null;				// ユーザID
	        String strPlantCd = null;				// 工場コード
	        String strCsvTakeTyp =null;             // CSV取込方式
	        // 引数セット
	        strBatchClassName = "com.nec.jp.orteus.metamorBase.AE0160.AE0160B002.mainAE0160B002";
	        strBatchProcessingTyp = "2";					  // 2: 自動運転しない（夜間バッチなし）
	        strProgramId = "AE0160B002";					  // 業務名（AE0180B001）
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlExecute");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			BusinessOprDate = DateCtrl.getBusinessOprDate(conn,this.getsysPLANT_CD());
			if(BusinessOprDate == null ){
				setErrorMessage("KR00017");
				setReadStatus(ERROR);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0160");
		logger.entering("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AE0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
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
//			throw new FoundationException("AE0160010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0160010-E999","CSVの出力処理"));
			throw new FoundationException("AE0160010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0160010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0160010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0160010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0160010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0160010Entity entity;
	protected AE0160010Struct struct;
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

		entity = new AE0160010Entity();
		struct = new AE0160010Struct();

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
	 * AE0160010クラスの標準コンストラクタ
	 */
	public AE0160010Control() throws BusinessProcessException, FoundationException
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
				AE0160010Struct key = (AE0160010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("l_ERRLINE_NO") && key.getl_ERRLINE_NO() != null) {
					msgKey.setKeyValue("l_ERRLINE_NO", key.getl_ERRLINE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ERR_MSG") && key.getl_ERR_MSG() != null) {
					msgKey.setKeyValue("l_ERR_MSG", key.getl_ERR_MSG());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_TEMP_CTL_NO") && key.getACPT_RSLT_TEMP_CTL_NO() != null) {
					msgKey.setKeyValue("ACPT_RSLT_TEMP_CTL_NO", key.getACPT_RSLT_TEMP_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT") && key.getACPT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("ACPT_RSLT_COMMENT", key.getACPT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMP") && key.getACPT_RSLT_COMP() != null) {
					msgKey.setKeyValue("ACPT_RSLT_COMP", key.getACPT_RSLT_COMP());
				}
				if(msgKeyType.containsKeyColumn("TAKE_DATE") && key.getTAKE_DATE() != null) {
					msgKey.setKeyValue("TAKE_DATE", key.getTAKE_DATE());
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
					AE0160010Struct key = new AE0160010Struct();
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("l_ERRLINE_NO")) {
						key.setl_ERRLINE_NO(msgKey.getKeyValue("l_ERRLINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ERR_MSG")) {
						key.setl_ERR_MSG(msgKey.getKeyValue("l_ERR_MSG"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_TEMP_CTL_NO")) {
						key.setACPT_RSLT_TEMP_CTL_NO(msgKey.getKeyValue("ACPT_RSLT_TEMP_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMMENT")) {
						key.setACPT_RSLT_COMMENT(msgKey.getKeyValue("ACPT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_RSLT_COMP")) {
						key.setACPT_RSLT_COMP(msgKey.getKeyValue("ACPT_RSLT_COMP"));
					}
					if(msgKeyType.containsKeyColumn("TAKE_DATE")) {
						key.setTAKE_DATE(msgKey.getKeyValue("TAKE_DATE"));
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
