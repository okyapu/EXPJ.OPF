/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0070/src/com/nec/jp/orteus/metamorBase/AE0070/AE0070010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0070;

import com.nec.jp.orteus.metamorBase.AE0070.*;
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
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0070010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.12 $ $Date: 2014/11/05 07:11:32 $
 *
 */
//}}user_implement_code_header

public class AE0070010Control
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
	public AE0070010Struct getListvalue(int x) { return (AE0070010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0070010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0070010Struct createStruct() { return new AE0070010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0070010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0070");
		logger.entering("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			
			readStatus = INITIAL;
			
			// 表示項目、一覧のクリア
			struct.setPLANT_NAME(null);
			struct.setVEND_NAME(null);
			struct.setITEM_NAME(null);
			struct.setUSER_NAME(null);
			if (list != null) {
				list.clear();
			}
			
			// 工場名を検索し、存在しない場合はエラー
			List plantList = entity.mM_PLANT.read(conn, struct);
			if (plantList.isEmpty()) {
				setErrorMessage("AE00027");
				setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
			} else {
				AE0070010Struct plantStruct = (AE0070010Struct) plantList.get(0);
				struct.setPLANT_NAME(plantStruct.getPLANT_NAME());
			}
			// 取引先名を検索し、存在しない場合はエラー
			if (struct.getVEND_CD() != null && !struct.getVEND_CD().equals("")) {
				List vandList = entity.mM_VEND_CTRL.read(conn, struct);
				if (vandList.isEmpty()) {
					setErrorMessage("AE20030");
					setErrorParameter("M_VEND", "VEND_CD", struct.getVEND_CD());
				} else {
					AE0070010Struct vendStruct = (AE0070010Struct) vandList.get(0);
					struct.setVEND_NAME(vendStruct.getVEND_NAME());
				}
			}
			
			// 発注番号を検索し、存在しない場合はエラー
			if (struct.getPUCH_ODR_CD() != null && "".equals(struct.getPUCH_ODR_CD()) == false) {
				List rlsdPuchOdrList = entity.mcheckT_RLSD_PUCH_ODR.read(conn, struct);
				if (rlsdPuchOdrList.isEmpty()) {
					setErrorMessage("AE00090");
					setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getPUCH_ODR_CD());
				}
			}
			
			// 品目名を検索し、存在しない場合はエラー
			if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals("")) {
				List itemList = entity.mM_ITEM.read(conn, struct);
				if (itemList.isEmpty()) {
					setErrorMessage("AE50509");
					setErrorParameter("M_ITEM", "ITEM_CD", struct.getITEM_CD());
				} else {
					AE0070010Struct itemStruct = (AE0070010Struct)itemList.get(0);
					struct.setITEM_NAME(itemStruct.getITEM_NAME());
				}
			}
			// 発注担当者名を検索し、存在しない場合はエラー
			if (struct.getPUCH_ODR_PERSON() != null && !struct.getPUCH_ODR_PERSON().equals("")) {
				List userList = entity.mUSER_MST.read(conn, struct);
				if (userList.isEmpty()) {
					setErrorMessage("AE00005");
					setErrorParameter("USER_MST", "USER_CD", struct.getPUCH_ODR_PERSON());
				} else {
					AE0070010Struct userStruct = (AE0070010Struct) userList.get(0);
					struct.setUSER_NAME(userStruct.getUSER_NAME());
				}
			}
			
			// エラーがあれば終了
			if (msgStruct.hasError()) {
				return;
			}
			
			// チェックボックスの値を設定
			if ("true".equals(struct.getReOutputFlg())) {
				struct.setODR_CANCEL_SLIP_ISS_FLG("2");
			} else {
				struct.setODR_CANCEL_SLIP_ISS_FLG("1");
			}
           //最大表示行数
            int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				struct.setROW_COUNT(null);
			}
			List viewList = entity.mSelectCnt.read(conn, struct);
			long rowCount = Long.parseLong(((AE0070010Struct)viewList.get(0)).getl_COUNT());  
          //	 対象件数=0件の場合エラー
			if (rowCount==0) {
				setErrorMessage("ZZ06001");
				readStatus = NOT_FOUND;
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}
			// 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
			if ((maxLine != 0) && (rowCount == maxLine + 1)) {
				setErrorMessage("ZZ01115", String.valueOf(maxLine));
				readStatus = TOO_MANY;
				if(list != null && list.size() > 0){
					list.clear();
				}
				return;
			}
			 viewList = entity.mSelect.read(conn, struct);
			// リストデータを設定
			setList(viewList);
			readStatus = NORMAL;
			
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0070");
		logger.entering("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AE0070010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			// TODO: ユーザ定義のコードを記述してください
						String printId1 = "";
				
			AE0070010Struct _temp_struct = new AE0070010Struct();
			_temp_struct.setStruct(struct);
				
		try {
			//上段の品目番号が指定されていない
			if(struct.getITEM_CD().equals("")){
				if("true".equals(struct.getReOutputFlg())){//発行済みのとき
					//製番とユーザコードがnullまたは%のとき
					if(struct.getJOB_ODR_CD().equals("") && struct.getPUCH_ODR_PERSON().equals(""))
					{	
						printId1 = "AE00700102";
					} 
					// 製番がnullまたは%でなくてユーザコードがnullまたは%のとき
	       			else if(!(struct.getJOB_ODR_CD().equals("")) && struct.getPUCH_ODR_PERSON().equals(""))
					{ 
						printId1 = "AE00700101";
					}
					// 製番がnullまたは%でユーザコードがnullまたは%でないとき
	       			else if(struct.getJOB_ODR_CD().equals("") && !(struct.getPUCH_ODR_PERSON().equals("")))
					{ 
						printId1 = "AE00700104";
					}
					// 製番とユーザコードがnullまたは%でない
	       			else if (!(struct.getJOB_ODR_CD().equals("")) && !(struct.getPUCH_ODR_PERSON().equals("")))
					{
						printId1 = "AE00700103";
					}
				}else{//未発行の場合
					//製番とユーザコードがnullまたは%のとき
					if(struct.getJOB_ODR_CD().equals("") && struct.getPUCH_ODR_PERSON().equals(""))
					{	
						printId1 = "AE00700106";
					} 
					// 製番がnullまたは%でなくてユーザコードがnullまたは%のとき
	       			else if(!(struct.getJOB_ODR_CD().equals("")) && struct.getPUCH_ODR_PERSON().equals(""))
					{ 
						printId1 = "AE00700105";
					}
					// 製番がnullまたは%でユーザコードがnullまたは%でないとき
	       			else if(struct.getJOB_ODR_CD().equals("") && !(struct.getPUCH_ODR_PERSON().equals("")))
					{ 
						printId1 = "AE00700108";
					}
					// 製番とユーザコードがnullまたは%でない
	       			else if (!(struct.getJOB_ODR_CD().equals("")) && !(struct.getPUCH_ODR_PERSON().equals("")))
					{
						printId1 = "AE00700107";
					}
				}
			}else{//上段の品目番号が指定されている
				if("true".equals(struct.getReOutputFlg())){//発行済みのとき
					//製番とユーザコードがnullまたは%のとき
					if(struct.getJOB_ODR_CD().equals("") && struct.getPUCH_ODR_PERSON().equals(""))
					{	
						printId1 = "AE00700110";
					} 
					// 製番がnullまたは%でなくてユーザコードがnullまたは%のとき
	       			else if(!(struct.getJOB_ODR_CD().equals("")) && struct.getPUCH_ODR_PERSON().equals(""))
					{ 
						printId1 = "AE00700109";
					}
					// 製番がnullまたは%でユーザコードがnullまたは%でないとき
	       			else if(struct.getJOB_ODR_CD().equals("") && !(struct.getPUCH_ODR_PERSON().equals("")))
					{ 
						printId1 = "AE00700112";
					}
					// 製番とユーザコードがnullまたは%でない
	       			else if (!(struct.getJOB_ODR_CD().equals("")) && !(struct.getPUCH_ODR_PERSON().equals("")))
					{
						printId1 = "AE00700111";
					}
				}else{//未発行の場合
					if(struct.getJOB_ODR_CD().equals("") && struct.getPUCH_ODR_PERSON().equals(""))
					{	
						printId1 = "AE00700114";
					} 
					// 製番がnullまたは%でなくてユーザコードがnullまたは%のとき
	       			else if(!(struct.getJOB_ODR_CD().equals("")) && struct.getPUCH_ODR_PERSON().equals(""))
					{ 
						printId1 = "AE00700113";
					}
					// 製番がnullまたは%でユーザコードがnullまたは%でないとき
	       			else if(struct.getJOB_ODR_CD().equals("") && !(struct.getPUCH_ODR_PERSON().equals("")))
					{ 
						printId1 = "AE00700116";
					}
					// 製番とユーザコードがnullまたは%でない
	       			else if (!(struct.getJOB_ODR_CD().equals("")) && !(struct.getPUCH_ODR_PERSON().equals("")))
					{
						printId1 = "AE00700115";
					}
				}
			}
				controlSelect();
			if (list == null || list.size() <= 0) {
				//データが存在しない
				return;
			}

			List printList = null;
			/*System.out.println("struct:" + struct);
			if ("true".equals(struct.getReOutputFlg()) == false) {
				printList = entity.mT_RLSD_PUCH_ODR_LOCK.read(conn, struct);
				System.out.println("printList:" + printList);
			}*/
			
			
			ret = svf.VrInit(printId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			queryFileName = svf.getQueryFileName();	// queryファイル名

			/* クエリーファイルの指定 */
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			
				
			/* クエリー抽出条件の指定 */
			ret = 0;
			List usr_lst = struct.getList_l_PUCH_ODR_CD();//明細の発注番号のリスト
			if(usr_lst != null) {//明細行を選択したとき
				for(int i=0; i<usr_lst.size(); i++) {
					struct.setl_PUCH_ODR_CD((String)usr_lst.get(i));
					if ("true".equals(struct.getReOutputFlg())) {
						_temp_struct.setODR_CANCEL_SLIP_ISS_DATE_FROM("0001/01/01");
						ret = svf.VrCondition("[X|ODR_CANCEL_SLIP_ISS_DATE_FROM]=" + _temp_struct.getODR_CANCEL_SLIP_ISS_DATE_FROM(), 4);
						_temp_struct.setODR_CANCEL_SLIP_ISS_DATE_TO("9999/12/31");
						ret = svf.VrCondition("[X|ODR_CANCEL_SLIP_ISS_DATE_TO]=" + _temp_struct.getODR_CANCEL_SLIP_ISS_DATE_TO(), 4);
					}
					ret = svf.VrCondition("[X|l_PUCH_ODR_CD]=" + struct.getl_PUCH_ODR_CD(), 4);
					ret = svf.VrCondition("[X|PLANT_CD]=" + _temp_struct.getPLANT_CD(), 4);
					_temp_struct.setJOB_ODR_CD("%");
						ret = svf.VrCondition("[X|JOB_ODR_CD]=" + _temp_struct.getJOB_ODR_CD(), 4);
					_temp_struct.setVEND_CD("%");
						ret = svf.VrCondition("[X|VEND_CD]=" + _temp_struct.getVEND_CD(), 4);
					_temp_struct.setITEM_CD("%");
						ret = svf.VrCondition("[X|ITEM_CD]=" + _temp_struct.getITEM_CD(), 4);
					_temp_struct.setPUCH_ODR_PERSON("%");
						ret = svf.VrCondition("[X|PUCH_ODR_PERSON]=" + _temp_struct.getPUCH_ODR_PERSON(), 4);
					_temp_struct.setPUCH_ODR_DLV_DATE_FROM("0001/01/01");
					ret = svf.VrCondition("[X|PUCH_ODR_DLV_DATE_FROM]=" + _temp_struct.getPUCH_ODR_DLV_DATE_FROM(), 4);
					_temp_struct.setPUCH_ODR_DLV_DATE_TO("9999/12/31");
						ret = svf.VrCondition("[X|PUCH_ODR_DLV_DATE_TO]=" + _temp_struct.getPUCH_ODR_DLV_DATE_TO(), 4);
					_temp_struct.setPUCH_ODR_START_DATE_FROM("0001/01/01");
					ret = svf.VrCondition("[X|PUCH_ODR_START_DATE_FROM]=" + _temp_struct.getPUCH_ODR_START_DATE_FROM(), 4);
					_temp_struct.setPUCH_ODR_START_DATE_TO("9999/12/31");
						ret = svf.VrCondition("[X|PUCH_ODR_START_DATE_TO]=" + _temp_struct.getPUCH_ODR_START_DATE_TO(), 4);
					_temp_struct.setACPT_DATE_FROM("0001/01/01");
						ret = svf.VrCondition("[X|ACPT_DATE_FROM]=" + _temp_struct.getACPT_DATE_FROM(), 4);
					_temp_struct.setACPT_DATE_TO("9999/12/31");
						ret = svf.VrCondition("[X|ACPT_DATE_TO]=" + _temp_struct.getACPT_DATE_TO(), 4);
					/* クエリー実行 */
					ret = svf.VrReport();
					// 出力済再出力がチェックOFFの場合
					// [発注残]."取消伝票発行フラグ" ＝ 2：発行済
					// [発注残]."取消伝票発行日" ＝ 業務運用日 を設定する
					if ("true".equals(struct.getReOutputFlg()) == false) {
					printList = entity.mT_RLSD_PUCH_ODR_LOCK.read(conn, struct);
					// 業務運用日取得
					String businessOprDate = null;
					List searchList = entity.mSYS_DATE_CTRL.read(conn, struct);
					if (searchList == null || searchList.size() <= 0) {
						//データが存在しない
						setErrorMessage("ZZ01101");
						setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", this.sysPLANT_CD);
						return;
					}
					AE0070010Struct searchStruct = (AE0070010Struct)searchList.get(0);
					businessOprDate = searchStruct.getBUSINESS_OPR_DATE();
						AE0070010Struct updateStruct = new AE0070010Struct();
						String puchOdrCd = struct.getl_PUCH_ODR_CD();
						updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
						updateStruct.setsSysdate(struct.getsSysdate());
						updateStruct.setsUser_ID(struct.getsUser_ID());
						updateStruct.setPUCH_ODR_CD(puchOdrCd);
						updateStruct.setODR_CANCEL_SLIP_ISS_FLG("2");
						updateStruct.setODR_CANCEL_SLIP_ISS_DATE(businessOprDate);
						entity.mT_RLSD_PUCH_ODR.update(conn, updateStruct);
					//conn.commit();
					}
				}
			}else {//明細行を選択していないとき
					ret = svf.VrCondition("[X|PLANT_CD]=" + _temp_struct.getPLANT_CD(), 4);
					if(_temp_struct.getPUCH_ODR_CD() != null && !_temp_struct.getPUCH_ODR_CD().equals("")) {
						ret = svf.VrCondition("[X|l_PUCH_ODR_CD]=" + _temp_struct.getPUCH_ODR_CD(), 4);
					} else {
						_temp_struct.setPUCH_ODR_CD("%");
						ret = svf.VrCondition("[X|l_PUCH_ODR_CD]=" + _temp_struct.getPUCH_ODR_CD(), 4);
					}
					if(_temp_struct.getJOB_ODR_CD() != null && !_temp_struct.getJOB_ODR_CD().equals("")) {
						ret = svf.VrCondition("[X|JOB_ODR_CD]=" + _temp_struct.getJOB_ODR_CD(), 4);
					} else {
						_temp_struct.setJOB_ODR_CD("%");
						ret = svf.VrCondition("[X|JOB_ODR_CD]=" + _temp_struct.getJOB_ODR_CD(), 4);
					}
					if(_temp_struct.getVEND_CD() != null && !_temp_struct.getVEND_CD().equals("")) {
						ret = svf.VrCondition("[X|VEND_CD]=" + _temp_struct.getVEND_CD(), 4);
					} else {
						_temp_struct.setVEND_CD("%");
						ret = svf.VrCondition("[X|VEND_CD]=" + _temp_struct.getVEND_CD(), 4);
					}
					if(_temp_struct.getITEM_CD() != null && !_temp_struct.getITEM_CD().equals("")) {
						ret = svf.VrCondition("[X|ITEM_CD]=" + _temp_struct.getITEM_CD(), 4);
					} else {
						_temp_struct.setITEM_CD("%");
						ret = svf.VrCondition("[X|ITEM_CD]=" + _temp_struct.getITEM_CD(), 4);
					}
					if(_temp_struct.getPUCH_ODR_PERSON() != null && !_temp_struct.getPUCH_ODR_PERSON().equals("")) {
						ret = svf.VrCondition("[X|PUCH_ODR_PERSON]=" + _temp_struct.getPUCH_ODR_PERSON(), 4);
					} else {
						_temp_struct.setPUCH_ODR_PERSON("%");
						ret = svf.VrCondition("[X|PUCH_ODR_PERSON]=" + _temp_struct.getPUCH_ODR_PERSON(), 4);
					}
					if(_temp_struct.getPUCH_ODR_DLV_DATE_FROM() != null && !_temp_struct.getPUCH_ODR_DLV_DATE_FROM().equals("")) {
						ret = svf.VrCondition("[X|PUCH_ODR_DLV_DATE_FROM]=" + _temp_struct.getPUCH_ODR_DLV_DATE_FROM(), 4);
					} else {
					_temp_struct.setPUCH_ODR_DLV_DATE_FROM("0001/01/01");
					ret = svf.VrCondition("[X|PUCH_ODR_DLV_DATE_FROM]=" + _temp_struct.getPUCH_ODR_DLV_DATE_FROM(), 4);
					}
					if(_temp_struct.getPUCH_ODR_DLV_DATE_TO() != null && !_temp_struct.getPUCH_ODR_DLV_DATE_TO().equals("")) {
						ret = svf.VrCondition("[X|PUCH_ODR_DLV_DATE_TO]=" + _temp_struct.getPUCH_ODR_DLV_DATE_TO(), 4);
					} else {
						_temp_struct.setPUCH_ODR_DLV_DATE_TO("9999/12/31");
						ret = svf.VrCondition("[X|PUCH_ODR_DLV_DATE_TO]=" + _temp_struct.getPUCH_ODR_DLV_DATE_TO(), 4);
					}
					if(_temp_struct.getPUCH_ODR_START_DATE_FROM() != null && !_temp_struct.getPUCH_ODR_START_DATE_FROM().equals("")) {
						ret = svf.VrCondition("[X|PUCH_ODR_START_DATE_FROM]=" + _temp_struct.getPUCH_ODR_START_DATE_FROM(), 4);
					} else {
					_temp_struct.setPUCH_ODR_START_DATE_FROM("0001/01/01");
					ret = svf.VrCondition("[X|PUCH_ODR_START_DATE_FROM]=" + _temp_struct.getPUCH_ODR_START_DATE_FROM(), 4);
					}
					if(_temp_struct.getPUCH_ODR_START_DATE_TO() != null && !_temp_struct.getPUCH_ODR_START_DATE_TO().equals("")) {
						ret = svf.VrCondition("[X|PUCH_ODR_START_DATE_TO]=" + _temp_struct.getPUCH_ODR_START_DATE_TO(), 4);
					} else {
						_temp_struct.setPUCH_ODR_START_DATE_TO("9999/12/31");
						ret = svf.VrCondition("[X|PUCH_ODR_START_DATE_TO]=" + _temp_struct.getPUCH_ODR_START_DATE_TO(), 4);
					}
					if ("true".equals(struct.getReOutputFlg())) {
						if(_temp_struct.getODR_CANCEL_SLIP_ISS_DATE_FROM() != null && !_temp_struct.getODR_CANCEL_SLIP_ISS_DATE_FROM().equals("")) {
							ret = svf.VrCondition("[X|ODR_CANCEL_SLIP_ISS_DATE_FROM]=" + _temp_struct.getODR_CANCEL_SLIP_ISS_DATE_FROM(), 4);
						} else {
						_temp_struct.setODR_CANCEL_SLIP_ISS_DATE_FROM("0001/01/01");
						ret = svf.VrCondition("[X|ODR_CANCEL_SLIP_ISS_DATE_FROM]=" + _temp_struct.getODR_CANCEL_SLIP_ISS_DATE_FROM(), 4);
						}
						if(_temp_struct.getODR_CANCEL_SLIP_ISS_DATE_TO() != null && !_temp_struct.getODR_CANCEL_SLIP_ISS_DATE_TO().equals("")) {
							ret = svf.VrCondition("[X|ODR_CANCEL_SLIP_ISS_DATE_TO]=" + _temp_struct.getODR_CANCEL_SLIP_ISS_DATE_TO(), 4);
						} else {
							_temp_struct.setODR_CANCEL_SLIP_ISS_DATE_TO("9999/12/31");
							ret = svf.VrCondition("[X|ODR_CANCEL_SLIP_ISS_DATE_TO]=" + _temp_struct.getODR_CANCEL_SLIP_ISS_DATE_TO(), 4);
						}
					}
					if(_temp_struct.getACPT_DATE_FROM() != null && !_temp_struct.getACPT_DATE_FROM().equals("")) {
						ret = svf.VrCondition("[X|ACPT_DATE_FROM]=" + _temp_struct.getACPT_DATE_FROM(), 4);
					} else {
					_temp_struct.setACPT_DATE_FROM("0001/01/01");
					ret = svf.VrCondition("[X|ACPT_DATE_FROM]=" + _temp_struct.getACPT_DATE_FROM(), 4);
					}
					if(_temp_struct.getACPT_DATE_TO() != null && !_temp_struct.getACPT_DATE_TO().equals("")) {
						ret = svf.VrCondition("[X|ACPT_DATE_TO]=" + _temp_struct.getACPT_DATE_TO(), 4);
					} else {
						_temp_struct.setACPT_DATE_TO("9999/12/31");
						ret = svf.VrCondition("[X|ACPT_DATE_TO]=" + _temp_struct.getACPT_DATE_TO(), 4);
					}
					/* クエリー実行 */
					ret = svf.VrReport();
							// 出力済再出力がチェックOFFの場合
					// [発注残]."取消伝票発行フラグ" ＝ 2：発行済
					// [発注残]."取消伝票発行日" ＝ 業務運用日 を設定する
					printList = entity.mT_RLSD_PUCH_ODR_LOCK.read(conn, struct);
					if ("true".equals(struct.getReOutputFlg()) == false) {
						// 業務運用日取得
						String businessOprDate = null;
						List searchList = entity.mSYS_DATE_CTRL.read(conn, struct);
						if (searchList == null || searchList.size() <= 0) {
							//データが存在しない
							setErrorMessage("ZZ01101");
							setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", this.sysPLANT_CD);
							return;
						}
						AE0070010Struct searchStruct = (AE0070010Struct)searchList.get(0);
						businessOprDate = searchStruct.getBUSINESS_OPR_DATE();
						for (int i = 0; i < printList.size(); i++) {
							
							AE0070010Struct updateStruct = new AE0070010Struct();
							AE0070010Struct printStruct = (AE0070010Struct)printList.get(i);
							String puchOdrCd = printStruct.getPUCH_ODR_CD();
							
							updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
							updateStruct.setsSysdate(struct.getsSysdate());
							updateStruct.setsUser_ID(struct.getsUser_ID());
							updateStruct.setPUCH_ODR_CD(puchOdrCd);
							updateStruct.setODR_CANCEL_SLIP_ISS_FLG("2");
							updateStruct.setODR_CANCEL_SLIP_ISS_DATE(businessOprDate);
							entity.mT_RLSD_PUCH_ODR.update(conn, updateStruct);
						}
						//conn.commit();
					}
				}
							
			if(ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				conn.rollback();
				controlSelect();
				return;
			}
		
			/* PDF作成終了 */
			ret = svf.VrQuit();
			if ( "0".equals(printType) ) {	// クライアント印刷の場合
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				}catch(IOException e){
					// サーバ印刷失敗時のエラー処理を記述してください。
					e.printStackTrace();
						ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
						sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
						emsg = new ExpjMessage("ZZ01006" , "PLANT_CD:" + _temp_struct.getPLANT_CD());
						sysLog.severe(emsg, sysUSER_CD);
						emsg = new ExpjMessage("ZZ01006" , "l_PUCH_ODR_CD:" + _temp_struct.getl_PUCH_ODR_CD());
						sysLog.severe(emsg, sysUSER_CD);
						ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
						throw ee;
				}
			
			}
//			objMessage.m_writer.write(Level.INFO, "file=" + svf.VrGetSpoolFileName() + "に出力");
		//}catch(SQLException e){
		//	e.printStackTrace();
		//	ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		//	sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		//	ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		//	throw ee;
		//}catch(ExpjException msg) {
		//	msg.printStackTrace();
		//	throw msg;

			// 出力済再出力がチェックOFFの場合
			// [発注残]."取消伝票発行フラグ" ＝ 2：発行済
			// [発注残]."取消伝票発行日" ＝ 業務運用日 を設定する
			/*if ("true".equals(struct.getReOutputFlg()) == false) {
				// 業務運用日取得
				String businessOprDate = null;
				List searchList = entity.mSYS_DATE_CTRL.read(conn, struct);
				if (searchList == null || searchList.size() <= 0) {
					//データが存在しない
					setErrorMessage("ZZ01101");
					setErrorParameter("SYS_DATE_CTRL", "PLANT_CD", this.sysPLANT_CD);
					return;
				}
				AE0070010Struct searchStruct = (AE0070010Struct)searchList.get(0);
				businessOprDate = searchStruct.getBUSINESS_OPR_DATE();
				for (int i = 0; i < printList.size(); i++) {
					
					AE0070010Struct updateStruct = new AE0070010Struct();
					AE0070010Struct printStruct = (AE0070010Struct)printList.get(i);
					String puchOdrCd = printStruct.getPUCH_ODR_CD();
					
					updateStruct.setsOraganization_CD(struct.getsOrganization_CD());
					updateStruct.setsSysdate(struct.getsSysdate());
					updateStruct.setsUser_ID(struct.getsUser_ID());
					updateStruct.setPUCH_ODR_CD(puchOdrCd);
					updateStruct.setODR_CANCEL_SLIP_ISS_FLG("2");
					updateStruct.setODR_CANCEL_SLIP_ISS_DATE(businessOprDate);
					entity.mT_RLSD_PUCH_ODR.update(conn, updateStruct);
				}
				conn.commit();
			}*/
			conn.commit();
			controlSelect();
			
		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			emsg = new ExpjMessage("ZZ01006" , "PLANT_CD:" + _temp_struct.getPLANT_CD());
			sysLog.severe(emsg, sysUSER_CD);
			emsg = new ExpjMessage("ZZ01006" , "l_PUCH_ODR_CD:" + _temp_struct.getl_PUCH_ODR_CD());
			sysLog.severe(emsg, sysUSER_CD);
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			if (conn != null) {
                  conn.rollback();
                 }
			//
		}
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0070");
		logger.entering("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
			
			readStatus = INITIAL;
			
			if (struct != null) {
				struct.clear();
			}
			if (list != null) {
				list.clear();
			}
			
			struct.setPLANT_CD(sysPLANT_CD);
			struct.setPLANT_NAME(sysPLANT_NAME);
			
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0070");
		logger.entering("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0070");
		logger.entering("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
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

			readStatus = INITIAL;
			
			if (struct != null) {
				struct.clear();
			}
			if (list != null) {
				list.clear();
			}
			
			struct.setPLANT_CD(sysPLANT_CD);
			struct.setPLANT_NAME(sysPLANT_NAME);
			
/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0070");
		logger.entering("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("AE0070010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("Clear") ) {
				controlClear();
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
//			throw new FoundationException("AE0070010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0070010-E999","CSVの出力処理"));
			throw new FoundationException("AE0070010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0070010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0070010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0070010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0070010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0070010Entity entity;
	protected AE0070010Struct struct;
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

		entity = new AE0070010Entity();
		struct = new AE0070010Struct();

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
	 * AE0070010クラスの標準コンストラクタ
	 */
	public AE0070010Control() throws BusinessProcessException, FoundationException
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
				AE0070010Struct key = (AE0070010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("ReOutputFlg") && key.getReOutputFlg() != null) {
					msgKey.setKeyValue("ReOutputFlg", key.getReOutputFlg());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE") && key.getl_PUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_SLIP_ISS_DATE", key.getl_PUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_DATE") && key.getl_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_DATE", key.getl_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_DATE") && key.getl_ODR_CANCEL_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_SLIP_ISS_DATE", key.getl_ODR_CANCEL_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD") && key.getl_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_CD", key.getl_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
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
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON") && key.getl_PUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_PERSON", key.getl_PUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("l_USER_NAME") && key.getl_USER_NAME() != null) {
					msgKey.setKeyValue("l_USER_NAME", key.getl_USER_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_CAUSE_CD") && key.getl_ODR_CANCEL_CAUSE_CD() != null) {
					msgKey.setKeyValue("l_ODR_CANCEL_CAUSE_CD", key.getl_ODR_CANCEL_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_RSLT_COMMENT") && key.getl_ACPT_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("l_ACPT_RSLT_COMMENT", key.getl_ACPT_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_FROM") && key.getPUCH_ODR_START_DATE_FROM() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_FROM", key.getPUCH_ODR_START_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_TO") && key.getPUCH_ODR_START_DATE_TO() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE_TO", key.getPUCH_ODR_START_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_FROM") && key.getPUCH_ODR_DLV_DATE_FROM() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_FROM", key.getPUCH_ODR_DLV_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_TO") && key.getPUCH_ODR_DLV_DATE_TO() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE_TO", key.getPUCH_ODR_DLV_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE_FROM") && key.getACPT_DATE_FROM() != null) {
					msgKey.setKeyValue("ACPT_DATE_FROM", key.getACPT_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE_TO") && key.getACPT_DATE_TO() != null) {
					msgKey.setKeyValue("ACPT_DATE_TO", key.getACPT_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_DATE_FROM") && key.getODR_CANCEL_SLIP_ISS_DATE_FROM() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_DATE_FROM", key.getODR_CANCEL_SLIP_ISS_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_DATE_TO") && key.getODR_CANCEL_SLIP_ISS_DATE_TO() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_DATE_TO", key.getODR_CANCEL_SLIP_ISS_DATE_TO());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
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
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG") && key.getODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_FLG", key.getODR_CANCEL_SLIP_ISS_FLG());
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
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_DATE") && key.getODR_CANCEL_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_DATE", key.getODR_CANCEL_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
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
					AE0070010Struct key = new AE0070010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("ReOutputFlg")) {
						key.setReOutputFlg(msgKey.getKeyValue("ReOutputFlg"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE")) {
						key.setl_PUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_DATE")) {
						key.setl_ACPT_DATE(msgKey.getKeyValue("l_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_SLIP_ISS_DATE")) {
						key.setl_ODR_CANCEL_SLIP_ISS_DATE(msgKey.getKeyValue("l_ODR_CANCEL_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_CD")) {
						key.setl_PUCH_ODR_CD(msgKey.getKeyValue("l_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
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
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_PERSON")) {
						key.setl_PUCH_ODR_PERSON(msgKey.getKeyValue("l_PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("l_USER_NAME")) {
						key.setl_USER_NAME(msgKey.getKeyValue("l_USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CANCEL_CAUSE_CD")) {
						key.setl_ODR_CANCEL_CAUSE_CD(msgKey.getKeyValue("l_ODR_CANCEL_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_RSLT_COMMENT")) {
						key.setl_ACPT_RSLT_COMMENT(msgKey.getKeyValue("l_ACPT_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_FROM")) {
						key.setPUCH_ODR_START_DATE_FROM(msgKey.getKeyValue("PUCH_ODR_START_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE_TO")) {
						key.setPUCH_ODR_START_DATE_TO(msgKey.getKeyValue("PUCH_ODR_START_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_FROM")) {
						key.setPUCH_ODR_DLV_DATE_FROM(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE_TO")) {
						key.setPUCH_ODR_DLV_DATE_TO(msgKey.getKeyValue("PUCH_ODR_DLV_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE_FROM")) {
						key.setACPT_DATE_FROM(msgKey.getKeyValue("ACPT_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE_TO")) {
						key.setACPT_DATE_TO(msgKey.getKeyValue("ACPT_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_DATE_FROM")) {
						key.setODR_CANCEL_SLIP_ISS_DATE_FROM(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_DATE_TO")) {
						key.setODR_CANCEL_SLIP_ISS_DATE_TO(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_DATE_TO"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
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
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_FLG"));
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
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_DATE")) {
						key.setODR_CANCEL_SLIP_ISS_DATE(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
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
