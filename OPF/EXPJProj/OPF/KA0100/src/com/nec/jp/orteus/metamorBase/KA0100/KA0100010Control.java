/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KA0100/src/com/nec/jp/orteus/metamorBase/KA0100/KA0100010Control.java,v $
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
	// TODO: ここにimportパッケージを記述してください
import com.nec.jp.orteus.expj.mstappr.MstAppr;
import com.nec.jp.orteus.expj.mstappr.MstApprDetailStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprKeyStruct;
import com.nec.jp.orteus.expj.mstappr.MstApprStruct;
import com.nec.jp.orteus.expj.mstappr.MstColumns;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class KA0100010Control
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
	public KA0100010Struct getListvalue(int x) { return (KA0100010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KA0100010Struct getStruct() { return this.struct; }	// Structを返します。
	public KA0100010Struct createStruct() { return new KA0100010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KA0100010Struct)structname); }	// Structをセットします。
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

// add 標準G ↑	
//	------------------------------------------------------------------------------
    
    // ----- シスタム設定値取得 ---------------	
	private PrivateConfig privateConfig;
    // ----- シスタム設定値取得 ---------------		        
    // 得意先承認
    String aprMCust;		        
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

	/** メッセージ */
	//MessageStruct _msgStruct = msgStruct;

	/** システムログ */
	SystemLog _sysLog = sysLog;

//-----------------------------------------------------------------------------
	/** 画面共通定義取得クラス */
	ScreenParam _scParam = sp;

//------------------------------------------------------------------------
	/**
	 * コンボボックスの中身を取得します。
	 *
	 * @param data データの箱
	 */
	 private void setComboData(KA0100010Struct data)throws BusinessProcessException, FoundationException
	 {

	 	try {
	 		// コンボボックスデータを部品より取得
			ComboBox cdac = new ComboBox(conn, sysUSER_CD);

			ComboStruct combo1 = cdac.getData("EXCH_TYP");
            ComboStruct combo2 = cdac.getData("INSPC_ACPT_TYP");
			ComboStruct combo3 = cdac.getData("TAX_APPLY_TYP_SAAR");
			ComboStruct combo4 = cdac.getData("TAX_CALC_TYP_SAAR");
            //ComboStruct combo5 = cdac.getData("PRICE_ROUND_TYP");
            ComboStruct combo6 = cdac.getData("DETAIL_ROUND_TYP");
			ComboStruct combo7 = cdac.getData("UNCONFIRM_ODR_EFF_TERM_FLG");
			ComboStruct combo8 = cdac.getData("PARTIAL_SHIP_INST_FLG");
			//ComboStruct combo9 = cdac.getData("DEPO_TYP");

			// データ設定
			data.setList_EXCH_TYP_val(combo1.getValList());
			data.setList_EXCH_TYP_name(combo1.getExplanList());
                        data.setList_INSPC_ACPT_TYP_val(combo2.getValList());
			data.setList_INSPC_ACPT_TYP_name(combo2.getExplanList());
			data.setList_TAX_APPLY_TYP_val(combo3.getValList());
			data.setList_TAX_APPLY_TYP_name(combo3.getExplanList());
			data.setList_TAX_CALC_TYP_val(combo4.getValList());
			data.setList_TAX_CALC_TYP_name(combo4.getExplanList());
            //data.setList_PRICE_ROUND_TYP_val(combo5.getValList());
			//data.setList_PRICE_ROUND_TYP_name(combo5.getExplanList());
            data.setList_DETAIL_ROUND_TYP_val(combo6.getValList());
			data.setList_DETAIL_ROUND_TYP_name(combo6.getExplanList());
			//data.setList_UNCONFIRM_ODR_EFF_TERM_FLG_val(combo7.getValList());
			//data.setList_UNCONFIRM_ODR_EFF_TERM_FLG_name(combo7.getExplanList());
			data.setList_PARTIAL_SHIP_INST_FLG_val(combo8.getValList());
			data.setList_PARTIAL_SHIP_INST_FLG_name(combo8.getExplanList());
			//data.setList_DEPO_TYP_val(combo9.getValList());
			//data.setList_DEPO_TYP_name(combo9.getExplanList());

			cdac.setConnection(null);

        } catch (SQLException e) {
            throw new ExpjException(e);
        } catch (ComboException e) {
            throw new ExpjException(e);
		}
	 }

	//------------------------------------------------------------------------
	/**
	 * DB登録/更新時共通 設定内容チェック
	 *
	 * @return  true:OK / false:NG
	 */
	//------------------------------------------------------------------------
	// 2003/08/23 K.Shiraki
	//            登録/更新処理から切り出し
	//------------------------------------------------------------------------
	private boolean isValidContents()throws FoundationException, SQLException
	{
		boolean result = true;
		String strTest = null;


		// 消費税コード存在確認
		if(struct.getTAX_CD() != null && struct.getTAX_CD().equals("") == false){
			List list1 = entity.mselectM_TAX.read(conn, struct);
			if (list1 == null || list1.size() == 0) {

				setErrorMessage("AA01001");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				result = false;
			}
		}


		// 自社担当部門コード存在確認
		if(struct.getOWN_ORG_CD() != null && struct.getOWN_ORG_CD().equals("") == false){
		        List list2 = entity.mcheckOWN_ORG_CD.read(conn, struct);
		        if (list2 == null || list2.size() == 0) {

		                setErrorMessage("KA00111");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
		                result = false;
		        }
		}

                // 自社担当者コード存在確認
                if(struct.getOWN_PERSON_CD() != null && struct.getOWN_PERSON_CD().equals("") == false){
                        List list3 = entity.mcheckOWN_PERSON_CD.read(conn, struct);
                        if (list3 == null || list3.size() == 0) {

                                setErrorMessage("KA00112");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
                                result = false;
                        }
                }

                // 通貨コード存在確認
                if(struct.getCUR_CD() != null && struct.getCUR_CD().equals("") == false){
                        List list4 = entity.mcheckCUR_CD.read(conn, struct);
                        if (list4 == null || list4.size() == 0) {

                                setErrorMessage("KA00113");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
                                result = false;
                        }
                }
                
                // 海外取引であるか確認
                KA0100010Struct check_struct = new KA0100010Struct();
                List list5 = entity.mselectSYS_HOME_CUR.read(conn, struct);
                if(list5 ==null || list5.size() == 0){
                	// 画面業務エラー出力:邦貨コードの取得に失敗しました。
                	setErrorMessage("KA20039");
                	result = false;
                }else{
                	check_struct.setStruct((KA0100010Struct)list5.get(0));
                	if(!struct.getCUR_CD().equals(check_struct.getHOME_CUR_CD())){
                 	    if(!"1".equals(struct.getTAX_CALC_TYP())){
                            // 画面業務エラー出力：明細以外の消費税計算区分は海外取引に適用できません。
                            setErrorMessage("BA00107");
                            result = false;
                 	    }
                    }
                }

		return result;
	}
	//------------------------------------------------------------------------
	/**
	 * 更新／削除可能かチェックする<BR>
	 * １．検索結果が存在すること（検索時と同じ条件で読み込み）
	 * ２．更新カウンタが検索時と同一であること
	 *
	 * @param KA0100010Struct Struct
	 * @return boolean true:更新削除可能 false:更新削除不可
	 */
	private boolean isUpdatable(KA0100010Struct chk) throws FoundationException,SQLException
	{
		List listCheck = null;

		//会社コードを読込
		listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
		chk.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());
		struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

		//読み込み
		listCheck = entity.mselect.read(conn,chk);

		if(listCheck == null || listCheck.size() != 1){
			//読み込み失敗（処理中にステータスが変化したか、削除された場合）

			//エラー処理
			setErrorMessage("ZZ06001");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			return false;
		}

		KA0100010Struct rst = (KA0100010Struct)listCheck.get(0);
		//更新カウンタチェック
		// 退避させていたカウンタと、ここで読み込んだ現在値を比較する。
		double bef_mod = Double.parseDouble(struct.geth_MODIFY_COUNT());
		double aft_mod = Double.parseDouble(rst.geth_MODIFY_COUNT());


		if(bef_mod != aft_mod){
			//更新カウンタが変化した



			//エラー処理
			setErrorMessage("AC50802");
			setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+chk.getCUST_CD());
			return false;
		}

		return true;
	}
	
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
		
		MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100010","KA0100010Servlet");
		// 承認依頼存在チェック
		boolean rtnFlg = mstappr.checkMST_APPR("M_CUST", keyValueList);
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
    	mstApprStruct.setSCREEN_URL("KA0100010Servlet");
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
    	keyStruct.setTABLE_NAME("M_CUST");
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
    	// 承認キー対応表にマスタのキーを追加する
    	mstappr.insertMST_APPR_KEY(keyStruct);
    	

    	
    	/** 承認明細表へ登録 */
    	// 会社コード
		String columnID = mstappr.getColumnID( "M_CUST", "COMPANY_CD");
		mstappr.setDetailByColumnID(struct.getSYS_COMPANY_CD(),columnID);	
		// 得意先コード
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CD");
		mstappr.setDetailByColumnID(struct.getCUST_CD(),columnID);		
		// 得意先正式名
		columnID = mstappr.getColumnID( "M_CUST", "CUST_FNAME");
		mstappr.setDetailByColumnID("",columnID);
		// 得意先名
		columnID = mstappr.getColumnID( "M_CUST", "CUST_NAME");
		mstappr.setDetailByColumnID(struct.getCUST_NAME(),columnID);				
		// 得意先名（カナ）
		columnID = mstappr.getColumnID( "M_CUST", "CUST_KNAME");
		mstappr.setDetailByColumnID(struct.getCUST_KNAME(),columnID);		
		// 得意先名（英名）
		columnID = mstappr.getColumnID( "M_CUST", "CUST_ENAME");
		mstappr.setDetailByColumnID("",columnID);		
		// 得意先名略称
		columnID = mstappr.getColumnID( "M_CUST", "CUST_ANAME");
		mstappr.setDetailByColumnID(struct.getCUST_ANAME(),columnID);			
		//代表者役職名
		columnID = mstappr.getColumnID( "M_CUST", "OWNER_EXECUTIVE");
		mstappr.setDetailByColumnID("",columnID);		
		// 代表者名
		columnID = mstappr.getColumnID( "M_CUST", "OWNER_NAME");
		mstappr.setDetailByColumnID("",columnID);	
		// 得意先分類区分１
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_TYP1");
		mstappr.setDetailByColumnID("21",columnID);		
		// 得意先分類１
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_1");
		mstappr.setDetailByColumnID("",columnID);		
		// 得意先分類区分2
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_TYP2");
		mstappr.setDetailByColumnID("22",columnID);		
		// 得意先分類2
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_2");
		mstappr.setDetailByColumnID("",columnID);	
		// 得意先分類区分3
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_TYP3");
		mstappr.setDetailByColumnID("23",columnID);		
		// 得意先分類3
		columnID = mstappr.getColumnID( "M_CUST", "CUST_CLASS_3");
		mstappr.setDetailByColumnID("",columnID);		
		//得意先グループコード
		columnID = mstappr.getColumnID( "M_CUST", "CUST_GRP_CD");
		mstappr.setDetailByColumnID("",columnID);
		// 得意先昇順
		columnID = mstappr.getColumnID( "M_CUST", "CUST_SEQ_CD");
		mstappr.setDetailByColumnID("",columnID);
		// 通貨コード
		columnID = mstappr.getColumnID( "M_CUST", "CUR_CD");
		mstappr.setDetailByColumnID(struct.getCUR_CD(),columnID);
		// 為替種別
		columnID = mstappr.getColumnID( "M_CUST", "EXCH_TYP");
		mstappr.setDetailByColumnID(struct.getEXCH_TYP(),columnID);
		// 請求サイクル
		columnID = mstappr.getColumnID( "M_CUST", "CLAIM_CYCLE_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// 検収区分
		columnID = mstappr.getColumnID( "M_CUST", "INSPC_ACPT_TYP");
		mstappr.setDetailByColumnID(struct.getINSPC_ACPT_TYP(),columnID);
		// 輸出取引区分
		columnID = mstappr.getColumnID( "M_CUST", "EXPORT_TRN_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// 輸出検収区分
		columnID = mstappr.getColumnID( "M_CUST", "EXPORT_INSPC_ACPT_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// 仮単価売上計上フラグ
		columnID = mstappr.getColumnID( "M_CUST", "TEMP_UNIT_PRICE_SALES_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// 入金入力区分
		columnID = mstappr.getColumnID( "M_CUST", "RM_INP_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// 消費税適用区分
		columnID = mstappr.getColumnID( "M_CUST", "TAX_APPLY_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_APPLY_TYP(),columnID);
		// 消費税コード
		columnID = mstappr.getColumnID( "M_CUST", "TAX_CD");
		mstappr.setDetailByColumnID(struct.getTAX_CD(),columnID);
		// 消費税計算区分
		columnID = mstappr.getColumnID( "M_CUST", "TAX_CALC_TYP");
		mstappr.setDetailByColumnID(struct.getTAX_CALC_TYP(),columnID);
		// 単価ランク
		columnID = mstappr.getColumnID( "M_CUST", "PRICE_RANK_CD");
		mstappr.setDetailByColumnID("",columnID);
		// 単価計算まるめ区分
		columnID = mstappr.getColumnID( "M_CUST", "PRICE_ROUND_TYP");
		if(struct.getPRICE_ROUND_TYP() != null && !"".equals(struct.getPRICE_ROUND_TYP())){
			mstappr.setDetailByColumnID(struct.getPRICE_ROUND_TYP(),columnID);			
		}else{
			mstappr.setDetailByColumnID("1",columnID);						
		}
		// 明細計算まるめ区分
		columnID = mstappr.getColumnID( "M_CUST", "DETAIL_ROUND_TYP");
		mstappr.setDetailByColumnID(struct.getDETAIL_ROUND_TYP(),columnID);
		// 割引率計算区分
		columnID = mstappr.getColumnID( "M_CUST", "DISCOUNT_RATE_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// 標準割引率
		columnID = mstappr.getColumnID( "M_CUST", "STD_DISCOUNT_RATE");
		mstappr.setDetailByColumnID("1",columnID);
		// 標準単価適用区分
		columnID = mstappr.getColumnID( "M_CUST", "STD_PRICE_APPLY_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// 分納出荷指示フラグ
		columnID = mstappr.getColumnID( "M_CUST", "PARTIAL_SHIP_INST_FLG");
		mstappr.setDetailByColumnID(struct.getPARTIAL_SHIP_INST_FLG(),columnID);
		// 社内伝票発行フラグ
		columnID = mstappr.getColumnID( "M_CUST", "OWN_SLIP_ISS_FLG");
		mstappr.setDetailByColumnID("1",columnID);
		// 売上伝票ＩＤ
		columnID = mstappr.getColumnID( "M_CUST", "SALES_SLIP_ID");
		mstappr.setDetailByColumnID("",columnID);
		// 伝票印字制約１
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_1");
		mstappr.setDetailByColumnID("0",columnID);
		// 伝票印字制約2
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_2");
		mstappr.setDetailByColumnID("0",columnID);
		// 伝票印字制約3
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_3");
		mstappr.setDetailByColumnID("0",columnID);
		// 伝票印字制約4
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_4");
		mstappr.setDetailByColumnID("0",columnID);
		// 伝票印字制約5
		columnID = mstappr.getColumnID( "M_CUST", "SLIP_PRINTING_TYP_5");
		mstappr.setDetailByColumnID("0",columnID);
		// 取引先コード
		columnID = mstappr.getColumnID( "M_CUST", "VEND_CD");
		mstappr.setDetailByColumnID("",columnID);
		// 取引開始日
		columnID = mstappr.getColumnID( "M_CUST", "TRN_START_DATE");
		mstappr.setDetailByColumnID("",columnID);
		// 取引終了日
		columnID = mstappr.getColumnID( "M_CUST", "TRN_END_DATE");
		mstappr.setDetailByColumnID("",columnID);
		// ＥＤＩ取引区分（所要計画）
		columnID = mstappr.getColumnID( "M_CUST", "EDI_REQ_PLAN_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// ＥＤＩ取引区分（受注）
		columnID = mstappr.getColumnID( "M_CUST", "EDI_ODR_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// ＥＤＩ取引区分（納入指示）
		columnID = mstappr.getColumnID( "M_CUST", "EDI_DLV_INST_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// ＥＤＩ取引区分（受領）
		columnID = mstappr.getColumnID( "M_CUST", "EDI_RCV_TRN_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// ＥＤＩ相手取引先コード
		columnID = mstappr.getColumnID( "M_CUST", "EDI_CUST_VEND_CD");
		mstappr.setDetailByColumnID(struct.getEDI_CUST_VEND_CD(),columnID);
		// ＥＤＩ自社取引先コード
		columnID = mstappr.getColumnID( "M_CUST", "EDI_OWN_VEND_CD");
		mstappr.setDetailByColumnID("",columnID);
		// 与信限度額売掛
		columnID = mstappr.getColumnID( "M_CUST", "CREDIT_LIMIT_AR");
		mstappr.setDetailByColumnID("0",columnID);
		// 与信限度額債権
		columnID = mstappr.getColumnID( "M_CUST", "CREDIT_LIMIT_CR");
		mstappr.setDetailByColumnID("0",columnID);
		// 得意先ランク
		columnID = mstappr.getColumnID( "M_CUST", "CUST_RANK_CD");
		mstappr.setDetailByColumnID("",columnID);
		// 諸口得意先区分
		columnID = mstappr.getColumnID( "M_CUST", "CUST_VARIOUS_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// 重点得意先区分
		columnID = mstappr.getColumnID( "M_CUST", "PRIORITY_CUST_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// リベートフラグ
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_FLG");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート計算区分
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_CALC_TYP");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート計算起算月
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_CALC_START_MONTH");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート条件区分
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_COND_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// リベート条件金額
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_COND_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート条件数量
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_COND_QTY");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート対象区分
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_TARGET_TYP");
		mstappr.setDetailByColumnID("1",columnID);
		// リベート率
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_RATE");
		mstappr.setDetailByColumnID("0",columnID);
		// リベート金額
		columnID = mstappr.getColumnID( "M_CUST", "REBATE_AMOUNT");
		mstappr.setDetailByColumnID("0",columnID);
		// 自社担当部門コード
		columnID = mstappr.getColumnID( "M_CUST", "OWN_ORG_CD");
		mstappr.setDetailByColumnID(struct.getOWN_ORG_CD(),columnID);
		// 自社担当者コード
		columnID = mstappr.getColumnID( "M_CUST", "OWN_PERSON_CD");
		mstappr.setDetailByColumnID(struct.getOWN_PERSON_CD(),columnID);
		//内示有効期間
		columnID = mstappr.getColumnID( "M_CUST", "UNCONFIRM_ODR_EFF_PRIOD");
		if(struct.getUNCONFIRM_ODR_EFF_PRIOD() == null || "".equals(struct.getUNCONFIRM_ODR_EFF_PRIOD())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getUNCONFIRM_ODR_EFF_PRIOD(),columnID);			
		}
		//内示有効期間フラグ
		columnID = mstappr.getColumnID( "M_CUST", "UNCONFIRM_ODR_EFF_TERM_FLG");
		if(struct.getUNCONFIRM_ODR_EFF_TERM_FLG() == null || "".equals(struct.getUNCONFIRM_ODR_EFF_TERM_FLG())){
			mstappr.setDetailByColumnID("0",columnID);			
		}else{
			mstappr.setDetailByColumnID(struct.getUNCONFIRM_ODR_EFF_TERM_FLG(),columnID);			
		}
		// 預託倉庫区分
		columnID = mstappr.getColumnID( "M_CUST", "DEPO_TYP");
		mstappr.setDetailByColumnID("10",columnID);
		// 作成日
		columnID = mstappr.getColumnID("M_CUST","CREATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// 作成者
		columnID = mstappr.getColumnID("M_CUST","CREATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 作成プログラム名
		columnID = mstappr.getColumnID("M_CUST","CREATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// 更新日
		columnID = mstappr.getColumnID("M_CUST","UPDATED_DATE");
		mstappr.setDetailByColumnID(mstappr.readSystemDateTime(),columnID);
		// 更新者
		columnID = mstappr.getColumnID("M_CUST","UPDATED_BY");
		mstappr.setDetailByColumnID(this.getsysUSER_CD(),columnID);
		// 更新プログラム名
		columnID = mstappr.getColumnID("M_CUST","UPDATED_PRG_NM");
		mstappr.setDetailByColumnID(this.getScreenId(),columnID);
		// 更新数
		columnID = mstappr.getColumnID("M_CUST","MODIFY_COUNT");
		mstappr.setDetailByColumnID("0",columnID);  
		//得意先分類０１
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_01_TYP");
		mstappr.setDetailByColumnID("1001",columnID);   
		//得意先分類０１コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_01_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０１名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_01_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０2
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_02_TYP");
		mstappr.setDetailByColumnID("1002",columnID);   
		//得意先分類０2コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_02_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０2名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_02_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０3
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_03_TYP");
		mstappr.setDetailByColumnID("1003",columnID);   
		//得意先分類０3コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_03_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０3名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_03_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０4
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_04_TYP");
		mstappr.setDetailByColumnID("1004",columnID);   
		//得意先分類０4コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_04_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０4名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_04_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０5
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_05_TYP");
		mstappr.setDetailByColumnID("1005",columnID);   
		//得意先分類０5コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_05_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０5名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_05_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０6
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_06_TYP");
		mstappr.setDetailByColumnID("1006",columnID);   
		//得意先分類０6コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_06_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０6名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_06_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０7
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_07_TYP");
		mstappr.setDetailByColumnID("1007",columnID);   
		//得意先分類０7コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_07_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０7名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_07_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０8
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_08_TYP");
		mstappr.setDetailByColumnID("1008",columnID);   
		//得意先分類０8コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_08_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０8名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_08_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０9
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_09_TYP");
		mstappr.setDetailByColumnID("1009",columnID);   
		//得意先分類０9コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_09_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類０9名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_09_NM");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類10
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_10_TYP");
		mstappr.setDetailByColumnID("1010",columnID);   
		//得意先分類10コード
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_10_CD");
		mstappr.setDetailByColumnID("",columnID); 
		//得意先分類10名称
		columnID = mstappr.getColumnID("M_CUST","CUST_CLASS_10_NM");
		mstappr.setDetailByColumnID("",columnID);
		
		// 承認明細にデータを追加する。
		mstappr.insertMST_APPR_DETAIL("M_CUST",appr_ID);
    	
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
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
			// TODO: ユーザ定義のコードを記述してください
		try {

			boolean ok_flg = true;

			//画面モード取得
			String strKMode="";
			strKMode = (String)struct.getk_MODE();

			if("INSERT".equals(strKMode)){

				//会社コードを読込
				List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				//登録の時チェック
				// 顧客情報の存在確認
				List w = entity.mselect.read(conn, struct);
				if (w.size() > 0) {
					ok_flg = false;
					setErrorMessage("ZZ01102");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				}else if(!isValidContents()){
					// 入力内容チェック
					ok_flg = false;
				}
			}else if("UPDATE".equals(strKMode)){

				//更新の時チェック
				// 更新確認
				KA0100010Struct st = (KA0100010Struct)list.get(0);
				if(isUpdatable(st) == false){
					//更新できない状態
					//エラー処理
					ok_flg =false;
				}else if(!isValidContents()){
					// 入力内容チェック
					ok_flg = false;
				}
			}else if("DELETE".equals(strKMode)){

				//会社コードを読込
				List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				//削除の時チェック
				// 顧客情報の存在確認
				List w = entity.mselect.read(conn, struct);
				if (w.size() == 0) {
					ok_flg = false;
					setErrorMessage("ZZ01105");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				}
				//存在ﾁｪｯｸ
				boolean blnChkT_ODR_CTL = entity.mcheckT_ODR_CTL.check(conn, struct);
				if (blnChkT_ODR_CTL == true) {
					ok_flg = false;
					setErrorMessage("KA00026");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
				}
			}else{

				//会社コードを読込
				List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

				
				MstAppr mstappr = new MstAppr(this.conn,this.getsysPLANT_CD(),this.getsysUSER_CD(),"KA0100010","KA0100010Servlet");
				
				// 承認画面の「承認後」ボタンから遷移する時
				if("1".equals(struct.geth_APR_CUST()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){				
					list = mstappr.selectMST_APPR_DETAIL(_APPR_ID);
				} else {
					// 正常の読込と承認画面の「承認前」ボタンから遷移する時
					list = entity.mselect.read(conn, struct);
				}
				
				//list = entity.mselect.read(conn, struct);

				if (list.size() != 0) {
					if("1".equals(struct.geth_APR_CUST()) && "1".equals(_SCREENMOVE_TYP)&& isScreenMove()){
						MstApprDetailStruct tempStruct = (MstApprDetailStruct) list.get(0);
						list.clear();
						String columnID;
						// 得意先名
						columnID = mstappr.getColumnID( "M_CUST", "CUST_NAME");
						struct.setCUST_NAME(mstappr.getDetailByColumnID(tempStruct,columnID));
						
						// 得意先名略称
						columnID = mstappr.getColumnID( "M_CUST", "CUST_ANAME");
						struct.setCUST_ANAME(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 得意先名（カナ）
						columnID = mstappr.getColumnID( "M_CUST", "CUST_KNAME");
						struct.setCUST_KNAME(mstappr.getDetailByColumnID(tempStruct,columnID));	
						// 自社担当部門コード
						columnID = mstappr.getColumnID( "M_CUST", "OWN_ORG_CD");
						struct.setOWN_ORG_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 自社担当部門名
						List mOrgList = entity.mcheckOWN_ORG_CD.read(conn,struct);
						if(mOrgList.size() > 0){
							struct.setORG_NAME(((KA0100010Struct)mOrgList.get(0)).getORG_NAME());
						}
						// 自社担当者コード
						columnID = mstappr.getColumnID( "M_CUST", "OWN_PERSON_CD");
						struct.setOWN_PERSON_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 自社担当者名
						List userMstList = entity.mcheckOWN_PERSON_CD.read(conn,struct);
						if(userMstList.size() > 0){
							struct.setUSER_NAME(((KA0100010Struct)userMstList.get(0)).getUSER_NAME());
						}
						// 通貨コード
						columnID = mstappr.getColumnID( "M_CUST", "CUR_CD");
						struct.setCUR_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 通貨名
						List mCurList = entity.mcheckCUR_CD.read(conn,struct);
						if(mCurList.size() > 0){
							struct.setCUR_NAME(((KA0100010Struct)mCurList.get(0)).getCUR_NAME());
						}
						// 為替種別
						columnID = mstappr.getColumnID( "M_CUST", "EXCH_TYP");
						struct.setEXCH_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 検収区分
						columnID = mstappr.getColumnID( "M_CUST", "INSPC_ACPT_TYP");
						struct.setINSPC_ACPT_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 消費税適用区分
						columnID = mstappr.getColumnID( "M_CUST", "TAX_APPLY_TYP");
						struct.setTAX_APPLY_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 消費税コード
						columnID = mstappr.getColumnID( "M_CUST", "TAX_CD");
						struct.setTAX_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 消費税名
						List mTaxList = entity.mselectM_TAX.read(conn,struct);
						if(mTaxList.size() > 0){
							struct.setTAX_NAME(((KA0100010Struct)mTaxList.get(0)).getTAX_NAME());							
						}
						// 消費税計算区分
						columnID = mstappr.getColumnID( "M_CUST", "TAX_CALC_TYP");
						struct.setTAX_CALC_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 分納出荷指示フラグ
						columnID = mstappr.getColumnID( "M_CUST", "PARTIAL_SHIP_INST_FLG");
						struct.setPARTIAL_SHIP_INST_FLG(mstappr.getDetailByColumnID(tempStruct,columnID));
						// ＥＤＩ相手取引先コード
						columnID = mstappr.getColumnID( "M_CUST", "EDI_CUST_VEND_CD");
						struct.setEDI_CUST_VEND_CD(mstappr.getDetailByColumnID(tempStruct,columnID));
						// 明細計算まるめ区分
						columnID = mstappr.getColumnID( "M_CUST", "DETAIL_ROUND_TYP");
						struct.setDETAIL_ROUND_TYP(mstappr.getDetailByColumnID(tempStruct,columnID));
					}else{
						struct.copy((KA0100010Struct)list.get(0));
						//画面遷移パラメータを再取得
						struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
					}
					_mode = _SELECT;
				} else {
					ok_flg = false;
					setErrorMessage("ZZ06001");
					setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
					
					// データが存在しない場合のクリア処理
					String w_custcd = struct.getCUST_CD();	// キー情報の退避
					struct.initialize();                    // 表示項目をデフォルトに戻す
					struct.setCUST_CD(w_custcd);			// キー情報の設定

				}
			}
			setComboData(struct);

			// 読込ステータス設定
			setReadStatus(NORMAL);
			struct.seth_CUST_CD(struct.getCUST_CD());

			if(!"RESELECT".equals(strKMode)){
				//警告以外のエラーが何もない場合OKにする
				if(ok_flg == true){
					setReadStatus(NORMAL);
				}else{
					setReadStatus(NOT_FOUND);
				}
			}

		} catch(SQLException e) {
			// 読込ステータス設定
			setReadStatus(ERROR);
			throw new ExpjException(e);
		}
                //}}user_implement_dev:<controlselect>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsert() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlinsert");
			//{{user_implement_dev:<controlinsert>
			// TODO: ユーザ定義のコードを記述してください
		try {
			// 処理結果フラグをNGに設定
			//struct.seth_RESULT("NG");

			//会社コードを読込
			List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			// 顧客情報の存在確認
			List w = entity.mselect.read(conn, struct);
			if (w.size() > 0) {
				setErrorMessage("ZZ01102");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());

			}else{
				// 入力内容チェック
				isValidContents();

			}
			// エラーが発生していない場合、登録処理実施
			if(msgStruct.sizeError() <= 0){
				
				if("1".equals(struct.geth_APR_CUST())){				
					// 得意先承認の登録
					boolean rtn = insertAppr("1");
					if(!rtn) return;
				} else {
					// 得意先の登録
					entity.minsertM_CUST.create(conn, struct);
				}
				//コメント
                conn.commit();
                
                if("0".equals(struct.geth_APR_CUST())){
    				// 検索
    				struct.setk_MODE("RESELECT");
    				controlselect();                	
                }
			}
			setComboData(struct);

		} catch(SQLException e) {
			// エラーメッセージ作成
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlinsert>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlinsert");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlupdate() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");
			//{{user_implement_dev:<controlupdate>
			// TODO: ユーザ定義のコードを記述してください
		try {
			conn.beginTransWeb();		// トランザクション開始

			//更新の時チェック
			// 更新確認
			KA0100010Struct st = (KA0100010Struct)list.get(0);
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
				struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());
				//「得意先承認」が１の場合
				if("1".equals(struct.geth_APR_CUST())){				
					// 承認情報の登録
					boolean rtn = insertAppr("2");
					if(!rtn) return;
				} else {	
					//「得意先承認」が１以外の場合

					entity.mupdateM_CUST.update(conn, struct);
				}
				//コメント
				conn.commit();
                
                if("0".equals(struct.geth_APR_CUST())){
    				// 検索
    				struct.setk_MODE("RESELECT");
    				controlselect();                	
                }
			}
			setComboData(struct);

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
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlupdate");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
			// TODO: ユーザ定義のコードを記述してください
			struct.initialize();
			setComboData(struct);
			// モード設定
			_mode = _NORMAL;

			// 読込ステータス設定
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlclear>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controldelete() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controldelete");
			//{{user_implement_dev:<controldelete>
		String OPTION_ID="B*";
			// TODO: ユーザ定義のコードを記述してください
		try {

			//会社コードを読込
			List listCheck = entity.mselectSYS_MY_COMPANY.read(conn, struct);
			struct.setSYS_COMPANY_CD(((KA0100010Struct)listCheck.get(0)).getSYS_COMPANY_CD());

			//受注管理存在ﾁｪｯｸ
			boolean blnChkT_ODR_CTL = entity.mcheckT_ODR_CTL.check(conn, struct);
			if (blnChkT_ODR_CTL == true) {
				setErrorMessage("KA00026");
				setErrorMessage("ZZ01006","M_CUST.CUST_CD:"+struct.getCUST_CD());
			}
			
			// 製品マスタの存在チェック
			if (entity.mcheckM_ITEM_SPEC.check(conn, struct)) {
				// エラーメッセージ設定
				setErrorMessage("AA00173");
				setErrorMessage("ZZ01006", "M_ITEM_SPEC.CUST_CD:" + struct.getCUST_CD() );
			}
    
			// 製品単価マスタの存在チェック
			if (entity.mcheckM_UNIT_COST.check(conn, struct)) {
				// エラーメッセージ設定
				setErrorMessage("AA00174");
				setErrorMessage("ZZ01006", "M_UNIT_COST.CUST_CD:" + struct.getCUST_CD() );
			}
			
			// 得意先納品場所の存在チェック
			if (entity.mcheckM_CUST_BASE.check(conn, struct)) {
				// エラーメッセージ設定
				setErrorMessage("KA20029");
				setErrorMessage("ZZ01006", "M_CUST_BASE.CUST_CD:" + struct.getCUST_CD() );
			}
            // 販売所要計画マスタの存在チェック
    		if(entity.mcheckT_SALES_PLAN.check(conn, struct)){
    			setErrorMessage("CA00185");
    			setErrorMessage("ZZ01006","T_SALES_PLAN.CUST_CD:"+struct.getCUST_CD());
    		}
    	    // 受注ヘッダマスタの存在チェック
    		if(entity.mcheckT_ODR_H.check(conn, struct)){
    			setErrorMessage("CA00186");
    			setErrorMessage("ZZ01006","T_ODR_H.CUST_CD:"+struct.getCUST_CD());
    	    }
    		// 出荷指示マスタの存在チェック
    		if(entity.mcheckT_SHIP_ODR.check(conn, struct)){
    			setErrorMessage("CA00187");
    			setErrorMessage("ZZ01006","T_SHIP_ODR.CUST_CD:"+struct.getCUST_CD());
    	    }
    		// 出荷実績マスタの存在チェック
    		if(entity.mcheckT_SHIP.check(conn, struct)){
    			setErrorMessage("CA00188");
    			setErrorMessage("ZZ01006","T_SHIP.CUST_CD:"+struct.getCUST_CD());
    		}
    		// 売上実績マスタの存在チェック
    		if(entity.mcheckT_SALES.check(conn, struct)){
    			setErrorMessage("CA00189");
    			setErrorMessage("ZZ01006","T_SALES.CUST_CD:"+struct.getCUST_CD());
    		}
			struct.setOPTION_ID(OPTION_ID);
			List tempList  = entity.mgetSYS_INSTALL_OPTIONS.read(conn, struct);
			KA0100010Struct tempStruct = new KA0100010Struct();
			if(tempList!=null&&tempList.size()>0){
				tempStruct = (KA0100010Struct)tempList.get(0);
				struct.setINSTALL_FLG(tempStruct.getINSTALL_FLG());
			}
			if("1".equals(struct.getINSTALL_FLG())){
				//請求条件チェック
				if (entity.mcheckM_CUST_STL_CTRL.check(conn, struct)) {
					setErrorMessage("BA90005");
					setErrorMessage("ZZ01006","M_CUST_STL_CTRL.CUST_CD:"+struct.getCUST_CD());
				}
				// 売掛金トランヘッダマスタの存在チェック
				if(entity.mcheckT_AR_LEDGER_H_TRN.check(conn, struct)){
	    			setErrorMessage("BA90004");
	    			setErrorMessage("ZZ01006","T_AR_LEDGER_H_TRN.CUST_CD:"+struct.getCUST_CD());
	    		}
	            // 売掛金元帳ヘッダマスタの存在チェック
	    		if(entity.mcheckT_AR_LEDGER_H.check(conn, struct)){
	    			setErrorMessage("BA90003");
	    			setErrorMessage("ZZ01006","T_AR_LEDGER_H.CUST_CD:"+struct.getCUST_CD());
	    		}
	            // 売掛金残高マスタの存在チェック
	    		if(entity.mcheckT_AR_BALANCE.check(conn, struct)){
	    			setErrorMessage("CA00191");
	    			setErrorMessage("ZZ01006","T_AR_BALANCE.CUST_CD:"+struct.getCUST_CD());
	    		}
	    		// 残高明細マスタの存在チェック
	    		if(entity.mcheckT_AR_BALANCE_D.check(conn, struct)){
	    			setErrorMessage("CA00192");
	    			setErrorMessage("ZZ01006","T_AR_BALANCE_D.CUST_CD:"+struct.getCUST_CD());
	    		}
	    		// 入金元帳ヘッダマスタの存在チェック
	    		if(entity.mcheckT_RM_LEDGER_H.check(conn, struct)){
	    			setErrorMessage("CA00193");
	    			setErrorMessage("ZZ01006","T_RM_LEDGER_H.CUST_CD:"+struct.getCUST_CD());
	    	    }
	    		// 入金トランヘッダマスタの存在チェック
	    		if(entity.mcheckT_RM_LEDGER_H_TRN.check(conn, struct)){
	    			setErrorMessage("CA00194");
	    			setErrorMessage("ZZ01006","T_RM_LEDGER_H_TRN.CUST_CD:"+struct.getCUST_CD());
	    	    }
			}
			//MODIFYCOUNTのチェック
            isUpdatable(struct);
			// エラーが発生していない場合、削除処理実施
			if(msgStruct.sizeError() <= 0) {
				
				//「得意先承認」が１の場合
				if("1".equals(struct.geth_APR_CUST())){				
					// 承認情報の登録
					boolean rtn = insertAppr("3");
					if(!rtn) return;
				} else {	
					//「得意先承認」が１以外の場合
					entity.mdeleteM_CUST.delete(conn, struct);
				}
                //コミット				
                conn.commit();
				controlclear();
				_mode = _NORMAL;
                struct.initialize();
			}

			//画面を初期化
			setComboData(struct);

		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controldelete>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controldelete");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlclose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");
			//{{user_implement_dev:<controlclose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlclose>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlclose");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KA0100");
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
		try{
			//画面遷移パラメータを取得
			_SCREENMOVE_TYP = struct.geth_SCREENMOVE_TYP();
			_APPR_ID = struct.geth_APPR_ID();
			// クリア処理
			controlclear();

           	setComboData(struct);

			// モード設定
			_mode = _NORMAL;
	        
	        /** パラメータ「得意先承認」を取得*/
	        privateConfig = new PrivateConfig(conn);	        
	        // 得意先承認
	        aprMCust = privateConfig.getString("APR_CUST");
	        // パラメータ「得意先承認」が取得できなかった場合
			if(aprMCust ==null || "".equals(aprMCust)) {
 				String locale = CoreTools.getLocale(struct.getsUser_ID());
 				ResourceBundle messages = CoreTools.getResourceBundle("ExpjMessage", locale);
 				//ExpjMessage emsg = new ExpjMessage("AZ00041", messages.getString("AZ00045"));
				setErrorMessage("AZ00041" , messages.getString("AZ00045"));
				struct.seth_APR_CUST("0");
			} else if("1".equals(aprMCust)) {
				// １の場合
				struct.seth_APR_CUST("1");
			} else {
				// １以外の場合
				struct.seth_APR_CUST("0");
			}

            // add 標準G ↓
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolselect()を呼び出す
			if ( isScreenMove()== true ) {
				struct.setCUST_CD( _custCd );
				//承認依頼情報からパラメータを取得
				if("1".equals(_SCREENMOVE_TYP) || "0".equals(_SCREENMOVE_TYP)){
					struct.setCUST_CD(keyvalueMap.get("CUST_CD").toString());
					struct.setSYS_COMPANY_CD(keyvalueMap.get("COMPANY_CD").toString());
					struct.seth_SCREENMOVE_TYP(_SCREENMOVE_TYP);
				}
				controlselect();
			}
            // add 標準G ↑

		}catch (ComboException e) {
			throw new ExpjException(e);
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage( "ZZ01006" ," (SBM1093)リロード処理は失敗しました。");
			msgStruct.addWarn( emsg );
			sysLog.info(emsg, getsysUSER_CD());
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

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
		logger.entering("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		logger.exiting("KA0100010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
		// リストボックス部品のデータのセットはここに記述してください。

		//通貨コードを取得
		/*try{
			List curList = new ArrayList();
			List curNameList = new ArrayList();
			List curValueList = new ArrayList();

			curList = entity.mselectM_CUR.read(conn, struct);

			for(int i = 0; i < curList.size(); i++) {
				curNameList.add(((KA0100010Struct)curList.get(i)).getCUR_CD_name());
				curValueList.add(((KA0100010Struct)curList.get(i)).getCUR_CD_val());
			}
			struct.setList_CUR_CD_name(curNameList);
			struct.setList_CUR_CD_val(curValueList);
		}
		catch(SQLException e){
			throw new ExpjException(e);
		}

		//顧客重点区分のリスト用データ取得
		try{
			List ciList = new ArrayList();
			List ciNameList = new ArrayList();
			List ciValueList = new ArrayList();

			ciList = entity.mselectCUST_IMPORTANT_TYP.read(conn, struct);

			for(int i = 0; i < ciList.size(); i++) {
				ciNameList.add(((KA0100010Struct)ciList.get(i)).getCUST_IMPORTANT_TYP_name());
				ciValueList.add(((KA0100010Struct)ciList.get(i)).getCUST_IMPORTANT_TYP_val());
			}
			struct.setList_CUST_IMPORTANT_TYP_name(ciNameList);
			struct.setList_CUST_IMPORTANT_TYP_val(ciValueList);
		}
		catch(SQLException e){
			throw new ExpjException(e);
		}*/

		setComboData(struct); 
		if("1".equals(aprMCust)) {
			// １の場合
			struct.seth_APR_CUST("1");
		} else {
			// １以外の場合
			struct.seth_APR_CUST("0");
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
//			throw new FoundationException("KA0100010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100010-E999","CSVの出力処理"));
			throw new FoundationException("KA0100010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100010-E999","システム日付の取得処理"));
				throw new FoundationException("KA0100010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KA0100010-E999","コントロールのイベント処理"));
			throw new FoundationException("KA0100010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KA0100010Entity entity;
	protected KA0100010Struct struct;
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

		entity = new KA0100010Entity();
		struct = new KA0100010Struct();

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
	 * KA0100010クラスの標準コンストラクタ
	 */
	public KA0100010Control() throws BusinessProcessException, FoundationException
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
				KA0100010Struct key = (KA0100010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("EXCH_TYP_name") && key.getEXCH_TYP_name() != null) {
					msgKey.setKeyValue("EXCH_TYP_name", key.getEXCH_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP_val") && key.getEXCH_TYP_val() != null) {
					msgKey.setKeyValue("EXCH_TYP_val", key.getEXCH_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_name") && key.getTAX_APPLY_TYP_name() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP_name", key.getTAX_APPLY_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_val") && key.getTAX_APPLY_TYP_val() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP_val", key.getTAX_APPLY_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_name") && key.getTAX_CALC_TYP_name() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP_name", key.getTAX_CALC_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_val") && key.getTAX_CALC_TYP_val() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP_val", key.getTAX_CALC_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_name") && key.getPARTIAL_SHIP_INST_FLG_name() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG_name", key.getPARTIAL_SHIP_INST_FLG_name());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_val") && key.getPARTIAL_SHIP_INST_FLG_val() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG_val", key.getPARTIAL_SHIP_INST_FLG_val());
				}
				if(msgKeyType.containsKeyColumn("h_RESULT") && key.geth_RESULT() != null) {
					msgKey.setKeyValue("h_RESULT", key.geth_RESULT());
				}
				if(msgKeyType.containsKeyColumn("k_MODE") && key.getk_MODE() != null) {
					msgKey.setKeyValue("k_MODE", key.getk_MODE());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_name") && key.getINSPC_ACPT_TYP_name() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP_name", key.getINSPC_ACPT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_val") && key.getINSPC_ACPT_TYP_val() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP_val", key.getINSPC_ACPT_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_name") && key.getDETAIL_ROUND_TYP_name() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP_name", key.getDETAIL_ROUND_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_val") && key.getDETAIL_ROUND_TYP_val() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP_val", key.getDETAIL_ROUND_TYP_val());
				}
				if(msgKeyType.containsKeyColumn("h_CUR_CD") && key.geth_CUR_CD() != null) {
					msgKey.setKeyValue("h_CUR_CD", key.geth_CUR_CD().toString());
				}
				if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP") && key.geth_INSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("h_INSPC_ACPT_TYP", key.geth_INSPC_ACPT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("h_TAX_CALC_TYP") && key.geth_TAX_CALC_TYP() != null) {
					msgKey.setKeyValue("h_TAX_CALC_TYP", key.geth_TAX_CALC_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP") && key.geth_PRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("h_PRICE_ROUND_TYP", key.geth_PRICE_ROUND_TYP().toString());
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
				if(msgKeyType.containsKeyColumn("h_APR_CUST") && key.geth_APR_CUST() != null) {
					msgKey.setKeyValue("h_APR_CUST", key.geth_APR_CUST());
				}
				if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD") && key.getSYS_COMPANY_CD() != null) {
					msgKey.setKeyValue("SYS_COMPANY_CD", key.getSYS_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("T_CUST_CD") && key.getT_CUST_CD() != null) {
					msgKey.setKeyValue("T_CUST_CD", key.getT_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("CUST_NAME") && key.getCUST_NAME() != null) {
					msgKey.setKeyValue("CUST_NAME", key.getCUST_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_ANAME") && key.getCUST_ANAME() != null) {
					msgKey.setKeyValue("CUST_ANAME", key.getCUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("CUST_KNAME") && key.getCUST_KNAME() != null) {
					msgKey.setKeyValue("CUST_KNAME", key.getCUST_KNAME());
				}
				if(msgKeyType.containsKeyColumn("OWN_ORG_CD") && key.getOWN_ORG_CD() != null) {
					msgKey.setKeyValue("OWN_ORG_CD", key.getOWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("OWN_PERSON_CD") && key.getOWN_PERSON_CD() != null) {
					msgKey.setKeyValue("OWN_PERSON_CD", key.getOWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("CUR_CD") && key.getCUR_CD() != null) {
					msgKey.setKeyValue("CUR_CD", key.getCUR_CD());
				}
				if(msgKeyType.containsKeyColumn("EXCH_TYP") && key.getEXCH_TYP() != null) {
					msgKey.setKeyValue("EXCH_TYP", key.getEXCH_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CD") && key.getTAX_CD() != null) {
					msgKey.setKeyValue("TAX_CD", key.getTAX_CD());
				}
				if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP") && key.getTAX_APPLY_TYP() != null) {
					msgKey.setKeyValue("TAX_APPLY_TYP", key.getTAX_APPLY_TYP());
				}
				if(msgKeyType.containsKeyColumn("TAX_CALC_TYP") && key.getTAX_CALC_TYP() != null) {
					msgKey.setKeyValue("TAX_CALC_TYP", key.getTAX_CALC_TYP());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_PRIOD") && key.getUNCONFIRM_ODR_EFF_PRIOD() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_EFF_PRIOD", key.getUNCONFIRM_ODR_EFF_PRIOD());
				}
				if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_TERM_FLG") && key.getUNCONFIRM_ODR_EFF_TERM_FLG() != null) {
					msgKey.setKeyValue("UNCONFIRM_ODR_EFF_TERM_FLG", key.getUNCONFIRM_ODR_EFF_TERM_FLG());
				}
				if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG") && key.getPARTIAL_SHIP_INST_FLG() != null) {
					msgKey.setKeyValue("PARTIAL_SHIP_INST_FLG", key.getPARTIAL_SHIP_INST_FLG());
				}
				if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP") && key.getINSPC_ACPT_TYP() != null) {
					msgKey.setKeyValue("INSPC_ACPT_TYP", key.getINSPC_ACPT_TYP());
				}
				if(msgKeyType.containsKeyColumn("PRICE_ROUND_TYP") && key.getPRICE_ROUND_TYP() != null) {
					msgKey.setKeyValue("PRICE_ROUND_TYP", key.getPRICE_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP") && key.getDETAIL_ROUND_TYP() != null) {
					msgKey.setKeyValue("DETAIL_ROUND_TYP", key.getDETAIL_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("EDI_CUST_VEND_CD") && key.getEDI_CUST_VEND_CD() != null) {
					msgKey.setKeyValue("EDI_CUST_VEND_CD", key.getEDI_CUST_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ORG_NAME") && key.getORG_NAME() != null) {
					msgKey.setKeyValue("ORG_NAME", key.getORG_NAME());
				}
				if(msgKeyType.containsKeyColumn("USER_NAME") && key.getUSER_NAME() != null) {
					msgKey.setKeyValue("USER_NAME", key.getUSER_NAME());
				}
				if(msgKeyType.containsKeyColumn("CUR_NAME") && key.getCUR_NAME() != null) {
					msgKey.setKeyValue("CUR_NAME", key.getCUR_NAME());
				}
				if(msgKeyType.containsKeyColumn("TAX_NAME") && key.getTAX_NAME() != null) {
					msgKey.setKeyValue("TAX_NAME", key.getTAX_NAME());
				}
				if(msgKeyType.containsKeyColumn("INSTALL_FLG") && key.getINSTALL_FLG() != null) {
					msgKey.setKeyValue("INSTALL_FLG", key.getINSTALL_FLG());
				}
				if(msgKeyType.containsKeyColumn("OPTION_ID") && key.getOPTION_ID() != null) {
					msgKey.setKeyValue("OPTION_ID", key.getOPTION_ID());
				}
				if(msgKeyType.containsKeyColumn("HOME_CUR_CD") && key.getHOME_CUR_CD() != null) {
					msgKey.setKeyValue("HOME_CUR_CD", key.getHOME_CUR_CD());
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
					KA0100010Struct key = new KA0100010Struct();
					if(msgKeyType.containsKeyColumn("EXCH_TYP_name")) {
						key.setEXCH_TYP_name(msgKey.getKeyValue("EXCH_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP_val")) {
						key.setEXCH_TYP_val(msgKey.getKeyValue("EXCH_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_name")) {
						key.setTAX_APPLY_TYP_name(msgKey.getKeyValue("TAX_APPLY_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP_val")) {
						key.setTAX_APPLY_TYP_val(msgKey.getKeyValue("TAX_APPLY_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_name")) {
						key.setTAX_CALC_TYP_name(msgKey.getKeyValue("TAX_CALC_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP_val")) {
						key.setTAX_CALC_TYP_val(msgKey.getKeyValue("TAX_CALC_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_name")) {
						key.setPARTIAL_SHIP_INST_FLG_name(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG_name"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG_val")) {
						key.setPARTIAL_SHIP_INST_FLG_val(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG_val"));
					}
					if(msgKeyType.containsKeyColumn("h_RESULT")) {
						key.seth_RESULT(msgKey.getKeyValue("h_RESULT"));
					}
					if(msgKeyType.containsKeyColumn("k_MODE")) {
						key.setk_MODE(msgKey.getKeyValue("k_MODE"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_name")) {
						key.setINSPC_ACPT_TYP_name(msgKey.getKeyValue("INSPC_ACPT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP_val")) {
						key.setINSPC_ACPT_TYP_val(msgKey.getKeyValue("INSPC_ACPT_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_name")) {
						key.setDETAIL_ROUND_TYP_name(msgKey.getKeyValue("DETAIL_ROUND_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP_val")) {
						key.setDETAIL_ROUND_TYP_val(msgKey.getKeyValue("DETAIL_ROUND_TYP_val"));
					}
					if(msgKeyType.containsKeyColumn("h_CUR_CD")) {
						key.seth_CUR_CD(new Double(msgKey.getKeyValue("h_CUR_CD")));
					}
					if(msgKeyType.containsKeyColumn("h_INSPC_ACPT_TYP")) {
						key.seth_INSPC_ACPT_TYP(new Double(msgKey.getKeyValue("h_INSPC_ACPT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("h_TAX_CALC_TYP")) {
						key.seth_TAX_CALC_TYP(new Double(msgKey.getKeyValue("h_TAX_CALC_TYP")));
					}
					if(msgKeyType.containsKeyColumn("h_PRICE_ROUND_TYP")) {
						key.seth_PRICE_ROUND_TYP(new Double(msgKey.getKeyValue("h_PRICE_ROUND_TYP")));
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
					if(msgKeyType.containsKeyColumn("h_APR_CUST")) {
						key.seth_APR_CUST(msgKey.getKeyValue("h_APR_CUST"));
					}
					if(msgKeyType.containsKeyColumn("SYS_COMPANY_CD")) {
						key.setSYS_COMPANY_CD(msgKey.getKeyValue("SYS_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("T_CUST_CD")) {
						key.setT_CUST_CD(msgKey.getKeyValue("T_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUST_NAME")) {
						key.setCUST_NAME(msgKey.getKeyValue("CUST_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ANAME")) {
						key.setCUST_ANAME(msgKey.getKeyValue("CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("CUST_KNAME")) {
						key.setCUST_KNAME(msgKey.getKeyValue("CUST_KNAME"));
					}
					if(msgKeyType.containsKeyColumn("OWN_ORG_CD")) {
						key.setOWN_ORG_CD(msgKey.getKeyValue("OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("OWN_PERSON_CD")) {
						key.setOWN_PERSON_CD(msgKey.getKeyValue("OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("CUR_CD")) {
						key.setCUR_CD(msgKey.getKeyValue("CUR_CD"));
					}
					if(msgKeyType.containsKeyColumn("EXCH_TYP")) {
						key.setEXCH_TYP(msgKey.getKeyValue("EXCH_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CD")) {
						key.setTAX_CD(msgKey.getKeyValue("TAX_CD"));
					}
					if(msgKeyType.containsKeyColumn("TAX_APPLY_TYP")) {
						key.setTAX_APPLY_TYP(msgKey.getKeyValue("TAX_APPLY_TYP"));
					}
					if(msgKeyType.containsKeyColumn("TAX_CALC_TYP")) {
						key.setTAX_CALC_TYP(msgKey.getKeyValue("TAX_CALC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_PRIOD")) {
						key.setUNCONFIRM_ODR_EFF_PRIOD(msgKey.getKeyValue("UNCONFIRM_ODR_EFF_PRIOD"));
					}
					if(msgKeyType.containsKeyColumn("UNCONFIRM_ODR_EFF_TERM_FLG")) {
						key.setUNCONFIRM_ODR_EFF_TERM_FLG(msgKey.getKeyValue("UNCONFIRM_ODR_EFF_TERM_FLG"));
					}
					if(msgKeyType.containsKeyColumn("PARTIAL_SHIP_INST_FLG")) {
						key.setPARTIAL_SHIP_INST_FLG(msgKey.getKeyValue("PARTIAL_SHIP_INST_FLG"));
					}
					if(msgKeyType.containsKeyColumn("INSPC_ACPT_TYP")) {
						key.setINSPC_ACPT_TYP(msgKey.getKeyValue("INSPC_ACPT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("PRICE_ROUND_TYP")) {
						key.setPRICE_ROUND_TYP(msgKey.getKeyValue("PRICE_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("DETAIL_ROUND_TYP")) {
						key.setDETAIL_ROUND_TYP(msgKey.getKeyValue("DETAIL_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("EDI_CUST_VEND_CD")) {
						key.setEDI_CUST_VEND_CD(msgKey.getKeyValue("EDI_CUST_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ORG_NAME")) {
						key.setORG_NAME(msgKey.getKeyValue("ORG_NAME"));
					}
					if(msgKeyType.containsKeyColumn("USER_NAME")) {
						key.setUSER_NAME(msgKey.getKeyValue("USER_NAME"));
					}
					if(msgKeyType.containsKeyColumn("CUR_NAME")) {
						key.setCUR_NAME(msgKey.getKeyValue("CUR_NAME"));
					}
					if(msgKeyType.containsKeyColumn("TAX_NAME")) {
						key.setTAX_NAME(msgKey.getKeyValue("TAX_NAME"));
					}
					if(msgKeyType.containsKeyColumn("INSTALL_FLG")) {
						key.setINSTALL_FLG(msgKey.getKeyValue("INSTALL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("OPTION_ID")) {
						key.setOPTION_ID(msgKey.getKeyValue("OPTION_ID"));
					}
					if(msgKeyType.containsKeyColumn("HOME_CUR_CD")) {
						key.setHOME_CUR_CD(msgKey.getKeyValue("HOME_CUR_CD"));
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
