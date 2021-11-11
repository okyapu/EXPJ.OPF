/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KP0020/src/com/nec/jp/orteus/metamorBase/KP0020/KP0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KP0020;

import com.nec.jp.orteus.metamorBase.KP0020.*;
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
 * CLASS     : KP0020010Control クラス
 * ファイル・クラス説明
 * @author $Author: shao-guangfeng $
 * @version $Revision: 1.12 $ $Date: 2011/01/30 04:03:45 $
 *
 */
//}}user_implement_code_header

public class KP0020010Control
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
	public KP0020010Struct getListvalue(int x) { return (KP0020010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KP0020010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KP0020010Struct createStruct() { return new KP0020010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KP0020010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
		
		/** 画面遷移キー(販売所要計画番号) */
		private String _IN_SALES_PLAN_CD;

		/**
		 * 画面遷移キー(販売所要計画番号)取得
		 * @return 販売所要計画
		 */
		public String getIN_SALES_PLAN_CD() {
			return _IN_SALES_PLAN_CD;
		}
		/**
		 * 画面遷移キー(販売所要計画番号)設定
		 * @param cd 販売所要計画
		 */
		public void setIN_SALES_PLAN_CD(String cd) {
			_IN_SALES_PLAN_CD = cd;
		}
		
		//** 会社コード */
		private String _companyCD;
		
		//** アップデート情報保存用ストラクト
		private KP0020010Struct _updateStruct = new KP0020010Struct();
		private KP0020010Struct _deleteStruct = new KP0020010Struct();
		
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
		
		/**
		 * 自社情報の取得メソッド
		 * 変数 _companyCDに会社コードを参照させる。
		 */
		private void setCompanyCD() throws ExpjException {
			try {
				List myCompanyList = entity.mgetCOMPANY_CD.read(conn, struct);
				if (myCompanyList.isEmpty()) {
					setErrorMessage("KQ00039");
					throw new ExpjException("KQ00039");
				}
				KP0020010Struct myCompanyStruct = (KP0020010Struct) myCompanyList.get(0);
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
		 * 画面の上段・中段フォームを初期化します。
		 * @param clearFlg クリアフラグ
		 */
		private void initializeUpperForm(boolean clearFlg) {
			if (clearFlg) {
				struct.setIN_SALES_PLAN_CD(null);
			}
			readStatus = INITIAL;
		}
		
		/**
		 * 画面の項目を初期化します。
		 * @param clearFlg クリアフラグ
		 */
		private void initializeLowerForm(boolean clearFlg) {
			if (clearFlg) {
				struct.setchkADD_TO_OD("false");
				struct.setIN_PLN_QTY(null);
				struct.setIN_PLN_TERM_TYP("1");
				struct.setIN_PLN_STR_DATE(null);
				struct.setIN_PLN_END_DATE(null);
				struct.setCUST_CD(null);
				struct.setCUST_ANAME(null);
				struct.setCUST_ITEM_CD(null);
				struct.setCUST_ITEM_NAME(null);
				struct.setITEM_CD(null);
				struct.setITEM_NAME(null);
				struct.setDLV_LOC_CD(null);
				struct.setDLV_LOC_NAME(null);
				struct.setSTOCK_UNIT(null);
				struct.setPLN_CD(null);
				struct.setMODIFY_COUNT(null);
			}
			readStatus = INITIAL;
		}
		
		/**
		 * 画面の全項目を初期化します。
		 */
		private void initializeAll() {
			initializeUpperForm(true);
			initializeLowerForm(true);
			_updateStruct.clear();
			_deleteStruct.clear();
			struct.clear();
		}
		
		/**
		* DBに登録された計画期間と入力した計画期間を比較する。
		* @param s 比較するStruct
		*/
		public boolean checkPlnTermFromDB(KP0020010Struct s) throws BusinessProcessException, FoundationException {
			try {
				//データベース上のレコードと日付の重複が無いかをチェック
				
				List psDateList = entity.mcheckPLN_DATE.read(conn, s);
		
				if(psDateList.size() == 1){
					//計画期間の以内のレコードが自分しかない場合、更新を許す
					if(((KP0020010Struct) psDateList.get(0)).getD_SALES_PLAN_CD().equals(s.getIN_SALES_PLAN_CD())){
						return false;
					//計画期間の以内のレコードが自分ではない場合、期間重複のため、更新を許さない
					}else{
						setErrorMessage("KP00001");
						return true;
					}
				//計画期間の以内のレコードは存在してない場合、更新を許す	
				}else if(psDateList.size() == 0){
						return false;
				}
			
				//計画期間の以内のレコードが複数存在している場合、期間重複のため、更新を許さない
				setErrorMessage("KP00001");
				return true;
				
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
		* @param s データを登録するStruct
		*/
		public void setListData(KP0020010Struct s) throws BusinessProcessException, FoundationException {
			try {
				
				//引数で指定したStructに会社コードをセット
				setCompanyCD();
				s.setCOMPANY_CD(this._companyCD);
				
				//販売所要計画番号を元にDBを検索し、結果をtempListへ
				List tempList = entity.mgetT_SALES_PLANinfo.read(conn, s);
				
				//対象データが存在しない場合、メッセージを出力して終了する。
				if (tempList.isEmpty()) {
					//対象データが存在しません。
					setErrorMessage("ZZ06001");
					setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", s.getIN_SALES_PLAN_CD());
					return;
				}
				
				//readStatusの設定
				readStatus = NORMAL;
				
				//tempListの一つ目のレコードをtempStructへ
				KP0020010Struct tempStruct = (KP0020010Struct) tempList.get(0);
				
				//生産計画登録フラグ
				if("1".equals(tempStruct.getADD_TO_OD_FLG())) {
					s.setchkADD_TO_OD("true");
				} else {
					s.setchkADD_TO_OD("false");
				}
				
				s.setIN_PLN_QTY(tempStruct.getIN_PLN_QTY());
				s.setIN_PLN_TERM_TYP(tempStruct.getIN_PLN_TERM_TYP());
				s.setIN_PLN_STR_DATE(tempStruct.getIN_PLN_STR_DATE());
				s.setIN_PLN_END_DATE(tempStruct.getIN_PLN_END_DATE());
				s.setCUST_CD(tempStruct.getCUST_CD());
				s.setCUST_ANAME(tempStruct.getCUST_ANAME());
				s.setDLV_LOC_CD(tempStruct.getDLV_LOC_CD());
				s.setDLV_LOC_NAME(tempStruct.getDLV_LOC_NAME());
				s.setCUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());
				s.setCUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());
				
				s.setPLN_CD(tempStruct.getPLN_CD());
				s.setCOMPANY_CD(tempStruct.getCOMPANY_CD());
				s.setMODIFY_COUNT(tempStruct.getMODIFY_COUNT());
				
				// 製品情報の取得
				List itemSpecList = entity.mgetITEMinfo.read(conn, s);
				if (itemSpecList.isEmpty()) {
					setErrorMessage("KQ00017");
					setErrorParameter("M_ITEM_SPEC", "CUST_ITEM_CD", s.getCUST_ITEM_CD());
					return;
				}
				
				// 製品情報データセット
				KP0020010Struct itemSpecStruct = (KP0020010Struct) itemSpecList.get(0);
				s.setUNIT_QTY_TYP(itemSpecStruct.getUNIT_QTY_TYP());
				s.setSTOCK_UNIT(itemSpecStruct.getSTOCK_UNIT());
				s.setMRP_ODR_TYP(itemSpecStruct.getMRP_ODR_TYP());
				s.setITEM_CD(itemSpecStruct.getITEM_CD());
				s.setITEM_NAME(itemSpecStruct.getITEM_NAME());
				
			} catch(Exception e) {
				e.printStackTrace();
				setErrorMessage("KP00008");
				setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", s.getIN_SALES_PLAN_CD());
				return;
			}
		}
		
		/**
		* 更新処理を行う
		* @param updateDataStruct 更新用データを登録するStruct
		* @param tempDataStruct データの取得元のStruct
		* tempDataStructの情報をupdateDataStructにコピーして、更新用Structを作成する。
		*/
		public void setUpdateData(KP0020010Struct updateDataStruct, KP0020010Struct tempDataStruct) throws BusinessProcessException, FoundationException {
			//ロールバック判定フラグ
			boolean rollbackFlg = false;
			
			try {
				
				//販売所要計画番号のセット
				updateDataStruct.setIN_SALES_PLAN_CD(tempDataStruct.getIN_SALES_PLAN_CD());
				
				
				//計画数のデータセット
				// 整数管理チェック
				if ("1".equals(tempDataStruct.getUNIT_QTY_TYP())) {
					// 整数管理
					if (tempDataStruct.getIN_PLN_QTY().indexOf(".") >= 0) {
						// 小数入力の場合：切上げ
						String tempString = tempDataStruct.getIN_PLN_QTY();
						double tempDouble1 = Double.parseDouble(tempString);
						updateDataStruct.setIN_PLN_QTY(Calculate.ceil(tempDataStruct.getIN_PLN_QTY(), 0));
						double tempDouble2 = Double.parseDouble(updateDataStruct.getIN_PLN_QTY());
						if (tempDouble1 != tempDouble2) {
							// ".0"入力除外
							setWarningMessage("KQ20004");
							setWarningParameter("T_SALES_PLAN", "PLN_QTY", tempString);
						}
					} else {
						updateDataStruct.setIN_PLN_QTY(tempDataStruct.getIN_PLN_QTY());
					}
				} else {
					//整数管理品目ではない場合
					updateDataStruct.setIN_PLN_QTY(tempDataStruct.getIN_PLN_QTY());
				}
				
				updateDataStruct.setIN_PLN_TERM_TYP(tempDataStruct.getIN_PLN_TERM_TYP());
				updateDataStruct.setIN_PLN_STR_DATE(tempDataStruct.getIN_PLN_STR_DATE());
				updateDataStruct.setIN_PLN_END_DATE(tempDataStruct.getIN_PLN_END_DATE());
				
				updateDataStruct.setCOMPANY_CD(this._companyCD);
				updateDataStruct.setCUST_CD(tempDataStruct.getCUST_CD());
				updateDataStruct.setCUST_ITEM_CD(tempDataStruct.getCUST_ITEM_CD());
				updateDataStruct.setDLV_LOC_CD(tempDataStruct.getDLV_LOC_CD());
				
				//計画終了日のセット
				//計画期間タイプが「１」（日）の場合
				if ("1".equals(tempDataStruct.getIN_PLN_TERM_TYP())) {
					updateDataStruct.setIN_PLN_END_DATE(tempDataStruct.getIN_PLN_STR_DATE());
				//計画期間タイプが「２」（週・旬等）の場合
				} else if ("2".equals(tempDataStruct.getIN_PLN_TERM_TYP())){
					updateDataStruct.setIN_PLN_END_DATE(tempDataStruct.getIN_PLN_END_DATE());
				//計画期間タイプが「３」（月）の場合
				} else {
					try {
						Calendar cal = Calendar.getInstance();
						Date tempDate = new Date();
					
						tempDate = Converter.strToDate(tempDataStruct.getIN_PLN_STR_DATE() ,"yyyy/MM/dd");
					
						cal.setTime(tempDate);
					
						cal.set(cal.DAY_OF_MONTH, cal.getActualMaximum(cal.DAY_OF_MONTH));
						tempDate = cal.getTime();
					
						updateDataStruct.setIN_PLN_END_DATE(Converter.dateToStr(tempDate ,"yyyy/MM/dd"));
					} catch(Exception e) {
						e.printStackTrace();
						setErrorMessage("KP00006");
						return;
					}
				}
				
				//計画期間のセット
				int termDays = 1;
				String tempDay = new String(updateDataStruct.getIN_PLN_STR_DATE());
				if ((DateTool.compareYMD(updateDataStruct.getIN_PLN_END_DATE(), tempDay)) < 0){
					setErrorMessage("KP00002");
					return;
				}
				//計画期間を計算
				while(DateTool.compareYMD(updateDataStruct.getIN_PLN_END_DATE(), tempDay) != 0){
					tempDay = DateTool.addDay(tempDay, "1");
					termDays++;
					//１０００日を越える計画は立てられない。
					if (termDays >= 1000) {
						setErrorMessage("KP00007");
						return;
					}
				}
				
				updateDataStruct.setTERM_DAYS(String.valueOf(termDays));
					
				//DBに登録された計画期間と入力した計画期間を比較する。
				if(checkPlnTermFromDB(updateDataStruct)){
					return;
				}
				
				//生産計画登録フラグの値のセット
				//品目手配区分のチェック
				
				boolean mprOdrTypFlg = false;
				
				if(tempDataStruct.getMRP_ODR_TYP().equals("4")||tempDataStruct.getMRP_ODR_TYP().equals("5")||tempDataStruct.getMRP_ODR_TYP().equals("6")||tempDataStruct.getMRP_ODR_TYP().equals("7")){
					mprOdrTypFlg = true;
				}
				
				if (tempDataStruct.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == true) {
					//生産計画登録フラグのセット
					updateDataStruct.setADD_TO_OD_FLG("1");
					tempDataStruct.setchkADD_TO_OD("true");
				}else if (tempDataStruct.getchkADD_TO_OD().equals("true") && mprOdrTypFlg == false){
					//生産計画登録フラグのセット
					updateDataStruct.setADD_TO_OD_FLG("0");
					tempDataStruct.setchkADD_TO_OD("NULL");
					setWarningMessage("KP00010");
					setWarningParameter("M_ITEM", "ITEM_CD", tempDataStruct.getITEM_CD());
				} else {
					//生産計画登録フラグのセット
					updateDataStruct.setADD_TO_OD_FLG("0");
					tempDataStruct.setchkADD_TO_OD("NULL");
				}
				
				//更新カウンタチェック
				List chkList = entity.mselectMODIFY_COUNT.read(conn, updateDataStruct);
				KP0020010Struct wStruct = (KP0020010Struct) chkList.get(0);
				
				if(!tempDataStruct.getMODIFY_COUNT().equals(wStruct.getD_MODIFY_COUNT())) {
					//更新カウンタが変化した
					ExpjMessage emsg = new ExpjMessage("KQ00055");
					msgStruct.addError(emsg);
					sysLog.warning("KQ00055", getsysUSER_CD());
					emsg = new ExpjMessage("ZZ01006","IN_SALES_PLAN_CD:" + updateDataStruct.getIN_SALES_PLAN_CD());
					sysLog.warning(emsg, getsysUSER_CD());
					setReadStatus(ERROR);
					return;
				}
				
				int nRet = entity.minsrtT_SALES_PLAN.update(conn, updateDataStruct);
				setInformationMessage("KP00009");
				
			} catch (SQLException e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} catch(Exception e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} finally {
				if(rollbackFlg == false) {
					conn.commit();
				} else {
					conn.rollback();
				}
			}
		}
		
		/**
		 * 削除処理を行う
		 * @param deleteDataStruct 削除用データを登録するStruct
		 * @param tempDataStruct データの取得元のStruct
		 */
		public void setDeleteData(KP0020010Struct deleteDataStruct, KP0020010Struct tempDataStruct) throws BusinessProcessException, FoundationException {
			//ロールバック判定フラグ
			boolean rollbackFlg = false;
			try {
				deleteDataStruct.setIN_SALES_PLAN_CD(tempDataStruct.getIN_SALES_PLAN_CD());
				
				//更新カウンタチェック
				List chkList = entity.mselectMODIFY_COUNT.read(conn, deleteDataStruct);
				KP0020010Struct wStruct = (KP0020010Struct) chkList.get(0);
				
				if(!tempDataStruct.getMODIFY_COUNT().equals(wStruct.getD_MODIFY_COUNT())) {
					//更新カウンタが変化した
					ExpjMessage emsg = new ExpjMessage("KQ00055");
					msgStruct.addError( emsg );
					sysLog.warning("KQ00055", getsysUSER_CD());
					emsg = new ExpjMessage("ZZ01006","IN_SALES_PLAN_CD:" + deleteDataStruct.getIN_SALES_PLAN_CD());
					sysLog.warning(emsg, getsysUSER_CD());
					setReadStatus(ERROR);
					return;
				}
				
				int nRet = entity.mdeleteT_SALES_PLAN.update(conn, deleteDataStruct);
				setInformationMessage("KP00009");
				
			} catch (SQLException e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} catch(Exception e) {
				e.printStackTrace();
				rollbackFlg = true;
				setErrorMessage("KP00004");
			} finally {
				if(rollbackFlg == false) {
					conn.commit();
				} else {
					conn.rollback();
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			setListData(struct);
			
		} catch(Exception e) {
			// エラー処理を記述してください。
			e.printStackTrace();
			setErrorMessage("KP00008");
			setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", struct.getIN_SALES_PLAN_CD());
			return;
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ユーザ定義のコードを記述してください
				
			String tempIN_SALES_PLAN_CD = new String(struct.getIN_SALES_PLAN_CD());
				
		try {
			//ユーザをセット
			_updateStruct.setsUser_ID(struct.getsUser_ID());
			setUpdateData(_updateStruct, struct);
			
			initializeAll();
			struct.setIN_SALES_PLAN_CD(tempIN_SALES_PLAN_CD);
			controlSelect();
			
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setErrorMessage("KP00004");
			setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", _updateStruct.getIN_SALES_PLAN_CD());
			return;
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ユーザ定義のコードを記述してください
			
			String tempIN_SALES_PLAN_CD = new String(struct.getIN_SALES_PLAN_CD());
			
		try {
			
			_deleteStruct.setsUser_ID(struct.getsUser_ID());
			setDeleteData(_deleteStruct, struct);
			
			initializeAll();
			struct.setIN_SALES_PLAN_CD(tempIN_SALES_PLAN_CD);
			
		} catch(Exception e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			setErrorMessage("KP00004");
			setErrorParameter("T_SALES_PLAN", "SALES_PLAN_CD", _deleteStruct.getIN_SALES_PLAN_CD());
			return;
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
				initializeAll();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
			initializeAll();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			//コンボボックスにデータに登録するデータを取得して_plnTermTypStructに格納
			ComboBox cb = new ComboBox(conn, sysUSER_CD);
			_plnTermTypStruct = cb.getData("PLN_TERM_TYP");
			cb.setConnection(null);
			initializeAll();
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
				struct.setIN_SALES_PLAN_CD(getIN_SALES_PLAN_CD());
				controlSelect();
			}
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KP0020");
		logger.entering("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KP0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Delete") ) {
				controlDelete();
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
//			throw new FoundationException("KP0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0020010-E999","CSVの出力処理"));
			throw new FoundationException("KP0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0020010-E999","システム日付の取得処理"));
				throw new FoundationException("KP0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KP0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("KP0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KP0020010Entity entity;
	protected KP0020010Struct struct;
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

		entity = new KP0020010Entity();
		struct = new KP0020010Struct();

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
	 * KP0020010クラスの標準コンストラクタ
	 */
	public KP0020010Control() throws BusinessProcessException, FoundationException
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
				KP0020010Struct key = (KP0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("chkADD_TO_OD") && key.getchkADD_TO_OD() != null) {
					msgKey.setKeyValue("chkADD_TO_OD", key.getchkADD_TO_OD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name") && key.getIN_PLN_TERM_TYP_name() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_name", key.getIN_PLN_TERM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val") && key.getIN_PLN_TERM_TYP_val() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP_val", key.getIN_PLN_TERM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("TERM_DAYS") && key.getTERM_DAYS() != null) {
					msgKey.setKeyValue("TERM_DAYS", key.getTERM_DAYS());
				}
				if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG") && key.getADD_TO_OD_FLG() != null) {
					msgKey.setKeyValue("ADD_TO_OD_FLG", key.getADD_TO_OD_FLG());
				}
				if(msgKeyType.containsKeyColumn("D_SALES_PLAN_CD") && key.getD_SALES_PLAN_CD() != null) {
					msgKey.setKeyValue("D_SALES_PLAN_CD", key.getD_SALES_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("D_MODIFY_COUNT") && key.getD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("D_MODIFY_COUNT", key.getD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE") && key.getIN_PLN_STR_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_STR_DATE", key.getIN_PLN_STR_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE") && key.getIN_PLN_END_DATE() != null) {
					msgKey.setKeyValue("IN_PLN_END_DATE", key.getIN_PLN_END_DATE());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP") && key.getIN_PLN_TERM_TYP() != null) {
					msgKey.setKeyValue("IN_PLN_TERM_TYP", key.getIN_PLN_TERM_TYP());
				}
				if(msgKeyType.containsKeyColumn("IN_PLN_QTY") && key.getIN_PLN_QTY() != null) {
					msgKey.setKeyValue("IN_PLN_QTY", key.getIN_PLN_QTY());
				}
				if(msgKeyType.containsKeyColumn("PLN_CD") && key.getPLN_CD() != null) {
					msgKey.setKeyValue("PLN_CD", key.getPLN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("IN_SALES_PLAN_CD") && key.getIN_SALES_PLAN_CD() != null) {
					msgKey.setKeyValue("IN_SALES_PLAN_CD", key.getIN_SALES_PLAN_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
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
					KP0020010Struct key = new KP0020010Struct();
					if(msgKeyType.containsKeyColumn("chkADD_TO_OD")) {
						key.setchkADD_TO_OD(msgKey.getKeyValue("chkADD_TO_OD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_name")) {
						key.setIN_PLN_TERM_TYP_name(msgKey.getKeyValue("IN_PLN_TERM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP_val")) {
						key.setIN_PLN_TERM_TYP_val(msgKey.getKeyValue("IN_PLN_TERM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("TERM_DAYS")) {
						key.setTERM_DAYS(msgKey.getKeyValue("TERM_DAYS"));
					}
					if(msgKeyType.containsKeyColumn("ADD_TO_OD_FLG")) {
						key.setADD_TO_OD_FLG(msgKey.getKeyValue("ADD_TO_OD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("D_SALES_PLAN_CD")) {
						key.setD_SALES_PLAN_CD(msgKey.getKeyValue("D_SALES_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("D_MODIFY_COUNT")) {
						key.setD_MODIFY_COUNT(msgKey.getKeyValue("D_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_STR_DATE")) {
						key.setIN_PLN_STR_DATE(msgKey.getKeyValue("IN_PLN_STR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_END_DATE")) {
						key.setIN_PLN_END_DATE(msgKey.getKeyValue("IN_PLN_END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_TERM_TYP")) {
						key.setIN_PLN_TERM_TYP(msgKey.getKeyValue("IN_PLN_TERM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("IN_PLN_QTY")) {
						key.setIN_PLN_QTY(msgKey.getKeyValue("IN_PLN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PLN_CD")) {
						key.setPLN_CD(msgKey.getKeyValue("PLN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("IN_SALES_PLAN_CD")) {
						key.setIN_SALES_PLAN_CD(msgKey.getKeyValue("IN_SALES_PLAN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
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
