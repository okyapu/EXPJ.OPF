/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KU0080/src/com/nec/jp/orteus/metamorBase/KU0080/KU0080010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KU0080;

import com.nec.jp.orteus.metamorBase.KU0080.*;
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
import com.nec.jp.orteus.metamorBase.common06.ExchAmount.ExchAmount;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KU0080010Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.2 $ $Date: 2015/09/15 07:18:17 $
 *
 */
//}}user_implement_code_header

public class KU0080010Control
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
	public KU0080010Struct getListvalue(int x) { return (KU0080010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KU0080010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KU0080010Struct createStruct() { return new KU0080010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KU0080010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
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
	/** TAX KBN */
	private String TAX_KBN = "";
	/** 税率 */
	private String TAX_RATE = "0";
	
	/** 画面遷移キー(出荷インボイス管理番号) */
	private String _ShipInvoiceCtlNo;
	/** 画面遷移キー(出荷指示番号) */
	private String[] _ShipOdrNo;
	/** 画面遷移キー(flag) */
	private String[] _SelectMark;
	/**
	 * 画面遷移キー(出荷インボイス管理番号)取得
	 * @return 出荷インボイス管理番号
	 */
	public String getShipInvoiceCtlNo() {
		return _ShipInvoiceCtlNo;
	}
	/**
	 * 画面遷移キー(出荷指示番号)取得
	 * @return 出荷指示番号
	 */
	public String[] getShipOdrNo() {
		return _ShipOdrNo;
	}
	/**
	 * 画面遷移キー(flag)取得
	 * @return flag
	 */
	public String[] getSelectMark() {
		return _SelectMark;
	}
	/**
	 * 画面遷移キー(出荷指示番号)設定
	 * @param cd 出荷インボイス管理番号
	 */
	public void setShipInvoiceCtlNo(String no) {
		_ShipInvoiceCtlNo = no;
	}
	/**
	 * 画面遷移キー(出荷指示番号)設定
	 * @param cd 出荷指示番号
	 */
	public void setShipOdrNo(String[] no) {
		_ShipOdrNo = no;
	}
	/**
	 * 画面遷移キー(出荷指示番号)設定
	 * @param cd 出荷指示番号
	 */
	public void setSelectMark(String[] no) {
		_SelectMark = no;
	}
	/**
	 * nullまたは空白文字ならば0、それ以外はそのままにします。
	 *
	 * @param String str
	 * @return String 変換後文字列
	 */
	private String chkNulltoZero(String str){
		if (str == null || str.equals("")) {
			return "0";
		}
		return str;
	}
	/**
	 * 新消費税コード開始日と比較
	 *
	 */
	private boolean isNewTax(KU0080010Struct wst, String strStartDate) throws ParseException
	{
		boolean rv = false;

		//新消費税コード開始日
		GregorianCalendar date1 = new GregorianCalendar();
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));

		GregorianCalendar date2 = new GregorianCalendar();
		//[得意先].“検収区分”　＝ 1（出荷基準）の場合、出荷指定日
		if("1".equals(wst.getINSPC_ACPT_TYP())){
			date2.setTime(Converter.strToDate(wst.getSCDL_SHIP_DATE(), "yyyy/MM/dd"));
		}else{
			//[得意先].“検収区分”　＝ 1以外の場合（受領売上基準）、納品予定日
			date2.setTime(Converter.strToDate(wst.getSCDL_DLV_DATE(), "yyyy/MM/dd"));
		}

		//新消費税コード開始日 <= 出荷指定日の場合、新税率
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}

	/**
	 * 消費税金額計算
	 * @param 	String strCustCd 得意先コード
	 *          String strItemCd 品番
	 *          String strOdrNo 受注番号
	 *          String strAmount 出荷指示金額
	 *
	 * @return String rv 消費税金額
	 *
	 * */
	private String[] doCalcuTaxAmount(KU0080010Struct wst, String strCompanyCd, String strCustCd, String strOdrNo, String strAmount) throws ParseException, FoundationException, SQLException{

		String rv[] = new String[3];

		//消費税マスタから取得
		wst.setstrTaxIN_ODR_NO(strOdrNo);
		wst.setstrTaxIN_CUSTCD(strCustCd);
		wst.setstrTaxIN_COMPANYCD(strCompanyCd);

		String strTaxKbn = "";	//税込区分
		String strStartDate ="";	//新消費税コード開始日
	   	String strTaxRate[] = new String[3];	//税率
		String strRoundTyp = "";
		int decimalFig = 0;  //取引通貨の小数点以下桁数

		List listDecimalFig = entity.mgetDECIMAL_FIG.read(conn,wst);
		if(listDecimalFig == null || listDecimalFig.size() != 1){
			//情報が無い/複数件
			wst.setstrTaxIN_DECIMAL_FIG("0");
			decimalFig = 0;
		}else{
			wst.setstrTaxIN_DECIMAL_FIG(((KU0080010Struct)listDecimalFig.get(0)).getstrTaxIN_DECIMAL_FIG());
            decimalFig = Integer.parseInt(wst.getstrTaxIN_DECIMAL_FIG());
		}
		
		List listTax = entity.mgetTax.read(conn, wst);

		if(listTax == null || listTax.size() != 1){
		}else{
			this.TAX_KBN = ((KU0080010Struct)listTax.get(0)).getstrTaxTAX_KBN();
			strStartDate = ((KU0080010Struct)listTax.get(0)).getstrTaxSTART_DATE();
			strRoundTyp = ((KU0080010Struct)listTax.get(0)).getstrTaxROUND_TYP();

			//[得意先].“検収区分”を取得
			List listCust = entity.mselectMCust.read(conn,wst);
			if(!listCust.isEmpty()){
				wst.setINSPC_ACPT_TYP(((KU0080010Struct)listCust.get(0)).getINSPC_ACPT_TYP());
			}
			
			//税率設定(新消費税開始日<=出荷指定日の場合、新税率)
			if(this.isNewTax(wst, strStartDate)){
				strTaxRate[0] = this.chkNulltoZero(((KU0080010Struct)listTax.get(0)).getstrTaxNEW_TAX_1());
				strTaxRate[1] = this.chkNulltoZero(((KU0080010Struct)listTax.get(0)).getstrTaxNEW_TAX_2());
				strTaxRate[2] = this.chkNulltoZero(((KU0080010Struct)listTax.get(0)).getstrTaxNEW_TAX_3());
			} else {
				strTaxRate[0] = this.chkNulltoZero(((KU0080010Struct)listTax.get(0)).getstrTaxOLD_TAX_1());
				strTaxRate[1] = this.chkNulltoZero(((KU0080010Struct)listTax.get(0)).getstrTaxOLD_TAX_2());
				strTaxRate[2] = this.chkNulltoZero(((KU0080010Struct)listTax.get(0)).getstrTaxOLD_TAX_3());
			}
			//端数区分でROUNDを行う
			ExchAmount ex = new ExchAmount(conn);

			//税率
			if ("0".equals(this.TAX_KBN)){
			    TAX_RATE = "0";
			}else {
				TAX_RATE = Calculate.add(strTaxRate[0],strTaxRate[1]);
				TAX_RATE = Calculate.add(TAX_RATE,strTaxRate[2]);
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
	// TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			struct.init();
			struct.setjump_flag("0");          //画面遷移フラグを初期化
			// リストクリア
			if(list != null){
				list.clear();
			}
			setReadStatus(INITIAL );
			list = entity.mSelect.read(conn, struct);    //ヘッダ
			
			if(list == null || getListsize() == 0){
				//データが存在しない
				if ( isScreenMove() == true ) {
					ExpjMessage emsg = new ExpjMessage( "KQ10316" );
					msgStruct.addError( emsg ); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				} else {
					ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
					msgStruct.addError( emsg ); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				}
				setReadStatus(NOT_FOUND);
				return;
			}
			KU0080010Struct wStruct = (KU0080010Struct) list.get(0);
			struct.setSHIP_INVOICE_NO( wStruct.getSHIP_INVOICE_NO() );
			struct.setDEPARTURE_PLACE( wStruct.getDEPARTURE_PLACE() );
			struct.setDEPARTURE_DATE( wStruct.getDEPARTURE_DATE() );
			struct.setARRIVAL_PLACE( wStruct.getARRIVAL_PLACE() );
			struct.setARRIVAL_DATE( wStruct.getARRIVAL_DATE() );
			struct.setTRANSPORT_METHOD( wStruct.getTRANSPORT_METHOD());
			struct.setSHIP_NO( wStruct.getSHIP_NO() );
			struct.setREMARKS_1( wStruct.getREMARKS_1() );
			struct.setREMARKS_2( wStruct.getREMARKS_2() );
			
			struct.setCUST_CD( wStruct.getCUST_CD() );
			struct.setINVOICE_AMOUNT( wStruct.getINVOICE_AMOUNT() );
			struct.setDLV_LOC_CD( wStruct.getDLV_LOC_CD() );
			struct.setINVOICE_TAX_AMOUNT( wStruct.getINVOICE_TAX_AMOUNT() );
			struct.setSCDL_SHIP_DATE( wStruct.getSCDL_SHIP_DATE() );
			struct.setPRINT_FLG( wStruct.getPRINT_FLG() );
			struct.setMODIFY_COUNT( wStruct.getMODIFY_COUNT() );
			
			list.clear();
			list = entity.mSelectDetail.read(conn, struct);  //明細
			KU0080010Struct TempStruct;
            for (int i = 0; i < this.list.size(); i++) {
                 TempStruct = (KU0080010Struct)list.get(i);
                 TempStruct.setUNIT_COST_TYP(this.multcombo("UNIT_COST_TYP",TempStruct.getUNIT_COST_TYP()));
            }
		    setReadStatus(NORMAL);
			
		} catch(Exception e){
			e.printStackTrace();
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
	    	msgStruct.addError(emsg);
	    	sysLog.warning(emsg, sysUSER_CD);
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//MODIFY_COUNTチェック
			List modifyCountList = entity.mselectMODIFY_COUNT.read(conn,struct);
			if (modifyCountList == null || modifyCountList.size() == 0) {
				//データが存在しない
				ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
				msgStruct.addError( emsg ); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
			KU0080010Struct modifyCountStruct = (KU0080010Struct)modifyCountList.get(0);
			if (struct.getMODIFY_COUNT().equals(modifyCountStruct.getMODIFY_COUNT()) == false) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01105" );
				msgStruct.addError( emsg ); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
			this.conn.beginTransWeb();
			//ヘッダの更新
			int nRet = entity.mupdateM_SHIP_INVOICE_HEAD.update(conn, struct);
            conn.commit();

			//画面の再検索
			controlSelect();
		} catch(SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
		}finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
			}
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * 帳票取消ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancel() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlCancel");
			//{{user_implement_dev:<controlCancel>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//MODIFY_COUNTチェック
			List modifyCountList = entity.mselectMODIFY_COUNT.read(conn,struct);
			if (modifyCountList == null || modifyCountList.size() == 0) {
				//データが存在しない
				ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
				msgStruct.addError( emsg ); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
			KU0080010Struct modifyCountStruct = (KU0080010Struct)modifyCountList.get(0);
			if (struct.getMODIFY_COUNT().equals(modifyCountStruct.getMODIFY_COUNT()) == false) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01105" );
				msgStruct.addError( emsg ); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
			this.conn.beginTransWeb();
			//フラグの更新
			struct.setPRINT_DATE(null);
			int nRet = entity.mupdateFlag.update(conn, struct);
            conn.commit();

			//画面の再検索
			controlSelect();
		} catch(SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			msgStruct.addError(emsg);
	    	sysLog.warning(emsg, sysUSER_CD);
		}finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				msgStruct.addError(emsg);
		    	sysLog.warning(emsg, sysUSER_CD);
			}
		}
                //}}user_implement_dev:<controlCancel>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlCancel");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		this.screenMoveFlg = false;
		controlRELOAD();
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlInsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");
			//{{user_implement_dev:<controlInsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//出荷指示番号チェック
			for(int k=0;k<list.size();k++){
                KU0080010Struct st = (KU0080010Struct)list.get(k);
			    List checkList = entity.mcheckshipOdrNo.read(conn, st);
			    if (checkList.size() > 0) {
			    	ExpjMessage emsg = new ExpjMessage( "KU00113" );
			    	msgStruct.addError( emsg ); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
					setReadStatus(ERROR);
				    return;
			    }
			}
			
			List noList = entity.mgetNo.read(conn, struct);    //出荷インボイス管理番号採番
			struct.setIN_SHIP_INVOICE_CTL_NO(((KU0080010Struct)noList.get(0)).getIN_SHIP_INVOICE_CTL_NO());
			this.conn.beginTransWeb();
			//ヘッダの登録
			int nRet = entity.minsert.create(conn, struct);
            //明細の登録
			
			// =======================================
		    // 画面表示行数分繰り返す
		    // =======================================
			// i:行数
			for(int i=0;i<list.size();i++){
                KU0080010Struct st = (KU0080010Struct)list.get(i);
				// =======================================
				// リクエストをStructに格納
				// =======================================
                st.setsUser_ID(struct.getsUser_ID());
                st.setIN_SHIP_INVOICE_CTL_NO(struct.getIN_SHIP_INVOICE_CTL_NO());
                nRet = entity.minsertDetail.create(conn, st);
			}               
			conn.commit();

			//画面の再検索
			controlSelect();
		} catch(SQLException e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			msgStruct.addError(emsg);
	    	sysLog.warning(emsg, sysUSER_CD);
		}finally {
			try {
				if (conn != null) {
					conn.rollback();
				}
			} catch(Exception e) {
				setReadStatus(ERROR);
				ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
				msgStruct.addError(emsg);
		    	sysLog.warning(emsg, sysUSER_CD);
			}
		}
                //}}user_implement_dev:<controlInsert>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlInsert");

		return;
	}

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlGoPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlGoPrint");
			//{{user_implement_dev:<controlGoPrint>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlGoPrint>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlGoPrint");

		return;
	}

	/**
	 * 選択削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");
			//{{user_implement_dev:<controlDelete>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int _tempLstCnt = 0;	// 行数
			// 行数取得
			_tempLstCnt = struct.getList_SLIP_DETAIL_NO().size();
			//チェック
			//全行選択の場合<エラー> KU34012
			if (_tempLstCnt == list.size()){
				ExpjMessage emsg = new ExpjMessage( "KU00114" );
				msgStruct.addError( emsg ); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
			//MODIFY_COUNTチェック
			List modifyCountList = entity.mselectMODIFY_COUNT.read(conn,struct);
			if (modifyCountList == null || modifyCountList.size() == 0) {
				//データが存在しない
				ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
				msgStruct.addError( emsg ); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
			KU0080010Struct modifyCountStruct = (KU0080010Struct)modifyCountList.get(0);
			if (struct.getMODIFY_COUNT().equals(modifyCountStruct.getMODIFY_COUNT()) == false) {
				ExpjMessage emsg = new ExpjMessage( "ZZ01105" );
				msgStruct.addError( emsg ); // エラーメッセージとして登録
				sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
				return;
			}
			
			int rv = 0;
			List taxList = entity.mselectTax.read(conn,struct);
			KU0080010Struct taxStruct = (KU0080010Struct)taxList.get(0);
			String invoiceAmount = taxStruct.getINVOICE_AMOUNT();
			String invoiceTaxAmount = taxStruct.getINVOICE_TAX_AMOUNT();
			String taxIncludeAmount = taxStruct.getstrTaxIncludeAmount();
			String taxCreditAmount = taxStruct.getstrTaxCreditAmount();
			
			KU0080010Struct _tempStruct = new KU0080010Struct();
	
			// Orteus標準ユーザＩＤをセット
			_tempStruct.setsUser_ID(struct.getsUser_ID());
			_tempStruct.setSCDL_SHIP_DATE(struct.getSCDL_SHIP_DATE());
			_tempStruct.setstrTaxIN_CUSTCD((String)struct.getCUST_CD());
			_tempStruct.setstrTaxIN_COMPANYCD(struct.getstrCOMPANY_CD());
			_tempStruct.setIN_SHIP_INVOICE_CTL_NO(struct.getIN_SHIP_INVOICE_CTL_NO());		//出荷インボイス管理番号
			
			// トランザクションスタート
			this.conn.beginTransWeb();
			for (int i = 0; i < _tempLstCnt; i++) {
				_tempStruct.setSLIP_DETAIL_NO((String)struct.getList_SLIP_DETAIL_NO().get(i));		//出荷インボイス明細番号
				_tempStruct.setstrTaxIN_CUST_ITEM_CD((String)struct.getList_CUST_ITEM_CD().get(i));
				
				invoiceAmount = Calculate.subtract(invoiceAmount, (String)struct.getList_SHIP_ODR_AMOUNT().get(i));
				invoiceTaxAmount = Calculate.subtract(invoiceTaxAmount,(String)struct.getList_TAX_AMOUNT().get(i));
				
				List listTax = entity.mgetTax.read(conn, _tempStruct);
				if(listTax == null || listTax.size() != 1){
				}else{
					this.TAX_KBN = ((KU0080010Struct)listTax.get(0)).getstrTaxTAX_KBN();
				}
				if ("1".equals(this.TAX_KBN)){
					taxIncludeAmount = Calculate.subtract(taxIncludeAmount,(String)struct.getList_SHIP_ODR_AMOUNT().get(i));
					taxIncludeAmount = Calculate.subtract(taxIncludeAmount,(String)struct.getList_TAX_AMOUNT().get(i));
					taxCreditAmount = Calculate.subtract(taxCreditAmount,(String)struct.getList_SHIP_ODR_AMOUNT().get(i));
					
				} else
				if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
					taxCreditAmount = Calculate.subtract(taxCreditAmount,(String)struct.getList_SHIP_ODR_AMOUNT().get(i));
					taxCreditAmount = Calculate.add(taxCreditAmount,(String)struct.getList_TAX_AMOUNT().get(i));
					taxIncludeAmount = Calculate.subtract(taxIncludeAmount,(String)struct.getList_SHIP_ODR_AMOUNT().get(i));
				}
				else{
					taxCreditAmount = Calculate.subtract(taxCreditAmount,(String)struct.getList_SHIP_ODR_AMOUNT().get(i));
					taxIncludeAmount = Calculate.subtract(taxIncludeAmount,(String)struct.getList_SHIP_ODR_AMOUNT().get(i));
				}
				//明細削除
				rv = entity.mdeleteDetail.delete(conn,_tempStruct);
			}	
			//ヘッダ更新
			_tempStruct.clear();
			_tempStruct.setIN_SHIP_INVOICE_CTL_NO(struct.getIN_SHIP_INVOICE_CTL_NO());		//出荷インボイス管理番号
			_tempStruct.setINVOICE_AMOUNT(String.valueOf(invoiceAmount));
			_tempStruct.setINVOICE_TAX_AMOUNT(String.valueOf(invoiceTaxAmount));
			_tempStruct.setstrTaxIncludeAmount(String.valueOf(taxIncludeAmount));
			_tempStruct.setstrTaxCreditAmount(String.valueOf(taxCreditAmount));
			_tempStruct.setsUser_ID(struct.getsUser_ID());
			rv = entity.mupdateHeader.update(conn,_tempStruct);
			this.conn.commit();
			_tempStruct = null;
				
			controlSelect();

	  	////////// ↑業務ロジック↑ //////////

		}catch(Exception e){
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			msgStruct.addError(emsg);
	    	sysLog.warning(emsg, sysUSER_CD);
    } finally {
    	if (conn != null) {
      	try {
        	conn.rollback();
        } catch (FoundationException fe) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01106");
			msgStruct.addError(emsg);
			sysLog.warning(emsg, sysUSER_CD);
        }
      }
    }
                //}}user_implement_dev:<controlDelete>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlDelete");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlDeleteAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");
			//{{user_implement_dev:<controlDeleteAll>
			try {
				//MODIFY_COUNTチェック
				List modifyCountList = entity.mselectMODIFY_COUNT.read(conn,struct);
				if (modifyCountList == null || modifyCountList.size() == 0) {
					//データが存在しない
					ExpjMessage emsg = new ExpjMessage( "ZZ01101" );
					msgStruct.addError( emsg ); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
					return;
				}
				KU0080010Struct modifyCountStruct = (KU0080010Struct)modifyCountList.get(0);
				if (struct.getMODIFY_COUNT().equals(modifyCountStruct.getMODIFY_COUNT()) == false) {
					ExpjMessage emsg = new ExpjMessage( "ZZ01105" );
					msgStruct.addError( emsg ); // エラーメッセージとして登録
					sysLog.warning(emsg, getsysUSER_CD()); //エラー詳細
					return;
				}

				// トランザクションスタート
				conn.beginTransWeb();
				// 出荷インボイス明細を削除する
				entity.mdeleteM_SHIP_INVOICE_DETAIL.delete(conn, struct);
				// 出荷インボイスヘッダを削除する
				entity.mdeleteM_SHIP_INVOICE_HEAD.delete(conn, struct);
				// トランザクションコミット
				conn.commit();

				// 画面初期化する
				struct.setIN_SHIP_INVOICE_CTL_NO(null);
				struct.setSCDL_SHIP_DATE_TIME(null);
				controlClear();
			} catch(Exception e){
				e.printStackTrace();
				ExpjMessage emsg = new ExpjMessage( "ZZ01106");
				msgStruct.addError(emsg);
		    	sysLog.warning(emsg, sysUSER_CD);
			} finally {
		    	if (conn != null) {
		      	try {
		        	conn.rollback();
		        } catch (FoundationException fe) {
					ExpjMessage emsg = new ExpjMessage( "ZZ01106");
					msgStruct.addError(emsg);
					sysLog.warning(emsg, sysUSER_CD);
		        }
		    }
	    }
                //}}user_implement_dev:<controlDeleteAll>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlDeleteAll");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
			struct.init();
			if (list != null) {
        			list.clear();
        		} else {
        			list = new ArrayList();
        		}
			// 会社コードの取得
			List listKaisyaCd = entity.mgetCompanyInfo.read(conn,struct);
			if(listKaisyaCd == null || listKaisyaCd.size() != 1){
			    //会社情報が無い/複数件
			    //エラーメッセージ出力
			    ExpjMessage emsg = new ExpjMessage("KQ00039");
			    msgStruct.addError(emsg);	// エラーメッセージとして登録
			    sysLog.severe(emsg, getsysUSER_CD()); //エラー内容
			    ExpjException ee = new ExpjException(emsg);
			    throw ee;
			}else{
				struct.setstrCOMPANY_CD(((KU0080010Struct)listKaisyaCd.get(0)).getstrCOMPANY_CD());
			}
			
			listKaisyaCd = null;
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				// 検索のコントロールメソッドを呼び出します。
				if ("KU0070010".equals(getScreenId())) {
					_SelectMark = getSelectMark();
					_ShipOdrNo = getShipOdrNo();
					String slipDetailNo = "";         //出荷インボイス明細番号
					int j = 0;
					String externalTaxAmount = "0";          //内税税額
					String internalTaxAmount = "0";          //外税税額
					String invoiceAmount = "0";              //金額
					String invoiceTaxAmount = "0";           //消費税金額
					String taxIncludeAmount = "0";           //税込金額
					String taxCreditAmount = "0";            //税抜金額
					for( int i = 0; i < _SelectMark.length; i++){
					    if ("1".equals(_SelectMark[i])){
					    	KU0080010Struct structtemp = new KU0080010Struct();
					    	j++;
					    	slipDetailNo = String.valueOf(j);
					    	structtemp.setSHIP_ODR_NO(_ShipOdrNo[i]);
					    	List listTemp = entity.mselectT_SHIP_ODR.read(conn, structtemp);  //明細出荷指示
					    	structtemp.setSLIP_DETAIL_NO(slipDetailNo);
					    	structtemp.setCUST_ITEM_CD(((KU0080010Struct)listTemp.get(0)).getCUST_ITEM_CD());
					    	structtemp.setCUST_ITEM_NAME(((KU0080010Struct)listTemp.get(0)).getCUST_ITEM_NAME());
					    	structtemp.setCUST_ODR_NO(((KU0080010Struct)listTemp.get(0)).getCUST_ODR_NO());
					    	structtemp.setODR_NO(((KU0080010Struct)listTemp.get(0)).getODR_NO());
					    	structtemp.setPART_DLV_SEQ_NO(((KU0080010Struct)listTemp.get(0)).getPART_DLV_SEQ_NO());
					    	structtemp.setITEM_CD(((KU0080010Struct)listTemp.get(0)).getITEM_CD());
					    	structtemp.setITEM_NAME(((KU0080010Struct)listTemp.get(0)).getITEM_NAME());
					    	structtemp.setSHIP_QTY(((KU0080010Struct)listTemp.get(0)).getSHIP_QTY());
					    	structtemp.setUNIT_PRICE(((KU0080010Struct)listTemp.get(0)).getUNIT_PRICE());
					    	structtemp.setSHIP_ODR_AMOUNT(((KU0080010Struct)listTemp.get(0)).getSHIP_ODR_AMOUNT());  //明細金額
					    	structtemp.setCUST_CD(((KU0080010Struct)listTemp.get(0)).getCUST_CD());
					    	structtemp.setDLV_LOC_CD(((KU0080010Struct)listTemp.get(0)).getDLV_LOC_CD());
					    	structtemp.setSCDL_SHIP_DATE(((KU0080010Struct)listTemp.get(0)).getSCDL_SHIP_DATE());
					    	structtemp.setSCDL_DLV_DATE(((KU0080010Struct)listTemp.get(0)).getSCDL_DLV_DATE());   //納品予定日
					    	invoiceAmount = Calculate.add(invoiceAmount,structtemp.getSHIP_ODR_AMOUNT());    
					    	
					    	if (j == 1){
					    	    struct.setCUST_CD(((KU0080010Struct)listTemp.get(0)).getCUST_CD());
							    struct.setDLV_LOC_CD(((KU0080010Struct)listTemp.get(0)).getDLV_LOC_CD());
							    struct.setSCDL_SHIP_DATE(((KU0080010Struct)listTemp.get(0)).getSCDL_SHIP_DATE());
					    	}
							
					    	List listType = entity.mselectUNIT_COST_TYP.read(conn, structtemp);  //明細単価区分
					    	if (listType.size() == 0 || listType == null){
					    	    structtemp.setUNIT_COST_TYP(this.multcombo("UNIT_COST_TYP","1"));
					    	    structtemp.setunit_cost_typ_val("1");
					    	}
					    	else{
					    		structtemp.setUNIT_COST_TYP(this.multcombo("UNIT_COST_TYP",((KU0080010Struct)listType.get(0)).getUNIT_COST_TYP()));
					    		structtemp.setunit_cost_typ_val(((KU0080010Struct)listType.get(0)).getUNIT_COST_TYP());
					    	}
					    	
					    	TAX_RATE = "0";     // 税率初期化
					    	structtemp.setstrTaxIN_CUST_ITEM_CD(((KU0080010Struct)listTemp.get(0)).getCUST_ITEM_CD());
					    	structtemp.setSCDL_SHIP_DATE(struct.getSCDL_SHIP_DATE());
					    	String updifftaxAmount[] = this.doCalcuTaxAmount(structtemp,struct.getstrCOMPANY_CD(),struct.getCUST_CD(),structtemp.getODR_NO(),structtemp.getSHIP_ODR_AMOUNT());
					    	structtemp.setTAX_RATE(TAX_RATE);           // 税率
					    	
					    	structtemp.setTAX_AMOUNT("0");		// 税額初期化
                            
					    	if (updifftaxAmount[0] == null) {
                            	updifftaxAmount[0] = "0";
                            	updifftaxAmount[1] = "0";
                            	updifftaxAmount[2] = "0";
                            }
					    	
							String updiffsTmpTax = Calculate.add(updifftaxAmount[0], updifftaxAmount[1]);
							updiffsTmpTax = Calculate.add(updiffsTmpTax, updifftaxAmount[2]);
							structtemp.setTAX_AMOUNT(updiffsTmpTax);		// 税額
							invoiceTaxAmount = Calculate.add(invoiceTaxAmount, updiffsTmpTax);
							
							if ("1".equals(this.TAX_KBN)){
								externalTaxAmount = Calculate.add(externalTaxAmount, updiffsTmpTax);
							} else
							if ("5".equals(this.TAX_KBN) || "9".equals(this.TAX_KBN)){
								internalTaxAmount = Calculate.add(internalTaxAmount, updiffsTmpTax);
							}
							structtemp.setINVOICE_AMOUNT(invoiceAmount);        //金額
						    structtemp.setINVOICE_TAX_AMOUNT(invoiceTaxAmount);    //VAT
						    taxIncludeAmount = Calculate.add(invoiceAmount,externalTaxAmount);
						    taxCreditAmount = Calculate.subtract(invoiceAmount,internalTaxAmount);
						    structtemp.setstrTaxIncludeAmount(taxIncludeAmount); 
						    structtemp.setstrTaxCreditAmount(taxCreditAmount);
					    	list.add(structtemp);
					    }
					}
					struct.setINVOICE_AMOUNT(invoiceAmount);        //金額
				    struct.setINVOICE_TAX_AMOUNT(invoiceTaxAmount);    //VAT
				    taxIncludeAmount = Calculate.add(invoiceAmount,externalTaxAmount);
				    taxCreditAmount = Calculate.subtract(invoiceAmount,internalTaxAmount);
				    struct.setstrTaxIncludeAmount(taxIncludeAmount); 
				    struct.setstrTaxCreditAmount(taxCreditAmount);
				    struct.setjump_flag("1");
				    setReadStatus(INITIAL);
				}
				else{
				    struct.setIN_SHIP_INVOICE_CTL_NO(getShipInvoiceCtlNo());
				    controlSelect();
				}
			}

			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		}catch(ExpjException ee){
	        throw ee;
        }catch(Exception e){
        	e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage("ZZ01106");
			sysLog.severe(emsg, getsysUSER_CD());// 致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
         }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KU0080");
		logger.entering("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			try{
			    ComboBox comboController = new ComboBox(conn, sysUSER_CD);
			    ComboStruct SPCL_PRICE_TYP = comboController.getData("TRANSPORT_TYP");
			    struct.setList_TRANSPORT_METHOD_val(SPCL_PRICE_TYP.getValList());
			    struct.setList_TRANSPORT_METHOD_name(SPCL_PRICE_TYP.getExplanList());
			} catch(SQLException e) {
				e.printStackTrace();
			// エラー処理を記述してください。
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KU0080010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("Update") ) {
				controlUpdate();
			} else if( button.equals("Cancel") ) {
				controlCancel();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("Insert") ) {
				controlInsert();
			} else if( button.equals("GoPrint") ) {
				controlGoPrint();
			} else if( button.equals("Delete") ) {
				controlDelete();
			} else if( button.equals("DeleteAll") ) {
				controlDeleteAll();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
			// コンボボックスのセットする
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
//			throw new FoundationException("KU0080010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0080010-E999","CSVの出力処理"));
			throw new FoundationException("KU0080010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0080010-E999","システム日付の取得処理"));
				throw new FoundationException("KU0080010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KU0080010-E999","コントロールのイベント処理"));
			throw new FoundationException("KU0080010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KU0080010Entity entity;
	protected KU0080010Struct struct;
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

		entity = new KU0080010Entity();
		struct = new KU0080010Struct();

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
	 * KU0080010クラスの標準コンストラクタ
	 */
	public KU0080010Control() throws BusinessProcessException, FoundationException
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
				KU0080010Struct key = (KU0080010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("TRANSPORT_METHOD_name") && key.getTRANSPORT_METHOD_name() != null) {
					msgKey.setKeyValue("TRANSPORT_METHOD_name", key.getTRANSPORT_METHOD_name());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_METHOD_val") && key.getTRANSPORT_METHOD_val() != null) {
					msgKey.setKeyValue("TRANSPORT_METHOD_val", key.getTRANSPORT_METHOD_val());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TIME") && key.getSCDL_SHIP_DATE_TIME() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE_TIME", key.getSCDL_SHIP_DATE_TIME());
				}
				if(msgKeyType.containsKeyColumn("strTaxIncludeAmount") && key.getstrTaxIncludeAmount() != null) {
					msgKey.setKeyValue("strTaxIncludeAmount", key.getstrTaxIncludeAmount());
				}
				if(msgKeyType.containsKeyColumn("strTaxCreditAmount") && key.getstrTaxCreditAmount() != null) {
					msgKey.setKeyValue("strTaxCreditAmount", key.getstrTaxCreditAmount());
				}
				if(msgKeyType.containsKeyColumn("unit_cost_typ_val") && key.getunit_cost_typ_val() != null) {
					msgKey.setKeyValue("unit_cost_typ_val", key.getunit_cost_typ_val());
				}
				if(msgKeyType.containsKeyColumn("jump_flag") && key.getjump_flag() != null) {
					msgKey.setKeyValue("jump_flag", key.getjump_flag());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_CUST_ITEM_CD") && key.getstrTaxIN_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("strTaxIN_CUST_ITEM_CD", key.getstrTaxIN_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_NO") && key.getSHIP_INVOICE_NO() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_NO", key.getSHIP_INVOICE_NO());
				}
				if(msgKeyType.containsKeyColumn("DEPARTURE_PLACE") && key.getDEPARTURE_PLACE() != null) {
					msgKey.setKeyValue("DEPARTURE_PLACE", key.getDEPARTURE_PLACE());
				}
				if(msgKeyType.containsKeyColumn("DEPARTURE_DATE") && key.getDEPARTURE_DATE() != null) {
					msgKey.setKeyValue("DEPARTURE_DATE", key.getDEPARTURE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ARRIVAL_PLACE") && key.getARRIVAL_PLACE() != null) {
					msgKey.setKeyValue("ARRIVAL_PLACE", key.getARRIVAL_PLACE());
				}
				if(msgKeyType.containsKeyColumn("ARRIVAL_DATE") && key.getARRIVAL_DATE() != null) {
					msgKey.setKeyValue("ARRIVAL_DATE", key.getARRIVAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_METHOD") && key.getTRANSPORT_METHOD() != null) {
					msgKey.setKeyValue("TRANSPORT_METHOD", key.getTRANSPORT_METHOD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_NO") && key.getSHIP_NO() != null) {
					msgKey.setKeyValue("SHIP_NO", key.getSHIP_NO());
				}
				if(msgKeyType.containsKeyColumn("REMARKS_1") && key.getREMARKS_1() != null) {
					msgKey.setKeyValue("REMARKS_1", key.getREMARKS_1());
				}
				if(msgKeyType.containsKeyColumn("REMARKS_2") && key.getREMARKS_2() != null) {
					msgKey.setKeyValue("REMARKS_2", key.getREMARKS_2());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("INVOICE_AMOUNT") && key.getINVOICE_AMOUNT() != null) {
					msgKey.setKeyValue("INVOICE_AMOUNT", key.getINVOICE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INVOICE_TAX_AMOUNT") && key.getINVOICE_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("INVOICE_TAX_AMOUNT", key.getINVOICE_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PRINT_FLG") && key.getPRINT_FLG() != null) {
					msgKey.setKeyValue("PRINT_FLG", key.getPRINT_FLG());
				}
				if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE") && key.getSCDL_SHIP_DATE() != null) {
					msgKey.setKeyValue("SCDL_SHIP_DATE", key.getSCDL_SHIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("IN_SHIP_INVOICE_CTL_NO") && key.getIN_SHIP_INVOICE_CTL_NO() != null) {
					msgKey.setKeyValue("IN_SHIP_INVOICE_CTL_NO", key.getIN_SHIP_INVOICE_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("SLIP_DETAIL_NO") && key.getSLIP_DETAIL_NO() != null) {
					msgKey.setKeyValue("SLIP_DETAIL_NO", key.getSLIP_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_ODR_NO") && key.getCUST_ODR_NO() != null) {
					msgKey.setKeyValue("CUST_ODR_NO", key.getCUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_NO") && key.getSHIP_ODR_NO() != null) {
					msgKey.setKeyValue("SHIP_ODR_NO", key.getSHIP_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("SHIP_QTY") && key.getSHIP_QTY() != null) {
					msgKey.setKeyValue("SHIP_QTY", key.getSHIP_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_PRICE") && key.getUNIT_PRICE() != null) {
					msgKey.setKeyValue("UNIT_PRICE", key.getUNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_ODR_AMOUNT") && key.getSHIP_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("SHIP_ODR_AMOUNT", key.getSHIP_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT") && key.getTAX_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_AMOUNT", key.getTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE") && key.getTAX_RATE() != null) {
					msgKey.setKeyValue("TAX_RATE", key.getTAX_RATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME") && key.getCUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("CUST_ITEM_NAME", key.getCUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO") && key.getPART_DLV_SEQ_NO() != null) {
					msgKey.setKeyValue("PART_DLV_SEQ_NO", key.getPART_DLV_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("strCOMPANY_CD") && key.getstrCOMPANY_CD() != null) {
					msgKey.setKeyValue("strCOMPANY_CD", key.getstrCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("SCDL_DLV_DATE") && key.getSCDL_DLV_DATE() != null) {
					msgKey.setKeyValue("SCDL_DLV_DATE", key.getSCDL_DLV_DATE());
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
				if(msgKeyType.containsKeyColumn("strTaxIN_ODR_NO") && key.getstrTaxIN_ODR_NO() != null) {
					msgKey.setKeyValue("strTaxIN_ODR_NO", key.getstrTaxIN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_DECIMAL_FIG") && key.getstrTaxIN_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("strTaxIN_DECIMAL_FIG", key.getstrTaxIN_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_COMPANYCD") && key.getstrTaxIN_COMPANYCD() != null) {
					msgKey.setKeyValue("strTaxIN_COMPANYCD", key.getstrTaxIN_COMPANYCD());
				}
				if(msgKeyType.containsKeyColumn("strTaxIN_CUSTCD") && key.getstrTaxIN_CUSTCD() != null) {
					msgKey.setKeyValue("strTaxIN_CUSTCD", key.getstrTaxIN_CUSTCD());
				}
				if(msgKeyType.containsKeyColumn("PRINT_DATE") && key.getPRINT_DATE() != null) {
					msgKey.setKeyValue("PRINT_DATE", key.getPRINT_DATE());
				}
				if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DTL_CTL_NO") && key.getSHIP_INVOICE_DTL_CTL_NO() != null) {
					msgKey.setKeyValue("SHIP_INVOICE_DTL_CTL_NO", key.getSHIP_INVOICE_DTL_CTL_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
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
					KU0080010Struct key = new KU0080010Struct();
					if(msgKeyType.containsKeyColumn("TRANSPORT_METHOD_name")) {
						key.setTRANSPORT_METHOD_name(msgKey.getKeyValue("TRANSPORT_METHOD_name"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_METHOD_val")) {
						key.setTRANSPORT_METHOD_val(msgKey.getKeyValue("TRANSPORT_METHOD_val"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE_TIME")) {
						key.setSCDL_SHIP_DATE_TIME(msgKey.getKeyValue("SCDL_SHIP_DATE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIncludeAmount")) {
						key.setstrTaxIncludeAmount(msgKey.getKeyValue("strTaxIncludeAmount"));
					}
					if(msgKeyType.containsKeyColumn("strTaxCreditAmount")) {
						key.setstrTaxCreditAmount(msgKey.getKeyValue("strTaxCreditAmount"));
					}
					if(msgKeyType.containsKeyColumn("unit_cost_typ_val")) {
						key.setunit_cost_typ_val(msgKey.getKeyValue("unit_cost_typ_val"));
					}
					if(msgKeyType.containsKeyColumn("jump_flag")) {
						key.setjump_flag(msgKey.getKeyValue("jump_flag"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_CUST_ITEM_CD")) {
						key.setstrTaxIN_CUST_ITEM_CD(msgKey.getKeyValue("strTaxIN_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_NO")) {
						key.setSHIP_INVOICE_NO(msgKey.getKeyValue("SHIP_INVOICE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DEPARTURE_PLACE")) {
						key.setDEPARTURE_PLACE(msgKey.getKeyValue("DEPARTURE_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("DEPARTURE_DATE")) {
						key.setDEPARTURE_DATE(msgKey.getKeyValue("DEPARTURE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ARRIVAL_PLACE")) {
						key.setARRIVAL_PLACE(msgKey.getKeyValue("ARRIVAL_PLACE"));
					}
					if(msgKeyType.containsKeyColumn("ARRIVAL_DATE")) {
						key.setARRIVAL_DATE(msgKey.getKeyValue("ARRIVAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_METHOD")) {
						key.setTRANSPORT_METHOD(msgKey.getKeyValue("TRANSPORT_METHOD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_NO")) {
						key.setSHIP_NO(msgKey.getKeyValue("SHIP_NO"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS_1")) {
						key.setREMARKS_1(msgKey.getKeyValue("REMARKS_1"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS_2")) {
						key.setREMARKS_2(msgKey.getKeyValue("REMARKS_2"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("INVOICE_AMOUNT")) {
						key.setINVOICE_AMOUNT(msgKey.getKeyValue("INVOICE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INVOICE_TAX_AMOUNT")) {
						key.setINVOICE_TAX_AMOUNT(msgKey.getKeyValue("INVOICE_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_FLG")) {
						key.setPRINT_FLG(msgKey.getKeyValue("PRINT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_SHIP_DATE")) {
						key.setSCDL_SHIP_DATE(msgKey.getKeyValue("SCDL_SHIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("IN_SHIP_INVOICE_CTL_NO")) {
						key.setIN_SHIP_INVOICE_CTL_NO(msgKey.getKeyValue("IN_SHIP_INVOICE_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_DETAIL_NO")) {
						key.setSLIP_DETAIL_NO(msgKey.getKeyValue("SLIP_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ODR_NO")) {
						key.setCUST_ODR_NO(msgKey.getKeyValue("CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_NO")) {
						key.setSHIP_ODR_NO(msgKey.getKeyValue("SHIP_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_QTY")) {
						key.setSHIP_QTY(msgKey.getKeyValue("SHIP_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_PRICE")) {
						key.setUNIT_PRICE(msgKey.getKeyValue("UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_ODR_AMOUNT")) {
						key.setSHIP_ODR_AMOUNT(msgKey.getKeyValue("SHIP_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT")) {
						key.setTAX_AMOUNT(msgKey.getKeyValue("TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE")) {
						key.setTAX_RATE(msgKey.getKeyValue("TAX_RATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_NAME")) {
						key.setCUST_ITEM_NAME(msgKey.getKeyValue("CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PART_DLV_SEQ_NO")) {
						key.setPART_DLV_SEQ_NO(msgKey.getKeyValue("PART_DLV_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("strCOMPANY_CD")) {
						key.setstrCOMPANY_CD(msgKey.getKeyValue("strCOMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SCDL_DLV_DATE")) {
						key.setSCDL_DLV_DATE(msgKey.getKeyValue("SCDL_DLV_DATE"));
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
					if(msgKeyType.containsKeyColumn("strTaxIN_ODR_NO")) {
						key.setstrTaxIN_ODR_NO(msgKey.getKeyValue("strTaxIN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_DECIMAL_FIG")) {
						key.setstrTaxIN_DECIMAL_FIG(msgKey.getKeyValue("strTaxIN_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_COMPANYCD")) {
						key.setstrTaxIN_COMPANYCD(msgKey.getKeyValue("strTaxIN_COMPANYCD"));
					}
					if(msgKeyType.containsKeyColumn("strTaxIN_CUSTCD")) {
						key.setstrTaxIN_CUSTCD(msgKey.getKeyValue("strTaxIN_CUSTCD"));
					}
					if(msgKeyType.containsKeyColumn("PRINT_DATE")) {
						key.setPRINT_DATE(msgKey.getKeyValue("PRINT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_INVOICE_DTL_CTL_NO")) {
						key.setSHIP_INVOICE_DTL_CTL_NO(msgKey.getKeyValue("SHIP_INVOICE_DTL_CTL_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
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
