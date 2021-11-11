/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/src/com/nec/jp/orteus/metamorBase/KA0100/KA0100020Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KA0100;

import com.nec.jp.orteus.metamorBase.KA0100.*;
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
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KA0100020Control
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
        public KA0100020Struct getListvalue(int x) { return (KA0100020Struct)(this.list.get(x)); }	// リストの値を返します。
        public KA0100020Struct getStruct() { return this.struct; }	// Structを返します。
        public KA0100020Struct createStruct() { return new KA0100020Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((KA0100020Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }

        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

        // TODO: ユーザ定義のコードを記述してください

//------------------------------------------------------------------------------
// add 標準G ↓

        /**
         * 画面遷移キー(顧客コード)
         */
        private String _custCd;

        /**
         * 画面遷移キー(顧客コード)設定
         * @param cd 顧客コード
         */
        protected void setCustCd(String cd){ _custCd = cd; };

        /**
         * 画面遷移キー(顧客コード)取得
         * @return 顧客コード
         */
        protected String getCustCd(){ return _custCd; };

        /**
         * 画面遷移キー(顧客コード)
         */
        private String _dlvLocCd;

        /**
         * 画面遷移キー(顧客コード)設定
         * @param cd 顧客コード
         */
        protected void setDlvLocCd(String cd){ _dlvLocCd = cd; };

        /**
         * 画面遷移キー(顧客コード)取得
         * @return 顧客コード
         */
        protected String getDlvLocCd(){ return _dlvLocCd; };

// add 標準G ↑
//------------------------------------------------------------------------------
    	
    	/**
    	 * 情報メッセージ設定
    	 * @param メッセージ番号
    	 * @param 出力メッセージ
    	 */
    	private void setInfoMessage(String messageno)
    	{
    		ExpjMessage emsg = new ExpjMessage( messageno );
    		msgStruct.addInfo( emsg );
    		sysLog.info(emsg, getsysUSER_CD());
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

//------------------------------------------------------------------------------

       // ----- シスタム設定値取得 ---------------	
    	private PrivateConfig privateConfig;
        // ----- シスタム設定値取得 ---------------		        
        // 得意先納品場所承認
        String aprMCustDlvLoc;		        
        // 画面遷移パラメータ
        String _SCREENMOVE_TYP;	
        String _APPR_ID;
    	/**
    	 * マスタキーの集う
    	 */
    	private HashMap keyvalueMap = new HashMap();
    	
    	/**
    	 * @return Returns the keyvalueMap.
    	 */
    	public HashMap getKeyvalueMap() {
    		return keyvalueMap;
    	}
    	/**
    	 * @param keyvalueMap The keyvalueMap to set.
    	 */
    	public void setKeyvalueMap(HashMap keyvalueMap) {
    		this.keyvalueMap = keyvalueMap;
    	}
//    ------------------------------------------------------------------------------

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

        /** 画面モード 検索/閉じる以外の処理 */
        private final static String _NORMAL = "normal";

        /** 画面モード 閉じる処理 */
        private final static String _CLOSE = "close";

//------------------------------------------------------------------------------

        /** メッセージ定義ファイル */
        //MessageConfig _msgConfig = null;

        /** メッセージ */
        //MessageStruct _msgStruct = msgStruct;

        /** システムログ */
        SystemLog _sysLog = sysLog;

//-----------------------------------------------------------------------------
        /** 画面共通定義取得クラス */
        ScreenParam _scParam = sp;

        /**
         * 更新／削除可能かチェックする<BR>
         * １．検索結果が存在すること（検索時と同じ条件で読み込み）
         * ２．更新カウンタが検索時と同一であること
         *
         * @param KA0100020Struct Struct
         * @return boolean true:更新削除可能 false:更新削除不可
         */
        private boolean isUpdatable(KA0100020Struct chk) throws FoundationException,SQLException
        {


                List listCheck = null;

                //読み込み

                listCheck = entity.mselect.read(conn,chk);

                if(listCheck == null || listCheck.size() != 1){
                        //読み込み失敗（処理中にステータスが変化したか、削除された場合）

                        //エラー処理
                        setErrorMessage("ZZ06001");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+chk.getDLV_LOC_CD());
                        return false;
                }
                KA0100020Struct rst = (KA0100020Struct)listCheck.get(0);
                //更新カウンタチェック
                // 退避させていたカウンタと、ここで読み込んだ現在値を比較する。


                double bef_mod = Double.parseDouble((String)struct.geth_MODIFY_COUNT());
                double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());
                if(bef_mod != aft_mod)
        {
                        //更新カウンタが変化した



                        //エラー処理
                        setErrorMessage("AC50802");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+chk.getDLV_LOC_CD());
                        return false;
                }
                
                //該当得意先納品場所を使った預託倉庫区分=20受注明細の存在チェック
                List CheckOdr = entity.mselectT_ODR.read(conn,struct);
                if (CheckOdr != null && CheckOdr.size() != 0){
                	setErrorMessage("KA10099");
                	return false;
                }
                return true;
        }
//--------------------------------------------------------------------------------------------
        /**
         * DB登録/更新時共通 設定内容チェック
         *
         * @return  true:OK / false:NG
         */
        private boolean isValidContents()throws FoundationException, SQLException
        {
                boolean result = true;


                //顧客コード存在チェック
                List listM_CUST = entity.mcheckM_CUST.read(conn, struct);

                if (listM_CUST == null || listM_CUST.size() == 0) {
                        result =false;
                        setErrorMessage("KA00032");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
			setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());

                } else {




			//払出預託保管区のチェック
                        String strWhTyp = ((KA0100020Struct)listM_CUST.get(0)).getDEPO_TYP() ;
                        String strDepoWhCd = struct.getDEPO_WH_CD() ;


                        if (strWhTyp != null && strWhTyp.equals("20")) {
                                if (strDepoWhCd == null || strDepoWhCd.equals("")) {

                                        result = false;
                                        setErrorMessage("KA00114");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
					setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                                }
                        }
                        if(strDepoWhCd != null && !"".equals(strDepoWhCd)){
                                boolean blnChkDepoCd = entity.mcheckDepoTyp.check(conn, struct);
                                if (blnChkDepoCd == false) {

                                        result =false;
                                        setErrorMessage("KA00115");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
					setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                                }
                        }

                }
                //出荷倉庫コードのチェック
                if(struct.getSHIP_WH_CD() != null && !"".equals(struct.getSHIP_WH_CD())){
                          boolean blnChkShipCd = entity.mcheckShipWhCd.check(conn, struct);
                          if (blnChkShipCd == false) {

                                 result =false;
                                 setErrorMessage("KA00116");
				 setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				 setErrorMessage("ZZ01006","M_CUST.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                          }
                }


                listM_CUST.clear();

                return result;
        }
// --------------------------------------------------------------------------------------------
        
    	
    	/**
    	 * 承認情報を登録
    	 * @param button
    	 * @throws SQLException
    	 */
        private boolean insertAppr(String button) throws SQLException{   	
        	/** 承認依頼存在チェック */
    		ArrayList keyValueList = new ArrayList();
    		// 変数設定(会社コード)
    		MstColumns key1 = new MstColumns();
    		key1.setColumnname("COMPANY_CD");
    		key1.setColumnvalue(struct.getSYS_COMPANY_CD());
    		keyValueList.add(key1);
    		
    		// 変数設定(得意先コード)
    		MstColumns key2 = new MstColumns();
    		key2.setColumnname("CUST_CD");
    		key2.setColumnvalue(struct.getCUST_CD());
    		keyValueList.add(key2);
    		
    		// 変数設定(納品場所コード)
    		MstColumns key3 = new MstColumns();
    		key3.setColumnname("DLV_LOC_CD");
    		key3.setColumnvalue(struct.getDLV_LOC_CD());
    		keyValueList.add(key3);
    		
    		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100020","KA0100020Servlet");
    		// 承認依頼存在チェック
    		boolean rtnFlg = mstappr.checkMST_APPR("M_CUST_BASE", keyValueList);
    		if(rtnFlg) {
    			// キーが存在している
    			ExpjMessage emsg = new ExpjMessage("KA00125");
    			msgStruct.addError(emsg); // ワーニングメッセージとして登録
    			sysLog.warning(emsg, getsysUSER_CD()); // エラー内容
    			return false;
    		}
    		
        	/** 承認依頼表へ登録　*/
        	MstApprStruct mstApprStruct = new MstApprStruct();
        	// 画面URL
        	mstApprStruct.setSCREEN_URL("KA0100020Servlet");
        	// 工場コード
        	mstApprStruct.setPLANT_CD(getsysPLANT_CD());
        	// 処理区分
        	mstApprStruct.setPROC_TYP(button);
        	// 承認備考
        	mstApprStruct.setAPPR_REMARKS(struct.getAPPR_REMARKS());   	
        	// 承認状態(承認待ち)
        	mstApprStruct.setSTATUS("1");
        	// 依頼者
        	mstApprStruct.setREQUEST_BY(struct.getsUser_ID());
        	// 認依頼表にデータを追加
        	String appr_ID = mstappr.insertMST_APPR(mstApprStruct);
        	
        	
        	/** 承認キーへ登録 */
        	MstApprKeyStruct keyStruct = new MstApprKeyStruct();
        	// 承認ID
        	keyStruct.setAPPR_ID(appr_ID);
        	// テーブル名
        	keyStruct.setTABLE_NAME("M_CUST_BASE");
        	// キー名(会社コード)
        	keyStruct.setKEY_NAME("COMPANY_CD");
        	// キー値(会社コード)
        	keyStruct.setKEY_VALUE(struct.getSYS_COMPANY_CD());
        	// 承認キー対応表にマスタのキー(会社コード)を追加する
        	mstappr.insertMST_APPR_KEY(keyStruct);
        	
        	// キー名(得意先コード)
        	keyStruct.setKEY_NAME("CUST_CD");
        	// キー値(得意先コード)
        	keyStruct.setKEY_VALUE(struct.getCUST_CD());
        	// 承認キー対応表にマスタのキー(口座管理コード)を追加する
        	mstappr.insertMST_APPR_KEY(keyStruct);
        	
        	// キー名(納品場所コード)
        	keyStruct.setKEY_NAME("DLV_LOC_CD");
        	// キー値(納品場所コード)
        	keyStruct.setKEY_VALUE(struct.getDLV_LOC_CD());
        	// 承認キー対応表にマスタのキーを追加する
        	mstappr.insertMST_APPR_KEY(keyStruct);
        	
        	/** 承認明細表へ登録 */
        	// 会社コード
    		String columnID = mstappr.getColumnID( "M_CUST_BASE", "COMPANY_CD");
    		mstappr.setDetailByColumnID(struct.getSYS_COMPANY_CD(),columnID);	
    		// 得意先コード
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "CUST_CD");
    		mstappr.setDetailByColumnID(struct.getCUST_CD(),columnID);		
    		// 納品場所コード
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_CD");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_CD(),columnID);
    		// 納品場所名
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_NAME");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_NAME(),columnID);				
    		// 納品場所名（カナ）
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_KNAME");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_KNAME(),columnID);		
    		// 納品場所名（英名）
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_ENAME");
    		mstappr.setDetailByColumnID(struct.getDLV_LOC_ENAME(),columnID);		
    		// 郵便番号
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ZIP_CD");
    		mstappr.setDetailByColumnID(struct.getZIP_CD(),columnID);			
    		//住所１
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_1");
    		mstappr.setDetailByColumnID(struct.getADDRESS_1(),columnID);		
    		//住所2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_2");
    		mstappr.setDetailByColumnID(struct.getADDRESS_2(),columnID);		
    		// 住所（カナ）１
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_1");
    		mstappr.setDetailByColumnID(struct.getADDRESS_K_1(),columnID);			
    		// 住所（カナ）2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_2");
    		mstappr.setDetailByColumnID(struct.getADDRESS_K_2(),columnID);
    		// 電話番号
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TEL");
    		mstappr.setDetailByColumnID(struct.getTEL(),columnID);		
    		// ＦＡＸ番号
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "FAX");
    		mstappr.setDetailByColumnID(struct.getFAX(),columnID);		
    		// 出荷倉庫コード
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "SHIP_WH_CD");
    		mstappr.setDetailByColumnID(struct.getSHIP_WH_CD(),columnID);		
    		// 払出預託保管区
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DEPO_WH_CD");
    		mstappr.setDetailByColumnID(struct.getDEPO_WH_CD(),columnID);	
    		// 運送便コード
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_CD");
    		mstappr.setDetailByColumnID(struct.getTRANSPORT_CD(),columnID);		
    		// 運送便名称
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_NAME");
    		mstappr.setDetailByColumnID("",columnID);		
    		// 運送日数
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_LT");
    		mstappr.setDetailByColumnID(struct.getTRANSPORT_LT(),columnID);
    		// カレンダ番号
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "CAL_NO");
    		mstappr.setDetailByColumnID("",columnID);
    		// 輸送形態区分
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_TYP");
    		mstappr.setDetailByColumnID("",columnID);
    		// 納品開始時刻
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_START_TIME");
    		mstappr.setDetailByColumnID("",columnID);
    		// 納品終了時刻
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_END_TIME");
    		mstappr.setDetailByColumnID("",columnID);
    		// 地域分類区分１
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_TYP1");
    		mstappr.setDetailByColumnID("",columnID);
    		// 地域分類１
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_1");
    		mstappr.setDetailByColumnID("",columnID);
    		// 地域分類区分2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_TYP2");
    		mstappr.setDetailByColumnID("",columnID);
    		// 地域分類2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_2");
    		mstappr.setDetailByColumnID("",columnID);
    		// 地域分類区分3
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_TYP3");
    		mstappr.setDetailByColumnID("",columnID);
    		// 地域分類3
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "AREA_CLASS_3");
    		mstappr.setDetailByColumnID("",columnID);
    		// 備考１
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "REMARKS_1");
    		mstappr.setDetailByColumnID("",columnID);
    		// 備考2
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "REMARKS_2");
    		mstappr.setDetailByColumnID("",columnID);
    		// 備考3
    		columnID = mstappr.getColumnID( "M_CUST_BASE", "REMARKS_3");
    		mstappr.setDetailByColumnID("",columnID);
    		// 作成日
    		columnID = mstappr.getColumnID("M_CUST_BASE","CREATED_DATE");
    		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
    		// 作成者
    		columnID = mstappr.getColumnID("M_CUST_BASE","CREATED_BY");
    		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
    		// 作成プログラム名
    		columnID = mstappr.getColumnID("M_CUST_BASE","CREATED_PRG_NM");
    		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
    		// 更新日
    		columnID = mstappr.getColumnID("M_CUST_BASE","UPDATED_DATE");
    		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
    		// 更新者
    		columnID = mstappr.getColumnID("M_CUST_BASE","UPDATED_BY");
    		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
    		// 更新プログラム名
    		columnID = mstappr.getColumnID("M_CUST_BASE","UPDATED_PRG_NM");
    		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
    		// 更新数
    		columnID = mstappr.getColumnID("M_CUST_BASE","MODIFY_COUNT");
    		mstappr.setDetailByColumnID("0",columnID); 
    		
    		// 承認明細にデータを追加する。
    		mstappr.insertMST_APPR_DETAIL("M_CUST_BASE",appr_ID);
        	
    		// 承認を依頼しました。
    		setInfoMessage("AZ00042");
    		
    		return true;
    		
        }
//--------------------------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
        // TODO: ユーザ定義のコードを記述してください
        try {
            boolean ok_flg = true;
            boolean result = false; // チェック結果格納

            // 処理結果フラグをNGに設定
            struct.seth_RESULT("NG");

            //画面モード取得
            String strKMode = "";
            strKMode = (String) struct.getk_MODE();

            if ("INSERT".equals(strKMode)) {
                //登録の時チェック

                // 顧客納品場所情報 重複チェック
                result = entity.mselect.check(conn, struct);
                if (result == true) {
                    ok_flg = false;
                    setErrorMessage("ZZ01102");
		    setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
		    setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                }
                else if (!isValidContents()) {
                    // 入力内容チェック
                    ok_flg = false;
                }
            }
            else if ("UPDATE".equals(strKMode)) {
                //更新の時チェック

                // 更新確認
                KA0100020Struct st = (KA0100020Struct) list.get(0);
                if (isUpdatable(st) == false) {
                    //更新できない状態
                    //エラー処理

                    ok_flg = false;
                }
                else if (!isValidContents()) {
                    // 入力内容チェック
                    ok_flg = false;
                }
            }
            else if ("DELETE".equals(strKMode)) {
                //削除の時チェック

                // 顧客納品場所情報の存在確認
                List w = entity.mselect.read(conn, struct);
                if (w.size() == 0) {
                    ok_flg = false;
                    setErrorMessage("ZZ01105");
		    setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
		    setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                }
            }
            else {
				
				MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100020","KA0100020Servlet");
				
				// 承認画面の「承認後」ボタンから遷移する時
				if("1".equals(struct.geth_APR_CUST_DLV_LOC()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){				
					list = mstappr.selectMST_APPR_DETAIL(_APPR_ID);
				} else {
					// 正常の読込と承認画面の「承認前」ボタンから遷移する時
					list = entity.mselect.read(conn, struct);
				}
	
                //list = entity.mselect.read(conn, struct);

                if (list.size() != 0) {
					if("1".equals(struct.geth_APR_CUST_DLV_LOC()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
						list.clear();
						String columnID;
						// 得意先コード
						columnID = mstappr.getColumnID( "M_CUST_BASE", "CUST_CD");
						struct.setCUST_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 得意先名
						struct.seth_CUST_CD(struct.getCUST_CD());
						List custList  = entity.mcheckM_CUST.read(conn,struct);
						if(custList.size() > 0){
							struct.setCUST_NAME(((KA0100020Struct)custList.get(0)).getCUST_NAME());
						}	
			    		// 納品場所コード
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_CD");
						struct.setDLV_LOC_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
			    		// 納品場所名
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_NAME");
						struct.setDLV_LOC_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));			
			    		// 納品場所名（カナ）
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_KNAME");
						struct.setDLV_LOC_KNAME(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// 納品場所名（英名）
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DLV_LOC_ENAME");
						struct.setDLV_LOC_ENAME(mstappr.getDetailByColumnID(tempStruct,columnID));		
			    		// 郵便番号
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ZIP_CD");
						struct.setZIP_CD(mstappr.getDetailByColumnID(tempStruct,columnID));			
			    		//住所１
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_1");
						struct.setADDRESS_1(mstappr.getDetailByColumnID(tempStruct,columnID));		
			    		//住所2
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_2");
						struct.setADDRESS_2(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// 住所（カナ）１
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_1");
						struct.setADDRESS_K_1(mstappr.getDetailByColumnID(tempStruct,columnID));		
			    		// 住所（カナ）2
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "ADDRESS_K_2");
						struct.setADDRESS_K_2(mstappr.getDetailByColumnID(tempStruct,columnID));
			    		// 電話番号
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TEL");
						struct.setTEL(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// ＦＡＸ番号
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "FAX");
						struct.setFAX(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// 出荷倉庫コード
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "SHIP_WH_CD");
						struct.setSHIP_WH_CD(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// 出荷倉庫名	
						List shipWh = entity.mselectShipWhCd.read(conn,struct);
						if(shipWh.size() > 0){
							struct.setSHIP_WH_NAME(((KA0100020Struct)shipWh.get(0)).getSHIP_WH_NAME());
						}
			    		// 払出預託保管区
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "DEPO_WH_CD");
						struct.setDEPO_WH_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
			    		// 払出預託保管区名
						List depoTyp = entity.mselectDepoTyp.read(conn,struct);
						if(depoTyp.size() > 0){
							struct.setDEPO_WH_NAME(((KA0100020Struct)depoTyp.get(0)).getDEPO_WH_NAME());
						}
			    		// 運送便コード
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_CD");
						struct.setTRANSPORT_CD(mstappr.getDetailByColumnID(tempStruct,columnID));	
			    		// 運送日数
			    		columnID = mstappr.getColumnID( "M_CUST_BASE", "TRANSPORT_LT");
						struct.setTRANSPORT_LT(mstappr.getDetailByColumnID(tempStruct,columnID));		
						
					}else{
	                    struct.copy( (KA0100020Struct) list.get(0));
						//画面遷移パラメータを再取得
						struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);						
					}
                    _mode = _SELECT;
                }
                else {
                    ok_flg = false;
                    setErrorMessage("ZZ06001");
		    setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
		    setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                }
            }
            // 読込ステータス設定
            setReadStatus(NORMAL);
            struct.seth_CUST_CD(struct.getCUST_CD());
            struct.seth_DLV_LOC_CD(struct.getDLV_LOC_CD());

            if (!"RESELECT".equals(strKMode)) {
                //警告以外のエラーが何もない場合OKにする
                if (ok_flg == true) {
                    setReadStatus(NORMAL);
                    //struct.seth_RESULT("OK");
                }
                else {
                    setReadStatus(NOT_FOUND);
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            // エラー処理を記述してください。
            setReadStatus(ERROR);
            throw new ExpjException(e);
        }
                //}}user_implement_dev:<controlselect>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
                        // TODO: ユーザ定義のコードを記述してください
                try {
                        boolean result = false;		// チェック結果格納

                        // 顧客納品場所情報 重複チェック
                        result = entity.mselect.check(conn, struct);
                        if (result == true) {
                                setErrorMessage("ZZ01102");
				setErrorMessage("ZZ01006","M_CUST_BASE.CUST_CD:"+struct.getCUST_CD());
				setErrorMessage("ZZ01006","M_CUST_BASE.DLV_LOC_CD:"+struct.getDLV_LOC_CD());
                        }else{
                                // 入力内容チェック
                                isValidContents();

                        }
                        // エラーが発生していない場合、登録処理実施
                        if(msgStruct.sizeError() <= 0){

                                //会社コードを読込
                                list = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                                struct.setSYS_COMPANY_CD(((KA0100020Struct)list.get(0)).getSYS_COMPANY_CD());
                				
                				if("1".equals(struct.geth_APR_CUST_DLV_LOC())){				
                					// 得意先納品場所承認の登録
                					boolean rtn = insertAppr("1");
                					if(!rtn) return;
                				} else {                                	
                                    //登録処理
                                    entity.minsertM_CUST_BASE.create(conn, struct);
                				}

                                conn.commit();
                                
                                if("0".equals(struct.geth_APR_CUST_DLV_LOC())){
                    				// 検索
                    				struct.setk_MODE("RESELECT");
                    				controlselect();                	
                                }

                        }

                } catch(SQLException e) {
                        // エラーメッセージ作成
                        throw new ExpjException(e);
                } finally {
                        if (conn != null) {
                                conn.rollback();
                        }
                }
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
                        // TODO: ユーザ定義のコードを記述してください
                try {
                        conn.beginTransWeb();		// トランザクション開始

                        //更新の時チェック

                        // 更新確認
                        KA0100020Struct st = (KA0100020Struct)list.get(0);
                        if(isUpdatable(st) == false){
                                //更新できない状態
                                //エラー処理

                        }else{

                                // 入力内容チェック
                                isValidContents();
                        }

                        // エラーが発生していない場合、更新処理実施
                        if(msgStruct.sizeError() <= 0)
                        {
        					//会社コードを読込
        					List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
        					struct.setSYS_COMPANY_CD(((KA0100020Struct)listCheck.get(0)).getSYS_COMPANY_CD());
            				//「得意先納品場所承認」が１の場合
            				if("1".equals(struct.geth_APR_CUST_DLV_LOC())){				
            					// 承認情報の登録
            					boolean rtn = insertAppr("2");
            					if(!rtn) return;
            				} else {	
            					//「得意先納品場所承認」が１以外の場合

            					entity.mupdateM_CUST_BASE.update(conn, struct);
            				}
                                
                             conn.commit();
                             
                             if("0".equals(struct.geth_APR_CUST_DLV_LOC())){
                 				// 検索
                 				struct.setk_MODE("RESELECT");
                 				controlselect();                	
                             }
                        }

                } catch(SQLException e) {
                        throw new ExpjException(e);
                } finally {
                        try {
                                conn.rollback();
                        } catch(Exception e) {
                                e.printStackTrace();
                        }
                }
                //}}user_implement_dev:<controlupdate>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                        // TODO: ユーザ定義のコードを記述してください
                try{

                        struct.initialize();
                        // モード設定
                        _mode = _NORMAL;

                        // 読込ステータス設定
                        setReadStatus(INITIAL);
                }catch(Exception e){
                        throw new ExpjException(e);
                }
                //}}user_implement_dev:<controlclear>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
                        // TODO: ユーザ定義のコードを記述してください
                try {

                        //MODIFYCOUNTのチェック
                        isUpdatable(struct);

                        // エラーが発生していない場合、削除処理実施
                        if(msgStruct.sizeError() <= 0){
        					//会社コードを読込
        					List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
        					struct.setSYS_COMPANY_CD(((KA0100020Struct)listCheck.get(0)).getSYS_COMPANY_CD());
            				
            				//「得意先納品場所承認」が１の場合
            				if("1".equals(struct.geth_APR_CUST_DLV_LOC())){				
            					// 承認情報の登録
            					boolean rtn = insertAppr("3");
            					if(!rtn) return;
            				} else {	
            					//「得意先納品場所承認」が１以外の場合
            					entity.mdeleteM_CUST_BASE.delete(conn, struct);
            				}
                                
                                conn.commit();
                                controlclear();
                                _mode = _NORMAL;
                        }

                } catch(SQLException e) {
                        e.printStackTrace();
                        // エラー処理を記述してください。
                }
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
                        // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                        // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                        // TODO: ユーザ定義のコードを記述してください
			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
                try{
        			    //画面遷移パラメータを取得
        			    _SCREENMOVE_TYP = struct.geth_SCREENMOVE_TYP();
        			    _APPR_ID = struct.geth_APPR_ID();

                        // クリア処理
                        controlclear();

                        // モード設定
                        _mode = _NORMAL;
            	        
            	        /** パラメータ「得意先納品場所承認」を取得*/
            	        privateConfig = new PrivateConfig(conn);	        
            	        // 得意先納品場所承認
            	        aprMCustDlvLoc = privateConfig.getString("APR_CUST_DESINATED_DLV_LOC");
            	        // パラメータ「得意先納品場所承認」が取得できなかった場合
            			if(aprMCustDlvLoc ==null || "".equals(aprMCustDlvLoc)) {
             				String locale = CoreTools.getLocale(struct.getsUser_ID());
             				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
             				//ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00045"));
            				setErrorMessage("AZ00041" , messages.getString("AZ00046"));
            				struct.seth_APR_CUST_DLV_LOC("0");
            			} else if("1".equals(aprMCustDlvLoc)) {
            				// 得意先納品場所承認が１の場合
            				struct.seth_APR_CUST_DLV_LOC("1");
            			} else {
            				// １以外の場合
            				struct.seth_APR_CUST_DLV_LOC("0");
            			}

// add 標準G ↓
                        // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す



                        if ( isScreenMove()== true ) {
                                struct.setCUST_CD( _custCd );
                                struct.setDLV_LOC_CD( _dlvLocCd );
                				//承認依頼情報からパラメータを取得
                				if("1".equals(_SCREENMOVE_TYP) || "0".equals(_SCREENMOVE_TYP)){
                					struct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());
                					struct.setDLV_LOC_CD(keyvalueMap.get("DLV_LOC_CD").toString());
                					//struct.setSYS_COMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
                					struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
                				}
                                controlselect();
                        }
// add 標準G ↑

			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
                } catch(SQLException e) {
        			ExpjMessage emsg = new ExpjMessage( "ZZ01006" ," (SBM1093)リロード処理は失敗しました。");
        			msgStruct.addWarn( emsg );
        			sysLog.info(emsg, getsysUSER_CD());
                }

                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KA0100020Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("insert") ) {
				controlinsert();
			} else if( button.equals("update") ) {
				controlupdate();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("delete") ) {
				controldelete();
			} else if( button.equals("close") ) {
				controlclose();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                        // TODO: ユーザ定義のコードを記述してください
		if("1".equals(aprMCustDlvLoc)) {
			// 得意先納品場所承認が１の場合
			struct.seth_APR_CUST_DLV_LOC("1");
		} else {
			// １以外の場合
			struct.seth_APR_CUST_DLV_LOC("0");
		}
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
//			throw new FoundationException("KA0100020Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100020-E999","CSVの出力処理"));
			throw new FoundationException("KA0100020Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100020-E999","システム日付の取得処理"));
				throw new FoundationException("KA0100020Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                        // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100020-E999","コントロールのイベント処理"));
			throw new FoundationException("KA0100020Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KA0100020Entity entity;
	protected KA0100020Struct struct;
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

		entity = new KA0100020Entity();
		struct = new KA0100020Struct();

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
	 * KA0100020クラスの標準コンストラクタ
	 */
	public KA0100020Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
                        // TODO: ここに初期処理を記述してください
                        _mode = _NORMAL;
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
				KA0100020Struct key = (KA0100020Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD") && key.geth_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("h_DLV_LOC_CD", key.geth_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("h_CUST_CD") && key.geth_CUST_CD() != null) {
					msgKey.setKeyValue("h_CUST_CD", key.geth_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP") && key.geth_SCREENMOVE_TYP() != null) {
					msgKey.setKeyValue("h_SCREENMOVE_TYP", key.geth_SCREENMOVE_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("APPR_REMARKS") && key.getAPPR_REMARKS() != null) {
					msgKey.setKeyValue("APPR_REMARKS", key.getAPPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_APR_CUST_DLV_LOC") && key.geth_APR_CUST_DLV_LOC() != null) {
					msgKey.setKeyValue("h_APR_CUST_DLV_LOC", key.geth_APR_CUST_DLV_LOC());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_CD") && key.getDLV_LOC_CD() != null) {
					msgKey.setKeyValue("DLV_LOC_CD", key.getDLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_NAME") && key.getDLV_LOC_NAME() != null) {
					msgKey.setKeyValue("DLV_LOC_NAME", key.getDLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_KNAME") && key.getDLV_LOC_KNAME() != null) {
					msgKey.setKeyValue("DLV_LOC_KNAME", key.getDLV_LOC_KNAME());
				}
				if(msgKeyType.containsKeyColumn("DLV_LOC_ENAME") && key.getDLV_LOC_ENAME() != null) {
					msgKey.setKeyValue("DLV_LOC_ENAME", key.getDLV_LOC_ENAME());
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
				if(msgKeyType.containsKeyColumn("ADDRESS_K_1") && key.getADDRESS_K_1() != null) {
					msgKey.setKeyValue("ADDRESS_K_1", key.getADDRESS_K_1());
				}
				if(msgKeyType.containsKeyColumn("ADDRESS_K_2") && key.getADDRESS_K_2() != null) {
					msgKey.setKeyValue("ADDRESS_K_2", key.getADDRESS_K_2());
				}
				if(msgKeyType.containsKeyColumn("TEL") && key.getTEL() != null) {
					msgKey.setKeyValue("TEL", key.getTEL());
				}
				if(msgKeyType.containsKeyColumn("FAX") && key.getFAX() != null) {
					msgKey.setKeyValue("FAX", key.getFAX());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_CD") && key.getTRANSPORT_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_CD", key.getTRANSPORT_CD());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_LT") && key.getTRANSPORT_LT() != null) {
					msgKey.setKeyValue("TRANSPORT_LT", key.getTRANSPORT_LT());
				}
				if(msgKeyType.containsKeyColumn("DEPO_WH_CD") && key.getDEPO_WH_CD() != null) {
					msgKey.setKeyValue("DEPO_WH_CD", key.getDEPO_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("SHIP_WH_CD") && key.getSHIP_WH_CD() != null) {
					msgKey.setKeyValue("SHIP_WH_CD", key.getSHIP_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEPO_WH_NAME") && key.getDEPO_WH_NAME() != null) {
					msgKey.setKeyValue("DEPO_WH_NAME", key.getDEPO_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("SHIP_WH_NAME") && key.getSHIP_WH_NAME() != null) {
					msgKey.setKeyValue("SHIP_WH_NAME", key.getSHIP_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("DEPO_TYP") && key.getDEPO_TYP() != null) {
					msgKey.setKeyValue("DEPO_TYP", key.getDEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
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
					KA0100020Struct key = new KA0100020Struct();
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("h_DLV_LOC_CD")) {
						key.seth_DLV_LOC_CD(msgKey.getKeyValue("h_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_CUST_CD")) {
						key.seth_CUST_CD(msgKey.getKeyValue("h_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREENMOVE_TYP")) {
						key.seth_SCREENMOVE_TYP(msgKey.getKeyValue("h_SCREENMOVE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("APPR_REMARKS")) {
						key.setAPPR_REMARKS(msgKey.getKeyValue("APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_APR_CUST_DLV_LOC")) {
						key.seth_APR_CUST_DLV_LOC(msgKey.getKeyValue("h_APR_CUST_DLV_LOC"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_CD")) {
						key.setDLV_LOC_CD(msgKey.getKeyValue("DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_NAME")) {
						key.setDLV_LOC_NAME(msgKey.getKeyValue("DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_KNAME")) {
						key.setDLV_LOC_KNAME(msgKey.getKeyValue("DLV_LOC_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("DLV_LOC_ENAME")) {
						key.setDLV_LOC_ENAME(msgKey.getKeyValue("DLV_LOC_ENAME"));
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
					if(msgKeyType.containsKeyColumn("ADDRESS_K_1")) {
						key.setADDRESS_K_1(msgKey.getKeyValue("ADDRESS_K_1"));
					}
					if(msgKeyType.containsKeyColumn("ADDRESS_K_2")) {
						key.setADDRESS_K_2(msgKey.getKeyValue("ADDRESS_K_2"));
					}
					if(msgKeyType.containsKeyColumn("TEL")) {
						key.setTEL(msgKey.getKeyValue("TEL"));
					}
					if(msgKeyType.containsKeyColumn("FAX")) {
						key.setFAX(msgKey.getKeyValue("FAX"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_CD")) {
						key.setTRANSPORT_CD(msgKey.getKeyValue("TRANSPORT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_LT")) {
						key.setTRANSPORT_LT(msgKey.getKeyValue("TRANSPORT_LT"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_WH_CD")) {
						key.setDEPO_WH_CD(msgKey.getKeyValue("DEPO_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_WH_CD")) {
						key.setSHIP_WH_CD(msgKey.getKeyValue("SHIP_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_WH_NAME")) {
						key.setDEPO_WH_NAME(msgKey.getKeyValue("DEPO_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("SHIP_WH_NAME")) {
						key.setSHIP_WH_NAME(msgKey.getKeyValue("SHIP_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("DEPO_TYP")) {
						key.setDEPO_TYP(msgKey.getKeyValue("DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
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
