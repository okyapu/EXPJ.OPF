/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AA0160/src/com/nec/jp/orteus/metamorBase/AA0160/AA0160010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AA0160;

import com.nec.jp.orteus.metamorBase.AA0160.*;
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
import com.nec.jp.orteus.expj.util.PrivateConfig;
import java.io.*;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;
//import com.nec.jp.orteus.metamorBase.common01.util.DateTool;
import java.text.ParseException;
import java.math.BigDecimal;
import java.text.CharacterIterator;
import java.text.StringCharacterIterator;

import com.nec.jp.orteus.expj.psmaintenance.PsMaintenance;
import com.nec.jp.orteus.expj.exception.NoDataException;
import com.nec.jp.orteus.expj.exception.PsEffPhaseException;
import com.nec.jp.orteus.expj.exception.PsLoopException;
import com.nec.jp.orteus.expj.exception.PsMrpOdrTypException;
// 2008/07/29 SYSCOM 磯部 ADD START
import com.nec.jp.orteus.expj.exception.PsManhourTypException;
// 2008/07/29 SYSCOM 磯部 ADD END
import com.nec.jp.orteus.metamorBase.common01.Accessor.ProductStructureRepository;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AA0160010Control
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
    protected List list;                                            // 一覧部分の結果リストを画面に表示するためのリストインスタンス


    // デフォルトアクセサメソッド
    public List getList() { return this.list; }                     // リストを返します。
    public void setList(List listname) { this.list = listname; }    // リストをセットします。
    public int getListsize() {                                      // リスト型のサイズを返します。
        int nret = 0;
        if( this.list != null ) {nret = this.list.size();}
        return nret;
    }
//  public Object getListvalue(int x) { return this.list.get(x); }  // リストの値を返します。
    public AA0160010Struct getListvalue(int x) { return (AA0160010Struct)(this.list.get(x)); }  // リストの値を返します。
    public AA0160010Struct getStruct() { return this.struct; }  // Structを返します。
    public AA0160010Struct createStruct() { return new AA0160010Struct(); } // 新しいStructを作って返します。
    public void setStruct(Object structname) { this.struct.setStruct((AA0160010Struct)structname); }    // Structをセットします。
    public void initializeStruct() { this.struct.initialize(); }    // Structの値を初期化します。

    // CSV出力用リスト
    private CsvWriter csvWriter = null;
    public CsvWriter getCsvWriter(){ return this.csvWriter; }

    /** 製品構成メンテナンス部品アクセス用オブジェクト */
    private PsMaintenance _psMaint = null;

    /** 展開区分：正展開 */
//  private static final String DEVELOP_NORMAL = "1";

    /** 展開区分：逆展開 */
//  private static final String DEVELOP_REVERSE = "2";

    
    // 拡張子
    private final String EXTENSION_CSV = "csv"; 

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
    private AA0160010Struct _save_struct = new AA0160010Struct();

    /**
     * 親画面のstruct情報を退避
     */
    private void saveParentStruct()
    {
        _save_struct.copy(struct);
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

    //---------- ＣＳＶデータ関連チェックの処理 START-----------------------------------------
    /**
     * 指定された期間が製品構成有効期間と重複しないか調べます
     *
     * @param targetBDate 検査対象の製品構成有効（期間）開始日
     * @param targetEDate 検査対象の製品構成有効（期間）終了日
     * @param inDate 製品構成有効（期間）開始日
     * @param outDate 製品構成有効（期間）終了日
     * @return boolean     true  :エラーある
     *                     false :エラー無し
    */
    private boolean chkConflictEffPhase(String targetBDate,String targetEDate, String inDate, String outDate)
            throws  ParseException
    {
        SimpleDateFormat formatYyyyMmDd = new SimpleDateFormat("yyyy/MM/dd");
        Date dateTargetBDate = formatYyyyMmDd.parse(targetBDate);
        Date dateTargetEDate = formatYyyyMmDd.parse(targetEDate);
        Date dateInDate = formatYyyyMmDd.parse(inDate);
        Date dateOutDate = formatYyyyMmDd.parse(outDate);
        boolean b = false;
        
        // 検査対象の開始日＞指定開始日の場合
        if (dateTargetBDate.compareTo(dateInDate) > 0) {
            // 検査対象の開始日≦指定終了日ならば：
            if (dateTargetBDate.compareTo(dateOutDate) <= 0) {
                // 重複する
                b = true;
            }
        // 検査対象の開始日＜指定開始の場合
        } else if (dateTargetBDate.compareTo(dateInDate) < 0) {
            // 検査対象の終了日≧指定開始日
            if (dateTargetEDate.compareTo(dateInDate) >= 0) {
                // 重複する
                b = true;
            }
        } else {
            // 検査対象の開始日==指定開始日
            // 重複する
                b = true;
        }
        
        return b;
    }

    /**
     * 親製品構成にループがないか調べます
     *
     * @param  parentItemCd 検査する製品構成の親品目番号
     * @param  compItemCd 検査する製品構成の子品目番号
     * @throws SQLException DBアクセスに失敗
     * @throws PsLoopException 親製品構成にループあり
     */
    private void chkLoopingParentPs(String parentItemCd, String compItemCd)
            throws PsLoopException
    {
        // 親の親品目番号の一覧を取得
        List grandParentPsList = getParentPsList(parentItemCd);
        int listSize = grandParentPsList.size();
        for (int i = 0; i < listSize; i++) {
            String[] grandParentPs = (String[])grandParentPsList.get(i);
            String grandParentItemCd = grandParentPs[0];
            // 親の親品目の同一品目検査（ループ検査）
            if (compItemCd.equals(grandParentItemCd) == true) {
                // ループあり
                throw new PsLoopException(new ExpjMessage("ZZ01006",
                    "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
            }
            // 親の親の親品目のループ検査
            chkLoopingParentPs(grandParentItemCd, compItemCd);
        }
        // ループなし
    }

    /**
     * 親製品構成の一覧を取得し、返却します
     *
     * @param  compItemCd 子品目番号（基準品目番号）
     * @return 親製品構成の一覧
     * @throws SQLException DBアクセスに失敗
     */
    private List getParentPsList(String compItemCd)
    {
        List rtnList = new ArrayList();
        for(int i=0;i<PsList.size();i++){
            String[] strArr = (String[])PsList.get(i);
            if(strArr[1].equals(compItemCd)){
                rtnList.add(strArr);
            }
        }
        return rtnList;
    }
    
    /**
     * 子製品構成にループがないか調べます
     *
     * @param  parentItemCd 検査する製品構成の親品目番号
     * @param  compItemCd 検査する製品構成の子品目番号
     * @throws SQLException DBアクセスに失敗
     * @throws PsLoopException 子製品構成にループあり
     */
    private void chkLoopingCompPs(String parentItemCd, String compItemCd)
            throws PsLoopException
    {
        // 孫品目番号の一覧を取得
        List grandCompPsList = getCompPsList(compItemCd);
        int listSize = grandCompPsList.size();
        for (int i = 0; i < listSize; i++) {
            String[] grandCompPs = (String[])grandCompPsList.get(i);
            String grandCompItemCd = grandCompPs[1];
            // 孫品目の同一品目検査（ループ検査）
            if (parentItemCd.equals(grandCompItemCd) == true) {
                // ループあり
                throw new PsLoopException(new ExpjMessage("ZZ01006",
                    "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + parentItemCd + "," + compItemCd));
            }
            // 曽孫品目のループ検査
            chkLoopingCompPs(parentItemCd, grandCompItemCd);
        }
        // ループなし
    }
    
    /**
     * 子製品構成の一覧を取得し、返却します
     *
     * @param  parentItemCd 親品目番号（基準品目番号）
     * @return 子製品構成の一覧
     * @throws SQLException DBアクセスに失敗
     */
    private List getCompPsList(String parentItemCd)
    {
        List rtnList = new ArrayList();
        for(int i=0;i<PsList.size();i++){
            String[] strArr = (String[])PsList.get(i);
            if(strArr[0].equals(parentItemCd)){
                rtnList.add(strArr);
                continue;
            }
        }
        return rtnList;
    }
    
    /**
     * ルーピングチェック。正展開を行い同品目番号が存在 有無
     * @param repository 製品構成リポジトリ
     * @param  checkItem 対象品目番号
     * @param item 比較する品目番号
     * @return true:有  false:無
     */
    private void checkRooping(ProductStructureRepository repository, 
            String targetItem, String item)
     throws PsLoopException
    {
      try{
      // 子品目番号一覧取得
      ArrayList itemList = repository.orderDeployment(item);
      checkItemList(itemList);
   
        for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
            // 子品目番号一覧から更に下の子品目取得
            checkRooping(repository, targetItem, (String)itemList.get(i));
          }else{
            throw new PsLoopException(new ExpjMessage("ZZ01006",
                    "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + targetItem + "," + item));
          }
        }
      } catch (SQLException e){
        e.printStackTrace();
      } 
    }
    
    /**
     * ルーピングチェック。逆展開を行い同品目番号が存在 有無
     * @param repository 製品構成リポジトリ
     * @param checkItem 対象品目番号
     * @param item 比較する品目番号
     * @return true:有  false:無
     */
    private void checkReverseRooping(ProductStructureRepository repository, 
               String targetItem, String item)
     throws PsLoopException
    {
      try {
        // 親品目番号一覧取得
        ArrayList itemList = repository.reverseDeployment(item);
        checkItemList(itemList);
   
        for(int i = 0; i < itemList.size(); i++){
          if(targetItem.equals((String)itemList.get(i)) == false){
          // 親品目番号一覧から更に上の親品目取得
          checkReverseRooping(repository, 
              targetItem, (String)itemList.get(i));
          }else{
              throw new PsLoopException(new ExpjMessage("ZZ01006",
                  "M_PS.PARENT_ITEM_CD,COMP_ITEM_CD:" + targetItem + "," + item));
          }
        }
      }catch(SQLException e){
    	  e.printStackTrace();
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
    
    //---------- ＣＳＶデータ関連チェックの処理 END-------------------------------------------
    //---------- ＣＳＶ出力関連の処理 START---------------------------------------------------

    private String strSysdate = "";
    private List PsList = new ArrayList(0);
    
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
     * @return 異常なし true エラー false
     */ 
    private boolean csvExport(AA0160010Struct target_struct , int ErrlineNo , String ErrItem, String ErrCd, String ErrNo ,String ErrMsg , String CsvCnount,int ErrItemNo)
    {
        
        AA0160010Struct aa0160010Struct = new AA0160010Struct();
        String locale = CoreTools.getLocale(sysUSER_CD);

        // 明細設定
        // 多言語キーセット
        // エラー行
        if(ErrItemNo != CSV_COLNO_99){
          ExpjMessage emsg = new ExpjMessage("AH00045",String.valueOf(ErrlineNo),String.valueOf(ErrItemNo + 1));
          aa0160010Struct.setERROR_IN(emsg.getMessage(locale));
      }else{
          ExpjMessage emsg = new ExpjMessage("AA01520",String.valueOf(ErrlineNo));
          aa0160010Struct.setERROR_IN(emsg.getMessage(locale));
        }
        // 親品目番号
        aa0160010Struct.setPARENT_ITEM_CD(target_struct.geth_PARENT_ITEM_CD());
        // 子品目番号
        aa0160010Struct.setCOMP_ITEM_CD(target_struct.geth_COMP_ITEM_CD());
        // 製品構成版数
        aa0160010Struct.setPS_EDITION(target_struct.geth_PS_EDITION());
        // エラー項目名
        aa0160010Struct.setERR_CTR_NM(ErrItem);
        // エラーメッセージ
        aa0160010Struct.setERR_INFO(ErrMsg);
        list.add(aa0160010Struct);
        
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
    private boolean csvExportCorrection( AA0160010Struct target_struct , String UserId, String SyoriKbn, String DataKbn, boolean bWrite )
    {
        // 処理成功フラグ初期化
        boolean bSuccess = false;
        // CSVファイル編集用
        String csvStr = "";
        String strTmp = "";
        BufferedWriter outStream = null;

        try {
            // 変更データ区分が(1:変更前データ)だった場合。
            if ( "1".equals(DataKbn))
            {
                // *更新前のデータの取得*
                struct.setC_setPARENT_ITEM_CD(target_struct.geth_PARENT_ITEM_CD());
                struct.setC_setCOMP_ITEM_CD(target_struct.geth_COMP_ITEM_CD());
                struct.setC_setPS_EDITION(target_struct.geth_PS_EDITION());
                List listmitemType = entity.mselectM_PS.read(conn, struct);
                csvStr = '"' + strSysdate + '"' + "," ;
                // ○2ログインユーザー名
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ○3処理区分
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ○4変更データ区分
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ○5親品目番号
                csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PARENT_ITEM_CD() + '"' + "," ;
                // ○6子品目番号
                csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_COMP_ITEM_CD() + '"' + "," ;
                // ○7製品構成版数
                csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_EDITION() + '"' + "," ;
                // ○8製品構成単位数分母
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_DENOMINATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_DENOMINATOR() + '"' + "," ;
                }
                // ○9製品構成単位数分子
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_NUMERATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_UNIT_NUMERATOR() + '"' + "," ;
                }
                // ○10製品構成有効開始日
                if(((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_IN_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_IN_DATE() + '"' + "," ;
                }
                // ○11製品構成有効終了日
                if(((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_OUT_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_EFF_PHASE_OUT_DATE() + '"' + "," ;
                }
                // ○11構成仕損率
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_SPOIL() + '"' + "," ;
                }
                // ○12支給区分
                if(((AA0160010Struct)listmitemType.get(0)).getC_CONS_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_CONS_TYP() + '"' + "," ;
                }
                // ○13製品構成リードタイム使用フラグ
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_LT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_LT_FLG() + '"' + "," ;
                }
                // ○14製品構成固定分リードタイム
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_FIXED_LT() + '"' + "," ;
                }
                // ○15製品構成比例分リードタイム
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LT() + '"' + "," ;
                }
                // ○16製品構成比例分ロットサイズ
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_PROP_LOT_SIZE() + '"' + "," ;
                }
                // ○17製品構成照会キー
                if(((AA0160010Struct)listmitemType.get(0)).getC_PS_REF_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_PS_REF_NO() + '"' + "," ;
                }
                // ○18原価積上区分
                if(((AA0160010Struct)listmitemType.get(0)).getC_COST_UP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_COST_UP_TYP() + '"' + "," ;
                }
                // ○19所要量展開区分
                if(((AA0160010Struct)listmitemType.get(0)).getC_MRP_EXP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' ;
                } else {
                    csvStr = csvStr + '"' + ((AA0160010Struct)listmitemType.get(0)).getC_MRP_EXP_TYP() + '"' ;
                }
            } else {
                // 訂正ログ作成(変更後データ)
                csvStr = '"' + strSysdate + '"' + "," ;

                // ○2ログインユーザー名
                csvStr = csvStr + '"' + UserId + '"' + "," ;
                // ○3処理区分
                csvStr = csvStr + '"' + SyoriKbn + '"' + "," ;
                // ○4変更データ区分
                csvStr = csvStr + '"' + DataKbn + '"' + "," ;
                // ○5親品目番号
                csvStr = csvStr + '"' + target_struct.geth_PARENT_ITEM_CD() + '"' + "," ;
                // ○6子品目番号
                csvStr = csvStr + '"' + target_struct.geth_COMP_ITEM_CD() + '"' + "," ;
                // ○7製品構成版数
                csvStr = csvStr + '"' + target_struct.geth_PS_EDITION() + '"' + "," ;
                // ○8製品構成単位数分母
                if(target_struct.geth_PS_UNIT_DENOMINATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_UNIT_DENOMINATOR() + '"' + "," ;
                }
                // ○9製品構成単位数分子
                if(target_struct.geth_PS_UNIT_NUMERATOR() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_UNIT_NUMERATOR() + '"' + "," ;
                }
                // ○10製品構成有効開始日
                if(target_struct.geth_EFF_PHASE_IN_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_EFF_PHASE_IN_DATE() + '"' + "," ;
                }
                // ○11製品構成有効終了日
                if(target_struct.geth_EFF_PHASE_OUT_DATE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_EFF_PHASE_OUT_DATE() + '"' + "," ;
                }
                // ○12構成仕損率
                if(target_struct.geth_PS_SPOIL() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_SPOIL() + '"' + "," ;
                }
                // ○13支給区分
                if(target_struct.geth_CONS_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_CONS_TYP() + '"' + "," ;
                }
                // ○14製品構成リードタイム使用フラグ
                if(target_struct.geth_PS_LT_FLG() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_LT_FLG() + '"' + "," ;
                }
                // ○15製品構成固定分リードタイム
                if(target_struct.geth_PS_FIXED_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_FIXED_LT() + '"' + "," ;
                }
                // ○15製品構成比例分リードタイム
                if(target_struct.geth_PS_PROP_LT() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_PROP_LT() + '"' + "," ;
                }
                // ○16製品構成比例分ロットサイズ
                if(target_struct.geth_PS_PROP_LOT_SIZE() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_PROP_LOT_SIZE() + '"' + "," ;
                }
                // ○17製品構成照会キー
                if(target_struct.geth_PS_REF_NO() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_PS_REF_NO() + '"' + "," ;
                }
                // ○18原価積上区分
                if(target_struct.geth_COST_UP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' + "," ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_COST_UP_TYP() + '"' + "," ;
                }
                // ○19所要量展開区分
                if(target_struct.geth_MRP_EXP_TYP() == null){
                    csvStr = csvStr + '"' + strTmp + '"' ;
                } else {
                    csvStr = csvStr + '"' + target_struct.geth_MRP_EXP_TYP() + '"' ;
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
    private final int CSV_COLNO_PARENT_ITEM_CD = 0;         //  0親品目番号
    private final int CSV_COLNO_COMP_ITEM_CD = 1;             //  1子品目番号
    private final int CSV_COLNO_PS_EDITION = 2;               //  2製品構成版数
    private final int CSV_COLNO_PS_UNIT_DENOMINATOR = 3;//  3製品構成単位数分母
    private final int CSV_COLNO_PS_UNIT_NUMERATOR = 4;  //  4製品構成単位数分子
    private final int CSV_COLNO_EFF_PHASE_IN_DATE = 5;  //  5製品構成有効開始日
    private final int CSV_COLNO_EFF_PHASE_OUT_DATE = 6; //  6製品構成有効終了日
    private final int CSV_COLNO_PS_SPOIL = 7;                   //  7構成仕損率
    private final int CSV_COLNO_CONS_TYP = 8;                   //  8支給区分
    private final int CSV_COLNO_PS_LT_FLG = 9;                // 09製品構成リードタイム使用フラグ
    private final int CSV_COLNO_PS_FIXED_LT = 10;             // 10製品構成固定分リードタイム
    private final int CSV_COLNO_PS_PROP_LT = 11;              // 11製品構成比例分リードタイム
    private final int CSV_COLNO_PS_PROP_LOT_SIZE = 12;  // 12製品構成比例分ロットサイズ
    private final int CSV_COLNO_PS_REF_NO = 13;               // 13製品構成照会キー
    private final int CSV_COLNO_COST_UP_TYP = 14;             // 14原価積上区分
    private final int CSV_COLNO_MRP_EXP_TYP = 15;             // 15所要量展開区分
    private final int CSV_COLNO_99 = 99;                        // 99

    /** ＣＳＶ取込データ必要項目数(合計) */
    private final int CSV_NECESSARY_COLUMN = (CSV_COLNO_MRP_EXP_TYP + 1);

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
                    AA0160010Struct structCsv = new AA0160010Struct();
                    Vector v = csvReader.importCSVLine(strsCsvData[i]);
                    if(null != v)
                    {
                        // 項目数チェック
                        // CSVファイルの項目数を変数に取得。
                        int intColNum = v.size();
                        if(CSV_NECESSARY_COLUMN == intColNum)
                        {
                            // ■1親品目番号
                            if ((String) v.get(CSV_COLNO_PARENT_ITEM_CD) == null || ("").equals((String) v.get(CSV_COLNO_PARENT_ITEM_CD)) == true )
                            {
                                structCsv.seth_PARENT_ITEM_CD((String)null);
                            } else {
                                structCsv.seth_PARENT_ITEM_CD((String) v.get(CSV_COLNO_PARENT_ITEM_CD));
                            }
                            // \の場合、\\で置換処理
                            structCsv.seth_PARENT_ITEM_CD(replaceSlash(structCsv.geth_PARENT_ITEM_CD()));
                            // ■2子品目番号
                            if ((String) v.get(CSV_COLNO_COMP_ITEM_CD) == null || ("").equals((String) v.get(CSV_COLNO_COMP_ITEM_CD)) == true )
                            {
                                structCsv.seth_COMP_ITEM_CD((String)null);
                            } else {
                                structCsv.seth_COMP_ITEM_CD((String) v.get(CSV_COLNO_COMP_ITEM_CD));
                            }
                            // \の場合、\\で置換処理
                            structCsv.seth_COMP_ITEM_CD(replaceSlash(structCsv.geth_COMP_ITEM_CD()));
                            // ■3製品構成版数
                            if ((String) v.get(CSV_COLNO_PS_EDITION) == null || ("").equals((String) v.get(CSV_COLNO_PS_EDITION)) == true )
                            {
                                structCsv.seth_PS_EDITION((String)null);
                            } else {
                                structCsv.seth_PS_EDITION((String) v.get(CSV_COLNO_PS_EDITION));
                            }
                            // \の場合、\\で置換処理
                            structCsv.seth_PS_EDITION(replaceSlash(structCsv.geth_PS_EDITION()));
                            // ■4製品構成単位数分母
                            if ((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR) == null || ("").equals((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR)) == true )
                            {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String)null);
                            } else {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR));
                            }
                            structCsv.seth_PS_UNIT_DENOMINATOR(trim(structCsv.geth_PS_UNIT_DENOMINATOR()));
                            // ■5製品構成単位数分子
                            if ((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR) == null || ("").equals((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR)) == true )
                            {
                                structCsv.seth_PS_UNIT_NUMERATOR((String)null);
                            } else {
                                structCsv.seth_PS_UNIT_NUMERATOR((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR));
                            }
                            structCsv.seth_PS_UNIT_NUMERATOR(trim(structCsv.geth_PS_UNIT_NUMERATOR()));
                            // ■6製品構成有効開始日
                            if ((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE) == null || ("").equals((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE)) == true)
                            {
                                structCsv.seth_EFF_PHASE_IN_DATE((String)null);
                            } else {
                                structCsv.seth_EFF_PHASE_IN_DATE((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE));
                            }
                            structCsv.seth_EFF_PHASE_IN_DATE(trim(structCsv.geth_EFF_PHASE_IN_DATE()));
                            // ■7製品構成有効終了日
                            if ((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE) == null || ("").equals((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE)) == true)
                            {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String)null);
                            } else {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE));
                            }
                            structCsv.seth_EFF_PHASE_OUT_DATE(trim(structCsv.geth_EFF_PHASE_OUT_DATE()));
                            // ■8構成仕損率
                            if ((String) v.get(CSV_COLNO_PS_SPOIL) == null || ("").equals((String) v.get(CSV_COLNO_PS_SPOIL)) == true)
                            {
                                structCsv.seth_PS_SPOIL((String)null);
                            } else {
                                structCsv.seth_PS_SPOIL((String) v.get(CSV_COLNO_PS_SPOIL));
                            }
                            structCsv.seth_PS_SPOIL(trim(structCsv.geth_PS_SPOIL()));
                            // ■9支給区分
                            if ((String) v.get(CSV_COLNO_CONS_TYP) == null || ("").equals((String) v.get(CSV_COLNO_CONS_TYP)) == true)
                            {
                                structCsv.seth_CONS_TYP((String)null);
                            } else {
                                structCsv.seth_CONS_TYP((String) v.get(CSV_COLNO_CONS_TYP));
                            }
                            structCsv.seth_CONS_TYP(trim(structCsv.geth_CONS_TYP()));
                            // ■10製品構成リードタイム使用フラグ
                            if ((String) v.get(CSV_COLNO_PS_LT_FLG) == null || ("").equals((String) v.get(CSV_COLNO_PS_LT_FLG)) == true)
                            {
                                structCsv.seth_PS_LT_FLG((String)null);
                            } else {
                                structCsv.seth_PS_LT_FLG((String) v.get(CSV_COLNO_PS_LT_FLG));
                            }
                            structCsv.seth_PS_LT_FLG(trim(structCsv.geth_PS_LT_FLG()));
                            // ■11製品構成固定分リードタイム
                            if ((String) v.get(CSV_COLNO_PS_FIXED_LT) == null || ("").equals((String) v.get(CSV_COLNO_PS_FIXED_LT)) == true)
                            {
                                structCsv.seth_PS_FIXED_LT((String)null);
                            } else {
                                structCsv.seth_PS_FIXED_LT((String) v.get(CSV_COLNO_PS_FIXED_LT));
                            }
                            structCsv.seth_PS_FIXED_LT(trim(structCsv.geth_PS_FIXED_LT()));
                            // ■12製品構成比例分リードタイム
                            if ((String) v.get(CSV_COLNO_PS_PROP_LT) == null || ("").equals((String) v.get(CSV_COLNO_PS_PROP_LT)) == true)
                            {
                                structCsv.seth_PS_PROP_LT((String)null);
                            } else {
                                structCsv.seth_PS_PROP_LT((String) v.get(CSV_COLNO_PS_PROP_LT));
                            }
                            structCsv.seth_PS_PROP_LT(trim(structCsv.geth_PS_PROP_LT()));
                            // ■13製品構成比例分ロットサイズ
                            if ((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE) == null || ("").equals((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE)) == true)
                            {
                                structCsv.seth_PS_PROP_LOT_SIZE((String)null);
                            } else {
                                structCsv.seth_PS_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE));
                            }
                            structCsv.seth_PS_PROP_LOT_SIZE(trim(structCsv.geth_PS_PROP_LOT_SIZE()));
                            // ■14製品構成照会キー
                            if ((String) v.get(CSV_COLNO_PS_REF_NO) == null || ("").equals((String) v.get(CSV_COLNO_PS_REF_NO)) == true)
                            {
                                structCsv.seth_PS_REF_NO((String)null);
                            } else {
                                structCsv.seth_PS_REF_NO((String) v.get(CSV_COLNO_PS_REF_NO));
                            }
                            structCsv.seth_PS_REF_NO(trim(structCsv.geth_PS_REF_NO()));
                            // ■15原価積上区分
                            if ((String) v.get(CSV_COLNO_COST_UP_TYP) == null || ("").equals((String) v.get(CSV_COLNO_COST_UP_TYP)) == true)
                            {
                                structCsv.seth_COST_UP_TYP((String)null);
                            } else {
                                structCsv.seth_COST_UP_TYP((String) v.get(CSV_COLNO_COST_UP_TYP));
                            }
                            structCsv.seth_COST_UP_TYP(trim(structCsv.geth_COST_UP_TYP()));
                            // ■16所要量展開区分
                            if ((String) v.get(CSV_COLNO_MRP_EXP_TYP) == null || ("").equals((String) v.get(CSV_COLNO_MRP_EXP_TYP)) == true)
                            {
                                structCsv.seth_MRP_EXP_TYP((String)null);
                            } else {
                                structCsv.seth_MRP_EXP_TYP((String) v.get(CSV_COLNO_MRP_EXP_TYP));
                            }
                            structCsv.seth_MRP_EXP_TYP(trim(structCsv.geth_MRP_EXP_TYP()));
                            // 正常取込場合は、変数COLUMN_FLGにnullをセットする。
                            structCsv.setw_COLUMN_FLG((String)null);
                        } else {
                            // ＣＳＶの項目をリストデータ化
                            // ■1親品目番号
                            structCsv.seth_PARENT_ITEM_CD((String) v.get(CSV_COLNO_PARENT_ITEM_CD));
                            // \の場合、\\で置換処理
                            structCsv.seth_PARENT_ITEM_CD(replaceSlash(structCsv.geth_PARENT_ITEM_CD()));
                        	if(intColNum > 1){
                                // ■2子品目番号
                                structCsv.seth_COMP_ITEM_CD((String) v.get(CSV_COLNO_COMP_ITEM_CD));
                                // \の場合、\\で置換処理
                                structCsv.seth_COMP_ITEM_CD(replaceSlash(structCsv.geth_COMP_ITEM_CD()));
                        	}else{
                                structCsv.seth_COMP_ITEM_CD((String)null);
                        	}

                            // ■3製品構成版数
                            if(intColNum > CSV_COLNO_PS_EDITION)
                            {
                                structCsv.seth_PS_EDITION((String) v.get(CSV_COLNO_PS_EDITION));
                            } else {
                                structCsv.seth_PS_EDITION((String)null);
                            }
                            // \の場合、\\で置換処理
                            structCsv.seth_PS_EDITION(replaceSlash(structCsv.geth_PS_EDITION()));
                            // ■4製品構成単位数分母
                            if(intColNum > CSV_COLNO_PS_UNIT_DENOMINATOR)
                            {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String) v.get(CSV_COLNO_PS_UNIT_DENOMINATOR));
                            } else {
                                structCsv.seth_PS_UNIT_DENOMINATOR((String)null);
                            }
                            // ■5製品構成単位数分子
                            if(intColNum > CSV_COLNO_PS_UNIT_NUMERATOR)
                            {
                                structCsv.seth_PS_UNIT_NUMERATOR((String) v.get(CSV_COLNO_PS_UNIT_NUMERATOR));
                            } else {
                                structCsv.seth_PS_UNIT_NUMERATOR((String)null);
                            }
                            // ■6製品構成有効開始日
                            if(intColNum > CSV_COLNO_EFF_PHASE_IN_DATE)
                            {
                                structCsv.seth_EFF_PHASE_IN_DATE((String) v.get(CSV_COLNO_EFF_PHASE_IN_DATE));
                            } else {
                                structCsv.seth_EFF_PHASE_IN_DATE((String)null);
                            }
                            // ■7製品構成有効終了日
                            if(intColNum > CSV_COLNO_EFF_PHASE_OUT_DATE)
                            {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String) v.get(CSV_COLNO_EFF_PHASE_OUT_DATE));
                            } else {
                                structCsv.seth_EFF_PHASE_OUT_DATE((String)null);
                            }
                            // ■8構成仕損率
                            if(intColNum > CSV_COLNO_PS_SPOIL)
                            {
                                structCsv.seth_PS_SPOIL((String) v.get(CSV_COLNO_PS_SPOIL));
                            } else {
                                structCsv.seth_PS_SPOIL((String)null);
                            }
                            // ■9支給区分
                            if(intColNum > CSV_COLNO_CONS_TYP)
                            {
                                structCsv.seth_CONS_TYP((String) v.get(CSV_COLNO_CONS_TYP));
                            } else {
                                structCsv.seth_CONS_TYP((String)null);
                            }
                            // ■10製品構成リードタイム使用フラグ
                            if(intColNum > CSV_COLNO_PS_LT_FLG)
                            {
                                structCsv.seth_PS_LT_FLG((String) v.get(CSV_COLNO_PS_LT_FLG));
                            } else {
                                structCsv.seth_PS_LT_FLG((String)null);
                            }
                            // ■11製品構成固定分リードタイム
                            if(intColNum > CSV_COLNO_PS_FIXED_LT)
                            {
                                structCsv.seth_PS_FIXED_LT((String) v.get(CSV_COLNO_PS_FIXED_LT));
                            } else {
                                structCsv.seth_PS_FIXED_LT((String)null);
                            }
                            // ■12製品構成比例分リードタイム
                            if(intColNum > CSV_COLNO_PS_PROP_LT)
                            {
                                structCsv.seth_PS_PROP_LT((String) v.get(CSV_COLNO_PS_PROP_LT));
                            } else {
                                structCsv.seth_PS_PROP_LT((String)null);
                            }
                            // ■13製品構成比例分ロットサイズ
                            if(intColNum > CSV_COLNO_PS_PROP_LOT_SIZE)
                            {
                                structCsv.seth_PS_PROP_LOT_SIZE((String) v.get(CSV_COLNO_PS_PROP_LOT_SIZE));
                            } else {
                                structCsv.seth_PS_PROP_LOT_SIZE((String)null);
                            }
                            // ■14製品構成照会キー
                            if(intColNum > CSV_COLNO_PS_REF_NO)
                            {
                                structCsv.seth_PS_REF_NO((String) v.get(CSV_COLNO_PS_REF_NO));
                            } else {
                                structCsv.seth_PS_REF_NO((String)null);
                            }
                            // ■15原価積上区分
                            if(intColNum > CSV_COLNO_COST_UP_TYP)
                            {
                                structCsv.seth_COST_UP_TYP((String) v.get(CSV_COLNO_COST_UP_TYP));
                            } else {
                                structCsv.seth_COST_UP_TYP((String)null);
                            }
                            // ■16所要量展開区分
                            if(intColNum > CSV_COLNO_MRP_EXP_TYP)
                            {
                                structCsv.seth_MRP_EXP_TYP((String) v.get(CSV_COLNO_MRP_EXP_TYP));
                            } else {
                                structCsv.seth_MRP_EXP_TYP((String)null);
                            }
                            // ■項目数が必要項目数未満OR以上のときは項目数過不足エラーでw_COLUMN_FLGにカラム数をセットする。
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
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
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
        int intCsvDataCount = 0;    // 対象データ件数
        int ErrlineNo = 0;          // エラー行番号
        String CsvCnt = "16";       // CSV項目
        String ErrItem = "";        // エラー項目
        String ErrItemWork1 = "";       // エラー項目1(項目編集用)
        String ErrItemWork2 = "";       // エラー項目2(項目編集用)
        String ErrItemWork3 = "";       // エラー項目3(項目編集用)
        String ErrCd = "";          // エラー区分
        String ErrNo = "";          // エラー番号
        String ErrMsg = "";         // エラーメッセージ
        int strLength = 0;          // 文字列の長さ取得
        boolean result = false;     // チェック結果格納
        // 多言語項目取得対応
        String locale = CoreTools.getLocale(sysUSER_CD);
        String property = "OrteusUserDic";
        String key = "";            // 多言語辞書取得キー

        boolean chkflg = false;         // 指定キーチェック用
        boolean chkPkeyflg = false;     // 指定キーチェック用2
        String  range1 = "1";      // 0.0001 ～ 99999999999999.9999
        String  range2 = "2";      // 0.0001 ～ 99999.9999

        try {
            AA0160010Struct structCsv;
            intCsvDataCount = listCsv.size();

            // 配列生成
            String  pKey1    [] = new String[intCsvDataCount];      // 主キー1
            String  pKey2    [] = new String[intCsvDataCount];      // 主キー2
            String  pKey3    [] = new String[intCsvDataCount];      // 主キー3
            String[]  chkArray  = null;
            PsList = new ArrayList();
          boolean chkflg1     = false;                              // 指定キーチェック用1
          boolean chkflg2     = false;                            // 指定キーチェック用2
            
            // システム日付取得
            beginTransaction();
            strSysdate = struct.getsSysdate();

            // CSVファイルの行数LOOP
            for(int i = 0; i < intCsvDataCount; i++)
            {
                chkArray = new String[5];
                // エラーフラグ初期化
                boolean bError = false;
                // CSV情報の取得
                structCsv = (AA0160010Struct)listCsv.get(i);
                // 項目数不足エラーチェック
                if(structCsv.getw_COLUMN_FLG() != null && ("").equals(structCsv.getw_COLUMN_FLG()) != true && ("true").equals(_save_struct.getrdoDelete()) != true)
                {
                    ErrlineNo = i + 1;                  // エラー発生行(実際のエラー行)
//                  ErrItem = "項目過不足";             // エラー項目
                    // 多言語キーセット
                    key = "Expj.Cmt3099"; // 項目過不足
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);

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

                    // 項目過不足の場合配列0STのため-1する
                    int setColumnFlg = Integer.parseInt(structCsv.getw_COLUMN_FLG());
                    // 過不足CSV配列数計算
                    setColumnFlg = setColumnFlg - 1 ;
                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, String.valueOf(setColumnFlg),CSV_COLNO_99);
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行(エラー行は飛ばす。)
                    continue;
                }

                ////////////////////////////////////////////////////////////////////////////////////
                // 個別チェック処理開始
                ////////////////////////////////////////////////////////////////////////////////////

// ■1親品目番号 START========================================================
                // 必須項目チェック 親品目番号
                if(structCsv.geth_PARENT_ITEM_CD() == null || ("").equals(structCsv.geth_PARENT_ITEM_CD()) == true)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "親品目番号";                         // エラー項目
                    // 多言語キーセット
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01601";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }

                // 入力補助機能チェック 親品目番号
                // 文字25桁以上の場合エラー
                strLength = StrLengthChk(structCsv.geth_PARENT_ITEM_CD());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "親品目番号";                         // エラー項目
                    // 多言語キーセット
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01501";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }

                // 禁則文字があるの場合エラー
                int iHankaku = chkHankaku(structCsv.geth_PARENT_ITEM_CD());
                if(iHankaku != 0)
                {
                    
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "親品目番号";                         // エラー項目
                    // 多言語キーセット
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);
                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01524";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }
// ■1親品目番号 END==========================================================

// ■2子品目番号 START========================================================
                // 必須項目チェック 子品目番号
                if(structCsv.geth_COMP_ITEM_CD() == null || ("").equals(structCsv.geth_COMP_ITEM_CD()) == true)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "子品目番号";                         // エラー項目
                    // 多言語キーセット
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01602";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COMP_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }

                // 入力補助機能チェック 子品目番号
                // 文字25桁以上の場合エラー
                strLength = StrLengthChk(structCsv.geth_COMP_ITEM_CD());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "子品目番号";                         // エラー項目
                    // 多言語キーセット
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);


                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01501";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COMP_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }

                // 禁則文字があるの場合エラー
                iHankaku = chkHankaku(structCsv.geth_COMP_ITEM_CD());
                if(iHankaku != 0)
                {
                    
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "子品目番号";                         // エラー項目
                    // 多言語キーセット
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);


                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01524";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COMP_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }
// ■2子品目番号 END==========================================================

// ■3製品構成版数 START======================================================
                // 必須項目チェック 製品構成版数
                if(structCsv.geth_PS_EDITION() == null || ("").equals(structCsv.geth_PS_EDITION()) == true)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "製品構成版数";                       // エラー項目
                    // 多言語キーセット
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01603";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_EDITION);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }

                // 入力補助機能チェック 
                // 文字25桁以上の場合エラー
                strLength = StrLengthChk(structCsv.geth_PS_EDITION());
                if(strLength > 25)
                {
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "製品構成版数";                       // エラー項目
                    // 多言語キーセット
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01501";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_EDITION);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }

                // 禁則文字があるの場合エラー
                iHankaku = chkHankaku(structCsv.geth_PS_EDITION());
                if(iHankaku != 0)
                {
                    
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                  ErrItem = "製品構成版数";                       // エラー項目
                    // 多言語キーセット
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItem = CoreTools.getRBString(key, resource);

                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA01524";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_EDITION);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }
// ■3製品構成版数 END========================================================

                // ◆登録ラジオボタンが選択されたときのみチェックを行う。(※登録時)◆
                if (("true").equals(_save_struct.getrdoInsert()) == true)
                {
                    if (chkflg == false)
                    {
                        // 1回目
                        // 親品目番号、子品目番号、製品構成版数を配列にセット
                        pKey1[i] = structCsv.geth_PARENT_ITEM_CD();       // 親品目番号
                        pKey2[i] = structCsv.geth_COMP_ITEM_CD();             // 子品目番号
                        pKey3[i] = structCsv.geth_PS_EDITION();               // 製品構成版数

                        // チェックフラグにtrueをセット
                        chkflg = true;
                    } else {
                        // 2回目以降
                        chkPkeyflg = true;
                        // 配列の最後から逆検索して同じ工場コード、品目番号、品目別作業コードが存在しないかチェックする。
                        for (int j = i - 1; j >= 0; j--)
                        {
                            if ((structCsv.geth_PARENT_ITEM_CD()).equals(String.valueOf(pKey1[j])) == true &&
                                (structCsv.geth_COMP_ITEM_CD()).equals(String.valueOf(pKey2[j])) == true &&
                                (structCsv.geth_PS_EDITION()).equals(String.valueOf(pKey3[j])) == true )
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
                            key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItemWork1 = CoreTools.getRBString(key, resource);

                            // 多言語キーセット
                            key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                            ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItemWork2 = CoreTools.getRBString(key, resource2);

                            // 多言語キーセット
                            key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                            ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItemWork3 = CoreTools.getRBString(key, resource3);

                            // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                            ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                            ErrCd = "1";                                        // エラー区分
                            ErrNo = "ZZ01102";                                  // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                        // 親品目番号、子品目番号、製品構成版数を配列にセット
                        pKey1[i] = structCsv.geth_PARENT_ITEM_CD();       // 親品目番号
                        pKey2[i] = structCsv.geth_COMP_ITEM_CD();           // 子品目番号
                        pKey3[i] = structCsv.geth_PS_EDITION();             // 製品構成版数
                    }

                    struct.setsetPARENT_ITEM_CD(structCsv.geth_PARENT_ITEM_CD());
                    struct.setsetCOMP_ITEM_CD(structCsv.geth_COMP_ITEM_CD());
                    struct.setsetPS_EDITION(structCsv.geth_PS_EDITION());
                    result = entity.mcheckM_PS.check(conn, struct);
                    if(result == true)
                    {
                        ErrlineNo = i + 1;                                  // エラー発生行(実際のエラー行)
//                      ErrItem = "親品目番号、子品目番号、製品構成版数";   // エラー項目
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                        // エラー区分
                        ErrNo = "ZZ01102";                                  // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                }   // end if※登録時

                // ◆登録OR更新ラジオボタンが選択されたときのみチェックを行う。(※登録OR更新時)◆
                if (("true").equals(_save_struct.getrdoInsert()) == true || ("true").equals(_save_struct.getrdoUpdate()) == true )
                {

// ■4製品構成単位数分母 START================================================
                    // 種別チェック(数値) 製品構成単位数分母
                    if(structCsv.geth_PS_UNIT_DENOMINATOR() == null || ("").equals(structCsv.geth_PS_UNIT_DENOMINATOR()) == true)
                    {
                        // CSVファイル製品構成単位数分母が未設定だった場合、初期値1をセットする。
                        structCsv.seth_PS_UNIT_DENOMINATOR("1");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_PS_UNIT_DENOMINATOR()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成単位数分母";                 // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_UNIT_DENOMINATOR"; // Expj.PS_UNIT_DENOMINATOR=製品構成単位数分母
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_DENOMINATOR);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_PS_UNIT_DENOMINATOR(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成単位数分母";                 // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_UNIT_DENOMINATOR"; // Expj.PS_UNIT_DENOMINATOR=製品構成単位数分母
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_DENOMINATOR);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■4製品構成単位数分母 END==================================================

// ■5製品構成単位数分子 START================================================
                    // 種別チェック(数値) 製品構成単位数分子
                    if(structCsv.geth_PS_UNIT_NUMERATOR() == null || ("").equals(structCsv.geth_PS_UNIT_NUMERATOR()) == true)
                    {
                        // CSVファイル製品構成単位数分子が未設定だった場合、初期値0をセットする。
                        structCsv.seth_PS_UNIT_NUMERATOR("1");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_PS_UNIT_NUMERATOR()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成単位数分子";                 // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_UNIT_NUMERATOR"; // Expj.PS_UNIT_NUMERATOR=製品構成単位数分子
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_NUMERATOR);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_PS_UNIT_NUMERATOR(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成単位数分子";                 // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_UNIT_NUMERATOR"; // Expj.PS_UNIT_NUMERATOR=製品構成単位数分子
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_UNIT_NUMERATOR);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■5製品構成単位数分子 END==================================================

// ■6製品構成有効開始日 START================================================
                    if(structCsv.geth_EFF_PHASE_IN_DATE() == null || ("").equals(structCsv.geth_EFF_PHASE_IN_DATE()) == true)
                    {
                    
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                      ErrItem = "製品構成有効開始日";                 // エラー項目
                        // 多言語キーセット
                        key = "Expj.Cmt1070"; // Expj.Cmt1070=製品構成有効開始日
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01604";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_IN_DATE);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }

                    if(StrDateChk(structCsv.geth_EFF_PHASE_IN_DATE()) != true )
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                      ErrItem = "製品構成有効開始日";                 // エラー項目
                        // 多言語キーセット
                        key = "Expj.Cmt1070"; // Expj.Cmt1070=製品構成有効開始日
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01606";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_IN_DATE);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }
// ■6製品構成有効開始日 END==================================================

// ■7製品構成有効終了日 START================================================
                    if(structCsv.geth_EFF_PHASE_OUT_DATE() == null || ("").equals(structCsv.geth_EFF_PHASE_OUT_DATE()) == true)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                      ErrItem = "製品構成有効終了日";                 // エラー項目
                        // 多言語キーセット
                        key = "Expj.Cmt1071"; // Expj.Cmt1071=製品構成有効終了日
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01605";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_OUT_DATE);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }

                    if(StrDateChk(structCsv.geth_EFF_PHASE_OUT_DATE()) != true )
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                      ErrItem = "製品構成有効終了日";                 // エラー項目
                        // 多言語キーセット
                        key = "Expj.Cmt1071"; // Expj.Cmt1071=製品構成有効終了日
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItem = CoreTools.getRBString(key, resource);

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA01606";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_OUT_DATE);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }
// ■7製品構成有効終了日 END==================================================

// ■8構成仕損率 START========================================================
                    // 種別チェック(数値) 構成仕損率
                    if(structCsv.geth_PS_SPOIL() == null || ("").equals(structCsv.geth_PS_SPOIL()) == true)
                    {
                        // CSVファイル構成仕損率が未設定だった場合、初期値0をセットする。
                        structCsv.seth_PS_SPOIL("0");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_PS_SPOIL()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "構成仕損率";                         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_SPOIL"; // Expj.PS_SPOIL=構成仕損率
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_SPOIL);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_PS_SPOIL(),range2,false))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "構成仕損率";                 // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_SPOIL"; // Expj.PS_SPOIL=構成仕損率
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_SPOIL);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■8構成仕損率 END==========================================================

// ■9支給区分 START=========================================================
                    // 種別チェック(整数) 支給区分
                    if(structCsv.geth_CONS_TYP() == null || ("").equals(structCsv.geth_CONS_TYP()) == true)
                    {
                        // CSVファイル支給区分が未設定だった場合、初期値1:有償支給をセットする。
                        structCsv.seth_CONS_TYP("1");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_CONS_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "支給区分";                           // エラー項目
                            // 多言語キーセット
                            key = "Expj.CONS_TYP"; // Expj.CONS_TYP=支給区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CONS_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_CONS_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "支給区分";                           // エラー項目
                            // 多言語キーセット
                            key = "Expj.CONS_TYP"; // Expj.CONS_TYP=支給区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CONS_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■9支給区分 END===========================================================

// ■10製品構成リードタイム使用フラグ START===================================
                    // 種別チェック(整数) 製品構成リードタイム使用フラグ
                    if(structCsv.geth_PS_LT_FLG() == null || ("").equals(structCsv.geth_PS_LT_FLG()) == true)
                    {
                        // CSVファイル製品構成リードタイム使用フラグが未設定だった場合、初期値:0をセットする。
                        structCsv.seth_PS_LT_FLG("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_PS_LT_FLG()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成リードタイム使用フラグ";     // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_LT_FLG"; // Expj.PS_LT_FLG=製品構成リードタイム使用フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_LT_FLG);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_PS_LT_FLG());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成リードタイム使用フラグ";     // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_LT_FLG"; // Expj.PS_LT_FLG=製品構成リードタイム使用フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_LT_FLG);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■10製品構成リードタイム使用フラグ END=====================================

// ■11製品構成固定分リードタイム START=======================================
                    // 種別チェック(整数) 製品構成固定分リードタイム
                    if(structCsv.geth_PS_FIXED_LT() == null || ("").equals(structCsv.geth_PS_FIXED_LT()) == true)
                    {
                        // CSVファイル製品構成固定分リードタイムが未設定だった場合、初期値:0をセットする。
                        structCsv.seth_PS_FIXED_LT("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_PS_FIXED_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成固定分リードタイム";         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_FIXED_LT"; // Expj.PS_FIXED_LT=製品構成固定分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_FIXED_LT);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_PS_FIXED_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成固定分リードタイム";         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_FIXED_LT"; // Expj.PS_FIXED_LT=製品構成固定分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);
                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_FIXED_LT);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■11製品構成固定分リードタイム END=========================================

// ■12製品構成比例分リードタイム START=======================================
                    // 種別チェック(整数) 製品構成比例分リードタイム
                    if(structCsv.geth_PS_PROP_LT() == null || ("").equals(structCsv.geth_PS_PROP_LT()) == true)
                    {
                        // CSVファイル製品構成比例分リードタイムが未設定だった場合、初期値:0をセットする。
                        structCsv.seth_PS_PROP_LT("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_PS_PROP_LT()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成比例分リードタイム";         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_PROP_LT"; // Expj.PS_PROP_LT=製品構成比例分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LT);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_PS_PROP_LT());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成比例分リードタイム";         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_PROP_LT"; // Expj.PS_PROP_LT=製品構成比例分リードタイム
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LT);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■12製品構成比例分リードタイム END=========================================

// ■13製品構成比例分ロットサイズ START=======================================
                    // 種別チェック(数値) 製品構成比例分ロットサイズ
                    if(structCsv.geth_PS_PROP_LOT_SIZE() == null || ("").equals(structCsv.geth_PS_PROP_LOT_SIZE()) == true)
                    {
                        // CSVファイル製品構成比例分ロットサイズが未設定だった場合、初期値1をセットする。
                        structCsv.seth_PS_PROP_LOT_SIZE("1");
                    } else {
                        // 数値チェック
                        if(IsNumChk(structCsv.geth_PS_PROP_LOT_SIZE()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成比例分ロットサイズ";         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_PROP_LOT_SIZE"; // Expj.PS_PROP_LOT_SIZE=製品構成比例分ロットサイズ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01503";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LOT_SIZE);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 99999999999999.9999 ～ 0.0001の範囲チェック
                        if (isNotInNumRange(structCsv.geth_PS_PROP_LOT_SIZE(),range1,true))
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成比例分ロットサイズ";         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_PROP_LOT_SIZE"; // Expj.PS_PROP_LOT_SIZE=製品構成比例分ロットサイズ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_PROP_LOT_SIZE);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■13製品構成比例分ロットサイズ END=========================================

// ■14製品構成照会キー START=================================================
                    // 種別チェック(整数) 製品構成照会キー
                    if(structCsv.geth_PS_REF_NO() == null || ("").equals(structCsv.geth_PS_REF_NO()) == true)
                    {
                        // CSVファイル製品構成照会キーが未設定だった場合、初期値:0をセットする。
                        structCsv.seth_PS_REF_NO("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_PS_REF_NO()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成照会キー";                   // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_REF_NO"; // Expj.PS_REF_NO=製品構成照会キー
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_REF_NO);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数6桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_PS_REF_NO());
                        if(strLength > 6)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成照会キー";                   // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_REF_NO"; // Expj.PS_REF_NO=製品構成照会キー
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_REF_NO);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■14製品構成照会キー END===================================================

// ■15原価積上区分 START=====================================================
                    // 種別チェック(整数) 原価積上区分
                    if(structCsv.geth_COST_UP_TYP() == null || ("").equals(structCsv.geth_COST_UP_TYP()) == true)
                    {
                        // CSVファイル原価積上区分が未設定だった場合、初期値:0をセットする。
                        structCsv.seth_COST_UP_TYP("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_COST_UP_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "原価積上区分";                       // エラー項目
                            // 多言語キーセット
                            key = "Expj.COST_UP_TYP"; // Expj.COST_UP_TYP=原価積上区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COST_UP_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_COST_UP_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "原価積上区分";                       // エラー項目
                            // 多言語キーセット
                            key = "Expj.COST_UP_TYP"; // Expj.COST_UP_TYP=原価積上区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COST_UP_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■15原価積上区分 END=======================================================

// ■16所要量展開区分 START===================================================
                    // 種別チェック(整数) 所要量展開区分
                    if(structCsv.geth_MRP_EXP_TYP() == null || ("").equals(structCsv.geth_MRP_EXP_TYP()) == true)
                    {
                        // CSVファイル所要量展開区分が未設定だった場合、初期値:0をセットする。
                        structCsv.seth_MRP_EXP_TYP("0");
                    } else {
                        // 整数チェック
                        if(Calculate.isInteger(structCsv.geth_MRP_EXP_TYP()) != true)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "所要量展開区分";                     // エラー項目
                            // 多言語キーセット
                            key = "Expj.MRP_EXP_TYP"; // Expj.MRP_EXP_TYP=所要量展開区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01502";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_EXP_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }

                        // 桁数チェック
                        // 整数2桁以上の場合エラー
                        strLength = StrLengthChk(structCsv.geth_MRP_EXP_TYP());
                        if(strLength > 2)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "所要量展開区分";                     // エラー項目
                            // 多言語キーセット
                            key = "Expj.MRP_EXP_TYP"; // Expj.MRP_EXP_TYP=所要量展開区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01501";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_EXP_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
// ■16所要量展開区分 END=====================================================

// コンボボックスデータチェック START-------------------------------------------------------------------------------------------

// ●1支給区分コンボ START====================================================
                    // コンボボックス項目チェック 支給区分
                    if(structCsv.geth_CONS_TYP() != null && ("").equals(structCsv.geth_CONS_TYP()) != true)
                    {
                        struct.setsetNAME("CONS_TYP");
                        struct.setsetVALUE(structCsv.geth_CONS_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "支給区分";                           // エラー項目
                            // 多言語キーセット
                            key = "Expj.CONS_TYP"; // Expj.CONS_TYP=支給区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_CONS_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●1支給区分コンボ END======================================================


// ●2製品構成リードタイム使用フラグコンボ START====================================================
                    // コンボボックス項目チェック 支給区分
                    if(structCsv.geth_PS_LT_FLG() != null && ("").equals(structCsv.geth_PS_LT_FLG()) != true)
                    {
                        struct.setsetNAME("PS_LT_FLG");
                        struct.setsetVALUE(structCsv.geth_PS_LT_FLG());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "製品構成リードタイム使用フラグ";                         // エラー項目
                            // 多言語キーセット
                            key = "Expj.PS_LT_FLG"; // Expj.PS_LT_FLG=製品構成リードタイム使用フラグ
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PS_LT_FLG);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●2製品構成リードタイム使用フラグコンボ END======================================================

// ●3原価積上区分コンボ START================================================
                    // コンボボックス項目チェック 支給区分
                    if(structCsv.geth_COST_UP_TYP() != null && ("").equals(structCsv.geth_COST_UP_TYP()) != true)
                    {
                        struct.setsetNAME("COST_UP_TYP");
                        struct.setsetVALUE(structCsv.geth_COST_UP_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "原価積上区分";                       // エラー項目
                            // 多言語キーセット
                            key = "Expj.COST_UP_TYP"; // Expj.COST_UP_TYP=原価積上区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_COST_UP_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●3原価積上有無コンボ END==================================================

// ●4所要量展開区分コンボ START==============================================
                    // コンボボックス項目チェック 所要量展開区分
                    if(structCsv.geth_MRP_EXP_TYP() != null && ("").equals(structCsv.geth_MRP_EXP_TYP()) != true)
                    {
                        struct.setsetNAME("MRP_EXP_TYP");
                        struct.setsetVALUE(structCsv.geth_MRP_EXP_TYP());
                        List listType = entity.mreadSYS_TYPE_VALUE.read(conn, struct);

                        if (listType.isEmpty()) 
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                          ErrItem = "所要量展開区分";                     // エラー項目
                            // 多言語キーセット
                            key = "Expj.MRP_EXP_TYP"; // Expj.MRP_EXP_TYP=所要量展開区分
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItem = CoreTools.getRBString(key, resource);

                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA01504";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);

                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_MRP_EXP_TYP);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // リストクリア
                            listType.clear();
                            // 次明細へ処理を移行
                            continue;
                        }
                        // リストクリア
                        listType.clear();
                    }
// ●4所要量展開区分コンボ END================================================

// コンボボックスデータチェック END-------------------------------------------------------------------------------------------

// 更新チェック処理-1
// 1■品目の同一性検査 登録＆更新時 START=====================================
                    if (structCsv.geth_PARENT_ITEM_CD().equals(structCsv.geth_COMP_ITEM_CD()) == true)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00051";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }
// 1■品目番号=構成品目番号チェック END=======================================

// 2■有効開始日>有効終了日チェック 登録＆更新時 START========================
                    int intcompChk = compareYMD(structCsv.geth_EFF_PHASE_IN_DATE(), structCsv.geth_EFF_PHASE_OUT_DATE());
                    if (intcompChk > 0)
                    {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
//                      ErrItem = "製品構成有効開始日、製品構成有効終了日";                         // エラー項目
                        // 多言語キーセット
                        key = "Expj.Cmt1070"; // Expj.Cmt1070=製品構成有効開始日
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.Cmt1071"; // Expj.Cmt1071=製品構成有効終了日
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // エラー項目編集
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2;

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00048";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_EFF_PHASE_IN_DATE);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                        
                    }
// 2■有効開始日>有効終了日チェック END=======================================

// 3■製品構成の品目手配区分チェック 登録＆更新時 START=======================
// 4■製品構成の重複期間チェック 登録＆更新時 START===========================
// 5■製品構成のルーピングチェック 登録時 START===============================

          // ＣＳＶファイル関連 BEGIN========================================
                
                    if (chkflg1 == false)
                    {
                        // 1回目
                        // チェックフラグにtrueをセット
                        chkflg1 = true;
                    } else {
                        // 2回目以降
                        chkflg2 = true;
                        // 配列の最後から逆検索して同じ工場コード、品目番号と違う品目別作業コードが存在しないかチェックする。
                        for (int cnt=0;cnt<PsList.size();cnt++)
                        {
                            String[] strData = (String[])PsList.get(cnt);
                            if ((structCsv.geth_PARENT_ITEM_CD().equals(strData[0])) == true &&
                                (structCsv.geth_COMP_ITEM_CD().equals(strData[1]))     == true &&
                                (structCsv.geth_PS_EDITION().equals(strData[2]))       != true )
                            {
                                if(chkConflictEffPhase(strData[3],strData[4],structCsv.geth_EFF_PHASE_IN_DATE(),structCsv.geth_EFF_PHASE_OUT_DATE())){
                            chkflg2 = false;
                                    // ループを抜ける。
                                    break;
                                }
                            }
                        }
                        
                        // 一意キー違反の場合エラー
                        if (chkflg2 == false)
                        {
                            ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                            
                            // 多言語キーセット
                            key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                            ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItemWork1 = CoreTools.getRBString(key, resource);
    
                            // 多言語キーセット
                            key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                            ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItemWork2 = CoreTools.getRBString(key, resource2);
    
                            // 多言語キーセット
                            key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                            ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                            // 多言語項目取得セット
                            ErrItemWork3 = CoreTools.getRBString(key, resource3);
    
                            // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                            ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;
    
                            ErrCd = "1";                                    // エラー区分
                            ErrNo = "AA00054";                              // エラー番号
                            // メッセージ取得 
                            ExpjMessage emsg = new ExpjMessage(ErrNo);
                            ErrMsg = emsg.getMessage(locale);
    
                            // CSV出力(エラー)
                            csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                            // w_COLUMN_FLG変数にエラー情報を退避。
                            structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                            // エラーフラグ"true"にセット
                            bError = true;
                            // 次明細へ処理を移行
                            continue;
                        }
                    }
                        
          try{
                        // 登録時のみ製品構成ルーピングチェック
                        if (("true").equals(_save_struct.getrdoInsert()) == true )
                        {
                            // 製品構成のルーピング検査・Csvデータ
                            //if (struct.geth_DEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                            // 正展開の場合
                            chkLoopingCompPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            ////} else {
                            // 逆展開の場合
                            chkLoopingParentPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            //}
                        }
                    } catch (PsLoopException ple) {
                        // 警告：構成情報に矛盾があります。
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00055";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                        
          // ＣＳＶファイル関連 END==========================================
          // DB関連 BEGIN====================================================
                    try{
                        // 製品構成メンテナンス用オブジェクトを構築

                        _psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(), strSysdate);

                        // ③製品構成の品目手配区分検査(引数：親品目番号、子品目番号)
                        _psMaint.testMrpOrderType(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());

                        // ④製品構成の重複期間検査(引数：親品目番号、子品目番号、有効開始日、有効終了日)
                        _psMaint.testConflictEffPhase(structCsv.geth_PARENT_ITEM_CD(),
                                structCsv.geth_COMP_ITEM_CD(), structCsv.geth_PS_EDITION(),
                                structCsv.geth_EFF_PHASE_IN_DATE(), structCsv.geth_EFF_PHASE_OUT_DATE());

                        // ⑤登録時のみ製品構成ルーピングチェック
                        if (("true").equals(_save_struct.getrdoInsert()) == true )
                        {
                            // 製品構成のルーピング検査
                            //if (struct.geth_DEVELOP_TYP().equals(DEVELOP_NORMAL) == true) {
                            // 正展開の場合
                            _psMaint.testLoopingCompPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            ////} else {
                            // 逆展開の場合
                            _psMaint.testLoopingParentPs(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());
                            //}
// 2008/07/29 SYSCOM 磯部 ADD START
                            // 品目の工数管理品目区分検査
                            _psMaint.testManhourTyp(structCsv.geth_PARENT_ITEM_CD());
// 2008/07/29 SYSCOM 磯部 ADD END
                        }

                    } catch (PsMrpOdrTypException pmote) {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00052";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    } catch (PsEffPhaseException pepe) {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00054";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    } catch (PsLoopException ple) {
                        // 警告：構成情報に矛盾があります。
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00055";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
// 2008/07/29 SYSCOM 磯部 ADD START
                    } catch (PsManhourTypException pmte) {
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)

                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "AA00178";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
// 2008/07/29 SYSCOM 磯部 ADD END
                    } catch (NoDataException nde) {
                        // 警告：対象データが存在しません。
                        ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                        
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                        ErrCd = "1";                                    // エラー区分
                        ErrNo = "ZZ06001";                              // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }
          // DB関連 END=======================================================

// 3■製品構成の品目手配区分チェック 登録＆更新時 END=========================
// 4■製品構成の重複期間チェック 登録＆更新時 END=============================
// 5■製品構成のルーピングチェック 登録時 END=================================
                }   // end if(※登録OR更新時)

                // ◆更新or削除ラジオボタンが選択されたときのみチェックを行う。(※更新or削除時)◆
                if (("true").equals(_save_struct.getrdoUpdate()) == true || ("true").equals(_save_struct.getrdoDelete()) == true )
                {
                    struct.setsetPARENT_ITEM_CD(structCsv.geth_PARENT_ITEM_CD());
                    struct.setsetCOMP_ITEM_CD(structCsv.geth_COMP_ITEM_CD());
                    struct.setsetPS_EDITION(structCsv.geth_PS_EDITION());
                    result = entity.mcheckM_PS.check(conn, struct);
                    if(result == false)
                    {
                        ErrlineNo = i + 1;                                  // エラー発生行(実際のエラー行)
//                      ErrItem = "親品目番号、子品目番号、製品構成版数";   // エラー項目
                        // 多言語キーセット
                        key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork1 = CoreTools.getRBString(key, resource);

                        // 多言語キーセット
                        key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                        ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork2 = CoreTools.getRBString(key, resource2);

                        // 多言語キーセット
                        key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                        ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                        // 多言語項目取得セット
                        ErrItemWork3 = CoreTools.getRBString(key, resource3);

                        // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                        ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                        ErrCd = "1";                                        // エラー区分
                        ErrNo = "ZZ06001";                                  // エラー番号
                        // メッセージ取得 
                        ExpjMessage emsg = new ExpjMessage(ErrNo);
                        ErrMsg = emsg.getMessage(locale);

                        // CSV出力(エラー)
                        csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                        // w_COLUMN_FLG変数にエラー情報を退避。
                        structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                        // エラーフラグ"true"にセット
                        bError = true;
                        // 次明細へ処理を移行
                        continue;
                    }
                }   // end if※更新or削除時
                
// 登録/更新時チェック END-------------------------------------------------------------------------------------------

                
                // チェックエラーとなっていない場合、正常レコードとしてカウント
                if(bError != true)
                {
                    // 親品目番号、子品目番号、製品構成版数、製品構成有効開始日、製品構成有効終了日を配列にセット
                    chkArray[0] = structCsv.geth_PARENT_ITEM_CD();        // 親品目番号
                    chkArray[1] = structCsv.geth_COMP_ITEM_CD();            // 子品目番号
                    chkArray[2]  = structCsv.geth_PS_EDITION();             // 製品構成版数
                    chkArray[3] = structCsv.geth_EFF_PHASE_IN_DATE();         // 製品構成有効開始日
                    chkArray[4] = structCsv.geth_EFF_PHASE_OUT_DATE();      // 製品構成有効終了日
                    PsList.add(chkArray);
                    intSuccessCount++;
                }
                ////////////////////////////////////////////////////////////////////////////////////
                // 個別チェック処理終了
                ////////////////////////////////////////////////////////////////////////////////////
            }  //for end
            // チェック結果処理(エラーリストサイズの取得)
            if(getListsize() > 0)
            {
                bSuccess = false;
            }

            // エラーデータ存在時、画面ｲﾝﾌｫﾒｰｼｮﾝへ出力
            if(("true").equals(_save_struct.getDO_CHK()) == true && bSuccess != true)
            {
                // エラーデータ有りのため更新しなかった場合のメッセージ表示
                ExpjMessage emsg = new ExpjMessage( "AA01608",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                msgStruct.addInfo( emsg );
                sysLog.config(emsg, getsysUSER_CD());
            } else {
                // エラーデータ存在時、画面ｲﾝﾌｫﾒｰｼｮﾝへ出力
                if(bSuccess != true)
                {
                    // エラー件数があればメッセージ表示する
                    // なければリスト(ワーニング)のみと判定する。
                    if ((intCsvDataCount - intSuccessCount) > 0)
                    {
                        // エラーデータ有りのため更新しなかった場合のメッセージ表示
                        ExpjMessage emsg = new ExpjMessage( "AA01607",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                        msgStruct.addError( emsg );
                        sysLog.severe(emsg, getsysUSER_CD());
                    }
                }
            }

        }catch(Exception e){
            ExpjMessage emsg = new ExpjMessage( "AH00042", "0", "0" );
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
            String CsvCancelFileName = pc.getString("PS_CANCEL");
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

        boolean bSuccess = true;    // 処理成功フラグ初期化
        boolean aSuccess = true;    // 処理成功フラグ初期化(メッセージ)
        boolean bDBUpdate = false;  // DB更新中フラグ初期化
        boolean bWrite = false; // 書くファイル
        int intCsvDataCount = 0;    // 対象データ件数
        int intSuccessCount = 0;    // チェック正常レコード件数
        String strUserId = "";      // 訂正ログ出力用(ユーザーID)
        String strSyoriKbn = "";    // 訂正ログ出力用(処理区分)
        String strDataKbn = "";     // 訂正ログ出力用(変更データ区分)

        // 処理直前のstruct情報を退避
        AA0160010Struct structCopy = new AA0160010Struct();
        structCopy.copy(struct);
        try
        {
            AA0160010Struct structCsv;
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
                struct.copy((AA0160010Struct)listCsv.get(i));
                struct.setCANCEL_FILE(structCopy.getCANCEL_FILE());
                structCsv = (AA0160010Struct)listCsv.get(i);
                strUserId = "";     // 訂正ログ出力用初期化(ユーザーID)
                strSyoriKbn = "";   // 訂正ログ出力用初期化(処理区分)
                strDataKbn = "";    // 訂正ログ出力用初期化(変更データ区分)

                // 親画面のラジオボタンが1:登録の場合の処理
                if (("true").equals(_save_struct.getrdoInsert()) == true)
                {
                    // ■製品構成マスタ登録処理■
                    entity.minsertM_PS.create(conn, struct);

                    if(("true").equals(_save_struct.getDO_CHK()) != true){
                    	// [SYSｼｰｹﾝｼｬﾙ番号]最大値の取得
                    	List listSeqNo = entity.mreadSYS_PS_T.read(conn, struct);
                    	if(listSeqNo.size() > 0) {
                    		// ■製品構成トランザクション登録処理■
                    		struct.seth_SEQ_NO(((AA0160010Struct)listSeqNo.get(0)).getreadMAXSEQ_NO()); // SYSｼｰｹﾝｼｬﾙ番号
                    		struct.seth_ACCESS_TYP("1");                                                // 処理方法(1:追加)
                    		struct.seth_CMPLT_FLG("0");                                                 // 完了ﾌﾗｸﾞ(0:未)
                    		entity.minsertSYS_PS_T.create(conn, struct);
                    	}

                    	// *訂正ログ出力処理*
                    	strUserId = getsysUSER_CD();            // ユーザーIDセット
                    	strSyoriKbn = "1";                      // 処理区分セット(1:登録)
                    	strDataKbn = "2";                       // 変更データ区分セット
                    	// 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                    	csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                    	bWrite = true;
                    }
                }
                // 親画面のラジオボタンが2:変更の場合の処理
                if (("true").equals(_save_struct.getDO_CHK()) != true) {
                	if (("true").equals(_save_struct.getrdoUpdate()) == true)
                	{
                		// *訂正ログ出力処理*
                		strUserId = getsysUSER_CD();            // ユーザーIDセット
                		strSyoriKbn = "2";                      // 処理区分セット(2:変更)
                		strDataKbn = "1";                       // 変更データ区分セット
                		// 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                		csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                		bWrite = true;

                		// ■製品構成マスタ更新処理■
                		entity.mupdateM_PS.update(conn, struct);
                		strDataKbn = "2";                       // 変更データ区分セット
                		// 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                		csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                		bWrite = true;
                	}
                }
                // 親画面のラジオボタンが3:削除の場合の処理
                if (("true").equals(_save_struct.getrdoDelete()) == true)
                {
                	if (("true").equals(_save_struct.getDO_CHK()) != true) {
                		// *訂正ログ出力処理*
                		strUserId = getsysUSER_CD();            // ユーザーIDセット
                		strSyoriKbn = "3";                      // 処理区分セット(3:削除)
                		strDataKbn = "1";                       // 変更データ区分セット
                		// 訂正CSV出力処理(引数:対象行、対象データ、ユーザーID、処理区分、データ区分)
                		csvExportCorrection( structCsv, strUserId, strSyoriKbn, strDataKbn, bWrite );
                		bWrite = true;
                	}
                    
                    	// ■製品構成マスタ削除処理■
                    	entity.mdeleteM_PS.delete(conn, struct);

                    if (("true").equals(_save_struct.getDO_CHK()) != true) {
                    	// [SYSｼｰｹﾝｼｬﾙ番号]最大値の取得
                    	List listSeqNo = entity.mreadSYS_PS_T.read(conn, struct);
                    	if(listSeqNo.size() > 0) {
                    		// ■製品構成トランザクション登録処理■
                    		struct.seth_SEQ_NO(((AA0160010Struct)listSeqNo.get(0)).getreadMAXSEQ_NO()); // SYSｼｰｹﾝｼｬﾙ番号
                    		struct.seth_ACCESS_TYP("2");                                                // 処理方法(1:削除)
                    		struct.seth_CMPLT_FLG("0");                                                 // 完了ﾌﾗｸﾞ(0:未)
                    		entity.minsertSYS_PS_T.create(conn, struct);
                    	}
                    }
                }
            } // Endfor()
            // CSVファイルの行数LOOP
            int ErrlineNo = 0;          // エラー行番号
            String CsvCnt = "16";       // CSV項目
            String ErrItem = "";        // エラー項目
            String ErrItemWork1 = "";   // エラー項目1(項目編集用)
            String ErrItemWork2 = "";   // エラー項目2(項目編集用)
            String ErrItemWork3 = "";   // エラー項目3(項目編集用)
            String ErrCd = "";          // エラー区分
            String ErrNo = "";          // エラー番号
            String ErrMsg = "";         // エラーメッセージ
            // 多言語項目取得対応
            String locale = CoreTools.getLocale(sysUSER_CD);
            String property = "OrteusUserDic";           
            String key = "";            // 多言語辞書取得キー
            
            for(int i = 0; i < intCsvDataCount; i++)
            {
                // エラーフラグ初期化
                boolean bError = false;
                // CSV情報の取得
                structCsv = (AA0160010Struct)listCsv.get(i);
                try{
                	// 製品構成のルーピング検査・DBデータ
                	// 製品構成リポジトリ作成
                	ProductStructureRepository repository = new ProductStructureRepository(conn);
                	// 正展開の場合
                	checkRooping(repository, structCsv.geth_PARENT_ITEM_CD(), structCsv.geth_COMP_ITEM_CD());
                	// 逆展開の場合
                	checkReverseRooping(repository, structCsv.geth_COMP_ITEM_CD(), structCsv.geth_PARENT_ITEM_CD());
                } catch (PsLoopException ple) {
                    // 警告：構成情報に矛盾があります。
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                    
                    // 多言語キーセット
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItemWork1 = CoreTools.getRBString(key, resource);

                    // 多言語キーセット
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                    ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItemWork2 = CoreTools.getRBString(key, resource2);

                    // 多言語キーセット
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                    ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItemWork3 = CoreTools.getRBString(key, resource3);

                    // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                    ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "AA00055";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }
                try{
                	// 製品構成メンテナンス用オブジェクトを構築
                	_psMaint = new PsMaintenance(conn, getsysUSER_CD(), sp.getProcId(), strSysdate);

                	// 製品構成の品目手配区分検査(引数：親品目番号、子品目番号)
                	_psMaint.testMrpOrderType(structCsv.geth_PARENT_ITEM_CD(),structCsv.geth_COMP_ITEM_CD());

                } catch (PsMrpOdrTypException pmote) {
                	ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                
                	// 多言語キーセット
                	key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                	ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                	// 多言語項目取得セット
                	ErrItemWork1 = CoreTools.getRBString(key, resource);

                	// 多言語キーセット
                	key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                	ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                	// 多言語項目取得セット
                	ErrItemWork2 = CoreTools.getRBString(key, resource2);

                	// 多言語キーセット
                	key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                	ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                	// 多言語項目取得セット
                	ErrItemWork3 = CoreTools.getRBString(key, resource3);

                	// エラー項目編集(親品目番号+子品目番号+製品構成版数)
                	ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;

                	ErrCd = "1";                                    // エラー区分
                	ErrNo = "AA00052";                              // エラー番号
                	// メッセージ取得 
                	ExpjMessage emsg = new ExpjMessage(ErrNo);
                	ErrMsg = emsg.getMessage(locale);

                	// CSV出力(エラー)
                	csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                	// w_COLUMN_FLG変数にエラー情報を退避。
                	structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                	// エラーフラグ"true"にセット
                	bError = true;
                	// 次明細へ処理を移行
                	continue;
                } catch (NoDataException nde) {
                    // 警告：対象データが存在しません。
                    ErrlineNo = i + 1;                              // エラー発生行(実際のエラー行)
                    
                    // 多言語キーセット
                    key = "Expj.PARENT_ITEM_CD"; // Expj.PARENT_ITEM_CD=親品目番号
                    ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItemWork1 = CoreTools.getRBString(key, resource);

                    // 多言語キーセット
                    key = "Expj.COMP_ITEM_CD"; // Expj.COMP_ITEM_CD=子品目番号
                    ResourceBundle resource2 = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItemWork2 = CoreTools.getRBString(key, resource2);

                    // 多言語キーセット
                    key = "Expj.PS_EDITION"; // Expj.PS_EDITION=製品構成版数
                    ResourceBundle resource3 = CoreTools.getResourceBundle(property, locale);
                    // 多言語項目取得セット
                    ErrItemWork3 = CoreTools.getRBString(key, resource3);

                    // エラー項目編集(親品目番号+子品目番号+製品構成版数)
                    ErrItem = ErrItemWork1 + "," + ErrItemWork2 + "," + ErrItemWork3;


                    ErrCd = "1";                                    // エラー区分
                    ErrNo = "ZZ06001";                              // エラー番号
                    // メッセージ取得 
                    ExpjMessage emsg = new ExpjMessage(ErrNo);
                    ErrMsg = emsg.getMessage(locale);

                    // CSV出力(エラー)
                    csvExport( structCsv, ErrlineNo, ErrItem, ErrCd, ErrNo, ErrMsg, CsvCnt,CSV_COLNO_PARENT_ITEM_CD);
                    // w_COLUMN_FLG変数にエラー情報を退避。
                    structCsv.setw_COLUMN_FLG(String.valueOf(ErrlineNo));
                    // エラーフラグ"true"にセット
                    bError = true;
                    // 次明細へ処理を移行
                    continue;
                }
                // チェックエラーとなっていない場合、正常レコードとしてカウント
                if(bError != true){
                    intSuccessCount++;
                }
            }
            // チェック結果処理(エラーリストサイズの取得)
            if(getListsize() > 0)
            {
                bSuccess = false;
            }

            // エラーデータ存在時、画面ｲﾝﾌｫﾒｰｼｮﾝへ出力
            if(("true").equals(_save_struct.getDO_CHK()) == true)
            {
                    // エラーデータ有りのため更新しなかった場合のメッセージ表示
                    ExpjMessage emsg = new ExpjMessage( "AA01608",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                    msgStruct.addInfo( emsg );
                    sysLog.config(emsg, getsysUSER_CD());
                    return false;
            } else {
                    // エラーデータ存在時、画面ｲﾝﾌｫﾒｰｼｮﾝへ出力
                    if(bSuccess != true)
                    {
                        // エラー件数があればメッセージ表示する
                        // なければリスト(ワーニング)のみと判定する。
                        if ((intCsvDataCount - intSuccessCount) > 0)
                        {
                            // エラーデータ有りのため更新しなかった場合のメッセージ表示
                            ExpjMessage emsg = new ExpjMessage( "AA01607",""+intSuccessCount,""+(intCsvDataCount - intSuccessCount));
                            msgStruct.addError( emsg );
                            sysLog.severe(emsg, getsysUSER_CD());
                            return false;
                        }
                    } else {
                          // エラー・ワーニングがない場合
                            ExpjMessage emsg = new ExpjMessage( "AA01514", ""+intSuccessCount);
                            msgStruct.addInfo( emsg );
                            sysLog.config(emsg, getsysUSER_CD());
                    }
            }

            // コミット発行
            conn.commit();

            // DB更新中フラグOFF
            bDBUpdate = false;

            // 処理成功フラグ設定
            bSuccess = true;
        } catch(SQLException e) {
            //logMessage = "M.ITEM_CD:" +  struct.geth_ITEM_CD();
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

				if(("true").equals(_save_struct.getDO_CHK()) != true){
                	// 更新失敗のメッセージ表示
                	ExpjMessage emsg = new ExpjMessage( "AH00042", ""+intSuccessCount, ""+(intCsvDataCount - intSuccessCount));
                	msgStruct.addError( emsg );
                	sysLog.warning(emsg, getsysUSER_CD());
            	}
            }

            if(aSuccess == true)
            {
                if(bSuccess == true)
                {
                    // 正常終了のメッセージ表示
                    //ExpjMessage emsg = new ExpjMessage( "UA00030", ""+intCsvDataCount, "0");
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
    *   @param    strRangeFlg  "1"   : 99999999999999.9999 ～ 0.0001
    *                          "2"   : 99999.9999 ～ 0.0001
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

    /**
    *   日付チェック
    *   
    *   @param    strInString  入力パラメータ日付(####/##/##)
    *   @return 日付:true / 日付以外:false
    */
    public boolean StrDateChk(String strInput)
    {
        int intYear;    // 西暦年退避用
        int intMonth;   // 月退避用
        int intDay;     // 日退避用

        // 入力文字列が10桁('####/##/##')以外の場合エラー
        if (strInput.length() != 10)
        {
            return false;
        }

        // 日付の整数チェック、整数以外の場合エラー
        if(Calculate.isInteger(strInput.substring(0,4)) != true || 
            Calculate.isInteger(strInput.substring(5,7)) != true || 
            Calculate.isInteger(strInput.substring(8,10)) != true) 
        {
            return false;
        }

        // 入力パラメータ日付切り分け
        intYear = Integer.parseInt(strInput.substring(0,4));
        intMonth = Integer.parseInt(strInput.substring(5,7));
        intDay = Integer.parseInt(strInput.substring(8,10));

        Calendar cal = new GregorianCalendar();
        cal.setLenient( false );
        cal.set(intYear, intMonth-1, intDay);

        try
        {
            java.util.Date ud = cal.getTime();
        }
        catch(IllegalArgumentException iae)
        {
            // 日付以外場合Exceptionに飛ばして処理
            // falseをセットして処理を抜ける(エラー：日付以外の入力)
            return false;
        }
        // trueをセットして処理を抜ける(正常終了)
        return true;
    }

    /**
     * "yyyy/MM/dd"形式の日付文字列を比較します。
     * @param dateString1 日付文字列１
     * @param dateString2 日付文字列２
     * @return 日付文字列１ ＝ 日付文字列２ の場合は 0を戻す。日付文字列１ ＜ 日付文字列２ の場合は 0 より小さい値を戻す。日付文字列１ ＞ 日付文字列２ の場合は 0 より大きい値を戻す。
     * @throws ParseException パラメータが日付文字列ではない。
     */
    public int compareYMD(String dateString1, String dateString2) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

        Date date1 = sdf.parse(dateString1);
        Date date2 = sdf.parse(dateString2);

        return date1.compareTo(date2);
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
//---------- 入力関連チェックの処理 END---------------------------------------------------


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
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");
			//{{user_implement_dev:<controlCsvImport>
        // TODO: ユーザ定義のコードを記述してください


        // リストクリア
        if(null == list){
          list = new ArrayList();
      }else{
        list.clear();
      }
      if(null == PsList){
          PsList = new ArrayList();
      }else{
        PsList.clear();
      }
      
        // 親画面のstructを退避
        saveParentStruct();

        // サブ1画面初期化
        struct.clear();

                //}}user_implement_dev:<controlCsvImport>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvImport");

		return;
	}

	/**
	 * 参照ボタン押下時に実行される処理です。
	 *
	 */
	public void controlBrowse() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");
			//{{user_implement_dev:<controlBrowse>
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlBrowse>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlBrowse");

		return;
	}

	/**
	 * 取込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvIn() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");
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
      if(null == PsList){
          PsList = new ArrayList();
      }else{
        PsList.clear();
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
        if (bError != true)
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
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvIn");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlreturn_sub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");
			//{{user_implement_dev:<controlreturn_sub1>
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlreturn_sub1>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlreturn_sub1");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlclear");
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
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
            // TODO: ユーザ定義のコードを記述してください
      csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
    
      List csvList = new ArrayList();
      //CSV情報の作成
      // タイトル情報設定
      String csvTitle[] = {
        "Expj.Cmt3094" ,         // エラー箇所
        "Expj.PARENT_ITEM_CD" ,         // 親品目番号
        "Expj.COMP_ITEM_CD" ,         // 子品目番号
        "Expj.PS_EDITION" ,         // 製品構成版数
        "Expj.Cmt3097" ,         // エラー項目名
        "Expj.Cmt3098"           // エラー内容
           };
      // CSVリストに入れる
      csvList.add(csvTitle);
      
      AA0160010Struct workStruct;
      // 明細内容設定
      for(int i=0; i<getListsize() ;i++){
       workStruct = getListvalue(i);
       String csvStr [] = new String[csvTitle.length];
       csvStr[0] = workStruct.getERROR_IN();// エラー箇所
       csvStr[1] = workStruct.getPARENT_ITEM_CD();// 親品目番号
       csvStr[2] = workStruct.getCOMP_ITEM_CD();// 子品目番号
       csvStr[3] = workStruct.getPS_EDITION();// 製品構成版数
       csvStr[4] = workStruct.getERR_CTR_NM();// エラー項目名
       csvStr[5] = workStruct.getERR_INFO();// エラー内容
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
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
            // TODO: ユーザ定義のコードを記述してください

                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
            // TODO: ユーザ定義のコードを記述してください

        // クリア
        controlclear();

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AA0160");
		logger.entering("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AA0160010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
//			throw new FoundationException("AA0160010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0160010-E999","CSVの出力処理"));
			throw new FoundationException("AA0160010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0160010-E999","システム日付の取得処理"));
				throw new FoundationException("AA0160010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
            // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AA0160010-E999","コントロールのイベント処理"));
			throw new FoundationException("AA0160010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AA0160010Entity entity;
	protected AA0160010Struct struct;
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

		entity = new AA0160010Entity();
		struct = new AA0160010Struct();

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
	 * AA0160010クラスの標準コンストラクタ
	 */
	public AA0160010Control() throws BusinessProcessException, FoundationException
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
				AA0160010Struct key = (AA0160010Struct)keyList.get(j);
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
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("FileName") && key.getFileName() != null) {
					msgKey.setKeyValue("FileName", key.getFileName());
				}
				if(msgKeyType.containsKeyColumn("CANCEL_FILE") && key.getCANCEL_FILE() != null) {
					msgKey.setKeyValue("CANCEL_FILE", key.getCANCEL_FILE());
				}
				if(msgKeyType.containsKeyColumn("JUDGMENT_TXT") && key.getJUDGMENT_TXT() != null) {
					msgKey.setKeyValue("JUDGMENT_TXT", key.getJUDGMENT_TXT());
				}
				if(msgKeyType.containsKeyColumn("ERROR_IN") && key.getERROR_IN() != null) {
					msgKey.setKeyValue("ERROR_IN", key.getERROR_IN());
				}
				if(msgKeyType.containsKeyColumn("ERR_CTR_NM") && key.getERR_CTR_NM() != null) {
					msgKey.setKeyValue("ERR_CTR_NM", key.getERR_CTR_NM());
				}
				if(msgKeyType.containsKeyColumn("ERR_INFO") && key.getERR_INFO() != null) {
					msgKey.setKeyValue("ERR_INFO", key.getERR_INFO());
				}
				if(msgKeyType.containsKeyColumn("DO_CHK") && key.getDO_CHK() != null) {
					msgKey.setKeyValue("DO_CHK", key.getDO_CHK());
				}
				if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD") && key.getPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("PARENT_ITEM_CD", key.getPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("COMP_ITEM_CD") && key.getCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("COMP_ITEM_CD", key.getCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("PS_EDITION") && key.getPS_EDITION() != null) {
					msgKey.setKeyValue("PS_EDITION", key.getPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("w_COLUMN_FLG") && key.getw_COLUMN_FLG() != null) {
					msgKey.setKeyValue("w_COLUMN_FLG", key.getw_COLUMN_FLG());
				}
				if(msgKeyType.containsKeyColumn("readNAME") && key.getreadNAME() != null) {
					msgKey.setKeyValue("readNAME", key.getreadNAME());
				}
				if(msgKeyType.containsKeyColumn("readVALUE") && key.getreadVALUE() != null) {
					msgKey.setKeyValue("readVALUE", key.getreadVALUE());
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
				if(msgKeyType.containsKeyColumn("readPARENT_ITEM_CD") && key.getreadPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("readPARENT_ITEM_CD", key.getreadPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readCOMP_ITEM_CD") && key.getreadCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("readCOMP_ITEM_CD", key.getreadCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("readPS_EDITION") && key.getreadPS_EDITION() != null) {
					msgKey.setKeyValue("readPS_EDITION", key.getreadPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("setPARENT_ITEM_CD") && key.getsetPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("setPARENT_ITEM_CD", key.getsetPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setCOMP_ITEM_CD") && key.getsetCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("setCOMP_ITEM_CD", key.getsetCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setPS_EDITION") && key.getsetPS_EDITION() != null) {
					msgKey.setKeyValue("setPS_EDITION", key.getsetPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("readM_ITEM_ITEM_CD") && key.getreadM_ITEM_ITEM_CD() != null) {
					msgKey.setKeyValue("readM_ITEM_ITEM_CD", key.getreadM_ITEM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD") && key.getsetM_ITEM_ITEM_CD() != null) {
					msgKey.setKeyValue("setM_ITEM_ITEM_CD", key.getsetM_ITEM_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PARENT_ITEM_CD") && key.geth_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("h_PARENT_ITEM_CD", key.geth_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_COMP_ITEM_CD") && key.geth_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("h_COMP_ITEM_CD", key.geth_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("h_PS_EDITION") && key.geth_PS_EDITION() != null) {
					msgKey.setKeyValue("h_PS_EDITION", key.geth_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("h_PS_UNIT_DENOMINATOR") && key.geth_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("h_PS_UNIT_DENOMINATOR", key.geth_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("h_PS_UNIT_NUMERATOR") && key.geth_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("h_PS_UNIT_NUMERATOR", key.geth_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("h_EFF_PHASE_IN_DATE") && key.geth_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("h_EFF_PHASE_IN_DATE", key.geth_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_EFF_PHASE_OUT_DATE") && key.geth_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("h_EFF_PHASE_OUT_DATE", key.geth_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("h_PS_SPOIL") && key.geth_PS_SPOIL() != null) {
					msgKey.setKeyValue("h_PS_SPOIL", key.geth_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("h_CONS_TYP") && key.geth_CONS_TYP() != null) {
					msgKey.setKeyValue("h_CONS_TYP", key.geth_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_PS_LT_FLG") && key.geth_PS_LT_FLG() != null) {
					msgKey.setKeyValue("h_PS_LT_FLG", key.geth_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_PS_FIXED_LT") && key.geth_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("h_PS_FIXED_LT", key.geth_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PS_PROP_LT") && key.geth_PS_PROP_LT() != null) {
					msgKey.setKeyValue("h_PS_PROP_LT", key.geth_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("h_PS_PROP_LOT_SIZE") && key.geth_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("h_PS_PROP_LOT_SIZE", key.geth_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("h_PS_REF_NO") && key.geth_PS_REF_NO() != null) {
					msgKey.setKeyValue("h_PS_REF_NO", key.geth_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("h_COST_UP_TYP") && key.geth_COST_UP_TYP() != null) {
					msgKey.setKeyValue("h_COST_UP_TYP", key.geth_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_MRP_EXP_TYP") && key.geth_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("h_MRP_EXP_TYP", key.geth_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_PARENT_ITEM_CD") && key.getC_PARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("C_PARENT_ITEM_CD", key.getC_PARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_COMP_ITEM_CD") && key.getC_COMP_ITEM_CD() != null) {
					msgKey.setKeyValue("C_COMP_ITEM_CD", key.getC_COMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_PS_EDITION") && key.getC_PS_EDITION() != null) {
					msgKey.setKeyValue("C_PS_EDITION", key.getC_PS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("C_PS_UNIT_DENOMINATOR") && key.getC_PS_UNIT_DENOMINATOR() != null) {
					msgKey.setKeyValue("C_PS_UNIT_DENOMINATOR", key.getC_PS_UNIT_DENOMINATOR());
				}
				if(msgKeyType.containsKeyColumn("C_PS_UNIT_NUMERATOR") && key.getC_PS_UNIT_NUMERATOR() != null) {
					msgKey.setKeyValue("C_PS_UNIT_NUMERATOR", key.getC_PS_UNIT_NUMERATOR());
				}
				if(msgKeyType.containsKeyColumn("C_EFF_PHASE_IN_DATE") && key.getC_EFF_PHASE_IN_DATE() != null) {
					msgKey.setKeyValue("C_EFF_PHASE_IN_DATE", key.getC_EFF_PHASE_IN_DATE());
				}
				if(msgKeyType.containsKeyColumn("C_EFF_PHASE_OUT_DATE") && key.getC_EFF_PHASE_OUT_DATE() != null) {
					msgKey.setKeyValue("C_EFF_PHASE_OUT_DATE", key.getC_EFF_PHASE_OUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("C_PS_SPOIL") && key.getC_PS_SPOIL() != null) {
					msgKey.setKeyValue("C_PS_SPOIL", key.getC_PS_SPOIL());
				}
				if(msgKeyType.containsKeyColumn("C_CONS_TYP") && key.getC_CONS_TYP() != null) {
					msgKey.setKeyValue("C_CONS_TYP", key.getC_CONS_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_PS_LT_FLG") && key.getC_PS_LT_FLG() != null) {
					msgKey.setKeyValue("C_PS_LT_FLG", key.getC_PS_LT_FLG());
				}
				if(msgKeyType.containsKeyColumn("C_PS_FIXED_LT") && key.getC_PS_FIXED_LT() != null) {
					msgKey.setKeyValue("C_PS_FIXED_LT", key.getC_PS_FIXED_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PS_PROP_LT") && key.getC_PS_PROP_LT() != null) {
					msgKey.setKeyValue("C_PS_PROP_LT", key.getC_PS_PROP_LT());
				}
				if(msgKeyType.containsKeyColumn("C_PS_PROP_LOT_SIZE") && key.getC_PS_PROP_LOT_SIZE() != null) {
					msgKey.setKeyValue("C_PS_PROP_LOT_SIZE", key.getC_PS_PROP_LOT_SIZE());
				}
				if(msgKeyType.containsKeyColumn("C_PS_REF_NO") && key.getC_PS_REF_NO() != null) {
					msgKey.setKeyValue("C_PS_REF_NO", key.getC_PS_REF_NO());
				}
				if(msgKeyType.containsKeyColumn("C_COST_UP_TYP") && key.getC_COST_UP_TYP() != null) {
					msgKey.setKeyValue("C_COST_UP_TYP", key.getC_COST_UP_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_MRP_EXP_TYP") && key.getC_MRP_EXP_TYP() != null) {
					msgKey.setKeyValue("C_MRP_EXP_TYP", key.getC_MRP_EXP_TYP());
				}
				if(msgKeyType.containsKeyColumn("C_setPARENT_ITEM_CD") && key.getC_setPARENT_ITEM_CD() != null) {
					msgKey.setKeyValue("C_setPARENT_ITEM_CD", key.getC_setPARENT_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_setCOMP_ITEM_CD") && key.getC_setCOMP_ITEM_CD() != null) {
					msgKey.setKeyValue("C_setCOMP_ITEM_CD", key.getC_setCOMP_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("C_setPS_EDITION") && key.getC_setPS_EDITION() != null) {
					msgKey.setKeyValue("C_setPS_EDITION", key.getC_setPS_EDITION());
				}
				if(msgKeyType.containsKeyColumn("readMAXSEQ_NO") && key.getreadMAXSEQ_NO() != null) {
					msgKey.setKeyValue("readMAXSEQ_NO", key.getreadMAXSEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("h_SEQ_NO") && key.geth_SEQ_NO() != null) {
					msgKey.setKeyValue("h_SEQ_NO", key.geth_SEQ_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ACCESS_TYP") && key.geth_ACCESS_TYP() != null) {
					msgKey.setKeyValue("h_ACCESS_TYP", key.geth_ACCESS_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_CMPLT_FLG") && key.geth_CMPLT_FLG() != null) {
					msgKey.setKeyValue("h_CMPLT_FLG", key.geth_CMPLT_FLG());
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
					AA0160010Struct key = new AA0160010Struct();
					if(msgKeyType.containsKeyColumn("rdoInsert")) {
						key.setrdoInsert(msgKey.getKeyValue("rdoInsert"));
					}
					if(msgKeyType.containsKeyColumn("rdoUpdate")) {
						key.setrdoUpdate(msgKey.getKeyValue("rdoUpdate"));
					}
					if(msgKeyType.containsKeyColumn("rdoDelete")) {
						key.setrdoDelete(msgKey.getKeyValue("rdoDelete"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("FileName")) {
						key.setFileName(msgKey.getKeyValue("FileName"));
					}
					if(msgKeyType.containsKeyColumn("CANCEL_FILE")) {
						key.setCANCEL_FILE(msgKey.getKeyValue("CANCEL_FILE"));
					}
					if(msgKeyType.containsKeyColumn("JUDGMENT_TXT")) {
						key.setJUDGMENT_TXT(msgKey.getKeyValue("JUDGMENT_TXT"));
					}
					if(msgKeyType.containsKeyColumn("ERROR_IN")) {
						key.setERROR_IN(msgKey.getKeyValue("ERROR_IN"));
					}
					if(msgKeyType.containsKeyColumn("ERR_CTR_NM")) {
						key.setERR_CTR_NM(msgKey.getKeyValue("ERR_CTR_NM"));
					}
					if(msgKeyType.containsKeyColumn("ERR_INFO")) {
						key.setERR_INFO(msgKey.getKeyValue("ERR_INFO"));
					}
					if(msgKeyType.containsKeyColumn("DO_CHK")) {
						key.setDO_CHK(msgKey.getKeyValue("DO_CHK"));
					}
					if(msgKeyType.containsKeyColumn("PARENT_ITEM_CD")) {
						key.setPARENT_ITEM_CD(msgKey.getKeyValue("PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("COMP_ITEM_CD")) {
						key.setCOMP_ITEM_CD(msgKey.getKeyValue("COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("PS_EDITION")) {
						key.setPS_EDITION(msgKey.getKeyValue("PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("w_COLUMN_FLG")) {
						key.setw_COLUMN_FLG(msgKey.getKeyValue("w_COLUMN_FLG"));
					}
					if(msgKeyType.containsKeyColumn("readNAME")) {
						key.setreadNAME(msgKey.getKeyValue("readNAME"));
					}
					if(msgKeyType.containsKeyColumn("readVALUE")) {
						key.setreadVALUE(msgKey.getKeyValue("readVALUE"));
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
					if(msgKeyType.containsKeyColumn("readPARENT_ITEM_CD")) {
						key.setreadPARENT_ITEM_CD(msgKey.getKeyValue("readPARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readCOMP_ITEM_CD")) {
						key.setreadCOMP_ITEM_CD(msgKey.getKeyValue("readCOMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("readPS_EDITION")) {
						key.setreadPS_EDITION(msgKey.getKeyValue("readPS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("setPARENT_ITEM_CD")) {
						key.setsetPARENT_ITEM_CD(msgKey.getKeyValue("setPARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setCOMP_ITEM_CD")) {
						key.setsetCOMP_ITEM_CD(msgKey.getKeyValue("setCOMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setPS_EDITION")) {
						key.setsetPS_EDITION(msgKey.getKeyValue("setPS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("readM_ITEM_ITEM_CD")) {
						key.setreadM_ITEM_ITEM_CD(msgKey.getKeyValue("readM_ITEM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("setM_ITEM_ITEM_CD")) {
						key.setsetM_ITEM_ITEM_CD(msgKey.getKeyValue("setM_ITEM_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PARENT_ITEM_CD")) {
						key.seth_PARENT_ITEM_CD(msgKey.getKeyValue("h_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_COMP_ITEM_CD")) {
						key.seth_COMP_ITEM_CD(msgKey.getKeyValue("h_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_EDITION")) {
						key.seth_PS_EDITION(msgKey.getKeyValue("h_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_UNIT_DENOMINATOR")) {
						key.seth_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("h_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_UNIT_NUMERATOR")) {
						key.seth_PS_UNIT_NUMERATOR(msgKey.getKeyValue("h_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("h_EFF_PHASE_IN_DATE")) {
						key.seth_EFF_PHASE_IN_DATE(msgKey.getKeyValue("h_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_EFF_PHASE_OUT_DATE")) {
						key.seth_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("h_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_SPOIL")) {
						key.seth_PS_SPOIL(msgKey.getKeyValue("h_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("h_CONS_TYP")) {
						key.seth_CONS_TYP(msgKey.getKeyValue("h_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_LT_FLG")) {
						key.seth_PS_LT_FLG(msgKey.getKeyValue("h_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_FIXED_LT")) {
						key.seth_PS_FIXED_LT(msgKey.getKeyValue("h_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_PROP_LT")) {
						key.seth_PS_PROP_LT(msgKey.getKeyValue("h_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_PROP_LOT_SIZE")) {
						key.seth_PS_PROP_LOT_SIZE(msgKey.getKeyValue("h_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("h_PS_REF_NO")) {
						key.seth_PS_REF_NO(msgKey.getKeyValue("h_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_COST_UP_TYP")) {
						key.seth_COST_UP_TYP(msgKey.getKeyValue("h_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_MRP_EXP_TYP")) {
						key.seth_MRP_EXP_TYP(msgKey.getKeyValue("h_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_PARENT_ITEM_CD")) {
						key.setC_PARENT_ITEM_CD(msgKey.getKeyValue("C_PARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_COMP_ITEM_CD")) {
						key.setC_COMP_ITEM_CD(msgKey.getKeyValue("C_COMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_EDITION")) {
						key.setC_PS_EDITION(msgKey.getKeyValue("C_PS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_UNIT_DENOMINATOR")) {
						key.setC_PS_UNIT_DENOMINATOR(msgKey.getKeyValue("C_PS_UNIT_DENOMINATOR"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_UNIT_NUMERATOR")) {
						key.setC_PS_UNIT_NUMERATOR(msgKey.getKeyValue("C_PS_UNIT_NUMERATOR"));
					}
					if(msgKeyType.containsKeyColumn("C_EFF_PHASE_IN_DATE")) {
						key.setC_EFF_PHASE_IN_DATE(msgKey.getKeyValue("C_EFF_PHASE_IN_DATE"));
					}
					if(msgKeyType.containsKeyColumn("C_EFF_PHASE_OUT_DATE")) {
						key.setC_EFF_PHASE_OUT_DATE(msgKey.getKeyValue("C_EFF_PHASE_OUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_SPOIL")) {
						key.setC_PS_SPOIL(msgKey.getKeyValue("C_PS_SPOIL"));
					}
					if(msgKeyType.containsKeyColumn("C_CONS_TYP")) {
						key.setC_CONS_TYP(msgKey.getKeyValue("C_CONS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_LT_FLG")) {
						key.setC_PS_LT_FLG(msgKey.getKeyValue("C_PS_LT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_FIXED_LT")) {
						key.setC_PS_FIXED_LT(msgKey.getKeyValue("C_PS_FIXED_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_PROP_LT")) {
						key.setC_PS_PROP_LT(msgKey.getKeyValue("C_PS_PROP_LT"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_PROP_LOT_SIZE")) {
						key.setC_PS_PROP_LOT_SIZE(msgKey.getKeyValue("C_PS_PROP_LOT_SIZE"));
					}
					if(msgKeyType.containsKeyColumn("C_PS_REF_NO")) {
						key.setC_PS_REF_NO(msgKey.getKeyValue("C_PS_REF_NO"));
					}
					if(msgKeyType.containsKeyColumn("C_COST_UP_TYP")) {
						key.setC_COST_UP_TYP(msgKey.getKeyValue("C_COST_UP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_MRP_EXP_TYP")) {
						key.setC_MRP_EXP_TYP(msgKey.getKeyValue("C_MRP_EXP_TYP"));
					}
					if(msgKeyType.containsKeyColumn("C_setPARENT_ITEM_CD")) {
						key.setC_setPARENT_ITEM_CD(msgKey.getKeyValue("C_setPARENT_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_setCOMP_ITEM_CD")) {
						key.setC_setCOMP_ITEM_CD(msgKey.getKeyValue("C_setCOMP_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("C_setPS_EDITION")) {
						key.setC_setPS_EDITION(msgKey.getKeyValue("C_setPS_EDITION"));
					}
					if(msgKeyType.containsKeyColumn("readMAXSEQ_NO")) {
						key.setreadMAXSEQ_NO(msgKey.getKeyValue("readMAXSEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_SEQ_NO")) {
						key.seth_SEQ_NO(msgKey.getKeyValue("h_SEQ_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ACCESS_TYP")) {
						key.seth_ACCESS_TYP(msgKey.getKeyValue("h_ACCESS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_CMPLT_FLG")) {
						key.seth_CMPLT_FLG(msgKey.getKeyValue("h_CMPLT_FLG"));
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
