/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0120/src/com/nec/jp/orteus/metamorBase/AC0120/AC0120010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0120;

import com.nec.jp.orteus.metamorBase.AC0120.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
// TODO: ここにimportパッケージを記述してください
import java.text.ParseException;
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.common01.util.DateConverter;
import com.nec.jp.orteus.expj.util.*;
import com.nec.jp.orteus.metamorBase.common01.*;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostControl;
import com.nec.jp.orteus.metamorBase.common04.amount.PuchUnitCostStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.HomeCurStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.MyCompanyStruct;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameControl;
import com.nec.jp.orteus.metamorBase.common04.sysdata.TaxNameStruct;
import com.nec.jp.orteus.metamorBase.common04.util.DataNotFoundException;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateControl;
import com.nec.jp.orteus.metamorBase.common04.amount.ExchRateStruct;
import com.nec.jp.orteus.metamorBase.common04.amount.AmountCalculator;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0120010Control
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
				setStruct2XML(elChild, (AC0120010Struct)list.get(i), startId, lvl, parentId);
				// 作成したエレメントを子供として追加
				el.appendChild(elChild);
			}
		}
		return startId;
	}

	public int setXMLDoc(Element el, List list, int startId) throws BusinessProcessException, FoundationException {
		return setXMLDoc(el, list, startId, 1, 0);
	} 

	public void setStruct2XML(Element el, AC0120010Struct struct, int id, int lvl, int parentId) throws BusinessProcessException, FoundationException {

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

                // 拡張属性
                if (struct.getITEM_CD() != null && !struct.getITEM_CD().equals("")) {
                    el.setAttribute("ITEM_CD", struct.getITEM_CD());
                } else {
                    el.setAttribute("ITEM_CD", "");
                }
                if (struct.getITEM_NAME() != null && !struct.getITEM_NAME().equals("")) {
                    el.setAttribute("ITEM_NAME", struct.getITEM_NAME());
                } else {
                    el.setAttribute("ITEM_NAME", "");
                }
                if (struct.getOD_NO() != null && !struct.getOD_NO().equals("")) {
                    el.setAttribute("OD_NO", struct.getOD_NO());
                } else {
                    el.setAttribute("OD_NO", "");
                }
                if (struct.getMRP_TYP() != null && !struct.getMRP_TYP().equals("")) {
                    el.setAttribute("MRP_TYP", struct.getMRP_TYP());
                } else {
                    el.setAttribute("MRP_TYP", "");
                }
                if (struct.getMRP_ODR_TYP() != null && !struct.getMRP_ODR_TYP().equals("")) {
                    el.setAttribute("MRP_ODR_TYP", struct.getMRP_ODR_TYP());
                } else {
                    el.setAttribute("MRP_ODR_TYP", "");
                }
                if (struct.getODR_STS_TYP() != null && !struct.getODR_STS_TYP().equals("")) {
                    el.setAttribute("ODR_STS_TYP", struct.getODR_STS_TYP());
                } else {
                    el.setAttribute("ODR_STS_TYP", "");
                }
                if (struct.getDM_STS_TYP() != null && !struct.getDM_STS_TYP().equals("")) {
                    el.setAttribute("DM_STS_TYP", struct.getDM_STS_TYP());
                } else {
                    el.setAttribute("DM_STS_TYP", "");
                }
                if (struct.getOD_TYP() != null && !struct.getOD_TYP().equals("")) {
                    el.setAttribute("OD_TYP", struct.getOD_TYP());
                } else {
                    el.setAttribute("OD_TYP", "");
                }
                if (struct.getJOB_ODR_STS_TYP() != null && !struct.getJOB_ODR_STS_TYP().equals("")) {
                    el.setAttribute("JOB_ODR_STS_TYP", struct.getJOB_ODR_STS_TYP());
                } else {
                    el.setAttribute("JOB_ODR_STS_TYP", "");
                }
                if (struct.getPARENT_OD_NO() != null && !struct.getPARENT_OD_NO().equals("")) {
                    el.setAttribute("PARENT_OD_NO", struct.getPARENT_OD_NO());
                } else {
                    el.setAttribute("PARENT_OD_NO", "");
                }

//              ▼▼ 2008/08/21 ADD START -TSUCHIDA▼▼
	             if (struct.getMANHOUR_TYP() != null && !struct.getMANHOUR_TYP().equals("")) {
	                 el.setAttribute("MANHOUR_TYP", struct.getMANHOUR_TYP());
	             } else {
	                 el.setAttribute("MANHOUR_TYP", "");
	             }
//              ▲▲ 2008/08/21 ADD END -TSUCHIDA▲▲
               if (struct.getMODIFY_COUNT() != null && !struct.getMODIFY_COUNT().equals("")) {
                    el.setAttribute("MODIFY_COUNT", struct.getMODIFY_COUNT());
                } else {
                    el.setAttribute("MODIFY_COUNT", "");
                }
             //Add Anken Start 20140428 song-yy
               if (struct.getTOTAL_RCV_QTY() != null && !struct.getTOTAL_RCV_QTY().equals("")) {
                   el.setAttribute("TOTAL_RCV_QTY", struct.getTOTAL_RCV_QTY());
               } else {
                   el.setAttribute("TOTAL_RCV_QTY", "");
               }
               
               if (struct.getTOTAL_ISSUE_QTY() != null && !struct.getTOTAL_ISSUE_QTY().equals("")) {
                   el.setAttribute("TOTAL_ISSUE_QTY", struct.getTOTAL_ISSUE_QTY());
               } else {
                   el.setAttribute("TOTAL_ISSUE_QTY", "");
               }
               
               if (struct.getCHIID_OD_NO() != null && !struct.getCHIID_OD_NO().equals("")) {
                   el.setAttribute("CHIID_OD_NO", struct.getCHIID_OD_NO());
               } else {
                   el.setAttribute("CHIID_OD_NO", "");
               }
             //Add Anken End   20140428 song-yy

                //}}user_implement_dev:<setStruct2XML>
			} catch(DOMException e) {
				e.printStackTrace();
			}
		}
		return;
	}

	public void setStruct2XML(Element el, AC0120010Struct struct, int id) throws BusinessProcessException, FoundationException {
		setStruct2XML(el, struct, id, 1, 0);
		return;
	}

	// PDF用アクセサメソッド
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
    protected List list ;											// 一覧部分の結果リストを画面に表示するためのリストインスタンス

    private  List tempList =  new ArrayList() ;
    // デフォルトアクセサメソッド
    public List getList() { return this.list; }						// リストを返します。
    public void setList(List listname) { this.list = listname; }	// リストをセットします。
    public int getListsize() {										// リスト型のサイズを返します。
        int nret = 0;
        if( this.list != null ) {nret = this.list.size();}
        return nret;
    }
    //	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
    public AC0120010Struct getListvalue(int x) { return (AC0120010Struct)(this.list.get(x)); }	// リストの値を返します。
    public AC0120010Struct getStruct() { return this.struct; }	// Structを返します。
    public AC0120010Struct createStruct() { return new AC0120010Struct(); }	// 新しいStructを作って返します。
    public void setStruct(Object structname) { this.struct.setStruct((AC0120010Struct)structname); }	// Structをセットします。
    public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

    // CSV出力用リスト
    private CsvWriter csvWriter = null;
    public CsvWriter getCsvWriter(){ return this.csvWriter; }

    private CsvReader csvReader = null;
    public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

    //---------------------------------------------------------------------------
    /** 内外作区分コンボボックス値リスト */
    private List _outsideTypValList = null;

    /** 内外作区分コンボボックス表示説明リスト */
    private List _outsideTypNameList = null;
    
    /** 品目手配区分コンボボックス値リスト */
    private List _mrpOdrTypValList = null;

    /** 品目手配区分コンボボックス表示説明リスト */
    private List _mrpOdrTypNameList = null;
    
    /** 在庫数単位区分コンボボックス値リスト */
    private List _unitQtyTypValList = null;

    /** 在庫数単位区分コンボボックス表示説明リスト */
    private List _unitQtyTypNameList = null;
    
    /** オーダ状態区分コンボボックス値リスト */
    private List _odrStsTypValList = null;

    /** オーダ状態区分コンボボックス表示説明リスト */
    private List _odrStsTypNameList = null;
    
    /** デマンド状態区分コンボボックス値リスト */
    private List _dmStsTypValList = null;

    /** デマンド状態区分コンボボックス表示説明リスト */
    private List _dmStsTypNameList = null;
    
    /** オーダデマンド区分コンボボックス値リスト */
    private List _odTypValList = null;

    /** オーダデマンド区分コンボボックス表示説明リスト */
    private List _odTypNameList = null;
    
    /** 所要量発生処理区分コンボボックス値リスト */
    private List _odGnrTypValList = null;

    /** 所要量発生処理区分コンボボックス表示説明リスト */
    private List _odGnrTypNameList = null;
    
    /** 工数管理品目区分コンボボックス値リスト */
    private List _manhourTypValList = null;

    /** 工数管理品目区分コンボボックス表示説明リスト */
    private List _manhourTypNameList = null;
    
    //Add Anken Start 20140417 song-yy
    /** 作業実績区分コンボボックス値リスト */
    private List _oprTypValList = null;
    
    /** 作業実績区分コンボボックス表示説明リスト */
    private List _oprTypNameList = null;
    
    /** 支給区分コンボボックス値リスト */
    private List _consTypValList = null;
    
    /** 支給区分コンボボックス表示説明リスト */
    private List _consTypNameList = null;
    
    /** 原価積上区分コンボボックス値リスト */
    private List _costupTypValList = null; 
    
    /** 原価積上区分コンボボックス表示説明リスト */ 
    private List _costupTypNameList = null;
    
    /** 所要量展開区分コンボボックス値リスト */
    private List _mrpexpTypValList = null;
    
    /** 所要量展開区分コンボボックス表示説明リスト */
    private List _mrpexpTypNameList = null; 

    
    
    /** [自社]情報 */
    private MyCompanyStruct _myCompanyStruct = new MyCompanyStruct();
    /** [税名]情報 */
    private TaxNameStruct _taxNameStruct = new TaxNameStruct();
    /** [邦貨]情報 */
    private HomeCurStruct _homeCurStruct = new HomeCurStruct();
    
    //Add Anken End   20140417 song-yy


    /** デフォールト初期展開レベル */
    private static final String DEFAULT_INIT_LEVEL = "15";
    /** 最大累計行数 */
    private static final int MAX_NODE_NUM = 50;
    /** 最大読込行数（初期読込または追加読込毎） */
    private static final int MAX_READ_NUM = 20;

    /** 子画面で行う操作 */
    private String operationMode = null;
    /** 子画面の操作が登録であることを表す定数 */
    static final private String INSERT = "INSERT";
    /** 子画面の操作が更新であることを表す定数 */
    static final private String UPDATE = "UPDATE";

    /** 次に遷移する画面のURL */
    private String _nextUrl = null;

    /**
     * 次に遷移する画面のURLを取得します。
     */
    public String getNextUrl() {
        return _nextUrl;
    }
    /**
     * 次に遷移する画面のURLを設定します。
     */
    public void setNextUrl(String url) {
        _nextUrl = url;
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
        param.append(".");
        param.append(columnName);
        param.append(":");
        if (value != null) {
            param.append(value);
        }

        ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
        msgStruct.addError(emsg);
        sysLog.warning(emsg, sysUSER_CD);
    }

    /**
     * 業務ワーニング発生時のパラメータ設定処理を切り出して関数化
     * @param tableName テーブル名
     * @param columnName カラム名
     * @param value 値
     */
    private void setWarningParameter(String tableName, String columnName, String value) {
        StringBuffer param = new StringBuffer();
        param.append(tableName);
        param.append('.');
        param.append(columnName);
        param.append(':');
        if (value != null) {
            param.append(value);
        }
        ExpjMessage emsg = new ExpjMessage("ZZ01006", param.toString());
        msgStruct.addWarn(emsg);
        sysLog.info(emsg, sysUSER_CD);
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
     * 稼働日演算処理を日付文字列で使えるようにした委譲メソッドです。
     * @param dateString 日付文字列
     * @return 演算結果の日付文字列
     * @throws FoundationException 共通部品処理で失敗
     * @throws ParseException 型変換に失敗
     */
    private String calcWorkDay(String dateString, String ltString, boolean flg)
      throws FoundationException,ParseException {
        // DateFormatを準備
        //DateFormat df = new SimpleDateFormat("yyyy/MM/dd");
        // 型変換
        //Date date = df.parse(dateString);

				SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm");
				Date date = sdf.parse(dateString);
        //Date date = Converter.strToDate(dateString, "yyyy/MM/dd");

        int lt = Integer.parseInt(ltString);

        // 稼働日共通部品を生成し、チェック処理を実行
        WorkCalendar wc =
          new WorkCalendar(conn, sysUSER_CD, sp.getProcId(), struct.getPLANT_CD(), struct.getSub1_Comp_ITEM_CD(), date, lt, flg);
        Date resultDate = wc.calcDate();

        //return df.format(resultDate);
        return sdf.format(resultDate);
        //return Converter.dateToStr(resultDate, "yyyy/MM/dd");
    }

    /**
     * Structの値をセットします。
     * @param s 検索したデータ
     */
    private void setStructSub1update(AC0120010Struct s) {
        struct.setSub1_Parent_ITEM_CD(s.getSub1_Parent_ITEM_CD());
        struct.setSub1_Parent_ITEM_NAME(s.getSub1_Parent_ITEM_NAME());
        struct.seth_Sub1_Parent_OD_LEVEL_NO(s.geth_Sub1_Parent_OD_LEVEL_NO());
        struct.seth_Sub1_Parent_ODR_QTY(s.geth_Sub1_Parent_ODR_QTY());
        struct.seth_Parent_OD_MODIFY_COUNT(s.geth_Parent_OD_MODIFY_COUNT());

    }

    /**
     * Structの値をセットします。
     * @param s 検索したデータ
     */
    private void setStructSub1Header(AC0120010Struct s) {
        struct.setSub1_Parent_ITEM_CD(s.getSub1_Parent_ITEM_CD());
        struct.setSub1_Parent_ITEM_NAME(s.getSub1_Parent_ITEM_NAME());
        struct.seth_Sub1_Parent_OD_LEVEL_NO(s.geth_Sub1_Parent_OD_LEVEL_NO());
        struct.seth_Sub1_Parent_ODR_QTY(s.geth_Sub1_Parent_ODR_QTY());
        struct.seth_Sub1_Parent_ODR_START_DATE(s.geth_Sub1_Parent_ODR_START_DATE());
        struct.seth_Parent_OD_MODIFY_COUNT(s.geth_Parent_OD_MODIFY_COUNT());
        struct.seth_Sub1_Parent_ALC_GRP_CD(s.geth_Sub1_Parent_ALC_GRP_CD());
      //Add Anken Start 20140429 song-yy
        struct.seth_Sub1_ODR_STS_TYP(s.geth_Sub1_ODR_STS_TYP());
      //Add Anken End   20140429 song-yy

    }

    /**
     * Structの値をセットします。
     * @param s 検索したデータ
     */
    private void setStructSub1(AC0120010Struct s) throws SQLException {
		try{
			DateTimeFormat dtf = new DateTimeFormat(conn);
			
	        struct.setSub1_Comp_ITEM_CD(s.getSub1_Comp_ITEM_CD());
	        struct.setSub1_Comp_ITEM_NAME(s.getSub1_Comp_ITEM_NAME());
	        struct.setSub1_DRAW_CD(s.getSub1_DRAW_CD());
	        struct.setSub1_SPEC(s.getSub1_SPEC());
	        struct.setSub1_ITEM_SPOIL(s.getSub1_ITEM_SPOIL());
	        
	        struct.setSub1_DUE_DATE(dtf.getDatePart(s.getSub1_DUE_DATE()));
	        struct.setSub1_DUE_TIME(dtf.getCoronTimePart(s.getSub1_DUE_DATE()));
	        struct.setSub1_DUE_TIME2(dtf.getTimePart(s.getSub1_DUE_DATE()));
	        struct.setSub1_DUE_TIME3(dtf.getTimePart(s.getSub1_DUE_DATE()));

	        //オーダデマンド区分が3:デマンドの場合、画面上製造納期は表示しない
	        if (s.getSub1_OD_TYP().equals("3")) {
	            struct.setSub1_PRD_DUE_DATE(null);
	            struct.setSub1_PRD_DUE_TIME(null);
	        } else {
	            struct.setSub1_PRD_DUE_DATE(dtf.getDatePart(s.getSub1_PRD_DUE_DATE()));
	            struct.setSub1_PRD_DUE_TIME(dtf.getTimePart(s.getSub1_PRD_DUE_DATE()));
	        }
	        
	        struct.setSub1_PRD_START_DATE(dtf.getDatePart(s.getSub1_PRD_START_DATE()));
	        struct.setSub1_PRD_START_TIME(dtf.getTimePart(s.getSub1_PRD_START_DATE()));
	        struct.setSub1_ODR_START_DATE(dtf.getDatePart(s.getSub1_ODR_START_DATE()));
	        struct.setSub1_ODR_START_TIME(dtf.getTimePart(s.getSub1_ODR_START_DATE()));
	        struct.setSub1_ODR_QTY(s.getSub1_ODR_QTY());
	        struct.setSub1_DM_QTY(s.getSub1_DM_QTY());
	        struct.setSub1_PS_UNIT_DENOMINATOR(s.getSub1_PS_UNIT_DENOMINATOR());
	        struct.setSub1_PS_UNIT_NUMERATOR(s.getSub1_PS_UNIT_NUMERATOR());
	        struct.setSub1_OUTSIDE_TYP(s.getSub1_OUTSIDE_TYP());
	        //struct.setSub1_MRP_ODR_TYP_DN(s.getSub1_MRP_ODR_TYP_DN());
	        struct.setSub1_MRP_ODR_TYP_DN(getDisplayName(s.geth_Sub1_MRP_ODR_TYP(),
	        		_mrpOdrTypValList,_mrpOdrTypNameList));
	        struct.seth_Sub1_MRP_ODR_TYP(s.geth_Sub1_MRP_ODR_TYP());
	        //struct.setSub1_UNIT_QTY_TYP_DN(s.getSub1_UNIT_QTY_TYP_DN());
	        struct.setSub1_UNIT_QTY_TYP_DN(getDisplayName(s.geth_Sub1_UNIT_QTY_TYP(),
                    _unitQtyTypValList, _unitQtyTypNameList));
	        struct.seth_Sub1_UNIT_QTY_TYP(s.geth_Sub1_UNIT_QTY_TYP());
	        struct.setSub1_STOCK_UNIT(s.getSub1_STOCK_UNIT());
	        struct.setSub1_PS_SPOIL(s.getSub1_PS_SPOIL());
	        struct.seth_Comp_ITEM_MODIFY_COUNT(s.geth_Comp_ITEM_MODIFY_COUNT());
	        struct.seth_Sub1_PS_UNIT_QTY(s.geth_Sub1_PS_UNIT_QTY());
	        struct.seth_Sub1_OD_MODIFY_COUNT(s.geth_Sub1_OD_MODIFY_COUNT());
//	      ▼▼ 2008/08/21 ADD START -TSUCHIDA▼▼
	     	struct.seth_Sub1_MANHOUR_TYP(s.geth_Sub1_MANHOUR_TYP());
//	      ▲▲ 2008/08/21 ADD END -TSUCHIDA▲▲
	        //この製番構成を削除するチェック
	        if (s.getMRP_TYP().equals("3")) {
	            struct.setc_JOB_ODR_DEL("true");
	        } else {
	            struct.setc_JOB_ODR_DEL(null);
	        }
	      //Add Anken Start 20140425 song-yy
	        struct.seth_Sub1_ODR_STS_TYP(s.geth_Sub1_ODR_STS_TYP());
	        struct.seth_Sub1_DM_STS_TYP(s.geth_Sub1_DM_STS_TYP());
	      //Add Anken End   20140425 song-yy
		} catch (SQLException ex) {
			throw ex;
		} finally {
		}
    }
//Add Anken Start 20140417 song-yy
	/**
	 * ログメッセージ設定
	 * @param メッセージ番号
	 * @param 出力メッセージ
	 */
	private void setSyslogConfig(String message)
	{
		ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
		sysLog.config(emsg, getsysUSER_CD());
	}

    /**
     *品目番号に対する状態のチェック
     * @return 
     */
    private boolean checkParentItem(AC0120010Struct checkStruct) throws FoundationException, SQLException{
    	
    	try{
    		//①	保持している[所要量].“オーダ状態区分” ＝ 2:確定(発効) かつ 
        	//保持している[所要量].“所要量内外作区分” ＝ 1:内作 の場合
        	if("2".equals(checkStruct.getODR_STS_TYP()) && "1".equals(checkStruct.getOUTSIDE_TYP())){
        		AC0120010Struct workinproStruct = new AC0120010Struct();
        		List workinproList = entity.mT_WORK_IN_PROC_BY_ITEM.read(conn, checkStruct);
        		if(workinproList.isEmpty()){
        			setErrorMessage("AC00245");
        			setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "OD_NO",checkStruct.getOD_NO());
        			return false;
        		}
        		else{
        			workinproStruct =(AC0120010Struct)workinproList.get(0);
        			//[品目別仕掛].“作業系列展開済みフラグ”　= 1：展開済み　の場合
        			if("1".equals(workinproStruct.getPROC_EXPLOSION_FLG())){
        				List workbyproList = entity.mcheckT_WORK_IN_PROC_BY_PROC.read(conn, workinproStruct);
        				//作業指示確定の有無の確認」で「作業指示確定あり」となった場合
        				if(!workbyproList.isEmpty()){
            				setErrorMessage("AC00240");
            				setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "OD_NO",checkStruct.getOD_NO());
                			setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "PROC_EXPLOSION_FLG",workinproStruct.getPROC_EXPLOSION_FLG());
                			return false;
            			}
        			}
        			//[品目別仕掛].“品目別作業状態区分” ＝ 9：作業完了　の場合
        			if("9".equals(workinproStruct.getWORK_STS_TYP())){
        				setErrorMessage("AC00240");
        				setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "OD_NO",checkStruct.getOD_NO());
            			setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "WORK_STS_TYP",workinproStruct.getWORK_STS_TYP());          
            			return false;
        			}
        			//[品目別仕掛].“品目別作業実績区分” ＝1：出来高実績　の場合
        			if("1".equals(workinproStruct.getOPR_RSLT_TYP())){
        				setErrorMessage("AC00241");
        				setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "OD_NO",checkStruct.getOD_NO());
            			setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "OPR_RSLT_TYP",workinproStruct.getOPR_RSLT_TYP());
            			return false;
        			}
        		}
        	}
        	//②	保持している[所要量].“オーダ状態区分” ＝ 2:確定(発効) かつ 
        	//保持している[所要量].“所要量内外作区分” ＝ 2:外作 の場合、
        	if("2".equals(checkStruct.getODR_STS_TYP()) && "2".equals(checkStruct.getOUTSIDE_TYP())){
        		List rlsdList = entity.mCHK_T_RLSD_PUCH_ODR.read(conn, checkStruct);
        		//[発注残]が存在しない場合
        		if(rlsdList.isEmpty()){
        			setErrorMessage("AC00252");
        			setErrorParameter("T_RLSD_PUCH_ODR", "OD_NO",checkStruct.getOD_NO());
        			return false;
        		}
        		else{
        			//[発注残].“発注状態区分”＝2：指示済み　または　9：受入完了　の場合
        			AC0120010Struct workinproStruct = (AC0120010Struct)rlsdList.get(0);
        			if("2".equals(workinproStruct.getPUCH_ODR_STS_TYP())
        					||"9".equals(workinproStruct.getPUCH_ODR_STS_TYP())){
        				setErrorMessage("AC00240");
        				setErrorParameter("T_RLSD_PUCH_ODR", "OD_NO",checkStruct.getOD_NO());
            			setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_STS_TYP",workinproStruct.getPUCH_ODR_STS_TYP());
            			return false;
        			}
        			
        			
        		}
        	}
        	//③	保持している[所要量].“デマンド状態区分” ＝ 2:確定　の場合
        	//保管区別入出庫]を検索する。
        	if("2".equals(checkStruct.getDM_STS_TYP())){
        		List rcvList = entity.mCHK_T_RCV_ISSUE.read(conn, checkStruct);
        		if(!rcvList.isEmpty()){
        			setErrorMessage("AC00247");
        			setErrorParameter("T_RCV_ISSUE", "OD_NO",checkStruct.getOD_NO());
        			return false;
        		}
        	}
        	return true;
    	}catch(Exception e){
    		return false;
    	}
    }
    //Add Anken End   20140417 song-yy
    
  //Add Anken Start 20140418 song-yy
    /**
     *サブ１フォームの親品目番号に対する実績のチェック
     * @return 
     * @throws SQLException 
     * @throws FoundationException 
     */
    private boolean checkSub1ParentItem() throws FoundationException, SQLException{
    	try{
    		List todList = entity.mSub1T_OD.read(conn, struct);  
        	if(!todList.isEmpty())
        	{
        		AC0120010Struct todStruct = (AC0120010Struct)todList.get(0);
            	//[所要量].“所要量内外作区分”
        		struct.setOUTSIDE_TYP(todStruct.getOUTSIDE_TYP());
        		
            	//[所要量].“オーダ状態区分” ＝ 2:確定(発効) かつ 
            	//[所要量].“所要量内外作区分” ＝ 1:内作 の場合、
            	if("2".equals(todStruct.getODR_STS_TYP())
            			&& "1".equals(todStruct.getOUTSIDE_TYP())){
            		
            		//[品目別仕掛]が存在しない場合
            		AC0120010Struct workinproStruct = new AC0120010Struct();
            		List workinproList = entity.mT_WORK_IN_PROC_BY_ITEM.read(conn, struct);
            		if(workinproList.isEmpty()){
            			setErrorMessage("AC00245");
            			setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "OD_NO",struct.getOD_NO());           		
            			return false;
            		}
            		
            		workinproStruct = (AC0120010Struct)workinproList.get(0);
            		//[品目別仕掛].“作業計画番号”
            		struct.setWORK_ODR_CD(workinproStruct.getWORK_ODR_CD());
            		//[品目別仕掛].“品目別作業状態区分”
            		struct.setWORK_STS_TYP(workinproStruct.getWORK_STS_TYP());
            		//[品目別仕掛].“品目別作業実績区分”
            		struct.setOPR_RSLT_TYP(workinproStruct.getOPR_RSLT_TYP());
            		
            		//品目別仕掛].“品目別作業状態区分” ＝ 2:指示済 の場合
            		if("2".equals(workinproStruct.getWORK_STS_TYP())){
            			//作業系列別仕掛
            			List workbyproList = entity.mCHK_T_WORK_IN_PROC_BY_PROC.read(conn, struct);
            			if(workbyproList.isEmpty()){
                			setErrorMessage("AC00246");
                			setErrorParameter("T_WORK_IN_PROC_BY_ITEM", "OD_NO",struct.getOD_NO());
                			setErrorParameter("T_WORK_IN_PROC_BY_PROC", "WORK_ODR_CD",workinproStruct.getWORK_ODR_CD());
                			return false;
            			}
            			
            			boolean blnFinalFlg = false;
            			for(int i=0 ; i < workbyproList.size() ; i++){
                			//[作業系列別仕掛].“最終系列フラグ”＝1：最終経路が存在しない場合
                			AC0120010Struct workbyproStruct = (AC0120010Struct)workbyproList.get(i);
                			if("1".equals(workbyproStruct.getFINAL_PROC_FLG())){
                				blnFinalFlg = true;              				
                			}
                			//[作業系列別仕掛].“仕掛内外作区分”＝1:内作
                			if("1".equals(workbyproStruct.getOUTSIDE_TYP())){
                				//sum([作業実績].“作業実績良品数”)＞0のデータ　もしくは
                				//sum([作業実績].“作業実績不良数”)＞0のデータ　が存在した場合
                				List oprrlsdList = entity.mCHK_T_OPR_RSLT.read(conn, workbyproStruct);
                				if(!oprrlsdList.isEmpty()){
                					AC0120010Struct oprrlsdStruct = (AC0120010Struct)oprrlsdList.get(0);
                					if((Calculate.compare(oprrlsdStruct.getTOTAL_ACPT_QTY(), "0") > 0)
                							||( Calculate.compare(oprrlsdStruct.getTOTAL_DEFECT_QTY(), "0") > 0)){
                						setErrorMessage("AC00250");
                						setErrorParameter("T_WORK_IN_PROC_BY_PROC", "OD_NO",struct.getOD_NO());
                						setErrorParameter("T_WORK_IN_PROC_BY_PROC", "WORK_ODR_CD",workinproStruct.getWORK_ODR_CD());
                            			setErrorParameter("T_OPR_RSLT", "ACPT_QTY",oprrlsdStruct.getTOTAL_ACPT_QTY());
                            			setErrorParameter("T_OPR_RSLT", "DEFECT_QTY",oprrlsdStruct.getTOTAL_DEFECT_QTY());
                            			return false;
                					}
                				}       				
                			}
                			
                			//[作業系列別仕掛].“仕掛内外作区分”＝2:外作
                			if("2".equals(workbyproStruct.getOUTSIDE_TYP())){
                				List acrList = entity.mCHK_RLSD.read(conn, workbyproStruct);
                				if(!acrList.isEmpty()){
                					AC0120010Struct acrStruct = (AC0120010Struct)acrList.get(0);
                					if((Calculate.compare(acrStruct.getACPT_QTY(), "0")) > 0){
                    					setErrorMessage("AC00251");
                    					setErrorParameter("T_WORK_IN_PROC_BY_PROC", "WORK_ODR_CD",workinproStruct.getWORK_ODR_CD());
                    					setErrorParameter("T_WORK_IN_PROC_BY_PROC", "WORK_IN_PROC_CD",workbyproStruct.getWORK_IN_PROC_CD());
                    					setErrorParameter("T_ACPT_RSLT", "ACPT_QTY",acrStruct.getACPT_QTY());
                            			return false;
                					}          					
                				}
                			}
            			}
            			
            			if(!blnFinalFlg){
            				setErrorMessage("AC00246");
            				setErrorParameter("T_WORK_IN_PROC_BY_PROC", "OD_NO",struct.getOD_NO());
            				setErrorParameter("T_WORK_IN_PROC_BY_PROC", "WORK_ODR_CD",workinproStruct.getWORK_ODR_CD());
                			return false;
            			}
            			
            		}
            	}
            	//[所要量].“オーダ状態区分” ＝ 2:確定(発効) かつ 
            	//た[所要量].“所要量内外作区分” ＝ 2:外作 の場合、
            	if("2".equals(todStruct.getODR_STS_TYP())
            			&& "2".equals(todStruct.getOUTSIDE_TYP())){
            		//[発注残]を検索する
            		List rlsdpuchList =entity.mCHK_T_RLSD_PUCH_ODR.read(conn, struct);
            		//[発注残]が存在しない場合
            		if(rlsdpuchList.isEmpty()){
            			setErrorMessage("AC00252");
            			setErrorParameter("T_RLSD_PUCH_ODR", "OD_NO",struct.getOD_NO());
            			return false;
            		}
            		AC0120010Struct rlsdpuchStruct = (AC0120010Struct)rlsdpuchList.get(0);
            		//[発注残].“発注番号”
            		struct.setSub1_PUCH_ODR_CD(rlsdpuchStruct.getSub1_PUCH_ODR_CD());
            		//[発注残].“会社コード”
            		struct.setSub1_COMPANY_CD(rlsdpuchStruct.getSub1_COMPANY_CD());
            		//[発注残].“取引先コード”
            		struct.setSub1_VEND_CD(rlsdpuchStruct.getSub1_VEND_CD());
            		//[発注残].“発注状態区分”
            		struct.setPUCH_ODR_STS_TYP(rlsdpuchStruct.getPUCH_ODR_STS_TYP());
            		
            		//
            		//所要量].“オーダ状態区分” ＝ 2: 確定(発効) かつ 
            		//[所要量].“所要量内外作区分” ＝ 2:外作 かつ
            		//[発注残].“発注状態区分” ＝ 2:指示済 の場合、
            		if("2".equals(rlsdpuchStruct.getPUCH_ODR_STS_TYP())){
            			List acptList = entity.mchkT_ACPT_RSLT.read(conn, struct);
            			//sum([受入実績].“受入数”)＞0のデータが存在した場合
            			if(!acptList.isEmpty()){
            				AC0120010Struct acptStruct = (AC0120010Struct)acptList.get(0);
            				if((Calculate.compare(acptStruct.getACPT_QTY(), "0")) >0){
                				setErrorMessage("AC00251");
                				setErrorParameter("T_RLSD_PUCH_ODR", "OD_NO",struct.getOD_NO());
                    			setErrorParameter("T_ACPT_RSLT", "PUCH_ODR_CD",acptStruct.getPUCH_ODR_CD());
                    			setErrorParameter("T_ACPT_RSLT", "ACPT_QTY",acptStruct.getACPT_QTY());
                    			return false;
            				}

            			}    			
            		}
            	}
        	}   	
    		return true;
    	}catch(Exception e){
    		return false;
    	}
    	
    	
    }
  //Add Anken End   20140418 song-yy
    /**
     * 子画面で行う作業モードを返します。
     * @return 作業モード（INSERT/UPDATE）
     */
    public String getOperationMode() {
        return operationMode;
    }

    // tree例外制御用
    private int _maxDisplayLevel = -1;
    private int _initDisplayLevel = -1;
    private int _maxRead = -1;

    /**
     * 親ノードに対する子ノードをツリー展開します
     * @param  parentNodeElement 親ノードエレメント
     * @param  parentNodeStruct 親ノードのsturct
     * @param  parentNodeId 親ノードID
     * @param  compNodeId 子ノードID（このIDから開始）
     * @param  maxNodeId 読込可能最大ノードID（このIDを超えることはできない）
     * @param  compTreeLevel 子ツリーレベル
     * @param  maxLevel 最大展開レベル
     * @param  selectFlag 読込フラグ
     * @return 次のノードID
     * @throws BusinessProcessException ？
     * @throws FoundationException ？
     * @throws ExpjException ？
     * @throws MaxLineException ？
     */
    private int expandTree(
        Element parentNodeElement,
        AC0120010Struct parentNodeStruct,
        int parentNodeId,
        int compNodeId,
        int maxNodeId,
        int compTreeLevel,
        int maxLevel,
        boolean selectFlag)
      throws BusinessProcessException, FoundationException, ExpjException, MaxLineException {
        try {
            // 子ノードの一覧を取得
            AC0120010Struct workStruct = new AC0120010Struct();
            workStruct.setOD_NO(parentNodeStruct.getOD_NO());
            List compNodeList = entity.mNode.read(conn, workStruct);

            if ("3".equals(parentNodeElement.getAttribute("MRP_TYP"))) {
                // 削除品目の場合、末端ノードとして専用アイコンをセットする。
                parentNodeElement.setAttribute("ctx", "T");
                parentNodeElement.setAttribute("icon1", "TreeIcon3C");
                return compNodeId;
            } else {
                // 削除品目以外の場合

                if (compNodeList.size() == 0) {
                    // 末端ノードの場合
                    parentNodeElement.setAttribute("ctx", "T");
                    // ツリーアイコンをセット
                    if ("1".equals(parentNodeElement.getAttribute("OD_TYP"))
                        || "2".equals(parentNodeElement.getAttribute("OD_TYP"))) {
                        parentNodeElement.setAttribute("icon1", "AD0020011CIcon01C");
                        //						parentNodeElement.setAttribute("icon1", "AC0120011CIcon01C");
                    } else if ("3".equals(parentNodeElement.getAttribute("OD_TYP"))) {
                        parentNodeElement.setAttribute("icon1", "AD0020011CIcon02C");
                        //						parentNodeElement.setAttribute("icon1", "AC0120011CIcon02C");
                    } else if ("4".equals(parentNodeElement.getAttribute("OD_TYP"))) {
                        parentNodeElement.setAttribute("icon1", "AD0020011CIcon03C");
                        //						parentNodeElement.setAttribute("icon1", "AC0120011CIcon03C");
                    }
                } else if (parentNodeElement.hasAttribute("target") == false) {
                    // 末端以外のノードであり、Rootでない場合
                    parentNodeElement.setAttribute("ctx", "N");
                    // ツリーアイコンをセット
                    if ("1".equals(parentNodeElement.getAttribute("OD_TYP"))
                        || "2".equals(parentNodeElement.getAttribute("OD_TYP"))) {
                        parentNodeElement.setAttribute("icon1", "AD0020011CIcon01A");
                        parentNodeElement.setAttribute("icon2", "AD0020011CIcon01B");
                        //						parentNodeElement.setAttribute("icon1", "AC0120011CIcon01A");
                        //						parentNodeElement.setAttribute("icon2", "AC0120011CIcon01B");
                    } else if ("3".equals(parentNodeElement.getAttribute("OD_TYP"))) {
                        parentNodeElement.setAttribute("icon1", "AD0020011CIcon02A");
                        parentNodeElement.setAttribute("icon2", "AD0020011CIcon02B");
                        //						parentNodeElement.setAttribute("icon1", "AC0120011CIcon02A");
                        //						parentNodeElement.setAttribute("icon2", "AC0120011CIcon02B");
                    } else if ("4".equals(parentNodeElement.getAttribute("OD_TYP"))) {
                        parentNodeElement.setAttribute("icon1", "AD0020011CIcon03A");
                        parentNodeElement.setAttribute("icon2", "AD0020011CIcon03B");
                        //						parentNodeElement.setAttribute("icon1", "AC0120011CIcon03A");
                        //						parentNodeElement.setAttribute("icon2", "AC0120011CIcon03B");
                    }

                    if (compTreeLevel > _maxDisplayLevel) {
                        // ツリーのレベルが表示最大レベルを超えた場合
                        // 親ノードに最大レベル属性を設定
                        parentNodeElement.setAttribute("terminated", "true");
                        ExpjMessage emsg =
                          new ExpjMessage("ZZ01120", Integer.toString(_maxDisplayLevel));
                        parentNodeElement.setAttribute(
                            "terminate_comment",
                            emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
                        msgStruct.addWarn(emsg);
                        sysLog.warning(emsg, getsysUSER_CD());

                        return compNodeId;
                    }
                    if (compTreeLevel > maxLevel) {
                        // ツリーのレベルが指定レベルを超えた場合
                        // 親ノードに下位レベル未読込属性を設定
                        parentNodeElement.setAttribute("not_read", "true");
                        return compNodeId;
                    }
                }
            }

            int compNodeListSize = compNodeList.size();
            if (maxNodeId > 0) {
                // ツリーの読込行数
                int readCount = 0;
                if (selectFlag) {
                    readCount = compNodeId + compNodeListSize - 1;
                } else {
                    readCount = compNodeListSize;
                }
                if (readCount - 1 > maxNodeId) {
                    // ツリーの読込行数が最大値を超えた場合
                    throw new MaxLineException();
                }
            }
            
            

            for (int i = 0; i < compNodeListSize; i++) {
                AC0120010Struct compNodeStruct = (AC0120010Struct) compNodeList.get(i);
                // 子ノードを生成、ツリー用XMLに追加
                Element compNodeElement = flashTree.createElement("node");
                parentNodeElement.appendChild(compNodeElement);
                // compNodeStructから子ノードの各種属性データを設定
              //Add Anken Start 20140428 song-yy
                tempList.add(compNodeStruct);
                struct.seth_size(Integer.toString(tempList.size()));
               // tempList.add(compNodeStruct);
              //Add Anken End   20140428 song-yy

                compNodeStruct.setlabel(
                    compNodeStruct.getITEM_CD() + " " + null2blank(compNodeStruct.getITEM_NAME()));
                setStruct2XML(
                    compNodeElement,
                    compNodeStruct,
                    compNodeId,
                    compTreeLevel,
                    parentNodeId);
                // 下位レベルノードを展開（再帰的にツリーを展開する）
                compNodeId =
                  expandTree(
                      compNodeElement,
                      compNodeStruct,
                      compNodeId,
                      compNodeId + 1,
                      maxNodeId,
                      compTreeLevel + 1,
                      maxLevel,
                      selectFlag);
            }

        } catch (SQLException se) {
            se.printStackTrace();
            // エラー：サーバでエラーが発生しました。
            ExpjMessage emsg = new ExpjMessage("ZZ01106");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(se, emsg);
            emsg = new ExpjMessage("ZZ01006", se.toString());
            sysLog.severe(emsg, getsysUSER_CD());
            throw ee;
        }

        return compNodeId;
    }

    /**
     * 画面の全項目を初期化します。
     */
    private void initializeAll() {
        struct.setPLANT_CD(sysPLANT_CD);
        struct.setJOB_ODR_CD(null);
        struct.setJOB_ODR_CANCEL_NO("0");
        struct.setInitLevel(String.valueOf(_initDisplayLevel));
        //Add Anken Start 20140417 song-yy
        struct.seth_size(null);
        //Add Anken End   20140417 song-yy
        

        initializeDetail();
    }

    /**
     * 画面の詳細項目を初期化します。
     */
    private void initializeDetail() {
        struct.setOD_NO(null);
        struct.setOD_TYP(null);
        struct.setMRP_TYP(null);
        struct.setOUTSIDE_TYP(null);
        struct.setJOB_ODR_TYP(null);
        //struct.setJOB_ODR_TYP_DN(null);
        struct.setMRP_TYP(null);
        struct.setITEM_CD(null);
        struct.setDetail_ITEM_NAME(null);
        struct.setDRAW_CD(null);
        struct.setSPEC(null);
        struct.setALC_GRP_CD(null);
        struct.setOUTSIDE_TYP(null);
        struct.setOUTSIDE_TYP_DN(null);
        struct.setMRP_ODR_TYP(null);
        struct.setMRP_ODR_TYP_DN(null);
        struct.setITEM_SPOIL(null);
        struct.setUNIT_QTY_TYP(null);
        struct.setUNIT_QTY_TYP_DN(null);
        struct.setJOB_ODR_DLV_DATE(null);
        struct.setDUE_DATE(null);
        struct.setPRD_DUE_DATE(null);
        struct.setPRD_START_DATE(null);
        struct.setODR_START_DATE(null);
        struct.setDM_QTY(null);
        struct.setODR_QTY(null);
        struct.setSUM_ALCD_QTY(null);
        struct.setODR_STS_TYP(null);
        struct.setODR_STS_TYP_DN(null);
        struct.setDM_STS_TYP(null);
        struct.setDM_STS_TYP_DN(null);
        struct.setOD_TYP_DN(null);
        struct.setOD_GNR_TYP_DN(null);
//      ▼▼ 2008/08/21 ADD START -TSUCHIDA▼▼
     		struct.setMANHOUR_TYP_DN(null);
//      ▲▲ 2008/08/21 ADD END -TSUCHIDA▲▲        
        struct.setMODIFY_COUNT(null);
        //Add Anken Start 20140417 song-yy
        struct.setOPR_RSLT_TYP_DN(null);
        struct.setTOTAL_RCV_QTY(null);
        struct.setTOTAL_ISSUE_QTY(null);
        struct.setJOB_ODR_STS_TYP1(null);
        struct.setCHIID_OD_NO(null);
        //tempList = null;
        //Add Anken End   20140417 song-yy
        
        // ツリーを初期化
        flashTree = new XmlDocument();

        list = null;

        readStatus = INITIAL;
    }

    /**
     * Structのサブ１編集領域を初期化します。
     */
    private void initializeSub1Struct()
      {
          struct.setSub1_Comp_ITEM_CD(null);
          struct.setSub1_Comp_ITEM_NAME(null);
          struct.setSub1_DRAW_CD(null);
          struct.setSub1_SPEC(null);
          struct.setSub1_MRP_ODR_TYP_DN(null);
          struct.seth_Sub1_MRP_ODR_TYP(null);
          struct.setSub1_ITEM_SPOIL("0.0");
          struct.setSub1_UNIT_QTY_TYP_DN(null);
          struct.seth_Sub1_UNIT_QTY_TYP(null);
          struct.setSub1_DUE_DATE(null);
          struct.setSub1_PRD_DUE_DATE(null);
          struct.setSub1_PRD_START_DATE(null);
          struct.setSub1_ODR_START_DATE(null);
          struct.setSub1_DUE_TIME(null);
          struct.setSub1_PRD_DUE_TIME(null);
          struct.setSub1_PRD_START_TIME(null);
          struct.setSub1_ODR_START_TIME(null);
          struct.setSub1_ODR_QTY("0.0");
          struct.setSub1_DM_QTY("0.0");
          struct.setSub1_PS_UNIT_DENOMINATOR("1.0");
          struct.setSub1_PS_UNIT_NUMERATOR("1.0");
          struct.setSub1_PS_SPOIL("0.0");
        //Add Anken Start 20140425 song-yy
          struct.seth_Sub1_DM_STS_TYP(null);
          struct.seth_Sub1_ODR_STS_TYP(null);
          struct.seth_DM_STS_TYP(null);
          struct.seth_ODR_STS_TYP(null);
        //Add Anken End   20140425 song-yy
      }

    /**
     * 文字列がnullの場合に空文字に変換して返します。
     * @param string 文字列
     * @return 文字列がnullの場合に空文字、それ以外の場合は文字列
     */
    private String null2blank(String string) {
        if (string == null) {
            return "";
        } else {
            return string;
        }
    }


    /**
     * 要求数の算出
     * @param AC0120010Struct
     * @return String 要求数
     */
    private String calcDmQty(AC0120010Struct st) {

        CommonOd od =
          new CommonOd(conn,
                       this.sysPLANT_CD,
                       this.sysUSER_CD,
                       this.sp.getProcId());

        // 要求数の算出・設定
        String psUnitNumerator = struct.getSub1_PS_UNIT_NUMERATOR();						// 構成単位数分子
        String psUnitDenominator = struct.getSub1_PS_UNIT_DENOMINATOR();					// 構成単位数分母
        String psSpoil = struct.getSub1_PS_SPOIL();											// 構成仕損率
        String parentOdrQty = struct.geth_Sub1_Parent_ODR_QTY();							// 親品目手配数

        String psUnitQty = Calculate.divide(psUnitNumerator, psUnitDenominator, 8, Calculate.CEIL);
        // 構成単位数
        String dmQty = Calculate.divide(psSpoil, "100", 8, Calculate.CEIL);					// 要求数
        dmQty = Calculate.add(dmQty, "1");
        dmQty = Calculate.multiply(dmQty,parentOdrQty);
        dmQty = Calculate.multiply(dmQty,psUnitQty);
        dmQty = Double.toString(od.changeQtyUp(Double.parseDouble(dmQty),Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP())));

        return dmQty;
    }


    /**
     *製造納期の算出
     * @param AC0120010Struct
     * @return String 製造納期
     */
    private String calcPrdDueDate(AC0120010Struct st) {

        String fixedLt = st.getFIXED_LT();
        String propLt = st.getPROP_LT();
        String safetyLt = st.getSAFETY_LT();
        String propLotSize = st.getPROP_LOT_SIZE();
        String odrLt = st.getODR_LT();
        String issueLt = st.getISSUE_LT();
        String resultDate = null;

        try{
            // struct.setSub1_DUE_DATE(struct.geth_Sub1_Parent_ODR_START_DATE());
            issueLt = Calculate.multiply(issueLt, "-1");		//減算日になるように負符号に
            resultDate = calcWorkDay(ConDateTime(struct.getSub1_DUE_DATE(),struct.getSub1_DUE_TIME()), issueLt, true);

            return resultDate;

        }catch(Exception e){
            return null;
        }
    }


    /**
     *製造着手日の算出
     * @param AC0120010Struct
     * @return String 製造着手日
     */
    private String calcPrdStartDate(AC0120010Struct st) {

        String odrLt = st.getODR_LT();
        String propLt = st.getPROP_LT();
        String fixedLt = st.getFIXED_LT();
        String safetyLt = st.getSAFETY_LT();
        String propLotSize = st.getPROP_LOT_SIZE();
        String resultDate;

        try{

            String itemLt =
              Calculate.divide(struct.getSub1_ODR_QTY(), propLotSize, 0, Calculate.CEIL);
            itemLt = Calculate.multiply(itemLt, propLt);
            itemLt = Calculate.add(itemLt, fixedLt);
            itemLt = Calculate.add(itemLt, safetyLt);
            itemLt = Calculate.multiply(itemLt, "-1");			// 減算日になるように負符号に

            resultDate = calcWorkDay(ConDateTime(struct.getSub1_PRD_DUE_DATE(),struct.getSub1_PRD_DUE_TIME()), itemLt, true);

            return resultDate;
        }catch(Exception e){
            return null;
        }
    }


    /**
     * 手配着手日の算出
     * @param AC0120010Struct
     * @return String 手配着手日
     */
    private String calcOdrStartDate(AC0120010Struct st) {

        String OdrStartDate = null;
        String odrLt = st.getODR_LT();
        String resultDate = null;

        try{
            odrLt = Calculate.multiply(odrLt, "-1");			// 減算日になるように負符号に
            resultDate = calcWorkDay(ConDateTime(struct.getSub1_PRD_START_DATE(),struct.getSub1_PRD_START_TIME()), odrLt, true);

            return resultDate;

        } catch (Exception e) {
            return null;
        }
    }


    /**
     * 手配数の算出
     * @param AC0120010Struct
     * @return String 手配数
     */
    private String calcOdrQty(String dmQty, AC0120010Struct st) {
        String itemSpoil = st.getSub1_ITEM_SPOIL();
        String odrQty = null;

        CommonOd od =
          new CommonOd(conn,
                       this.sysPLANT_CD,
                       this.sysUSER_CD,
                       this.sp.getProcId());
        odrQty =
          Calculate.divide(itemSpoil, "100", 8, Calculate.CEIL);
        odrQty = Calculate.add(odrQty, "1");
        odrQty = Calculate.multiply(odrQty, dmQty);
        odrQty = Double.toString(od.changeQtyUp(Double.parseDouble(odrQty),Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP())));

        return odrQty;
    }


    /**
     * オーダ情報更新(下位品目のデマンド情報更新)
     *
     * @param rs 下位品目のResultSet
     * @param parentOdNo 親オーダデマンド番号
     * @param parentOdrQty 親オーダ数量
     * @param parentOdrStartDate 親オーダ数量
     * @param parentOdrStartDate 手配着手日
     * @param parentPrdDueDate 親製造納期
     * @param parentPrdStartDate 製造着手日
     * @throws SQLException
     * @throws ApsComException
     */
    public void changeChildOdInfo(ResultSet rs, String parentOdNo, String parentOdrQty,
                                  Date parentOdrStartDate, Date parentPrdDueDate,Date parentPrdStartDate)
      throws SQLException,ApsComException, FoundationException {
        
        IDbConnection _iconn;				 // トランザクションコネクション情報
        String _plantCd;					 // 工場コード

        CommonOd od =
          new CommonOd(conn,
                       this.sysPLANT_CD,
                       this.sysUSER_CD,
                       this.sp.getProcId());

        PreparedStatement ps = null;
        PreparedStatement psOd = null;
        PreparedStatement psWorkInProcByItem = null;
        PreparedStatement psRlsdPuchOdr = null;
        try {
            //			_log.methodStart();
            String odNo = rs.getString("OD_NO");				// オーダデマンド番号
            int odTyp = rs.getInt("OD_TYP");					// オーダデマンド区分

            // << 品目の検索 >>
            String sql = "select * from M_ITEM where ITEM_CD = ? ";
            ps = conn.getConn().prepareStatement(sql);
            ps.setString(1, rs.getString("ITEM_CD"));
            ResultSet rsItem = ps.executeQuery();
            String itemCd = rs.getString("ITEM_CD");

            // デマンド数量の設定--------------------
            String mrpOdrTyp = Integer.toString(rs.getInt("MRP_ODR_TYP"));					  // 品目手配区分
            String psSpoil = Double.toString(rs.getDouble("PS_SPOIL"));					  // 構成仕損率
            String psNumerator = Double.toString(rs.getDouble("PS_UNIT_NUMERATOR")); 	  // 構成単位(分子)
            String psDenominator = Double.toString(rs.getDouble("PS_UNIT_DENOMINATOR"));   // 構成単位(分母)
            // ★★ 構成単位数は分子/分母で計算(2003/8/7)
            // double psUnitQty = rs.getDouble("PS_UNIT_QTY");				 // 構成単位数
            //			double psUnitQty = ( psDenominator == 0.0 ) ? psNumerator : psNumerator / psDenominator;
            String psUnitQty = Calculate.divide(psNumerator, psDenominator, 8, Calculate.CEIL);
            String dmQty = "0.0";										  // デマンド数

            if ( mrpOdrTyp.equals("8") ) {
                // 疑似品目の場合、親のオーダ数量*構成単位(丸め前)
                //				dmQty = parentOdrQty * psUnitQty;
                //              dmQty = (double) Calculate.multiply(parentOdrQty.toString() , psUnitQty.toString());
                dmQty = Calculate.multiply(parentOdrQty, psUnitQty);
            } else {
                //	疑似品目以外の場合、親のオーダ数量*構成単位(丸め前)*(1+ 構成仕損率/100)
                //				dmQty = parentOdrQty * psUnitQty * ( 1 + psSpoil / 100D );
                dmQty = Calculate.divide(psSpoil, "100", 8, Calculate.CEIL);
                dmQty = Calculate.add(dmQty, "1");
                dmQty = Calculate.multiply(dmQty, parentOdrQty);
                dmQty = Calculate.multiply(dmQty, psUnitQty);
            }

            // 丸め処理
            int unitQtyTyp = 0; 								// 在庫数量単位区分(0:整数/1:小数)
            if ( rsItem.next() ) {

                unitQtyTyp = rsItem.getInt("UNIT_QTY_TYP");
                //              psUnitQty = Double.toString(od.changeQtyUp(Double.paseDouble(psUnitQty), unitQtyTyp));
                dmQty = Double.toString(od.changeQtyUp(Double.parseDouble(dmQty),unitQtyTyp));
            } else {
                rsItem.close();
                //				_log.methodEnd();
                throw new ApsComException(50509,"(SBM0981)品目データが存在しません");
            }

            // 要求納期/製造納期の設定--------------------
            int psLtFlg = rs.getInt("PS_LT_FLG");						  // 製品構成リードタイム使用フラグ
            String psFixedLt = Integer.toString(rs.getInt("PS_FIXED_LT"));					  // 固定分リードタイム
            String psPropLotSize = Double.toString(rs.getDouble("PS_PROP_LOT_SIZE"));	  // 製品構成比例分ロットサイズ
            String psPropLt = Integer.toString(rs.getInt("PS_PROP_LT")); 					  // 製品構成比例分リードタイム
            Date dueDate = null;										  // 要求納期

            //親の製造着手日、手配着手日がNULLならば要求納期は変更しない
            if ( (parentPrdStartDate == null  || parentPrdStartDate.equals(""))
                 && (parentOdrStartDate == null || parentOdrStartDate.equals(""))) {
                dueDate = rs.getTimestamp("DUE_DATE");
            } else {
                // 製品構成リードタイム使用フラグ  0:使用しない/1:使用する
                if (psLtFlg == 0) {
                    // 親の手配着手日と同じ
                    dueDate = parentOdrStartDate;
                    // 稼働日チェック
                    dueDate = od.calcOdrStartDate(0, dueDate,itemCd);
                } else {
                    // 親の製造納期 - 構成リードタイムで計算
                    if (Calculate.compare(psPropLotSize, "0") == 0) {
                        rsItem.close();
                        //					_log.methodEnd();
                        throw new ApsComException(50417, "(SBM0982)製品構成比例分ロットサイズが未入力です");
                    }
                    // 製品構成比例分数量 = オーダ数(親)/製品構成比例分ロットサイズ (整数に切り上げ)
                    //				int psPropQty = (int) Math.ceil(parentOdrQty / psPropLotSize);

                    String psPropQty =  (Calculate.divide(parentOdrQty, psPropLotSize ,Calculate.CEIL));

                    psPropQty = Calculate.ceil(psPropQty, 0);

                    // 製品構成比例分数量=0 の場合、=1とする
                    if (Calculate.compare(parentOdrQty, "0") != 0 && Calculate.compare(psPropQty, "0") == 0) {
                        psPropQty = "1";
                    }
                    
                    // 構成リードタイム=製品構成固定リードタイム + 製品構成比例リードタイム*製品構成比例分数量(整数に切り上げ)
                    //              int psLt = (int) Math.ceil(psFixedLt + (psPropLt * psPropQty));
                    String psLt = Calculate.multiply(psPropLt, psPropQty);
                    psLt = Calculate.add(psFixedLt , psLt);
                    psLt = Calculate.ceil(psLt, 0);
                    // 稼働日チェック
                    dueDate = od.calcOdrStartDate(Integer.parseInt(psLt), parentPrdDueDate,itemCd);
                }
            }

            // MRP管理品目の場合、製造納期= 要求納期
            Date prdDueDate = rs.getTimestamp("PRD_DUE_DATE");		                                          // 製造納期	2003/10/14 update
            if (mrpOdrTyp.equals("4") || mrpOdrTyp.equals("5") || mrpOdrTyp.equals("6") || mrpOdrTyp.equals("7")) {
                prdDueDate = dueDate;
            }

            // デマンド状態区分,出庫完了日の設定--------------------
            int dmStsTyp = 9;											                                      // デマンド状態区分=9:完了
            Date issueCmpltDate = null; 								                                      // 出庫完了日
            Date odrStartDate = null;									                                      // 手配着手日  2003/10/14 update
            Date prdStartDate = null;									                                      // 製造着手日  2003/10/14 update
            String odrQtyOfChildOd = "0.0";								                                      // オーダ数	 2003/10/14 update

            // オーダデマンド区分=4:疑似以外のとき
            if ( odTyp != 4 ) {
                odrStartDate = rs.getTimestamp("ODR_START_DATE");		                                      // 手配着手日 2003/10/14 update
                prdStartDate = rs.getTimestamp("PRD_START_DATE");		                                      // 製造着手日 2003/10/14 update
                odrQtyOfChildOd = Double.toString(rs.getDouble("ODR_QTY"));				                      // オーダ数	2003/10/14 update
                //              struct.setsetDM_STS_TYP(Integer.toString(dmStsTyp));
                struct.setsetDUE_DATE(Converter.dateToStr(dueDate, "yyyy/MM/dd"));                            // 要求納期
                if ( odrStartDate == null ) {								                                  // 手配着手日
                    struct.setsetODR_START_DATE(null);
                } else {
                    struct.setsetODR_START_DATE(Converter.dateToStr(odrStartDate, "yyyy/MM/dd"));
                }
                if ( prdDueDate == null ) { 								                                  // 製造納期
                    struct.setsetPRD_DUE_DATE(null);
                } else {
                    struct.setsetPRD_DUE_DATE(Converter.dateToStr(prdDueDate, "yyyy/MM/dd"));
                }
                if ( prdStartDate == null ) {								                                  // 製造着手日
                    struct.setsetPRD_START_DATE(null);
                } else {
                    struct.setsetPRD_START_DATE(Converter.dateToStr(prdStartDate, "yyyy/MM/dd"));
                }

                struct.setsetDM_QTY(dmQty); 							                                      // デマンド数
                struct.setsetODR_QTY(odrQtyOfChildOd);							                              // オーダ数
                struct.setsetOD_NO(odNo);
                entity.mupdateChild.update(conn, struct);
            }

            // オーダデマンド区分=4:疑似の時の処理 ===================================

            //          String itemSpoil = Double.toString(rsItem.getDouble("ITEM_SPOIL"));			         // 品目仕損率
            String itemSpoil = Double.toString(rs.getDouble("ITEM_SPOIL"));			                         // 品目仕損率

            //          String odrLt = Integer.toString(rsItem.getInt("ODR_LT"));						     // 手配リードタイム
            String odrLt = Integer.toString(rs.getInt("ODR_LT"));						                     // 手配リードタイム

            //          String issueLt = Integer.toString(rsItem.getInt("ISSUE_LT"));					     // 払出リードタイム
            String issueLt = Integer.toString(rs.getInt("ISSUE_LT"));					                     // 払出リードタイム

            //          String fixedLt = Integer.toString(rsItem.getInt("FIXED_LT"));					     // 固定分リードタイム
            String fixedLt = Integer.toString(rs.getInt("FIXED_LT"));					                     // 固定分リードタイム

            //          String propLotSize = Double.toString(rsItem.getDouble("PROP_LOT_SIZE")); 	         // 比例分ロットサイズ
            String propLotSize = Double.toString(rs.getDouble("PROP_LOT_SIZE")); 	  // 比例分ロットサイズ

            //          String propLt = Integer.toString(rsItem.getInt("PROP_LT"));						  // 比例分リードタイム
            String propLt = Integer.toString(rs.getInt("PROP_LT"));						  // 比例分リードタイム

            //          String safetyLt = Integer.toString(rsItem.getInt("SAFETY_LT"));					  // 安全日数
            String safetyLt = Integer.toString(rs.getInt("SAFETY_LT"));					  // 安全日数


            // Date odrStartDate = null;								  // 手配着手日 2003/10/14 delete
            // Date prdStartDate = null;								  // 製造着手日 2003/10/14 delete
            // double odrQtyOfChildOd = 0.0D;							  // オーダ数	2003/10/14 delete

            if ( odTyp == 4 ) {

                // オーダ数(下位品目) = デマンド数量 * ( 1 + ( 所要量品目仕損率 / 100 )-------
                //              odrQtyOfChildOd = dmQty * (1 + itemSpoil / 100D);
                odrQtyOfChildOd = Calculate.divide(itemSpoil, "100", 8, Calculate.CEIL);

                odrQtyOfChildOd = Calculate.add(odrQtyOfChildOd, "1");

                odrQtyOfChildOd = Calculate.multiply(dmQty, odrQtyOfChildOd);

                odrQtyOfChildOd = Double.toString(od.changeQtyUp(Double.parseDouble(odrQtyOfChildOd), unitQtyTyp)); // 丸め処理





                // 製造納期 = 要求納期 - 払出リードタイム (稼働日チェック)------------
                prdDueDate = od.calcOdrStartDate(Integer.parseInt(issueLt), dueDate,itemCd);


                // 製造着手日 = 製造納期 - 品目リードタイム-------------------------
                if (Calculate.compare(propLotSize, "0") == 0) {

                    //					 _log.methodEnd();
                    throw new ApsComException(50416, "(SBM0983)比例分ロットサイズが未入力です");
                }
                String propQty = Calculate.divide(odrQtyOfChildOd , propLotSize, Calculate.CEIL);

                // 比例分数量=0 の場合、=1とする
                if (Calculate.compare(odrQtyOfChildOd, "0") != 0 && Calculate.compare(propQty, "0") == 0) {

                    propQty = "1";
                }
                // 品目リードタイム = 固定リードタイム + ( 比例リードタイム * 分数量) + 安全日数 (整数に切り上げ)
                //              int lt = (int) Math.ceil(fixedLt + (propLt * propQty) + safetyLt);
                String lt = Calculate.multiply(propLt, propQty);
                lt = Calculate.add(fixedLt, lt);
                lt = Calculate.add(lt, safetyLt);
                lt = Calculate.ceil(lt, 0);
                // 稼働日チェック

                prdStartDate = od.calcOdrStartDate(Integer.parseInt(lt), prdDueDate,itemCd);

                // 手配着手日 = 製造着手日 - 手配リードタイム (稼働日チェック)-----------
                odrStartDate = od.calcOdrStartDate(Integer.parseInt(odrLt), prdStartDate,itemCd);

                //              struct.setsetDM_STS_TYP(Integer.toString(dmStsTyp));
                struct.setsetDUE_DATE(Converter.dateToStr(dueDate, "yyyy/MM/dd"));                     // 要求納期
                if ( odrStartDate == null ) {								                             // 手配着手日

                    struct.setsetODR_START_DATE(null);
                } else {

                    struct.setsetODR_START_DATE(Converter.dateToStr(odrStartDate, "yyyy/MM/dd"));
                }
                if ( prdDueDate == null ) { 								                            // 製造納期

                    struct.setsetPRD_DUE_DATE(null);
                } else {

                    struct.setsetPRD_DUE_DATE(Converter.dateToStr(prdDueDate, "yyyy/MM/dd"));
                }
                if ( prdStartDate == null ) {								                            // 製造着手日

                    struct.setsetPRD_START_DATE(null);
                } else {

                    struct.setsetPRD_START_DATE(Converter.dateToStr(prdStartDate, "yyyy/MM/dd"));
                }

                struct.setsetDM_QTY(dmQty); 							                // デマンド数
                struct.setsetODR_QTY(odrQtyOfChildOd);							    // オーダ数

                struct.setsetOD_NO(odNo);

                entity.mupdateChildGiji.update(conn, struct);

            }

            //          od.changeCommon(odNo);

            // 疑似品目の場合、さらに下位のデマンド情報を作成する。
            if ( odTyp == 4 ) {

                sql = "select * from T_OD where PARENT_OD_NO = ?";
                ps = conn.getConn().prepareStatement(sql);
                ps.setString(1, odNo);
                rs = ps.executeQuery();
                while ( rs.next() ) {

                    // 2003/09/02 update
                    //this.changeChildOdInfo(rs, odNo, odrQtyOfChildOd, odrStartDate, prdDueDate);
                    this.changeChildOdInfo(rs, parentOdNo, odrQtyOfChildOd, odrStartDate, prdDueDate,prdStartDate);
                }
                rs.close();
                ps.close();

            }
            //			_log.methodEnd();
        }
        finally {
            if (ps != null)
              {
                  ps.close();
              }
            if (psOd != null)
              {
                  psOd.close();
              }
            if (psWorkInProcByItem != null)
              {
                  psWorkInProcByItem.close();
              }
            if (psRlsdPuchOdr != null)
              {
                  psRlsdPuchOdr.close();
              }
        }
    }


    /**
     *登録、更新時の共通チェック
     *
     * @param st AC0120010Struct
     * @param mode 登録修正モードの区分
     * @throws ApsComException
     */
    private boolean updateErrCheck(AC0120010Struct st, String mode)
      {
          try{
              String sql = null;
              boolean result = false;
              boolean bWorkDay = false;
              DateConverter dc = new DateConverter();
              WorkDay workday = new WorkDay(sysUSER_CD, sp.getProcId(), sysPLANT_CD, null);

              PreparedStatement ps = null;
              ResultSet rs = null;


              //[品目]の存在チェック
              List checkT_ITEMList = entity.mcheckT_ITEM.read(conn, struct);
              if (checkT_ITEMList.isEmpty() ) {
                  setErrorMessage("AC00220");
                  setErrorParameter("M_ITEM","ITEM_CD",struct.getSub1_Comp_ITEM_CD());

                  return false;
              } else {

                  //[品目]の他ユーザによる変更チェック
                  AC0120010Struct checkT_ITEMStruct = (AC0120010Struct) checkT_ITEMList.get(0);
                  if (!checkT_ITEMStruct.getITEM_MODIFY_COUNT().equals(struct.geth_Comp_ITEM_MODIFY_COUNT())) {
                      setErrorMessage("AC00017");
                      setErrorParameter("M_ITEM","ITEM_CD",struct.getSub1_Comp_ITEM_CD());
                      setErrorParameter("M_ITEM","MODIFY_COUNT",struct.geth_Comp_ITEM_MODIFY_COUNT());

                      return false;
                  }
              }


              //オーダデマンド番号に一致する[所要量]の存在チェック
              List checkT_ODList = entity.mcheckT_OD1.read(conn, struct);
              if (checkT_ODList.isEmpty() ) {
                  setErrorMessage("AC00029");
                  setErrorParameter("T_OD","OD_NO",struct.getSub1_PARENT_OD_NO());

                  return false;
              } else {

                  //[所要量]の他ユーザによる変更チェック
                  AC0120010Struct checkT_ODStruct = (AC0120010Struct) checkT_ODList.get(0);
                  if (!checkT_ODStruct.getOD_MODIFY_COUNT().equals(struct.geth_Parent_OD_MODIFY_COUNT())) {
                      setErrorMessage("AC00017");
                      setErrorParameter("T_OD","OD_NO",struct.getSub1_PARENT_OD_NO());
                      setErrorParameter("T_OD","MODIFY_COUNT",struct.geth_Parent_OD_MODIFY_COUNT());

                      return false;
                  }
              }


              //親品目が擬似品目の場合には子品目に擬似品目を登録できない
              //親品目の品目手配区分を取得
              if (mode.equals("INSERT")) {

                  List checkSubOdRead1List = entity.mcheckSubOdRead1.read(conn, struct);

                  if (checkSubOdRead1List.isEmpty()) {
                      setErrorMessage("AC00220");

                      return false;
                  }

                  AC0120010Struct checkSubOdRead1Struct = (AC0120010Struct) checkSubOdRead1List.get(0);


                  if (checkSubOdRead1Struct.getMRP_ODR_TYP().equals("8")) {

                      //親品目の品目手配区分が8：擬似品目の場合
                      //子品目の品目手配区分をチェックする
                      List checkSubOdRead2List = entity.mcheckSubOdRead2.read(conn, struct);
                      if (checkSubOdRead2List.isEmpty()) {

                          setErrorMessage("AC00220");
                          setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());

                          return false;
                      }

                      AC0120010Struct checkSubOdRead2Struct = (AC0120010Struct) checkSubOdRead2List.get(0);

                      if (checkSubOdRead2Struct.getMRP_ODR_TYP().equals("8")) {

                          setErrorMessage("AC00024");
                          setErrorParameter("M_ITEM","ITEM_CD",checkSubOdRead2Struct.getMRP_ODR_TYP());

                          return false;
                      }

                  }

              }


              if (mode.equals("INSERT")) {
                  //上位品目に同一品目が存在する場合
                  sql = "SELECT  T_OD.ITEM_CD AS ITEM_CD";
                  sql = sql + " FROM T_OD";
                  sql = sql + " WHERE T_OD.JOB_ODR_CD = ?";
                  sql = sql + " AND T_OD.JOB_ODR_CANCEL_NO = ?";
                  sql = sql + " AND T_OD.JOB_ODR_DETAIL_NO = 0";
                  sql = sql + " AND T_OD.ITEM_CD = ?";
                  sql = sql + " START WITH T_OD.OD_NO = ?";
                  sql = sql + " CONNECT BY PRIOR T_OD.PARENT_OD_NO = T_OD.OD_NO";

                  ps = conn.getConn().prepareStatement(sql);
                  ps.setString(1, struct.getJOB_ODR_CD());
                  ps.setString(2, struct.getJOB_ODR_CANCEL_NO());
                  ps.setString(3, struct.getSub1_Comp_ITEM_CD());
                  ps.setString(4, struct.getOD_NO());
                  rs = ps.executeQuery();
                  if (rs.next()){

                      setErrorMessage("AC00023");
                      setErrorParameter("T_OD","JOB_ODR_CD",struct.getJOB_ODR_CD());
                      setErrorParameter("T_OD","JOB_ODR_CANCEL_NO",struct.getJOB_ODR_CANCEL_NO());
                      setErrorParameter("T_OD","JOB_ODR_DETAIL_NO","0");
                      setErrorParameter("T_OD","ITEM_CD",struct.getSub1_Comp_ITEM_CD());
                      setErrorParameter("T_OD","OD_NO",struct.getOD_NO());

                      return false;

                  }

                  //上位品目にメンテナンス済み品目が存在する場合
                  sql = "SELECT  T_OD.ITEM_CD AS ITEM_CD";
                  sql = sql + " FROM T_OD";
                  sql = sql + " WHERE T_OD.JOB_ODR_CD = ?";
                  sql = sql + " AND T_OD.JOB_ODR_CANCEL_NO = ?";
                  sql = sql + " AND T_OD.JOB_ODR_DETAIL_NO = 0";
                  sql = sql + " AND T_OD.MRP_TYP != 9";
                  sql = sql + " START WITH T_OD.OD_NO = ?";
                  sql = sql + " CONNECT BY PRIOR T_OD.PARENT_OD_NO = T_OD.OD_NO";

                  ps.close();
                  ps = conn.getConn().prepareStatement(sql);
                  ps.setString(1, struct.getJOB_ODR_CD());
                  ps.setString(2, struct.getJOB_ODR_CANCEL_NO());
                  ps.setString(3, struct.getOD_NO());
                  rs = ps.executeQuery();
                  while (rs.next()){
                      setWarningMessage("AC00028",rs.getString("ITEM_CD"));
                  }


                  
              } else {

                  //上位品目にメンテナンス済み品目が存在する場合
                  sql = "SELECT  T_OD.ITEM_CD AS ITEM_CD";
                  sql = sql + " FROM T_OD";
                  sql = sql + " WHERE T_OD.JOB_ODR_CD = ?";
                  sql = sql + " AND T_OD.JOB_ODR_CANCEL_NO = ?";
                  sql = sql + " AND T_OD.JOB_ODR_DETAIL_NO = 0";
                  sql = sql + " AND T_OD.MRP_TYP != 9";
                  sql = sql + " AND T_OD.OD_NO != ?";
                  sql = sql + " START WITH T_OD.OD_NO = ?";
                  sql = sql + " CONNECT BY PRIOR T_OD.PARENT_OD_NO = T_OD.OD_NO";

                  ps = conn.getConn().prepareStatement(sql);
                  ps.setString(1, struct.getJOB_ODR_CD());
                  ps.setString(2, struct.getJOB_ODR_CANCEL_NO());
                  ps.setString(3, struct.getOD_NO());
                  ps.setString(4, struct.getOD_NO());
                  rs = ps.executeQuery();
                  while (rs.next()){
                      setWarningMessage("AC00028",rs.getString("ITEM_CD"));
                  }

                  //下位品目にメンテナンス済み品目が存在する場合
                  
                  sql = "SELECT  T_OD.ITEM_CD AS ITEM_CD";
                  sql = sql + " FROM T_OD";
                  sql = sql + " WHERE T_OD.JOB_ODR_CD = ?";
                  sql = sql + " AND T_OD.JOB_ODR_CANCEL_NO = ?";
                  sql = sql + " AND T_OD.JOB_ODR_DETAIL_NO = 0";
                  sql = sql + " AND T_OD.MRP_TYP != 9";
                  sql = sql + " AND T_OD.OD_NO != ?";
                  sql = sql + " START WITH T_OD.OD_NO = ?";
                  sql = sql + " CONNECT BY PRIOR T_OD.OD_NO = T_OD.PARENT_OD_NO";

                  ps.close();
                  ps = conn.getConn().prepareStatement(sql);
                  ps.setString(1, struct.getJOB_ODR_CD());
                  ps.setString(2, struct.getJOB_ODR_CANCEL_NO());
                  ps.setString(3, struct.getOD_NO());
                  ps.setString(4, struct.getOD_NO());
                  rs = ps.executeQuery();
                  while (rs.next()){
                      setWarningMessage("AC00028",rs.getString("ITEM_CD"));
                  }
              }

              rs.close();
              
              //品目手配品区分が1または2、手配品が0でなく製造納期が休日の場合
              bWorkDay = false;


              if (struct.geth_Sub1_MRP_ODR_TYP().equals("1") || struct.geth_Sub1_MRP_ODR_TYP().equals("2")) {

                  if (Calculate.compare( struct.getSub1_ODR_QTY(), "0") != 0) {

                      Date targetDay = dc.str2date(struct.getSub1_PRD_DUE_DATE());
                      bWorkDay = workday.isWorkDate(targetDay);

                      if (!bWorkDay) {
                          setErrorMessage("AC00013");
                          setErrorParameter("T_OD","PRD_DUE_DATE",struct.getSub1_PRD_DUE_DATE());

                          return false;
                      }
                  }
              }

              //品目手配品区分が1または2、手配品が0でなく製造着手日が休日の場合
              bWorkDay = false;

              if (struct.geth_Sub1_MRP_ODR_TYP().equals("1") || struct.geth_Sub1_MRP_ODR_TYP().equals("2")) {
                  if (Calculate.compare( struct.getSub1_ODR_QTY(), "0") != 0) {
                      Date targetDay = dc.str2date(struct.getSub1_PRD_START_DATE());

                      bWorkDay = workday.isWorkDate(targetDay);
                      if (!bWorkDay) {
                          setErrorMessage("AC00012");
                          setErrorParameter("T_OD","PRD_START_DATE",struct.getSub1_PRD_START_DATE());

                          return false;
                      }
                  }
              }

              //品目手配品区分が1または2、手配品が0でなく手配着手日が休日の場合
              bWorkDay = false;

              if (struct.geth_Sub1_MRP_ODR_TYP().equals("1") || struct.geth_Sub1_MRP_ODR_TYP().equals("2")) {
                  if (Calculate.compare( struct.getSub1_ODR_QTY(), "0") != 0) {
                      Date targetDay = dc.str2date(struct.getSub1_ODR_START_DATE());

                      bWorkDay = workday.isWorkDate(targetDay);
                      if (!bWorkDay) {
                          setErrorMessage("AC00014");
                          setErrorParameter("T_OD","ODR_START_DATE",struct.getSub1_ODR_START_DATE());

                          return false;
                      }
                  }
              }

              if (struct.geth_Sub1_MRP_ODR_TYP().equals("1") || struct.geth_Sub1_MRP_ODR_TYP().equals("2")) {

                  if (Calculate.compare( struct.getSub1_ODR_QTY(), "0") != 0) {
                      //製造納期が製造着手日より過去の場合

                      if ((struct.getSub1_PRD_DUE_DATE() != null && !struct.getSub1_PRD_DUE_DATE().equals(""))
                          && (struct.getSub1_PRD_START_DATE() != null && !struct.getSub1_PRD_START_DATE().equals(""))) {

                          if (DateTool.compareYMD(struct.getSub1_PRD_DUE_DATE(), struct.getSub1_PRD_START_DATE()) < 0) {
                              setErrorMessage("AC00020");
                              setErrorParameter("T_OD","PRD_DUE_DATE",struct.getSub1_PRD_DUE_DATE());
                              setErrorParameter("T_OD","PRD_START_DATE",struct.getSub1_PRD_START_DATE());

                              return false;
                          }
                      }

                      //製造着手日が手配着手日より過去の場合
                      if ((struct.getSub1_PRD_START_DATE() != null && !struct.getSub1_PRD_START_DATE().equals(""))
                          && (struct.getSub1_ODR_START_DATE() != null && !struct.getSub1_ODR_START_DATE().equals(""))) {

                          if (DateTool.compareYMD(struct.getSub1_PRD_START_DATE(), struct.getSub1_ODR_START_DATE()) < 0) {
                              setErrorMessage("AC00021");
                              setErrorParameter("T_OD","PRD_START_DATE",struct.getSub1_PRD_START_DATE());
                              setErrorParameter("T_OD","ODR_START_DATE",struct.getSub1_ODR_START_DATE());

                              return false;
                          }
                      }
                  }
              }
              if (struct.geth_Sub1_MRP_ODR_TYP().equals("1") || struct.geth_Sub1_MRP_ODR_TYP().equals("2")) {

                  if (Calculate.compare( struct.getSub1_ODR_QTY(), "0") != 0) {
                      //「製造納期」＝「製造着手日」かつ「製造納期(時刻)」＜「製造着手日(時刻)」のとき

                      if ((struct.getSub1_PRD_DUE_DATE() != null && !struct.getSub1_PRD_DUE_DATE().equals(""))
                          && (struct.getSub1_PRD_START_DATE() != null && !struct.getSub1_PRD_START_DATE().equals(""))) {

                      		if ((struct.getSub1_PRD_DUE_DATE()).equals(struct.getSub1_PRD_START_DATE())) {
                      			
		                          if (CompHH24MI(struct.getSub1_PRD_DUE_TIME(),struct.getSub1_PRD_START_TIME()) < 0) {
		                              setErrorMessage("AC00020");
		                              setErrorParameter("T_OD","PRD_DUE_DATE",ConDateTime(struct.getSub1_PRD_DUE_DATE(),struct.getSub1_PRD_DUE_TIME()));
		                              setErrorParameter("T_OD","PRD_START_DATE",ConDateTime(struct.getSub1_PRD_START_DATE(),struct.getSub1_PRD_START_TIME()));
		
		                              return false;
		                          }
		                          
	                        }
                      }

                      //「製造着手日」＝「手配着手日」かつ「製造着手日(時刻)」＜「手配着手日(時刻)」のとき
                      if ((struct.getSub1_PRD_START_DATE() != null && !struct.getSub1_PRD_START_DATE().equals(""))
                          && (struct.getSub1_ODR_START_DATE() != null && !struct.getSub1_ODR_START_DATE().equals(""))) {

                      		if ((struct.getSub1_PRD_START_DATE()).equals(struct.getSub1_ODR_START_DATE())) {
                      			
		                          if (CompHH24MI(struct.getSub1_PRD_START_TIME(),struct.getSub1_ODR_START_TIME()) < 0) {
		                              setErrorMessage("AC00021");
		                              setErrorParameter("T_OD","PRD_START_DATE",ConDateTime(struct.getSub1_PRD_START_DATE(),struct.getSub1_PRD_START_TIME()));
		                              setErrorParameter("T_OD","ODR_START_DATE",ConDateTime(struct.getSub1_ODR_START_DATE(),struct.getSub1_ODR_START_TIME()));
		
		                              return false;
		                          }
		                          
                          }
                      }
                  }
              }
          	
              //内外作区分が1:内作かつ子品目番号と一致する作業系列が存在しない場合
              if (struct.getSub1_OUTSIDE_TYP().equals("1")) {
                  result = entity.mcheckM_PROC_GRP.check(conn, struct);
                  if (result == false) {
                      setWarningMessage("AC00025");
                      setWarningParameter("M_PROC_GRP","PLANT_CD",struct.getPLANT_CD());
                      setWarningParameter("M_PROC_GRP","ITEM_CD",struct.getSub1_Comp_ITEM_CD());

                  }
              }

              //内外作区分が2:外作かつ子品目番号と一致する購入単価が存在しない場合
              if (struct.getSub1_OUTSIDE_TYP().equals("2")) {
                  result = entity.mcheckM_PUCH_UNIT_COST.check(conn, struct);
                  if (result == false) {
                      setWarningMessage("AC00026");
                      setWarningParameter("M_PUCH_UNIT_COST","COMPANY_CD",struct.getCOMPANY_CD());
                      setWarningParameter("M_PUCH_UNIT_COST","PLANT_CD",struct.getPLANT_CD());
                      setWarningParameter("M_PUCH_UNIT_COST","ITEM_CD",struct.getSub1_Comp_ITEM_CD());

                  }
              }


              //品目手配品区分が1または2、かつ手配品が0でない場合
              //製造納期、製造着手日、手配着手日を計算し、入力値と比較する
              String workPrdDueDate = null;
              String workPrdStartDate = null;
              String workOdrStartDate = null;
              String workOdrQty = null;
              String workDmQty = null;

              boolean workDateChkFlg = false;
              
              if (("1".equals(struct.geth_Sub1_MRP_ODR_TYP())
                   || "2".equals(struct.geth_Sub1_MRP_ODR_TYP()))
                  && (Calculate.compare(struct.getSub1_ODR_QTY(), "0") != 0)) {

                  //製造納期の比較
                  workPrdDueDate = calcPrdDueDate(st);

                  if ((workPrdDueDate != null && !workPrdDueDate.equals(""))
                      && (struct.getSub1_PRD_DUE_DATE() != null && !struct.getSub1_PRD_DUE_DATE().equals(""))) {
                      if (DateTool.compareYMD(workPrdDueDate, struct.getSub1_PRD_DUE_DATE()) != 0) {
                          setWarningMessage("AC00031");
                          setWarningParameter("T_OD","PRD_DUE_DATE",struct.getSub1_PRD_DUE_DATE());
                          workDateChkFlg = true;
                      }
                  }
                  //製造着手日の比較
                  workPrdStartDate = calcPrdStartDate(st);
                  if ((workPrdStartDate != null && !workPrdStartDate.equals(""))
                      && (struct.getSub1_PRD_START_DATE() != null && !struct.getSub1_PRD_START_DATE().equals(""))) {
                      if (DateTool.compareYMD(workPrdStartDate, struct.getSub1_PRD_START_DATE()) != 0) {
                          
                          if (workDateChkFlg == false) {
                              //日付計算ではメッセージは１種のみ出せばよい    
                              setWarningMessage("AC00031");
                              setWarningParameter("T_OD","PRD_START_DATE",struct.getSub1_PRD_START_DATE());
                          }
                      }
                  }

                  //手配着手日の比較
                  workOdrStartDate = calcOdrStartDate(st);

                  if ((workOdrStartDate != null && !workOdrStartDate.equals(""))
                      && (struct.getSub1_ODR_START_DATE() != null && !struct.getSub1_ODR_START_DATE().equals(""))) {

                      if (DateTool.compareYMD(workOdrStartDate, struct.getSub1_ODR_START_DATE()) != 0) {
                          if (workDateChkFlg == false) {
                              //日付計算ではメッセージは１種のみ出せばよい    
                              setWarningMessage("AC00031");
                              setWarningParameter("T_OD","ODR_START_DATE",struct.getSub1_ODR_START_DATE());
                          }
                      }
                  }

                  //手配数の比較
                  workDmQty = calcDmQty(st);
                  workOdrQty = calcOdrQty(workDmQty, st);
                  if (Calculate.compare(workOdrQty, struct.getSub1_ODR_QTY()) != 0) {
                      setWarningMessage("AC00022");
                      setWarningParameter("T_OD","ODR_QTY",struct.getSub1_ODR_QTY());


                  }

              }
/*
              //選択した品目の所要がメンテナンスの場合
              List checkSubOdRead4List = entity.mcheckSubOdRead4.read(conn, struct);

              if (!checkSubOdRead4List.isEmpty()) {
                  for (int i = 0; i < checkSubOdRead4List.size(); i++) {
                      AC0120010Struct checkSubOdRead4Struct = (AC0120010Struct) checkSubOdRead4List.get(i);
                      setWarningMessage("AC00028",checkSubOdRead4Struct.getITEM_CD());
                      //setWarningParameter("T_OD","JOB_ODR_CD", struct.getJOB_ODR_CD());
                      //setWarningParameter("T_OD","OD_NO", struct.getOD_NO());
                  }
              }
*/
              return true;

          } catch (Exception e) {

              return false;

          }
      }



		/**
		 * 時刻の設定
		 * @param  input    入力String
		 * @param  cnt      桁数
		 * @return String   頭にゼロを埋める
		 */
		private String AppendZero(String input,int cnt){
		  int nCount = cnt - input.length() ;
		  for(int i = 1; i <= nCount;i++)
		  {
		  	input = "0" + input;
		  }
		  return input;
		}
		
		
		/**
		 * システムパラメータ
		 * @return 
		 */
		private void GetTimeCtrl() throws BusinessProcessException, FoundationException {
			try{
				// システムパラメータ（TIME_CTRL）取得
				AC0120010Struct TIME_CTRLStruct = new AC0120010Struct();
				List TIME_CTRLList = entity.mSELECT_TIME_CTRL.read(conn, TIME_CTRLStruct);
				if(null != TIME_CTRLList && TIME_CTRLList.size()>0){
					TIME_CTRLStruct = (AC0120010Struct)TIME_CTRLList.get(0);
					struct.setTIME_CTRL(TIME_CTRLStruct.getTIME_CTRL());
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
		* 時刻比較
		* @param  A  日付時刻(HH24:MI)
		* @param  B  日付時刻(HH24:MI)
		* @return int A > B ⇒ 1
		*             A = B ⇒ 0
		*             A < B ⇒ -1
		*/
		private int CompHH24MI(String A,String B){
			String a1 = A;
			String a2 = B;
			if(null == A || "".equals(A)){
				a1 = "0";
			}
			if(null == B || "".equals(B)){
				a2 = "0";
			}
			return (new BigDecimal(a1)).compareTo(new BigDecimal(a2));
		}
		
		/**
		* 日付　＋　時刻
		* @param  date   日付(YYYY/MM/DD)
		* @param  time   時刻(HH24MI)
		* @return String 日付(YYYY/MM/DD HH24:MI)
		*/
		private String ConDateTime(String date,String time) throws BusinessProcessException ,FoundationException{
			try{
				if(null == date || "".equals(date)){
					return null;
				}
				String t = time;
				GetTimeCtrl();
				if(null == time || "".equals(time)){
					if((struct.getTIME_CTRL()).equals("true")){
						t = "2359";
					}else{
						t = "0000";
					}
				}else{
					t = t.replaceAll(":","");
				}
				return date + " " + AppendZero(t,4).substring(0,2) + ":" +AppendZero(t,4).substring(2);
			} catch (BusinessProcessException ex) {
				throw ex;
			} catch (FoundationException ex) {
				throw ex;
			} finally {
			}
		}
		//Add Anken Start 20140425 song-yy
		private void selectWH_CD() throws FoundationException, SQLException {
			// TODO Auto-generated method stub
			//[品目別入庫先保管区]から引数｢工場コード｣、｢品目番号｣を元に
			//所要量計算対象の保管区コードを取得する。
			List whcd1List = entity.mselectRCV_WH1.read(conn, struct);
			if(!whcd1List.isEmpty()){
				AC0120010Struct whcd1Struct = (AC0120010Struct)whcd1List.get(0);
				struct.setWH_CD(whcd1Struct.getWH_CD1());
			}else{
				//[保管区]から引数｢工場コード｣を元に所要量計算対象及び外作代表
				// の最小保管区コードを取得する。
				List whcd2List = entity.mselectRCV_WH2.read(conn, struct);
				if(!whcd2List.isEmpty()){
					AC0120010Struct whcd2Struct = (AC0120010Struct)whcd2List.get(0);
					struct.setWH_CD(whcd2Struct.getWH_CD2());
				}else{
					//[保管区]から引数｢工場コード｣を元に所要量計算対象の保管区コード を取得する。
					List whcd3List = entity.mselectRCV_WH3.read(conn, struct);
					if(whcd3List.isEmpty()){
						struct.setWH_CD(null);
					}else{
						AC0120010Struct whcd3Struct = (AC0120010Struct)whcd3List.get(0);
						struct.setWH_CD(whcd3Struct.getWH_CD3());
					}
				}
			}
		}
		//Add Anken End   20140425 song-yy
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>


          Element rootElement = null;
          Element topNodeElement = null;
          AC0120010Struct workStruct = null;
        //Add Anken Start 20140428 song-yy
          struct.seth_size(null);
          if(!tempList.isEmpty()){
        	  tempList = new ArrayList();
          }
        	  
        //Add Anken End   20140428 song-yy
          try {
              // キー以外の画面を初期化
              initializeDetail();
              // ツリー用XMLドキュメントを初期化
              flashTree = new XmlDocument();

              // ツリーのルートを検索
              struct.setPLANT_CD(this.sysPLANT_CD);
              List rootList = entity.mRoot.read(conn, struct);
              if (rootList.isEmpty()) {
                  setErrorMessage("ZZ06001");
                  setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
                  setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
                  setErrorParameter("T_OD", "PLANT_CD", this.sysPLANT_CD);
                  return;
              }

              AC0120010Struct rootStruct = (AC0120010Struct) rootList.get(0);
             
              
              
              //Mod Anken Start 20140417 song-yy
              // 製番状態区分が1/2/5/9の場合はエラーにする。
//              if (("1".equals(rootStruct.getJOB_ODR_STS_TYP()))
//                  || ("2".equals(rootStruct.getJOB_ODR_STS_TYP()))
//                  || ("5".equals(rootStruct.getJOB_ODR_STS_TYP()))
//                  || ("9".equals(rootStruct.getJOB_ODR_STS_TYP()))) {
//                  setErrorMessage("AC00010");
//                  setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
//                  setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
//                  setErrorParameter("T_OD", "JOB_ODR_STS_TYP", rootStruct.getJOB_ODR_STS_TYP());
//                  return;
//              }
              struct.setJOB_ODR_STS_TYP1(rootStruct.getJOB_ODR_STS_TYP());
              //[製番計画].“製番状態区分” が1：所要量計算未対象 or 2：所要量計算対象の場合
              if (("1".equals(rootStruct.getJOB_ODR_STS_TYP()))
                      || ("2".equals(rootStruct.getJOB_ODR_STS_TYP()))) {
                      setErrorMessage("AC00239");
                      setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
                      setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
                      setErrorParameter("T_OD", "JOB_ODR_STS_TYP", rootStruct.getJOB_ODR_STS_TYP());
                      return;
                  }
            //Mod Anken End   20140417 song-yy

              // ユーザが所属する工場コードと、[製番計画]の工場コードが
              // 一致しない場合はエラーにする。
              if (!this.sysPLANT_CD.equals(rootStruct.getPLANT_CD())) {
                  setErrorMessage("AC00011");
                  setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
                  setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
                  setErrorParameter("T_OD", "PLANT_CD", this.sysPLANT_CD);
                  return;
              }

              //製番計画の製番処理区分が2：変更の場合はワーニング
              if ("2".equals(rootStruct.getJOB_ODR_EXP_TYP())) {
                  setWarningMessage("AC00030");
                  setWarningParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
                  setWarningParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
              }

              
              // ドキュメントRootを作成、ツリー用XMLに追加
              rootElement = flashTree.createElement("root");
              flashTree.appendChild(rootElement);
              // ドキュメントRootに初期展開レベルを設定
              rootElement.setAttribute("init_level", struct.getInitLevel());
              // 最上位レベルノードを生成、ツリー用XMLに追加
              topNodeElement = flashTree.createElement("node");
              rootElement.appendChild(topNodeElement);
              // structから最上位レベルノードの各種属性データを設定
              struct.setOD_NO(rootStruct.getOD_NO());
              struct.setITEM_CD(rootStruct.getITEM_CD());

              struct.setITEM_NAME(rootStruct.getITEM_NAME());


              struct.setOD_TYP(rootStruct.getOD_TYP());
              struct.setODR_STS_TYP(rootStruct.getODR_STS_TYP());
              struct.setDM_STS_TYP(rootStruct.getDM_STS_TYP());
              struct.setMRP_ODR_TYP(rootStruct.getMRP_ODR_TYP());
              struct.setMRP_TYP(rootStruct.getMRP_TYP());
              struct.setOUTSIDE_TYP(rootStruct.getOUTSIDE_TYP());
              struct.setJOB_ODR_STS_TYP(rootStruct.getJOB_ODR_STS_TYP());
//            ▼▼ 2008/08/21 ADD START -TSUCHIDA▼▼
           			  struct.setMANHOUR_TYP(rootStruct.getMANHOUR_TYP());
//            ▲▲ 2008/08/21 ADD END -TSUCHIDA▲▲
              struct.setMODIFY_COUNT(rootStruct.getMODIFY_COUNT());
            //Add Anken Start 20140428 song-yy
              struct.setTOTAL_RCV_QTY(rootStruct.getTOTAL_RCV_QTY());
              struct.setTOTAL_ISSUE_QTY(rootStruct.getTOTAL_ISSUE_QTY());
            //Add Anken End   20140428 song-yy
              
              struct.setlabel(struct.getITEM_CD() + " " + null2blank(struct.getITEM_NAME()));

              setStruct2XML(topNodeElement, struct, 1, 1, 0);

              // 下位レベルノードを展開（再帰的にツリーを展開する）
              expandTree(
                  topNodeElement,
                  struct,
                  1,
                  2,
                  _maxRead,
                  2,
                  Integer.parseInt(struct.getInitLevel()) + 1,
                  true);

              // 読込状態（読込成功）を設定
              setReadStatus(NORMAL);
          } catch (MaxLineException me) {
              rootElement.removeChild(topNodeElement);
              Element stopNodeElement = flashTree.createElement("node");
              rootElement.appendChild(stopNodeElement);
              setStruct2XML(stopNodeElement, struct, 1, 1, 0);
              stopNodeElement.setAttribute("terminated", "true");
              ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_maxRead));
              stopNodeElement.setAttribute(
                  "terminate_comment",
                  emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
              msgStruct.addError(emsg);
              sysLog.warning(emsg, getsysUSER_CD());

              setReadStatus(TOO_MANY);
              return;
          } catch (SQLException e) {
              throw new ExpjException(e);
          }


                //}}user_implement_dev:<controlSelect>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * FlashTree初期化ボタン押下時に実行される処理です。
	 *
	 */
	public void controlFlashTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");
			//{{user_implement_dev:<controlFlashTree>
          // TODO: ユーザ定義のコードを記述してください
          /*
		try {
			flashTree = new XmlDocument();
			int startId = 0;
			list = entity.mFlashTree.read(conn, struct);
			// ドキュメントRoot作成
			Element root = flashTree.createElement("root");
			flashTree.appendChild(root);
			Element el = null;
			for(int i=0; i<list.size(); i++, startId++) {
				// エレメントを生成
				el = flashTree.createElement("node");
				root.appendChild(el);
				// エレメントに属性を設定
				setStruct2XML(el, (AC0120010Struct)list.get(i), startId);

				List lstChld = entity.mFlashTree.read(conn, struct);
				// 検索結果を子供エレメントとして追加
				startId = setXMLDoc(el, lstChld, ++startId);
			}
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
           */
                //}}user_implement_dev:<controlFlashTree>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlFlashTree");

		return;
	}

	/**
	 * 行追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlappend() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlappend");
			//{{user_implement_dev:<controlappend>
          // TODO: ユーザ定義のコードを記述してください
          try {
          	  // パラメータ読込
              GetTimeCtrl();
        	  // 所要量排他チェック
         	 AC0120010Struct checkStruct = new AC0120010Struct();
          	 String newCount = null;
          	 
          	 checkStruct.setSub1_PARENT_OD_NO(struct.getOD_NO());
          	 newCount = ((AC0120010Struct) entity.mcheckT_OD1.read(conn, checkStruct).get(0)).getOD_MODIFY_COUNT();
          	 
          	 if ( !struct.getMODIFY_COUNT().equals(newCount) ) {
          	 	setErrorMessage("AC00017");
          	 	setErrorParameter("T_OD","OD_NO",checkStruct.getSub1_PARENT_OD_NO());
          	 	setErrorParameter("T_OD","MODIFY_COUNT",newCount);
          	 	_nextUrl = "/AC0120010.jsp";
          	 	return;
          	 }

              //所要量計算制御チェック
              List odCalcCtrlList = entity.mselectSYS_OD_CALC_CTRL.read(conn, struct);

              AC0120010Struct odCalcCtrlListStruct = (AC0120010Struct) odCalcCtrlList.get(0);

              if (odCalcCtrlListStruct.getOD_CALC_FLG().equals("1")) {
                  setErrorMessage("AC00206");
                  setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", struct.getPLANT_CD());


                  //readStatus = ERROR;
                  _nextUrl = "/AC0120010.jsp";
                  return;
              }

              // 所要量計算制御（製番）チャック
              boolean odFlg = entity.mcheckSYS_JOB_OD_CALC_CTRL.check(conn, struct);
              if(odFlg) {
            	  // 所要量計算(製番)実行中のためメンテナンスできません。
            	  setErrorMessage("AC00236");
            	  setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD", struct.getJOB_ODR_CD());
            	  
            	  // メイン画面へ遷移
            	  _nextUrl = "/AC0120010.jsp";
            	  return;
              }
              
              //Add Anken Start 20140418 song-yy
              //[所要量].“オーダ状態区分＝2:確定の場合、親品目番号に対する実績のチェックを行う
              if("2".equals(struct.getODR_STS_TYP())){
            	  if(checkSub1ParentItem()== false){
            		  
            		// メイン画面へ遷移
                	  _nextUrl = "/AC0120010.jsp";
                	  return;
                  }
              }              
            //Add Anken End   20140418 song-yy
              
              // Structのサブ１画面編集領域部分の初期化
              initializeSub1Struct();

              // 選択されたノードを元に詳細情報を取得
              struct.setSub1_Parent_ITEM_CD(struct.getITEM_CD());
              struct.setSub1_Parent_ITEM_NAME(struct.getITEM_NAME());

              struct.seth_Sub1_Parent_ODR_START_DATE(struct.getODR_START_DATE());
              struct.seth_Sub1_Parent_ODR_QTY(struct.getODR_QTY());


              operationMode = INSERT;

          } catch(SQLException e) {
              //			e.printStackTrace();
              //			// エラー処理を記述してください。
          }
                //}}user_implement_dev:<controlappend>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlappend");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
          // TODO: ユーザ定義のコードを記述してください
          try {
          	  // パラメータ読込
              GetTimeCtrl();

          	  // 所要量排他チェック
          	 AC0120010Struct checkStruct = new AC0120010Struct();
          	 String newCount = null;
          	 
          	 checkStruct.setSub1_PARENT_OD_NO(struct.getOD_NO());
          	 newCount = ((AC0120010Struct) entity.mcheckT_OD1.read(conn, checkStruct).get(0)).getOD_MODIFY_COUNT();
          	 
          	 if ( !struct.getMODIFY_COUNT().equals(newCount) ) {
          	 	setErrorMessage("AC00017");
          	 	setErrorParameter("T_OD","OD_NO",checkStruct.getSub1_PARENT_OD_NO());
          	 	setErrorParameter("T_OD","MODIFY_COUNT",newCount);
          	 	_nextUrl = "/AC0120010.jsp";
          	 	return;
          	 }
          	 
              //所要量計算制御チェック
              List odCalcCtrlList = entity.mselectSYS_OD_CALC_CTRL.read(conn, struct);

              AC0120010Struct odCalcCtrlListStruct = (AC0120010Struct) odCalcCtrlList.get(0);

              if (odCalcCtrlListStruct.getOD_CALC_FLG().equals("1")) {
                  setErrorMessage("AC00206");
                  setErrorParameter("SYS_OD_CALC_CTRL", "PLANT_CD", struct.getPLANT_CD());
                  //readStatus = ERROR;
                  _nextUrl = "/AC0120010.jsp";
                  return;
              }
              

              // 所要量計算制御（製番）チャック
              boolean odFlg = entity.mcheckSYS_JOB_OD_CALC_CTRL.check(conn, struct);
              if(odFlg) {
            	  // 所要量計算(製番)実行中のためメンテナンスできません。
            	  setErrorMessage("AC00236");
            	  setErrorParameter("SYS_JOB_OD_CALC_CTRL", "JOB_ODR_CD", struct.getJOB_ODR_CD());
            	  
            	  // メイン画面へ遷移
            	  _nextUrl = "/AC0120010.jsp";
            	  return;
              }
              
              //Add Anken Start 20140417 song-yy
              //[所要量].“デマンド状態区分＝2:確定の場合、もしくは
              //[所要量].“オーダ状態区分＝2:確定の場合、品目番号に対する状態のチェックを行う
              if("2".equals(struct.getDM_STS_TYP())||"2".equals(struct.getODR_STS_TYP())){
                  if (checkParentItem(struct) == false) {
                	  
                	// メイン画面へ遷移
                      _nextUrl = "/AC0120010.jsp"; 
                      return;
                  }
              }
              //Add Anken End   20140417 song-yy
                        
              // Structのサブ１画面編集領域部分の初期化
              initializeSub1Struct();

              // 選択されたノードを元に詳細情報を取得
              struct.setSub1_PARENT_OD_NO(struct.getPARENT_OD_NO());

              //業務運用日付の取得
              struct.seth_BUSINESS_OPR_DATE(SystemInformation.getBusinessOprDate(sysPLANT_CD));

              //会社コードの取得
              struct.setCOMPANY_CD(SystemInformation.getSysMyCompanyCd());

              List headerList = entity.mSelectSub1Header.read(conn, struct);
              if (headerList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("T_OD", "OD_NO", struct.getSub1_PARENT_OD_NO());
                  readStatus = ERROR;
                  return;
              }
              AC0120010Struct headerStruct = (AC0120010Struct) headerList.get(0);

              // 画面情報を設定
              setStructSub1update(headerStruct);
              //Add Anken Start 20140429 song-yy
              struct.seth_ODR_STS_TYP(struct.getODR_STS_TYP()); 
              struct.seth_DM_STS_TYP(struct.getDM_STS_TYP());
            //Add Anken End   20140429 song-yy

              List formList = entity.mSelectSub1.read(conn, struct);
              if (formList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
                  readStatus = ERROR;
                  return;
              }

              AC0120010Struct formStruct = (AC0120010Struct) formList.get(0);

              setStructSub1(formStruct);

              operationMode = UPDATE;
				
              setReadStatus(NORMAL);

          } catch(SQLException e) {
              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(e, emsg);
              throw ee;
          }
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>


          initializeAll();


                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPeekerItemCd() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlPeekerItemCd");
			//{{user_implement_dev:<controlPeekerItemCd>
          // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlPeekerItemCd>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlPeekerItemCd");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
          // TODO: ユーザ定義のコードを記述してください
          try {
        	//Add Anken Start 20140428 song-yy
        	  PuchUnitCostStruct pucs;
        	//Add Anken End   20140428 song-yy
              int nRet = 0;
              String jobOdrCd = null;
              String jobOdrCancelNo = null;
              String initLevel = null;
              List subformList = entity.mSelectSub1Form.read(conn, struct);

              if (subformList.isEmpty()) {
                  setErrorMessage("AC00220");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                  readStatus = ERROR;
                  _nextUrl = "/AC0120011.jsp";
                  return;

              }

              AC0120010Struct subformStruct = (AC0120010Struct) subformList.get(0);
              CommonOd od =
                new CommonOd(conn,
                             this.sysPLANT_CD,
                             this.sysUSER_CD,
                             this.sp.getProcId());



//            ▼▼ 2008/08/21 ADD START -TSUCHIDA▼▼
           			  if(subformStruct.geth_Sub1_MANHOUR_TYP().equals("1")){
                             setErrorMessage("AC00238");
                             setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                             _nextUrl = "/AC0120011.jsp";
                             return;
                         }
//            ▲▲ 2008/08/21 ADD END -TSUCHIDA▲▲
              if (updateErrCheck(subformStruct, "INSERT") == false) {

                  _nextUrl = "/AC0120011.jsp";
                  return;
              
              }
            //Add Anken Start 20140418 song-yy
              // 親オーダデマンド番号退避
              String parentOdNo = struct.getSub1_PARENT_OD_NO();
              
              struct.setOD_NO(struct.getSub1_PARENT_OD_NO());  
              
              //親品目番号に対する実績のチェック
              if(checkSub1ParentItem() == false){
            	  _nextUrl = "/AC0120011.jsp";
                  return;
              }

              //所要量].“所要量内外作区分”＝2:外作の場合　かつ
              //[発注残].“発注状態区分”＝2：指示済み　の場合
              
              if("2".equals(struct.getOUTSIDE_TYP()) 
            		  && "2".equals(struct.getPUCH_ODR_STS_TYP())){
              	 //1)	支給区分の取得
             	  struct.setSysPLANT_CD(this.sysPLANT_CD);
             	  //支給区分 （有償、無償） の取得は [支給単価] の有無により行う
             	  List munitcstList = entity.mchkM_CONS_UNIT_COST.read(conn, struct);
             	  //該当データが存在しなかった場合、支給区分  ＝ ２：無償支給
             	  if(munitcstList.isEmpty()){
             		  struct.setCONS_TYP("2");
             	  }else{
             		  //[支給単価].“有償支給フラグ”  ＝ １：有償 の場合、支給区分  ＝ １：有償支給
             		  AC0120010Struct munitcstStruct = (AC0120010Struct) munitcstList.get(0);
             		  if("1".equals(munitcstStruct.getONEROUS_FLG())){
             			  struct.setCONS_TYP("1");
             		  }else{
             			  //[支給単価].“有償支給フラグ”  ＝ １：有償 以外の場合、支給区分 ＝ ２：無償支給
             			  struct.setCONS_TYP("2");
             		  }
             	  }
             	  //2)	出庫指示に設定する支給区分によって、出庫先保管区の取得
             	  
             	 List whcdinList = entity.mselectinWH_CD.read(conn, struct);
              	 // 1：有償支給の場合
             	  if("1".equals(struct.getCONS_TYP())){
             		  struct.setNAME( this.sysPLANT_CD + "_ONEROUS_CONS_INV_TYP");
             		  List sysparaList = entity.mSYS_PARAMETER.read(conn, struct);
             		  //[パラメータ].”設定値”を取得できない場合
             		  if(sysparaList.isEmpty()){
             			  setErrorMessage("KU10002");
                           setErrorParameter("SYS_PARAMETER", "NAME", struct.getNAME());
                           _nextUrl = "/AC0120011.jsp";
                           return;
             		  }else{             			  
             			  AC0120010Struct sysparaStruct = (AC0120010Struct) sysparaList.get(0);
             			 // 償支給品在庫管理区分 と一致する[パラメータ].”設定値”が“true”のとき
             			  if("true".equals(sysparaStruct.getVALUE())){
                         	  if(whcdinList.isEmpty()){
                         		  setErrorMessage("AC00253");
                         		  setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getSub1_PUCH_ODR_CD());
                         		  setErrorParameter("T_RLSD_PUCH_ODR", "COMPANY_CD", struct.getSub1_COMPANY_CD());
                         		  setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getSub1_VEND_CD());
                         		  _nextUrl = "/AC0120011.jsp";
                                   return;
                         	  }else{
                         		 AC0120010Struct whcdinStruct = (AC0120010Struct) whcdinList.get(0);
                         		 struct.setWH_CD(whcdinStruct.getWH_CD()); 
                         	  }
             				 
             			  }else{
             				//償支給品在庫管理区分 と一致する[パラメータ].”設定値”が“false”のとき、Nullを設定する
             				  struct.setWH_CD(null);
             			  }              			                			 
             		  }
             	  }
             	  //2：無償支給の場合
             	  if("2".equals(struct.getCONS_TYP())){
                	  if(whcdinList.isEmpty()){
                 		  setErrorMessage("AC00253");
                 		  setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_CD", struct.getSub1_PUCH_ODR_CD());
                 		  setErrorParameter("T_RLSD_PUCH_ODR", "COMPANY_CD", struct.getSub1_COMPANY_CD());
                 		  setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getSub1_VEND_CD());
                 		  _nextUrl = "/AC0120011.jsp";
                           return;
                 	  }else{
                 		 AC0120010Struct whcdinStruct = (AC0120010Struct) whcdinList.get(0);
                 		 struct.setWH_CD(whcdinStruct.getWH_CD()); 
                 	  }
             	  }
              }
           
            //Add Anken End   20140418 song-yy
              

              // 要求数の算出・設定
              struct.setSub1_DM_QTY(Double.toString(od.changeQtyUp(
                  Double.parseDouble(struct.getSub1_DM_QTY())
                  , Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP()))));


              // 製造納期の算出・設定
              if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {

                  struct.setSub1_PRD_DUE_DATE(null);
              }

              // 製造着手日の算出・設定
              if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {

                  struct.setSub1_PRD_START_DATE(null);
              }

              // 手配着手日の算出・設定
              if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {

                  struct.setSub1_ODR_START_DATE(null);
              }

              
            //Add Anken Start 20140421 song-yy
            //親のオーダデマンド番号の[所要量].“オーダ状態区分”＝1:計画の場合
              
              if("1".equals(struct.geth_Sub1_ODR_STS_TYP())){
            	//Add Anken End   20140421 song-yy
                  // オーダデマンド番号の採番
	                  Numbering number =
	                    new Numbering(conn,
	                                  Numbering.ODNO,
	                                  getsysUSER_CD(),
	                                  this.sp.getProcId(),
	                                  getsysPLANT_CD());
	                  String no = number.getNo();
	                  if (no == null || no.length() == 0) {
	
	                      //採番失敗
	                      setErrorMessage("ZZ01106");
	                      return;
	                  }
	
	                  //所要量レベル番号設定（所要量）
	                  String odLevelNo = struct.geth_Sub1_Parent_OD_LEVEL_NO();
	                  odLevelNo = Calculate.add(odLevelNo, "1");
	
	                  struct.setOD_NO(no);																			// 01.オーダデマンド番号
	                  struct.setALC_GRP_CD(struct.geth_Sub1_Parent_ALC_GRP_CD());										// 02.引当グループコード
	                  struct.setPLANT_CD(sysPLANT_CD);																// 03.工場コード
	                  struct.setJOB_ODR_DETAIL_NO("0");																// 06.製番枝番
	
	                  if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {
	
	                      struct.setODR_STS_TYP("0");																	// 07.オーダ状態区分
	                  } else {
	                      struct.setODR_STS_TYP("1");
	
	                  }
	
	                  if ("8".equals(struct.geth_Sub1_MRP_ODR_TYP())) {
	                      struct.setOD_TYP("4");																		// 08.オーダデマンド区分
	                  } else {
	                      if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {
	                          struct.setOD_TYP("3");
	                      } else {
	
	                          struct.setOD_TYP("1");
	                      }
	                  }
	                  // 手配数の算出・設定
	                  if ("1".equals(struct.geth_Sub1_MRP_ODR_TYP())
	                      || "2".equals(struct.geth_Sub1_MRP_ODR_TYP())) {

	                      struct.setSub1_ODR_QTY(Double.toString(od.changeQtyUp(Double.parseDouble(struct.getSub1_ODR_QTY())
	                                                                            , Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP()))));

	                  } else if ("4".equals(struct.geth_Sub1_MRP_ODR_TYP())
	                             || "5".equals(struct.geth_Sub1_MRP_ODR_TYP())
	                             || "6".equals(struct.geth_Sub1_MRP_ODR_TYP())
	                             || "7".equals(struct.geth_Sub1_MRP_ODR_TYP())) {

	                      struct.setSub1_ODR_QTY("0");
	                  } else if ("8".equals(struct.geth_Sub1_MRP_ODR_TYP())) {
	                      struct.setSub1_ODR_QTY(Double.toString(od.changeQtyUp(Double.parseDouble(struct.getSub1_DM_QTY())
	                                                                            , Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP()))));

	                  }
	
	                  if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {
	
	                      struct.setSub1_PRD_DUE_DATE(struct.getSub1_DUE_DATE());//製造納期							                     // 10.製造納期
	                      struct.setSub1_PRD_START_DATE(null);//製造着手日											                     // 11.製造着手日
	                      struct.setSub1_ODR_START_DATE(null);//手配着手日											                     // 12.手配着手日
	
	                  }
	
	                  struct.setSub1_MRP_ODR_TYP(struct.geth_Sub1_MRP_ODR_TYP());										                 // 15.品目手配区分
	                  struct.setISSUE_TYP(struct.geth_Sub1_ISSUE_TYP());												                 // 17.所要量出庫区分
	                  struct.setODR_LT(subformStruct.getODR_LT());																		 // 18.手配リードタイム
	                  struct.setFIXED_LT(subformStruct.getFIXED_LT());																	 // 19.固定分リードタイム
	                  struct.setPROP_LT(subformStruct.getPROP_LT());																	 // 20.比例分リードタイム
	                  struct.setSAFETY_LT(subformStruct.getSAFETY_LT());																 // 21.安全日数
	                  struct.setISSUE_LT(subformStruct.getISSUE_LT());																	 // 22.払出リードタイム
	                  struct.setPROP_LOT_SIZE(subformStruct.getPROP_LOT_SIZE());														 // 23.比例分ロットサイズ
	                  struct.setSub1_PS_UNIT_QTY(Calculate.divide(struct.getSub1_PS_UNIT_NUMERATOR(),
	                                                              struct.getSub1_PS_UNIT_DENOMINATOR(), 8, Calculate.CEIL));															// 24.製品構成単位数
	
	
	                  struct.setOD_LEVEL_NO(odLevelNo);																                     // 27.所要量レベル番号
	
	                  struct.setPARENT_OD_NO(parentOdNo);																                 // 28.親オーダデマンド番号
	//                  struct.setSub1_PARENT_OD_NO(parentOdNo);																                 // 28.親オーダデマンド番号
	
	                  
	                  //[品目]から取得できる場合は、[品目]よりカレンダ番号を取得
	                  //それ以外は[工場]からカレンダ番号を取得し、[カレンダ明細]から該当カレンダ番号の最小日付と最大日付を取得し
	                  //所要量有効開始日、終了日とする
	                  if (subformStruct.getCAL_NO() == null || subformStruct.getCAL_NO().equals("")) {                                  //所要量有効開始日、終了日
	                      struct.setPLANT_CD(sysPLANT_CD);
	                      List selectMPlantList = entity.mselectM_PLANT.read(conn, struct);
	                      AC0120010Struct selectPlantStruct = (AC0120010Struct) selectMPlantList.get(0);
	                      List selectMCalList = entity.mselectM_CAL.read(conn, selectPlantStruct);
	                      AC0120010Struct selectMCalStruct = (AC0120010Struct) selectMCalList.get(0);
	                      struct.setEFF_PHASE_IN_DATE(selectMCalStruct.getMIN_CAL_DATE());
	                      struct.setEFF_PHASE_OUT_DATE(selectMCalStruct.getMAX_CAL_DATE());
	                  } else {
	                      struct.setCAL_NO(subformStruct.getCAL_NO());
	                      List selectMCalList = entity.mselectM_CAL.read(conn, struct);
	                      AC0120010Struct selectMCalStruct = (AC0120010Struct) selectMCalList.get(0);
	                      struct.setEFF_PHASE_IN_DATE(selectMCalStruct.getMIN_CAL_DATE());
	                      struct.setEFF_PHASE_OUT_DATE(selectMCalStruct.getMAX_CAL_DATE());
	                  }
	                  struct.setL_Sub1_DUE_DATE(ConDateTime(struct.getSub1_DUE_DATE(),struct.getSub1_DUE_TIME()));
	                  // 製造納期
	                  struct.setL_Sub1_PRD_DUE_DATE(ConDateTime(struct.getSub1_PRD_DUE_DATE(),struct.getSub1_PRD_DUE_TIME()));
	                  // 製造着手日
	                  struct.setL_Sub1_PRD_START_DATE(ConDateTime(struct.getSub1_PRD_START_DATE(),struct.getSub1_PRD_START_TIME()));
	                  // 手配着手日
	                  struct.setL_Sub1_ODR_START_DATE(ConDateTime(struct.getSub1_ODR_START_DATE(),struct.getSub1_ODR_START_TIME()));
	                  entity.mInsertT_OD.create(conn, struct);

                  // 所要量再展開依頼、所要量計算制御の更新を行う。
                  od.changeCommon(no);

              }
              
            //Add Anken Start 20140421 song-yy
              //親のオーダデマンド番号の[所要量].“オーダ状態区分”＝2:確定の場合 
              if("2".equals(struct.geth_Sub1_ODR_STS_TYP())){
            	  
                  // オーダデマンド番号の採番
                  Numbering number =
                    new Numbering(conn,
                                  Numbering.ODNO,
                                  getsysUSER_CD(),
                                  this.sp.getProcId(),
                                  getsysPLANT_CD());
                  String no = number.getNo();
                  if (no == null || no.length() == 0) {

                      //採番失敗
                      setErrorMessage("ZZ01106");
                      return;
                  }

                  //所要量レベル番号設定（所要量）
                  String odLevelNo = struct.geth_Sub1_Parent_OD_LEVEL_NO();
                  odLevelNo = Calculate.add(odLevelNo, "1");

                  struct.setOD_NO(no);											// 01.オーダデマンド番号
                  struct.setALC_GRP_CD(struct.geth_Sub1_Parent_ALC_GRP_CD());	// 02.引当グループコード
                  struct.setPLANT_CD(sysPLANT_CD);								// 03.工場コード
                  struct.setJOB_ODR_DETAIL_NO("0");								// 06.製番枝番

                  if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {

                      struct.setODR_STS_TYP("0");								// 07.オーダ状態区分
                  } else {
                	  //オーダ数が0以外のとき 　2:確定
                      struct.setODR_STS_TYP("2");

                  }
                  
                  //オーダ数が0のとき　　　　　3：デマンド
                  if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {
                      struct.setOD_TYP("3");
                  } else {
                	  //オーダ数が0以外のとき 　1：オーダデマンド
                      struct.setOD_TYP("1");
                  }
                  // 手配数の算出・設定
                  //「品目手配区分」＝1：製番または2：在庫引当型製番のとき、「手配数」
                  if ("1".equals(struct.geth_Sub1_MRP_ODR_TYP())
                      || "2".equals(struct.geth_Sub1_MRP_ODR_TYP())) {

                      struct.setSub1_ODR_QTY(Double.toString(od.changeQtyUp(Double.parseDouble(struct.getSub1_ODR_QTY())
                                                                            , Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP()))));  

                  } else if ("4".equals(struct.geth_Sub1_MRP_ODR_TYP())
                             || "5".equals(struct.geth_Sub1_MRP_ODR_TYP())
                             || "6".equals(struct.geth_Sub1_MRP_ODR_TYP())
                             || "7".equals(struct.geth_Sub1_MRP_ODR_TYP())) {
                      // 「品目手配区分」＝4:マニュアル手配品目または5:ロット手配品目または
                	  //6:定量手配品目または7:発注点手配品目のとき、0
                      struct.setSub1_ODR_QTY("0");
                  } 
                  
                  if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {

                      struct.setSub1_PRD_DUE_DATE(struct.getSub1_DUE_DATE());//製造納期			// 10.製造納期
                      struct.setSub1_PRD_START_DATE(null);//製造着手日							// 11.製造着手日
                      struct.setSub1_ODR_START_DATE(null);//手配着手日						    // 12.手配着手日

                  }

                  struct.setSub1_MRP_ODR_TYP(struct.geth_Sub1_MRP_ODR_TYP());										// 15.品目手配区分
                  struct.setISSUE_TYP(struct.geth_Sub1_ISSUE_TYP());												// 17.所要量出庫区分
                  struct.setODR_LT(subformStruct.getODR_LT());														// 18.手配リードタイム
                  struct.setFIXED_LT(subformStruct.getFIXED_LT());													// 19.固定分リードタイム
                  struct.setPROP_LT(subformStruct.getPROP_LT());													// 20.比例分リードタイム
                  struct.setSAFETY_LT(subformStruct.getSAFETY_LT());												// 21.安全日数
                  struct.setISSUE_LT(subformStruct.getISSUE_LT());													// 22.払出リードタイム
                  struct.setPROP_LOT_SIZE(subformStruct.getPROP_LOT_SIZE());										// 23.比例分ロットサイズ
                  struct.setSub1_PS_UNIT_QTY(Calculate.divide(struct.getSub1_PS_UNIT_NUMERATOR(),
                  struct.getSub1_PS_UNIT_DENOMINATOR(), 8, Calculate.CEIL));										// 24.製品構成単位数


                  struct.setOD_LEVEL_NO(odLevelNo);																                     // 27.所要量レベル番号

                  struct.setPARENT_OD_NO(parentOdNo);																                 // 28.親オーダデマンド番号															         // 28.親オーダデマンド番号

                  
                  //[品目]から取得できる場合は、[品目]よりカレンダ番号を取得
                  //それ以外は[工場]からカレンダ番号を取得し、[カレンダ明細]から該当カレンダ番号の最小日付と最大日付を取得し
                  //所要量有効開始日、終了日とする
                  if (subformStruct.getCAL_NO() == null || subformStruct.getCAL_NO().equals("")) {                                  //所要量有効開始日、終了日
                      struct.setPLANT_CD(sysPLANT_CD);
                      List selectMPlantList = entity.mselectM_PLANT.read(conn, struct);
                      AC0120010Struct selectPlantStruct = (AC0120010Struct) selectMPlantList.get(0);
                      List selectMCalList = entity.mselectM_CAL.read(conn, selectPlantStruct);
                      AC0120010Struct selectMCalStruct = (AC0120010Struct) selectMCalList.get(0);
                      struct.setEFF_PHASE_IN_DATE(selectMCalStruct.getMIN_CAL_DATE());
                      struct.setEFF_PHASE_OUT_DATE(selectMCalStruct.getMAX_CAL_DATE());
                  } else {
                      struct.setCAL_NO(subformStruct.getCAL_NO());
                      List selectMCalList = entity.mselectM_CAL.read(conn, struct);
                      AC0120010Struct selectMCalStruct = (AC0120010Struct) selectMCalList.get(0);
                      struct.setEFF_PHASE_IN_DATE(selectMCalStruct.getMIN_CAL_DATE());
                      struct.setEFF_PHASE_OUT_DATE(selectMCalStruct.getMAX_CAL_DATE());
                  }
                  struct.setL_Sub1_DUE_DATE(ConDateTime(struct.getSub1_DUE_DATE(),struct.getSub1_DUE_TIME()));
                  // 製造納期
                  struct.setL_Sub1_PRD_DUE_DATE(ConDateTime(struct.getSub1_PRD_DUE_DATE(),struct.getSub1_PRD_DUE_TIME()));
                  // 製造着手日
                  struct.setL_Sub1_PRD_START_DATE(ConDateTime(struct.getSub1_PRD_START_DATE(),struct.getSub1_PRD_START_TIME()));
                  // 手配着手日
                  struct.setL_Sub1_ODR_START_DATE(ConDateTime(struct.getSub1_ODR_START_DATE(),struct.getSub1_ODR_START_TIME()));
                  entity.mInsertT_OD1.create(conn, struct);
                  
                 //	親品目番号の、[所要量].“所要量内外作区分”＝1:内作の場合　かつ
                 //[品目別仕掛].“品目別作業状態区分”＝2：指示済み　の場合
                  if("1".equals(struct.getOUTSIDE_TYP()) && "2".equals(struct.getWORK_STS_TYP())){
                	   
                	  //作業系列別仕掛
            			List workbyproList = entity.mCHK_T_WORK_IN_PROC_BY_PROC.read(conn, struct);          			
            			//[作業系列別仕掛]が存在した場合、
            			if(!workbyproList.isEmpty()){
            				AC0120010Struct workbyproStruct = (AC0120010Struct) workbyproList.get(0);
            				
            				//[作業系列別仕掛].“作業系列別作業状態区分”　＝ 2:指示済　の場合、出庫指示を追加する
            				if("2".equals(workbyproStruct.getWORK_STS_TYP())){
                				//出庫指示番号
                				CollectNumber ISS_INST_CD = 
                						new CollectNumber(
                						CollectNumber.ISS_INST_CD,
                						this.sysUSER_CD,
                						this.sp.getProcId(),
                						this.sysPLANT_CD);
                				String issueInstCd = ISS_INST_CD.getNo();
                      			if (issueInstCd == null || "".equals(issueInstCd)) {
                      				//採番失敗
                      				setErrorMessage("ZZ01106");
                      				return;
                      			} else {
                      				this.struct.setISSUE_INST_CD(issueInstCd);
                      			}
                				
                				//[品目別仕掛].“品目別作業実績区分” = 2: 作業指示実績 の場合
                				if("2".equals(struct.getOPR_RSLT_TYP())){
              					
                					//[作業系列別仕掛].“仕掛内外作区分” = 1：内作の場合、
                					if("1".equals(workbyproStruct.getOUTSIDE_TYP())){
                						struct.setSub1_PUCH_ODR_CD(null);  // 発注番号= Null
                						struct.setSub1_COMPANY_CD(null);   //会社コード = Null
                						struct.setSub1_VEND_CD(null);      //取引先コード = Null
                						//作業区コード=[作業系列別仕掛].“作業区コード”
                						struct.setWS_CD(workbyproStruct.getWS_CD());             					               						
                					}
                					//[作業系列別仕掛].“仕掛内外作区分” = 2：外作の場合、
                					if("2".equals(workbyproStruct.getOUTSIDE_TYP())){
                						List puchnoList = entity.mselectPUCH_ODR_CD.read(conn, workbyproStruct);
                						if(!puchnoList.isEmpty()){
                							AC0120010Struct puchnoStruct = (AC0120010Struct) puchnoList.get(0);
                							//発注番号 =[発注残].“発注番号”
                							struct.setSub1_PUCH_ODR_CD(puchnoStruct.getSub1_PUCH_ODR_CD());         							
                						}
                						//会社コード = [作業系列別仕掛].“会社コード”
            							struct.setSub1_COMPANY_CD(workbyproStruct.getCOMPANY_CD());
            							//取引先コード = [作業系列別仕掛].“取引先コード”
            							struct.setSub1_VEND_CD(workbyproStruct.getVEND_CD());
            							struct.setWS_CD(null); //作業区コード= null
            							struct.setWH_CD(null); // 出庫先保管区コード =null
                					}
                					//[作業系列別仕掛].“仕掛作業コード”
                					struct.setSub1_WORK_IN_PROC_CD(workbyproStruct.getWORK_IN_PROC_CD());
                					
                				}
                				
                				//出庫先保管区コードの設定       					
            					struct.setWORK_ODR_CD(workbyproStruct.getWORK_ODR_CD()); 
            					struct.setWORK_IN_PROC_CD(workbyproStruct.getWORK_IN_PROC_CD()); 
            					
            					List whcdList = entity.mselectWH_CD.read(conn, struct);
            					if(!whcdList.isEmpty()){
            						AC0120010Struct whcdStruct = (AC0120010Struct) whcdList.get(0);
            						//[作業系列別仕掛].“作業区コード” → [作業区].“保管区コード”
            						struct.setWH_CD(whcdStruct.getWH_CD());
            					}else{
            						struct.setWH_CD(null);
            					}
                				
            					//出庫指示]の追加内容
            					entity.mInsertT_ISSUE_INST.create(conn, struct);
            				}
            			
            			}    			 
                  } 
                  //④	親品目番号の、[所要量].“所要量内外作区分”＝2:外作の場合　かつ
                  //[発注残].“発注状態区分”＝2：指示済み　の場合
                  if("2".equals(struct.getOUTSIDE_TYP()) && "2".equals(struct.getPUCH_ODR_STS_TYP())){
                	  //[出庫指示]の追加内容  
      				//出庫指示番号採番
      				 CollectNumber ISS_INST_CD = 
      						new CollectNumber(
      						CollectNumber.ISS_INST_CD,
      						this.sysUSER_CD,
      						this.sp.getProcId(),
      						this.sysPLANT_CD);
      				 String issueInstCd = ISS_INST_CD.getNo();
          			if (issueInstCd == null || "".equals(issueInstCd)) {
          				//採番失敗
          				setErrorMessage("ZZ01106");
          				return;
          			} else {
          				this.struct.setISSUE_INST_CD(issueInstCd);
          			}
                	  entity.mmInsertT_ISSUE_INST1.create(conn, struct);
                  }
                  //⑤	「内外作区分」＝1：内作の場合、かつ [手配数]ががZero以外の場合、品目別仕掛を追加する。
                  if("1".equals(struct.getSub1_OUTSIDE_TYP()) &&
                		  Calculate.compare(struct.getSub1_ODR_QTY(), "0") > 0){
                	  
          			//作業計画番号の採番
          			CollectNumber ODR_CD = 
          					new CollectNumber(CollectNumber.ODR_CD,
          						this.sysUSER_CD, 
          						this.sp.getProcId(),
          						this.sysPLANT_CD);
          			String strOdrCd = ODR_CD.getNo();
          			if (strOdrCd == null || "".equals(strOdrCd)) {
          				//採番失敗
          				setErrorMessage("ZZ01106");
          				return;
          			} else {
          				this.struct.setWORK_ODR_CD(strOdrCd);
          			}
          			//[所要量].“オーダデマンド番号”
          			struct.setOD_NO(no);
          			
          			 List checkSubOdRead2List = entity.mcheckSubOdRead2.read(conn, struct);
                     if (checkSubOdRead2List.isEmpty()) {

                         setErrorMessage("AC00220");
                         setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                         readStatus = ERROR;
                         return;
                     }

                     AC0120010Struct checkSubOdRead2Struct = (AC0120010Struct) checkSubOdRead2List.get(0);
                     //作業実績区分 = [品目 ]. “作業実績区分” 作業実績区分
                     struct.setOPR_RSLT_TYP(checkSubOdRead2Struct.getOPR_RSLT_TYP());
                     //[品目別仕掛 ]の追加内容 
                     entity.minsertT_WORK_IN_PROC_BY_ITEM.create(conn, struct);
                  }
                  
                  //「内外作区分」＝ ２：外作 の場合、かつ//[手配数 ]が Zero以外の場合 
                  //発注残 を追加する。
                  if("2".equals(struct.getSub1_OUTSIDE_TYP())
                		  &&  Calculate.compare(struct.getSub1_ODR_QTY(), "0") > 0){   
                	  
                      // 発注番号を自動採番
                      Numbering puchCdNumbering =
                       new Numbering(
                        conn,
                        Numbering.PUCH_CD,
                        sysUSER_CD,
                        sp.getProcId(),
                        struct.getPLANT_CD());
                      struct.setPUCH_ODR_CD(puchCdNumbering.getNo());
                      
                      //品目場所の受入場所既定値
                      selectWH_CD();
                      //会社コード = [自社].“会社コード”
                      struct.setMY_COMPANY(_myCompanyStruct.getCOMPANY_CD());
                      
                	  List mitemList = entity.mselectM_ITEM.read(conn, struct);
                	  if(!mitemList.isEmpty()){
                		  AC0120010Struct mitemStruct  = (AC0120010Struct)mitemList.get(0);
                    	  //受給品区分             
                    	  struct.setSPL_ITEM_TYP(mitemStruct.getSPL_ITEM_TYP());
                    	  //発注時受入検査区分  
                    	  struct.setACPT_INSPC_TYP(mitemStruct.getACPT_INSPC_TYP());                     	  
                	  }

                      //代表取引先コードの取得
                      List pvendList = entity.mselectPVEND_CD.read(conn, struct);
                      //取得できていない場合は、Null
                      if(pvendList.isEmpty()){
                    	  struct.setPVEND_CD(null);
                    	  //発注担当者
                    	  struct.setPUCH_ODR_PERSON(null);
                    	  //単価区分 = 1：仮単価
                    	  struct.setUNIT_COST_TYP("1");
                    	  //単価 
                          struct.setUNIT_COST("0");
                          //加工費
                          struct.setPROCESSING_COST("0");
                          //材料費
                          struct.setMATERIAL_COST("0");
                          //その他経費
                          struct.setOTHER_OVERHEADS("0");
                          //発注金額
                          struct.setPUCH_ODR_AMOUNT("0");
                          //為替レート
                          struct.setEXCH_RATE("0");
                          //税率1
                          struct.setTAX_RATE_1("0");
                          //税率2
                          struct.setTAX_RATE_2("0");
                          //税率3
                          struct.setTAX_RATE_3("0");
                          //本体金額
                          struct.setNET_AMOUNT("0");
                          struct.setTAX_AMOUNT_1("0");
                          struct.setTAX_AMOUNT_2("0");
                          struct.setTAX_AMOUNT_3("0");
                          struct.setAMOUNT_INCLUDE_TAX("0");
                          struct.setTAX_ROUND_TYP("1");
                          struct.setHOME_CUR_AMOUNT("0"); //邦貨金額
                    	  
                      }else{
                    	  AC0120010Struct pvendStruct  = (AC0120010Struct)pvendList.get(0);
                    	  struct.setPVEND_CD(pvendStruct.getPVEND_CD());
                    	  //発注担当者
                    	  List ownpersonList = entity.mselOWN_PERSON_NAME.read(conn, struct);
                    	  if(ownpersonList.isEmpty()){
                    		  struct.setPUCH_ODR_PERSON(null);
                    	  }else{
                    		  AC0120010Struct ownpersonStruct  = (AC0120010Struct)ownpersonList.get(0);
                    		  struct.setPUCH_ODR_PERSON(ownpersonStruct.getOWN_PERSON_NAME());
                    	  }
                    	  
                    	  // 取引先、購入単価、通貨、消費税を取得
                    	  try { 
                    		  pucs =
                              PuchUnitCostControl.getData(
                                      conn,
                                      _myCompanyStruct.getCOMPANY_CD(),
                                      struct.getPVEND_CD(),
                                      struct.getPLANT_CD(),
                                      struct.getSub1_Comp_ITEM_CD(),
                                      struct.getSub1_PRD_START_DATE(),
                                      struct.getSub1_PRD_DUE_DATE(),
                                      struct.getSub1_ODR_QTY());  
                              
                              struct.setTAX_CD(pucs.getTAX_CD());   
                              
                              struct.setUNIT_COST_TYP(pucs.getUNIT_COST_TYP());
                              struct.setUNIT_COST(pucs.getUNIT_COST());
                              struct.setPROCESSING_COST(pucs.getPROCESSING_COST());
                              struct.setMATERIAL_COST(pucs.getMATERIAL_COST());
                              struct.setOTHER_OVERHEADS(pucs.getOTHER_OVERHEADS());
                              struct.setPUCH_ODR_AMOUNT(pucs.getPUCH_ODR_AMOUNT());
                              struct.setTAX_RATE_1(pucs.getTAX_RATE_1());
                              struct.setTAX_RATE_2(pucs.getTAX_RATE_2());
                              struct.setTAX_RATE_3(pucs.getTAX_RATE_3());
                              struct.setNET_AMOUNT(pucs.getNET_AMOUNT());
                              struct.setTAX_AMOUNT_1(pucs.getTAX_AMOUNT_1());
                              struct.setTAX_AMOUNT_2(pucs.getTAX_AMOUNT_2());
                              struct.setTAX_AMOUNT_3(pucs.getTAX_AMOUNT_3());
                              struct.setAMOUNT_INCLUDE_TAX(pucs.getAMOUNT_INCLUDE_TAX());
                              struct.setTAX_ROUND_TYP(pucs.getTAX_ROUND_TYP());
                              struct.setVEND_DECIMAL_FIG(pucs.getDECIMAL_FIG());
                              

                              //内税の場合に税額を計算する
                      		String lowerTaxCd =
                      			struct.getTAX_CD().substring(struct.getTAX_CD().length() - 1);
                     		if (!lowerTaxCd.equals("1")) {
                     			//バッチパラメータ呼出
                     			List batList = entity.mSYS_BAT_PARM.read(conn, struct);
                     			if(!batList.isEmpty()){
                     				//税計算部品をコール
                     				AC0120010Struct batStruct = (AC0120010Struct)batList.get(0);
                     				struct.setPVC2LOGMODE(batStruct.getPVC2LOGMODE());
                     				struct.setPVC2OUTPUTMODE(batStruct.getPVC2OUTPUTMODE());
                     				struct.setPVC2OUTPUTPATH(batStruct.getPVC2OUTPUTPATH());
                     				struct.setPVC2OUTPUTNAME(batStruct.getPVC2OUTPUTNAME());
                     				struct.setPVC2USERID(this.sysUSER_CD);
                     				struct.setPVC2BUSINESSNAME(batStruct.getPVC2BUSINESSNAME());
                     				struct.setPVC2PLANTCD(this.sysPLANT_CD);
                     				struct.setPVC2TAXID("5");
                     				batList = entity.mcallSQLCALCTAXCALCAMTFD.call(conn, struct);
                     				batStruct = (AC0120010Struct)batList.get(0);
                     				if(!"1".equals(batStruct.getPNUMSTATUS())){
                     					setErrorMessage(batStruct.getPVC2ERRCD());
                     					return;      				       				
                     				}
                     				struct.setTAX_AMOUNT_1(batStruct.getTAX_AMOUNT_1());
                     				struct.setTAX_AMOUNT_2(batStruct.getTAX_AMOUNT_2());
                     				struct.setTAX_AMOUNT_3(batStruct.getTAX_AMOUNT_3());
                     				struct.setAMOUNT_INCLUDE_TAX(batStruct.getAMOUNT_INCLUDE_TAX());   				
                     			}else{
                     				setErrorMessage("ZZ09007");        				
                     			}
                          	  }
              
                             } catch (DataNotFoundException e) {
                              setErrorMessage("AE00060", e.getMessage());
                              setErrorParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getVEND_CD());
                              setErrorParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                              setErrorParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
                              setErrorParameter(
                               "T_RLSD_PUCH_ODR",
                               "PUCH_ODR_START_DATE",
                               struct.getL_Sub1_PRD_START_DATE());
                              setErrorParameter(
                               "T_RLSD_PUCH_ODR",
                               "PUCH_ODR_DLV_DATE",
                               struct.getL_Sub1_PRD_DUE_DATE());
                              setErrorParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getSub1_ODR_QTY());
                              return;
                             } catch (Exception e) {
                              throw new ExpjException(e);
                             }
                           
                             // 為替レートが存在しない場合はワーニング扱いとするため別に取得
                             try {
                              ExchRateStruct ers =
                               ExchRateControl.getData(
                                conn,
                                _myCompanyStruct.getCOMPANY_CD(),
                                pucs.getCUR_CD(),
                                pucs.getEXCH_TYP(),
                                null,
                                struct.getL_Sub1_PRD_DUE_DATE());
                              // ｢為替レート｣を設定
                              struct.setEXCH_RATE(ers.getEXCH_RATE());
                              // ｢邦貨金額｣の計算
                              String homeCurAmount =
                               AmountCalculator.calcHomeCurAmount(
                                pucs.getAMOUNT_INCLUDE_TAX(),
                                ers.getEXCH_RATE(),
                                pucs.getROUND_TYP(),
                                _homeCurStruct.getDECIMAL_FIG());
                           
                              struct.setHOME_CUR_AMOUNT(homeCurAmount);
                           
                             } catch (DataNotFoundException e) {
                              struct.setHOME_CUR_AMOUNT("0");
                              struct.setEXCH_RATE("0");
                              setWarningMessage("AE00061");
                              setWarningParameter("T_RLSD_PUCH_ODR", "VEND_CD", struct.getPVEND_CD());
                              setWarningParameter("T_RLSD_PUCH_ODR", "PLANT_CD", struct.getPLANT_CD());
                              setWarningParameter("T_RLSD_PUCH_ODR", "ITEM_CD", struct.getITEM_CD());
                              setWarningParameter(
                               "T_RLSD_PUCH_ODR",
                               "PUCH_ODR_START_DATE",
                               struct.getL_Sub1_PRD_START_DATE());
                              setWarningParameter(
                               "T_RLSD_PUCH_ODR",
                               "PUCH_ODR_DLV_DATE",
                               struct.getL_Sub1_PRD_DUE_DATE());
                              setWarningParameter("T_RLSD_PUCH_ODR", "PUCH_ODR_QTY", struct.getSub1_ODR_QTY());
                             } catch (SQLException e) {
                              throw new ExpjException(e);
                             }
                      }
                      //[発注残]の追加
                      entity.minsertT_RLSD_PUCH_ODR.create(conn, struct);                    
                  }

              }
              conn.commit();

              jobOdrCd = struct.getJOB_ODR_CD();
              jobOdrCancelNo = struct.getJOB_ODR_CANCEL_NO();
              initLevel = struct.getInitLevel();
              struct.clear();

              struct.setJOB_ODR_CD(jobOdrCd);
              struct.setJOB_ODR_CANCEL_NO(jobOdrCancelNo);
              struct.setInitLevel(initLevel);
              

              // 登録後データ再表示
              controlSelect(); 
            //Add Anken End   20140421 song-yy


              // エラー処理を記述してください。
          } catch (NumberFormatException e) {
              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(e, emsg);
              throw ee;
          } catch (SQLException e) {
              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(e, emsg);
              throw ee;
          } finally {
              try {
                  if (conn != null) {
                      conn.rollback();
                  }
              } catch(Exception e) {
                  setReadStatus(ERROR);
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(e, emsg);
                  throw ee;
              }
          }

                //}}user_implement_dev:<controlinsert>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
          // TODO: ユーザ定義のコードを記述してください
          try {
        	//Add Anken Start 20140425 song-yy
        	  //１）	品目番号のデマンド状態区分が1:計画の時
        	  if("1".equals(struct.geth_Sub1_DM_STS_TYP())){
            //Add Anken End   20140425 song-yy
        		  int nRet = 0;
                  String sql = null;

                  // 所要量再展開依頼、所要量計算制御の更新を行う。
                  CommonOd od =
                    new CommonOd(conn,
                                 this.sysPLANT_CD,
                                 this.sysUSER_CD,
                                 this.sp.getProcId());

                  DateConverter dc = new DateConverter();
                  PreparedStatement ps = null;

                  // ここから
                  List formList = entity.mSelectSub1.read(conn, struct);
                  if (formList.isEmpty()) {
                      setErrorMessage("ZZ01105");
                      setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
                      readStatus = ERROR;
                      _nextUrl = "/AC0120011.jsp";
                      return;

                  }

                  AC0120010Struct formStruct = (AC0120010Struct) formList.get(0);

                  if (struct.getc_JOB_ODR_DEL().equals("true")) {
                      //この製番構成を削除するがONの場合
                	  // 製番引当データが存在チェック
                	  List selectAlcList = entity.mselectJOB_ODR_ALC_CD.read(conn,struct);
                	  
                	  if(selectAlcList !=null && selectAlcList.size()>0){
                		  setErrorMessage("AA00165");
                		  setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
                		  _nextUrl = "/AC0120011.jsp";
                		  return;
                	  }
                	             	           	  
                      //下位に品目が存在しない場合

                      List selectChildList = entity.mSelectChild.read(conn, struct);

                      if (selectChildList == null || selectChildList.size() <= 0) {

                          struct.setsetOD_NO(struct.getOD_NO());
                          entity.mDeleteT_OD.delete(conn, struct);

                      } else {
                          //上記以外

                          od.changeMrpTypToDelete(struct.getOD_NO());

                      }

                  } else {
                	  
                      try {
                          //構成版数のチェック
                          od.checkModifyCount(struct.getOD_NO(), Long.parseLong( struct.geth_Sub1_OD_MODIFY_COUNT()));
                      } catch (ApsComException e) {
                    	  setErrorMessage("ZZ01105");
                		  setErrorParameter("T_OD", "OD_NO", struct.getOD_NO());
                		  _nextUrl = "/AC0120011.jsp";
                		  return;
                      }
                      
                      //この製番構成を削除するがOFFの場合
                      if (updateErrCheck(formStruct, "UPDATE") == false) {
                          _nextUrl = "/AC0120011.jsp";
                          return;
                      }

                      if (Calculate.compare(struct.getSub1_ODR_QTY(), formStruct.getSub1_ODR_QTY()) == 0
                          && (struct.getSub1_DUE_DATE().equals(formStruct.getSub1_DUE_DATE())
                              || (struct.getSub1_DUE_DATE().length() == 0 && formStruct.getSub1_DUE_DATE() == null))
                          && ((formStruct.getSub1_OD_TYP().equals("3"))
                              || (struct.getSub1_PRD_DUE_DATE().equals(formStruct.getSub1_PRD_DUE_DATE()))
                              || (struct.getSub1_PRD_DUE_DATE().length() == 0 && formStruct.getSub1_PRD_DUE_DATE() == null))
                          && (struct.getSub1_PRD_START_DATE().equals(formStruct.getSub1_PRD_START_DATE())
                              || (struct.getSub1_PRD_START_DATE().length() == 0 && formStruct.getSub1_PRD_START_DATE() == null))
                          && (struct.getSub1_ODR_START_DATE().equals(formStruct.getSub1_ODR_START_DATE())
                              || (struct.getSub1_ODR_START_DATE().length() == 0 && formStruct.getSub1_ODR_START_DATE() == null)) ) {
     


                          
                          //下位品目への変更なし　要求数、構成単位数(分子)(分母)、内外作区分、構成仕損率、品目仕損率のみ変更②
                          if( Calculate.compare(struct.getSub1_PS_UNIT_NUMERATOR(), formStruct.getSub1_PS_UNIT_NUMERATOR()) == 0
                              && Calculate.compare(struct.getSub1_PS_UNIT_DENOMINATOR(), formStruct.getSub1_PS_UNIT_DENOMINATOR()) == 0
                              && Calculate.compare(struct.getSub1_DM_QTY(), formStruct.getSub1_DM_QTY()) == 0
                              && Calculate.compare(struct.getSub1_OUTSIDE_TYP(), formStruct.getSub1_OUTSIDE_TYP()) == 0
                              && Calculate.compare(struct.getSub1_PS_SPOIL(), formStruct.getSub1_PS_SPOIL()) == 0
                              && Calculate.compare(struct.getSub1_ITEM_SPOIL(), formStruct.getSub1_ITEM_SPOIL()) == 0) {
                              //この製番構成を削除するチェックのみが変更（チェックが外された場合のみ）

                              struct.setsetMRP_TYP("2");
                              struct.setsetOD_NO(struct.getOD_NO());
                              entity.mupdateT_OD2.update(conn, struct);



                          } else {


                              //構成単位数(分子)(分母)、内外作区分のみ変更
                              struct.setsetOD_NO(struct.getOD_NO());																// 01.オーダデマンド番号
                              struct.setsetDUE_DATE(null);													                    // 02.要求納期
                              struct.setsetPRD_DUE_DATE(null);	 										                        // 03.製造納期
                              struct.setsetPRD_START_DATE(null);										                            // 04.製造着手日
                              struct.setsetODR_START_DATE(null);										                            // 05.手配着手日
                              struct.setsetODR_QTY(null);														                    // 06.オーダ数
                              struct.setsetDM_QTY(struct.getSub1_DM_QTY());														// 07.デマンド数
                              struct.setsetOUTSIDE_TYP(struct.getSub1_OUTSIDE_TYP());												// 08.所要量内外作区分
                              struct.setsetOD_TYP(null);															                // 09.オーダデマンド区分
                              struct.setsetPS_UNIT_QTY(struct.geth_Sub1_PS_UNIT_QTY());											// 10.製品構成単位数
                              struct.setsetITEM_SPOIL(struct.getSub1_ITEM_SPOIL());                                               // 所要量品目仕損率
                              struct.setsetPS_SPOIL(struct.getSub1_PS_SPOIL());													// 11.品目仕損率
                              struct.setsetPS_UNIT_DENOMINATOR(struct.getSub1_PS_UNIT_DENOMINATOR());								// 11.製品構成単位数分母
                              struct.setsetPS_UNIT_NUMERATOR(struct.getSub1_PS_UNIT_NUMERATOR());									// 12.製品構成単位数分子

                              if (formStruct.getMRP_TYP().equals("3")) {                                                        // 所要量処理区分 
                                  struct.setsetMRP_TYP("2");                                                      
                              } else {
                                  if (formStruct.getMRP_TYP().equals("1")) {
                                      struct.setsetMRP_TYP("1");
                                  } else {
                                      if (formStruct.getMRP_TYP().equals("2")) {
                                          struct.setsetMRP_TYP("2");

                                      } else {
                                          if (formStruct.getMRP_TYP().equals("9")) {
                                              struct.setsetMRP_TYP("9");
                                          }
                                      }
                                  }

                              }
                              
                              entity.mUpdateT_OD.update(conn, struct);

                          }

                      } else {
                          //要求数、構成単位数(分子)(分母)、内外作区分、構成仕損率、品目仕損率以外も変更③
                          struct.setsetOD_NO(struct.getOD_NO());																// 01.オーダデマンド番号
                          //struct.setsetDUE_DATE(null);													                    // 02.要求納期

                          if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") == 0) {

                              struct.setsetPRD_DUE_DATE(ConDateTime(struct.getSub1_DUE_DATE(),struct.getSub1_DUE_TIME()));    // 03.製造納期
                              struct.setsetPRD_START_DATE(null);										                        // 04.製造着手日
                              struct.setsetODR_START_DATE(null);									                            // 05.手配着手日
                              struct.setsetOD_TYP("3");															                // 09.オーダデマンド区分
                          } else {

                              struct.setsetPRD_DUE_DATE(ConDateTime(struct.getSub1_PRD_DUE_DATE(),struct.getSub1_PRD_DUE_TIME()));	 				// 03.製造納期
                              struct.setsetPRD_START_DATE(ConDateTime(struct.getSub1_PRD_START_DATE(),struct.getSub1_PRD_START_TIME()));		// 04.製造着手日
                              struct.setsetODR_START_DATE(ConDateTime(struct.getSub1_ODR_START_DATE(),struct.getSub1_ODR_START_TIME()));		// 05.手配着手日
                              struct.setsetOD_TYP("1");															                // 09.オーダデマンド区分
                          }

                          struct.setsetODR_QTY(Double.toString(
                              od.changeQtyUp(Double.parseDouble(struct.getSub1_ODR_QTY()),
                                             Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP()))));								// 06.オーダ数

    											if (Calculate.compare(struct.getsetODR_QTY(), "0") == 0) {
    											    struct.setsetODR_STS_TYP("0");																	// 07.オーダ状態区分
    											} else {
    											    struct.setsetODR_STS_TYP("1");
    											}
                  
                          struct.setsetDM_QTY(Double.toString(
                              od.changeQtyUp(Double.parseDouble(struct.getSub1_DM_QTY()),
                                             Integer.parseInt(struct.geth_Sub1_UNIT_QTY_TYP()))));								// 07.デマンド数

                          struct.setsetOUTSIDE_TYP(struct.getSub1_OUTSIDE_TYP());												// 08.所要量内外作区分

                          struct.setsetPS_UNIT_QTY(struct.geth_Sub1_PS_UNIT_QTY());											    // 10.製品構成単位数
                          struct.setsetPS_SPOIL(struct.getSub1_PS_SPOIL());													    // 11.構成仕損率
                          struct.setsetITEM_SPOIL(struct.getSub1_ITEM_SPOIL());                                                 //品目仕損率
                          struct.setsetPS_UNIT_DENOMINATOR(struct.getSub1_PS_UNIT_DENOMINATOR());								// 11.製品構成単位数分母
                          struct.setsetPS_UNIT_NUMERATOR(struct.getSub1_PS_UNIT_NUMERATOR());									// 12.製品構成単位数分子


                          if (formStruct.getMRP_TYP().equals("1")) {
                              struct.setsetMRP_TYP("1");														                // 13.所要量処理区分

                          } else {

                              if (Calculate.compare(formStruct.getSub1_ODR_QTY(), "0") == 0) {

                                  if (Calculate.compare(struct.getSub1_ODR_QTY(), "0") != 0) {
                                      //手配数が0から0以外へ変更となった場合

                                      List selectChild = entity.mSelectChild.read(conn, struct);
                                      if (!selectChild.isEmpty()){

                                          //下位部品が存在する場合
                                          struct.setsetMRP_TYP("2");														               // 13.所要量処理区分
                                      } else {

                                          //下位部品が存在しない場合
                                          struct.setsetMRP_TYP("1");														               // 13.所要量処理区分

                                      }

                                  } else {

                                      struct.setsetMRP_TYP("2");														               // 13.所要量処理区分
                                  }

                              } else {
                                  struct.setsetMRP_TYP("2");														               // 13.所要量処理区分

                              }

    //不要？                          entity.mupdateT_OD3.update(conn, struct);

                          }

                          entity.mupdateT_OD3.update(conn, struct);

                          //手配数、手配着手日、製造納期のいずれかに変更がある場合、下位デマンド情報の修正を行う
                          if (Calculate.compare(struct.getSub1_ODR_QTY(), formStruct.getSub1_ODR_QTY()) != 0
                              || !struct.getSub1_ODR_START_DATE().equals(formStruct.getSub1_ODR_START_DATE())
                              || !struct.getSub1_ODR_START_DATE().equals(formStruct.getSub1_ODR_START_DATE())) {

                              sql = "SELECT * FROM T_OD WHERE T_OD.PARENT_OD_NO = ?";
                              ps = conn.getConn().prepareStatement(sql);
                              ps.setString(1, struct.getOD_NO());
                              ResultSet rs = ps.executeQuery();
                              while (rs.next()) {
                                  //下位部品が存在する場合
                                  //下位デマンド情報の変更

                                  changeChildOdInfo(rs,
                                                    struct.getOD_NO(),
                                                    struct.getSub1_ODR_QTY(),
                                                    dc.str2date(struct.getSub1_ODR_START_DATE()),
                                                    dc.str2date(struct.getSub1_PRD_DUE_DATE()),
                                                    dc.str2date(struct.getSub1_PRD_START_DATE()));

                              }
                          }

                          //所要量再展開依頼、所要量計算制御の更新
                          od.changeCommon(struct.getOD_NO());
                          
                      }

//                      //所要量再展開依頼、所要量計算制御の更新
//                      od.changeCommon(struct.getOD_NO());

                  }
        	  }
        	//Add Anken Start 20140428 song-yy
        	  //品目番号のデマンド状態区分が2:確定の時　もしくは
        	 // 品目番号のオーダ状態区分が2:確定の時
        	  if("2".equals(struct.geth_Sub1_DM_STS_TYP())
        			  ||"2".equals(struct.geth_Sub1_ODR_STS_TYP())){
        		  struct.setODR_STS_TYP(struct.geth_Sub1_ODR_STS_TYP());
        		  struct.setDM_STS_TYP(struct.geth_Sub1_DM_STS_TYP());
        		  struct.setOUTSIDE_TYP(struct.getSub1_OUTSIDE_TYP());
        		  if(checkParentItem(struct) == false){
                  	// メイン画面へ遷移
                      _nextUrl = "/AC0120011.jsp";
                      return;
        		  }
        		  //削除の処理（状態が確定の場合の削除） の更新を行う。
         		  //製番構成を削除する」がＯｎの場合、以下の削除を行う
         		  if("true".equals(struct.getc_JOB_ODR_DEL())){
             		  //①	出庫指示の削除を行う。
             		  entity.mdeleteT_ISSUE_INST.delete(conn, struct);
             		  //②	発注残の削除を行う。
             		  entity.mdeleteT_RLSD_PUCH_ODR.delete(conn, struct);
             		  //③	作業系列別仕掛の削除を行う。
             		  entity.mdelT_WORK_IN_PROC_BY_PROC.delete(conn, struct);
             		  //④	品目別仕掛の削除を行う。
             		  entity.mdeleteT_WORK_IN_PROC_BY_ITEM.delete(conn, struct);
             		  //⑤	所要量の削除を行う。
             		  entity.mdeleteT_OD1.delete(conn, struct);
         		  }
         	    
        	  }
        	//Add Anken End   20140428 song-yy
              

              conn.commit();

              // 登録後データ再表示
              controlSelect();


              //		} catch(SQLException e) {
              //			e.printStackTrace();
              // エラー処理を記述してください。
              //EG		} catch (ParseException e) {
              //EG			throw new ExpjException(e);



          } catch (FoundationException e) {

              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(e, emsg);
              throw ee;
          } catch (ApsComException e) {

              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(e, emsg);
              throw ee;
          } catch (NumberFormatException e) {

              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(e, emsg);
              throw ee;
          } catch (SQLException e) {

              setReadStatus(ERROR);
              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
              sysLog.severe(emsg, getsysUSER_CD());
              ExpjException ee = new ExpjException(e, emsg);
              throw ee;
          } finally {
              try {
                  if (conn != null) {
                      conn.rollback();
                  }
              } catch(Exception e) {
                  setReadStatus(ERROR);
                  ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                  sysLog.severe(emsg, getsysUSER_CD());
                  ExpjException ee = new ExpjException(e, emsg);
                  throw ee;
              }
          }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcancelSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");
			//{{user_implement_dev:<controlcancelSub1>
          // TODO: ユーザ定義のコードを記述してください
          controlSelect();
                //}}user_implement_dev:<controlcancelSub1>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlcancelSub1");

		return;
	}

	/**
	 * 詳細表示ボタン押下時に実行される処理です。
	 *
	 */
	public void controlShowDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");
			//{{user_implement_dev:<controlShowDetail>


          try {
              // 選択されたノードを元に詳細情報を取得
              List detailList = entity.mDetail.read(conn, struct);
              if (detailList.isEmpty()) {
                  setErrorMessage("ZZ01105");
                  return;

              }
              AC0120010Struct detailStruct = (AC0120010Struct) detailList.get(0);

              // 詳細情報を設定
              struct.setJOB_ODR_TYP(detailStruct.getJOB_ODR_TYP());
              //struct.setJOB_ODR_TYP_DN(this.getDisplayName(detailStruct.getJOB_ODR_TYP(),));
              //struct.setJOB_ODR_TYP_DN(detailStruct.getJOB_ODR_TYP_DN());
              struct.setALC_GRP_CD(detailStruct.getALC_GRP_CD());
              struct.setITEM_CD(detailStruct.getITEM_CD());
              struct.setDetail_ITEM_NAME(detailStruct.getDetail_ITEM_NAME());
              struct.setDRAW_CD(detailStruct.getDRAW_CD());
              struct.setSPEC(detailStruct.getSPEC());
              struct.setOUTSIDE_TYP(detailStruct.getOUTSIDE_TYP());
              struct.setOUTSIDE_TYP_DN(getDisplayName(detailStruct.getOUTSIDE_TYP(),
            		  _outsideTypValList,_outsideTypNameList));
              //struct.setOUTSIDE_TYP_DN(detailStruct.getOUTSIDE_TYP_DN());
              struct.setMRP_ODR_TYP(detailStruct.getMRP_ODR_TYP());
              struct.setMRP_ODR_TYP_DN(getDisplayName(detailStruct.getMRP_ODR_TYP(),
            		  _mrpOdrTypValList,_mrpOdrTypNameList));
              //struct.setMRP_ODR_TYP_DN(detailStruct.getMRP_ODR_TYP_DN());
              struct.setITEM_SPOIL(detailStruct.getITEM_SPOIL());
              struct.setUNIT_QTY_TYP(detailStruct.getUNIT_QTY_TYP());
              //struct.setUNIT_QTY_TYP_DN(detailStruct.getUNIT_QTY_TYP_DN());
              struct.setUNIT_QTY_TYP_DN(getDisplayName(detailStruct.getUNIT_QTY_TYP(),
            		  _unitQtyTypValList,_unitQtyTypNameList));
              struct.setJOB_ODR_DLV_DATE(detailStruct.getJOB_ODR_DLV_DATE());
              struct.setDUE_DATE(detailStruct.getDUE_DATE());

              if (detailStruct.getOD_TYP().equals("3")) {
                  struct.setPRD_DUE_DATE(null);
              } else {
                  struct.setPRD_DUE_DATE(detailStruct.getPRD_DUE_DATE());
              }
              struct.setPRD_START_DATE(detailStruct.getPRD_START_DATE());
              struct.setODR_START_DATE(detailStruct.getODR_START_DATE());
              struct.setSUM_PUCH_ODR_QTY(detailStruct.getSUM_PUCH_ODR_QTY());
              struct.setSUM_OPR_INST_QTY(detailStruct.getSUM_OPR_INST_QTY());
              struct.setODR_QTY(detailStruct.getODR_QTY());
              struct.setDM_QTY(detailStruct.getDM_QTY());
              struct.setSUM_ALCD_QTY(detailStruct.getSUM_ALCD_QTY());
              struct.setODR_STS_TYP(detailStruct.getODR_STS_TYP());
              //struct.setODR_STS_TYP_DN(detailStruct.getODR_STS_TYP_DN());
              struct.setODR_STS_TYP_DN(getDisplayName(detailStruct.getODR_STS_TYP(),
            		  _odrStsTypValList,_odrStsTypNameList));
              struct.setDM_STS_TYP(detailStruct.getDM_STS_TYP());
              //struct.setDM_STS_TYP_DN(detailStruct.getDM_STS_TYP_DN());
              struct.setDM_STS_TYP_DN(getDisplayName(detailStruct.getDM_STS_TYP(),
            		  _dmStsTypValList,_dmStsTypNameList));
              struct.setSTOCK_UNIT(detailStruct.getSTOCK_UNIT());
              struct.setOD_TYP(detailStruct.getOD_TYP());
              //struct.setOD_TYP_DN(detailStruct.getOD_TYP_DN());
              struct.setOD_TYP_DN(getDisplayName(detailStruct.getOD_TYP(),
            		  _odTypValList,_odTypNameList));
              //struct.setOD_GNR_TYP_DN(detailStruct.getOD_GNR_TYP_DN());
              struct.setOD_GNR_TYP_DN(getDisplayName(detailStruct.getOD_GNR_TYP(),
            		  _odGnrTypValList,_odGnrTypNameList));
//            ▼▼ 2008/08/21 ADD START -TSUCHIDA▼▼
           			//struct.setMANHOUR_TYP_DN(detailStruct.getMANHOUR_TYP_DN());
                    struct.setMANHOUR_TYP_DN(getDisplayName(detailStruct.getMANHOUR_TYP(),
                  		  _manhourTypValList,_manhourTypNameList));
//            ▲▲ 2008/08/21 ADD END -TSUCHIDA▲▲
                    
              //Add Anken Start 20140417 song-yy
                    struct.setOPR_RSLT_TYP_DN(getDisplayName(detailStruct.getOPR_RSLT_TYP(),_oprTypValList,_oprTypNameList));
                    struct.setTOTAL_RCV_QTY(detailStruct.getTOTAL_RCV_QTY());
                    struct.setTOTAL_ISSUE_QTY(detailStruct.getTOTAL_ISSUE_QTY());
              //Add Anken End   20140417 song-yy
          } catch (SQLException e) {
              throw new ExpjException(e);
          }
                //}}user_implement_dev:<controlShowDetail>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlShowDetail");

		return;
	}

	/**
	 * ツリー追加ボタン押下時に実行される処理です。
	 *
	 */
	public void controlAddTree() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");
			//{{user_implement_dev:<controlAddTree>


          Element rootElement = null;
          try {
              // ツリー用XMLドキュメントを再構築
              flashTree = new XmlDocument();
              // ドキュメントRootを作成、ツリー用XMLに追加
              rootElement = flashTree.createElement("root");
              flashTree.appendChild(rootElement);
              // ドキュメントrootにツリー追加対象idを設定
              rootElement.setAttribute("target", struct.getid());

              // 下位レベルノードを展開
              // ここでは、１レベルだけにノードを展開する。
              // そのため、最大展開レベルに現在のレベル＋１を渡している。
              int treeLevel = Integer.parseInt(struct.getlvl());
              int nodeId = Integer.parseInt(struct.getmaxid());
              expandTree(
                  rootElement,
                  struct,
                  Integer.parseInt(struct.getid()),
                  nodeId + 1,
                  nodeId + _maxRead,
                  treeLevel + 1,
                  treeLevel + 1,
                  false);
          } catch (MaxLineException me) {
              flashTree.removeChild(rootElement);
              Element stopNodeElement = flashTree.createElement("node");
              flashTree.appendChild(stopNodeElement);
              stopNodeElement.setAttribute("target", struct.getid());
              stopNodeElement.setAttribute("terminated", "true");
              ExpjMessage emsg = new ExpjMessage("ZZ01115", String.valueOf(_maxRead));
              stopNodeElement.setAttribute(
                  "terminate_comment",
                  emsg.getMessage(CoreTools.getLocale(getsysUSER_CD())));
              msgStruct.addError(emsg);
              sysLog.warning(emsg, getsysUSER_CD());

              setReadStatus(TOO_MANY);
              return;
          }


                //}}user_implement_dev:<controlAddTree>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlAddTree");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselectSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlselectSub1");
			//{{user_implement_dev:<controlselectSub1>
          // TODO: ユーザ定義のコードを記述してください

		PreparedStatement ps = null;
        ResultSet rs = null;

          try {
          	  // パラメータ読込
              GetTimeCtrl();
          	
              struct.setSub1_PARENT_OD_NO(struct.getOD_NO());

              String sql = null;

              List headerList = entity.mSelectSub1Header.read(conn, struct);
              if (headerList.isEmpty()) {
                  setErrorMessage("AC00220");
                  setErrorParameter("T_OD", "OD_NO", struct.getSub1_PARENT_OD_NO());
                  //struct.setSub1_Comp_ITEM_NAME(null);
                  readStatus = ERROR;
                  return;
              }
              AC0120010Struct headerStruct = (AC0120010Struct) headerList.get(0);


              // 画面情報を設定
              setStructSub1Header(headerStruct);

              List subformList = entity.mSelectSub1Form.read(conn, struct);

              if (subformList.isEmpty()) {
                  setErrorMessage("AC00220");
                  setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                  struct.setSub1_Comp_ITEM_NAME(null);
                  readStatus = ERROR;
                  return;
              }

              AC0120010Struct subformStruct = (AC0120010Struct) subformList.get(0);

              //親品目が擬似品目となる場合、子品目に擬似品目の構成追加は行えません

              //親品目の品目手配区分を取得
              List checkSubOdRead1List = entity.mcheckSubOdRead1.read(conn, struct);

              if (checkSubOdRead1List.isEmpty()) {
                  setErrorMessage("AC00220");
                  setErrorParameter("T_OD", "JOB_ODR_CD", struct.getJOB_ODR_CD());
                  setErrorParameter("T_OD", "JOB_ODR_CANCEL_NO", struct.getJOB_ODR_CANCEL_NO());
                  setErrorParameter("T_OD", "ITEM_CD", struct.getSub1_Parent_ITEM_CD());
                  readStatus = ERROR;
                  return;
              }

              AC0120010Struct checkSubOdRead1Struct = (AC0120010Struct) checkSubOdRead1List.get(0);


              if (checkSubOdRead1Struct.getMRP_ODR_TYP().equals("8")) {

                  //親品目の品目手配区分が8：擬似品目の場合
                  //子品目の品目手配区分をチェックする
                  List checkSubOdRead2List = entity.mcheckSubOdRead2.read(conn, struct);
                  if (checkSubOdRead2List.isEmpty()) {

                      setErrorMessage("AC00220");
                      setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                      readStatus = ERROR;
                      return;
                  }

                  AC0120010Struct checkSubOdRead2Struct = (AC0120010Struct) checkSubOdRead2List.get(0);

                  if (checkSubOdRead2Struct.getMRP_ODR_TYP().equals("8")) {

                      setErrorMessage("AC00024");
                      setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                      readStatus = ERROR;
                      return;
                  }

              }
            //Add Anken Start 20140418 song-yy
             // 画面推移時に取得した上位の[所要量].“オーダ状態区分”＝2：確定で
             //かつ、「子品目番号」と一致する[品目].“品目手配区分”＝8：擬似品目の場合
              if("2".equals(struct.geth_Sub1_ODR_STS_TYP())){
            	  
                  
                  //子品目の品目手配区分をチェックする
                  List checkSubOdRead2List = entity.mcheckSubOdRead2.read(conn, struct);
                  if (checkSubOdRead2List.isEmpty()) {

                      setErrorMessage("AC00220");
                      setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                      readStatus = ERROR;
                      return;
                  }

                  AC0120010Struct checkSubOdRead2Struct = (AC0120010Struct) checkSubOdRead2List.get(0);
                  //子品目の品目手配区分が8：擬似品目の場合
                  if ("8".equals(checkSubOdRead2Struct.getMRP_ODR_TYP())) {

                      setErrorMessage("AC00242");
                      setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                      setErrorParameter("M_ITEM", "MRP_ODR_TYP", checkSubOdRead2Struct.getMRP_ODR_TYP());
                      readStatus = ERROR;
                      return;
                  }
                  
                  //画面推移時に取得した上位の[所要量].“オーダ状態区分”＝2：確定でかつ、
                  //「子品目番号」と一致する[品目].“工数管理品目区分”＝1:工数管理品目の場合
                  if("1".equals(checkSubOdRead2Struct.getMANHOUR_TYP())){
                	  setErrorMessage("AC00243");
                      setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                      setErrorParameter("M_ITEM", "MANHOUR_TYP", checkSubOdRead2Struct.getMANHOUR_TYP());
                      readStatus = ERROR;
                      return;
                  }
                  //画面推移時に取得した上位の[所要量].“オーダ状態区分”＝2：確定でかつ
                  //「子品目番号」と一致する[品目].“作業実績区分”＝1：出来高実績の場合
                  if("1".equals(checkSubOdRead2Struct.getOPR_RSLT_TYP())){
                	  setErrorMessage("AC00244");
                      setErrorParameter("M_ITEM", "ITEM_CD", struct.getSub1_Comp_ITEM_CD());
                      setErrorParameter("M_ITEM", "OPR_RSLT_TYP", checkSubOdRead2Struct.getOPR_RSLT_TYP());
                      readStatus = ERROR;
                      return;
                  }
              }
            //Add Anken End   20140418 song-yy

              sql = "SELECT  T_OD.ITEM_CD AS ITEM_CD";
              sql = sql + " FROM T_OD";
              sql = sql + " WHERE T_OD.JOB_ODR_CD = ?";
              sql = sql + " AND T_OD.JOB_ODR_CANCEL_NO = ?";
              sql = sql + " AND T_OD.JOB_ODR_DETAIL_NO = 0";
              sql = sql + " AND T_OD.ITEM_CD = ?";
              sql = sql + " START WITH T_OD.OD_NO = ?";
              sql = sql + " CONNECT BY PRIOR T_OD.PARENT_OD_NO = T_OD.OD_NO";

              ps = conn.getConn().prepareStatement(sql);
              ps.setString(1, struct.getJOB_ODR_CD());
              ps.setString(2, struct.getJOB_ODR_CANCEL_NO());
              ps.setString(3, struct.getSub1_Comp_ITEM_CD());
              ps.setString(4, struct.getOD_NO());
              rs = ps.executeQuery();
              if (rs.next()){
                  setErrorMessage("AC00023");
                  setErrorParameter("T_OD","JOB_ODR_CD",struct.getJOB_ODR_CD());
                  setErrorParameter("T_OD","JOB_ODR_CANCEL_NO",struct.getJOB_ODR_CANCEL_NO());
                  setErrorParameter("T_OD","JOB_ODR_DETAIL_NO","0");
                  setErrorParameter("T_OD","ITEM_CD",struct.getSub1_Comp_ITEM_CD());
                  setErrorParameter("T_OD","OD_NO",struct.getOD_NO());

                  readStatus = ERROR;
                  return;

              }
              
            //Add Anken Start 20140418 song-yy
              //上記チェックでＯＫの場合、親品目番号に対する実績のチェックを行う
              if(checkSub1ParentItem()== false){
            	  readStatus = ERROR;
                  return;
              }
            //Add Anken End   20140418 song-yy
				DateTimeFormat dtf = new DateTimeFormat(conn);
              //要求納期を設定
              struct.setSub1_DUE_DATE(dtf.getDatePart(checkSubOdRead1Struct.getSub1_ODR_START_DATE()));
              //要求納期を設定
              String dueTime = dtf.getTimePart(checkSubOdRead1Struct.getSub1_ODR_START_DATE());
			  struct.setSub1_DUE_TIME(dtf.getCoronTimePart(checkSubOdRead1Struct.getSub1_ODR_START_DATE()));
			  struct.setSub1_DUE_TIME2(dtf.getTimePart(checkSubOdRead1Struct.getSub1_ODR_START_DATE()));
			  struct.setSub1_DUE_TIME3(dtf.getTimePart(checkSubOdRead1Struct.getSub1_ODR_START_DATE()));
              //要求数を設定
              struct.setSub1_DM_QTY(checkSubOdRead1Struct.getSub1_ODR_QTY());

              // 詳細情報を設定
              struct.setSub1_Comp_ITEM_NAME(subformStruct.getSub1_Comp_ITEM_NAME());
              struct.setSub1_DRAW_CD(subformStruct.getSub1_DRAW_CD());
              struct.setSub1_SPEC(subformStruct.getSub1_SPEC());
              //内外作区分
              struct.setSub1_OUTSIDE_TYP(subformStruct.getSub1_OUTSIDE_TYP());

              struct.seth_Sub1_MRP_ODR_TYP(subformStruct.geth_Sub1_MRP_ODR_TYP());

              //品目仕損率
              if ("1".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "2".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())) {
                  struct.setSub1_ITEM_SPOIL(subformStruct.getSub1_ITEM_SPOIL());
              } else {
                  struct.setSub1_ITEM_SPOIL("0.0");
              }

              struct.seth_Sub1_UNIT_QTY_TYP(subformStruct.geth_Sub1_UNIT_QTY_TYP());
              //品目手配区分
              //struct.setSub1_MRP_ODR_TYP_DN(subformStruct.getSub1_MRP_ODR_TYP_DN());
              struct.setSub1_MRP_ODR_TYP_DN(getDisplayName(subformStruct.geth_Sub1_MRP_ODR_TYP(),
                       _mrpOdrTypValList, _mrpOdrTypNameList));
              //在庫数単位区分
              //struct.setSub1_UNIT_QTY_TYP_DN(subformStruct.getSub1_UNIT_QTY_TYP_DN());
              struct.setSub1_UNIT_QTY_TYP_DN(getDisplayName(subformStruct.geth_Sub1_UNIT_QTY_TYP(),
                      _unitQtyTypValList, _unitQtyTypNameList));
              struct.setSub1_STOCK_UNIT(subformStruct.getSub1_STOCK_UNIT());
              struct.setSub1_PS_UNIT_DENOMINATOR("1.0");
              struct.setSub1_PS_UNIT_NUMERATOR("1.0");
              struct.setSub1_PS_SPOIL("0.0");
              struct.seth_Sub1_ISSUE_TYP(subformStruct.geth_Sub1_ISSUE_TYP());
              struct.seth_Comp_ITEM_MODIFY_COUNT(subformStruct.geth_Comp_ITEM_MODIFY_COUNT());

              struct.setISSUE_LT(subformStruct.getISSUE_LT());

              //業務運用日付の取得
              struct.seth_BUSINESS_OPR_DATE(SystemInformation.getBusinessOprDate(sysPLANT_CD));

              //会社コードの取得
              struct.setCOMPANY_CD(SystemInformation.getSysMyCompanyCd());


              // 要求数の算出・設定
              String dmQty = calcDmQty(subformStruct);

              // 手配数の算出・設定
              if ("1".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "2".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())) {
                  struct.setSub1_ODR_QTY(calcOdrQty(dmQty, subformStruct));
              } else if("8".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())){
            	  struct.setSub1_ODR_QTY(dmQty);
              } else {
                  struct.setSub1_ODR_QTY("0");
              }

              // 製造納期の算出・設定
              if ("1".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "2".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "8".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())) {
                  String calPrdDueDate = calcPrdDueDate(subformStruct);
                  struct.setSub1_PRD_DUE_DATE(dtf.getDatePart(calPrdDueDate));
                  struct.setSub1_PRD_DUE_TIME(dtf.getTimePart(calPrdDueDate));
              } else {
                  struct.setSub1_PRD_DUE_DATE(null);
                  struct.setSub1_PRD_DUE_TIME(null);
              }

              //製造着手日の算出・設定
              if ("1".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "2".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "8".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())) {
                  String calPrdStartDate = calcPrdStartDate(subformStruct);
                  struct.setSub1_PRD_START_DATE(dtf.getDatePart(calPrdStartDate));
                  struct.setSub1_PRD_START_TIME(dtf.getTimePart(calPrdStartDate));
              } else {
                  struct.setSub1_PRD_START_DATE(null);
                  struct.setSub1_PRD_START_TIME(null);
              }


              //手配着手日の算出・設定
              if ("1".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "2".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())
                  || "8".equals(subformStruct.geth_Sub1_MRP_ODR_TYP())) {
                  String calOdrStartDate = calcOdrStartDate(subformStruct);
                  struct.setSub1_ODR_START_DATE(dtf.getDatePart(calOdrStartDate));
                  struct.setSub1_ODR_START_TIME(dtf.getTimePart(calOdrStartDate));
              } else {
                  struct.setSub1_ODR_START_DATE(null);
                  struct.setSub1_ODR_START_TIME(null);
              }


              struct.seth_Sub1_PS_UNIT_QTY("1");

//            ▼▼ 2008/08/21 ADD START -TSUCHIDA▼▼
           			struct.seth_Sub1_MANHOUR_TYP(subformStruct.geth_Sub1_MANHOUR_TYP());
//            ▲▲ 2008/08/21 ADD END -TSUCHIDA▲▲
              // 読込状態（読込成功）を設定
              setReadStatus(NORMAL);
              
              if(rs != null){
            	  rs.close();
            	  rs = null;
              }
              if(ps != null){
            	  ps.close();
            	  ps = null;
              }

          } catch (Exception e) {
              throw new ExpjException(e);
          } finally{
        	  try{
	        	  if(rs != null){
	        		  rs.close();
	        		  rs = null;
	        	  }
	        	  if(ps != null){
	        		  ps.close();
	        		  ps = null;
	        	  }
        	  } catch(Exception e){
        		  e.printStackTrace();
        	  }
          }




                //}}user_implement_dev:<controlselectSub1>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlselectSub1");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// ログ出力情報格納用
			String logMessage = "";
			// CsvWriterを生成
			// CSV出力部品を設定
			csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
			setSyslogConfig("csv-file name [" + CsvWriter.getFileName(getsysUSER_CD()) + "]");
			
			// リストデータを設定
			// CSV情報の作成
			List cvsList = new ArrayList();
			String[] title = {
					"Expj.Cmt0611",//レベル
					"Expj.PARENT_ITEM_CD",//親品目番号
					"Expj.COMP_ITEM_CD",//子品目番号
					"Expj.Cmt5987",//製品構成版数
					"Expj.PS_UNIT_DENOMINATOR",//製品構成単位数分母
					"Expj.PS_UNIT_NUMERATOR",//製品構成単位数分子
					"Expj.Cmt1070",//製品構成有効開始日
					"Expj.Cmt1071",//製品構成有効終了日
					"Expj.PS_SPOIL",//構成仕損率
					"Expj.CONS_TYP",//支給区分
					"Expj.PS_LT_FLG",//製品構成リードタイム使用フラグ
					"Expj.PS_FIXED_LT",//製品構成固定分リードタイム
					"Expj.PS_PROP_LT",//製品構成比例分リードタイム
					"Expj.PS_PROP_LOT_SIZE",//製品構成比例分ロットサイズ
					"Expj.PS_REF_NO",//製品構成照会キー
					"Expj.COST_UP_TYP",//原価積上区分
					"Expj.MRP_EXP_TYP",//所要量展開区分
					"Expj.PARENT_ITEM_NAME",//親品目名
					"Expj.Parent_Drawing_No.",//親図面番号
					"Expj.Parent_SPEC",//親規格
					"Expj.Parent_I/E_type",//親内外作区分
					"Expj.PARENT_DUE_DATE",//親要求納期
					"Expj.PARENT_PRD_DUE_DATE",//親製造納期
					"Expj.PARENT_PRD_START_DATE",//親製造着手日
					"Expj.PARENT_ODR_START_DATE",//親手配着手日
					"Expj.PARENT_REQ_PRD_QTY",//親要求数
					"Expj.PARENT_ODR_QTY_1",//親手配数
					"Expj.PARENT_ALCD_QTY",//親引当済み数
					"Expj.PARENT_ODR_STS_TYP",//親オーダ状態区分
					"Expj.PARENT_DM_STS_TYP",//親デマンド状態区分
					"Expj.PARENT_OD_TYP",//親オーダデマンド区分
					"Expj.PARENT_TOTAL_RCV_QTY",//親入庫累計数
					"Expj.PARENT_TOTAL_ISSUE_QTY",//親出庫累計数
					"Expj.ITEM_NAME_2",//子品目名
					"Expj.Child_Drawing_No.",//子図面番号
					"Expj.Child_SPEC",//子規格
					"Expj.Child_I/E_type",//子内外作区分
					"Expj.COMP_DUE_DATE",//子要求納期
					"Expj.COMP_PRD_DUE_DATE",//子製造納期
					"Expj.COMP_PRD_START_DATE",//子製造着手日
					"Expj.COMP_ODR_START_DATE",//子手配着手日
					"Expj.COMP_REQ_PRD_QTY",//子要求数
					"Expj.COMP_ODR_QTY_1",//子手配数
					"Expj.COMP_ALCD_QTY",//子引当済み数
					"Expj.COMP_ODR_STS_TYP",//子オーダ状態区分
					"Expj.COMP_DM_STS_TYP",//子デマンド状態区分
					"Expj.COMP_OD_TYP",//子オーダデマンド区分
					"Expj.COMP_TOTAL_RCV_QTY",//子入庫累計数
					"Expj.COMP_TOTAL_ISSUE_QTY"//子出庫累計数
			};	
			cvsList.add(title);
            
			// List csvoutList = entity.mcsvout.read(conn, struct);
			// 0件の場合終了
			if(tempList.size() <= 0){
				setErrorMessage("AF00191");
				return;
			}
			
			for (int i = 0; i < tempList.size(); i++) {
				 AC0120010Struct csvoutStruct = (AC0120010Struct)tempList.get(i);
				 struct.setOD_NO(csvoutStruct.getOD_NO());
				 List csvCdataList = entity.mcsvCdata.read(conn, struct);
				 if(!csvCdataList.isEmpty()){
					 AC0120010Struct csvCdataStruct  = (AC0120010Struct)csvCdataList.get(0);
					 struct.setPARENT_OD_NO(csvoutStruct.getPARENT_OD_NO());
					 List csvPdateList = entity.mcsvPdata.read(conn, struct);
					 AC0120010Struct csvPdateStruct  = (AC0120010Struct)csvPdateList.get(0);				
					 String[] date = {
							
							 Calculate.add(csvCdataStruct.getOD_LEVEL_NO(), "-1")
	  	            	    ,csvPdateStruct.getPARENT_ITEM_CD()
							,csvCdataStruct.getITEM_CD()
							,csvCdataStruct.getPS_EDITION()
							,csvCdataStruct.getPS_UNIT_DENOMINATOR()
							,csvCdataStruct.getPS_UNIT_NUMERATOR()
							,csvCdataStruct.getEFF_PHASE_IN_DATE()
							,csvCdataStruct.getEFF_PHASE_OUT_DATE()
							,csvCdataStruct.getPS_SPOIL()
							,getDisplayName(csvCdataStruct.getCONS_TYP(),
									_consTypValList,_consTypNameList)
							,csvCdataStruct.getPS_LT_FLG()
							,csvCdataStruct.getFIXED_LT()
							,csvCdataStruct.getPROP_LT()
							,csvCdataStruct.getPROP_LOT_SIZE()
							,csvCdataStruct.getPS_KEY()
							,getDisplayName("0",
									_costupTypValList,_costupTypNameList)
							,getDisplayName("1",
									_mrpexpTypValList,_mrpexpTypNameList)
							,csvPdateStruct.getPARENT_ITEM_NAME()
							,csvPdateStruct.getPARENT_DRAW_CD()
							,csvPdateStruct.getPARENT_SPEC()
							,getDisplayName(csvPdateStruct.getPARENT_OUTSIDE_TYP(),
				            		  _outsideTypValList,_outsideTypNameList)
				            ,csvPdateStruct.getDUE_DATE()
				            ,csvPdateStruct.getPRD_DUE_DATE()
				            ,csvPdateStruct.getPRD_START_DATE()
				            ,csvPdateStruct.getODR_START_DATE()
				            ,csvPdateStruct.getDM_QTY()
				            ,csvPdateStruct.getODR_QTY()
				            ,csvPdateStruct.getSUM_ALCD_QTY()
				            ,csvPdateStruct.getODR_STS_TYP()
				            ,csvPdateStruct.getDM_STS_TYP()
				            ,csvPdateStruct.getOD_TYP()
				            ,csvPdateStruct.getTOTAL_RCV_QTY()
				            ,csvPdateStruct.getTOTAL_ISSUE_QTY()
							,csvCdataStruct.getCHILD_ITEM_NAME()
							,csvCdataStruct.getCHILD_DRAW_CD()
							,csvCdataStruct.getCHILD_SPEC()
							,getDisplayName(csvCdataStruct.getCHILD_OUTSIDE_TYP(),
				            		  _outsideTypValList,_outsideTypNameList)
				            ,csvCdataStruct.getDUE_DATE()
				            ,csvCdataStruct.getPRD_DUE_DATE()
				            ,csvCdataStruct.getPRD_START_DATE()
				            ,csvCdataStruct.getODR_START_DATE()
				            ,csvCdataStruct.getDM_QTY()
				            ,csvCdataStruct.getODR_QTY()
				            ,csvCdataStruct.getSUM_ALCD_QTY()
				            ,csvCdataStruct.getODR_STS_TYP()
				            ,csvCdataStruct.getDM_STS_TYP()
				            ,csvCdataStruct.getOD_TYP()
				            ,csvCdataStruct.getTOTAL_RCV_QTY()
				            ,csvCdataStruct.getTOTAL_ISSUE_QTY()
							
					};
					cvsList.add(date);
				 }
			}
			logMessage = "Generated CSV-data.";
			setSyslogConfig(logMessage);
			String strFilePath = null;
			try {
				// CSV作成
				setSyslogConfig("csvList.size [" + cvsList.size() + "]");
				csvWriter.write(cvsList, CoreTools.getLocale(struct.getsUser_ID()),true);
				strFilePath = csvWriter.getFilePath();
				setSyslogConfig("Completion of CSV-data output.");

				// 出力ファイルパス設定
				struct.setDOWNLOAD_FILE(strFilePath);

				// 表示行数オーバでのＣＳＶ出力の場合は表示用リストをクリアする
				if(getReadStatus() == TOO_MANY){
					cvsList.clear();
					this.list.clear();
				}
			}
			catch(Exception e)
			{
				// CSV出力失敗
				ExpjMessage emsg = new ExpjMessage( "ZZ01107" );
				sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
				ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
				throw ee;				
			}


		}catch(Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		} finally {
			//
		}
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
          // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
          // TODO: ユーザ定義のコードを記述してください
		//Mod Anken Start 20140428 song-yy
		try{
			String job_odr_cd =null;
			job_odr_cd =struct.getJOB_ODR_CD();
			
			// [自社]情報を部品より取得			
            _myCompanyStruct = MyCompanyControl.getData(conn);
            // [税名]情報を部品より取得			
            _taxNameStruct = TaxNameControl.getData(conn);
            // [邦貨]情報を部品より取得			
            _homeCurStruct = HomeCurControl.getData(conn);
                       
            initializeAll();
            // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
            if ( isScreenMove() == true ) {
                // 検索のコントロールメソッドを呼び出します。
                //	controlSelect();
            }
            
            if(job_odr_cd !=null && job_odr_cd.length() > 0){
            	struct.setJOB_ODR_CD(job_odr_cd);
				controlSelect();
			}
            
		}catch (SQLException e) {
            throw new ExpjException(e);
           } catch (DataNotFoundException e) {
            throw new ExpjException(e);
           } 
		//Mod Anken End   20140428 song-yy
         
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0120");
		logger.entering("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア

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
          try {
              // コンボボックスデータを部品より取得
              ComboBox cdac = new ComboBox(conn, sysUSER_CD);
              // 内外作区分のコンボボックスデータを設定
              ComboStruct outsideTypStruct = cdac.getData("OUTSIDE_TYP");
              struct.setList_Sub1_OUTSIDE_TYP_val(outsideTypStruct.getValList());
              struct.setList_Sub1_OUTSIDE_TYP_name(outsideTypStruct.getExplanList());
              // 内外作区分のコンボボックスデータを設定
              _outsideTypValList = outsideTypStruct.getValList();
              _outsideTypNameList = outsideTypStruct.getExplanList();
              // 品目手配区分のコンボボックスデータを設定
              ComboStruct mrpOdrTypStruct = cdac.getData("MRP_ODR_TYP");
              struct.setList_MRP_ODR_TYP_val(mrpOdrTypStruct.getValList());
              struct.setList_MRP_ODR_TYP_name(mrpOdrTypStruct.getExplanList());
              _mrpOdrTypValList = mrpOdrTypStruct.getValList();
              _mrpOdrTypNameList = mrpOdrTypStruct.getExplanList();
              // 在庫数単位区分のコンボボックスデータを設定
              ComboStruct unitQtyTypStruct = cdac.getData("UNIT_QTY_TYP");
              struct.setList_UNIT_QTY_TYP_val(unitQtyTypStruct.getValList());
              struct.setList_UNIT_QTY_TYP_name(unitQtyTypStruct.getExplanList());
              _unitQtyTypValList = unitQtyTypStruct.getValList();
              _unitQtyTypNameList = unitQtyTypStruct.getExplanList();
              // オーダ状態区分のコンボボックスデータを設定
              ComboStruct odrStsTypStruct = cdac.getData("ODR_STS_TYP");
              _odrStsTypValList = odrStsTypStruct.getValList();
              _odrStsTypNameList = odrStsTypStruct.getExplanList();
              // デマンド状態区分のコンボボックスデータを設定
              ComboStruct dmStsTypStruct = cdac.getData("DM_STS_TYP");
              _dmStsTypValList = dmStsTypStruct.getValList();
              _dmStsTypNameList = dmStsTypStruct.getExplanList();
              // オーダデマンド区分のコンボボックスデータを設定
              ComboStruct odTypStruct = cdac.getData("OD_TYP");
              _odTypValList = odTypStruct.getValList();
              _odTypNameList = odTypStruct.getExplanList();
              // 所要量発生処理区分のコンボボックスデータを設定
              ComboStruct odGnrTypStruct = cdac.getData("OD_GNR_TYP");
              _odGnrTypValList = odGnrTypStruct.getValList();
              _odGnrTypNameList = odGnrTypStruct.getExplanList();
              // 工数管理品目区分のコンボボックスデータを設定
              ComboStruct manhourTypStruct = cdac.getData("MANHOUR_TYP");
              _manhourTypValList = manhourTypStruct.getValList();
              _manhourTypNameList = manhourTypStruct.getExplanList();
              //Add Anken Start 20140417 song-yy
              // 作業実績区分のコンボボックスデータを設定
              ComboStruct oprTypStruct = cdac.getData("OPR_RSLT_TYP");
              _oprTypValList  = oprTypStruct.getValList();
              _oprTypNameList = oprTypStruct.getExplanList();
              
              // 支給区分のコンボボックスデータを設定
              ComboStruct consTypStruct = cdac.getData("CONS_TYP");
              _consTypValList  = consTypStruct.getValList();
              _consTypNameList = consTypStruct.getExplanList();
              
              // 原価積上区分のコンボボックスデータを設定
              ComboStruct costupTypStruct = cdac.getData("COST_UP_TYP");
              _costupTypValList  = costupTypStruct.getValList();
              _costupTypNameList = costupTypStruct.getExplanList();
              
              // 所要量展開区分のコンボボックスデータを設定
              ComboStruct mrpexpTypStruct = cdac.getData("MRP_EXP_TYP");
              _mrpexpTypValList  = mrpexpTypStruct.getValList();
              _mrpexpTypNameList = mrpexpTypStruct.getExplanList();
              //Add Anken End   20140417 song-yy
              
              PrivateConfig pc = new PrivateConfig(conn);
              // 最大展開レベルを取得
              Integer maxLevel = pc.getNumber("MAX_DISPLAY_OD_LEVEL");
              if (maxLevel == null) {
                  ExpjMessage emsg = new ExpjMessage("ZZ06001");
                  sysLog.severe(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", "SYS_PARAMETER.NAME:MAX_DISPLAY_OD_LEVEL");
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw new NoDataException();
              }
              _maxDisplayLevel = maxLevel.intValue();

              // 初期展開レベルを取得
              Integer initLevel = pc.getNumber("INIT_DISPLAY_OD_LEVEL");
              if (initLevel == null) {
                  ExpjMessage emsg = new ExpjMessage("ZZ06001");
                  sysLog.severe(emsg, getsysUSER_CD());
                  emsg = new ExpjMessage("ZZ01006", "SYS_PARAMETER.NAME:INIT_DISPLAY_OD_LEVEL");
                  sysLog.severe(emsg, getsysUSER_CD());
                  throw new NoDataException();
              }
              _initDisplayLevel = initLevel.intValue();

              // 最大読込行数を設定
              _maxRead = sp.getMaxLine(conn, 10);

          } catch (NoDataException e) {
              throw new ExpjException(e, "ZZ06001");
          } catch (SQLException e) {
              throw new ExpjException(e);
          }

                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AC0120010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("append") ) {
				controlappend();
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("PeekerItemCd") ) {
				controlPeekerItemCd();
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("cancelSub1") ) {
				controlcancelSub1();
			} else if( button.equals("ShowDetail") ) {
				controlShowDetail();
			} else if( button.equals("AddTree") ) {
				controlAddTree();
			} else if( button.equals("selectSub1") ) {
				controlselectSub1();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
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
//			throw new FoundationException("AC0120010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0120010-E999","CSVの出力処理"));
			throw new FoundationException("AC0120010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0120010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0120010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0120010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0120010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0120010Entity entity;
	protected AC0120010Struct struct;
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

		entity = new AC0120010Entity();
		struct = new AC0120010Struct();

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
	 * AC0120010クラスの標準コンストラクタ
	 */
	public AC0120010Control() throws BusinessProcessException, FoundationException
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
				AC0120010Struct key = (AC0120010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("InitLevel") && key.getInitLevel() != null) {
					msgKey.setKeyValue("InitLevel", key.getInitLevel());
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
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN") && key.getOUTSIDE_TYP_DN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DN", key.getOUTSIDE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN") && key.getUNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_DN", key.getUNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN") && key.getODR_STS_TYP_DN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DN", key.getODR_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN") && key.getDM_STS_TYP_DN() != null) {
					msgKey.setKeyValue("DM_STS_TYP_DN", key.getDM_STS_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP_DN") && key.getOD_TYP_DN() != null) {
					msgKey.setKeyValue("OD_TYP_DN", key.getOD_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("Sub1_OUTSIDE_TYP_name") && key.getSub1_OUTSIDE_TYP_name() != null) {
					msgKey.setKeyValue("Sub1_OUTSIDE_TYP_name", key.getSub1_OUTSIDE_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("Sub1_OUTSIDE_TYP_val") && key.getSub1_OUTSIDE_TYP_val() != null) {
					msgKey.setKeyValue("Sub1_OUTSIDE_TYP_val", key.getSub1_OUTSIDE_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("Sub1_MRP_ODR_TYP_DN") && key.getSub1_MRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("Sub1_MRP_ODR_TYP_DN", key.getSub1_MRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("Sub1_UNIT_QTY_TYP_DN") && key.getSub1_UNIT_QTY_TYP_DN() != null) {
					msgKey.setKeyValue("Sub1_UNIT_QTY_TYP_DN", key.getSub1_UNIT_QTY_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("AC0120010tree1") && key.getAC0120010tree1() != null) {
					msgKey.setKeyValue("AC0120010tree1", key.getAC0120010tree1());
				}
				if(msgKeyType.containsKeyColumn("c_JOB_ODR_DEL") && key.getc_JOB_ODR_DEL() != null) {
					msgKey.setKeyValue("c_JOB_ODR_DEL", key.getc_JOB_ODR_DEL());
				}
				if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE") && key.geth_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("h_BUSINESS_OPR_DATE", key.geth_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP_DN") && key.getOD_GNR_TYP_DN() != null) {
					msgKey.setKeyValue("OD_GNR_TYP_DN", key.getOD_GNR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("Sub1_DUE_TIME") && key.getSub1_DUE_TIME() != null) {
					msgKey.setKeyValue("Sub1_DUE_TIME", key.getSub1_DUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("Sub1_DUE_TIME2") && key.getSub1_DUE_TIME2() != null) {
					msgKey.setKeyValue("Sub1_DUE_TIME2", key.getSub1_DUE_TIME2());
				}
				if(msgKeyType.containsKeyColumn("Sub1_DUE_TIME3") && key.getSub1_DUE_TIME3() != null) {
					msgKey.setKeyValue("Sub1_DUE_TIME3", key.getSub1_DUE_TIME3());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PRD_DUE_TIME") && key.getSub1_PRD_DUE_TIME() != null) {
					msgKey.setKeyValue("Sub1_PRD_DUE_TIME", key.getSub1_PRD_DUE_TIME());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PRD_START_TIME") && key.getSub1_PRD_START_TIME() != null) {
					msgKey.setKeyValue("Sub1_PRD_START_TIME", key.getSub1_PRD_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("Sub1_ODR_START_TIME") && key.getSub1_ODR_START_TIME() != null) {
					msgKey.setKeyValue("Sub1_ODR_START_TIME", key.getSub1_ODR_START_TIME());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP_DN") && key.getMANHOUR_TYP_DN() != null) {
					msgKey.setKeyValue("MANHOUR_TYP_DN", key.getMANHOUR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN") && key.getOPR_RSLT_TYP_DN() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP_DN", key.getOPR_RSLT_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP1") && key.getJOB_ODR_STS_TYP1() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP1", key.getJOB_ODR_STS_TYP1());
				}
				if(msgKeyType.containsKeyColumn("h_DM_STS_TYP") && key.geth_DM_STS_TYP() != null) {
					msgKey.setKeyValue("h_DM_STS_TYP", key.geth_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_STS_TYP") && key.geth_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("h_ODR_STS_TYP", key.geth_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_size") && key.geth_size() != null) {
					msgKey.setKeyValue("h_size", key.geth_size());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name") && key.getMRP_ODR_TYP_name() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_name", key.getMRP_ODR_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val") && key.getMRP_ODR_TYP_val() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_val", key.getMRP_ODR_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_name") && key.getUNIT_QTY_TYP_name() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_name", key.getUNIT_QTY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_val") && key.getUNIT_QTY_TYP_val() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP_val", key.getUNIT_QTY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN") && key.getJOB_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP_DN", key.getJOB_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN") && key.getMRP_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP_DN", key.getMRP_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("OD_NO") && key.getOD_NO() != null) {
					msgKey.setKeyValue("OD_NO", key.getOD_NO());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP") && key.getOD_TYP() != null) {
					msgKey.setKeyValue("OD_TYP", key.getOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP") && key.getODR_STS_TYP() != null) {
					msgKey.setKeyValue("ODR_STS_TYP", key.getODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("DM_STS_TYP") && key.getDM_STS_TYP() != null) {
					msgKey.setKeyValue("DM_STS_TYP", key.getDM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_ODR_TYP") && key.getMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("MRP_ODR_TYP", key.getMRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("MRP_TYP") && key.getMRP_TYP() != null) {
					msgKey.setKeyValue("MRP_TYP", key.getMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub1_OUTSIDE_TYP") && key.getSub1_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("Sub1_OUTSIDE_TYP", key.getSub1_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP") && key.getJOB_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_STS_TYP", key.getJOB_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP") && key.getJOB_ODR_EXP_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_EXP_TYP", key.getJOB_ODR_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("MANHOUR_TYP") && key.getMANHOUR_TYP() != null) {
					msgKey.setKeyValue("MANHOUR_TYP", key.getMANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_RCV_QTY") && key.getTOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("TOTAL_RCV_QTY", key.getTOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY") && key.getTOTAL_ISSUE_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ISSUE_QTY", key.getTOTAL_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO") && key.getJOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_CANCEL_NO", key.getJOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OD_NO") && key.getPARENT_OD_NO() != null) {
					msgKey.setKeyValue("PARENT_OD_NO", key.getPARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("CHIID_OD_NO") && key.getCHIID_OD_NO() != null) {
					msgKey.setKeyValue("CHIID_OD_NO", key.getCHIID_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_TYP") && key.getJOB_ODR_TYP() != null) {
					msgKey.setKeyValue("JOB_ODR_TYP", key.getJOB_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ALC_GRP_CD") && key.getALC_GRP_CD() != null) {
					msgKey.setKeyValue("ALC_GRP_CD", key.getALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("Detail_ITEM_NAME") && key.getDetail_ITEM_NAME() != null) {
					msgKey.setKeyValue("Detail_ITEM_NAME", key.getDetail_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP") && key.getOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP", key.getOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("ITEM_SPOIL") && key.getITEM_SPOIL() != null) {
					msgKey.setKeyValue("ITEM_SPOIL", key.getITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP") && key.getUNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("UNIT_QTY_TYP", key.getUNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE") && key.getJOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("JOB_ODR_DLV_DATE", key.getJOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("DUE_DATE") && key.getDUE_DATE() != null) {
					msgKey.setKeyValue("DUE_DATE", key.getDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_DUE_DATE") && key.getPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("PRD_DUE_DATE", key.getPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("PRD_START_DATE") && key.getPRD_START_DATE() != null) {
					msgKey.setKeyValue("PRD_START_DATE", key.getPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("ODR_START_DATE") && key.getODR_START_DATE() != null) {
					msgKey.setKeyValue("ODR_START_DATE", key.getODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("SUM_PUCH_ODR_QTY") && key.getSUM_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("SUM_PUCH_ODR_QTY", key.getSUM_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_OPR_INST_QTY") && key.getSUM_OPR_INST_QTY() != null) {
					msgKey.setKeyValue("SUM_OPR_INST_QTY", key.getSUM_OPR_INST_QTY());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("DM_QTY") && key.getDM_QTY() != null) {
					msgKey.setKeyValue("DM_QTY", key.getDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("SUM_ALCD_QTY") && key.getSUM_ALCD_QTY() != null) {
					msgKey.setKeyValue("SUM_ALCD_QTY", key.getSUM_ALCD_QTY());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("OD_GNR_TYP") && key.getOD_GNR_TYP() != null) {
					msgKey.setKeyValue("OD_GNR_TYP", key.getOD_GNR_TYP());
				}
				if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP") && key.getOPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("OPR_RSLT_TYP", key.getOPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PARENT_OD_NO") && key.getSub1_PARENT_OD_NO() != null) {
					msgKey.setKeyValue("Sub1_PARENT_OD_NO", key.getSub1_PARENT_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("Sub1_Parent_ITEM_CD") && key.getSub1_Parent_ITEM_CD() != null) {
					msgKey.setKeyValue("Sub1_Parent_ITEM_CD", key.getSub1_Parent_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1_Parent_ITEM_NAME") && key.getSub1_Parent_ITEM_NAME() != null) {
					msgKey.setKeyValue("Sub1_Parent_ITEM_NAME", key.getSub1_Parent_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_Parent_OD_LEVEL_NO") && key.geth_Sub1_Parent_OD_LEVEL_NO() != null) {
					msgKey.setKeyValue("h_Sub1_Parent_OD_LEVEL_NO", key.geth_Sub1_Parent_OD_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_Parent_OD_MODIFY_COUNT") && key.geth_Parent_OD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_Parent_OD_MODIFY_COUNT", key.geth_Parent_OD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_Parent_ODR_QTY") && key.geth_Sub1_Parent_ODR_QTY() != null) {
					msgKey.setKeyValue("h_Sub1_Parent_ODR_QTY", key.geth_Sub1_Parent_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_Parent_ODR_START_DATE") && key.geth_Sub1_Parent_ODR_START_DATE() != null) {
					msgKey.setKeyValue("h_Sub1_Parent_ODR_START_DATE", key.geth_Sub1_Parent_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_Parent_ALC_GRP_CD") && key.geth_Sub1_Parent_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("h_Sub1_Parent_ALC_GRP_CD", key.geth_Sub1_Parent_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_ODR_STS_TYP") && key.geth_Sub1_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("h_Sub1_ODR_STS_TYP", key.geth_Sub1_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_DM_STS_TYP") && key.geth_Sub1_DM_STS_TYP() != null) {
					msgKey.setKeyValue("h_Sub1_DM_STS_TYP", key.geth_Sub1_DM_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub1_Comp_ITEM_CD") && key.getSub1_Comp_ITEM_CD() != null) {
					msgKey.setKeyValue("Sub1_Comp_ITEM_CD", key.getSub1_Comp_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1_Comp_ITEM_NAME") && key.getSub1_Comp_ITEM_NAME() != null) {
					msgKey.setKeyValue("Sub1_Comp_ITEM_NAME", key.getSub1_Comp_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("Sub1_DRAW_CD") && key.getSub1_DRAW_CD() != null) {
					msgKey.setKeyValue("Sub1_DRAW_CD", key.getSub1_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1_SPEC") && key.getSub1_SPEC() != null) {
					msgKey.setKeyValue("Sub1_SPEC", key.getSub1_SPEC());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_MRP_ODR_TYP") && key.geth_Sub1_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("h_Sub1_MRP_ODR_TYP", key.geth_Sub1_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub1_ITEM_SPOIL") && key.getSub1_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("Sub1_ITEM_SPOIL", key.getSub1_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_SPOIL") && key.getSub1_PS_SPOIL() != null) {
					msgKey.setKeyValue("Sub1_PS_SPOIL", key.getSub1_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_UNIT_QTY_TYP") && key.geth_Sub1_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_Sub1_UNIT_QTY_TYP", key.geth_Sub1_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub1_DUE_DATE") && key.getSub1_DUE_DATE() != null) {
					msgKey.setKeyValue("Sub1_DUE_DATE", key.getSub1_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PRD_DUE_DATE") && key.getSub1_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("Sub1_PRD_DUE_DATE", key.getSub1_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PRD_START_DATE") && key.getSub1_PRD_START_DATE() != null) {
					msgKey.setKeyValue("Sub1_PRD_START_DATE", key.getSub1_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_ODR_START_DATE") && key.getSub1_ODR_START_DATE() != null) {
					msgKey.setKeyValue("Sub1_ODR_START_DATE", key.getSub1_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_ODR_QTY") && key.getSub1_ODR_QTY() != null) {
					msgKey.setKeyValue("Sub1_ODR_QTY", key.getSub1_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("Sub1_DM_QTY") && key.getSub1_DM_QTY() != null) {
					msgKey.setKeyValue("Sub1_DM_QTY", key.getSub1_DM_QTY());
				}
				if(msgKeyType.containsKeyColumn("Sub1_STOCK_UNIT") && key.getSub1_STOCK_UNIT() != null) {
					msgKey.setKeyValue("Sub1_STOCK_UNIT", key.getSub1_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_DENOMINATOR") && key.getSub1_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("Sub1_PS_UNIT_DENOMINATOR", key.getSub1_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_NUMERATOR") && key.getSub1_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("Sub1_PS_UNIT_NUMERATOR", key.getSub1_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("ODR_LT") && key.getODR_LT() != null) {
					msgKey.setKeyValue("ODR_LT", key.getODR_LT());
				}
				if(msgKeyType.containsKeyColumn("FIXED_LT") && key.getFIXED_LT() != null) {
					msgKey.setKeyValue("FIXED_LT", key.getFIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LT") && key.getPROP_LT() != null) {
					msgKey.setKeyValue("PROP_LT", key.getPROP_LT());
				}
				if(msgKeyType.containsKeyColumn("SAFETY_LT") && key.getSAFETY_LT() != null) {
					msgKey.setKeyValue("SAFETY_LT", key.getSAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_LT") && key.getISSUE_LT() != null) {
					msgKey.setKeyValue("ISSUE_LT", key.getISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE") && key.getPROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("PROP_LOT_SIZE", key.getPROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("h_Comp_ITEM_MODIFY_COUNT") && key.geth_Comp_ITEM_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_Comp_ITEM_MODIFY_COUNT", key.geth_Comp_ITEM_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("Sub1_OD_TYP") && key.getSub1_OD_TYP() != null) {
					msgKey.setKeyValue("Sub1_OD_TYP", key.getSub1_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_PS_UNIT_QTY") && key.geth_Sub1_PS_UNIT_QTY() != null) {
					msgKey.setKeyValue("h_Sub1_PS_UNIT_QTY", key.geth_Sub1_PS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_OD_MODIFY_COUNT") && key.geth_Sub1_OD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_Sub1_OD_MODIFY_COUNT", key.geth_Sub1_OD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_MANHOUR_TYP") && key.geth_Sub1_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_Sub1_MANHOUR_TYP", key.geth_Sub1_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO") && key.getJOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("JOB_ODR_DETAIL_NO", key.getJOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("L_Sub1_DUE_DATE") && key.getL_Sub1_DUE_DATE() != null) {
					msgKey.setKeyValue("L_Sub1_DUE_DATE", key.getL_Sub1_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("L_Sub1_ODR_START_DATE") && key.getL_Sub1_ODR_START_DATE() != null) {
					msgKey.setKeyValue("L_Sub1_ODR_START_DATE", key.getL_Sub1_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("L_Sub1_PRD_DUE_DATE") && key.getL_Sub1_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("L_Sub1_PRD_DUE_DATE", key.getL_Sub1_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("L_Sub1_PRD_START_DATE") && key.getL_Sub1_PRD_START_DATE() != null) {
					msgKey.setKeyValue("L_Sub1_PRD_START_DATE", key.getL_Sub1_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("Sub1_MRP_ODR_TYP") && key.getSub1_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("Sub1_MRP_ODR_TYP", key.getSub1_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_TYP") && key.getISSUE_TYP() != null) {
					msgKey.setKeyValue("ISSUE_TYP", key.getISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_QTY") && key.getSub1_PS_UNIT_QTY() != null) {
					msgKey.setKeyValue("Sub1_PS_UNIT_QTY", key.getSub1_PS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("OD_LEVEL_NO") && key.getOD_LEVEL_NO() != null) {
					msgKey.setKeyValue("OD_LEVEL_NO", key.getOD_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE") && key.getEFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_IN_DATE", key.getEFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE") && key.getEFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("EFF_PHASE_OUT_DATE", key.getEFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("setDM_QTY") && key.getsetDM_QTY() != null) {
					msgKey.setKeyValue("setDM_QTY", key.getsetDM_QTY());
				}
				if(msgKeyType.containsKeyColumn("setOUTSIDE_TYP") && key.getsetOUTSIDE_TYP() != null) {
					msgKey.setKeyValue("setOUTSIDE_TYP", key.getsetOUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("setPS_UNIT_QTY") && key.getsetPS_UNIT_QTY() != null) {
					msgKey.setKeyValue("setPS_UNIT_QTY", key.getsetPS_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("setPS_SPOIL") && key.getsetPS_SPOIL() != null) {
					msgKey.setKeyValue("setPS_SPOIL", key.getsetPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("setPS_UNIT_DENOMINATOR") && key.getsetPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("setPS_UNIT_DENOMINATOR", key.getsetPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("setPS_UNIT_NUMERATOR") && key.getsetPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("setPS_UNIT_NUMERATOR", key.getsetPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("setMRP_TYP") && key.getsetMRP_TYP() != null) {
					msgKey.setKeyValue("setMRP_TYP", key.getsetMRP_TYP());
				}
				if(msgKeyType.containsKeyColumn("setITEM_SPOIL") && key.getsetITEM_SPOIL() != null) {
					msgKey.setKeyValue("setITEM_SPOIL", key.getsetITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("setOD_NO") && key.getsetOD_NO() != null) {
					msgKey.setKeyValue("setOD_NO", key.getsetOD_NO());
				}
				if(msgKeyType.containsKeyColumn("h_Sub1_ISSUE_TYP") && key.geth_Sub1_ISSUE_TYP() != null) {
					msgKey.setKeyValue("h_Sub1_ISSUE_TYP", key.geth_Sub1_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("CAL_NO") && key.getCAL_NO() != null) {
					msgKey.setKeyValue("CAL_NO", key.getCAL_NO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT") && key.getITEM_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("ITEM_MODIFY_COUNT", key.getITEM_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT") && key.getOD_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("OD_MODIFY_COUNT", key.getOD_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PROC_CD") && key.getPROC_CD() != null) {
					msgKey.setKeyValue("PROC_CD", key.getPROC_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("COMPANY_CD") && key.getCOMPANY_CD() != null) {
					msgKey.setKeyValue("COMPANY_CD", key.getCOMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("setDUE_DATE") && key.getsetDUE_DATE() != null) {
					msgKey.setKeyValue("setDUE_DATE", key.getsetDUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("setPRD_DUE_DATE") && key.getsetPRD_DUE_DATE() != null) {
					msgKey.setKeyValue("setPRD_DUE_DATE", key.getsetPRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("setPRD_START_DATE") && key.getsetPRD_START_DATE() != null) {
					msgKey.setKeyValue("setPRD_START_DATE", key.getsetPRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("setODR_START_DATE") && key.getsetODR_START_DATE() != null) {
					msgKey.setKeyValue("setODR_START_DATE", key.getsetODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("setODR_QTY") && key.getsetODR_QTY() != null) {
					msgKey.setKeyValue("setODR_QTY", key.getsetODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("setOD_TYP") && key.getsetOD_TYP() != null) {
					msgKey.setKeyValue("setOD_TYP", key.getsetOD_TYP());
				}
				if(msgKeyType.containsKeyColumn("setODR_STS_TYP") && key.getsetODR_STS_TYP() != null) {
					msgKey.setKeyValue("setODR_STS_TYP", key.getsetODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("MIN_CAL_DATE") && key.getMIN_CAL_DATE() != null) {
					msgKey.setKeyValue("MIN_CAL_DATE", key.getMIN_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("MAX_CAL_DATE") && key.getMAX_CAL_DATE() != null) {
					msgKey.setKeyValue("MAX_CAL_DATE", key.getMAX_CAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("OD_CALC_FLG") && key.getOD_CALC_FLG() != null) {
					msgKey.setKeyValue("OD_CALC_FLG", key.getOD_CALC_FLG());
				}
				if(msgKeyType.containsKeyColumn("TIME_CTRL") && key.getTIME_CTRL() != null) {
					msgKey.setKeyValue("TIME_CTRL", key.getTIME_CTRL());
				}
				if(msgKeyType.containsKeyColumn("WORK_ODR_CD") && key.getWORK_ODR_CD() != null) {
					msgKey.setKeyValue("WORK_ODR_CD", key.getWORK_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_STS_TYP") && key.getWORK_STS_TYP() != null) {
					msgKey.setKeyValue("WORK_STS_TYP", key.getWORK_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("WS_CD") && key.getWS_CD() != null) {
					msgKey.setKeyValue("WS_CD", key.getWS_CD());
				}
				if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG") && key.getPROC_EXPLOSION_FLG() != null) {
					msgKey.setKeyValue("PROC_EXPLOSION_FLG", key.getPROC_EXPLOSION_FLG());
				}
				if(msgKeyType.containsKeyColumn("Sub1_PUCH_ODR_CD") && key.getSub1_PUCH_ODR_CD() != null) {
					msgKey.setKeyValue("Sub1_PUCH_ODR_CD", key.getSub1_PUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1_COMPANY_CD") && key.getSub1_COMPANY_CD() != null) {
					msgKey.setKeyValue("Sub1_COMPANY_CD", key.getSub1_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1_VEND_CD") && key.getSub1_VEND_CD() != null) {
					msgKey.setKeyValue("Sub1_VEND_CD", key.getSub1_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP") && key.getPUCH_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("PUCH_ODR_STS_TYP", key.getPUCH_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("COUNT") && key.getCOUNT() != null) {
					msgKey.setKeyValue("COUNT", key.getCOUNT());
				}
				if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG") && key.getFINAL_PROC_FLG() != null) {
					msgKey.setKeyValue("FINAL_PROC_FLG", key.getFINAL_PROC_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPR_INST_CD") && key.getOPR_INST_CD() != null) {
					msgKey.setKeyValue("OPR_INST_CD", key.getOPR_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD") && key.getWORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("WORK_IN_PROC_CD", key.getWORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_ACPT_QTY") && key.getTOTAL_ACPT_QTY() != null) {
					msgKey.setKeyValue("TOTAL_ACPT_QTY", key.getTOTAL_ACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_DEFECT_QTY") && key.getTOTAL_DEFECT_QTY() != null) {
					msgKey.setKeyValue("TOTAL_DEFECT_QTY", key.getTOTAL_DEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ACPT_QTY") && key.getACPT_QTY() != null) {
					msgKey.setKeyValue("ACPT_QTY", key.getACPT_QTY());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_CD") && key.getPUCH_ODR_CD() != null) {
					msgKey.setKeyValue("PUCH_ODR_CD", key.getPUCH_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_INST_CD") && key.getISSUE_INST_CD() != null) {
					msgKey.setKeyValue("ISSUE_INST_CD", key.getISSUE_INST_CD());
				}
				if(msgKeyType.containsKeyColumn("Sub1_WORK_IN_PROC_CD") && key.getSub1_WORK_IN_PROC_CD() != null) {
					msgKey.setKeyValue("Sub1_WORK_IN_PROC_CD", key.getSub1_WORK_IN_PROC_CD());
				}
				if(msgKeyType.containsKeyColumn("WH_CD") && key.getWH_CD() != null) {
					msgKey.setKeyValue("WH_CD", key.getWH_CD());
				}
				if(msgKeyType.containsKeyColumn("CONS_TYP") && key.getCONS_TYP() != null) {
					msgKey.setKeyValue("CONS_TYP", key.getCONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("ONEROUS_FLG") && key.getONEROUS_FLG() != null) {
					msgKey.setKeyValue("ONEROUS_FLG", key.getONEROUS_FLG());
				}
				if(msgKeyType.containsKeyColumn("SysPLANT_CD") && key.getSysPLANT_CD() != null) {
					msgKey.setKeyValue("SysPLANT_CD", key.getSysPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("MY_COMPANY") && key.getMY_COMPANY() != null) {
					msgKey.setKeyValue("MY_COMPANY", key.getMY_COMPANY());
				}
				if(msgKeyType.containsKeyColumn("PVEND_CD") && key.getPVEND_CD() != null) {
					msgKey.setKeyValue("PVEND_CD", key.getPVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON") && key.getPUCH_ODR_PERSON() != null) {
					msgKey.setKeyValue("PUCH_ODR_PERSON", key.getPUCH_ODR_PERSON());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP") && key.getUNIT_COST_TYP() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP", key.getUNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST") && key.getUNIT_COST() != null) {
					msgKey.setKeyValue("UNIT_COST", key.getUNIT_COST());
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
				if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT") && key.getPUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("PUCH_ODR_AMOUNT", key.getPUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP") && key.getSPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("SPL_ITEM_TYP", key.getSPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP") && key.getACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("ACPT_INSPC_TYP", key.getACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("EXCH_RATE") && key.getEXCH_RATE() != null) {
					msgKey.setKeyValue("EXCH_RATE", key.getEXCH_RATE());
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
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1") && key.getTAX_AMOUNT_1() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_1", key.getTAX_AMOUNT_1());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2") && key.getTAX_AMOUNT_2() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_2", key.getTAX_AMOUNT_2());
				}
				if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3") && key.getTAX_AMOUNT_3() != null) {
					msgKey.setKeyValue("TAX_AMOUNT_3", key.getTAX_AMOUNT_3());
				}
				if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX") && key.getAMOUNT_INCLUDE_TAX() != null) {
					msgKey.setKeyValue("AMOUNT_INCLUDE_TAX", key.getAMOUNT_INCLUDE_TAX());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT") && key.getHOME_CUR_AMOUNT() != null) {
					msgKey.setKeyValue("HOME_CUR_AMOUNT", key.getHOME_CUR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP") && key.getTAX_ROUND_TYP() != null) {
					msgKey.setKeyValue("TAX_ROUND_TYP", key.getTAX_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("WH_CD1") && key.getWH_CD1() != null) {
					msgKey.setKeyValue("WH_CD1", key.getWH_CD1());
				}
				if(msgKeyType.containsKeyColumn("WH_CD2") && key.getWH_CD2() != null) {
					msgKey.setKeyValue("WH_CD2", key.getWH_CD2());
				}
				if(msgKeyType.containsKeyColumn("WH_CD3") && key.getWH_CD3() != null) {
					msgKey.setKeyValue("WH_CD3", key.getWH_CD3());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME") && key.getOWN_PERSON_NAME() != null) {
					msgKey.setKeyValue("OWN_PERSON_NAME", key.getOWN_PERSON_NAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME") && key.getPVC2BUSINESSNAME() != null) {
					msgKey.setKeyValue("PVC2BUSINESSNAME", key.getPVC2BUSINESSNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH") && key.getPVC2OUTPUTPATH() != null) {
					msgKey.setKeyValue("PVC2OUTPUTPATH", key.getPVC2OUTPUTPATH());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME") && key.getPVC2OUTPUTNAME() != null) {
					msgKey.setKeyValue("PVC2OUTPUTNAME", key.getPVC2OUTPUTNAME());
				}
				if(msgKeyType.containsKeyColumn("PVC2LOGMODE") && key.getPVC2LOGMODE() != null) {
					msgKey.setKeyValue("PVC2LOGMODE", key.getPVC2LOGMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE") && key.getPVC2OUTPUTMODE() != null) {
					msgKey.setKeyValue("PVC2OUTPUTMODE", key.getPVC2OUTPUTMODE());
				}
				if(msgKeyType.containsKeyColumn("PVC2USERID") && key.getPVC2USERID() != null) {
					msgKey.setKeyValue("PVC2USERID", key.getPVC2USERID());
				}
				if(msgKeyType.containsKeyColumn("PVC2PLANTCD") && key.getPVC2PLANTCD() != null) {
					msgKey.setKeyValue("PVC2PLANTCD", key.getPVC2PLANTCD());
				}
				if(msgKeyType.containsKeyColumn("PVC2TAXID") && key.getPVC2TAXID() != null) {
					msgKey.setKeyValue("PVC2TAXID", key.getPVC2TAXID());
				}
				if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG") && key.getVEND_DECIMAL_FIG() != null) {
					msgKey.setKeyValue("VEND_DECIMAL_FIG", key.getVEND_DECIMAL_FIG());
				}
				if(msgKeyType.containsKeyColumn("NET_AMOUNT") && key.getNET_AMOUNT() != null) {
					msgKey.setKeyValue("NET_AMOUNT", key.getNET_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT") && key.getPNUMTAXOUTAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXOUTAMOUNT", key.getPNUMTAXOUTAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT") && key.getPNUMTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXAMOUNT", key.getPNUMTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT") && key.getPNUMEXTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXSALESAMOUNT", key.getPNUMEXTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT") && key.getPNUMINTERNALTAXSALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXSALESAMOUNT", key.getPNUMINTERNALTAXSALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT") && key.getPNUMTAXFREESALESAMOUNT() != null) {
					msgKey.setKeyValue("PNUMTAXFREESALESAMOUNT", key.getPNUMTAXFREESALESAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT") && key.getPNUMEXTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMEXTERNALTAXAMOUNT", key.getPNUMEXTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT") && key.getPNUMINTERNALTAXAMOUNT() != null) {
					msgKey.setKeyValue("PNUMINTERNALTAXAMOUNT", key.getPNUMINTERNALTAXAMOUNT());
				}
				if(msgKeyType.containsKeyColumn("PVC2ERRCD") && key.getPVC2ERRCD() != null) {
					msgKey.setKeyValue("PVC2ERRCD", key.getPVC2ERRCD());
				}
				if(msgKeyType.containsKeyColumn("PNUMSTATUS") && key.getPNUMSTATUS() != null) {
					msgKey.setKeyValue("PNUMSTATUS", key.getPNUMSTATUS());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME") && key.getPARENT_ITEM_NAME() != null) {
					msgKey.setKeyValue("PARENT_ITEM_NAME", key.getPARENT_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("PARENT_DRAW_CD") && key.getPARENT_DRAW_CD() != null) {
					msgKey.setKeyValue("PARENT_DRAW_CD", key.getPARENT_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("PARENT_SPEC") && key.getPARENT_SPEC() != null) {
					msgKey.setKeyValue("PARENT_SPEC", key.getPARENT_SPEC());
				}
				if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP") && key.getPARENT_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("PARENT_OUTSIDE_TYP", key.getPARENT_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR") && key.getPS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_DENOMINATOR", key.getPS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR") && key.getPS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("PS_UNIT_NUMERATOR", key.getPS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("PS_SPOIL") && key.getPS_SPOIL() != null) {
					msgKey.setKeyValue("PS_SPOIL", key.getPS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("PS_LT_FLG") && key.getPS_LT_FLG() != null) {
					msgKey.setKeyValue("PS_LT_FLG", key.getPS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("PS_KEY") && key.getPS_KEY() != null) {
					msgKey.setKeyValue("PS_KEY", key.getPS_KEY());
				}
				if(msgKeyType.containsKeyColumn("CHILD_ITEM_NAME") && key.getCHILD_ITEM_NAME() != null) {
					msgKey.setKeyValue("CHILD_ITEM_NAME", key.getCHILD_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("CHILD_DRAW_CD") && key.getCHILD_DRAW_CD() != null) {
					msgKey.setKeyValue("CHILD_DRAW_CD", key.getCHILD_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("CHILD_SPEC") && key.getCHILD_SPEC() != null) {
					msgKey.setKeyValue("CHILD_SPEC", key.getCHILD_SPEC());
				}
				if(msgKeyType.containsKeyColumn("CHILD_OUTSIDE_TYP") && key.getCHILD_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("CHILD_OUTSIDE_TYP", key.getCHILD_OUTSIDE_TYP());
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
					AC0120010Struct key = new AC0120010Struct();
					if(msgKeyType.containsKeyColumn("InitLevel")) {
						key.setInitLevel(msgKey.getKeyValue("InitLevel"));
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
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DN")) {
						key.setOUTSIDE_TYP_DN(msgKey.getKeyValue("OUTSIDE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_DN")) {
						key.setUNIT_QTY_TYP_DN(msgKey.getKeyValue("UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DN")) {
						key.setODR_STS_TYP_DN(msgKey.getKeyValue("ODR_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP_DN")) {
						key.setDM_STS_TYP_DN(msgKey.getKeyValue("DM_STS_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP_DN")) {
						key.setOD_TYP_DN(msgKey.getKeyValue("OD_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_OUTSIDE_TYP_name")) {
						key.setSub1_OUTSIDE_TYP_name(msgKey.getKeyValue("Sub1_OUTSIDE_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_OUTSIDE_TYP_val")) {
						key.setSub1_OUTSIDE_TYP_val(msgKey.getKeyValue("Sub1_OUTSIDE_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_MRP_ODR_TYP_DN")) {
						key.setSub1_MRP_ODR_TYP_DN(msgKey.getKeyValue("Sub1_MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_UNIT_QTY_TYP_DN")) {
						key.setSub1_UNIT_QTY_TYP_DN(msgKey.getKeyValue("Sub1_UNIT_QTY_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("AC0120010tree1")) {
						key.setAC0120010tree1(msgKey.getKeyValue("AC0120010tree1"));
					}
					if(msgKeyType.containsKeyColumn("c_JOB_ODR_DEL")) {
						key.setc_JOB_ODR_DEL(msgKey.getKeyValue("c_JOB_ODR_DEL"));
					}
					if(msgKeyType.containsKeyColumn("h_BUSINESS_OPR_DATE")) {
						key.seth_BUSINESS_OPR_DATE(msgKey.getKeyValue("h_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP_DN")) {
						key.setOD_GNR_TYP_DN(msgKey.getKeyValue("OD_GNR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_DUE_TIME")) {
						key.setSub1_DUE_TIME(msgKey.getKeyValue("Sub1_DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_DUE_TIME2")) {
						key.setSub1_DUE_TIME2(msgKey.getKeyValue("Sub1_DUE_TIME2"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_DUE_TIME3")) {
						key.setSub1_DUE_TIME3(msgKey.getKeyValue("Sub1_DUE_TIME3"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PRD_DUE_TIME")) {
						key.setSub1_PRD_DUE_TIME(msgKey.getKeyValue("Sub1_PRD_DUE_TIME"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PRD_START_TIME")) {
						key.setSub1_PRD_START_TIME(msgKey.getKeyValue("Sub1_PRD_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_ODR_START_TIME")) {
						key.setSub1_ODR_START_TIME(msgKey.getKeyValue("Sub1_ODR_START_TIME"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP_DN")) {
						key.setMANHOUR_TYP_DN(msgKey.getKeyValue("MANHOUR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP_DN")) {
						key.setOPR_RSLT_TYP_DN(msgKey.getKeyValue("OPR_RSLT_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP1")) {
						key.setJOB_ODR_STS_TYP1(msgKey.getKeyValue("JOB_ODR_STS_TYP1"));
					}
					if(msgKeyType.containsKeyColumn("h_DM_STS_TYP")) {
						key.seth_DM_STS_TYP(msgKey.getKeyValue("h_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_STS_TYP")) {
						key.seth_ODR_STS_TYP(msgKey.getKeyValue("h_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_size")) {
						key.seth_size(msgKey.getKeyValue("h_size"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_name")) {
						key.setMRP_ODR_TYP_name(msgKey.getKeyValue("MRP_ODR_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_val")) {
						key.setMRP_ODR_TYP_val(msgKey.getKeyValue("MRP_ODR_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_name")) {
						key.setUNIT_QTY_TYP_name(msgKey.getKeyValue("UNIT_QTY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP_val")) {
						key.setUNIT_QTY_TYP_val(msgKey.getKeyValue("UNIT_QTY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP_DN")) {
						key.setJOB_ODR_TYP_DN(msgKey.getKeyValue("JOB_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP_DN")) {
						key.setMRP_ODR_TYP_DN(msgKey.getKeyValue("MRP_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("OD_NO")) {
						key.setOD_NO(msgKey.getKeyValue("OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP")) {
						key.setOD_TYP(msgKey.getKeyValue("OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP")) {
						key.setODR_STS_TYP(msgKey.getKeyValue("ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DM_STS_TYP")) {
						key.setDM_STS_TYP(msgKey.getKeyValue("DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_ODR_TYP")) {
						key.setMRP_ODR_TYP(msgKey.getKeyValue("MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MRP_TYP")) {
						key.setMRP_TYP(msgKey.getKeyValue("MRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_OUTSIDE_TYP")) {
						key.setSub1_OUTSIDE_TYP(msgKey.getKeyValue("Sub1_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_STS_TYP")) {
						key.setJOB_ODR_STS_TYP(msgKey.getKeyValue("JOB_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_EXP_TYP")) {
						key.setJOB_ODR_EXP_TYP(msgKey.getKeyValue("JOB_ODR_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("MANHOUR_TYP")) {
						key.setMANHOUR_TYP(msgKey.getKeyValue("MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_RCV_QTY")) {
						key.setTOTAL_RCV_QTY(msgKey.getKeyValue("TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ISSUE_QTY")) {
						key.setTOTAL_ISSUE_QTY(msgKey.getKeyValue("TOTAL_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CANCEL_NO")) {
						key.setJOB_ODR_CANCEL_NO(msgKey.getKeyValue("JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OD_NO")) {
						key.setPARENT_OD_NO(msgKey.getKeyValue("PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("CHIID_OD_NO")) {
						key.setCHIID_OD_NO(msgKey.getKeyValue("CHIID_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_TYP")) {
						key.setJOB_ODR_TYP(msgKey.getKeyValue("JOB_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ALC_GRP_CD")) {
						key.setALC_GRP_CD(msgKey.getKeyValue("ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("Detail_ITEM_NAME")) {
						key.setDetail_ITEM_NAME(msgKey.getKeyValue("Detail_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP")) {
						key.setOUTSIDE_TYP(msgKey.getKeyValue("OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_SPOIL")) {
						key.setITEM_SPOIL(msgKey.getKeyValue("ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_QTY_TYP")) {
						key.setUNIT_QTY_TYP(msgKey.getKeyValue("UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DLV_DATE")) {
						key.setJOB_ODR_DLV_DATE(msgKey.getKeyValue("JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("DUE_DATE")) {
						key.setDUE_DATE(msgKey.getKeyValue("DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_DUE_DATE")) {
						key.setPRD_DUE_DATE(msgKey.getKeyValue("PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("PRD_START_DATE")) {
						key.setPRD_START_DATE(msgKey.getKeyValue("PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ODR_START_DATE")) {
						key.setODR_START_DATE(msgKey.getKeyValue("ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("SUM_PUCH_ODR_QTY")) {
						key.setSUM_PUCH_ODR_QTY(msgKey.getKeyValue("SUM_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_OPR_INST_QTY")) {
						key.setSUM_OPR_INST_QTY(msgKey.getKeyValue("SUM_OPR_INST_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DM_QTY")) {
						key.setDM_QTY(msgKey.getKeyValue("DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("SUM_ALCD_QTY")) {
						key.setSUM_ALCD_QTY(msgKey.getKeyValue("SUM_ALCD_QTY"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("OD_GNR_TYP")) {
						key.setOD_GNR_TYP(msgKey.getKeyValue("OD_GNR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OPR_RSLT_TYP")) {
						key.setOPR_RSLT_TYP(msgKey.getKeyValue("OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PARENT_OD_NO")) {
						key.setSub1_PARENT_OD_NO(msgKey.getKeyValue("Sub1_PARENT_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_Parent_ITEM_CD")) {
						key.setSub1_Parent_ITEM_CD(msgKey.getKeyValue("Sub1_Parent_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_Parent_ITEM_NAME")) {
						key.setSub1_Parent_ITEM_NAME(msgKey.getKeyValue("Sub1_Parent_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_Parent_OD_LEVEL_NO")) {
						key.seth_Sub1_Parent_OD_LEVEL_NO(msgKey.getKeyValue("h_Sub1_Parent_OD_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_Parent_OD_MODIFY_COUNT")) {
						key.seth_Parent_OD_MODIFY_COUNT(msgKey.getKeyValue("h_Parent_OD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_Parent_ODR_QTY")) {
						key.seth_Sub1_Parent_ODR_QTY(msgKey.getKeyValue("h_Sub1_Parent_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_Parent_ODR_START_DATE")) {
						key.seth_Sub1_Parent_ODR_START_DATE(msgKey.getKeyValue("h_Sub1_Parent_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_Parent_ALC_GRP_CD")) {
						key.seth_Sub1_Parent_ALC_GRP_CD(msgKey.getKeyValue("h_Sub1_Parent_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_ODR_STS_TYP")) {
						key.seth_Sub1_ODR_STS_TYP(msgKey.getKeyValue("h_Sub1_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_DM_STS_TYP")) {
						key.seth_Sub1_DM_STS_TYP(msgKey.getKeyValue("h_Sub1_DM_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_Comp_ITEM_CD")) {
						key.setSub1_Comp_ITEM_CD(msgKey.getKeyValue("Sub1_Comp_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_Comp_ITEM_NAME")) {
						key.setSub1_Comp_ITEM_NAME(msgKey.getKeyValue("Sub1_Comp_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_DRAW_CD")) {
						key.setSub1_DRAW_CD(msgKey.getKeyValue("Sub1_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_SPEC")) {
						key.setSub1_SPEC(msgKey.getKeyValue("Sub1_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_MRP_ODR_TYP")) {
						key.seth_Sub1_MRP_ODR_TYP(msgKey.getKeyValue("h_Sub1_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_ITEM_SPOIL")) {
						key.setSub1_ITEM_SPOIL(msgKey.getKeyValue("Sub1_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_SPOIL")) {
						key.setSub1_PS_SPOIL(msgKey.getKeyValue("Sub1_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_UNIT_QTY_TYP")) {
						key.seth_Sub1_UNIT_QTY_TYP(msgKey.getKeyValue("h_Sub1_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_DUE_DATE")) {
						key.setSub1_DUE_DATE(msgKey.getKeyValue("Sub1_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PRD_DUE_DATE")) {
						key.setSub1_PRD_DUE_DATE(msgKey.getKeyValue("Sub1_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PRD_START_DATE")) {
						key.setSub1_PRD_START_DATE(msgKey.getKeyValue("Sub1_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_ODR_START_DATE")) {
						key.setSub1_ODR_START_DATE(msgKey.getKeyValue("Sub1_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_ODR_QTY")) {
						key.setSub1_ODR_QTY(msgKey.getKeyValue("Sub1_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_DM_QTY")) {
						key.setSub1_DM_QTY(msgKey.getKeyValue("Sub1_DM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_STOCK_UNIT")) {
						key.setSub1_STOCK_UNIT(msgKey.getKeyValue("Sub1_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_DENOMINATOR")) {
						key.setSub1_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("Sub1_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_NUMERATOR")) {
						key.setSub1_PS_UNIT_NUMERATOR(msgKey.getKeyValue("Sub1_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("ODR_LT")) {
						key.setODR_LT(msgKey.getKeyValue("ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("FIXED_LT")) {
						key.setFIXED_LT(msgKey.getKeyValue("FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LT")) {
						key.setPROP_LT(msgKey.getKeyValue("PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("SAFETY_LT")) {
						key.setSAFETY_LT(msgKey.getKeyValue("SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_LT")) {
						key.setISSUE_LT(msgKey.getKeyValue("ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("PROP_LOT_SIZE")) {
						key.setPROP_LOT_SIZE(msgKey.getKeyValue("PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("h_Comp_ITEM_MODIFY_COUNT")) {
						key.seth_Comp_ITEM_MODIFY_COUNT(msgKey.getKeyValue("h_Comp_ITEM_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_OD_TYP")) {
						key.setSub1_OD_TYP(msgKey.getKeyValue("Sub1_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_PS_UNIT_QTY")) {
						key.seth_Sub1_PS_UNIT_QTY(msgKey.getKeyValue("h_Sub1_PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_OD_MODIFY_COUNT")) {
						key.seth_Sub1_OD_MODIFY_COUNT(msgKey.getKeyValue("h_Sub1_OD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_MANHOUR_TYP")) {
						key.seth_Sub1_MANHOUR_TYP(msgKey.getKeyValue("h_Sub1_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_DETAIL_NO")) {
						key.setJOB_ODR_DETAIL_NO(msgKey.getKeyValue("JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("L_Sub1_DUE_DATE")) {
						key.setL_Sub1_DUE_DATE(msgKey.getKeyValue("L_Sub1_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("L_Sub1_ODR_START_DATE")) {
						key.setL_Sub1_ODR_START_DATE(msgKey.getKeyValue("L_Sub1_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("L_Sub1_PRD_DUE_DATE")) {
						key.setL_Sub1_PRD_DUE_DATE(msgKey.getKeyValue("L_Sub1_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("L_Sub1_PRD_START_DATE")) {
						key.setL_Sub1_PRD_START_DATE(msgKey.getKeyValue("L_Sub1_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_MRP_ODR_TYP")) {
						key.setSub1_MRP_ODR_TYP(msgKey.getKeyValue("Sub1_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_TYP")) {
						key.setISSUE_TYP(msgKey.getKeyValue("ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PS_UNIT_QTY")) {
						key.setSub1_PS_UNIT_QTY(msgKey.getKeyValue("Sub1_PS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("OD_LEVEL_NO")) {
						key.setOD_LEVEL_NO(msgKey.getKeyValue("OD_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_IN_DATE")) {
						key.setEFF_PHASE_IN_DATE(msgKey.getKeyValue("EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("EFF_PHASE_OUT_DATE")) {
						key.setEFF_PHASE_OUT_DATE(msgKey.getKeyValue("EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setDM_QTY")) {
						key.setsetDM_QTY(msgKey.getKeyValue("setDM_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setOUTSIDE_TYP")) {
						key.setsetOUTSIDE_TYP(msgKey.getKeyValue("setOUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setPS_UNIT_QTY")) {
						key.setsetPS_UNIT_QTY(msgKey.getKeyValue("setPS_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setPS_SPOIL")) {
						key.setsetPS_SPOIL(msgKey.getKeyValue("setPS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("setPS_UNIT_DENOMINATOR")) {
						key.setsetPS_UNIT_DENOMINATOR(msgKey.getKeyValue("setPS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("setPS_UNIT_NUMERATOR")) {
						key.setsetPS_UNIT_NUMERATOR(msgKey.getKeyValue("setPS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("setMRP_TYP")) {
						key.setsetMRP_TYP(msgKey.getKeyValue("setMRP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setITEM_SPOIL")) {
						key.setsetITEM_SPOIL(msgKey.getKeyValue("setITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("setOD_NO")) {
						key.setsetOD_NO(msgKey.getKeyValue("setOD_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_Sub1_ISSUE_TYP")) {
						key.seth_Sub1_ISSUE_TYP(msgKey.getKeyValue("h_Sub1_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("CAL_NO")) {
						key.setCAL_NO(msgKey.getKeyValue("CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_MODIFY_COUNT")) {
						key.setITEM_MODIFY_COUNT(msgKey.getKeyValue("ITEM_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("OD_MODIFY_COUNT")) {
						key.setOD_MODIFY_COUNT(msgKey.getKeyValue("OD_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PROC_CD")) {
						key.setPROC_CD(msgKey.getKeyValue("PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMPANY_CD")) {
						key.setCOMPANY_CD(msgKey.getKeyValue("COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("setDUE_DATE")) {
						key.setsetDUE_DATE(msgKey.getKeyValue("setDUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setPRD_DUE_DATE")) {
						key.setsetPRD_DUE_DATE(msgKey.getKeyValue("setPRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setPRD_START_DATE")) {
						key.setsetPRD_START_DATE(msgKey.getKeyValue("setPRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setODR_START_DATE")) {
						key.setsetODR_START_DATE(msgKey.getKeyValue("setODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("setODR_QTY")) {
						key.setsetODR_QTY(msgKey.getKeyValue("setODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setOD_TYP")) {
						key.setsetOD_TYP(msgKey.getKeyValue("setOD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setODR_STS_TYP")) {
						key.setsetODR_STS_TYP(msgKey.getKeyValue("setODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("MIN_CAL_DATE")) {
						key.setMIN_CAL_DATE(msgKey.getKeyValue("MIN_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MAX_CAL_DATE")) {
						key.setMAX_CAL_DATE(msgKey.getKeyValue("MAX_CAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("OD_CALC_FLG")) {
						key.setOD_CALC_FLG(msgKey.getKeyValue("OD_CALC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("TIME_CTRL")) {
						key.setTIME_CTRL(msgKey.getKeyValue("TIME_CTRL"));
					}
					if(msgKeyType.containsKeyColumn("WORK_ODR_CD")) {
						key.setWORK_ODR_CD(msgKey.getKeyValue("WORK_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_STS_TYP")) {
						key.setWORK_STS_TYP(msgKey.getKeyValue("WORK_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WS_CD")) {
						key.setWS_CD(msgKey.getKeyValue("WS_CD"));
					}
					if(msgKeyType.containsKeyColumn("PROC_EXPLOSION_FLG")) {
						key.setPROC_EXPLOSION_FLG(msgKey.getKeyValue("PROC_EXPLOSION_FLG"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_PUCH_ODR_CD")) {
						key.setSub1_PUCH_ODR_CD(msgKey.getKeyValue("Sub1_PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_COMPANY_CD")) {
						key.setSub1_COMPANY_CD(msgKey.getKeyValue("Sub1_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_VEND_CD")) {
						key.setSub1_VEND_CD(msgKey.getKeyValue("Sub1_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_STS_TYP")) {
						key.setPUCH_ODR_STS_TYP(msgKey.getKeyValue("PUCH_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("COUNT")) {
						key.setCOUNT(msgKey.getKeyValue("COUNT"));
					}
					if(msgKeyType.containsKeyColumn("FINAL_PROC_FLG")) {
						key.setFINAL_PROC_FLG(msgKey.getKeyValue("FINAL_PROC_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPR_INST_CD")) {
						key.setOPR_INST_CD(msgKey.getKeyValue("OPR_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("WORK_IN_PROC_CD")) {
						key.setWORK_IN_PROC_CD(msgKey.getKeyValue("WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_ACPT_QTY")) {
						key.setTOTAL_ACPT_QTY(msgKey.getKeyValue("TOTAL_ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_DEFECT_QTY")) {
						key.setTOTAL_DEFECT_QTY(msgKey.getKeyValue("TOTAL_DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_QTY")) {
						key.setACPT_QTY(msgKey.getKeyValue("ACPT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_CD")) {
						key.setPUCH_ODR_CD(msgKey.getKeyValue("PUCH_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_INST_CD")) {
						key.setISSUE_INST_CD(msgKey.getKeyValue("ISSUE_INST_CD"));
					}
					if(msgKeyType.containsKeyColumn("Sub1_WORK_IN_PROC_CD")) {
						key.setSub1_WORK_IN_PROC_CD(msgKey.getKeyValue("Sub1_WORK_IN_PROC_CD"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD")) {
						key.setWH_CD(msgKey.getKeyValue("WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("CONS_TYP")) {
						key.setCONS_TYP(msgKey.getKeyValue("CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ONEROUS_FLG")) {
						key.setONEROUS_FLG(msgKey.getKeyValue("ONEROUS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("SysPLANT_CD")) {
						key.setSysPLANT_CD(msgKey.getKeyValue("SysPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("MY_COMPANY")) {
						key.setMY_COMPANY(msgKey.getKeyValue("MY_COMPANY"));
					}
					if(msgKeyType.containsKeyColumn("PVEND_CD")) {
						key.setPVEND_CD(msgKey.getKeyValue("PVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("PUCH_ODR_PERSON")) {
						key.setPUCH_ODR_PERSON(msgKey.getKeyValue("PUCH_ODR_PERSON"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP")) {
						key.setUNIT_COST_TYP(msgKey.getKeyValue("UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST")) {
						key.setUNIT_COST(msgKey.getKeyValue("UNIT_COST"));
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
					if(msgKeyType.containsKeyColumn("PUCH_ODR_AMOUNT")) {
						key.setPUCH_ODR_AMOUNT(msgKey.getKeyValue("PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("SPL_ITEM_TYP")) {
						key.setSPL_ITEM_TYP(msgKey.getKeyValue("SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ACPT_INSPC_TYP")) {
						key.setACPT_INSPC_TYP(msgKey.getKeyValue("ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_RATE")) {
						key.setEXCH_RATE(msgKey.getKeyValue("EXCH_RATE"));
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
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_1")) {
						key.setTAX_AMOUNT_1(msgKey.getKeyValue("TAX_AMOUNT_1"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_2")) {
						key.setTAX_AMOUNT_2(msgKey.getKeyValue("TAX_AMOUNT_2"));
					}
					if(msgKeyType.containsKeyColumn("TAX_AMOUNT_3")) {
						key.setTAX_AMOUNT_3(msgKey.getKeyValue("TAX_AMOUNT_3"));
					}
					if(msgKeyType.containsKeyColumn("AMOUNT_INCLUDE_TAX")) {
						key.setAMOUNT_INCLUDE_TAX(msgKey.getKeyValue("AMOUNT_INCLUDE_TAX"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_AMOUNT")) {
						key.setHOME_CUR_AMOUNT(msgKey.getKeyValue("HOME_CUR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_ROUND_TYP")) {
						key.setTAX_ROUND_TYP(msgKey.getKeyValue("TAX_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD1")) {
						key.setWH_CD1(msgKey.getKeyValue("WH_CD1"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD2")) {
						key.setWH_CD2(msgKey.getKeyValue("WH_CD2"));
					}
					if(msgKeyType.containsKeyColumn("WH_CD3")) {
						key.setWH_CD3(msgKey.getKeyValue("WH_CD3"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_NAME")) {
						key.setOWN_PERSON_NAME(msgKey.getKeyValue("OWN_PERSON_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2BUSINESSNAME")) {
						key.setPVC2BUSINESSNAME(msgKey.getKeyValue("PVC2BUSINESSNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTPATH")) {
						key.setPVC2OUTPUTPATH(msgKey.getKeyValue("PVC2OUTPUTPATH"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTNAME")) {
						key.setPVC2OUTPUTNAME(msgKey.getKeyValue("PVC2OUTPUTNAME"));
					}
					if(msgKeyType.containsKeyColumn("PVC2LOGMODE")) {
						key.setPVC2LOGMODE(msgKey.getKeyValue("PVC2LOGMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2OUTPUTMODE")) {
						key.setPVC2OUTPUTMODE(msgKey.getKeyValue("PVC2OUTPUTMODE"));
					}
					if(msgKeyType.containsKeyColumn("PVC2USERID")) {
						key.setPVC2USERID(msgKey.getKeyValue("PVC2USERID"));
					}
					if(msgKeyType.containsKeyColumn("PVC2PLANTCD")) {
						key.setPVC2PLANTCD(msgKey.getKeyValue("PVC2PLANTCD"));
					}
					if(msgKeyType.containsKeyColumn("PVC2TAXID")) {
						key.setPVC2TAXID(msgKey.getKeyValue("PVC2TAXID"));
					}
					if(msgKeyType.containsKeyColumn("VEND_DECIMAL_FIG")) {
						key.setVEND_DECIMAL_FIG(msgKey.getKeyValue("VEND_DECIMAL_FIG"));
					}
					if(msgKeyType.containsKeyColumn("NET_AMOUNT")) {
						key.setNET_AMOUNT(msgKey.getKeyValue("NET_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXOUTAMOUNT")) {
						key.setPNUMTAXOUTAMOUNT(msgKey.getKeyValue("PNUMTAXOUTAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXAMOUNT")) {
						key.setPNUMTAXAMOUNT(msgKey.getKeyValue("PNUMTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXSALESAMOUNT")) {
						key.setPNUMEXTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXSALESAMOUNT")) {
						key.setPNUMINTERNALTAXSALESAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXSALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMTAXFREESALESAMOUNT")) {
						key.setPNUMTAXFREESALESAMOUNT(msgKey.getKeyValue("PNUMTAXFREESALESAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMEXTERNALTAXAMOUNT")) {
						key.setPNUMEXTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMEXTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PNUMINTERNALTAXAMOUNT")) {
						key.setPNUMINTERNALTAXAMOUNT(msgKey.getKeyValue("PNUMINTERNALTAXAMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("PVC2ERRCD")) {
						key.setPVC2ERRCD(msgKey.getKeyValue("PVC2ERRCD"));
					}
					if(msgKeyType.containsKeyColumn("PNUMSTATUS")) {
						key.setPNUMSTATUS(msgKey.getKeyValue("PNUMSTATUS"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_NAME")) {
						key.setPARENT_ITEM_NAME(msgKey.getKeyValue("PARENT_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_DRAW_CD")) {
						key.setPARENT_DRAW_CD(msgKey.getKeyValue("PARENT_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_SPEC")) {
						key.setPARENT_SPEC(msgKey.getKeyValue("PARENT_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_OUTSIDE_TYP")) {
						key.setPARENT_OUTSIDE_TYP(msgKey.getKeyValue("PARENT_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_DENOMINATOR")) {
						key.setPS_UNIT_DENOMINATOR(msgKey.getKeyValue("PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_UNIT_NUMERATOR")) {
						key.setPS_UNIT_NUMERATOR(msgKey.getKeyValue("PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("PS_SPOIL")) {
						key.setPS_SPOIL(msgKey.getKeyValue("PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("PS_LT_FLG")) {
						key.setPS_LT_FLG(msgKey.getKeyValue("PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PS_KEY")) {
						key.setPS_KEY(msgKey.getKeyValue("PS_KEY"));
					}
					if(msgKeyType.containsKeyColumn("CHILD_ITEM_NAME")) {
						key.setCHILD_ITEM_NAME(msgKey.getKeyValue("CHILD_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CHILD_DRAW_CD")) {
						key.setCHILD_DRAW_CD(msgKey.getKeyValue("CHILD_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("CHILD_SPEC")) {
						key.setCHILD_SPEC(msgKey.getKeyValue("CHILD_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("CHILD_OUTSIDE_TYP")) {
						key.setCHILD_OUTSIDE_TYP(msgKey.getKeyValue("CHILD_OUTSIDE_TYP"));
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
