/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0110/src/com/nec/jp/orteus/metamorBase/AF0110/AF0110010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0110;

import com.nec.jp.orteus.metamorBase.AF0110.*;
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
import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueRemain;
import com.nec.jp.orteus.expj.pr.rcvissue.process.ValidateWh;
import com.nec.jp.orteus.expj.util.SystemInformation;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.util.StringUtil;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0110010Control
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
	public AF0110010Struct getListvalue(int x) { return (AF0110010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AF0110010Struct getStruct() { return this.struct; }	// Structを返します。
	public AF0110010Struct createStruct() { return new AF0110010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AF0110010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/**
	 * SQLExceptionエラーメッセージ設定
	 * @param SQLException
	 * @param 出力エラーメッセージ
	 */
	private void setSqlExceptionMsg(SQLException e) throws ExpjException
	{
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
	}

	/**
	 * ComboException発生時のエラー処理を行う。<br>
	 * ・エラー専用画面にエラーメッセージを表示する<br>
	 * ・同じ内容を、システムログ[レベル:SEVERE]に出力する。
	 * @param ComboException
	 * @throws ExpjException
	 */
	public void setComboExceptionMsg(ComboException e) throws ExpjException
	{
		// サーバエラー発生メッセージ[ZZ01106]
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());
		ExpjException ee = new ExpjException(e, emsg);

		throw ee;
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ(List)
	 */
	private void setErrorMessage(String messageno, List message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());

		for(int i=0; i<message.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
			msgStruct.addError( emsg );
			sysLog.warning(emsg, getsysUSER_CD());
		}
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 * @param 置換文字列１
	 */
	private void setErrorMessage(String messageno, String message, String value1)
	{
		ExpjMessage emsg = new ExpjMessage( messageno , value1 );
		msgStruct.addError( emsg );
		sysLog.warning(emsg, getsysUSER_CD());
	}

	/**
	 * 警告メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setWarnMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addWarn( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}

	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 */
	private void setInfoMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}

	/**
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String messageno, String message)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
		emsg = new ExpjMessage( "ZZ01006", message );
		msgStruct.addInfo( emsg );
		sysLog.config(emsg, getsysUSER_CD());
	}

	/** 倉庫区分 */
	ComboStruct _WH_TYP = new ComboStruct();

	/**
	 * コンボボックスの値を取得
	 */
	private void setComboData() throws ComboException, SQLException
	{
		ComboBox comboController = new ComboBox(conn, sysUSER_CD);

		// 倉庫区分
		_WH_TYP = comboController.getData("WH_TYP");
	}

	/**
	 * 区分名取得
	 * @param comboStruct 区分情報リスト
	 * @param strTyp 区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getTypeName(ComboStruct comboStruct, String strTyp)
	{
		if(comboStruct == null || strTyp == null)  return null;
		String strTypName = strTyp;
		for(int i = 0; i < comboStruct.getValList().size(); i++){
			if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
				strTypName = (String)(comboStruct.getExplanList().get(i));
				break;
			}
		}
		if(strTypName == null) strTypName = strTyp;
		return strTypName;
	}

	/**
	 * <pre>
	 * 入出庫管理番号の採番処理
	 * </pre>
	 * @return String 入出庫管理番号
	 */
	private String getRcvIssueCtrlCd() throws SQLException, FoundationException
	{
		CollectNumber issueCollect = new CollectNumber(CollectNumber.ISSUE_CD,
													   getsysUSER_CD(),
													   this.sp.getProcId(),
													   getsysPLANT_CD());
		String issueCtrlCd = issueCollect.getNo();

		// 取得に失敗した場合は処理中断
		if( issueCtrlCd==null ){
			conn.rollback();
			ExpjMessage emsg = new ExpjMessage("AF00057");
			throw new FoundationException(
								"AF0110010Control",
								"IssueProcess()",
								emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
		}

		return issueCtrlCd;
	}

	/**
	 * <pre>
	 * 読込・一括振替時共通処理
	 * (1)エラーチェックと在庫情報読込
	 * (2)品目毎、保管区毎の振替予定数の算出
	 * </pre>
	 * @return true/false 業務エラーが発生した場合 false
	 */
	private boolean commonProcess() throws SQLException, FoundationException
	{
		List listMessage = new ArrayList();
		boolean bRet;

		if(list != null) list.clear();

		// [保管区製番在庫]の存在チェック
		List wkList = entity.mT_JOB_ODR_CD_STOCK.read(conn, struct);
		if( wkList.size() <= 0 ){
			listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
			listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO:0");
			listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
			setErrorMessage("AF00045", listMessage);
			return false;
		}

		// [製番計画]の"製番状態区分"チェック
		if( !struct.getJOB_COMP_FLG().equals("true") ){
			bRet = entity.mT_JOB_ODR.check(conn, struct);
			if( bRet ){
				listMessage.add("T_JOB_ODR.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				listMessage.add("T_JOB_ODR.JOB_ODR_DETAIL_NO:0");
				listMessage.add("T_JOB_ODR.PLANT_CD:" + struct.getw_PLANT_CD());
				listMessage.add("T_JOB_ODR.JOB_ODR_STS_TYP:<>9");
				setErrorMessage("AF00114", listMessage);
				return false;
			}
		}

		list = wkList;

		// 品目・保管区単位の数量計算
		if( !calcChangeQty() ){
			return false;
		}

		return true;
	}

	/**
	 * <pre>
	 * 振込予定数の計算
	 * @return true/false エラーが発生した場合false
	 * </pre>
	 */
	private boolean calcChangeQty() throws SQLException, FoundationException
	{
		AF0110010Struct wkStruct = null;

		// 製番、製番枝番、工場コードを元に登録品目コードを取得
		List wkList = entity.mT_JOB_ODR_CD_STOCK_DISTINCT.read(conn, struct);
		if( wkList.size() <= 0 ) return false;

		IssueRemain issueRemain = new IssueRemain(conn);
		for( int i=0; i<wkList.size(); i++ ){
			wkStruct = (AF0110010Struct)wkList.get(i);
			String freeStockQty = (issueRemain.getFreeStockQtyOfJobOdr(
									struct.getw_PLANT_CD(),
									wkStruct.getITEM_CD(),
									struct.getJOB_ODR_CD(),
									AF0110Const._JOB_ODR_DETAIL_ZERO)).toString();

			// 振替可能数＝０の品目は振替対象外とする
			if( Calculate.compare(freeStockQty,"0") <= 0 ) continue;

			// 振替可能数＞０の品目は保管区毎に振替可能数を求める
			List whList = ValidateWh.getFree(conn, struct.getw_PLANT_CD(), wkStruct.getITEM_CD());
			WhLoop: for(int x=0; x<whList.size(); x++){
				String whCd = (String)whList.get(x);
				
				// 製番別手持在庫数が最大で０になるまで振替可能数をセット
				for(int y=0; y<list.size(); y++){
					AF0110010Struct listStruct = (AF0110010Struct)list.get(y);

					// 製番別手持在庫数 ＞ ０でない場合はセットしない
					if( !listStruct.getWH_CD().equals(whCd) ||
						!listStruct.getITEM_CD().equals(wkStruct.getITEM_CD()) ||
						Calculate.compare(listStruct.getSTOCK_ON_HAND_QTY(),"0") != 1 ) continue;

					// 振替可能数が０になって時点で処理終了
					String changeQty = Calculate.subtract(freeStockQty, listStruct.getSTOCK_ON_HAND_QTY());
					if( Calculate.compare(changeQty,"0") <= 0 ){
						listStruct.setCHANGE_PLAN_QTY(freeStockQty);
						break WhLoop;
					} else {
						listStruct.setCHANGE_PLAN_QTY(listStruct.getSTOCK_ON_HAND_QTY());
						freeStockQty = Calculate.subtract(freeStockQty, listStruct.getSTOCK_ON_HAND_QTY());
					}
					break;
					
				}
			}
		}
		
		return true;
	}

	/**
	 * <pre>
	 * 入出庫処理
	 * (1)[保管区別入出庫]に出庫データを追加して出庫処理を呼び出す。
	 * (2)[保管区別入出庫]に入庫データを追加して入庫処理を呼び出す。
	 * @return true/false エラーが発生した場合false
	 * </pre>
	 */
	private boolean RcvIssueProcess() throws SQLException, FoundationException
	{
		String strMessage = "";
		boolean errFlg = true;

		for(int i=0; i<list.size(); i++){
			AF0110010Struct wkStruct = (AF0110010Struct)list.get(i);

			/************************************************************
			 (1)[保管区別入出庫]に出庫データを追加して出庫処理を呼び出す。
			************************************************************/

			// 振替数 切り上げ処理
			boolean resultCeil = false;
			if(wkStruct.getUNIT_QTY_TYP().intValue() == AF0110Const._UNIT_QTY_INTEGER
				&& Calculate.isNumeric(wkStruct.getCHANGE_PLAN_QTY()) ){
				wkStruct.setCHANGE_PLAN_QTY(Calculate.ceil(wkStruct.getCHANGE_PLAN_QTY(), 0));
				resultCeil = true;
			}

			// 入出庫管理番号の採番
			wkStruct.setRCV_ISSUE_CTRL_CD(getRcvIssueCtrlCd());

			// 入出庫区分のセット（2:出庫）
			wkStruct.setRCV_ISSUE_TYP(AF0110Const._ISSUE_TYP);

			// 入出庫数のセット（算出した振替数 × －１）
			wkStruct.setCHANGE_PLAN_QTY(Calculate.multiply(wkStruct.getCHANGE_PLAN_QTY(),"-1"));

			// 入出庫発生区分のセット（24:振替出庫）
			wkStruct.setRCV_ISSUE_GNR_TYP(AF0110Const._ISSUE_GNR_TYP);

			entity.mT_RCV_ISSUE.create(conn, wkStruct);

			// 出庫処理呼び出し
			IssueProcess issuePrc = new IssueProcess(conn, wkStruct.getRCV_ISSUE_CTRL_CD());
			if( issuePrc.execProcess() ){
				if(resultCeil){
					// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
					strMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + wkStruct.getRCV_ISSUE_CTRL_CD();
					setInfoMessage("AF60004", strMessage);
				}
			} else {
				conn.rollback();
				return false;
			}

			/************************************************************
			 (2)[保管区別入出庫]に入庫データを追加して入庫処理を呼び出す。
			************************************************************/

			// 入出庫管理番号の採番
			wkStruct.setRCV_ISSUE_CTRL_CD(getRcvIssueCtrlCd());

			// 入出庫区分のセット（1:入庫）
			wkStruct.setRCV_ISSUE_TYP(AF0110Const._RCV_TYP);

			// 入出庫数のセット（算出した振替数 × －１）
			wkStruct.setCHANGE_PLAN_QTY(Calculate.multiply(wkStruct.getCHANGE_PLAN_QTY(),"-1"));

			// 入出庫発生区分のセット（14:振替入庫）
			wkStruct.setRCV_ISSUE_GNR_TYP(AF0110Const._RCV_GNR_TYP);
			
			// 製番のセット（NULL）
			wkStruct.setJOB_ODR_CD(null);

			entity.mT_RCV_ISSUE.create(conn, wkStruct);

			// 入庫処理呼び出し
			RcvProcess rcvPrc = new RcvProcess(conn, wkStruct.getRCV_ISSUE_CTRL_CD());
			if( rcvPrc.execProcess() ){
				if(resultCeil){
					// 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
					strMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + wkStruct.getRCV_ISSUE_CTRL_CD();
					setInfoMessage("AF60004", strMessage);
				}
			} else {
				conn.rollback();
				return false;
			}
		}

		return true;
	}

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 一括振替ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPackageChange() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPackageChange");
			//{{user_implement_dev:<controlPackageChange>
		
		// ボタン名セット
		setButton("PackageChange");

		boolean transFlg = false;
		String strMessage = "";

		try{

			// 読込、一括振替の共通処理
			// 業務エラーが発生した場合は処理中断
			controlSelect();

			// 振替対象データが存在しない場合処理中断
			if((list == null) || (list.size() == 0)) return;

			// トランザクション開始
			conn.beginTransWeb();
			transFlg = true;

			// 業務運用日の取得
			String strBusinessOprDate = SystemInformation.getBusinessOprDate(getsysPLANT_CD());
			if(strBusinessOprDate == null){
				strMessage = "SYS_DATE_CTRL.PLANT_CD:" + getsysPLANT_CD();
				setErrorMessage("AF00056", strMessage);
				return;
			}

			// 会社コードの取得
			String strCompanyCd = SystemInformation.getSysMyCompanyCd();

			// 業務運用日、取引先コード、会社コードのセット処理
			for(int i=0; i<list.size(); i++) {
				AF0110010Struct viewStruct = (AF0110010Struct)list.get(i);

				// 業務運用日のセット
				viewStruct.setRCV_ISSUE_DATE(strBusinessOprDate);

				// 取引先コードのセット
				String strVendCd = "";
				List wkList = entity.mM_WH.read(conn, viewStruct);
				if(wkList.size() > 0){
					viewStruct.setVEND_CD(((AF0110010Struct)wkList.get(0)).getVEND_CD());
				}

				viewStruct.setCOMPANY_CD(strCompanyCd);

				// Orteus標準Structのコピー
				viewStruct.getDefaultData(struct);
			}

			if( !RcvIssueProcess() ){
				// 入出庫処理に失敗した場合
				return;
			}
			
			conn.commit();
			transFlg = false;
			
			if(list!=null) list.clear();

			// 振替終了のメッセージ表示
			setInfoMessage("AF60007");

		}catch(SQLException e){
			setSqlExceptionMsg(e);
		} finally {
			try {
				if( transFlg ){
					conn.rollback();
					transFlg = false;
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

                //}}user_implement_dev:<controlPackageChange>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPackageChange");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		
		List listMessage = new ArrayList();
		
		try {

			// 読込、一括振替の共通処理
			// 業務エラーが発生した場合は処理中断
			if( !commonProcess() ){
				if(list != null) list.clear();
				return;
			}

			// 振替予定数がセットされていない場合は表示しない
			// セットされている場合はコンボ(倉庫区分)の値を設定をする
			for(int i=0; i<list.size(); i++) {
				AF0110010Struct viewStruct = (AF0110010Struct)list.get(i);

				if( viewStruct.getCHANGE_PLAN_QTY() == null ){
					list.remove(i);
					i--;
					continue;
				}

				viewStruct.setWH_TYP_NAME(
						getTypeName(_WH_TYP, viewStruct.getWH_TYP()));
			}
			
			if(!"PackageChange".equals(getButton())){
				// 最大表示行数エラー
				int maxLine = sp.getMaxLine(conn,10);
				if(maxLine != 0 && this.list.size() > maxLine){
					list.clear();
					setErrorMessage("ZZ01115", "", ""+maxLine);
					return;
				}
			}

			if(list.size() <= 0){
				listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD());
				listMessage.add("T_JOB_ODR_CD_STOCK.JOB_ODR_DETAIL_NO:0");
				listMessage.add("T_JOB_ODR_CD_STOCK.PLANT_CD:" + struct.getw_PLANT_CD());
				setErrorMessage("AF60006", listMessage);
				return;
			}

		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}
		
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>

		if(list != null) list.clear();

                //}}user_implement_dev:<controlClear>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

		try{
			// コンボボックスの値設定
			setComboData();

			// クリア処理
			controlClear();
		}catch (ComboException e){
			setComboExceptionMsg(e);
		} catch(SQLException e) {
			setSqlExceptionMsg(e);
		}

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0110");
		logger.entering("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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

		// 工場コードのセット
		struct.setw_PLANT_CD(getsysPLANT_CD());

                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AF0110010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("PackageChange") ) {
				controlPackageChange();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
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
//			throw new FoundationException("AF0110010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0110010-E999","CSVの出力処理"));
			throw new FoundationException("AF0110010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0110010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0110010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0110010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0110010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0110010Entity entity;
	protected AF0110010Struct struct;
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

		entity = new AF0110010Entity();
		struct = new AF0110010Struct();

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
	 * AF0110010クラスの標準コンストラクタ
	 */
	public AF0110010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AF0110010Struct key = (AF0110010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_NAME") && key.getWH_NAME() != null) {
					msgKey.setKeyValue("WH_NAME", key.getWH_NAME());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP") && key.getWH_TYP() != null) {
					msgKey.setKeyValue("WH_TYP", key.getWH_TYP());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD") && key.getRCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CTRL_CD", key.getRCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP") && key.getRCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_TYP", key.getRCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("CHANGE_PLAN_QTY") && key.getCHANGE_PLAN_QTY() != null) {
					msgKey.setKeyValue("CHANGE_PLAN_QTY", key.getCHANGE_PLAN_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP") && key.getRCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("RCV_ISSUE_GNR_TYP", key.getRCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_COMP_FLG") && key.getJOB_COMP_FLG() != null) {
					msgKey.setKeyValue("JOB_COMP_FLG", key.getJOB_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("WH_TYP_NAME") && key.getWH_TYP_NAME() != null) {
					msgKey.setKeyValue("WH_TYP_NAME", key.getWH_TYP_NAME());
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
					AF0110010Struct key = new AF0110010Struct();
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_NAME")) {
						key.setWH_NAME(msgKey.getKeyValue("WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP")) {
						key.setWH_TYP(msgKey.getKeyValue("WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CTRL_CD")) {
						key.setRCV_ISSUE_CTRL_CD(msgKey.getKeyValue("RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_TYP")) {
						key.setRCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("CHANGE_PLAN_QTY")) {
						key.setCHANGE_PLAN_QTY(msgKey.getKeyValue("CHANGE_PLAN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_GNR_TYP")) {
						key.setRCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_COMP_FLG")) {
						key.setJOB_COMP_FLG(msgKey.getKeyValue("JOB_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("WH_TYP_NAME")) {
						key.setWH_TYP_NAME(msgKey.getKeyValue("WH_TYP_NAME"));
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
