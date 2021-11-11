/*
 * $Source: D:/EXPJCVS/EXPJCORE/ejstudioV2/EXPJStudio/tools/framework/expjhtml5/srcgen/rp_pfnd_tbl/ControlTempl.vm,v $
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
 * EXPJ    (2017/12/26),ツリー処理消費メモリ削減、getFlashTreeXML機能修正（ツリー未使用ソースへの影響なし）
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

package com.nec.jp.orteus.metamorBase.AA0010;

import com.nec.jp.orteus.metamorBase.AA0010.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common08.ClassMaster.ClassMaster;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0010010Control クラス
 * 品目メンテナンス
 *
 * 修正履歴
 * 2015/07/30 EJaSCM／EJa機能強化対応
 */
//}}user_implement_code_header

public class AA0010010Control
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
	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値（メディエータ）を返します。

	public AA0010010Struct getStruct() { return this.struct; }	// Structの値（メディエータ）を返します。


//------------------------------------------------------------------------------

	/** 出庫区分 */
	private ComboStruct _ISSUE_TYP = new ComboStruct();

	/** 出庫区分設定
	 * @param コンボボックスデータ
	*/
	public void setISSUE_TYP(ComboStruct combo){ _ISSUE_TYP = combo; }

	/** 出庫区分取得
	 * @return 出庫区分のコンボボックスデータ
	*/
	public ComboStruct getISSUE_TYP(){ return _ISSUE_TYP; }


	/** 内外作区分 */
	private ComboStruct _OUTSIDE_TYP = new ComboStruct();

	/** 内外作区分設定
	 * @param コンボボックスデータ
	*/
	public void setOUTSIDE_TYP(ComboStruct combo){ _OUTSIDE_TYP = combo; }

	/** 内外作区分取得
	 * @return 内外作区分のコンボボックスデータ
	*/
	public ComboStruct getOUTSIDE_TYP(){ return _OUTSIDE_TYP; }


	/** 荷姿管理フラグ */
	private ComboStruct _STOCK_UNIT_FLG = new ComboStruct();

	/** 荷姿管理フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setSTOCK_UNIT_FLG(ComboStruct combo){ _STOCK_UNIT_FLG = combo; }

	/** 荷姿管理フラグ取得
	 * @return 荷姿管理フラグのコンボボックスデータ
	*/
	public ComboStruct getSTOCK_UNIT_FLG(){ return _STOCK_UNIT_FLG; }


	/** 在庫数単位区分 */
	private ComboStruct _UNIT_QTY_TYP = new ComboStruct();

	/** 在庫数単位区分設定
	 * @param コンボボックスデータ
	*/
	public void setUNIT_QTY_TYP(ComboStruct combo){ _UNIT_QTY_TYP = combo; }

	/** 在庫数単位区分取得
	 * @return 在庫数単位区分のコンボボックスデータ
	*/
	public ComboStruct getUNIT_QTY_TYP(){ return _UNIT_QTY_TYP; }


	/** 品目手配区分 */
	private ComboStruct _MRP_ODR_TYP = new ComboStruct();

	/** 品目手配区分設定
	 * @param コンボボックスデータ
	*/
	public void setMRP_ODR_TYP(ComboStruct combo){ _MRP_ODR_TYP = combo; }

	/** 品目手配区分取得
	 * @return 品目手配区分のコンボボックスデータ
	*/
	public ComboStruct getMRP_ODR_TYP(){ return _MRP_ODR_TYP; }


	/** ロットまとめ区分 */
	private ComboStruct _LOT_SIZING_TYP = new ComboStruct();

	/** ロットまとめ区分設定
	 * @param コンボボックスデータ
	*/
	public void setLOT_SIZING_TYP(ComboStruct combo){ _LOT_SIZING_TYP = combo; }

	/** ロットまとめ区分取得
	 * @return ロットまとめ区分のコンボボックスデータ
	*/
	public ComboStruct getLOT_SIZING_TYP(){ return _LOT_SIZING_TYP; }

// 2008/07/14 SYSCOM 小林 ADD START
	/** 工数管理品目区分 */
	private ComboStruct _MANHOUR_TYP = new ComboStruct();

	/** 工数管理品目区分設定
	 * @param コンボボックスデータ
	*/
	public void setMANHOUR_TYP(ComboStruct combo){ _MANHOUR_TYP = combo; }

	/** 工数管理品目区分取得
	 * @return 工数管理品目区分のコンボボックスデータ
	*/
	public ComboStruct getMANHOUR_TYP(){ return _MANHOUR_TYP; }
// 2008/07/14 SYSCOM 小林 ADD END

	/** MPS品目フラグ */
	private ComboStruct _MPS_FLG = new ComboStruct();

	/** MPS品目フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setMPS_FLG(ComboStruct combo){ _MPS_FLG = combo; }

	/** MPS品目フラグ取得
	 * @return MPS品目フラグのコンボボックスデータ
	*/
	public ComboStruct getMPS_FLG(){ return _MPS_FLG; }


	/** 受入検査区分 */
	private ComboStruct _ACPT_INSPC_TYP = new ComboStruct();

	/** 受入検査区分設定
	 * @param コンボボックスデータ
	*/
	public void setACPT_INSPC_TYP(ComboStruct combo){ _ACPT_INSPC_TYP = combo; }

	/** 受入検査区分取得
	 * @return 受入検査区分のコンボボックスデータ
	*/
	public ComboStruct getACPT_INSPC_TYP(){ return _ACPT_INSPC_TYP; }


	/** 製品区分 */
	private ComboStruct _PRODUCT_TYP = new ComboStruct();

	/** 製品区分設定
	 * @param コンボボックスデータ
	*/
	public void setPRODUCT_TYP(ComboStruct combo){ _PRODUCT_TYP = combo; }

	/** 製品区分取得
	 * @return 製品区分のコンボボックスデータ
	*/
	public ComboStruct getPRODUCT_TYP(){ return _PRODUCT_TYP; }


	/** 棚卸区分 */
	private ComboStruct _ABC_TYP = new ComboStruct();

	/** 棚卸区分設定
	 * @param コンボボックスデータ
	*/
	public void setABC_TYP(ComboStruct combo){ _ABC_TYP = combo; }

	/** 棚卸区分取得
	 * @return 棚卸区分のコンボボックスデータ
	*/
	public ComboStruct getABC_TYP(){ return _ABC_TYP; }


	/** 作業実績区分 */
	private ComboStruct _OPR_RSLT_TYP = new ComboStruct();

	/** 作業実績区分設定
	 * @param コンボボックスデータ
	*/
	public void setOPR_RSLT_TYP(ComboStruct combo){ _OPR_RSLT_TYP = combo; }

	/** 作業実績区分取得
	 * @return 作業実績区分のコンボボックスデータ
	*/
	public ComboStruct getOPR_RSLT_TYP(){ return _OPR_RSLT_TYP; }


	/** 受給品区分 */
	private ComboStruct _SPL_ITEM_TYP = new ComboStruct();

	/** 受給品区分設定
	 * @param コンボボックスデータ
	*/
	public void setSPL_ITEM_TYP(ComboStruct combo){ _SPL_ITEM_TYP = combo; }

	/** 受給品区分取得
	 * @return 受給品区分のコンボボックスデータ
	*/
	public ComboStruct getSPL_ITEM_TYP(){ return _SPL_ITEM_TYP; }

	/** 計量単位 */
	private ComboStruct _STOCK_UNIT = new ComboStruct();

	/** 計量単位設定
	 * @param コンボボックスデータ
	*/
	public void setSTOCK_UNIT(ComboStruct combo){ _STOCK_UNIT = combo; }

	/** 計量単位取得
	 * @return 計量単位のコンボボックスデータ
	*/
	public ComboStruct getSTOCK_UNIT(){ return _STOCK_UNIT; }


	/** 保管区分 */
	private ComboStruct _DEPO_TYP = new ComboStruct();

	/** 保管区分設定
	 * @param コンボボックスデータ
	*/
	public void setDEPO_TYP(ComboStruct combo){ _DEPO_TYP = combo; }

	/** 保管区分取得
	 * @return 保管区分のコンボボックスデータ
	*/
	public ComboStruct getDEPO_TYP(){ return _DEPO_TYP; }

	/** ロット管理フラグ */
	private ComboStruct _LOT_CTRL_FLG = new ComboStruct();

	/** ロット管理フラグ設定
	 * @param コンボボックスデータ
	*/
	public void setLOT_CTRL_FLG(ComboStruct combo){ _LOT_CTRL_FLG = combo; }

	/** ロット管理フラグ取得
	 * @return ロット管理フラグ分のコンボボックスデータ
	*/
	public ComboStruct getLOT_CTRL_FLG(){ return _LOT_CTRL_FLG; }
	
	/** ロット採番区分 */
	private ComboStruct _LOT_NUMBERING_TYP = new ComboStruct();

	/** ロット採番区分設定
	 * @param コンボボックスデータ
	*/
	public void setLOT_NUMBERING_TYP(ComboStruct combo){ _LOT_NUMBERING_TYP = combo; }

	/** ロット採番区分取得
	 * @return ロット管理フラグ分のコンボボックスデータ
	*/
	public ComboStruct getLOT_NUMBERING_TYP(){ return _LOT_NUMBERING_TYP; }	

//20150730 ADD START BY SYSCOM
	/**プロジェクトコード*/
	private ComboStruct _unitPjCdStruct = new ComboStruct();
	/** プロジェクトコード設定
	 * @param コンボボックスデータ
	*/
	public void setPJ_CD(ComboStruct combo){_unitPjCdStruct = combo;}
	/** プロジェクトコード取得
	 * @return プロジェクトコードのコンボボックスデータ
	*/
	public ComboStruct getPJ_CD(){ return _unitPjCdStruct; }
	
	/**セグメント1*/
	private ComboStruct _unitSegContent1Struct = new ComboStruct();
	/** セグメント1設定
	 * @param コンボボックスデータ
	*/
	public void setSEG_CONTENTS1(ComboStruct combo){_unitSegContent1Struct = combo;}
	/** セグメント1取得
	 * @return セグメント1のコンボボックスデータ
	*/
	public ComboStruct getSEG_CONTENTS1(){ return _unitSegContent1Struct; }
		
	/**セグメント2*/
    private ComboStruct _unitSegContent2Struct = new ComboStruct();
	/** セグメント2設定
	 * @param コンボボックスデータ
	*/
	public void setSEG_CONTENTS2(ComboStruct combo){_unitSegContent2Struct = combo;}
	/** セグメント2取得
	 * @return セグメント2のコンボボックスデータ
	*/
	public ComboStruct getSEG_CONTENTS2(){ return _unitSegContent2Struct; }
		
	/**セグメント3*/
    private ComboStruct _unitSegContent3Struct = new ComboStruct();
	/** セグメント3設定
	 * @param コンボボックスデータ
	*/
	public void setSEG_CONTENTS3(ComboStruct combo){_unitSegContent3Struct = combo;}
	/** セグメント3取得
	 * @return セグメント3のコンボボックスデータ
	*/
	public ComboStruct getSEG_CONTENTS3(){ return _unitSegContent3Struct; }
		
	/**セグメント4*/
    private ComboStruct _unitSegContent4Struct = new ComboStruct();
	/** セグメント4設定
	 * @param コンボボックスデータ
	*/
	public void setSEG_CONTENTS4(ComboStruct combo){_unitSegContent4Struct = combo;}
	/** セグメント4取得
	 * @return セグメント4のコンボボックスデータ
	*/
	public ComboStruct getSEG_CONTENTS4(){ return _unitSegContent4Struct; }
		
//20150730 ADD END BY SYSCOM
		
	/**  分類マスタ名 */
	
	private String _ITEM_CLASS_01_TYP = new String();
	
	private String _ITEM_CLASS_02_TYP = new String();
	
	private String _ITEM_CLASS_03_TYP = new String();
	
	private String _ITEM_CLASS_04_TYP = new String();
	
	private String _ITEM_CLASS_05_TYP = new String();
	
	private String _ITEM_CLASS_06_TYP = new String();
	
	private String _ITEM_CLASS_07_TYP = new String();
	
	private String _ITEM_CLASS_08_TYP = new String();
	
	private String _ITEM_CLASS_09_TYP = new String();
	
	private String _ITEM_CLASS_10_TYP = new String();
	
	private String _ITEM_CLASS_11_TYP = new String();
	
	private String _ITEM_CLASS_12_TYP = new String();

//20150730 ADD START BY SYSCOM
	//負担部門コード選択用のPEEKERに用いる変数
	private String sysCOMPANY_CD;
	public String getsysCOMPANY_CD(){ return sysCOMPANY_CD; }
//20150730 ADD END BY SYSCOM

//---------- 品目手配区分構成チェック処理 -------------------------------------

	/**
	 * 品目手配区分別構成チェック
	 * @param repository 製品構成リポジトリ
	 * @param parent 親品目番号
	 * @param comp 子品目番号
	 * @return true：OK  false:NG
	*/
	private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
										AA0010010Struct parent, AA0010010Struct comp)
		throws SQLException, FoundationException
	{
		Integer parent_typ = parent.getMRP_ODR_TYP();
		Integer comp_typ = comp.getMRP_ODR_TYP();

		//  親品目 ④マニュアル手配品目、⑤ロット手配品目、⑥定量手配品目、⑦発注点手配品目
		if(parent_typ.intValue() == 4 || parent_typ.intValue() == 5 ||
			parent_typ.intValue() == 6 || parent_typ.intValue() == 7){
			
			//  子品目 ①個別品目 ②在庫引当型個別品目
			if(comp_typ.intValue() == 1 || comp_typ.intValue() == 2) return false;
		}
		
		ArrayList itemList = null;
		// 親品目 ⑧擬似品目
		if(parent_typ.intValue() == 8)
		{
			// 子品目 ⑧擬似品目
			if(comp_typ.intValue() == 8) return false;
			else if(comp_typ.intValue() == 4 || comp_typ.intValue() == 5 ||
					comp_typ.intValue() == 6 || comp_typ.intValue() == 7) return true;
			else{
				// 親品目が子品目となる構成情報の親品目取得
				itemList = repository.reverseDeployment(parent.getITEM_CD());
				AA0010010Struct workStruct = new AA0010010Struct();
				for(int i = 0; i < itemList.size(); i++)
				{
					// 取得した親品目の手配区分取得
					workStruct.setITEM_CD((String)itemList.get(i));
					List parentList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
					Integer typ = ((AA0010010Struct)parentList.get(0)).getMRP_ODR_TYP();
					
					if(typ.intValue() == 4 || typ.intValue() == 5 ||
						typ.intValue() == 6 || typ.intValue() == 7) return false;
				}
			}
		}

		// 子品目 ⑧擬似品目
		if(comp_typ.intValue() == 8)
		{
			// 親品目 ⑧擬似品目
			if(parent_typ.intValue() == 8) return false;
			else if(parent_typ.intValue() == 1 || parent_typ.intValue() == 2) return true;
			else{
				// 子品目が親品目となる構成情報の子品目取得
				itemList = repository.orderDeployment(comp.getITEM_CD());
				AA0010010Struct workStruct = new AA0010010Struct();
				for(int i = 0; i < itemList.size(); i++)
				{
					// 取得した子品目の手配区分取得
					workStruct.setITEM_CD((String)itemList.get(i));
					List compList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
					Integer typ = ((AA0010010Struct)compList.get(0)).getMRP_ODR_TYP();
					
					if(typ.intValue() == 1 || typ.intValue() == 2 ) return false;
				}
			}
		}

		return true;
	}


	// 子品目の品目手配区分の妥当性確認
	private boolean checkLowerType(
						ProductStructureRepository rep,
						AA0010010Struct myself
						) throws FoundationException, SQLException
	{
		// 構成情報取得
		List list = rep.orderDeployment(myself.getITEM_CD());

		// 妥当性確認
		boolean result = true;
		AA0010010Struct work = new AA0010010Struct();
		for (int i = 0; i < list.size(); i++)
		{
			// 子品目取得
			work.setITEM_CD((String)list.get(i));
			List comList = entity.mselectMRP_ODR_TYP.read(conn, work);
			AA0010010Struct comp = (AA0010010Struct)comList.get(0);

			// 判定
			if (checkMRP_ODR_TYP(rep, myself, comp) == false) {
				result = false;
				break;
			}
		}
		return result;
	}

	// 親品目の品目手配区分の妥当性確認
	private boolean checkUpperType(
						ProductStructureRepository rep,
						AA0010010Struct myself
						) throws FoundationException, SQLException
	{
		// 構成情報取得
		List list = rep.reverseDeployment(myself.getITEM_CD());

		// 妥当性確認
		boolean result = true;
		AA0010010Struct work = new AA0010010Struct();
		for (int i = 0; i < list.size(); i++)
		{
			// 親品目取得
			work.setITEM_CD((String)list.get(i));
			List parentList = entity.mselectMRP_ODR_TYP.read(conn, work);
			AA0010010Struct parent = (AA0010010Struct)parentList.get(0);

			// 判定
			if (checkMRP_ODR_TYP(rep, parent, myself) == false) {
				result = false;
				break;
			}
		}
		return result;
	}

	// 作業系列とのリードタイム設定の妥当性確認  OK:true/NG:false
	private boolean isValidLT(AA0010010Struct s) throws SQLException, FoundationException
	{
		List key = new ArrayList();

		// 品目比例LTが設定ありなら 無条件にOK
		Integer propLT = IntegerConverter.Convert(struct.getPROP_LT());
		if (propLT.intValue() != 0)  return true;

		// 品目の固定LT
		Integer itemFixLT = IntegerConverter.Convert(struct.getFIXED_LT());

		// 工場ごとのLT読込
		boolean result = true;
		List lts = entity.mLTbyPLANT.read(conn,struct);
		for(int n = 0; n < lts.size(); n++){
			AA0010010Struct w = (AA0010010Struct)lts.get(n);

			// 系列比例LTが設定ありなら 無条件にOK
			if(w.getSUM_PROP_LT().intValue() != 0) continue;

			// 系列の固定LTが品目固定LTより大きければ警告対象
			Integer procFixLT = w.getSUM_FIXED_LT();
			if(itemFixLT.intValue() < procFixLT.intValue()){
				if(result == true){ // 最初の警告のときだけ出力するログ
					// エラーメッセージ作成
					key.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
					key.add("M_ITEM.FIXED_LT:" + struct.getFIXED_LT());
					setWarnMessage("AA60001", key);
				}
				// エラーメッセージ作成
				key.add("M_PROC_GRP.PLANT_CD:" + w.getPLANT_CD());
				key.add("M_PROC_GRP.SUM_FIXED_LT:" + procFixLT.toString());
				setWarnMessage("AA60001", key);

			}
		}
		return result;
	}
	
	// 品目手配区分表示説明の取得
	private String getMRP_ODR_TYP_DISPLAY_NAME(String value) throws ExpjException{
		struct.setuMRP_ODR_TYP_VALUE(value);
		try {
			list = entity.mselectMRP_ODR_TYP_DISPLAY_NAME.read(conn, struct);
		} catch(SQLException e){
			// エラーメッセージ作成
			String keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);
		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;
		}
		if(getListsize()>0){
			return ((AA0010010Struct)list.get(0)).getuMRP_ODR_TYP_DISPLAY_NAME();
		}
		return "undefined";
	}
//---------------品目承認用-------------------------------------------
    // 品目承認
    //String aprItem;	
    String _APPR_ITEM;			        
    // 画面遷移パラメータ
    String _SCREENMOVE_TYP;	
    String _APPR_ID;

	public SystemLog getSysLog() {
		return sysLog;
	}
	public void setSysLog(SystemLog sysLog) {
		this.sysLog = sysLog;
	}
	
	public IDbConnection getConn() {
		return conn;
	}
	public void setConn(IDbConnection conn) {
		this.conn = conn;
	}
	public void setStruct(Object structname) { this.struct.setStruct((AA0010010Struct)structname); }	// Structをセットします。
	/**
	 * マスタキーの集う
	 */
	private HashMap keyValueMap = new HashMap();
	
	/**
	 * @return Returns the keyValueMap.
	 */
	public HashMap getKeyValueMap() {
		return keyValueMap;
	}
	/**
	 * @param keyValueMap The keyvalueMap to set.
	 */
	public void setKeyValueMap(HashMap keyvalueMap) {
		this.keyValueMap = keyvalueMap;
	}
	

	/**
	 * 承認情報を登録
	 * @param button
	 * @throws SQLException
	 */
    private boolean insertAppr(String button) throws SQLException{   	
    	/** 承認依頼存在チェック */
		ArrayList keyValueList = new ArrayList();
		// 変数設定(品目番号)
		MstColumns key1 = new MstColumns();
		key1.setColumnname("ITEM_CD");
		key1.setColumnvalue(struct.getITEM_CD());
		keyValueList.add(key1);
		
		
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0010010","AA0010010Servlet");
		// 承認依頼存在チェック
		boolean rtnFlg = mstappr.checkMST_APPR("M_ITEM", keyValueList);
		if(rtnFlg) {
			// キーが存在している
			ExpjMessage emsg = new ExpjMessage("KA00125");
			msgStruct.addError(emsg); // ワーニングメッセージとして登録
			sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
			return false;
		}
		
    	/** 承認依頼表へ登録　*/
    	MstApprStruct mstApprStruct = new MstApprStruct();
    	// 画面URL
    	mstApprStruct.setSCREEN_URL("AA0010010Servlet");
    	// 工場コード
    	mstApprStruct.setPLANT_CD(getsysPLANT_CD());
    	// 処理区分
    	mstApprStruct.setPROC_TYP(button);
    	// 承認備考
    	mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   	
    	// 承認状態(承認待ち)
    	mstApprStruct.setSTATUS("1");
    	// 依頼者
    	mstApprStruct.setREQUEST_BY(struct.getsUser_ID());
    	// 承認依頼表にデータを追加
    	String appr_ID = mstappr.insertMST_APPR(mstApprStruct);
    	
    	
    	/** 承認キーへ登録 */
    	MstApprKeyStruct keyStruct = new MstApprKeyStruct();
    	// 承認ID
    	keyStruct.setAPPR_ID(appr_ID);
    	// テーブル名
    	keyStruct.setTABLE_NAME("M_ITEM");
    	// キー名(品目番号)
    	keyStruct.setKEY_NAME("ITEM_CD");
    	// キー値(品目番号)
    	keyStruct.setKEY_VALUE(struct.getITEM_CD());
    	// 承認キー対応表にマスタのキー(品目番号)を追加する
    	mstappr.insertMST_APPR_KEY(keyStruct);
    	
    	
    	/** 承認明細表へ登録 */
    	// 品目番号
		String columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CD(),columnID);	
		// 品目名
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_NAME");
		mstappr.setDetailByColumnID(struct.getITEM_NAME(),columnID);		
		// 図面番号
		columnID = mstappr.getColumnID( "M_ITEM", "DRAW_CD");
		mstappr.setDetailByColumnID(struct.getDRAW_CD(),columnID);
		// 規格
		columnID = mstappr.getColumnID( "M_ITEM", "SPEC");
		mstappr.setDetailByColumnID(struct.getSPEC(),columnID);				
		// レベル番号
		columnID = mstappr.getColumnID( "M_ITEM", "HIGH_LEVEL_NO");
		if(struct.getHIGH_LEVEL_NO() == null || "".equals(struct.getHIGH_LEVEL_NO())){
			mstappr.setDetailByColumnID("0",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getHIGH_LEVEL_NO(),columnID);				
		}	
		// 品目手配区分
		columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
		if(struct.getMRP_ODR_TYP() == null || "".equals(struct.getMRP_ODR_TYP())){
			mstappr.setDetailByColumnID("1",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getMRP_ODR_TYP().toString(),columnID);
		}
		// 品目内外作区分
		columnID = mstappr.getColumnID( "M_ITEM", "OUTSIDE_TYP");
		if(struct.getOUTSIDE_TYP() == null || "".equals(struct.getOUTSIDE_TYP())){
			mstappr.setDetailByColumnID("1",columnID);					
		}else{
			mstappr.setDetailByColumnID(struct.getOUTSIDE_TYP().toString(),columnID);					
		}	
		// 荷姿管理フラグ
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT_FLG");
		if(struct.getSTOCK_UNIT_FLG() == null || "".equals(struct.getSTOCK_UNIT_FLG())){
			mstappr.setDetailByColumnID("2",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getSTOCK_UNIT_FLG().toString(),columnID);				
		}	
		// 計量単位
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
		mstappr.setDetailByColumnID(struct.getSTOCK_UNIT(),columnID);	
		// 荷姿計量単位
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT");
		mstappr.setDetailByColumnID(struct.getPKG_UNIT(),columnID);		
		// 荷姿単位数
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT_QTY");
		if(struct.getPKG_UNIT_QTY() == null || "".equals(struct.getPKG_UNIT_QTY())){
			mstappr.setDetailByColumnID("1",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getPKG_UNIT_QTY(),columnID);				
		}	
		// 在庫数単位区分
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
		if(struct.getUNIT_QTY_TYP() == null || "".equals(struct.getUNIT_QTY_TYP())){
			mstappr.setDetailByColumnID("1",columnID);				
		}else{
			mstappr.setDetailByColumnID(struct.getUNIT_QTY_TYP().toString(),columnID);				
		}	
		// 品目手配リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_LT");
		if(struct.getODR_LT() == null || "".equals(struct.getODR_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getODR_LT(),columnID);		
		}
		// 品目固定分リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_LT");
		if(struct.getFIXED_LT() == null || "".equals(struct.getFIXED_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getFIXED_LT(),columnID);			
		}
		// 品目比例分リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LT");
		if(struct.getPROP_LT() == null || "".equals(struct.getPROP_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getPROP_LT(),columnID);			
		}
		// 安全日数
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_LT");
		if(struct.getSAFETY_LT() == null || "".equals(struct.getSAFETY_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getSAFETY_LT(),columnID);			
		}
		// 払出リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_LT");
		if(struct.getISSUE_LT() == null || "".equals(struct.getISSUE_LT())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getISSUE_LT(),columnID);			
		}
		// 品目比例分ロットサイズ
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LOT_SIZE");
		if(struct.getPROP_LOT_SIZE() == null || "".equals(struct.getPROP_LOT_SIZE())){
			mstappr.setDetailByColumnID("1",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getPROP_LOT_SIZE(),columnID);			
		}
		// 品目仕損率
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_SPOIL");
		if(struct.getITEM_SPOIL() == null || "".equals(struct.getITEM_SPOIL())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getITEM_SPOIL(),columnID);			
		}
		// 安全在庫量
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
		if(struct.getSAFETY_STOCK() == null || "".equals(struct.getSAFETY_STOCK())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getSAFETY_STOCK(),columnID);
		}
		
		// ロットまとめ区分
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_SIZING_TYP");
		mstappr.setDetailByColumnID(struct.getLOT_SIZING_TYP().toString(),columnID);
		// 最大まとめ期間
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_PERIOD");
		if(struct.getMAX_PERIOD() == null || "".equals(struct.getMAX_PERIOD())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMAX_PERIOD(),columnID);
		}
		
		// 最大手配数
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
		if(struct.getMAX_ODR_QTY() == null || "".equals(struct.getMAX_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMAX_ODR_QTY(),columnID);
		}
		
		// 発注点在庫数
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
		if(struct.getODR_POINT() == null || "".equals(struct.getODR_POINT())){
			mstappr.setDetailByColumnID(struct.getODR_POINT(),columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getODR_POINT(),columnID);
		}
		
		// 定量発注数
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
		if(struct.getFIXED_ODR_QTY() == null || "".equals(struct.getFIXED_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getFIXED_ODR_QTY(),columnID);
		}
		
		// 最小手配数
		columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
		if(struct.getMIN_ODR_QTY() == null || "".equals(struct.getMIN_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMIN_ODR_QTY(),columnID);
		}
			
		// まるめ単位
		columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
		if(struct.getMUL_ODR_QTY() == null || "".equals(struct.getMUL_ODR_QTY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getMUL_ODR_QTY(),columnID);
		}
		
		// 出庫区分
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_TYP");
		mstappr.setDetailByColumnID(struct.getISSUE_TYP().toString(),columnID);
		// MPS品目フラグ
		columnID = mstappr.getColumnID( "M_ITEM", "MPS_FLG");
		mstappr.setDetailByColumnID(struct.getMPS_FLG().toString(),columnID);
		// 受入検査区分
		columnID = mstappr.getColumnID( "M_ITEM", "ACPT_INSPC_TYP");
		mstappr.setDetailByColumnID(struct.getACPT_INSPC_TYP().toString(),columnID);
		// 製品区分
		columnID = mstappr.getColumnID( "M_ITEM", "PRODUCT_TYP");
		mstappr.setDetailByColumnID(struct.getPRODUCT_TYP().toString(),columnID);
		// 管理コード
		columnID = mstappr.getColumnID( "M_ITEM", "CLASIFICATION_CD");
		mstappr.setDetailByColumnID(struct.getCLASIFICATION_CD(),columnID);
		// 単位重量
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_WEIGHT");
		if(struct.getUNIT_WEIGHT() == null || "".equals(struct.getUNIT_WEIGHT())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getUNIT_WEIGHT(),columnID);
		}
		
		// 棚卸区分
		columnID = mstappr.getColumnID( "M_ITEM", "ABC_TYP");
		mstappr.setDetailByColumnID(struct.getABC_TYP().toString(),columnID);
		// 作業実績区分
		columnID = mstappr.getColumnID( "M_ITEM", "OPR_RSLT_TYP");
		mstappr.setDetailByColumnID(struct.getOPR_RSLT_TYP().toString(),columnID);
	
		// 受給品区分
		columnID = mstappr.getColumnID( "M_ITEM", "SPL_ITEM_TYP");
		mstappr.setDetailByColumnID(struct.getSPL_ITEM_TYP().toString(),columnID);
		// 消費税コード
		columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
		mstappr.setDetailByColumnID(struct.getTAX_CD(),columnID);
	
		// カレンダ番号
		columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
		if(struct.getCAL_NO() == null || "".equals(struct.getCAL_NO())){
			mstappr.setDetailByColumnID("",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getCAL_NO().toString(),columnID);
		}
		
		// 賞味期限年数
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_YEAR");
		if(struct.getBEST_BEFORE_YEAR() == null || "".equals(struct.getBEST_BEFORE_YEAR())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getBEST_BEFORE_YEAR(),columnID);
		}
		// 賞味期限月数
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_MONTH");
		if(struct.getBEST_BEFORE_MONTH() == null || "".equals(struct.getBEST_BEFORE_MONTH())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getBEST_BEFORE_MONTH(),columnID);
		}
		
		// 賞味期限日数
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DAY");
		if(struct.getBEST_BEFORE_DAY() == null || "".equals(struct.getBEST_BEFORE_DAY())){
			mstappr.setDetailByColumnID("0",columnID);
		}else{
			mstappr.setDetailByColumnID(struct.getBEST_BEFORE_DAY(),columnID);
		}
		
		// 出荷期限年数
		columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_YEAR");
		mstappr.setDetailByColumnID("0",columnID);
		// 出荷期限月数
		columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_MONTH");
		mstappr.setDetailByColumnID("0",columnID);
		// 出荷期限日数
		columnID = mstappr.getColumnID( "M_ITEM", "SHIP_DEADLINE_DAY");
		mstappr.setDetailByColumnID("0",columnID);
		// ロット管理フラグ
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
		mstappr.setDetailByColumnID(struct.getLOT_CTRL_FLG().toString(),columnID);
		// ロット番号採番区分
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_NUMBERING_TYP");
		mstappr.setDetailByColumnID(struct.getLOT_NUMBERING_TYP().toString(),columnID);
		// 受注単位
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_UNIT");
		mstappr.setDetailByColumnID("",columnID);
		// 受注単位数
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_UNIT_QTY");
		mstappr.setDetailByColumnID("1",columnID);
		// 最大在庫数
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_STOCK_QTY");
		mstappr.setDetailByColumnID("0",columnID);
		//品目分類０１
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_TYP");
		mstappr.setDetailByColumnID("3001",columnID);	
		//品目分類０１コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_01_CD(),columnID);
		//品目分類０１名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０2
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_TYP");
		mstappr.setDetailByColumnID("3002",columnID);	
		//品目分類０2コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_02_CD(),columnID);
		//品目分類０2名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０3
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_TYP");
		mstappr.setDetailByColumnID("3003",columnID);	
		//品目分類０3コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_03_CD(),columnID);
		//品目分類０3名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０4
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_TYP");
		mstappr.setDetailByColumnID("3004",columnID);	
		//品目分類０4コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_04_CD(),columnID);
		//品目分類０4名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０5
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_TYP");
		mstappr.setDetailByColumnID("3005",columnID);	
		//品目分類０5コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_05_CD(),columnID);
		//品目分類０5名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０6
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_TYP");
		mstappr.setDetailByColumnID("3006",columnID);	
		//品目分類０１コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_06_CD(),columnID);
		//品目分類０１名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０7
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_TYP");
		mstappr.setDetailByColumnID("3007",columnID);	
		//品目分類０7コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_07_CD(),columnID);
		//品目分類０7名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０8
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_TYP");
		mstappr.setDetailByColumnID("3008",columnID);	
		//品目分類０8コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_08_CD(),columnID);
		//品目分類０8名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類０9
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_TYP");
		mstappr.setDetailByColumnID("3009",columnID);	
		//品目分類０9コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_09_CD(),columnID);
		//品目分類０9名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類10
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_TYP");
		mstappr.setDetailByColumnID("3010",columnID);	
		//品目分類10コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_10_CD(),columnID);
		//品目分類10名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類11
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_TYP");
		mstappr.setDetailByColumnID("3011",columnID);	
		//品目分類11コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_11_CD(),columnID);
		//品目分類11名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_NAME");
		mstappr.setDetailByColumnID("",columnID);
		//品目分類12
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_TYP");
		mstappr.setDetailByColumnID("3012",columnID);	
		//品目分類12コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_CD");
		mstappr.setDetailByColumnID(struct.getITEM_CLASS_12_CD(),columnID);
		//品目分類12名称
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_NAME");
		mstappr.setDetailByColumnID("",columnID);
		// 保管区分
		columnID = mstappr.getColumnID( "M_ITEM", "DEPO_TYP");
		mstappr.setDetailByColumnID(struct.getDEPO_TYP().toString(),columnID);
		// JANコード
		columnID = mstappr.getColumnID( "M_ITEM", "JANCODE");
		mstappr.setDetailByColumnID("",columnID);
		// 代表パターンコード
		columnID = mstappr.getColumnID( "M_ITEM", "PATTERN_CD");
		mstappr.setDetailByColumnID("",columnID);
		// 生産場所
		columnID = mstappr.getColumnID( "M_ITEM", "PRD_CD");
		mstappr.setDetailByColumnID("",columnID);
		// セットリードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "SET_LT");
		mstappr.setDetailByColumnID("0",columnID);
		// 賞味期限リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DATE_LT");
		mstappr.setDetailByColumnID("0",columnID);
		// 備考１
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK1");
		mstappr.setDetailByColumnID(struct.getREMARK1(),columnID);
		// 備考２
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK2");
		mstappr.setDetailByColumnID(struct.getREMARK2(),columnID);
		// 工数管理品目区分
		columnID = mstappr.getColumnID( "M_ITEM", "MANHOUR_TYP");
		mstappr.setDetailByColumnID(struct.getMANHOUR_TYP().toString(),columnID);		
		
		// 作成日
		columnID = mstappr.getColumnID("M_ITEM","CREATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// 作成者
		columnID = mstappr.getColumnID("M_ITEM","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 作成プログラム名
		columnID = mstappr.getColumnID("M_ITEM","CREATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// 更新日
		columnID = mstappr.getColumnID("M_ITEM","UPDATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// 更新者
		columnID = mstappr.getColumnID("M_ITEM","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 更新プログラム名
		columnID = mstappr.getColumnID("M_ITEM","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// 更新数
		columnID = mstappr.getColumnID("M_ITEM","MODIFY_COUNT");
		if("1".equals(button)){
			mstappr.setDetailByColumnID("0",columnID);  	
		}else{
			mstappr.setDetailByColumnID(struct.getMODIFY_COUNT(),columnID);  	
		}
//20150730 ADD START BY SYSCOM
    	// 負担部門コード
		columnID = mstappr.getColumnID( "M_ITEM", "DEPT_CD");
		mstappr.setDetailByColumnID(struct.getDEPT_CD().toString(),columnID);
    	// プロジェクトコード
    	//プロジェクトコードが何も選択されていない（全角スペース）だった場合
		if("　".equals(struct.getPJ_CD())){
			struct.setPJ_CD("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "PJ_CD");
		mstappr.setDetailByColumnID(struct.getPJ_CD().toString(),columnID);
    	// セグメント1
    	//セグメント1が何も選択されていない（全角スペース）だった場合
		if("　".equals(struct.getSEG_CONTENTS1())){
			struct.setSEG_CONTENTS1("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS1");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS1().toString(),columnID);
      	// セグメント2
    	//セグメント2が何も選択されていない（全角スペース）だった場合
		if("　".equals(struct.getSEG_CONTENTS2())){
			struct.setSEG_CONTENTS2("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS2");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS2().toString(),columnID);
    	// セグメント3
    	//セグメント3が何も選択されていない（全角スペース）だった場合
		if("　".equals(struct.getSEG_CONTENTS3())){
			struct.setSEG_CONTENTS3("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS3");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS3().toString(),columnID);
    	// セグメント4
		//セグメント4が何も選択されていない（全角スペース）だった場合
		if("　".equals(struct.getSEG_CONTENTS4())){
			struct.setSEG_CONTENTS4("");
		}
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS4");
		mstappr.setDetailByColumnID(struct.getSEG_CONTENTS4().toString(),columnID);
//20150730 ADD END BY SYSCOM

		// 承認明細にデータを追加する。
		mstappr.insertMST_APPR_DETAIL("M_ITEM",appr_ID);
    	
		// 承認を依頼しました。
		setInfoMessage("AZ00042");
		
		return true;
    	
    }
    

	/**
	 * 承認後ボタン押すと、画面ITEMを設定
	 * @param tempStruct
	 * @param columnID
	 * @throws SQLException
	 * @throws FoundationException 
	 */

	private void setMoveItem(MstAppr mstappr, MstApprDetailStruct tempStruct) throws SQLException, FoundationException {

		String columnID = null;
		// 品目名
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_NAME");
		struct.setITEM_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 図面番号
		columnID = mstappr.getColumnID( "M_ITEM", "DRAW_CD");
		struct.setDRAW_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 規格
		columnID = mstappr.getColumnID( "M_ITEM", "SPEC");
		struct.setSPEC(mstappr.getDetailByColumnID(tempStruct,columnID));	
		// レベル番号
		columnID = mstappr.getColumnID( "M_ITEM", "HIGH_LEVEL_NO");
		struct.setHIGH_LEVEL_NO(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 品目手配区分
		columnID = mstappr.getColumnID( "M_ITEM", "MRP_ODR_TYP");
		struct.setMRP_ODR_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 品目内外作区分
		columnID = mstappr.getColumnID( "M_ITEM", "OUTSIDE_TYP");
		struct.setOUTSIDE_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 荷姿管理フラグ
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT_FLG");
		struct.setSTOCK_UNIT_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 計量単位
		columnID = mstappr.getColumnID( "M_ITEM", "STOCK_UNIT");
		struct.setSTOCK_UNIT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 荷姿計量単位
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT");
		struct.setPKG_UNIT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 荷姿単位数
		columnID = mstappr.getColumnID( "M_ITEM", "PKG_UNIT_QTY");
		struct.setPKG_UNIT_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 在庫数単位区分
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_QTY_TYP");
		struct.setUNIT_QTY_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 品目手配リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_LT");
		struct.setODR_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 品目固定分リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_LT");
		struct.setFIXED_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 品目比例分リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LT");
		struct.setPROP_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 安全日数
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_LT");
		struct.setSAFETY_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 払出リードタイム
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_LT");
		struct.setISSUE_LT(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 品目比例分ロットサイズ
		columnID = mstappr.getColumnID( "M_ITEM", "PROP_LOT_SIZE");
		struct.setPROP_LOT_SIZE(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 品目仕損率
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_SPOIL");
		struct.setITEM_SPOIL(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 安全在庫量
		columnID = mstappr.getColumnID( "M_ITEM", "SAFETY_STOCK");
		struct.setSAFETY_STOCK(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// ロットまとめ区分
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_SIZING_TYP");
		struct.setLOT_SIZING_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 最大まとめ期間
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_PERIOD");
		struct.setMAX_PERIOD(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// 最大手配数
		columnID = mstappr.getColumnID( "M_ITEM", "MAX_ODR_QTY");
		struct.setMAX_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 発注点在庫数
		columnID = mstappr.getColumnID( "M_ITEM", "ODR_POINT");
		struct.setODR_POINT(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// 定量発注数
		columnID = mstappr.getColumnID( "M_ITEM", "FIXED_ODR_QTY");
		struct.setFIXED_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 最小手配数
		columnID = mstappr.getColumnID( "M_ITEM", "MIN_ODR_QTY");
		struct.setMIN_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// まるめ単位
		columnID = mstappr.getColumnID( "M_ITEM", "MUL_ODR_QTY");
		struct.setMUL_ODR_QTY(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 出庫区分
		columnID = mstappr.getColumnID( "M_ITEM", "ISSUE_TYP");
		struct.setISSUE_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// MPS品目フラグ
		columnID = mstappr.getColumnID( "M_ITEM", "MPS_FLG");
		struct.setMPS_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 受入検査区分
		columnID = mstappr.getColumnID( "M_ITEM", "ACPT_INSPC_TYP");
		struct.setACPT_INSPC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 製品区分
		columnID = mstappr.getColumnID( "M_ITEM", "PRODUCT_TYP");
		struct.setPRODUCT_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 管理コード
		columnID = mstappr.getColumnID( "M_ITEM", "CLASIFICATION_CD");
		struct.setCLASIFICATION_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 単位重量
		columnID = mstappr.getColumnID( "M_ITEM", "UNIT_WEIGHT");
		struct.setUNIT_WEIGHT(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// 棚卸区分
		columnID = mstappr.getColumnID( "M_ITEM", "ABC_TYP");
		struct.setABC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 作業実績区分
		columnID = mstappr.getColumnID( "M_ITEM", "OPR_RSLT_TYP");
		struct.setOPR_RSLT_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
	
		// 受給品区分
		columnID = mstappr.getColumnID( "M_ITEM", "SPL_ITEM_TYP");
		struct.setSPL_ITEM_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 消費税コード
		columnID = mstappr.getColumnID( "M_ITEM", "TAX_CD");
		struct.setTAX_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
	
		// カレンダ番号
		columnID = mstappr.getColumnID( "M_ITEM", "CAL_NO");
		struct.setCAL_NO(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 賞味期限年数
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_YEAR");
		struct.setBEST_BEFORE_YEAR(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 賞味期限月数
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_MONTH");
		struct.setBEST_BEFORE_MONTH(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 賞味期限日数
		columnID = mstappr.getColumnID( "M_ITEM", "BEST_BEFORE_DAY");
		struct.setBEST_BEFORE_DAY(mstappr.getDetailByColumnID(tempStruct,columnID));
		
		// ロット管理フラグ
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_CTRL_FLG");
		struct.setLOT_CTRL_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
		// ロット番号採番区分
		columnID = mstappr.getColumnID( "M_ITEM", "LOT_NUMBERING_TYP");
		struct.setLOT_NUMBERING_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０１コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_01_CD");
		struct.setITEM_CLASS_01_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０2コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_02_CD");
		struct.setITEM_CLASS_02_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０3コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_03_CD");
		struct.setITEM_CLASS_03_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０4コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_04_CD");
		struct.setITEM_CLASS_04_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０5コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_05_CD");
		struct.setITEM_CLASS_05_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０6コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_06_CD");
		struct.setITEM_CLASS_06_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０7コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_07_CD");
		struct.setITEM_CLASS_07_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０8コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_08_CD");
		struct.setITEM_CLASS_08_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類０9コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_09_CD");
		struct.setITEM_CLASS_09_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類10コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_10_CD");
		struct.setITEM_CLASS_10_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類11コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_11_CD");
		struct.setITEM_CLASS_11_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		//品目分類12コード
		columnID = mstappr.getColumnID( "M_ITEM", "ITEM_CLASS_12_CD");
		struct.setITEM_CLASS_12_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 保管区分
		columnID = mstappr.getColumnID( "M_ITEM", "DEPO_TYP");
		struct.setDEPO_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 備考１
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK1");
		struct.setREMARK1(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 備考２
		columnID = mstappr.getColumnID( "M_ITEM", "REMARK2");
		struct.setREMARK2(mstappr.getDetailByColumnID(tempStruct,columnID));
		// 工数管理品目区分
		columnID = mstappr.getColumnID( "M_ITEM", "MANHOUR_TYP");
		struct.setMANHOUR_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
		//消費税名
		if(struct.getTAX_CD() != null && !"".equals(struct.getTAX_CD())){
			List taxList = entity.mselectTAX_CD.read(conn,struct);
			if(taxList != null && taxList.size() > 0){
				struct.setTAX_NAME(((AA0010010Struct)taxList.get(0)).getTAX_NAME());
			}
		}
		//カレンダ名
    	if(struct.getCAL_NO() != null && !"".equals(struct.getCAL_NO())){
    		List calList  = entity.mselectCAL_NO.read(conn,struct);
    		if(calList != null && calList.size() > 0){
    			struct.setCAL_NAME(((AA0010010Struct)calList.get(0)).getCAL_NAME());
    		}
    	}
//20150730 ADD START BY SYSCOM
    	// 負担部門コード
		columnID = mstappr.getColumnID( "M_ITEM", "DEPT_CD");
		struct.setDEPT_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
    	
		// プロジェクトコード
		columnID = mstappr.getColumnID( "M_ITEM", "PJ_CD");
		struct.setPJ_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
		
    	// セグメント1
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS1");
		struct.setSEG_CONTENTS1(mstappr.getDetailByColumnID(tempStruct,columnID));
		
      	// セグメント2
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS2");
		struct.setSEG_CONTENTS2(mstappr.getDetailByColumnID(tempStruct,columnID));
		
    	// セグメント3
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS3");
		struct.setSEG_CONTENTS3(mstappr.getDetailByColumnID(tempStruct,columnID));
		
    	// セグメント4
		columnID = mstappr.getColumnID( "M_ITEM", "SEG_CONTENTS4");
		struct.setSEG_CONTENTS4(mstappr.getDetailByColumnID(tempStruct,columnID));
		
//20150730 ADD END BY SYSCOM
    }

	/**
	 * 登録ボタン押下時チェック
	 * @param なし
	 * @throws SQLException、FoundationException 
	 * @return boolean true:OK false:NG
	 */
	public boolean insertCheck() throws SQLException,FoundationException
	{
		boolean result = false; // チェック結果格納
		boolean numResult = false; // 小数チェック

		Integer unitQtyTyp = new Integer("1"); // 整数タイプ
		// 整数管理品目のため小数点以下は切り上げされる
		if (unitQtyTyp.equals(struct.getUNIT_QTY_TYP())) {
			// 荷姿単位数
			if (Calculate.isNumeric(struct.getPKG_UNIT_QTY())) {
				String pkgUnitQty = Calculate.ceil(struct.getPKG_UNIT_QTY(), 0);
				struct.setPKG_UNIT_QTY(pkgUnitQty);
				numResult = true;
			}
			// 安全在庫量
			if (Calculate.isNumeric(struct.getSAFETY_STOCK())) {
				String saftyStock = Calculate.ceil(struct.getSAFETY_STOCK(), 0);
				struct.setSAFETY_STOCK(saftyStock);
				numResult = true;
			}
			// 最大手配数
			if (Calculate.isNumeric(struct.getMAX_ODR_QTY())) {
				String maxOdrQty = Calculate.ceil(struct.getMAX_ODR_QTY(),
						0);
				struct.setMAX_ODR_QTY(maxOdrQty);
				numResult = true;
			}
			// 発注点在庫数
			if (Calculate.isNumeric(struct.getODR_POINT())) {
				String odrPoint = Calculate.ceil(struct.getODR_POINT(), 0);
				struct.setODR_POINT(odrPoint);
				numResult = true;
			}
			// 定量発注数
			if (Calculate.isNumeric(struct.getFIXED_ODR_QTY())) {
				String fixedOdrQty = Calculate.ceil(struct
						.getFIXED_ODR_QTY(), 0);
				struct.setFIXED_ODR_QTY(fixedOdrQty);
				numResult = true;
			}
			// 最小手配数
			if (Calculate.isNumeric(struct.getMIN_ODR_QTY())) {
				String minOdrQty = Calculate.ceil(struct.getMIN_ODR_QTY(),
						0);
				struct.setMIN_ODR_QTY(minOdrQty);
				numResult = true;
			}
			// まるめ単位
			if (Calculate.isNumeric(struct.getMUL_ODR_QTY())) {
				String mulOdrQty = Calculate.ceil(struct.getMUL_ODR_QTY(),
						0);
				struct.setMUL_ODR_QTY(mulOdrQty);
				numResult = true;
			}
			// ワーニングメッセージ作成
			if (numResult) {
				setWarnMessage("AA90010");
			}
		}
		// 品目情報 重複チェック
		result = entity.mcheckM_ITEM.check(conn, struct);
		if(result == true){
			// エラーメッセージ作成
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setErrorMessage("AA00051", keyMessage);
		}

		// 消費税コードチェック
		if(struct.getTAX_CD() != null && "".equals(struct.getTAX_CD()) != true){
			result = entity.mcheckM_TAX.check(conn, struct);
			if(result == false){
				// エラーメッセージ作成
				keyMessage = "M_ITEM.TAX_CD:" + struct.getTAX_CD();
				setErrorMessage("AA01001", keyMessage);
			}
		}

		// カレンダ番号チェック
		if(struct.getCAL_NO() != null && "".equals(struct.getCAL_NO()) != true){
			result = entity.mcheckM_CAL_H.check(conn, struct);
			if(result == false){
				// エラーメッセージ作成
				keyMessage = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
				setErrorMessage("AA01013", keyMessage);
			}
		}
//20150730 ADD START BY SYSCOM
		//負担部門コードチェック
		//負担部門コードがNULLではない場合
		if(struct.getDEPT_CD() != null && "".equals(struct.getDEPT_CD()) != true){
			List tempList = entity.mV_DEPT_CD.read(conn, struct);
			if (tempList.isEmpty()) {
				// エラーメッセージ作成
				keyMessage = "M_ITEM.DEPT_CD:" + struct.getDEPT_CD();
				setErrorMessage("AA23603", keyMessage);
			}
		}
//20150730 ADD END BY SYSCOM
		// ロット管理フラグチェック
		if((struct.getMRP_ODR_TYP().intValue() == 1 || struct.getMRP_ODR_TYP().intValue() == 2) && struct.getLOT_CTRL_FLG().intValue() == 1){
			//エラーメッセージ
			List msgs = new ArrayList();
			msgs.add("M_MRP_ODR_TYP:" + struct.getMRP_ODR_TYP().intValue());
			msgs.add("M_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG().intValue());
			setErrorMessage("AA20048", msgs);
		}
		
		// 分類マスタチェック
		checkClass(struct);

		// エラーが発生していない場合、true；発生するとき、false		
		return !msgStruct.hasError();
	}
	/**
	 * 更新ボタン押下時チェック
	 * @param なし
	 * @throws SQLException、FoundationException 、ExpjException
	 * @return boolean true:OK false:NG
	 */
	public boolean updateCheck() throws SQLException,FoundationException
	{
		boolean result = true;		// チェック結果格納
		boolean numResult = false; // 小数チェック
		
		Integer unitQtyTyp = new Integer("1"); // 整数タイプ

		// 整数管理品目のため小数点以下は切り上げされる
		if (unitQtyTyp.equals(struct.getUNIT_QTY_TYP())) {
			// 荷姿単位数
			if (Calculate.isNumeric(struct.getPKG_UNIT_QTY())) {
				String pkgUnitQty = Calculate.ceil(struct.getPKG_UNIT_QTY(), 0);
				struct.setPKG_UNIT_QTY(pkgUnitQty);
				numResult = true;
			}
			// 安全在庫量
			if (Calculate.isNumeric(struct.getSAFETY_STOCK())) {
				String saftyStock = Calculate.ceil(struct.getSAFETY_STOCK(), 0);
				struct.setSAFETY_STOCK(saftyStock);
				numResult = true;
			}
			// 最大手配数
			if (Calculate.isNumeric(struct.getMAX_ODR_QTY())) {
				String maxOdrQty = Calculate.ceil(struct.getMAX_ODR_QTY(),
						0);
				struct.setMAX_ODR_QTY(maxOdrQty);
				numResult = true;
			}
			// 発注点在庫数
			if (Calculate.isNumeric(struct.getODR_POINT())) {
				String odrPoint = Calculate.ceil(struct.getODR_POINT(), 0);
				struct.setODR_POINT(odrPoint);
				numResult = true;
			}
			// 定量発注数
			if (Calculate.isNumeric(struct.getFIXED_ODR_QTY())) {
				String fixedOdrQty = Calculate.ceil(struct
						.getFIXED_ODR_QTY(), 0);
				struct.setFIXED_ODR_QTY(fixedOdrQty);
				numResult = true;
			}
			// 最小手配数
			if (Calculate.isNumeric(struct.getMIN_ODR_QTY())) {
				String minOdrQty = Calculate.ceil(struct.getMIN_ODR_QTY(),
						0);
				struct.setMIN_ODR_QTY(minOdrQty);
				numResult = true;
			}
			// まるめ単位
			if (Calculate.isNumeric(struct.getMUL_ODR_QTY())) {
				String mulOdrQty = Calculate.ceil(struct.getMUL_ODR_QTY(),
						0);
				struct.setMUL_ODR_QTY(mulOdrQty);
				numResult = true;
			}
			// ワーニングメッセージ作成
			if (numResult) {
				setWarnMessage("AA90010");
			}
		}
		// 存在/更新確認
		List list = entity.mselectMODIFY_COUNT.read(conn, struct);
		if(list.size() <= 0){
			// エラーメッセージ作成
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setErrorMessage("ZZ06001", keyMessage);
		}
		else{
			String modify = ((AA0010010Struct)list.get(0)).getMODIFY_COUNT();
			if (struct.getMODIFY_COUNT().equals(modify) == false)
			{
				// エラーメッセージ作成
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("ZZ01105", keyMessage);
			}
		}
		// 再度品目情報を取得する
		List mitemList = entity.mselect.read(conn, struct);
		AA0010010Struct itemStruct = (AA0010010Struct)mitemList.get(0);
		
		// インストールオプションの存在確認
		result = entity.mcheckSYS_INSTALL_OPTIONS.check(conn, struct);
		if(result == false){
			// 擬似品が変更された場合、製品マスタの存在チェック
			if ( (struct.getMRP_ODR_TYP().intValue() == 8) && (entity.mcheckM_ITEM_SPEC.check(conn, struct)) ) {
			    // エラーメッセージ設定
			    keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			    setErrorMessage("AA01529", keyMessage);
			}
		
	    } else {
			// 擬似品が変更された場合、得意先品目マスタの存在チェック
			if ( (struct.getMRP_ODR_TYP().intValue() == 8) && (entity.mcheckM_CUST_ITEM.check(conn, struct)) ) {
			    // エラーメッセージ設定
			    keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			    setErrorMessage("AA01528", keyMessage);
			}
	    }
		
//2008/07/14 SYSCOM 小林 ADD START
		// 工数管理品目区分が変更された場合のチェック
		// 子品目が存在する品目を工数管理品目に変更しようとした場合
		if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP()) 
			&& struct.getMANHOUR_TYP().intValue() == 1 ){
			result = entity.mcheckM_PS.check(conn, struct);
			if (result) {
				// エラーメッセージ作成
				keyMessage = "M_PS.PARENT_ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00180", keyMessage);
			}
		}
		
		// 所要量が存在する場合に工数管理品目区分が変更された場合はエラーとする
		result = entity.mcheckT_OD_ITEM_CD.check(conn, struct);
		if (result) {
			// 工数管理品目区分チェック
			if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00181", keyMessage);
			}
		}
//2008/07/14 SYSCOM 小林 ADD END
		// 保管区別品目在庫が存在し、かつ手持在庫数量<>0の場合にロット管理フラグ、計量単位、
		// 工数管理品目区分が変更された場合はエラーとする
		List itemStockList = entity.mcheck_T_ITEM_STOCK.read(conn, struct);
		
		if(itemStockList.size() != 0){
			// 計量単位チェック
			if(!itemStruct.getSTOCK_UNIT().equals(struct.getSTOCK_UNIT())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA22055", keyMessage);
			}
			//　ロット管理フラグチェック
			if(!itemStruct.getLOT_CTRL_FLG().equals(struct.getLOT_CTRL_FLG())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA22056", keyMessage);
			}
//2008/07/14 SYSCOM 小林 ADD START
			// 工数管理品目区分チェック
			if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00181", keyMessage);
			}
//2008/07/14 SYSCOM 小林 ADD END
		}
		
//2008/07/14 SYSCOM 小林 ADD START
		// 保管区別製番在庫が存在し、かつ手持在庫数量<>0の場合に工数管理品目区分が変更された場合はエラーとする
		result = entity.mcheckT_JOB_ODR_CD_STOCK_QTY.check(conn, struct);
		if (result) {
			// 工数管理品目区分チェック
			if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP())){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00181", keyMessage);
			}
		}

		// 作業系列が存在し、かつ作業系列内外作区分 = 2:外作で工数管理品目区分が1:工数管理品目に変更された場合はエラーとする
		result = entity.mcheckM_PROC_GRP.check(conn, struct);
		if (result) {
			// 工数管理品目区分チェック
		if(!itemStruct.getMANHOUR_TYP().equals(struct.getMANHOUR_TYP()) &&
				struct.getMANHOUR_TYP().intValue() == 1){
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00189", keyMessage);
			}
		}
//2008/07/14 SYSCOM 小林 ADD END
		
		// 消費税コードチェック
		if(struct.getTAX_CD() != null && "".equals(struct.getTAX_CD()) != true){
			result = entity.mcheckM_TAX.check(conn, struct);
			if(result == false){
				// エラーメッセージ作成
				keyMessage = "M_ITEM.TAX_CD:" + struct.getTAX_CD();
				setErrorMessage("AA01001", keyMessage);
			}
		}

		// カレンダ番号チェック
		if(struct.getCAL_NO() != null && "".equals(struct.getCAL_NO()) != true){
			result = entity.mcheckM_CAL_H.check(conn, struct);
			if(result == false){
				// エラーメッセージ作成
				keyMessage = "M_CAL_H.CAL_NO:" + struct.getCAL_NO();
				setErrorMessage("AA01013", keyMessage);
			}
		}

//20150730 ADD START BY SYSCOM
		//負担部門コードチェック
		//負担部門コードがNULLではない場合
		if(struct.getDEPT_CD() != null && "".equals(struct.getDEPT_CD()) != true){
			List tempList = entity.mV_DEPT_CD.read(conn, struct);
			if (tempList.isEmpty()) {
				// エラーメッセージ作成
				keyMessage = "M_ITEM.DEPT_CD:" + struct.getDEPT_CD();
				setErrorMessage("AA23603", keyMessage);
			}
		}
//20150730 ADD END BY SYSCOM
		
		// old品目手配区分を設定
		list = entity.mselect.read(conn, struct);	
		if (list.size() != 0) {
			AA0010010Struct tempStruct = (AA0010010Struct)list.get(0);

			// 品目手配区分取得
			_OLD_MRP_ODR_TYP = new Integer(tempStruct.getMRP_ODR_TYP().intValue());
		}

		// 品目手配区分チェック
		if(_OLD_MRP_ODR_TYP.intValue() != struct.getMRP_ODR_TYP().intValue()){
			int status = 0;	// 更新できるかどうかの状態
			result = entity.mcheckT_OD_ITEM_CD.check(conn, struct);
			if(result == true){
				status = 1;
			}else{
				result = entity.mcheckT_JOB_ODR_CD_STOCK.check(conn, struct);
				if(result == true){
					status = 1;
				}else{
					result = entity.mcheckT_ITEM_STOCK.check(conn, struct);
					if(result == true){
						status = 1;
					}
				}
			}
			// 手配情報 ([所要量])、または在庫情報 ([保管区別製番在庫]、[保管区別品目在庫])がある場合
			if(status == 1){
				// 品目手配区分は4：マニュアル手配品目、5：ロット手配品目、6：定量手配品目、7：発注点手配品目から
				// 1：製番、2：在庫引当型製番、8：擬似品目に変更する場合
				if(_OLD_MRP_ODR_TYP.intValue() == 4 || _OLD_MRP_ODR_TYP.intValue() == 5 ||
						_OLD_MRP_ODR_TYP.intValue() == 6 || _OLD_MRP_ODR_TYP.intValue() == 7){
					if(struct.getMRP_ODR_TYP().intValue() == 1 || struct.getMRP_ODR_TYP().intValue() == 2 ||
							struct.getMRP_ODR_TYP().intValue() == 8){
						status = 12;
					}
				}
				// 品目手配区分は1：製番、2：在庫引当型製番から他の品目手配区分(1,2を除いて)に変更する場合
				if(_OLD_MRP_ODR_TYP.intValue() == 1 || _OLD_MRP_ODR_TYP.intValue() == 2){
					if(struct.getMRP_ODR_TYP().intValue() != 1 && struct.getMRP_ODR_TYP().intValue() != 2){
						status = 11;
					}
				}
				//8：擬似品目から他の品目手配区分に変更する場合
				if(_OLD_MRP_ODR_TYP.intValue() == 8){
					status = 11;
				}
			}
			if(status == 11){
				// エラーメッセージ作成
				List msgs = new ArrayList();
				msgs.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
				msgs.add("M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP());
				setErrorMessage("AA00011", msgs);
			}else if (status == 12){
				// エラーメッセージ作成
				List msgs = new ArrayList();
				msgs.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
				msgs.add("M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP());
				try {
					setErrorMessage("AA00211", getMRP_ODR_TYP_DISPLAY_NAME(_OLD_MRP_ODR_TYP.toString()),
							getMRP_ODR_TYP_DISPLAY_NAME(struct.getMRP_ODR_TYP().toString()), msgs);
				} catch (ExpjException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					return false;
				}
			}
		}
		// 品目手配区分と製番計画の関連チェック
		if(_OLD_MRP_ODR_TYP.intValue() == 1 || _OLD_MRP_ODR_TYP.intValue() == 2){
			if(struct.getMRP_ODR_TYP().intValue() != 1 && struct.getMRP_ODR_TYP().intValue() != 2){
					result = entity.mcheckT_JOB_ODR.check(conn, struct);
					if(result == true){
						// エラーメッセージ作成
						List msgs = new ArrayList();
						msgs.add("M_ITEM.ITEM_CD:" + struct.getITEM_CD());
						msgs.add("M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP());
						setErrorMessage("AA00011", msgs);
					}
			}
		}

		// 品目手配別構成チェック
		result = true;
		ProductStructureRepository rep = new ProductStructureRepository(conn);
		// 子品目を確認
		if(checkLowerType(rep, struct) == false){
			result = false;
		}
		// 親品目を確認
		if(checkUpperType(rep, struct) == false){
			result = false;
		}
		// エラー判定
		if (result == false) {
			// エラーメッセージ作成
			keyMessage = "M_ITEM.MRP_ODR_TYP:" + struct.getMRP_ODR_TYP();
			setErrorMessage("AA00010", keyMessage);
		}
		// ロット管理フラグチェック
		if((struct.getMRP_ODR_TYP().intValue() == 1 || struct.getMRP_ODR_TYP().intValue() == 2) && struct.getLOT_CTRL_FLG().intValue() == 1){
			//エラーメッセージ
			List msgs = new ArrayList();
			msgs.add("M_MRP_ODR_TYP:" + struct.getMRP_ODR_TYP().intValue());
			msgs.add("M_LOT_CTRL_FLG:" + struct.getLOT_CTRL_FLG().intValue());
			setErrorMessage("AA20048", msgs);
		}
		// 分類マスタチェック
		checkClass(struct);

		// エラーが発生していない場合、true；発生するとき、false		
		return !msgStruct.hasError();
	}


	//------------------------------------------------------------------------
	/**
	 * 削除更新ボタン押下時チェック
	 * @param なし
	 * @throws SQLException、FoundationException 
	 * @return boolean true:OK false:NG
	 */
	//------------------------------------------------------------------------
	
	public boolean deleteCheck()throws FoundationException, SQLException{

		// 品目情報の存在確認
		boolean result = entity.mcheckM_ITEM.check(conn, struct);
		if(result == false){
			// エラーメッセージ作成
			keyMessage = "M_WH.ITEM_CD:" + struct.getITEM_CD();
			setErrorMessage("ZZ06001", keyMessage);
		}else{

			//更新カウントのチェック
			List list = entity.mselectMODIFY_COUNT.read(conn, struct);

			String modify = ((AA0010010Struct)list.get(0)).getMODIFY_COUNT();
			if (struct.getMODIFY_COUNT().equals(modify) == false)
			{
				// エラーメッセージ作成
				keyMessage = "M_WH.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("ZZ01105", keyMessage);
			}
			
			// インストールオプションの存在確認
			result = entity.mcheckSYS_INSTALL_OPTIONS.check(conn, struct);
			if(result == false){
				
			    // 製品マスタの存在チェック
			    if (entity.mcheckM_ITEM_SPEC.check(conn, struct)) {
				    // エラーメッセージ設定
				    keyMessage = "M_ITEM_SPEC.ITEM_CD:" + struct.getITEM_CD();
				    setErrorMessage("AA00173", keyMessage);
			    }
    
			    // 製品単価マスタの存在チェック
			    if (entity.mcheckM_UNIT_COST.check(conn, struct)) {
				    // エラーメッセージ設定
				    keyMessage = "M_UNIT_COST.ITEM_CD:" + struct.getITEM_CD();
				    setErrorMessage("AA00174", keyMessage);
			    }
		    } else {
		    	// 販売単価マスタの存在チェック
				if (entity.mcheckM_SALES_UNIT_COST.check(conn, struct)) {
					// エラーメッセージ設定
					keyMessage = "M_SALES_UNIT_COST.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA34036", keyMessage);
				}
				
				// 得意先品目マスタの存在チェック
				if (entity.mcheckM_CUST_ITEM.check(conn, struct)) {
					// エラーメッセージ設定
					keyMessage = "M_CUST_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("AA34101", keyMessage);
				}
		    }

			// 参照整合性検証：所要量
			List list1 = entity.mselectT_OD.read(conn, struct);
			if (list1.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "T_OD.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00012", keyMessage);
			}

			// 参照整合性検証：製番計画
			List list2 = entity.mselectT_JOB_ODR.read(conn, struct);
			if (list2.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "T_JOB_ODR.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00013", keyMessage);
			}

			// 参照整合性検証：製品構成
			List list3 = entity.mselectM_PS.read(conn, struct);
			if (list3.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "M_PS.PARENT_ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00014", keyMessage);
			}

			// 参照整合性検証：保管区別品目在庫
			List list4 = entity.mselectT_ITEM_STOCK.read(conn, struct);
			if (list4.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "T_ITEM_STOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00015", keyMessage);
			}

			// 参照整合性検証：保管区製別番在庫
			List list5 = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
			if (list5.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "T_JOB_ODR_CD_STOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00016", keyMessage);
			}

			// 参照整合性検証：作業実績
			List list6 = entity.mselectT_OPR_RSLT.read(conn, struct);
			if (list6.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "T_OPR_RSLT.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00017", keyMessage);
			}

			// 参照整合性検証：発注残
			List list7 = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
			if (list7.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "T_RLSD_PUCH_ODR.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00018", keyMessage);
			}

			// 参照整合性検証：作業系列別仕掛
			List list8 = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
			if (list8.size() != 0) {
				// エラーメッセージ作成
				keyMessage = "T_WORK_IN_PROC_BY_PROC.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00019", keyMessage);
			}

            // 参照整合性検証：有償支給履歴
            List list9 = entity.mselectT_PAST_ONEROUS_CONS.read(conn, struct);
            if (list9.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_PAST_ONEROUS_CONS.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00999", keyMessage);
			}
            
            // 参照整合性検証：購入返品実績
            List list10 = entity.mselectT_PUCH_ODR_RTN_RSLT.read(conn, struct);
            if (list10.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_PUCH_ODR_RTN_RSLT.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA01000", keyMessage);
			}
            // 参照整合性検証：品目別入庫先保管区
            List list11 = entity.mselectM_ITEM_RCV_WH.read(conn, struct);
            if (list11.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "M_ITEM_RCV_WH.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00998", keyMessage);
            }
			
			// 参照整合性検証：ＭＰＳロック
            List list12 = entity.mselectSYS_MPS_LOCK.read(conn, struct);
            if (list12.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "SYS_MPS_LOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00162", keyMessage);
            }
			
			// 参照整合性検証：出庫指示
            List list13 = entity.mselectT_ISSUE_INST.read(conn, struct);
            if (list13.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_ISSUE_INST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00163", keyMessage);
            }
			
			// 参照整合性検証：出来高実績
            List list14 = entity.mselectT_OUTPUT_RSLT.read(conn, struct);
            if (list14.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_OUTPUT_RSLT.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00078", keyMessage);
            }
			
			// 参照整合性検証：品目別仕掛
            List list15 = entity.mselectT_WORK_IN_PROC_BY_ITEM.read(conn, struct);
            if (list15.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_WORK_IN_PROC_BY_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00164", keyMessage);
            }
			
			// 参照整合性検証：製番引当
            List list16 = entity.mselectT_JOB_ODR_ALC.read(conn, struct);
            if (list16.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_JOB_ODR_ALC.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00165", keyMessage);
            }
			
			// 参照整合性検証：積送在庫
            List list17 = entity.mselectT_TRANSPORT_STOCK.read(conn, struct);
            if (list17.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_TRANSPORT_STOCK.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00166", keyMessage);
            }
			
			// 参照整合性検証：購入品マスタ
            List list18 = entity.mselectM_CS_PUCH.read(conn, struct);
            if (list18.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "M_CS_PUCH.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00167", keyMessage);
            }
			
			// 参照整合性検証：品目別加工費
            List list19 = entity.mselectT_ITEM_PROC_COST.read(conn, struct);
            if (list19.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_ITEM_PROC_COST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00168", keyMessage);
            }
			
			// 参照整合性検証：品目別加工費マスタ
            List list20 = entity.mselectM_ITEM_PROC_COST.read(conn, struct);
            if (list20.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "M_ITEM_PROC_COST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00169", keyMessage);
            }
			
			// 参照整合性検証：品目別原価
            List list21 = entity.mselectT_ITEM_COST.read(conn, struct);
            if (list21.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_ITEM_COST.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00170", keyMessage);
            }
			
			// 参照整合性検証：保管区別品目棚卸
            List list22 = entity.mselectT_ITEM_INV.read(conn, struct);
            if (list22.size() != 0 ) {
				// エラーメッセージ設定
				keyMessage = "T_ITEM_INV.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("AA00171", keyMessage);
            }
		}

		// エラーが発生していない場合、true；発生するとき、false		
		return !msgStruct.hasError();
	}
//---------- メッセージ関連の処理-- --------------------------------------------

	String keyMessage = "";
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
	 * 情報メッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setInfoMessage(String messageno)
	{
		ExpjMessage emsg = new ExpjMessage( messageno );
		msgStruct.addInfo( emsg );
		sysLog.info(emsg, getsysUSER_CD());
	}

	/**
	 * Exceptionメッセージ設定
	 * @param キー項目
	 */
	private void setSqlExceptionMsg(SQLException e, String key) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		//emsg = new ExpjMessage( "ZZ01006", key );
		//sysLog.severe(emsg ,getsysUSER_CD()); //エラー詳細
		//ee.add(emsg);

		//emsg = new ExpjMessage( "ZZ01006", e.toString());
		//sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
		throw ee;
	}

	/**
	 * エラーメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setErrorMessage(String code, String key)
	{
		ExpjMessage emsg = new ExpjMessage(code);
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		emsg = new ExpjMessage( "ZZ01006", key );
		msgStruct.addError( emsg );	// エラーメッセージとして登録
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
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// エラーメッセージとして登録
			sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
		}
	}

	/**
	 * エラーメッセージの設定
	 * @param メッセージ番号
	 * @param 引数1
	 * @param 引数2
	 * @param 出力メッセージ（List）
	 */
	private void setErrorMessage(String code, String value1, String value2, List key)
	{
		ExpjMessage emsg = new ExpjMessage(code, value1, value2);
		msgStruct.addError( emsg );	// エラーメッセージとして登録
		sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addError( emsg );	// エラーメッセージとして登録
			sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
		}
	}
    
    /**
     * 警告メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setWarnMessage(String messageno)
    {
     ExpjMessage emsg = new ExpjMessage( messageno );
     msgStruct.addWarn( emsg );
     sysLog.warning(emsg, getsysUSER_CD());
    }
    
    /**
     * 警告メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setWarnMessage(String messageno,List key)
    {
        ExpjMessage emsg = new ExpjMessage( messageno );
        msgStruct.addWarn( emsg );
        sysLog.warning(emsg, getsysUSER_CD());
		for(int i=0; i<key.size(); i++)
		{
			emsg = new ExpjMessage( "ZZ01006", (String)key.get(i) );
			msgStruct.addWarn( emsg );	// エラーメッセージとして登録
			sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
		}
    }
//---------- 追加・更新時の入力値チェック--------------------------------------

	/** 
	 * 入力値チェック。
	 * NOT NULL項目に値が入っていない場合、デフォルト値を設定する
	 * 定量発注数、最小手配数量の過大値チェック
	 * @param checkStruct チェック対象のStruct
	 */
	private void checkStruct(AA0010010Struct checkStruct)
	{
		// レベル番号
		if(checkStruct.getHIGH_LEVEL_NO() == null
		|| "".equals(checkStruct.getHIGH_LEVEL_NO()))
			checkStruct.setHIGH_LEVEL_NO(AA0010Common._HIGH_LEVEL_NO);

		// 荷姿単位数
		if(checkStruct.getPKG_UNIT_QTY() == null
		|| "".equals(checkStruct.getPKG_UNIT_QTY()))
			checkStruct.setPKG_UNIT_QTY(AA0010Common._PKG_UNIT_QTY_DB);

		// 品目手配リードタイム
		if(checkStruct.getODR_LT() == null
		|| "".equals(checkStruct.getODR_LT()))
			checkStruct.setODR_LT(AA0010Common._ODR_LT);

		// 品目固定分リードタイム
		if(checkStruct.getFIXED_LT() == null
		|| "".equals(checkStruct.getFIXED_LT()))
			checkStruct.setFIXED_LT(AA0010Common._FIXED_LT);

		// 品目比例分リードタイム
		if(checkStruct.getPROP_LT() == null
		|| "".equals(checkStruct.getPROP_LT()))
			checkStruct.setPROP_LT(AA0010Common._PROP_LT);

		// 安全日数
		if(checkStruct.getSAFETY_LT() == null
		|| "".equals(checkStruct.getSAFETY_LT()))
			checkStruct.setSAFETY_LT(AA0010Common._SAFETY_LT);

		// 払出リードタイム
		if(checkStruct.getISSUE_LT() == null
		|| "".equals(checkStruct.getISSUE_LT()))
			checkStruct.setISSUE_LT(AA0010Common._ISSUE_LT);

		// 品目比例分ロットサイズ
		if(checkStruct.getPROP_LOT_SIZE() == null
		|| "".equals(checkStruct.getPROP_LOT_SIZE()))
			checkStruct.setPROP_LOT_SIZE(AA0010Common._PROP_LOT_SIZE);

		// 品目仕損率
		if(checkStruct.getITEM_SPOIL() == null
		|| "".equals(checkStruct.getITEM_SPOIL()))
			checkStruct.setITEM_SPOIL(AA0010Common._ITEM_SPOIL);

		// 安全在庫量
		if(checkStruct.getSAFETY_STOCK() == null
		|| "".equals(checkStruct.getSAFETY_STOCK()))
			checkStruct.setSAFETY_STOCK(AA0010Common._SAFETY_STOCK);

		// 最大まとめ期間
		if(checkStruct.getMAX_PERIOD() == null
		|| "".equals(checkStruct.getMAX_PERIOD()))
			checkStruct.setMAX_PERIOD(AA0010Common._MAX_PERIOD_DB);

		// 最大手配数
		if(checkStruct.getMAX_ODR_QTY() == null
		|| "".equals(checkStruct.getMAX_ODR_QTY()))
			checkStruct.setMAX_ODR_QTY(AA0010Common._MAX_ODR_QTY_DB);

		// 発注点在庫数
		if(checkStruct.getODR_POINT() == null
		|| "".equals(checkStruct.getODR_POINT()))
			checkStruct.setODR_POINT(AA0010Common._ODR_POINT);

		// 定量発注数
		if(checkStruct.getFIXED_ODR_QTY() == null
		|| "".equals(checkStruct.getFIXED_ODR_QTY()))
			checkStruct.setFIXED_ODR_QTY(AA0010Common._FIXED_ODR_QTY_DB);

		// 最小手配数
		if(checkStruct.getMIN_ODR_QTY() == null
		|| "".equals(checkStruct.getMIN_ODR_QTY()))
			checkStruct.setMIN_ODR_QTY(AA0010Common._MIN_ODR_QTY);

		// まるめ単位
		if(checkStruct.getMUL_ODR_QTY() == null
		|| "".equals(checkStruct.getMUL_ODR_QTY()))
			checkStruct.setMUL_ODR_QTY(AA0010Common._MUL_ODR_QTY_DB);

		// 単位重量
		if(checkStruct.getUNIT_WEIGHT() == null
		|| "".equals(checkStruct.getUNIT_WEIGHT()))
			checkStruct.setUNIT_WEIGHT(AA0010Common._UNIT_WEIGHT);

		// 定量発注数、最小手配数量の過大値チェック
		if((checkStruct.getMRP_ODR_TYP().intValue() == 6 || checkStruct.getMRP_ODR_TYP().intValue() == 7) && 
				Calculate.compare(checkStruct.getFIXED_ODR_QTY(),"1000000000") >= 0){
			//ワーニングメッセージ
			setWarnMessage("AA00213");
		}
		if((checkStruct.getMRP_ODR_TYP().intValue() == 2 || checkStruct.getMRP_ODR_TYP().intValue() == 5) && 
				Calculate.compare(checkStruct.getMIN_ODR_QTY(),"1000000000") >= 0){
			//ワーニングメッセージ
			setWarnMessage("AA00214");
		}
		return;
	}

//------------------------------------------------------------------------------

	/* 品目手配区分。 
	 * 更新時に品目手配区分の変更有無をチェックする為。
	*/
	private Integer _OLD_MRP_ODR_TYP = null;

//------------------------------------------------------------------------------

	/** システムログ */
	// sysLog = null;

	//------------------------------------------------------------------------
	// 工場コード/ユーザコード
	public void setPlantCd(String cd){ sysPLANT_CD = cd; };
	public String getPlantCd(){ return sysPLANT_CD; };

	public void setUserCd(String cd){ sysUSER_CD = cd; };
	public String getUserCd() { return sysUSER_CD; };

//------------------------------------------------------------------------------
//	---------- 追加・更新時の分類マスタチェック--------------------------------------

	/** 
	 * 分類値チェック。
	 * NOT NULL項目に値が入っていない場合、値を存在チェックする
	 * @param Struct チェック対象のStruct
	 * @throws SQLException 
	 */
	private void checkClass(AA0010010Struct checkStruct) throws SQLException {
		try {
			// 品目分類01チェック
			if (checkStruct.getITEM_CLASS_01_CD() != null && !"".equals(checkStruct.getITEM_CLASS_01_CD())) {
				boolean checkResult01 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD01,checkStruct.getITEM_CLASS_01_CD());
				if (!checkResult01) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD01);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_01_NAME("");
				} 
			}
			// 品目分類02チェック
			if (struct.getITEM_CLASS_02_CD() != null && !"".equals(checkStruct.getITEM_CLASS_02_CD())) {
				boolean checkResult02 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD02, checkStruct.getITEM_CLASS_02_CD());
				if (!checkResult02) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD02);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_02_NAME("");
				}
			}
			
			// 品目分類03チェック
			if (checkStruct.getITEM_CLASS_03_CD() != null && !"".equals(checkStruct.getITEM_CLASS_03_CD())) {
				boolean checkResult03 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD03, checkStruct.getITEM_CLASS_03_CD());
				if (!checkResult03) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD03);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_03_NAME("");
				}
			}
			// 品目分類04チェック
			if (checkStruct.getITEM_CLASS_04_CD() != null && !"".equals(checkStruct.getITEM_CLASS_04_CD())) {
				boolean checkResult04 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD04, checkStruct.getITEM_CLASS_04_CD());
				if (!checkResult04) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD04);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_04_NAME("");
				}
			}
			// 品目分類05チェック
			if (checkStruct.getITEM_CLASS_05_CD() != null && !"".equals(checkStruct.getITEM_CLASS_05_CD())) {
				boolean checkResult05 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD05, checkStruct.getITEM_CLASS_05_CD());
				if (!checkResult05) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD05);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_05_NAME("");
				}
			}
			// 品目分類06チェック
			if (checkStruct.getITEM_CLASS_06_CD() != null && !"".equals(checkStruct.getITEM_CLASS_06_CD())) {
				boolean checkResult06 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD06, checkStruct.getITEM_CLASS_06_CD());
				if (!checkResult06) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD06);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_06_NAME("");
				}
			}	
			// 品目分類07チェック
			if (checkStruct.getITEM_CLASS_07_CD() != null && !"".equals(checkStruct.getITEM_CLASS_07_CD())) {
				boolean checkResult07 = ClassMaster.checkMclass(conn, AA0010Common.CLASS_CD,AA0010Common.CLASS_CD07, checkStruct.getITEM_CLASS_07_CD());
				if (!checkResult07) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD07);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_07_NAME("");
				}
			}	
			// 品目分類08チェック
			if (checkStruct.getITEM_CLASS_08_CD() != null && !"".equals(checkStruct.getITEM_CLASS_08_CD())) {
				boolean checkResult08 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD08, checkStruct.getITEM_CLASS_08_CD());
				if (!checkResult08) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD08);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_08_NAME("");
				}
			}	
			// 品目分類09チェック
			if (checkStruct.getITEM_CLASS_09_CD() != null && !"".equals(checkStruct.getITEM_CLASS_09_CD())) {
				boolean checkResult09 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD09, checkStruct.getITEM_CLASS_09_CD());
				if (!checkResult09) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD09);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_09_NAME("");
				}
			}	
			// 品目分類10チェック
			if (checkStruct.getITEM_CLASS_10_CD() != null && !"".equals(checkStruct.getITEM_CLASS_10_CD())) {
				boolean checkResult10 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD10, checkStruct.getITEM_CLASS_10_CD());
				if (!checkResult10) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD10);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_10_NAME("");
				}
			}	
			// 品目分類11チェック
			if (checkStruct.getITEM_CLASS_11_CD() != null && !"".equals(checkStruct.getITEM_CLASS_11_CD())) {
				boolean checkResult11 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD11, checkStruct.getITEM_CLASS_11_CD());
				if (!checkResult11) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD11);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_11_NAME("");
				}
			}	
			// 品目分類12チェック
			if (checkStruct.getITEM_CLASS_12_CD() != null && !"".equals(checkStruct.getITEM_CLASS_12_CD())) {
				boolean checkResult12 = ClassMaster.checkMclass(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD12,checkStruct.getITEM_CLASS_12_CD());
				if (!checkResult12) {
					// エラーメッセジ
					ExpjMessage emsg = new ExpjMessage("AA20027",AA0010Common.CLASS_CD12);
					msgStruct.addError(emsg); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
					checkStruct.setITEM_CLASS_12_NAME("");
				}
			}		
			return;
		} catch (SQLException e) {
			throw e;
		}
	}
		
//20150730 ADD START BY SYSCOM
	/**
	* Viewの値をコンボボックスに表示
	*
	*/
	public ComboStruct createComboData(String createType) throws SQLException, ComboException,Exception {
		
		ComboStruct rCombo = new ComboStruct();	// コンボボックスデータ
		PreparedStatement stmt = null;			// ステートメント
		try{
			List rsetList = null;
			// SQL実行
			switch(Integer.parseInt(createType)){
			case 1:
				rsetList = entity.mV_PJ_CD.read(conn,struct);
				break;
			case 2:
				rsetList = entity.mV_SEG_CONTENTS_1.read(conn,struct);
				break;
			case 3:
				rsetList = entity.mV_SEG_CONTENTS_2.read(conn,struct);
				break;
			case 4:
				rsetList = entity.mV_SEG_CONTENTS_3.read(conn,struct);
				break;
			case 5:
				rsetList = entity.mV_SEG_CONTENTS_4.read(conn,struct);
				break;
			}
			AA0010010Struct tempStruct;
			for(int i=0; i<rsetList.size(); i++) {
				tempStruct = (AA0010010Struct)rsetList.get(i);
				String val = tempStruct.getVALUE();
				String explan = tempStruct.getDISPLAY_NAME();
				rCombo.addData(val, explan);
			}
			// 取得データが0以下の場合、例外発生
			if (rCombo.size() <= 0){
				throw new ComboException();
			}
		}catch (Exception e) {
			e.printStackTrace();
			throw new Exception(e);
		}
		return rCombo;
	}
//20150730 ADD END BY SYSCOM

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
		//---------------------------------------------------------------------
		String className = "";
		try{
			// 読込成功時のキー情報をクリア
			struct.seth_ITEM_CD("");

			MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"AA0010010","AA0010010Servlet");
			
			// 承認画面の「承認後」ボタンから遷移する時
			if("1".equals(struct.geth_APR_ITEM()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){		
				list = mstappr.selectMST_APPR_DETAIL(_APPR_ID);
			}else{
				// 正常の読込と承認画面の「承認前」ボタンから遷移する時
				list = entity.mselect.read(conn, struct);				
			}

			if (list.size() != 0) {
				// 承認画面の「承認後」ボタンから遷移する時
				if("1".equals(struct.geth_APR_ITEM()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){
					MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
					list.clear();
					setMoveItem(mstappr,tempStruct);
				}else{
					struct.copy((AA0010010Struct)list.get(0));

					// 品目手配区分取得
					_OLD_MRP_ODR_TYP = new Integer(struct.getMRP_ODR_TYP().intValue());

					// 読込成功時のキー情報を退避(読込SQLでselectされたITEM_CDと同等のものなので利用してます)
					struct.seth_ITEM_CD(struct.getITEM_CD());

					// 検索状態を「読込成功」に設定
					setReadStatus(NORMAL);
				}
				// 品目承認
				struct.seth_APR_ITEM(_APPR_ITEM);
			} else {
				//データが存在しない
				keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
				setErrorMessage("ZZ01101", keyMessage);

				// データが存在しない場合のクリア処理
				String w_itemCd = struct.getITEM_CD();	// キー情報の退避
				struct.init();							// 表示項目をデフォルトに戻す
				struct.setITEM_CD(w_itemCd);			// キー情報の設定

				// 検索状態を「初期状態」に設定
				setReadStatus(INITIAL);
				// 品目承認
				struct.seth_APR_ITEM(_APPR_ITEM);
				return;
			}
			//品目分類01～12小分類名称
			struct.setITEM_CLASS_01_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD01,struct.getITEM_CLASS_01_CD()));
			struct.setITEM_CLASS_02_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD02,struct.getITEM_CLASS_02_CD()));
			struct.setITEM_CLASS_03_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD03,struct.getITEM_CLASS_03_CD()));
			struct.setITEM_CLASS_04_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD04,struct.getITEM_CLASS_04_CD()));
			struct.setITEM_CLASS_05_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD05,struct.getITEM_CLASS_05_CD()));
			struct.setITEM_CLASS_06_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD06,struct.getITEM_CLASS_06_CD()));
			struct.setITEM_CLASS_07_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD07,struct.getITEM_CLASS_07_CD()));
			struct.setITEM_CLASS_08_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD08,struct.getITEM_CLASS_08_CD()));
			struct.setITEM_CLASS_09_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD09,struct.getITEM_CLASS_09_CD()));
			struct.setITEM_CLASS_10_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD10,struct.getITEM_CLASS_10_CD()));
			struct.setITEM_CLASS_11_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD11,struct.getITEM_CLASS_11_CD()));
			struct.setITEM_CLASS_12_NAME(ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD12,struct.getITEM_CLASS_12_CD()));
			
		}catch(SQLException e){
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			// エラーメッセージ作成
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}catch(Exception e){
			// 検索状態を「読込失敗」に設定
			setReadStatus(ERROR);

			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
		//---------------------------------------------------------------------

		try {
			if(!insertCheck()){
				return;
			}

			// 入力値チェック
			checkStruct(struct);

			struct.setHIGH_LEVEL_NO("1");
			
			if("1".equals(struct.geth_APR_ITEM())){	//品目承認のとき
				// 品目承認の登録
				boolean rtn = insertAppr("1");
				if(!rtn) return;		
			}else{				//品目承認しない	
				entity.minsertM_ITEM.create(conn, struct);

				// 検索
				controlselect();					
			}	
			//コメント
			conn.commit();	

		}catch(SQLException e){
			// エラーメッセージ作成
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlinsert>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
		//---------------------------------------------------------------------

		try {
			conn.beginTransWeb();		// トランザクション開始
			
			if(!updateCheck()){
				return;
			}

			// 入力値チェック
			checkStruct(struct);

			// リードタイムの妥当性確認
			if(isValidLT(struct) == false){
				// falseの場合は、isValidLT()内でメッセージ出力済み
			}
			
			if("1".equals(struct.geth_APR_ITEM())){	//品目承認
				// 承認情報の登録
				boolean rtn = insertAppr("2");
				if(!rtn) return;			
			}else{			//品目承認しない
				entity.mupdateM_ITEM.update(conn, struct);
				// 検索
				controlselect();			
			}		
			//コメント
			conn.commit();	

		}catch(SQLException e){
			// エラーメッセージ作成
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		//---------------------------------------------------------------------

		try {
			conn.beginTransWeb();

			if(!deleteCheck()){
				return;
			}

			if("1".equals(struct.geth_APR_ITEM())){	//品目承認				
				// 承認情報の登録
				boolean rtn = insertAppr("3");
				if(!rtn) return;	
				controlclear();
			
			}else{
				int cnt = entity.mdeleteM_ITEM.delete(conn, struct);
				if(cnt <= 0){
					// エラーメッセージ作成
					keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
					setErrorMessage("ZZ06001", keyMessage);

				}else{
					controlclear();
				}
			}
		
			//コミット
			conn.commit();

		}catch(SQLException e){
			// エラーメッセージ作成
			keyMessage = "M_ITEM.ITEM_CD:" + struct.getITEM_CD();
			setSqlExceptionMsg(e, keyMessage);

		}finally{
			try {
				conn.rollback();
			} catch(Exception e) {
				e.printStackTrace();
			}
		}

		//---------------------------------------------------------------------
                //}}user_implement_dev:<controldelete>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
		struct.init();
		// 品目承認
		struct.seth_APR_ITEM(_APPR_ITEM);

		// 検索状態を「初期状態」に設定
		setReadStatus(INITIAL);

                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		//---------------------------------------------------------------------
		String keyMessage = "";

		try{
//20150730 ADD START BY SYSCOM
			// 会社コード取得
			List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			if(companyList.size() > 0)
			 struct.setCOMPANY_CD(((AA0010010Struct)companyList.get(0)).getCOMPANY_CD());
			sysCOMPANY_CD = struct.getCOMPANY_CD();
//20150730 ADD END BY SYSCOM

			//画面遷移パラメータを取得
			_SCREENMOVE_TYP = struct.geth_SCREENMOVE_TYP();
			_APPR_ID = struct.geth_APPR_ID();
			
			struct.init();

			// 検索状態を「初期状態」に設定
			setReadStatus(INITIAL);
            //ロット管理フラグを取得
			boolean lotCtrlFlg = LotCtrl.checkLotCtrl(conn);
			if(lotCtrlFlg){
				struct.setLOTCTRLFLG("true");
			}else{
				struct.setLOTCTRLFLG("false");
			}
			
			// コンボボックスデータ用意
			ComboBox controller = new ComboBox(conn, sysUSER_CD);

			_ISSUE_TYP = controller.getData("ISSUE_TYP");
			_OUTSIDE_TYP = controller.getData("OUTSIDE_TYP");
			_STOCK_UNIT_FLG = controller.getData("STOCK_UNIT_FLG");
			_UNIT_QTY_TYP = controller.getData("UNIT_QTY_TYP");
			_MRP_ODR_TYP = controller.getData("MRP_ODR_TYP");
			_LOT_SIZING_TYP = controller.getData("LOT_SIZING_TYP");
// 2008/07/14 SYSCOM 小林 ADD START
			_MANHOUR_TYP = controller.getData("MANHOUR_TYP");
// 2008/07/14 SYSCOM 小林 ADD END
			_MPS_FLG = controller.getData("MPS_FLG");
			_ACPT_INSPC_TYP = controller.getData("ACPT_INSPC_TYP");
			_PRODUCT_TYP = controller.getData("PRODUCT_TYP");
			_ABC_TYP = controller.getData("ABC_TYP");
			_OPR_RSLT_TYP = controller.getData("OPR_RSLT_TYP");
			_SPL_ITEM_TYP = controller.getData("SPL_ITEM_TYP");
			_STOCK_UNIT = controller.getData("STOCK_UNIT");
			_DEPO_TYP = controller.getData("WH_COND_TYP");
			_LOT_CTRL_FLG = controller.getData("LOT_TYP");
			_LOT_NUMBERING_TYP = controller.getData("LOT_NUMBERING");
//20150730 ADD START BY SYSCOM
			_unitPjCdStruct = createComboData("1");
			_unitSegContent1Struct = createComboData("2");
			_unitSegContent2Struct = createComboData("3");
			_unitSegContent3Struct = createComboData("4");
			_unitSegContent4Struct = createComboData("5");
//20150730 ADD END BY SYSCOM
		    //品目分類01～12中分類名称
		    _ITEM_CLASS_01_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD01,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_02_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD02,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_03_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD03,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_04_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD04,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_05_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD05,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_06_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD06,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_07_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD07,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_08_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD08,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_09_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD09,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_10_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD10,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_11_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD11,AA0010Common.CLASS_CD00);
		    _ITEM_CLASS_12_TYP = ClassMaster.getClassName(conn,AA0010Common.CLASS_CD,AA0010Common.CLASS_CD12,AA0010Common.CLASS_CD00);
	        
	        /** パラメータ「品目承認」を取得*/
		    //private PrivateConfig privateConfig;
		    PrivateConfig privateConfig = new PrivateConfig(conn);	        
	        // 品目承認
		    _APPR_ITEM = privateConfig.getString("APR_ITEM");
	        // パラメータ「品目承認」が取得できなかった場合
			if(_APPR_ITEM ==null || "".equals(_APPR_ITEM)) {
 				String locale = CoreTools.getLocale(struct.getsUser_ID());
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00088"));
 				msgStruct.addError(emsg);
 				sysLog.warning(emsg, sysUSER_CD);
				struct.seth_APR_ITEM("0");
			} else if("1".equals(_APPR_ITEM)) {
				// １の場合
				struct.seth_APR_ITEM("1");
			} else {
				// １以外の場合
				struct.seth_APR_ITEM("0");
			}
			_APPR_ITEM = struct.geth_APR_ITEM();
            // add 標準G ↓
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す
			if ( isScreenMove()== true ) {
				//承認依頼情報からパラメータを取得
				if("1".equals(_SCREENMOVE_TYP) || "0".equals(_SCREENMOVE_TYP)){
					struct.setITEM_CD(keyValueMap.get("ITEM_CD").toString());
					struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
				}
				controlselect();
			}
            // add 標準G ↑
    
		}catch(SQLException e){
			// エラーメッセージ作成
			keyMessage = "";
			setSqlExceptionMsg(e, keyMessage);

		}catch(ComboException e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);

			throw ee;

		}
//20150730 ADD START BY SYSCOM
		catch (Exception e){
			e.printStackTrace();
			throw new ExpjException(e);
		}
//20150730 ADD END BY SYSCOM

		//---------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0010");
		logger.entering("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// ダウンロードファイル名クリア
			// PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
//			struct.setDOWNLOAD_FILE((String)null);
			// コンボボックス部品のデータのセットはここに記述してください。
			// コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0010010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("select") ) {
				controlselect();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>

			// コンボボックスデータ設定
			struct.setList_ISSUE_TYP_val(_ISSUE_TYP.getValList());
			struct.setList_ISSUE_TYP_name(_ISSUE_TYP.getExplanList());
			struct.setList_OUTSIDE_TYP_val(_OUTSIDE_TYP.getValList());
			struct.setList_OUTSIDE_TYP_name(_OUTSIDE_TYP.getExplanList());
			struct.setList_STOCK_UNIT_FLG_val(_STOCK_UNIT_FLG.getValList());
			struct.setList_STOCK_UNIT_FLG_name(_STOCK_UNIT_FLG.getExplanList());
			struct.setList_UNIT_QTY_TYP_val(_UNIT_QTY_TYP.getValList());
			struct.setList_UNIT_QTY_TYP_name(_UNIT_QTY_TYP.getExplanList());
			struct.setList_MRP_ODR_TYP_val(_MRP_ODR_TYP.getValList());
			struct.setList_MRP_ODR_TYP_name(_MRP_ODR_TYP.getExplanList());
			struct.setList_LOT_SIZING_TYP_val(_LOT_SIZING_TYP.getValList());
			struct.setList_LOT_SIZING_TYP_name(_LOT_SIZING_TYP.getExplanList());
// 2008/07/14 SYSCOM 小林 ADD START
			struct.setList_MANHOUR_TYP_val(_MANHOUR_TYP.getValList());
			struct.setList_MANHOUR_TYP_name(_MANHOUR_TYP.getExplanList());
// 2008/07/14 SYSCOM 小林 ADD END
			struct.setList_MPS_FLG_val(_MPS_FLG.getValList());
			struct.setList_MPS_FLG_name(_MPS_FLG.getExplanList());
			struct.setList_ACPT_INSPC_TYP_val(_ACPT_INSPC_TYP.getValList());
			struct.setList_ACPT_INSPC_TYP_name(_ACPT_INSPC_TYP.getExplanList());
			struct.setList_PRODUCT_TYP_val(_PRODUCT_TYP.getValList());
			struct.setList_PRODUCT_TYP_name(_PRODUCT_TYP.getExplanList());
			struct.setList_ABC_TYP_val(_ABC_TYP.getValList());
			struct.setList_ABC_TYP_name(_ABC_TYP.getExplanList());
			struct.setList_OPR_RSLT_TYP_val(_OPR_RSLT_TYP.getValList());
			struct.setList_OPR_RSLT_TYP_name(_OPR_RSLT_TYP.getExplanList());
			struct.setList_SPL_ITEM_TYP_val(_SPL_ITEM_TYP.getValList());
			struct.setList_SPL_ITEM_TYP_name(_SPL_ITEM_TYP.getExplanList());
			struct.setList_STOCK_UNIT_val(_STOCK_UNIT.getExplanList());
			struct.setList_STOCK_UNIT_name(_STOCK_UNIT.getExplanList());		
			struct.setList_DEPO_TYP_val(_DEPO_TYP.getValList());
			struct.setList_DEPO_TYP_name(_DEPO_TYP.getExplanList());		
			struct.setList_LOT_CTRL_FLG_val(_LOT_CTRL_FLG.getValList());
			struct.setList_LOT_CTRL_FLG_name(_LOT_CTRL_FLG.getExplanList());		
			struct.setList_LOT_NUMBERING_TYP_val(_LOT_NUMBERING_TYP.getValList());
			struct.setList_LOT_NUMBERING_TYP_name(_LOT_NUMBERING_TYP.getExplanList());
//20150730 ADD START BY SYSCOM
			struct.setList_PJ_CD_val(_unitPjCdStruct.getValList());
			struct.setList_PJ_CD_name(_unitPjCdStruct.getExplanList());
			struct.setList_SEG_CONTENTS1_val(_unitSegContent1Struct.getValList());
			struct.setList_SEG_CONTENTS1_name(_unitSegContent1Struct.getExplanList());
			struct.setList_SEG_CONTENTS2_val(_unitSegContent2Struct.getValList());
			struct.setList_SEG_CONTENTS2_name(_unitSegContent2Struct.getExplanList());
			struct.setList_SEG_CONTENTS3_val(_unitSegContent3Struct.getValList());
			struct.setList_SEG_CONTENTS3_name(_unitSegContent3Struct.getExplanList());
			struct.setList_SEG_CONTENTS4_val(_unitSegContent4Struct.getValList());
			struct.setList_SEG_CONTENTS4_name(_unitSegContent4Struct.getExplanList());
//20150730 ADD END BY SYSCOM
			// 分類マスタ名01～12
			struct.setITEM_CLASS_01_TYP(_ITEM_CLASS_01_TYP);
			struct.setITEM_CLASS_02_TYP(_ITEM_CLASS_02_TYP);
			struct.setITEM_CLASS_03_TYP(_ITEM_CLASS_03_TYP);
			struct.setITEM_CLASS_04_TYP(_ITEM_CLASS_04_TYP);
			struct.setITEM_CLASS_05_TYP(_ITEM_CLASS_05_TYP);
			struct.setITEM_CLASS_06_TYP(_ITEM_CLASS_06_TYP);
			struct.setITEM_CLASS_07_TYP(_ITEM_CLASS_07_TYP);
			struct.setITEM_CLASS_08_TYP(_ITEM_CLASS_08_TYP);
			struct.setITEM_CLASS_09_TYP(_ITEM_CLASS_09_TYP);
			struct.setITEM_CLASS_10_TYP(_ITEM_CLASS_10_TYP);
			struct.setITEM_CLASS_11_TYP(_ITEM_CLASS_11_TYP);
			struct.setITEM_CLASS_12_TYP(_ITEM_CLASS_12_TYP);			
			struct.copy(struct);
  		} catch(AlarmMessageException ame){
			ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
			throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0010010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0010010-E999","CSVの出力処理"));
			throw new FoundationException("AA0010010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0010010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0010010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0010010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0010010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0010010Entity entity;
	protected AA0010010Struct struct;
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

		entity = new AA0010010Entity();
		struct = new AA0010010Struct();

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
	 * AA0010010クラスの標準コンストラクタ
	 */
	public AA0010010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AA0010010Struct key = (AA0010010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_name") && key.getISSUE_TYP_name() != null) {
					msgKey.setKeyValue("ISSUE_TYP_name", key.getISSUE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP_val") && key.getISSUE_TYP_val() != null) {
					msgKey.setKeyValue("ISSUE_TYP_val", key.getISSUE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name") && key.getOUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_name", key.getOUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val") && key.getOUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_val", key.getOUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_name") && key.getSTOCK_UNIT_FLG_name() != null) {
					msgKey.setKeyValue("STOCK_UNIT_FLG_name", key.getSTOCK_UNIT_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_val") && key.getSTOCK_UNIT_FLG_val() != null) {
					msgKey.setKeyValue("STOCK_UNIT_FLG_val", key.getSTOCK_UNIT_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_name") && key.getUNIT_QTY_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_name", key.getUNIT_QTY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_val") && key.getUNIT_QTY_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_val", key.getUNIT_QTY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name") && key.getACPT_INSPC_TYP_name() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_name", key.getACPT_INSPC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val") && key.getACPT_INSPC_TYP_val() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP_val", key.getACPT_INSPC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name") && key.getPRODUCT_TYP_name() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_name", key.getPRODUCT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val") && key.getPRODUCT_TYP_val() != null) {
					msgKey.setKeyValue("PRODUCT_TYP_val", key.getPRODUCT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP_name") && key.getABC_TYP_name() != null) {
					msgKey.setKeyValue("ABC_TYP_name", key.getABC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP_val") && key.getABC_TYP_val() != null) {
					msgKey.setKeyValue("ABC_TYP_val", key.getABC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name") && key.getOPR_RSLT_TYP_name() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_name", key.getOPR_RSLT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val") && key.getOPR_RSLT_TYP_val() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_val", key.getOPR_RSLT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name") && key.getSPL_ITEM_TYP_name() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_name", key.getSPL_ITEM_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val") && key.getSPL_ITEM_TYP_val() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP_val", key.getSPL_ITEM_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_name") && key.getLOT_SIZING_TYP_name() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP_name", key.getLOT_SIZING_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_val") && key.getLOT_SIZING_TYP_val() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP_val", key.getLOT_SIZING_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MPS_FLG_name") && key.getMPS_FLG_name() != null) {
					msgKey.setKeyValue("MPS_FLG_name", key.getMPS_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("MPS_FLG_val") && key.getMPS_FLG_val() != null) {
					msgKey.setKeyValue("MPS_FLG_val", key.getMPS_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_name") && key.getSTOCK_UNIT_name() != null) {
					msgKey.setKeyValue("STOCK_UNIT_name", key.getSTOCK_UNIT_name());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_val") && key.getSTOCK_UNIT_val() != null) {
					msgKey.setKeyValue("STOCK_UNIT_val", key.getSTOCK_UNIT_val());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_TYP") && key.getITEM_CLASS_01_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_01_TYP", key.getITEM_CLASS_01_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_NAME") && key.getITEM_CLASS_01_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_01_NAME", key.getITEM_CLASS_01_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_TYP") && key.getITEM_CLASS_02_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_02_TYP", key.getITEM_CLASS_02_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_NAME") && key.getITEM_CLASS_02_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_02_NAME", key.getITEM_CLASS_02_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_TYP") && key.getITEM_CLASS_03_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_03_TYP", key.getITEM_CLASS_03_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_NAME") && key.getITEM_CLASS_03_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_03_NAME", key.getITEM_CLASS_03_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_TYP") && key.getITEM_CLASS_04_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_04_TYP", key.getITEM_CLASS_04_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_NAME") && key.getITEM_CLASS_04_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_04_NAME", key.getITEM_CLASS_04_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_TYP") && key.getITEM_CLASS_05_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_05_TYP", key.getITEM_CLASS_05_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_NAME") && key.getITEM_CLASS_05_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_05_NAME", key.getITEM_CLASS_05_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_TYP") && key.getITEM_CLASS_06_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_06_TYP", key.getITEM_CLASS_06_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_NAME") && key.getITEM_CLASS_06_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_06_NAME", key.getITEM_CLASS_06_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_TYP") && key.getITEM_CLASS_07_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_07_TYP", key.getITEM_CLASS_07_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_NAME") && key.getITEM_CLASS_07_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_07_NAME", key.getITEM_CLASS_07_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_TYP") && key.getITEM_CLASS_08_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_08_TYP", key.getITEM_CLASS_08_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_NAME") && key.getITEM_CLASS_08_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_08_NAME", key.getITEM_CLASS_08_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_TYP") && key.getITEM_CLASS_09_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_09_TYP", key.getITEM_CLASS_09_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_NAME") && key.getITEM_CLASS_09_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_09_NAME", key.getITEM_CLASS_09_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_TYP") && key.getITEM_CLASS_10_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_10_TYP", key.getITEM_CLASS_10_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_NAME") && key.getITEM_CLASS_10_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_10_NAME", key.getITEM_CLASS_10_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_TYP") && key.getITEM_CLASS_11_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_11_TYP", key.getITEM_CLASS_11_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_NAME") && key.getITEM_CLASS_11_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_11_NAME", key.getITEM_CLASS_11_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_TYP") && key.getITEM_CLASS_12_TYP() != null) {
					msgKey.setKeyValue("ITEM_CLASS_12_TYP", key.getITEM_CLASS_12_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_NAME") && key.getITEM_CLASS_12_NAME() != null) {
					msgKey.setKeyValue("ITEM_CLASS_12_NAME", key.getITEM_CLASS_12_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_name") && key.getDEPO_TYP_name() != null) {
					msgKey.setKeyValue("DEPO_TYP_name", key.getDEPO_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP_val") && key.getDEPO_TYP_val() != null) {
					msgKey.setKeyValue("DEPO_TYP_val", key.getDEPO_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name") && key.getLOT_CTRL_FLG_name() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_name", key.getLOT_CTRL_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val") && key.getLOT_CTRL_FLG_val() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG_val", key.getLOT_CTRL_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_name") && key.getLOT_NUMBERING_TYP_name() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP_name", key.getLOT_NUMBERING_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_val") && key.getLOT_NUMBERING_TYP_val() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP_val", key.getLOT_NUMBERING_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name") && key.getMANHOUR_TYP_name() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_name", key.getMANHOUR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val") && key.getMANHOUR_TYP_val() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_val", key.getMANHOUR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_APR_ITEM") && key.geth_APR_ITEM() != null) {
					msgKey.setKeyValue("h_APR_ITEM", key.geth_APR_ITEM());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_name") && key.getPJ_CD_name() != null) {
					msgKey.setKeyValue("PJ_CD_name", key.getPJ_CD_name());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD_val") && key.getPJ_CD_val() != null) {
					msgKey.setKeyValue("PJ_CD_val", key.getPJ_CD_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name") && key.getSEG_CONTENTS1_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_name", key.getSEG_CONTENTS1_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val") && key.getSEG_CONTENTS1_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1_val", key.getSEG_CONTENTS1_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name") && key.getSEG_CONTENTS2_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_name", key.getSEG_CONTENTS2_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val") && key.getSEG_CONTENTS2_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2_val", key.getSEG_CONTENTS2_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name") && key.getSEG_CONTENTS3_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_name", key.getSEG_CONTENTS3_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val") && key.getSEG_CONTENTS3_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3_val", key.getSEG_CONTENTS3_val());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name") && key.getSEG_CONTENTS4_name() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_name", key.getSEG_CONTENTS4_name());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val") && key.getSEG_CONTENTS4_val() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4_val", key.getSEG_CONTENTS4_val());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUM_PROP_LT") && key.getSUM_PROP_LT() != null) {
					msgKey.setKeyValue("SUM_PROP_LT", key.getSUM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("SUM_FIXED_LT") && key.getSUM_FIXED_LT() != null) {
					msgKey.setKeyValue("SUM_FIXED_LT", key.getSUM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("LOTCTRLFLG") && key.getLOTCTRLFLG() != null) {
					msgKey.setKeyValue("LOTCTRLFLG", key.getLOTCTRLFLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("HIGH_LEVEL_NO") && key.getHIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("HIGH_LEVEL_NO", key.getHIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG") && key.getSTOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("STOCK_UNIT_FLG", key.getSTOCK_UNIT_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT") && key.getPKG_UNIT() != null) {
					msgKey.setKeyValue("PKG_UNIT", key.getPKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY") && key.getPKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("PKG_UNIT_QTY", key.getPKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("ODR_LT") && key.getODR_LT() != null) {
					msgKey.setKeyValue("ODR_LT", key.getODR_LT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_LT") && key.getISSUE_LT() != null) {
					msgKey.setKeyValue("ISSUE_LT", key.getISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_STOCK") && key.getSAFETY_STOCK() != null) {
					msgKey.setKeyValue("SAFETY_STOCK", key.getSAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP") && key.getLOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("LOT_SIZING_TYP", key.getLOT_SIZING_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("MAX_PERIOD") && key.getMAX_PERIOD() != null) {
					msgKey.setKeyValue("MAX_PERIOD", key.getMAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("FIXED_ODR_QTY") && key.getFIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("FIXED_ODR_QTY", key.getFIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MAX_ODR_QTY") && key.getMAX_ODR_QTY() != null) {
					msgKey.setKeyValue("MAX_ODR_QTY", key.getMAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MIN_ODR_QTY") && key.getMIN_ODR_QTY() != null) {
					msgKey.setKeyValue("MIN_ODR_QTY", key.getMIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_POINT") && key.getODR_POINT() != null) {
					msgKey.setKeyValue("ODR_POINT", key.getODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("MUL_ODR_QTY") && key.getMUL_ODR_QTY() != null) {
					msgKey.setKeyValue("MUL_ODR_QTY", key.getMUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("MPS_FLG") && key.getMPS_FLG() != null) {
					msgKey.setKeyValue("MPS_FLG", key.getMPS_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_WEIGHT") && key.getUNIT_WEIGHT() != null) {
					msgKey.setKeyValue("UNIT_WEIGHT", key.getUNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("ABC_TYP") && key.getABC_TYP() != null) {
					msgKey.setKeyValue("ABC_TYP", key.getABC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME") && key.getTAX_NAME() != null) {
					msgKey.setKeyValue("TAX_NAME", key.getTAX_NAME());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO().toString());
				}
				if(msgKeyType.containsKeyColumn("CAL_NAME") && key.getCAL_NAME() != null) {
					msgKey.setKeyValue("CAL_NAME", key.getCAL_NAME());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_CD") && key.getITEM_CLASS_01_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_01_CD", key.getITEM_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_CD") && key.getITEM_CLASS_02_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_02_CD", key.getITEM_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_CD") && key.getITEM_CLASS_03_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_03_CD", key.getITEM_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_CD") && key.getITEM_CLASS_04_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_04_CD", key.getITEM_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_CD") && key.getITEM_CLASS_05_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_05_CD", key.getITEM_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_CD") && key.getITEM_CLASS_06_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_06_CD", key.getITEM_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_CD") && key.getITEM_CLASS_07_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_07_CD", key.getITEM_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_CD") && key.getITEM_CLASS_08_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_08_CD", key.getITEM_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_CD") && key.getITEM_CLASS_09_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_09_CD", key.getITEM_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_CD") && key.getITEM_CLASS_10_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_10_CD", key.getITEM_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_CD") && key.getITEM_CLASS_11_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_11_CD", key.getITEM_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_CD") && key.getITEM_CLASS_12_CD() != null) {
					msgKey.setKeyValue("ITEM_CLASS_12_CD", key.getITEM_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG().toString());
				}
				if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP") && key.getLOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("LOT_NUMBERING_TYP", key.getLOT_NUMBERING_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_YEAR") && key.getBEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("BEST_BEFORE_YEAR", key.getBEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_MONTH") && key.getBEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("BEST_BEFORE_MONTH", key.getBEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("BEST_BEFORE_DAY") && key.getBEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("BEST_BEFORE_DAY", key.getBEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("REMARK1") && key.getREMARK1() != null) {
					msgKey.setKeyValue("REMARK1", key.getREMARK1());
				}
				if(msgKeyType.containsKeyColumn("REMARK2") && key.getREMARK2() != null) {
					msgKey.setKeyValue("REMARK2", key.getREMARK2());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("DEPT_CD") && key.getDEPT_CD() != null) {
					msgKey.setKeyValue("DEPT_CD", key.getDEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("DEPT_NAME") && key.getDEPT_NAME() != null) {
					msgKey.setKeyValue("DEPT_NAME", key.getDEPT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_CD") && key.getPJ_CD() != null) {
					msgKey.setKeyValue("PJ_CD", key.getPJ_CD());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS1") && key.getSEG_CONTENTS1() != null) {
					msgKey.setKeyValue("SEG_CONTENTS1", key.getSEG_CONTENTS1());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS2") && key.getSEG_CONTENTS2() != null) {
					msgKey.setKeyValue("SEG_CONTENTS2", key.getSEG_CONTENTS2());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS3") && key.getSEG_CONTENTS3() != null) {
					msgKey.setKeyValue("SEG_CONTENTS3", key.getSEG_CONTENTS3());
				}
				if(msgKeyType.containsKeyColumn("SEG_CONTENTS4") && key.getSEG_CONTENTS4() != null) {
					msgKey.setKeyValue("SEG_CONTENTS4", key.getSEG_CONTENTS4());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO") && key.getONEROUS_CONS_NO() != null) {
					msgKey.setKeyValue("ONEROUS_CONS_NO", key.getONEROUS_CONS_NO());
				}
				if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_DISPLAY_NAME") && key.getuMRP_ODR_TYP_DISPLAY_NAME() != null) {
					msgKey.setKeyValue("uMRP_ODR_TYP_DISPLAY_NAME", key.getuMRP_ODR_TYP_DISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_VALUE") && key.getuMRP_ODR_TYP_VALUE() != null) {
					msgKey.setKeyValue("uMRP_ODR_TYP_VALUE", key.getuMRP_ODR_TYP_VALUE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
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
					AA0010010Struct key = new AA0010010Struct();
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_name")) {
						key.setISSUE_TYP_name(msgKey.getKeyValue("ISSUE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP_val")) {
						key.setISSUE_TYP_val(msgKey.getKeyValue("ISSUE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_name")) {
						key.setOUTSIDE_TYP_name(msgKey.getKeyValue("OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_val")) {
						key.setOUTSIDE_TYP_val(msgKey.getKeyValue("OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_name")) {
						key.setSTOCK_UNIT_FLG_name(msgKey.getKeyValue("STOCK_UNIT_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG_val")) {
						key.setSTOCK_UNIT_FLG_val(msgKey.getKeyValue("STOCK_UNIT_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_name")) {
						key.setUNIT_QTY_TYP_name(msgKey.getKeyValue("UNIT_QTY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_val")) {
						key.setUNIT_QTY_TYP_val(msgKey.getKeyValue("UNIT_QTY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_name")) {
						key.setACPT_INSPC_TYP_name(msgKey.getKeyValue("ACPT_INSPC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP_val")) {
						key.setACPT_INSPC_TYP_val(msgKey.getKeyValue("ACPT_INSPC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_name")) {
						key.setPRODUCT_TYP_name(msgKey.getKeyValue("PRODUCT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP_val")) {
						key.setPRODUCT_TYP_val(msgKey.getKeyValue("PRODUCT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP_name")) {
						key.setABC_TYP_name(msgKey.getKeyValue("ABC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP_val")) {
						key.setABC_TYP_val(msgKey.getKeyValue("ABC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_name")) {
						key.setOPR_RSLT_TYP_name(msgKey.getKeyValue("OPR_RSLT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_val")) {
						key.setOPR_RSLT_TYP_val(msgKey.getKeyValue("OPR_RSLT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_name")) {
						key.setSPL_ITEM_TYP_name(msgKey.getKeyValue("SPL_ITEM_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP_val")) {
						key.setSPL_ITEM_TYP_val(msgKey.getKeyValue("SPL_ITEM_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_name")) {
						key.setLOT_SIZING_TYP_name(msgKey.getKeyValue("LOT_SIZING_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP_val")) {
						key.setLOT_SIZING_TYP_val(msgKey.getKeyValue("LOT_SIZING_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MPS_FLG_name")) {
						key.setMPS_FLG_name(msgKey.getKeyValue("MPS_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("MPS_FLG_val")) {
						key.setMPS_FLG_val(msgKey.getKeyValue("MPS_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_name")) {
						key.setSTOCK_UNIT_name(msgKey.getKeyValue("STOCK_UNIT_name"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_val")) {
						key.setSTOCK_UNIT_val(msgKey.getKeyValue("STOCK_UNIT_val"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_TYP")) {
						key.setITEM_CLASS_01_TYP(msgKey.getKeyValue("ITEM_CLASS_01_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_NAME")) {
						key.setITEM_CLASS_01_NAME(msgKey.getKeyValue("ITEM_CLASS_01_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_TYP")) {
						key.setITEM_CLASS_02_TYP(msgKey.getKeyValue("ITEM_CLASS_02_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_NAME")) {
						key.setITEM_CLASS_02_NAME(msgKey.getKeyValue("ITEM_CLASS_02_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_TYP")) {
						key.setITEM_CLASS_03_TYP(msgKey.getKeyValue("ITEM_CLASS_03_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_NAME")) {
						key.setITEM_CLASS_03_NAME(msgKey.getKeyValue("ITEM_CLASS_03_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_TYP")) {
						key.setITEM_CLASS_04_TYP(msgKey.getKeyValue("ITEM_CLASS_04_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_NAME")) {
						key.setITEM_CLASS_04_NAME(msgKey.getKeyValue("ITEM_CLASS_04_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_TYP")) {
						key.setITEM_CLASS_05_TYP(msgKey.getKeyValue("ITEM_CLASS_05_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_NAME")) {
						key.setITEM_CLASS_05_NAME(msgKey.getKeyValue("ITEM_CLASS_05_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_TYP")) {
						key.setITEM_CLASS_06_TYP(msgKey.getKeyValue("ITEM_CLASS_06_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_NAME")) {
						key.setITEM_CLASS_06_NAME(msgKey.getKeyValue("ITEM_CLASS_06_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_TYP")) {
						key.setITEM_CLASS_07_TYP(msgKey.getKeyValue("ITEM_CLASS_07_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_NAME")) {
						key.setITEM_CLASS_07_NAME(msgKey.getKeyValue("ITEM_CLASS_07_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_TYP")) {
						key.setITEM_CLASS_08_TYP(msgKey.getKeyValue("ITEM_CLASS_08_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_NAME")) {
						key.setITEM_CLASS_08_NAME(msgKey.getKeyValue("ITEM_CLASS_08_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_TYP")) {
						key.setITEM_CLASS_09_TYP(msgKey.getKeyValue("ITEM_CLASS_09_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_NAME")) {
						key.setITEM_CLASS_09_NAME(msgKey.getKeyValue("ITEM_CLASS_09_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_TYP")) {
						key.setITEM_CLASS_10_TYP(msgKey.getKeyValue("ITEM_CLASS_10_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_NAME")) {
						key.setITEM_CLASS_10_NAME(msgKey.getKeyValue("ITEM_CLASS_10_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_TYP")) {
						key.setITEM_CLASS_11_TYP(msgKey.getKeyValue("ITEM_CLASS_11_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_NAME")) {
						key.setITEM_CLASS_11_NAME(msgKey.getKeyValue("ITEM_CLASS_11_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_TYP")) {
						key.setITEM_CLASS_12_TYP(msgKey.getKeyValue("ITEM_CLASS_12_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_NAME")) {
						key.setITEM_CLASS_12_NAME(msgKey.getKeyValue("ITEM_CLASS_12_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_name")) {
						key.setDEPO_TYP_name(msgKey.getKeyValue("DEPO_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP_val")) {
						key.setDEPO_TYP_val(msgKey.getKeyValue("DEPO_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_name")) {
						key.setLOT_CTRL_FLG_name(msgKey.getKeyValue("LOT_CTRL_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG_val")) {
						key.setLOT_CTRL_FLG_val(msgKey.getKeyValue("LOT_CTRL_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_name")) {
						key.setLOT_NUMBERING_TYP_name(msgKey.getKeyValue("LOT_NUMBERING_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP_val")) {
						key.setLOT_NUMBERING_TYP_val(msgKey.getKeyValue("LOT_NUMBERING_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_name")) {
						key.setMANHOUR_TYP_name(msgKey.getKeyValue("MANHOUR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_val")) {
						key.setMANHOUR_TYP_val(msgKey.getKeyValue("MANHOUR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_ITEM")) {
						key.seth_APR_ITEM(msgKey.getKeyValue("h_APR_ITEM"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_name")) {
						key.setPJ_CD_name(msgKey.getKeyValue("PJ_CD_name"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD_val")) {
						key.setPJ_CD_val(msgKey.getKeyValue("PJ_CD_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_name")) {
						key.setSEG_CONTENTS1_name(msgKey.getKeyValue("SEG_CONTENTS1_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1_val")) {
						key.setSEG_CONTENTS1_val(msgKey.getKeyValue("SEG_CONTENTS1_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_name")) {
						key.setSEG_CONTENTS2_name(msgKey.getKeyValue("SEG_CONTENTS2_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2_val")) {
						key.setSEG_CONTENTS2_val(msgKey.getKeyValue("SEG_CONTENTS2_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_name")) {
						key.setSEG_CONTENTS3_name(msgKey.getKeyValue("SEG_CONTENTS3_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3_val")) {
						key.setSEG_CONTENTS3_val(msgKey.getKeyValue("SEG_CONTENTS3_val"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_name")) {
						key.setSEG_CONTENTS4_name(msgKey.getKeyValue("SEG_CONTENTS4_name"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4_val")) {
						key.setSEG_CONTENTS4_val(msgKey.getKeyValue("SEG_CONTENTS4_val"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUM_PROP_LT")) {
						key.setSUM_PROP_LT(new Integer(msgKey.getKeyValue("SUM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("SUM_FIXED_LT")) {
						key.setSUM_FIXED_LT(new Integer(msgKey.getKeyValue("SUM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("LOTCTRLFLG")) {
						key.setLOTCTRLFLG(msgKey.getKeyValue("LOTCTRLFLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("HIGH_LEVEL_NO")) {
						key.setHIGH_LEVEL_NO(msgKey.getKeyValue("HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(new Integer(msgKey.getKeyValue("ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(new Integer(msgKey.getKeyValue("OUTSIDE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT_FLG")) {
						key.setSTOCK_UNIT_FLG(new Integer(msgKey.getKeyValue("STOCK_UNIT_FLG")));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT")) {
						key.setPKG_UNIT(msgKey.getKeyValue("PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PKG_UNIT_QTY")) {
						key.setPKG_UNIT_QTY(msgKey.getKeyValue("PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(new Integer(msgKey.getKeyValue("UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("ODR_LT")) {
						key.setODR_LT(msgKey.getKeyValue("ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_LT")) {
						key.setISSUE_LT(msgKey.getKeyValue("ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_STOCK")) {
						key.setSAFETY_STOCK(msgKey.getKeyValue("SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(new Integer(msgKey.getKeyValue("MRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_SIZING_TYP")) {
						key.setLOT_SIZING_TYP(new Integer(msgKey.getKeyValue("LOT_SIZING_TYP")));
					}
					if(msgKeyType.containsKeyColumn("MAX_PERIOD")) {
						key.setMAX_PERIOD(msgKey.getKeyValue("MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_ODR_QTY")) {
						key.setFIXED_ODR_QTY(msgKey.getKeyValue("FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MAX_ODR_QTY")) {
						key.setMAX_ODR_QTY(msgKey.getKeyValue("MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MIN_ODR_QTY")) {
						key.setMIN_ODR_QTY(msgKey.getKeyValue("MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_POINT")) {
						key.setODR_POINT(msgKey.getKeyValue("ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("MUL_ODR_QTY")) {
						key.setMUL_ODR_QTY(msgKey.getKeyValue("MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MPS_FLG")) {
						key.setMPS_FLG(new Integer(msgKey.getKeyValue("MPS_FLG")));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(new Integer(msgKey.getKeyValue("ACPT_INSPC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(new Integer(msgKey.getKeyValue("PRODUCT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_WEIGHT")) {
						key.setUNIT_WEIGHT(msgKey.getKeyValue("UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("ABC_TYP")) {
						key.setABC_TYP(new Integer(msgKey.getKeyValue("ABC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(new Integer(msgKey.getKeyValue("OPR_RSLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(new Integer(msgKey.getKeyValue("SPL_ITEM_TYP")));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME")) {
						key.setTAX_NAME(msgKey.getKeyValue("TAX_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(new Integer(msgKey.getKeyValue("CAL_NO")));
					}
					if(msgKeyType.containsKeyColumn("CAL_NAME")) {
						key.setCAL_NAME(msgKey.getKeyValue("CAL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_01_CD")) {
						key.setITEM_CLASS_01_CD(msgKey.getKeyValue("ITEM_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_02_CD")) {
						key.setITEM_CLASS_02_CD(msgKey.getKeyValue("ITEM_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_03_CD")) {
						key.setITEM_CLASS_03_CD(msgKey.getKeyValue("ITEM_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_04_CD")) {
						key.setITEM_CLASS_04_CD(msgKey.getKeyValue("ITEM_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_05_CD")) {
						key.setITEM_CLASS_05_CD(msgKey.getKeyValue("ITEM_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_06_CD")) {
						key.setITEM_CLASS_06_CD(msgKey.getKeyValue("ITEM_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_07_CD")) {
						key.setITEM_CLASS_07_CD(msgKey.getKeyValue("ITEM_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_08_CD")) {
						key.setITEM_CLASS_08_CD(msgKey.getKeyValue("ITEM_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_09_CD")) {
						key.setITEM_CLASS_09_CD(msgKey.getKeyValue("ITEM_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_10_CD")) {
						key.setITEM_CLASS_10_CD(msgKey.getKeyValue("ITEM_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_11_CD")) {
						key.setITEM_CLASS_11_CD(msgKey.getKeyValue("ITEM_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CLASS_12_CD")) {
						key.setITEM_CLASS_12_CD(msgKey.getKeyValue("ITEM_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(new Integer(msgKey.getKeyValue("DEPO_TYP")));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(new Integer(msgKey.getKeyValue("LOT_CTRL_FLG")));
					}
					if(msgKeyType.containsKeyColumn("LOT_NUMBERING_TYP")) {
						key.setLOT_NUMBERING_TYP(new Integer(msgKey.getKeyValue("LOT_NUMBERING_TYP")));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_YEAR")) {
						key.setBEST_BEFORE_YEAR(msgKey.getKeyValue("BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_MONTH")) {
						key.setBEST_BEFORE_MONTH(msgKey.getKeyValue("BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("BEST_BEFORE_DAY")) {
						key.setBEST_BEFORE_DAY(msgKey.getKeyValue("BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("REMARK1")) {
						key.setREMARK1(msgKey.getKeyValue("REMARK1"));
					}
					if(msgKeyType.containsKeyColumn("REMARK2")) {
						key.setREMARK2(msgKey.getKeyValue("REMARK2"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(new Integer(msgKey.getKeyValue("MANHOUR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("DEPT_CD")) {
						key.setDEPT_CD(msgKey.getKeyValue("DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_NAME")) {
						key.setDEPT_NAME(msgKey.getKeyValue("DEPT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_CD")) {
						key.setPJ_CD(msgKey.getKeyValue("PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS1")) {
						key.setSEG_CONTENTS1(msgKey.getKeyValue("SEG_CONTENTS1"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS2")) {
						key.setSEG_CONTENTS2(msgKey.getKeyValue("SEG_CONTENTS2"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS3")) {
						key.setSEG_CONTENTS3(msgKey.getKeyValue("SEG_CONTENTS3"));
					}
					if(msgKeyType.containsKeyColumn("SEG_CONTENTS4")) {
						key.setSEG_CONTENTS4(msgKey.getKeyValue("SEG_CONTENTS4"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_CONS_NO")) {
						key.setONEROUS_CONS_NO(msgKey.getKeyValue("ONEROUS_CONS_NO"));
					}
					if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_DISPLAY_NAME")) {
						key.setuMRP_ODR_TYP_DISPLAY_NAME(msgKey.getKeyValue("uMRP_ODR_TYP_DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("uMRP_ODR_TYP_VALUE")) {
						key.setuMRP_ODR_TYP_VALUE(msgKey.getKeyValue("uMRP_ODR_TYP_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
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
