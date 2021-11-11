/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KM0050/src/com/nec/jp/orteus/metamorBase/KM0050/KM0050010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KM0050;

import com.nec.jp.orteus.metamorBase.KM0050.*;
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
import java.math.BigDecimal;
import java.text.DecimalFormat;
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KM0050010Control クラス
 * ファイル・クラス説明
 * @author $Author: luoxiao $
 * @version $Revision: 1.1 $ $Date: 2014/06/09 03:24:05 $
 *
 */
//}}user_implement_code_header

public class KM0050010Control
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
	public KM0050010Struct getListvalue(int x) { return (KM0050010Struct)(this.list.get(x)); }	// リストの値を返します。
	public KM0050010Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KM0050010Struct createStruct() { return new KM0050010Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KM0050010Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }

	/** 画面遷移キー(案件番号) */
	private String _ProjectCd = null;

	/**
	 * 画面遷移キー(案件番号)取得
	 * @return 案件番号
	 */
	public String getProjectCd() {
		return _ProjectCd;
	}
	
	/**
	 * 画面遷移キー(案件番号)設定
	 * @param cd 案件番号
	 */
	public void setProjectCd(String cd) {
		_ProjectCd = cd;
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
	 * 金額の比率を計算する。
	 *
	 * @param String amount1
	 * @param String amount2
	 * @return String 金額の比率
	 */
	private String calculateRate(String amount1, String amount2){
		if (Double.parseDouble(amount2) == 0) {
			return "0%";
		}
		String result = Calculate.divide(amount1, amount2, 2, Calculate.ROUND);
		String tmp = Calculate.multiply(result, "100");
		result = tmp.substring(0, tmp.length()-2) + "%";
		return result;
	}

	/**
     * エラーメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     * @param param メッセージパラメータ
     */
    private void setErrorMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
        msgStruct.addError( emsg ); // エラーメッセージとして登録
        sysLog.warning(emsg, struct.getsUser_ID()); //エラー内容
    }
    /**
     * 業務ロジックのワーニングメッセージ設定処理を切り出して関数化
     * @param code メッセージコード
     */
    private void setWarningMessage(String code, String param) {
    	ExpjMessage emsg = null;
    	if (param == null) {
    		emsg = new ExpjMessage(code);
    	} else {
    		emsg = new ExpjMessage(code, param);
    	}
     msgStruct.addWarn(emsg);
     sysLog.info(emsg, sysUSER_CD);
    }

	/**
     * 案件進捗データを取得する
     * @return List 案件進捗データ
	 * @throws SQLException 
	 * @throws FoundationException 
     */
    private List getAnkenData() throws FoundationException, SQLException {
    	List ankenData = new ArrayList();
		KM0050010Struct chkProjectStruct = null ;
		KM0050010Struct st = null ;
		
		// 見積明細データを取得する
		List lstDetailData = entity.mgetDetailData.read(conn, struct);
		
		// データがない場合
		if (lstDetailData == null || lstDetailData.isEmpty()) {
			setErrorMessage("KM00010", null);
            return null;
        }
    	//[案件].”案件ステータス”が、受注、完了でない場合
    	chkProjectStruct = (KM0050010Struct) lstDetailData.get(0);
    	if(!"4".equals(chkProjectStruct.getPROJECT_STAT()) && !"9".equals(chkProjectStruct.getPROJECT_STAT())) {
			setErrorMessage("KM00011", null);
            return null;
    	}
		
    	for (int i = 0; i < lstDetailData.size(); i++) {
    		st = (KM0050010Struct) lstDetailData.get(i);
    		
			// 案件に紐づく受注情報の存在チェック
    		if (st.getODR_NO() == null) {
				setErrorMessage("KM00007", null);
    			return null;
    		}
    	}
    	
    	struct.setESTIMATE_NO(chkProjectStruct.getESTIMATE_NO()); // 見積番号
    	struct.setPROJECT_NAME(chkProjectStruct.getPROJECT_NAME()); // 案件名
    	struct.setPJ_MODIFY_COUNT(chkProjectStruct.getPJ_MODIFY_COUNT()); // 案件更新数

		// 進捗データを取得する
    	List lstProgressData = entity.mgetProgressData.read(conn, struct);
    	Map mapProgress = new HashMap(); // 進捗Mapデータ
		// データが取得でき多場合、Mapデータを作成する
		if (lstProgressData != null) {
			for (int i = 0; i < lstProgressData.size(); i++) {
				st = (KM0050010Struct) lstProgressData.get(i);
				mapProgress.put(st.getDETAL_NO(), st);
			}
		}
		
		ankenData.add(lstDetailData); // 見積明細データ
		ankenData.add(mapProgress); // 進捗データ
    	
    	return ankenData;
    }

	/**
     * 案件進捗データの合計を計算する
	 * @param stEs 見積データ
	 * @param stCmp 実績データ
	 * @param stExp 見込データ
	 * @param stDif2 差異データ 見積ー実績
	 * @param stDif3 差異データ　見込ー実績
     */
    private void sumAnkenData(KM0050010Struct stEs, KM0050010Struct stCmp, KM0050010Struct stExp, KM0050010Struct stDif2, KM0050010Struct stDif3) {

		// =======================================
		// 詳細画面合計データの計算
		// =======================================
		struct.setODR_AMOUNT_W(Calculate.add(convertNull(struct.getODR_AMOUNT_W()), stEs.getODR_AMOUNT())); // 受注金額(見積)の合計
		struct.setITEM_TOTAL_COST_W(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_W()), stEs.getITEM_TOTAL_COST())); // 予算合計(見積)の合計
		struct.setITEM_TOTAL_COST_T(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_T()), stCmp.getITEM_TOTAL_COST())); // 予算合計(実績)の合計
		struct.setITEM_TOTAL_COST_P(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_P()), stExp.getITEM_TOTAL_COST())); // 予算合計(見込)の合計
		struct.setITEM_TOTAL_COST_D(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_D()), stDif2.getITEM_TOTAL_COST())); // 予算合計(差異)の合計
		struct.setITEM_TOTAL_COST_D2(Calculate.add(convertNull(struct.getITEM_TOTAL_COST_D2()), stDif3.getITEM_TOTAL_COST())); // 予算合計(差異2)の合計
		struct.setMATERIAL_COST_W(Calculate.add(convertNull(struct.getMATERIAL_COST_W()), stEs.getES_COST_MATERIAL())); // 材料費(見積)の合計
		struct.setMATERIAL_COST_T(Calculate.add(convertNull(struct.getMATERIAL_COST_T()), stCmp.getES_COST_MATERIAL())); // 材料費(実績)の合計
		struct.setMATERIAL_COST_P(Calculate.add(convertNull(struct.getMATERIAL_COST_P()), stExp.getES_COST_MATERIAL())); // 材料費(見込)の合計
		struct.setMATERIAL_COST_D(Calculate.add(convertNull(struct.getMATERIAL_COST_D()), stDif2.getES_COST_MATERIAL())); // 材料費(差異)の合計
		struct.setMATERIAL_COST_D2(Calculate.add(convertNull(struct.getMATERIAL_COST_D2()), stDif3.getES_COST_MATERIAL())); // 材料費(差異2)の合計
		struct.setPROCESSING_COST_W(Calculate.add(convertNull(struct.getPROCESSING_COST_W()), stEs.getES_COST_PROCESS())); // 加工費(見積)の合計
		struct.setPROCESSING_COST_T(Calculate.add(convertNull(struct.getPROCESSING_COST_T()), stCmp.getES_COST_PROCESS())); // 加工費(実績)の合計
		struct.setPROCESSING_COST_P(Calculate.add(convertNull(struct.getPROCESSING_COST_P()), stExp.getES_COST_PROCESS())); // 加工費(見込)の合計
		struct.setPROCESSING_COST_D(Calculate.add(convertNull(struct.getPROCESSING_COST_D()), stDif2.getES_COST_PROCESS())); // 加工費(差異)の合計
		struct.setPROCESSING_COST_D2(Calculate.add(convertNull(struct.getPROCESSING_COST_D2()), stDif3.getES_COST_PROCESS())); // 加工費(差異2)の合計
		struct.setSBCNT_COST_W(Calculate.add(convertNull(struct.getSBCNT_COST_W()), stEs.getES_COST_OUTSOUCE())); // 外注費(見積)の合計
		struct.setSBCNT_COST_T(Calculate.add(convertNull(struct.getSBCNT_COST_T()), stCmp.getES_COST_OUTSOUCE())); // 外注費(実績)の合計
		struct.setSBCNT_COST_P(Calculate.add(convertNull(struct.getSBCNT_COST_P()), stExp.getES_COST_OUTSOUCE())); // 外注費(見込)の合計
		struct.setSBCNT_COST_D(Calculate.add(convertNull(struct.getSBCNT_COST_D()), stDif2.getES_COST_OUTSOUCE())); // 外注費(差異)の合計
		struct.setSBCNT_COST_D2(Calculate.add(convertNull(struct.getSBCNT_COST_D2()), stDif3.getES_COST_OUTSOUCE())); // 外注費(差異2)の合計
		struct.setOTHER_OVERHEADS_W(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_W()), stEs.getES_COST_ETC())); // その他経費(見積)の合計
		struct.setOTHER_OVERHEADS_T(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_T()), stCmp.getES_COST_ETC())); // その他経費(実績)の合計
		struct.setOTHER_OVERHEADS_P(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_P()), stExp.getES_COST_ETC())); // その他経費(見込)の合計
		struct.setOTHER_OVERHEADS_D(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_D()), stDif2.getES_COST_ETC())); // その他経費(差異)の合計
		struct.setOTHER_OVERHEADS_D2(Calculate.add(convertNull(struct.getOTHER_OVERHEADS_D2()), stDif3.getES_COST_ETC())); // その他経費(差異2)の合計
		struct.setSERVICE_COST_W(Calculate.add(convertNull(struct.getSERVICE_COST_W()), stEs.getES_COST_SERVICE())); // 役務費(見積)の合計
		struct.setSERVICE_COST_T(Calculate.add(convertNull(struct.getSERVICE_COST_T()), stCmp.getES_COST_SERVICE())); // 役務費(実績)の合計
		struct.setSERVICE_COST_P(Calculate.add(convertNull(struct.getSERVICE_COST_P()), stExp.getES_COST_SERVICE())); // 役務費(見込)の合計
		struct.setSERVICE_COST_D(Calculate.add(convertNull(struct.getSERVICE_COST_D()), stDif2.getES_COST_SERVICE())); // 役務費(差異)の合計
		struct.setSERVICE_COST_D2(Calculate.add(convertNull(struct.getSERVICE_COST_D2()), stDif3.getES_COST_SERVICE())); // 役務費(差異2)の合計
		struct.setPROFIT_RATIO_W(calculateRate(Calculate.subtract(
				struct.getODR_AMOUNT_W(), struct.getITEM_TOTAL_COST_W()), struct.getODR_AMOUNT_W())); // 利益率(見積)の合計
		struct.setPROFIT_RATIO_P(calculateRate(Calculate.subtract(
				struct.getODR_AMOUNT_W(), struct.getITEM_TOTAL_COST_P()), struct.getODR_AMOUNT_W())); // 利益率(見込)の合計
    }

	/**
     * 金額の合計を計算する
	 * @param arrAmount 計算用金額
     * @return String 金額の合計
     */
    private String sumAmount(String[] arrAmount) {
    	String totalCost = "0";
		// 金額合計を計算する
    	for (int i = 0; i < arrAmount.length; i++) {
			totalCost = Calculate.add(totalCost, convertNull(arrAmount[i]));
    	}
		return totalCost;
    }
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 合計表示ボタン押下時に実行される処理です。
	 *
	 */
	public void controlTotalShow() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlTotalShow");
			//{{user_implement_dev:<controlTotalShow>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlTotalShow>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlTotalShow");

		return;
	}

	/**
	 * 再計算ボタン押下時に実行される処理です。
	 *
	 */
	public void controlRecalculation() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRecalculation");
			//{{user_implement_dev:<controlRecalculation>
		try {
			KM0050010Struct st = new KM0050010Struct();
			List lstBatParm = entity.mSYS_BAT_PARM.read(conn, st);
			if (lstBatParm == null || lstBatParm.isEmpty()) {
				setErrorMessage("ZZ09007", null);
			} else {
				
				// 見積明細データを取得する
				List lstDetailData = entity.mgetDetailData.read(conn, struct);
				KM0050010Struct stParm = (KM0050010Struct) lstBatParm.get(0);
				List lstRlt = null;
				
				if (lstDetailData != null && lstDetailData.size() > 0) {
					boolean isThereError = false;
			    	for (int i = 0; i < lstDetailData.size(); i++) {
			    		st = (KM0050010Struct) lstDetailData.get(i);

						st.setpvc2LogMode(stParm.getLOG_MODE_TYP()); // ＬＯＧモード
						st.setpvc2OutputMode(stParm.getOUTPUT_MODE_TYP()); // 出力モード
						st.setpvc2OutputPath(stParm.getFILE_PATH()); // 出力ファイルパス
						st.setpvc2OutputName(stParm.getFILE_NAME()); // 出力ファイル名
						st.setpvc2UserId(this.getsysUSER_CD()); // ユーザＩＤ
						st.setpvc2BusinessName(this.getScreenId()); // 業務名
						st.setpvc2PlantCd(this.getsysPLANT_CD()); // 工場コード
						st.setpnumFlag("0");//処理フラグ(個別実行)
						st.setpvc2OdrNo(st.getODR_NO()); // 受注番号
						st.setpvc2PProjectCd(struct.getPROJECT_CD()); // 案件番号
						st.setpnumEstimateNo(st.getESTIMATE_NO()); // 見積番号
						st.setpnumDetalNo(st.getDETAL_NO()); // 明細番号
						
						// 案件予算積上を行う
						lstRlt = entity.mSQLPjBudgetCostMake.call(conn, st);
						if(!lstRlt.isEmpty()){
							if("3".equals(((KM0050010Struct)lstRlt.get(0)).getpnumReturn())){
								setErrorMessage("KM00046", st.getDETAL_NO());
								return;
							}
							else if("2".equals(((KM0050010Struct)lstRlt.get(0)).getpnumReturn())){
								setWarningMessage("KM00046", st.getDETAL_NO());
								isThereError = true;
							}
							
						}
						if (!isThereError) {
							st.setPROJECT_CD(struct.getPROJECT_CD()); // 案件番号
							st.setESTIMATE_NO(st.getESTIMATE_NO()); // 見積番号
							st.setDETAL_NO(st.getDETAL_NO()); // 明細番号
							
							// 見積明細の“予算積上完了フラグ”の取得を行う
							lstRlt = entity.mT_ESTIMATE_DETAL.read(conn, st);
							if (lstRlt == null || !"1".equals(((KM0050010Struct)lstRlt.get(0)).getOD_COMP_FLG())) {
								isThereError = true;
							}
						}
			    	}
			    	if (!isThereError) {
			    		lstRlt = entity.mT_PROJECT.read(conn, st);
			    		// 排他チェック
			    		if (struct.getPJ_MODIFY_COUNT().equals(((KM0050010Struct)lstRlt.get(0)).getMODIFY_COUNT())) {
			    			st.setOD_COMP_FLG("1");
			    			st.setsUser_ID(struct.getsUser_ID());
			    			entity.mT_PROJECT.update(conn, st);
			    		} else {
			    			setErrorMessage("ZZ01105", null);
			    		}
			    	}
		        }
			}
			
			// 案件進捗情報を再読込する
			controlSelect();
			
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlRecalculation>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRecalculation");

		return;
	}

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
			DecimalFormat df = new DecimalFormat();
			String styleOne = "#,###.00";
			String styleTwo = "#,###.0";
			
        	// 案件進捗データを取得する
        	List ankenData = this.getAnkenData();
        	if (ankenData == null) {
	            setReadStatus(NOT_FOUND);
                return;
        	}
			// 見積明細データを取得する
			List lstDetailData = (List) ankenData.get(0);
			// 進捗データを取得する
			Map mapProgress = (Map) ankenData.get(1);
			List lstDetail = new ArrayList(); // 一覧明細データ
			KM0050010Struct st = null ;         // 明細データ格納用
			KM0050010Struct stEs = null ;       // 見積データ格納用
			KM0050010Struct stCmp = null ;      // 実績データ格納用
			KM0050010Struct stExp = null ;      // 見込データ格納用
			KM0050010Struct stDif = null ;      // 差異データ格納用
			KM0050010Struct stDif2 = null ;      // 差異2データ格納用
			KM0050010Struct stDif3 = null ;      // 差異3データ格納用
			KM0050010Struct stProgress = null ; // 進捗データ格納用
			String strCalculateDate = "";       //集計日時
			if((KM0050010Struct)mapProgress.get("1") != null){
				strCalculateDate = ((KM0050010Struct)mapProgress.get("1")).getTOTAL_DATE();
			}
            // 多言語項目取得対応
	        String locale = CoreTools.getLocale(sysUSER_CD);
	        String property = "OrteusUserDic";
	        ResourceBundle resource = CoreTools.getResourceBundle(property, locale);
			
            // コンボボックスデータ用意
            ComboBox controller = new ComboBox(conn, sysUSER_CD);
            ComboStruct stestimateTyp = controller.getData("ESTIMATE_TYPE"); // 手配品目種
            ComboStruct stCostProgressTyp = controller.getData("COST_PROGRESS"); // 費用進捗
			
			// 一覧データの作成
        	for (int i = 0; i < lstDetailData.size(); i++) {
        		st = (KM0050010Struct) lstDetailData.get(i);
        		
        		// 明細番号に対する進捗データを取得する
        		stProgress = (KM0050010Struct)mapProgress.get(st.getDETAL_NO());
        		if (stProgress == null) {
        			stProgress = new KM0050010Struct();
        			stProgress.setCOST_PROGRESS("0");//計画をセットする
        		}
    			// =======================================
    			// 見積データの作成
    			// =======================================
        		stEs = new KM0050010Struct();
        		stEs.setTYP(CoreTools.getRBString("Expj.Cmt6687",resource)); // 区分
        		stEs.setTYP_NUM("1"); // 区分番号
        		stEs.setTOTAL_DATE(st.getTOTAL_DATE()); // 集計日時(CSV出力用)
        		stEs.setDETAL_NO(st.getDETAL_NO()); // 明細番号
        		stEs.setESTIMATE_TYPE(getComboTypeName(stestimateTyp, st.getESTIMATE_TYPE())); // 手配品目種
        		stEs.setCUST_ITEM_CD(st.getCUST_ITEM_CD()); // 得意先品目番号
        		stEs.setITEM_NAME(st.getITEM_NAME()); // 品目名
        		stEs.setODR_AMOUNT(convertNull(st.getODR_AMOUNT())); // 受注金額
    			df.applyPattern(styleOne);
        		stEs.setl_ODR_AMOUNT(df.format(Double.parseDouble(convertNull(st.getODR_AMOUNT()))));// 受注金額(表示用)
        		
        		stEs.setPROGRESS(getComboTypeName(stCostProgressTyp, stProgress.getCOST_PROGRESS())); // 進捗
        		stEs.seth_COST_PROGRESS(stProgress.getCOST_PROGRESS());// 進捗(Hidden)
    			// 手配品目種が製品の場合
        		if ("1".equals(st.getESTIMATE_TYPE())) {
        			stEs.setES_COST_MATERIAL(convertNull(st.getES_COST_MATERIAL())); // 材料費
        			stEs.setES_COST_PROCESS(convertNull(st.getES_COST_PROCESS())); // 加工費
        			stEs.setES_COST_OUTSOUCE(convertNull(st.getES_COST_OUTSOUCE())); // 外注費
            		stEs.setUNIT_CD(st.getUNIT_CD()); // 単位
        		} else {
        			stEs.setES_COST_MATERIAL("0"); // 材料費
        			stEs.setES_COST_PROCESS("0"); // 加工費
        			stEs.setES_COST_OUTSOUCE("0"); // 外注費
        		}
        		stEs.setES_COST_ETC(convertNull(st.getES_COST_ETC())); // その他経費
    			// 手配品目種が役務の場合
        		if ("2".equals(st.getESTIMATE_TYPE())) {
        			stEs.setES_COST_SERVICE(convertNull(st.getES_COST_SERVICE())); // 役務費
        		} else {
        			stEs.setES_COST_SERVICE("0"); // 役務費
        		}
        		// 予算合計を計算する(材料費＋加工費＋外注費＋その他経費＋役務費)
        		stEs.setITEM_TOTAL_COST(sumAmount(new String[]{stEs.getES_COST_MATERIAL(),
        				stEs.getES_COST_PROCESS(),
        				stEs.getES_COST_OUTSOUCE(),
        				stEs.getES_COST_ETC(),
        				stEs.getES_COST_SERVICE()})); // 予算合計
        		
         		stEs.setODR_UNIT_PRICE(convertNull(st.getODR_UNIT_PRICE())); // 受注単価
        		stEs.setl_ODR_UNIT_PRICE(df.format(Double.parseDouble(convertNull(st.getODR_UNIT_PRICE()))));// 受注単価(表示用)
        		df.applyPattern(styleTwo);
        		stEs.setODR_QTY(convertNull(st.getODR_QTY())); // 数量
        		stEs.setl_ODR_QTY(df.format(Double.parseDouble(convertNull(st.getODR_QTY())))); // 数量(表示用)
        		
        		stEs.setDESINATED_DLV_DATE(st.getDESINATED_DLV_DATE()); // 指定納期
        		stEs.setl_JOB_ODR_CD(st.getl_JOB_ODR_CD());//製番
        		stEs.setl_JOB_ODR_CANCEL_NO(st.getl_JOB_ODR_CANCEL_NO());//製番取消発生番号
        		stEs.setl_PLANT_CD(st.getl_PLANT_CD());//工場コード
        		stEs.setPROFIT_RATIO(calculateRate(Calculate.subtract(
        				stEs.getODR_AMOUNT(), stEs.getITEM_TOTAL_COST()), stEs.getODR_AMOUNT())); // 利益率
        		stEs.setPROFIT_RATIO(calculateRate(Calculate.subtract(
        				st.getODR_AMOUNT(), stEs.getITEM_TOTAL_COST()), st.getODR_AMOUNT())); // 利益率
        		
        		// 見積データを格納する
        		lstDetail.add(stEs);
        		
    			// =======================================
    			// 実績データの作成
    			// =======================================
        		stCmp = new KM0050010Struct();
        		stCmp.setTYP(CoreTools.getRBString("Expj.Cmt0725",resource)); // 区分
        		stCmp.setTYP_NUM("2"); // 区分番号
    			// 手配品目種が製品の場合
        		if ("1".equals(st.getESTIMATE_TYPE())) {
        			stCmp.setES_COST_MATERIAL(convertNull(stProgress.getCMP_COST_MATERIAL())); // 材料費
        			stCmp.setES_COST_PROCESS(convertNull(stProgress.getCMP_COST_PROCESS())); // 加工費
        			stCmp.setES_COST_OUTSOUCE(convertNull(stProgress.getCMP_COST_OUTSOUCE())); // 外注費
        		} else {
        			stCmp.setES_COST_MATERIAL("0"); // 材料費
        			stCmp.setES_COST_PROCESS("0"); // 加工費
        			stCmp.setES_COST_OUTSOUCE("0"); // 外注費
        		}
        		stCmp.setES_COST_ETC(convertNull(st.getCMP_COST_ETC())); // その他経費
    			// 手配品目種が役務の場合
        		if ("2".equals(st.getESTIMATE_TYPE())) {
        			stCmp.setES_COST_SERVICE(convertNull(stProgress.getCMP_COST_SERVICE())); // 役務費
        		} else {
        			stCmp.setES_COST_SERVICE("0"); // 役務費
        		}
        		// 予算合計を計算する(材料費＋加工費＋外注費＋その他経費＋役務費)
        		stCmp.setITEM_TOTAL_COST(sumAmount(new String[]{stCmp.getES_COST_MATERIAL(),
        				stCmp.getES_COST_PROCESS(),
        				stCmp.getES_COST_OUTSOUCE(),
        				stCmp.getES_COST_ETC(),
        				stCmp.getES_COST_SERVICE()})); // 予算合計
        		stCmp.setMODIFY_COUNT(st.getMODIFY_COUNT()); // 更新数
        		stCmp.setESTIMATE_NO(st.getESTIMATE_NO()); // 見積番号
        		stCmp.seth_DETAL_NO(st.getDETAL_NO()); // 明細番号
        		stCmp.seth_ES_COST_ETC(convertNull(st.getCMP_COST_ETC())); // その他経費
        		
        		// 実績データを格納する
        		lstDetail.add(stCmp);
        		
    			// =======================================
    			// 見込データの作成
    			// =======================================
        		stExp = new KM0050010Struct();
        		stExp.setTYP(CoreTools.getRBString("Expj.Prospects",resource)); // 区分
        		stExp.setTYP_NUM("3"); // 区分番号
    			// 手配品目種が製品の場合
        		if ("1".equals(st.getESTIMATE_TYPE())) {
        			stExp.setES_COST_MATERIAL(convertNull(stProgress.getEXP_COST_MATERIAL())); // 材料費
        			stExp.setES_COST_PROCESS(convertNull(stProgress.getEXP_COST_PROCESS())); // 加工費
        			stExp.setES_COST_OUTSOUCE(convertNull(stProgress.getEXP_COST_OUTSOUCE())); // 外注費
        		} else {
        			stExp.setES_COST_MATERIAL("0"); // 材料費
        			stExp.setES_COST_PROCESS("0"); // 加工費
        			stExp.setES_COST_OUTSOUCE("0"); // 外注費
        		}
        		// 実績が0の場合は、見積の金額、実績が0でない場合は実績行の金額を表示する。
        		if (Double.parseDouble(stCmp.getES_COST_ETC()) == 0) {
        			stExp.setES_COST_ETC(stEs.getES_COST_ETC()); // その他経費
        		} else {
        			stExp.setES_COST_ETC(stCmp.getES_COST_ETC()); // その他経費
        		}
    			// 手配品目種が役務の場合
        		if ("2".equals(st.getESTIMATE_TYPE())) {
        			// 実績が0の場合は、見積の金額、実績が0でない場合は実績の金額を表示する。
            		if (Double.parseDouble(stCmp.getES_COST_SERVICE()) == 0) {
            			stExp.setES_COST_SERVICE(stEs.getES_COST_SERVICE()); // その他経費
            		} else {
            			stExp.setES_COST_SERVICE(stCmp.getES_COST_SERVICE()); // その他経費
            		}
        		} else {
        			stExp.setES_COST_SERVICE("0"); // 役務費
        		}
        		// 予算合計を計算する(材料費＋加工費＋外注費＋その他経費＋役務費)
        		stExp.setITEM_TOTAL_COST(sumAmount(new String[]{stExp.getES_COST_MATERIAL(),
        				stExp.getES_COST_PROCESS(),
        				stExp.getES_COST_OUTSOUCE(),
        				stExp.getES_COST_ETC(),
        				stExp.getES_COST_SERVICE()})); // 予算合計
        		stExp.setPROFIT_RATIO(calculateRate(Calculate.subtract(
        				stEs.getODR_AMOUNT(), stExp.getITEM_TOTAL_COST()), stEs.getODR_AMOUNT())); // 利益率
        		
        		// 見込データを格納する
        		lstDetail.add(stExp);
        		
    			// =======================================
    			// 差異データの作成 見積－見込
    			// =======================================
        		stDif = new KM0050010Struct();
        		stDif.setTYP(CoreTools.getRBString("Expj.Cmt5883",resource)); // 区分
        		stDif.setTYP_NUM("4"); // 区分番号
        		stDif.setES_COST_MATERIAL(Calculate.subtract(stEs.getES_COST_MATERIAL(), stExp.getES_COST_MATERIAL())); // 材料費
        		stDif.setES_COST_PROCESS(Calculate.subtract(stEs.getES_COST_PROCESS(), stExp.getES_COST_PROCESS())); // 加工費
        		stDif.setES_COST_OUTSOUCE(Calculate.subtract(stEs.getES_COST_OUTSOUCE(), stExp.getES_COST_OUTSOUCE())); // 外注費
        		stDif.setES_COST_ETC(Calculate.subtract(stEs.getES_COST_ETC(), stExp.getES_COST_ETC())); // その他経費
        		stDif.setES_COST_SERVICE(Calculate.subtract(stEs.getES_COST_SERVICE(), stExp.getES_COST_SERVICE())); // 役務費
        		stDif.setITEM_TOTAL_COST(Calculate.subtract(stEs.getITEM_TOTAL_COST(), stExp.getITEM_TOTAL_COST())); // 予算合計
        		stDif.setPROFIT_RATIO(" ");
        		
        		// 差異データを格納する
        		lstDetail.add(stDif);

    			// =======================================
    			// 差異データの作成2 見積-実績
    			// =======================================
        		stDif2 = new KM0050010Struct();
        		stDif2.setES_COST_MATERIAL(Calculate.subtract(stEs.getES_COST_MATERIAL(), stCmp.getES_COST_MATERIAL())); // 材料費
        		stDif2.setES_COST_PROCESS(Calculate.subtract(stEs.getES_COST_PROCESS(), stCmp.getES_COST_PROCESS())); // 加工費
        		stDif2.setES_COST_OUTSOUCE(Calculate.subtract(stEs.getES_COST_OUTSOUCE(), stCmp.getES_COST_OUTSOUCE())); // 外注費
        		stDif2.setES_COST_ETC(Calculate.subtract(stEs.getES_COST_ETC(), stCmp.getES_COST_ETC())); // その他経費
        		stDif2.setES_COST_SERVICE(Calculate.subtract(stEs.getES_COST_SERVICE(), stCmp.getES_COST_SERVICE())); // 役務費
        		stDif2.setITEM_TOTAL_COST(Calculate.subtract(stEs.getITEM_TOTAL_COST(), stCmp.getITEM_TOTAL_COST())); // 予算合計
        		
    			// =======================================
    			// 差異データの作成3 見込-実績
    			// =======================================
        		stDif3 = new KM0050010Struct();
        		stDif3.setES_COST_MATERIAL(Calculate.subtract(stExp.getES_COST_MATERIAL(), stCmp.getES_COST_MATERIAL())); // 材料費
        		stDif3.setES_COST_PROCESS(Calculate.subtract(stExp.getES_COST_PROCESS(), stCmp.getES_COST_PROCESS())); // 加工費
        		stDif3.setES_COST_OUTSOUCE(Calculate.subtract(stExp.getES_COST_OUTSOUCE(), stCmp.getES_COST_OUTSOUCE())); // 外注費
        		stDif3.setES_COST_ETC(Calculate.subtract(stExp.getES_COST_ETC(), stCmp.getES_COST_ETC())); // その他経費
        		stDif3.setES_COST_SERVICE(Calculate.subtract(stExp.getES_COST_SERVICE(), stCmp.getES_COST_SERVICE())); // 役務費
        		stDif3.setITEM_TOTAL_COST(Calculate.subtract(stExp.getITEM_TOTAL_COST(), stCmp.getITEM_TOTAL_COST())); // 予算合計

        		// 合計データを計算する
        		sumAnkenData(stEs, stCmp, stExp, stDif2, stDif3);
        	}
    		
        	struct.setCALCULATION_DATE(strCalculateDate); // 集計日時
            setReadStatus(NORMAL);
			this.setList(lstDetail);
			
		} catch(SQLException e) {
			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * その他経費登録ボタン押下時に実行される処理です。
	 *
	 */
	public void controlOtherRegister() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlOtherRegister");
			//{{user_implement_dev:<controlOtherRegister>
		try {

            // 画面入力項目を取得
			List lstTypNum = struct.getList_TYP_NUM(); // レコード区分
			List lstDetalNo = struct.getList_h_DETAL_NO(); // 明細番号
			List lstHEsCostEtc = struct.getList_h_ES_COST_ETC(); // その他経費(退避)
			List lstEsCostEtc = struct.getList_ES_COST_ETC(); // その他経費
			List lstModifyCount = struct.getList_MODIFY_COUNT(); // 更新数
			KM0050010Struct st = null;
			struct.setsUser_ID(this.getsysUSER_CD()); // ユーザコード
			String strNewCostEtc = null;

			List lstTEstimateDetal = null;
			for (int i = 0; i < lstTypNum.size(); i++) {
				strNewCostEtc = convertNull((String)lstEsCostEtc.get(i)); // その他経費
				// 実績データ、かつ、入力値が変わる場合
				if ("2".equals((String)lstTypNum.get(i))
						&& Double.parseDouble(strNewCostEtc)
						!= Double.parseDouble((String)lstHEsCostEtc.get(i))) {
					
					struct.setDETAL_NO((String)lstDetalNo.get(i)); // 明細番号
					// 更新数の取得
					lstTEstimateDetal = entity.mT_ESTIMATE_DETAL.read(conn, struct);
					if (lstTEstimateDetal == null || lstTEstimateDetal.size() == 0
							|| lstTEstimateDetal.size() == 1
							&& new BigDecimal(((KM0050010Struct)lstTEstimateDetal.get(0)).getMODIFY_COUNT()).compareTo(
									new BigDecimal((String)lstModifyCount.get(i))) != 0) {
						// [見積明細].”更新数” が読込時と異なる場合、エラー
						setErrorMessage("ZZ01105", null);
						conn.rollback();
						return;
					}
					struct.setCMP_COST_ETC(strNewCostEtc); // その他経費
					entity.mT_ESTIMATE_DETAL.update(conn, struct);
				}
			}
			conn.commit();
			controlSelect();
			
		} catch(SQLException e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			conn.rollback();
			throw ee;
		}
                //}}user_implement_dev:<controlOtherRegister>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlOtherRegister");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCSVOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");
			//{{user_implement_dev:<controlCSVOut>
		try {

        	// 案件進捗データを取得する
			controlSelect();

			// CSV情報の作成
			List csvList = new ArrayList();
			String[] title = {
				"Expj.PROJECT_CD",               // 案件番号
				"Expj.PROJECT_NAME",             // 案件名
				"Expj.TOTAL_DATE",               // 集計日時
				"Expj.DETAIL_NO",                // 明細番号
				"Expj.ARRANGE_ITEMS_SPECIES",    // 手配品目種
				"Expj.CUST_ITEM_CD",             // 得意先品目番号
				"Expj.ITEM_NAME",                // 品目名
				"Expj.ODR_AMOUNT",               // 受注金額
				"Expj.PROGRESS",                 // 進捗
				"Expj.6694",                     // 見積利益率
				"Expj.6695",                     // 見積予算合計
				"Expj.ES_COST_MATERIAL",         // 見積予算 材料費
				"Expj.ES_COST_PROCESS",          // 見積予算 加工費
				"Expj.ES_COST_OUTSOUCE",         // 見積予算 外注費
				"Expj.ES_COST_ETC",              // 見積予算 その他経費
				"Expj.ES_COST_SERVICE",          // 見積予算 役務費
				"Expj.6697",                     // 消化実績合計
				"Expj.CMP_COST_MATERIAL",        // 消化実績　材料費
				"Expj.CMP_COST_PROCESS",         // 消化実績　加工費
				"Expj.CMP_COST_OUTSOUCE",        // 消化実績　外注費
				"Expj.CMP_COST_REAL_ETC",        // 消化実績　その他経費
				"Expj.CMP_COST_SERVICE",         // 消化実績　役務費
				"Expj.6698",                     // 見込利益率
				"Expj.6699",                     // 落着見込合計
				"Expj.EXP_COST_MATERIAL",        // 落着見込　材料費
				"Expj.EXP_COST_PROCESS",         // 落着見込　加工費
				"Expj.EXP_COST_OUTSOUCE",        // 落着見込　外注費
				"Expj.CMP_COST_ESTM_ETC",        // 落着見込　その他経費
				"Expj.EXP_COST_SERVICE",         // 落着見込　役務費
				"Expj.6701",                     // 差異予算合計
				"Expj.DIF_COST_MATERIAL",        // 差異材料費
				"Expj.DIF_COST_PROCESS",         // 差異加工費
				"Expj.DIF_COST_OUTSOUCE",        // 差異外注費
				"Expj.CMP_COST_ETC",             // 差異その他経費
				"Expj.DIF_COST_SERVICE",         // 差異役務費
				"Expj.QTY",                      // 数量
				"Expj.PUCH_ODR_UNIT",            // 単位
				"Expj.ODR_UNIT_PRICE",           // 受注単価
				"Expj.DESINATED_DLV_DATE",       // 指定納期
				"Expj.JOB_ODR_CD",               // 製番
			};
			csvList.add(title);
			
			String[] csvStr = null;
			int intRecordCnt = this.getListsize() / 4;
			int intRow = 0;
			KM0050010Struct stEs = null ;       // 見積データ格納用
			KM0050010Struct stCmp = null ;      // 実績データ格納用
			KM0050010Struct stExp = null ;      // 見込データ格納用
			KM0050010Struct stDif = null ;      // 差異データ格納用
			for (int i = 0; i < intRecordCnt; i++) {
				intRow = i * 4;
				stEs = (KM0050010Struct) this.getList().get(intRow + 0);
				stCmp = (KM0050010Struct) this.getList().get(intRow + 1);
				stExp = (KM0050010Struct) this.getList().get(intRow + 2);
				stDif = (KM0050010Struct) this.getList().get(intRow + 3);
        		
        		int arrIdx = 0; // 列の番号
				csvStr = new String[title.length];
				csvStr[arrIdx++] = struct.getPROJECT_CD(); // 案件番号
				csvStr[arrIdx++] = struct.getPROJECT_NAME(); // 案件名
				csvStr[arrIdx++] = struct.getCALCULATION_DATE(); // 集計日時
				csvStr[arrIdx++] = stEs.getDETAL_NO(); // 明細番号
				csvStr[arrIdx++] = stEs.getESTIMATE_TYPE(); // 手配品目種
				csvStr[arrIdx++] = stEs.getCUST_ITEM_CD(); // 得意先品目番号
				csvStr[arrIdx++] = stEs.getITEM_NAME(); // 品目名
				csvStr[arrIdx++] = stEs.getODR_AMOUNT(); // 受注金額
				csvStr[arrIdx++] = stEs.getPROGRESS(); // 進捗
				csvStr[arrIdx++] = stEs.getPROFIT_RATIO(); // 見積利益率
				csvStr[arrIdx++] = stEs.getITEM_TOTAL_COST(); // 見積予算合計(Modify)
				csvStr[arrIdx++] = stEs.getES_COST_MATERIAL(); // 見積予算 材料費
				csvStr[arrIdx++] = stEs.getES_COST_PROCESS(); // 見積予算 加工費
				csvStr[arrIdx++] = stEs.getES_COST_OUTSOUCE(); // 見積予算 外注費
				csvStr[arrIdx++] = stEs.getES_COST_ETC(); // 見積予算 その他経費
				csvStr[arrIdx++] = stEs.getES_COST_SERVICE(); // 見積予算 役務費(Modify)
				csvStr[arrIdx++] = stCmp.getITEM_TOTAL_COST(); // 消化実績合計(Modify)
				csvStr[arrIdx++] = stCmp.getES_COST_MATERIAL(); // 消化実績　材料費
				csvStr[arrIdx++] = stCmp.getES_COST_PROCESS(); // 消化実績　加工費
				csvStr[arrIdx++] = stCmp.getES_COST_OUTSOUCE(); // 消化実績　外注費
				csvStr[arrIdx++] = stCmp.getES_COST_ETC(); // 消化実績　その他経費
				csvStr[arrIdx++] = stCmp.getES_COST_SERVICE(); // 消化実績　役務費(Modify)
				csvStr[arrIdx++] = stExp.getPROFIT_RATIO(); // 見込利益率
				csvStr[arrIdx++] = stExp.getITEM_TOTAL_COST(); // 落着見込合計
				csvStr[arrIdx++] = stExp.getES_COST_MATERIAL(); // 落着見込　材料費
				csvStr[arrIdx++] = stExp.getES_COST_PROCESS(); // 落着見込　加工費
				csvStr[arrIdx++] = stExp.getES_COST_OUTSOUCE(); // 落着見込　外注費
				csvStr[arrIdx++] = stExp.getES_COST_ETC(); // 落着見込　その他経費
				csvStr[arrIdx++] = stExp.getES_COST_SERVICE(); // 落着見込　役務費(Modify)
				csvStr[arrIdx++] = stDif.getITEM_TOTAL_COST(); // 差異予算合計
				csvStr[arrIdx++] = stDif.getES_COST_MATERIAL(); // 差異材料費
				csvStr[arrIdx++] = stDif.getES_COST_PROCESS(); // 差異加工費
				csvStr[arrIdx++] = stDif.getES_COST_OUTSOUCE(); // 差異外注費
				csvStr[arrIdx++] = stDif.getES_COST_ETC(); // 差異その他経費
				csvStr[arrIdx++] = stDif.getES_COST_SERVICE(); // 差異役務費
				csvStr[arrIdx++] = stEs.getODR_QTY(); // 数量
            	csvStr[arrIdx++] = stEs.getUNIT_CD(); // 単位
				csvStr[arrIdx++] = stEs.getODR_UNIT_PRICE(); // 受注単価
				csvStr[arrIdx++] = stEs.getDESINATED_DLV_DATE(); // 指定納期
				csvStr[arrIdx++] = stEs.getl_JOB_ODR_CD();       // 製番
				csvList.add(csvStr);
			}

			if (csvList != null && !csvList.isEmpty()) {
				// CsvWriterを生成
				csvWriter = new CsvWriter(CsvWriter.getFileName(sysUSER_CD));
				csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()), true);
				struct.setDOWNLOAD_FILE(csvWriter.getFilePath());
			}
		} catch (Exception e) {
			e.printStackTrace();
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
			ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
			throw ee;
		}
                //}}user_implement_dev:<controlCSVOut>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlCSVOut");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			struct.initialize();
			if(list != null)
			{
				list.clear();
			}
			setReadStatus(INITIAL);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 製番別進捗ボタン押下時に実行される処理です。
	 *
	 */
	public void controlJobOdrProgress() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgress");
			//{{user_implement_dev:<controlJobOdrProgress>
			// TODO: ユーザ定義のコードを記述してください
		try {
			int nRet = 0;
			nRet = entity.mUpdate.update(conn, struct);
			nRet = entity.mT_ESTIMATE_DETAL.update(conn, struct);
			nRet = entity.mT_PROJECT.update(conn, struct);
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
		}
                //}}user_implement_dev:<controlJobOdrProgress>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlJobOdrProgress");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
			// TODO: ユーザ定義のコードを記述してください
/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		try{
*/
			// 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
			if ( isScreenMove() == true ) {
				struct.setPROJECT_CD(this.getProjectCd());
				// 検索のコントロールメソッドを呼び出します。
				controlSelect();
			}

/*			// データベースへのアクセスを行う場合は、このtry catch文のコメントを外してください。
		} catch(SQLException e) {
//			e.printStackTrace();
			// エラー処理を記述してください。
			// 
		}
*/
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KM0050");
		logger.entering("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
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
		logger.exiting("KM0050010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("TotalShow") ) {
				controlTotalShow();
			} else if( button.equals("Recalculation") ) {
				controlRecalculation();
			} else if( button.equals("Select") ) {
				controlSelect();
			} else if( button.equals("OtherRegister") ) {
				controlOtherRegister();
			} else if( button.equals("CSVOut") ) {
				controlCSVOut();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("JobOdrProgress") ) {
				controlJobOdrProgress();
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
//			throw new FoundationException("KM0050010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0050010-E999","CSVの出力処理"));
			throw new FoundationException("KM0050010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0050010-E999","システム日付の取得処理"));
				throw new FoundationException("KM0050010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KM0050010-E999","コントロールのイベント処理"));
			throw new FoundationException("KM0050010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KM0050010Entity entity;
	protected KM0050010Struct struct;
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

		entity = new KM0050010Entity();
		struct = new KM0050010Struct();

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
	 * KM0050010クラスの標準コンストラクタ
	 */
	public KM0050010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
			// TODO: ここに初期処理を記述してください
		try {
			ResourceBundle bundle = SystemConfig.getBundle();
			dbUID = SystemConfig.getProperty("CONNECT_DBUSER", bundle);
			dbPWD = SystemConfig.getProperty("CONNECT_DBPASS", bundle);
			dbDBQ = SystemConfig.getProperty("CONNECT_DBHOST", bundle);
			dbKIND = SystemConfig.getProperty("CONNECT_KIND", bundle);
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
				KM0050010Struct key = (KM0050010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("CALCULATION_DATE") && key.getCALCULATION_DATE() != null) {
					msgKey.setKeyValue("CALCULATION_DATE", key.getCALCULATION_DATE());
				}
				if(msgKeyType.containsKeyColumn("TYP") && key.getTYP() != null) {
					msgKey.setKeyValue("TYP", key.getTYP());
				}
				if(msgKeyType.containsKeyColumn("PROGRESS") && key.getPROGRESS() != null) {
					msgKey.setKeyValue("PROGRESS", key.getPROGRESS());
				}
				if(msgKeyType.containsKeyColumn("PROFIT_RATIO") && key.getPROFIT_RATIO() != null) {
					msgKey.setKeyValue("PROFIT_RATIO", key.getPROFIT_RATIO());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST") && key.getITEM_TOTAL_COST() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST", key.getITEM_TOTAL_COST());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT_W") && key.getODR_AMOUNT_W() != null) {
					msgKey.setKeyValue("ODR_AMOUNT_W", key.getODR_AMOUNT_W());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_W") && key.getITEM_TOTAL_COST_W() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_W", key.getITEM_TOTAL_COST_W());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_T") && key.getITEM_TOTAL_COST_T() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_T", key.getITEM_TOTAL_COST_T());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_P") && key.getITEM_TOTAL_COST_P() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_P", key.getITEM_TOTAL_COST_P());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D") && key.getITEM_TOTAL_COST_D() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_D", key.getITEM_TOTAL_COST_D());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_W") && key.getMATERIAL_COST_W() != null) {
					msgKey.setKeyValue("MATERIAL_COST_W", key.getMATERIAL_COST_W());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_T") && key.getMATERIAL_COST_T() != null) {
					msgKey.setKeyValue("MATERIAL_COST_T", key.getMATERIAL_COST_T());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_P") && key.getMATERIAL_COST_P() != null) {
					msgKey.setKeyValue("MATERIAL_COST_P", key.getMATERIAL_COST_P());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_D") && key.getMATERIAL_COST_D() != null) {
					msgKey.setKeyValue("MATERIAL_COST_D", key.getMATERIAL_COST_D());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_W") && key.getPROCESSING_COST_W() != null) {
					msgKey.setKeyValue("PROCESSING_COST_W", key.getPROCESSING_COST_W());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_T") && key.getPROCESSING_COST_T() != null) {
					msgKey.setKeyValue("PROCESSING_COST_T", key.getPROCESSING_COST_T());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_P") && key.getPROCESSING_COST_P() != null) {
					msgKey.setKeyValue("PROCESSING_COST_P", key.getPROCESSING_COST_P());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_D") && key.getPROCESSING_COST_D() != null) {
					msgKey.setKeyValue("PROCESSING_COST_D", key.getPROCESSING_COST_D());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_W") && key.getSBCNT_COST_W() != null) {
					msgKey.setKeyValue("SBCNT_COST_W", key.getSBCNT_COST_W());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_T") && key.getSBCNT_COST_T() != null) {
					msgKey.setKeyValue("SBCNT_COST_T", key.getSBCNT_COST_T());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_P") && key.getSBCNT_COST_P() != null) {
					msgKey.setKeyValue("SBCNT_COST_P", key.getSBCNT_COST_P());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_D") && key.getSBCNT_COST_D() != null) {
					msgKey.setKeyValue("SBCNT_COST_D", key.getSBCNT_COST_D());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_W") && key.getOTHER_OVERHEADS_W() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_W", key.getOTHER_OVERHEADS_W());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_T") && key.getOTHER_OVERHEADS_T() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_T", key.getOTHER_OVERHEADS_T());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_P") && key.getOTHER_OVERHEADS_P() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_P", key.getOTHER_OVERHEADS_P());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D") && key.getOTHER_OVERHEADS_D() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_D", key.getOTHER_OVERHEADS_D());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_W") && key.getSERVICE_COST_W() != null) {
					msgKey.setKeyValue("SERVICE_COST_W", key.getSERVICE_COST_W());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_T") && key.getSERVICE_COST_T() != null) {
					msgKey.setKeyValue("SERVICE_COST_T", key.getSERVICE_COST_T());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_P") && key.getSERVICE_COST_P() != null) {
					msgKey.setKeyValue("SERVICE_COST_P", key.getSERVICE_COST_P());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_D") && key.getSERVICE_COST_D() != null) {
					msgKey.setKeyValue("SERVICE_COST_D", key.getSERVICE_COST_D());
				}
				if(msgKeyType.containsKeyColumn("PROFIT_RATIO_W") && key.getPROFIT_RATIO_W() != null) {
					msgKey.setKeyValue("PROFIT_RATIO_W", key.getPROFIT_RATIO_W());
				}
				if(msgKeyType.containsKeyColumn("PROFIT_RATIO_P") && key.getPROFIT_RATIO_P() != null) {
					msgKey.setKeyValue("PROFIT_RATIO_P", key.getPROFIT_RATIO_P());
				}
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("TYP_NUM") && key.getTYP_NUM() != null) {
					msgKey.setKeyValue("TYP_NUM", key.getTYP_NUM());
				}
				if(msgKeyType.containsKeyColumn("h_DETAL_NO") && key.geth_DETAL_NO() != null) {
					msgKey.setKeyValue("h_DETAL_NO", key.geth_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("h_ES_COST_ETC") && key.geth_ES_COST_ETC() != null) {
					msgKey.setKeyValue("h_ES_COST_ETC", key.geth_ES_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("h_COST_PROGRESS") && key.geth_COST_PROGRESS() != null) {
					msgKey.setKeyValue("h_COST_PROGRESS", key.geth_COST_PROGRESS());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT") && key.getl_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("l_ODR_AMOUNT", key.getl_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D2") && key.getITEM_TOTAL_COST_D2() != null) {
					msgKey.setKeyValue("ITEM_TOTAL_COST_D2", key.getITEM_TOTAL_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("MATERIAL_COST_D2") && key.getMATERIAL_COST_D2() != null) {
					msgKey.setKeyValue("MATERIAL_COST_D2", key.getMATERIAL_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("PROCESSING_COST_D2") && key.getPROCESSING_COST_D2() != null) {
					msgKey.setKeyValue("PROCESSING_COST_D2", key.getPROCESSING_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("SBCNT_COST_D2") && key.getSBCNT_COST_D2() != null) {
					msgKey.setKeyValue("SBCNT_COST_D2", key.getSBCNT_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D2") && key.getOTHER_OVERHEADS_D2() != null) {
					msgKey.setKeyValue("OTHER_OVERHEADS_D2", key.getOTHER_OVERHEADS_D2());
				}
				if(msgKeyType.containsKeyColumn("SERVICE_COST_D2") && key.getSERVICE_COST_D2() != null) {
					msgKey.setKeyValue("SERVICE_COST_D2", key.getSERVICE_COST_D2());
				}
				if(msgKeyType.containsKeyColumn("PROGRESS_NO") && key.getPROGRESS_NO() != null) {
					msgKey.setKeyValue("PROGRESS_NO", key.getPROGRESS_NO());
				}
				if(msgKeyType.containsKeyColumn("pnumFlag") && key.getpnumFlag() != null) {
					msgKey.setKeyValue("pnumFlag", key.getpnumFlag());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_STAT") && key.getPROJECT_STAT() != null) {
					msgKey.setKeyValue("PROJECT_STAT", key.getPROJECT_STAT());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_CD") && key.getPROJECT_CD() != null) {
					msgKey.setKeyValue("PROJECT_CD", key.getPROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_NO") && key.getODR_NO() != null) {
					msgKey.setKeyValue("ODR_NO", key.getODR_NO());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_ETC") && key.getCMP_COST_ETC() != null) {
					msgKey.setKeyValue("CMP_COST_ETC", key.getCMP_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_NO") && key.getESTIMATE_NO() != null) {
					msgKey.setKeyValue("ESTIMATE_NO", key.getESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("DETAL_NO") && key.getDETAL_NO() != null) {
					msgKey.setKeyValue("DETAL_NO", key.getDETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("DISPLAY_NAME") && key.getDISPLAY_NAME() != null) {
					msgKey.setKeyValue("DISPLAY_NAME", key.getDISPLAY_NAME());
				}
				if(msgKeyType.containsKeyColumn("NAME") && key.getNAME() != null) {
					msgKey.setKeyValue("NAME", key.getNAME());
				}
				if(msgKeyType.containsKeyColumn("VALUE") && key.getVALUE() != null) {
					msgKey.setKeyValue("VALUE", key.getVALUE());
				}
				if(msgKeyType.containsKeyColumn("PROJECT_NAME") && key.getPROJECT_NAME() != null) {
					msgKey.setKeyValue("PROJECT_NAME", key.getPROJECT_NAME());
				}
				if(msgKeyType.containsKeyColumn("PJ_MODIFY_COUNT") && key.getPJ_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("PJ_MODIFY_COUNT", key.getPJ_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE") && key.getESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("ESTIMATE_TYPE", key.getESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("CUST_ITEM_CD") && key.getCUST_ITEM_CD() != null) {
					msgKey.setKeyValue("CUST_ITEM_CD", key.getCUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("ODR_AMOUNT") && key.getODR_AMOUNT() != null) {
					msgKey.setKeyValue("ODR_AMOUNT", key.getODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_MATERIAL") && key.getES_COST_MATERIAL() != null) {
					msgKey.setKeyValue("ES_COST_MATERIAL", key.getES_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_PROCESS") && key.getES_COST_PROCESS() != null) {
					msgKey.setKeyValue("ES_COST_PROCESS", key.getES_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_OUTSOUCE") && key.getES_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("ES_COST_OUTSOUCE", key.getES_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_ETC") && key.getES_COST_ETC() != null) {
					msgKey.setKeyValue("ES_COST_ETC", key.getES_COST_ETC());
				}
				if(msgKeyType.containsKeyColumn("ES_COST_SERVICE") && key.getES_COST_SERVICE() != null) {
					msgKey.setKeyValue("ES_COST_SERVICE", key.getES_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("MODIFY_COUNT") && key.getMODIFY_COUNT() != null) {
					msgKey.setKeyValue("MODIFY_COUNT", key.getMODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ODR_QTY") && key.getODR_QTY() != null) {
					msgKey.setKeyValue("ODR_QTY", key.getODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("UNIT_CD") && key.getUNIT_CD() != null) {
					msgKey.setKeyValue("UNIT_CD", key.getUNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE") && key.getODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("ODR_UNIT_PRICE", key.getODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE") && key.getDESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("DESINATED_DLV_DATE", key.getDESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO") && key.getl_JOB_ODR_CANCEL_NO() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CANCEL_NO", key.getl_JOB_ODR_CANCEL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_PLANT_CD") && key.getl_PLANT_CD() != null) {
					msgKey.setKeyValue("l_PLANT_CD", key.getl_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("TOTAL_DATE") && key.getTOTAL_DATE() != null) {
					msgKey.setKeyValue("TOTAL_DATE", key.getTOTAL_DATE());
				}
				if(msgKeyType.containsKeyColumn("COST_PROGRESS") && key.getCOST_PROGRESS() != null) {
					msgKey.setKeyValue("COST_PROGRESS", key.getCOST_PROGRESS());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_MATERIAL") && key.getCMP_COST_MATERIAL() != null) {
					msgKey.setKeyValue("CMP_COST_MATERIAL", key.getCMP_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_MATERIAL") && key.getEXP_COST_MATERIAL() != null) {
					msgKey.setKeyValue("EXP_COST_MATERIAL", key.getEXP_COST_MATERIAL());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_PROCESS") && key.getCMP_COST_PROCESS() != null) {
					msgKey.setKeyValue("CMP_COST_PROCESS", key.getCMP_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_PROCESS") && key.getEXP_COST_PROCESS() != null) {
					msgKey.setKeyValue("EXP_COST_PROCESS", key.getEXP_COST_PROCESS());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_OUTSOUCE") && key.getCMP_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("CMP_COST_OUTSOUCE", key.getCMP_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_OUTSOUCE") && key.getEXP_COST_OUTSOUCE() != null) {
					msgKey.setKeyValue("EXP_COST_OUTSOUCE", key.getEXP_COST_OUTSOUCE());
				}
				if(msgKeyType.containsKeyColumn("CMP_COST_SERVICE") && key.getCMP_COST_SERVICE() != null) {
					msgKey.setKeyValue("CMP_COST_SERVICE", key.getCMP_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("EXP_COST_SERVICE") && key.getEXP_COST_SERVICE() != null) {
					msgKey.setKeyValue("EXP_COST_SERVICE", key.getEXP_COST_SERVICE());
				}
				if(msgKeyType.containsKeyColumn("OD_COMP_FLG") && key.getOD_COMP_FLG() != null) {
					msgKey.setKeyValue("OD_COMP_FLG", key.getOD_COMP_FLG());
				}
				if(msgKeyType.containsKeyColumn("pvc2LogMode") && key.getpvc2LogMode() != null) {
					msgKey.setKeyValue("pvc2LogMode", key.getpvc2LogMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputMode") && key.getpvc2OutputMode() != null) {
					msgKey.setKeyValue("pvc2OutputMode", key.getpvc2OutputMode());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputPath") && key.getpvc2OutputPath() != null) {
					msgKey.setKeyValue("pvc2OutputPath", key.getpvc2OutputPath());
				}
				if(msgKeyType.containsKeyColumn("pvc2OutputName") && key.getpvc2OutputName() != null) {
					msgKey.setKeyValue("pvc2OutputName", key.getpvc2OutputName());
				}
				if(msgKeyType.containsKeyColumn("pvc2UserId") && key.getpvc2UserId() != null) {
					msgKey.setKeyValue("pvc2UserId", key.getpvc2UserId());
				}
				if(msgKeyType.containsKeyColumn("pvc2BusinessName") && key.getpvc2BusinessName() != null) {
					msgKey.setKeyValue("pvc2BusinessName", key.getpvc2BusinessName());
				}
				if(msgKeyType.containsKeyColumn("pvc2PlantCd") && key.getpvc2PlantCd() != null) {
					msgKey.setKeyValue("pvc2PlantCd", key.getpvc2PlantCd());
				}
				if(msgKeyType.containsKeyColumn("pvc2OdrNo") && key.getpvc2OdrNo() != null) {
					msgKey.setKeyValue("pvc2OdrNo", key.getpvc2OdrNo());
				}
				if(msgKeyType.containsKeyColumn("pvc2PProjectCd") && key.getpvc2PProjectCd() != null) {
					msgKey.setKeyValue("pvc2PProjectCd", key.getpvc2PProjectCd());
				}
				if(msgKeyType.containsKeyColumn("pnumEstimateNo") && key.getpnumEstimateNo() != null) {
					msgKey.setKeyValue("pnumEstimateNo", key.getpnumEstimateNo());
				}
				if(msgKeyType.containsKeyColumn("pnumDetalNo") && key.getpnumDetalNo() != null) {
					msgKey.setKeyValue("pnumDetalNo", key.getpnumDetalNo());
				}
				if(msgKeyType.containsKeyColumn("pnumReturn") && key.getpnumReturn() != null) {
					msgKey.setKeyValue("pnumReturn", key.getpnumReturn());
				}
				if(msgKeyType.containsKeyColumn("FILE_PATH") && key.getFILE_PATH() != null) {
					msgKey.setKeyValue("FILE_PATH", key.getFILE_PATH());
				}
				if(msgKeyType.containsKeyColumn("FILE_NAME") && key.getFILE_NAME() != null) {
					msgKey.setKeyValue("FILE_NAME", key.getFILE_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOG_MODE_TYP") && key.getLOG_MODE_TYP() != null) {
					msgKey.setKeyValue("LOG_MODE_TYP", key.getLOG_MODE_TYP());
				}
				if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP") && key.getOUTPUT_MODE_TYP() != null) {
					msgKey.setKeyValue("OUTPUT_MODE_TYP", key.getOUTPUT_MODE_TYP());
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
					KM0050010Struct key = new KM0050010Struct();
					if(msgKeyType.containsKeyColumn("CALCULATION_DATE")) {
						key.setCALCULATION_DATE(msgKey.getKeyValue("CALCULATION_DATE"));
					}
					if(msgKeyType.containsKeyColumn("TYP")) {
						key.setTYP(msgKey.getKeyValue("TYP"));
					}
					if(msgKeyType.containsKeyColumn("PROGRESS")) {
						key.setPROGRESS(msgKey.getKeyValue("PROGRESS"));
					}
					if(msgKeyType.containsKeyColumn("PROFIT_RATIO")) {
						key.setPROFIT_RATIO(msgKey.getKeyValue("PROFIT_RATIO"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST")) {
						key.setITEM_TOTAL_COST(msgKey.getKeyValue("ITEM_TOTAL_COST"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT_W")) {
						key.setODR_AMOUNT_W(msgKey.getKeyValue("ODR_AMOUNT_W"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_W")) {
						key.setITEM_TOTAL_COST_W(msgKey.getKeyValue("ITEM_TOTAL_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_T")) {
						key.setITEM_TOTAL_COST_T(msgKey.getKeyValue("ITEM_TOTAL_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_P")) {
						key.setITEM_TOTAL_COST_P(msgKey.getKeyValue("ITEM_TOTAL_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D")) {
						key.setITEM_TOTAL_COST_D(msgKey.getKeyValue("ITEM_TOTAL_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_W")) {
						key.setMATERIAL_COST_W(msgKey.getKeyValue("MATERIAL_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_T")) {
						key.setMATERIAL_COST_T(msgKey.getKeyValue("MATERIAL_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_P")) {
						key.setMATERIAL_COST_P(msgKey.getKeyValue("MATERIAL_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_D")) {
						key.setMATERIAL_COST_D(msgKey.getKeyValue("MATERIAL_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_W")) {
						key.setPROCESSING_COST_W(msgKey.getKeyValue("PROCESSING_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_T")) {
						key.setPROCESSING_COST_T(msgKey.getKeyValue("PROCESSING_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_P")) {
						key.setPROCESSING_COST_P(msgKey.getKeyValue("PROCESSING_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_D")) {
						key.setPROCESSING_COST_D(msgKey.getKeyValue("PROCESSING_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_W")) {
						key.setSBCNT_COST_W(msgKey.getKeyValue("SBCNT_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_T")) {
						key.setSBCNT_COST_T(msgKey.getKeyValue("SBCNT_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_P")) {
						key.setSBCNT_COST_P(msgKey.getKeyValue("SBCNT_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_D")) {
						key.setSBCNT_COST_D(msgKey.getKeyValue("SBCNT_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_W")) {
						key.setOTHER_OVERHEADS_W(msgKey.getKeyValue("OTHER_OVERHEADS_W"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_T")) {
						key.setOTHER_OVERHEADS_T(msgKey.getKeyValue("OTHER_OVERHEADS_T"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_P")) {
						key.setOTHER_OVERHEADS_P(msgKey.getKeyValue("OTHER_OVERHEADS_P"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D")) {
						key.setOTHER_OVERHEADS_D(msgKey.getKeyValue("OTHER_OVERHEADS_D"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_W")) {
						key.setSERVICE_COST_W(msgKey.getKeyValue("SERVICE_COST_W"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_T")) {
						key.setSERVICE_COST_T(msgKey.getKeyValue("SERVICE_COST_T"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_P")) {
						key.setSERVICE_COST_P(msgKey.getKeyValue("SERVICE_COST_P"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_D")) {
						key.setSERVICE_COST_D(msgKey.getKeyValue("SERVICE_COST_D"));
					}
					if(msgKeyType.containsKeyColumn("PROFIT_RATIO_W")) {
						key.setPROFIT_RATIO_W(msgKey.getKeyValue("PROFIT_RATIO_W"));
					}
					if(msgKeyType.containsKeyColumn("PROFIT_RATIO_P")) {
						key.setPROFIT_RATIO_P(msgKey.getKeyValue("PROFIT_RATIO_P"));
					}
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("TYP_NUM")) {
						key.setTYP_NUM(msgKey.getKeyValue("TYP_NUM"));
					}
					if(msgKeyType.containsKeyColumn("h_DETAL_NO")) {
						key.seth_DETAL_NO(msgKey.getKeyValue("h_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("h_ES_COST_ETC")) {
						key.seth_ES_COST_ETC(msgKey.getKeyValue("h_ES_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("h_COST_PROGRESS")) {
						key.seth_COST_PROGRESS(msgKey.getKeyValue("h_COST_PROGRESS"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_AMOUNT")) {
						key.setl_ODR_AMOUNT(msgKey.getKeyValue("l_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_TOTAL_COST_D2")) {
						key.setITEM_TOTAL_COST_D2(msgKey.getKeyValue("ITEM_TOTAL_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("MATERIAL_COST_D2")) {
						key.setMATERIAL_COST_D2(msgKey.getKeyValue("MATERIAL_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("PROCESSING_COST_D2")) {
						key.setPROCESSING_COST_D2(msgKey.getKeyValue("PROCESSING_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("SBCNT_COST_D2")) {
						key.setSBCNT_COST_D2(msgKey.getKeyValue("SBCNT_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("OTHER_OVERHEADS_D2")) {
						key.setOTHER_OVERHEADS_D2(msgKey.getKeyValue("OTHER_OVERHEADS_D2"));
					}
					if(msgKeyType.containsKeyColumn("SERVICE_COST_D2")) {
						key.setSERVICE_COST_D2(msgKey.getKeyValue("SERVICE_COST_D2"));
					}
					if(msgKeyType.containsKeyColumn("PROGRESS_NO")) {
						key.setPROGRESS_NO(msgKey.getKeyValue("PROGRESS_NO"));
					}
					if(msgKeyType.containsKeyColumn("pnumFlag")) {
						key.setpnumFlag(msgKey.getKeyValue("pnumFlag"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_STAT")) {
						key.setPROJECT_STAT(msgKey.getKeyValue("PROJECT_STAT"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_CD")) {
						key.setPROJECT_CD(msgKey.getKeyValue("PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_NO")) {
						key.setODR_NO(msgKey.getKeyValue("ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_ETC")) {
						key.setCMP_COST_ETC(msgKey.getKeyValue("CMP_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_NO")) {
						key.setESTIMATE_NO(msgKey.getKeyValue("ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("DETAL_NO")) {
						key.setDETAL_NO(msgKey.getKeyValue("DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("DISPLAY_NAME")) {
						key.setDISPLAY_NAME(msgKey.getKeyValue("DISPLAY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("NAME")) {
						key.setNAME(msgKey.getKeyValue("NAME"));
					}
					if(msgKeyType.containsKeyColumn("VALUE")) {
						key.setVALUE(msgKey.getKeyValue("VALUE"));
					}
					if(msgKeyType.containsKeyColumn("PROJECT_NAME")) {
						key.setPROJECT_NAME(msgKey.getKeyValue("PROJECT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("PJ_MODIFY_COUNT")) {
						key.setPJ_MODIFY_COUNT(msgKey.getKeyValue("PJ_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ESTIMATE_TYPE")) {
						key.setESTIMATE_TYPE(msgKey.getKeyValue("ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_ITEM_CD")) {
						key.setCUST_ITEM_CD(msgKey.getKeyValue("CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ODR_AMOUNT")) {
						key.setODR_AMOUNT(msgKey.getKeyValue("ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_MATERIAL")) {
						key.setES_COST_MATERIAL(msgKey.getKeyValue("ES_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_PROCESS")) {
						key.setES_COST_PROCESS(msgKey.getKeyValue("ES_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_OUTSOUCE")) {
						key.setES_COST_OUTSOUCE(msgKey.getKeyValue("ES_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_ETC")) {
						key.setES_COST_ETC(msgKey.getKeyValue("ES_COST_ETC"));
					}
					if(msgKeyType.containsKeyColumn("ES_COST_SERVICE")) {
						key.setES_COST_SERVICE(msgKey.getKeyValue("ES_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("MODIFY_COUNT")) {
						key.setMODIFY_COUNT(msgKey.getKeyValue("MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ODR_QTY")) {
						key.setODR_QTY(msgKey.getKeyValue("ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_CD")) {
						key.setUNIT_CD(msgKey.getKeyValue("UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ODR_UNIT_PRICE")) {
						key.setODR_UNIT_PRICE(msgKey.getKeyValue("ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("DESINATED_DLV_DATE")) {
						key.setDESINATED_DLV_DATE(msgKey.getKeyValue("DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CANCEL_NO")) {
						key.setl_JOB_ODR_CANCEL_NO(msgKey.getKeyValue("l_JOB_ODR_CANCEL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_PLANT_CD")) {
						key.setl_PLANT_CD(msgKey.getKeyValue("l_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("TOTAL_DATE")) {
						key.setTOTAL_DATE(msgKey.getKeyValue("TOTAL_DATE"));
					}
					if(msgKeyType.containsKeyColumn("COST_PROGRESS")) {
						key.setCOST_PROGRESS(msgKey.getKeyValue("COST_PROGRESS"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_MATERIAL")) {
						key.setCMP_COST_MATERIAL(msgKey.getKeyValue("CMP_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_MATERIAL")) {
						key.setEXP_COST_MATERIAL(msgKey.getKeyValue("EXP_COST_MATERIAL"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_PROCESS")) {
						key.setCMP_COST_PROCESS(msgKey.getKeyValue("CMP_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_PROCESS")) {
						key.setEXP_COST_PROCESS(msgKey.getKeyValue("EXP_COST_PROCESS"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_OUTSOUCE")) {
						key.setCMP_COST_OUTSOUCE(msgKey.getKeyValue("CMP_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_OUTSOUCE")) {
						key.setEXP_COST_OUTSOUCE(msgKey.getKeyValue("EXP_COST_OUTSOUCE"));
					}
					if(msgKeyType.containsKeyColumn("CMP_COST_SERVICE")) {
						key.setCMP_COST_SERVICE(msgKey.getKeyValue("CMP_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("EXP_COST_SERVICE")) {
						key.setEXP_COST_SERVICE(msgKey.getKeyValue("EXP_COST_SERVICE"));
					}
					if(msgKeyType.containsKeyColumn("OD_COMP_FLG")) {
						key.setOD_COMP_FLG(msgKey.getKeyValue("OD_COMP_FLG"));
					}
					if(msgKeyType.containsKeyColumn("pvc2LogMode")) {
						key.setpvc2LogMode(msgKey.getKeyValue("pvc2LogMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputMode")) {
						key.setpvc2OutputMode(msgKey.getKeyValue("pvc2OutputMode"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputPath")) {
						key.setpvc2OutputPath(msgKey.getKeyValue("pvc2OutputPath"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OutputName")) {
						key.setpvc2OutputName(msgKey.getKeyValue("pvc2OutputName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2UserId")) {
						key.setpvc2UserId(msgKey.getKeyValue("pvc2UserId"));
					}
					if(msgKeyType.containsKeyColumn("pvc2BusinessName")) {
						key.setpvc2BusinessName(msgKey.getKeyValue("pvc2BusinessName"));
					}
					if(msgKeyType.containsKeyColumn("pvc2PlantCd")) {
						key.setpvc2PlantCd(msgKey.getKeyValue("pvc2PlantCd"));
					}
					if(msgKeyType.containsKeyColumn("pvc2OdrNo")) {
						key.setpvc2OdrNo(msgKey.getKeyValue("pvc2OdrNo"));
					}
					if(msgKeyType.containsKeyColumn("pvc2PProjectCd")) {
						key.setpvc2PProjectCd(msgKey.getKeyValue("pvc2PProjectCd"));
					}
					if(msgKeyType.containsKeyColumn("pnumEstimateNo")) {
						key.setpnumEstimateNo(msgKey.getKeyValue("pnumEstimateNo"));
					}
					if(msgKeyType.containsKeyColumn("pnumDetalNo")) {
						key.setpnumDetalNo(msgKey.getKeyValue("pnumDetalNo"));
					}
					if(msgKeyType.containsKeyColumn("pnumReturn")) {
						key.setpnumReturn(msgKey.getKeyValue("pnumReturn"));
					}
					if(msgKeyType.containsKeyColumn("FILE_PATH")) {
						key.setFILE_PATH(msgKey.getKeyValue("FILE_PATH"));
					}
					if(msgKeyType.containsKeyColumn("FILE_NAME")) {
						key.setFILE_NAME(msgKey.getKeyValue("FILE_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOG_MODE_TYP")) {
						key.setLOG_MODE_TYP(msgKey.getKeyValue("LOG_MODE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("OUTPUT_MODE_TYP")) {
						key.setOUTPUT_MODE_TYP(msgKey.getKeyValue("OUTPUT_MODE_TYP"));
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
