/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0040/src/com/nec/jp/orteus/metamorBase/AJ0040/AJ0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0040;

import com.nec.jp.orteus.metamorBase.AJ0040.*;
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
import java.text.ParseException;
import com.nec.jp.orteus.expj.util.*;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AJ0040010Control
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
	protected List list;											// 一覧部分の結果リストを画面に表示するためのリストインスタンス

	// デフォルトアクセサメソッド
	public List getList() { return this.list; }						// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AJ0040010Struct getListvalue(int x) { return (AJ0040010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AJ0040010Struct getStruct() { return this.struct; }	// Structを返します。
	public AJ0040010Struct createStruct() { return new AJ0040010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AJ0040010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください
	/** 進捗ステータス コンボボックスデータ取得定数 */
	private static final String PROGRESS_STATUS_PARAMETER_NAME = "PROGRESS_STS_INST";
	
	/** 進捗ステータス コンボボックスデータ*/
	private ComboStruct PROGRESS_STATUS = null;
	
	/** 業務運用日 */
	private String oprDate = null;
	
	/**
	 * 画面遷移キー(オーダデマンド番号)
	 */
	protected String odNo;
	
	/**
	 * 画面遷移キー(作業計画番号)
	 */
	protected String workOdrCd;
	
	/**
	 * 画面遷移キー(仕掛作業コード)
	 */
	protected String workInProcCd;
	
	/**
	 * 業務運用日の取得
	 */
	public String getOprDate() {
		return this.oprDate;
	}
	
	/**
	 * 画面遷移キー(オーダデマンド番号)設定
	 * @param cd オーダデマンド番号
	 */
	public void setOdNo(String cd) {
		odNo = cd;
	}
	
	/**
	 * 画面遷移キー(オーダデマンド番号)取得
	 * @return オーダデマンド番号
	 */
	public String getOdNo() {
		return odNo;
	}
	
	/**
	 * 画面遷移キー(作業計画番号)設定
	 * @param cd 作業計画番号
	 */
	public void setWorkOdrCd(String cd) {
		workOdrCd = cd;
	}
	
	/**
	 * 画面遷移キー(作業計画番号)取得
	 * @return 作業計画番号
	 */
	public String getWorkOdrCd() {
		return workOdrCd;
	}
	
	/**
	 * 画面遷移キー(仕掛作業コード)設定
	 * @param cd 仕掛作業コード
	 */
	public void setWorkInProcCd(String cd) {
		workInProcCd = cd;
	}
	
	/**
	 * 画面遷移キー(仕掛作業コード)取得
	 * @return 仕掛作業コード
	 */
	public String getWorkInProcCd() {
		return workInProcCd;
	}
	
	/**
	 * コンボボックスデータから表示説明を取得する
	 * @param combo コンボボックスデータ
	 * @param value コンボボックスデータの値
	 * @return コンボボックスデータの表示説明
	 */
	private String getDisplayName(ComboStruct combo, String value) {
		for (int j = 0; j < combo.size(); j++) {
			if ((combo.getData(j)[0]).equals(value)) {
				return combo.getData(j)[1];
			}
		}
		return null;
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
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
//				controlSelect();
			}
			
			this.struct.clear();
			
			//ヘッダ情報検索
			this.struct.setPARAMETER_OD_NO(odNo);
			List tOdList = entity.mT_OD.read(conn, this.struct);
			if (tOdList == null || tOdList.size() == 0) {
				//指定キーのデータが存在しません。
				ExpjMessage emsg = new ExpjMessage("ZZ01101");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			AJ0040010Struct headerStruct = (AJ0040010Struct)tOdList.get(0);
			this.struct.setStructM(headerStruct);
			
			//業務運用日のセット
			List tempList = entity.mSYS_DATE_CTRL.read(conn, this.struct);
			if(tempList == null || tempList.size() == 0){
				//指定キーのデータが存在しません。
				ExpjMessage emsg = new ExpjMessage("ZZ01101");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			AJ0040010Struct tempStruct = (AJ0040010Struct)tempList.get(0);
			this.oprDate = null;
			this.oprDate = tempStruct.getBUSINESS_OPR_DATE();
			
			//製番情報の取得
			if(headerStruct.getJOB_ODR_CD() != null
					&& !headerStruct.getJOB_ODR_CD().equals("")){
				
				List tJobOdrList = entity.mT_JOB_ODR.read(conn, headerStruct);
				
				if (tJobOdrList == null || tJobOdrList.size() == 0) {
					//指定キーのデータが存在しません。
					ExpjMessage emsg = new ExpjMessage("ZZ01101");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					return;
				}
				AJ0040010Struct jobOdrStruct = (AJ0040010Struct)tJobOdrList.get(0);
				this.struct.setJOB_ODR_TYP(jobOdrStruct.getJOB_ODR_TYP());
				this.struct.setJOB_ODR_TYP_DN(multcombo("JOB_ODR_TYP",jobOdrStruct.getJOB_ODR_TYP()));
				this.struct.setALC_GRP_CD(jobOdrStruct.getALC_GRP_CD());
				this.struct.setJOB_ODR_QTY(jobOdrStruct.getJOB_ODR_QTY());
				this.struct.setJOB_ODR_DLV_DATE(jobOdrStruct.getJOB_ODR_DLV_DATE());
						
				DateTimeFormat dtf = new DateTimeFormat(conn);
				this.struct.setJOB_ODR_DLV_TIME(dtf.getCoronTimePart(jobOdrStruct.getJOB_ODR_DLV_DATE()));

			} else {
				this.struct.setJOB_ODR_CANCEL_NO("");
			}
			
			//一覧情報の検索
			this.struct.setPARAMETER_OD_NO( odNo );
			this.struct.setPARAMETER_WORK_ODR_CD( workOdrCd );
			this.struct.setPARAMETER_WORK_IN_PROC_CD( workInProcCd );
			int maxLine = sp.getMaxLine(conn, 10);
			if(maxLine != 0) {
				this.struct.setROW_COUNT(String.valueOf(maxLine));
			} else {
				this.struct.setROW_COUNT(null);
			}
			this.list = entity.mT_RLSD_PUCH_ODRCnt.read(conn, this.struct);
			long rowCount = Long.parseLong(((AJ0040010Struct)this.list.get(0)).getl_COUNT());
			if(rowCount==0){
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = NOT_FOUND;
				if(this.list!=null && this.list.size()>0){
					this.list.clear();
				}
				return;
			}
			//表示件数チェック
			if (maxLine != 0 && rowCount== maxLine + 1) {
				//表示件数が規定値(%0)を超えています。
				if(this.list!=null && this.list.size()>0){
					this.list.clear();
				}
				setReadStatus(TOO_MANY);
				ExpjMessage emsg = new ExpjMessage("ZZ01115", "" + maxLine);
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			this.list = entity.mT_RLSD_PUCH_ODR.read(conn, this.struct);
			
			for (int i = 0; i < this.list.size(); i++) {
				AJ0040010Struct tableStruct = (AJ0040010Struct)this.list.get(i);
				tableStruct.setl_ACPT_INSPC_TYP_DN(this.multcombo("ACPT_INSPC_TYP",tableStruct.getACPT_INSPC_TYP()));
				tableStruct.setl_PUCH_ODR_STS_TYP_DN(this.multcombo("PUCH_ODR_STS_TYP",tableStruct.getl_PUCH_ODR_STS_TYP()));	
				//進捗ステータスの設定
				//"遅れ":業務運用日＞発注納期かつ完了以外を満たすレコード
				String workPuchOdrDlvDate 
						= tableStruct.getl_PUCH_ODR_DLV_DATE(); //発注納期
				String procPuchOdrStsTyp 
						= tableStruct.getl_PUCH_ODR_STS_TYP();   //発注状態区分
				
				Date dateWorkPuchOdrDlvDate = null; //発注納期
				Date dateOprDate = null;                       //業務運用日
				try {
					dateWorkPuchOdrDlvDate = Converter.strToDate(
							workPuchOdrDlvDate,Converter.SLASH_DATE); //発注納期
					dateOprDate = Converter.strToDate(
							oprDate,Converter.SLASH_DATE);            //業務運用日
				} catch (ParseException pe) {
					pe.printStackTrace();
					ExpjMessage emsg = new ExpjMessage("ZZ01106");
					sysLog.severe(emsg, getsysUSER_CD());
					throw new ExpjException(pe, emsg);
				}
				
				if (procPuchOdrStsTyp != null && !procPuchOdrStsTyp.equals("9")) {
					//業務運用日＞発注納期
					if(dateOprDate.compareTo(dateWorkPuchOdrDlvDate) > 0){
						//進捗ステータス＝"遅れ"
						String displayName = getDisplayName(PROGRESS_STATUS, "1");
						tableStruct.setl_PROGRESS_STATUS_DN(displayName);
					}else{
						tableStruct.setl_PROGRESS_STATUS_DN("");
					}
				} else {
					tableStruct.setl_PROGRESS_STATUS_DN("");
				}
				tableStruct.setl_PUCH_ODR_INST_DATE(tableStruct.getl_PUCH_ODR_INST_DATE());
				tableStruct.setl_PUCH_ODR_EDI_ISS_DATE(tableStruct.getl_PUCH_ODR_EDI_ISS_DATE());
				tableStruct.setl_PUCH_ODR_SLIP_ISS_DATE(tableStruct.getl_PUCH_ODR_SLIP_ISS_DATE());
				tableStruct.setl_PUCH_ODR_START_DATE(tableStruct.getl_PUCH_ODR_START_DATE());
				tableStruct.setl_PUCH_ODR_DLV_DATE(tableStruct.getl_PUCH_ODR_DLV_DATE());
				tableStruct.setl_CONFIRM_DLV_DATE(tableStruct.getl_CONFIRM_DLV_DATE());
				tableStruct.setl_ACPT_CMPLT_DATE(tableStruct.getl_ACPT_CMPLT_DATE());
				tableStruct.setl_INSPC_CMPLT_DATE(tableStruct.getl_INSPC_CMPLT_DATE());
				tableStruct.setJOB_ODR_DLV_DATE(tableStruct.getJOB_ODR_DLV_DATE());
			}
			
			
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0040");
		logger.entering("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try {
				ComboBox comboController = new ComboBox(conn, sysUSER_CD);
				PROGRESS_STATUS = comboController.getData(PROGRESS_STATUS_PARAMETER_NAME);
			} catch (SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AJ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Close") ) {
				controlClose();
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
//			throw new FoundationException("AJ0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0040010-E999","CSVの出力処理"));
			throw new FoundationException("AJ0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0040010-E999","システム日付の取得処理"));
				throw new FoundationException("AJ0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("AJ0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AJ0040010Entity entity;
	protected AJ0040010Struct struct;
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

		entity = new AJ0040010Entity();
		struct = new AJ0040010Struct();

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
	 * AJ0040010クラスの標準コンストラクタ
	 */
	public AJ0040010Control() throws BusinessProcessException, FoundationException
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
				AJ0040010Struct key = (AJ0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP_DN") && key.getl_PUCH_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_STS_TYP_DN", key.getl_PUCH_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP_DN") && key.getl_ACPT_INSPC_TYP_DN() != null) {
					msgKey.setKeyValue("l_ACPT_INSPC_TYP_DN", key.getl_ACPT_INSPC_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN") && key.getl_PROGRESS_STATUS_DN() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS_DN", key.getl_PROGRESS_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_TIME") && key.getJOB_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_TIME", key.getJOB_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PARAMETER_OD_NO") && key.getPARAMETER_OD_NO() != null) {
					msgKey.setKeyValue("PARAMETER_OD_NO", key.getPARAMETER_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP") && key.getl_PUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_STS_TYP", key.getl_PUCH_ODR_STS_TYP());
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
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_DATE") && key.getl_PUCH_ODR_INST_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_INST_DATE", key.getl_PUCH_ODR_INST_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE") && key.getl_PUCH_ODR_EDI_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_EDI_ISS_DATE", key.getl_PUCH_ODR_EDI_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE") && key.getl_PUCH_ODR_SLIP_ISS_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_SLIP_ISS_DATE", key.getl_PUCH_ODR_SLIP_ISS_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE") && key.getl_PUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_START_DATE", key.getl_PUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE") && key.getl_PUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_DLV_DATE", key.getl_PUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE") && key.getl_CONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE", key.getl_CONFIRM_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY") && key.getl_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_QTY", key.getl_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ACPT_QTY") && key.getl_TOTAL_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ACPT_QTY", key.getl_TOTAL_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_CMPLT_DATE") && key.getl_ACPT_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_CMPLT_DATE", key.getl_ACPT_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_INSPECTED_QTY") && key.getl_TOTAL_INSPECTED_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_INSPECTED_QTY", key.getl_TOTAL_INSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ACCEPTED_QTY") && key.getl_TOTAL_ACCEPTED_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ACCEPTED_QTY", key.getl_TOTAL_ACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_DEFECTED_QTY") && key.getl_TOTAL_DEFECTED_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_DEFECTED_QTY", key.getl_TOTAL_DEFECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_DATE") && key.getl_INSPC_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_INSPC_CMPLT_DATE", key.getl_INSPC_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE_COMMENT") && key.getl_CONFIRM_DLV_DATE_COMMENT() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE_COMMENT", key.getl_CONFIRM_DLV_DATE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("PARAMETER_WORK_ODR_CD") && key.getPARAMETER_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("PARAMETER_WORK_ODR_CD", key.getPARAMETER_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARAMETER_WORK_IN_PROC_CD") && key.getPARAMETER_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("PARAMETER_WORK_IN_PROC_CD", key.getPARAMETER_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_QTY") && key.getJOB_ODR_QTY() != null) {
					msgKey.setKeyValue("JOB_ODR_QTY", key.getJOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
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
					AJ0040010Struct key = new AJ0040010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP_DN")) {
						key.setl_PUCH_ODR_STS_TYP_DN(msgKey.getKeyValue("l_PUCH_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_INSPC_TYP_DN")) {
						key.setl_ACPT_INSPC_TYP_DN(msgKey.getKeyValue("l_ACPT_INSPC_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN")) {
						key.setl_PROGRESS_STATUS_DN(msgKey.getKeyValue("l_PROGRESS_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_TIME")) {
						key.setJOB_ODR_DLV_TIME(msgKey.getKeyValue("JOB_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PARAMETER_OD_NO")) {
						key.setPARAMETER_OD_NO(msgKey.getKeyValue("PARAMETER_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_STS_TYP")) {
						key.setl_PUCH_ODR_STS_TYP(msgKey.getKeyValue("l_PUCH_ODR_STS_TYP"));
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
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_INST_DATE")) {
						key.setl_PUCH_ODR_INST_DATE(msgKey.getKeyValue("l_PUCH_ODR_INST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_EDI_ISS_DATE")) {
						key.setl_PUCH_ODR_EDI_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_EDI_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_SLIP_ISS_DATE")) {
						key.setl_PUCH_ODR_SLIP_ISS_DATE(msgKey.getKeyValue("l_PUCH_ODR_SLIP_ISS_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_START_DATE")) {
						key.setl_PUCH_ODR_START_DATE(msgKey.getKeyValue("l_PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_DLV_DATE")) {
						key.setl_PUCH_ODR_DLV_DATE(msgKey.getKeyValue("l_PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE")) {
						key.setl_CONFIRM_DLV_DATE(msgKey.getKeyValue("l_CONFIRM_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_QTY")) {
						key.setl_PUCH_ODR_QTY(msgKey.getKeyValue("l_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ACPT_QTY")) {
						key.setl_TOTAL_ACPT_QTY(msgKey.getKeyValue("l_TOTAL_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_CMPLT_DATE")) {
						key.setl_ACPT_CMPLT_DATE(msgKey.getKeyValue("l_ACPT_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_INSPECTED_QTY")) {
						key.setl_TOTAL_INSPECTED_QTY(msgKey.getKeyValue("l_TOTAL_INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ACCEPTED_QTY")) {
						key.setl_TOTAL_ACCEPTED_QTY(msgKey.getKeyValue("l_TOTAL_ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_DEFECTED_QTY")) {
						key.setl_TOTAL_DEFECTED_QTY(msgKey.getKeyValue("l_TOTAL_DEFECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPC_CMPLT_DATE")) {
						key.setl_INSPC_CMPLT_DATE(msgKey.getKeyValue("l_INSPC_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE_COMMENT")) {
						key.setl_CONFIRM_DLV_DATE_COMMENT(msgKey.getKeyValue("l_CONFIRM_DLV_DATE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("PARAMETER_WORK_ODR_CD")) {
						key.setPARAMETER_WORK_ODR_CD(msgKey.getKeyValue("PARAMETER_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARAMETER_WORK_IN_PROC_CD")) {
						key.setPARAMETER_WORK_IN_PROC_CD(msgKey.getKeyValue("PARAMETER_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_QTY")) {
						key.setJOB_ODR_QTY(msgKey.getKeyValue("JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
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
