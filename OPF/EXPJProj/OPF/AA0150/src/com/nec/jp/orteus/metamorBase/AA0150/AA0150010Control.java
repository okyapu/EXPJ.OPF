/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0150/src/com/nec/jp/orteus/metamorBase/AA0150/AA0150010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0150;

import com.nec.jp.orteus.metamorBase.AA0150.*;
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
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
    // TODO: ここにimportパッケージを記述してください
import com.nec.jp.orteus.expj.util.PrivateConfig;
import java.io.*;
import java.math.BigDecimal;
import com.nec.jp.orteus.metamorBase.common01.util.IntegerConverter;
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AA0150010Control クラス
 * 品目データ取込処理
 *
 * 修正履歴
 * (2015/08/03), EJaSCM／EJa機能強化対応
 */
//}}user_implement_code_header

public class AA0150010Control
{

	//////////////////////////////
	// アクセサメソッド等を定義します
	// Businessオブジェクトアクセサメソッド
	private Business business;
	public Business getBusiness() { return this.business; }
	public void setBusiness( Business obj ) { this.business = obj; }

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
    protected List list;                                            // 一覧部分の結果リストを画面に表示するためのリストインスタンス


    /** コンボボックスデータ取得用　エラー状態区分 */
    private ComboStruct COMBO_ERR_TYP = null;
    
    // 拡張子
    private final String EXTENSION_CSV = "csv";
    
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
    
    // デフォルトアクセサメソッド
    public List getList() { return this.list; }                     // リストを返します。
    public void setList(List listname) { this.list = listname; }    // リストをセットします。
    public int getListsize() {                                      // リスト型のサイズを返します。
        int nret = 0;
        if( this.list != null ) {nret = this.list.size();}
        return nret;
    }
//  public Object getListvalue(int x) { return this.list.get(x); }  // リストの値を返します。
    public AA0150010Struct getListvalue(int x) { return (AA0150010Struct)(this.list.get(x)); }  // リストの値を返します。
    public AA0150010Struct getStruct() { return this.struct; }  // Structを返します。
    public AA0150010Struct createStruct() { return new AA0150010Struct(); } // 新しいStructを作って返します。
    public void setStruct(Object structname) { this.struct.setStruct((AA0150010Struct)structname); }    // Structをセットします。
    public void initializeStruct() { this.struct.initialize(); }    // Structの値を初期化します。

    // CSV出力用リスト
    private CsvWriter csvWriter = null;
    public CsvWriter getCsvWriter(){ return this.csvWriter; }

    private CsvReader csvReader = null;
    public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
    
    /**
     * SQLExceptionエラーメッセージ設定
     * @param SQLException
     */
    private void setSqlExceptionMsg(SQLException e) throws ExpjException
    {
        ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
        sysLog.severe(emsg, getsysUSER_CD());
        ExpjException ee = new ExpjException(e, emsg);
        throw ee;
    }

//------------------------------------------------------------------------

    /** 親画面struct情報一時退避用 */
    private AA0150010Struct _save_struct = new AA0150010Struct();

    /**
     * 親画面のstruct情報を退避
     */
    private void saveParentStruct()
    {
        _save_struct.copy(struct);
    }

    /**
     * 親画面のstruct情報を復帰
     */
    private void loadParentStruct()
    {
        struct.copy(_save_struct);
    }
//------------------------------------------------------------------------
    /**
     * ログメッセージ設定
     * @param 出力メッセージ
     */
    private void setSyslogConfig(String message)
    {
        ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
        sysLog.config(emsg, getsysUSER_CD());
    }

    //---------- ＣＳＶ出力関連の処理 START---------------------------------------------------
	// 品目手配区分表示説明の取得
	private String getMRP_ODR_TYP_DISPLAY_NAME(String value) throws ExpjException{
		struct.setsetNAME("MRP_ODR_TYP");
		struct.setsetVALUE(value);
		List nameList = new ArrayList();
		try {
			nameList = entity.mreadSYS_TYPE_VALUE.read(conn, struct);
		} catch(SQLException e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}catch(Exception e){
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
		if(nameList.size()>0){
			return ((AA0150010Struct)nameList.get(0)).getDISPLAY_NAME();
		}
		return "undefined";
	}

    private String strSysdate = "";
    private List _csvList = new ArrayList(0);
    public List getCsvList(){ return _csvList; }
    public void setCsvList(List list){ _csvList = list; }

    /** 
     * ＣＳＶ出力データ設定準備
     *
     * @param target_struct 対象データ情報
     * @param listTarget    対象データリスト
     * @param ErrlineNo     エラー発生行
     * @param ErrItem       エラー項目名
     * @param ErrCd         エラーコード
     * @param ErrNo         エラーNO
     * @param ErrMsg        エラーメッセージ
     * @param CsvCnount     エラーログ項目数
     * @param ErrItemNo     エラー項目番号
     * @return 異常なし true エラー false
     */ 
    private boolean csvExport(AA0150010Struct target_struct , int ErrlineNo , String ErrItem, String ErrCd, String ErrNo ,String ErrMsg , String CsvCnount,int ErrItemNo)
    {
        
        AA0150010Struct aa0150010struct = new AA0150010Struct();
        String locale = CoreTools.getLocale(sysUSER_CD);

        // 明細設定
        // 多言語キーセット
        if(ErrItemNo != CSV_COLNO_99){
          ExpjMessage emsg = new ExpjMessage("AH00045",String.valueOf(ErrlineNo),String.valueOf(ErrItemNo + 1));
          aa0150010struct.setERROR_IN(emsg.getMessage(locale));
      }else{
          ExpjMessage emsg = new ExpjMessage("AA01520",String.valueOf(ErrlineNo));
          aa0150010struct.setERROR_IN(emsg.getMessage(locale));
        }
        String ErrTyp = getDisplayName(COMBO_ERR_TYP, ErrCd);
        aa0150010struct.setERR_TYP(ErrTyp);
        aa0150010struct.setITEM_CD(target_struct.geth_ITEM_CD());
        // CSV出力の品目番号
        aa0150010struct.setOUT_ITEM_CD(target_struct.getOUT_ITEM_CD());
        aa0150010struct.setERR_CTR_NM(ErrItem);
        aa0150010struct.setERR_INFO(ErrMsg);
        list.add(aa0150010struct);
        
        // 処理成功フラグ初期化(true:成功)
        return true;
    }
    /** 
     * ＣＳＶ出力データ設定準備(訂正ログ)
     *
     * @param target_struct 対象データ情報
     * @param listTarget    対象データリスト
     * @param UserId        ユーザコード
     * @param SyoriKbn      処理区分
     * @param DataKbn       変更データ区分
     * @param 
     * @return 異常なし true エラー false
     */ 
    private boolean csvExportCorrection( AA0150010Struct target_struct , String UserId, String SyoriKbn, String DataKbn ,boolean bWrite)
    {
        // 処理成功フラグ初期化
        boolean bSuccess = false;
        //AA0150010Struct structCsv;
        // CSVファイル編集用
        String csvStr = "";
        String strTmp = "";
        BufferedWriter outStream = null;

        try {
            
            // 変更データ区分が(1:変更前データ)だった場合。
            if (DataKbn == "1" )
            {
                // *更新前のデータの取得*
                struct.setC_setITEM_CD(target_struct.geth_ITEM_CD());
                List listmitemType = entity.mreadM_ITEM.read(conn, struct);

                csvStr = '"' + strSysdate + '"' + "," ;
                // ○2ログインユーザー名
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ○3処理区分
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ○4変更データ区分
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ○5品目番号
                csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CD() + '"' + "," ;
                // ○6品目名
                if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_NAME() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_NAME() + '"' + "," ;
                }
                // ○7図面番号
                if(((AA0150010Struct)listmitemType.get(0)).getC_DRAW_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_DRAW_CD() + '"' + "," ;
                }
                // ○8規格
                if(((AA0150010Struct)listmitemType.get(0)).getC_SPEC() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SPEC() + '"' + "," ;
                }
                // ○9レベル番号
                if(((AA0150010Struct)listmitemType.get(0)).getC_HIGH_LEVEL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_HIGH_LEVEL_NO() + '"' + "," ;
                }
                // ○10品目手配区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_MRP_ODR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MRP_ODR_TYP() + '"' + "," ;
                }
                // ○11品目内外作区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_OUTSIDE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_OUTSIDE_TYP() + '"' + "," ;
                }
                // ○12荷姿管理フラグ
                if(((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT_FLG() + '"' + "," ;
                }
                // ○13計量単位
                if(((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_STOCK_UNIT() + '"' + "," ;
                }
                // ○14荷姿計量単位
                if(((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT() + '"' + "," ;
                }
                // ○15荷姿単位数
                if(((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PKG_UNIT_QTY() + '"' + "," ;
                }
                // ○16在庫数単位区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_UNIT_QTY_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_UNIT_QTY_TYP() + '"' + "," ;
                }
                // ○17品目手配リードタイム
                if(((AA0150010Struct)listmitemType.get(0)).getC_ODR_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ODR_LT() + '"' + "," ;
                }
                // ○18品目固定分リードタイム
                if(((AA0150010Struct)listmitemType.get(0)).getC_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_FIXED_LT() + '"' + "," ;
                }
                // ○19品目比例分リードタイム
                if(((AA0150010Struct)listmitemType.get(0)).getC_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PROP_LT() + '"' + "," ;
                }
                // ○20安全日数
                if(((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_LT() + '"' + "," ;
                }
                // ○21払出リードタイム
                if(((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_LT() + '"' + "," ;
                }
                // ○22品目比例分ロットサイズ
                if(((AA0150010Struct)listmitemType.get(0)).getC_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PROP_LOT_SIZE()+ '"' + "," ;
                }
                // ○23品目仕損率
                if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_SPOIL() + '"' + "," ;
                }
                // ○24安全在庫量
                if(((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_STOCK() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SAFETY_STOCK() + '"' + "," ;
                }
                // ○25ロットまとめ区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_LOT_SIZING_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_LOT_SIZING_TYP() + '"' + "," ;
                }
                // ○26最大まとめ期間
                if(((AA0150010Struct)listmitemType.get(0)).getC_MAX_PERIOD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MAX_PERIOD() + '"' + "," ;
                }
                // ○27最大手配数
                if(((AA0150010Struct)listmitemType.get(0)).getC_MAX_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MAX_ODR_QTY() + '"' + "," ;
                }
                // ○28発注点在庫数
                if(((AA0150010Struct)listmitemType.get(0)).getC_ODR_POINT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ODR_POINT() + '"' + "," ;
                }
                // ○29定量発注数
                if(((AA0150010Struct)listmitemType.get(0)).getC_FIXED_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_FIXED_ODR_QTY() + '"' + "," ;
                }
                // ○30最小手配数
                if(((AA0150010Struct)listmitemType.get(0)).getC_MIN_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MIN_ODR_QTY() + '"' + "," ;
                }
                // ○31まるめ単位
                if(((AA0150010Struct)listmitemType.get(0)).getC_MUL_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MUL_ODR_QTY() + '"' + "," ;
                }
                // ○32出庫区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ISSUE_TYP() + '"' + "," ;
                }
                // ○33MPS品目フラグ
                if(((AA0150010Struct)listmitemType.get(0)).getC_MPS_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MPS_FLG() + '"' + "," ;
                }
                // ○34受入検査区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_ACPT_INSPC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ACPT_INSPC_TYP() + '"' + "," ;
                }
                // ○35製品区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_PRODUCT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PRODUCT_TYP() + '"' + "," ;
                }
                // ○36管理コード
                if(((AA0150010Struct)listmitemType.get(0)).getC_CLASIFICATION_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_CLASIFICATION_CD() + '"' + "," ;
                }
                // ○37単位重量
                if(((AA0150010Struct)listmitemType.get(0)).getC_UNIT_WEIGHT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_UNIT_WEIGHT() + '"' + "," ;
                }
                // ○38棚卸区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_ABC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ABC_TYP() + '"' + "," ;
                }
                // ○39作業実績区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_OPR_RSLT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_OPR_RSLT_TYP() + '"' + "," ;
                }
                // ○40受給品区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_SPL_ITEM_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SPL_ITEM_TYP() + '"' + "," ;
                }
                // ○41消費税コード
                if(((AA0150010Struct)listmitemType.get(0)).getC_TAX_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_TAX_CD() + '"' + "," ;
                }
                // ○42カレンダ番号
                if(((AA0150010Struct)listmitemType.get(0)).getC_CAL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_CAL_NO() + '"' + "," ;
                }
                if("1".equals(SyoriKbn)){
                  // ○43保管区コード
// 2008/07/25 SYSCOM 磯部 ORIGINAL START
//                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' ;
// 2008/07/25 SYSCOM 磯部 ORIGINAL END
// 2008/07/25 SYSCOM 磯部 UPD START
                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' + "," ;
// 2008/07/25 SYSCOM 磯部 UPD END
              }
// 2008/07/25 SYSCOM 磯部 ADD START
                // ○44工数管理品目区分
                if(((AA0150010Struct)listmitemType.get(0)).getC_MANHOUR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + ",";
                } else {
                    csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_MANHOUR_TYP() + '"' + ",";
                }
// 2008/07/25 SYSCOM 磯部 ADD END
//////////////////////////////////////////////////////////////////
				// ○43保管区分
				if(((AA0150010Struct)listmitemType.get(0)).getC_DEPO_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_DEPO_TYP() + '"' + "," ;
				}
				// ○44ロット管理フラグ
				if(((AA0150010Struct)listmitemType.get(0)).getC_LOT_CTRL_FLG() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_LOT_CTRL_FLG() + '"' + "," ;
				}
				// ○45ロット採番区分
				if(((AA0150010Struct)listmitemType.get(0)).getC_LOT_NUMBERING_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_LOT_NUMBERING_TYP() + '"' + "," ;
				}
				// ○46品質期限年数
				if(((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_YEAR() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_YEAR() + '"' + "," ;
				}
				// ○47品質期限月数
				if(((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_MONTH() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_MONTH() + '"' + "," ;
				}
				// ○48品質期限日数
				if(((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_DAY() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_BEST_BEFORE_DAY() + '"' + "," ;
				}
//20150803 ADD START BY SYSCOM
            	// ○49負担部門コード
				if(((AA0150010Struct)listmitemType.get(0)).getC_DEPT_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_DEPT_CD() + '"' + "," ;
				}
            	// ○50プロジェクトコード
            	if(((AA0150010Struct)listmitemType.get(0)).getC_PJ_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_PJ_CD() + '"' + "," ;
				}
            	// ○51セグメント1
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_1() + '"' + "," ;
				}
            	// ○52セグメント2
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_2() + '"' + "," ;
				}
            	// ○53セグメント3
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_3() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_3() + '"' + "," ;
				}
            	// ○54セグメント4
            	if(((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_4() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_SEG_CONTENTS_4() + '"' + "," ;
				}
//20150803 ADD END BY SYSCOM
				// ○55備考１
				if(((AA0150010Struct)listmitemType.get(0)).getC_REMARK1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_REMARK1() + '"' + "," ;
				}
				// ○56備考2
				if(((AA0150010Struct)listmitemType.get(0)).getC_REMARK2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_REMARK2() + '"' + "," ;
				}
				// ○57品目分類01
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_01_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_01_CD() + '"' + "," ;
				}
            	// ○58品目分類02
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_02_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_02_CD() + '"' + "," ;
				}
            	// ○59品目分類03
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_03_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_03_CD() + '"' + "," ;
				}
				// ○60品目分類04
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_04_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_04_CD() + '"' + "," ;
				}
				// ○61品目分類05
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_05_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_05_CD() + '"' + "," ;
				}
				// ○62品目分類06
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_06_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_06_CD() + '"' + "," ;
				}
				// ○63品目分類07
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_07_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_07_CD() + '"' + "," ;
				}
				// ○64品目分類08
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_08_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_08_CD() + '"' + "," ;
				}
				// ○65品目分類09
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_09_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_09_CD() + '"' + "," ;
				}
				// ○66品目分類10
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_10_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_10_CD() + '"' + "," ;
				}
				// ○67品目分類11
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_11_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_11_CD() + '"' + "," ;
				}
				// ○68品目分類12
				if(((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_12_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"';
				} else {
					csvStr = csvStr + '"' + ((AA0150010Struct)listmitemType.get(0)).getC_ITEM_CLASS_12_CD() + '"';
				}

            } else {
                csvStr = '"' + strSysdate + '"' + "," ;

                // ○2ログインユーザー名
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ○3処理区分
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ○4変更データ区分
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ○5品目番号
                csvStr = csvStr + '"' + target_struct.geth_ITEM_CD() + '"' + "," ;
                // ○6品目名
                if(target_struct.geth_ITEM_NAME() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ITEM_NAME() + '"' + "," ;
                }
                // ○7図面番号
                if(target_struct.geth_DRAW_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_DRAW_CD() + '"' + "," ;
                }
                // ○8規格
                if(target_struct.geth_SPEC() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SPEC() + '"' + "," ;
                }
                // ○9レベル番号
                if(target_struct.geth_HIGH_LEVEL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_HIGH_LEVEL_NO() + '"' + "," ;
                }
                // ○10品目手配区分
                if(target_struct.geth_MRP_ODR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MRP_ODR_TYP() + '"' + "," ;
                }
                // ○11品目内外作区分
                if(target_struct.geth_OUTSIDE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_OUTSIDE_TYP() + '"' + "," ;
                }
                // ○12荷姿管理フラグ
                if(target_struct.geth_STOCK_UNIT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_STOCK_UNIT_FLG() + '"' + "," ;
                }
                // ○13計量単位
                if(target_struct.geth_STOCK_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_STOCK_UNIT() + '"' + "," ;
                }
                // ○14荷姿計量単位
                if(target_struct.geth_PKG_UNIT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PKG_UNIT() + '"' + "," ;
                }
                // ○15荷姿単位数
                if(target_struct.geth_PKG_UNIT_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PKG_UNIT_QTY() + '"' + "," ;
                }
                // ○16在庫数単位区分
                if(target_struct.geth_UNIT_QTY_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_UNIT_QTY_TYP() + '"' + "," ;
                }
                // ○17品目手配リードタイム
                if(target_struct.geth_ODR_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ODR_LT() + '"' + "," ;
                }
                // ○18品目固定分リードタイム
                if(target_struct.geth_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_FIXED_LT() + '"' + "," ;
                }
                // ○19品目比例分リードタイム
                if(target_struct.geth_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PROP_LT() + '"' + "," ;
                }
                // ○20安全日数
                if(target_struct.geth_SAFETY_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SAFETY_LT() + '"' + "," ;
                }
                // ○21払出リードタイム
                if(target_struct.geth_ISSUE_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ISSUE_LT() + '"' + "," ;
                }
                // ○22品目比例分ロットサイズ
                if(target_struct.geth_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PROP_LOT_SIZE()+ '"' + "," ;
                }
                // ○23品目仕損率
                if(target_struct.geth_ITEM_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ITEM_SPOIL() + '"' + "," ;
                }
                // ○24安全在庫量
                if(target_struct.geth_SAFETY_STOCK() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SAFETY_STOCK() + '"' + "," ;
                }
                // ○25ロットまとめ区分
                if(target_struct.geth_LOT_SIZING_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_LOT_SIZING_TYP() + '"' + "," ;
                }
                // ○26最大まとめ期間
                if(target_struct.geth_MAX_PERIOD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MAX_PERIOD() + '"' + "," ;
                }
                // ○27最大手配数
                if(target_struct.geth_MAX_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MAX_ODR_QTY() + '"' + "," ;
                }
                // ○28発注点在庫数
                if(target_struct.geth_ODR_POINT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ODR_POINT() + '"' + "," ;
                }
                // ○29定量発注数
                if(target_struct.geth_FIXED_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_FIXED_ODR_QTY() + '"' + "," ;
                }
                // ○30最小手配数
                if(target_struct.geth_MIN_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MIN_ODR_QTY() + '"' + "," ;
                }
                // ○31まるめ単位
                if(target_struct.geth_MUL_ODR_QTY() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MUL_ODR_QTY() + '"' + "," ;
                }
                // ○32出庫区分
                if(target_struct.geth_ISSUE_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ISSUE_TYP() + '"' + "," ;
                }
                // ○33MPS品目フラグ
                if(target_struct.geth_MPS_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MPS_FLG() + '"' + "," ;
                }
                // ○34受入検査区分
                if(target_struct.geth_ACPT_INSPC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ACPT_INSPC_TYP() + '"' + "," ;
                }
                // ○35製品区分
                if(target_struct.geth_PRODUCT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PRODUCT_TYP() + '"' + "," ;
                }
                // ○36管理コード
                if(target_struct.geth_CLASIFICATION_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_CLASIFICATION_CD() + '"' + "," ;
                }
                // ○37単位重量
                if(target_struct.geth_UNIT_WEIGHT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_UNIT_WEIGHT() + '"' + "," ;
                }
                // ○38棚卸区分
                if(target_struct.geth_ABC_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_ABC_TYP() + '"' + "," ;
                }
                // ○39作業実績区分
                if(target_struct.geth_OPR_RSLT_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_OPR_RSLT_TYP() + '"' + "," ;
                }
                // ○40受給品区分
                if(target_struct.geth_SPL_ITEM_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_SPL_ITEM_TYP() + '"' + "," ;
                }
                // ○41消費税コード
                if(target_struct.geth_TAX_CD() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_TAX_CD() + '"' + "," ;
                }
                // ○42カレンダ番号
                if(target_struct.geth_CAL_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_CAL_NO() + '"' + "," ;
                }
                
                if("1".equals(SyoriKbn)){
                  // ○43保管区コード
// 2008/07/25 SYSCOM 磯部 ORIGINAL START
//                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' ;
// 2008/07/25 SYSCOM 磯部 ORIGINAL END
// 2008/07/25 SYSCOM 磯部 UPD START
                  csvStr = csvStr + '"' + target_struct.geth_WH_CD() + '"' + "," ;
// 2008/07/25 SYSCOM 磯部 UPD END
              }
// 2008/07/25 SYSCOM 磯部 ADD START
                // ○44工数管理品目区分
                if(target_struct.geth_MANHOUR_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + ",";
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MANHOUR_TYP() + '"' + ",";
                }
// 2008/07/25 SYSCOM 磯部 ADD END
				//////////////////////////////////////////

				// ○44保管区分
				if(target_struct.geth_DEPO_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_DEPO_TYP() + '"' + "," ;
				}

				// ○45ロット管理フラグ
				if(target_struct.geth_LOT_CTRL_FLG() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_LOT_CTRL_FLG() + '"' + "," ;
				}
				// ○46ロット採番区分
				if(target_struct.geth_LOT_NUMBERING_TYP() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_LOT_NUMBERING_TYP() + '"' + "," ;
				}
				// ○47品質期限年数
				if(target_struct.geth_BEST_BEFORE_YEAR() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_BEST_BEFORE_YEAR() + '"' + "," ;
				}
				// ○48品質期限月数
				if(target_struct.geth_BEST_BEFORE_MONTH() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_BEST_BEFORE_MONTH() + '"' + "," ;
				}
				// ○49品質期限日数
				if(target_struct.geth_BEST_BEFORE_DAY() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_BEST_BEFORE_DAY() + '"' + "," ;
				}
//20150803 ADD START BY SYSCOM
            	// ○50負担部門コード
				if(target_struct.geth_DEPT_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_DEPT_CD() + '"' + "," ;
				}
            	// ○51プロジェクトコード
				if(target_struct.geth_PJ_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_PJ_CD() + '"' + "," ;
				}
            	// ○52セグメント1
				if(target_struct.geth_SEG_CONTENTS_1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_1() + '"' + "," ;
				}
            	// ○53セグメント2
				if(target_struct.geth_SEG_CONTENTS_2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_2() + '"' + "," ;
				}
            	// ○54セグメント3
				if(target_struct.geth_SEG_CONTENTS_3() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_3() + '"' + "," ;
				}

            	// ○55セグメント4
				if(target_struct.geth_SEG_CONTENTS_4() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_SEG_CONTENTS_4() + '"' + "," ;
				}
//20150803 ADD END BY SYSCOM
				// ○56備考１
				if(target_struct.geth_REMARK1() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_REMARK1() + '"' + "," ;
				}
				// ○57備考2
				if(target_struct.geth_REMARK2() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_REMARK2() + '"' + "," ;
				}
				// ○58品目分類01
				if(target_struct.geth_ITEM_CLASS_01_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_01_CD() + '"' + "," ;
				}
				// ○59品目分類02
				if(target_struct.geth_ITEM_CLASS_02_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_02_CD() + '"' + "," ;
				}
				// ○60品目分類03
				if(target_struct.geth_ITEM_CLASS_03_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_03_CD() + '"' + "," ;
				}
				// ○61品目分類04
				if(target_struct.geth_ITEM_CLASS_04_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_04_CD() + '"' + "," ;
				}
				// ○62品目分類05
				if(target_struct.geth_ITEM_CLASS_05_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_05_CD() + '"' + "," ;
				}
				// ○63品目分類06
				if(target_struct.geth_ITEM_CLASS_06_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_06_CD() + '"' + "," ;
				}
				// ○64品目分類07
				if(target_struct.geth_ITEM_CLASS_07_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_07_CD() + '"' + "," ;
				}
				// ○65品目分類08
				if(target_struct.geth_ITEM_CLASS_08_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_08_CD() + '"' + "," ;
				}
				// ○66品目分類09
				if(target_struct.geth_ITEM_CLASS_09_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_09_CD() + '"' + "," ;
				}
				// ○67品目分類10
				if(target_struct.geth_ITEM_CLASS_10_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_10_CD() + '"' + "," ;
				}
				// ○68品目分類11
				if(target_struct.geth_ITEM_CLASS_11_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"' + "," ;
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_11_CD() + '"' + "," ;
				}
				// ○69品目分類12
				if(target_struct.geth_ITEM_CLASS_12_CD() == null){
					csvStr = csvStr + '"' + strTmp + '"';
				} else {
					csvStr = csvStr + '"' + target_struct.geth_ITEM_CLASS_12_CD() + '"' ;
				}

            }
            // 訂正ログ出力(出力ファイル名セット)
            
            if(bWrite){
              outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),true));
          }else{
              outStream = new BufferedWriter(new FileWriter(struct.getCANCEL_FILE(),false));
          }
            // ファイルに書込
            outStream.write(csvStr);
            // 改行コード付加
            outStream.newLine();
            // BufferedWriterクローズ
            outStream.close();
            // 処理フラグセット(true:成功)
            bSuccess = true;
            return bSuccess;
        } catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
            sysLog.severe(emsg, getsysUSER_CD());
            // 処理フラグセット(false:失敗)
            bSuccess = false;
            return bSuccess;
        }finally{
            if (outStream != null ) {
                try {
                    outStream.close();
                } catch (Exception e ) {
                    e.printStackTrace();
                }
              outStream = null;
             }
        }
    }
    //---------- ＣＳＶ出力関連の処理 END---------------------------------------------------

    //---------- ＣＳＶ取込関連の処理 START---------------------------------------------------

    /** ＣＳＶ項目番号定義 */
    private final int CSV_COLNO_ITEM_CD = 0;            //  1品目番号
    private final int CSV_COLNO_ITEM_NAME = 1;          //  2品目名
    private final int CSV_COLNO_DRAW_CD = 2;            //  3図面番号
    private final int CSV_COLNO_SPEC = 3;               //  4規格
    private final int CSV_COLNO_HIGH_LEVEL_NO = 4;      //  5レベル番号
    private final int CSV_COLNO_MRP_ODR_TYP = 5;        //  6品目手配区分
    private final int CSV_COLNO_OUTSIDE_TYP = 6;        //  7品目内外作区分
    private final int CSV_COLNO_STOCK_UNIT_FLG = 7;     //  8荷姿管理フラグ
    private final int CSV_COLNO_STOCK_UNIT = 8;         //  9計量単位
    private final int CSV_COLNO_PKG_UNIT = 9;           // 10荷姿計量単位
    private final int CSV_COLNO_PKG_UNIT_QTY = 10;      // 11荷姿単位数
    private final int CSV_COLNO_UNIT_QTY_TYP = 11;      // 12在庫数単位区分
    private final int CSV_COLNO_ODR_LT = 12;            // 13品目手配リードタイム
    private final int CSV_COLNO_FIXED_LT = 13;          // 14品目固定分リードタイム
    private final int CSV_COLNO_PROP_LT = 14;           // 15品目比例分リードタイム
    private final int CSV_COLNO_SAFETY_LT = 15;         // 16安全日数
    private final int CSV_COLNO_ISSUE_LT = 16;          // 17払出リードタイム
    private final int CSV_COLNO_PROP_LOT_SIZE = 17;     // 18品目比例分ロットサイズ
    private final int CSV_COLNO_ITEM_SPOIL = 18;        // 19品目仕損率
    private final int CSV_COLNO_SAFETY_STOCK = 19;      // 20安全在庫量
    private final int CSV_COLNO_LOT_SIZING_TYP = 20;    // 21ロットまとめ区分
    private final int CSV_COLNO_MAX_PERIOD = 21;        // 22最大まとめ期間
    private final int CSV_COLNO_MAX_ODR_QTY = 22;       // 23最大手配数
    private final int CSV_COLNO_ODR_POINT = 23;         // 24発注点在V庫数
    private final int CSV_COLNO_FIXED_ODR_QTY = 24;     // 25定量発注数
    private final int CSV_COLNO_MIN_ODR_QTY = 25;       // 26最小手配数
    private final int CSV_COLNO_MUL_ODR_QTY = 26;       // 27まるめ単位
    private final int CSV_COLNO_ISSUE_TYP = 27;         // 28出庫区分
    private final int CSV_COLNO_MPS_FLG = 28;           // 29MPS品目フラグ
    private final int CSV_COLNO_ACPT_INSPC_TYP = 29;    // 30受入検査区分
    private final int CSV_COLNO_PRODUCT_TYP = 30;       // 31製品区分
    private final int CSV_COLNO_CLASIFICATION_CD = 31;  // 32管理コード
    private final int CSV_COLNO_UNIT_WEIGHT = 32;       // 33単位重量
    private final int CSV_COLNO_ABC_TYP = 33;           // 34棚卸区分
    private final int CSV_COLNO_OPR_RSLT_TYP = 34;      // 35作業実績区分
    private final int CSV_COLNO_SPL_ITEM_TYP = 35;      // 36受給品区分
    private final int CSV_COLNO_TAX_CD = 36;            // 37消費税コード
    private final int CSV_COLNO_CAL_NO = 37;            // 38カレンダ番号
    private final int CSV_COLNO_WH_CD = 38;             // 39保管区コード
// 2008/07/25 SYSCOM 磯部 ADD START
    private final int CSV_COLNO_MANHOUR_TYP = 39;       // 40工数管理品目区分
// 2008/07/25 SYSCOM 磯部 ADD END
	private final int CSV_COLNO_DEPO_TYP = 40;				      // 41保管区分
	private final int CSV_COLNO_LOT_CTRL_FLG = 41;				      // 42ロット管理フラグ
	private final int CSV_COLNO_LOT_NUMBERING_TYP = 42;				      // 43ロット採番区分
	private final int CSV_COLNO_BEST_BEFORE_YEAR = 43;				      // 44品質期限年数
	private final int CSV_COLNO_BEST_BEFORE_MONTH = 44;				      // 45品質期限月数
	private final int CSV_COLNO_BEST_BEFORE_DAY = 45;				      // 46品質期限日数
//20150803 ADD SATRT BY SYSCOM
	private final int CSV_COLNO_DEPT_CD = 46;            // 47負担部門コード
	private final int CSV_COLNO_PJ_CD = 47;              // 48プロジェクトコード
	private final int CSV_COLNO_SEG_CONTENTS_1 = 48;     // 49セグメント1
	private final int CSV_COLNO_SEG_CONTENTS_2 = 49;     // 50セグメント2
	private final int CSV_COLNO_SEG_CONTENTS_3 = 50;     // 51セグメント3
	private final int CSV_COLNO_SEG_CONTENTS_4 = 51;     // 52セグメント4
//20150803 ADD END BY SYSCOM
//20150803 MOD START BY SYSCOM
//	private final int CSV_COLNO_REMARK1 = 46;				      // 47備考1
//	private final int CSV_COLNO_REMARK2 = 47;				      // 48備考2
//	private final int CSV_COLNO_ITEM_CLASS_01_CD = 48;				      // 49品目分類01コード
//	private final int CSV_COLNO_ITEM_CLASS_02_CD = 49;				      // 50品目分類02コード
//	private final int CSV_COLNO_ITEM_CLASS_03_CD = 50;				      // 51品目分類013コード
//	private final int CSV_COLNO_ITEM_CLASS_04_CD = 51;				      // 52品目分類04コード
//	private final int CSV_COLNO_ITEM_CLASS_05_CD = 52;				      // 53品目分類05コード
//	private final int CSV_COLNO_ITEM_CLASS_06_CD = 53;				      // 54品目分類06コード
//	private final int CSV_COLNO_ITEM_CLASS_07_CD = 54;				      // 55品目分類07コード
//	private final int CSV_COLNO_ITEM_CLASS_08_CD = 55;				      // 56品目分類08コード
//	private final int CSV_COLNO_ITEM_CLASS_09_CD = 56;				      // 57品目分類09コード
//	private final int CSV_COLNO_ITEM_CLASS_10_CD = 57;				      // 58品目分類10コード
//	private final int CSV_COLNO_ITEM_CLASS_11_CD = 58;				      // 59品目分類11コード
//	private final int CSV_COLNO_ITEM_CLASS_12_CD = 59;				      // 60品目分類12コード	
	
	private final int CSV_COLNO_REMARK1 = 52;				              // 53備考1
	private final int CSV_COLNO_REMARK2 = 53;				              // 54備考2
	private final int CSV_COLNO_ITEM_CLASS_01_CD = 54;				      // 55品目分類01コード
	private final int CSV_COLNO_ITEM_CLASS_02_CD = 55;				      // 56品目分類02コード
	private final int CSV_COLNO_ITEM_CLASS_03_CD = 56;				      // 57品目分類013コード
	private final int CSV_COLNO_ITEM_CLASS_04_CD = 57;				      // 58品目分類04コード
	private final int CSV_COLNO_ITEM_CLASS_05_CD = 58;				      // 59品目分類05コード
	private final int CSV_COLNO_ITEM_CLASS_06_CD = 59;				      // 60品目分類06コード
	private final int CSV_COLNO_ITEM_CLASS_07_CD = 60;				      // 61品目分類07コード
	private final int CSV_COLNO_ITEM_CLASS_08_CD = 61;				      // 62品目分類08コード
	private final int CSV_COLNO_ITEM_CLASS_09_CD = 62;				      // 63品目分類09コード
	private final int CSV_COLNO_ITEM_CLASS_10_CD = 63;				      // 64品目分類10コード
	private final int CSV_COLNO_ITEM_CLASS_11_CD = 64;				      // 65品目分類11コード
	private final int CSV_COLNO_ITEM_CLASS_12_CD = 65;				      // 66品目分類12コード	
//20150803 MOD END BY SYSCOM


    private final int CSV_COLNO_99 = 99;                // 99

    /** ＣＳＶ取込データ必要項目数(合計) */
// 2008/07/25 SYSCOM 磯部 ORIGINAL START
//    private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_WH_CD + 1);
// 2008/07/25 SYSCOM 磯部 ORIGINAL END
// 2008/07/25 SYSCOM 磯部 UPD START
    private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_ITEM_CLASS_12_CD + 1);
// 2008/07/25 SYSCOM 磯部 UPD END

    /**
     * ＣＳＶデータ取得とリストデータ化
     *
     * @return  CSVデータリスト
     */
    private List readCsvData() throws ExpjException
    {
        // ログ出力情報格納用
        String logMessage = "";
        String [] strsCsvData = null;
        List listCsv = null;

        try {
            // ＣＳＶデータのアップロード
            strsCsvData = (String []) csvReader.lineRead();
            if(null != strsCsvData)
            {
                logMessage = "strsCsvData.length:" + strsCsvData.length;
                setSyslogConfig(logMessage);

                // データ件数としてstrsCsvData.lengthは使えない。実際の行数＋５行くらいらしい
                listCsv = new ArrayList(0);
                for(int i = 0; i < strsCsvData.length; i++)
                {
                    // 改行のみのレコードでEOFと判断します
                    if(strsCsvData[i].length() == 0)
                    {
                        // 処理を抜ける。
                        break;
                    }

                    // レコードを項目毎にばらす
                    AA0150010Struct structCsv = new AA0150010Struct();
                    Vector v = csvReader.importCSVLine(strsCsvData[i]);
                    if(null != v)
                    {
                        // 項目数チェック
                        // CSVファイルの項目数を変数に取得。
                        int intColNum = v.size();
                        if(CSV_NECESSARY_COLUMN == intColNum)
                        {
                            // ■1品目番号
                            if ((String) v.get(CSV_COLNO_ITEM_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CD)) == true )
                            {
                                structCsv.seth_ITEM_CD((String)null);
                            } else {
                                structCsv.seth_ITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
                            }
                            //CSV出力の品目番号
                            structCsv.setOUT_ITEM_CD(structCsv.geth_ITEM_CD());
                            // \の場合、\\で置換処理
                            structCsv.seth_ITEM_CD(replaceSlash(structCsv.geth_ITEM_CD()));
                            // ■2品目名
                            if ((String) v.get(CSV_COLNO_ITEM_NAME) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_NAME)) == true )
                            {
                                structCsv.seth_ITEM_NAME((String)null);
                            } else {
                                structCsv.seth_ITEM_NAME((String) v.get(CSV_COLNO_ITEM_NAME));
                            }
                            // ■3図面番号
                            if ((String) v.get(CSV_COLNO_DRAW_CD) == null || ("").equals((String) v.get(CSV_COLNO_DRAW_CD)) == true )
                            {
                                structCsv.seth_DRAW_CD((String)null);
                            } else {
                                structCsv.seth_DRAW_CD((String) v.get(CSV_COLNO_DRAW_CD));
                            }
                            // ■4規格
                            if ((String) v.get(CSV_COLNO_SPEC) == null || ("").equals((String) v.get(CSV_COLNO_SPEC)) == true )
                            {
                                structCsv.seth_SPEC((String)null);
                            } else {
                                structCsv.seth_SPEC((String) v.get(CSV_COLNO_SPEC));
                            }
                            // ■5レベル番号
                            if ((String) v.get(CSV_COLNO_HIGH_LEVEL_NO) == null || ("").equals((String) v.get(CSV_COLNO_HIGH_LEVEL_NO)) == true )
                            {
                                structCsv.seth_HIGH_LEVEL_NO((String)null);
                            } else {
                                structCsv.seth_HIGH_LEVEL_NO((String) v.get(CSV_COLNO_HIGH_LEVEL_NO));
                            }
                            structCsv.seth_HIGH_LEVEL_NO(trim(structCsv.geth_HIGH_LEVEL_NO()));
                            // ■6品目手配区分
                            if ((String) v.get(CSV_COLNO_MRP_ODR_TYP) == null || ("").equals((String) v.get(CSV_COLNO_MRP_ODR_TYP)) == true)
                            {
                                structCsv.seth_MRP_ODR_TYP((String)null);
                            } else {
                                structCsv.seth_MRP_ODR_TYP((String) v.get(CSV_COLNO_MRP_ODR_TYP));
                            }
                            structCsv.seth_MRP_ODR_TYP(trim(structCsv.geth_MRP_ODR_TYP()));
                            // ■7品目内外作区分
                            if ((String) v.get(CSV_COLNO_OUTSIDE_TYP) == null || ("").equals((String) v.get(CSV_COLNO_OUTSIDE_TYP)) == true)
                            {
                                structCsv.seth_OUTSIDE_TYP((String)null);
                            } else {
                                structCsv.seth_OUTSIDE_TYP((String) v.get(CSV_COLNO_OUTSIDE_TYP));
                            }
                            structCsv.seth_OUTSIDE_TYP(trim(structCsv.geth_OUTSIDE_TYP()));
                            // ■8荷姿管理フラグ
                            if ((String) v.get(CSV_COLNO_STOCK_UNIT_FLG) == null || ("").equals((String) v.get(CSV_COLNO_STOCK_UNIT_FLG)) == true)
                            {
                                structCsv.seth_STOCK_UNIT_FLG((String)null);
                            } else {
                                structCsv.seth_STOCK_UNIT_FLG((String) v.get(CSV_COLNO_STOCK_UNIT_FLG));
                            }
                            structCsv.seth_STOCK_UNIT_FLG(trim(structCsv.geth_STOCK_UNIT_FLG()));
                            // ■9計量単位
                            if ((String) v.get(CSV_COLNO_STOCK_UNIT) == null || ("").equals((String) v.get(CSV_COLNO_STOCK_UNIT)) == true)
                            {
                                structCsv.seth_STOCK_UNIT((String)null);
                            } else {
                                structCsv.seth_STOCK_UNIT((String) v.get(CSV_COLNO_STOCK_UNIT));
                            }
                            // ■10荷姿計量単位
                            if ((String) v.get(CSV_COLNO_PKG_UNIT) == null || ("").equals((String) v.get(CSV_COLNO_PKG_UNIT)) == true)
                            {
                                structCsv.seth_PKG_UNIT((String)null);
                            } else {
                                structCsv.seth_PKG_UNIT((String) v.get(CSV_COLNO_PKG_UNIT));
                            }
                            // ■11荷姿単位数
                            if ((String) v.get(CSV_COLNO_PKG_UNIT_QTY) == null || ("").equals((String) v.get(CSV_COLNO_PKG_UNIT_QTY)) == true)
                            {
                                structCsv.seth_PKG_UNIT_QTY((String)null);
                            } else {
                                structCsv.seth_PKG_UNIT_QTY((String) v.get(CSV_COLNO_PKG_UNIT_QTY));
                            }
                            structCsv.seth_PKG_UNIT_QTY(trim(structCsv.geth_PKG_UNIT_QTY()));
                            // ■12在庫数単位区分
                            if ((String) v.get(CSV_COLNO_UNIT_QTY_TYP) == null || ("").equals((String) v.get(CSV_COLNO_UNIT_QTY_TYP)) == true)
                            {
                                structCsv.seth_UNIT_QTY_TYP((String)null);
                            } else {
                                structCsv.seth_UNIT_QTY_TYP((String) v.get(CSV_COLNO_UNIT_QTY_TYP));
                            }
                            structCsv.seth_UNIT_QTY_TYP(trim(structCsv.geth_UNIT_QTY_TYP()));
                            // ■13品目手配リードタイム
                            if ((String) v.get(CSV_COLNO_ODR_LT) == null || ("").equals((String) v.get(CSV_COLNO_ODR_LT)) == true)
                            {
                                structCsv.seth_ODR_LT((String)null);
                            } else {
                                structCsv.seth_ODR_LT((String) v.get(CSV_COLNO_ODR_LT));
                            }
                            structCsv.seth_ODR_LT(trim(structCsv.geth_ODR_LT()));
                            // ■14品目固定分リードタイム
                            if ((String) v.get(CSV_COLNO_FIXED_LT) == null || ("").equals((String) v.get(CSV_COLNO_FIXED_LT)) == true)
                            {
                                structCsv.seth_FIXED_LT((String)null);
                            } else {
                                structCsv.seth_FIXED_LT((String) v.get(CSV_COLNO_FIXED_LT));
                            }
                            structCsv.seth_FIXED_LT(trim(structCsv.geth_FIXED_LT()));
                            // ■15品目比例分リードタイム
                            if ((String) v.get(CSV_COLNO_PROP_LT) == null || ("").equals((String) v.get(CSV_COLNO_PROP_LT)) == true)
                            {
                                structCsv.seth_PROP_LT((String)null);
                            } else {
                                structCsv.seth_PROP_LT((String) v.get(CSV_COLNO_PROP_LT));
                            }
                            structCsv.seth_PROP_LT(trim(structCsv.geth_PROP_LT()));
                            // ■16安全日数
                            if ((String) v.get(CSV_COLNO_SAFETY_LT) == null || ("").equals((String) v.get(CSV_COLNO_SAFETY_LT)) == true)
                            {
                                structCsv.seth_SAFETY_LT((String)null);
                            } else {
                                structCsv.seth_SAFETY_LT((String) v.get(CSV_COLNO_SAFETY_LT));
                            }
                            structCsv.seth_SAFETY_LT(trim(structCsv.geth_SAFETY_LT()));
                            // ■17払出リードタイム
                            if ((String) v.get(CSV_COLNO_ISSUE_LT) == null || ("").equals((String) v.get(CSV_COLNO_ISSUE_LT)) == true)
                            {
                                structCsv.seth_ISSUE_LT((String)null);
                            } else {
                                structCsv.seth_ISSUE_LT((String) v.get(CSV_COLNO_ISSUE_LT));
                            }
                            structCsv.seth_ISSUE_LT(trim(structCsv.geth_ISSUE_LT()));
                            // ■18品目比例分ロットサイズ
                            if ((String) v.get(CSV_COLNO_PROP_LOT_SIZE) == null || ("").equals((String) v.get(CSV_COLNO_PROP_LOT_SIZE)) == true)
                            {
                                structCsv.seth_PROP_LOT_SIZE((String)null);
                            } else {
                                structCsv.seth_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PROP_LOT_SIZE));
                            }
                            structCsv.seth_PROP_LOT_SIZE(trim(structCsv.geth_PROP_LOT_SIZE()));
                            // ■19品目仕損率
                            if ((String) v.get(CSV_COLNO_ITEM_SPOIL) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_SPOIL)) == true)
                            {
                                structCsv.seth_ITEM_SPOIL((String)null);
                            } else {
                                structCsv.seth_ITEM_SPOIL((String) v.get(CSV_COLNO_ITEM_SPOIL));
                            }
                            structCsv.seth_ITEM_SPOIL(trim(structCsv.geth_ITEM_SPOIL()));
                            // ■20安全在庫量
                            if ((String) v.get(CSV_COLNO_SAFETY_STOCK) == null || ("").equals((String) v.get(CSV_COLNO_SAFETY_STOCK)) == true)
                            {
                                structCsv.seth_SAFETY_STOCK((String)null);
                            } else {
                                structCsv.seth_SAFETY_STOCK((String) v.get(CSV_COLNO_SAFETY_STOCK));
                            }
                            structCsv.seth_SAFETY_STOCK(trim(structCsv.geth_SAFETY_STOCK()));
                            // ■21ロットまとめ区分
                            if ((String) v.get(CSV_COLNO_LOT_SIZING_TYP) == null || ("").equals((String) v.get(CSV_COLNO_LOT_SIZING_TYP)) == true)
                            {
                                structCsv.seth_LOT_SIZING_TYP((String)null);
                            } else {
                                structCsv.seth_LOT_SIZING_TYP((String) v.get(CSV_COLNO_LOT_SIZING_TYP));
                            }
                            structCsv.seth_LOT_SIZING_TYP(trim(structCsv.geth_LOT_SIZING_TYP()));
                            // ■22最大まとめ期間
                            if ((String) v.get(CSV_COLNO_MAX_PERIOD) == null || ("").equals((String) v.get(CSV_COLNO_MAX_PERIOD)) == true)
                            {
                                structCsv.seth_MAX_PERIOD((String)null);
                            } else {
                                structCsv.seth_MAX_PERIOD((String) v.get(CSV_COLNO_MAX_PERIOD));
                            }
                            structCsv.seth_MAX_PERIOD(trim(structCsv.geth_MAX_PERIOD()));
                            // ■23最大手配数
                            if ((String) v.get(CSV_COLNO_MAX_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_MAX_ODR_QTY)) == true)
                            {
                                structCsv.seth_MAX_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_MAX_ODR_QTY((String) v.get(CSV_COLNO_MAX_ODR_QTY));
                            }
                            structCsv.seth_MAX_ODR_QTY(trim(structCsv.geth_MAX_ODR_QTY()));
                            // ■24発注点在庫数
                            if ((String) v.get(CSV_COLNO_ODR_POINT) == null || ("").equals((String) v.get(CSV_COLNO_ODR_POINT)) == true)
                            {
                                structCsv.seth_ODR_POINT((String)null);
                            } else {
                                structCsv.seth_ODR_POINT((String) v.get(CSV_COLNO_ODR_POINT));
                            }
                            structCsv.seth_ODR_POINT(trim(structCsv.geth_ODR_POINT()));
                            // ■25定量発注数
                            if ((String) v.get(CSV_COLNO_FIXED_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_FIXED_ODR_QTY)) == true)
                            {
                                structCsv.seth_FIXED_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_FIXED_ODR_QTY((String) v.get(CSV_COLNO_FIXED_ODR_QTY));
                            }
                            structCsv.seth_FIXED_ODR_QTY(trim(structCsv.geth_FIXED_ODR_QTY()));
                            // ■26最小手配数
                            if ((String) v.get(CSV_COLNO_MIN_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_MIN_ODR_QTY)) == true)
                            {
                                structCsv.seth_MIN_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_MIN_ODR_QTY((String) v.get(CSV_COLNO_MIN_ODR_QTY));
                            }
                            structCsv.seth_MIN_ODR_QTY(trim(structCsv.geth_MIN_ODR_QTY()));
                            // ■27まるめ単位
                            if ((String) v.get(CSV_COLNO_MUL_ODR_QTY) == null || ("").equals((String) v.get(CSV_COLNO_MUL_ODR_QTY)) == true)
                            {
                                structCsv.seth_MUL_ODR_QTY((String)null);
                            } else {
                                structCsv.seth_MUL_ODR_QTY((String) v.get(CSV_COLNO_MUL_ODR_QTY));
                            }
                            structCsv.seth_MUL_ODR_QTY(trim(structCsv.geth_MUL_ODR_QTY()));
                            // ■28出庫区分
                            if ((String) v.get(CSV_COLNO_ISSUE_TYP) == null || ("").equals((String) v.get(CSV_COLNO_ISSUE_TYP)) == true)
                            {
                                structCsv.seth_ISSUE_TYP((String)null);
                            } else {
                                structCsv.seth_ISSUE_TYP((String) v.get(CSV_COLNO_ISSUE_TYP));
                            }
                            structCsv.seth_ISSUE_TYP(trim(structCsv.geth_ISSUE_TYP()));
                            // ■29MPS品目フラグ
                            if ((String) v.get(CSV_COLNO_MPS_FLG) == null || ("").equals((String) v.get(CSV_COLNO_MPS_FLG)) == true)
                            {
                                structCsv.seth_MPS_FLG((String)null);
                            } else {
                                structCsv.seth_MPS_FLG((String) v.get(CSV_COLNO_MPS_FLG));
                            }
                            structCsv.seth_MPS_FLG(trim(structCsv.geth_MPS_FLG()));
                            // ■30受入検査区分
                            if ((String) v.get(CSV_COLNO_ACPT_INSPC_TYP) == null || ("").equals((String) v.get(CSV_COLNO_ACPT_INSPC_TYP)) == true)
                            {
                                structCsv.seth_ACPT_INSPC_TYP((String)null);
                            } else {
                                structCsv.seth_ACPT_INSPC_TYP((String) v.get(CSV_COLNO_ACPT_INSPC_TYP));
                            }
                            structCsv.seth_ACPT_INSPC_TYP(trim(structCsv.geth_ACPT_INSPC_TYP()));
                            // ■31製品区分
                            if ((String) v.get(CSV_COLNO_PRODUCT_TYP) == null || ("").equals((String) v.get(CSV_COLNO_PRODUCT_TYP)) == true)
                            {
                                structCsv.seth_PRODUCT_TYP((String)null);
                            } else {
                                structCsv.seth_PRODUCT_TYP((String) v.get(CSV_COLNO_PRODUCT_TYP));
                            }
                            structCsv.seth_PRODUCT_TYP(trim(structCsv.geth_PRODUCT_TYP()));
                            // ■32管理コード
                            if ((String) v.get(CSV_COLNO_CLASIFICATION_CD) == null || ("").equals((String) v.get(CSV_COLNO_CLASIFICATION_CD)) == true)
                            {
                                structCsv.seth_CLASIFICATION_CD((String)null);
                            } else {
                                structCsv.seth_CLASIFICATION_CD((String) v.get(CSV_COLNO_CLASIFICATION_CD));
                            }
                            // ■33単位重量
                            if ((String) v.get(CSV_COLNO_UNIT_WEIGHT) == null || ("").equals((String) v.get(CSV_COLNO_UNIT_WEIGHT)) == true)
                            {
                                structCsv.seth_UNIT_WEIGHT((String)null);
                            } else {
                                structCsv.seth_UNIT_WEIGHT((String) v.get(CSV_COLNO_UNIT_WEIGHT));
                            }
                            structCsv.seth_UNIT_WEIGHT(trim(structCsv.geth_UNIT_WEIGHT()));
                            // ■34棚卸区分
                            if ((String) v.get(CSV_COLNO_ABC_TYP) == null || ("").equals((String) v.get(CSV_COLNO_ABC_TYP)) == true)
                            {
                                structCsv.seth_ABC_TYP((String)null);
                            } else {
                                structCsv.seth_ABC_TYP((String) v.get(CSV_COLNO_ABC_TYP));
                            }
                            structCsv.seth_ABC_TYP(trim(structCsv.geth_ABC_TYP()));
                            // ■35作業実績区分
                            if ((String) v.get(CSV_COLNO_OPR_RSLT_TYP) == null || ("").equals((String) v.get(CSV_COLNO_OPR_RSLT_TYP)) == true)
                            {
                                structCsv.seth_OPR_RSLT_TYP((String)null);
                            } else {
                                structCsv.seth_OPR_RSLT_TYP((String) v.get(CSV_COLNO_OPR_RSLT_TYP));
                            }
                            structCsv.seth_OPR_RSLT_TYP(trim(structCsv.geth_OPR_RSLT_TYP()));
                            // ■36受給品区分
                            if ((String) v.get(CSV_COLNO_SPL_ITEM_TYP) == null || ("").equals((String) v.get(CSV_COLNO_SPL_ITEM_TYP)) == true)
                            {
                                structCsv.seth_SPL_ITEM_TYP((String)null);
                            } else {
                                structCsv.seth_SPL_ITEM_TYP((String) v.get(CSV_COLNO_SPL_ITEM_TYP));
                            }
                            structCsv.seth_SPL_ITEM_TYP(trim(structCsv.geth_SPL_ITEM_TYP()));
                            // ■37消費税コード
                            if ((String) v.get(CSV_COLNO_TAX_CD) == null || ("").equals((String) v.get(CSV_COLNO_TAX_CD)) == true)
                            {
                                structCsv.seth_TAX_CD((String)null);
                            } else {
                                structCsv.seth_TAX_CD((String) v.get(CSV_COLNO_TAX_CD));
                            }
                            // ■38カレンダ番号
                            if ((String) v.get(CSV_COLNO_CAL_NO) == null || ("").equals((String) v.get(CSV_COLNO_CAL_NO)) == true)
                            {
                                structCsv.seth_CAL_NO((String)null);
                            } else {
                                structCsv.seth_CAL_NO((String) v.get(CSV_COLNO_CAL_NO));
                            }
                            structCsv.seth_CAL_NO(trim(structCsv.geth_CAL_NO()));
                            // ■39保管区コード
                            if ((String) v.get(CSV_COLNO_WH_CD) == null || ("").equals((String) v.get(CSV_COLNO_WH_CD)) == true)
                            {
                                structCsv.seth_WH_CD((String)null);
                            } else {
                                structCsv.seth_WH_CD((String) v.get(CSV_COLNO_WH_CD));
                            }
// 2008/07/25 SYSCOM 磯部 ADD START
                            // ■40工数管理品目区分
                            if ((String) v.get(CSV_COLNO_MANHOUR_TYP) == null || ("").equals((String) v.get(CSV_COLNO_MANHOUR_TYP)) == true)
                            {
                                structCsv.seth_MANHOUR_TYP((String)null);
                            } else {
                                structCsv.seth_MANHOUR_TYP((String) v.get(CSV_COLNO_MANHOUR_TYP));
                            }
                            structCsv.seth_MANHOUR_TYP(trim(structCsv.geth_MANHOUR_TYP()));
// 2008/07/25 SYSCOM 磯部 ADD END
							// ■41保管区分
							if ((String) v.get(CSV_COLNO_DEPO_TYP) == null || ("").equals((String) v.get(CSV_COLNO_DEPO_TYP)) == true)
							{
								structCsv.seth_DEPO_TYP((String)null);
							} else {
								structCsv.seth_DEPO_TYP((String) v.get(CSV_COLNO_DEPO_TYP));
							}
							// ■42ロット管理フラグ
							if ((String) v.get(CSV_COLNO_LOT_CTRL_FLG) == null || ("").equals((String) v.get(CSV_COLNO_LOT_CTRL_FLG)) == true)
							{
								structCsv.seth_LOT_CTRL_FLG((String)null);
							} else {
								structCsv.seth_LOT_CTRL_FLG((String) v.get(CSV_COLNO_LOT_CTRL_FLG));
							}
							// ■43ロット採番区分
							if ((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP) == null || ("").equals((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP)) == true)
							{
								structCsv.seth_LOT_NUMBERING_TYP((String)null);
							} else {
								structCsv.seth_LOT_NUMBERING_TYP((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP));
							}
							// ■44品質期限年数
							if ((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR) == null || ("").equals((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR)) == true)
							{
								structCsv.seth_BEST_BEFORE_YEAR((String)null);
							} else {
								structCsv.seth_BEST_BEFORE_YEAR((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR));
							}
							// ■45品質期限月数
							if ((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH) == null || ("").equals((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH)) == true)
							{
								structCsv.seth_BEST_BEFORE_MONTH((String)null);
							} else {
								structCsv.seth_BEST_BEFORE_MONTH((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH));
							}

							// ■46品質期限日数
							if ((String) v.get(CSV_COLNO_BEST_BEFORE_DAY) == null || ("").equals((String) v.get(CSV_COLNO_BEST_BEFORE_DAY)) == true)
							{
								structCsv.seth_BEST_BEFORE_DAY((String)null);
							} else {
								structCsv.seth_BEST_BEFORE_DAY((String) v.get(CSV_COLNO_BEST_BEFORE_DAY));
							}

//20150803 ADD START BY SYSCOM
							// ■47負担部門コード
							if ((String) v.get(CSV_COLNO_DEPT_CD) == null || ("").equals((String) v.get(CSV_COLNO_DEPT_CD)) == true)
							{
								structCsv.seth_DEPT_CD((String)null);
							} else {
								structCsv.seth_DEPT_CD((String) v.get(CSV_COLNO_DEPT_CD));
							}
                        	
							// ■48プロジェクトコード
							if ((String) v.get(CSV_COLNO_PJ_CD) == null || ("").equals((String) v.get(CSV_COLNO_PJ_CD)) == true)
							{
								structCsv.seth_PJ_CD((String)null);
							} else {
								structCsv.seth_PJ_CD((String) v.get(CSV_COLNO_PJ_CD));
							}
                        	
							// ■49セグメント1
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_1) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_1)) == true)
							{
								structCsv.seth_SEG_CONTENTS_1((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_1((String) v.get(CSV_COLNO_SEG_CONTENTS_1));
							}
                        	
							// ■50セグメント2
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_2) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_2)) == true)
							{
								structCsv.seth_SEG_CONTENTS_2((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_2((String) v.get(CSV_COLNO_SEG_CONTENTS_2));
							}
                        	
							// ■51セグメント3
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_3) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_3)) == true)
							{
								structCsv.seth_SEG_CONTENTS_3((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_3((String) v.get(CSV_COLNO_SEG_CONTENTS_3));
							}
                        	
							// ■52セグメント4
							if ((String) v.get(CSV_COLNO_SEG_CONTENTS_4) == null || ("").equals((String) v.get(CSV_COLNO_SEG_CONTENTS_4)) == true)
							{
								structCsv.seth_SEG_CONTENTS_4((String)null);
							} else {
								structCsv.seth_SEG_CONTENTS_4((String) v.get(CSV_COLNO_SEG_CONTENTS_4));
							}
//20150803 ADD END BY SYSCOM
							// ■53備考1
							if ((String) v.get(CSV_COLNO_REMARK1) == null || ("").equals((String) v.get(CSV_COLNO_REMARK1)) == true)
							{
								structCsv.seth_REMARK1((String)null);
							} else {
								structCsv.seth_REMARK1((String) v.get(CSV_COLNO_REMARK1));
							}

							// ■54備考2
							if ((String) v.get(CSV_COLNO_REMARK2) == null || ("").equals((String) v.get(CSV_COLNO_REMARK2)) == true)
							{
								structCsv.seth_REMARK2((String)null);
							} else {
								structCsv.seth_REMARK2((String) v.get(CSV_COLNO_REMARK2));
							}

							// ■55品目分類01コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_01_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_01_CD((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD));
							}

							// ■56品目分類02コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_02_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_02_CD((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD));
							}

							// ■57品目分類03コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_03_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_03_CD((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD));
							}

							// ■58品目分類04コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_04_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_04_CD((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD));
							}

							// ■59品目分類05コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_05_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_05_CD((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD));
							}

							// ■60品目分類06コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_06_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_06_CD((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD));
							}

							// ■61品目分類07コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_07_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_07_CD((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD));
							}
                        	
							// ■62品目分類08コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_08_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_08_CD((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD));
							}

							// ■63品目分類09コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_09_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_09_CD((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD));
							}

							// ■64品目分類10コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_10_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_10_CD((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD));
							}

							// ■65品目分類11コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_11_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_11_CD((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD));
							}

							// ■66品目分類12コード
							if ((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD) == null || ("").equals((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD)) == true)
							{
								structCsv.seth_ITEM_CLASS_12_CD((String)null);
							} else {
								structCsv.seth_ITEM_CLASS_12_CD((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD));
							}

                            structCsv.setw_COLUMN_FLG((String)null);        // 正常取込場合は、変数COLUMN_FLGにnullをセットする。
                        }
                        else
                        {
                            // ＣＳＶの項目をリストデータ化
                            // ■1品目番号
                            structCsv.seth_ITEM_CD((String) v.get(CSV_COLNO_ITEM_CD));
                            // CSV出力の品目番号
                            structCsv.setOUT_ITEM_CD(structCsv.geth_ITEM_CD());
                            // \の場合、\\で置換処理
                            structCsv.seth_ITEM_CD(replaceSlash(structCsv.geth_ITEM_CD()));
                            // ■2品目名チェック
                            if(intColNum > CSV_COLNO_ITEM_NAME)
                            {
                                structCsv.seth_ITEM_NAME((String) v.get(CSV_COLNO_ITEM_NAME));
                            } else {
                                structCsv.seth_ITEM_NAME((String)null);
                            }
                            // ■3図面番号チェック
                            if(intColNum > CSV_COLNO_DRAW_CD)
                            {
                                structCsv.seth_DRAW_CD((String) v.get(CSV_COLNO_DRAW_CD));
                            } else {
                                structCsv.seth_DRAW_CD((String)null);
                            }
                            // ■4規格チェック
                            if(intColNum > CSV_COLNO_SPEC)
                            {
                                structCsv.seth_SPEC((String) v.get(CSV_COLNO_SPEC));
                            } else {
                                structCsv.seth_SPEC((String)null);
                            }
                            // ■5レベル番号チェック
                            if(intColNum > CSV_COLNO_HIGH_LEVEL_NO)
                            {
                                structCsv.seth_HIGH_LEVEL_NO((String) v.get(CSV_COLNO_HIGH_LEVEL_NO));
                            } else {
                                structCsv.seth_HIGH_LEVEL_NO((String)null);
                            }
                            // ■6品目手配区分チェック
                            if(intColNum > CSV_COLNO_MRP_ODR_TYP)
                            {
                                structCsv.seth_MRP_ODR_TYP((String) v.get(CSV_COLNO_MRP_ODR_TYP));
                            } else {
                                structCsv.seth_MRP_ODR_TYP((String)null);
                            }
                            // ■7品目内外作区分チェック
                            if(intColNum > CSV_COLNO_OUTSIDE_TYP)
                            {
                                structCsv.seth_OUTSIDE_TYP((String) v.get(CSV_COLNO_OUTSIDE_TYP));
                            } else {
                                structCsv.seth_OUTSIDE_TYP((String)null);
                            }
                            // ■8荷姿管理フラグチェック
                            if(intColNum > CSV_COLNO_STOCK_UNIT_FLG)
                            {
                                structCsv.seth_STOCK_UNIT_FLG((String) v.get(CSV_COLNO_STOCK_UNIT_FLG));
                            } else {
                                structCsv.seth_STOCK_UNIT_FLG((String)null);
                            }
                            // ■9計量単位チェック
                            if(intColNum > CSV_COLNO_STOCK_UNIT)
                            {
                                structCsv.seth_STOCK_UNIT((String) v.get(CSV_COLNO_STOCK_UNIT));
                            } else {
                                structCsv.seth_STOCK_UNIT((String)null);
                            }
                            // ■10荷姿計量単位チェック
                            if(intColNum > CSV_COLNO_PKG_UNIT)
                            {
                                structCsv.seth_PKG_UNIT((String) v.get(CSV_COLNO_PKG_UNIT));
                            } else {
                                structCsv.seth_PKG_UNIT((String)null);
                            }
                            // ■11荷姿単位数チェック
                            if(intColNum > CSV_COLNO_PKG_UNIT_QTY)
                            {
                                structCsv.seth_PKG_UNIT_QTY((String) v.get(CSV_COLNO_PKG_UNIT_QTY));
                            } else {
                                structCsv.seth_PKG_UNIT_QTY((String)null);
                            }
                            // ■12荷姿単位数チェック
                            if(intColNum > CSV_COLNO_UNIT_QTY_TYP)
                            {
                                structCsv.seth_UNIT_QTY_TYP((String) v.get(CSV_COLNO_UNIT_QTY_TYP));
                            } else {
                                structCsv.seth_UNIT_QTY_TYP((String)null);
                            }
                            // ■13品目手配リードタイムチェック
                            if(intColNum > CSV_COLNO_ODR_LT)
                            {
                                structCsv.seth_ODR_LT((String) v.get(CSV_COLNO_ODR_LT));
                            } else {
                                structCsv.seth_ODR_LT((String)null);
                            }
                            // ■14品目手配リードタイムチェック
                            if(intColNum > CSV_COLNO_FIXED_LT)
                            {
                                structCsv.seth_FIXED_LT((String) v.get(CSV_COLNO_FIXED_LT));
                            } else {
                                structCsv.seth_FIXED_LT((String)null);
                            }
                            // ■15品目比例分リードタイムチェック
                            if(intColNum > CSV_COLNO_PROP_LT)
                            {
                                structCsv.seth_PROP_LT((String) v.get(CSV_COLNO_PROP_LT));
                            } else {
                                structCsv.seth_PROP_LT((String)null);
                            }
                            // ■16安全日数チェック
                            if(intColNum > CSV_COLNO_SAFETY_LT)
                            {
                                structCsv.seth_SAFETY_LT((String) v.get(CSV_COLNO_SAFETY_LT));
                            } else {
                                structCsv.seth_SAFETY_LT((String)null);
                            }
                            // ■17払出リードタイムチェック
                            if(intColNum > CSV_COLNO_ISSUE_LT)
                            {
                                structCsv.seth_ISSUE_LT((String) v.get(CSV_COLNO_ISSUE_LT));
                            } else {
                                structCsv.seth_ISSUE_LT((String)null);
                            }
                            // ■18品目比例分ロットサイズチェック
                            if(intColNum > CSV_COLNO_PROP_LOT_SIZE)
                            {
                                structCsv.seth_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PROP_LOT_SIZE));
                            } else {
                                structCsv.seth_PROP_LOT_SIZE((String)null);
                            }
                            // ■19品目仕損率チェック
                            if(intColNum > CSV_COLNO_ITEM_SPOIL)
                            {
                                structCsv.seth_ITEM_SPOIL((String) v.get(CSV_COLNO_ITEM_SPOIL));
                            } else {
                                structCsv.seth_ITEM_SPOIL((String)null);
                            }
                            // ■20安全在庫量チェック
                            if(intColNum > CSV_COLNO_SAFETY_STOCK)
                            {
                                structCsv.seth_SAFETY_STOCK((String) v.get(CSV_COLNO_SAFETY_STOCK));
                            } else {
                                structCsv.seth_SAFETY_STOCK((String)null);
                            }
                            // ■21ロットまとめ区分チェック
                            if(intColNum > CSV_COLNO_LOT_SIZING_TYP)
                            {
                                structCsv.seth_LOT_SIZING_TYP((String) v.get(CSV_COLNO_LOT_SIZING_TYP));
                            } else {
                                structCsv.seth_LOT_SIZING_TYP((String)null);
                            }
                            // ■22最大まとめ期間チェック
                            if(intColNum > CSV_COLNO_MAX_PERIOD)
                            {
                                structCsv.seth_MAX_PERIOD((String) v.get(CSV_COLNO_MAX_PERIOD));
                            } else {
                                structCsv.seth_MAX_PERIOD((String)null);
                            }
                            // ■23最大手配数チェック
                            if(intColNum > CSV_COLNO_MAX_ODR_QTY)
                            {
                                structCsv.seth_MAX_ODR_QTY((String) v.get(CSV_COLNO_MAX_ODR_QTY));
                            } else {
                                structCsv.seth_MAX_ODR_QTY((String)null);
                            }
                            // ■24発注点在庫数チェック
                            if(intColNum > CSV_COLNO_ODR_POINT)
                            {
                                structCsv.seth_ODR_POINT((String) v.get(CSV_COLNO_ODR_POINT));
                            } else {
                                structCsv.seth_ODR_POINT((String)null);
                            }
                            // ■25定量発注数チェック
                            if(intColNum > CSV_COLNO_FIXED_ODR_QTY)
                            {
                                structCsv.seth_FIXED_ODR_QTY((String) v.get(CSV_COLNO_FIXED_ODR_QTY));
                            } else {
                                structCsv.seth_FIXED_ODR_QTY((String)null);
                            }
                            // ■26最小手配数チェック
                            if(intColNum > CSV_COLNO_MIN_ODR_QTY)
                            {
                                structCsv.seth_MIN_ODR_QTY((String) v.get(CSV_COLNO_MIN_ODR_QTY));
                            } else {
                                structCsv.seth_MIN_ODR_QTY((String)null);
                            }
                            // ■27まるめ単位チェック
                            if(intColNum > CSV_COLNO_MUL_ODR_QTY)
                            {
                                structCsv.seth_MUL_ODR_QTY((String) v.get(CSV_COLNO_MUL_ODR_QTY));
                            } else {
                                structCsv.seth_MUL_ODR_QTY((String)null);
                            }
                            // ■28出庫区分チェック
                            if(intColNum > CSV_COLNO_ISSUE_TYP)
                            {
                                structCsv.seth_ISSUE_TYP((String) v.get(CSV_COLNO_ISSUE_TYP));
                            } else {
                                structCsv.seth_ISSUE_TYP((String)null);
                            }
                            // ■29MPS品目フラグチェック
                            if(intColNum > CSV_COLNO_MPS_FLG)
                            {
                                structCsv.seth_MPS_FLG((String) v.get(CSV_COLNO_MPS_FLG));
                            } else {
                                structCsv.seth_MPS_FLG((String)null);
                            }
                            // ■30受入検査区分チェック
                            if(intColNum > CSV_COLNO_ACPT_INSPC_TYP)
                            {
                                structCsv.seth_ACPT_INSPC_TYP((String) v.get(CSV_COLNO_ACPT_INSPC_TYP));
                            } else {
                                structCsv.seth_ACPT_INSPC_TYP((String)null);
                            }
                            // ■31製品区分チェック
                            if(intColNum > CSV_COLNO_PRODUCT_TYP)
                            {
                                structCsv.seth_PRODUCT_TYP((String) v.get(CSV_COLNO_PRODUCT_TYP));
                            } else {
                                structCsv.seth_PRODUCT_TYP((String)null);
                            }
                            // ■32管理コードチェック
                            if(intColNum > CSV_COLNO_CLASIFICATION_CD)
                            {
                                structCsv.seth_CLASIFICATION_CD((String) v.get(CSV_COLNO_CLASIFICATION_CD));
                            } else {
                                structCsv.seth_CLASIFICATION_CD((String)null);
                            }
                            // ■33単位重量チェック
                            if(intColNum > CSV_COLNO_UNIT_WEIGHT)
                            {
                                structCsv.seth_UNIT_WEIGHT((String) v.get(CSV_COLNO_UNIT_WEIGHT));
                            } else {
                                structCsv.seth_UNIT_WEIGHT((String)null);
                            }
                            // ■34棚卸区分チェック
                            if(intColNum > CSV_COLNO_ABC_TYP)
                            {
                                structCsv.seth_ABC_TYP((String) v.get(CSV_COLNO_ABC_TYP));
                            } else {
                                structCsv.seth_ABC_TYP((String)null);
                            }
                            // ■35作業実績区分チェック
                            if(intColNum > CSV_COLNO_OPR_RSLT_TYP)
                            {
                                structCsv.seth_OPR_RSLT_TYP((String) v.get(CSV_COLNO_OPR_RSLT_TYP));
                            } else {
                                structCsv.seth_OPR_RSLT_TYP((String)null);
                            }
                            // ■36受給品区分チェック
                            if(intColNum > CSV_COLNO_SPL_ITEM_TYP)
                            {
                                structCsv.seth_SPL_ITEM_TYP((String) v.get(CSV_COLNO_SPL_ITEM_TYP));
                            } else {
                                structCsv.seth_SPL_ITEM_TYP((String)null);
                            }
                            // ■37消費税コードチェック
                            if(intColNum > CSV_COLNO_TAX_CD)
                            {
                                structCsv.seth_TAX_CD((String) v.get(CSV_COLNO_TAX_CD));
                            } else {
                                structCsv.seth_TAX_CD((String)null);
                            }
                            // ■38カレンダ番号チェック
                            if(intColNum > CSV_COLNO_CAL_NO)
                            {
                                structCsv.seth_CAL_NO((String) v.get(CSV_COLNO_CAL_NO));
                            } else {
                                structCsv.seth_CAL_NO((String)null);
                            }
                            // ■39保管区コードチェック
                            if(intColNum > CSV_COLNO_WH_CD)
                            {
                                structCsv.seth_WH_CD((String) v.get(CSV_COLNO_WH_CD));
                            } else {
                                structCsv.seth_WH_CD((String)null);
                            }
// 2008/07/25 SYSCOM 磯部 ADD START
                            // ■40工数管理品目区分チェック
                            if(intColNum > CSV_COLNO_MANHOUR_TYP)
                            {
                                structCsv.seth_MANHOUR_TYP((String) v.get(CSV_COLNO_MANHOUR_TYP));
                            } else {
                                structCsv.seth_MANHOUR_TYP((String)null);
                            }
// 2008/07/25 SYSCOM 磯部 ADD END
							// ■41保管区分チェック
							if (intColNum > CSV_COLNO_DEPO_TYP)
							{
								structCsv.seth_DEPO_TYP((String) v.get(CSV_COLNO_DEPO_TYP));
							} else {
								structCsv.seth_DEPO_TYP((String)null);
							}
							// ■42ロット管理フラグチェック
							if (intColNum > CSV_COLNO_LOT_CTRL_FLG)
							{
								structCsv.seth_LOT_CTRL_FLG((String) v.get(CSV_COLNO_LOT_CTRL_FLG));
							} else {
								structCsv.seth_LOT_CTRL_FLG((String)null);
							}
							// ■43ロット採番区分チェック
							if (intColNum > CSV_COLNO_LOT_NUMBERING_TYP)
							{
								structCsv.seth_LOT_NUMBERING_TYP((String) v.get(CSV_COLNO_LOT_NUMBERING_TYP));
							} else {
								structCsv.seth_LOT_NUMBERING_TYP((String)null);
							}
							// ■44品質期限年数
							if (intColNum > CSV_COLNO_BEST_BEFORE_YEAR)
							{
								structCsv.seth_BEST_BEFORE_YEAR((String) v.get(CSV_COLNO_BEST_BEFORE_YEAR));
							} else {
								structCsv.seth_BEST_BEFORE_YEAR((String)null);
							}
							// ■45品質期限月数
							if (intColNum > CSV_COLNO_BEST_BEFORE_MONTH)
							{
								structCsv.seth_BEST_BEFORE_MONTH((String) v.get(CSV_COLNO_BEST_BEFORE_MONTH));
							} else {
								structCsv.seth_BEST_BEFORE_MONTH((String)null);
							}

							// ■46品質期限日数
							if (intColNum > CSV_COLNO_BEST_BEFORE_DAY)
							{
								structCsv.seth_BEST_BEFORE_DAY((String) v.get(CSV_COLNO_BEST_BEFORE_DAY));
							} else {
								structCsv.seth_BEST_BEFORE_DAY((String)null);
							}
							
//20150803 ADD START BY SYSCOM
							// ■47負担部門コード
							if (intColNum > CSV_COLNO_DEPT_CD)
							{
								structCsv.seth_DEPT_CD((String) v.get(CSV_COLNO_DEPT_CD));
							} else {
								structCsv.seth_DEPT_CD((String)null);
							}
                        	
                        	// ■48プロジェクトコード
							if (intColNum > CSV_COLNO_PJ_CD)
							{
								structCsv.seth_PJ_CD((String) v.get(CSV_COLNO_PJ_CD));
							} else {
								structCsv.seth_PJ_CD((String)null);
							}
                        	
                        	// ■49セグメント1
							if (intColNum > CSV_COLNO_SEG_CONTENTS_1)
							{
								structCsv.seth_SEG_CONTENTS_1((String) v.get(CSV_COLNO_SEG_CONTENTS_1));
							} else {
								structCsv.seth_SEG_CONTENTS_1((String)null);
							}
                        	
                        	// ■50セグメント2
							if (intColNum > CSV_COLNO_SEG_CONTENTS_2)
							{
								structCsv.seth_SEG_CONTENTS_2((String) v.get(CSV_COLNO_SEG_CONTENTS_2));
							} else {
								structCsv.seth_SEG_CONTENTS_2((String)null);
							}
                        	// ■51セグメント3
							if (intColNum > CSV_COLNO_SEG_CONTENTS_3)
							{
								structCsv.seth_SEG_CONTENTS_3((String) v.get(CSV_COLNO_SEG_CONTENTS_3));
							} else {
								structCsv.seth_SEG_CONTENTS_3((String)null);
							}
                        	
                        	// ■52セグメント4
							if (intColNum > CSV_COLNO_SEG_CONTENTS_4)
							{
								structCsv.seth_SEG_CONTENTS_4((String) v.get(CSV_COLNO_SEG_CONTENTS_4));
							} else {
								structCsv.seth_SEG_CONTENTS_4((String)null);
							}
//20150803 ADD END BY SYSCOM
							// ■53備考1
							if (intColNum > CSV_COLNO_REMARK1)
							{
								structCsv.seth_REMARK1((String) v.get(CSV_COLNO_REMARK1));
							} else {
								structCsv.seth_REMARK1((String)null);
							}

							// ■54備考2
							if (intColNum > CSV_COLNO_REMARK2)
							{
								structCsv.seth_REMARK2((String) v.get(CSV_COLNO_REMARK2));
							} else {
								structCsv.seth_REMARK2((String)null);
							}
                        	
							// ■55品目分類01コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_01_CD)
							{
								structCsv.seth_ITEM_CLASS_01_CD((String) v.get(CSV_COLNO_ITEM_CLASS_01_CD));
							} else {
								structCsv.seth_ITEM_CLASS_01_CD((String)null);
							}
                        	
							// ■56品目分類02コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_02_CD)
							{
								structCsv.seth_ITEM_CLASS_02_CD((String) v.get(CSV_COLNO_ITEM_CLASS_02_CD));
							} else {
								structCsv.seth_ITEM_CLASS_02_CD((String)null);
							}
                        	
							// ■57品目分類03コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_03_CD)
							{
								structCsv.seth_ITEM_CLASS_03_CD((String) v.get(CSV_COLNO_ITEM_CLASS_03_CD));
							} else {
								structCsv.seth_ITEM_CLASS_03_CD((String)null);
							}
                        	
							// ■58品目分類04コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_04_CD)
							{
								structCsv.seth_ITEM_CLASS_04_CD((String) v.get(CSV_COLNO_ITEM_CLASS_04_CD));
							} else {
								structCsv.seth_ITEM_CLASS_04_CD((String)null);
							}
                        	
							// ■59品目分類05コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_05_CD)
							{
								structCsv.seth_ITEM_CLASS_05_CD((String) v.get(CSV_COLNO_ITEM_CLASS_05_CD));
							} else {
								structCsv.seth_ITEM_CLASS_05_CD((String)null);
							}
                        	
							// ■60品目分類06コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_06_CD)
							{
								structCsv.seth_ITEM_CLASS_06_CD((String) v.get(CSV_COLNO_ITEM_CLASS_06_CD));
							} else {
								structCsv.seth_ITEM_CLASS_06_CD((String)null);
							}
                        	
							// ■61品目分類07コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_07_CD)
							{
								structCsv.seth_ITEM_CLASS_07_CD((String) v.get(CSV_COLNO_ITEM_CLASS_07_CD));
							} else {
								structCsv.seth_ITEM_CLASS_07_CD((String)null);
							}
                        	
							// ■62品目分類08コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_08_CD)
							{
								structCsv.seth_ITEM_CLASS_08_CD((String) v.get(CSV_COLNO_ITEM_CLASS_08_CD));
							} else {
								structCsv.seth_ITEM_CLASS_08_CD((String)null);
							}
                        	
							// ■63品目分類09コード
                        	if (intColNum > CSV_COLNO_ITEM_CLASS_09_CD)
							{
								structCsv.seth_ITEM_CLASS_09_CD((String) v.get(CSV_COLNO_ITEM_CLASS_09_CD));
							} else {
								structCsv.seth_ITEM_CLASS_09_CD((String)null);
							}
                        	
							// ■64品目分類10コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_10_CD)
							{
								structCsv.seth_ITEM_CLASS_10_CD((String) v.get(CSV_COLNO_ITEM_CLASS_10_CD));
							} else {
								structCsv.seth_ITEM_CLASS_10_CD((String)null);
							}
                        	
							// ■65品目分類11コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_11_CD)
							{
								structCsv.seth_ITEM_CLASS_11_CD((String) v.get(CSV_COLNO_ITEM_CLASS_11_CD));
							} else {
								structCsv.seth_ITEM_CLASS_11_CD((String)null);
							}
                        	
							// ■66品目分類12コード
							if (intColNum > CSV_COLNO_ITEM_CLASS_12_CD)
							{
								structCsv.seth_ITEM_CLASS_12_CD((String) v.get(CSV_COLNO_ITEM_CLASS_12_CD));
							} else {
								structCsv.seth_ITEM_CLASS_12_CD((String)null);
							}
                            // 項目数が必要項目数未満OR以上のときは項目数過不足エラーでw_COLUMN_FLGにカラム数をセットする。
                            structCsv.setw_COLUMN_FLG(String.valueOf(intColNum));
                        }
                        // リスト追加
                        listCsv.add(structCsv);
                    }
                    else
                    {
                        //ベクター生成失敗エラー
                        logMessage = "csvReader.Vector was Failed... line:" + strsCsvData[i];
                        setSyslogConfig(logMessage);
                        listCsv = null;
                        break;
                    }
                }

                // ＣＳＶデータ件数（タイトル行は省く）
                if((listCsv == null) || (listCsv.size() <= 0))
                {
                    // 取込失敗またはデータなし
                    ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
                    msgStruct.addError( emsg );
                    sysLog.warning(emsg, getsysUSER_CD());
                    listCsv = null;
                }
                else
                {
                    // ＣＳＶ読込み件数ログ表示
                    ExpjMessage emsg = new ExpjMessage( "AH00043", ""+listCsv.size());
                    sysLog.config(emsg, getsysUSER_CD());
                }
            }
        } catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
        return listCsv;
    }

    /**
     * 両端のスペースを除く
     *
     * @param     input     入力値
     * @return  String  処理後値
     */
    private String trim(String input){
        if(null == input)return null;
        return input.trim();
    }
    /**
     * ＣＳＶデータ内容チェック処理
     *
     * @param   listCsv CSVデータリスト
     * @return  正常:true / エラー:false
     */
    private boolean checkCsvData(List listCsv) throws BusinessProcessException, FoundationException
    {

        // ログ出力情報格納用
        boolean bSuccess = true;    // 処理成功フラグ初期化
        int intSuccessCount = 0;    // チェック正常レコード件数
        int intWarningCount = 0;    // チェックワーニングレコード件数
        int intWarningCtByData = 0; // 統計用チェックワーニングレコード件数
        int intCsvDataCount = 0;    // 対象データ件数
        int ErrlineNo = 0;          // エラー行番号
// 2008/07/25 SYSCOM 磯部 ORIGINAL START
//        String CsvCnt = "39";       // CSV項目
// 2008/07/25 SYSCOM 磯部 ORIGINAL END
//20150803 MOD START BY SYSCOM
// 2008/07/25 SYSCOM 磯部 UPD START
        //String CsvCnt = "60";       // CSV項目
// 2008/07/25 SYSCOM 磯部 UPD END
    	String CsvCnt = "66";       // CSV項目
//20150803 MOD END BY SYSCOM
        String ErrItem = "";        // エラー項目
        String ErrCd = "";          // エラー区分
        String ErrNo = "";          // エラー番号
        String ErrMsg = "";         // エラーメッセージ
        int strLength = 0;          // 文字列の長さ取得
        boolean result = false;     // チェック結果格納

        // 多言語項目取得対応
        //String locale = "ja";//
        String locale = CoreTools.getLocale(sysUSER_CD);
        String property = "OrteusUserDic";
        String tkey = "";   // 多言語辞書取得キー
        boolean chkflg = false;         // 指定キーチェック用
        boolean chkPkeyflg = false;     // 指定キーチェック用2
        boolean chkHasErr = false;    // リスト中にエラーあるかどうか
        String  range1 = "1";      // 0.0001 ～ 99999999999999.9999
        String  range2 = "2";      // 0.0001 ～ 99999999999999.9999

        try {
            AA0150010Struct structCsv;
            intCsvDataCount = listCsv.size();
            // 配列生成
            String pKey1 [] = new String[intCsvDataCount];      // 主キー1(品目.品目番号)

            // CSVファイルの行数LOOP
            for(int i = 0; i < intCsvDataCount; i++)
            {
                // エラーフラグ初期化
                boolean bError = false;
                boolean bWarningCount = false; // チェックワーニングレコードフラグ初期化
                // CSV情報の取得
                structCsv = (AA0150010Struct)listCsv.get(i);
                // 項目数不足エラーチェック
                // ◆削除ラジオボタンが選択されないときチェックを行う。(※削除以外時)◆
                if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true && ("true").equals(_save_struct.getrdoDelete()) != true)
                {
                    ErrlineNo = i + 1;                  // エラー発生行(実際のエラー行)
                    // 多言語キーセット
                    tkey = "Expj.Cmt3099"; // Expj.Cmt3099=項目過不足
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(tkey, resource);

                    ErrCd = "1";                        // エラー区分
                    int cntColumn = Integer.parseInt(structCsv.getw_COLUMN_FLG());
                    if(cntColumn < CSV_NECESSARY_COLUMN){
                      ErrNo = "AA01500";                    // エラー番号
                  }else{
                      ErrNo = "AA01519";                    // エラー番号
                  }
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo,structCsv.getw_COLUMN_FLG());
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, structCsv.getw_COLUMN_FLG(),CSV_COLNO_99);
                    // エラーフラグ"true"にセット
                    bError = true;
                    chkHasErr = true;
                    // 次明細へ処理を移行(エラー行は飛ばす。)
                    continue;
                }
                ////////////////////////////////////////////////////////////////////////////////////
                // 個別チェック処理開始
                ////////////////////////////////////////////////////////////////////////////////////

// ■1品目番号 START==========================================================
                // 必須チェック 品目番号
                if(structCsv.geth_ITEM_CD() == null || ("").equals(structCsv.geth_ITEM_CD()) == true)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                    // 多言語キーセット
                    tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(tkey, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01505";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    chkHasErr = true;
                    // 次明細へ処理を移行
                    continue;
                }

                // 入力補助機能チェック 品目番号
                // 文字25桁以上の場合エラー
                strLength = StrLengthChk(structCsv.getOUT_ITEM_CD());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                    // 多言語キーセット
                    tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(tkey, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01501";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    chkHasErr = true;
                    // 次明細へ処理を移行
                    continue;
                }
                // 禁則文字があるの場合エラー
                int iHankaku = chkHankaku(structCsv.geth_ITEM_CD());
                if(iHankaku != 0)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                    // 多言語キーセット
                    tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(tkey, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01524";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    chkHasErr = true;
                    // 次明細へ処理を移行
                    continue;
                }
// ■1品目番号 END============================================================

                // ◆登録ラジオボタンが選択されたときのみチェックを行う。(※登録時のみ)◆
                if (("true").equals(_save_struct.getrdoInsert()) == true )
                {
// ●1品目番号マスタ存在チェック START========================================
                    if (chkflg == false)
                    {
                        // 1ループ目
                        // 品目番号を配列にセット
                        pKey1[i] = structCsv.geth_ITEM_CD();    // 品目番号
                        
                        // チェックフラグにtrueをセット
                        chkflg = true;
                    } else {
                        // 2ループ目以降
                        chkPkeyflg = true;
                        // 配列の最後から逆検索して同じ工場コード、品目番号、品目別作業コードが存在しないかチェックする。
                        for (int j = i - 1; j >= 0; j--)
                        {
                            if ((structCsv.geth_ITEM_CD()).equals(String.valueOf(pKey1[j])) == true )
                            {
                                // 配列内で一意キー違反(false)の場合確認フラグを"false"にセット。
                                chkPkeyflg = false;
                                // ループを抜ける。
                                break;
                            }
                        }

                        // 一意キー違反の場合エラー
                        if (chkPkeyflg == false)
                        {
                            ErrlineNo = i + 1;                                  // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                        // エラー区分
                            ErrNo = "AA00051";                                  // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 品目番号を配列にセット
                        pKey1[i] = structCsv.geth_ITEM_CD();    // 品目番号
                    }

                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    result = entity.mcheckM_ITEM.check(conn, struct);
                    if(result == true){
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00051";                              // エラー番号
                        //ErrMsg = "同一品目番号は追加できません。";        // エラーメッセージ
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

//                // 必須チェック 保管区コード
//                if(structCsv.geth_WH_CD() == null || ("").equals(structCsv.geth_WH_CD()) == true)
//                {
//                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                    // 多言語キーセット
//                    tkey = "Expj.WH_CD"; // Expj.WH_CD=保管区コード
//                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
//                    // 多言語項目取得セット
//                    ErrItem = CoreTools.getRBString(tkey, resource);
//
//                    ErrCd = "1";                                    // エラー区分
//                    ErrNo = "AA01506";                              // エラー番号
//                    // メッセージ取得 
//                    ExpjMessage emsg = new ExpjMessage(ErrNo);
//                    ErrMsg = emsg.getMessage(locale);
//
//                    // CSV出力(エラー)
//                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
//                    // w_COLUMN_FLG変数にエラー情報を退避。
//                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
//                    // エラーフラグ"true"にセット
//                    bError = true;
//                    chkHasErr = true;
//                    // 次明細へ処理を移行
//                    continue;
//                }

                if(structCsv.geth_WH_CD() != null && !("").equals(structCsv.geth_WH_CD())){
                    // 入力補助機能チェック 保管区コード
                    // 文字25桁以上の場合エラー
                    strLength = StrLengthChk(structCsv.geth_WH_CD());
                    if(strLength > 25)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.WH_CD"; // Expj.WH_CD=保管区コード
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01501";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    // 禁則文字があるの場合エラー
                    iHankaku = chkHankaku(structCsv.geth_WH_CD());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.WH_CD"; // Expj.WH_CD=保管区コード
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01524";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

                        // 登録時保管区コードマスタチェック
                        struct.setsetM_WH_WH_CD(structCsv.geth_WH_CD());
                        result = entity.mcheckM_WH.check(conn, struct);
                        if(result == false)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.WH_CD"; // Expj.WH_CD=保管区コード
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01009";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 品目別保管先優先順位チェック
                        struct.setsetM_WH_ITEM_CD(structCsv.geth_ITEM_CD());
                        struct.setsetM_WH_WH_CD(structCsv.geth_WH_CD());
                        result = entity.mcheckM_WH_PRIORITY.check(conn, struct);
                        if(result == true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.WH_CD"; // Expj.WH_CD=保管区コード
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "ZZ01102";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_WH_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                }


// ●1品目番号マスタ存在チェック END==========================================
                }   //登録時チェック end if

                // ◆更新ラジオボタンが選択されたときのみチェックを行う。(※更新/削除のみ)◆
                if (("true").equals(_save_struct.getrdoUpdate()) == true || ("true").equals(_save_struct.getrdoDelete()) == true )
                {
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    result = entity.mcheckM_ITEM.check(conn, struct);
                    if(result == false){
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01002";                              // エラー番号
                        //ErrMsg = "指定した品目番号は未登録です。";        // エラーメッセージ
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                }

                // ◆登録OR更新ラジオボタンが選択されたときのみチェックを行う。(※登録OR更新時)◆
                if (("true").equals(_save_struct.getrdoInsert()) == true || ("true").equals(_save_struct.getrdoUpdate()) == true )
                {

// ■2品目名 START============================================================
                    // 入力補助機能チェック 品目名
                    if(structCsv.geth_ITEM_NAME() != null && ("").equals(structCsv.geth_ITEM_NAME()) != true)
                    {
                        // 文字40桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_ITEM_NAME());
                        if(strLength > 40)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_NAME"; // Expj.ITEM_NAME=品目名
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_NAME );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }

// ■2品目名 END==============================================================

// ■3図面番号 START==========================================================
                    // 入力補助機能チェック 図面番号
                    if(structCsv.geth_DRAW_CD() != null && ("").equals(structCsv.geth_DRAW_CD()) != true)
                    {
                        // 文字25桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_DRAW_CD());
                        if(strLength > 25)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.DRAW_CD"; // Expj.DRAW_CD=図面番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DRAW_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 禁則文字があるの場合エラー
                        iHankaku = chkHankaku(structCsv.geth_DRAW_CD());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.DRAW_CD"; // Expj.DRAW_CD=図面番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01524";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DRAW_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■3図面番号 END============================================================

// ■4規格 START==============================================================
                    // 入力補助機能チェック 規格
                    if(structCsv.geth_SPEC() != null && ("").equals(structCsv.geth_SPEC()) != true)
                    {
                        // 文字80桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_SPEC());
                        if(strLength > 80)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SPEC"; // Expj.SPEC=規格
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPEC );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 禁則文字があるの場合エラー
                        iHankaku = chkHankaku(structCsv.geth_SPEC());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SPEC"; // Expj.SPEC=規格
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01524";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPEC );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■4規格 END================================================================

// ■5レベル番号 START========================================================
                    // 登録時のみレベル番号を"1":固定にする。
                    if (("true").equals(_save_struct.getrdoInsert()) == true)
                    {
                        // CSVファイルレベル番号が未設定だった場合、初期値1をセットする。
                        structCsv.seth_HIGH_LEVEL_NO("1");
                    }
// ■5レベル番号 END==========================================================

// ■6品目手配区分 START======================================================
                    // 種別チェック(整数) 品目手配区分
                    if(structCsv.geth_MRP_ODR_TYP() == null || ("").equals(structCsv.geth_MRP_ODR_TYP()) == true)
                    {
                        // CSVファイル品目手配区分が未設定だった場合、初期値1:製番をセットする。
                        structCsv.seth_MRP_ODR_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_MRP_ODR_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_MRP_ODR_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■6品目手配区分 END========================================================

// ■7品目内外作区分 START====================================================
                    // 種別チェック(整数) 品目内外作区分
                    if(structCsv.geth_OUTSIDE_TYP() == null || ("").equals(structCsv.geth_OUTSIDE_TYP()) == true)
                    {
                        // CSVファイル品目内外作区分が未設定だった場合、初期値1:内作をセットする。
                        structCsv.seth_OUTSIDE_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_OUTSIDE_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.OUTSIDE_TYP_4"; // Expj.OUTSIDE_TYP_4=品目内外作区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            //ErrMsg = "整数を設定してください。";          // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_OUTSIDE_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.OUTSIDE_TYP_4"; // Expj.OUTSIDE_TYP_4=品目内外作区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■7品目内外作区分 END======================================================

// ■8荷姿管理フラグ START====================================================
                    // 種別チェック(整数) 荷姿管理フラグ
                    if(structCsv.geth_STOCK_UNIT_FLG() == null || ("").equals(structCsv.geth_STOCK_UNIT_FLG()) == true)
                    {
                        // CSVファイル荷姿管理フラグが未設定だった場合、初期値0:荷姿管理しないをセットする。
                        structCsv.seth_STOCK_UNIT_FLG("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_STOCK_UNIT_FLG()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.STOCK_UNIT_FLG"; // Expj.STOCK_UNIT_FLG=荷姿管理フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT_FLG );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_STOCK_UNIT_FLG());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.STOCK_UNIT_FLG"; // Expj.STOCK_UNIT_FLG=荷姿管理フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT_FLG );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■8荷姿管理フラグ END======================================================

// ■9計量単位 START=========================================================
                    // 必須チェック 計量単位
					if(structCsv.geth_STOCK_UNIT()== null || ("").equals(structCsv.geth_STOCK_UNIT()) == true){
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=計量単位
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01525";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
					}
                    // 入力補助機能チェック 計量単位
                    if(structCsv.geth_STOCK_UNIT() != null && ("").equals(structCsv.geth_STOCK_UNIT()) != true)
                    {
                        // 文字12桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_STOCK_UNIT());
                        if(strLength > 12)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=計量単位
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 禁則文字があるの場合エラー
                        iHankaku = chkHankaku(structCsv.geth_STOCK_UNIT());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=計量単位
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01524";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }

// ■9計測単位 END===========================================================

// ■10荷姿計量単位 START=====================================================
                    // 入力補助機能チェック 荷姿計量単位
                    if(structCsv.geth_PKG_UNIT() != null && ("").equals(structCsv.geth_PKG_UNIT()) != true)
                    {
                        // 文字12桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_PKG_UNIT());
                        if(strLength > 12)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PKG_UNIT"; // Expj.PKG_UNIT=荷姿計量単位
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 禁則文字があるの場合エラー
                        iHankaku = chkHankaku(structCsv.geth_PKG_UNIT());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PKG_UNIT"; // Expj.PKG_UNIT=荷姿計量単位
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01524";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■10荷姿計量単位 END=======================================================

// ■11荷姿単位数 START=======================================================
                    // 種別チェック(数値) 荷姿単位数
                    if(structCsv.geth_PKG_UNIT_QTY() == null || ("").equals(structCsv.geth_PKG_UNIT_QTY()) == true)
                    {
                        // CSVファイル荷姿単位数が未設定だった場合、初期値1をセットする。
                        structCsv.seth_PKG_UNIT_QTY("1");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_PKG_UNIT_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PKG_UNIT_QTY"; // Expj.PKG_UNIT_QTY=荷姿単位数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            //ErrMsg = "数値を指定してください。";          // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_PKG_UNIT_QTY(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PKG_UNIT_QTY"; // Expj.PKG_UNIT_QTY=荷姿単位数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PKG_UNIT_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■11荷姿単位数 END=========================================================

// ■12在庫数単位区分 START===================================================
                    // 種別チェック(整数) 在庫数量単位区分
                    if(structCsv.geth_UNIT_QTY_TYP() == null || ("").equals(structCsv.geth_UNIT_QTY_TYP()) == true)
                    {
                        // CSVファイル在庫数量単位区分が未設定だった場合、初期値1:整数管理をセットする。
                        structCsv.seth_UNIT_QTY_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_UNIT_QTY_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_UNIT_QTY_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■12在庫数単位区分 END=====================================================

// ■13品目手配リードタイム START=============================================
                    // 種別チェック(整数) 品目手配リードタイム
                    if(structCsv.geth_ODR_LT() == null || ("").equals(structCsv.geth_ODR_LT()) == true)
                    {
                        // CSVファイル品目手配リードタイムが未設定だった場合、初期値0をセットする。
                        structCsv.seth_ODR_LT("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_ODR_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ODR_LT_1"; // Expj.ODR_LT_1=品目手配リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_ODR_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ODR_LT_1"; // Expj.ODR_LT_1=品目手配リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■13品目手配リードタイム END===============================================

// ■14品目固定分リードタイム START===========================================
                    // 種別チェック(整数) 品目固定分リードタイム
                    if(structCsv.geth_FIXED_LT() == null || ("").equals(structCsv.geth_FIXED_LT()) == true)
                    {
                        // CSVファイル品目固定分リードタイムが未設定だった場合、初期値0をセットする。
                        structCsv.seth_FIXED_LT("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_FIXED_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.FIXED_LT"; // Expj.FIXED_LT=固定分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_FIXED_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.FIXED_LT"; // Expj.FIXED_LT=固定分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■14品目固定分リードタイム END=============================================

// ■15品目比例分リードタイム START==========================================
                    // 種別チェック(整数) 品目比例分リードタイム
                    if(structCsv.geth_PROP_LT() == null || ("").equals(structCsv.geth_PROP_LT()) == true)
                    {
                        // CSVファイル品目比例分リードタイムが未設定だった場合、初期値0をセットする。
                        structCsv.seth_PROP_LT("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_PROP_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PROP_LT_2"; // Expj.PROP_LT_2=品目比例分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_PROP_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PROP_LT_2"; // Expj.PROP_LT_2=品目比例分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■15品目比例分リードタイム END============================================

// ■16安全日数 START=========================================================
                    // 種別チェック(整数) 安全日数
                    if(structCsv.geth_SAFETY_LT() == null || ("").equals(structCsv.geth_SAFETY_LT()) == true)
                    {
                        // CSVファイル安全日数が未設定だった場合、初期値0をセットする。
                        structCsv.seth_SAFETY_LT("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_SAFETY_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SAFETY_LT"; // Expj.SAFETY_LT=安全日数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_SAFETY_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SAFETY_LT"; // Expj.SAFETY_LT=安全日数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■16安全日数 END===========================================================

// ■17払出リードタイム START=================================================
                    // 種別チェック(整数) 払出リードタイム
                    if(structCsv.geth_ISSUE_LT() == null || ("").equals(structCsv.geth_ISSUE_LT()) == true)
                    {
                        // CSVファイル払出リードタイムが未設定だった場合、初期値0をセットする。
                        structCsv.seth_ISSUE_LT("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_ISSUE_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ISSUE_LT"; // Expj.ISSUE_LT=払出リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_ISSUE_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ISSUE_LT"; // Expj.ISSUE_LT=払出リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_LT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■17払出リードタイム END===================================================

// ■18品目比例分ロットサイズ START===========================================
                    // 種別チェック(数値) 品目比例分ロットサイズ
                    if(structCsv.geth_PROP_LOT_SIZE() == null || ("").equals(structCsv.geth_PROP_LOT_SIZE()) == true)
                    {
                        // CSVファイル品目比例分ロットサイズが未設定だった場合、初期値1.0をセットする。
                        structCsv.seth_PROP_LOT_SIZE("1.0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_PROP_LOT_SIZE()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PROP_LOT_SIZE_2"; // Expj.PROP_LOT_SIZE_2=品目比例分ロットサイズ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LOT_SIZE );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_PROP_LOT_SIZE(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PROP_LOT_SIZE_2"; // Expj.PROP_LOT_SIZE_2=品目比例分ロットサイズ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LOT_SIZE );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■18品目比例分ロットサイズ END=============================================

// ■19品目仕損率 START=======================================================
                    // 種別チェック(数値) 品目仕損率
                    if(structCsv.geth_ITEM_SPOIL() == null || ("").equals(structCsv.geth_ITEM_SPOIL()) == true)
                    {
                        // CSVファイル品目仕損率が未設定だった場合、初期値0をセットする。
                        structCsv.seth_ITEM_SPOIL("0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_ITEM_SPOIL()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_SPOIL"; // Expj.ITEM_SPOIL=品目仕損率
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_SPOIL );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_ITEM_SPOIL(),range2,false))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_SPOIL"; // Expj.ITEM_SPOIL=品目仕損率
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_SPOIL );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        
                        // 品目手配区分が擬似品目であるかのチェック
                        if (structCsv.geth_MRP_ODR_TYP().equals("8"))
                        {
                        	// CSVファイル品目手配区分が擬似品目だった場合、初期値0をセットする。
                            structCsv.seth_ITEM_SPOIL("0");
                            
                            ErrlineNo = i + 1;                                      // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_SPOIL"; // Expj.PROP_LT_2=品目比例分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            if(("true").equals(_save_struct.getDO_CHK())){
                            	// チェックのみ行う場合、ワーニング
                                ErrNo = "AA01527";                                      // エラー番号
                            }else{
                            	// 登録/更新する場合、ワーニング
                                ErrNo = "AA01526";                                      // エラー番号
                            }
                            // エラー区分:ワーニング
                            ErrCd = "2";                                            // エラー区分(ワーニングで更新)
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_STOCK  );
                            
                            intWarningCount++;
                            if(!bWarningCount){
                            	intWarningCtByData ++;
                            }
                            bError = true;
                        }
                    }
// ■19品目仕損率 END=========================================================

// ■20安全在庫量 START=======================================================
                    // 種別チェック(数値) 安全在庫量
                    if(structCsv.geth_SAFETY_STOCK() == null || ("").equals(structCsv.geth_SAFETY_STOCK()) == true)
                    {
                        // CSVファイル安全在庫量が未設定だった場合、初期値0をセットする。
                        structCsv.seth_SAFETY_STOCK("0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_SAFETY_STOCK()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SAFETY_STOCK"; // Expj.SAFETY_STOCK=安全在庫量
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_STOCK );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_SAFETY_STOCK(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SAFETY_STOCK"; // Expj.SAFETY_STOCK=安全在庫量
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SAFETY_STOCK );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■20安全在庫量 END=========================================================

// ■21ロットまとめ区分 START=================================================
                    // 種別チェック(整数) ロットまとめ区分
                    if(structCsv.geth_LOT_SIZING_TYP() == null || ("").equals(structCsv.geth_LOT_SIZING_TYP()) == true)
                    {
                        // CSVファイルロットまとめ区分が未設定だった場合、初期値1:最大まとめ期間をセットする。
                        structCsv.seth_LOT_SIZING_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_LOT_SIZING_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.LOT_SIZING_TYP"; // Expj.LOT_SIZING_TYP=ロットまとめ区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_SIZING_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_LOT_SIZING_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.LOT_SIZING_TYP"; // Expj.LOT_SIZING_TYP=ロットまとめ区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_SIZING_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■21ロットまとめ区分 END===================================================

// ■22最大まとめ期間 START===================================================
                    // 種別チェック(整数) 最大まとめ期間
                    if(structCsv.geth_MAX_PERIOD() == null || ("").equals(structCsv.geth_MAX_PERIOD()) == true)
                    {
                        // CSVファイル最大まとめ期間が未設定だった場合、初期値1をセットする。
                        structCsv.seth_MAX_PERIOD("1");
                    } else {
                    	// 0を含まず
                        if(Calculate.compare(structCsv.geth_MAX_PERIOD(), "0") == 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MAX_PERIOD"; // Expj.MAX_PERIOD=最大まとめ期間
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt, CSV_COLNO_MAX_PERIOD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        
                        // 整数チェック
                        if("0".equals(structCsv.geth_MAX_PERIOD()) || Calculate.isInteger(structCsv.geth_MAX_PERIOD()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MAX_PERIOD"; // Expj.MAX_PERIOD=最大まとめ期間
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_PERIOD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_MAX_PERIOD());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MAX_PERIOD"; // Expj.MAX_PERIOD=最大まとめ期間
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_PERIOD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■22最大まとめ期間 END=====================================================

// ■23最大手配数 START=======================================================
                    // 種別チェック(数値) 最大手配数量
                    if(structCsv.geth_MAX_ODR_QTY() == null || ("").equals(structCsv.geth_MAX_ODR_QTY()) == true)
                    {
                        // CSVファイル最大手配数量が未設定だった場合、初期値99999999999.0をセットする。
                        structCsv.seth_MAX_ODR_QTY("99999999999.0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_MAX_ODR_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MAX_ODR_QTY"; // Expj.MAX_ODR_QTY=最大手配数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_MAX_ODR_QTY(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MAX_ODR_QTY"; // Expj.MAX_ODR_QTY=最大手配数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MAX_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■23最大手配数 END=========================================================

// ■24発注点在庫数 START=====================================================
                    // 種別チェック(数値) 発注点在庫数
                    if(structCsv.geth_ODR_POINT() == null || ("").equals(structCsv.geth_ODR_POINT()) == true)
                    {
                        // CSVファイル発注点在庫数が未設定だった場合、初期値0をセットする。
                        structCsv.seth_ODR_POINT("0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_ODR_POINT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ODR_POINT"; // Expj.ODR_POINT=発注点在庫数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            //ErrMsg = "数値を指定してください。";          // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_POINT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_ODR_POINT(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ODR_POINT"; // Expj.ODR_POINT=発注点在庫数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ODR_POINT );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■24発注点在庫数 END=======================================================

// ■25定量発注数 START=======================================================
                    // 種別チェック(数値) 定量発注数量
                    if(structCsv.geth_FIXED_ODR_QTY() == null || ("").equals(structCsv.geth_FIXED_ODR_QTY()) == true)
                    {
                        // 品目手配区分が 6:定量手配品目または 7:発注点手配品目以外 かつ
                    	// CSVファイル定量発注数量が未設定だった場合、初期値0.0をセットする。
                    	if(!"6".equals(structCsv.geth_MRP_ODR_TYP()) && !"7".equals(structCsv.geth_MRP_ODR_TYP())) {
                    		structCsv.seth_FIXED_ODR_QTY("0.0");
                        } else {// 品目手配区分が 6:定量手配品目または 7:発注点手配品目場合、エラーが出力
                        	ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.FIXED_ODR_QTY"; // Expj.FIXED_ODR_QTY=定量発注数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00200";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        
                    } else {
                        if(IsNumChk(structCsv.geth_FIXED_ODR_QTY()) != true)
                        {
                            // 数値チェック
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.FIXED_ODR_QTY"; // Expj.FIXED_ODR_QTY=定量発注数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 「品目手配区分」が6,7以外の場合は0が許されています
                        boolean bZeroFlg = false;
                        if("6".equals(structCsv.geth_MRP_ODR_TYP()) || "7".equals(structCsv.geth_MRP_ODR_TYP())) {
                        	bZeroFlg = true;
                        } 
                        	
                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_FIXED_ODR_QTY(),range1,bZeroFlg))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.FIXED_ODR_QTY"; // Expj.FIXED_ODR_QTY=定量発注数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_FIXED_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■25定量発注数 END=========================================================

// ■26最小手配数 START=======================================================
                    // 種別チェック(数値) 最小手配数量
                    if(structCsv.geth_MIN_ODR_QTY() == null || ("").equals(structCsv.geth_MIN_ODR_QTY()) == true)
                    {
                        // CSVファイル最小手配数量が未設定だった場合、初期値0をセットする。
                        structCsv.seth_MIN_ODR_QTY("0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_MIN_ODR_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MIN_ODR_QTY"; // Expj.MIN_ODR_QTY=最小手配数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MIN_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_MIN_ODR_QTY(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MIN_ODR_QTY"; // Expj.MIN_ODR_QTY=最小手配数
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MIN_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■26最小手配数 END=========================================================

// ■27まるめ単位 START=======================================================
                    // 種別チェック(数値) まるめ単位
                    if(structCsv.geth_MUL_ODR_QTY() == null || ("").equals(structCsv.geth_MUL_ODR_QTY()) == true)
                    {
                        // CSVファイルまるめ単位が未設定だった場合、初期値1をセットする。
                        structCsv.seth_MUL_ODR_QTY("1");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_MUL_ODR_QTY()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MUL_ODR_QTY"; // Expj.MUL_ODR_QTY=まるめ単位
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MUL_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_MUL_ODR_QTY(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MUL_ODR_QTY"; // Expj.MUL_ODR_QTY=まるめ単位
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MUL_ODR_QTY );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■27まるめ単位 END=========================================================

// ■28出庫区分 START=========================================================
                    // 種別チェック(整数) 出庫区分
                    if(structCsv.geth_ISSUE_TYP() == null || ("").equals(structCsv.geth_ISSUE_TYP()) == true)
                    {
                        // CSVファイル出庫区分が未設定だった場合、初期値1:マニュアル出庫をセットする。
                        structCsv.seth_ISSUE_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_ISSUE_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ISSUE_TYP"; // Expj.ISSUE_TYP=出庫区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            //ErrMsg = "整数を設定してください。";          // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_ISSUE_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ISSUE_TYP"; // Expj.ISSUE_TYP=出庫区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■28出庫区分 END===========================================================

// ■29MPS品目フラグ START====================================================
                    // 種別チェック(整数) MPS品目フラグ
                    if(structCsv.geth_MPS_FLG() == null || ("").equals(structCsv.geth_MPS_FLG()) == true)
                    {
                        // CSVファイルMPS品目フラグが未設定だった場合、初期値0:MPS品目ではないをセットする。
                        structCsv.seth_MPS_FLG("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_MPS_FLG()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MPS_FLG"; // Expj.MPS_FLG=MPS品目フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            //ErrMsg = "整数を設定してください。";          // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MPS_FLG );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_MPS_FLG());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MPS_FLG"; // Expj.MPS_FLG=MPS品目フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MPS_FLG );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■29MPS品目フラグ END======================================================

// ■30受入検査区分 START=====================================================
                    // 種別チェック(整数) 受入検査区分
                    if(structCsv.geth_ACPT_INSPC_TYP() == null || ("").equals(structCsv.geth_ACPT_INSPC_TYP()) == true)
                    {
                        // CSVファイル受入検査区分が未設定だった場合、初期値1:受入れのみではないをセットする。
                        structCsv.seth_ACPT_INSPC_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_ACPT_INSPC_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ACPT_INSPC_TYP"; // Expj.ACPT_INSPC_TYP=受入検査区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ACPT_INSPC_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_ACPT_INSPC_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ACPT_INSPC_TYP"; // Expj.ACPT_INSPC_TYP=受入検査区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ACPT_INSPC_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■30受入検査区分 END=======================================================

// ■31製品区分 START=========================================================
                    // 種別チェック(整数) 製品区分
                    if(structCsv.geth_PRODUCT_TYP() == null || ("").equals(structCsv.geth_PRODUCT_TYP()) == true)
                    {
                        // CSVファイル製品区分が未設定だった場合、初期値1:製品ではないをセットする。
                        structCsv.seth_PRODUCT_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_PRODUCT_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PRODUCT_TYP"; // Expj.PRODUCT_TYP=製品区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PRODUCT_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_PRODUCT_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PRODUCT_TYP"; // Expj.PRODUCT_TYP=製品区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            //ErrMsg = "桁数以内で設定してください。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PRODUCT_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■31製品区分 END===========================================================

// ■32管理コード START=======================================================
                    // 入力補助機能チェック 管理コード
                    if(structCsv.geth_CLASIFICATION_CD() != null && ("").equals(structCsv.geth_CLASIFICATION_CD()) != true)
                    {
                        // 整数25桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_CLASIFICATION_CD());
                        if(strLength > 25)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.CLASIFICATION_CD"; // Expj.CLASIFICATION_CD=管理コード
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CLASIFICATION_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■32管理コード END=========================================================

// ■33単位重量 START=========================================================
                    // 種別チェック(数値) 単位重量
                    if(structCsv.geth_UNIT_WEIGHT() == null || ("").equals(structCsv.geth_UNIT_WEIGHT()) == true)
                    {
                        // CSVファイル単位重量が未設定だった場合、初期値0.0をセットする。
                        structCsv.seth_UNIT_WEIGHT("0.0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_UNIT_WEIGHT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.UNIT_WEIGHT"; // Expj.UNIT_WEIGHT=単位重量
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            //ErrMsg = "数値を指定してください。";          // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_WEIGHT  );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_UNIT_WEIGHT(),range1,false))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.UNIT_WEIGHT"; // Expj.UNIT_WEIGHT=単位重量
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_WEIGHT  );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■33単位重量 END===========================================================

// ■34棚卸区分 START=========================================================
                    // 種別チェック(整数) 棚卸区分
                    if(structCsv.geth_ABC_TYP() == null || ("").equals(structCsv.geth_ABC_TYP()) == true)
                    {
                        // CSVファイル棚卸区分が未設定だった場合、初期値1:棚卸対商品をセットする。
                        structCsv.seth_ABC_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_ABC_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=棚卸区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_ABC_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=棚卸区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■34棚卸区分 END===========================================================

// ■35作業実績区分 START=====================================================
                    // 種別チェック(整数) 作業実績区分
                    if(structCsv.geth_OPR_RSLT_TYP() == null || ("").equals(structCsv.geth_OPR_RSLT_TYP()) == true)
                    {
                        // CSVファイル棚卸区分が未設定だった場合、初期値2:作業指示実績をセットする。
                        structCsv.seth_OPR_RSLT_TYP("2");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_OPR_RSLT_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.OPR_RSLT_TYP"; // Expj.OPR_RSLT_TYP=作業実績区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            //ErrMsg = "整数を設定してください。";          // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OPR_RSLT_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_OPR_RSLT_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.OPR_RSLT_TYP"; // Expj.OPR_RSLT_TYP=作業実績区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OPR_RSLT_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■35作業実績区分 END=======================================================

// ■36受給品区分 START=======================================================
                    // 種別チェック(整数) 受給品区分
                    if(structCsv.geth_SPL_ITEM_TYP() == null || ("").equals(structCsv.geth_SPL_ITEM_TYP()) == true)
                    {
                        // CSVファイル受給品区分が未設定だった場合、初期値0:受給品ではないをセットする。
                        structCsv.seth_SPL_ITEM_TYP("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_SPL_ITEM_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=受給品区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_SPL_ITEM_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=受給品区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
                    
                     // 内外作区分が1:内作　かつ　受給品区分が2:無償受給の場合
                    if("1".equals(structCsv.geth_OUTSIDE_TYP()) && "2".equals(structCsv.geth_SPL_ITEM_TYP())) {
                    	 ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                         // 多言語キーセット
                         tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=受給品区分
                         ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                         // 多言語項目取得セット
                         ErrItem = CoreTools.getRBString(tkey, resource);

                         ErrCd = "2";                                    // エラー区分
                         ErrNo = "AA00216";                              // エラー番号
                         // メッセージ取得 
                         ExpjMessage emsg = new ExpjMessage(ErrNo);
                         ErrMsg = emsg.getMessage(locale);

                         // CSV出力(エラー)
                         csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                         // w_COLUMN_FLG変数にエラー情報を退避。
                         structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                         intWarningCount ++;
                         intWarningCtByData ++;
                         // チェックワーニングレコードフラグ"true"にセット
                         bWarningCount = true;
                         // エラーフラグ"true"にセット/
                         bError = true;
                    }
// ■36受給品区分 END=========================================================

// ■37消費税コード START=====================================================
                    // 入力補助機能チェック 消費税コード
                    if(structCsv.geth_TAX_CD() != null && ("").equals(structCsv.geth_TAX_CD()) != true)
                    {
                        // 文字3桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_TAX_CD());
                        if(strLength > 3)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.TAX_CD_1"; // Expj.TAX_CD_1=消費税コード
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_TAX_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 禁則文字があるの場合エラー
                        iHankaku = chkHankaku(structCsv.geth_TAX_CD());
                        if(iHankaku != 0)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.TAX_CD_1"; // Expj.TAX_CD_1=消費税コード
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01524";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_TAX_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■37消費税コード END=======================================================

// ■38カレンダ番号 START=====================================================
                    // 入力補助機能チェック カレンダ番号
                    if(structCsv.geth_CAL_NO() != null && ("").equals(structCsv.geth_CAL_NO()) != true)
                    {
                        // 種別チェック(整数) カレンダ番号
                        if(Calculate.isInteger(structCsv.geth_CAL_NO()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.CAL_NO"; // Expj.CAL_NO=カレンダ番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);
    
                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CAL_NO );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 文字3桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_CAL_NO());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.CAL_NO"; // Expj.CAL_NO=カレンダ番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CAL_NO );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■38カレンダ番号 END=======================================================

// 2008/07/25 SYSCOM 磯部 ADD START
// ■40工数管理品目区分 START=====================================================
                    // 種別チェック(整数) 工数管理品目区分
                    if(structCsv.geth_MANHOUR_TYP() == null || ("").equals(structCsv.geth_MANHOUR_TYP()) == true)
                    {
                        // CSVファイル工数管理品目区分が未設定だった場合、初期値0:通常品目をセットする。
                        structCsv.seth_MANHOUR_TYP("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_MANHOUR_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=工数管理品目区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 整数3桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_MANHOUR_TYP());
                        if(strLength > 3)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=工数管理品目区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■40工数管理品目区分 END=======================================================
// 2008/07/25 SYSCOM 磯部 ADD END
// ■39保管区分 START=====================================================
					// 入力補助機能チェック 保管区分
					if(structCsv.geth_DEPO_TYP() == null || ("").equals(structCsv.geth_DEPO_TYP()) == true)
					{
						// CSVファイル保管区分が未設定だった場合、初期値1：常温をセットする。
						structCsv.seth_DEPO_TYP("1");
					}else{
						
						// 種別チェック(整数) 保管区分
						if(Calculate.isInteger(structCsv.geth_DEPO_TYP()) != true)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4091"; // Expj.Cmt4091=保管区分
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// エラー区分
							ErrNo = "AA01502";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPO_TYP );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						// 文字3桁以上の場合エラー
						strLength = StrLengthChk(structCsv.geth_DEPO_TYP());
						if(strLength > 2)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4091"; // Expj.Cmt4091=保管区分
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01501";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPO_TYP );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
// ■39保管区分 END=======================================================
					
// ■40ロット管理フラグ START=====================================================
					// 入力補助機能チェック ロット管理フラグ
					if(structCsv.geth_LOT_CTRL_FLG() == null || ("").equals(structCsv.geth_LOT_CTRL_FLG()) == true)
					{
						// CSVファイルロット管理フラグ が未設定だった場合、初期値0：ロット管理を行わないをセットする。
						structCsv.seth_LOT_CTRL_FLG("0");
					}else{
						
						// 種別チェック(整数) ロット管理フラグ
						if(Calculate.isInteger(structCsv.geth_LOT_CTRL_FLG()) != true)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=ロット管理フラグ
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// エラー区分
							ErrNo = "AA01502";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						// 文字2桁以上の場合エラー
						strLength = StrLengthChk(structCsv.geth_LOT_CTRL_FLG());
						if(strLength > 1)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=ロット管理フラグ
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01501";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
// ■40ロット管理フラグ END=======================================================			

					
// ■41ロット採番区分 START=====================================================
					// 入力補助機能チェック ロット採番区分
					if(structCsv.geth_LOT_NUMBERING_TYP() == null || ("").equals(structCsv.geth_LOT_NUMBERING_TYP()) == true)
					{
						// CSVファイルロット採番区分 が未設定だった場合、初期値1：自動採番をセットする。
						structCsv.seth_LOT_NUMBERING_TYP("1");
						
					}else{
						// 種別チェック(整数) ロット採番区分
						if(Calculate.isInteger(structCsv.geth_LOT_NUMBERING_TYP()) != true)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4092"; // Expj.Cmt4092=ロット採番区分
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// エラー区分
							ErrNo = "AA01502";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_NUMBERING_TYP );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						// 文字3桁以上の場合エラー
						strLength = StrLengthChk(structCsv.geth_LOT_NUMBERING_TYP());
						if(strLength > 2)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4092"; // Expj.Cmt4092=ロット採番区分
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01501";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_NUMBERING_TYP );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
// ■41ロット採番区分 END=======================================================			

					
					
					
//  ■42品質期限年数 START=====================================================
					// 入力補助機能チェック 品質期限年数
					if(structCsv.geth_BEST_BEFORE_YEAR() == null || ("").equals(structCsv.geth_BEST_BEFORE_YEAR()) == true)
					{
						// CSVファイル品質期限年数 が未設定だった場合、初期値0をセットする。
						structCsv.seth_BEST_BEFORE_YEAR("0");
						
					}else{
						// 種別チェック(整数) 品質期限年数
						if(Calculate.isInteger(structCsv.geth_BEST_BEFORE_YEAR()) != true)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt5070"; // Expj.Cmt5070=品質期限年数
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// エラー区分
							ErrNo = "AA01502";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_YEAR );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						// 文字5桁以上の場合エラー
						strLength = StrLengthChk(structCsv.geth_BEST_BEFORE_YEAR());
						if(strLength > 4)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt5070"; // Expj.Cmt5070=品質期限年数
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01501";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_YEAR );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
// ■42品質期限年数 END=======================================================					
					

// ■43品質期限月数 START=====================================================
					// 入力補助機能チェック 品質期限月数
					if(structCsv.geth_BEST_BEFORE_MONTH() == null || ("").equals(structCsv.geth_BEST_BEFORE_MONTH()) == true)
					{
						// CSVファイル品質期限月数 が未設定だった場合、初期値0をセットする。
						structCsv.seth_BEST_BEFORE_MONTH("0");
						
					}else{
						// 種別チェック(整数) 品質期限月数
						if(Calculate.isInteger(structCsv.geth_BEST_BEFORE_MONTH()) != true)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt5071"; // Expj.Cmt5071=品質期限月数
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);
	
							ErrCd = "1";									// エラー区分
							ErrNo = "AA01502";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);
	
							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_MONTH );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						// 文字5桁以上の場合エラー
						strLength = StrLengthChk(structCsv.geth_BEST_BEFORE_MONTH());
						if(strLength > 4)
						{
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt5071"; // Expj.Cmt5071=品質期限月数
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01501";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_MONTH );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}

// ■43品質期限月数 END=======================================================						
					

// ■44品質期限日数 START=====================================================
				// 入力補助機能チェック 品質期限日数
				if(structCsv.geth_BEST_BEFORE_DAY() == null || ("").equals(structCsv.geth_BEST_BEFORE_DAY()) == true)
				{
					// CSVファイル品質期限日数 が未設定だった場合、初期値0をセットする。
					structCsv.seth_BEST_BEFORE_DAY("0");
					
				}else{
					// 種別チェック(整数) 品質期限日数
					if(Calculate.isInteger(structCsv.geth_BEST_BEFORE_DAY()) != true)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt5072"; // Expj.Cmt5072=品質期限日数
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01502";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_DAY );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 文字5桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_BEST_BEFORE_DAY());
					if(strLength > 4)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt5072"; // Expj.Cmt5072=品質期限日数
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_BEST_BEFORE_DAY );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■44品質期限日数 END=======================================================						
					
//20150803 ADD START BY SYSCOM
// ■45負担部門コード START =================================================
				// 入力補助機能チェック 負担部門コード
				if(structCsv.geth_DEPT_CD() == null || ("").equals(structCsv.geth_DEPT_CD()) == true)
				{
					// CSVファイル負担部門コードが未設定だった場合、初期値をセットする。
					structCsv.seth_DEPT_CD("");
					
				}else{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_DEPT_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.DEPT_CD"; // Expj.DEPT_CD=負担部門コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPT_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
                    iHankaku = chkHankaku(structCsv.geth_DEPT_CD());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.DEPT_CD"; // Expj.DEPT_CD=負担部門コード
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01524";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPT_CD );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

				}
// ■45負担部門コード END=======================================================

// ■46プロジェクトコード START=======================================================
				// 入力補助機能チェック プロジェクトコード
				if(structCsv.geth_PJ_CD() == null || ("").equals(structCsv.geth_PJ_CD()) == true)
				{
					// CSVファイルプロジェクトコードが未設定だった場合、初期値をセットする。
					structCsv.seth_PJ_CD("");
					
				}else{
					// 文字16桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_PJ_CD());
					if(strLength > 15)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.PJ_CD"; // Expj.PJ_CD=プロジェクトコード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PJ_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
                    iHankaku = chkHankaku(structCsv.geth_PJ_CD());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.PJ_CD"; // Expj.PJ_CD=プロジェクトコード
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01524";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PJ_CD );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

				}
// ■46プロジェクトコード END=======================================================
                	
// ■47セグメント1 START=======================================================
				// 入力補助機能チェック セグメント1
				if(structCsv.geth_SEG_CONTENTS_1() == null || ("").equals(structCsv.geth_SEG_CONTENTS_1()) == true)
				{
					// CSVファイルセグメント1が未設定だった場合、初期値をセットする。
					structCsv.seth_SEG_CONTENTS_1("");
					
				}else{
					// 文字51桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_1());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.SEG_CONTENTS1"; // Expj.SEG_CONTENTS_1=セグメント1
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_1 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_1());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.SEG_CONTENTS1"; // Expj.SEG_CONTENTS_1=セグメント1
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01524";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_1 );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

				}
// ■47セグメント1 END=======================================================

// ■48セグメント2 START=======================================================
				// 入力補助機能チェック セグメント2
				if(structCsv.geth_SEG_CONTENTS_2() == null || ("").equals(structCsv.geth_SEG_CONTENTS_2()) == true)
				{
					// CSVファイルセグメント2が未設定だった場合、初期値をセットする。
					structCsv.seth_SEG_CONTENTS_2("");
					
				}else{
					// 文字51桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_2());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.SEG_CONTENTS2"; // Expj.SEG_CONTENTS_2=セグメント2
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_2 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_2());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.SEG_CONTENTS2"; // Expj.SEG_CONTENTS_2=セグメント2
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01524";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_2 );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

				}
// ■48セグメント2 END=======================================================

// ■49セグメント3 START=======================================================
				// 入力補助機能チェック セグメント3
				if(structCsv.geth_SEG_CONTENTS_3() == null || ("").equals(structCsv.geth_SEG_CONTENTS_3()) == true)
				{
					// CSVファイルセグメント3が未設定だった場合、初期値をセットする。
					structCsv.seth_SEG_CONTENTS_3("");
					
				}else{
					// 文字51桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_3());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.SEG_CONTENTS3"; // Expj.SEG_CONTENTS_3=セグメント3
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_3 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_3());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.SEG_CONTENTS3"; // Expj.SEG_CONTENTS_3=セグメント3
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01524";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_3 );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

				}
// ■49セグメント3 END=======================================================

// ■50セグメント4 START=======================================================
				// 入力補助機能チェック セグメント4
				if(structCsv.geth_SEG_CONTENTS_4() == null || ("").equals(structCsv.geth_SEG_CONTENTS_4()) == true)
				{
					// CSVファイルセグメント4が未設定だった場合、初期値をセットする。
					structCsv.seth_SEG_CONTENTS_4("");
					
				}else{
					// 文字51桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_SEG_CONTENTS_4());
					if(strLength > 50)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.SEG_CONTENTS4"; // Expj.SEG_CONTENTS_4=セグメント4
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_4 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
                    iHankaku = chkHankaku(structCsv.geth_SEG_CONTENTS_4());
                    if(iHankaku != 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.SEG_CONTENTS4"; // Expj.SEG_CONTENTS_4=セグメント4
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01524";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_4 );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

				}
// ■50セグメント4 END=======================================================
//20150803 ADD END BY SYSCOM

// ■51備考1 START=====================================================
				// 入力補助機能チェック備考１
				if(structCsv.geth_REMARK1() != null && ("").equals(structCsv.geth_REMARK1()) != true)
				{
					// 文字81桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_REMARK1());
					if(strLength > 80)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.REMARKS_1"; // Expj.REMARKS_1=備考１
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK1 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_REMARK1());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.REMARKS_1"; // Expj.REMARKS_1=備考１
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK1 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■51備考1 END=======================================================				
				
// ■52備考2 START=====================================================
				// 入力補助機能チェック備考2
				if(structCsv.geth_REMARK2() != null && ("").equals(structCsv.geth_REMARK2()) != true)
				{
					// 文字81桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_REMARK2());
					if(strLength > 80)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.REMARKS_2"; // Expj.REMARKS_2=備考2
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK2 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_REMARK2());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.REMARKS_2"; // Expj.REMARKS_2=備考2
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_REMARK2 );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■52備考2 END=======================================================					
				
// ■53品目分類01コード START=====================================================
				// 入力補助機能チェック品目分類01コード
				if(structCsv.geth_ITEM_CLASS_01_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_01_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_01_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4099"; // Expj.Cmt4099=品目分類01コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_01_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_01_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4099"; // Expj.Cmt4099=品目分類01コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_01_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■53品目分類01コード END=======================================================							
				
// ■54品目分類02コード START=====================================================
				// 入力補助機能チェック品目分類02コード
				if(structCsv.geth_ITEM_CLASS_02_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_02_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_02_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4100"; // Expj.Cmt4100=品目分類02コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_02_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_02_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4100"; // Expj.Cmt4100=品目分類02コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_02_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■54品目分類02コード END=======================================================							
				
// ■55品目分類03コード START=====================================================
				// 入力補助機能チェック品目分類03コード
				if(structCsv.geth_ITEM_CLASS_03_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_03_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_03_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4101"; // Expj.Cmt4101=品目分類03コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_03_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_03_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4101"; // Expj.Cmt4101=品目分類03コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_03_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■55品目分類03コード END=======================================================							

// ■56品目分類04コード START=====================================================
				// 入力補助機能チェック品目分類04コード
				if(structCsv.geth_ITEM_CLASS_04_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_04_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_04_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4102"; // Expj.Cmt4102=品目分類04コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_04_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_04_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4102"; // Expj.Cmt4102=品目分類04コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_04_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■56品目分類04コード END=======================================================							
								
// ■57品目分類05コード START=====================================================
				// 入力補助機能チェック品目分類05コード
				if(structCsv.geth_ITEM_CLASS_05_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_05_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_05_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4103"; // Expj.Cmt4103=品目分類05コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_05_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_05_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4103"; // Expj.Cmt4103=品目分類05コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_05_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■57品目分類05コード END=======================================================
                	
// ■58品目分類06コード START=====================================================
				// 入力補助機能チェック品目分類06コード
				if(structCsv.geth_ITEM_CLASS_06_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_06_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_06_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4104"; // Expj.Cmt4104=品目分類06コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_06_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_06_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4104"; // Expj.Cmt4104=品目分類06コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_06_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■58品目分類06コード END=======================================================							
				
// ■59品目分類07コード START=====================================================
				// 入力補助機能チェック品目分類07コード
				if(structCsv.geth_ITEM_CLASS_07_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_07_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_07_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4105"; // Expj.Cmt4105=品目分類07コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_07_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_07_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4105"; // Expj.Cmt4105=品目分類07コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_07_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■59品目分類07コード END=======================================================							
				
// ■60品目分類08コード START=====================================================
				// 入力補助機能チェック品目分類08コード
				if(structCsv.geth_ITEM_CLASS_08_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_08_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_08_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4106"; // Expj.Cmt4106=品目分類08コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_08_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_08_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4106"; // Expj.Cmt4106=品目分類08コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_08_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■60品目分類08コード END=======================================================							
				
// ■61品目分類09コード START=====================================================
				// 入力補助機能チェック品目分類09コード
				if(structCsv.geth_ITEM_CLASS_09_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_09_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_09_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4107"; // Expj.Cmt4107=品目分類09コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_09_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_09_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4107"; // Expj.Cmt4107=品目分類09コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_09_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■61品目分類09コード END=======================================================					
				
// ■62品目分類10コード START=====================================================
				// 入力補助機能チェック品目分類10コード
				if(structCsv.geth_ITEM_CLASS_10_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_10_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_10_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4108"; // Expj.Cmt4108=品目分類10コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_10_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_10_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4108"; // Expj.Cmt4108=品目分類10コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_10_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■62品目分類10コード END=======================================================	
				
// ■63品目分類11コード START=====================================================
				// 入力補助機能チェック品目分類11コード
				if(structCsv.geth_ITEM_CLASS_11_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_11_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_11_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4109"; // Expj.Cmt4109=品目分類11コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_11_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_11_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4109"; // Expj.Cmt4109=品目分類11コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_11_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■63品目分類11コード END=======================================================	
				
// ■64品目分類12コード START=====================================================
				// 入力補助機能チェック品目分類12コード
				if(structCsv.geth_ITEM_CLASS_12_CD() != null && ("").equals(structCsv.geth_ITEM_CLASS_12_CD()) != true)
				{
					// 文字26桁以上の場合エラー
					strLength = StrLengthChk(structCsv.geth_ITEM_CLASS_12_CD());
					if(strLength > 25)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4110"; // Expj.Cmt4110=品目分類12コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01501";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_12_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
					// 禁則文字があるの場合エラー
					iHankaku = chkHankaku(structCsv.geth_ITEM_CLASS_12_CD());
					if(iHankaku != 0)
					{
						ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
						// 多言語キーセット
						tkey = "Expj.Cmt4110"; // Expj.Cmt4110=品目分類12コード
						ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
						// 多言語項目取得セット
						ErrItem = CoreTools.getRBString(tkey, resource);

						ErrCd = "1";									// エラー区分
						ErrNo = "AA01524";								// エラー番号
						// メッセージ取得 
						ExpjMessage emsg = new ExpjMessage(ErrNo);
						ErrMsg = emsg.getMessage(locale);

						// CSV出力(エラー)
						csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_12_CD );
						// w_COLUMN_FLG変数にエラー情報を退避。
						structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
						// エラーフラグ"true"にセット
						bError = true;
						chkHasErr = true;
						// 次明細へ処理を移行
						continue;
					}
				}
// ■64品目分類12コード END=======================================================					


// コンボボックスデータチェック START-------------------------------------------------------------------------------------------

// ●1品目手配区分コンボ START================================================
                    // コンボボックス項目チェック 品目手配区分
                    if(structCsv.geth_MRP_ODR_TYP() != null && ("").equals(structCsv.geth_MRP_ODR_TYP()) != true)
                    {
                        struct.setsetNAME("MRP_ODR_TYP");
                        struct.setsetVALUE(structCsv.geth_MRP_ODR_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●1品目手配区分コンボ END==================================================

// ●2品目内外作区分コンボ START==============================================
                    // コンボボックス項目チェック 品目内外作区分
                    if(structCsv.geth_OUTSIDE_TYP() != null && ("").equals(structCsv.geth_OUTSIDE_TYP()) != true)
                    {
                        struct.setsetNAME("OUTSIDE_TYP");
                        struct.setsetVALUE(structCsv.geth_OUTSIDE_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.OUTSIDE_TYP_4"; // Expj.OUTSIDE_TYP_4=品目内外作区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●2品目内外作区分コンボ END================================================

// ●3在庫数量単位区分コンボ START============================================
                    // コンボボックス項目チェック 在庫数量単位区分
                    if(structCsv.geth_UNIT_QTY_TYP() != null && ("").equals(structCsv.geth_UNIT_QTY_TYP()) != true)
                    {
                        struct.setsetNAME("UNIT_QTY_TYP");
                        struct.setsetVALUE(structCsv.geth_UNIT_QTY_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●3在庫数量単位区分コンボ END==============================================

// ●4ロットまとめ区分コンボ START============================================
                    // コンボボックス項目チェック ロットまとめ区分
                    if(structCsv.geth_LOT_SIZING_TYP() != null && ("").equals(structCsv.geth_LOT_SIZING_TYP()) != true)
                    {
                        struct.setsetNAME("LOT_SIZING_TYP");
                        struct.setsetVALUE(structCsv.geth_LOT_SIZING_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.LOT_SIZING_TYP"; // Expj.LOT_SIZING_TYP=ロットまとめ区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_SIZING_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●4ロットまとめ区分コンボ END==============================================

// ●5出庫区分コンボ START====================================================
                    // コンボボックス項目チェック 出庫区分
                    if(structCsv.geth_ISSUE_TYP() != null && ("").equals(structCsv.geth_ISSUE_TYP()) != true)
                    {
                        struct.setsetNAME("ISSUE_TYP");
                        struct.setsetVALUE(structCsv.geth_ISSUE_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ISSUE_TYP"; // Expj.ISSUE_TYP=出庫区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ISSUE_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●5出庫区分コンボ END======================================================

// ●6荷姿管理フラグコンボ START==============================================
                    // コンボボックス項目チェック 荷姿管理フラグ
                    if(structCsv.geth_STOCK_UNIT_FLG() != null && ("").equals(structCsv.geth_STOCK_UNIT_FLG()) != true)
                    {
                        struct.setsetNAME("STOCK_UNIT_FLG");
                        struct.setsetVALUE(structCsv.geth_STOCK_UNIT_FLG());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.STOCK_UNIT_FLG"; // Expj.STOCK_UNIT_FLG=荷姿管理フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT_FLG );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●6荷姿管理フラグコンボ END================================================

// ●7MPS品目フラグコンボ START===============================================
                    // コンボボックス項目チェック MPS品目フラグ
                    if(structCsv.geth_MPS_FLG() != null && ("").equals(structCsv.geth_MPS_FLG()) != true)
                    {
                        struct.setsetNAME("MPS_FLG");
                        struct.setsetVALUE(structCsv.geth_MPS_FLG());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MPS_FLG"; // Expj.MPS_FLG=MPS品目フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MPS_FLG );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●7MPS品目フラグコンボ END=================================================

// ●8受入検査区分コンボ START================================================
                    // コンボボックス項目チェック 受入検査区分
                    if(structCsv.geth_ACPT_INSPC_TYP() != null && ("").equals(structCsv.geth_ACPT_INSPC_TYP()) != true)
                    {
                        struct.setsetNAME("ACPT_INSPC_TYP");
                        struct.setsetVALUE(structCsv.geth_ACPT_INSPC_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ACPT_INSPC_TYP"; // Expj.ACPT_INSPC_TYP=受入検査区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ACPT_INSPC_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●8受入検査区分コンボ END==================================================

// ●9製品区分コンボ START====================================================
                    // コンボボックス項目チェック 製品区分
                    if(structCsv.geth_PRODUCT_TYP() != null && ("").equals(structCsv.geth_PRODUCT_TYP()) != true)
                    {
                        struct.setsetNAME("PRODUCT_TYP");
                        struct.setsetVALUE(structCsv.geth_PRODUCT_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.PRODUCT_TYP"; // Expj.PRODUCT_TYP=製品区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PRODUCT_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●9製品区分コンボ END======================================================

// ●10棚卸区分コンボ START===================================================
                    // コンボボックス項目チェック 棚卸区分
                    if(structCsv.geth_ABC_TYP() != null && ("").equals(structCsv.geth_ABC_TYP()) != true)
                    {
                        struct.setsetNAME("ABC_TYP");
                        struct.setsetVALUE(structCsv.geth_ABC_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=棚卸区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●10棚卸区分コンボ END=====================================================

// ●11作業実績区分コンボ START===============================================
                    // コンボボックス項目チェック 棚卸区分
                    if(structCsv.geth_OPR_RSLT_TYP() != null && ("").equals(structCsv.geth_OPR_RSLT_TYP()) != true)
                    {
                        struct.setsetNAME("OPR_RSLT_TYP");
                        struct.setsetVALUE(structCsv.geth_OPR_RSLT_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.OPR_RSLT_TYP"; // Expj.OPR_RSLT_TYP=作業実績区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OPR_RSLT_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●11作業実績区分コンボ END=================================================

// ●12受給品区分コンボ START=================================================
                    // コンボボックス項目チェック 受給品区分
                    if(structCsv.geth_SPL_ITEM_TYP() != null && ("").equals(structCsv.geth_SPL_ITEM_TYP()) != true)
                    {
                        struct.setsetNAME("SPL_ITEM_TYP");
                        struct.setsetVALUE(structCsv.geth_SPL_ITEM_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.SPL_ITEM_TYP"; // Expj.SPL_ITEM_TYP=受給品区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SPL_ITEM_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●12受給品区分コンボ END===================================================

// 2008/07/25 SYSCOM 磯部 ADD START
// ●13工数管理品目区分コンボ START=================================================
                    // コンボボックス項目チェック 工数管理品目区分
                    if(structCsv.geth_MANHOUR_TYP() != null && ("").equals(structCsv.geth_MANHOUR_TYP()) != true)
                    {
                        struct.setsetNAME("MANHOUR_TYP");
                        struct.setsetVALUE(structCsv.geth_MANHOUR_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=工数管理品目区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            //ErrMsg = "コンボボックスデータに存在する数値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●13工数管理品目区分コンボ END===================================================
// 2008/07/25 SYSCOM 磯部 ADD END

//　●計量単位コンボ START=================================================
					// コンボボックス項目チェック 受給品区分
					if(structCsv.geth_STOCK_UNIT() != null && ("").equals(structCsv.geth_STOCK_UNIT()) != true)
					{
						struct.setsetDISPLAY_NAME(structCsv.geth_STOCK_UNIT());
						boolean stockUnitFlg = entity.mcheckSYS_TYPE_VALUE.check(conn,struct);


						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=計量単位
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01504";								// エラー番号
							//ErrMsg = "コンボボックスデータに存在する数値を指定してください。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
// ●計量単位コンボ END===================================================					
					

//●13保管区分コンボ START=================================================
					// コンボボックス項目チェック 保管区分
					if(structCsv.geth_DEPO_TYP() != null && ("").equals(structCsv.geth_DEPO_TYP()) != true){
						struct.setsetNAME("WH_COND_TYP");
						struct.setsetVALUE(structCsv.geth_DEPO_TYP());
					    List  listType = entity.mreadSYS_TYPE_VALUE.read(conn,struct);
					    
					    if(listType.isEmpty()){
					    	ErrlineNo = i+1;               // エラー発生行(実際のエラー行)
							// 多言語キーセット
					    	tkey = "Expj.Cmt4091";
					    	ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
					    	ErrItem = CoreTools.getRBString(tkey, resource);
					    	
					    	
					    	ErrCd = "1";                                            // エラー区分
					    	ErrNo = "AA01504";                                     // エラー番号
							//ErrMsg = "コンボボックスデータに存在する数値を指定してください。";		// エラーメッセージ
							// メッセージ取得 
					    	ExpjMessage emsg = new ExpjMessage(ErrNo);
					    	ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
					    	csvExport(structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg,CsvCnt,CSV_COLNO_DEPO_TYP);
							// w_COLUMN_FLG変数にエラー情報を退避。
					    	structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
					    	bError = true;
					    	chkHasErr = true;
							// リストクリア
					    	listType.clear();
							// 次明細へ処理を移行
					    	continue;
					    	
					    }
						// リストクリア
					    listType.clear();
					}
// ●13保管区分コンボ END===================================================

//●14ロット管理フラグコンボ START=================================================
//					 コンボボックス項目チェック ロット管理フラグ
					if(structCsv.geth_LOT_CTRL_FLG() != null && ("").equals(structCsv.geth_LOT_CTRL_FLG()) != true)
					{
						struct.setsetNAME("LOT_CTRL_FLG");
						struct.setsetVALUE(structCsv.geth_LOT_CTRL_FLG());
						List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

						if (listType.isEmpty()) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.LOT_CTRL_FLG";           // Expj.LOT_CTRL_FLG=ロット管理フラグ
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01504";								// エラー番号
							//ErrMsg = "コンボボックスデータに存在する数値を指定してください。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// リストクリア
							listType.clear();
							// 次明細へ処理を移行
							continue;
						}
						// リストクリア
						listType.clear();
					}
															
//●14ロット管理フラグコンボ END===================================================
//●15ロット採番区分コンボ START=================================================
					// コンボボックス項目チェック ロット採番区分
					if(structCsv.geth_LOT_NUMBERING_TYP() != null && ("").equals(structCsv.geth_LOT_NUMBERING_TYP()) != true)
					{
						struct.setsetNAME("LOT_NUMBERING");
						struct.setsetVALUE(structCsv.geth_LOT_NUMBERING_TYP());
						List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

						if (listType.isEmpty()) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4092"; // Expj.Cmt4092=ロット採番区分
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA01504";								// エラー番号
							//ErrMsg = "コンボボックスデータに存在する数値を指定してください。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_NUMBERING_TYP );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// リストクリア
							listType.clear();
							// 次明細へ処理を移行
							continue;
						}
						// リストクリア
						listType.clear();
					}
//●15ロット採番区分コンボ END===================================================

//20150803 ADD START BY SYSCOM
//●16プロジェクトコードコンボ START===================================================
					// コンボボックス項目チェック プロジェクトコード
					if(structCsv.geth_PJ_CD() != null && ("").equals(structCsv.geth_PJ_CD()) != true)
					{
						struct.setVALUE(structCsv.geth_PJ_CD());
						boolean stockUnitFlg = entity.mcheckV_PJ_CD.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.PJ_CD"; // Expj.PJ_CD=プロジェクトコード
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA23608";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PJ_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
//●16プロジェクトコードコンボ END===================================================
                	
//●17セグメント1コンボ START===================================================
					// コンボボックス項目チェック セグメント1
					if(structCsv.geth_SEG_CONTENTS_1() != null && ("").equals(structCsv.geth_SEG_CONTENTS_1()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_1());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_1.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.SEG_CONTENTS1"; // Expj.SEG_CONTENTS_1=セグメント1
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA23604";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_1 );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
//●17セグメント1コンボ END===================================================

//●18セグメント2コンボ START===================================================
					// コンボボックス項目チェック セグメント2
					if(structCsv.geth_SEG_CONTENTS_2() != null && ("").equals(structCsv.geth_SEG_CONTENTS_2()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_2());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_2.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.SEG_CONTENTS2"; // Expj.SEG_CONTENTS_2=セグメント2
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA23605";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_2 );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
//●18セグメント2コンボ END===================================================

//●19セグメント3コンボ START===================================================
					// コンボボックス項目チェック セグメント3
					if(structCsv.geth_SEG_CONTENTS_3() != null && ("").equals(structCsv.geth_SEG_CONTENTS_3()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_3());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_3.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.SEG_CONTENTS3"; // Expj.SEG_CONTENTS_3=セグメント3
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA23606";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_3 );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
//●19セグメント3コンボ END===================================================

//●20セグメント4コンボ START===================================================
					// コンボボックス項目チェック セグメント4
					if(structCsv.geth_SEG_CONTENTS_4() != null && ("").equals(structCsv.geth_SEG_CONTENTS_4()) != true)
					{
						struct.setVALUE(structCsv.geth_SEG_CONTENTS_4());
						boolean stockUnitFlg = entity.mcheckV_SEG_CONTENTS_4.check(conn,struct);

						if (stockUnitFlg == false) {
							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.SEG_CONTENTS4"; // Expj.SEG_CONTENTS_4=セグメント4
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA23607";								// エラー番号
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_SEG_CONTENTS_4 );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
//●20セグメント4コンボ END===================================================
//20150803 ADD END BY SYSCOM
// コンボボックスチェック END-------------------------------------------------------------------------------------------

// ●1消費税コードマスタ存在チェック START====================================
                    if(structCsv.geth_TAX_CD() != null )
                    {
// ---------------AA0010:品目メンテナンス処理とチェックを同様にしている(JAVA記述)---------------
                        struct.setsetTAXCD(structCsv.geth_TAX_CD());
                        result = entity.mcheckM_TAX.check(conn, struct);
                        if(result == false){
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.TAX_CD_1"; // Expj.TAX_CD_1=消費税コード
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01001";                              // エラー番号
                            //ErrMsg = "指定した消費税コードは未登録です。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_TAX_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
    // ---------------AA0010:品目メンテナンス処理とチェックを同様にしている(JAVA記述)---------------
                        }
                    }
// ●1消費税コードマスタ存在チェック END======================================

//20150803 ADD SATART BY SYSCOM
// ●4負担部門チェック START==========================================
                    if(structCsv.geth_DEPT_CD() != null )
                    {
                        struct.seth_DEPT_CD(structCsv.geth_DEPT_CD());
                        result = entity.mcheckV_DEPT_CD.check(conn, struct);
                        if(result == false){
                        	System.out.println(structCsv.geth_DEPT_CD());
                        	System.out.println(result);
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.DEPT_CD"; // Expj.DEPT_CD=負担部門コード
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA23603";                              // エラー番号
                            //ErrMsg = "指定した負担部門コードは未登録です。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_DEPT_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ●4負担部門チェック END======================================
//20150803 ADD END BY SYSCOM

// ●4品目手配区分チェック START==========================================
                    // 品目手配区分が 6:定量手配品目または 7:発注点手配品目の時
                    if((("6").equals(structCsv.geth_MRP_ODR_TYP()) == true) ||      // 品目手配区分(MRP_ODR_TYP)が6:定量手配品目ではない
                       (("7").equals(structCsv.geth_MRP_ODR_TYP()) == true))        // 品目手配区分(MRP_ODR_TYP)が 7:発注点手配品目ではない
                    {
                        // 発注点在庫数
                        BigDecimal bdPoint = new BigDecimal(structCsv.geth_ODR_POINT());
                        BigDecimal bdZERO = new BigDecimal("0");
                        // 発注点在庫数の値が未入力または0以下の場合
                        if(bdPoint.compareTo(bdZERO) != 1){
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);
    
                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00003";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                      }
                    }
// ●4品目手配区分チェック END============================================

// ●5～11在庫数量区分チェック START==============================================
                    // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理の時ceil
                    //   荷姿単位数(PKG_UNIT_QTY)、安全在庫数量(SAFETY_STOCK)、最大手配数(MAX_ODR_QTY)
                    //   発注点在庫数(ODR_POINT)、定量発注数(FIXED_ODR_QTY)、最小手配数(MIN_ODR_QTY)、まるめ単位(MUL_ODR_QTY)
                    //  が少数入力なら場合エラー
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理
                        (Calculate.isNumeric(structCsv.geth_PKG_UNIT_QTY()) == true))       // 荷姿単位数(PKG_UNIT_QTY)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01507";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理
                        (Calculate.isNumeric(structCsv.geth_SAFETY_STOCK()) == true))       // 安全在庫数量(SAFETY_STOCK)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01508";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理
                        (Calculate.isNumeric(structCsv.geth_MAX_ODR_QTY()) == true))        // 最大手配数(MAX_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01509";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理
                        (Calculate.isNumeric(structCsv.geth_ODR_POINT()) == true))      // 発注点在庫数(ODR_POINT)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01510";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理
                        (Calculate.isNumeric(structCsv.geth_FIXED_ODR_QTY()) == true))      // 定量発注数(FIXED_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01511";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理
                        (Calculate.isNumeric(structCsv.geth_MIN_ODR_QTY()) == true))        // 最小手配数(MIN_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01512";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    if ((("1").equals(structCsv.geth_UNIT_QTY_TYP()) == true) &&                // 在庫数単位区分(UNIT_QTY_TYP)が1:整数管理
                        (Calculate.isNumeric(structCsv.geth_MUL_ODR_QTY()) == true))        // まるめ単位(MUL_ODR_QTY)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.UNIT_QTY_TYP"; // Expj.UNIT_QTY_TYP=在庫数単位区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01513";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_UNIT_QTY_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                    
// ●5～11在庫数量区分チェック END================================================

// ●15作業区分/作業実績区分チェック START=====================================
                    // 品目手配区分(MRP_ODR_TYP)が4:マニュアル手配品目、5:ロット手配品目、6:定量手配品目
                    // 7:発注点手配品目でないときに、作業実績区分(OPR_RSLT_TYP)が1:出来高実績の場合
                    // が少数入力なら場合エラーとする。
                    if((("4").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&      // 品目手配区分(MRP_ODR_TYP)が4:マニュアル手配品目ではない
                      (("5").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&       // 品目手配区分(MRP_ODR_TYP)が5:ロット手配品目ではない
                      (("6").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&       // 品目手配区分(MRP_ODR_TYP)が6:定量手配品目ではない
                      (("7").equals(structCsv.geth_MRP_ODR_TYP()) != true) &&       // 品目手配区分(MRP_ODR_TYP)が 7:発注点手配品目ではない
                      (("1").equals(structCsv.geth_OPR_RSLT_TYP()) == true))        // 作業実績区分(OPR_RSLT_TYP)が1:出来高実績の場合
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00138";                              // エラー番号
                        //ErrMsg = "該当の手配区分のとき、指定した作業実績区分は指定できません。";      // エラーメッセージ
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }

// ●15作業区分/作業実績区分チェック END=======================================

// ●16カレンダ存在チェック BEGIN=======================================

                    if(structCsv.geth_CAL_NO() != null && ("").equals(structCsv.geth_CAL_NO()) != true)
                    {
                        // カレンダヘッダチェック
                        struct.setsetM_CAL_H_CAL_NO(structCsv.geth_CAL_NO());
                        result = entity.mcheckM_CAL_H.check(conn, struct);
                        if(result == false)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.CAL_NO"; // Expj.CAL_NO=カレンダ番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);
    
                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01013";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CAL_NO );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                  }

// ●16カレンダ存在チェック END=======================================

// ●17最小手配数<最大手配数チェック START=====================================
                    // 品目手配区分(MRP_ODR_TYP)が5:ロット手配品目の時、
                    // 最大手配数より最小手配数が大きい場合エラーとする。
                    
                    if(("5").equals(structCsv.geth_MRP_ODR_TYP()) == true)
                    {
                        BigDecimal b1 = new BigDecimal(structCsv.geth_MAX_ODR_QTY());  // 最大手配数量
                        BigDecimal b2 = new BigDecimal(structCsv.geth_MIN_ODR_QTY());  // 最小手配数量
                        if (b2.compareTo(b1) == 1)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00147";                              // エラー番号
                            //ErrMsg = "最小手配数は最大手配数より小さい値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);


                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ●17最小手配数<最大手配数チェック END=======================================

// ●18まるめ単位<最大手配数チェック START====================================
                    // 品目手配区分(MRP_ODR_TYP)が5:ロット手配品目の時、
                    // 最大手配数よりまるめ単位が大きい場合エラーとする。
                    if(("5").equals(structCsv.geth_MRP_ODR_TYP()) == true)
                    {
                        BigDecimal b1 = new BigDecimal(structCsv.geth_MAX_ODR_QTY());  // 最大手配数量
                        BigDecimal b2 = new BigDecimal(structCsv.geth_MUL_ODR_QTY());  // まるい単位
                        if (b2.compareTo(b1) == 1)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00148";                              // エラー番号
                            //ErrMsg = "まるめ単位は最大手配数より小さい値を指定してください。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ●18まるめ単位<最大手配数チェック END======================================

// 2008/07/25 SYSCOM 磯部 ADD START
// ●20品目手配区分/製番チェック START========================================
                    // 工数管理品目区分(MANHOUR_TYP)が1：工数管理品目 かつ 、
                    // 品目手配区分(MRP_ODR_TYP)が1:製番でない場合エラーとする。
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // 工数管理品目区分(MANHOUR_TYP)が1:工数管理品目
                      (("1").equals(structCsv.geth_MRP_ODR_TYP()) != true))       // 品目手配区分(MRP_ODR_TYP)が1:製番ではない
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00184";                              // エラー番号
                        //ErrMsg = "工数管理品目の場合、品目手配区分は1:製番のみ有効です。";      // エラーメッセージ
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
// ●20品目手配区分/製番チェック END==========================================

// ●21内外作区分/内作チェック START==========================================
                    // 工数管理品目区分(MANHOUR_TYP)が1：工数管理品目 かつ 、
                    // 内外作区分(OUTSIDE_TYP)が1:内作でない場合エラーとする。
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // 工数管理品目区分(MANHOUR_TYP)が1:工数管理品目
                      (("1").equals(structCsv.geth_OUTSIDE_TYP()) != true))       // 内外作区分(OUTSIDE_TYP)が1:内作ではない
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.OUTSIDE_TYP"; // Expj.OUTSIDE_TYP=内外作区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00185";                              // エラー番号
                        //ErrMsg = "工数管理品目の場合、内外作区分は1:内作のみ有効です。";      // エラーメッセージ
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_OUTSIDE_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
// ●21内外作区分/内作チェック END============================================

// ●22棚卸区分/棚卸対象品外チェック START====================================
                    // 工数管理品目区分(MANHOUR_TYP)が1：工数管理品目 かつ 、
                    // 棚卸区分(ABC_TYP)が9:棚卸対象外でない場合エラーとする。
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // 工数管理品目区分(MANHOUR_TYP)が1:工数管理品目
                      (("9").equals(structCsv.geth_ABC_TYP()) != true))           // 棚卸区分(ABC_TYP)が9:棚卸対象外ではない
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.ABC_TYP"; // Expj.ABC_TYP=棚卸区分
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00186";                              // エラー番号
                        //ErrMsg = "工数管理品目の場合、棚卸区分は9:棚卸対象外のみ有効です。";      // エラーメッセージ
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ABC_TYP  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
// ●22棚卸区分/棚卸対象品外チェック END======================================

// ●23品目仕損率=0チェック START=============================================
                    // 工数管理品目区分(MANHOUR_TYP)が1：工数管理品目 かつ 、
                    // 品目仕損率(ITEM_SPOIL)が0でない場合エラーとする。
                    if((("1").equals(structCsv.geth_MANHOUR_TYP()) == true) &&    // 工数管理品目区分(MANHOUR_TYP)が1:工数管理品目
                      (("0").equals(structCsv.geth_ITEM_SPOIL()) != true))           // 品目仕損率(ITEM_SPOIL)が0ではない
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        // 多言語キーセット
                        tkey = "Expj.ITEM_SPOIL"; // Expj.ITEM_SPOIL=品目仕損率
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(tkey, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00187";                              // エラー番号
                        //ErrMsg = "工数管理品目の場合、品目仕損率は0でなければいけません。";      // エラーメッセージ
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_SPOIL  );
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        chkHasErr = true;
                        // 次明細へ処理を移行
                        continue;
                    }
// ●23品目仕損率=0チェック END===============================================
// 2008/07/25 SYSCOM 磯部 ADD END

// ●22品目分類コード存在チェック START====================================
					//品目分類コード01
					boolean classFlg = false;
					if(structCsv.geth_ITEM_CLASS_01_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_01_CD()) != true)
					{
						struct.setsetCLASS_CD2("01");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_01_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4099"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"01");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_01_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}						
					}
					
					//品目分類コード02
					if(structCsv.geth_ITEM_CLASS_02_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_02_CD()) != true){

						struct.setsetCLASS_CD2("02");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_02_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4100"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"02");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_02_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
						
					}
					//品目分類コード03
					if(structCsv.geth_ITEM_CLASS_03_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_03_CD()) != true){
						struct.setsetCLASS_CD2("03");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_03_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4101"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"03");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_03_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}						
					}
					//品目分類コード04
					if(structCsv.geth_ITEM_CLASS_04_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_04_CD()) != true){

						struct.setsetCLASS_CD2("04");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_04_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4102"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"04");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_04_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
					}
					//品目分類コード05
					if(structCsv.geth_ITEM_CLASS_05_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_05_CD()) != true){

						struct.setsetCLASS_CD2("05");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_05_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4103"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"05");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_05_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
					}
					//品目分類コード06
					if(structCsv.geth_ITEM_CLASS_06_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_06_CD()) != true){

						struct.setsetCLASS_CD2("06");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_06_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4104"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"06");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_06_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
					}
					//品目分類コード07
					if(structCsv.geth_ITEM_CLASS_07_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_07_CD()) != true){

						struct.setsetCLASS_CD2("07");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_07_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4105"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"07");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_07_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
					//品目分類コード08
					if(structCsv.geth_ITEM_CLASS_08_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_08_CD()) != true){

						struct.setsetCLASS_CD2("08");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_08_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4106"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"08");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_08_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
					}
					//品目分類コード09
					if(structCsv.geth_ITEM_CLASS_09_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_09_CD()) != true){

						struct.setsetCLASS_CD2("09");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_09_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4107"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"09");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_09_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
					}
					//品目分類コード10
					if(structCsv.geth_ITEM_CLASS_10_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_10_CD()) != true){

						struct.setsetCLASS_CD2("10");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_10_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4108"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"10");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_10_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
					}
					//品目分類コード11
					if(structCsv.geth_ITEM_CLASS_11_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_11_CD()) != true){

						struct.setsetCLASS_CD2("11");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_11_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4109"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"11");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_11_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
						
					}
					//品目分類コード12
					if(structCsv.geth_ITEM_CLASS_12_CD() != null && "".equals(structCsv.geth_ITEM_CLASS_12_CD()) != true){
						struct.setsetCLASS_CD2("12");
						struct.setsetCLASS_CD3(structCsv.geth_ITEM_CLASS_12_CD());
						classFlg = entity.mcheckM_CLASS.check(conn,struct);
						if(!classFlg){

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.Cmt4110"; 
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20027";								// エラー番号
							//ErrMsg = "【品目分類コードが［分類マスタ］に存在しません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo,"12");
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CLASS_12_CD );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}						
					}
					

// ●22品目分類コード存在チェック END======================================	
// ●23製番、ロット管理フラグ矛盾チェック START====================================
					if("1".equals(structCsv.geth_MRP_ODR_TYP()) == true || "2".equals(structCsv.geth_MRP_ODR_TYP()) == true){
						if("1".equals(structCsv.geth_LOT_CTRL_FLG()) == true)
						{

							ErrlineNo = i + 1;								// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=ロット管理フラグ
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";									// エラー区分
							ErrNo = "AA20048";								// エラー番号
							//ErrMsg = "製番の場合、ロット管理品目にできません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						
						}
					}

// ●23製番、ロット管理フラグ矛盾チェック END======================================

                    // ◆更新ラジオボタンが選択されたときのみチェックを行う。(※更新時のみ)◆
                    if (("true").equals(_save_struct.getrdoUpdate()) == true)
                    {

// ●12作業系列とのリードタイム設定の妥当性確認チェック START==================
// ---------------AA0010:品目メンテナンス処理とチェックを同様にしている(JAVA記述)---------------
                        // 品目比例分リードタイムが"0"の時チェックする。
                        if(("0").equals(structCsv.geth_PROP_LT()) == true)
                        {

                            // 品目の固定LT
                            Integer itemFixLT = IntegerConverter.Convert(structCsv.geth_FIXED_LT());

                            // 工場ごとのLT読込
                            boolean result2 = true;
                            struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                            List lts = entity.mLTbyPLANT.read(conn,struct);
                            for(int n = 0; n < lts.size(); n++){
                                AA0150010Struct w = (AA0150010Struct)lts.get(n);

                                // 系列比例LTが設定ありなら 無条件にOK
                                if(w.getreadSUM_PROP_LT().intValue() != 0) continue;

                                // 系列の固定LTが品目固定LTより大きければ警告対象
                                Integer procFixLT = w.getreadSUM_FIXED_LT();
                                if(itemFixLT.intValue() < procFixLT.intValue()){
                                    // エラーフラグセット
                                    result2 = false;
                                    // ループを抜ける。
                                    break;
                                }
                            }

                            // 作業系列情報との間に矛盾があった場合ワーニングで登録
                            if(result2 == false)
                            {
                                ErrlineNo = i + 1;                                      // エラー発生行(実際のエラー行)
                                // 多言語キーセット
                                tkey = "Expj.PROP_LT_2"; // Expj.PROP_LT_2=品目比例分リードタイム
                                ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                                // 多言語項目取得セット
                                ErrItem = CoreTools.getRBString(tkey, resource);

                                if(!("true").equals(_save_struct.getDO_CHK())){
                    // 登録する場合、ワーニング
                                    ErrNo = "AA60001";                                      // エラー番号
                                }else{
                    // 登録しない場合、ワーニング
                                    ErrNo = "AA01523";                                      // エラー番号
                                }
                // 登録しない場合、ワーニング
                                ErrCd = "2";                                            // エラー区分(ワーニングで更新)
                                //ErrMsg = "作業系列情報との間に矛盾があります。";      // エラーメッセージ
                                // メッセージ取得 
                                ExpjMessage emsg = new ExpjMessage(ErrNo);
                                ErrMsg = emsg.getMessage(locale);

                                // CSV出力(エラー)
                                csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PROP_LT  );
                                
                                intWarningCount++;
                                if(!bWarningCount){
                                	intWarningCtByData ++;
                                }
                                bError = true;
                            }
                        }
// ---------------AA0010:品目メンテナンス処理とチェックを同様にしている(JAVA記述)---------------
// ●12作業系列とのリードタイム設定の妥当性確認チェック END====================
                        
                        
//●14在庫情報チェック START==================================================
                        boolean errorFlg = false;
                        boolean result4 = true;     // チェック結果格納
                        struct.setsetMRP_ODR_ITEM_CD(structCsv.geth_ITEM_CD());
                        result4 = entity.mcheckM_ITEM_mrp_odr_typ.check(conn, struct);
                        struct.setsetM_ITEM_ITEM_CD(structCsv.geth_ITEM_CD());
						List itemParm = entity.mselectM_ITEM.read(conn,struct);
						String mrpOdrTyp = ((AA0150010Struct)itemParm.get(0)).getreadM_ITEM_MRP_ODR_TYP();
						String mrpDdrTypCsv = structCsv.geth_MRP_ODR_TYP();
                        if(result4 == true && mrpOdrTyp.equals(mrpDdrTypCsv) == false){
    						if("4".equals(mrpOdrTyp) || "5".equals(mrpOdrTyp) || "6".equals(mrpOdrTyp) ||"7".equals(mrpOdrTyp) ){
    						    if("1".equals(mrpDdrTypCsv) || "2".equals(mrpDdrTypCsv) || "8".equals(mrpDdrTypCsv)){
    						    	errorFlg = true;
    						    	ErrNo ="AA00211";
    	                            // メッセージ取得 
    	                            ExpjMessage emsg = new ExpjMessage(ErrNo,getMRP_ODR_TYP_DISPLAY_NAME(mrpOdrTyp),getMRP_ODR_TYP_DISPLAY_NAME(mrpDdrTypCsv));
    	                            ErrMsg = emsg.getMessage(locale);
    						    }
    						}
    						if("1".equals(mrpOdrTyp) || "2".equals(mrpOdrTyp)){
    							if(!"1".equals(mrpDdrTypCsv) && !"2".equals(mrpDdrTypCsv)){
        							errorFlg = true;
    						    	ErrNo ="AA00011";
    	                            // メッセージ取得 
    	                            ExpjMessage emsg = new ExpjMessage(ErrNo);
    	                            ErrMsg = emsg.getMessage(locale);
    							}
    						}
    						if("8".equals(mrpOdrTyp)){
    							errorFlg = true;
						    	ErrNo ="AA00011";
	                            // メッセージ取得 
	                            ExpjMessage emsg = new ExpjMessage(ErrNo);
	                            ErrMsg = emsg.getMessage(locale);	
    						}
                        }
						if(errorFlg == true){
                            ErrlineNo = i + 1;        
                            // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);
                            ErrCd = "1";                                            // エラー区分
                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
						}
// ●14在庫情報チェック END====================================================                   }
//// 品目手配区分と製番計画の関連チェック
						if("1".equals(mrpOdrTyp) || "2".equals(mrpOdrTyp)){
							if(!"1".equals(mrpDdrTypCsv) && !"2".equals(mrpDdrTypCsv)){
								if(entity.mcheckJOB_ODR_CD.check(conn, struct)){
		                            ErrlineNo = i + 1;        
		                            // エラー発生行(実際のエラー行)
		                            // 多言語キーセット
		                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
		                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
		                            // 多言語項目取得セット
		                            ErrItem = CoreTools.getRBString(tkey, resource);
							    	ErrNo ="AA00011";
		                            // メッセージ取得 
		                            ExpjMessage emsg = new ExpjMessage(ErrNo);
		                            ErrMsg = emsg.getMessage(locale);
		                            ErrCd = "1";                                            // エラー区分
		                            // CSV出力(エラー)
		                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
		                            // w_COLUMN_FLG変数にエラー情報を退避。
		                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
		                            // エラーフラグ"true"にセット
		                            bError = true;
		                            chkHasErr = true;
		                            // 次明細へ処理を移行
		                            continue;
								}
								
							}
						}


// ●13品目手配区分矛盾チェック START==========================================

// ---------------AA0010:品目メンテナンス処理とチェックを同様にしている(JAVA記述)---------------
                        // 品目手配別構成チェック

                        boolean result3 = true;     // チェック結果格納
                        result3 = true;
                        ProductStructureRepository rep = new ProductStructureRepository(conn);

                        // ■子■構成情報取得
                        List list = rep.orderDeployment(structCsv.geth_ITEM_CD());
                        // 妥当性確認
                        for (int Z = 0; Z < list.size(); Z++)
                        {
                            // 子品目取得
                            struct.setsetMRP_ITEM_CD((String)list.get(Z));
                            List comList = entity.mselectMRP_ODR_TYP.read(conn, struct);
                            AA0150010Struct comp = (AA0150010Struct)comList.get(0);
                            // 判定
                            // 引数子品目の品目手配区分の妥当性確認=1
                            // 引数：1.子構成情報 2.対象データ 3.子品目 4."1"
                            if (checkMRP_ODR_TYP(rep, structCsv, comp, 1) == false) {
                                result3 = false;
                                break;
                            }
                        }

                        // ■親■構成情報取得
                        List list2 = rep.reverseDeployment(structCsv.geth_ITEM_CD());
                        // 妥当性確認
                        for (int X = 0; X < list2.size(); X++)
                        {
                            // 親品目取得
                            struct.setsetMRP_ITEM_CD((String)list2.get(X));
                            List parentList = entity.mselectMRP_ODR_TYP.read(conn, struct);
                            AA0150010Struct parent = (AA0150010Struct)parentList.get(0);

                            // 判定
                            // 引数親品目の品目手配区分の妥当性確認=2
                            // 引数：1.親構成情報 2.対象データ 3.親品目 4."2"
                            if (checkMRP_ODR_TYP(rep, parent, structCsv, 2) == false) {
                                result3 = false;
                                break;
                            }
                        }

                        // エラー判定
                        if (result3 == false) {
                            ErrlineNo = i + 1;                                      // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MRP_ODR_TYP"; // Expj.MRP_ODR_TYP=品目手配区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                            // エラー区分
                            ErrNo = "AA00010";                                      // エラー番号
                            //ErrMsg = "品目手配区分が製品構成情報に矛盾しています。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_ODR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }

// ---------------AA0010:品目メンテナンス処理とチェックを同様にしている(JAVA記述)---------------

// ●13品目手配区分矛盾チェック END============================================



// 2008/07/25 SYSCOM 磯部 ADD START
                    // 再度品目情報を取得する
                    struct.setC_setITEM_CD(structCsv.geth_ITEM_CD());
                    List listmitemType = entity.mreadM_ITEM.read(conn, struct);
                    AA0150010Struct itemStruct = (AA0150010Struct)listmitemType.get(0);
// ●24下品目をもつ工数管理品目チェック START=================================
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    result = entity.mcheckM_PS.check(conn, struct);
                    if (result == true) {
                        if(!itemStruct.getC_MANHOUR_TYP().equals(structCsv.geth_MANHOUR_TYP()) &&
                            ("1").equals(structCsv.geth_MANHOUR_TYP())){
                            if(("1").equals(structCsv.geth_MRP_ODR_TYP())){
                                ErrlineNo = i + 1;                                      // エラー発生行(実際のエラー行)
                                // 多言語キーセット
                                tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=工数管理品目区分
                                ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                                // 多言語項目取得セット
                                ErrItem = CoreTools.getRBString(tkey, resource);

                                ErrCd = "1";                                            // エラー区分
                                ErrNo = "AA00180";                                      // エラー番号
                                //ErrMsg = "下位品目を持つ場合、工数管理品目への変更はできません。";      // エラーメッセージ
                                // メッセージ取得 
                                ExpjMessage emsg = new ExpjMessage(ErrNo);
                                ErrMsg = emsg.getMessage(locale);

                                // CSV出力(エラー)
                                csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                                // w_COLUMN_FLG変数にエラー情報を退避。
                                structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                                // エラーフラグ"true"にセット
                                bError = true;
                                chkHasErr = true;
                                // 次明細へ処理を移行
                                continue;
                            }
                        }
                    }
// ●24下品目をもつ工数管理品目チェック END===================================

// ●25手配、在庫情報有時の工数管理品目チェック START=========================
					boolean bErroJudge = false;		// エラー処理移行判断用

					// 所要量チェック
					struct.setsetT_OD_ITEM_CD(structCsv.geth_ITEM_CD());
					List tOdList = entity.mselectT_OD.read(conn, struct);
					if(tOdList.size() != 0){
						bErroJudge = true;
					}

					// 保管区別製番在庫の手持在庫数が0以外の時、bErroJudgeフラグを立てる
					struct.setsetT_JOB_ODR_CD_ITEM_CD(structCsv.geth_ITEM_CD());
					List tJobOdrCdStockList = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
					if(tJobOdrCdStockList.size() != 0){
						AA0150010Struct tJobOdrCdStockStruct = (AA0150010Struct)tJobOdrCdStockList.get(0);
						if(!tJobOdrCdStockStruct.getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY().equals("0")){
							bErroJudge = true;
						}
					}

					// 保管区別品目在庫の手持在庫数が0以外の時、bErroJudgeフラグを立てる
					struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
					List tItemStockList = entity.mselectT_ITEM_STOCK.read(conn, struct);
					if(tItemStockList.size() != 0){
						AA0150010Struct tItemStockStruct = (AA0150010Struct)tItemStockList.get(0);
						if(!tItemStockStruct.getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY().equals("0")){
							bErroJudge = true;
						}
					}

					if(bErroJudge == true){
                        if(!itemStruct.getC_MANHOUR_TYP().equals(structCsv.geth_MANHOUR_TYP())){

                            ErrlineNo = i + 1;                                      // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=工数管理品目区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                            // エラー区分
                            ErrNo = "AA00181";                                      // エラー番号
                            //ErrMsg = "手配情報または在庫情報があるため、工数管理品目区分を変更できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ●25手配、在庫情報有時の工数管理品目チェック END===========================

// ●26作業系列の作業系列内外作区分チェック START=============================
					// 作業系列が存在し、かつ作業系列内外作区分 = 2:外作の場合
					result = entity.mcheckM_PROC_GRP.check(conn, struct);
					if (result) {
						// 工数管理品目区分チェック
						if(!itemStruct.getC_MANHOUR_TYP().equals(structCsv.geth_MANHOUR_TYP()) &&
							("1").equals(structCsv.geth_MANHOUR_TYP())){
							ErrlineNo = i + 1;										// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.MANHOUR_TYP"; // Expj.MANHOUR_TYP=工数管理品目区分
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";											// エラー区分
							ErrNo = "AA00189";										// エラー番号
							//ErrMsg = "作業系列に外作作業がある場合、工数管理品目への変更はできません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MANHOUR_TYP );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
					}
// ●26作業系列の作業系列内外作区分チェック END===============================
// 2008/07/25 SYSCOM 磯部 ADD END
// ●20計量単位変更チェック START==================================================
						boolean  stockOnHandFlg =false;               //手持在庫数量チェックフラグ
						struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
						stockOnHandFlg = entity.mcheckT_ITEM_STOCK.check(conn,struct);
						//品目計量単位取得
						struct.setsetM_ITEM_ITEM_CD(structCsv.geth_ITEM_CD());
						itemParm = entity.mselectM_ITEM.read(conn,struct);
						String stockUnit = ((AA0150010Struct)itemParm.get(0)).getreadM_ITEM_STOCK_UNIT();
						
						String stockUnitCsv = structCsv.geth_STOCK_UNIT();             //CSVの計量単位取得
						
						if(stockOnHandFlg && null != stockUnit && !"".equals(stockUnit) && stockUnit.equals(stockUnitCsv) == false){
							ErrlineNo = i + 1;										// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.STOCK_UNIT"; // Expj.STOCK_UNIT=計量単位
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";											// エラー区分
							ErrNo = "AA22055";										// エラー番号
							//ErrMsg = "在庫が存在しているため、計量単位を変更できません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_STOCK_UNIT );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						
							
						}

// ●20計量単位変更チェック END====================================================
						
// ●21ロット管理フラグ変更チェック START==================================================
						struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
						stockOnHandFlg = entity.mcheckT_ITEM_STOCK.check(conn,struct);
						//品目ロット管理フラグ取得
						struct.setsetM_ITEM_ITEM_CD(structCsv.geth_ITEM_CD());
						itemParm = entity.mselectM_ITEM.read(conn,struct);
						String lotCtrlFlg = ((AA0150010Struct)itemParm.get(0)).getreadM_ITEM_LOT_CTRL_FLG();
						
						String lotCtrlFlgCsv = structCsv.geth_LOT_CTRL_FLG();             //CSVのロット管理フラグ取得
						if(stockOnHandFlg && lotCtrlFlg != null && !"".equals(lotCtrlFlg) && lotCtrlFlg.equals(lotCtrlFlgCsv) == false){
							ErrlineNo = i + 1;										// エラー発生行(実際のエラー行)
							// 多言語キーセット
							tkey = "Expj.LOT_CTRL_FLG"; // Expj.LOT_CTRL_FLG=ロット管理フラグ
							ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
							// 多言語項目取得セット
							ErrItem = CoreTools.getRBString(tkey, resource);

							ErrCd = "1";											// エラー区分
							ErrNo = "AA22056";										// エラー番号
							//ErrMsg = "在庫が存在しているため、ロット管理フラグを変更できません。";		// エラーメッセージ
							// メッセージ取得 
							ExpjMessage emsg = new ExpjMessage(ErrNo);
							ErrMsg = emsg.getMessage(locale);

							// CSV出力(エラー)
							csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_LOT_CTRL_FLG );
							// w_COLUMN_FLG変数にエラー情報を退避。
							structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
							// エラーフラグ"true"にセット
							bError = true;
							chkHasErr = true;
							// 次明細へ処理を移行
							continue;
						}
// ●21ロット管理フラグ変更チェック END====================================================						
                    }       //更新時のみチェック end if
                }   //登録OR更新時チェック end if

                // ◆削除ラジオボタンが選択されたときのみチェックを行う。(※削除時のみ)◆
                if (("true").equals(_save_struct.getrdoDelete()) == true)
                {
                    struct.setsetT_OD_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：所要量
                    List list1 = entity.mselectT_OD.read(conn, struct);
                    if (list1.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00012";                              // エラー番号
                            //ErrMsg = "所要量が存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    struct.setsetT_JOB_ODR_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：製番計画
                    List list2 = entity.mselectT_JOB_ODR.read(conn, struct);
                    if (list2.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00013";                              // エラー番号
                            //ErrMsg = "製番計画が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }

                    struct.setsetM_PS_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：製品構成
                    List list3 = entity.mselectM_PS.read(conn, struct);
                    if (list3.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00014";                              // エラー番号
                            //ErrMsg = "製品構成が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD );
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }

                    struct.setsetT_ITEM_STOCK_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：保管区別品目在庫
                    List list4 = entity.mselectT_ITEM_STOCK.read(conn, struct);
                    if (list4.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00015";                              // エラー番号
                            //ErrMsg = "保管区別品目在庫が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }

                    struct.setsetT_JOB_ODR_CD_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：保管区製別番在庫
                    List list5 = entity.mselectT_JOB_ODR_CD_STOCK.read(conn, struct);
                    if (list5.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00016";                              // エラー番号
                            //ErrMsg = "保管区別製番在庫が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }

                    struct.setsetT_OPR_RSLT_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：作業実績
                    List list6 = entity.mselectT_OPR_RSLT.read(conn, struct);
                    if (list6.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00017";                              // エラー番号
                            //ErrMsg = "作業実績が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }

                    struct.setsetT_RLSD_P_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：発注残
                    List list7 = entity.mselectT_RLSD_PUCH_ODR.read(conn, struct);
                    if (list7.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00018";                              // エラー番号
                            //ErrMsg = "発注残が存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }

                    struct.setsetT_WORK_IN_ITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：作業系列別仕掛
                    List list8 = entity.mselectT_WORK_IN_PROC_BY_PROC.read(conn, struct);
                    if (list8.size() != 0) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00019";                              // エラー番号
                            //ErrMsg = "作業系列別仕掛が存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result9 = true;     // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：有償支給履歴
                    result9 = entity.mcheckT_PAST_ONEROUS_CONS.check(conn, struct);
                    if (result9) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00999";                              // エラー番号
                            //ErrMsg = "有償支給履歴が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result10 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：購入返品実績
                    result10 = entity.mcheckT_PUCH_ODR_RTN_RSLT.check(conn, struct);
                    if (result10) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01000";                              // エラー番号
                            //ErrMsg = "購入返品実績が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result11 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：品目別入庫先保管区
                    result11 = entity.mcheckM_ITEM_RCV_WH.check(conn, struct);
                    if (result11) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00998";                              // エラー番号
                            //ErrMsg = "品目別入庫先保管区が存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result12 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：MPSロック
                    result12 = entity.mcheckSYS_MPS_LOCK.check(conn, struct);
                    if (result12) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00162";                              // エラー番号
                            //ErrMsg = "MPSロックが存在するので削除できません。";       // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result13 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：出荷指示
                    result13 = entity.mcheckT_SHIP_ODR.check(conn, struct);
                    if (result13) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00163";                              // エラー番号
                            //ErrMsg = "出荷指示が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result14 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：出来高実績
                    result14 = entity.mcheckT_OUTPUT_RSLT.check(conn, struct);
                    if (result14) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00078";                              // エラー番号
                            //ErrMsg = "出来高実績が存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result15 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：品目別仕
                    result15 = entity.mcheckT_WORK_IN_PROC_BY_ITEM.check(conn, struct);
                    if (result15) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00164";                              // エラー番号
                            //ErrMsg = "品目別仕が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result16 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：製番引当
                    result16 = entity.mcheckT_JOB_ODR_ALC.check(conn, struct);
                    if (result16) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00165";                              // エラー番号
                            //ErrMsg = "製番引当が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result17 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：積送在庫
                    result17 = entity.mcheckT_TRANSPORT_STOCK.check(conn, struct);
                    if (result17) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00166";                              // エラー番号
                            //ErrMsg = "積送在庫が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result18 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：購入品マスタ
                    result18 = entity.mcheckM_CS_PUCH.check(conn, struct);
                    if (result18) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00167";                              // エラー番号
                            //ErrMsg = "購入品マスタが存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result19 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：品目別加工費
                    result19 = entity.mcheckT_ITEM_PROC_COST.check(conn, struct);
                    if (result19) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00168";                              // エラー番号
                            //ErrMsg = "品目別加工費が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result20 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：品目別加工費マスタ
                    result20 = entity.mcheckM_ITEM_PROC_COST.check(conn, struct);
                    if (result20) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00169";                              // エラー番号
                            //ErrMsg = "品目別加工費マスタが存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result21 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：品目別原価
                    result21 = entity.mcheckT_ITEM_COST.check(conn, struct);
                    if (result21) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00170";                              // エラー番号
                            //ErrMsg = "品目別原価が存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    boolean result22 = true;        // チェック結果格納
                    struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                    // 参照整合性検証：保管区別品目棚卸
                    result22 = entity.mcheckT_ITEM_INV.check(conn, struct);
                    if (result22) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00171";                              // エラー番号
                            //ErrMsg = "保管区別品目棚卸が存在するので削除できません。";        // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                    }
                    
                    // インストールオプションの存在確認
                    boolean result27 = entity.mcheckSYS_INSTALL_OPTIONS.check(conn, struct);
                    if(result27 == false){
                        boolean result23 = true;        // チェック結果格納
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // 参照整合性検証：製品マスタ
                        result23 = entity.mcheckM_ITEM_SPEC.check(conn, struct);
                        if (result23) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00173";                              // エラー番号
                            //ErrMsg = "製品マスタが存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        
                        boolean result24 = true;        // チェック結果格納
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // 参照整合性検証：製品単価マスタ
                        result24 = entity.mcheckM_UNIT_COST.check(conn, struct);
                        if (result24) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00174";                              // エラー番号
                            //ErrMsg = "製品単価マスタが存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    } else {
                    	boolean result25 = true;        // チェック結果格納
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // 参照整合性検証：販売単価マスタ
                        result25 = entity.mcheckM_SALES_UNIT_COST.check(conn, struct);
                        if (result25) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA34036";                              // エラー番号
                            //ErrMsg = "販売単価マスタが存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        
                        boolean result26 = true;        // チェック結果格納
                        struct.setsetITEM_CD(structCsv.geth_ITEM_CD());
                        // 参照整合性検証：得意先品目マスタ
                        result26 = entity.mcheckM_CUST_ITEM.check(conn, struct);
                        if (result26) {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            // 多言語キーセット
                            tkey = "Expj.ITEM_CD"; // Expj.ITEM_CD=品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(tkey, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA34101";                              // エラー番号
                            //ErrMsg = "得意先品目マスタが存在するので削除できません。";      // エラーメッセージ
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            chkHasErr = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    	
                    }
                }   //削除チェック end if

// 登録/更新時チェック END-------------------------------------------------------------------------------------------
                // チェックエラーとなっていない場合、正常レコードとしてカウント
                if(bError != true)
                {
                    intSuccessCount++;
                }
                ////////////////////////////////////////////////////////////////////////////////////
                // 個別チェック処理終了
                ////////////////////////////////////////////////////////////////////////////////////
            }  //for end

            // チェック結果処理(エラーリストサイズの取得)
            if(getListsize() > 0 && chkHasErr)
            {
                bSuccess = false;
            }


            // エラーデータがない場合、チェック件数をINFOに表示する。(チェックボックス(チェックのみ行う)がチェックの場合)
            if (("true").equals(_save_struct.getDO_CHK()) == true){
                    // エラーデータ有りのため更新しなかった場合のメッセージ表示
                    ExpjMessage emsg = new ExpjMessage( "AA01517",""+intSuccessCount,""+intWarningCount,""+(intCsvDataCount - intSuccessCount-intWarningCtByData));
                    msgStruct.addInfo( emsg );
                    sysLog.config(emsg, getsysUSER_CD());
            }else{
                    // エラーデータ存在時、画面ｲﾝﾌｫﾒｰｼｮﾝへ出力
                    if(bSuccess != true)
                    {
                        // エラー件数があればメッセージ表示する
                        // なければリスト(ワーニング)のみと判定する。
                        if ((intCsvDataCount - intSuccessCount) > 0)
                        {
                            // エラーデータ有りのため更新しなかった場合のメッセージ表示
                            ExpjMessage emsg = new ExpjMessage( "AA01516",""+intSuccessCount,""+intWarningCount,""+(intCsvDataCount - intSuccessCount-intWarningCtByData));
                            msgStruct.addError( emsg );
                            sysLog.severe(emsg, getsysUSER_CD());
                        }
                    } else {
                        // エラー・ワーニングがない場合
                        if(intWarningCount == 0){
                            ExpjMessage emsg = new ExpjMessage( "AA01514", ""+intSuccessCount);
                            msgStruct.addInfo( emsg );
                            sysLog.config(emsg, getsysUSER_CD());
                        }else{
                            ExpjMessage emsg = new ExpjMessage( "AA01515", ""+intSuccessCount,""+intWarningCount);
                            msgStruct.addWarn( emsg );
                            sysLog.warning(emsg, getsysUSER_CD());
                        }
                    }
                }

        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
        return bSuccess;
    }
    /**
     * ファイルネーミング
     *
     * @return  正常:true / エラー:false
     */
  private boolean chkOutputFilePath() throws BusinessProcessException, FoundationException
  {
    String filePath = null;
    try{
        // 出力ファイルネーミング
            PrivateConfig pc = new PrivateConfig(conn);
            // 訂正ログファイル名取得(システムパラメータより取得)
            String CsvCancelFileName = pc.getString("ITEM_CANCEL");
            if(null == CsvCancelFileName || "".equals(CsvCancelFileName)){
                  msgStruct.clear();
                    // エラーメッセージ表示
                    ExpjMessage emsg = new ExpjMessage( "AA01521");
                    msgStruct.addError( emsg );
                    sysLog.severe(emsg, getsysUSER_CD());
                    return false;
            }
            // ファイルネーミング
            FileNaming fnm = new FileNaming();
            // ユーザ
            fnm.setUser(getsysUSER_CD());
            // 拡張子
            fnm.setExtension(EXTENSION_CSV);
            // ディレクトリ
            fnm.setDirectory(CsvCancelFileName);
            filePath = fnm.naming();
            if(null == filePath || "".equals(filePath)){
                  msgStruct.clear();
                    // エラーメッセージ表示
                    ExpjMessage emsg = new ExpjMessage( "AA01522");
                    msgStruct.addError( emsg );
                    sysLog.severe(emsg, getsysUSER_CD());
                    return false;
            }
        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0");
            sysLog.severe(emsg, getsysUSER_CD());
            ExpjException ee = new ExpjException(e, emsg);
            throw ee;
        }
        struct.setCANCEL_FILE(filePath);
        return true;
  }
    /**
     * ＣＳＶデータＤＢ反映処理
     *
     * @param   listCsv CSVデータリスト
     * @return  正常:true / エラー:false
     */
    private boolean csvData2Db(List listCsv) throws BusinessProcessException, FoundationException
    {
        // ログ出力情報格納用
        String logMessage = "";

        boolean bSuccess = false;   // 処理成功フラグ初期化
        boolean aSuccess = true;    // 処理成功フラグ初期化(メッセージ)
        boolean bDBUpdate = false;  // DB更新中フラグ初期化
        boolean bWrite = false; // 書くファイル
        int intCsvDataCount = 0;    // 対象データ件数
        String strUserId = "";      // 訂正ログ出力用(ユーザーID)
        String strSyoriKbn = "";    // 訂正ログ出力用(処理区分)
        String strDataKbn = "";     // 訂正ログ出力用(変更データ区分)

        // 処理直前のstruct情報を退避
        AA0150010Struct structCopy = new AA0150010Struct();
        structCopy.copy(struct);
        try
        {
            AA0150010Struct structCsv;
            // トランザクション開始
            conn.beginTransWeb();
            // DB更新中フラグON
            bDBUpdate = true;

            // システム日付取得
            beginTransaction();
            strSysdate = struct.getsSysdate();

            // データ件数分処理を繰り返す
            intCsvDataCount = listCsv.size();
            for(int i = 0; i < intCsvDataCount; i++)
            {
                // CSV情報取得
                struct.copy((AA0150010Struct)listCsv.get(i));
                struct.setCANCEL_FILE(structCopy.getCANCEL_FILE());
                structCsv = (AA0150010Struct)listCsv.get(i);
                strUserId = "";     // 訂正ログ出力用初期化(ユーザーID)
                strSyoriKbn = "";   // 訂正ログ出力用初期化(処理区分)
                strDataKbn = "";    // 訂正ログ出力用初期化(変更データ区分)

                // 親画面のラジオボタンが1:登録の場合の処理
                if (("true").equals(_save_struct.getrdoInsert()) == true)
                {
                    // ■品目マスタ登録処理■
                    entity.minsertM_ITEM.create(conn, struct);

                    if(structCsv.geth_WH_CD() != null && !"".equals(structCsv.geth_WH_CD())){
                    	// INSERTキーセット
	                    struct.setsetM_WH_ITEM_CD(structCsv.geth_ITEM_CD());        // 品目番号
	                    struct.setsetM_WH_WH_CD(structCsv.geth_WH_CD());            // 保管区コード
	                    struct.setsetM_WH_PLANT_CD(getsysPLANT_CD());               // ログインユーザー工場コード
	                    struct.setsetM_WH_WH_REF_NO("1");                           // 品目別保管区先優先順位
	
	                    // ■品目別保管先優先順位登録処理■
	                    entity.minsertM_WH_PRIORITY.create(conn, struct);
                    }

                    // *訂正ログ出力処理*
                    strUserId = getsysUSER_CD();            // ユーザーIDセット
                    strSyoriKbn = "1";                      // 処理区分セット(1:登録)
                    strDataKbn = "2";                       // 変更データ区分セット
                    // 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;
                }
                // 親画面のラジオボタンが2:変更の場合の処理
                if (("true").equals(_save_struct.getrdoUpdate()) == true)
                {
                    // *訂正ログ出力処理*
                    strUserId = getsysUSER_CD();            // ユーザーIDセット
                    strSyoriKbn = "2";                      // 処理区分セット(2:変更)
                    strDataKbn = "1";                       // 変更データ区分セット
                    // 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;

                    // ■品目マスタ更新処理■
                    entity.mupdateM_ITEM.update(conn, struct);
                    strDataKbn = "2";                       // 変更データ区分セット
                    // 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;
                }
                // 親画面のラジオボタンが3:削除の場合の処理
                if (("true").equals(_save_struct.getrdoDelete()) == true)
                {
                    // *訂正ログ出力処理*
                    strUserId = getsysUSER_CD();            // ユーザーIDセット
                    strSyoriKbn = "3";                      // 処理区分セット(3:削除)
                    strDataKbn = "1";                       // 変更データ区分セット
                    // 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                    csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn ,bWrite);
                    bWrite = true;
                    // ■品目マスタ削除処理■
                    entity.mdeleteM_ITEM.delete(conn, struct);
                }
                    
            } // Endfor()

            // コミット発行
            conn.commit();

            // DB更新中フラグOFF
            bDBUpdate = false;

            // 処理成功フラグ設定
            bSuccess = true;
        } catch(SQLException e) {
            logMessage = "M_ITEM.ITEM_CD:" +  struct.geth_ITEM_CD();
            ExpjMessage emsg = new ExpjMessage( "ZZ01006", logMessage );
            sysLog.severe(emsg, getsysUSER_CD());
            setSqlExceptionMsg(e);
        } finally {
            // DB更新処理中に何らかのエラーが発生した場合はroolbackをおこなう
            if(bDBUpdate == true)
            {
                // ロールバック
                conn.rollback();

                logMessage = "Control：csvData2Db - rollback!! ";
                setSyslogConfig(logMessage);

                // 処理直前のstruct情報復帰
                struct.copy(structCopy);

                // 更新失敗のメッセージ表示
                ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intCsvDataCount, "0","0");
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
            }

            if(aSuccess == true)
            {
                if(bSuccess == true)
                {
                    // 正常終了のメッセージ表示
                    //ExpjMessage emsg = new ExpjMessage( "AH60005", ""+intCsvDataCount, "0");
                    //msgStruct.addInfo( emsg );
                    //sysLog.config(emsg, getsysUSER_CD());
                }
            }
        }
        return bSuccess;
    }
//---------- ＣＳＶ取込関連の処理 END---------------------------------------------------


//---------- 入力関連チェックの処理 START---------------------------------------------------

    /**
    *   数値チェック
    *   項目が数値か判断する
    *
    *   @param    strInString  入力パラメータ
    *   @return 正常:true / エラー:false
    */
    public boolean IsNumChk(String strInString)
    {
        // 数値のinputをセット用
        //private int ElementNumUp;

        try
        {
            //int InString = Integer.valueOf(strInString).intValue();
            double InString = Double.parseDouble(strInString);
        }
        catch(Exception e)
        {
            // 数値ではない場合Exceptionに飛ばして処理
            // falseをセットして処理を抜ける(エラー：数値以外の入力)
            return false;
        }
        // trueをセットして処理を抜ける(正常終了)
        return true;
    }

    /**
    *   数値範囲チェック
    *   項目が数値範囲か判断する
    *
    *   @param    strInString  入力パラメータ
    *   @param    strRangeFlg  "1":99999999999999.9999 ～ 0.0001
    *                          "2":99999.9999 ～ 0.0001
    *             bZeroFlg     true  : チェック時、ゼロを含む
    *                          false : チェック時、ゼロは対象外
    *   @return 正常:true / エラー:false
    */
    public boolean isNotInNumRange(String strInString,String strRangeFlg,boolean bZeroFlg)
    {
        boolean b = false;                                             // 戻す値
        int ONE = 1;                                                   // 比較フラグ1
        int ZERO = 0;                                                  // 比較フラグ0
        BigDecimal bdZERO = new BigDecimal("0");                       // 固定値0
        BigDecimal in = new BigDecimal(strInString);                   // 入力パラメータ
        BigDecimal maxValue1 = new BigDecimal("99999999999999.9999");  // 固定値最大値
        BigDecimal maxValue2 = new BigDecimal("99999.9999");           // 固定値最大値
        BigDecimal minValue = new BigDecimal("0.0001");                // 固定値最小値
        
        
        if(!bZeroFlg){
            if(bdZERO.compareTo(in)==ZERO) return false;
      }
        // 99999999999999.9999 ～ 0.0001の判定
        if("1".equals(strRangeFlg)){
            if(in.compareTo(maxValue1)==ONE || minValue.compareTo(in) == ONE){
                b = true;
            }
        }
        // 99999.9999 ～ 0.0001の判定
        else{
            if(in.compareTo(maxValue2)==ONE || minValue.compareTo(in) == ONE){
                b = true;
            }
        }
        // 処理終了
        return b;
    }
    /**
    *   文字列長さチェック
    *   
    *   @param    strInString  入力パラメータ
    *   @return 正常:true / エラー:false
    */
    public int StrLengthChk(String strInput)
    {
        int intLen = 0;
        //strInput = GetSjisFromUni(strInput);

        try {
            byte[] bytstr = strInput.getBytes("SJIS");
            intLen = bytstr.length;
        } catch( Exception e )
            {return  0;}
    return intLen;
    }

//---------- 入力関連チェックの処理 END---------------------------------------------------

//---------- 品目手配区分構成処理 START---------------------------------------------------
    /**
     * 品目手配区分別構成チェック
     * @param repository 製品構成リポジトリ
     * @param parent 親品目番号
     * @param comp 子品目番号
     * @return true：OK  false:NG
    */
    private boolean checkMRP_ODR_TYP(ProductStructureRepository repository,
                                        AA0150010Struct parent, AA0150010Struct comp, int ChkTaisyo)
        throws SQLException, FoundationException
    {
        Integer parent_typ ;
        Integer comp_typ ;
        String parItem_cd = "";
        String comItem_cd = "";


        // 品目手配区分:子品目(1)、親(2)の振り分け int aCnt = Integer.parseInt(CsvCnount);
        if (ChkTaisyo == 1)
        {
            parent_typ = Integer.valueOf(parent.geth_MRP_ODR_TYP());
            comp_typ = comp.getreadMRP_ODR_TYP();
            parItem_cd = parent.geth_ITEM_CD();
            comItem_cd = comp.getreadMRP_ITEM_CD();
        } else {
            parent_typ = parent.getreadMRP_ODR_TYP();
            comp_typ = Integer.valueOf(comp.geth_MRP_ODR_TYP());
            parItem_cd = parent.getreadMRP_ITEM_CD();
            comItem_cd = comp.geth_ITEM_CD();
        }
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

                itemList = repository.reverseDeployment(parItem_cd);

                AA0150010Struct workStruct = new AA0150010Struct();
                for(int i = 0; i < itemList.size(); i++)
                {
                    // 取得した親品目の手配区分取得
                    workStruct.setsetMRP_ITEM_CD((String)itemList.get(i));
                    List parentList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
                    Integer typ = ((AA0150010Struct)parentList.get(0)).getreadMRP_ODR_TYP();
                    
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
                itemList = repository.orderDeployment(comItem_cd);
                AA0150010Struct workStruct = new AA0150010Struct();
                for(int i = 0; i < itemList.size(); i++)
                {
                    // 取得した子品目の手配区分取得
                    workStruct.setsetMRP_ITEM_CD((String)itemList.get(i));
                    List compList = entity.mselectMRP_ODR_TYP.read(conn, workStruct);
                    Integer typ = ((AA0150010Struct)compList.get(0)).getreadMRP_ODR_TYP();
                    
                    if(typ.intValue() == 1 || typ.intValue() == 2 ) return false;
                }
            }
        }

        return true;
    }
    
    
    /**
     * 禁則文字チェック(「_」 「"」「\」)
     * @param str  文字列
     * @return     「_」: 1
     *             「"」: 2
     *             「\」: 3
     *            その他: 0
     */
  private int chkHankaku(String str) {
        int state = 0;

        CharacterIterator iter = new StringCharacterIterator(str);

        for (char c = iter.first();
            c != CharacterIterator.DONE;
            c = iter.next()) {
            // 「%」 0x0025
            if (c == 0x0025) {
                // 禁則文字!
                state = 1;
                break;
            }
            // 「\」 0x005C
            if (c == 0x005C) {
                // 禁則文字!
                state = 2;
                break;
            }
            // 「_」 0x005F
            if (c == 0x005F ) {
                // 禁則文字!
                state = 3;
                break;
            }
        }
        return state;
    }

    /**
     * 文字(\)変換、「\」なら、「\」を直前に追加する
     * @param in  文字列
     * @return    編集後文字列
     */
  private String replaceSlash(String in) {
        if(in == null)
            return null;
        StringBuffer buffer = new StringBuffer(in.length()*2);
        for(int i=0;i<in.length();i++) {
            char c = in.charAt(i);
            if(c == '\\')
                buffer.append("\\\\");
            else
                buffer.append(c);
        }
        return buffer.toString();
    }
//---------- 品目手配区分構成処理 START---------------------------------------------------

    // TODO: ユーザ定義のコードを記述してください
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * CSV取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvImport() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
        // TODO: ユーザ定義のコードを記述してください

        // リストクリア
        if(null == list){
          list = new ArrayList();
      }else{
        list.clear();
      }

        // 親画面のstructを退避
        saveParentStruct();

        // サブ1画面初期化
        struct.clear();

                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
			//{{user_implement_dev:<controlCsvIn>
        // TODO: ユーザ定義のコードを記述してください
        // エラーフラグ初期化
        boolean bError = false;

        // 画面表示用リストクリア
        if(null == list){
          list = new ArrayList();
      }else{
        list.clear();
      }
      
        // ＣＳＶデータ取得
        List listCsv = readCsvData();
        // ＣＳＶデータが取得できない時エラー
        if(listCsv == null)
        {
            bError = true;
        }
        
        // チェックボックス(チェックのみ行う)がチェックの場合、DBへのデータの反映は行わない。
        if (("true").equals(_save_struct.getDO_CHK()) != true && bError != true)
        {
          if(chkOutputFilePath() != true){
                bError = true;
          }
      }

        // ＣＳＶデータ取得成功
        if(bError != true)
        {
            // ＣＳＶデータ内容チェック
            if(checkCsvData(listCsv) != true)
            {
                bError = true;
            }
        }

        // チェックボックス(チェックのみ行う)がチェックの場合、DBへのデータの反映は行わない。
        if (("true").equals(_save_struct.getDO_CHK()) != true && bError != true)
        {
            // ＣＳＶデータ反映処理
            csvData2Db(listCsv);
        }
        // チェック結果処理(エラーリストサイズの取得)
        if(getListsize() > 0)
        {
            // 画面判定テキストに終了情報セット
            struct.setJUDGMENT_TXT("ERR_HAS");
        }else{
            // 画面判定テキストに終了情報セット
            struct.setJUDGMENT_TXT("");
        }
        struct.setCANCEL_FILE("");
                //}}user_implement_dev:<controlCsvIn>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
            // TODO: ユーザ定義のコードを記述してください
            controlclear();
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
            // TODO: ユーザ定義のコードを記述してください

        // クリア処理
        this.struct.clear();
        this.struct.setrdoInsert("true");
        this.struct.setrdoUpdate("false");
        this.struct.setrdoDelete("false");
        this.struct.setDO_CHK("false");

        setReadStatus(INITIAL);
                //}}user_implement_dev:<controlclear>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
            // TODO: ユーザ定義のコードを記述してください
      csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
    
      List csvList = new ArrayList();
      //CSV情報の作成
      // タイトル情報設定
      String csvTitle[] = {
        "Expj.Cmt3094" ,         // エラー箇所
        "Expj.Cmt3095" ,         // エラー区分
        "Expj.Cmt3096" ,         // 品目番号
        "Expj.Cmt3097" ,         // エラー項目名
        "Expj.Cmt3098"           // エラー内容
           };
      // CSVリストに入れる
      csvList.add(csvTitle);
      
      AA0150010Struct workStruct;
      // 明細内容設定
      for(int i=0; i<getListsize() ;i++){
       workStruct = getListvalue(i);
       String csvStr [] = new String[csvTitle.length];
       csvStr[0] = workStruct.getERROR_IN();// エラー箇所
       csvStr[1] = workStruct.getERR_TYP();// エラー区分
       csvStr[2] = workStruct.getOUT_ITEM_CD();// 品目番号
       csvStr[3] = workStruct.getERR_CTR_NM();// エラー項目名
       csvStr[4] = workStruct.getERR_INFO();// エラー内容
       csvList.add(csvStr);// CSVリストに入れる
      }
    
      if(csvList != null && csvList.size() > 0){
       try{
        // csvファイルに書く
        csvWriter.write(csvList,CoreTools.getLocale(struct.getsUser_ID()),true);
        struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
       }catch(Exception e){
        //CSV出力失敗
        ExpjMessage emsg = new ExpjMessage("ZZ01107");
        sysLog.severe(emsg, getsysUSER_CD());
        ExpjException ee = new ExpjException(e, emsg);
        throw ee;
       }
      }
            
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
            // TODO: ユーザ定義のコードを記述してください
            // クリア
          controlclear();
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
            // TODO: ユーザ定義のコードを記述してください

        // クリア
        controlclear();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0150");
		logger.entering("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
            // コンボボックス部品のデータのセットはここに記述してください。
            try{
                ComboBox comboController = new ComboBox(conn, sysUSER_CD);
                // コンプボックスの内容多言語対応
                COMBO_ERR_TYP = comboController.getData("ERR_TYP");
            } catch (SQLException e) {
                e.printStackTrace();
                ExpjMessage emsg = new ExpjMessage("ZZ01106");
                sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                throw ee;
            }
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0150010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("CsvImport") ) {
				controlCsvImport();
			} else if( button.equals("Browse") ) {
				controlBrowse();
			} else if( button.equals("CsvIn") ) {
				controlCsvIn();
			} else if( button.equals("return_sub1") ) {
				controlreturn_sub1();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("CsvOut") ) {
				controlCsvOut();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
            // TODO: ユーザ定義のコードを記述してください
//      ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
//      } catch(AlarmMessageException ame){
//          ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
//          throw ee;
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AA0150010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0150010-E999","CSVの出力処理"));
			throw new FoundationException("AA0150010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0150010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0150010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0150010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0150010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0150010Entity entity;
	protected AA0150010Struct struct;
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

		entity = new AA0150010Entity();
		struct = new AA0150010Struct();

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
	 * AA0150010クラスの標準コンストラクタ
	 */
	public AA0150010Control() throws BusinessProcessException, FoundationException
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
				AA0150010Struct key = (AA0150010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("rdoInsert") && key.getrdoInsert() != null) {
					msgKey.setKeyValue("rdoInsert", key.getrdoInsert());
				}
				if(msgKeyType.containsKeyColumn("rdoUpdate") && key.getrdoUpdate() != null) {
					msgKey.setKeyValue("rdoUpdate", key.getrdoUpdate());
				}
				if(msgKeyType.containsKeyColumn("rdoDelete") && key.getrdoDelete() != null) {
					msgKey.setKeyValue("rdoDelete", key.getrdoDelete());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("DO_CHK") && key.getDO_CHK() != null) {
					msgKey.setKeyValue("DO_CHK", key.getDO_CHK());
				}
				if(msgKeyType.containsKeyColumn("ERROR_IN") && key.getERROR_IN() != null) {
					msgKey.setKeyValue("ERROR_IN", key.getERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ERR_CTR_NM") && key.getERR_CTR_NM() != null) {
					msgKey.setKeyValue("ERR_CTR_NM", key.getERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("ERR_INFO") && key.getERR_INFO() != null) {
					msgKey.setKeyValue("ERR_INFO", key.getERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("h_SYORI_KUBUN") && key.geth_SYORI_KUBUN() != null) {
					msgKey.setKeyValue("h_SYORI_KUBUN", key.geth_SYORI_KUBUN());
				}
				if(msgKeyType.containsKeyColumn("h_WH_CD") && key.geth_WH_CD() != null) {
					msgKey.setKeyValue("h_WH_CD", key.geth_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_FILE") && key.getCANCEL_FILE() != null) {
					msgKey.setKeyValue("CANCEL_FILE", key.getCANCEL_FILE());
				}
				if(msgKeyType.containsKeyColumn("JUDGMENT_TXT") && key.getJUDGMENT_TXT() != null) {
					msgKey.setKeyValue("JUDGMENT_TXT", key.getJUDGMENT_TXT());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("ERR_TYP") && key.getERR_TYP() != null) {
					msgKey.setKeyValue("ERR_TYP", key.getERR_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("OUT_ITEM_CD") && key.getOUT_ITEM_CD() != null) {
					msgKey.setKeyValue("OUT_ITEM_CD", key.getOUT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readNAME") && key.getreadNAME() != null) {
					msgKey.setKeyValue("readNAME", key.getreadNAME());
				}
				if(msgKeyType.containsKeyColumn("readVALUE") && key.getreadVALUE() != null) {
					msgKey.setKeyValue("readVALUE", key.getreadVALUE());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("setNAME") && key.getsetNAME() != null) {
					msgKey.setKeyValue("setNAME", key.getsetNAME());
				}
				if(msgKeyType.containsKeyColumn("setVALUE") && key.getsetVALUE() != null) {
					msgKey.setKeyValue("setVALUE", key.getsetVALUE());
				}
				if(msgKeyType.containsKeyColumn("readSYS_P_NAME") && key.getreadSYS_P_NAME() != null) {
					msgKey.setKeyValue("readSYS_P_NAME", key.getreadSYS_P_NAME());
				}
				if(msgKeyType.containsKeyColumn("readSYS_P_VALUE") && key.getreadSYS_P_VALUE() != null) {
					msgKey.setKeyValue("readSYS_P_VALUE", key.getreadSYS_P_VALUE());
				}
				if(msgKeyType.containsKeyColumn("setSYS_P_NAME") && key.getsetSYS_P_NAME() != null) {
					msgKey.setKeyValue("setSYS_P_NAME", key.getsetSYS_P_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CD") && key.geth_ITEM_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CD", key.geth_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_NAME") && key.geth_ITEM_NAME() != null) {
					msgKey.setKeyValue("h_ITEM_NAME", key.geth_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_DRAW_CD") && key.geth_DRAW_CD() != null) {
					msgKey.setKeyValue("h_DRAW_CD", key.geth_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("h_SPEC") && key.geth_SPEC() != null) {
					msgKey.setKeyValue("h_SPEC", key.geth_SPEC());
				}
				if(msgKeyType.containsKeyColumn("h_HIGH_LEVEL_NO") && key.geth_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("h_HIGH_LEVEL_NO", key.geth_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP") && key.geth_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("h_MRP_ODR_TYP", key.geth_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_OUTSIDE_TYP") && key.geth_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("h_OUTSIDE_TYP", key.geth_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_STOCK_UNIT_FLG") && key.geth_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("h_STOCK_UNIT_FLG", key.geth_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_STOCK_UNIT") && key.geth_STOCK_UNIT() != null) {
					msgKey.setKeyValue("h_STOCK_UNIT", key.geth_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PKG_UNIT") && key.geth_PKG_UNIT() != null) {
					msgKey.setKeyValue("h_PKG_UNIT", key.geth_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("h_PKG_UNIT_QTY") && key.geth_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("h_PKG_UNIT_QTY", key.geth_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP") && key.geth_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("h_UNIT_QTY_TYP", key.geth_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_LT") && key.geth_ODR_LT() != null) {
					msgKey.setKeyValue("h_ODR_LT", key.geth_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("h_FIXED_LT") && key.geth_FIXED_LT() != null) {
					msgKey.setKeyValue("h_FIXED_LT", key.geth_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PROP_LT") && key.geth_PROP_LT() != null) {
					msgKey.setKeyValue("h_PROP_LT", key.geth_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("h_SAFETY_LT") && key.geth_SAFETY_LT() != null) {
					msgKey.setKeyValue("h_SAFETY_LT", key.geth_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_LT") && key.geth_ISSUE_LT() != null) {
					msgKey.setKeyValue("h_ISSUE_LT", key.geth_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PROP_LOT_SIZE") && key.geth_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("h_PROP_LOT_SIZE", key.geth_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_SPOIL") && key.geth_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("h_ITEM_SPOIL", key.geth_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("h_SAFETY_STOCK") && key.geth_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("h_SAFETY_STOCK", key.geth_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_SIZING_TYP") && key.geth_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_SIZING_TYP", key.geth_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MAX_PERIOD") && key.geth_MAX_PERIOD() != null) {
					msgKey.setKeyValue("h_MAX_PERIOD", key.geth_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("h_MAX_ODR_QTY") && key.geth_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("h_MAX_ODR_QTY", key.geth_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_POINT") && key.geth_ODR_POINT() != null) {
					msgKey.setKeyValue("h_ODR_POINT", key.geth_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("h_FIXED_ODR_QTY") && key.geth_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("h_FIXED_ODR_QTY", key.geth_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_MIN_ODR_QTY") && key.geth_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("h_MIN_ODR_QTY", key.geth_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_MUL_ODR_QTY") && key.geth_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("h_MUL_ODR_QTY", key.geth_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("h_ISSUE_TYP") && key.geth_ISSUE_TYP() != null) {
					msgKey.setKeyValue("h_ISSUE_TYP", key.geth_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MPS_FLG") && key.geth_MPS_FLG() != null) {
					msgKey.setKeyValue("h_MPS_FLG", key.geth_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP") && key.geth_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("h_ACPT_INSPC_TYP", key.geth_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PRODUCT_TYP") && key.geth_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("h_PRODUCT_TYP", key.geth_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CLASIFICATION_CD") && key.geth_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("h_CLASIFICATION_CD", key.geth_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("h_UNIT_WEIGHT") && key.geth_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("h_UNIT_WEIGHT", key.geth_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("h_ABC_TYP") && key.geth_ABC_TYP() != null) {
					msgKey.setKeyValue("h_ABC_TYP", key.geth_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_OPR_RSLT_TYP") && key.geth_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("h_OPR_RSLT_TYP", key.geth_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP") && key.geth_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("h_SPL_ITEM_TYP", key.geth_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CD") && key.geth_TAX_CD() != null) {
					msgKey.setKeyValue("h_TAX_CD", key.geth_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("h_CAL_NO") && key.geth_CAL_NO() != null) {
					msgKey.setKeyValue("h_CAL_NO", key.geth_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP") && key.geth_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("h_MANHOUR_TYP", key.geth_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_DEPO_TYP") && key.geth_DEPO_TYP() != null) {
					msgKey.setKeyValue("h_DEPO_TYP", key.geth_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG") && key.geth_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("h_LOT_CTRL_FLG", key.geth_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP") && key.geth_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("h_LOT_NUMBERING_TYP", key.geth_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_YEAR") && key.geth_BEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("h_BEST_BEFORE_YEAR", key.geth_BEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_MONTH") && key.geth_BEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("h_BEST_BEFORE_MONTH", key.geth_BEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_DAY") && key.geth_BEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("h_BEST_BEFORE_DAY", key.geth_BEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("h_DEPT_CD") && key.geth_DEPT_CD() != null) {
					msgKey.setKeyValue("h_DEPT_CD", key.geth_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PJ_CD") && key.geth_PJ_CD() != null) {
					msgKey.setKeyValue("h_PJ_CD", key.geth_PJ_CD());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_1") && key.geth_SEG_CONTENTS_1() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_1", key.geth_SEG_CONTENTS_1());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_2") && key.geth_SEG_CONTENTS_2() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_2", key.geth_SEG_CONTENTS_2());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_3") && key.geth_SEG_CONTENTS_3() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_3", key.geth_SEG_CONTENTS_3());
				}
				if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_4") && key.geth_SEG_CONTENTS_4() != null) {
					msgKey.setKeyValue("h_SEG_CONTENTS_4", key.geth_SEG_CONTENTS_4());
				}
				if(msgKeyType.containsKeyColumn("h_REMARK1") && key.geth_REMARK1() != null) {
					msgKey.setKeyValue("h_REMARK1", key.geth_REMARK1());
				}
				if(msgKeyType.containsKeyColumn("h_REMARK2") && key.geth_REMARK2() != null) {
					msgKey.setKeyValue("h_REMARK2", key.geth_REMARK2());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_01_CD") && key.geth_ITEM_CLASS_01_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_01_CD", key.geth_ITEM_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_02_CD") && key.geth_ITEM_CLASS_02_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_02_CD", key.geth_ITEM_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_03_CD") && key.geth_ITEM_CLASS_03_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_03_CD", key.geth_ITEM_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_04_CD") && key.geth_ITEM_CLASS_04_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_04_CD", key.geth_ITEM_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_05_CD") && key.geth_ITEM_CLASS_05_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_05_CD", key.geth_ITEM_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_06_CD") && key.geth_ITEM_CLASS_06_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_06_CD", key.geth_ITEM_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_07_CD") && key.geth_ITEM_CLASS_07_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_07_CD", key.geth_ITEM_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_08_CD") && key.geth_ITEM_CLASS_08_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_08_CD", key.geth_ITEM_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_09_CD") && key.geth_ITEM_CLASS_09_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_09_CD", key.geth_ITEM_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_10_CD") && key.geth_ITEM_CLASS_10_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_10_CD", key.geth_ITEM_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_11_CD") && key.geth_ITEM_CLASS_11_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_11_CD", key.geth_ITEM_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_12_CD") && key.geth_ITEM_CLASS_12_CD() != null) {
					msgKey.setKeyValue("h_ITEM_CLASS_12_CD", key.geth_ITEM_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("readTAX_CD") && key.getreadTAX_CD() != null) {
					msgKey.setKeyValue("readTAX_CD", key.getreadTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("setTAXCD") && key.getsetTAXCD() != null) {
					msgKey.setKeyValue("setTAXCD", key.getsetTAXCD());
				}
				if(msgKeyType.containsKeyColumn("readITEM_CD") && key.getreadITEM_CD() != null) {
					msgKey.setKeyValue("readITEM_CD", key.getreadITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setITEM_CD") && key.getsetITEM_CD() != null) {
					msgKey.setKeyValue("setITEM_CD", key.getsetITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readVEND_CD") && key.getreadVEND_CD() != null) {
					msgKey.setKeyValue("readVEND_CD", key.getreadVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("setVEND_CD") && key.getsetVEND_CD() != null) {
					msgKey.setKeyValue("setVEND_CD", key.getsetVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("readPLANT_CD") && key.getreadPLANT_CD() != null) {
					msgKey.setKeyValue("readPLANT_CD", key.getreadPLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("readSUM_PROP_LT") && key.getreadSUM_PROP_LT() != null) {
					msgKey.setKeyValue("readSUM_PROP_LT", key.getreadSUM_PROP_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("readSUM_FIXED_LT") && key.getreadSUM_FIXED_LT() != null) {
					msgKey.setKeyValue("readSUM_FIXED_LT", key.getreadSUM_FIXED_LT().toString());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ITEM_CD") && key.getreadMRP_ITEM_CD() != null) {
					msgKey.setKeyValue("readMRP_ITEM_CD", key.getreadMRP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP") && key.getreadMRP_ODR_TYP() != null) {
					msgKey.setKeyValue("readMRP_ODR_TYP", key.getreadMRP_ODR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("setMRP_ITEM_CD") && key.getsetMRP_ITEM_CD() != null) {
					msgKey.setKeyValue("setMRP_ITEM_CD", key.getsetMRP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readMRP_ODR_ITEM_CD") && key.getreadMRP_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("readMRP_ODR_ITEM_CD", key.getreadMRP_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setMRP_ODR_ITEM_CD") && key.getsetMRP_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("setMRP_ODR_ITEM_CD", key.getsetMRP_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CD") && key.getC_ITEM_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CD", key.getC_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_NAME") && key.getC_ITEM_NAME() != null) {
					msgKey.setKeyValue("C_ITEM_NAME", key.getC_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("C_DRAW_CD") && key.getC_DRAW_CD() != null) {
					msgKey.setKeyValue("C_DRAW_CD", key.getC_DRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("C_SPEC") && key.getC_SPEC() != null) {
					msgKey.setKeyValue("C_SPEC", key.getC_SPEC());
				}
				if(msgKeyType.containsKeyColumn("C_HIGH_LEVEL_NO") && key.getC_HIGH_LEVEL_NO() != null) {
					msgKey.setKeyValue("C_HIGH_LEVEL_NO", key.getC_HIGH_LEVEL_NO());
				}
				if(msgKeyType.containsKeyColumn("C_MRP_ODR_TYP") && key.getC_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("C_MRP_ODR_TYP", key.getC_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_OUTSIDE_TYP") && key.getC_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("C_OUTSIDE_TYP", key.getC_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_STOCK_UNIT_FLG") && key.getC_STOCK_UNIT_FLG() != null) {
					msgKey.setKeyValue("C_STOCK_UNIT_FLG", key.getC_STOCK_UNIT_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_STOCK_UNIT") && key.getC_STOCK_UNIT() != null) {
					msgKey.setKeyValue("C_STOCK_UNIT", key.getC_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("C_PKG_UNIT") && key.getC_PKG_UNIT() != null) {
					msgKey.setKeyValue("C_PKG_UNIT", key.getC_PKG_UNIT());
				}
				if(msgKeyType.containsKeyColumn("C_PKG_UNIT_QTY") && key.getC_PKG_UNIT_QTY() != null) {
					msgKey.setKeyValue("C_PKG_UNIT_QTY", key.getC_PKG_UNIT_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_UNIT_QTY_TYP") && key.getC_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("C_UNIT_QTY_TYP", key.getC_UNIT_QTY_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_ODR_LT") && key.getC_ODR_LT() != null) {
					msgKey.setKeyValue("C_ODR_LT", key.getC_ODR_LT());
				}
				if(msgKeyType.containsKeyColumn("C_FIXED_LT") && key.getC_FIXED_LT() != null) {
					msgKey.setKeyValue("C_FIXED_LT", key.getC_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PROP_LT") && key.getC_PROP_LT() != null) {
					msgKey.setKeyValue("C_PROP_LT", key.getC_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("C_SAFETY_LT") && key.getC_SAFETY_LT() != null) {
					msgKey.setKeyValue("C_SAFETY_LT", key.getC_SAFETY_LT());
				}
				if(msgKeyType.containsKeyColumn("C_ISSUE_LT") && key.getC_ISSUE_LT() != null) {
					msgKey.setKeyValue("C_ISSUE_LT", key.getC_ISSUE_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PROP_LOT_SIZE") && key.getC_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("C_PROP_LOT_SIZE", key.getC_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_SPOIL") && key.getC_ITEM_SPOIL() != null) {
					msgKey.setKeyValue("C_ITEM_SPOIL", key.getC_ITEM_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("C_SAFETY_STOCK") && key.getC_SAFETY_STOCK() != null) {
					msgKey.setKeyValue("C_SAFETY_STOCK", key.getC_SAFETY_STOCK());
				}
				if(msgKeyType.containsKeyColumn("C_LOT_SIZING_TYP") && key.getC_LOT_SIZING_TYP() != null) {
					msgKey.setKeyValue("C_LOT_SIZING_TYP", key.getC_LOT_SIZING_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_MAX_PERIOD") && key.getC_MAX_PERIOD() != null) {
					msgKey.setKeyValue("C_MAX_PERIOD", key.getC_MAX_PERIOD());
				}
				if(msgKeyType.containsKeyColumn("C_MAX_ODR_QTY") && key.getC_MAX_ODR_QTY() != null) {
					msgKey.setKeyValue("C_MAX_ODR_QTY", key.getC_MAX_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_ODR_POINT") && key.getC_ODR_POINT() != null) {
					msgKey.setKeyValue("C_ODR_POINT", key.getC_ODR_POINT());
				}
				if(msgKeyType.containsKeyColumn("C_FIXED_ODR_QTY") && key.getC_FIXED_ODR_QTY() != null) {
					msgKey.setKeyValue("C_FIXED_ODR_QTY", key.getC_FIXED_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_MIN_ODR_QTY") && key.getC_MIN_ODR_QTY() != null) {
					msgKey.setKeyValue("C_MIN_ODR_QTY", key.getC_MIN_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_MUL_ODR_QTY") && key.getC_MUL_ODR_QTY() != null) {
					msgKey.setKeyValue("C_MUL_ODR_QTY", key.getC_MUL_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("C_ISSUE_TYP") && key.getC_ISSUE_TYP() != null) {
					msgKey.setKeyValue("C_ISSUE_TYP", key.getC_ISSUE_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_MPS_FLG") && key.getC_MPS_FLG() != null) {
					msgKey.setKeyValue("C_MPS_FLG", key.getC_MPS_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_ACPT_INSPC_TYP") && key.getC_ACPT_INSPC_TYP() != null) {
					msgKey.setKeyValue("C_ACPT_INSPC_TYP", key.getC_ACPT_INSPC_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_PRODUCT_TYP") && key.getC_PRODUCT_TYP() != null) {
					msgKey.setKeyValue("C_PRODUCT_TYP", key.getC_PRODUCT_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_CLASIFICATION_CD") && key.getC_CLASIFICATION_CD() != null) {
					msgKey.setKeyValue("C_CLASIFICATION_CD", key.getC_CLASIFICATION_CD());
				}
				if(msgKeyType.containsKeyColumn("C_UNIT_WEIGHT") && key.getC_UNIT_WEIGHT() != null) {
					msgKey.setKeyValue("C_UNIT_WEIGHT", key.getC_UNIT_WEIGHT());
				}
				if(msgKeyType.containsKeyColumn("C_ABC_TYP") && key.getC_ABC_TYP() != null) {
					msgKey.setKeyValue("C_ABC_TYP", key.getC_ABC_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_OPR_RSLT_TYP") && key.getC_OPR_RSLT_TYP() != null) {
					msgKey.setKeyValue("C_OPR_RSLT_TYP", key.getC_OPR_RSLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_SPL_ITEM_TYP") && key.getC_SPL_ITEM_TYP() != null) {
					msgKey.setKeyValue("C_SPL_ITEM_TYP", key.getC_SPL_ITEM_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_TAX_CD") && key.getC_TAX_CD() != null) {
					msgKey.setKeyValue("C_TAX_CD", key.getC_TAX_CD());
				}
				if(msgKeyType.containsKeyColumn("C_CAL_NO") && key.getC_CAL_NO() != null) {
					msgKey.setKeyValue("C_CAL_NO", key.getC_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("C_MANHOUR_TYP") && key.getC_MANHOUR_TYP() != null) {
					msgKey.setKeyValue("C_MANHOUR_TYP", key.getC_MANHOUR_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_DEPO_TYP") && key.getC_DEPO_TYP() != null) {
					msgKey.setKeyValue("C_DEPO_TYP", key.getC_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_LOT_CTRL_FLG") && key.getC_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("C_LOT_CTRL_FLG", key.getC_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_LOT_NUMBERING_TYP") && key.getC_LOT_NUMBERING_TYP() != null) {
					msgKey.setKeyValue("C_LOT_NUMBERING_TYP", key.getC_LOT_NUMBERING_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_YEAR") && key.getC_BEST_BEFORE_YEAR() != null) {
					msgKey.setKeyValue("C_BEST_BEFORE_YEAR", key.getC_BEST_BEFORE_YEAR());
				}
				if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_MONTH") && key.getC_BEST_BEFORE_MONTH() != null) {
					msgKey.setKeyValue("C_BEST_BEFORE_MONTH", key.getC_BEST_BEFORE_MONTH());
				}
				if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_DAY") && key.getC_BEST_BEFORE_DAY() != null) {
					msgKey.setKeyValue("C_BEST_BEFORE_DAY", key.getC_BEST_BEFORE_DAY());
				}
				if(msgKeyType.containsKeyColumn("C_REMARK1") && key.getC_REMARK1() != null) {
					msgKey.setKeyValue("C_REMARK1", key.getC_REMARK1());
				}
				if(msgKeyType.containsKeyColumn("C_REMARK2") && key.getC_REMARK2() != null) {
					msgKey.setKeyValue("C_REMARK2", key.getC_REMARK2());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_01_CD") && key.getC_ITEM_CLASS_01_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_01_CD", key.getC_ITEM_CLASS_01_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_02_CD") && key.getC_ITEM_CLASS_02_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_02_CD", key.getC_ITEM_CLASS_02_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_03_CD") && key.getC_ITEM_CLASS_03_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_03_CD", key.getC_ITEM_CLASS_03_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_04_CD") && key.getC_ITEM_CLASS_04_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_04_CD", key.getC_ITEM_CLASS_04_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_05_CD") && key.getC_ITEM_CLASS_05_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_05_CD", key.getC_ITEM_CLASS_05_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_06_CD") && key.getC_ITEM_CLASS_06_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_06_CD", key.getC_ITEM_CLASS_06_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_07_CD") && key.getC_ITEM_CLASS_07_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_07_CD", key.getC_ITEM_CLASS_07_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_08_CD") && key.getC_ITEM_CLASS_08_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_08_CD", key.getC_ITEM_CLASS_08_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_09_CD") && key.getC_ITEM_CLASS_09_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_09_CD", key.getC_ITEM_CLASS_09_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_10_CD") && key.getC_ITEM_CLASS_10_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_10_CD", key.getC_ITEM_CLASS_10_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_11_CD") && key.getC_ITEM_CLASS_11_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_11_CD", key.getC_ITEM_CLASS_11_CD());
				}
				if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_12_CD") && key.getC_ITEM_CLASS_12_CD() != null) {
					msgKey.setKeyValue("C_ITEM_CLASS_12_CD", key.getC_ITEM_CLASS_12_CD());
				}
				if(msgKeyType.containsKeyColumn("C_DEPT_CD") && key.getC_DEPT_CD() != null) {
					msgKey.setKeyValue("C_DEPT_CD", key.getC_DEPT_CD());
				}
				if(msgKeyType.containsKeyColumn("C_PJ_CD") && key.getC_PJ_CD() != null) {
					msgKey.setKeyValue("C_PJ_CD", key.getC_PJ_CD());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_1") && key.getC_SEG_CONTENTS_1() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_1", key.getC_SEG_CONTENTS_1());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_2") && key.getC_SEG_CONTENTS_2() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_2", key.getC_SEG_CONTENTS_2());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_3") && key.getC_SEG_CONTENTS_3() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_3", key.getC_SEG_CONTENTS_3());
				}
				if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_4") && key.getC_SEG_CONTENTS_4() != null) {
					msgKey.setKeyValue("C_SEG_CONTENTS_4", key.getC_SEG_CONTENTS_4());
				}
				if(msgKeyType.containsKeyColumn("C_setITEM_CD") && key.getC_setITEM_CD() != null) {
					msgKey.setKeyValue("C_setITEM_CD", key.getC_setITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_OD_ITEM_CD") && key.getreadT_OD_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_OD_ITEM_CD", key.getreadT_OD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_OD_ITEM_CD") && key.getsetT_OD_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_OD_ITEM_CD", key.getsetT_OD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readM_PS_ITEM_CD") && key.getreadM_PS_ITEM_CD() != null) {
					msgKey.setKeyValue("readM_PS_ITEM_CD", key.getreadM_PS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_PS_ITEM_CD") && key.getsetM_PS_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_PS_ITEM_CD", key.getsetM_PS_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_ITEM_CD") && key.getreadT_ITEM_STOCK_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_ITEM_STOCK_ITEM_CD", key.getreadT_ITEM_STOCK_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_STOCK_ON_HAND_QTY") && key.getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("readT_ITEM_STOCK_STOCK_ON_HAND_QTY", key.getreadT_ITEM_STOCK_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setT_ITEM_STOCK_ITEM_CD") && key.getsetT_ITEM_STOCK_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_ITEM_STOCK_ITEM_CD", key.getsetT_ITEM_STOCK_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_ITEM_CD") && key.getreadT_JOB_ODR_CD_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_JOB_ODR_CD_ITEM_CD", key.getreadT_JOB_ODR_CD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY") && key.getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY", key.getreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("setT_JOB_ODR_CD_ITEM_CD") && key.getsetT_JOB_ODR_CD_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_JOB_ODR_CD_ITEM_CD", key.getsetT_JOB_ODR_CD_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_RLSD_P_ITEM_CD") && key.getreadT_RLSD_P_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_RLSD_P_ITEM_CD", key.getreadT_RLSD_P_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_RLSD_P_ITEM_CD") && key.getsetT_RLSD_P_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_RLSD_P_ITEM_CD", key.getsetT_RLSD_P_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_WORK_IN_ITEM_CD") && key.getreadT_WORK_IN_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_WORK_IN_ITEM_CD", key.getreadT_WORK_IN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_WORK_IN_ITEM_CD") && key.getsetT_WORK_IN_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_WORK_IN_ITEM_CD", key.getsetT_WORK_IN_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_JOB_ODR_ITEM_CD") && key.getreadT_JOB_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_JOB_ODR_ITEM_CD", key.getreadT_JOB_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_JOB_ODR_ITEM_CD") && key.getsetT_JOB_ODR_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_JOB_ODR_ITEM_CD", key.getsetT_JOB_ODR_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readT_OPR_RSLT_ITEM_CD") && key.getreadT_OPR_RSLT_ITEM_CD() != null) {
					msgKey.setKeyValue("readT_OPR_RSLT_ITEM_CD", key.getreadT_OPR_RSLT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setT_OPR_RSLT_ITEM_CD") && key.getsetT_OPR_RSLT_ITEM_CD() != null) {
					msgKey.setKeyValue("setT_OPR_RSLT_ITEM_CD", key.getsetT_OPR_RSLT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_ITEM_CD") && key.getsetM_WH_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_WH_ITEM_CD", key.getsetM_WH_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_WH_CD") && key.getsetM_WH_WH_CD() != null) {
					msgKey.setKeyValue("setM_WH_WH_CD", key.getsetM_WH_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_PLANT_CD") && key.getsetM_WH_PLANT_CD() != null) {
					msgKey.setKeyValue("setM_WH_PLANT_CD", key.getsetM_WH_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_WH_WH_REF_NO") && key.getsetM_WH_WH_REF_NO() != null) {
					msgKey.setKeyValue("setM_WH_WH_REF_NO", key.getsetM_WH_WH_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("readM_WH_ITEM_CD") && key.getreadM_WH_ITEM_CD() != null) {
					msgKey.setKeyValue("readM_WH_ITEM_CD", key.getreadM_WH_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readM_WH_WH_CD") && key.getreadM_WH_WH_CD() != null) {
					msgKey.setKeyValue("readM_WH_WH_CD", key.getreadM_WH_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("readM_CAL_H_CAL_NO") && key.getreadM_CAL_H_CAL_NO() != null) {
					msgKey.setKeyValue("readM_CAL_H_CAL_NO", key.getreadM_CAL_H_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("setM_CAL_H_CAL_NO") && key.getsetM_CAL_H_CAL_NO() != null) {
					msgKey.setKeyValue("setM_CAL_H_CAL_NO", key.getsetM_CAL_H_CAL_NO());
				}
				if(msgKeyType.containsKeyColumn("readCLASS_CD1") && key.getreadCLASS_CD1() != null) {
					msgKey.setKeyValue("readCLASS_CD1", key.getreadCLASS_CD1());
				}
				if(msgKeyType.containsKeyColumn("setCLASS_CD2") && key.getsetCLASS_CD2() != null) {
					msgKey.setKeyValue("setCLASS_CD2", key.getsetCLASS_CD2());
				}
				if(msgKeyType.containsKeyColumn("setCLASS_CD3") && key.getsetCLASS_CD3() != null) {
					msgKey.setKeyValue("setCLASS_CD3", key.getsetCLASS_CD3());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_STOCK_UNIT") && key.getreadM_ITEM_STOCK_UNIT() != null) {
					msgKey.setKeyValue("readM_ITEM_STOCK_UNIT", key.getreadM_ITEM_STOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_LOT_CTRL_FLG") && key.getreadM_ITEM_LOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("readM_ITEM_LOT_CTRL_FLG", key.getreadM_ITEM_LOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_MRP_ODR_TYP") && key.getreadM_ITEM_MRP_ODR_TYP() != null) {
					msgKey.setKeyValue("readM_ITEM_MRP_ODR_TYP", key.getreadM_ITEM_MRP_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD") && key.getsetM_ITEM_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_ITEM_ITEM_CD", key.getsetM_ITEM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setDISPLAY_NAME") && key.getsetDISPLAY_NAME() != null) {
					msgKey.setKeyValue("setDISPLAY_NAME", key.getsetDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("DEPT_CD") && key.getDEPT_CD() != null) {
					msgKey.setKeyValue("DEPT_CD", key.getDEPT_CD());
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
					AA0150010Struct key = new AA0150010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdate")) {
						key.setrdoUpdate(msgKey.getKeyValue("rdoUpdate"));
					}
					if(msgKeyType.containsKeyColumn("rdoDelete")) {
						key.setrdoDelete(msgKey.getKeyValue("rdoDelete"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("DO_CHK")) {
						key.setDO_CHK(msgKey.getKeyValue("DO_CHK"));
					}
					if(msgKeyType.containsKeyColumn("ERROR_IN")) {
						key.setERROR_IN(msgKey.getKeyValue("ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ERR_CTR_NM")) {
						key.setERR_CTR_NM(msgKey.getKeyValue("ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("ERR_INFO")) {
						key.setERR_INFO(msgKey.getKeyValue("ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("h_SYORI_KUBUN")) {
						key.seth_SYORI_KUBUN(msgKey.getKeyValue("h_SYORI_KUBUN"));
					}
					if(msgKeyType.containsKeyColumn("h_WH_CD")) {
						key.seth_WH_CD(msgKey.getKeyValue("h_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_FILE")) {
						key.setCANCEL_FILE(msgKey.getKeyValue("CANCEL_FILE"));
					}
					if(msgKeyType.containsKeyColumn("JUDGMENT_TXT")) {
						key.setJUDGMENT_TXT(msgKey.getKeyValue("JUDGMENT_TXT"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("ERR_TYP")) {
						key.setERR_TYP(msgKey.getKeyValue("ERR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OUT_ITEM_CD")) {
						key.setOUT_ITEM_CD(msgKey.getKeyValue("OUT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readNAME")) {
						key.setreadNAME(msgKey.getKeyValue("readNAME"));
					}
					if(msgKeyType.containsKeyColumn("readVALUE")) {
						key.setreadVALUE(msgKey.getKeyValue("readVALUE"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("setNAME")) {
						key.setsetNAME(msgKey.getKeyValue("setNAME"));
					}
					if(msgKeyType.containsKeyColumn("setVALUE")) {
						key.setsetVALUE(msgKey.getKeyValue("setVALUE"));
					}
					if(msgKeyType.containsKeyColumn("readSYS_P_NAME")) {
						key.setreadSYS_P_NAME(msgKey.getKeyValue("readSYS_P_NAME"));
					}
					if(msgKeyType.containsKeyColumn("readSYS_P_VALUE")) {
						key.setreadSYS_P_VALUE(msgKey.getKeyValue("readSYS_P_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("setSYS_P_NAME")) {
						key.setsetSYS_P_NAME(msgKey.getKeyValue("setSYS_P_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CD")) {
						key.seth_ITEM_CD(msgKey.getKeyValue("h_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_NAME")) {
						key.seth_ITEM_NAME(msgKey.getKeyValue("h_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_DRAW_CD")) {
						key.seth_DRAW_CD(msgKey.getKeyValue("h_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_SPEC")) {
						key.seth_SPEC(msgKey.getKeyValue("h_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("h_HIGH_LEVEL_NO")) {
						key.seth_HIGH_LEVEL_NO(msgKey.getKeyValue("h_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_ODR_TYP")) {
						key.seth_MRP_ODR_TYP(msgKey.getKeyValue("h_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_OUTSIDE_TYP")) {
						key.seth_OUTSIDE_TYP(msgKey.getKeyValue("h_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_STOCK_UNIT_FLG")) {
						key.seth_STOCK_UNIT_FLG(msgKey.getKeyValue("h_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_STOCK_UNIT")) {
						key.seth_STOCK_UNIT(msgKey.getKeyValue("h_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PKG_UNIT")) {
						key.seth_PKG_UNIT(msgKey.getKeyValue("h_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("h_PKG_UNIT_QTY")) {
						key.seth_PKG_UNIT_QTY(msgKey.getKeyValue("h_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_QTY_TYP")) {
						key.seth_UNIT_QTY_TYP(msgKey.getKeyValue("h_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_LT")) {
						key.seth_ODR_LT(msgKey.getKeyValue("h_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_FIXED_LT")) {
						key.seth_FIXED_LT(msgKey.getKeyValue("h_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PROP_LT")) {
						key.seth_PROP_LT(msgKey.getKeyValue("h_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_SAFETY_LT")) {
						key.seth_SAFETY_LT(msgKey.getKeyValue("h_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_LT")) {
						key.seth_ISSUE_LT(msgKey.getKeyValue("h_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PROP_LOT_SIZE")) {
						key.seth_PROP_LOT_SIZE(msgKey.getKeyValue("h_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_SPOIL")) {
						key.seth_ITEM_SPOIL(msgKey.getKeyValue("h_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("h_SAFETY_STOCK")) {
						key.seth_SAFETY_STOCK(msgKey.getKeyValue("h_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_SIZING_TYP")) {
						key.seth_LOT_SIZING_TYP(msgKey.getKeyValue("h_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MAX_PERIOD")) {
						key.seth_MAX_PERIOD(msgKey.getKeyValue("h_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("h_MAX_ODR_QTY")) {
						key.seth_MAX_ODR_QTY(msgKey.getKeyValue("h_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_POINT")) {
						key.seth_ODR_POINT(msgKey.getKeyValue("h_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("h_FIXED_ODR_QTY")) {
						key.seth_FIXED_ODR_QTY(msgKey.getKeyValue("h_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_MIN_ODR_QTY")) {
						key.seth_MIN_ODR_QTY(msgKey.getKeyValue("h_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_MUL_ODR_QTY")) {
						key.seth_MUL_ODR_QTY(msgKey.getKeyValue("h_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("h_ISSUE_TYP")) {
						key.seth_ISSUE_TYP(msgKey.getKeyValue("h_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MPS_FLG")) {
						key.seth_MPS_FLG(msgKey.getKeyValue("h_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_ACPT_INSPC_TYP")) {
						key.seth_ACPT_INSPC_TYP(msgKey.getKeyValue("h_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PRODUCT_TYP")) {
						key.seth_PRODUCT_TYP(msgKey.getKeyValue("h_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CLASIFICATION_CD")) {
						key.seth_CLASIFICATION_CD(msgKey.getKeyValue("h_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_UNIT_WEIGHT")) {
						key.seth_UNIT_WEIGHT(msgKey.getKeyValue("h_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("h_ABC_TYP")) {
						key.seth_ABC_TYP(msgKey.getKeyValue("h_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_OPR_RSLT_TYP")) {
						key.seth_OPR_RSLT_TYP(msgKey.getKeyValue("h_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_SPL_ITEM_TYP")) {
						key.seth_SPL_ITEM_TYP(msgKey.getKeyValue("h_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CD")) {
						key.seth_TAX_CD(msgKey.getKeyValue("h_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_CAL_NO")) {
						key.seth_CAL_NO(msgKey.getKeyValue("h_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_MANHOUR_TYP")) {
						key.seth_MANHOUR_TYP(msgKey.getKeyValue("h_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_DEPO_TYP")) {
						key.seth_DEPO_TYP(msgKey.getKeyValue("h_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_CTRL_FLG")) {
						key.seth_LOT_CTRL_FLG(msgKey.getKeyValue("h_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_LOT_NUMBERING_TYP")) {
						key.seth_LOT_NUMBERING_TYP(msgKey.getKeyValue("h_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_YEAR")) {
						key.seth_BEST_BEFORE_YEAR(msgKey.getKeyValue("h_BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_MONTH")) {
						key.seth_BEST_BEFORE_MONTH(msgKey.getKeyValue("h_BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("h_BEST_BEFORE_DAY")) {
						key.seth_BEST_BEFORE_DAY(msgKey.getKeyValue("h_BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("h_DEPT_CD")) {
						key.seth_DEPT_CD(msgKey.getKeyValue("h_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PJ_CD")) {
						key.seth_PJ_CD(msgKey.getKeyValue("h_PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_1")) {
						key.seth_SEG_CONTENTS_1(msgKey.getKeyValue("h_SEG_CONTENTS_1"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_2")) {
						key.seth_SEG_CONTENTS_2(msgKey.getKeyValue("h_SEG_CONTENTS_2"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_3")) {
						key.seth_SEG_CONTENTS_3(msgKey.getKeyValue("h_SEG_CONTENTS_3"));
					}
					if(msgKeyType.containsKeyColumn("h_SEG_CONTENTS_4")) {
						key.seth_SEG_CONTENTS_4(msgKey.getKeyValue("h_SEG_CONTENTS_4"));
					}
					if(msgKeyType.containsKeyColumn("h_REMARK1")) {
						key.seth_REMARK1(msgKey.getKeyValue("h_REMARK1"));
					}
					if(msgKeyType.containsKeyColumn("h_REMARK2")) {
						key.seth_REMARK2(msgKey.getKeyValue("h_REMARK2"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_01_CD")) {
						key.seth_ITEM_CLASS_01_CD(msgKey.getKeyValue("h_ITEM_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_02_CD")) {
						key.seth_ITEM_CLASS_02_CD(msgKey.getKeyValue("h_ITEM_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_03_CD")) {
						key.seth_ITEM_CLASS_03_CD(msgKey.getKeyValue("h_ITEM_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_04_CD")) {
						key.seth_ITEM_CLASS_04_CD(msgKey.getKeyValue("h_ITEM_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_05_CD")) {
						key.seth_ITEM_CLASS_05_CD(msgKey.getKeyValue("h_ITEM_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_06_CD")) {
						key.seth_ITEM_CLASS_06_CD(msgKey.getKeyValue("h_ITEM_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_07_CD")) {
						key.seth_ITEM_CLASS_07_CD(msgKey.getKeyValue("h_ITEM_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_08_CD")) {
						key.seth_ITEM_CLASS_08_CD(msgKey.getKeyValue("h_ITEM_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_09_CD")) {
						key.seth_ITEM_CLASS_09_CD(msgKey.getKeyValue("h_ITEM_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_10_CD")) {
						key.seth_ITEM_CLASS_10_CD(msgKey.getKeyValue("h_ITEM_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_11_CD")) {
						key.seth_ITEM_CLASS_11_CD(msgKey.getKeyValue("h_ITEM_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_ITEM_CLASS_12_CD")) {
						key.seth_ITEM_CLASS_12_CD(msgKey.getKeyValue("h_ITEM_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("readTAX_CD")) {
						key.setreadTAX_CD(msgKey.getKeyValue("readTAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("setTAXCD")) {
						key.setsetTAXCD(msgKey.getKeyValue("setTAXCD"));
					}
					if(msgKeyType.containsKeyColumn("readITEM_CD")) {
						key.setreadITEM_CD(msgKey.getKeyValue("readITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setITEM_CD")) {
						key.setsetITEM_CD(msgKey.getKeyValue("setITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readVEND_CD")) {
						key.setreadVEND_CD(msgKey.getKeyValue("readVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("setVEND_CD")) {
						key.setsetVEND_CD(msgKey.getKeyValue("setVEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPLANT_CD")) {
						key.setreadPLANT_CD(msgKey.getKeyValue("readPLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("readSUM_PROP_LT")) {
						key.setreadSUM_PROP_LT(new Integer(msgKey.getKeyValue("readSUM_PROP_LT")));
					}
					if(msgKeyType.containsKeyColumn("readSUM_FIXED_LT")) {
						key.setreadSUM_FIXED_LT(new Integer(msgKey.getKeyValue("readSUM_FIXED_LT")));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ITEM_CD")) {
						key.setreadMRP_ITEM_CD(msgKey.getKeyValue("readMRP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ODR_TYP")) {
						key.setreadMRP_ODR_TYP(new Integer(msgKey.getKeyValue("readMRP_ODR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("setMRP_ITEM_CD")) {
						key.setsetMRP_ITEM_CD(msgKey.getKeyValue("setMRP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readMRP_ODR_ITEM_CD")) {
						key.setreadMRP_ODR_ITEM_CD(msgKey.getKeyValue("readMRP_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setMRP_ODR_ITEM_CD")) {
						key.setsetMRP_ODR_ITEM_CD(msgKey.getKeyValue("setMRP_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CD")) {
						key.setC_ITEM_CD(msgKey.getKeyValue("C_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_NAME")) {
						key.setC_ITEM_NAME(msgKey.getKeyValue("C_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("C_DRAW_CD")) {
						key.setC_DRAW_CD(msgKey.getKeyValue("C_DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_SPEC")) {
						key.setC_SPEC(msgKey.getKeyValue("C_SPEC"));
					}
					if(msgKeyType.containsKeyColumn("C_HIGH_LEVEL_NO")) {
						key.setC_HIGH_LEVEL_NO(msgKey.getKeyValue("C_HIGH_LEVEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("C_MRP_ODR_TYP")) {
						key.setC_MRP_ODR_TYP(msgKey.getKeyValue("C_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_OUTSIDE_TYP")) {
						key.setC_OUTSIDE_TYP(msgKey.getKeyValue("C_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_STOCK_UNIT_FLG")) {
						key.setC_STOCK_UNIT_FLG(msgKey.getKeyValue("C_STOCK_UNIT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_STOCK_UNIT")) {
						key.setC_STOCK_UNIT(msgKey.getKeyValue("C_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("C_PKG_UNIT")) {
						key.setC_PKG_UNIT(msgKey.getKeyValue("C_PKG_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("C_PKG_UNIT_QTY")) {
						key.setC_PKG_UNIT_QTY(msgKey.getKeyValue("C_PKG_UNIT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_UNIT_QTY_TYP")) {
						key.setC_UNIT_QTY_TYP(msgKey.getKeyValue("C_UNIT_QTY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_ODR_LT")) {
						key.setC_ODR_LT(msgKey.getKeyValue("C_ODR_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_FIXED_LT")) {
						key.setC_FIXED_LT(msgKey.getKeyValue("C_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PROP_LT")) {
						key.setC_PROP_LT(msgKey.getKeyValue("C_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_SAFETY_LT")) {
						key.setC_SAFETY_LT(msgKey.getKeyValue("C_SAFETY_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_ISSUE_LT")) {
						key.setC_ISSUE_LT(msgKey.getKeyValue("C_ISSUE_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PROP_LOT_SIZE")) {
						key.setC_PROP_LOT_SIZE(msgKey.getKeyValue("C_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_SPOIL")) {
						key.setC_ITEM_SPOIL(msgKey.getKeyValue("C_ITEM_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("C_SAFETY_STOCK")) {
						key.setC_SAFETY_STOCK(msgKey.getKeyValue("C_SAFETY_STOCK"));
					}
					if(msgKeyType.containsKeyColumn("C_LOT_SIZING_TYP")) {
						key.setC_LOT_SIZING_TYP(msgKey.getKeyValue("C_LOT_SIZING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_MAX_PERIOD")) {
						key.setC_MAX_PERIOD(msgKey.getKeyValue("C_MAX_PERIOD"));
					}
					if(msgKeyType.containsKeyColumn("C_MAX_ODR_QTY")) {
						key.setC_MAX_ODR_QTY(msgKey.getKeyValue("C_MAX_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_ODR_POINT")) {
						key.setC_ODR_POINT(msgKey.getKeyValue("C_ODR_POINT"));
					}
					if(msgKeyType.containsKeyColumn("C_FIXED_ODR_QTY")) {
						key.setC_FIXED_ODR_QTY(msgKey.getKeyValue("C_FIXED_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_MIN_ODR_QTY")) {
						key.setC_MIN_ODR_QTY(msgKey.getKeyValue("C_MIN_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_MUL_ODR_QTY")) {
						key.setC_MUL_ODR_QTY(msgKey.getKeyValue("C_MUL_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("C_ISSUE_TYP")) {
						key.setC_ISSUE_TYP(msgKey.getKeyValue("C_ISSUE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_MPS_FLG")) {
						key.setC_MPS_FLG(msgKey.getKeyValue("C_MPS_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_ACPT_INSPC_TYP")) {
						key.setC_ACPT_INSPC_TYP(msgKey.getKeyValue("C_ACPT_INSPC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_PRODUCT_TYP")) {
						key.setC_PRODUCT_TYP(msgKey.getKeyValue("C_PRODUCT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_CLASIFICATION_CD")) {
						key.setC_CLASIFICATION_CD(msgKey.getKeyValue("C_CLASIFICATION_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_UNIT_WEIGHT")) {
						key.setC_UNIT_WEIGHT(msgKey.getKeyValue("C_UNIT_WEIGHT"));
					}
					if(msgKeyType.containsKeyColumn("C_ABC_TYP")) {
						key.setC_ABC_TYP(msgKey.getKeyValue("C_ABC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_OPR_RSLT_TYP")) {
						key.setC_OPR_RSLT_TYP(msgKey.getKeyValue("C_OPR_RSLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_SPL_ITEM_TYP")) {
						key.setC_SPL_ITEM_TYP(msgKey.getKeyValue("C_SPL_ITEM_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_TAX_CD")) {
						key.setC_TAX_CD(msgKey.getKeyValue("C_TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_CAL_NO")) {
						key.setC_CAL_NO(msgKey.getKeyValue("C_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("C_MANHOUR_TYP")) {
						key.setC_MANHOUR_TYP(msgKey.getKeyValue("C_MANHOUR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_DEPO_TYP")) {
						key.setC_DEPO_TYP(msgKey.getKeyValue("C_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_LOT_CTRL_FLG")) {
						key.setC_LOT_CTRL_FLG(msgKey.getKeyValue("C_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_LOT_NUMBERING_TYP")) {
						key.setC_LOT_NUMBERING_TYP(msgKey.getKeyValue("C_LOT_NUMBERING_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_YEAR")) {
						key.setC_BEST_BEFORE_YEAR(msgKey.getKeyValue("C_BEST_BEFORE_YEAR"));
					}
					if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_MONTH")) {
						key.setC_BEST_BEFORE_MONTH(msgKey.getKeyValue("C_BEST_BEFORE_MONTH"));
					}
					if(msgKeyType.containsKeyColumn("C_BEST_BEFORE_DAY")) {
						key.setC_BEST_BEFORE_DAY(msgKey.getKeyValue("C_BEST_BEFORE_DAY"));
					}
					if(msgKeyType.containsKeyColumn("C_REMARK1")) {
						key.setC_REMARK1(msgKey.getKeyValue("C_REMARK1"));
					}
					if(msgKeyType.containsKeyColumn("C_REMARK2")) {
						key.setC_REMARK2(msgKey.getKeyValue("C_REMARK2"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_01_CD")) {
						key.setC_ITEM_CLASS_01_CD(msgKey.getKeyValue("C_ITEM_CLASS_01_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_02_CD")) {
						key.setC_ITEM_CLASS_02_CD(msgKey.getKeyValue("C_ITEM_CLASS_02_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_03_CD")) {
						key.setC_ITEM_CLASS_03_CD(msgKey.getKeyValue("C_ITEM_CLASS_03_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_04_CD")) {
						key.setC_ITEM_CLASS_04_CD(msgKey.getKeyValue("C_ITEM_CLASS_04_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_05_CD")) {
						key.setC_ITEM_CLASS_05_CD(msgKey.getKeyValue("C_ITEM_CLASS_05_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_06_CD")) {
						key.setC_ITEM_CLASS_06_CD(msgKey.getKeyValue("C_ITEM_CLASS_06_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_07_CD")) {
						key.setC_ITEM_CLASS_07_CD(msgKey.getKeyValue("C_ITEM_CLASS_07_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_08_CD")) {
						key.setC_ITEM_CLASS_08_CD(msgKey.getKeyValue("C_ITEM_CLASS_08_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_09_CD")) {
						key.setC_ITEM_CLASS_09_CD(msgKey.getKeyValue("C_ITEM_CLASS_09_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_10_CD")) {
						key.setC_ITEM_CLASS_10_CD(msgKey.getKeyValue("C_ITEM_CLASS_10_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_11_CD")) {
						key.setC_ITEM_CLASS_11_CD(msgKey.getKeyValue("C_ITEM_CLASS_11_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_ITEM_CLASS_12_CD")) {
						key.setC_ITEM_CLASS_12_CD(msgKey.getKeyValue("C_ITEM_CLASS_12_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_DEPT_CD")) {
						key.setC_DEPT_CD(msgKey.getKeyValue("C_DEPT_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_PJ_CD")) {
						key.setC_PJ_CD(msgKey.getKeyValue("C_PJ_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_1")) {
						key.setC_SEG_CONTENTS_1(msgKey.getKeyValue("C_SEG_CONTENTS_1"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_2")) {
						key.setC_SEG_CONTENTS_2(msgKey.getKeyValue("C_SEG_CONTENTS_2"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_3")) {
						key.setC_SEG_CONTENTS_3(msgKey.getKeyValue("C_SEG_CONTENTS_3"));
					}
					if(msgKeyType.containsKeyColumn("C_SEG_CONTENTS_4")) {
						key.setC_SEG_CONTENTS_4(msgKey.getKeyValue("C_SEG_CONTENTS_4"));
					}
					if(msgKeyType.containsKeyColumn("C_setITEM_CD")) {
						key.setC_setITEM_CD(msgKey.getKeyValue("C_setITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_OD_ITEM_CD")) {
						key.setreadT_OD_ITEM_CD(msgKey.getKeyValue("readT_OD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_OD_ITEM_CD")) {
						key.setsetT_OD_ITEM_CD(msgKey.getKeyValue("setT_OD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readM_PS_ITEM_CD")) {
						key.setreadM_PS_ITEM_CD(msgKey.getKeyValue("readM_PS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_PS_ITEM_CD")) {
						key.setsetM_PS_ITEM_CD(msgKey.getKeyValue("setM_PS_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_ITEM_CD")) {
						key.setreadT_ITEM_STOCK_ITEM_CD(msgKey.getKeyValue("readT_ITEM_STOCK_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_ITEM_STOCK_STOCK_ON_HAND_QTY")) {
						key.setreadT_ITEM_STOCK_STOCK_ON_HAND_QTY(msgKey.getKeyValue("readT_ITEM_STOCK_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setT_ITEM_STOCK_ITEM_CD")) {
						key.setsetT_ITEM_STOCK_ITEM_CD(msgKey.getKeyValue("setT_ITEM_STOCK_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_ITEM_CD")) {
						key.setreadT_JOB_ODR_CD_ITEM_CD(msgKey.getKeyValue("readT_JOB_ODR_CD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY")) {
						key.setreadT_JOB_ODR_CD_STOCK_ON_HAND_QTY(msgKey.getKeyValue("readT_JOB_ODR_CD_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("setT_JOB_ODR_CD_ITEM_CD")) {
						key.setsetT_JOB_ODR_CD_ITEM_CD(msgKey.getKeyValue("setT_JOB_ODR_CD_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_RLSD_P_ITEM_CD")) {
						key.setreadT_RLSD_P_ITEM_CD(msgKey.getKeyValue("readT_RLSD_P_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_RLSD_P_ITEM_CD")) {
						key.setsetT_RLSD_P_ITEM_CD(msgKey.getKeyValue("setT_RLSD_P_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_WORK_IN_ITEM_CD")) {
						key.setreadT_WORK_IN_ITEM_CD(msgKey.getKeyValue("readT_WORK_IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_WORK_IN_ITEM_CD")) {
						key.setsetT_WORK_IN_ITEM_CD(msgKey.getKeyValue("setT_WORK_IN_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_JOB_ODR_ITEM_CD")) {
						key.setreadT_JOB_ODR_ITEM_CD(msgKey.getKeyValue("readT_JOB_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_JOB_ODR_ITEM_CD")) {
						key.setsetT_JOB_ODR_ITEM_CD(msgKey.getKeyValue("setT_JOB_ODR_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readT_OPR_RSLT_ITEM_CD")) {
						key.setreadT_OPR_RSLT_ITEM_CD(msgKey.getKeyValue("readT_OPR_RSLT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setT_OPR_RSLT_ITEM_CD")) {
						key.setsetT_OPR_RSLT_ITEM_CD(msgKey.getKeyValue("setT_OPR_RSLT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_ITEM_CD")) {
						key.setsetM_WH_ITEM_CD(msgKey.getKeyValue("setM_WH_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_WH_CD")) {
						key.setsetM_WH_WH_CD(msgKey.getKeyValue("setM_WH_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_PLANT_CD")) {
						key.setsetM_WH_PLANT_CD(msgKey.getKeyValue("setM_WH_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_WH_WH_REF_NO")) {
						key.setsetM_WH_WH_REF_NO(msgKey.getKeyValue("setM_WH_WH_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("readM_WH_ITEM_CD")) {
						key.setreadM_WH_ITEM_CD(msgKey.getKeyValue("readM_WH_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readM_WH_WH_CD")) {
						key.setreadM_WH_WH_CD(msgKey.getKeyValue("readM_WH_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("readM_CAL_H_CAL_NO")) {
						key.setreadM_CAL_H_CAL_NO(msgKey.getKeyValue("readM_CAL_H_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("setM_CAL_H_CAL_NO")) {
						key.setsetM_CAL_H_CAL_NO(msgKey.getKeyValue("setM_CAL_H_CAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("readCLASS_CD1")) {
						key.setreadCLASS_CD1(msgKey.getKeyValue("readCLASS_CD1"));
					}
					if(msgKeyType.containsKeyColumn("setCLASS_CD2")) {
						key.setsetCLASS_CD2(msgKey.getKeyValue("setCLASS_CD2"));
					}
					if(msgKeyType.containsKeyColumn("setCLASS_CD3")) {
						key.setsetCLASS_CD3(msgKey.getKeyValue("setCLASS_CD3"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_STOCK_UNIT")) {
						key.setreadM_ITEM_STOCK_UNIT(msgKey.getKeyValue("readM_ITEM_STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_LOT_CTRL_FLG")) {
						key.setreadM_ITEM_LOT_CTRL_FLG(msgKey.getKeyValue("readM_ITEM_LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_MRP_ODR_TYP")) {
						key.setreadM_ITEM_MRP_ODR_TYP(msgKey.getKeyValue("readM_ITEM_MRP_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD")) {
						key.setsetM_ITEM_ITEM_CD(msgKey.getKeyValue("setM_ITEM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setDISPLAY_NAME")) {
						key.setsetDISPLAY_NAME(msgKey.getKeyValue("setDISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("DEPT_CD")) {
						key.setDEPT_CD(msgKey.getKeyValue("DEPT_CD"));
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
