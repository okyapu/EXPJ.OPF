/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AL0020/src/com/nec/jp/orteus/metamorBase/AL0020/AL0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AL0020;

import com.nec.jp.orteus.metamorBase.AL0020.*;
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
//}}user_implement_code_header

public class AL0020010Control
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
           protected List list;                                            // 一覧部分の結果リストを画面に表示するためのリストインスタンス
       
           // デフォルトアクセサメソッド
           public List getList() { return this.list; }                     // リストを返します。
           public void setList(List listname) { this.list = listname; }    // リストをセットします。
           public int getListsize() {                                      // リスト型のサイズを返します。
               int nret = 0;
               if( this.list != null ) {nret = this.list.size();}
               return nret;
           }
       //  public Object getListvalue(int x) { return this.list.get(x); }  // リストの値を返します。
           public AL0020010Struct getListvalue(int x) { return (AL0020010Struct)(this.list.get(x)); }  // リストの値を返します。
           public AL0020010Struct getStruct() { return this.struct; }  // Structを返します。
           public AL0020010Struct createStruct() { return new AL0020010Struct(); } // 新しいStructを作って返します。
           public void setStruct(Object structname) { this.struct.setStruct((AL0020010Struct)structname); }    // Structをセットします。
           public void initializeStruct() { this.struct.initialize(); }    // Structの値を初期化します。
       
           // CSV出力用リスト
           private CsvWriter csvWriter = null;
           public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
           private CsvReader csvReader = null;
           public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
           /**
            * Structの値をクリアします。
            */
           private void clearStruct()
           {
               struct.initialize();
       
               struct.seth_PLANT_CD(getsysPLANT_CD());
       
               if (list != null) {
                   list.clear();
               }
           }
       
           /**
            * Structの値をコピーします。
            */
           private void copyStruct(AL0020010Struct toStruct, AL0020010Struct fromStruct)
           {
               toStruct.setITEM_CD(fromStruct.getITEM_CD());
               toStruct.setITEM_NAME(fromStruct.getITEM_NAME());
               toStruct.setNECK_PROC_CD(fromStruct.getNECK_PROC_CD());
               toStruct.setPROC_START_IDLE_DATE(fromStruct.getPROC_START_IDLE_DATE());
               toStruct.setUNIT_LOAD(fromStruct.getUNIT_LOAD());
               toStruct.setNECK_PROC_LT(fromStruct.getNECK_PROC_LT());
               toStruct.setLOAD_ASSIGN_TYP(fromStruct.getLOAD_ASSIGN_TYP());
               toStruct.setNECK_PROC_NAME(fromStruct.getNECK_PROC_NAME());
               toStruct.setdet_NECK_PROC_CAPA(fromStruct.getdet_NECK_PROC_CAPA());
               toStruct.setdet_NECK_PROC_CAPA_UNIT(fromStruct.getdet_NECK_PROC_CAPA_UNIT());
               toStruct.setdet_MRP_ODR_TYP(fromStruct.getdet_MRP_ODR_TYP());
               toStruct.setdet_OUTSIDE_TYP(fromStruct.getdet_OUTSIDE_TYP());
               toStruct.setdet_ODR_LT(fromStruct.getdet_ODR_LT());
               toStruct.setdet_FIXED_LT(fromStruct.getdet_FIXED_LT());
               toStruct.setdet_SAFETY_LT(fromStruct.getdet_SAFETY_LT());
               toStruct.setdet_ISSUE_LT(fromStruct.getdet_ISSUE_LT());
               toStruct.setPROC_CD(fromStruct.getPROC_CD());
               toStruct.setPROC_NAME(fromStruct.getPROC_NAME());
               toStruct.setWS_CD(fromStruct.getWS_CD());
               toStruct.seth_MODIFY_COUNT(fromStruct.geth_MODIFY_COUNT());
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
              
                      String tableAndKeys = null;
              
                     try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // 読込状態（初期状態）を設定
                          setReadStatus(INITIAL);
              
                          // 読込キーを残して、Structをクリア
                          String itemCd = struct.getITEM_CD();
                          String neckProcCd = struct.getNECK_PROC_CD();
                          clearStruct();
                          struct.setITEM_CD(itemCd);
                          struct.setNECK_PROC_CD(neckProcCd);
              
                          // リスト検索
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          list = entity.mSelect.read(conn, struct);
                          //［画面条件(品目コード、制約工程コード)で］
                          if (list == null || list.isEmpty()) {
              
                              // 読込状態（０件読込）を設定
                              setReadStatus(NOT_FOUND);
              
                              // 制約工程マスタ、資源、品目にデータが存在しないとき
                              // 警告：対象データが存在しません。
                              ExpjMessage emsg = new ExpjMessage("ZZ06001");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
              
                              // 品目マスタに存在していれば表示する。
                              list = entity.mSelectItem.read(conn, struct);
                              if (list != null && list.size() > 0) {
                                  workStruct = (AL0020010Struct)list.get(0);
                                  struct.setITEM_NAME(workStruct.getITEM_NAME());
                                  struct.setdet_MRP_ODR_TYP(this.multcombo("MRP_ODR_TYP",workStruct.getdet_MRP_ODR_TYP()));
                                  struct.setdet_OUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",workStruct.getdet_OUTSIDE_TYP()));
                                  struct.setOUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",workStruct.getOUTSIDE_TYP()));
                                  struct.setdet_ODR_LT(workStruct.getdet_ODR_LT());
                                  struct.setdet_FIXED_LT(workStruct.getdet_FIXED_LT());
                                  struct.setdet_SAFETY_LT(workStruct.getdet_SAFETY_LT());
                                  struct.setdet_ISSUE_LT(workStruct.getdet_ISSUE_LT());
                              }
              
                              // 資源マスタに存在していれば表示する。
                              workList = entity.mSelectResource.read(conn, struct);
                              if (workList != null && workList.size() > 0) {
                                  workStruct = (AL0020010Struct)workList.get(0);
                                  struct.setNECK_PROC_NAME(workStruct.getNECK_PROC_NAME());
                                  struct.setdet_NECK_PROC_CAPA(workStruct.getdet_NECK_PROC_CAPA());
                                  struct.setdet_NECK_PROC_CAPA_UNIT(workStruct.getdet_NECK_PROC_CAPA_UNIT());
                              }
              
                              return;
                          }
                          
                          AL0020010Struct TempStruct = (AL0020010Struct)list.get(0);
                          TempStruct.setdet_MRP_ODR_TYP(this.multcombo("MRP_ODR_TYP",TempStruct.getdet_MRP_ODR_TYP()));
                          TempStruct.setdet_OUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",TempStruct.getdet_OUTSIDE_TYP()));
											for(int i = 0; i < list.size() ; i++ ) {
												  AL0020010Struct forOutSideTypStruct = (AL0020010Struct)list.get(i);
                          forOutSideTypStruct.setOUTSIDE_TYP(this.multcombo("OUTSIDE_TYP",forOutSideTypStruct.getOUTSIDE_TYP()));
                      }
              
                          // 品目番号、制約工程コードの退避
                          struct.seth_ITEM_CD(struct.getITEM_CD());
                          struct.seth_NECK_PROC_CD(struct.getNECK_PROC_CD());
              
                          // データを設定
                          copyStruct(struct, (AL0020010Struct)list.get(0));
              
                          // 読込状態（読込成功）を設定
                          setReadStatus(NORMAL);
              
                      } catch (SQLException se) {
                          // 読込状態（読込失敗）を設定
                          setReadStatus(ERROR);
                          // エラー：サーバでエラーが発生しました。
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006",tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // エラー：サーバでエラーが発生しました。
                              ExpjMessage emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ee = new ExpjException(e, emsg);
                              emsg = new ExpjMessage("ZZ01006", e.toString());
                              sysLog.severe(emsg, getsysUSER_CD());
                          }
                          throw ee;
                      }
              
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
              
                      String tableAndKeys = null;
              
                      try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // トランザクションを開始
                          conn.beginTransWeb();
              
                          // 「品目番号」+「制約工程コード」が、[制約工程]に既に存在するかをチェック
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mInsertM_NECK_WS.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
              
                          // 指定キーのデータが既に存在しているか調べる。
                          if (workStruct.getCNT().equals("0") == false) {
                              // 警告：すでに存在しているデータです。再試行してください。
                              ExpjMessage emsg = new ExpjMessage("AL20010");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // 品目マスタ存在チェック
                          tableAndKeys = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                          workList = entity.mCheckM_ITEM.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_ITEM_CD().equals("0") == true) {
                              // 品目マスタ存在せずエラー
                              struct.setITEM_NAME(null);
                              // 警告：品目番号がマスタに存在しません。
                              ExpjMessage emsg = new ExpjMessage("AL50004");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          // 資源存在チェック
                          tableAndKeys = "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckM_RESOURCE.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_NECK_PROC_CD().equals("0") == true) {
                              // 資源存在せずエラー
                              struct.setNECK_PROC_NAME(null);
                              // 警告：制約工程が存在しません。
                              ExpjMessage emsg = new ExpjMessage("AL20009");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          if (msgStruct.sizeError() > 0) {
                              // エラーがあれば終了
                              return;
                          }
              
                          // 制約工程を追加
                          int dummyRet = entity.mInsertM_NECK_WS.create(conn, struct);
              
                          // データを確定
                          conn.commit();
              
                          // 画面を再表示
                          controlSelect();
              
                      } catch (SQLException se) {
                          // エラー：サーバでエラーが発生しました。
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // エラー：サーバでエラーが発生しました。
                              ExpjMessage emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ee = new ExpjException(e, emsg);
                              emsg = new ExpjMessage("ZZ01006", e.toString());
                              sysLog.severe(emsg, getsysUSER_CD());
                          }
                          throw ee;
                      } finally {
                          if (conn != null) {
                              conn.rollback();
                          }
                      }
              
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
              
                      String tableAndKeys = null;
              
                      try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // トランザクションを開始
                          conn.beginTransWeb();
              
                          // データ更新可否チェック
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mUpdateM_NECK_WS.read(conn, struct);
                          // データがない場合
                          if (workList == null || workList.isEmpty()) {
                              // 警告：他の処理によりデータが書き換えられています。
                              //       メニューに戻ってやり直して下さい。
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          workStruct = (AL0020010Struct)workList.get(0);
                          // [制約工程]."更新数"≠セーブ更新数(hidden使用)の場合
                          if (workStruct.geth_MODIFY_COUNT().equals(struct.geth_MODIFY_COUNT()) == false) {
                              // 警告：他の処理によりデータが書き換えられています。
                              //       メニューに戻ってやり直して下さい。
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // 品目マスタ存在チェック
                          tableAndKeys = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
                          workList = entity.mCheckM_ITEM.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_ITEM_CD().equals("0") == true) {
                              // 警告：品目番号がマスタに存在しません。
                              ExpjMessage emsg = new ExpjMessage("AL50004");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          // 資源存在チェック
                          tableAndKeys = "M_RESOURCE.PLANT_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckM_RESOURCE.read(conn, struct);
                          workStruct = (AL0020010Struct)workList.get(0);
                          if (workStruct.getCNT_NECK_PROC_CD().equals("0") == true) {
                              // 警告：制約工程が存在しません。
                              ExpjMessage emsg = new ExpjMessage("AL20009");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          if (msgStruct.sizeError() > 0) {
                              // エラーがあれば終了
                              return;
                          }
              
                          // 制約工程を更新
                          int dummyRet = entity.mUpdateM_NECK_WS.update(conn, struct);
              
                          // データを確定
                          conn.commit();
              
                          // 画面を再表示
                          controlSelect();
              
                      } catch (SQLException se) {
                          // エラー：サーバでエラーが発生しました。
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // エラー：サーバでエラーが発生しました。
                              ExpjMessage emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ee = new ExpjException(e, emsg);
                              emsg = new ExpjMessage("ZZ01006", e.toString());
                              sysLog.severe(emsg, getsysUSER_CD());
                          }
                          throw ee;
                      } finally {
                          if (conn != null) {
                              conn.rollback();
                          }
                      }
              
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
              
                      String tableAndKeys = null;
              
                      try {
                          List workList = null;
                          AL0020010Struct workStruct = null;
              
                          // トランザクションを開始
                          conn.beginTransWeb();
              
                          // 制約工程有無チェック
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mUpdateM_NECK_WS.read(conn, struct);
                          if (workList == null || workList.isEmpty()) {
                              // 「制約工程コード」、「品目番号」が制約工程が存在しない
                              // 警告：他の処理によりデータが書き換えられています。
                              //       メニューに戻ってやり直して下さい。
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // データ更新可否チェック
                          workStruct = (AL0020010Struct)workList.get(0);
                          // [制約工程]."更新数"≠セーブ更新数(hidden使用)の場合
                          if (workStruct.geth_MODIFY_COUNT().equals(struct.geth_MODIFY_COUNT()) == false) {
                              // 警告：他の処理によりデータが書き換えられています。
                              //       メニューに戻ってやり直して下さい。
                              ExpjMessage emsg = new ExpjMessage("ZZ01105");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              return;
                          }
              
                          // 負荷明細有無チェック
                          tableAndKeys = "T_LOAD_DETAIL.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckT_LOAD_DETAIL.read(conn, struct);
                          if (workList != null && workList.size() > 0) {
                              // 負荷明細が存在する
                              // 警告：負荷明細にデータが存在するため削除できません。
                              ExpjMessage emsg = new ExpjMessage("AL10006");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          // シミュレーション負荷明細有無チェック
                          tableAndKeys = "T_SIM_LOAD_DETAIL.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          workList = entity.mCheckT_SIM_LOAD_DETAIL.read(conn, struct);
                          if (workList != null && workList.size() > 0) {
                              // シミュレーション負荷明細が存在する
                              // 警告：シミュレーション負荷明細にデータが存在するため削除できません。
                              ExpjMessage emsg = new ExpjMessage("AL10007");
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                              emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                              msgStruct.addError(emsg);
                              sysLog.warning(emsg, getsysUSER_CD());
                          }
              
                          if (msgStruct.sizeError() > 0) {
                              // エラーがあれば終了
                              return;
                          }
              
                          // 制約工程マスタの削除処理
                          tableAndKeys = "M_NECK_WS.PLANT_CD,ITEM_CD,NECK_PROC_CD:"
                                  + struct.geth_PLANT_CD() + "," + struct.getITEM_CD() + "," + struct.getNECK_PROC_CD();
                          int dummyRet = entity.mDeleteM_NECK_WS.delete(conn, struct);
              
                          // データを確定
                          conn.commit();
              
                          // 読込状態（初期状態）を設定
                          setReadStatus(INITIAL);
              
                          // 画面を初期化（Structをクリア）
                          clearStruct();
              
                      } catch (SQLException se) {
                          // エラー：サーバでエラーが発生しました。
                          ExpjMessage emsg = new ExpjMessage("ZZ01106");
                          sysLog.severe(emsg, getsysUSER_CD());
                          ExpjException ee = new ExpjException(se, emsg);
                          emsg = new ExpjMessage("ZZ01006", tableAndKeys);
                          sysLog.severe(emsg, getsysUSER_CD());
                          emsg = new ExpjMessage("ZZ01006", se.toString());
                          sysLog.severe(emsg, getsysUSER_CD());
                          throw ee;
                      } catch (Exception e) {
                          ExpjException ee = null;
                          if (e instanceof ExpjException) {
                              ee = (ExpjException)e;
                              sysLog.severe(ee.getExpjMessage(), getsysUSER_CD());
                          } else {
                              // エラー：サーバでエラーが発生しました。
                              ExpjMessage emsg = new ExpjMessage("ZZ01106");
                              sysLog.severe(emsg, getsysUSER_CD());
                              ee = new ExpjException(e, emsg);
                              emsg = new ExpjMessage("ZZ01006", e.toString());
                              sysLog.severe(emsg, getsysUSER_CD());
                          }
                          throw ee;
                      } finally {
                          if (conn != null) {
                              conn.rollback();
                          }
                      }
              
                //}}user_implement_dev:<controlDelete>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
              
                      // Structをクリア
                      clearStruct();
              
                      // 読込状態（初期状態）を設定
                      setReadStatus(INITIAL);
              
                //}}user_implement_dev:<controlClear>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                          // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                          // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                          // TODO: ユーザ定義のコードを記述してください
              /*          // データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
                      try{
              */
                          // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
                          if ( isScreenMove() == true ) {
                              // 検索のコントロールメソッドを呼び出します。
              //              controlSelect();
                          }
              
                          // Structをクリア
                          clearStruct();
              
                          // 読込状態（初期状態）を設定
                          setReadStatus(INITIAL);
              
              /*          // データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
                      } catch(SQLException e) {
              //          e.printStackTrace();
                          // エラー処理を記述してください。
                          //
                      }
              */
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AL0020");
		logger.entering("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
              
                      try {
                          // 負荷割付区分のコンボボックスデータを設定
                          ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                          ComboStruct LOAD_ASSIGN_TYP = comboController.getData("LOAD_ASSIGN_TYP");
                          struct.setList_LOAD_ASSIGN_TYP_val(LOAD_ASSIGN_TYP.getValList());
                          struct.setList_LOAD_ASSIGN_TYP_name(LOAD_ASSIGN_TYP.getExplanList());
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
		logger.exiting("AL0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                          // TODO: ユーザ定義のコードを記述してください
              //      ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
              //      } catch(AlarmMessageException ame){
              //          ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
              //          throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AL0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0020010-E999","CSVの出力処理"));
			throw new FoundationException("AL0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AL0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                          // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AL0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AL0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AL0020010Entity entity;
	protected AL0020010Struct struct;
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

		entity = new AL0020010Entity();
		struct = new AL0020010Struct();

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
	 * AL0020010クラスの標準コンストラクタ
	 */
	public AL0020010Control() throws BusinessProcessException, FoundationException
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
				AL0020010Struct key = (AL0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_name") && key.getLOAD_ASSIGN_TYP_name() != null) {
					msgKey.setKeyValue("LOAD_ASSIGN_TYP_name", key.getLOAD_ASSIGN_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_val") && key.getLOAD_ASSIGN_TYP_val() != null) {
					msgKey.setKeyValue("LOAD_ASSIGN_TYP_val", key.getLOAD_ASSIGN_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_NECK_PROC_CD") && key.geth_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("h_NECK_PROC_CD", key.geth_NECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_CD") && key.getNECK_PROC_CD() != null) {
					msgKey.setKeyValue("NECK_PROC_CD", key.getNECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_START_IDLE_DATE") && key.getPROC_START_IDLE_DATE() != null) {
					msgKey.setKeyValue("PROC_START_IDLE_DATE", key.getPROC_START_IDLE_DATE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_LOAD") && key.getUNIT_LOAD() != null) {
					msgKey.setKeyValue("UNIT_LOAD", key.getUNIT_LOAD());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_LT") && key.getNECK_PROC_LT() != null) {
					msgKey.setKeyValue("NECK_PROC_LT", key.getNECK_PROC_LT());
				}
				if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP") && key.getLOAD_ASSIGN_TYP() != null) {
					msgKey.setKeyValue("LOAD_ASSIGN_TYP", key.getLOAD_ASSIGN_TYP());
				}
				if(msgKeyType.containsKeyColumn("NECK_PROC_NAME") && key.getNECK_PROC_NAME() != null) {
					msgKey.setKeyValue("NECK_PROC_NAME", key.getNECK_PROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA") && key.getdet_NECK_PROC_CAPA() != null) {
					msgKey.setKeyValue("det_NECK_PROC_CAPA", key.getdet_NECK_PROC_CAPA());
				}
				if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA_UNIT") && key.getdet_NECK_PROC_CAPA_UNIT() != null) {
					msgKey.setKeyValue("det_NECK_PROC_CAPA_UNIT", key.getdet_NECK_PROC_CAPA_UNIT());
				}
				if(msgKeyType.containsKeyColumn("det_MRP_ODR_TYP") && key.getdet_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("det_MRP_ODR_TYP", key.getdet_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("det_OUTSIDE_TYP") && key.getdet_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("det_OUTSIDE_TYP", key.getdet_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("det_ODR_LT") && key.getdet_ODR_LT() != null) {
					msgKey.setKeyValue("det_ODR_LT", key.getdet_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("det_FIXED_LT") && key.getdet_FIXED_LT() != null) {
					msgKey.setKeyValue("det_FIXED_LT", key.getdet_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("det_SAFETY_LT") && key.getdet_SAFETY_LT() != null) {
					msgKey.setKeyValue("det_SAFETY_LT", key.getdet_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("det_ISSUE_LT") && key.getdet_ISSUE_LT() != null) {
					msgKey.setKeyValue("det_ISSUE_LT", key.getdet_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_PLANT_CD") && key.geth_PLANT_CD() != null) {
					msgKey.setKeyValue("h_PLANT_CD", key.geth_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("CNT") && key.getCNT() != null) {
					msgKey.setKeyValue("CNT", key.getCNT());
				}
				if(msgKeyType.containsKeyColumn("CNT_ITEM_CD") && key.getCNT_ITEM_CD() != null) {
					msgKey.setKeyValue("CNT_ITEM_CD", key.getCNT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CNT_NECK_PROC_CD") && key.getCNT_NECK_PROC_CD() != null) {
					msgKey.setKeyValue("CNT_NECK_PROC_CD", key.getCNT_NECK_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("check_T_LOAD_CD") && key.getcheck_T_LOAD_CD() != null) {
					msgKey.setKeyValue("check_T_LOAD_CD", key.getcheck_T_LOAD_CD());
				}
				if(msgKeyType.containsKeyColumn("check_SIM_LOAD_CD") && key.getcheck_SIM_LOAD_CD() != null) {
					msgKey.setKeyValue("check_SIM_LOAD_CD", key.getcheck_SIM_LOAD_CD());
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
					AL0020010Struct key = new AL0020010Struct();
					if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_name")) {
						key.setLOAD_ASSIGN_TYP_name(msgKey.getKeyValue("LOAD_ASSIGN_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP_val")) {
						key.setLOAD_ASSIGN_TYP_val(msgKey.getKeyValue("LOAD_ASSIGN_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_NECK_PROC_CD")) {
						key.seth_NECK_PROC_CD(msgKey.getKeyValue("h_NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_CD")) {
						key.setNECK_PROC_CD(msgKey.getKeyValue("NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_START_IDLE_DATE")) {
						key.setPROC_START_IDLE_DATE(msgKey.getKeyValue("PROC_START_IDLE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_LOAD")) {
						key.setUNIT_LOAD(msgKey.getKeyValue("UNIT_LOAD"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_LT")) {
						key.setNECK_PROC_LT(msgKey.getKeyValue("NECK_PROC_LT"));
					}
					if(msgKeyType.containsKeyColumn("LOAD_ASSIGN_TYP")) {
						key.setLOAD_ASSIGN_TYP(msgKey.getKeyValue("LOAD_ASSIGN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NECK_PROC_NAME")) {
						key.setNECK_PROC_NAME(msgKey.getKeyValue("NECK_PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA")) {
						key.setdet_NECK_PROC_CAPA(msgKey.getKeyValue("det_NECK_PROC_CAPA"));
					}
					if(msgKeyType.containsKeyColumn("det_NECK_PROC_CAPA_UNIT")) {
						key.setdet_NECK_PROC_CAPA_UNIT(msgKey.getKeyValue("det_NECK_PROC_CAPA_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("det_MRP_ODR_TYP")) {
						key.setdet_MRP_ODR_TYP(msgKey.getKeyValue("det_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("det_OUTSIDE_TYP")) {
						key.setdet_OUTSIDE_TYP(msgKey.getKeyValue("det_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("det_ODR_LT")) {
						key.setdet_ODR_LT(msgKey.getKeyValue("det_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("det_FIXED_LT")) {
						key.setdet_FIXED_LT(msgKey.getKeyValue("det_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("det_SAFETY_LT")) {
						key.setdet_SAFETY_LT(msgKey.getKeyValue("det_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("det_ISSUE_LT")) {
						key.setdet_ISSUE_LT(msgKey.getKeyValue("det_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_PLANT_CD")) {
						key.seth_PLANT_CD(msgKey.getKeyValue("h_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CNT")) {
						key.setCNT(msgKey.getKeyValue("CNT"));
					}
					if(msgKeyType.containsKeyColumn("CNT_ITEM_CD")) {
						key.setCNT_ITEM_CD(msgKey.getKeyValue("CNT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CNT_NECK_PROC_CD")) {
						key.setCNT_NECK_PROC_CD(msgKey.getKeyValue("CNT_NECK_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("check_T_LOAD_CD")) {
						key.setcheck_T_LOAD_CD(msgKey.getKeyValue("check_T_LOAD_CD"));
					}
					if(msgKeyType.containsKeyColumn("check_SIM_LOAD_CD")) {
						key.setcheck_SIM_LOAD_CD(msgKey.getKeyValue("check_SIM_LOAD_CD"));
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
