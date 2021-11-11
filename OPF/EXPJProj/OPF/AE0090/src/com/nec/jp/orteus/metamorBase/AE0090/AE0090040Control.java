/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AE0090/src/com/nec/jp/orteus/metamorBase/AE0090/AE0090040Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AE0090;

import com.nec.jp.orteus.metamorBase.AE0090.*;
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

import java.io.*;
import org.w3c.dom.*;
import org.apache.crimson.tree.*;
//{{user_implement_code_import
import java.text.ParseException;

import com.nec.jp.orteus.expj.util.Calculate;
import com.nec.jp.orteus.expj.util.Converter;
import com.nec.jp.orteus.expj.util.ExpjException;
import com.nec.jp.orteus.expj.util.ExpjMessage;
import com.nec.jp.orteus.expj.util.PrivateConfig;
import com.nec.jp.orteus.expj.psmaintenance.PsMaintenance;
import com.nec.jp.orteus.expj.exception.ExpjBadException;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.DateCtrlStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;

//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AE0090040Control クラス
 * ファイル・クラス説明
 * @author $Author: koizumi $
 * @version $Revision: 1.7 $ $Date: 2012/09/27 09:43:39 $
 *
 */
//}}user_implement_code_header

public class AE0090040Control
{

	//////////////////////////////
	// アクセサメソッド等を定義します
	// Businessオブジェクトアクセサメソッド
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

	// FlashTree用アクセサメソッド
	private Document flashTree = null;
	public Document getFlashTree() { return this.flashTree; }
	public void setFlashTree( Document obj ) { this.flashTree = obj; }
	public String getFlashTreeXML() {
		if(flashTree == null) {
			return (String)null;
		}
		StringWriter strWr = new StringWriter();
		try {
			((XmlDocument)flashTree).write(strWr, "Shift_JIS");
		}catch(IOException e){
			e.printStackTrace();
		}
                String osname = System.getProperty("os.name");
                if(osname.indexOf("Windows")>=0){
         		return StringConverter.substitute(strWr.toString(), "\r\n", "");
                } else {
              		return StringConverter.substitute(strWr.toString(), "\n", "");
                }
	}
	public int setXMLDoc(Element el, List list, int startId, int lvl, int parentId) throws BusinessProcessException, FoundationException {

		if(el != null && list != null) {
			Element elChild = null;
			for(int i=0; i<list.size(); i++, startId++) {
				// エレメントを生成
				elChild = flashTree.createElement("node");
				setStruct2XML(elChild, (AE0090040Struct)list.get(i), startId, lvl, parentId);
				// 作成したエレメントを子供として追加
				el.appendChild(elChild);
			}
		}
		return startId;
	}

	public int setXMLDoc(Element el, List list, int startId) throws BusinessProcessException, FoundationException {
		return setXMLDoc(el, list, startId, 1, 0);
	} 

	public void setStruct2XML(Element el, AE0090040Struct struct, int id, int lvl, int parentId) throws BusinessProcessException, FoundationException {

		if(el != null && struct != null) {
			try {
		//{{user_implement_dev:<setStruct2XML>
				// id属性(id)の設定
				el.setAttribute("id", Integer.toString(id));
				// レベル属性(LVL)の設定
				el.setAttribute("lvl", Integer.toString(lvl));
				// 親属性(Parent)の設定
				el.setAttribute("parent", Integer.toString(parentId));
				// ラベル属性(Label)の設定
				if(struct.getlabel() != null && !struct.getlabel().equals("")) {
					el.setAttribute("label", struct.getlabel());
				}
//				 拡張属性
                // 上位レベル品目番号属性の設定
                if (struct.getUpper_ITEM_CD() != null
                        && struct.getUpper_ITEM_CD().equals("") == false)
                {
                    el.setAttribute("Upper_ITEM_CD", struct.getUpper_ITEM_CD());
                } else {
                    el.setAttribute("Upper_ITEM_CD", "");
                }
//              上位レベル品目名属性の設定
                if (struct.getUpper_ITEM_NAME() != null
                        && struct.getUpper_ITEM_NAME().equals("") == false)
                {
                    el.setAttribute("Upper_ITEM_NAME", struct.getUpper_ITEM_NAME());
                } else {
                    el.setAttribute("Upper_ITEM_NAME", "");
                }
                // 下位レベル品目番号属性の設定
                if (struct.getLower_ITEM_CD() != null
                        && struct.getLower_ITEM_CD().equals("") == false)
                {
                    el.setAttribute("Lower_ITEM_CD", struct.getLower_ITEM_CD());
                } else {
                    el.setAttribute("Lower_ITEM_CD", "");
                }
//              下位レベル品目名の設定
                if (struct.getLower_ITEM_NAME() != null
                        && struct.getLower_ITEM_NAME().equals("") == false)
                {
                    el.setAttribute("Lower_ITEM_NAME", struct.getLower_ITEM_NAME());
                } else {
                    el.setAttribute("Lower_ITEM_NAME", "");
                }
                // 製品構成版数属性の設定
                if (struct.getPS_EDITION() != null
                        && struct.getPS_EDITION().equals("") == false)
                {
                    el.setAttribute("PS_EDITION", struct.getPS_EDITION());
                } else {
                    el.setAttribute("PS_EDITION", "");
                }
                //必要数属性の設定
                if (struct.getLower_NEED_QTY() != null
                		&& struct.getLower_NEED_QTY().equals("") == false)
                {
                	el.setAttribute("Lower_NEED_QTY",struct.getLower_NEED_QTY());
                }else{
                	el.setAttribute("Lower_NEED_QTY", "");
                }
                //現在庫数量
                if (struct.getONHAND_STOCK() != null && struct.getONHAND_STOCK().equals("") == false)
                {
                	el.setAttribute("ONHAND_STOCK",struct.getONHAND_STOCK());
                }else{
                	el.setAttribute("ONHAND_STOCK","");
                }
                //}}user_implement_dev:<setStruct2XML>
			} catch(DOMException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public void setStruct2XML(Element el, AE0090040Struct struct, int id) throws BusinessProcessException, FoundationException {
		setStruct2XML(el, struct, id, 1, 0);
		return;
	}

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
	public AE0090040Struct getListvalue(int x) { return (AE0090040Struct)(this.list.get(x)); }	// リストの値を返します。
	public AE0090040Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AE0090040Struct createStruct() { return new AE0090040Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AE0090040Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	private Date targetDate;
	private boolean ceilflg = false;
	/** 展開区分：正展開 */
    private static final String DEVELOP_NORMAL = "1";

    /** 展開区分：逆展開 */
    private static final String DEVELOP_REVERSE = "2";

    /** デフォールト初期展開レベル */
    private static final int DEFAULT_INIT_DEVELOP_LEVEL = 15;

    /** デフォールト最大展開レベル */
    private static final int DEFAULT_MAX_DEVELOP_LEVEL = 50;

    /** デフォールト所期展開レベル */
    private int _intInitDevelopLevel = DEFAULT_INIT_DEVELOP_LEVEL;

    /** 最大展開レベル */
    private int _intMaxDevelopLevel = DEFAULT_MAX_DEVELOP_LEVEL;

    /** 最大読込行数 */
    private int _intMaxReadNum = 0;

    /** 対象日付 */
    private String _targetDate = null;

    /** 製品構成メンテナンス部品アクセス用オブジェクト */
    private PsMaintenance _psMaint = null;

    /** 品目手配区分コンボボックス値リスト */
    private List _detMrpOdrTypValList = null;

    /** 品目手配区分コンボボックス表示説明リスト */
    private List _detMrpOdrTypNameList = null;

    /** 内外作区分コンボボックス値リスト */
    private List _detOutsideTypValList = null;

    /** 内外作区分コンボボックス表示説明リスト */
    private List _detOutsideTypNameList = null;
    
    /** 構成品目製品区分使用フラグ表示用（コンボボックス）値リスト */
	private List _detProductTypValList = null;

	/** 構成品目製品区分使用フラグ表示用（コンボボックス）説明リスト */
	private List _detProductTypNameList = null;

	/** 構成品目支給区分使用フラグ表示用（コンボボックス）値リスト */
	private List _detConsTypValList = null;

	/** 構成品目支給区分使用フラグ表示用（コンボボックス）説明リスト */
	private List _detConsTypNameList = null;
 
    /** 製品構成リスト */
    private ArrayList _deployList = new ArrayList(0);
   
    /** 製品構成リスト取得 
     * @return 製品構成リスト
    */
    public ArrayList getDeployList(){ return _deployList; }
    
    /**
	 * Date型 ⇒ String型。
	 * 
	 * @return String YYYY/MM/DD形式
	 */
    public String dateToString(Date date)
    {
     //return _dateFormat.format(date);
     return Converter.dateToStr(date, "yyyy/MM/dd");
    }

    /**
     * String型 ⇒ Date型。
     * @return Date 
     */
    public Date stringToDate(String date) throws ParseException
    {
     //return _dateFormat.parse(date);
     return Converter.strToDate(date, "yyyy/MM/dd");
    }
    
    /**    
     * check 日付形式：yyyy/MM/dd
     * @param sourceDate    
     * @return    
     */     
     public static boolean checkDate(String sourceDate){     
     if(sourceDate==null){     
     return false;     
     }     
     try {     
     SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");     
     dateFormat.setLenient(false);     
     dateFormat.parse(sourceDate);     
     return true;     
     } catch (Exception e) {     
     }     
     return false;     
     }   
     /**
 	 * 業務ロジックのインフォメーションメッセージ設定処理を切り出して関数化
 	 * @param code メッセージコード
 	 */
 	private void setInformationMessage(String code) {
 		ExpjMessage emsg = new ExpjMessage(code);
 		msgStruct.addInfo(emsg);
 	}
 	/**
 	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
 	 * @param code メッセージコード
 	 */
 	private void setWarningMessage(String code) {
 		ExpjMessage emsg = new ExpjMessage(code);
 		msgStruct.addWarn(emsg);
 		sysLog.info(emsg, sysUSER_CD);
 	}
 	/**
 	 * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
 	 * @param code メッセージコード
 	 * @param value1 置換文字列１
 	 */
 	private void setWarningMessage(String code, String value1) {
 		ExpjMessage emsg = new ExpjMessage(code, value1);
 		msgStruct.addWarn(emsg);
 		sysLog.info(emsg, sysUSER_CD);
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
     /**
      * データなし例外クラスです。
      */
     private class AE0090040NoPlantException extends ExpjBadException
     {
         /**
          * AE0090040NoPlantExceptionオブジェクトを構築します。
          *
          * @param em エラーメッセージオブジェクト
          */
         private AE0090040NoPlantException(ExpjMessage em)
         {
             super(em);
         }
     }
    /**
     * データなし例外クラスです。
     */
    private class AE0090040NoDataException extends ExpjBadException
    {
        /**
         * AE0090040NoDataExceptionオブジェクトを構築します。
         *
         * @param em エラーメッセージオブジェクト
         */
        private AE0090040NoDataException(ExpjMessage em)
        {
            super(em);
        }
    }

    /**
     * ツリーの読込行数オーバー例外クラスです。
     */
    private class AE0090040MaxReadException extends ExpjBadException
    {
        /**
         * AE0090040MaxReadExceptionオブジェクトを構築します。
         *
         * @param em エラーメッセージオブジェクト
         */
        private AE0090040MaxReadException(ExpjMessage em)
        {
            super(em);
        }
    }

    /**
     * ツリーの最大展開レベルオーバー例外クラスです。
     */
    private class AE0090040MaxLevelException extends ExpjBadException
    {
        /**
         * AE0090040MaxLevelExceptionオブジェクトを構築します。
         */
        private AE0090040MaxLevelException()
        {
            super();
        }
    }

    /**
     * 上位レベルノードに対する上位レベルノードをツリー展開します。
     *
     * @param  upperNodeElement 上位レベルノードエレメント
     * @param  upperNodeStruct 上位レベルノードのsturct
     * @param  upperNodeId 上位レベルノードID
     * @param  lowerNodeId 下位レベルノードID（このIDから始開）
     * @param  maxNodeId 読込可能最大ノードID（このIDを超えることはできない）
     * @param  lowerTreeLevel 下位レベルツリーレベル
     * @param  maxLevel 最大展開レベル
     * @return 次のノードID
     * @throws BusinessProcessException
     * @throws FoundationException
     * @throws SQLException
     * @throws ParseException
     * @throws AE0090040NoDataException
     * @throws AE0090040MaxReadException
     */
    private int expandTree(Element upperNodeElement, AE0090040Struct upperNodeStruct,
            int upperNodeId, int lowerNodeId, int maxNodeId, int lowerTreeLevel, int maxLevel)
            throws BusinessProcessException, FoundationException, SQLException, ParseException,
                    AE0090040NoDataException, AE0090040MaxReadException
    {
    	// 子ノードの一覧を取得
        List lowerNodeList = getLowerNodeList(upperNodeStruct.getLower_ITEM_CD());
        if (lowerNodeList.isEmpty()) {
            // 末端ノードの場合
            upperNodeElement.setAttribute("ctx", "T");
            if(Calculate.compare(upperNodeStruct.getONHAND_STOCK(),upperNodeStruct.getLower_NEED_QTY()) < 0){
            	upperNodeElement.setAttribute("icon1", "TreeIcon3C");
            }else{
            	upperNodeElement.setAttribute("icon1", "AD0020011CIcon01C");
            }
        } else if (upperNodeElement.hasAttribute("target") == false) {
            // 末端以外のノードであり、Rootでない場合
            upperNodeElement.setAttribute("ctx", "N");
            if(Calculate.compare(upperNodeStruct.getONHAND_STOCK(),upperNodeStruct.getLower_NEED_QTY()) < 0){
            	upperNodeElement.setAttribute("icon1", "TreeIcon3A");
            	upperNodeElement.setAttribute("icon2", "TreeIcon3B");
            }else{
            	upperNodeElement.setAttribute("icon1", "AD0020011CIcon01A");
            	upperNodeElement.setAttribute("icon2", "AD0020011CIcon01B");
            }
            if (lowerTreeLevel > maxLevel) {
                // ツリーのレベルが最大レベルを超えた場合
                if (lowerTreeLevel > _intMaxDevelopLevel + 1) {
                    // ツリーのレベルが最大展開レベルを超えた場合
                    // 親ノードに下位レベル展開不可属性を設定
                    upperNodeElement.setAttribute("terminated", "true");
                    // 警告：最大展開レベル（{0}）を超えて展開することはできません。
                    ExpjMessage emsg = new ExpjMessage("AA20018",
                            String.valueOf(_intMaxDevelopLevel));
                    upperNodeElement.setAttribute("terminate_comment",
                            emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
                } else {
                    // 親ノードに下位レベル未読込属性を設定
                    upperNodeElement.setAttribute("not_read", "true");
                }
                return lowerNodeId;
            }
        }
        int lowerNodeListSize = lowerNodeList.size();
        if (maxNodeId > 0 && lowerNodeId + lowerNodeListSize - 1 > maxNodeId) {
            // ツリーの読込行数が最大値を超えた場合
            throw new AE0090040MaxReadException(new ExpjMessage("ZZ01006",
                "M_PS.COMP_ITEM_CD:" + upperNodeStruct.getLower_ITEM_CD()));
        }
        for (int i = 0; i < lowerNodeListSize; i++) {
            // 子ノードを生成、ツリー用XMLに追加
            Element lowerNodeElement = flashTree.createElement("node");
            upperNodeElement.appendChild(lowerNodeElement);
            // lowerNodeStructから子ノードの各種属性データを設定
            String[] lowerNode = (String[])lowerNodeList.get(i);
            StringBuffer buf = new StringBuffer(lowerNode[0]);
            buf.append(",");
            buf.append(getItemName(lowerNode[0]));
            buf.append(",");
            buf.append(lowerNode[1]);
            buf.append("[");
            buf.append(lowerNode[2]);
            buf.append("-");
            buf.append(lowerNode[3]);
            buf.append("]");
            AE0090040Struct lowerNodeStruct = new AE0090040Struct();
            lowerNodeStruct.setlabel(buf.toString());
            lowerNodeStruct.setUpper_ITEM_CD(upperNodeStruct.getLower_ITEM_CD());
            lowerNodeStruct.setUpper_ITEM_NAME(upperNodeStruct.getLower_ITEM_NAME());
            lowerNodeStruct.setLower_ITEM_CD(lowerNode[0]);
            lowerNodeStruct.setLower_ITEM_NAME(lowerNode[1]);
            lowerNodeStruct.setPS_EDITION(lowerNode[1]);
            lowerNodeStruct.setPLANT_CD(struct.getPLANT_CD());
            lowerNodeStruct.setUpper_NEED_QTY(upperNodeStruct.getLower_NEED_QTY());
            // 必要数と在庫数を 設定
        	List onHand_StockList = null;
        	List need_QTYList = null;
            String onHand_Stock = null;
            String need_QTY = null;
            if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
        		onHand_StockList = entity.mSelectStock.read(conn,lowerNodeStruct);
        		need_QTYList = entity.mSelectNeed_QTY.read(conn,lowerNodeStruct);
        	}else{
        		onHand_StockList = entity.mSelectStock.read(conn,lowerNodeStruct);
        		need_QTYList = entity.mSelectNeed_QTYReverse.read(conn,lowerNodeStruct);
        	}
            if (onHand_StockList != null && !onHand_StockList.isEmpty() && need_QTYList != null && !need_QTYList.isEmpty()) {
				onHand_Stock = ((AE0090040Struct) onHand_StockList.get(0)).getONHAND_STOCK();
				need_QTY = ((AE0090040Struct) need_QTYList.get(0)).getLower_NEED_QTY();
				lowerNodeStruct.setONHAND_STOCK(onHand_Stock);
				lowerNodeStruct.setLower_NEED_QTY(need_QTY);
			}
            setStruct2XML(lowerNodeElement, lowerNodeStruct, lowerNodeId, lowerTreeLevel,
                    upperNodeId);
            // 下位レベルノードを展開（再帰的にツリーを展開する）
            lowerNodeId = expandTree(lowerNodeElement, lowerNodeStruct, lowerNodeId,
                    lowerNodeId + 1, maxNodeId, lowerTreeLevel + 1, maxLevel);
            
            
        }

        return lowerNodeId;
    }

    /**
     * 下位レベルノードの一覧を取得します。
     *
     * @param  itemCd 品目番号
     * @return 下位レベルノードの一覧
     * @throws SQLException DBアクセスに失敗
     * @throws ParseException 日付の形式変換に失敗
     */
    private List getLowerNodeList(String itemCd)
            throws SQLException, ParseException
    {
        if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
            // 正展開の場合
            if (_targetDate == null || _targetDate.equals("") == true) {
                // 対象日付なしの場合
                return _psMaint.getCompPsList(itemCd);
            } else {
                // 対象日付ありの場合
                return _psMaint.getCompPsList(itemCd, _targetDate);
            }
        } else {
            // 逆展開の場合
            if (_targetDate == null || _targetDate.equals("") == true) {
                // 対象日付なしの場合
                return _psMaint.getParentPsList(itemCd);
            } else {
                // 対象日付ありの場合
                return _psMaint.getParentPsList(itemCd, _targetDate);
            }
        }
    }

    /** 正展開 
     * @param repository 製品構成リポジトリ
     * @param item 親品目
     * @param deployLevel 展開レベル
     * @param no 階層レベル
    */
    public void getDeploy(ProductStructureRepository repository, 
          String item, Integer deployLevel, Integer no, AE0090040Struct qtyStruct)
     throws SQLException, FoundationException
    {
     // 子品目番号一覧取得
     ArrayList itemList = repository.orderDeployment(item);
     checkItemList(itemList);
   
     // 親品目と子品目の構成情報取得
     ArrayList deployList = new ArrayList(0);
     AE0090040Struct workStruct = new AE0090040Struct();
     workStruct.setTarget_ITEM_CD(item);
     workStruct.setTargetDate(struct.getTargetDate());
     for(int i = 0; i < itemList.size(); i++){
      workStruct.setCOMP_ITEM_CD((String)itemList.get(i));
      List workList = entity.mSelectM_PS_F.read(conn, workStruct);
      for(int t = 0; t < workList.size(); t++){ 
       	  AE0090040Struct tempStruct = new AE0090040Struct();
     	  tempStruct = (AE0090040Struct)workList.get(t);
     	  
     	  //必要数設定
   		  if(struct.getNEED_QTY() == null ||  "".equals(struct.getNEED_QTY()))
 		  {
 		    qtyStruct.setNEED_QTY("0");
 		  }
     	  tempStruct.setUpper_ITEM_CD(tempStruct.getPARENT_ITEM_CD());
     	  tempStruct.setUpper_NEED_QTY(qtyStruct.getNEED_QTY());
     	  tempStruct.setLower_ITEM_CD(tempStruct.getCOMP_ITEM_CD());
     	  tempStruct.setPLANT_CD(struct.getPLANT_CD());
          tempStruct.setTERM2STARTDATE(struct.getTERM2STARTDATE());    

   		  
    	  // 必要数を計算
          String needQTY = null;
          List needQTYList = entity.mSelectNeed_QTY.read(conn,tempStruct);
          if(needQTYList != null && !needQTYList.isEmpty()){
        	  needQTY = ((AE0090040Struct)needQTYList.get(0)).getLower_NEED_QTY();
          }else{
        	  needQTY = "0";
          }
          
          //在庫単位区分を取得
          String unit_QTY_Typ = null;
          List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,tempStruct);
          if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
          	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
          }
          //整数管理品目の場合は切上げ
          if("1".equals(unit_QTY_Typ)&& !Calculate.isInteger(needQTY)){
            tempStruct.setNEED_QTY(Calculate.ceil(needQTY,0));
       	    ceilflg = true;
          }else{
        	tempStruct.setNEED_QTY(needQTY);
          }
          
    	  // 在庫数を計算
          String handQTY = null;
          List handQTYList = entity.mSelectStock.read(conn,tempStruct);
          if(handQTYList != null && !handQTYList.isEmpty()){
        	  handQTY = ((AE0090040Struct)handQTYList.get(0)).getONHAND_STOCK();
          }
          
    	  // 入庫予定１を計算
          String odrQTY1 = null;
          List odrQTY1List = entity.mSelectOdrQTY1.read(conn,tempStruct);
          if(odrQTY1List != null && !odrQTY1List.isEmpty()){
          	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
          }
          // 入庫予定2を計算
          String odrQTY2 = null;
          List odrQTY2List = entity.mSelectOdrQTY2.read(conn,tempStruct);
          if(odrQTY2List != null && !odrQTY2List.isEmpty()){
          	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
          }
          //在庫数、入庫予定１、入庫予定2を設定
          tempStruct.setUNIT_QTY(handQTY);
          tempStruct.setIN_UNIT_1(odrQTY1);
          tempStruct.setIN_UNIT_2(odrQTY2);
          workList.set(t, tempStruct);
          deployList.add((AE0090040Struct)(workList.get(t)));
      }
     }
   
     // 展開レベルチェック
     if(deployLevel.intValue() <= 1){
      for(int i = 0; i < deployList.size(); i++){
       AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
       noStruct.setNO(no.toString());
       _deployList.add(deployList.get(i));
      }
     }
     else{
      // 構成情報から更に下の子品目取得
      for(int i = 0; i < deployList.size(); i++){
       AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
       noStruct.setNO(no.toString());
       _deployList.add(deployList.get(i));
       getDeploy(repository, 
           ((AE0090040Struct)deployList.get(i)).getCOMP_ITEM_CD(),
           new Integer(deployLevel.intValue() - 1),
           new Integer(no.intValue() + 1),
           (AE0090040Struct)deployList.get(i));
      }
     }
    }
    
    /** 逆展開 
     * @param repository 製品構成リポジトリ
     * @param item 子品目
     * @param deployLevel 展開レベル
     * @param no 階層レベル
    */
    public void getReverseDeploy(ProductStructureRepository repository, 
            String item, Integer deployLevel, Integer no, AE0090040Struct qtyStruct)
    throws SQLException, FoundationException
   {
    // 子品目番号一覧取得
    ArrayList itemList = repository.reverseDeployment(item); 
    checkItemList(itemList);
  
    // 親品目と子品目の構成情報取得
    ArrayList deployList = new ArrayList(0);
    AE0090040Struct workStruct = new AE0090040Struct();
    workStruct.setCOMP_ITEM_CD(item);
    workStruct.setTargetDate(struct.getTargetDate());
    for(int i = 0; i < itemList.size(); i++){
     workStruct.setTarget_ITEM_CD((String)itemList.get(i));
     List workList = entity.mSelectM_PS_F.read(conn, workStruct);
     for(int t = 0; t < workList.size(); t++){ 
      	  AE0090040Struct tempStruct = new AE0090040Struct();
    	  tempStruct = (AE0090040Struct)workList.get(t);
    	  
     	  //必要数設定
   		  if(struct.getNEED_QTY() == null ||  "".equals(struct.getNEED_QTY()))
 		  {
 		    qtyStruct.setNEED_QTY("0");
 		  }
    	  tempStruct.setUpper_ITEM_CD(tempStruct.getCOMP_ITEM_CD());
     	  tempStruct.setUpper_NEED_QTY(qtyStruct.getNEED_QTY());
    	  tempStruct.setLower_ITEM_CD(tempStruct.getPARENT_ITEM_CD());
    	  tempStruct.setPLANT_CD(struct.getPLANT_CD());
          tempStruct.setTERM2STARTDATE(struct.getTERM2STARTDATE());   
          
          
    	  // 必要数を計算
          String needQTY = null;
          List needQTYList = entity.mSelectNeed_QTYReverse.read(conn,tempStruct);
          if(needQTYList != null && !needQTYList.isEmpty()){
        	  needQTY = ((AE0090040Struct)needQTYList.get(0)).getLower_NEED_QTY();
          }else{
        	  needQTY = "0";
          }
          
          //在庫単位区分を取得
          String unit_QTY_Typ = null;
          List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,tempStruct);
          if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
          	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
          }
          //整数管理品目の場合は切上げ
          if("1".equals(unit_QTY_Typ)&& !Calculate.isInteger(needQTY)){
            tempStruct.setNEED_QTY(Calculate.ceil(needQTY,0));
       	    ceilflg = true;
          }else{
        	tempStruct.setNEED_QTY(needQTY);
          }
          
   	     // 在庫数を計算
         String handQTY = null;
         List handQTYList = entity.mSelectStock.read(conn,tempStruct);
         if(handQTYList != null && !handQTYList.isEmpty()){
       	  handQTY = ((AE0090040Struct)handQTYList.get(0)).getONHAND_STOCK();
         }
         
   	     // 入庫予定１を計算
         String odrQTY1 = null;
         List odrQTY1List = entity.mSelectOdrQTY1.read(conn,tempStruct);
         if(odrQTY1List != null && !odrQTY1List.isEmpty()){
         	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
         }
         // 入庫予定2を計算
         String odrQTY2 = null;
         List odrQTY2List = entity.mSelectOdrQTY2.read(conn,tempStruct);
         if(odrQTY2List != null && !odrQTY2List.isEmpty()){
         	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
         }
         //在庫数、入庫予定１、入庫予定2を設定
         tempStruct.setUNIT_QTY(handQTY);
         tempStruct.setIN_UNIT_1(odrQTY1);
         tempStruct.setIN_UNIT_2(odrQTY2);
         workList.set(t, tempStruct);
         deployList.add((AE0090040Struct)(workList.get(t)));
     }
    }
  
    // 展開レベルチェック
    if(deployLevel.intValue() <= 1){
     for(int i = 0; i < deployList.size(); i++){
      AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
      noStruct.setNO(no.toString());
      _deployList.add(deployList.get(i));
     }
    }
    else{
     // 構成情報から更に上の親品目取得
     for(int i = 0; i < deployList.size(); i++){
      AE0090040Struct noStruct = (AE0090040Struct)deployList.get(i);
      noStruct.setNO(no.toString());
      _deployList.add(deployList.get(i));
      getReverseDeploy(repository, 
          ((AE0090040Struct)deployList.get(i)).getPARENT_ITEM_CD(),
          new Integer(deployLevel.intValue() - 1),
          new Integer(no.intValue() + 1),
          (AE0090040Struct)deployList.get(i));
     }
    }
   }

    /** 重複チェック
     * @param itemList 重複チェックする品目リスト
    */
    private void checkItemList(ArrayList itemList)
    {
     List workList = new ArrayList(0);
     for(int i = 0; i < itemList.size(); i++){
      boolean result =true;
      String item_cd = (String)itemList.get(i);
      for(int t = 0; t < workList.size(); t++){
       if(item_cd.equals((String)workList.get(t)) == true)
        result = false;
      }
      if(result == true)
       workList.add(item_cd);
     }
   
     itemList.clear();
     for(int i = 0; i < workList.size(); i++)
      itemList.add(workList.get(i));
    }
    
    /**
     * 品目番号に対する品目名を取得します。
     *
     * @param  itemCd 品目番号
     * @return 品目名
     * @throws FoundationException
     * @throws SQLException DBアクセスに失敗
     * @throws AE0090040NoDataException DBアクセスに失敗
     */
    private String getItemName(String itemCd)
            throws FoundationException, SQLException, AE0090040NoDataException
    {
        AE0090040Struct workStruct = new AE0090040Struct();
        workStruct.setLower_ITEM_CD(itemCd);
        List workList = entity.mSelectItem.read(conn, workStruct);
        if (workList == null || workList.isEmpty()) {
            // 品目番号が存在しない場合
            throw new AE0090040NoDataException(new ExpjMessage("ZZ01006",
                    "M_ITEM.ITEM_CD:" + itemCd));
        }
        workStruct = (AE0090040Struct)workList.get(0);
        if (workStruct.getLower_ITEM_NAME() == null) {
            return "";
        } else {
            return workStruct.getLower_ITEM_NAME();
        }
    }

    /**
     * 環境変数を設定します。
     *
     * @throws FoundationException
     * @throws ExpjException サーバーエラー
     */
    private void setEnvironment()
            throws FoundationException, ExpjException
    {
        try {
            PrivateConfig pc = new PrivateConfig(conn);

            // 最大展開レベルを取得
            _intMaxDevelopLevel = DEFAULT_MAX_DEVELOP_LEVEL;
            Integer maxDevelopLevel = pc.getNumber("MAX_DISPLAY_PS_LEVEL");
            if (maxDevelopLevel != null) {
                int i = maxDevelopLevel.intValue();
                if (i < 0) {
                    // 警告：最大展開レベルは0以上を設定してください。
                    ExpjMessage emsg = new ExpjMessage("AA20017");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, getsysUSER_CD());
                } else {
                    _intMaxDevelopLevel = i;
                }
            }

            // デフォールト初期展開レベルを取得
            _intInitDevelopLevel = DEFAULT_INIT_DEVELOP_LEVEL;
            Integer initDevelopLevel = pc.getNumber("INIT_DISPLAY_PS_LEVEL");
            if (initDevelopLevel != null) {
                int i = initDevelopLevel.intValue();
                if (i < 0) {
                    // 警告：初期展開レベルは0以上を設定してください。
                    ExpjMessage emsg = new ExpjMessage("AA20016");
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, getsysUSER_CD());
                } else if (i > _intMaxDevelopLevel) {
                    // 警告：初期展開レベルは最大展開レベル（{0}）以内を指定してください。
                    ExpjMessage emsg = new ExpjMessage("AA20001",
                            String.valueOf(_intMaxDevelopLevel));
                    msgStruct.addError(emsg);
                    sysLog.warning(emsg, getsysUSER_CD());
                    _intInitDevelopLevel = _intMaxDevelopLevel;
                } else {
                    _intInitDevelopLevel = i;
                }
            }

            // 最大読込行数を設定
            _intMaxReadNum = sp.getMaxLine(conn, 10);

        } catch (SQLException se) {
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
    }

    /**
     * 画面を初期化します。
     * @throws ParseException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     * @throws FoundationException 
     * @throws SQLException 
     */
    private void initializeScreen()
    {
        // 読込状態（初期状態）を設定
        setReadStatus(INITIAL);
        // structを初期化
        struct.initialize();
        // listを初期化
        if (list != null) {
            list.clear();
        }
        // ツリーを初期化
        flashTree = new XmlDocument();
        // 所期展開レベルを設定
        struct.setInitLevel(String.valueOf(_intInitDevelopLevel));
        // 最大展開レベルを設定
        struct.seth_MaxLevel(String.valueOf(_intMaxDevelopLevel));
    }
    /**
     * 画面初期化の場合、期間2起点日を計算
     * 
     */
    private void initializeStartDate() throws FoundationException, SQLException{
    	// 工場コードを取得
        String plantCd = getsysPLANT_CD();
        struct.setPLANT_CD(plantCd);
    	// 業務運用日を取得
        String businessOprDate = DateCtrl.getBusinessOprDate(conn,plantCd);
        if(businessOprDate == null){
        	setErrorMessage("AB00026");
        	setErrorParameter("SYS_DATE_CTRL","BUSINESS_OPR_DATE",plantCd);
        	return ;
        }
        // 対象日付を取得
        struct.setTargetDate(businessOprDate);
    	// 入庫予定判定期間〔日〕〔月〕を取得
        String schedulesTerm = getReceiptTerm();
        // 入庫予定判定数を取得
        String schedulesNumber = getReceiptNumber();      
        // 期間2起点日を計算
        String Term2StartDate = null;
        if(schedulesTerm != null && schedulesNumber != null){
        	try{
            	businessOprDate = DateTool.addDay(businessOprDate,"1");
            	if("1".equals(schedulesTerm)){
            		Term2StartDate = DateTool.addMonth(businessOprDate,schedulesNumber);
                }else{
                	Term2StartDate = DateTool.addDay(businessOprDate,schedulesNumber);
                }
            }catch(ParseException e){
            	setErrorMessage("AE05054");
            }
            struct.setTERM2STARTDATE(Term2StartDate);
        }
    }
    /**
     * 入庫予定判定期間〔日〕〔月〕を取得
     * @throws SQLException 
     * @throws FoundationException 
     * 
     */
    private String getReceiptTerm() throws FoundationException, SQLException{
    	// 入庫予定判定期間〔日〕〔月〕を取得、1:月、2：日
    	List schedulesTermList = entity.mSelectReceiptTerm.read(conn,struct);
        String schedulesTerm = null;
        if(schedulesTermList == null || schedulesTermList.isEmpty()){
        	setErrorMessage("AE05051");
        	setErrorParameter("SYS_PARAMS","VALUE","RECEIPT_SCHEDULES_TERM");
        }else{
        	schedulesTerm = ((AE0090040Struct)schedulesTermList.get(0)).getRECEIPT_SCHEDULES_TERM();
        	if(!("1".equals(schedulesTerm) || "2".equals(schedulesTerm))){
        		schedulesTerm = null;
        		setErrorMessage("AE05053");
        		setErrorParameter("SYS_PARAMS","VALUE",schedulesTerm);
        	}
        }
        return schedulesTerm;
    }
    /**
     * 入庫予定判定数を取得
     * 
     * @return String
     * @throws FoundationException
     * @throws SQLException
     */
    private String getReceiptNumber() throws FoundationException, SQLException{
    	List schedulesNumberList = entity.mSelectReceiptNumber.read(conn,struct);
        String schedulesNumber = null;
        if(schedulesNumberList == null || schedulesNumberList.isEmpty()){
        	setErrorMessage("AE05052");
        	setErrorParameter("SYS_PARAMS","VALUE","RECEIPT_SCHEDULES_NUMBER");
        }else{
        	schedulesNumber = ((AE0090040Struct)schedulesNumberList.get(0)).getRECEIPT_SCHEDULES_NUMBER();
        	if(schedulesNumber != null && Calculate.isInteger(schedulesNumber)){
        		
        	}else{
        		schedulesNumber = null;
        		setErrorMessage("AE05056");
        		setErrorParameter("SYS_PARAMS","VALUE",schedulesNumber);
        	}
        }
        return schedulesNumber;
    }
    /**
     * 詳細画面データのStructを初期化します。
     */
    private void initializeDetStruct()
    {
    	struct.setDet_Parent_ITEM_CD(null);
        struct.setDet_Parent_ITEM_NAME(null);
        struct.setDet_Comp_ITEM_CD(null);
        struct.setDet_Comp_ITEM_NAME(null);
        struct.setDet_Comp_Need_QTY(null);
        struct.setDet_Comp_ONHAND_QTY(null);
        struct.setRECEIPT_SCHEDULES_NUMBER1(null);
        struct.setRECEIPT_SCHEDULES_NUMBER2(null);
        struct.setDet_Comp_STOCK_UNIT(null);
        struct.setDet_Comp_PRODUCT_TYP(null);
        struct.setDet_Comp_OUTSIDE_TYP(null);
        struct.setDet_Comp_MRP_ODR_TYP(null);
        struct.setDet_Comp_PS_UNIT_QTY(null);
        struct.setDet_Comp_ITEM_SPOIL(null);
        struct.setDet_Comp_PS_SPOIL(null);
        struct.setDet_Comp_EFF_PHASE_IN_DATE(null);
        struct.setDet_Comp_EFF_PHASE_OUT_DATE(null);
        struct.setDet_Comp_CONS_TYP(null);
      
    }

    /**
     * コンボボックスの値、値リスト、表示説明リストを渡すと、値に対応する表示説明を返します。
     *
     * @param  val コンボボックスの値
     * @param  valList コンボボックスの値リスト
     * @param  nameList コンボボックスの表示説明リスト
     * @return 値に対応する表示説明
     */
    private String getDisplayName(String val, List valList, List nameList)
    {
        if (val == null || val.equals("") == true) {
            return null;
        }
        int i = valList.indexOf(val);
        if (i == -1) {
            return null;
        } else {
            return (String)nameList.get(i);
        }
    }

    /**
     * 詳細画面データのStructを複写します。
     *
     * @param  detStruct AE0090040のStruct
     */
    private void copyDetStruct(AE0090040Struct detStruct)
    {
        struct.setDet_Parent_ITEM_CD(detStruct.getDet_Parent_ITEM_CD());
        struct.setDet_Parent_ITEM_NAME(detStruct.getDet_Parent_ITEM_NAME());
        struct.setDet_Comp_ITEM_CD(detStruct.getDet_Comp_ITEM_CD());
        struct.setDet_Comp_ITEM_NAME(detStruct.getDet_Comp_ITEM_NAME());
        struct.setDet_Comp_Need_QTY(detStruct.getDet_Comp_Need_QTY());
        struct.setDet_Comp_ONHAND_QTY(detStruct.getDet_Comp_ONHAND_QTY());
        struct.setRECEIPT_SCHEDULES_NUMBER1(detStruct.getRECEIPT_SCHEDULES_NUMBER1());
        struct.setRECEIPT_SCHEDULES_NUMBER2(detStruct.getRECEIPT_SCHEDULES_NUMBER2());
        struct.setDet_Comp_STOCK_UNIT(detStruct.getDet_Comp_STOCK_UNIT());
        struct.setDet_Comp_PRODUCT_TYP(getDisplayName(detStruct.getDet_Comp_PRODUCT_TYP(),_detProductTypValList,_detProductTypNameList));
        struct.setDet_Comp_OUTSIDE_TYP(getDisplayName(detStruct.getDet_Comp_OUTSIDE_TYP(),_detOutsideTypValList, _detOutsideTypNameList));
        struct.setDet_Comp_MRP_ODR_TYP(getDisplayName(detStruct.getDet_Comp_MRP_ODR_TYP(),_detMrpOdrTypValList, _detMrpOdrTypNameList));
        struct.setDet_Comp_PS_UNIT_QTY(detStruct.getDet_Comp_PS_UNIT_QTY());
        struct.setDet_Comp_ITEM_SPOIL(detStruct.getDet_Comp_ITEM_SPOIL());
        struct.setDet_Comp_PS_SPOIL(detStruct.getDet_Comp_PS_SPOIL());
        struct.setDet_Comp_EFF_PHASE_IN_DATE(detStruct.getDet_Comp_EFF_PHASE_IN_DATE());
        struct.setDet_Comp_EFF_PHASE_OUT_DATE(detStruct.getDet_Comp_EFF_PHASE_OUT_DATE());
        struct.setDet_Comp_CONS_TYP(getDisplayName(detStruct.getDet_Comp_CONS_TYP(),_detConsTypValList,_detConsTypNameList));
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
			// TODO: ユーザ定義のコードを記述してください
		try {
			list = entity.mSelectOdrQTY1.read(conn, struct);
			list = entity.mSelectOdrQTY2.read(conn, struct);
			list = entity.mSelectReceiptTerm.read(conn, struct);
			list = entity.mSelectReceiptNumber.read(conn, struct);
			list = entity.mSelectItem.read(conn, struct);
			list = entity.mSelectDetail.read(conn, struct);
			list = entity.mSelectStock.read(conn, struct);
			list = entity.mSelectUNIT_QTY_TYP.read(conn, struct);
			list = entity.mSelectNeed_QTY.read(conn, struct);
			list = entity.mSelectNeed_QTYReverse.read(conn, struct);
			list = entity.mTreeSelect.read(conn, struct);
			list = entity.mselectM_ITEM.read(conn, struct);
			list = entity.mselectSYS_DATE_CTRL.read(conn, struct);
			list = entity.mselectM_PS.read(conn, struct);
			list = entity.mselect_M_ITEM_VIEW.read(conn, struct);
			list = entity.mselectM_PS_Forward.read(conn, struct);
			list = entity.mSelectM_PS_F.read(conn, struct);
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * FlashTree初期化ボタン押下時に実行される処理です。
	 *
	 */
	public void controlFlashTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");
			//{{user_implement_dev:<controlFlashTree>
			
		
                //}}user_implement_dev:<controlFlashTree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
		// 環境変数を設定
        setEnvironment();
        try{
        	initializeScreen();
        	initializeStartDate();
        }catch (SQLException se) {
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006");
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlClear>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * この品目で正展開ボタン押下時に実行される処理です。
	 *
	 */
	public void controlShowS_Tree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowS_Tree");
			//{{user_implement_dev:<controlShowS_Tree>
		// この品目で正展開用のパラメタを設定
        struct.setTarget_ITEM_CD(struct.getLower_ITEM_CD());
        struct.setDEVELOP_TYP(DEVELOP_NORMAL);
        // この品目で正展開用のパラメタで再読込して、画面を表示
        controlTreeSelect();
                //}}user_implement_dev:<controlShowS_Tree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowS_Tree");

		return;
	}

	/**
	 * この品目で逆展開ボタン押下時に実行される処理です。
	 *
	 */
	public void controlShowR_Tree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowR_Tree");
			//{{user_implement_dev:<controlShowR_Tree>
		// この品目で逆展開用のパラメタを設定
        struct.setTarget_ITEM_CD(struct.getLower_ITEM_CD());
        struct.setDEVELOP_TYP(DEVELOP_REVERSE);

        // この品目で逆展開用のパラメタで再読込して、画面を表示
        controlTreeSelect();
                //}}user_implement_dev:<controlShowR_Tree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowR_Tree");

		return;
	}

	/**
	 * 詳細情報ボタン押下時に実行される処理です。
	 *
	 */
	public void controlShowDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");
			//{{user_implement_dev:<controlShowDetail>
		String tableAndKeys = null;
        try {
            // 詳細情報画面の初期化
            initializeDetStruct();
            //必要数
            String Det_NeedQTY = null;
            //在庫単位区分を取得
            String unit_QTY_Typ = null;
            List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,struct);
            if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
            	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
            }
            if ("1".equals(struct.getid()) == true) {
                // 最上位ノードの場合
                // 親品目番号、品目名、品目手配区分、品目内外作区分のみを表示
                tableAndKeys = "M_ITEM:" + struct.getLower_ITEM_CD();
                if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                    // 正展開の場合
                    // 親品目番号、品目名、品目手配区分、品目内外作区分のみを表示
                    struct.setDet_Parent_ITEM_CD(struct.getLower_ITEM_CD());
                    struct.setDet_Parent_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
                } else {
                    // 逆展開の場合
                    // 子品目番号、品目名、品目手配区分、品目内外作区分のみを表示
                    struct.setDet_Comp_ITEM_CD(struct.getLower_ITEM_CD());
                    struct.setDet_Comp_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
                }
            } else {
                // 最上位ノード以外の場合
                // すべての項目を表示
                AE0090040Struct workStruct = new AE0090040Struct();
                if (struct.getDEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                    // 正展開の場合
                    workStruct.setDet_Parent_ITEM_CD(struct.getUpper_ITEM_CD());
                    workStruct.setDet_Comp_ITEM_CD(struct.getLower_ITEM_CD());
                } else {
                    // 逆展開の場合
                    workStruct.setDet_Parent_ITEM_CD(struct.getLower_ITEM_CD());
                    workStruct.setDet_Comp_ITEM_CD(struct.getUpper_ITEM_CD());
                }
                workStruct.setPS_EDITION(struct.getPS_EDITION());
                tableAndKeys = "M_PS,M_ITEM:" + workStruct.getDet_Parent_ITEM_CD() + ","
                        + workStruct.getDet_Comp_ITEM_CD() + "," + workStruct.getPS_EDITION();
                List workList = entity.mSelectDetail.read(conn, workStruct);
                if (workList == null || workList.isEmpty()) {
                    throw new AE0090040NoDataException(new ExpjMessage("ZZ01006", tableAndKeys));
                }
                copyDetStruct((AE0090040Struct)workList.get(0));
            }
            // 必要数を設定
            Det_NeedQTY = struct.getLower_NEED_QTY();
            if("1".equals(unit_QTY_Typ)&& Calculate.isNumeric(Det_NeedQTY)==true){
            	Det_NeedQTY = Calculate.ceil(Det_NeedQTY,0);
        		setWarningMessage("AE00034");
        	}
            struct.setDet_Comp_Need_QTY(Det_NeedQTY);
            // 在庫数を設定
            struct.setDet_Comp_ONHAND_QTY(struct.getONHAND_STOCK());
            // 入庫予定１を計算
            String odrQTY1 = null;
            List odrQTY1List = entity.mSelectOdrQTY1.read(conn,struct);
            if(odrQTY1List != null && !odrQTY1List.isEmpty()){
            	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
            }
            // 入庫予定2を計算
            String odrQTY2 = null;
            List odrQTY2List = entity.mSelectOdrQTY2.read(conn,struct);
            if(odrQTY2List != null && !odrQTY2List.isEmpty()){
            	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
            }
            //入庫予定１と入庫予定2を設定
            struct.setRECEIPT_SCHEDULES_NUMBER1(odrQTY1);
            struct.setRECEIPT_SCHEDULES_NUMBER2(odrQTY2);
        } catch (AE0090040NoDataException nde) {
            // 警告：対象データが存在しません。
            ExpjMessage emsg = new ExpjMessage("ZZ06001");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (SQLException se) {
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006", tableAndKeys);
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlShowDetail>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");

		return;
	}

	/**
	 * 在庫参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlStockInquiry() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlStockInquiry");
			//{{user_implement_dev:<controlStockInquiry>
			
                //}}user_implement_dev:<controlStockInquiry>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlStockInquiry");

		return;
	}

	/**
	 * 発注計画メンテボタン押下時に実行される処理です。
	 *
	 */
	public void controlMaintenanceRequestOrderPlan() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlMaintenanceRequestOrderPlan");
			//{{user_implement_dev:<controlMaintenanceRequestOrderPlan>
			
                //}}user_implement_dev:<controlMaintenanceRequestOrderPlan>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlMaintenanceRequestOrderPlan");

		return;
	}

	/**
	 * ツリー読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlTreeSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlTreeSelect");
			//{{user_implement_dev:<controlTreeSelect>
			// TODO: ユーザ定義のコードを記述してください
		Element rootElement = null;
        Element topNodeElement = null;
        try {
            // 読込キーを残して、Structをクリア
        	 String savePlantCD = struct.getPLANT_CD();
        	String saveTerm2StartDate = struct.getTERM2STARTDATE();
        	String saveTargetItemCd = struct.getTarget_ITEM_CD();
        	String saveDevelopTyp = struct.getDEVELOP_TYP();
            String saveTargetDate = struct.getTargetDate();
            String saveInitLevel = struct.getInitLevel();
            String saveNeedQTY = struct.getNEED_QTY_1();
            initializeScreen();
            struct.setPLANT_CD(savePlantCD);
            struct.setTERM2STARTDATE(saveTerm2StartDate);
            struct.setTarget_ITEM_CD(saveTargetItemCd);
            struct.setDEVELOP_TYP(saveDevelopTyp);
            struct.setTargetDate(saveTargetDate);
            struct.setInitLevel(saveInitLevel);
            struct.setNEED_QTY_1(saveNeedQTY);
            if (savePlantCD != null && savePlantCD.length() != 0) {
				if (entity.mSelectPlant.check(conn, struct) == false) {
					setErrorMessage("ZZ09028");
					setErrorParameter("M_PLANT", "PLANT_CD", savePlantCD);
					return;
				}
			}
            // 最大展開レベルチェック
            int initLevel = Integer.parseInt(struct.getInitLevel());
            if (initLevel > _intMaxDevelopLevel) {
                // ＊クライアントでチェックするので、ここに来ることはない
                // 最大展開レベルを超えた場合
                throw new AE0090040MaxLevelException();
            }
            // 製品構成メンテナンス用オブジェクトを構築
            beginTransaction();     // システム時刻を取得
            _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                    struct.getsSysdate());
            // 対象日付を設定
            _targetDate = struct.getTargetDate();
            // 品目番号、品目名を設定
            struct.setLower_ITEM_CD(struct.getTarget_ITEM_CD());
            struct.setLower_ITEM_NAME(getItemName(struct.getLower_ITEM_CD()));
            struct.setUpper_NEED_QTY(saveNeedQTY);
            struct.setLower_NEED_QTY(saveNeedQTY);
            // ドキュメントRootを作成、ツリー用XMLに追加
            rootElement = flashTree.createElement("root");
            flashTree.appendChild(rootElement);
            // ドキュメントRootに初期展開レベルを設定
            rootElement.setAttribute("init_level", struct.getInitLevel());
            // 最上位レベルノードを生成、ツリー用XMLに追加
            topNodeElement = flashTree.createElement("node");
            rootElement.appendChild(topNodeElement);
            // structから最上位レベルノードの各種属性データを設定
            // 最上位レベルノードは、Lower_ITEM_CDおよびLower_ITEM_NAMEのみ
            struct.setlabel(struct.getLower_ITEM_CD() + "," + struct.getLower_ITEM_NAME());
            List topNodeOnHand_QTYList = null;
            String onHand_Stock = "0";
            topNodeOnHand_QTYList = entity.mSelectStock.read(conn,struct);
            if(topNodeOnHand_QTYList != null && !topNodeOnHand_QTYList.isEmpty()){
            	onHand_Stock =((AE0090040Struct)topNodeOnHand_QTYList.get(0)).getONHAND_STOCK();
            	struct.setONHAND_STOCK(onHand_Stock);
            }
            // ＊注意＊
            // Flash 部品の仕様で、ノードのレベルとして「1」を基点とする必要があります。
            setStruct2XML(topNodeElement, struct, 1, 1, 0);
            // 下位レベルノードを展開（再帰的にツリーを展開する）
            // ＊注意＊
            // ノードのレベルの基点が「1」なので、
            // 初期展開レベルを「+1」しておく必要があります。
            expandTree(topNodeElement, struct, 1, 2, _intMaxReadNum, 2, initLevel + 1);
            // 読込状態（読込成功）を設定
            setReadStatus(NORMAL);
        } catch (AE0090040MaxLevelException mle) {
            // ＊クライアントでチェックするので、ここに来ることはない
            // 読込状態（読込失敗）を設定
            setReadStatus(ERROR);
            // 警告：初期展開レベルは最大展開レベル（{0}）以内を指定してください。
            ExpjMessage emsg = new ExpjMessage("AA20001", String.valueOf(_intMaxDevelopLevel));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            return;
        } catch (AE0090040NoDataException nde) {
            // 読込状態（読込失敗）を設定
            setReadStatus(ERROR);
            // 警告：対象データが存在しません。
            ExpjMessage emsg = new ExpjMessage("ZZ06001");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (AE0090040MaxReadException mle) {
            // 読込状態（最大行数オーバー）を設定
            setReadStatus(TOO_MANY);
            // 最上位行のみを展開不可行として表示
            rootElement.removeChild(topNodeElement);
            Element stopNodeElement = flashTree.createElement("node");
            rootElement.appendChild(stopNodeElement);
            setStruct2XML(stopNodeElement, struct, 1, 1, 0);
            stopNodeElement.setAttribute("terminated", "true");
            // 警告：表示件数が規定値(%0)を超えています。条件を変更してやり直してください。
            ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_intMaxReadNum));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            stopNodeElement.setAttribute("terminate_comment",
                    emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
            emsg = mle.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (ParseException pe) {
            // 読込状態（読込失敗）を設定
            setReadStatus(ERROR);
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(pe, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            throw ee;
        } catch (SQLException se) {
            // 読込状態（読込失敗）を設定
            setReadStatus(ERROR);
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlTreeSelect>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlTreeSelect");

		return;
	}

	/**
	 * 一覧読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlViewSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlViewSelect");
			//{{user_implement_dev:<controlViewSelect>
			// TODO: ユーザ定義のコードを記述してください
		
		try {
			
		ceilflg=false;	
		//工場コードチェック
		 if (struct.getPLANT_CD() != null && struct.getPLANT_CD().length() != 0) {
				if (entity.mSelectPlant.check(conn, struct) == false) {
					setErrorMessage("ZZ09028");
					setErrorParameter("M_PLANT", "PLANT_CD", struct.getPLANT_CD());
					return;
				}
			}
		 
		 Integer inLevel;
         // 入力した展開レベルをInteger型に変換して取得する
		 inLevel = IntegerConverter.Convert(struct.getInitLevel());
		 
		 
		AE0090040Struct tempstruct = new AE0090040Struct();
			
        // 構成情報リストクリア
        _deployList.clear(); 
      
         List workList = null;	   // 対象品目情報格納                         
     	
         // 対象品目情報取得
         workList = entity.mselectM_ITEM.read(conn, struct);
         if(workList.size() <= 0){       // 対象品目の取得失敗
          setReadStatus(INITIAL);
      
          String Message = "M_ITEM.ITEM_CD:" + struct.getTarget_ITEM_CD();
          setErrorMessage("ZZ06001", Message);
         } else {
          setReadStatus(NORMAL);
          tempstruct = (AE0090040Struct)workList.get(0);
          tempstruct.setPARENT_ITEM_CD(((AE0090040Struct)workList.get(0)).getTarget_ITEM_CD());
          tempstruct.setPARENT_ITEM_NAME(((AE0090040Struct)workList.get(0)).getITEM_NAME());
          tempstruct.setNO("1");          
          tempstruct.setNEED_QTY(struct.getNEED_QTY_1());

          
     	  tempstruct.setLower_ITEM_CD(((AE0090040Struct)workList.get(0)).getTarget_ITEM_CD());
     	  tempstruct.setPLANT_CD(struct.getPLANT_CD());
          tempstruct.setTERM2STARTDATE(struct.getTERM2STARTDATE());   

          //在庫単位区分を取得
          String unit_QTY_Typ = null;
          List unit_QTY_TypList = entity.mSelectUNIT_QTY_TYP.read(conn,tempstruct);
          if(unit_QTY_TypList != null && !unit_QTY_TypList.isEmpty()){
          	unit_QTY_Typ =((AE0090040Struct)unit_QTY_TypList.get(0)).getUNIT_QTY_TYP();	
          }
          if("1".equals(unit_QTY_Typ)&& Calculate.isNumeric(struct.getNEED_QTY_1())==true){
       	    tempstruct.setNEED_QTY(Calculate.ceil(struct.getNEED_QTY_1(),0));
       	    ceilflg = true;
          }
          
    	  // 在庫数を計算
          String handQTY = null;
          List handQTYList = entity.mSelectStock.read(conn,tempstruct);
          if(handQTYList != null && !handQTYList.isEmpty()){
        	  handQTY = ((AE0090040Struct)handQTYList.get(0)).getONHAND_STOCK();
          }
          
    	  // 入庫予定１を計算
          String odrQTY1 = null;
          List odrQTY1List = entity.mSelectOdrQTY1.read(conn,tempstruct);
          if(odrQTY1List != null && !odrQTY1List.isEmpty()){
          	odrQTY1 = ((AE0090040Struct)odrQTY1List.get(0)).getRECEIPT_SCHEDULES_NUMBER1();
          }
          // 入庫予定2を計算
          String odrQTY2 = null;
          List odrQTY2List = entity.mSelectOdrQTY2.read(conn,tempstruct);
          if(odrQTY2List != null && !odrQTY2List.isEmpty()){
          	odrQTY2 = ((AE0090040Struct)odrQTY2List.get(0)).getRECEIPT_SCHEDULES_NUMBER2();
          }        
          
          //在庫数、入庫予定１と入庫予定2を設定
          tempstruct.setUNIT_QTY(handQTY);
          tempstruct.setIN_UNIT_1(odrQTY1);
          tempstruct.setIN_UNIT_2(odrQTY2);

          
          _deployList.add(tempstruct);
          
         }
       
         // 製品構成リポジトリ作成
         ProductStructureRepository repository = new ProductStructureRepository(conn);
         struct.setNEED_QTY(struct.getNEED_QTY_1());
         //struct.setPLANT_CD(getsysPLANT_CD());
         

     	      	  

         
         
         //構成展開
         if("1".equals(struct.getDEVELOP_TYP()) && !"0".equals(struct.getInitLevel())){
             getDeploy(repository, struct.getTarget_ITEM_CD(), inLevel, new Integer(2),struct);
         }else if("2".equals(struct.getDEVELOP_TYP()) && !"0".equals(struct.getInitLevel())){
        	 getReverseDeploy(repository, struct.getTarget_ITEM_CD(), inLevel, new Integer(2),struct);        	 
         }
         // 画面遷移用展開区分の設定
         struct.seth_DEVELOP_TYP(struct.getDEVELOP_TYP());
         
         //切上げ品目があればワーニング
         if(ceilflg==true){
       		setWarningMessage("AE00173");
         }
         //排序
         if(this._deployList.size() == 0)
         {
         	return;
         }else{         
         	list = _deployList;
                     
	            // 表示行数制限値(SYS_SCREEN_PARM)を超えた場合エラー
	        	int maxLine = sp.getMaxLine(conn, 10);
	        	if ((maxLine != 0) && (list.size() > maxLine)) {
	        		setErrorMessage("ZZ01115", String.valueOf(maxLine));
	        		readStatus = TOO_MANY;
	        		list.clear();
	        		return;
	        	} 
         }
         
         
         
        } catch (SQLException se) {
            // 読込状態（読込失敗）を設定
            setReadStatus(ERROR);
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
         
        } catch(Exception e){
			e.printStackTrace();
        }
                //}}user_implement_dev:<controlViewSelect>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlViewSelect");

		return;
	}

	/**
	 * 有効在庫参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlValidStockInquiry() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlValidStockInquiry");
			//{{user_implement_dev:<controlValidStockInquiry>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlValidStockInquiry>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlValidStockInquiry");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlSubClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSubClear");
			//{{user_implement_dev:<controlSubClear>
			// TODO: ユーザ定義のコードを記述してください
		// 環境変数を設定
        setEnvironment();
        try {
        	initializeScreen();
        	initializeStartDate();
        } catch (SQLException se) {
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006");
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlSubClear>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlSubClear");

		return;
	}

	/**
	 * ツリー追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAddTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlAddTree");
			//{{user_implement_dev:<controlAddTree>
			// TODO: ユーザ定義のコードを記述してください
        Element rootElement = null;       
        try {
            // 最大展開レベルチェック
            int treeLevel = Integer.parseInt(struct.getlvl());
            // ＊注意＊
            //   ノードのレベルの基点が「1」なので、
            //   最大展開レベルを「+1」しておく必要があります。
            if (treeLevel + 1 > _intMaxDevelopLevel + 1) {
                // 最大展開レベルを超えた場合
                // ＊クライアントでチェックするので、ここに来ることはない
                throw new AE0090040MaxLevelException();
            }

            // 製品構成メンテナンス用オブジェクトを構築
            beginTransaction();     // システム時刻を取得
            _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(),
                    struct.getsSysdate());
            // 対象日付の設定
            _targetDate = struct.getTargetDate();

            // ツリー用XMLドキュメントを再構築
            flashTree = new XmlDocument();

            // ドキュメントRootを作成、ツリー用XMLに追加
            rootElement = flashTree.createElement("root");
            flashTree.appendChild(rootElement);
            // ドキュメントRootにツリー追加対象idを設定
            rootElement.setAttribute("target", struct.getid());

            // 最大読込行数を設定
            int maxReadNum = _intMaxReadNum;
            int nodeId = Integer.parseInt(struct.getmaxid());
            if (maxReadNum > 0) {
                maxReadNum += nodeId;
            } else {
                maxReadNum = 0;
            }

            // 下位レベルノードを展開
            //   ここでは、１レベルだけノードを展開する。
            //   そのため、最大展開レベルに現在のレベル＋１を渡している。
            expandTree(rootElement, struct, Integer.parseInt(struct.getid()), nodeId + 1,
                    maxReadNum, treeLevel + 1, treeLevel + 1);

        } catch (AE0090040MaxLevelException mle) {
            // ＊クライアントでチェックするので、ここに来ることはない
            // 警告：最大展開レベル（{0}）を超えて展開することはできません。
            ExpjMessage emsg = new ExpjMessage("AA20018", String.valueOf(_intMaxDevelopLevel));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            return;
        } catch (AE0090040NoDataException nde) {
            // 警告：他の処理によってデータが書き換えられています。再試行してください。
            ExpjMessage emsg = new ExpjMessage("ZZ01105");
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            emsg = nde.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (AE0090040MaxReadException mle) {
            // 展開不可行として表示
            flashTree.removeChild(rootElement);
            Element stopNodeElement = flashTree.createElement("node");
            flashTree.appendChild(stopNodeElement);
            stopNodeElement.setAttribute("target", struct.getid());
            stopNodeElement.setAttribute("terminated", "true");
            // 警告：表示件数が規定値(%0)を超えています。条件を変更してやり直してください。
            ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_intMaxReadNum));
            msgStruct.addError(emsg);
            sysLog.warning(emsg, getsysUSER_CD());
            stopNodeElement.setAttribute("terminate_comment",
                    emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
            emsg = mle.getExpjMessage();
            if (emsg != null) {
                msgStruct.addError(emsg);
                sysLog.warning(emsg, getsysUSER_CD());
            }
            return;
        } catch (ParseException pe) {
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(pe, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            throw ee;
        } catch (SQLException se) {
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            if (_psMaint != null) {
                emsg = _psMaint.getErrorInfo();
                if (emsg != null) {
                    sysLog.severe(emsg, getsysUSER_CD());
                }
            }
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlAddTree>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlAddTree");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>

        // 環境変数を設定
        setEnvironment();

        try{
        	initializeScreen();
        	initializeStartDate();
        }catch (SQLException se) {
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006");
            sysLog.severe(emsg, getsysUSER_CD());
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AE0090");
		logger.entering("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			String SysMyCompany = SystemInformation.getSysMyCompanyCd();
			try{
			if(SysMyCompany==null||SysMyCompany.length()==0){
				throw new Exception();
			}
			}catch(Exception e){
				ExpjException ee = new ExpjException(e, "KQ00039");
				throw ee;
			}
			try {
                ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                // 展開区分のコンボボックスデータを設定
                ComboStruct developTyp = comboController.getData("DEVELOP_TYP");
                struct.setList_DEVELOP_TYP_val(developTyp.getValList());
                struct.setList_DEVELOP_TYP_name(developTyp.getExplanList());
                // 品目手配区分のコンボボックスデータを設定
                ComboStruct detMrpOdrTyp = comboController.getData("MRP_ODR_TYP");
                _detMrpOdrTypValList = detMrpOdrTyp.getValList();
                _detMrpOdrTypNameList = detMrpOdrTyp.getExplanList();
                // 内外作区分のコンボボックスデータを設定
                ComboStruct detOutsideTyp = comboController.getData("OUTSIDE_TYP");
                _detOutsideTypValList = detOutsideTyp.getValList();
                _detOutsideTypNameList = detOutsideTyp.getExplanList();
                //構成品目製品区分のコンボボックスデータを設定
                ComboStruct detProductTyp  =comboController.getData("PRODUCT_TYP");
                _detProductTypValList = detProductTyp.getValList();
                _detProductTypNameList = detProductTyp.getExplanList();
                //構成品目支給区分のコンボボックスデータを設定
                ComboStruct detConsTyp = comboController.getData("CONS_TYP");
                _detConsTypValList = detConsTyp.getValList();
                _detConsTypNameList = detConsTyp.getExplanList();
            } catch (SQLException se) {
                // エラー：サーバでエラーが発生しました。
                ExpjMessage emsg = new ExpjMessage("ZZ01106");
                sysLog.severe(emsg, getsysUSER_CD());
                ExpjException ee = new ExpjException(se, emsg);
                emsg = new ExpjMessage("ZZ01006", se.toString());
                sysLog.severe(emsg, getsysUSER_CD());
                throw ee;
            }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AE0090040Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("FlashTree") ) {
				controlFlashTree();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("ShowS_Tree") ) {
				controlShowS_Tree();
			} else if( button.equals("ShowR_Tree") ) {
				controlShowR_Tree();
			} else if( button.equals("ShowDetail") ) {
				controlShowDetail();
			} else if( button.equals("StockInquiry") ) {
				controlStockInquiry();
			} else if( button.equals("MaintenanceRequestOrderPlan") ) {
				controlMaintenanceRequestOrderPlan();
			} else if( button.equals("TreeSelect") ) {
				controlTreeSelect();
			} else if( button.equals("ViewSelect") ) {
				controlViewSelect();
			} else if( button.equals("ValidStockInquiry") ) {
				controlValidStockInquiry();
			} else if( button.equals("SubClear") ) {
				controlSubClear();
			} else if( button.equals("AddTree") ) {
				controlAddTree();
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
//			throw new FoundationException("AE0090040Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090040-E999","CSVの出力処理"));
			throw new FoundationException("AE0090040Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090040-E999","システム日付の取得処理"));
				throw new FoundationException("AE0090040Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AE0090040-E999","コントロールのイベント処理"));
			throw new FoundationException("AE0090040Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AE0090040Entity entity;
	protected AE0090040Struct struct;
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

		entity = new AE0090040Entity();
		struct = new AE0090040Struct();

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
	 * AE0090040クラスの標準コンストラクタ
	 */
	public AE0090040Control() throws BusinessProcessException, FoundationException
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
				AE0090040Struct key = (AE0090040Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP") && key.getDEVELOP_TYP() != null) {
					msgKey.setKeyValue("DEVELOP_TYP", key.getDEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name") && key.getDEVELOP_TYP_name() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_name", key.getDEVELOP_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val") && key.getDEVELOP_TYP_val() != null) {
					msgKey.setKeyValue("DEVELOP_TYP_val", key.getDEVELOP_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("InitLevel") && key.getInitLevel() != null) {
					msgKey.setKeyValue("InitLevel", key.getInitLevel());
				}
				if(msgKeyType.containsKeyColumn("h_MaxLevel") && key.geth_MaxLevel() != null) {
					msgKey.setKeyValue("h_MaxLevel", key.geth_MaxLevel());
				}
				if(msgKeyType.containsKeyColumn("AE0090040tree1") && key.getAE0090040tree1() != null) {
					msgKey.setKeyValue("AE0090040tree1", key.getAE0090040tree1());
				}
				if(msgKeyType.containsKeyColumn("id") && key.getid() != null) {
					msgKey.setKeyValue("id", key.getid());
				}
				if(msgKeyType.containsKeyColumn("lvl") && key.getlvl() != null) {
					msgKey.setKeyValue("lvl", key.getlvl());
				}
				if(msgKeyType.containsKeyColumn("parent") && key.getparent() != null) {
					msgKey.setKeyValue("parent", key.getparent());
				}
				if(msgKeyType.containsKeyColumn("label") && key.getlabel() != null) {
					msgKey.setKeyValue("label", key.getlabel());
				}
				if(msgKeyType.containsKeyColumn("ctx") && key.getctx() != null) {
					msgKey.setKeyValue("ctx", key.getctx());
				}
				if(msgKeyType.containsKeyColumn("maxid") && key.getmaxid() != null) {
					msgKey.setKeyValue("maxid", key.getmaxid());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("NEED_QTY_1") && key.getNEED_QTY_1() != null) {
					msgKey.setKeyValue("NEED_QTY_1", key.getNEED_QTY_1());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_Need_QTY") && key.getDet_Comp_Need_QTY() != null) {
					msgKey.setKeyValue("Det_Comp_Need_QTY", key.getDet_Comp_Need_QTY());
				}
				if(msgKeyType.containsKeyColumn("Upper_ITEM_NAME") && key.getUpper_ITEM_NAME() != null) {
					msgKey.setKeyValue("Upper_ITEM_NAME", key.getUpper_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ONHAND_QTY") && key.getDet_Comp_ONHAND_QTY() != null) {
					msgKey.setKeyValue("Det_Comp_ONHAND_QTY", key.getDet_Comp_ONHAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("NO") && key.getNO() != null) {
					msgKey.setKeyValue("NO", key.getNO());
				}
				if(msgKeyType.containsKeyColumn("NEED_QTY") && key.getNEED_QTY() != null) {
					msgKey.setKeyValue("NEED_QTY", key.getNEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY") && key.getUNIT_QTY() != null) {
					msgKey.setKeyValue("UNIT_QTY", key.getUNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("IN_UNIT_1") && key.getIN_UNIT_1() != null) {
					msgKey.setKeyValue("IN_UNIT_1", key.getIN_UNIT_1());
				}
				if(msgKeyType.containsKeyColumn("IN_UNIT_2") && key.getIN_UNIT_2() != null) {
					msgKey.setKeyValue("IN_UNIT_2", key.getIN_UNIT_2());
				}
				if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP") && key.geth_DEVELOP_TYP() != null) {
					msgKey.setKeyValue("h_DEVELOP_TYP", key.geth_DEVELOP_TYP());
				}
				if(msgKeyType.containsKeyColumn("PLANT_NAME") && key.getPLANT_NAME() != null) {
					msgKey.setKeyValue("PLANT_NAME", key.getPLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER1") && key.getRECEIPT_SCHEDULES_NUMBER1() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_NUMBER1", key.getRECEIPT_SCHEDULES_NUMBER1());
				}
				if(msgKeyType.containsKeyColumn("Lower_ITEM_CD") && key.getLower_ITEM_CD() != null) {
					msgKey.setKeyValue("Lower_ITEM_CD", key.getLower_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("TERM2STARTDATE") && key.getTERM2STARTDATE() != null) {
					msgKey.setKeyValue("TERM2STARTDATE", key.getTERM2STARTDATE());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER2") && key.getRECEIPT_SCHEDULES_NUMBER2() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_NUMBER2", key.getRECEIPT_SCHEDULES_NUMBER2());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_TERM") && key.getRECEIPT_SCHEDULES_TERM() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_TERM", key.getRECEIPT_SCHEDULES_TERM());
				}
				if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER") && key.getRECEIPT_SCHEDULES_NUMBER() != null) {
					msgKey.setKeyValue("RECEIPT_SCHEDULES_NUMBER", key.getRECEIPT_SCHEDULES_NUMBER());
				}
				if(msgKeyType.containsKeyColumn("Lower_ITEM_NAME") && key.getLower_ITEM_NAME() != null) {
					msgKey.setKeyValue("Lower_ITEM_NAME", key.getLower_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_CD") && key.getDet_Parent_ITEM_CD() != null) {
					msgKey.setKeyValue("Det_Parent_ITEM_CD", key.getDet_Parent_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_NAME") && key.getDet_Parent_ITEM_NAME() != null) {
					msgKey.setKeyValue("Det_Parent_ITEM_NAME", key.getDet_Parent_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_CD") && key.getDet_Comp_ITEM_CD() != null) {
					msgKey.setKeyValue("Det_Comp_ITEM_CD", key.getDet_Comp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_NAME") && key.getDet_Comp_ITEM_NAME() != null) {
					msgKey.setKeyValue("Det_Comp_ITEM_NAME", key.getDet_Comp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_STOCK_UNIT") && key.getDet_Comp_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Det_Comp_STOCK_UNIT", key.getDet_Comp_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_PRODUCT_TYP") && key.getDet_Comp_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_PRODUCT_TYP", key.getDet_Comp_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_MRP_ODR_TYP") && key.getDet_Comp_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_MRP_ODR_TYP", key.getDet_Comp_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_OUTSIDE_TYP") && key.getDet_Comp_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_OUTSIDE_TYP", key.getDet_Comp_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_PS_UNIT_QTY") && key.getDet_Comp_PS_UNIT_QTY() != null) {
					msgKey.setKeyValue("Det_Comp_PS_UNIT_QTY", key.getDet_Comp_PS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_SPOIL") && key.getDet_Comp_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("Det_Comp_ITEM_SPOIL", key.getDet_Comp_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_IN_DATE") && key.getDet_Comp_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("Det_Comp_EFF_PHASE_IN_DATE", key.getDet_Comp_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_OUT_DATE") && key.getDet_Comp_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("Det_Comp_EFF_PHASE_OUT_DATE", key.getDet_Comp_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_PS_SPOIL") && key.getDet_Comp_PS_SPOIL() != null) {
					msgKey.setKeyValue("Det_Comp_PS_SPOIL", key.getDet_Comp_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Det_Comp_CONS_TYP") && key.getDet_Comp_CONS_TYP() != null) {
					msgKey.setKeyValue("Det_Comp_CONS_TYP", key.getDet_Comp_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("ONHAND_STOCK") && key.getONHAND_STOCK() != null) {
					msgKey.setKeyValue("ONHAND_STOCK", key.getONHAND_STOCK());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("Lower_NEED_QTY") && key.getLower_NEED_QTY() != null) {
					msgKey.setKeyValue("Lower_NEED_QTY", key.getLower_NEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("Upper_NEED_QTY") && key.getUpper_NEED_QTY() != null) {
					msgKey.setKeyValue("Upper_NEED_QTY", key.getUpper_NEED_QTY());
				}
				if(msgKeyType.containsKeyColumn("Upper_ITEM_CD") && key.getUpper_ITEM_CD() != null) {
					msgKey.setKeyValue("Upper_ITEM_CD", key.getUpper_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Target_ITEM_CD") && key.getTarget_ITEM_CD() != null) {
					msgKey.setKeyValue("Target_ITEM_CD", key.getTarget_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("NUMERATOR") && key.getNUMERATOR() != null) {
					msgKey.setKeyValue("NUMERATOR", key.getNUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("DENOMINATOR") && key.getDENOMINATOR() != null) {
					msgKey.setKeyValue("DENOMINATOR", key.getDENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("PRODUCT_TYP") && key.getPRODUCT_TYP() != null) {
					msgKey.setKeyValue("PRODUCT_TYP", key.getPRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("TargetDate") && key.getTargetDate() != null) {
					msgKey.setKeyValue("TargetDate", key.getTargetDate());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME") && key.getCOMP_ITEM_NAME() != null) {
					msgKey.setKeyValue("COMP_ITEM_NAME", key.getCOMP_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD_VIEW") && key.getITEM_CD_VIEW() != null) {
					msgKey.setKeyValue("ITEM_CD_VIEW", key.getITEM_CD_VIEW());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
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
					AE0090040Struct key = new AE0090040Struct();
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP")) {
						key.setDEVELOP_TYP(msgKey.getKeyValue("DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_name")) {
						key.setDEVELOP_TYP_name(msgKey.getKeyValue("DEVELOP_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DEVELOP_TYP_val")) {
						key.setDEVELOP_TYP_val(msgKey.getKeyValue("DEVELOP_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("InitLevel")) {
						key.setInitLevel(msgKey.getKeyValue("InitLevel"));
					}
					if(msgKeyType.containsKeyColumn("h_MaxLevel")) {
						key.seth_MaxLevel(msgKey.getKeyValue("h_MaxLevel"));
					}
					if(msgKeyType.containsKeyColumn("AE0090040tree1")) {
						key.setAE0090040tree1(msgKey.getKeyValue("AE0090040tree1"));
					}
					if(msgKeyType.containsKeyColumn("id")) {
						key.setid(msgKey.getKeyValue("id"));
					}
					if(msgKeyType.containsKeyColumn("lvl")) {
						key.setlvl(msgKey.getKeyValue("lvl"));
					}
					if(msgKeyType.containsKeyColumn("parent")) {
						key.setparent(msgKey.getKeyValue("parent"));
					}
					if(msgKeyType.containsKeyColumn("label")) {
						key.setlabel(msgKey.getKeyValue("label"));
					}
					if(msgKeyType.containsKeyColumn("ctx")) {
						key.setctx(msgKey.getKeyValue("ctx"));
					}
					if(msgKeyType.containsKeyColumn("maxid")) {
						key.setmaxid(msgKey.getKeyValue("maxid"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("NEED_QTY_1")) {
						key.setNEED_QTY_1(msgKey.getKeyValue("NEED_QTY_1"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_Need_QTY")) {
						key.setDet_Comp_Need_QTY(msgKey.getKeyValue("Det_Comp_Need_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Upper_ITEM_NAME")) {
						key.setUpper_ITEM_NAME(msgKey.getKeyValue("Upper_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ONHAND_QTY")) {
						key.setDet_Comp_ONHAND_QTY(msgKey.getKeyValue("Det_Comp_ONHAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("NO")) {
						key.setNO(msgKey.getKeyValue("NO"));
					}
					if(msgKeyType.containsKeyColumn("NEED_QTY")) {
						key.setNEED_QTY(msgKey.getKeyValue("NEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY")) {
						key.setUNIT_QTY(msgKey.getKeyValue("UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("IN_UNIT_1")) {
						key.setIN_UNIT_1(msgKey.getKeyValue("IN_UNIT_1"));
					}
					if(msgKeyType.containsKeyColumn("IN_UNIT_2")) {
						key.setIN_UNIT_2(msgKey.getKeyValue("IN_UNIT_2"));
					}
					if(msgKeyType.containsKeyColumn("h_DEVELOP_TYP")) {
						key.seth_DEVELOP_TYP(msgKey.getKeyValue("h_DEVELOP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_NAME")) {
						key.setPLANT_NAME(msgKey.getKeyValue("PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER1")) {
						key.setRECEIPT_SCHEDULES_NUMBER1(msgKey.getKeyValue("RECEIPT_SCHEDULES_NUMBER1"));
					}
					if(msgKeyType.containsKeyColumn("Lower_ITEM_CD")) {
						key.setLower_ITEM_CD(msgKey.getKeyValue("Lower_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("TERM2STARTDATE")) {
						key.setTERM2STARTDATE(msgKey.getKeyValue("TERM2STARTDATE"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER2")) {
						key.setRECEIPT_SCHEDULES_NUMBER2(msgKey.getKeyValue("RECEIPT_SCHEDULES_NUMBER2"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_TERM")) {
						key.setRECEIPT_SCHEDULES_TERM(msgKey.getKeyValue("RECEIPT_SCHEDULES_TERM"));
					}
					if(msgKeyType.containsKeyColumn("RECEIPT_SCHEDULES_NUMBER")) {
						key.setRECEIPT_SCHEDULES_NUMBER(msgKey.getKeyValue("RECEIPT_SCHEDULES_NUMBER"));
					}
					if(msgKeyType.containsKeyColumn("Lower_ITEM_NAME")) {
						key.setLower_ITEM_NAME(msgKey.getKeyValue("Lower_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_CD")) {
						key.setDet_Parent_ITEM_CD(msgKey.getKeyValue("Det_Parent_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det_Parent_ITEM_NAME")) {
						key.setDet_Parent_ITEM_NAME(msgKey.getKeyValue("Det_Parent_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_CD")) {
						key.setDet_Comp_ITEM_CD(msgKey.getKeyValue("Det_Comp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_NAME")) {
						key.setDet_Comp_ITEM_NAME(msgKey.getKeyValue("Det_Comp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_STOCK_UNIT")) {
						key.setDet_Comp_STOCK_UNIT(msgKey.getKeyValue("Det_Comp_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_PRODUCT_TYP")) {
						key.setDet_Comp_PRODUCT_TYP(msgKey.getKeyValue("Det_Comp_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_MRP_ODR_TYP")) {
						key.setDet_Comp_MRP_ODR_TYP(msgKey.getKeyValue("Det_Comp_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_OUTSIDE_TYP")) {
						key.setDet_Comp_OUTSIDE_TYP(msgKey.getKeyValue("Det_Comp_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_PS_UNIT_QTY")) {
						key.setDet_Comp_PS_UNIT_QTY(msgKey.getKeyValue("Det_Comp_PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_ITEM_SPOIL")) {
						key.setDet_Comp_ITEM_SPOIL(msgKey.getKeyValue("Det_Comp_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_IN_DATE")) {
						key.setDet_Comp_EFF_PHASE_IN_DATE(msgKey.getKeyValue("Det_Comp_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_EFF_PHASE_OUT_DATE")) {
						key.setDet_Comp_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("Det_Comp_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_PS_SPOIL")) {
						key.setDet_Comp_PS_SPOIL(msgKey.getKeyValue("Det_Comp_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Det_Comp_CONS_TYP")) {
						key.setDet_Comp_CONS_TYP(msgKey.getKeyValue("Det_Comp_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("ONHAND_STOCK")) {
						key.setONHAND_STOCK(msgKey.getKeyValue("ONHAND_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Lower_NEED_QTY")) {
						key.setLower_NEED_QTY(msgKey.getKeyValue("Lower_NEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Upper_NEED_QTY")) {
						key.setUpper_NEED_QTY(msgKey.getKeyValue("Upper_NEED_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Upper_ITEM_CD")) {
						key.setUpper_ITEM_CD(msgKey.getKeyValue("Upper_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Target_ITEM_CD")) {
						key.setTarget_ITEM_CD(msgKey.getKeyValue("Target_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("NUMERATOR")) {
						key.setNUMERATOR(msgKey.getKeyValue("NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("DENOMINATOR")) {
						key.setDENOMINATOR(msgKey.getKeyValue("DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("PRODUCT_TYP")) {
						key.setPRODUCT_TYP(msgKey.getKeyValue("PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TargetDate")) {
						key.setTargetDate(msgKey.getKeyValue("TargetDate"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_NAME")) {
						key.setCOMP_ITEM_NAME(msgKey.getKeyValue("COMP_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD_VIEW")) {
						key.setITEM_CD_VIEW(msgKey.getKeyValue("ITEM_CD_VIEW"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
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
