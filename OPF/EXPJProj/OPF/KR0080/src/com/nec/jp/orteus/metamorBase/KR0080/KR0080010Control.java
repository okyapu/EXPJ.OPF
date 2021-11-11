/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KR0080/src/com/nec/jp/orteus/metamorBase/KR0080/KR0080010Control.java,v $
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

import com.nec.jp.orteus.metamorBase.KR0080.*;
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
	//TODO: ここにimportパッケージを記述してください
import java.math.BigDecimal;
import com.nec.jp.orteus.expj.sa.amount.SaAmountCalculator;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KR0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.2 $ $Date: 2015/11/16 05:14:46 $
 *
 */
//}}user_implement_code_header

public class KR0080010Control
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
	//デフォルトアクセサメソッド
	protected List list;											//結果リストのインスタンス
	public List getList() { return this.list; }						//リストを返します。
	public void setList(List listname) { this.list = listname; }	//リストをセットします。
	public int getListsize() {										//リスト型のサイズを返します。
		int nret = 0;
		if( this.list != null ) {nret = this.list.size();}
		return nret;
	}
//	public Object getListvalue(int x) { return this.list.get(x); }	//リストの値を返します。
	public KR0080010Struct getListvalue(int x) { return (KR0080010Struct)(this.list.get(x)); }	//リストの値を返します。
	public KR0080010Struct getStruct() { return this.struct; }	//Structの値を返します。
	public KR0080010Struct createStruct() { return new KR0080010Struct(); }	//新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KR0080010Struct)structname); }	//Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	//Structの値を初期化します。

	//CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	//TODO: ユーザ定義のコードを記述してください
	
	/** 採番用の工場コード */
    protected String salesPLANT_CD;
    public void setSalesPLANT_CD(String name) { this.salesPLANT_CD = name; };
    public String getSalesPLANT_CD() { return this.salesPLANT_CD; };
    //----- システム設定値取得 ---------------	
	private PrivateConfig privateConfig;
    //----- システム設定値取得 ---------------		
	
	/** 棚卸承認 */
	String aprSales = "";	
	
	/** 通貨少数桁数 */
    private int decimalFig = 0;
	private String _businessOprDate = null; //業務運用日
	/**
	 * 業務運用日設定
	 * 
	 * @param businessOprDate
	 *            業務運用日
	 */
	public void setBusinessOprDate(String businessOprDate) {
		_businessOprDate = businessOprDate;
	}
	/**
	 * 業務運用日取得
	 * 
	 * @return String
	 */
	public String getBusinessOprDate() {
		return _businessOprDate;
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
     * Structの値をセットします。
     * @param s 検索したデータ
     */
    private void setStruct(KR0080010Struct s) {
    	
     struct.setSLIP_CD(s.getSLIP_CD());
     struct.setSLIP_TRN_CD(s.getSLIP_CD());
     struct.setPROJECT_CD(s.getPROJECT_CD());     
     struct.setPROJECT_NAME(s.getPROJECT_NAME()); 
     struct.setESTIMATE_NO(s.getESTIMATE_NO());
     struct.setDETAIL_NO(s.getDETAIL_NO());
     struct.setSALSE_MODIFY_COUNT(s.getSALSE_MODIFY_COUNT());
     struct.setITEM_NAME(s.getITEM_NAME());
     struct.setMODIFY_COUNT(s.getMODIFY_COUNT());
     struct.setSALES_DATE(s.getSALES_DATE());
     struct.setSALES_DEPT_CD(s.getSALES_DEPT_CD());
     struct.setSALES_DEPT_NAME(s.getSALES_DEPT_NAME());
     struct.setCUST_CHRG_PSN_CD(s.getCUST_CHRG_PSN_CD());
     struct.setCUST_CHRG_PSN_NAME(s.getCUST_CHRG_PSN_NAME());
     struct.setSALES_QTY(s.getSALES_QTY());
     struct.setSTOCK_UNIT(s.getSTOCK_UNIT());
     struct.setSALES_UNIT_PRICE(s.getSALES_UNIT_PRICE());
     struct.seth_SALES_UNIT_PRICE(s.getSALES_UNIT_PRICE());
     struct.setCUR_UNIT(s.getCUR_UNIT());
     struct.setSALES_AMOUNT(s.getSALES_AMOUNT());
     struct.setSALES_AMOUNT_YEN(s.getSALES_AMOUNT_YEN());
     struct.setTAX_CD(s.getTAX_CD());
     struct.setREMARKS(s.getREMARKS());
     struct.setWORK_REMARKS(s.getWORK_REMARKS());
     struct.setWORK_DATE(s.getWORK_DATE());
     struct.setWORK_TIME(s.getWORK_TIME());
     struct.setPAY_RATE(s.getPAY_RATE());
     struct.setWORK_PERSON_CD(s.getWORK_PERSON_CD());
     struct.setWORK_PERSON_NAME(s.getWORK_PERSON_NAME());
     struct.setCUST_CD(s.getCUST_CD());
     struct.setCUST_NAME(s.getCUST_NAME());
     struct.setITEM_CD(s.getITEM_CD());
     struct.setITEM_NAME_1(s.getITEM_NAME_1());
     struct.setCUST_ODR_NO(s.getCUST_ODR_NO());
     struct.setDESINATED_DLV_DATE(s.getDESINATED_DLV_DATE());
     struct.setUNSTOCK_MODIFY_COUNT(s.getUNSTOCK_MODIFY_COUNT());
     struct.setHS_CTL_SEQ_CD(s.getHS_CTL_SEQ_CD());
     if("1".equals(s.getJOB_ODR_COMP_FLG())){
    	 struct.setJOB_ODR_COMP_FLG("true");
     }else{
    	 struct.setJOB_ODR_COMP_FLG("false");
     }
     struct.setBUSINESS_OPR_DATE(getBusinessOprDate());
    }
   
    /**
     * Structの値をセットします。
     * @param s 検索したデータ
     */
    private void setStructSystemData(KR0080010Struct s) {
     s.setsOraganization_CD(struct.getsOrganization_CD());
     s.setsSysdate(struct.getsSysdate());
     s.setsUser_ID(sysUSER_CD);
     
    }
    /**
	 * 登録/更新時 依存マスタのチェック
	 * メッセージ登録/関連項目のクリアも行う
	 * @return true:OK / false:NG
	 */
	private boolean existDependsMaster() throws SQLException, FoundationException
	{
		boolean result = true;
		//売上担当部門コード
        List checkList = entity.mM_ORG.read(conn, struct);
        if (checkList.isEmpty()) {
	         setErrorMessage("KA00058");
	         result = false;
        }else{
        	KR0080010Struct orgStruct = (KR0080010Struct) checkList.get(0);
        	//売上計上部門名
        	struct.setORG_NAME(orgStruct.getORG_NAME());
        }
        //営業担当者コード 
        checkList = entity.mUSER_MST_CUSTCHK.read(conn, struct);
        if (checkList.isEmpty()) {
	         setErrorMessage("KM00048");
	         result = false;
        }else{
        	KR0080010Struct custStruct = (KR0080010Struct) checkList.get(0);
        	//営業担当者名
        	struct.setCUST_CHRG_PSN_NAME(custStruct.getUSER_NAME());
        }
        
        if(!(struct.getWORK_PERSON_CD() == null || "".equals(struct.getWORK_PERSON_CD()))){
        	//作業担当者コード 
            checkList = entity.mUSER_MST_CUSTWORK.read(conn, struct);
            if (checkList.isEmpty()) {
	             setErrorMessage("KM00027");
	             result = false;
            }else{
            	KR0080010Struct workStruct = (KR0080010Struct) checkList.get(0);
            	//作業担当者名
            	struct.setWORK_PERSON_NAME(workStruct.getUSER_NAME());
            }
        }
        
        //消費税コード
		checkList = entity.mM_TAX.read(conn, struct);
		if (checkList.isEmpty()) {
			setErrorMessage("AA01001");
			result = false;
		} else {
			KR0080010Struct taxStruct = (KR0080010Struct) checkList.get(0);
			//旧税率1
			struct.setTAX_RATE_1(taxStruct.getTAX_RATE_1());
			//旧税率2
			struct.setTAX_RATE_2(taxStruct.getTAX_RATE_2());
			//旧税率3
			struct.setTAX_RATE_3(taxStruct.getTAX_RATE_3());
			//端数区分
			struct.setTAX_ROUND_TYP(taxStruct.getTAX_ROUND_TYP());
		}
		//得意先取得
		List custList = entity.mM_CUST.read(conn, struct);
		if (custList.isEmpty()) {
            setErrorMessage("KA00032");
            result = false;
        }else{
        	KR0080010Struct custStruct = (KR0080010Struct) custList.get(0);
    		//通貨コード
    		struct.setCURRNCY_CD(custStruct.getCUR_CD());
            //検収区分
    		struct.setINSPC_ACPT_TYP(custStruct.getINSPC_ACPT_TYP());
    		//為替種別
    		struct.setEXCH_TYP(custStruct.getEXCH_TYP());
    		//金額まるめ区分
    		struct.setDETAIL_ROUND_TYP(custStruct.getDETAIL_ROUND_TYP());
        }
		
		//｢得意先コード｣→[得意先]."取引通貨コード"が[通貨]に存在しない場合
        List curList = entity.mM_CUR.read(conn, struct);
        if (curList.isEmpty()) {
         setErrorMessage("KQ00073");
         result = false;
        } else {
         //｢売上金額｣の小数桁が[通貨]."小数桁数"を超えていた場合
         KR0080010Struct curStruct = (KR0080010Struct) curList.get(0);
         this.decimalFig = Integer.parseInt(curStruct.getDECIMAL_FIG());
         if (Calculate.compare(struct.getSALES_QTY(), "0") <= 0
          && Calculate.compare(struct.getSALES_UNIT_PRICE(), "0") <= 0) {
          if (NumberTool.getRealScale(struct.getSALES_AMOUNT())
           > Integer.parseInt(curStruct.getDECIMAL_FIG())) {
           setErrorMessage("KU01003");
           result = false;
          }
         }
        }
		return result;
	}

    /**
     * 画面の詳細項目を初期化します。
     */
    private void initializeDetail() {
     struct.setSLIP_CD(null);
     struct.setPROJECT_CD(null);
     struct.setPROJECT_NAME(null);
     struct.setJOB_ODR_COMP_FLG("true");
     struct.setESTIMATE_NO(null);
     struct.setDETAIL_NO(null);
     struct.setITEM_NAME(null);
     struct.setSALES_DATE(getBusinessOprDate());
     struct.setSALES_DEPT_CD(null);
     struct.setSALES_DEPT_NAME(null);
     struct.setCUST_CHRG_PSN_CD(null);
     struct.setCUST_CHRG_PSN_NAME(null);
     struct.setSALES_QTY("0");
     struct.setSTOCK_UNIT(null);
     struct.setSALES_UNIT_PRICE("0");
     struct.seth_SALES_UNIT_PRICE("0");
     struct.setCUR_UNIT(null);
     struct.setSALES_AMOUNT("0");
     struct.setSALES_AMOUNT_YEN("0");
     struct.setTAX_CD(null);
     struct.setREMARKS(null);
     struct.setWORK_DATE("");
     struct.setWORK_TIME(null);
     struct.setPAY_RATE("0");
     struct.setWORK_PERSON_CD(null);
     struct.setWORK_PERSON_NAME(null);
     struct.setWORK_REMARKS(null);
     struct.setCUST_CD(null);
     struct.setCUST_NAME(null);
     struct.setITEM_CD(null);
     struct.setITEM_NAME_1(null);
     struct.setCUST_ODR_NO(null);
     struct.setDESINATED_DLV_DATE(null);
     
     struct.seth_CTL_SEQ_CD(null);
     struct.seth_SALES_SEQ_NO(null);
     list = null;
   
     readStatus = INITIAL;
    }
   
    /**
     * 邦貨換算。
     * @param amount 対象金額
     * @param s ストラクトオブジェクト
     * @return 邦貨金額
     * @throws SQLException 処理失敗
     * @throws ExpjException  処理失敗
     */
    private String exchAmount(String amount, KR0080010Struct s)
     throws SQLException, ExpjException {
   
	     ExchAmount exch = new ExchAmount(conn);
	   
	     boolean result =
	      exch.doExchAmount(
	       amount,
	       s.getCOMPANY_CD(),
	       s.getCURRNCY_CD(),
	       s.getEXCH_TYP(),
	       s.getDETAIL_ROUND_TYP(),
	       s.getSALES_DATE());
	   
	     if (!result) {
	      setErrorMessage("KQ00038");
	      return "0";
	     }
	     double exchAmount = exch.getD_EXCH_AMOUNT();
	     BigDecimal b = new BigDecimal(exchAmount);
	   
	     return b.toString();
    }
    
    /**
     * システムパラメータチェック       
     * @throws SQLException 処理失敗
     * @throws ExpjException 処理失敗
   * @throws FoundationException 
     */
    private boolean blnchkAprSales()
    throws SQLException, ExpjException, FoundationException {
  	  
       /** パラメータ「売上実績承認」を取得*/
       privateConfig = new PrivateConfig(conn);
       aprSales = privateConfig.getString("APR_SALES");
       //パラメータ「検収承認」が取得できなかった場合
      if(aprSales == null || "".equals(aprSales)){
			String locale = CoreTools.getLocale(struct.getsUser_ID());
			ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
			setErrorMessage("AZ00041", messages.getString("AZ00074"));
			aprSales = "0";
        	return false;
      }else if(!"1".equals(aprSales)){   	        	  
    	  	//１以外の場合
    	  	return false;
      }else{
    	  	//１の場合
    	  	return true;
      }     	  
    }
    
    /**
     * システムパラメータチェック       
     * @throws SQLException 処理失敗
     * @throws ExpjException 処理失敗
   * @throws FoundationException 
     */
    private void chkAprSales()
    throws SQLException, ExpjException, FoundationException {
  	  String installFlg = "";
        List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
        if(installOptionsList.size() > 0){
      	  installFlg = ((KR0080010Struct)installOptionsList.get(0)).getINSTALL_FLG();
      	  
        }
        if (installOptionsList.isEmpty() || "0".equals(installFlg)) {  
          //売掛管理がインストールされていない。
 	        
          //パラメータ「売上実績承認」を取得
          privateConfig = new PrivateConfig(conn);
          aprSales = privateConfig.getString("APR_SALES");
          //パラメータ「売上実績承認」が取得できなかった場合
          if(aprSales == null || "".equals(aprSales)){
			String locale = CoreTools.getLocale(struct.getsUser_ID());
			ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
			setErrorMessage("AZ00041", messages.getString("AZ00074"));
			aprSales = "0";
            return;
          }else if(!"1".equals(aprSales)){   	        	  
			  //１以外の場合
        	  aprSales = "0";
          }else{
        	  //１の場合
              aprSales = "1";
          }
          //売上実績承認が1：行う場合
          if("1".equals(aprSales)){
   	          //伝票番号で[売上実績]を検索し、承認状況≠1:承認待ち　の場合
   	          List tSalesApprList = entity.mT_SALES_ApprFlg.read(conn,struct);
   	          if(tSalesApprList != null && tSalesApprList.size() > 0){
   	        	  setErrorMessage("KR00025");
   	        	  return;
   	          }   	        	  
          }   
        }
  	  
    }
    
	private KR0080010Struct createDebitRecord()
	         throws FoundationException, SQLException, ExpjException {
			
			KR0080010Struct s = new KR0080010Struct();
	         //売上区分:“4” (非在庫品売上)
	         s.setSALES_TYP("4");
	         //得意先コード
	         s.setCUST_CD(struct.getCUST_CD());
	         //品目番号
	         s.setITEM_CD(struct.getITEM_CD());
	         //品目名称
	         if(struct.getITEM_CD() == null || "".equals(struct.getITEM_CD())){
	        	 //品目番号がnullの場合は、[画面].“品目名”
	        	 s.setITEM_NAME(struct.getITEM_NAME());
	         }else{
	        	 //品目名称
	        	 s.setITEM_NAME(struct.getITEM_NAME_1());
	         }
	         //得意先注文番号
	         s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
	         //売上計上日
	         s.setSALES_DATE(struct.getSALES_DATE());
	         //売上計上部門
	         s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
	         //取引先コード
	         s.setVEND_CD(null);
	         //製造場所コード
	         s.setPRD_ODR_PLACE_CD(null);
	         //営業担当者コード
	         s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
	         //発行担当者コード
	         s.setODR_ACPT_PSN_CD(null);
	         //売上実績数量
	         s.setSALES_QTY(struct.getSALES_QTY());
	         //単価
	         s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
	         //品目取得
			 List itemList = entity.mM_ITEM.read(conn, struct);
			 if(!itemList.isEmpty()){
				KR0080010Struct itemStruct = (KR0080010Struct) itemList.get(0);
				//単位
		        s.setUNIT_CD(itemStruct.getSTOCK_UNIT());
			 }
	         //売上実績金額
	         s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
	         //通貨コード
	         s.setCURRNCY_CD(struct.getCURRNCY_CD());
	         //売上実績金額(邦貨)
	         String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
	         if (msgStruct.hasError()) {
	          return s;
	         }
	         s.setSALES_AMOUNT_YEN(salesAmountExchRates);
	         //受領検収日
	         s.setINSPC_ACPT_DATE(struct.getSALES_DATE());
	         //受領検収数
	         s.setINSPC_ACPT_QTY(struct.getSALES_QTY());
	       
	         //外税対象金額
	         String externalTaxSalesAmount =
	          SaAmountCalculator.calcExternalTaxSalesAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT());
	         s.setEXTERNAL_TAX_SALES_AMOUNT(externalTaxSalesAmount);
	         //内税対象金額
	         String internalTaxSalesAmount =
	          SaAmountCalculator.calcInternalTaxSalesAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT());
	         s.setINTERNAL_TAX_SALES_AMOUNT(internalTaxSalesAmount);
	         //非課税対象金額
	         String taxfreeSalesAmount =
	          SaAmountCalculator.calcTaxfreeSalesAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT());
	         s.setTAXFREE_SALES_AMOUNT(taxfreeSalesAmount);
	       
	         //税額１
	         String taxAmount1 =
	          SaAmountCalculator.calcTaxAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT(),
	           struct.getTAX_RATE_1(),
	           String.valueOf(this.decimalFig),
	           struct.getTAX_ROUND_TYP());
	         s.setTAX_AMOUNT_1(taxAmount1);
	         //税額２
	         String taxAmount2 =
	          SaAmountCalculator.calcTaxAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT(),
	           struct.getTAX_RATE_2(),
	           String.valueOf(this.decimalFig),
	           struct.getTAX_ROUND_TYP());
	         s.setTAX_AMOUNT_2(taxAmount2);
	         //税額３
	         String taxAmount3 =
	          SaAmountCalculator.calcTaxAmount(
	           struct.getTAX_CD(),
	           s.getSALES_AMOUNT(),
	           struct.getTAX_RATE_3(),
	           String.valueOf(this.decimalFig),
	           struct.getTAX_ROUND_TYP());
	         s.setTAX_AMOUNT_3(taxAmount3);
	         //消費税額（外税）
	         String externalTaxAmount =
	          SaAmountCalculator.calcExternalTaxAmount(
	           struct.getTAX_CD(),
	           s.getTAX_AMOUNT_1(),
	           s.getTAX_AMOUNT_2(),
	           s.getTAX_AMOUNT_3());
	         s.setEXTERNAL_TAX_AMOUNT(externalTaxAmount);
	         //消費税額（内税）
	         String internalTaxAmount =
	          SaAmountCalculator.calcInternalTaxAmount(
	           struct.getTAX_CD(),
	           s.getTAX_AMOUNT_1(),
	           s.getTAX_AMOUNT_2(),
	           s.getTAX_AMOUNT_3());
	         s.setINTERNAL_TAX_AMOUNT(internalTaxAmount);
	       
	         //税抜売上金額
	         String taxCreditSalesAmount =
	          SaAmountCalculator.calcTaxCreditSalesAmount(
	           s.getEXTERNAL_TAX_SALES_AMOUNT(),
	           s.getINTERNAL_TAX_SALES_AMOUNT(),
	           s.getTAXFREE_SALES_AMOUNT(),
	           s.getINTERNAL_TAX_AMOUNT());
	         s.setTAX_CREDIT_SALES_AMOUNT(taxCreditSalesAmount);
	       
	         //税抜売上金額（邦貨）
	         String taxCreditSalesAmountExchRates = exchAmount(taxCreditSalesAmount, struct);
	         if (msgStruct.hasError()) {
	          return s;
	         }
	         s.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(taxCreditSalesAmountExchRates);
	       
	 		 //検収区分
	 		 s.setINSPC_ACPT_TYP(struct.getINSPC_ACPT_TYP());
	         //売上実績管理番号
	         s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
	         //元伝票番号
	         s.setORG_SLIP_CD(null);
	         //特値区分
	         s.setSPCL_PRICE_CO(null);
	         //備考
	         s.setREMARKS(struct.getREMARKS());
	         //状態区分:“20” (売掛計上予定)
	         s.setSTATUS("20");
	         //削除フラグ
	         s.setDEL_FLG("0");
	     	  
	         //システムパラメータ(承認)チェック
	    	  if(blnchkAprSales() == true){
	    	  	s.setAPPR_FLG("1");
	    		s.setAPPR_ID(null);
	    		s.setAPPR_DATE(null);
	    	  }else{
	    		s.setAPPR_FLG("3");
	    		s.setAPPR_ID(getsysUSER_CD());
	    		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
	    	  }	 
	    	  
	         setStructSystemData(s);
	       
	         return s;
	        }
	
    private KR0080010Struct createCreditRecord() throws ExpjException,FoundationException, SQLException {
        List l = entity.mT_SALES_CreditRecord.read(conn, struct);
	        KR0080010Struct s = (KR0080010Struct) l.get(0);
	        
	      //売上実績管理番号
	      s.seth_SALES_SEQ_NO(struct.geth_SALES_SEQ_NO());
	        
	      //システムパラメータ(承認)チェック
	   	  if(blnchkAprSales() == true){
	   	  	s.setAPPR_FLG("1");
	   		s.setAPPR_ID(null);
	   		s.setAPPR_DATE(null);
	   	  }else{
	   		s.setAPPR_FLG("3");
	   		s.setAPPR_ID(getsysUSER_CD());
	   		s.setAPPR_DATE(struct.getBUSINESS_OPR_DATE());
	   	  }	 
	        setStructSystemData(s);
	      
	        return s;
       }
    
	private KR0080010Struct createServiceRecord()
	         throws FoundationException, SQLException, ExpjException {
			
	         KR0080010Struct s = new KR0080010Struct();
	         //受注番号
	         s.setODR_NO(struct.getODR_NO());
	         //売上計上日
	         s.setSALES_DATE(struct.getSALES_DATE());
	         //売上計上部門コード
	         s.setSALES_DEPT_CD(struct.getSALES_DEPT_CD());
	         //営業担当者コード
	         s.setCUST_CHRG_PSN_CD(struct.getCUST_CHRG_PSN_CD());
	         //単価
	         s.setSALES_UNIT_PRICE(struct.getSALES_UNIT_PRICE());
	         //数量
	         s.setSALES_QTY(struct.getSALES_QTY());
	         //金額
	         s.setSALES_AMOUNT(struct.getSALES_AMOUNT());
	         //金額（邦貨）
	         String salesAmountExchRates = exchAmount(struct.getSALES_AMOUNT(), struct);
	         if (msgStruct.hasError()) {
	          return s;
	         }
	         s.setSALES_AMOUNT_YEN(salesAmountExchRates);
	         //消費税コード
	         s.setTAX_CD(struct.getTAX_CD());
	         //指定納期
	         s.setDESINATED_DLV_DATE(struct.getDESINATED_DLV_DATE());       
	         //得意先注文番号
	         s.setCUST_ODR_NO(struct.getCUST_ODR_NO());
	         //得意先コード
	         s.setCUST_CD(struct.getCUST_CD());
	         //品目番号
	         s.setITEM_CD(struct.getITEM_CD());
	         //品目名
	         s.setITEM_NAME(struct.getITEM_NAME());
	         //備考
	         s.setREMARKS(struct.getREMARKS());
	         //作業時間
	         s.setWORK_TIME(struct.getWORK_TIME());
	         //賃率
	         s.setPAY_RATE(struct.getPAY_RATE());
	         //作業日
	         s.setWORK_DATE(struct.getWORK_DATE());
	         //作業担当者コード
	         s.setWORK_PERSON_CD(struct.getWORK_PERSON_CD());
	         //作業備考
	         s.setWORK_REMARKS(struct.getWORK_REMARKS());
	         s.seth_CTL_SEQ_CD(struct.geth_CTL_SEQ_CD());
	         //通貨コード
             s.setCURRNCY_CD(struct.getCURRNCY_CD());
	         //伝票番号
             s.setSLIP_CD(struct.getSLIP_CD());
	         setStructSystemData(s);
	       
	         return s;
	        }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			//TODO: ユーザ定義のコードを記述してください
		try {
			//[売上実績]の更新数
			 String salseModifyCount = null;
			 //[非在庫受注]の更新数
			 String unstockModifyCount = null;
			 
			List chkUnstokList = entity.mselsectT_ODR_UNSTOCK.read(conn, struct);
			List chkOdrAlcList = entity.mselectT_PJ_ODR_ALC.read(conn, struct);
			List chkProjectList = entity.mselectT_ESTIMATE_DETAL.read(conn, struct);
			
			 if (chkUnstokList.isEmpty()) {
				//[非在庫受注]の情報が存在しない場合
				 setErrorMessage("ZZ06001");
				 return;
			 }else if(chkOdrAlcList.isEmpty()){
				 //受注番号が[案件受注紐付]に存在しない場合
				 setErrorMessage("KM00001");
				 return;
			 }else if(chkProjectList.isEmpty()){
				 //案件番号が[見積明細]に存在しない場合
				 setErrorMessage("KM00010");
				 return;
			 }
			 
			//[非在庫受注]の更新数
			KR0080010Struct unstokStruct = (KR0080010Struct) chkUnstokList.get(0);
			unstockModifyCount = unstokStruct.getUNSTOCK_MODIFY_COUNT();
				
			 //役務実績を検索する
			 List serviceDataList = entity.mselectT_SERVICE.read(conn, struct);
			 if(serviceDataList.isEmpty()){
				 //[役務実績]にデータが存在しない場合
				//画面表示用データ読込
                 list = entity.mselectNoData.read(conn, struct);
                 readStatus = NOT_FOUND;
			 }else{
				 KR0080010Struct serviceStruct = (KR0080010Struct) serviceDataList.get(0);
				 struct.seth_CTL_SEQ_CD(serviceStruct.geth_CTL_SEQ_CD());
				 //伝票番号
				 struct.setSLIP_TRN_CD(serviceStruct.getSLIP_TRN_CD());
				 //[役務実績]にデータが存在する場合
				 List sysInstallList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
				 
				 if(!sysInstallList.isEmpty()){
	                  //[売掛金トランヘッダ]を検索
	                  List arLedgerHTrnList = entity.mselectT_AR_LEDGER_H_TRN.read(conn, struct);
	                  if (arLedgerHTrnList.isEmpty()) {
	                	//[売掛金元帳ヘッダ]を検索
		                  List arLedgerHList = entity.mselectT_AR_LEDGER_H.read(conn, struct);
		                  if (arLedgerHList.isEmpty()) {
			                    setErrorMessage("BD00027");
			                    return;
			              }
	                  } 
	               }
				 List slipCdList = entity.mselectT_SALES.read(conn, struct);
				 if(slipCdList.isEmpty()){
					 //“伝票番号”が[売上実績]に存在しない場合
					 setErrorMessage("KM00025");
					 return;
				 }
				 
				 KR0080010Struct slipCdStruct = (KR0080010Struct) slipCdList.get(0);
				 salseModifyCount = slipCdStruct.getSALSE_MODIFY_COUNT();
				 struct.seth_SALES_SEQ_NO(slipCdStruct.geth_SALES_SEQ_NO());
				//画面表示用データ読込
				 list = entity.mselectData.read(conn, struct); 
				 readStatus = NORMAL;
			 }
			 
			 KR0080010Struct formStruct = (KR0080010Struct) list.get(0); 
			 //更新数
             formStruct.setSALSE_MODIFY_COUNT(salseModifyCount);
             formStruct.setUNSTOCK_MODIFY_COUNT(unstockModifyCount);
			if( readStatus == NOT_FOUND){
				formStruct.setJOB_ODR_COMP_FLG("1");
			}
			//画面データを設定
             setStruct(formStruct); 
                 
		} catch(SQLException e) {
			//検索状態を「読込失敗」に設定
			setReadStatus(ERROR);
			throw new ExpjException(e);
			//エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			//TODO: ユーザ定義のコードを記述してください
		try {
			//依存するマスタのチェック
			if(!existDependsMaster()){
				return;
			}
            
			//[売上実績]（黒伝）登録用データを生成
            KR0080010Struct debitRecordStruct = createDebitRecord();
            if (msgStruct.hasError()) {
                return;
            }
			
	        //売上実績管理番号(連番)
            List salesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
            KR0080010Struct salesSeqNoStruct = (KR0080010Struct) salesSeqNoList.get(0);
            debitRecordStruct.setSALES_SEQ_NO(salesSeqNoStruct.getSALES_SEQ_NO());
            //伝票番号を自動採番
            Numbering slipCdNum =
            new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
            debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
            
            //[売上実績]（黒伝）の登録
            entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);
			//「売掛管理」サブシステム
            List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
            
	        if (!installOptionsList.isEmpty()) {
				//売掛管理がインストールされている場合、売掛管理Ⅰ／Ｆ(部品)の呼出
	        	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
	        	tempKZ0010P001.setParameter("6", struct.getsUser_ID(), null, null, debitRecordStruct.getSLIP_CD(), struct.getTAX_CD());
				String msgNo = tempKZ0010P001.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
			}
            //[役務実績]、[役務実績履歴]登録用データを生成
            KR0080010Struct serviceRecordStruct = createServiceRecord();
            if (msgStruct.hasError()) {
                return;
               }
 
            //役務実績管理番号(連番)
            List serviceSeqNoList = entity.mSEQ_CTL_SEQ_CD.read(conn, struct);
            KR0080010Struct serviceSeqNoStruct = (KR0080010Struct) serviceSeqNoList.get(0);
            serviceRecordStruct.setCTL_SEQ_CD(serviceSeqNoStruct.getCTL_SEQ_CD());
            //伝票番号
            serviceRecordStruct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
            //[役務実績]の登録
            entity.mT_SERVICE_CreditRecord.create(conn, serviceRecordStruct);
            //履歴管理番号(連番)
            List hsServiceSeqNoList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
            KR0080010Struct hsServiceSeqNoStruct = (KR0080010Struct) hsServiceSeqNoList.get(0);
            serviceRecordStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoStruct.getHS_CTL_SEQ_CD());
            //受注番号
            serviceRecordStruct.setODR_NO(struct.getODR_NO());
            //新旧フラグ
            serviceRecordStruct.setNEW_OLD_FLG("1");
            //処理区分
            serviceRecordStruct.setTRAN_TYPE("1");
            //訂正区分
            serviceRecordStruct.setCRCT_TYP("2");
            //[役務実績履歴]の登録
            entity.mHS_T_SERVICE_CreditRecord.create(conn, serviceRecordStruct);
            
            //“完了フラグ”が、チェックOnの場合
            if("true".equals(struct.getJOB_ODR_COMP_FLG())){
				// 排他処理
				List modifyCountList = entity.mselectT_ODR_UNSTOCK_MODIFY_COUNT.read(conn, struct);
				if (modifyCountList.isEmpty()) {
					setErrorMessage("ZZ01105");
					conn.rollback();
					return;
				}else{
					KR0080010Struct modifyCountStruct = (KR0080010Struct)modifyCountList.get(0);
					if (struct.getUNSTOCK_MODIFY_COUNT() != null && !"".equals(struct.getUNSTOCK_MODIFY_COUNT()) && !struct.getUNSTOCK_MODIFY_COUNT().equals(modifyCountStruct.getSEL_MODIFY_COUNT())) {
						setErrorMessage("ZZ01105");
						conn.rollback();
						return;
					}
				}
            	//[非在庫受注]の更新
            	entity.mupdateT_ODR_UNSTOCK.update(conn, struct);
            }
            conn.commit();
            //画面を再検索
            controlSelect();

		} catch(SQLException e) {
			ExpjMessage emsg;
			emsg = new ExpjMessage("ZZ01006","登録に失敗しました。");
			msgStruct.addError(emsg);
			e.printStackTrace();
			//エラー処理を記述してください。
		}finally {
	         if (conn != null) {
	             conn.rollback();
	            }
	   		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			//TODO: ユーザ定義のコードを記述してください
		try {			
			//[役務実績履歴]用赤伝の伝票番号
			String strSLIP_CD = null;
			//依存するマスタのチェック
			if(!existDependsMaster()){
				return;
			}
			
			//｢受注番号｣が、[売上実績]に存在しない場合
			List odrNoList = entity.mselectT_SALES.read(conn, struct);
			if(odrNoList.isEmpty()){
				setErrorMessage("ZZ01105");
                return;
			}
			
			KR0080010Struct odrNoStruct = (KR0080010Struct) odrNoList.get(0);
			//AI売掛インタフェースフラグ
			struct.setAI_AR_IF_FLG(odrNoStruct.getAI_AR_IF_FLG());
            //[売上実績]."更新数" != ｢更新数｣(hidden使用)の場合
            if (!odrNoStruct.getSALSE_MODIFY_COUNT().equals(struct.getSALSE_MODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //役務実績を検索する
			List serviceDataList = entity.mselectT_SERVICE.read(conn, struct);
			if(serviceDataList.isEmpty()){
			 //[役務実績]にデータが存在しない場合
				setErrorMessage("ZZ01105");
                return;
			 }
			
			KR0080010Struct serviceStruct = (KR0080010Struct) serviceDataList.get(0);
            //[役務実績]."更新数" != ｢更新数｣(hidden使用)の場合
            if (!serviceStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
			
            //非在庫受注を検索する
            List chkUnstokList = entity.mselsectT_ODR_UNSTOCK.read(conn, struct);
			if(chkUnstokList.isEmpty()){
			 //[非在庫受注]にデータが存在しない場合
				setErrorMessage("ZZ01105");
                return;
			 }
			
			KR0080010Struct unstokStruct = (KR0080010Struct) chkUnstokList.get(0);
            //[非在庫受注]."更新数" != ｢更新数｣(hidden使用)の場合
            if (!unstokStruct.getUNSTOCK_MODIFY_COUNT().equals(struct.getUNSTOCK_MODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //売掛導入していない場合、システムパラメータ売上実績承認チェック
            chkAprSales();
            if (msgStruct.hasError()) {                	 
                return;
            }
            //インストールオプションの取得
			List tempList = entity.mSYS_INSTALL_OPTIONS_Ai.read(conn, struct);
			if (tempList.isEmpty()) {
				struct.seth_INSTALL_FLG(null);			
			}else{
				struct.seth_INSTALL_FLG(((KR0080010Struct)tempList.get(0)).geth_INSTALL_FLG());
			}
			//「売掛管理」サブシステム
			List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
			//[売掛金トランヘッダ] を検索する
			List listLedgerHTrn = entity.mselectT_AR_LEDGER_H_TRN.read(conn, struct);
			//[売掛金元帳ヘッダ] を検索する
			List listLedgerH = entity.mselectT_AR_LEDGER_H.read(conn, struct);
			 
			//Ai連携対応、Ai連携ありかつ送信済の場合は[売上実績]赤黒明細を作成
  			if("1".equals(struct.geth_INSTALL_FLG()) &&
  					"1".equals(struct.getAI_AR_IF_FLG())){
  				
  				//[売上実績]（赤伝）登録用データを生成
                KR0080010Struct creditRecordStruct = createCreditRecord();
                //売上実績管理番号(連番)
                List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
                KR0080010Struct creditSalesSeqNoStruct = (KR0080010Struct) creditSalesSeqNoList.get(0);
                creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
            
                //赤伝票番号を自動採番
                Numbering redSlipCdNum =
                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
                creditRecordStruct.setSLIP_CD(redSlipCdNum.getNo());
                
				//[役務実績履歴]用赤伝の伝票番号
				strSLIP_CD = creditRecordStruct.getSLIP_CD();
                //元伝票番号
                creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
                //[売上実績]（赤伝）を登録
                entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
            
                //[売上実績]（黒伝）を論理削除
                entity.mT_SALES_Delete.update(conn, struct);
            
                //[売上実績]（黒伝）登録用データを生成
                KR0080010Struct debitRecordStruct = createDebitRecord();
                if (msgStruct.hasError()) {
                 return;
                }
    			
                //売上実績管理番号(連番)
                List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
                KR0080010Struct debitSalesSeqNoStruct = (KR0080010Struct) debitSalesSeqNoList.get(0);
                debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());

                //黒伝票番号を自動採番
                Numbering slipCdNum =
                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
                debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
                
				//元伝票番号
				debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
                //[売上実績]（黒伝）を登録
                entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);    
                //登録した黒伝の伝票番号で画面を再検索
				struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
  			}else{
  				if (installOptionsList.isEmpty()
  	                  || (!installOptionsList.isEmpty() && !listLedgerHTrn.isEmpty())) {
  	                  //売掛管理がインストールされていない場合
  	                  //または、売掛管理がインストールされているかつ、該当データが [売掛金トランヘッダ] に存在する場合
  					  //[役務実績履歴]用赤伝の伝票番号
  					  strSLIP_CD = struct.getSLIP_CD();
  	                  //[売上実績]（黒伝）登録用データを生成
  	                  KR0080010Struct debitRecordStruct = createDebitRecord();
  	                  if (msgStruct.hasError()) {
  	                   return;
  	                  }
  	                  //伝票番号は｢伝票番号｣を使用する
  	                  debitRecordStruct.setSLIP_CD(struct.getSLIP_CD());
  	                  //[売上実績]（黒伝）を更新
  	                  entity.mT_SALES_DebitRecord.update(conn, debitRecordStruct);
  	                  
  	                if (!installOptionsList.isEmpty()) {
						//売掛管理がインストールされている場合
						//売掛管理Ｉ／Ｆ
  	                	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
  	                	tempKZ0010P001.setParameter("7", struct.getsUser_ID(), struct.getSLIP_CD(), null, null, struct.getTAX_CD());
						String msgNo = tempKZ0010P001.execute();
						if (!"0".equals(msgNo)) {
							setErrorMessage(msgNo);
							conn.rollback();
							return;
						}
					}
  	                //登録した黒伝の伝票番号で画面を再検索
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
  				}else if(!installOptionsList.isEmpty() && !listLedgerH.isEmpty()){
  					//「売掛管理」サブシステム 導入 かつ 該当データが [売掛金元帳ヘッダ] に存在する場合
  					
  					//[売上実績]（赤伝）登録用データを生成
  	                KR0080010Struct creditRecordStruct = createCreditRecord();
  	                //売上実績管理番号(連番)
  	                List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
  	                KR0080010Struct creditSalesSeqNoStruct = (KR0080010Struct) creditSalesSeqNoList.get(0);
  	                creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
  	            
  	                //赤伝票番号を自動採番
  	                Numbering redSlipCdNum =
  	                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
  	                creditRecordStruct.setSLIP_CD(redSlipCdNum.getNo());
  	                //[役務実績履歴]用赤伝の伝票番号
  	                strSLIP_CD = creditRecordStruct.getSLIP_CD();
  	                //元伝票番号
  	                creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
  	                //[売上実績]（赤伝）を登録
  	                entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
  	            
  	                //[売上実績]（黒伝）を論理削除
  	                entity.mT_SALES_Delete.update(conn, struct);
  	            
  	                //[売上実績]（黒伝）登録用データを生成
  	                KR0080010Struct debitRecordStruct = createDebitRecord();
  	                if (msgStruct.hasError()) {
  	                 return;
  	                }
  	                //売上実績管理番号(連番)
  	                List debitSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
  	                KR0080010Struct debitSalesSeqNoStruct = (KR0080010Struct) debitSalesSeqNoList.get(0);
  	                debitRecordStruct.setSALES_SEQ_NO(debitSalesSeqNoStruct.getSALES_SEQ_NO());
  	                //黒伝票番号を自動採番
  	                Numbering slipCdNum =
  	                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
  	                debitRecordStruct.setSLIP_CD(slipCdNum.getNo());
  	                //元伝票番号
					debitRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
  	                //[売上実績]（黒伝）を登録
  	                entity.mT_SALES_DebitRecord.create(conn, debitRecordStruct);  
  	                
  	                if (!installOptionsList.isEmpty()) {
                  	//売掛管理がインストールされている場合
                    
  	                	//売掛管理Ｉ／Ｆ
	                  	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
	                  	tempKZ0010P001.setParameter("7", struct.getsUser_ID(),
	  							struct.getSLIP_CD(),
	  							creditRecordStruct.getSLIP_CD(),
	  							debitRecordStruct.getSLIP_CD(),
	  							struct.getTAX_CD());
	  					String msgNo = tempKZ0010P001.execute();
	  					if (!"0".equals(msgNo)) {
	  						setErrorMessage(msgNo);
	  						conn.rollback();
	  						return;
  					}
                   }
  	                //登録した黒伝の伝票番号で画面を再検索
					struct.setSLIP_CD(debitRecordStruct.getSLIP_CD());
  				}   
                
  			}
				 //[役務実績履歴]登録用データを生成
				 List beforeHsTServiceList = entity.mselectData.read(conn, struct);
		         KR0080010Struct beforeHsTServiceStruct = (KR0080010Struct) beforeHsTServiceList.get(0);
	         	 //履歴管理番号(連番)
	             List hsServiceSeqNoList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
	             KR0080010Struct hsServiceSeqNoStruct = (KR0080010Struct) hsServiceSeqNoList.get(0);
	             beforeHsTServiceStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoStruct.getHS_CTL_SEQ_CD());
	             //伝票番号
	             beforeHsTServiceStruct.setSLIP_CD(strSLIP_CD);
	             //受注番号
	             beforeHsTServiceStruct.setODR_NO(struct.getODR_NO());
		         //新旧フラグ
		         beforeHsTServiceStruct.setNEW_OLD_FLG("0");
	             //処理区分
		         beforeHsTServiceStruct.setTRAN_TYPE("2");
	             //訂正区分
		         beforeHsTServiceStruct.setCRCT_TYP("1");
		         setStructSystemData(beforeHsTServiceStruct);
		         //更新前のデータを[役務実績履歴] に登録する
		         entity.mHS_T_SERVICE_CreditRecord.create(conn, beforeHsTServiceStruct);
		        
		         //[役務実績]更新用データを生成
                 KR0080010Struct serviceRecordStruct = createServiceRecord();
                 if (msgStruct.hasError()) {
                  return;
                 }
                 //[役務実績]更新
                 entity.mT_SERVICE_update.update(conn, serviceRecordStruct);
                  
                 //履歴管理番号(連番)
  	             List hsServiceSeqNoafterList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
  	             KR0080010Struct hsServiceSeqNoafterStruct = (KR0080010Struct) hsServiceSeqNoafterList.get(0);
  	             serviceRecordStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoafterStruct.getHS_CTL_SEQ_CD());
  	             //受注番号
  	             serviceRecordStruct.setODR_NO(struct.getODR_NO());
                 //新旧フラグ
                 serviceRecordStruct.setNEW_OLD_FLG("1");
 	             //処理区分
                 serviceRecordStruct.setTRAN_TYPE("2");
 	             //訂正区分
                 serviceRecordStruct.setCRCT_TYP("2");
                 //更新後のデータを[役務実績履歴] に登録する
 		         entity.mHS_T_SERVICE_CreditRecord.create(conn, serviceRecordStruct);
 		         
 		         //[非在庫受注] を更新する
 		         if("true".equals(struct.getJOB_ODR_COMP_FLG())){
 		        	//“完了フラグ”が、チェックOnの場合、1:完了
  	            	entity.mupdateT_ODR_UNSTOCK.update(conn, struct);
 		         }else{
 		        	//“完了フラグ”が、チェックOffの場合、0:未完了
 		        	entity.mupdateT_ODR_UNSTOCK1.update(conn, struct);
 		         }
 		        conn.commit();
 		        //登録内容を 画面に表示する
 		        controlSelect();
 		        
		} catch(SQLException e) {
			throw new ExpjException(e);
        } finally {
         if (conn != null) {
          conn.rollback();
         }
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			//TODO: ユーザ定義のコードを記述してください
		try {
			//｢受注番号｣が、[売上実績]に存在しない場合
			List odrNoList = entity.mselectT_SALES.read(conn, struct);
			if(odrNoList.isEmpty()){
				setErrorMessage("ZZ01105");
                return;
			}
			
			KR0080010Struct odrNoStruct = (KR0080010Struct) odrNoList.get(0);
            //[売上実績]."更新数" != ｢更新数｣(hidden使用)の場合
            if (!odrNoStruct.getSALSE_MODIFY_COUNT().equals(struct.getSALSE_MODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //役務実績を検索する
			List serviceDataList = entity.mselectT_SERVICE.read(conn, struct);
			if(serviceDataList.isEmpty()){
			 //[役務実績]にデータが存在しない場合
				setErrorMessage("ZZ01105");
                return;
			 }
			
			KR0080010Struct serviceStruct = (KR0080010Struct) serviceDataList.get(0);
            //[役務実績]."更新数" != ｢更新数｣(hidden使用)の場合
            if (!serviceStruct.getMODIFY_COUNT().equals(struct.getMODIFY_COUNT())) {
             setErrorMessage("ZZ01105");
             return;
            }
            
            //売掛導入していない場合、システムパラメータ売上実績承認チェック
            chkAprSales();
            if (msgStruct.hasError()) {                	 
                return;
            }
            //「売掛管理」サブシステム
			List installOptionsList = entity.mselectSYS_INSTALL_OPTIONS.read(conn, struct);
			//[売掛金トランヘッダ] を検索する
			List listLedgerHTrn = entity.mselectT_AR_LEDGER_H_TRN.read(conn, struct);
			//[売掛金元帳ヘッダ] を検索する
			List listLedgerH = entity.mselectT_AR_LEDGER_H.read(conn, struct);
			
            //[売上実績]（赤伝）登録用データを生成
            KR0080010Struct creditRecordStruct = createCreditRecord();
            
            //売上実績管理番号(連番)
            List creditSalesSeqNoList = entity.mSEQ_SALES_SEQ_NO.read(conn, struct);
            KR0080010Struct creditSalesSeqNoStruct = (KR0080010Struct) creditSalesSeqNoList.get(0);
            creditRecordStruct.setSALES_SEQ_NO(creditSalesSeqNoStruct.getSALES_SEQ_NO());
            
            if (installOptionsList.isEmpty()
					|| (!installOptionsList.isEmpty() && !listLedgerHTrn.isEmpty())) {
            	// 伝票番号は｢伝票番号｣を使用
				creditRecordStruct.setSLIP_CD(struct.getSLIP_CD());
            }else if (!installOptionsList.isEmpty() && !listLedgerH.isEmpty()) {
            	//赤伝票番号を自動採番
                Numbering redSlipCdNum =
                 new Numbering(conn, Numbering.SLIP_CD, sysUSER_CD, sp.getProcId(), this.getSalesPLANT_CD());
                creditRecordStruct.setSLIP_CD(redSlipCdNum.getNo());
            }
            
            //元伝票番号
            creditRecordStruct.setORG_SLIP_CD(struct.getSLIP_CD());
            //[売上実績]（赤伝）を登録
            entity.mT_SALES_CreditRecord.create(conn, creditRecordStruct);
        
            //[売上実績]（黒伝）を論理削除
            entity.mT_SALES_Delete.update(conn, struct);
            
            //インストールオプションの取得
			List tempList = entity.mSYS_INSTALL_OPTIONS_Ai.read(conn, struct);
			if (tempList.isEmpty()) {
				struct.seth_INSTALL_FLG(null);			
			}else{
				struct.seth_INSTALL_FLG(((KR0080010Struct)tempList.get(0)).geth_INSTALL_FLG());
			}
			
	        if (!installOptionsList.isEmpty() && !"1".equals(struct.geth_INSTALL_FLG())){
	            //売掛管理がインストールされている場合
	        	
	        	KZ0010P001 tempKZ0010P001= new KZ0010P001(conn);
	        	tempKZ0010P001.setParameter("8", struct.getsUser_ID(), struct.getSLIP_CD(),
						creditRecordStruct.getSLIP_CD(), null, struct.getTAX_CD());
				String msgNo = tempKZ0010P001.execute();
				if (!"0".equals(msgNo)) {
					setErrorMessage(msgNo);
					conn.rollback();
					return;
				}
	        }
	         //[役務実績履歴]登録用データを生成
			 List hsTServiceList = entity.mselectData.read(conn, struct);
	         KR0080010Struct hsTServiceStruct = (KR0080010Struct) hsTServiceList.get(0);
	         
	         KR0080010Struct tServiceStruct = new KR0080010Struct();
	         //伝票番号
	         tServiceStruct.setSLIP_CD(creditRecordStruct.getSLIP_CD());
	         //受注番号
	         tServiceStruct.setODR_NO(struct.getODR_NO());
	         //役務実績管理番号
	         tServiceStruct.seth_CTL_SEQ_CD(struct.geth_CTL_SEQ_CD());
	         setStructSystemData(tServiceStruct);
	         //[役務実績] を論理削除する
	         entity.mT_SERVICE_Delete.update(conn, tServiceStruct);
	         
	         //履歴管理番号(連番)
             List hsServiceSeqNoList = entity.mSEQ_HS_CTL_SEQ_CD.read(conn, struct);
             KR0080010Struct hsServiceSeqNoStruct = (KR0080010Struct) hsServiceSeqNoList.get(0);
             hsTServiceStruct.setHS_CTL_SEQ_CD(hsServiceSeqNoStruct.getHS_CTL_SEQ_CD());
             //伝票番号
             hsTServiceStruct.setSLIP_CD(creditRecordStruct.getSLIP_CD());
             //受注番号
             hsTServiceStruct.setODR_NO(struct.getODR_NO());
	         //新旧フラグ
	         hsTServiceStruct.setNEW_OLD_FLG("1");
             //処理区分
	         hsTServiceStruct.setTRAN_TYPE("3");
             //訂正区分
	         hsTServiceStruct.setCRCT_TYP("1");
	         setStructSystemData(hsTServiceStruct);
	         //[役務実績履歴] に登録する
	         entity.mHS_T_SERVICE_CreditRecord.create(conn, hsTServiceStruct);
	         
	         //非在庫受注を検索する
             List chkUnstokList = entity.mselsectT_ODR_UNSTOCK.read(conn, struct);
			 if(chkUnstokList.isEmpty()){
			  //[非在庫受注]にデータが存在しない場合
				setErrorMessage("ZZ01105");
                return;
			 }
			
			 KR0080010Struct unstokStruct = (KR0080010Struct) chkUnstokList.get(0);
			 
			 if("1".equals(unstokStruct.getODR_CMPLT_FLG())){
				//[非在庫受注]."更新数" != ｢更新数｣(hidden使用)の場合
	             if (!unstokStruct.getUNSTOCK_MODIFY_COUNT().equals(struct.getUNSTOCK_MODIFY_COUNT())) {
	              setErrorMessage("ZZ01105");
	              return;
	             }
	            
	        	 //非在庫受注の更新、0:未完了
	        	 entity.mupdateT_ODR_UNSTOCK1.update(conn, struct);
			 }
             
	      //受注番号をクリア
          struct.setODR_NO(null);
	      //画面をクリア
          controlClear();
           
          conn.commit();
		} catch(SQLException e) {
			throw new ExpjException(e);
//			e.printStackTrace();
			//エラー処理を記述してください。
		}finally {
	         if (conn != null) {
	             conn.rollback();
	            }
	   		}
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			//TODO: ユーザ定義のコードを記述してください
		initializeDetail();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			//TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			//TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		
		try {
            //販売用工場コード
            List codeList = entity.mSYS_CLASS_CODE.read(conn, struct);
            if (!codeList.isEmpty()) {
             KR0080010Struct codeStruct = (KR0080010Struct)codeList.get(0);
             this.setSalesPLANT_CD(codeStruct.getSYS_CLASS_CODE());
            }
            else {
             this.setSalesPLANT_CD("");
            }
         
            //自社コード
            List companyCodeList = entity.mselectCOMPANY_CD.read(conn, struct);
            if(companyCodeList.isEmpty()){
            	//自社コード を取得できなかった場合
            	ExpjMessage emsg = new ExpjMessage( "KQ00039" );
        		sysLog.severe(emsg, getsysUSER_CD());
        		ExpjException ee = new ExpjException(emsg);
        		throw ee;
            }
            //自社コード
            KR0080010Struct companyCodeStruct = (KR0080010Struct)companyCodeList.get(0);
            struct.setCOMPANY_CD(companyCodeStruct.getCOMPANY_CD());
            
            //業務日付
            List businessDateList = entity.mselectBUSINESS_DATE.read(conn, struct);
            if(businessDateList.isEmpty()){
            	//日付計算用工場コード が取得できなかった場合、あるいは業務運用日 を取得できなかった場合
            	ExpjMessage emsg = new ExpjMessage( "KQ00026" );
        		sysLog.severe(emsg, getsysUSER_CD());
        		ExpjException ee = new ExpjException(emsg);
        		throw ee;
            }
            //業務日付
            KR0080010Struct businessDateStruct = (KR0080010Struct)businessDateList.get(0);
            setBusinessOprDate(businessDateStruct.getBUSINESS_OPR_DATE());
            
            //賃率
            List payRateList = entity.mselectPAY_RATE.read(conn, struct);
            if(payRateList.isEmpty()){
            	//賃率のシステムパラメータを取得できなかった場合
            	ExpjMessage emsg = new ExpjMessage( "KM00028" );
        		sysLog.severe(emsg, getsysUSER_CD());
        		ExpjException ee = new ExpjException(emsg);
        		throw ee;
            }else{
            	KR0080010Struct payRateStruct = (KR0080010Struct)payRateList.get(0);
            	if(Calculate.compare(payRateStruct.getPAY_RATE(), "0") <= 0){
            		//0より大きい数値でなかった場合
            		ExpjMessage emsg = new ExpjMessage( "KM00028" );
            		sysLog.severe(emsg, getsysUSER_CD());
            		ExpjException ee = new ExpjException(emsg);
            		throw ee;
            	}
            }
            
           } catch (SQLException e) {
            throw new ExpjException(e);
           }
		
		//初期化
		initializeDetail();
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KR0080");
		logger.entering("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			//TODO: ユーザ定義のコードを記述してください
			//コンボボックス部品のデータのセットはここに記述してください。
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KR0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			//TODO: ユーザ定義のコードを記述してください
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
//			throw new FoundationException("KR0080010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
			//TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0080010-E999","CSVの出力処理"));
			throw new FoundationException("KR0080010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0080010-E999","システム日付の取得処理"));
				throw new FoundationException("KR0080010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			//TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KR0080010-E999","コントロールのイベント処理"));
			throw new FoundationException("KR0080010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KR0080010Entity entity;
	protected KR0080010Struct struct;
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

		entity = new KR0080010Entity();
		struct = new KR0080010Struct();

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
	 * KR0080010クラスの標準コンストラクタ
	 */
	public KR0080010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			//TODO: ここに初期処理を記述してください
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
			//TODO: インスタンス消滅時に実行する処理を記述してください
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
				KR0080010Struct key = (KR0080010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_SALES_UNIT_PRICE") && key.geth_SALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("h_SALES_UNIT_PRICE", key.geth_SALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO_2") && key.getODR_NO_2() != null) {
					msgKey.setKeyValue("ODR_NO_2", key.getODR_NO_2());
				}
				if(msgKeyType.containsKeyColumn("UNSTOCK_MODIFY_COUNT") && key.getUNSTOCK_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("UNSTOCK_MODIFY_COUNT", key.getUNSTOCK_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG") && key.getODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("ODR_CMPLT_FLG", key.getODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("haveFlag") && key.gethaveFlag() != null) {
					msgKey.setKeyValue("haveFlag", key.gethaveFlag());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_CTL_SEQ_CD") && key.geth_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("h_CTL_SEQ_CD", key.geth_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TRN_CD") && key.getSLIP_TRN_CD() != null) {
					msgKey.setKeyValue("SLIP_TRN_CD", key.getSLIP_TRN_CD());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_COMP_FLG") && key.getJOB_ODR_COMP_FLG() != null) {
					msgKey.setKeyValue("JOB_ODR_COMP_FLG", key.getJOB_ODR_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_NO") && key.getDETAIL_NO() != null) {
					msgKey.setKeyValue("DETAIL_NO", key.getDETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_DATE") && key.getSALES_DATE() != null) {
					msgKey.setKeyValue("SALES_DATE", key.getSALES_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME") && key.getCUST_CHRG_PSN_NAME() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_NAME", key.getCUST_CHRG_PSN_NAME());
				}
				if(msgKeyType.containsKeyColumn("SALES_QTY") && key.getSALES_QTY() != null) {
					msgKey.setKeyValue("SALES_QTY", key.getSALES_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE") && key.getSALES_UNIT_PRICE() != null) {
					msgKey.setKeyValue("SALES_UNIT_PRICE", key.getSALES_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT") && key.getSALES_AMOUNT() != null) {
					msgKey.setKeyValue("SALES_AMOUNT", key.getSALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SALES_AMOUNT_YEN") && key.getSALES_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("SALES_AMOUNT_YEN", key.getSALES_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_RATE") && key.getPAY_RATE() != null) {
					msgKey.setKeyValue("PAY_RATE", key.getPAY_RATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME_1") && key.getITEM_NAME_1() != null) {
					msgKey.setKeyValue("ITEM_NAME_1", key.getITEM_NAME_1());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SALSE_MODIFY_COUNT") && key.getSALSE_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SALSE_MODIFY_COUNT", key.getSALSE_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO") && key.geth_SALES_SEQ_NO() != null) {
					msgKey.setKeyValue("h_SALES_SEQ_NO", key.geth_SALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG") && key.getAI_AR_IF_FLG() != null) {
					msgKey.setKeyValue("AI_AR_IF_FLG", key.getAI_AR_IF_FLG());
				}
				if(msgKeyType.containsKeyColumn("SALES_SEQ_NO") && key.getSALES_SEQ_NO() != null) {
					msgKey.setKeyValue("SALES_SEQ_NO", key.getSALES_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("SALES_TYP") && key.getSALES_TYP() != null) {
					msgKey.setKeyValue("SALES_TYP", key.getSALES_TYP());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_CD") && key.getSALES_DEPT_CD() != null) {
					msgKey.setKeyValue("SALES_DEPT_CD", key.getSALES_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD") && key.getPRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("PRD_ODR_PLACE_CD", key.getPRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD") && key.getODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("ODR_ACPT_PSN_CD", key.getODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
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
				if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getOWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ORG_SLIP_CD") && key.getORG_SLIP_CD() != null) {
					msgKey.setKeyValue("ORG_SLIP_CD", key.getORG_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("CURRNCY_CD") && key.getCURRNCY_CD() != null) {
					msgKey.setKeyValue("CURRNCY_CD", key.getCURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO") && key.getSPCL_PRICE_CO() != null) {
					msgKey.setKeyValue("SPCL_PRICE_CO", key.getSPCL_PRICE_CO());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("DEL_FLG") && key.getDEL_FLG() != null) {
					msgKey.setKeyValue("DEL_FLG", key.getDEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_FLG") && key.getAPPR_FLG() != null) {
					msgKey.setKeyValue("APPR_FLG", key.getAPPR_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPR_ID") && key.getAPPR_ID() != null) {
					msgKey.setKeyValue("APPR_ID", key.getAPPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_DATE") && key.getAPPR_DATE() != null) {
					msgKey.setKeyValue("APPR_DATE", key.getAPPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("CTL_SEQ_CD") && key.getCTL_SEQ_CD() != null) {
					msgKey.setKeyValue("CTL_SEQ_CD", key.getCTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_TIME") && key.getWORK_TIME() != null) {
					msgKey.setKeyValue("WORK_TIME", key.getWORK_TIME());
				}
				if(msgKeyType.containsKeyColumn("WORK_DATE") && key.getWORK_DATE() != null) {
					msgKey.setKeyValue("WORK_DATE", key.getWORK_DATE());
				}
				if(msgKeyType.containsKeyColumn("WORK_PERSON_CD") && key.getWORK_PERSON_CD() != null) {
					msgKey.setKeyValue("WORK_PERSON_CD", key.getWORK_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_REMARKS") && key.getWORK_REMARKS() != null) {
					msgKey.setKeyValue("WORK_REMARKS", key.getWORK_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("HS_CTL_SEQ_CD") && key.getHS_CTL_SEQ_CD() != null) {
					msgKey.setKeyValue("HS_CTL_SEQ_CD", key.getHS_CTL_SEQ_CD());
				}
				if(msgKeyType.containsKeyColumn("NEW_OLD_FLG") && key.getNEW_OLD_FLG() != null) {
					msgKey.setKeyValue("NEW_OLD_FLG", key.getNEW_OLD_FLG());
				}
				if(msgKeyType.containsKeyColumn("TRAN_TYPE") && key.getTRAN_TYPE() != null) {
					msgKey.setKeyValue("TRAN_TYPE", key.getTRAN_TYPE());
				}
				if(msgKeyType.containsKeyColumn("CRCT_TYP") && key.getCRCT_TYP() != null) {
					msgKey.setKeyValue("CRCT_TYP", key.getCRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("APR_SALES_VALUE") && key.getAPR_SALES_VALUE() != null) {
					msgKey.setKeyValue("APR_SALES_VALUE", key.getAPR_SALES_VALUE());
				}
				if(msgKeyType.containsKeyColumn("SALES_DEPT_NAME") && key.getSALES_DEPT_NAME() != null) {
					msgKey.setKeyValue("SALES_DEPT_NAME", key.getSALES_DEPT_NAME());
				}
				if(msgKeyType.containsKeyColumn("WORK_PERSON_NAME") && key.getWORK_PERSON_NAME() != null) {
					msgKey.setKeyValue("WORK_PERSON_NAME", key.getWORK_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("USER_CD") && key.getUSER_CD() != null) {
					msgKey.setKeyValue("USER_CD", key.getUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE") && key.getSYS_CLASS_CODE() != null) {
					msgKey.setKeyValue("SYS_CLASS_CODE", key.getSYS_CLASS_CODE());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("h_INSTALL_FLG") && key.geth_INSTALL_FLG() != null) {
					msgKey.setKeyValue("h_INSTALL_FLG", key.geth_INSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT") && key.getSEL_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SEL_MODIFY_COUNT", key.getSEL_MODIFY_COUNT());
				}
				//{{user_implement_dev:setOrMsgKey
					//TODO: キー情報設定のコードを追加してください
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
					KR0080010Struct key = new KR0080010Struct();
					if(msgKeyType.containsKeyColumn("h_SALES_UNIT_PRICE")) {
						key.seth_SALES_UNIT_PRICE(msgKey.getKeyValue("h_SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO_2")) {
						key.setODR_NO_2(msgKey.getKeyValue("ODR_NO_2"));
					}
					if(msgKeyType.containsKeyColumn("UNSTOCK_MODIFY_COUNT")) {
						key.setUNSTOCK_MODIFY_COUNT(msgKey.getKeyValue("UNSTOCK_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CMPLT_FLG")) {
						key.setODR_CMPLT_FLG(msgKey.getKeyValue("ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("haveFlag")) {
						key.sethaveFlag(msgKey.getKeyValue("haveFlag"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_CTL_SEQ_CD")) {
						key.seth_CTL_SEQ_CD(msgKey.getKeyValue("h_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TRN_CD")) {
						key.setSLIP_TRN_CD(msgKey.getKeyValue("SLIP_TRN_CD"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_COMP_FLG")) {
						key.setJOB_ODR_COMP_FLG(msgKey.getKeyValue("JOB_ODR_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_NO")) {
						key.setDETAIL_NO(msgKey.getKeyValue("DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DATE")) {
						key.setSALES_DATE(msgKey.getKeyValue("SALES_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_NAME")) {
						key.setCUST_CHRG_PSN_NAME(msgKey.getKeyValue("CUST_CHRG_PSN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SALES_QTY")) {
						key.setSALES_QTY(msgKey.getKeyValue("SALES_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_UNIT_PRICE")) {
						key.setSALES_UNIT_PRICE(msgKey.getKeyValue("SALES_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT")) {
						key.setSALES_AMOUNT(msgKey.getKeyValue("SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SALES_AMOUNT_YEN")) {
						key.setSALES_AMOUNT_YEN(msgKey.getKeyValue("SALES_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_RATE")) {
						key.setPAY_RATE(msgKey.getKeyValue("PAY_RATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME_1")) {
						key.setITEM_NAME_1(msgKey.getKeyValue("ITEM_NAME_1"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SALSE_MODIFY_COUNT")) {
						key.setSALSE_MODIFY_COUNT(msgKey.getKeyValue("SALSE_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_SALES_SEQ_NO")) {
						key.seth_SALES_SEQ_NO(msgKey.getKeyValue("h_SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("AI_AR_IF_FLG")) {
						key.setAI_AR_IF_FLG(msgKey.getKeyValue("AI_AR_IF_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SALES_SEQ_NO")) {
						key.setSALES_SEQ_NO(msgKey.getKeyValue("SALES_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("SALES_TYP")) {
						key.setSALES_TYP(msgKey.getKeyValue("SALES_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_CD")) {
						key.setSALES_DEPT_CD(msgKey.getKeyValue("SALES_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PRD_ODR_PLACE_CD")) {
						key.setPRD_ODR_PLACE_CD(msgKey.getKeyValue("PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_ACPT_PSN_CD")) {
						key.setODR_ACPT_PSN_CD(msgKey.getKeyValue("ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
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
					if(msgKeyType.containsKeyColumn("OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setOWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ORG_SLIP_CD")) {
						key.setORG_SLIP_CD(msgKey.getKeyValue("ORG_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("CURRNCY_CD")) {
						key.setCURRNCY_CD(msgKey.getKeyValue("CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPCL_PRICE_CO")) {
						key.setSPCL_PRICE_CO(msgKey.getKeyValue("SPCL_PRICE_CO"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("DEL_FLG")) {
						key.setDEL_FLG(msgKey.getKeyValue("DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_FLG")) {
						key.setAPPR_FLG(msgKey.getKeyValue("APPR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPR_ID")) {
						key.setAPPR_ID(msgKey.getKeyValue("APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_DATE")) {
						key.setAPPR_DATE(msgKey.getKeyValue("APPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CTL_SEQ_CD")) {
						key.setCTL_SEQ_CD(msgKey.getKeyValue("CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_TIME")) {
						key.setWORK_TIME(msgKey.getKeyValue("WORK_TIME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_DATE")) {
						key.setWORK_DATE(msgKey.getKeyValue("WORK_DATE"));
					}
					if(msgKeyType.containsKeyColumn("WORK_PERSON_CD")) {
						key.setWORK_PERSON_CD(msgKey.getKeyValue("WORK_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_REMARKS")) {
						key.setWORK_REMARKS(msgKey.getKeyValue("WORK_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("HS_CTL_SEQ_CD")) {
						key.setHS_CTL_SEQ_CD(msgKey.getKeyValue("HS_CTL_SEQ_CD"));
					}
					if(msgKeyType.containsKeyColumn("NEW_OLD_FLG")) {
						key.setNEW_OLD_FLG(msgKey.getKeyValue("NEW_OLD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TRAN_TYPE")) {
						key.setTRAN_TYPE(msgKey.getKeyValue("TRAN_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_TYP")) {
						key.setCRCT_TYP(msgKey.getKeyValue("CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("APR_SALES_VALUE")) {
						key.setAPR_SALES_VALUE(msgKey.getKeyValue("APR_SALES_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("SALES_DEPT_NAME")) {
						key.setSALES_DEPT_NAME(msgKey.getKeyValue("SALES_DEPT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("WORK_PERSON_NAME")) {
						key.setWORK_PERSON_NAME(msgKey.getKeyValue("WORK_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("USER_CD")) {
						key.setUSER_CD(msgKey.getKeyValue("USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SYS_CLASS_CODE")) {
						key.setSYS_CLASS_CODE(msgKey.getKeyValue("SYS_CLASS_CODE"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("h_INSTALL_FLG")) {
						key.seth_INSTALL_FLG(msgKey.getKeyValue("h_INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT")) {
						key.setSEL_MODIFY_COUNT(msgKey.getKeyValue("SEL_MODIFY_COUNT"));
					}
					//{{user_implement_dev:getOrMsgKey
						//TODO: キー情報取得のコードを追加してください
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
