/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0040/src/com/nec/jp/orteus/metamorBase/KQ0040/KQ0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0040;

import com.nec.jp.orteus.metamorBase.KQ0040.*;
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
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KQ0040010Control
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
        public KQ0040010Struct getListvalue(int x) { return (KQ0040010Struct)(this.list.get(x)); }	// リストの値（メディエータ）を返します。
       
        public KQ0040010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        //業務日付
        private String BUSINESSOPRDATE;
        public void setBUSINESSOPRDATE(String name) { this.BUSINESSOPRDATE = name; };
        public String getBUSINESSOPRDATE() { return this.BUSINESSOPRDATE; };
       
        //会社コード
        private String COMPANY_CD;
        public void setCOMPANY_CD(String name) { this.COMPANY_CD = name; };
        public String getCOMPANY_CD() { return this.COMPANY_CD; };
       
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
	/**
     * エラー詳細設定
     */
    private void setMessage()
    {
    	ExpjMessage emsg;
    	emsg = new ExpjMessage( "ZZ01006","CUST_CD:" + struct.getIN_CUST_CD() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","CUST_ITEM_CD:" + struct.getIN_CUST_ITEM_CD() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","CUST_CHRG_PSN_CD:" + struct.getIN_CUST_CHRG_PSN_CD() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","CUST_ODR_NO:" + struct.getIN_CUST_ODR_NO() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(FROM):" + struct.getFROM_DESINATED_DLV_DATE() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(TO):" + struct.getTO_DESINATED_DLV_DATE() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(FROM):" + struct.getFROM_ODR_ACPT_DATE() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(TO):" + struct.getTO_ODR_ACPT_DATE() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","ODR_TYP(1):" + struct.getIN_ODR_TYP_1() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","ODR_TYP(2):" + struct.getIN_ODR_TYP_2() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","ODR_TYP(3):" + struct.getIN_ODR_TYP_3() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
        emsg = new ExpjMessage( "ZZ01006","COMPANY_CD:" + struct.getIN_COMPANY_CD() );
        sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
    }
        // TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
                 // TODO: ユーザ定義のコードを記述してください
                 if (list != null) {
                  list.clear();
                 } else {
                  list = new ArrayList(0);
                 }
              
                 // CSVダウンロードファイルのクリア
                 struct.setDOWNLOAD_FILE(null);
              
                 try {
                 //内示と確定注文は同時にチェックされて、チェックされない場合は
                 if (!struct.getCHECK_1().equals("true") && !struct.getCHECK_2().equals("true") && !struct.getCHECK_4().equals("true")){
                  ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
                  msgStruct.addError( emsg ); // エラーメッセージとして登録
                  sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
                  emsg = new ExpjMessage( "ZZ01006","CHECK_1:" + struct.getCHECK_1() );
                  sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","CHECK_2:" + struct.getCHECK_2() );
                  sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","CHECK_4:" + struct.getCHECK_4() );
                  sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
              
                  setReadStatus(NOT_FOUND);
                  return;
                 }
              
                 struct.setIN_ODR_TYP_1(null);
                 struct.setIN_ODR_TYP_2(null);
                 struct.setIN_ODR_TYP_3(null);
                 if(struct.getCHECK_1().equals("true")){
                  //内示はチェックされる場合は
                  struct.setIN_ODR_TYP_1("2");
                 }
                 if(struct.getCHECK_2().equals("true")){
                  //確定注文はチェックされる場合は
                  struct.setIN_ODR_TYP_2("3");
                 }
                 //Add Anken Start 20140414 liang-l
                 else{
                	 struct.setIN_ODR_TYP_2("0");
                 }
                 //Add Anken End   20140414 liang-l
                 if(struct.getCHECK_4().equals("true")){
                  //見込はチェックされる場合は
                  struct.setIN_ODR_TYP_3("1");
                 }
                 //Add Anken Start 20140414 liang-l
                 if(struct.getCHECK_PRO_ODR().equals("true")){
                     //案件受注を含めるはチェックされる場合は
                     struct.setIN_PRO_ODR("1");
                 }else{
                	 struct.setIN_PRO_ODR("0");
                 }
                 //Add Anken End   20140414 liang-l
                 
                 struct.setIN_COMPANY_CD(this.getCOMPANY_CD());
              
                 setReadStatus(INITIAL );
                //最大表示行数
             	int maxLine = sp.getMaxLine(conn, 10);
             	if (maxLine != 0)
             		struct.setROW_COUNT(String.valueOf(maxLine));
             	else
             		struct.setROW_COUNT(null);
                //Add Anken Start 20140414 liang-l
                //「案件受注を含める」が選択されている場合
                //[受注明細].”受注番号” で、[案件受注紐付].’受注番号’が存在する場合、一覧表の右の案件列に案件情報を表示する。
             	//[受注管理] [受注明細] [案件受注紐付] より抽出するデータと[非在庫受注] [案件受注紐付] より抽出するデータをマージして抽出する。
                //ただし、[非在庫受注] [案件受注紐付] より抽出するデータは、確定受注のチェックボックスがOnの場合のみ
                if("1".equals(struct.getIN_PRO_ODR())){
                //Add Anken End   20140414 liang-l
                	list = entity.mSelectCnt.read(conn, struct);
                	long rowCount = Long.parseLong(((KQ0040010Struct) list.get(0)).getl_COUNT());

                	if(rowCount ==0){
                		//データが存在しない
                		ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
                		msgStruct.addError( emsg ); // エラーメッセージとして登録
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
                		emsg = new ExpjMessage( "ZZ01006","CUST_CD:" + struct.getIN_CUST_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","CUST_ITEM_CD:" + struct.getIN_CUST_ITEM_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","CUST_CHRG_PSN_CD:" + struct.getIN_CUST_CHRG_PSN_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","CUST_ODR_NO:" + struct.getIN_CUST_ODR_NO() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(FROM):" + struct.getFROM_DESINATED_DLV_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(TO):" + struct.getTO_DESINATED_DLV_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(FROM):" + struct.getFROM_ODR_ACPT_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(TO):" + struct.getTO_ODR_ACPT_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_TYP(1):" + struct.getIN_ODR_TYP_1() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_TYP(2):" + struct.getIN_ODR_TYP_2() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_TYP(3):" + struct.getIN_ODR_TYP_3() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","COMPANY_CD:" + struct.getIN_COMPANY_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
              
                		setReadStatus(NOT_FOUND);
                		if(list!=null && list.size()>0){
                			list.clear();
                		}
                		return;
                	}
               
                	//Mod Anken Start 20140414 liang-l
                	//if(maxLine != 0 && rowCount == maxLine+1){
                	if(maxLine != 0 && rowCount >= maxLine+1){
                	//Mod Anken End   20140414 liang-l
                		ExpjMessage emsg = new ExpjMessage( "ZZ01115" ,"" + maxLine);
                		msgStruct.addError( emsg ); // エラーメッセージとして登録
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
                		emsg = new ExpjMessage( "ZZ01006","CUST_CD:" + struct.getIN_CUST_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","CUST_ITEM_CD:" + struct.getIN_CUST_ITEM_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","CUST_CHRG_PSN_CD:" + struct.getIN_CUST_CHRG_PSN_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","CUST_ODR_NO:" + struct.getIN_CUST_ODR_NO() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(FROM):" + struct.getFROM_DESINATED_DLV_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(TO):" + struct.getTO_DESINATED_DLV_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(FROM):" + struct.getFROM_ODR_ACPT_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(TO):" + struct.getTO_ODR_ACPT_DATE() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_TYP(1):" + struct.getIN_ODR_TYP_1() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_TYP(2):" + struct.getIN_ODR_TYP_2() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","ODR_TYP(3):" + struct.getIN_ODR_TYP_3() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
                		emsg = new ExpjMessage( "ZZ01006","COMPANY_CD:" + struct.getIN_COMPANY_CD() );
                		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
              
                		setReadStatus(TOO_MANY);
                		if(list !=null && list.size()>0){
                			list.clear();
                		}
                		return;
                	}
                	list = entity.mSelect.read(conn, struct);
                 //Add Anken Start 20140414 liang-l
                 }else{
                	//「案件受注を含める」が選択されていない場合
                	//[受注明細].”受注番号” で、[案件受注紐付].”受注番号”が存在する場合、読み飛ばしとして表示しない
                	//[受注管理] [受注明細] [案件受注紐付] より抽出するデータと[非在庫受注] [案件受注紐付] より抽出するデータをマージして抽出する。
                    //ただし、[非在庫受注] [案件受注紐付] より抽出するデータは、確定受注のチェックボックスがOnの場合のみ
                	list = entity.mSelectCntP.read(conn, struct);
                 	long rowCount = Long.parseLong(((KQ0040010Struct) list.get(0)).getl_COUNT());

                 	if(rowCount ==0){
                 		//データが存在しない
                 		ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
                 		msgStruct.addError( emsg ); // エラーメッセージとして登録
                 		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
                 		setMessage();
               
                 		setReadStatus(NOT_FOUND);
                 		if(list!=null && list.size()>0){
                 			list.clear();
                 		}
                 		return;
                 	}
                
                 	if(maxLine != 0 && rowCount >= maxLine+1){
                 		ExpjMessage emsg = new ExpjMessage( "ZZ01115" ,"" + maxLine);
                 		msgStruct.addError( emsg ); // エラーメッセージとして登録
                 		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
                 		setMessage();
               
                 		setReadStatus(TOO_MANY);
                 		if(list !=null && list.size()>0){
                 			list.clear();
                 		}
                 		return;
                 	}
                 	list = entity.mSelectP.read(conn, struct);
                 }
                 //Add Anken End   20140414 liang-l
                 KQ0040010Struct tempStruct ;
                 ExchAmount ex = new ExchAmount(conn);	//インスタンス生成
              
                 for (int i = 0; i < getListsize(); i++) {
                  tempStruct = (KQ0040010Struct) list.get(i);
                  tempStruct.setODR_TYP(this.multcombo("ODR_ODR_TYP",tempStruct.getODR_TYP()));
                  tempStruct.setDEPO_TYP(this.multcombo("DEPO_TYP",tempStruct.getDEPO_TYP()));
                  if(tempStruct.getUNCONFIRM_ODR_AMOUNT() != null){
                   if(ex.doMarume(tempStruct.getUNCONFIRM_ODR_AMOUNT(), this.getCOMPANY_CD(),
                      tempStruct.getCURRNCY_CD(), tempStruct.getEXCH_TYP(),
                      tempStruct.getROUND_TYP(), this.getBUSINESSOPRDATE())){
                     //処理が正常の場合変換値を取得する。
                    tempStruct.setUNCONFIRM_ODR_AMOUNT(ex.getS_EXCH_AMOUNT());	//円貨された結果
                   }
                  }
                 }
                 setReadStatus(NORMAL);
                } catch(SQLException e) {
                 e.printStackTrace();
                 // エラー処理を記述してください。
                 setReadStatus(ERROR);
                }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                 // TODO: ユーザ定義のコードを記述してください
                 readStatus = INITIAL;
              
                 if (list != null) {
                  list.clear();
                 }
                 // structのクリア
                 struct.clear();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
                 // TODO: ユーザ定義のコードを記述してください
                csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
              
                List csvList = new ArrayList();
                //CSV情報の作成
                String csvTitle[] = {
                	"Expj.ODR_TYP" ,
					"Expj.CUST_ODR_NO" ,
					"Expj.CUST_CD" ,
					"Expj.CUST_NAME" ,
					"Expj.CUST_ITEM_CD" ,
					"Expj.CUST_ITEM_NAME" ,
					"Expj.Cmt0468" ,
					"Expj.ODR_ACPT_PSN" ,
					"Expj.DESINATED_DLV_DATE" ,
					"Expj.ODR_ACPT_DATE" ,
					"Expj.ITEM_CD" ,
					"Expj.ITEM_NAME" ,
					"Expj.ODR_QTY_4" ,
					"Expj.PUCH_ODR_UNIT" ,
					"Expj.ACTUAL_UNIT_PRICE" ,
					"Expj.ODR_AMOUNT" ,
					"Expj.CUR_UNIT" ,
					"Expj.REMAIN_UNCONFIRM_ODR_QTY" ,
					"Expj.UNCONFIRM_ODR_BALANCE" ,
					"Expj.UNCONFIRM_ODR_AMOUNT" ,
					"Expj.Cmt0469" ,
					"Expj.DEPO_TYP" ,
					"Expj.ACPT_ODR_CD" ,
					"Expj.JOB_ODR_CD",
					//Add Anken Start 20140414 liang-l
					"Expj.PROJECT_CD" ,
					"Expj.ESTIMATES_CD" ,
					"Expj.DETAIL_NO"
					//Add Anken End   20140414 liang-l
                     };
                csvList.add(csvTitle);
                KQ0040010Struct workStruct;
                for(int i=0; i<getListsize() ;i++){
                 workStruct = getListvalue(i);
                 String csvStr [] = new String[csvTitle.length];
                 csvStr[0] = workStruct.getODR_TYP();
                 csvStr[1] = workStruct.getCUST_ODR_NO();
                 csvStr[2] = workStruct.getCUST_CD();
                 csvStr[3] = workStruct.getCUST_NAME();
                 csvStr[4] = workStruct.getCUST_ITEM_CD();
                 csvStr[5] = workStruct.getCUST_ITEM_NAME();
                 csvStr[6] = workStruct.getCUST_CHRG_PSN_CD();
                 csvStr[7] = workStruct.getODR_ACPT_PSN_CD();
                 csvStr[8] = workStruct.getDESINATED_DLV_DATE();
                 csvStr[9] = workStruct.getODR_ACPT_DATE();
                 csvStr[10] = workStruct.getITEM_CD();
                 csvStr[11] = workStruct.getITEM_NAME();
                 csvStr[12] = workStruct.getODR_QTY();
                 csvStr[13] = workStruct.getUNIT_NAME();
                 csvStr[14] = workStruct.getODR_UNIT_PRICE();
                 csvStr[15] = workStruct.getODR_AMOUNT();
                 csvStr[16] = workStruct.getCUR_UNIT();
                 csvStr[17] = workStruct.getREMAIN_UNCONFIRM_ODR_QTY();
                 csvStr[18] = workStruct.getUNCONFIRM_ODR_BALANCE();
                 csvStr[19] = workStruct.getUNCONFIRM_ODR_QTY();
                 csvStr[20] = workStruct.getUNCONFIRM_ODR_AMOUNT();
                 csvStr[21] = workStruct.getDEPO_TYP();
                 csvStr[22] = workStruct.getODR_NO();
                 csvStr[23] = workStruct.getJOB_ODR_CD();
                 //Add Anken Start 20140414 liang-l
                 csvStr[24] = workStruct.getPROJECT_CD();
                 csvStr[25] = workStruct.getESTIMATE_NO();
                 csvStr[26] = workStruct.getDETAL_NO();
                 //Add Anken End   20140414 liang-l
                 csvList.add(csvStr);
                }
              
                if(csvList != null && csvList.size() > 0){
                 try{
                  csvWriter.write(csvList,CoreTools.getLocale(struct.getsUser_ID()),true);
                  struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
                 }catch(Exception e){
                  //CSV出力失敗
                  ExpjMessage emsg = new ExpjMessage("ZZ01107");
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(e, emsg);
                  emsg = new ExpjMessage( "ZZ01006","CUST_CD:" + struct.getIN_CUST_CD() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","CUST_ITEM_CD:" + struct.getIN_CUST_ITEM_CD() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","CUST_CHRG_PSN_CD:" + struct.getIN_CUST_CHRG_PSN_CD() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","CUST_ODR_NO:" + struct.getIN_CUST_ODR_NO() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(FROM):" + struct.getFROM_DESINATED_DLV_DATE() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","DESINATED_DLV_DATE(TO):" + struct.getTO_DESINATED_DLV_DATE() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(FROM):" + struct.getFROM_ODR_ACPT_DATE() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","ODR_ACPT_DATE(TO):" + struct.getTO_ODR_ACPT_DATE() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","ODR_TYP(1):" + struct.getIN_ODR_TYP_1() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","ODR_TYP(2):" + struct.getIN_ODR_TYP_2() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","ODR_TYP(3):" + struct.getIN_ODR_TYP_3() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
                  emsg = new ExpjMessage( "ZZ01006","COMPANY_CD:" + struct.getIN_COMPANY_CD() );
                  sysLog.severe(emsg, getsysUSER_CD()); //エラー詳細
              
                  throw ee;
                 }
                }
                setReadStatus(NORMAL);
              
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * 受注情報修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoSub() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub");
			//{{user_implement_dev:<controlGoSub>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoSub>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub");

		return;
	}

	/**
	 * 案件受注修正(非在庫品)ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoSub2() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub2");
			//{{user_implement_dev:<controlGoSub2>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoSub2>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub2");

		return;
	}

	/**
	 * 案件受注修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoSub3() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub3");
			//{{user_implement_dev:<controlGoSub3>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoSub3>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlGoSub3");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                // TODO: ユーザ定義のコードを記述してください
                try{
                 readStatus = INITIAL;
                 struct.setDOWNLOAD_FILE(null);
              
                    // 業務日付の取得
                 List listGyomuDate = entity.mselectSYS_DATE_CTRL.read(conn,struct);
                 if(listGyomuDate == null || listGyomuDate.size() != 1){
                  //業務日付情報が無い/複数件
                  //エラーメッセージ出力
                  ExpjMessage emsg = new ExpjMessage("KQ00026");
                  msgStruct.addError(emsg);
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException("KQ00026");
                  throw ee;
                 }else{
                  struct.setIN_BUSINESS_OPR_DATE(((KQ0040010Struct)listGyomuDate.get(0)).getIN_BUSINESS_OPR_DATE());
                  this.setBUSINESSOPRDATE(((KQ0040010Struct)listGyomuDate.get(0)).getIN_BUSINESS_OPR_DATE());
                  //工場コードを保存
                  this.setsysPLANT_CD(((KQ0040010Struct)listGyomuDate.get(0)).getPLANT_CD());
                 }
                 listGyomuDate = null;
              
                 // 会社コードの取得
                 List listKaisyaCd = entity.mselectSYS_MY_COMPANY.read(conn,struct);
                 if(listKaisyaCd == null || listKaisyaCd.size() != 1){
                  //会社情報が無い/複数件
                  //エラーメッセージ出力
                  ExpjMessage emsg = new ExpjMessage("KQ00039");
                  msgStruct.addError(emsg);
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException("KQ00039");
                  throw ee;
                  }else{
                   struct.setIN_COMPANY_CD(((KQ0040010Struct)listKaisyaCd.get(0)).getIN_COMPANY_CD());
                   this.setCOMPANY_CD(((KQ0040010Struct)listKaisyaCd.get(0)).getIN_COMPANY_CD());
                  }
                  listKaisyaCd = null;
                }catch(SQLException e){
                 e.printStackTrace();
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0040");
		logger.entering("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("KQ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("GoSub") ) {
				controlGoSub();
			} else if( button.equals("GoSub2") ) {
				controlGoSub2();
			} else if( button.equals("GoSub3") ) {
				controlGoSub3();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("KQ0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0040010-E999","CSVの出力処理"));
			throw new FoundationException("KQ0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0040010-E999","システム日付の取得処理"));
				throw new FoundationException("KQ0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("KQ0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KQ0040010Entity entity;
	protected KQ0040010Struct struct;
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

		entity = new KQ0040010Entity();
		struct = new KQ0040010Struct();

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
	 * KQ0040010クラスの標準コンストラクタ
	 */
	public KQ0040010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                 // TODO: ここに初期処理を記述してください
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
				KQ0040010Struct key = (KQ0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CHECK_1") && key.getCHECK_1() != null) {
					msgKey.setKeyValue("CHECK_1", key.getCHECK_1());
				}
				if(msgKeyType.containsKeyColumn("CHECK_2") && key.getCHECK_2() != null) {
					msgKey.setKeyValue("CHECK_2", key.getCHECK_2());
				}
				if(msgKeyType.containsKeyColumn("CHECK_4") && key.getCHECK_4() != null) {
					msgKey.setKeyValue("CHECK_4", key.getCHECK_4());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("CHECK_PRO_ODR") && key.getCHECK_PRO_ODR() != null) {
					msgKey.setKeyValue("CHECK_PRO_ODR", key.getCHECK_PRO_ODR());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE") && key.getw_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("w_BUSINESS_OPR_DATE", key.getw_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMPANY_CD") && key.getw_COMPANY_CD() != null) {
					msgKey.setKeyValue("w_COMPANY_CD", key.getw_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PRO_ODR") && key.getIN_PRO_ODR() != null) {
					msgKey.setKeyValue("IN_PRO_ODR", key.getIN_PRO_ODR());
				}
				if(msgKeyType.containsKeyColumn("ODR_TYP") && key.getODR_TYP() != null) {
					msgKey.setKeyValue("ODR_TYP", key.getODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_NAME") && key.getUNIT_NAME() != null) {
					msgKey.setKeyValue("UNIT_NAME", key.getUNIT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY") && key.getREMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("REMAIN_UNCONFIRM_ODR_QTY", key.getREMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE") && key.getUNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_BALANCE", key.getUNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_QTY") && key.getUNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_QTY", key.getUNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_AMOUNT") && key.getUNCONFIRM_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_AMOUNT", key.getUNCONFIRM_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRMED_ODR_EFF_OVR_FLG") && key.getUNCONFIRMED_ODR_EFF_OVR_FLG() != null) {
					msgKey.setKeyValue("UNCONFIRMED_ODR_EFF_OVR_FLG", key.getUNCONFIRMED_ODR_EFF_OVR_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAL_NO") && key.getDETAL_NO() != null) {
					msgKey.setKeyValue("DETAL_NO", key.getDETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("PRO_FLG") && key.getPRO_FLG() != null) {
					msgKey.setKeyValue("PRO_FLG", key.getPRO_FLG());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_CD") && key.getIN_CUST_CD() != null) {
					msgKey.setKeyValue("IN_CUST_CD", key.getIN_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD") && key.getIN_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_CUST_ITEM_CD", key.getIN_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_CHRG_PSN_CD") && key.getIN_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("IN_CUST_CHRG_PSN_CD", key.getIN_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_ODR_NO") && key.getIN_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("IN_CUST_ODR_NO", key.getIN_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("FROM_DESINATED_DLV_DATE") && key.getFROM_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("FROM_DESINATED_DLV_DATE", key.getFROM_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("TO_DESINATED_DLV_DATE") && key.getTO_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("TO_DESINATED_DLV_DATE", key.getTO_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("FROM_ODR_ACPT_DATE") && key.getFROM_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("FROM_ODR_ACPT_DATE", key.getFROM_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("TO_ODR_ACPT_DATE") && key.getTO_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("TO_ODR_ACPT_DATE", key.getTO_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_ODR_TYP_1") && key.getIN_ODR_TYP_1() != null) {
					msgKey.setKeyValue("IN_ODR_TYP_1", key.getIN_ODR_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("IN_ODR_TYP_2") && key.getIN_ODR_TYP_2() != null) {
					msgKey.setKeyValue("IN_ODR_TYP_2", key.getIN_ODR_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("IN_ODR_TYP_3") && key.getIN_ODR_TYP_3() != null) {
					msgKey.setKeyValue("IN_ODR_TYP_3", key.getIN_ODR_TYP_3());
				}
				if(msgKeyType.containsKeyColumn("IN_COMPANY_CD") && key.getIN_COMPANY_CD() != null) {
					msgKey.setKeyValue("IN_COMPANY_CD", key.getIN_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_BUSINESS_OPR_DATE") && key.getIN_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("IN_BUSINESS_OPR_DATE", key.getIN_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					KQ0040010Struct key = new KQ0040010Struct();
					if(msgKeyType.containsKeyColumn("CHECK_1")) {
						key.setCHECK_1(msgKey.getKeyValue("CHECK_1"));
					}
					if(msgKeyType.containsKeyColumn("CHECK_2")) {
						key.setCHECK_2(msgKey.getKeyValue("CHECK_2"));
					}
					if(msgKeyType.containsKeyColumn("CHECK_4")) {
						key.setCHECK_4(msgKey.getKeyValue("CHECK_4"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("CHECK_PRO_ODR")) {
						key.setCHECK_PRO_ODR(msgKey.getKeyValue("CHECK_PRO_ODR"));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE")) {
						key.setw_BUSINESS_OPR_DATE(msgKey.getKeyValue("w_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMPANY_CD")) {
						key.setw_COMPANY_CD(msgKey.getKeyValue("w_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PRO_ODR")) {
						key.setIN_PRO_ODR(msgKey.getKeyValue("IN_PRO_ODR"));
					}
					if(msgKeyType.containsKeyColumn("ODR_TYP")) {
						key.setODR_TYP(msgKey.getKeyValue("ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_NAME")) {
						key.setUNIT_NAME(msgKey.getKeyValue("UNIT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("REMAIN_UNCONFIRM_ODR_QTY")) {
						key.setREMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_BALANCE")) {
						key.setUNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("UNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_QTY")) {
						key.setUNCONFIRM_ODR_QTY(msgKey.getKeyValue("UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_AMOUNT")) {
						key.setUNCONFIRM_ODR_AMOUNT(msgKey.getKeyValue("UNCONFIRM_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRMED_ODR_EFF_OVR_FLG")) {
						key.setUNCONFIRMED_ODR_EFF_OVR_FLG(msgKey.getKeyValue("UNCONFIRMED_ODR_EFF_OVR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAL_NO")) {
						key.setDETAL_NO(msgKey.getKeyValue("DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PRO_FLG")) {
						key.setPRO_FLG(msgKey.getKeyValue("PRO_FLG"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_CD")) {
						key.setIN_CUST_CD(msgKey.getKeyValue("IN_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD")) {
						key.setIN_CUST_ITEM_CD(msgKey.getKeyValue("IN_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_CHRG_PSN_CD")) {
						key.setIN_CUST_CHRG_PSN_CD(msgKey.getKeyValue("IN_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_ODR_NO")) {
						key.setIN_CUST_ODR_NO(msgKey.getKeyValue("IN_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("FROM_DESINATED_DLV_DATE")) {
						key.setFROM_DESINATED_DLV_DATE(msgKey.getKeyValue("FROM_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TO_DESINATED_DLV_DATE")) {
						key.setTO_DESINATED_DLV_DATE(msgKey.getKeyValue("TO_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ODR_ACPT_DATE")) {
						key.setFROM_ODR_ACPT_DATE(msgKey.getKeyValue("FROM_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TO_ODR_ACPT_DATE")) {
						key.setTO_ODR_ACPT_DATE(msgKey.getKeyValue("TO_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_ODR_TYP_1")) {
						key.setIN_ODR_TYP_1(msgKey.getKeyValue("IN_ODR_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("IN_ODR_TYP_2")) {
						key.setIN_ODR_TYP_2(msgKey.getKeyValue("IN_ODR_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("IN_ODR_TYP_3")) {
						key.setIN_ODR_TYP_3(msgKey.getKeyValue("IN_ODR_TYP_3"));
					}
					if(msgKeyType.containsKeyColumn("IN_COMPANY_CD")) {
						key.setIN_COMPANY_CD(msgKey.getKeyValue("IN_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_BUSINESS_OPR_DATE")) {
						key.setIN_BUSINESS_OPR_DATE(msgKey.getKeyValue("IN_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
