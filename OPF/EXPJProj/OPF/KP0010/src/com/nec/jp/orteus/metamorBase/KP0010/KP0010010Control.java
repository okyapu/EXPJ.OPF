/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0010/src/com/nec/jp/orteus/metamorBase/KP0010/KP0010010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0010;

import com.nec.jp.orteus.metamorBase.KP0010.*;
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
 * CLASS     : KP0010010Control クラス
 * ファイル・クラス説明
 * @author $Author: shao-guangfeng $
 * @version $Revision: 1.9 $ $Date: 2011/01/30 04:03:07 $
 *
 */
//}}user_implement_code_header

public class KP0010010Control
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
	public KP0010010Struct getListvalue(int x) { return (KP0010010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KP0010010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KP0010010Struct createStruct() { return new KP0010010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KP0010010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
		
		//** 会社コード */
		private String _companyCD;
		
		/** [コンボボックスデータ]情報（計画期間タイプ） */
		private ComboStruct _plnTermTypStruct = new ComboStruct();
		
		/**
		 * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
		 * @param code メッセージコード
		 */
		private void setInformationMessage(String code) {
			ExpjMessage emsg = new ExpjMessage(code);
			msgStruct.addInfo(emsg);
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
		 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
		 * @param code メッセージコード
		 * @param value1 置換文字列１
		 */
		private void setWarningMessage(String code, String value1) {
			ExpjMessage emsg = new ExpjMessage(code, value1);
			msgStruct.addWarn(emsg);
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
		 * 業務ワーニング発生時のパラメータ設定処理を切り出して関数化
		 * @param tableName テーブル名
		 * @param columnName カラム名
		 * @param value 値
		 */
		private void setWarningParameter(String tableName, String columnName, String value) {
			StringBuffer param = new StringBuffer();
			param.append(tableName);
			param.append('.');
			param.append(columnName);
			param.append(':');
			if (value != null) {
				param.append(value);
			}
			ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
			msgStruct.addWarn(emsg);
			sysLog.info(emsg, sysUSER_CD);
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
			
		/**自社情報の取得メソッド<br>
		 *変数 _companyCDに会社コードを参照させる。
		 */
		private void setCompanyCD() throws ExpjException {
			try {
				List myCompanyList = entity.mgetCOMPANY_CD.read(conn, struct);
				if (myCompanyList.isEmpty()) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				KP0010010Struct myCompanyStruct = (KP0010010Struct) myCompanyList.get(0);
				this._companyCD = myCompanyStruct.getCOMPANY_CD();
			} catch(Exception e) {
				setErrorMessage("KQ00039");
				throw new ExpjException("KQ00039");
			}
		}
		
		/**
		 * コンボボックスの値を元に表示文字列を取得します。
		 * @param cs コンボボックスストラクトオブジェクト
		 * @param val コンボボックスの値
		 * @return コンボボックスの表示用データ文字列
		 */
		private String getComboData(ComboStruct cs, String val) {
			List valList = cs.getValList();
			List explanList = cs.getExplanList();
			for (int i = 0; i < valList.size(); i++) {
				String listVal = (String) valList.get(i);
				if (val.equals(listVal)) {
					return (String) explanList.get(i);
				}
			}
			return null;
		}
		
		/**
		 * 画面の詳細項目を初期化します。
		 * @param clearFlg クリアフラグ
		 */
		private void initializeForm(boolean clearFlg) {
			if (clearFlg) {
				struct.setIN_CUST_CD(null);
				struct.setIN_CUST_ITEM_CD(null);
				struct.setIN_DLV_LOC_CD(null);
				struct.setIN_PLN_TERM_TYP("1");
				struct.setIN_PLN_STR_DATE(null);
				struct.setIN_PLN_END_DATE(null);
				struct.setIN_PLN_QTY(null);
			}
			readStatus = INITIAL;
		}
		
		/**
		 * 画面の一覧項目を初期化します。
		 */
		private void initializeList() {
			list = null;
			readStatus = INITIAL;
		}
		
		/**
		 * 画面の全項目を初期化します。
		 */
		private void initializeAll() {
			initializeForm(true);
			initializeList();
		}
		
		/**
		 * 一覧に登録された計画期間と入力した計画期間を比較する。
		 * @param s 比較するStruct
		 * @param lis 比較されるList
		 */
		public void checkPlnTerm(KP0010010Struct s, List lis) throws BusinessProcessException, FoundationException {
			//List lisがNULLの場合は新しくリストを作る。
			try {
				if (lis == null) {
					lis = new ArrayList(0);
				}
				//lisのレコードを一つずつ検証する。
				for (int i = 0; i < lis.size(); i++) {
					KP0010010Struct tempStruct = (KP0010010Struct) lis.get(i);
					if (
						(tempStruct.getCUST_CD().equals(s.getCUST_CD())) &&
						(tempStruct.getCUST_ITEM_CD().equals(s.getCUST_ITEM_CD())) &&
						(tempStruct.getDLV_LOC_CD().equals(s.getDLV_LOC_CD())) &&
						!(tempStruct.getNO().equals(s.getNO()))
					) {
						
						if(
							((DateTool.compareYMD(tempStruct.getPLN_STR_DATE(), s.getPLN_STR_DATE())) <= 0) &&
							((DateTool.compareYMD(tempStruct.getPLN_END_DATE(), s.getPLN_STR_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
						
						if(
							((DateTool.compareYMD(s.getPLN_STR_DATE(), tempStruct.getPLN_STR_DATE())) <= 0) &&
							((DateTool.compareYMD(s.getPLN_END_DATE(), tempStruct.getPLN_STR_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
						
						if(
							((DateTool.compareYMD(tempStruct.getPLN_STR_DATE(), s.getPLN_END_DATE())) <= 0) &&
							((DateTool.compareYMD(tempStruct.getPLN_END_DATE(), s.getPLN_END_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
						
						if(
							((DateTool.compareYMD(s.getPLN_STR_DATE(), tempStruct.getPLN_END_DATE())) <= 0) &&
							((DateTool.compareYMD(s.getPLN_END_DATE(), tempStruct.getPLN_END_DATE())) >= 0)
						) {
							setErrorMessage("KP00001");
							return;
						}
					}
				}
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00002");
				return;
			}
		}
		
		/**
		 * DBに登録された計画期間と入力した計画期間を比較する。
		 * @param s 比較するStruct
		 */
		public boolean checkPlnTermFromDB(KP0010010Struct s) throws BusinessProcessException, FoundationException {
			try {
				//データベース上のレコードと日付の重複が無いかをチェック
				List psDateList = entity.mcheckPLN_DATE.read(conn, s);
				if (psDateList.size() > 0) {
					setErrorMessage("KP00001");
					return true;
				}
				return false;
			} catch (SQLException e) {
				e.printStackTrace();
				setErrorMessage("KP00002");
				return true;
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00002");
				return true;
			}
		}
		
		/**
		 * 画面入力情報をもとにデータベースから情報を取得する。
		 * @param s 情報を格納するStruct
		 */
		public void setListData(KP0010010Struct s) throws BusinessProcessException, FoundationException {
			try {
				//引数で指定したStructに会社コードをセット
				setCompanyCD();
				s.setCOMPANY_CD(this._companyCD);
				
				// 得意先情報の取得
				List custList = entity.mgetCUSTinfo.read(conn, s);
				if (custList.isEmpty()) {
					setErrorMessage("KQ00014");
					setErrorParameter("M_CUST", "CUST_CD", s.getIN_CUST_CD());
					return;
				}
				// 得意先情報のデータセット
				KP0010010Struct custStruct = (KP0010010Struct) custList.get(0);
				s.setCUST_CD(custStruct.getCUST_CD());
				s.setCUST_ANAME(custStruct.getCUST_ANAME());
				
				// 納品場所情報の取得
				// 納品場所コードが入力されていない場合
				List custBaseList = null;
				if (("".equals(s.getIN_DLV_LOC_CD())) || (s.getIN_DLV_LOC_CD() == null)) {
					custBaseList = entity.mgetM_CUST_BASEinfoWhenNoC.read(conn, s);
					if (custBaseList.isEmpty()) {
						setErrorMessage("KQ00015");
						setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getCOMPANY_CD());
						setErrorParameter("M_CUST_BASE", "CUST_CD", s.getIN_CUST_CD());
						return;
					} else if (custBaseList.size() > 1) {
						setErrorMessage("KP00005");
						setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getCOMPANY_CD());
						setErrorParameter("M_CUST_BASE", "CUST_CD", s.getIN_CUST_CD());
						return;
					}
				} else {
					// 納品場所コードが入力されている場合
					custBaseList = entity.mgetM_CUST_BASEinfo.read(conn, s);
					if (custBaseList.isEmpty()) {
						setErrorMessage("KQ00015");
						setErrorParameter("M_CUST_BASE", "COMPANY_CD", s.getCOMPANY_CD());
						setErrorParameter("M_CUST_BASE", "CUST_CD", s.getIN_CUST_CD());
						setErrorParameter("M_CUST_BASE", "DLV_LOC_CD", s.getIN_DLV_LOC_CD());
						return;
					}
				}
				// 納品場所情報のデータセット
				KP0010010Struct custBaseStruct = (KP0010010Struct) custBaseList.get(0);
				s.setDLV_LOC_CD(custBaseStruct.getDLV_LOC_CD());
				s.setDLV_LOC_NAME(custBaseStruct.getDLV_LOC_NAME());
				s.setPLANT_CD(custBaseStruct.getPLANT_CD());
				
				// 製品情報の取得
				List itemSpecList = entity.mgetITEMinfo.read(conn, s);
				if (itemSpecList.isEmpty()) {
					setErrorMessage("KQ00017");
					setErrorParameter("M_ITEM_SPEC", "CUST_ITEM_CD", s.getIN_CUST_ITEM_CD());
					return;
				}
				// 製品情報データセット
				KP0010010Struct itemSpecStruct = (KP0010010Struct) itemSpecList.get(0);
				s.setCUST_ITEM_CD(itemSpecStruct.getCUST_ITEM_CD());
				s.setCUST_ITEM_NAME(itemSpecStruct.getCUST_ITEM_NAME());
				s.setITEM_CD(itemSpecStruct.getITEM_CD());
				s.setITEM_NAME(itemSpecStruct.getITEM_NAME());
				s.setPLN_QTY(itemSpecStruct.getPLN_QTY());
				s.setUNIT_QTY_TYP(itemSpecStruct.getUNIT_QTY_TYP());
				s.setSTOCK_UNIT(itemSpecStruct.getSTOCK_UNIT());
				s.setMRP_ODR_TYP(itemSpecStruct.getMRP_ODR_TYP());
				
				//計画数のデータセット
				// 整数管理チェック
				if ("1".equals(s.getUNIT_QTY_TYP())) {
					// 整数管理
					if (s.getIN_PLN_QTY().indexOf(".") >= 0) {
						// 小数入力の場合：切上げ
						String tempString = s.getIN_PLN_QTY();
						double tempDouble1 = Double.parseDouble(tempString);
						s.setPLN_QTY(Calculate.ceil(s.getIN_PLN_QTY(), 0));
						double tempDouble2 = Double.parseDouble(s.getPLN_QTY());
						if (tempDouble1 != tempDouble2) {
							// ".0"入力除外
							setWarningMessage("KQ20004");
							setWarningParameter("T_SALES_PLAN", "PLN_QTY", tempString);
						}
					} else {
						s.setPLN_QTY(s.getIN_PLN_QTY());
					}
				} else {
					//整数管理品目ではない場合
					s.setPLN_QTY(s.getIN_PLN_QTY());
				}
				
				//計画期間タイプ（表示説明）のセット
				s.setPLN_TERM_TYP(s.getIN_PLN_TERM_TYP());
				//計画期間タイプ（値）のセット
				//s.setPLN_TERM_TYP_DN(getComboData(_plnTermTypStruct, s.getPLN_TERM_TYP()));
				s.setPLN_TERM_TYP_DN(this.multcombo("PLN_TERM_TYP", s.getPLN_TERM_TYP()));
				
				//計画開始日のセット
				s.setPLN_STR_DATE(s.getIN_PLN_STR_DATE());
				
				
				//計画終了日のセット
				//計画期間タイプが「１」（日）の場合
				if ("1".equals(s.getPLN_TERM_TYP())) {
					s.setPLN_END_DATE(s.getIN_PLN_STR_DATE());
				//計画期間タイプが「２」（週・旬等）の場合
				} else if ("2".equals(s.getPLN_TERM_TYP())){
					s.setPLN_END_DATE(s.getIN_PLN_END_DATE());
				//計画期間タイプが「３」（月）の場合
				} else {
					try {
						Calendar cal = Calendar.getInstance();
						Date tempDate = new Date();
					
						tempDate = Converter.strToDate(s.getIN_PLN_STR_DATE() ,"yyyy/MM/dd");
					
						cal.setTime(tempDate);
					
						cal.set(cal.DAY_OF_MONTH, cal.getActualMaximum(cal.DAY_OF_MONTH));
						tempDate = cal.getTime();
					
						s.setPLN_END_DATE(Converter.dateToStr(tempDate ,"yyyy/MM/dd"));
					} catch(Exception e) {
						e.printStackTrace();
						setErrorMessage("KP00006");
						return;
					}
				}
				
				//計画期間のセット
				int termDays = 1;
				//計画開始日と計画終了日を比較
				String tempDay = new String(s.getPLN_STR_DATE());
				try {
					if ((DateTool.compareYMD(s.getPLN_END_DATE(), tempDay)) < 0){
						setErrorMessage("KP00002");
						return;
					}
					//計画期間を計算
					while(DateTool.compareYMD(s.getPLN_END_DATE(), tempDay) != 0){
						tempDay = DateTool.addDay(tempDay, "1");
						termDays++;
						//１０００日を越える計画は立てられない。
						if (termDays >= 1000) {
							setErrorMessage("KP00007");
							return;
						}
					}
					
					s.setTERM_DAYS(String.valueOf(termDays));
					
					//DBに登録された計画期間と入力した計画期間を比較する。
					if(checkPlnTermFromDB(s)){
						return;
					}
				} catch(Exception e) {
					e.printStackTrace();
					setErrorMessage("KP00002");
					return;
				}
				
				//生産計画登録フラグの値のセット
				//品目手配区分のチェック
				
				boolean mprOdrTypFlg = false;
				
				if(s.getMRP_ODR_TYP().equals("4")||s.getMRP_ODR_TYP().equals("5")||s.getMRP_ODR_TYP().equals("6")||s.getMRP_ODR_TYP().equals("7")){
					mprOdrTypFlg = true;
				}
				
				if (s.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == true) {
					//生産計画登録フラグのセット
					s.setADD_TO_OD_FLG("1");
					s.setTEMP_ADD_TO_OD_FLG("true");
					s.setchkADD_TO_OD("true");
				}else if (s.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == false){
					//生産計画登録フラグのセット
					s.setADD_TO_OD_FLG("0");
					//生産計画登録フラグ（TEMP）のセット
					s.setTEMP_ADD_TO_OD_FLG("NULL");
					s.setchkADD_TO_OD("NULL");
					setWarningMessage("KP00010");
					setWarningParameter("M_ITEM", "ITEM_CD", s.getITEM_CD());
				} else {
					//生産計画登録フラグのセット
					s.setADD_TO_OD_FLG("0");
					//生産計画登録フラグ（TEMP）のセット
					s.setTEMP_ADD_TO_OD_FLG("NULL");
					s.setchkADD_TO_OD("NULL");
				}
				
				// 生産計画登録フラグ（表示説明）の取得
				List addToOdList = entity.mgetADD_TO_OD_FLGinfo.read(conn, s);
				//生産計画登録フラグ（表示説明）のセット
				KP0010010Struct addToOdStruct = (KP0010010Struct) addToOdList.get(0);
				//s.setADD_TO_OD_FLG_DN(addToOdStruct.getADD_TO_OD_FLG_DN());
				s.setADD_TO_OD_FLG_DN(this.multcombo("ADD_TO_OD_FLG",addToOdStruct.getADD_TO_OD_FLG_DN()));
				
				// 品目手配区分（表示説明）の取得
				List mprOdrTypList = entity.mgetMPR_ODR_TYPinfo.read(conn, s);
				//品目手配区分（表示説明）のセット
				KP0010010Struct mprOdrTypStruct = (KP0010010Struct) mprOdrTypList.get(0);
				//s.setMRP_ODR_TYP_DN(mprOdrTypStruct.getMRP_ODR_TYP_DN());
				s.setMRP_ODR_TYP_DN(this.multcombo("MRP_ODR_TYP",mprOdrTypStruct.getMRP_ODR_TYP_DN()));
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				setErrorMessage("KP00004");
				return;
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00004");
				return;
			}
		}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAddition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");
			//{{user_implement_dev:<controlAddition>
			// TODO: ユーザ定義のコードを記述してください
				//リストがnullの場合は生成する。
				if (list == null) {
					list = new ArrayList(0);
				}
				
				// 「NO」を求める。
				int no = list.size() + 1;
				
				//一覧データが最大表示行数を超えていた場合
				// （追加前の事前チェックのため、size + 1と比較する）
				int maxLine = sp.getMaxLine(conn, 10);
				if ((maxLine != 0) && (list.size() + 1 > maxLine)) {
					setErrorMessage("KQ00100", String.valueOf(maxLine));
					return;
				}
				
				// 入力内容より一覧用ストラクトを作成
				KP0010010Struct newListStruct = new KP0010010Struct();
				newListStruct.setNO(String.valueOf(no));
				newListStruct.setIN_CUST_CD(struct.getIN_CUST_CD());
				newListStruct.setIN_CUST_ITEM_CD(struct.getIN_CUST_ITEM_CD());
				newListStruct.setIN_DLV_LOC_CD(struct.getIN_DLV_LOC_CD());
				newListStruct.setIN_PLN_TERM_TYP(struct.getIN_PLN_TERM_TYP());
				newListStruct.setIN_PLN_STR_DATE(struct.getIN_PLN_STR_DATE());
				newListStruct.setIN_PLN_END_DATE(struct.getIN_PLN_END_DATE());
				newListStruct.setIN_PLN_QTY(struct.getIN_PLN_QTY());
				newListStruct.setchkADD_TO_OD(struct.getchkADD_TO_OD());
				
				// マスタ参照処理を行う。
				setListData(newListStruct);
				
				// 一覧上に情報と期間の重複が無いかのチェック
				checkPlnTerm(newListStruct, list);
				
				// エラーがあれば処理を中断
				if (msgStruct.hasError()) {
					return;
				}
				
				// 一覧を追加
				list.add(newListStruct);
				
				// 編集フォームを初期化
				initializeForm(false);
				
                //}}user_implement_dev:<controlAddition>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlAddition");

		return;
	}

	/**
	 * 修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlModify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");
			//{{user_implement_dev:<controlModify>
			// TODO: ユーザ定義のコードを記述してください
				for (int i = 0; i < list.size(); i++) {
					// 修正対象の「NO」を探す。
					KP0010010Struct listStruct = (KP0010010Struct) list.get(i);
					if (listStruct.getNO().equals(struct.geth_NO())) {
						KP0010010Struct newListStruct = new KP0010010Struct();
						newListStruct.setNO(struct.geth_NO());
						newListStruct.setIN_CUST_CD(struct.getIN_CUST_CD());
						newListStruct.setIN_CUST_ITEM_CD(struct.getIN_CUST_ITEM_CD());
						newListStruct.setIN_DLV_LOC_CD(struct.getIN_DLV_LOC_CD());
						newListStruct.setIN_PLN_TERM_TYP(struct.getIN_PLN_TERM_TYP());
						newListStruct.setIN_PLN_STR_DATE(struct.getIN_PLN_STR_DATE());
						newListStruct.setIN_PLN_END_DATE(struct.getIN_PLN_END_DATE());
						newListStruct.setIN_PLN_QTY(struct.getIN_PLN_QTY());
						newListStruct.setchkADD_TO_OD(struct.getchkADD_TO_OD());
						
						// マスタ参照処理を行う。
						setListData(newListStruct);
						
						// 一覧上に情報と期間の重複が無いかのチェック
						checkPlnTerm(newListStruct, list);
						
						// エラーがあれば処理を中断
						if (msgStruct.hasError()) {
							return;
						}
						// 一覧データを上書きする。
						list.set(i, newListStruct);
						
						// 編集フォームを初期化
						initializeForm(false);
						return;
					}
				}
                //}}user_implement_dev:<controlModify>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlModify");

		return;
	}

	/**
	 * 消去ボタン押下時に実行される処理です。
	 *
	 */
	public void controlEliminate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");
			//{{user_implement_dev:<controlEliminate>
			// TODO: ユーザ定義のコードを記述してください
				for (int i = 0; i < list.size(); i++) {
					// 削除対象の「NO」を探す。
					KP0010010Struct listStruct = (KP0010010Struct) list.get(i);
					if (listStruct.getNO().equals(struct.geth_NO())) {
						// 対象データを一覧から削除
						list.remove(i);
						// 削除したデータ以降にデータある場合はそのデータの「NO」を1繰り上げる。
						for (int j = i; j < list.size(); j++) {
							KP0010010Struct modifyListStruct = (KP0010010Struct) list.get(j);
							int newNo = Integer.valueOf(modifyListStruct.getNO()).intValue() - 1;
							modifyListStruct.setNO(String.valueOf(newNo));
							list.set(j, modifyListStruct);
						}
						// 編集フォームを初期化
						initializeForm(true);
						return;
					}
				}
                //}}user_implement_dev:<controlEliminate>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlEliminate");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ユーザ定義のコードを記述してください
			//ロールバック判定フラグ
			boolean rollbackFlg = false;
				
			try {
				int nRet = 0;
				//リストにあるデータを販売所要計画テーブルに登録
				for (int i = 0; i < list.size(); i++) {
					
					KP0010010Struct listStruct = (KP0010010Struct) list.get(i);
					
					//販売所要計画番号の取得
					try{
						List salesPlanCdList = entity.mgetSEQ_SALES_PLAN_CD.read(conn, listStruct);
						if (salesPlanCdList.isEmpty()) {
							setErrorMessage("KP00003");
							return;
						}
						
						KP0010010Struct salesPlanCdStruct = (KP0010010Struct) salesPlanCdList.get(0);
						
						//計画番号をセット
						listStruct.setSALES_PLAN_CD(salesPlanCdStruct.getSALES_PLAN_CD());
						
					} catch (Exception ex) {
						ex.printStackTrace();
						rollbackFlg = true;
						setErrorMessage("KP00003");
						return;
					}
					
					//ユーザをセット
					listStruct.setsUser_ID(struct.getsUser_ID());
					
					//重複の有無をチェック
					
					if(checkPlnTermFromDB(listStruct)){
						return;
					}
					
					nRet = entity.minsertT_SALES_PLAN.create(conn, listStruct);
					
				}
			} catch(SQLException e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			}catch(Exception e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} finally {
				if(rollbackFlg == false) {
					conn.commit();
					//画面の情報を初期化
					initializeAll();
				} else {
					conn.rollback();
				}
			}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
				initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
			initializeAll();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			//コンボボックスにデータに登録するデータを取得して_plnTermTypStructに格納
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			_plnTermTypStruct = cb.getData("PLN_TERM_TYP");
			cb.setConnection(null);
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
//				controlSelect();
			}
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0010");
		logger.entering("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KP0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Addition") ) {
				controlAddition();
			} else if( button.equals("Modify") ) {
				controlModify();
			} else if( button.equals("Eliminate") ) {
				controlEliminate();
			} else if( button.equals("Insert") ) {
				controlInsert();
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
			// TODO: ユーザ定義のコードを記述してください
			//コンボボックスにデータを登録。
			struct.setList_IN_PLN_TERM_TYP_val(_plnTermTypStruct.getValList());
			struct.setList_IN_PLN_TERM_TYP_name(_plnTermTypStruct.getExplanList());
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
//			throw new FoundationException("KP0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0010010-E999","CSVの出力処理"));
			throw new FoundationException("KP0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0010010-E999","システム日付の取得処理"));
				throw new FoundationException("KP0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("KP0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KP0010010Entity entity;
	protected KP0010010Struct struct;
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

		entity = new KP0010010Entity();
		struct = new KP0010010Struct();

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
	 * KP0010010クラスの標準コンストラクタ
	 */
	public KP0010010Control() throws BusinessProcessException, FoundationException
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
				KP0010010Struct key = (KP0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO());
				}
				if(msgKeyType.containsKeyColumn("PLN_TERM_TYP_DN") && key.getPLN_TERM_TYP_DN() != null) {
					msgKey.setKeyValue("PLN_TERM_TYP_DN", key.getPLN_TERM_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("TEMP_ADD_TO_OD_FLG") && key.getTEMP_ADD_TO_OD_FLG() != null) {
					msgKey.setKeyValue("TEMP_ADD_TO_OD_FLG", key.getTEMP_ADD_TO_OD_FLG());
				}
				if(msgKeyType.containsKeyColumn("chkADD_TO_OD") && key.getchkADD_TO_OD() != null) {
					msgKey.setKeyValue("chkADD_TO_OD", key.getchkADD_TO_OD());
				}
				if(msgKeyType.containsKeyColumn("h_NO") && key.geth_NO() != null) {
					msgKey.setKeyValue("h_NO", key.geth_NO());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP") && key.getIN_PLN_TERM_TYP() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP", key.getIN_PLN_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name") && key.getIN_PLN_TERM_TYP_name() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_name", key.getIN_PLN_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val") && key.getIN_PLN_TERM_TYP_val() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_val", key.getIN_PLN_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE") && key.getIN_PLN_STR_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_STR_DATE", key.getIN_PLN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE") && key.getIN_PLN_END_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_END_DATE", key.getIN_PLN_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_QTY") && key.getIN_PLN_QTY() != null) {
					msgKey.setKeyValue("IN_PLN_QTY", key.getIN_PLN_QTY());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_PLAN_CD") && key.getSALES_PLAN_CD() != null) {
					msgKey.setKeyValue("SALES_PLAN_CD", key.getSALES_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_CD") && key.getIN_CUST_CD() != null) {
					msgKey.setKeyValue("IN_CUST_CD", key.getIN_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD") && key.getIN_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("IN_CUST_ITEM_CD", key.getIN_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_DLV_LOC_CD") && key.getIN_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("IN_DLV_LOC_CD", key.getIN_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("PLN_STR_DATE") && key.getPLN_STR_DATE() != null) {
					msgKey.setKeyValue("PLN_STR_DATE", key.getPLN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLN_END_DATE") && key.getPLN_END_DATE() != null) {
					msgKey.setKeyValue("PLN_END_DATE", key.getPLN_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("TERM_DAYS") && key.getTERM_DAYS() != null) {
					msgKey.setKeyValue("TERM_DAYS", key.getTERM_DAYS());
				}
				if(msgKeyType.containsKeyColumn("PLN_TERM_TYP") && key.getPLN_TERM_TYP() != null) {
					msgKey.setKeyValue("PLN_TERM_TYP", key.getPLN_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLN_QTY") && key.getPLN_QTY() != null) {
					msgKey.setKeyValue("PLN_QTY", key.getPLN_QTY());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG") && key.getADD_TO_OD_FLG() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG", key.getADD_TO_OD_FLG());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG_DN") && key.getADD_TO_OD_FLG_DN() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG_DN", key.getADD_TO_OD_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
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
					KP0010010Struct key = new KP0010010Struct();
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(msgKey.getKeyValue("NO"));
					}
					if(msgKeyType.containsKeyColumn("PLN_TERM_TYP_DN")) {
						key.setPLN_TERM_TYP_DN(msgKey.getKeyValue("PLN_TERM_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_ADD_TO_OD_FLG")) {
						key.setTEMP_ADD_TO_OD_FLG(msgKey.getKeyValue("TEMP_ADD_TO_OD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("chkADD_TO_OD")) {
						key.setchkADD_TO_OD(msgKey.getKeyValue("chkADD_TO_OD"));
					}
					if(msgKeyType.containsKeyColumn("h_NO")) {
						key.seth_NO(msgKey.getKeyValue("h_NO"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP")) {
						key.setIN_PLN_TERM_TYP(msgKey.getKeyValue("IN_PLN_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name")) {
						key.setIN_PLN_TERM_TYP_name(msgKey.getKeyValue("IN_PLN_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val")) {
						key.setIN_PLN_TERM_TYP_val(msgKey.getKeyValue("IN_PLN_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE")) {
						key.setIN_PLN_STR_DATE(msgKey.getKeyValue("IN_PLN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE")) {
						key.setIN_PLN_END_DATE(msgKey.getKeyValue("IN_PLN_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_QTY")) {
						key.setIN_PLN_QTY(msgKey.getKeyValue("IN_PLN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_PLAN_CD")) {
						key.setSALES_PLAN_CD(msgKey.getKeyValue("SALES_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_CD")) {
						key.setIN_CUST_CD(msgKey.getKeyValue("IN_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_CUST_ITEM_CD")) {
						key.setIN_CUST_ITEM_CD(msgKey.getKeyValue("IN_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_DLV_LOC_CD")) {
						key.setIN_DLV_LOC_CD(msgKey.getKeyValue("IN_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLN_STR_DATE")) {
						key.setPLN_STR_DATE(msgKey.getKeyValue("PLN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLN_END_DATE")) {
						key.setPLN_END_DATE(msgKey.getKeyValue("PLN_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TERM_DAYS")) {
						key.setTERM_DAYS(msgKey.getKeyValue("TERM_DAYS"));
					}
					if(msgKeyType.containsKeyColumn("PLN_TERM_TYP")) {
						key.setPLN_TERM_TYP(msgKey.getKeyValue("PLN_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLN_QTY")) {
						key.setPLN_QTY(msgKey.getKeyValue("PLN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG")) {
						key.setADD_TO_OD_FLG(msgKey.getKeyValue("ADD_TO_OD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG_DN")) {
						key.setADD_TO_OD_FLG_DN(msgKey.getKeyValue("ADD_TO_OD_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
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
