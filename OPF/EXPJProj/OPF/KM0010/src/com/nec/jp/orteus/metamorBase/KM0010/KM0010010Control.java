/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0010/src/com/nec/jp/orteus/metamorBase/KM0010/KM0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0010;

import com.nec.jp.orteus.metamorBase.KM0010.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
import com.nec.jp.orteus.metamorBase.common08.ClassMaster.ClassMaster;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0010010Control クラス
 * ファイル・クラス説明
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 02:13:27 $
 *
 */
//}}user_implement_code_header

public class KM0010010Control
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
	public KM0010010Struct getListvalue(int x) { return (KM0010010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KM0010010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KM0010010Struct createStruct() { return new KM0010010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KM0010010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	
	// 自社情報
	private String COMPANY_CD = null;
	
	/** 業務運用日 */
	private String _businessOprDate;
    // 業務運用日をゲット
	public String get_businessOprDate() {
		return _businessOprDate;
	}
	// 業務運用日をセット	
	public void set_businessOprDate(String oprDate) {
		_businessOprDate = oprDate;
	}
	//---------- コンボボックスデータ-- --------------------------------------------
	/** 案件ステータス */
	private ComboStruct _PROJECT_STAT= new ComboStruct();

	/** 案件ステータス設定
	 * @param コンボボックスデータ
	*/
	public void setPROJECT_STAT(ComboStruct combo){ _PROJECT_STAT= combo; }

	/** 案件ステータス取得
	 * @return 案件ステータスのコンボボックスデータ
	*/
	public ComboStruct getPROJECT_STAT(){ return _PROJECT_STAT; }
	
	/** 確度 */
	private ComboStruct _ACCURACY_LEVEL= new ComboStruct();

	/** 確度設定
	 * @param コンボボックスデータ
	*/
	public void setACCURACY_LEVEL(ComboStruct combo){ _ACCURACY_LEVEL= combo; }

	/** 確度取得
	 * @return 確度のコンボボックスデータ
	*/
	public ComboStruct getACCURACY_LEVEL(){ return _ACCURACY_LEVEL; }
	
	/** 受注完了 */
	private ComboStruct _ODR_COMP_FLG= new ComboStruct();

	/** 受注完了設定
	 * @param コンボボックスデータ
	*/
	public void setODR_COMP_FLG(ComboStruct combo){ _ODR_COMP_FLG= combo; }

	/** 受注完了取得
	 * @return 受注完了のコンボボックスデータ
	*/
	public ComboStruct getODR_COMP_FLG(){ return _ODR_COMP_FLG; }
	
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
	
	/**  分類マスタ名 */
	private String _PJ_CLASS_01_TYP = new String();
	
	private String _PJ_CLASS_02_TYP = new String();
	
	private String _PJ_CLASS_03_TYP = new String();
	
	private String _PJ_CLASS_04_TYP = new String();
	
	private String _PJ_CLASS_05_TYP = new String();
	
	private String _PJ_CLASS_06_TYP = new String();
	
	private String _PJ_CLASS_07_TYP = new String();
	
	private String _PJ_CLASS_08_TYP = new String();
	
	private String _PJ_CLASS_09_TYP = new String();
	
	private String _PJ_CLASS_10_TYP = new String();
	
	private String _PJ_CLASS_11_TYP = new String();
	
	private String _PJ_CLASS_12_TYP = new String();
	//-----------画面の詳細項目を初期化------------------------------------------
    /**
     * 画面の詳細項目を初期化します。
     */
    private void initializeDetail(){
    	struct.setPROJECT_CD_FLG("false");
    	struct.setOD_COMP_FLG("false");
    	struct.setVend_Date(_businessOprDate);
    	struct.setPJ_USER_CD(sysUSER_CD);
    	struct.setCOMPANY_CD(COMPANY_CD);
    }
	
	//---------- メッセージ関連の処理-- --------------------------------------------
	
	String keyMessage = "";
	/**
	 * Exceptionメッセージ設定
	 * @param キー項目
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		throw ee;
	}
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setErrorMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
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
	
	//---------- 案件チェック処理 ----------------------
	/**
	 * 登録、更新ボタン押下時チェック
	 * @param なし
	 * @throws SQLException、FoundationException 
	 * @return boolean true:OK false:NG
	 * @throws java.text.ParseException 
	 * @throws DataNotFoundException 
	 */
	public boolean operateCheck(String operateId) throws SQLException,FoundationException, java.text.ParseException, DataNotFoundException
	{
		boolean result = true; // チェック結果格納
		
		//同じ案件番号が存在チェック
		if(operateId.equals("insert")){
			List projectList = entity.mT_PROJECT.read(conn, struct);
			if(!projectList.isEmpty()){
				setErrorMessage("KM00004");
				result = false;
				return result;
		}
		
		}
		//得意先コード存在チェック
		 List custList = entity.mCkCust1.read(conn, struct);
		 if(custList.isEmpty()){
			 //得意先コードがマスタに存在しません。
			 setErrorMessage("KQ00014");
			 result = false;
			 return result;
		 }
		 if(struct.getDLV_LOC_CD() != null && !("".equals(struct.getDLV_LOC_CD()))){
			//納品場所コードがマスタに存在チェック
			 List DlvLocCdList = entity.mcheckDLV_LOC_CD.read(conn, struct);
			 if(DlvLocCdList.isEmpty()){
				 //納品場所コードがマスタに存在しません。
				 setErrorMessage("KQ00015");
				 result = false;
				 return result;
			 }
		 }
		 //部門コードが部門マスタに存在
		 if(struct.getPJ_ORG_CD() != null && !"".equals(struct.getPJ_ORG_CD()) ){
			 List OrgCdList = entity.mcheckORG.read(conn, struct);
			 if(OrgCdList.isEmpty()){
				 //部門コードが部門マスタに存在しません。
				 setErrorMessage("KM00006");
				 result = false;
				 return result;
			 }
		 }
		 //担当者コードがユーザマスタに存在しません。
		 if(struct.getPJ_USER_CD()!= null && !"".equals(struct.getPJ_USER_CD()) ){
			 List PJuserList = entity.mcheckUSER.read(conn, struct);
			 if(PJuserList.isEmpty()){
				 //担当者コードがユーザマスタに存在しません。
				 setErrorMessage("KM00013");
				 result = false;
				 return result;
			 } 
		 }
		 //通貨コードがマスタに存在チェック
		 List CurList = entity.mcheckM_cur.read(conn, struct);
		 if(CurList.isEmpty()){
			 //通貨コードがマスタに存在しません。
			 setErrorMessage("KQ00073");
			 result = false;
			 return result;
		 }
		 //案件分類コード存在チェック
		checkClass(struct);
		if(msgStruct.hasError()){
			result = false;
			return result;
		}
		 //[業務日付]情報を部品より取得
		 DateCtrlStruct dcs = DateCtrlControl.getData(conn, this.sysPLANT_CD);
		//想定納期チェック
			//[画面].“想定納期”＜業務日付の場合
			if(DateTool.compareYMD(struct.getAssumeDlv_date(), dcs.getBUSINESS_OPR_DATE())<0){
				 //想定納期が過去日です
				setWarningMessage("KM00023");
			 }
			//引合日チェック
			//[画面].“引合日”＞業務日付の場合
			if(DateTool.compareYMD(struct.getVend_Date(), dcs.getBUSINESS_OPR_DATE())>0){
				 //引合日が未来日です
				setWarningMessage("KM00024");
			 }
			//[画面].“引合日”＞[画面].“想定納期”
			if(DateTool.compareYMD(struct.getVend_Date(),struct.getAssumeDlv_date())>0){
				setErrorMessage("KM00051");
				result = false;
			}
		return result;
	}

	/**
	 * 排他チェック
	 * @return
	 * @throws FoundationException
	 * @throws SQLException
	 */
	public boolean exclusiveCheck() throws FoundationException, SQLException{
		boolean result = true;
		List list = entity.mT_PROJECT.read(conn, struct);
		if(list.size() <= 0){
			// エラーメッセージ作成
			setErrorMessage("ZZ06001");
			result = false;
		}
		else{
			String modify = ((KM0010010Struct)list.get(0)).geth_MODIFY_COUNT();
			if (struct.geth_MODIFY_COUNT().equals(modify) == false)
			{
				// エラーメッセージ作成
				setErrorMessage("ZZ01105");
				result = false;
			}
		}
		return result;
	}
	//------------------追加・更新時の分類マスタチェック-------------------------------------------------
	/** 
	 * 分類値チェック。
	 * NOT NULL項目に値が入っていない場合、値を存在チェックする
	 * @param Struct チェック対象のStruct
	 * @throws SQLException 
	 */
	private void checkClass(KM0010010Struct checkStruct) throws SQLException {
		try {
			// 品目分類01チェック
			if (checkStruct.getPJ_CLASS_01_CD() != null && !"".equals(checkStruct.getPJ_CLASS_01_CD())) {
				boolean checkResult01 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD01,checkStruct.getPJ_CLASS_01_CD());
				if (!checkResult01) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD01);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_01_NAME("");
				} 
			}
			// 品目分類02チェック
			if (struct.getPJ_CLASS_02_CD() != null && !"".equals(checkStruct.getPJ_CLASS_02_CD())) {
				boolean checkResult02 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD02, checkStruct.getPJ_CLASS_02_CD());
				if (!checkResult02) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD02);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_02_NAME("");
				}
			}
			
			// 品目分類03チェック
			if (checkStruct.getPJ_CLASS_03_CD() != null && !"".equals(checkStruct.getPJ_CLASS_03_CD())) {
				boolean checkResult03 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD03, checkStruct.getPJ_CLASS_03_CD());
				if (!checkResult03) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD03);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_03_NAME("");
				}
			}
			// 品目分類04チェック
			if (checkStruct.getPJ_CLASS_04_CD() != null && !"".equals(checkStruct.getPJ_CLASS_04_CD())) {
				boolean checkResult04 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD04, checkStruct.getPJ_CLASS_04_CD());
				if (!checkResult04) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD04);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_04_NAME("");
				}
			}
			// 品目分類05チェック
			if (checkStruct.getPJ_CLASS_05_CD() != null && !"".equals(checkStruct.getPJ_CLASS_05_CD())) {
				boolean checkResult05 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD05, checkStruct.getPJ_CLASS_05_CD());
				if (!checkResult05) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD05);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_05_NAME("");
				}
			}
			// 品目分類06チェック
			if (checkStruct.getPJ_CLASS_06_CD() != null && !"".equals(checkStruct.getPJ_CLASS_06_CD())) {
				boolean checkResult06 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD06, checkStruct.getPJ_CLASS_06_CD());
				if (!checkResult06) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD06);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_06_NAME("");
				}
			}	
			// 品目分類07チェック
			if (checkStruct.getPJ_CLASS_07_CD() != null && !"".equals(checkStruct.getPJ_CLASS_07_CD())) {
				boolean checkResult07 = ClassMaster.checkMclass(conn, KM0010Common.CLASS_CD,KM0010Common.CLASS_CD07, checkStruct.getPJ_CLASS_07_CD());
				if (!checkResult07) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD07);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_07_NAME("");
				}
			}	
			// 品目分類08チェック
			if (checkStruct.getPJ_CLASS_08_CD() != null && !"".equals(checkStruct.getPJ_CLASS_08_CD())) {
				boolean checkResult08 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD08, checkStruct.getPJ_CLASS_08_CD());
				if (!checkResult08) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD08);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_08_NAME("");
				}
			}	
			// 品目分類09チェック
			if (checkStruct.getPJ_CLASS_09_CD() != null && !"".equals(checkStruct.getPJ_CLASS_09_CD())) {
				boolean checkResult09 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD09, checkStruct.getPJ_CLASS_09_CD());
				if (!checkResult09) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD09);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_08_NAME("");
				}
			}	
			// 品目分類10チェック
			if (checkStruct.getPJ_CLASS_10_CD() != null && !"".equals(checkStruct.getPJ_CLASS_10_CD())) {
				boolean checkResult10 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD10, checkStruct.getPJ_CLASS_10_CD());
				if (!checkResult10) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD10);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_10_NAME("");
				}
			}	
			// 品目分類11チェック
			if (checkStruct.getPJ_CLASS_11_CD() != null && !"".equals(checkStruct.getPJ_CLASS_11_CD())) {
				boolean checkResult11 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD11, checkStruct.getPJ_CLASS_11_CD());
				if (!checkResult11) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD11);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_11_NAME("");
				}
			}	
			// 品目分類12チェック
			if (checkStruct.getPJ_CLASS_12_CD() != null && !"".equals(checkStruct.getPJ_CLASS_12_CD())) {
				boolean checkResult12 = ClassMaster.checkMclass(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD12,checkStruct.getPJ_CLASS_12_CD());
				if (!checkResult12) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("KM00003",KM0010Common.CLASS_CD12);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setPJ_CLASS_12_NAME("");
				}
			}		
			return;
		} catch (SQLException e) {
			throw e;
		}
	}
	//----------案件番号を自動採番する-- ---------------------------------------
	private String AutoCreatePjCd() throws FoundationException, SQLException{
		List projectCds = entity.mcreateProjectCd.read(conn, struct);
		KM0010010Struct tempInsertStruct =(KM0010010Struct)projectCds.get(0);
		String tempPjCd = tempInsertStruct.getAuto_PROJECT_CD();
		return tempPjCd;
	}
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// キー以外の項目を初期化
            initializeDetail();
            struct.seth_ESTIMATE("0");

			KM0010010Struct tmpStruct;
			KM0010010Struct structPjOdrAlc;
			
			int completeFlg = 0;
			int tempFlg = 1;
			boolean checkResult = false;
			struct.setCOMPANY_CD(COMPANY_CD);
			//案件存在チェック
			 List projectList = entity.mT_PROJECT.read(conn, struct);
			 if(projectList.isEmpty()){
				 //案件が存在しません。
				 setErrorMessage("KM00001");
					return;
			 }
			 //得意先コード存在チェック
			 List custList = entity.mcheckCust.read(conn, struct);
			 if(custList.isEmpty()){
				 //得意先コードがマスタに存在しません。
				 setErrorMessage("KQ00014");
					return;
			 }else{
				 tmpStruct = (KM0010010Struct)custList.get(0);
				 struct.setCUST_NAME(tmpStruct.getCUST_NAME());
				 struct.setCUST_CD(tmpStruct.getCUST_CD());
			 }
			 //通貨コード存在チェック
			 List CurList = entity.mcheckM_cur.read(conn, struct);
			 if(CurList.isEmpty()){
				 //通貨コードがマスタに存在しません。
				 setErrorMessage("KQ00073");
				 return;
			 }else{
				 tmpStruct = (KM0010010Struct)CurList.get(0);
				 struct.setCurUnit(tmpStruct.getCurUnit());
			 }
			 
			 KM0010010Struct tempStruct = (KM0010010Struct)projectList.get(0);
			 tempStruct.setCOMPANY_CD(COMPANY_CD);
			 if(tempStruct.getDLV_LOC_CD() != null && !"".equals(tempStruct.getDLV_LOC_CD())){
				 
				 List DlvLocCdList = entity.mcheckDLV_LOC_CD.read(conn, tempStruct);
				 if(DlvLocCdList.isEmpty()){
					 //納品場所コードがマスタに存在しません。
					 setWarningMessage("KQ00015");
				 }else{
					 tmpStruct = (KM0010010Struct)DlvLocCdList.get(0);
					 struct.setDLV_LOC_NAME(tmpStruct.getDLV_LOC_NAME());
				 }
				 
			 }else{
				 struct.setDLV_LOC_NAME("");
			 }
			 if(tempStruct.getPJ_ORG_CD() != null && !"".equals(tempStruct.getPJ_ORG_CD()) ){
				 List OrgCdList = entity.mcheckORG.read(conn, tempStruct);
				 if(OrgCdList.isEmpty()){
					 //部門コードが部門マスタに存在しません。
					 setWarningMessage("KM00006");
				 }else{
					 tmpStruct = (KM0010010Struct)OrgCdList.get(0);
					 struct.setORG_NAME(tmpStruct.getORG_NAME());
				 }
			 }else{
				 struct.setORG_NAME(""); 
			 }	
			 
			 //担当者コード存在チェック
			 if(tempStruct.getPJ_USER_CD() != null && !"".equals(tempStruct.getPJ_USER_CD())){
				 List PJuserList = entity.mcheckUSER.read(conn, tempStruct);
				 if(PJuserList.isEmpty()){
					 //担当者コードがユーザマスタに存在しません。
					 setWarningMessage("KM00013");
				 }else{
					 tmpStruct = (KM0010010Struct)PJuserList.get(0);
					 struct.setUSER_NAME(tmpStruct.getUSER_NAME());
				 }
			 }else{
				 struct.setUSER_NAME("");
			 }
			 if(entity.mCheckEstimate1.check(conn, tempStruct)){
				 //[見積]の情報があり
				 struct.seth_ESTIMATE("1");
			 }
			 //[案件].“案件ステータス”＝4:確定受注、9:完了の場合、「受注完了」を取得する。
			 if("4".equals(tempStruct.getPROJECT_STAT()) || "9".equals(tempStruct.getPROJECT_STAT())){
				 // [見積]の情報を取得する。
				List EstimateList2 = entity.mESTIMATE_SEARCH2.read(conn,tempStruct);
				if(!EstimateList2.isEmpty()){
					 completeFlg = 0;
				}
				else {
				 List EstimateList = entity.mESTIMATE_SEARCH.read(conn,tempStruct);
				 if(!EstimateList.isEmpty()){
					 for(int i=0; i<EstimateList.size();i++){
						 tmpStruct =(KM0010010Struct) EstimateList.get(i);
						 //[案件受注紐付]の情報を取得する
						 List pjOdrAlcList = entity.mT_PJ_ODR_ALC.read(conn, tmpStruct);
						 structPjOdrAlc = (KM0010010Struct)pjOdrAlcList.get(0);
						 if(tmpStruct.getESTIMATE_TYPE()!= null && "1".equals(tmpStruct.getESTIMATE_TYPE())){
							 //[見積明細].”手配品目種”=1:製品の場合
							  List OdrList = entity.mT_ODR.read(conn, structPjOdrAlc);
							  if(!OdrList.isEmpty()){
								  tmpStruct = (KM0010010Struct)OdrList.get(0);
								  if(tmpStruct.getODR_CMPLT_FLG()!= null && !"1".equals(tmpStruct.getODR_CMPLT_FLG())){
									  tempFlg = 0;
									  break;
								  }
							  }
						 }
						 
						 if(tmpStruct.getESTIMATE_TYPE()!= null && "2".equals(tmpStruct.getESTIMATE_TYPE())){
							 //[見積明細].”手配品目種”=2:役務の場合
							 List  odrUnStockList = entity.mT_ODR_UNSTOCK.read(conn, structPjOdrAlc);
							 if(!odrUnStockList.isEmpty()){
								 tmpStruct = (KM0010010Struct)odrUnStockList.get(0);
								  if(tmpStruct.getODR_CMPLT_FLG()!= null && !"1".equals(tmpStruct.getODR_CMPLT_FLG())){
									  tempFlg = 0;
									  break;
								  }
							 }
							 
						 }
					 }
					 //すべての明細の “受注完了フラグ”が1の場合
					 if(tempFlg != 0){
						 completeFlg = 1;
					 }
				 }
				}
			 }
			 struct.setPROJECT_CD(tempStruct.getPROJECT_CD());
			 struct.seth_PROJECT_CD(tempStruct.getPROJECT_CD());
			 struct.setPROJECT_NAME(tempStruct.getPROJECT_NAME());
			 struct.setCUST_CD(tempStruct.getCUST_CD());
			 struct.seth_MODIFY_COUNT(tempStruct.geth_MODIFY_COUNT());
			 //案件ステータス
			 struct.setPROJECT_STAT(tempStruct.getPROJECT_STAT());
			 struct.seth_PROJECT_STAT(tempStruct.getPROJECT_STAT());
			 //受注完了
			if(completeFlg==1){
				//完了
				struct.setCOMPLETE_STAT(multcombo("ODR_COMP_FLG","1"));
				struct.seth_COMPLETE_STAT("1");
			}else{
	            //未完了
				struct.setCOMPLETE_STAT(multcombo("ODR_COMP_FLG","0"));
				struct.seth_COMPLETE_STAT("0");
			}
			//確度
			struct.setACCURACY_LEVEL(tempStruct.getACCURACY_LEVEL());
			//引合日
			struct.setVend_Date(tempStruct.getVend_Date());
			//想定納期
			struct.setAssumeDlv_date(tempStruct.getAssumeDlv_date());
			//引合想定金額
			struct.setAssumeAmount(tempStruct.getAssumeAmount());
			//引合想定金額(邦貨)
			struct.setASSUME_AMOUNT_EXCH_RATES(tempStruct.getASSUME_AMOUNT_EXCH_RATES());
			//納品場所コード
			struct.setDLV_LOC_CD(tempStruct.getDLV_LOC_CD());
			//案件担当部門コード
			struct.setPJ_ORG_CD(tempStruct.getPJ_ORG_CD());
			//案件担当者コード
			struct.setPJ_USER_CD(tempStruct.getPJ_USER_CD());
			//備考１
			struct.setREMARKS1(tempStruct.getREMARKS1());
			//備考2
			struct.setREMARKS2(tempStruct.getREMARKS2());
			//備考3
			struct.setREMARKS3(tempStruct.getREMARKS3());
			//備考4
			struct.setREMARKS4(tempStruct.getREMARKS4());
			//備考5
			struct.setREMARKS5(tempStruct.getREMARKS5());
			//予算積上完了フラグ(画面にセット)
			struct.seth_OD_COMP_FLG(tempStruct.geth_OD_COMP_FLG());
			if(tempStruct.geth_OD_COMP_FLG()!= null && "1".equals(tempStruct.geth_OD_COMP_FLG()) ){
				struct.setOD_COMP_FLG("true");
			}else{
				struct.setOD_COMP_FLG("false");
			}
			//案件分類
			struct.setPJ_CLASS_01_TYP(tempStruct.getPJ_CLASS_01_TYP());
			struct.setPJ_CLASS_01_CD(tempStruct.getPJ_CLASS_01_CD());
			struct.setPJ_CLASS_01_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD01,tempStruct.getPJ_CLASS_01_CD()));
			
			struct.setPJ_CLASS_02_TYP(tempStruct.getPJ_CLASS_02_TYP());
			struct.setPJ_CLASS_02_CD(tempStruct.getPJ_CLASS_02_CD());
			struct.setPJ_CLASS_02_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD02,tempStruct.getPJ_CLASS_02_CD()));
			
			struct.setPJ_CLASS_03_TYP(tempStruct.getPJ_CLASS_03_TYP());
			struct.setPJ_CLASS_03_CD(tempStruct.getPJ_CLASS_03_CD());
			struct.setPJ_CLASS_03_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD03,tempStruct.getPJ_CLASS_03_CD()));
			
			struct.setPJ_CLASS_04_TYP(tempStruct.getPJ_CLASS_04_TYP());
			struct.setPJ_CLASS_04_CD(tempStruct.getPJ_CLASS_04_CD());
			struct.setPJ_CLASS_04_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD04,tempStruct.getPJ_CLASS_04_CD()));
			
			struct.setPJ_CLASS_05_TYP(tempStruct.getPJ_CLASS_05_TYP());
			struct.setPJ_CLASS_05_CD(tempStruct.getPJ_CLASS_05_CD());
			struct.setPJ_CLASS_05_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD05,tempStruct.getPJ_CLASS_05_CD()));
			
			struct.setPJ_CLASS_06_TYP(tempStruct.getPJ_CLASS_06_TYP());
			struct.setPJ_CLASS_06_CD(tempStruct.getPJ_CLASS_06_CD());
			struct.setPJ_CLASS_06_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD06,tempStruct.getPJ_CLASS_06_CD()));
			
			struct.setPJ_CLASS_07_TYP(tempStruct.getPJ_CLASS_07_TYP());
			struct.setPJ_CLASS_07_CD(tempStruct.getPJ_CLASS_07_CD());
			struct.setPJ_CLASS_07_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD07,tempStruct.getPJ_CLASS_07_CD()));
			
			struct.setPJ_CLASS_08_TYP(tempStruct.getPJ_CLASS_08_TYP());
			struct.setPJ_CLASS_08_CD(tempStruct.getPJ_CLASS_08_CD());
			struct.setPJ_CLASS_08_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD08,tempStruct.getPJ_CLASS_08_CD()));
			
			struct.setPJ_CLASS_09_TYP(tempStruct.getPJ_CLASS_09_TYP());
			struct.setPJ_CLASS_09_CD(tempStruct.getPJ_CLASS_09_CD());
			struct.setPJ_CLASS_09_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD09,tempStruct.getPJ_CLASS_09_CD()));
			
			struct.setPJ_CLASS_10_TYP(tempStruct.getPJ_CLASS_10_TYP());
			struct.setPJ_CLASS_10_CD(tempStruct.getPJ_CLASS_10_CD());
			struct.setPJ_CLASS_10_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD10,tempStruct.getPJ_CLASS_10_CD()));
			
			struct.setPJ_CLASS_11_TYP(tempStruct.getPJ_CLASS_11_TYP());
			struct.setPJ_CLASS_11_CD(tempStruct.getPJ_CLASS_11_CD());
			struct.setPJ_CLASS_11_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD11,tempStruct.getPJ_CLASS_11_CD()));
			
			struct.setPJ_CLASS_12_TYP(tempStruct.getPJ_CLASS_12_TYP());
			struct.setPJ_CLASS_12_CD(tempStruct.getPJ_CLASS_12_CD());
			struct.setPJ_CLASS_12_NAME(ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD12,tempStruct.getPJ_CLASS_12_CD()));
			
			// 検索状態を「読込成功」に設定
			setReadStatus(NORMAL);
			
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			if(!operateCheck("insert")){
				return;
			} 
			//得意先情報の取得
			KM0010010Struct tempInsertStruct = null;
			List custList = entity.mCkCust1.read(conn, struct);
			if(custList.isEmpty()){
				 setErrorMessage("KQ00014");
				 return ;
			}else{
				tempInsertStruct = (KM0010010Struct)custList.get(0);
			}
			ExchAmount exch = new ExchAmount(conn);
			// 邦貨計算処理(邦貨計算処理で「引合想定金額（邦貨）」を取得する)
			boolean  result = exch.doExchAmount(
					struct.getAssumeAmount(),                              //引合想定金額
					COMPANY_CD,
					tempInsertStruct.getCUR_CD(), 
					tempInsertStruct.getEXCH_TYP(), 
					tempInsertStruct.getDETAIL_ROUND_TYP(), 
					_businessOprDate);                                     // 業務運用日
			if (!result) {
				setErrorMessage("KQ00038");
				return;
			}
		    String	dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT()); // 引合想定金額（邦貨）
			struct.setASSUME_AMOUNT_EXCH_RATES(dExchAmount);
			
			//案件番号を取得 
			if("true".equals(struct.getPROJECT_CD_FLG())){
				//案件番号を自動採番する
				struct.setPROJECT_CD(AutoCreatePjCd());
			}
			//予算積上完了フラグ
			if("true".equals(struct.getOD_COMP_FLG())){
				struct.seth_OD_COMP_FLG("1");
			}else{
				struct.seth_OD_COMP_FLG("0");
			}
			entity.mT_PROJECT.create(conn, struct);
			
			// 検索
			controlselect();
			//コメント
			conn.commit();
		} catch(SQLException e) {
			// エラーメッセージ作成
			keyMessage = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
			setSqlExceptionMsg(e, keyMessage);
		}catch(Exception e){
			setErrorMessage("ZZ01106");
			return;
		}finally{
            if (conn != null) {
                conn.rollback();
               }
              }
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//得意先情報の取得
			KM0010010Struct tempInsertStruct = null;
			struct.setCOMPANY_CD(COMPANY_CD);
			List custList = entity.mCkCust1.read(conn, struct);
			if(custList.isEmpty()){
				 setErrorMessage("KQ00014");
				 return ;
			}else{
				tempInsertStruct = (KM0010010Struct)custList.get(0);
			}
			conn.beginTransWeb();
			if(!operateCheck("update")){
				return;
			}
			//更新排他チェック
			if(!exclusiveCheck()){
				return;
			}
			// 邦貨計算処理(邦貨計算処理で「引合想定金額（邦貨）」を取得する)
			ExchAmount exch = new ExchAmount(conn);
			boolean  result = exch.doExchAmount(
					struct.getAssumeAmount(),                              //引合想定金額
					COMPANY_CD,
					tempInsertStruct.getCUR_CD(), 
					tempInsertStruct.getEXCH_TYP(), 
					tempInsertStruct.getDETAIL_ROUND_TYP(), 
					_businessOprDate);                                     // 業務運用日
			if (!result) {
				setErrorMessage("KQ00038");
				return;
			}
		    String	dExchAmount = String.valueOf(exch.getD_EXCH_AMOUNT());  // 引合想定金額（邦貨）
			struct.setASSUME_AMOUNT_EXCH_RATES(dExchAmount);
			
			//予算積上完了フラグ
			if("true".equals(struct.getOD_COMP_FLG())){
				struct.seth_OD_COMP_FLG("1");
			}else{
				struct.seth_OD_COMP_FLG("0");
			}
			entity.mT_PROJECT.update(conn, struct);
			//コミット
			conn.commit();
			// 検索
			controlselect();	
		} catch(SQLException ee) {
			// エラーメッセージ作成
			keyMessage = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
			setSqlExceptionMsg(ee, keyMessage);
		} catch(Exception e){
			setErrorMessage("ZZ01106");
			return;
		}finally{
            if (conn != null) {
                conn.rollback();
               }
              }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
			// TODO: ユーザ定義のコードを記述してください
		try {			
			conn.beginTransWeb();
			//削除排他チェック
			if(!exclusiveCheck()){
				return;
			}
			entity.mdelProject.update(conn, struct);
			//コミット
			conn.commit();
	    	struct.initialize();
			initializeDetail();
			setReadStatus(INITIAL);
		} catch(SQLException ee) {
			// エラーメッセージ作成
			keyMessage = "T_PROJECT.PROJECT_CD:" + struct.getPROJECT_CD();
			setSqlExceptionMsg(ee, keyMessage);
		}finally{
            if (conn != null) {
                conn.rollback();
               }
              }
                //}}user_implement_dev:<controldelete>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ユーザ定義のコードを記述してください
    	    struct.initialize();
		    initializeDetail();

			// 検索状態を「初期状態」に設定
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlclear>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{

			// コンボボックスデータ用意
			ComboBox controller = new ComboBox(conn, sysUSER_CD);
			_PROJECT_STAT = controller.getData("PROJECT_STAT");
			_ACCURACY_LEVEL = controller.getData("ACCURACY_LEVEL");
			_ODR_COMP_FLG = controller.getData("ODR_COMP_FLG");
		    //受注分類01～12中分類名称
	        _PJ_CLASS_01_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD01,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_02_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD02,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_03_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD03,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_04_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD04,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_05_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD05,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_06_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD06,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_07_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD07,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_08_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD08,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_09_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD09,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_10_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD10,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_11_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD11,KM0010Common.CLASS_CD00);
		    _PJ_CLASS_12_TYP = ClassMaster.getClassName(conn,KM0010Common.CLASS_CD,KM0010Common.CLASS_CD12,KM0010Common.CLASS_CD00);

			// 分類マスタ名01～12
			struct.setPJ_CLASS_01_TYP(_PJ_CLASS_01_TYP);
			struct.setPJ_CLASS_02_TYP(_PJ_CLASS_02_TYP);
			struct.setPJ_CLASS_03_TYP(_PJ_CLASS_03_TYP);
			struct.setPJ_CLASS_04_TYP(_PJ_CLASS_04_TYP);
			struct.setPJ_CLASS_05_TYP(_PJ_CLASS_05_TYP);
			struct.setPJ_CLASS_06_TYP(_PJ_CLASS_06_TYP);
			struct.setPJ_CLASS_07_TYP(_PJ_CLASS_07_TYP);
			struct.setPJ_CLASS_08_TYP(_PJ_CLASS_08_TYP);
			struct.setPJ_CLASS_09_TYP(_PJ_CLASS_09_TYP);
			struct.setPJ_CLASS_10_TYP(_PJ_CLASS_10_TYP);
			struct.setPJ_CLASS_11_TYP(_PJ_CLASS_11_TYP);
			struct.setPJ_CLASS_12_TYP(_PJ_CLASS_12_TYP);
		    
		    struct.copy(struct);
		    
		    //画面を初期化
		    struct.setPJ_USER_CD(sysUSER_CD);
		    
			// =======================================
			// 自社情報の取得
			// =======================================
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,struct);
			if(listCompanyInfo.isEmpty() || listCompanyInfo.size()!= 1 ){
				//自社情報が無い/複数件
				ExpjMessage emsg = new ExpjMessage("KQ00039");
	            msgStruct.addError(emsg);	// エラーメッセージとして登録
	            sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
	            ExpjException ee = new ExpjException(emsg);
	            throw ee;
			}else{
				COMPANY_CD = ((KM0010010Struct)listCompanyInfo.get(0)).getCOMPANY_CD();
				struct.setCOMPANY_CD(COMPANY_CD);
			}
			//// 業務運用日の取得
			_businessOprDate = DateCtrlControl.getData(conn, this.sysPLANT_CD).getBUSINESS_OPR_DATE();
			struct.setVend_Date(_businessOprDate);
		} catch(SQLException e) {
			// エラー処理を記述してください。
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
			msgStruct.addError(emsg);
			throw ee;
		}catch(DataNotFoundException e){
			ExpjMessage emsg = new ExpjMessage( "KQ00026" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0010");
		logger.entering("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KM0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("select") ) {
				controlselect();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// コンボボックスデータ設定
			struct.setList_PROJECT_STAT_val(_PROJECT_STAT.getValList());
			struct.setList_PROJECT_STAT_name(_PROJECT_STAT.getExplanList());
			struct.setList_ACCURACY_LEVEL_val(_ACCURACY_LEVEL.getValList());
			struct.setList_ACCURACY_LEVEL_name(_ACCURACY_LEVEL.getExplanList());

			// 分類マスタ名01～12
			struct.setPJ_CLASS_01_TYP(_PJ_CLASS_01_TYP);
			struct.setPJ_CLASS_02_TYP(_PJ_CLASS_02_TYP);
			struct.setPJ_CLASS_03_TYP(_PJ_CLASS_03_TYP);
			struct.setPJ_CLASS_04_TYP(_PJ_CLASS_04_TYP);
			struct.setPJ_CLASS_05_TYP(_PJ_CLASS_05_TYP);
			struct.setPJ_CLASS_06_TYP(_PJ_CLASS_06_TYP);
			struct.setPJ_CLASS_07_TYP(_PJ_CLASS_07_TYP);
			struct.setPJ_CLASS_08_TYP(_PJ_CLASS_08_TYP);
			struct.setPJ_CLASS_09_TYP(_PJ_CLASS_09_TYP);
			struct.setPJ_CLASS_10_TYP(_PJ_CLASS_10_TYP);
			struct.setPJ_CLASS_11_TYP(_PJ_CLASS_11_TYP);
			struct.setPJ_CLASS_12_TYP(_PJ_CLASS_12_TYP);
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
//			throw new FoundationException("KM0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0010010-E999","CSVの出力処理"));
			throw new FoundationException("KM0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0010010-E999","システム日付の取得処理"));
				throw new FoundationException("KM0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("KM0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KM0010010Entity entity;
	protected KM0010010Struct struct;
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

		entity = new KM0010010Entity();
		struct = new KM0010010Struct();

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
	 * KM0010010クラスの標準コンストラクタ
	 */
	public KM0010010Control() throws BusinessProcessException, FoundationException
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
				KM0010010Struct key = (KM0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_PROJECT_CD") && key.geth_PROJECT_CD() != null) {
					msgKey.setKeyValue("h_PROJECT_CD", key.geth_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT_name") && key.getPROJECT_STAT_name() != null) {
					msgKey.setKeyValue("PROJECT_STAT_name", key.getPROJECT_STAT_name());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT_val") && key.getPROJECT_STAT_val() != null) {
					msgKey.setKeyValue("PROJECT_STAT_val", key.getPROJECT_STAT_val());
				}
				if(msgKeyType.containsKeyColumn("COMPLETE_STAT") && key.getCOMPLETE_STAT() != null) {
					msgKey.setKeyValue("COMPLETE_STAT", key.getCOMPLETE_STAT());
				}
				if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_name") && key.getACCURACY_LEVEL_name() != null) {
					msgKey.setKeyValue("ACCURACY_LEVEL_name", key.getACCURACY_LEVEL_name());
				}
				if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_val") && key.getACCURACY_LEVEL_val() != null) {
					msgKey.setKeyValue("ACCURACY_LEVEL_val", key.getACCURACY_LEVEL_val());
				}
				if(msgKeyType.containsKeyColumn("OD_COMP_FLG") && key.getOD_COMP_FLG() != null) {
					msgKey.setKeyValue("OD_COMP_FLG", key.getOD_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_01_TYP") && key.getPJ_CLASS_01_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_01_TYP", key.getPJ_CLASS_01_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_01_NAME") && key.getPJ_CLASS_01_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_01_NAME", key.getPJ_CLASS_01_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_02_TYP") && key.getPJ_CLASS_02_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_02_TYP", key.getPJ_CLASS_02_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_02_NAME") && key.getPJ_CLASS_02_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_02_NAME", key.getPJ_CLASS_02_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_03_TYP") && key.getPJ_CLASS_03_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_03_TYP", key.getPJ_CLASS_03_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_03_NAME") && key.getPJ_CLASS_03_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_03_NAME", key.getPJ_CLASS_03_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_04_TYP") && key.getPJ_CLASS_04_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_04_TYP", key.getPJ_CLASS_04_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_04_NAME") && key.getPJ_CLASS_04_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_04_NAME", key.getPJ_CLASS_04_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_05_TYP") && key.getPJ_CLASS_05_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_05_TYP", key.getPJ_CLASS_05_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_05_NAME") && key.getPJ_CLASS_05_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_05_NAME", key.getPJ_CLASS_05_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_06_TYP") && key.getPJ_CLASS_06_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_06_TYP", key.getPJ_CLASS_06_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_06_NAME") && key.getPJ_CLASS_06_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_06_NAME", key.getPJ_CLASS_06_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_07_TYP") && key.getPJ_CLASS_07_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_07_TYP", key.getPJ_CLASS_07_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_07_NAME") && key.getPJ_CLASS_07_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_07_NAME", key.getPJ_CLASS_07_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_08_TYP") && key.getPJ_CLASS_08_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_08_TYP", key.getPJ_CLASS_08_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_08_NAME") && key.getPJ_CLASS_08_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_08_NAME", key.getPJ_CLASS_08_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_09_TYP") && key.getPJ_CLASS_09_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_09_TYP", key.getPJ_CLASS_09_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_09_NAME") && key.getPJ_CLASS_09_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_09_NAME", key.getPJ_CLASS_09_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_10_TYP") && key.getPJ_CLASS_10_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_10_TYP", key.getPJ_CLASS_10_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_10_NAME") && key.getPJ_CLASS_10_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_10_NAME", key.getPJ_CLASS_10_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_11_TYP") && key.getPJ_CLASS_11_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_11_TYP", key.getPJ_CLASS_11_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_11_NAME") && key.getPJ_CLASS_11_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_11_NAME", key.getPJ_CLASS_11_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_12_TYP") && key.getPJ_CLASS_12_TYP() != null) {
					msgKey.setKeyValue("PJ_CLASS_12_TYP", key.getPJ_CLASS_12_TYP());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_12_NAME") && key.getPJ_CLASS_12_NAME() != null) {
					msgKey.setKeyValue("PJ_CLASS_12_NAME", key.getPJ_CLASS_12_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD_FLG") && key.getPROJECT_CD_FLG() != null) {
					msgKey.setKeyValue("PROJECT_CD_FLG", key.getPROJECT_CD_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_PROJECT_STAT") && key.geth_PROJECT_STAT() != null) {
					msgKey.setKeyValue("h_PROJECT_STAT", key.geth_PROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("h_ESTIMATE") && key.geth_ESTIMATE() != null) {
					msgKey.setKeyValue("h_ESTIMATE", key.geth_ESTIMATE());
				}
				if(msgKeyType.containsKeyColumn("h_COMPLETE_STAT") && key.geth_COMPLETE_STAT() != null) {
					msgKey.setKeyValue("h_COMPLETE_STAT", key.geth_COMPLETE_STAT());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL") && key.getACCURACY_LEVEL() != null) {
					msgKey.setKeyValue("ACCURACY_LEVEL", key.getACCURACY_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("Vend_Date") && key.getVend_Date() != null) {
					msgKey.setKeyValue("Vend_Date", key.getVend_Date());
				}
				if(msgKeyType.containsKeyColumn("AssumeDlv_date") && key.getAssumeDlv_date() != null) {
					msgKey.setKeyValue("AssumeDlv_date", key.getAssumeDlv_date());
				}
				if(msgKeyType.containsKeyColumn("AssumeAmount") && key.getAssumeAmount() != null) {
					msgKey.setKeyValue("AssumeAmount", key.getAssumeAmount());
				}
				if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT_EXCH_RATES") && key.getASSUME_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("ASSUME_AMOUNT_EXCH_RATES", key.getASSUME_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_ORG_CD") && key.getPJ_ORG_CD() != null) {
					msgKey.setKeyValue("PJ_ORG_CD", key.getPJ_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_USER_CD") && key.getPJ_USER_CD() != null) {
					msgKey.setKeyValue("PJ_USER_CD", key.getPJ_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("REMARKS1") && key.getREMARKS1() != null) {
					msgKey.setKeyValue("REMARKS1", key.getREMARKS1());
				}
				if(msgKeyType.containsKeyColumn("REMARKS2") && key.getREMARKS2() != null) {
					msgKey.setKeyValue("REMARKS2", key.getREMARKS2());
				}
				if(msgKeyType.containsKeyColumn("REMARKS3") && key.getREMARKS3() != null) {
					msgKey.setKeyValue("REMARKS3", key.getREMARKS3());
				}
				if(msgKeyType.containsKeyColumn("REMARKS4") && key.getREMARKS4() != null) {
					msgKey.setKeyValue("REMARKS4", key.getREMARKS4());
				}
				if(msgKeyType.containsKeyColumn("REMARKS5") && key.getREMARKS5() != null) {
					msgKey.setKeyValue("REMARKS5", key.getREMARKS5());
				}
				if(msgKeyType.containsKeyColumn("h_OD_COMP_FLG") && key.geth_OD_COMP_FLG() != null) {
					msgKey.setKeyValue("h_OD_COMP_FLG", key.geth_OD_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_01_CD") && key.getPJ_CLASS_01_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_01_CD", key.getPJ_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_02_CD") && key.getPJ_CLASS_02_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_02_CD", key.getPJ_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_03_CD") && key.getPJ_CLASS_03_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_03_CD", key.getPJ_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_04_CD") && key.getPJ_CLASS_04_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_04_CD", key.getPJ_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_05_CD") && key.getPJ_CLASS_05_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_05_CD", key.getPJ_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_06_CD") && key.getPJ_CLASS_06_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_06_CD", key.getPJ_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_07_CD") && key.getPJ_CLASS_07_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_07_CD", key.getPJ_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_08_CD") && key.getPJ_CLASS_08_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_08_CD", key.getPJ_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_09_CD") && key.getPJ_CLASS_09_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_09_CD", key.getPJ_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_10_CD") && key.getPJ_CLASS_10_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_10_CD", key.getPJ_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_11_CD") && key.getPJ_CLASS_11_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_11_CD", key.getPJ_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("PJ_CLASS_12_CD") && key.getPJ_CLASS_12_CD() != null) {
					msgKey.setKeyValue("PJ_CLASS_12_CD", key.getPJ_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAL_NO") && key.getDETAL_NO() != null) {
					msgKey.setKeyValue("DETAL_NO", key.getDETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("Auto_PROJECT_CD") && key.getAuto_PROJECT_CD() != null) {
					msgKey.setKeyValue("Auto_PROJECT_CD", key.getAuto_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("CurUnit") && key.getCurUnit() != null) {
					msgKey.setKeyValue("CurUnit", key.getCurUnit());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE") && key.getESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("ESTIMATE_TYPE", key.getESTIMATE_TYPE());
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
					KM0010010Struct key = new KM0010010Struct();
					if(msgKeyType.containsKeyColumn("h_PROJECT_CD")) {
						key.seth_PROJECT_CD(msgKey.getKeyValue("h_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT_name")) {
						key.setPROJECT_STAT_name(msgKey.getKeyValue("PROJECT_STAT_name"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT_val")) {
						key.setPROJECT_STAT_val(msgKey.getKeyValue("PROJECT_STAT_val"));
					}
					if(msgKeyType.containsKeyColumn("COMPLETE_STAT")) {
						key.setCOMPLETE_STAT(msgKey.getKeyValue("COMPLETE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_name")) {
						key.setACCURACY_LEVEL_name(msgKey.getKeyValue("ACCURACY_LEVEL_name"));
					}
					if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL_val")) {
						key.setACCURACY_LEVEL_val(msgKey.getKeyValue("ACCURACY_LEVEL_val"));
					}
					if(msgKeyType.containsKeyColumn("OD_COMP_FLG")) {
						key.setOD_COMP_FLG(msgKey.getKeyValue("OD_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_01_TYP")) {
						key.setPJ_CLASS_01_TYP(msgKey.getKeyValue("PJ_CLASS_01_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_01_NAME")) {
						key.setPJ_CLASS_01_NAME(msgKey.getKeyValue("PJ_CLASS_01_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_02_TYP")) {
						key.setPJ_CLASS_02_TYP(msgKey.getKeyValue("PJ_CLASS_02_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_02_NAME")) {
						key.setPJ_CLASS_02_NAME(msgKey.getKeyValue("PJ_CLASS_02_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_03_TYP")) {
						key.setPJ_CLASS_03_TYP(msgKey.getKeyValue("PJ_CLASS_03_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_03_NAME")) {
						key.setPJ_CLASS_03_NAME(msgKey.getKeyValue("PJ_CLASS_03_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_04_TYP")) {
						key.setPJ_CLASS_04_TYP(msgKey.getKeyValue("PJ_CLASS_04_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_04_NAME")) {
						key.setPJ_CLASS_04_NAME(msgKey.getKeyValue("PJ_CLASS_04_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_05_TYP")) {
						key.setPJ_CLASS_05_TYP(msgKey.getKeyValue("PJ_CLASS_05_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_05_NAME")) {
						key.setPJ_CLASS_05_NAME(msgKey.getKeyValue("PJ_CLASS_05_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_06_TYP")) {
						key.setPJ_CLASS_06_TYP(msgKey.getKeyValue("PJ_CLASS_06_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_06_NAME")) {
						key.setPJ_CLASS_06_NAME(msgKey.getKeyValue("PJ_CLASS_06_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_07_TYP")) {
						key.setPJ_CLASS_07_TYP(msgKey.getKeyValue("PJ_CLASS_07_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_07_NAME")) {
						key.setPJ_CLASS_07_NAME(msgKey.getKeyValue("PJ_CLASS_07_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_08_TYP")) {
						key.setPJ_CLASS_08_TYP(msgKey.getKeyValue("PJ_CLASS_08_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_08_NAME")) {
						key.setPJ_CLASS_08_NAME(msgKey.getKeyValue("PJ_CLASS_08_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_09_TYP")) {
						key.setPJ_CLASS_09_TYP(msgKey.getKeyValue("PJ_CLASS_09_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_09_NAME")) {
						key.setPJ_CLASS_09_NAME(msgKey.getKeyValue("PJ_CLASS_09_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_10_TYP")) {
						key.setPJ_CLASS_10_TYP(msgKey.getKeyValue("PJ_CLASS_10_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_10_NAME")) {
						key.setPJ_CLASS_10_NAME(msgKey.getKeyValue("PJ_CLASS_10_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_11_TYP")) {
						key.setPJ_CLASS_11_TYP(msgKey.getKeyValue("PJ_CLASS_11_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_11_NAME")) {
						key.setPJ_CLASS_11_NAME(msgKey.getKeyValue("PJ_CLASS_11_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_12_TYP")) {
						key.setPJ_CLASS_12_TYP(msgKey.getKeyValue("PJ_CLASS_12_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_12_NAME")) {
						key.setPJ_CLASS_12_NAME(msgKey.getKeyValue("PJ_CLASS_12_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD_FLG")) {
						key.setPROJECT_CD_FLG(msgKey.getKeyValue("PROJECT_CD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_PROJECT_STAT")) {
						key.seth_PROJECT_STAT(msgKey.getKeyValue("h_PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("h_ESTIMATE")) {
						key.seth_ESTIMATE(msgKey.getKeyValue("h_ESTIMATE"));
					}
					if(msgKeyType.containsKeyColumn("h_COMPLETE_STAT")) {
						key.seth_COMPLETE_STAT(msgKey.getKeyValue("h_COMPLETE_STAT"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("ACCURACY_LEVEL")) {
						key.setACCURACY_LEVEL(msgKey.getKeyValue("ACCURACY_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("Vend_Date")) {
						key.setVend_Date(msgKey.getKeyValue("Vend_Date"));
					}
					if(msgKeyType.containsKeyColumn("AssumeDlv_date")) {
						key.setAssumeDlv_date(msgKey.getKeyValue("AssumeDlv_date"));
					}
					if(msgKeyType.containsKeyColumn("AssumeAmount")) {
						key.setAssumeAmount(msgKey.getKeyValue("AssumeAmount"));
					}
					if(msgKeyType.containsKeyColumn("ASSUME_AMOUNT_EXCH_RATES")) {
						key.setASSUME_AMOUNT_EXCH_RATES(msgKey.getKeyValue("ASSUME_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_ORG_CD")) {
						key.setPJ_ORG_CD(msgKey.getKeyValue("PJ_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_USER_CD")) {
						key.setPJ_USER_CD(msgKey.getKeyValue("PJ_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS1")) {
						key.setREMARKS1(msgKey.getKeyValue("REMARKS1"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS2")) {
						key.setREMARKS2(msgKey.getKeyValue("REMARKS2"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS3")) {
						key.setREMARKS3(msgKey.getKeyValue("REMARKS3"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS4")) {
						key.setREMARKS4(msgKey.getKeyValue("REMARKS4"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS5")) {
						key.setREMARKS5(msgKey.getKeyValue("REMARKS5"));
					}
					if(msgKeyType.containsKeyColumn("h_OD_COMP_FLG")) {
						key.seth_OD_COMP_FLG(msgKey.getKeyValue("h_OD_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_01_CD")) {
						key.setPJ_CLASS_01_CD(msgKey.getKeyValue("PJ_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_02_CD")) {
						key.setPJ_CLASS_02_CD(msgKey.getKeyValue("PJ_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_03_CD")) {
						key.setPJ_CLASS_03_CD(msgKey.getKeyValue("PJ_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_04_CD")) {
						key.setPJ_CLASS_04_CD(msgKey.getKeyValue("PJ_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_05_CD")) {
						key.setPJ_CLASS_05_CD(msgKey.getKeyValue("PJ_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_06_CD")) {
						key.setPJ_CLASS_06_CD(msgKey.getKeyValue("PJ_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_07_CD")) {
						key.setPJ_CLASS_07_CD(msgKey.getKeyValue("PJ_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_08_CD")) {
						key.setPJ_CLASS_08_CD(msgKey.getKeyValue("PJ_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_09_CD")) {
						key.setPJ_CLASS_09_CD(msgKey.getKeyValue("PJ_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_10_CD")) {
						key.setPJ_CLASS_10_CD(msgKey.getKeyValue("PJ_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_11_CD")) {
						key.setPJ_CLASS_11_CD(msgKey.getKeyValue("PJ_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CLASS_12_CD")) {
						key.setPJ_CLASS_12_CD(msgKey.getKeyValue("PJ_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAL_NO")) {
						key.setDETAL_NO(msgKey.getKeyValue("DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Auto_PROJECT_CD")) {
						key.setAuto_PROJECT_CD(msgKey.getKeyValue("Auto_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CurUnit")) {
						key.setCurUnit(msgKey.getKeyValue("CurUnit"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE")) {
						key.setESTIMATE_TYPE(msgKey.getKeyValue("ESTIMATE_TYPE"));
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
