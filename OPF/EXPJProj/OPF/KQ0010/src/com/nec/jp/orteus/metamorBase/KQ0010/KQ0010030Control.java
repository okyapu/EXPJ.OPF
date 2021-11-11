/*
 * $Source: D:/EXPJCVS/EXPJPROJ/expjprsaUV2/EXPJProj/OPF/KQ0010/src/com/nec/jp/orteus/metamorBase/KQ0010/KQ0010030Control.java,v $
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

package com.nec.jp.orteus.metamorBase.KQ0010;

import com.nec.jp.orteus.metamorBase.KQ0010.*;
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
import com.nec.jp.orteus.expj.tranappr.TranAppr;
//Add Anken Start   20140411 hui-x
import com.nec.jp.orteus.metamorBase.KM0030.KM0030010Struct;
import com.nec.jp.orteus.metamorBase.KM0030.KM0030010Control;
//Add Anken End   20140411 hui-x
//Add Nec Start 20140616
import com.nec.jp.orteus.metamorBase.KQ0090.KQ0090010Struct;
import com.nec.jp.orteus.metamorBase.KQ0090.KQ0090010Control;
//Add Nec End 20140616
//}}user_implement_code_import

//{{user_implement_code_header
/**
 * CLASS     : KQ0010030Control クラス
 * ファイル・クラス説明
 * @author $Author: geng-jia $
 * @version $Revision: 1.17 $ $Date: 2015/12/03 08:12:27 $
 *
 */
//}}user_implement_code_header

public class KQ0010030Control
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
	public KQ0010030Struct getListvalue(int x) { return (KQ0010030Struct)(this.list.get(x)); }	// リストの値を返します。
	public KQ0010030Struct getStruct() { return this.struct; }	// Structの値を返します。
	public KQ0010030Struct createStruct() { return new KQ0010030Struct(); }	// 新しいStructを作って返します。
	public void setStruct(Object structname) { this.struct.setStruct((KQ0010030Struct)structname); }	// Structをセットします。
	public void initializeStruct() { this.struct.initialize(); }	// Structの値を初期化します。

	// CSV出力用リスト
	private CsvWriter csvWriter = null;
	public CsvWriter getCsvWriter(){ return this.csvWriter; }

	private CsvReader csvReader = null;
	public void setCsvReader(CsvReader cr){ this.csvReader = cr; }
	
	private PrivateConfig privateConfig;

	/** 処理区分*/
	private ComboStruct _PROC_TYP = new ComboStruct();
	/** 承認状態　*/
	private ComboStruct _APPR_STATUS_TYP = new ComboStruct();
	/** 注文区分*/
	private ComboStruct _ODR_ODR_TYP = new ComboStruct();
	/** 特値区分 */
	private ComboStruct _ODR_SPCL_PRICE = new ComboStruct();
	/** 預託倉庫区分 */
	private ComboStruct _ODR_DEPO_TYP = new ComboStruct();
	/** 変更有無記号 */
	private String changed = "●";
	
	// 依頼者承認者同一許可
	private String _REQUEST_APPR_SAME = null;
	
	public String get_REQUEST_APPR_SAME() {
		return _REQUEST_APPR_SAME;
	}
	public void set_REQUEST_APPR_SAME(String _request_appr_same) {
		_REQUEST_APPR_SAME = _request_appr_same;
	}
	/**
    * 区分名取得
    * @param comboStruct 区分情報リスト
    * @param strTyp 区分コード
    * @return 区分名称。該当するデータがなかった場合は区分コードを返す
    */
   private String getTypeName(ComboStruct comboStruct, String strTyp)
   {
    String strTypName = strTyp;
    for(int i = 0; i < comboStruct.getValList().size(); i++){
     if(strTyp.equals((String)(comboStruct.getValList().get(i)))){
      strTypName = (String)(comboStruct.getExplanList().get(i));
      break;
     }
    }
    return strTypName;
   }
   
	/**
     * 画面エラーメッセージ設定
     * @param メッセージ番号
     */
    private void setErrorMessage(String code){
     ExpjMessage emsg = new ExpjMessage(code);
     msgStruct.addError( emsg );	// エラーメッセージとして登録
     sysLog.warning(emsg, getsysUSER_CD()); //エラー内容
    }

    /**
     * 情報メッセージ設定
     * @param メッセージ番号
     * @param 置換文字列１
     */
    private void setErrorMessage(String messageno, String value1)
    {
     ExpjMessage emsg = new ExpjMessage( messageno , value1 );
     msgStruct.addError( emsg );
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
	 * 依頼者承認者同一許可チェック
	 * @retrun パラメータ「依頼者承認者同一許可」は0の場合、依頼依頼者と承認者が同一　false
	 */
	private boolean check(){
		if("0".equals(struct.geth_REQUEST_APPR_SAME())){
			for(int i = 0;i<struct.getList_l_REQUEST_BY().size();i++){
				if(getsysUSER_CD().equals(struct.getList_l_REQUEST_BY().get(i))){
					setErrorMessage("KA00128");
					return false;
				}
			}
		}
		return true;
	}
	/**
	 * 依頼情報を検索
	 * @throws SQLException 
	 * @throws FoundationException 
	 */
	private void selectApprInfo() throws FoundationException, SQLException{
	
		// トラン承認依頼情報検索結果用の臨時リスト
		List tempAppList = null;
		
		// トラン画面データ情報検索結果用の臨時リスト
		List tempSrcList = null;
		
		// トラン承認依頼情報を検索
		if("1".equals(struct.geth_SELECT_TYP())){
			tempAppList = entity.mselectModel1.read(conn,struct);
		}else if("2".equals(struct.geth_SELECT_TYP())){
			tempAppList = entity.mselectModel2.read(conn,struct);
		}else{
			tempAppList = entity.mselectModel3.read(conn,struct);
		}
		
		// トラン画面データ情報をセット
		if(tempAppList.size()>0){
			for(int i= 0;i<tempAppList.size();i++){
				KQ0010030Struct tempAppStruct= new KQ0010030Struct();
				tempAppStruct = (KQ0010030Struct) tempAppList.get(i);
				// 検索
				tempSrcList = entity.mselectT_TRAN_SRC.read(conn, tempAppStruct);
				if(tempSrcList.size()>0){
					KQ0010010Struct kq0010010struct = new KQ0010010Struct();
					KQ0010020Struct kq0010020struct = new KQ0010020Struct();
					//Add Anken Start 20140319 hui-x
					KM0030010Struct km0030010Strut = new KM0030010Struct();
					//Add Anken End   20140319 hui-x
					//Add Nec Start 20140616
					KQ0090010Struct kq0090010Struct = new KQ0090010Struct();
					//Add Nec End   20140616
					for(int j=0 ;j<tempSrcList.size();j++){
						// 画面の項目をセット
						if(!((KQ0010030Struct)tempSrcList.get(j)).getFIELD_FLG().equals("2")){
							//Mod Anken Start 20140319 hui-x
//							if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
//                                 //　受注登録データ
//								settoStruct(kq0010010struct,(KQ0010030Struct)tempSrcList.get(j));	
//    						}else{
// 								// 受注情報修正データ
//    							settoStruct(kq0010020struct,(KQ0010030Struct)tempSrcList.get(j));	
//							}
							if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
		                          //　案件でない受注の場合、受注登録データ
									settoStruct(kq0010010struct,(KQ0010030Struct)tempSrcList.get(j));	
								}else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010020Servlet")){
									// 案件でない受注の場合、受注情報修正データ
									settoStruct(kq0010020struct,(KQ0010030Struct)tempSrcList.get(j));	
								}else if(tempAppStruct.geth_SCREEN_URL().equals("KM0030010Servlet")){
									settoStruct(km0030010Strut,(KQ0010030Struct)tempSrcList.get(j));
								}
							//Mod Anken End   20140319 hui-x
							//Add Nec Start 20140616
								else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0090010Servlet")){
									settoStruct(kq0090010Struct,(KQ0010030Struct)tempSrcList.get(j));
								}
							//Add Nec End   20140616
						}
					}
					//Mod Anken Start 20140319 hui-x
//                    if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
//                    	// 受注登録データをセット
//						copyToAppStruct(tempAppStruct,kq0010010struct);
//					}else{
//						// 受注情報修正データをセット
//						copyToAppStruct(tempAppStruct,kq0010020struct);
//					}
					if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010010Servlet")){
						// 案件でない受注の場合、受注登録データをセット
						copyToAppStruct(tempAppStruct,kq0010010struct);
					}else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0010020Servlet")) {
						// 案件でない受注の場合、受注情報修正データをセット
						copyToAppStruct(tempAppStruct,kq0010020struct);
					}else if(tempAppStruct.geth_SCREEN_URL().equals("KM0030010Servlet")) {
						//案件の受注の場合、案件受注登録データ
						copyToAppStruct(tempAppStruct,km0030010Strut);
					}
					//Mod Anken End   20140319 hui-x
					//Add Nec Start 20140616
					else if(tempAppStruct.geth_SCREEN_URL().equals("KQ0090010Servlet")) {
						//非在庫品受注の場合、非在庫品受注登録データ
						copyToAppStruct(tempAppStruct,kq0090010Struct);
					}
					//Add Nec End   20140616
				}
				// 処理区分
				tempAppStruct.setl_PROC_TYP_VALUE(getTypeName(_PROC_TYP,tempAppStruct.geth_PROC_TYP()));
				// 承認状態
				tempAppStruct.setl_STATUS_NAME(getTypeName(_APPR_STATUS_TYP,tempAppStruct.geth_STATUS()));
				// 注文区分
				tempAppStruct.setl_ODR_TYP_DN(getTypeName(_ODR_ODR_TYP,tempAppStruct.getl_ODR_TYP()));
				// 特値区分 
				tempAppStruct.setl_SPCL_PRICE_TYP_DN(getTypeName(_ODR_SPCL_PRICE,tempAppStruct.getl_SPCL_PRICE_TYP()));
				// 預託倉庫区分
				if(tempAppStruct.getl_DEPO_TYP() != null)
				tempAppStruct.setl_DEPO_TYP_DN(getTypeName(_ODR_DEPO_TYP,tempAppStruct.getl_DEPO_TYP()));
				
				// リストに追加
				list.add(tempAppStruct);
				
			}
		}
	}
	
	/**
	 * 承認依頼情報から、受注登録と受注情報修正の対象をセット
	 * @param object
	 * @param tempSrcStruct
	 */
	private void settoStruct(Object object,KQ0010030Struct tempSrcStruct){
		String methodName = null;
		methodName = "set"+tempSrcStruct.getFIELD_NAME();
		Class detailStructClass = object.getClass();
		Class partypes[] = new Class[1];
		partypes[0] = String.class;
		Method detailStructMethod;
		try {
			detailStructMethod = detailStructClass.getMethod(methodName,partypes);
			Object arglist[] = new Object[1];
			arglist[0] = tempSrcStruct.getFIELD_VALUE();
			detailStructMethod.invoke(object, arglist);
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
	}
	/**
	 * KQ0010010Structの属性により、KQ0010030Structの属性をセット
	 * @param appstruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KQ0010010Struct tempStruct){
		appStruct.setl_ODR_TYP(tempStruct.getl_ODR_TYP());                                          // 注文区分
		appStruct.setl_CUST_ODR_NO(tempStruct.getl_CUST_ODR_NO());                                  // 得意先注文番号
		appStruct.setl_CUST_ITEM_CD(tempStruct.getl_CUST_ITEM_CD());                                // 得意先品目番号
		appStruct.setl_ITEM_CD(tempStruct.getl_ITEM_CD());                                          // 品目番号
		appStruct.setl_CUST_CD(tempStruct.getl_CUST_CD());                                          // 得意先コード
		appStruct.setl_CUST_ANAME(tempStruct.getl_CUST_ANAME());                                    // 得意先名
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getl_DESINATED_DLV_DATE());                    // 指定納期
		appStruct.setl_ODR_QTY(tempStruct.getl_ODR_QTY());                                          // 受注数量
		appStruct.setl_UNIT_CD(tempStruct.getl_UNIT_CD());                                          // 単位
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getl_ODR_UNIT_PRICE());                            // 単価
		appStruct.setl_CUR_UNIT(tempStruct.getl_CUR_UNIT());                                        // 通貨単位
		appStruct.setl_SPCL_PRICE_TYP(tempStruct.getl_SPCL_PRICE_TYP());                            // 特値区分
		appStruct.setl_DLV_LOC_CD(tempStruct.getl_DLV_LOC_CD());                                    // 納品場所コード
		appStruct.setl_DLV_LOC_NAME(tempStruct.getl_DLV_LOC_NAME());                                // 納品場所名
		appStruct.setl_DEPO_TYP(tempStruct.getl_DEPO_TYP());                                        // 預託倉庫区分
		appStruct.setl_CUST_ITEM_NAME(tempStruct.getl_CUST_ITEM_NAME());                            // 得意先品目名
		appStruct.setl_ITEM_NAME(tempStruct.getl_ITEM_NAME());                                      // 品目名
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getl_ODR_ACPT_DATE());                              // 受注日
		appStruct.setl_JOB_ODR_CD(tempStruct.getl_JOB_ODR_CD());                                    // 製番
		appStruct.setl_JOB_ODR_QTY(tempStruct.getl_JOB_ODR_QTY());                                  // 手配数量
		appStruct.setl_JOB_ODR_DLV_DATE(tempStruct.getl_JOB_ODR_DLV_DATE());                        // 製番納期
		appStruct.setl_ALC_GRP_CD(tempStruct.getl_ALC_GRP_CD());                                    // 引当グループコード
		appStruct.setl_REMARKS(tempStruct.getl_REMARKS());                                          // 備考
		appStruct.seth_ODR_NO(tempStruct.getl_ODR_NO());                                            // 受注番号
	}
	/**
	 * KQ0010020Structの属性により、KQ0010030Structの属性をセット
	 * @param appStruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KQ0010020Struct tempStruct){
		appStruct.setl_ODR_TYP(tempStruct.getODR_TYP());                                          // 注文区分
		appStruct.setl_CUST_ODR_NO(tempStruct.getCUST_ODR_NO());                                  // 得意先注文番号
		appStruct.setl_CUST_ITEM_CD(tempStruct.getCUST_ITEM_CD());                                // 得意先品目番号
		appStruct.setl_ITEM_CD(tempStruct.getITEM_CD());                                          // 品目番号
		appStruct.setl_CUST_CD(tempStruct.getCUST_CD());                                          // 得意先コード
		appStruct.setl_CUST_ANAME(tempStruct.getCUST_ANAME());                                    // 得意先名
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getDESINATED_DLV_DATE());                    // 指定納期
		appStruct.setl_ODR_QTY(tempStruct.getODR_QTY());                                          // 受注数量
		appStruct.setl_UNIT_CD(tempStruct.getUNIT_CD());                                          // 単位
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getODR_UNIT_PRICE());                            // 単価
		appStruct.setl_CUR_UNIT(tempStruct.getUNIT_NAME());                                       // 通貨単位
		appStruct.setl_SPCL_PRICE_TYP(tempStruct.getSPCL_PRICE_TYP());                            // 特値区分
		appStruct.setl_DLV_LOC_CD(tempStruct.getDLV_LOC_CD());                                    // 納品場所コード
		appStruct.setl_DLV_LOC_NAME(tempStruct.getDLV_LOC_NAME_KANJI());                          // 納品場所名
		appStruct.setl_DEPO_TYP(tempStruct.getDEPO_TYP());                                        // 預託倉庫区分
		appStruct.setl_CUST_ITEM_NAME(tempStruct.getCUST_ITEM_NAME());                            // 得意先品目名
		appStruct.setl_ITEM_NAME(tempStruct.getITEM_NAME());                                      // 品目名
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getODR_ACPT_DATE());                              // 受注日
		appStruct.setl_REMARKS(tempStruct.getREMARKS());                                          // 備考
		appStruct.seth_ODR_NO(tempStruct.getIN_ODR_NO());                                         // 受注番号
		appStruct.setl_CUS_DLV_KEY_CD(tempStruct.getCUS_DLV_KEY_CD());                            // 納品キー番号
		appStruct.setl_CUS_DLV_CD(tempStruct.getCUS_DLV_CD());                                    // 納入番号
	}
	//Add Anken Start 20140319 hui-x
	/**
	 * KM0030010Structの属性により、KQ0010030Structの属性をセット
	 * @param appStruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KM0030010Struct tempStruct){
		appStruct.setl_ODR_TYP(tempStruct.getl_ODR_TYP());                                          // 注文区分
		appStruct.setl_h_ODR_TYP(tempStruct.getl_h_ODR_TYP());                                      // 注文区分
		appStruct.setl_CUST_ODR_NO(tempStruct.getl_CUST_ODR_NO());                                  // 得意先注文番号
		appStruct.setl_CUST_ITEM_CD(tempStruct.getl_CUST_ITEM_CD());                                // 得意先品目番号
		appStruct.setl_ITEM_CD(tempStruct.getl_ITEM_CD());                                          // 品目番号
		appStruct.setl_CUST_CD(tempStruct.getCUST_CD());                                            // 得意先コード
		appStruct.setl_CUST_ANAME(tempStruct.getCUST_NAME());                                 	    // 得意先名
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getl_DESINATED_DLV_DATE());                    // 指定納期
		appStruct.setl_ODR_QTY(tempStruct.getl_ODR_QTY());                                          // 受注数量
		appStruct.setl_UNIT_CD(tempStruct.getl_UNIT_CD());                                          // 単位
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getl_ESTIMATE_UNIT_PRICE());                       // 単価
		appStruct.setl_CUR_UNIT(tempStruct.getl_CUR_UNIT());                                        // 通貨単位
		appStruct.setl_SPCL_PRICE_TYP("1");                   	                                    // 特値区分
		appStruct.setl_DLV_LOC_CD(tempStruct.getl_DLV_LOC_CD());                                    // 納品場所コード
		appStruct.setl_DLV_LOC_NAME(tempStruct.getl_DLV_LOC_NAME());                                // 納品場所名
		appStruct.setl_DEPO_TYP(tempStruct.getl_DEPO_TYP());                                        // 預託倉庫区分
		appStruct.setl_CUST_ITEM_NAME(tempStruct.getl_CUST_ITEM_NAME());                            // 得意先品目名
		appStruct.setl_ITEM_NAME(tempStruct.getl_ESTIMATE_ITEM_NAME());                             // 品目名
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getl_ODR_ACPT_DATE());                              // 受注日
		appStruct.setl_JOB_ODR_CD(tempStruct.getl_JOB_ODR_CD());                                    // 製番
		appStruct.setl_JOB_ODR_QTY(tempStruct.getl_ESTIMATE_QTY());                                 // 手配数量
		appStruct.setl_JOB_ODR_DLV_DATE(tempStruct.getl_JOB_ODR_DLV_DATE());                        // 製番納期
		appStruct.setl_ALC_GRP_CD(tempStruct.getl_ALC_GRP_CD());                                    // 引当グループコード
		appStruct.setl_REMARKS(tempStruct.getl_REMARKS());                                          // 備考
		appStruct.seth_ODR_NO(tempStruct.getl_ODR_NO());                                            // 受注番号
		appStruct.setl_PROJECT_CD(tempStruct.getPROJECT_CD());                                      // 案件番号
		appStruct.setl_ESTIMATE_NO(tempStruct.getESTIMATE_NO());                                    // 見積番号
		appStruct.setl_DETAL_NO(tempStruct.getl_DETAL_NO());                                        // 明細番号	
		appStruct.setl_h_ESTIMATE_TYPE(tempStruct.getl_h_ESTIMATE_TYPE()) ;                         // 手配品目種	
		appStruct.setl_ESTIMATE_TYPE(tempStruct.getl_ESTIMATE_TYPE()) ;                             // 手配品目種	
    	appStruct.setl_OWN_PERSON_CD(tempStruct.getl_OWN_PERSON_CD()) ;                             // 受注担当者コード
    	appStruct.setl_OWN_ORG_CD(tempStruct.getl_OWN_ORG_CD()) ;                                   // 受注担当部門コード
		
	}
	//Add Anken End   20140319 hui-x
	//Add Nec Start 20140616
	/**
	 * KQ0090010Structの属性により、KQ0010030Structの属性をセット
	 * @param appStruct
	 * @param tempStruct
	 */
	private void copyToAppStruct(KQ0010030Struct appStruct,KQ0090010Struct tempStruct){
		//共有
		appStruct.setl_ODR_TYP("3");                                                              // 注文区分
		appStruct.setl_SPCL_PRICE_TYP("1");                   	                                  // 特値区分
		appStruct.setl_DEPO_TYP("10");                                                            // 預託倉庫区分
		appStruct.setl_CUST_ITEM_CD("");                                                          // 得意先品目番号
		appStruct.setl_h_ESTIMATE_TYPE("3") ;                                                     // 手配品目種⇒３：非在庫品
		//非在庫品画面
		appStruct.setl_CUST_ODR_NO(tempStruct.getCUST_ODR_NO());                                  // 得意先注文番号
		appStruct.setl_ITEM_CD(tempStruct.getITEM_CD());                                          // 品目番号
		appStruct.setl_ITEM_NAME(tempStruct.getITEM_NAME());                                      // 品目名
		appStruct.setl_CUST_CD(tempStruct.getCUST_CD());                                          // 得意先コード
		appStruct.setl_CUST_ANAME(tempStruct.getCUST_ANAME());                                    // 得意先名
		appStruct.setl_DESINATED_DLV_DATE(tempStruct.getDESINATED_DLV_DATE());                    // 指定納期
		appStruct.setl_ODR_QTY(tempStruct.getODR_QTY());                                          // 受注数量
		appStruct.setl_UNIT_CD(tempStruct.getSTOCK_UNIT());                                       // 単位
		appStruct.setl_ODR_UNIT_PRICE(tempStruct.getODR_UNIT_PRICE());                            // 単価
		appStruct.setl_ODR_ACPT_DATE(tempStruct.getODR_ACPT_DATE());                              // 受注日
		appStruct.setl_REMARKS(tempStruct.getREMARKS());                                          // 備考
		appStruct.seth_ODR_NO(tempStruct.getODR_NO());                                            // 受注番号
    	appStruct.setl_OWN_PERSON_CD(tempStruct.getl_OWN_PERSON_CD()) ;                           // 自社受注担当者コード
		appStruct.setl_OWN_ORG_CD(tempStruct.getl_OWN_ORG_CD());                                  // 自社受注担当者コード
		appStruct.setl_ORGN_ODR_NO(tempStruct.getORGN_ODR_NO());                                  // 元受注番号       ⇒非在庫品受注専用ADD
		appStruct.setl_ADD_ODR_FLG(tempStruct.getw_ADD_ODR_FLG());                                // 増額受注フラグ   ⇒非在庫品受注専用ADD
		
	}
	//Add Nec End   20140616x
        //}}user_implement_code_main

	//////////////////////////////

	/**
	 * 読込ボタン押下時に実行される処理です。
	 *
	 */
	public void controlSelect() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlSelect");
			//{{user_implement_dev:<controlSelect>
		try {
            //  リストをクリア
			if(list == null){
				list = new ArrayList();
			}else{
				list.clear();
			}
			// 承認権限用のリスト
			List apprPowerList = null;
			// ログインユーザーを基に［ユーザマスタ］承認権限をチェック
			struct.setLOGIN_USER_CD(this.getsysUSER_CD());
			apprPowerList = entity.mcheckUSER_MST.read(conn, struct);
			if(apprPowerList.isEmpty()){
				setWarnMessage("AZ00037",struct.getLOGIN_USER_CD());
			}else{
				struct.seth_APPR_POWER_TYP(((KQ0010030Struct)apprPowerList.get(0)).geth_APPR_POWER_TYP());
				if("0".equals(struct.geth_APPR_POWER_TYP())){
					setWarnMessage("AZ00037",struct.getLOGIN_USER_CD());
				}
			}

			// 検索パターンを取得
			if("true".equals(struct.getr1_FILTER1())){
				struct.seth_SELECT_TYP("1");
			}else if("true".equals(struct.getr2_FILTER1())){
				struct.seth_SELECT_TYP("2");
			}else if("true".equals(struct.getr3_FILTER1())){
				struct.seth_SELECT_TYP("3");
			}
			int maxLine = sp.getMaxLine(conn,10);
	         if(maxLine !=0){
            	 struct.setROW_COUNT(String.valueOf(maxLine));
             }else{
            	 struct.setROW_COUNT(null);
             }
			List resultList= null;
			// トラン承認依頼情報を検索
			if("1".equals(struct.geth_SELECT_TYP())){
				resultList = entity.mselectModel1Cnt.read(conn,struct);
			}else if("2".equals(struct.geth_SELECT_TYP())){
				resultList = entity.mselectModel2Cnt.read(conn,struct);
			}else{
				resultList = entity.mselectModel3Cnt.read(conn,struct);
			}
			 int rowCount = Integer.parseInt(((KQ0010030Struct)resultList.get(0)).getl_COUNT()); 
			// エラー
			if(rowCount == 0){
                setErrorMessage("ZZ06001");
                setReadStatus(NOT_FOUND);
				setList(null);
                return ;
			}	
			 //表示対象のデータが最大表示件数を超えた場合。
			if(maxLine != 0 && rowCount == maxLine+1){			
				ExpjMessage emsg = new ExpjMessage("ZZ01115",String.valueOf(maxLine));
				msgStruct.addError( emsg );
				sysLog.warning(emsg, getsysUSER_CD());
				// 検索状態を「最大行数オーバー」に設定
				setReadStatus(TOO_MANY);
				setList(null);
				return;
			}
			// 依頼情報を検索
			selectApprInfo();
		    //検索状態を「読込成功」に設定
			setReadStatus(NORMAL);
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlSelect>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlSelect");

		return;
	}

	/**
	 * 選択承認ボタン押下時に実行される処理です。
	 *
	 */
	public void controlApprAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");
			//{{user_implement_dev:<controlApprAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List tran_src_lst = null;                                           // 承認依頼情報リスト
		List tempList = null;  
		KQ0010030Struct tempStruct = new KQ0010030Struct();                 // 受注承認struct対象 
		KQ0010010Struct kq0010010struct = new KQ0010010Struct();            // 受注登録struct対象
		KQ0010020Struct kq0010020struct = new KQ0010020Struct();            // 受注情報修正struct対象
		KQ0010010Control kq0010010control = new KQ0010010Control();         // 受注登録control対象
		KQ0010020Control kq0010020control = new KQ0010020Control();         // 受注情報修正control対象
		//Add Anken Start   20140319 hui-x
		KM0030010Struct km0030010Struct = new KM0030010Struct();            // 案件受注登録struct対象
		KM0030010Control km0030010Control = new KM0030010Control();         // 案件受注登録control対象
		//Add Anken End   20140319 hui-x
		//Add Nec Start 20140616
		KQ0090010Struct kq0090010Struct = new KQ0090010Struct();            // 非在庫品受注登録struct対象
		KQ0090010Control kq0090010Control = new KQ0090010Control();         // 非在庫品受注登録control対象
		//Add Nec End 20140616
		try {
		// 依頼者承認者同一許可チェック
		if(!check()){
			return;
		}
		List apprID_lst = struct.getList_h_APPR_ID();                      // 承認IDリスト
		List screen_url_lst = struct.getList_h_SCREEN_URL();                //　画面URLリスト 
		List proc_typ_lst = struct.getList_h_PROC_TYP();                    //　処理区分　1:登録　　2:更新　3:削除
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		
		// 更新数チェック
		for(int i=0;i<apprID_lst.size();i++){
			tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // 承認IDを設定
			tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // 更新数を設定
			// 検索
			tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
			if(tempList.isEmpty()){
				setErrorMessage("ZZ01105");
				return ;
			}
		}
		// 選択データを承認 
		for(int i = 0;i<apprID_lst.size();i++){
			// 
			String appr_id = (String) apprID_lst.get(i);
			tempStruct.seth_APPR_ID(appr_id);
			tran_src_lst = entity.mselectT_TRAN_SRC.read(conn, tempStruct);

			// 受注登録データ処理			
			if(screen_url_lst.get(i).equals("KQ0010010Servlet")){
				for(int j=0;j<tran_src_lst.size();j++){
					//　初期化値をセット
					if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
						settoStruct(kq0010010control,(KQ0010030Struct)tran_src_lst.get(j));
					}else{
						//　画面データをセット
						settoStruct(kq0010010struct,(KQ0010030Struct)tran_src_lst.get(j));
					}
				}
				kq0010010control.set_APR_ODR("3");                       // 受注データ再チェック用
				kq0010010control.struct = kq0010010struct;               // 受注登録struct対象
				kq0010010control.list = new ArrayList();                 // 受注登録リスト    
				kq0010010control.list.add(kq0010010struct);              // データ追加              
				kq0010010control.conn = conn;                            // DB
				kq0010010control.setBusiness(this.business);             // 業務情報
				
				kq0010010control.createMsgStruct();                      // メッセジー
				//kq0010010control.beginTransaction();                     // システム日付取得
				kq0010010control.control_eventHandller("Insert");        // 受注登録の登録処理を行う
				msgStruct = kq0010010control.getMsgStruct();             // メッセジーを戻る
				
				//Mod Anken Start   20140319 hui-x
//			}else{
//				// 受注情報修正処理			
//				for(int j=0;j<tran_src_lst.size();j++){
//					if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
//						//　初期化値をセット
//						settoStruct(kq0010020control,(KQ0010030Struct)tran_src_lst.get(j));
//					}else{
//						//　画面データをセット
//						settoStruct(kq0010020struct,(KQ0010030Struct)tran_src_lst.get(j));
//					}
//				}
//				kq0010020control.struct = kq0010020struct;               // 受注情報修正struct対象
//				kq0010020control.list = new ArrayList();                 // 受注情報修正リスト    
//				kq0010020control.list.add(kq0010020struct);              // データ追加         
//				kq0010020control.conn = conn;                            // DB
//				kq0010020control.setBusiness(this.business);             // 業務情報
//				
//				kq0010020control.createMsgStruct();                      // メッセジー
//				kq0010020control.beginTransaction();                     // システム日付取得
//				// 受注情報修正の更新処理を行う
//				if(((String)proc_typ_lst.get(i)).equals("2")){
//					kq0010020control.control_eventHandller("Update");
//				}else{	
//					// 受注情報修正の削除処理を行う
//					kq0010020control.control_eventHandller("Delete");
//				}
//				msgStruct = kq0010020control.getMsgStruct();             // メッセジーを戻る
//			} 
			}else if(screen_url_lst.get(i).equals("KQ0010020Servlet")) {
				// 受注情報修正処理			
				for(int j=0;j<tran_src_lst.size();j++){
					if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
						//　初期化値をセット
						settoStruct(kq0010020control,(KQ0010030Struct)tran_src_lst.get(j));
					}else{
						//　画面データをセット
						settoStruct(kq0010020struct,(KQ0010030Struct)tran_src_lst.get(j));
					}
				}
				kq0010020control.struct = kq0010020struct;               // 受注情報修正struct対象
				kq0010020control.list = new ArrayList();                 // 受注情報修正リスト    
				kq0010020control.list.add(kq0010020struct);              // データ追加         
				kq0010020control.conn = conn;                            // DB
				kq0010020control.setBusiness(this.business);             // 業務情報
				
				kq0010020control.createMsgStruct();                      // メッセジー
				kq0010020control.beginTransaction();                     // システム日付取得
				
				if(((String)proc_typ_lst.get(i)).equals("2")){
					kq0010020control.control_eventHandller("Update");
				}else{	
					// 受注情報修正の削除処理を行う
					kq0010020control.control_eventHandller("Delete");
				}
				msgStruct = kq0010020control.getMsgStruct();             // メッセジーを戻る
			} else if(screen_url_lst.get(i).equals("KM0030010Servlet")){
				   // 案件受注登録データ処理
					for(int j=0;j<tran_src_lst.size();j++){
						//　初期化値をセット
						if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
							settoStruct(km0030010Control,(KQ0010030Struct)tran_src_lst.get(j));
						}else{
							//　画面データをセット
							settoStruct(km0030010Struct,(KQ0010030Struct)tran_src_lst.get(j));
						}
					}
					km0030010Control.setStruct(km0030010Struct);           	    // 案件受注登録struct対象
					km0030010Struct.seth_APR_ODR("0");
					km0030010Struct.seth_UPDATE_FLG("1");
					List list = new ArrayList();               					// 案件受注登録リスト    
					list.add(km0030010Struct);									// データ追加           
					km0030010Control.setList(list);
					km0030010Control.connect() ;                       		    // DB
					km0030010Control.setBusiness(this.business);				// 業務情報
					
					km0030010Control.createMsgStruct();                		    // メッセジー
					km0030010Control.beginTransaction();               		    // システム日付取得
					
					if(((String)proc_typ_lst.get(i)).equals("1")){
						// 案件受注登録の登録処理を行う
						km0030010Control.control_eventHandller("Insert");       
					}else if(((String)proc_typ_lst.get(i)).equals("2")){
						// 案件受注登録の更新処理を行う
						km0030010Control.control_eventHandller("Update");
					}else{	
						// 案件受注登録の削除処理を行う
						km0030010Control.control_eventHandller("Delete");
					}

					msgStruct = km0030010Control.getMsgStruct();             // メッセジーを戻る
			}
			//Mod Anken End   20140319 hui-x
			//Add Nec 20140616 STR
			else if(screen_url_lst.get(i).equals("KQ0090010Servlet")){
				   // 非在庫品_受注登録データ処理
					for(int j=0;j<tran_src_lst.size();j++){
						//　初期化値をセット
						if(((KQ0010030Struct)tran_src_lst.get(j)).getFIELD_FLG().equals("2")){
							settoStruct(kq0090010Control,(KQ0010030Struct)tran_src_lst.get(j));
						}else{
							//　画面データをセット
							settoStruct(kq0090010Struct,(KQ0010030Struct)tran_src_lst.get(j));
						}
					}
					kq0090010Control.setStruct(kq0090010Struct);           	    // 非在庫品受注登録struct対象
					kq0090010Struct.seth_APR_ODR("0");
					//kq0090010Struct.seth_UPDATE_FLG("1");
					List list = new ArrayList();               					// 非在庫品受注登録リスト    
					list.add(kq0090010Struct);									// データ追加           
					kq0090010Control.setList(list);
					kq0090010Control.connect() ;                       		    // DB
					kq0090010Control.setBusiness(this.business);				// 業務情報
					
					kq0090010Control.createMsgStruct();                		    // メッセジー
					kq0090010Control.beginTransaction();               		    // システム日付取得
					
					if(((String)proc_typ_lst.get(i)).equals("1")){
						// 非在庫品受注登録の登録処理を行う
						kq0090010Control.control_eventHandller("Insert");       
					}else if(((String)proc_typ_lst.get(i)).equals("2")){
						// 非在庫品受注登録の更新処理を行う
						kq0090010Control.control_eventHandller("Update");
					}else{	
						// 非在庫品受注登録の削除処理を行う
						kq0090010Control.control_eventHandller("Delete");
					}

					msgStruct = kq0090010Control.getMsgStruct();             // メッセジーを戻る
			}
			//Add Nec 20140616 END
			
			// エラー
			if(msgStruct.hasError()){
				return;
			}
			// 承認依頼情報を削除
			tranAppr.deleteTranSrc(appr_id);
			tranAppr.deleteTranApr(appr_id);
		}
		conn.commit();
		// 再読込
		controlSelect();
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlApprAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprAssort");

		return;
	}

	/**
	 * 選択保留ボタン押下時に実行される処理です。
	 *
	 */
	public void controlReserveAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveAssort");
			//{{user_implement_dev:<controlReserveAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		List tempList = null;                                             // 更新数チェック用リスト
		KQ0010030Struct tempStruct = new KQ0010030Struct();               // 更新数チェック用オブジェクト
		try {
			// 依頼者承認者同一許可チェック
			if(!check()){
				return;
			}
			// 更新数チェック
			for(int i=0;i<apprID_lst.size();i++){
					tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // 承認IDを設定
					tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // 更新数を設定
					// 検索
					tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
					if(tempList.isEmpty()){
						setErrorMessage("ZZ01105");
						return ;
					}
			}
			// 選択データを保留
			for(int i=0;i<apprID_lst.size();i++){
				tranAppr.updateTranApr((String)apprID_lst.get(i), "2", this.getsysUSER_CD(), struct.getRESERVE_CAUSE());
			}
			conn.commit();
			struct.setRESERVE_CAUSE("");
			// 再読込
			controlSelect();
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlReserveAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveAssort");

		return;
	}

	/**
	 * 選択保留解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlReserveDelAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveDelAssort");
			//{{user_implement_dev:<controlReserveDelAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		List tempList = null;                                             // 更新数チェック用リスト
		KQ0010030Struct tempStruct = new KQ0010030Struct();               // 更新数チェック用オブジェクト
		try {

		// 依頼者承認者同一許可チェック
		if(!check()){
			return;
		}

		// 更新数チェック
		for(int i=0;i<apprID_lst.size();i++){
				tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // 承認IDを設定
				tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // 更新数を設定
				// 検索
				tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
				if(tempList.isEmpty()){
					setErrorMessage("ZZ01105");
					return ;
				}
		}
		// 選択データを保留解除
		for(int i=0;i<apprID_lst.size();i++){
			tranAppr.updateTranApr((String)apprID_lst.get(i), "1", "", "");
		}
		conn.commit();
		// 保留理由をクリア
		struct.setRESERVE_CAUSE("");
		// 再読込
		controlSelect();
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlReserveDelAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlReserveDelAssort");

		return;
	}

	/**
	 * 選択依頼削除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlApprDelAssort() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprDelAssort");
			//{{user_implement_dev:<controlApprDelAssort>
		TranAppr tranAppr = new TranAppr(conn,this.getsysUSER_CD(),this.getScreenId());
		List apprID_lst = struct.getList_h_APPR_ID();
		List modifycount_lst = struct.getList_h_MODIFY_COUNT();
		List tempList = null;                                             // 更新数チェック用リスト
		KQ0010030Struct tempStruct = new KQ0010030Struct();               // 更新数チェック用オブジェクト
		try {
			
			// 更新数チェック
			for(int i=0;i<apprID_lst.size();i++){
					tempStruct.seth_APPR_ID((String) apprID_lst.get(i));                         // 承認IDを設定
					tempStruct.seth_MODIFY_COUNT((String) modifycount_lst.get(i));               // 更新数を設定
					// 検索
					tempList = entity.mcheckMODIFY_COUNT.read(conn,tempStruct);
					if(tempList.isEmpty()){
						setErrorMessage("ZZ01105");
						return ;
					}
			}
			// 選択依頼データを削除
			for(int i=0;i<apprID_lst.size();i++){
				tranAppr.deleteTranSrc((String)apprID_lst.get(i));
				tranAppr.deleteTranApr((String)apprID_lst.get(i));
			}
			conn.commit();
			struct.setRESERVE_CAUSE("");
			// 再読込
			controlSelect();
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}finally {
			if (conn != null) {
				conn.rollback();
			}
		}
                //}}user_implement_dev:<controlApprDelAssort>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlApprDelAssort");

		return;
	}

	/**
	 * 全選択ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckAll() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");
			//{{user_implement_dev:<controlCheckAll>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckAll>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckAll");

		return;
	}

	/**
	 * 全解除ボタン押下時に実行される処理です。
	 *
	 */
	public void controlCheckClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");
			//{{user_implement_dev:<controlCheckClear>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlCheckClear>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlCheckClear");

		return;
	}

	/**
	 * クリアボタン押下時に実行される処理です。
	 *
	 */
	public void controlClear() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClear");
			//{{user_implement_dev:<controlClear>
			// TODO: ユーザ定義のコードを記述してください
		// リストクリア
		if(list != null){
			list.clear();
		}
		struct.seth_REQUEST_APPR_SAME(_REQUEST_APPR_SAME);
                //}}user_implement_dev:<controlClear>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClear");

		return;
	}

	/**
	 * 閉じるボタン押下時に実行される処理です。
	 *
	 */
	public void controlClose() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClose");
			//{{user_implement_dev:<controlClose>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlClose>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClose");

		return;
	}

	/**
	 * 明細ボタン押下時に実行される処理です。
	 *
	 */
	public void controlClickDetail() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClickDetail");
			//{{user_implement_dev:<controlClickDetail>
		
		try{
			KQ0010030Struct oldStruct = new KQ0010030Struct();
			List oldDateList = null;
			if(!"1".equals(struct.geth_PROC_TYP())){
	            // 変更前データリストを取得
				//Mod Anken Start   20140509 hui-x
				//oldDateList = entity.mselectMSTINFO.read(conn, struct);

				if( (null != struct.getl_h_ESTIMATE_TYPE() && !"".equals(struct.getl_h_ESTIMATE_TYPE()) && "2".equals(struct.getl_h_ESTIMATE_TYPE()) ) ||
				   (null != struct.getl_h_ESTIMATE_TYPE() && !"".equals(struct.getl_h_ESTIMATE_TYPE()) && "3".equals(struct.getl_h_ESTIMATE_TYPE()) ) )
				{
					oldDateList = entity.mselectT_ODR_UNSTOCK.read(conn, struct);
				}else {
					oldDateList = entity.mselectMSTINFO.read(conn, struct);
				}
				
				//Mod Anken End   20140509 hui-x
			}
		    
			//　変更前データオブジェクトを設定
			if (oldDateList!=null && oldDateList.size()>0) {
				oldStruct = (KQ0010030Struct) oldDateList.get(0);
				struct.setd_OLD_ODR_NO((oldStruct.getd_OLD_ODR_NO()==null?"":oldStruct.getd_OLD_ODR_NO()));                         // 受注番号
				struct.setd_OLD_ODR_TYP((oldStruct.getd_OLD_ODR_TYP()==null?"":oldStruct.getd_OLD_ODR_TYP()));                      // 受注区分
				struct.setd_OLD_CUST_ODR_NO((oldStruct.getd_OLD_CUST_ODR_NO()==null?"":oldStruct.getd_OLD_CUST_ODR_NO()));          // 得意先注文番号
				struct.setd_OLD_CUST_CD((oldStruct.getd_OLD_CUST_CD()==null?"":oldStruct.getd_OLD_CUST_CD()));                      // 得意先コード
				struct.setd_OLD_CUST_ITEM_CD((oldStruct.getd_OLD_CUST_ITEM_CD()==null?"":oldStruct.getd_OLD_CUST_ITEM_CD()));       // 得意先品目番号
				struct.setd_OLD_DLV_LOC_CD((oldStruct.getd_OLD_DLV_LOC_CD()==null?"":oldStruct.getd_OLD_DLV_LOC_CD()));             // 納品場所コード
				struct.setd_OLD_ODR_QTY((oldStruct.getd_OLD_ODR_QTY()==null?"":oldStruct.getd_OLD_ODR_QTY()));                      // 受注数量
				struct.setd_OLD_DESINATED_DLV_DATE((oldStruct.getd_OLD_DESINATED_DLV_DATE()==null?"":oldStruct.getd_OLD_DESINATED_DLV_DATE())); // 指定納期
				struct.setd_OLD_SPCL_PRICE_TYP((oldStruct.getd_OLD_SPCL_PRICE_TYP()==null?"":oldStruct.getd_OLD_SPCL_PRICE_TYP()));  // 特値区分
				struct.setd_OLD_ODR_UNIT_PRICE((oldStruct.getd_OLD_ODR_UNIT_PRICE()==null?"":oldStruct.getd_OLD_ODR_UNIT_PRICE()));  // 単価
				struct.setd_OLD_REMARKS((oldStruct.getd_OLD_REMARKS()==null?"":oldStruct.getd_OLD_REMARKS()));                       // 備考
			}else{
				struct.setd_OLD_ODR_NO("");
				struct.setd_OLD_ODR_TYP("");
				struct.setd_OLD_CUST_ODR_NO("");
				struct.setd_OLD_CUST_CD("");
				struct.setd_OLD_CUST_ITEM_CD("");
				struct.setd_OLD_DLV_LOC_CD("");
				struct.setd_OLD_ODR_QTY("");
				struct.setd_OLD_DESINATED_DLV_DATE("");
				struct.setd_OLD_SPCL_PRICE_TYP("");
				struct.setd_OLD_ODR_UNIT_PRICE("");
				struct.setd_OLD_REMARKS("");
			}
			// 　変更後データオブジェクトを設定
			if(!"3".equals(struct.geth_PROC_TYP())){
				struct.setd_NEW_ODR_NO(struct.geth_ODR_NO());                            // 受注番号
				struct.setd_NEW_ODR_TYP(struct.getl_ODR_TYP());                          // 受注区分
				struct.setd_NEW_CUST_ODR_NO(struct.getl_CUST_ODR_NO());                  // 得意先注文番号
				struct.setd_NEW_CUST_CD(struct.getl_CUST_CD());                          // 得意先コード
				struct.setd_NEW_CUST_ITEM_CD(struct.getl_CUST_ITEM_CD());                // 得意先品目番号
				struct.setd_NEW_DLV_LOC_CD(struct.getl_DLV_LOC_CD());                    // 納品場所コード
				struct.setd_NEW_ODR_QTY(struct.getl_ODR_QTY());                          // 受注数量
				struct.setd_NEW_DESINATED_DLV_DATE(struct.getl_DESINATED_DLV_DATE());    // 指定納期
				struct.setd_NEW_SPCL_PRICE_TYP(struct.getl_SPCL_PRICE_TYP());            // 特値区分
				struct.setd_NEW_ODR_UNIT_PRICE(struct.getl_ODR_UNIT_PRICE());            // 単価
				struct.setd_NEW_REMARKS(struct.getl_REMARKS());                          // 備考
			} 
			else{
				struct.setd_NEW_ODR_NO("");
				struct.setd_NEW_ODR_TYP("");
				struct.setd_NEW_CUST_ODR_NO("");
				struct.setd_NEW_CUST_CD("");
				struct.setd_NEW_CUST_ITEM_CD("");
				struct.setd_NEW_DLV_LOC_CD("");
				struct.setd_NEW_ODR_QTY("");
				struct.setd_NEW_DESINATED_DLV_DATE("");
				struct.setd_NEW_SPCL_PRICE_TYP("");
				struct.setd_NEW_ODR_UNIT_PRICE("");
				struct.setd_NEW_REMARKS("");
			}
			// 注文区分
			struct.setd_OLD_ODR_TYP(getTypeName(_ODR_ODR_TYP,struct.getd_OLD_ODR_TYP()));
			struct.setd_NEW_ODR_TYP(getTypeName(_ODR_ODR_TYP,struct.getd_NEW_ODR_TYP()));
			// 特値区分 
			struct.setd_OLD_SPCL_PRICE_TYP(getTypeName(_ODR_SPCL_PRICE,struct.getd_OLD_SPCL_PRICE_TYP()));
			struct.setd_NEW_SPCL_PRICE_TYP(getTypeName(_ODR_SPCL_PRICE,struct.getd_NEW_SPCL_PRICE_TYP()));
			//	  更新の場合、変更済みを設定
			if("2".equals(struct.geth_PROC_TYP())){
				// 受注番号の変更有無フラグ
				if (!struct.getd_OLD_ODR_NO().equals(struct.getd_NEW_ODR_NO())) {
					struct.setd_ODR_NO_CHANGE(changed);
				}
				// 受注区分の変更有無フラグ
				if (!struct.getd_OLD_ODR_TYP().equals(struct.getd_NEW_ODR_TYP())) {
					struct.setd_ODR_TYP_CHANGE(changed);
				}
				// 得意先注文番号の変更有無フラグ
				if (!struct.getd_OLD_CUST_ODR_NO().equals(struct.getd_NEW_CUST_ODR_NO())) {
					struct.setd_CUST_ODR_NO_CHANGE(changed);
				}
				// 得意先コードの変更有無フラグ
				if (!struct.getd_OLD_CUST_CD().equals(struct.getd_NEW_CUST_CD())) {
					struct.setd_CUST_CD_CHANGE(changed);
				}
				// 得意先品目番号の変更有無フラグ
				if (!struct.getd_OLD_CUST_ITEM_CD().equals(struct.getd_NEW_CUST_ITEM_CD())) {
					struct.setd_CUST_ITEM_CD_CHANGE(changed);
				}
				// 納品場所コードの変更有無フラグ
				if (!struct.getd_OLD_DLV_LOC_CD().equals(struct.getd_NEW_DLV_LOC_CD())) {
					struct.setd_DLV_LOC_CD_CHANGE(changed);
				}
				//Mod Anken Start   20140418 hui-x
				// 受注数量の変更有無フラグ
//				if(Calculate.compare(struct.getd_OLD_ODR_QTY(), struct.getd_NEW_ODR_QTY()) != 0){
//					struct.setd_ODR_QTY_CHANGE(changed);
//				}
				if(Calculate.compare(struct.getd_OLD_ODR_QTY() == "" ? "0" : struct.getd_OLD_ODR_QTY(), struct.getd_NEW_ODR_QTY()) != 0){
					struct.setd_ODR_QTY_CHANGE(changed);
				}
				//Mod Anken End   20140418 hui-x
				// 指定納期の変更有無フラグ
				if (!struct.getd_OLD_DESINATED_DLV_DATE().equals(struct.getd_NEW_DESINATED_DLV_DATE())) {
					struct.setd_DESINATED_DLV_DATE_CHANGE(changed);
				}
				// 特値区分の変更有無フラグ
				if (!struct.getd_OLD_SPCL_PRICE_TYP().equals(struct.getd_NEW_SPCL_PRICE_TYP())) {
					struct.setd_SPCL_PRICE_TYP_CHANGE(changed);
				}
				//Mod Anken Start   20140418 hui-x
				// 単価の変更有無フラグ
//				if(Calculate.compare(struct.getd_OLD_ODR_UNIT_PRICE(), struct.getd_NEW_ODR_UNIT_PRICE()) != 0){
//					struct.setd_ODR_UNIT_PRICE_CHANGE(changed);
//				}
				if(Calculate.compare(struct.getd_OLD_ODR_UNIT_PRICE() == "" ? "0" : struct.getd_OLD_ODR_UNIT_PRICE(), struct.getd_NEW_ODR_UNIT_PRICE()) != 0){
					struct.setd_ODR_UNIT_PRICE_CHANGE(changed);
				}
				//Mod Anken End   20140418 hui-x
				// 備考の変更有無フラグ
				if (!struct.getd_OLD_REMARKS().equals(struct.getd_NEW_REMARKS())) {
					struct.setd_REMARKS_CHANGE(changed);
				}
			}
		} catch(SQLException e) {
			// エラーメッセージ作成
			ExpjMessage emsg = new ExpjMessage( "ZZ01106" );
			sysLog.severe(emsg, getsysUSER_CD());
			ExpjException ee = new ExpjException(e, emsg);
			throw ee;
		}
                //}}user_implement_dev:<controlClickDetail>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlClickDetail");

		return;
	}


	/**
	 * 初期化時に実行される処理です。
	 *
	 */
	public void controlINITIAL() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");
		//{{user_implement_dev:<controlINITIAL>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<controlINITIAL>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlINITIAL");

		return;
	}

	/**
	 * リロード時に実行される処理です。
	 *
	 */
	public void controlRELOAD() throws BusinessProcessException, FoundationException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");
		//{{user_implement_dev:<controlRELOAD>
		try {
			/** パラメータを取得 */
			privateConfig = new PrivateConfig(conn);
			String apr_odr = privateConfig.getString("APR_ODR");
			// パラメータ「受注承認」が取得できなかった場合
			if (apr_odr == null || "".equals(apr_odr)) {
				String locale = CoreTools.getLocale(struct.getsUser_ID());
				ResourceBundle messages = CoreTools.getResourceBundle(
						"ExpjMessage", locale);
				setErrorMessage("AZ00041", messages.getString("AZ00072"));
				// 検索状態を「失敗」に設定
				setReadStatus(ERROR);
				return;
			} else if ("1".equals(apr_odr)) {
				// １の場合
				apr_odr = "1";
			} else {
				// １以外の場合
				apr_odr = "0";
				setErrorMessage("KQ00336");
				// 検索状態を「失敗」に設定
				setReadStatus(ERROR);
				return;
			}
			// 依頼者承認者同一許可
			String request_Appr_Same = privateConfig.getString("REQUEST_APPR_SAME");
			// パラメータ「依頼者承認者同一許可」が取得できなかった場合
			if (request_Appr_Same == null || "".equals(request_Appr_Same)) {
				// パラメータ「依頼者承認者同一許可」を取得できなかった場合
				struct.seth_REQUEST_APPR_SAME("0");
				setErrorMessage("AA00212");
				setReadStatus(ERROR);
				struct.seth_REQUEST_APPR_SAME("0");
			} else if (!"1".equals(request_Appr_Same)) {
				// １以外の場合
				struct.seth_REQUEST_APPR_SAME("0");
			} else {
				struct.seth_REQUEST_APPR_SAME("1");
			}
			set_REQUEST_APPR_SAME(request_Appr_Same);
		} catch (Exception e) {
			ExpjMessage emsg = new ExpjMessage("ZZ01006", " (SBM1093)リロード処理は失敗しました。");
			msgStruct.addWarn(emsg);
			sysLog.info(emsg, getsysUSER_CD());
		}
                //}}user_implement_dev:<controlRELOAD>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlRELOAD");

		return;
	}

	/**
	 * イベントハンドラの前処理です。
	 *
	 * @param buttun ボタン名
	 */
	public void controlPREPARATION(String button) throws BusinessProcessException, FoundationException, BusinessLockException
	{
		Logger logger = Logger.getLogger("com.nec.jp.orteus.metamorBase.KQ0010");
		logger.entering("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			// コンボボックス部品のデータのセットはここに記述してください。
			try {
			ComboBox comboController = new ComboBox(conn);
			// 処理区分
			_PROC_TYP = comboController.getData("APPR_PROC_TYP");
			// 承認状態
			_APPR_STATUS_TYP = comboController.getData("APPR_STATUS_TYP");
			// 注文区分
			_ODR_ODR_TYP = comboController.getData("ODR_ODR_TYP");
			// 特値区分
			_ODR_SPCL_PRICE = comboController.getData("ODR_SPCL_PRICE");
			// 預託倉庫区分
			_ODR_DEPO_TYP = comboController.getData("ODR_DEPO_TYP");
			} catch (SQLException e) {
				e.printStackTrace();
			}
                //}}user_implement_dev:<controlPREPARATION>
		logger.exiting("KQ0010030Control"+":USER="+struct.getsUser_ID(),"controlPREPARATION");

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
			} else if( button.equals("ApprAssort") ) {
				controlApprAssort();
			} else if( button.equals("ReserveAssort") ) {
				controlReserveAssort();
			} else if( button.equals("ReserveDelAssort") ) {
				controlReserveDelAssort();
			} else if( button.equals("ApprDelAssort") ) {
				controlApprDelAssort();
			} else if( button.equals("CheckAll") ) {
				controlCheckAll();
			} else if( button.equals("CheckClear") ) {
				controlCheckClear();
			} else if( button.equals("Clear") ) {
				controlClear();
			} else if( button.equals("Close") ) {
				controlClose();
			} else if( button.equals("ClickDetail") ) {
				controlClickDetail();
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
//			throw new FoundationException("KQ0010030Control",e.getMessage(),"control_eventHandllerメソッドでエラーが発生しました。");
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
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","CSVの出力処理"));
			throw new FoundationException("KQ0010030Control",e.getMessage(),"createDefaultCSVメソッドでエラーが発生しました。");
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
//				objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","システム日付の取得処理"));
				throw new FoundationException("KQ0010030Control","beginTransaction()","システム日付取得処理でエラーが発生しました。");
			}

			// Struct変数へデータのセット
			struct.setsSysdate( sToday );

		//{{user_implement_dev:<beginTransaction>
			// TODO: ユーザ定義のコードを記述してください
                //}}user_implement_dev:<beginTransaction>
		} catch( SQLException e ) {
			e.printStackTrace();
//			objMessage.m_writer.write(Level.ALL, objMessage.getIDMsg("KQ0010030-E999","コントロールのイベント処理"));
			throw new FoundationException("KQ0010030Control",e.getMessage(),"beginTransactionメソッドでエラーが発生しました。");
		}

		return;
	}

	//////////////////////////////
	/**
	 * メンバ変数の定義
	 */
	protected KQ0010030Entity entity;
	protected KQ0010030Struct struct;
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

		entity = new KQ0010030Entity();
		struct = new KQ0010030Struct();

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
	 * KQ0010030クラスの標準コンストラクタ
	 */
	public KQ0010030Control() throws BusinessProcessException, FoundationException
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
				KQ0010030Struct key = (KQ0010030Struct)keyList.get(j);
				// メッセージキーを作成する
				MessageKey msgKey = new MessageKey(tableName, keyColumnName);
				if(msgKeyType.containsKeyColumn("r1_FILTER1") && key.getr1_FILTER1() != null) {
					msgKey.setKeyValue("r1_FILTER1", key.getr1_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r2_FILTER1") && key.getr2_FILTER1() != null) {
					msgKey.setKeyValue("r2_FILTER1", key.getr2_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("r3_FILTER1") && key.getr3_FILTER1() != null) {
					msgKey.setKeyValue("r3_FILTER1", key.getr3_FILTER1());
				}
				if(msgKeyType.containsKeyColumn("h_SELECT_TYP") && key.geth_SELECT_TYP() != null) {
					msgKey.setKeyValue("h_SELECT_TYP", key.geth_SELECT_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_REQUEST_APPR_SAME") && key.geth_REQUEST_APPR_SAME() != null) {
					msgKey.setKeyValue("h_REQUEST_APPR_SAME", key.geth_REQUEST_APPR_SAME());
				}
				if(msgKeyType.containsKeyColumn("RESERVE_CAUSE") && key.getRESERVE_CAUSE() != null) {
					msgKey.setKeyValue("RESERVE_CAUSE", key.getRESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("l_PROC_TYP_VALUE") && key.getl_PROC_TYP_VALUE() != null) {
					msgKey.setKeyValue("l_PROC_TYP_VALUE", key.getl_PROC_TYP_VALUE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN") && key.getl_ODR_TYP_DN() != null) {
					msgKey.setKeyValue("l_ODR_TYP_DN", key.getl_ODR_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_TYP") && key.getl_ODR_TYP() != null) {
					msgKey.setKeyValue("l_ODR_TYP", key.getl_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO") && key.getl_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("l_CUST_ODR_NO", key.getl_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD") && key.getl_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_CD", key.getl_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_CD") && key.getl_ITEM_CD() != null) {
					msgKey.setKeyValue("l_ITEM_CD", key.getl_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_CD") && key.getl_CUST_CD() != null) {
					msgKey.setKeyValue("l_CUST_CD", key.getl_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ANAME") && key.getl_CUST_ANAME() != null) {
					msgKey.setKeyValue("l_CUST_ANAME", key.getl_CUST_ANAME());
				}
				if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE") && key.getl_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("l_DESINATED_DLV_DATE", key.getl_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_QTY") && key.getl_ODR_QTY() != null) {
					msgKey.setKeyValue("l_ODR_QTY", key.getl_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_UNIT_CD") && key.getl_UNIT_CD() != null) {
					msgKey.setKeyValue("l_UNIT_CD", key.getl_UNIT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE") && key.getl_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("l_ODR_UNIT_PRICE", key.getl_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("l_CUR_UNIT") && key.getl_CUR_UNIT() != null) {
					msgKey.setKeyValue("l_CUR_UNIT", key.getl_CUR_UNIT());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN") && key.getl_SPCL_PRICE_TYP_DN() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP_DN", key.getl_SPCL_PRICE_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP") && key.getl_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("l_SPCL_PRICE_TYP", key.getl_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD") && key.getl_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("l_DLV_LOC_CD", key.getl_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME") && key.getl_DLV_LOC_NAME() != null) {
					msgKey.setKeyValue("l_DLV_LOC_NAME", key.getl_DLV_LOC_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN") && key.getl_DEPO_TYP_DN() != null) {
					msgKey.setKeyValue("l_DEPO_TYP_DN", key.getl_DEPO_TYP_DN());
				}
				if(msgKeyType.containsKeyColumn("l_DEPO_TYP") && key.getl_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_DEPO_TYP", key.getl_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME") && key.getl_CUST_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_CUST_ITEM_NAME", key.getl_CUST_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ITEM_NAME") && key.getl_ITEM_NAME() != null) {
					msgKey.setKeyValue("l_ITEM_NAME", key.getl_ITEM_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE") && key.getl_ODR_ACPT_DATE() != null) {
					msgKey.setKeyValue("l_ODR_ACPT_DATE", key.getl_ODR_ACPT_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD") && key.getl_JOB_ODR_CD() != null) {
					msgKey.setKeyValue("l_JOB_ODR_CD", key.getl_JOB_ODR_CD());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY") && key.getl_JOB_ODR_QTY() != null) {
					msgKey.setKeyValue("l_JOB_ODR_QTY", key.getl_JOB_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE") && key.getl_JOB_ODR_DLV_DATE() != null) {
					msgKey.setKeyValue("l_JOB_ODR_DLV_DATE", key.getl_JOB_ODR_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD") && key.getl_ALC_GRP_CD() != null) {
					msgKey.setKeyValue("l_ALC_GRP_CD", key.getl_ALC_GRP_CD());
				}
				if(msgKeyType.containsKeyColumn("l_REMARKS") && key.getl_REMARKS() != null) {
					msgKey.setKeyValue("l_REMARKS", key.getl_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_CUS_DLV_KEY_CD") && key.getl_CUS_DLV_KEY_CD() != null) {
					msgKey.setKeyValue("l_CUS_DLV_KEY_CD", key.getl_CUS_DLV_KEY_CD());
				}
				if(msgKeyType.containsKeyColumn("l_CUS_DLV_CD") && key.getl_CUS_DLV_CD() != null) {
					msgKey.setKeyValue("l_CUS_DLV_CD", key.getl_CUS_DLV_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_ODR_NO") && key.getd_NEW_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("d_NEW_CUST_ODR_NO", key.getd_NEW_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_ODR_NO_CHANGE") && key.getd_CUST_ODR_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_ODR_NO_CHANGE", key.getd_CUST_ODR_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_CD") && key.getd_NEW_CUST_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_CD", key.getd_NEW_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_CD_CHANGE") && key.getd_CUST_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_CD_CHANGE", key.getd_CUST_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_CUST_ITEM_CD") && key.getd_NEW_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("d_NEW_CUST_ITEM_CD", key.getd_NEW_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_CUST_ITEM_CD_CHANGE") && key.getd_CUST_ITEM_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_CUST_ITEM_CD_CHANGE", key.getd_CUST_ITEM_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_DLV_LOC_CD_CHANGE") && key.getd_DLV_LOC_CD_CHANGE() != null) {
					msgKey.setKeyValue("d_DLV_LOC_CD_CHANGE", key.getd_DLV_LOC_CD_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_QTY") && key.getd_NEW_ODR_QTY() != null) {
					msgKey.setKeyValue("d_NEW_ODR_QTY", key.getd_NEW_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_QTY_CHANGE") && key.getd_ODR_QTY_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_QTY_CHANGE", key.getd_ODR_QTY_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DESINATED_DLV_DATE") && key.getd_NEW_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("d_NEW_DESINATED_DLV_DATE", key.getd_NEW_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_DESINATED_DLV_DATE_CHANGE") && key.getd_DESINATED_DLV_DATE_CHANGE() != null) {
					msgKey.setKeyValue("d_DESINATED_DLV_DATE_CHANGE", key.getd_DESINATED_DLV_DATE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_SPCL_PRICE_TYP") && key.getd_NEW_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_NEW_SPCL_PRICE_TYP", key.getd_NEW_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_SPCL_PRICE_TYP_CHANGE") && key.getd_SPCL_PRICE_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_SPCL_PRICE_TYP_CHANGE", key.getd_SPCL_PRICE_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_UNIT_PRICE") && key.getd_NEW_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("d_NEW_ODR_UNIT_PRICE", key.getd_NEW_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_UNIT_PRICE_CHANGE") && key.getd_ODR_UNIT_PRICE_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_UNIT_PRICE_CHANGE", key.getd_ODR_UNIT_PRICE_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_CD") && key.getd_NEW_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_NEW_DLV_LOC_CD", key.getd_NEW_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_REMARKS") && key.getd_NEW_REMARKS() != null) {
					msgKey.setKeyValue("d_NEW_REMARKS", key.getd_NEW_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("d_REMARKS_CHANGE") && key.getd_REMARKS_CHANGE() != null) {
					msgKey.setKeyValue("d_REMARKS_CHANGE", key.getd_REMARKS_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_NO") && key.getd_NEW_ODR_NO() != null) {
					msgKey.setKeyValue("d_NEW_ODR_NO", key.getd_NEW_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_NO_CHANGE") && key.getd_ODR_NO_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_NO_CHANGE", key.getd_ODR_NO_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("d_NEW_ODR_TYP") && key.getd_NEW_ODR_TYP() != null) {
					msgKey.setKeyValue("d_NEW_ODR_TYP", key.getd_NEW_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_ODR_TYP_CHANGE") && key.getd_ODR_TYP_CHANGE() != null) {
					msgKey.setKeyValue("d_ODR_TYP_CHANGE", key.getd_ODR_TYP_CHANGE());
				}
				if(msgKeyType.containsKeyColumn("l_STATUS_NAME") && key.getl_STATUS_NAME() != null) {
					msgKey.setKeyValue("l_STATUS_NAME", key.getl_STATUS_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_PROJECT_CD") && key.getl_PROJECT_CD() != null) {
					msgKey.setKeyValue("l_PROJECT_CD", key.getl_PROJECT_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO") && key.getl_ESTIMATE_NO() != null) {
					msgKey.setKeyValue("l_ESTIMATE_NO", key.getl_ESTIMATE_NO());
				}
				if(msgKeyType.containsKeyColumn("l_DETAL_NO") && key.getl_DETAL_NO() != null) {
					msgKey.setKeyValue("l_DETAL_NO", key.getl_DETAL_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE") && key.getl_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_ESTIMATE_TYPE", key.getl_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE") && key.getl_h_ESTIMATE_TYPE() != null) {
					msgKey.setKeyValue("l_h_ESTIMATE_TYPE", key.getl_h_ESTIMATE_TYPE());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD") && key.getl_OWN_PERSON_CD() != null) {
					msgKey.setKeyValue("l_OWN_PERSON_CD", key.getl_OWN_PERSON_CD());
				}
				if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD") && key.getl_OWN_ORG_CD() != null) {
					msgKey.setKeyValue("l_OWN_ORG_CD", key.getl_OWN_ORG_CD());
				}
				if(msgKeyType.containsKeyColumn("l_ORGN_ODR_NO") && key.getl_ORGN_ODR_NO() != null) {
					msgKey.setKeyValue("l_ORGN_ODR_NO", key.getl_ORGN_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_ADD_ODR_FLG") && key.getl_ADD_ODR_FLG() != null) {
					msgKey.setKeyValue("l_ADD_ODR_FLG", key.getl_ADD_ODR_FLG());
				}
				if(msgKeyType.containsKeyColumn("l_h_ODR_TYP") && key.getl_h_ODR_TYP() != null) {
					msgKey.setKeyValue("l_h_ODR_TYP", key.getl_h_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP") && key.getl_h_DEPO_TYP() != null) {
					msgKey.setKeyValue("l_h_DEPO_TYP", key.getl_h_DEPO_TYP());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP") && key.geth_APPR_POWER_TYP() != null) {
					msgKey.setKeyValue("h_APPR_POWER_TYP", key.geth_APPR_POWER_TYP());
				}
				if(msgKeyType.containsKeyColumn("LOGIN_USER_CD") && key.getLOGIN_USER_CD() != null) {
					msgKey.setKeyValue("LOGIN_USER_CD", key.getLOGIN_USER_CD());
				}
				if(msgKeyType.containsKeyColumn("h_APPR_ID") && key.geth_APPR_ID() != null) {
					msgKey.setKeyValue("h_APPR_ID", key.geth_APPR_ID());
				}
				if(msgKeyType.containsKeyColumn("h_SCREEN_URL") && key.geth_SCREEN_URL() != null) {
					msgKey.setKeyValue("h_SCREEN_URL", key.geth_SCREEN_URL());
				}
				if(msgKeyType.containsKeyColumn("h_STATUS") && key.geth_STATUS() != null) {
					msgKey.setKeyValue("h_STATUS", key.geth_STATUS());
				}
				if(msgKeyType.containsKeyColumn("h_PROC_TYP") && key.geth_PROC_TYP() != null) {
					msgKey.setKeyValue("h_PROC_TYP", key.geth_PROC_TYP());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_BY") && key.getl_REQUEST_BY() != null) {
					msgKey.setKeyValue("l_REQUEST_BY", key.getl_REQUEST_BY());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_BY_NAME") && key.getl_REQUEST_BY_NAME() != null) {
					msgKey.setKeyValue("l_REQUEST_BY_NAME", key.getl_REQUEST_BY_NAME());
				}
				if(msgKeyType.containsKeyColumn("l_REQUEST_DATE") && key.getl_REQUEST_DATE() != null) {
					msgKey.setKeyValue("l_REQUEST_DATE", key.getl_REQUEST_DATE());
				}
				if(msgKeyType.containsKeyColumn("l_APPR_REMARKS") && key.getl_APPR_REMARKS() != null) {
					msgKey.setKeyValue("l_APPR_REMARKS", key.getl_APPR_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE") && key.getl_RESERVE_CAUSE() != null) {
					msgKey.setKeyValue("l_RESERVE_CAUSE", key.getl_RESERVE_CAUSE());
				}
				if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT") && key.geth_MODIFY_COUNT() != null) {
					msgKey.setKeyValue("h_MODIFY_COUNT", key.geth_MODIFY_COUNT());
				}
				if(msgKeyType.containsKeyColumn("START_DATE") && key.getSTART_DATE() != null) {
					msgKey.setKeyValue("START_DATE", key.getSTART_DATE());
				}
				if(msgKeyType.containsKeyColumn("END_DATE") && key.getEND_DATE() != null) {
					msgKey.setKeyValue("END_DATE", key.getEND_DATE());
				}
				if(msgKeyType.containsKeyColumn("CUST_CD") && key.getCUST_CD() != null) {
					msgKey.setKeyValue("CUST_CD", key.getCUST_CD());
				}
				if(msgKeyType.containsKeyColumn("FIELD_NAME") && key.getFIELD_NAME() != null) {
					msgKey.setKeyValue("FIELD_NAME", key.getFIELD_NAME());
				}
				if(msgKeyType.containsKeyColumn("FIELD_VALUE") && key.getFIELD_VALUE() != null) {
					msgKey.setKeyValue("FIELD_VALUE", key.getFIELD_VALUE());
				}
				if(msgKeyType.containsKeyColumn("FIELD_FLG") && key.getFIELD_FLG() != null) {
					msgKey.setKeyValue("FIELD_FLG", key.getFIELD_FLG());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_NO") && key.getd_OLD_ODR_NO() != null) {
					msgKey.setKeyValue("d_OLD_ODR_NO", key.getd_OLD_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_TYP") && key.getd_OLD_ODR_TYP() != null) {
					msgKey.setKeyValue("d_OLD_ODR_TYP", key.getd_OLD_ODR_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_ODR_NO") && key.getd_OLD_CUST_ODR_NO() != null) {
					msgKey.setKeyValue("d_OLD_CUST_ODR_NO", key.getd_OLD_CUST_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_CD") && key.getd_OLD_CUST_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_CD", key.getd_OLD_CUST_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_CUST_ITEM_CD") && key.getd_OLD_CUST_ITEM_CD() != null) {
					msgKey.setKeyValue("d_OLD_CUST_ITEM_CD", key.getd_OLD_CUST_ITEM_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_CD") && key.getd_OLD_DLV_LOC_CD() != null) {
					msgKey.setKeyValue("d_OLD_DLV_LOC_CD", key.getd_OLD_DLV_LOC_CD());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_QTY") && key.getd_OLD_ODR_QTY() != null) {
					msgKey.setKeyValue("d_OLD_ODR_QTY", key.getd_OLD_ODR_QTY());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_DESINATED_DLV_DATE") && key.getd_OLD_DESINATED_DLV_DATE() != null) {
					msgKey.setKeyValue("d_OLD_DESINATED_DLV_DATE", key.getd_OLD_DESINATED_DLV_DATE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_SPCL_PRICE_TYP") && key.getd_OLD_SPCL_PRICE_TYP() != null) {
					msgKey.setKeyValue("d_OLD_SPCL_PRICE_TYP", key.getd_OLD_SPCL_PRICE_TYP());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_ODR_UNIT_PRICE") && key.getd_OLD_ODR_UNIT_PRICE() != null) {
					msgKey.setKeyValue("d_OLD_ODR_UNIT_PRICE", key.getd_OLD_ODR_UNIT_PRICE());
				}
				if(msgKeyType.containsKeyColumn("d_OLD_REMARKS") && key.getd_OLD_REMARKS() != null) {
					msgKey.setKeyValue("d_OLD_REMARKS", key.getd_OLD_REMARKS());
				}
				if(msgKeyType.containsKeyColumn("h_ODR_NO") && key.geth_ODR_NO() != null) {
					msgKey.setKeyValue("h_ODR_NO", key.geth_ODR_NO());
				}
				if(msgKeyType.containsKeyColumn("l_COUNT") && key.getl_COUNT() != null) {
					msgKey.setKeyValue("l_COUNT", key.getl_COUNT());
				}
				if(msgKeyType.containsKeyColumn("ROW_COUNT") && key.getROW_COUNT() != null) {
					msgKey.setKeyValue("ROW_COUNT", key.getROW_COUNT());
				}
				if(msgKeyType.containsKeyColumn("l_ODR_CMPLT_FLG") && key.getl_ODR_CMPLT_FLG() != null) {
					msgKey.setKeyValue("l_ODR_CMPLT_FLG", key.getl_ODR_CMPLT_FLG());
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
					KQ0010030Struct key = new KQ0010030Struct();
					if(msgKeyType.containsKeyColumn("r1_FILTER1")) {
						key.setr1_FILTER1(msgKey.getKeyValue("r1_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r2_FILTER1")) {
						key.setr2_FILTER1(msgKey.getKeyValue("r2_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("r3_FILTER1")) {
						key.setr3_FILTER1(msgKey.getKeyValue("r3_FILTER1"));
					}
					if(msgKeyType.containsKeyColumn("h_SELECT_TYP")) {
						key.seth_SELECT_TYP(msgKey.getKeyValue("h_SELECT_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_REQUEST_APPR_SAME")) {
						key.seth_REQUEST_APPR_SAME(msgKey.getKeyValue("h_REQUEST_APPR_SAME"));
					}
					if(msgKeyType.containsKeyColumn("RESERVE_CAUSE")) {
						key.setRESERVE_CAUSE(msgKey.getKeyValue("RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("l_PROC_TYP_VALUE")) {
						key.setl_PROC_TYP_VALUE(msgKey.getKeyValue("l_PROC_TYP_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP_DN")) {
						key.setl_ODR_TYP_DN(msgKey.getKeyValue("l_ODR_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_TYP")) {
						key.setl_ODR_TYP(msgKey.getKeyValue("l_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ODR_NO")) {
						key.setl_CUST_ODR_NO(msgKey.getKeyValue("l_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_CD")) {
						key.setl_CUST_ITEM_CD(msgKey.getKeyValue("l_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_CD")) {
						key.setl_ITEM_CD(msgKey.getKeyValue("l_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_CD")) {
						key.setl_CUST_CD(msgKey.getKeyValue("l_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ANAME")) {
						key.setl_CUST_ANAME(msgKey.getKeyValue("l_CUST_ANAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DESINATED_DLV_DATE")) {
						key.setl_DESINATED_DLV_DATE(msgKey.getKeyValue("l_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_QTY")) {
						key.setl_ODR_QTY(msgKey.getKeyValue("l_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_UNIT_CD")) {
						key.setl_UNIT_CD(msgKey.getKeyValue("l_UNIT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_UNIT_PRICE")) {
						key.setl_ODR_UNIT_PRICE(msgKey.getKeyValue("l_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("l_CUR_UNIT")) {
						key.setl_CUR_UNIT(msgKey.getKeyValue("l_CUR_UNIT"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP_DN")) {
						key.setl_SPCL_PRICE_TYP_DN(msgKey.getKeyValue("l_SPCL_PRICE_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_SPCL_PRICE_TYP")) {
						key.setl_SPCL_PRICE_TYP(msgKey.getKeyValue("l_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_CD")) {
						key.setl_DLV_LOC_CD(msgKey.getKeyValue("l_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_DLV_LOC_NAME")) {
						key.setl_DLV_LOC_NAME(msgKey.getKeyValue("l_DLV_LOC_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP_DN")) {
						key.setl_DEPO_TYP_DN(msgKey.getKeyValue("l_DEPO_TYP_DN"));
					}
					if(msgKeyType.containsKeyColumn("l_DEPO_TYP")) {
						key.setl_DEPO_TYP(msgKey.getKeyValue("l_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_CUST_ITEM_NAME")) {
						key.setl_CUST_ITEM_NAME(msgKey.getKeyValue("l_CUST_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ITEM_NAME")) {
						key.setl_ITEM_NAME(msgKey.getKeyValue("l_ITEM_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_ACPT_DATE")) {
						key.setl_ODR_ACPT_DATE(msgKey.getKeyValue("l_ODR_ACPT_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_CD")) {
						key.setl_JOB_ODR_CD(msgKey.getKeyValue("l_JOB_ODR_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_QTY")) {
						key.setl_JOB_ODR_QTY(msgKey.getKeyValue("l_JOB_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("l_JOB_ODR_DLV_DATE")) {
						key.setl_JOB_ODR_DLV_DATE(msgKey.getKeyValue("l_JOB_ODR_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_ALC_GRP_CD")) {
						key.setl_ALC_GRP_CD(msgKey.getKeyValue("l_ALC_GRP_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_REMARKS")) {
						key.setl_REMARKS(msgKey.getKeyValue("l_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_CUS_DLV_KEY_CD")) {
						key.setl_CUS_DLV_KEY_CD(msgKey.getKeyValue("l_CUS_DLV_KEY_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_CUS_DLV_CD")) {
						key.setl_CUS_DLV_CD(msgKey.getKeyValue("l_CUS_DLV_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_ODR_NO")) {
						key.setd_NEW_CUST_ODR_NO(msgKey.getKeyValue("d_NEW_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_ODR_NO_CHANGE")) {
						key.setd_CUST_ODR_NO_CHANGE(msgKey.getKeyValue("d_CUST_ODR_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_CD")) {
						key.setd_NEW_CUST_CD(msgKey.getKeyValue("d_NEW_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_CD_CHANGE")) {
						key.setd_CUST_CD_CHANGE(msgKey.getKeyValue("d_CUST_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_CUST_ITEM_CD")) {
						key.setd_NEW_CUST_ITEM_CD(msgKey.getKeyValue("d_NEW_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_CUST_ITEM_CD_CHANGE")) {
						key.setd_CUST_ITEM_CD_CHANGE(msgKey.getKeyValue("d_CUST_ITEM_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_DLV_LOC_CD_CHANGE")) {
						key.setd_DLV_LOC_CD_CHANGE(msgKey.getKeyValue("d_DLV_LOC_CD_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_QTY")) {
						key.setd_NEW_ODR_QTY(msgKey.getKeyValue("d_NEW_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_QTY_CHANGE")) {
						key.setd_ODR_QTY_CHANGE(msgKey.getKeyValue("d_ODR_QTY_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DESINATED_DLV_DATE")) {
						key.setd_NEW_DESINATED_DLV_DATE(msgKey.getKeyValue("d_NEW_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_DESINATED_DLV_DATE_CHANGE")) {
						key.setd_DESINATED_DLV_DATE_CHANGE(msgKey.getKeyValue("d_DESINATED_DLV_DATE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_SPCL_PRICE_TYP")) {
						key.setd_NEW_SPCL_PRICE_TYP(msgKey.getKeyValue("d_NEW_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_SPCL_PRICE_TYP_CHANGE")) {
						key.setd_SPCL_PRICE_TYP_CHANGE(msgKey.getKeyValue("d_SPCL_PRICE_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_UNIT_PRICE")) {
						key.setd_NEW_ODR_UNIT_PRICE(msgKey.getKeyValue("d_NEW_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_UNIT_PRICE_CHANGE")) {
						key.setd_ODR_UNIT_PRICE_CHANGE(msgKey.getKeyValue("d_ODR_UNIT_PRICE_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_DLV_LOC_CD")) {
						key.setd_NEW_DLV_LOC_CD(msgKey.getKeyValue("d_NEW_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_REMARKS")) {
						key.setd_NEW_REMARKS(msgKey.getKeyValue("d_NEW_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("d_REMARKS_CHANGE")) {
						key.setd_REMARKS_CHANGE(msgKey.getKeyValue("d_REMARKS_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_NO")) {
						key.setd_NEW_ODR_NO(msgKey.getKeyValue("d_NEW_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_NO_CHANGE")) {
						key.setd_ODR_NO_CHANGE(msgKey.getKeyValue("d_ODR_NO_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("d_NEW_ODR_TYP")) {
						key.setd_NEW_ODR_TYP(msgKey.getKeyValue("d_NEW_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_ODR_TYP_CHANGE")) {
						key.setd_ODR_TYP_CHANGE(msgKey.getKeyValue("d_ODR_TYP_CHANGE"));
					}
					if(msgKeyType.containsKeyColumn("l_STATUS_NAME")) {
						key.setl_STATUS_NAME(msgKey.getKeyValue("l_STATUS_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_PROJECT_CD")) {
						key.setl_PROJECT_CD(msgKey.getKeyValue("l_PROJECT_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_NO")) {
						key.setl_ESTIMATE_NO(msgKey.getKeyValue("l_ESTIMATE_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_DETAL_NO")) {
						key.setl_DETAL_NO(msgKey.getKeyValue("l_DETAL_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ESTIMATE_TYPE")) {
						key.setl_ESTIMATE_TYPE(msgKey.getKeyValue("l_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ESTIMATE_TYPE")) {
						key.setl_h_ESTIMATE_TYPE(msgKey.getKeyValue("l_h_ESTIMATE_TYPE"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_PERSON_CD")) {
						key.setl_OWN_PERSON_CD(msgKey.getKeyValue("l_OWN_PERSON_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_OWN_ORG_CD")) {
						key.setl_OWN_ORG_CD(msgKey.getKeyValue("l_OWN_ORG_CD"));
					}
					if(msgKeyType.containsKeyColumn("l_ORGN_ODR_NO")) {
						key.setl_ORGN_ODR_NO(msgKey.getKeyValue("l_ORGN_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_ADD_ODR_FLG")) {
						key.setl_ADD_ODR_FLG(msgKey.getKeyValue("l_ADD_ODR_FLG"));
					}
					if(msgKeyType.containsKeyColumn("l_h_ODR_TYP")) {
						key.setl_h_ODR_TYP(msgKey.getKeyValue("l_h_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_h_DEPO_TYP")) {
						key.setl_h_DEPO_TYP(msgKey.getKeyValue("l_h_DEPO_TYP"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_POWER_TYP")) {
						key.seth_APPR_POWER_TYP(msgKey.getKeyValue("h_APPR_POWER_TYP"));
					}
					if(msgKeyType.containsKeyColumn("LOGIN_USER_CD")) {
						key.setLOGIN_USER_CD(msgKey.getKeyValue("LOGIN_USER_CD"));
					}
					if(msgKeyType.containsKeyColumn("h_APPR_ID")) {
						key.seth_APPR_ID(msgKey.getKeyValue("h_APPR_ID"));
					}
					if(msgKeyType.containsKeyColumn("h_SCREEN_URL")) {
						key.seth_SCREEN_URL(msgKey.getKeyValue("h_SCREEN_URL"));
					}
					if(msgKeyType.containsKeyColumn("h_STATUS")) {
						key.seth_STATUS(msgKey.getKeyValue("h_STATUS"));
					}
					if(msgKeyType.containsKeyColumn("h_PROC_TYP")) {
						key.seth_PROC_TYP(msgKey.getKeyValue("h_PROC_TYP"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_BY")) {
						key.setl_REQUEST_BY(msgKey.getKeyValue("l_REQUEST_BY"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_BY_NAME")) {
						key.setl_REQUEST_BY_NAME(msgKey.getKeyValue("l_REQUEST_BY_NAME"));
					}
					if(msgKeyType.containsKeyColumn("l_REQUEST_DATE")) {
						key.setl_REQUEST_DATE(msgKey.getKeyValue("l_REQUEST_DATE"));
					}
					if(msgKeyType.containsKeyColumn("l_APPR_REMARKS")) {
						key.setl_APPR_REMARKS(msgKey.getKeyValue("l_APPR_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("l_RESERVE_CAUSE")) {
						key.setl_RESERVE_CAUSE(msgKey.getKeyValue("l_RESERVE_CAUSE"));
					}
					if(msgKeyType.containsKeyColumn("h_MODIFY_COUNT")) {
						key.seth_MODIFY_COUNT(msgKey.getKeyValue("h_MODIFY_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("START_DATE")) {
						key.setSTART_DATE(msgKey.getKeyValue("START_DATE"));
					}
					if(msgKeyType.containsKeyColumn("END_DATE")) {
						key.setEND_DATE(msgKey.getKeyValue("END_DATE"));
					}
					if(msgKeyType.containsKeyColumn("CUST_CD")) {
						key.setCUST_CD(msgKey.getKeyValue("CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_NAME")) {
						key.setFIELD_NAME(msgKey.getKeyValue("FIELD_NAME"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_VALUE")) {
						key.setFIELD_VALUE(msgKey.getKeyValue("FIELD_VALUE"));
					}
					if(msgKeyType.containsKeyColumn("FIELD_FLG")) {
						key.setFIELD_FLG(msgKey.getKeyValue("FIELD_FLG"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_NO")) {
						key.setd_OLD_ODR_NO(msgKey.getKeyValue("d_OLD_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_TYP")) {
						key.setd_OLD_ODR_TYP(msgKey.getKeyValue("d_OLD_ODR_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_ODR_NO")) {
						key.setd_OLD_CUST_ODR_NO(msgKey.getKeyValue("d_OLD_CUST_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_CD")) {
						key.setd_OLD_CUST_CD(msgKey.getKeyValue("d_OLD_CUST_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_CUST_ITEM_CD")) {
						key.setd_OLD_CUST_ITEM_CD(msgKey.getKeyValue("d_OLD_CUST_ITEM_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DLV_LOC_CD")) {
						key.setd_OLD_DLV_LOC_CD(msgKey.getKeyValue("d_OLD_DLV_LOC_CD"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_QTY")) {
						key.setd_OLD_ODR_QTY(msgKey.getKeyValue("d_OLD_ODR_QTY"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_DESINATED_DLV_DATE")) {
						key.setd_OLD_DESINATED_DLV_DATE(msgKey.getKeyValue("d_OLD_DESINATED_DLV_DATE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_SPCL_PRICE_TYP")) {
						key.setd_OLD_SPCL_PRICE_TYP(msgKey.getKeyValue("d_OLD_SPCL_PRICE_TYP"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_ODR_UNIT_PRICE")) {
						key.setd_OLD_ODR_UNIT_PRICE(msgKey.getKeyValue("d_OLD_ODR_UNIT_PRICE"));
					}
					if(msgKeyType.containsKeyColumn("d_OLD_REMARKS")) {
						key.setd_OLD_REMARKS(msgKey.getKeyValue("d_OLD_REMARKS"));
					}
					if(msgKeyType.containsKeyColumn("h_ODR_NO")) {
						key.seth_ODR_NO(msgKey.getKeyValue("h_ODR_NO"));
					}
					if(msgKeyType.containsKeyColumn("l_COUNT")) {
						key.setl_COUNT(msgKey.getKeyValue("l_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("ROW_COUNT")) {
						key.setROW_COUNT(msgKey.getKeyValue("ROW_COUNT"));
					}
					if(msgKeyType.containsKeyColumn("l_ODR_CMPLT_FLG")) {
						key.setl_ODR_CMPLT_FLG(msgKey.getKeyValue("l_ODR_CMPLT_FLG"));
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
