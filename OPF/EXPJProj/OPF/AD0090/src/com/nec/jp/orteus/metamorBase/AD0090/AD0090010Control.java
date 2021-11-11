/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AD0090/src/com/nec/jp/orteus/metamorBase/AD0090/AD0090010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AD0090;

import com.nec.jp.orteus.metamorBase.AD0090.*;
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
import java.io.IOException;
import java.math.BigDecimal;
import com.nec.jp.orteus.xaf.wa.sqlparser.ParseException;
import com.nec.jp.orteus.expj.lot.BizCommon;
import com.nec.jp.orteus.expj.pr.rcvissue.process.AutoIssue;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvCancel;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc;
import com.nec.jp.orteus.expj.pr.rcvissue.process.WhAutoIssueProc.AutoIssueParam;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
import com.nec.jp.orteus.expj.flash.Kind;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.ApsComException;
import com.nec.jp.orteus.metamorBase.common02.CommonOd.CommonOd;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AD0090010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.16 $ $Date: 2015/12/22 09:53:54 $
 *
 */
//}}user_implement_code_header

public class AD0090010Control
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
	public AD0090010Struct getListvalue(int x) { return (AD0090010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AD0090010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AD0090010Struct createStruct() { return new AD0090010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AD0090010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください
	
	/** 製番枝番 ZERO */
    final static int _JOB_ODR_DETAIL_NO = 0;
    
    /** 不良リストの追加表示件数 */
	static public int DISPLAY_NUMBER = 15;
	
	//子品目の更新の数量
	private int errCount = 0;
	private int norCount = 0;
	/*会社コード*/
	public String _company_cd = null;

	// log用
	private String logInfomation = null;
	
	//msgStruct保存用
	public MessageStruct saveStruct = null;
    
	// Add Start 20140219 huang-lh
		/** 工程保管場所の在庫を管理する 0:工程保管場所の在庫を行なわない 1:工程保管場所の在庫をなう*/
		private String _processManageFlg = "0";
		/** 不良在庫を工程管理する 0:不良在庫の工程管理するを行なわない 1:不良在庫の工程管理するをなう*/
		private String _defectManageFlg = "0";
		private String lestQty[] = null;
		private String useQty[] = null;
		/**
	     * 対象の文字列がNull（空文字あるいはNull）であるかを判定します。
	     * @param str 対象文字列
	     * @return Nullの場合はtrue、Nullではない場合はfalse
	     */
	    private boolean isNull(String str) {
	     if (str == null || str.length() == 0 || str.equalsIgnoreCase("null")) {
	      return true;
	     }
	     return false;
		    }
	    
	    /**
	     * 当工程の前工程或る後工程を取得処理
	     * @throws SQLException 
	     * @throws FoundationException 
	     */
	    private void SelectPrevOrNextWork() throws FoundationException, SQLException {
	    	List tempList = new ArrayList();
	    	AD0090010Struct paramStruct  = new AD0090010Struct();
	    	AD0090010Struct tempStruct  = new AD0090010Struct();
	    	paramStruct.setWORK_ODR_CD(selectStruct.getWORK_ODR_CD());
	    	paramStruct.setPROC_NO(selectStruct.getPROC_NO());
	    	
	    	// 作業系列別仕掛から、最初工程情報を取得する
	    	tempList = entity.mCheckFirstWork.read(conn, paramStruct);
	    	 
	    	if (null != tempList && tempList.size() > 0) {
	    		tempStruct = (AD0090010Struct) tempList.get(0);
	    		if (selectStruct.getIN_OPR_INST_CD().equals(tempStruct.getFIRST_OPR_INST_CD())) {
	    			// 最初工程場合
	    			selectStruct.setFIRST_WORK_FLG("1");
	     			
	     			// 次工程情報を取得する
	    			tempList = entity.mSelectNextWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setNEXT_WH_CD(tempStruct.getNEXT_WH_CD());
	        			selectStruct.setNEXT_WORK_ODR_CD(tempStruct.getNEXT_WORK_ODR_CD());
	        			selectStruct.setNEXT_OPR_INST_CD(tempStruct.getNEXT_OPR_INST_CD());
	        			selectStruct.setNEXT_PROC_NO(tempStruct.getNEXT_PROC_NO());
	        			selectStruct.setNEXT_WS_CD(tempStruct.getNEXT_WS_CD());
	        			selectStruct.setNEXT_WS_NAME(tempStruct.getNEXT_WS_NAME());
	        			selectStruct.setNEXT_WH_NAME(tempStruct.getNEXT_WH_NAME());
	    			}
	    		}else if (!"1".equals(selectStruct.geth_FINAL_PROC_FLG())){
		 			// 最初工程でない且つ最初工程でない場合
	    			selectStruct.setFIRST_WORK_FLG("0");
	 			
	    			// 前工程情報を取得する
	    			tempList = entity.mSelectPrevWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setPREV_WORK_ODR_CD(tempStruct.getPREV_WORK_ODR_CD());
	        			selectStruct.setPREV_OPR_INST_CD(tempStruct.getPREV_OPR_INST_CD());
	        			selectStruct.setPREV_PARTIAL_PRD_NO(tempStruct.getPREV_PARTIAL_PRD_NO());
	        			selectStruct.setPREV_PROC_NO(tempStruct.getPREV_PROC_NO());
	        			selectStruct.setPREV_WH_CD(tempStruct.getPREV_WH_CD());
	    			}
	    			// 次工程情報を取得する
	    			tempList = entity.mSelectNextWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setNEXT_WH_CD(tempStruct.getNEXT_WH_CD());
	        			selectStruct.setNEXT_WORK_ODR_CD(tempStruct.getNEXT_WORK_ODR_CD());
	        			selectStruct.setNEXT_OPR_INST_CD(tempStruct.getNEXT_OPR_INST_CD());
	        			selectStruct.setNEXT_PROC_NO(tempStruct.getNEXT_PROC_NO());
	        			selectStruct.setNEXT_WS_CD(tempStruct.getNEXT_WS_CD());
	        			selectStruct.setNEXT_WS_NAME(tempStruct.getNEXT_WS_NAME());
	        			selectStruct.setNEXT_WH_NAME(tempStruct.getNEXT_WH_NAME());
	    			}
	    		} else {
	    			// 最後工程場合
	    			selectStruct.setFIRST_WORK_FLG("0");
	 			
	    			// 前工程情報を取得する
	    			tempList = entity.mSelectPrevWorkInfo.read(conn, paramStruct);
	    			if (null != tempList && tempList.size() > 0) {
	    				tempStruct = (AD0090010Struct) tempList.get(0);
	        			selectStruct.setPREV_WORK_ODR_CD(tempStruct.getPREV_WORK_ODR_CD());
	        			selectStruct.setPREV_OPR_INST_CD(tempStruct.getPREV_OPR_INST_CD());
	        			selectStruct.setPREV_PARTIAL_PRD_NO(tempStruct.getPREV_PARTIAL_PRD_NO());
	        			selectStruct.setPREV_PROC_NO(tempStruct.getPREV_PROC_NO());
	        			selectStruct.setPREV_WH_CD(tempStruct.getPREV_WH_CD());
	    			}
	    		}
	    	}
	    }
	    
	    /**
	     * 品目の工程在庫の管理する
	     * @param	AD0090010Struct	 作業実績struct
	     * @param	AD0090010Struct	 作業仕掛struct
	     * @return  int             実行結果
		 * @throws SQLException 
	     * @throws FoundationException 
	     * */
	    private int ItemWorkManager(int updFlg) throws SQLException, FoundationException {
	    	AD0090010Struct issueStruct = null;
	    	List issueList = new ArrayList();
	    	List tempList = new ArrayList();
	    	AD0090010Struct tempStruct = new AD0090010Struct();
	    	
	    		//　最終工程の以外かどうか判断する
	    		if (!"1".equals(selectStruct.geth_FINAL_PROC_FLG())) {
	    			//　最終工程の以外の場合
	    			// --------------[出庫指示]のデータを取得する----------
	    			issueList = entity.mSelectIssue.read(conn,this.selectStruct);
	    			
	    			// 出庫指示データを繰り返す。
	    			for(int j = 0; j < issueList.size(); j++) {
	    				issueStruct = (AD0090010Struct)issueList.get(j);
	        			
	    				// 取得された項目「使用元保管区」を再設定する
	        			tempList = entity.mCheckFirstWork.read(conn, this.selectStruct);
	    				if (null != tempList && tempList.size() > 0) {
	    					tempStruct = (AD0090010Struct)tempList.get(0);
	    				}
			    		// 最初工程かどうか判断する
			    		if (!tempStruct.getFIRST_OPR_INST_CD().equals(this.selectStruct.getIN_OPR_INST_CD())) {
			    			// 最初工程でない場合
			    			issueStruct.setFIRST_WORK_FLG("0");
			    			
			    			// 前工程情報を取得する
			    			tempList = entity.mSelectPrevWorkInfo.read(conn, this.selectStruct);
			    			if (null != tempList && tempList.size() > 0) {
		    					tempStruct = (AD0090010Struct)tempList.get(0);
		    				}
			    			// 前工程があるの場合：前工程の作業実績で登録した保管区コード
			    			issueStruct.setWH_CD(tempStruct.getPREV_WH_CD());
			    		}
			    		
			    		// 保管区コードのNULLチェック
						if (isNull(issueStruct.getWH_CD())) {
							// 子品目の使用元保管区コードが未入力です。
							setErrorMessage("AD00215");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
							updFlg = 9;
							break;
							
						}
						
						// 保管区コードチェック
						tempList = entity.mSelectChkWhCd.read(conn,issueStruct);
						if(tempList.isEmpty()){
							setErrorMessage("AD00216");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
							updFlg = 9;
							break;
						}
						
						// 保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
						AD0090010Struct whStruct = (AD0090010Struct)tempList.get(0);
						if (whStruct.getPLANT_CD() == null || !whStruct.getPLANT_CD().equals(getsysPLANT_CD())) {
							setErrorMessage("AD00217");
							setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
							updFlg = 9;
							break;
						}
						
						String denominator = null;  // 分母
						String numerator = null;  //  分子
						String useSum = null;  // 更新使用数量
						String acptQty = null; // 更新使用数量(良品)
						String defectQty = null; // 更新使用数量(不良品)
						
						// 更新使用数量の計算
						denominator = issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(); // 分母
						numerator = issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR(); // 分子
						useSum = Calculate.add(struct.getACPT_QTY(), struct.getDEFECT_QTY());	
						
						if("1".equals(issueStruct.getUNIT_QTY_TYP())) { //　整数管理
							// 更新使用数量
							useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, Calculate.CEIL);
							useSum = Calculate.ceil(useSum, 0);
							
							// 更新使用数量（良品数）
							acptQty = Calculate.divide(
									Calculate.multiply(struct.getACPT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
									Calculate.CEIL);
							acptQty = Calculate.ceil(acptQty, 0);
							
							// 更新使用数量（不良数）
							defectQty = Calculate.divide(
									Calculate.multiply(struct.getDEFECT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
									Calculate.CEIL);
							defectQty = Calculate.ceil(defectQty, 0);
						} else {
							// 更新使用数量
							useSum = Calculate.divide(Calculate.multiply(useSum, numerator), denominator, 4, Calculate.CEIL);
							
							// 更新使用数量（良品数）
							acptQty = Calculate.divide(
									Calculate.multiply(struct.getACPT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
											4,
											Calculate.CEIL);
							
							// 更新使用数量（不良数）
							defectQty = Calculate.divide(
									Calculate.multiply(struct.getDEFECT_QTY(), 
											issueStruct.geth_ISSUE_INST_UNIT_NUMERATOR()),
											issueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR(), 
											4,
											Calculate.CEIL);
						}
						// 退避用手持ち在庫数を初期化
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						issueStruct.setTEMP_USE_QTY(useSum);
						issueStruct.setUSE_ACPT_QTY(acptQty);
						issueStruct.setUSE_DEFECT_QTY(defectQty);
						// 工場
						issueStruct.setPLANT_CD(sysPLANT_CD);
						issueStruct.setUSER_CD(sysUSER_CD);
						issueStruct.setUPDATED_PRG_NM(this.sp.getProcId());
						
						//更新使用数量が”0”場合、次の出庫指示データに進む。
						if ("0".equals(useSum)) {
							continue;
						}
						// ----------------------工程在庫出庫処理------------------
						if(issueStruct.getJOB_ODR_CD() == null 
								|| issueStruct.getJOB_ODR_CD().length() == 0){
							//保管区別品目在庫更新
							tempList = entity.mSelectItemStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);

							if (tempList.isEmpty()) {
								//登録
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
								entity.mInsertItemStock.create(conn, stockStruct);
							} else {
								//更新
								tempStruct = (AD0090010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										issueStruct.getTEMP_USE_QTY()));
								entity.mUpdateItemStock.update(conn, stockStruct);
							}
						} else {
							//製番仕掛在庫更新
							tempList = entity.mSelectOdrStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();	
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);
			
							if (tempList.isEmpty()) {
								//登録
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
								entity.mInsertOdrStock.create(conn,stockStruct);
							} else {
								//更新
								tempStruct = (AD0090010Struct)tempList.get(0);
								stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.subtract(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										issueStruct.getTEMP_USE_QTY()));
								entity.mUpdateOdrStock.update(conn,stockStruct);
							}
						}
						
						boolean bResult;
						// ロット管理フラグ = 1(ロット管理を行う)の場合
						if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
							// 使用数の計算処理を呼び出し。
							updFlg = CalcUseQty("2",issueStruct);
							if (updFlg != 0) {
								break;
							}
						} else {
							//---------------[保管区別入出庫]の追加(出庫)------------------
							updFlg = InsertRecvIssue("2",issueStruct);
							if (updFlg != 0) {
								break;
							}
						}
						
						issueStruct.setWH_CD(this.struct.getWH_CD());
						issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						// ----------------------工程在庫入庫処理------------------
						if(issueStruct.getJOB_ODR_CD() == null 
								|| issueStruct.getJOB_ODR_CD().length() == 0){
							//保管区別品目在庫更新
							tempList = entity.mSelectItemStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);

							if (tempList.isEmpty()) {
								//登録
								stockStruct.setSTOCK_ON_HAND_QTY(acptQty);
								entity.mInsertItemStock.create(conn, stockStruct);
							} else {
								//更新
								tempStruct = (AD0090010Struct)tempList.get(0);
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										acptQty));
								entity.mUpdateItemStock.update(conn, stockStruct);
							}
						} else {
							//製番仕掛在庫更新
							tempList = entity.mSelectOdrStock.read(conn,issueStruct);
							AD0090010Struct stockStruct = new AD0090010Struct();	
							stockStruct.setStructM(issueStruct);
							setStandardItem(stockStruct);
			
							if (tempList.isEmpty()) {
								//登録
								stockStruct.setSTOCK_ON_HAND_QTY(acptQty);
								entity.mInsertOdrStock.create(conn,stockStruct);
							} else {
								//更新
								tempStruct = (AD0090010Struct)tempList.get(0);
								stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
								issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
								stockStruct.setSTOCK_ON_HAND_QTY(Calculate.add(issueStruct.getSAVE_STOCK_ON_HAND_QTY(), 
										acptQty));
								entity.mUpdateOdrStock.update(conn,stockStruct);
							}
						}
						
						// ロット管理フラグ = 1(ロット管理を行う)の場合
						if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
							// 使用数の計算処理を呼び出し。
							updFlg = CalcUseQty("1",issueStruct);
							if (updFlg != 0) {
								break;
							}
						} else {
							//---------------[保管区別入出庫]の追加(出庫)------------------
							updFlg = InsertRecvIssue("1",issueStruct);
							if (updFlg != 0) {
								break;
							}
						}
						
						// システムパラメータ：”不良在庫を工程管理する”が”ＯＮ”場合
						if ("1".equals(_defectManageFlg) && !"0".equals(defectQty)) {
							// ロット管理フラグ = 1(ロット管理を行う)の場合
							if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
								// 使用数の計算処理を呼び出し。
								updFlg = CalcUseQty("3",issueStruct);
								if (updFlg != 0) {
									break;
								}
							} else {
								//---------------[保管区別入出庫]の追加(出庫)------------------
								updFlg = InsertRecvIssue("3",issueStruct);
								if (updFlg != 0) {
									break;
								}
								// 不良品出庫処理呼び出し
								IssueProcess IProc = new IssueProcess(conn, this.issueStruct.getRCV_ISSUE_CTRL_CD());
								bResult = IProc.execDefectProcess();
								if (!bResult) {
									//出庫処理失敗 サーバーエラー
									updFlg = 9;
									break;
								}
							}
						}
	    			}
	    		} 
	    		return updFlg;
	    }
	    /**
	     * 使用数の計算処理処理
	     * @param	int         	 登録フラグ
	     * @param	AD0090010Struct 出庫指示データ
	     * @return  int             実行結果
		 * @throws SQLException 
	     * @throws FoundationException 
	     * @throws BatchAppException 
	     * */
	    private int CalcUseQty(String insertType,AD0090010Struct issueStruct) throws FoundationException, SQLException{
	    	List tempList = new ArrayList();
	    	AD0090010Struct tempStruct = new AD0090010Struct();
	    	int updFlg = 0;
	    	
	    	// 出庫実績明細取得
			List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,issueStruct);

			if ("1".equals(insertType)) {			// 入庫の場合
				 lestQty = new String[lotIssueList.size()];
				 useQty = new String[lotIssueList.size()];
			}
			
			// データがない場合
			if (lotIssueList == null || lotIssueList.size() == 0) {
				errCount = errCount + 1;
				setErrorMessage("AD20135");
				setSupportMessage("T_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());
				setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
						issueStruct.geth_ISSUE_INST_CD());// 出庫指示番号
				setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());// 品目番号
				setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",issueStruct.getWORK_ODR_CD());	// 作業計画番号
				updFlg = 9;
				return updFlg;
			}

			// 使用残数設定
			BigDecimal remainQty = null;
			if ("2".equals(insertType)) {		// 出庫の場合
				remainQty = new BigDecimal(issueStruct.getTEMP_USE_QTY());
			} else if ("1".equals(insertType)) {			// 入庫の場合
				remainQty = new BigDecimal(issueStruct.getUSE_ACPT_QTY());
			} else if ("3".equals(insertType)) {			// 不良入庫の場合
				remainQty = new BigDecimal(issueStruct.getUSE_DEFECT_QTY());
			}

			for (int j = 0; j < lotIssueList.size(); j++) {
				
				
				AD0090010Struct lotIssueStruct = (AD0090010Struct) lotIssueList.get(j);

				// 引き当て可能数設定
				BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
				BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
				BigDecimal availQty = null;
				if ("3".equals(insertType)){
					availQty = new BigDecimal(lestQty[j]);
				} else {
					availQty = issueQty.subtract(spentQty);
				}
				
				
				if ("1".equals(insertType)) {			// 入庫の場合
					lestQty[j] = availQty.toString();
					useQty[j] = "0";
				}

				//使用残数が0以下の場合ループ終了
				if (remainQty.doubleValue() <= 0) {
					continue;
				}
				
				if ("3".equals(insertType) && Calculate.compare(lestQty[j], "0") <= 0){
					continue;
				}

				BigDecimal useLotQty = null;
				

				
				// 引き当て可能数 >= 使用残数の場合
				if (availQty.doubleValue() >= remainQty.doubleValue()) {
					// 使用残数を引き当て数に設定
					useLotQty = remainQty;
					// 引き当て可能数 < 使用残数の場合
				} else {
					// 最終データの場合
					if (j == lotIssueList.size() - 1) {
						// 使用残数を使用数に設定
						useLotQty = remainQty;
						// 最終データでない場合
					} else {
						// 引当可能数が0より大きい場合
						if (availQty.doubleValue() > 0) {
							// 使用残数を使用数に設定
							useLotQty = remainQty;

							// 次レコード以降を取得
							for (int k = j + 1; k < lotIssueList.size(); k++) {
								AD0090010Struct nextLotIssueStruct = (AD0090010Struct) lotIssueList.get(k);

								// 引き当て可能数設定
								BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
								BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
								BigDecimal nextAvailQty = null;

								if ("3".equals(insertType)){
									nextAvailQty = new BigDecimal(lestQty[k]);
								} else {
									nextAvailQty = nextIssueQty.subtract(nextSpentQty);
								}
								
								// 次レコード以降に引当可能なデータがある場合
								if (nextAvailQty.doubleValue() > 0) {
									// 引き当て可能数を使用数に設定
									useLotQty = availQty;
									break;
								}
							}
							// 引当可能数が0以下の場合
						} else {
							// 次のデータを取得
							continue;
						}
					}
				}

				// 使用数が引当可能数より大きい場合
				if (useLotQty.doubleValue() > availQty.doubleValue()) {
					// メッセージ出力
					setWarningMessage("AD20136");
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
							issueStruct.geth_ISSUE_INST_CD());// 出庫指示番号
					setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",issueStruct.getITEM_CD());
					// 品目番号
					setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",issueStruct.getWORK_ODR_CD());
					// 作業計画番号
				}

				issueStruct.setUSE_LOT_NO(lotIssueStruct.getLOT_NO());
				issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
				issueStruct.setRCV_ISSUE_QTY(useLotQty.toString());
				
				if ("1".equals(insertType)) {			// 入庫の場合
					lestQty[j] = Calculate.add(issueQty.toString(), useLotQty.negate().toString());
					useQty[j] = Calculate.add(spentQty.toString(), useLotQty.toString());
				}
				
				// ロット別品目在庫検索
				tempList = entity.mT_LOT_STOCK.read(conn,issueStruct);

				// 更新前の在庫数設定
				if (tempList.isEmpty()) {
					issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
				} else {
					tempStruct = (AD0090010Struct) tempList.get(0);
					issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
				}

				//[保管区別入出庫]の追加
				if ("2".equals(insertType)) {		// 出庫の場合
					updFlg = InsertRecvIssue("2",issueStruct);
				} else if ("1".equals(insertType)) {			// 入庫の場合
					updFlg = InsertRecvIssue("1",issueStruct);
				} else if ("3".equals(insertType)) {			// 不良入庫の場合
					updFlg = InsertRecvIssue("3",issueStruct);
					// 不良品出庫処理呼び出し
					IssueProcess IProc = new IssueProcess(conn, this.issueStruct.getRCV_ISSUE_CTRL_CD());
					boolean bResult = IProc.execDefectProcess();
					if (!bResult) {
						//出庫処理失敗 サーバーエラー
						updFlg = 9;
						break;
					}
				}
				if (updFlg != 0) {
					break;
				}

				// ロット別品目在庫更新
				BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
				List updateLotStockList = null;
				if ("2".equals(insertType) || "1".equals(insertType)) {		// 出庫或る入庫の場合
					 updateLotStockList = bc.excUpdateLotStockFd(this.issueStruct.getRCV_ISSUE_CTRL_CD(), "");
					// 異常終了の場合
					if (bc.getResultStatus().intValue() == 3) {
						// エラーメッセージ取得
						if (updateLotStockList != null&& updateLotStockList.size() > 0) {
							setErrorMessage((String) updateLotStockList.get(0));
						}
						updFlg = 9;
						break;
					}
				}

				//使用残数減算
				remainQty = remainQty.subtract(new BigDecimal(useLotQty.toString()));

			}
			//ロット管理フラグ = 1(ロット管理を行う)でない場合
	    	return updFlg;
	    }
	    /**
	     * 保管区別入出庫の登録処理
	     * @param	int         	 登録フラグ
	     * @param	AD0090010Struct 出庫指示データ
	     * @return  int             実行結果
		 * @throws SQLException 
	     * @throws FoundationException 
	     * @throws BatchAppException 
	     * */
	    private int InsertRecvIssue(String insertType,AD0090010Struct issueStruct) throws FoundationException, SQLException {
	    	int updFlg = 0;
	    	Numbering collectNum = new Numbering(conn,
					CollectNumber.ISSUE_CD,
					sysUSER_CD,
					this.sp.getProcId(),
					sysPLANT_CD);
	    	String no = null;
	    	
	    	AD0090010Struct tempIssueStruct = new AD0090010Struct();
			// 入出庫管理番号採番
			 no = collectNum.getNo();
			if (no == null || no.length() == 0) {
				//採番結果がない
				setErrorMessage("ZZ01106");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
				updFlg = 9;
				return updFlg;
			}
			// 入出庫管理番号
			tempIssueStruct.setRCV_ISSUE_CTRL_CD(no);
			this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
			//品目番号
			tempIssueStruct.setITEM_CD(issueStruct.getITEM_CD());
			//製番
			tempIssueStruct.setJOB_ODR_CD(issueStruct.getJOB_ODR_CD());
			//製番枝番
			tempIssueStruct.setJOB_ODR_DETAIL_NO("0");
			//受入回数
			tempIssueStruct.setACPT_NO("0");
			//作業計画番号
			tempIssueStruct.setWORK_ODR_CD(selectStruct.getWORK_ODR_CD());
			//仕掛作業コード
			tempIssueStruct.setWORK_IN_PROC_CD(selectStruct.getWORK_IN_PROC_CD());
			//分作回数
			tempIssueStruct.setPARTIAL_PRD_NO(struct.getPARTIAL_PRD_NO());
			//作業実績訂正回数
			tempIssueStruct.setOPR_RSLT_CRCT_NO("0");
			//入出庫年月日
			tempIssueStruct.setRCV_ISSUE_DATE(struct.getOPR_DATE());
			//入出庫端数
			tempIssueStruct.setRCV_ISSUE_ODD_QTY("0");
			//在庫更新区分
			tempIssueStruct.setSTOCK_UPD_TYP("2");
			//オーダデマンド番号
			tempIssueStruct.setOD_NO(selectStruct.getOD_NO());
			//工場コード
			tempIssueStruct.setPLANT_CD(selectStruct.getPLANT_CD());
			
			tempIssueStruct.setUSER_CD(sysUSER_CD);
			tempIssueStruct.setUPDATED_PRG_NM(this.sp.getProcId());
			
			// ロット管理を行うの場合
			if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
				//在庫ロット番号
				tempIssueStruct.setLOT_NO(issueStruct.getUSE_LOT_NO());
			} else {
				//在庫ロット番号
				tempIssueStruct.setLOT_NO("");
			}
			
			if ("2".equals(insertType)) {					// 出庫の場合
				//入出庫区分
				tempIssueStruct.setRCV_ISSUE_TYP("2");
				//保管区コード
				tempIssueStruct.setWH_CD(issueStruct.getWH_CD());
				//出庫指示番号
				tempIssueStruct.seth_ISSUE_INST_CD(issueStruct.geth_ISSUE_INST_CD());
				//入出庫前在庫数
				tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
				// ロット管理を行うの場合
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					//入出庫数
					tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getRCV_ISSUE_QTY(), "-1"));
				} else {
					//入出庫数
					tempIssueStruct.setRCV_ISSUE_QTY(Calculate.multiply(issueStruct.getTEMP_USE_QTY(), "-1"));
				}
				
				//入出庫発生区分
				tempIssueStruct.setRCV_ISSUE_GNR_TYP("41");
				//入出庫完了フラグ
				tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
	    	} else if ("1".equals(insertType)) {			// 入庫の場合
	    		//入出庫区分
				tempIssueStruct.setRCV_ISSUE_TYP("1");
				//保管区コード
				tempIssueStruct.setWH_CD(struct.getWH_CD());
				//出庫指示番号
				tempIssueStruct.setISSUE_INST_CD(null);
				//入出庫前在庫数
				tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
				//入出庫数
				// ロット管理を行うの場合
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					//入出庫数
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
				} else {
					//入出庫数
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getUSE_ACPT_QTY());
				}
				
				//入出庫発生区分
				tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
				//入出庫完了フラグ
				if (this.struct.getchk_COMPLETE() != null 
						&& "true".equals(this.struct.getchk_COMPLETE())) {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
	    	} else if ("3".equals(insertType)) {			// 不良入庫の場合
	    		//入出庫区分
				tempIssueStruct.setRCV_ISSUE_TYP("3");
				//保管区コード
				tempIssueStruct.setWH_CD(struct.getWH_CD());
				//出庫指示番号
				tempIssueStruct.setISSUE_INST_CD(null);
				//入出庫前在庫数
				tempIssueStruct.setSAVE_STOCK_ON_HAND_QTY(issueStruct.getSAVE_STOCK_ON_HAND_QTY());
				//入出庫数
				// ロット管理を行うの場合
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					//入出庫数
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getRCV_ISSUE_QTY());
				} else {
					//入出庫数
					tempIssueStruct.setRCV_ISSUE_QTY(issueStruct.getUSE_DEFECT_QTY());
				}
				
				//入出庫発生区分
				tempIssueStruct.setRCV_ISSUE_GNR_TYP("61");
				//入出庫完了フラグ
				if (this.struct.getchk_COMPLETE() != null 
						&& "true".equals(this.struct.getchk_COMPLETE())) {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					tempIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
	    	}

			//保管区別入出庫登録
			setStandardItem(tempIssueStruct);
			tempIssueStruct.setCOMPANY_CD(_company_cd);
			entity.mInsertRecvIssue.create(conn, tempIssueStruct);
	    	return updFlg;
	    }
		// Add End 20140219 huang-lh
	
	/** 帳票ファイル **/
	private String _downloadFile = null;
	private String _printFlg = "0";
	private String _outputFlg = "1";
	private String _initOutputFlg = "1";
	private String _initProduct_Typ = "";

	/** 印刷フラグ取得 **/
	public String getPrintFlg() { return _printFlg; };
	/** 印刷有効フラグ取得 **/
	public String getOutputFlg() { return _outputFlg; };

	/** 業務日付 */
	private String _oprDate = null;

	/** 業務日付 */
	private String _oprTime = null;
	/** 時間管理フラグ */
	private String tempTimeCtrl = null;
	
	/** 作業指示番号 */
	private String _keepOprInstCd = null;
	/** 分作回数 */
	private String _keepPartialPrdNo = null;
	/** 良品数合計*/
	private String SumAcptQty = null;
	/** 不良数の合計*/
	private String SumDefectQty = null; 
	/** 作業日*/
	private String OprDate = null;
	/** ロット管理導入済チェック **/
	private boolean lotCtrlFlg = false;
		
	/** 最終工程かどうか判断するためのフラグ */
	private boolean _lastProc = true;
	/** 最終工程を取得**/
	public boolean getLastProc(){
		return _lastProc;
	}
	
	/** 実績更新処理タイプ 0:登録 1:更新 */
	public int _rsltExeType = 0;
	/** 保管区別入出庫更新処理タイプ 0:登録 1:更新 */
	public int _issueExeType = 0;
	/** 作業実績検索後件数 0:なし 1:あり */
	public int _rsltListflg = 0;
	
	/** [コンボボックスデータ]情報（作業時間単位区分） */
	private ComboStruct _oprTimeUnitTtpStruct = new ComboStruct();
	
	/** [コンボボックスデータ]情報（不良理由） */
	private ComboStruct DEFECT_CAUSE_CD = new ComboStruct();
	
	/** システムログメッセージ作成用 */
	private StringBuffer _sysLogMessage;

	/** 実績一覧 */
	private List rsltList = new ArrayList();
	/** 出庫一覧 */
	private List issueList = new ArrayList();
	/** 不良理由コード*/
	private List defectViewList = new ArrayList(0);
	/** Main Struct */
	private AD0090010Struct selectStruct = new AD0090010Struct();
	/** 作業不良更新対象Struct */
	private AD0090010Struct defectStruct = new AD0090010Struct();
	/** 保管区別入出庫更新対象Struct */
	private AD0090010Struct issueStruct = new AD0090010Struct();
	/** 作業数集計Struct */
	private AD0090010Struct QtyStruct = new AD0090010Struct();
	
	//PDF用アクセサメソッド
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
		
	/**
	 * Main SelectStructの取得
	 * @return Main SelectStruct
	 */
	public AD0090010Struct getSelectStruct() {
		return this.selectStruct;
	}
	
	/**
	 * Orteus標準Structの値を対象Structにコピーします。
	 * @param target コピー対象となるStruct
	 */
	public void setStandardItem(AD0090010Struct target){

		target.setsUser_ID(struct.getsUser_ID());
		target.setsSysdate(struct.getsSysdate());
		target.setsOraganization_CD(struct.getsOrganization_CD());
		target.setTIME_CTRL(struct.getTIME_CTRL());
	}

	/**
	 * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setInformationMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addInfo(emsg);
	}
	
	private void setInformationMessage(String code,String value1,String value2){
		ExpjMessage emsg = new ExpjMessage(code,value1,value2);
		msgStruct.addInfo(emsg);
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 */
	private void setWarningMessage(String code) {
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setWarningMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 * @param value2 置換文字列２
	 */
	private void setWarningMessage(String code, String value1, String value2) {
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addWarn(emsg);
		sysLog.info(emsg, getsysUSER_CD());
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
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param code メッセージコード
	 * @param value1 置換文字列１
	 */
	private void setErrorMessage(String code, String value1) {
		ExpjMessage emsg = new ExpjMessage(code, value1);
		msgStruct.addError(emsg);
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setSupportMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg = new ExpjMessage("ZZ01006", _sysLogMessage.toString());
		msgStruct.addError(emsg);
	}
	/**
	 * 業務ロジックのシステムログ(致命的エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setSeverSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.severe(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのシステムログ(エラー)設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setWarningSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.warning(emsg, getsysUSER_CD());
	}
	/**
	 * 業務ロジックのシステムログ（ワーニング）設定処理を切り出して関数化
	 * @param db1 データベース項目１
	 * @param value1 置換文字列１
	 */
	private void setInfoSysLogMessage(String db1, String value1) {
		_sysLogMessage = new StringBuffer();
		_sysLogMessage.append(db1);
		_sysLogMessage.append(":");
		_sysLogMessage.append(value1);
		ExpjMessage emsg 
				= new ExpjMessage("ZZ01006",_sysLogMessage.toString());
		sysLog.info(emsg, getsysUSER_CD());
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
	/**msgStruct退避用*/
	private void getsaveStruct() {
		saveStruct = new MessageStruct(getsysUSER_CD(), false);
		for (int i = 0; i < msgStruct.sizeError(); i++) {
			saveStruct.getError().add(msgStruct.getError().get(i));
		}
		for (int i = 0; i < msgStruct.sizeWarn(); i++) {
			saveStruct.getWarn().add(msgStruct.getWarn().get(i));
		}
		for (int i = 0; i < msgStruct.sizeInfo(); i++) {
			saveStruct.getInfo().add(msgStruct.getInfo().get(i));
		}
		
	}
	/** リストのクリア */
	private void listClear() {

		if(this.list != null && this.list.size() > 0){
			this.list.clear();
		}else{
			list = new ArrayList();
		}

		for (int i = 0; i < DISPLAY_NUMBER; i++) {
			AD0090010Struct viewStruct = new AD0090010Struct();
			viewStruct.setl_DEFECT_QTY("0");
			this.list.add(viewStruct);
		}
		//実績一覧
		if(this.rsltList != null && this.rsltList.size() > 0){
			this.rsltList.clear();
		}
		//出庫一覧
		if(this.issueList != null && this.issueList.size() > 0){
			this.issueList.clear();
		}
	}
	
	/** structのクリア */
	private void structClear() {
		
		if (this.struct != null) {
			this.struct.clear();
		}
		//Main Select Struct
		if (this.selectStruct != null) {
			this.selectStruct.clear();
		}
		//保管区別入出庫更新対象Struct
		if (this.issueStruct != null) {
			this.issueStruct.clear();
		}
		//作業不良更新対象Struct
		if (this.defectStruct != null) {
			this.defectStruct.clear();
		}
	}
	
	/**
	 * メイン画面項目の初期値をセットする
	 */
	public void mainInitialize() {
		//初期値の設定
		this.struct.setOPR_INST_QTY("0.0");//作業指示数
		this.struct.setSUM_ACPT_QTY("0.0");//良品数累計
		this.struct.setSUM_DEFECT_QTY("0.0");//不良品累計
		this.selectStruct.setUNIT_QTY_TYP(Kind.NUMBER);//計量単位
		this.struct.setUNIT_QTY_TYP(Kind.NUMBER);//計量単位
	}

	/**
	 * システムパラメータ
	 * @return 
	 */
	private void GetTimeCtrl() throws BusinessProcessException, FoundationException {
		try{
			// システムパラメータ（TIME_CTRL）取得
			PrivateConfig pc = new PrivateConfig(conn);
			tempTimeCtrl = pc.getString("TIME_CTRL");
			if("true".equals(tempTimeCtrl)){
				struct.setTIME_CTRL("true");
			}else{
				struct.setTIME_CTRL("false");
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
	}
	
	/**
	 * 業務運用日を取得します。
	 * @throws FoundationException
	 * @throws SQLException
	 */
	private void setBussinessOprDate() 
			throws FoundationException, SQLException {
		this.struct.setPLANT_CD(this.sysPLANT_CD);
		
		_oprDate = DateCtrl.getBusinessOprDate(conn,this.sysPLANT_CD);
		if(null == _oprDate || "".equals(_oprDate)){
			//業務日付の取得に失敗しました。
			setErrorMessage("KR00017");
			setReadStatus(ERROR);
			setWarningSysLogMessage("SYS_DATE_CTRL.PLANT_CD", getsysPLANT_CD());
			return;
		}
		
		struct.seth_BUSINESS_OPR_DATE(_oprDate);
		_oprTime = "0000";		
	}
	
	//現品票出力チェックボックス制御処理
	private void setIdentCard() throws FoundationException, SQLException{

		PrivateConfig pc = new PrivateConfig(conn);
		String tempIDENT_CARD = pc.getString("IDENT_CARD");
		
		if(!"1".equals(tempIDENT_CARD)){
			_initOutputFlg = "0";
			_outputFlg = "0";
			struct.setchk_OUTPUT("false");
		}

		_initProduct_Typ = pc.getString("PRODUCT_TYP");
	}
	/**
	 * システムパラメータ取得
	 */
	private boolean getSysParameter() throws BusinessProcessException, FoundationException {
		boolean b = true;
		try {
			List sysParameterList = entity.mSELECT_SYS_PARAMETER.read(conn, struct);
			if(sysParameterList == null || sysParameterList.isEmpty()) return b;
			AD0090010Struct sysParameterStruct = (AD0090010Struct) sysParameterList.get(0);
			if(null != sysParameterStruct.getPAST_RESULT_ENTRY_TYP() && !"".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
				if("false".equals(sysParameterStruct.getPAST_RESULT_ENTRY_TYP())){
					b = false;
				}
			}
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return b;
	}
	
	/**
	 * 実際原価管理パラメータの対象年月日取得
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AD0090010Struct procExecDateStruct = (AD0090010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	/**
	 * 比較
	 * @param  bd1      入力引数1
	 * @param  bd2 　   入力引数2
	 * @return boolean  チェック返す値
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
		}
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
	
	/**
	 * 不良理由コードを再設定
	 */
	private void setDefect(){
		
		defectViewList.clear();
		List defectCauseCdListNew = struct.getList_l_DEFECT_CAUSE_CD();
		List defectInspcQtyListNew = struct.getList_l_DEFECT_QTY();
		List defectCommentListNew = struct.getList_l_DEFECT_COMMENT();
		String defectCauseCd;
		String defectInspcQty;
		String defectComment;
		for (int i = 0; i < defectCauseCdListNew.size(); i++) {
			defectCauseCd = (String) defectCauseCdListNew.get(i);
			defectInspcQty = (String) defectInspcQtyListNew.get(i);
			defectComment = (String) defectCommentListNew.get(i);
			AD0090010Struct defectStruct = new AD0090010Struct();
			defectStruct.setl_DEFECT_CAUSE_CD(defectCauseCd);
			defectStruct.setl_DEFECT_QTY(defectInspcQty);
			defectStruct.setl_DEFECT_COMMENT(defectComment);
			defectViewList.add(defectStruct);
		}
		this.list = defectViewList;
	}
	
	/**
	 * structを保存
	 *
	 */
	private void structSave(){
		//詳細ウィンドウに、データを保留
		struct.setDRAW_CD(selectStruct.getDRAW_CD());
		struct.setSPEC(selectStruct.getSPEC());
		struct.setMRP_ODR_TYP_DN(selectStruct.getMRP_ODR_TYP_DN());
		struct.setJOB_ODR_CD(selectStruct.getJOB_ODR_CD());
		struct.setWS_CD(selectStruct.getWS_CD());
		struct.setWS_NAME(selectStruct.getWS_NAME());
		struct.setWORK_ODR_DLV_DATE(selectStruct.getWORK_ODR_DLV_DATE());
		struct.setOPR_INST_START_DATE(selectStruct.getOPR_INST_START_DATE());
	}
	/**
	 * 出庫指示リストを設定します。
	 * @throws FoundationException
	 * @throws SQLException
	 * @throws ExpjException 
	 */
	private void setIssueList() 
			throws FoundationException, SQLException, ExpjException {

		try{
			this.issueList = entity.mSelectIssue.read(conn,this.selectStruct);
			
			//String partialNo = this.struct.getPARTIAL_PRD_NO();
			BigDecimal acptQty = new BigDecimal(this.struct.getACPT_QTY());
			BigDecimal defectQty = new BigDecimal(this.struct.getDEFECT_QTY());

			for (int i = 0; i < this.issueList.size(); i++) {

				BigDecimal planSum = acptQty.add(defectQty);
				AD0090010Struct tempIssueStruct = (AD0090010Struct) this.issueList.get(i);

				// 計画使用数量の取得
				int round = Integer.parseInt(tempIssueStruct.getUNIT_QTY_TYP());
				BigDecimal denominator = new BigDecimal(tempIssueStruct.geth_ISSUE_INST_UNIT_DENOMINATOR());
				BigDecimal numerator = new BigDecimal(tempIssueStruct.geth_ISSUE_INST_UNIT_NUMERATOR());

				// 作業実績数 * 構成数を計画使用数量に設定
				if (round == 1) {
					planSum = planSum.multiply(numerator).divide(denominator, 0, BigDecimal.ROUND_UP).setScale(1);
				} else {
					planSum = planSum.multiply(numerator).divide(denominator, 4, BigDecimal.ROUND_UP);

					// 小数の表示スケール処理
					/*BigDecimal intVal = new BigDecimal(""+ planSum.intValue());
					BigDecimal decimalVal = planSum.subtract(intVal).multiply(new BigDecimal(10000));
					int decVal = decimalVal.intValue();
					int roundCount = 1;
					while (true) {
						decVal = decVal / 10;
						if (decVal == 0) {
							break;
						}
						roundCount++;
					}

					planSum = planSum.setScale(roundCount,BigDecimal.ROUND_UP);*/
				}
				
				tempIssueStruct.setTEMP_PLAN_QTY(planSum.toString());

				// 使用済数量、計画外使用済数量、更新使用数量の取得
				tempIssueStruct.setTEMP_USEOVER_QTY("0.0");
				tempIssueStruct.setTEMP_PLANOUT_QTY("0.0");
				tempIssueStruct.setTEMP_USE_QTY(planSum.toString());		
			}
		}catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_ISSUE_INST.WORK_ODR_CD",selectStruct.getWORK_ODR_CD());//作業計画番号
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_ISSUE_INST.WORK_ODR_CD",selectStruct.getWORK_ODR_CD());//作業計画番号
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_ISSUE_INST.WORK_ODR_CD",selectStruct.getWORK_ODR_CD());//作業計画番号
			throw new ExpjException(e, emsg);
		} finally {
			try {				
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}

	}
	
	// 子品目実績更新
	private void ChildRsltUpdate() throws BusinessProcessException, FoundationException
	{
	
		try{
			
			List tempList = new ArrayList();
			AD0090010Struct tempStruct = new AD0090010Struct();
						
			boolean isSuccess = true;
			errCount = 0;
			norCount = 0;
			for (int i = 0; i < this.issueList.size(); i++ ) {

				isSuccess = true;
				conn.beginTransWeb();
				
				this.issueStruct = new AD0090010Struct();
				this.issueStruct = (AD0090010Struct)this.issueList.get(i);
				setStandardItem(issueStruct);
				this.issueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
				// this.issueStruct.setJOB_ODR_CD(this.selectStruct.getJOB_ODR_CD());
				// 子品目の品目手配区分より、製番を設定
				if("1".equals(issueStruct.getMRP_ODR_TYP()) || "2".equals(issueStruct.getMRP_ODR_TYP())) {
					issueStruct.setJOB_ODR_CD(selectStruct.getJOB_ODR_CD());
				} else {
					issueStruct.setJOB_ODR_CD("");
				}
				
				if (this.issueStruct.getTEMP_USE_QTY() == null
						|| Double.parseDouble(this.issueStruct.getTEMP_USE_QTY()) == 0) {
					norCount = norCount + 1;
					isSuccess = false;
					continue;
				}

				// Add Start 20140219 huang-lh
				// 取得された項目「使用元保管区」を再設定する
				if ("1".equals(_processManageFlg)) {
					// 工程保管場所の在庫を管理するとき
					tempList = entity.mCheckFirstWork.read(conn, this.selectStruct);
					if (null != tempList && tempList.size() > 0) {
						tempStruct = (AD0090010Struct)tempList.get(0);
					}
		    		// 最初工程かどうか判断する
		    		if (!tempStruct.getFIRST_OPR_INST_CD().equals(this.selectStruct.getIN_OPR_INST_CD())) {
		    			// 最初工程でない場合
		    			issueStruct.setFIRST_WORK_FLG("0");
		    			
		    			// 前工程情報を取得する
		    			tempList = entity.mSelectPrevWorkInfo.read(conn, this.selectStruct);
		    			if (null != tempList && tempList.size() > 0) {
	    					tempStruct = (AD0090010Struct)tempList.get(0);
	    				}
		    			// 前工程があるの場合：前工程の作業実績で登録した保管区コード
		    			issueStruct.setWH_CD(tempStruct.getPREV_WH_CD());
		    		}
				}
    			// Add End 20140219 huang-lh
				
				//保管区コードのNULLチェック
				if (this.issueStruct.getWH_CD() == null 
						|| "".equals(this.issueStruct.getWH_CD())) {
					errCount = errCount + 1;
					setErrorMessage("AD00215");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					isSuccess = false;
					continue;
				}

				//保管区コードチェック
				tempList = entity.mSelectChkWhCd.read(conn,this.issueStruct);
				if(tempList == null || tempList.size() == 0){
					errCount = errCount + 1;
  					setErrorMessage("AD00216");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					setWarningSysLogMessage("M_WH.WH_CD",this.issueStruct.getWH_CD());//保管区.保管区コード
					isSuccess = false;
					continue;
				}

				tempStruct = (AD0090010Struct)tempList.get(0);
				this.issueStruct.setWH_NAME(tempStruct.getWH_NAME());
				//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.selectStruct.getPLANT_CD())) {
					errCount = errCount + 1;
					setErrorMessage("AD00217");
					setSupportMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());
					setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD", this.issueStruct.getITEM_CD());//出庫指示.品目番号
					setWarningSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", this.issueStruct.geth_ISSUE_INST_CD());//出庫指示.出庫指示番号
					setWarningSysLogMessage("M_WH.WH_CD", this.issueStruct.getWH_CD());//保管区.保管区コード
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					isSuccess = false;
					continue;
				}
				
				CollectNumber collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//採番結果がない
					setErrorMessage("ZZ01106");
					errCount = errCount + 1;
					isSuccess = false;
					continue;
				}
	
				BigDecimal keepUseQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
	
				//BigDecimal planQty = new BigDecimal(this.issueStruct.getTEMP_PLAN_QTY());
				BigDecimal useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				if (this.issueStruct.getUNIT_QTY_TYP() != null
						&& "1".equals(this.issueStruct.getUNIT_QTY_TYP())) {
					//品目が整数管理品の場合、切上げを行う
					useQty = useQty.setScale(0,BigDecimal.ROUND_UP);
				}
				//修正内容を保持
				this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
				this.issueStruct.setPLANT_CD(this.sysPLANT_CD);
				this.issueStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
				this.issueStruct.setWORK_IN_PROC_CD(this.selectStruct.getWORK_IN_PROC_CD());
				this.issueStruct.setRCV_ISSUE_QTY(useQty.negate().toString());
				if (useQty.doubleValue() > 0) {
					//工程在庫出庫
					this.issueStruct.setRCV_ISSUE_GNR_TYP("41");
				} else {
					//工程在庫出庫取消
					this.issueStruct.setRCV_ISSUE_GNR_TYP("49");
				}

				this.issueStruct.setRCV_ISSUE_ODD_QTY(useQty.subtract(keepUseQty).toString());
				this.issueStruct.setOD_NO(this.selectStruct.getOD_NO());
				this.issueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				this.issueStruct.setSTOCK_UPD_TYP("2");
				this.issueStruct.setRCV_ISSUE_TYP("2");
	
				// 退避用手持ち在庫数を初期化
				issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
	
				useQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());
				BigDecimal stockQty = null;
				//工程仕掛在庫出庫処理
				if(this.issueStruct.getJOB_ODR_CD() == null 
						|| this.issueStruct.getJOB_ODR_CD().length() == 0){
					//保管区別品目在庫更新
					tempList = entity.mSelectItemStock.read(conn,this.issueStruct);
					AD0090010Struct stockStruct = new AD0090010Struct();
					stockStruct.setStructM(this.issueStruct);
					setStandardItem(stockStruct);

					if (tempList.isEmpty()) {
						//登録
						useQty = useQty.negate();
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mInsertItemStock.create(conn, stockStruct);
					} else {
						//更新
						tempStruct = (AD0090010Struct)tempList.get(0);
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
						if (useQty.doubleValue() > 0) { //出庫
							useQty = stockQty.subtract(useQty) ;
						} else { //入庫
							useQty = stockQty.add(useQty.negate()) ;
						}
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mUpdateItemStock.update(conn, stockStruct);
					}
				} else {
					//製番仕掛在庫更新
					tempList = entity.mSelectOdrStock.read(conn,this.issueStruct);
					AD0090010Struct stockStruct = new AD0090010Struct();	
					stockStruct.setStructM(this.issueStruct);
					setStandardItem(stockStruct);
	
					if (tempList.isEmpty()) {
						//登録
						useQty = useQty.negate();
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mInsertOdrStock.create(conn,stockStruct);
					} else {
						//更新
						tempStruct = (AD0090010Struct)tempList.get(0);
						stockStruct.setJOB_ODR_DETAIL_NO(tempStruct.getJOB_ODR_DETAIL_NO());
						issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						stockQty = new BigDecimal(tempStruct.getSTOCK_ON_HAND_QTY());
						if (useQty.doubleValue() > 0) { 
							//出庫
							useQty = stockQty.subtract(useQty) ;
						} else {
							//入庫
							useQty = stockQty.add(useQty.negate()) ;
						}
						stockStruct.setSTOCK_ON_HAND_QTY(useQty.toString());
						entity.mUpdateOdrStock.update(conn,stockStruct);
					}
				}
				
				this.issueStruct.setOPR_RSLT_CRCT_NO("0");  //作業実績訂正回数
				this.issueStruct.setRCV_ISSUE_DATE(struct.getOPR_DATE());//作業日
				//会社コード
				this.issueStruct.setCOMPANY_CD(_company_cd);
				// ロット管理フラグ = 1(ロット管理を行う)の場合
				if ("1".equals(issueStruct.getLOT_CTRL_FLG())) {
					// 出庫実績明細取得
					List lotIssueList = entity.mT_LOT_ISSUE_INST.read(conn,this.issueStruct);

					// データがない場合
					if (lotIssueList == null || lotIssueList.size() == 0) {
						errCount = errCount + 1;
						setErrorMessage("AD20135");
						setSupportMessage("T_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
								this.issueStruct.geth_ISSUE_INST_CD());// 出庫指示番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());// 品目番号
						setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",this.issueStruct.getWORK_ODR_CD());	// 作業計画番号
						isSuccess = false;
						continue;
					}

					// 使用残数設定
					BigDecimal remainQty = new BigDecimal(this.issueStruct.getTEMP_USE_QTY());

					AD0090010Struct lotUseStruct = new AD0090010Struct();
					lotUseStruct.setStructM(this.issueStruct);
					setStandardItem(lotUseStruct);

					for (int j = 0; j < lotIssueList.size(); j++) {
						AD0090010Struct lotIssueStruct = (AD0090010Struct) lotIssueList.get(j);

						// 引き当て可能数設定
						BigDecimal issueQty = new BigDecimal(lotIssueStruct.getISSUE_QTY());
						BigDecimal spentQty = new BigDecimal(lotIssueStruct.getSPENT_QTY());
						BigDecimal availQty = issueQty.subtract(spentQty);

						// ロット別使用実績管理番号採番
						List seqList = entity.mSEQ_JF_RSLT.read(conn, struct);
						if (seqList != null && seqList.size() > 0) {
							lotUseStruct.setRSLT_CTL_SEQ_NO(((AD0090010Struct) seqList.get(0)).getNEXTVAL());
						}

						// ロット番号設定
						lotUseStruct.setLOT_NO(lotIssueStruct.getLOT_NO());

						BigDecimal useLotQty = null;

						// 引き当て可能数 >= 使用残数の場合
						if (availQty.doubleValue() >= remainQty.doubleValue()) {
							// 使用残数を引き当て数に設定
							useLotQty = remainQty;
							// 引き当て可能数 < 使用残数の場合
						} else {
							// 最終データの場合
							if (j == lotIssueList.size() - 1) {
								// 使用残数を使用数に設定
								useLotQty = remainQty;
								// 最終データでない場合
							} else {
								// 引当可能数が0より大きい場合
								if (availQty.doubleValue() > 0) {
									// 使用残数を使用数に設定
									useLotQty = remainQty;

									// 次レコード以降を取得
									for (int k = j + 1; k < lotIssueList.size(); k++) {
										AD0090010Struct nextLotIssueStruct = (AD0090010Struct) lotIssueList.get(k);

										// 引き当て可能数設定
										BigDecimal nextIssueQty = new BigDecimal(nextLotIssueStruct.getISSUE_QTY());
										BigDecimal nextSpentQty = new BigDecimal(nextLotIssueStruct.getSPENT_QTY());
										BigDecimal nextAvailQty = nextIssueQty.subtract(nextSpentQty);

										// 次レコード以降に引当可能なデータがある場合
										if (nextAvailQty.doubleValue() > 0) {
											// 引き当て可能数を使用数に設定
											useLotQty = availQty;
											break;
										}
									}
									// 引当可能数が0以下の場合
								} else {
									// 次のデータを取得
									continue;
								}
							}
						}

						// 使用数が引当可能数より大きい場合
						if (useLotQty.doubleValue() > availQty.doubleValue()) {
							// メッセージ出力
							setWarningMessage("AD20136");
							setWarningSysLogMessage("T_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ISSUE_INST_CD",
									this.issueStruct.geth_ISSUE_INST_CD());// 出庫指示番号
							setWarningSysLogMessage("T_LOT_ISSUE_INST.ITEM_CD",this.issueStruct.getITEM_CD());
							// 品目番号
							setWarningSysLogMessage("T_LOT_ISSUE_INST.WORK_ODR_CD",this.issueStruct.getWORK_ODR_CD());
							// 作業計画番号
						}

						// 使用済数量、使用予定数量に上記で設定した使用数を設定
						lotUseStruct.setTOTAL_ISSUE_QTY(useLotQty.toString());
						lotUseStruct.setSUPPLIED_ISSUE_QTY(useLotQty.toString());

						// 実績日を使用日に設定
						lotUseStruct.setSUPPLIED_DATE(lotUseStruct.getOPR_DATE());

						// [ロット別使用実績]の追加
						entity.mT_LOT_USE_RSLT.create(conn, lotUseStruct);

						// [出庫実績明細]の更新
						lotUseStruct.setSPENT_QTY(spentQty.add(useLotQty).toString());
						entity.mT_LOT_ISSUE_INST.update(conn, lotUseStruct);

						this.issueStruct.setLOT_NO(lotIssueStruct.getLOT_NO());
						this.issueStruct.setRCV_ISSUE_QTY(useLotQty.negate().toString());

						// ロット別品目在庫検索
						tempList = entity.mT_LOT_STOCK.read(conn,this.issueStruct);

						// 更新前の在庫数設定
						if (tempList.isEmpty()) {
							issueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
						} else {
							tempStruct = (AD0090010Struct) tempList.get(0);
							issueStruct.setSAVE_STOCK_ON_HAND_QTY(tempStruct.getSTOCK_ON_HAND_QTY());
						}

						// 2件目以降のデータの場合
						if (j > 0) {
							// 入出庫管理番号採番
							collectNum = new CollectNumber(CollectNumber.ISSUE_CD, this.sysUSER_CD,this.sp.getProcId(), this.sysPLANT_CD);
							no = collectNum.getNo();
							if (no == null || no.length() == 0) {
								// 採番結果がない
								setErrorMessage("ZZ01106");
								isSuccess = false;
								break;
							}
							this.issueStruct.setRCV_ISSUE_CTRL_CD(no);
						}
						
						//[保管区別入出庫]の追加
						entity.mInsertRecvIssue.create(conn, this.issueStruct);

						// ロット別品目在庫更新
						BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
						List updateLotStockList = bc.excUpdateLotStockFd(no, "");

						// 異常終了の場合
						if (bc.getResultStatus().intValue() == 3) {
							// エラーメッセージ取得
							if (updateLotStockList != null&& updateLotStockList.size() > 0) {
								setErrorMessage((String) updateLotStockList.get(0));
							}
							isSuccess = false;
							break;
						}

						// 作業実績品目のロット管理フラグ = 1(ロット管理を行う)の場合
						if ("1".equals(selectStruct.getLOT_CTRL_FLG())) {
							if(!"".equals(struct.getLOT_NO())){
								//ロットトレース登録・更新処理
								List lotTraceList = bc.excMakeLotTraceFd(this.issueStruct.getITEM_CD(),
										this.issueStruct.getLOT_NO(),selectStruct.getITEM_CD(),
										struct.getLOT_NO(),"2");
								// 正常終了の場合
								if (bc.getResultStatus().intValue() == 1) {
									// ロットトレース登録・更新処理が成功場合、［ロットトレース］の更新を行う
					            	tempStruct = new AD0090010Struct();
					            	tempStruct.setFROM_ITEM_CD(issueStruct.getITEM_CD());
					            	tempStruct.setFROM_LOT_NO(issueStruct.getLOT_NO());
					            	tempStruct.setTO_ITEM_CD(selectStruct.getITEM_CD());
					            	tempStruct.setTO_LOT_NO(struct.getLOT_NO());
					            	tempStruct.setTO_PUCH_ODR_CD(null);
					            	tempStruct.setsUser_ID(getsysUSER_CD());
					            	
					            	//[受入実績]で発注番号を取得
					            	List formList = entity.mgetFROM_PUCH_ODR_CD.read(conn, tempStruct);
					            	if((formList != null && formList.size() > 0)){
					            		//発注番号をソート順（降順）にし、１件目のレコードを取得する。
					            		AD0090010Struct orderStruct = (AD0090010Struct) formList.get(0);
						            	//[ロットトレース].“元発注番号” = [受入実績]."発注番号"
						            	tempStruct.setFROM_PUCH_ODR_CD(orderStruct.getFROM_PUCH_ODR_CD());
					            	}else{
					            		tempStruct.setFROM_PUCH_ODR_CD(null);
					            	}
					            	// ［ロットトレース］の更新を行う
					            	entity.mupdateT_LOT_TRACE.update(conn, tempStruct);
								}
								
								// 異常終了の場合
								if (bc.getResultStatus().intValue() == 3) {
									// エラーメッセージ取得
									if (lotTraceList != null && lotTraceList.size() > 0) {
										setErrorMessage((String) lotTraceList.get(0));
										}
									isSuccess = false;
									break;
									}
								}
						}

						//使用残数減算
						remainQty = remainQty.subtract(new BigDecimal(lotUseStruct.getTOTAL_ISSUE_QTY()));

						//使用残数が0以下の場合ループ終了
						if (remainQty.doubleValue() <= 0) {
							break;
						}
					}
					//ロット管理フラグ = 1(ロット管理を行う)でない場合
				} else {
					//保管区別入出庫登録
					entity.mInsertRecvIssue.create(conn, this.issueStruct);
				}
				
				if(isSuccess){
					norCount = norCount + 1;					
				}
				
				if(isSuccess){
					conn.commit();				
				}else{
					conn.rollback();
				}
			}
	
		}catch (NumberFormatException e) {
			errCount = errCount + 1;
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			errCount = errCount + 1;
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			errCount = errCount + 1;
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {				
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
		
	}
	
	//[現品票]の出力
	private void IdentCardOutPut() throws BusinessProcessException, FoundationException
	{
		try{

			//印刷グループ番号の新規採番
			ManagementNumber mngNumber = new ManagementNumber();
			String strPrintGrpNo = mngNumber.getSequenceNo("SEQ_ICT");
			mngNumber = null;

			AD0090010Struct InsIdentCardTempStruct = new AD0090010Struct();

			InsIdentCardTempStruct.setTMP_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			InsIdentCardTempStruct.setTMP_PARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

			List list_temp = entity.mSelectIdentCardForPrint.read(conn, InsIdentCardTempStruct);

			AD0090010Struct IdentCardTempStruct = new AD0090010Struct();
			setStandardItem(IdentCardTempStruct);

			//現品票の検索結果のチェック
			if (list_temp.isEmpty()){
				setErrorMessage("ZZ11001");
				return;
			}else{
				//現品票の検索結果を格納する
				InsIdentCardTempStruct = (AD0090010Struct) list_temp.get(0);
				setStandardItem(InsIdentCardTempStruct);
				IdentCardTempStruct.setINS_PRINT_GRP_NO(strPrintGrpNo);
				IdentCardTempStruct.setINS_IDENT_CARD_CTL_NO(InsIdentCardTempStruct.getTMP_IDENT_CARD_CTL_NO());
				IdentCardTempStruct.setINS_OPR_INST_CD(InsIdentCardTempStruct.getTMP_OPR_INST_CD());
				IdentCardTempStruct.setINS_PARTIAL_PRD_NO(InsIdentCardTempStruct.getTMP_PARTIAL_PRD_NO());
				IdentCardTempStruct.setINS_RCV_ISSUE_CTRL_CD(InsIdentCardTempStruct.getTMP_RCV_ISSUE_CTRL_CD());
				IdentCardTempStruct.setINS_ITEM_CD(InsIdentCardTempStruct.getTMP_ITEM_CD());
				IdentCardTempStruct.setINS_JOB_ODR_CD(InsIdentCardTempStruct.getTMP_JOB_ODR_CD());
				IdentCardTempStruct.setINS_FIRST_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_FIRST_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_IDENT_CARD_QTY(InsIdentCardTempStruct.getTMP_IDENT_CARD_QTY());
				IdentCardTempStruct.setINS_OPR_DATE(InsIdentCardTempStruct.getTMP_OPR_DATE());
				IdentCardTempStruct.setINS_PKG_UNIT_QTY(InsIdentCardTempStruct.getTMP_PKG_UNIT_QTY());
				IdentCardTempStruct.setINS_PLANT_CD(InsIdentCardTempStruct.getTMP_PLANT_CD());
				IdentCardTempStruct.setINS_WS_CD(InsIdentCardTempStruct.getTMP_WS_CD());
				IdentCardTempStruct.setLOT_NO(InsIdentCardTempStruct.getLOT_NO());
			}

            //現品票数量÷荷姿単位数量の商を求める
			String pageno = Calculate.divide(IdentCardTempStruct.getINS_IDENT_CARD_QTY(), IdentCardTempStruct.getINS_PKG_UNIT_QTY(), 0, Calculate.FLOOR);

			double bunshi = Double.parseDouble(IdentCardTempStruct.getINS_IDENT_CARD_QTY());
			double bunbo = Double.parseDouble(IdentCardTempStruct.getINS_PKG_UNIT_QTY());
			double overno;

			//現品票数量÷荷姿単位数量の余りを求める
			overno = bunshi % bunbo;

			//総ページ数の算出
			if (0 < overno){
				//余りがある場合、１を加算
				pageno = Calculate.add(pageno, "1");
			}

			//総ページ数分ループする
			for(long i=1;i<=Long.parseLong(pageno) ;i++)
			{
				//最終ページでかつ、余りがある場合
				if (i == Long.parseLong(pageno) && 0 < overno){
					//余りを荷姿単位数量に設定
					IdentCardTempStruct.setINS_PKG_UNIT_QTY(Double.toString(overno));
				}

				IdentCardTempStruct.setINS_PAGE_NO(Long.toString(i));

				// 現品票TEMPの登録
				entity.mInsertIdentCardTemp.create(conn,IdentCardTempStruct);
	    	} 

			//現品票出力
			controlPrint(strPrintGrpNo);

			//出力枚数を設定
			IdentCardTempStruct.setINS_PRINT_QTY(pageno);

			//現品票の更新
			entity.mUpdateIdentCard2.update(conn,IdentCardTempStruct);

			//現品票TEMPの削除
			entity.mDeleteIdentCardTemp.delete(conn,IdentCardTempStruct);
		
		}catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_IDENT_CARD.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
			setSeverSysLogMessage("T_IDENT_CARD.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_IDENT_CARD.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
			setSeverSysLogMessage("T_IDENT_CARD.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			setSeverSysLogMessage("T_IDENT_CARD.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
			setSeverSysLogMessage("T_IDENT_CARD.PARTIAL_PRD_NO", struct.getPARTIAL_PRD_NO());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
	}
	
	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint(String strPrintGrpNo) throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090011Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AD0090010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
		try {
			String printId1 = "AD00900101";		// TODO: 帳票IDを指定してください

			ret = svf.VrInit(printId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			queryFileName = svf.getQueryFileName();	// queryファイル名
		
			/* クエリーファイルの指定 */
			if(dbKIND != null && !"".equals(dbKIND)) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			/* クエリー抽出条件の指定 */

			ret = svf.VrCondition("[X|PRINT_GRP_NO]=" + Long.parseLong(strPrintGrpNo), 4);

			/* クエリー実行 */
			ret = svf.VrReport();
			if(ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}
			if (ret != 0){
				setErrorMessage("ZZ01108");
				return;
			}

			/* PDF作成終了 */
			ret = svf.VrQuit();

			//struct.setDOWNLOAD_FILE(getPdfFileName());
			_printFlg = "1";
			_downloadFile = getPdfFileName();
			_keepOprInstCd = this.struct.getIN_OPR_INST_CD();
			_keepPartialPrdNo = struct.getPARTIAL_PRD_NO();

		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AD0090011Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}
	
	/**
	 * 数値タイプ項目がnullの場合、0をセットします。
	 * @throws Exception
	 */
	private void zeroSet(AD0090010Struct targetStruct)
			throws Exception {
		//作業指示数がnullの場合、0セット
		if (targetStruct.getOPR_INST_QTY() == null 
				|| targetStruct.getOPR_INST_QTY().length() == 0) {
			targetStruct.setOPR_INST_QTY("0.0");
		}
		//良品数がnullの場合、0をセット
		if (targetStruct.getACPT_QTY() == null 
				|| targetStruct.getACPT_QTY().length() == 0) {
			targetStruct.setACPT_QTY("0.0");
		}
		//良品累計数がnullの場合、0をセット
		if (targetStruct.getSUM_ACPT_QTY() == null 
				|| targetStruct.getSUM_ACPT_QTY().length() == 0) {
			targetStruct.setSUM_ACPT_QTY("0.0");
		}
		//不良品数がnullの場合、0をセット
		if (targetStruct.getDEFECT_QTY() == null 
				|| targetStruct.getDEFECT_QTY().length() == 0) {
			targetStruct.setDEFECT_QTY("0.0");
		}
		//不良品累計数がnullの場合、0をセット
		if (targetStruct.getSUM_DEFECT_QTY() == null 
				|| targetStruct.getSUM_DEFECT_QTY().length() == 0) {
			targetStruct.setSUM_DEFECT_QTY("0.0");
		}
		//前段取り時間がnullの場合、0をセット
		if (targetStruct.getPRE_ARRANGEMENT_TIME() == null 
				|| targetStruct.getPRE_ARRANGEMENT_TIME().length() == 0) {
			targetStruct.setPRE_ARRANGEMENT_TIME("0.0");
		}
		//作業時間がnullの場合、0をセット
		if (targetStruct.getOPR_TIME() == null 
				|| targetStruct.getOPR_TIME().length() == 0) {
			targetStruct.setOPR_TIME("0.0");
		}
		//後段取り時間がnullの場合、0をセット
		if (targetStruct.getPOST_ARRANGEMENT_TIME() == null 
				|| targetStruct.getPOST_ARRANGEMENT_TIME().length() == 0) {
			targetStruct.setPOST_ARRANGEMENT_TIME("0.0");
		}
		//停止時間がnullの場合、0をセット
		if (targetStruct.getCESSATION_TIME() == null 
				|| targetStruct.getCESSATION_TIME().length() == 0) {
			targetStruct.setCESSATION_TIME("0.0");
		}
		//検査不良数が0の場合、0セット
		if (targetStruct.getl_DEFECT_QTY() == null
				|| targetStruct.getl_DEFECT_QTY().length() == 0){
			targetStruct.setl_DEFECT_QTY("0.0");
		}
		
	}
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 詳細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");
			//{{user_implement_dev:<controlDetail>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlDetail>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlDetail");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>

		try {
			
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
			
			_keepOprInstCd = struct.getIN_OPR_INST_CD();
			_outputFlg = _initOutputFlg;
			_lastProc = true;
			struct.setchk_CHILD_RSLTUPDATE("true");
			this.selectStruct.clear();
			this.listClear();
			this.struct.clear();
			
			//初期値の設定
			mainInitialize();
			this.struct.setIN_OPR_INST_CD(_keepOprInstCd);
			this.struct.setPARTIAL_PRD_NO(null);
			
			//作業指示伝票検索
			List tempList = entity.mSelectOprInstSlip.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD30587");
				setWarningSysLogMessage("T_OPR_INST_SLIP.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示伝票.作業指示番号
				setReadStatus(NOT_FOUND);
				return;
			}
			AD0090010Struct tempStruct = (AD0090010Struct)tempList.get(0);
			if (!this.sysPLANT_CD.equals(tempStruct.getPLANT_CD())) {
				setErrorMessage("AD00031");
				setWarningSysLogMessage("T_OPR_INST_SLIP.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示伝票.作業指示番号
				setWarningSysLogMessage("T_OPR_INST_SLIP.PLANT_CD", tempStruct.getPLANT_CD());//作業指示伝票.工場
				setReadStatus(ERROR);
				return;
			}			
			
			// Main Select		
			tempList = new ArrayList();
			tempList = entity.mSelect.read(conn, struct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(NOT_FOUND);
				return;
			}
			
			this.selectStruct = new AD0090010Struct();
			this.selectStruct = (AD0090010Struct)tempList.get(0);
		        this.selectStruct.setMRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",selectStruct.getMRP_ODR_TYP()));
			setStandardItem(selectStruct);
			
			//作業状態区分= 1：未指示 の場合
			if("1".equals(selectStruct.getWORK_STS_TYP())){
				setErrorMessage("AD30804");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業系列別仕掛.作業指示番号
				setReadStatus(ERROR);
				return;
			}
			
			//出来高の場合エラー
			if("1".equals(selectStruct.getOPR_RSLT_TYP())){
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業系列別仕掛.作業指示番号
				setReadStatus(ERROR);
				return;
			}
			
			
			
			//作業状態区分= 9：完了 の場合
			if("9".equals(selectStruct.getWORK_STS_TYP())){
				setWarningMessage("AD00090");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業系列別仕掛.作業指示番号
			}
			
			this.selectStruct.seth_FINAL_PROC_FLG(selectStruct.getFINAL_PROC_FLG());
			//作業日
			this.selectStruct.setOPR_DATE(_oprDate);
			//作業日(時刻)
			this.selectStruct.setOPRATION_TIME("0000");
			
			//良品数、不良数の合計
			SumAcptQty = "0";
			SumDefectQty = "0"; 
			for (int i = 0;i<tempList.size();i++) {
				this.QtyStruct = new AD0090010Struct();
				this.QtyStruct = (AD0090010Struct)tempList.get(i);
				SumAcptQty = Calculate.add(SumAcptQty, this.QtyStruct.getSUM_ACPT_QTY());
				SumDefectQty = Calculate.add(SumDefectQty, this.QtyStruct.getSUM_DEFECT_QTY());
				//作業日を判定、最大作業日を指定
				if (i == 0) {
					OprDate = this.QtyStruct.geth_OPR_DATE();
				} else {
					if (OprDate.compareTo(this.QtyStruct.geth_OPR_DATE())<0) {
						OprDate = this.QtyStruct.geth_OPR_DATE();
					}
				}
			}
            //良品数、不良数を画面にセット
			this.selectStruct.setSUM_ACPT_QTY(SumAcptQty);
			this.selectStruct.setSUM_DEFECT_QTY(SumDefectQty);
			//作業日を画面にセット
			this.selectStruct.seth_OPR_DATE(OprDate);
						
			//良品数の合計 + 不良数の合計
			String qty_Hj = Calculate.add(SumAcptQty, SumDefectQty);
			
			//良品数をセット (作業指示数 - (良品数の合計 + 不良数の合計))
			this.selectStruct.setACPT_QTY(Calculate.subtract(selectStruct.getOPR_INST_QTY(), qty_Hj));
			if(Calculate.compare("0", selectStruct.getACPT_QTY()) > 0){
				this.selectStruct.setACPT_QTY("0");
			}
			
			//不良品数単位
			this.selectStruct.setd1_STOCK_UNIT(selectStruct.getSTOCK_UNIT());
			
			//作業完了チェックボックス
			this.selectStruct.setchk_COMPLETE("true");
			
			//現品票出力チェックボックス制御処理
			AD0090010Struct FormSetStruct = new AD0090010Struct();
			
			if("1".equals(_outputFlg)){
				
				_outputFlg = "0";
				FormSetStruct.setFORM_SET_ITEM_CD(this.selectStruct.getITEM_CD());
				
				List list_formset2 = entity.mSelectPRODUCT_TYP.read(conn, FormSetStruct);
				//品目マスタから製品区分の検索結果のチェック
				if (list_formset2.isEmpty()){
					setErrorMessage("KR20011");
					setWarningSysLogMessage("M_ITEM.ITEM_CD", selectStruct.getITEM_CD());//品目.品目番号
					setReadStatus(ERROR);
					return;
				}
				//製品区分の取得
				FormSetStruct = (AD0090010Struct)list_formset2.get(0);
				String strProduct_Typ = FormSetStruct.getPRODUCT_TYP();
				
				if (null != _initProduct_Typ && !"".equals(_initProduct_Typ) && "1".equals(selectStruct.getFINAL_PROC_FLG())){
					String[] arrProduct_Typ = _initProduct_Typ.split(",");
					for(int i=0; i < arrProduct_Typ.length; i++){
						if(null != strProduct_Typ && !"".equals(strProduct_Typ) && strProduct_Typ.equals(arrProduct_Typ[i])){
							_outputFlg = "1";
							break;
						}
					}
				}
			}
			
			if("1".equals(_outputFlg)){
				this.selectStruct.setchk_OUTPUT("true");
			}else{
				this.selectStruct.setchk_OUTPUT("false");
			}
			
			//子品目一括更新チェックボックス
			//内作の最大仕掛作業系列番号を取得
			String maxProcNo = null;
			tempList = entity.mSelectMaxProcNo.read(conn, this.selectStruct);
			if (tempList != null && tempList.size() != 0) {
				tempStruct = (AD0090010Struct)tempList.get(0);
				maxProcNo = tempStruct.getPROC_NO();
			}
			
			if (null != maxProcNo && "1".equals(this.selectStruct.getOUTSIDE_TYP()) 
					&& maxProcNo.equals(this.selectStruct.getPROC_NO())){			
				//最終工程フラグを立てる
				_lastProc = true;
				this.selectStruct.setchk_CHILD_RSLTUPDATE("true");
			}else{
				_lastProc = false;
				this.selectStruct.setchk_CHILD_RSLTUPDATE("false");
			}
			
			this.selectStruct.seth_PROCESS_MANAGE_FLG(this._processManageFlg);
			
			// 当工程の前工程或る後工程を取得処理
			SelectPrevOrNextWork();
			
			// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、最初工程でない、且つ前回工程の[作業実績]に登録しない場合
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.getFIRST_WORK_FLG())) {
	 			if (isNull(selectStruct.getPREV_WORK_ODR_CD())) {
	 				setErrorMessage("AD00228");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					setReadStatus(ERROR);
					return;
	 			}
	 		}
	 		
	 		// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、
	 		// [作業系列別仕掛]から取得する[作業系列別仕掛].“仕掛内外作区分”が2：外作のレコードがある場合
	 		if("1".equals(_processManageFlg)) {
	 			AD0090010Struct paramStruct = new AD0090010Struct();
	 			paramStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
	 			tempList = entity.mSelectTworkProcByProc.read(conn,paramStruct);
	 			if (null != tempList && tempList.size() > 0) {
					struct.setDATA_COUNT(((AD0090010Struct)tempList.get(0)).getDATA_COUNT());
				}
	 			
	 			if (Calculate.compare(struct.getDATA_COUNT(), "0") < 0) {
	 				setErrorMessage("AD00229");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					setReadStatus(ERROR);
					return;
	 			}
	 		}
			
			//保管区コードのセット
//			if(Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0){
//				tempList = entity.mSELECT_T_OPR_RSLT.read(conn, selectStruct);
//				if(null != tempList && tempList.size() > 0){
//					tempStruct = (AD0090010Struct)tempList.get(0);
//					this.selectStruct.setWH_CD(tempStruct.getWH_CD());
//					this.selectStruct.setWH_NAME(tempStruct.getWH_NAME());
//					this.selectStruct.setWS_CD(tempStruct.getWS_CD());
//					this.selectStruct.setWS_NAME(tempStruct.getWS_NAME());
//				}
//			}else{
//				this.selectStruct.setPLANT_CD(this.sysPLANT_CD);
//				this.selectStruct.setWH_CD(ValidateWh.getDefaultOprWh(
//					conn, getsysPLANT_CD(), this.selectStruct.getITEM_CD()));
//				if(StringUtil.Validate(this.selectStruct.getWH_CD())){
//					tempList = entity.mM_WH.read(conn,this.selectStruct);
//					this.selectStruct.setWH_NAME(((AD0090010Struct)tempList.get(0)).getWH_NAME());
//				}
//			}
			
			// システムパラメータ：　“工程保管場所の在庫を管理する”が”ON”且つ最終工程でないの場合
			if ("1".equals(_processManageFlg) && !"1".equals(selectStruct.getFINAL_PROC_FLG())) {
				tempList = entity.mSELECT_T_OPR_RSLT.read(conn, selectStruct);
				if(null != tempList && tempList.size() > 0){
					if(Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0){
						tempStruct = (AD0090010Struct)tempList.get(0);
						this.selectStruct.setWH_CD(tempStruct.getWH_CD());
						this.selectStruct.setWH_NAME(tempStruct.getWH_NAME());
						this.selectStruct.setWS_CD(tempStruct.getWS_CD());
						this.selectStruct.setWS_NAME(tempStruct.getWS_NAME());
					} else {
						// 次工程の作業区コードから作業区に登録されている保管区コードを取得する。
						this.selectStruct.setWH_CD(selectStruct.getNEXT_WH_CD());
						this.selectStruct.setWH_NAME(selectStruct.getNEXT_WH_NAME());
					}
					
				} else {
					// 次工程の作業区コードから作業区に登録されている保管区コードを取得する。
					this.selectStruct.setWH_CD(selectStruct.getNEXT_WH_CD());
					this.selectStruct.setWH_NAME(selectStruct.getNEXT_WH_NAME());
				}
			} else {
				// システムパラメータ：　“工程保管場所の在庫を管理する”が”OFF”場合
				if(Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0){
					tempList = entity.mSELECT_T_OPR_RSLT.read(conn, selectStruct);
					if(null != tempList && tempList.size() > 0){
						tempStruct = (AD0090010Struct)tempList.get(0);
						this.selectStruct.setWH_CD(tempStruct.getWH_CD());
						this.selectStruct.setWH_NAME(tempStruct.getWH_NAME());
						this.selectStruct.setWS_CD(tempStruct.getWS_CD());
						this.selectStruct.setWS_NAME(tempStruct.getWS_NAME());
					}
				}else{
					this.selectStruct.setPLANT_CD(this.sysPLANT_CD);
					this.selectStruct.setWH_CD(ValidateWh.getDefaultOprWh(
						conn, getsysPLANT_CD(), this.selectStruct.getITEM_CD()));
					if(StringUtil.Validate(this.selectStruct.getWH_CD())){
						tempList = entity.mM_WH.read(conn,this.selectStruct);
						this.selectStruct.setWH_NAME(((AD0090010Struct)tempList.get(0)).getWH_NAME());
					}
				}
			}
			
			zeroSet(selectStruct);
			//出庫指示番号
			this.selectStruct.seth_ISSUE_INST_CD(null);
			
			this.struct.setStructM(selectStruct);
			
			//時間管理フラグ
			if("true".equals(tempTimeCtrl)){
				struct.setTIME_CTRL("true");
			}else{
				struct.setTIME_CTRL("false");
				struct.setOPRATION_TIME("");
			}
			this.struct.seth_BUSINESS_OPR_DATE(_oprDate);
			
			setReadStatus(NORMAL);
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
		try{
			//不良理由コードを再設定
			setDefect();
			//実際原価の締めが完了している日付チェック
			if(getSysParameter() == false){
				//実際原価管理パラメータの対象年月日
				BigDecimal ProcExecDate = getProcExecDate();
				if(null != ProcExecDate){
					boolean b = true;
					// 画面入力年月日
					BigDecimal input = new BigDecimal(struct.getOPR_DATE().substring(0,4) + struct.getOPR_DATE().substring(5,7));
					b = compDecimal(input,ProcExecDate);
					if(!b){
						setErrorMessage("AE00160");
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				}
			}
			
			//数値タイプ項目がnullの場合、0をセット
			zeroSet(this.struct);
			_downloadFile = null;
			struct.setDOWNLOAD_FILE(null);
			List tempList = null;
			AD0090010Struct tempStruct = null;
			
			//作業状態区分のチェック
			tempList = entity.mSELECT_Work_Sts_Typ.read(conn, struct);
			if(null != tempList && tempList.size() > 0){
				tempStruct = (AD0090010Struct)tempList.get(0);	
				if("9".equals(tempStruct.getWORK_STS_TYP())){
					setErrorMessage("AD00120");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業系列別仕掛.作業指示番号
					return;
				}
			}

			//保管区コードチェック
			if(null != struct.getWH_CD() && !"".equals(struct.getWH_CD())){
				tempList = entity.mSelectChkWhCd.read(conn,struct);
				if(tempList.isEmpty()){
					setErrorMessage("AD00020");
					setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//保管区.保管区コード
					return;
				} else {
					tempStruct = (AD0090010Struct)tempList.get(0);
					this.struct.setWH_NAME(tempStruct.getWH_NAME());
					//保管区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
					if (tempStruct.getPLANT_CD() == null 
							|| !tempStruct.getPLANT_CD().equals(this.selectStruct.getPLANT_CD())) {
						this.struct.setWH_NAME(null);
						setErrorMessage("AD00021");
						setWarningSysLogMessage("M_WH.WH_CD", this.struct.getWH_CD());//保管区.保管区コード
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
						return;
					}
				}
			}
			//実績作業区コードチェック
			tempList = entity.mSelectChkWsCd.read(conn,this.struct);
			if (tempList.isEmpty()) {
				setErrorMessage("AD20029");
				setWarningSysLogMessage("M_WS.WS_CD",this.struct.getWS_CD());//作業区.作業区コード
				return;
			} else {
				tempStruct = (AD0090010Struct)tempList.get(0);
				this.struct.setWS_NAME(tempStruct.getWS_NAME());
				//実績作業区コードの工場コードと作業系列別仕掛の工場コードの同一チェック
				if (tempStruct.getPLANT_CD() == null 
						|| !tempStruct.getPLANT_CD().equals(this.selectStruct.getPLANT_CD())) {
					this.struct.setWH_NAME(null);
					setErrorMessage("AD00004");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					return;
				}
			}

			//Add start 20140219 huang-lh
			
			AD0090010Struct paramStruct = new AD0090010Struct();
	 		// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、最終工程以外の場合、[保管区].”倉庫区分”が １：工程保管場所 でない場合
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.geth_FINAL_PROC_FLG())) {
	 			paramStruct.setNEXT_WH_CD(struct.getWH_CD());
				tempList = entity.mSelectWhTyp.read(conn,paramStruct);
				// 保管区の倉庫区分を取得する
				if (null != tempList && tempList.size() > 0) {
					struct.setWH_TYP(((AD0090010Struct)tempList.get(0)).getWH_TYP());
				}
	 			if (!"1".equals(struct.getWH_TYP().toString())) {
	 				setErrorMessage("AA00156");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					return;
	 			}
	 		}
	 		
	 		//システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、最終工程以外且つ分作回数>1の場合、作業指示番号ごとに保管区コードが不一致の場合
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.geth_FINAL_PROC_FLG())
	 				&& Calculate.compare(selectStruct.getPARTIAL_PRD_NO(),"1") > 0) {
	 			// 作業実績の同じ作業指示番号の保管区コードの数量を取得する
	 			paramStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());
	 			paramStruct.setWH_CD(struct.getWH_CD());
	 			tempList = entity.mSelectWhCdCount.read(conn,paramStruct);
				// 保管区の倉庫区分を取得する
				if (null != tempList && tempList.size() > 0) {
					struct.setWH_CD_COUNT(((AD0090010Struct)tempList.get(0)).getWH_CD_COUNT());
				}
	 			if (Calculate.compare(struct.getWH_CD_COUNT(),"0") == 0) {
	 				setErrorMessage("AD00230");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					return;
	 			}
	 		}
	 		
	 		// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、最初工程でない、且つ前回工程の[作業実績]に登録しない場合
	 		if("1".equals(_processManageFlg) && !"1".equals(selectStruct.getFIRST_WORK_FLG())) {
	 			if (isNull(selectStruct.getPREV_WORK_ODR_CD())) {
	 				setErrorMessage("AD00228");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					return;
	 			}
	 		}
	 		
	 		// システムパラメータ：”工程保管場所の在庫を管理”が”ＯＮ” 且つ、
	 		// [作業系列別仕掛]から取得する[作業系列別仕掛].“仕掛内外作区分”が2：外作のレコードがある場合
	 		if("1".equals(_processManageFlg)) {
	 			paramStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
	 			tempList = entity.mSelectTworkProcByProc.read(conn,paramStruct);
	 			if (null != tempList && tempList.size() > 0) {
					struct.setDATA_COUNT(((AD0090010Struct)tempList.get(0)).getDATA_COUNT());
				}
	 			
	 			if (Calculate.compare(struct.getDATA_COUNT(), "0") > 0) {
	 				setErrorMessage("AD00229");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", this.selectStruct.getWORK_ODR_CD());//系列別仕掛.作業指示番号
					return;
	 			}
	 		}
	 		//Add End 20140219 huang-lh
			
			// ロット管理フラグ = 1(ロット管理) と　最終系列フラグ = 1(最終系列)の場合
			if("1".equals(selectStruct.getLOT_CTRL_FLG()) && "1".equals(selectStruct.getFINAL_PROC_FLG())){
				BigDecimal acptQty = new BigDecimal(this.struct.getACPT_QTY());
				//良品数 > 0の場合
				if(acptQty.doubleValue() > 0){
					//ロット番号採番区分 = 0(自動採番しない)の場合
					if("0".equals(selectStruct.getLOT_NUMBERING_TYP())){
						//ロット管理検索
						tempList = entity.mT_LOT_CTRL.read(conn,this.struct);
						//[ロット管理]に存在しない場合
						if(tempList == null || tempList.size() == 0){
							setErrorMessage("AE20603");
							setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
							return;
						}
						//ロット番号採番区分 = 0(自動採番しない)でない場合
					}else{
						//ロット番号がnullの場合
						if (this.struct.getLOT_NO() == null || this.struct.getLOT_NO().equals("")) {
							// 在庫ロット番号の自動採番を行う。
							BizCommon bc = new BizCommon(conn, getsysUSER_CD(), sp.getProcId(), getsysPLANT_CD());
					 		List retList = bc.getsetLotNumberingFd(struct.getITEM_CD(), struct.getOPR_DATE());

							//正常終了の場合
							if(bc.getResultStatus().intValue() != 3){
								//在庫ロット番号の取得
								if(retList != null && retList.size() > 0){
									String result1 = (String)retList.get(0);
									struct.setLOT_NO(result1);
								}
							//異常終了の場合
							}else{
								//エラーメッセージの取得
								if(retList != null && retList.size() > 1){
									String result2 = (String)retList.get(1);
									setErrorMessage(result2);
									return;
								}
							}
						//更新前のロット番号がnullでない場合
						} else {
							//ロット管理検索
							tempList = entity.mT_LOT_CTRL.read(conn,this.struct);

							//[ロット管理]に存在しない場合
							if(tempList == null || tempList.size() == 0){
								setErrorMessage("AE20603");
								setWarningSysLogMessage("T_LOT_CTRL.LOT_NO", this.struct.getLOT_NO());
								return;
							}
						}
					}
				}
			}		
			
			//一覧の「不良理由コード」が重複チェック
			HashSet hs = new HashSet();		
			int defectCauseCount = 0;

			List defectCauseCdListChk = struct.getList_l_DEFECT_CAUSE_CD();
			for (int i = 0; i < defectCauseCdListChk.size()-1; i++) {
				String defectCauseCd = (String) defectCauseCdListChk.get(i);
				if("0".equals(defectCauseCd)){
					continue;
				}
				hs.add(defectCauseCd);
				defectCauseCount = defectCauseCount + 1;
			}
			
			//一覧の「不良理由コード」が重複の場合
			if(defectCauseCount != hs.size()){
				setErrorMessage("AE05062");
				return;				
			}
			
			//作業実績へ追加
			struct.setPLANT_CD(selectStruct.getPLANT_CD());
			//作業実績作業日 = 「作業日」＋「作業開始日時(時刻)」
			if(null == struct.getOPRATION_TIME() || "".equals(struct.getOPRATION_TIME())){
				struct.setOPRATION_TIME("0000");
			}
			if(struct.getOPRATION_TIME().length() == 3){
				struct.setOPRATION_TIME("0"+struct.getOPRATION_TIME());
			}
			struct.setOPR_DATE(struct.getOPR_DATE()+ " " + struct.getOPRATION_TIME());
			//出来高実績番号
			struct.setOUTPUT_RSLT_CD(null);
			//作業訂正回数
			struct.setOPR_CRCT_NO("0");
			
			try{
				entity.mInsertT_OPR_RSLT.create(conn, struct);
			}catch(SQLException ee){
				String err = ee.toString();
				if (err.indexOf("ORA-00001") != -1) { //一意制約エラー
					setErrorMessage("ZZ01102");
					setWarningSysLogMessage("T_OPR_RSLT.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//作業実績.作業指示番号
					setWarningSysLogMessage("T_OPR_RSLT.PARTIAL_PRD_NO",this.struct.getPARTIAL_PRD_NO());//作業実績.分作回数
					return;
				}
				throw ee;
			}
			
			//[作業系列別仕掛]、[品目別仕掛]の更新
			//完了のチェックボックス有りの場合、仕掛情報の更新
			this.struct.setUPDATE_WORK_STS_TYP("9");
			this.struct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());

			if ("true".equals(this.struct.getchk_COMPLETE())) {

				AD0090010Struct completeStruct = new AD0090010Struct();
				setStandardItem(completeStruct);
				completeStruct.setUPDATE_WORK_STS_TYP("9");
				completeStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
				completeStruct.setIN_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
				completeStruct.setPLANT_CD(this.sysPLANT_CD);
				
				//同作業指示番号中の最遅作業日の取得（[作業実績]."作業実績作業日"）
				tempList = entity.mT_OPR_RSLT.read(conn, completeStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				completeStruct.setOPR_DATE(tempStruct.getOPR_DATE());
				
				//作業系列仕掛更新処理
				tempList = entity.mSelectChkWorkProc.read(conn,this.struct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				if (this.selectStruct.getPROC_MODIFY_COUNT() != null 
						&& !this.selectStruct.getPROC_MODIFY_COUNT().equals(
						tempStruct.getPROC_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}

				entity.mUpdateWorkProc.update(conn, completeStruct);
				//ModifyCountの再セット
				tempList = entity.mSelectChkWorkProc.read(conn,this.struct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.struct.getIN_OPR_INST_CD());//作業系列仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				this.selectStruct.setPROC_MODIFY_COUNT(tempStruct.getPROC_MODIFY_COUNT());

				//作業系列が最終系列の場合、品目別仕掛更新処理
				if ("1".equals(this.selectStruct.geth_FINAL_PROC_FLG())) {
					
					tempList = entity.mSelectChkWorkItem.read(conn,this.selectStruct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD", this.selectStruct.getWORK_ODR_CD());//品目仕掛.作業計画番号
						return;
					}
					tempStruct = (AD0090010Struct)tempList.get(0);
					if (this.selectStruct.getITEM_MODIFY_COUNT() != null 
							&& !this.selectStruct.getITEM_MODIFY_COUNT().equals(
							tempStruct.getITEM_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",this.selectStruct.getWORK_ODR_CD());//品目仕掛.作業計画番号
						return;
					}

					entity.mUpdateWorkItem.update(conn, completeStruct);

					//ModifyCountの再セット
					tempList = entity.mSelectChkWorkItem.read(conn,this.struct);
					if (tempList.isEmpty()) {
						setErrorMessage("ZZ01101");
						setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.WORK_ODR_CD",this.selectStruct.getWORK_ODR_CD());//品目仕掛.作業計画番号
						return;
					}
					tempStruct = (AD0090010Struct)tempList.get(0);
					this.struct.setITEM_MODIFY_COUNT(tempStruct.getITEM_MODIFY_COUNT());
				}
			}
			
			//自動出庫呼び出し
			BigDecimal bdQty = new BigDecimal("0");
			if (this.struct.getACPT_QTY() != null) {
				bdQty = new BigDecimal(this.struct.getACPT_QTY());
			}
			if (this.struct.getDEFECT_QTY() != null) {
				bdQty = bdQty.add(new BigDecimal(this.struct.getDEFECT_QTY()));
			}
			String sFLG = "0";	//「作業完了」未
			if (this.struct.getchk_COMPLETE() != null 
					&& "true".equals(this.struct.getchk_COMPLETE())) {
				sFLG = "1";	//「作業完了」
			}
			if (this.struct.getOPR_CRCT_NO() == null 
					|| this.struct.getOPR_CRCT_NO().length() == 0) {
				this.struct.setOPR_CRCT_NO("0");
			}
			
			/********************
			 * 自動出庫処理開始 *
			 *******************/
			WhAutoIssueProc whAutoIssueProc = new WhAutoIssueProc(conn,
					this.sysPLANT_CD,
					this.sysUSER_CD,
					this.sp.getProcId());
			WhAutoIssueProc.AutoIssueParam autoIssueParam = whAutoIssueProc.new AutoIssueParam();
			
			// パラメータのセット
			autoIssueParam.m_WORK_ODR_CD = this.selectStruct.getWORK_ODR_CD();
			autoIssueParam.m_WORK_IN_PROC_CD = this.selectStruct.getWORK_IN_PROC_CD();
			autoIssueParam.m_PARTIAL_PRD_NO = Integer.parseInt(this.struct.getPARTIAL_PRD_NO());
			autoIssueParam.m_OPR_RSLT_CRCT_NO = Integer.parseInt(this.struct.getOPR_CRCT_NO());
			autoIssueParam.m_PUCH_ODR_CD = "";
			autoIssueParam.m_ACPT_NO = 0;
			autoIssueParam.m_ACPT_RSLT_CRCT_NO = 0;
			autoIssueParam.m_RCV_ISSUE_TYP = 2;
			autoIssueParam.m_RCV_ISSUE_DATE = this.struct.getOPR_DATE();
			autoIssueParam.m_RCV_ISSUE_RSLT_NO = bdQty.toString();
			autoIssueParam.m_RCV_ISSUE_CMPLT_FLG = Integer.parseInt(sFLG);
			autoIssueParam.m_PLANT_CD = this.sysPLANT_CD;
			
			AutoIssue autoIssue = new AutoIssue(conn,
					this.sysPLANT_CD,this.sysUSER_CD,this.sp.getProcId());
			
			// 自動出庫実行
			boolean result = autoIssue.AutoIssueOpr(autoIssueParam);

			String[] message;
			if(result){
				// 業務アラームがあれば出力する。
				for(int i=0; i<autoIssue.getWarnList().size(); i++){
					message = (String[])autoIssue.getWarnList().get(i);
					setWarningMessage(message[0], message[1]);
				}
			}else{
				// 業務エラーの出力
				for(int i=0; i<autoIssue.getErrorList().size(); i++){
					message = (String[])autoIssue.getErrorList().get(i);
					setErrorMessage(message[0], message[1]);
				}
				return;
			}
			
			// Add Start 20140219 huang-lh
			// システムパラメータ：　”工程保管場所の在庫を管理する”　を　”ＯＮ”　に設定した場合、以下の処理を行う
			// 品目の工程在庫の管理を行う
			if ("1".equals(_processManageFlg)) {
				int updFlg = 0;
				updFlg = ItemWorkManager(updFlg);
				
				// エラー発生場合
				if (updFlg != 0) {
					return;
				}
			}
			// Add End 20140219 huang-lh
			
			//入庫処理（保管区別入出庫追加）
			if ("1".equals(this.selectStruct.geth_FINAL_PROC_FLG())) {
				//製番のチェック
				String jobOdrNo = this.selectStruct.getJOB_ODR_CD();
				if (jobOdrNo != null) {
					tempList = entity.mSelectJobOdr.read(conn,this.selectStruct);
					if (tempList != null && tempList.size() > 0) {
						tempStruct = (AD0090010Struct)tempList.get(0);
						if (tempStruct.getJOB_ODR_TYP() != null 
								&& "3".equals(tempStruct.getJOB_ODR_TYP())
									&& tempStruct.getITEM_CD().equals(this.selectStruct.getITEM_CD())) {//最上位品目の場合
							//在庫補充製番
							jobOdrNo = null;
						}
					}
				}

				CollectNumber collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
				String no = collectNum.getNo();
				if (no == null || no.length() == 0) {
					//採番結果がない
					setErrorMessage("ZZ01106");
					setReadStatus(ERROR);
					return;
				}
				
				AD0090010Struct rcvIssueStruct = new AD0090010Struct();
				
				BigDecimal inAcptQty = new BigDecimal(this.struct.getACPT_QTY());
				BigDecimal inDefectQty = new BigDecimal(this.struct.getDEFECT_QTY());
				if (this.selectStruct.getUNIT_QTY_TYP() != null 
						&& "1".equals(this.selectStruct.getUNIT_QTY_TYP())) {
					//品目が整数管理品の場合、切上げを行う
					inAcptQty = inAcptQty.setScale(0,BigDecimal.ROUND_DOWN);
					inDefectQty = inDefectQty.setScale(0,BigDecimal.ROUND_DOWN);
				}
				
				rcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);
				rcvIssueStruct.setITEM_CD(this.selectStruct.getITEM_CD());
				rcvIssueStruct.setPLANT_CD(this.sysPLANT_CD);
				rcvIssueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
				rcvIssueStruct.setWH_CD(this.struct.getWH_CD());
				rcvIssueStruct.setJOB_ODR_CD(jobOdrNo);
				rcvIssueStruct.setWORK_ODR_CD(this.selectStruct.getWORK_ODR_CD());
				rcvIssueStruct.setWORK_IN_PROC_CD(this.selectStruct.getWORK_IN_PROC_CD());
				rcvIssueStruct.setRCV_ISSUE_QTY(inAcptQty.toString());
				rcvIssueStruct.setRCV_ISSUE_DATE(this.struct.getOPR_DATE());
				rcvIssueStruct.setRCV_ISSUE_GNR_TYP("11");
				rcvIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");
				rcvIssueStruct.setOD_NO(this.struct.getOD_NO());
				rcvIssueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());
				rcvIssueStruct.setLOT_NO(this.struct.getLOT_NO());
				rcvIssueStruct.setRCV_ISSUE_TYP("1");
				rcvIssueStruct.setCOMPANY_CD(_company_cd);
				if (this.struct.getchk_COMPLETE() != null 
						&& "true".equals(this.struct.getchk_COMPLETE())) {
					rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
				} else {
					rcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
				}
				rcvIssueStruct.setSTOCK_UPD_TYP("1");

				//作業実績訂正回数
				rcvIssueStruct.setOPR_RSLT_CRCT_NO(this.struct.getOPR_CRCT_NO());  

				// 手持ち在庫数を初期化
				rcvIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
				setStandardItem(rcvIssueStruct);

				//保管区別入出庫
				entity.mInsertRecvIssue.create(conn, rcvIssueStruct);

				//現品票用
				AD0090010Struct IdentCardStruct = new AD0090010Struct();
				setStandardItem(IdentCardStruct);
				//現品票用にデータ保管
				IdentCardStruct.setRCV_ISSUE_CTRL_CD(no);//保管区別入出庫番号
				IdentCardStruct.setJOB_ODR_CD(jobOdrNo); //製番
				
				// 入庫処理呼び出し
				RcvCancel RCan = 
						new RcvCancel(
							conn,
							rcvIssueStruct.getRCV_ISSUE_CTRL_CD(),
							this.sysUSER_CD);
				boolean bRSLT = RCan.execProcess();
				if (!bRSLT) {
					//入庫処理失敗 サーバーエラー
					throw new Exception();
				}
				
				// システムパラメータ：”不良在庫を工程管理する”が”ＯＮ”且つ、「不良数」＜＞０場合、不良品入庫を行う
				if ("1".equals(_defectManageFlg) && !"0".equals(struct.getDEFECT_QTY())) {
					AD0090010Struct defectInIssueStruct = new AD0090010Struct();
					no = collectNum.getNo();
					if (no == null || no.length() == 0) {
						//採番結果がない
						setErrorMessage("ZZ01106");
						setReadStatus(ERROR);
						return;
					}
					
					// 入出庫管理番号
					defectInIssueStruct.setRCV_ISSUE_CTRL_CD(no);
					//入出庫区分
					defectInIssueStruct.setRCV_ISSUE_TYP("3");
					//品目番号
					defectInIssueStruct.setITEM_CD(this.selectStruct.getITEM_CD());
					//保管区コード
					defectInIssueStruct.setWH_CD(this.struct.getWH_CD());
					//製番
					defectInIssueStruct.setJOB_ODR_CD(jobOdrNo);
					//製番枝番
					defectInIssueStruct.setJOB_ODR_DETAIL_NO("0");
					//受入回数
					defectInIssueStruct.setACPT_NO("0");
					//作業計画番号
					defectInIssueStruct.setWORK_ODR_CD(selectStruct.getWORK_ODR_CD());
					//仕掛作業コード
					defectInIssueStruct.setWORK_IN_PROC_CD(selectStruct.getWORK_IN_PROC_CD());
					//分作回数
					defectInIssueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
					//作業実績訂正回数
					defectInIssueStruct.setOPR_RSLT_CRCT_NO("0");
					//出庫指示番号
					defectInIssueStruct.setISSUE_INST_CD(null);
					//入出庫数
					defectInIssueStruct.setRCV_ISSUE_QTY(struct.getDEFECT_QTY());
					//入出庫前在庫数
					defectInIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");
					//入出庫年月日
					defectInIssueStruct.setRCV_ISSUE_DATE(struct.getOPR_DATE());
					//入出庫発生区分
					defectInIssueStruct.setRCV_ISSUE_GNR_TYP("11");
					//在庫更新区分
					defectInIssueStruct.setSTOCK_UPD_TYP("2");
					//入出庫完了フラグ
					if (this.struct.getchk_COMPLETE() != null 
							&& "true".equals(this.struct.getchk_COMPLETE())) {
						defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
					} else {
						defectInIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
					}
					
					//オーダデマンド番号
					defectInIssueStruct.setOD_NO(selectStruct.getOD_NO());
					//入出庫端数
					defectInIssueStruct.setRCV_ISSUE_ODD_QTY("0");
					//工場コード
					defectInIssueStruct.setPLANT_CD(selectStruct.getPLANT_CD());
					//在庫ロット番号
					defectInIssueStruct.setLOT_NO(struct.getLOT_NO());
					defectInIssueStruct.setCOMPANY_CD(_company_cd);
					defectInIssueStruct.setUSER_CD(sysUSER_CD);
					defectInIssueStruct.setUPDATED_PRG_NM(this.sp.getProcId());
					setStandardItem(defectInIssueStruct);
					// 保管区別入出庫
					entity.mInsertRecvIssue.create(conn, defectInIssueStruct);
					IssueProcess IProc = new IssueProcess(conn, no);
					boolean bResult = IProc.execDefectProcess();
					if (!bResult) {
						//入庫処理失敗 サーバーエラー
						throw new Exception();
					}
				}
				
				//工数管理品目（[品目].”工数管理品目区分”＝ 1：工数管理品目）の場合 （入庫即出庫）		
				List manhourTypList = new ArrayList();
				AD0090010Struct manhourTypStruct = null;
				List parentList = new ArrayList();
				AD0090010Struct parentStruct = null;
				List tRlsdPuchOdrList = new ArrayList();
				AD0090010Struct tRlsdPuchOdrStruct = null;
				List tWorkInProcByProcList = new ArrayList();
				AD0090010Struct tWorkInProcByProcStruct = null;
				
				manhourTypStruct = null;
				List selelctRcvIssueList = new ArrayList();
				AD0090010Struct selectRcvIssueStruct = new AD0090010Struct();
				
				boolean bFlg = false;

				String strPuchOdrCd = null;		// 登録用発注番号
				String strWorkOdrCd = null;		// 登録用作業計画番号
				String strWorkInProcCd = null;	// 登録用仕掛作業コード

				manhourTypList = entity.mSelectItem.read(conn,this.selectStruct);

				if (!manhourTypList.isEmpty()) {
					manhourTypStruct = (AD0090010Struct)manhourTypList.get(0);
				}

				// [品目].工数管理品目区分 = 1:工数管理品目の場合
				if ("1".equals(manhourTypStruct.getMANHOUR_TYP())){

					collectNum = 
						new CollectNumber(
							CollectNumber.ISSUE_CD,
							this.sysUSER_CD,
							this.sp.getProcId(),
							this.sysPLANT_CD);
					no = collectNum.getNo();
					if (no == null || no.length() == 0) {
						//採番結果がない
						setErrorMessage("ZZ01106");
						setReadStatus(ERROR);
						return;
					}
					
					// 親品目の初工程に出庫するためのデータ設定
					parentList = entity.mSELECT_PARENT.read(conn,this.selectStruct);
					if ( !parentList.isEmpty()) {
						parentStruct = (AD0090010Struct)parentList.get(0);
						// 親品目が擬似品目の場合、さらに上の品目のオーダデマンド番号を取得する
						if ( "8".equals(parentStruct.getPARENT_MRP_ODR_TYP())){
							parentList = new ArrayList();
							parentList = entity.mSELECT_DUMMY_PARENT.read(conn,parentStruct);
							if ( !parentList.isEmpty()){
								parentStruct = null;
								parentStruct = (AD0090010Struct)parentList.get(0);
							}
						}

						if ( !parentList.isEmpty()){
							// 親品目が内作の場合
							if ( "1".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
								tWorkInProcByProcList = entity.mSELECT_T_WORK_IN_PROC_BY_PROC.read(conn,parentStruct);
								if ( !tWorkInProcByProcList.isEmpty()){
									tWorkInProcByProcStruct = (AD0090010Struct)tWorkInProcByProcList.get(0);
									// 作業計画番号設定
									strWorkOdrCd = tWorkInProcByProcStruct.getPARENT_WORK_ODR_CD();

									// 作業指示番号設定
									strWorkInProcCd = tWorkInProcByProcStruct.getPARENT_WORK_IN_PROC_CD();
								}
							}
							// 親品目が外作の場合
							if ( "2".equals(parentStruct.getPARENT_OUTSIDE_TYP())){
								tRlsdPuchOdrList = entity.mSELECT_T_RLSD_PUCH_ODR.read(conn,parentStruct);
								if ( !tRlsdPuchOdrList.isEmpty()){
									tRlsdPuchOdrStruct = (AD0090010Struct)tRlsdPuchOdrList.get(0);
									// 発注番号設定
									strPuchOdrCd = tRlsdPuchOdrStruct.getPARENT_PUCH_ODR_CD();
								}
							}
						}
					}

				    // 入出庫数をマイナスにする
					BigDecimal minusOne = new BigDecimal("-1");
					inAcptQty = inAcptQty.multiply(minusOne);

					AD0090010Struct outIssueStruct = new AD0090010Struct();
					setStandardItem(outIssueStruct);
					outIssueStruct.setPUCH_ODR_CD(strPuchOdrCd);                          //発注番号
					outIssueStruct.setWORK_ODR_CD(strWorkOdrCd);                          //作業計画番号
					outIssueStruct.setWORK_IN_PROC_CD(strWorkInProcCd);                   //仕掛作業コード
					outIssueStruct.setRCV_ISSUE_CTRL_CD(no);                              //入出庫管理番号
					outIssueStruct.setITEM_CD(this.selectStruct.getITEM_CD());           //品目番号
					outIssueStruct.setPLANT_CD(this.sysPLANT_CD);                         //工場コード
					outIssueStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());    //分作回数
					outIssueStruct.setWH_CD(this.struct.getWH_CD());                     //保管区コード
					outIssueStruct.setJOB_ODR_CD(jobOdrNo);                              //製番
					outIssueStruct.setRCV_ISSUE_QTY(inAcptQty.toString());               //入出庫数
					outIssueStruct.setRCV_ISSUE_DATE(this.struct.getOPR_DATE());        //入出庫年月日
					outIssueStruct.setRCV_ISSUE_GNR_TYP("21");                           //入出庫発生区分
					outIssueStruct.setRCV_ISSUE_ODD_QTY("0.0");                          //入出庫端数
					outIssueStruct.setOD_NO(this.selectStruct.getOD_NO());              //オーダデマンド番号
					outIssueStruct.setVEND_LOT_NO(this.struct.getVEND_LOT_NO());        //メーカロット番号
					outIssueStruct.setLOT_NO(this.struct.getLOT_NO());                  //在庫ロット番号
					outIssueStruct.setRCV_ISSUE_TYP("2");                                //入出庫区分
					outIssueStruct.setCOMPANY_CD(_company_cd);                           //会社コード
					if (this.struct.getchk_COMPLETE() != null 
							&& "true".equals(this.struct.getchk_COMPLETE())) {
						outIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");                     //入出庫完了フラグ
					} else {
						outIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
					}
					outIssueStruct.setSTOCK_UPD_TYP("1");                              //在庫更新区分

					//作業実績訂正回数
					outIssueStruct.setOPR_RSLT_CRCT_NO(this.struct.getOPR_CRCT_NO());  

					// 退避用手持ち在庫数を初期化
					outIssueStruct.setSAVE_STOCK_ON_HAND_QTY("0");

					//保管区別入出庫
					entity.mINSERT_RCV_ISSUE2.create(conn, outIssueStruct);

					/* 出庫取消処理START */
					/* [T_RCV_ISSUE]読込 */
					selelctRcvIssueList = entity.mSELECT_CHECK_T_RCV_ISSUE.read(conn,outIssueStruct);
					if (selelctRcvIssueList.isEmpty()) {
						bFlg = true;
						bRSLT = false;
					}else{
						selectRcvIssueStruct = (AD0090010Struct)selelctRcvIssueList.get(0);
					}

					/* エラーチェック */
					// 入出庫区分が"2"(出庫)でない
					if(selectRcvIssueStruct.getRCV_ISSUE_TYP()!=null
							&& !selectRcvIssueStruct.getRCV_ISSUE_TYP().equals("2")){
						bFlg = true;
						bRSLT = false;
					}

					// 入出庫発生区分が"21"(通常出庫)でない
					if(!bFlg
						&& selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP()!=null 
						&& !selectRcvIssueStruct.getRCV_ISSUE_GNR_TYP().equals("21")){
						bFlg = true;
						bRSLT = false;
					}

					// 出庫処理呼び出し
					if(!bFlg){
						IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
						bRSLT = IProc.execProcess();
						if( !bRSLT ){
							bFlg = true;
							bRSLT = false;
						}
					}

					// 出庫取消処理
					// 前回出庫実績の検索
					if(!bFlg){
						// [保管区別入出庫]."作業実績訂正回数"が1以上の時
						// ＊出庫を取消す場合は必ず1以上である
						if( selectRcvIssueStruct.getOPR_RSLT_CRCT_NO()!=null
								&& selectRcvIssueStruct.getOPR_RSLT_CRCT_NO().compareTo("1")>=0){

							selelctRcvIssueList = new ArrayList();
							selelctRcvIssueList = entity.mSELECT_T_RCV_ISSUE.read(conn,selectRcvIssueStruct);
							if (selelctRcvIssueList.isEmpty()) {
								bFlg = true;
								bRSLT = false;
							}else{
								selectRcvIssueStruct = new AD0090010Struct();
								selectRcvIssueStruct = (AD0090010Struct)selelctRcvIssueList.get(0);
							}
						}else{
							bFlg = true;
						}
					}

					if(!bFlg){
						//保管区別入出庫への追加
						BigDecimal bQty = new BigDecimal(selectRcvIssueStruct.getRCV_ISSUE_QTY());
						selectRcvIssueStruct.setRCV_ISSUE_QTY(bQty.negate().toString());

						collectNum = 
							new CollectNumber(
								CollectNumber.ISSUE_CD,
								this.sysUSER_CD,
								this.sp.getProcId(),
								this.sysPLANT_CD);
						no = collectNum.getNo();

						selectRcvIssueStruct.setRCV_ISSUE_CTRL_CD(no);		//採番したｷｰをｾｯﾄ
						if (this.struct.getchk_COMPLETE() != null 
								&& "true".equals(this.struct.getchk_COMPLETE())) {
							selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("1");
						} else {
							selectRcvIssueStruct.setRCV_ISSUE_CMPLT_FLG("0");
						}
						selectRcvIssueStruct.setCOMPANY_CD(_company_cd);//会社コード
						entity.mINSERT_T_RCV_ISSUE.create(conn,selectRcvIssueStruct);

						// 出庫取消処理呼び出し
						IssueProcess IProc = new IssueProcess(conn,selectRcvIssueStruct.getRCV_ISSUE_CTRL_CD());
						bRSLT = IProc.execProcess();
					}

					if (!bRSLT) {
						//出庫処理失敗 サーバーエラー
						throw new Exception();
					}
				}
				
				//[現品票]の追加
				//良品数が０以下の場合は現品票は作成しない
				if (Calculate.compare(this.struct.getACPT_QTY(), "0") > 0) {

					//現品票アクティブの場合、現品票の登録処理
					if ("1".equals(_outputFlg)) {

						//現品票管理番号の新規採番
						AD0090010Struct GetIdentCardCtlNoStruct = new AD0090010Struct();

						List list_Get = entity.mselectGetIdentCardCtlNo.read(conn, GetIdentCardCtlNoStruct);

						GetIdentCardCtlNoStruct = (AD0090010Struct) list_Get.get(0);

						AD0090010Struct InsOprRsltStruct = new AD0090010Struct();

						InsOprRsltStruct.setSEL_OPR_INST_CD(this.struct.getIN_OPR_INST_CD());
						InsOprRsltStruct.setSEL_PARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());

						List list_temp = entity.mSelectOprRsltForPrint.read(conn, InsOprRsltStruct);

						//作業実績の検索結果のチェック
						if (list_temp.size()==0||list_temp.isEmpty()){
							setErrorMessage("ZZ11001");
							return;
						}else{
							//作業実績の検索結果を格納する
							InsOprRsltStruct = (AD0090010Struct) list_temp.get(0);
							IdentCardStruct.setINS_IDENT_CARD_CTL_NO(GetIdentCardCtlNoStruct.getGET_IDENT_CARD_CTL_NO());
							IdentCardStruct.setINS_OPR_INST_CD(InsOprRsltStruct.getSEL_OPR_INST_CD());
							IdentCardStruct.setINS_PARTIAL_PRD_NO(InsOprRsltStruct.getSEL_PARTIAL_PRD_NO());
							IdentCardStruct.setINS_ITEM_CD(InsOprRsltStruct.getSEL_ITEM_CD());
							IdentCardStruct.setINS_JOB_ODR_CD(rcvIssueStruct.getJOB_ODR_CD());
							IdentCardStruct.setINS_RCV_ISSUE_CTRL_CD(rcvIssueStruct.getRCV_ISSUE_CTRL_CD());
							IdentCardStruct.setINS_FIRST_IDENT_CARD_QTY(InsOprRsltStruct.getSEL_ACPT_QTY());
							IdentCardStruct.setINS_IDENT_CARD_QTY(InsOprRsltStruct.getSEL_ACPT_QTY());
							IdentCardStruct.setINS_OPR_DATE(InsOprRsltStruct.getSEL_OPR_DATE());
							IdentCardStruct.setINS_PKG_UNIT_QTY(InsOprRsltStruct.getSEL_PKG_UNIT_QTY());
							IdentCardStruct.setINS_PLANT_CD(InsOprRsltStruct.getSEL_PLANT_CD());
							IdentCardStruct.setINS_WS_CD(InsOprRsltStruct.getSEL_WS_CD());
							IdentCardStruct.setLOT_NO(InsOprRsltStruct.getLOT_NO());
						}

						// 現品票の登録
						entity.mInsertIdentCard.create(conn,IdentCardStruct);
					}
				}	
			}
			
			//不良理由の登録
			defectStruct = new AD0090010Struct();
			setStandardItem(defectStruct);
			this.defectStruct.setOPR_INST_CD(this.struct.getIN_OPR_INST_CD());
			this.defectStruct.setPARTIAL_PRD_NO(this.struct.getPARTIAL_PRD_NO());
			this.defectStruct.setPLANT_CD(this.sysPLANT_CD);

			List defectCauseCdList = struct.getList_l_DEFECT_CAUSE_CD();
			List defectQtyList = struct.getList_l_DEFECT_QTY();
			List defectCommentList = struct.getList_l_DEFECT_COMMENT();

			for (int i = 0; i < defectCauseCdList.size(); i++) {
				String defectCauseCd = (String) defectCauseCdList.get(i);
				if ("0".equals(defectCauseCd)) {
					continue;
				}
				String defectInspcQty = (String) defectQtyList.get(i);
				String defectComment = (String) defectCommentList.get(i);

				this.defectStruct.setl_DEFECT_CAUSE_CD(defectCauseCd);
				this.defectStruct.setl_DEFECT_QTY(defectInspcQty);
				this.defectStruct.setl_DEFECT_COMMENT(defectComment);

				entity.mInsertDefect.create(conn, this.defectStruct);
			}

			if(StringUtil.Validate(this.selectStruct.getJOB_ODR_CD()) &&
					"true".equals(struct.getchk_COMPLETE())){
				// 引当済出庫残数＞製番在庫（手持在庫）の場合
				// ｢作業完了｣がチェックされている時のみチェック
				if(!(new IssueRemain(conn)).isEnoughAlcdQty(getsysPLANT_CD(),
						this.selectStruct.getITEM_CD(), this.selectStruct.getJOB_ODR_CD(),
						_JOB_ODR_DETAIL_NO)){
					setWarningMessage("AD60001");
				}
			}
			
		//最終系列フラグ = 1(最終系列)の場合
		if("1".equals(selectStruct.getLOT_CTRL_FLG()) && "1".equals(selectStruct.getFINAL_PROC_FLG())){
			
			//ロット管理の更新処理
			entity.mT_LOT_CTRL.update(conn,this.struct);
		}
		
		conn.commit();
		
		//子品目一括更新
		if("true".equals(struct.getchk_CHILD_RSLTUPDATE())){
			
			//出庫指示リスト取得
			this.setIssueList();
			
			if (!this.issueList.isEmpty()) {
				
				ChildRsltUpdate();	
			}

			if(0 != norCount || 0 != errCount){
				setInformationMessage("AD00507",String.valueOf(norCount),String.valueOf(errCount));
				setInfoSysLogMessage("T_OPR_RSLT.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業指示番号
				setInfoSysLogMessage("T_ISSUE_INST.ISSUE_INST_CD", selectStruct.geth_ISSUE_INST_CD());					
			}
		}
		
		//[現品票]の出力
		if("true".equals(struct.getchk_OUTPUT())){
			//最終系列の実績の場合 と　良品数が＞　０の場合のみ　現品票は印刷する
			if (Double.parseDouble(this.struct.getACPT_QTY()) > 0){
				IdentCardOutPut();
			}	
		}
		
		if("true".equals(struct.getchk_COMPLETE())){
			this.selectStruct.setWORK_STS_TYP("9");
			setWarningMessage("AD00090");
			setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//作業系列別仕掛.作業指示番号
		}
		
		structSave();
		getsaveStruct();

		}catch (NumberFormatException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ParseException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 完了解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelComplete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");
			//{{user_implement_dev:<controlCancelComplete>
		try {
			//実際原価の締めが完了している日付チェック
			if(getSysParameter() == false){
				//実際原価管理パラメータの対象年月日
				BigDecimal ProcExecDate = getProcExecDate();
				if(null != ProcExecDate){
					boolean b = true;
					// 画面入力年月日
					BigDecimal input = new BigDecimal(struct.geth_OPR_DATE().substring(0,4) + struct.geth_OPR_DATE().substring(5,7));
					b = compDecimal(input,ProcExecDate);
					if(!b){
						setErrorMessage("AE00177");
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
						setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
						return;
					}
				}
			}
			
			//Main 検索
			List tempList = new ArrayList();
			tempList = entity.mSelect.read(conn, struct);
			
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD", struct.getIN_OPR_INST_CD());//系列別仕掛.作業指示番号
				setReadStatus(NOT_FOUND);
				return;
			}
			this.selectStruct = new AD0090010Struct();
			this.selectStruct = (AD0090010Struct)tempList.get(0);
			setStandardItem(selectStruct);
			this.selectStruct.setIN_OPR_INST_CD(struct.getIN_OPR_INST_CD());

			tempList = entity.mSelectChkWorkProc.read(conn,this.selectStruct);
			if (tempList.isEmpty()) {
				setErrorMessage("ZZ01101");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.selectStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
				return;
			}
			AD0090010Struct tempStruct = (AD0090010Struct)tempList.get(0);
			if (this.selectStruct.getPROC_MODIFY_COUNT() != null 
					&& !this.selectStruct.getPROC_MODIFY_COUNT().equals(
					tempStruct.getPROC_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setWarningSysLogMessage("T_WORK_IN_PROC_BY_PROC.OPR_INST_CD",this.selectStruct.getOPR_INST_CD());//作業系列仕掛.作業指示番号
				return;
			}
			
			this.selectStruct.setUPDATE_WORK_STS_TYP("2");
			this.selectStruct.setOPR_DATE(null);
			//作業系列別仕掛更新処理
			entity.mUpdateWorkProc.update(conn,this.selectStruct);
			
			//デマンド完了解除（所要量）
			CommonOd od = 
					new CommonOd(
						conn,
						this.sysPLANT_CD,
						this.sysUSER_CD,
						this.sp.getProcId());
			od.changeDemandForCancel(
					this.selectStruct.getWORK_ODR_CD(),
					this.selectStruct.getWORK_IN_PROC_CD());
			
			if ("1".equals(this.selectStruct.getFINAL_PROC_FLG())) {
				//作業系列が最終系列の場合、品目別仕掛更新処理
				tempList = entity.mSelectChkWorkItem.read(conn,this.selectStruct);
				if (tempList.isEmpty()) {
					setErrorMessage("ZZ01101");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.selectStruct.getOPR_INST_CD());//品目仕掛.作業指示番号
					return;
				}
				tempStruct = (AD0090010Struct)tempList.get(0);
				if(this.selectStruct.getITEM_MODIFY_COUNT() != null 
						&& !selectStruct.getITEM_MODIFY_COUNT().equals(
						tempStruct.getITEM_MODIFY_COUNT())) {
					setErrorMessage("ZZ01105");
					setWarningSysLogMessage("T_WORK_IN_PROC_BY_ITEM.OPR_INST_CD", this.selectStruct.getOPR_INST_CD());//品目仕掛.作業指示番号
					return;
				}
			
				//品目別仕掛更新処理
				entity.mUpdateWorkItem.update(conn,this.selectStruct);
			
				//オーダ情報完了解除（所要量）
				od.changeOrderForCancel(this.selectStruct.getOD_NO(),-1);

				//工数管理品の場合
				List manhourTypList = new ArrayList();
				AD0090010Struct manhourTypStruct = null;
				AD0090010Struct tOdUpdateStruct = new AD0090010Struct();

				manhourTypList = entity.mSelectItem.read(conn,this.selectStruct);

				if (!manhourTypList.isEmpty()) {
					manhourTypStruct = (AD0090010Struct)manhourTypList.get(0);
				}
				// [品目].工数管理品目区分 = 1:工数管理品目の場合
				if (manhourTypStruct.getMANHOUR_TYP() != null
						&& "1".equals(manhourTypStruct.getMANHOUR_TYP())){
					tOdUpdateStruct.setDM_STS_TYP("2");
					tOdUpdateStruct.setISSUE_CMPLT_DATE(null);
					tOdUpdateStruct.setOD_NO(this.selectStruct.getOD_NO());
					tOdUpdateStruct.setUSER_CD(this.sysUSER_CD);
					tOdUpdateStruct.setUPDATED_PRG_NM(this.sp.getProcId());
					// デマンド完了（所要量）
					entity.mUPDATE_T_OD.update(conn,tOdUpdateStruct);
				}
			}
			
			conn.commit();
			
			//再検索
			controlSelect();
			
		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ApsComException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
		}
                //}}user_implement_dev:<controlCancelComplete>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlCancelComplete");

		return;
	}

	/**
	 * メンテナンスボタン押下時に実行される処理です。
	 *
	 */
	public void controlMainTain() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlMainTain");
			//{{user_implement_dev:<controlMainTain>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlMainTain>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlMainTain");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			listClear();
			_outputFlg = _initOutputFlg;
			_lastProc = true;
			struct.setchk_CHILD_RSLTUPDATE("true");
			struct.setchk_COMPLETE("true");
                //}}user_implement_dev:<controlClear>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrintShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPrintShow");
			//{{user_implement_dev:<controlPrintShow>
		
		// 作業完了のワーニングメッセージ表示制御
		struct.setIN_OPR_INST_CD(_keepOprInstCd);
		struct.setDOWNLOAD_FILE(_downloadFile);
		struct.setPARTIAL_PRD_NO(_keepPartialPrdNo);
		structSave();
		_printFlg = "0";
		saveStruct.RemakeMessage();
		msgStruct = saveStruct;
                //}}user_implement_dev:<controlPrintShow>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPrintShow");

		return;
	}

	/**
	 * ロット管理ボタン押下時に実行される処理です。
	 *
	 */
	public void controlLotInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");
			//{{user_implement_dev:<controlLotInsert>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlLotInsert>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlLotInsert");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);
			_oprTimeUnitTtpStruct = cdac.getData("OPR_TIME_UNIT_TYP");
	         DEFECT_CAUSE_CD = cdac.getData("DEFECT_CAUSE_CD_INNER");
	         
			cdac.setConnection(null);

			//初期値の設定
			mainInitialize();

			GetTimeCtrl();
			setBussinessOprDate();
			lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			//現品票出力チェックボックス制御処理
			setIdentCard();
			
			try {
				zeroSet(struct);
			} catch (Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				sysLog.severe(emsg, getsysUSER_CD());
				throw new ExpjException(e, emsg);
			}
			int maxLine = 0;
			maxLine = sp.getMaxLine(conn,10);//不良理由表示件数
			if (maxLine > 0) {
				DISPLAY_NUMBER = maxLine;
			}
			
			PrivateConfig privateConfig = new PrivateConfig(conn);
			
	 		// システムパラメータ「工程保管場所の在庫を管理」を取得する
			
	 		_processManageFlg  = privateConfig.getString("PROCESS_MANAGE_FLG");
	 		if(isNull(_processManageFlg)) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage("AD00231");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException eUse = new ExpjException(emsg);
				throw eUse;
	 		} else {
	 			if(!"0".equals(_processManageFlg) && !"1".equals(_processManageFlg)) {
	 				setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage("AD00231");
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException eUse = new ExpjException(emsg);
					throw eUse;
	 			}
	 		}
	 		
	 		// システムパラメータ「不良在庫を工程管理」を取得する
	 		_defectManageFlg  = privateConfig.getString("DEFECT_MANAGE_FLG");
	 		if(isNull(_defectManageFlg)) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage("AD00232");
				sysLog.severe(emsg, getsysUSER_CD());
				ExpjException eUse = new ExpjException(emsg);
				throw eUse;
	 		} else {
	 			if(!"0".equals(_defectManageFlg) && !"1".equals(_defectManageFlg)) {
	 				setReadStatus(ERROR);
					ExpjMessage emsg = new ExpjMessage("AD00232");
					sysLog.severe(emsg, getsysUSER_CD());
					ExpjException eUse = new ExpjException(emsg);
					throw eUse;
	 			}
	 		}
			
			listClear();
			setReadStatus(INITIAL);
			// 会社コード取得
			_company_cd = SystemInformation.getSysMyCompanyCd();

		} catch (SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		} catch (ComboException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AD0090");
		logger.entering("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AD0090010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Detail") ) {
				controlDetail();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("CancelComplete") ) {
				controlCancelComplete();
			} else if( button.equals("MainTain") ) {
				controlMainTain();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("PrintShow") ) {
				controlPrintShow();
			} else if( button.equals("LotInsert") ) {
				controlLotInsert();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			if(lotCtrlFlg){
				struct.seth_SYS_LOT_CTRL_FLG("true");
			}else{
				struct.seth_SYS_LOT_CTRL_FLG("false");
			}

			//コンボボックスのセット
			struct.setList_OPR_TIME_UNIT_TYP_val(_oprTimeUnitTtpStruct.getValList());
			struct.setList_OPR_TIME_UNIT_TYP_name(_oprTimeUnitTtpStruct.getExplanList());
	        struct.setList_l_DEFECT_CAUSE_CD_val(DEFECT_CAUSE_CD.getValList());
	        struct.setList_l_DEFECT_CAUSE_CD_name(DEFECT_CAUSE_CD.getExplanList());
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
//			throw new FoundationException("AD0090010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","CSVの出力処理"));
			throw new FoundationException("AD0090010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","システム日付の取得処理"));
				throw new FoundationException("AD0090010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AD0090010-E999","コントロールのイベント処理"));
			throw new FoundationException("AD0090010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AD0090010Entity entity;
	protected AD0090010Struct struct;
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

		entity = new AD0090010Entity();
		struct = new AD0090010Struct();

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
	 * AD0090010クラスの標準コンストラクタ
	 */
	public AD0090010Control() throws BusinessProcessException, FoundationException
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
				AD0090010Struct key = (AD0090010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("chk_COMPLETE") && key.getchk_COMPLETE() != null) {
					msgKey.setKeyValue("chk_COMPLETE", key.getchk_COMPLETE());
				}
				if(msgKeyType.containsKeyColumn("OPRATION_TIME") && key.getOPRATION_TIME() != null) {
					msgKey.setKeyValue("OPRATION_TIME", key.getOPRATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("chk_OUTPUT") && key.getchk_OUTPUT() != null) {
					msgKey.setKeyValue("chk_OUTPUT", key.getchk_OUTPUT());
				}
				if(msgKeyType.containsKeyColumn("d1_STOCK_UNIT") && key.getd1_STOCK_UNIT() != null) {
					msgKey.setKeyValue("d1_STOCK_UNIT", key.getd1_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name") && key.getOPR_TIME_UNIT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_name", key.getOPR_TIME_UNIT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val") && key.getOPR_TIME_UNIT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP_val", key.getOPR_TIME_UNIT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name") && key.getl_DEFECT_CAUSE_CD_name() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_name", key.getl_DEFECT_CAUSE_CD_name());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val") && key.getl_DEFECT_CAUSE_CD_val() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD_val", key.getl_DEFECT_CAUSE_CD_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG") && key.geth_FINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("h_FINAL_PROC_FLG", key.geth_FINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG") && key.geth_SYS_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_SYS_LOT_CTRL_FLG", key.geth_SYS_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("chk_CHILD_RSLTUPDATE") && key.getchk_CHILD_RSLTUPDATE() != null) {
					msgKey.setKeyValue("chk_CHILD_RSLTUPDATE", key.getchk_CHILD_RSLTUPDATE());
				}
				if(msgKeyType.containsKeyColumn("param1") && key.getparam1() != null) {
					msgKey.setKeyValue("param1", key.getparam1());
				}
				if(msgKeyType.containsKeyColumn("param2") && key.getparam2() != null) {
					msgKey.setKeyValue("param2", key.getparam2());
				}
				if(msgKeyType.containsKeyColumn("param3") && key.getparam3() != null) {
					msgKey.setKeyValue("param3", key.getparam3());
				}
				if(msgKeyType.containsKeyColumn("h_PROCESS_MANAGE_FLG") && key.geth_PROCESS_MANAGE_FLG() != null) {
					msgKey.setKeyValue("h_PROCESS_MANAGE_FLG", key.geth_PROCESS_MANAGE_FLG());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY") && key.getTEMP_PLAN_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLAN_QTY", key.getTEMP_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY") && key.getTEMP_USEOVER_QTY() != null) {
					msgKey.setKeyValue("TEMP_USEOVER_QTY", key.getTEMP_USEOVER_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY") && key.getTEMP_PLANOUT_QTY() != null) {
					msgKey.setKeyValue("TEMP_PLANOUT_QTY", key.getTEMP_PLANOUT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TEMP_USE_QTY") && key.getTEMP_USE_QTY() != null) {
					msgKey.setKeyValue("TEMP_USE_QTY", key.getTEMP_USE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_PARTIAL_PRD_NO") && key.getl_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("l_PARTIAL_PRD_NO", key.getl_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("FIRST_WORK_FLG") && key.getFIRST_WORK_FLG() != null) {
					msgKey.setKeyValue("FIRST_WORK_FLG", key.getFIRST_WORK_FLG());
				}
				if(msgKeyType.containsKeyColumn("USE_LOT_NO") && key.getUSE_LOT_NO() != null) {
					msgKey.setKeyValue("USE_LOT_NO", key.getUSE_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("USE_ACPT_QTY") && key.getUSE_ACPT_QTY() != null) {
					msgKey.setKeyValue("USE_ACPT_QTY", key.getUSE_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("USE_DEFECT_QTY") && key.getUSE_DEFECT_QTY() != null) {
					msgKey.setKeyValue("USE_DEFECT_QTY", key.getUSE_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD") && key.getIN_OPR_INST_CD() != null) {
					msgKey.setKeyValue("IN_OPR_INST_CD", key.getIN_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO") && key.getPARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PARTIAL_PRD_NO", key.getPARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_NAME") && key.getPROC_NAME() != null) {
					msgKey.setKeyValue("PROC_NAME", key.getPROC_NAME());
				}
				if(msgKeyType.containsKeyColumn("PROC_NO") && key.getPROC_NO() != null) {
					msgKey.setKeyValue("PROC_NO", key.getPROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PROC_MODIFY_COUNT") && key.getPROC_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PROC_MODIFY_COUNT", key.getPROC_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG") && key.getFINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("FINAL_PROC_FLG", key.getFINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE") && key.getWORK_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("WORK_ODR_DLV_DATE", key.getWORK_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE") && key.getOPR_INST_START_DATE() != null) {
					msgKey.setKeyValue("OPR_INST_START_DATE", key.getOPR_INST_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_QTY") && key.getOPR_INST_QTY() != null) {
					msgKey.setKeyValue("OPR_INST_QTY", key.getOPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
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
				if(msgKeyType.containsKeyColumn("WS_NAME") && key.getWS_NAME() != null) {
					msgKey.setKeyValue("WS_NAME", key.getWS_NAME());
				}
				if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY") && key.getSUM_ACPT_QTY() != null) {
					msgKey.setKeyValue("SUM_ACPT_QTY", key.getSUM_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY") && key.getSUM_DEFECT_QTY() != null) {
					msgKey.setKeyValue("SUM_DEFECT_QTY", key.getSUM_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT") && key.getITEM_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ITEM_MODIFY_COUNT", key.getITEM_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_DATE") && key.geth_OPR_DATE() != null) {
					msgKey.setKeyValue("h_OPR_DATE", key.geth_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_TIME") && key.geth_BUSINESS_OPR_TIME() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_TIME", key.geth_BUSINESS_OPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("FORM_SET_ITEM_CD") && key.getFORM_SET_ITEM_CD() != null) {
					msgKey.setKeyValue("FORM_SET_ITEM_CD", key.getFORM_SET_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP") && key.getPAST_RESULT_ENTRY_TYP() != null) {
					msgKey.setKeyValue("PAST_RESULT_ENTRY_TYP", key.getPAST_RESULT_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OPR_DATE") && key.getOPR_DATE() != null) {
					msgKey.setKeyValue("OPR_DATE", key.getOPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON") && key.getOPR_RSLT_PERSON() != null) {
					msgKey.setKeyValue("OPR_RSLT_PERSON", key.getOPR_RSLT_PERSON());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT") && key.getOPR_RSLT_COMMENT() != null) {
					msgKey.setKeyValue("OPR_RSLT_COMMENT", key.getOPR_RSLT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP") && key.getOPR_TIME_UNIT_TYP() != null) {
					msgKey.setKeyValue("OPR_TIME_UNIT_TYP", key.getOPR_TIME_UNIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME") && key.getPRE_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("PRE_ARRANGEMENT_TIME", key.getPRE_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME") && key.getPOST_ARRANGEMENT_TIME() != null) {
					msgKey.setKeyValue("POST_ARRANGEMENT_TIME", key.getPOST_ARRANGEMENT_TIME());
				}
				if(msgKeyType.containsKeyColumn("OPR_TIME") && key.getOPR_TIME() != null) {
					msgKey.setKeyValue("OPR_TIME", key.getOPR_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_TIME") && key.getCESSATION_TIME() != null) {
					msgKey.setKeyValue("CESSATION_TIME", key.getCESSATION_TIME());
				}
				if(msgKeyType.containsKeyColumn("CESSATION_CAUSE") && key.getCESSATION_CAUSE() != null) {
					msgKey.setKeyValue("CESSATION_CAUSE", key.getCESSATION_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD") && key.getOUTPUT_RSLT_CD() != null) {
					msgKey.setKeyValue("OUTPUT_RSLT_CD", key.getOUTPUT_RSLT_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("OPR_CRCT_NO") && key.getOPR_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_CRCT_NO", key.getOPR_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("UPDATE_WORK_STS_TYP") && key.getUPDATE_WORK_STS_TYP() != null) {
					msgKey.setKeyValue("UPDATE_WORK_STS_TYP", key.getUPDATE_WORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO") && key.getOPR_RSLT_CRCT_NO() != null) {
					msgKey.setKeyValue("OPR_RSLT_CRCT_NO", key.getOPR_RSLT_CRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD") && key.geth_ISSUE_INST_CD() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_CD", key.geth_ISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY") && key.getSAVE_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("SAVE_STOCK_ON_HAND_QTY", key.getSAVE_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY") && key.getRCV_ISSUE_ODD_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_ODD_QTY", key.getRCV_ISSUE_ODD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP") && key.getSTOCK_UPD_TYP() != null) {
					msgKey.setKeyValue("STOCK_UPD_TYP", key.getSTOCK_UPD_TYP());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP") && key.getPARENT_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PARENT_OUTSIDE_TYP", key.getPARENT_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP") && key.getPARENT_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("PARENT_MRP_ODR_TYP", key.getPARENT_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("PARENT_WORK_ODR_CD") && key.getPARENT_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("PARENT_WORK_ODR_CD", key.getPARENT_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_WORK_IN_PROC_CD") && key.getPARENT_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("PARENT_WORK_IN_PROC_CD", key.getPARENT_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_PUCH_ODR_CD") && key.getPARENT_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PARENT_PUCH_ODR_CD", key.getPARENT_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM") && key.getUPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPDATED_PRG_NM", key.getUPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("GET_IDENT_CARD_CTL_NO") && key.getGET_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("GET_IDENT_CARD_CTL_NO", key.getGET_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SEL_OPR_INST_CD") && key.getSEL_OPR_INST_CD() != null) {
					msgKey.setKeyValue("SEL_OPR_INST_CD", key.getSEL_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_PARTIAL_PRD_NO") && key.getSEL_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("SEL_PARTIAL_PRD_NO", key.getSEL_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("SEL_ITEM_CD") && key.getSEL_ITEM_CD() != null) {
					msgKey.setKeyValue("SEL_ITEM_CD", key.getSEL_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_ACPT_QTY") && key.getSEL_ACPT_QTY() != null) {
					msgKey.setKeyValue("SEL_ACPT_QTY", key.getSEL_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEL_OPR_DATE") && key.getSEL_OPR_DATE() != null) {
					msgKey.setKeyValue("SEL_OPR_DATE", key.getSEL_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("SEL_PKG_UNIT_QTY") && key.getSEL_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("SEL_PKG_UNIT_QTY", key.getSEL_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SEL_PLANT_CD") && key.getSEL_PLANT_CD() != null) {
					msgKey.setKeyValue("SEL_PLANT_CD", key.getSEL_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SEL_WS_CD") && key.getSEL_WS_CD() != null) {
					msgKey.setKeyValue("SEL_WS_CD", key.getSEL_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO") && key.getINS_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_CTL_NO", key.getINS_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD") && key.getINS_OPR_INST_CD() != null) {
					msgKey.setKeyValue("INS_OPR_INST_CD", key.getINS_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO") && key.getINS_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("INS_PARTIAL_PRD_NO", key.getINS_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD") && key.getINS_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("INS_RCV_ISSUE_CTRL_CD", key.getINS_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_ITEM_CD") && key.getINS_ITEM_CD() != null) {
					msgKey.setKeyValue("INS_ITEM_CD", key.getINS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD") && key.getINS_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("INS_JOB_ODR_CD", key.getINS_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY") && key.getINS_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_FIRST_IDENT_CARD_QTY", key.getINS_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY") && key.getINS_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("INS_IDENT_CARD_QTY", key.getINS_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_OPR_DATE") && key.getINS_OPR_DATE() != null) {
					msgKey.setKeyValue("INS_OPR_DATE", key.getINS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY") && key.getINS_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("INS_PKG_UNIT_QTY", key.getINS_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INS_PLANT_CD") && key.getINS_PLANT_CD() != null) {
					msgKey.setKeyValue("INS_PLANT_CD", key.getINS_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_WS_CD") && key.getINS_WS_CD() != null) {
					msgKey.setKeyValue("INS_WS_CD", key.getINS_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD") && key.getl_DEFECT_CAUSE_CD() != null) {
					msgKey.setKeyValue("l_DEFECT_CAUSE_CD", key.getl_DEFECT_CAUSE_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_QTY") && key.getl_DEFECT_QTY() != null) {
					msgKey.setKeyValue("l_DEFECT_QTY", key.getl_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT") && key.getl_DEFECT_COMMENT() != null) {
					msgKey.setKeyValue("l_DEFECT_COMMENT", key.getl_DEFECT_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO") && key.getRSLT_CTRL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTRL_SEQ_NO", key.getRSLT_CTRL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY") && key.getSUPPLIED_ISSUE_QTY() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY", key.getSUPPLIED_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_sum") && key.getSUPPLIED_ISSUE_QTY_sum() != null) {
					msgKey.setKeyValue("SUPPLIED_ISSUE_QTY_sum", key.getSUPPLIED_ISSUE_QTY_sum());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_DENOMINATOR") && key.geth_ISSUE_INST_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_UNIT_DENOMINATOR", key.geth_ISSUE_INST_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_NUMERATOR") && key.geth_ISSUE_INST_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("h_ISSUE_INST_UNIT_NUMERATOR", key.geth_ISSUE_INST_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("count_RCV_ISSUE") && key.getcount_RCV_ISSUE() != null) {
					msgKey.setKeyValue("count_RCV_ISSUE", key.getcount_RCV_ISSUE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("SPENT_QTY") && key.getSPENT_QTY() != null) {
					msgKey.setKeyValue("SPENT_QTY", key.getSPENT_QTY());
				}
				if(msgKeyType.containsKeyColumn("NEXTVAL") && key.getNEXTVAL() != null) {
					msgKey.setKeyValue("NEXTVAL", key.getNEXTVAL());
				}
				if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO") && key.getRSLT_CTL_SEQ_NO() != null) {
					msgKey.setKeyValue("RSLT_CTL_SEQ_NO", key.getRSLT_CTL_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT") && key.getPART_SUPPLIED_COMMENT() != null) {
					msgKey.setKeyValue("PART_SUPPLIED_COMMENT", key.getPART_SUPPLIED_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("SUPPLIED_DATE") && key.getSUPPLIED_DATE() != null) {
					msgKey.setKeyValue("SUPPLIED_DATE", key.getSUPPLIED_DATE());
				}
				if(msgKeyType.containsKeyColumn("ALCD_QTY") && key.getALCD_QTY() != null) {
					msgKey.setKeyValue("ALCD_QTY", key.getALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO") && key.getTMP_IDENT_CARD_CTL_NO() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_CTL_NO", key.getTMP_IDENT_CARD_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD") && key.getTMP_OPR_INST_CD() != null) {
					msgKey.setKeyValue("TMP_OPR_INST_CD", key.getTMP_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO") && key.getTMP_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("TMP_PARTIAL_PRD_NO", key.getTMP_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD") && key.getTMP_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("TMP_RCV_ISSUE_CTRL_CD", key.getTMP_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_ITEM_CD") && key.getTMP_ITEM_CD() != null) {
					msgKey.setKeyValue("TMP_ITEM_CD", key.getTMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD") && key.getTMP_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("TMP_JOB_ODR_CD", key.getTMP_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY") && key.getTMP_FIRST_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_FIRST_IDENT_CARD_QTY", key.getTMP_FIRST_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY") && key.getTMP_IDENT_CARD_QTY() != null) {
					msgKey.setKeyValue("TMP_IDENT_CARD_QTY", key.getTMP_IDENT_CARD_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_OPR_DATE") && key.getTMP_OPR_DATE() != null) {
					msgKey.setKeyValue("TMP_OPR_DATE", key.getTMP_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY") && key.getTMP_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("TMP_PKG_UNIT_QTY", key.getTMP_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TMP_PLANT_CD") && key.getTMP_PLANT_CD() != null) {
					msgKey.setKeyValue("TMP_PLANT_CD", key.getTMP_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TMP_WS_CD") && key.getTMP_WS_CD() != null) {
					msgKey.setKeyValue("TMP_WS_CD", key.getTMP_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO") && key.getINS_PRINT_GRP_NO() != null) {
					msgKey.setKeyValue("INS_PRINT_GRP_NO", key.getINS_PRINT_GRP_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_PAGE_NO") && key.getINS_PAGE_NO() != null) {
					msgKey.setKeyValue("INS_PAGE_NO", key.getINS_PAGE_NO());
				}
				if(msgKeyType.containsKeyColumn("INS_PRINT_QTY") && key.getINS_PRINT_QTY() != null) {
					msgKey.setKeyValue("INS_PRINT_QTY", key.getINS_PRINT_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE") && key.getISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("ISSUE_CMPLT_DATE", key.getISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WH_CD") && key.getNEXT_WH_CD() != null) {
					msgKey.setKeyValue("NEXT_WH_CD", key.getNEXT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("FIRST_OPR_INST_CD") && key.getFIRST_OPR_INST_CD() != null) {
					msgKey.setKeyValue("FIRST_OPR_INST_CD", key.getFIRST_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("FIRST_PROC_NO") && key.getFIRST_PROC_NO() != null) {
					msgKey.setKeyValue("FIRST_PROC_NO", key.getFIRST_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WORK_ODR_CD") && key.getNEXT_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("NEXT_WORK_ODR_CD", key.getNEXT_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("NEXT_OPR_INST_CD") && key.getNEXT_OPR_INST_CD() != null) {
					msgKey.setKeyValue("NEXT_OPR_INST_CD", key.getNEXT_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("NEXT_PROC_NO") && key.getNEXT_PROC_NO() != null) {
					msgKey.setKeyValue("NEXT_PROC_NO", key.getNEXT_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WS_CD") && key.getNEXT_WS_CD() != null) {
					msgKey.setKeyValue("NEXT_WS_CD", key.getNEXT_WS_CD());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WS_NAME") && key.getNEXT_WS_NAME() != null) {
					msgKey.setKeyValue("NEXT_WS_NAME", key.getNEXT_WS_NAME());
				}
				if(msgKeyType.containsKeyColumn("NEXT_WH_NAME") && key.getNEXT_WH_NAME() != null) {
					msgKey.setKeyValue("NEXT_WH_NAME", key.getNEXT_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("PREV_WORK_ODR_CD") && key.getPREV_WORK_ODR_CD() != null) {
					msgKey.setKeyValue("PREV_WORK_ODR_CD", key.getPREV_WORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("PREV_OPR_INST_CD") && key.getPREV_OPR_INST_CD() != null) {
					msgKey.setKeyValue("PREV_OPR_INST_CD", key.getPREV_OPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("PREV_PARTIAL_PRD_NO") && key.getPREV_PARTIAL_PRD_NO() != null) {
					msgKey.setKeyValue("PREV_PARTIAL_PRD_NO", key.getPREV_PARTIAL_PRD_NO());
				}
				if(msgKeyType.containsKeyColumn("PREV_PROC_NO") && key.getPREV_PROC_NO() != null) {
					msgKey.setKeyValue("PREV_PROC_NO", key.getPREV_PROC_NO());
				}
				if(msgKeyType.containsKeyColumn("PREV_WH_CD") && key.getPREV_WH_CD() != null) {
					msgKey.setKeyValue("PREV_WH_CD", key.getPREV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("DATA_COUNT") && key.getDATA_COUNT() != null) {
					msgKey.setKeyValue("DATA_COUNT", key.getDATA_COUNT());
				}
				if(msgKeyType.containsKeyColumn("WH_CD_COUNT") && key.getWH_CD_COUNT() != null) {
					msgKey.setKeyValue("WH_CD_COUNT", key.getWH_CD_COUNT());
				}
				if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD") && key.getFROM_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("FROM_PUCH_ODR_CD", key.getFROM_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD") && key.getTO_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("TO_PUCH_ODR_CD", key.getTO_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_ITEM_CD") && key.getFROM_ITEM_CD() != null) {
					msgKey.setKeyValue("FROM_ITEM_CD", key.getFROM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("FROM_LOT_NO") && key.getFROM_LOT_NO() != null) {
					msgKey.setKeyValue("FROM_LOT_NO", key.getFROM_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("TO_ITEM_CD") && key.getTO_ITEM_CD() != null) {
					msgKey.setKeyValue("TO_ITEM_CD", key.getTO_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TO_LOT_NO") && key.getTO_LOT_NO() != null) {
					msgKey.setKeyValue("TO_LOT_NO", key.getTO_LOT_NO());
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
					AD0090010Struct key = new AD0090010Struct();
					if(msgKeyType.containsKeyColumn("chk_COMPLETE")) {
						key.setchk_COMPLETE(msgKey.getKeyValue("chk_COMPLETE"));
					}
					if(msgKeyType.containsKeyColumn("OPRATION_TIME")) {
						key.setOPRATION_TIME(msgKey.getKeyValue("OPRATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("chk_OUTPUT")) {
						key.setchk_OUTPUT(msgKey.getKeyValue("chk_OUTPUT"));
					}
					if(msgKeyType.containsKeyColumn("d1_STOCK_UNIT")) {
						key.setd1_STOCK_UNIT(msgKey.getKeyValue("d1_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_name")) {
						key.setOPR_TIME_UNIT_TYP_name(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP_val")) {
						key.setOPR_TIME_UNIT_TYP_val(msgKey.getKeyValue("OPR_TIME_UNIT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_name")) {
						key.setl_DEFECT_CAUSE_CD_name(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD_val")) {
						key.setl_DEFECT_CAUSE_CD_val(msgKey.getKeyValue("l_DEFECT_CAUSE_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("h_FINAL_PROC_FLG")) {
						key.seth_FINAL_PROC_FLG(msgKey.getKeyValue("h_FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_SYS_LOT_CTRL_FLG")) {
						key.seth_SYS_LOT_CTRL_FLG(msgKey.getKeyValue("h_SYS_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("chk_CHILD_RSLTUPDATE")) {
						key.setchk_CHILD_RSLTUPDATE(msgKey.getKeyValue("chk_CHILD_RSLTUPDATE"));
					}
					if(msgKeyType.containsKeyColumn("param1")) {
						key.setparam1(msgKey.getKeyValue("param1"));
					}
					if(msgKeyType.containsKeyColumn("param2")) {
						key.setparam2(msgKey.getKeyValue("param2"));
					}
					if(msgKeyType.containsKeyColumn("param3")) {
						key.setparam3(msgKey.getKeyValue("param3"));
					}
					if(msgKeyType.containsKeyColumn("h_PROCESS_MANAGE_FLG")) {
						key.seth_PROCESS_MANAGE_FLG(msgKey.getKeyValue("h_PROCESS_MANAGE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLAN_QTY")) {
						key.setTEMP_PLAN_QTY(msgKey.getKeyValue("TEMP_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USEOVER_QTY")) {
						key.setTEMP_USEOVER_QTY(msgKey.getKeyValue("TEMP_USEOVER_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_PLANOUT_QTY")) {
						key.setTEMP_PLANOUT_QTY(msgKey.getKeyValue("TEMP_PLANOUT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_USE_QTY")) {
						key.setTEMP_USE_QTY(msgKey.getKeyValue("TEMP_USE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_PARTIAL_PRD_NO")) {
						key.setl_PARTIAL_PRD_NO(msgKey.getKeyValue("l_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_WORK_FLG")) {
						key.setFIRST_WORK_FLG(msgKey.getKeyValue("FIRST_WORK_FLG"));
					}
					if(msgKeyType.containsKeyColumn("USE_LOT_NO")) {
						key.setUSE_LOT_NO(msgKey.getKeyValue("USE_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("USE_ACPT_QTY")) {
						key.setUSE_ACPT_QTY(msgKey.getKeyValue("USE_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("USE_DEFECT_QTY")) {
						key.setUSE_DEFECT_QTY(msgKey.getKeyValue("USE_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IN_OPR_INST_CD")) {
						key.setIN_OPR_INST_CD(msgKey.getKeyValue("IN_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_PRD_NO")) {
						key.setPARTIAL_PRD_NO(msgKey.getKeyValue("PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NAME")) {
						key.setPROC_NAME(msgKey.getKeyValue("PROC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PROC_NO")) {
						key.setPROC_NO(msgKey.getKeyValue("PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROC_MODIFY_COUNT")) {
						key.setPROC_MODIFY_COUNT(msgKey.getKeyValue("PROC_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG")) {
						key.setFINAL_PROC_FLG(msgKey.getKeyValue("FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_DLV_DATE")) {
						key.setWORK_ODR_DLV_DATE(msgKey.getKeyValue("WORK_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_START_DATE")) {
						key.setOPR_INST_START_DATE(msgKey.getKeyValue("OPR_INST_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_QTY")) {
						key.setOPR_INST_QTY(msgKey.getKeyValue("OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(msgKey.getKeyValue("LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
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
					if(msgKeyType.containsKeyColumn("WS_NAME")) {
						key.setWS_NAME(msgKey.getKeyValue("WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ACPT_QTY")) {
						key.setSUM_ACPT_QTY(msgKey.getKeyValue("SUM_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_DEFECT_QTY")) {
						key.setSUM_DEFECT_QTY(msgKey.getKeyValue("SUM_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT")) {
						key.setITEM_MODIFY_COUNT(msgKey.getKeyValue("ITEM_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_DATE")) {
						key.seth_OPR_DATE(msgKey.getKeyValue("h_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_TIME")) {
						key.seth_BUSINESS_OPR_TIME(msgKey.getKeyValue("h_BUSINESS_OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("FORM_SET_ITEM_CD")) {
						key.setFORM_SET_ITEM_CD(msgKey.getKeyValue("FORM_SET_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAST_RESULT_ENTRY_TYP")) {
						key.setPAST_RESULT_ENTRY_TYP(msgKey.getKeyValue("PAST_RESULT_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OPR_DATE")) {
						key.setOPR_DATE(msgKey.getKeyValue("OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_PERSON")) {
						key.setOPR_RSLT_PERSON(msgKey.getKeyValue("OPR_RSLT_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_COMMENT")) {
						key.setOPR_RSLT_COMMENT(msgKey.getKeyValue("OPR_RSLT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME_UNIT_TYP")) {
						key.setOPR_TIME_UNIT_TYP(msgKey.getKeyValue("OPR_TIME_UNIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRE_ARRANGEMENT_TIME")) {
						key.setPRE_ARRANGEMENT_TIME(msgKey.getKeyValue("PRE_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("POST_ARRANGEMENT_TIME")) {
						key.setPOST_ARRANGEMENT_TIME(msgKey.getKeyValue("POST_ARRANGEMENT_TIME"));
					}
					if(msgKeyType.containsKeyColumn("OPR_TIME")) {
						key.setOPR_TIME(msgKey.getKeyValue("OPR_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_TIME")) {
						key.setCESSATION_TIME(msgKey.getKeyValue("CESSATION_TIME"));
					}
					if(msgKeyType.containsKeyColumn("CESSATION_CAUSE")) {
						key.setCESSATION_CAUSE(msgKey.getKeyValue("CESSATION_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_RSLT_CD")) {
						key.setOUTPUT_RSLT_CD(msgKey.getKeyValue("OUTPUT_RSLT_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("OPR_CRCT_NO")) {
						key.setOPR_CRCT_NO(msgKey.getKeyValue("OPR_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("UPDATE_WORK_STS_TYP")) {
						key.setUPDATE_WORK_STS_TYP(msgKey.getKeyValue("UPDATE_WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(msgKey.getKeyValue("RCV_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_CRCT_NO")) {
						key.setOPR_RSLT_CRCT_NO(msgKey.getKeyValue("OPR_RSLT_CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_CD")) {
						key.seth_ISSUE_INST_CD(msgKey.getKeyValue("h_ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SAVE_STOCK_ON_HAND_QTY")) {
						key.setSAVE_STOCK_ON_HAND_QTY(msgKey.getKeyValue("SAVE_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_ODD_QTY")) {
						key.setRCV_ISSUE_ODD_QTY(msgKey.getKeyValue("RCV_ISSUE_ODD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UPD_TYP")) {
						key.setSTOCK_UPD_TYP(msgKey.getKeyValue("STOCK_UPD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(msgKey.getKeyValue("MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP")) {
						key.setPARENT_OUTSIDE_TYP(msgKey.getKeyValue("PARENT_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_MRP_ODR_TYP")) {
						key.setPARENT_MRP_ODR_TYP(msgKey.getKeyValue("PARENT_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_WORK_ODR_CD")) {
						key.setPARENT_WORK_ODR_CD(msgKey.getKeyValue("PARENT_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_WORK_IN_PROC_CD")) {
						key.setPARENT_WORK_IN_PROC_CD(msgKey.getKeyValue("PARENT_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_PUCH_ODR_CD")) {
						key.setPARENT_PUCH_ODR_CD(msgKey.getKeyValue("PARENT_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM")) {
						key.setUPDATED_PRG_NM(msgKey.getKeyValue("UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("GET_IDENT_CARD_CTL_NO")) {
						key.setGET_IDENT_CARD_CTL_NO(msgKey.getKeyValue("GET_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OPR_INST_CD")) {
						key.setSEL_OPR_INST_CD(msgKey.getKeyValue("SEL_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PARTIAL_PRD_NO")) {
						key.setSEL_PARTIAL_PRD_NO(msgKey.getKeyValue("SEL_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ITEM_CD")) {
						key.setSEL_ITEM_CD(msgKey.getKeyValue("SEL_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_ACPT_QTY")) {
						key.setSEL_ACPT_QTY(msgKey.getKeyValue("SEL_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEL_OPR_DATE")) {
						key.setSEL_OPR_DATE(msgKey.getKeyValue("SEL_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PKG_UNIT_QTY")) {
						key.setSEL_PKG_UNIT_QTY(msgKey.getKeyValue("SEL_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SEL_PLANT_CD")) {
						key.setSEL_PLANT_CD(msgKey.getKeyValue("SEL_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEL_WS_CD")) {
						key.setSEL_WS_CD(msgKey.getKeyValue("SEL_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_CTL_NO")) {
						key.setINS_IDENT_CARD_CTL_NO(msgKey.getKeyValue("INS_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_INST_CD")) {
						key.setINS_OPR_INST_CD(msgKey.getKeyValue("INS_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PARTIAL_PRD_NO")) {
						key.setINS_PARTIAL_PRD_NO(msgKey.getKeyValue("INS_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_RCV_ISSUE_CTRL_CD")) {
						key.setINS_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("INS_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_ITEM_CD")) {
						key.setINS_ITEM_CD(msgKey.getKeyValue("INS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_JOB_ODR_CD")) {
						key.setINS_JOB_ODR_CD(msgKey.getKeyValue("INS_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_FIRST_IDENT_CARD_QTY")) {
						key.setINS_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("INS_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_IDENT_CARD_QTY")) {
						key.setINS_IDENT_CARD_QTY(msgKey.getKeyValue("INS_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_OPR_DATE")) {
						key.setINS_OPR_DATE(msgKey.getKeyValue("INS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INS_PKG_UNIT_QTY")) {
						key.setINS_PKG_UNIT_QTY(msgKey.getKeyValue("INS_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INS_PLANT_CD")) {
						key.setINS_PLANT_CD(msgKey.getKeyValue("INS_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_WS_CD")) {
						key.setINS_WS_CD(msgKey.getKeyValue("INS_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_CAUSE_CD")) {
						key.setl_DEFECT_CAUSE_CD(msgKey.getKeyValue("l_DEFECT_CAUSE_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_QTY")) {
						key.setl_DEFECT_QTY(msgKey.getKeyValue("l_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_DEFECT_COMMENT")) {
						key.setl_DEFECT_COMMENT(msgKey.getKeyValue("l_DEFECT_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTRL_SEQ_NO")) {
						key.setRSLT_CTRL_SEQ_NO(msgKey.getKeyValue("RSLT_CTRL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY")) {
						key.setSUPPLIED_ISSUE_QTY(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_ISSUE_QTY_sum")) {
						key.setSUPPLIED_ISSUE_QTY_sum(msgKey.getKeyValue("SUPPLIED_ISSUE_QTY_sum"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_DENOMINATOR")) {
						key.seth_ISSUE_INST_UNIT_DENOMINATOR(msgKey.getKeyValue("h_ISSUE_INST_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_INST_UNIT_NUMERATOR")) {
						key.seth_ISSUE_INST_UNIT_NUMERATOR(msgKey.getKeyValue("h_ISSUE_INST_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("count_RCV_ISSUE")) {
						key.setcount_RCV_ISSUE(msgKey.getKeyValue("count_RCV_ISSUE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SPENT_QTY")) {
						key.setSPENT_QTY(msgKey.getKeyValue("SPENT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("NEXTVAL")) {
						key.setNEXTVAL(msgKey.getKeyValue("NEXTVAL"));
					}
					if(msgKeyType.containsKeyColumn("RSLT_CTL_SEQ_NO")) {
						key.setRSLT_CTL_SEQ_NO(msgKey.getKeyValue("RSLT_CTL_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PART_SUPPLIED_COMMENT")) {
						key.setPART_SUPPLIED_COMMENT(msgKey.getKeyValue("PART_SUPPLIED_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("SUPPLIED_DATE")) {
						key.setSUPPLIED_DATE(msgKey.getKeyValue("SUPPLIED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ALCD_QTY")) {
						key.setALCD_QTY(msgKey.getKeyValue("ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_CTL_NO")) {
						key.setTMP_IDENT_CARD_CTL_NO(msgKey.getKeyValue("TMP_IDENT_CARD_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_INST_CD")) {
						key.setTMP_OPR_INST_CD(msgKey.getKeyValue("TMP_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PARTIAL_PRD_NO")) {
						key.setTMP_PARTIAL_PRD_NO(msgKey.getKeyValue("TMP_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("TMP_RCV_ISSUE_CTRL_CD")) {
						key.setTMP_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("TMP_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_ITEM_CD")) {
						key.setTMP_ITEM_CD(msgKey.getKeyValue("TMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_JOB_ODR_CD")) {
						key.setTMP_JOB_ODR_CD(msgKey.getKeyValue("TMP_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_FIRST_IDENT_CARD_QTY")) {
						key.setTMP_FIRST_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_FIRST_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_IDENT_CARD_QTY")) {
						key.setTMP_IDENT_CARD_QTY(msgKey.getKeyValue("TMP_IDENT_CARD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_OPR_DATE")) {
						key.setTMP_OPR_DATE(msgKey.getKeyValue("TMP_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PKG_UNIT_QTY")) {
						key.setTMP_PKG_UNIT_QTY(msgKey.getKeyValue("TMP_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TMP_PLANT_CD")) {
						key.setTMP_PLANT_CD(msgKey.getKeyValue("TMP_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TMP_WS_CD")) {
						key.setTMP_WS_CD(msgKey.getKeyValue("TMP_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_GRP_NO")) {
						key.setINS_PRINT_GRP_NO(msgKey.getKeyValue("INS_PRINT_GRP_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_PAGE_NO")) {
						key.setINS_PAGE_NO(msgKey.getKeyValue("INS_PAGE_NO"));
					}
					if(msgKeyType.containsKeyColumn("INS_PRINT_QTY")) {
						key.setINS_PRINT_QTY(msgKey.getKeyValue("INS_PRINT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_CMPLT_DATE")) {
						key.setISSUE_CMPLT_DATE(msgKey.getKeyValue("ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WH_CD")) {
						key.setNEXT_WH_CD(msgKey.getKeyValue("NEXT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_OPR_INST_CD")) {
						key.setFIRST_OPR_INST_CD(msgKey.getKeyValue("FIRST_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIRST_PROC_NO")) {
						key.setFIRST_PROC_NO(msgKey.getKeyValue("FIRST_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WORK_ODR_CD")) {
						key.setNEXT_WORK_ODR_CD(msgKey.getKeyValue("NEXT_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_OPR_INST_CD")) {
						key.setNEXT_OPR_INST_CD(msgKey.getKeyValue("NEXT_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_PROC_NO")) {
						key.setNEXT_PROC_NO(msgKey.getKeyValue("NEXT_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WS_CD")) {
						key.setNEXT_WS_CD(msgKey.getKeyValue("NEXT_WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WS_NAME")) {
						key.setNEXT_WS_NAME(msgKey.getKeyValue("NEXT_WS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NEXT_WH_NAME")) {
						key.setNEXT_WH_NAME(msgKey.getKeyValue("NEXT_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PREV_WORK_ODR_CD")) {
						key.setPREV_WORK_ODR_CD(msgKey.getKeyValue("PREV_WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("PREV_OPR_INST_CD")) {
						key.setPREV_OPR_INST_CD(msgKey.getKeyValue("PREV_OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("PREV_PARTIAL_PRD_NO")) {
						key.setPREV_PARTIAL_PRD_NO(msgKey.getKeyValue("PREV_PARTIAL_PRD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PREV_PROC_NO")) {
						key.setPREV_PROC_NO(msgKey.getKeyValue("PREV_PROC_NO"));
					}
					if(msgKeyType.containsKeyColumn("PREV_WH_CD")) {
						key.setPREV_WH_CD(msgKey.getKeyValue("PREV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("DATA_COUNT")) {
						key.setDATA_COUNT(msgKey.getKeyValue("DATA_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD_COUNT")) {
						key.setWH_CD_COUNT(msgKey.getKeyValue("WH_CD_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FROM_PUCH_ODR_CD")) {
						key.setFROM_PUCH_ODR_CD(msgKey.getKeyValue("FROM_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_PUCH_ODR_CD")) {
						key.setTO_PUCH_ODR_CD(msgKey.getKeyValue("TO_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_ITEM_CD")) {
						key.setFROM_ITEM_CD(msgKey.getKeyValue("FROM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("FROM_LOT_NO")) {
						key.setFROM_LOT_NO(msgKey.getKeyValue("FROM_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("TO_ITEM_CD")) {
						key.setTO_ITEM_CD(msgKey.getKeyValue("TO_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TO_LOT_NO")) {
						key.setTO_LOT_NO(msgKey.getKeyValue("TO_LOT_NO"));
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
