/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AC0040/src/com/nec/jp/orteus/metamorBase/AC0040/AC0040010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AC0040;

import com.nec.jp.orteus.metamorBase.AC0040.*;
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
import java.io.*;
import jp.co.fit.vfreport.*;
//{{user_implement_code_import
 // TODO: ここにimportパッケージを記述してください
import java.text.DecimalFormat;
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AC0040010Control
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
        public AC0040010Struct getListvalue(int x) { return (AC0040010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AC0040010Struct getStruct() { return this.struct; }	// Structを返します。
        public AC0040010Struct createStruct() { return new AC0040010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AC0040010Struct)structname); }	// Structをセットします。
        public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
        // TODO: ユーザ定義のコードを記述してください
         private String format(String value) throws Exception {
          if (value == null) {
           return "";
          }
          Double dblValue = Double.valueOf(value);
          // CSVの数字項目フォーマット
          DecimalFormat cvsFormatter = new DecimalFormat("###,###,###,###,##0.00");
          return cvsFormatter.format(dblValue.doubleValue());
         }
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
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 帳票出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlPrint() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPrint");
			AC0040010Struct strPdf = null;

		int ret = 0;
		String printType      = getPdfOutputType();
		String printPattern   = getPdfOutputListPattern();
		String printer        = getPdfOutputPrinter();
		SvfWrapper svf        = new SvfWrapper(printType, getsysUSER_CD(), printer);

			//{{user_implement_dev:<controlPrint>
			String printId1 = "AC00400101";
			String queryId1 = null;
			
		try {
			//検索条件：工場コードの指定
			struct.setk_PLANT_CD(getsysPLANT_CD());
			
			//検索条件：日付の指定
			struct.setk_ODR_START_DATE(null);
			struct.setk_PRD_DUE_DATE(null);
			struct.setk_PRD_START_DATE(null);
			
			//検索条件：取引先の指定
			struct.setk_VEND_CD(struct.getVEND_CD());
			// 未入力または%のときはnullにする
			if ( struct.getVEND_CD() != null && 
					(struct.getVEND_CD().equals("") || struct.getVEND_CD().equals("%")) ) {
				struct.setk_VEND_CD(null);
			}
			
			//検索条件：製番の指定
			struct.setk_JOB_ODR_CD(struct.getJOB_ODR_CD());
			// 未入力または%のときはnullにする
			if ( struct.getJOB_ODR_CD() != null &&
				(struct.getJOB_ODR_CD().equals("") || struct.getJOB_ODR_CD().equals("%")) ) {
				struct.setk_JOB_ODR_CD(null);
			}
			
			// 条件分岐開始
			if (struct.getr_ODR_START_DATE().equals("true")) { // 手配着手日
				struct.setk_ODR_START_DATE(struct.getINPUT_DATE());
				struct.setIN_RadioButton("1");
				
				if (struct.getc_CHECK3().equals("true")) { // 発注残を含めるにチェックがある
					struct.setk_ODR_STS_TYP(null);
					struct.setIN_c_CHECK3("1");
					
					if (struct.getk_VEND_CD() == null) { // 取引先が未入力または％
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC00400101";
						} else { // // 製番が入力されている
							queryId1 = "AC00400102";
						}
					} else { // // 取引先が入力されている
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC00400103";
						} else { // // 製番が入力されている
							queryId1 = "AC00400104";
						}
					}
				} else { // 発注残を含めるにチェックがない
					struct.setk_ODR_STS_TYP("1");
					struct.setIN_c_CHECK3(null);
					
					if (struct.getk_VEND_CD() == null) { // 取引先が未入力または％
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC00400105";
						} else { // // 製番が入力されている
							queryId1 = "AC00400106";
						}
					} else { // // 取引先が入力されている
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC00400107";
						} else { // // 製番が入力されている
							queryId1 = "AC00400108";
						}
					}
					
				}
			} else if (struct.getr_PRD_START_DATE().equals("true")) { // 製造着手日
				struct.setk_PRD_START_DATE(struct.getINPUT_DATE());
				struct.setIN_RadioButton("2");
				
				if (struct.getc_CHECK3().equals("true")) { // 発注残を含めるにチェックがある
					struct.setk_ODR_STS_TYP(null);
					struct.setIN_c_CHECK3("1");
					
					if (struct.getk_VEND_CD() == null) { // 取引先が未入力または％
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC00400109";
						} else { // // 製番が入力されている
							queryId1 = "AC004001010";
						}
					} else { // // 取引先が入力されている
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC004001011";
						} else { // // 製番が入力されている
							queryId1 = "AC004001012";
						}
					}
				} else { // 発注残を含めるにチェックがない
					struct.setk_ODR_STS_TYP("1");
					struct.setIN_c_CHECK3(null);
					
					if (struct.getk_VEND_CD() == null) { // 取引先が未入力または％
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC004001013";
						} else { // // 製番が入力されている
							queryId1 = "AC004001014";
						}
					} else { // // 取引先が入力されている
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC004001015";
						} else { // // 製番が入力されている
							queryId1 = "AC004001016";
						}
					}
				}
			} else { // 製造納期
				struct.setk_PRD_DUE_DATE(struct.getINPUT_DATE());
				struct.setIN_RadioButton("3");
				
				if (struct.getc_CHECK3().equals("true")) { // 発注残を含めるにチェックがある
					struct.setk_ODR_STS_TYP(null);
					struct.setIN_c_CHECK3("1");
					
					if (struct.getk_VEND_CD() == null) { // 取引先が未入力または％
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC004001017";
						} else { // // 製番が入力されている
							queryId1 = "AC004001018";
						}
					} else { // // 取引先が入力されている
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC004001019";
						} else { // // 製番が入力されている
							queryId1 = "AC004001020";
						}
					}
				} else { // 発注残を含めるにチェックがない
					struct.setk_ODR_STS_TYP("1");
					struct.setIN_c_CHECK3(null);
					
					if (struct.getk_VEND_CD() == null) { // 取引先が未入力または％
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC004001021";
						} else { // // 製番が入力されている
							queryId1 = "AC004001022";
						}
					} else { // // 取引先が入力されている
						if (struct.getk_JOB_ODR_CD() == null) { // 製番が未入力または％
							queryId1 = "AC004001023";
						} else { // // 製番が入力されている
							queryId1 = "AC004001024";
						}
					}
				}
			}

			ret = svf.VrInit(printId1,queryId1);	// PDF作成開始
			pdfFilePath = svf.getPdfFilePath();	// pdfフルパスファイル名
			pdfFileName = svf.getPdfFileName();	// pdfファイル名（Web用）
			queryFileName = svf.getQueryFileName();	// queryファイル名

			/* クエリーファイルの指定 */
			if(dbKIND != null && !dbKIND.equals("")) {
				ret = svf.VrSetQuery("KIND=" + dbKIND + ";UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			} else {
				ret = svf.VrSetQuery("UID=" + dbUID + ";PWD=" + dbPWD + ";DBQ=" + dbDBQ);
			}
			/* クエリー抽出条件の指定 */

			ret = svf.VrCondition("[X|PLANT_CD]=" + struct.getk_PLANT_CD(), 4); // 工場コード
			ret = svf.VrCondition("[X|ODR_START_DATE]=" + struct.getk_ODR_START_DATE(), 4); // 手配着手日
			ret = svf.VrCondition("[X|PRD_START_DATE]=" + struct.getk_PRD_START_DATE(), 4); // 製造着手日
			ret = svf.VrCondition("[X|PRD_DUE_DATE]=" + struct.getk_PRD_DUE_DATE(), 4); // 製造納期
			ret = svf.VrCondition("[X|VEND_CD]=" + struct.getk_VEND_CD(), 4); // 取引先
			ret = svf.VrCondition("[X|JOB_ODR_CD]=" + struct.getk_JOB_ODR_CD(), 4); // 製番
			ret = svf.VrCondition("[X|ODR_STS_TYP]=" + struct.getk_ODR_STS_TYP(), 4); // オーダ状態区分


			/* クエリー実行 */
			ret = svf.VrReport();
			if(ret == -554) {
				ExpjMessage emsg = new ExpjMessage("ZZ06001");
				msgStruct.addError(emsg);
				sysLog.warning(emsg, sysUSER_CD);
				return;
			}

			/* PDF作成終了 */
			ret = svf.VrQuit();
			if ( "0".equals(printType) ) {	// クライアント印刷の場合
				struct.setDOWNLOAD_FILE(getPdfFileName());
			}
			else if ( "1".equals(printType) ) {
				try {
					String acrobatPath = svf.getAcrobatPath();
					String acrobatOption1 = svf.getAcrobatOption1();
					String acrobatOption2 = svf.getAcrobatOption2();
					String pdfPrinter = svf.getPrinter();
					Runtime.getRuntime().exec(new String[]{acrobatPath, acrobatOption1, acrobatOption2, pdfFilePath, pdfPrinter});
					//Runtime.getRuntime().exec(svf.getExecuteOutput());
				}catch(IOException e){
					// サーバ印刷失敗時のエラー処理を記述してください。
                   ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                   sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                   ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                   throw ee;
				}
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
                //}}user_implement_dev:<controlPrint>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPrint");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
                 // TODO: ユーザ定義のコードを記述してください
                 
                try{
                 //業務運用日の取得
                 struct.setuser_PLANT_CD(getsysPLANT_CD());
                 list = entity.mselectSYS_DATE_CTRL.read(conn,struct);
                 AC0040010Struct strDate = null;
                 strDate = (AC0040010Struct)list.get(0);
                 struct.setBUSINESS_OPR_DATE(strDate.getBUSINESS_OPR_DATE());
                 
                } catch(SQLException e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }catch(Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }
                //}}user_implement_dev:<controlClear>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * CSV出力ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCsvOut() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");
			//{{user_implement_dev:<controlCsvOut>
                try {
                 csvWriter = new CsvWriter(CsvWriter.getFileName(getsysUSER_CD()));
                 // CSV出力情報取得
                 setReadStatus(INITIAL );
              
                 //検索条件：日付の指定
                 struct.setk_ODR_START_DATE(null);
                 struct.setk_PRD_DUE_DATE(null);
                 struct.setk_PRD_START_DATE(null);
                 if (struct.getr_ODR_START_DATE().equals("true")) {
                  struct.setk_ODR_START_DATE(struct.getINPUT_DATE());
                  struct.setIN_RadioButton("1");
                 } else if (struct.getr_PRD_START_DATE().equals("true")) {
                  struct.setk_PRD_START_DATE(struct.getINPUT_DATE());
                  struct.setIN_RadioButton("2");
                 } else {
                  struct.setk_PRD_DUE_DATE(struct.getINPUT_DATE());
                  struct.setIN_RadioButton("3");
                 }
                 //検索条件：工場コードの指定
                 struct.setk_PLANT_CD(getsysPLANT_CD());
                 //検索条件：オーダ状態区分の指定
                 if (struct.getc_CHECK3().equals("true")) {
                  struct.setk_ODR_STS_TYP(null);
                  struct.setIN_c_CHECK3("1");
                 } else {
                  struct.setk_ODR_STS_TYP("1");
                  struct.setIN_c_CHECK3(null);
                 }
                 //検索条件：取引先の指定
                 struct.setk_VEND_CD(struct.getVEND_CD());
                 if (struct.getVEND_CD() != null && struct.getVEND_CD().equals("%")) {
                  struct.setk_VEND_CD(null);
                 }
                 //検索条件：製番の指定
                 struct.setk_JOB_ODR_CD(struct.getJOB_ODR_CD());
                 if (struct.getJOB_ODR_CD() != null && struct.getJOB_ODR_CD().equals("%")) {
                  struct.setk_JOB_ODR_CD(null);
                 }
                 //購入予定表ＶＩＥＷの読み込み
                 list = entity.mselectT_OD.read(conn, struct);
                 if(getListsize() == 0){
                  //指定キーのデータが存在しません。
                  ExpjMessage emsg = new ExpjMessage("ZZ01101");
                  msgStruct.addError(emsg);
                  sysLog.warning(emsg, getsysUSER_CD());//エラー詳細
                  setReadStatus(NOT_FOUND);
                  return;
                 }
              
                 List csvList = new ArrayList();
                 //CSV情報の作成
                 String csvTitle[] = {
						"Expj.OD_NO" ,
						"Expj.PLANT_CD" ,
						"Expj.JOB_ODR_CD" ,
						"Expj.JOB_ODR_DETAIL_NO" ,
						"Expj.ITEM_CD" ,
						"Expj.ITEM_NAME" ,
						"Expj.COMPANY_CD" ,
						"Expj.VEND_CD" ,
						"Expj.Cmt1064" ,
						"Expj.ODR_STS_TYP" ,
						"Expj.Cmt6204",
						"Expj.ODR_START_DATE" ,
						"Expj.PRD_DUE_DATE" ,
						"Expj.PRD_START_DATE" ,
						"Expj.OD_TYP" ,
						"Expj.Cmt6205",
						"Expj.ODR_QTY" ,
						"Expj.OUTSIDE_TYP_3" ,
						"Expj.Cmt6206",
						"Expj.RCV_QTY_1" ,
						"Expj.PUCH_ODR_QTY" ,
						"Expj.UNIT_COST" ,
						"Expj.UNIT_COST_TYP" ,
						"Expj.Cmt1094",
						"Expj.ROUND_TYP" ,
						"Expj.Cmt6207",
						"Expj.PUCH_ODR_AMOUNT_2" 
				};
                 csvList.add(csvTitle);
                 AC0040010Struct workStruct;
                 for(int i=0;i<getListsize();i++){
                  workStruct = getListvalue(i);
                  //コンボボックスの取得  
                  workStruct.setODR_STS_TYP_DEN(multcombo("ODR_STS_TYP",workStruct.gets_ODR_STS_TYP()));
                  workStruct.setOD_TYP_DEN(multcombo("OD_TYP",workStruct.gets_OD_TYP()));
                  workStruct.setOUTSIDE_TYP_DEN(multcombo("OUTSIDE_TYP",workStruct.gets_OUTSIDE_TYP()));
                  workStruct.setROUND_TYP_DEN(multcombo("ROUND_TYP",workStruct.gets_ROUND_TYP()));
                  workStruct.setUNIT_COST_TYP_DEN(multcombo("UNIT_COST_TYP",workStruct.gets_UNIT_COST_TYP()));
                  
                  String csvStr [] = new String[csvTitle.length];
                  csvStr[0] = workStruct.gets_OD_NO();
                  csvStr[1] = workStruct.gets_PLANT_CD();
                  csvStr[2] = workStruct.gets_JOB_ODR_CD();
                  csvStr[3] = workStruct.gets_JOB_ODR_DETAIL_NO();
                  csvStr[4] = workStruct.gets_ITEM_CD();
                  csvStr[5] = workStruct.gets_ITEM_NAME();
                  csvStr[6] = workStruct.gets_COMPANY_CD();
                  csvStr[7] = workStruct.gets_VEND_CD();
                  csvStr[8] = workStruct.gets_VEND_NAME();
                  csvStr[9] = workStruct.gets_ODR_STS_TYP();
                  csvStr[10] = workStruct.getODR_STS_TYP_DEN();
                  csvStr[11] = workStruct.gets_ODR_START_DATE();
                  csvStr[12] = workStruct.gets_PRD_DUE_DATE();
                  csvStr[13] = workStruct.gets_PRD_START_DATE();
                  csvStr[14] = workStruct.gets_OD_TYP();
                  csvStr[15] = workStruct.getOD_TYP_DEN();
                  csvStr[16] = this.format(workStruct.gets_ODR_QTY());
                  csvStr[17] = workStruct.gets_OUTSIDE_TYP();
                  csvStr[18] = workStruct.getOUTSIDE_TYP_DEN();
                  csvStr[19] = this.format(workStruct.gets_TOTAL_RCV_QTY());
                  csvStr[20] = this.format(workStruct.gets_PUCH_ODR_QTY());
                  csvStr[21] = this.format(workStruct.gets_UNIT_COST());
                  csvStr[22] = workStruct.gets_UNIT_COST_TYP();
                  csvStr[23] = workStruct.getUNIT_COST_TYP_DEN();
                  csvStr[24] = workStruct.gets_ROUND_TYP();
                  csvStr[25] = workStruct.getROUND_TYP_DEN();
                  csvStr[26] = this.format(workStruct.gets_PUCH_ODR_AMOUNT());
                  csvList.add(csvStr);
                 }
              
                 if(csvList != null && csvList.size() > 0){
                  try{
                   csvWriter.write(csvList, CoreTools.getLocale(struct.getsUser_ID()),true);
                  }catch(Exception e){
                   //CSV出力失敗
                   ExpjMessage emsg = new ExpjMessage("ZZ01107");
                   sysLog.severe(emsg, getsysUSER_CD());
                   ExpjException ee = new ExpjException(e, emsg);
                   throw ee;
                  }
                 }
                 setReadStatus(NORMAL);
                 
                } catch(Exception e) {
                 e.printStackTrace();
                 // エラー処理を記述してください。
                }
                //}}user_implement_dev:<controlCsvOut>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlCsvOut");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                 // TODO: ユーザ定義のコードを記述してください
                try{
                 // 画面遷移の呼び出しだったら、Structに画面遷移キーを設定してcontrolSelect()を呼び出す
                 if ( isScreenMove() == true ) {
                  // 検索のコントロールメソッドを呼び出します。
              //				controlSelect();
                 }
              
                 //業務運用日の取得
                 struct.setuser_PLANT_CD(getsysPLANT_CD());
                 list = entity.mselectSYS_DATE_CTRL.read(conn,struct);
                 AC0040010Struct strDate = null;
                 strDate = (AC0040010Struct)list.get(0);
                 struct.setBUSINESS_OPR_DATE(strDate.getBUSINESS_OPR_DATE());
                 
                } catch(SQLException e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }catch(Exception e) {
                 e.printStackTrace();
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());//致命的エラー エラー内容
                 ExpjException ee = new ExpjException(e, emsg); // エクセプションを生成
                 throw ee;
                }
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AC0040");
		logger.entering("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");
		struct.setDOWNLOAD_FILE((String)null);	// ダウンロードファイル名クリア
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
		logger.exiting("AC0040010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			if( button.equals("Print") ) {
				controlPrint();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
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
//			throw new FoundationException("AC0040010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0040010-E999","CSVの出力処理"));
			throw new FoundationException("AC0040010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0040010-E999","システム日付の取得処理"));
				throw new FoundationException("AC0040010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                 // TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AC0040010-E999","コントロールのイベント処理"));
			throw new FoundationException("AC0040010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AC0040010Entity entity;
	protected AC0040010Struct struct;
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

		entity = new AC0040010Entity();
		struct = new AC0040010Struct();

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
	 * AC0040010クラスの標準コンストラクタ
	 */
	public AC0040010Control() throws BusinessProcessException, FoundationException
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
				AC0040010Struct key = (AC0040010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE") && key.getDOWNLOAD_FILE() != null) {
					msgKey.setKeyValue("DOWNLOAD_FILE", key.getDOWNLOAD_FILE());
				}
				if(msgKeyType.containsKeyColumn("SUBMIT_BUTTON_TYPE") && key.getSUBMIT_BUTTON_TYPE() != null) {
					msgKey.setKeyValue("SUBMIT_BUTTON_TYPE", key.getSUBMIT_BUTTON_TYPE());
				}
				if(msgKeyType.containsKeyColumn("PRINTER_TYPE") && key.getPRINTER_TYPE() != null) {
					msgKey.setKeyValue("PRINTER_TYPE", key.getPRINTER_TYPE());
				}
				if(msgKeyType.containsKeyColumn("SELECTED_PRINTER") && key.getSELECTED_PRINTER() != null) {
					msgKey.setKeyValue("SELECTED_PRINTER", key.getSELECTED_PRINTER());
				}
				if(msgKeyType.containsKeyColumn("r_ODR_START_DATE") && key.getr_ODR_START_DATE() != null) {
					msgKey.setKeyValue("r_ODR_START_DATE", key.getr_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("INPUT_DATE") && key.getINPUT_DATE() != null) {
					msgKey.setKeyValue("INPUT_DATE", key.getINPUT_DATE());
				}
				if(msgKeyType.containsKeyColumn("r_PRD_START_DATE") && key.getr_PRD_START_DATE() != null) {
					msgKey.setKeyValue("r_PRD_START_DATE", key.getr_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("r_PRD_DUE_DATE") && key.getr_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("r_PRD_DUE_DATE", key.getr_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("c_CHECK3") && key.getc_CHECK3() != null) {
					msgKey.setKeyValue("c_CHECK3", key.getc_CHECK3());
				}
				if(msgKeyType.containsKeyColumn("IN_c_CHECK3") && key.getIN_c_CHECK3() != null) {
					msgKey.setKeyValue("IN_c_CHECK3", key.getIN_c_CHECK3());
				}
				if(msgKeyType.containsKeyColumn("IN_RadioButton") && key.getIN_RadioButton() != null) {
					msgKey.setKeyValue("IN_RadioButton", key.getIN_RadioButton());
				}
				if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DEN") && key.getODR_STS_TYP_DEN() != null) {
					msgKey.setKeyValue("ODR_STS_TYP_DEN", key.getODR_STS_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("OD_TYP_DEN") && key.getOD_TYP_DEN() != null) {
					msgKey.setKeyValue("OD_TYP_DEN", key.getOD_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DEN") && key.getOUTSIDE_TYP_DEN() != null) {
					msgKey.setKeyValue("OUTSIDE_TYP_DEN", key.getOUTSIDE_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("ROUND_TYP_DEN") && key.getROUND_TYP_DEN() != null) {
					msgKey.setKeyValue("ROUND_TYP_DEN", key.getROUND_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_DEN") && key.getUNIT_COST_TYP_DEN() != null) {
					msgKey.setKeyValue("UNIT_COST_TYP_DEN", key.getUNIT_COST_TYP_DEN());
				}
				if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE") && key.getBUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("BUSINESS_OPR_DATE", key.getBUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("user_PLANT_CD") && key.getuser_PLANT_CD() != null) {
					msgKey.setKeyValue("user_PLANT_CD", key.getuser_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("s_OD_NO") && key.gets_OD_NO() != null) {
					msgKey.setKeyValue("s_OD_NO", key.gets_OD_NO());
				}
				if(msgKeyType.containsKeyColumn("s_PLANT_CD") && key.gets_PLANT_CD() != null) {
					msgKey.setKeyValue("s_PLANT_CD", key.gets_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("s_JOB_ODR_CD") && key.gets_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("s_JOB_ODR_CD", key.gets_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("s_JOB_ODR_DETAIL_NO") && key.gets_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("s_JOB_ODR_DETAIL_NO", key.gets_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("s_ITEM_CD") && key.gets_ITEM_CD() != null) {
					msgKey.setKeyValue("s_ITEM_CD", key.gets_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("s_ITEM_NAME") && key.gets_ITEM_NAME() != null) {
					msgKey.setKeyValue("s_ITEM_NAME", key.gets_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_COMPANY_CD") && key.gets_COMPANY_CD() != null) {
					msgKey.setKeyValue("s_COMPANY_CD", key.gets_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("s_VEND_CD") && key.gets_VEND_CD() != null) {
					msgKey.setKeyValue("s_VEND_CD", key.gets_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("s_VEND_NAME") && key.gets_VEND_NAME() != null) {
					msgKey.setKeyValue("s_VEND_NAME", key.gets_VEND_NAME());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_STS_TYP") && key.gets_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("s_ODR_STS_TYP", key.gets_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_START_DATE") && key.gets_ODR_START_DATE() != null) {
					msgKey.setKeyValue("s_ODR_START_DATE", key.gets_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE") && key.gets_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("s_PRD_DUE_DATE", key.gets_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_PRD_START_DATE") && key.gets_PRD_START_DATE() != null) {
					msgKey.setKeyValue("s_PRD_START_DATE", key.gets_PRD_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("s_OD_TYP") && key.gets_OD_TYP() != null) {
					msgKey.setKeyValue("s_OD_TYP", key.gets_OD_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ODR_QTY") && key.gets_ODR_QTY() != null) {
					msgKey.setKeyValue("s_ODR_QTY", key.gets_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP") && key.gets_OUTSIDE_TYP() != null) {
					msgKey.setKeyValue("s_OUTSIDE_TYP", key.gets_OUTSIDE_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_TOTAL_RCV_QTY") && key.gets_TOTAL_RCV_QTY() != null) {
					msgKey.setKeyValue("s_TOTAL_RCV_QTY", key.gets_TOTAL_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_PUCH_ODR_QTY") && key.gets_PUCH_ODR_QTY() != null) {
					msgKey.setKeyValue("s_PUCH_ODR_QTY", key.gets_PUCH_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("s_UNIT_COST") && key.gets_UNIT_COST() != null) {
					msgKey.setKeyValue("s_UNIT_COST", key.gets_UNIT_COST());
				}
				if(msgKeyType.containsKeyColumn("s_UNIT_COST_TYP") && key.gets_UNIT_COST_TYP() != null) {
					msgKey.setKeyValue("s_UNIT_COST_TYP", key.gets_UNIT_COST_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_ROUND_TYP") && key.gets_ROUND_TYP() != null) {
					msgKey.setKeyValue("s_ROUND_TYP", key.gets_ROUND_TYP());
				}
				if(msgKeyType.containsKeyColumn("s_PUCH_ODR_AMOUNT") && key.gets_PUCH_ODR_AMOUNT() != null) {
					msgKey.setKeyValue("s_PUCH_ODR_AMOUNT", key.gets_PUCH_ODR_AMOUNT());
				}
				if(msgKeyType.containsKeyColumn("k_VEND_CD") && key.getk_VEND_CD() != null) {
					msgKey.setKeyValue("k_VEND_CD", key.getk_VEND_CD());
				}
				if(msgKeyType.containsKeyColumn("k_JOB_ODR_CD") && key.getk_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("k_JOB_ODR_CD", key.getk_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("k_ODR_STS_TYP") && key.getk_ODR_STS_TYP() != null) {
					msgKey.setKeyValue("k_ODR_STS_TYP", key.getk_ODR_STS_TYP());
				}
				if(msgKeyType.containsKeyColumn("k_PLANT_CD") && key.getk_PLANT_CD() != null) {
					msgKey.setKeyValue("k_PLANT_CD", key.getk_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("k_ODR_START_DATE") && key.getk_ODR_START_DATE() != null) {
					msgKey.setKeyValue("k_ODR_START_DATE", key.getk_ODR_START_DATE());
				}
				if(msgKeyType.containsKeyColumn("k_PRD_DUE_DATE") && key.getk_PRD_DUE_DATE() != null) {
					msgKey.setKeyValue("k_PRD_DUE_DATE", key.getk_PRD_DUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("k_PRD_START_DATE") && key.getk_PRD_START_DATE() != null) {
					msgKey.setKeyValue("k_PRD_START_DATE", key.getk_PRD_START_DATE());
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
					AC0040010Struct key = new AC0040010Struct();
					if(msgKeyType.containsKeyColumn("DOWNLOAD_FILE")) {
						key.setDOWNLOAD_FILE(msgKey.getKeyValue("DOWNLOAD_FILE"));
					}
					if(msgKeyType.containsKeyColumn("SUBMIT_BUTTON_TYPE")) {
						key.setSUBMIT_BUTTON_TYPE(msgKey.getKeyValue("SUBMIT_BUTTON_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("PRINTER_TYPE")) {
						key.setPRINTER_TYPE(msgKey.getKeyValue("PRINTER_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("SELECTED_PRINTER")) {
						key.setSELECTED_PRINTER(msgKey.getKeyValue("SELECTED_PRINTER"));
					}
					if(msgKeyType.containsKeyColumn("r_ODR_START_DATE")) {
						key.setr_ODR_START_DATE(msgKey.getKeyValue("r_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("INPUT_DATE")) {
						key.setINPUT_DATE(msgKey.getKeyValue("INPUT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("r_PRD_START_DATE")) {
						key.setr_PRD_START_DATE(msgKey.getKeyValue("r_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("r_PRD_DUE_DATE")) {
						key.setr_PRD_DUE_DATE(msgKey.getKeyValue("r_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("c_CHECK3")) {
						key.setc_CHECK3(msgKey.getKeyValue("c_CHECK3"));
					}
					if(msgKeyType.containsKeyColumn("IN_c_CHECK3")) {
						key.setIN_c_CHECK3(msgKey.getKeyValue("IN_c_CHECK3"));
					}
					if(msgKeyType.containsKeyColumn("IN_RadioButton")) {
						key.setIN_RadioButton(msgKey.getKeyValue("IN_RadioButton"));
					}
					if(msgKeyType.containsKeyColumn("ODR_STS_TYP_DEN")) {
						key.setODR_STS_TYP_DEN(msgKey.getKeyValue("ODR_STS_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("OD_TYP_DEN")) {
						key.setOD_TYP_DEN(msgKey.getKeyValue("OD_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("OUTSIDE_TYP_DEN")) {
						key.setOUTSIDE_TYP_DEN(msgKey.getKeyValue("OUTSIDE_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("ROUND_TYP_DEN")) {
						key.setROUND_TYP_DEN(msgKey.getKeyValue("ROUND_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("UNIT_COST_TYP_DEN")) {
						key.setUNIT_COST_TYP_DEN(msgKey.getKeyValue("UNIT_COST_TYP_DEN"));
					}
					if(msgKeyType.containsKeyColumn("BUSINESS_OPR_DATE")) {
						key.setBUSINESS_OPR_DATE(msgKey.getKeyValue("BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("user_PLANT_CD")) {
						key.setuser_PLANT_CD(msgKey.getKeyValue("user_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_NO")) {
						key.sets_OD_NO(msgKey.getKeyValue("s_OD_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_PLANT_CD")) {
						key.sets_PLANT_CD(msgKey.getKeyValue("s_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_JOB_ODR_CD")) {
						key.sets_JOB_ODR_CD(msgKey.getKeyValue("s_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_JOB_ODR_DETAIL_NO")) {
						key.sets_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("s_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("s_ITEM_CD")) {
						key.sets_ITEM_CD(msgKey.getKeyValue("s_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_ITEM_NAME")) {
						key.sets_ITEM_NAME(msgKey.getKeyValue("s_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_COMPANY_CD")) {
						key.sets_COMPANY_CD(msgKey.getKeyValue("s_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_VEND_CD")) {
						key.sets_VEND_CD(msgKey.getKeyValue("s_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("s_VEND_NAME")) {
						key.sets_VEND_NAME(msgKey.getKeyValue("s_VEND_NAME"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_STS_TYP")) {
						key.sets_ODR_STS_TYP(msgKey.getKeyValue("s_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_START_DATE")) {
						key.sets_ODR_START_DATE(msgKey.getKeyValue("s_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_DUE_DATE")) {
						key.sets_PRD_DUE_DATE(msgKey.getKeyValue("s_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_PRD_START_DATE")) {
						key.sets_PRD_START_DATE(msgKey.getKeyValue("s_PRD_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("s_OD_TYP")) {
						key.sets_OD_TYP(msgKey.getKeyValue("s_OD_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ODR_QTY")) {
						key.sets_ODR_QTY(msgKey.getKeyValue("s_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_OUTSIDE_TYP")) {
						key.sets_OUTSIDE_TYP(msgKey.getKeyValue("s_OUTSIDE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_TOTAL_RCV_QTY")) {
						key.sets_TOTAL_RCV_QTY(msgKey.getKeyValue("s_TOTAL_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_PUCH_ODR_QTY")) {
						key.sets_PUCH_ODR_QTY(msgKey.getKeyValue("s_PUCH_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("s_UNIT_COST")) {
						key.sets_UNIT_COST(msgKey.getKeyValue("s_UNIT_COST"));
					}
					if(msgKeyType.containsKeyColumn("s_UNIT_COST_TYP")) {
						key.sets_UNIT_COST_TYP(msgKey.getKeyValue("s_UNIT_COST_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_ROUND_TYP")) {
						key.sets_ROUND_TYP(msgKey.getKeyValue("s_ROUND_TYP"));
					}
					if(msgKeyType.containsKeyColumn("s_PUCH_ODR_AMOUNT")) {
						key.sets_PUCH_ODR_AMOUNT(msgKey.getKeyValue("s_PUCH_ODR_AMOUNT"));
					}
					if(msgKeyType.containsKeyColumn("k_VEND_CD")) {
						key.setk_VEND_CD(msgKey.getKeyValue("k_VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("k_JOB_ODR_CD")) {
						key.setk_JOB_ODR_CD(msgKey.getKeyValue("k_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("k_ODR_STS_TYP")) {
						key.setk_ODR_STS_TYP(msgKey.getKeyValue("k_ODR_STS_TYP"));
					}
					if(msgKeyType.containsKeyColumn("k_PLANT_CD")) {
						key.setk_PLANT_CD(msgKey.getKeyValue("k_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("k_ODR_START_DATE")) {
						key.setk_ODR_START_DATE(msgKey.getKeyValue("k_ODR_START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("k_PRD_DUE_DATE")) {
						key.setk_PRD_DUE_DATE(msgKey.getKeyValue("k_PRD_DUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("k_PRD_START_DATE")) {
						key.setk_PRD_START_DATE(msgKey.getKeyValue("k_PRD_START_DATE"));
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
