/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AZ0040/src/com/nec/jp/orteus/metamorBase/AZ0040/AZ0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AZ0040;

import com.nec.jp.orteus.metamorBase.AZ0040.*;
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
import com.nec.jp.orteus.metamorBase.common01.db.DBErrorMessage;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import java.util.ArrayList;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : AZ0040010Control クラス
 * ファイル・クラス説明
 * @author $Author: shan-xiuqin $
 * @version $Revision: 1.18 $ $Date: 2017/01/09 08:54:38 $
 *
 */
//}}user_implement_code_header

public class AZ0040010Control
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
	public AZ0040010Struct getListvalue(int x) { return (AZ0040010Struct)(this.list.get(x)); }	// リストの値を返します。
	public AZ0040010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public AZ0040010Struct createStruct() { return new AZ0040010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((AZ0040010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	// TODO: ユーザ定義のコードを記述してください

               //------------------------------------------------------------------------------
              
               /** モード */
               private String _mode = null;
              
               /** モードの取得
                * @return モード
               */
               public String getMode(){ return _mode; }
              
               /** モードの設定
                * @param mode モード
               */
               public void setMode(String mode){ _mode = mode; }
              
               /** 画面モード 検索処理 */
               private final static String _SELECT = "select";
              
               /** 画面モード 検索処理（読込結果が０件) */
               private final static String _SELECT_WARNING = "select_war";
              
               /** 画面モード 検索/閉じる以外の処理 */
               private final static String _NORMAL = "normal";
              
               /** 画面モード 閉じる処理 */
               private final static String _CLOSE = "close";
              
               //------------------------------------------------------------------------------
               /** クエリー情報リスト */
               private ArrayList _deployList = new ArrayList(0);
              
               /** クエリー情報リスト取得
                * @return クエリー情報リスト
               */
               public ArrayList getDeployList(){ return _deployList; }
              
               //------------------------------------------------------------------------------
               /** SQL文解析クラス変数　*/
               private AZ0040SQLEdit w_sqle = null;
              
               //------------------------------------------------------------------------------
                
               /** SQLException発生か判定するフラグ
                * servletで参照、クリアを行う
                * controlではreload時にクリアする
               */
               public boolean _sqlexception_flg = false;
              
               //------------------------------------------------------------------------------
               /** テーブル選択画面で選択されたテーブル数を保持する
                * servletで設定、参照を行う
                * controlでreload時にクリアする
               */
               public int _table_cnt = 0;
              
               //------------------------------------------------------------------------------
               /** SQL文保存エリア　*/
               private String Saved_Sql = null;
              
               /** 条件設定情報リスト */
               private AZ0040ColumnData w_cdata = null;
              
               /** 条件設定情報リスト取得
                * @return 条件設定情報リスト
               */
               public AZ0040ColumnData getConditionList(){ return w_cdata; }
              
               /** 条件設定画面表示用データリスト */
               private ArrayList _ColumnList = new ArrayList(0);
              
               /** 条件設定画面表示用データリスト取得
                * @return 条件設定画面表示用データリスト
               */
               public List getColumnList(){ return _ColumnList; }
              
               //------------------------------------------------------------------------------
              
               // 追加/更新対象の構成情報No
               private Integer _checkNo = null;
               
               /** 追加/更新対象の構成情報No取得
                * @return 構成情報No
               */
               public Integer getCheckNumber(){ return _checkNo; }
              
               /** 追加/更新対象の構成情報No設定
                * @param 追加/更新対象の構成情報No
               */
               public void setCheckNumber(Integer no){ _checkNo = no; }
              
              
               /** 子⇒親に画面遷移した場合のキー情報保持の為のStruct */
               private AZ0040010Struct _keyStruct = new AZ0040010Struct();
              
               /** キー情報Structの取得 */
               public  AZ0040010Struct getKeyStruct(){ return _keyStruct; }
               
               /** キー情報Structの設定 */
               public void setKeyStruct(AZ0040010Struct struct){ _keyStruct.copy(struct); }
              
              
               /** 親⇒子に画面遷移した場合の選択情報Struct **/
               private AZ0040010Struct _selStruct = new AZ0040010Struct();
              
               /** 選択情報Structの取得 */
               public  AZ0040010Struct getSelStruct(){ return _selStruct; }
              
               /** 選択情報Structの設定 */
               public void setSelStruct(AZ0040010Struct struct){ _selStruct.copy(struct); }
              
               //------------------------------------------------------------------------------
              
               /** 項目名リスト **/
               private List _l_QUERY_COLUMN = new ArrayList();
               /** 項目名リストの取得 */
               public  List getsub2Name(){ return _l_QUERY_COLUMN; }
              
               /** 項目タイプリスト **/
               private List _l_QUERY_COLUMN_TYP = new ArrayList();
               /** 項目タイプリストの取得 */
               public  List getsub2Type(){ return _l_QUERY_COLUMN_TYP; }
              
               /** データリスト **/
               private List _l_QUERY_DATA = new ArrayList();
               /** データリストの取得 */
               public  List getsub2Data(){ return _l_QUERY_DATA; }
              
               private String	_w_DATA[];
              
               //------------------------------------------------------------------------------
                
               private ComboStruct _EDIT_TYP = new ComboStruct();
              
               /** 区分情報設定
                * @param コンボボックスデータ
               */
               public void setEdit_Typ(ComboStruct combo){ _EDIT_TYP = combo; }
              
               /** 区分情報取得
                * @return 区分情報のコンボボックスデータ
               */
               public ComboStruct getEdit_Typ(){ return _EDIT_TYP; }
              
               //------------------------------------------------------------------------------
              
               /** テーブル一覧リスト **/
               private ArrayList _l_TABLE_LIST = new ArrayList();
               /** テーブル一覧リスト取得 **/
               public ArrayList getSub1Data(){ return _l_TABLE_LIST; }
              
               /** テーブル一覧リスト **/
               private ArrayList _l_TABLE_COM_LIST = new ArrayList();
               /** テーブル一覧リスト取得 **/
               public ArrayList getSub1CommentData(){ return _l_TABLE_COM_LIST; }
              
               /** 選択テーブル設定 **/
               public void setColData(List tablList, List commentList)
               {
                w_cdata.Table_Names = tablList;
                w_cdata.Table_Name_Comments = commentList;
               }
              
               //-------------------------------------------------------------------------
               /**
                * 一般検索のフラグの表示を設定
                * @param s フラグの値が設定されている情報
                */
               private void setTypeValueAboutProcGroup(AZ0040010Struct s)
               {
                s.setEDIT_NAME(getTypeName(_EDIT_TYP,s.getEDIT_TYP()));
               }
                
               //-------------------------------------------------------------------------
               /**
                * 区分名取得
                * @param comboStruct 区分情報リスト
                * @param intType 区分コード
                * @return 区分名称。該当するデータがなかった場合は区分コードを返す
                */
               private String getTypeName(ComboStruct comboStruct, String strTyp)
               {
                if(comboStruct == null || strTyp == null)  return null;
                String strTypName = strTyp;
                for(int i = 0; i < comboStruct.getValList().size(); i++){
                 if(strTyp.equals((String)(comboStruct.getValList().get(i))) == true){
                  strTypName = (String)(comboStruct.getExplanList().get(i));
                  break;
                 }
                }
                if(strTypName == null) strTypName = strTyp;
                return strTypName;
               }
                
               //-------------------------------------------------------------------------
                
               /** テーブル名、カラム名コメント取得用クラス **/
              
               /** DBInfoクラスの取得 **/
               public AZ0040DBInfo getDBinfo(String tablename)
               {
                AZ0040DBInfo dbinfo = w_sqle.getDBUtil().getDBInfo(tablename);
              
                return dbinfo;
               }
              
               /** DBUtilクラスの取得 **/
               public AZ0040DBUtil getDBUtil()
               {
                AZ0040DBUtil dbutil = w_sqle.getDBUtil();
              
                return dbutil;
               }
              
               /** テーブルコメントの取得 **/
               public String getDBUtilToTableComment(String tablename)
               {
                String tablecomment = w_sqle.getDBUtil().getTableComment(tablename);
                return tablecomment;
               }
               
               /** カラムコメントの取得 **/
               public String getDBUtilToColumnComment(String tablename, String column)
               {
                String columncomment = w_sqle.getDBUtil().getColumnComment(tablename, column);
                return columncomment;
               }
              
               //------------------------------------------------------------------------------
              
               private AZ0040ModeCheck modeCheck = new AZ0040ModeCheck();
               public boolean canReference(){ return modeCheck.canReference(); }
               public boolean isInsert(){ return modeCheck.isInsert(); }
               public boolean isUpdate(){ return modeCheck.isUpdate(); }
               public boolean isCopy(){ return modeCheck.isCopy(); }
               public boolean isFree(){ return modeCheck.isFree(); }
               public boolean isNew(){ return modeCheck.isNew(); }
              
               public boolean cansub1SelectItem(){ return modeCheck.isnotREF(); }
               public boolean cansub2Condition(){ return modeCheck.isGUI(); }
               public boolean cansub2InputTitle(){ return modeCheck.isnotREF(); }
               public boolean canSub7Insert(){ return modeCheck.isInsert(); }
               public boolean canSub7Copy(){ return modeCheck.isCopy(); }
               public boolean canSub7Update(){ return modeCheck.isUpdate(); }
              
               //--------------------------------------------------------------------------
               // 各画面に遷移する前に実行するメソッド群
               /**
                * 指定したSQL文で検索実行。
                * 画面用の情報にセットする。
                */
               private void getDatafromSQL(String i_sql) throws FoundationException, SQLException
               {
                String Message = "";
              
                // クリア処理
                _l_QUERY_COLUMN.clear();
                _l_QUERY_COLUMN_TYP.clear();
                _l_QUERY_DATA.clear();
             
                // 一般検索（一覧表示件数メンテナンス）のSQL文取得件数制限
                i_sql = "SELECT * FROM(" + i_sql + "\n" +
                        ") WHERE ROWNUM <= NVL((SELECT MAX_DISPLAY_ROWNUM FROM SYS_SCREEN_PARM WHERE SERVLET_CD = 'AZ0040010' AND DISPLAY_CD = 50) , 1000) + 1";
                
                //汎用データ検索クラス生成
                AZ0040DBData azDBData = new AZ0040DBData(conn, i_sql);
                boolean bret = azDBData.load();
              
                if (bret == false) {
                 Message = "SQL:" + i_sql;
                 setErrorMessageNoKey("AZ00014", Message);
                 return;
                }
                //表示最大行数制限処理
                ScreenParam sp = new ScreenParam(this.getClass());
                int maxLine = sp.getMaxLine(conn,50);
              
                //データの取得
                _l_QUERY_DATA = (List)azDBData.getData();
              
                // 検索結果が表示最大行数を超える
                if (maxLine != 0 && _l_QUERY_DATA.size() > maxLine) {
                 _l_QUERY_DATA.clear();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                 msgStruct.addError( emsg );
                 sysLog.warning(emsg, getsysUSER_CD());
                 return;
                }
              
                // 検索結果が０件
                if(_l_QUERY_DATA.size() <= 0){
                 Message = "SQL:" + i_sql;
                 setErrorMessageNoKey("ZZ06001", Message);
                 return;
                }
              
                //カラム名のSQL型取得
                _l_QUERY_COLUMN_TYP = azDBData.getColTypes();
              
                // フリー入力の場合はカラム名を取得
                if(isFree()){
                 _l_QUERY_COLUMN = azDBData.getColNames();
                } else {
                 // カラム情報を取得
                 List w_columnInfos = new ArrayList();
                 w_columnInfos = w_cdata.getColumnInfos();
              
                 for(Iterator itr = w_columnInfos.iterator();itr.hasNext();) {
                  AZ0040ColumnInfo w_info = (AZ0040ColumnInfo)itr.next();
                  if(w_info.Display_Flg)
                   _l_QUERY_COLUMN.add(w_info.Column_Name_Comment);
                 }
                }
               }
              
               /**
                * AZ0040ColumnDataを元にSQL文を生成する
                */
               private void makeSQLfromCData(int mode) throws SQLException
               {
                // SQL文の生成
                AZ0040SQLCreate w_create = new AZ0040SQLCreate(sysLog, getsysUSER_CD());
                w_create.Create(conn, (AZ0040ColumnData)w_cdata, mode);
                Saved_Sql = w_create.getSQL();
               }
              
               //------------------------------------------------------------------------------
              
               /**
                * テーブル選択画面に遷移するときの処理
                */
               private void preSetSelectTable() throws SQLException
               {
                String Message = "";
                
                // hiddenListをクリア
                struct.clearList();
              
                // 行追加(ＧＵＩ)の場合は何もしない
                if(isInsert()) {
                 return;
                }
              
                // SQL文を保存していない場合は 初めての条件設定。
                // 一覧リストから該当のSQLを取得し 解析
                if(Saved_Sql == null){
                 // 選択されたSQL
                 String strsql;
              
                 // 選択情報の設定
                 setSelStruct((AZ0040010Struct)_deployList.get(getCheckNumber().intValue()));
                 // 選択されたSQLの取得
                 strsql = (String)(_selStruct.getSQL_INFO());
                 // SQLを保存エリアに退避
                 Saved_Sql = strsql;
              
                 if((strsql == null)||("".equals(strsql))){
                  //SQLが選択されていない
                  Message = "SQL:" + strsql;
                  setErrorMessageNoKey("AZ00011", Message);
                  return;
                 }
              
                 // 取得したSQL文の分解
                 if(w_sqle == null){
                  w_sqle = new AZ0040SQLEdit(sysLog, getsysUSER_CD());
              
                  if(w_sqle.Analize(conn, strsql)){
                   // 分解されたSQLデータテーブルの取得
                   w_cdata = w_sqle.getColumnData();
                   // 分解されたSQLデータテーブルから画面表示用データへの変換
                  } else {
                   // SQL解析エラー
                   Message = "SQL:" + strsql;
                   setErrorMessageNoKey("AZ00011", Message);
                   return;
                  }
                 }
                }
              
                struct.setList_h_TABLE_COMMENT_TO(w_cdata.getTableComments());
                struct.setList_h_TABLE_TO(w_cdata.getTableNames());
              
                return;
               }
              
              
               /**
                * 結合条件設定画面から遷移するときの処理
                */
               private void postSetJoin() throws SQLException
               {
                if(w_sqle == null){
                 return;
                }
              
                // 結合条件画面の情報でColumnDataを再構築する
                if(!w_sqle.setJoinInfo(struct.getList_h_LEFT_TABLE_NAME(),
                        struct.getList_h_LEFT_TABLE_ALIAS(),
                        struct.getList_h_LEFT_COLUMN(),
                        struct.getList_h_RIGHT_TABLE_NAME(),
                        struct.getList_h_RIGHT_TABLE_ALIAS(),
                        struct.getList_h_RIGHT_COLUMN(),
                        struct.getList_h_CONDITION()))
                return;
               }
              
              
               /**
                * 項目選択画面に遷移するときの処理
                */
               private void preSetSelectItem() throws SQLException
               {
                // テーブルコメント、カラムコメント、カラム属性を設定する
                int infosize = w_cdata.Column_infos.size();
              
                List l_col = new ArrayList(infosize);
                List l_alias = new ArrayList(infosize);
                List l_name = new ArrayList(infosize);
              
                for(int cnt=0; cnt<infosize; cnt++)
                {
                 AZ0040ColumnInfo col_info = (AZ0040ColumnInfo)w_cdata.Column_infos.get(cnt);
                 l_col.add(col_info.getColumn_Name());
                 l_alias.add(col_info.getTable_Name_Alias());
                 l_name.add(col_info.getTable_Name());
                }
                struct.setList_h_COLUMN(l_col);
                struct.setList_h_TABLE_ALIAS(l_alias);
                struct.setList_h_TABLE_NAME(l_name);
              
               }
              
              
               /**
                * 項目選択画面から遷移するときの処理
                */
               private void postSetSelectItem() throws SQLException
               {
                // 入力データの取り込み
                w_sqle.renewColumnInfos(struct.getList_h_TABLE_NAME(),
                      struct.getList_h_TABLE_ALIAS(),
                      struct.getList_h_COLUMN());
               }
              
              
               /**
                * 検索条件設定画面に遷移するときの処理
                */
               private void preSetCondition() throws SQLException
               {
                String Message = "";
                
                // 行追加(GUI)以外は選択されたクエリを元に検索条件を生成
                if(!isNew()){
                 // SQL文を保存していない場合は 初めての条件設定。
                 // 一覧リストから該当のSQLを取得し 解析
                 if(Saved_Sql == null){
                  // 選択されたSQL
                  String strsql;
              
                  // 選択情報の設定
                  setSelStruct((AZ0040010Struct)_deployList.get(getCheckNumber().intValue()));
                  // 選択されたSQLの取得
                  strsql = (String)(_selStruct.getSQL_INFO());
                  // SQLを保存エリアに退避
                  Saved_Sql = strsql;
              
                  if((strsql == null)||("".equals(strsql))){
                   //SQLが選択されていない
                   Message = "SQL:" + strsql;
                   setErrorMessageNoKey("AZ00011", Message);
                   
                   return;
                  }
              
                  // 取得したSQL文の分解
                  if(w_sqle == null){
                   w_sqle = new AZ0040SQLEdit(sysLog, getsysUSER_CD());
              
                   if(w_sqle.Analize(conn, strsql)){
                    // 分解されたSQLデータテーブルの取得
                    w_cdata = w_sqle.getColumnData();
                    // 分解されたSQLデータテーブルから画面表示用データへの変換
                   } else {
                    // SQL解析エラー
                    Message = "SQL:" + strsql;
                    setErrorMessageNoKey("AZ00011", Message);
                    return;
                   }
                  }
                 }
                }
              
                // ColumnInfo -> 条件設定画面表示用データ変換
                _ColumnList.clear();
                List list = w_cdata.getColumnInfos();
              
                for(int cnt = 0; cnt < list.size(); cnt++)
                { 
                 AZ0040010Struct w_struct = new AZ0040010Struct();
                 w_struct.importColumnInfo((AZ0040ColumnInfo)list.get(cnt));
                 _ColumnList.add(w_struct);
                }
              
                return;
               }
              
               /** 条件設定画面表示用データ -> ColumnInfo変換
                *  検索条件設定画面から遷移するときの処理
               */
               private void postSetCondition(){
                List list = w_cdata.getColumnInfos();
                AZ0040010Struct w_struct = null;
              
                for(int cnt = 0; cnt < list.size(); cnt++)
                { 
                 w_struct = (AZ0040010Struct)_ColumnList.get(cnt);
                 w_struct.exportColumnInfo((AZ0040ColumnInfo)list.get(cnt));
                }
               }
              
               /**
                * クエリ一覧画面に遷移するときの処理
                * 各内部変数のクリア＆クエリ一覧再読込
                */
               private void preQueryList() throws BusinessProcessException, FoundationException, SQLException
               {
                Saved_Sql = null;
                _l_QUERY_COLUMN.clear();
                _l_QUERY_COLUMN_TYP.clear();
                _l_QUERY_DATA.clear();
                _ColumnList.clear();
                struct.clear();
                struct.copy(_keyStruct);
                controlselect();
                _selStruct.clear();
                w_sqle = null;
                w_cdata = null;
                modeCheck.initialize();
              
                return;
               }
              
              
               //------------------------------------------------------------------------------
               /** 画面共通定義取得クラス */
               ScreenParam _scParam = sp;
              
               //------------------------------------------------------------------------------
              
               /**
                * メッセージ取得 
                * @@return メッセージ
                */
               public MessageStruct getMessage()
               {
                return msgStruct;
               }
              
               /**
                * メッセージ設定
                * @@param メッセージ
                */
               public void setMessage(MessageStruct msg)
               {
                msgStruct = msg;
               }
              
               //------------------------------------------------------------------------------
              
               /** 抽出条件 **/
               ComboStruct _sub1COND_TYPE = new ComboStruct();
              
               /** 抽出条件設定
                * @param コンボボックスデータ
               */
               public void setsub1COND_TYPE(ComboStruct combo){ _sub1COND_TYPE = combo; }
              
               /** 抽出条件取得
                * @return 抽出条件のコンボボックスデータ
               */
               public ComboStruct getsub1COND_TYPE(){ return _sub1COND_TYPE; }
              
               /** 並び替え **/
               ComboStruct _sub1SORT_TYPE = new ComboStruct();
              
               /** 並び替え設定
                * @param コンボボックスデータ
               */
               public void setsub1SORT_TYPE(ComboStruct combo){ _sub1SORT_TYPE = combo; }
              
               /** 並び替え取得
                * @return 並び替えのコンボボックスデータ
               */
               public ComboStruct getsub1SORT_TYPE(){ return _sub1SORT_TYPE; }
              
               //------------------------------------------------------------------------------
              
               private List csvList = null;
               public List getCsvList(){ return this.csvList; }
               //------------------------------------------------------------------------------
                
               /**
                * SQLExceptionエラーメッセージ設定
                * @param SQLException
                * @param 出力エラーメッセージ
                */
               private void setSqlExceptionMsg(SQLException e) throws ExpjException
               {
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
              
                 throw ee;
               }
              
               /**
                * SQLExceptionエラーメッセージ設定
                * @param 出力エラーメッセージ
                */
               private void setSqlExceptionMsg(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
               }
              
               /**
                * エラーメッセージ設定
                * @param メッセージ番号
                * @param 出力メッセージ
                */
               private void setErrorMessage(String messageno, String message)
               {
                ExpjMessage emsg = new ExpjMessage( messageno );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
                emsg = new ExpjMessage( "ZZ01006", message );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
               }
              
               /**
                * エラーメッセージ設定
                * @param メッセージ番号
                * @param 出力メッセージ(List)
                */
               private void setErrorMessage(String messageno, List message)
               {
                ExpjMessage emsg = new ExpjMessage( messageno );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
                
                for(int i=0; i<message.size(); i++)
                {
                 emsg = new ExpjMessage( "ZZ01006", (String)message.get(i) );
                 msgStruct.addError( emsg );
                 sysLog.warning(emsg, getsysUSER_CD());
                }
               }
                
               /**
                * エラーメッセージ設定
                * @param ログ出力メッセージ
                */
               private void setErrorLogMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                sysLog.warning(emsg, getsysUSER_CD());
               }
                
               /**
                * エラーメッセージ設定(キー出力なし)
                * @param メッセージ番号
                * @param 出力メッセージ
                */
               private void setErrorMessageNoKey(String messageno, String message)
               {
                ExpjMessage emsg = new ExpjMessage( messageno );
                msgStruct.addError( emsg );
                sysLog.warning(emsg, getsysUSER_CD());
                emsg = new ExpjMessage( "ZZ01006", message );
                sysLog.warning(emsg, getsysUSER_CD());
               }
                
               /**
                * 警告メッセージ設定
                * @param メッセージ番号
                * @param 出力メッセージ
                */
               private void setWarnMessage(String messageno, String message)
               {
                ExpjMessage emsg = new ExpjMessage( messageno );
                msgStruct.addWarn( emsg );
                sysLog.info(emsg, getsysUSER_CD());
               }
              
               /**
                * 警告メッセージ設定
                * @param 出力メッセージ
                */
               private void setWarnMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                msgStruct.addWarn( emsg );
                sysLog.info(emsg, getsysUSER_CD());
               }
              
               /**
                * 警告メッセージ設定
                * @param ログ出力メッセージ
                */
               private void setWarnLogMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                sysLog.info(emsg, getsysUSER_CD());
               }
                
               /**
                * 情報メッセージ設定
                * @param メッセージ番号
                * @param 出力メッセージ
                */
               private void setInfoMessage(String messageno, String message)
               {
                ExpjMessage emsg = new ExpjMessage( messageno );
                msgStruct.addInfo( emsg );
                sysLog.config(emsg, getsysUSER_CD());
               }
              
               /**
                * 情報メッセージ設定
                * @param 出力メッセージ
                */
               private void setInfoMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                msgStruct.addInfo( emsg );
                sysLog.config(emsg, getsysUSER_CD());
               }
                
               /**
                * 情報メッセージ設定
                * @param ログ出力メッセージ
                */
               private void setInfoLogMessage(String message)
               {
                ExpjMessage emsg = new ExpjMessage( "ZZ01006", message );
                sysLog.config(emsg, getsysUSER_CD());
               }
              
               //------------------------------------------------------------------------------

        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ユーザ定義のコードを記述してください

                             String Message = "";
                             List listMessage = new ArrayList();
                           
                             try {
                              _deployList.clear();
                              // モード設定
                              _mode = _NORMAL;
                           
                              // ユーザコード設定
                              struct.setw_USER_CD(getsysUSER_CD());
                           
                              // 読込ボタン処理
                              list = entity.mT_QUERY_INFO.read(conn, struct);
                           
                              // 明細リスト表示が存在するか?
                              if(list.size() > 0){
                           
                               // 表示最大行数制限処理
                               ScreenParam sp = new ScreenParam(this.getClass());
                               int maxLine = sp.getMaxLine(conn,10);
                           
                               if(maxLine != 0 && list.size() > maxLine){
                                list.clear();
                           
                                ExpjMessage emsg = new ExpjMessage( "ZZ01115", ""+maxLine );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.QUERY_NAME:" + struct.getw_QUERY_NAME() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.QUERY_GROUP:" + struct.getw_QUERY_GROUP() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.MEMO:" + struct.getw_MEMO() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.CREATED_BY:" + struct.getw_CREATED_BY() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.CREATED_DATE[FROM]:" + struct.getw_CREATED_DATE_FROM() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                emsg = new ExpjMessage( "ZZ01006", "T_QUERY_INFO.CREATED_DATE[TO]:" + struct.getw_CREATED_DATE_TO() );
                                msgStruct.addError( emsg );
                                sysLog.warning(emsg, getsysUSER_CD());
                                
                                // モード設定
                                _mode = _NORMAL;
                               } else {
                            
                                for(int i=0; i<list.size(); i++)
                                {
                                 // コンボボックスのデータ設定
                                 setTypeValueAboutProcGroup((AZ0040010Struct)(list.get(i)));
                                }
                                
                                _deployList =(ArrayList)list;
                                // モード設定
                                _mode = _SELECT;
                               }
                              } else {
                               //対象データがない
                               listMessage.add("T_QUERY_INFO.QUERY_NAME:" + struct.getw_QUERY_NAME());
                               listMessage.add("T_QUERY_INFO.QUERY_GROUP:" + struct.getw_QUERY_GROUP());
                               listMessage.add("T_QUERY_INFO.MEMO:" + struct.getw_MEMO());
                               listMessage.add("T_QUERY_INFO.CREATED_BY:" + struct.getw_CREATED_BY());
                               listMessage.add("T_QUERY_INFO.CREATED_DATE[FROM]:" + struct.getw_CREATED_DATE_FROM());
                               listMessage.add("T_QUERY_INFO.CREATED_DATE[TO]:" + struct.getw_CREATED_DATE_TO());
                               setErrorMessage("ZZ06001", listMessage);
                               // モード設定
                               _mode = _SELECT_WARNING;
                              }
                           
                             } catch(SQLException e) {
                              e.printStackTrace();
                              // モード設定
                              _mode = _NORMAL;
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlselect>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ユーザ定義のコードを記述してください
                             //------------------------------------------------------------------
                             // 初期化
                             _keyStruct = new AZ0040010Struct();
                             struct.initialize();
                             Saved_Sql = null;
                           
                             _deployList.clear();
                           
                             // モード設定
                             _mode = _NORMAL;
                           
                //}}user_implement_dev:<controlclear>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ユーザ定義のコードを記述してください
                             //------------------------------------------------------------------
                             // クリア処理
                             controlclear();
                           
                             // モード設定
                             _mode = _CLOSE;
                           
                //}}user_implement_dev:<controlclose>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1clear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1clear");
			//{{user_implement_dev:<controlsub1clear>
			// TODO: ユーザ定義のコードを記述してください
                             try{
                              preSetCondition();
                             } catch(SQLException e) {
                              // エラー処理を記述してください。
                              e.printStackTrace();
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub1clear>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1clear");

		return;
	}

	/**
	 * ＣＳＶ出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub2csv() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2csv");
			//{{user_implement_dev:<controlsub2csv>
			// TODO: ユーザ定義のコードを記述してください
                             //------------------------------------------------------------------
                             try {
                              csvList = new ArrayList();
                           
                              // 0件の場合終了
                              if(_l_QUERY_DATA.size() <= 0) return;
                           
                              String title [] = new String[_l_QUERY_COLUMN.size()];
                           
                              for(int i=0; i<_l_QUERY_COLUMN.size(); i++)
                              {
                               title[i] = (String)_l_QUERY_COLUMN.get(i);
                              }
                           
                              csvList.add(title);
                              for(int i=0;i<_l_QUERY_DATA.size();i++){
                               String csvStr [] = new String[_l_QUERY_COLUMN.size()];
                               String val [] = (String[])_l_QUERY_DATA.get(i);
                               
                               for(int j=0; j<_l_QUERY_COLUMN.size(); j++)
                               {
                                csvStr[j] = val[j];
                               }
                           
                               csvList.add(csvStr);
                              }
                              setInfoLogMessage("CSV data was created");
                           
                             }catch(Exception e){
                              ExpjMessage msg = new ExpjMessage( "ZZ01006", "CSV output failure" );
                              sysLog.warning(msg, getsysUSER_CD());
                           
                              ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                              sysLog.severe(emsg, getsysUSER_CD());
                              ExpjException ee = new ExpjException(e, emsg);
                           
                              throw ee;
                             }
                //}}user_implement_dev:<controlsub2csv>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2csv");

		return;
	}

	/**
	 * 検索実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlexecute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");
			//{{user_implement_dev:<controlexecute>
			// TODO: ユーザ定義のコードを記述してください
                             //------------------------------------------------------------------
                             String Message = "";
                           
                             try{
                           
                              //選択情報の設定
                              setSelStruct((AZ0040010Struct)_deployList.get(getCheckNumber().intValue()));
                           
                              //画面選択SQLの取得
                              Saved_Sql = (String)(_selStruct.getSQL_INFO());	//選択位置のSQL取得
                           
                              // 選択クエリの入力モードチェック
                              if(_selStruct.getEDIT_TYP().equals(String.valueOf(AZ0040Const.C_INPUT_FREE))){
                               // 入力モードをフリーに設定
                               modeCheck.setInputMode(AZ0040Const.C_INPUT_FREE);
                              }
                           
                              // 選択されたクエリのチェック(フリー入力チェックを使用)
                              if(AZ0040Common.checkFreeSqlStr(Saved_Sql)){
                               if(!isFree()) {
                                if(w_sqle == null){
                                 w_sqle = new AZ0040SQLEdit(sysLog, getsysUSER_CD());
                                 // SQL文の分解
                                 if(!w_sqle.Analize(conn, Saved_Sql)){
                                  // SQL解析エラー
                                  Message = "SQL:" + Saved_Sql;
                                  setErrorMessageNoKey("AZ00011", Message);
                                  return;
                                 }
                                 // 分解されたSQLデータテーブルの取得
                                 w_cdata = w_sqle.getColumnData();
                           
                                 //ＳＱＬ文の生成
                                 makeSQLfromCData(AZ0040SQLCreate.C_DISPLAY);
                                }
                               }
                               // 検索結果表示用データ取得
                               getDatafromSQL(Saved_Sql);
                              } else {
                               preQueryList();
                               // 画面遷移しない
                               _sqlexception_flg = true;
                               // 入力データ不正
                               Message = "SQL:" + Saved_Sql;
                               setErrorMessageNoKey("AZ00035", Message);
                               return;
                              }
                           
                             } catch(SQLException e) {
                              // SQL例外フラグON
                              _sqlexception_flg = true;
                           
                              // エラー処理を記述してください。
                              e.printStackTrace();
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }

                //}}user_implement_dev:<controlexecute>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlexecute");

		return;
	}

	/**
	 * 検索条件設定ボタン押下時に実行される処理です。
	 *
	 */
	public void controlcondition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlcondition");
			//{{user_implement_dev:<controlcondition>
			// TODO: ユーザ定義のコードを記述してください
                             //------------------------------------------------------------------
                             try{
                              preSetCondition();
                             } catch(SQLException e) {
                              // SQL例外フラグON
                              _sqlexception_flg = true;
                           
                              // エラー処理を記述してください。
                              e.printStackTrace();
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                           
                             }

                //}}user_implement_dev:<controlcondition>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlcondition");

		return;
	}

	/**
	 * 検索実行ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1execute() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1execute");
			//{{user_implement_dev:<controlsub1execute>
			// TODO: ユーザ定義のコードを記述してください
                             try{
                              // 入力データの取り込みとSQL文の生成
                              postSetCondition();
                              makeSQLfromCData(AZ0040SQLCreate.C_DISPLAY);
                           
                              // 検索結果表示用データ取得
                              getDatafromSQL(Saved_Sql);
                           
                             } catch(SQLException e) {
                              // SQL例外フラグON
                              _sqlexception_flg = true;
                           
                              // エラー処理を記述してください。
                              e.printStackTrace();
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }

                //}}user_implement_dev:<controlsub1execute>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1execute");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub1return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1return");
			//{{user_implement_dev:<controlsub1return>
			// TODO: ユーザ定義のコードを記述してください
                             try{
                              preQueryList();
                             } catch(SQLException e) {
                              // SQL例外フラグON
                              _sqlexception_flg = true;
                           
                              // エラー処理を記述してください。
                              e.printStackTrace();
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub1return>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub1return");

		return;
	}

	/**
	 * 検索条件設定ボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub2condition() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2condition");
			//{{user_implement_dev:<controlsub2condition>
			// TODO: ユーザ定義のコードを記述してください
                             try{
                              preSetCondition();
                             } catch(SQLException e) {
                              // SQL例外フラグON
                              _sqlexception_flg = true;
                           
                              // エラー処理を記述してください。
                              e.printStackTrace();
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub2condition>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2condition");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlsub2return() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2return");
			//{{user_implement_dev:<controlsub2return>
			// TODO: ユーザ定義のコードを記述してください
                             try{
                              preQueryList();
                             } catch(SQLException e) {
                              // SQL例外フラグON
                              _sqlexception_flg = true;
                           
                              // エラー処理を記述してください。
                              e.printStackTrace();
                           
                              // エラーメッセージ作成
                              String error = DBErrorMessage.getMessage(e);
                              setSqlExceptionMsg(error);
                             }
                //}}user_implement_dev:<controlsub2return>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlsub2return");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
                              //------------------------------------------------------------------
                              try{
                               
                               // クリア処理
                               controlclear();
                               
                               // モード設定
                               _mode = _NORMAL;
                            
                               // SQL例外判定フラグクリア
                               _sqlexception_flg = false;
                            
                               // 選択テーブル数クリア
                               _table_cnt = 0;
                            
                               // コンボボックスデータ用意
                               ComboBox controller
                                    = new ComboBox(conn, sysUSER_CD);
                            
                               _sub1COND_TYPE = controller.getData("COND_TYP");
                               _sub1SORT_TYPE = controller.getData("SORT_TYP");
                            
                               // 区分情報取得
                               _EDIT_TYP = controller.getData("EDIT_TYP");
                            
                               // 動作モード初期化
                               modeCheck.initialize();
                            
                               // 条件設定情報リスト初期化
                               w_cdata = new AZ0040ColumnData();
                            
                               // テーブル一覧リスト
                               _l_TABLE_LIST = AZ0040Common.GetUsefulTable(conn);
                            
                               // 選択テーブルコメント取得
                               AZ0040DBUtil dbutil = new AZ0040DBUtil();
                               _l_TABLE_COM_LIST = dbutil.getTableComments(conn, _l_TABLE_LIST);
                            
                              } catch(SQLException e) {
                               // エラー処理を記述してください。
                               setSqlExceptionMsg(e);
                            
                              }catch(ComboException e){
                               // エラーメッセージ作成
                               ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                               sysLog.severe(emsg, getsysUSER_CD());
                               ExpjException ee = new ExpjException(e, emsg);
                               
                               throw ee;
                              }

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AZ0040");
		logger.entering("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("AZ0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("sub1clear") ) {
				controlsub1clear();
			} else if( button.equals("sub2csv") ) {
				controlsub2csv();
			} else if( button.equals("execute") ) {
				controlexecute();
			} else if( button.equals("condition") ) {
				controlcondition();
			} else if( button.equals("sub1execute") ) {
				controlsub1execute();
			} else if( button.equals("sub1return") ) {
				controlsub1return();
			} else if( button.equals("sub2condition") ) {
				controlsub2condition();
			} else if( button.equals("sub2return") ) {
				controlsub2return();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
			// TODO: ユーザ定義のコードを記述してください
                              //------------------------------------------------------------------
                               //コンボボックスに取得データ設定
                               struct.setList_sub1COND_TYPE_val(_sub1COND_TYPE.getValList());
                               struct.setList_sub1COND_TYPE_name(_sub1COND_TYPE.getExplanList());
                               struct.setList_sub1SORT_TYPE_val(_sub1SORT_TYPE.getValList());
                               struct.setList_sub1SORT_TYPE_name(_sub1SORT_TYPE.getExplanList());
                            
                              } catch(AlarmMessageException ame){
                               ExpjException ee = new ExpjException(ame, (ExpjMessageList)((Object)ame.getMessages()));
                               throw ee;
                              //------------------------------------------------------------------
                //}}user_implement_dev:<control_eventHandller>
		} catch( BusinessLockException ble ) {
			// 枠メッセージ出力依頼作成
			setNewDataFlg(false);
		} catch( ResourceBusyException rbe ) {
			ExpjException ee = new ExpjException(rbe, "ZZ01105");
			throw ee;
		} catch( FoundationException e ) {
//			e.printStackTrace();
//			throw new FoundationException("AZ0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0040010-E999","CSVの出力処理"));
			throw new FoundationException("AZ0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0040010-E999","システム日付の取得処理"));
				throw new FoundationException("AZ0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AZ0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("AZ0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AZ0040010Entity entity;
	protected AZ0040010Struct struct;
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

		entity = new AZ0040010Entity();
		struct = new AZ0040010Struct();

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
	 * AZ0040010クラスの標準コンストラクタ
	 */
	public AZ0040010Control() throws BusinessProcessException, FoundationException
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
				AZ0040010Struct key = (AZ0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("sub1COLUMN_TYPE") && key.getsub1COLUMN_TYPE() != null) {
					msgKey.setKeyValue("sub1COLUMN_TYPE", key.getsub1COLUMN_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_TYPE") && key.getsub1COND_TYPE() != null) {
					msgKey.setKeyValue("sub1COND_TYPE", key.getsub1COND_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_TYPE_name") && key.getsub1COND_TYPE_name() != null) {
					msgKey.setKeyValue("sub1COND_TYPE_name", key.getsub1COND_TYPE_name());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_TYPE_val") && key.getsub1COND_TYPE_val() != null) {
					msgKey.setKeyValue("sub1COND_TYPE_val", key.getsub1COND_TYPE_val());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_VALUE1") && key.getsub1COND_VALUE1() != null) {
					msgKey.setKeyValue("sub1COND_VALUE1", key.getsub1COND_VALUE1());
				}
				if(msgKeyType.containsKeyColumn("sub1COND_VALUE2") && key.getsub1COND_VALUE2() != null) {
					msgKey.setKeyValue("sub1COND_VALUE2", key.getsub1COND_VALUE2());
				}
				if(msgKeyType.containsKeyColumn("sub1DISPLAY_FLG") && key.getsub1DISPLAY_FLG() != null) {
					msgKey.setKeyValue("sub1DISPLAY_FLG", key.getsub1DISPLAY_FLG());
				}
				if(msgKeyType.containsKeyColumn("sub1SORT_TYPE") && key.getsub1SORT_TYPE() != null) {
					msgKey.setKeyValue("sub1SORT_TYPE", key.getsub1SORT_TYPE());
				}
				if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_name") && key.getsub1SORT_TYPE_name() != null) {
					msgKey.setKeyValue("sub1SORT_TYPE_name", key.getsub1SORT_TYPE_name());
				}
				if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_val") && key.getsub1SORT_TYPE_val() != null) {
					msgKey.setKeyValue("sub1SORT_TYPE_val", key.getsub1SORT_TYPE_val());
				}
				if(msgKeyType.containsKeyColumn("sub1SORTKEY_PRI") && key.getsub1SORTKEY_PRI() != null) {
					msgKey.setKeyValue("sub1SORTKEY_PRI", key.getsub1SORTKEY_PRI());
				}
				if(msgKeyType.containsKeyColumn("sub1TABLE_NAME_COMMENT") && key.getsub1TABLE_NAME_COMMENT() != null) {
					msgKey.setKeyValue("sub1TABLE_NAME_COMMENT", key.getsub1TABLE_NAME_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("sub1TABLE_NAME") && key.getsub1TABLE_NAME() != null) {
					msgKey.setKeyValue("sub1TABLE_NAME", key.getsub1TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME") && key.getsub1COLUMN_NAME() != null) {
					msgKey.setKeyValue("sub1COLUMN_NAME", key.getsub1COLUMN_NAME());
				}
				if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME_COMMENT") && key.getsub1COLUMN_NAME_COMMENT() != null) {
					msgKey.setKeyValue("sub1COLUMN_NAME_COMMENT", key.getsub1COLUMN_NAME_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("EDIT_NAME") && key.getEDIT_NAME() != null) {
					msgKey.setKeyValue("EDIT_NAME", key.getEDIT_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_TO") && key.geth_TABLE_TO() != null) {
					msgKey.setKeyValue("h_TABLE_TO", key.geth_TABLE_TO());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_COMMENT_TO") && key.geth_TABLE_COMMENT_TO() != null) {
					msgKey.setKeyValue("h_TABLE_COMMENT_TO", key.geth_TABLE_COMMENT_TO());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS_TO") && key.geth_TABLE_ALIAS_TO() != null) {
					msgKey.setKeyValue("h_TABLE_ALIAS_TO", key.geth_TABLE_ALIAS_TO());
				}
				if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_NAME") && key.geth_LEFT_TABLE_NAME() != null) {
					msgKey.setKeyValue("h_LEFT_TABLE_NAME", key.geth_LEFT_TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_ALIAS") && key.geth_LEFT_TABLE_ALIAS() != null) {
					msgKey.setKeyValue("h_LEFT_TABLE_ALIAS", key.geth_LEFT_TABLE_ALIAS());
				}
				if(msgKeyType.containsKeyColumn("h_LEFT_COLUMN") && key.geth_LEFT_COLUMN() != null) {
					msgKey.setKeyValue("h_LEFT_COLUMN", key.geth_LEFT_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_NAME") && key.geth_RIGHT_TABLE_NAME() != null) {
					msgKey.setKeyValue("h_RIGHT_TABLE_NAME", key.geth_RIGHT_TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_ALIAS") && key.geth_RIGHT_TABLE_ALIAS() != null) {
					msgKey.setKeyValue("h_RIGHT_TABLE_ALIAS", key.geth_RIGHT_TABLE_ALIAS());
				}
				if(msgKeyType.containsKeyColumn("h_RIGHT_COLUMN") && key.geth_RIGHT_COLUMN() != null) {
					msgKey.setKeyValue("h_RIGHT_COLUMN", key.geth_RIGHT_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("h_CONDITION") && key.geth_CONDITION() != null) {
					msgKey.setKeyValue("h_CONDITION", key.geth_CONDITION());
				}
				if(msgKeyType.containsKeyColumn("h_COLUMN") && key.geth_COLUMN() != null) {
					msgKey.setKeyValue("h_COLUMN", key.geth_COLUMN());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS") && key.geth_TABLE_ALIAS() != null) {
					msgKey.setKeyValue("h_TABLE_ALIAS", key.geth_TABLE_ALIAS());
				}
				if(msgKeyType.containsKeyColumn("h_TABLE_NAME") && key.geth_TABLE_NAME() != null) {
					msgKey.setKeyValue("h_TABLE_NAME", key.geth_TABLE_NAME());
				}
				if(msgKeyType.containsKeyColumn("EDIT_TYP") && key.getEDIT_TYP() != null) {
					msgKey.setKeyValue("EDIT_TYP", key.getEDIT_TYP());
				}
				if(msgKeyType.containsKeyColumn("QUERY_NAME") && key.getQUERY_NAME() != null) {
					msgKey.setKeyValue("QUERY_NAME", key.getQUERY_NAME());
				}
				if(msgKeyType.containsKeyColumn("QUERY_GROUP") && key.getQUERY_GROUP() != null) {
					msgKey.setKeyValue("QUERY_GROUP", key.getQUERY_GROUP());
				}
				if(msgKeyType.containsKeyColumn("QUERY_MEMO") && key.getQUERY_MEMO() != null) {
					msgKey.setKeyValue("QUERY_MEMO", key.getQUERY_MEMO());
				}
				if(msgKeyType.containsKeyColumn("CREATED_DATE") && key.getCREATED_DATE() != null) {
					msgKey.setKeyValue("CREATED_DATE", key.getCREATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("CREATED_BY") && key.getCREATED_BY() != null) {
					msgKey.setKeyValue("CREATED_BY", key.getCREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_DATE") && key.getUPDATED_DATE() != null) {
					msgKey.setKeyValue("UPDATED_DATE", key.getUPDATED_DATE());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_BY") && key.getUPDATED_BY() != null) {
					msgKey.setKeyValue("UPDATED_BY", key.getUPDATED_BY());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("QUERY_CD") && key.getQUERY_CD() != null) {
					msgKey.setKeyValue("QUERY_CD", key.getQUERY_CD());
				}
				if(msgKeyType.containsKeyColumn("SQL_INFO") && key.getSQL_INFO() != null) {
					msgKey.setKeyValue("SQL_INFO", key.getSQL_INFO());
				}
				if(msgKeyType.containsKeyColumn("CREATED_PRG_NM") && key.getCREATED_PRG_NM() != null) {
					msgKey.setKeyValue("CREATED_PRG_NM", key.getCREATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM") && key.getUPDATED_PRG_NM() != null) {
					msgKey.setKeyValue("UPDATED_PRG_NM", key.getUPDATED_PRG_NM());
				}
				if(msgKeyType.containsKeyColumn("w_USER_CD") && key.getw_USER_CD() != null) {
					msgKey.setKeyValue("w_USER_CD", key.getw_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("w_QUERY_NAME") && key.getw_QUERY_NAME() != null) {
					msgKey.setKeyValue("w_QUERY_NAME", key.getw_QUERY_NAME());
				}
				if(msgKeyType.containsKeyColumn("w_QUERY_GROUP") && key.getw_QUERY_GROUP() != null) {
					msgKey.setKeyValue("w_QUERY_GROUP", key.getw_QUERY_GROUP());
				}
				if(msgKeyType.containsKeyColumn("w_MEMO") && key.getw_MEMO() != null) {
					msgKey.setKeyValue("w_MEMO", key.getw_MEMO());
				}
				if(msgKeyType.containsKeyColumn("w_CREATED_BY") && key.getw_CREATED_BY() != null) {
					msgKey.setKeyValue("w_CREATED_BY", key.getw_CREATED_BY());
				}
				if(msgKeyType.containsKeyColumn("w_CREATED_DATE_FROM") && key.getw_CREATED_DATE_FROM() != null) {
					msgKey.setKeyValue("w_CREATED_DATE_FROM", key.getw_CREATED_DATE_FROM());
				}
				if(msgKeyType.containsKeyColumn("w_CREATED_DATE_TO") && key.getw_CREATED_DATE_TO() != null) {
					msgKey.setKeyValue("w_CREATED_DATE_TO", key.getw_CREATED_DATE_TO());
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
					AZ0040010Struct key = new AZ0040010Struct();
					if(msgKeyType.containsKeyColumn("sub1COLUMN_TYPE")) {
						key.setsub1COLUMN_TYPE(msgKey.getKeyValue("sub1COLUMN_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_TYPE")) {
						key.setsub1COND_TYPE(msgKey.getKeyValue("sub1COND_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_TYPE_name")) {
						key.setsub1COND_TYPE_name(msgKey.getKeyValue("sub1COND_TYPE_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_TYPE_val")) {
						key.setsub1COND_TYPE_val(msgKey.getKeyValue("sub1COND_TYPE_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_VALUE1")) {
						key.setsub1COND_VALUE1(msgKey.getKeyValue("sub1COND_VALUE1"));
					}
					if(msgKeyType.containsKeyColumn("sub1COND_VALUE2")) {
						key.setsub1COND_VALUE2(msgKey.getKeyValue("sub1COND_VALUE2"));
					}
					if(msgKeyType.containsKeyColumn("sub1DISPLAY_FLG")) {
						key.setsub1DISPLAY_FLG(msgKey.getKeyValue("sub1DISPLAY_FLG"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORT_TYPE")) {
						key.setsub1SORT_TYPE(msgKey.getKeyValue("sub1SORT_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_name")) {
						key.setsub1SORT_TYPE_name(msgKey.getKeyValue("sub1SORT_TYPE_name"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORT_TYPE_val")) {
						key.setsub1SORT_TYPE_val(msgKey.getKeyValue("sub1SORT_TYPE_val"));
					}
					if(msgKeyType.containsKeyColumn("sub1SORTKEY_PRI")) {
						key.setsub1SORTKEY_PRI(msgKey.getKeyValue("sub1SORTKEY_PRI"));
					}
					if(msgKeyType.containsKeyColumn("sub1TABLE_NAME_COMMENT")) {
						key.setsub1TABLE_NAME_COMMENT(msgKey.getKeyValue("sub1TABLE_NAME_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("sub1TABLE_NAME")) {
						key.setsub1TABLE_NAME(msgKey.getKeyValue("sub1TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME")) {
						key.setsub1COLUMN_NAME(msgKey.getKeyValue("sub1COLUMN_NAME"));
					}
					if(msgKeyType.containsKeyColumn("sub1COLUMN_NAME_COMMENT")) {
						key.setsub1COLUMN_NAME_COMMENT(msgKey.getKeyValue("sub1COLUMN_NAME_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("EDIT_NAME")) {
						key.setEDIT_NAME(msgKey.getKeyValue("EDIT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_TO")) {
						key.seth_TABLE_TO(msgKey.getKeyValue("h_TABLE_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_COMMENT_TO")) {
						key.seth_TABLE_COMMENT_TO(msgKey.getKeyValue("h_TABLE_COMMENT_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS_TO")) {
						key.seth_TABLE_ALIAS_TO(msgKey.getKeyValue("h_TABLE_ALIAS_TO"));
					}
					if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_NAME")) {
						key.seth_LEFT_TABLE_NAME(msgKey.getKeyValue("h_LEFT_TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_LEFT_TABLE_ALIAS")) {
						key.seth_LEFT_TABLE_ALIAS(msgKey.getKeyValue("h_LEFT_TABLE_ALIAS"));
					}
					if(msgKeyType.containsKeyColumn("h_LEFT_COLUMN")) {
						key.seth_LEFT_COLUMN(msgKey.getKeyValue("h_LEFT_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_NAME")) {
						key.seth_RIGHT_TABLE_NAME(msgKey.getKeyValue("h_RIGHT_TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("h_RIGHT_TABLE_ALIAS")) {
						key.seth_RIGHT_TABLE_ALIAS(msgKey.getKeyValue("h_RIGHT_TABLE_ALIAS"));
					}
					if(msgKeyType.containsKeyColumn("h_RIGHT_COLUMN")) {
						key.seth_RIGHT_COLUMN(msgKey.getKeyValue("h_RIGHT_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("h_CONDITION")) {
						key.seth_CONDITION(msgKey.getKeyValue("h_CONDITION"));
					}
					if(msgKeyType.containsKeyColumn("h_COLUMN")) {
						key.seth_COLUMN(msgKey.getKeyValue("h_COLUMN"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_ALIAS")) {
						key.seth_TABLE_ALIAS(msgKey.getKeyValue("h_TABLE_ALIAS"));
					}
					if(msgKeyType.containsKeyColumn("h_TABLE_NAME")) {
						key.seth_TABLE_NAME(msgKey.getKeyValue("h_TABLE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("EDIT_TYP")) {
						key.setEDIT_TYP(msgKey.getKeyValue("EDIT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_NAME")) {
						key.setQUERY_NAME(msgKey.getKeyValue("QUERY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_GROUP")) {
						key.setQUERY_GROUP(msgKey.getKeyValue("QUERY_GROUP"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_MEMO")) {
						key.setQUERY_MEMO(msgKey.getKeyValue("QUERY_MEMO"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_DATE")) {
						key.setCREATED_DATE(msgKey.getKeyValue("CREATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_BY")) {
						key.setCREATED_BY(msgKey.getKeyValue("CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_DATE")) {
						key.setUPDATED_DATE(msgKey.getKeyValue("UPDATED_DATE"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_BY")) {
						key.setUPDATED_BY(msgKey.getKeyValue("UPDATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("QUERY_CD")) {
						key.setQUERY_CD(msgKey.getKeyValue("QUERY_CD"));
					}
					if(msgKeyType.containsKeyColumn("SQL_INFO")) {
						key.setSQL_INFO(msgKey.getKeyValue("SQL_INFO"));
					}
					if(msgKeyType.containsKeyColumn("CREATED_PRG_NM")) {
						key.setCREATED_PRG_NM(msgKey.getKeyValue("CREATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("UPDATED_PRG_NM")) {
						key.setUPDATED_PRG_NM(msgKey.getKeyValue("UPDATED_PRG_NM"));
					}
					if(msgKeyType.containsKeyColumn("w_USER_CD")) {
						key.setw_USER_CD(msgKey.getKeyValue("w_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_QUERY_NAME")) {
						key.setw_QUERY_NAME(msgKey.getKeyValue("w_QUERY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("w_QUERY_GROUP")) {
						key.setw_QUERY_GROUP(msgKey.getKeyValue("w_QUERY_GROUP"));
					}
					if(msgKeyType.containsKeyColumn("w_MEMO")) {
						key.setw_MEMO(msgKey.getKeyValue("w_MEMO"));
					}
					if(msgKeyType.containsKeyColumn("w_CREATED_BY")) {
						key.setw_CREATED_BY(msgKey.getKeyValue("w_CREATED_BY"));
					}
					if(msgKeyType.containsKeyColumn("w_CREATED_DATE_FROM")) {
						key.setw_CREATED_DATE_FROM(msgKey.getKeyValue("w_CREATED_DATE_FROM"));
					}
					if(msgKeyType.containsKeyColumn("w_CREATED_DATE_TO")) {
						key.setw_CREATED_DATE_TO(msgKey.getKeyValue("w_CREATED_DATE_TO"));
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
