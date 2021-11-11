/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0060/src/com/nec/jp/orteus/metamorBase/KU0060/KU0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0060;

import com.nec.jp.orteus.metamorBase.KU0060.*;
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
import com.nec.jp.orteus.metamorBase.common06.util.numberUtil;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.*;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KU0060010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.17 $ $Date: 2015/11/16 05:16:52 $
 *
 */
//}}user_implement_code_header

public class KU0060010Control
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
	public KU0060010Struct getListvalue(int x) { return (KU0060010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KU0060010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KU0060010Struct createStruct() { return new KU0060010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KU0060010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください

	public int getListsize(List _list) {
		int nret = 0;
		if( _list != null ) {nret = _list.size();}
		return nret;
	}


// 出荷指示メンテナンスと同様スタート


	/** システム分類 */
  private final static String m_kSYS_CLASS = "SYSTEM";

	/** TAX KBN */
	private String TAX_KBN = "";

	/** 通常の預託倉庫区分 */
	private final static String m_kNORMAL_DEPOTYP = "10";

	/** 預託の預託倉庫区分 */
	private final static String m_kYOTO_DEPOTYP = "20";

  /** 整数管理区分 */
  private String unitQtyType = "";

//------------------------------------------------------------------------------

	/**
	 * 納入予定日
	 *
	 * @param KU0060010Struct Struct
	 * @return 算出後の納入予定日
	 */
	private String getScdlDlvDate(KU0060010Struct wst, String strDesinatedShipDate,String strTransportLt) throws ParseException,FoundationException
	{
		String rv = null;

		//出荷指定日
		GregorianCalendar inpDate = new GregorianCalendar();
		inpDate.setTime(Converter.strToDate(strDesinatedShipDate, "yyyy/MM/dd"));

		//出荷指定日を計算基準日にする
		Date wkDate = inpDate.getTime();

		int addValue = Integer.parseInt(strTransportLt);

		//業務日付計算
		//指定納期から運送日数、出荷準備L/Tを引く
		WorkDay wkd = new WorkDay(struct.getsUser_ID(),	//ユーザコード
				this.getBusiness().getBusinessCd(),		//業務コード
				struct.getstrPLANT_CD(),					//工場コード
				wkDate,										//対象日付
				addValue,			                		//加算日
				(addValue < 0 ? true : false)		        //前倒しフラグ
				);
		wkDate = wkd.calcDate();							//計算結果
		if(wkDate == null){
			//エラー
			return null;

		}
		rv = new String(Converter.dateToStr(wkDate, "yyyy/MM/dd"));
		return rv;
	}

	/**
	 * 消費税金額計算
	 * @param  String strCustCd 顧客コード
   * @param  String strItemCd 品番
   * @param  String strAmount 出荷指示金額
   * @param  String strCurrncyCd 通貨コード
	 * @return String rv 消費税金額
	 *
	 * */
	private String[] doCalcuTaxAmount(KU0060010Struct wst, String strCustCd,
	                                  String strCompanyCd, String strItemCd,
                                      String strAmount, String strCurrncyCd)
                                      throws ParseException, FoundationException, SQLException{

		String rv[] = new String[3];

		//消費税マスタから取得
		wst.setstrTaxIN_COMPANYCD(strCompanyCd);
		wst.setstrTaxIN_CUSTCD(strCustCd);
		//wst.setstrTaxIN_ITEMCD(strItemCd);

		String strTaxKbn = "";	//税込区分
		String strStartDate ="";	//新消費税コード開始日
	   	String strTaxRate[] = new String[3];	//税率
		String strRoundTyp = "";
		//Add Start 20131218 zhang-jq
		String strINSPC_ACPT_TYP = "";//検収区分
		String strTAX_CD = "";//消費税コード
		strINSPC_ACPT_TYP = wst.getmCust_INSPC_ACPT_TYP();
		wst.settOdr_IN_ODRNO(wst.getl_ODR_NO());
		List listTodr ;
		     listTodr = entity.mtbl_T_ODR.read(conn, wst);
		if(listTodr == null ||listTodr.size()!= 1 ){
		}else{
			//[受注明細]."消費税コードで
			strTAX_CD = ((KU0060010Struct)listTodr.get(0)).gettOdr_TAX_CD().toString();
			wst.setstrTAX_CD(strTAX_CD);
		}
		//Add End 20131218 zhang-jq
		List listTax;
		//Mod Start 20131218 zhang-jq
		//listTax = entity.mgetTax.read(conn, wst);
		listTax = entity.mgetTaxByTaxCd.read(conn, wst);
		//Mod End 20131218 zhang-jq

        wst.settCUR_CD(strCurrncyCd);
        List listCur = entity.mtblM_CUR.read(conn, wst);
        int decimalFig = 0;

		if(listTax == null || listTax.size() != 1){
		}else{
			this.TAX_KBN = ((KU0060010Struct)listTax.get(0)).getstrTaxTAX_KBN();
			strStartDate = ((KU0060010Struct)listTax.get(0)).getstrTaxSTART_DATE();
			strRoundTyp = ((KU0060010Struct)listTax.get(0)).getstrTaxROUND_TYP();

			//Mod Start 20131218 zhang-jq
			/*
			//税率設定(新消費税開始日<=出荷指定日の場合、新税率)
			if(this.isNewTax(wst, strStartDate)){
				strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
				strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
				strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
			} else {
				strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
				strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
				strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
			}
			*/
			if ("1".equals(strINSPC_ACPT_TYP)){
				//「得意先」. “検収区分”　＝ 1の場合（出荷基準）
				if(this.isNewTax("1",wst, strStartDate)){
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
				} else {
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
				}
				
			}else {
				//「得意先」. “検収区分”　は 1以外の場合（受領売上基準）
				if(this.isNewTax("2",wst, strStartDate)){
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
				} else {
					strTaxRate[0] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
					strTaxRate[1] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
					strTaxRate[2] = this.plZero(((KU0060010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
				}
			}
			//Mod End 20131218 zhang-jq
			//端数区分でROUNDを行う
			ExchAmount ex = new ExchAmount(conn);


      if (!listCur.isEmpty()) {
         decimalFig = Integer.parseInt(((KU0060010Struct)listCur.get(0)).gettDECIMAL_FIG());
      }

			for (int i = 0; i < 3; i ++) {
				String strIn = ex.doMul(strAmount,strTaxRate[i]);
				if ("0".equals(this.TAX_KBN)){
					strIn = "0";
				} else if ("1".equals(this.TAX_KBN)){
					strIn = String.valueOf(Double.parseDouble(strIn) / Double.parseDouble("100"));
				} else {
					strIn = String.valueOf(Double.parseDouble(strIn) / (Double.parseDouble("100")+Double.parseDouble(strTaxRate[i])));
				}

        if ("2".equals(strRoundTyp)) {
           // 切り上げ
           rv[i] = Calculate.ceil(strIn, decimalFig);
        }
        else if ("3".equals(strRoundTyp)) {
           // 切り捨て
           rv[i] = Calculate.floor(strIn, decimalFig);
        }
        else {
           // 四捨五入
           rv[i] = Calculate.round(strIn, decimalFig);
        }

			}
		}

		return rv;
	}

	/**
	 * 新消費税コード開始日と比較
	 *
	 */
	private boolean isNewTax(KU0060010Struct wst, String strStartDate) throws ParseException
	{
		boolean rv = false;

		//新消費税コード開始日
		GregorianCalendar date1 = new GregorianCalendar();
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));

		//出荷指定日
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(wst.getl_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));

		//新消費税コード開始日 <= 出荷指定日の場合、新税率
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}
	//Add Start 20131218 zhang-jq
	/**
	 * 新消費税コード開始日と比較
	 *
	 */
	private boolean isNewTax(String flag,KU0060010Struct wst, String strStartDate) throws ParseException
	{
		boolean rv = false;
		
		//新消費税コード開始日
		GregorianCalendar date1 = new GregorianCalendar();
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));
		//出荷指定日
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(wst.getl_DESINATED_SHIP_DATE(), "yyyy/MM/dd"));
		//納品予定日
		GregorianCalendar date3 = new GregorianCalendar();
		date3.setTime(Converter.strToDate(wst.getin_tShipSlip_SCDL_DLV_DATE(), "yyyy/MM/dd"));
		
		if ("1".equals(flag)){
			//新消費税コード開始日 <= [出荷指示].出荷指定日の場合、新税率
			if(date1.getTime().compareTo(date2.getTime()) <= 0){
				rv = true;
			}
		}else{
			//新消費税コード開始日 <= [出荷指示].納品予定日の場合、新税率
			if(date1.getTime().compareTo(date3.getTime()) <= 0){
				rv = true;
			}
		}


		return rv;
	}
//Add End 20131218 zhang-jq

	private String doRound(String strIn, String strRoundTyp){

		String rv = strIn;

		int iPt;
		int i1 = 0;
		double d2,d3;

		iPt = rv.indexOf(".");

		if(iPt != -1){
			String str1 = rv.substring(0, iPt);
			if(!"".equals(str1)){
				i1 = Integer.parseInt(str1);
			}
			d2 = Double.parseDouble(rv.substring(iPt+1));
			d3 = Double.parseDouble(rv.substring(iPt+1,iPt+2));
			if("2".equals(strRoundTyp)){
				if(d2 > 0){
					i1 += 1;
				}
			}else if("1".equals(strRoundTyp)){
				if(d3 > 4){
					i1 += 1;
				}
			}
			rv = i1 + "";
		}
		return rv;
	}

	private String plZero(String strIn){
		String rv = strIn;
		int ipt = rv.indexOf(".");

		if(ipt==0){
			rv="0"+rv;
		}
		return rv;
	}

//--20040108消費税関連METHOD------------------------------------------------------------END

	private String replaceNull(String strIn){

		String rv="";

		if(strIn != null){
			rv = strIn;
		}

		return rv;
	}


	private String calMultiply(IDbConnection conn, String strIn1, String strIn2) throws SQLException{

		String rv = "";

		if(!"".equals(strIn1) && !"".equals(strIn2)){
			ExchAmount ex = new ExchAmount(conn);
			rv = ex.doMul(strIn1, strIn2);
		}

		return rv;

	}

	private String calCaseQty(String strShipQty, String strPkgUnitQty){

		String rv = "";

		if(!"".equals(strShipQty) && !"".equals(strPkgUnitQty)){

			rv = Double.parseDouble(strShipQty)/Double.parseDouble(strPkgUnitQty)+ "";
		}

		return rv;

	}

	private String calRestQty(String strShipQty, String strPkgUnitQty){

		String rv = "";

		if(!"".equals(strShipQty) && !"".equals(strPkgUnitQty)){

			rv = Double.parseDouble(strShipQty)%Double.parseDouble(strPkgUnitQty)+ "";

		}

		return rv;

	}

	private String doTruncate(String strIn){

		String rv = "";

		int iPt = strIn.indexOf(".");

		if(iPt != -1){
			rv= strIn.substring(0,iPt);
		}else{
			rv= strIn;
		}

		return rv;

	}

	/**
	 *　LPAD処理
	 *
	 * @return 結果
	 */
	private String doLpad(String strIn, int iLen, String strBlank){
		String rv = "";

		int istrInLen = strIn.length();

		if(istrInLen < iLen){
			for(int i=0; i<iLen-istrInLen; i++){
				rv += strBlank;
			}
		}
		rv += strIn;

		return rv;
	}

// 出荷指示メンテナンスから同様エンド

	// 出荷LT
	private String strSyuKaLt = "0";

	public String getstrSyuKaLt() {return this.strSyuKaLt;}
	public void setstrSyuKaLt(String strSyuKaLt) { this.strSyuKaLt = strSyuKaLt;}

	/**
	 * 出荷リードタイム取得
	 * @param KU0060010Struct st
	 * @return String 出荷リードタイム
	 * */
	private String getSYUKA_LT(KU0060010Struct st) throws FoundationException, SQLException {

		String syukalt = "0";
		List listShipCd = new ArrayList();
		
		listShipCd = entity.mgetSYUKA_LT.read(conn,st);
		if(getListsize(listShipCd) != 1){
			//出荷準備LTが無い
			//エラーメッセージ出力
		 	ExpjMessage emsg = new ExpjMessage("KQ00037");
			msgStruct.addError(emsg);
			}else{
			syukalt = ((KU0060010Struct)listShipCd.get(0)).getstrSYUKA_LT();
		}
		listShipCd = null;
		return syukalt;
	}



	private String strCompanyCd = "";

	/**
	 * SYSTEMの会社コード取得
	 * @param KU0060010Struct st
	 * @return String 会社コード
	 * */

	private String getstrCompanyCd(KU0060010Struct st) throws FoundationException, SQLException {
			
			String companyinfo = "";
	
			// stは実行されるＳＱＬに依存しない
			List listCompanyInfo = entity.mgetCompanyInfo.read(conn,st);
	
			if(listCompanyInfo == null || listCompanyInfo.size() != 1){
				//自社情報が無い/複数件
				ExpjMessage emsg = new ExpjMessage("KQ00039");
	      msgStruct.addError(emsg);	// エラーメッセージとして登録
	      sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
	      ExpjException ee = new ExpjException(emsg);
			}else{
				st.setstrCOMPANY_CD(((KU0060010Struct)listCompanyInfo.get(0)).getstrCOMPANY_CD());
				companyinfo = st.getstrCOMPANY_CD();
			}
			listCompanyInfo = null;
			return companyinfo;
	}
 
/**
	 * 出荷指示アラームリスト値設定
	 * @param KU0060010Struct s 
	 * @param List errorLst 出荷指示不可理由
	 **/
	private void setTUnShipList(KU0060010Struct s, List errorLst) {
		s.settUnShipList_CUST_CD(s.getl_CUST_CD()); // 得意先コード
		//s.settUnShipList_ACPT_ODR_CD(s.getl_ODR_NO()); // 受注番号
		//s.settUnShipList_PART_DLV_SEQ_NO(s.getl_PART_DLV_SEQ_NO()); // 分納項番
		s.settUnShipList_ITEM_CD(s.getl_ITEM_CD()); // 品目番号
		s.settUnShipList_UN_SHIP_QTY(s.getl_SHIP_QTY()); // 出荷指示不可数量
			
		Iterator _iterator = errorLst.iterator();
		String UnShipRsn = "";
		while (_iterator.hasNext()) {
			ExpjMessage msg = (ExpjMessage)_iterator.next();
			UnShipRsn = msg.getMessage(CoreTools.getLocale(getsysUSER_CD()));
		}

		s.settUnShipList_UN_SHIP_RSN(UnShipRsn); // 出荷指示不可理由
		s.settUnShipList_WH_CD(s.getl_WH_CD()); // 保管区コード
		s.settUnShipList_PRINT_FLG("0"); // 帳票出力フラグ
		s.settUnShipList_DEL_FLG("0"); // 削除フラグ
	}
		
	/**
	 * 出荷指示不可管理番号取得
	 * @param 受注番号、分納項番
	 * @return 出荷指示不可管理番号。取得できなければnull。
	 * @throws FoundationException
	 **/
	private String getTUnShipListUnShipSeqNo(String odrNo, String seqNo) throws FoundationException, SQLException {
		List rList = null;
		KU0060010Struct u = new KU0060010Struct();
		String unShipSeqNo = null;
		
		u.settUnShipList_ACPT_ODR_CD(odrNo);
		u.settUnShipList_PART_DLV_SEQ_NO(seqNo);
		
		rList = entity.mT_UN_SHIP_LIST_UN_SHIP_SEQ_NO.read(conn, u);
		if (!rList.isEmpty()) {
			unShipSeqNo = ((KU0060010Struct)rList.get(0)).gettUnShipList_UN_SHIP_SEQ_NO();
		}
		return unShipSeqNo;
	}
		
	/**
	 * 出荷指示不可削除
	 * @param 受注番号、分納項番
	 * @throws FoundationException
	 **/
	private void deleteUnShipList(String odrNo, String seqNo) throws FoundationException, SQLException {
		List rList = null;
		KU0060010Struct u = new KU0060010Struct();
		
		u.settUnShipList_ACPT_ODR_CD(odrNo);
		u.settUnShipList_PART_DLV_SEQ_NO(seqNo);
		
		entity.mtbl_T_UN_SHIP_LIST.delete(conn, u);
	}
		
		
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {

      this.conn.beginTransWeb();
			int maxLine = 0;

     ////////// ↓業務ロジック↓ //////////

			if (struct.getr1_SHIP_ODR().equals("true")) {
                // 表示最大行数
				maxLine = sp.getMaxLine(conn,10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				list = entity.mtbl_T_ANS_DLV_DATECnt.read(conn, struct);
				long rowCount = Long.parseLong(((KU0060010Struct) list.get(0)).getl_COUNT());
                // 出荷計画の存在チェック
				if(rowCount == 0){
					setReadStatus(NOT_FOUND);
					//存在しない場合エラー出力
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					setReadStatus(NOT_FOUND);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				} else {
				}
				
				// 最大行数を超過していたらエラー
				if(maxLine != 0 && rowCount == maxLine + 1){
					ExpjMessage emsg = new ExpjMessage( "ZZ01115" ,""+maxLine);
					msgStruct.addError( emsg );	// エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
					setReadStatus(TOO_MANY);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}
				// 出荷計画から出荷指示登録

				list = entity.mtbl_T_ANS_DLV_DATE.read(conn, struct);

				// 読み込み成功
				setReadStatus(NORMAL);

			}
			else
			{
                // 表示最大行数
				maxLine = sp.getMaxLine(conn,20);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);
				list = entity.mtbl_T_SHIP_ODRCnt.read(conn, struct);
				long rowCount = Long.parseLong(((KU0060010Struct) list.get(0)).getl_COUNT());
				if (rowCount == 0) {
					setReadStatus(NOT_FOUND);
					ExpjMessage emsg = new ExpjMessage("ZZ06001");
					msgStruct.addError(emsg);
					setReadStatus(NOT_FOUND);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}

				if(maxLine != 0 && rowCount == maxLine + 1){
					ExpjMessage emsg = new ExpjMessage( "ZZ01115" ,""+maxLine);
					msgStruct.addError( emsg );	// エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
					setReadStatus(TOO_MANY);
					if(list != null && list.size() > 0){
						list.clear();
					}
					return;
				}
				// 伝票番号をキーとして出荷指示削除
				list = entity.mtbl_T_SHIP_ODR.read(conn, struct);

				// 読み込み成功
				setReadStatus(NORMAL);
			}

	   	////////// ↑業務ロジック↑ //////////
			this.conn.commit();

		} catch(SQLException e) {
			e.printStackTrace();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" ); // サーバでエラーが発生しました
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成

			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
			throw ee;
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106"); // サーバでエラーが発生しました
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
    } finally {
      if (conn != null) {
        try {
           conn.rollback();
        } catch (FoundationException fe) {
					ExpjMessage emsg = new ExpjMessage( "ZZ01106"); // サーバでエラーが発生しました
					sysLog.severe(emsg, struct.getsUser_ID());
					ExpjException ee = new ExpjException(fe,emsg);
					emsg = new ExpjMessage( "AA99991");
					sysLog.severe(emsg, struct.getsUser_ID());
					emsg = new ExpjMessage( "ZZ01106",fe.toString());
					sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
				}
      }
    }
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 選択登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ユーザ定義のコードを記述してください
			Numbering SHIP_ODR_NO = null;		//出荷指示番号採番の準備
			Numbering SLIP_CD = null;			//伝票番号採番の準備

		try {

			// 一時テーブルのエントリを削除
			entity.mtbl_SHIP_T.delete(conn, struct);

			// 一時テーブルに格納
			int _tempLstCnt = 0;
			KU0060010Struct _tempStruct = new KU0060010Struct();

			// Orteus標準ユーザＩＤをセット
			_tempStruct.setsUser_ID(struct.getsUser_ID());

			List _tempOdrNoLst = struct.getList_l_ODR_NO();	// 受注番号
			List _tempPartDlvSeqNo = struct.getList_l_PART_DLV_SEQ_NO();	// 分納項番
			List _tempItemCd = struct.getList_l_ITEM_CD();	// 品目番号
			List _tempItemName = struct.getList_l_ITEM_NAME();	// 品目名
			List _tempDesinatedDlvDate = struct.getList_l_DESINATED_DLV_DATE();	// 指定納期
			List _tempDesinatedShipDate = struct.getList_l_DESINATED_SHIP_DATE();	// 出荷指定日
			List _tempShipQty = struct.getList_l_SHIP_QTY();	// 出荷指示数量
			List _tempRestShipQty = struct.getList_l_REST_SHIP_QTY();	// 出荷指示残数量
			List _tempWhCd = struct.getList_l_WH_CD();	// 保管区コード
			List _tempWhName = struct.getList_l_WH_NAME();	// 保管区名
			List _tempCDirectDlvFlg = struct.getList_l_c_DIRECT_DLV_FLG();	// 在庫チェックなしフラグ
			List _tempCustOdrNo = struct.getList_l_CUST_ODR_NO();	// 得意先注文番号
			List _tempCustCd = struct.getList_l_CUST_CD();	// 得意先コード
			List _tempCustName = struct.getList_l_CUST_NAME();	// 得意先名
			List _tempCustItemCd = struct.getList_l_CUST_ITEM_CD();	// 得意先品目番号
			List _tempCustItemName = struct.getList_l_CUST_ITEM_NAME();	// 得意先品目名

			List _tempStockUnit = struct.getList_l_STOCK_UNIT();	// 計量単位
			List _tempUnitQtyTyp = struct.getList_l_UNIT_QTY_TYP();	// 在庫数単位区分
			List _tempMrpOdrTyp = struct.getList_l_MRP_ODR_TYP();	// 品目手配区分
			List _tempTransportTyp = struct.getList_l_TRANSPORT_TYP();	// 輸送形態区分
			List _tempOdrUnitPrice = struct.getList_l_ODR_UNIT_PRICE();	// 受注単価
			List _tempSpclPriceTyp = struct.getList_l_SPCL_PRICE_TYP();	// 得値区分
			List _tempPartialShipInstFlg = struct.getList_l_PARTIAL_SHIP_INST_FLG();	// 分納出荷指示フラグ
			List _tempOdrCtlNo = struct.getList_l_ODR_CTL_NO();	// 受注管理番号
			List _tAnsDlvDateModifyCount = struct.getList_l_MODIFY_COUNT();	// モディファイカウント

			if (_tempOdrNoLst != null) {
				_tempLstCnt = _tempOdrNoLst.size();
			} else {
				_tempLstCnt = 0;
			}

			for (int i = 0; i < _tempLstCnt; i++) {

				_tempStruct.setl_ODR_NO((String)_tempOdrNoLst.get(i));	// 受注番号
				_tempStruct.setl_PART_DLV_SEQ_NO((String)_tempPartDlvSeqNo.get(i));	// 分納項番
				_tempStruct.setl_ITEM_CD((String)_tempItemCd.get(i));	// 品目番号
				_tempStruct.setl_ITEM_NAME((String)_tempItemName.get(i));	// 品目名
				_tempStruct.setl_DESINATED_DLV_DATE((String)_tempDesinatedDlvDate.get(i));	// 指定納期
				_tempStruct.setl_DESINATED_SHIP_DATE((String)_tempDesinatedShipDate.get(i));	// 出荷指定日
				_tempStruct.setl_SHIP_QTY(numberUtil.encodeNumberFormat((String)_tempShipQty.get(i)));	// 出荷指示数量
				_tempStruct.setl_REST_SHIP_QTY(numberUtil.encodeNumberFormat((String)_tempRestShipQty.get(i)));	// 出荷指示残数量
				_tempStruct.setl_WH_CD((String)_tempWhCd.get(i));	// 保管区コード
				_tempStruct.setl_WH_NAME((String)_tempWhName.get(i));	// 保管区名

				// 画面上でtrue/falseを1or0とする
				// 在庫チェックなしフラグ
				if (_tempCDirectDlvFlg.get(i).equals("true")) {
					_tempStruct.setl_c_DIRECT_DLV_FLG("1");
				} else {
					_tempStruct.setl_c_DIRECT_DLV_FLG("0");
				}

				_tempStruct.setl_CUST_ODR_NO((String)_tempCustOdrNo.get(i));	// 得意先注文番号
				_tempStruct.setl_CUST_CD((String)_tempCustCd.get(i));	// 得意先コード
				_tempStruct.setl_CUST_NAME((String)_tempCustName.get(i));	// 得意先名
				_tempStruct.setl_CUST_ITEM_CD((String)_tempCustItemCd.get(i));	// 得意先品目番号
				_tempStruct.setl_CUST_ITEM_NAME((String)_tempCustItemName.get(i));	// 得意先品目名
				_tempStruct.setl_STOCK_UNIT((String)_tempStockUnit.get(i));	// 計量単位
				_tempStruct.setl_UNIT_QTY_TYP((String)_tempUnitQtyTyp.get(i));	// 在庫数単位区分
				_tempStruct.setl_MRP_ODR_TYP((String)_tempMrpOdrTyp.get(i));	// 品目手配区分
				_tempStruct.setl_TRANSPORT_TYP((String)_tempTransportTyp.get(i));	// 輸送形態区分
				_tempStruct.setl_ODR_UNIT_PRICE(numberUtil.encodeNumberFormat((String)_tempOdrUnitPrice.get(i)));	// 受注単価
				_tempStruct.setl_SPCL_PRICE_TYP((String)_tempSpclPriceTyp.get(i));	// 得値区分
				_tempStruct.setl_PARTIAL_SHIP_INST_FLG((String)_tempPartialShipInstFlg.get(i));	// 分納出荷指示フラグ
				_tempStruct.setl_ODR_CTL_NO((String)_tempOdrCtlNo.get(i));	// 受注管理番号
				_tempStruct.settAnsDlvDate_MODIFY_COUNT((String)_tAnsDlvDateModifyCount.get(i));	// モディファイカウント

				entity.mtbl_SHIP_T.create(conn, _tempStruct);
			}

			this.conn.commit();


      // 変数をクリアしておく。
			_tempLstCnt = 0;
			_tempStruct.clear();

			// 品目、保管区、出荷指定日、受注番号、分納項番でソートする
			// structは実行されるＳＱＬに影響しない
			List _tempShipList = entity.mtbl_SHIP_T.read(conn, struct);
			int _tempShipLstCnt = getListsize(_tempShipList);


			// 一行ごとに出荷指示処理を行う

			// 成功、ワーニング、失敗カウント
			int[] status = new int[3];
			status[0] = 0; // 成功件数
			status[1] = 0; // ワーニング件数
			status[2] = 0; // 失敗件数

			for(int i = 0; i < _tempShipLstCnt; i++) {


			// トランザクションスタート
			this.conn.beginTransWeb();
				
				boolean success = true; // 成功／失敗
				boolean warning = false; // ワーニング
				ArrayList _errorlst = new ArrayList();
				
				try {

				// 変数格納
				_tempStruct.setl_ODR_NO(((KU0060010Struct)_tempShipList.get(i)).getl_ODR_NO());	// 受注番号
				_tempStruct.setl_PART_DLV_SEQ_NO(((KU0060010Struct)_tempShipList.get(i)).getl_PART_DLV_SEQ_NO());	// 分納項番
				_tempStruct.setl_ITEM_CD(((KU0060010Struct)_tempShipList.get(i)).getl_ITEM_CD()); // 品目番号
				_tempStruct.setl_ITEM_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_ITEM_NAME()); // 品目名
				_tempStruct.setl_DESINATED_DLV_DATE(((KU0060010Struct)_tempShipList.get(i)).getl_DESINATED_DLV_DATE());	// 指定納期
				_tempStruct.setl_DESINATED_SHIP_DATE(((KU0060010Struct)_tempShipList.get(i)).getl_DESINATED_SHIP_DATE());	// 出荷指定日
				_tempStruct.setl_SHIP_QTY(((KU0060010Struct)_tempShipList.get(i)).getl_SHIP_QTY());	// 出荷指示数量
				_tempStruct.setl_REST_SHIP_QTY(((KU0060010Struct)_tempShipList.get(i)).getl_REST_SHIP_QTY());	// 出荷指示残数量
				_tempStruct.setl_WH_CD(((KU0060010Struct)_tempShipList.get(i)).getl_WH_CD());	// 保管区コード
				_tempStruct.setl_WH_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_WH_NAME());	// 保管区名
				_tempStruct.setl_c_DIRECT_DLV_FLG(((KU0060010Struct)_tempShipList.get(i)).getl_c_DIRECT_DLV_FLG());	// 在庫チェックフラグ
				_tempStruct.setl_CUST_ODR_NO(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_ODR_NO());	// 得意先注文番号
				_tempStruct.setl_CUST_CD(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_CD());	// 得意先コード
				_tempStruct.setl_CUST_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_NAME());	// 得意先名
				_tempStruct.setl_CUST_ITEM_CD(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_ITEM_CD());	// 得意先品目番号
				_tempStruct.setl_CUST_ITEM_NAME(((KU0060010Struct)_tempShipList.get(i)).getl_CUST_ITEM_NAME());	// 得意先品目名
				_tempStruct.setl_STOCK_UNIT(((KU0060010Struct)_tempShipList.get(i)).getl_STOCK_UNIT());	// 計量単位
				_tempStruct.setl_UNIT_QTY_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_UNIT_QTY_TYP());	// 在庫数単位区分
				_tempStruct.setl_MRP_ODR_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_MRP_ODR_TYP());	// 品目手配区分
				_tempStruct.setl_TRANSPORT_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_TRANSPORT_TYP());	// 輸送形態区分
				_tempStruct.setl_ODR_UNIT_PRICE(((KU0060010Struct)_tempShipList.get(i)).getl_ODR_UNIT_PRICE());	// 受注単価
				_tempStruct.setl_SPCL_PRICE_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_SPCL_PRICE_TYP());	// 得値区分
				_tempStruct.setl_PARTIAL_SHIP_INST_FLG(((KU0060010Struct)_tempShipList.get(i)).getl_PARTIAL_SHIP_INST_FLG());	// 分納出荷指示フラグ
				_tempStruct.setl_ODR_CTL_NO(((KU0060010Struct)_tempShipList.get(i)).getl_ODR_CTL_NO());	// 受注管理番号
				_tempStruct.setShipt_MODIFY_COUNT(((KU0060010Struct)_tempShipList.get(i)).getShipt_MODIFY_COUNT());	// モディファイカウント
				_tempStruct.setl_SPCL_PRICE_TYP(((KU0060010Struct)_tempShipList.get(i)).getl_SPCL_PRICE_TYP());	// 得値区分
				_tempStruct.setl_JOB_ODR_CD(((KU0060010Struct)_tempShipList.get(i)).getl_JOB_ODR_CD());	// 製番 

				// 読込時の更新回数と異なる場合はエラー
				List _modifycountlist = entity.mMODIFY_COUNT_T_ANS_DLV_DATE.read(conn, _tempStruct);
				KU0060010Struct _modifycount = (KU0060010Struct) _modifycountlist.get(0);

				if (!_modifycount.gettAnsDlvDate_MODIFY_COUNT().equals(_tempStruct.getShipt_MODIFY_COUNT())) {
					ExpjMessage emsg = new ExpjMessage("KU00088");
					_errorlst.add(emsg);
					throw new ExpjBadException();
				}
				_modifycountlist.clear();

				//保管区存在可否
				// =======================================
				//画面から入力した倉庫のマスタ存在チェック
				// =======================================

				_tempStruct.setchkis_IN_WHCD(_tempStruct.getl_WH_CD());
				List listchkisinWhCd = entity.mchkIsInWhCd.read(conn, _tempStruct);

				if (listchkisinWhCd == null || listchkisinWhCd.size() != 1) {
					//存在しないとか複数ある場合エラーメッセージの出力
					ExpjMessage emsg = new ExpjMessage("KA00116");
					_errorlst.add(emsg);
					throw new ExpjBadException();
				}
				listchkisinWhCd.clear();

				if (!"1".equals(_tempStruct.getl_c_DIRECT_DLV_FLG())) {
					//直送以外の場合

					// =======================================
					//在庫チェック
					// =======================================

					List listchkWhCd = null;

					// 変数セット
					_tempStruct.setchkisWhCd_IN_ITEMCD(_tempStruct.getl_ITEM_CD());
					_tempStruct.setchkisWhCd_IN_WHCD(_tempStruct.getl_WH_CD());
					
					// 品目在庫をチェックする
					listchkWhCd = entity.mchkIsWhCd.read(conn, _tempStruct);

					if (listchkWhCd == null || listchkWhCd.size() != 1) {
							ExpjMessage emsg = new ExpjMessage("KU00032");
							_errorlst.add(emsg);
							throw new ExpjBadException();
					} else {
						//有効在庫数量を取得して出荷指示数と比較チェック
						double intPblShipQty = Double.parseDouble(((KU0060010Struct)listchkWhCd.get(0)).getchkisWhCd_PBL_SHIP_QTY());

						if (intPblShipQty < Double.parseDouble(_tempStruct.getl_SHIP_QTY())) {
							//有効在庫数量<出荷指示数量
							ExpjMessage emsg = new ExpjMessage("KU00032");
							_errorlst.add(emsg);
							throw new ExpjBadException();
						}
					}
					listchkWhCd.clear();
				}

				// =======================================
        // 休日チェック
        // =======================================
				_tempStruct.settWH_CD(_tempStruct.getl_WH_CD());
				_tempStruct.settCAL_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());

        List listM_CAL = entity.mtblM_CAL.read(conn, _tempStruct);

				if(!listM_CAL.isEmpty()){
        	if ("1".equals(((KU0060010Struct)listM_CAL.get(0)).gettHOLIDAY_FLG())) {
            ExpjMessage emsg = new ExpjMessage("KU02005");
						_errorlst.add(emsg);
						throw new ExpjBadException();
           }
				}
				listM_CAL.clear();

				// =======================================
				// 整数管理チェック
				// 出荷指示数量を小数入力のとき切り上げ
        // =======================================

				if ("1".equals(_tempStruct.getl_UNIT_QTY_TYP())) {
					// 整数管理
					if (_tempStruct.getl_SHIP_QTY().indexOf(".") >= 0) {
						// 小数入力の場合：切上げ
						String tempString = _tempStruct.getl_SHIP_QTY();
						double tempDouble1 = Double.parseDouble(tempString);
						_tempStruct.setl_SHIP_QTY(Calculate.ceil(_tempStruct.getl_SHIP_QTY(), 0));
						double tempDouble2 = Double.parseDouble(_tempStruct.getl_SHIP_QTY());
						if (tempDouble1 != tempDouble2) {
							// ".0"入力除外
							warning = true;
							ExpjMessage emsg = new ExpjMessage("KQ20004");
							msgStruct.addWarn(emsg);
						}
					}
				}

				// =======================================
				// 出荷指示ＴＢＬの作成
				// =======================================

				//出荷指示番号、伝票番号を自動採番する
				SHIP_ODR_NO = new Numbering(conn,Numbering.SHIP_ODR_NO, struct.getsUser_ID(),"KU0060010",struct.getstrPLANT_CD());
				SLIP_CD = new Numbering(conn,Numbering.SLIP_CD,struct.getsUser_ID(),"KU0060010",struct.getstrPLANT_CD());
				String strSHIP_ODR_NO = SHIP_ODR_NO.getNo();
				String strSLIP_CD = SLIP_CD.getNo();

				//受注明細テーブルから情報取得
				_tempStruct.settOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				List listT_ODR = entity.mtbl_T_ODR.read(conn, _tempStruct);
				if(listT_ODR == null || listT_ODR.size()==0){
				}

				String strOdrCtl = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_ODR_CTL_NO()); //受注管理番号
				String strCustOdrNo = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUST_ODR_NO());//顧客注文番号
				String strDlvLocCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_CD());//納品場所コード
				String strUnitPrice = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_ODR_UNIT_PRICE());//単価
				String strCurrncyCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CURRNCY_CD());//通貨コード
				String strRemarks = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_REMARKS());//備考
				String strDepoTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DEPO_TYP());//預託倉庫区分
				String strTransportCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_TRANSPORT_CD());//運送便コード
				//String strTryMassPrdTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_TRY_MASS_PRD_TYP());//試作_量産区分
				String strCustChrgPsnCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUST_CHRG_PSN_CD());//営業担当者コード
				String strUnitCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_UNIT_CD());	//単位
        String strEXCH_TYP = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_EXCH_TYP()); //為替種別

				//出荷伝票用
				String strPartName = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_PART_NAME());//品名
				String strDlvLocNameKanji = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DLV_LOC_NAME_KANJI());//納品場所名(漢字)
				String strBuyerName = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_BUYER_NAME());//購買担当
				String strCusDlvCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUS_DLV_CD());//納入NO
				String strCusDlvKeyCd = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CUS_DLV_KEY_CD());//納品キー番号
				String strDesinatedDlvDate = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_DESINATED_DLV_DATE());//指定納期
				String strPuchOdrQtyTotal =this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_PUCH_ODR_QTY_TOTAL());//総注文数量
				String strDlvOdrQty =this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_ODR_QTY());//納入指示数
				String strUnitCdOrg =this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_UNIT_CD_ORG());//単位(20040107変換前単位から取得に仕様変更)->出荷伝票、ラベル用

				String strSlipPricdPringTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_SLIP_PRICE_PRINT_TYP());//納品書価格表示区分
				String strInspcTyp = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_INSPC_TYP());//検査区分
				String strClientRemark = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CLIENT_REMARK());	//発注者備考
				String strClientRemarkKanji = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CLIENT_REMARK_KANJI());	//発注者備考(漢字)
				String strClientBarcodeInf = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_CLIENT_BARCODE_INF());	//発注者バーコード情報

				//納品キー取得20040204
				String strIfCtlNo = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_BUYER_NAME());//IF管理番号
				String strShipCnt = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_SHIP_CNT());//出荷回数

				//設定用納品キー番号
				String strDlvKeyNo = "";
				if("".equals(strCusDlvKeyCd) || strCusDlvKeyCd ==null){
					//納品キー番号の値が無い場合
					strDlvKeyNo = strSHIP_ODR_NO;
				}else{
					strDlvKeyNo = strCusDlvKeyCd;
				}
				listT_ODR.clear();

				//受注管理テーブルから情報取得

				_tempStruct.settOdrCtl_IN_ODRCTLNO(strOdrCtl);
				List listT_ODR_CTL = entity.mtbl_T_ODR_CTL.read(conn, _tempStruct);
				if(listT_ODR_CTL == null || listT_ODR_CTL.size()==0){
					//エラー処理
				}
				String strCustCd = this.replaceNull(((KU0060010Struct)listT_ODR_CTL.get(0)).gettOdrCtl_CUST_CD());//顧客コード

				listT_ODR_CTL.clear();


				//品目マスタから情報取得
				_tempStruct.setmItem_IN_ITEMCD(_tempStruct.getl_ITEM_CD());
				List listM_ITEM = entity.mtbl_M_ITEM.read(conn, _tempStruct);
				if(listM_ITEM == null || listM_ITEM.size()==0){
					//エラー処理
				}
				String strPkgUnitQty = this.replaceNull(((KU0060010Struct)listM_ITEM.get(0)).getmItem_PKG_UNIT_QTY());//荷姿単位数
				String strUnitWeight = this.replaceNull(((KU0060010Struct)listM_ITEM.get(0)).getmItem_UNIT_WEIGHT());//単位重量

				listM_ITEM.clear();


				//顧客納品場所から運送日数の取得
				//キー:会社コード、顧客コード、納品場所コード

				String strTransportLt = "0";
				_tempStruct.setmCustBase_IN_COMPANYCD(strCompanyCd);
				_tempStruct.setmCustBase_IN_CUSTCD(strCustCd);
				_tempStruct.setmCustBase_IN_DLVLOCCD(strDlvLocCd);

				List listMCustBase = entity.mtbl_M_CUST_BASE.read(conn,_tempStruct);
				if(listMCustBase == null || listMCustBase.size() != 1){
					//エラー処理
				}else{
					strTransportLt = this.replaceNull(((KU0060010Struct)listMCustBase.get(0)).getmCustBase_TRANSPORT_LT());
				}


				//顧客マスタの伝票区分=1の場合のみ
				//出荷伝票、出荷ラベルＴＢＬを作成
				//顧客マスタからラベル発行区分の取得
				//キー:会社コード、顧客コード

				String strTaxApplyTyp = "";
				String strCustTaxCd = "";
				String strCust_Aname = ""; //顧客略称
				String strCust_DETAIL_ROUND_TYP = "";
                //Add Start 20131220 zhang-jq
                String strINSPC_ACPT_TYP = "";//検収区分
                //Add End 20131220 zhang-jq

				_tempStruct.setmCust_IN_COMPANYCD(strCompanyCd);
				_tempStruct.setmCust_IN_CUSTCD(strCustCd);
				List listMCust = entity.mtbl_M_CUST.read(conn,_tempStruct);
				if(listMCust == null || listMCust.size() != 1){
					//エラー処理
				}else{
					strCust_Aname = this.replaceNull(((KU0060010Struct)listMCust.get(0)).getmCust_CUST_ANAME());
          strCust_DETAIL_ROUND_TYP = this.replaceNull(((KU0060010Struct)listMCust.get(0)).getmCust_DETAIL_ROUND_TYP().toString());
          		//Add Start 20131220 zhang-jq
          		strINSPC_ACPT_TYP = ((KU0060010Struct)listMCust.get(0)).getmCust_INSPC_ACPT_TYP();
          		_tempStruct.setmCust_INSPC_ACPT_TYP(strINSPC_ACPT_TYP);
          		//Add End 20131220 zhang-jq
				}


				//出荷指示テーブル設定
				_tempStruct.setin_tShipOdr_SHIP_ODR_NO(strSHIP_ODR_NO);			//出荷指示番号
				_tempStruct.setin_tShipOdr_ODR_NO(_tempStruct.getl_ODR_NO());			//受注番号
				_tempStruct.setin_tShipOdr_PART_DLV_SEQ_NO(_tempStruct.getl_PART_DLV_SEQ_NO());	//分納項番
				_tempStruct.setin_tShipOdr_SLIP_CD(strSLIP_CD);				//伝票番号
				_tempStruct.setin_tShipOdr_ITEM_CD(_tempStruct.getl_ITEM_CD());			//品番
				_tempStruct.setin_tShipOdr_CUST_ITEM_CD(_tempStruct.getl_CUST_ITEM_CD());		//顧客品番
				_tempStruct.setin_tShipOdr_CUST_ODR_NO(strCustOdrNo);			//顧客注文番号
				_tempStruct.setin_tShipOdr_CUST_CD(strCustCd);				//顧客コード
				_tempStruct.setin_tShipOdr_CUST_NAME(strCust_Aname);			//顧客名称
				_tempStruct.setin_tShipOdr_CUST_CHRG_PSN_CD(strCustChrgPsnCd);		//営業担当者コード
				_tempStruct.setin_tShipOdr_SHIP_ODR_ISS_PSN_CD(struct.getstrUSER_CD());	//発行担当者コード(1212-LOGINユーザのCD)
				_tempStruct.setin_tShipOdr_DLV_LOC_CD(strDlvLocCd);			//納品場所コード
				_tempStruct.setin_tShipOdr_DEPO_TYP(strDepoTyp);				//預託倉庫区分
				_tempStruct.setin_tShipOdr_DESINATED_SHIP_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());	//出荷指定日
				_tempStruct.setin_tShipOdr_SHIP_QTY(_tempStruct.getl_SHIP_QTY());		//出荷指示数量
				_tempStruct.setin_tShipOdr_UNIT_CD(strUnitCd);				//単位
				_tempStruct.setin_tShipOdr_UNIT_PRICE(strUnitPrice);			//単価
				String strAmount = this.calMultiply(conn,_tempStruct.getl_SHIP_QTY(), strUnitPrice);
				_tempStruct.setin_tShipOdr_JOB_ODR_CD(_tempStruct.getl_JOB_ODR_CD());			//製番

				String strShipOdrAmount = "";
        String strShipOdrAmountExchRates = "";

        ExchAmount ex = new ExchAmount(conn);

        if(ex.doMarume(strAmount, struct.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
					strShipOdrAmount = ex.getS_EXCH_AMOUNT();
				}else{
					ExpjMessage emsg = new ExpjMessage("KQ00038");
					_errorlst.add(emsg);
					throw new ExpjBadException();
        }

				if(ex.doExchAmount(strShipOdrAmount, struct.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
                    strShipOdrAmountExchRates = ex.getS_EXCH_AMOUNT();
				}else{
					ExpjMessage emsg = new ExpjMessage("KQ00038");
					_errorlst.add(emsg);
					throw new ExpjBadException();

				}

				_tempStruct.setin_tShipOdr_SHIP_ODR_AMOUNT(new Double(strShipOdrAmount));			//出荷指示金額(出荷指示数量＊単価)
				_tempStruct.setin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(new Double(strShipOdrAmountExchRates));

				_tempStruct.setin_tShipOdr_CURRNCY_CD(strCurrncyCd);			//通貨コード

				//入数、箱数、端数、口数の計算
				_tempStruct.setin_tShipOdr_PKG_UNIT_QTY(strPkgUnitQty);			//入数

				_tempStruct.setin_tShipOdr_REMARKS(strRemarks);				//備考
				_tempStruct.setin_tShipOdr_TRANSPORT_CD(strTransportCd);			//運送便コード
				_tempStruct.setin_tShipOdr_ALLCT_WH_CD(_tempStruct.getl_WH_CD());			//引当保管区(出荷倉庫)
				_tempStruct.setin_tShipOdr_ENTRY_TYP("2");				//データ入力区分(画面:2)
				_tempStruct.setin_tShipOdr_PRINT_FLG("0");				//帳票出力F
				_tempStruct.setin_tShipOdr_SHP_CMPLT_FLG("0");				//実績処理F
				_tempStruct.setin_tShipOdr_DEL_FLG("0");				//削除Ｆ
				_tempStruct.setin_tShipOdr_DIRECT_DLV_FLG(_tempStruct.getl_c_DIRECT_DLV_FLG());		//直送F

				//納入予定日(出荷予定日＋運送日数＋出荷準備LT)
				int iAddDays = Integer.parseInt(strTransportLt) +  Integer.parseInt(strSyuKaLt) ;
				String strAddDays = String.valueOf(iAddDays);
				
				String strScdlDlvDate = this.getScdlDlvDate(_tempStruct,_tempStruct.getl_DESINATED_SHIP_DATE(),strAddDays);
				if(strScdlDlvDate == null) {
					ExpjMessage emsg = new ExpjMessage("KQ00040");
					_errorlst.add(emsg);
					throw new ExpjBadException();
				}
				_tempStruct.setin_tShipOdr_SCDL_DLV_DATE(this.replaceNull(strScdlDlvDate));

				//振替先保管区(預託倉庫)
				// [受注明細]."預託倉庫区分"＝１０（通常）：Null
				// [受注明細]."預託倉庫区分"＝２０（預託）：[得意先納品場所]."払出預託保管区"
				if(!m_kNORMAL_DEPOTYP.equals(strDepoTyp)
						&& m_kYOTO_DEPOTYP.equals(strDepoTyp)){
						_tempStruct.setstrYotaku_IN_WH_TYP(strDepoTyp);

					String strYoWhCd = this.replaceNull(((KU0060010Struct)listMCustBase.get(0)).getmCustBase_DEPO_WH_CD());
					_tempStruct.setin_tShipOdr_TRANSFER_WH_CD(strYoWhCd);
				}
				//納品キー番号
				_tempStruct.setin_tShipOdr_DLV_KEY_NO(strDlvKeyNo);


				//出荷指示レコード作成
				int rv = entity.mtbl_T_SHIP_ODR.create(conn, _tempStruct);
				
				// 出荷指示不可削除
				if (rv == 1) {
					deleteUnShipList( _tempStruct.getin_tShipOdr_ODR_NO(), _tempStruct.getin_tShipOdr_PART_DLV_SEQ_NO() );
				}
					
				// =======================================
				// 受注明細TBLの更新
				// =======================================
				//受注番号単位で出荷回数を更新する。(出荷回数+1)
				_tempStruct.setuptOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				_tempStruct.setuptOdr_SHIP_CNT(Integer.parseInt(strShipCnt)+1+"");
				_tempStruct.setuptOdr_PART_DLV_COUNT(1+"");
				rv = entity.mupdateT_ODR.update(conn,_tempStruct);

				// =======================================
				// 出荷伝票ＴＢＬの作成
				// =======================================

				_tempStruct.setin_tShipSlip_SLIP_CD(strSLIP_CD);					//伝票番号
				_tempStruct.setin_tShipSlip_ITEM_CD(_tempStruct.getl_ITEM_CD());				//品番
				_tempStruct.setin_tShipSlip_CUST_ITEM_CD(_tempStruct.getl_CUST_ITEM_CD());			//顧客品番
				_tempStruct.setin_tShipSlip_PART_NAME(strPartName);				//品名
				_tempStruct.setin_tShipSlip_CUST_ODR_NO(strCustOdrNo);				//顧客注文番号
				_tempStruct.setin_tShipSlip_CUST_CD(strCustCd);					//顧客コード
				_tempStruct.setin_tShipSlip_CUST_NAME(strCust_Aname);				//顧客名称(顧客略称を設定)
				_tempStruct.setin_tShipSlip_DLV_LOC_CD(strDlvLocCd);				//納品場所コード
				_tempStruct.setin_tShipSlip_DLV_LOC_NAME_KANJI(strDlvLocNameKanji);			//納品場所名(漢字)
				_tempStruct.setin_tShipSlip_BUYER_NAME(strBuyerName);				//購買担当
				_tempStruct.setin_tShipSlip_CUS_DLV_KEY_CD(strDlvKeyNo);				//納品キー番号(20040204仕様変更)
				_tempStruct.setin_tShipSlip_DESINATED_SHIP_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());	//出荷指定日
				_tempStruct.setin_tShipSlip_DESINATED_DLV_DATE(strDesinatedDlvDate);			//指定納期
				_tempStruct.setin_tShipSlip_SCDL_DLV_DATE(strScdlDlvDate);				//納入予定日
				_tempStruct.setin_tShipSlip_PUCH_ODR_QTY_TOTAL(strPuchOdrQtyTotal);			//総注文数量
				_tempStruct.setin_tShipSlip_DLV_ODR_QTY(strDlvOdrQty);				//納入指示数量
				_tempStruct.setin_tShipSlip_SHIP_ODR_QTY(_tempStruct.getl_SHIP_QTY());		//出荷指示数量
				_tempStruct.setin_tShipSlip_UNIT_CD(strUnitCdOrg);					//単位(設定値変更)
				_tempStruct.setin_tShipSlip_UNIT_PRICE(strUnitPrice);				//単価

				_tempStruct.setin_tShipSlip_INSPC_TYP(strInspcTyp);					//検査区分
				_tempStruct.setin_tShipSlip_CLIENT_REMARK_KANJI(strClientRemark);			//発注者備考
				_tempStruct.setin_tShipSlip_CLIENT_BARCODE_INF(strClientBarcodeInf);			//発注者バーコード情報
				_tempStruct.setin_tShipSlip_PRINT_FLG("0");					//帳票出力F
				_tempStruct.setin_tShipSlip_DEL_FLG("0");					//削除F

				//消費税金額計算

				String taxAmount[] = this.doCalcuTaxAmount(_tempStruct, strCustCd, strCompanyCd, _tempStruct.getl_ITEM_CD(), strShipOdrAmount, strCurrncyCd);

				_tempStruct.setin_tShipSlip_TAX_AMOUNT_1(taxAmount[0]);		// 税額１
				_tempStruct.setin_tShipSlip_TAX_AMOUNT_2(taxAmount[1]);		// 税額２
				_tempStruct.setin_tShipSlip_TAX_AMOUNT_3(taxAmount[2]);		// 税額３

				_tempStruct.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT("0");	// 外税対象金額
				_tempStruct.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT("0");	// 内税対象金額
				_tempStruct.setin_tShipSlip_TAXFREE_SALES_AMOUNT("0");		// 非課税対象金額
				_tempStruct.setin_tShipSlip_EXTERNAL_TAX_AMOUNT("0");		// 消費税額（外税）
				_tempStruct.setin_tShipSlip_INTERNAL_TAX_AMOUNT("0");		// 消費税額（内税）

				String sTmpTax = Calculate.add(taxAmount[0], taxAmount[1]);
				sTmpTax = Calculate.add(sTmpTax, taxAmount[2]);
				double tmpTax = Double.parseDouble(sTmpTax);
				
				if ("1".equals(this.TAX_KBN)){
					_tempStruct.setin_tShipSlip_EXTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
					_tempStruct.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
				} else
				if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
					_tempStruct.setin_tShipSlip_INTERNAL_TAX_AMOUNT(String.valueOf(tmpTax));
					_tempStruct.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(strShipOdrAmount);
				} else
				if ("0".equals(this.TAX_KBN)){
					_tempStruct.setin_tShipSlip_TAXFREE_SALES_AMOUNT(strShipOdrAmount);
				}

				tmpTax = Double.parseDouble(_tempStruct.getin_tShipSlip_EXTERNAL_TAX_AMOUNT())
						+Double.parseDouble(_tempStruct.getin_tShipSlip_INTERNAL_TAX_AMOUNT());
				_tempStruct.setin_tShipSlip_TAX_AMOUNT(String.valueOf(tmpTax));			//消費税金額(円貨)-設定無し

				tmpTax = Double.parseDouble(_tempStruct.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT())
						+Double.parseDouble(_tempStruct.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT())
						+Double.parseDouble(_tempStruct.getin_tShipSlip_TAXFREE_SALES_AMOUNT())
						-Double.parseDouble(_tempStruct.getin_tShipSlip_INTERNAL_TAX_AMOUNT());

				_tempStruct.setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(String.valueOf(tmpTax));	// 税抜売上金額

        String tmpTaxExchRates = "0";
        if(ex.doExchAmount(String.valueOf(tmpTax), struct.getstrCOMPANY_CD(), strCurrncyCd, strEXCH_TYP, strCust_DETAIL_ROUND_TYP, struct.getstrBUSINESS_OPR_DATE())){
        	tmpTaxExchRates = ex.getS_EXCH_AMOUNT();
        }
				
				_tempStruct.setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(tmpTaxExchRates);	// 税抜売上金額（邦貨）

				_tempStruct.setin_tShipSlip_SHIP_ODR_AMOUNT(String.valueOf(tmpTax));	//出荷指示金額//sww修正20040729
				tmpTax = tmpTax + Double.parseDouble(_tempStruct.getin_tShipSlip_TAX_AMOUNT());
				_tempStruct.setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(String.valueOf(tmpTax));					//出荷指示金額(税込)

				//出荷伝票レコード作成
				rv = entity.mtbl_T_SHIP_SLIP.create(conn, _tempStruct);

				// =======================================
				// 出荷計画ＴＢＬの更新
				// =======================================

				_tempStruct.setup_tAnsDlvDate_DESINATED_SHIP_DATE(_tempStruct.getl_DESINATED_SHIP_DATE());//出荷指示日
				_tempStruct.setup_tAnsDlvDate_REST_SHIP_ODR_QTY(_tempStruct.getl_SHIP_QTY());//出荷指示残数量(オラクルで設定)
				_tempStruct.setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(_tempStruct.getl_SHIP_QTY());//出荷指示完了Ｆ(オラクルで設定)

				_tempStruct.setup_tAnsDlvDate_IN_ODRNO(_tempStruct.getl_ODR_NO());					//受注番号
				_tempStruct.setup_tAnsDlvDate_IN_PARTDLVSEQNO(_tempStruct.getl_PART_DLV_SEQ_NO());	//分納項番

				//出荷計画レコード更新
				rv = entity.mtbl_T_ANS_DLV_DATE.update(conn, _tempStruct);

				// 成功、ワーニング、失敗カウント
				if ( warning == true) {
					// ワーニング
					status[0] = status[0] + 1;
					status[1] = status[1] + 1;
				} else if (success == true) {
					// 成功
					status[0] = status[0] + 1;
				}

				} catch (ExpjBadException eb) {
					// 出荷指示失敗
					status[2] += 1;

					// 項目設定設定
					setTUnShipList(_tempStruct, _errorlst);

					String UnShipSeqNo = getTUnShipListUnShipSeqNo(_tempStruct.getl_ODR_NO(),_tempStruct.getl_PART_DLV_SEQ_NO());
					if (UnShipSeqNo == null) {
						// 変数格納
						List _tUnShipLst = entity.mtbl_T_UN_SHIP_LIST.read(conn, _tempStruct);
						_tempStruct.settUnShipList_UN_SHIP_SEQ_NO(((KU0060010Struct)_tUnShipLst.get(0)).gettUnShipList_UN_SHIP_SEQ_NO()); // 出荷指示不可管理番号
						_tempStruct.settUnShipList_ACPT_ODR_CD(_tempStruct.getl_ODR_NO()); // 受注番号
						_tempStruct.settUnShipList_PART_DLV_SEQ_NO(_tempStruct.getl_PART_DLV_SEQ_NO()); // 分納項番
						
						// 追加
						entity.mtbl_T_UN_SHIP_LIST.create(conn, _tempStruct);
					} else {
						_tempStruct.settUnShipList_UN_SHIP_SEQ_NO(UnShipSeqNo); // 出荷指示不可管理番号
						// 更新
						entity.mtbl_T_UN_SHIP_LIST.update(conn, _tempStruct);
					}
				}

				this.conn.commit();

			}
		// 一行ごとに出荷指示処理終了


			// メッセージ格納用配列
			String[] msgs = new String[4];
			msgs[0] = String.valueOf(_tempShipLstCnt);
			msgs[1] = String.valueOf(status[0]);
			msgs[2] = String.valueOf(status[1]);
			msgs[3] = String.valueOf(status[2]);


			ExpjMessage emsg = new ExpjMessage("KU00108",msgs); // 成功／ワーニング／失敗件数の表示
			msgStruct.addInfo(emsg);

		controlSelect();

		}catch(SQLException e){

			e.printStackTrace();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成

			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
			throw ee;

		} catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
    } finally {
      if (conn != null) {
      	try {
        	conn.rollback();
        } catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage( "ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
				  ExpjException ee = new ExpjException(fe,emsg);
				  emsg = new ExpjMessage( "AA99991");
				  sysLog.severe(emsg, struct.getsUser_ID());
				  emsg = new ExpjMessage( "ZZ01106",fe.toString());
				  sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
         }
      }
    }

                //}}user_implement_dev:<controlInsert>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 選択削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {

			int _tempLstCnt = 0;	// 行数
			KU0060010Struct _tempStruct = new KU0060010Struct();
	
			// Orteus標準ユーザＩＤをセット
			_tempStruct.setsUser_ID(struct.getsUser_ID());

			// 行数取得
			_tempLstCnt = getListsize(struct.getList_l_ODR_NO());
			
			String modifyCount = null;
			for (int i = 0; i < _tempLstCnt; i++) {

				// トランザクションスタート
				this.conn.beginTransWeb();

				_tempStruct.clear();

				_tempStruct.setl_SLIP_CD((String)struct.getList_l_SLIP_CD().get(i));			//伝票番号
				_tempStruct.setl_ODR_NO((String)struct.getList_l_ODR_NO().get(i)); 			//受注番号
				_tempStruct.setl_PART_DLV_SEQ_NO((String)struct.getList_l_PART_DLV_SEQ_NO().get(i)); 	//分納項番
				_tempStruct.setl_DESINATED_SHIP_DATE((String)struct.getList_l_DESINATED_SHIP_DATE().get(i));//出荷指示日
				_tempStruct.setl_REST_SHIP_QTY((String)struct.getList_l_REST_SHIP_QTY().get(i));	//出荷指示残数量
				_tempStruct.setl_SHIP_QTY((String)struct.getList_l_SHIP_QTY().get(i));//出荷指示数
				_tempStruct.setl_WH_CD((String)struct.getList_l_WH_CD().get(i));			//倉庫(保管区)
				_tempStruct.setl_c_DIRECT_DLV_FLG((String)struct.getList_l_c_DIRECT_DLV_FLG().get(i));				//直送フラグ
				_tempStruct.setl_MODIFY_COUNT((String)struct.getList_l_MODIFY_COUNT().get(i));				//読込時更新回数
				//読込時の更新回数と異なる場合はエラー
				List _modifycountlist = entity.mMODIFY_COUNT_T_SHIP_ODR.read(conn, _tempStruct);
				if(_modifycountlist.size() > 0){
					KU0060010Struct _modifycount = (KU0060010Struct) _modifycountlist.get(0);
					if (!_modifycount.getSHIP_MODIFY_COUNT().equals(_tempStruct.getl_MODIFY_COUNT())) {
						ExpjMessage emsg = new ExpjMessage("KU00088");
						msgStruct.addError(emsg);
						sysLog.warning(emsg, getsysUSER_CD());
	                    return;
					}
				}else{
					ExpjMessage emsg = new ExpjMessage("KU00088");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, getsysUSER_CD());
                    return;
				}
				_modifycountlist.clear();

				// 画面上でtrue/falseを1or0とする
				// 在庫チェックなしフラグ
				if (_tempStruct.getl_c_DIRECT_DLV_FLG().equals("true")) {
					_tempStruct.setl_c_DIRECT_DLV_FLG("1");
				} else {
					_tempStruct.setl_c_DIRECT_DLV_FLG("0");
				}
				
				_tempStruct.setl_ITEM_CD((String)struct.getList_l_ITEM_CD().get(i));			//品番
				_tempStruct.setl_CUST_NAME((String)struct.getList_l_CUST_NAME().get(i));		//顧客略称
				_tempStruct.setl_CUST_ITEM_CD((String)struct.getList_l_CUST_ITEM_CD().get(i));		//顧客品番

				//受注明細から出荷回数を取得
				String strOdrPartDlvCnt = "";
				_tempStruct.settOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				List listT_ODR = entity.mtbl_T_ODR.read(conn, _tempStruct);
				if(listT_ODR == null || listT_ODR.size()==0){
					//エラー処理
				}else{
					strOdrPartDlvCnt = this.replaceNull(((KU0060010Struct)listT_ODR.get(0)).gettOdr_PART_DLV_COUNT());//分納回数
				}

				// =======================================
				// 出荷計画ＴＢＬの更新
				// =======================================
				_tempStruct.settori_tAnsDlvDate_IN_ODRNO(_tempStruct.getl_ODR_NO());
				_tempStruct.settori_tAnsDlvDate_IN_PARTDLVSEQNO(_tempStruct.getl_PART_DLV_SEQ_NO());
				_tempStruct.settori_tAnsDlvDate_REST_SHIP_ODR_QTY(_tempStruct.getl_SHIP_QTY());// 出荷指示数を+
				_tempStruct.settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG("0");
				// 排他処理
				modifyCount = (String)struct.getList_l_DLV_MODIFY_COUNT().get(i);
				List dlvModifyCountList = entity.mSELECT_DLV_MODIFY_COUNT.read(conn, _tempStruct);
				if (dlvModifyCountList.isEmpty()) {
					ExpjMessage emsg = new ExpjMessage("ZZ01105");
					msgStruct.addError(emsg);
					conn.rollback();
					return;
				}else{
					KU0060010Struct dlvModifyCountStruct = (KU0060010Struct)dlvModifyCountList.get(0);
					if (modifyCount != null && !"".equals(modifyCount) && !modifyCount.equals(dlvModifyCountStruct.getSEL_MODIFY_COUNT())) {
						ExpjMessage emsg = new ExpjMessage("ZZ01105");
						msgStruct.addError(emsg);
						conn.rollback();
						return;
					}
				}
				int rv = entity.mtoriTbl_T_ANS_DLV_DATE.update(conn,_tempStruct);


				// =======================================
				// 出荷指示ＴＢＬの取消(物理削除)
				// =======================================
				_tempStruct.setdel_tShipOdr_IN_SLIPCD(_tempStruct.getl_SLIP_CD());
				rv = entity.mtbl_T_SHIP_ODR.delete(conn,_tempStruct);

				// =======================================
				// 受注明細TBLの更新
				// =======================================
				_tempStruct.setuptOdr_IN_ODRNO(_tempStruct.getl_ODR_NO());
				_tempStruct.setuptOdr_PART_DLV_COUNT(Integer.parseInt(strOdrPartDlvCnt)-1+"");
				rv = entity.mtbl_T_ODR.update(conn,_tempStruct);


				// =======================================
				// 出荷伝票ＴＢＬの取消(物理削除)
				// =======================================
				_tempStruct.setdel_tShipSlip_IN_SLIPCD(_tempStruct.getl_SLIP_CD());
				rv = entity.mtbl_T_SHIP_SLIP.delete(conn,_tempStruct);


			this.conn.commit();

			}	// for end

			_tempStruct = null;
				
			controlSelect();

	  	////////// ↑業務ロジック↑ //////////

		}catch(SQLException e){
			e.printStackTrace();
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成


			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
			throw ee;

		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
    } finally {
    	if (conn != null) {
      	try {
        	conn.rollback();
        } catch (FoundationException fe) {

					ExpjMessage emsg = new ExpjMessage( "ZZ01106");
					sysLog.severe(emsg, struct.getsUser_ID());
				  ExpjException ee = new ExpjException(fe,emsg);
				  emsg = new ExpjMessage( "AA99991");
				  sysLog.severe(emsg, struct.getsUser_ID());
				  emsg = new ExpjMessage( "ZZ01106",fe.toString());
				 	sysLog.severe(emsg, struct.getsUser_ID());
					throw ee;
        }
      }
    }
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
			initializeStruct();
			list = null;
			controlRELOAD();
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 出荷指示メンテボタン押下時に実行される処理です。
	 *
	 */
	public void controlScrmvToShipDir() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlScrmvToShipDir");
			//{{user_implement_dev:<controlScrmvToShipDir>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlScrmvToShipDir>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlScrmvToShipDir");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			struct.seth_RESULT("NG");
			// モード設定
			
			// =======================================
			// 自社情報の取得
			// =======================================

			strCompanyCd = getstrCompanyCd(struct);

			// =======================================
			// 業務日付の取得
			// =======================================
			List listGyomuDate = entity.mgetGyomuDate.read(conn,struct);
			if(listGyomuDate == null || listGyomuDate.size() != 1){
				//業務日付情報が無い/複数件
				ExpjMessage emsg = new ExpjMessage("KR00017");
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setstrBUSINESS_OPR_DATE(((KU0060010Struct)listGyomuDate.get(0)).getstrBUSINESS_OPR_DATE());
				struct.setstrPLANT_CD(((KU0060010Struct)listGyomuDate.get(0)).getstrPLANT_CD());
			}
			listGyomuDate = null;

			// =======================================
			// 利用者情報の取得
			// =======================================
			struct.setstrUSER_CD(struct.getsUser_ID());
			List listUserInfo = entity.mgetUserInfo.read(conn,struct);
			if(listUserInfo == null || listUserInfo.size() != 1){
				//ユーザ情報が無い/複数件
				ExpjMessage emsg = new ExpjMessage("KQ00025");
				msgStruct.addError(emsg);	// エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
				ExpjException ee = new ExpjException(emsg);
				throw ee;
			}else{
				struct.setstrUSER_NAME(((KU0060010Struct)listUserInfo.get(0)).getstrUSER_NAME());
				struct.setstrSECTION_CD(((KU0060010Struct)listUserInfo.get(0)).getstrSECTION_CD());
				struct.setstrPLANT_NAME(((KU0060010Struct)listUserInfo.get(0)).getstrPLANT_NAME());
				struct.setstrPLANT_ANAME(((KU0060010Struct)listUserInfo.get(0)).getstrPLANT_ANAME());
				struct.setstrCAL_NO(((KU0060010Struct)listUserInfo.get(0)).getstrCAL_NO());

			}
			listUserInfo = null;

			// 出荷Ｌ／Ｔの取得
			strSyuKaLt = getSYUKA_LT(struct);

		}catch(SQLException e){
			e.printStackTrace();

			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成

			emsg = new ExpjMessage( "ZZ01006", e.toString());
			sysLog.severe(emsg ,getsysUSER_CD()); //エクセプションの詳細情報
			msgStruct.addError(emsg);
			throw ee;
		}catch(ExpjException ee){
        	    throw ee;
		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			sysLog.severe(emsg, struct.getsUser_ID());
			ExpjException ee = new ExpjException(e,emsg);
			emsg = new ExpjMessage( "ZZ01106",e.toString());
			sysLog.severe(emsg, struct.getsUser_ID());
			throw ee;
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0060");
		logger.entering("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KU0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("ScrmvToShipDir") ) {
				controlScrmvToShipDir();
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
//			throw new FoundationException("KU0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0060010-E999","CSVの出力処理"));
			throw new FoundationException("KU0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0060010-E999","システム日付の取得処理"));
				throw new FoundationException("KU0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("KU0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KU0060010Entity entity;
	protected KU0060010Struct struct;
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

		entity = new KU0060010Entity();
		struct = new KU0060010Struct();

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
	 * KU0060010クラスの標準コンストラクタ
	 */
	public KU0060010Control() throws BusinessProcessException, FoundationException
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
				KU0060010Struct key = (KU0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_SHIP_ODR") && key.getr1_SHIP_ODR() != null) {
					msgKey.setKeyValue("r1_SHIP_ODR", key.getr1_SHIP_ODR());
				}
				if(msgKeyType.containsKeyColumn("r2_SHIP_ODR") && key.getr2_SHIP_ODR() != null) {
					msgKey.setKeyValue("r2_SHIP_ODR", key.getr2_SHIP_ODR());
				}
				if(msgKeyType.containsKeyColumn("tAnsDlvDate_MODIFY_COUNT") && key.gettAnsDlvDate_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("tAnsDlvDate_MODIFY_COUNT", key.gettAnsDlvDate_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("tShipOdr_MODIFY_COUNT") && key.gettShipOdr_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("tShipOdr_MODIFY_COUNT", key.gettShipOdr_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("Shipt_MODIFY_COUNT") && key.getShipt_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("Shipt_MODIFY_COUNT", key.getShipt_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("strBUSINESS_OPR_DATE") && key.getstrBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("strBUSINESS_OPR_DATE", key.getstrBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_CD") && key.getstrPLANT_CD() != null) {
					msgKey.setKeyValue("strPLANT_CD", key.getstrPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("strTaxTAX_KBN") && key.getstrTaxTAX_KBN() != null) {
					msgKey.setKeyValue("strTaxTAX_KBN", key.getstrTaxTAX_KBN());
				}
				if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_1") && key.getstrTaxOLD_TAX_1() != null) {
					msgKey.setKeyValue("strTaxOLD_TAX_1", key.getstrTaxOLD_TAX_1());
				}
				if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_2") && key.getstrTaxOLD_TAX_2() != null) {
					msgKey.setKeyValue("strTaxOLD_TAX_2", key.getstrTaxOLD_TAX_2());
				}
				if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_3") && key.getstrTaxOLD_TAX_3() != null) {
					msgKey.setKeyValue("strTaxOLD_TAX_3", key.getstrTaxOLD_TAX_3());
				}
				if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_1") && key.getstrTaxNEW_TAX_1() != null) {
					msgKey.setKeyValue("strTaxNEW_TAX_1", key.getstrTaxNEW_TAX_1());
				}
				if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_2") && key.getstrTaxNEW_TAX_2() != null) {
					msgKey.setKeyValue("strTaxNEW_TAX_2", key.getstrTaxNEW_TAX_2());
				}
				if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_3") && key.getstrTaxNEW_TAX_3() != null) {
					msgKey.setKeyValue("strTaxNEW_TAX_3", key.getstrTaxNEW_TAX_3());
				}
				if(msgKeyType.containsKeyColumn("strTaxSTART_DATE") && key.getstrTaxSTART_DATE() != null) {
					msgKey.setKeyValue("strTaxSTART_DATE", key.getstrTaxSTART_DATE());
				}
				if(msgKeyType.containsKeyColumn("strTaxROUND_TYP") && key.getstrTaxROUND_TYP() != null) {
					msgKey.setKeyValue("strTaxROUND_TYP", key.getstrTaxROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_COMPANYCD") && key.getstrTaxIN_COMPANYCD() != null) {
					msgKey.setKeyValue("strTaxIN_COMPANYCD", key.getstrTaxIN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_CUSTCD") && key.getstrTaxIN_CUSTCD() != null) {
					msgKey.setKeyValue("strTaxIN_CUSTCD", key.getstrTaxIN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tDECIMAL_FIG") && key.gettDECIMAL_FIG() != null) {
					msgKey.setKeyValue("tDECIMAL_FIG", key.gettDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("tCUR_CD") && key.gettCUR_CD() != null) {
					msgKey.setKeyValue("tCUR_CD", key.gettCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("strUSER_NAME") && key.getstrUSER_NAME() != null) {
					msgKey.setKeyValue("strUSER_NAME", key.getstrUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("strSECTION_CD") && key.getstrSECTION_CD() != null) {
					msgKey.setKeyValue("strSECTION_CD", key.getstrSECTION_CD());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_NAME") && key.getstrPLANT_NAME() != null) {
					msgKey.setKeyValue("strPLANT_NAME", key.getstrPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("strPLANT_ANAME") && key.getstrPLANT_ANAME() != null) {
					msgKey.setKeyValue("strPLANT_ANAME", key.getstrPLANT_ANAME());
				}
				if(msgKeyType.containsKeyColumn("strCAL_NO") && key.getstrCAL_NO() != null) {
					msgKey.setKeyValue("strCAL_NO", key.getstrCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("strUSER_CD") && key.getstrUSER_CD() != null) {
					msgKey.setKeyValue("strUSER_CD", key.getstrUSER_CD());
				}
				if(msgKeyType.containsKeyColumn("strSYUKA_LT") && key.getstrSYUKA_LT() != null) {
					msgKey.setKeyValue("strSYUKA_LT", key.getstrSYUKA_LT());
				}
				if(msgKeyType.containsKeyColumn("tHOLIDAY_FLG") && key.gettHOLIDAY_FLG() != null) {
					msgKey.setKeyValue("tHOLIDAY_FLG", key.gettHOLIDAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("tWH_CD") && key.gettWH_CD() != null) {
					msgKey.setKeyValue("tWH_CD", key.gettWH_CD());
				}
				if(msgKeyType.containsKeyColumn("tCAL_DATE") && key.gettCAL_DATE() != null) {
					msgKey.setKeyValue("tCAL_DATE", key.gettCAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_NO") && key.getl_ODR_NO() != null) {
					msgKey.setKeyValue("l_ODR_NO", key.getl_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO") && key.getl_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("l_PART_DLV_SEQ_NO", key.getl_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE") && key.getl_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_SHIP_DATE", key.getl_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_SHIP_QTY") && key.getl_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_SHIP_QTY", key.getl_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_REST_SHIP_QTY") && key.getl_REST_SHIP_QTY() != null) {
					msgKey.setKeyValue("l_REST_SHIP_QTY", key.getl_REST_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_WH_CD") && key.getl_WH_CD() != null) {
					msgKey.setKeyValue("l_WH_CD", key.getl_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("l_WH_NAME") && key.getl_WH_NAME() != null) {
					msgKey.setKeyValue("l_WH_NAME", key.getl_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_NAME") && key.getl_CUST_NAME() != null) {
					msgKey.setKeyValue("l_CUST_NAME", key.getl_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_STOCK_UNIT") && key.getl_STOCK_UNIT() != null) {
					msgKey.setKeyValue("l_STOCK_UNIT", key.getl_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP") && key.getl_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_QTY_TYP", key.getl_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP") && key.getl_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("l_MRP_ODR_TYP", key.getl_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO") && key.getl_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("l_ODR_CTL_NO", key.getl_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP") && key.getl_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("l_TRANSPORT_TYP", key.getl_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP") && key.getl_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP", key.getl_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG") && key.getl_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("l_PARTIAL_SHIP_INST_FLG", key.getl_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT") && key.getl_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_MODIFY_COUNT", key.getl_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE") && key.getDESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("DESINATED_SHIP_DATE", key.getDESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD") && key.getCUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("CUST_CHRG_PSN_CD", key.getCUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_DESINATED_SHIP_DATE") && key.getup_tAnsDlvDate_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_DESINATED_SHIP_DATE", key.getup_tAnsDlvDate_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_REST_SHIP_ODR_QTY") && key.getup_tAnsDlvDate_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_REST_SHIP_ODR_QTY", key.getup_tAnsDlvDate_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG") && key.getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG", key.getup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_ODRNO") && key.getup_tAnsDlvDate_IN_ODRNO() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_IN_ODRNO", key.getup_tAnsDlvDate_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_PARTDLVSEQNO") && key.getup_tAnsDlvDate_IN_PARTDLVSEQNO() != null) {
					msgKey.setKeyValue("up_tAnsDlvDate_IN_PARTDLVSEQNO", key.getup_tAnsDlvDate_IN_PARTDLVSEQNO());
				}
				if(msgKeyType.containsKeyColumn("l_SLIP_CD") && key.getl_SLIP_CD() != null) {
					msgKey.setKeyValue("l_SLIP_CD", key.getl_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_c_DIRECT_DLV_FLG") && key.getl_c_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("l_c_DIRECT_DLV_FLG", key.getl_c_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_MODIFY_COUNT") && key.getl_DLV_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("l_DLV_MODIFY_COUNT", key.getl_DLV_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ODR_NO") && key.getin_tShipOdr_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_ODR_NO", key.getin_tShipOdr_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_PART_DLV_SEQ_NO") && key.getin_tShipOdr_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_PART_DLV_SEQ_NO", key.getin_tShipOdr_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SLIP_CD") && key.getin_tShipOdr_SLIP_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_SLIP_CD", key.getin_tShipOdr_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ITEM_CD") && key.getin_tShipOdr_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_ITEM_CD", key.getin_tShipOdr_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ITEM_CD") && key.getin_tShipOdr_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_ITEM_CD", key.getin_tShipOdr_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ODR_NO") && key.getin_tShipOdr_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_ODR_NO", key.getin_tShipOdr_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CD") && key.getin_tShipOdr_CUST_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_CD", key.getin_tShipOdr_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_NAME") && key.getin_tShipOdr_CUST_NAME() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_NAME", key.getin_tShipOdr_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_ISS_PSN_CD") && key.getin_tShipOdr_SHIP_ODR_ISS_PSN_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_ISS_PSN_CD", key.getin_tShipOdr_SHIP_ODR_ISS_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_LOC_CD") && key.getin_tShipOdr_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_DLV_LOC_CD", key.getin_tShipOdr_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DESINATED_SHIP_DATE") && key.getin_tShipOdr_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("in_tShipOdr_DESINATED_SHIP_DATE", key.getin_tShipOdr_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_QTY") && key.getin_tShipOdr_SHIP_QTY() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_QTY", key.getin_tShipOdr_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_PRICE") && key.getin_tShipOdr_UNIT_PRICE() != null) {
					msgKey.setKeyValue("in_tShipOdr_UNIT_PRICE", key.getin_tShipOdr_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT") && key.getin_tShipOdr_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT", key.getin_tShipOdr_SHIP_ODR_AMOUNT().toString());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CURRNCY_CD") && key.getin_tShipOdr_CURRNCY_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CURRNCY_CD", key.getin_tShipOdr_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_PKG_UNIT_QTY") && key.getin_tShipOdr_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("in_tShipOdr_PKG_UNIT_QTY", key.getin_tShipOdr_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_REMARKS") && key.getin_tShipOdr_REMARKS() != null) {
					msgKey.setKeyValue("in_tShipOdr_REMARKS", key.getin_tShipOdr_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ALLCT_WH_CD") && key.getin_tShipOdr_ALLCT_WH_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_ALLCT_WH_CD", key.getin_tShipOdr_ALLCT_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DEPO_TYP") && key.getin_tShipOdr_DEPO_TYP() != null) {
					msgKey.setKeyValue("in_tShipOdr_DEPO_TYP", key.getin_tShipOdr_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_ENTRY_TYP") && key.getin_tShipOdr_ENTRY_TYP() != null) {
					msgKey.setKeyValue("in_tShipOdr_ENTRY_TYP", key.getin_tShipOdr_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_PRINT_FLG") && key.getin_tShipOdr_PRINT_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_PRINT_FLG", key.getin_tShipOdr_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHP_CMPLT_FLG") && key.getin_tShipOdr_SHP_CMPLT_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHP_CMPLT_FLG", key.getin_tShipOdr_SHP_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DEL_FLG") && key.getin_tShipOdr_DEL_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_DEL_FLG", key.getin_tShipOdr_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSPORT_CD") && key.getin_tShipOdr_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_TRANSPORT_CD", key.getin_tShipOdr_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DIRECT_DLV_FLG") && key.getin_tShipOdr_DIRECT_DLV_FLG() != null) {
					msgKey.setKeyValue("in_tShipOdr_DIRECT_DLV_FLG", key.getin_tShipOdr_DIRECT_DLV_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CHRG_PSN_CD") && key.getin_tShipOdr_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_CUST_CHRG_PSN_CD", key.getin_tShipOdr_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_CD") && key.getin_tShipOdr_UNIT_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_UNIT_CD", key.getin_tShipOdr_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SCDL_DLV_DATE") && key.getin_tShipOdr_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("in_tShipOdr_SCDL_DLV_DATE", key.getin_tShipOdr_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSFER_WH_CD") && key.getin_tShipOdr_TRANSFER_WH_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_TRANSFER_WH_CD", key.getin_tShipOdr_TRANSFER_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_KEY_NO") && key.getin_tShipOdr_DLV_KEY_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_DLV_KEY_NO", key.getin_tShipOdr_DLV_KEY_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES") && key.getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES", key.getin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES().toString());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_NO") && key.getin_tShipOdr_SHIP_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipOdr_SHIP_ODR_NO", key.getin_tShipOdr_SHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipOdr_JOB_ODR_CD") && key.getin_tShipOdr_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("in_tShipOdr_JOB_ODR_CD", key.getin_tShipOdr_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("del_tShipOdr_IN_SLIPCD") && key.getdel_tShipOdr_IN_SLIPCD() != null) {
					msgKey.setKeyValue("del_tShipOdr_IN_SLIPCD", key.getdel_tShipOdr_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_CD") && key.getchkisinWhCd_WH_CD() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_CD", key.getchkisinWhCd_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_TYP") && key.getchkisinWhCd_WH_TYP() != null) {
					msgKey.setKeyValue("chkisinWhCd_WH_TYP", key.getchkisinWhCd_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("chkis_IN_WHCD") && key.getchkis_IN_WHCD() != null) {
					msgKey.setKeyValue("chkis_IN_WHCD", key.getchkis_IN_WHCD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_WH_CD") && key.getchkisWhCd_WH_CD() != null) {
					msgKey.setKeyValue("chkisWhCd_WH_CD", key.getchkisWhCd_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_WH_TYP") && key.getchkisWhCd_WH_TYP() != null) {
					msgKey.setKeyValue("chkisWhCd_WH_TYP", key.getchkisWhCd_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_ITEM_CD") && key.getchkisWhCd_ITEM_CD() != null) {
					msgKey.setKeyValue("chkisWhCd_ITEM_CD", key.getchkisWhCd_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_PBL_SHIP_QTY") && key.getchkisWhCd_PBL_SHIP_QTY() != null) {
					msgKey.setKeyValue("chkisWhCd_PBL_SHIP_QTY", key.getchkisWhCd_PBL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_IN_ITEMCD") && key.getchkisWhCd_IN_ITEMCD() != null) {
					msgKey.setKeyValue("chkisWhCd_IN_ITEMCD", key.getchkisWhCd_IN_ITEMCD());
				}
				if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHCD") && key.getchkisWhCd_IN_WHCD() != null) {
					msgKey.setKeyValue("chkisWhCd_IN_WHCD", key.getchkisWhCd_IN_WHCD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_NO") && key.gettOdr_ODR_NO() != null) {
					msgKey.setKeyValue("tOdr_ODR_NO", key.gettOdr_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_TYP") && key.gettOdr_ODR_TYP() != null) {
					msgKey.setKeyValue("tOdr_ODR_TYP", key.gettOdr_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_CTL_NO") && key.gettOdr_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("tOdr_ODR_CTL_NO", key.gettOdr_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUST_ODR_NO") && key.gettOdr_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("tOdr_CUST_ODR_NO", key.gettOdr_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_ORG_CD") && key.gettOdr_CUST_CHRG_ORG_CD() != null) {
					msgKey.setKeyValue("tOdr_CUST_CHRG_ORG_CD", key.gettOdr_CUST_CHRG_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_PSN_CD") && key.gettOdr_CUST_CHRG_PSN_CD() != null) {
					msgKey.setKeyValue("tOdr_CUST_CHRG_PSN_CD", key.gettOdr_CUST_CHRG_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_ORG_CD") && key.gettOdr_ODR_ACPT_ORG_CD() != null) {
					msgKey.setKeyValue("tOdr_ODR_ACPT_ORG_CD", key.gettOdr_ODR_ACPT_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_PSN_CD") && key.gettOdr_ODR_ACPT_PSN_CD() != null) {
					msgKey.setKeyValue("tOdr_ODR_ACPT_PSN_CD", key.gettOdr_ODR_ACPT_PSN_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CURRNCY_CD") && key.gettOdr_CURRNCY_CD() != null) {
					msgKey.setKeyValue("tOdr_CURRNCY_CD", key.gettOdr_CURRNCY_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_EXCH_TYP") && key.gettOdr_EXCH_TYP() != null) {
					msgKey.setKeyValue("tOdr_EXCH_TYP", key.gettOdr_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD") && key.gettOdr_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_CD", key.gettOdr_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD_EIAJ") && key.gettOdr_DLV_LOC_CD_EIAJ() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_CD_EIAJ", key.gettOdr_DLV_LOC_CD_EIAJ());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME") && key.gettOdr_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_NAME", key.gettOdr_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME_KANJI") && key.gettOdr_DLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("tOdr_DLV_LOC_NAME_KANJI", key.gettOdr_DLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PRD_ODR_PLACE_CD") && key.gettOdr_PRD_ODR_PLACE_CD() != null) {
					msgKey.setKeyValue("tOdr_PRD_ODR_PLACE_CD", key.gettOdr_PRD_ODR_PLACE_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_UNIT_PRICE") && key.gettOdr_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("tOdr_ODR_UNIT_PRICE", key.gettOdr_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SPCL_PRICE_TYP") && key.gettOdr_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("tOdr_SPCL_PRICE_TYP", key.gettOdr_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PART_DLV_COUNT") && key.gettOdr_PART_DLV_COUNT() != null) {
					msgKey.setKeyValue("tOdr_PART_DLV_COUNT", key.gettOdr_PART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DEPO_TYP") && key.gettOdr_DEPO_TYP() != null) {
					msgKey.setKeyValue("tOdr_DEPO_TYP", key.gettOdr_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_DESINATED_DLV_DATE") && key.gettOdr_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("tOdr_DESINATED_DLV_DATE", key.gettOdr_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_STD_DESINATED_RCV_DATE") && key.gettOdr_STD_DESINATED_RCV_DATE() != null) {
					msgKey.setKeyValue("tOdr_STD_DESINATED_RCV_DATE", key.gettOdr_STD_DESINATED_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_QTY") && key.gettOdr_ODR_QTY() != null) {
					msgKey.setKeyValue("tOdr_ODR_QTY", key.gettOdr_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_REMAIN_UNCONFIRM_ODR_QTY") && key.gettOdr_REMAIN_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("tOdr_REMAIN_UNCONFIRM_ODR_QTY", key.gettOdr_REMAIN_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CANCELED_UNCONFIRM_ODR_QTY") && key.gettOdr_CANCELED_UNCONFIRM_ODR_QTY() != null) {
					msgKey.setKeyValue("tOdr_CANCELED_UNCONFIRM_ODR_QTY", key.gettOdr_CANCELED_UNCONFIRM_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD") && key.gettOdr_UNIT_CD() != null) {
					msgKey.setKeyValue("tOdr_UNIT_CD", key.gettOdr_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRM_ODR_BALANCE") && key.gettOdr_UNCONFIRM_ODR_BALANCE() != null) {
					msgKey.setKeyValue("tOdr_UNCONFIRM_ODR_BALANCE", key.gettOdr_UNCONFIRM_ODR_BALANCE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT") && key.gettOdr_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("tOdr_ODR_AMOUNT", key.gettOdr_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT_EXCH_RATES") && key.gettOdr_ODR_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("tOdr_ODR_AMOUNT_EXCH_RATES", key.gettOdr_ODR_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TOTAL_SHIP_QTY") && key.gettOdr_TOTAL_SHIP_QTY() != null) {
					msgKey.setKeyValue("tOdr_TOTAL_SHIP_QTY", key.gettOdr_TOTAL_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT") && key.gettOdr_SHIP_AMOUNT() != null) {
					msgKey.setKeyValue("tOdr_SHIP_AMOUNT", key.gettOdr_SHIP_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT_EXCH_RATES") && key.gettOdr_SHIP_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("tOdr_SHIP_AMOUNT_EXCH_RATES", key.gettOdr_SHIP_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_PRICE") && key.gettOdr_RETURN_PRICE() != null) {
					msgKey.setKeyValue("tOdr_RETURN_PRICE", key.gettOdr_RETURN_PRICE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_QTY") && key.gettOdr_RETURN_QTY() != null) {
					msgKey.setKeyValue("tOdr_RETURN_QTY", key.gettOdr_RETURN_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT") && key.gettOdr_RETURN_AMOUNT() != null) {
					msgKey.setKeyValue("tOdr_RETURN_AMOUNT", key.gettOdr_RETURN_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT_EXCH_RATES") && key.gettOdr_RETURN_AMOUNT_EXCH_RATES() != null) {
					msgKey.setKeyValue("tOdr_RETURN_AMOUNT_EXCH_RATES", key.gettOdr_RETURN_AMOUNT_EXCH_RATES());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_FLG") && key.gettOdr_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("tOdr_ODR_CMPLT_FLG", key.gettOdr_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_DATE") && key.gettOdr_ODR_CMPLT_DATE() != null) {
					msgKey.setKeyValue("tOdr_ODR_CMPLT_DATE", key.gettOdr_ODR_CMPLT_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_CD") && key.gettOdr_CUS_DLV_CD() != null) {
					msgKey.setKeyValue("tOdr_CUS_DLV_CD", key.gettOdr_CUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_KEY_CD") && key.gettOdr_CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("tOdr_CUS_DLV_KEY_CD", key.gettOdr_CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PART_NAME") && key.gettOdr_PART_NAME() != null) {
					msgKey.setKeyValue("tOdr_PART_NAME", key.gettOdr_PART_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PKG_UNIT") && key.gettOdr_PKG_UNIT() != null) {
					msgKey.setKeyValue("tOdr_PKG_UNIT", key.gettOdr_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SLIP_PRICE_PRINT_TYP") && key.gettOdr_SLIP_PRICE_PRINT_TYP() != null) {
					msgKey.setKeyValue("tOdr_SLIP_PRICE_PRINT_TYP", key.gettOdr_SLIP_PRICE_PRINT_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_INSPC_TYP") && key.gettOdr_INSPC_TYP() != null) {
					msgKey.setKeyValue("tOdr_INSPC_TYP", key.gettOdr_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK") && key.gettOdr_CLIENT_REMARK() != null) {
					msgKey.setKeyValue("tOdr_CLIENT_REMARK", key.gettOdr_CLIENT_REMARK());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK_KANJI") && key.gettOdr_CLIENT_REMARK_KANJI() != null) {
					msgKey.setKeyValue("tOdr_CLIENT_REMARK_KANJI", key.gettOdr_CLIENT_REMARK_KANJI());
				}
				if(msgKeyType.containsKeyColumn("tOdr_CLIENT_BARCODE_INF") && key.gettOdr_CLIENT_BARCODE_INF() != null) {
					msgKey.setKeyValue("tOdr_CLIENT_BARCODE_INF", key.gettOdr_CLIENT_BARCODE_INF());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_CD") && key.gettOdr_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("tOdr_TRANSPORT_CD", key.gettOdr_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_TYP") && key.gettOdr_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("tOdr_TRANSPORT_TYP", key.gettOdr_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TAX_APPLY_TYP") && key.gettOdr_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("tOdr_TAX_APPLY_TYP", key.gettOdr_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TAX_CD") && key.gettOdr_TAX_CD() != null) {
					msgKey.setKeyValue("tOdr_TAX_CD", key.gettOdr_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdr_TAX_CALC_TYP") && key.gettOdr_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("tOdr_TAX_CALC_TYP", key.gettOdr_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_REMARKS") && key.gettOdr_REMARKS() != null) {
					msgKey.setKeyValue("tOdr_REMARKS", key.gettOdr_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_DATE") && key.gettOdr_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("tOdr_ODR_ACPT_DATE", key.gettOdr_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_REMAIN_QTY") && key.gettOdr_SHIP_PLAN_REMAIN_QTY() != null) {
					msgKey.setKeyValue("tOdr_SHIP_PLAN_REMAIN_QTY", key.gettOdr_SHIP_PLAN_REMAIN_QTY());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_CMPLT_FLG") && key.gettOdr_SHIP_PLAN_CMPLT_FLG() != null) {
					msgKey.setKeyValue("tOdr_SHIP_PLAN_CMPLT_FLG", key.gettOdr_SHIP_PLAN_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG") && key.gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG() != null) {
					msgKey.setKeyValue("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG", key.gettOdr_UNCONFIRMED_ODR_EFF_OVR_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PARTIAL_SHIP_INST_FLG") && key.gettOdr_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("tOdr_PARTIAL_SHIP_INST_FLG", key.gettOdr_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_IF_CTL_NO") && key.gettOdr_IF_CTL_NO() != null) {
					msgKey.setKeyValue("tOdr_IF_CTL_NO", key.gettOdr_IF_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdr_ENTRY_TYP") && key.gettOdr_ENTRY_TYP() != null) {
					msgKey.setKeyValue("tOdr_ENTRY_TYP", key.gettOdr_ENTRY_TYP());
				}
				if(msgKeyType.containsKeyColumn("tOdr_BUYER_NAME") && key.gettOdr_BUYER_NAME() != null) {
					msgKey.setKeyValue("tOdr_BUYER_NAME", key.gettOdr_BUYER_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdr_PUCH_ODR_QTY_TOTAL") && key.gettOdr_PUCH_ODR_QTY_TOTAL() != null) {
					msgKey.setKeyValue("tOdr_PUCH_ODR_QTY_TOTAL", key.gettOdr_PUCH_ODR_QTY_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD_ORG") && key.gettOdr_UNIT_CD_ORG() != null) {
					msgKey.setKeyValue("tOdr_UNIT_CD_ORG", key.gettOdr_UNIT_CD_ORG());
				}
				if(msgKeyType.containsKeyColumn("tOdr_SHIP_CNT") && key.gettOdr_SHIP_CNT() != null) {
					msgKey.setKeyValue("tOdr_SHIP_CNT", key.gettOdr_SHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO") && key.gettOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("tOdr_IN_ODRNO", key.gettOdr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_PART_DLV_COUNT") && key.getuptOdr_PART_DLV_COUNT() != null) {
					msgKey.setKeyValue("uptOdr_PART_DLV_COUNT", key.getuptOdr_PART_DLV_COUNT());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_IN_ODRNO") && key.getuptOdr_IN_ODRNO() != null) {
					msgKey.setKeyValue("uptOdr_IN_ODRNO", key.getuptOdr_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ODR_CTL_NO") && key.gettOdrCtl_ODR_CTL_NO() != null) {
					msgKey.setKeyValue("tOdrCtl_ODR_CTL_NO", key.gettOdrCtl_ODR_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_CD") && key.gettOdrCtl_CUST_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_CD", key.gettOdrCtl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD") && key.gettOdrCtl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_ITEM_CD", key.gettOdrCtl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_NAME") && key.gettOdrCtl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("tOdrCtl_CUST_ITEM_NAME", key.gettOdrCtl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_CD") && key.gettOdrCtl_ITEM_CD() != null) {
					msgKey.setKeyValue("tOdrCtl_ITEM_CD", key.gettOdrCtl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_NAME") && key.gettOdrCtl_ITEM_NAME() != null) {
					msgKey.setKeyValue("tOdrCtl_ITEM_NAME", key.gettOdrCtl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("tOdrCtl_IN_ODRCTLNO") && key.gettOdrCtl_IN_ODRCTLNO() != null) {
					msgKey.setKeyValue("tOdrCtl_IN_ODRCTLNO", key.gettOdrCtl_IN_ODRCTLNO());
				}
				if(msgKeyType.containsKeyColumn("mItem_ITEM_CD") && key.getmItem_ITEM_CD() != null) {
					msgKey.setKeyValue("mItem_ITEM_CD", key.getmItem_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_ITEM_NAME") && key.getmItem_ITEM_NAME() != null) {
					msgKey.setKeyValue("mItem_ITEM_NAME", key.getmItem_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("mItem_PRODUCT_TYP") && key.getmItem_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("mItem_PRODUCT_TYP", key.getmItem_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_MRP_ODR_TYP") && key.getmItem_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("mItem_MRP_ODR_TYP", key.getmItem_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_DRAW_CD") && key.getmItem_DRAW_CD() != null) {
					msgKey.setKeyValue("mItem_DRAW_CD", key.getmItem_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_SPEC") && key.getmItem_SPEC() != null) {
					msgKey.setKeyValue("mItem_SPEC", key.getmItem_SPEC());
				}
				if(msgKeyType.containsKeyColumn("mItem_HIGH_LEVEL_NO") && key.getmItem_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("mItem_HIGH_LEVEL_NO", key.getmItem_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("mItem_OUTSIDE_TYP") && key.getmItem_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("mItem_OUTSIDE_TYP", key.getmItem_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT_FLG") && key.getmItem_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("mItem_STOCK_UNIT_FLG", key.getmItem_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT") && key.getmItem_STOCK_UNIT() != null) {
					msgKey.setKeyValue("mItem_STOCK_UNIT", key.getmItem_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT") && key.getmItem_PKG_UNIT() != null) {
					msgKey.setKeyValue("mItem_PKG_UNIT", key.getmItem_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT_QTY") && key.getmItem_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("mItem_PKG_UNIT_QTY", key.getmItem_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_UNIT_QTY_TYP") && key.getmItem_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("mItem_UNIT_QTY_TYP", key.getmItem_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_ODR_LT") && key.getmItem_ODR_LT() != null) {
					msgKey.setKeyValue("mItem_ODR_LT", key.getmItem_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_FIXED_LT") && key.getmItem_FIXED_LT() != null) {
					msgKey.setKeyValue("mItem_FIXED_LT", key.getmItem_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PROP_LT") && key.getmItem_PROP_LT() != null) {
					msgKey.setKeyValue("mItem_PROP_LT", key.getmItem_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_SAFETY_LT") && key.getmItem_SAFETY_LT() != null) {
					msgKey.setKeyValue("mItem_SAFETY_LT", key.getmItem_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_ISSUE_LT") && key.getmItem_ISSUE_LT() != null) {
					msgKey.setKeyValue("mItem_ISSUE_LT", key.getmItem_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("mItem_PROP_LOT_SIZE") && key.getmItem_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("mItem_PROP_LOT_SIZE", key.getmItem_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("mItem_ITEM_SPOIL") && key.getmItem_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("mItem_ITEM_SPOIL", key.getmItem_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("mItem_SAFETY_STOCK") && key.getmItem_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("mItem_SAFETY_STOCK", key.getmItem_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("mItem_LOT_SIZING_TYP") && key.getmItem_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("mItem_LOT_SIZING_TYP", key.getmItem_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_MAX_PERIOD") && key.getmItem_MAX_PERIOD() != null) {
					msgKey.setKeyValue("mItem_MAX_PERIOD", key.getmItem_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("mItem_MAX_ODR_QTY") && key.getmItem_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_MAX_ODR_QTY", key.getmItem_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_ODR_POINT") && key.getmItem_ODR_POINT() != null) {
					msgKey.setKeyValue("mItem_ODR_POINT", key.getmItem_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("mItem_FIXED_ODR_QTY") && key.getmItem_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_FIXED_ODR_QTY", key.getmItem_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_MIN_ODR_QTY") && key.getmItem_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_MIN_ODR_QTY", key.getmItem_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_MUL_ODR_QTY") && key.getmItem_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("mItem_MUL_ODR_QTY", key.getmItem_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("mItem_ISSUE_TYP") && key.getmItem_ISSUE_TYP() != null) {
					msgKey.setKeyValue("mItem_ISSUE_TYP", key.getmItem_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_MPS_FLG") && key.getmItem_MPS_FLG() != null) {
					msgKey.setKeyValue("mItem_MPS_FLG", key.getmItem_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("mItem_ACPT_INSPC_TYP") && key.getmItem_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("mItem_ACPT_INSPC_TYP", key.getmItem_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_CLASIFICATION_CD") && key.getmItem_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("mItem_CLASIFICATION_CD", key.getmItem_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_UNIT_WEIGHT") && key.getmItem_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("mItem_UNIT_WEIGHT", key.getmItem_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("mItem_ABC_TYP") && key.getmItem_ABC_TYP() != null) {
					msgKey.setKeyValue("mItem_ABC_TYP", key.getmItem_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_OPR_RSLT_TYP") && key.getmItem_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("mItem_OPR_RSLT_TYP", key.getmItem_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_SPL_ITEM_TYP") && key.getmItem_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("mItem_SPL_ITEM_TYP", key.getmItem_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("mItem_TAX_CD") && key.getmItem_TAX_CD() != null) {
					msgKey.setKeyValue("mItem_TAX_CD", key.getmItem_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("mItem_IN_ITEMCD") && key.getmItem_IN_ITEMCD() != null) {
					msgKey.setKeyValue("mItem_IN_ITEMCD", key.getmItem_IN_ITEMCD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_COMPANY_CD") && key.getmCustBase_COMPANY_CD() != null) {
					msgKey.setKeyValue("mCustBase_COMPANY_CD", key.getmCustBase_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_CUST_CD") && key.getmCustBase_CUST_CD() != null) {
					msgKey.setKeyValue("mCustBase_CUST_CD", key.getmCustBase_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_CD") && key.getmCustBase_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_CD", key.getmCustBase_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_NAME") && key.getmCustBase_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_NAME", key.getmCustBase_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_KNAME") && key.getmCustBase_DLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_KNAME", key.getmCustBase_DLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_ENAME") && key.getmCustBase_DLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_LOC_ENAME", key.getmCustBase_DLV_LOC_ENAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ZIP_CD") && key.getmCustBase_ZIP_CD() != null) {
					msgKey.setKeyValue("mCustBase_ZIP_CD", key.getmCustBase_ZIP_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_1") && key.getmCustBase_ADDRESS_1() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_1", key.getmCustBase_ADDRESS_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_2") && key.getmCustBase_ADDRESS_2() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_2", key.getmCustBase_ADDRESS_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_1") && key.getmCustBase_ADDRESS_K_1() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_K_1", key.getmCustBase_ADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_2") && key.getmCustBase_ADDRESS_K_2() != null) {
					msgKey.setKeyValue("mCustBase_ADDRESS_K_2", key.getmCustBase_ADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TEL") && key.getmCustBase_TEL() != null) {
					msgKey.setKeyValue("mCustBase_TEL", key.getmCustBase_TEL());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_FAX") && key.getmCustBase_FAX() != null) {
					msgKey.setKeyValue("mCustBase_FAX", key.getmCustBase_FAX());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_SHIP_WH_CD") && key.getmCustBase_SHIP_WH_CD() != null) {
					msgKey.setKeyValue("mCustBase_SHIP_WH_CD", key.getmCustBase_SHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_CD") && key.getmCustBase_TRANSPORT_CD() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_CD", key.getmCustBase_TRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_NAME") && key.getmCustBase_TRANSPORT_NAME() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_NAME", key.getmCustBase_TRANSPORT_NAME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_LT") && key.getmCustBase_TRANSPORT_LT() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_LT", key.getmCustBase_TRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_CAL_NO") && key.getmCustBase_CAL_NO() != null) {
					msgKey.setKeyValue("mCustBase_CAL_NO", key.getmCustBase_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_TYP") && key.getmCustBase_TRANSPORT_TYP() != null) {
					msgKey.setKeyValue("mCustBase_TRANSPORT_TYP", key.getmCustBase_TRANSPORT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_START_TIME") && key.getmCustBase_DLV_START_TIME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_START_TIME", key.getmCustBase_DLV_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DLV_END_TIME") && key.getmCustBase_DLV_END_TIME() != null) {
					msgKey.setKeyValue("mCustBase_DLV_END_TIME", key.getmCustBase_DLV_END_TIME());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP1") && key.getmCustBase_AREA_CLASS_TYP1() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_TYP1", key.getmCustBase_AREA_CLASS_TYP1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_1") && key.getmCustBase_AREA_CLASS_1() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_1", key.getmCustBase_AREA_CLASS_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP2") && key.getmCustBase_AREA_CLASS_TYP2() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_TYP2", key.getmCustBase_AREA_CLASS_TYP2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_2") && key.getmCustBase_AREA_CLASS_2() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_2", key.getmCustBase_AREA_CLASS_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP3") && key.getmCustBase_AREA_CLASS_TYP3() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_TYP3", key.getmCustBase_AREA_CLASS_TYP3());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_3") && key.getmCustBase_AREA_CLASS_3() != null) {
					msgKey.setKeyValue("mCustBase_AREA_CLASS_3", key.getmCustBase_AREA_CLASS_3());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_1") && key.getmCustBase_REMARKS_1() != null) {
					msgKey.setKeyValue("mCustBase_REMARKS_1", key.getmCustBase_REMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_2") && key.getmCustBase_REMARKS_2() != null) {
					msgKey.setKeyValue("mCustBase_REMARKS_2", key.getmCustBase_REMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_3") && key.getmCustBase_REMARKS_3() != null) {
					msgKey.setKeyValue("mCustBase_REMARKS_3", key.getmCustBase_REMARKS_3());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_DEPO_WH_CD") && key.getmCustBase_DEPO_WH_CD() != null) {
					msgKey.setKeyValue("mCustBase_DEPO_WH_CD", key.getmCustBase_DEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_IN_COMPANYCD") && key.getmCustBase_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("mCustBase_IN_COMPANYCD", key.getmCustBase_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_IN_CUSTCD") && key.getmCustBase_IN_CUSTCD() != null) {
					msgKey.setKeyValue("mCustBase_IN_CUSTCD", key.getmCustBase_IN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("mCustBase_IN_DLVLOCCD") && key.getmCustBase_IN_DLVLOCCD() != null) {
					msgKey.setKeyValue("mCustBase_IN_DLVLOCCD", key.getmCustBase_IN_DLVLOCCD());
				}
				if(msgKeyType.containsKeyColumn("mCust_COMPANY_CD") && key.getmCust_COMPANY_CD() != null) {
					msgKey.setKeyValue("mCust_COMPANY_CD", key.getmCust_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_CD") && key.getmCust_CUST_CD() != null) {
					msgKey.setKeyValue("mCust_CUST_CD", key.getmCust_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_NAME") && key.getmCust_CUST_NAME() != null) {
					msgKey.setKeyValue("mCust_CUST_NAME", key.getmCust_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_ANAME") && key.getmCust_CUST_ANAME() != null) {
					msgKey.setKeyValue("mCust_CUST_ANAME", key.getmCust_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUST_KNAME") && key.getmCust_CUST_KNAME() != null) {
					msgKey.setKeyValue("mCust_CUST_KNAME", key.getmCust_CUST_KNAME());
				}
				if(msgKeyType.containsKeyColumn("mCust_OWN_ORG_CD") && key.getmCust_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("mCust_OWN_ORG_CD", key.getmCust_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_OWN_PERSON_CD") && key.getmCust_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("mCust_OWN_PERSON_CD", key.getmCust_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_CUR_CD") && key.getmCust_CUR_CD() != null) {
					msgKey.setKeyValue("mCust_CUR_CD", key.getmCust_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_EXCH_TYP") && key.getmCust_EXCH_TYP() != null) {
					msgKey.setKeyValue("mCust_EXCH_TYP", key.getmCust_EXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_TAX_APPLY_TYP") && key.getmCust_TAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("mCust_TAX_APPLY_TYP", key.getmCust_TAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_TAX_CD") && key.getmCust_TAX_CD() != null) {
					msgKey.setKeyValue("mCust_TAX_CD", key.getmCust_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_TAX_CALC_TYP") && key.getmCust_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("mCust_TAX_CALC_TYP", key.getmCust_TAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_PRICE_ROUND_TYP") && key.getmCust_PRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("mCust_PRICE_ROUND_TYP", key.getmCust_PRICE_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_DETAIL_ROUND_TYP") && key.getmCust_DETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("mCust_DETAIL_ROUND_TYP", key.getmCust_DETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_PRIOD") && key.getmCust_UNCONFIRM_ODR_EFF_PRIOD() != null) {
					msgKey.setKeyValue("mCust_UNCONFIRM_ODR_EFF_PRIOD", key.getmCust_UNCONFIRM_ODR_EFF_PRIOD());
				}
				if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_TERM_FLG") && key.getmCust_UNCONFIRM_ODR_EFF_TERM_FLG() != null) {
					msgKey.setKeyValue("mCust_UNCONFIRM_ODR_EFF_TERM_FLG", key.getmCust_UNCONFIRM_ODR_EFF_TERM_FLG());
				}
				if(msgKeyType.containsKeyColumn("mCust_EDI_CUST_VEND_CD") && key.getmCust_EDI_CUST_VEND_CD() != null) {
					msgKey.setKeyValue("mCust_EDI_CUST_VEND_CD", key.getmCust_EDI_CUST_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("mCust_PARTIAL_SHIP_INST_FLG") && key.getmCust_PARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("mCust_PARTIAL_SHIP_INST_FLG", key.getmCust_PARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("mCust_DEPO_TYP") && key.getmCust_DEPO_TYP() != null) {
					msgKey.setKeyValue("mCust_DEPO_TYP", key.getmCust_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_INSPC_ACPT_TYP") && key.getmCust_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("mCust_INSPC_ACPT_TYP", key.getmCust_INSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("mCust_IN_COMPANYCD") && key.getmCust_IN_COMPANYCD() != null) {
					msgKey.setKeyValue("mCust_IN_COMPANYCD", key.getmCust_IN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("mCust_IN_CUSTCD") && key.getmCust_IN_CUSTCD() != null) {
					msgKey.setKeyValue("mCust_IN_CUSTCD", key.getmCust_IN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("strYotaku_WH_CD") && key.getstrYotaku_WH_CD() != null) {
					msgKey.setKeyValue("strYotaku_WH_CD", key.getstrYotaku_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("strYotaku_IN_WH_TYP") && key.getstrYotaku_IN_WH_TYP() != null) {
					msgKey.setKeyValue("strYotaku_IN_WH_TYP", key.getstrYotaku_IN_WH_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SLIP_CD") && key.getin_tShipSlip_SLIP_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_SLIP_CD", key.getin_tShipSlip_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_ITEM_CD") && key.getin_tShipSlip_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_ITEM_CD", key.getin_tShipSlip_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ITEM_CD") && key.getin_tShipSlip_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_ITEM_CD", key.getin_tShipSlip_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_PART_NAME") && key.getin_tShipSlip_PART_NAME() != null) {
					msgKey.setKeyValue("in_tShipSlip_PART_NAME", key.getin_tShipSlip_PART_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ODR_NO") && key.getin_tShipSlip_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_ODR_NO", key.getin_tShipSlip_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_CD") && key.getin_tShipSlip_CUST_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_CD", key.getin_tShipSlip_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_NAME") && key.getin_tShipSlip_CUST_NAME() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUST_NAME", key.getin_tShipSlip_CUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_CD") && key.getin_tShipSlip_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_DLV_LOC_CD", key.getin_tShipSlip_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_NAME_KANJI") && key.getin_tShipSlip_DLV_LOC_NAME_KANJI() != null) {
					msgKey.setKeyValue("in_tShipSlip_DLV_LOC_NAME_KANJI", key.getin_tShipSlip_DLV_LOC_NAME_KANJI());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CUS_DLV_KEY_CD") && key.getin_tShipSlip_CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_CUS_DLV_KEY_CD", key.getin_tShipSlip_CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_SHIP_DATE") && key.getin_tShipSlip_DESINATED_SHIP_DATE() != null) {
					msgKey.setKeyValue("in_tShipSlip_DESINATED_SHIP_DATE", key.getin_tShipSlip_DESINATED_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_DLV_DATE") && key.getin_tShipSlip_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("in_tShipSlip_DESINATED_DLV_DATE", key.getin_tShipSlip_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SCDL_DLV_DATE") && key.getin_tShipSlip_SCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("in_tShipSlip_SCDL_DLV_DATE", key.getin_tShipSlip_SCDL_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_QTY") && key.getin_tShipSlip_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("in_tShipSlip_SHIP_ODR_QTY", key.getin_tShipSlip_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_CD") && key.getin_tShipSlip_UNIT_CD() != null) {
					msgKey.setKeyValue("in_tShipSlip_UNIT_CD", key.getin_tShipSlip_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_PRICE") && key.getin_tShipSlip_UNIT_PRICE() != null) {
					msgKey.setKeyValue("in_tShipSlip_UNIT_PRICE", key.getin_tShipSlip_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT") && key.getin_tShipSlip_SHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT", key.getin_tShipSlip_SHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT") && key.getin_tShipSlip_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT", key.getin_tShipSlip_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_INSPC_TYP") && key.getin_tShipSlip_INSPC_TYP() != null) {
					msgKey.setKeyValue("in_tShipSlip_INSPC_TYP", key.getin_tShipSlip_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_REMARK_KANJI") && key.getin_tShipSlip_CLIENT_REMARK_KANJI() != null) {
					msgKey.setKeyValue("in_tShipSlip_CLIENT_REMARK_KANJI", key.getin_tShipSlip_CLIENT_REMARK_KANJI());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_BARCODE_INF") && key.getin_tShipSlip_CLIENT_BARCODE_INF() != null) {
					msgKey.setKeyValue("in_tShipSlip_CLIENT_BARCODE_INF", key.getin_tShipSlip_CLIENT_BARCODE_INF());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_PRINT_FLG") && key.getin_tShipSlip_PRINT_FLG() != null) {
					msgKey.setKeyValue("in_tShipSlip_PRINT_FLG", key.getin_tShipSlip_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DEL_FLG") && key.getin_tShipSlip_DEL_FLG() != null) {
					msgKey.setKeyValue("in_tShipSlip_DEL_FLG", key.getin_tShipSlip_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_BUYER_NAME") && key.getin_tShipSlip_BUYER_NAME() != null) {
					msgKey.setKeyValue("in_tShipSlip_BUYER_NAME", key.getin_tShipSlip_BUYER_NAME());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_PUCH_ODR_QTY_TOTAL") && key.getin_tShipSlip_PUCH_ODR_QTY_TOTAL() != null) {
					msgKey.setKeyValue("in_tShipSlip_PUCH_ODR_QTY_TOTAL", key.getin_tShipSlip_PUCH_ODR_QTY_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_ODR_QTY") && key.getin_tShipSlip_DLV_ODR_QTY() != null) {
					msgKey.setKeyValue("in_tShipSlip_DLV_ODR_QTY", key.getin_tShipSlip_DLV_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT_TAX") && key.getin_tShipSlip_SHIP_ODR_AMOUNT_TAX() != null) {
					msgKey.setKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT_TAX", key.getin_tShipSlip_SHIP_ODR_AMOUNT_TAX());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT") && key.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT", key.getin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT") && key.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT", key.getin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAXFREE_SALES_AMOUNT") && key.getin_tShipSlip_TAXFREE_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAXFREE_SALES_AMOUNT", key.getin_tShipSlip_TAXFREE_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT") && key.getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT", key.getin_tShipSlip_TAX_CREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_AMOUNT") && key.getin_tShipSlip_EXTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_EXTERNAL_TAX_AMOUNT", key.getin_tShipSlip_EXTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_AMOUNT") && key.getin_tShipSlip_INTERNAL_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_INTERNAL_TAX_AMOUNT", key.getin_tShipSlip_INTERNAL_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_1") && key.getin_tShipSlip_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT_1", key.getin_tShipSlip_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_2") && key.getin_tShipSlip_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT_2", key.getin_tShipSlip_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_3") && key.getin_tShipSlip_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("in_tShipSlip_TAX_AMOUNT_3", key.getin_tShipSlip_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT") && key.getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT() != null) {
					msgKey.setKeyValue("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT", key.getin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("del_tShipSlip_IN_SLIPCD") && key.getdel_tShipSlip_IN_SLIPCD() != null) {
					msgKey.setKeyValue("del_tShipSlip_IN_SLIPCD", key.getdel_tShipSlip_IN_SLIPCD());
				}
				if(msgKeyType.containsKeyColumn("uptOdr_SHIP_CNT") && key.getuptOdr_SHIP_CNT() != null) {
					msgKey.setKeyValue("uptOdr_SHIP_CNT", key.getuptOdr_SHIP_CNT());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_SEQ_NO") && key.gettUnShipList_UN_SHIP_SEQ_NO() != null) {
					msgKey.setKeyValue("tUnShipList_UN_SHIP_SEQ_NO", key.gettUnShipList_UN_SHIP_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_CUST_CD") && key.gettUnShipList_CUST_CD() != null) {
					msgKey.setKeyValue("tUnShipList_CUST_CD", key.gettUnShipList_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_ACPT_ODR_CD") && key.gettUnShipList_ACPT_ODR_CD() != null) {
					msgKey.setKeyValue("tUnShipList_ACPT_ODR_CD", key.gettUnShipList_ACPT_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_PART_DLV_SEQ_NO") && key.gettUnShipList_PART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("tUnShipList_PART_DLV_SEQ_NO", key.gettUnShipList_PART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_ITEM_CD") && key.gettUnShipList_ITEM_CD() != null) {
					msgKey.setKeyValue("tUnShipList_ITEM_CD", key.gettUnShipList_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_QTY") && key.gettUnShipList_UN_SHIP_QTY() != null) {
					msgKey.setKeyValue("tUnShipList_UN_SHIP_QTY", key.gettUnShipList_UN_SHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_RSN") && key.gettUnShipList_UN_SHIP_RSN() != null) {
					msgKey.setKeyValue("tUnShipList_UN_SHIP_RSN", key.gettUnShipList_UN_SHIP_RSN());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_WH_CD") && key.gettUnShipList_WH_CD() != null) {
					msgKey.setKeyValue("tUnShipList_WH_CD", key.gettUnShipList_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_PRINT_FLG") && key.gettUnShipList_PRINT_FLG() != null) {
					msgKey.setKeyValue("tUnShipList_PRINT_FLG", key.gettUnShipList_PRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tUnShipList_DEL_FLG") && key.gettUnShipList_DEL_FLG() != null) {
					msgKey.setKeyValue("tUnShipList_DEL_FLG", key.gettUnShipList_DEL_FLG());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_REST_SHIP_ODR_QTY") && key.gettori_tAnsDlvDate_REST_SHIP_ODR_QTY() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_REST_SHIP_ODR_QTY", key.gettori_tAnsDlvDate_REST_SHIP_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG") && key.gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG", key.gettori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_ODRNO") && key.gettori_tAnsDlvDate_IN_ODRNO() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_IN_ODRNO", key.gettori_tAnsDlvDate_IN_ODRNO());
				}
				if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_PARTDLVSEQNO") && key.gettori_tAnsDlvDate_IN_PARTDLVSEQNO() != null) {
					msgKey.setKeyValue("tori_tAnsDlvDate_IN_PARTDLVSEQNO", key.gettori_tAnsDlvDate_IN_PARTDLVSEQNO());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("strTAX_CD") && key.getstrTAX_CD() != null) {
					msgKey.setKeyValue("strTAX_CD", key.getstrTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_MODIFY_COUNT") && key.getSHIP_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SHIP_MODIFY_COUNT", key.getSHIP_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT") && key.getSEL_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("SEL_MODIFY_COUNT", key.getSEL_MODIFY_COUNT());
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
					KU0060010Struct key = new KU0060010Struct();
					if(msgKeyType.containsKeyColumn("r1_SHIP_ODR")) {
						key.setr1_SHIP_ODR(msgKey.getKeyValue("r1_SHIP_ODR"));
					}
					if(msgKeyType.containsKeyColumn("r2_SHIP_ODR")) {
						key.setr2_SHIP_ODR(msgKey.getKeyValue("r2_SHIP_ODR"));
					}
					if(msgKeyType.containsKeyColumn("tAnsDlvDate_MODIFY_COUNT")) {
						key.settAnsDlvDate_MODIFY_COUNT(msgKey.getKeyValue("tAnsDlvDate_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("tShipOdr_MODIFY_COUNT")) {
						key.settShipOdr_MODIFY_COUNT(msgKey.getKeyValue("tShipOdr_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("Shipt_MODIFY_COUNT")) {
						key.setShipt_MODIFY_COUNT(msgKey.getKeyValue("Shipt_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("strBUSINESS_OPR_DATE")) {
						key.setstrBUSINESS_OPR_DATE(msgKey.getKeyValue("strBUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_CD")) {
						key.setstrPLANT_CD(msgKey.getKeyValue("strPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("strTaxTAX_KBN")) {
						key.setstrTaxTAX_KBN(msgKey.getKeyValue("strTaxTAX_KBN"));
					}
					if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_1")) {
						key.setstrTaxOLD_TAX_1(msgKey.getKeyValue("strTaxOLD_TAX_1"));
					}
					if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_2")) {
						key.setstrTaxOLD_TAX_2(msgKey.getKeyValue("strTaxOLD_TAX_2"));
					}
					if(msgKeyType.containsKeyColumn("strTaxOLD_TAX_3")) {
						key.setstrTaxOLD_TAX_3(msgKey.getKeyValue("strTaxOLD_TAX_3"));
					}
					if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_1")) {
						key.setstrTaxNEW_TAX_1(msgKey.getKeyValue("strTaxNEW_TAX_1"));
					}
					if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_2")) {
						key.setstrTaxNEW_TAX_2(msgKey.getKeyValue("strTaxNEW_TAX_2"));
					}
					if(msgKeyType.containsKeyColumn("strTaxNEW_TAX_3")) {
						key.setstrTaxNEW_TAX_3(msgKey.getKeyValue("strTaxNEW_TAX_3"));
					}
					if(msgKeyType.containsKeyColumn("strTaxSTART_DATE")) {
						key.setstrTaxSTART_DATE(msgKey.getKeyValue("strTaxSTART_DATE"));
					}
					if(msgKeyType.containsKeyColumn("strTaxROUND_TYP")) {
						key.setstrTaxROUND_TYP(msgKey.getKeyValue("strTaxROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_COMPANYCD")) {
						key.setstrTaxIN_COMPANYCD(msgKey.getKeyValue("strTaxIN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_CUSTCD")) {
						key.setstrTaxIN_CUSTCD(msgKey.getKeyValue("strTaxIN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tDECIMAL_FIG")) {
						key.settDECIMAL_FIG(msgKey.getKeyValue("tDECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("tCUR_CD")) {
						key.settCUR_CD(msgKey.getKeyValue("tCUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("strUSER_NAME")) {
						key.setstrUSER_NAME(msgKey.getKeyValue("strUSER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strSECTION_CD")) {
						key.setstrSECTION_CD(msgKey.getKeyValue("strSECTION_CD"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_NAME")) {
						key.setstrPLANT_NAME(msgKey.getKeyValue("strPLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strPLANT_ANAME")) {
						key.setstrPLANT_ANAME(msgKey.getKeyValue("strPLANT_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("strCAL_NO")) {
						key.setstrCAL_NO(msgKey.getKeyValue("strCAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("strUSER_CD")) {
						key.setstrUSER_CD(msgKey.getKeyValue("strUSER_CD"));
					}
					if(msgKeyType.containsKeyColumn("strSYUKA_LT")) {
						key.setstrSYUKA_LT(msgKey.getKeyValue("strSYUKA_LT"));
					}
					if(msgKeyType.containsKeyColumn("tHOLIDAY_FLG")) {
						key.settHOLIDAY_FLG(msgKey.getKeyValue("tHOLIDAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tWH_CD")) {
						key.settWH_CD(msgKey.getKeyValue("tWH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tCAL_DATE")) {
						key.settCAL_DATE(msgKey.getKeyValue("tCAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_NO")) {
						key.setl_ODR_NO(msgKey.getKeyValue("l_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_PART_DLV_SEQ_NO")) {
						key.setl_PART_DLV_SEQ_NO(msgKey.getKeyValue("l_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_SHIP_DATE")) {
						key.setl_DESINATED_SHIP_DATE(msgKey.getKeyValue("l_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_SHIP_QTY")) {
						key.setl_SHIP_QTY(msgKey.getKeyValue("l_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_REST_SHIP_QTY")) {
						key.setl_REST_SHIP_QTY(msgKey.getKeyValue("l_REST_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_CD")) {
						key.setl_WH_CD(msgKey.getKeyValue("l_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_WH_NAME")) {
						key.setl_WH_NAME(msgKey.getKeyValue("l_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_NAME")) {
						key.setl_CUST_NAME(msgKey.getKeyValue("l_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_STOCK_UNIT")) {
						key.setl_STOCK_UNIT(msgKey.getKeyValue("l_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_QTY_TYP")) {
						key.setl_UNIT_QTY_TYP(msgKey.getKeyValue("l_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_MRP_ODR_TYP")) {
						key.setl_MRP_ODR_TYP(msgKey.getKeyValue("l_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CTL_NO")) {
						key.setl_ODR_CTL_NO(msgKey.getKeyValue("l_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_TRANSPORT_TYP")) {
						key.setl_TRANSPORT_TYP(msgKey.getKeyValue("l_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP")) {
						key.setl_SPCL_PRICE_TYP(msgKey.getKeyValue("l_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PARTIAL_SHIP_INST_FLG")) {
						key.setl_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("l_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_MODIFY_COUNT")) {
						key.setl_MODIFY_COUNT(msgKey.getKeyValue("l_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_SHIP_DATE")) {
						key.setDESINATED_SHIP_DATE(msgKey.getKeyValue("DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CHRG_PSN_CD")) {
						key.setCUST_CHRG_PSN_CD(msgKey.getKeyValue("CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_DESINATED_SHIP_DATE")) {
						key.setup_tAnsDlvDate_DESINATED_SHIP_DATE(msgKey.getKeyValue("up_tAnsDlvDate_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_REST_SHIP_ODR_QTY")) {
						key.setup_tAnsDlvDate_REST_SHIP_ODR_QTY(msgKey.getKeyValue("up_tAnsDlvDate_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG")) {
						key.setup_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(msgKey.getKeyValue("up_tAnsDlvDate_SHIP_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_ODRNO")) {
						key.setup_tAnsDlvDate_IN_ODRNO(msgKey.getKeyValue("up_tAnsDlvDate_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("up_tAnsDlvDate_IN_PARTDLVSEQNO")) {
						key.setup_tAnsDlvDate_IN_PARTDLVSEQNO(msgKey.getKeyValue("up_tAnsDlvDate_IN_PARTDLVSEQNO"));
					}
					if(msgKeyType.containsKeyColumn("l_SLIP_CD")) {
						key.setl_SLIP_CD(msgKey.getKeyValue("l_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_c_DIRECT_DLV_FLG")) {
						key.setl_c_DIRECT_DLV_FLG(msgKey.getKeyValue("l_c_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_MODIFY_COUNT")) {
						key.setl_DLV_MODIFY_COUNT(msgKey.getKeyValue("l_DLV_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ODR_NO")) {
						key.setin_tShipOdr_ODR_NO(msgKey.getKeyValue("in_tShipOdr_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_PART_DLV_SEQ_NO")) {
						key.setin_tShipOdr_PART_DLV_SEQ_NO(msgKey.getKeyValue("in_tShipOdr_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SLIP_CD")) {
						key.setin_tShipOdr_SLIP_CD(msgKey.getKeyValue("in_tShipOdr_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ITEM_CD")) {
						key.setin_tShipOdr_ITEM_CD(msgKey.getKeyValue("in_tShipOdr_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ITEM_CD")) {
						key.setin_tShipOdr_CUST_ITEM_CD(msgKey.getKeyValue("in_tShipOdr_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_ODR_NO")) {
						key.setin_tShipOdr_CUST_ODR_NO(msgKey.getKeyValue("in_tShipOdr_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CD")) {
						key.setin_tShipOdr_CUST_CD(msgKey.getKeyValue("in_tShipOdr_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_NAME")) {
						key.setin_tShipOdr_CUST_NAME(msgKey.getKeyValue("in_tShipOdr_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_ISS_PSN_CD")) {
						key.setin_tShipOdr_SHIP_ODR_ISS_PSN_CD(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_ISS_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_LOC_CD")) {
						key.setin_tShipOdr_DLV_LOC_CD(msgKey.getKeyValue("in_tShipOdr_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DESINATED_SHIP_DATE")) {
						key.setin_tShipOdr_DESINATED_SHIP_DATE(msgKey.getKeyValue("in_tShipOdr_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_QTY")) {
						key.setin_tShipOdr_SHIP_QTY(msgKey.getKeyValue("in_tShipOdr_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_PRICE")) {
						key.setin_tShipOdr_UNIT_PRICE(msgKey.getKeyValue("in_tShipOdr_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT")) {
						key.setin_tShipOdr_SHIP_ODR_AMOUNT(new Double(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT")));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CURRNCY_CD")) {
						key.setin_tShipOdr_CURRNCY_CD(msgKey.getKeyValue("in_tShipOdr_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_PKG_UNIT_QTY")) {
						key.setin_tShipOdr_PKG_UNIT_QTY(msgKey.getKeyValue("in_tShipOdr_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_REMARKS")) {
						key.setin_tShipOdr_REMARKS(msgKey.getKeyValue("in_tShipOdr_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ALLCT_WH_CD")) {
						key.setin_tShipOdr_ALLCT_WH_CD(msgKey.getKeyValue("in_tShipOdr_ALLCT_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DEPO_TYP")) {
						key.setin_tShipOdr_DEPO_TYP(msgKey.getKeyValue("in_tShipOdr_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_ENTRY_TYP")) {
						key.setin_tShipOdr_ENTRY_TYP(msgKey.getKeyValue("in_tShipOdr_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_PRINT_FLG")) {
						key.setin_tShipOdr_PRINT_FLG(msgKey.getKeyValue("in_tShipOdr_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHP_CMPLT_FLG")) {
						key.setin_tShipOdr_SHP_CMPLT_FLG(msgKey.getKeyValue("in_tShipOdr_SHP_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DEL_FLG")) {
						key.setin_tShipOdr_DEL_FLG(msgKey.getKeyValue("in_tShipOdr_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSPORT_CD")) {
						key.setin_tShipOdr_TRANSPORT_CD(msgKey.getKeyValue("in_tShipOdr_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DIRECT_DLV_FLG")) {
						key.setin_tShipOdr_DIRECT_DLV_FLG(msgKey.getKeyValue("in_tShipOdr_DIRECT_DLV_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_CUST_CHRG_PSN_CD")) {
						key.setin_tShipOdr_CUST_CHRG_PSN_CD(msgKey.getKeyValue("in_tShipOdr_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_UNIT_CD")) {
						key.setin_tShipOdr_UNIT_CD(msgKey.getKeyValue("in_tShipOdr_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SCDL_DLV_DATE")) {
						key.setin_tShipOdr_SCDL_DLV_DATE(msgKey.getKeyValue("in_tShipOdr_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_TRANSFER_WH_CD")) {
						key.setin_tShipOdr_TRANSFER_WH_CD(msgKey.getKeyValue("in_tShipOdr_TRANSFER_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_DLV_KEY_NO")) {
						key.setin_tShipOdr_DLV_KEY_NO(msgKey.getKeyValue("in_tShipOdr_DLV_KEY_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES")) {
						key.setin_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES(new Double(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_AMOUNT_EXCH_RATES")));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_SHIP_ODR_NO")) {
						key.setin_tShipOdr_SHIP_ODR_NO(msgKey.getKeyValue("in_tShipOdr_SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipOdr_JOB_ODR_CD")) {
						key.setin_tShipOdr_JOB_ODR_CD(msgKey.getKeyValue("in_tShipOdr_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("del_tShipOdr_IN_SLIPCD")) {
						key.setdel_tShipOdr_IN_SLIPCD(msgKey.getKeyValue("del_tShipOdr_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_CD")) {
						key.setchkisinWhCd_WH_CD(msgKey.getKeyValue("chkisinWhCd_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisinWhCd_WH_TYP")) {
						key.setchkisinWhCd_WH_TYP(msgKey.getKeyValue("chkisinWhCd_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chkis_IN_WHCD")) {
						key.setchkis_IN_WHCD(msgKey.getKeyValue("chkis_IN_WHCD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_WH_CD")) {
						key.setchkisWhCd_WH_CD(msgKey.getKeyValue("chkisWhCd_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_WH_TYP")) {
						key.setchkisWhCd_WH_TYP(msgKey.getKeyValue("chkisWhCd_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_ITEM_CD")) {
						key.setchkisWhCd_ITEM_CD(msgKey.getKeyValue("chkisWhCd_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_PBL_SHIP_QTY")) {
						key.setchkisWhCd_PBL_SHIP_QTY(msgKey.getKeyValue("chkisWhCd_PBL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_IN_ITEMCD")) {
						key.setchkisWhCd_IN_ITEMCD(msgKey.getKeyValue("chkisWhCd_IN_ITEMCD"));
					}
					if(msgKeyType.containsKeyColumn("chkisWhCd_IN_WHCD")) {
						key.setchkisWhCd_IN_WHCD(msgKey.getKeyValue("chkisWhCd_IN_WHCD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_NO")) {
						key.settOdr_ODR_NO(msgKey.getKeyValue("tOdr_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_TYP")) {
						key.settOdr_ODR_TYP(msgKey.getKeyValue("tOdr_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_CTL_NO")) {
						key.settOdr_ODR_CTL_NO(msgKey.getKeyValue("tOdr_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUST_ODR_NO")) {
						key.settOdr_CUST_ODR_NO(msgKey.getKeyValue("tOdr_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_ORG_CD")) {
						key.settOdr_CUST_CHRG_ORG_CD(msgKey.getKeyValue("tOdr_CUST_CHRG_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUST_CHRG_PSN_CD")) {
						key.settOdr_CUST_CHRG_PSN_CD(msgKey.getKeyValue("tOdr_CUST_CHRG_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_ORG_CD")) {
						key.settOdr_ODR_ACPT_ORG_CD(msgKey.getKeyValue("tOdr_ODR_ACPT_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_PSN_CD")) {
						key.settOdr_ODR_ACPT_PSN_CD(msgKey.getKeyValue("tOdr_ODR_ACPT_PSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CURRNCY_CD")) {
						key.settOdr_CURRNCY_CD(msgKey.getKeyValue("tOdr_CURRNCY_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_EXCH_TYP")) {
						key.settOdr_EXCH_TYP(msgKey.getKeyValue("tOdr_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD")) {
						key.settOdr_DLV_LOC_CD(msgKey.getKeyValue("tOdr_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_CD_EIAJ")) {
						key.settOdr_DLV_LOC_CD_EIAJ(msgKey.getKeyValue("tOdr_DLV_LOC_CD_EIAJ"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME")) {
						key.settOdr_DLV_LOC_NAME(msgKey.getKeyValue("tOdr_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DLV_LOC_NAME_KANJI")) {
						key.settOdr_DLV_LOC_NAME_KANJI(msgKey.getKeyValue("tOdr_DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PRD_ODR_PLACE_CD")) {
						key.settOdr_PRD_ODR_PLACE_CD(msgKey.getKeyValue("tOdr_PRD_ODR_PLACE_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_UNIT_PRICE")) {
						key.settOdr_ODR_UNIT_PRICE(msgKey.getKeyValue("tOdr_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SPCL_PRICE_TYP")) {
						key.settOdr_SPCL_PRICE_TYP(msgKey.getKeyValue("tOdr_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PART_DLV_COUNT")) {
						key.settOdr_PART_DLV_COUNT(msgKey.getKeyValue("tOdr_PART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DEPO_TYP")) {
						key.settOdr_DEPO_TYP(msgKey.getKeyValue("tOdr_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_DESINATED_DLV_DATE")) {
						key.settOdr_DESINATED_DLV_DATE(msgKey.getKeyValue("tOdr_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_STD_DESINATED_RCV_DATE")) {
						key.settOdr_STD_DESINATED_RCV_DATE(msgKey.getKeyValue("tOdr_STD_DESINATED_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_QTY")) {
						key.settOdr_ODR_QTY(msgKey.getKeyValue("tOdr_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_REMAIN_UNCONFIRM_ODR_QTY")) {
						key.settOdr_REMAIN_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("tOdr_REMAIN_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CANCELED_UNCONFIRM_ODR_QTY")) {
						key.settOdr_CANCELED_UNCONFIRM_ODR_QTY(msgKey.getKeyValue("tOdr_CANCELED_UNCONFIRM_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD")) {
						key.settOdr_UNIT_CD(msgKey.getKeyValue("tOdr_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRM_ODR_BALANCE")) {
						key.settOdr_UNCONFIRM_ODR_BALANCE(msgKey.getKeyValue("tOdr_UNCONFIRM_ODR_BALANCE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT")) {
						key.settOdr_ODR_AMOUNT(msgKey.getKeyValue("tOdr_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_AMOUNT_EXCH_RATES")) {
						key.settOdr_ODR_AMOUNT_EXCH_RATES(msgKey.getKeyValue("tOdr_ODR_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TOTAL_SHIP_QTY")) {
						key.settOdr_TOTAL_SHIP_QTY(msgKey.getKeyValue("tOdr_TOTAL_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT")) {
						key.settOdr_SHIP_AMOUNT(msgKey.getKeyValue("tOdr_SHIP_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_AMOUNT_EXCH_RATES")) {
						key.settOdr_SHIP_AMOUNT_EXCH_RATES(msgKey.getKeyValue("tOdr_SHIP_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_PRICE")) {
						key.settOdr_RETURN_PRICE(msgKey.getKeyValue("tOdr_RETURN_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_QTY")) {
						key.settOdr_RETURN_QTY(msgKey.getKeyValue("tOdr_RETURN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT")) {
						key.settOdr_RETURN_AMOUNT(msgKey.getKeyValue("tOdr_RETURN_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_RETURN_AMOUNT_EXCH_RATES")) {
						key.settOdr_RETURN_AMOUNT_EXCH_RATES(msgKey.getKeyValue("tOdr_RETURN_AMOUNT_EXCH_RATES"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_FLG")) {
						key.settOdr_ODR_CMPLT_FLG(msgKey.getKeyValue("tOdr_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_CMPLT_DATE")) {
						key.settOdr_ODR_CMPLT_DATE(msgKey.getKeyValue("tOdr_ODR_CMPLT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_CD")) {
						key.settOdr_CUS_DLV_CD(msgKey.getKeyValue("tOdr_CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CUS_DLV_KEY_CD")) {
						key.settOdr_CUS_DLV_KEY_CD(msgKey.getKeyValue("tOdr_CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PART_NAME")) {
						key.settOdr_PART_NAME(msgKey.getKeyValue("tOdr_PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PKG_UNIT")) {
						key.settOdr_PKG_UNIT(msgKey.getKeyValue("tOdr_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SLIP_PRICE_PRINT_TYP")) {
						key.settOdr_SLIP_PRICE_PRINT_TYP(msgKey.getKeyValue("tOdr_SLIP_PRICE_PRINT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_INSPC_TYP")) {
						key.settOdr_INSPC_TYP(msgKey.getKeyValue("tOdr_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK")) {
						key.settOdr_CLIENT_REMARK(msgKey.getKeyValue("tOdr_CLIENT_REMARK"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CLIENT_REMARK_KANJI")) {
						key.settOdr_CLIENT_REMARK_KANJI(msgKey.getKeyValue("tOdr_CLIENT_REMARK_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_CLIENT_BARCODE_INF")) {
						key.settOdr_CLIENT_BARCODE_INF(msgKey.getKeyValue("tOdr_CLIENT_BARCODE_INF"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_CD")) {
						key.settOdr_TRANSPORT_CD(msgKey.getKeyValue("tOdr_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TRANSPORT_TYP")) {
						key.settOdr_TRANSPORT_TYP(msgKey.getKeyValue("tOdr_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TAX_APPLY_TYP")) {
						key.settOdr_TAX_APPLY_TYP(msgKey.getKeyValue("tOdr_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TAX_CD")) {
						key.settOdr_TAX_CD(msgKey.getKeyValue("tOdr_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_TAX_CALC_TYP")) {
						key.settOdr_TAX_CALC_TYP(msgKey.getKeyValue("tOdr_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_REMARKS")) {
						key.settOdr_REMARKS(msgKey.getKeyValue("tOdr_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ODR_ACPT_DATE")) {
						key.settOdr_ODR_ACPT_DATE(msgKey.getKeyValue("tOdr_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_REMAIN_QTY")) {
						key.settOdr_SHIP_PLAN_REMAIN_QTY(msgKey.getKeyValue("tOdr_SHIP_PLAN_REMAIN_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_PLAN_CMPLT_FLG")) {
						key.settOdr_SHIP_PLAN_CMPLT_FLG(msgKey.getKeyValue("tOdr_SHIP_PLAN_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG")) {
						key.settOdr_UNCONFIRMED_ODR_EFF_OVR_FLG(msgKey.getKeyValue("tOdr_UNCONFIRMED_ODR_EFF_OVR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PARTIAL_SHIP_INST_FLG")) {
						key.settOdr_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("tOdr_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_IF_CTL_NO")) {
						key.settOdr_IF_CTL_NO(msgKey.getKeyValue("tOdr_IF_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_ENTRY_TYP")) {
						key.settOdr_ENTRY_TYP(msgKey.getKeyValue("tOdr_ENTRY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_BUYER_NAME")) {
						key.settOdr_BUYER_NAME(msgKey.getKeyValue("tOdr_BUYER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_PUCH_ODR_QTY_TOTAL")) {
						key.settOdr_PUCH_ODR_QTY_TOTAL(msgKey.getKeyValue("tOdr_PUCH_ODR_QTY_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_UNIT_CD_ORG")) {
						key.settOdr_UNIT_CD_ORG(msgKey.getKeyValue("tOdr_UNIT_CD_ORG"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_SHIP_CNT")) {
						key.settOdr_SHIP_CNT(msgKey.getKeyValue("tOdr_SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("tOdr_IN_ODRNO")) {
						key.settOdr_IN_ODRNO(msgKey.getKeyValue("tOdr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_PART_DLV_COUNT")) {
						key.setuptOdr_PART_DLV_COUNT(msgKey.getKeyValue("uptOdr_PART_DLV_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_IN_ODRNO")) {
						key.setuptOdr_IN_ODRNO(msgKey.getKeyValue("uptOdr_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ODR_CTL_NO")) {
						key.settOdrCtl_ODR_CTL_NO(msgKey.getKeyValue("tOdrCtl_ODR_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_CD")) {
						key.settOdrCtl_CUST_CD(msgKey.getKeyValue("tOdrCtl_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_CD")) {
						key.settOdrCtl_CUST_ITEM_CD(msgKey.getKeyValue("tOdrCtl_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_CUST_ITEM_NAME")) {
						key.settOdrCtl_CUST_ITEM_NAME(msgKey.getKeyValue("tOdrCtl_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_CD")) {
						key.settOdrCtl_ITEM_CD(msgKey.getKeyValue("tOdrCtl_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_ITEM_NAME")) {
						key.settOdrCtl_ITEM_NAME(msgKey.getKeyValue("tOdrCtl_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("tOdrCtl_IN_ODRCTLNO")) {
						key.settOdrCtl_IN_ODRCTLNO(msgKey.getKeyValue("tOdrCtl_IN_ODRCTLNO"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ITEM_CD")) {
						key.setmItem_ITEM_CD(msgKey.getKeyValue("mItem_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ITEM_NAME")) {
						key.setmItem_ITEM_NAME(msgKey.getKeyValue("mItem_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PRODUCT_TYP")) {
						key.setmItem_PRODUCT_TYP(msgKey.getKeyValue("mItem_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MRP_ODR_TYP")) {
						key.setmItem_MRP_ODR_TYP(msgKey.getKeyValue("mItem_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_DRAW_CD")) {
						key.setmItem_DRAW_CD(msgKey.getKeyValue("mItem_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SPEC")) {
						key.setmItem_SPEC(msgKey.getKeyValue("mItem_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("mItem_HIGH_LEVEL_NO")) {
						key.setmItem_HIGH_LEVEL_NO(msgKey.getKeyValue("mItem_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("mItem_OUTSIDE_TYP")) {
						key.setmItem_OUTSIDE_TYP(msgKey.getKeyValue("mItem_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT_FLG")) {
						key.setmItem_STOCK_UNIT_FLG(msgKey.getKeyValue("mItem_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mItem_STOCK_UNIT")) {
						key.setmItem_STOCK_UNIT(msgKey.getKeyValue("mItem_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT")) {
						key.setmItem_PKG_UNIT(msgKey.getKeyValue("mItem_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PKG_UNIT_QTY")) {
						key.setmItem_PKG_UNIT_QTY(msgKey.getKeyValue("mItem_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_UNIT_QTY_TYP")) {
						key.setmItem_UNIT_QTY_TYP(msgKey.getKeyValue("mItem_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ODR_LT")) {
						key.setmItem_ODR_LT(msgKey.getKeyValue("mItem_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_FIXED_LT")) {
						key.setmItem_FIXED_LT(msgKey.getKeyValue("mItem_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PROP_LT")) {
						key.setmItem_PROP_LT(msgKey.getKeyValue("mItem_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SAFETY_LT")) {
						key.setmItem_SAFETY_LT(msgKey.getKeyValue("mItem_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ISSUE_LT")) {
						key.setmItem_ISSUE_LT(msgKey.getKeyValue("mItem_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_PROP_LOT_SIZE")) {
						key.setmItem_PROP_LOT_SIZE(msgKey.getKeyValue("mItem_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ITEM_SPOIL")) {
						key.setmItem_ITEM_SPOIL(msgKey.getKeyValue("mItem_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SAFETY_STOCK")) {
						key.setmItem_SAFETY_STOCK(msgKey.getKeyValue("mItem_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("mItem_LOT_SIZING_TYP")) {
						key.setmItem_LOT_SIZING_TYP(msgKey.getKeyValue("mItem_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MAX_PERIOD")) {
						key.setmItem_MAX_PERIOD(msgKey.getKeyValue("mItem_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MAX_ODR_QTY")) {
						key.setmItem_MAX_ODR_QTY(msgKey.getKeyValue("mItem_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ODR_POINT")) {
						key.setmItem_ODR_POINT(msgKey.getKeyValue("mItem_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_FIXED_ODR_QTY")) {
						key.setmItem_FIXED_ODR_QTY(msgKey.getKeyValue("mItem_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MIN_ODR_QTY")) {
						key.setmItem_MIN_ODR_QTY(msgKey.getKeyValue("mItem_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MUL_ODR_QTY")) {
						key.setmItem_MUL_ODR_QTY(msgKey.getKeyValue("mItem_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ISSUE_TYP")) {
						key.setmItem_ISSUE_TYP(msgKey.getKeyValue("mItem_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_MPS_FLG")) {
						key.setmItem_MPS_FLG(msgKey.getKeyValue("mItem_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ACPT_INSPC_TYP")) {
						key.setmItem_ACPT_INSPC_TYP(msgKey.getKeyValue("mItem_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_CLASIFICATION_CD")) {
						key.setmItem_CLASIFICATION_CD(msgKey.getKeyValue("mItem_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_UNIT_WEIGHT")) {
						key.setmItem_UNIT_WEIGHT(msgKey.getKeyValue("mItem_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("mItem_ABC_TYP")) {
						key.setmItem_ABC_TYP(msgKey.getKeyValue("mItem_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_OPR_RSLT_TYP")) {
						key.setmItem_OPR_RSLT_TYP(msgKey.getKeyValue("mItem_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_SPL_ITEM_TYP")) {
						key.setmItem_SPL_ITEM_TYP(msgKey.getKeyValue("mItem_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mItem_TAX_CD")) {
						key.setmItem_TAX_CD(msgKey.getKeyValue("mItem_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("mItem_IN_ITEMCD")) {
						key.setmItem_IN_ITEMCD(msgKey.getKeyValue("mItem_IN_ITEMCD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_COMPANY_CD")) {
						key.setmCustBase_COMPANY_CD(msgKey.getKeyValue("mCustBase_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_CUST_CD")) {
						key.setmCustBase_CUST_CD(msgKey.getKeyValue("mCustBase_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_CD")) {
						key.setmCustBase_DLV_LOC_CD(msgKey.getKeyValue("mCustBase_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_NAME")) {
						key.setmCustBase_DLV_LOC_NAME(msgKey.getKeyValue("mCustBase_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_KNAME")) {
						key.setmCustBase_DLV_LOC_KNAME(msgKey.getKeyValue("mCustBase_DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_LOC_ENAME")) {
						key.setmCustBase_DLV_LOC_ENAME(msgKey.getKeyValue("mCustBase_DLV_LOC_ENAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ZIP_CD")) {
						key.setmCustBase_ZIP_CD(msgKey.getKeyValue("mCustBase_ZIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_1")) {
						key.setmCustBase_ADDRESS_1(msgKey.getKeyValue("mCustBase_ADDRESS_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_2")) {
						key.setmCustBase_ADDRESS_2(msgKey.getKeyValue("mCustBase_ADDRESS_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_1")) {
						key.setmCustBase_ADDRESS_K_1(msgKey.getKeyValue("mCustBase_ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_ADDRESS_K_2")) {
						key.setmCustBase_ADDRESS_K_2(msgKey.getKeyValue("mCustBase_ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TEL")) {
						key.setmCustBase_TEL(msgKey.getKeyValue("mCustBase_TEL"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_FAX")) {
						key.setmCustBase_FAX(msgKey.getKeyValue("mCustBase_FAX"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_SHIP_WH_CD")) {
						key.setmCustBase_SHIP_WH_CD(msgKey.getKeyValue("mCustBase_SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_CD")) {
						key.setmCustBase_TRANSPORT_CD(msgKey.getKeyValue("mCustBase_TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_NAME")) {
						key.setmCustBase_TRANSPORT_NAME(msgKey.getKeyValue("mCustBase_TRANSPORT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_LT")) {
						key.setmCustBase_TRANSPORT_LT(msgKey.getKeyValue("mCustBase_TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_CAL_NO")) {
						key.setmCustBase_CAL_NO(msgKey.getKeyValue("mCustBase_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_TRANSPORT_TYP")) {
						key.setmCustBase_TRANSPORT_TYP(msgKey.getKeyValue("mCustBase_TRANSPORT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_START_TIME")) {
						key.setmCustBase_DLV_START_TIME(msgKey.getKeyValue("mCustBase_DLV_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DLV_END_TIME")) {
						key.setmCustBase_DLV_END_TIME(msgKey.getKeyValue("mCustBase_DLV_END_TIME"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP1")) {
						key.setmCustBase_AREA_CLASS_TYP1(msgKey.getKeyValue("mCustBase_AREA_CLASS_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_1")) {
						key.setmCustBase_AREA_CLASS_1(msgKey.getKeyValue("mCustBase_AREA_CLASS_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP2")) {
						key.setmCustBase_AREA_CLASS_TYP2(msgKey.getKeyValue("mCustBase_AREA_CLASS_TYP2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_2")) {
						key.setmCustBase_AREA_CLASS_2(msgKey.getKeyValue("mCustBase_AREA_CLASS_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_TYP3")) {
						key.setmCustBase_AREA_CLASS_TYP3(msgKey.getKeyValue("mCustBase_AREA_CLASS_TYP3"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_AREA_CLASS_3")) {
						key.setmCustBase_AREA_CLASS_3(msgKey.getKeyValue("mCustBase_AREA_CLASS_3"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_1")) {
						key.setmCustBase_REMARKS_1(msgKey.getKeyValue("mCustBase_REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_2")) {
						key.setmCustBase_REMARKS_2(msgKey.getKeyValue("mCustBase_REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_REMARKS_3")) {
						key.setmCustBase_REMARKS_3(msgKey.getKeyValue("mCustBase_REMARKS_3"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_DEPO_WH_CD")) {
						key.setmCustBase_DEPO_WH_CD(msgKey.getKeyValue("mCustBase_DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_IN_COMPANYCD")) {
						key.setmCustBase_IN_COMPANYCD(msgKey.getKeyValue("mCustBase_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_IN_CUSTCD")) {
						key.setmCustBase_IN_CUSTCD(msgKey.getKeyValue("mCustBase_IN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("mCustBase_IN_DLVLOCCD")) {
						key.setmCustBase_IN_DLVLOCCD(msgKey.getKeyValue("mCustBase_IN_DLVLOCCD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_COMPANY_CD")) {
						key.setmCust_COMPANY_CD(msgKey.getKeyValue("mCust_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_CD")) {
						key.setmCust_CUST_CD(msgKey.getKeyValue("mCust_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_NAME")) {
						key.setmCust_CUST_NAME(msgKey.getKeyValue("mCust_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_ANAME")) {
						key.setmCust_CUST_ANAME(msgKey.getKeyValue("mCust_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUST_KNAME")) {
						key.setmCust_CUST_KNAME(msgKey.getKeyValue("mCust_CUST_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("mCust_OWN_ORG_CD")) {
						key.setmCust_OWN_ORG_CD(msgKey.getKeyValue("mCust_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_OWN_PERSON_CD")) {
						key.setmCust_OWN_PERSON_CD(msgKey.getKeyValue("mCust_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_CUR_CD")) {
						key.setmCust_CUR_CD(msgKey.getKeyValue("mCust_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_EXCH_TYP")) {
						key.setmCust_EXCH_TYP(msgKey.getKeyValue("mCust_EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_TAX_APPLY_TYP")) {
						key.setmCust_TAX_APPLY_TYP(msgKey.getKeyValue("mCust_TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_TAX_CD")) {
						key.setmCust_TAX_CD(msgKey.getKeyValue("mCust_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_TAX_CALC_TYP")) {
						key.setmCust_TAX_CALC_TYP(msgKey.getKeyValue("mCust_TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_PRICE_ROUND_TYP")) {
						key.setmCust_PRICE_ROUND_TYP(msgKey.getKeyValue("mCust_PRICE_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_DETAIL_ROUND_TYP")) {
						key.setmCust_DETAIL_ROUND_TYP(msgKey.getKeyValue("mCust_DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_PRIOD")) {
						key.setmCust_UNCONFIRM_ODR_EFF_PRIOD(msgKey.getKeyValue("mCust_UNCONFIRM_ODR_EFF_PRIOD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_UNCONFIRM_ODR_EFF_TERM_FLG")) {
						key.setmCust_UNCONFIRM_ODR_EFF_TERM_FLG(msgKey.getKeyValue("mCust_UNCONFIRM_ODR_EFF_TERM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mCust_EDI_CUST_VEND_CD")) {
						key.setmCust_EDI_CUST_VEND_CD(msgKey.getKeyValue("mCust_EDI_CUST_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_PARTIAL_SHIP_INST_FLG")) {
						key.setmCust_PARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("mCust_PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("mCust_DEPO_TYP")) {
						key.setmCust_DEPO_TYP(msgKey.getKeyValue("mCust_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_INSPC_ACPT_TYP")) {
						key.setmCust_INSPC_ACPT_TYP(msgKey.getKeyValue("mCust_INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("mCust_IN_COMPANYCD")) {
						key.setmCust_IN_COMPANYCD(msgKey.getKeyValue("mCust_IN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("mCust_IN_CUSTCD")) {
						key.setmCust_IN_CUSTCD(msgKey.getKeyValue("mCust_IN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("strYotaku_WH_CD")) {
						key.setstrYotaku_WH_CD(msgKey.getKeyValue("strYotaku_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("strYotaku_IN_WH_TYP")) {
						key.setstrYotaku_IN_WH_TYP(msgKey.getKeyValue("strYotaku_IN_WH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SLIP_CD")) {
						key.setin_tShipSlip_SLIP_CD(msgKey.getKeyValue("in_tShipSlip_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_ITEM_CD")) {
						key.setin_tShipSlip_ITEM_CD(msgKey.getKeyValue("in_tShipSlip_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ITEM_CD")) {
						key.setin_tShipSlip_CUST_ITEM_CD(msgKey.getKeyValue("in_tShipSlip_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_PART_NAME")) {
						key.setin_tShipSlip_PART_NAME(msgKey.getKeyValue("in_tShipSlip_PART_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_ODR_NO")) {
						key.setin_tShipSlip_CUST_ODR_NO(msgKey.getKeyValue("in_tShipSlip_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_CD")) {
						key.setin_tShipSlip_CUST_CD(msgKey.getKeyValue("in_tShipSlip_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUST_NAME")) {
						key.setin_tShipSlip_CUST_NAME(msgKey.getKeyValue("in_tShipSlip_CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_CD")) {
						key.setin_tShipSlip_DLV_LOC_CD(msgKey.getKeyValue("in_tShipSlip_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_LOC_NAME_KANJI")) {
						key.setin_tShipSlip_DLV_LOC_NAME_KANJI(msgKey.getKeyValue("in_tShipSlip_DLV_LOC_NAME_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CUS_DLV_KEY_CD")) {
						key.setin_tShipSlip_CUS_DLV_KEY_CD(msgKey.getKeyValue("in_tShipSlip_CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_SHIP_DATE")) {
						key.setin_tShipSlip_DESINATED_SHIP_DATE(msgKey.getKeyValue("in_tShipSlip_DESINATED_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DESINATED_DLV_DATE")) {
						key.setin_tShipSlip_DESINATED_DLV_DATE(msgKey.getKeyValue("in_tShipSlip_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SCDL_DLV_DATE")) {
						key.setin_tShipSlip_SCDL_DLV_DATE(msgKey.getKeyValue("in_tShipSlip_SCDL_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_QTY")) {
						key.setin_tShipSlip_SHIP_ODR_QTY(msgKey.getKeyValue("in_tShipSlip_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_CD")) {
						key.setin_tShipSlip_UNIT_CD(msgKey.getKeyValue("in_tShipSlip_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_UNIT_PRICE")) {
						key.setin_tShipSlip_UNIT_PRICE(msgKey.getKeyValue("in_tShipSlip_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT")) {
						key.setin_tShipSlip_SHIP_ODR_AMOUNT(msgKey.getKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT")) {
						key.setin_tShipSlip_TAX_AMOUNT(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_INSPC_TYP")) {
						key.setin_tShipSlip_INSPC_TYP(msgKey.getKeyValue("in_tShipSlip_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_REMARK_KANJI")) {
						key.setin_tShipSlip_CLIENT_REMARK_KANJI(msgKey.getKeyValue("in_tShipSlip_CLIENT_REMARK_KANJI"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_CLIENT_BARCODE_INF")) {
						key.setin_tShipSlip_CLIENT_BARCODE_INF(msgKey.getKeyValue("in_tShipSlip_CLIENT_BARCODE_INF"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_PRINT_FLG")) {
						key.setin_tShipSlip_PRINT_FLG(msgKey.getKeyValue("in_tShipSlip_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DEL_FLG")) {
						key.setin_tShipSlip_DEL_FLG(msgKey.getKeyValue("in_tShipSlip_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_BUYER_NAME")) {
						key.setin_tShipSlip_BUYER_NAME(msgKey.getKeyValue("in_tShipSlip_BUYER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_PUCH_ODR_QTY_TOTAL")) {
						key.setin_tShipSlip_PUCH_ODR_QTY_TOTAL(msgKey.getKeyValue("in_tShipSlip_PUCH_ODR_QTY_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_DLV_ODR_QTY")) {
						key.setin_tShipSlip_DLV_ODR_QTY(msgKey.getKeyValue("in_tShipSlip_DLV_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_SHIP_ODR_AMOUNT_TAX")) {
						key.setin_tShipSlip_SHIP_ODR_AMOUNT_TAX(msgKey.getKeyValue("in_tShipSlip_SHIP_ODR_AMOUNT_TAX"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT")) {
						key.setin_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_EXTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT")) {
						key.setin_tShipSlip_INTERNAL_TAX_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_INTERNAL_TAX_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAXFREE_SALES_AMOUNT")) {
						key.setin_tShipSlip_TAXFREE_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_TAXFREE_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT")) {
						key.setin_tShipSlip_TAX_CREDIT_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_TAX_CREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_EXTERNAL_TAX_AMOUNT")) {
						key.setin_tShipSlip_EXTERNAL_TAX_AMOUNT(msgKey.getKeyValue("in_tShipSlip_EXTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_INTERNAL_TAX_AMOUNT")) {
						key.setin_tShipSlip_INTERNAL_TAX_AMOUNT(msgKey.getKeyValue("in_tShipSlip_INTERNAL_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_1")) {
						key.setin_tShipSlip_TAX_AMOUNT_1(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_2")) {
						key.setin_tShipSlip_TAX_AMOUNT_2(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_TAX_AMOUNT_3")) {
						key.setin_tShipSlip_TAX_AMOUNT_3(msgKey.getKeyValue("in_tShipSlip_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT")) {
						key.setin_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT(msgKey.getKeyValue("in_tShipSlip_OWN_CUR_TAXCREDIT_SALES_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("del_tShipSlip_IN_SLIPCD")) {
						key.setdel_tShipSlip_IN_SLIPCD(msgKey.getKeyValue("del_tShipSlip_IN_SLIPCD"));
					}
					if(msgKeyType.containsKeyColumn("uptOdr_SHIP_CNT")) {
						key.setuptOdr_SHIP_CNT(msgKey.getKeyValue("uptOdr_SHIP_CNT"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_SEQ_NO")) {
						key.settUnShipList_UN_SHIP_SEQ_NO(msgKey.getKeyValue("tUnShipList_UN_SHIP_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_CUST_CD")) {
						key.settUnShipList_CUST_CD(msgKey.getKeyValue("tUnShipList_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_ACPT_ODR_CD")) {
						key.settUnShipList_ACPT_ODR_CD(msgKey.getKeyValue("tUnShipList_ACPT_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_PART_DLV_SEQ_NO")) {
						key.settUnShipList_PART_DLV_SEQ_NO(msgKey.getKeyValue("tUnShipList_PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_ITEM_CD")) {
						key.settUnShipList_ITEM_CD(msgKey.getKeyValue("tUnShipList_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_QTY")) {
						key.settUnShipList_UN_SHIP_QTY(msgKey.getKeyValue("tUnShipList_UN_SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_UN_SHIP_RSN")) {
						key.settUnShipList_UN_SHIP_RSN(msgKey.getKeyValue("tUnShipList_UN_SHIP_RSN"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_WH_CD")) {
						key.settUnShipList_WH_CD(msgKey.getKeyValue("tUnShipList_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_PRINT_FLG")) {
						key.settUnShipList_PRINT_FLG(msgKey.getKeyValue("tUnShipList_PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tUnShipList_DEL_FLG")) {
						key.settUnShipList_DEL_FLG(msgKey.getKeyValue("tUnShipList_DEL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_REST_SHIP_ODR_QTY")) {
						key.settori_tAnsDlvDate_REST_SHIP_ODR_QTY(msgKey.getKeyValue("tori_tAnsDlvDate_REST_SHIP_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG")) {
						key.settori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG(msgKey.getKeyValue("tori_tAnsDlvDate_SHIP_ODR_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_ODRNO")) {
						key.settori_tAnsDlvDate_IN_ODRNO(msgKey.getKeyValue("tori_tAnsDlvDate_IN_ODRNO"));
					}
					if(msgKeyType.containsKeyColumn("tori_tAnsDlvDate_IN_PARTDLVSEQNO")) {
						key.settori_tAnsDlvDate_IN_PARTDLVSEQNO(msgKey.getKeyValue("tori_tAnsDlvDate_IN_PARTDLVSEQNO"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("strTAX_CD")) {
						key.setstrTAX_CD(msgKey.getKeyValue("strTAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_MODIFY_COUNT")) {
						key.setSHIP_MODIFY_COUNT(msgKey.getKeyValue("SHIP_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("SEL_MODIFY_COUNT")) {
						key.setSEL_MODIFY_COUNT(msgKey.getKeyValue("SEL_MODIFY_COUNT"));
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
