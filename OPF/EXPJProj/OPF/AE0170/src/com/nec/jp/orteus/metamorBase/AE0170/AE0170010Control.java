/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0170/src/com/nec/jp/orteus/metamorBase/AE0170/AE0170010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0170;

import com.nec.jp.orteus.metamorBase.AE0170.*;
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
import java.text.ParseException;
import java.math.BigDecimal;
import java.lang.StringBuffer;
import com.nec.jp.orteus.expj.arap.AccTermDate;
import com.nec.jp.orteus.expj.arap.ArApNumbering;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0170010Control クラス
 * ファイル・クラス説明
 * @author $Author: xl-hs-zzw $
 * @version $Revision: 1.3 $ $Date: 2014/02/26 01:26:47 $
 *
 */
//}}user_implement_code_header

public class AE0170010Control
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
	public AE0170010Struct getListvalue(int x) { return (AE0170010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0170010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0170010Struct createStruct() { return new AE0170010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0170010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	protected List listAcptRslt = null;								// 結果リストのインスタンス(受入実績データ)
	
	/** Explanner/J*/
	private static final String EXPLANNER_J = "J*";
	
	/** Explanner/Ja*/
	private static final String EXPLANNER_JA = "JA*";
	
	/** Explanner/Jf*/
	private static final String EXPLANNER_JF = "JF*";
	
	/** Explanner/JaSCM*/
	private static final String EXPLANNER_JASCM = "SCM*";
	
	/** 買掛管理システム*/
	private static final String AP_SYSTEM = "C*";
	
	//表示行数制限値(SYS_SCREEN_PARM)の取得
	private int _maxLine = 0;
	
	/**
     * エラーメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     * @param isThrowException 異常スローフラグ
	 * @throws ExpjException 
     */
    private void setErrorMessage(String code, boolean isThrowException) throws ExpjException {
    	ExpjMessage emsg = new ExpjMessage(code);
    	msgStruct.addError(emsg);
    	if (isThrowException) {
    		throw new ExpjException(code); // エクセプションを生成
    	}
    	sysLog.warning(emsg, sysUSER_CD);
    }
	
	/**
     * エラーメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     * @param param メッセージパラメータ
     */
    private void setErrorMessage(String code, String param) {
    	ExpjMessage emsg = new ExpjMessage(code, param);
    	msgStruct.addError(emsg);
    	sysLog.warning(emsg, sysUSER_CD);
    }
	
	/**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 出力メッセージ
     */
    private void setInfoMessage(String code)
    {
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addInfo(emsg);
     sysLog.config(emsg, getsysUSER_CD()); 
    }
	
	/**
	 * Exceptionメッセージ設定
	 * @param キー項目
	 */
	private void setExceptionMsg(Exception e, String strMsgCd) throws ExpjException
	{
		// エラーメッセージ作成
		ExpjMessage emsg = new ExpjMessage(strMsgCd);
		sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
		ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
		throw ee;
	}
    
    /**
	 * 区分名取得
	 * 
	 * @param comboStruct
	 *            区分情報リスト
	 * @param strTyp
	 *            区分コード
	 * @return 区分名称。該当するデータがなかった場合は区分コードを返す
	 */
	private String getComboTypeName(ComboStruct comboStruct, String strTyp) {
		String strTypName = strTyp;
		for (int i = 0; i < comboStruct.getValList().size(); i++) {
			if (((String) (comboStruct.getValList().get(i))).equals(strTyp)) {
				strTypName = (String) (comboStruct.getExplanList().get(i));
				break;
			}
		}
		return strTypName;
	}
    
    /**
	 * 端数処理を行う。
	 * 
	 * @param strAmount
	 *            端数処理前の値
	 * @param strDecimalFlg
	 *            小数桁数
	 * @param strRoundTyp
	 *            端数区分
	 * @return 端数処理後の値
	 */
	private String getRound(String strAmount, String strDecimalFlg, String strRoundTyp) {
		strAmount = convertNull(strAmount);
		BigDecimal val1 = new BigDecimal(strAmount);

		// 四捨五入
		if ("1".equals(strRoundTyp)) {
			val1 = val1.setScale(Integer.parseInt(strDecimalFlg), BigDecimal.ROUND_HALF_UP);
		}
		// 切り上げ
		else if ("2".equals(strRoundTyp)) {
			val1 = val1.setScale(Integer.parseInt(strDecimalFlg), BigDecimal.ROUND_UP);
		}
		// 切り捨て
		else {
			val1 = val1.setScale(Integer.parseInt(strDecimalFlg), BigDecimal.ROUND_DOWN);
		}
		return val1.toString();
	}
	
	/**
	 * 為替レート取得処理
	 * 
	 * @param curCd
	 *            通貨コード
	 * @param exchTyp
	 *            為替種別
	 * @param stdDate
	 *            基準日
	 * @return String 為替レート
	 * @throws ExpjException 
	 */
	private String getExchRate(String curCd, String exchTyp, String stdDate) throws ExpjException {
		String exchRate = null; // 為替レート
		try {
			
			if (stdDate != null && stdDate.length() > 10) {
				stdDate = stdDate.substring(0, 10);
			}

			// 為替レート取得
			ExchRateStruct ers = null;

			// Explanner/JaScmの場合
			if (EXPLANNER_JASCM.equals(struct.getOPTION_ID())) {
				Class clazz = Class.forName("com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControlSCM");
				Method method = clazz.getMethod("getData", new Class[]{IDbConnection.class,
						String.class,
						String.class,
						String.class,
						String.class,
						String.class});
				Object objErs = method.invoke(null, new Object[]{conn, // DBコネクション
						struct.getCOMPANY_CD(), // 会社コード
						curCd, // 通貨コード
						exchTyp, // 為替種別
						null, // 為替予約コード(未使用)
						stdDate}); // 基準日
				if (objErs != null) {
					ers = (ExchRateStruct) objErs;
				}
			} else {
				ers = ExchRateControl.getData(conn, // DBコネクション
						struct.getCOMPANY_CD(), // 会社コード
						curCd, // 通貨コード
						exchTyp, // 為替種別
						null, // 為替予約コード(未使用)
						stdDate); // 基準日
			}

			if (ers != null) {
				exchRate = ers.getEXCH_RATE();
			}
			
			if (exchRate == null || "".equals(exchRate)) {
				setErrorMessage("AE34059", true);
			}


		} catch (Exception e) {
			setErrorMessage("AE34059", true);
		}
		
		return exchRate;
	}
    
    /**
	 * 消費税計算を行う。
	 * 
	 * @param strAmount
	 *            税計算前の値
	 * @param strTaxRate
	 *            消費税率
	 * @param strDecimalFlg
	 *            小数桁数
	 * @param strRoundTyp
	 *            端数区分
	 * @return 消費税計算後の値
	 */
	private String calculateTax(String strAmount, String strTaxRate, String strDecimalFlg, String strRoundTyp) {
		strAmount = convertNull(strAmount);
		strTaxRate = convertNull(strTaxRate);
		String strTaxAmount = Calculate.multiply(strAmount, strTaxRate);
		strTaxAmount = Calculate.multiply(strTaxAmount, "0.01");
		return getRound(strTaxAmount, strDecimalFlg, strRoundTyp);
	}
	//Add Start 20140207 liang-l
	/**
	 * 消費税計算(内税)を行う。
	 * 
	 * @param strAmount
	 *            税計算前の値
	 * @param strTaxRate
	 *            消費税率
	 * @param strDecimalFlg
	 *            小数桁数
	 * @param strRoundTyp
	 *            端数区分
	 * @return 消費税計算後の値
	 */
	private String calculateTaxIn(String strAmount, String strTaxRate, String strDecimalFlg, String strRoundTyp) {
		strAmount = convertNull(strAmount);
		strTaxRate = convertNull(strTaxRate);
		String strTaxAmount = Calculate.multiply(strAmount, strTaxRate);
		strTaxAmount = String.valueOf(Double.parseDouble(strTaxAmount) / (Double.parseDouble("100")+Double.parseDouble(strTaxRate)));
		return getRound(strTaxAmount, strDecimalFlg, strRoundTyp);
	}
	//Add End   20140207 liang-l
    /**
     * 伝票番号の採番
     * @param struct 条件データを保持しており、取得したデータをセットする
     * @return String：取得した伝票番号
     * @throws EXPJException
     */
    public String getNewSlipCd(String strSlipTyp, String strSysDateTime) throws ExpjException
    {
        String strSlipCd = null;
        try{
        	if (strSysDateTime.length() > 10) {
        		strSysDateTime = strSysDateTime.substring(0, 10);
        	}
        	
            ArApNumbering arapnumbering_common = new ArApNumbering( conn, this.getsysUSER_CD() ,
            		"AE0170010", this.getsysPLANT_CD(), struct.getCOMPANY_CD(), "1", strSlipTyp, strSysDateTime);

            strSlipCd = arapnumbering_common.getSlipCd();

            if(strSlipCd == null){
                setErrorMessage("BZ00180", true);
            }

        } catch (Exception e) {
            setErrorMessage("BZ00180", true);
        }
    
        return strSlipCd;
    }
	
	/**
	 * DBのシステム日時読込処理
	 * 
	 * @return DBのシステム日時:成功 / null:失敗
	 * @throws SQLException 
	 */
	public String readSystemDateTime() throws SQLException {
		String strDateTime = null;
		PreparedStatement stmt = null;
		ResultSet rset = null;
		String strSql ="select "
				+ "  to_char(sysdate, 'YYYY/MM/DD HH24:MI:SS') " + "from "
				+ "  dual ";
		try {
			stmt = (conn.getConn()).prepareStatement(strSql);
			rset = stmt.executeQuery();
			if (rset.next() == true) {
				strDateTime = rset.getString(1);
			}
		} finally {
			if (rset != null) {
				try {
					rset.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				rset = null;
			}
			if (stmt != null) {
				try {
					stmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
				stmt = null;
			}
		}
		return strDateTime;
	}
	
	/**
	 * 期情報の読込処理を行う。
	 * 
	 * @param strThisMonth 年月
	 * @return 取得した期情報
	 * @throws ExpjException 
	 */
	public String getRecordingMonthOrDate(String strThisMonth, boolean isGetDate) throws ExpjException {
		
		String strDateMonth = "";
		if (strThisMonth.length() >= 10) {
			StringBuffer sbMonth = new StringBuffer(strThisMonth.substring(0, 4));
			sbMonth.append(strThisMonth.substring(5, 7));
			strThisMonth = sbMonth.toString();
		}
		
		// //期期間マスタの開始年月日の取得
		try {
			AccTermDate accTermDate = new AccTermDate(conn, this.getsysUSER_CD(),
					"AE0170010", this.getsysPLANT_CD(), struct.getCOMPANY_CD(), strThisMonth);

			if (isGetDate) {
				DateConverter dc = new DateConverter();
				strDateMonth = dc.date2str(accTermDate.getMonthStartDate());
			} else {
				strDateMonth = String.valueOf(accTermDate.getYearMonth());
			}
			
		} catch (FoundationException e) {
			e.printStackTrace();
			throw new ExpjException("BZ00178");
		}
		
		return strDateMonth;
	}
	
	/**
	 * nullまたは空白文字ならば0、それ以外はそのままにします。
	 *
	 * @param String str
	 * @return String 変換後文字列
	 */
	private String convertNull(String str){
		if (str == null || str.equals("")) {
			return "0";
		}
		return str;
	}

	/**
	 * 新消費税コード開始日と比較
	 *
	 */
	private boolean isNewTax(String strCompareDate, String strStartDate) throws ParseException
	{
		boolean rv = false;

		//新消費税コード開始日
		GregorianCalendar date1 = new GregorianCalendar();
		//date1.setTime(sdi.parse(strStartDate));
		date1.setTime(Converter.strToDate(strStartDate, "yyyy/MM/dd"));

		//比較日
		GregorianCalendar date2 = new GregorianCalendar();
		date2.setTime(Converter.strToDate(strCompareDate, "yyyy/MM/dd"));

		//新消費税コード開始日 <= 出荷指定日の場合、新税率
		if(date1.getTime().compareTo(date2.getTime()) <= 0){
			rv = true;
		}
		return rv;
	}
	
	/**
	 * 買掛金残高の更新処理を行う。
	 *
	 * @return stDebtBalanceD 買掛金残高明細
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private void updateT_DEBT_BALANCE(AE0170010Struct stDebtBalanceD) throws FoundationException, SQLException {

		AE0170010Struct stDebtBalance = null;
		AE0170010Struct st = new AE0170010Struct();
		// 取得条件を設定
		st.setCOMPANY_CD(stDebtBalanceD.getCOMPANY_CD()); // 会社コード
		st.setMONTH(stDebtBalanceD.getMONTH()); // 年月度
		st.setACCT_CD(stDebtBalanceD.getACCT_CD()); // 科目コード
		st.setSUB_ACCT_CD(stDebtBalanceD.getSUB_ACCT_CD()); // 補助区分コード
		st.setORG_CD(stDebtBalanceD.getORG_CD()); // 部門コード
		st.setCUR_CD(stDebtBalanceD.getCUR_CD()); // 通貨コード
		st.setPAYEE_CD(stDebtBalanceD.getPAYEE_CD()); // 支払先コード
		
		// 買掛金残高の取得を行う
		List lstDebtBalance = entity.mT_DEBT_BALANCE.read(conn, st);
		if (lstDebtBalance != null && lstDebtBalance.size() == 1) {
			stDebtBalance = (AE0170010Struct) lstDebtBalance.get(0);
		
			// 更新項目を設定する
			stDebtBalance.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
			stDebtBalance.setRECORDING_AMOUNT(Calculate.add(
					convertNull(stDebtBalance.getRECORDING_AMOUNT()),
					convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // 計上額
			stDebtBalance.setNET_AMOUNT(Calculate.add(
					convertNull(stDebtBalance.getNET_AMOUNT()),
					convertNull(stDebtBalanceD.getNET_AMOUNT()))); // 税抜金額
			stDebtBalance.setTAX_AMOUNT(Calculate.add(
					convertNull(stDebtBalance.getTAX_AMOUNT()),
					convertNull(stDebtBalanceD.getTAX_AMOUNT()))); // 消費税額
			
			if ("71".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setDEBT_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getDEBT_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // 買掛計上金額
				stDebtBalance.setDEBT_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getDEBT_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // 買掛計上金額（邦貨換算）
			} else if ("72".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setSAVING_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getSAVING_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // 値引金額
				stDebtBalance.setSAVING_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getSAVING_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // 値引金額（邦貨換算）
			} else if ("73".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setREBATE_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getREBATE_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // リベート額
				stDebtBalance.setREBATE_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getREBATE_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // リベート額（邦貨換算）
			} else if ("74".equals(stDebtBalanceD.getSLIP_TYP())) {
				stDebtBalance.setRETURNED_GOODS_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getRETURNED_GOODS_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // 返品額
				stDebtBalance.setRETURNED_GOODS_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getRETURNED_GOODS_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // 返品額（邦貨換算）
			} else {
				stDebtBalance.setINSPC_ACPT_AMOUNT(Calculate.add(
						convertNull(stDebtBalance.getINSPC_ACPT_AMOUNT()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT()))); // 検収金額
				stDebtBalance.setINSPC_ACPT_AMOUNT_YEN(Calculate.add(
						convertNull(stDebtBalance.getINSPC_ACPT_AMOUNT_YEN()),
						convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // 検収金額（邦貨換算）
			}
			
			stDebtBalance.setRECORDING_AMOUNT_YEN(Calculate.add(
					convertNull(stDebtBalance.getRECORDING_AMOUNT_YEN()),
					convertNull(stDebtBalanceD.getGROSS_AMOUNT_YEN()))); // 計上額（邦貨換算）
			stDebtBalance.setNET_AMOUNT_YEN(Calculate.add(
					convertNull(stDebtBalance.getNET_AMOUNT_YEN()),
					convertNull(stDebtBalanceD.getNET_AMOUNT_YEN()))); // 税抜金額（邦貨換算）
			stDebtBalance.setTAX_AMOUNT_YEN(Calculate.add(
					convertNull(stDebtBalance.getTAX_AMOUNT_YEN()),
					convertNull(stDebtBalanceD.getTAX_AMOUNT_YEN()))); // 消費税額（邦貨換算）
			
			// 買掛金残高の更新を行う
			entity.mT_DEBT_BALANCE.update(conn, stDebtBalance);
		}
	}
	
	/**
	 * 明細データステータスの取得を行う。
	 *
	 * @param stAcptRslt 明細データ
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private String getStatus(AE0170010Struct stAcptRslt) throws FoundationException, SQLException {
		String strStatus = "";
		
		// [発注残] .“発注状態区分” ＝　「2：指示済み」、かつ [発注残] .“注文取消伝票発行フラグ” ＝　「0：対象外」
		if ("2".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "0".equals(struct.geth_ODR_CANCEL_SLIP_ISS_FLG())) {
			// ステータス（1：受入）
			strStatus = "1";
		}
		/* [発注残] .“発注状態区分” ＝　「9：受入完了」、かつ 
		 * [発注残] .“検査完了フラグ” ＝　「1：完了」、かつ 
		 * [発注残] .“発注時受入検査区分” ＝　「1：受入のみ」の場合
		 *  または 
		 * [発注残] .“発注状態区分” ＝　「9：受入完了」、かつ 
		 * [発注残] .“検査完了フラグ” ＝　「0：未」、かつ 
		 * [発注残] .“発注時受入検査区分” ＝　「2：受入後に検査を行う」の場合  */
		else if ("9".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "1".equals(struct.geth_INSPC_CMPLT_FLG())
				&& "1".equals(struct.geth_ACPT_INSPC_TYP())
				|| "9".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "0".equals(struct.geth_INSPC_CMPLT_FLG())
				&& "2".equals(struct.geth_ACPT_INSPC_TYP())) {
			// ステータス（2：受入完了）
			strStatus = "2";
		}
		/* [発注残] .“発注状態区分” ＝　「9：受入完了」、かつ 
		 * [発注残] .“検査完了フラグ” ＝　「1：完了」、かつ 
		 * [発注残] .“発注時受入検査区分” ＝　「2：受入後に検査を行う」の場合  */
		else if ("9".equals(struct.geth_PUCH_ODR_STS_TYP())
				&& "1".equals(struct.geth_INSPC_CMPLT_FLG())
				&& "2".equals(struct.geth_ACPT_INSPC_TYP())) {
			// ステータス（3：検査完了）
			strStatus = "3";
		}
		
		AE0170010Struct st = new AE0170010Struct();
		st.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // 発注番号
		st.setACPT_NO(stAcptRslt.getACPT_NO()); // 受入回数
		
		// 買掛金トランヘッダのチェック
		if (entity.mcheck_T_DEBT_LEDGER_H_TRN.check(conn, st)) {
			// ステータス（4：買掛計上前）
			strStatus = "4";
		}
		// 買掛金トランヘッダのチェック1
		if (entity.mcheck_T_DEBT_LEDGER_H1.check(conn, st)) {
			// ステータス（5：買掛計上後）
			strStatus = "5";
		}
		// 買掛金トランヘッダのチェック2
		if (entity.mcheck_T_DEBT_LEDGER_H2.check(conn, st)) {
			// ステータス（6：支払締め後）
			strStatus = "6";
		}
		// 買掛金残高明細のチェック
		if (entity.mcheck_T_INSPC_ACPT_IF.check(conn, st)) {
			// ステータス（7：買掛インタフェース済）
			strStatus = "7";
		}
		
		return strStatus;
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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>

		// 読込前に状態を初期化
        setReadStatus(INITIAL);
        if (list == null) {
        	list = new ArrayList();
        } else {
        	list.clear();
        }
        if (listAcptRslt == null) {
        	listAcptRslt = new ArrayList();
        } else {
        	listAcptRslt.clear();
        }
        
		try {
			struct.seth_UPDATE_FLG("0"); // 更新ボタン押下可否フラグ(1：可、0：不可)
			boolean isStatus6Exist = false;
			boolean isStatus7Exist = false;
			
			// =======================================
			// 発注残データの取得
			// =======================================
			
			// 発注残リスト
			List lstRlsdPuchOdr = null;
			AE0170010Struct stRlsdPuchOdr = null;
			
			// 発注残の取得を行う
			lstRlsdPuchOdr = entity.mread_T_RLSD_PUCH_ODR.read(conn, struct);
			// 抽出件数が０件の場合
			if (lstRlsdPuchOdr == null || lstRlsdPuchOdr.size() < 1) {
				setErrorMessage("ZZ06001", false);
				StringBuffer sbMsg = new StringBuffer("T_RLSD_PUCH_ODR.PUCH_ODR_CD:");
				sbMsg.append(struct.getPUCH_ODR_CD());
				setErrorMessage("ZZ01006", sbMsg.toString());
				sbMsg = new StringBuffer("T_RLSD_PUCH_ODR.COMPANY_CD:");
				sbMsg.append(struct.getCOMPANY_CD());
				setErrorMessage("ZZ01006", sbMsg.toString());
				return;
			} else {
				stRlsdPuchOdr = (AE0170010Struct) lstRlsdPuchOdr.get(0);
			}

			// =======================================
			// 受入実績の取得
			// =======================================
			
			List lstAcptRslt = entity.mread_T_ACPT_RSLT.read(conn, struct);

			// =======================================
			// 画面項目の編集
			// =======================================
			
            // コンボボックスデータ用意
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            ComboStruct stUnitCostTyp = controller.getData("UNIT_COST_TYP"); // 単価区分
            ComboStruct stAcptInspcTyp = controller.getData("ACPT_INSPC_TYP"); // 受入検査区分
            ComboStruct stInspcAcptAppTyp = controller.getData("INSPC_ACPT_APP_TYP"); // 検収計上区分
            ComboStruct stStatus = controller.getData("ACPT_RSLT_STS"); // ステータス
            boolean blSysTimeCtrl = entity.mSELECT_TIME_CTRL.check(conn, struct); // システムパラメータ（TIME_CTRL）
            
			// ヘッダ部
			struct.setNON_NO_ITEM_FLG(stRlsdPuchOdr.getNON_NO_ITEM_FLG()); // 備品購入
			struct.setITEM_CD(stRlsdPuchOdr.getITEM_CD()); // 品目番号
			struct.setITEM_NAME(stRlsdPuchOdr.getITEM_NAME()); // 品目名
			struct.setVEND_CD(stRlsdPuchOdr.getVEND_CD()); // 取引先コード
			struct.setVEND_NAME(stRlsdPuchOdr.getVEND_NAME()); // 取引先名
			if (stRlsdPuchOdr.getPUCH_ODR_DLV_DATE() != null && stRlsdPuchOdr.getPUCH_ODR_DLV_DATE().length() >= 16) {
				struct.setPUCH_ODR_DLV_DATE(stRlsdPuchOdr.getPUCH_ODR_DLV_DATE().substring(0, 10)); // 発注納期
				if (blSysTimeCtrl) {
					struct.setPUCH_ODR_DLV_TIME(stRlsdPuchOdr.getPUCH_ODR_DLV_DATE().substring(11, 16)); // 発注納期（時刻）
				}
			}
			struct.setTAX_CD(stRlsdPuchOdr.getTAX_CD()); // 消費税コード
			if (stRlsdPuchOdr.getPUCH_ODR_START_DATE() != null && stRlsdPuchOdr.getPUCH_ODR_START_DATE().length() >= 16) {
				struct.setPUCH_ODR_START_DATE(stRlsdPuchOdr.getPUCH_ODR_START_DATE().substring(0, 10)); // 発注予定日
				if (blSysTimeCtrl) {
					struct.setPUCH_ODR_START_TIME(stRlsdPuchOdr.getPUCH_ODR_START_DATE().substring(11, 16)); // 発注予定日（時刻）
				}
			}
			struct.setPUCH_ODR_QTY(stRlsdPuchOdr.getPUCH_ODR_QTY()); // 発注数
			struct.setSTOCK_UNIT(stRlsdPuchOdr.getSTOCK_UNIT()); // 単位
			struct.setUNIT_COST_TYP(getComboTypeName(stUnitCostTyp, stRlsdPuchOdr.getUNIT_COST_TYP())); // 単価区分
			struct.setJOB_ODR_CD(stRlsdPuchOdr.getJOB_ODR_CD()); // 製番
			struct.setUNIT_COST(stRlsdPuchOdr.getUNIT_COST()); // 単価
			struct.setCUR_UNIT(stRlsdPuchOdr.getCUR_UNIT()); // 通貨単位
			struct.setACPT_INSPC_TYP(getComboTypeName(stAcptInspcTyp, stRlsdPuchOdr.getACPT_INSPC_TYP())); // 受入検査区分
			struct.setPUCH_ODR_AMOUNT(stRlsdPuchOdr.getPUCH_ODR_AMOUNT()); // 発注金額
			struct.setINSPC_ACPT_APP_TYP(getComboTypeName(stInspcAcptAppTyp, stRlsdPuchOdr.getINSPC_ACPT_APP_TYP())); // 検収計上区分
			struct.seth_NET_AMOUNT(stRlsdPuchOdr.getNET_AMOUNT()); // 本体金額
			struct.seth_TAX_AMOUNT_1(stRlsdPuchOdr.getTAX_AMOUNT_1()); // 税額1
			struct.seth_TAX_AMOUNT_2(stRlsdPuchOdr.getTAX_AMOUNT_2()); // 税額2
			struct.seth_TAX_AMOUNT_3(stRlsdPuchOdr.getTAX_AMOUNT_3()); // 税額3
			struct.seth_ROUND_TYP(stRlsdPuchOdr.getROUND_TYP()); // 発注金額まるめ区分
			struct.seth_PUCH_ODR_STS_TYP(stRlsdPuchOdr.getPUCH_ODR_STS_TYP()); // 発注状態区分
			struct.seth_PUCH_ODR_INST_SLIP_ISS_FLG(stRlsdPuchOdr.getPUCH_ODR_INST_SLIP_ISS_FLG()); // 発注伝票発行済みフラグ
			struct.seth_ODR_CANCEL_SLIP_ISS_FLG(stRlsdPuchOdr.getODR_CANCEL_SLIP_ISS_FLG()); // 注文取消伝票発行フラグ
			struct.seth_INSPC_CMPLT_FLG(stRlsdPuchOdr.getINSPC_CMPLT_FLG()); // 検査完了フラグ
			struct.seth_ACPT_INSPC_TYP(stRlsdPuchOdr.getACPT_INSPC_TYP()); // 発注時受入検査区分
			struct.seth_MODIFY_COUNT(stRlsdPuchOdr.getMODIFY_COUNT()); // 更新回数
			struct.seth_EXCH_RATE(stRlsdPuchOdr.getEXCH_RATE()); // 為替レート
			struct.seth_TAX_CD(stRlsdPuchOdr.getTAX_CD()); // 消費税コード
			struct.seth_DECIMAL_FIG(stRlsdPuchOdr.getDECIMAL_FIG()); // 小数桁数
			struct.seth_PUCH_ODR_CD(struct.getPUCH_ODR_CD()); // 発注番号
			
			// 明細部
			// 受入実績データが存在する場合
			if (lstAcptRslt != null || lstAcptRslt.size() > 0) {
				AE0170010Struct stAcptRslt = null;
				AE0170010Struct stNewAcptRslt = null;
				String strStatus = "";
				for (int i = 0; i < lstAcptRslt.size(); i++) {
					stAcptRslt = (AE0170010Struct) lstAcptRslt.get(i);
					stNewAcptRslt = new AE0170010Struct();
					
					strStatus = getStatus(stAcptRslt);
					stNewAcptRslt.setl_STATUS(getComboTypeName(stStatus, strStatus)); //ステータス
					stNewAcptRslt.setl_ACPT_NO(stAcptRslt.getACPT_NO()); // 受入回数
					stNewAcptRslt.setl_ACPT_QTY(stAcptRslt.getACPT_QTY()); // 受入数
					stNewAcptRslt.setl_ACPT_DATE(stAcptRslt.getACPT_DATE()); // 受入日
					stNewAcptRslt.setl_UNIT_COST(stAcptRslt.getUNIT_COST()); // 受入単価
					stNewAcptRslt.setl_UNIT_COST_TYP(getComboTypeName(stUnitCostTyp, stAcptRslt.getUNIT_COST_TYP())); // 単価区分
					stNewAcptRslt.setl_PUCH_ODR_AMOUNT(stAcptRslt.getPUCH_ODR_AMOUNT()); // 受入金額
					stNewAcptRslt.setl_INSPECTED_QTY(stAcptRslt.getINSPECTED_QTY()); // 検査済数
					stNewAcptRslt.setl_ACCEPTED_QTY(stAcptRslt.getACCEPTED_QTY()); // 合格数
					stNewAcptRslt.setl_INSPEC_DATE(stAcptRslt.getINSPEC_DATE()); // 検査日
					stNewAcptRslt.seth_NET_AMOUNT_LIST(stAcptRslt.getNET_AMOUNT()); // 本体金額
					stNewAcptRslt.seth_TAX_AMOUNT_1_LIST(stAcptRslt.getTAX_AMOUNT_1()); // 税額1
					stNewAcptRslt.seth_TAX_AMOUNT_2_LIST(stAcptRslt.getTAX_AMOUNT_2()); // 税額2
					stNewAcptRslt.seth_TAX_AMOUNT_3_LIST(stAcptRslt.getTAX_AMOUNT_3()); // 税額3
					stNewAcptRslt.seth_MODIFY_COUNT_LIST(stAcptRslt.getMODIFY_COUNT()); // 更新回数
					stNewAcptRslt.seth_EXCH_RATE_LIST(stAcptRslt.getEXCH_RATE()); // 為替レート
					
					listAcptRslt.add(stNewAcptRslt);
					
					// ステータスが「6：支払締め後」の明細データは存在する場合
					if (!isStatus6Exist && "6".equals(strStatus)) {
						isStatus6Exist = true;
					}
					// ステータスが「7：買掛インタフェース済」の明細データは存在する場合
					else if (!isStatus7Exist && "7".equals(strStatus)) {
						isStatus7Exist = true;
					}
				}
			}
			
			// =======================================
			// 読込した明細データのチェック
			// =======================================

			if (isStatus6Exist || isStatus7Exist) {
				if (isStatus6Exist) {
					setInfoMessage("AE05067"); // 支払締め済みのため消費税コードを変更できません。
					struct.seth_UPDATE_FLG("0");
				}
				if (isStatus7Exist) {
					setInfoMessage("AE05068"); // 買掛インタフェース済みのため消費税コードを変更できません。
					struct.seth_UPDATE_FLG("0");
				}
			} else {
				struct.seth_UPDATE_FLG("1"); // 更新ボタン押下可否フラグ(1：可、0：不可)
			}

			/*
			 * 明細行の表示件数が最大表示件数を超えた場合
			 * ＜ワーニング> ZZ01119 【表示件数が規定値({0})を超えています。最大表示行数の変更を行って下さい。】
			 */
			if(_maxLine != 0 && _maxLine < lstAcptRslt.size())
			{
				setReadStatus(TOO_MANY);
				setErrorMessage("ZZ01119", String.valueOf(_maxLine));
			} else {
				this.setList(listAcptRslt);
				setReadStatus(NORMAL);
			}
			
		} catch(SQLException e) {
			setReadStatus(ERROR);
			e.printStackTrace();
			setExceptionMsg(e, "ZZ01106");
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlUpdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");
			//{{user_implement_dev:<controlUpdate>

		try {
			int nRet = 0;
			AE0170010Struct st = new AE0170010Struct();
		    String strTaxCdTyp = struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1, struct.getTAX_CD().length()); // 消費税コードの３桁目
			struct.setPUCH_ODR_CD(struct.geth_PUCH_ODR_CD()); // 発注番号
			
			// =======================================
			// 消費税情報の取得
			// =======================================
		    
			AE0170010Struct stTax = null; // 消費税情報
			List lstTax = entity.mget_M_TAX.read(conn, struct);
			// 消費税コードの存在チェック
			if (lstTax == null || lstTax.size() < 1) {
				StringBuffer sbMsg = new StringBuffer("M_TAX.TAX_CD:");
				sbMsg.append(struct.getTAX_CD());
				setErrorMessage("BB00025", false);
				setErrorMessage("ZZ01006", sbMsg.toString());
				return;
			} else {
				stTax = (AE0170010Struct) lstTax.get(0);
			}
			
			// =======================================
			// 発注残の更新
			// =======================================
			
			AE0170010Struct stRlsdPuchOdr = new AE0170010Struct(); // 発注残情報
			// 更新条件を設定
			stRlsdPuchOdr.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // 発注番号
			// 更新内容を設定
			if (isNewTax(struct.getPUCH_ODR_DLV_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
				stRlsdPuchOdr.setTAX_RATE_1(stTax.getNEW_TAX_RATE_1()); // 税率1
				stRlsdPuchOdr.setTAX_RATE_2(stTax.getNEW_TAX_RATE_2()); // 税率2
				stRlsdPuchOdr.setTAX_RATE_3(stTax.getNEW_TAX_RATE_3()); // 税率3
			} else {
				stRlsdPuchOdr.setTAX_RATE_1(stTax.getOLD_TAX_RATE_1()); // 税率1
				stRlsdPuchOdr.setTAX_RATE_2(stTax.getOLD_TAX_RATE_2()); // 税率2
				stRlsdPuchOdr.setTAX_RATE_3(stTax.getOLD_TAX_RATE_3()); // 税率3
			}
			if ("1".equals(strTaxCdTyp)) {
				stRlsdPuchOdr.setNET_AMOUNT(convertNull(struct.geth_NET_AMOUNT())); // 本体金額
				stRlsdPuchOdr.setTAX_AMOUNT_1(
						calculateTax(convertNull(stRlsdPuchOdr.getNET_AMOUNT()),
								stRlsdPuchOdr.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額1
				stRlsdPuchOdr.setTAX_AMOUNT_2(
						calculateTax(convertNull(stRlsdPuchOdr.getNET_AMOUNT()),
								stRlsdPuchOdr.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額2
				stRlsdPuchOdr.setTAX_AMOUNT_3(
						calculateTax(convertNull(stRlsdPuchOdr.getNET_AMOUNT()),
								stRlsdPuchOdr.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額3
				// 本体金額＋税額1＋税額2＋税額3
				String strAmountIncludeTax = stRlsdPuchOdr.getNET_AMOUNT();
				strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stRlsdPuchOdr.getTAX_AMOUNT_1());
				strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stRlsdPuchOdr.getTAX_AMOUNT_2());
				strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stRlsdPuchOdr.getTAX_AMOUNT_3());
				stRlsdPuchOdr.setAMOUNT_INCLUDE_TAX(strAmountIncludeTax); // 税込金額
			} else if ("5".equals(strTaxCdTyp)) {
				// 変更前の税抜額 = 本体金額 －税額1 －税額2 －税額3
				String strOldNetAmound = convertNull(struct.geth_NET_AMOUNT());
				stRlsdPuchOdr.setTAX_AMOUNT_1(
						calculateTaxIn(strOldNetAmound,
								stRlsdPuchOdr.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額1
				stRlsdPuchOdr.setTAX_AMOUNT_2(
						calculateTaxIn(strOldNetAmound,
								stRlsdPuchOdr.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額2
				stRlsdPuchOdr.setTAX_AMOUNT_3(
						calculateTaxIn(strOldNetAmound,
								stRlsdPuchOdr.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額3
				//Mod Start 20140207 liang-l
				// 本体金額＋税額1＋税額2＋税額3
				//String strNetAmound = strOldNetAmound;
				//strNetAmound = Calculate.add(strNetAmound, stRlsdPuchOdr.getTAX_AMOUNT_1());
				//strNetAmound = Calculate.add(strNetAmound, stRlsdPuchOdr.getTAX_AMOUNT_2());
				//strNetAmound = Calculate.add(strNetAmound, stRlsdPuchOdr.getTAX_AMOUNT_3());
				//stRlsdPuchOdr.setNET_AMOUNT(getRound(strNetAmound, struct.geth_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // 本体金額
				stRlsdPuchOdr.setNET_AMOUNT(struct.geth_NET_AMOUNT()); // 本体金額
				//Mod End   20140207 liang-l
				stRlsdPuchOdr.setAMOUNT_INCLUDE_TAX(stRlsdPuchOdr.getNET_AMOUNT()); // 税込金額
			} else {
				stRlsdPuchOdr.setTAX_AMOUNT_1("0"); // 税額1
				stRlsdPuchOdr.setTAX_AMOUNT_2("0"); // 税額2
				stRlsdPuchOdr.setTAX_AMOUNT_3("0"); // 税額3
				stRlsdPuchOdr.setNET_AMOUNT(struct.geth_NET_AMOUNT()); // 本体金額
				stRlsdPuchOdr.setAMOUNT_INCLUDE_TAX(stRlsdPuchOdr.getNET_AMOUNT()); // 税込金額
			}
			stRlsdPuchOdr.setHOME_CUR_AMOUNT(getRound(
					Calculate.multiply(stRlsdPuchOdr.getAMOUNT_INCLUDE_TAX(), struct.geth_EXCH_RATE()),
					struct.getHOME_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // 邦貨金額
			stRlsdPuchOdr.setTAX_CD(struct.getTAX_CD()); // 消費税コード
			stRlsdPuchOdr.setTAX_ROUND_TYP(stTax.getROUND_TYP()); // 税端数区分
			stRlsdPuchOdr.setsUser_ID(this.getsysUSER_CD()); // 更新者

			// 更新回数取得条件を設定
			st.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // 発注番号
			List lstPuchOdrModifyCount = entity.mgetModifyCount_T_RLSD_PUCH_ODR.read(conn, st);
			// 排他チェック
			if (lstPuchOdrModifyCount == null || lstPuchOdrModifyCount.size() < 1) {
				setErrorMessage("KQ00055", false);
				conn.rollback();
				return;
			} else if (!struct.geth_MODIFY_COUNT().equals(((AE0170010Struct) lstPuchOdrModifyCount.get(0)).getMODIFY_COUNT())) {
				setErrorMessage("KQ00055", false);
				conn.rollback();
				return;
			}
			
			// 発注残の更新
			nRet = entity.mupdate_T_RLSD_PUCH_ODR.update(conn, stRlsdPuchOdr);
			
			// =======================================
			// 受入実績の更新
			// =======================================
			
			if (listAcptRslt == null || listAcptRslt.size() < 1) {
				return;
			}

			String strSysDateTime = readSystemDateTime(); // システム日時
			
			AE0170010Struct stAcptRsld = null;
			for (int i = 0; i < listAcptRslt.size(); i++) {
				stAcptRsld = (AE0170010Struct) listAcptRslt.get(i);

				// 更新条件を設定
				stAcptRsld.setPUCH_ODR_CD(struct.getPUCH_ODR_CD()); // 発注番号
				stAcptRsld.setACPT_NO(stAcptRsld.getl_ACPT_NO()); // 受入回数
				// 更新内容を設定
				if (isNewTax(stAcptRsld.getl_ACPT_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
					stAcptRsld.setTAX_RATE_1(stTax.getNEW_TAX_RATE_1()); // 税率1
					stAcptRsld.setTAX_RATE_2(stTax.getNEW_TAX_RATE_2()); // 税率2
					stAcptRsld.setTAX_RATE_3(stTax.getNEW_TAX_RATE_3()); // 税率3
				} else {
					stAcptRsld.setTAX_RATE_1(stTax.getOLD_TAX_RATE_1()); // 税率1
					stAcptRsld.setTAX_RATE_2(stTax.getOLD_TAX_RATE_2()); // 税率2
					stAcptRsld.setTAX_RATE_3(stTax.getOLD_TAX_RATE_3()); // 税率3
				}
				if ("1".equals(strTaxCdTyp)) {
					stAcptRsld.setNET_AMOUNT(stAcptRsld.geth_NET_AMOUNT_LIST()); // 本体金額
					stAcptRsld.setTAX_AMOUNT_1(
							calculateTax(convertNull(stAcptRsld.getNET_AMOUNT()),
									stAcptRsld.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額1
					stAcptRsld.setTAX_AMOUNT_2(
							calculateTax(convertNull(stAcptRsld.getNET_AMOUNT()),
									stAcptRsld.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額2
					stAcptRsld.setTAX_AMOUNT_3(
							calculateTax(convertNull(stAcptRsld.getNET_AMOUNT()),
									stAcptRsld.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額3
					// 本体金額＋税額1＋税額2＋税額3
					String strAmountIncludeTax = stAcptRsld.getNET_AMOUNT();
					strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stAcptRsld.getTAX_AMOUNT_1());
					strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stAcptRsld.getTAX_AMOUNT_2());
					strAmountIncludeTax = Calculate.add(strAmountIncludeTax, stAcptRsld.getTAX_AMOUNT_3());
					stAcptRsld.setAMOUNT_INCLUDE_TAX(strAmountIncludeTax); // 税込金額
				} else if ("5".equals(strTaxCdTyp)) {
					// 変更前の税抜額 = 本体金額 －税額1 －税額2 －税額3
					String strOldNetAmound = convertNull(stAcptRsld.geth_NET_AMOUNT_LIST());
					stAcptRsld.setTAX_AMOUNT_1(
							calculateTaxIn(strOldNetAmound,
									stAcptRsld.getTAX_RATE_1(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額1
					stAcptRsld.setTAX_AMOUNT_2(
							calculateTaxIn(strOldNetAmound,
									stAcptRsld.getTAX_RATE_2(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額2
					stAcptRsld.setTAX_AMOUNT_3(
							calculateTaxIn(strOldNetAmound,
									stAcptRsld.getTAX_RATE_3(), struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税額3
					//Mod Start 20140207 liang-l
					// 本体金額＋税額1＋税額2＋税額3
					//String strNetAmound = strOldNetAmound;
					//strNetAmound = Calculate.add(strNetAmound, stAcptRsld.getTAX_AMOUNT_1());
					//strNetAmound = Calculate.add(strNetAmound, stAcptRsld.getTAX_AMOUNT_2());
					//strNetAmound = Calculate.add(strNetAmound, stAcptRsld.getTAX_AMOUNT_3());
					//stAcptRsld.setNET_AMOUNT(getRound(strNetAmound, struct.geth_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // 本体金額
					stAcptRsld.setNET_AMOUNT(stAcptRsld.geth_NET_AMOUNT_LIST()); // 本体金額
					//Mod End   20140207 liang-l
					stAcptRsld.setAMOUNT_INCLUDE_TAX(stAcptRsld.getNET_AMOUNT()); // 税込金額
				} else {
					stAcptRsld.setNET_AMOUNT(stAcptRsld.geth_NET_AMOUNT_LIST()); // 本体金額
					stAcptRsld.setTAX_AMOUNT_1("0"); // 税額1
					stAcptRsld.setTAX_AMOUNT_2("0"); // 税額2
					stAcptRsld.setTAX_AMOUNT_3("0"); // 税額3
					stAcptRsld.setAMOUNT_INCLUDE_TAX(stAcptRsld.getNET_AMOUNT()); // 税込金額
				}
				stAcptRsld.setHOME_CUR_AMOUNT(getRound(
						Calculate.multiply(stAcptRsld.getAMOUNT_INCLUDE_TAX(), stAcptRsld.geth_EXCH_RATE_LIST()),
						struct.getHOME_DECIMAL_FIG(), struct.geth_ROUND_TYP())); // 邦貨金額
				stAcptRsld.setTAX_CD(struct.getTAX_CD()); // 消費税コード
				stAcptRsld.setTAX_ROUND_TYP(stTax.getROUND_TYP()); // 税端数区分
				stAcptRsld.setsUser_ID(this.getsysUSER_CD()); // 更新者

				// 更新回数取得条件を設定
				st.setACPT_NO(stAcptRsld.getl_ACPT_NO()); // 受入回数
				List lstAcptRsldModifyCount = entity.mgetModifyCount_T_ACPT_RSLT.read(conn, st);
				// 排他チェック
				if (lstAcptRsldModifyCount == null || lstAcptRsldModifyCount.size() < 1) {
					setErrorMessage("KQ00055", false);
					conn.rollback();
					return;
				} else if (!stAcptRsld.geth_MODIFY_COUNT_LIST().equals(((AE0170010Struct) lstAcptRsldModifyCount.get(0)).getMODIFY_COUNT())) {
					setErrorMessage("KQ00055", false);
					conn.rollback();
					return;
				}
				
				// 受入実績の更新
				nRet = entity.mupdate_T_ACPT_RSLT.update(conn, stAcptRsld);
								
				// =======================================
				// 最大の検収履歴の取得
				// =======================================
				String strOldInspcAcptNo = null; // 検収番号(旧)
				String strRedInspcAcptNo = null; // 検収番号(赤)
				String strBlackInspcAcptNo = null; // 検収番号(黒)
				
				AE0170010Struct stPastInspcAcpt = null; // 最大の検収履歴
				// 最大の検収履歴を取得
				List lstMaxPastInspcAcpt = entity.mT_PAST_INSPC_ACPT.read(conn, st);
				if (lstMaxPastInspcAcpt == null || lstMaxPastInspcAcpt.size() < 1) {
					continue;
				} else {
					stPastInspcAcpt = (AE0170010Struct) lstMaxPastInspcAcpt.get(0);
					strOldInspcAcptNo = stPastInspcAcpt.getINSPC_ACPT_NO();
					// [検収履歴].“訂正区分”　＝　1（赤）の場合、次のループ処理へ
					if ("1".equals(stPastInspcAcpt.getCRCT_TYP())) {
						continue;
					}
				}
				stPastInspcAcpt.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
				
				// =======================================
				// 検収履歴］の登録
				// =======================================
				
				// 赤レコードを編集
				stPastInspcAcpt.setINSPC_ACPT_NO(Calculate.add(convertNull(stPastInspcAcpt.getINSPC_ACPT_NO()), "1")); // 検収番号
				stPastInspcAcpt.setCRCT_TYP("1"); // 訂正区分(1：赤)
				stPastInspcAcpt.setPROCESSING_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getPROCESSING_COST()))); // 加工費
				stPastInspcAcpt.setMATERIAL_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getMATERIAL_COST()))); // 材料費
				stPastInspcAcpt.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stPastInspcAcpt.getOTHER_OVERHEADS()))); // その他経費
				stPastInspcAcpt.setACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getACPT_QTY()))); // 受入数
				stPastInspcAcpt.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_QTY()))); // 検収数
				stPastInspcAcpt.setSAVING_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getSAVING_AMOUNT()))); // 値引金額
				stPastInspcAcpt.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_AMOUNT()))); // 検収金額
				
				// 検収履歴の登録（赤レコード）
				nRet = entity.mT_PAST_INSPC_ACPT.create(conn, stPastInspcAcpt);
				strRedInspcAcptNo = stPastInspcAcpt.getINSPC_ACPT_NO();
				
				// 黒レコードを編集
				stPastInspcAcpt.setINSPC_ACPT_NO(Calculate.add(convertNull(stPastInspcAcpt.getINSPC_ACPT_NO()), "1")); // 検収番号
				stPastInspcAcpt.setCRCT_TYP("2"); // 訂正区分(2：黒)
				stPastInspcAcpt.setCRCT_NO(Calculate.add(convertNull(stPastInspcAcpt.getCRCT_NO()), "1")); // 訂正回数
				stPastInspcAcpt.setPROCESSING_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getPROCESSING_COST()))); // 加工費
				stPastInspcAcpt.setMATERIAL_COST(Calculate.subtract("0", convertNull(stPastInspcAcpt.getMATERIAL_COST()))); // 材料費
				stPastInspcAcpt.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stPastInspcAcpt.getOTHER_OVERHEADS()))); // その他経費
				stPastInspcAcpt.setACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getACPT_QTY()))); // 受入数
				stPastInspcAcpt.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_QTY()))); // 検収数
				stPastInspcAcpt.setSAVING_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getSAVING_AMOUNT()))); // 値引金額
				stPastInspcAcpt.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stPastInspcAcpt.getINSPC_ACPT_AMOUNT()))); // 検収金額
				
				// 検収履歴の登録（黒レコード）
				nRet = entity.mT_PAST_INSPC_ACPT.create(conn, stPastInspcAcpt);
				strBlackInspcAcptNo = stPastInspcAcpt.getINSPC_ACPT_NO();
				
				// =======================================
				// 検収実績情報インタフェースの取得
				// =======================================

				AE0170010Struct stInspcAcptIf = null; // 検収実績情報インタフェース
				// 取得条件を設定
				st.setINSPC_ACPT_NO(strOldInspcAcptNo); // 検収番号
				// 検収実績情報インタフェースの取得
				List lstInspcAcptIf = entity.mT_INSPC_ACPT_IF.read(conn, st);
				if (lstInspcAcptIf != null && lstInspcAcptIf.size() == 1) {
					stInspcAcptIf = (AE0170010Struct) lstInspcAcptIf.get(0);
					stInspcAcptIf.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
				
					// =======================================
					// 検収実績情報インタフェースの登録
					// =======================================
	
					// 赤レコードを編集
					stInspcAcptIf.setINSPC_ACPT_NO(Calculate.add(convertNull(stInspcAcptIf.getINSPC_ACPT_NO()), "1")); // 検収番号
					stInspcAcptIf.setCRCT_TYP("1"); // 訂正区分(1：赤)
					stInspcAcptIf.setPROCESSING_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getPROCESSING_COST()))); // 加工費
					stInspcAcptIf.setMATERIAL_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getMATERIAL_COST()))); // 材料費
					stInspcAcptIf.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stInspcAcptIf.getOTHER_OVERHEADS()))); // その他経費
					stInspcAcptIf.setACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getACPT_QTY()))); // 受入数
					stInspcAcptIf.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_QTY()))); // 検収数
					stInspcAcptIf.setDISC_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getDISC_AMOUNT()))); // 値引金額
					stInspcAcptIf.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_AMOUNT()))); // 検収金額

					// 検収実績情報インタフェースの登録（赤レコード）
					nRet = entity.mT_INSPC_ACPT_IF.create(conn, stInspcAcptIf);
	
					// 黒レコードを編集
					stInspcAcptIf.setINSPC_ACPT_NO(Calculate.add(convertNull(stInspcAcptIf.getINSPC_ACPT_NO()), "1")); // 検収番号
					stInspcAcptIf.setCRCT_TYP("2"); // 訂正区分(2：黒)
					stInspcAcptIf.setPROCESSING_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getPROCESSING_COST()))); // 加工費
					stInspcAcptIf.setMATERIAL_COST(Calculate.subtract("0", convertNull(stInspcAcptIf.getMATERIAL_COST()))); // 材料費
					stInspcAcptIf.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stInspcAcptIf.getOTHER_OVERHEADS()))); // その他経費
					stInspcAcptIf.setACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getACPT_QTY()))); // 受入数
					stInspcAcptIf.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_QTY()))); // 検収数
					stInspcAcptIf.setDISC_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getDISC_AMOUNT()))); // 値引金額
					stInspcAcptIf.setINSPC_ACPT_AMOUNT(Calculate.subtract("0", convertNull(stInspcAcptIf.getINSPC_ACPT_AMOUNT()))); // 検収金額

					// 検収実績情報インタフェースの登録（黒レコード）
					nRet = entity.mT_INSPC_ACPT_IF.create(conn, stInspcAcptIf);
				}

				// =======================================
				// 「買掛システム導入済みか(C*)」の判断
				// =======================================
				
				st.setOPTION_ID(AP_SYSTEM); // インストールオプション
				if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, st)) {
					continue;
				}
				
				String strOwnCurCd = ""; // 邦貨コード
				String strThisMonth = ""; // 現在の計上年月度
				String strThisRecordingDate = ""; // 現在の計上開始年月日
				String strMonth = ""; // 年月度
				String strRecordingDate = ""; // 計上日
				// [買掛システム管理].“邦貨コード”を取得
				List lstSysDebtCtrl = entity.mget_SYS_DEBT_CTRL.read(conn, struct);
				if (lstSysDebtCtrl == null || lstSysDebtCtrl.size() < 1) {
					setErrorMessage("CZ00027", false);
					conn.rollback();
					return;
				}
				strOwnCurCd = ((AE0170010Struct) lstSysDebtCtrl.get(0)).getOWN_CUR_CD(); // 邦貨コード
				strThisMonth = ((AE0170010Struct) lstSysDebtCtrl.get(0)).getTHIS_MONTH(); // 現在の計上年月度
				strThisRecordingDate = getRecordingMonthOrDate(strThisMonth, true); // 現在の計上開始年月日
				strMonth = strThisMonth; // 年月度
				strRecordingDate = strThisRecordingDate; // 計上日
				
				// =======================================
				// 買掛金トラン明細の取得
				// =======================================
				
				// 買掛金トラン明細の取得
				List lstDebtLedgerTrn = entity.mT_DEBT_LEDGER_TRN.read(conn, st); //  買掛金トラン明細
				if (lstDebtLedgerTrn != null && lstDebtLedgerTrn.size() > 0) {
					
					// =======================================
					// 買掛金トラン明細の更新
					// =======================================
					
					AE0170010Struct stDebtLedgerTrn = null; // 買掛金トラン明細
					for (int j = 0; j < lstDebtLedgerTrn.size(); j++) {
						stDebtLedgerTrn = (AE0170010Struct) lstDebtLedgerTrn.get(j);
						
						stDebtLedgerTrn.setTAX_CD(struct.getTAX_CD()); // 消費税コード
						stDebtLedgerTrn.setTAX_TYP(strTaxCdTyp); // 消費税区分
						
						//Mod Start 20140207 liang-l
						//消費税コード３桁目が1（外税）の場合c
						if ("1".equals(strTaxCdTyp)){
							// [買掛金トラン明細].“伝票日付”　>=　[消費税区分].“新消費税コード開始日”　の場合
							if (isNewTax(stDebtLedgerTrn.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
								//stDebtLedgerTrn.setTAX_AMOUNT(
								//		calculateTax(stDebtLedgerTrn.getNET_AMOUNT(), stTax.getNEW_TAX_RATE_1(),
								//				struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTax(stDebtLedgerTrn.getAMOUNT(), stTax.getNEW_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額
							} else {
								//stDebtLedgerTrn.setTAX_AMOUNT(
								//		calculateTax(stDebtLedgerTrn.getNET_AMOUNT(), stTax.getOLD_TAX_RATE_1(),
								//				struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTax(stDebtLedgerTrn.getAMOUNT(), stTax.getOLD_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額
							}
							//税抜金額 =[買掛金トラン明細].検収金額
							stDebtLedgerTrn.setNET_AMOUNT(stDebtLedgerTrn.getAMOUNT());
						}
						//消費税コード３桁目が５（内税）の場合、[買掛金トラン明細].検収金額/(1+(税率１)/100)×税率１/100
						else if("5".equals(strTaxCdTyp)){
							// [買掛金トラン明細].“伝票日付”　>=　[消費税区分].“新消費税コード開始日”　の場合
							if (isNewTax(stDebtLedgerTrn.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTaxIn(stDebtLedgerTrn.getAMOUNT(), stTax.getNEW_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額
							} else {
								stDebtLedgerTrn.setTAX_AMOUNT(
										calculateTaxIn(stDebtLedgerTrn.getAMOUNT(), stTax.getOLD_TAX_RATE_1(),
												struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額
							}
							//税抜金額 =[買掛金トラン明細].検収金額－消費税額
							stDebtLedgerTrn.setNET_AMOUNT(Calculate.subtract(convertNull(stDebtLedgerTrn.getAMOUNT()), stDebtLedgerTrn.getTAX_AMOUNT()));
						}
						//消費税コード３桁目が上記以外の場合、0
						else{
							stDebtLedgerTrn.setTAX_AMOUNT("0"); // 消費税額
							stDebtLedgerTrn.setNET_AMOUNT(stDebtLedgerTrn.getAMOUNT()); //税抜金額 =[買掛金トラン明細].検収金額
						}
						//Mod End   20140207 liang-l
						
						// ([買掛金トラン明細].“税抜金額”＋消費税額)
						stDebtLedgerTrn.setGROSS_AMOUNT(
								Calculate.add(convertNull(stDebtLedgerTrn.getNET_AMOUNT()), stDebtLedgerTrn.getTAX_AMOUNT())); // 税込金額
						
						// 邦貨の場合
						if (strOwnCurCd.equals(stDebtLedgerTrn.getCUR_CD())) {
							stDebtLedgerTrn.setTAX_AMOUNT_YEN(stDebtLedgerTrn.getTAX_AMOUNT()); // 消費税額（邦貨換算）
							stDebtLedgerTrn.setGROSS_AMOUNT_YEN(stDebtLedgerTrn.getGROSS_AMOUNT()); // 税込金額（邦貨換算）
							//Add Start 20140207 liang-l
							stDebtLedgerTrn.setNET_AMOUNT_YEN(stDebtLedgerTrn.getNET_AMOUNT());//c（邦貨換算）=税抜金額
							//Add End   20140207 liang-l
						} else {
							// 消費税額（邦貨換算） = 消費税額×上記で取得した[買掛金トランヘッダ].“為替レート”
							stDebtLedgerTrn.setTAX_AMOUNT_YEN(
									getRound(Calculate.multiply(stDebtLedgerTrn.getTAX_AMOUNT(),
											getExchRate(stDebtLedgerTrn.getCUR_CD(), stDebtLedgerTrn.getEXCH_TYP(), stDebtLedgerTrn.getINSPC_ACPT_DATE())),
											struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額（邦貨換算）
							//Add Start 20140207 liang-l
							stDebtLedgerTrn.setNET_AMOUNT_YEN(
									getRound(Calculate.multiply(stDebtLedgerTrn.getNET_AMOUNT(),
											getExchRate(stDebtLedgerTrn.getCUR_CD(), stDebtLedgerTrn.getEXCH_TYP(), stDebtLedgerTrn.getINSPC_ACPT_DATE())),
											struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税抜金額（邦貨換算）=税抜金額×為替レート
							//Add End   20140207 liang-l
							stDebtLedgerTrn.setGROSS_AMOUNT_YEN(
									Calculate.add(convertNull(stDebtLedgerTrn.getNET_AMOUNT_YEN()), stDebtLedgerTrn.getTAX_AMOUNT_YEN())); // 税込金額（邦貨換算）
						}
						stDebtLedgerTrn.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
						
						// 買掛金トラン明細の更新を行う
						nRet = entity.mT_DEBT_LEDGER_TRN.update(conn, stDebtLedgerTrn);
					}
					
					// =======================================
					// 買掛金トランヘッダの取得
					// =======================================
					
					List lstDebtLegerHTrn = entity.mT_DEBT_LEDGER_H_TRN.read(conn, st);
					if (lstDebtLegerHTrn != null && lstDebtLegerHTrn.size() > 0) {
						
						// =======================================
						// 買掛金トランヘッダの更新
						// =======================================

						AE0170010Struct stDebtLegerHTrn = null; // 買掛金トランヘッダ
						for (int j = 0; j < lstDebtLegerHTrn.size(); j++) {
							stDebtLegerHTrn = (AE0170010Struct) lstDebtLegerHTrn.get(j);
							
							stDebtLegerHTrn.setINSPC_ACPT_NO(strBlackInspcAcptNo); // 検収番号
							stDebtLegerHTrn.setTAX_CD(struct.getTAX_CD()); // 消費税コード
							stDebtLegerHTrn.setTAX_TOTAL(stDebtLegerHTrn.getSUM_TAX_AMOUNT()); // 消費税額合計
							stDebtLegerHTrn.setGROSS_TOTAL(stDebtLegerHTrn.getSUM_GROSS_AMOUNT()); // 税込金額合計
							stDebtLegerHTrn.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
							//Add End   20140207 liang-l
							stDebtLegerHTrn.setNET_TOTAL(stDebtLegerHTrn.getSUM_NET_AMOUNT()); // 税抜金額合計
							//Add End   20140207 liang-l
							// 買掛金トランヘッダの更新を行う
							nRet = entity.mT_DEBT_LEDGER_H_TRN.update(conn, stDebtLegerHTrn);
						}
					}
					
					// =======================================
					// 検収実績情報インタフェースの削除
					// =======================================
					
					// 赤データの削除
					st.setINSPC_ACPT_NO(strRedInspcAcptNo); // 赤データの検収番号
					nRet = entity.mT_INSPC_ACPT_IF.delete(conn, st);
					// 黒データの削除
					st.setINSPC_ACPT_NO(strBlackInspcAcptNo); // 黒データの検収番号
					nRet = entity.mT_INSPC_ACPT_IF.delete(conn, st);
					
				} else {
					
					// =======================================
					// 買掛金元帳明細の存在チェック
					// =======================================
					
					// 取得条件を設定
					st.setINSPC_ACPT_NO(strOldInspcAcptNo); // 検収番号
					// 買掛金元帳明細の取得を行う
					List lstDebtLegerKey = entity.mread_T_DEBT_LEDGER.read(conn, st);
					if (lstDebtLegerKey == null || lstDebtLegerKey.size() == 0) {
						continue;
					}

					String strRedSlipCd = ""; // 伝票番号(赤)
					String strBlackSlipCd = ""; // 伝票番号(黒)
					boolean isCreateDebtBalance = false; // 買掛金残高登録フラグ
					String strTaxAmountTotal = "0"; // 消費税額合計
					String strGrossAmountTotal = "0"; // 税込金額合計
					//Add Start 20140207 liang-l
					String strNetTotal = "0"; // 税抜金額合計
					//Add End   20140207 liang-l

					AE0170010Struct stDebtLegerKey = null; // 買掛金元帳キー
					AE0170010Struct stDebtLeger = null; // 買掛金元帳明細
					AE0170010Struct stDebtLegerH = null; // 買掛金元帳ヘッダ
					// 買掛金元帳ヘッダリスト
					List lstDebtLegerH = null;
					// 買掛金元帳明細リスト
					List lstDebtLeger = null;
					for (int j = 0; j < lstDebtLegerKey.size(); j++) {
						stDebtLegerKey = (AE0170010Struct) lstDebtLegerKey.get(j);
						
						// =======================================
						// 買掛金元帳ヘッダの取得
						// =======================================

						// 伝票番号を採番する
						strRedSlipCd = getNewSlipCd(stDebtLegerKey.getSLIP_TYP(), strSysDateTime); // 伝票番号(赤)
						strBlackSlipCd = getNewSlipCd(stDebtLegerKey.getSLIP_TYP(), strSysDateTime); // 伝票番号(黒)
						// 取得条件を設定
						st.setCOMPANY_CD(stDebtLegerKey.getCOMPANY_CD()); // 会社コード
						st.setSLIP_TYP(stDebtLegerKey.getSLIP_TYP()); // 伝票種類
						st.setSLIP_CTRL_GRP(stDebtLegerKey.getSLIP_CTRL_GRP()); // 伝票管理グループ
						st.setSLIP_DATE(stDebtLegerKey.getSLIP_DATE()); // 伝票日付
						st.setSLIP_CD(stDebtLegerKey.getSLIP_CD()); // 伝票番号
						// 買掛金元帳ヘッダの取得を行う
						lstDebtLegerH = entity.mT_DEBT_LEDGER_H.read(conn, st);
						if (lstDebtLegerH != null && lstDebtLegerH.size() == 1) {
							stDebtLegerH = (AE0170010Struct) lstDebtLegerH.get(0);
							stDebtLegerH.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
						}
						
						// =======================================
						// 買掛金元帳明細の取得
						// =======================================
						
						// 買掛金元帳明細の取得を行う
						lstDebtLeger = entity.mT_DEBT_LEDGER.read(conn, st);
						
						// =======================================
						// 買掛金元帳ヘッダの登録(赤データ)
						// =======================================
						
						if (stDebtLegerH != null) {
							
							// 赤データの編集
							stDebtLegerH.setSLIP_CD(strRedSlipCd); // 伝票番号
							stDebtLegerH.setINSPC_ACPT_CRCT_TYP("1"); // 訂正区分(赤)
							stDebtLegerH.setINSPC_ACPT_NO(strRedInspcAcptNo); // 検収番号
							stDebtLegerH.setNET_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getNET_TOTAL()))); // 税抜金額合計
							stDebtLegerH.setTAX_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getTAX_TOTAL()))); // 消費税額合計
							stDebtLegerH.setGROSS_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getGROSS_TOTAL()))); // 税込金額合計
							//Add Start 20140207 liang-l
							stDebtLegerH.setRECORDING_PROC_CD(this.getsysUSER_CD());//計上処理実行者コード
							//Add End   20140207 liang-l
							
							// 買掛金元帳ヘッダの登録（赤データ）
							nRet = entity.mT_DEBT_LEDGER_H.create(conn, stDebtLegerH);
						}
					
						// =======================================
						// 残高管理フラグのチェック
						// =======================================
						
						st.setVEND_CD(stDebtLegerH.getPAYEE_CD()); // 取引先コード
						
						// 残高管理フラグのチェック
						if (entity.mcheck_T_DEBT_BALANCE.check(conn, st)) {
							isCreateDebtBalance = true;
						} else {
							isCreateDebtBalance = false;
						}
					
						// =======================================
						// 買掛金元帳明細の登録(赤データ)
						// =======================================
						
						if (lstDebtLeger != null && lstDebtLeger.size() > 0) {
							for (int k = 0; k < lstDebtLeger.size(); k++) {
								stDebtLeger = (AE0170010Struct) lstDebtLeger.get(k);
								stDebtLeger.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
								
								// 赤データの編集
								stDebtLeger.setSLIP_CD(strRedSlipCd); // 伝票番号
								stDebtLeger.setPROCESSING_COST(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST()))); // 加工費
								stDebtLeger.setMATERIAL_COST(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST()))); // 材料費
								stDebtLeger.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS()))); // その他経費
								stDebtLeger.setACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getACPT_QTY()))); // 受入数
								stDebtLeger.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getINSPC_ACPT_QTY()))); // 検収数
								stDebtLeger.setAMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getAMOUNT()))); // 検収金額
								stDebtLeger.setNET_AMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getNET_AMOUNT()))); // 税抜金額
								stDebtLeger.setTAX_AMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getTAX_AMOUNT()))); // 消費税額
								stDebtLeger.setGROSS_AMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getGROSS_AMOUNT()))); // 税込金額
								stDebtLeger.setPROCESSING_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST_YEN()))); // 加工費(邦貨換算)
								stDebtLeger.setMATERIAL_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST_YEN()))); // 材料費(邦貨換算)
								stDebtLeger.setOTHER_OVERHEADS_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS_YEN()))); // その他経費(邦貨換算)
								stDebtLeger.setNET_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getNET_AMOUNT_YEN()))); // 税抜金額(邦貨換算)
								stDebtLeger.setTAX_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getTAX_AMOUNT_YEN()))); // 消費税額（邦貨換算）
								stDebtLeger.setGROSS_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getGROSS_AMOUNT_YEN()))); // 税込金額（邦貨換算）
								
								// 買掛金元帳明細の登録（赤データ）
								nRet = entity.mT_DEBT_LEDGER.create(conn, stDebtLeger);

								// =======================================
								// 買掛金残高明細の登録(赤データ)
								// =======================================
								
								// 計上年月度算出
								String strInspcAcptDate = stDebtLegerH.getINSPC_ACPT_DATE();
								if (strInspcAcptDate != null && strInspcAcptDate.length() > 10) {
									strInspcAcptDate = strInspcAcptDate.substring(0, 10);
								}
								if (DateTool.compareYMD(strInspcAcptDate, strThisRecordingDate) < 0) {
									strRecordingDate = strThisRecordingDate; // 計上日
									strMonth = strThisMonth; // 年月度
								} else {
									strRecordingDate = strInspcAcptDate; // 計上日
									strMonth = getRecordingMonthOrDate(strInspcAcptDate, false); // 年月度
								}
								
								// 買掛金残高明細登録用データの設定
								stDebtLeger.setCOMPANY_CD(stDebtLegerH.getCOMPANY_CD()); // 会社コード
								stDebtLeger.setINSPC_ACPT_CRCT_TYP(stDebtLegerH.getINSPC_ACPT_CRCT_TYP()); // 訂正区分
								stDebtLeger.setORGN_SLIP_CTRL_GRP(stDebtLegerH.getORGN_SLIP_CTRL_GRP()); // 元伝票管理グループ
								stDebtLeger.setORGN_SLIP_CD(stDebtLegerH.getORGN_SLIP_CD()); // 元伝票番号
								stDebtLeger.setORGN_SLIP_DATE(stDebtLegerH.getORGN_SLIP_DATE()); // 元伝票日付
								stDebtLeger.setSLIP_TRN_CD(stDebtLegerH.getSLIP_TRN_CD()); // 伝票区分
								stDebtLeger.setBALANCE_CLASS_CD(stDebtLegerH.getBALANCE_CLASS_CD()); // 残高分類コード
								stDebtLeger.setINSPC_ACPT_DATE(stDebtLegerH.getINSPC_ACPT_DATE()); // 検収日
								stDebtLeger.setRECORDING_DATE(strRecordingDate); // 計上日
								stDebtLeger.setMONTH(strMonth); // 年月度
								stDebtLeger.setCUR_CD(stDebtLegerH.getCUR_CD()); // 通貨コード
								stDebtLeger.setPAYEE_CD(stDebtLegerH.getPAYEE_CD()); // 支払先コード
								stDebtLeger.setDATA_TYP("10"); // データ種別 “10”（計上）
								stDebtLeger.setVEND_CD(stDebtLegerH.getVEND_CD()); // 取引先コード
								stDebtLeger.setEXPL_TYP(stDebtLegerH.getEXPL_TYP()); // 摘要区分
								stDebtLeger.setEXPL_CD(stDebtLegerH.getEXPL_CD()); // 摘要コード
								stDebtLeger.setEXPL_NAME(stDebtLegerH.getEXPL_NAME()); // 摘要名
								stDebtLeger.setPAY_CYCLE_TYP(stDebtLegerH.getPAY_CYCLE_TYP()); // 支払サイクル
								stDebtLeger.setDEADLINE_DATE(stDebtLegerH.getDEADLINE_DATE()); // 支払締日
								stDebtLeger.setPAY_SCH_DATE(stDebtLegerH.getPAY_SCH_DATE()); // 支払予定日
								stDebtLeger.setEXCH_TYP(stDebtLegerH.getEXCH_TYP()); // 為替種別
								stDebtLeger.setEXCH_RSRV_CD(stDebtLegerH.getEXCH_RSRV_CD()); // 為替予約コード
								stDebtLeger.setEXCH_DATE(stDebtLegerH.getEXCH_DATE()); // 為替日付
								stDebtLeger.setEXCH_RATE(stDebtLegerH.getEXCH_RATE()); // 為替レート
								stDebtLeger.setSTATUS(stDebtLegerH.getSTATUS()); // 状態区分
								stDebtLeger.setGL_IF_OUT_FLG("0"); // 一般会計Ｉ／Ｆ抽出フラグ “0”（未抽出）
								stDebtLeger.setBALANCE_UPD_FLG("1"); // 残高更新フラグ “１”（更新済）
								stDebtLeger.setBALANCE_UPD_DATE(strSysDateTime); // 残高更新日時(システム日時)
								
								stDebtLeger.setACCT_CD(stDebtLeger.getCR_ACCT_CD()); // 科目コード
								stDebtLeger.setSUB_ACCT_CD(stDebtLeger.getCR_SUB_ACCT_CD()); // 補助区分コード
								stDebtLeger.setORG_CD(stDebtLeger.getCR_ORG_CD()); // 部門コード
								
								// 買掛金残高明細の登録（赤データ）
								nRet = entity.mT_DEBT_BALANCE_D.create(conn, stDebtLeger);

								// =======================================
								// 買掛金残高の更新(赤データ)
								// =======================================
								
								if (isCreateDebtBalance) {
									// 買掛金残高の更新を行う(赤データ)
									updateT_DEBT_BALANCE(stDebtLeger);
								}
								
								// =======================================
								// 買掛金元帳明細の編集(黒データ)
								// =======================================
								
								// 黒データの編集
								stDebtLeger.setSLIP_CD(strBlackSlipCd); // 伝票番号
								stDebtLeger.setTAX_CD(struct.getTAX_CD()); // 消費税コード
								stDebtLeger.setTAX_TYP(strTaxCdTyp); // 消費税区分
								stDebtLeger.setPROCESSING_COST(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST()))); // 加工費
								stDebtLeger.setMATERIAL_COST(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST()))); // 材料費
								stDebtLeger.setOTHER_OVERHEADS(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS()))); // その他経費
								stDebtLeger.setACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getACPT_QTY()))); // 受入数
								stDebtLeger.setINSPC_ACPT_QTY(Calculate.subtract("0", convertNull(stDebtLeger.getINSPC_ACPT_QTY()))); // 検収数
								stDebtLeger.setAMOUNT(Calculate.subtract("0", convertNull(stDebtLeger.getAMOUNT()))); // 検収金額
								//Mod Start 20140207 liang-l
								//消費税コード３桁目が５（内税）の場合
								if ("5".equals(strTaxCdTyp)){
									// [買掛金元帳明細].“伝票日付”　≧　[消費税区分].“新消費税コード開始日”　の場合
									if (isNewTax(stDebtLeger.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
										stDebtLeger.setTAX_AMOUNT(
												calculateTaxIn(stDebtLeger.getAMOUNT(), stTax.getNEW_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額
									} else {
										stDebtLeger.setTAX_AMOUNT(
												calculateTaxIn(stDebtLeger.getAMOUNT(),
														stTax.getOLD_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(),
														stTax.getROUND_TYP())); // 消費税額
									}
									stDebtLeger.setNET_AMOUNT(Calculate.subtract(stDebtLeger.getAMOUNT(), convertNull(stDebtLeger.getTAX_AMOUNT()))); // 税抜金額=[買掛金元帳明細] .“検収金額” の値 - 消費税額
								}
								//消費税コード３桁目が1（外税）の場合
								else if("1".equals(strTaxCdTyp)){
									// [買掛金元帳明細].“伝票日付”　≧　[消費税区分].“新消費税コード開始日”　の場合
									if (isNewTax(stDebtLeger.getSLIP_DATE(), stTax.getNEW_TAX_RATE_START_DATE())) {
										//stDebtLeger.setTAX_AMOUNT(
										//		calculateTax(stDebtLeger.getNET_AMOUNT(),
										//				stTax.getNEW_TAX_RATE_1(),
										//				struct.geth_DECIMAL_FIG(),
										//				stTax.getROUND_TYP())); // 消費税額
										stDebtLeger.setTAX_AMOUNT(
												calculateTax(stDebtLeger.getAMOUNT(),
														stTax.getNEW_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(),
														stTax.getROUND_TYP())); // 消費税額
									} else {
										//stDebtLeger.setTAX_AMOUNT(
										//		calculateTax(stDebtLeger.getNET_AMOUNT(),
										//				stTax.getOLD_TAX_RATE_1(),
										//				struct.geth_DECIMAL_FIG(),
										//				stTax.getROUND_TYP())); // 消費税額
										stDebtLeger.setTAX_AMOUNT(
												calculateTax(stDebtLeger.getAMOUNT(),
														stTax.getOLD_TAX_RATE_1(),
														struct.geth_DECIMAL_FIG(),
														stTax.getROUND_TYP())); // 消費税額
									}
									stDebtLeger.setNET_AMOUNT(stDebtLeger.getAMOUNT()); // 税抜金額=[買掛金元帳明細] .“検収金額” の値
								}
								else{
									stDebtLeger.setTAX_AMOUNT("0"); // 消費税額
									stDebtLeger.setNET_AMOUNT(stDebtLeger.getAMOUNT()); // 税抜金額=[買掛金元帳明細] .“検収金額” の値
								}
								//Mod End   20140207 liang-l
								
								stDebtLeger.setGROSS_AMOUNT(Calculate.add(stDebtLeger.getNET_AMOUNT(), stDebtLeger.getTAX_AMOUNT())); // 税込金額
								stDebtLeger.setPROCESSING_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getPROCESSING_COST_YEN()))); // 加工費(邦貨換算)
								stDebtLeger.setMATERIAL_COST_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getMATERIAL_COST_YEN()))); // 材料費(邦貨換算)
								stDebtLeger.setOTHER_OVERHEADS_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getOTHER_OVERHEADS_YEN()))); // その他経費(邦貨換算)
								//Del Start 20140207 liang-l
								//stDebtLeger.setNET_AMOUNT_YEN(Calculate.subtract("0", convertNull(stDebtLeger.getNET_AMOUNT_YEN()))); // 税抜金額(邦貨換算)
								//Del End   20140207 liang-l
								// 邦貨の場合
								if (strOwnCurCd.equals(stDebtLeger.getCUR_CD())) {
									stDebtLeger.setTAX_AMOUNT_YEN(stDebtLeger.getTAX_AMOUNT()); // 消費税額（邦貨換算）
									stDebtLeger.setGROSS_AMOUNT_YEN(stDebtLeger.getGROSS_AMOUNT()); // 税込金額（邦貨換算）
									//Add Start 20140207 liang-l
									stDebtLeger.setNET_AMOUNT_YEN(convertNull(stDebtLeger.getNET_AMOUNT())); // 税抜金額(邦貨換算)=税抜金額
									//Add End   20140207 liang-l
								} else {
									stDebtLeger.setTAX_AMOUNT_YEN(
											getRound(Calculate.multiply(stDebtLeger.getTAX_AMOUNT(),
													getExchRate(stDebtLegerH.getCUR_CD(), stDebtLegerH.getEXCH_TYP(), stDebtLegerH.getINSPC_ACPT_DATE())),
													struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 消費税額（邦貨換算）
									//Add Start 20140207 liang-l
									stDebtLeger.setNET_AMOUNT_YEN(
											getRound(Calculate.multiply(stDebtLeger.getNET_AMOUNT(),
											getExchRate(stDebtLegerH.getCUR_CD(), stDebtLegerH.getEXCH_TYP(), stDebtLegerH.getINSPC_ACPT_DATE())),
											struct.geth_DECIMAL_FIG(), stTax.getROUND_TYP())); // 税抜金額(邦貨換算)=税抜金額×上記で取得した[買掛金元帳ヘッダ].“為替レート”
									//Add End   20140207 liang-l
									stDebtLeger.setGROSS_AMOUNT_YEN(
											Calculate.add(convertNull(stDebtLeger.getNET_AMOUNT_YEN()),
													stDebtLeger.getTAX_AMOUNT_YEN())); // 税込金額（邦貨換算）
								}
								
								// =======================================
								// 買掛金元帳ヘッダ用データの集計(黒データ)
								// =======================================

								// 買掛金元帳明細の消費税額、税込金額を集計する
								strTaxAmountTotal = Calculate.add(strTaxAmountTotal, stDebtLeger.getTAX_AMOUNT()); // 消費税額合計
								strGrossAmountTotal = Calculate.add(strGrossAmountTotal, stDebtLeger.getGROSS_AMOUNT()); // 税込金額合計
								//Add Start 20140207 liang-l
								strNetTotal = Calculate.add(strNetTotal, stDebtLeger.getNET_AMOUNT()); // 税抜金額合計
								//Add End   20140207 liang-l
							}
						}
						
						// =======================================
						// 買掛金元帳ヘッダの登録(黒データ)
						// =======================================
						
						if (stDebtLegerH != null) {
							
							// 黒データの編集
							stDebtLegerH.setSLIP_CD(strBlackSlipCd); // 伝票番号
							stDebtLegerH.setINSPC_ACPT_CRCT_TYP("2"); // 訂正区分(黒)
							stDebtLegerH.setINSPC_ACPT_NO(strBlackInspcAcptNo); // 検収番号
							stDebtLegerH.setTAX_CD(struct.getTAX_CD()); // 消費税コード
							//Mod Start 20140207 liang-l
							//stDebtLegerH.setNET_TOTAL(Calculate.subtract("0", convertNull(stDebtLegerH.getNET_TOTAL()))); // 税抜金額合計
							stDebtLegerH.setNET_TOTAL(strNetTotal); // 税抜金額合計
							stDebtLegerH.setRECORDING_PROC_CD(this.getsysUSER_CD());//計上処理実行者コード
							//Mod End   20140207 liang-l
							stDebtLegerH.setTAX_TOTAL(strTaxAmountTotal); // 消費税額合計
							stDebtLegerH.setGROSS_TOTAL(strGrossAmountTotal); // 税込金額合計
							
							// 買掛金元帳ヘッダの登録（黒データ）
							nRet = entity.mT_DEBT_LEDGER_H.create(conn, stDebtLegerH);
							
							strTaxAmountTotal = "0"; // 消費税額合計
							strGrossAmountTotal = "0"; // 税込金額合計
							//Add Start 20140207 liang-l
							strNetTotal = "0"; // 税抜金額合計
							//Add End   20140207 liang-l
						}
						
						// =======================================
						// 買掛金元帳明細の登録(黒データ)
						// =======================================
						
						if (lstDebtLeger != null && lstDebtLeger.size() > 0) {
							for (int k = 0; k < lstDebtLeger.size(); k++) {
								stDebtLeger = (AE0170010Struct) lstDebtLeger.get(k);
						
								// 買掛金元帳明細の登録を行う（黒データ）
								nRet = entity.mT_DEBT_LEDGER.create(conn, stDebtLeger);
		
								// =======================================
								// 買掛金残高明細の登録(黒データ)
								// =======================================
								
								if (stDebtLegerH != null) {
									// 買掛金残高明細の登録を行う（黒データ）
									nRet = entity.mT_DEBT_BALANCE_D.create(conn, stDebtLeger);
								}
		
								// =======================================
								// 買掛金残高の更新(黒データ)
								// =======================================
								
								if (isCreateDebtBalance) {
									// 買掛金残高の更新を行う(黒データ)
									updateT_DEBT_BALANCE(stDebtLeger);
								}
							}
						}
					}
				}
			}
			
			controlSelect();
			
		} catch(SQLException e) {
			e.printStackTrace();
			setExceptionMsg(e, "ZZ01106");
		} catch(ParseException e) {
			setExceptionMsg(e, "ZZ01106");
		}
                //}}user_implement_dev:<controlUpdate>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlUpdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		struct.initialize();
		if(list != null)
		{
			list.clear();
		}
		controlRELOAD();
		setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
		struct.initialize();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try{
			AE0170010Struct st = new AE0170010Struct();
			
			// =======================================
			// インストールオプションの取得
			// =======================================
			
			struct.setOPTION_ID(EXPLANNER_JASCM);
			if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
				struct.setOPTION_ID(EXPLANNER_JA);
				if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
					struct.setOPTION_ID(EXPLANNER_JF);
					if (!entity.mcheck_SYS_INSTALL_OPTIONS.check(conn, struct)) {
						struct.setOPTION_ID(EXPLANNER_J);
					}
				}
			}

			// =======================================
			// 工場コードの取得
			// =======================================
			
			struct.setPLANT_CD(this.getsysPLANT_CD());

			// =======================================
			// 会社コードの取得
			// =======================================

			try{
				// Explanner/JaScmの場合
				if (EXPLANNER_JASCM.equals(struct.getOPTION_ID())) {
					st.setPLANT_CD(this.getsysPLANT_CD());
					List lstCompanyCd = entity.mget_M_PLANT_SCM.read(conn, st);
					if (lstCompanyCd == null || lstCompanyCd.size() < 1) {
						setErrorMessage("KQ00039", true);
					}
					struct.setCOMPANY_CD(((AE0170010Struct) lstCompanyCd.get(0)).getCOMPANY_CD()); // 会社コード
				} else {
					String strCompanyCd = SystemInformation.getSysMyCompanyCd();
					if (strCompanyCd == null || strCompanyCd.equals("")) {
						setErrorMessage("KQ00039", true);
					} else {
						struct.setCOMPANY_CD(strCompanyCd); // 会社コード
					}
				}
			} catch (FoundationException e) {
				setErrorMessage("KQ00039", true);
			}

			// =======================================
			// 邦貨の小数桁数の取得
			// =======================================
			
			List lstHomeMCur = entity.mget_SYS_HOME_CUR.read(conn, st);
			if (lstHomeMCur == null || lstHomeMCur.size() < 1) {
				setErrorMessage("KA20039", true);
			}
			
			st.setCUR_CD(((AE0170010Struct) lstHomeMCur.get(0)).getHOME_CUR_CD()); // 邦貨コード
			List lstMCur = entity.mget_HOME_DECIMAL_FIG.read(conn, st);
			if (lstMCur == null || lstMCur.size() < 1) {
				setErrorMessage("BZ00184", true);
			}
			struct.setHOME_DECIMAL_FIG(((AE0170010Struct) lstMCur.get(0)).getHOME_DECIMAL_FIG()); // 邦貨の小数桁数

			// =======================================
			// 表示行数制限値の取得
			// =======================================
			
			_maxLine = 0;
			_maxLine = sp.getMaxLine(conn, 10);

		} catch(SQLException e) {
			e.printStackTrace();
			setExceptionMsg(e, "ZZ01106");
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0170");
		logger.entering("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AE0170010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AE0170010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0170010-E999","CSVの出力処理"));
			throw new FoundationException("AE0170010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0170010-E999","システム日付の取得処理"));
				throw new FoundationException("AE0170010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0170010-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0170010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0170010Entity entity;
	protected AE0170010Struct struct;
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

		entity = new AE0170010Entity();
		struct = new AE0170010Struct();

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
	 * AE0170010クラスの標準コンストラクタ
	 */
	public AE0170010Control() throws BusinessProcessException, FoundationException
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
				AE0170010Struct key = (AE0170010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG") && key.getc_NON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("c_NON_NO_ITEM_FLG", key.getc_NON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME") && key.getPUCH_ODR_DLV_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_TIME", key.getPUCH_ODR_DLV_TIME());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME") && key.getPUCH_ODR_START_TIME() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_TIME", key.getPUCH_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS") && key.getl_STATUS() != null) {
					msgKey.setKeyValue("l_STATUS", key.getl_STATUS());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_NO") && key.getl_ACPT_NO() != null) {
					msgKey.setKeyValue("l_ACPT_NO", key.getl_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_QTY") && key.getl_ACPT_QTY() != null) {
					msgKey.setKeyValue("l_ACPT_QTY", key.getl_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACPT_DATE") && key.getl_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ACPT_DATE", key.getl_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST") && key.getl_UNIT_COST() != null) {
					msgKey.setKeyValue("l_UNIT_COST", key.getl_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP") && key.getl_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("l_UNIT_COST_TYP", key.getl_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT") && key.getl_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_PUCH_ODR_AMOUNT", key.getl_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_INSPECTED_QTY") && key.getl_INSPECTED_QTY() != null) {
					msgKey.setKeyValue("l_INSPECTED_QTY", key.getl_INSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ACCEPTED_QTY") && key.getl_ACCEPTED_QTY() != null) {
					msgKey.setKeyValue("l_ACCEPTED_QTY", key.getl_ACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_INSPEC_DATE") && key.getl_INSPEC_DATE() != null) {
					msgKey.setKeyValue("l_INSPEC_DATE", key.getl_INSPEC_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_NET_AMOUNT") && key.geth_NET_AMOUNT() != null) {
					msgKey.setKeyValue("h_NET_AMOUNT", key.geth_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1") && key.geth_TAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_1", key.geth_TAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2") && key.geth_TAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_2", key.geth_TAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3") && key.geth_TAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_3", key.geth_TAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("h_DECIMAL_FIG") && key.geth_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("h_DECIMAL_FIG", key.geth_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("h_ROUND_TYP") && key.geth_ROUND_TYP() != null) {
					msgKey.setKeyValue("h_ROUND_TYP", key.geth_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_STS_TYP") && key.geth_PUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_STS_TYP", key.geth_PUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_INST_SLIP_ISS_FLG") && key.geth_PUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_INST_SLIP_ISS_FLG", key.geth_PUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG") && key.geth_ODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG", key.geth_ODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_INSPC_CMPLT_FLG") && key.geth_INSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("h_INSPC_CMPLT_FLG", key.geth_INSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP") && key.geth_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("h_ACPT_INSPC_TYP", key.geth_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_NET_AMOUNT_LIST") && key.geth_NET_AMOUNT_LIST() != null) {
					msgKey.setKeyValue("h_NET_AMOUNT_LIST", key.geth_NET_AMOUNT_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1_LIST") && key.geth_TAX_AMOUNT_1_LIST() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_1_LIST", key.geth_TAX_AMOUNT_1_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2_LIST") && key.geth_TAX_AMOUNT_2_LIST() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_2_LIST", key.geth_TAX_AMOUNT_2_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3_LIST") && key.geth_TAX_AMOUNT_3_LIST() != null) {
					msgKey.setKeyValue("h_TAX_AMOUNT_3_LIST", key.geth_TAX_AMOUNT_3_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_UPDATE_FLG") && key.geth_UPDATE_FLG() != null) {
					msgKey.setKeyValue("h_UPDATE_FLG", key.geth_UPDATE_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_LIST") && key.geth_MODIFY_COUNT_LIST() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT_LIST", key.geth_MODIFY_COUNT_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_EXCH_RATE") && key.geth_EXCH_RATE() != null) {
					msgKey.setKeyValue("h_EXCH_RATE", key.geth_EXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("h_EXCH_RATE_LIST") && key.geth_EXCH_RATE_LIST() != null) {
					msgKey.setKeyValue("h_EXCH_RATE_LIST", key.geth_EXCH_RATE_LIST());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD") && key.geth_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("h_PUCH_ODR_CD", key.geth_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG") && key.getNON_NO_ITEM_FLG() != null) {
					msgKey.setKeyValue("NON_NO_ITEM_FLG", key.getNON_NO_ITEM_FLG());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE") && key.getPUCH_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_DLV_DATE", key.getPUCH_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE") && key.getPUCH_ODR_START_DATE() != null) {
					msgKey.setKeyValue("PUCH_ODR_START_DATE", key.getPUCH_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY") && key.getPUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("PUCH_ODR_QTY", key.getPUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE") && key.getRATE_JUDGE_DATE() != null) {
					msgKey.setKeyValue("RATE_JUDGE_DATE", key.getRATE_JUDGE_DATE());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG") && key.getPUCH_ODR_INST_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG", key.getPUCH_ODR_INST_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG") && key.getODR_CANCEL_SLIP_ISS_FLG() != null) {
					msgKey.setKeyValue("ODR_CANCEL_SLIP_ISS_FLG", key.getODR_CANCEL_SLIP_ISS_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG") && key.getINSPC_CMPLT_FLG() != null) {
					msgKey.setKeyValue("INSPC_CMPLT_FLG", key.getINSPC_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_NAME") && key.getVEND_NAME() != null) {
					msgKey.setKeyValue("VEND_NAME", key.getVEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP") && key.getINSPC_ACPT_APP_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_APP_TYP", key.getINSPC_ACPT_APP_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP") && key.getROUND_TYP() != null) {
					msgKey.setKeyValue("ROUND_TYP", key.getROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_UNIT") && key.getCUR_UNIT() != null) {
					msgKey.setKeyValue("CUR_UNIT", key.getCUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("DECIMAL_FIG") && key.getDECIMAL_FIG() != null) {
					msgKey.setKeyValue("DECIMAL_FIG", key.getDECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("ACPT_NO") && key.getACPT_NO() != null) {
					msgKey.setKeyValue("ACPT_NO", key.getACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACPT_DATE") && key.getACPT_DATE() != null) {
					msgKey.setKeyValue("ACPT_DATE", key.getACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("INSPECTED_QTY") && key.getINSPECTED_QTY() != null) {
					msgKey.setKeyValue("INSPECTED_QTY", key.getINSPECTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACCEPTED_QTY") && key.getACCEPTED_QTY() != null) {
					msgKey.setKeyValue("ACCEPTED_QTY", key.getACCEPTED_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPEC_DATE") && key.getINSPEC_DATE() != null) {
					msgKey.setKeyValue("INSPEC_DATE", key.getINSPEC_DATE());
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
				if(msgKeyType.containsKeyColumn("TAX_RATE_1") && key.getTAX_RATE_1() != null) {
					msgKey.setKeyValue("TAX_RATE_1", key.getTAX_RATE_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_2") && key.getTAX_RATE_2() != null) {
					msgKey.setKeyValue("TAX_RATE_2", key.getTAX_RATE_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_RATE_3") && key.getTAX_RATE_3() != null) {
					msgKey.setKeyValue("TAX_RATE_3", key.getTAX_RATE_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_NO") && key.getINSPC_ACPT_NO() != null) {
					msgKey.setKeyValue("INSPC_ACPT_NO", key.getINSPC_ACPT_NO());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_GNR_TYP") && key.getINSPC_ACPT_GNR_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_GNR_TYP", key.getINSPC_ACPT_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("CRCT_NO") && key.getCRCT_NO() != null) {
					msgKey.setKeyValue("CRCT_NO", key.getCRCT_NO());
				}
				if(msgKeyType.containsKeyColumn("CRCT_TYP") && key.getCRCT_TYP() != null) {
					msgKey.setKeyValue("CRCT_TYP", key.getCRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_TYP") && key.getSLIP_TYP() != null) {
					msgKey.setKeyValue("SLIP_TYP", key.getSLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST") && key.getPROCESSING_COST() != null) {
					msgKey.setKeyValue("PROCESSING_COST", key.getPROCESSING_COST());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST") && key.getMATERIAL_COST() != null) {
					msgKey.setKeyValue("MATERIAL_COST", key.getMATERIAL_COST());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS") && key.getOTHER_OVERHEADS() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS", key.getOTHER_OVERHEADS());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY") && key.getINSPC_ACPT_QTY() != null) {
					msgKey.setKeyValue("INSPC_ACPT_QTY", key.getINSPC_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT") && key.getINSPC_ACPT_AMOUNT() != null) {
					msgKey.setKeyValue("INSPC_ACPT_AMOUNT", key.getINSPC_ACPT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SAVING_AMOUNT") && key.getSAVING_AMOUNT() != null) {
					msgKey.setKeyValue("SAVING_AMOUNT", key.getSAVING_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE") && key.getINSPC_ACPT_DATE() != null) {
					msgKey.setKeyValue("INSPC_ACPT_DATE", key.getINSPC_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("DLV_CD") && key.getDLV_CD() != null) {
					msgKey.setKeyValue("DLV_CD", key.getDLV_CD());
				}
				if(msgKeyType.containsKeyColumn("DISC_AMOUNT") && key.getDISC_AMOUNT() != null) {
					msgKey.setKeyValue("DISC_AMOUNT", key.getDISC_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("GNR_ORG_CD") && key.getGNR_ORG_CD() != null) {
					msgKey.setKeyValue("GNR_ORG_CD", key.getGNR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP") && key.getSBCNT_PUCH_TYP() != null) {
					msgKey.setKeyValue("SBCNT_PUCH_TYP", key.getSBCNT_PUCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("CLASIFICATION_CD") && key.getCLASIFICATION_CD() != null) {
					msgKey.setKeyValue("CLASIFICATION_CD", key.getCLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("INV_CTRL_FLG") && key.getINV_CTRL_FLG() != null) {
					msgKey.setKeyValue("INV_CTRL_FLG", key.getINV_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RTN_FLG") && key.getPUCH_RTN_FLG() != null) {
					msgKey.setKeyValue("PUCH_RTN_FLG", key.getPUCH_RTN_FLG());
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
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP") && key.getSLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("SLIP_CTRL_GRP", key.getSLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("SLIP_DATE") && key.getSLIP_DATE() != null) {
					msgKey.setKeyValue("SLIP_DATE", key.getSLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CD") && key.getSLIP_CD() != null) {
					msgKey.setKeyValue("SLIP_CD", key.getSLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("SEQ_NO") && key.getSEQ_NO() != null) {
					msgKey.setKeyValue("SEQ_NO", key.getSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT_YEN") && key.getNET_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("NET_AMOUNT_YEN", key.getNET_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT") && key.getAMOUNT() != null) {
					msgKey.setKeyValue("AMOUNT", key.getAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_TYP") && key.getTAX_TYP() != null) {
					msgKey.setKeyValue("TAX_TYP", key.getTAX_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT") && key.getTAX_AMOUNT() != null) {
					msgKey.setKeyValue("TAX_AMOUNT", key.getTAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("GROSS_AMOUNT") && key.getGROSS_AMOUNT() != null) {
					msgKey.setKeyValue("GROSS_AMOUNT", key.getGROSS_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_YEN") && key.getTAX_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_YEN", key.getTAX_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("GROSS_AMOUNT_YEN") && key.getGROSS_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("GROSS_AMOUNT_YEN", key.getGROSS_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT") && key.getSUM_TAX_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_TAX_AMOUNT", key.getSUM_TAX_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_GROSS_AMOUNT") && key.getSUM_GROSS_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_GROSS_AMOUNT", key.getSUM_GROSS_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SUM_NET_AMOUNT") && key.getSUM_NET_AMOUNT() != null) {
					msgKey.setKeyValue("SUM_NET_AMOUNT", key.getSUM_NET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_TOTAL") && key.getTAX_TOTAL() != null) {
					msgKey.setKeyValue("TAX_TOTAL", key.getTAX_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("GROSS_TOTAL") && key.getGROSS_TOTAL() != null) {
					msgKey.setKeyValue("GROSS_TOTAL", key.getGROSS_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("NET_TOTAL") && key.getNET_TOTAL() != null) {
					msgKey.setKeyValue("NET_TOTAL", key.getNET_TOTAL());
				}
				if(msgKeyType.containsKeyColumn("LINE_NO") && key.getLINE_NO() != null) {
					msgKey.setKeyValue("LINE_NO", key.getLINE_NO());
				}
				if(msgKeyType.containsKeyColumn("LINE_TYP") && key.getLINE_TYP() != null) {
					msgKey.setKeyValue("LINE_TYP", key.getLINE_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_CTRL_FLG") && key.getTAX_AMOUNT_CTRL_FLG() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_CTRL_FLG", key.getTAX_AMOUNT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_YEN") && key.getUNIT_COST_YEN() != null) {
					msgKey.setKeyValue("UNIT_COST_YEN", key.getUNIT_COST_YEN());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_YEN") && key.getPROCESSING_COST_YEN() != null) {
					msgKey.setKeyValue("PROCESSING_COST_YEN", key.getPROCESSING_COST_YEN());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_YEN") && key.getMATERIAL_COST_YEN() != null) {
					msgKey.setKeyValue("MATERIAL_COST_YEN", key.getMATERIAL_COST_YEN());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_YEN") && key.getOTHER_OVERHEADS_YEN() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_YEN", key.getOTHER_OVERHEADS_YEN());
				}
				if(msgKeyType.containsKeyColumn("DR_ACCT_CD") && key.getDR_ACCT_CD() != null) {
					msgKey.setKeyValue("DR_ACCT_CD", key.getDR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DR_SUB_ACCT_CD") && key.getDR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("DR_SUB_ACCT_CD", key.getDR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("DR_ORG_CD") && key.getDR_ORG_CD() != null) {
					msgKey.setKeyValue("DR_ORG_CD", key.getDR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("CR_ACCT_CD") && key.getCR_ACCT_CD() != null) {
					msgKey.setKeyValue("CR_ACCT_CD", key.getCR_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("CR_SUB_ACCT_CD") && key.getCR_SUB_ACCT_CD() != null) {
					msgKey.setKeyValue("CR_SUB_ACCT_CD", key.getCR_SUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("CR_ORG_CD") && key.getCR_ORG_CD() != null) {
					msgKey.setKeyValue("CR_ORG_CD", key.getCR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("FIXED_ASSETS_CD") && key.getFIXED_ASSETS_CD() != null) {
					msgKey.setKeyValue("FIXED_ASSETS_CD", key.getFIXED_ASSETS_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_FIXED_ASSETS_CD") && key.getSUB_FIXED_ASSETS_CD() != null) {
					msgKey.setKeyValue("SUB_FIXED_ASSETS_CD", key.getSUB_FIXED_ASSETS_CD());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_NO") && key.getDETAIL_NO() != null) {
					msgKey.setKeyValue("DETAIL_NO", key.getDETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_LINE_NO") && key.getCOMM_PUCH_ODR_LINE_NO() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_LINE_NO", key.getCOMM_PUCH_ODR_LINE_NO());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_LINE_NO") && key.getARV_RSLT_LINE_NO() != null) {
					msgKey.setKeyValue("ARV_RSLT_LINE_NO", key.getARV_RSLT_LINE_NO());
				}
				if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG") && key.getSTOCK_CTRL_FLG() != null) {
					msgKey.setKeyValue("STOCK_CTRL_FLG", key.getSTOCK_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("REMARKS") && key.getREMARKS() != null) {
					msgKey.setKeyValue("REMARKS", key.getREMARKS());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_CRCT_TYP") && key.getINSPC_ACPT_CRCT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_CRCT_TYP", key.getINSPC_ACPT_CRCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_CTRL_GRP") && key.getORGN_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("ORGN_SLIP_CTRL_GRP", key.getORGN_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD") && key.getORGN_SLIP_CD() != null) {
					msgKey.setKeyValue("ORGN_SLIP_CD", key.getORGN_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ORGN_SLIP_DATE") && key.getORGN_SLIP_DATE() != null) {
					msgKey.setKeyValue("ORGN_SLIP_DATE", key.getORGN_SLIP_DATE());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_ORG_CD") && key.getPUCH_ODR_ORG_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_ORG_CD", key.getPUCH_ODR_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON_CD") && key.getPUCH_ODR_PERSON_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON_CD", key.getPUCH_ODR_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_WH_CD") && key.getSHIP_WH_CD() != null) {
					msgKey.setKeyValue("SHIP_WH_CD", key.getSHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("PAYEE_CD") && key.getPAYEE_CD() != null) {
					msgKey.setKeyValue("PAYEE_CD", key.getPAYEE_CD());
				}
				if(msgKeyType.containsKeyColumn("SLIP_CTRL_ORG_CD") && key.getSLIP_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("SLIP_CTRL_ORG_CD", key.getSLIP_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_CTRL_ORG_CD") && key.getCLOSING_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("CLOSING_CTRL_ORG_CD", key.getCLOSING_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_CALC_CTRL_ORG_CD") && key.getPAY_CALC_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("PAY_CALC_CTRL_ORG_CD", key.getPAY_CALC_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_FIX_CTRL_ORG_CD") && key.getPAY_FIX_CTRL_ORG_CD() != null) {
					msgKey.setKeyValue("PAY_FIX_CTRL_ORG_CD", key.getPAY_FIX_CTRL_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("EXPL_TYP") && key.getEXPL_TYP() != null) {
					msgKey.setKeyValue("EXPL_TYP", key.getEXPL_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXPL_CD") && key.getEXPL_CD() != null) {
					msgKey.setKeyValue("EXPL_CD", key.getEXPL_CD());
				}
				if(msgKeyType.containsKeyColumn("EXPL_NAME") && key.getEXPL_NAME() != null) {
					msgKey.setKeyValue("EXPL_NAME", key.getEXPL_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_CD") && key.getODR_CD() != null) {
					msgKey.setKeyValue("ODR_CD", key.getODR_CD());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_TYP") && key.getCOMM_PUCH_ODR_SLIP_TYP() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_TYP", key.getCOMM_PUCH_ODR_SLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CTRL_GRP") && key.getCOMM_PUCH_ODR_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_CTRL_GRP", key.getCOMM_PUCH_ODR_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CD") && key.getCOMM_PUCH_ODR_SLIP_CD() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_CD", key.getCOMM_PUCH_ODR_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_DATE") && key.getCOMM_PUCH_ODR_SLIP_DATE() != null) {
					msgKey.setKeyValue("COMM_PUCH_ODR_SLIP_DATE", key.getCOMM_PUCH_ODR_SLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_TYP") && key.getARV_RSLT_SLIP_TYP() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_TYP", key.getARV_RSLT_SLIP_TYP());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CTRL_GRP") && key.getARV_RSLT_SLIP_CTRL_GRP() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_CTRL_GRP", key.getARV_RSLT_SLIP_CTRL_GRP());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CD") && key.getARV_RSLT_SLIP_CD() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_CD", key.getARV_RSLT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_DATE") && key.getARV_RSLT_SLIP_DATE() != null) {
					msgKey.setKeyValue("ARV_RSLT_SLIP_DATE", key.getARV_RSLT_SLIP_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUCH_RSLT_SLIP_ID") && key.getPUCH_RSLT_SLIP_ID() != null) {
					msgKey.setKeyValue("PUCH_RSLT_SLIP_ID", key.getPUCH_RSLT_SLIP_ID());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TEMP_UNIT_COST_PUCH_RSLT_FLG") && key.getTEMP_UNIT_COST_PUCH_RSLT_FLG() != null) {
					msgKey.setKeyValue("TEMP_UNIT_COST_PUCH_RSLT_FLG", key.getTEMP_UNIT_COST_PUCH_RSLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_ZERO_INSPC_ACPT_FLG") && key.getUNIT_COST_ZERO_INSPC_ACPT_FLG() != null) {
					msgKey.setKeyValue("UNIT_COST_ZERO_INSPC_ACPT_FLG", key.getUNIT_COST_ZERO_INSPC_ACPT_FLG());
				}
				if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP") && key.getIMPORT_TRN_TYP() != null) {
					msgKey.setKeyValue("IMPORT_TRN_TYP", key.getIMPORT_TRN_TYP());
				}
				if(msgKeyType.containsKeyColumn("PAY_CYCLE_TYP") && key.getPAY_CYCLE_TYP() != null) {
					msgKey.setKeyValue("PAY_CYCLE_TYP", key.getPAY_CYCLE_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEADLINE_DATE") && key.getDEADLINE_DATE() != null) {
					msgKey.setKeyValue("DEADLINE_DATE", key.getDEADLINE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAY_SCH_DATE") && key.getPAY_SCH_DATE() != null) {
					msgKey.setKeyValue("PAY_SCH_DATE", key.getPAY_SCH_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAY_PATTERN_CD") && key.getPAY_PATTERN_CD() != null) {
					msgKey.setKeyValue("PAY_PATTERN_CD", key.getPAY_PATTERN_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RSRV_CD") && key.getEXCH_RSRV_CD() != null) {
					msgKey.setKeyValue("EXCH_RSRV_CD", key.getEXCH_RSRV_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_DATE") && key.getEXCH_DATE() != null) {
					msgKey.setKeyValue("EXCH_DATE", key.getEXCH_DATE());
				}
				if(msgKeyType.containsKeyColumn("PUR_RSLT_SLIP_ISSUE_FLG") && key.getPUR_RSLT_SLIP_ISSUE_FLG() != null) {
					msgKey.setKeyValue("PUR_RSLT_SLIP_ISSUE_FLG", key.getPUR_RSLT_SLIP_ISSUE_FLG());
				}
				if(msgKeyType.containsKeyColumn("PUR_RSLT_REP_ISSUE_FLG") && key.getPUR_RSLT_REP_ISSUE_FLG() != null) {
					msgKey.setKeyValue("PUR_RSLT_REP_ISSUE_FLG", key.getPUR_RSLT_REP_ISSUE_FLG());
				}
				if(msgKeyType.containsKeyColumn("ACPT_ARV_MODIFICATION_FLG") && key.getACPT_ARV_MODIFICATION_FLG() != null) {
					msgKey.setKeyValue("ACPT_ARV_MODIFICATION_FLG", key.getACPT_ARV_MODIFICATION_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_MODIFICATION_FLG") && key.getINSPC_ACPT_MODIFICATION_FLG() != null) {
					msgKey.setKeyValue("INSPC_ACPT_MODIFICATION_FLG", key.getINSPC_ACPT_MODIFICATION_FLG());
				}
				if(msgKeyType.containsKeyColumn("STATUS") && key.getSTATUS() != null) {
					msgKey.setKeyValue("STATUS", key.getSTATUS());
				}
				if(msgKeyType.containsKeyColumn("CRCT_FLG") && key.getCRCT_FLG() != null) {
					msgKey.setKeyValue("CRCT_FLG", key.getCRCT_FLG());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_DATE") && key.getAPPROVAL_DATE() != null) {
					msgKey.setKeyValue("APPROVAL_DATE", key.getAPPROVAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_CD") && key.getAPPROVAL_CD() != null) {
					msgKey.setKeyValue("APPROVAL_CD", key.getAPPROVAL_CD());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_DATE") && key.getAPPROVAL_RSRV_DATE() != null) {
					msgKey.setKeyValue("APPROVAL_RSRV_DATE", key.getAPPROVAL_RSRV_DATE());
				}
				if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_CD") && key.getAPPROVAL_RSRV_CD() != null) {
					msgKey.setKeyValue("APPROVAL_RSRV_CD", key.getAPPROVAL_RSRV_CD());
				}
				if(msgKeyType.containsKeyColumn("RSN_CD") && key.getRSN_CD() != null) {
					msgKey.setKeyValue("RSN_CD", key.getRSN_CD());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_DATE") && key.getRECORDING_DATE() != null) {
					msgKey.setKeyValue("RECORDING_DATE", key.getRECORDING_DATE());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_MONTH") && key.getRECORDING_MONTH() != null) {
					msgKey.setKeyValue("RECORDING_MONTH", key.getRECORDING_MONTH());
				}
				if(msgKeyType.containsKeyColumn("ORGN_RECORDING_DATE") && key.getORGN_RECORDING_DATE() != null) {
					msgKey.setKeyValue("ORGN_RECORDING_DATE", key.getORGN_RECORDING_DATE());
				}
				if(msgKeyType.containsKeyColumn("ORGN_RECORDING_MONTH") && key.getORGN_RECORDING_MONTH() != null) {
					msgKey.setKeyValue("ORGN_RECORDING_MONTH", key.getORGN_RECORDING_MONTH());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_PROC_DATE") && key.getRECORDING_PROC_DATE() != null) {
					msgKey.setKeyValue("RECORDING_PROC_DATE", key.getRECORDING_PROC_DATE());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_PROC_CD") && key.getRECORDING_PROC_CD() != null) {
					msgKey.setKeyValue("RECORDING_PROC_CD", key.getRECORDING_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_RSRV_DATE") && key.getCLOSING_RSRV_DATE() != null) {
					msgKey.setKeyValue("CLOSING_RSRV_DATE", key.getCLOSING_RSRV_DATE());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_RSRV_CD") && key.getCLOSING_RSRV_CD() != null) {
					msgKey.setKeyValue("CLOSING_RSRV_CD", key.getCLOSING_RSRV_CD());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_DATE") && key.getCLOSING_DATE() != null) {
					msgKey.setKeyValue("CLOSING_DATE", key.getCLOSING_DATE());
				}
				if(msgKeyType.containsKeyColumn("CLOSING_CD") && key.getCLOSING_CD() != null) {
					msgKey.setKeyValue("CLOSING_CD", key.getCLOSING_CD());
				}
				if(msgKeyType.containsKeyColumn("PAY_FIX_DATE") && key.getPAY_FIX_DATE() != null) {
					msgKey.setKeyValue("PAY_FIX_DATE", key.getPAY_FIX_DATE());
				}
				if(msgKeyType.containsKeyColumn("PAY_FIX_CD") && key.getPAY_FIX_CD() != null) {
					msgKey.setKeyValue("PAY_FIX_CD", key.getPAY_FIX_CD());
				}
				if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_FLG") && key.getDEBT_BALANCE_OUT_FLG() != null) {
					msgKey.setKeyValue("DEBT_BALANCE_OUT_FLG", key.getDEBT_BALANCE_OUT_FLG());
				}
				if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_DATE") && key.getDEBT_BALANCE_OUT_DATE() != null) {
					msgKey.setKeyValue("DEBT_BALANCE_OUT_DATE", key.getDEBT_BALANCE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("MONTH") && key.getMONTH() != null) {
					msgKey.setKeyValue("MONTH", key.getMONTH());
				}
				if(msgKeyType.containsKeyColumn("ACCT_CD") && key.getACCT_CD() != null) {
					msgKey.setKeyValue("ACCT_CD", key.getACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("SUB_ACCT_CD") && key.getSUB_ACCT_CD() != null) {
					msgKey.setKeyValue("SUB_ACCT_CD", key.getSUB_ACCT_CD());
				}
				if(msgKeyType.containsKeyColumn("ORG_CD") && key.getORG_CD() != null) {
					msgKey.setKeyValue("ORG_CD", key.getORG_CD());
				}
				if(msgKeyType.containsKeyColumn("DATA_TYP") && key.getDATA_TYP() != null) {
					msgKey.setKeyValue("DATA_TYP", key.getDATA_TYP());
				}
				if(msgKeyType.containsKeyColumn("GL_IF_OUT_FLG") && key.getGL_IF_OUT_FLG() != null) {
					msgKey.setKeyValue("GL_IF_OUT_FLG", key.getGL_IF_OUT_FLG());
				}
				if(msgKeyType.containsKeyColumn("BALANCE_UPD_FLG") && key.getBALANCE_UPD_FLG() != null) {
					msgKey.setKeyValue("BALANCE_UPD_FLG", key.getBALANCE_UPD_FLG());
				}
				if(msgKeyType.containsKeyColumn("BALANCE_UPD_DATE") && key.getBALANCE_UPD_DATE() != null) {
					msgKey.setKeyValue("BALANCE_UPD_DATE", key.getBALANCE_UPD_DATE());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT") && key.getRECORDING_AMOUNT() != null) {
					msgKey.setKeyValue("RECORDING_AMOUNT", key.getRECORDING_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("DEBT_AMOUNT") && key.getDEBT_AMOUNT() != null) {
					msgKey.setKeyValue("DEBT_AMOUNT", key.getDEBT_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("REBATE_AMOUNT") && key.getREBATE_AMOUNT() != null) {
					msgKey.setKeyValue("REBATE_AMOUNT", key.getREBATE_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT") && key.getRETURNED_GOODS_AMOUNT() != null) {
					msgKey.setKeyValue("RETURNED_GOODS_AMOUNT", key.getRETURNED_GOODS_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT_YEN") && key.getRECORDING_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("RECORDING_AMOUNT_YEN", key.getRECORDING_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("DEBT_AMOUNT_YEN") && key.getDEBT_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("DEBT_AMOUNT_YEN", key.getDEBT_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("SAVING_AMOUNT_YEN") && key.getSAVING_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("SAVING_AMOUNT_YEN", key.getSAVING_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("REBATE_AMOUNT_YEN") && key.getREBATE_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("REBATE_AMOUNT_YEN", key.getREBATE_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT_YEN") && key.getRETURNED_GOODS_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("RETURNED_GOODS_AMOUNT_YEN", key.getRETURNED_GOODS_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT_YEN") && key.getINSPC_ACPT_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("INSPC_ACPT_AMOUNT_YEN", key.getINSPC_ACPT_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("EXCH_DIFF_AMOUNT_YEN") && key.getEXCH_DIFF_AMOUNT_YEN() != null) {
					msgKey.setKeyValue("EXCH_DIFF_AMOUNT_YEN", key.getEXCH_DIFF_AMOUNT_YEN());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("OWN_CUR_CD") && key.getOWN_CUR_CD() != null) {
					msgKey.setKeyValue("OWN_CUR_CD", key.getOWN_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("THIS_MONTH") && key.getTHIS_MONTH() != null) {
					msgKey.setKeyValue("THIS_MONTH", key.getTHIS_MONTH());
				}
				if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG") && key.getHOME_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("HOME_DECIMAL_FIG", key.getHOME_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
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
					AE0170010Struct key = new AE0170010Struct();
					if(msgKeyType.containsKeyColumn("c_NON_NO_ITEM_FLG")) {
						key.setc_NON_NO_ITEM_FLG(msgKey.getKeyValue("c_NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_TIME")) {
						key.setPUCH_ODR_DLV_TIME(msgKey.getKeyValue("PUCH_ODR_DLV_TIME"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_TIME")) {
						key.setPUCH_ODR_START_TIME(msgKey.getKeyValue("PUCH_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS")) {
						key.setl_STATUS(msgKey.getKeyValue("l_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_NO")) {
						key.setl_ACPT_NO(msgKey.getKeyValue("l_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_QTY")) {
						key.setl_ACPT_QTY(msgKey.getKeyValue("l_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACPT_DATE")) {
						key.setl_ACPT_DATE(msgKey.getKeyValue("l_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST")) {
						key.setl_UNIT_COST(msgKey.getKeyValue("l_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_COST_TYP")) {
						key.setl_UNIT_COST_TYP(msgKey.getKeyValue("l_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_PUCH_ODR_AMOUNT")) {
						key.setl_PUCH_ODR_AMOUNT(msgKey.getKeyValue("l_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPECTED_QTY")) {
						key.setl_INSPECTED_QTY(msgKey.getKeyValue("l_INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ACCEPTED_QTY")) {
						key.setl_ACCEPTED_QTY(msgKey.getKeyValue("l_ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_INSPEC_DATE")) {
						key.setl_INSPEC_DATE(msgKey.getKeyValue("l_INSPEC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_NET_AMOUNT")) {
						key.seth_NET_AMOUNT(msgKey.getKeyValue("h_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1")) {
						key.seth_TAX_AMOUNT_1(msgKey.getKeyValue("h_TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2")) {
						key.seth_TAX_AMOUNT_2(msgKey.getKeyValue("h_TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3")) {
						key.seth_TAX_AMOUNT_3(msgKey.getKeyValue("h_TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("h_DECIMAL_FIG")) {
						key.seth_DECIMAL_FIG(msgKey.getKeyValue("h_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("h_ROUND_TYP")) {
						key.seth_ROUND_TYP(msgKey.getKeyValue("h_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_STS_TYP")) {
						key.seth_PUCH_ODR_STS_TYP(msgKey.getKeyValue("h_PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.seth_PUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("h_PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_CANCEL_SLIP_ISS_FLG")) {
						key.seth_ODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("h_ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_INSPC_CMPLT_FLG")) {
						key.seth_INSPC_CMPLT_FLG(msgKey.getKeyValue("h_INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP")) {
						key.seth_ACPT_INSPC_TYP(msgKey.getKeyValue("h_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_NET_AMOUNT_LIST")) {
						key.seth_NET_AMOUNT_LIST(msgKey.getKeyValue("h_NET_AMOUNT_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_1_LIST")) {
						key.seth_TAX_AMOUNT_1_LIST(msgKey.getKeyValue("h_TAX_AMOUNT_1_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_2_LIST")) {
						key.seth_TAX_AMOUNT_2_LIST(msgKey.getKeyValue("h_TAX_AMOUNT_2_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_AMOUNT_3_LIST")) {
						key.seth_TAX_AMOUNT_3_LIST(msgKey.getKeyValue("h_TAX_AMOUNT_3_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_UPDATE_FLG")) {
						key.seth_UPDATE_FLG(msgKey.getKeyValue("h_UPDATE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT_LIST")) {
						key.seth_MODIFY_COUNT_LIST(msgKey.getKeyValue("h_MODIFY_COUNT_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_EXCH_RATE")) {
						key.seth_EXCH_RATE(msgKey.getKeyValue("h_EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("h_EXCH_RATE_LIST")) {
						key.seth_EXCH_RATE_LIST(msgKey.getKeyValue("h_EXCH_RATE_LIST"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PUCH_ODR_CD")) {
						key.seth_PUCH_ODR_CD(msgKey.getKeyValue("h_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("NON_NO_ITEM_FLG")) {
						key.setNON_NO_ITEM_FLG(msgKey.getKeyValue("NON_NO_ITEM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_DLV_DATE")) {
						key.setPUCH_ODR_DLV_DATE(msgKey.getKeyValue("PUCH_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_START_DATE")) {
						key.setPUCH_ODR_START_DATE(msgKey.getKeyValue("PUCH_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_QTY")) {
						key.setPUCH_ODR_QTY(msgKey.getKeyValue("PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RATE_JUDGE_DATE")) {
						key.setRATE_JUDGE_DATE(msgKey.getKeyValue("RATE_JUDGE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_INST_SLIP_ISS_FLG")) {
						key.setPUCH_ODR_INST_SLIP_ISS_FLG(msgKey.getKeyValue("PUCH_ODR_INST_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CANCEL_SLIP_ISS_FLG")) {
						key.setODR_CANCEL_SLIP_ISS_FLG(msgKey.getKeyValue("ODR_CANCEL_SLIP_ISS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_CMPLT_FLG")) {
						key.setINSPC_CMPLT_FLG(msgKey.getKeyValue("INSPC_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_NAME")) {
						key.setVEND_NAME(msgKey.getKeyValue("VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_APP_TYP")) {
						key.setINSPC_ACPT_APP_TYP(msgKey.getKeyValue("INSPC_ACPT_APP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP")) {
						key.setROUND_TYP(msgKey.getKeyValue("ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_UNIT")) {
						key.setCUR_UNIT(msgKey.getKeyValue("CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("DECIMAL_FIG")) {
						key.setDECIMAL_FIG(msgKey.getKeyValue("DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_NO")) {
						key.setACPT_NO(msgKey.getKeyValue("ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_DATE")) {
						key.setACPT_DATE(msgKey.getKeyValue("ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INSPECTED_QTY")) {
						key.setINSPECTED_QTY(msgKey.getKeyValue("INSPECTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACCEPTED_QTY")) {
						key.setACCEPTED_QTY(msgKey.getKeyValue("ACCEPTED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPEC_DATE")) {
						key.setINSPEC_DATE(msgKey.getKeyValue("INSPEC_DATE"));
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
					if(msgKeyType.containsKeyColumn("TAX_RATE_1")) {
						key.setTAX_RATE_1(msgKey.getKeyValue("TAX_RATE_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_2")) {
						key.setTAX_RATE_2(msgKey.getKeyValue("TAX_RATE_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_RATE_3")) {
						key.setTAX_RATE_3(msgKey.getKeyValue("TAX_RATE_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_NO")) {
						key.setINSPC_ACPT_NO(msgKey.getKeyValue("INSPC_ACPT_NO"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_GNR_TYP")) {
						key.setINSPC_ACPT_GNR_TYP(msgKey.getKeyValue("INSPC_ACPT_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_NO")) {
						key.setCRCT_NO(msgKey.getKeyValue("CRCT_NO"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_TYP")) {
						key.setCRCT_TYP(msgKey.getKeyValue("CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_TYP")) {
						key.setSLIP_TYP(msgKey.getKeyValue("SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST")) {
						key.setPROCESSING_COST(msgKey.getKeyValue("PROCESSING_COST"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST")) {
						key.setMATERIAL_COST(msgKey.getKeyValue("MATERIAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS")) {
						key.setOTHER_OVERHEADS(msgKey.getKeyValue("OTHER_OVERHEADS"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_QTY")) {
						key.setINSPC_ACPT_QTY(msgKey.getKeyValue("INSPC_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT")) {
						key.setINSPC_ACPT_AMOUNT(msgKey.getKeyValue("INSPC_ACPT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SAVING_AMOUNT")) {
						key.setSAVING_AMOUNT(msgKey.getKeyValue("SAVING_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_DATE")) {
						key.setINSPC_ACPT_DATE(msgKey.getKeyValue("INSPC_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DLV_CD")) {
						key.setDLV_CD(msgKey.getKeyValue("DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("DISC_AMOUNT")) {
						key.setDISC_AMOUNT(msgKey.getKeyValue("DISC_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("GNR_ORG_CD")) {
						key.setGNR_ORG_CD(msgKey.getKeyValue("GNR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_PUCH_TYP")) {
						key.setSBCNT_PUCH_TYP(msgKey.getKeyValue("SBCNT_PUCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("CLASIFICATION_CD")) {
						key.setCLASIFICATION_CD(msgKey.getKeyValue("CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("INV_CTRL_FLG")) {
						key.setINV_CTRL_FLG(msgKey.getKeyValue("INV_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RTN_FLG")) {
						key.setPUCH_RTN_FLG(msgKey.getKeyValue("PUCH_RTN_FLG"));
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
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_GRP")) {
						key.setSLIP_CTRL_GRP(msgKey.getKeyValue("SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_DATE")) {
						key.setSLIP_DATE(msgKey.getKeyValue("SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CD")) {
						key.setSLIP_CD(msgKey.getKeyValue("SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("SEQ_NO")) {
						key.setSEQ_NO(msgKey.getKeyValue("SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT_YEN")) {
						key.setNET_AMOUNT_YEN(msgKey.getKeyValue("NET_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT")) {
						key.setAMOUNT(msgKey.getKeyValue("AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_TYP")) {
						key.setTAX_TYP(msgKey.getKeyValue("TAX_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT")) {
						key.setTAX_AMOUNT(msgKey.getKeyValue("TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("GROSS_AMOUNT")) {
						key.setGROSS_AMOUNT(msgKey.getKeyValue("GROSS_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_YEN")) {
						key.setTAX_AMOUNT_YEN(msgKey.getKeyValue("TAX_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("GROSS_AMOUNT_YEN")) {
						key.setGROSS_AMOUNT_YEN(msgKey.getKeyValue("GROSS_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("SUM_TAX_AMOUNT")) {
						key.setSUM_TAX_AMOUNT(msgKey.getKeyValue("SUM_TAX_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_GROSS_AMOUNT")) {
						key.setSUM_GROSS_AMOUNT(msgKey.getKeyValue("SUM_GROSS_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SUM_NET_AMOUNT")) {
						key.setSUM_NET_AMOUNT(msgKey.getKeyValue("SUM_NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_TOTAL")) {
						key.setTAX_TOTAL(msgKey.getKeyValue("TAX_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("GROSS_TOTAL")) {
						key.setGROSS_TOTAL(msgKey.getKeyValue("GROSS_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("NET_TOTAL")) {
						key.setNET_TOTAL(msgKey.getKeyValue("NET_TOTAL"));
					}
					if(msgKeyType.containsKeyColumn("LINE_NO")) {
						key.setLINE_NO(msgKey.getKeyValue("LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("LINE_TYP")) {
						key.setLINE_TYP(msgKey.getKeyValue("LINE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_CTRL_FLG")) {
						key.setTAX_AMOUNT_CTRL_FLG(msgKey.getKeyValue("TAX_AMOUNT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_YEN")) {
						key.setUNIT_COST_YEN(msgKey.getKeyValue("UNIT_COST_YEN"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_YEN")) {
						key.setPROCESSING_COST_YEN(msgKey.getKeyValue("PROCESSING_COST_YEN"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_YEN")) {
						key.setMATERIAL_COST_YEN(msgKey.getKeyValue("MATERIAL_COST_YEN"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_YEN")) {
						key.setOTHER_OVERHEADS_YEN(msgKey.getKeyValue("OTHER_OVERHEADS_YEN"));
					}
					if(msgKeyType.containsKeyColumn("DR_ACCT_CD")) {
						key.setDR_ACCT_CD(msgKey.getKeyValue("DR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DR_SUB_ACCT_CD")) {
						key.setDR_SUB_ACCT_CD(msgKey.getKeyValue("DR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("DR_ORG_CD")) {
						key.setDR_ORG_CD(msgKey.getKeyValue("DR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CR_ACCT_CD")) {
						key.setCR_ACCT_CD(msgKey.getKeyValue("CR_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CR_SUB_ACCT_CD")) {
						key.setCR_SUB_ACCT_CD(msgKey.getKeyValue("CR_SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("CR_ORG_CD")) {
						key.setCR_ORG_CD(msgKey.getKeyValue("CR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_ASSETS_CD")) {
						key.setFIXED_ASSETS_CD(msgKey.getKeyValue("FIXED_ASSETS_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_FIXED_ASSETS_CD")) {
						key.setSUB_FIXED_ASSETS_CD(msgKey.getKeyValue("SUB_FIXED_ASSETS_CD"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_NO")) {
						key.setDETAIL_NO(msgKey.getKeyValue("DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_LINE_NO")) {
						key.setCOMM_PUCH_ODR_LINE_NO(msgKey.getKeyValue("COMM_PUCH_ODR_LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_LINE_NO")) {
						key.setARV_RSLT_LINE_NO(msgKey.getKeyValue("ARV_RSLT_LINE_NO"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_CTRL_FLG")) {
						key.setSTOCK_CTRL_FLG(msgKey.getKeyValue("STOCK_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("REMARKS")) {
						key.setREMARKS(msgKey.getKeyValue("REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_CRCT_TYP")) {
						key.setINSPC_ACPT_CRCT_TYP(msgKey.getKeyValue("INSPC_ACPT_CRCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_CTRL_GRP")) {
						key.setORGN_SLIP_CTRL_GRP(msgKey.getKeyValue("ORGN_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_CD")) {
						key.setORGN_SLIP_CD(msgKey.getKeyValue("ORGN_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_SLIP_DATE")) {
						key.setORGN_SLIP_DATE(msgKey.getKeyValue("ORGN_SLIP_DATE"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_ORG_CD")) {
						key.setPUCH_ODR_ORG_CD(msgKey.getKeyValue("PUCH_ODR_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON_CD")) {
						key.setPUCH_ODR_PERSON_CD(msgKey.getKeyValue("PUCH_ODR_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_WH_CD")) {
						key.setSHIP_WH_CD(msgKey.getKeyValue("SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAYEE_CD")) {
						key.setPAYEE_CD(msgKey.getKeyValue("PAYEE_CD"));
					}
					if(msgKeyType.containsKeyColumn("SLIP_CTRL_ORG_CD")) {
						key.setSLIP_CTRL_ORG_CD(msgKey.getKeyValue("SLIP_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_CTRL_ORG_CD")) {
						key.setCLOSING_CTRL_ORG_CD(msgKey.getKeyValue("CLOSING_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_CALC_CTRL_ORG_CD")) {
						key.setPAY_CALC_CTRL_ORG_CD(msgKey.getKeyValue("PAY_CALC_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_FIX_CTRL_ORG_CD")) {
						key.setPAY_FIX_CTRL_ORG_CD(msgKey.getKeyValue("PAY_FIX_CTRL_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXPL_TYP")) {
						key.setEXPL_TYP(msgKey.getKeyValue("EXPL_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXPL_CD")) {
						key.setEXPL_CD(msgKey.getKeyValue("EXPL_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXPL_NAME")) {
						key.setEXPL_NAME(msgKey.getKeyValue("EXPL_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_CD")) {
						key.setODR_CD(msgKey.getKeyValue("ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_TYP")) {
						key.setCOMM_PUCH_ODR_SLIP_TYP(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CTRL_GRP")) {
						key.setCOMM_PUCH_ODR_SLIP_CTRL_GRP(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_CD")) {
						key.setCOMM_PUCH_ODR_SLIP_CD(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMM_PUCH_ODR_SLIP_DATE")) {
						key.setCOMM_PUCH_ODR_SLIP_DATE(msgKey.getKeyValue("COMM_PUCH_ODR_SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_TYP")) {
						key.setARV_RSLT_SLIP_TYP(msgKey.getKeyValue("ARV_RSLT_SLIP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CTRL_GRP")) {
						key.setARV_RSLT_SLIP_CTRL_GRP(msgKey.getKeyValue("ARV_RSLT_SLIP_CTRL_GRP"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_CD")) {
						key.setARV_RSLT_SLIP_CD(msgKey.getKeyValue("ARV_RSLT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("ARV_RSLT_SLIP_DATE")) {
						key.setARV_RSLT_SLIP_DATE(msgKey.getKeyValue("ARV_RSLT_SLIP_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_RSLT_SLIP_ID")) {
						key.setPUCH_RSLT_SLIP_ID(msgKey.getKeyValue("PUCH_RSLT_SLIP_ID"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TEMP_UNIT_COST_PUCH_RSLT_FLG")) {
						key.setTEMP_UNIT_COST_PUCH_RSLT_FLG(msgKey.getKeyValue("TEMP_UNIT_COST_PUCH_RSLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_ZERO_INSPC_ACPT_FLG")) {
						key.setUNIT_COST_ZERO_INSPC_ACPT_FLG(msgKey.getKeyValue("UNIT_COST_ZERO_INSPC_ACPT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("IMPORT_TRN_TYP")) {
						key.setIMPORT_TRN_TYP(msgKey.getKeyValue("IMPORT_TRN_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PAY_CYCLE_TYP")) {
						key.setPAY_CYCLE_TYP(msgKey.getKeyValue("PAY_CYCLE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEADLINE_DATE")) {
						key.setDEADLINE_DATE(msgKey.getKeyValue("DEADLINE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAY_SCH_DATE")) {
						key.setPAY_SCH_DATE(msgKey.getKeyValue("PAY_SCH_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAY_PATTERN_CD")) {
						key.setPAY_PATTERN_CD(msgKey.getKeyValue("PAY_PATTERN_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RSRV_CD")) {
						key.setEXCH_RSRV_CD(msgKey.getKeyValue("EXCH_RSRV_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_DATE")) {
						key.setEXCH_DATE(msgKey.getKeyValue("EXCH_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PUR_RSLT_SLIP_ISSUE_FLG")) {
						key.setPUR_RSLT_SLIP_ISSUE_FLG(msgKey.getKeyValue("PUR_RSLT_SLIP_ISSUE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PUR_RSLT_REP_ISSUE_FLG")) {
						key.setPUR_RSLT_REP_ISSUE_FLG(msgKey.getKeyValue("PUR_RSLT_REP_ISSUE_FLG"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_ARV_MODIFICATION_FLG")) {
						key.setACPT_ARV_MODIFICATION_FLG(msgKey.getKeyValue("ACPT_ARV_MODIFICATION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_MODIFICATION_FLG")) {
						key.setINSPC_ACPT_MODIFICATION_FLG(msgKey.getKeyValue("INSPC_ACPT_MODIFICATION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("STATUS")) {
						key.setSTATUS(msgKey.getKeyValue("STATUS"));
					}
					if(msgKeyType.containsKeyColumn("CRCT_FLG")) {
						key.setCRCT_FLG(msgKey.getKeyValue("CRCT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_DATE")) {
						key.setAPPROVAL_DATE(msgKey.getKeyValue("APPROVAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_CD")) {
						key.setAPPROVAL_CD(msgKey.getKeyValue("APPROVAL_CD"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_DATE")) {
						key.setAPPROVAL_RSRV_DATE(msgKey.getKeyValue("APPROVAL_RSRV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("APPROVAL_RSRV_CD")) {
						key.setAPPROVAL_RSRV_CD(msgKey.getKeyValue("APPROVAL_RSRV_CD"));
					}
					if(msgKeyType.containsKeyColumn("RSN_CD")) {
						key.setRSN_CD(msgKey.getKeyValue("RSN_CD"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_DATE")) {
						key.setRECORDING_DATE(msgKey.getKeyValue("RECORDING_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_MONTH")) {
						key.setRECORDING_MONTH(msgKey.getKeyValue("RECORDING_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_RECORDING_DATE")) {
						key.setORGN_RECORDING_DATE(msgKey.getKeyValue("ORGN_RECORDING_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ORGN_RECORDING_MONTH")) {
						key.setORGN_RECORDING_MONTH(msgKey.getKeyValue("ORGN_RECORDING_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_PROC_DATE")) {
						key.setRECORDING_PROC_DATE(msgKey.getKeyValue("RECORDING_PROC_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_PROC_CD")) {
						key.setRECORDING_PROC_CD(msgKey.getKeyValue("RECORDING_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_RSRV_DATE")) {
						key.setCLOSING_RSRV_DATE(msgKey.getKeyValue("CLOSING_RSRV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_RSRV_CD")) {
						key.setCLOSING_RSRV_CD(msgKey.getKeyValue("CLOSING_RSRV_CD"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_DATE")) {
						key.setCLOSING_DATE(msgKey.getKeyValue("CLOSING_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CLOSING_CD")) {
						key.setCLOSING_CD(msgKey.getKeyValue("CLOSING_CD"));
					}
					if(msgKeyType.containsKeyColumn("PAY_FIX_DATE")) {
						key.setPAY_FIX_DATE(msgKey.getKeyValue("PAY_FIX_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PAY_FIX_CD")) {
						key.setPAY_FIX_CD(msgKey.getKeyValue("PAY_FIX_CD"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_FLG")) {
						key.setDEBT_BALANCE_OUT_FLG(msgKey.getKeyValue("DEBT_BALANCE_OUT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_BALANCE_OUT_DATE")) {
						key.setDEBT_BALANCE_OUT_DATE(msgKey.getKeyValue("DEBT_BALANCE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MONTH")) {
						key.setMONTH(msgKey.getKeyValue("MONTH"));
					}
					if(msgKeyType.containsKeyColumn("ACCT_CD")) {
						key.setACCT_CD(msgKey.getKeyValue("ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("SUB_ACCT_CD")) {
						key.setSUB_ACCT_CD(msgKey.getKeyValue("SUB_ACCT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ORG_CD")) {
						key.setORG_CD(msgKey.getKeyValue("ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("DATA_TYP")) {
						key.setDATA_TYP(msgKey.getKeyValue("DATA_TYP"));
					}
					if(msgKeyType.containsKeyColumn("GL_IF_OUT_FLG")) {
						key.setGL_IF_OUT_FLG(msgKey.getKeyValue("GL_IF_OUT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BALANCE_UPD_FLG")) {
						key.setBALANCE_UPD_FLG(msgKey.getKeyValue("BALANCE_UPD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("BALANCE_UPD_DATE")) {
						key.setBALANCE_UPD_DATE(msgKey.getKeyValue("BALANCE_UPD_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT")) {
						key.setRECORDING_AMOUNT(msgKey.getKeyValue("RECORDING_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_AMOUNT")) {
						key.setDEBT_AMOUNT(msgKey.getKeyValue("DEBT_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("REBATE_AMOUNT")) {
						key.setREBATE_AMOUNT(msgKey.getKeyValue("REBATE_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT")) {
						key.setRETURNED_GOODS_AMOUNT(msgKey.getKeyValue("RETURNED_GOODS_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("RECORDING_AMOUNT_YEN")) {
						key.setRECORDING_AMOUNT_YEN(msgKey.getKeyValue("RECORDING_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("DEBT_AMOUNT_YEN")) {
						key.setDEBT_AMOUNT_YEN(msgKey.getKeyValue("DEBT_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("SAVING_AMOUNT_YEN")) {
						key.setSAVING_AMOUNT_YEN(msgKey.getKeyValue("SAVING_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("REBATE_AMOUNT_YEN")) {
						key.setREBATE_AMOUNT_YEN(msgKey.getKeyValue("REBATE_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("RETURNED_GOODS_AMOUNT_YEN")) {
						key.setRETURNED_GOODS_AMOUNT_YEN(msgKey.getKeyValue("RETURNED_GOODS_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_AMOUNT_YEN")) {
						key.setINSPC_ACPT_AMOUNT_YEN(msgKey.getKeyValue("INSPC_ACPT_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_DIFF_AMOUNT_YEN")) {
						key.setEXCH_DIFF_AMOUNT_YEN(msgKey.getKeyValue("EXCH_DIFF_AMOUNT_YEN"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("OWN_CUR_CD")) {
						key.setOWN_CUR_CD(msgKey.getKeyValue("OWN_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("THIS_MONTH")) {
						key.setTHIS_MONTH(msgKey.getKeyValue("THIS_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("HOME_DECIMAL_FIG")) {
						key.setHOME_DECIMAL_FIG(msgKey.getKeyValue("HOME_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
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
