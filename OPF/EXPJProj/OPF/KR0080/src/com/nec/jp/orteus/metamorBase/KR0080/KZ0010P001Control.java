/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0080/src/com/nec/jp/orteus/metamorBase/KR0080/KZ0010P001Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KR0080;

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
    import java.math.BigDecimal;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KZ0010P001Control
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
	public KZ0010P001Struct getListvalue(int x) { return (KZ0010P001Struct)(this.list.get(x)); }	// リストの値を返します。
	public KZ0010P001Struct getStruct() { return this.struct; }	// Structを返します。
	public KZ0010P001Struct createStruct() { return new KZ0010P001Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KZ0010P001Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	// TODO: ユーザ定義のコードを記述してください
    private KZ0010P001Struct tempStruct;
    
    // 消費税コード
    private String _taxCd = null;
    
    /**
     * 消費税コードセット
     * @param taxCd
     */
    protected void setTaxCd(String taxCd) {
    	_taxCd = taxCd;
    }

    /**
     * ユーザIDセット<BR>
     *
     * @param userId 黒伝票番号
     */
    protected void setUserId(String userId) {
        struct.setsUser_ID(userId);
    }

    /**
     * 自社情報抽出<BR>
     * 共通<BR>
     */
    protected String selectMyCompany() {
        try {
            list = entity.mSelectSYS_MY_COMPANY.read(conn, struct);
            //System.out.println("mSelectSYS_MY_COMPANY:" + list.size());
            if (list.size() == 0) {
                return "KI00026";
            }

            //tempStruct = new KZ0010P001Struct();
            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setCOMPANY_CD(tempStruct.getCOMPANY_CD());
            //System.out.println("setCOMPANY_CD:" + struct.getCOMPANY_CD());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 売掛システム管理マスタ抽出<BR>
     * 共通<BR>
     */
    protected String selectArCtrl() {
        try {
            list = entity.mSelectSYS_AR_CTRL.read(conn, struct);
            //System.out.println("mSelectSYS_AR_CTRL:" + list.size());
            if (list.size() == 0) {
                return "KI00006";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setSLIP_CTRL_GRP(tempStruct.getSLIP_CTRL_GRP());
            //System.out.println("setSLIP_CTRL_GRP:" + struct.getSLIP_CTRL_GRP());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 区分コード抽出<BR>
     * 共通<BR>
     */
    protected String selectClassCode() {
        try {
            list = entity.mSelectSYS_CLASS_CODE.read(conn, struct);
            //System.out.println("mSelectSYS_CLASS_CODE:" + list.size());
            if (list.size() == 0) {
                return "KI00007";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setSLIP_TRN_CD(tempStruct.getSLIP_TRN_CD());
            //System.out.println("setSLIP_TRN_CD:" + struct.getSLIP_TRN_CD());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 伝票区分マスタ抽出<BR>
     * 共通<BR>
     */
    protected String selectSlipTrn() {
        try {
            list = entity.mSelectM_SLIP_TRN.read(conn, struct);
            //System.out.println("mSelectM_SLIP_TRN:" + list.size());
            if (list.size() == 0) {
                return "KI00008";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setSTOCK_CLASS_CD(tempStruct.getSTOCK_CLASS_CD());
            struct.setBALANCE_CLASS_CD(tempStruct.getBALANCE_CLASS_CD());
            //System.out.println("setSTOCK_CLASS_CD:" + struct.getSTOCK_CLASS_CD());
            //System.out.println("setBALANCE_CLASS_CD:" + struct.getBALANCE_CLASS_CD());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 邦貨抽出<BR>
     * 共通<BR>
     */
    protected String selectHomeCur() {
        try {
            list = entity.mSelectSYS_HOME_CUR.read(conn, struct);
            //System.out.println("mSelectSYS_HOME_CUR:" + list.size());
            if (list.size() == 0) {
                return "KI00014";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setHOME_CUR_CD(tempStruct.getHOME_CUR_CD());
            //System.out.println("setHOME_CUR_CD:" + struct.getHOME_CUR_CD());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }


    /**
     * 伝票番号セット<BR>
     *
     * @param SlipCd 伝票番号
     */
    protected void setSlipCd(String slipCd) {
        struct.setSLIP_CD(slipCd);
    }

    /**
     * 伝票番号セット2<BR>
     *
     * @param SlipCd2 伝票番号
     */
    protected void setSlipCd2(String slipCd) {
        struct.setSLIP_CD2(slipCd);
    }

    /**
     * 売上実績抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectSales() {
        try {
            list = entity.mSelectT_SALES.read(conn, struct);
            //System.out.println("mSelectT_SALES:" + list.size());
            if (list.size() == 0) {
                return "KI00001";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setSALES_DATE(tempStruct.getSALES_DATE());
            struct.setSALES_DEPT_CD(tempStruct.getSALES_DEPT_CD());
            struct.setCUST_CHRG_PSN_CD(tempStruct.getCUST_CHRG_PSN_CD());
            struct.setCUST_CD(tempStruct.getCUST_CD());
            struct.setITEM_CD(tempStruct.getITEM_CD());
            struct.setITEM_NAME(tempStruct.getITEM_NAME());
            struct.setSALES_CUST_ODR_NO(tempStruct.getSALES_CUST_ODR_NO());
            struct.setSALES_AMOUNT(tempStruct.getSALES_AMOUNT());
            struct.setREMARKS(tempStruct.getREMARKS());
            struct.setSALES_AMOUNT_EXCH_RATES(tempStruct.getSALES_AMOUNT_EXCH_RATES());
            struct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(tempStruct.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
            struct.setSALES_UNIT_PRICE(tempStruct.getSALES_UNIT_PRICE());
            struct.setSALES_QTY(tempStruct.getSALES_QTY());
            struct.setINSPC_ACPT_DATE(tempStruct.getINSPC_ACPT_DATE());
            struct.setINSPC_ACPT_QTY(tempStruct.getINSPC_ACPT_QTY());
            //System.out.println("setSALES_DATE:" + struct.getSALES_DATE());
            //System.out.println("setSALES_DEPT_CD:" + struct.getSALES_DEPT_CD());
            //System.out.println("setCUST_CHRG_PSN_CD:" + struct.getCUST_CHRG_PSN_CD());
            //System.out.println("setCUST_CD:" + struct.getCUST_CD());
            //System.out.println("setITEM_CD:" + struct.getITEM_CD());
            //System.out.println("setITEM_NAME:" + struct.getITEM_NAME());
            //System.out.println("setSALES_AMOUNT:" + struct.getSALES_AMOUNT());
            //System.out.println("setREMARKS:" + struct.getREMARKS());
            //System.out.println("setSALES_AMOUNT_EXCH_RATES:" + struct.getSALES_AMOUNT_EXCH_RATES());
            //System.out.println("setOWN_CUR_TAXCREDIT_SALES_AMOUNT:" + struct.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
            //System.out.println("setSALES_UNIT_PRICE:" + struct.getSALES_UNIT_PRICE());
            //System.out.println("setSALES_QTY:" + struct.getSALES_QTY());
            //System.out.println("setINSPC_ACPT_DATE:" + struct.getINSPC_ACPT_DATE());
            //System.out.println("setINSPC_ACPT_QTY:" + struct.getINSPC_ACPT_QTY());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 出荷実績抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectShip() {
        try {
            list = entity.mSelectT_SHIP.read(conn, struct);
            //System.out.println("mSelectT_SHIP:" + list.size());
            if (list.size() == 0) {
                return "KI00002";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setDLV_LOC_CD(tempStruct.getDLV_LOC_CD());
            struct.setSHIP_DATE(tempStruct.getSHIP_DATE());
            struct.setCUST_ODR_NO(tempStruct.getCUST_ODR_NO());
            struct.setODR_NO(tempStruct.getODR_NO());
            struct.setCUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());
            struct.setPART_DLV_SEQ_NO(tempStruct.getPART_DLV_SEQ_NO());
            struct.setSHIP_ODR_NO(tempStruct.getSHIP_ODR_NO());
            struct.setINSPC_ACPT_INFO_IF_CTRL_NO(tempStruct.getINSPC_ACPT_INFO_IF_CTRL_NO());
            //System.out.println("setDLV_LOC_CD:" + struct.getDLV_LOC_CD());
            //System.out.println("setSHIP_DATE:" + struct.getSHIP_DATE());
            //System.out.println("setCUST_ODR_NO:" + struct.getCUST_ODR_NO());
            //System.out.println("setODR_NO:" + struct.getODR_NO());
            //System.out.println("setCUST_ITEM_CD:" + struct.getCUST_ITEM_CD());
            //System.out.println("setPART_DLV_SEQ_NO:" + struct.getPART_DLV_SEQ_NO());
            //System.out.println("setSHIP_ODR_NO:" + struct.getSHIP_ODR_NO());
            //System.out.println("setINSPC_ACPT_INFO_IF_CTRL_NO:" + struct.getINSPC_ACPT_INFO_IF_CTRL_NO());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 出荷指示抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectShipOdr() {
        try {
            list = entity.mSelectT_SHIP_ODR.read(conn, struct);
            //System.out.println("mSelectT_SHIP_ODR:" + list.size());
            if (list.size() == 0) {
                return "KI00003";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setSHIP_ODR_NO(tempStruct.getSHIP_ODR_NO());
            struct.setDESINATED_SHIP_DATE(tempStruct.getDESINATED_SHIP_DATE());
            struct.setSCDL_DLV_DATE(tempStruct.getSCDL_DLV_DATE());
            //System.out.println("setSHIP_ODR_NO:" + struct.getSHIP_ODR_NO());
            //System.out.println("setDESINATED_SHIP_DATE:" + struct.getDESINATED_SHIP_DATE());
            //System.out.println("setSCDL_DLV_DATE:" + struct.getSCDL_DLV_DATE());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 受注明細抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectOdr() {
        try {
            list = entity.mSelectT_ODR.read(conn, struct);
            //System.out.println("mSelectT_ODR:" + list.size());
            if (list.size() == 0) {
                return "KI00004";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setODR_ACPT_DATE(tempStruct.getODR_ACPT_DATE());
            struct.setCUS_DLV_CD(tempStruct.getCUS_DLV_CD());
            struct.setCUS_DLV_KEY_CD(tempStruct.getCUS_DLV_KEY_CD());
            struct.setSPCL_PRICE_TYP(tempStruct.getSPCL_PRICE_TYP());
            struct.setODR_CMPLT_FLG(tempStruct.getODR_CMPLT_FLG());
            struct.setSHIP_CNT(tempStruct.getSHIP_CNT());
            //--Add Start 20131223 qian-lf
            struct.setT_ODR_TAX_CD(tempStruct.getT_ODR_TAX_CD());
            //--Add End 20131223 qian-lf
            //System.out.println("setODR_ACPT_DATE:" + struct.getODR_ACPT_DATE());
            //System.out.println("setCUS_DLV_CD:" + struct.getCUS_DLV_CD());
            //System.out.println("setCUS_DLV_KEY_CD:" + struct.getCUS_DLV_KEY_CD());
            //System.out.println("setSPCL_PRICE_TYP:" + struct.getSPCL_PRICE_TYP());
            //System.out.println("setODR_CMPLT_FLG:" + struct.getODR_CMPLT_FLG());
            //System.out.println("setSHIP_CNT:" + struct.getSHIP_CNT());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 製品単価抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectUnitCost() {
        String tempString = struct.getSPCL_PRICE_TYP();
        try {
            if ((tempString == null) || "0".equals(tempString)) {
                // 得値区分 = null or 0
                list = entity.mSelectM_UNIT_COST.read(conn, struct);
                //System.out.println("mSelectM_UNIT_COST:" + list.size());
                if (list.size() == 0) {
                    return "KI00005";
                }

                tempStruct = (KZ0010P001Struct) list.get(0);
                struct.setUNIT_COST_TYP(tempStruct.getUNIT_COST_TYP());
            }
            else {
                // 得値区分 != null or 0
                struct.setUNIT_COST_TYP("2"); // 2:正単価
            }
            //System.out.println("setUNIT_COST_TYP:" + struct.getUNIT_COST_TYP());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 得意先マスタ抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectCust() {
        try {
            list = entity.mSelectM_CUST.read(conn, struct);
            //System.out.println("mSelectM_CUST:" + list.size());
            if (list.size() == 0) {
                return "KI00009";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setCUST_NAME(tempStruct.getCUST_NAME());
            struct.setTAX_CALC_TYP(tempStruct.getTAX_CALC_TYP());
            struct.setTAX_APPLY_TYP(tempStruct.getTAX_APPLY_TYP());
            struct.setTEMP_UNIT_PRICE_SALES_FLG(tempStruct.getTEMP_UNIT_PRICE_SALES_FLG());
            struct.setCLAIM_CYCLE_TYP(tempStruct.getCLAIM_CYCLE_TYP());
            struct.setRM_INP_TYP(tempStruct.getRM_INP_TYP());
            struct.setCUR_CD(tempStruct.getCUR_CD());
            struct.setEXCH_TYP(tempStruct.getEXCH_TYP());
            //struct.setTAX_CD(tempStruct.getTAX_CD());
            struct.setTAX_CD(_taxCd);
            struct.setCUST_VARIOUS_TYP(tempStruct.getCUST_VARIOUS_TYP());
            struct.setSLIP_PRINTING_TYP_1(tempStruct.getSLIP_PRINTING_TYP_1());
            struct.setSLIP_PRINTING_TYP_2(tempStruct.getSLIP_PRINTING_TYP_2());
            struct.setSLIP_PRINTING_TYP_3(tempStruct.getSLIP_PRINTING_TYP_3());
            struct.setSLIP_PRINTING_TYP_4(tempStruct.getSLIP_PRINTING_TYP_4());
            struct.setSLIP_PRINTING_TYP_5(tempStruct.getSLIP_PRINTING_TYP_5());
            struct.setPRICE_RANK_CD(tempStruct.getPRICE_RANK_CD());
            struct.setINSPC_ACPT_TYP(tempStruct.getINSPC_ACPT_TYP());
            //System.out.println("setCUST_NAME:" + struct.getCUST_NAME());
            //System.out.println("setTAX_CALC_TYP:" + struct.getTAX_CALC_TYP());
            //System.out.println("setTAX_APPLY_TYP:" + struct.getTAX_APPLY_TYP());
            //System.out.println("setTEMP_UNIT_PRICE_SALES_FLG:" + struct.getTEMP_UNIT_PRICE_SALES_FLG());
            //System.out.println("setCLAIM_CYCLE_TYP:" + struct.getCLAIM_CYCLE_TYP());
            //System.out.println("setRM_INP_TYP:" + struct.getRM_INP_TYP());
            //System.out.println("setCUR_CD:" + struct.getCUR_CD());
            //System.out.println("setEXCH_TYP:" + struct.getEXCH_TYP());
            //System.out.println("setTAX_CD:" + struct.getTAX_CD());
            //System.out.println("setCUST_VARIOUS_TYP:" + struct.getCUST_VARIOUS_TYP());
            //System.out.println("setSLIP_PRINTING_TYP_1:" + struct.getSLIP_PRINTING_TYP_1());
            //System.out.println("setSLIP_PRINTING_TYP_2:" + struct.getSLIP_PRINTING_TYP_2());
            //System.out.println("setSLIP_PRINTING_TYP_3:" + struct.getSLIP_PRINTING_TYP_3());
            //System.out.println("setSLIP_PRINTING_TYP_4:" + struct.getSLIP_PRINTING_TYP_4());
            //System.out.println("setSLIP_PRINTING_TYP_5:" + struct.getSLIP_PRINTING_TYP_5());
            //System.out.println("setPRICE_RANK_CD:" + struct.getPRICE_RANK_CD());
            //System.out.println("setINSPC_ACPT_TYP:" + struct.getINSPC_ACPT_TYP());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 得意先支店マスタ抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectCustBranch() {
        try {
            list = entity.mSelectM_CUST_BRANCH.read(conn, struct);
            //System.out.println("mSelectM_CUST_BRANCH:" + list.size());
            if (list.size() == 0) {
                return "KI00010";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setSHIP_SLIP_ID(tempStruct.getSHIP_SLIP_ID());
            struct.setCARRIAGE_CHARGE_TYP(tempStruct.getCARRIAGE_CHARGE_TYP());
            //System.out.println("setSHIP_SLIP_ID:" + struct.getSHIP_SLIP_ID());
            //System.out.println("setCARRIAGE_CHARGE_TYP:" + struct.getCARRIAGE_CHARGE_TYP());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 請求得意先抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectClaimCustCtrl() {
        try {
            list = entity.mSelectM_CLAIM_CUST_CTRL.read(conn, struct);
            //System.out.println("mSelectM_CLAIM_CUST_CTRL:" + list.size());
            if (list.size() == 0) {
                return "KI00011";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setBILL_ADDRESSEE_CD(tempStruct.getBILL_ADDRESSEE_CD());
            struct.setSTL_COND_CD(tempStruct.getSTL_COND_CD());
            //System.out.println("setBILL_ADDRESSEE_CD:" + struct.getBILL_ADDRESSEE_CD());
            //System.out.println("setSTL_COND_CD:" + struct.getSTL_COND_CD());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 得意先納品場所抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectCustBase() {
        try {
            list = entity.mSelectM_CUST_BASE.read(conn, struct);
            //System.out.println("mSelectM_CUST_BASE:" + list.size());
            if (list.size() == 0) {
                return "KI00012";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setDLV_LOC_NAME(tempStruct.getDLV_LOC_NAME());
            struct.setZIP_CD(tempStruct.getZIP_CD());
            struct.setADDRESS_1(tempStruct.getADDRESS_1());
            struct.setADDRESS_2(tempStruct.getADDRESS_2());
            //System.out.println("setDLV_LOC_NAME:" + struct.getDLV_LOC_NAME());
            //System.out.println("setZIP_CD:" + struct.getZIP_CD());
            //System.out.println("setADDRESS_1:" + struct.getADDRESS_1());
            //System.out.println("setADDRESS_2:" + struct.getADDRESS_2());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 製品抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectItemSpec() {
        try {
            list = entity.mSelectM_ITEM_SPEC.read(conn, struct);
            //System.out.println("mSelectM_ITEM_SPEC:" + list.size());
            if (list.size() == 0) {
                return "KI00013";
            }

            tempStruct = (KZ0010P001Struct)list.get(0);
            struct.setCUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());
            //System.out.println("setCUST_ITEM_NAME:" + struct.getCUST_ITEM_NAME());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 為替レートマスタ抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectHomeCurCd() {
        String homeCurCd = struct.getHOME_CUR_CD();
        String curCd = struct.getCUR_CD();

        try {
            if ((homeCurCd == null) || (!homeCurCd.equals(curCd))) {
                // 邦貨コード・通貨コード不一致
                list = entity.mSelectM_EXCH_RATE.read(conn, struct);
                //System.out.println("mSelectM_EXCH_RATE:" + list.size());
                if (list.size() == 0) {
                    return "KI00015";
                }

                tempStruct = (KZ0010P001Struct) list.get(0);
                struct.setEXCH_RATE(tempStruct.getEXCH_RATE());
            }
            else {
                struct.setEXCH_RATE("1");
            }
            //System.out.println("setEXCH_RATE:" + struct.getEXCH_RATE());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 品目抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectItem() {
        try {
            list = entity.mSelectM_ITEM.read(conn, struct);
            //System.out.println("mSelectM_ITEM:" + list.size());
            if (list.size() > 0) {
                tempStruct = (KZ0010P001Struct)list.get(0);
                struct.setSPEC(tempStruct.getSPEC());
            }
            else {
                struct.setSPEC("");
            }
            //System.out.println("setSPEC:" + struct.getSPEC());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 売掛金トランヘッダ作成<BR>
     * 売掛金トラン追加<BR>
     *
     * @param  mode 処理モード
     * @return メッセージ番号(正常終了時:0)
     */
    protected String insertArLedgerHTrn(String mode) {
        try {
            // 出荷実績伝票番号
            if (("6".equals(mode)) || ("7".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setSHIP_SLIP_CD(""); // クリア
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード4:受領売上-登録
                // 処理モード9:預託検収I/F
                struct.setSHIP_SLIP_CD(struct.getSLIP_CD()); // 伝票番号
            }

            // 伝票日付・売上日
            if ("4".equals(mode)) {
                // 処理モード4:受領売上-登録
                struct.setSLIP_DATE(struct.getINSPC_ACPT_DATE()); // 受領検収日
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                // 処理モード9:預託検収I/F
                struct.setSLIP_DATE(struct.getSALES_DATE()); // 売上計上日
            }

            // EDIデータ種別
            if ("9".equals(mode)) {
                // 処理モード9:預託検収I/F
                struct.setEDI_DATA_TYP("1"); // 1:EIAJ
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード4:受領売上-登録
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setEDI_DATA_TYP("9"); // 9:EDI対象外
            }

            // 状態区分
            struct.setSTATUS("0"); // 初期値(Not Null)
            if (("4".equals(mode)) || ("6".equals(mode)) ||
                ("7".equals(mode)) || ("9".equals(mode))) {
                // 処理モード4:受領売上-登録
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                // 処理モード9:預託検収I/F
                struct.setSTATUS("20"); // 20:売掛計上予定
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                if ("1".equals(struct.getINSPC_ACPT_TYP())) {
                    // 1:出荷基準
                    struct.setSTATUS("20"); // 20:売掛計上予定
                }
                else if ( ("2".equals(struct.getINSPC_ACPT_TYP())) ||
                         ("3".equals(struct.getINSPC_ACPT_TYP()))) {
                    // 2:受領基準
                    // 3:売り上げ基準
                    struct.setSTATUS("10"); // 10:出荷検収待ち
                }
            }

            // 検収区分
            if (("6".equals(mode)) || ("7".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setINSPC_ACPT_TYP("3"); // 3:売上基準
            }
            else if ("9".equals(mode)) {
                // 処理モード9:預託検収I/F
                struct.setINSPC_ACPT_TYP("1"); // 1:出荷基準
            }

            // 納入No.,納品キー番号
            if ("9".equals(mode)) {
                // 処理モード9:預託検収I/F
                struct.setCUS_DLV_CD(struct.getDLV_CD());
                struct.setCUS_DLV_KEY_CD(struct.getDLV_KEY_CD());
            }

        	// 得意先注文番号
        	if (("6".equals(mode)) || ("7".equals(mode))) {
        		// 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
        	struct.setCUST_ODR_NO(struct.getSALES_CUST_ODR_NO());
        	}
        	
            // クリア
            if (("6".equals(mode)) || ("7".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setDLV_LOC_CD(""); // 納品場所コード
                struct.setDLV_LOC_NAME(""); // 納品場所名
                struct.setZIP_CD(""); // (納品先)郵便番号
                struct.setADDRESS_1(""); // (納品先)住所1
                struct.setADDRESS_2(""); // (納品先)住所2
                struct.setODR_ACPT_DATE(""); // 受注(伝票)日
                struct.setDESINATED_SHIP_DATE(""); // 出荷予定日・出荷指示伝票番号
                struct.setSCDL_DLV_DATE(""); // 納品予定日
                struct.setSHIP_DATE(""); // 出荷実績(伝票)日
                //struct.setCUST_ODR_NO(""); // (得意先)注文番号
                struct.setODR_NO(""); // 受注(伝票)番号
                struct.setSHIP_ODR_NO(""); // 出荷指示(伝票)番号
                struct.setCUS_DLV_CD(""); // 納入番号
                struct.setCUS_DLV_KEY_CD(""); // 納品キー番号
            }
            else if ("9".equals(mode)) {
                // 処理モード9:預託検収I/F
                struct.setODR_NO(""); // 受注(伝票)番号
                struct.setODR_ACPT_DATE(""); // 受注(伝票)日
            }

            // 売掛金トランヘッダ
            entity.mInsertT_AR_LEDGER_H_TRN.create(conn, struct);
            //System.out.println("mInsertT_AR_LEDGER_H_TRN");
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00016";
        }
    }


    /**
     * 売掛金トラン明細作成<BR>
     * 売掛金トラン追加<BR>
     *
     * @param  mode 処理モード
     * @return メッセージ番号(正常終了時:0)
     */
    protected String insertArLedgerTrn(String mode) {
        try {
            String taxCalcTyp = struct.getTAX_CALC_TYP(); // 消費税計算区分

            // 明細作成
            struct.setSEQ_NO("1"); // 明細発生連番
            struct.setLINE_NO("1"); // 行
            struct.setLINE_TYP("1"); // 業種別
            struct.setCOMM_CD(struct.getCUST_ITEM_CD()); // 商品コード(得意先品目番号)
            struct.setINP_UNIT_PRICE(struct.getSALES_UNIT_PRICE()); // 入力単価(売上単価)

            //商品名
            if (("6".equals(mode)) || ("7".equals(mode))) {
                struct.setCOMM_NAME(struct.getITEM_NAME()); // 商品名(得意先品目名称)
            }else{
                struct.setCOMM_NAME(struct.getCUST_ITEM_NAME()); // 商品名(得意先品目名称)
            }
            // 単価区分
            if (("6".equals(mode)) || ("7".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setUNIT_PRICE_TYP("2"); // 2:正単価
            }
            else if ("9".equals(mode)) {
                // 処理モード9:預託検収I/F
                struct.setUNIT_PRICE_TYP(struct.getUNIT_COST_TYP());
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード4:受領売上-登録
                if ( (struct.getSPCL_PRICE_TYP() == null) ||
                    ("0".equals(struct.getSPCL_PRICE_TYP()))) {
                    struct.setUNIT_PRICE_TYP(struct.getUNIT_COST_TYP());
                }
                else {
                    struct.setUNIT_PRICE_TYP("2"); // 2:正単価
                }
            }

            // 売上数・受領検収数
            if ("4".equals(mode)) {
                // 処理モード4:受領売上-登録
                struct.setSLIP_QTY(struct.getINSPC_ACPT_QTY()); // 受領検収数
                struct.setINSPC_ACPT_QTY(struct.getINSPC_ACPT_QTY()); // 受領検収数
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                // 処理モード9:預託検収I/F
                struct.setSLIP_QTY(struct.getSALES_QTY()); // 売上実績数
                struct.setINSPC_ACPT_QTY(struct.getSALES_QTY()); // 売上実績数
            }

            // 分納回数
            if (("6".equals(mode)) || ("7".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setPART_DLV_TIMES("0");
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード4:受領売上-登録
                // 処理モード9:預託検収I/F
                struct.setPART_DLV_TIMES(struct.getPART_DLV_SEQ_NO()); // 分納項番
            }

            // 分納区分
            if (("6".equals(mode)) || ("7".equals(mode)) ||
                ("9".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                // 処理モード9:預託検収I/F
                struct.setPART_DLV_TYP("1"); // 1:分納なし
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード4:受領売上-登録
                if ( ("1".equals(struct.getODR_CMPLT_FLG())) &&
                    ("1".equals(struct.getSHIP_CNT()))) {
                    // 受注完了フラグ=1, 出荷回数=1
                    struct.setPART_DLV_TYP("1"); // 1:分納なし
                }
                else if ( ("1".equals(struct.getODR_CMPLT_FLG())) &&
                         (!"1".equals(struct.getSHIP_CNT()))) {
                    // 受注完了フラグ=1, 出荷回数!=1
                    struct.setPART_DLV_TYP("3"); // 3:完納
                }
                else {
                    struct.setPART_DLV_TYP("2"); // 2:分納あり
                }
            }

            struct.setCUST_COMM_CD(struct.getCUST_ITEM_CD()); // 相手商品コード(得意先品目番号)
            struct.setCUST_COMM_NAME(struct.getCUST_ITEM_NAME()); // 相手商品名(得意先品目名称)
            struct.setCUST_ODR_SLIP_CD(struct.getCUST_ODR_NO()); // 相手注文番号(得意先注文番号)
            struct.setCUST_UNIT_PRICE_TYP("1"); // 相手単価区分(1:確定)
            struct.setINSPC_ACPT_DATE(struct.getSALES_DATE()); // 受領検収日(売上計上日)

            // 税処理
            String exTax = "0";
            String inTax = "0";
            String tax1 = "0";
            String tax2 = "0";
            String tax3 = "0";
            if ("2".equals(taxCalcTyp)) {
                // 伝票単位(消費税明細作成)
                // 税額退避
                exTax = struct.getEXTERNAL_TAX_AMOUNT();
                inTax = struct.getINTERNAL_TAX_AMOUNT();
                tax1 = struct.getTAX_AMOUNT_1();
                tax2 = struct.getTAX_AMOUNT_2();
                tax3 = struct.getTAX_AMOUNT_3();
                // 税額クリア
                struct.setEXTERNAL_TAX_AMOUNT("0"); // 消費税額（外税）
                struct.setINTERNAL_TAX_AMOUNT("0"); // 消費税額（内税）
                struct.setTAX_AMOUNT_1("0");        // 税額１
                struct.setTAX_AMOUNT_2("0");        // 税額２
                struct.setTAX_AMOUNT_3("0");        // 税額３
            }

            struct.setOWN_CUR_SALES_AMOUNT(struct.getSALES_AMOUNT_EXCH_RATES()); // 売上金額(邦貨)(売上実績金額(邦貨))

            // 在庫管理対象フラグ
            if (("6".equals(mode)) || ("7".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setSTOCK_CTRL_FLG("0"); // 0:在庫管理しない
            }
            else {
                // 処理モード1:出荷実績-登録
                // 処理モード3:出荷実績-返品
                // 処理モード4:受領売上-登録
                // 処理モード9:預託検収I/F
                struct.setSTOCK_CTRL_FLG("1"); // 1:在庫管理する
            }

            // クリア
            if (("6".equals(mode)) || ("7".equals(mode))) {
                // 処理モード6:その他売上-登録
                // 処理モード7:その他売上-更新
                struct.setCOMM_CD(""); // 商品コード
                struct.setSPEC(""); // 規格
                struct.setCUST_COMM_CD(""); // 相手商品コード
                struct.setCUST_COMM_NAME(""); // 相手商品名
                struct.setCUST_ODR_SLIP_CD(""); // 相手注文番号
            }

            // 売掛金トラン明細
            entity.mInsertT_AR_LEDGER_TRN.create(conn, struct);
            //System.out.println("mInsertT_AR_LEDGER_TRN-1");

            // 消費税明細作成有無判断
            if ("2".equals(taxCalcTyp)) {
                // 消費税明細作成
                struct.setSEQ_NO("999999"); // 明細発生連番
                struct.setLINE_NO("999999"); // 行
                struct.setLINE_TYP("99"); // 業種別
                struct.setCOMM_CD(""); // 商品コード(クリア)
                struct.setCOMM_NAME(""); // 商品名(クリア)
                struct.setITEM_CD(""); // 品目番号(クリア)
                struct.setSPEC(""); // 規格(クリア)
                struct.setPRICE_RANK_CD(""); // 単価ランク(クリア)
                struct.setINP_UNIT_PRICE("0"); // 入力単価(固定値)
                struct.setUNIT_PRICE_TYP("2"); // 単価区分(固定値)
                struct.setSLIP_QTY("0"); // 売上数(固定値)
                struct.setPART_DLV_TIMES("0"); // 分納回数(固定値)
                struct.setPART_DLV_TYP("0"); // 分納区分(固定値)
                struct.setCUST_COMM_CD(""); // 相手商品コード(クリア)
                struct.setCUST_COMM_NAME(""); // 相手商品名(クリア)
                struct.setCUST_ODR_SLIP_CD(""); // 相手注文番号(クリア)
                struct.setCUST_UNIT_PRICE_TYP("0"); // 相手単価区分(固定値)
                struct.setINSPC_ACPT_DATE(""); // 受領検収日(クリア)
                struct.setINSPC_ACPT_QTY("0"); // 受領検収数(固定値)
                struct.setSALES_AMOUNT("0"); // 売上金額(固定値)

                // 税額格納
                struct.setEXTERNAL_TAX_AMOUNT(exTax); // 消費税額（外税）
                struct.setINTERNAL_TAX_AMOUNT(inTax); // 消費税額（内税）
                struct.setTAX_AMOUNT_1(tax1);         // 税額１
                struct.setTAX_AMOUNT_2(tax2);         // 税額２
                struct.setTAX_AMOUNT_3(tax3);         // 税額３

                // 金額クリア
                struct.setEXTERNAL_TAX_SALES_AMOUNT("0"); // 外税対象金額
                struct.setINTERNAL_TAX_SALES_AMOUNT("0"); // 内税対象金額
                struct.setTAXFREE_SALES_AMOUNT("0");      // 非課税対象金額
                struct.setTAX_CREDIT_SALES_AMOUNT("0");   // 税抜売上金額

                struct.setOWN_CUR_SALES_AMOUNT("0"); // 売上金額(邦貨)(固定値)
                struct.setOWN_CUR_TAXCREDIT_SALES_AMOUNT("0"); // 税抜売上金額(邦貨)(固定値)

                // 売掛金トラン明細
                entity.mInsertT_AR_LEDGER_TRN.create(conn, struct);
                //System.out.println("mInsertT_AR_LEDGER_TRN-2");
            }

            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00017";
        }
    }

    /**
     * 売掛金トランヘッダ存在チェック<BR>
     * 処理モード2:出荷実績-取消
     * 処理モード3:出荷実績-返品
     * 処理モード5:受領売上-取消
     * 処理モード7:その他売上-更新
     * 処理モード8:その他売上-削除
     *
     * @return 存在有無
     */
    protected boolean isSelectArLedgerHTrn() {
        try {
            list = entity.mSelectT_AR_LEDGER_H_TRN.read(conn, struct);
            //System.out.println("mSelectT_AR_LEDGER_H_TRN:" + list.size());
            if (list.size() > 0) {
                return true; // 存在
            }
            else {
                return false; // 未存在
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    /**
     * 売掛金トランヘッダ削除<BR>
     * 売掛金トラン削除<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String deleteArLedgerHTrn() {
        try {
            int ret = entity.mDeleteT_AR_LEDGER_H_TRN.delete(conn, struct);
            //System.out.println("mDeleteT_AR_LEDGER_H_TRN:" + ret);
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00018";
        }
    }

    /**
     * 売掛金トラン明細削除<BR>
     * 売掛金トラン削除<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String deleteArLedgerTrn() {
        try {
            int ret = entity.mDeleteT_AR_LEDGER_TRN.delete(conn, struct);
            //System.out.println("mDeleteT_AR_LEDGER_TRN:" + ret);
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00019";
        }
    }

    /**
     * 売掛金トラン元帳ヘッダ赤伝更新<BR>
     * 売掛金トラン赤伝追加・更新<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String updateArLedgerH() {
        try {
            int ret = entity.mUpdateT_AR_LEDGER_H.update(conn, struct);
            //System.out.println("mUpdateT_AR_LEDGER_H:" + ret);
            if (ret == 0) {
                return "KI00020";
            }
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00021";
        }
    }

    /**
     * 売掛金トランヘッダ赤伝追加<BR>
     * 売掛金トラン赤伝追加・更新<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String insertIntoeArLedgerHTrn() {
        try {
            beginTransaction();
            struct.setSYSTEMDATE(struct.getsSysdate());
            struct.setSYSTEMUSER(struct.getsUser_ID());
            struct.setPROGRAMID("KZ0010P001");
            ////System.out.println("1:" + struct.getSYSTEMDATE());
            ////System.out.println("2:" + struct.getSYSTEMUSER());
            ////System.out.println("3:" + struct.getPROGRAMID());

            entity.mInsertIntoT_AR_LEDGER_H_TRN.create(conn, struct);
            //System.out.println("mInsertIntoT_AR_LEDGER_H_TRN");
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00016";
        }
    }

    /**
     * 売掛金トラン明細赤伝追加<BR>
     * 売掛金トラン赤伝追加・更新<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String insertIntoeArLedgerTrn() {
        try {
            list = entity.mSelectT_AR_LEDGER.read(conn, struct);
            //System.out.println("mSelectT_AR_LEDGER:" + list.size());
            if (list.size() == 0) {
                return "KI00024";
            }

            entity.mInsertIntoT_AR_LEDGER_TRN.create(conn, struct);
            //System.out.println("mInsertIntoT_AR_LEDGER_TRN");
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00017";
        }
    }

    /**
     * 売掛金トランヘッダ更新<BR>
     * 売掛金トラン更新<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String updateArLedgerHTrn() {
        try {
            struct.setSTATUS("10"); // 状態区分 (10:出荷検収待ち)

            int ret = entity.mUpdateT_AR_LEDGER_H_TRN.update(conn, struct);
            //System.out.println("mUpdateT_AR_LEDGER_H_TRN:" + ret);
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00017";
        }
    }

    /**
     * 売掛金トランヘッダ黒伝追加<BR>
     * 売掛金トラン黒伝追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String insertIntoeArLedgerHTrn2() {
        try {
            beginTransaction();
            struct.setSYSTEMDATE(struct.getsSysdate());
            struct.setSYSTEMUSER(struct.getsUser_ID());
            struct.setPROGRAMID("KZ0010P001");

            entity.mInsertIntoT_AR_LEDGER_H_TRN2.create(conn, struct);
            //System.out.println("mInsertIntoT_AR_LEDGER_H_TRN2");
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00016";
        }
    }

    /**
     * 売掛金トラン明細黒伝追加<BR>
     * 売掛金トラン黒伝追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String insertIntoeArLedgerTrn2() {
        try {
            entity.mInsertIntoT_AR_LEDGER_TRN2.create(conn, struct);
            //System.out.println("mInsertIntoT_AR_LEDGER_TRN2");
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "KI00017";
        }
    }

    /**
     * 検収情報IF抽出<BR>
     * 売掛金トラン追加<BR>
     *
     * @return メッセージ番号(正常終了時:0)
     */
    protected String selectInspcAcptInfoIf() {
        try {
            list = entity.mSelectT_INSPC_ACPT_INFO_IF.read(conn, struct);
            //System.out.println("mSelectT_INSPC_ACPT_INFO_IF:" + list.size());
            if (list.size() == 1) {
                // 1件検出
                tempStruct = (KZ0010P001Struct)list.get(0);
                struct.setDLV_CD(tempStruct.getDLV_CD());
                struct.setDLV_KEY_CD(tempStruct.getDLV_KEY_CD());
            }
            else {
                // 該当レコードなし or 複数件検出
                struct.setDLV_CD("");
                struct.setDLV_KEY_CD("");
            }

            //System.out.println("setDLV_CD:" + struct.getDLV_CD());
            //System.out.println("setDLV_KEY_CD:" + struct.getDLV_KEY_CD());
            return "0";
        }
        catch (Exception e) {
            e.printStackTrace();
            return "ZZ01106";
        }
    }

    /**
     * 消費税計算処理
     * 売掛金トラン追加<BR>
     */
    protected void calculateTax(String mode) {
        // 初期処理
        String taxCalcTyp = struct.getTAX_CALC_TYP(); // 消費税計算区分
        String taxCd = null; // 消費税コード
        if("6".equals(mode) || "7".equals(mode)){
        	taxCd = struct.getTAX_CD();      
        //--Add Start 20131223 qian-lf	
        }else if ("1".equals(mode) || "3".equals(mode) || "4".equals(mode)) {
        	taxCd = struct.getT_ODR_TAX_CD();
        //--Add End 20131223 qian-lf
        }else{
            if("2".equals(struct.getTAX_APPLY_TYP())){
            	//得意先.消費税コード
            	taxCd = struct.getTAX_CD(); // 消費税コード
            }else if("1".equals(struct.getTAX_APPLY_TYP())){
            	//製品.消費税コード
            	try {
            	  list = entity.mSelectM_ITEM_SPEC.read(conn, struct);
            	  taxCd = ((KZ0010P001Struct)list.get(0)).getTAX_CD();
            	}catch (Exception e) {
                  e.printStackTrace();
                }
            }
        }

        String balanceClassCd = struct.getBALANCE_CLASS_CD(); // 残高分類コード
        String amount = struct.getSALES_AMOUNT(); // 売上実績金額
        String taxDate = struct.getSALES_DATE(); // 売上計上日

        //System.out.println("税計算処理開始");
        //System.out.println("taxCalcTyp:" + taxCalcTyp);
        //System.out.println("taxCd:" + taxCd);
        //System.out.println("balanceClassCd:" + balanceClassCd);
        //System.out.println("amount:" + amount);
        //System.out.println("taxDate:" + taxDate);

        // 金額
        if ((amount == null) || (amount.length() == 0)) {
            amount = "0";
        }

        // 消費税計算区分判断
        if ("99".equals(balanceClassCd)) {
            // 残高分類コード = "99"
            taxCalcTyp = "0"; // 税計算無し
        }
        else if ((taxCalcTyp == null) || (taxCalcTyp.length() == 0)) {
            // 消費税計算区分未設定
            taxCalcTyp = "0"; // 税計算無し
        }
        else if ((!"1".equals(taxCalcTyp)) && (!"2".equals(taxCalcTyp)) &&
                 (!"3".equals(taxCalcTyp))) {
            // 消費税計算区分誤設定
            taxCalcTyp = "0"; // 税計算無し
        }

        // 課税方法
        String taxCd2 = "";
        if ((taxCd == null) || (taxCd.length() < 3)) {
            // 消費税コード３桁未満
            taxCalcTyp = "0"; // 税計算無し
        }
        else {
            taxCd2 = taxCd.substring(2, 3);
            ////System.out.println("test1:" + taxCd.substring(0, 1));
            ////System.out.println("test2:" + taxCd.substring(1, 2));
            ////System.out.println("test3:" + taxCd.substring(2, 3));
        }
        struct.setTAX_CD_2(taxCd2);

        // 税率取得
        String taxRate1 = "0"; // 税率１
        String taxRate2 = "0"; // 税率２
        String taxRate3 = "0"; // 税率３
        String roundTyp = "1"; // 端数処理区分
        int roundTyp2 = BigDecimal.ROUND_HALF_UP; // 単数処理区分 (BigDecimal)
        try {
        	struct.setTAX_CD(taxCd);
            list = entity.mSelectM_TAX.read(conn, struct);
            //System.out.println("mSelectM_TAX:" + list.size());
            if (list.size() > 0) {
                tempStruct = (KZ0010P001Struct) list.get(0);
                String newTaxDate = tempStruct.getNEW_TAX_RATE_START_DATE(); // 新消費税コード開始日
                ////System.out.println("2004/05/01:2004/05/02:" + "2004/05/01".compareTo("2004/05/02"));
                ////System.out.println("2004/05/01:2004/05/01:" + "2004/05/01".compareTo("2004/05/01"));
                ////System.out.println("2004/05/01:2004/04/30:" + "2004/05/01".compareTo("2004/04/30"));

                if ((taxDate != null) && (taxDate.compareTo(newTaxDate) < 0)) {
                    // 旧税率適用
                    taxRate1 = tempStruct.getOLD_TAX_RATE_1();
                    taxRate2 = tempStruct.getOLD_TAX_RATE_2();
                    taxRate3 = tempStruct.getOLD_TAX_RATE_3();
                }
                else {
                    // 新税率適用
                    taxRate1 = tempStruct.getNEW_TAX_RATE_1();
                    taxRate2 = tempStruct.getNEW_TAX_RATE_2();
                    taxRate3 = tempStruct.getNEW_TAX_RATE_3();
                }
                roundTyp = tempStruct.getROUND_TYP();
            }
            //System.out.println("taxRate1:" + taxRate1);
            //System.out.println("taxRate2:" + taxRate2);
            //System.out.println("taxRate3:" + taxRate3);
            //System.out.println("roundTyp:" + roundTyp);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        // 単数処理区分 (BigDecimal)
        if ("2".equals(roundTyp)) {
            // 切り上げ
            roundTyp2 = BigDecimal.ROUND_UP;
        }
        else if ("3".equals(roundTyp)) {
            // 切捨て
            roundTyp2 = BigDecimal.ROUND_DOWN;
        }

        // 通貨有効桁数 (小数点以下)
        String decimalFig = "0";
        int decimalFig2 = 0;
        try {
            list = entity.mSelectM_CUR.read(conn, struct);
            //System.out.println("mSelectM_CUR:" + list.size());
            if (list.size() > 0) {
                tempStruct = (KZ0010P001Struct) list.get(0);
                decimalFig = tempStruct.getDECIMAL_FIG();
            }
            //System.out.println("decimalFig:" + decimalFig);
            decimalFig2 = Integer.parseInt(decimalFig);
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // 初期値 (無税値)
        struct.setEXTERNAL_TAX_SALES_AMOUNT("0");  // 外税対象金額
        struct.setINTERNAL_TAX_SALES_AMOUNT("0");  // 内税対象金額
        struct.setTAXFREE_SALES_AMOUNT(amount);    // 非課税対象金額
        struct.setTAX_CREDIT_SALES_AMOUNT(amount); // 税抜売上金額
        struct.setEXTERNAL_TAX_AMOUNT("0");        // 消費税額（外税）
        struct.setINTERNAL_TAX_AMOUNT("0");        // 消費税額（内税）
        struct.setTAX_AMOUNT_1("0");               // 税額１
        struct.setTAX_AMOUNT_2("0");               // 税額２
        struct.setTAX_AMOUNT_3("0");               // 税額３

        if ("0".equals(taxCalcTyp)) {
            // 無税
        }
        else if ("1".equals(taxCalcTyp)) {
            // 明細単位計算
            if ("1".equals(taxCd2)) {
                // 課税方法:1 (外税)
                struct.setEXTERNAL_TAX_SALES_AMOUNT(amount); // 外税対象金額
                struct.setTAXFREE_SALES_AMOUNT("0");         // 非課税対象金額
                // 外税計算
                String tax1 = exTax(amount, taxRate1, decimalFig2, roundTyp2);
                String tax2 = exTax(amount, taxRate2, decimalFig2, roundTyp2);
                String tax3 = exTax(amount, taxRate3, decimalFig2, roundTyp2);
                String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
                struct.setTAX_AMOUNT_1(tax1); // 税額１
                struct.setTAX_AMOUNT_2(tax2); // 税額２
                struct.setTAX_AMOUNT_3(tax3); // 税額３
                struct.setEXTERNAL_TAX_AMOUNT(tax); // 消費税額（外税）
            }
            else if (("5".equals(taxCd2)) || ("9".equals(taxCd2)))  {
                // 課税方法:5 or 9 (内税)
                struct.setINTERNAL_TAX_SALES_AMOUNT(amount); // 内税対象金額
                struct.setTAXFREE_SALES_AMOUNT("0");         // 非課税対象金額
                // 内税計算
                String tax1 = inTax(amount, taxRate1, decimalFig2, roundTyp2);
                String tax2 = inTax(amount, taxRate2, decimalFig2, roundTyp2);
                String tax3 = inTax(amount, taxRate3, decimalFig2, roundTyp2);
                String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
                struct.setTAX_AMOUNT_1(tax1); // 税額１
                struct.setTAX_AMOUNT_2(tax2); // 税額２
                struct.setTAX_AMOUNT_3(tax3); // 税額３
                struct.setINTERNAL_TAX_AMOUNT(tax); // 消費税額（内税）
                struct.setTAX_CREDIT_SALES_AMOUNT(Calculate.subtract (amount, tax)); // 税抜売上金額
            }
        }
        else if ("2".equals(taxCalcTyp)) {
            // 伝票単位計算
            if ("1".equals(taxCd2)) {
                // 課税方法:1 (外税)
                struct.setEXTERNAL_TAX_SALES_AMOUNT(amount); // 外税対象金額
                struct.setTAXFREE_SALES_AMOUNT("0");         // 非課税対象金額
                // 外税計算
                String tax1 = exTax(amount, taxRate1, decimalFig2, roundTyp2);
                String tax2 = exTax(amount, taxRate2, decimalFig2, roundTyp2);
                String tax3 = exTax(amount, taxRate3, decimalFig2, roundTyp2);
                String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
                struct.setTAX_AMOUNT_1(tax1); // 税額１
                struct.setTAX_AMOUNT_2(tax2); // 税額２
                struct.setTAX_AMOUNT_3(tax3); // 税額３
                struct.setEXTERNAL_TAX_AMOUNT(tax); // 消費税額（外税）
            }
            else if (("5".equals(taxCd2)) || ("9".equals(taxCd2)))  {
                // 課税方法:5 or 9 (内税)
                struct.setINTERNAL_TAX_SALES_AMOUNT(amount); // 内税対象金額
                struct.setTAXFREE_SALES_AMOUNT("0");         // 非課税対象金額
                // 内税計算
                String tax1 = inTax(amount, taxRate1, decimalFig2, roundTyp2);
                String tax2 = inTax(amount, taxRate2, decimalFig2, roundTyp2);
                String tax3 = inTax(amount, taxRate3, decimalFig2, roundTyp2);
                String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
                struct.setTAX_AMOUNT_1(tax1); // 税額１
                struct.setTAX_AMOUNT_2(tax2); // 税額２
                struct.setTAX_AMOUNT_3(tax3); // 税額３
                struct.setINTERNAL_TAX_AMOUNT(tax); // 消費税額（内税）
                struct.setTAX_CREDIT_SALES_AMOUNT(Calculate.subtract (amount, tax)); // 税抜売上金額
            }
        }
        else if ("3".equals(taxCalcTyp)) {
            // 請求単位計算
            if ("1".equals(taxCd2)) {
                // 課税方法:1 (外税)
                struct.setEXTERNAL_TAX_SALES_AMOUNT(amount); // 外税対象金額
                struct.setTAXFREE_SALES_AMOUNT("0");         // 非課税対象金額
            }
            else if (("5".equals(taxCd2)) || ("9".equals(taxCd2)))  {
                // 課税方法:5 or 9 (内税)
                struct.setINTERNAL_TAX_SALES_AMOUNT(amount); // 内税対象金額
                struct.setTAXFREE_SALES_AMOUNT("0");         // 非課税対象金額
                // 内税計算
                String tax1 = inTax(amount, taxRate1, decimalFig2, roundTyp2);
                String tax2 = inTax(amount, taxRate2, decimalFig2, roundTyp2);
                String tax3 = inTax(amount, taxRate3, decimalFig2, roundTyp2);
                String tax = Calculate.add(Calculate.add(tax1, tax2), tax3);
                struct.setTAX_CREDIT_SALES_AMOUNT(Calculate.subtract (amount, tax)); // 税抜売上金額
            }
        }

        //System.out.println("setEXTERNAL_TAX_SALES_AMOUNT:" + struct.getEXTERNAL_TAX_SALES_AMOUNT()); // 外税対象金額
        //System.out.println("setINTERNAL_TAX_SALES_AMOUNT:" + struct.getINTERNAL_TAX_SALES_AMOUNT()); // 内税対象金額
        //System.out.println("setTAXFREE_SALES_AMOUNT:" + struct.getTAXFREE_SALES_AMOUNT()); // 非課税対象金額
        //System.out.println("setTAX_CREDIT_SALES_AMOUNT:" + struct.getTAX_CREDIT_SALES_AMOUNT()); // 税抜売上金額
        //System.out.println("setEXTERNAL_TAX_AMOUNT:" + struct.getEXTERNAL_TAX_AMOUNT()); // 消費税額（外税）
        //System.out.println("setINTERNAL_TAX_AMOUNT:" + struct.getINTERNAL_TAX_AMOUNT()); // 消費税額（内税）
        //System.out.println("setTAX_AMOUNT_1:" + struct.getTAX_AMOUNT_1()); // 税額１
        //System.out.println("setTAX_AMOUNT_2:" + struct.getTAX_AMOUNT_2()); // 税額２
        //System.out.println("setTAX_AMOUNT_3:" + struct.getTAX_AMOUNT_3()); // 税額３
        return;
    }

    /**
     * 外税計算 (演算クラス使用)
     *
     * @param amount     金額
     * @param taxRate    税率
     * @param decimalFig 有効桁数(小数点以下)
     * @param roundTyp   丸めタイプ
     *
     * @return 税額
     */
    private String exTax(String amount, String taxRate,
                         int decimalFig, int roundTyp) {
        return Calculate.divide(Calculate.multiply(amount, taxRate),
                                "100", decimalFig, roundTyp);
    }

    /**
     * 内税計算 (演算クラス使用)
     *
     * @param amount     金額
     * @param taxRate    税率
     * @param decimalFig 有効桁数(小数点以下)
     * @param roundTyp   丸めタイプ
     *
     * @return 税額
     */
    private String inTax(String amount, String taxRate,
                         int decimalFig, int roundTyp) {
        return Calculate.divide(
            Calculate.multiply(amount, taxRate),
            Calculate.add("100", taxRate), decimalFig, roundTyp);
    }








        //}}user_implement_code_main

	//////////////////////////////


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KZ0010");
		logger.entering("KZ0010P001Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KZ0010P001Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KZ0010");
		logger.entering("KZ0010P001Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
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
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KZ0010P001Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KZ0010");
		logger.entering("KZ0010P001Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KZ0010P001Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("initial") ) {
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
//			throw new FoundationException("KZ0010P001Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KZ0010P001-E999","CSVの出力処理"));
			throw new FoundationException("KZ0010P001Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KZ0010P001-E999","システム日付の取得処理"));
				throw new FoundationException("KZ0010P001Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KZ0010P001-E999","コントロールのイベント処理"));
			throw new FoundationException("KZ0010P001Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KZ0010P001Entity entity;
	protected KZ0010P001Struct struct;
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

		entity = new KZ0010P001Entity();
		struct = new KZ0010P001Struct();

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
	 * KZ0010P001クラスの標準コンストラクタ
	 */
	public KZ0010P001Control() throws BusinessProcessException, FoundationException
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
				KZ0010P001Struct key = (KZ0010P001Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP") && key.getSLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("SLIP_CTRL_GRP", key.getSLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TRN_CD") && key.getSLIP_TRN_CD() != null) {
					msgKey.setKeyValue("SLIP_TRN_CD", key.getSLIP_TRN_CD());
				}
				if(msgKeyType.containsKeyColumn("STOCK_CLASS_CD") && key.getSTOCK_CLASS_CD() != null) {
					msgKey.setKeyValue("STOCK_CLASS_CD", key.getSTOCK_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("BALANCE_CLASS_CD") && key.getBALANCE_CLASS_CD() != null) {
					msgKey.setKeyValue("BALANCE_CLASS_CD", key.getBALANCE_CLASS_CD());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_CUST_ODR_NO") && key.getSALES_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("SALES_CUST_ODR_NO", key.getSALES_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES") && key.getSALES_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_EXCH_RATES", key.getSALES_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_DATE") && key.getSHIP_DATE() != null) {
					msgKey.setKeyValue("SHIP_DATE", key.getSHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO") && key.getPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("PART_DLV_SEQ_NO", key.getPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_NO") && key.getSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("SHIP_ODR_NO", key.getSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_INFO_IF_CTRL_NO") && key.getINSPC_ACPT_INFO_IF_CTRL_NO() != null) {
					msgKey.setKeyValue("INSPC_ACPT_INFO_IF_CTRL_NO", key.getINSPC_ACPT_INFO_IF_CTRL_NO());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE") && key.getDESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_DATE", key.getDESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SCDL_DLV_DATE") && key.getSCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("SCDL_DLV_DATE", key.getSCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE") && key.getODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("ODR_ACPT_DATE", key.getODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_CD") && key.getCUS_DLV_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_CD", key.getCUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD") && key.getCUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("CUS_DLV_KEY_CD", key.getCUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP") && key.getSPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("SPCL_PRICE_TYP", key.getSPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("SHIP_CNT") && key.getSHIP_CNT() != null) {
					msgKey.setKeyValue("SHIP_CNT", key.getSHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("T_ODR_TAX_CD") && key.getT_ODR_TAX_CD() != null) {
					msgKey.setKeyValue("T_ODR_TAX_CD", key.getT_ODR_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_UNIT_PRICE_SALES_FLG") && key.getTEMP_UNIT_PRICE_SALES_FLG() != null) {
					msgKey.setKeyValue("TEMP_UNIT_PRICE_SALES_FLG", key.getTEMP_UNIT_PRICE_SALES_FLG());
				}
				if(msgKeyType.containsKeyColumn("CLAIM_CYCLE_TYP") && key.getCLAIM_CYCLE_TYP() != null) {
					msgKey.setKeyValue("CLAIM_CYCLE_TYP", key.getCLAIM_CYCLE_TYP());
				}
				if(msgKeyType.containsKeyColumn("RM_INP_TYP") && key.getRM_INP_TYP() != null) {
					msgKey.setKeyValue("RM_INP_TYP", key.getRM_INP_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_VARIOUS_TYP") && key.getCUST_VARIOUS_TYP() != null) {
					msgKey.setKeyValue("CUST_VARIOUS_TYP", key.getCUST_VARIOUS_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_1") && key.getSLIP_PRINTING_TYP_1() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_1", key.getSLIP_PRINTING_TYP_1());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_2") && key.getSLIP_PRINTING_TYP_2() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_2", key.getSLIP_PRINTING_TYP_2());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_3") && key.getSLIP_PRINTING_TYP_3() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_3", key.getSLIP_PRINTING_TYP_3());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_4") && key.getSLIP_PRINTING_TYP_4() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_4", key.getSLIP_PRINTING_TYP_4());
				}
				if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_5") && key.getSLIP_PRINTING_TYP_5() != null) {
					msgKey.setKeyValue("SLIP_PRINTING_TYP_5", key.getSLIP_PRINTING_TYP_5());
				}
				if(msgKeyType.containsKeyColumn("PRICE_RANK_CD") && key.getPRICE_RANK_CD() != null) {
					msgKey.setKeyValue("PRICE_RANK_CD", key.getPRICE_RANK_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SHIP_SLIP_ID") && key.getSHIP_SLIP_ID() != null) {
					msgKey.setKeyValue("SHIP_SLIP_ID", key.getSHIP_SLIP_ID());
				}
				if(msgKeyType.containsKeyColumn("CARRIAGE_CHARGE_TYP") && key.getCARRIAGE_CHARGE_TYP() != null) {
					msgKey.setKeyValue("CARRIAGE_CHARGE_TYP", key.getCARRIAGE_CHARGE_TYP());
				}
				if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD") && key.getBILL_ADDRESSEE_CD() != null) {
					msgKey.setKeyValue("BILL_ADDRESSEE_CD", key.getBILL_ADDRESSEE_CD());
				}
				if(msgKeyType.containsKeyColumn("STL_COND_CD") && key.getSTL_COND_CD() != null) {
					msgKey.setKeyValue("STL_COND_CD", key.getSTL_COND_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("ZIP_CD") && key.getZIP_CD() != null) {
					msgKey.setKeyValue("ZIP_CD", key.getZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_1") && key.getADDRESS_1() != null) {
					msgKey.setKeyValue("ADDRESS_1", key.getADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_2") && key.getADDRESS_2() != null) {
					msgKey.setKeyValue("ADDRESS_2", key.getADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_DATE") && key.getSLIP_DATE() != null) {
					msgKey.setKeyValue("SLIP_DATE", key.getSLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_SLIP_CD") && key.getSHIP_SLIP_CD() != null) {
					msgKey.setKeyValue("SHIP_SLIP_CD", key.getSHIP_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT") && key.getEXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_SALES_AMOUNT", key.getEXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT") && key.getINTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_SALES_AMOUNT", key.getINTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT") && key.getTAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAXFREE_SALES_AMOUNT", key.getTAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT") && key.getTAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_CREDIT_SALES_AMOUNT", key.getTAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT") && key.getEXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("EXTERNAL_TAX_AMOUNT", key.getEXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT") && key.getINTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("INTERNAL_TAX_AMOUNT", key.getINTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("EDI_DATA_TYP") && key.getEDI_DATA_TYP() != null) {
					msgKey.setKeyValue("EDI_DATA_TYP", key.getEDI_DATA_TYP());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1") && key.getOLD_TAX_RATE_1() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_1", key.getOLD_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2") && key.getOLD_TAX_RATE_2() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_2", key.getOLD_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3") && key.getOLD_TAX_RATE_3() != null) {
					msgKey.setKeyValue("OLD_TAX_RATE_3", key.getOLD_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE") && key.getNEW_TAX_RATE_START_DATE() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_START_DATE", key.getNEW_TAX_RATE_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1") && key.getNEW_TAX_RATE_1() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_1", key.getNEW_TAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2") && key.getNEW_TAX_RATE_2() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_2", key.getNEW_TAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3") && key.getNEW_TAX_RATE_3() != null) {
					msgKey.setKeyValue("NEW_TAX_RATE_3", key.getNEW_TAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("LINE_NO") && key.getLINE_NO() != null) {
					msgKey.setKeyValue("LINE_NO", key.getLINE_NO());
				}
				if(msgKeyType.containsKeyColumn("LINE_TYP") && key.getLINE_TYP() != null) {
					msgKey.setKeyValue("LINE_TYP", key.getLINE_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMM_CD") && key.getCOMM_CD() != null) {
					msgKey.setKeyValue("COMM_CD", key.getCOMM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMM_NAME") && key.getCOMM_NAME() != null) {
					msgKey.setKeyValue("COMM_NAME", key.getCOMM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD_2") && key.getTAX_CD_2() != null) {
					msgKey.setKeyValue("TAX_CD_2", key.getTAX_CD_2());
				}
				if(msgKeyType.containsKeyColumn("INP_UNIT_PRICE") && key.getINP_UNIT_PRICE() != null) {
					msgKey.setKeyValue("INP_UNIT_PRICE", key.getINP_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("UNIT_PRICE_TYP") && key.getUNIT_PRICE_TYP() != null) {
					msgKey.setKeyValue("UNIT_PRICE_TYP", key.getUNIT_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_QTY") && key.getSLIP_QTY() != null) {
					msgKey.setKeyValue("SLIP_QTY", key.getSLIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_TIMES") && key.getPART_DLV_TIMES() != null) {
					msgKey.setKeyValue("PART_DLV_TIMES", key.getPART_DLV_TIMES());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_TYP") && key.getPART_DLV_TYP() != null) {
					msgKey.setKeyValue("PART_DLV_TYP", key.getPART_DLV_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUST_COMM_CD") && key.getCUST_COMM_CD() != null) {
					msgKey.setKeyValue("CUST_COMM_CD", key.getCUST_COMM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_COMM_NAME") && key.getCUST_COMM_NAME() != null) {
					msgKey.setKeyValue("CUST_COMM_NAME", key.getCUST_COMM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_SLIP_CD") && key.getCUST_ODR_SLIP_CD() != null) {
					msgKey.setKeyValue("CUST_ODR_SLIP_CD", key.getCUST_ODR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_UNIT_PRICE_TYP") && key.getCUST_UNIT_PRICE_TYP() != null) {
					msgKey.setKeyValue("CUST_UNIT_PRICE_TYP", key.getCUST_UNIT_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_SALES_AMOUNT") && key.getOWN_CUR_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_SALES_AMOUNT", key.getOWN_CUR_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG") && key.getSTOCK_CTRL_FLG() != null) {
					msgKey.setKeyValue("STOCK_CTRL_FLG", key.getSTOCK_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("DUMMY") && key.getDUMMY() != null) {
					msgKey.setKeyValue("DUMMY", key.getDUMMY());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD2") && key.getSLIP_CD2() != null) {
					msgKey.setKeyValue("SLIP_CD2", key.getSLIP_CD2());
				}
				if(msgKeyType.containsKeyColumn("SYSTEMDATE") && key.getSYSTEMDATE() != null) {
					msgKey.setKeyValue("SYSTEMDATE", key.getSYSTEMDATE());
				}
				if(msgKeyType.containsKeyColumn("SYSTEMUSER") && key.getSYSTEMUSER() != null) {
					msgKey.setKeyValue("SYSTEMUSER", key.getSYSTEMUSER());
				}
				if(msgKeyType.containsKeyColumn("PROGRAMID") && key.getPROGRAMID() != null) {
					msgKey.setKeyValue("PROGRAMID", key.getPROGRAMID());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_KEY_CD") && key.getDLV_KEY_CD() != null) {
					msgKey.setKeyValue("DLV_KEY_CD", key.getDLV_KEY_CD());
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
					KZ0010P001Struct key = new KZ0010P001Struct();
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP")) {
						key.setSLIP_CTRL_GRP(msgKey.getKeyValue("SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TRN_CD")) {
						key.setSLIP_TRN_CD(msgKey.getKeyValue("SLIP_TRN_CD"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_CLASS_CD")) {
						key.setSTOCK_CLASS_CD(msgKey.getKeyValue("STOCK_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("BALANCE_CLASS_CD")) {
						key.setBALANCE_CLASS_CD(msgKey.getKeyValue("BALANCE_CLASS_CD"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_CUST_ODR_NO")) {
						key.setSALES_CUST_ODR_NO(msgKey.getKeyValue("SALES_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_EXCH_RATES")) {
						key.setSALES_AMOUNT_EXCH_RATES(msgKey.getKeyValue("SALES_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_DATE")) {
						key.setSHIP_DATE(msgKey.getKeyValue("SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO")) {
						key.setPART_DLV_SEQ_NO(msgKey.getKeyValue("PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_NO")) {
						key.setSHIP_ODR_NO(msgKey.getKeyValue("SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_INFO_IF_CTRL_NO")) {
						key.setINSPC_ACPT_INFO_IF_CTRL_NO(msgKey.getKeyValue("INSPC_ACPT_INFO_IF_CTRL_NO"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE")) {
						key.setDESINATED_SHIP_DATE(msgKey.getKeyValue("DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_DLV_DATE")) {
						key.setSCDL_DLV_DATE(msgKey.getKeyValue("SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_DATE")) {
						key.setODR_ACPT_DATE(msgKey.getKeyValue("ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_CD")) {
						key.setCUS_DLV_CD(msgKey.getKeyValue("CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUS_DLV_KEY_CD")) {
						key.setCUS_DLV_KEY_CD(msgKey.getKeyValue("CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_TYP")) {
						key.setSPCL_PRICE_TYP(msgKey.getKeyValue("SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_CNT")) {
						key.setSHIP_CNT(msgKey.getKeyValue("SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("T_ODR_TAX_CD")) {
						key.setT_ODR_TAX_CD(msgKey.getKeyValue("T_ODR_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_UNIT_PRICE_SALES_FLG")) {
						key.setTEMP_UNIT_PRICE_SALES_FLG(msgKey.getKeyValue("TEMP_UNIT_PRICE_SALES_FLG"));
					}
					if(msgKeyType.containsKeyColumn("CLAIM_CYCLE_TYP")) {
						key.setCLAIM_CYCLE_TYP(msgKey.getKeyValue("CLAIM_CYCLE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("RM_INP_TYP")) {
						key.setRM_INP_TYP(msgKey.getKeyValue("RM_INP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_VARIOUS_TYP")) {
						key.setCUST_VARIOUS_TYP(msgKey.getKeyValue("CUST_VARIOUS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_1")) {
						key.setSLIP_PRINTING_TYP_1(msgKey.getKeyValue("SLIP_PRINTING_TYP_1"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_2")) {
						key.setSLIP_PRINTING_TYP_2(msgKey.getKeyValue("SLIP_PRINTING_TYP_2"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_3")) {
						key.setSLIP_PRINTING_TYP_3(msgKey.getKeyValue("SLIP_PRINTING_TYP_3"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_4")) {
						key.setSLIP_PRINTING_TYP_4(msgKey.getKeyValue("SLIP_PRINTING_TYP_4"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_PRINTING_TYP_5")) {
						key.setSLIP_PRINTING_TYP_5(msgKey.getKeyValue("SLIP_PRINTING_TYP_5"));
					}
					if(msgKeyType.containsKeyColumn("PRICE_RANK_CD")) {
						key.setPRICE_RANK_CD(msgKey.getKeyValue("PRICE_RANK_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_SLIP_ID")) {
						key.setSHIP_SLIP_ID(msgKey.getKeyValue("SHIP_SLIP_ID"));
					}
					if(msgKeyType.containsKeyColumn("CARRIAGE_CHARGE_TYP")) {
						key.setCARRIAGE_CHARGE_TYP(msgKey.getKeyValue("CARRIAGE_CHARGE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("BILL_ADDRESSEE_CD")) {
						key.setBILL_ADDRESSEE_CD(msgKey.getKeyValue("BILL_ADDRESSEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("STL_COND_CD")) {
						key.setSTL_COND_CD(msgKey.getKeyValue("STL_COND_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ZIP_CD")) {
						key.setZIP_CD(msgKey.getKeyValue("ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_1")) {
						key.setADDRESS_1(msgKey.getKeyValue("ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_2")) {
						key.setADDRESS_2(msgKey.getKeyValue("ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_DATE")) {
						key.setSLIP_DATE(msgKey.getKeyValue("SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_SLIP_CD")) {
						key.setSHIP_SLIP_CD(msgKey.getKeyValue("SHIP_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setEXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_SALES_AMOUNT")) {
						key.setINTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAXFREE_SALES_AMOUNT")) {
						key.setTAXFREE_SALES_AMOUNT(msgKey.getKeyValue("TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CREDIT_SALES_AMOUNT")) {
						key.setTAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXTERNAL_TAX_AMOUNT")) {
						key.setEXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INTERNAL_TAX_AMOUNT")) {
						key.setINTERNAL_TAX_AMOUNT(msgKey.getKeyValue("INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("EDI_DATA_TYP")) {
						key.setEDI_DATA_TYP(msgKey.getKeyValue("EDI_DATA_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_1")) {
						key.setOLD_TAX_RATE_1(msgKey.getKeyValue("OLD_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_2")) {
						key.setOLD_TAX_RATE_2(msgKey.getKeyValue("OLD_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("OLD_TAX_RATE_3")) {
						key.setOLD_TAX_RATE_3(msgKey.getKeyValue("OLD_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_START_DATE")) {
						key.setNEW_TAX_RATE_START_DATE(msgKey.getKeyValue("NEW_TAX_RATE_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_1")) {
						key.setNEW_TAX_RATE_1(msgKey.getKeyValue("NEW_TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_2")) {
						key.setNEW_TAX_RATE_2(msgKey.getKeyValue("NEW_TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("NEW_TAX_RATE_3")) {
						key.setNEW_TAX_RATE_3(msgKey.getKeyValue("NEW_TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("LINE_NO")) {
						key.setLINE_NO(msgKey.getKeyValue("LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("LINE_TYP")) {
						key.setLINE_TYP(msgKey.getKeyValue("LINE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMM_CD")) {
						key.setCOMM_CD(msgKey.getKeyValue("COMM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMM_NAME")) {
						key.setCOMM_NAME(msgKey.getKeyValue("COMM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD_2")) {
						key.setTAX_CD_2(msgKey.getKeyValue("TAX_CD_2"));
					}
					if(msgKeyType.containsKeyColumn("INP_UNIT_PRICE")) {
						key.setINP_UNIT_PRICE(msgKey.getKeyValue("INP_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_PRICE_TYP")) {
						key.setUNIT_PRICE_TYP(msgKey.getKeyValue("UNIT_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_QTY")) {
						key.setSLIP_QTY(msgKey.getKeyValue("SLIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_TIMES")) {
						key.setPART_DLV_TIMES(msgKey.getKeyValue("PART_DLV_TIMES"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_TYP")) {
						key.setPART_DLV_TYP(msgKey.getKeyValue("PART_DLV_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUST_COMM_CD")) {
						key.setCUST_COMM_CD(msgKey.getKeyValue("CUST_COMM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_COMM_NAME")) {
						key.setCUST_COMM_NAME(msgKey.getKeyValue("CUST_COMM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_SLIP_CD")) {
						key.setCUST_ODR_SLIP_CD(msgKey.getKeyValue("CUST_ODR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_UNIT_PRICE_TYP")) {
						key.setCUST_UNIT_PRICE_TYP(msgKey.getKeyValue("CUST_UNIT_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_SALES_AMOUNT")) {
						key.setOWN_CUR_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG")) {
						key.setSTOCK_CTRL_FLG(msgKey.getKeyValue("STOCK_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DUMMY")) {
						key.setDUMMY(msgKey.getKeyValue("DUMMY"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD2")) {
						key.setSLIP_CD2(msgKey.getKeyValue("SLIP_CD2"));
					}
					if(msgKeyType.containsKeyColumn("SYSTEMDATE")) {
						key.setSYSTEMDATE(msgKey.getKeyValue("SYSTEMDATE"));
					}
					if(msgKeyType.containsKeyColumn("SYSTEMUSER")) {
						key.setSYSTEMUSER(msgKey.getKeyValue("SYSTEMUSER"));
					}
					if(msgKeyType.containsKeyColumn("PROGRAMID")) {
						key.setPROGRAMID(msgKey.getKeyValue("PROGRAMID"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_KEY_CD")) {
						key.setDLV_KEY_CD(msgKey.getKeyValue("DLV_KEY_CD"));
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
