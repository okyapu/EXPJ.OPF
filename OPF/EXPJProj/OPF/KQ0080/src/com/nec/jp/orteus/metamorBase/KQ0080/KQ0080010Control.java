/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0080/src/com/nec/jp/orteus/metamorBase/KQ0080/KQ0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0080;

import com.nec.jp.orteus.metamorBase.KQ0080.*;
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
 * CLASS     : KQ0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.7 $ $Date: 2015/11/23 08:55:25 $
 *
 */
//}}user_implement_code_header

public class KQ0080010Control
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
	public KQ0080010Struct getListvalue(int x) { return (KQ0080010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KQ0080010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KQ0080010Struct createStruct() { return new KQ0080010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KQ0080010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
	
	public int getListsize(List _list) {
		int nret = 0;
		if( _list != null ) {nret = _list.size();}
		return nret;
	}
	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	// 製番明細行List
	protected List job_odrlist;											
	//	 結果リストのインスタンス
	public List getJob_odrlist() {
		return job_odrlist;
	}
	// リストをセットします。
	public void setJob_odrlist(List job_odrlist) {
		this.job_odrlist = job_odrlist;
	}
	// リスト型のサイズを返します。
	public int getJob_odrlistsize() {										
		int nret = 0;
		if( this.job_odrlist != null ) {nret = this.job_odrlist.size();}
		return nret;
	}
	// リストの値を返します。
	public KQ0080010Struct getJob_odrlistvalue(int x) { return (KQ0080010Struct)(this.job_odrlist.get(x)); }
	
	/** [コンボボックスデータ]情報（） */
	private ComboStruct _jobodrTypStruct = new ComboStruct();
	private ComboStruct _odrStatusStruct = new ComboStruct();
	
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
     * 画面を初期化します。
     * @throws ParseException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     */
    private void initializeScreen()
    {
        // 読込状態（初期状態）を設定
        setReadStatus(INITIAL);
        // structを初期化
        struct.initialize();
        if(list != null){
			list.clear();
		}
		if(job_odrlist != null){
			job_odrlist.clear();
		}
        struct.setw_PLANT_CD(sysPLANT_CD);
        struct.setPLANT_NAME(sysPLANT_NAME);
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			if(list != null){
				list.clear();
			}
			if(job_odrlist != null){
				job_odrlist.clear();
			}		
			// 「工場コード」が［工場］に存在のチェック
			List plantList = entity.mSelectM_PLANT.read(conn, struct);
			if(plantList.isEmpty() && struct.getw_PLANT_CD() !=null && !"".equals(struct.getw_PLANT_CD())){
				setErrorMessage("ZZ09028");
				struct.setPLANT_NAME("");
			}
			String plant_name = "";
			if(plantList != null && !plantList.isEmpty()){
				plant_name = ((KQ0080010Struct)plantList.get(0)).getPLANT_NAME();
			}
			struct.setPLANT_NAME(plant_name);
			// 「品目番号」が［品目］に存在のチェック
			List itemList = entity.mSelectM_ITEM.read(conn, struct);
			if(itemList.isEmpty()){
				setErrorMessage("AL50004");
				struct.setITEM_NAME("");			
			}
			String item_name = "";
			if(itemList != null && !itemList.isEmpty()){
				item_name = ((KQ0080010Struct)itemList.get(0)).getITEM_NAME();
			}
			struct.setITEM_NAME(item_name);
			if (msgStruct.hasError()) {
				return;
			}
		    //受注明細データの最大検索数のチェック
			int maxOdrLine = sp.getMaxLine(conn, 10);
			 if(maxOdrLine != 0) {
  				struct.setROW_COUNT(String.valueOf(maxOdrLine));
  			} else {
  				struct.setROW_COUNT(null);
  			}
			// 受注明細を抽出
			list = entity.mSelectT_ODRCnt.read(conn, struct);
			long rowCount = Long.parseLong(((KQ0080010Struct)list.get(0)).getl_COUNT());
			if((maxOdrLine != 0) && (rowCount ==maxOdrLine+1) && rowCount != 0){
				setErrorMessage("ZZ01115",String.valueOf(maxOdrLine));
				setReadStatus(TOO_MANY);
				if(list != null && list.size() > 0){
                	list.clear(); 
                 }
			}else{
				list = entity.mSelectT_ODR.read(conn, struct);
				for(int i=0;i<list.size();i++){
					String odr_statusTyp = ((KQ0080010Struct)list.get(i)).getl1_ODR_STATUS_TYP();
					((KQ0080010Struct)list.get(i)).setl1_ODR_STATUS_TYP(getComboData(_odrStatusStruct,odr_statusTyp));
				}
			}
			
			int maxJobOdrLine = sp.getMaxLine(conn,20);
			if(maxJobOdrLine != 0) {
	  			struct.setROW_COUNT(String.valueOf(maxJobOdrLine));
	  		} else {
	  			struct.setROW_COUNT(null);
	  		}
			 //製番明細データの最大検索数のチェック 
			if("0".equals(struct.geth_JOB_ODR_SET_FLG())){
				job_odrlist = entity.mSelectT_JOB_ODR1Cnt.read(conn, struct);
			}else{
				job_odrlist = entity.mSelectT_JOB_ODR2Cnt.read(conn, struct);
			}
			long rowCount1 = Long.parseLong(((KQ0080010Struct)job_odrlist.get(0)).getl_COUNT());
			
			if((rowCount == 0 && rowCount1 != 0) || (rowCount != 0 && rowCount1 == 0)){
				setWarningMessage("ZZ06001");
			}else{
				if(rowCount == 0 && rowCount1 == 0){
					setErrorMessage("ZZ06001");
					setReadStatus(NOT_FOUND);
					return ;
				}
			}

			if((maxJobOdrLine != 0) && (rowCount1==maxJobOdrLine+1) && rowCount1 != 0){
				setErrorMessage("ZZ01115",String.valueOf(maxJobOdrLine));
				setReadStatus(TOO_MANY);
				if(job_odrlist != null && job_odrlist.size() > 0){
					job_odrlist.clear();
				}
			}else{
				// 製番明細を抽出
				if("0".equals(struct.geth_JOB_ODR_SET_FLG())){
					job_odrlist = entity.mSelectT_JOB_ODR1.read(conn, struct);
				}else{
					job_odrlist = entity.mSelectT_JOB_ODR2.read(conn, struct);
				}
			}
			// [製番計画].“製番状態区分”を表示する
			for(int i=0;i<job_odrlist.size();i++){
				String job_odrTyp = ((KQ0080010Struct)job_odrlist.get(i)).getl2_JOB_ODR_STS_TYP();
				((KQ0080010Struct)job_odrlist.get(i)).setl2_JOB_ODR_STS_TYP(getComboData(_jobodrTypStruct,job_odrTyp));
			}
			setReadStatus(NORMAL);
		} catch (SQLException e) {
			e.printStackTrace();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// 致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成

			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // エクセプションの詳細情報
			setReadStatus(ERROR);
			throw ee;

		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			setReadStatus(ERROR);
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		initializeScreen();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 選択登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 行数
			int _tempLstCnt = 0;
			// 行数取得
			_tempLstCnt = getListsize(struct.getList_l1_ODR_NO());
			KQ0080010Struct _tempStruct = new KQ0080010Struct();
			KQ0080010Struct checkStruct = new KQ0080010Struct();
			
			// 受注数
			String odrQty = "0";  
			for (int i = 0; i < _tempLstCnt; i++) {
                 odrQty = Calculate.add(odrQty,(String)struct.getList_l1_ODR_QTY().get(i));
			}
			// 引当可能数
			String subtractQty = struct.getl2_ALCD_ENABLE_QTY();
			
			// チェック
			int chkFlg = Calculate.compare(odrQty,subtractQty);
			if (chkFlg ==1){
				this.setWarningMessage("KQ00328",struct.getl2_JOB_ODR_CD());
			}
	
			//　トランザクションスタート
			conn.beginTransWeb();
			for( int i = 0;i < _tempLstCnt; i++){
				_tempStruct.clear();
				_tempStruct.setl2_JOB_ODR_CD((String)struct.getList_l2_JOB_ODR_CD().get(0));
				_tempStruct.setl1_ODR_NO((String)struct.getList_l1_ODR_NO().get(i));
				_tempStruct.seth_COMPANY_CD(struct.geth_COMPANY_CD());
				_tempStruct.setl1_PLANT_CD((String)struct.getList_l1_PLANT_CD().get(i));
				_tempStruct.setl1_ODR_QTY((String)struct.getList_l1_ODR_QTY().get(i));
				_tempStruct.setsUser_ID(struct.getsUser_ID());
				_tempStruct.setsSysdate(struct.getsSysdate());
				// 更新数チェック
				_tempStruct.setSET_JOB_ODR_CD((String)struct.getList_l2_JOB_ODR_CD().get(0));
				List checkList = entity.mCheckDATA.read(conn, _tempStruct);
				if (checkList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return ;
				}
				String oldModifyCount = (String)struct.getList_l1_MODIFY_COUNT().get(i);
				List checkModifyCountList = entity.mCheckT_ODR.read(conn, _tempStruct);
				if (checkModifyCountList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return ;
				}else{
					checkStruct = (KQ0080010Struct)checkModifyCountList.get(0);
					if (!oldModifyCount.equals(checkStruct.getSEL_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return ;
					}
				}
				// [製番受注紐付]への追加
				entity.mT_JOB_ODR_ODR_ALC.create(conn, _tempStruct);
				// [受注明細]への更新
				_tempStruct.setJOB_ODR_SET_FLG("1");
				entity.mT_ODR.update(conn,_tempStruct);
			}
			conn.commit();
			_tempStruct = null;
			// 再読込
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// 致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // エクセプションの詳細情報
			setReadStatus(ERROR);
			throw ee;
		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			setReadStatus(ERROR);
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 選択削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 行数
			int _tempLstCnt = 0;
			_tempLstCnt = getListsize(struct.getList_l1_ODR_NO());
			KQ0080010Struct _tempStruct = new KQ0080010Struct();
			KQ0080010Struct checkStruct = new KQ0080010Struct();
			String oldModifyCount = null;
			// トランザクションスタート
			conn.beginTransWeb();
			for (int i = 0; i < _tempLstCnt; i++) {
				_tempStruct.setl1_ODR_NO((String)struct.getList_l1_ODR_NO().get(i));
				_tempStruct.setJOB_ODR_SET_FLG("0");
				_tempStruct.setsUser_ID(struct.getsUser_ID());
				_tempStruct.setsSysdate(struct.getsSysdate());
				// 更新数チェック
				oldModifyCount = (String) struct.getList_l1_MODIFY_COUNT().get(i);
				List checkList = entity.mCheckT_ODR.read(conn, _tempStruct);
				if (checkList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}else {
					checkStruct = (KQ0080010Struct)checkList.get(0);
					if (!oldModifyCount.equals(checkStruct.getSEL_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return;
					}
				}
				// [受注明細]への更新
				entity.mT_ODR.update(conn,_tempStruct);
				_tempStruct.setl1_JOB_ODR_CD((String)struct.getList_l1_JOB_ODR_CD().get(i));
				// [製番受注紐付] の削除
				entity.mT_JOB_ODR_ODR_ALC.delete(conn,_tempStruct);
			}
			conn.commit();
			_tempStruct.clear();
			// 再読込
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			// エラーメッセージ作成
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// 致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // エクセプションの詳細情報
			throw ee;

		} catch (Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * 行削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLineDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");
			//{{user_implement_dev:<controlLineDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// トランザクションスタート
			conn.beginTransWeb();
			KQ0080010Struct _tempStruct = new KQ0080010Struct();
			_tempStruct.setl2_JOB_ODR_CD((String)struct.getList_l2_JOB_ODR_CD().get(0));
			//  出荷指示済みの受注のチェック
			boolean blcheck = entity.mcheckT_ANS_DLV_DATE.check(conn,_tempStruct);
			if(blcheck == true){
				setErrorMessage("KQ00334");
				return ;
			}
			_tempStruct.setsUser_ID(struct.getsUser_ID());
			_tempStruct.setsSysdate(struct.getsSysdate());
			// 排他処理
			List selList = entity.mSELECT_T_ODR.read(conn, _tempStruct);
			if (!selList.isEmpty()) {
				// [受注明細]への更新
				entity.mUpdateT_ODR.update(conn,_tempStruct);
			}
			// [製番受注紐付] の削除
			entity.mDeleteT_JOB_ODR_ODR_ALC.delete(conn,_tempStruct);
			conn.commit();
			_tempStruct.clear();
			// 再読込
			controlSelect();
		} catch (SQLException e) {
			e.printStackTrace();
			// エラーメッセージ作成
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// 致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成

			emsg = new ExpjMessage("ZZ01006", e.toString());
			sysLog.severe(emsg, getsysUSER_CD()); // エクセプションの詳細情報
			throw ee;
		} catch (ResourceBusyException e) {
			e.printStackTrace();
			setErrorMessage("ZZ01105");
			setReadStatus(ERROR);
		} catch (Exception e) {
			e.printStackTrace();
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e, emsg);
			emsg = new ExpjMessage("ZZ01106", e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		} finally {
			if (conn != null) {
				try {
					conn.rollback();
				} catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe, emsg);
					emsg = new ExpjMessage("AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage("ZZ01106", fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
			}
		}
                //}}user_implement_dev:<controlLineDelete>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlLineDelete");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
        	initializeScreen();
        
			// コンボボックスデータを部品より取得
			
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0080");
		logger.entering("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			String SysMyCompany = SystemInformation.getSysMyCompanyCd();
			try{
			if(SysMyCompany==null||SysMyCompany.length()==0){
				throw new Exception();
			}
			}catch(Exception e){
				ExpjException ee = new ExpjException(e, "KQ00039");
				throw ee;
			}
			struct.seth_COMPANY_CD(SysMyCompany);
			// コンボボックス部品のデータのセットはここに記述してください。
			try {
				//  [製番計画].“製番状態区分”のコンボボックスデータを設定
				ComboBox cb = new ComboBox(conn, sysUSER_CD);
				_jobodrTypStruct = cb.getData("JOB_ODR_STS_TYP");
				_odrStatusStruct = cb.getData("ODR_STATUS_KBN");
			} catch (SQLException se) {
                // エラー：サーバでエラーが発生しました。
                ExpjMessage emsg = new ExpjMessage("ZZ01106");
                sysLog.severe(emsg, getsysUSER_CD());
                ExpjException ee = new ExpjException(se, emsg);
                emsg = new ExpjMessage("ZZ01006", se.toString());
                sysLog.severe(emsg, getsysUSER_CD());
                throw ee;
            }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("LineDelete") ) {
				controlLineDelete();
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
//			throw new FoundationException("KQ0080010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0080010-E999","CSVの出力処理"));
			throw new FoundationException("KQ0080010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0080010-E999","システム日付の取得処理"));
				throw new FoundationException("KQ0080010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0080010-E999","コントロールのイベント処理"));
			throw new FoundationException("KQ0080010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KQ0080010Entity entity;
	protected KQ0080010Struct struct;
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

		entity = new KQ0080010Entity();
		struct = new KQ0080010Struct();

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
	 * KQ0080010クラスの標準コンストラクタ
	 */
	public KQ0080010Control() throws BusinessProcessException, FoundationException
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
				KQ0080010Struct key = (KQ0080010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r2_JOB_ODR_SET_FLG") && key.getr2_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("r2_JOB_ODR_SET_FLG", key.getr2_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("r1_JOB_ODR_SET_FLG") && key.getr1_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("r1_JOB_ODR_SET_FLG", key.getr1_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP") && key.getc_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("c_JOB_ODR_STS_TYP", key.getc_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE") && key.geth_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("h_JOB_ODR_DLV_DATE", key.geth_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_ITEM_CD") && key.getw_ITEM_CD() != null) {
					msgKey.setKeyValue("w_ITEM_CD", key.getw_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l1_ODR_NO") && key.getl1_ODR_NO() != null) {
					msgKey.setKeyValue("l1_ODR_NO", key.getl1_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l1_CUST_NAME") && key.getl1_CUST_NAME() != null) {
					msgKey.setKeyValue("l1_CUST_NAME", key.getl1_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("l1_DLV_LOC_NAME") && key.getl1_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l1_DLV_LOC_NAME", key.getl1_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l1_DESINATED_DLV_DATE") && key.getl1_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l1_DESINATED_DLV_DATE", key.getl1_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l1_ODR_QTY") && key.getl1_ODR_QTY() != null) {
					msgKey.setKeyValue("l1_ODR_QTY", key.getl1_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l1_JOB_ODR_CD") && key.getl1_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l1_JOB_ODR_CD", key.getl1_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l1_PLANT_CD") && key.getl1_PLANT_CD() != null) {
					msgKey.setKeyValue("l1_PLANT_CD", key.getl1_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l1_ODR_STATUS_TYP") && key.getl1_ODR_STATUS_TYP() != null) {
					msgKey.setKeyValue("l1_ODR_STATUS_TYP", key.getl1_ODR_STATUS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l1_MODIFY_COUNT") && key.getl1_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l1_MODIFY_COUNT", key.getl1_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_CUST_CD") && key.getw_CUST_CD() != null) {
					msgKey.setKeyValue("w_CUST_CD", key.getw_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_FROM") && key.getw_DATE_FROM() != null) {
					msgKey.setKeyValue("w_DATE_FROM", key.getw_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_DATE_TO") && key.getw_DATE_TO() != null) {
					msgKey.setKeyValue("w_DATE_TO", key.getw_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("w_ODR_NO") && key.getw_ODR_NO() != null) {
					msgKey.setKeyValue("w_ODR_NO", key.getw_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_SET_FLG") && key.geth_JOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("h_JOB_ODR_SET_FLG", key.geth_JOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_CD") && key.getl2_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_CD", key.getl2_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_COMPANY_CD") && key.geth_COMPANY_CD() != null) {
					msgKey.setKeyValue("h_COMPANY_CD", key.geth_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG") && key.getJOB_ODR_SET_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_SET_FLG", key.getJOB_ODR_SET_FLG());
				}
				if(msgKeyType.containsKeyColumn("l2_PLANT_NAME") && key.getl2_PLANT_NAME() != null) {
					msgKey.setKeyValue("l2_PLANT_NAME", key.getl2_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_DLV_DATE") && key.getl2_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_DLV_DATE", key.getl2_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_QTY") && key.getl2_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_QTY", key.getl2_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l2_JOB_ODR_STS_TYP") && key.getl2_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l2_JOB_ODR_STS_TYP", key.getl2_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l2_PLANT_CD") && key.getl2_PLANT_CD() != null) {
					msgKey.setKeyValue("l2_PLANT_CD", key.getl2_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l2_ALCD_ENABLE_QTY") && key.getl2_ALCD_ENABLE_QTY() != null) {
					msgKey.setKeyValue("l2_ALCD_ENABLE_QTY", key.getl2_ALCD_ENABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l2_h_JOB_ODR_CD") && key.getl2_h_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l2_h_JOB_ODR_CD", key.getl2_h_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD") && key.getw_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("w_JOB_ODR_CD", key.getw_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("h_JOB_ODR_STS_TYP") && key.geth_JOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("h_JOB_ODR_STS_TYP", key.geth_JOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT") && key.getSEL_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SEL_MODIFY_COUNT", key.getSEL_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_JOB_ODR_CD") && key.getSEL_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SEL_JOB_ODR_CD", key.getSEL_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SET_JOB_ODR_CD") && key.getSET_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("SET_JOB_ODR_CD", key.getSET_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_ODR_NO") && key.getSEL_ODR_NO() != null) {
					msgKey.setKeyValue("SEL_ODR_NO", key.getSEL_ODR_NO());
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
					KQ0080010Struct key = new KQ0080010Struct();
					if(msgKeyType.containsKeyColumn("r2_JOB_ODR_SET_FLG")) {
						key.setr2_JOB_ODR_SET_FLG(msgKey.getKeyValue("r2_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r1_JOB_ODR_SET_FLG")) {
						key.setr1_JOB_ODR_SET_FLG(msgKey.getKeyValue("r1_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_STS_TYP")) {
						key.setc_JOB_ODR_STS_TYP(msgKey.getKeyValue("c_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_DLV_DATE")) {
						key.seth_JOB_ODR_DLV_DATE(msgKey.getKeyValue("h_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_ITEM_CD")) {
						key.setw_ITEM_CD(msgKey.getKeyValue("w_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l1_ODR_NO")) {
						key.setl1_ODR_NO(msgKey.getKeyValue("l1_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l1_CUST_NAME")) {
						key.setl1_CUST_NAME(msgKey.getKeyValue("l1_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l1_DLV_LOC_NAME")) {
						key.setl1_DLV_LOC_NAME(msgKey.getKeyValue("l1_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l1_DESINATED_DLV_DATE")) {
						key.setl1_DESINATED_DLV_DATE(msgKey.getKeyValue("l1_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l1_ODR_QTY")) {
						key.setl1_ODR_QTY(msgKey.getKeyValue("l1_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l1_JOB_ODR_CD")) {
						key.setl1_JOB_ODR_CD(msgKey.getKeyValue("l1_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l1_PLANT_CD")) {
						key.setl1_PLANT_CD(msgKey.getKeyValue("l1_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l1_ODR_STATUS_TYP")) {
						key.setl1_ODR_STATUS_TYP(msgKey.getKeyValue("l1_ODR_STATUS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l1_MODIFY_COUNT")) {
						key.setl1_MODIFY_COUNT(msgKey.getKeyValue("l1_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_CUST_CD")) {
						key.setw_CUST_CD(msgKey.getKeyValue("w_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_FROM")) {
						key.setw_DATE_FROM(msgKey.getKeyValue("w_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_DATE_TO")) {
						key.setw_DATE_TO(msgKey.getKeyValue("w_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("w_ODR_NO")) {
						key.setw_ODR_NO(msgKey.getKeyValue("w_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_SET_FLG")) {
						key.seth_JOB_ODR_SET_FLG(msgKey.getKeyValue("h_JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_CD")) {
						key.setl2_JOB_ODR_CD(msgKey.getKeyValue("l2_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_COMPANY_CD")) {
						key.seth_COMPANY_CD(msgKey.getKeyValue("h_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_SET_FLG")) {
						key.setJOB_ODR_SET_FLG(msgKey.getKeyValue("JOB_ODR_SET_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l2_PLANT_NAME")) {
						key.setl2_PLANT_NAME(msgKey.getKeyValue("l2_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_DLV_DATE")) {
						key.setl2_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l2_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_QTY")) {
						key.setl2_JOB_ODR_QTY(msgKey.getKeyValue("l2_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l2_JOB_ODR_STS_TYP")) {
						key.setl2_JOB_ODR_STS_TYP(msgKey.getKeyValue("l2_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l2_PLANT_CD")) {
						key.setl2_PLANT_CD(msgKey.getKeyValue("l2_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l2_ALCD_ENABLE_QTY")) {
						key.setl2_ALCD_ENABLE_QTY(msgKey.getKeyValue("l2_ALCD_ENABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l2_h_JOB_ODR_CD")) {
						key.setl2_h_JOB_ODR_CD(msgKey.getKeyValue("l2_h_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_JOB_ODR_CD")) {
						key.setw_JOB_ODR_CD(msgKey.getKeyValue("w_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_JOB_ODR_STS_TYP")) {
						key.seth_JOB_ODR_STS_TYP(msgKey.getKeyValue("h_JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT")) {
						key.setSEL_MODIFY_COUNT(msgKey.getKeyValue("SEL_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_JOB_ODR_CD")) {
						key.setSEL_JOB_ODR_CD(msgKey.getKeyValue("SEL_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SET_JOB_ODR_CD")) {
						key.setSET_JOB_ODR_CD(msgKey.getKeyValue("SET_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ODR_NO")) {
						key.setSEL_ODR_NO(msgKey.getKeyValue("SEL_ODR_NO"));
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
