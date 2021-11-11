/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0130/src/com/nec/jp/orteus/metamorBase/AE0130/AE0130010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0130;

import com.nec.jp.orteus.metamorBase.AE0130.*;
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
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;


	// TODO: ここにimportパッケージを記述してください
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0130010Control クラス
 * ファイル・クラス説明
 * @author $Author: zhou-kehong $
 * @version $Revision: 1.12 $ $Date: 2014/12/22 02:44:58 $
 *
 */
//}}user_implement_code_header

public class AE0130010Control
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
	private String lotctrl;
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
	public AE0130010Struct getListvalue(int x) { return (AE0130010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0130010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0130010Struct createStruct() { return new AE0130010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0130010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	/** [日付制御]情報 */
	private DateCtrlStruct _dateCtrlStruct = new DateCtrlStruct();
	/** CSVデータリスト */
	private List _csvList = null;


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
	 * 画面の全項目を初期化します。
	 */
	private void initializeAll() {
      struct.setPLANT_CD(sysPLANT_CD);

      struct.setPUCH_RTN_DATE_FROM(null);
      struct.setPUCH_RTN_DATE_TO(null);

      struct.setJOB_ODR_CD(null);
      
      struct.setVEND_CD(null);
      struct.setITEM_CD(null);
      struct.setPUCH_ODR_PERSON(null);
      struct.setPUCH_ODR_CD(null);
      struct.setWH_CD(null);

      struct.setr1_RTN_DEL_FLG("true");
      struct.setr2_RTN_DEL_FLG("false");
      struct.setr3_RTN_DEL_FLG("false");      

      initializeDetail();
	}
	/**
	 * 画面の詳細項目を初期化します。
	 */
	private void initializeDetail() {
      struct.setPLANT_NAME(null);
      struct.setVEND_NAME(null);
      struct.setITEM_NAME(null);
      struct.setWH_NAME(null);
      struct.setUSER_NAME(null);
      
      list = null;

      readStatus = INITIAL;
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

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
          //名称項目のクリア
          initializeDetail();

          // DBより[工場]."工場名"を検索し、存在しない場合はエラー
          if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")) {
            List plantList = entity.mselectM_PLANT.read(conn, struct);
            if (plantList.isEmpty()) {
              setErrorMessage("AE00027");
              setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
            } else {
              // 検索できた場合は「工場名」を設定する。
              AE0130010Struct plantStruct = (AE0130010Struct) plantList.get(0);
              struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
            }
          }
          
          // DBより[取引先]."取引先名"を検索し、存在しない場合はエラー
          if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
            List vendList = entity.mselectM_VEND_CTRL.read(conn, struct);
            if (vendList.isEmpty()) {
              setErrorMessage("AE20030");
              setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
            } else {
              // 検索できた場合は「取引先名」を設定する。
              AE0130010Struct vendStruct = (AE0130010Struct) vendList.get(0);
              struct.setVEND_NAME(vendStruct.getVEND_NAME());
            }
          }
          
          // DBより[品目]."品目名"を検索し、存在しない場合はエラー
          if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals("")) {
            List itemList = entity.mselectM_ITEM.read(conn, struct);
            if (itemList.isEmpty()) {
              setErrorMessage("AE00118");
              setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
            } else {
            // 検索できた場合は「取引先名」を設定する。
              AE0130010Struct itemStruct = (AE0130010Struct) itemList.get(0);
              struct.setITEM_NAME(itemStruct.getITEM_NAME());
            }
          }

          // DBより[ユーザマスタ]."ユーザ名"を検索し、存在しない場合はエラー
          if (struct.getPUCH_ODR_PERSON() != null && !struct.getPUCH_ODR_PERSON().equals("")) {
            List userList = entity.mselectUSER_MST.read(conn, struct);
            if (userList.isEmpty()) {
              setErrorMessage("AE00149");
              setErrorParameter("USER_MST", "PUCH_ODR_PERSON", struct.getPUCH_ODR_PERSON());
            } else {
            // 検索できた場合は「取引先名」を設定する。
              AE0130010Struct userStruct = (AE0130010Struct) userList.get(0);
              struct.setUSER_NAME(userStruct.getUSER_NAME());
            }
          }
          
          // DBより[購入返品実績]を検索し、存在しない場合はエラー
          if (struct.getPUCH_ODR_CD() != null && !struct.getPUCH_ODR_CD().equals("")) {
            boolean result = entity.mcheckT_PUCH_ODR_RTN_RSLT.check(conn, struct);
            if (result == false) {
              setErrorMessage("AE00150");
              setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
            } 
          }
          
          // DBより[保管区]."保管区名"を検索し、存在しない場合はエラー
          if (struct.getWH_CD() != null && !struct.getWH_CD().equals("")) {
            List whList = entity.mselectM_WH.read(conn, struct);
            if (whList.isEmpty()) {
              setErrorMessage("AE00111");
              setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
            } else {
            // 検索できた場合は「受入場所名」を設定する。
              AE0130010Struct whStruct = (AE0130010Struct) whList.get(0);
              struct.setWH_NAME(whStruct.getWH_NAME());
              //画面上で入力された工場コードと保管区コードから取得した工場コードに食い違いがあるときエラー
              if (struct.getPLANT_CD() != null && !struct.getPLANT_CD().equals("")) {
                if (struct.getPLANT_CD().equals(whStruct.getPLANT_CD()) == false ) {
                  setErrorMessage("AE00116");
                  setErrorParameter("M_WH", "WH_CD", struct.getWH_CD());
                }
              }
            }
          }

          //画面・返品取消区分から抽出条件を設定する
          if (struct.getr1_RTN_DEL_FLG().equals("true")) {
            struct.setRTN_DEL_FLG("0");
          }
          if (struct.getr2_RTN_DEL_FLG().equals("true")) {
            struct.setRTN_DEL_FLG("1");
          }
          if (struct.getr3_RTN_DEL_FLG().equals("true")) {
            struct.setRTN_DEL_FLG(null);
          }
        
          // エラーがあれば終了
          if (msgStruct.hasError()) {
            return;
          }
          
          //最大表示行数
          int maxLine = sp.getMaxLine(conn, 10);
			if (maxLine != 0){
				struct.setROW_COUNT(String.valueOf(maxLine));
			}else{
				struct.setROW_COUNT(null);
			}

			List viewList = entity.mSelectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0130010Struct) viewList.get(0))
					.getl_COUNT());

          //抽出件数が0件の場合はエラーとする
          if (rowCount==0) {
        	
            setErrorMessage("ZZ06001");
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PLANT_CD", struct.getPLANT_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_DATE_FROM", struct.getPUCH_RTN_DATE_FROM());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_RTN_DATE_TO", struct.getPUCH_RTN_DATE_TO());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "JOB_ODR_CD", struct.getJOB_ODR_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "VEND_CD", struct.getVEND_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "ITEM_CD", struct.getITEM_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_PERSON", struct.getPUCH_ODR_PERSON());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "WH_CD", struct.getWH_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
            setErrorParameter("T_PUCH_ODR_RTN_RSLT", "RTN_DEL_FLG", struct.getRTN_DEL_FLG());

            readStatus = NOT_FOUND;
            if(list !=null &&list.size()>0){
            	list.clear();
            }
            return;
          }
            // 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
          
            if ((maxLine != 0) && (rowCount == maxLine+1)) {
              setErrorMessage("ZZ01115", String.valueOf(maxLine));
              readStatus = TOO_MANY;
              if(list !=null &&list.size()>0){
              	list.clear();
              }
              return;
            }
            viewList = entity.mSelect.read(conn, struct);
            _csvList = viewList;
            // リストデータを設定
            setList(viewList);
	          AE0130010Struct TempStruct;
	          for (int i = 0; i < list.size(); i++) {
			     TempStruct = (AE0130010Struct)list.get(i);
			     TempStruct.setl_RTN_DEL_FLG_DN(multcombo("RTN_DEL_FLG",TempStruct.getl_RTN_DEL_FLG_DN()));
			     TempStruct.setl_INV_CTRL_FLG_DN(multcombo("INV_CTRL_FLG",TempStruct.getl_INV_CTRL_FLG_DN()));
			     TempStruct.setl_UNIT_COST_TYP_DN(multcombo("UNIT_COST_TYP",TempStruct.getl_UNIT_COST_TYP_DN()));
			     TempStruct.setl_TAX_ROUND_TYP_DN(multcombo("TAX_ROUND_TYP",TempStruct.getl_TAX_ROUND_TYP_DN()));
			    }
            readStatus = NORMAL;
            
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください

      List csvList = new ArrayList();
      String[] title = {
      	"Expj.PLANT_CD" ,
		"Expj.PUCH_ODR_CD_2" ,
		"Expj.VEND_CD" ,
		"Expj.VEND_NAME" ,
		"Expj.ITEM_CD" ,
		"Expj.ITEM_NAME" ,
		"Expj.STOCK_LOT_CD" ,
		"Expj.JOB_ODR_CD" ,
		"Expj.INV_CTRL_FLG" ,
		"Expj.PUCH_ODR_PERSON_2" ,
		"Expj.ISSUE_DATE_2" ,
		"Expj.ISSUE_QTY_3" ,
		"Expj.WH_CD_11" ,
		"Expj.WH_NAME_6" ,
		"Expj.VEND_LOT_NO" ,
		"Expj.Cmt1112" ,
		"Expj.Cmt1111" ,
		"Expj.PROCESSING_COST" ,
		"Expj.MATERIAL_COST" ,
		"Expj.OTHER_OVERHEADS" ,
		"Expj.PUCH_ODR_AMOUNT_3" ,
		"Expj.SAVING_AMOUNT" ,
		"Expj.NET_AMOUNT" ,
		"Expj.RETURNED_CAUSE_CD" ,
		"Expj.RATE_JUDGE_DATE" ,
		"Expj.EXCH_RATE" ,
		"Expj.TAX_RATE_1" ,
		"Expj.TAX_RATE_2" ,
		"Expj.TAX_RATE_3" ,
		"Expj.TAX_AMOUNT_1" ,
		"Expj.TAX_AMOUNT_2" ,
		"Expj.TAX_AMOUNT_3" ,
		"Expj.AMOUNT_INCLUDE_TAX" ,
		"Expj.HOME_CUR_AMOUNT" ,
		"Expj.TAX_CD_1" ,
		"Expj.TAX_ROUND_TYP" ,
		"Expj.RTN_DEL_FLG" ,
		"Expj.RTN_DEL_DATE" 
      };
      csvList.add(title);
      for (Iterator i = _csvList.iterator(); i.hasNext();) {
        AE0130010Struct csvStruct = (AE0130010Struct) i.next();
        if("false".equals(struct.geth_lotCtrl())){
        	csvStruct.setl_LOT_NO("");
        }
        String[] csvStr = new String[title.length];
        csvStr[0] = csvStruct.getl_PLANT_CD();
        csvStr[1] = csvStruct.getl_PUCH_ODR_CD();
        csvStr[2] = csvStruct.getl_VEND_CD();
        csvStr[3] = csvStruct.getl_VEND_ANAME();
        csvStr[4] = csvStruct.getl_ITEM_CD();
        csvStr[5] = csvStruct.getl_ITEM_NAME();
        csvStr[6] = csvStruct.getl_LOT_NO();
        csvStr[7] = csvStruct.getl_JOB_ODR_CD();
        csvStr[8] = csvStruct.getl_INV_CTRL_FLG_DN();
        csvStr[9] = csvStruct.getl_PUCH_ODR_PERSON();
        csvStr[10] = csvStruct.getl_PUCH_RTN_DATE();
        csvStr[11] = csvStruct.getl_PUCH_RTN_QTY();
        csvStr[12] = csvStruct.getl_WH_CD();
        csvStr[13] = csvStruct.getl_WH_NAME();
        csvStr[14] = csvStruct.getl_VEND_LOT_NO();
        csvStr[15] = csvStruct.getl_UNIT_COST_TYP_DN();
        csvStr[16] = csvStruct.getl_UNIT_COST();
        csvStr[17] = csvStruct.getl_PROCESSING_COST();
        csvStr[18] = csvStruct.getl_MATERIAL_COST();
        csvStr[19] = csvStruct.getl_OTHER_OVERHEADS();
        csvStr[20] = csvStruct.getl_PUCH_ODR_AMOUNT();
        csvStr[21] = csvStruct.getl_DISC_AMOUNT();
        csvStr[22] = csvStruct.getl_NET_AMOUNT();
        csvStr[23] = csvStruct.getl_PUCH_RTN_COMMENT();
        csvStr[24] = csvStruct.getl_RATE_JUDGE_DATE();
        csvStr[25] = csvStruct.getl_EXCH_RATE();
        csvStr[26] = csvStruct.getl_TAX_RATE_1();
        csvStr[27] = csvStruct.getl_TAX_RATE_2();
        csvStr[28] = csvStruct.getl_TAX_RATE_3();
        csvStr[29] = csvStruct.getl_TAX_AMOUNT_1();
        csvStr[30] = csvStruct.getl_TAX_AMOUNT_2();
        csvStr[31] = csvStruct.getl_TAX_AMOUNT_3();
        csvStr[32] = csvStruct.getl_AMOUNT_INCLUDE_TAX();
        csvStr[33] = csvStruct.getl_HOME_CUR_AMOUNT();
        csvStr[34] = csvStruct.getl_TAX_CD();
        csvStr[35] = csvStruct.getl_TAX_ROUND_TYP_DN();
        csvStr[36] = csvStruct.getl_RTN_DEL_FLG_DN();
        csvStr[37] = csvStruct.getl_RTN_DEL_DATE();

        csvList.add(csvStr);
      }
      if (csvList != null && !csvList.isEmpty()) {
        // CsvWriterを生成
        csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
        csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
        struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
      }
      
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください

		// 画面を初期化
		initializeAll();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
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
		// 画面を初期化
		initializeAll();
		try {
			if(LotCtrl.checkLotCtrl(conn)){
			    struct.seth_lotCtrl("true");
			    lotctrl = "true";
			}else{
				struct.seth_lotCtrl("false");
				lotctrl = "false";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0130");
		logger.entering("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AE0130010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
			struct.seth_lotCtrl(lotctrl);
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
//			throw new FoundationException("AE0130010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0130010-E999","CSVの出力処理"));
			throw new FoundationException("AE0130010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0130010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0130010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0130010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0130010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0130010Entity entity;
	protected AE0130010Struct struct;
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

		entity = new AE0130010Entity();
		struct = new AE0130010Struct();

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
	 * AE0130010クラスの標準コンストラクタ
	 */
	public AE0130010Control() throws BusinessProcessException, FoundationException
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
				AE0130010Struct key = (AE0130010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("r1_RTN_DEL_FLG") && key.getr1_RTN_DEL_FLG() != null) {
					msgKey.setKeyValue("r1_RTN_DEL_FLG", key.getr1_RTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("r2_RTN_DEL_FLG") && key.getr2_RTN_DEL_FLG() != null) {
					msgKey.setKeyValue("r2_RTN_DEL_FLG", key.getr2_RTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("r3_RTN_DEL_FLG") && key.getr3_RTN_DEL_FLG() != null) {
					msgKey.setKeyValue("r3_RTN_DEL_FLG", key.getr3_RTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_CD") && key.getl_VEND_CD() != null) {
					msgKey.setKeyValue("l_VEND_CD", key.getl_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_ANAME") && key.getl_VEND_ANAME() != null) {
					msgKey.setKeyValue("l_VEND_ANAME", key.getl_VEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_LOT_NO") && key.getl_LOT_NO() != null) {
					msgKey.setKeyValue("l_LOT_NO", key.getl_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_DN") && key.getl_INV_CTRL_FLG_DN() != null) {
					msgKey.setKeyValue("l_INV_CTRL_FLG_DN", key.getl_INV_CTRL_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON") && key.getl_PUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_PERSON", key.getl_PUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_DATE") && key.getl_PUCH_RTN_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_DATE", key.getl_PUCH_RTN_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_QTY") && key.getl_PUCH_RTN_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_QTY", key.getl_PUCH_RTN_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_VEND_LOT_NO") && key.getl_VEND_LOT_NO() != null) {
					msgKey.setKeyValue("l_VEND_LOT_NO", key.getl_VEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN") && key.getl_UNIT_COST_TYP_DN() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP_DN", key.getl_UNIT_COST_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
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
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT") && key.getl_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_AMOUNT", key.getl_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT") && key.getl_DISC_AMOUNT() != null) {
					msgKey.setKeyValue("l_DISC_AMOUNT", key.getl_DISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_NET_AMOUNT") && key.getl_NET_AMOUNT() != null) {
					msgKey.setKeyValue("l_NET_AMOUNT", key.getl_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_RTN_COMMENT") && key.getl_PUCH_RTN_COMMENT() != null) {
					msgKey.setKeyValue("l_PUCH_RTN_COMMENT", key.getl_PUCH_RTN_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_RATE_JUDGE_DATE") && key.getl_RATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("l_RATE_JUDGE_DATE", key.getl_RATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_EXCH_RATE") && key.getl_EXCH_RATE() != null) {
					msgKey.setKeyValue("l_EXCH_RATE", key.getl_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_RATE_1") && key.getl_TAX_RATE_1() != null) {
					msgKey.setKeyValue("l_TAX_RATE_1", key.getl_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_RATE_2") && key.getl_TAX_RATE_2() != null) {
					msgKey.setKeyValue("l_TAX_RATE_2", key.getl_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_RATE_3") && key.getl_TAX_RATE_3() != null) {
					msgKey.setKeyValue("l_TAX_RATE_3", key.getl_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1") && key.getl_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_1", key.getl_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2") && key.getl_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_2", key.getl_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3") && key.getl_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("l_TAX_AMOUNT_3", key.getl_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("l_AMOUNT_INCLUDE_TAX") && key.getl_AMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("l_AMOUNT_INCLUDE_TAX", key.getl_AMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("l_HOME_CUR_AMOUNT") && key.getl_HOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("l_HOME_CUR_AMOUNT", key.getl_HOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_CD") && key.getl_TAX_CD() != null) {
					msgKey.setKeyValue("l_TAX_CD", key.getl_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("l_TAX_ROUND_TYP_DN") && key.getl_TAX_ROUND_TYP_DN() != null) {
					msgKey.setKeyValue("l_TAX_ROUND_TYP_DN", key.getl_TAX_ROUND_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_RTN_DEL_FLG_DN") && key.getl_RTN_DEL_FLG_DN() != null) {
					msgKey.setKeyValue("l_RTN_DEL_FLG_DN", key.getl_RTN_DEL_FLG_DN());
				}
				if(msgKeyType.containsKeyColumn("l_RTN_DEL_DATE") && key.getl_RTN_DEL_DATE() != null) {
					msgKey.setKeyValue("l_RTN_DEL_DATE", key.getl_RTN_DEL_DATE());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_FROM") && key.getPUCH_RTN_DATE_FROM() != null) {
					msgKey.setKeyValue("PUCH_RTN_DATE_FROM", key.getPUCH_RTN_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_TO") && key.getPUCH_RTN_DATE_TO() != null) {
					msgKey.setKeyValue("PUCH_RTN_DATE_TO", key.getPUCH_RTN_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("RTN_DEL_FLG") && key.getRTN_DEL_FLG() != null) {
					msgKey.setKeyValue("RTN_DEL_FLG", key.getRTN_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
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
					AE0130010Struct key = new AE0130010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("r1_RTN_DEL_FLG")) {
						key.setr1_RTN_DEL_FLG(msgKey.getKeyValue("r1_RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r2_RTN_DEL_FLG")) {
						key.setr2_RTN_DEL_FLG(msgKey.getKeyValue("r2_RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("r3_RTN_DEL_FLG")) {
						key.setr3_RTN_DEL_FLG(msgKey.getKeyValue("r3_RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_CD")) {
						key.setl_VEND_CD(msgKey.getKeyValue("l_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_ANAME")) {
						key.setl_VEND_ANAME(msgKey.getKeyValue("l_VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_LOT_NO")) {
						key.setl_LOT_NO(msgKey.getKeyValue("l_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_INV_CTRL_FLG_DN")) {
						key.setl_INV_CTRL_FLG_DN(msgKey.getKeyValue("l_INV_CTRL_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON")) {
						key.setl_PUCH_ODR_PERSON(msgKey.getKeyValue("l_PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_DATE")) {
						key.setl_PUCH_RTN_DATE(msgKey.getKeyValue("l_PUCH_RTN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_QTY")) {
						key.setl_PUCH_RTN_QTY(msgKey.getKeyValue("l_PUCH_RTN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_VEND_LOT_NO")) {
						key.setl_VEND_LOT_NO(msgKey.getKeyValue("l_VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP_DN")) {
						key.setl_UNIT_COST_TYP_DN(msgKey.getKeyValue("l_UNIT_COST_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
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
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT")) {
						key.setl_PUCH_ODR_AMOUNT(msgKey.getKeyValue("l_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_DISC_AMOUNT")) {
						key.setl_DISC_AMOUNT(msgKey.getKeyValue("l_DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_NET_AMOUNT")) {
						key.setl_NET_AMOUNT(msgKey.getKeyValue("l_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_RTN_COMMENT")) {
						key.setl_PUCH_RTN_COMMENT(msgKey.getKeyValue("l_PUCH_RTN_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_RATE_JUDGE_DATE")) {
						key.setl_RATE_JUDGE_DATE(msgKey.getKeyValue("l_RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_EXCH_RATE")) {
						key.setl_EXCH_RATE(msgKey.getKeyValue("l_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_RATE_1")) {
						key.setl_TAX_RATE_1(msgKey.getKeyValue("l_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_RATE_2")) {
						key.setl_TAX_RATE_2(msgKey.getKeyValue("l_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_RATE_3")) {
						key.setl_TAX_RATE_3(msgKey.getKeyValue("l_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_1")) {
						key.setl_TAX_AMOUNT_1(msgKey.getKeyValue("l_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_2")) {
						key.setl_TAX_AMOUNT_2(msgKey.getKeyValue("l_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_AMOUNT_3")) {
						key.setl_TAX_AMOUNT_3(msgKey.getKeyValue("l_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("l_AMOUNT_INCLUDE_TAX")) {
						key.setl_AMOUNT_INCLUDE_TAX(msgKey.getKeyValue("l_AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("l_HOME_CUR_AMOUNT")) {
						key.setl_HOME_CUR_AMOUNT(msgKey.getKeyValue("l_HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_CD")) {
						key.setl_TAX_CD(msgKey.getKeyValue("l_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_TAX_ROUND_TYP_DN")) {
						key.setl_TAX_ROUND_TYP_DN(msgKey.getKeyValue("l_TAX_ROUND_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_RTN_DEL_FLG_DN")) {
						key.setl_RTN_DEL_FLG_DN(msgKey.getKeyValue("l_RTN_DEL_FLG_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_RTN_DEL_DATE")) {
						key.setl_RTN_DEL_DATE(msgKey.getKeyValue("l_RTN_DEL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_FROM")) {
						key.setPUCH_RTN_DATE_FROM(msgKey.getKeyValue("PUCH_RTN_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_DATE_TO")) {
						key.setPUCH_RTN_DATE_TO(msgKey.getKeyValue("PUCH_RTN_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("RTN_DEL_FLG")) {
						key.setRTN_DEL_FLG(msgKey.getKeyValue("RTN_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
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
