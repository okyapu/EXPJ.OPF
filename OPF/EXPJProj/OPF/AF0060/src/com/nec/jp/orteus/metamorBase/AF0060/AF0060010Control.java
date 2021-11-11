/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/AF0060/src/com/nec/jp/orteus/metamorBase/AF0060/AF0060010Control.java,v $
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

package com.nec.jp.orteus.metamorBase.AF0060;

import com.nec.jp.orteus.metamorBase.AF0060.*;
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
//-----------------------------------------------------------------------------
import com.nec.jp.orteus.metamorBase.util.AlarmMessage.AlarmMessageException;
import com.nec.jp.orteus.metamorBase.common08.LotCtrl.LotCtrl;
import com.nec.jp.orteus.metamorBase.common.CollectNumber.CollectNumber;

//import com.nec.jp.orteus.metamorBase.common01.RcvIssue.IssueProcess;
//import com.nec.jp.orteus.metamorBase.common01.RcvIssue.RcvProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.IssueProcess;
import com.nec.jp.orteus.expj.pr.rcvissue.process.RcvProcess;
import com.nec.jp.orteus.metamorBase.common01.util.Calculate;

import java.text.SimpleDateFormat;
import java.text.ParseException;

import java.math.BigDecimal;
//-----------------------------------------------------------------------------
//}}user_implement_code_import

//{{user_implement_code_header
//}}user_implement_code_header

public class AF0060010Control
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
	    private String lotCtrl;
        protected List list;											// 結果リストのインスタンス
        public List getList() { return this.list; }						// リストを返します。
        public void setList(List listname) { this.list = listname; }	// リストをセットします。
        public int getListsize() {										// リスト型のサイズを返します。
         int nret = 0;
         if( this.list != null ) {nret = this.list.size();}
         return nret;
        }
       //	public Object getListvalue(int x) { return this.list.get(x); }	// リストの値を返します。
        public AF0060010Struct getListvalue(int x) { return (AF0060010Struct)(this.list.get(x)); }	// リストの値を返します。
        public AF0060010Struct getStruct() { return this.struct; }	// Structを返します。
        public AF0060010Struct createStruct() { return new AF0060010Struct(); }	// 新しいStructを作って返します。
        public void setStruct(Object structname) { this.struct.setStruct((AF0060010Struct)structname); }	// Structをセットします。
       //	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。
       
        // CSV出力用リスト
        private CsvWriter csvWriter = null;
        public CsvWriter getCsvWriter(){ return this.csvWriter; }
       
        private CsvReader csvReader = null;
        public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
       
       
       //------------------------------------------------------------------------
       
        /** ユーザ定義の初期化済フラグ */
        private boolean _usersIntialized = false;
       
        /**
         * ユーザ定義 初期化処理
         */
        private void usersInitialize() throws ExpjException
        {
       
         if(_usersIntialized) return;
       
         // コンボデータの取得
         setComboData(struct);
       
         // 検索状態を「初期状態」に設定
         setReadStatus(INITIAL);
       
         _usersIntialized = true;
         return ;
       
        }
       
       
       //---------- コンボボックスデータ取得関連の処理 -------------------------------
       
        /** 出庫完了フラグ **/
        ComboStruct _TRANSPORT_CMPLT_TYP = null;
       
        /** 出庫完了フラグ設定
         * @param コンボボックスデータ
        */
        public void setTRANSPORT_CMPLT_TYP(ComboStruct combo){ _TRANSPORT_CMPLT_TYP = combo; }
       
        /** 出庫完了フラグ取得
         * @return 出庫完了フラグのコンボボックスデータ
        */
        public ComboStruct getTRANSPORT_CMPLT_TYP(){ return _TRANSPORT_CMPLT_TYP; }
       
       
       //------------------------------------------------------------------------
        /**
         * コンボボックスの中身を取得します。
         *
         * @param data データの箱
         */
         private void setComboData(AF0060010Struct data) throws ExpjException
         {
         // ログ出力情報格納用
         String logMessage = "";
         List listMessage = new ArrayList();
       
         ComboBox controller = new ComboBox(conn, sysUSER_CD);
         try{
          //コンボデータの取得
          ComboStruct w_TRANSPORT_CMPLT_TYP_comb = controller.getData("TRANSPORT_CMPLT_TYP");
       
          controller.setConnection(null);
       
          //属性に取得データ設定
          setTRANSPORT_CMPLT_TYP(w_TRANSPORT_CMPLT_TYP_comb);
       
       
         }catch(SQLException e) {
          setSqlExceptionMsg(e);
       
         }catch(ComboException e){
          ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
          sysLog.severe(emsg, getsysUSER_CD());
          ExpjException ee = new ExpjException(e, emsg);
          throw ee;
         }
        }
       
       
       //---------- メッセージ関連の処理-- --------------------------------------------
       
        /**
         * メッセージ取得 
         * @return メッセージ
         */
        public MessageStruct getMessage()
        {
         return msgStruct;
        }
       
        /**
         * メッセージ設定
         * @param メッセージ
         */
        public void setMessage(MessageStruct msg)
        {
         msgStruct = msg;
        }
       
       
       //-----------------------------------------------------------------------------
       
        /** 日付フォーマット */
        //private SimpleDateFormat _dateFormat = new SimpleDateFormat("yyyy/MM/dd");
       
        /**
         * Date型 ⇒ String型。
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
       
       //-----------------------------------------------------------------------------
       
           /** 画面共通定義取得クラス */
           ScreenParam _scParam = sp;
       
       
       //------------------------------------------------------------------------
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
         * @param メッセージ番号
         * @param 出力メッセージ
         * @param 置換文字列１
         */
        private void setErrorMessage(String messageno, String message, String value1)
        {
         ExpjMessage emsg = new ExpjMessage( messageno , value1 );
         msgStruct.addError( emsg );
         sysLog.warning(emsg, getsysUSER_CD());
        }
        
        /**
	 	* 業務ロジックのエラーメッセージ設定処理を切り出して関数化
	 	* @param code メッセージコード
	 	*/
        private void setErrorMessage(String code)
        {
        	ExpjMessage emsg = new ExpjMessage(code);
        	msgStruct.addError(emsg);
        	sysLog.warning(emsg, sysUSER_CD);
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
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addWarn( emsg );
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
         emsg = new ExpjMessage( "ZZ01006", message );
         msgStruct.addInfo( emsg );
         sysLog.config(emsg, getsysUSER_CD());
        }
         
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
	 * 実際原価管理パラメータの対象年月日取得
	 */
	private BigDecimal getProcExecDate() throws BusinessProcessException, FoundationException {
		BigDecimal bd = null;
		try {
			struct.setPLANT_CD(getsysPLANT_CD());
			List procExecDateList = entity.mSELECT_SYS_ACTUAL_COST_CTRL_AC.read(conn, struct);
			if(procExecDateList == null || procExecDateList.isEmpty()) return null;
			AF0060010Struct procExecDateStruct = (AF0060010Struct) procExecDateList.get(0);
			bd = procExecDateStruct.getPROC_EXEC_DATE();
			struct.setPROC_EXEC_DATE(bd);
		}catch(Exception e) {
			setReadStatus(ERROR);
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			throw new ExpjException(e, emsg);
		}
		return bd;
	}
	
	// 実際原価の締めが完了している日付では入力できません
	private String ProcExecDateError = "AE00160";
	
	/**
	 * 対象年月日と入力年月日の比較
	 * 実際原価の締めが完了している日付での実績の登録を不可とする
	 * 実際原価の締めが完了している日付けの実績情報の修正を不可とする
	 * @param  doType      登録（'1'）また更新（'2'）また削除（'3'）
	 * @param  selOutDate  更新前入力年月日
	 * @param  inputDate 　更新後入力年月日
	 * @return boolean 　  チェック返す値
	 */
	private boolean chkProcExecDate(String doType,String selOutDate,String inputDate) throws BusinessProcessException, FoundationException {
		boolean b = true;
		
		// 実際原価管理パラメータの対象年月日
		BigDecimal ProcExecDate = getProcExecDate();
		if(null == ProcExecDate) return b;
		ProcExecDateError = "AE00160";
		
		// 登録の場合
		if("1".equals(doType)){
			// 画面入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			b = compDecimal(input,ProcExecDate);
			
		}
		// 更新の場合
		if("2".equals(doType)){
			
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 更新後入力年月日
			BigDecimal input = new BigDecimal(inputDate.substring(0,4) + inputDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			if(b == false){
				// 実際原価の締めが完了している日付けの実績情報は修正できません
				ProcExecDateError = "AE00161";
				return b;
			}
			// 入力の日付の比較
			b = compDecimal(input,ProcExecDate);
			
		}
		// 削除の場合
		if("3".equals(doType)){
			// 更新前入力年月日
			BigDecimal selOut = new BigDecimal(selOutDate.substring(0,4) + selOutDate.substring(5,7));
			// 読込んだ実績情報の日付の比較
			b = compDecimal(selOut,ProcExecDate);
			// 実際原価の締めが完了している日付けの実績情報は修正できません
			ProcExecDateError = "AE00161";
			
		}
		
		return b;
	}
	
	/**
	 * 比較
	 * @param  bd1      入力引数1
	 * @param  bd2 　   入力引数2
	 * @return boolean  チェック返す値
	 */
	private boolean compDecimal(BigDecimal bd1,BigDecimal bd2){
		// bd1 >= bd2
		if(bd1.compareTo(bd2) >= 0) {
			return true;
		} else {
			return false;
		}
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
       
       //-----------------------------------------------------------------------------
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlselect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");
			//{{user_implement_dev:<controlselect>
                //-----------------------------------------------------------------------------
                // ログ出力情報格納用
                String logMessage = "";
                List listMessage = new ArrayList();
              
                // 読込成功チェック
                boolean checkSelect = false;		// チェック結果格納
                try {
                 boolean result = true;			// チェック結果格納
              
                 // リストクリア
                 if(list != null){
                  list.clear();
                 }
                 else {
                  list = new ArrayList(0);
                 }
              
                 // 画面項目クリア
                 struct.setRCV_PLANT_NAME("");
                 struct.setRCV_WH_NAME("");
              
                 // キー項目ログ表示
                 logMessage = "T_TRANSPORT_STOCK.RCV_WH_CD:" + struct.getRCV_WH_CD()
                    + ", T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP:" + struct.getTRANSPORT_CMPLT_TYP();
                 setSyslogConfig(logMessage);
              
                 // 入庫保管区情報取得
                 List whList = entity.mselectRCV_WH.read(conn, struct);
                 if(whList.size() <= 0){
                  // 検索状態を「読込０件」に設定
                  setReadStatus(NOT_FOUND);
                  // 読込処理失敗：入庫保管区コードが存在しません
                  logMessage = "M_WH.WH_CD:" + struct.getRCV_WH_CD();
                  setErrorMessage("AF00034", logMessage);
                 }
                 else{
                  // 保管区情報設定
                  AF0060010Struct whStruct = (AF0060010Struct)whList.get(0);
              
                  // 保管区の工場コードチェック
                  if(struct.getw_PLANT_CD().equals(whStruct.getRCV_PLANT_CD()) == false){
                   // 検索状態を「読込０件」に設定
                   setReadStatus(NOT_FOUND);
                   // 読込処理失敗：保管区コードは他の工場のデータなので指定できません
                   listMessage.add("M_WH.WH_CD:" + struct.getRCV_WH_CD());
                   listMessage.add("M_WH.PLANT_CD:" +  whStruct.getRCV_PLANT_CD());
                   setErrorMessage("AF00035", listMessage);
                   listMessage.clear();
                  }
              
                  struct.setRCV_PLANT_CD(whStruct.getRCV_PLANT_CD());
                  struct.setRCV_PLANT_NAME(whStruct.getRCV_PLANT_NAME());
                  struct.setRCV_WH_NAME(whStruct.getRCV_WH_NAME());
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                	 

				// 最大表示行数
				ScreenParam sp = new ScreenParam(this.getClass());
				int maxLine = sp.getMaxLine(conn, 10);
				if (maxLine != 0)
					struct.setROW_COUNT(String.valueOf(maxLine));
				else
					struct.setROW_COUNT(null);

				list = entity.mselectCnt.read(conn, struct);
				long rowCount = Long.parseLong(((AF0060010Struct) list.get(0))
						.getl_COUNT());
                  
                  // 検索結果0件の場合
                  if(rowCount == 0){
                   // 検索状態を「読込０件」に設定
                   setReadStatus(NOT_FOUND);
                   // 読込処理失敗：該当する積送在庫レコードが存在しません
                   listMessage.add("T_TRANSPORT_STOCK.RCV_WH_CD:" + struct.getRCV_WH_CD());
                   listMessage.add("T_TRANSPORT_STOCK.TRANSPORT_CMPLT_TYP:" +  struct.getTRANSPORT_CMPLT_TYP());
                   setErrorMessage("ZZ06001", listMessage);
                   listMessage.clear();
                  if(list !=null &&list.size()>0){
                	  list.clear();
                  }
                   return;
                  } else {
                   // 表示最大行数制限処理
                   if(maxLine != 0 && rowCount ==  maxLine+1){
                    // 検索状態を「最大行数オーバー」に設定
                    setReadStatus(TOO_MANY);
                    if(list !=null &&list.size()>0){
                  	  list.clear();
                    }
                     setErrorMessage("ZZ01115", "", ""+maxLine);
                     return;
                   }
                   else{    
                	   list = entity.mselect.read(conn, struct);
                    checkSelect = true;
                   }
                  }
                 }
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  // 在庫数を検索
                  for(int idx = 0; idx < this.getListsize(); idx++)
                  {
                   // 検索結果を保持するstruct
                   AF0060010Struct qtyStruct = new AF0060010Struct((AF0060010Struct)this.getListvalue(idx));
                   String s_num = new String("0.0");
              
                   if ("false".equals(lotCtrl)) {
                	   qtyStruct.setLOT_NO(null);
                   }
                   // キー項目をセット
                   qtyStruct.setRCV_PLANT_CD(struct.getRCV_PLANT_CD());
                   qtyStruct.setRCV_WH_CD(struct.getRCV_WH_CD());
                   qtyStruct.setw_WH_STOCK_ON_HAND_QTY(s_num);
                   qtyStruct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
              
                   List buffList = null;
                   AF0060010Struct buffStruct = null;
              
                   // 品目在庫から出庫する場合
                   if(qtyStruct.getJOB_ODR_CD() == null || "".equals(qtyStruct.getJOB_ODR_CD()) == true){
                    // 保管区在庫数取得
                    buffList = entity.mselectWH_ITEM_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
                     qtyStruct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
                    }
              
                    // 在庫累計数取得
                    buffList = entity.mselectTOTAL_ITEM_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
              
                     if(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                      "".equals(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                     {
                      qtyStruct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                     }
                    }
                   }
                   // 製番在庫から出庫する場合
                   else{
                    // 保管区在庫数取得
                    buffList = entity.mselectWH_JOB_ODR_CD_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
                     qtyStruct.setw_WH_STOCK_ON_HAND_QTY(buffStruct.getw_WH_STOCK_ON_HAND_QTY());
                    }
              
                    // 在庫累計数取得
                    buffList = entity.mselectTOTAL_JOB_ODR_CD_STOCK.read(conn, qtyStruct);
                    if(buffList.size() > 0)
                    {
                     buffStruct = (AF0060010Struct)buffList.get(0);
              
                     if(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                      "".equals(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                     {
                      qtyStruct.setw_TOTAL_STOCK_ON_HAND_QTY(buffStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                     }
                    }
                   }
                   // 入庫残数を計算 （「完了」の場合は 0 をセット）
                   if(struct.getTRANSPORT_CMPLT_TYP().intValue() == 0){
                    Calculate calc = new Calculate();
                    qtyStruct.setw_LEAVE_RCV_QTY(calc.subtract(qtyStruct.getISSUE_QTY(), qtyStruct.getRCV_QTY()));
                   }else{
                    qtyStruct.setw_LEAVE_RCV_QTY(new String("0.0"));
                   }
              
                   // 検索結果リストに追加
                   list.set(idx, qtyStruct);
                  }
                 }
                 struct.sethid_TRANSPORT_CMPLT_TYP(struct.getTRANSPORT_CMPLT_TYP().toString());
              
                } catch(SQLException e) {
                 // 検索状態を「読込失敗」に設定
                 setReadStatus(ERROR);
              
                 setSqlExceptionMsg(e);
              
                }finally{
                 // モード設定
                 if(checkSelect == true){
                  // 検索状態を「読込成功」に設定
                  setReadStatus(NORMAL);
                 }
                }
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlselect>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlselect");

		return;
	}

	/**
	 * 行修正ボタン押下時に実行される処理です。
	 *
	 */
	public void controlmodify() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");
			//{{user_implement_dev:<controlmodify>
                //-----------------------------------------------------------------------------
                // ログ出力情報格納用
                String logMessage = "";
                List listMessage = new ArrayList();
              
                try {
                 boolean check = true;		// チェック結果格納
     			
                 // 品目情報取得
     			List itemList = entity.mselectM_ITEM.read(conn, struct);
     			// 品目情報設定
     			AF0060010Struct itemStruct = (AF0060010Struct)itemList.get(0);
     			struct.seth_lotFlg(itemStruct.getLOT_CTRL_FLG());
     			if("true".equals(lotCtrl) && "1".equals(struct.geth_lotFlg())){
				    struct.setSTOCK_ON_HAND_QTY((String)"0.0");
				    struct.setDEFECT_QTY((String)"0.0");
				    struct.setALLOCABLE_QTY((String)"0.0");
     			}

                 // キー項目を保持
                 AF0060010Struct keyStruct = new AF0060010Struct(struct);
              
                 // キー項目をセット
                 struct.setRCV_PLANT_CD(keyStruct.getRCV_PLANT_CD());
                 struct.setRCV_PLANT_NAME(keyStruct.getRCV_PLANT_NAME());
                 struct.setRCV_WH_CD(keyStruct.getRCV_WH_CD());
                 struct.setRCV_WH_NAME(keyStruct.getRCV_WH_NAME());
              
                 // キー項目ログ表示
                 logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + struct.getTRANSPORT_SLIP_CD()
                    + ", T_TRANSPORT_STOCK.JOB_ODR_CD:" + struct.getJOB_ODR_CD()
                    + ", T_TRANSPORT_STOCK.ITEM_CD:" + struct.getITEM_CD();
                 setSyslogConfig(logMessage);
              
                 // 在庫数量を再取得する
                 List qtyList = null;
                 AF0060010Struct qtyStruct = null;
              
                 String s_num = new String("0.0");
                 struct.setw_WH_STOCK_ON_HAND_QTY(s_num);
                 struct.setw_TOTAL_STOCK_ON_HAND_QTY(s_num);
              
                 // 品目在庫から出庫する場合
                 if(struct.getJOB_ODR_CD() == null || "".equals(struct.getJOB_ODR_CD()) == true){
                  // 保管区在庫数取得
                  qtyList = entity.mselectWH_ITEM_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
                   struct.setw_WH_STOCK_ON_HAND_QTY(qtyStruct.getw_WH_STOCK_ON_HAND_QTY());
                  }
              
                  // 在庫累計数取得
                  qtyList = entity.mselectTOTAL_ITEM_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
              
                   if(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                    "".equals(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                   {
                    struct.setw_TOTAL_STOCK_ON_HAND_QTY(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                   }
                  }
                 }
                 // 製番在庫から出庫する場合
                 else{
                  // 保管区在庫数取得
                  qtyList = entity.mselectWH_JOB_ODR_CD_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
                   struct.setw_WH_STOCK_ON_HAND_QTY(qtyStruct.getw_WH_STOCK_ON_HAND_QTY());
                  }
              
                  // 在庫累計数取得
                  qtyList = entity.mselectTOTAL_JOB_ODR_CD_STOCK.read(conn, struct);
                  if(qtyList.size() > 0)
                  {
                   qtyStruct = (AF0060010Struct)qtyList.get(0);
              
                   if(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY() != null &&
                    "".equals(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY()) == false)
                   {
                    struct.setw_TOTAL_STOCK_ON_HAND_QTY(qtyStruct.getw_TOTAL_STOCK_ON_HAND_QTY());
                   }
                  }
                 }
     			// ロット別在庫の取得
                if("true".equals(lotCtrl)){
                	if (struct.getLOT_NO() != null
         					&& !"".equals(struct.getLOT_NO())) {
         				List lotList = null;
         				AF0060010Struct lotStruct = new AF0060010Struct();
         				lotList = entity.mT_LOT_STOCK.read(conn, struct);
         				if (lotList.size() > 0) {
         					lotStruct = (AF0060010Struct)lotList.get(0);
         					struct.setSTOCK_ON_HAND_QTY(lotStruct.getSTOCK_ON_HAND_QTY());
         					struct.setDEFECT_QTY(lotStruct.getDEFECT_QTY());
         					struct.setALLOCABLE_QTY(lotStruct.getALLOCABLE_QTY());
         				}
         			}
               }
                 if(struct.getTRANSPORT_CMPLT_TYP().intValue() == 0){
                  // 完了フラグ＝0:未の場合
                  // 入庫残数を規定値に設定
                  struct.setRCV_ISSUE_QTY(struct.getw_LEAVE_RCV_QTY());
              
                  // 業務運用日の取得
                  List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
                  if(dateList.size() <= 0) {
                   // 行修正処理失敗：業務運用日が存在しません
                   logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getRCV_PLANT_CD();
                   setErrorMessage("AF00056", logMessage);
                   check = false;
                  }
                  else{
                   AF0060010Struct dateStruct = (AF0060010Struct)dateList.get(0);
                   struct.setw_BUSINESS_OPR_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
                   struct.setRCV_ISSUE_DATE(dateStruct.getw_BUSINESS_OPR_DATE());
                  }
                 }
                 else{
                  // 完了フラグ＝1:完了の場合
                  // 入庫累計数を規定値に設定
                  struct.setRCV_ISSUE_QTY(struct.getRCV_QTY());
              
                  // 入庫日を規定値に設定
                  struct.setRCV_ISSUE_DATE(struct.getRCV_DATE());
                 }
              
                } catch(SQLException e) {
                 setSqlExceptionMsg(e);
                }
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlmodify>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlmodify");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlclear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");
			//{{user_implement_dev:<controlclear>
                //------------------------------------------------------------------
                // リストクリア
                if(list != null){
                 list.clear();
                }
                else{
                 list = new ArrayList(0);
                }
              
                // 初期化
                struct.initialize();
              
                // 検索状態を「初期状態」に設定
                setReadStatus(INITIAL);
              
                //------------------------------------------------------------------
                //}}user_implement_dev:<controlclear>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlclear");

		return;
	}

	/**
	 * 更新ボタン押下時に実行される処理です。
	 *
	 */
	public void controlinsertSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");
			//{{user_implement_dev:<controlinsertSub1>
                //-----------------------------------------------------------------------------
                // ログ出力情報格納用
                String logMessage = "";
                List listMessage = new ArrayList();
              
                try {
                	// 生産側の過去の実績入力の制限チェック
                	PrivateConfig config = new PrivateConfig(conn);
                	if("false".equals(config.getString("PAST_RESULT_ENTRY_TYP"))){
                		if(chkProcExecDate("1","",struct.getRCV_ISSUE_DATE()) == false){
                			setErrorMessage(ProcExecDateError);
                			setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PLANT_CD", struct.getPLANT_CD());
                			setErrorParameter("SYS_ACTUAL_COST_CTRL_AC", "PROC_EXEC_DATE", struct.getPROC_EXEC_DATE().toString());
                			return;
                		}
                	}
					
                 // 業務運用日取得
                 List dateList = entity.mselectBUSINESS_OPR_DATE.read(conn, struct);
                 AF0060010Struct dateStruct = null;
                 if(dateList.size() <= 0){
                  // 行修正処理失敗：業務運用日が存在しません
                  logMessage = "SYS_DATE_CTRL.PLANT_CD:" + struct.getRCV_PLANT_CD();
                  setErrorMessage("AF00056", logMessage);
                 }
                 else{
                  dateStruct = (AF0060010Struct)dateList.get(0);
              
                  // 入庫日チェック
                  Date issue_Date = stringToDate(struct.getRCV_ISSUE_DATE());
                  Date business_Date = stringToDate(dateStruct.getw_BUSINESS_OPR_DATE());
                  if(issue_Date.after(business_Date)){
                   // 登録処理失敗：入庫日に未来の日付は指定できません
                   logMessage = "SYS_DATE_CTRL.BUSINESS_OPR_DATE:" + dateStruct.getw_BUSINESS_OPR_DATE();
                   setErrorMessage("ZZ05103", logMessage);
                  }
                 }
              
                
                 // 入庫処理
                 // トランザクション開始
                 conn.beginTransWeb();
              
                 // チェックでエラーが発生していない場合
                 if(msgStruct.sizeError() <= 0)
                 {
                  boolean result = true;		// ＤＢ更新結果格納
              
                  AF0060010Struct rcvStruct = new AF0060010Struct(struct);
              
                  // 入出庫管理番号採番
                  String rcvCtrlCd = null;
                  CollectNumber rcvCollect = new CollectNumber(
                          CollectNumber.ISSUE_CD, 
                          getsysUSER_CD(), 
                          this.sp.getProcId(), 
                          rcvStruct.getw_PLANT_CD());
                  rcvCtrlCd = rcvCollect.getNo();
                  if(rcvCtrlCd == null){
                   // 登録処理失敗：入出庫管理番号の採番に失敗しました
                   logMessage = "UserID:" + getsysUSER_CD()
                      + ", ProcID:" + this.sp.getProcId()
                      + ", PLANT_CD:" + struct.getw_PLANT_CD();
                   setErrorMessage("AF00057", logMessage);
              
                   // ロールバック
                   conn.rollback();
              
                   ExpjMessage emsg = new ExpjMessage("AF00057");
                   throw new FoundationException(
                        "AF0060010Control",
                        "controlinsert()",
                        emsg.getMessage(CoreTools.getLocale(this.getsysUSER_CD())) );
                  }
              
                  // ログ出力
                  logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvCtrlCd;
                  setSyslogConfig(logMessage);
              
                  // 入出庫管理番号設定
                  rcvStruct.setw_RCV_ISSUE_CTRL_CD(rcvCtrlCd);
              
                  // 入出庫区分設定
                  rcvStruct.setw_RCV_ISSUE_TYP(new Integer(1));
              
                  // 製番 出庫と入庫の工場コードが異なる場合、NULL
                  if(rcvStruct.getISSUE_PLANT_CD().equals(rcvStruct.getRCV_PLANT_CD()) == false)
                  {
                   rcvStruct.setJOB_ODR_CD((String)null);
                  }
              
                  // 入出庫発生区分
                  rcvStruct.setw_RCV_ISSUE_GNR_TYP(new Integer(13));
              
                  // 入庫数 切り上げ処理
                  boolean resultCeil = false;
                  Calculate calc = new Calculate();
              
                  if(rcvStruct.getw_UNIT_QTY_TYP().intValue() == 1
                   && calc.isNumeric(rcvStruct.getRCV_ISSUE_QTY()) == true ){
                   rcvStruct.setRCV_ISSUE_QTY(calc.ceil(rcvStruct.getRCV_ISSUE_QTY(), 0));
                   resultCeil = true;
                  }
              
                  // 入庫数が残数以上になると 完了フラグを完了にする
                  if(rcvStruct.getTRANSPORT_CMPLT_TYP().intValue() == 0
                   && calc.compare(rcvStruct.getRCV_ISSUE_QTY(), rcvStruct.getw_LEAVE_RCV_QTY()) >= 0)
                  {
                   rcvStruct.seth_TRANSPORT_CMPLT_TYP(new String("1"));
                  }
              
                  // 支給区分
                  rcvStruct.setw_CONS_TYP(new Integer(0));

                  // 会社コード取得
                  List companyList = entity.mselectSYS_MY_COMPANY.read(conn, struct);
                  if(companyList.size() > 0){
                   AF0060010Struct companyStruct = (AF0060010Struct)companyList.get(0);
                   rcvStruct.setw_COMPANY_CD(companyStruct.getw_COMPANY_CD());
                  }
                  //取引先を取得
                  List vendList = entity.mselectM_WH_vendcd.read(conn,rcvStruct);
                  if(vendList.size() > 0){
                	  AF0060010Struct  vendStruct = (AF0060010Struct)vendList.get(0);
                	  rcvStruct.setVEND_CD(vendStruct.getVEND_CD());
                  }
                  //入出庫完了フラグ
                  if("true".equalsIgnoreCase(struct.getc_TRANSPORT_CMPLT_TYP())){
                	  rcvStruct.setRCV_ISSUE_CMPLT_FLG("1");
                  }else{
                	  rcvStruct.setRCV_ISSUE_CMPLT_FLG("0");
                  }
              
                  // 保管区別入出庫登録
                  entity.minsertT_RCV_ISSUE.create(conn, rcvStruct);
              
                  // 入庫処理
                  RcvProcess rcvPrc = new RcvProcess(conn, rcvCtrlCd);
                  if(rcvPrc.execProcess() == true){
                   logMessage = "Receive Process was Complated!";
                   setSyslogConfig(logMessage);
              
                   if(resultCeil == true){
                    // 登録処理失敗：整数管理品目のため小数点以下は切り上げして更新しました
                    logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + struct.getTRANSPORT_SLIP_CD();
                    setInfoMessage("AF60004", logMessage);
                   }
                  } else {
                   logMessage = "Receive Process was Failed...";
                   setSyslogConfig(logMessage);
                   result = false;
                  }
              
                  logMessage = "T_RCV_ISSUE.RCV_ISSUE_CTRL_CD:" + rcvStruct.getw_RCV_ISSUE_CTRL_CD();
                  for(int idx = 0; idx < rcvPrc.getErrorList().size(); idx++){
                   setErrorMessage((String)rcvPrc.getErrorList().get(idx) , logMessage);
                  }
                  for(int idx = 0; idx < rcvPrc.getInfoList().size(); idx++){
                   setInfoMessage((String)rcvPrc.getInfoList().get(idx) , logMessage);
                  }
                  for(int idx = 0; idx < rcvPrc.getWarnList().size(); idx++){
                   setWarnMessage((String)rcvPrc.getWarnList().get(idx) , logMessage);
                  }
              
                  if (result != true) {
                   // ロールバック
                   conn.rollback();
                   return;
                  }
              
                  // [積送在庫]テーブルの更新
                  List modifyList = entity.mselectMODIFY_COUNT.read(conn, rcvStruct);
                  if(modifyList.size() > 0){
                   AF0060010Struct modifyStruct = (AF0060010Struct)modifyList.get(0);
                   if(modifyStruct.getw_MODIFY_COUNT().equals(struct.getw_MODIFY_COUNT()) == false)
                   {
                    // 登録処理失敗：他の処理によりデータが書き換えられています
                    logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + rcvStruct.getTRANSPORT_SLIP_CD();
                    setErrorMessage("ZZ01105", logMessage);
                    result = false;
                   }
                  }
                  else{
                   // 登録処理失敗：更新対象データが存在しない
                   logMessage = "T_TRANSPORT_STOCK.TRANSPORT_SLIP_CD:" + rcvStruct.getTRANSPORT_SLIP_CD();
                   setErrorMessage("ZZ01101", logMessage);
                   result = false;
                  }
              
                  if (result != true) {
                   // ロールバック
                   getMessage().clearWarn();
                   getMessage().clearInfo();
                   conn.rollback();
                   logMessage = "rollback!! ";
                   setSyslogConfig(logMessage);
                  }
                  else{
                   entity.mupdateT_TRANSPORT_STOCK.update(conn, rcvStruct);
              
                   // コミット
                   conn.commit();
                  }

                  // 出庫と入庫の工場コードが異なる場合、[工場間移動実績]の登録を行う
                  if(rcvStruct.getISSUE_PLANT_CD().equals(rcvStruct.getRCV_PLANT_CD()) == false)
                  {

	                AF0060010Struct moveStruct = new AF0060010Struct(struct);

					// [積送在庫]の検索（[工場間移動実績]登録用）
					List detailList1 = entity.mselectT_TRANSPORT_STOCK_update.read(conn, moveStruct);

					AF0060010Struct detailStruct1 = null;

					detailStruct1 = (AF0060010Struct)detailList1.get(0);

					// 出庫管理番号設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_ISSUE_CTRL_CD(detailStruct1.getMOVE_ISSUE_CTRL_CD());

					// 出庫品目番号番号設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_ISSUE_ITEM_CD(detailStruct1.getMOVE_ISSUE_ITEM_CD());

					// 出庫元工場コード設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_ISSUE_PLANT_CD(detailStruct1.getMOVE_ISSUE_PLANT_CD());

					// 出庫元保管区コード設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_ISSUE_WH_CD(detailStruct1.getMOVE_ISSUE_WH_CD());

					// 出庫製番設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_ISSUE_JOB_ODR_CD(detailStruct1.getMOVE_ISSUE_JOB_ODR_CD());

					// 出庫年月日設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_ISSUE_DATE(detailStruct1.getMOVE_ISSUE_DATE());

					// 出庫製番枝番設定（[工場間移動実績]登録用）
					List detailList2 = entity.mselectT_JOB_ODR_CD_STOCK_detail_no.read(conn, moveStruct);
					AF0060010Struct detailStruct2 = null;
					if(detailList2.size() <= 0){
						// 存在しない場合は０を設定
						moveStruct.setMOVE_ISSUE_JOB_ODR_DETAIL_NO("0");
					}else{
						detailStruct2 = (AF0060010Struct)detailList2.get(0);

						// 出庫製番枝番設定（[工場間移動実績]登録用）
						moveStruct.setMOVE_ISSUE_JOB_ODR_DETAIL_NO(detailStruct2.getMOVE_ISSUE_JOB_ODR_DETAIL_NO());
					}

					// 入庫管理番号設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_RCV_CTRL_CD(rcvCtrlCd);

					// 入庫品目番号番号設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_RCV_ITEM_CD(moveStruct.getITEM_CD());

					// 入庫工場コード設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_RCV_PLANT_CD(detailStruct1.getMOVE_RCV_PLANT_CD());

					// 入庫保管区コード設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_RCV_WH_CD(detailStruct1.getMOVE_RCV_WH_CD());

					// 入庫製番設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_RCV_JOB_ODR_CD(rcvStruct.getJOB_ODR_CD());

					// 入庫年月日設定（[工場間移動実績]登録用）
					moveStruct.setMOVE_RCV_DATE(moveStruct.getRCV_ISSUE_DATE());

					// 出庫製番枝番設定（[工場間移動実績]登録用）
					List detailList3 = entity.mselectT_JOB_ODR_CD_STOCK_detail_no2.read(conn, moveStruct);
					AF0060010Struct detailStruct3 = null;
					if(detailList3.size() <= 0){
						// 存在しない場合は０を設定
						moveStruct.setMOVE_RCV_JOB_ODR_DETAIL_NO("0");
					}else{
						detailStruct3 = (AF0060010Struct)detailList3.get(0);

						// 出庫製番枝番設定（[工場間移動実績]登録用）
						moveStruct.setMOVE_RCV_JOB_ODR_DETAIL_NO(detailStruct3.getMOVE_RCV_JOB_ODR_DETAIL_NO());
					}

					// 工場間移動実績登録
					entity.minsertT_PLANTMOVE.create(conn, moveStruct);
                  }

                 }
              
                }catch(ParseException e){
                 // ロールバック
                  conn.rollback();
              
                 // 変換失敗
                 ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
                 sysLog.severe(emsg, getsysUSER_CD());
                 ExpjException ee = new ExpjException(e, emsg);
                 
                 emsg = new ExpjMessage( "ZZ01006", e.toString());
                 sysLog.severe (emsg ,getsysUSER_CD());
                 throw ee;
              
              
                }catch(SQLException e){
                 // ロールバック
                 conn.rollback();
              
                 // エラーメッセージ作成
                 setSqlExceptionMsg(e);
              
                }catch(Exception e){
                 // ロールバック
                 conn.rollback();
              
                 ExpjException ee = new ExpjException(e, "ZZ01106");
                 ExpjMessage emsg = new ExpjMessage( "ZZ01006" , "ProcessId:" + this.sp.getProcId() );
                 ee.add(emsg);
                 throw ee;
                }
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlinsertSub1>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlinsertSub1");

		return;
	}

	/**
	 * 戻るボタン押下時に実行される処理です。
	 *
	 */
	public void controlcloseSub1() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");
			//{{user_implement_dev:<controlcloseSub1>
                //-----------------------------------------------------------------------------
                // 親画面データ再読込
                controlselect();
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlcloseSub1>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlcloseSub1");

		return;
	}

	/**
	 * 選択完了解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCancelCompleteChoice() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelCompleteChoice");
			//{{user_implement_dev:<controlCancelCompleteChoice>
			// TODO: ユーザ定義のコードを記述してください
		try {
			//[積送在庫]に存在しない場合
			List mdfCntList = entity.mselectMODIFY_COUNT.read(conn, struct);
			if (mdfCntList.isEmpty()) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_TRANSPORT_STOCK","TRANSPORT_SLIP_CD",struct.getTRANSPORT_SLIP_CD());
				return;
			}
			AF0060010Struct mdfCntStruct = (AF0060010Struct)mdfCntList.get(0);
			//[積送在庫]."更新数" != ｢更新数｣(hidden使用)の場合
			if (!mdfCntStruct.getw_MODIFY_COUNT().equals(struct.getw_MODIFY_COUNT())) {
				setErrorMessage("ZZ01105");
				setErrorParameter("T_TRANSPORT_STOCK","TRANSPORT_SLIP_CD",struct.getTRANSPORT_SLIP_CD());
				return;
			}
			entity.mupdateTRANSPORT_CMPLT_TYP.update(conn, struct);
			// 画面再表示
			controlselect();

			conn.commit();
		} catch (SQLException e) {
			throw new ExpjException(e);
		} finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlCancelCompleteChoice>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlCancelCompleteChoice");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
                //-----------------------------------------------------------------------------
                // ユーザ定義初期化
                usersInitialize();
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
                //-----------------------------------------------------------------------------
        		try {
        			if(LotCtrl.checkLotCtrl(conn)){
        				lotCtrl = "true";
        			}else{
        				lotCtrl = "false";
        			}
        		} catch (SQLException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
                // クリア処理
                controlclear();
              
                // ユーザ定義初期化
                usersInitialize();
                //-----------------------------------------------------------------------------
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.AF0060");
		logger.entering("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
                 // ダウンロードファイル名クリア
                 // PDF・CSVのダウンロードを行うときは、画面上にOrHiddenで「DOWNLOAD_FILE」を定義し、次の行のコメントを外してください。
              //			struct.setDOWNLOAD_FILE((String)null);
                 // コンボボックス部品のデータのセットはここに記述してください。
                 // コンボボックスデータ用意
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("AF0060010Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("modify") ) {
				controlmodify();
			} else if( button.equals("clear") ) {
				controlclear();
			} else if( button.equals("insertSub1") ) {
				controlinsertSub1();
			} else if( button.equals("closeSub1") ) {
				controlcloseSub1();
			} else if( button.equals("CancelCompleteChoice") ) {
				controlCancelCompleteChoice();
			} else if( button.equals("initial") ) {
				controlINITIAL();
			} else if( button.equals("reload") ) {
				controlRELOAD();
			}
		//{{user_implement_dev:<control_eventHandller>
                //------------------------------------------------------------------
                //コンボボックスに取得データ設定
                struct.setList_TRANSPORT_CMPLT_TYP_val(_TRANSPORT_CMPLT_TYP.getValList());
                struct.setList_TRANSPORT_CMPLT_TYP_name(_TRANSPORT_CMPLT_TYP.getExplanList());
                struct.seth_lotCtrl(lotCtrl);
              //		ソース内にまだAlarmMessageExceptionが残っている場合は、以下の行のコメントを外してAlarmMessageExceptionを始末する。
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
//			throw new FoundationException("AF0060010Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
                //}}user_implement_dev:<createDefaultCSV>
		} catch( FoundationException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0060010-E999","CSVの出力処理"));
			throw new FoundationException("AF0060010Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0060010-E999","システム日付の取得処理"));
				throw new FoundationException("AF0060010Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("AF0060010-E999","コントロールのイベント処理"));
			throw new FoundationException("AF0060010Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected AF0060010Entity entity;
	protected AF0060010Struct struct;
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

		entity = new AF0060010Entity();
		struct = new AF0060010Struct();

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
	 * AF0060010クラスの標準コンストラクタ
	 */
	public AF0060010Control() throws BusinessProcessException, FoundationException
	{
		initialize();

		//conn = connect();
		//{{user_implement_code_constractor
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
				AF0060010Struct key = (AF0060010Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_name") && key.getTRANSPORT_CMPLT_TYP_name() != null) {
					msgKey.setKeyValue("TRANSPORT_CMPLT_TYP_name", key.getTRANSPORT_CMPLT_TYP_name());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_val") && key.getTRANSPORT_CMPLT_TYP_val() != null) {
					msgKey.setKeyValue("TRANSPORT_CMPLT_TYP_val", key.getTRANSPORT_CMPLT_TYP_val().toString());
				}
				if(msgKeyType.containsKeyColumn("w_LEAVE_RCV_QTY") && key.getw_LEAVE_RCV_QTY() != null) {
					msgKey.setKeyValue("w_LEAVE_RCV_QTY", key.getw_LEAVE_RCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("c_TRANSPORT_CMPLT_TYP") && key.getc_TRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("c_TRANSPORT_CMPLT_TYP", key.getc_TRANSPORT_CMPLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_lotCtrl") && key.geth_lotCtrl() != null) {
					msgKey.setKeyValue("h_lotCtrl", key.geth_lotCtrl());
				}
				if(msgKeyType.containsKeyColumn("h_lotFlg") && key.geth_lotFlg() != null) {
					msgKey.setKeyValue("h_lotFlg", key.geth_lotFlg());
				}
				if(msgKeyType.containsKeyColumn("hid_TRANSPORT_CMPLT_TYP") && key.gethid_TRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("hid_TRANSPORT_CMPLT_TYP", key.gethid_TRANSPORT_CMPLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD") && key.getw_RCV_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_CTRL_CD", key.getw_RCV_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP") && key.getw_RCV_ISSUE_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_TYP", key.getw_RCV_ISSUE_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP") && key.getw_RCV_ISSUE_GNR_TYP() != null) {
					msgKey.setKeyValue("w_RCV_ISSUE_GNR_TYP", key.getw_RCV_ISSUE_GNR_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_PLANT_CD") && key.getw_PLANT_CD() != null) {
					msgKey.setKeyValue("w_PLANT_CD", key.getw_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_COMPANY_CD") && key.getw_COMPANY_CD() != null) {
					msgKey.setKeyValue("w_COMPANY_CD", key.getw_COMPANY_CD());
				}
				if(msgKeyType.containsKeyColumn("w_CONS_TYP") && key.getw_CONS_TYP() != null) {
					msgKey.setKeyValue("w_CONS_TYP", key.getw_CONS_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT") && key.getw_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("w_MODIFY_COUNT", key.getw_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP") && key.getw_UNIT_QTY_TYP() != null) {
					msgKey.setKeyValue("w_UNIT_QTY_TYP", key.getw_UNIT_QTY_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE") && key.getw_BUSINESS_OPR_DATE() != null) {
					msgKey.setKeyValue("w_BUSINESS_OPR_DATE", key.getw_BUSINESS_OPR_DATE());
				}
				if(msgKeyType.containsKeyColumn("r_MODIFY_CHOICE") && key.getr_MODIFY_CHOICE() != null) {
					msgKey.setKeyValue("r_MODIFY_CHOICE", key.getr_MODIFY_CHOICE().toString());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD") && key.getTRANSPORT_SLIP_CD() != null) {
					msgKey.setKeyValue("TRANSPORT_SLIP_CD", key.getTRANSPORT_SLIP_CD());
				}
				if(msgKeyType.containsKeyColumn("JOB_ODR_CD") && key.getJOB_ODR_CD() != null) {
					msgKey.setKeyValue("JOB_ODR_CD", key.getJOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_CD") && key.getITEM_CD() != null) {
					msgKey.setKeyValue("ITEM_CD", key.getITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("ITEM_NAME") && key.getITEM_NAME() != null) {
					msgKey.setKeyValue("ITEM_NAME", key.getITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("LOT_NO") && key.getLOT_NO() != null) {
					msgKey.setKeyValue("LOT_NO", key.getLOT_NO());
				}
				if(msgKeyType.containsKeyColumn("STOCK_UNIT") && key.getSTOCK_UNIT() != null) {
					msgKey.setKeyValue("STOCK_UNIT", key.getSTOCK_UNIT());
				}
				if(msgKeyType.containsKeyColumn("VEND_LOT_NO") && key.getVEND_LOT_NO() != null) {
					msgKey.setKeyValue("VEND_LOT_NO", key.getVEND_LOT_NO());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_PLANT_CD") && key.getISSUE_PLANT_CD() != null) {
					msgKey.setKeyValue("ISSUE_PLANT_CD", key.getISSUE_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_PLANT_NAME") && key.getISSUE_PLANT_NAME() != null) {
					msgKey.setKeyValue("ISSUE_PLANT_NAME", key.getISSUE_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_WH_CD") && key.getISSUE_WH_CD() != null) {
					msgKey.setKeyValue("ISSUE_WH_CD", key.getISSUE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_WH_NAME") && key.getISSUE_WH_NAME() != null) {
					msgKey.setKeyValue("ISSUE_WH_NAME", key.getISSUE_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_DATE") && key.getISSUE_DATE() != null) {
					msgKey.setKeyValue("ISSUE_DATE", key.getISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_QTY") && key.getISSUE_QTY() != null) {
					msgKey.setKeyValue("ISSUE_QTY", key.getISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("VEND_CD") && key.getVEND_CD() != null) {
					msgKey.setKeyValue("VEND_CD", key.getVEND_CD());
				}
				if(msgKeyType.containsKeyColumn("VEND_ANAME") && key.getVEND_ANAME() != null) {
					msgKey.setKeyValue("VEND_ANAME", key.getVEND_ANAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_DATE") && key.getRCV_DATE() != null) {
					msgKey.setKeyValue("RCV_DATE", key.getRCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_QTY") && key.getRCV_QTY() != null) {
					msgKey.setKeyValue("RCV_QTY", key.getRCV_QTY());
				}
				if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP") && key.getTRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("TRANSPORT_CMPLT_TYP", key.getTRANSPORT_CMPLT_TYP().toString());
				}
				if(msgKeyType.containsKeyColumn("DRAW_CD") && key.getDRAW_CD() != null) {
					msgKey.setKeyValue("DRAW_CD", key.getDRAW_CD());
				}
				if(msgKeyType.containsKeyColumn("SPEC") && key.getSPEC() != null) {
					msgKey.setKeyValue("SPEC", key.getSPEC());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT") && key.getRCV_ISSUE_COMMENT() != null) {
					msgKey.setKeyValue("RCV_ISSUE_COMMENT", key.getRCV_ISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("ISSUE_COMMENT") && key.getISSUE_COMMENT() != null) {
					msgKey.setKeyValue("ISSUE_COMMENT", key.getISSUE_COMMENT());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_CD") && key.getRCV_WH_CD() != null) {
					msgKey.setKeyValue("RCV_WH_CD", key.getRCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY") && key.getRCV_ISSUE_QTY() != null) {
					msgKey.setKeyValue("RCV_ISSUE_QTY", key.getRCV_ISSUE_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE") && key.getRCV_ISSUE_DATE() != null) {
					msgKey.setKeyValue("RCV_ISSUE_DATE", key.getRCV_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG") && key.getRCV_ISSUE_CMPLT_FLG() != null) {
					msgKey.setKeyValue("RCV_ISSUE_CMPLT_FLG", key.getRCV_ISSUE_CMPLT_FLG());
				}
				if(msgKeyType.containsKeyColumn("h_TRANSPORT_CMPLT_TYP") && key.geth_TRANSPORT_CMPLT_TYP() != null) {
					msgKey.setKeyValue("h_TRANSPORT_CMPLT_TYP", key.geth_TRANSPORT_CMPLT_TYP());
				}
				if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY") && key.getw_WH_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_WH_STOCK_ON_HAND_QTY", key.getw_WH_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_PLANT_CD") && key.getRCV_PLANT_CD() != null) {
					msgKey.setKeyValue("RCV_PLANT_CD", key.getRCV_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY") && key.getw_TOTAL_STOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("w_TOTAL_STOCK_ON_HAND_QTY", key.getw_TOTAL_STOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("RCV_PLANT_NAME") && key.getRCV_PLANT_NAME() != null) {
					msgKey.setKeyValue("RCV_PLANT_NAME", key.getRCV_PLANT_NAME());
				}
				if(msgKeyType.containsKeyColumn("RCV_WH_NAME") && key.getRCV_WH_NAME() != null) {
					msgKey.setKeyValue("RCV_WH_NAME", key.getRCV_WH_NAME());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_WH_CD") && key.getMOVE_ISSUE_WH_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_WH_CD", key.getMOVE_ISSUE_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_DETAIL_NO") && key.getMOVE_ISSUE_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_JOB_ODR_DETAIL_NO", key.getMOVE_ISSUE_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_CD") && key.getMOVE_ISSUE_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_JOB_ODR_CD", key.getMOVE_ISSUE_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_ITEM_CD") && key.getMOVE_ISSUE_ITEM_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_ITEM_CD", key.getMOVE_ISSUE_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_PLANT_CD") && key.getMOVE_ISSUE_PLANT_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_PLANT_CD", key.getMOVE_ISSUE_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_CD") && key.getMOVE_RCV_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_JOB_ODR_CD", key.getMOVE_RCV_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_DETAIL_NO") && key.getMOVE_RCV_JOB_ODR_DETAIL_NO() != null) {
					msgKey.setKeyValue("MOVE_RCV_JOB_ODR_DETAIL_NO", key.getMOVE_RCV_JOB_ODR_DETAIL_NO());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_ITEM_CD") && key.getMOVE_RCV_ITEM_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_ITEM_CD", key.getMOVE_RCV_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_WH_CD") && key.getMOVE_RCV_WH_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_WH_CD", key.getMOVE_RCV_WH_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_PLANT_CD") && key.getMOVE_RCV_PLANT_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_PLANT_CD", key.getMOVE_RCV_PLANT_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_CTRL_CD") && key.getMOVE_ISSUE_CTRL_CD() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_CTRL_CD", key.getMOVE_ISSUE_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_ISSUE_DATE") && key.getMOVE_ISSUE_DATE() != null) {
					msgKey.setKeyValue("MOVE_ISSUE_DATE", key.getMOVE_ISSUE_DATE());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_CTRL_CD") && key.getMOVE_RCV_CTRL_CD() != null) {
					msgKey.setKeyValue("MOVE_RCV_CTRL_CD", key.getMOVE_RCV_CTRL_CD());
				}
				if(msgKeyType.containsKeyColumn("MOVE_RCV_DATE") && key.getMOVE_RCV_DATE() != null) {
					msgKey.setKeyValue("MOVE_RCV_DATE", key.getMOVE_RCV_DATE());
				}
				if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY") && key.getSTOCK_ON_HAND_QTY() != null) {
					msgKey.setKeyValue("STOCK_ON_HAND_QTY", key.getSTOCK_ON_HAND_QTY());
				}
				if(msgKeyType.containsKeyColumn("DEFECT_QTY") && key.getDEFECT_QTY() != null) {
					msgKey.setKeyValue("DEFECT_QTY", key.getDEFECT_QTY());
				}
				if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY") && key.getALLOCABLE_QTY() != null) {
					msgKey.setKeyValue("ALLOCABLE_QTY", key.getALLOCABLE_QTY());
				}
				if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG") && key.getLOT_CTRL_FLG() != null) {
					msgKey.setKeyValue("LOT_CTRL_FLG", key.getLOT_CTRL_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("PLANT_CD") && key.getPLANT_CD() != null) {
					msgKey.setKeyValue("PLANT_CD", key.getPLANT_CD());
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
					AF0060010Struct key = new AF0060010Struct();
					if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_name")) {
						key.setTRANSPORT_CMPLT_TYP_name(msgKey.getKeyValue("TRANSPORT_CMPLT_TYP_name"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP_val")) {
						key.setTRANSPORT_CMPLT_TYP_val(new Integer(msgKey.getKeyValue("TRANSPORT_CMPLT_TYP_val")));
					}
					if(msgKeyType.containsKeyColumn("w_LEAVE_RCV_QTY")) {
						key.setw_LEAVE_RCV_QTY(msgKey.getKeyValue("w_LEAVE_RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("c_TRANSPORT_CMPLT_TYP")) {
						key.setc_TRANSPORT_CMPLT_TYP(msgKey.getKeyValue("c_TRANSPORT_CMPLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_lotCtrl")) {
						key.seth_lotCtrl(msgKey.getKeyValue("h_lotCtrl"));
					}
					if(msgKeyType.containsKeyColumn("h_lotFlg")) {
						key.seth_lotFlg(msgKey.getKeyValue("h_lotFlg"));
					}
					if(msgKeyType.containsKeyColumn("hid_TRANSPORT_CMPLT_TYP")) {
						key.sethid_TRANSPORT_CMPLT_TYP(msgKey.getKeyValue("hid_TRANSPORT_CMPLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_CTRL_CD")) {
						key.setw_RCV_ISSUE_CTRL_CD(msgKey.getKeyValue("w_RCV_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_TYP")) {
						key.setw_RCV_ISSUE_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_RCV_ISSUE_GNR_TYP")) {
						key.setw_RCV_ISSUE_GNR_TYP(new Integer(msgKey.getKeyValue("w_RCV_ISSUE_GNR_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_PLANT_CD")) {
						key.setw_PLANT_CD(msgKey.getKeyValue("w_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_COMPANY_CD")) {
						key.setw_COMPANY_CD(msgKey.getKeyValue("w_COMPANY_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_CONS_TYP")) {
						key.setw_CONS_TYP(new Integer(msgKey.getKeyValue("w_CONS_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_MODIFY_COUNT")) {
						key.setw_MODIFY_COUNT(msgKey.getKeyValue("w_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("w_UNIT_QTY_TYP")) {
						key.setw_UNIT_QTY_TYP(new Integer(msgKey.getKeyValue("w_UNIT_QTY_TYP")));
					}
					if(msgKeyType.containsKeyColumn("w_BUSINESS_OPR_DATE")) {
						key.setw_BUSINESS_OPR_DATE(msgKey.getKeyValue("w_BUSINESS_OPR_DATE"));
					}
					if(msgKeyType.containsKeyColumn("r_MODIFY_CHOICE")) {
						key.setr_MODIFY_CHOICE(new Integer(msgKey.getKeyValue("r_MODIFY_CHOICE")));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_SLIP_CD")) {
						key.setTRANSPORT_SLIP_CD(msgKey.getKeyValue("TRANSPORT_SLIP_CD"));
					}
					if(msgKeyType.containsKeyColumn("JOB_ODR_CD")) {
						key.setJOB_ODR_CD(msgKey.getKeyValue("JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_CD")) {
						key.setITEM_CD(msgKey.getKeyValue("ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("ITEM_NAME")) {
						key.setITEM_NAME(msgKey.getKeyValue("ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("LOT_NO")) {
						key.setLOT_NO(msgKey.getKeyValue("LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_UNIT")) {
						key.setSTOCK_UNIT(msgKey.getKeyValue("STOCK_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("VEND_LOT_NO")) {
						key.setVEND_LOT_NO(msgKey.getKeyValue("VEND_LOT_NO"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_PLANT_CD")) {
						key.setISSUE_PLANT_CD(msgKey.getKeyValue("ISSUE_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_PLANT_NAME")) {
						key.setISSUE_PLANT_NAME(msgKey.getKeyValue("ISSUE_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_WH_CD")) {
						key.setISSUE_WH_CD(msgKey.getKeyValue("ISSUE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_WH_NAME")) {
						key.setISSUE_WH_NAME(msgKey.getKeyValue("ISSUE_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_DATE")) {
						key.setISSUE_DATE(msgKey.getKeyValue("ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_QTY")) {
						key.setISSUE_QTY(msgKey.getKeyValue("ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("VEND_CD")) {
						key.setVEND_CD(msgKey.getKeyValue("VEND_CD"));
					}
					if(msgKeyType.containsKeyColumn("VEND_ANAME")) {
						key.setVEND_ANAME(msgKey.getKeyValue("VEND_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_DATE")) {
						key.setRCV_DATE(msgKey.getKeyValue("RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_QTY")) {
						key.setRCV_QTY(msgKey.getKeyValue("RCV_QTY"));
					}
					if(msgKeyType.containsKeyColumn("TRANSPORT_CMPLT_TYP")) {
						key.setTRANSPORT_CMPLT_TYP(new Integer(msgKey.getKeyValue("TRANSPORT_CMPLT_TYP")));
					}
					if(msgKeyType.containsKeyColumn("DRAW_CD")) {
						key.setDRAW_CD(msgKey.getKeyValue("DRAW_CD"));
					}
					if(msgKeyType.containsKeyColumn("SPEC")) {
						key.setSPEC(msgKey.getKeyValue("SPEC"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_COMMENT")) {
						key.setRCV_ISSUE_COMMENT(msgKey.getKeyValue("RCV_ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("ISSUE_COMMENT")) {
						key.setISSUE_COMMENT(msgKey.getKeyValue("ISSUE_COMMENT"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_CD")) {
						key.setRCV_WH_CD(msgKey.getKeyValue("RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_QTY")) {
						key.setRCV_ISSUE_QTY(msgKey.getKeyValue("RCV_ISSUE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_DATE")) {
						key.setRCV_ISSUE_DATE(msgKey.getKeyValue("RCV_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("RCV_ISSUE_CMPLT_FLG")) {
						key.setRCV_ISSUE_CMPLT_FLG(msgKey.getKeyValue("RCV_ISSUE_CMPLT_FLG"));
					}
					if(msgKeyType.containsKeyColumn("h_TRANSPORT_CMPLT_TYP")) {
						key.seth_TRANSPORT_CMPLT_TYP(msgKey.getKeyValue("h_TRANSPORT_CMPLT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("w_WH_STOCK_ON_HAND_QTY")) {
						key.setw_WH_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_WH_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_PLANT_CD")) {
						key.setRCV_PLANT_CD(msgKey.getKeyValue("RCV_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("w_TOTAL_STOCK_ON_HAND_QTY")) {
						key.setw_TOTAL_STOCK_ON_HAND_QTY(msgKey.getKeyValue("w_TOTAL_STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("RCV_PLANT_NAME")) {
						key.setRCV_PLANT_NAME(msgKey.getKeyValue("RCV_PLANT_NAME"));
					}
					if(msgKeyType.containsKeyColumn("RCV_WH_NAME")) {
						key.setRCV_WH_NAME(msgKey.getKeyValue("RCV_WH_NAME"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_WH_CD")) {
						key.setMOVE_ISSUE_WH_CD(msgKey.getKeyValue("MOVE_ISSUE_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_DETAIL_NO")) {
						key.setMOVE_ISSUE_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("MOVE_ISSUE_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_JOB_ODR_CD")) {
						key.setMOVE_ISSUE_JOB_ODR_CD(msgKey.getKeyValue("MOVE_ISSUE_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_ITEM_CD")) {
						key.setMOVE_ISSUE_ITEM_CD(msgKey.getKeyValue("MOVE_ISSUE_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_PLANT_CD")) {
						key.setMOVE_ISSUE_PLANT_CD(msgKey.getKeyValue("MOVE_ISSUE_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_CD")) {
						key.setMOVE_RCV_JOB_ODR_CD(msgKey.getKeyValue("MOVE_RCV_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_JOB_ODR_DETAIL_NO")) {
						key.setMOVE_RCV_JOB_ODR_DETAIL_NO(msgKey.getKeyValue("MOVE_RCV_JOB_ODR_DETAIL_NO"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_ITEM_CD")) {
						key.setMOVE_RCV_ITEM_CD(msgKey.getKeyValue("MOVE_RCV_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_WH_CD")) {
						key.setMOVE_RCV_WH_CD(msgKey.getKeyValue("MOVE_RCV_WH_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_PLANT_CD")) {
						key.setMOVE_RCV_PLANT_CD(msgKey.getKeyValue("MOVE_RCV_PLANT_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_CTRL_CD")) {
						key.setMOVE_ISSUE_CTRL_CD(msgKey.getKeyValue("MOVE_ISSUE_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_ISSUE_DATE")) {
						key.setMOVE_ISSUE_DATE(msgKey.getKeyValue("MOVE_ISSUE_DATE"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_CTRL_CD")) {
						key.setMOVE_RCV_CTRL_CD(msgKey.getKeyValue("MOVE_RCV_CTRL_CD"));
					}
					if(msgKeyType.containsKeyColumn("MOVE_RCV_DATE")) {
						key.setMOVE_RCV_DATE(msgKey.getKeyValue("MOVE_RCV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("STOCK_ON_HAND_QTY")) {
						key.setSTOCK_ON_HAND_QTY(msgKey.getKeyValue("STOCK_ON_HAND_QTY"));
					}
					if(msgKeyType.containsKeyColumn("DEFECT_QTY")) {
						key.setDEFECT_QTY(msgKey.getKeyValue("DEFECT_QTY"));
					}
					if(msgKeyType.containsKeyColumn("ALLOCABLE_QTY")) {
						key.setALLOCABLE_QTY(msgKey.getKeyValue("ALLOCABLE_QTY"));
					}
					if(msgKeyType.containsKeyColumn("LOT_CTRL_FLG")) {
						key.setLOT_CTRL_FLG(msgKey.getKeyValue("LOT_CTRL_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("PLANT_CD")) {
						key.setPLANT_CD(msgKey.getKeyValue("PLANT_CD"));
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
