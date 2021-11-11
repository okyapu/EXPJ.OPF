/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AJ0020/src/com/nec/jp/orteus/metamorBase/AJ0020/AJ0020010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AJ0020;

import com.nec.jp.orteus.metamorBase.AJ0020.*;
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
import com.nec.jp.orteus.expj.util.PrivateConfig;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * 製番別進捗一覧（AJ0020）
 * 
 * 説明　:　製番別の進捗一覧を表示します。
 * 会社名:  NECソフト
 * 
 * @version 0.01　2006/06/28　Ver2.4.2 PJ改造　回答納期を追加
 */
//}}user_implement_code_header

public class AJ0020010Control
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
	public List getList() { return this.list; } 					// リストを返します。
	public void setList(List listname) { this.list = listname; }	// リストをセットします。
	public int getListsize() {										// リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
	public AJ0020010Struct getListvalue(int x) { return (AJ0020010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AJ0020010Struct getStruct() { return this.struct; }	// Structを返します。
	public AJ0020010Struct createStruct() { return new AJ0020010Struct(); } // 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AJ0020010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください
	/** コンボボックスデータ取得用定数　内外作区分（進捗管理用） */
	private final static String J_OUTSIDE_TYP_PARAMETER_NAME= "J_OUTSIDE_TYP";

	/** コンボボックスデータ取得用定数　内外作区分 */
	private final static String OUTSIDE_TYP_PARAMETER_NAME= "OUTSIDE_TYP";

	/** コンボボックスデータ取得用定数　進捗ステータス（製番別進捗一覧用） */
	private final static String PROGRESS_STATUS_JOB_PARAMETER_NAME= "PROGRESS_STS_JOB";

	/** コンボボックスデータ取得用定数　展開レベル */
	private final static String INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME = "INIT_DISPLAY_PS_LEVEL";

	/** コンボボックスデータ取得用　内外作区分 */
	ComboStruct OUTSIDE_TYP = null;

	/** コンボボックスデータ取得用　進捗ステータス（製番別進捗一覧用） */
	ComboStruct PROGRESS_STATUS_JOB = null;

	/** コンボボックスデータ取得用　内外作区分（進捗管理用） */
	ComboStruct J_OUTSIDE_TYP = null;

	/** 画面遷移キー(製番) */
	private String _jobOdrCd;

	/** 画面遷移キー(製番取消発生番号) */
	private String _jobOdrCancelNo;

	/** 画面遷移キー(工場コード) */
	private String _plantCd;

	/** 展開レベル */
	private int maxDevelopLevel = 0;

	/**
	 * 画面遷移キー(製番)の設定
	 * @param cd 製番
	 */
	protected void setJobOdrCd(String cd) {
		_jobOdrCd = cd;
	}

	/**
	 * 画面遷移キー(製番取消発生番号)の設定
	 * @param cd 製番取消発生番号
	 */
	protected void setJobOdrCancelNo(String cd) {
		_jobOdrCancelNo = cd;
	}

	/**
	 * 画面遷移キー(工場コード)の設定
	 * @param cd 工場コード
	 */
	protected void setPlantCd(String cd) {
		_plantCd = cd;
	}

	/**
	 * 画面遷移キー(製番)の取得
	 * @return 製番
	 */
	protected String getJobOdrCd() {
		return _jobOdrCd;
	}

	/**
	 * 画面遷移キー(製番取消発生番号)の取得
	 * @return 製番取消発生番号
	 */
	protected String getJobOdrCancelNo() {
		return _jobOdrCancelNo;
	}

	/**
	 * 画面遷移キー(工場コード)の取得
	 * @return 工場コード
	 */
	protected String getPlantCd() {
		return _plantCd;
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
	 * 検索条件をに正展開検索を行う
	 * @param odNo オーダデマンド番号
	 * @param jobOdrCd 製番
	 * @param jobOdrCancelNo 製番取消発生番号
	 * @param plantCd 工場コード
	 * @param level レベル
	 * @param emsg エラーメッセージ
	 * @exception FoundationException 検索処理中にエラーが発生した場合
	 * @exception SQLException 検索処理中にエラーが発生した場合
	 * @exception ParseException 検索処理中にエラーが発生した場合
	 */
	private void developForward(String odNo, String jobOdrCd,
			String jobOdrCancelNo, String plantCd, int level, ExpjMessage emsg,int maxLine)
			throws FoundationException, SQLException, ParseException {

		AJ0020010Struct aStruct = null;
		AJ0020010Struct childStruct = new AJ0020010Struct();
		List resultList = null;
		//Ver2.4.2 PJ追加項目　回答納期----------------------------------------------------------------
		List puchList;
		//Ver2.4.2 PJ追加項目　回答納期ここまで---------------------------------------------------------

		// 最大レベルに達した場合は展開終了
		if (level > maxDevelopLevel + 1) {
			return;
		}

		// 検索条件の設定
		childStruct.setPARENT_OD_NO(odNo);
		childStruct.setJOB_ODR_CD(jobOdrCd);
		childStruct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
		childStruct.setPLANT_CD(plantCd);

		if(maxLine != 0){
			childStruct.setROW_COUNT(String.valueOf(maxLine));
		}else{
			childStruct.setROW_COUNT(null);
		}
		// 所要量を検索
		if (level == 1) {
			if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("")) {
				resultList = entity.mV_JOB_ODR_PROG_LST_ROOT.read(conn, childStruct);
			} else {
				String targetItemCd = struct.getITEM_CD();
				childStruct.setITEM_CD(targetItemCd);
				resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
				if (resultList.size() > 1) {
					emsg = new ExpjMessage("AJ00020");
					msgStruct.addWarn(emsg);
					sysLog.warning(emsg, sysUSER_CD);
				}
			}
		} else {
			resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
		}

		if( maxLine != 0 && (resultList.size() ==maxLine+1)){
			if(list!=null && list.size()>0){
				list.clear();
			}
			emsg = new ExpjMessage("ZZ01115");
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
			readStatus = TOO_MANY;
			return;
		}
		
		for (int i = 0; i < resultList.size(); i++) {
			aStruct = (AJ0020010Struct)resultList.get(i);
			try{
				aStruct.setl_OD_GNR_TYP_DN(multcombo("OD_GNR_TYP",aStruct.getOD_GNR_TYP().toString()));
				aStruct.setl_ODR_STS_TYP_DN(multcombo("ODR_STS_TYP",aStruct.getl_ODR_STS_TYP().toString()));
				aStruct.setl_DM_STS_TYP_DN(multcombo("DM_STS_TYP",aStruct.getl_DM_STS_TYP().toString()));
				aStruct.setl_MRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",aStruct.getl_MRP_ODR_TYP().toString()));
			}catch(Exception e){
				e.printStackTrace();
			}

			// 相対レベル
			aStruct.setl_LEVEL(String.valueOf(level));

			// オーダ状態区分
			if (aStruct.getl_ODR_STS_TYP().intValue() == 0) {
				aStruct.setl_ODR_STS_TYP_DN(null);
				// 製造納期にNullを設定する
				aStruct.setl_PRD_DUE_DATE(null);
			}

			// デマンド状態区分
			if (aStruct.getl_DM_STS_TYP().intValue() == 0) {
				aStruct.setl_DM_STS_TYP_DN(null);
				// 要求納期にNullを設定する
				aStruct.setl_DUE_DATE(null);
			}

			// 進捗ステータス
			setProgressStatus(aStruct);

			// 内外作区分
			setOutsideTyp(aStruct);
			
			//Ver2.4.2 PJ追加項目　回答納期
			puchList = entity.mT_RLSD_PUCH_ODR.read(conn, aStruct);
			if(puchList.size() != 0) {
				aStruct.setl_CONFIRM_DLV_DATE(((AJ0020010Struct)(puchList.get(0))).getl_CONFIRM_DLV_DATE());
			}
			puchList = null;
			//Ver2.4.2 PJ追加項目　回答納期ここまで---------------------------------------------------------
			
			
			list.add(resultList.get(i));	
			if (maxLine != 0 && list.size() == maxLine+1) {
					if(list!=null && list.size()>0){
						list.clear();
					}
					emsg = new ExpjMessage("ZZ01115");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
					readStatus = TOO_MANY;
					return;
				}
			readStatus = NORMAL;
			

			// 所要量処理区分が「3:削除」以外の場合、下位レベルの展開を行う
			if (aStruct.getMRP_TYP().intValue() != 3) {
				developForward(aStruct.getl_OD_NO(), jobOdrCd,
						jobOdrCancelNo, aStruct.getPLANT_CD(), level + 1, emsg,maxLine);
			}
		
		    if (readStatus == TOO_MANY) {
			    return;
		    }
	   }
	}
	

	/**
	 * 検索条件をに逆展開検索を行う
	 * @param parentOdNo 親オーダデマンド番号
	 * @param jobOdrCd 製番
	 * @param jobOdrCancelNo 製番取消発生番号
	 * @param plantCd 工場コード
	 * @param level レベル
	 * @param emsg エラーメッセージ
	 * @exception FoundationException 検索処理中にエラーが発生した場合
	 * @exception SQLException 検索処理中にエラーが発生した場合
	 * @exception ParseException 検索処理中にエラーが発生した場合
	 */
	private void developReverse(String parentOdNo, String jobOdrCd,
			String jobOdrCancelNo, String plantCd, int level, ExpjMessage emsg,int maxLine)
			throws FoundationException, SQLException, ParseException {

		AJ0020010Struct aStruct = null;
		AJ0020010Struct childStruct = new AJ0020010Struct();
		List resultList = null;
		//Ver2.4.2 PJ追加項目　回答納期----------------------------------------------------------------
		List puchList;
		//Ver2.4.2 PJ追加項目　回答納期ここまで---------------------------------------------------------

		// 最大レベルに達した場合は展開終了
		if (level > maxDevelopLevel  + 1) {
			return;
		}

		// 検索条件の設定
		childStruct.setOD_NO(parentOdNo);
		childStruct.setJOB_ODR_CD(jobOdrCd);
		childStruct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
		childStruct.setPLANT_CD(plantCd);
		
        if(maxLine != 0){
        	childStruct.setROW_COUNT(String.valueOf(maxLine));
        }else{
        	childStruct.setROW_COUNT(null);
        }
		// 所要量を検索
		if (level == 1) {
			if (struct.getITEM_CD() == null || struct.getITEM_CD().equals("")) {
				resultList = entity.mV_JOB_ODR_PROG_LST_ROOT.read(conn, childStruct);
			} else {
				String targetItemCd = struct.getITEM_CD();
				childStruct.setITEM_CD(targetItemCd);
				resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
				if (resultList.size() > 1) {
					emsg = new ExpjMessage("AJ00020");
					msgStruct.addWarn(emsg);
					sysLog.warning(emsg, sysUSER_CD);
				}
			}
		} else {
			resultList = entity.mV_JOB_ODR_PROG_LST.read(conn, childStruct);
		}

		if( maxLine != 0 && (resultList.size() ==maxLine+1)){
			if(list!=null && list.size()>0){
				list.clear();
			}
			emsg = new ExpjMessage("ZZ01115");
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
			readStatus = TOO_MANY;
			return;
		}
		
		for (int i = 0; i < resultList.size(); i++) {
			aStruct = (AJ0020010Struct)resultList.get(i);
			try{
				aStruct.setl_OD_GNR_TYP_DN(multcombo("OD_GNR_TYP",aStruct.getOD_GNR_TYP().toString()));
				aStruct.setl_ODR_STS_TYP_DN(multcombo("ODR_STS_TYP",aStruct.getl_ODR_STS_TYP().toString()));
				aStruct.setl_DM_STS_TYP_DN(multcombo("DM_STS_TYP",aStruct.getl_DM_STS_TYP().toString()));
				aStruct.setl_MRP_ODR_TYP_DN(multcombo("MRP_ODR_TYP",aStruct.getl_MRP_ODR_TYP().toString()));
			}catch(Exception e){
				e.printStackTrace();
			}

			// 相対レベル
			aStruct.setl_LEVEL(String.valueOf(level));

			// オーダ状態区分
			if (aStruct.getl_ODR_STS_TYP().intValue() == 0) {
				aStruct.setl_ODR_STS_TYP_DN(null);
				// 製造納期にNullを設定する
				aStruct.setl_PRD_DUE_DATE(null);
			}

			// デマンド状態区分
			if (aStruct.getl_DM_STS_TYP().intValue() == 0) {
				aStruct.setl_DM_STS_TYP_DN(null);
				// 要求納期にNullを設定する
				aStruct.setl_DUE_DATE(null);
			}

			// 進捗ステータス
			setProgressStatus(aStruct);

			// 内外作区分
			setOutsideTyp(aStruct);
			//Ver2.4.2 PJ追加項目　回答納期----------------------------------------------------------------
			puchList = entity.mT_RLSD_PUCH_ODR.read(conn, aStruct);
			if(puchList.size() !=0) {
				aStruct.setl_CONFIRM_DLV_DATE(((AJ0020010Struct)(puchList.get(0))).getl_CONFIRM_DLV_DATE());
			}
			puchList = null;
			//Ver2.4.2 PJ追加項目　回答納期ここまで---------------------------------------------------------
			
			
			list.add(resultList.get(i));
			if (maxLine != 0 && list.size() == maxLine+1) {
				if(list!=null && list.size()>0){
					list.clear();
				}
				emsg = new ExpjMessage("ZZ01115");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				readStatus = TOO_MANY;
				return;
			}
			readStatus = NORMAL;
		  

			// 親オーダデマンド番号が「Null」以外、かつ、所要量処理区分が「3:削除」以外の場合、
			// 下位レベルの展開を行う
			if (aStruct.getPARENT_OD_NO() != null
					&& aStruct.getPARENT_OD_NO().equals("") == false
					&& aStruct.getMRP_TYP().intValue() != 3) {
				developReverse(aStruct.getPARENT_OD_NO(), jobOdrCd,
						jobOdrCancelNo, aStruct.getPLANT_CD(), level + 1, emsg,maxLine);
			}
			if(readStatus==TOO_MANY){
				return;
			}
		}
	}

	/**
	 * 進捗ステータスの表示内容を設定する
	 * @param aStruct 進捗ステータスの表示内容を設定するStruct
	 * @exception SQLException 検索処理中にエラーが発生した場合
	 * @exception ParseException
	 */
	private void setProgressStatus(AJ0020010Struct aStruct)
			throws SQLException, ParseException {
		String progressStatus = "";
		String progressStatusDisplayName = "";
		Date prdDueDate = null;
		Date dueDate = null;
		Date oprDate = Converter.strToDate(aStruct.getl_BUSINESS_OPR_DATE(), Converter.SLASH_DATE);
		boolean isDelayedPrdDueDate = false;
		boolean isDelayedDueDate = false;

		if (aStruct.getMRP_TYP().intValue() == 3) {
			// 削除
			progressStatus = "4";
			progressStatusDisplayName = getDisplayName(PROGRESS_STATUS_JOB, progressStatus);
		} else {
			if (aStruct.getl_ODR_STS_TYP().intValue() != 9
					&& aStruct.getl_DM_STS_TYP().intValue() != 9) {

				prdDueDate = Converter.strToDate(
						aStruct.getl_PRD_DUE_DATE(), Converter.SLASH_DATE);
				dueDate = Converter.strToDate(aStruct.getl_DUE_DATE(), Converter.SLASH_DATE);
				if (prdDueDate != null && oprDate.compareTo(prdDueDate) > 0) {
					isDelayedPrdDueDate = true;
				}
				if (dueDate != null && oprDate.compareTo(dueDate) > 0) {
					isDelayedDueDate = true;
				}
				if (isDelayedPrdDueDate == false && isDelayedDueDate == false) {
					// 遅れなし
					progressStatus = "0";
					progressStatusDisplayName = "";
				} else {
					if (isDelayedPrdDueDate == true && isDelayedDueDate == true) {
						// 入出庫遅れ
						progressStatus = "3";
						progressStatusDisplayName = getDisplayName(
								PROGRESS_STATUS_JOB, progressStatus);
					} else {
						if (isDelayedPrdDueDate == true) {
							// 入庫遅れ
							progressStatus = "2";
							progressStatusDisplayName = getDisplayName(
									PROGRESS_STATUS_JOB, progressStatus);
						} else {
							// 出庫遅れ
							progressStatus = "1";
							progressStatusDisplayName = getDisplayName(
									PROGRESS_STATUS_JOB, progressStatus);
						}
					}
				}
			}
		}
		aStruct.setl_PROGRESS_STATUS(progressStatus);
		aStruct.setl_PROGRESS_STATUS_DN(progressStatusDisplayName);
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

	/**
	 * 内外作区分の設定
	 * @param aStruct 内外作区分を設定するStruct
	 */
	private void setOutsideTyp(AJ0020010Struct aStruct) {
		String displayName = "";  // コンボボックスデータ表示用
		int workInProcQty = 0;
		int rlsdPuchOdrQty = 0;
		workInProcQty = Integer.parseInt(aStruct.getl_WORK_IN_PROC_QTY());
		rlsdPuchOdrQty = Integer.parseInt(aStruct.getl_RLSD_PUCH_ODR_QTY());

		// オーダデマンド番号の存在チェック
		if (rlsdPuchOdrQty > 0 || workInProcQty > 0) {
			// 内外作区分（進捗管理用）
			if (rlsdPuchOdrQty > 0 && workInProcQty > 0) {
				// 発注残・品目別仕掛に存在する
				displayName = getDisplayName(J_OUTSIDE_TYP, "9");
			} else if (rlsdPuchOdrQty > 0) {
				// 発注残のみ存在する
				displayName = getDisplayName(J_OUTSIDE_TYP, "2");
			} else if (workInProcQty > 0) {
				// 品目別仕掛のみ存在する
				displayName = getDisplayName(J_OUTSIDE_TYP, "1");
			} else {
				displayName = null;
			}
			aStruct.setl_OUTSIDE_TYP_DN(displayName);
		} else {
			// 内外作区分
			displayName = getDisplayName(OUTSIDE_TYP,
					aStruct.getOUTSIDE_TYP().toString());
			aStruct.setl_OUTSIDE_TYP_DN(displayName);
		}
	}

//---------- メッセージ関連の処理-- --------------------------------------------

	/**
	 * メッセージ取得
	 * @return メッセージ
	 */
	public MessageStruct getMessage()
	{
		return msgStruct;
	}

	/**
	 * メッセージ設定
	 * @param メッセージ
	 */
	public void setMessage(MessageStruct msg)
	{
		msgStruct = msg;
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg ); // エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg ); // エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ(List)
	 */
	private void setErrorMessage(String code, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg ); // エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg ); // エラーメッセージとして登録
			sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		String keyMessage = "";

		try {
			readStatus = INITIAL;
			struct.setPLANT_NAME(null);

			if (list != null) {
				list.clear();
			} else {
				list = new ArrayList(0);
			}

			List resultList = null;
			AJ0020010Struct aStruct = null;
			int jobOdrDelFlg = 0;
			ExpjMessage emsg = null;

			// 工場コード存在チェック
			if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
				List tmpList = entity.mM_PLANT.read(conn, struct);
				if (tmpList.size() <= 0 ) {
					//データが存在しない
					keyMessage = "M_PLANT.PLANT_CD:" + struct.getPLANT_CD();
					setErrorMessage("ZZ09028", keyMessage);
				} else {
					aStruct = (AJ0020010Struct)tmpList.get(0);
					struct.setPLANT_NAME(aStruct.getPLANT_NAME());
				}
			}

			// 画面編集不可項目クリア
			struct.setJOB_ODR_TYP_DN(null);
			struct.setALC_GRP_CD(null);
			struct.setITEM_NAME(null);

			// 製番計画の存在チェック
			AJ0020010Struct searchStruct = new AJ0020010Struct();
			searchStruct.setJOB_ODR_CD(struct.getJOB_ODR_CD());
			searchStruct.setJOB_ODR_CANCEL_NO(struct.getJOB_ODR_CANCEL_NO());
			resultList = entity.mT_JOB_ODR.read(conn, searchStruct);
			if (resultList.size() <= 0) {
				//データが存在しない
				List key = new ArrayList();
				key.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				key.add("T_JOB_ODR.JOB_ODR_CANCEL_NO:" + struct.getJOB_ODR_CANCEL_NO());
				setErrorMessage("AJ00018", key);
			} else {
				aStruct = (AJ0020010Struct)resultList.get(0);
				if (struct.getPLANT_CD() != null && struct.getPLANT_CD().equals("") == false) {
					if (aStruct.getPLANT_CD().equals(struct.getPLANT_CD()) == false) {
						keyMessage = "T_JOB_ODR.PLANT_CD:" + aStruct.getPLANT_CD();
						setErrorMessage("AJ00019", keyMessage);
					}
				}

				if (aStruct.getJOB_ODR_STS_TYP().intValue() == 1
					|| aStruct.getJOB_ODR_STS_TYP().intValue() == 2) {
					// 所要量計算を実行していない
					emsg = new ExpjMessage("AJ00016");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
				} else {
					// 製番種別、引当グループコードの設定
					struct.setJOB_ODR_TYP_DN(multcombo("JOB_ODR_TYP",aStruct.getJOB_ODR_TYP().toString()));
					struct.setALC_GRP_CD(aStruct.getALC_GRP_CD());
					// 製番削除フラグの取得
					jobOdrDelFlg = aStruct.getJOB_ODR_DEL_FLG().intValue();
				}
			}

			// 品目番号が指定されている場合
			if (struct.getITEM_CD() != null
					&& struct.getITEM_CD().equals("") == false) {
				resultList = entity.mM_ITEM.read(conn, struct);
				if (resultList.size() <= 0) {
					keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AJ00015", keyMessage);
				} else {
					aStruct = (AJ0020010Struct)resultList.get(0);
					struct.setITEM_NAME(aStruct.getITEM_NAME());
				}
			}

			// エラーがあれば終了
			if (msgStruct.hasError()) {

				readStatus = NOT_FOUND;

				return;
			}

			// 展開レベル（初期値）
			maxDevelopLevel = Integer.parseInt(struct.getDEVELOP_LEVEL());

			int level = 1;
			int maxLine = sp.getMaxLine(conn, 10);
			if (struct.getDEVELOP_TYP().equals("1")) {
				// 正展開
				developForward(null, struct.getJOB_ODR_CD(),
						struct.getJOB_ODR_CANCEL_NO(), struct.getPLANT_CD(), level, emsg,maxLine);
			} else {
				// 逆展開
				developReverse(null, struct.getJOB_ODR_CD(),
						struct.getJOB_ODR_CANCEL_NO(), struct.getPLANT_CD(), level, emsg,maxLine);
			}

			if (jobOdrDelFlg == 1) {
				// 削除対象（ワーニング）
				emsg = new ExpjMessage("AJ00017");
				msgStruct.addWarn(emsg);
				sysLog.warning(emsg, sysUSER_CD);
			}

			if ((list.size()== 0)&&(readStatus!=TOO_MANY)) {
				// 読込処理失敗：検索結果が0件です
				emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);

				readStatus = NOT_FOUND;

				return;
			}

		} catch(ParseException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			throw new ExpjException(e, emsg); // エクセプションを生成
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			throw new ExpjException(e, emsg); // エクセプションを生成
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		readStatus = INITIAL;

		if (list != null) {
			list.clear();
		} else {
			list = new ArrayList(0);
		}

		// 工場コードをデフォルト表示
		struct.setPLANT_CD(getsysPLANT_CD());

		// 画面の初期値を設定
		struct.setJOB_ODR_CD(null);
		struct.setJOB_ODR_TYP_DN(null);
		struct.setALC_GRP_CD(null);
		struct.setITEM_CD(null);
		struct.setITEM_NAME(null);
		struct.setJOB_ODR_CANCEL_NO("0");
		struct.setDEVELOP_TYP("1");
		// 展開レベルの既定値取得
		try {
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber(INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME);
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
		} catch (SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			throw new ExpjException(e, emsg); // エクセプションを生成
		}
                //}}user_implement_dev:<controlClear>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
		struct.setJOB_ODR_CANCEL_NO("0");
		// 展開レベルの既定値取得
		try {
			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber(INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME);
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);
		} catch (SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			throw new ExpjException(e, emsg); // エクセプションを生成
		}
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try {

			readStatus = INITIAL;

			PrivateConfig c = new PrivateConfig(conn);
			Integer level = c.getNumber(INIT_DISPLAY_PS_LEVEL_PARAMETER_NAME);
			String _level = TypeConverter.sanitizer(level);
			struct.setDEVELOP_LEVEL(_level);

			struct.setDEVELOP_TYP("1");


			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {

				struct.setJOB_ODR_CD(this._jobOdrCd);
				struct.setJOB_ODR_CANCEL_NO(this._jobOdrCancelNo);
				struct.setITEM_CD(null);
				struct.setPLANT_CD(this._plantCd);

				// 検索のコントロールメソッドを呼び出します。
				controlSelect();
			} else {
				// 工場コードをデフォルト表示
				struct.setPLANT_CD(getsysPLANT_CD());
			}

			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			throw new ExpjException(e, emsg); // エクセプションを生成
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AJ0020");
		logger.entering("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
				ComboStruct DEVELOP_TYP = comboController.getData("DEVELOP_TYP");
				struct.setList_DEVELOP_TYP_val(DEVELOP_TYP.getValList());
				struct.setList_DEVELOP_TYP_name(DEVELOP_TYP.getExplanList());
				PROGRESS_STATUS_JOB = comboController.getData(PROGRESS_STATUS_JOB_PARAMETER_NAME);
				OUTSIDE_TYP = comboController.getData(OUTSIDE_TYP_PARAMETER_NAME);
				J_OUTSIDE_TYP = comboController.getData(J_OUTSIDE_TYP_PARAMETER_NAME);
			} catch (java.sql.SQLException e) {
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage("ZZ01106");
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				throw ee;
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AJ0020010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AJ0020010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0020010-E999","CSVの出力処理"));
			throw new FoundationException("AJ0020010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0020010-E999","システム日付の取得処理"));
				throw new FoundationException("AJ0020010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AJ0020010-E999","コントロールのイベント処理"));
			throw new FoundationException("AJ0020010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AJ0020010Entity entity;
	protected AJ0020010Struct struct;
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

		entity = new AJ0020010Entity();
		struct = new AJ0020010Struct();

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
	 * AJ0020010クラスの標準コンストラクタ
	 */
	public AJ0020010Control() throws BusinessProcessException, FoundationException
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
				AJ0020010Struct key = (AJ0020010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP") && key.getDEVELOP_TYP() != null) {
					msgKey.setKeyValue("DEVELOP_TYP", key.getDEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name") && key.getDEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_name", key.getDEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val") && key.getDEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_val", key.getDEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL") && key.getDEVELOP_LEVEL() != null) {
					msgKey.setKeyValue("DEVELOP_LEVEL", key.getDEVELOP_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("l_LEVEL") && key.getl_LEVEL() != null) {
					msgKey.setKeyValue("l_LEVEL", key.getl_LEVEL());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN") && key.getl_ODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP_DN", key.getl_ODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP_DN") && key.getl_DM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP_DN", key.getl_DM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN") && key.getl_OUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("l_OUTSIDE_TYP_DN", key.getl_OUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN") && key.getl_MRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP_DN", key.getl_MRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN") && key.getl_OD_GNR_TYP_DN() != null) {
					msgKey.setKeyValue("l_OD_GNR_TYP_DN", key.getl_OD_GNR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS") && key.getl_PROGRESS_STATUS() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS", key.getl_PROGRESS_STATUS().toString());
				}
				if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN") && key.getl_PROGRESS_STATUS_DN() != null) {
					msgKey.setKeyValue("l_PROGRESS_STATUS_DN", key.getl_PROGRESS_STATUS_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_START_DATE") && key.getl_ODR_START_DATE() != null) {
					msgKey.setKeyValue("l_ODR_START_DATE", key.getl_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_START_DATE") && key.getl_PRD_START_DATE() != null) {
					msgKey.setKeyValue("l_PRD_START_DATE", key.getl_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE") && key.getl_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("l_PRD_DUE_DATE", key.getl_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DUE_DATE") && key.getl_DUE_DATE() != null) {
					msgKey.setKeyValue("l_DUE_DATE", key.getl_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY") && key.getl_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_RCV_QTY", key.getl_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE") && key.getl_RCV_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_RCV_CMPLT_DATE", key.getl_RCV_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DM_QTY") && key.getl_DM_QTY() != null) {
					msgKey.setKeyValue("l_DM_QTY", key.getl_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY") && key.getl_TOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("l_TOTAL_ISSUE_QTY", key.getl_TOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ISSUE_CMPLT_DATE") && key.getl_ISSUE_CMPLT_DATE() != null) {
					msgKey.setKeyValue("l_ISSUE_CMPLT_DATE", key.getl_ISSUE_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ALCD_QTY") && key.getl_ALCD_QTY() != null) {
					msgKey.setKeyValue("l_ALCD_QTY", key.getl_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_OD_NO") && key.getl_OD_NO() != null) {
					msgKey.setKeyValue("l_OD_NO", key.getl_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP") && key.getl_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("l_OPR_RSLT_TYP", key.getl_OPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP") && key.getOD_GNR_TYP() != null) {
					msgKey.setKeyValue("OD_GNR_TYP", key.getOD_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP") && key.getl_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("l_ODR_STS_TYP", key.getl_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_DM_STS_TYP") && key.getl_DM_STS_TYP() != null) {
					msgKey.setKeyValue("l_DM_STS_TYP", key.getl_DM_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY") && key.getl_RLSD_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("l_RLSD_PUCH_ODR_QTY", key.getl_RLSD_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY") && key.getl_WORK_IN_PROC_QTY() != null) {
					msgKey.setKeyValue("l_WORK_IN_PROC_QTY", key.getl_WORK_IN_PROC_QTY());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE") && key.getl_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("l_BUSINESS_OPR_DATE", key.getl_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD") && key.getROOT_ITEM_CD() != null) {
					msgKey.setKeyValue("ROOT_ITEM_CD", key.getROOT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG") && key.getJOB_ODR_DEL_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_DEL_FLG", key.getJOB_ODR_DEL_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE") && key.getl_CONFIRM_DLV_DATE() != null) {
					msgKey.setKeyValue("l_CONFIRM_DLV_DATE", key.getl_CONFIRM_DLV_DATE());
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
					AJ0020010Struct key = new AJ0020010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP")) {
						key.setDEVELOP_TYP(msgKey.getKeyValue("DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name")) {
						key.setDEVELOP_TYP_name(msgKey.getKeyValue("DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val")) {
						key.setDEVELOP_TYP_val(msgKey.getKeyValue("DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_LEVEL")) {
						key.setDEVELOP_LEVEL(msgKey.getKeyValue("DEVELOP_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("l_LEVEL")) {
						key.setl_LEVEL(msgKey.getKeyValue("l_LEVEL"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP_DN")) {
						key.setl_ODR_STS_TYP_DN(msgKey.getKeyValue("l_ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP_DN")) {
						key.setl_DM_STS_TYP_DN(msgKey.getKeyValue("l_DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OUTSIDE_TYP_DN")) {
						key.setl_OUTSIDE_TYP_DN(msgKey.getKeyValue("l_OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP_DN")) {
						key.setl_MRP_ODR_TYP_DN(msgKey.getKeyValue("l_MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_GNR_TYP_DN")) {
						key.setl_OD_GNR_TYP_DN(msgKey.getKeyValue("l_OD_GNR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS")) {
						key.setl_PROGRESS_STATUS(new Integer(msgKey.getKeyValue("l_PROGRESS_STATUS")));
					}
					if(msgKeyType.containsKeyColumn("l_PROGRESS_STATUS_DN")) {
						key.setl_PROGRESS_STATUS_DN(msgKey.getKeyValue("l_PROGRESS_STATUS_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_START_DATE")) {
						key.setl_ODR_START_DATE(msgKey.getKeyValue("l_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_START_DATE")) {
						key.setl_PRD_START_DATE(msgKey.getKeyValue("l_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PRD_DUE_DATE")) {
						key.setl_PRD_DUE_DATE(msgKey.getKeyValue("l_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DUE_DATE")) {
						key.setl_DUE_DATE(msgKey.getKeyValue("l_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_RCV_QTY")) {
						key.setl_TOTAL_RCV_QTY(msgKey.getKeyValue("l_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_RCV_CMPLT_DATE")) {
						key.setl_RCV_CMPLT_DATE(msgKey.getKeyValue("l_RCV_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DM_QTY")) {
						key.setl_DM_QTY(msgKey.getKeyValue("l_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_TOTAL_ISSUE_QTY")) {
						key.setl_TOTAL_ISSUE_QTY(msgKey.getKeyValue("l_TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ISSUE_CMPLT_DATE")) {
						key.setl_ISSUE_CMPLT_DATE(msgKey.getKeyValue("l_ISSUE_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ALCD_QTY")) {
						key.setl_ALCD_QTY(msgKey.getKeyValue("l_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_OD_NO")) {
						key.setl_OD_NO(msgKey.getKeyValue("l_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_OPR_RSLT_TYP")) {
						key.setl_OPR_RSLT_TYP(new Integer(msgKey.getKeyValue("l_OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP")) {
						key.setOD_GNR_TYP(new Integer(msgKey.getKeyValue("OD_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_STS_TYP")) {
						key.setl_ODR_STS_TYP(new Integer(msgKey.getKeyValue("l_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_DM_STS_TYP")) {
						key.setl_DM_STS_TYP(new Integer(msgKey.getKeyValue("l_DM_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_RLSD_PUCH_ODR_QTY")) {
						key.setl_RLSD_PUCH_ODR_QTY(msgKey.getKeyValue("l_RLSD_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WORK_IN_PROC_QTY")) {
						key.setl_WORK_IN_PROC_QTY(msgKey.getKeyValue("l_WORK_IN_PROC_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(new Integer(msgKey.getKeyValue("MRP_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(new Integer(msgKey.getKeyValue("l_MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("l_BUSINESS_OPR_DATE")) {
						key.setl_BUSINESS_OPR_DATE(msgKey.getKeyValue("l_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROOT_ITEM_CD")) {
						key.setROOT_ITEM_CD(msgKey.getKeyValue("ROOT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(new Integer(msgKey.getKeyValue("JOB_ODR_STS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DEL_FLG")) {
						key.setJOB_ODR_DEL_FLG(new Integer(msgKey.getKeyValue("JOB_ODR_DEL_FLG")));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CONFIRM_DLV_DATE")) {
						key.setl_CONFIRM_DLV_DATE(msgKey.getKeyValue("l_CONFIRM_DLV_DATE"));
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
