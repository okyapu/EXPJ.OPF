/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0190/src/com/nec/jp/orteus/metamorBase/AA0190/AA0190010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0190;

import com.nec.jp.orteus.metamorBase.AA0190.*;
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
 * CLASS     : AA0190010Control クラス
 * ファイル・クラス説明
 * @author 劉文涛 (NES済南)$
 * @version $Revision: 1.9 $ $Date: 2017/01/09 08:38:50 $
 *
 */
//}}user_implement_code_header

public class AA0190010Control
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
	public AA0190010Struct getListvalue(int x) { return (AA0190010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AA0190010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AA0190010Struct createStruct() { return new AA0190010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AA0190010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

   /**
	* CommonCheck
	* @param AA0190010Struct
	* @return boolean
	*/
	public boolean commonCheck(AA0190010Struct chstruct) throws BusinessProcessException, FoundationException{
		boolean bCheck = true;
		int iDelCHK = 0;
        
        if (chstruct.getList_CLASS_CD3() != null){
		for (int i=0;i<(chstruct.getList_CLASS_CD3()).size();i++ ){
			String strCLASS_CD3 = (chstruct.getList_CLASS_CD3()).get(i).toString();
			String strCLASS_NAME3 = (chstruct.getList_CLASS_NAME3()).get(i).toString();
			int num = 0;	
			
			// 未入力の行
			if ((("").equals(strCLASS_CD3)) && (("").equals(strCLASS_NAME3))){
				iDelCHK++;
				continue;
			}

			// 小分類名称が入力されていません。
			if ((!("").equals(strCLASS_CD3)) && ((" ").equals(strCLASS_NAME3) || ("").equals(strCLASS_NAME3))){
				ExpjMessage emsg = new ExpjMessage( "AA20006" );
				msgStruct.addError( emsg );
				bCheck = false;
				break;
			}
			// 小分類が入力されていません。
			if ((!("").equals(strCLASS_NAME3)) && (("").equals(strCLASS_CD3) || ("").equals(strCLASS_CD3))){
				ExpjMessage emsg = new ExpjMessage( "AA20007" );
				msgStruct.addError( emsg );
				bCheck = false;
				break;
			}
			// 小分類に 00 は入力できません。
			if ((!("").equals(strCLASS_NAME3)) && ("00").equals(strCLASS_CD3)){
				ExpjMessage emsg = new ExpjMessage( "AA20008" );
				msgStruct.addError( emsg );
				bCheck = false;
				break;
			}
			
			for (int j = 0;j<(chstruct.getList_CLASS_CD3()).size() ;j++ ){
				// 小分類が重複しています
				if ((strCLASS_CD3).equals((chstruct.getList_CLASS_CD3()).get(j).toString())){
					num++;
				}
				if (num>1){
					ExpjMessage emsg = new ExpjMessage( "AA20009" );
					msgStruct.addError( emsg );
					bCheck = false;
					return bCheck;
				}
			}
		}
      }
		return bCheck;
        
	}
	/**
	 * 得意先マスタに小分類が存在するかチェックします。
	 * 
	 * @param strCLASS_CD2 中分類コード
	 * @param strCLASS_CD3 小分類コード
	 * @return isExist （true:存在する、false:存在しない）
	 * @throws SQLException 
	 * @throws FoundationException 
	 *
	 */
	private boolean isExistM_CUST(String strCLASS_CD2, String strCLASS_CD3) 
					throws FoundationException, SQLException {
		
		// 得意先分類
		String CustClassTyp = AA0190Const.CLASS_01 + strCLASS_CD2;

		// 得意先マスタ存在フラグ(true:存在する)
		boolean isExist = false;
		
			if (CustClassTyp.equals(AA0190Const.CUST_CLASS_01_TYP)) {
				// 得意先分類が"1001"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_01_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_01.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_02_TYP)) {
				// 得意先分類が"1002"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_02_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_02.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_03_TYP)) {
				// 得意先分類が"1003"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_03_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_03.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_04_TYP)) {
				// 得意先分類が"1004"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_04_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_04.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_05_TYP)) {
				// 得意先分類が"1005"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_05_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_05.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_06_TYP)) {
				// 得意先分類が"1006"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_06_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_06.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_07_TYP)) {
				// 得意先分類が"1007"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_07_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_07.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_08_TYP)) {
				// 得意先分類が"1008"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_08_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_08.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_09_TYP)) {
				// 得意先分類が"1009"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_09_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_09.check(conn, param);				
			} else if (CustClassTyp.equals(AA0190Const.CUST_CLASS_10_TYP)) {
				// 得意先分類が"1010"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setCUST_CLASS_10_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_CUST_10.check(conn, param);
			} 
					
		return isExist;

	}
	
	/**
	 * 取引先マスタに小分類が存在するかチェックします。
	 * 
	 * @param strCLASS_CD2 中分類コード
	 * @param strCLASS_CD3 小分類コード
	 * @return isExist （true:存在する、false:存在しない）
	 * @throws SQLException 
	 * @throws FoundationException 
	 *
	 */
	private boolean isExistM_VEND_CTRL(String strCLASS_CD2, String strCLASS_CD3) 
				throws FoundationException, SQLException {
		
		// 取引先分類
		String CustClassTyp = AA0190Const.CLASS_02 + strCLASS_CD2;

		// 取引先マスタ存在フラグ(true:存在する)
		boolean isExist = false;
		
			if (CustClassTyp.equals(AA0190Const.VEND_CLASS_01_TYP)) {
				// 取引先分類が"2001"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_01_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_01.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_02_TYP)) {
				// 取引先分類が"2002"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_02_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_02.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_03_TYP)) {
				// 取引先分類が"2003"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_03_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_03.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_04_TYP)) {
				// 取引先分類が"2004"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_04_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_04.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_05_TYP)) {
				// 取引先分類が"2005"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_05_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_05.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_06_TYP)) {
				// 取引先分類が"2006"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_06_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_06.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_07_TYP)) {
				// 取引先分類が"2007"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_07_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_07.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_08_TYP)) {
				// 取引先分類が"2008"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_08_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_08.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_09_TYP)) {
				// 取引先分類が"2009"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_09_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_09.check(conn, param);				
			} else if (CustClassTyp.equals(AA0190Const.VEND_CLASS_10_TYP)) {
				// 取引先分類が"2010"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setVEND_CLASS_10_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_VEND_CTRL_10.check(conn, param);
			} 
					
		return isExist;

	}

	/**
	 * 品目マスタに小分類が存在するかチェックします。
	 * 
	 * @param strCLASS_CD2 中分類コード
	 * @param strCLASS_CD3 小分類コード
	 * @return isExist （true:存在する、false:存在しない）
	 * @throws SQLException 
	 * @throws FoundationException 
	 *
	 */
	private boolean isExistM_ITEM(String strCLASS_CD2, String strCLASS_CD3) 
					throws FoundationException, SQLException {
		
		// 品目分類
		String CustClassTyp = AA0190Const.CLASS_03 + strCLASS_CD2;

		// 品目マスタ存在フラグ(true:存在する)
		boolean isExist = false;
		
			if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_01_TYP)) {
				// 品目分類が"3001"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_01_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_01.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_02_TYP)) {
				// 品目分類が"3002"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_02_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_02.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_03_TYP)) {
				// 品目分類が"3003"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_03_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_03.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_04_TYP)) {
				// 品目分類が"3004"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_04_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_04.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_05_TYP)) {
				// 品目分類が"3005"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_05_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_05.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_06_TYP)) {
				// 品目分類が"3006"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_06_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_06.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_07_TYP)) {
				// 品目分類が"3007"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_07_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_07.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_08_TYP)) {
				// 品目分類が"3008"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_08_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_08.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_09_TYP)) {
				// 品目分類が"3009"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_09_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_09.check(conn, param);				
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_10_TYP)) {
				// 品目分類が"3010"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_10_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_10.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_11_TYP)) {
				// 品目分類が"3011"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_11_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_11.check(conn, param);
			} else if (CustClassTyp.equals(AA0190Const.ITEM_CLASS_12_TYP)) {
				// 品目分類が"3012"のとき
				AA0190010Struct param = new AA0190010Struct();
				param.setITEM_CLASS_12_CD(strCLASS_CD3);
				
				isExist = entity.mcheckM_ITEM_12.check(conn, param);
			} 
					
		return isExist;

	}
	
	/**
	 * 画面のデータを保存する
	 * @param dataStruct
	 */
	private void setData(AA0190010Struct dataStruct){
		List tempList = new ArrayList();
		for(int i = 0; i < list.size(); i++){
			AA0190010Struct tempStruct = new AA0190010Struct();
			AA0190010Struct listStruct = (AA0190010Struct)list.get(i);
			tempStruct.setCLASS_CD3(dataStruct.getList_CLASS_CD3().get(i).toString());	//小分類コード
			tempStruct.setCLASS_NAME3(dataStruct.getList_CLASS_NAME3().get(i).toString());	//小分類名
			if(!"true".equals(listStruct.getWriteStatus().toString())){
				tempStruct.setWriteStatus("false");	//EDITフラグ
			} else {
				tempStruct.setWriteStatus("true");
			}
			if(dataStruct.getList_MODIFY_COUNT_CD3().get(i) != null && !"".equals(dataStruct.getList_MODIFY_COUNT_CD3().get(i))){
				tempStruct.setMODIFY_COUNT_CD3(dataStruct.getList_MODIFY_COUNT_CD3().get(i).toString());	//更新数
			}			
			
			tempList.add(tempStruct);
		}
		setList(tempList);
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
	
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try{
			// 初期化
			setReadStatus(INITIAL);
			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}

			// グリッドの残りは追加用
			AA0190010Struct addStruct = new AA0190010Struct();
			addStruct.setCLASS_CD3(null);
			addStruct.setCLASS_NAME3(null);
			addStruct.setWriteStatus("true");			
			
			AA0190010Struct tempStruct ;
			// 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー用
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine !=0){
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
				struct.setROW_COUNT(null);
			}
			
            // 小分類名称に読込する用
			list = entity.mCLASS_CD3Cnt.read(conn, struct);			
			long rowCount = Long.parseLong(((AA0190010Struct) list.get(0)).getl_COUNT());
			
          //表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
			if ((maxLine != 0) && (rowCount == maxLine+1)) {
           		ExpjMessage emsg;
           		emsg = new ExpjMessage("ZZ01115",String.valueOf(maxLine));
           		msgStruct.addError(emsg);
           		sysLog.warning(emsg, getsysUSER_CD());
				setList(null);
				setReadStatus(TOO_MANY);
				return;
			}else{
                if(rowCount == 0){
                 // 検索状態を「０件読込」に設定
                 setReadStatus(NOT_FOUND);
                 if (list != null){
                	 list.clear();                	 
                 }
                } else {
                 // 小分類名称に読込する用
        		list = entity.mCLASS_CD3.read(conn, struct);
                 // 検索状態を「読込成功」に設定
                 setReadStatus(NORMAL);
                }
			}
			
			
			
			
			// グリッドの残りは追加用の行を追加する用
			int disLine = 0;
			int n = 0;

			// 大分類名称に読込する
			List CD1list;
			CD1list = entity.mCLASS_CD1.read(conn, struct);
			if (CD1list.isEmpty()){
				struct.setCLASS_NAME1("");
				struct.setMODIFY_COUNT_CD1("");				
				ExpjMessage emsg = new ExpjMessage( "ZZ06001" );
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				if (!list.isEmpty()){
					n = list.size(); 
				}
				disLine = maxLine-n;
				for (int i=0;i<disLine ;i++ ){
					list.add(addStruct);
				}
				struct.seth_CLASS_CD1("");// 大分類コード(比較用)
				struct.seth_CLASS_CD2("");// 中分類コード(比較用)
				return;
			}else{
				struct.setCLASS_NAME1(((AA0190010Struct)CD1list.get(0)).getCLASS_NAME1());
				struct.setMODIFY_COUNT_CD1(((AA0190010Struct)CD1list.get(0)).getMODIFY_COUNT_CD1());
			}
			
			// 中分類名称に読込する
			List CD2list;
			CD2list = entity.mCLASS_CD2.read(conn, struct);
			if (CD2list.isEmpty()){
				struct.setCLASS_NAME2("");
				struct.setMODIFY_COUNT_CD2("");
				ExpjMessage emsg = new ExpjMessage( "ZZ06001" );
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				if (!list.isEmpty()){
					n = list.size(); 
				}
				disLine = maxLine-n;
				for (int i=0;i<disLine ;i++ ){
					list.add(addStruct);
				}
				return;
			}else{
				struct.setCLASS_NAME2(((AA0190010Struct)CD2list.get(0)).getCLASS_NAME2());
				struct.setMODIFY_COUNT_CD2(((AA0190010Struct)CD2list.get(0)).getMODIFY_COUNT_CD2());
			}
			for (int i=0;i<list.size();i++){
				tempStruct = (AA0190010Struct) list.get(i);
				tempStruct.setWriteStatus("false");
			}


			
			// グリッドの残りは追加用の行を追加する。
			if (!list.isEmpty()){
				n = list.size(); 
			}
			disLine = maxLine-n;
			for (int i=0;i<disLine ;i++ ){
				list.add(addStruct);
			}

			struct.seth_CLASS_CD1(struct.getCLASS_CD1());// 大分類コード(比較用)
			struct.seth_CLASS_CD2(struct.getCLASS_CD2());// 中分類コード(比較用)
		} catch(Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			msgStruct.addError( emsg ); 
			sysLog.severe(emsg, getsysUSER_CD());
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			try{
				if(list!=null && list.size()!=0){
				//画面のデータを保存する
				setData(struct);
				}
                // 共通チェック
				if (!commonCheck(struct)){
					return;
				}
				// 大中分類が既に登録エラー
				List chkList;
				chkList = entity.mCLASS_CD2.read(conn, struct);
				if (!chkList.isEmpty()){
					ExpjMessage emsg = new ExpjMessage( "AA20010" );
					msgStruct.addError( emsg ); 
					return;
				}
				// 大分類DB登録
				List chkList_CD1;

				chkList_CD1 = entity.mCLASS_CD1_MODIFY_COUNT.read(conn, struct);
				if (chkList_CD1.isEmpty()){
					entity.minsertCLASS_CD1.create(conn, struct);
				}else{
					entity.mupdateCLASS_CD1.update(conn, struct);
				}
				// 中分類DB登録
				entity.minsertCLASS_CD2.create(conn, struct);
				
				// 小分類DB登録
				if (struct.getList_CLASS_CD3()!= null){
				for (int i=0;i<(struct.getList_CLASS_CD3()).size();i++){
					String strCLASS_CD3 = (struct.getList_CLASS_CD3()).get(i).toString();
					String strCLASS_CD2 = struct.getCLASS_CD2();
					String strCLASS_CD1 = struct.getCLASS_CD1();
					String strCLASS_NAME3 = (struct.getList_CLASS_NAME3()).get(i).toString();
					String oldCLASS_CD3_MODIFY_COUNT = (struct.getList_MODIFY_COUNT_CD3()).get(i).toString();
					List cd3List;
					AA0190010Struct cd3Struct = new AA0190010Struct(); // 登録用struct

					// 空データ
					if ((strCLASS_CD3==null||("").equals(strCLASS_CD3)) && (strCLASS_NAME3==null||("").equals(strCLASS_NAME3))){
						continue;
					}
					
					cd3Struct.setCLASS_CD1(strCLASS_CD1);
					cd3Struct.setCLASS_CD2(strCLASS_CD2);
					cd3Struct.setCLASS_CD3(strCLASS_CD3);
					cd3Struct.setCLASS_NAME3(strCLASS_NAME3);
					cd3Struct.setsUser_ID(struct.getsUser_ID());
					cd3List = entity.mCLASS_CD3_MODIFY_COUNT.read(conn, cd3Struct);
					
                    //［分類マスタ］に無い時
					if (cd3List.isEmpty()){	
						entity.minsertCLASS_CD3.create(conn, cd3Struct);
					}
					// [分類マスタ］に有る時
					else{										
						// 更新回数チェック
						if (!oldCLASS_CD3_MODIFY_COUNT.equals(((AA0190010Struct)cd3List.get(0)).getMODIFY_COUNT_CD3())){
							ExpjMessage emsg = new ExpjMessage( "ZZ01105");
							msgStruct.addError( emsg ); 
							return;
						}
						entity.mupdateCLASS_CD3.update(conn, cd3Struct);
					}
				  }
				}
				conn.commit();
				controlSelect();			
			}catch(SQLException e) {
					conn.rollback();
					setReadStatus(ERROR);
					e.printStackTrace();
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}catch(Exception e) {
					e.printStackTrace();
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			try{
				if(list!=null && list.size()!=0){
					//画面のデータを保存する
					setData(struct);
					}
				// 共通チェック
				if (!commonCheck(struct)){
					return;
				}

				// 中分類が既に削除エラー
				List chkList;
				chkList = entity.mCLASS_CD2_MODIFY_COUNT.read(conn, struct);
				if (chkList.isEmpty()){
					ExpjMessage emsg = new ExpjMessage( "AA20011" );
					msgStruct.addError( emsg ); 
					struct.clear();
					setList(null);
					return;
				}

				// 大分類DB更新
				List chkList_CD1;
				String oldCLASS_CD1_MODIFY_COUNT = struct.getMODIFY_COUNT_CD1();
				chkList_CD1 = entity.mCLASS_CD1_MODIFY_COUNT.read(conn, struct);
				if (!oldCLASS_CD1_MODIFY_COUNT.equals(((AA0190010Struct)chkList_CD1.get(0)).getMODIFY_COUNT_CD1())){
					ExpjMessage emsg = new ExpjMessage( "ZZ01105");
					msgStruct.addError( emsg ); 
					return;
				}
				entity.mupdateCLASS_CD1.update(conn, struct);

				// 中分類DB更新
				List chkList_CD2;
				String oldCLASS_CD2_MODIFY_COUNT = struct.getMODIFY_COUNT_CD2();
				chkList_CD2 = entity.mCLASS_CD2_MODIFY_COUNT.read(conn, struct);
				if (!oldCLASS_CD2_MODIFY_COUNT.equals(((AA0190010Struct)chkList_CD2.get(0)).getMODIFY_COUNT_CD2())){
					ExpjMessage emsg = new ExpjMessage( "ZZ01105");
					msgStruct.addError( emsg ); 
					return;
				}
				entity.mupdateCLASS_CD2.update(conn, struct);

				// 小分類DB登録
				if (struct.getList_CLASS_CD3()!= null){
				for (int i=0;i<(struct.getList_CLASS_CD3()).size();i++){
					String strCLASS_CD3 = (struct.getList_CLASS_CD3()).get(i).toString();
					String strCLASS_CD2 = struct.getCLASS_CD2();
					String strCLASS_CD1 = struct.getCLASS_CD1();
					String strCLASS_NAME3 = (struct.getList_CLASS_NAME3()).get(i).toString();
					String oldCLASS_CD3_MODIFY_COUNT = (struct.getList_MODIFY_COUNT_CD3()).get(i).toString();				
					List cd3List;
					AA0190010Struct cd3Struct = new AA0190010Struct(); // 登録用struct

					// 空データ
					if ((strCLASS_CD3==null||("").equals(strCLASS_CD3)) && (strCLASS_NAME3==null||("").equals(strCLASS_NAME3))){
						continue;
					}
					
					cd3Struct.setCLASS_CD1(strCLASS_CD1);
					cd3Struct.setCLASS_CD2(strCLASS_CD2);
					cd3Struct.setCLASS_CD3(strCLASS_CD3);
					cd3Struct.setCLASS_NAME3(strCLASS_NAME3);
					cd3Struct.setsUser_ID(struct.getsUser_ID());
					cd3List = entity.mCLASS_CD3_MODIFY_COUNT.read(conn, cd3Struct);
					
					
					//［分類マスタ］に無い時
					if (cd3List.isEmpty()){
						entity.minsertCLASS_CD3.create(conn, cd3Struct);
					}
					// [分類マスタ］に有る時
					else{										
						// 更新回数チェック
						if (!oldCLASS_CD3_MODIFY_COUNT.equals(((AA0190010Struct)cd3List.get(0)).getMODIFY_COUNT_CD3())){
							ExpjMessage emsg = new ExpjMessage( "ZZ01105");
							msgStruct.addError( emsg ); 
							return;
						}
						entity.mupdateCLASS_CD3.update(conn, cd3Struct);
					}	
				  }
				}
				conn.commit();
				controlSelect();			
			}catch(SQLException e) {
					conn.rollback();
					setReadStatus(ERROR);
					e.printStackTrace();
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}catch(Exception e) {
					e.printStackTrace();
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 選択削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			try{
				// 小分類DB削除
				if (struct.getList_CLASS_CD3()!= null){
					for (int i=0;i<(struct.getList_CLASS_CD3()).size();i++){
						String strCLASS_CD3 = (struct.getList_CLASS_CD3()).get(i).toString();
						String strCLASS_CD2 = struct.getCLASS_CD2();
						String strCLASS_CD1 = struct.getCLASS_CD1();
						String strCLASS_NAME3 = (struct.getList_CLASS_NAME3()).get(i).toString();
						String oldCLASS_CD3_MODIFY_COUNT = (struct.getList_MODIFY_COUNT_CD3()).get(i).toString();
						List cd3List;
						AA0190010Struct cd3Struct = new AA0190010Struct();
                        //空データ
						if ((strCLASS_CD3==null||("").equals(strCLASS_CD3)) && (strCLASS_NAME3==null||("").equals(strCLASS_NAME3))){
							continue;
						}
						
						cd3Struct.setCLASS_CD1(strCLASS_CD1);
						cd3Struct.setCLASS_CD2(strCLASS_CD2);
						cd3Struct.setCLASS_CD3(strCLASS_CD3);
						cd3Struct.setCLASS_NAME3(strCLASS_NAME3);
						cd3Struct.setsUser_ID(struct.getsUser_ID());
						cd3Struct.setMODIFY_COUNT_CD3(oldCLASS_CD3_MODIFY_COUNT);
						//cd3List = entity.mCLASS_CD3_MODIFY_COUNT.read(conn, cd3Struct);
				if (strCLASS_CD1.equals(AA0190Const.CLASS_01)) {
					// 得意先マスタ存在チェック
					if (isExistM_CUST(strCLASS_CD2, strCLASS_CD3)) {
						
						conn.rollback();
						ExpjMessage emsg = new ExpjMessage( "AA20045", strCLASS_CD2);
						msgStruct.addError( emsg ); 														
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_02)) {
					// 取引先マスタ存在チェック
					if (isExistM_VEND_CTRL(strCLASS_CD2, strCLASS_CD3)) {
						
						conn.rollback();
						ExpjMessage emsg = new ExpjMessage( "AA20046", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_03)) {
					// 品目マスタ存在チェック
					if (isExistM_ITEM(strCLASS_CD2, strCLASS_CD3)) {
						
						conn.rollback();
						ExpjMessage emsg = new ExpjMessage( "AA20047", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				}
				if (!"".equals(struct.getMODIFY_COUNT_CD3())){
					entity.mdeleteCLASS_CD3.delete(conn, cd3Struct);
				}				
			}
		}
				conn.commit();
				controlSelect();
			}catch(SQLException e) {
					conn.rollback();
					setReadStatus(ERROR);
					e.printStackTrace();
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}catch(Exception e) {
					e.printStackTrace();
					setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
					msgStruct.addError( emsg ); 
					sysLog.severe(emsg, getsysUSER_CD());
			}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			if(list != null){
				list.clear();
			}
				struct.clear();
				setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 全削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAlldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlAlldelete");
			//{{user_implement_dev:<controlAlldelete>
		try{
			List cList;		
			List selectDataList = entity.mSELECT_DATA.read(conn, struct);
			AA0190010Struct selectDataStruct;
			if (selectDataList.isEmpty()) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01105");
				msgStruct.addError( emsg ); 
				return;
			}
			for (int i=0;i<selectDataList.size();i++){
				selectDataStruct = (AA0190010Struct)selectDataList.get(i);
				String strCLASS_CD3 = selectDataStruct.getSEL_CLASS_CD3();
				String strCLASS_CD2 = struct.getCLASS_CD2();
				String strCLASS_CD1 = struct.getCLASS_CD1();

				if (strCLASS_CD1.equals(AA0190Const.CLASS_01)) {
					// 得意先マスタ存在チェック
					if (isExistM_CUST(strCLASS_CD2, strCLASS_CD3)) {
						
						ExpjMessage emsg = new ExpjMessage( "AA20045", strCLASS_CD2);
						msgStruct.addError( emsg ); 														
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_02)) {
					// 取引先マスタ存在チェック
					if (isExistM_VEND_CTRL(strCLASS_CD2, strCLASS_CD3)) {
						
						ExpjMessage emsg = new ExpjMessage( "AA20046", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				} else if (strCLASS_CD1.equals(AA0190Const.CLASS_03)) {
					// 品目マスタ存在チェック
					if (isExistM_ITEM(strCLASS_CD2, strCLASS_CD3)) {
						
						ExpjMessage emsg = new ExpjMessage( "AA20047", strCLASS_CD2);
						msgStruct.addError( emsg ); 						
						return;
					}
				}
			}	
            //中小分類DB削除
			entity.mdeleteCLASS_CD2.delete(conn, struct); 
            //大分類DB削除
			cList = entity.mdeleteCHK.read(conn, struct);  
			if (cList.isEmpty()){
				entity.mdeleteCLASS_CD1.delete(conn, struct);
			}
			conn.commit();
			controlClear();			
		}catch(SQLException e) {
				conn.rollback();
				setReadStatus(ERROR);
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				msgStruct.addError( emsg ); 
				sysLog.severe(emsg, getsysUSER_CD());
		}catch(ResourceBusyException rbe) {
			rbe.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		}catch(Exception e) {
				e.printStackTrace();
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				msgStruct.addError( emsg ); 
				sysLog.severe(emsg, getsysUSER_CD());
		}
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlAlldelete>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlAlldelete");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
        //初期化
		setReadStatus(INITIAL);
			// TODO: ユーザ定義のコードを記述してください
/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
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
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0190");
		logger.entering("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AA0190010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Alldelete") ) {
				controlAlldelete();
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
//			throw new FoundationException("AA0190010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0190010-E999","CSVの出力処理"));
			throw new FoundationException("AA0190010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0190010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0190010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0190010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0190010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0190010Entity entity;
	protected AA0190010Struct struct;
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

		entity = new AA0190010Entity();
		struct = new AA0190010Struct();

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
	 * AA0190010クラスの標準コンストラクタ
	 */
	public AA0190010Control() throws BusinessProcessException, FoundationException
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
				AA0190010Struct key = (AA0190010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_CLASS_CD1") && key.geth_CLASS_CD1() != null) {
					msgKey.setKeyValue("h_CLASS_CD1", key.geth_CLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("h_CLASS_CD2") && key.geth_CLASS_CD2() != null) {
					msgKey.setKeyValue("h_CLASS_CD2", key.geth_CLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("WriteStatus") && key.getWriteStatus() != null) {
					msgKey.setKeyValue("WriteStatus", key.getWriteStatus());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME1") && key.getCLASS_NAME1() != null) {
					msgKey.setKeyValue("CLASS_NAME1", key.getCLASS_NAME1());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD1") && key.getMODIFY_COUNT_CD1() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_CD1", key.getMODIFY_COUNT_CD1());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CD1") && key.getCLASS_CD1() != null) {
					msgKey.setKeyValue("CLASS_CD1", key.getCLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME2") && key.getCLASS_NAME2() != null) {
					msgKey.setKeyValue("CLASS_NAME2", key.getCLASS_NAME2());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD2") && key.getMODIFY_COUNT_CD2() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_CD2", key.getMODIFY_COUNT_CD2());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CD2") && key.getCLASS_CD2() != null) {
					msgKey.setKeyValue("CLASS_CD2", key.getCLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("CLASS_CD3") && key.getCLASS_CD3() != null) {
					msgKey.setKeyValue("CLASS_CD3", key.getCLASS_CD3());
				}
				if(msgKeyType.containsKeyColumn("CLASS_NAME3") && key.getCLASS_NAME3() != null) {
					msgKey.setKeyValue("CLASS_NAME3", key.getCLASS_NAME3());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD3") && key.getMODIFY_COUNT_CD3() != null) {
					msgKey.setKeyValue("MODIFY_COUNT_CD3", key.getMODIFY_COUNT_CD3());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_01_CD") && key.getCUST_CLASS_01_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_01_CD", key.getCUST_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_02_CD") && key.getCUST_CLASS_02_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_02_CD", key.getCUST_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_03_CD") && key.getCUST_CLASS_03_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_03_CD", key.getCUST_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_04_CD") && key.getCUST_CLASS_04_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_04_CD", key.getCUST_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_05_CD") && key.getCUST_CLASS_05_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_05_CD", key.getCUST_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_06_CD") && key.getCUST_CLASS_06_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_06_CD", key.getCUST_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_07_CD") && key.getCUST_CLASS_07_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_07_CD", key.getCUST_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_08_CD") && key.getCUST_CLASS_08_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_08_CD", key.getCUST_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_09_CD") && key.getCUST_CLASS_09_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_09_CD", key.getCUST_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CLASS_10_CD") && key.getCUST_CLASS_10_CD() != null) {
					msgKey.setKeyValue("CUST_CLASS_10_CD", key.getCUST_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_01_CD") && key.getVEND_CLASS_01_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_01_CD", key.getVEND_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_02_CD") && key.getVEND_CLASS_02_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_02_CD", key.getVEND_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_03_CD") && key.getVEND_CLASS_03_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_03_CD", key.getVEND_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_04_CD") && key.getVEND_CLASS_04_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_04_CD", key.getVEND_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_05_CD") && key.getVEND_CLASS_05_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_05_CD", key.getVEND_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_06_CD") && key.getVEND_CLASS_06_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_06_CD", key.getVEND_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_07_CD") && key.getVEND_CLASS_07_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_07_CD", key.getVEND_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_08_CD") && key.getVEND_CLASS_08_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_08_CD", key.getVEND_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_09_CD") && key.getVEND_CLASS_09_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_09_CD", key.getVEND_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CLASS_10_CD") && key.getVEND_CLASS_10_CD() != null) {
					msgKey.setKeyValue("VEND_CLASS_10_CD", key.getVEND_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_CD") && key.getITEM_CLASS_01_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_01_CD", key.getITEM_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_CD") && key.getITEM_CLASS_02_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_02_CD", key.getITEM_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_CD") && key.getITEM_CLASS_03_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_03_CD", key.getITEM_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_CD") && key.getITEM_CLASS_04_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_04_CD", key.getITEM_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_CD") && key.getITEM_CLASS_05_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_05_CD", key.getITEM_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_CD") && key.getITEM_CLASS_06_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_06_CD", key.getITEM_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_CD") && key.getITEM_CLASS_07_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_07_CD", key.getITEM_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_CD") && key.getITEM_CLASS_08_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_08_CD", key.getITEM_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_CD") && key.getITEM_CLASS_09_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_09_CD", key.getITEM_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_CD") && key.getITEM_CLASS_10_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_10_CD", key.getITEM_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_CD") && key.getITEM_CLASS_11_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_11_CD", key.getITEM_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_CD") && key.getITEM_CLASS_12_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_12_CD", key.getITEM_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_CLASS_CD1") && key.getSEL_CLASS_CD1() != null) {
					msgKey.setKeyValue("SEL_CLASS_CD1", key.getSEL_CLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("SEL_CLASS_CD2") && key.getSEL_CLASS_CD2() != null) {
					msgKey.setKeyValue("SEL_CLASS_CD2", key.getSEL_CLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("SEL_CLASS_CD3") && key.getSEL_CLASS_CD3() != null) {
					msgKey.setKeyValue("SEL_CLASS_CD3", key.getSEL_CLASS_CD3());
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
					AA0190010Struct key = new AA0190010Struct();
					if(msgKeyType.containsKeyColumn("h_CLASS_CD1")) {
						key.seth_CLASS_CD1(msgKey.getKeyValue("h_CLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("h_CLASS_CD2")) {
						key.seth_CLASS_CD2(msgKey.getKeyValue("h_CLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("WriteStatus")) {
						key.setWriteStatus(msgKey.getKeyValue("WriteStatus"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME1")) {
						key.setCLASS_NAME1(msgKey.getKeyValue("CLASS_NAME1"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD1")) {
						key.setMODIFY_COUNT_CD1(msgKey.getKeyValue("MODIFY_COUNT_CD1"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CD1")) {
						key.setCLASS_CD1(msgKey.getKeyValue("CLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME2")) {
						key.setCLASS_NAME2(msgKey.getKeyValue("CLASS_NAME2"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD2")) {
						key.setMODIFY_COUNT_CD2(msgKey.getKeyValue("MODIFY_COUNT_CD2"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CD2")) {
						key.setCLASS_CD2(msgKey.getKeyValue("CLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_CD3")) {
						key.setCLASS_CD3(msgKey.getKeyValue("CLASS_CD3"));
					}
					if(msgKeyType.containsKeyColumn("CLASS_NAME3")) {
						key.setCLASS_NAME3(msgKey.getKeyValue("CLASS_NAME3"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT_CD3")) {
						key.setMODIFY_COUNT_CD3(msgKey.getKeyValue("MODIFY_COUNT_CD3"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_01_CD")) {
						key.setCUST_CLASS_01_CD(msgKey.getKeyValue("CUST_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_02_CD")) {
						key.setCUST_CLASS_02_CD(msgKey.getKeyValue("CUST_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_03_CD")) {
						key.setCUST_CLASS_03_CD(msgKey.getKeyValue("CUST_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_04_CD")) {
						key.setCUST_CLASS_04_CD(msgKey.getKeyValue("CUST_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_05_CD")) {
						key.setCUST_CLASS_05_CD(msgKey.getKeyValue("CUST_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_06_CD")) {
						key.setCUST_CLASS_06_CD(msgKey.getKeyValue("CUST_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_07_CD")) {
						key.setCUST_CLASS_07_CD(msgKey.getKeyValue("CUST_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_08_CD")) {
						key.setCUST_CLASS_08_CD(msgKey.getKeyValue("CUST_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_09_CD")) {
						key.setCUST_CLASS_09_CD(msgKey.getKeyValue("CUST_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CLASS_10_CD")) {
						key.setCUST_CLASS_10_CD(msgKey.getKeyValue("CUST_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_01_CD")) {
						key.setVEND_CLASS_01_CD(msgKey.getKeyValue("VEND_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_02_CD")) {
						key.setVEND_CLASS_02_CD(msgKey.getKeyValue("VEND_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_03_CD")) {
						key.setVEND_CLASS_03_CD(msgKey.getKeyValue("VEND_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_04_CD")) {
						key.setVEND_CLASS_04_CD(msgKey.getKeyValue("VEND_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_05_CD")) {
						key.setVEND_CLASS_05_CD(msgKey.getKeyValue("VEND_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_06_CD")) {
						key.setVEND_CLASS_06_CD(msgKey.getKeyValue("VEND_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_07_CD")) {
						key.setVEND_CLASS_07_CD(msgKey.getKeyValue("VEND_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_08_CD")) {
						key.setVEND_CLASS_08_CD(msgKey.getKeyValue("VEND_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_09_CD")) {
						key.setVEND_CLASS_09_CD(msgKey.getKeyValue("VEND_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CLASS_10_CD")) {
						key.setVEND_CLASS_10_CD(msgKey.getKeyValue("VEND_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_CD")) {
						key.setITEM_CLASS_01_CD(msgKey.getKeyValue("ITEM_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_CD")) {
						key.setITEM_CLASS_02_CD(msgKey.getKeyValue("ITEM_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_CD")) {
						key.setITEM_CLASS_03_CD(msgKey.getKeyValue("ITEM_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_CD")) {
						key.setITEM_CLASS_04_CD(msgKey.getKeyValue("ITEM_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_CD")) {
						key.setITEM_CLASS_05_CD(msgKey.getKeyValue("ITEM_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_CD")) {
						key.setITEM_CLASS_06_CD(msgKey.getKeyValue("ITEM_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_CD")) {
						key.setITEM_CLASS_07_CD(msgKey.getKeyValue("ITEM_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_CD")) {
						key.setITEM_CLASS_08_CD(msgKey.getKeyValue("ITEM_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_CD")) {
						key.setITEM_CLASS_09_CD(msgKey.getKeyValue("ITEM_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_CD")) {
						key.setITEM_CLASS_10_CD(msgKey.getKeyValue("ITEM_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_CD")) {
						key.setITEM_CLASS_11_CD(msgKey.getKeyValue("ITEM_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_CD")) {
						key.setITEM_CLASS_12_CD(msgKey.getKeyValue("ITEM_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_CLASS_CD1")) {
						key.setSEL_CLASS_CD1(msgKey.getKeyValue("SEL_CLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("SEL_CLASS_CD2")) {
						key.setSEL_CLASS_CD2(msgKey.getKeyValue("SEL_CLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("SEL_CLASS_CD3")) {
						key.setSEL_CLASS_CD3(msgKey.getKeyValue("SEL_CLASS_CD3"));
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
