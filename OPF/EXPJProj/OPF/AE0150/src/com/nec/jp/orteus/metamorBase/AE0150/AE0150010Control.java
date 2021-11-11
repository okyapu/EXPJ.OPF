/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0150/src/com/nec/jp/orteus/metamorBase/AE0150/AE0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0150;

import com.nec.jp.orteus.metamorBase.AE0150.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0150010Control クラス
 * ファイル・クラス説明
 * @author $Author: tai-yanhong $
 * @version $Revision: 1.6 $ $Date: 2012/11/29 06:18:11 $
 *
 */
//}}user_implement_code_header

public class AE0150010Control
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
	public AE0150010Struct getListvalue(int x) { return (AE0150010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0150010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0150010Struct createStruct() { return new AE0150010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0150010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** コンボボックスデータ取得用定数　訂正区分 */
	private final static String INSPC_ACPT_CRCT_TYP_NAME = "INSPC_ACPT_CRCT_TYP";
	/** コンボボックスデータ取得用定数　　製品区分 */
	private final static String PRODUCT_TYP_NAME = "PRODUCT_TYP";
	/** コンボボックスデータ取得用定数　　単価区分 */
	private final static String UNIT_COST_TYP_NAME = "UNIT_COST_TYP";
	/** コンボボックスデータ取得用定数　外注購入品区分 */
	private final static String SBCNT_PUCH_TYP_NAME = "SBCNT_PUCH_TYP";
	/** コンボボックスデータ取得用定数　　在庫管理フラグ */
	private final static String INV_CTRL_FLG_NAME = "INV_CTRL_FLG";
	/** コンボボックスデータ取得用定数　　伝票種類 */
	private final static String SLIP_TYP_AP_NAME = "SLIP_TYP_AP";
	/** コンボボックスデータ取得用定数　　購入返品フラグ */
	private final static String PUCH_RTN_FLG_NAME = "PUCH_RTN_FLG";
	
	
	
	/** コンボボックスデータ取得用　訂正区分 */
	private ComboStruct COM_INSPC_ACPT_CRCT_TYP = null;
	/** コンボボックスデータ取得用　　製品区分 */
	private ComboStruct COM_PRODUCT_TYP = null;
	/** コンボボックスデータ取得用　　単価区分 */
	private ComboStruct COM_UNIT_COST_TYP = null;
	/** コンボボックスデータ取得用　外注購入品区分 */
	private ComboStruct COM_SBCNT_PUCH_TYP = null;
	/** コンボボックスデータ取得用　　在庫管理フラグ */
	private ComboStruct COM_INV_CTRL_FLG = null;
	/** コンボボックスデータ取得用　　伝票種類 */
	private ComboStruct COM_SLIP_TYP_AP= null;
	/** コンボボックスデータ取得用　　購入返品フラグ */
	private ComboStruct COM_PUCH_RTN_FLG = null;
	
    // ----- シスタム設定値取得 ---------------	
	private PrivateConfig privateConfig;
    // ----- シスタム設定値取得 ---------------		
	
	/** 棚卸承認 */
	String aprInspcIf = "";	
	/** ユーザの承認権限 */
	String hApprPowerTyp = "";	
	boolean checkFlg = false;
	  
    /**
     * リストソート 
     * @param リスト
     */
    public void listSort(List tempList){
    	//リストソート
    	for(int i = 0 ; i< tempList.size(); i++){
    		int intNoi;
    		int intNoj;
    		AE0150010Struct tempStructz = new AE0150010Struct();
    		for(int j = i+1; j<tempList.size(); j++){
        		AE0150010Struct tempStructi = new AE0150010Struct();
        		tempStructi = (AE0150010Struct)tempList.get(i);
    			AE0150010Struct tempStructj = new AE0150010Struct();
    			tempStructj = (AE0150010Struct)tempList.get(j);
    			intNoi = Integer.parseInt(tempStructi.getl_ROWNO());
    			intNoj = Integer.parseInt(tempStructj.getl_ROWNO());
    			if(intNoi - intNoj > 0){
    				tempList.set(i,tempStructj);
    				tempList.set(j,tempStructi);
    			}					
    		}
    	}
    }
    
    /**
     * コンボボックスデータから表示説明を取得する
     *　@param combo コンボボックスデータ
     * @param　value コンボボックスデータの値
     * @return コンボボックスデータの表示説明
     */
    private String getDisplayName (ComboStruct combo, String value) {
    	for (int j = 0; j < combo.size(); j++){
    		if ((combo.getData(j)[0].equals(value))){
    			return combo.getData(j)[1];
    		}
    	}
    	return null ;
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
   
    //------------------------------------------------------------------
   
    /**
     * Exceptionエラーメッセージ設定
     * @param SQLException
     */
    private void setExceptionMsg(Exception e) throws ExpjException
    {
     ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
     sysLog.severe(emsg, getsysUSER_CD());
     ExpjException ee = new ExpjException(e, emsg);
     throw ee;
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
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 置換文字列１
     */
    private void setErrorMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1 );
     msgStruct.addError( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
    }


    /**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 置換文字列１
     * @param 置換文字列2
     * @param 置換文字列3
     */
    private void setErrorMessage(String messageno, String value1, String value2, String value3)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1, value2, value3 );
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
     * 警告メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setWarnMessage(String messageno, List message)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addWarn( emsg );
     sysLog.info(emsg, getsysUSER_CD());
     
     for(int i=0; i<message.size(); i++)
     {
      emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
      msgStruct.addWarn( emsg );
      sysLog.info(emsg, getsysUSER_CD());
     }
    }
     
    /**
     * 警告メッセージ設定
     * @param メッセージ番号
     * @param 置換文字列１
     * @param 置換文字列2
     * @param 置換文字列3
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
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, sysUSER_CD);
	}
    /**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 置換文字列１
     */
    private void setInfoMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1 );
     msgStruct.addInfo( emsg );
     sysLog.config(emsg, getsysUSER_CD());
    }
     
    /**
     * ログメッセージ設定
     * @param 出力メッセージ
     */
    private void setSyslogConfig(String message)
    {
     ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
     sysLog.config(emsg, getsysUSER_CD());
    }
    //------------------------------------------------------------------
  
	// TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 検索状態を初期化
			setReadStatus(INITIAL);
			//LISTがNULLに設定
			setList(null);
			//取引名をnullに設定
			struct.setVEND_NAME("");
			//ユーザ情報を取得
			struct.setUSER_CD(this.getsysUSER_CD());
			List userList = entity.mselectUSER_MST.read(conn,struct);
			if(userList.size() > 0){
				struct.setAPPR_POWER_TYP(((AE0150010Struct)userList.get(0)).getAPPR_POWER_TYP());
				struct.setCOMPANY_CD(((AE0150010Struct)userList.get(0)).getCOMPANY_CD());
				struct.setPLANT_CD(((AE0150010Struct)userList.get(0)).getPLANT_CD());
			}
			//ユーザの承認権限
			if(!"1".equals(struct.getAPPR_POWER_TYP())){
				setWarningMessage("AZ00037");
			}
			
			//取引先チェック
			if(struct.getVEND_CD() != null && !"".equals(struct.getVEND_CD())){				
				List vendList = entity.mselectM_VEND_CTRL.read(conn,struct);
				if(vendList == null || vendList.size() <= 0){
					setErrorMessage("AE20030");
					return;
				}else{
					//取引名を取得
					String vendname = ((AE0150010Struct)vendList.get(0)).getVEND_NAME();
					struct.setVEND_NAME(vendname);
				}
				
			}
			//ラジオボタン確認
			if("true".equals(struct.getr_APPR_1())){
				struct.setRAPPR("1");
			}else if("true".equals(struct.getr_APPR_2())){
				struct.setRAPPR("2");
			}else if("true".equals(struct.getr_APPR_3())){
				struct.setRAPPR("3");
			}else{
				struct.setRAPPR("4");
			}
			//検索
            // 最大表示行数
	          int maxLine = sp.getMaxLine(conn, 10);
				if(maxLine != 0) {
					struct.setROW_COUNT(String.valueOf(maxLine));
				} else {
					struct.setROW_COUNT(null);
				}
			//　保留と承認取消のとき
			if("2".equals(struct.getRAPPR()) || "3".equals(struct.getRAPPR())){
				list = entity.mselectT_INSPC_ACPT_IF_rtnCnt.read(conn, struct);
			}else{
				//その他の状況	
				list = entity.mselectT_INSPC_ACPT_IFCnt.read(conn, struct);
			}
			
			int rowCount= Integer.parseInt(((AE0150010Struct)list.get(0)).getl_COUNT());
			
			if(rowCount== 0){
				setErrorMessage("ZZ06001");
				// 検索状態
				setReadStatus(NOT_FOUND);
				return;
			}else{
				if(maxLine != 0 && rowCount == maxLine+1){
					setErrorMessage("ZZ01115",""+maxLine );
					// 検索状態
					setReadStatus(TOO_MANY);
					setList(null);
					return;
				}
			}
			//検索
			//　保留と承認取消のとき
			if("2".equals(struct.getRAPPR()) || "3".equals(struct.getRAPPR())){
				list = entity.mselectT_INSPC_ACPT_IF_rtn.read(conn,struct);
			}else{
				//その他の状況				
				list = entity.mselectT_INSPC_ACPT_IF.read(conn, struct);				
			}
			
			// コンボボックスデータの設定
			AE0150010Struct tempStruct = null;
			for(int i=0; i<list.size(); i++) {
				tempStruct = (AE0150010Struct)list.get(i);
				// 訂正区分
				tempStruct.setl_CRCT_TYP(getDisplayName(COM_INSPC_ACPT_CRCT_TYP,tempStruct.getl_CRCT_TYP_CD()));
				// 製品区分
				tempStruct.setl_PRODUCT_TYP(getDisplayName(COM_PRODUCT_TYP,tempStruct.getl_PRODUCT_TYP_CD()));
				// 単価区分
				tempStruct.setl_UNIT_COST_TYP(getDisplayName(COM_UNIT_COST_TYP,tempStruct.getl_UNIT_COST_TYP_CD()));
				// 外注購入品区分
				tempStruct.setl_SBCNT_PUCH_TYP(getDisplayName(COM_SBCNT_PUCH_TYP,tempStruct.getl_SBCNT_PUCH_TYP_CD()));
				// 在庫管理フラグ
				tempStruct.setl_INV_CTRL_FLG(getDisplayName(COM_INV_CTRL_FLG,tempStruct.getl_INV_CTRL_FLG_CD()));
				// 伝票種類
				tempStruct.setl_SLIP_TYP(getDisplayName(COM_SLIP_TYP_AP,tempStruct.getl_SLIP_TYP_CD()));
				// 購入返品フラグ
				tempStruct.setl_PUCH_RTN_FLG(getDisplayName(COM_PUCH_RTN_FLG,tempStruct.getl_PUCH_RTN_FLG_CD()));
			}
			// 検索状態
			setReadStatus(NORMAL);			
			
		}catch(SQLException e) {			
			setExceptionMsg(e);
			e.printStackTrace();
		}catch(Exception e) {
			setExceptionMsg(e);
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 選択更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdateAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");
			//{{user_implement_dev:<controlUpdateAssort>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//エラーメッセージリスト
			List messList = new ArrayList(0);
			//業務運用日付
			String businessDate = DateCtrl.getBusinessOprDate(conn,this.getsysPLANT_CD());
			//一時リスト
			List tempList = new ArrayList(0);
			//一時struct
			//AE0150010Struct tempStruct = new AE0150010Struct();
			//選択行を再ソート
			for(int i = 0;i < struct.getList_l_PUCH_ODR_CD().size(); i++){
				//一時struct
				AE0150010Struct tempStruct = new AE0150010Struct();				
				tempStruct.importData(struct, i);
				tempList.add(tempStruct);
				
			}
			//リストソート
			listSort(tempList);
			//選択された行に対して、1行ずつ以下の処理を行う
			for(int i = 0;i < tempList.size(); i++){
				AE0150010Struct tempStruct = new AE0150010Struct();
				//tempStruct.importData(struct, i);
				tempStruct = (AE0150010Struct)tempList.get(i);
				//承認の場合
				if("true".equals(struct.getr_APPR_1())){
					//更新変数
					tempStruct.setAPPR_FLG("3");
					tempStruct.setAPPR_ID(this.getsysUSER_CD());
					tempStruct.setAPPR_DATE(businessDate);
				}
				//保留の場合
				if("true".equals(struct.getr_APPR_2())){
					//更新変数
					tempStruct.setAPPR_FLG("2");
					tempStruct.setAPPR_ID(this.getsysUSER_CD());
					tempStruct.setAPPR_DATE(businessDate);
					tempStruct.setRESERVE_CAUSE(struct.getRESERVE_CAUSE());
				}
				//承認取消の場合
				if("true".equals(struct.getr_APPR_3())){
					if ( checkFlg && "1".equals(struct.getl_AI_AP_IF_FLG())) {
						messList.clear();
						messList.add("PUCH_ODR_CD:"+tempStruct.getl_PUCH_ODR_CD());
						messList.add("ACPT_NO:"+tempStruct.getl_ACPT_NO());
						messList.add("INSPC_ACPT_NO:"+tempStruct.getl_INSPC_ACPT_NO());
						setErrorMessage("KR00033", messList);
						conn.rollback();
						return;
					}

					//更新変数
					tempStruct.setAPPR_FLG("1");
					tempStruct.setAPPR_ID("");
					tempStruct.setAPPR_DATE("");
				}
				//保留解除の場合
				if("true".equals(struct.getr_APPR_4())){
					//更新変数
					tempStruct.setAPPR_FLG("1");
					tempStruct.setAPPR_ID("");
					tempStruct.setAPPR_DATE("");
					tempStruct.setRESERVE_CAUSE("");
				}
				//データ存在チェック
				List modifyList = entity.mselectT_INSPC_ACPT_IF_modify.read(conn,tempStruct);
				if(modifyList == null || modifyList.size() <= 0){
					setErrorMessage("ZZ01101");
					continue;
				}
				//更新回数チェック
				String modify = ((AE0150010Struct)modifyList.get(0)).getMODIFY_COUNT();
				if(!modify.equals(tempStruct.getl_MODIFY_COUNT())){
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}
				tempStruct.setsUser_ID(struct.getsUser_ID());
				entity.mupdateT_INSPC_ACPT_IF.update(conn, tempStruct);
			}
			//コメント
			conn.commit();
			
			//再検索
			controlSelect();
			
		} catch(SQLException e) {
			conn.rollback();
			setExceptionMsg(e);
			e.printStackTrace();
		}catch(Exception e) {
			conn.rollback();
			setExceptionMsg(e);
			e.printStackTrace();
		}
                //}}user_implement_dev:<controlUpdateAssort>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlUpdateAssort");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");
			//{{user_implement_dev:<controlCheckClear>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckClear>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		//リストがnullに設定
		setList(null);
		controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			//[インストールオプション]より「Ai連携債務」オプションの識別子を取得する
			 checkFlg = entity.mcheckSYS_OPTIONS_AIP.check(conn, struct);
			 //・	取得できる場合、EXPLANNER/Jf、その他の場合、EXPLANNER/Jとして処理を行う。
			 if(entity.mcheckSYS_OPTIONS_JF.check(conn, struct)){
				 struct.setDIRECT_FLG("0");
			 }else{
				 struct.setDIRECT_FLG("");
			 }
			//買掛導入フラグ
			String installFlg;
			//買掛導入フラグを取得
			List installFlgList = entity.mSYS_INSTALL_OPTIONS.read(conn,struct);
			if(installFlgList != null && installFlgList.size() > 0){
				installFlg = ((AE0150010Struct)installFlgList.get(0)).getINSTALL_FLG();
				if("1".equals(installFlg)){
					setErrorMessage("KR00020");
	                // 検索状態を「失敗」に設定
	                setReadStatus(ERROR);
					return;
				}
			}else{
				installFlg = "0";
			}
 	        
 	        /** パラメータ「検収承認」を取得*/
 	        privateConfig = new PrivateConfig(conn);
 	        aprInspcIf = privateConfig.getString("APR_INSPC_IF");
 	        // パラメータ「検収承認」が取得できなかった場合
 	        if(aprInspcIf == null || "".equals(aprInspcIf)){
  				String locale = CoreTools.getLocale(struct.getsUser_ID());
  				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
  				setErrorMessage("AZ00041", messages.getString("AZ00071"));
 	        	aprInspcIf = "0";
                // 検索状態を「失敗」に設定
                setReadStatus(ERROR);
 	        	return;
 	        }else if(!"1".equals(aprInspcIf)){
 				// １以外の場合
 	        	aprInspcIf = "0";
 	        	setErrorMessage("KR00021");
                // 検索状態を「失敗」に設定
                setReadStatus(ERROR);
 	        	return;
 	        }else{
 				// １の場合
 	        	aprInspcIf = "1";
 	        }
 	        //ログインユーザの承認権限
 	        struct.setUSER_CD(this.getsysUSER_CD());
 	        List userList = entity.mselectUSER_MST.read(conn,struct);
 	        if(userList != null && userList.size() > 0){
 	        	//hAPPR_POWER_TYP
 	        	hApprPowerTyp = ((AE0150010Struct)userList.get(0)).getAPPR_POWER_TYP();
 	        	struct.seth_APPR_POWER_TYP(hApprPowerTyp);
 	        }
			// 検索状態を初期化
			setReadStatus(INITIAL);

			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
//				controlSelect();
			}

			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		}catch(SQLException e) {			
			setExceptionMsg(e);
			e.printStackTrace();
		}catch(Exception e) {
			setExceptionMsg(e);
			e.printStackTrace();
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0150");
		logger.entering("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try{
				ComboBox comboController = new ComboBox(conn,sysUSER_CD);
				COM_INSPC_ACPT_CRCT_TYP = comboController.getData(INSPC_ACPT_CRCT_TYP_NAME);
				COM_PRODUCT_TYP = comboController.getData(PRODUCT_TYP_NAME);
				COM_UNIT_COST_TYP = comboController.getData(UNIT_COST_TYP_NAME);		
				COM_SBCNT_PUCH_TYP = comboController.getData(SBCNT_PUCH_TYP_NAME);
				COM_INV_CTRL_FLG = comboController.getData(INV_CTRL_FLG_NAME);
				COM_SLIP_TYP_AP = comboController.getData(SLIP_TYP_AP_NAME);
				COM_PUCH_RTN_FLG = comboController.getData(PUCH_RTN_FLG_NAME);
			} catch (SQLException e){
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage ("ZZ01106");
				sysLog.severe(emsg,getsysUSER_CD());
			    ExpjException ee = new ExpjException(e,emsg);
			    throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("UpdateAssort") ) {
				controlUpdateAssort();
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
			struct.seth_APPR_POWER_TYP(hApprPowerTyp);
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
//			throw new FoundationException("AE0150010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0150010-E999","CSVの出力処理"));
			throw new FoundationException("AE0150010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0150010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0150010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0150010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0150010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0150010Entity entity;
	protected AE0150010Struct struct;
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

		entity = new AE0150010Entity();
		struct = new AE0150010Struct();

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
	 * AE0150010クラスの標準コンストラクタ
	 */
	public AE0150010Control() throws BusinessProcessException, FoundationException
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
				AE0150010Struct key = (AE0150010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r_APPR_1") && key.getr_APPR_1() != null) {
					msgKey.setKeyValue("r_APPR_1", key.getr_APPR_1());
				}
				if(msgKeyType.containsKeyColumn("r_APPR_2") && key.getr_APPR_2() != null) {
					msgKey.setKeyValue("r_APPR_2", key.getr_APPR_2());
				}
				if(msgKeyType.containsKeyColumn("r_APPR_3") && key.getr_APPR_3() != null) {
					msgKey.setKeyValue("r_APPR_3", key.getr_APPR_3());
				}
				if(msgKeyType.containsKeyColumn("r_APPR_4") && key.getr_APPR_4() != null) {
					msgKey.setKeyValue("r_APPR_4", key.getr_APPR_4());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP") && key.geth_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APPR_POWER_TYP", key.geth_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CRCT_TYP") && key.getl_CRCT_TYP() != null) {
					msgKey.setKeyValue("l_CRCT_TYP", key.getl_CRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP") && key.getl_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("l_PRODUCT_TYP", key.getl_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP") && key.getl_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP", key.getl_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP") && key.getl_SBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("l_SBCNT_PUCH_TYP", key.getl_SBCNT_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG") && key.getl_INV_CTRL_FLG() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG", key.getl_INV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_SLIP_TYP") && key.getl_SLIP_TYP() != null) {
					msgKey.setKeyValue("l_SLIP_TYP", key.getl_SLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG") && key.getl_PUCH_RTN_FLG() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_FLG", key.getl_PUCH_RTN_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_ROWNO") && key.getl_ROWNO() != null) {
					msgKey.setKeyValue("l_ROWNO", key.getl_ROWNO());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_ID") && key.getl_APPR_ID() != null) {
					msgKey.setKeyValue("l_APPR_ID", key.getl_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_DATE") && key.getl_APPR_DATE() != null) {
					msgKey.setKeyValue("l_APPR_DATE", key.getl_APPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE") && key.getl_RESERVE_CAUSE() != null) {
					msgKey.setKeyValue("l_RESERVE_CAUSE", key.getl_RESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_NO") && key.getl_ACPT_NO() != null) {
					msgKey.setKeyValue("l_ACPT_NO", key.getl_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_NO") && key.getl_INSPC_ACPT_NO() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_NO", key.getl_INSPC_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CRCT_TYP_CD") && key.getl_CRCT_TYP_CD() != null) {
					msgKey.setKeyValue("l_CRCT_TYP_CD", key.getl_CRCT_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_DATE") && key.getl_INSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_DATE", key.getl_INSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_DATE") && key.getl_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_DATE", key.getl_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_NAME") && key.getl_VEND_NAME() != null) {
					msgKey.setKeyValue("l_VEND_NAME", key.getl_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_NAME") && key.getl_PLANT_NAME() != null) {
					msgKey.setKeyValue("l_PLANT_NAME", key.getl_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_GNR_ORG_CD") && key.getl_GNR_ORG_CD() != null) {
					msgKey.setKeyValue("l_GNR_ORG_CD", key.getl_GNR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_GNR_ORG_NAME") && key.getl_GNR_ORG_NAME() != null) {
					msgKey.setKeyValue("l_GNR_ORG_NAME", key.getl_GNR_ORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_CD") && key.getl_DLV_CD() != null) {
					msgKey.setKeyValue("l_DLV_CD", key.getl_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP_CD") && key.getl_PRODUCT_TYP_CD() != null) {
					msgKey.setKeyValue("l_PRODUCT_TYP_CD", key.getl_PRODUCT_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD") && key.getl_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_CD", key.getl_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_CD") && key.getl_UNIT_COST_TYP_CD() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP_CD", key.getl_UNIT_COST_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PROCESSING_COST") && key.getl_PROCESSING_COST() != null) {
					msgKey.setKeyValue("l_PROCESSING_COST", key.getl_PROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("l_MATERIAL_COST") && key.getl_MATERIAL_COST() != null) {
					msgKey.setKeyValue("l_MATERIAL_COST", key.getl_MATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("l_OTHER_OVERHEADS") && key.getl_OTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("l_OTHER_OVERHEADS", key.getl_OTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_QTY_2") && key.getl_ACPT_QTY_2() != null) {
					msgKey.setKeyValue("l_ACPT_QTY_2", key.getl_ACPT_QTY_2());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_QTY") && key.getl_INSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_QTY", key.getl_INSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_AMOUNT") && key.getl_INSPC_ACPT_AMOUNT() != null) {
					msgKey.setKeyValue("l_INSPC_ACPT_AMOUNT", key.getl_INSPC_ACPT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT") && key.getl_DISC_AMOUNT() != null) {
					msgKey.setKeyValue("l_DISC_AMOUNT", key.getl_DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO") && key.getl_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DETAIL_NO", key.getl_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_MANAGEMENT_CD") && key.getl_MANAGEMENT_CD() != null) {
					msgKey.setKeyValue("l_MANAGEMENT_CD", key.getl_MANAGEMENT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP_CD") && key.getl_SBCNT_PUCH_TYP_CD() != null) {
					msgKey.setKeyValue("l_SBCNT_PUCH_TYP_CD", key.getl_SBCNT_PUCH_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_CD") && key.getl_INV_CTRL_FLG_CD() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG_CD", key.getl_INV_CTRL_FLG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_SLIP_TYP_CD") && key.getl_SLIP_TYP_CD() != null) {
					msgKey.setKeyValue("l_SLIP_TYP_CD", key.getl_SLIP_TYP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG_CD") && key.getl_PUCH_RTN_FLG_CD() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_FLG_CD", key.getl_PUCH_RTN_FLG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_AI_AP_IF_FLG") && key.getl_AI_AP_IF_FLG() != null) {
					msgKey.setKeyValue("l_AI_AP_IF_FLG", key.getl_AI_AP_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("RAPPR") && key.getRAPPR() != null) {
					msgKey.setKeyValue("RAPPR", key.getRAPPR());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_DATE_FROM") && key.getINSPC_DATE_FROM() != null) {
					msgKey.setKeyValue("INSPC_DATE_FROM", key.getINSPC_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("INSPC_DATE_TO") && key.getINSPC_DATE_TO() != null) {
					msgKey.setKeyValue("INSPC_DATE_TO", key.getINSPC_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("DIRECT_FLG") && key.getDIRECT_FLG() != null) {
					msgKey.setKeyValue("DIRECT_FLG", key.getDIRECT_FLG());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("APPR_POWER_TYP") && key.getAPPR_POWER_TYP() != null) {
					msgKey.setKeyValue("APPR_POWER_TYP", key.getAPPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
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
					AE0150010Struct key = new AE0150010Struct();
					if(msgKeyType.containsKeyColumn("r_APPR_1")) {
						key.setr_APPR_1(msgKey.getKeyValue("r_APPR_1"));
					}
					if(msgKeyType.containsKeyColumn("r_APPR_2")) {
						key.setr_APPR_2(msgKey.getKeyValue("r_APPR_2"));
					}
					if(msgKeyType.containsKeyColumn("r_APPR_3")) {
						key.setr_APPR_3(msgKey.getKeyValue("r_APPR_3"));
					}
					if(msgKeyType.containsKeyColumn("r_APPR_4")) {
						key.setr_APPR_4(msgKey.getKeyValue("r_APPR_4"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP")) {
						key.seth_APPR_POWER_TYP(msgKey.getKeyValue("h_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CRCT_TYP")) {
						key.setl_CRCT_TYP(msgKey.getKeyValue("l_CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP")) {
						key.setl_PRODUCT_TYP(msgKey.getKeyValue("l_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP")) {
						key.setl_UNIT_COST_TYP(msgKey.getKeyValue("l_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP")) {
						key.setl_SBCNT_PUCH_TYP(msgKey.getKeyValue("l_SBCNT_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG")) {
						key.setl_INV_CTRL_FLG(msgKey.getKeyValue("l_INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_SLIP_TYP")) {
						key.setl_SLIP_TYP(msgKey.getKeyValue("l_SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG")) {
						key.setl_PUCH_RTN_FLG(msgKey.getKeyValue("l_PUCH_RTN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_ROWNO")) {
						key.setl_ROWNO(msgKey.getKeyValue("l_ROWNO"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_ID")) {
						key.setl_APPR_ID(msgKey.getKeyValue("l_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_DATE")) {
						key.setl_APPR_DATE(msgKey.getKeyValue("l_APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE")) {
						key.setl_RESERVE_CAUSE(msgKey.getKeyValue("l_RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_NO")) {
						key.setl_ACPT_NO(msgKey.getKeyValue("l_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_NO")) {
						key.setl_INSPC_ACPT_NO(msgKey.getKeyValue("l_INSPC_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CRCT_TYP_CD")) {
						key.setl_CRCT_TYP_CD(msgKey.getKeyValue("l_CRCT_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_DATE")) {
						key.setl_INSPC_ACPT_DATE(msgKey.getKeyValue("l_INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_DATE")) {
						key.setl_ACPT_DATE(msgKey.getKeyValue("l_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_NAME")) {
						key.setl_VEND_NAME(msgKey.getKeyValue("l_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_NAME")) {
						key.setl_PLANT_NAME(msgKey.getKeyValue("l_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_GNR_ORG_CD")) {
						key.setl_GNR_ORG_CD(msgKey.getKeyValue("l_GNR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_GNR_ORG_NAME")) {
						key.setl_GNR_ORG_NAME(msgKey.getKeyValue("l_GNR_ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_CD")) {
						key.setl_DLV_CD(msgKey.getKeyValue("l_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PRODUCT_TYP_CD")) {
						key.setl_PRODUCT_TYP_CD(msgKey.getKeyValue("l_PRODUCT_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_CD")) {
						key.setl_WORK_IN_PROC_CD(msgKey.getKeyValue("l_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_CD")) {
						key.setl_UNIT_COST_TYP_CD(msgKey.getKeyValue("l_UNIT_COST_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PROCESSING_COST")) {
						key.setl_PROCESSING_COST(msgKey.getKeyValue("l_PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_MATERIAL_COST")) {
						key.setl_MATERIAL_COST(msgKey.getKeyValue("l_MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_OTHER_OVERHEADS")) {
						key.setl_OTHER_OVERHEADS(msgKey.getKeyValue("l_OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_QTY_2")) {
						key.setl_ACPT_QTY_2(msgKey.getKeyValue("l_ACPT_QTY_2"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_QTY")) {
						key.setl_INSPC_ACPT_QTY(msgKey.getKeyValue("l_INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_ACPT_AMOUNT")) {
						key.setl_INSPC_ACPT_AMOUNT(msgKey.getKeyValue("l_INSPC_ACPT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT")) {
						key.setl_DISC_AMOUNT(msgKey.getKeyValue("l_DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DETAIL_NO")) {
						key.setl_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("l_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_MANAGEMENT_CD")) {
						key.setl_MANAGEMENT_CD(msgKey.getKeyValue("l_MANAGEMENT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SBCNT_PUCH_TYP_CD")) {
						key.setl_SBCNT_PUCH_TYP_CD(msgKey.getKeyValue("l_SBCNT_PUCH_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_CD")) {
						key.setl_INV_CTRL_FLG_CD(msgKey.getKeyValue("l_INV_CTRL_FLG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_SLIP_TYP_CD")) {
						key.setl_SLIP_TYP_CD(msgKey.getKeyValue("l_SLIP_TYP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_FLG_CD")) {
						key.setl_PUCH_RTN_FLG_CD(msgKey.getKeyValue("l_PUCH_RTN_FLG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_AI_AP_IF_FLG")) {
						key.setl_AI_AP_IF_FLG(msgKey.getKeyValue("l_AI_AP_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("RAPPR")) {
						key.setRAPPR(msgKey.getKeyValue("RAPPR"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_DATE_FROM")) {
						key.setINSPC_DATE_FROM(msgKey.getKeyValue("INSPC_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_DATE_TO")) {
						key.setINSPC_DATE_TO(msgKey.getKeyValue("INSPC_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("DIRECT_FLG")) {
						key.setDIRECT_FLG(msgKey.getKeyValue("DIRECT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("APPR_POWER_TYP")) {
						key.setAPPR_POWER_TYP(msgKey.getKeyValue("APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
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
